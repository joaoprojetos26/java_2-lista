import java.util.Scanner;

public class exercicio_5 {
    static void main() {
        System.out.println("digite um numero");
        double num;
        Scanner sc = new Scanner(System.in);
        num= sc.nextDouble();
        if (num%2==0&&num%3==0){
            System.out.println("divisivel por dois e tres");
        }else {
            System.out.println("nao divisivel por dois e tres");
        }
        sc.close();
    }
}
