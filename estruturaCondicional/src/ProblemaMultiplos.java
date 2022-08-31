import java.util.Locale;
import java.util.Scanner;

public class ProblemaMultiplos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Locale.setDefault(Locale.US);
        int numero1, numero2;

        System.out.println("Digite dois números inteiros: ");
        numero1 = sc.nextInt();
        numero2 = sc.nextInt();

        if(numero1 % numero2 == 0){
            System.out.println("Os dois números são múltiplos");
        } else {
            System.out.println("Não são múltiplos");
        }

    }
}
