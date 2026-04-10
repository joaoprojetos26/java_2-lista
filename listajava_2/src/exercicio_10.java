import java.util.Scanner;

public class exercicio_10 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite sua senha");
        int num;
        num= sc.nextInt();
        if (num==1234){
            System.out.println("senha aprovada");
        }else {
            System.out.println("senha incorreta");}
        sc.close();
    }
}
