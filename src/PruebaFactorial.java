import java.util.Scanner;
interface correccion{
	Scanner entrada = new Scanner(System.in);
	public static int validacion() {
		int r = 0;
		boolean e = false;
		
		do {
			try {
				
				
				r = entrada.nextInt();
				
				
			} catch (java.util.InputMismatchException x) {
				System.out.println("Ups! el dato que intentas ingresar no es valido");
				entrada.nextLine();
				e=true;
			}
			if (r>0) {
				e=false;
			}else {
				System.out.println("Ingresa porfavor solo numeros mayores a 0");
				e=true;
			}
		}while(e);
		return r;
	}
}

class Metodo implements correccion{
	
	
	
	
	
	public int factorial(int n) {
	if(1>=n) {
		return 1;
	}else {
		return n*factorial(n-1);
	}
		}
	}		
public class PruebaFactorial {

	public static void main(String[] args) {
		Metodo m = new Metodo();
		
		System.out.println("================================================");
		System.out.println("==Prgrama que te da el factorial de un numero==");
		System.out.println("=================================================");
		System.out.println("Ingrese el numero del que desea saber el factorial");
		int num = 0;
		num = correccion.validacion();
		System.out.println("El numero factorial de " + num + " es:");
		System.out.println(m.factorial(num));

	}

}
