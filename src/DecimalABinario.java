class DAB{
	public void convertir(int n, String bin) {
		if(n>1) {
			if(n%2==1) {
				bin = "1"+bin;
			}else {
				bin = "0"+bin;
			}
			n/=2;
			convertir(n,bin);	
		}else {
			System.out.println("1"+bin);
		}
	}
}



public class DecimalABinario {

	public static void main(String[] args) {
		DAB dab = new DAB();
		System.out.println("Programa que convierte un numero decimal a Bianario");
		System.out.println("Ingresa el numero que desea convertir");
		int n = correccion.validacion();
		System.out.println("El numero " + n + " en su conversion a Decimal es igual a:");
		dab.convertir(n, "");
		

	}

}
