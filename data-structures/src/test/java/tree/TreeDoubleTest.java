package tree;

import org.junit.Test;

public class TreeDoubleTest {

    @Test
    public void testFbt() {
        TreeDouble td = new TreeDouble();
        td.add(1);
        td.add(2);
        td.add(3);
        td.add(4);
        td.inOrderPrint(td.node);
//        Node xx = td.doubleValueNewTree(td.node);
//        td.doubleValueInPlace(td.node);
//        td.inOrderPrint(xx);
    }
}
