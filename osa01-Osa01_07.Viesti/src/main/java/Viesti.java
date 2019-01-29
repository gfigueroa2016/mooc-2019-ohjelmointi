
import java.util.Scanner;

public class Viesti {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Kirjoita merkkijono!");
        String line = lukija.nextLine();
        System.out.println(line);

    }
}
