import javax.swing.*;
import java.awt.*;


public class rectangle extends JFrame {
    private int x,y ;


    rectangle(int x, int y) {
        this.x =x ;
        this.y = y;
        setBounds(20,30,300,200); // granice ramki i wyswietlanie na ekranie
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //zamkniecie programu
        setFocusable(true); // pobieranie sygnałów z klawiatury
        setFocusTraversalKeysEnabled(false); //wylaczenie klawiszy esc... etc
        setVisible(true);

    }
public void drawRectangle (Graphics g) {
        g.drawRect(30,40,this.x,this.y);
        g.setColor( new Color(255,0,0));
        g.fillRect(30,40,this.x,this.y);

}

    @Override
    public void paint(Graphics g) {
        drawRectangle(g);
    }
}
