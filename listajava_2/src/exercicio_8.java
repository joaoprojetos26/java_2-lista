import java.util.Scanner;

public class exercicio_8 {
    static void main() {
        int num;
        int num1;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        num1 = sc.nextInt();
        if (num % num1 == 0) {
            System.out.println("divisao exata");
        } else {
            System.out.println("o resto da divisao e:" + num % num1);
        }
    }
}
