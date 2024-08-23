import java.util.Scanner;

public class exemplosDelf {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        Integer numeroIntero = prompt.nextInt();

        if (numeroIntero%2 == 0){
            System.out.println("O numero "+numeroIntero+" é par");
        }else {
            System.out.println("O numero "+numeroIntero+" é impar");
        }
    }
}
