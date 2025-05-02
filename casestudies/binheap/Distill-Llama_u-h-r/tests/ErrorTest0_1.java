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
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.insert((int) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.insert((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.delete((int) (byte) -1);
        binomialHeap0.delete((int) (byte) 10);
        binomialHeap0.delete((int) ' ');
        binomialHeap0.delete(10);
        binomialHeap0.insert((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.delete((int) (byte) -1);
        binomialHeap0.delete((int) (byte) 10);
        binomialHeap0.insert((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.insert(52);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.delete((int) (byte) -1);
        binomialHeap0.delete((int) (byte) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode9 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '4');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode10 = binomialHeapNode9.getSibling();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode11 = binomialHeapNode9.getSibling();
        int int12 = binomialHeapNode9.size();
        binomialHeap0.decreaseKeyNode(binomialHeapNode9, (int) (byte) 1);
        binomialHeap0.delete((int) (byte) 100);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode18 = new system.testclass.BinomialHeap.BinomialHeapNode(1);
        int int19 = binomialHeapNode18.getKey();
        binomialHeap0.decreaseKeyNode(binomialHeapNode18, (int) '#');
        binomialHeap0.insert(52);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode4 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '4');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode5 = binomialHeapNode4.getSibling();
        int int6 = binomialHeapNode4.size();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeapNode4.getChild();
        binomialHeap0.decreaseKeyNode(binomialHeapNode7, (int) (short) 10);
        binomialHeap0.insert((int) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.delete((int) (byte) -1);
        binomialHeap0.delete((int) (byte) 10);
        binomialHeap0.delete((int) ' ');
        binomialHeap0.delete(10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode11 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.delete((int) (byte) -1);
        binomialHeap0.delete((int) (byte) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode9 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '4');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode10 = binomialHeapNode9.getSibling();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode11 = binomialHeapNode9.getSibling();
        int int12 = binomialHeapNode9.size();
        binomialHeap0.decreaseKeyNode(binomialHeapNode9, (int) (byte) 1);
        binomialHeap0.delete((int) (byte) 100);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode18 = new system.testclass.BinomialHeap.BinomialHeapNode((int) (byte) 0);
        int int19 = binomialHeapNode18.getDegree();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode20 = binomialHeapNode18.getChild();
        binomialHeap0.decreaseKeyNode(binomialHeapNode20, (int) (byte) -1);
        binomialHeap0.insert((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode4 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '4');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode5 = binomialHeapNode4.getSibling();
        int int6 = binomialHeapNode4.size();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeapNode4.getChild();
        binomialHeap0.decreaseKeyNode(binomialHeapNode7, (int) (short) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode10 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.delete((int) (byte) -1);
        binomialHeap0.delete((int) (byte) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode9 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '4');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode10 = binomialHeapNode9.getSibling();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode11 = binomialHeapNode9.getSibling();
        int int12 = binomialHeapNode9.size();
        binomialHeap0.decreaseKeyNode(binomialHeapNode9, (int) (byte) 1);
        binomialHeap0.delete((int) (byte) 100);
        binomialHeap0.insert(52);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.delete((int) ' ');
        binomialHeap0.insert(32);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode1 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.delete((int) (byte) -1);
        binomialHeap0.insert((int) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode1 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.delete((int) (byte) -1);
        binomialHeap0.delete((int) (byte) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode9 = binomialHeap0.extractMin();
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
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode4 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '4');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode5 = binomialHeapNode4.getSibling();
        int int6 = binomialHeapNode4.size();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeapNode4.getChild();
        binomialHeap0.decreaseKeyNode(binomialHeapNode7, (int) (short) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode10 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode12 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '4');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode13 = binomialHeapNode12.getSibling();
        int int14 = binomialHeapNode12.size();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode15 = binomialHeapNode12.getChild();
        int int16 = binomialHeapNode12.getKey();
        binomialHeap0.decreaseKeyNode(binomialHeapNode12, (int) (short) 1);
        binomialHeap0.delete((int) (byte) 0);
        binomialHeap0.insert((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.delete((int) ' ');
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
        binomialHeap0.delete((int) (byte) -1);
        binomialHeap0.delete((int) (byte) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode9 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '4');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode10 = binomialHeapNode9.getSibling();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode11 = binomialHeapNode9.getSibling();
        int int12 = binomialHeapNode9.size();
        binomialHeap0.decreaseKeyNode(binomialHeapNode9, (int) (byte) 1);
        binomialHeap0.insert((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.delete((int) (byte) -1);
        binomialHeap0.delete(52);
        binomialHeap0.insert((int) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.delete((int) (byte) -1);
        binomialHeap0.delete((int) (byte) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode9 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '4');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode10 = binomialHeapNode9.getSibling();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode11 = binomialHeapNode9.getSibling();
        int int12 = binomialHeapNode9.size();
        binomialHeap0.decreaseKeyNode(binomialHeapNode9, (int) (byte) 1);
        binomialHeap0.delete((int) (byte) 100);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode18 = new system.testclass.BinomialHeap.BinomialHeapNode(1);
        int int19 = binomialHeapNode18.getKey();
        binomialHeap0.decreaseKeyNode(binomialHeapNode18, (int) '#');
        binomialHeap0.delete((int) (byte) 0);
        binomialHeap0.insert(35);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.delete((int) (byte) -1);
        binomialHeap0.delete((int) (byte) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeap0.extractMin();
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
        binomialHeap0.delete((int) (byte) -1);
        binomialHeap0.delete((int) (byte) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete(1);
        binomialHeap0.insert((int) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.delete((int) (byte) -1);
        binomialHeap0.delete((int) (byte) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode9 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '4');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode10 = binomialHeapNode9.getSibling();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode11 = binomialHeapNode9.getSibling();
        int int12 = binomialHeapNode9.size();
        binomialHeap0.decreaseKeyNode(binomialHeapNode9, (int) (byte) 1);
        binomialHeap0.delete((int) (byte) 100);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode18 = new system.testclass.BinomialHeap.BinomialHeapNode(1);
        int int19 = binomialHeapNode18.getKey();
        binomialHeap0.decreaseKeyNode(binomialHeapNode18, (int) '#');
        binomialHeap0.delete((int) (byte) 0);
        binomialHeap0.insert((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.delete((int) (byte) -1);
        binomialHeap0.delete((int) (byte) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode9 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '4');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode10 = binomialHeapNode9.getSibling();
        int int11 = binomialHeapNode9.size();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode12 = binomialHeapNode9.getChild();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode13 = binomialHeapNode9.getParent();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode14 = binomialHeapNode9.getParent();
        binomialHeap0.decreaseKeyNode(binomialHeapNode14, (int) ' ');
        binomialHeap0.insert((int) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.delete((int) (byte) -1);
        binomialHeap0.delete((int) (byte) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeap0.extractMin();
        binomialHeap0.delete((int) (short) 10);
        binomialHeap0.delete((int) ' ');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode13 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.delete((int) (byte) -1);
        binomialHeap0.delete((int) (byte) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeap0.extractMin();
        binomialHeap0.delete((int) (short) 10);
        binomialHeap0.insert((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.delete((int) (byte) -1);
        binomialHeap0.delete((int) (byte) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeap0.extractMin();
        binomialHeap0.delete((int) (short) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode11 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode13 = new system.testclass.BinomialHeap.BinomialHeapNode(1);
        int int14 = binomialHeapNode13.getDegree();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode15 = binomialHeapNode13.getChild();
        binomialHeap0.decreaseKeyNode(binomialHeapNode15, (int) 'a');
        binomialHeap0.insert(32);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.delete((int) ' ');
        binomialHeap0.delete((int) (short) 100);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode8 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '4');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode9 = binomialHeapNode8.getSibling();
        int int10 = binomialHeapNode8.size();
        binomialHeap0.decreaseKeyNode(binomialHeapNode8, (int) (short) 10);
        binomialHeap0.insert((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode4 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '4');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode5 = binomialHeapNode4.getSibling();
        int int6 = binomialHeapNode4.size();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeapNode4.getChild();
        binomialHeap0.decreaseKeyNode(binomialHeapNode7, (int) (short) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode10 = binomialHeap0.extractMin();
        binomialHeap0.delete((int) ' ');
        binomialHeap0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete(1);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode4 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '4');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode5 = binomialHeapNode4.getSibling();
        int int6 = binomialHeapNode4.size();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeapNode4.getChild();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeapNode4.getParent();
        int int9 = binomialHeapNode4.getKey();
        binomialHeap0.decreaseKeyNode(binomialHeapNode4, (int) (byte) 1);
        binomialHeap0.insert((int) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.delete((int) (byte) -1);
        binomialHeap0.delete((int) (byte) 0);
        binomialHeap0.delete((int) (byte) 100);
        binomialHeap0.insert((int) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.delete((int) (byte) -1);
        binomialHeap0.delete((int) (byte) 0);
        binomialHeap0.delete((int) (byte) 100);
        binomialHeap0.delete(35);
        binomialHeap0.insert(32);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.delete((int) (byte) -1);
        binomialHeap0.delete((int) (byte) 0);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        binomialHeap0.delete((int) (byte) 100);
        binomialHeap0.insert((int) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.delete((int) ' ');
        binomialHeap0.delete((int) (short) 100);
        binomialHeap0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.delete((int) (byte) -1);
        binomialHeap0.delete(1);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode8 = new system.testclass.BinomialHeap.BinomialHeapNode((int) (byte) 0);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode9 = binomialHeapNode8.getChild();
        binomialHeap0.decreaseKeyNode(binomialHeapNode8, 32);
        binomialHeap0.insert(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode4 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '4');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode5 = binomialHeapNode4.getSibling();
        int int6 = binomialHeapNode4.size();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeapNode4.getChild();
        binomialHeap0.decreaseKeyNode(binomialHeapNode7, (int) (short) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode10 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode12 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '4');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode13 = binomialHeapNode12.getSibling();
        int int14 = binomialHeapNode12.size();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode15 = binomialHeapNode12.getChild();
        int int16 = binomialHeapNode12.getKey();
        binomialHeap0.decreaseKeyNode(binomialHeapNode12, (int) (short) 1);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode20 = new system.testclass.BinomialHeap.BinomialHeapNode(100);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode21 = binomialHeapNode20.getChild();
        binomialHeap0.decreaseKeyNode(binomialHeapNode21, (int) (byte) -1);
        binomialHeap0.insert((int) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.delete((int) (byte) -1);
        binomialHeap0.delete(52);
        binomialHeap0.insert(10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.delete((int) (byte) -1);
        binomialHeap0.delete((int) (byte) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeap0.extractMin();
        binomialHeap0.delete((int) (short) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode11 = binomialHeap0.extractMin();
        binomialHeap0.delete(10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode14 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.delete((int) (byte) -1);
        binomialHeap0.delete((int) (short) 100);
        binomialHeap0.insert(35);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.delete((int) (byte) -1);
        binomialHeap0.delete(52);
        binomialHeap0.insert(52);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.delete((int) (byte) -1);
        binomialHeap0.delete((int) (byte) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeap0.extractMin();
        binomialHeap0.delete((int) (byte) 100);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode11 = binomialHeap0.extractMin();
        binomialHeap0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.delete((int) (byte) -1);
        binomialHeap0.delete((int) (byte) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeap0.extractMin();
        binomialHeap0.delete((int) (short) 10);
        binomialHeap0.delete((int) ' ');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode13 = binomialHeap0.extractMin();
        binomialHeap0.delete((int) (byte) 0);
        binomialHeap0.insert((int) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode1 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode2 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode3 = binomialHeap0.extractMin();
        binomialHeap0.delete((int) (short) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode6 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        binomialHeap0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode4 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '4');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode5 = binomialHeapNode4.getSibling();
        int int6 = binomialHeapNode4.size();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeapNode4.getChild();
        binomialHeap0.decreaseKeyNode(binomialHeapNode7, (int) (short) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode10 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.delete((int) (byte) -1);
        binomialHeap0.delete((int) (byte) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode9 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '4');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode10 = binomialHeapNode9.getSibling();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode11 = binomialHeapNode9.getSibling();
        int int12 = binomialHeapNode9.size();
        binomialHeap0.decreaseKeyNode(binomialHeapNode9, (int) (byte) 1);
        binomialHeap0.delete((int) (byte) 100);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode18 = new system.testclass.BinomialHeap.BinomialHeapNode(1);
        int int19 = binomialHeapNode18.getKey();
        binomialHeap0.decreaseKeyNode(binomialHeapNode18, (int) '#');
        binomialHeap0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.delete((int) (byte) -1);
        binomialHeap0.delete((int) (byte) 10);
        binomialHeap0.delete((int) ' ');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode9 = binomialHeap0.extractMin();
        binomialHeap0.delete((int) (byte) 1);
        binomialHeap0.delete(35);
        binomialHeap0.insert((int) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode4 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '4');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode5 = binomialHeapNode4.getSibling();
        int int6 = binomialHeapNode4.size();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeapNode4.getChild();
        binomialHeap0.decreaseKeyNode(binomialHeapNode7, (int) (short) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode10 = binomialHeap0.extractMin();
        binomialHeap0.delete((int) (short) -1);
        binomialHeap0.insert((int) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.delete((int) ' ');
        binomialHeap0.delete((int) (short) 100);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode8 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '4');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode9 = binomialHeapNode8.getSibling();
        int int10 = binomialHeapNode8.size();
        binomialHeap0.decreaseKeyNode(binomialHeapNode8, (int) (short) 10);
        binomialHeap0.insert(35);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.delete((int) (byte) -1);
        binomialHeap0.delete((int) (short) 100);
        binomialHeap0.delete((int) (byte) 1);
        binomialHeap0.delete(0);
        binomialHeap0.insert((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.delete((int) (byte) -1);
        binomialHeap0.delete((int) (byte) 10);
        binomialHeap0.delete((int) ' ');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode9 = binomialHeap0.extractMin();
        binomialHeap0.delete((int) (byte) 1);
        binomialHeap0.insert(97);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode4 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '4');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode5 = binomialHeapNode4.getSibling();
        int int6 = binomialHeapNode4.size();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeapNode4.getChild();
        binomialHeap0.decreaseKeyNode(binomialHeapNode7, (int) (short) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode10 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode12 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '4');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode13 = binomialHeapNode12.getSibling();
        int int14 = binomialHeapNode12.size();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode15 = binomialHeapNode12.getChild();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode16 = binomialHeapNode12.getParent();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode17 = binomialHeapNode12.getParent();
        int int18 = binomialHeapNode12.getKey();
        binomialHeap0.decreaseKeyNode(binomialHeapNode12, 35);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode22 = new system.testclass.BinomialHeap.BinomialHeapNode((int) (byte) 0);
        int int23 = binomialHeapNode22.size();
        int int24 = binomialHeapNode22.getDegree();
        binomialHeap0.decreaseKeyNode(binomialHeapNode22, (int) 'a');
        binomialHeap0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.delete((int) (byte) -1);
        binomialHeap0.delete((int) (byte) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode9 = binomialHeap0.extractMin();
        binomialHeap0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode4 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '4');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode5 = binomialHeapNode4.getSibling();
        int int6 = binomialHeapNode4.size();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeapNode4.getChild();
        binomialHeap0.decreaseKeyNode(binomialHeapNode7, (int) (short) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode10 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode12 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '4');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode13 = binomialHeapNode12.getSibling();
        int int14 = binomialHeapNode12.size();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode15 = binomialHeapNode12.getChild();
        int int16 = binomialHeapNode12.getKey();
        binomialHeap0.decreaseKeyNode(binomialHeapNode12, (int) (short) 1);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode20 = new system.testclass.BinomialHeap.BinomialHeapNode(100);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode21 = binomialHeapNode20.getChild();
        binomialHeap0.decreaseKeyNode(binomialHeapNode21, (int) (byte) -1);
        binomialHeap0.insert((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode1 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode3 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '4');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode4 = binomialHeapNode3.getSibling();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode5 = binomialHeapNode3.getSibling();
        int int6 = binomialHeapNode3.size();
        binomialHeap0.decreaseKeyNode(binomialHeapNode3, (int) (short) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode10 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '4');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode11 = binomialHeapNode10.getSibling();
        int int12 = binomialHeapNode10.size();
        int int13 = binomialHeapNode10.getDegree();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode14 = binomialHeapNode10.getChild();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode15 = binomialHeapNode10.getParent();
        binomialHeap0.decreaseKeyNode(binomialHeapNode15, (int) '#');
        binomialHeap0.insert((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.delete((int) (byte) -1);
        binomialHeap0.delete(1);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode8 = new system.testclass.BinomialHeap.BinomialHeapNode((int) (byte) 0);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode9 = binomialHeapNode8.getChild();
        binomialHeap0.decreaseKeyNode(binomialHeapNode8, 32);
        binomialHeap0.insert((int) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.delete((int) (byte) -1);
        binomialHeap0.delete((int) (byte) 10);
        binomialHeap0.delete((int) ' ');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode9 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode11 = new system.testclass.BinomialHeap.BinomialHeapNode((int) ' ');
        binomialHeap0.decreaseKeyNode(binomialHeapNode11, 1);
        binomialHeap0.insert((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.delete((int) (byte) -1);
        binomialHeap0.delete((int) (byte) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeap0.extractMin();
        binomialHeap0.delete((int) (short) 10);
        binomialHeap0.delete((int) ' ');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode13 = binomialHeap0.extractMin();
        binomialHeap0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.delete((int) (byte) -1);
        binomialHeap0.delete((int) (byte) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        binomialHeap0.delete((int) (short) -1);
        binomialHeap0.delete((int) (byte) 1);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode12 = null;
        binomialHeap0.decreaseKeyNode(binomialHeapNode12, (int) (short) 10);
        binomialHeap0.insert(100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.delete((int) (byte) -1);
        binomialHeap0.delete((int) (byte) 0);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        binomialHeap0.delete((int) (byte) 100);
        binomialHeap0.delete((int) (byte) 10);
        binomialHeap0.insert((int) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode4 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '4');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode5 = binomialHeapNode4.getSibling();
        int int6 = binomialHeapNode4.size();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeapNode4.getChild();
        binomialHeap0.decreaseKeyNode(binomialHeapNode7, (int) (short) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode10 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode12 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '4');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode13 = binomialHeapNode12.getSibling();
        int int14 = binomialHeapNode12.size();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode15 = binomialHeapNode12.getChild();
        int int16 = binomialHeapNode12.getKey();
        binomialHeap0.decreaseKeyNode(binomialHeapNode12, (int) (short) 1);
        binomialHeap0.delete((int) (byte) -1);
        system.testclass.BinomialHeap binomialHeap21 = new system.testclass.BinomialHeap();
        binomialHeap21.delete((int) 'a');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode25 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '4');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode26 = binomialHeapNode25.getSibling();
        int int27 = binomialHeapNode25.size();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode28 = binomialHeapNode25.getChild();
        binomialHeap21.decreaseKeyNode(binomialHeapNode28, (int) (short) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode31 = binomialHeap21.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode33 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '4');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode34 = binomialHeapNode33.getSibling();
        int int35 = binomialHeapNode33.size();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode36 = binomialHeapNode33.getChild();
        int int37 = binomialHeapNode33.getKey();
        binomialHeap21.decreaseKeyNode(binomialHeapNode33, (int) (short) 1);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode41 = new system.testclass.BinomialHeap.BinomialHeapNode((int) (byte) 0);
        int int42 = binomialHeapNode41.getDegree();
        int int43 = binomialHeapNode41.getDegree();
        binomialHeap21.decreaseKeyNode(binomialHeapNode41, (int) (byte) 1);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode46 = binomialHeapNode41.getChild();
        binomialHeap0.decreaseKeyNode(binomialHeapNode46, (int) (byte) 0);
        binomialHeap0.insert((int) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.delete((int) (byte) -1);
        binomialHeap0.delete((int) (byte) 0);
        binomialHeap0.delete((int) (byte) 100);
        binomialHeap0.insert((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode1 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode3 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '4');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode4 = binomialHeapNode3.getSibling();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode5 = binomialHeapNode3.getSibling();
        int int6 = binomialHeapNode3.size();
        binomialHeap0.decreaseKeyNode(binomialHeapNode3, (int) (short) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode10 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '4');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode11 = binomialHeapNode10.getSibling();
        int int12 = binomialHeapNode10.size();
        int int13 = binomialHeapNode10.getDegree();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode14 = binomialHeapNode10.getChild();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode15 = binomialHeapNode10.getParent();
        binomialHeap0.decreaseKeyNode(binomialHeapNode15, (int) '#');
        binomialHeap0.delete(10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode20 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.delete((int) (byte) -1);
        binomialHeap0.delete((int) (byte) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeap0.extractMin();
        binomialHeap0.delete((int) (short) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode11 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode13 = new system.testclass.BinomialHeap.BinomialHeapNode(1);
        int int14 = binomialHeapNode13.getDegree();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode15 = binomialHeapNode13.getChild();
        binomialHeap0.decreaseKeyNode(binomialHeapNode15, (int) 'a');
        binomialHeap0.insert((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode1 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode1 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode3 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '4');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode4 = binomialHeapNode3.getSibling();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode5 = binomialHeapNode3.getSibling();
        int int6 = binomialHeapNode3.size();
        binomialHeap0.decreaseKeyNode(binomialHeapNode3, (int) (short) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode10 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '4');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode11 = binomialHeapNode10.getSibling();
        int int12 = binomialHeapNode10.size();
        int int13 = binomialHeapNode10.getDegree();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode14 = binomialHeapNode10.getChild();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode15 = binomialHeapNode10.getParent();
        binomialHeap0.decreaseKeyNode(binomialHeapNode15, (int) '#');
        system.testclass.BinomialHeap binomialHeap18 = new system.testclass.BinomialHeap();
        binomialHeap18.delete((int) 'a');
        binomialHeap18.delete((int) (byte) -1);
        binomialHeap18.delete((int) (byte) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode25 = binomialHeap18.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode27 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '4');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode28 = binomialHeapNode27.getSibling();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode29 = binomialHeapNode27.getSibling();
        int int30 = binomialHeapNode27.size();
        binomialHeap18.decreaseKeyNode(binomialHeapNode27, (int) (byte) 1);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode34 = new system.testclass.BinomialHeap.BinomialHeapNode(1);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode35 = binomialHeapNode34.getParent();
        binomialHeap18.decreaseKeyNode(binomialHeapNode34, (int) (short) -1);
        binomialHeap0.decreaseKeyNode(binomialHeapNode34, (int) ' ');
        binomialHeap0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test71");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete(1);
        binomialHeap0.insert((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test72");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.delete((int) (byte) -1);
        binomialHeap0.delete((int) (short) 100);
        binomialHeap0.insert((int) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test73");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.delete((int) (byte) -1);
        binomialHeap0.delete((int) (byte) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeap0.extractMin();
        binomialHeap0.delete((int) (byte) 100);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode11 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test74");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.delete((int) (byte) -1);
        binomialHeap0.delete((int) (byte) 10);
        binomialHeap0.delete((int) ' ');
        binomialHeap0.delete(10);
        binomialHeap0.delete((int) (short) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode13 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test75");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.delete((int) (byte) -1);
        binomialHeap0.delete((int) (byte) 10);
        binomialHeap0.delete((int) ' ');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode9 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test76");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.delete((int) (byte) -1);
        binomialHeap0.delete((int) (byte) 0);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        binomialHeap0.delete((int) (byte) 100);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode11 = new system.testclass.BinomialHeap.BinomialHeapNode((int) (byte) 0);
        int int12 = binomialHeapNode11.getDegree();
        int int13 = binomialHeapNode11.getDegree();
        binomialHeap0.decreaseKeyNode(binomialHeapNode11, 52);
        binomialHeap0.insert((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test77");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.delete((int) (byte) -1);
        binomialHeap0.delete((int) (byte) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode9 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '4');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode10 = binomialHeapNode9.getSibling();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode11 = binomialHeapNode9.getSibling();
        int int12 = binomialHeapNode9.size();
        binomialHeap0.decreaseKeyNode(binomialHeapNode9, (int) (byte) 1);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode16 = new system.testclass.BinomialHeap.BinomialHeapNode(1);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode17 = binomialHeapNode16.getParent();
        binomialHeap0.decreaseKeyNode(binomialHeapNode16, (int) (short) -1);
        binomialHeap0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test78");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.delete((int) (byte) -1);
        binomialHeap0.delete((int) (byte) 10);
        binomialHeap0.delete((int) ' ');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode10 = new system.testclass.BinomialHeap.BinomialHeapNode(1);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode11 = binomialHeapNode10.getParent();
        binomialHeap0.decreaseKeyNode(binomialHeapNode11, (int) (byte) 100);
        binomialHeap0.insert(10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test79");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode4 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '4');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode5 = binomialHeapNode4.getSibling();
        int int6 = binomialHeapNode4.size();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeapNode4.getChild();
        binomialHeap0.decreaseKeyNode(binomialHeapNode7, (int) (short) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode10 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode12 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '4');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode13 = binomialHeapNode12.getSibling();
        int int14 = binomialHeapNode12.size();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode15 = binomialHeapNode12.getChild();
        int int16 = binomialHeapNode12.getKey();
        binomialHeap0.decreaseKeyNode(binomialHeapNode12, (int) (short) 1);
        binomialHeap0.delete((int) (byte) 0);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode21 = binomialHeap0.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode22 = binomialHeap0.extractMin();
        binomialHeap0.delete((int) (byte) 10);
        binomialHeap0.insert(10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }
}

