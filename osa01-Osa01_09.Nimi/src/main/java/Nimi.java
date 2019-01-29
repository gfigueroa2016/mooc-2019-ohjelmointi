
import java.util.Scanner;

public class Nimi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Mikä on nimesi?");
        String name = lukija.nextLine();
        System.out.println("Hei " + name);

    }
}
