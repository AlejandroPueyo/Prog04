/*
 *  Programa Deporte
 */
import java.util.Scanner;
public class Deporte {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int temperatura;
		
		System.out.print("Ingrese la temperatura:");
		temperatura=teclado.nextInt();
		System.out.print("El deporte ideal es:");
		if (temperatura > 29) {
			
			System.out.println("natacion");
		} else if (temperatura > 21)  { 
			
			System.out.println("tenis"); 
		}
			else if (temperatura > 0)  { 
				
				System.out.println("golf");
			}	
				else if (temperatura > -12)  { 
					
					System.out.println("esqui");
				} else  {
					
					System.out.println("damas");
		}
	}

}
