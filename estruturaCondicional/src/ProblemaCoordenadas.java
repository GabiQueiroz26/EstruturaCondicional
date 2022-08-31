import java.util.Locale;
import java.util.Scanner;

public class ProblemaCoordenadas {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        double x,y;

        System.out.println("Digite o valor de x: ");
        x = sc.nextDouble();
        System.out.println("Digite o valor de y: ");
        y = sc.nextDouble();

        if(x < 0 && y > 0){
            System.out.printf("Pertence a Q2");
        }
        else if(x > 0 && y > 0){
            System.out.printf("Pertence a Q1");
        }
        else if(x < 0 && y < 0){
            System.out.printf("Pertence a Q3");
        }
        else if(x > 0 && y < 0){
            System.out.printf("Pertence a Q4");
        }
        else if(x == 0 && y == 0){
            System.out.printf("Pertence a Origem");
        }
        else if(y == 0){
            System.out.printf("Pertence ao Eixo X");
        }
        else if(x == 0){
            System.out.printf("Pertence ao Eixo Y");
        }
    }
}
