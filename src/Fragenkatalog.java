public class Fragenkatalog {
    private static int anzahlFragen = 3;
    static String[][] fragenUndAntworten = new String[3][5]; //3 Zeilen und 5 Spalten; erste Spalte Frage, zweite Spalte Antwort1 usw.

    public static void initFragenkatalog() {
        fragenUndAntworten[0][0] = "Was ist zu tun, wenn vor Antritt der Fahrt nicht feststeht, wer Schiffsführer ist?";
        fragenUndAntworten[0][1] = "Der verantwortliche Schiffsführer muss bestimmt werden.";
        fragenUndAntworten[0][2] = "Der verantwortliche Schiffsführer muss gewählt werden.";
        fragenUndAntworten[0][3] = "Ein Inhaber eines Sportbootführerscheins muss die Fahrzeugführung übernehmen.";
        fragenUndAntworten[0][4] = "Ein Inhaber eines Sportbootführerscheins muss die Verantwortung übernehmen.";
        fragenUndAntworten[1][0] = "In welchen Fällen darf weder ein Sportboot geführt noch dessen Kurs oder Geschwindigkeit selbstständig bestimmt werden?";
        fragenUndAntworten[1][1] = "Wenn man infolge körperlicher oder geistiger Mängel oder infolge Genusses alkoholischer Getränke oder anderer berauschender Mittel in der sicheren Führung" +
                " behindert ist oder wenn eine Blutalkoholkonzentration von 0,5 0/00 oder mehr im Körper vorhanden ist.";
        fragenUndAntworten[1][2] = "Wenn man infolge körperlicher oder geistiger Mängel oder infolge Genusses alkoholischer Getränke oder anderer berauschender Mittel in der sicheren Führung" +
                " behindert ist oder wenn eine Blutalkoholkonzentration von 0,8 0/00 oder mehr im Körper vorhanden ist.";
        fragenUndAntworten[1][3] = "Wenn man infolge körperlicher oder geistiger Mängel oder infolge Genusses alkoholischer Getränke oder anderer berauschender Mittel in der sicheren Führung" +
                " behindert ist oder wenn eine Blutalkoholkonzentration von 1,0 0/00 oder mehr im Körper vorhanden ist.";
        fragenUndAntworten[1][4] = "Wenn man infolge körperlicher oder geistiger Mängel oder infolge Genusses alkoholischer Getränke oder anderer berauschender Mittel in der sicheren Führung" +
                " behindert ist oder wenn eine Blutalkoholkonzentration von 0,3 0/00 oder mehr im Körper vorhanden ist.";
        fragenUndAntworten[2][0] = "Wann ist ein Fahrzeug in Fahrt?";
        fragenUndAntworten[2][1] = "Wenn es weder vor Anker liegt noch an Land festgemacht ist noch auf Grund sitzt.";
        fragenUndAntworten[2][2] = "Wenn es weder vor Anker liegt noch an Land festgemacht ist noch Fahrt über Grund macht.";
        fragenUndAntworten[2][3] = "Wenn es weder auf Grund sitzt noch vor Anker liegt noch manövrierbehindert oder manövrierunfähig ist.";
        fragenUndAntworten[2][4] = "Wenn es weder an Land festgemacht ist noch vor Anker liegt noch Fahrt durchs Wasser macht.";
    }
    public static int getAnzahlFragen() {
        return anzahlFragen;
    }

    public void setAnzahlFragen(int anzahlFragen) {
        this.anzahlFragen = anzahlFragen;
    }
}
