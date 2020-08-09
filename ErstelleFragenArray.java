

public class ErstelleFragenArray {
    public static Frage[] fragenSammlung = new Frage[3];
    int nummer;

    ErstelleFragenArray() {
        for (int i = 0; i < 3; i++) {
            fragenSammlung[i].frageNummer = i;
            fragenSammlung[i].richtigeAntwort = 0;
            fragenSammlung[i].richtigBeantwortet = false;
            fragenSammlung[i].frage = FragenkatalogIII.fragenUndAntworten[i] [0];
            for (int j = 1; j <= 5; j++) {
                fragenSammlung[i].ant[j-1] = FragenkatalogIII.fragenUndAntworten[i] [j];
            }
        }
    }
}
