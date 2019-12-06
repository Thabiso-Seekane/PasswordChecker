
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class passwordCheckerTest {

    @Test
    void password() {
        passwordchecker pass = new passwordchecker();
        boolean tester = pass.funcPassword("Thabiso088#");
        assertTrue(tester);




    }
}