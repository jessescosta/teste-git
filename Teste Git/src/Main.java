import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nome = "";
        Integer idade = 0;
        LocalDate dataAtual = LocalDate.now();
        int anoAtual = dataAtual.getYear();


        while (!nome.equals("sair")){
            System.out.println("Informe seu nome:");
            nome = scanner.next();
            System.out.println("Informe sua idade:");
            idade = scanner.nextInt();

            System.out.println(nome+" nasceu em "+ (anoAtual-idade));
        }
    }
}