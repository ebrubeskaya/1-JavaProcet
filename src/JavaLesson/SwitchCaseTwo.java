package JavaLesson;

import java.util.Scanner;

public class SwitchCaseTwo {

    public static void main(String [] args){

    Scanner input=new Scanner(System.in);
    System.out.println("Lütfen yapılacak işlemi seçiniz:Toplama için 1, Çıkarma için 2, Çarpma için 3 değerini seçin");
    int secim=input.nextInt();
    int x=10;
    int y=13;

    switch (secim){
        case 1:
            System.out.println("Toplam:"+(x+y));
            break;

        case 2:
            System.out.println("Çıkarma:"+(x-y));
            break;

        case 3:
            System.out.println("Çarpma:"+(x*y));
            break;
        default:
            System.out.println("Yanlış değer girdiniz.");

    }


    }


}
