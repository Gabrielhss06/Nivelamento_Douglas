import java.util.Scanner;

public class calculoDeReajusteDeSalario {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        System.out.println("Digite o seu salario: ");
        double salario = prompt.nextFloat();
        double salarioReajustado= salario;
        // quem ganha ate 1412 - reajuste de 12%
        // quem ganha ate 3000 _ reajuste de 9%
        // quem ganha ate 5000 - reajuste de 5%
        // quem ganha mais de 5000 - sem reajuste
        if(salario <= 1412 ){
             salarioReajustado = salarioReajustado * 1.12;
        }else if (salario <= 3000){
            salarioReajustado = salarioReajustado * 1.09;
        } else if (salario <= 5000) {
            salarioReajustado = salarioReajustado * 1.05;
        }else {
            System.out.println("sem reajuste");
        }

    }
}
