import java.awt.*;
import java.util.Random;

public class Star extends Rectangle {
    private int z;
    private int diameter = 2;
    Random random;
    Star(int x, int y, int z){
        super();
        random = new Random();
        this.x = random.nextInt(x);
        this.y = random.nextInt(y);
        this.z = z;
    }
    public void introduce_myself(){
        System.out.println("Position x:"+ this.x + ", Positon y: "+ this.y);
    }
    public void draw(Graphics g){
        g.setColor(Color.WHITE);
        g.fillOval(this.x,this.y,this.diameter,this.diameter);
    }
}
