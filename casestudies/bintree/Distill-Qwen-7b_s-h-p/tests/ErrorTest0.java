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
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        boolean boolean1 = binTree0.property();
        int int2 = binTree0.getSize();
        int int3 = binTree0.getSize();
        boolean boolean4 = binTree0.property();
        boolean boolean5 = binTree0.repOK();
        binTree0.add((int) (short) 1);
        binTree0.add((-1));
        binTree0.add((int) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for binTree0", binTree0.property_2());
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        int int3 = binTree0.getSize();
        boolean boolean4 = binTree0.property();
        int int5 = binTree0.getSize();
        boolean boolean6 = binTree0.repOK();
        boolean boolean7 = binTree0.repOK();
        binTree0.add(10);
        binTree0.add((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for binTree0", binTree0.property_2());
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        boolean boolean1 = binTree0.property();
        int int2 = binTree0.getSize();
        int int3 = binTree0.getSize();
        boolean boolean4 = binTree0.property();
        boolean boolean5 = binTree0.repOK();
        binTree0.add((int) (short) 1);
        binTree0.add((int) (byte) 100);
        boolean boolean10 = binTree0.property();
        binTree0.add((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for binTree0", binTree0.property_2());
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        boolean boolean1 = binTree0.repOK();
        binTree0.add((int) (byte) 1);
        binTree0.add((int) (short) 10);
        int int6 = binTree0.getSize();
        binTree0.add((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for binTree0", binTree0.property_2());
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        boolean boolean1 = binTree0.property();
        binTree0.add((int) (byte) 0);
        binTree0.add((-1));
        binTree0.add((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for binTree0", binTree0.property_2());
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        boolean boolean1 = binTree0.property();
        binTree0.add((int) (byte) 0);
        boolean boolean4 = binTree0.property();
        int int5 = binTree0.getSize();
        boolean boolean6 = binTree0.property();
        boolean boolean7 = binTree0.repOK();
        binTree0.add(0);
        binTree0.add((int) (short) 1);
        binTree0.add((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for binTree0", binTree0.property_2());
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        boolean boolean1 = binTree0.repOK();
        boolean boolean2 = binTree0.property();
        boolean boolean3 = binTree0.repOK();
        boolean boolean4 = binTree0.repOK();
        binTree0.add(1);
        binTree0.add(3);
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for binTree0", binTree0.property_2());
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        boolean boolean1 = binTree0.property();
        binTree0.add((int) (byte) 0);
        int int4 = binTree0.getSize();
        binTree0.add((int) (byte) 100);
        binTree0.add((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for binTree0", binTree0.property_2());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        int int3 = binTree0.getSize();
        boolean boolean4 = binTree0.property();
        int int5 = binTree0.getSize();
        boolean boolean6 = binTree0.property();
        int int7 = binTree0.getSize();
        binTree0.add((-1));
        binTree0.add((int) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for binTree0", binTree0.property_2());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        binTree0.add((-1));
        boolean boolean5 = binTree0.property();
        boolean boolean6 = binTree0.repOK();
        boolean boolean7 = binTree0.repOK();
        binTree0.add((int) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for binTree0", binTree0.property_2());
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        int int3 = binTree0.getSize();
        boolean boolean4 = binTree0.property();
        int int5 = binTree0.getSize();
        boolean boolean6 = binTree0.property();
        int int7 = binTree0.getSize();
        int int8 = binTree0.getSize();
        binTree0.add(2);
        int int11 = binTree0.getSize();
        binTree0.add((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for binTree0", binTree0.property_2());
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        int int5 = binTree0.getSize();
        boolean boolean6 = binTree0.repOK();
        boolean boolean7 = binTree0.repOK();
        boolean boolean8 = binTree0.repOK();
        boolean boolean9 = binTree0.property();
        boolean boolean10 = binTree0.property();
        binTree0.add((int) (byte) 0);
        binTree0.add((int) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for binTree0", binTree0.property_2());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        int int3 = binTree0.getSize();
        boolean boolean4 = binTree0.property();
        int int5 = binTree0.getSize();
        boolean boolean6 = binTree0.property();
        int int7 = binTree0.getSize();
        binTree0.add((-1));
        boolean boolean10 = binTree0.property();
        binTree0.add(2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for binTree0", binTree0.property_2());
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        int int3 = binTree0.getSize();
        boolean boolean4 = binTree0.property();
        int int5 = binTree0.getSize();
        boolean boolean6 = binTree0.property();
        int int7 = binTree0.getSize();
        int int8 = binTree0.getSize();
        binTree0.add(2);
        boolean boolean11 = binTree0.property();
        boolean boolean12 = binTree0.property();
        boolean boolean13 = binTree0.repOK();
        boolean boolean14 = binTree0.repOK();
        boolean boolean15 = binTree0.repOK();
        binTree0.add((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for binTree0", binTree0.property_2());
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        binTree0.add((-1));
        boolean boolean5 = binTree0.property();
        boolean boolean6 = binTree0.repOK();
        boolean boolean7 = binTree0.repOK();
        binTree0.add((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for binTree0", binTree0.property_2());
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        boolean boolean1 = binTree0.repOK();
        binTree0.add((int) (byte) 1);
        binTree0.add((int) (short) 10);
        boolean boolean6 = binTree0.property();
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for binTree0", binTree0.property_2());
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        int int3 = binTree0.getSize();
        boolean boolean4 = binTree0.property();
        int int5 = binTree0.getSize();
        boolean boolean6 = binTree0.repOK();
        binTree0.add((-1));
        binTree0.add((int) (short) -1);
        binTree0.add(10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for binTree0", binTree0.property_2());
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        int int3 = binTree0.getSize();
        boolean boolean4 = binTree0.property();
        int int5 = binTree0.getSize();
        boolean boolean6 = binTree0.property();
        boolean boolean7 = binTree0.repOK();
        boolean boolean8 = binTree0.property();
        binTree0.add((-1));
        binTree0.add(2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for binTree0", binTree0.property_2());
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        boolean boolean1 = binTree0.property();
        int int2 = binTree0.getSize();
        int int3 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add((int) (byte) 100);
        binTree0.add((int) (short) 100);
        int int10 = binTree0.getSize();
        int int11 = binTree0.getSize();
        boolean boolean12 = binTree0.property();
        binTree0.add((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for binTree0", binTree0.property_2());
    }
}

