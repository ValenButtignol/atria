import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) 'a');
        binomialHeap0.insert((int) (byte) 10);
        binomialHeap0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) 'a');
        binomialHeap0.insert((int) (byte) 100);
        binomialHeap0.insert((int) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) 'a');
        binomialHeap0.insert((int) (byte) 10);
        binomialHeap0.decreaseKeyValue(10, 0);
        binomialHeap0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) 'a');
        binomialHeap0.insert((int) (byte) 10);
        binomialHeap0.decreaseKeyValue((int) (short) 0, (int) '4');
        binomialHeap0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) 'a');
        binomialHeap0.insert((int) (byte) 10);
        int int7 = binomialHeap0.findMinimum();
        int int8 = binomialHeap0.findMinimum();
        binomialHeap0.decreaseKeyValue((-1), (int) (byte) 0);
        binomialHeap0.insert((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) 'a');
        binomialHeap0.insert((int) (byte) 10);
        int int7 = binomialHeap0.findMinimum();
        binomialHeap0.insert((int) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) (byte) 10);
        binomialHeap0.insert((int) (short) 100);
        binomialHeap0.insert((int) (byte) 10);
        binomialHeap0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) 'a');
        binomialHeap0.insert((int) (byte) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        binomialHeap0.decreaseKeyValue((int) (short) 10, (int) (byte) 10);
        binomialHeap0.insert((int) (byte) 1);
        binomialHeap0.insert((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) 'a');
        binomialHeap0.insert((int) (byte) 10);
        binomialHeap0.decreaseKeyValue((int) (short) 0, (int) '4');
        binomialHeap0.insert((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) 'a');
        binomialHeap0.decreaseKeyValue(52, (int) (byte) -1);
        binomialHeap0.insert(97);
        binomialHeap0.delete(52);
        binomialHeap0.insert(97);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) 'a');
        binomialHeap0.insert((int) (byte) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeap0.extractMin();
        binomialHeap0.delete((int) (short) 0);
        binomialHeap0.insert(0);
        binomialHeap0.insert((int) ' ');
        binomialHeap0.insert((int) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) 'a');
        binomialHeap0.decreaseKeyValue(52, (int) (byte) -1);
        binomialHeap0.insert(97);
        binomialHeap0.delete(52);
        int int12 = binomialHeap0.findMinimum();
        binomialHeap0.insert((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) 'a');
        binomialHeap0.insert((int) (byte) 10);
        int int7 = binomialHeap0.findMinimum();
        int int8 = binomialHeap0.findMinimum();
        binomialHeap0.insert((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) 'a');
        binomialHeap0.delete((int) ' ');
        binomialHeap0.insert((int) 'a');
        system.testclass.BinomialHeap binomialHeap9 = new system.testclass.BinomialHeap();
        binomialHeap9.delete((int) 'a');
        binomialHeap9.insert((int) 'a');
        binomialHeap9.delete((int) ' ');
        binomialHeap9.delete((int) 'a');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode19 = new system.testclass.BinomialHeap.BinomialHeapNode((int) (byte) 0);
        binomialHeap9.decreaseKeyNode(binomialHeapNode19, (int) '4');
        binomialHeap0.decreaseKeyNode(binomialHeapNode19, (int) (byte) 1);
        binomialHeap0.insert((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) 'a');
        binomialHeap0.insert((int) (byte) 10);
        binomialHeap0.decreaseKeyValue((int) (short) 0, (int) '4');
        int int10 = binomialHeap0.findMinimum();
        binomialHeap0.insert((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) (byte) 10);
        binomialHeap0.insert((int) (short) 100);
        binomialHeap0.insert(2);
        binomialHeap0.decreaseKeyValue(1, (int) (byte) 1);
        binomialHeap0.insert((int) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) 'a');
        binomialHeap0.insert((int) (byte) 10);
        int int7 = binomialHeap0.findMinimum();
        binomialHeap0.decreaseKeyValue((int) (short) 1, (int) ' ');
        binomialHeap0.insert((int) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) (byte) 10);
        binomialHeap0.insert((int) (short) 100);
        binomialHeap0.insert((int) (byte) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode8 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '4');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode9 = binomialHeapNode8.getSibling();
        int int10 = binomialHeapNode8.size();
        int int11 = binomialHeapNode8.getDegree();
        int int12 = binomialHeapNode8.getDegree();
        int int13 = binomialHeapNode8.getDegree();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode14 = binomialHeapNode8.getSibling();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode15 = binomialHeapNode8.getParent();
        binomialHeap0.decreaseKeyNode(binomialHeapNode8, (int) (byte) 1);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode19 = new system.testclass.BinomialHeap.BinomialHeapNode((int) (short) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode20 = binomialHeapNode19.getChild();
        int int21 = binomialHeapNode19.getDegree();
        binomialHeap0.decreaseKeyNode(binomialHeapNode19, (-1));
        binomialHeap0.insert((int) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) 'a');
        binomialHeap0.insert((int) (byte) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeap0.extractMin();
        binomialHeap0.delete((int) (short) 0);
        binomialHeap0.insert(1);
        int int13 = binomialHeap0.findMinimum();
        binomialHeap0.decreaseKeyValue(0, (int) (byte) 10);
        binomialHeap0.decreaseKeyValue(0, (int) '4');
        binomialHeap0.insert(52);
        binomialHeap0.insert((int) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) 'a');
        binomialHeap0.insert((int) (byte) 10);
        int int7 = binomialHeap0.findMinimum();
        binomialHeap0.decreaseKeyValue((int) (short) 1, (int) ' ');
        int int11 = binomialHeap0.findMinimum();
        binomialHeap0.insert(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) 'a');
        binomialHeap0.delete((int) ' ');
        int int7 = binomialHeap0.findMinimum();
        binomialHeap0.insert(97);
        int int10 = binomialHeap0.findMinimum();
        binomialHeap0.insert((int) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) 'a');
        binomialHeap0.insert((int) (byte) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeap0.extractMin();
        binomialHeap0.delete((int) (short) 0);
        binomialHeap0.insert(1);
        int int13 = binomialHeap0.findMinimum();
        int int14 = binomialHeap0.findMinimum();
        binomialHeap0.decreaseKeyValue((int) (byte) 1, (int) (byte) 0);
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert(1);
        system.testclass.BinomialHeap binomialHeap22 = new system.testclass.BinomialHeap();
        binomialHeap22.delete((int) 'a');
        binomialHeap22.insert((int) 'a');
        binomialHeap22.insert((int) (byte) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode29 = binomialHeap22.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode30 = binomialHeap22.extractMin();
        int int31 = binomialHeapNode30.getKey();
        binomialHeap0.decreaseKeyNode(binomialHeapNode30, 52);
        binomialHeap0.insert((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) 'a');
        binomialHeap0.delete((int) ' ');
        int int7 = binomialHeap0.findMinimum();
        binomialHeap0.insert(97);
        binomialHeap0.insert((int) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) 'a');
        binomialHeap0.insert((int) (byte) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        binomialHeap0.decreaseKeyValue((int) (short) 10, (int) (byte) 10);
        binomialHeap0.insert((int) (byte) 1);
        binomialHeap0.delete((int) (byte) 0);
        binomialHeap0.insert(10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) 'a');
        binomialHeap0.insert((int) (byte) 10);
        system.testclass.BinomialHeap binomialHeap7 = new system.testclass.BinomialHeap();
        binomialHeap7.delete((int) 'a');
        binomialHeap7.insert((int) 'a');
        binomialHeap7.insert((int) (byte) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode14 = binomialHeap7.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode15 = binomialHeapNode14.getParent();
        binomialHeap0.decreaseKeyNode(binomialHeapNode14, 1);
        binomialHeap0.insert((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) 'a');
        binomialHeap0.insert((int) (byte) 10);
        int int7 = binomialHeap0.findMinimum();
        int int8 = binomialHeap0.findMinimum();
        binomialHeap0.delete((int) (short) -1);
        binomialHeap0.insert(100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) (byte) 10);
        binomialHeap0.insert((int) (short) 100);
        binomialHeap0.insert((int) (byte) 10);
        int int7 = binomialHeap0.findMinimum();
        binomialHeap0.delete(52);
        binomialHeap0.insert(10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) 'a');
        binomialHeap0.insert((int) (byte) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeap0.extractMin();
        binomialHeap0.delete((int) (short) 0);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode12 = new system.testclass.BinomialHeap.BinomialHeapNode(0);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode13 = binomialHeapNode12.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode13, (int) '4');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode16 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) (short) -1);
        int int19 = binomialHeap0.findMinimum();
        binomialHeap0.delete((int) (byte) 100);
        binomialHeap0.insert(0);
        binomialHeap0.insert(97);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) 'a');
        binomialHeap0.insert((int) (byte) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        binomialHeap0.decreaseKeyValue((int) (byte) 10, (int) (byte) -1);
        binomialHeap0.insert(1);
        int int13 = binomialHeap0.findMinimum();
        binomialHeap0.insert((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) 'a');
        binomialHeap0.decreaseKeyValue(52, (int) (byte) -1);
        binomialHeap0.insert(97);
        binomialHeap0.delete(52);
        int int12 = binomialHeap0.findMinimum();
        binomialHeap0.insert((int) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) 'a');
        binomialHeap0.insert((int) (byte) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeap0.extractMin();
        binomialHeap0.delete((int) (short) 0);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode12 = new system.testclass.BinomialHeap.BinomialHeapNode(0);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode13 = binomialHeapNode12.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode13, (int) '4');
        binomialHeap0.insert((int) (short) 100);
        binomialHeap0.insert((int) 'a');
        binomialHeap0.insert((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) 'a');
        binomialHeap0.insert((int) (byte) 10);
        binomialHeap0.decreaseKeyValue((int) (byte) 0, 0);
        binomialHeap0.decreaseKeyValue(0, 97);
        int int13 = binomialHeap0.findMinimum();
        binomialHeap0.insert((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) 'a');
        binomialHeap0.insert((int) (byte) 10);
        int int7 = binomialHeap0.findMinimum();
        int int8 = binomialHeap0.findMinimum();
        binomialHeap0.decreaseKeyValue((-1), (int) (byte) 0);
        int int12 = binomialHeap0.findMinimum();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode14 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '4');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode15 = binomialHeapNode14.getSibling();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode16 = binomialHeapNode14.getSibling();
        int int17 = binomialHeapNode14.getDegree();
        int int18 = binomialHeapNode14.size();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode19 = binomialHeapNode14.getParent();
        binomialHeap0.decreaseKeyNode(binomialHeapNode14, (int) (byte) -1);
        binomialHeap0.insert((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) 'a');
        binomialHeap0.insert((int) (byte) 100);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode8 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '4');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode9 = binomialHeapNode8.getSibling();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode10 = binomialHeapNode8.getChild();
        int int11 = binomialHeapNode8.getKey();
        binomialHeap0.decreaseKeyNode(binomialHeapNode8, (int) (short) 1);
        system.testclass.BinomialHeap binomialHeap14 = new system.testclass.BinomialHeap();
        binomialHeap14.delete((int) 'a');
        binomialHeap14.insert((int) 'a');
        binomialHeap14.insert((int) (byte) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode21 = binomialHeap14.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode22 = binomialHeap14.extractMin();
        binomialHeap14.delete((int) (short) 0);
        binomialHeap14.insert(1);
        int int27 = binomialHeap14.findMinimum();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode29 = new system.testclass.BinomialHeap.BinomialHeapNode((int) 'a');
        int int30 = binomialHeapNode29.getKey();
        binomialHeap14.decreaseKeyNode(binomialHeapNode29, (int) '4');
        system.testclass.BinomialHeap binomialHeap33 = new system.testclass.BinomialHeap();
        binomialHeap33.delete((int) 'a');
        binomialHeap33.insert((int) 'a');
        binomialHeap33.insert((int) (byte) 10);
        binomialHeap33.decreaseKeyValue((int) (byte) 0, 0);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode43 = binomialHeap33.extractMin();
        int int44 = binomialHeapNode43.getDegree();
        binomialHeap14.decreaseKeyNode(binomialHeapNode43, 97);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode47 = binomialHeapNode43.getChild();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode48 = binomialHeapNode43.getParent();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode49 = binomialHeapNode43.getChild();
        binomialHeap0.decreaseKeyNode(binomialHeapNode43, (int) (short) -1);
        binomialHeap0.insert(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) 'a');
        binomialHeap0.decreaseKeyValue(52, (int) (byte) -1);
        binomialHeap0.insert(97);
        binomialHeap0.insert(52);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) 'a');
        binomialHeap0.insert((int) (byte) 10);
        binomialHeap0.delete(2);
        int int9 = binomialHeap0.findMinimum();
        system.testclass.BinomialHeap binomialHeap10 = new system.testclass.BinomialHeap();
        binomialHeap10.delete((int) 'a');
        binomialHeap10.insert((int) 'a');
        binomialHeap10.insert((int) (byte) 10);
        binomialHeap10.decreaseKeyValue((int) (byte) 0, 0);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode20 = binomialHeap10.extractMin();
        int int21 = binomialHeapNode20.getDegree();
        binomialHeap0.decreaseKeyNode(binomialHeapNode20, 0);
        binomialHeap0.insert((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) 'a');
        binomialHeap0.delete((int) (byte) 0);
        binomialHeap0.delete(100);
        binomialHeap0.insert((int) (byte) -1);
        binomialHeap0.delete((int) (short) 100);
        binomialHeap0.insert((int) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }
}

