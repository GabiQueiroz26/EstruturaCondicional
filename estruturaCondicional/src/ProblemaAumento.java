import java.util.Locale;
import java.util.Scanner;

public class ProblemaAumento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Locale.setDefault(Locale.US);

        double salario, novoSalario, aumento;

        System.out.println("Digite o salário da pessoa: ");
        salario = sc.nextDouble();

        if(salario <= 1000){
            novoSalario = salario + (salario * 0.2);
            aumento = salario * 0.2;
            System.out.printf("Novo salário: %.2f %n", novoSalario);
            System.out.printf("Aumento: %.2f %n", aumento);
            System.out.println("Porcentagem = 20%");
        } else if(salario > 1000 && salario <= 3000){
            novoSalario = salario + (salario * 0.15);
            aumento = salario * 0.15;
            System.out.printf("Novo salário: %.2f %n", novoSalario);
            System.out.printf("Aumento: %.2f %n", aumento);
            System.out.println("Porcentagem = 15%");
        } else if(salario > 3000 && salario <= 8000){
            novoSalario = salario + (salario * 0.10);
            aumento = salario * 0.10;
            System.out.printf("Novo salário: %.2f %n", novoSalario);
            System.out.printf("Aumento: %.2f %n", aumento);
            System.out.println("Porcentagem = 10%");
        } else if(salario > 8000){
            novoSalario = salario + (salario * 0.05);
            aumento = salario * 0.05;
            System.out.printf("Novo salário: %.2f %n", novoSalario);
            System.out.printf("Aumento: %.2f %n", aumento);
            System.out.println("Porcentagem = 5%");
        }
    }
}
