package JavaLesson;

public class DoWhile{

    public static void main(String[] args)
    {
        int satir, kolon;
        System.out.println("Çarpım Tablosu \n");
        satir = 1;
        do {
            kolon = 1;
            do{
                int a = satir * kolon;
                System.out.printf("%4d", + a);
                kolon = kolon + 1;
            }while(kolon <= 10);
            System.out.println("\n");
            satir = satir + 1;
        } while(satir <= 10);
    }


}

