package JavaLesson;

import java.util.Scanner;

public class CondExample {

    public static void  main(String[] args){

        System.out.println("Lütfen maaş değerini giriniz:");
        Scanner input=new Scanner (System.in);
        int maas=input.nextInt();
        if(maas>0 && maas<7000){
            System.out.println("Maaşınızda kesinti yapılmayacaktır.");
        }
        else if(maas>=7000 && maas<9000){
            System.out.println("Maaşınıza %5 vergi uygulanacaktır.");

        }
        else if(maas<9000){
            System.out.println("Maaşınıza %10 vergi uygulanacaktır.");

        }
        else{
            System.out.println("Lütfen geçerli bir değer giriniz.");

        }

        input.close();

    }
}
