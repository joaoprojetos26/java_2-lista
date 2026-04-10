import java.util.Scanner;

public class exercicio_7 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero inteiro");
        int num;
        num=sc.nextInt();
        if (num>0) {
            System.out.println("positivo");
        } else if (num<0) {
            System.out.println("negativo");
        }else {
            System.out.println("o numero digitado zero");
        }
        sc.close();
    }
}
