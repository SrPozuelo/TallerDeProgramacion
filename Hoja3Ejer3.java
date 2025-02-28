import java.util.Scanner;
public class Hoja3Ejer3{
	public static void main(String []args){
		Scanner teclado=new Scanner(System.in);
		int a,b;
		float solucion;
		System.out.print("Introduzca el primer coeficiente para la equacion ax+b=0: ");
		a=teclado.nextInt();
		System.out.print("Introduzca el segundo coeficiente para la equacion ax-b=0: ");
		b=teclado.nextInt();
		if((a==0)&&(b==0)){
			System.out.print("La ecuacion 0x-0=0 tiene infinitas soluciones.");
		}
		else{
			if(a==0){
				System.out.print("La ecuacion 0x-"+b+"=0 no tiene solucion.");
			}
			else{
				solucion=(-1.0F*b)/a;
				if(solucion==0){
					solucion=-solucion;
				}
				System.out.print("La ecuacion "+a+"x-"+b+"=0 tiene una solucion y es "+solucion);
			}
		}
	}
}