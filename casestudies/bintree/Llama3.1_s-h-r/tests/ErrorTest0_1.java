import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add((int) (byte) 100);
        binTree0.add((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) '#');
        int int3 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add((int) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        int int3 = binTree0.getSize();
        binTree0.add((int) (byte) -1);
        binTree0.add((int) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) '#');
        int int3 = binTree0.getSize();
        binTree0.add((int) (byte) 100);
        binTree0.add((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add((int) (short) -1);
        binTree0.add((int) (byte) -1);
        int int8 = binTree0.getSize();
        binTree0.add((int) (short) 0);
        binTree0.add(100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add((-1));
        int int6 = binTree0.getSize();
        int int7 = binTree0.getSize();
        binTree0.add(3);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        int int3 = binTree0.getSize();
        binTree0.add((int) '#');
        binTree0.add((int) (byte) 10);
        binTree0.add(100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        int int4 = binTree0.getSize();
        binTree0.add((int) (byte) 0);
        binTree0.add(2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        binTree0.add((int) (short) 10);
        binTree0.add((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        int int2 = binTree0.getSize();
        binTree0.add((int) (byte) 1);
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        binTree0.add((int) '4');
        binTree0.add(10);
        int int11 = binTree0.getSize();
        binTree0.add((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add((-1));
        int int6 = binTree0.getSize();
        binTree0.add(3);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        int int3 = binTree0.getSize();
        binTree0.add((int) '#');
        binTree0.add((int) (byte) 10);
        binTree0.add((int) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) '#');
        int int3 = binTree0.getSize();
        binTree0.add((int) (byte) 100);
        binTree0.add((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add((int) (short) -1);
        binTree0.add((int) (byte) -1);
        binTree0.add((int) (byte) 0);
        binTree0.add((int) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add((int) (short) -1);
        binTree0.add((int) (byte) 1);
        binTree0.add(3);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add((-1));
        binTree0.add((int) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        int int3 = binTree0.getSize();
        binTree0.add((int) (byte) -1);
        binTree0.add((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        int int2 = binTree0.getSize();
        binTree0.add((int) (byte) 1);
        binTree0.add((int) (short) 10);
        binTree0.add((int) (short) 100);
        binTree0.add((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        int int4 = binTree0.getSize();
        binTree0.add((int) (byte) 0);
        binTree0.add(10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        int int2 = binTree0.getSize();
        binTree0.add((int) (byte) 1);
        int int5 = binTree0.getSize();
        binTree0.add((int) ' ');
        int int8 = binTree0.getSize();
        int int9 = binTree0.getSize();
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add((int) (short) -1);
        binTree0.add(3);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add((int) (short) -1);
        binTree0.add((int) (byte) -1);
        int int8 = binTree0.getSize();
        binTree0.add((int) (short) 0);
        binTree0.add((int) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        binTree0.add(2);
        binTree0.add((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        int int2 = binTree0.getSize();
        binTree0.add((int) (byte) 1);
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        binTree0.add((int) '4');
        binTree0.add((int) (short) 100);
        binTree0.add(3);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        int int4 = binTree0.getSize();
        binTree0.add((int) (byte) 0);
        int int7 = binTree0.getSize();
        binTree0.add((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add((int) (short) -1);
        binTree0.add((int) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        int int2 = binTree0.getSize();
        binTree0.add((int) (byte) 1);
        int int5 = binTree0.getSize();
        binTree0.add((int) ' ');
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        int int4 = binTree0.getSize();
        binTree0.add((int) (byte) 0);
        int int7 = binTree0.getSize();
        binTree0.add(1);
        int int10 = binTree0.getSize();
        binTree0.add(10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        int int2 = binTree0.getSize();
        binTree0.add((int) (byte) 1);
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        binTree0.add((int) (byte) 10);
        binTree0.add((int) '#');
        binTree0.add((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        int int4 = binTree0.getSize();
        binTree0.add((int) (short) -1);
        int int7 = binTree0.getSize();
        binTree0.add(100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) '#');
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        int int5 = binTree0.getSize();
        binTree0.add((int) (byte) 10);
        int int8 = binTree0.getSize();
        binTree0.add(100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) '#');
        int int3 = binTree0.getSize();
        binTree0.add((int) 'a');
        binTree0.add((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        int int3 = binTree0.getSize();
        binTree0.add((int) '#');
        binTree0.add((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add((int) (short) -1);
        binTree0.add((int) (byte) -1);
        int int8 = binTree0.getSize();
        binTree0.add(0);
        int int11 = binTree0.getSize();
        binTree0.add((int) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        int int3 = binTree0.getSize();
        binTree0.add((int) '#');
        binTree0.add(1);
        int int8 = binTree0.getSize();
        binTree0.add((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        int int4 = binTree0.getSize();
        binTree0.add((int) (byte) 0);
        int int7 = binTree0.getSize();
        int int8 = binTree0.getSize();
        binTree0.add(10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add((int) (short) -1);
        binTree0.add((int) (byte) -1);
        int int8 = binTree0.getSize();
        binTree0.add((int) (short) 0);
        int int11 = binTree0.getSize();
        binTree0.add((-1));
        binTree0.add(2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        int int2 = binTree0.getSize();
        binTree0.add((int) (byte) 1);
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        binTree0.add((int) '4');
        binTree0.add((int) (short) 100);
        binTree0.add(2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        int int4 = binTree0.getSize();
        binTree0.add((int) (byte) 0);
        binTree0.add((int) (byte) -1);
        binTree0.add((int) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) '#');
        int int3 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add((int) (short) 1);
        binTree0.add(1);
        binTree0.add((int) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        int int3 = binTree0.getSize();
        binTree0.add((int) '#');
        binTree0.add((int) (byte) 10);
        binTree0.add((int) (short) 10);
        binTree0.add((int) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        int int3 = binTree0.getSize();
        binTree0.add((int) '#');
        binTree0.add((int) (byte) 10);
        binTree0.add((int) (short) 10);
        int int10 = binTree0.getSize();
        binTree0.add((int) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        int int2 = binTree0.getSize();
        binTree0.add((int) (byte) 1);
        binTree0.add((int) (short) 10);
        binTree0.add((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        int int4 = binTree0.getSize();
        binTree0.add((int) (byte) 0);
        int int7 = binTree0.getSize();
        int int8 = binTree0.getSize();
        int int9 = binTree0.getSize();
        binTree0.add(3);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) '#');
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        int int5 = binTree0.getSize();
        binTree0.add((int) (byte) 10);
        binTree0.add((int) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        int int2 = binTree0.getSize();
        binTree0.add((int) (byte) 1);
        int int5 = binTree0.getSize();
        binTree0.add((int) ' ');
        int int8 = binTree0.getSize();
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        binTree0.add((int) (byte) -1);
        binTree0.add(2);
        binTree0.add(10);
        int int9 = binTree0.getSize();
        binTree0.add((int) (short) 10);
        binTree0.add((int) (byte) 10);
        binTree0.add(10);
        binTree0.add((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        int int2 = binTree0.getSize();
        binTree0.add((int) (byte) 1);
        int int5 = binTree0.getSize();
        binTree0.add((int) (short) 100);
        int int8 = binTree0.getSize();
        int int9 = binTree0.getSize();
        int int10 = binTree0.getSize();
        binTree0.add((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        int int2 = binTree0.getSize();
        binTree0.add((int) (byte) 1);
        int int5 = binTree0.getSize();
        binTree0.add((int) (short) 100);
        int int8 = binTree0.getSize();
        int int9 = binTree0.getSize();
        int int10 = binTree0.getSize();
        binTree0.add((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        int int2 = binTree0.getSize();
        binTree0.add((int) (byte) 1);
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        binTree0.add((int) (byte) 10);
        binTree0.add((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        binTree0.add(2);
        binTree0.add(3);
        int int9 = binTree0.getSize();
        binTree0.add(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        binTree0.add((int) (byte) -1);
        binTree0.add(2);
        binTree0.add(10);
        int int9 = binTree0.getSize();
        binTree0.add(100);
        binTree0.add(4);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        binTree0.add((int) (byte) -1);
        binTree0.add(2);
        binTree0.add(10);
        int int9 = binTree0.getSize();
        binTree0.add((int) (short) 10);
        binTree0.add((int) '#');
        binTree0.add((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        int int3 = binTree0.getSize();
        binTree0.add((int) (short) 100);
        binTree0.add((int) (short) 1);
        binTree0.add((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        int int4 = binTree0.getSize();
        binTree0.add((int) (byte) 0);
        binTree0.add((int) (byte) -1);
        binTree0.add((int) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add((int) (short) -1);
        binTree0.add((int) (byte) -1);
        int int8 = binTree0.getSize();
        binTree0.add(0);
        binTree0.add(2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        int int4 = binTree0.getSize();
        binTree0.add((int) (short) -1);
        binTree0.add((int) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        int int4 = binTree0.getSize();
        binTree0.add((int) (short) -1);
        int int7 = binTree0.getSize();
        binTree0.add(2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add((int) (byte) 100);
        int int6 = binTree0.getSize();
        binTree0.add((int) (short) 10);
        binTree0.add((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        int int4 = binTree0.getSize();
        binTree0.add((int) (byte) 0);
        binTree0.add((int) (byte) -1);
        binTree0.add(1);
        binTree0.add((int) (short) 0);
        int int13 = binTree0.getSize();
        binTree0.add((int) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        int int4 = binTree0.getSize();
        binTree0.add((int) (short) -1);
        int int7 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add((int) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        int int4 = binTree0.getSize();
        binTree0.add((int) (byte) 0);
        binTree0.add((int) (byte) -1);
        binTree0.add(1);
        binTree0.add((int) (short) 1);
        int int13 = binTree0.getSize();
        binTree0.add((int) (byte) 1);
        binTree0.add(100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        int int2 = binTree0.getSize();
        binTree0.add((int) (byte) 1);
        binTree0.add((int) (short) 10);
        binTree0.add((int) (short) 100);
        int int9 = binTree0.getSize();
        binTree0.add((int) (byte) 10);
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        binTree0.add((int) (short) 100);
        binTree0.add((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        int int4 = binTree0.getSize();
        binTree0.add((int) (byte) 0);
        binTree0.add((int) (byte) -1);
        binTree0.add(1);
        binTree0.add((int) (short) 1);
        int int13 = binTree0.getSize();
        int int14 = binTree0.getSize();
        binTree0.add(2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) '#');
        int int3 = binTree0.getSize();
        binTree0.add(100);
        binTree0.add(2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        int int2 = binTree0.getSize();
        binTree0.add((int) (byte) 1);
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        binTree0.add((int) '4');
        binTree0.add(2);
        binTree0.add((int) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) '#');
        int int3 = binTree0.getSize();
        binTree0.add((int) (byte) 100);
        int int6 = binTree0.getSize();
        binTree0.add(10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        int int2 = binTree0.getSize();
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add((-1));
        binTree0.add((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        int int2 = binTree0.getSize();
        binTree0.add((int) (byte) 1);
        int int5 = binTree0.getSize();
        binTree0.add((int) (short) 100);
        int int8 = binTree0.getSize();
        int int9 = binTree0.getSize();
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add(10);
        binTree0.add(4);
        binTree0.add(10);
        binTree0.add((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add((int) (short) -1);
        binTree0.add((int) (byte) -1);
        int int8 = binTree0.getSize();
        binTree0.add(0);
        int int11 = binTree0.getSize();
        binTree0.add((int) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) '#');
        int int3 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        int int6 = binTree0.getSize();
        int int7 = binTree0.getSize();
        int int8 = binTree0.getSize();
        binTree0.add((int) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        int int4 = binTree0.getSize();
        binTree0.add((int) (byte) 0);
        binTree0.add((int) (byte) -1);
        int int9 = binTree0.getSize();
        binTree0.add((int) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        int int4 = binTree0.getSize();
        binTree0.add((int) (byte) 0);
        binTree0.add((int) (byte) -1);
        binTree0.add(1);
        binTree0.add((int) (short) 0);
        binTree0.add((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        int int3 = binTree0.getSize();
        binTree0.add((int) '#');
        binTree0.add((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        binTree0.add((int) (byte) -1);
        binTree0.add(2);
        binTree0.add(10);
        int int9 = binTree0.getSize();
        binTree0.add((int) '4');
        int int12 = binTree0.getSize();
        binTree0.add(100);
        int int15 = binTree0.getSize();
        binTree0.add((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) '#');
        int int3 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        int int6 = binTree0.getSize();
        int int7 = binTree0.getSize();
        binTree0.add((int) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add((int) (byte) 100);
        int int6 = binTree0.getSize();
        int int7 = binTree0.getSize();
        int int8 = binTree0.getSize();
        binTree0.add((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        int int2 = binTree0.getSize();
        binTree0.add((int) (byte) 1);
        binTree0.add((int) (short) 10);
        binTree0.add((int) (short) 100);
        int int9 = binTree0.getSize();
        binTree0.add((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add(10);
        int int6 = binTree0.getSize();
        binTree0.add((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add((int) (short) -1);
        binTree0.add((int) (byte) -1);
        binTree0.add((int) (byte) 0);
        int int10 = binTree0.getSize();
        binTree0.add(1);
        binTree0.add((int) (byte) 0);
        binTree0.add(100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add((int) (short) -1);
        binTree0.add((int) (byte) 1);
        binTree0.add(0);
        int int10 = binTree0.getSize();
        int int11 = binTree0.getSize();
        binTree0.add(4);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        binTree0.add((int) (byte) 1);
        int int7 = binTree0.getSize();
        binTree0.add((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) '#');
        int int3 = binTree0.getSize();
        binTree0.add((int) (byte) 100);
        binTree0.add((int) 'a');
        int int8 = binTree0.getSize();
        binTree0.add((int) '#');
        binTree0.add((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        binTree0.add((int) (byte) -1);
        binTree0.add(2);
        binTree0.add(10);
        int int9 = binTree0.getSize();
        binTree0.add((int) '4');
        int int12 = binTree0.getSize();
        binTree0.add((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) '#');
        int int3 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        int int6 = binTree0.getSize();
        int int7 = binTree0.getSize();
        int int8 = binTree0.getSize();
        binTree0.add((int) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        int int2 = binTree0.getSize();
        binTree0.add((int) (byte) 1);
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        binTree0.add((int) '4');
        binTree0.add(10);
        int int11 = binTree0.getSize();
        binTree0.add((int) (byte) 10);
        int int14 = binTree0.getSize();
        binTree0.add((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add((int) (short) -1);
        binTree0.add((int) (byte) -1);
        binTree0.add((int) (byte) 1);
        binTree0.add((int) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add((-1));
        int int6 = binTree0.getSize();
        int int7 = binTree0.getSize();
        int int8 = binTree0.getSize();
        int int9 = binTree0.getSize();
        binTree0.add(4);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        int int3 = binTree0.getSize();
        binTree0.add((int) '#');
        int int6 = binTree0.getSize();
        binTree0.add((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add((int) (short) -1);
        binTree0.add((int) (byte) -1);
        binTree0.add((int) (byte) 1);
        binTree0.add((int) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add(10);
        binTree0.add(4);
        binTree0.add((int) (byte) 10);
        binTree0.add((int) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add((int) (short) -1);
        binTree0.add((int) (byte) -1);
        int int8 = binTree0.getSize();
        binTree0.add(0);
        int int11 = binTree0.getSize();
        int int12 = binTree0.getSize();
        binTree0.add((int) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add((int) (short) -1);
        binTree0.add((int) (byte) -1);
        binTree0.add(0);
        int int10 = binTree0.getSize();
        binTree0.add((int) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        binTree0.add(2);
        int int7 = binTree0.getSize();
        binTree0.add(3);
        binTree0.add((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        int int4 = binTree0.getSize();
        binTree0.add((int) (byte) 0);
        int int7 = binTree0.getSize();
        binTree0.add(1);
        binTree0.add((int) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        int int2 = binTree0.getSize();
        binTree0.add((int) (short) -1);
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        binTree0.add(1);
        binTree0.add(0);
        binTree0.add(2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        int int4 = binTree0.getSize();
        binTree0.add((int) (byte) 0);
        binTree0.add((int) (byte) -1);
        binTree0.add(1);
        int int11 = binTree0.getSize();
        binTree0.add((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        binTree0.add((int) (byte) -1);
        binTree0.add(2);
        binTree0.add(10);
        int int9 = binTree0.getSize();
        binTree0.add(100);
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        int int2 = binTree0.getSize();
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add(100);
        binTree0.add((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        int int4 = binTree0.getSize();
        binTree0.add((int) (byte) 0);
        binTree0.add((int) (byte) -1);
        int int9 = binTree0.getSize();
        binTree0.add(10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }
}

