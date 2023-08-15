package JavaLesson;

public class ForLoop {

    public static void main(String[] args) {


        int x;
        int y;
        int test;
        for (x = 1; x < 15000; x++) {
            test = 0;
            for (y = 1; y < x; y++) {
                if (x % y == 0) {
                    test += y;
                }
            }
            if (test == x) {
                System.out.println(test + " mükemmel sayı");
            }
        }
    }
}
