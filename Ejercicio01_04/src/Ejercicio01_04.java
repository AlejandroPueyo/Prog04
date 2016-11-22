/*
 * Leer una frase de máximo 80 caracteres 
 * y escribirla progresivamente es decir si 
 * la frase es: “ciervo”, el programa debe imprimir
c
ci
cie
cier
cierv
ciervo
 */
import java.util.Scanner;
public class Ejercicio01_04 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		String frase;
		char l='a';
		String resultado="";
		int contador=0;
		
		
		
		
		System.out.print("Introduce una frase que tenga como maximo 80 caracteres: ");
		frase=teclado.next();
		
		//for(int contador=0; contador < frase.length();contador++){
			//l=frase.charAt(contador);
			//resultado=resultado+l;
			//System.out.print(resultado);
		//}	
			
		
			while (contador < frase.length()){
				l=frase.charAt(contador);
				resultado=resultado+l;
				System.out.println(resultado);
				
				
				contador++;
			}
		
		
		
		
		

	}

}
