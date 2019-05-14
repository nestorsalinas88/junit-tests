import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.*;

public class KitchenTest {

    private Kitchen emptyKitchen;
    private Kitchen kitchenWithOne;
    private Kitchen kitchenWithMany;

    @Before
    public void setUp(){
        emptyKitchen = new Kitchen();
        kitchenWithMany = new Kitchen();
        kitchenWithOne = new Kitchen();

        kitchenWithOne.add("white corn");

        kitchenWithMany.add("blue corn");
        kitchenWithMany.add("yellow corn");
        kitchenWithMany.add("yellow corn");
        kitchenWithMany.add("white corn");
    }

    @Test
    public void testIsEmpty(){
        assertTrue(emptyKitchen.isEmpty());
        assertFalse(kitchenWithOne.isEmpty());
    }


    @Test
    public void testSize(){
        assertSame(0, emptyKitchen.tortillas.length);
        assertSame(1, kitchenWithOne.tortillas.length);
        // Testing sizes is tricky set boundaries is always a good idea
        // test 0, 1 and many (!2)
        assertSame(4, kitchenWithMany.tortillas.length);
    }
}
