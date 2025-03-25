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
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) (byte) 0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode10 = binomialHeap0.extractMin();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode11 = binomialHeap0.extractMin();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode12 = binomialHeap0.extractMin();
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
        boolean boolean3 = binomialHeap0.repOK();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode5 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (byte) -1);
        int int6 = binomialHeapNode5.getDegree();
        int int7 = binomialHeapNode5.size();
        binomialHeap0.decreaseKeyNode(binomialHeapNode5, (int) (byte) 100);
        binomialHeap0.insert((int) ' ');
        binomialHeap0.delete((int) (byte) -1);
        binomialHeap0.insert((int) (short) -1);
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
        binomialHeap0.delete((int) (byte) 100);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) (byte) 0);
        int int10 = binomialHeap0.findMinimum();
        boolean boolean11 = binomialHeap0.repOK();
        binomialHeap0.insert((-1));
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
        binomialHeap0.delete((int) (byte) 100);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        binomialHeap0.delete(0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode10 = binomialHeap0.extractMin();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode12 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) ' ');
        int int13 = binomialHeapNode12.getDegree();
        binomialHeap0.decreaseKeyNode(binomialHeapNode12, (int) (short) -1);
        boolean boolean16 = binomialHeap0.repOK();
        binomialHeap0.insert((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode2 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode3 = binomialHeapNode2.getParent();
        int int4 = binomialHeapNode2.size();
        binomialHeap0.decreaseKeyNode(binomialHeapNode2, (int) (byte) 1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeap0.extractMin();
        binomialHeap0.insert(100);
        binomialHeap0.insert((int) (short) -1);
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
        boolean boolean5 = binomialHeap0.repOK();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode6 = binomialHeap0.extractMin();
        binomialHeap0.delete((int) (short) 10);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode10 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (byte) -1);
        int int11 = binomialHeapNode10.getDegree();
        int int12 = binomialHeapNode10.size();
        int int13 = binomialHeapNode10.size();
        binomialHeap0.decreaseKeyNode(binomialHeapNode10, (int) (short) 100);
        binomialHeap0.insert((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode4 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode5 = binomialHeapNode4.getParent();
        int int6 = binomialHeapNode4.size();
        binomialHeap0.decreaseKeyNode(binomialHeapNode4, 1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode10 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode11 = binomialHeapNode10.getChild();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode12 = binomialHeapNode10.getSibling();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode13 = binomialHeapNode10.getSibling();
        int int14 = binomialHeapNode10.getKey();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode15 = binomialHeapNode10.getParent();
        binomialHeap0.decreaseKeyNode(binomialHeapNode10, (int) '4');
        binomialHeap0.insert((int) (short) 100);
        binomialHeap0.insert((int) (short) 1);
        binomialHeap0.insert((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        boolean boolean3 = binomialHeap0.repOK();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode5 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (byte) -1);
        int int6 = binomialHeapNode5.getDegree();
        int int7 = binomialHeapNode5.size();
        binomialHeap0.decreaseKeyNode(binomialHeapNode5, (int) (byte) 100);
        binomialHeap0.delete((int) '#');
        binomialHeap0.insert((int) (short) -1);
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
        binomialHeap0.delete((int) (byte) 100);
        binomialHeap0.insert((int) (short) 10);
        int int9 = binomialHeap0.findMinimum();
        binomialHeap0.insert((int) (short) 100);
        binomialHeap0.decreaseKeyValue(10, (int) (byte) -1);
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
        binomialHeap0.insert((int) '#');
        binomialHeap0.delete(0);
        boolean boolean19 = binomialHeap0.repOK();
        binomialHeap0.decreaseKeyValue((int) (byte) -1, (int) '4');
        binomialHeap0.insert((int) (short) -1);
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
        binomialHeap0.decreaseKeyValue((int) (short) 10, (int) (byte) -1);
        binomialHeap0.insert((int) (byte) -1);
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
        binomialHeap0.delete((int) (byte) 100);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        boolean boolean8 = binomialHeap0.repOK();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode9 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) (short) -1);
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
        binomialHeap0.insert((int) (byte) 1);
        boolean boolean7 = binomialHeap0.repOK();
        binomialHeap0.insert((int) 'a');
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode11 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode12 = binomialHeapNode11.getParent();
        int int13 = binomialHeapNode11.size();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode14 = binomialHeapNode11.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode14, (int) (short) -1);
        system.classfixer.classes.BinomialHeap binomialHeap17 = new system.classfixer.classes.BinomialHeap();
        binomialHeap17.delete((int) '4');
        boolean boolean20 = binomialHeap17.repOK();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode21 = binomialHeap17.extractMin();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode23 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode(100);
        binomialHeap17.decreaseKeyNode(binomialHeapNode23, (int) 'a');
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode26 = binomialHeapNode23.getChild();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode27 = binomialHeapNode23.getParent();
        binomialHeap0.decreaseKeyNode(binomialHeapNode27, (int) 'a');
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode31 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode32 = binomialHeapNode31.getParent();
        int int33 = binomialHeapNode31.size();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode34 = binomialHeapNode31.getSibling();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode35 = binomialHeapNode31.getParent();
        int int36 = binomialHeapNode31.getDegree();
        int int37 = binomialHeapNode31.getDegree();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode38 = binomialHeapNode31.getParent();
        binomialHeap0.decreaseKeyNode(binomialHeapNode38, (int) '4');
        binomialHeap0.insert((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }
}

