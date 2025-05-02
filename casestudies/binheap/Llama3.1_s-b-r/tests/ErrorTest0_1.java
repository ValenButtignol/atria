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
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) 'a');
        binomialHeap0.insert((int) (byte) 10);
        binomialHeap0.insert(0);
        binomialHeap0.decreaseKeyValue((int) '4', (int) (byte) 100);
        int int12 = binomialHeap0.findMinimum();
        binomialHeap0.decreaseKeyValue(10, (-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) 'a');
        binomialHeap0.insert((int) (byte) 10);
        binomialHeap0.insert(0);
        binomialHeap0.decreaseKeyValue((int) '4', (int) (byte) 100);
        int int12 = binomialHeap0.findMinimum();
        binomialHeap0.decreaseKeyValue((int) '4', (int) (short) -1);
        binomialHeap0.decreaseKeyValue((int) 'a', 2);
        binomialHeap0.insert((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) 'a');
        system.testclass.BinomialHeap binomialHeap5 = new system.testclass.BinomialHeap();
        binomialHeap5.delete((int) 'a');
        binomialHeap5.insert((int) 'a');
        binomialHeap5.delete((int) ' ');
        binomialHeap5.insert((int) ' ');
        binomialHeap5.insert((int) 'a');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode16 = binomialHeap5.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode17 = binomialHeap5.extractMin();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode18 = binomialHeap5.extractMin();
        binomialHeap0.decreaseKeyNode(binomialHeapNode18, (int) (short) 10);
        binomialHeap0.insert((int) (byte) 0);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode23 = binomialHeap0.extractMin();
        binomialHeap0.insert((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) 'a');
        binomialHeap0.delete((int) ' ');
        binomialHeap0.insert((int) ' ');
        binomialHeap0.insert((int) 'a');
        system.testclass.BinomialHeap binomialHeap11 = new system.testclass.BinomialHeap();
        binomialHeap11.delete((int) 'a');
        binomialHeap11.insert((int) 'a');
        binomialHeap11.insert((int) (byte) 100);
        binomialHeap11.decreaseKeyValue((int) (byte) 0, 0);
        binomialHeap11.delete((int) 'a');
        binomialHeap11.delete((int) (short) -1);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode25 = binomialHeap11.extractMin();
        binomialHeap0.decreaseKeyNode(binomialHeapNode25, 52);
        binomialHeap0.decreaseKeyValue(10, (int) (short) 1);
        binomialHeap0.insert((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) 'a');
        binomialHeap0.delete((int) ' ');
        binomialHeap0.insert((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) 'a');
        binomialHeap0.insert((int) (byte) 100);
        binomialHeap0.decreaseKeyValue((int) (byte) 0, 0);
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) '4');
        int int14 = binomialHeap0.findMinimum();
        binomialHeap0.delete((int) (byte) 0);
        binomialHeap0.decreaseKeyValue((int) (byte) 100, (int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test7");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) 'a');
        binomialHeap0.insert((int) (byte) 100);
        binomialHeap0.decreaseKeyValue((int) (byte) 0, 0);
        binomialHeap0.delete((int) 'a');
        binomialHeap0.decreaseKeyValue(97, (int) (short) -1);
        binomialHeap0.insert((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binomialHeap0", binomialHeap0.repOK_1());
    }
}

