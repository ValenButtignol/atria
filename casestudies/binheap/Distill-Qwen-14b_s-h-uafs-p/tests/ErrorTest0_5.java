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
        boolean boolean1 = binomialHeap0.property_2();
        boolean boolean2 = binomialHeap0.property_2();
        boolean boolean3 = binomialHeap0.property_3();
        binomialHeap0.insert((int) (short) -1);
        boolean boolean6 = binomialHeap0.composedRepOK();
        binomialHeap0.insert(100);
        binomialHeap0.insert((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.property_2();
        boolean boolean2 = binomialHeap0.property_2();
        binomialHeap0.insert((-1));
        boolean boolean5 = binomialHeap0.property_3();
        binomialHeap0.delete((int) '#');
        binomialHeap0.insert((int) (byte) 10);
        system.testclass.BinomialHeap binomialHeap10 = new system.testclass.BinomialHeap();
        boolean boolean11 = binomialHeap10.property_4();
        boolean boolean12 = binomialHeap10.property_4();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode14 = new system.testclass.BinomialHeap.BinomialHeapNode((int) (short) 10);
        binomialHeap10.decreaseKeyNode(binomialHeapNode14, 1);
        int int17 = binomialHeapNode14.size();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode18 = binomialHeapNode14.getParent();
        binomialHeap0.decreaseKeyNode(binomialHeapNode14, (int) (byte) 10);
        boolean boolean21 = binomialHeap0.property_3();
        binomialHeap0.insert((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        boolean boolean1 = binomialHeap0.property_2();
        boolean boolean2 = binomialHeap0.property_2();
        boolean boolean3 = binomialHeap0.property_3();
        binomialHeap0.insert((int) (short) -1);
        boolean boolean6 = binomialHeap0.composedRepOK();
        binomialHeap0.insert(100);
        boolean boolean9 = binomialHeap0.property_4();
        system.testclass.BinomialHeap binomialHeap10 = new system.testclass.BinomialHeap();
        boolean boolean11 = binomialHeap10.property_2();
        boolean boolean12 = binomialHeap10.composedRepOK();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode13 = null;
        binomialHeap10.decreaseKeyNode(binomialHeapNode13, (int) '4');
        binomialHeap10.delete((int) (short) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode19 = new system.testclass.BinomialHeap.BinomialHeapNode((int) (byte) 0);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode20 = binomialHeapNode19.getParent();
        int int21 = binomialHeapNode19.getDegree();
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode22 = binomialHeapNode19.getSibling();
        binomialHeap10.decreaseKeyNode(binomialHeapNode22, (int) (short) 10);
        system.testclass.BinomialHeap.BinomialHeapNode binomialHeapNode26 = new system.testclass.BinomialHeap.BinomialHeapNode((int) (byte) 0);
        int int27 = binomialHeapNode26.size();
        int int28 = binomialHeapNode26.size();
        int int29 = binomialHeapNode26.getDegree();
        binomialHeap10.decreaseKeyNode(binomialHeapNode26, (int) (byte) 10);
        binomialHeap0.decreaseKeyNode(binomialHeapNode26, (int) (byte) 10);
        binomialHeap0.insert((int) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for binomialHeap0", binomialHeap0.property_5());
    }
}

