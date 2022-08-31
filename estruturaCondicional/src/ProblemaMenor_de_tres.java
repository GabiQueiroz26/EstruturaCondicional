import java.util.Locale;
import java.util.Scanner;

public class ProblemaMenor_de_tres {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        System.out.println("Digite o primeiro valor: ");
        a = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        b = sc.nextInt();
        System.out.println("Digite o terceiro valor: ");
        c = sc.nextInt();

        if(a < b && a < c){
            System.out.println("Menor valor: " + a);
        } else if(b < a && b < c){
            System.out.println("Menor valor: " + b);
        } else if(c < a && c < b){
            System.out.println("Menor valor: " + c);
        } else if(a == b && a == c && b == c){
            System.out.println("Menor valor: " + c);
        } else if(a == b && a < c){
            System.out.println("Menor valor: " + a);
        } else if(c == b && b < a){
            System.out.println("Menor valor: " + b);
        } else if(a == c && c < b){
            System.out.println("Menor valor: " + c);
        }
    }
}
