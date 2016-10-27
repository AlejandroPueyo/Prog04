/*
 * Programa de calculo
 */
import java.util.Scanner;
public class Calculo {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int num1,num2,num3,suma,producto;
		
		System.out.print("Ingrese primer numero:");
		num1=teclado.nextInt();
		System.out.print("Ingrese segundo numero:");
		num2=teclado.nextInt();
		System.out.print("Ingrese tercer numero:");
		num3=teclado.nextInt();
		if (num1 < 0) {
			producto= num1 * num2 * num3;
			System.out.print("El producto de los tres numeros es:");
			System.out.println(producto);
		} else {
			suma= num1 + num2 + num3;
			System.out.print("La suma de los tres numeros es:");
			System.out.println(suma);
		}
		
	}

}
