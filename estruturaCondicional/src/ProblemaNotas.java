import java.util.Locale;
import java.util.Scanner;

public class ProblemaNotas {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double nota1, nota2, nota_final;

        System.out.println("Digite a primeira nota: ");
        nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = sc.nextDouble();

        nota_final = nota1 + nota2;
        

        if(nota_final >= 60.00){
            System.out.println("Nota Final: " + nota_final);
            System.out.println("Aprovado");
        } else {
            System.out.println("Nota Final: " + nota_final);
            System.out.println("Reprovado");
        }

    }
}
