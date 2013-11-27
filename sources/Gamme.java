
public class Gamme 
{
	private Note composantes[];
	private NomGamme gamme;
	
	Gamme(Note tonale, NomGamme gamme)
	{
		this.gamme = gamme;
		this.composantes = new Note[gamme.get_nb_tons()];
		this.composantes[0] = tonale;
		int intervalles[] = gamme.get_intervalles();
		for(int i = 1; i < gamme.get_nb_tons(); i++)
		{
			this.composantes[i] = new Note(composantes[i-1].get_value() + intervalles[i-1]);
		}
	}
	
	public String toString()
	{
		//TODO Conversion en String (formatage à déterminer)
	}
	
	//TODO Fonction afficher, qui affiche le nom, la tonale et les notes
	//TODO Fonction get_notes qui renvoie le tableau des notes
}
