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
    float enemyX4 = 700;
    float enemy2X4 = 700;
    float enemy3X4 = 700;
    float enemy4X4 = 700;
    float enemyY4 = 200;
    float enemy2Y4 = 300;
    float enemy3Y4 = 400;
    float enemy4Y4 = 500;
    float enemyX5 = 700;
    float enemy2X5 = 700;
    float enemy3X5 = 700;
    float enemy4X5 = 700;
    float enemyY5 = 200;
    float enemy2Y5 = 300;
    float enemy3Y5 = 400;
    float enemy4Y5 = 500;
    float enemyX6 = 700;
    float enemy2X6 = 700;
    float enemy3X6 = 700;
    float enemy4X6 = 700;
    float enemyY6 = 200;
    float enemy2Y6 = 300;
    float enemy3Y6 = 400;
    float enemy4Y6 = 500;
    float squareY = 803;
    float squareX = 803;
    float x = 800;
    float y = 800;
    double squareSpeed = 4;
    boolean left, up, down, right;
    int startTime = 500;

    public void setup() {

    }

    public void settings() {
        size(900, 900);
        startTime = millis();
    }

    public void draw() {
        background(12, 63, 143);
        fill(255);
        rect(790, 850, 60, -800);
        rect(790, 50, -200, 45);
        triangle(650, 50, 450, 2500, 250, 50);
        rect(400, 700, -200, 45);

        noStroke();
        fill(0);
        rect(x, y, 40, 40);

        fill(0, 120, 209);
        rect(squareX, squareY, 34, 34);

        
        enemy();
        enemyTime();
        enemyDraw();
        

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

        colorDetector();
    }

    public void enemyDraw() {
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

        fill(12, 63, 143);
        circle(enemyX4, enemyY4, 15);
        enemyX4 = enemyX4 - 3;

        fill(12, 63, 143);
        circle(enemy2X4, enemy2Y4, 15);
        enemy2X4 = enemy2X4 - 3;

        fill(12, 63, 143);
        circle(enemy3X4, enemy3Y4, 15);
        enemy3X4 = enemy3X4 - 3;

        fill(12, 63, 143);
        circle(enemy4X4, enemy4Y4, 15);
        enemy4X4 = enemy4X4 - 3;

        fill(12, 63, 143);
        circle(enemyX5, enemyY5, 15);
        enemyX5 = enemyX5 - 3;

        fill(12, 63, 143);
        circle(enemy2X5, enemy2Y5, 15);
        enemy2X5 = enemy2X5 - 3;

        fill(12, 63, 143);
        circle(enemy3X5, enemy3Y5, 15);
        enemy3X5 = enemy3X5 - 3;

        fill(12, 63, 143);
        circle(enemy4X5, enemy4Y5, 15);
        enemy4X5 = enemy4X5 - 3;

        fill(12, 63, 143);
        circle(enemyX6, enemyY6, 15);
        enemyX6 = enemyX6 - 3;

        fill(12, 63, 143);
        circle(enemy2X6, enemy2Y6, 15);
        enemy2X6 = enemy2X6 - 3;

        fill(12, 63, 143);
        circle(enemy3X6, enemy3Y6, 15);
        enemy3X6 = enemy3X6 - 3;

        fill(12, 63, 143);
        circle(enemy4X6, enemy4Y6, 15);
        enemy4X6 = enemy4X6 - 3;
    }

    public void colorDetector() {
        int topColor = get((int) (x + 20), (int) (y));
        int bottomColor = get((int) (x + 20), (int) (y + 40));
        int leftColor = get((int) (x), (int) (y + 20));
        int rightColor = get((int) (x + 40), (int) (y + 20));

        int red = 12, green = 63, blue = 143;

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

    public void enemyTime() {
        if (startTime + 250 > millis()) {
            circle(enemyX, enemyY, 15);
            enemyX = enemyX - 3;
        }
        if (startTime + 500 > millis()) {
            circle(enemy2X, enemy2Y, 15);
            enemy2X = enemy2X - 3;
        }
        if (startTime + 250 > millis()) {
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
        if (startTime + 1750 > millis()) {
            circle(enemyX4, enemyY4, 15);
            enemyX4 = enemyX4 - 3;
        }
        if (startTime + 2000 > millis()) {
            circle(enemy2X4, enemy2Y4, 15);
            enemy2X4 = enemy2X4 - 3;
        }
        if (startTime + 1750 > millis()) {
            circle(enemy3X4, enemy3Y4, 15);
            enemy3X4 = enemy3X4 - 3;
        }
        if (startTime + 2000 > millis()) {
            circle(enemy4X4, enemy4Y4, 15);
            enemy4X4 = enemy4X4 - 3;
        }
        if (startTime + 2250 > millis()) {
            circle(enemyX5, enemyY5, 15);
            enemyX5 = enemyX5 - 3;
        }
        if (startTime + 2500 > millis()) {
            circle(enemy2X5, enemy2Y5, 15);
            enemy2X5 = enemy2X5 - 3;
        }
        if (startTime + 2250 > millis()) {
            circle(enemy3X5, enemy3Y5, 15);
            enemy3X5 = enemy3X5 - 3;
        }
        if (startTime + 2500 > millis()) {
            circle(enemy4X5, enemy4Y5, 15);
            enemy4X5 = enemy4X5 - 3;
        }
        if (startTime + 2750 > millis()) {
            circle(enemyX6, enemyY6, 15);
            enemyX6 = enemyX6 - 3;
        }
        if (startTime + 3000 > millis()) {
            circle(enemy2X6, enemy2Y6, 15);
            enemy2X6 = enemy2X6 - 3;
        }
        if (startTime + 2750 > millis()) {
            circle(enemy3X6, enemy3Y6, 15);
            enemy3X6 = enemy3X6 - 3;
        }
        if (startTime + 3000 > millis()) {
            circle(enemy4X6, enemy4Y6, 15);
            enemy4X6 = enemy4X6 - 3;
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

    public void enemy() {
        if (enemyX <= 200) {
            enemyX = 700;
            enemyY = random(200, 500);
        }
        if (enemy2X <= 200) {
            enemy2X = 700;
            enemy2Y = random(200, 500);
        }
        if (enemy3X <= 200) {
            enemy3X = 700;
            enemy3Y = random(200, 500);
        }
        if (enemy4X <= 200) {
            enemy4X = 700;
            enemy4Y = random(200, 500);
        }
        if (enemyX2 <= 200) {
            enemyX2 = 700;
            enemyY2 = random(200, 500);
        }
        if (enemy2X2 <= 200) {
            enemy2X2 = 700;
            enemy2Y2 = random(200, 500);
        }
        if (enemy3X2 <= 200) {
            enemy3X2 = 700;
            enemy3Y2 = random(200, 500);
        }
        if (enemy4X2 <= 200) {
            enemy4X2 = 700;
            enemy4Y2 = random(200, 500);
        }
        if (enemyX3 <= 200) {
            enemyX3 = 700;
            enemyY3 = random(200, 500);
        }
        if (enemy2X3 <= 200) {
            enemy2X3 = 700;
            enemy2Y3 = random(200, 500);
        }
        if (enemy3X3 <= 200) {
            enemy3X3 = 700;
            enemy3Y3 = random(200, 500);
        }
        if (enemy4X3 <= 200) {
            enemy4X3 = 700;
            enemy4Y3 = random(200, 500);
        }
        if (enemyX4 <= 200) {
            enemyX4 = 700;
            enemyY4 = random(200, 500);
        }
        if (enemy2X4 <= 200) {
            enemy2X4 = 700;
            enemy2Y4 = random(200, 500);
        }
        if (enemy3X4 <= 200) {
            enemy3X4 = 700;
            enemy3Y4 = random(200, 500);
        }
        if (enemy4X4 <= 200) {
            enemy4X4 = 700;
            enemy4Y4 = random(200, 500);
        }
        if (enemyX5 <= 200) {
            enemyX5 = 700;
            enemyY5 = random(200, 500);
        }
        if (enemy2X5 <= 200) {
            enemy2X5 = 700;
            enemy2Y5 = random(200, 500);
        }
        if (enemy3X5 <= 200) {
            enemy3X5 = 700;
            enemy3Y5 = random(200, 500);
        }
        if (enemy4X5 <= 200) {
            enemy4X5 = 700;
            enemy4Y5 = random(200, 500);
        }
        if (enemyX6 <= 200) {
            enemyX6 = 700;
            enemyY6 = random(200, 500);
        }
        if (enemy2X6 <= 200) {
            enemy2X6 = 700;
            enemy2Y6 = random(200, 500);
        }
        if (enemy3X6 <= 200) {
            enemy3X6 = 700;
            enemy3Y6 = random(200, 500);
        }
        if (enemy4X6 <= 200) {
            enemy4X6 = 700;
            enemy4Y6 = random(200, 500);
        }
    }
}
