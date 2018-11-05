public class DamenProblem {

	//this is the first commit
	int i= 0;
	public int gibZahl(int zahl)
	{
		return zahl;
	}
	
	public static final int A = 0; // Spalten
	public static final int B = 1;
	public static final int C = 2;
	public static final int D = 3;
	public static final int E = 4;
	public static final int F = 5;
	public static final int G = 6;
	public static final int H = 7;
	// ...
	public static final int EINS = 0; // Zeilen
	public static final int ZWEI = 1;
	public static final int DREI = 2;
	public static final int VIER = 3;
	public static final int FÜNF = 4;
	public static final int sechs = 5;
	public static final int SIEBEN = 6;
	public static final int ACHT = 7;

	public static void main(String[] args) {
		Schachbrett sb = new Schachbrett();
		sb.komplettiereStellung(EINS);
		System.out.println("Es wurden " + sb.loesungen + " Lösungen gefunden!");
	}
	
	public void test() {
		int i = 0;
		i++;
		System.out.println(i);
	}
}
