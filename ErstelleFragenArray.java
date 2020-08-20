


public class ErstelleFragenArray {

    int aktuelleFrage/* = AuswahlFrage.getNextFrage()*/;
    static Frage[] fragenSammlung = new Frage[Fragenkatalog.getAnzahlFragen()];


    //TODO: Methode noch nicht getestet und auch noch nicht angewendet
    static int findeFrage() {
        int neueFrage;
        do neueFrage = AuswahlFrage.getNextFrage();
        while (fragenSammlung[neueFrage].richtigBeantwortet = true);

        return neueFrage;
    }


    static void frageObjekteInitialisieren() {
        for (int i = 0; i < Fragenkatalog.getAnzahlFragen(); i++) {
            fragenSammlung[i] = new Frage();
        }
    }

    static void fragenInArray() {
        fragenSammlung[0].frage = Fragenkatalog.fragenUndAntworten[0][0];
        fragenSammlung[1].frage = Fragenkatalog.fragenUndAntworten[1][0];
        fragenSammlung[2].frage = Fragenkatalog.fragenUndAntworten[2][0];
    }

    static void frageNummerInArray() {
        for (int i = 0; i < Fragenkatalog.getAnzahlFragen(); i++) {
            fragenSammlung[i].frageNummer = i;
        }
    }

    //Der Fragenkatalog ist so sortiert, dass die erste Antwort nach der Frage immer die richtige Antwort ist.
    static void richtigeAntInArray() {
        for (int i = 0; i < Fragenkatalog.getAnzahlFragen(); i++) {
            fragenSammlung[i].richtigeAntwort = 1;
        }
    }

    static void richtigBeantwortetInArray() {
        for (int i = 0; i < Fragenkatalog.getAnzahlFragen(); i++) {
            fragenSammlung[i].richtigBeantwortet = false;
        }
    }

    /*public static boolean getRichtigBeantwortet() {
        return fragenSammlung[AuswahlFrage.getAktuelleFrage()].richtigBeantwortet;
    }*/

    static void frageAnzeigen() {
        ErstelleFragenArray.frageObjekteInitialisieren();
        frageNummerInArray();
        fragenInArray();
        richtigeAntInArray();
        richtigBeantwortetInArray();
        System.out.print("Frage " + fragenSammlung[AuswahlFrage.getNextFrage()].frageNummer + ": ");
        System.out.println(fragenSammlung[AuswahlFrage.getNextFrage()].frage);
    }
}
