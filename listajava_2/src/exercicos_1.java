import java.util.Scanner;

public class exercicos_1 {
    static void main() {
        System.out.println("escreva um numero para analisar se e o mesmo e par ou impar");
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("numero par");
        } else {
            System.out.println("numero impar");
        }
        sc.close();
    }
}
