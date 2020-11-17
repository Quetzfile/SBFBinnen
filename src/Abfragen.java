import java.util.Random;
import java.util.Scanner;

public class Abfragen {
    static boolean[] gezeigt = new boolean[4];
    static int aktuellsteFrage;
    static int benutzerAntwort;
    static int vorerstRichtigeAntwort;

    static void naechsteFrage() {

        int aktuelleFrage = AuswahlFrage.getNextFrage();
        System.out.print("Frage " + ErstelleFragenArray.fragenSammlung[aktuelleFrage].frageNummer + ": ");
        System.out.println(ErstelleFragenArray.fragenSammlung[aktuelleFrage].frage);
        aktuellsteFrage = aktuelleFrage;
    }

    //Die Antworten sollen immer in zufälliger Reihenfolge angezeigt werden.
    //Deswegen wird eine zufällige Zahl bestimmt und gefprüft, ob die Frage im schon
    //angezeigt wurde (gezeigt == true). Wenn false, wird sie angezeigt, wenn true,
    //wird eine neue gesucht. So oft bis eine gefunden wird, die noch false ist.
    static void antwortenZeigen() {
        int randomAntwort;
        int gezeigteAntworten = 1;
        do {
            randomAntwort = new Random().nextInt(4);
            if (gezeigt[randomAntwort] == false) {
                System.out.println("(" + gezeigteAntworten + ") " + ErstelleFragenArray.fragenSammlung[aktuellsteFrage].ant[randomAntwort]);
                gezeigt[randomAntwort] = true;
                neueRichtigeAntwort(randomAntwort, gezeigteAntworten);
                gezeigteAntworten++;
            }
        } while (gezeigteAntworten < 5);
    }

    static void antworten() {
        System.out.print("Geben Sie 1, 2, 3 oder 4 für die richtige Antwort ein: ");
        Scanner keyboard = new Scanner(System.in);
        benutzerAntwort = keyboard.nextInt();
    }

//TODO: die überflüssigen print statements rausnehmen
    static void antwortCheck() {
        if (benutzerAntwort == vorerstRichtigeAntwort) {
            ErstelleFragenArray.fragenSammlung[aktuellsteFrage].richtigBeantwortet = true;
            System.out.println("Richtige Antwort ist: " + vorerstRichtigeAntwort);
            System.out.println("richtig");
            System.out.println(ErstelleFragenArray.fragenSammlung[aktuellsteFrage].richtigBeantwortet);
        }
        else {
            System.out.println("Falsch");
            System.out.println("Richtige Antwort ist: " + vorerstRichtigeAntwort);
            System.out.println(ErstelleFragenArray.fragenSammlung[aktuellsteFrage].richtigeAntwort); //Im Frage-Objekt
        }
    }

    //Weil die Antwortmöglichkeiten in zufälliger Reihenfolge angezeigt werden, ist nicht die Antwort 1 aus dem
    //Fragenkatalog richtig. Diese Methode soll diesen Abgleich zwischen der vorerst richtigen Antwort und der
    //tatsächlichen aus dem Fragenkatalog schaffen.
    static void neueRichtigeAntwort(int randAnt, int gezAnt) {
        if (randAnt == 0) {
            vorerstRichtigeAntwort = gezAnt;
        }
    }
}