
public class Accord 
{
	private Note composantes[];
	
	Accord(Note tonale, Gamme gamme)
	{
		//TODO Constructeur qui crée l'accord de base (tonale, tierce, quinte) 
	}
	
	Accord(Note tonale, Gamme gamme, int degres[])
	{
		//TODO Constructeur qui crée un accord complexe, avec les degrés passés en paramètre
	}
	
	public Note[] get_notes()
	{
		//TODO Renvoie le tableau avec les notes
	}
	
	public String toString()
	{
		//TODO Conversion de l'accord en String (formatage à déterminer)
	}
	
	public void AfficherNom()
	{
		//TODO Affiche nom accord complet 
	}
	
	public void AfficherNotes()
	{
		//TODO Affiche les notes composant l'accord
	}
	
	public void Afficher()
	{
		//TODO Affiche nom + notes
	}
}
