package ejerciciosDebug;

import java.util.Scanner;

/*
 * Realiza un programa que a partir de un numero n escriba la siguiente secuencia de cuentas 
 * atras para todos los numeros entre n y 1. Ejemplo para n=10

10 9 8 7 6 5 4 3 2 1

9 8 7 6 5 4 3 2 1

8 7 6 5 4 3 2 1

7 6 5 4 3 2 1

6 5 4 3 2 1

5 4 3 2 1

4 3 2 1

3 2 1

2 1

1
 */

public class d6debugEjer4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Entra numero: ");
		num = sc.nextInt();
		for (int i = num; i>0; i++) {
			for (int j=num; j>0;j--) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
