
import java.util.Scanner;

public class Liukuluku {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Syötä luku!");
        double number = Double.valueOf(lukija.nextLine());
        System.out.println("Syötit luvun " + number);
    }
}
