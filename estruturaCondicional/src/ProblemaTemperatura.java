import java.util.Locale;
import java.util.Scanner;

public class ProblemaTemperatura {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        char letra;
        double temperatura, temperaturaC, temperaturaF;

        System.out.println("Você vai digitar a temperatura em qual escala (C/F)? ");
        letra = sc.next().charAt(0);

        if(letra == 'F' || letra == 'f'){
            System.out.printf("Digite a temperatura em Fahrenheit: ");
            temperatura = sc.nextDouble();
            temperaturaC = (temperatura - 32) * 5/9;
            System.out.printf("Temperatura equivalente em Celsius: %.2f", temperaturaC);
        } else if(letra == 'C' || letra == 'c'){
            System.out.printf("Digite a temperatura em Celsius: ");
            temperatura = sc.nextDouble();
            temperaturaF = (temperatura * 1.8) + 32;
            System.out.printf("Temperatura equivalente em Fahrenheit: %.2f", temperaturaF);
        }
    }
}
