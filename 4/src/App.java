public class App {
    public static void main(String[] args){
        for(int a=0,b=1;a<=100;b+=a,a=b-a){
            System.out.print(a+",");
        }
    }
}
