//Déclaration des bibliothèques


//Classe principale
public class Chords 
{
	private static Convention conv = Convention.US_flat;
	
	public static void main(String[] args) 
	{
		new Chords();
		Note n = new Note(2);
		System.out.println(n.toString());
		Note.afficher_correspondances();
	}
	
	Chords()
	{
		
	}

	public static Convention get_conv() 
	{
		return conv;
	}

	public static void set_conv(Convention conv) 
	{
		Chords.conv = conv;
	}

}
