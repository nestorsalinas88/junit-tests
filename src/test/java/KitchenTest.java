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
        assertSame(0, emptyKitchen.size());
        assertSame(1, kitchenWithOne.size());
        // Testing sizes is tricky set boundaries is always a good idea
        // test 0, 1 and many (!2)
        assertSame(4, kitchenWithMany.size());
    }

    @Test
    public void testAdd(){
        Kitchen kitchen = new Kitchen();
        assertTrue(kitchen.isEmpty());
        kitchen.add("white corn");
        assertFalse(kitchen.isEmpty());
        assertTrue(kitchen.contains("white corn"));
        assertSame(1, kitchen.size());
    }

    @Test
    public void testRemove(){
        kitchenWithOne.pop();
        assertTrue(kitchenWithOne.isEmpty());
        assertFalse(kitchenWithOne.contains("white corn"));
        assertSame(0, kitchenWithOne.size());
    }

}
