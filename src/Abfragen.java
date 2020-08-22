import java.util.Random;
import java.util.Scanner;

public class Abfragen {
    static boolean[] gezeigt = new boolean[4];
    static int aktuellsteFrage = naechsteFrage();

    static int naechsteFrage() {

        int aktuelleFrage = AuswahlFrage.getNextFrage();
        System.out.print("Frage " + ErstelleFragenArray.fragenSammlung[aktuelleFrage].frageNummer + ": ");
        System.out.println(ErstelleFragenArray.fragenSammlung[aktuelleFrage].frage);


        /*for (int i = 0; i < 4; i++) {
            System.out.println(ErstelleFragenArray.fragenSammlung[aktuelleFrage].ant[i]);
        }*/
        return aktuelleFrage;
    }

    static void antwortenZeigen() {
        int randomAntwort;
        int gezeigteAntworten = 1;
        do {
            randomAntwort = new Random().nextInt(4);
            if (gezeigt[randomAntwort] == false) {
                System.out.println("(" + gezeigteAntworten + ")" + ErstelleFragenArray.fragenSammlung[aktuellsteFrage].ant[randomAntwort]);
                gezeigteAntworten++;
                gezeigt[randomAntwort] = true;
            }
        } while (gezeigteAntworten < 5);
    }
    void initAntwortenZeigen() {
        for (int i = 0; i < 4; i++) {
            gezeigt[i] = false;
        }
    }

    static void antworten() {
        int benutzerAntwort;
        System.out.print("Geben Sie 1, 2, 3 oder 4 für die richtige Antwort ein: ");
        Scanner keyboard = new Scanner(System.in);
        benutzerAntwort = keyboard.nextInt();
    }
//TODO: Die Antwort muss nun noch überprüft werden. neue Methode? neue Klasse?
}
