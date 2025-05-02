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
        binomialHeap0.delete((int) (byte) -1);
        binomialHeap0.insert((int) (byte) 100);
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
        binomialHeap0.delete((int) (byte) -1);
        binomialHeap0.insert((int) 'a');
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
        binomialHeap0.insert((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode3 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) (byte) 1);
        binomialHeap0.decreaseKeyValue((int) (byte) 0, 0);
        binomialHeap0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode1 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) (short) 100);
        binomialHeap0.insert(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) 'a');
        binomialHeap0.delete((int) ' ');
        binomialHeap0.decreaseKeyValue((int) (byte) 100, 0);
        int int10 = binomialHeap0.findMinimum();
        binomialHeap0.delete((int) ' ');
        binomialHeap0.insert((int) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode3 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) (short) 100);
        binomialHeap0.insert((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode3 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) (byte) 1);
        binomialHeap0.decreaseKeyValue((int) (byte) 0, 0);
        binomialHeap0.insert((int) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode3 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) (byte) 1);
        system.testclass.BinomialHeap binomialHeap6 = new system.testclass.BinomialHeap();
        binomialHeap6.delete((int) (byte) 100);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode10 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '4');
        int int11 = binomialHeapNode10.getKey();
        binomialHeap6.decreaseKeyNode(binomialHeapNode10, (int) '4');
        binomialHeap0.decreaseKeyNode(binomialHeapNode10, (int) '4');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode17 = new system.testclass.BinomialHeap.BinomialHeapNode((int) (byte) 0);
        int int18 = binomialHeapNode17.getKey();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode19 = binomialHeapNode17.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode19, 1);
        binomialHeap0.insert((int) 'a');
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
        binomialHeap0.delete((int) ' ');
        binomialHeap0.decreaseKeyValue((int) (byte) 100, 0);
        binomialHeap0.decreaseKeyValue((int) (byte) -1, 0);
        int int13 = binomialHeap0.findMinimum();
        binomialHeap0.insert(0);
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
        binomialHeap0.delete((int) ' ');
        binomialHeap0.decreaseKeyValue((int) (byte) 100, 0);
        int int10 = binomialHeap0.findMinimum();
        binomialHeap0.insert((int) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode3 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) (byte) 1);
        system.testclass.BinomialHeap binomialHeap6 = new system.testclass.BinomialHeap();
        binomialHeap6.delete((int) (byte) 100);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode10 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '4');
        int int11 = binomialHeapNode10.getKey();
        binomialHeap6.decreaseKeyNode(binomialHeapNode10, (int) '4');
        binomialHeap0.decreaseKeyNode(binomialHeapNode10, (int) '4');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode17 = new system.testclass.BinomialHeap.BinomialHeapNode((int) (byte) 0);
        int int18 = binomialHeapNode17.getKey();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode19 = binomialHeapNode17.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode19, 1);
        binomialHeap0.insert((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode3 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) (byte) 0);
        int int6 = binomialHeap0.findMinimum();
        binomialHeap0.decreaseKeyValue(1, (int) (short) 100);
        binomialHeap0.insert(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode3 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) (byte) 0);
        int int6 = binomialHeap0.findMinimum();
        binomialHeap0.decreaseKeyValue(1, (int) (short) 100);
        binomialHeap0.insert((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode3 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) (byte) 1);
        system.testclass.BinomialHeap binomialHeap6 = new system.testclass.BinomialHeap();
        binomialHeap6.delete((int) (byte) 100);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode10 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '4');
        int int11 = binomialHeapNode10.getKey();
        binomialHeap6.decreaseKeyNode(binomialHeapNode10, (int) '4');
        binomialHeap0.decreaseKeyNode(binomialHeapNode10, (int) '4');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode17 = new system.testclass.BinomialHeap.BinomialHeapNode((int) (byte) 0);
        int int18 = binomialHeapNode17.getKey();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode19 = binomialHeapNode17.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode19, 1);
        binomialHeap0.insert((int) (byte) -1);
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
        binomialHeap0.delete((int) ' ');
        binomialHeap0.decreaseKeyValue((int) (byte) 100, 0);
        int int10 = binomialHeap0.findMinimum();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode11 = null;
        binomialHeap0.decreaseKeyNode(binomialHeapNode11, (int) (short) 1);
        int int14 = binomialHeap0.findMinimum();
        binomialHeap0.insert((int) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode1 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode3 = new system.testclass.BinomialHeap.BinomialHeapNode(0);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode4 = binomialHeapNode3.getSibling();
        int int5 = binomialHeapNode3.size();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode6 = binomialHeapNode3.getChild();
        binomialHeap0.decreaseKeyNode(binomialHeapNode6, (int) (short) -1);
        binomialHeap0.insert((int) '4');
        binomialHeap0.delete(100);
        binomialHeap0.decreaseKeyValue((int) (short) 1, (int) '4');
        int int16 = binomialHeap0.findMinimum();
        binomialHeap0.delete((int) (byte) 100);
        binomialHeap0.insert((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode1 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode3 = new system.testclass.BinomialHeap.BinomialHeapNode(0);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode4 = binomialHeapNode3.getSibling();
        int int5 = binomialHeapNode3.size();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode6 = binomialHeapNode3.getChild();
        binomialHeap0.decreaseKeyNode(binomialHeapNode6, (int) (short) -1);
        binomialHeap0.insert((int) '4');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode12 = new system.testclass.BinomialHeap.BinomialHeapNode((int) (byte) 0);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode13 = binomialHeapNode12.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode12, 100);
        binomialHeap0.insert((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode3 = binomialHeap0.extractMin();
        binomialHeap0.insert(0);
        binomialHeap0.insert((int) (byte) 0);
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
        binomialHeap0.decreaseKeyValue((int) (byte) 100, 0);
        binomialHeap0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode3 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) (byte) 1);
        system.testclass.BinomialHeap binomialHeap6 = new system.testclass.BinomialHeap();
        binomialHeap6.delete((int) (byte) 100);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode10 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '4');
        int int11 = binomialHeapNode10.getKey();
        binomialHeap6.decreaseKeyNode(binomialHeapNode10, (int) '4');
        binomialHeap0.decreaseKeyNode(binomialHeapNode10, (int) '4');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode17 = new system.testclass.BinomialHeap.BinomialHeapNode((int) (byte) 0);
        int int18 = binomialHeapNode17.getKey();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode19 = binomialHeapNode17.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode19, 1);
        binomialHeap0.decreaseKeyValue((int) '4', (int) (short) 1);
        binomialHeap0.insert((int) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode3 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode4 = binomialHeap0.extractMin();
        binomialHeap0.delete((int) (byte) 100);
        binomialHeap0.insert((int) (short) 1);
        binomialHeap0.insert(100);
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
        binomialHeap0.delete((int) ' ');
        binomialHeap0.decreaseKeyValue((int) (byte) 100, 0);
        binomialHeap0.insert((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode3 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) (byte) 1);
        system.testclass.BinomialHeap binomialHeap6 = new system.testclass.BinomialHeap();
        binomialHeap6.delete((int) (byte) 100);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode10 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '4');
        int int11 = binomialHeapNode10.getKey();
        binomialHeap6.decreaseKeyNode(binomialHeapNode10, (int) '4');
        binomialHeap0.decreaseKeyNode(binomialHeapNode10, (int) '4');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode17 = new system.testclass.BinomialHeap.BinomialHeapNode((int) (byte) 0);
        int int18 = binomialHeapNode17.getKey();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode19 = binomialHeapNode17.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode19, 1);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode23 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '4');
        int int24 = binomialHeapNode23.getDegree();
        binomialHeap0.decreaseKeyNode(binomialHeapNode23, (int) (byte) 0);
        binomialHeap0.insert((int) 'a');
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
        binomialHeap0.delete((int) (byte) -1);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode9 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode11 = new system.testclass.BinomialHeap.BinomialHeapNode((int) (byte) 10);
        binomialHeap0.decreaseKeyNode(binomialHeapNode11, (int) (byte) 100);
        binomialHeap0.insert((int) '4');
        binomialHeap0.insert((int) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode3 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) (byte) 1);
        binomialHeap0.delete((int) (short) -1);
        binomialHeap0.insert((int) (short) -1);
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
        binomialHeap0.delete((int) ' ');
        binomialHeap0.decreaseKeyValue((int) (byte) 100, 0);
        int int10 = binomialHeap0.findMinimum();
        binomialHeap0.delete((int) ' ');
        binomialHeap0.insert((int) (short) 100);
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
        binomialHeap0.delete((int) ' ');
        binomialHeap0.decreaseKeyValue((int) (byte) 100, 0);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode10 = binomialHeap0.extractMin();
        binomialHeap0.insert(0);
        int int13 = binomialHeap0.findMinimum();
        binomialHeap0.decreaseKeyValue((int) '4', (int) (byte) 10);
        binomialHeap0.insert((int) (byte) 0);
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
        binomialHeap0.delete((int) (byte) -1);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode9 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode11 = new system.testclass.BinomialHeap.BinomialHeapNode((int) (byte) 10);
        binomialHeap0.decreaseKeyNode(binomialHeapNode11, (int) (byte) 100);
        binomialHeap0.insert((int) '4');
        binomialHeap0.insert(10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode3 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) (short) 100);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '4');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeapNode7.getSibling();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode9 = binomialHeapNode7.getSibling();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode10 = binomialHeapNode7.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode10, (int) ' ');
        system.testclass.BinomialHeap binomialHeap13 = new system.testclass.BinomialHeap();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode14 = binomialHeap13.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode16 = new system.testclass.BinomialHeap.BinomialHeapNode(0);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode17 = binomialHeapNode16.getSibling();
        int int18 = binomialHeapNode16.size();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode19 = binomialHeapNode16.getChild();
        binomialHeap13.decreaseKeyNode(binomialHeapNode19, (int) (short) -1);
        binomialHeap13.insert((int) '4');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode25 = new system.testclass.BinomialHeap.BinomialHeapNode((int) (byte) 0);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode26 = binomialHeapNode25.getSibling();
        binomialHeap13.decreaseKeyNode(binomialHeapNode25, 100);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode29 = binomialHeapNode25.getChild();
        binomialHeap0.decreaseKeyNode(binomialHeapNode29, (int) ' ');
        binomialHeap0.delete((int) (byte) -1);
        binomialHeap0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) (byte) 100);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode4 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '4');
        int int5 = binomialHeapNode4.getKey();
        binomialHeap0.decreaseKeyNode(binomialHeapNode4, (int) '4');
        binomialHeap0.insert((int) (short) 100);
        binomialHeap0.insert((int) (short) 100);
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
        int int5 = binomialHeap0.findMinimum();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = new system.testclass.BinomialHeap.BinomialHeapNode((int) (byte) 0);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeapNode7.getSibling();
        int int9 = binomialHeapNode7.getKey();
        int int10 = binomialHeapNode7.getKey();
        binomialHeap0.decreaseKeyNode(binomialHeapNode7, 1);
        binomialHeap0.insert((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode3 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode4 = binomialHeap0.extractMin();
        binomialHeap0.delete((int) (byte) 100);
        binomialHeap0.insert((int) (short) 1);
        binomialHeap0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode1 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode3 = new system.testclass.BinomialHeap.BinomialHeapNode(0);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode4 = binomialHeapNode3.getSibling();
        int int5 = binomialHeapNode3.size();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode6 = binomialHeapNode3.getChild();
        binomialHeap0.decreaseKeyNode(binomialHeapNode6, (int) (short) -1);
        binomialHeap0.insert((int) '4');
        binomialHeap0.delete(100);
        binomialHeap0.decreaseKeyValue((int) (short) 1, (int) '4');
        int int16 = binomialHeap0.findMinimum();
        binomialHeap0.delete((int) (byte) 100);
        binomialHeap0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode1 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode3 = new system.testclass.BinomialHeap.BinomialHeapNode(0);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode4 = binomialHeapNode3.getSibling();
        int int5 = binomialHeapNode3.size();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode6 = binomialHeapNode3.getChild();
        binomialHeap0.decreaseKeyNode(binomialHeapNode6, (int) (short) -1);
        binomialHeap0.insert((int) '4');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode12 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '4');
        int int13 = binomialHeapNode12.size();
        binomialHeap0.decreaseKeyNode(binomialHeapNode12, 10);
        binomialHeap0.insert(52);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode1 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode3 = new system.testclass.BinomialHeap.BinomialHeapNode(0);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode4 = binomialHeapNode3.getSibling();
        int int5 = binomialHeapNode3.size();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode6 = binomialHeapNode3.getChild();
        binomialHeap0.decreaseKeyNode(binomialHeapNode6, (int) (short) -1);
        binomialHeap0.insert((int) '4');
        binomialHeap0.delete(100);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode14 = new system.testclass.BinomialHeap.BinomialHeapNode(0);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode15 = binomialHeapNode14.getChild();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode16 = binomialHeapNode14.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode16, (int) (short) 1);
        binomialHeap0.insert(100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) 'a');
        binomialHeap0.delete((int) ' ');
        binomialHeap0.decreaseKeyValue((int) (byte) 100, 0);
        binomialHeap0.decreaseKeyValue((int) (byte) -1, 0);
        int int13 = binomialHeap0.findMinimum();
        binomialHeap0.decreaseKeyValue(0, 52);
        binomialHeap0.decreaseKeyValue(97, (int) (byte) 0);
        int int20 = binomialHeap0.findMinimum();
        binomialHeap0.insert((int) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) (byte) 100);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode4 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '4');
        int int5 = binomialHeapNode4.getKey();
        binomialHeap0.decreaseKeyNode(binomialHeapNode4, (int) '4');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeap0.extractMin();
        binomialHeap0.delete((int) (short) 10);
        binomialHeap0.insert(1);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode14 = new system.testclass.BinomialHeap.BinomialHeapNode((int) (byte) 100);
        int int15 = binomialHeapNode14.getKey();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode16 = binomialHeapNode14.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode16, (-1));
        binomialHeap0.insert((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode3 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) (byte) 1);
        binomialHeap0.delete((-1));
        binomialHeap0.decreaseKeyValue((int) (short) 1, (int) (short) 100);
        binomialHeap0.decreaseKeyValue((int) ' ', 1);
        binomialHeap0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) (byte) 100);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode4 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '4');
        int int5 = binomialHeapNode4.getKey();
        binomialHeap0.decreaseKeyNode(binomialHeapNode4, (int) '4');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeap0.extractMin();
        binomialHeap0.delete((int) (short) 10);
        binomialHeap0.insert((int) (short) 1);
        binomialHeap0.insert((int) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode3 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) (byte) 1);
        binomialHeap0.delete((-1));
        binomialHeap0.decreaseKeyValue((int) (short) 1, (int) (short) 100);
        binomialHeap0.decreaseKeyValue((int) ' ', 1);
        binomialHeap0.insert(52);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode3 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) (byte) 1);
        system.testclass.BinomialHeap binomialHeap6 = new system.testclass.BinomialHeap();
        binomialHeap6.delete((int) (byte) 100);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode10 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '4');
        int int11 = binomialHeapNode10.getKey();
        binomialHeap6.decreaseKeyNode(binomialHeapNode10, (int) '4');
        binomialHeap0.decreaseKeyNode(binomialHeapNode10, (int) '4');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode17 = new system.testclass.BinomialHeap.BinomialHeapNode((int) (byte) 0);
        int int18 = binomialHeapNode17.getKey();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode19 = binomialHeapNode17.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode19, 1);
        binomialHeap0.decreaseKeyValue((int) '4', (int) (short) 1);
        system.testclass.BinomialHeap binomialHeap25 = new system.testclass.BinomialHeap();
        binomialHeap25.delete((int) 'a');
        binomialHeap25.insert((int) 'a');
        binomialHeap25.delete((int) ' ');
        binomialHeap25.decreaseKeyValue((int) (byte) 100, 0);
        int int35 = binomialHeap25.findMinimum();
        int int36 = binomialHeap25.findMinimum();
        int int37 = binomialHeap25.findMinimum();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode39 = new system.testclass.BinomialHeap.BinomialHeapNode((int) (byte) 0);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode40 = binomialHeapNode39.getSibling();
        int int41 = binomialHeapNode39.size();
        binomialHeap25.decreaseKeyNode(binomialHeapNode39, 52);
        system.testclass.BinomialHeap binomialHeap44 = new system.testclass.BinomialHeap();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode45 = binomialHeap44.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode47 = new system.testclass.BinomialHeap.BinomialHeapNode(0);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode48 = binomialHeapNode47.getSibling();
        int int49 = binomialHeapNode47.size();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode50 = binomialHeapNode47.getChild();
        binomialHeap44.decreaseKeyNode(binomialHeapNode50, (int) (short) -1);
        binomialHeap44.insert((int) '4');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode55 = binomialHeap44.extractMin();
        int int56 = binomialHeapNode55.getKey();
        binomialHeap25.decreaseKeyNode(binomialHeapNode55, 52);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode59 = binomialHeapNode55.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode59, (int) ' ');
        binomialHeap0.insert((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode3 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) (byte) 1);
        system.testclass.BinomialHeap binomialHeap6 = new system.testclass.BinomialHeap();
        binomialHeap6.delete((int) (byte) 100);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode10 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '4');
        int int11 = binomialHeapNode10.getKey();
        binomialHeap6.decreaseKeyNode(binomialHeapNode10, (int) '4');
        binomialHeap0.decreaseKeyNode(binomialHeapNode10, (int) '4');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode17 = new system.testclass.BinomialHeap.BinomialHeapNode((int) (byte) 0);
        int int18 = binomialHeapNode17.getKey();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode19 = binomialHeapNode17.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode19, 1);
        binomialHeap0.decreaseKeyValue((int) '4', (int) (short) 1);
        system.testclass.BinomialHeap binomialHeap25 = new system.testclass.BinomialHeap();
        binomialHeap25.delete((int) 'a');
        binomialHeap25.insert((int) 'a');
        binomialHeap25.delete((int) ' ');
        binomialHeap25.decreaseKeyValue((int) (byte) 100, 0);
        int int35 = binomialHeap25.findMinimum();
        int int36 = binomialHeap25.findMinimum();
        int int37 = binomialHeap25.findMinimum();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode39 = new system.testclass.BinomialHeap.BinomialHeapNode((int) (byte) 0);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode40 = binomialHeapNode39.getSibling();
        int int41 = binomialHeapNode39.size();
        binomialHeap25.decreaseKeyNode(binomialHeapNode39, 52);
        system.testclass.BinomialHeap binomialHeap44 = new system.testclass.BinomialHeap();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode45 = binomialHeap44.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode47 = new system.testclass.BinomialHeap.BinomialHeapNode(0);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode48 = binomialHeapNode47.getSibling();
        int int49 = binomialHeapNode47.size();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode50 = binomialHeapNode47.getChild();
        binomialHeap44.decreaseKeyNode(binomialHeapNode50, (int) (short) -1);
        binomialHeap44.insert((int) '4');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode55 = binomialHeap44.extractMin();
        int int56 = binomialHeapNode55.getKey();
        binomialHeap25.decreaseKeyNode(binomialHeapNode55, 52);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode59 = binomialHeapNode55.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode59, (int) ' ');
        binomialHeap0.insert((int) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode1 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode3 = new system.testclass.BinomialHeap.BinomialHeapNode(0);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode4 = binomialHeapNode3.getSibling();
        int int5 = binomialHeapNode3.size();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode6 = binomialHeapNode3.getChild();
        binomialHeap0.decreaseKeyNode(binomialHeapNode6, (int) (short) -1);
        binomialHeap0.insert((int) '4');
        binomialHeap0.decreaseKeyValue((-1), (int) 'a');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode15 = new system.testclass.BinomialHeap.BinomialHeapNode(0);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode16 = binomialHeapNode15.getSibling();
        int int17 = binomialHeapNode15.size();
        int int18 = binomialHeapNode15.getDegree();
        int int19 = binomialHeapNode15.getDegree();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode20 = binomialHeapNode15.getChild();
        int int21 = binomialHeapNode15.size();
        int int22 = binomialHeapNode15.getKey();
        binomialHeap0.decreaseKeyNode(binomialHeapNode15, (int) (byte) 1);
        int int25 = binomialHeap0.findMinimum();
        binomialHeap0.insert((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode3 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) (byte) 0);
        binomialHeap0.decreaseKeyValue(0, (int) '#');
        binomialHeap0.decreaseKeyValue((int) '4', (int) '#');
        binomialHeap0.insert(10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }
}

