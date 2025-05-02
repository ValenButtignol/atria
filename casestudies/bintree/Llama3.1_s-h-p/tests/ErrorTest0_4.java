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
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        boolean boolean1 = binTree0.composedRepOK();
        boolean boolean2 = binTree0.property_3();
        boolean boolean3 = binTree0.composedRepOK();
        boolean boolean4 = binTree0.property_2();
        binTree0.add((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for binTree0", binTree0.property_4());
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        boolean boolean1 = binTree0.property_3();
        boolean boolean2 = binTree0.property_3();
        boolean boolean3 = binTree0.property_3();
        binTree0.add((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for binTree0", binTree0.property_4());
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        boolean boolean1 = binTree0.property_3();
        int int2 = binTree0.getSize();
        boolean boolean3 = binTree0.property_3();
        binTree0.add((int) (byte) 10);
        int int6 = binTree0.getSize();
        binTree0.add((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for binTree0", binTree0.property_4());
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        boolean boolean1 = binTree0.property_3();
        boolean boolean2 = binTree0.property_3();
        binTree0.add((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for binTree0", binTree0.property_4());
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        boolean boolean1 = binTree0.composedRepOK();
        boolean boolean2 = binTree0.property_3();
        boolean boolean3 = binTree0.composedRepOK();
        boolean boolean4 = binTree0.property_3();
        int int5 = binTree0.getSize();
        boolean boolean6 = binTree0.property_3();
        binTree0.add(0);
        binTree0.add((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for binTree0", binTree0.property_4());
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        boolean boolean1 = binTree0.property_3();
        boolean boolean2 = binTree0.property_3();
        boolean boolean3 = binTree0.property_3();
        binTree0.add((int) 'a');
        binTree0.add((int) ' ');
        boolean boolean8 = binTree0.property_3();
        binTree0.add((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for binTree0", binTree0.property_4());
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        boolean boolean1 = binTree0.property_2();
        boolean boolean2 = binTree0.composedRepOK();
        boolean boolean3 = binTree0.composedRepOK();
        boolean boolean4 = binTree0.composedRepOK();
        binTree0.add(10);
        int int7 = binTree0.getSize();
        int int8 = binTree0.getSize();
        binTree0.add((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for binTree0", binTree0.property_4());
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        boolean boolean1 = binTree0.property_2();
        int int2 = binTree0.getSize();
        int int3 = binTree0.getSize();
        binTree0.add((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for binTree0", binTree0.property_4());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        boolean boolean1 = binTree0.composedRepOK();
        boolean boolean2 = binTree0.property_3();
        boolean boolean3 = binTree0.composedRepOK();
        boolean boolean4 = binTree0.property_2();
        int int5 = binTree0.getSize();
        boolean boolean6 = binTree0.property_2();
        binTree0.add((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for binTree0", binTree0.property_4());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) ' ');
        boolean boolean3 = binTree0.property_2();
        boolean boolean4 = binTree0.property_2();
        boolean boolean5 = binTree0.composedRepOK();
        boolean boolean6 = binTree0.composedRepOK();
        boolean boolean7 = binTree0.property_3();
        binTree0.add((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for binTree0", binTree0.property_4());
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        boolean boolean1 = binTree0.property_3();
        int int2 = binTree0.getSize();
        boolean boolean3 = binTree0.property_3();
        boolean boolean4 = binTree0.property_2();
        boolean boolean5 = binTree0.property_3();
        binTree0.add((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for binTree0", binTree0.property_4());
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) ' ');
        boolean boolean3 = binTree0.property_2();
        boolean boolean4 = binTree0.composedRepOK();
        int int5 = binTree0.getSize();
        binTree0.add((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for binTree0", binTree0.property_4());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        boolean boolean1 = binTree0.property_3();
        boolean boolean2 = binTree0.composedRepOK();
        binTree0.add((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for binTree0", binTree0.property_4());
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add(0);
        boolean boolean3 = binTree0.property_3();
        boolean boolean4 = binTree0.composedRepOK();
        binTree0.add((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for binTree0", binTree0.property_4());
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        boolean boolean1 = binTree0.composedRepOK();
        boolean boolean2 = binTree0.property_2();
        binTree0.add((int) (short) 10);
        int int5 = binTree0.getSize();
        binTree0.add(0);
        boolean boolean8 = binTree0.composedRepOK();
        boolean boolean9 = binTree0.property_2();
        binTree0.add((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for binTree0", binTree0.property_4());
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        boolean boolean1 = binTree0.property_3();
        int int2 = binTree0.getSize();
        boolean boolean3 = binTree0.property_3();
        binTree0.add((int) (byte) 10);
        int int6 = binTree0.getSize();
        boolean boolean7 = binTree0.property_2();
        binTree0.add((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for binTree0", binTree0.property_4());
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        boolean boolean1 = binTree0.composedRepOK();
        boolean boolean2 = binTree0.property_2();
        binTree0.add((int) (short) 10);
        boolean boolean5 = binTree0.composedRepOK();
        int int6 = binTree0.getSize();
        binTree0.add((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for binTree0", binTree0.property_4());
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        boolean boolean1 = binTree0.composedRepOK();
        boolean boolean2 = binTree0.property_2();
        binTree0.add((int) (short) 10);
        boolean boolean5 = binTree0.composedRepOK();
        boolean boolean6 = binTree0.composedRepOK();
        binTree0.add((int) (short) 0);
        int int9 = binTree0.getSize();
        boolean boolean10 = binTree0.property_3();
        binTree0.add((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for binTree0", binTree0.property_4());
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) ' ');
        boolean boolean3 = binTree0.property_2();
        boolean boolean4 = binTree0.property_2();
        boolean boolean5 = binTree0.composedRepOK();
        boolean boolean6 = binTree0.property_2();
        binTree0.add((int) ' ');
        binTree0.add((int) (short) 10);
        binTree0.add((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for binTree0", binTree0.property_4());
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        boolean boolean1 = binTree0.composedRepOK();
        boolean boolean2 = binTree0.property_3();
        boolean boolean3 = binTree0.composedRepOK();
        boolean boolean4 = binTree0.property_2();
        boolean boolean5 = binTree0.property_2();
        int int6 = binTree0.getSize();
        binTree0.add((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for binTree0", binTree0.property_4());
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        boolean boolean1 = binTree0.composedRepOK();
        boolean boolean2 = binTree0.property_3();
        boolean boolean3 = binTree0.composedRepOK();
        boolean boolean4 = binTree0.property_2();
        boolean boolean5 = binTree0.composedRepOK();
        binTree0.add(2);
        boolean boolean8 = binTree0.property_2();
        binTree0.add((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for binTree0", binTree0.property_4());
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add(0);
        boolean boolean3 = binTree0.property_3();
        boolean boolean4 = binTree0.composedRepOK();
        binTree0.add(10);
        boolean boolean7 = binTree0.composedRepOK();
        binTree0.add((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for binTree0", binTree0.property_4());
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        boolean boolean1 = binTree0.property_3();
        boolean boolean2 = binTree0.composedRepOK();
        binTree0.add(0);
        int int5 = binTree0.getSize();
        boolean boolean6 = binTree0.property_2();
        binTree0.add((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for binTree0", binTree0.property_4());
    }
}

