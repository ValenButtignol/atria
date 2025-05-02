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
        binomialHeap0.delete((int) ' ');
        binomialHeap0.insert((int) ' ');
        binomialHeap0.insert((int) 'a');
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
        binomialHeap0.decreaseKeyValue((int) (byte) 0, 0);
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) '4');
        int int14 = binomialHeap0.findMinimum();
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
        binomialHeap0.insert(0);
        binomialHeap0.decreaseKeyValue((int) '4', (int) (byte) 100);
        int int12 = binomialHeap0.findMinimum();
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
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        binomialHeap0.insert((-1));
        binomialHeap0.insert((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode1 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode2 = binomialHeap0.extractMin();
        binomialHeap0.delete((int) (short) 100);
        binomialHeap0.insert(1);
        binomialHeap0.insert(1);
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
        binomialHeap0.delete((int) ' ');
        binomialHeap0.decreaseKeyValue(10, 0);
        binomialHeap0.insert((int) '4');
        binomialHeap0.insert((int) '4');
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
        binomialHeap0.insert((int) (byte) 10);
        binomialHeap0.insert(0);
        binomialHeap0.decreaseKeyValue((int) '4', (int) (byte) 100);
        int int12 = binomialHeap0.findMinimum();
        binomialHeap0.decreaseKeyValue(0, (int) (byte) 1);
        binomialHeap0.insert((int) '4');
        binomialHeap0.delete(1);
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
        binomialHeap0.insert(0);
        binomialHeap0.decreaseKeyValue((int) (byte) 100, 35);
        binomialHeap0.decreaseKeyValue(0, (int) ' ');
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
        binomialHeap0.insert(0);
        binomialHeap0.decreaseKeyValue((int) '4', (int) (byte) 100);
        binomialHeap0.delete((int) ' ');
        system.testclass.BinomialHeap binomialHeap14 = new system.testclass.BinomialHeap();
        binomialHeap14.delete((int) 'a');
        binomialHeap14.insert((int) 'a');
        binomialHeap14.insert((int) (byte) 100);
        int int21 = binomialHeap14.findMinimum();
        binomialHeap14.decreaseKeyValue((int) (byte) 10, (int) (short) -1);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode25 = binomialHeap14.extractMin();
        binomialHeap0.decreaseKeyNode(binomialHeapNode25, (int) '4');
        binomialHeap0.insert(97);
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
        binomialHeap0.insert((int) (byte) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode10 = new system.testclass.BinomialHeap.BinomialHeapNode((int) (short) 1);
        binomialHeap0.decreaseKeyNode(binomialHeapNode10, (int) '4');
        binomialHeap0.insert((int) (byte) 0);
        int int15 = binomialHeap0.findMinimum();
        binomialHeap0.insert((int) (byte) 0);
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
        binomialHeap0.insert((int) (byte) 100);
        int int7 = binomialHeap0.findMinimum();
        binomialHeap0.decreaseKeyValue((int) (short) 100, 1);
        int int11 = binomialHeap0.findMinimum();
        binomialHeap0.insert((int) (byte) 100);
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
        binomialHeap0.insert((int) (byte) 100);
        int int7 = binomialHeap0.findMinimum();
        binomialHeap0.insert((int) '#');
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
        binomialHeap0.insert(0);
        binomialHeap0.decreaseKeyValue((int) '4', (int) (byte) 100);
        int int12 = binomialHeap0.findMinimum();
        binomialHeap0.decreaseKeyValue((int) '4', (int) (short) -1);
        binomialHeap0.delete(1);
        int int18 = binomialHeap0.findMinimum();
        binomialHeap0.delete((int) (byte) 100);
        binomialHeap0.insert(97);
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
        binomialHeap0.insert((int) (byte) 10);
        binomialHeap0.insert((int) (byte) 0);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode9 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode11 = new system.testclass.BinomialHeap.BinomialHeapNode((int) (byte) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode12 = binomialHeapNode11.getSibling();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode13 = binomialHeapNode11.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode11, (int) (byte) 0);
        binomialHeap0.decreaseKeyValue((int) 'a', (int) (byte) 10);
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
        binomialHeap0.insert(0);
        binomialHeap0.decreaseKeyValue((int) '4', (int) (byte) 100);
        binomialHeap0.delete((int) ' ');
        binomialHeap0.delete((int) (short) 100);
        binomialHeap0.insert(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) 'a');
        binomialHeap0.delete((int) ' ');
        binomialHeap0.decreaseKeyValue(10, 0);
        int int10 = binomialHeap0.findMinimum();
        binomialHeap0.insert((int) (byte) 1);
        int int13 = binomialHeap0.findMinimum();
        binomialHeap0.decreaseKeyValue(52, 2);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode18 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '4');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode19 = binomialHeapNode18.getSibling();
        int int20 = binomialHeapNode18.size();
        int int21 = binomialHeapNode18.getKey();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode22 = binomialHeapNode18.getChild();
        binomialHeap0.decreaseKeyNode(binomialHeapNode22, 0);
        binomialHeap0.insert(10);
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
        binomialHeap0.insert(0);
        binomialHeap0.decreaseKeyValue((int) '4', (int) (byte) 100);
        int int12 = binomialHeap0.findMinimum();
        binomialHeap0.decreaseKeyValue(0, (int) (byte) 1);
        binomialHeap0.insert((int) '4');
        int int18 = binomialHeap0.findMinimum();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode19 = binomialHeap0.extractMin();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) 'a');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode6 = new system.testclass.BinomialHeap.BinomialHeapNode((int) (byte) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeapNode6.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode7, (int) (short) 10);
        binomialHeap0.delete((int) (short) 100);
        int int12 = binomialHeap0.findMinimum();
        binomialHeap0.insert((int) 'a');
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
        binomialHeap0.insert(0);
        binomialHeap0.decreaseKeyValue((int) '4', (int) (byte) 100);
        int int12 = binomialHeap0.findMinimum();
        binomialHeap0.decreaseKeyValue(35, (int) '#');
        binomialHeap0.insert(97);
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
        binomialHeap0.insert(0);
        binomialHeap0.decreaseKeyValue((int) '4', (int) (byte) 100);
        binomialHeap0.delete(10);
        binomialHeap0.delete(32);
        binomialHeap0.insert((int) ' ');
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
        binomialHeap0.decreaseKeyValue(10, 0);
        int int10 = binomialHeap0.findMinimum();
        binomialHeap0.insert(0);
        binomialHeap0.insert((int) (byte) 10);
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
        binomialHeap0.decreaseKeyValue((int) (short) 10, (int) (byte) 10);
        binomialHeap0.insert(0);
        binomialHeap0.delete((-1));
        binomialHeap0.insert((int) (byte) 100);
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
        binomialHeap0.decreaseKeyValue(10, 0);
        binomialHeap0.insert(100);
        system.testclass.BinomialHeap binomialHeap12 = new system.testclass.BinomialHeap();
        binomialHeap12.delete((int) 'a');
        binomialHeap12.insert((int) 'a');
        binomialHeap12.insert((int) (byte) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode19 = binomialHeap12.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode20 = binomialHeapNode19.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode20, (int) (byte) 1);
        binomialHeap0.insert(97);
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
        binomialHeap0.insert(0);
        binomialHeap0.decreaseKeyValue((int) '4', (int) (byte) 100);
        int int12 = binomialHeap0.findMinimum();
        binomialHeap0.decreaseKeyValue(0, (int) (byte) 1);
        binomialHeap0.decreaseKeyValue((int) (short) -1, (int) 'a');
        binomialHeap0.delete((int) (short) 0);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode22 = new system.testclass.BinomialHeap.BinomialHeapNode(0);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode23 = binomialHeapNode22.getChild();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode24 = binomialHeapNode22.getParent();
        int int25 = binomialHeapNode22.size();
        binomialHeap0.decreaseKeyNode(binomialHeapNode22, (int) (short) -1);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode28 = binomialHeap0.extractMin();
        binomialHeap0.insert(52);
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
        binomialHeap0.insert((int) (byte) 100);
        binomialHeap0.decreaseKeyValue((int) (byte) 0, 0);
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) '4');
        int int14 = binomialHeap0.findMinimum();
        binomialHeap0.delete(1);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode17 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) (byte) 100);
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
        binomialHeap0.delete((int) ' ');
        binomialHeap0.decreaseKeyValue(10, 0);
        int int10 = binomialHeap0.findMinimum();
        binomialHeap0.insert((int) (byte) 1);
        binomialHeap0.delete(52);
        binomialHeap0.insert((int) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) 'a');
        binomialHeap0.insert((int) (byte) 10);
        binomialHeap0.insert(0);
        binomialHeap0.decreaseKeyValue((int) '4', (int) (byte) 100);
        binomialHeap0.delete((int) ' ');
        binomialHeap0.delete((int) (short) 100);
        binomialHeap0.insert((int) (byte) 100);
        binomialHeap0.insert((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }
}

