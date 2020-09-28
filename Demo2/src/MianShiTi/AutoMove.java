package MianShiTi;

import java.awt.*;
import java.awt.event.InputEvent;
import java.util.Random;

public class AutoMove {

    static Random R = new Random();

    public static void main(String[] args) throws AWTException {
        Robot robot = new Robot();
        while (true) {
            robot.delay(getRandomNumber(30_000));
            robot.mouseMove(400, 300);


            robot.delay(getRandomNumber(30_000));
//            robot.mousePress(InputEvent.BUTTON1_MASK);
//            robot.mouseRelease(InputEvent.BUTTON1_MASK);


            robot.delay(getRandomNumber(30_000));
            robot.mouseMove(500, 400);


            robot.delay(getRandomNumber(30_000));
            robot.mouseMove(700, 400);


            robot.delay(getRandomNumber(30_000));
            robot.mouseMove(600, 400);


            robot.delay(getRandomNumber(30_000));
            robot.mouseMove(400, 200);
        }
    }

    private static int getRandomNumber(int i) {
        return R.nextInt(i) + 30_000;
    }

}
