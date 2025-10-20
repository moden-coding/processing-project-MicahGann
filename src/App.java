import processing.core.*;

public class App extends PApplet{
    public static void main(String[] args)  {
        PApplet.main("App");
    }

    public void setup(){
        
        
    }

    public void settings(){
        size(900, 900);
    }
    float squareY = 800;
    float squareX = 800;
    
    public void draw(){
       background(12, 63, 143);
       fill(255);
        rect(790, 850, 60, -800);
        fill(255);
        rect(790, 50, -200, 45);
        fill(255);
        triangle(X, Y, X, Y, X, Y);
        fill(12, 63, 143);
        rect(squareX, squareY, 40, 40);
        noStroke();
    }
    public void keyPressed(){
        if (keyCode == UP) {
            squareY = squareY - 1;
        } else if (keyCode == DOWN) {
            squareY = squareY + 1;
        }
    }
}
