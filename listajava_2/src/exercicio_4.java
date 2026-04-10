import java.util.Scanner;

public class exercicio_4 {
    static void main() {
        System.out.println("digite seu ano de nacimento");
        int ano;
        Scanner sc = new Scanner(System.in);
        ano = sc.nextInt();
        if (2026-ano >= 18) {
            System.out.println("maior de idade");
        } else {
            System.out.println("menor de idade");
        }
        sc.close();
    }
}
