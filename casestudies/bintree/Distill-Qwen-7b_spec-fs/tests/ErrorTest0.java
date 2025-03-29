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
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        binTree0.add(0);
        binTree0.add(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        binTree0.add(2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        binTree0.add(0);
        boolean boolean7 = binTree0.repOK();
        binTree0.add((int) (short) 100);
        int int10 = binTree0.getSize();
        boolean boolean11 = binTree0.repOK();
        int int12 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        binTree0.add((int) (short) 10);
        int int7 = binTree0.getSize();
        binTree0.add(0);
        binTree0.add(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        binTree0.add(0);
        int int7 = binTree0.getSize();
        binTree0.add(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) (byte) -1);
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) (byte) -1);
        binTree0.add((int) (byte) 10);
        binTree0.add((-1));
        binTree0.add((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        binTree0.add((int) (short) -1);
        int int7 = binTree0.getSize();
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        binTree0.add((int) (short) 10);
        int int7 = binTree0.getSize();
        binTree0.add(0);
        boolean boolean10 = binTree0.repOK();
        int int11 = binTree0.getSize();
        boolean boolean12 = binTree0.repOK();
        binTree0.add((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        binTree0.add(0);
        boolean boolean6 = binTree0.repOK();
        int int7 = binTree0.getSize();
        binTree0.add(0);
        int int10 = binTree0.getSize();
        int int11 = binTree0.getSize();
        int int12 = binTree0.getSize();
        binTree0.add((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        binTree0.add(0);
        boolean boolean7 = binTree0.repOK();
        binTree0.add((int) (short) 100);
        binTree0.add((int) ' ');
        int int12 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        binTree0.add(0);
        boolean boolean6 = binTree0.repOK();
        int int7 = binTree0.getSize();
        binTree0.add(0);
        int int10 = binTree0.getSize();
        int int11 = binTree0.getSize();
        binTree0.add((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        binTree0.add((int) (short) 10);
        int int7 = binTree0.getSize();
        binTree0.add(0);
        boolean boolean10 = binTree0.repOK();
        binTree0.add(100);
        int int13 = binTree0.getSize();
        boolean boolean14 = binTree0.repOK();
        binTree0.add((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        binTree0.add(0);
        int int7 = binTree0.getSize();
        binTree0.add((int) ' ');
        binTree0.add((int) (byte) 100);
        binTree0.add(3);
        binTree0.add(4);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        binTree0.add((int) (short) 10);
        int int7 = binTree0.getSize();
        binTree0.add(0);
        boolean boolean10 = binTree0.repOK();
        int int11 = binTree0.getSize();
        binTree0.add((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) (byte) -1);
        binTree0.add((int) (byte) 10);
        binTree0.add((-1));
        binTree0.add(1);
        binTree0.add((int) (byte) 10);
        int int11 = binTree0.getSize();
        int int12 = binTree0.getSize();
        binTree0.add(2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        binTree0.add((int) (short) -1);
        int int7 = binTree0.getSize();
        boolean boolean8 = binTree0.repOK();
        binTree0.add((int) '4');
        binTree0.add((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        binTree0.add(0);
        boolean boolean7 = binTree0.repOK();
        binTree0.add((int) (short) 100);
        int int10 = binTree0.getSize();
        boolean boolean11 = binTree0.repOK();
        int int12 = binTree0.getSize();
        int int13 = binTree0.getSize();
        int int14 = binTree0.getSize();
        binTree0.add((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) (byte) -1);
        boolean boolean3 = binTree0.repOK();
        binTree0.add(3);
        binTree0.add((int) (byte) 10);
        binTree0.add((int) (byte) 10);
        binTree0.add(2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        binTree0.add(0);
        boolean boolean7 = binTree0.repOK();
        binTree0.add((int) (short) 100);
        int int10 = binTree0.getSize();
        binTree0.add(10);
        binTree0.add((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) (byte) -1);
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        int int5 = binTree0.getSize();
        binTree0.add((int) (byte) 1);
        binTree0.add((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        binTree0.add(0);
        int int7 = binTree0.getSize();
        binTree0.add((int) ' ');
        binTree0.add((int) (byte) 100);
        binTree0.add(3);
        binTree0.add((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) (byte) -1);
        binTree0.add((int) (short) 10);
        boolean boolean5 = binTree0.repOK();
        binTree0.add((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) (byte) -1);
        binTree0.add((int) (byte) 10);
        binTree0.add((-1));
        binTree0.add(1);
        binTree0.add((int) (byte) 10);
        binTree0.add((int) (byte) -1);
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        binTree0.add(0);
        boolean boolean7 = binTree0.repOK();
        binTree0.add((int) (short) 100);
        binTree0.add((int) (short) 100);
        binTree0.add((int) (byte) 100);
        int int14 = binTree0.getSize();
        binTree0.add((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        binTree0.add(0);
        boolean boolean7 = binTree0.repOK();
        binTree0.add((int) (short) 100);
        binTree0.add((int) ' ');
        int int12 = binTree0.getSize();
        binTree0.add((int) (byte) 100);
        binTree0.add(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        binTree0.add(0);
        boolean boolean7 = binTree0.repOK();
        binTree0.add((int) (short) 100);
        binTree0.add((int) ' ');
        int int12 = binTree0.getSize();
        int int13 = binTree0.getSize();
        binTree0.add((int) 'a');
        binTree0.add((int) (short) 0);
        binTree0.add((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        binTree0.add(0);
        boolean boolean7 = binTree0.repOK();
        binTree0.add((int) (short) 100);
        binTree0.add((int) (short) 100);
        binTree0.add((int) 'a');
        binTree0.add((int) (byte) 10);
        boolean boolean16 = binTree0.repOK();
        boolean boolean17 = binTree0.repOK();
        binTree0.add((int) '#');
        boolean boolean20 = binTree0.repOK();
        binTree0.add((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        binTree0.add(0);
        boolean boolean7 = binTree0.repOK();
        binTree0.add((int) (short) 100);
        binTree0.add((int) ' ');
        binTree0.add(10);
        binTree0.add(3);
        binTree0.add((int) '4');
        boolean boolean18 = binTree0.repOK();
        binTree0.add(2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) (byte) -1);
        binTree0.add((int) (byte) 10);
        binTree0.add((-1));
        binTree0.add(1);
        boolean boolean9 = binTree0.repOK();
        int int10 = binTree0.getSize();
        binTree0.add(2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        binTree0.add(0);
        boolean boolean7 = binTree0.repOK();
        binTree0.add((int) (short) 100);
        binTree0.add((int) (short) 100);
        binTree0.add((int) 'a');
        binTree0.add((int) (byte) 10);
        binTree0.add(10);
        boolean boolean18 = binTree0.repOK();
        boolean boolean19 = binTree0.repOK();
        boolean boolean20 = binTree0.repOK();
        binTree0.add((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        binTree0.add(0);
        boolean boolean7 = binTree0.repOK();
        binTree0.add((int) (short) 100);
        int int10 = binTree0.getSize();
        boolean boolean11 = binTree0.repOK();
        binTree0.add(10);
        int int14 = binTree0.getSize();
        binTree0.add((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) (byte) -1);
        boolean boolean3 = binTree0.repOK();
        binTree0.add(3);
        binTree0.add((int) (byte) 10);
        binTree0.add((int) (byte) 10);
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) -1);
        binTree0.add((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        binTree0.add(0);
        int int7 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        int int5 = binTree0.getSize();
        binTree0.add((int) (short) 0);
        binTree0.add((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        binTree0.add(2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) (byte) -1);
        boolean boolean3 = binTree0.repOK();
        binTree0.add(3);
        binTree0.add((int) (byte) 10);
        binTree0.add((int) (byte) 10);
        binTree0.add(4);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        binTree0.add((int) (short) -1);
        boolean boolean7 = binTree0.repOK();
        int int8 = binTree0.getSize();
        boolean boolean9 = binTree0.repOK();
        binTree0.add(1);
        binTree0.add(2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) (byte) -1);
        binTree0.add((int) (byte) 10);
        binTree0.add((-1));
        int int7 = binTree0.getSize();
        int int8 = binTree0.getSize();
        boolean boolean9 = binTree0.repOK();
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        binTree0.add(0);
        boolean boolean7 = binTree0.repOK();
        binTree0.add((int) (short) 100);
        int int10 = binTree0.getSize();
        boolean boolean11 = binTree0.repOK();
        binTree0.add(10);
        binTree0.add(2);
        binTree0.add((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        binTree0.add(0);
        int int7 = binTree0.getSize();
        boolean boolean8 = binTree0.repOK();
        int int9 = binTree0.getSize();
        binTree0.add((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        binTree0.add(0);
        boolean boolean7 = binTree0.repOK();
        binTree0.add((int) (short) 100);
        binTree0.add((int) (short) 100);
        binTree0.add((int) 'a');
        binTree0.add((int) (byte) 10);
        binTree0.add(10);
        boolean boolean18 = binTree0.repOK();
        boolean boolean19 = binTree0.repOK();
        int int20 = binTree0.getSize();
        binTree0.add((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) (byte) -1);
        boolean boolean3 = binTree0.repOK();
        binTree0.add(3);
        int int6 = binTree0.getSize();
        int int7 = binTree0.getSize();
        binTree0.add(4);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        binTree0.add(0);
        binTree0.add((int) (short) 10);
        binTree0.add(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        binTree0.add(0);
        boolean boolean7 = binTree0.repOK();
        binTree0.add((int) (short) 100);
        binTree0.add((int) (short) 100);
        binTree0.add((int) (byte) 100);
        boolean boolean14 = binTree0.repOK();
        binTree0.add(10);
        binTree0.add((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        int int5 = binTree0.getSize();
        binTree0.add((int) (short) 0);
        binTree0.add((int) (short) 10);
        binTree0.add(6);
        int int12 = binTree0.getSize();
        binTree0.add((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        binTree0.add(0);
        int int7 = binTree0.getSize();
        binTree0.add(5);
        binTree0.add((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        binTree0.add((int) (short) 10);
        int int7 = binTree0.getSize();
        binTree0.add(0);
        boolean boolean10 = binTree0.repOK();
        int int11 = binTree0.getSize();
        boolean boolean12 = binTree0.repOK();
        boolean boolean13 = binTree0.repOK();
        binTree0.add((int) (byte) 0);
        binTree0.add((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) (short) 0);
        boolean boolean3 = binTree0.repOK();
        binTree0.add((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        binTree0.add(0);
        boolean boolean7 = binTree0.repOK();
        binTree0.add((int) (short) 100);
        binTree0.add((int) (short) 100);
        binTree0.add((int) 'a');
        binTree0.add((int) (byte) 10);
        binTree0.add(10);
        boolean boolean18 = binTree0.repOK();
        boolean boolean19 = binTree0.repOK();
        boolean boolean20 = binTree0.repOK();
        binTree0.add(0);
        binTree0.add((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        binTree0.add((int) (short) 10);
        int int7 = binTree0.getSize();
        binTree0.add(0);
        boolean boolean10 = binTree0.repOK();
        int int11 = binTree0.getSize();
        boolean boolean12 = binTree0.repOK();
        boolean boolean13 = binTree0.repOK();
        boolean boolean14 = binTree0.repOK();
        binTree0.add((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        binTree0.add(0);
        boolean boolean7 = binTree0.repOK();
        binTree0.add((int) (short) 100);
        int int10 = binTree0.getSize();
        boolean boolean11 = binTree0.repOK();
        binTree0.add(10);
        binTree0.add(0);
        binTree0.add(0);
        boolean boolean18 = binTree0.repOK();
        binTree0.add((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        binTree0.add(0);
        boolean boolean7 = binTree0.repOK();
        binTree0.add((int) (short) 100);
        int int10 = binTree0.getSize();
        boolean boolean11 = binTree0.repOK();
        int int12 = binTree0.getSize();
        int int13 = binTree0.getSize();
        int int14 = binTree0.getSize();
        boolean boolean15 = binTree0.repOK();
        binTree0.add((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }
}

