import java.util.Scanner;

public class exercicios_6 {
    static void main() {
        System.out.println("escreva dois numeros diferentes");
        double num;
        double num1;
        Scanner sc = new Scanner(System.in);
        num = sc.nextDouble();
        num1 = sc.nextDouble();
        if (num > num1) {
            System.out.println(num + "e o numero maior");
        } else {
            System.out.println(num1 + "e o numero maior");
        }
        sc.close();
    }
}