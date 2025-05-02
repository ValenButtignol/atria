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
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        int int4 = binTree0.getSize();
        binTree0.add((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) 10);
        binTree0.add((int) (byte) 1);
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
        binTree0.add((int) (short) 1);
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
        binTree0.add((int) (byte) 100);
        int int6 = binTree0.getSize();
        binTree0.add((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        binTree0.add((int) (short) 10);
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        binTree0.add((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        binTree0.add((int) (short) 10);
        binTree0.add(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add((int) (byte) 100);
        binTree0.add(2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) 10);
        int int3 = binTree0.getSize();
        binTree0.add((int) (byte) 10);
        binTree0.add((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        binTree0.add((-1));
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
        int int4 = binTree0.getSize();
        binTree0.add((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) '#');
        binTree0.add((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) 10);
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        binTree0.add((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) 10);
        binTree0.add((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        binTree0.add((int) (short) 10);
        binTree0.add(3);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) 10);
        binTree0.add(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        binTree0.add(100);
        int int5 = binTree0.getSize();
        binTree0.add((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) 10);
        int int3 = binTree0.getSize();
        binTree0.add((int) (byte) 10);
        binTree0.add((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) '#');
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        binTree0.add((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        int int3 = binTree0.getSize();
        binTree0.add(1);
        binTree0.add(100);
        int int8 = binTree0.getSize();
        binTree0.add((int) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        binTree0.add((int) (short) 10);
        binTree0.add((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) '#');
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        binTree0.add((int) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        binTree0.add((int) '#');
        int int7 = binTree0.getSize();
        int int8 = binTree0.getSize();
        binTree0.add(10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        binTree0.add((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) '#');
        binTree0.add(2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        int int3 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        int int6 = binTree0.getSize();
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        int int3 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        int int3 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        int int6 = binTree0.getSize();
        int int7 = binTree0.getSize();
        binTree0.add((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) '#');
        binTree0.add((int) '#');
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add(2);
        binTree0.add((int) (short) 10);
        binTree0.add((int) (short) 100);
        binTree0.add((int) (short) 0);
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
        binTree0.add(3);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) 10);
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        binTree0.add((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) '#');
        binTree0.add((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        binTree0.add((int) (short) 10);
        binTree0.add((int) (byte) 10);
        binTree0.add(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        int int2 = binTree0.getSize();
        binTree0.add(10);
        binTree0.add((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) 10);
        int int3 = binTree0.getSize();
        binTree0.add((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add(2);
        binTree0.add(2);
        int int8 = binTree0.getSize();
        binTree0.add((int) (byte) 0);
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
        int int5 = binTree0.getSize();
        binTree0.add((int) ' ');
        binTree0.add((int) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        int int4 = binTree0.getSize();
        binTree0.add((int) '4');
        binTree0.add(10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        int int2 = binTree0.getSize();
        binTree0.add(10);
        binTree0.add((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        int int3 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        int int6 = binTree0.getSize();
        int int7 = binTree0.getSize();
        binTree0.add((int) '#');
        binTree0.add((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        binTree0.add(2);
        int int5 = binTree0.getSize();
        binTree0.add((int) (short) -1);
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        int int3 = binTree0.getSize();
        binTree0.add((int) (short) 100);
        int int6 = binTree0.getSize();
        binTree0.add((int) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        binTree0.add(100);
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add(10);
        binTree0.add((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        int int3 = binTree0.getSize();
        binTree0.add(1);
        binTree0.add(100);
        int int8 = binTree0.getSize();
        binTree0.add(1);
        binTree0.add((int) (short) 1);
        int int13 = binTree0.getSize();
        binTree0.add(3);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) 10);
        binTree0.add((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) '#');
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        binTree0.add((int) (byte) 100);
        binTree0.add(10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add(2);
        int int6 = binTree0.getSize();
        binTree0.add((int) (short) 10);
        int int9 = binTree0.getSize();
        binTree0.add(3);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        int int3 = binTree0.getSize();
        binTree0.add(0);
        int int6 = binTree0.getSize();
        binTree0.add((int) (byte) -1);
        int int9 = binTree0.getSize();
        binTree0.add(100);
        binTree0.add((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        binTree0.add((int) (short) 10);
        binTree0.add((int) (byte) 10);
        int int7 = binTree0.getSize();
        binTree0.add((int) (short) 0);
        int int10 = binTree0.getSize();
        int int11 = binTree0.getSize();
        int int12 = binTree0.getSize();
        binTree0.add((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        int int5 = binTree0.getSize();
        binTree0.add((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        binTree0.add((int) (short) 10);
        int int5 = binTree0.getSize();
        binTree0.add(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) '#');
        binTree0.add((int) '#');
        binTree0.add((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        binTree0.add(2);
        int int5 = binTree0.getSize();
        binTree0.add((int) (short) -1);
        int int8 = binTree0.getSize();
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) 10);
        int int3 = binTree0.getSize();
        binTree0.add((int) (byte) 10);
        binTree0.add(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) '#');
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        binTree0.add((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        binTree0.add(100);
        binTree0.add((int) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        binTree0.add((int) (short) 10);
        int int5 = binTree0.getSize();
        binTree0.add((int) (byte) 0);
        int int8 = binTree0.getSize();
        binTree0.add(2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) '#');
        binTree0.add((int) '#');
        int int5 = binTree0.getSize();
        binTree0.add(3);
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
        int int5 = binTree0.getSize();
        binTree0.add((int) ' ');
        binTree0.add(2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        binTree0.add(100);
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        int int7 = binTree0.getSize();
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) '#');
        binTree0.add((int) '#');
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        binTree0.add(5);
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
        binTree0.add(2);
        int int6 = binTree0.getSize();
        binTree0.add((int) (short) 10);
        int int9 = binTree0.getSize();
        binTree0.add((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        int int3 = binTree0.getSize();
        binTree0.add(1);
        binTree0.add(100);
        int int8 = binTree0.getSize();
        binTree0.add(1);
        binTree0.add((int) (short) 1);
        int int13 = binTree0.getSize();
        int int14 = binTree0.getSize();
        binTree0.add(1);
        int int17 = binTree0.getSize();
        binTree0.add((int) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) '#');
        int int3 = binTree0.getSize();
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) '#');
        binTree0.add((int) '#');
        int int5 = binTree0.getSize();
        binTree0.add(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        binTree0.add(2);
        binTree0.add((int) ' ');
        int int7 = binTree0.getSize();
        binTree0.add(10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        int int3 = binTree0.getSize();
        binTree0.add(0);
        binTree0.add((int) (byte) 100);
        binTree0.add(5);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        int int3 = binTree0.getSize();
        binTree0.add(0);
        int int6 = binTree0.getSize();
        binTree0.add(1);
        binTree0.add((int) (byte) 10);
        int int11 = binTree0.getSize();
        binTree0.add((int) 'a');
        binTree0.add((int) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        binTree0.add((int) (short) 10);
        binTree0.add((int) (byte) 10);
        int int7 = binTree0.getSize();
        binTree0.add((int) (short) 0);
        binTree0.add((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        binTree0.add(2);
        binTree0.add((int) ' ');
        int int7 = binTree0.getSize();
        binTree0.add(0);
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
        binTree0.add((int) '4');
        int int7 = binTree0.getSize();
        binTree0.add(5);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) 10);
        binTree0.add(4);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        int int3 = binTree0.getSize();
        binTree0.add(0);
        binTree0.add((int) (byte) 100);
        binTree0.add((int) (short) 100);
        int int10 = binTree0.getSize();
        int int11 = binTree0.getSize();
        int int12 = binTree0.getSize();
        binTree0.add((int) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        int int4 = binTree0.getSize();
        binTree0.add(10);
        int int7 = binTree0.getSize();
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        binTree0.add((int) (short) 10);
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        binTree0.add((int) ' ');
        binTree0.add((int) (short) 10);
        binTree0.add(10);
        binTree0.add((int) (short) -1);
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
        int int4 = binTree0.getSize();
        int int5 = binTree0.getSize();
        binTree0.add((int) '4');
        binTree0.add((int) (short) 1);
        binTree0.add(2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        binTree0.add((int) (short) 10);
        binTree0.add((int) (byte) 10);
        int int7 = binTree0.getSize();
        binTree0.add((int) (short) 0);
        int int10 = binTree0.getSize();
        int int11 = binTree0.getSize();
        int int12 = binTree0.getSize();
        int int13 = binTree0.getSize();
        binTree0.add((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        int int3 = binTree0.getSize();
        binTree0.add(1);
        binTree0.add(100);
        int int8 = binTree0.getSize();
        binTree0.add(1);
        binTree0.add((int) (short) 1);
        int int13 = binTree0.getSize();
        int int14 = binTree0.getSize();
        binTree0.add(1);
        int int17 = binTree0.getSize();
        int int18 = binTree0.getSize();
        binTree0.add((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        int int3 = binTree0.getSize();
        binTree0.add(1);
        binTree0.add(100);
        int int8 = binTree0.getSize();
        binTree0.add(1);
        binTree0.add((int) (short) 1);
        int int13 = binTree0.getSize();
        int int14 = binTree0.getSize();
        int int15 = binTree0.getSize();
        binTree0.add((int) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        int int3 = binTree0.getSize();
        binTree0.add((int) (byte) 0);
        int int6 = binTree0.getSize();
        int int7 = binTree0.getSize();
        binTree0.add((int) (byte) 10);
        binTree0.add((int) (short) 100);
        binTree0.add(5);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        int int3 = binTree0.getSize();
        binTree0.add(0);
        int int6 = binTree0.getSize();
        binTree0.add((int) (byte) -1);
        binTree0.add((int) (short) 100);
        binTree0.add((int) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        binTree0.add((int) (short) 10);
        binTree0.add((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        int int3 = binTree0.getSize();
        binTree0.add(1);
        binTree0.add(100);
        int int8 = binTree0.getSize();
        binTree0.add(1);
        binTree0.add((int) (short) 1);
        int int13 = binTree0.getSize();
        int int14 = binTree0.getSize();
        binTree0.add(1);
        int int17 = binTree0.getSize();
        binTree0.add(4);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        binTree0.add(2);
        int int5 = binTree0.getSize();
        binTree0.add((int) (short) -1);
        binTree0.add((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add(10);
        binTree0.add((int) (short) 10);
        int int6 = binTree0.getSize();
        binTree0.add(2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        int int3 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        int int6 = binTree0.getSize();
        int int7 = binTree0.getSize();
        binTree0.add((int) '#');
        int int10 = binTree0.getSize();
        binTree0.add(0);
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
        binTree0.add(2);
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        binTree0.add(2);
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        binTree0.add((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        int int3 = binTree0.getSize();
        binTree0.add(2);
        binTree0.add((int) (byte) 10);
        int int8 = binTree0.getSize();
        binTree0.add(4);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) '#');
        binTree0.add((int) '#');
        int int5 = binTree0.getSize();
        binTree0.add((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        int int2 = binTree0.getSize();
        binTree0.add(10);
        int int5 = binTree0.getSize();
        binTree0.add((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add(10);
        int int4 = binTree0.getSize();
        binTree0.add((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add(2);
        int int6 = binTree0.getSize();
        int int7 = binTree0.getSize();
        binTree0.add((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        int int3 = binTree0.getSize();
        binTree0.add(1);
        binTree0.add((int) (short) 1);
        int int8 = binTree0.getSize();
        int int9 = binTree0.getSize();
        binTree0.add(10);
        binTree0.add(2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) 10);
        binTree0.add((int) (byte) 10);
        binTree0.add((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        int int3 = binTree0.getSize();
        binTree0.add(1);
        binTree0.add(100);
        int int8 = binTree0.getSize();
        binTree0.add(1);
        binTree0.add((int) (short) 1);
        int int13 = binTree0.getSize();
        int int14 = binTree0.getSize();
        binTree0.add((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add(2);
        binTree0.add((int) (short) 10);
        binTree0.add((int) (short) 100);
        int int10 = binTree0.getSize();
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
        binTree0.add((int) (short) 1);
        binTree0.add(2);
        int int6 = binTree0.getSize();
        binTree0.add((int) (short) 10);
        int int9 = binTree0.getSize();
        binTree0.add(0);
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
        binTree0.add((int) (byte) 100);
        binTree0.add(100);
        int int8 = binTree0.getSize();
        binTree0.add(2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        binTree0.add((int) ' ');
        binTree0.add(2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add(2);
        binTree0.add(2);
        int int8 = binTree0.getSize();
        binTree0.add((int) (short) 100);
        binTree0.add((int) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        binTree0.add(100);
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        int int7 = binTree0.getSize();
        binTree0.add((int) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        int int2 = binTree0.getSize();
        binTree0.add(10);
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        int int7 = binTree0.getSize();
        int int8 = binTree0.getSize();
        binTree0.add((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        binTree0.add((int) (short) 10);
        int int5 = binTree0.getSize();
        binTree0.add((int) (byte) 0);
        int int8 = binTree0.getSize();
        int int9 = binTree0.getSize();
        int int10 = binTree0.getSize();
        binTree0.add((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        int int3 = binTree0.getSize();
        binTree0.add(1);
        binTree0.add((int) (short) 1);
        int int8 = binTree0.getSize();
        int int9 = binTree0.getSize();
        binTree0.add(10);
        binTree0.add(4);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        int int3 = binTree0.getSize();
        binTree0.add((int) (byte) 0);
        int int6 = binTree0.getSize();
        int int7 = binTree0.getSize();
        binTree0.add((int) (byte) 10);
        binTree0.add((int) (short) 100);
        binTree0.add((-1));
        int int14 = binTree0.getSize();
        binTree0.add((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add(10);
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        int int3 = binTree0.getSize();
        binTree0.add(0);
        binTree0.add((int) (byte) 100);
        binTree0.add((int) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) 10);
        int int3 = binTree0.getSize();
        binTree0.add((int) (byte) 10);
        binTree0.add(3);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) '#');
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        int int5 = binTree0.getSize();
        binTree0.add((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        int int3 = binTree0.getSize();
        binTree0.add((int) (byte) 0);
        int int6 = binTree0.getSize();
        int int7 = binTree0.getSize();
        binTree0.add((int) (byte) 10);
        binTree0.add((int) (short) 100);
        binTree0.add((-1));
        int int14 = binTree0.getSize();
        binTree0.add(0);
        binTree0.add((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        binTree0.add((int) '#');
        binTree0.add((-1));
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        binTree0.add(2);
        int int5 = binTree0.getSize();
        binTree0.add((int) (short) -1);
        binTree0.add((int) (short) 10);
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        int int2 = binTree0.getSize();
        binTree0.add(10);
        int int5 = binTree0.getSize();
        binTree0.add((int) (byte) 10);
        binTree0.add((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add(2);
        int int6 = binTree0.getSize();
        int int7 = binTree0.getSize();
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        int int3 = binTree0.getSize();
        binTree0.add(0);
        binTree0.add((int) (byte) 100);
        binTree0.add((int) (short) 100);
        int int10 = binTree0.getSize();
        int int11 = binTree0.getSize();
        int int12 = binTree0.getSize();
        int int13 = binTree0.getSize();
        binTree0.add(5);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        int int2 = binTree0.getSize();
        binTree0.add(10);
        int int5 = binTree0.getSize();
        binTree0.add((int) (byte) 10);
        int int8 = binTree0.getSize();
        binTree0.add(5);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        int int3 = binTree0.getSize();
        binTree0.add(0);
        int int6 = binTree0.getSize();
        binTree0.add((int) (byte) -1);
        binTree0.add(2);
        binTree0.add((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        int int3 = binTree0.getSize();
        binTree0.add(0);
        int int6 = binTree0.getSize();
        binTree0.add((int) (byte) -1);
        int int9 = binTree0.getSize();
        binTree0.add((int) 'a');
        binTree0.add(2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        int int2 = binTree0.getSize();
        binTree0.add(10);
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        binTree0.add((int) (short) 10);
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        binTree0.add(5);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add(2);
        binTree0.add((int) (short) 10);
        binTree0.add((int) (short) 100);
        binTree0.add(4);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        int int3 = binTree0.getSize();
        binTree0.add(1);
        binTree0.add(100);
        int int8 = binTree0.getSize();
        binTree0.add(1);
        int int11 = binTree0.getSize();
        int int12 = binTree0.getSize();
        binTree0.add((int) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        binTree0.add(100);
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        int int7 = binTree0.getSize();
        binTree0.add((int) (byte) -1);
        binTree0.add((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        binTree0.add((int) ' ');
        binTree0.add((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        int int2 = binTree0.getSize();
        binTree0.add(10);
        int int5 = binTree0.getSize();
        binTree0.add((int) (byte) 10);
        binTree0.add(2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        int int3 = binTree0.getSize();
        binTree0.add(0);
        int int6 = binTree0.getSize();
        binTree0.add(1);
        binTree0.add(4);
        binTree0.add(100);
        binTree0.add(2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        binTree0.add((int) '#');
        int int7 = binTree0.getSize();
        binTree0.add((int) '#');
        binTree0.add(2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) 10);
        int int3 = binTree0.getSize();
        binTree0.add((int) (byte) 10);
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        int int3 = binTree0.getSize();
        binTree0.add(0);
        binTree0.add((int) (byte) 100);
        binTree0.add(4);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        binTree0.add((int) (short) 10);
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        int int7 = binTree0.getSize();
        int int8 = binTree0.getSize();
        binTree0.add((int) '4');
        int int11 = binTree0.getSize();
        binTree0.add((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        int int3 = binTree0.getSize();
        binTree0.add(1);
        binTree0.add(100);
        int int8 = binTree0.getSize();
        binTree0.add(1);
        binTree0.add((int) (short) 1);
        int int13 = binTree0.getSize();
        int int14 = binTree0.getSize();
        binTree0.add((int) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        binTree0.add(100);
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        int int7 = binTree0.getSize();
        binTree0.add(3);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        int int3 = binTree0.getSize();
        binTree0.add(1);
        binTree0.add((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        int int3 = binTree0.getSize();
        binTree0.add(2);
        binTree0.add((int) (byte) 10);
        binTree0.add((int) (byte) 10);
        int int10 = binTree0.getSize();
        binTree0.add((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) '#');
        binTree0.add((int) '#');
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        int int7 = binTree0.getSize();
        binTree0.add(5);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        binTree0.add((int) ' ');
        binTree0.add((int) (byte) -1);
        int int9 = binTree0.getSize();
        int int10 = binTree0.getSize();
        binTree0.add((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        int int4 = binTree0.getSize();
        int int5 = binTree0.getSize();
        binTree0.add((int) '4');
        binTree0.add((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        binTree0.add((int) (short) 10);
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        binTree0.add((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        int int4 = binTree0.getSize();
        int int5 = binTree0.getSize();
        binTree0.add((int) '4');
        binTree0.add((int) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        binTree0.add((int) '#');
        binTree0.add(100);
        binTree0.add((int) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        binTree0.add(100);
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        binTree0.add((int) (byte) -1);
        int int9 = binTree0.getSize();
        binTree0.add(2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        int int3 = binTree0.getSize();
        binTree0.add(0);
        int int6 = binTree0.getSize();
        binTree0.add(1);
        binTree0.add(4);
        binTree0.add(100);
        int int13 = binTree0.getSize();
        binTree0.add((int) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        int int2 = binTree0.getSize();
        binTree0.add(10);
        binTree0.add(100);
        binTree0.add((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        int int3 = binTree0.getSize();
        binTree0.add((int) (byte) 0);
        int int6 = binTree0.getSize();
        int int7 = binTree0.getSize();
        binTree0.add((int) (byte) 10);
        int int10 = binTree0.getSize();
        binTree0.add(4);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        int int3 = binTree0.getSize();
        binTree0.add(2);
        binTree0.add((int) (byte) 10);
        binTree0.add((int) (byte) 10);
        binTree0.add((int) ' ');
        binTree0.add((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add(2);
        int int6 = binTree0.getSize();
        int int7 = binTree0.getSize();
        int int8 = binTree0.getSize();
        binTree0.add((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        int int3 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        int int6 = binTree0.getSize();
        int int7 = binTree0.getSize();
        binTree0.add(10);
        binTree0.add((int) (short) -1);
        binTree0.add((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (byte) -1);
        binTree0.add((int) (short) 100);
        binTree0.add((-1));
        binTree0.add((int) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        binTree0.add((int) (short) 10);
        binTree0.add(2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        binTree0.add((int) (short) 10);
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        int int7 = binTree0.getSize();
        int int8 = binTree0.getSize();
        binTree0.add((int) (short) 0);
        binTree0.add((int) (short) 10);
        binTree0.add(5);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        int int3 = binTree0.getSize();
        binTree0.add(0);
        int int6 = binTree0.getSize();
        binTree0.add((int) (byte) -1);
        binTree0.add(10);
        binTree0.add((int) (byte) -1);
        binTree0.add(100);
        binTree0.add(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        int int3 = binTree0.getSize();
        binTree0.add(0);
        binTree0.add((int) (byte) 100);
        binTree0.add((int) (short) 100);
        int int10 = binTree0.getSize();
        binTree0.add(100);
        binTree0.add((int) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        int int3 = binTree0.getSize();
        binTree0.add(0);
        binTree0.add((int) (byte) 100);
        binTree0.add(10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add((int) (byte) 100);
        binTree0.add(100);
        binTree0.add((int) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        int int3 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        int int6 = binTree0.getSize();
        binTree0.add((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        binTree0.add(100);
        binTree0.add((int) (byte) 100);
        binTree0.add(5);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        int int3 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        int int6 = binTree0.getSize();
        int int7 = binTree0.getSize();
        binTree0.add(10);
        binTree0.add((int) (short) -1);
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        binTree0.add(100);
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        binTree0.add((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        binTree0.add(100);
        binTree0.add(10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        int int3 = binTree0.getSize();
        binTree0.add(0);
        binTree0.add((int) (byte) 100);
        binTree0.add(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) 10);
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        binTree0.add((int) ' ');
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add(10);
        binTree0.add((int) (short) 10);
        binTree0.add((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        binTree0.add((int) '#');
        int int7 = binTree0.getSize();
        binTree0.add((int) '#');
        binTree0.add((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        binTree0.add((int) ' ');
        binTree0.add((int) (byte) -1);
        int int9 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        binTree0.add((int) (short) 10);
        int int5 = binTree0.getSize();
        binTree0.add((int) (byte) 0);
        int int8 = binTree0.getSize();
        int int9 = binTree0.getSize();
        binTree0.add(3);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        int int3 = binTree0.getSize();
        binTree0.add(0);
        int int6 = binTree0.getSize();
        binTree0.add(1);
        binTree0.add(4);
        binTree0.add(100);
        binTree0.add(5);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        int int2 = binTree0.getSize();
        binTree0.add(10);
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        int int7 = binTree0.getSize();
        int int8 = binTree0.getSize();
        binTree0.add((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        int int3 = binTree0.getSize();
        binTree0.add((int) (short) 100);
        binTree0.add((int) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        int int3 = binTree0.getSize();
        binTree0.add(0);
        int int6 = binTree0.getSize();
        binTree0.add(1);
        binTree0.add((int) (byte) 10);
        int int11 = binTree0.getSize();
        binTree0.add((int) 'a');
        binTree0.add((int) (short) 1);
        binTree0.add((int) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        int int3 = binTree0.getSize();
        binTree0.add(1);
        binTree0.add((int) (short) 0);
        int int8 = binTree0.getSize();
        binTree0.add((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        int int3 = binTree0.getSize();
        binTree0.add(0);
        binTree0.add((int) (byte) 100);
        binTree0.add((int) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        binTree0.add((int) (short) 10);
        binTree0.add((int) (byte) -1);
        binTree0.add((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        int int3 = binTree0.getSize();
        binTree0.add(2);
        binTree0.add((int) (short) 0);
        int int8 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        int int3 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        int int6 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        int int9 = binTree0.getSize();
        binTree0.add((int) '4');
        binTree0.add((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add((int) (byte) 100);
        int int6 = binTree0.getSize();
        binTree0.add((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add(2);
        binTree0.add(2);
        binTree0.add((int) 'a');
        binTree0.add((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        int int3 = binTree0.getSize();
        binTree0.add(0);
        int int6 = binTree0.getSize();
        binTree0.add(1);
        binTree0.add((int) (byte) 10);
        int int11 = binTree0.getSize();
        binTree0.add((int) 'a');
        int int14 = binTree0.getSize();
        binTree0.add(4);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add(2);
        binTree0.add((int) (short) 10);
        int int8 = binTree0.getSize();
        binTree0.add((int) '#');
        binTree0.add(2);
        binTree0.add(4);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add((int) (byte) 100);
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        binTree0.add(100);
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        binTree0.add((int) (byte) -1);
        binTree0.add((int) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        int int3 = binTree0.getSize();
        binTree0.add(0);
        int int6 = binTree0.getSize();
        binTree0.add(1);
        binTree0.add(4);
        int int11 = binTree0.getSize();
        binTree0.add((int) (short) 0);
        int int14 = binTree0.getSize();
        binTree0.add((int) 'a');
        binTree0.add(10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        int int3 = binTree0.getSize();
        binTree0.add(1);
        binTree0.add((int) (short) 1);
        int int8 = binTree0.getSize();
        binTree0.add((int) (short) 100);
        binTree0.add((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add(10);
        int int4 = binTree0.getSize();
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        binTree0.add(2);
        int int5 = binTree0.getSize();
        binTree0.add((int) (short) -1);
        binTree0.add((int) (short) 10);
        binTree0.add((int) '#');
        binTree0.add((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        int int3 = binTree0.getSize();
        binTree0.add((int) (short) 100);
        int int6 = binTree0.getSize();
        binTree0.add((int) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) 10);
        int int3 = binTree0.getSize();
        binTree0.add((int) (byte) 10);
        int int6 = binTree0.getSize();
        binTree0.add((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add((int) (byte) 100);
        int int6 = binTree0.getSize();
        int int7 = binTree0.getSize();
        binTree0.add(10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        int int3 = binTree0.getSize();
        binTree0.add((int) (short) 100);
        int int6 = binTree0.getSize();
        int int7 = binTree0.getSize();
        binTree0.add((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (short) 0);
        binTree0.add((int) (short) 10);
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        int int7 = binTree0.getSize();
        int int8 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        int int2 = binTree0.getSize();
        binTree0.add(10);
        int int5 = binTree0.getSize();
        binTree0.add((int) 'a');
        binTree0.add((int) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        binTree0.add(2);
        int int5 = binTree0.getSize();
        binTree0.add((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        int int1 = binTree0.getSize();
        int int2 = binTree0.getSize();
        binTree0.add(10);
        int int5 = binTree0.getSize();
        binTree0.add((int) (byte) 10);
        binTree0.add((int) 'a');
        int int10 = binTree0.getSize();
        int int11 = binTree0.getSize();
        binTree0.add(3);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        system.testclass.BinTree binTree0 = new system.testclass.BinTree();
        binTree0.add((int) (byte) -1);
        binTree0.add(100);
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        int int7 = binTree0.getSize();
        binTree0.add((int) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for binTree0", binTree0.repOK_1());
    }
}

