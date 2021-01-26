import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyPanel CosmosPanel;
    MyFrame(){
        CosmosPanel = new MyPanel();
        this.add(CosmosPanel);
        this.setTitle("Milkyway");
        this.setBackground(Color.BLACK);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
    public double map( double number,int a, int b, int c, int d){
        return c + (double)(d-c)/(b-a)*(double)(number-a);
    }
    public static void main(String [] args){
        MyFrame frame = new MyFrame();
    }
}
