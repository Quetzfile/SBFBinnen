

public class ErstelleFragenArray {

    //Erstellung eines Arrays vom Typ Frage. Aktuell mit 3 Fragen, mehr Fragen folgen später. Evtl. dann auch aus einer separaten Datenbank.
    public static Frage[] fragenSammlung = new Frage[3];





    ErstelleFragenArray() {
        fragenSammlung[0].frage = "Frage 1";
        fragenSammlung[1].frage = "Frage 2";
        fragenSammlung[2].frage = "Frage 3";
    }


    //Konstruktor, der den Fragen-Array (fragenSammlung) mit Fragen füttert.
  /*  ErstelleFragenArray() {
        new FragenkatalogIII();
            for (int i = 0; i < 3; i++) {
                fragenSammlung[i].frageNummer = i;
                fragenSammlung[i].richtigeAntwort = 0;
                fragenSammlung[i].richtigBeantwortet = false;
                fragenSammlung[i].frage = FragenkatalogIII.fragenUndAntworten[i][0];
                for (int j = 1; j <= 5; j++) {
                    fragenSammlung[i].ant[j - 1] = FragenkatalogIII.fragenUndAntworten[i][j];
                }
            }

    } */
}
