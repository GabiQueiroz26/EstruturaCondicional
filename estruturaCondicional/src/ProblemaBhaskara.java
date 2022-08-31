import java.util.Locale;
import java.util.Scanner;

public class ProblemaBhaskara {
    public static void main(String[] args) {
        
        double a,b,c;
        double x1,x2;
        double delta;

        Locale.setDefault(Locale.US);

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um valor para a, b e c :");
        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();

        delta = Math.pow(b, 2) - 4*a*c ;

        x1 = ( -b + Math.sqrt(delta) ) / ( 2*a);
        x2 = (-b - Math.sqrt(delta)) / (2*a);

        if(delta < 0){
            System.out.println("Essa equação não possui raízes reais");
        } else {
            System.out.printf("X1 = %.4f %n", x1);
            System.out.printf("X2 = %.4f %n", x2);
        }

        teclado.close();
    }
}
