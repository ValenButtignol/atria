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
        binomialHeap0.insert(1);
        boolean boolean3 = binomialHeap0.property_1();
        binomialHeap0.insert((int) (short) -1);
        binomialHeap0.decreaseKeyValue((int) ' ', (int) (short) -1);
        binomialHeap0.insert((int) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for binomialHeap0", binomialHeap0.property_2());
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete((int) '4');
        binomialHeap0.delete((int) 'a');
        binomialHeap0.insert((int) (byte) 1);
        int int7 = binomialHeap0.findMinimum();
        boolean boolean8 = binomialHeap0.composedRepOK();
        binomialHeap0.insert((int) (short) 1);
        int int11 = binomialHeap0.findMinimum();
        boolean boolean12 = binomialHeap0.property_1();
        binomialHeap0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for binomialHeap0", binomialHeap0.property_2());
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        system.testclass.BinomialHeap binomialHeap0 = new system.testclass.BinomialHeap();
        binomialHeap0.delete(1);
        binomialHeap0.insert((int) (byte) 10);
        binomialHeap0.decreaseKeyValue(35, 0);
        binomialHeap0.insert(0);
        binomialHeap0.insert(97);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for binomialHeap0", binomialHeap0.property_2());
    }
}

