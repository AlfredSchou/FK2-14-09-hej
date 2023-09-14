import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    void testEmptyQ(){

        ShortQueue q = new ShortQueue();
        assertEquals(null, q.take());
        assertEquals(false, q.isFull());
    }
}
