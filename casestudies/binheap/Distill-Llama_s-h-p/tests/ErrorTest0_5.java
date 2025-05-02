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
        boolean boolean1 = binomialHeap0.property_1();
        binomialHeap0.insert((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete(1);
        binomialHeap0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.property_1();
        binomialHeap0.insert((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.composedRepOK();
        binomialHeap0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete(1);
        binomialHeap0.insert(10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.composedRepOK();
        boolean boolean2 = binomialHeap0.composedRepOK();
        binomialHeap0.insert((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.property_1();
        binomialHeap0.delete((int) (short) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode4 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode5 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.property_1();
        boolean boolean2 = binomialHeap0.property_1();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode4 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '#');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode5 = binomialHeapNode4.getParent();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode6 = binomialHeapNode4.getParent();
        int int7 = binomialHeapNode4.getKey();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeapNode4.getChild();
        int int9 = binomialHeapNode4.size();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode10 = binomialHeapNode4.getChild();
        binomialHeap0.decreaseKeyNode(binomialHeapNode10, (int) (byte) 0);
        boolean boolean13 = binomialHeap0.property_2();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode14 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.composedRepOK();
        boolean boolean2 = binomialHeap0.composedRepOK();
        binomialHeap0.delete((int) (short) 10);
        boolean boolean5 = binomialHeap0.composedRepOK();
        boolean boolean6 = binomialHeap0.property_2();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode8 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '#');
        int int9 = binomialHeapNode8.getDegree();
        binomialHeap0.decreaseKeyNode(binomialHeapNode8, (int) (short) 0);
        binomialHeap0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.property_1();
        binomialHeap0.delete((int) (short) -1);
        binomialHeap0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.property_1();
        boolean boolean2 = binomialHeap0.property_2();
        boolean boolean3 = binomialHeap0.property_2();
        binomialHeap0.insert((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.composedRepOK();
        boolean boolean2 = binomialHeap0.composedRepOK();
        binomialHeap0.delete((int) (short) 10);
        boolean boolean5 = binomialHeap0.composedRepOK();
        binomialHeap0.insert((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.composedRepOK();
        boolean boolean2 = binomialHeap0.composedRepOK();
        binomialHeap0.delete((int) (short) 10);
        binomialHeap0.insert((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.composedRepOK();
        boolean boolean2 = binomialHeap0.composedRepOK();
        binomialHeap0.delete((int) (short) 10);
        boolean boolean5 = binomialHeap0.composedRepOK();
        boolean boolean6 = binomialHeap0.property_2();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode8 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '#');
        int int9 = binomialHeapNode8.getDegree();
        binomialHeap0.decreaseKeyNode(binomialHeapNode8, (int) (short) 0);
        boolean boolean12 = binomialHeap0.property_1();
        binomialHeap0.insert(10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.property_1();
        boolean boolean2 = binomialHeap0.property_1();
        binomialHeap0.insert(52);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.property_1();
        boolean boolean2 = binomialHeap0.property_1();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode4 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '#');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode5 = binomialHeapNode4.getParent();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode6 = binomialHeapNode4.getParent();
        int int7 = binomialHeapNode4.getKey();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeapNode4.getChild();
        int int9 = binomialHeapNode4.size();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode10 = binomialHeapNode4.getChild();
        binomialHeap0.decreaseKeyNode(binomialHeapNode10, (int) (byte) 0);
        boolean boolean13 = binomialHeap0.property_2();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode14 = binomialHeap0.extractMin();
        boolean boolean15 = binomialHeap0.property_1();
        binomialHeap0.insert((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.composedRepOK();
        boolean boolean2 = binomialHeap0.composedRepOK();
        boolean boolean3 = binomialHeap0.property_2();
        binomialHeap0.insert(32);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.composedRepOK();
        binomialHeap0.delete((int) ' ');
        boolean boolean4 = binomialHeap0.property_2();
        boolean boolean5 = binomialHeap0.property_1();
        boolean boolean6 = binomialHeap0.property_1();
        binomialHeap0.insert((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete(1);
        binomialHeap0.delete((int) (byte) -1);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode5 = binomialHeap0.extractMin();
        boolean boolean6 = binomialHeap0.property_1();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        boolean boolean8 = binomialHeap0.property_1();
        binomialHeap0.insert((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.composedRepOK();
        binomialHeap0.delete((int) ' ');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode4 = binomialHeap0.extractMin();
        binomialHeap0.delete((int) (short) 100);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        boolean boolean8 = binomialHeap0.composedRepOK();
        binomialHeap0.insert((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.property_1();
        boolean boolean2 = binomialHeap0.property_2();
        boolean boolean3 = binomialHeap0.property_2();
        binomialHeap0.insert((int) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.property_1();
        boolean boolean2 = binomialHeap0.property_1();
        binomialHeap0.delete(1);
        binomialHeap0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.property_1();
        boolean boolean2 = binomialHeap0.property_1();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode4 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '#');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode5 = binomialHeapNode4.getParent();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode6 = binomialHeapNode4.getParent();
        int int7 = binomialHeapNode4.getKey();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeapNode4.getChild();
        int int9 = binomialHeapNode4.size();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode10 = binomialHeapNode4.getChild();
        binomialHeap0.decreaseKeyNode(binomialHeapNode10, (int) (byte) 0);
        boolean boolean13 = binomialHeap0.property_2();
        binomialHeap0.delete((-1));
        binomialHeap0.insert(32);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.composedRepOK();
        boolean boolean2 = binomialHeap0.composedRepOK();
        binomialHeap0.delete((int) (short) 10);
        boolean boolean5 = binomialHeap0.composedRepOK();
        binomialHeap0.insert((int) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.composedRepOK();
        binomialHeap0.delete((int) ' ');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode4 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode6 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '#');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeapNode6.getParent();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeapNode6.getParent();
        int int9 = binomialHeapNode6.getKey();
        int int10 = binomialHeapNode6.getKey();
        int int11 = binomialHeapNode6.getDegree();
        int int12 = binomialHeapNode6.size();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode13 = binomialHeapNode6.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode6, (int) (byte) 10);
        boolean boolean16 = binomialHeap0.property_2();
        binomialHeap0.insert((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.composedRepOK();
        boolean boolean2 = binomialHeap0.composedRepOK();
        boolean boolean3 = binomialHeap0.property_2();
        boolean boolean4 = binomialHeap0.composedRepOK();
        binomialHeap0.insert((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.composedRepOK();
        binomialHeap0.delete((int) ' ');
        boolean boolean4 = binomialHeap0.composedRepOK();
        binomialHeap0.delete(0);
        binomialHeap0.insert((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.property_1();
        boolean boolean2 = binomialHeap0.property_1();
        binomialHeap0.delete(1);
        binomialHeap0.insert((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.composedRepOK();
        boolean boolean2 = binomialHeap0.composedRepOK();
        binomialHeap0.delete((int) (short) 10);
        boolean boolean5 = binomialHeap0.composedRepOK();
        boolean boolean6 = binomialHeap0.property_2();
        boolean boolean7 = binomialHeap0.composedRepOK();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode8 = null;
        binomialHeap0.decreaseKeyNode(binomialHeapNode8, (int) (short) 100);
        binomialHeap0.insert((int) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.composedRepOK();
        binomialHeap0.delete((int) ' ');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode4 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.property_1();
        boolean boolean2 = binomialHeap0.property_1();
        binomialHeap0.insert((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete(1);
        binomialHeap0.delete((int) (byte) -1);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode5 = binomialHeap0.extractMin();
        boolean boolean6 = binomialHeap0.property_1();
        boolean boolean7 = binomialHeap0.property_1();
        binomialHeap0.insert((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.composedRepOK();
        binomialHeap0.delete((int) ' ');
        boolean boolean4 = binomialHeap0.property_2();
        boolean boolean5 = binomialHeap0.property_1();
        boolean boolean6 = binomialHeap0.property_2();
        boolean boolean7 = binomialHeap0.composedRepOK();
        binomialHeap0.insert(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete(32);
        binomialHeap0.insert(32);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete(1);
        boolean boolean3 = binomialHeap0.property_1();
        binomialHeap0.insert((int) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.composedRepOK();
        boolean boolean2 = binomialHeap0.composedRepOK();
        binomialHeap0.delete((int) (short) 10);
        boolean boolean5 = binomialHeap0.composedRepOK();
        boolean boolean6 = binomialHeap0.property_2();
        binomialHeap0.insert((int) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.property_1();
        binomialHeap0.delete((int) (short) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode4 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode6 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '#');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeapNode6.getParent();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeapNode6.getParent();
        int int9 = binomialHeapNode6.getKey();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode10 = binomialHeapNode6.getChild();
        int int11 = binomialHeapNode6.size();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode12 = binomialHeapNode6.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode6, (int) 'a');
        binomialHeap0.insert((int) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.property_1();
        boolean boolean2 = binomialHeap0.property_1();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode4 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '#');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode5 = binomialHeapNode4.getParent();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode6 = binomialHeapNode4.getParent();
        int int7 = binomialHeapNode4.getKey();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeapNode4.getChild();
        int int9 = binomialHeapNode4.size();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode10 = binomialHeapNode4.getChild();
        binomialHeap0.decreaseKeyNode(binomialHeapNode10, (int) (byte) 0);
        boolean boolean13 = binomialHeap0.property_2();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode14 = binomialHeap0.extractMin();
        boolean boolean15 = binomialHeap0.property_2();
        binomialHeap0.insert((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.composedRepOK();
        boolean boolean2 = binomialHeap0.composedRepOK();
        binomialHeap0.delete((int) (short) 10);
        boolean boolean5 = binomialHeap0.composedRepOK();
        boolean boolean6 = binomialHeap0.property_2();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode8 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '#');
        int int9 = binomialHeapNode8.getDegree();
        binomialHeap0.decreaseKeyNode(binomialHeapNode8, (int) (short) 0);
        boolean boolean12 = binomialHeap0.composedRepOK();
        binomialHeap0.insert(52);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete(1);
        binomialHeap0.delete((int) (byte) -1);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode5 = binomialHeap0.extractMin();
        boolean boolean6 = binomialHeap0.property_1();
        boolean boolean7 = binomialHeap0.property_2();
        binomialHeap0.insert(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.composedRepOK();
        binomialHeap0.delete((int) ' ');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode4 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode6 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '#');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeapNode6.getParent();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeapNode6.getParent();
        int int9 = binomialHeapNode6.getKey();
        int int10 = binomialHeapNode6.getKey();
        int int11 = binomialHeapNode6.getDegree();
        int int12 = binomialHeapNode6.size();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode13 = binomialHeapNode6.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode6, (int) (byte) 10);
        boolean boolean16 = binomialHeap0.property_2();
        binomialHeap0.insert(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.composedRepOK();
        binomialHeap0.delete((int) ' ');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode4 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode6 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '#');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeapNode6.getParent();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeapNode6.getParent();
        int int9 = binomialHeapNode6.getKey();
        int int10 = binomialHeapNode6.getKey();
        int int11 = binomialHeapNode6.getDegree();
        int int12 = binomialHeapNode6.size();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode13 = binomialHeapNode6.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode6, (int) (byte) 10);
        boolean boolean16 = binomialHeap0.property_2();
        binomialHeap0.insert((int) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.composedRepOK();
        boolean boolean2 = binomialHeap0.composedRepOK();
        binomialHeap0.delete((int) (short) 10);
        boolean boolean5 = binomialHeap0.composedRepOK();
        boolean boolean6 = binomialHeap0.property_2();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode8 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '#');
        int int9 = binomialHeapNode8.getDegree();
        binomialHeap0.decreaseKeyNode(binomialHeapNode8, (int) (short) 0);
        boolean boolean12 = binomialHeap0.property_1();
        binomialHeap0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.composedRepOK();
        boolean boolean2 = binomialHeap0.composedRepOK();
        binomialHeap0.delete((int) (short) 10);
        boolean boolean5 = binomialHeap0.composedRepOK();
        boolean boolean6 = binomialHeap0.property_2();
        boolean boolean7 = binomialHeap0.composedRepOK();
        boolean boolean8 = binomialHeap0.composedRepOK();
        binomialHeap0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.composedRepOK();
        binomialHeap0.delete((int) ' ');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode4 = binomialHeap0.extractMin();
        boolean boolean5 = binomialHeap0.property_1();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode6 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.composedRepOK();
        binomialHeap0.delete((int) ' ');
        boolean boolean4 = binomialHeap0.property_2();
        boolean boolean5 = binomialHeap0.property_1();
        boolean boolean6 = binomialHeap0.property_2();
        binomialHeap0.delete((int) '#');
        binomialHeap0.insert(97);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.property_1();
        boolean boolean2 = binomialHeap0.property_1();
        binomialHeap0.delete(1);
        boolean boolean5 = binomialHeap0.composedRepOK();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = new system.testclass.BinomialHeap.BinomialHeapNode((int) (byte) 10);
        int int8 = binomialHeapNode7.getKey();
        binomialHeap0.decreaseKeyNode(binomialHeapNode7, (int) '4');
        binomialHeap0.delete((int) (byte) 1);
        binomialHeap0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.property_1();
        boolean boolean2 = binomialHeap0.property_1();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode4 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '#');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode5 = binomialHeapNode4.getParent();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode6 = binomialHeapNode4.getParent();
        int int7 = binomialHeapNode4.getKey();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeapNode4.getChild();
        int int9 = binomialHeapNode4.size();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode10 = binomialHeapNode4.getChild();
        binomialHeap0.decreaseKeyNode(binomialHeapNode10, (int) (byte) 0);
        boolean boolean13 = binomialHeap0.property_2();
        binomialHeap0.delete((-1));
        boolean boolean16 = binomialHeap0.property_1();
        boolean boolean17 = binomialHeap0.property_2();
        binomialHeap0.insert(10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.composedRepOK();
        binomialHeap0.delete((int) ' ');
        boolean boolean4 = binomialHeap0.property_2();
        boolean boolean5 = binomialHeap0.property_1();
        boolean boolean6 = binomialHeap0.property_1();
        binomialHeap0.insert((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.composedRepOK();
        binomialHeap0.delete((int) ' ');
        boolean boolean4 = binomialHeap0.property_2();
        boolean boolean5 = binomialHeap0.property_1();
        boolean boolean6 = binomialHeap0.property_2();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.composedRepOK();
        boolean boolean2 = binomialHeap0.composedRepOK();
        binomialHeap0.delete((int) (short) 10);
        boolean boolean5 = binomialHeap0.composedRepOK();
        boolean boolean6 = binomialHeap0.property_2();
        boolean boolean7 = binomialHeap0.composedRepOK();
        boolean boolean8 = binomialHeap0.property_1();
        system.testclass.BinomialHeap binomialHeap9 = new system.testclass.BinomialHeap();
        boolean boolean10 = binomialHeap9.composedRepOK();
        binomialHeap9.delete((int) ' ');
        boolean boolean13 = binomialHeap9.property_2();
        boolean boolean14 = binomialHeap9.property_1();
        boolean boolean15 = binomialHeap9.property_2();
        boolean boolean16 = binomialHeap9.composedRepOK();
        boolean boolean17 = binomialHeap9.composedRepOK();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode19 = new system.testclass.BinomialHeap.BinomialHeapNode((int) (byte) 10);
        int int20 = binomialHeapNode19.getKey();
        binomialHeap9.decreaseKeyNode(binomialHeapNode19, (int) (byte) 100);
        binomialHeap0.decreaseKeyNode(binomialHeapNode19, (int) (byte) 100);
        binomialHeap0.insert(10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.composedRepOK();
        binomialHeap0.delete((int) (short) 10);
        binomialHeap0.delete((int) (byte) 1);
        boolean boolean6 = binomialHeap0.property_1();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode8 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '#');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode9 = binomialHeapNode8.getParent();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode10 = binomialHeapNode8.getParent();
        int int11 = binomialHeapNode8.getKey();
        int int12 = binomialHeapNode8.getKey();
        int int13 = binomialHeapNode8.getDegree();
        binomialHeap0.decreaseKeyNode(binomialHeapNode8, 1);
        boolean boolean16 = binomialHeap0.property_2();
        binomialHeap0.insert((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.composedRepOK();
        boolean boolean2 = binomialHeap0.composedRepOK();
        boolean boolean3 = binomialHeap0.property_2();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode5 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '#');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode6 = binomialHeapNode5.getSibling();
        int int7 = binomialHeapNode5.size();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeapNode5.getParent();
        binomialHeap0.decreaseKeyNode(binomialHeapNode5, 32);
        binomialHeap0.insert((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.property_1();
        binomialHeap0.delete((int) (short) 10);
        binomialHeap0.delete((int) (byte) 100);
        binomialHeap0.insert((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) (byte) 1);
        binomialHeap0.insert((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.property_1();
        binomialHeap0.delete((int) (short) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode4 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode6 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '#');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeapNode6.getParent();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeapNode6.getParent();
        int int9 = binomialHeapNode6.getKey();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode10 = binomialHeapNode6.getChild();
        int int11 = binomialHeapNode6.size();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode12 = binomialHeapNode6.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode6, (int) 'a');
        boolean boolean15 = binomialHeap0.property_2();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode16 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete(1);
        binomialHeap0.insert((int) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.composedRepOK();
        boolean boolean2 = binomialHeap0.composedRepOK();
        binomialHeap0.delete((int) (short) 10);
        boolean boolean5 = binomialHeap0.property_1();
        boolean boolean6 = binomialHeap0.composedRepOK();
        binomialHeap0.insert((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.property_1();
        binomialHeap0.delete((int) (short) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode4 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode6 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '#');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeapNode6.getParent();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeapNode6.getParent();
        int int9 = binomialHeapNode6.getKey();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode10 = binomialHeapNode6.getChild();
        int int11 = binomialHeapNode6.size();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode12 = binomialHeapNode6.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode6, (int) 'a');
        boolean boolean15 = binomialHeap0.property_2();
        binomialHeap0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.composedRepOK();
        boolean boolean2 = binomialHeap0.composedRepOK();
        boolean boolean3 = binomialHeap0.property_2();
        binomialHeap0.insert((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.property_1();
        binomialHeap0.delete((int) (short) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode4 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode6 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '#');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeapNode6.getParent();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeapNode6.getParent();
        int int9 = binomialHeapNode6.getKey();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode10 = binomialHeapNode6.getChild();
        int int11 = binomialHeapNode6.size();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode12 = binomialHeapNode6.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode6, (int) 'a');
        boolean boolean15 = binomialHeap0.property_2();
        binomialHeap0.insert(100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete(1);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode4 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '#');
        int int5 = binomialHeapNode4.size();
        int int6 = binomialHeapNode4.getDegree();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeapNode4.getChild();
        binomialHeap0.decreaseKeyNode(binomialHeapNode4, (int) '4');
        boolean boolean10 = binomialHeap0.property_2();
        boolean boolean11 = binomialHeap0.property_2();
        binomialHeap0.insert((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.composedRepOK();
        binomialHeap0.delete((int) ' ');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode4 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode6 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '#');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeapNode6.getParent();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeapNode6.getParent();
        int int9 = binomialHeapNode6.getKey();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode10 = binomialHeapNode6.getChild();
        int int11 = binomialHeapNode6.size();
        binomialHeap0.decreaseKeyNode(binomialHeapNode6, 35);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode15 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '#');
        int int16 = binomialHeapNode15.getDegree();
        binomialHeap0.decreaseKeyNode(binomialHeapNode15, (int) (short) -1);
        binomialHeap0.insert((int) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.composedRepOK();
        binomialHeap0.delete((int) (short) 10);
        binomialHeap0.delete((int) (byte) 1);
        binomialHeap0.insert(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.property_1();
        binomialHeap0.delete((int) (short) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode4 = binomialHeap0.extractMin();
        boolean boolean5 = binomialHeap0.property_1();
        boolean boolean6 = binomialHeap0.property_2();
        binomialHeap0.insert((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.property_1();
        boolean boolean2 = binomialHeap0.property_1();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode4 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '#');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode5 = binomialHeapNode4.getParent();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode6 = binomialHeapNode4.getParent();
        int int7 = binomialHeapNode4.getKey();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeapNode4.getChild();
        int int9 = binomialHeapNode4.size();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode10 = binomialHeapNode4.getChild();
        binomialHeap0.decreaseKeyNode(binomialHeapNode10, (int) (byte) 0);
        boolean boolean13 = binomialHeap0.property_2();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode14 = null;
        binomialHeap0.decreaseKeyNode(binomialHeapNode14, 32);
        binomialHeap0.insert((int) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete(32);
        binomialHeap0.delete((int) '4');
        binomialHeap0.insert((int) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.composedRepOK();
        system.testclass.BinomialHeap binomialHeap2 = new system.testclass.BinomialHeap();
        boolean boolean3 = binomialHeap2.composedRepOK();
        boolean boolean4 = binomialHeap2.composedRepOK();
        binomialHeap2.delete((int) (short) 10);
        boolean boolean7 = binomialHeap2.composedRepOK();
        boolean boolean8 = binomialHeap2.property_2();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode10 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '#');
        int int11 = binomialHeapNode10.getDegree();
        binomialHeap2.decreaseKeyNode(binomialHeapNode10, (int) (short) 0);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode15 = new system.testclass.BinomialHeap.BinomialHeapNode(0);
        binomialHeap2.decreaseKeyNode(binomialHeapNode15, (int) (short) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode19 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '#');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode20 = binomialHeapNode19.getParent();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode21 = binomialHeapNode19.getParent();
        int int22 = binomialHeapNode19.getKey();
        int int23 = binomialHeapNode19.getKey();
        int int24 = binomialHeapNode19.getDegree();
        int int25 = binomialHeapNode19.size();
        binomialHeap2.decreaseKeyNode(binomialHeapNode19, (int) 'a');
        int int28 = binomialHeapNode19.getDegree();
        binomialHeap0.decreaseKeyNode(binomialHeapNode19, (int) (byte) 10);
        binomialHeap0.delete(0);
        boolean boolean33 = binomialHeap0.property_2();
        binomialHeap0.delete(35);
        binomialHeap0.insert((int) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete(1);
        binomialHeap0.delete((int) (byte) -1);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode5 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete(1);
        boolean boolean3 = binomialHeap0.property_1();
        binomialHeap0.delete((int) '4');
        boolean boolean6 = binomialHeap0.property_1();
        binomialHeap0.insert(32);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test71");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.composedRepOK();
        boolean boolean2 = binomialHeap0.composedRepOK();
        binomialHeap0.delete((int) (short) 10);
        boolean boolean5 = binomialHeap0.composedRepOK();
        boolean boolean6 = binomialHeap0.property_2();
        boolean boolean7 = binomialHeap0.property_1();
        binomialHeap0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test72");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.composedRepOK();
        binomialHeap0.delete((int) ' ');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode4 = binomialHeap0.extractMin();
        boolean boolean5 = binomialHeap0.property_1();
        binomialHeap0.delete((int) (byte) 1);
        binomialHeap0.insert((int) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test73");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.property_1();
        binomialHeap0.delete((int) (short) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode4 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode6 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '#');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeapNode6.getParent();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeapNode6.getParent();
        int int9 = binomialHeapNode6.getKey();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode10 = binomialHeapNode6.getChild();
        int int11 = binomialHeapNode6.size();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode12 = binomialHeapNode6.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode6, (int) 'a');
        boolean boolean15 = binomialHeap0.property_2();
        boolean boolean16 = binomialHeap0.composedRepOK();
        boolean boolean17 = binomialHeap0.composedRepOK();
        binomialHeap0.insert((int) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test74");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.composedRepOK();
        boolean boolean2 = binomialHeap0.composedRepOK();
        binomialHeap0.delete((int) (short) 10);
        boolean boolean5 = binomialHeap0.composedRepOK();
        boolean boolean6 = binomialHeap0.property_2();
        boolean boolean7 = binomialHeap0.composedRepOK();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode8 = null;
        binomialHeap0.decreaseKeyNode(binomialHeapNode8, (int) (short) 100);
        boolean boolean11 = binomialHeap0.property_1();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode12 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test75");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.composedRepOK();
        boolean boolean2 = binomialHeap0.composedRepOK();
        boolean boolean3 = binomialHeap0.property_2();
        binomialHeap0.delete((int) (byte) 100);
        boolean boolean6 = binomialHeap0.property_2();
        boolean boolean7 = binomialHeap0.composedRepOK();
        binomialHeap0.insert(32);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test76");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.composedRepOK();
        boolean boolean2 = binomialHeap0.composedRepOK();
        binomialHeap0.delete((int) (short) 10);
        boolean boolean5 = binomialHeap0.composedRepOK();
        boolean boolean6 = binomialHeap0.property_2();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode8 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '#');
        int int9 = binomialHeapNode8.getDegree();
        binomialHeap0.decreaseKeyNode(binomialHeapNode8, (int) (short) 0);
        binomialHeap0.insert(35);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test77");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.composedRepOK();
        boolean boolean2 = binomialHeap0.composedRepOK();
        binomialHeap0.delete((int) (short) 10);
        boolean boolean5 = binomialHeap0.composedRepOK();
        boolean boolean6 = binomialHeap0.property_2();
        boolean boolean7 = binomialHeap0.composedRepOK();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode8 = null;
        binomialHeap0.decreaseKeyNode(binomialHeapNode8, (int) (short) 100);
        boolean boolean11 = binomialHeap0.property_1();
        binomialHeap0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test78");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.composedRepOK();
        binomialHeap0.delete((int) (short) 10);
        binomialHeap0.delete((int) (byte) 1);
        boolean boolean6 = binomialHeap0.property_1();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode8 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '#');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode9 = binomialHeapNode8.getParent();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode10 = binomialHeapNode8.getParent();
        int int11 = binomialHeapNode8.getKey();
        int int12 = binomialHeapNode8.getKey();
        int int13 = binomialHeapNode8.getDegree();
        binomialHeap0.decreaseKeyNode(binomialHeapNode8, 1);
        binomialHeap0.insert(32);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test79");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.property_1();
        boolean boolean2 = binomialHeap0.property_1();
        boolean boolean3 = binomialHeap0.composedRepOK();
        binomialHeap0.insert(32);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test80");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.property_1();
        boolean boolean2 = binomialHeap0.property_1();
        boolean boolean3 = binomialHeap0.composedRepOK();
        boolean boolean4 = binomialHeap0.composedRepOK();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode6 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '#');
        int int7 = binomialHeapNode6.size();
        int int8 = binomialHeapNode6.getDegree();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode9 = binomialHeapNode6.getSibling();
        int int10 = binomialHeapNode6.getDegree();
        binomialHeap0.decreaseKeyNode(binomialHeapNode6, (-1));
        boolean boolean13 = binomialHeap0.property_1();
        binomialHeap0.insert((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test81");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.property_1();
        boolean boolean2 = binomialHeap0.property_2();
        boolean boolean3 = binomialHeap0.property_2();
        boolean boolean4 = binomialHeap0.property_2();
        binomialHeap0.insert((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test82");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.composedRepOK();
        boolean boolean2 = binomialHeap0.composedRepOK();
        binomialHeap0.delete((int) (short) 10);
        boolean boolean5 = binomialHeap0.property_1();
        boolean boolean6 = binomialHeap0.composedRepOK();
        binomialHeap0.insert((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test83");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.composedRepOK();
        binomialHeap0.delete((int) ' ');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode4 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode6 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '#');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeapNode6.getParent();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeapNode6.getParent();
        int int9 = binomialHeapNode6.getKey();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode10 = binomialHeapNode6.getChild();
        int int11 = binomialHeapNode6.size();
        binomialHeap0.decreaseKeyNode(binomialHeapNode6, 35);
        boolean boolean14 = binomialHeap0.composedRepOK();
        boolean boolean15 = binomialHeap0.property_2();
        binomialHeap0.insert((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }
}

