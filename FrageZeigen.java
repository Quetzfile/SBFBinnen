import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JDialog;

public class FrageZeigen {
    //ErstelleFragenArray frage = new ErstelleFragenArray();

FrageZeigen() {
    System.out.println(ErstelleFragenArray.fragenSammlung[1].frage);
}

   /* FrageZeigen() {
        JDialog frage = new JDialog();
        frage.setTitle("Prüfungsfragen");
        frage.setSize(1000, 600);
        frage.add(new JLabel(frage[1].frage));
        //frage.add(new JLabel(Fragenkatalog.frage001));
        //frage.add(new JLabel(Fragenkatalog.ant001[0]));
        frage.setModal(true);
        frage.setVisible(true);
    }*/
}
