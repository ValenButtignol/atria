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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for binomialHeap0", binomialHeap0.property());
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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for binomialHeap0", binomialHeap0.property());
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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for binomialHeap0", binomialHeap0.property());
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        boolean boolean3 = binomialHeap0.repOK();
        binomialHeap0.insert((int) '#');
        binomialHeap0.decreaseKeyValue((int) (short) 10, (int) (byte) 100);
        int int9 = binomialHeap0.findMinimum();
        binomialHeap0.insert((int) (short) -1);
        binomialHeap0.insert((int) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for binomialHeap0", binomialHeap0.property());
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) (byte) 0);
        binomialHeap0.delete((int) (byte) 100);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode7 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) (byte) 0);
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode10 = binomialHeap0.extractMin();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode11 = binomialHeap0.extractMin();
        system.classfixer.classes.BinomialHeap.BinomialHeapNode binomialHeapNode12 = binomialHeap0.extractMin();
        binomialHeap0.insert((int) '#');
        binomialHeap0.insert((int) (byte) 10);
        binomialHeap0.insert(97);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for binomialHeap0", binomialHeap0.property());
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        system.classfixer.classes.BinomialHeap binomialHeap0 = new system.classfixer.classes.BinomialHeap();
        binomialHeap0.delete((int) '4');
        boolean boolean3 = binomialHeap0.repOK();
        binomialHeap0.insert((int) '#');
        binomialHeap0.decreaseKeyValue((int) (short) 10, (int) (byte) 100);
        int int9 = binomialHeap0.findMinimum();
        binomialHeap0.insert((int) (short) -1);
        binomialHeap0.insert(10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for binomialHeap0", binomialHeap0.property());
    }
}

