import java.util.Scanner;

public class comparacaoDeMaiorNumero {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        Integer numeroUm = prompt.nextInt();

        System.out.print("Digite outro numero: ");
        Integer numeroDois = prompt.nextInt();
        if (numeroUm == numeroDois) {
            System.out.println("Não pode ser o mesmo numero");
        } else if (numeroUm > numeroDois) {
            System.out.println("O numero " + numeroUm + " é maior!");
        } else {
            System.out.println("O numero "+numeroDois+" é maior!");
        }
    }
}

