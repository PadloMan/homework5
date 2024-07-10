package app;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть суму прибутку: ");
        double num = scan.nextInt();

        double res1 = num * 0.025;
        double res2 = 10000 * 0.025 + ((num - 10000) * 0.043);
        double res3 = (10000 * 0.025) + (15000 * 0.043) + ((num - 25000) * 0.067);
        if ( num>0 && num < 10000) {
            System.out.println("Ваш податок =" + res1);

        } else if (10000 < num || num < 25000) ;
        {
            System.out.println("податок = " + res2);
        } if ( num > 25000) {
            System.out.println("сума податку  =" + res3);}




    }
}