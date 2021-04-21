import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;
public class BirdSanctuaryTest {
    BirdSanctuary sanctuary = BirdSanctuary.getInstance();

    @Test
    public void addTest() {
        Duck duck = new Duck();
        sanctuary.addBird(duck);
        int count = duck.getCount();
        Assertions.assertEquals(1, count);
    }

    @Test
    public void addTestCase2() {
        ExpectedException exceptionRule = ExpectedException.none();
        exceptionRule.expect(BirdSanctuaryAddException.class);
        sanctuary.addBird(null);
    }

}
