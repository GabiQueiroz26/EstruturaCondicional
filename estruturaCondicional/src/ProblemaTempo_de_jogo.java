import java.util.Locale;
import java.util.Scanner;

public class ProblemaTempo_de_jogo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int horaInicial, horaFinal, duracao;

        System.out.println("Digite a hora inicial: ");
        horaInicial = sc.nextInt();
        System.out.println("Digite a hora final: ");
        horaFinal = sc.nextInt();



        if(horaInicial > 12){
            duracao =  ((24 - horaInicial) + horaFinal);
            System.out.printf("O jogo durou: " + duracao + " horas");
        } else if (horaInicial < 12 && horaInicial != 0){
            duracao = ((0 - horaInicial) + horaFinal);
            System.out.printf("O jogo durou: " + duracao + " horas");
        } else if(horaInicial == 0 && horaFinal != 0){
            duracao = horaInicial + horaFinal;
            System.out.printf("O jogo durou: " + duracao + " horas");
        } else if(horaInicial == 0 && horaFinal == 0){
            System.out.println("O jogo durou 24 horas");
        }
        
    }
}
