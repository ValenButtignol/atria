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
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        binTree0.add(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        binTree0.add((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        binTree0.add((int) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        int int5 = binTree0.getSize();
        binTree0.add((int) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        binTree0.add((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) (byte) 10);
        binTree0.add((int) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) (byte) 10);
        int int3 = binTree0.getSize();
        binTree0.add((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) (byte) 10);
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        binTree0.add((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        binTree0.add((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        binTree0.add((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        int int6 = binTree0.getSize();
        binTree0.add((int) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        boolean boolean4 = binTree0.repOK();
        int int5 = binTree0.getSize();
        binTree0.add(100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        boolean boolean5 = binTree0.repOK();
        binTree0.add((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) (byte) 10);
        int int3 = binTree0.getSize();
        binTree0.add((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        binTree0.add((int) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        binTree0.add((int) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        int int3 = binTree0.getSize();
        binTree0.add((int) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        int int6 = binTree0.getSize();
        int int7 = binTree0.getSize();
        binTree0.add((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        binTree0.add((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        int int3 = binTree0.getSize();
        binTree0.add((int) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        boolean boolean7 = binTree0.repOK();
        binTree0.add((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        boolean boolean4 = binTree0.repOK();
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        binTree0.add((int) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        binTree0.add((int) '4');
        binTree0.add((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        int int3 = binTree0.getSize();
        binTree0.add((int) '4');
        binTree0.add((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        int int3 = binTree0.getSize();
        binTree0.add((int) '4');
        binTree0.add((int) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        int int6 = binTree0.getSize();
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        boolean boolean7 = binTree0.repOK();
        int int8 = binTree0.getSize();
        boolean boolean9 = binTree0.repOK();
        binTree0.add((int) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        boolean boolean4 = binTree0.repOK();
        int int5 = binTree0.getSize();
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        int int3 = binTree0.getSize();
        binTree0.add((int) '4');
        binTree0.add(100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        boolean boolean7 = binTree0.repOK();
        int int8 = binTree0.getSize();
        boolean boolean9 = binTree0.repOK();
        binTree0.add((int) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) (byte) 10);
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        binTree0.add(100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        int int5 = binTree0.getSize();
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        boolean boolean7 = binTree0.repOK();
        int int8 = binTree0.getSize();
        binTree0.add((int) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        binTree0.add((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        binTree0.add((int) (byte) 1);
        binTree0.add((int) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        int int7 = binTree0.getSize();
        boolean boolean8 = binTree0.repOK();
        binTree0.add((int) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        int int5 = binTree0.getSize();
        binTree0.add((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) (byte) 10);
        binTree0.add((int) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) (byte) 10);
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        binTree0.add((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        binTree0.add((int) (byte) 1);
        int int5 = binTree0.getSize();
        boolean boolean6 = binTree0.repOK();
        binTree0.add((int) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) (byte) 10);
        binTree0.add((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        int int3 = binTree0.getSize();
        boolean boolean4 = binTree0.repOK();
        binTree0.add(100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        int int7 = binTree0.getSize();
        boolean boolean8 = binTree0.repOK();
        binTree0.add((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        boolean boolean4 = binTree0.repOK();
        int int5 = binTree0.getSize();
        binTree0.add((int) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        boolean boolean7 = binTree0.repOK();
        int int8 = binTree0.getSize();
        binTree0.add((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        int int1 = binTree0.getSize();
        boolean boolean2 = binTree0.repOK();
        binTree0.add((int) (byte) 10);
        binTree0.add((int) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        int int6 = binTree0.getSize();
        binTree0.add((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((-1));
        boolean boolean3 = binTree0.repOK();
        binTree0.add((int) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) (byte) 10);
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        binTree0.add((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        boolean boolean7 = binTree0.repOK();
        int int8 = binTree0.getSize();
        binTree0.add((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        int int7 = binTree0.getSize();
        binTree0.add((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        int int7 = binTree0.getSize();
        binTree0.add((int) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        boolean boolean1 = binTree0.repOK();
        binTree0.add((int) (byte) 100);
        int int4 = binTree0.getSize();
        binTree0.add((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        boolean boolean1 = binTree0.repOK();
        binTree0.add((int) (short) 100);
        binTree0.add(10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        int int3 = binTree0.getSize();
        boolean boolean4 = binTree0.repOK();
        binTree0.add((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        int int3 = binTree0.getSize();
        boolean boolean4 = binTree0.repOK();
        int int5 = binTree0.getSize();
        binTree0.add((int) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        boolean boolean7 = binTree0.repOK();
        int int8 = binTree0.getSize();
        boolean boolean9 = binTree0.repOK();
        boolean boolean10 = binTree0.repOK();
        binTree0.add(10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(100);
        binTree0.add((int) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        binTree0.add((int) (byte) 1);
        binTree0.add((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        boolean boolean7 = binTree0.repOK();
        binTree0.add((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) (byte) 10);
        int int3 = binTree0.getSize();
        binTree0.add((int) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        boolean boolean3 = binTree0.repOK();
        binTree0.add(100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        boolean boolean5 = binTree0.repOK();
        binTree0.add((int) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        int int3 = binTree0.getSize();
        boolean boolean4 = binTree0.repOK();
        int int5 = binTree0.getSize();
        binTree0.add((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((-1));
        binTree0.add((int) (byte) -1);
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        int int5 = binTree0.getSize();
        binTree0.add((int) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        int int7 = binTree0.getSize();
        binTree0.add((int) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        boolean boolean7 = binTree0.repOK();
        int int8 = binTree0.getSize();
        boolean boolean9 = binTree0.repOK();
        int int10 = binTree0.getSize();
        boolean boolean11 = binTree0.repOK();
        binTree0.add((int) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        int int3 = binTree0.getSize();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        binTree0.add((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        boolean boolean7 = binTree0.repOK();
        int int8 = binTree0.getSize();
        boolean boolean9 = binTree0.repOK();
        int int10 = binTree0.getSize();
        boolean boolean11 = binTree0.repOK();
        int int12 = binTree0.getSize();
        binTree0.add((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        binTree0.add(10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        boolean boolean7 = binTree0.repOK();
        int int8 = binTree0.getSize();
        boolean boolean9 = binTree0.repOK();
        int int10 = binTree0.getSize();
        int int11 = binTree0.getSize();
        boolean boolean12 = binTree0.repOK();
        binTree0.add(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        boolean boolean7 = binTree0.repOK();
        int int8 = binTree0.getSize();
        boolean boolean9 = binTree0.repOK();
        int int10 = binTree0.getSize();
        int int11 = binTree0.getSize();
        boolean boolean12 = binTree0.repOK();
        binTree0.add((int) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        int int3 = binTree0.getSize();
        binTree0.add((int) '4');
        int int6 = binTree0.getSize();
        binTree0.add((int) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        binTree0.add((int) (byte) 1);
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        binTree0.add((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        binTree0.add((int) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        boolean boolean1 = binTree0.repOK();
        boolean boolean2 = binTree0.repOK();
        binTree0.add((int) (byte) 10);
        binTree0.add(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        int int3 = binTree0.getSize();
        binTree0.add((int) '4');
        int int6 = binTree0.getSize();
        binTree0.add((int) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        binTree0.add((int) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        boolean boolean5 = binTree0.repOK();
        binTree0.add((int) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        int int5 = binTree0.getSize();
        boolean boolean6 = binTree0.repOK();
        binTree0.add((int) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        int int3 = binTree0.getSize();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        boolean boolean7 = binTree0.repOK();
        binTree0.add((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        int int1 = binTree0.getSize();
        boolean boolean2 = binTree0.repOK();
        binTree0.add((int) (byte) 10);
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        binTree0.add((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        binTree0.add((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        binTree0.add((int) (byte) 1);
        int int5 = binTree0.getSize();
        boolean boolean6 = binTree0.repOK();
        binTree0.add((int) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        boolean boolean1 = binTree0.repOK();
        binTree0.add((int) (short) 100);
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        int int7 = binTree0.getSize();
        boolean boolean8 = binTree0.repOK();
        int int9 = binTree0.getSize();
        binTree0.add((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        binTree0.add((int) (byte) 1);
        binTree0.add((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        int int7 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        int int6 = binTree0.getSize();
        int int7 = binTree0.getSize();
        int int8 = binTree0.getSize();
        binTree0.add((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        boolean boolean7 = binTree0.repOK();
        boolean boolean8 = binTree0.repOK();
        binTree0.add((int) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        binTree0.add((int) '4');
        boolean boolean7 = binTree0.repOK();
        binTree0.add((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((-1));
        int int3 = binTree0.getSize();
        boolean boolean4 = binTree0.repOK();
        binTree0.add((int) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        boolean boolean7 = binTree0.repOK();
        int int8 = binTree0.getSize();
        boolean boolean9 = binTree0.repOK();
        int int10 = binTree0.getSize();
        boolean boolean11 = binTree0.repOK();
        int int12 = binTree0.getSize();
        binTree0.add((int) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        boolean boolean7 = binTree0.repOK();
        binTree0.add((int) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(0);
        binTree0.add((int) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(0);
        binTree0.add(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        boolean boolean1 = binTree0.repOK();
        boolean boolean2 = binTree0.repOK();
        binTree0.add((int) (short) 10);
        binTree0.add((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        int int3 = binTree0.getSize();
        binTree0.add((int) '4');
        int int6 = binTree0.getSize();
        binTree0.add((int) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        boolean boolean3 = binTree0.repOK();
        binTree0.add((int) (short) 1);
        binTree0.add((int) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) (byte) 10);
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        binTree0.add((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        binTree0.add((int) '4');
        int int9 = binTree0.getSize();
        binTree0.add((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        boolean boolean1 = binTree0.repOK();
        boolean boolean2 = binTree0.repOK();
        int int3 = binTree0.getSize();
        binTree0.add((int) (byte) 100);
        binTree0.add((int) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        int int3 = binTree0.getSize();
        binTree0.add((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        int int6 = binTree0.getSize();
        int int7 = binTree0.getSize();
        binTree0.add((int) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        int int3 = binTree0.getSize();
        binTree0.add((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        boolean boolean1 = binTree0.repOK();
        binTree0.add((int) (byte) 100);
        boolean boolean4 = binTree0.repOK();
        binTree0.add((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        boolean boolean1 = binTree0.repOK();
        boolean boolean2 = binTree0.repOK();
        binTree0.add((int) (short) 10);
        binTree0.add(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        boolean boolean4 = binTree0.repOK();
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        int int7 = binTree0.getSize();
        boolean boolean8 = binTree0.repOK();
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        boolean boolean1 = binTree0.repOK();
        binTree0.add(0);
        int int4 = binTree0.getSize();
        int int5 = binTree0.getSize();
        binTree0.add((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        boolean boolean1 = binTree0.repOK();
        boolean boolean2 = binTree0.repOK();
        binTree0.add((int) (short) 10);
        binTree0.add((int) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        int int7 = binTree0.getSize();
        boolean boolean8 = binTree0.repOK();
        int int9 = binTree0.getSize();
        binTree0.add((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((-1));
        binTree0.add((int) (byte) -1);
        boolean boolean5 = binTree0.repOK();
        int int6 = binTree0.getSize();
        binTree0.add((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((-1));
        binTree0.add((int) (byte) -1);
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((-1));
        binTree0.add((int) (byte) -1);
        boolean boolean5 = binTree0.repOK();
        int int6 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        boolean boolean7 = binTree0.repOK();
        int int8 = binTree0.getSize();
        boolean boolean9 = binTree0.repOK();
        int int10 = binTree0.getSize();
        boolean boolean11 = binTree0.repOK();
        int int12 = binTree0.getSize();
        boolean boolean13 = binTree0.repOK();
        boolean boolean14 = binTree0.repOK();
        binTree0.add((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        int int7 = binTree0.getSize();
        binTree0.add(10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        int int3 = binTree0.getSize();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        binTree0.add((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        int int3 = binTree0.getSize();
        boolean boolean4 = binTree0.repOK();
        binTree0.add((int) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((-1));
        binTree0.add((int) (byte) -1);
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        boolean boolean7 = binTree0.repOK();
        binTree0.add((int) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        int int3 = binTree0.getSize();
        boolean boolean4 = binTree0.repOK();
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        binTree0.add((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) (byte) -1);
        binTree0.add((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        boolean boolean1 = binTree0.repOK();
        binTree0.add((int) (byte) 100);
        boolean boolean4 = binTree0.repOK();
        binTree0.add((int) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        int int3 = binTree0.getSize();
        boolean boolean4 = binTree0.repOK();
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        boolean boolean7 = binTree0.repOK();
        int int8 = binTree0.getSize();
        binTree0.add((int) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        binTree0.add((int) (byte) 1);
        boolean boolean5 = binTree0.repOK();
        binTree0.add((int) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        boolean boolean1 = binTree0.repOK();
        binTree0.add(0);
        binTree0.add((int) (byte) 0);
        binTree0.add(0);
        binTree0.add((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(10);
        binTree0.add((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        int int1 = binTree0.getSize();
        boolean boolean2 = binTree0.repOK();
        int int3 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add((int) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        int int3 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        boolean boolean7 = binTree0.repOK();
        binTree0.add((int) '4');
        binTree0.add((int) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        int int3 = binTree0.getSize();
        boolean boolean4 = binTree0.repOK();
        int int5 = binTree0.getSize();
        binTree0.add((int) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        boolean boolean1 = binTree0.repOK();
        binTree0.add(0);
        int int4 = binTree0.getSize();
        int int5 = binTree0.getSize();
        binTree0.add(0);
        int int8 = binTree0.getSize();
        binTree0.add((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(0);
        binTree0.add((int) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        binTree0.add((int) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        int int1 = binTree0.getSize();
        boolean boolean2 = binTree0.repOK();
        binTree0.add((int) (byte) 10);
        binTree0.add((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        boolean boolean1 = binTree0.repOK();
        boolean boolean2 = binTree0.repOK();
        binTree0.add((int) (byte) 10);
        binTree0.add((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        int int3 = binTree0.getSize();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        binTree0.add((int) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(100);
        binTree0.add((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        boolean boolean7 = binTree0.repOK();
        binTree0.add((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((-1));
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        int int7 = binTree0.getSize();
        binTree0.add((int) '4');
        binTree0.add((int) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        boolean boolean5 = binTree0.repOK();
        binTree0.add((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        int int1 = binTree0.getSize();
        boolean boolean2 = binTree0.repOK();
        int int3 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        boolean boolean3 = binTree0.repOK();
        boolean boolean4 = binTree0.repOK();
        binTree0.add((int) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        boolean boolean4 = binTree0.repOK();
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        int int7 = binTree0.getSize();
        boolean boolean8 = binTree0.repOK();
        int int9 = binTree0.getSize();
        int int10 = binTree0.getSize();
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        boolean boolean1 = binTree0.repOK();
        binTree0.add(0);
        binTree0.add((int) (byte) 0);
        boolean boolean6 = binTree0.repOK();
        boolean boolean7 = binTree0.repOK();
        binTree0.add(100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        boolean boolean7 = binTree0.repOK();
        int int8 = binTree0.getSize();
        boolean boolean9 = binTree0.repOK();
        int int10 = binTree0.getSize();
        boolean boolean11 = binTree0.repOK();
        int int12 = binTree0.getSize();
        boolean boolean13 = binTree0.repOK();
        boolean boolean14 = binTree0.repOK();
        binTree0.add((int) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        int int3 = binTree0.getSize();
        boolean boolean4 = binTree0.repOK();
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        binTree0.add(1);
        binTree0.add((int) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((-1));
        boolean boolean3 = binTree0.repOK();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        binTree0.add(100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        int int6 = binTree0.getSize();
        int int7 = binTree0.getSize();
        int int8 = binTree0.getSize();
        binTree0.add(10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        int int7 = binTree0.getSize();
        boolean boolean8 = binTree0.repOK();
        int int9 = binTree0.getSize();
        binTree0.add((int) (byte) 1);
        int int12 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add((int) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        int int3 = binTree0.getSize();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        binTree0.add((int) (byte) 1);
        binTree0.add((int) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        boolean boolean1 = binTree0.repOK();
        binTree0.add(0);
        int int4 = binTree0.getSize();
        binTree0.add(0);
        boolean boolean7 = binTree0.repOK();
        binTree0.add((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        boolean boolean4 = binTree0.repOK();
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        int int7 = binTree0.getSize();
        boolean boolean8 = binTree0.repOK();
        int int9 = binTree0.getSize();
        binTree0.add((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        boolean boolean4 = binTree0.repOK();
        int int5 = binTree0.getSize();
        boolean boolean6 = binTree0.repOK();
        int int7 = binTree0.getSize();
        boolean boolean8 = binTree0.repOK();
        binTree0.add((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        boolean boolean1 = binTree0.repOK();
        binTree0.add(0);
        binTree0.add((int) (byte) 0);
        boolean boolean6 = binTree0.repOK();
        boolean boolean7 = binTree0.repOK();
        binTree0.add((int) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        int int3 = binTree0.getSize();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        binTree0.add((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        int int7 = binTree0.getSize();
        boolean boolean8 = binTree0.repOK();
        binTree0.add((int) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((-1));
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((-1));
        binTree0.add((int) (byte) -1);
        boolean boolean5 = binTree0.repOK();
        binTree0.add((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        int int3 = binTree0.getSize();
        boolean boolean4 = binTree0.repOK();
        int int5 = binTree0.getSize();
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        boolean boolean7 = binTree0.repOK();
        int int8 = binTree0.getSize();
        int int9 = binTree0.getSize();
        binTree0.add((int) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        binTree0.add((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        int int7 = binTree0.getSize();
        int int8 = binTree0.getSize();
        binTree0.add((int) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        int int3 = binTree0.getSize();
        boolean boolean4 = binTree0.repOK();
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        binTree0.add(10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        boolean boolean7 = binTree0.repOK();
        int int8 = binTree0.getSize();
        boolean boolean9 = binTree0.repOK();
        int int10 = binTree0.getSize();
        int int11 = binTree0.getSize();
        boolean boolean12 = binTree0.repOK();
        binTree0.add((int) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(100);
        binTree0.add((int) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        boolean boolean7 = binTree0.repOK();
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((-1));
        binTree0.add((int) (byte) -1);
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        binTree0.add((int) (byte) -1);
        binTree0.add((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((-1));
        int int3 = binTree0.getSize();
        boolean boolean4 = binTree0.repOK();
        binTree0.add((int) (byte) -1);
        binTree0.add(100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        int int6 = binTree0.getSize();
        int int7 = binTree0.getSize();
        binTree0.add((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(100);
        int int3 = binTree0.getSize();
        boolean boolean4 = binTree0.repOK();
        binTree0.add((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        boolean boolean7 = binTree0.repOK();
        int int8 = binTree0.getSize();
        boolean boolean9 = binTree0.repOK();
        int int10 = binTree0.getSize();
        boolean boolean11 = binTree0.repOK();
        int int12 = binTree0.getSize();
        boolean boolean13 = binTree0.repOK();
        int int14 = binTree0.getSize();
        binTree0.add((int) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        int int7 = binTree0.getSize();
        boolean boolean8 = binTree0.repOK();
        boolean boolean9 = binTree0.repOK();
        int int10 = binTree0.getSize();
        binTree0.add((int) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        boolean boolean7 = binTree0.repOK();
        int int8 = binTree0.getSize();
        int int9 = binTree0.getSize();
        boolean boolean10 = binTree0.repOK();
        binTree0.add((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        boolean boolean1 = binTree0.repOK();
        binTree0.add((int) (short) 100);
        binTree0.add((int) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        int int3 = binTree0.getSize();
        binTree0.add((int) '4');
        binTree0.add((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        boolean boolean1 = binTree0.repOK();
        boolean boolean2 = binTree0.repOK();
        binTree0.add((int) (byte) 10);
        int int5 = binTree0.getSize();
        binTree0.add(10);
        binTree0.add((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((-1));
        int int3 = binTree0.getSize();
        binTree0.add(100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((-1));
        int int3 = binTree0.getSize();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        int int6 = binTree0.getSize();
        binTree0.add((int) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        boolean boolean5 = binTree0.repOK();
        int int6 = binTree0.getSize();
        boolean boolean7 = binTree0.repOK();
        int int8 = binTree0.getSize();
        binTree0.add(10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        int int1 = binTree0.getSize();
        boolean boolean2 = binTree0.repOK();
        int int3 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        int int6 = binTree0.getSize();
        binTree0.add((int) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        int int7 = binTree0.getSize();
        binTree0.add((int) '4');
        binTree0.add((int) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        int int3 = binTree0.getSize();
        boolean boolean4 = binTree0.repOK();
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        boolean boolean7 = binTree0.repOK();
        binTree0.add((int) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        boolean boolean4 = binTree0.repOK();
        int int5 = binTree0.getSize();
        binTree0.add((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((-1));
        binTree0.add((int) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        int int5 = binTree0.getSize();
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        int int1 = binTree0.getSize();
        boolean boolean2 = binTree0.repOK();
        int int3 = binTree0.getSize();
        binTree0.add((int) (short) 100);
        boolean boolean6 = binTree0.repOK();
        int int7 = binTree0.getSize();
        binTree0.add((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((-1));
        int int3 = binTree0.getSize();
        boolean boolean4 = binTree0.repOK();
        int int5 = binTree0.getSize();
        binTree0.add((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        binTree0.add((int) '4');
        binTree0.add((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        int int1 = binTree0.getSize();
        boolean boolean2 = binTree0.repOK();
        binTree0.add((int) (byte) 10);
        int int5 = binTree0.getSize();
        boolean boolean6 = binTree0.repOK();
        int int7 = binTree0.getSize();
        binTree0.add(10);
        int int10 = binTree0.getSize();
        binTree0.add((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        int int7 = binTree0.getSize();
        binTree0.add((int) (byte) 1);
        int int10 = binTree0.getSize();
        binTree0.add((int) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        int int3 = binTree0.getSize();
        binTree0.add((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        boolean boolean3 = binTree0.repOK();
        boolean boolean4 = binTree0.repOK();
        int int5 = binTree0.getSize();
        binTree0.add((int) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        int int7 = binTree0.getSize();
        int int8 = binTree0.getSize();
        boolean boolean9 = binTree0.repOK();
        binTree0.add((int) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        int int1 = binTree0.getSize();
        boolean boolean2 = binTree0.repOK();
        binTree0.add((int) (byte) 10);
        int int5 = binTree0.getSize();
        boolean boolean6 = binTree0.repOK();
        int int7 = binTree0.getSize();
        binTree0.add(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        int int7 = binTree0.getSize();
        boolean boolean8 = binTree0.repOK();
        int int9 = binTree0.getSize();
        boolean boolean10 = binTree0.repOK();
        boolean boolean11 = binTree0.repOK();
        boolean boolean12 = binTree0.repOK();
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((-1));
        int int3 = binTree0.getSize();
        boolean boolean4 = binTree0.repOK();
        binTree0.add((int) (byte) -1);
        binTree0.add((int) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        binTree0.add(10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        boolean boolean7 = binTree0.repOK();
        boolean boolean8 = binTree0.repOK();
        int int9 = binTree0.getSize();
        binTree0.add((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        boolean boolean7 = binTree0.repOK();
        int int8 = binTree0.getSize();
        boolean boolean9 = binTree0.repOK();
        binTree0.add((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) (byte) 10);
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        binTree0.add(10);
        binTree0.add((int) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        boolean boolean1 = binTree0.repOK();
        binTree0.add((int) (byte) 100);
        int int4 = binTree0.getSize();
        binTree0.add((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        int int3 = binTree0.getSize();
        boolean boolean4 = binTree0.repOK();
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        boolean boolean7 = binTree0.repOK();
        int int8 = binTree0.getSize();
        binTree0.add(10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((-1));
        int int3 = binTree0.getSize();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        int int6 = binTree0.getSize();
        binTree0.add((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        boolean boolean1 = binTree0.repOK();
        binTree0.add(0);
        binTree0.add((int) (byte) 0);
        binTree0.add(0);
        boolean boolean8 = binTree0.repOK();
        boolean boolean9 = binTree0.repOK();
        binTree0.add((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        boolean boolean7 = binTree0.repOK();
        int int8 = binTree0.getSize();
        binTree0.add((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        binTree0.add((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        boolean boolean7 = binTree0.repOK();
        boolean boolean8 = binTree0.repOK();
        binTree0.add((int) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        binTree0.add(1);
        binTree0.add((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(10);
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        binTree0.add((int) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        int int1 = binTree0.getSize();
        boolean boolean2 = binTree0.repOK();
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        binTree0.add((int) (short) -1);
        binTree0.add((int) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        boolean boolean1 = binTree0.repOK();
        binTree0.add((int) (byte) 100);
        int int4 = binTree0.getSize();
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        binTree0.add((int) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        boolean boolean7 = binTree0.repOK();
        binTree0.add((int) '4');
        binTree0.add((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        int int3 = binTree0.getSize();
        binTree0.add((int) '4');
        int int6 = binTree0.getSize();
        binTree0.add(10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        boolean boolean5 = binTree0.repOK();
        binTree0.add((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        binTree0.add((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        int int3 = binTree0.getSize();
        boolean boolean4 = binTree0.repOK();
        int int5 = binTree0.getSize();
        binTree0.add((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        boolean boolean7 = binTree0.repOK();
        int int8 = binTree0.getSize();
        boolean boolean9 = binTree0.repOK();
        int int10 = binTree0.getSize();
        boolean boolean11 = binTree0.repOK();
        int int12 = binTree0.getSize();
        binTree0.add((int) '4');
        binTree0.add((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        int int1 = binTree0.getSize();
        boolean boolean2 = binTree0.repOK();
        binTree0.add((int) 'a');
        binTree0.add((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        binTree0.add((int) '4');
        int int7 = binTree0.getSize();
        binTree0.add(100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) (byte) 10);
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        int int5 = binTree0.getSize();
        binTree0.add((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((-1));
        binTree0.add((int) (byte) -1);
        boolean boolean5 = binTree0.repOK();
        binTree0.add((int) (short) -1);
        int int8 = binTree0.getSize();
        binTree0.add((int) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((-1));
        binTree0.add((int) (byte) -1);
        boolean boolean5 = binTree0.repOK();
        binTree0.add((int) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        boolean boolean7 = binTree0.repOK();
        int int8 = binTree0.getSize();
        boolean boolean9 = binTree0.repOK();
        boolean boolean10 = binTree0.repOK();
        binTree0.add((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        int int1 = binTree0.getSize();
        boolean boolean2 = binTree0.repOK();
        int int3 = binTree0.getSize();
        binTree0.add((int) (short) 100);
        boolean boolean6 = binTree0.repOK();
        int int7 = binTree0.getSize();
        binTree0.add((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        int int7 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        boolean boolean7 = binTree0.repOK();
        int int8 = binTree0.getSize();
        boolean boolean9 = binTree0.repOK();
        int int10 = binTree0.getSize();
        boolean boolean11 = binTree0.repOK();
        int int12 = binTree0.getSize();
        int int13 = binTree0.getSize();
        binTree0.add((int) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        int int7 = binTree0.getSize();
        int int8 = binTree0.getSize();
        binTree0.add((int) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        int int3 = binTree0.getSize();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        binTree0.add((int) (byte) 1);
        boolean boolean9 = binTree0.repOK();
        int int10 = binTree0.getSize();
        boolean boolean11 = binTree0.repOK();
        boolean boolean12 = binTree0.repOK();
        binTree0.add((int) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        binTree0.add((int) '4');
        binTree0.add(100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        boolean boolean1 = binTree0.repOK();
        binTree0.add(0);
        int int4 = binTree0.getSize();
        int int5 = binTree0.getSize();
        binTree0.add(0);
        int int8 = binTree0.getSize();
        binTree0.add((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((-1));
        binTree0.add((int) (byte) -1);
        boolean boolean5 = binTree0.repOK();
        int int6 = binTree0.getSize();
        boolean boolean7 = binTree0.repOK();
        binTree0.add((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        boolean boolean1 = binTree0.repOK();
        binTree0.add(0);
        binTree0.add((int) (byte) 0);
        boolean boolean6 = binTree0.repOK();
        int int7 = binTree0.getSize();
        boolean boolean8 = binTree0.repOK();
        int int9 = binTree0.getSize();
        binTree0.add((int) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        int int1 = binTree0.getSize();
        boolean boolean2 = binTree0.repOK();
        int int3 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        binTree0.add((int) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((-1));
        binTree0.add((int) (byte) -1);
        boolean boolean5 = binTree0.repOK();
        binTree0.add((int) (short) -1);
        boolean boolean8 = binTree0.repOK();
        binTree0.add((int) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        boolean boolean5 = binTree0.repOK();
        binTree0.add(100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        boolean boolean1 = binTree0.repOK();
        binTree0.add(0);
        binTree0.add((int) (byte) 0);
        binTree0.add(0);
        boolean boolean8 = binTree0.repOK();
        boolean boolean9 = binTree0.repOK();
        binTree0.add((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        int int1 = binTree0.getSize();
        boolean boolean2 = binTree0.repOK();
        int int3 = binTree0.getSize();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        binTree0.add(0);
        int int8 = binTree0.getSize();
        binTree0.add((int) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        int int7 = binTree0.getSize();
        binTree0.add((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        boolean boolean7 = binTree0.repOK();
        int int8 = binTree0.getSize();
        boolean boolean9 = binTree0.repOK();
        int int10 = binTree0.getSize();
        boolean boolean11 = binTree0.repOK();
        int int12 = binTree0.getSize();
        boolean boolean13 = binTree0.repOK();
        int int14 = binTree0.getSize();
        int int15 = binTree0.getSize();
        boolean boolean16 = binTree0.repOK();
        binTree0.add(100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        binTree0.add((int) (byte) 1);
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        int int7 = binTree0.getSize();
        boolean boolean8 = binTree0.repOK();
        binTree0.add((int) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        int int7 = binTree0.getSize();
        boolean boolean8 = binTree0.repOK();
        int int9 = binTree0.getSize();
        binTree0.add((int) (byte) 1);
        int int12 = binTree0.getSize();
        boolean boolean13 = binTree0.repOK();
        binTree0.add((int) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        int int3 = binTree0.getSize();
        boolean boolean4 = binTree0.repOK();
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        boolean boolean7 = binTree0.repOK();
        int int8 = binTree0.getSize();
        boolean boolean9 = binTree0.repOK();
        boolean boolean10 = binTree0.repOK();
        boolean boolean11 = binTree0.repOK();
        binTree0.add((int) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        int int1 = binTree0.getSize();
        boolean boolean2 = binTree0.repOK();
        int int3 = binTree0.getSize();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        binTree0.add(0);
        binTree0.add((int) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        boolean boolean7 = binTree0.repOK();
        binTree0.add((int) '4');
        int int10 = binTree0.getSize();
        binTree0.add((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        int int3 = binTree0.getSize();
        boolean boolean4 = binTree0.repOK();
        int int5 = binTree0.getSize();
        binTree0.add(10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        int int1 = binTree0.getSize();
        boolean boolean2 = binTree0.repOK();
        binTree0.add((int) (byte) 10);
        binTree0.add((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        boolean boolean1 = binTree0.repOK();
        binTree0.add((int) (byte) 100);
        int int4 = binTree0.getSize();
        boolean boolean5 = binTree0.repOK();
        binTree0.add((int) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(10);
        int int3 = binTree0.getSize();
        binTree0.add((int) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        boolean boolean4 = binTree0.repOK();
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        int int7 = binTree0.getSize();
        boolean boolean8 = binTree0.repOK();
        binTree0.add((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        boolean boolean7 = binTree0.repOK();
        int int8 = binTree0.getSize();
        int int9 = binTree0.getSize();
        int int10 = binTree0.getSize();
        boolean boolean11 = binTree0.repOK();
        boolean boolean12 = binTree0.repOK();
        int int13 = binTree0.getSize();
        binTree0.add(10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((-1));
        binTree0.add((int) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        int int3 = binTree0.getSize();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        boolean boolean7 = binTree0.repOK();
        boolean boolean8 = binTree0.repOK();
        binTree0.add((int) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        int int1 = binTree0.getSize();
        boolean boolean2 = binTree0.repOK();
        binTree0.add((int) (byte) 10);
        int int5 = binTree0.getSize();
        boolean boolean6 = binTree0.repOK();
        int int7 = binTree0.getSize();
        int int8 = binTree0.getSize();
        binTree0.add((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        binTree0.add((int) '4');
        boolean boolean7 = binTree0.repOK();
        binTree0.add(100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((-1));
        binTree0.add((int) (byte) -1);
        boolean boolean5 = binTree0.repOK();
        binTree0.add((int) (short) -1);
        int int8 = binTree0.getSize();
        boolean boolean9 = binTree0.repOK();
        int int10 = binTree0.getSize();
        binTree0.add((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((-1));
        binTree0.add((int) (byte) -1);
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        binTree0.add(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        boolean boolean4 = binTree0.repOK();
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        int int7 = binTree0.getSize();
        int int8 = binTree0.getSize();
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        boolean boolean3 = binTree0.repOK();
        binTree0.add((int) (byte) 1);
        boolean boolean6 = binTree0.repOK();
        binTree0.add((int) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        int int3 = binTree0.getSize();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        binTree0.add((int) (byte) 1);
        binTree0.add((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        binTree0.add((int) (byte) 1);
        int int5 = binTree0.getSize();
        boolean boolean6 = binTree0.repOK();
        binTree0.add(100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        int int3 = binTree0.getSize();
        boolean boolean4 = binTree0.repOK();
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        int int7 = binTree0.getSize();
        binTree0.add((int) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        binTree0.add((int) '4');
        boolean boolean7 = binTree0.repOK();
        binTree0.add(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        int int6 = binTree0.getSize();
        int int7 = binTree0.getSize();
        int int8 = binTree0.getSize();
        boolean boolean9 = binTree0.repOK();
        binTree0.add((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((-1));
        binTree0.add((int) (byte) -1);
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        boolean boolean7 = binTree0.repOK();
        boolean boolean8 = binTree0.repOK();
        binTree0.add((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        int int7 = binTree0.getSize();
        boolean boolean8 = binTree0.repOK();
        binTree0.add((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) (byte) 10);
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        boolean boolean7 = binTree0.repOK();
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        binTree0.add((int) (byte) 1);
        int int5 = binTree0.getSize();
        boolean boolean6 = binTree0.repOK();
        int int7 = binTree0.getSize();
        int int8 = binTree0.getSize();
        binTree0.add((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        int int3 = binTree0.getSize();
        boolean boolean4 = binTree0.repOK();
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        boolean boolean7 = binTree0.repOK();
        int int8 = binTree0.getSize();
        boolean boolean9 = binTree0.repOK();
        int int10 = binTree0.getSize();
        boolean boolean11 = binTree0.repOK();
        int int12 = binTree0.getSize();
        binTree0.add((int) '4');
        binTree0.add((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        int int7 = binTree0.getSize();
        boolean boolean8 = binTree0.repOK();
        int int9 = binTree0.getSize();
        binTree0.add((int) (byte) 1);
        int int12 = binTree0.getSize();
        int int13 = binTree0.getSize();
        binTree0.add(100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((-1));
        boolean boolean3 = binTree0.repOK();
        binTree0.add(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        boolean boolean5 = binTree0.repOK();
        int int6 = binTree0.getSize();
        boolean boolean7 = binTree0.repOK();
        binTree0.add((int) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        int int1 = binTree0.getSize();
        boolean boolean2 = binTree0.repOK();
        binTree0.add((int) 'a');
        binTree0.add((int) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        boolean boolean7 = binTree0.repOK();
        int int8 = binTree0.getSize();
        boolean boolean9 = binTree0.repOK();
        int int10 = binTree0.getSize();
        boolean boolean11 = binTree0.repOK();
        int int12 = binTree0.getSize();
        binTree0.add((int) '4');
        binTree0.add((int) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        int int1 = binTree0.getSize();
        boolean boolean2 = binTree0.repOK();
        binTree0.add(0);
        binTree0.add((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        int int6 = binTree0.getSize();
        boolean boolean7 = binTree0.repOK();
        boolean boolean8 = binTree0.repOK();
        binTree0.add((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((-1));
        binTree0.add((int) (byte) -1);
        boolean boolean5 = binTree0.repOK();
        binTree0.add((int) (short) -1);
        int int8 = binTree0.getSize();
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        binTree0.add((int) (byte) 1);
        int int5 = binTree0.getSize();
        boolean boolean6 = binTree0.repOK();
        int int7 = binTree0.getSize();
        int int8 = binTree0.getSize();
        boolean boolean9 = binTree0.repOK();
        binTree0.add((int) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        int int1 = binTree0.getSize();
        boolean boolean2 = binTree0.repOK();
        int int3 = binTree0.getSize();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        binTree0.add(0);
        int int8 = binTree0.getSize();
        boolean boolean9 = binTree0.repOK();
        boolean boolean10 = binTree0.repOK();
        binTree0.add((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        boolean boolean1 = binTree0.repOK();
        binTree0.add(0);
        binTree0.add((int) (byte) 0);
        boolean boolean6 = binTree0.repOK();
        int int7 = binTree0.getSize();
        binTree0.add((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        boolean boolean1 = binTree0.repOK();
        binTree0.add(0);
        binTree0.add((int) (byte) 0);
        boolean boolean6 = binTree0.repOK();
        binTree0.add((int) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        int int3 = binTree0.getSize();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        binTree0.add((int) (byte) 1);
        boolean boolean9 = binTree0.repOK();
        int int10 = binTree0.getSize();
        binTree0.add((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        binTree0.add((int) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        boolean boolean7 = binTree0.repOK();
        int int8 = binTree0.getSize();
        binTree0.add(10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) (byte) 10);
        boolean boolean3 = binTree0.repOK();
        binTree0.add((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        int int3 = binTree0.getSize();
        boolean boolean4 = binTree0.repOK();
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        boolean boolean7 = binTree0.repOK();
        int int8 = binTree0.getSize();
        boolean boolean9 = binTree0.repOK();
        boolean boolean10 = binTree0.repOK();
        boolean boolean11 = binTree0.repOK();
        int int12 = binTree0.getSize();
        binTree0.add((int) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((-1));
        binTree0.add((int) (byte) -1);
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        boolean boolean7 = binTree0.repOK();
        binTree0.add(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((-1));
        binTree0.add((int) (byte) -1);
        int int5 = binTree0.getSize();
        int int6 = binTree0.getSize();
        boolean boolean7 = binTree0.repOK();
        boolean boolean8 = binTree0.repOK();
        binTree0.add((int) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((-1));
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        int int5 = binTree0.getSize();
        binTree0.add((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) (byte) 10);
        binTree0.add(100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(1);
        int int3 = binTree0.getSize();
        boolean boolean4 = binTree0.repOK();
        boolean boolean5 = binTree0.repOK();
        boolean boolean6 = binTree0.repOK();
        binTree0.add((int) (byte) 1);
        binTree0.add(1);
        boolean boolean11 = binTree0.repOK();
        binTree0.add((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add((int) '4');
        boolean boolean3 = binTree0.repOK();
        int int4 = binTree0.getSize();
        binTree0.add((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        system.classfixer.classes.BinTree binTree0 = new system.classfixer.classes.BinTree();
        binTree0.add(100);
        int int3 = binTree0.getSize();
        int int4 = binTree0.getSize();
        boolean boolean5 = binTree0.repOK();
        binTree0.add((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for binTree0", binTree0.repOK_2());
    }
}

