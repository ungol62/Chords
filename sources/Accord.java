
public class Accord 
{
	private Note composantes[];
	
	Accord(Note tonale, Gamme gamme)
	{
		//TODO Constructeur qui cr�e l'accord de base (tonale, tierce, quinte) 
	}
	
	Accord(Note tonale, Gamme gamme, int degres[])
	{
		//TODO Constructeur qui cr�e un accord complexe, avec les degr�s pass�s en param�tre
	}
	
	public Note[] get_notes()
	{
		//TODO Renvoie le tableau avec les notes
	}
	
	public String toString()
	{
		//TODO Conversion de l'accord en String (formatage � d�terminer)
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
