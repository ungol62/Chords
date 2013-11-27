
public class Note 
{
	private int value;
	private static String Correspondances[][] = {	{"A", "A", "LA", "LA"},
													{"Bb", "A#", "SIb", "LA#"},
													{"B","B","SI","SI"},
													{"C","C","DO","DO"},
													{"Db","C#","REb","DO#"},
													{"D","D","RE","RE"},
													{"Eb","D#","MIb","RE#"},
													{"E","E","MI","MI"},
													{"F","F","FA","FA"},
													{"Gb","F#","SOLb","SOL#"},
													{"G","G","SOL","SOL"},
													{"Ab","G#","LAb","SOL#"}	};
	
	//Constructeurs
	Note(int i)
	{
		set_value(i);
	}
	
	//Accesseurs
	public int get_value()
	{
		return value;
	}
	
	public void set_value(int valeur)
	{
		value = valeur % 12; //On ramène le nombre à qqch compris entre 0 et 11 inclus, pour que les notes correspondent à des notes existantes		
	}
	
	//Affichage et conversion
	public String toString() //Conversion en type String
	{
		int i = 0;
		switch (Chords.get_conv())
		{
			case US_flat :
				i = 0;
				break;
			case US_sharp : 
				i = 1;
				break;
			case FR_flat :
				i = 2;
				break;
			case FR_sharp :
				i = 3;
				break;
		}
		return Correspondances[value][i];
	}
	
	public static void afficher_correspondances()
	{
		for(int i = 0; i<12; i++)
			System.out.println(Correspondances[i][0]+" --> "+Correspondances[i][1]+" --> "+Correspondances[i][2]+" --> "+Correspondances[i][3]);
	}
	
}
