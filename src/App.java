import processing.core.*;

public class App extends PApplet {
    public static void main(String[] args) {
        PApplet.main("App");
    }

    float ystart = 800;
    float xstart = 800;
    float squareStart = 803;
    
    float squareY = 803;
    float squareX = 803;
    float x = 800;
    float y = 800;
    double squareSpeed = 2.5;
    boolean left, up, down, right;

    public void setup() {

    }

    public void settings() {
        size(900, 900);
    }

    public void draw() {
        background(12, 63, 143);
        fill(255);
        rect(790, 850, 60, -800);
        rect(790, 50, -200, 45);
        triangle(650, 50, 450, 2500, 250, 50);
        
        noStroke();
        fill(0);
        rect(x, y, 40, 40);
        
        fill(0, 120, 209);
        rect(squareX, squareY, 34, 34);

        if (left == true) {
            squareX -= squareSpeed;
            x -= squareSpeed;
        }
        if (up == true) {
            squareY -= squareSpeed;
            y -= squareSpeed;
        }
        if (down == true) {
            squareY += squareSpeed;
            y += squareSpeed;
        }
        if (right == true) {
            squareX += squareSpeed;
            x += squareSpeed;
        }

        int currentColor = get((int) x, (int) y);

        currentColor = get((int) x, (int) (y - upSize / 2));
        if (red(currentColor) == 12 && green(currentColor) == 63 && blue(currentColor) == 143) {
            x = xstart;
            y = ystart;
            squareX = squareStart;
            squareY = squareStart;
        }
        currentColor = get((int) x, (int) (y + downSize / 2));
        if (red(currentColor) == 12 && green(currentColor) == 63 && blue(currentColor) == 143) {
            x = xstart;
            y = ystart;
            squareX = squareStart;
            squareY = squareStart;
        }
        currentColor = get((int) (x - leftSize / 2), (int) y);
        if (red(currentColor) == 12 && green(currentColor) == 63 && blue(currentColor) == 143) {
            x = xstart;
            y = ystart;
            squareX = squareStart;
            squareY = squareStart;
        }
        currentColor = get((int) (x + rightSize / 2), (int) y);
        if (red(currentColor) == 12 && green(currentColor) == 63 && blue(currentColor) == 143) {
            x = xstart;
            y = ystart;
            squareX = squareStart;
            squareY = squareStart;
        }
    }

    public void keyPressed() {
        if (keyCode == UP) {
            up = true;
        } else if (keyCode == DOWN) {
            down = true;
        } else if (keyCode == LEFT) {
            left = true;
        } else if (keyCode == RIGHT) {
            right = true;
        }
    }

    public void keyReleased() {
        if (keyCode == UP) {
            up = false;
        } else if (keyCode == DOWN) {
            down = false;
        } else if (keyCode == LEFT) {
            left = false;
        } else if (keyCode == RIGHT) {
            right = false;
        }
    }
}
