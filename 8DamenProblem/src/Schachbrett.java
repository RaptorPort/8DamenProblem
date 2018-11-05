public class Schachbrett
{
	public static final int N = 8; // Brettgröße N

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
	public static final int SECHS = 5;
	public static final int SIEBEN = 6;
	public static final int ACHT = 7;
	// ...
	// Test
	protected int[ ] brett = new int[N]; // in jeder Zeile z steht eine Dame
	// ... // und zwar in der Spalte brett[z]
	public int loesungen = 0;

	public void komplettiereStellung(int zeile)
	{
		int platzierung;
		for (platzierung=A; platzierung<=H; platzierung++)
		{
			brett[zeile] = platzierung; // setze Dame
			if (isDameUnbedroht(zeile)) // Bedrohungstest
				if (zeile<ACHT) // gehe zur naechsten Zeile
					komplettiereStellung(zeile+1);
				else {// drucke die gefundene Loesung
					druckeBrett(); 
					loesungen++;
				}
		}
	}
	
	public boolean isDameUnbedroht(int zeile)
	{
		int testZeile;
		boolean unbedroht = true;
		int spaltenDifferenz, zeilenDifferenz;
		for (testZeile=EINS; ((testZeile<zeile) && unbedroht); testZeile++)
		{
			zeilenDifferenz = zeile-testZeile;
			spaltenDifferenz = brett[zeile]-brett[testZeile];
			unbedroht = (spaltenDifferenz!=0) && (spaltenDifferenz!=zeilenDifferenz)
						&& (spaltenDifferenz!=-zeilenDifferenz);
		}
		return unbedroht;
		
	}
	
	public void druckeBrett( ) 
	{
		System.out.println("Drucke Brett:");
		System.out.println(" ——— ——— ——— ——— ——— ——— ——— ——— ");
		for (int spalte = A; spalte < N; spalte++)
		{
			for (int platzierung = EINS; platzierung < N; platzierung++) {
				if (brett[platzierung] == N-spalte-1)
					System.out.print("| X ");
				else
					System.out.print("|   ");
			}
			System.out.println("|");
			System.out.println(" ——— ——— ——— ——— ——— ——— ——— ——— ");
		}
	}
}