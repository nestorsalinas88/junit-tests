import org.junit.Test;

import static junit.framework.TestCase.*;

public class KitchenTest {

    @Test
    public void testIsEmpty(){
        Kitchen emptyKitchen = new Kitchen();
        assertTrue(emptyKitchen.isEmpty());

        Kitchen kitchen = new Kitchen();
        kitchen.add("yellow corn");

        assertFalse(kitchen.isEmpty());
    }


    @Test
    public void testSize(){
        Kitchen emptyKitchen = new Kitchen();
        assertSame(0, emptyKitchen.tortillas.length);

        Kitchen kitchenWithOne = new Kitchen();
        kitchenWithOne.add("yellow corn");
        assertSame(1, kitchenWithOne.tortillas.length);

        // Testing sizes is tricky set boundaries is always a good idea
        // test 0, 1 and many (!2)

        Kitchen kitchenWithMany = new Kitchen();
        kitchenWithMany.add("blue corn");
        kitchenWithMany.add("yellow corn");
        kitchenWithMany.add("yellow corn");
        kitchenWithMany.add("white corn");

        assertSame(4, kitchenWithMany.tortillas.length);
    }
}
