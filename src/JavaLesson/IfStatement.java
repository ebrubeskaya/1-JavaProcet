package JavaLesson;

import java.util.Scanner;

public class IfStatement {

    public static void main(String [] args){

        Scanner input= new Scanner(System.in);
        int yas;
        System.out.println("Lütfen yaşını giriniz:");
        yas=input.nextInt();
        if(yas>14){

            System.out.println("Web sitesi ve mobil uygulamasından kayıt olabilirsiniz.");

        }

        else{
            System.out.println("Kayıt işlemi için yaşınız uygun değil.");


        }
    }
}
