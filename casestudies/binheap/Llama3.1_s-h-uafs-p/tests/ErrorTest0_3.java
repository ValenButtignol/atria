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
        binomialHeap0.delete((int) '4');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode4 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '#');
        int int5 = binomialHeapNode4.getKey();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode6 = binomialHeapNode4.getParent();
        binomialHeap0.decreaseKeyNode(binomialHeapNode4, (int) ' ');
        binomialHeap0.insert((int) (byte) 100);
        binomialHeap0.insert(32);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for binomialHeap0", binomialHeap0.property_3());
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) (byte) 1);
        boolean boolean7 = binomialHeap0.property_2();
        binomialHeap0.insert(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for binomialHeap0", binomialHeap0.property_3());
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete(1);
        binomialHeap0.insert((int) (byte) 10);
        binomialHeap0.decreaseKeyValue((int) (byte) 10, 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode9 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '#');
        binomialHeap0.decreaseKeyNode(binomialHeapNode9, (int) (short) 1);
        binomialHeap0.insert((int) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for binomialHeap0", binomialHeap0.property_3());
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete(1);
        binomialHeap0.insert((int) (byte) 10);
        binomialHeap0.decreaseKeyValue((int) (byte) 0, (int) '#');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode9 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '#');
        int int10 = binomialHeapNode9.getKey();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode11 = binomialHeapNode9.getParent();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode12 = binomialHeapNode9.getSibling();
        int int13 = binomialHeapNode9.getKey();
        int int14 = binomialHeapNode9.getDegree();
        binomialHeap0.decreaseKeyNode(binomialHeapNode9, (int) (short) 1);
        binomialHeap0.insert(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for binomialHeap0", binomialHeap0.property_3());
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.insert(1);
        binomialHeap0.delete((-1));
        boolean boolean5 = binomialHeap0.composedRepOK();
        system.testclass.BinomialHeap binomialHeap6 = new system.testclass.BinomialHeap();
        binomialHeap6.delete((int) '4');
        binomialHeap6.delete((int) 'a');
        binomialHeap6.insert((int) (byte) 1);
        system.testclass.BinomialHeap binomialHeap13 = new system.testclass.BinomialHeap();
        binomialHeap13.delete((int) '4');
        boolean boolean16 = binomialHeap13.property_2();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode18 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '#');
        int int19 = binomialHeapNode18.getDegree();
        binomialHeap13.decreaseKeyNode(binomialHeapNode18, 100);
        binomialHeap13.insert((int) (short) 0);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode24 = binomialHeap13.extractMin();
        binomialHeap6.decreaseKeyNode(binomialHeapNode24, (int) 'a');
        binomialHeap0.decreaseKeyNode(binomialHeapNode24, 100);
        binomialHeap0.insert((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for binomialHeap0", binomialHeap0.property_3());
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete(1);
        binomialHeap0.insert((int) (byte) 10);
        binomialHeap0.decreaseKeyValue((int) (byte) 10, 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode9 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '#');
        binomialHeap0.decreaseKeyNode(binomialHeapNode9, (int) (short) 1);
        binomialHeap0.insert(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for binomialHeap0", binomialHeap0.property_3());
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) '4');
        boolean boolean3 = binomialHeap0.property_2();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode5 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '#');
        int int6 = binomialHeapNode5.getDegree();
        binomialHeap0.decreaseKeyNode(binomialHeapNode5, 100);
        binomialHeap0.insert((int) (short) 0);
        binomialHeap0.insert((int) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for binomialHeap0", binomialHeap0.property_3());
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete(1);
        binomialHeap0.insert(35);
        binomialHeap0.decreaseKeyValue(0, (int) (short) -1);
        binomialHeap0.decreaseKeyValue(0, (int) (short) 0);
        binomialHeap0.insert((int) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for binomialHeap0", binomialHeap0.property_3());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) (byte) 1);
        system.testclass.BinomialHeap binomialHeap7 = new system.testclass.BinomialHeap();
        binomialHeap7.delete(1);
        binomialHeap7.insert((int) (byte) 10);
        binomialHeap7.decreaseKeyValue((int) (byte) 10, 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode16 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '#');
        int int17 = binomialHeapNode16.getKey();
        binomialHeap7.decreaseKeyNode(binomialHeapNode16, (int) (byte) 0);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode20 = binomialHeapNode16.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode20, (int) (short) 1);
        binomialHeap0.insert((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for binomialHeap0", binomialHeap0.property_3());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) (byte) 1);
        system.testclass.BinomialHeap binomialHeap7 = new system.testclass.BinomialHeap();
        binomialHeap7.delete((int) '4');
        boolean boolean10 = binomialHeap7.property_2();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode12 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '#');
        int int13 = binomialHeapNode12.getDegree();
        binomialHeap7.decreaseKeyNode(binomialHeapNode12, 100);
        binomialHeap7.insert((int) (short) 0);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode18 = binomialHeap7.extractMin();
        binomialHeap0.decreaseKeyNode(binomialHeapNode18, (int) 'a');
        binomialHeap0.insert(100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for binomialHeap0", binomialHeap0.property_3());
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete(1);
        binomialHeap0.insert(0);
        int int5 = binomialHeap0.findMinimum();
        boolean boolean6 = binomialHeap0.composedRepOK();
        binomialHeap0.insert(97);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for binomialHeap0", binomialHeap0.property_3());
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete(1);
        binomialHeap0.insert((int) (byte) 10);
        binomialHeap0.decreaseKeyValue((int) (byte) 10, 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode9 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '#');
        int int10 = binomialHeapNode9.getKey();
        binomialHeap0.decreaseKeyNode(binomialHeapNode9, (int) (byte) 0);
        boolean boolean13 = binomialHeap0.composedRepOK();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode15 = new system.testclass.BinomialHeap.BinomialHeapNode(32);
        int int16 = binomialHeapNode15.size();
        binomialHeap0.decreaseKeyNode(binomialHeapNode15, (int) '4');
        binomialHeap0.insert((int) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for binomialHeap0", binomialHeap0.property_3());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.insert(1);
        boolean boolean3 = binomialHeap0.property_2();
        binomialHeap0.insert((int) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for binomialHeap0", binomialHeap0.property_3());
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.insert(1);
        binomialHeap0.decreaseKeyValue(32, (int) (byte) 0);
        binomialHeap0.insert((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for binomialHeap0", binomialHeap0.property_3());
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.insert(1);
        binomialHeap0.delete((-1));
        boolean boolean5 = binomialHeap0.property_2();
        binomialHeap0.insert(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for binomialHeap0", binomialHeap0.property_3());
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete(1);
        binomialHeap0.insert(35);
        boolean boolean5 = binomialHeap0.composedRepOK();
        binomialHeap0.insert((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for binomialHeap0", binomialHeap0.property_3());
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) (byte) 1);
        system.testclass.BinomialHeap binomialHeap7 = new system.testclass.BinomialHeap();
        binomialHeap7.delete((int) '4');
        boolean boolean10 = binomialHeap7.property_2();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode12 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '#');
        int int13 = binomialHeapNode12.getDegree();
        binomialHeap7.decreaseKeyNode(binomialHeapNode12, 100);
        binomialHeap7.insert((int) (short) 0);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode18 = binomialHeap7.extractMin();
        binomialHeap0.decreaseKeyNode(binomialHeapNode18, (int) 'a');
        binomialHeap0.insert((int) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for binomialHeap0", binomialHeap0.property_3());
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete(1);
        binomialHeap0.insert(35);
        binomialHeap0.decreaseKeyValue(0, (int) (short) -1);
        binomialHeap0.decreaseKeyValue(0, (int) (short) 0);
        binomialHeap0.decreaseKeyValue(35, 97);
        binomialHeap0.insert(10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for binomialHeap0", binomialHeap0.property_3());
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) (byte) 1);
        boolean boolean7 = binomialHeap0.property_2();
        binomialHeap0.insert((int) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for binomialHeap0", binomialHeap0.property_3());
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete(1);
        binomialHeap0.insert((int) (byte) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode6 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '#');
        int int7 = binomialHeapNode6.getKey();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeapNode6.getParent();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode9 = binomialHeapNode6.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode9, (int) (short) 10);
        boolean boolean12 = binomialHeap0.property_2();
        system.testclass.BinomialHeap binomialHeap13 = new system.testclass.BinomialHeap();
        binomialHeap13.delete((int) '4');
        binomialHeap13.delete((int) 'a');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode18 = binomialHeap13.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode20 = new system.testclass.BinomialHeap.BinomialHeapNode((int) (byte) -1);
        int int21 = binomialHeapNode20.getDegree();
        int int22 = binomialHeapNode20.size();
        binomialHeap13.decreaseKeyNode(binomialHeapNode20, (int) (byte) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode25 = binomialHeapNode20.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode25, (int) ' ');
        boolean boolean28 = binomialHeap0.property_2();
        binomialHeap0.insert(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for binomialHeap0", binomialHeap0.property_3());
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete(1);
        binomialHeap0.delete(100);
        binomialHeap0.delete((int) '#');
        binomialHeap0.insert(0);
        binomialHeap0.insert((int) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for binomialHeap0", binomialHeap0.property_3());
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete(1);
        binomialHeap0.insert((int) (byte) 10);
        binomialHeap0.delete(35);
        binomialHeap0.delete((-1));
        binomialHeap0.insert(32);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for binomialHeap0", binomialHeap0.property_3());
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete(1);
        binomialHeap0.insert(35);
        binomialHeap0.decreaseKeyValue(0, (int) (short) -1);
        binomialHeap0.decreaseKeyValue(0, (int) (short) 0);
        binomialHeap0.decreaseKeyValue(35, 97);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode15 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '#');
        int int16 = binomialHeapNode15.getDegree();
        int int17 = binomialHeapNode15.getDegree();
        binomialHeap0.decreaseKeyNode(binomialHeapNode15, (int) (byte) 0);
        binomialHeap0.delete(100);
        binomialHeap0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for binomialHeap0", binomialHeap0.property_3());
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete(1);
        binomialHeap0.insert(35);
        binomialHeap0.decreaseKeyValue(0, (int) (short) -1);
        binomialHeap0.decreaseKeyValue(0, (int) (short) 0);
        binomialHeap0.decreaseKeyValue(35, 97);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode15 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '#');
        int int16 = binomialHeapNode15.getDegree();
        int int17 = binomialHeapNode15.getDegree();
        binomialHeap0.decreaseKeyNode(binomialHeapNode15, (int) (byte) 0);
        binomialHeap0.delete(100);
        binomialHeap0.insert((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for binomialHeap0", binomialHeap0.property_3());
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete(1);
        binomialHeap0.insert(0);
        int int5 = binomialHeap0.findMinimum();
        binomialHeap0.insert(10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for binomialHeap0", binomialHeap0.property_3());
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete(1);
        binomialHeap0.insert(0);
        int int5 = binomialHeap0.findMinimum();
        binomialHeap0.insert((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for binomialHeap0", binomialHeap0.property_3());
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) (byte) 1);
        binomialHeap0.decreaseKeyValue((int) (byte) 0, 1);
        boolean boolean10 = binomialHeap0.composedRepOK();
        boolean boolean11 = binomialHeap0.property_2();
        binomialHeap0.insert((int) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for binomialHeap0", binomialHeap0.property_3());
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete(1);
        binomialHeap0.insert((int) (byte) 10);
        binomialHeap0.decreaseKeyValue((int) (byte) 10, 10);
        int int8 = binomialHeap0.findMinimum();
        binomialHeap0.insert((int) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for binomialHeap0", binomialHeap0.property_3());
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete(1);
        binomialHeap0.insert((int) (byte) 10);
        binomialHeap0.delete(35);
        binomialHeap0.insert((int) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for binomialHeap0", binomialHeap0.property_3());
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete(1);
        binomialHeap0.insert((int) (byte) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode6 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '#');
        int int7 = binomialHeapNode6.getKey();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeapNode6.getParent();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode9 = binomialHeapNode6.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode9, (int) (short) 10);
        binomialHeap0.decreaseKeyValue((int) (byte) 100, (int) '4');
        boolean boolean15 = binomialHeap0.composedRepOK();
        binomialHeap0.insert((int) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for binomialHeap0", binomialHeap0.property_3());
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete(1);
        binomialHeap0.insert(35);
        boolean boolean5 = binomialHeap0.composedRepOK();
        int int6 = binomialHeap0.findMinimum();
        boolean boolean7 = binomialHeap0.property_2();
        boolean boolean8 = binomialHeap0.composedRepOK();
        boolean boolean9 = binomialHeap0.composedRepOK();
        binomialHeap0.insert((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for binomialHeap0", binomialHeap0.property_3());
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) '4');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode4 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '#');
        int int5 = binomialHeapNode4.getKey();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode6 = binomialHeapNode4.getParent();
        binomialHeap0.decreaseKeyNode(binomialHeapNode4, (int) ' ');
        binomialHeap0.insert((int) (byte) 100);
        binomialHeap0.delete(32);
        binomialHeap0.insert(100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for binomialHeap0", binomialHeap0.property_3());
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete(1);
        binomialHeap0.insert((int) (byte) 10);
        binomialHeap0.decreaseKeyValue((int) (byte) 0, (int) '#');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode9 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '#');
        int int10 = binomialHeapNode9.getKey();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode11 = binomialHeapNode9.getParent();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode12 = binomialHeapNode9.getSibling();
        int int13 = binomialHeapNode9.getKey();
        int int14 = binomialHeapNode9.getDegree();
        binomialHeap0.decreaseKeyNode(binomialHeapNode9, (int) (short) 1);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode17 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) (short) 0);
        binomialHeap0.insert(97);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for binomialHeap0", binomialHeap0.property_3());
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) (short) 10);
        boolean boolean7 = binomialHeap0.composedRepOK();
        binomialHeap0.insert((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for binomialHeap0", binomialHeap0.property_3());
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) '4');
        boolean boolean3 = binomialHeap0.property_2();
        binomialHeap0.delete(0);
        binomialHeap0.insert((int) (byte) 100);
        binomialHeap0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for binomialHeap0", binomialHeap0.property_3());
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) '4');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode4 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '#');
        int int5 = binomialHeapNode4.getKey();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode6 = binomialHeapNode4.getParent();
        binomialHeap0.decreaseKeyNode(binomialHeapNode4, (int) ' ');
        binomialHeap0.insert((int) (byte) 100);
        binomialHeap0.delete(32);
        binomialHeap0.insert((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for binomialHeap0", binomialHeap0.property_3());
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) (byte) 1);
        binomialHeap0.decreaseKeyValue((int) (short) 1, (int) (byte) 0);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode11 = new system.testclass.BinomialHeap.BinomialHeapNode((int) (short) 10);
        int int12 = binomialHeapNode11.getKey();
        binomialHeap0.decreaseKeyNode(binomialHeapNode11, 1);
        binomialHeap0.insert(100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for binomialHeap0", binomialHeap0.property_3());
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) (byte) 1);
        binomialHeap0.decreaseKeyValue((int) (short) 1, (int) (byte) 0);
        binomialHeap0.insert(10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for binomialHeap0", binomialHeap0.property_3());
    }
}

