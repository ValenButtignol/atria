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
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) (byte) 0);
        binomialHeap0.delete((int) (byte) 100);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) (byte) 0);
        binomialHeap0.insert((int) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for binomialHeap0", binomialHeap0.property());
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) (byte) 0);
        binomialHeap0.delete((int) (byte) 100);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) (byte) 0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode10 = binomialHeap0.extractMin();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode11 = binomialHeap0.extractMin();
        binomialHeap0.insert(100);
        binomialHeap0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for binomialHeap0", binomialHeap0.property());
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        boolean boolean3 = binomialHeap0.repOK();
        binomialHeap0.insert((int) '#');
        boolean boolean6 = binomialHeap0.repOK();
        binomialHeap0.insert(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for binomialHeap0", binomialHeap0.property());
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        boolean boolean3 = binomialHeap0.repOK();
        binomialHeap0.insert((int) '#');
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode(100);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeapNode7.getChild();
        int int9 = binomialHeapNode7.size();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode10 = binomialHeapNode7.getChild();
        binomialHeap0.decreaseKeyNode(binomialHeapNode7, (int) '4');
        boolean boolean13 = binomialHeap0.repOK();
        binomialHeap0.insert((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for binomialHeap0", binomialHeap0.property());
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.insert((int) (short) -1);
        binomialHeap0.insert((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for binomialHeap0", binomialHeap0.property());
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        boolean boolean3 = binomialHeap0.repOK();
        binomialHeap0.insert((int) '#');
        binomialHeap0.decreaseKeyValue((int) 'a', (int) '4');
        system.classfixer.classes.BinomialHeap binomialHeap9 = new system.classfixer.classes.BinomialHeap();
        binomialHeap9.delete((int) '4');
        binomialHeap9.insert((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode15 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (byte) 0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode16 = binomialHeapNode15.getParent();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode17 = binomialHeapNode15.getParent();
        binomialHeap9.decreaseKeyNode(binomialHeapNode15, 100);
        int int20 = binomialHeapNode15.getKey();
        binomialHeap0.decreaseKeyNode(binomialHeapNode15, (int) (byte) -1);
        int int23 = binomialHeap0.findMinimum();
        boolean boolean24 = binomialHeap0.repOK();
        binomialHeap0.insert(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for binomialHeap0", binomialHeap0.property());
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        boolean boolean3 = binomialHeap0.repOK();
        binomialHeap0.insert((int) '#');
        binomialHeap0.decreaseKeyValue((int) 'a', (int) '4');
        binomialHeap0.decreaseKeyValue(0, (int) (byte) 100);
        binomialHeap0.insert(35);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for binomialHeap0", binomialHeap0.property());
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.insert((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode6 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (byte) 0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeapNode6.getParent();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeapNode6.getParent();
        binomialHeap0.decreaseKeyNode(binomialHeapNode6, 100);
        binomialHeap0.delete(0);
        boolean boolean13 = binomialHeap0.repOK();
        binomialHeap0.insert((int) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for binomialHeap0", binomialHeap0.property());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        boolean boolean3 = binomialHeap0.repOK();
        binomialHeap0.insert((int) '#');
        boolean boolean6 = binomialHeap0.repOK();
        boolean boolean7 = binomialHeap0.repOK();
        binomialHeap0.insert(10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for binomialHeap0", binomialHeap0.property());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        boolean boolean3 = binomialHeap0.repOK();
        binomialHeap0.insert((int) '#');
        boolean boolean6 = binomialHeap0.repOK();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode8 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) ' ');
        int int9 = binomialHeapNode8.getDegree();
        binomialHeap0.decreaseKeyNode(binomialHeapNode8, (int) (short) 0);
        binomialHeap0.insert((int) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for binomialHeap0", binomialHeap0.property());
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) (byte) 0);
        binomialHeap0.delete((int) (byte) 100);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) (byte) 0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode10 = binomialHeap0.extractMin();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode11 = binomialHeap0.extractMin();
        binomialHeap0.insert(100);
        binomialHeap0.insert((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for binomialHeap0", binomialHeap0.property());
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        boolean boolean3 = binomialHeap0.repOK();
        binomialHeap0.insert((int) '#');
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode(100);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeapNode7.getChild();
        int int9 = binomialHeapNode7.size();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode10 = binomialHeapNode7.getChild();
        binomialHeap0.decreaseKeyNode(binomialHeapNode7, (int) '4');
        boolean boolean13 = binomialHeap0.repOK();
        binomialHeap0.delete(0);
        int int16 = binomialHeap0.findMinimum();
        binomialHeap0.insert((int) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for binomialHeap0", binomialHeap0.property());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        boolean boolean3 = binomialHeap0.repOK();
        binomialHeap0.insert((int) '#');
        binomialHeap0.decreaseKeyValue((int) 'a', (int) '4');
        system.classfixer.classes.BinomialHeap binomialHeap9 = new system.classfixer.classes.BinomialHeap();
        binomialHeap9.delete((int) '4');
        binomialHeap9.insert((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode15 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (byte) 0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode16 = binomialHeapNode15.getParent();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode17 = binomialHeapNode15.getParent();
        binomialHeap9.decreaseKeyNode(binomialHeapNode15, 100);
        int int20 = binomialHeapNode15.getKey();
        binomialHeap0.decreaseKeyNode(binomialHeapNode15, (int) (byte) -1);
        int int23 = binomialHeap0.findMinimum();
        boolean boolean24 = binomialHeap0.repOK();
        binomialHeap0.decreaseKeyValue((int) (byte) 10, (-1));
        binomialHeap0.insert((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for binomialHeap0", binomialHeap0.property());
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        boolean boolean1 = binomialHeap0.repOK();
        binomialHeap0.insert(100);
        binomialHeap0.insert(35);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for binomialHeap0", binomialHeap0.property());
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) (byte) 0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode5 = binomialHeap0.extractMin();
        binomialHeap0.insert(10);
        binomialHeap0.insert(97);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for binomialHeap0", binomialHeap0.property());
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) (byte) 0);
        binomialHeap0.delete((int) (byte) 100);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) (byte) 0);
        binomialHeap0.insert((int) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for binomialHeap0", binomialHeap0.property());
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        boolean boolean3 = binomialHeap0.repOK();
        binomialHeap0.insert((int) '#');
        binomialHeap0.decreaseKeyValue((int) 'a', (int) '4');
        system.classfixer.classes.BinomialHeap binomialHeap9 = new system.classfixer.classes.BinomialHeap();
        binomialHeap9.delete((int) '4');
        binomialHeap9.insert((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode15 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (byte) 0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode16 = binomialHeapNode15.getParent();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode17 = binomialHeapNode15.getParent();
        binomialHeap9.decreaseKeyNode(binomialHeapNode15, 100);
        int int20 = binomialHeapNode15.getKey();
        binomialHeap0.decreaseKeyNode(binomialHeapNode15, (int) (byte) -1);
        int int23 = binomialHeap0.findMinimum();
        boolean boolean24 = binomialHeap0.repOK();
        binomialHeap0.decreaseKeyValue((int) (byte) 10, (-1));
        binomialHeap0.insert(52);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for binomialHeap0", binomialHeap0.property());
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) (byte) 0);
        binomialHeap0.delete((int) (byte) 100);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) (byte) 0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode10 = binomialHeap0.extractMin();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode11 = binomialHeap0.extractMin();
        binomialHeap0.insert(100);
        int int14 = binomialHeap0.findMinimum();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode16 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode17 = binomialHeapNode16.getParent();
        int int18 = binomialHeapNode16.size();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode19 = binomialHeapNode16.getSibling();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode20 = binomialHeapNode16.getParent();
        binomialHeap0.decreaseKeyNode(binomialHeapNode20, 0);
        binomialHeap0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for binomialHeap0", binomialHeap0.property());
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        boolean boolean3 = binomialHeap0.repOK();
        binomialHeap0.insert((int) '#');
        boolean boolean6 = binomialHeap0.repOK();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode8 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) ' ');
        int int9 = binomialHeapNode8.getDegree();
        binomialHeap0.decreaseKeyNode(binomialHeapNode8, (int) (short) 0);
        int int12 = binomialHeap0.findMinimum();
        binomialHeap0.decreaseKeyValue((int) (short) 1, (int) 'a');
        binomialHeap0.insert((int) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for binomialHeap0", binomialHeap0.property());
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.insert((int) (short) -1);
        int int5 = binomialHeap0.findMinimum();
        binomialHeap0.insert((int) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for binomialHeap0", binomialHeap0.property());
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) (byte) 0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode5 = binomialHeap0.extractMin();
        binomialHeap0.delete(0);
        binomialHeap0.insert(100);
        binomialHeap0.decreaseKeyValue((int) 'a', 1);
        binomialHeap0.insert((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for binomialHeap0", binomialHeap0.property());
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.insert((int) (byte) 10);
        binomialHeap0.insert((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for binomialHeap0", binomialHeap0.property());
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        boolean boolean3 = binomialHeap0.repOK();
        binomialHeap0.insert((int) '#');
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode(100);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeapNode7.getChild();
        int int9 = binomialHeapNode7.size();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode10 = binomialHeapNode7.getChild();
        binomialHeap0.decreaseKeyNode(binomialHeapNode7, (int) '4');
        boolean boolean13 = binomialHeap0.repOK();
        binomialHeap0.decreaseKeyValue((int) (byte) 1, (int) 'a');
        binomialHeap0.decreaseKeyValue(32, (int) (byte) 100);
        boolean boolean20 = binomialHeap0.repOK();
        binomialHeap0.insert(97);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for binomialHeap0", binomialHeap0.property());
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        boolean boolean3 = binomialHeap0.repOK();
        binomialHeap0.insert((int) '#');
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode(100);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeapNode7.getChild();
        int int9 = binomialHeapNode7.size();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode10 = binomialHeapNode7.getChild();
        binomialHeap0.decreaseKeyNode(binomialHeapNode7, (int) '4');
        boolean boolean13 = binomialHeap0.repOK();
        binomialHeap0.decreaseKeyValue((int) (byte) 1, (int) 'a');
        boolean boolean17 = binomialHeap0.repOK();
        binomialHeap0.insert(10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for binomialHeap0", binomialHeap0.property());
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.insert((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode6 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (byte) 0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeapNode6.getParent();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeapNode6.getParent();
        binomialHeap0.decreaseKeyNode(binomialHeapNode6, 100);
        binomialHeap0.delete(0);
        binomialHeap0.delete(97);
        binomialHeap0.decreaseKeyValue((int) (short) 10, 0);
        boolean boolean18 = binomialHeap0.repOK();
        binomialHeap0.insert((int) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for binomialHeap0", binomialHeap0.property());
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        boolean boolean3 = binomialHeap0.repOK();
        binomialHeap0.insert((int) '#');
        boolean boolean6 = binomialHeap0.repOK();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode8 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) ' ');
        int int9 = binomialHeapNode8.getDegree();
        binomialHeap0.decreaseKeyNode(binomialHeapNode8, (int) (short) 0);
        int int12 = binomialHeap0.findMinimum();
        binomialHeap0.decreaseKeyValue((int) (short) 1, (int) 'a');
        binomialHeap0.decreaseKeyValue((-1), (int) '#');
        boolean boolean19 = binomialHeap0.repOK();
        int int20 = binomialHeap0.findMinimum();
        binomialHeap0.insert((int) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for binomialHeap0", binomialHeap0.property());
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode2 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode3 = binomialHeapNode2.getParent();
        int int4 = binomialHeapNode2.size();
        binomialHeap0.decreaseKeyNode(binomialHeapNode2, (int) (byte) 1);
        binomialHeap0.insert((int) (short) 1);
        binomialHeap0.insert(52);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for binomialHeap0", binomialHeap0.property());
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) (byte) 0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode5 = binomialHeap0.extractMin();
        binomialHeap0.delete(0);
        binomialHeap0.insert(100);
        binomialHeap0.decreaseKeyValue((int) 'a', 1);
        binomialHeap0.insert((int) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for binomialHeap0", binomialHeap0.property());
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.insert((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode6 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (byte) 0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeapNode6.getParent();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeapNode6.getParent();
        binomialHeap0.decreaseKeyNode(binomialHeapNode6, 100);
        binomialHeap0.decreaseKeyValue(100, (int) (byte) 0);
        system.classfixer.classes.BinomialHeap binomialHeap14 = new system.classfixer.classes.BinomialHeap();
        binomialHeap14.delete((int) '4');
        binomialHeap14.insert((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode19 = binomialHeap14.extractMin();
        int int20 = binomialHeapNode19.getDegree();
        int int21 = binomialHeapNode19.size();
        int int22 = binomialHeapNode19.getDegree();
        int int23 = binomialHeapNode19.getKey();
        int int24 = binomialHeapNode19.getKey();
        binomialHeap0.decreaseKeyNode(binomialHeapNode19, 35);
        binomialHeap0.insert((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for binomialHeap0", binomialHeap0.property());
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) (byte) 0);
        binomialHeap0.delete((int) (byte) 100);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) (byte) 0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode10 = binomialHeap0.extractMin();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode11 = binomialHeap0.extractMin();
        binomialHeap0.insert(100);
        int int14 = binomialHeap0.findMinimum();
        int int15 = binomialHeap0.findMinimum();
        binomialHeap0.insert(52);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for binomialHeap0", binomialHeap0.property());
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) (byte) 0);
        binomialHeap0.insert(35);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode8 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode(10);
        int int9 = binomialHeapNode8.size();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode10 = binomialHeapNode8.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode10, (int) (byte) -1);
        binomialHeap0.insert((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for binomialHeap0", binomialHeap0.property());
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.insert((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode6 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (byte) 0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeapNode6.getParent();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeapNode6.getParent();
        binomialHeap0.decreaseKeyNode(binomialHeapNode6, 100);
        binomialHeap0.decreaseKeyValue(100, (int) (byte) 0);
        system.classfixer.classes.BinomialHeap binomialHeap14 = new system.classfixer.classes.BinomialHeap();
        binomialHeap14.delete((int) '4');
        binomialHeap14.insert((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode19 = binomialHeap14.extractMin();
        int int20 = binomialHeapNode19.getDegree();
        int int21 = binomialHeapNode19.size();
        int int22 = binomialHeapNode19.getDegree();
        int int23 = binomialHeapNode19.getKey();
        int int24 = binomialHeapNode19.getKey();
        binomialHeap0.decreaseKeyNode(binomialHeapNode19, 35);
        int int27 = binomialHeap0.findMinimum();
        binomialHeap0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for binomialHeap0", binomialHeap0.property());
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.insert((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode6 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (byte) 0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeapNode6.getParent();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeapNode6.getParent();
        binomialHeap0.decreaseKeyNode(binomialHeapNode6, 100);
        binomialHeap0.delete(0);
        binomialHeap0.delete(97);
        binomialHeap0.decreaseKeyValue((int) (short) 10, 0);
        binomialHeap0.decreaseKeyValue((int) '#', (int) (byte) 10);
        binomialHeap0.insert(100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for binomialHeap0", binomialHeap0.property());
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) (byte) 0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode5 = binomialHeap0.extractMin();
        boolean boolean6 = binomialHeap0.repOK();
        binomialHeap0.insert((int) 'a');
        binomialHeap0.insert((int) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for binomialHeap0", binomialHeap0.property());
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) (byte) 0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode5 = binomialHeap0.extractMin();
        binomialHeap0.delete(0);
        binomialHeap0.delete((int) '4');
        binomialHeap0.insert((int) (short) 100);
        binomialHeap0.decreaseKeyValue((int) (byte) 100, (int) (short) 0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode16 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode17 = binomialHeapNode16.getChild();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode18 = binomialHeapNode16.getSibling();
        int int19 = binomialHeapNode16.getKey();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode20 = binomialHeapNode16.getParent();
        binomialHeap0.decreaseKeyNode(binomialHeapNode20, (int) 'a');
        binomialHeap0.insert((int) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for binomialHeap0", binomialHeap0.property());
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        boolean boolean3 = binomialHeap0.repOK();
        binomialHeap0.insert((int) '#');
        boolean boolean6 = binomialHeap0.repOK();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode8 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) ' ');
        int int9 = binomialHeapNode8.getDegree();
        binomialHeap0.decreaseKeyNode(binomialHeapNode8, (int) (short) 0);
        int int12 = binomialHeap0.findMinimum();
        binomialHeap0.decreaseKeyValue((int) (short) 1, (int) 'a');
        binomialHeap0.decreaseKeyValue((-1), (int) '#');
        binomialHeap0.insert(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for binomialHeap0", binomialHeap0.property());
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) (byte) 0);
        binomialHeap0.delete((int) (byte) 100);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) (byte) 0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode10 = binomialHeap0.extractMin();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode11 = binomialHeap0.extractMin();
        binomialHeap0.insert(100);
        int int14 = binomialHeap0.findMinimum();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode16 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode17 = binomialHeapNode16.getParent();
        int int18 = binomialHeapNode16.size();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode19 = binomialHeapNode16.getSibling();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode20 = binomialHeapNode16.getParent();
        binomialHeap0.decreaseKeyNode(binomialHeapNode20, 0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode24 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode25 = binomialHeapNode24.getChild();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode26 = binomialHeapNode24.getSibling();
        int int27 = binomialHeapNode24.getKey();
        int int28 = binomialHeapNode24.getDegree();
        binomialHeap0.decreaseKeyNode(binomialHeapNode24, (int) (short) 0);
        binomialHeap0.insert(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for binomialHeap0", binomialHeap0.property());
    }
}

