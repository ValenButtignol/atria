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
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.insert((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) (byte) 0);
        binomialHeap0.delete((int) (byte) 100);
        binomialHeap0.insert((int) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode3 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) (byte) 0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode5 = binomialHeap0.extractMin();
        binomialHeap0.delete((int) (short) 100);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode3 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) (byte) -1);
        binomialHeap0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) (byte) 0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode6 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) 'a');
        binomialHeap0.decreaseKeyNode(binomialHeapNode6, 10);
        binomialHeap0.delete((int) (byte) 100);
        binomialHeap0.insert(10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode3 = binomialHeap0.extractMin();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode4 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) (byte) 0);
        boolean boolean5 = binomialHeap0.repOK();
        binomialHeap0.insert((int) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
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
        binomialHeap0.delete((int) (byte) -1);
        binomialHeap0.insert((int) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        boolean boolean3 = binomialHeap0.repOK();
        binomialHeap0.delete(100);
        boolean boolean6 = binomialHeap0.repOK();
        binomialHeap0.delete(0);
        boolean boolean9 = binomialHeap0.repOK();
        binomialHeap0.insert((int) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) (byte) 0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode5 = binomialHeap0.extractMin();
        binomialHeap0.insert(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) (byte) 0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode5 = binomialHeap0.extractMin();
        binomialHeap0.delete((int) (short) 100);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeap0.extractMin();
        binomialHeap0.delete((int) (short) 100);
        binomialHeap0.insert((int) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) (byte) 0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode6 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) 'a');
        binomialHeap0.decreaseKeyNode(binomialHeapNode6, 10);
        binomialHeap0.delete((int) (byte) 100);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode11 = binomialHeap0.extractMin();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode13 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) -1);
        binomialHeap0.decreaseKeyNode(binomialHeapNode13, (int) (short) 0);
        boolean boolean16 = binomialHeap0.repOK();
        binomialHeap0.insert((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
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
        binomialHeap0.delete((int) ' ');
        binomialHeap0.insert((int) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        boolean boolean3 = binomialHeap0.repOK();
        binomialHeap0.delete(100);
        boolean boolean6 = binomialHeap0.repOK();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        binomialHeap0.insert((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        boolean boolean3 = binomialHeap0.repOK();
        binomialHeap0.delete(100);
        binomialHeap0.insert((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) (byte) 0);
        binomialHeap0.insert(100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) (byte) 0);
        binomialHeap0.delete((int) (byte) 100);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        binomialHeap0.delete((int) (byte) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode11 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode12 = binomialHeapNode11.getChild();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode13 = binomialHeapNode11.getSibling();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode14 = binomialHeapNode11.getSibling();
        int int15 = binomialHeapNode11.getKey();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode16 = binomialHeapNode11.getParent();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode17 = binomialHeapNode11.getParent();
        binomialHeap0.decreaseKeyNode(binomialHeapNode11, (int) (short) 0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode21 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (byte) 1);
        binomialHeap0.decreaseKeyNode(binomialHeapNode21, (int) (byte) -1);
        binomialHeap0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) (byte) 0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode6 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) 'a');
        binomialHeap0.decreaseKeyNode(binomialHeapNode6, 10);
        binomialHeap0.delete((int) (byte) 100);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode11 = binomialHeap0.extractMin();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode13 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) -1);
        binomialHeap0.decreaseKeyNode(binomialHeapNode13, (int) (short) 0);
        boolean boolean16 = binomialHeap0.repOK();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode18 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode(100);
        binomialHeap0.decreaseKeyNode(binomialHeapNode18, (int) (byte) 100);
        binomialHeap0.insert((int) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) (byte) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode4 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode5 = binomialHeapNode4.getParent();
        int int6 = binomialHeapNode4.size();
        binomialHeap0.decreaseKeyNode(binomialHeapNode4, (-1));
        binomialHeap0.insert((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) (byte) 0);
        binomialHeap0.delete((int) (byte) 100);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        binomialHeap0.delete((int) (byte) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode10 = binomialHeap0.extractMin();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode11 = binomialHeap0.extractMin();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode12 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) (byte) 0);
        binomialHeap0.delete((int) (byte) 100);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        binomialHeap0.delete((int) ' ');
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode10 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        boolean boolean1 = binomialHeap0.repOK();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode2 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) (byte) 0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode5 = binomialHeap0.extractMin();
        binomialHeap0.delete((int) (short) 10);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeap0.extractMin();
        binomialHeap0.insert(100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) (byte) 0);
        binomialHeap0.delete((int) (byte) 100);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        binomialHeap0.delete((int) (byte) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode10 = binomialHeap0.extractMin();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode11 = binomialHeap0.extractMin();
        binomialHeap0.delete((int) (byte) 100);
        binomialHeap0.insert((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) '#');
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode6 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeapNode6.getChild();
        int int8 = binomialHeapNode6.getDegree();
        int int9 = binomialHeapNode6.size();
        int int10 = binomialHeapNode6.size();
        binomialHeap0.decreaseKeyNode(binomialHeapNode6, (int) (short) -1);
        binomialHeap0.insert(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.insert((int) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
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
        binomialHeap0.delete((int) (byte) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode11 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode12 = binomialHeapNode11.getChild();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode13 = binomialHeapNode11.getSibling();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode14 = binomialHeapNode11.getSibling();
        int int15 = binomialHeapNode11.getKey();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode16 = binomialHeapNode11.getParent();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode17 = binomialHeapNode11.getParent();
        binomialHeap0.decreaseKeyNode(binomialHeapNode11, (int) (short) 0);
        boolean boolean20 = binomialHeap0.repOK();
        binomialHeap0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) (byte) 0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode5 = binomialHeap0.extractMin();
        binomialHeap0.delete((int) (short) 10);
        binomialHeap0.insert(97);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) (byte) 0);
        binomialHeap0.delete((int) (byte) 100);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        binomialHeap0.delete((int) (byte) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode11 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode12 = binomialHeapNode11.getChild();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode13 = binomialHeapNode11.getSibling();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode14 = binomialHeapNode11.getSibling();
        int int15 = binomialHeapNode11.getKey();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode16 = binomialHeapNode11.getParent();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode17 = binomialHeapNode11.getParent();
        binomialHeap0.decreaseKeyNode(binomialHeapNode11, (int) (short) 0);
        boolean boolean20 = binomialHeap0.repOK();
        boolean boolean21 = binomialHeap0.repOK();
        binomialHeap0.insert((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        boolean boolean3 = binomialHeap0.repOK();
        binomialHeap0.delete(100);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode6 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) (byte) 0);
        binomialHeap0.delete((int) (byte) 100);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        binomialHeap0.delete((int) (byte) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode10 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) (byte) 0);
        binomialHeap0.delete((int) (byte) 100);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        binomialHeap0.delete((int) (byte) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode10 = binomialHeap0.extractMin();
        binomialHeap0.insert((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) (byte) 0);
        binomialHeap0.delete((int) (byte) 100);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        binomialHeap0.delete(1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode10 = binomialHeap0.extractMin();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode11 = binomialHeap0.extractMin();
        binomialHeap0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        boolean boolean3 = binomialHeap0.repOK();
        binomialHeap0.delete(100);
        boolean boolean6 = binomialHeap0.repOK();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode8 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode(100);
        binomialHeap0.decreaseKeyNode(binomialHeapNode8, 100);
        binomialHeap0.insert(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) (byte) 0);
        binomialHeap0.delete((int) (byte) 100);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        binomialHeap0.delete((int) (byte) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode10 = binomialHeap0.extractMin();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode11 = binomialHeap0.extractMin();
        binomialHeap0.delete((int) (byte) 100);
        boolean boolean14 = binomialHeap0.repOK();
        binomialHeap0.insert(10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) (byte) 0);
        binomialHeap0.delete((int) (byte) 100);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        binomialHeap0.delete(100);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode10 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) (byte) 0);
        binomialHeap0.delete((int) (byte) 100);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        binomialHeap0.delete((int) (byte) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode11 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode12 = binomialHeapNode11.getChild();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode13 = binomialHeapNode11.getSibling();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode14 = binomialHeapNode11.getSibling();
        int int15 = binomialHeapNode11.getKey();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode16 = binomialHeapNode11.getParent();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode17 = binomialHeapNode11.getParent();
        binomialHeap0.decreaseKeyNode(binomialHeapNode11, (int) (short) 0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode21 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (byte) 1);
        binomialHeap0.decreaseKeyNode(binomialHeapNode21, (int) (byte) -1);
        system.classfixer.classes.BinomialHeap binomialHeap24 = new system.classfixer.classes.BinomialHeap();
        binomialHeap24.delete((int) '4');
        boolean boolean27 = binomialHeap24.repOK();
        binomialHeap24.delete(100);
        boolean boolean30 = binomialHeap24.repOK();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode32 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode(100);
        binomialHeap24.decreaseKeyNode(binomialHeapNode32, 100);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode35 = binomialHeapNode32.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode32, (int) (byte) 1);
        binomialHeap0.delete((int) '4');
        binomialHeap0.insert(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) (byte) 0);
        binomialHeap0.delete((int) (byte) 100);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeap0.extractMin();
        binomialHeap0.delete(0);
        binomialHeap0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) (byte) 0);
        boolean boolean5 = binomialHeap0.repOK();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode6 = binomialHeap0.extractMin();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) (byte) 0);
        binomialHeap0.delete((int) (byte) 100);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        binomialHeap0.delete((int) (byte) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode11 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode12 = binomialHeapNode11.getChild();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode13 = binomialHeapNode11.getSibling();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode14 = binomialHeapNode11.getSibling();
        int int15 = binomialHeapNode11.getKey();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode16 = binomialHeapNode11.getParent();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode17 = binomialHeapNode11.getParent();
        binomialHeap0.decreaseKeyNode(binomialHeapNode11, (int) (short) 0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode21 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (byte) 1);
        binomialHeap0.decreaseKeyNode(binomialHeapNode21, (int) (byte) -1);
        system.classfixer.classes.BinomialHeap binomialHeap24 = new system.classfixer.classes.BinomialHeap();
        binomialHeap24.delete((int) '4');
        boolean boolean27 = binomialHeap24.repOK();
        binomialHeap24.delete(100);
        boolean boolean30 = binomialHeap24.repOK();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode32 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode(100);
        binomialHeap24.decreaseKeyNode(binomialHeapNode32, 100);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode35 = binomialHeapNode32.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode32, (int) (byte) 1);
        binomialHeap0.delete((int) '4');
        boolean boolean40 = binomialHeap0.repOK();
        binomialHeap0.insert((int) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) (byte) 0);
        binomialHeap0.delete((int) (byte) 100);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        binomialHeap0.delete((int) ' ');
        binomialHeap0.insert((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) (byte) 0);
        binomialHeap0.delete((int) (byte) 100);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        binomialHeap0.insert((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        boolean boolean3 = binomialHeap0.repOK();
        binomialHeap0.delete(100);
        boolean boolean6 = binomialHeap0.repOK();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode8 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode9 = binomialHeapNode8.getParent();
        int int10 = binomialHeapNode8.size();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode11 = binomialHeapNode8.getSibling();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode12 = binomialHeapNode8.getParent();
        int int13 = binomialHeapNode8.getDegree();
        binomialHeap0.decreaseKeyNode(binomialHeapNode8, 100);
        binomialHeap0.delete(0);
        binomialHeap0.delete((int) (short) -1);
        binomialHeap0.insert((int) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode3 = binomialHeap0.extractMin();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode4 = binomialHeap0.extractMin();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode5 = binomialHeap0.extractMin();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode6 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        boolean boolean3 = binomialHeap0.repOK();
        binomialHeap0.delete(100);
        boolean boolean6 = binomialHeap0.repOK();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode8 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode(100);
        binomialHeap0.decreaseKeyNode(binomialHeapNode8, 100);
        binomialHeap0.delete((int) (short) 10);
        binomialHeap0.insert(35);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) '#');
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode6 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeapNode6.getParent();
        int int8 = binomialHeapNode6.size();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode9 = binomialHeapNode6.getSibling();
        int int10 = binomialHeapNode6.getDegree();
        int int11 = binomialHeapNode6.getDegree();
        int int12 = binomialHeapNode6.getDegree();
        binomialHeap0.decreaseKeyNode(binomialHeapNode6, (int) (short) 10);
        binomialHeap0.insert((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        boolean boolean3 = binomialHeap0.repOK();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode5 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) ' ');
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode6 = binomialHeapNode5.getParent();
        binomialHeap0.decreaseKeyNode(binomialHeapNode5, 100);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode10 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((-1));
        int int11 = binomialHeapNode10.getDegree();
        binomialHeap0.decreaseKeyNode(binomialHeapNode10, (int) (short) 0);
        binomialHeap0.delete(97);
        binomialHeap0.insert((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        boolean boolean3 = binomialHeap0.repOK();
        binomialHeap0.delete(100);
        boolean boolean6 = binomialHeap0.repOK();
        binomialHeap0.delete(0);
        binomialHeap0.insert((int) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) (byte) 0);
        binomialHeap0.delete((int) (byte) 100);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        binomialHeap0.delete((int) (byte) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode11 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode12 = binomialHeapNode11.getChild();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode13 = binomialHeapNode11.getSibling();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode14 = binomialHeapNode11.getSibling();
        int int15 = binomialHeapNode11.getKey();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode16 = binomialHeapNode11.getParent();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode17 = binomialHeapNode11.getParent();
        binomialHeap0.decreaseKeyNode(binomialHeapNode11, (int) (short) 0);
        binomialHeap0.delete((int) (byte) 100);
        binomialHeap0.insert((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        boolean boolean3 = binomialHeap0.repOK();
        binomialHeap0.delete(100);
        boolean boolean6 = binomialHeap0.repOK();
        binomialHeap0.delete(0);
        binomialHeap0.delete(100);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode11 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        boolean boolean3 = binomialHeap0.repOK();
        binomialHeap0.delete(100);
        boolean boolean6 = binomialHeap0.repOK();
        binomialHeap0.delete(0);
        boolean boolean9 = binomialHeap0.repOK();
        binomialHeap0.insert(97);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) (byte) 0);
        binomialHeap0.delete((int) (byte) 100);
        binomialHeap0.delete((int) 'a');
        boolean boolean9 = binomialHeap0.repOK();
        binomialHeap0.insert((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) (byte) 0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode5 = binomialHeap0.extractMin();
        binomialHeap0.delete((int) (short) 100);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeap0.extractMin();
        boolean boolean9 = binomialHeap0.repOK();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode11 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) '#');
        int int12 = binomialHeapNode11.getKey();
        binomialHeap0.decreaseKeyNode(binomialHeapNode11, (int) (byte) 100);
        binomialHeap0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        boolean boolean3 = binomialHeap0.repOK();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode5 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) ' ');
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode6 = binomialHeapNode5.getParent();
        binomialHeap0.decreaseKeyNode(binomialHeapNode5, 100);
        binomialHeap0.insert((int) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        boolean boolean3 = binomialHeap0.repOK();
        binomialHeap0.delete(100);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) 10);
        int int8 = binomialHeapNode7.getKey();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode9 = binomialHeapNode7.getParent();
        binomialHeap0.decreaseKeyNode(binomialHeapNode7, 1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode12 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) (byte) 0);
        binomialHeap0.insert((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        boolean boolean3 = binomialHeap0.repOK();
        binomialHeap0.delete(100);
        boolean boolean6 = binomialHeap0.repOK();
        binomialHeap0.delete(0);
        binomialHeap0.insert((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        boolean boolean3 = binomialHeap0.repOK();
        binomialHeap0.delete(100);
        boolean boolean6 = binomialHeap0.repOK();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode8 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode(100);
        binomialHeap0.decreaseKeyNode(binomialHeapNode8, 100);
        binomialHeap0.delete((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode14 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) 'a');
        int int15 = binomialHeapNode14.size();
        int int16 = binomialHeapNode14.getDegree();
        binomialHeap0.decreaseKeyNode(binomialHeapNode14, (int) (short) 1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode20 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (byte) 1);
        int int21 = binomialHeapNode20.getKey();
        binomialHeap0.decreaseKeyNode(binomialHeapNode20, 10);
        binomialHeap0.insert((int) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) (byte) 0);
        binomialHeap0.delete((int) (byte) 100);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        binomialHeap0.delete(1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode10 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) (byte) 0);
        binomialHeap0.delete((int) (byte) 100);
        binomialHeap0.delete((int) 'a');
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode9 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        boolean boolean3 = binomialHeap0.repOK();
        binomialHeap0.delete(100);
        boolean boolean6 = binomialHeap0.repOK();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode8 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode(100);
        binomialHeap0.decreaseKeyNode(binomialHeapNode8, 100);
        binomialHeap0.delete((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode14 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (byte) 1);
        binomialHeap0.decreaseKeyNode(binomialHeapNode14, (int) (short) 10);
        binomialHeap0.insert((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) (byte) 0);
        binomialHeap0.delete((int) (byte) 100);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        binomialHeap0.delete((int) (byte) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode11 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode12 = binomialHeapNode11.getChild();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode13 = binomialHeapNode11.getSibling();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode14 = binomialHeapNode11.getSibling();
        int int15 = binomialHeapNode11.getKey();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode16 = binomialHeapNode11.getParent();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode17 = binomialHeapNode11.getParent();
        binomialHeap0.decreaseKeyNode(binomialHeapNode11, (int) (short) 0);
        boolean boolean20 = binomialHeap0.repOK();
        binomialHeap0.insert((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) (byte) 0);
        binomialHeap0.delete((int) (byte) 100);
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        boolean boolean3 = binomialHeap0.repOK();
        binomialHeap0.delete(100);
        boolean boolean6 = binomialHeap0.repOK();
        binomialHeap0.delete(0);
        boolean boolean9 = binomialHeap0.repOK();
        binomialHeap0.insert((int) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        boolean boolean3 = binomialHeap0.repOK();
        binomialHeap0.delete(100);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) 10);
        int int8 = binomialHeapNode7.getKey();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode9 = binomialHeapNode7.getParent();
        binomialHeap0.decreaseKeyNode(binomialHeapNode7, 1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode12 = binomialHeap0.extractMin();
        binomialHeap0.insert(100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) (byte) 0);
        binomialHeap0.delete((int) (byte) 100);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        binomialHeap0.delete((int) (byte) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode11 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode12 = binomialHeapNode11.getChild();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode13 = binomialHeapNode11.getSibling();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode14 = binomialHeapNode11.getSibling();
        int int15 = binomialHeapNode11.getKey();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode16 = binomialHeapNode11.getParent();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode17 = binomialHeapNode11.getParent();
        binomialHeap0.decreaseKeyNode(binomialHeapNode11, (int) (short) 0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode21 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (byte) 1);
        binomialHeap0.decreaseKeyNode(binomialHeapNode21, (int) (byte) -1);
        system.classfixer.classes.BinomialHeap binomialHeap24 = new system.classfixer.classes.BinomialHeap();
        binomialHeap24.delete((int) '4');
        boolean boolean27 = binomialHeap24.repOK();
        binomialHeap24.delete(100);
        boolean boolean30 = binomialHeap24.repOK();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode32 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode(100);
        binomialHeap24.decreaseKeyNode(binomialHeapNode32, 100);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode35 = binomialHeapNode32.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode32, (int) (byte) 1);
        binomialHeap0.delete((int) '4');
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode41 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (byte) -1);
        int int42 = binomialHeapNode41.getDegree();
        int int43 = binomialHeapNode41.size();
        int int44 = binomialHeapNode41.getKey();
        int int45 = binomialHeapNode41.getDegree();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode46 = binomialHeapNode41.getParent();
        binomialHeap0.decreaseKeyNode(binomialHeapNode41, 35);
        binomialHeap0.insert((int) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) (byte) 0);
        binomialHeap0.delete((int) (byte) 100);
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }
}

