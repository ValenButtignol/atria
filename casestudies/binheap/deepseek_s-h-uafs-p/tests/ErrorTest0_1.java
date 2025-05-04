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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for binomialHeap0", binomialHeap0.property_1());
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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for binomialHeap0", binomialHeap0.property_1());
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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for binomialHeap0", binomialHeap0.property_1());
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) 'a');
        binomialHeap0.insert((int) (byte) 10);
        binomialHeap0.insert(0);
        binomialHeap0.decreaseKeyValue((int) '4', (int) (byte) 100);
        int int12 = binomialHeap0.findMinimum();
        binomialHeap0.decreaseKeyValue((int) '4', (int) (short) -1);
        binomialHeap0.decreaseKeyValue(10, (int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for binomialHeap0", binomialHeap0.property_1());
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
        binomialHeap0.decreaseKeyValue(0, (int) (byte) 1);
        binomialHeap0.insert((int) '4');
        binomialHeap0.delete(10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for binomialHeap0", binomialHeap0.property_1());
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) 'a');
        binomialHeap0.insert((int) (byte) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        binomialHeap0.insert((-1));
        binomialHeap0.insert((int) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for binomialHeap0", binomialHeap0.property_1());
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
        binomialHeap0.insert((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for binomialHeap0", binomialHeap0.property_1());
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
        binomialHeap0.decreaseKeyValue((int) '4', (int) (byte) 100);
        binomialHeap0.insert((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for binomialHeap0", binomialHeap0.property_1());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) 'a');
        binomialHeap0.delete((int) ' ');
        binomialHeap0.decreaseKeyValue((int) (short) 1, (int) '#');
        binomialHeap0.insert(52);
        int int12 = binomialHeap0.findMinimum();
        binomialHeap0.insert((int) (byte) 1);
        binomialHeap0.insert((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for binomialHeap0", binomialHeap0.property_1());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) '4');
        binomialHeap0.insert((int) (short) -1);
        binomialHeap0.delete(1);
        binomialHeap0.insert((int) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for binomialHeap0", binomialHeap0.property_1());
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) 'a');
        binomialHeap0.delete((int) ' ');
        binomialHeap0.decreaseKeyValue((int) (short) 1, (int) '#');
        binomialHeap0.insert(52);
        int int12 = binomialHeap0.findMinimum();
        binomialHeap0.insert((int) (byte) 1);
        binomialHeap0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for binomialHeap0", binomialHeap0.property_1());
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
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode10 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '4');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode11 = binomialHeapNode10.getSibling();
        int int12 = binomialHeapNode10.size();
        int int13 = binomialHeapNode10.getDegree();
        int int14 = binomialHeapNode10.getDegree();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode15 = binomialHeapNode10.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode15, (int) (short) 0);
        binomialHeap0.insert((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for binomialHeap0", binomialHeap0.property_1());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) 'a');
        binomialHeap0.delete((int) ' ');
        binomialHeap0.decreaseKeyValue(10, 0);
        int int10 = binomialHeap0.findMinimum();
        binomialHeap0.delete((int) (short) 100);
        binomialHeap0.decreaseKeyValue(1, 2);
        binomialHeap0.delete((-1));
        binomialHeap0.insert(97);
        binomialHeap0.insert(0);
        binomialHeap0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for binomialHeap0", binomialHeap0.property_1());
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) 'a');
        binomialHeap0.delete((int) ' ');
        binomialHeap0.decreaseKeyValue(10, 0);
        int int10 = binomialHeap0.findMinimum();
        binomialHeap0.delete((int) (short) 100);
        binomialHeap0.decreaseKeyValue((int) ' ', 1);
        binomialHeap0.decreaseKeyValue(52, (int) (short) 100);
        binomialHeap0.insert((int) (short) 1);
        binomialHeap0.insert((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for binomialHeap0", binomialHeap0.property_1());
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
        binomialHeap0.delete((int) (short) 100);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode12 = new system.testclass.BinomialHeap.BinomialHeapNode((int) (byte) 0);
        int int13 = binomialHeapNode12.size();
        int int14 = binomialHeapNode12.getDegree();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode15 = binomialHeapNode12.getParent();
        binomialHeap0.decreaseKeyNode(binomialHeapNode12, (int) (short) 10);
        binomialHeap0.decreaseKeyValue((int) (byte) 0, (int) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for binomialHeap0", binomialHeap0.property_1());
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) 'a');
        binomialHeap0.insert((int) (byte) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        binomialHeap0.insert(52);
        binomialHeap0.insert(97);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for binomialHeap0", binomialHeap0.property_1());
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
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode18 = binomialHeap0.extractMin();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for binomialHeap0", binomialHeap0.property_1());
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) '4');
        binomialHeap0.insert((int) (short) -1);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        binomialHeap0.insert(1);
        binomialHeap0.insert(35);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for binomialHeap0", binomialHeap0.property_1());
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) 'a');
        binomialHeap0.delete((int) ' ');
        binomialHeap0.decreaseKeyValue(10, 0);
        int int10 = binomialHeap0.findMinimum();
        binomialHeap0.insert((int) (byte) 1);
        binomialHeap0.insert((int) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for binomialHeap0", binomialHeap0.property_1());
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
        binomialHeap0.delete((int) (short) 100);
        binomialHeap0.insert((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for binomialHeap0", binomialHeap0.property_1());
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) 'a');
        binomialHeap0.insert((int) (byte) 10);
        binomialHeap0.insert(0);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode10 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '4');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode11 = binomialHeapNode10.getSibling();
        int int12 = binomialHeapNode10.size();
        int int13 = binomialHeapNode10.getDegree();
        int int14 = binomialHeapNode10.getKey();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode15 = binomialHeapNode10.getParent();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode16 = binomialHeapNode10.getParent();
        binomialHeap0.decreaseKeyNode(binomialHeapNode16, (int) (byte) -1);
        binomialHeap0.insert((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for binomialHeap0", binomialHeap0.property_1());
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) 'a');
        binomialHeap0.insert((int) (byte) 10);
        binomialHeap0.insert(0);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode10 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '4');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode11 = binomialHeapNode10.getSibling();
        int int12 = binomialHeapNode10.size();
        int int13 = binomialHeapNode10.getDegree();
        int int14 = binomialHeapNode10.getDegree();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode15 = binomialHeapNode10.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode15, (int) (short) 0);
        binomialHeap0.insert((int) (short) 100);
        binomialHeap0.delete(52);
        binomialHeap0.delete((int) '#');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode24 = binomialHeap0.extractMin();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for binomialHeap0", binomialHeap0.property_1());
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) 'a');
        binomialHeap0.insert((int) (byte) 10);
        int int7 = binomialHeap0.findMinimum();
        binomialHeap0.insert((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for binomialHeap0", binomialHeap0.property_1());
    }
}

