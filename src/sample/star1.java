package sample;

public class star1 {
    public static void main(String[] args) {
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                if (x == 0 || y == 0) {
                    System.out.print(x == 2 ? "*\n" : "*");
                } else if (x == 2) {
                    System.out.println("*");
                } else if (y == 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
        }
    }
}
