import java.util.Scanner;

class Recursion{

    public void contar(String cadena, int n, int x) {
        if(n<cadena.length()) {
            char caracter = cadena.charAt(n);

            if(caracter=='a'||caracter=='e'||caracter=='i'||caracter=='o'||caracter=='u') {
                x+=1;
            }
            n+=1;
            contar(cadena,n,x);
        }else {
            System.out.println("En la cadena " + cadena + " hay " + x + " vocales");
        }
    }

}// class Vocales


public class CantidadVocales {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

        Recursion r = new Recursion();

        System.out.println("Ingresa una cadena y el programa contara las vocales que hay en ella:");
        String cadena = entrada.nextLine();
        cadena = cadena.toLowerCase();
        r.contar(cadena, 0, 0);


	}

}
