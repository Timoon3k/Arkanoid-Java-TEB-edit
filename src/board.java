import java.awt.*;

public class board {
    private int ouija[][] ;
    private int brickHeight ;
    private int brickWidth ;

board(int boardHeight , int boardWidth) {
ouija = new int[boardHeight][boardWidth] ;
for (int i = 0 ; i < boardHeight ; i++) {
    for (int j=0 ; j <boardWidth ; j++) {
        ouija[i][j] = 1;
    }
}

brickHeight =  500/boardHeight ;
brickWidth = 800/boardWidth ;

}

public void drawBoard (Graphics g) {
    for (int i = 0; i < ouija.length; i++) {
        for (int j = 0; j < ouija.length; j++) {
            g.setColor(new Color(238, 168, 208));
            g.drawRect(40 + i*brickWidth ,50 + j*brickHeight , brickWidth , brickHeight);

        }

    }

}


}
