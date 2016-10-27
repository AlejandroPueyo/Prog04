/*
 *  Programa estudiante
 */
import java.util.Scanner;
public class estudiante {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int horasto,horasaus,id;
		
		System.out.print("Ingrese la identificacion:");
		id=teclado.nextInt();
		System.out.print("Ingrese las horas totales del modulo:");
		horasto=teclado.nextInt();
		System.out.print("Ingrese las horas ausentadas del modulo:");
		horasaus=teclado.nextInt();
		
		if (horasto * 0.15 < horasaus) {
			System.out.println("Has superado el 15% de horas permitidas. Perdida de evaluacion continua");
			System.out.print("ID ALMUNO:"); System.out.println(id);
			System.out.print("HORAS TOTALES MODULO:"); System.out.println(horasto);
			System.out.print("HORAS AUSENTADAS:"); System.out.println(horasaus);
		} else if (horasto * 0.10 < horasaus)  {
			System.out.println("Has superado el 10% de horas permitidas");
			System.out.print("ID ALMUNO:"); System.out.println(id);
			System.out.print("HORAS TOTALES MODULO:"); System.out.println(horasto);
			System.out.print("HORAS AUSENTADAS:"); System.out.println(horasaus);
		}	else if(horasto * 0.05 < horasaus) {
				System.out.println("Has superado el 5% de horas permitidas");
				System.out.print("ID ALMUNO:"); System.out.println(id);
				System.out.print("HORAS TOTALES MODULO:"); System.out.println(horasto);
				System.out.print("HORAS AUSENTADAS:"); System.out.println(horasaus);
			} else {
				System.out.print("No has superado el 5% de horas permitidas");
			}
			 
			
	}

}
