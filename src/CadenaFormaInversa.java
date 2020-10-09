import java.util.Scanner;

class CadInver{
	public static void Invertir(String cadena, int x, String inver){
		if(x>0) {
			inver = inver + cadena.substring(x-1, x);
			Invertir(cadena, x-1, inver);
		}else {
			System.out.println(inver);
		}
	}
}
public class CadenaFormaInversa {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		String cadena = "";
		System.out.println("=Programa que invierte una cadena dada=");
		do {
			System.out.println("Ingresa la cadena que desea invertir");
			cadena = entrada.nextLine();
			
			CadInver.Invertir(cadena, cadena.length(), "");
		}while(cadena.length()<= 0);


	}

}
