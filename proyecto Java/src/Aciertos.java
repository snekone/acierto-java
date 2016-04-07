import java.util.Scanner;
/**
 * 
 * @author Ruben
 * @version 1.0
 */
public class Aciertos {
/**
 * @param args	
 * 	 
 * genera un número random que lo mete en una variable llamada X
 * llama al método pide numero y posterior llama al método compara
 * si N es igual a X (numero random) imprime 
 * 'Exelente!!! Haz acertado , No. de intentos:' 
 * y saca el numero de intentos contando cada vez que se ejecuta.
 */
	 public static void main(String[] args) {
		 

	        int n = 0,cont = 0;
	        int x = (int) (500 *Math.random());
	        //System.out.print(x);
	        Scanner sc = new Scanner(System.in);
	        do {
	            n = pideNumero(sc);
	            compara(n, x);
	            cont++;
	        } while (n != x);
	        System.out.print("Exelente!!! Haz acertado , No. de intentos: "+cont );

	    }
/**
 * 
 * @param n
 * @param x
 * 
 * compara el valor introducido y si es mayor muestra
 * el valor N es mayor a X, si la comprobacion es false muestra
 * el mensaje Casi cerca.
 */
	private static void compara(int n, int x) {
		

		if (n > x) {
		    System.out.print("Te pasaste Amigo");
		} else if (n < x){
		    System.out.print("Casi cerca ...");
		}
	}

	
	/**
	 * 
	 * @param sc
	 * @return
	 * 
	 * Pide el valor de X y lo recoge en variable llamada N
	 */
	
	private static int pideNumero(Scanner sc) {
		
		
		int n;
		System.out.print("\nIntroduce el valor de X: ");
		n = sc.nextInt();
		return n;
	}
	}

