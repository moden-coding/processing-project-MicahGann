import processing.core.*;

public class App extends PApplet {
    public static void main(String[] args) {
        PApplet.main("App");
    }

    float ystart = 800;
    float xstart = 800;
    float squareStart = 803;
    float enemyX = 700;
    float enemyY = 200;
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
        fill(12, 63, 143);
        circle(enemyX, enemyY, 15);
        enemyX = enemyX - 9;
        
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

        int topColor = get((int) (x + 20), (int) (y));
        int bottomColor = get((int) (x + 20), (int) (y + 40));
        int leftColor = get((int) (x), (int) (y + 20));
        int rightColor = get((int) (x + 40), (int) (y + 20));

        int red = 12, green = 63, blue = 143;
        enemy();

        if ((red(topColor) == red && green(topColor) == green && blue(topColor) == blue) ||
                (red(bottomColor) == red && green(bottomColor) == green && blue(bottomColor) == blue) ||
                (red(leftColor) == red && green(leftColor) == green && blue(leftColor) == blue) ||
                (red(rightColor) == red && green(rightColor) == green && blue(rightColor) == blue)) {

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

    public void enemy(){
        if(enemyX <= 200){
            enemyX = 700;
            enemyY = 200;
        }
    }

    public boolean checkOver(int x, int y){
        if (checkOver(enemyX, enemyY)) {
            
        }
    }
}
