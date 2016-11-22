/*
 * Dada una frase de no más de 80 caracteres hacer un programa que busque cuántas 
 * mayúsculas y minúsculas tiene y lo imprima.
 */
import java.util.Scanner;
public class Ejercicio02_04 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		String frase;
		char l='a';
		int letra='Z';
		int contador=0;
		int cmayu=0;
		int cmin=0;
		
		
		System.out.print("Introduce una frase que tenga como maximo 80 caracteres: ");
		frase=teclado.next();
		System.out.print(letra);
		
		while (contador < frase.length()){
			l=frase.charAt(contador);
			
			if(65 <= l && l <=90)
				cmayu++;
			else
				cmin++;
			
		}
		System.out.print("");
	}

}
//a=97
//z=122
//A=65
//Z=90