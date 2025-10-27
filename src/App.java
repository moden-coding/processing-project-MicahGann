import processing.core.*;

public class App extends PApplet {
    public static void main(String[] args) {
        PApplet.main("App");
    }

    float ystart = 800;
    float xstart = 800;
    float squareStart = 803;
    float enemyX = 700;
    float enemy2X = 700;
    float enemy3X = 700;
    float enemy4X = 700;
    float enemyY = 200;
    float enemy2Y = 300;
    float enemy3Y = 400;
    float enemy4Y = 500;
    float enemyX2 = 700;
    float enemy2X2 = 700;
    float enemy3X2 = 700;
    float enemy4X2 = 700;
    float enemyY2 = 200;
    float enemy2Y2 = 300;
    float enemy3Y2 = 400;
    float enemy4Y2 = 500;
    float enemyX3 = 700;
    float enemy2X3 = 700;
    float enemy3X3 = 700;
    float enemy4X3 = 700;
    float enemyY3 = 200;
    float enemy2Y3 = 300;
    float enemy3Y3 = 400;
    float enemy4Y3 = 500;
    float squareY = 803;
    float squareX = 803;
    float x = 800;
    float y = 800;
    double squareSpeed = 4;
    boolean left, up, down, right;
    int startTime = 500;
    int delay = 200;
    int delay2 = 0; 
    int delay3 = -200;
    int delay4 = -400;


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
        enemyX = enemyX - 3;

        fill(12, 63, 143);
        circle(enemy2X, enemy2Y, 15);
        enemy2X = enemy2X - 3;

        fill(12, 63, 143);
        circle(enemy3X, enemy3Y, 15);
        enemy3X = enemy3X - 3;

        fill(12, 63, 143);
        circle(enemy4X, enemy4Y, 15);
        enemy4X = enemy4X - 3;

        fill(12, 63, 143);
        circle(enemyX2, enemyY2, 15);
        enemyX2 = enemyX2 - 3;

        fill(12, 63, 143);
        circle(enemy2X2, enemy2Y2, 15);
        enemy2X2 = enemy2X2 - 3;

        fill(12, 63, 143);
        circle(enemy3X2, enemy3Y2, 15);
        enemy3X2 = enemy3X2 - 3;

        fill(12, 63, 143);
        circle(enemy4X2, enemy4Y2, 15);
        enemy4X2 = enemy4X2 - 3;

        fill(12, 63, 143);
        circle(enemyX3, enemyY3, 15);
        enemyX3 = enemyX3 - 3;

        fill(12, 63, 143);
        circle(enemy2X3, enemy2Y3, 15);
        enemy2X3 = enemy2X3 - 3;

        fill(12, 63, 143);
        circle(enemy3X3, enemy3Y3, 15);
        enemy3X3 = enemy3X3 - 3;

        fill(12, 63, 143);
        circle(enemy4X3, enemy4Y3, 15);
        enemy4X3 = enemy4X3 - 3;

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

        if (startTime > millis()) {
            circle(enemyX, enemyY, 15);
            enemyX = enemyX - 3;
        }
        if (startTime + 500 > millis()) {
            circle(enemy2X, enemy2Y, 15);
            enemy2X = enemy2X - 3;
        }
        if (startTime > millis()) {
            circle(enemy3X, enemy3Y, 15);
            enemy3X = enemy3X - 3;
        }
        if (startTime + 500 > millis()) {
            circle(enemy4X, enemy4Y, 15);
            enemy4X = enemy4X - 3;
        }
        if (startTime + 750 > millis()) {
            circle(enemyX2, enemyY2, 15);
            enemyX2 = enemyX2 - 3;
        }
        if (startTime + 1000 > millis()) {
            circle(enemy2X2, enemy2Y2, 15);
            enemy2X2 = enemy2X2 - 3;
        }
        if (startTime + 750 > millis()) {
            circle(enemy3X2, enemy3Y2, 15);
            enemy3X2 = enemy3X2 - 3;
        }
        if (startTime + 1000 > millis()) {
            circle(enemy4X2, enemy4Y2, 15);
            enemy4X2 = enemy4X2 - 3;
        }
        if (startTime + 1250 > millis()) {
            circle(enemyX3, enemyY3, 15);
            enemyX3 = enemyX3 - 3;
        }
        if (startTime + 1500 > millis()) {
            circle(enemy2X3, enemy2Y3, 15);
            enemy2X3 = enemy2X3 - 3;
        }
        if (startTime + 1250 > millis()) {
            circle(enemy3X3, enemy3Y3, 15);
            enemy3X3 = enemy3X3 - 3;
        }
        if (startTime + 1500 > millis()) {
            circle(enemy4X3, enemy4Y3, 15);
            enemy4X3 = enemy4X3 - 3;
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

        startTime = millis();
    }

    public void enemy() {
        if (enemyX <= 200) {
            enemyX = 700;
            enemyY = 200;
        }
        if (enemy2X <= 200) {
            enemy2X = 700;
            enemy2Y = 300;
        }
        if (enemy3X <= 200) {
            enemy3X = 700;
            enemy3Y = 400;
        }
        if (enemy4X <= 200) {
            enemy4X = 700;
            enemy4Y = 500;
        }
        if (enemyX2 <= 200) {
            enemyX2 = 700;
            enemyY2 = 200;
        }
        if (enemy2X2 <= 200) {
            enemy2X2 = 700;
            enemy2Y2 = 300;
        }
        if (enemy3X2 <= 200) {
            enemy3X2 = 700;
            enemy3Y2 = 400;
        }
        if (enemy4X2 <= 200) {
            enemy4X2 = 700;
            enemy4Y2 = 500;
        }
        if (enemyX3 <= 200) {
            enemyX3 = 700;
            enemyY3 = 200;
        }
        if (enemy2X3 <= 200) {
            enemy2X3 = 700;
            enemy2Y3 = 300;
        }
        if (enemy3X3 <= 200) {
            enemy3X3 = 700;
            enemy3Y3 = 400;
        }
        if (enemy4X3<= 200) {
            enemy4X3 = 700;
            enemy4Y3 = 500;
        }
    }
}
