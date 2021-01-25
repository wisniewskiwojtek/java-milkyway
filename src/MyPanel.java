import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class MyPanel extends JPanel implements Runnable {

    static int PANEL_WIDTH = 600;
    static int PANEL_HEIGHT = 400;
    static int STARS_AMOUNT = 100;
    static int DEPTH = 1000;
    static Dimension dimension = new Dimension(PANEL_WIDTH, PANEL_HEIGHT);
    Random random;
    Thread milkywayThread;
    Image image;
    Graphics graphics;
    Star [] stars;
    MyPanel() {
        this.setPreferredSize(dimension);
        initialize_stars(STARS_AMOUNT);
        this.setVisible(true);
        this.milkywayThread = new Thread(this);
        milkywayThread.start();
    }
    public void paint(Graphics g) {

        image = createImage(getWidth(),getHeight());

        graphics = image.getGraphics();

        draw(graphics);

        g.drawImage(image,0,0,this);

    }
    public void draw(Graphics g){
//        System.out.println(getStars().length);
        for(Star star: stars){
            star.draw(g);
        }
    }
    public void initialize_stars(int stars_amount){
        stars = new Star[stars_amount];
        for(int i=0;i<stars_amount;i++){
            stars[i] = new Star(PANEL_WIDTH,PANEL_HEIGHT,DEPTH);
            stars[i].introduce_myself();
        }
    }
    public Star[] getStars(){
        return stars;
    }



    @Override
    public void run() {
    }
}
