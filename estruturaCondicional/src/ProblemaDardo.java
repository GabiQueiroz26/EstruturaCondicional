import java.util.Locale;
import java.util.Scanner;

public class ProblemaDardo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        double a, b, c;

        System.out.println("Digite as três distâncias: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        if(a > b && a > c){
            System.out.printf("Maior distância: %.2f", a);
        } else if(b > a && b > c){
            System.out.printf("Maior distância: %.2f", b);
        } else if(c > a && c > b){
            System.out.printf("Maior distância: %.2f", c);
        }
    }
}
