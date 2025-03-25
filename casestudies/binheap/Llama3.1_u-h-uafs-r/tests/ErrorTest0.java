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
        binomialHeap0.insert((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) (byte) 0);
        binomialHeap0.delete((int) (byte) 100);
        binomialHeap0.insert((int) (short) 10);
        binomialHeap0.insert(0);
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
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode6 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeapNode6.getChild();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeapNode6.getSibling();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode9 = binomialHeapNode6.getSibling();
        int int10 = binomialHeapNode6.getKey();
        int int11 = binomialHeapNode6.getKey();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode12 = binomialHeapNode6.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode6, 0);
        binomialHeap0.insert(10);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode18 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) ' ');
        int int19 = binomialHeapNode18.getDegree();
        binomialHeap0.decreaseKeyNode(binomialHeapNode18, (int) (short) -1);
        binomialHeap0.insert((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) (byte) 0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode6 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeapNode6.getChild();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeapNode6.getSibling();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode9 = binomialHeapNode6.getSibling();
        int int10 = binomialHeapNode6.getKey();
        int int11 = binomialHeapNode6.getKey();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode12 = binomialHeapNode6.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode6, 0);
        binomialHeap0.insert((int) '#');
        binomialHeap0.delete(0);
        boolean boolean19 = binomialHeap0.repOK();
        boolean boolean20 = binomialHeap0.repOK();
        binomialHeap0.decreaseKeyValue((int) (byte) -1, (int) (short) 100);
        binomialHeap0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.insert((int) ' ');
        binomialHeap0.insert((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.insert((int) ' ');
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode3 = binomialHeap0.extractMin();
        binomialHeap0.insert((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) (byte) 0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode6 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeapNode6.getChild();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeapNode6.getSibling();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode9 = binomialHeapNode6.getSibling();
        int int10 = binomialHeapNode6.getKey();
        int int11 = binomialHeapNode6.getKey();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode12 = binomialHeapNode6.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode6, 0);
        binomialHeap0.insert(10);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode18 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) ' ');
        int int19 = binomialHeapNode18.getDegree();
        binomialHeap0.decreaseKeyNode(binomialHeapNode18, (int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode23 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) 'a');
        int int24 = binomialHeapNode23.size();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode25 = binomialHeapNode23.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode23, (-1));
        binomialHeap0.insert(100);
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
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode6 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeapNode6.getChild();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeapNode6.getSibling();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode9 = binomialHeapNode6.getSibling();
        int int10 = binomialHeapNode6.getKey();
        int int11 = binomialHeapNode6.getKey();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode12 = binomialHeapNode6.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode6, 0);
        binomialHeap0.insert(10);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode18 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) ' ');
        int int19 = binomialHeapNode18.getDegree();
        binomialHeap0.decreaseKeyNode(binomialHeapNode18, (int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode23 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) 'a');
        int int24 = binomialHeapNode23.size();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode25 = binomialHeapNode23.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode23, (-1));
        binomialHeap0.decreaseKeyValue((int) '4', (int) (byte) 0);
        binomialHeap0.insert((int) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        boolean boolean1 = binomialHeap0.repOK();
        binomialHeap0.delete(0);
        binomialHeap0.insert((int) '#');
        binomialHeap0.insert((int) (byte) -1);
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
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode6 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeapNode6.getChild();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeapNode6.getSibling();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode9 = binomialHeapNode6.getSibling();
        int int10 = binomialHeapNode6.getKey();
        int int11 = binomialHeapNode6.getKey();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode12 = binomialHeapNode6.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode6, 0);
        binomialHeap0.insert(10);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode18 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) ' ');
        int int19 = binomialHeapNode18.getDegree();
        binomialHeap0.decreaseKeyNode(binomialHeapNode18, (int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode23 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) 'a');
        int int24 = binomialHeapNode23.size();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode25 = binomialHeapNode23.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode23, (-1));
        system.classfixer.classes.BinomialHeap binomialHeap28 = new system.classfixer.classes.BinomialHeap();
        binomialHeap28.delete((int) '4');
        binomialHeap28.delete((int) (byte) 0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode34 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode35 = binomialHeapNode34.getChild();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode36 = binomialHeapNode34.getSibling();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode37 = binomialHeapNode34.getSibling();
        int int38 = binomialHeapNode34.getKey();
        int int39 = binomialHeapNode34.getKey();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode40 = binomialHeapNode34.getSibling();
        binomialHeap28.decreaseKeyNode(binomialHeapNode34, 0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode43 = binomialHeapNode34.getSibling();
        int int44 = binomialHeapNode34.getDegree();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode45 = binomialHeapNode34.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode34, (int) (byte) 1);
        binomialHeap0.decreaseKeyValue(10, 10);
        binomialHeap0.insert(35);
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
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode6 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeapNode6.getChild();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeapNode6.getSibling();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode9 = binomialHeapNode6.getSibling();
        int int10 = binomialHeapNode6.getKey();
        int int11 = binomialHeapNode6.getKey();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode12 = binomialHeapNode6.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode6, 0);
        binomialHeap0.insert((int) (byte) 1);
        int int17 = binomialHeap0.findMinimum();
        binomialHeap0.insert((int) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) (byte) 0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode6 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeapNode6.getChild();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeapNode6.getSibling();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode9 = binomialHeapNode6.getSibling();
        int int10 = binomialHeapNode6.getKey();
        int int11 = binomialHeapNode6.getKey();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode12 = binomialHeapNode6.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode6, 0);
        binomialHeap0.insert((int) '#');
        binomialHeap0.delete(0);
        boolean boolean19 = binomialHeap0.repOK();
        boolean boolean20 = binomialHeap0.repOK();
        binomialHeap0.decreaseKeyValue((int) '4', 0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode25 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (byte) 0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode26 = binomialHeapNode25.getParent();
        binomialHeap0.decreaseKeyNode(binomialHeapNode25, (int) 'a');
        binomialHeap0.insert((int) 'a');
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
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode6 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeapNode6.getChild();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeapNode6.getSibling();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode9 = binomialHeapNode6.getSibling();
        int int10 = binomialHeapNode6.getKey();
        int int11 = binomialHeapNode6.getKey();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode12 = binomialHeapNode6.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode6, 0);
        binomialHeap0.insert(10);
        boolean boolean17 = binomialHeap0.repOK();
        binomialHeap0.delete(1);
        boolean boolean20 = binomialHeap0.repOK();
        binomialHeap0.decreaseKeyValue((int) (short) 10, (int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode2 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode3 = binomialHeapNode2.getParent();
        int int4 = binomialHeapNode2.size();
        binomialHeap0.decreaseKeyNode(binomialHeapNode2, (int) (byte) 1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        boolean boolean8 = binomialHeap0.repOK();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode9 = binomialHeap0.extractMin();
        binomialHeap0.delete(100);
        binomialHeap0.insert((int) (short) -1);
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
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode6 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeapNode6.getChild();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeapNode6.getSibling();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode9 = binomialHeapNode6.getSibling();
        int int10 = binomialHeapNode6.getKey();
        int int11 = binomialHeapNode6.getKey();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode12 = binomialHeapNode6.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode6, 0);
        binomialHeap0.insert((int) '#');
        binomialHeap0.delete(0);
        boolean boolean19 = binomialHeap0.repOK();
        boolean boolean20 = binomialHeap0.repOK();
        int int21 = binomialHeap0.findMinimum();
        binomialHeap0.insert((int) (short) -1);
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
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode6 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeapNode6.getChild();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeapNode6.getSibling();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode9 = binomialHeapNode6.getSibling();
        int int10 = binomialHeapNode6.getKey();
        int int11 = binomialHeapNode6.getKey();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode12 = binomialHeapNode6.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode6, 0);
        binomialHeap0.insert(10);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode18 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) ' ');
        int int19 = binomialHeapNode18.getDegree();
        binomialHeap0.decreaseKeyNode(binomialHeapNode18, (int) (short) -1);
        boolean boolean22 = binomialHeap0.repOK();
        binomialHeap0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) (byte) 0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode6 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeapNode6.getChild();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeapNode6.getSibling();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode9 = binomialHeapNode6.getSibling();
        int int10 = binomialHeapNode6.getKey();
        int int11 = binomialHeapNode6.getKey();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode12 = binomialHeapNode6.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode6, 0);
        binomialHeap0.insert((int) '#');
        binomialHeap0.delete(0);
        boolean boolean19 = binomialHeap0.repOK();
        boolean boolean20 = binomialHeap0.repOK();
        binomialHeap0.insert(52);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
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
        boolean boolean10 = binomialHeap0.repOK();
        binomialHeap0.insert((int) '4');
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
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode5 = binomialHeap0.extractMin();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode6 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) (byte) -1);
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
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode6 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeapNode6.getChild();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeapNode6.getSibling();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode9 = binomialHeapNode6.getSibling();
        int int10 = binomialHeapNode6.getKey();
        int int11 = binomialHeapNode6.getKey();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode12 = binomialHeapNode6.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode6, 0);
        binomialHeap0.insert((int) '#');
        system.classfixer.classes.BinomialHeap binomialHeap17 = new system.classfixer.classes.BinomialHeap();
        binomialHeap17.delete((int) '4');
        binomialHeap17.delete((int) (byte) 0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode23 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode24 = binomialHeapNode23.getChild();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode25 = binomialHeapNode23.getSibling();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode26 = binomialHeapNode23.getSibling();
        int int27 = binomialHeapNode23.getKey();
        int int28 = binomialHeapNode23.getKey();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode29 = binomialHeapNode23.getSibling();
        binomialHeap17.decreaseKeyNode(binomialHeapNode23, 0);
        int int32 = binomialHeapNode23.getDegree();
        binomialHeap0.decreaseKeyNode(binomialHeapNode23, (int) (short) 0);
        binomialHeap0.insert((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode2 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode3 = binomialHeapNode2.getParent();
        int int4 = binomialHeapNode2.size();
        binomialHeap0.decreaseKeyNode(binomialHeapNode2, (int) (byte) 1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        boolean boolean8 = binomialHeap0.repOK();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode9 = binomialHeap0.extractMin();
        binomialHeap0.delete((int) (byte) 100);
        binomialHeap0.insert((int) (short) 0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode15 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (byte) -1);
        int int16 = binomialHeapNode15.size();
        binomialHeap0.decreaseKeyNode(binomialHeapNode15, (int) (byte) 0);
        boolean boolean19 = binomialHeap0.repOK();
        binomialHeap0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) (byte) 0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode6 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeapNode6.getChild();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeapNode6.getSibling();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode9 = binomialHeapNode6.getSibling();
        int int10 = binomialHeapNode6.getKey();
        int int11 = binomialHeapNode6.getKey();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode12 = binomialHeapNode6.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode6, 0);
        binomialHeap0.insert((int) '#');
        binomialHeap0.insert((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        boolean boolean3 = binomialHeap0.repOK();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode5 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode(0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode6 = binomialHeapNode5.getChild();
        binomialHeap0.decreaseKeyNode(binomialHeapNode5, (int) (byte) 100);
        binomialHeap0.insert((-1));
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
        binomialHeap0.insert((int) (short) 10);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode9 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) (byte) 0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode6 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeapNode6.getChild();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeapNode6.getSibling();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode9 = binomialHeapNode6.getSibling();
        int int10 = binomialHeapNode6.getKey();
        int int11 = binomialHeapNode6.getKey();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode12 = binomialHeapNode6.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode6, 0);
        binomialHeap0.insert(10);
        boolean boolean17 = binomialHeap0.repOK();
        boolean boolean18 = binomialHeap0.repOK();
        binomialHeap0.insert((int) (short) 100);
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
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode6 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        boolean boolean1 = binomialHeap0.repOK();
        boolean boolean2 = binomialHeap0.repOK();
        boolean boolean3 = binomialHeap0.repOK();
        binomialHeap0.delete(0);
        binomialHeap0.insert((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) (byte) 0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode6 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeapNode6.getChild();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeapNode6.getSibling();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode9 = binomialHeapNode6.getSibling();
        int int10 = binomialHeapNode6.getKey();
        int int11 = binomialHeapNode6.getKey();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode12 = binomialHeapNode6.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode6, 0);
        binomialHeap0.insert(10);
        int int17 = binomialHeap0.findMinimum();
        binomialHeap0.insert((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.insert((int) ' ');
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) (byte) 100);
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
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode6 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeapNode6.getChild();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeapNode6.getSibling();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode9 = binomialHeapNode6.getSibling();
        int int10 = binomialHeapNode6.getKey();
        int int11 = binomialHeapNode6.getKey();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode12 = binomialHeapNode6.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode6, 0);
        binomialHeap0.insert((int) (byte) 1);
        int int17 = binomialHeap0.findMinimum();
        binomialHeap0.delete((int) (short) 100);
        binomialHeap0.delete((int) (short) 0);
        binomialHeap0.decreaseKeyValue((int) (byte) 0, (int) (short) 1);
        binomialHeap0.insert(10);
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
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode6 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeapNode6.getChild();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeapNode6.getSibling();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode9 = binomialHeapNode6.getSibling();
        int int10 = binomialHeapNode6.getKey();
        int int11 = binomialHeapNode6.getKey();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode12 = binomialHeapNode6.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode6, 0);
        binomialHeap0.insert((int) (byte) 1);
        int int17 = binomialHeap0.findMinimum();
        binomialHeap0.decreaseKeyValue((int) (byte) -1, (int) (short) 0);
        binomialHeap0.insert((int) (byte) 1);
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
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode6 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeapNode6.getChild();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeapNode6.getSibling();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode9 = binomialHeapNode6.getSibling();
        int int10 = binomialHeapNode6.getKey();
        int int11 = binomialHeapNode6.getKey();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode12 = binomialHeapNode6.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode6, 0);
        binomialHeap0.insert(10);
        boolean boolean17 = binomialHeap0.repOK();
        binomialHeap0.delete(1);
        binomialHeap0.insert((int) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) (byte) 0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode6 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeapNode6.getChild();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeapNode6.getSibling();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode9 = binomialHeapNode6.getSibling();
        int int10 = binomialHeapNode6.getKey();
        int int11 = binomialHeapNode6.getKey();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode12 = binomialHeapNode6.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode6, 0);
        binomialHeap0.insert(10);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode18 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) ' ');
        int int19 = binomialHeapNode18.getDegree();
        binomialHeap0.decreaseKeyNode(binomialHeapNode18, (int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode23 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) 'a');
        int int24 = binomialHeapNode23.size();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode25 = binomialHeapNode23.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode23, (-1));
        binomialHeap0.decreaseKeyValue((int) '4', (int) (byte) 0);
        binomialHeap0.insert(97);
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
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode6 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeapNode6.getChild();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeapNode6.getSibling();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode9 = binomialHeapNode6.getSibling();
        int int10 = binomialHeapNode6.getKey();
        int int11 = binomialHeapNode6.getKey();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode12 = binomialHeapNode6.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode6, 0);
        binomialHeap0.insert((int) '#');
        int int17 = binomialHeap0.findMinimum();
        int int18 = binomialHeap0.findMinimum();
        binomialHeap0.insert((int) (short) 0);
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
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode6 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeapNode6.getChild();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeapNode6.getSibling();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode9 = binomialHeapNode6.getSibling();
        int int10 = binomialHeapNode6.getKey();
        int int11 = binomialHeapNode6.getKey();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode12 = binomialHeapNode6.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode6, 0);
        binomialHeap0.insert(10);
        int int17 = binomialHeap0.findMinimum();
        binomialHeap0.decreaseKeyValue((int) (byte) -1, (int) (short) 10);
        binomialHeap0.insert(0);
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
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode6 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeapNode6.getChild();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeapNode6.getSibling();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode9 = binomialHeapNode6.getSibling();
        int int10 = binomialHeapNode6.getKey();
        int int11 = binomialHeapNode6.getKey();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode12 = binomialHeapNode6.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode6, 0);
        binomialHeap0.insert((int) '#');
        int int17 = binomialHeap0.findMinimum();
        int int18 = binomialHeap0.findMinimum();
        binomialHeap0.insert(32);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) (byte) 0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode6 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeapNode6.getChild();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeapNode6.getSibling();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode9 = binomialHeapNode6.getSibling();
        int int10 = binomialHeapNode6.getKey();
        int int11 = binomialHeapNode6.getKey();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode12 = binomialHeapNode6.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode6, 0);
        binomialHeap0.insert((int) (byte) 1);
        system.classfixer.classes.BinomialHeap binomialHeap17 = new system.classfixer.classes.BinomialHeap();
        binomialHeap17.delete((int) '4');
        binomialHeap17.delete((int) (byte) 0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode23 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode24 = binomialHeapNode23.getChild();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode25 = binomialHeapNode23.getSibling();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode26 = binomialHeapNode23.getSibling();
        int int27 = binomialHeapNode23.getKey();
        int int28 = binomialHeapNode23.getKey();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode29 = binomialHeapNode23.getSibling();
        binomialHeap17.decreaseKeyNode(binomialHeapNode23, 0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode32 = binomialHeapNode23.getSibling();
        int int33 = binomialHeapNode23.getDegree();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode34 = binomialHeapNode23.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode23, 100);
        binomialHeap0.insert((int) (short) -1);
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
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode6 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeapNode6.getChild();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeapNode6.getSibling();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode9 = binomialHeapNode6.getSibling();
        int int10 = binomialHeapNode6.getKey();
        int int11 = binomialHeapNode6.getKey();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode12 = binomialHeapNode6.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode6, 0);
        binomialHeap0.insert(10);
        boolean boolean17 = binomialHeap0.repOK();
        binomialHeap0.decreaseKeyValue((int) (short) 100, 35);
        binomialHeap0.delete(52);
        binomialHeap0.insert(35);
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
        binomialHeap0.insert((int) (byte) 0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode10 = binomialHeap0.extractMin();
        system.classfixer.classes.BinomialHeap binomialHeap11 = new system.classfixer.classes.BinomialHeap();
        binomialHeap11.delete((int) '4');
        binomialHeap11.delete((int) (byte) 0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode17 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode18 = binomialHeapNode17.getChild();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode19 = binomialHeapNode17.getSibling();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode20 = binomialHeapNode17.getSibling();
        int int21 = binomialHeapNode17.getKey();
        int int22 = binomialHeapNode17.getKey();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode23 = binomialHeapNode17.getSibling();
        binomialHeap11.decreaseKeyNode(binomialHeapNode17, 0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode26 = binomialHeapNode17.getSibling();
        int int27 = binomialHeapNode17.getDegree();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode28 = binomialHeapNode17.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode17, (int) (byte) 1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode31 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) (byte) -1);
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
        boolean boolean5 = binomialHeap0.repOK();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) 'a');
        int int8 = binomialHeapNode7.size();
        binomialHeap0.decreaseKeyNode(binomialHeapNode7, (int) (byte) 10);
        binomialHeap0.insert((int) '4');
        binomialHeap0.decreaseKeyValue((int) '4', (int) (short) -1);
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
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode6 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeapNode6.getChild();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeapNode6.getSibling();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode9 = binomialHeapNode6.getSibling();
        int int10 = binomialHeapNode6.getKey();
        int int11 = binomialHeapNode6.getKey();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode12 = binomialHeapNode6.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode6, 0);
        binomialHeap0.insert(10);
        boolean boolean17 = binomialHeap0.repOK();
        binomialHeap0.decreaseKeyValue((int) (short) 100, 35);
        binomialHeap0.delete(52);
        binomialHeap0.insert((int) (byte) 100);
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
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode6 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeapNode6.getChild();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeapNode6.getSibling();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode9 = binomialHeapNode6.getSibling();
        int int10 = binomialHeapNode6.getKey();
        int int11 = binomialHeapNode6.getKey();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode12 = binomialHeapNode6.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode6, 0);
        binomialHeap0.insert((int) (byte) 1);
        binomialHeap0.insert((int) (short) 0);
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
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode6 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeapNode6.getChild();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeapNode6.getSibling();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode9 = binomialHeapNode6.getSibling();
        int int10 = binomialHeapNode6.getKey();
        int int11 = binomialHeapNode6.getKey();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode12 = binomialHeapNode6.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode6, 0);
        binomialHeap0.insert((int) '#');
        binomialHeap0.delete(0);
        boolean boolean19 = binomialHeap0.repOK();
        boolean boolean20 = binomialHeap0.repOK();
        binomialHeap0.decreaseKeyValue((int) '4', 0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode25 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (byte) 0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode26 = binomialHeapNode25.getParent();
        binomialHeap0.decreaseKeyNode(binomialHeapNode25, (int) 'a');
        binomialHeap0.insert(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }
}

