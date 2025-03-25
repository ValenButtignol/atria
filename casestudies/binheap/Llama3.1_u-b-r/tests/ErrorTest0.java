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
        int int20 = binomialHeap0.findMinimum();
        binomialHeap0.insert((int) 'a');
        binomialHeap0.insert((int) (short) 100);
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
        binomialHeap0.delete((int) (byte) 100);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeap0.extractMin();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode10 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode(10);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode11 = binomialHeapNode10.getParent();
        binomialHeap0.decreaseKeyNode(binomialHeapNode10, (int) (byte) 1);
        binomialHeap0.delete((int) (short) -1);
        binomialHeap0.delete((int) (short) 10);
        boolean boolean18 = binomialHeap0.repOK();
        binomialHeap0.insert((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) (byte) 0);
        binomialHeap0.delete((int) (byte) 100);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        boolean boolean8 = binomialHeap0.repOK();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode9 = binomialHeap0.extractMin();
        system.classfixer.classes.BinomialHeap binomialHeap10 = new system.classfixer.classes.BinomialHeap();
        binomialHeap10.delete((int) '4');
        binomialHeap10.delete((int) (byte) 0);
        binomialHeap10.delete((int) (byte) 100);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode17 = binomialHeap10.extractMin();
        binomialHeap10.insert((int) (byte) 0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode20 = binomialHeap10.extractMin();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode22 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode23 = binomialHeapNode22.getParent();
        int int24 = binomialHeapNode22.size();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode25 = binomialHeapNode22.getSibling();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode26 = binomialHeapNode22.getParent();
        int int27 = binomialHeapNode22.getDegree();
        binomialHeap10.decreaseKeyNode(binomialHeapNode22, (int) ' ');
        int int30 = binomialHeapNode22.getDegree();
        int int31 = binomialHeapNode22.size();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode32 = binomialHeapNode22.getParent();
        binomialHeap0.decreaseKeyNode(binomialHeapNode22, 100);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode36 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (byte) -1);
        int int37 = binomialHeapNode36.size();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode38 = binomialHeapNode36.getChild();
        int int39 = binomialHeapNode36.getKey();
        binomialHeap0.decreaseKeyNode(binomialHeapNode36, (int) (short) 0);
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
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode5 = binomialHeap0.extractMin();
        binomialHeap0.delete((int) (short) 100);
        boolean boolean8 = binomialHeap0.repOK();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode10 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) 10);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode11 = binomialHeapNode10.getSibling();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode12 = binomialHeapNode10.getParent();
        binomialHeap0.decreaseKeyNode(binomialHeapNode10, (int) (short) 10);
        binomialHeap0.delete((int) (byte) -1);
        binomialHeap0.insert((int) (byte) -1);
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
        boolean boolean5 = binomialHeap0.repOK();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeapNode7.getChild();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode9 = binomialHeapNode7.getSibling();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode10 = binomialHeapNode7.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode10, 10);
        boolean boolean13 = binomialHeap0.repOK();
        boolean boolean14 = binomialHeap0.repOK();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode15 = binomialHeap0.extractMin();
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
        boolean boolean5 = binomialHeap0.repOK();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode6 = binomialHeap0.extractMin();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        binomialHeap0.delete((int) (byte) 10);
        binomialHeap0.insert((int) (short) 0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode12 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode2 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode3 = binomialHeapNode2.getParent();
        int int4 = binomialHeapNode2.size();
        binomialHeap0.decreaseKeyNode(binomialHeapNode2, (int) (byte) 1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeap0.extractMin();
        binomialHeap0.delete((int) (short) -1);
        system.classfixer.classes.BinomialHeap binomialHeap11 = new system.classfixer.classes.BinomialHeap();
        binomialHeap11.delete((int) '4');
        binomialHeap11.delete((int) (byte) 0);
        binomialHeap11.delete((int) (byte) 100);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode18 = binomialHeap11.extractMin();
        binomialHeap11.insert((int) (byte) 0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode21 = binomialHeap11.extractMin();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode23 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) 10);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode24 = binomialHeapNode23.getSibling();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode25 = binomialHeapNode23.getParent();
        binomialHeap11.decreaseKeyNode(binomialHeapNode23, 1);
        binomialHeap0.decreaseKeyNode(binomialHeapNode23, (int) (short) 0);
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
        binomialHeap0.delete((int) (byte) 100);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        binomialHeap0.delete(0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode10 = binomialHeap0.extractMin();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode12 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) ' ');
        int int13 = binomialHeapNode12.getDegree();
        binomialHeap0.decreaseKeyNode(binomialHeapNode12, (int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode16 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) (short) 100);
        int int19 = binomialHeap0.findMinimum();
        binomialHeap0.insert((int) (byte) -1);
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
        binomialHeap0.delete((int) (byte) 100);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeap0.extractMin();
        binomialHeap0.delete((int) '#');
        system.classfixer.classes.BinomialHeap binomialHeap11 = new system.classfixer.classes.BinomialHeap();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode13 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode14 = binomialHeapNode13.getParent();
        int int15 = binomialHeapNode13.size();
        binomialHeap11.decreaseKeyNode(binomialHeapNode13, (int) (byte) 1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode18 = binomialHeapNode13.getChild();
        binomialHeap0.decreaseKeyNode(binomialHeapNode13, (int) '4');
        binomialHeap0.insert((-1));
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
        binomialHeap0.insert((int) (byte) 0);
        int int10 = binomialHeap0.findMinimum();
        boolean boolean11 = binomialHeap0.repOK();
        binomialHeap0.decreaseKeyValue((int) (short) 10, (int) (byte) 1);
        binomialHeap0.insert((int) '4');
        binomialHeap0.insert((int) (short) -1);
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
        system.classfixer.classes.BinomialHeap binomialHeap19 = new system.classfixer.classes.BinomialHeap();
        binomialHeap19.delete((int) '4');
        binomialHeap19.delete((int) (byte) 0);
        binomialHeap19.delete((int) (byte) 100);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode26 = binomialHeap19.extractMin();
        binomialHeap19.insert((int) (byte) 0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode29 = binomialHeap19.extractMin();
        boolean boolean30 = binomialHeap19.repOK();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode31 = binomialHeap19.extractMin();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode33 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (byte) 0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode34 = binomialHeapNode33.getParent();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode35 = binomialHeapNode33.getParent();
        binomialHeap19.decreaseKeyNode(binomialHeapNode33, 100);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode38 = binomialHeapNode33.getSibling();
        binomialHeap0.decreaseKeyNode(binomialHeapNode38, (int) (byte) 0);
        binomialHeap0.insert(35);
        binomialHeap0.insert((int) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }
}

