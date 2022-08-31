import java.util.Locale;
import java.util.Scanner;

public class ProblemaOperadora {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int qtdMinutos, qtdMinutosExcedentes;
        double valorPago;
        
        System.out.println("Digite a quantidade de minutos gastos:");
        qtdMinutos = sc.nextInt();

        if (qtdMinutos <= 100){
            System.out.println("O valor a ser pago é de $ 50,00");
        } else if (qtdMinutos > 100) {
            qtdMinutosExcedentes = qtdMinutos - 100;
            valorPago = qtdMinutosExcedentes * 2;
            System.out.printf("O valor a ser pago é de $ " + (valorPago + 50));
        } 
    }
}

