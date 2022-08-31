import java.util.Locale;
import java.util.Scanner;

public class ProblemaLanchonete {
 public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);

    int codigo;
    int qtdComprada;
    double valorTotal, valorProduto;

    System.out.println("Digite o código do produto comprado(1,2 ou 4): ");
    codigo = sc.nextInt();
    System.out.println("Digite a quantidade comprada: ");
    qtdComprada = sc.nextInt();

    if(codigo == 1){
        valorProduto = 5.00;
        valorTotal = qtdComprada * valorProduto;
        System.out.printf("O valor a pagar é: $ %.2f", valorTotal);
    } else if(codigo == 2){
        valorProduto = 10.00;
        valorTotal = qtdComprada * valorProduto;
        System.out.printf("O valor a pagar é: $ %.2f", valorTotal);
    } else if(codigo == 4){
        valorProduto = 8.90;
        valorTotal = qtdComprada * valorProduto;
        System.out.printf("O valor a pagar é: $ %.2f", valorTotal);
    } else {
        System.out.println("Código inválido");
    }
 }   
}
