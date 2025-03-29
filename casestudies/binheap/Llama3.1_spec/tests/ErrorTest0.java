import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        boolean boolean3 = binomialHeap0.repOK();
        binomialHeap0.insert((int) '#');
        binomialHeap0.decreaseKeyValue(100, (int) (short) 0);
        binomialHeap0.insert(0);
        binomialHeap0.insert((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        boolean boolean3 = binomialHeap0.repOK();
        binomialHeap0.insert((int) '#');
        binomialHeap0.decreaseKeyValue(100, (int) (short) 0);
        binomialHeap0.insert(0);
        binomialHeap0.insert((int) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) (byte) 0);
        boolean boolean5 = binomialHeap0.repOK();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (byte) 0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeapNode7.getParent();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode9 = binomialHeapNode7.getParent();
        binomialHeap0.decreaseKeyNode(binomialHeapNode7, 100);
        binomialHeap0.insert(100);
        binomialHeap0.insert((int) (short) 0);
        binomialHeap0.insert(35);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        boolean boolean3 = binomialHeap0.repOK();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode5 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((-1));
        binomialHeap0.decreaseKeyNode(binomialHeapNode5, (int) (byte) 100);
        boolean boolean8 = binomialHeap0.repOK();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode9 = binomialHeap0.extractMin();
        binomialHeap0.delete((int) '4');
        binomialHeap0.insert((int) (short) 0);
        binomialHeap0.insert((int) '#');
        binomialHeap0.insert((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode1 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) '4');
        int int4 = binomialHeap0.findMinimum();
        binomialHeap0.insert((int) (short) -1);
        binomialHeap0.insert(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) (byte) 0);
        boolean boolean5 = binomialHeap0.repOK();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (byte) 0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode8 = binomialHeapNode7.getParent();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode9 = binomialHeapNode7.getParent();
        binomialHeap0.decreaseKeyNode(binomialHeapNode7, 100);
        binomialHeap0.insert(100);
        binomialHeap0.insert((int) (short) 0);
        int int16 = binomialHeap0.findMinimum();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode18 = new system.classfixer.classes.BinomialHeap.BinomialHeapNode((int) (short) -1);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode19 = binomialHeapNode18.getParent();
        int int20 = binomialHeapNode18.size();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode21 = binomialHeapNode18.getSibling();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode22 = binomialHeapNode18.getParent();
        int int23 = binomialHeapNode18.getDegree();
        int int24 = binomialHeapNode18.getDegree();
        int int25 = binomialHeapNode18.size();
        binomialHeap0.decreaseKeyNode(binomialHeapNode18, (int) '4');
        binomialHeap0.insert((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binomialHeap0", binomialHeap0.repOK_2());
    }
}

