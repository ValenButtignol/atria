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
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for hashMap1", hashMap1.property_3());
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for hashMap1", hashMap1.property_3());
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for hashMap1", hashMap1.property_3());
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for hashMap1", hashMap1.property_3());
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for hashMap1", hashMap1.property_3());
    }
}

