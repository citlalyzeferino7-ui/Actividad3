import java.util.Scanner;

public class Fibonaccirecursiva{

static Scanner entrada = new Scanner(System.in);

static int serieFibonacciRecursivo(int n){
    if( n == 0 || n == 1 )return n;
    else
    return serieFibonacciRecursivo(n-1) + serieFibonacciRecursivo(n-2);
    }
public static void main(String[] args) {
    int n;
    System.out.println("Favor ingresar la cantidad de terminos: ");
    n = entrada.nextInt();
    for(int i = 1; i <= n-0; i++)
    System.out.println("Fibonacci: " + (i+1) + " es: " + serieFibonacciRecursivo(i) + "\n");
    }
}
