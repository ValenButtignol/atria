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
        binomialHeap0.insert((int) (byte) 0);
        binomialHeap0.delete((int) (short) -1);
        binomialHeap0.insert((int) (short) -1);
        binomialHeap0.insert(32);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for binomialHeap0", binomialHeap0.property_4());
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.property_2();
        binomialHeap0.insert(0);
        binomialHeap0.decreaseKeyValue((int) 'a', 1);
        binomialHeap0.insert((int) '#');
        boolean boolean9 = binomialHeap0.property_2();
        binomialHeap0.insert((int) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for binomialHeap0", binomialHeap0.property_4());
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.insert((int) (byte) 0);
        binomialHeap0.delete((int) (short) -1);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode6 = new system.testclass.BinomialHeap.BinomialHeapNode((int) (byte) 100);
        binomialHeap0.decreaseKeyNode(binomialHeapNode6, 35);
        binomialHeap0.insert(100);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode12 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '#');
        int int13 = binomialHeapNode12.size();
        int int14 = binomialHeapNode12.getDegree();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode15 = binomialHeapNode12.getSibling();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode16 = binomialHeapNode12.getParent();
        binomialHeap0.decreaseKeyNode(binomialHeapNode12, (int) (short) 10);
        binomialHeap0.insert((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for binomialHeap0", binomialHeap0.property_4());
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.insert((int) (byte) 0);
        binomialHeap0.delete((int) (short) -1);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode6 = new system.testclass.BinomialHeap.BinomialHeapNode((int) (byte) 100);
        binomialHeap0.decreaseKeyNode(binomialHeapNode6, 35);
        binomialHeap0.insert(100);
        int int11 = binomialHeap0.findMinimum();
        binomialHeap0.insert((int) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for binomialHeap0", binomialHeap0.property_4());
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete(1);
        binomialHeap0.delete(32);
        boolean boolean5 = binomialHeap0.property_2();
        binomialHeap0.insert((int) (short) 10);
        binomialHeap0.insert((int) (byte) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode11 = new system.testclass.BinomialHeap.BinomialHeapNode((int) '#');
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode12 = binomialHeapNode11.getParent();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode13 = binomialHeapNode11.getParent();
        int int14 = binomialHeapNode11.getKey();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode15 = binomialHeapNode11.getChild();
        binomialHeap0.decreaseKeyNode(binomialHeapNode11, (int) (byte) -1);
        system.testclass.BinomialHeap binomialHeap18 = new system.testclass.BinomialHeap();
        binomialHeap18.insert((int) (byte) 0);
        binomialHeap18.delete((int) (short) -1);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode24 = new system.testclass.BinomialHeap.BinomialHeapNode((int) (byte) 100);
        binomialHeap18.decreaseKeyNode(binomialHeapNode24, 35);
        binomialHeap0.decreaseKeyNode(binomialHeapNode24, (int) (short) 100);
        binomialHeap0.insert(10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for binomialHeap0", binomialHeap0.property_4());
    }
}

