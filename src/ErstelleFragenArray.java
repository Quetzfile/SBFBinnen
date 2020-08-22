public class ErstelleFragenArray {

    //static int aktuelleFrage;
    static Frage[] fragenSammlung = new Frage[Fragenkatalog.getAnzahlFragen()];


    //TODO: Methode noch nicht getestet und auch noch nicht angewendet. Vorerst wird die Variable 'aktuelle Frage' verwendet, um Daten aus einem Frage-Objekt zu ziehen.
    static int findeFrage() {
        int neueFrage;
        do neueFrage = AuswahlFrage.getNextFrage();
        while (fragenSammlung[neueFrage].richtigBeantwortet = true);

        return neueFrage;
    }


    static void frageObjekteInitialisieren() {
        for (int i = 0; i < Fragenkatalog.getAnzahlFragen(); i++) {
            fragenSammlung[i] = new Frage();
            for (int j = 0; j < 4; j++) {
                fragenSammlung[i].ant[j] = "moin";
            }
        }
    }

    static void fragenInArray() {
        for (int i = 0; i < Fragenkatalog.getAnzahlFragen(); i++) {
            fragenSammlung[i].frage = Fragenkatalog.fragenUndAntworten[i][0];
        }
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

    static void antwortenInFrageObjekte () {
        for (int i = 0; i < Fragenkatalog.getAnzahlFragen(); i++) {
            for (int j = 1; j <= 4; j++) {
                fragenSammlung[i].ant[j-1] = Fragenkatalog.fragenUndAntworten[i][j];
            }
        }
    }

    /*public static boolean getRichtigBeantwortet() {
        return fragenSammlung[AuswahlFrage.getAktuelleFrage()].richtigBeantwortet;
    }*/

    static void starteSession() {
        Fragenkatalog.initFragenkatalog();
        frageObjekteInitialisieren();
        frageNummerInArray();
        fragenInArray();
        richtigeAntInArray();
        richtigBeantwortetInArray();
        antwortenInFrageObjekte();
    }
}
