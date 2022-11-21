import javax.swing.*;
import java.awt.*;

class gui {
    public static void main(String[] args) {
        {

            JFrame obramowanie = new JFrame("Konwerter walut 2022 - TaloHomes404");  // Tworzymy okienko 350x350 z tytułem
            obramowanie.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //przycisk X do wyłączenia
            obramowanie.setSize(450, 450);


            JMenuBar menuWyboru = new JMenuBar();  // tworzymy "pasek wyboru"
            JMenu wybor1 = new JMenu("Program"); //nazwa kategorii
            JMenu wybor2 = new JMenu("Pomoc");
            menuWyboru.add(wybor1);  //funkcja dodajaca kategorie
            menuWyboru.add(wybor2);
            JMenuItem wybor1Opcje1 = new JMenuItem("opcja1");  // tworzymy trzy wybory pierwsze kategorii
            JMenuItem wybor1Opcje2 = new JMenuItem("opcja2");
            JMenuItem wybor1Opcje3 = new JMenuItem("opcja3");
            wybor1.add(wybor1Opcje1); // funkcja dodajaca do pierwszej kategorii wybor
            wybor1.add(wybor1Opcje2);
            wybor1.add(wybor1Opcje3);

            JPanel glownyPanel = new JPanel();  // instancja tworzaca nowy panel
            JLabel tekst1 = new JLabel("Wprowadź kwotę: ");
            JTextField poleTekstowe1 = new JTextField("10");
            JButton wyczyscPolaPrzycisk = new JButton("Wyczyść pola");
            JButton zmienWalutePrzycisk = new JButton("Konwertuj!");
            glownyPanel.add(tekst1);
            glownyPanel.add(poleTekstowe1);
            glownyPanel.add(wyczyscPolaPrzycisk);
            glownyPanel.add(zmienWalutePrzycisk);



            obramowanie.getContentPane().add(BorderLayout.NORTH,menuWyboru);
            obramowanie.getContentPane().add(BorderLayout.PAGE_END,glownyPanel);
            obramowanie.setVisible(true);

        }
    }
}
