import javax.swing.*;
import java.awt.*;

//Klasa Kontrolna
public class gameplay extends JFrame {
private int height ;
private int width ;

    gameplay(int height, int width) {
        this.height = height ;
        this.width = width;
        setBounds(20,30, this.width , this.height); // granice ramki i wyswietlanie na ekranie
        setBackground(Color.BLACK);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //zamkniecie programu
        setFocusable(true); // pobieranie sygnałów z klawiatury
        setFocusTraversalKeysEnabled(false); //wylaczenie klawiszy esc... etc
        setVisible(true);

    }

    @Override
    public void paint(Graphics g) {
      board board = new board(300, 400) ;
      board.drawBoard(g);
    }
}
