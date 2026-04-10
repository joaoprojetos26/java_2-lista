import java.util.Scanner;

public class exercicio_3 {
    static void main() {
        System.out.println("digite um numero");
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if (num % 5 == 0) {
            System.out.println("divisivel por cinco");
        } else {
            System.out.println("nao divisivel");
        }
        sc.close();
    }
}