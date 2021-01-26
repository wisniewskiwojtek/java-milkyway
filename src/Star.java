import java.awt.*;
import java.util.Random;
import java.math.*;

public class Star extends Rectangle {
    static int MIN_DIAMETER = 0;
    static int MAX_DIAMETER = 4;
    private int z;
    private int diameter;
    Random random;
    private int velocity, dx,dy;

    Star(int x, int y, int z){
        super();
        random = new Random();
        this.x = random.nextInt(x)-x/2;
        this.y = random.nextInt(y)-y/2;
        this.z = -random.nextInt(z);
        this.velocity = 10;
        this.setDiameter(z);

    }
    public void introduce_myself(){
        System.out.println("Position x:"+ this.x + ", Positon y: "+ this.y+ ", Position z: "+this.z+" ,Diameter: "+ this.diameter);
    }
    public void draw(Graphics g){
        g.setColor(Color.WHITE);
        g.fillOval(this.x,this.y,this.diameter,this.diameter);
    }
    public void move() {
        if (this.z < 0) {
            dx = velocity * this.x / z;
            dy = velocity * this.y / z;
            this.x = x - dx;
            this.y = y - dy;
            this.z = z + velocity;
        }
    }
    public double map(int number,int a, int b, int c, int d){
        return c + (double)(d-c)/(b-a)*(double)(number-a);
    }
    public void setDiameter(int depth){
        double temp = this.map(this.z,-depth,0,MIN_DIAMETER,MAX_DIAMETER);
        this.diameter= (int)(Math.round(temp));

    }
    public boolean checkBoundaries(int width,int heigth){
        //Returns false if star is out of boundaries
        if((Math.abs(this.x) > width/2) || (Math.abs(this.y)>heigth/2) ||(this.z>=0)){
            return false;
        } else{
            return true;
        }
    }

}
