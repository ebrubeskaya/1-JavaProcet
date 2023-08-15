package JavaLesson;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("1 ve 7 arasında bir sayı giriniz:");
        int sayi = input.nextInt();

        switch (sayi) {

            case 1:
                System.out.println("1 değeri girdiniz");
                break;
            case 2:
                System.out.println("2 değeri girdiniz");
                break;
            case 3:
                System.out.println("3 değeri girdiniz");
                break;
            case 4:
                System.out.println("4 değeri girdiniz");
                break;
            case 5:
                System.out.println("5 değeri girdiniz");
                break;
            case 6:
                System.out.println("6 değeri girdiniz");
                break;

            case 7:
                System.out.println("7 değeri girdiniz");
                break;
            default:
                System.out.println("Uygun değer girmediniz.");


        }

    }
}


