
import org.junit.jupiter.api.Assertions;

class MainTest {

    @org.junit.jupiter.api.Test
    void hypotenuse() {
        Assertions.assertEquals(
                5.0,
                Main.hypotenuse(3, 4)
        );
    }
}