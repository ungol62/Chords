
public enum NomGamme 
{
	Majeure(7,new int[]{2,2,1,2,2,2,1}),
	Pentatonique_mineure(5, new int[]{3,2,2,3,2});
	//TODO Mettre les gammes principales et leurs intervalles
	
	private int intervalles[];
	private int nb_tons;
	
	NomGamme (int nb_tons, int intervalles[])
	{
		this.nb_tons = nb_tons;
		this.intervalles = new int[nb_tons];
		this.intervalles = intervalles;
	}
	
	public int[] get_intervalles()
	{
		return intervalles;
	}
	
	public int get_nb_tons()
	{
		return nb_tons;
	}
	
}
