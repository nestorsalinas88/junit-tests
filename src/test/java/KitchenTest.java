import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class KitchenTest {

    @Test
    public void testIsEmpty(){
        Kitchen emptyKitchen = new Kitchen();
        assertTrue(emptyKitchen.isEmpty());

        Kitchen kitchen = new Kitchen();
        kitchen.add("yellow corn");

        assertFalse(kitchen.isEmpty());
    }
}
