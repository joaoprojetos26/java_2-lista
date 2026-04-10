import java.util.Scanner;

public class exercicio_9 { public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Digite o valor de sua compra");
    double D;
    D = sc.nextDouble();
    if (D>100){
        System.out.println(D*0.90+"Parabens você obteve um desconto de 10%");
        System.out.println("Valor final: "+D);
    }
    else {
        System.out.println("Valor menor que 100 você não obteve um desconto de 10%");
        System.out.println("Valor final: "+D);
    }
}
}
