import java.util.Scanner;

class MetodoRecursivo implements correccion{
	
	public void divisores(int n, int m) {
		if(m>0) {
			if(n%m==0) {
				System.out.println(m);
				
			}
			divisores(n, m-1);
		}
			
			
	
		}
	
}



public class PruebaDivisores {

	public static void main(String[] args) {
		MetodoRecursivo mr = new MetodoRecursivo();
		System.out.println("=Programa que muestra todos los divisores de un numero dado=");
		System.out.println("=============================================================");
		System.out.println("Ingresa el numero:");
		int num = 0;
		num = correccion.validacion();
		System.out.println("Los numeros Divisores de " + num + " son:");
		mr.divisores(num,num);

	}

}
