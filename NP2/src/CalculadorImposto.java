
public abstract class CalculadorImposto implements Tributavel{
	
	private static double totalImposto;
	
	
	public static void calcular(Tributavel t) {
		//Imaginar uma c�lculo qualquer
		totalImposto = 0;
	}
	
	public static double getTotalImposto() {
		return totalImposto;
	}
}

