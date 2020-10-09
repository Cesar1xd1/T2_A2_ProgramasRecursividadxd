
class Re {
	public void divisores(int n, int m, int x) {
		if (m>=x) {
		if(m>0) {
			if(n%m==0) {
				System.out.println(m);
				
			}
			divisores(n, m-1,x);
		}
			
		}	
	
		}
}




public class DivisoresEntreDosNumeros {

	public static void main(String[] args) {
		Re r = new Re();
		System.out.println("Programa que muestra los divisores existentes entre 2 numeros:");
		System.out.println("Ingresa el primer numero:");
		int n = correccion.validacion();
		System.out.println("Ingrese le segundo numero:");
		int x = correccion.validacion();
		if(x>n) {
			int n1 = n;
			int x1 = x;
			System.out.println("como el limite es mayor al numero, los valores se invirtieron");
			n = x1;
			x = n1;
		}
		System.out.println("Los divisores son:");
		r.divisores(n, n, x);

	}

}
