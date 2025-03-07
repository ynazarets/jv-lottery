package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final ColorSupplier cs = new ColorSupplier();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(cs.getRandomColor());
        ball.setNumber(new Random().nextInt(100));
        return ball;
    }
}
