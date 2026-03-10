
import static org.junit.jupiter.api.Assertions.*;

import com.kovanlabsintern.javaweektask.UnitTesting.Mage;
import com.kovanlabsintern.javaweektask.UnitTesting.*;
import org.junit.jupiter.api.Test;

class WarriorTest {

    @Test
    void testHealthNotNegative() {

        Warrior warrior = new Warrior(500, 20, 2);
        Mage mage = new Mage(500, 30);

        for(int i = 0; i < 50; i++) {
            mage.attack(warrior);
        }

        assertTrue(warrior.getHealth() >= 0);
    }
}