import java.util.Scanner;		//IMPORTA SCANNER
/**
 * @author LOS PROFESORES DE IP
 *	EL PROGRAMA CREA UN VECTOR CUYOS ELEMENOS SON VECTORES. EL VECTOR MAYOR REPRESENTA UN MES.
 *	CADA VECTOR CONTENIDO EN EL VECTOR MAYOR REPRESENTA UN DÍA DEL MES Y CONTIENE 24 VALORES,
 *	CADA UNO SIENDO LA TEMPERATURA DE LA HORA EQUIVALENTE A SU ÍNDICE+1.
 *
 */
public class TemperaturaTest {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);		//CREA SCANNER
		System.out.print("Introduzca el número de días del mes: ");		//SOLICITA VALOR
		int días = teclado.nextInt();		//ALMACENA VALOR EN DÍAS
		Temperatura [] t = new Temperatura [días];		//CREA VECTOR DE TEMPERATURAS
		for (int día=1;día<=días;día++) {		//PARA CADA DÍA DEL MES
			t[día-1] = new Temperatura();		//CREAR UN NUEVO VECTOR
			for (int hora=0;hora<24;hora++) {		//PARA CADA HORA DEL DÍA
				t[día-1].setGrados(hora, hora+1+3/2);		//ALMACENAR UNA TEMPERATURA
					//LA TEMPERATURA TIENE POCO SENTIDO, ES UN EJEMPLO.
			}
		}
	}
}
