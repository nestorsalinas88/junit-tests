package java;

import org.junit.Test;
import static org.junit.Assert.*;

public class CodeupCryptTests {
    @Test
    public void testHasPasswordAndHash(){
        CodeupCrypt crypt = new CodeupCrypt();
        assertNotEquals(crypt.getPassword, "");
        assertNotEquals(crypt.getHash, "");
    }
}