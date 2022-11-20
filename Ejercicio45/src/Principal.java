import java.util.Scanner;
public static void main(String []args){
	int a, b, suma;
	Scanner teclado = new Scanner(System.in);
	System.out.println("Introduzca un numero: ");
	a = teclado.nextInt();
        System.out.println("Introduzca otro numero: ");
	b = teclado.nextInt();
	suma = a + b;
	System.out.println("La suma de ambos numeros es: " + suma);
}

