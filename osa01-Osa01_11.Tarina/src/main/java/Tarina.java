
import java.util.Scanner;

public class Tarina {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Kerron kohta tarinan, mutta tarvitsen siihen hieman tietoja.\n" +
                                "Minkä niminen tarinassa esiintyvä hahmo on?");
        String name = lukija.nextLine();
        System.out.println("Mikä hahmon ammatti on?");
        String profession = lukija.nextLine();
        System.out.println("Tässä tarina:\n" +
                                "Olipa kerran " + name + ", joka oli ammatiltaan " + profession +".\n" +
                                "Matkatessaan töihin, " + name + " mietti arkeaan. Kun työnä\n" +
                                "on " + profession + ", tekemistä riittää välillä hyvin paljon ja\n" +
                                "välillä ei lainkaan. Ehkäpä " + name + " ei olekaan koko\n" +
                                "elämäänsä " + profession + ".");
    }
}
