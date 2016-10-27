/*
 *  Programa telefono
 */

import java.util.Scanner;


public class digito {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String letra;
		int numero = 0;
		boolean terminar = false;
		int errores = 0;
		
		//System.out.print("Ingrese una letra: ");
		//letra = teclado.next();
		
	 
		while (! terminar ){
			System.out.print("Ingrese una letra: ");
			letra = teclado.next();
			
		switch ( letra ) {
		case "a": case "b": case "c":
			numero = 2;
			break;
		case "d": case "e": case "f": 
			numero = 3;
			break;
		case "g": case "h": case "i":
			numero = 4;
			break;
		case "j": case "k": case "l":
			numero = 5;
			break;
		case "m": case "n": case "o":
			numero = 6;
			break;
		case "p": case "q": case "r": case "s":
			numero = 7;
			break;
		case "t": case "u": case "v":
			numero = 8;
			break;
		case "w": case "x": case "y": case "z":
			numero = 9;
			break;
		case "0":
			terminar = true;
			break;
		default:
			numero = -1;
			errores = errores + 1;
			
		}
		if (! terminar) 
		System.out.println("La letra " + letra + " corresponde al numero: " + numero );
		
			
		
	}
		System.out.println("Numero de errores: " + errores);

}
}


