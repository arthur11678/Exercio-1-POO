import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int x = teclado.nextInt();
        while(x != 1){
            if((x % 2 ) == 0){
                x = x/2;
            }else{
                x = 3 * x + 1;
            }
            System.out.println(x);
        }
    }
}
