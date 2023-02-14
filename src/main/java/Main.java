import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Boyunuzu Giriniz:");
        double boy = input.nextDouble();
        System.out.println("Kilonuzu kg cinsinden giriniz:");
        double kilo = input.nextDouble();
        double bki = kilo/(boy*boy);
        if (bki<18.5)
            System.out.println("Zayıf");
         else if (bki>=18.5 && bki<24.9) {
            System.out.println("Normal Kilolu");
        } else if (bki>=25 && bki<=29.9) {
            System.out.println("Fazla Kilolu");
        } else if (bki>=30 && bki<34.9) {
            System.out.println("Aşırı Obezite");
        }

    }
}
