public class ErstelleFragenArray {
    static Frage[] fragenSammlung = new Frage[3];

    static void frageObjekteInitialisieren() {
        for (int i = 0; i < 3; i++) {
            fragenSammlung[i] = new Frage();
        }
    }

    static void fragenInArray() {
        fragenSammlung[0].frage = "Frage 1";
        //fragenSammlung[1].frage = Fragenkatalog.fragenUndAntworten[1][0];
        fragenSammlung[1].frage = "Frage 2";
        fragenSammlung[2].frage = "Frage 3";
    }


    static void frageAnzeigen() {
        frageObjekteInitialisieren();
        fragenInArray();
        System.out.println(fragenSammlung[1].frage);
    }
}
