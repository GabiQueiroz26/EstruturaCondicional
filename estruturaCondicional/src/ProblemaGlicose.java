import java.util.Locale;
import java.util.Scanner;

public class ProblemaGlicose {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double glicose;

        System.out.println("Digite a medida da glicose: ");
        glicose = sc.nextDouble();
        
        if(glicose <= 100){
            System.out.println("Sua glicose está normal");
        } else if(glicose > 100 && glicose <= 140){
            System.out.println("Sua glicose está elevada");
        } else if(glicose > 140){
            System.out.println("Você está com diabetes");
        }
    }
}
