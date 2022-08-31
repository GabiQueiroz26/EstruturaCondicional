import java.util.Locale;
import java.util.Scanner;

public class ProblemaTroco {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double preco, dinheiro, troco, valorCompra, falta;
        int qtd;

        System.out.println("Digite o preço do produto: ");
        preco = sc.nextDouble();
        System.out.println("Digite a quantidade comprada do produto: ");
        qtd = sc.nextInt();  
        System.out.println("Digite o quanto de dinheiro recebido: ");
        dinheiro = sc.nextDouble();

        valorCompra = preco * qtd;
        troco = dinheiro - valorCompra;
        falta = valorCompra - dinheiro;
        
        if(dinheiro < valorCompra){
            System.out.printf("DINHEIRO INSUFICIENTE. FALTAM " + falta + " REAIS");
        }else{
            System.out.printf("Troco a ser dado = %.2f ", troco);
        }
    
    }
}
