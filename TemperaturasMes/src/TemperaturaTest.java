import java.util.Scanner;		//IMPORTA SCANNER
/**
 * @author LOS PROFESORES DE IP
 *	EL PROGRAMA CREA UN VECTOR CUYOS ELEMENOS SON VECTORES. EL VECTOR MAYOR REPRESENTA UN MES.
 *	CADA VECTOR CONTENIDO EN EL VECTOR MAYOR REPRESENTA UN D�A DEL MES Y CONTIENE 24 VALORES,
 *	CADA UNO SIENDO LA TEMPERATURA DE LA HORA EQUIVALENTE A SU �NDICE+1.
 *
 */
public class TemperaturaTest {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);		//CREA SCANNER
		System.out.print("Introduzca el n�mero de d�as del mes: ");		//SOLICITA VALOR
		int d�as = teclado.nextInt();		//ALMACENA VALOR EN D�AS
		Temperatura [] t = new Temperatura [d�as];		//CREA VECTOR DE TEMPERATURAS
		for (int d�a=1;d�a<=d�as;d�a++) {		//PARA CADA D�A DEL MES
			t[d�a-1] = new Temperatura();		//CREAR UN NUEVO VECTOR
			for (int hora=0;hora<24;hora++) {		//PARA CADA HORA DEL D�A
				t[d�a-1].setGrados(hora, hora+1+3/2);		//ALMACENAR UNA TEMPERATURA
					//LA TEMPERATURA TIENE POCO SENTIDO, ES UN EJEMPLO.
			}
		}
	}
}
