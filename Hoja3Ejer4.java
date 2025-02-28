import java.util.Scanner;
public class Hoja3Ejer4{
	public static void main(String []args){
		Scanner teclado=new Scanner(System.in);
		int mes;
		System.out.print("Introduzca el numero del mes: ");
		mes=teclado.nextInt();
		switch(mes){
			case 1,3,5,7,8,10,12->{
				System.out.print("El mes "+mes+" tiene 31 dias.");
			}
			case 4,6,9,11->{
				System.out.print("El mes "+mes+" tiene 30 dias.");
			}
			case 2->{
				System.out.print("Febrero tiene 28 dias excepto en anyo bisiesto que tiene 29.");
			}
			default->{
				System.out.print("El mes "+mes+" no existe.");
			}
		}
	}
}