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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for binomialHeap0", binomialHeap0.property_3());
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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for binomialHeap0", binomialHeap0.property_3());
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
        binomialHeap0.delete(10);
        binomialHeap0.insert((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for binomialHeap0", binomialHeap0.property_3());
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) 'a');
        binomialHeap0.delete((int) ' ');
        binomialHeap0.decreaseKeyValue(10, 0);
        int int10 = binomialHeap0.findMinimum();
        binomialHeap0.insert((int) (byte) 1);
        binomialHeap0.insert(10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for binomialHeap0", binomialHeap0.property_3());
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) 'a');
        binomialHeap0.insert((int) (byte) 10);
        binomialHeap0.insert(0);
        binomialHeap0.decreaseKeyValue((int) '4', (int) (byte) 100);
        int int12 = binomialHeap0.findMinimum();
        binomialHeap0.insert(0);
        binomialHeap0.insert((int) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for binomialHeap0", binomialHeap0.property_3());
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) 'a');
        binomialHeap0.insert((int) (byte) 10);
        binomialHeap0.insert(0);
        binomialHeap0.decreaseKeyValue((int) '4', (int) (byte) 100);
        binomialHeap0.delete(10);
        int int14 = binomialHeap0.findMinimum();
        int int15 = binomialHeap0.findMinimum();
        binomialHeap0.insert(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for binomialHeap0", binomialHeap0.property_3());
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) 'a');
        binomialHeap0.insert((int) (byte) 100);
        binomialHeap0.decreaseKeyValue((int) (byte) 0, 0);
        binomialHeap0.delete((int) 'a');
        binomialHeap0.decreaseKeyValue(1, (-1));
        binomialHeap0.insert((int) '4');
        system.testclass.BinomialHeap binomialHeap17 = new system.testclass.BinomialHeap();
        binomialHeap17.delete((int) 'a');
        binomialHeap17.insert((int) 'a');
        binomialHeap17.insert((int) (byte) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode24 = binomialHeap17.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode25 = binomialHeap17.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode26 = binomialHeapNode25.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode26, (-1));
        binomialHeap0.insert((int) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for binomialHeap0", binomialHeap0.property_3());
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode1 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode2 = binomialHeap0.extractMin();
        binomialHeap0.delete((int) (short) 100);
        binomialHeap0.insert(1);
        binomialHeap0.insert(32);
        binomialHeap0.insert(100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for binomialHeap0", binomialHeap0.property_3());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) 'a');
        binomialHeap0.delete((int) ' ');
        binomialHeap0.decreaseKeyValue(10, 0);
        int int10 = binomialHeap0.findMinimum();
        binomialHeap0.delete((int) (short) 100);
        binomialHeap0.insert((-1));
        binomialHeap0.decreaseKeyValue(0, (int) (byte) 0);
        binomialHeap0.insert((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for binomialHeap0", binomialHeap0.property_3());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode1 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode2 = binomialHeap0.extractMin();
        binomialHeap0.delete((int) (short) 100);
        binomialHeap0.insert(1);
        binomialHeap0.decreaseKeyValue((-1), (int) (short) 0);
        binomialHeap0.insert((int) 'a');
        binomialHeap0.insert((int) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for binomialHeap0", binomialHeap0.property_3());
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) 'a');
        binomialHeap0.insert((int) (byte) 10);
        binomialHeap0.insert(0);
        binomialHeap0.decreaseKeyValue((int) '4', (int) (byte) 100);
        int int12 = binomialHeap0.findMinimum();
        binomialHeap0.insert(0);
        int int15 = binomialHeap0.findMinimum();
        binomialHeap0.delete((int) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for binomialHeap0", binomialHeap0.property_3());
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) 'a');
        binomialHeap0.insert((int) (byte) 10);
        binomialHeap0.insert(0);
        binomialHeap0.decreaseKeyValue((int) '4', (int) (byte) 100);
        int int12 = binomialHeap0.findMinimum();
        binomialHeap0.insert(0);
        int int15 = binomialHeap0.findMinimum();
        system.testclass.BinomialHeap binomialHeap16 = new system.testclass.BinomialHeap();
        binomialHeap16.delete((int) 'a');
        binomialHeap16.insert((int) 'a');
        binomialHeap16.insert((int) (byte) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode23 = binomialHeap16.extractMin();
        binomialHeap16.decreaseKeyValue((int) (short) 10, (int) (byte) 10);
        system.testclass.BinomialHeap binomialHeap27 = new system.testclass.BinomialHeap();
        binomialHeap27.delete((int) 'a');
        binomialHeap27.insert((int) 'a');
        binomialHeap27.insert((int) (byte) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode34 = binomialHeap27.extractMin();
        binomialHeap16.decreaseKeyNode(binomialHeapNode34, 97);
        binomialHeap0.decreaseKeyNode(binomialHeapNode34, (int) (short) 1);
        binomialHeap0.insert(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for binomialHeap0", binomialHeap0.property_3());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) 'a');
        binomialHeap0.insert((int) (byte) 100);
        binomialHeap0.decreaseKeyValue((int) (byte) 0, 0);
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) '4');
        int int14 = binomialHeap0.findMinimum();
        int int15 = binomialHeap0.findMinimum();
        binomialHeap0.insert((int) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for binomialHeap0", binomialHeap0.property_3());
    }
}

