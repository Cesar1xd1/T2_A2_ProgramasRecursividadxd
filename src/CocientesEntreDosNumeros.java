import java.util.Scanner;

class Recur{
	public  void cocientes(String n, int d, int xd, int sobra) {
        String cadena=Integer.toString(d);
        if(cadena.length()<=n.length()) {
            if(xd<=(n.length()-cadena.length())) {
                int div=Integer.parseInt(n.substring(xd,(xd+cadena.length())));
                div = (int) (div + (sobra*10));
                
  
                System.out.println(div/d);
                
                sobra=div%d;
                String t=n.substring(0,xd);
                for (int i = xd; i < xd+cadena.length(); i++) {
                    t+='0';
                }
                t+=n.substring(xd+cadena.length());
                n=t;
                xd+=1;
                cocientes(n,d,xd,sobra);
            }else {
            
            }
        }else {
            System.out.println("no se puede obtener cocientes enteros");
        }
    }
		
	
}




public class CocientesEntreDosNumeros {

	public static void main(String[] args) {
		Recur m = new Recur();
		System.out.println("=====================================================");
		System.out.println("= Programa que muestra los cocientes entre 2 numeros=");
		System.out.println("Ingresa el primer numero:");
		int n1 = correccion.validacion();
		String sn1 = Integer.toString(n1);
		System.out.println("Ingresa el segundo numero:");
		int n2 = correccion.validacion();
		System.out.println("Los cocientes son:");
		m.cocientes(sn1,n2,0,0);
		
	}
}
