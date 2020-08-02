import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    private static final double PI = Math.PI;

    @Test
    public void shouldCountCircleArea(){
        double radius = 3;
        Circle circle = new Circle(3);
        assertEquals(PI*radius*radius,circle.countArea());
    }

}