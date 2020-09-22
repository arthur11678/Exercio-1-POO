import java.util.Random;
import java.util.Arrays;
public class App {
    public static void main(String[] args){
        Random random = new Random();
        int[] vet1 = new int[50];
        int[] vet2 = new int[50];
        int[] vetresultado = new int[100];
        for(int i = 0; i <50; i++){
            vet1[i] = random.nextInt(100);
            vet2[i] = random.nextInt(100);
        }
        Arrays.sort(vet1);
        Arrays.sort(vet2);
        int x = 0;
        int y = 0;
        int z = 0;
        while(z <= 99){
            if(x == 50){
                for(; y <= 49; y++){
                    vetresultado[z] = vet2[y];
                    z++;
                }
            }else if(y == 50){
                for(; x <= 49; x++){
                    vetresultado[z] = vet1[x];
                    z++;
                }
            }else if(vet1[x] < vet2[y]){
                vetresultado[z] = vet1[x];
                x++;
                z++;
            }else if (vet2[y] < vet1[x]){
                vetresultado[z] = vet2[y];
                y++;
                z++;
            }else{
                vetresultado[z] = vet1[x];
                vetresultado[z+1] = vet2[y];
                z+=2;
                x++;
                y++;
            }
        }
        for(int i = 0; i <= 99; i++){
            System.out.println(vetresultado[i]); 
        }
        
    }
}
