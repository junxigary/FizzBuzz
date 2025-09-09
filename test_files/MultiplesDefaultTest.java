package lab1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*
  Test for overloading multiples.
 */
public class MultiplesDefaultTest {

    @Test
    public void testDefault() {
        assertEquals(466,
                Multiples.multiples(1000,3,5),
                "Multiples.multiples() is incorrect for default values");
    }

}