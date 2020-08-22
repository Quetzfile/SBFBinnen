import java.util.Random;

public class AuswahlFrage {


    private static int nextFrage/* = new Random().nextInt( Fragenkatalog.getAnzahlFragen())*/;



    /* private static int aktuelleFrage = 1;

     while (ErstelleFragenArray.getRichtigBeantwortet() = false) {

     }
     public static int getAktuelleFrage() {
         return aktuelleFrage;
     }
 */
    public static int getNextFrage() {
        return nextFrage = new Random().nextInt(Fragenkatalog.getAnzahlFragen());
    }

}