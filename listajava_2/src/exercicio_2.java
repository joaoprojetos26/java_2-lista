import java.util.Scanner;

public class exercicio_2 {
    static void main() {
        System.out.println("digite as duas notas do aluno");
        double num1;
        double num2;
        Scanner sc = new Scanner(System.in);
        num1=sc.nextDouble();
        num2=sc.nextDouble();
        if (num1+num2/2>=7) {
            System.out.println("aprovado");
        } else {
            System.out.println("reprovado");
        }
    }
}
