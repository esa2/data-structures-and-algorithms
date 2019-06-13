package code.challenges;

import org.junit.Test;
import static org.junit.Assert.*;

public class MultiBracketValidationTest {

    @Test
    public void Multi() {
       MultiBracketValidation.multiBracketValidation("finally");
    }

    @Test
    public void MultiTestOne() {
        assertTrue("Should return true",MultiBracketValidation.multiBracketValidation("{}"));
    }

    @Test
    public void MultiTestTwo() {
        assertTrue("Should return true",MultiBracketValidation.multiBracketValidation("{}(){}"));
    }

    @Test
    public void MultiTestThree() {
        assertTrue("Should return true",MultiBracketValidation.multiBracketValidation("()[[Extra Characters]]"));
    }

    @Test
    public void MultiTestFour() {
        assertTrue("Should return true",MultiBracketValidation.multiBracketValidation("(){}[[]]"));
    }

    @Test
    public void MultiTestFive() {
        assertTrue("Should return true",MultiBracketValidation.multiBracketValidation("{}{Code}[Fellows](())"));
    }

    @Test
    public void MultiTestSix() {
        assertFalse("Should return false",MultiBracketValidation.multiBracketValidation("[({}]"));
    }

    @Test
    public void MultiTestSeven() {
        assertFalse("Should return false",MultiBracketValidation.multiBracketValidation("(]("));
    }

    @Test
    public void MultiTestEight() {
        assertFalse("Should return false",MultiBracketValidation.multiBracketValidation("{(})"));
    }
}
