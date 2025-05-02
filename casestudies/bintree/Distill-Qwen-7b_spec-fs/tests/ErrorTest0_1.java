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
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add((int) (byte) 100);
        binTree0.add((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        int int4 = binTree0.getSize();
        binTree0.add((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        int int3 = binTree0.getSize();
        binTree0.add(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        binTree0.add((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        binTree0.add((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) '#');
        binTree0.add((int) (byte) -1);
        binTree0.add((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        int int2 = binTree0.getSize();
        binTree0.add(2);
        binTree0.add(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) 10);
        int int3 = binTree0.getSize();
        binTree0.add(1);
        binTree0.add((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        binTree0.add((int) (short) 10);
        binTree0.add((int) ' ');
        binTree0.add(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add((-1));
        binTree0.add((int) (byte) 1);
        binTree0.add(2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) '#');
        binTree0.add((int) (byte) -1);
        binTree0.add((int) (byte) -1);
        binTree0.add((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        int int4 = binTree0.getSize();
        binTree0.add((int) (short) 10);
        int int7 = binTree0.getSize();
        binTree0.add((int) (short) 100);
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add((int) (byte) 100);
        int int6 = binTree0.getSize();
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((-1));
        binTree0.add((int) (short) -1);
        binTree0.add((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        binTree0.add((int) (short) 10);
        binTree0.add((int) ' ');
        binTree0.add((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add((int) (byte) 100);
        int int6 = binTree0.getSize();
        int int7 = binTree0.getSize();
        binTree0.add((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        int int5 = binTree0.getSize();
        binTree0.add(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((-1));
        int int4 = binTree0.getSize();
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        binTree0.add((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        int int2 = binTree0.getSize();
        binTree0.add(2);
        binTree0.add((int) (byte) 10);
        binTree0.add((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        int int4 = binTree0.getSize();
        binTree0.add((int) (short) 10);
        int int7 = binTree0.getSize();
        binTree0.add(10);
        binTree0.add((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add((-1));
        binTree0.add((int) ' ');
        int int8 = binTree0.getSize();
        int int9 = binTree0.getSize();
        binTree0.add((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        int int4 = binTree0.getSize();
        binTree0.add((int) (short) 10);
        binTree0.add((int) 'a');
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) '#');
        binTree0.add((int) (byte) -1);
        binTree0.add((int) (byte) -1);
        binTree0.add(100);
        int int9 = binTree0.getSize();
        binTree0.add((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        binTree0.add((int) (byte) -1);
        binTree0.add((int) '#');
        binTree0.add(2);
        binTree0.add((int) '#');
        binTree0.add(3);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        binTree0.add((int) (byte) -1);
        binTree0.add((int) '#');
        binTree0.add(2);
        binTree0.add((int) '#');
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        binTree0.add((int) (byte) -1);
        binTree0.add((int) '#');
        binTree0.add(2);
        binTree0.add((int) '#');
        binTree0.add(10);
        binTree0.add((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        binTree0.add((int) (short) 10);
        int int5 = binTree0.getSize();
        binTree0.add(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        int int2 = binTree0.getSize();
        int int3 = binTree0.getSize();
        binTree0.add(3);
        binTree0.add(0);
        binTree0.add((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        int int2 = binTree0.getSize();
        int int3 = binTree0.getSize();
        binTree0.add(3);
        binTree0.add(0);
        int int8 = binTree0.getSize();
        binTree0.add(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        int int3 = binTree0.getSize();
        binTree0.add((int) (short) -1);
        binTree0.add(1);
        int int8 = binTree0.getSize();
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) '#');
        binTree0.add((int) (byte) -1);
        binTree0.add((int) (byte) -1);
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add((int) (byte) 100);
        int int6 = binTree0.getSize();
        binTree0.add((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        binTree0.add(100);
        int int5 = binTree0.getSize();
        binTree0.add((int) (short) 100);
        binTree0.add((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) 10);
        binTree0.add((int) (byte) 1);
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        binTree0.add((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((-1));
        int int4 = binTree0.getSize();
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        binTree0.add((int) 'a');
        binTree0.add((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        int int2 = binTree0.getSize();
        binTree0.add(0);
        binTree0.add((int) (short) 100);
        int int7 = binTree0.getSize();
        int int8 = binTree0.getSize();
        binTree0.add((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) '#');
        int int3 = binTree0.getSize();
        binTree0.add((int) ' ');
        binTree0.add((int) (byte) 1);
        binTree0.add((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        int int2 = binTree0.getSize();
        binTree0.add(0);
        binTree0.add((int) (short) 100);
        binTree0.add((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        int int2 = binTree0.getSize();
        int int3 = binTree0.getSize();
        binTree0.add(3);
        binTree0.add(0);
        int int8 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) 10);
        int int3 = binTree0.getSize();
        binTree0.add((int) (short) 0);
        binTree0.add((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        binTree0.add((int) (byte) -1);
        int int5 = binTree0.getSize();
        binTree0.add((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        binTree0.add((int) '#');
        binTree0.add((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        int int2 = binTree0.getSize();
        binTree0.add(0);
        binTree0.add((int) (short) 100);
        binTree0.add(10);
        binTree0.add((int) (short) 0);
        binTree0.add(4);
        binTree0.add((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        int int2 = binTree0.getSize();
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        int int5 = binTree0.getSize();
        binTree0.add(1);
        binTree0.add(2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add((int) (byte) 100);
        int int6 = binTree0.getSize();
        int int7 = binTree0.getSize();
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) 10);
        binTree0.add((int) (byte) 1);
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        binTree0.add((int) (byte) 10);
        int int9 = binTree0.getSize();
        binTree0.add(3);
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) 10);
        int int3 = binTree0.getSize();
        binTree0.add(3);
        int int6 = binTree0.getSize();
        binTree0.add(1);
        binTree0.add(2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) 10);
        binTree0.add((int) (byte) 1);
        binTree0.add((int) (byte) 100);
        binTree0.add((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        binTree0.add((int) (byte) -1);
        binTree0.add((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        binTree0.add((int) (short) 10);
        binTree0.add((int) ' ');
        binTree0.add((int) '4');
        binTree0.add(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        int int7 = binTree0.getSize();
        int int8 = binTree0.getSize();
        binTree0.add((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        int int3 = binTree0.getSize();
        binTree0.add((int) (short) -1);
        int int6 = binTree0.getSize();
        int int7 = binTree0.getSize();
        binTree0.add((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        int int3 = binTree0.getSize();
        binTree0.add((int) (short) -1);
        binTree0.add((int) (byte) -1);
        int int8 = binTree0.getSize();
        binTree0.add((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) 10);
        binTree0.add((int) (byte) 1);
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        binTree0.add((int) (byte) 10);
        int int9 = binTree0.getSize();
        binTree0.add(2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        int int4 = binTree0.getSize();
        binTree0.add((int) (short) 10);
        binTree0.add((int) (short) 1);
        int int9 = binTree0.getSize();
        binTree0.add(4);
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add((-1));
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add((-1));
        binTree0.add((int) ' ');
        binTree0.add((int) (byte) 10);
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add((int) (byte) 100);
        int int6 = binTree0.getSize();
        int int7 = binTree0.getSize();
        int int8 = binTree0.getSize();
        int int9 = binTree0.getSize();
        binTree0.add((int) (byte) -1);
        binTree0.add(2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        int int2 = binTree0.getSize();
        binTree0.add(0);
        binTree0.add((int) (short) 100);
        binTree0.add(10);
        binTree0.add(10);
        binTree0.add((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((-1));
        int int4 = binTree0.getSize();
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        int int3 = binTree0.getSize();
        binTree0.add((int) (short) -1);
        binTree0.add(1);
        int int8 = binTree0.getSize();
        binTree0.add((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        int int5 = binTree0.getSize();
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((-1));
        int int4 = binTree0.getSize();
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        binTree0.add((int) (byte) -1);
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        binTree0.add((int) (byte) -1);
        binTree0.add((int) '#');
        int int7 = binTree0.getSize();
        int int8 = binTree0.getSize();
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((-1));
        int int4 = binTree0.getSize();
        int int5 = binTree0.getSize();
        binTree0.add((int) ' ');
        binTree0.add((int) (short) 10);
        binTree0.add(10);
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        binTree0.add((int) (short) 10);
        binTree0.add((int) ' ');
        binTree0.add((int) (byte) 100);
        binTree0.add((int) (short) 100);
        binTree0.add(10);
        int int13 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) '4');
        binTree0.add((int) (short) 1);
        int int6 = binTree0.getSize();
        int int7 = binTree0.getSize();
        binTree0.add(2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        int int2 = binTree0.getSize();
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        int int7 = binTree0.getSize();
        binTree0.add(1);
        int int10 = binTree0.getSize();
        binTree0.add(2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) '#');
        binTree0.add((int) (byte) -1);
        binTree0.add((int) (byte) -1);
        binTree0.add((int) (short) -1);
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test71");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((-1));
        int int4 = binTree0.getSize();
        int int5 = binTree0.getSize();
        binTree0.add((int) ' ');
        binTree0.add((int) (short) 10);
        binTree0.add((int) '4');
        binTree0.add((int) (short) -1);
        binTree0.add((int) (short) 100);
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test72");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        binTree0.add(3);
        binTree0.add(0);
        binTree0.add(4);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test73");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((-1));
        binTree0.add((int) (short) -1);
        binTree0.add((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test74");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) 10);
        int int3 = binTree0.getSize();
        binTree0.add(0);
        int int6 = binTree0.getSize();
        binTree0.add((int) (byte) 0);
        binTree0.add((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test75");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        binTree0.add((int) (short) 10);
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        binTree0.add((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test76");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        int int3 = binTree0.getSize();
        binTree0.add((int) (short) -1);
        binTree0.add((int) (byte) -1);
        int int8 = binTree0.getSize();
        int int9 = binTree0.getSize();
        binTree0.add((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test77");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) '4');
        binTree0.add((int) (short) 1);
        binTree0.add((int) (short) -1);
        int int8 = binTree0.getSize();
        int int9 = binTree0.getSize();
        binTree0.add(2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test78");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add((-1));
        binTree0.add((int) (byte) 1);
        binTree0.add((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test79");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((-1));
        int int4 = binTree0.getSize();
        binTree0.add((int) (byte) 1);
        int int7 = binTree0.getSize();
        binTree0.add(2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test80");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        int int4 = binTree0.getSize();
        binTree0.add((int) (short) 10);
        binTree0.add((int) (short) 1);
        int int9 = binTree0.getSize();
        int int10 = binTree0.getSize();
        binTree0.add((int) ' ');
        binTree0.add(2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test81");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) 10);
        int int3 = binTree0.getSize();
        binTree0.add(0);
        int int6 = binTree0.getSize();
        binTree0.add(2);
        int int9 = binTree0.getSize();
        binTree0.add(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test82");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) 10);
        int int3 = binTree0.getSize();
        binTree0.add(1);
        int int6 = binTree0.getSize();
        binTree0.add(4);
        binTree0.add((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test83");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) 10);
        binTree0.add((int) (byte) 1);
        binTree0.add((int) (byte) 100);
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test84");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        int int2 = binTree0.getSize();
        int int3 = binTree0.getSize();
        binTree0.add(3);
        binTree0.add(0);
        int int8 = binTree0.getSize();
        int int9 = binTree0.getSize();
        int int10 = binTree0.getSize();
        binTree0.add((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test85");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) 10);
        int int3 = binTree0.getSize();
        binTree0.add(3);
        int int6 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add(4);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test86");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        int int3 = binTree0.getSize();
        binTree0.add((int) (short) -1);
        int int6 = binTree0.getSize();
        int int7 = binTree0.getSize();
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test87() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test87");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        int int2 = binTree0.getSize();
        int int3 = binTree0.getSize();
        binTree0.add(3);
        int int6 = binTree0.getSize();
        binTree0.add((-1));
        binTree0.add(2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test88() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test88");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        binTree0.add((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test89() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test89");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((-1));
        int int4 = binTree0.getSize();
        int int5 = binTree0.getSize();
        binTree0.add((int) ' ');
        binTree0.add((int) (short) 10);
        binTree0.add(2);
        int int12 = binTree0.getSize();
        binTree0.add((int) (short) 100);
        binTree0.add((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test90() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test90");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        int int2 = binTree0.getSize();
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        int int7 = binTree0.getSize();
        int int8 = binTree0.getSize();
        binTree0.add((int) (byte) -1);
        int int11 = binTree0.getSize();
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test91() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test91");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        int int3 = binTree0.getSize();
        binTree0.add((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test92() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test92");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) '4');
        binTree0.add((int) (short) 1);
        int int6 = binTree0.getSize();
        int int7 = binTree0.getSize();
        int int8 = binTree0.getSize();
        int int9 = binTree0.getSize();
        binTree0.add(2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test93() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test93");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        int int2 = binTree0.getSize();
        binTree0.add(0);
        int int5 = binTree0.getSize();
        binTree0.add((int) (byte) 0);
        int int8 = binTree0.getSize();
        int int9 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test94() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test94");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) 10);
        int int3 = binTree0.getSize();
        binTree0.add(1);
        int int6 = binTree0.getSize();
        binTree0.add((int) (byte) 1);
        binTree0.add((int) (byte) 1);
        int int11 = binTree0.getSize();
        int int12 = binTree0.getSize();
        binTree0.add((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test95() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test95");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) 10);
        binTree0.add((int) (byte) 1);
        int int5 = binTree0.getSize();
        binTree0.add(2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test96() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test96");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        int int2 = binTree0.getSize();
        binTree0.add(0);
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        int int7 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }
}

