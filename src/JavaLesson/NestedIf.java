package JavaLesson;

import java.util.Scanner;

public class NestedIf {

    public static void  main(String[] args){

        Scanner input= new Scanner(System.in);
        int yas;
        System.out.println("Lütfen yaşını giriniz:");
        yas=input.nextInt();

        if(yas>0){

            if(yas>16){

                System.out.println("Siteye Girişiniz Başarılı.");

            }
            else {

                System.out.println("Siteye giriş için uygun değilsiniz.");
            }

        }

        else{
            System.out.println("Lütfen geçerli bir değer giriniz.");


        }

    }
}
