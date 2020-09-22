import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Digite um numero inteiro para saber seu fatorial");
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        int fat = numero;
        for(int i = 1; i < numero; i++){
            fat *= (numero - i);
        }
        System.out.println("O fatorial eh " + fat);
    }
}
