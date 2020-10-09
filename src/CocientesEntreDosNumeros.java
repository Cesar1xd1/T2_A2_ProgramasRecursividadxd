import java.util.Scanner;

class Recur{
	public static void cocientes(int n1, int n2,int x) {
		if(n2> 0 && n1%n2 == 0 && n2!=x ) {
			
		
		}
			
		
	}
}




public class CocientesEntreDosNumeros {

	public static void main(String[] args) {
		/*Recur m = new Recur();
		System.out.println("=====================================================");
		System.out.println("= Programa que muestra los cocientes entre 2 numeros=");
		System.out.println("Ingresa el primer numero:");
		int n1 = correccion.validacion();
		System.out.println("Ingresa el segundo numero:");
		int n2 = correccion.validacion();
		
		Recur.cocientes(n1, n2);
		*/
Scanner entrada = new Scanner(System.in);
		
		int num = 0;
		int num2 = 0;
		
		do {
			System.out.println("Ingrese un número mayor a 0:");
			num = entrada.nextInt();
			if(num <= 0) {
				System.out.println("Unicamente numeros mayoeres a cero");
			}
		}while (num <= 0);
		
		do {
			System.out.println("Ingrese un segundo numero mayor a 1:");
			num2 = entrada.nextInt();
			if(num <= 1) {
				System.out.println("Unicamente numeros mayores a 1");
			}
		}while(num2 <= 1);
		
		Recur.cocientes(num, num,num2);

	}

}
