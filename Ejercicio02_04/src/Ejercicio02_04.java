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
		int contador=0;
		int cMayu=0;
		int cMin=0;


		System.out.print("Introduce una frase que tenga como maximo 80 caracteres: ");
		frase=teclado.nextLine();


		while (contador < frase.length()){
			l=frase.charAt(contador);

			if(65 <= l && l <=96){
				cMayu++;
			}
			else if (97 <= l && l <=122) {
				cMin++;
			}


			contador++;
		}
		System.out.print("Hay " + cMin + " minusculas y " + cMayu + " mayusculas.");
	}

}
//a=97
//z=122
//A=65
//Z=90