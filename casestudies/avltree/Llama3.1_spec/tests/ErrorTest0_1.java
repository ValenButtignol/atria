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
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        avlTree0.insert((int) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        boolean boolean2 = avlTree0.composedRepOK();
        boolean boolean3 = avlTree0.composedRepOK();
        system.testclass.AvlTree.AvlNode avlNode4 = avlTree0.root;
        avlTree0.insert((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        boolean boolean2 = avlTree0.isEmpty();
        boolean boolean3 = avlTree0.composedRepOK();
        system.testclass.AvlTree.AvlNode avlNode6 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode8 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode6.right = avlNode8;
        int int10 = avlNode8.height;
        system.testclass.AvlTree.AvlNode avlNode11 = avlNode8.left;
        system.testclass.AvlTree.AvlNode avlNode13 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode13.height = 0;
        system.testclass.AvlTree.AvlNode avlNode16 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode8, avlNode13);
        avlTree0.root = avlNode16;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        avlTree0.remove((int) (byte) 1);
        avlTree0.remove((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode6 = new system.testclass.AvlTree.AvlNode();
        avlTree0.root = avlNode6;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        boolean boolean2 = avlTree0.composedRepOK();
        avlTree0.insert((int) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode3 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode3.right = avlNode5;
        int int7 = avlNode5.height;
        avlTree0.root = avlNode5;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode3 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = new system.testclass.AvlTree.AvlNode((int) (short) 10);
        system.testclass.AvlTree.AvlNode avlNode8 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode10 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode12 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode10.right = avlNode12;
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode(0, avlNode8, avlNode10);
        avlNode5.right = avlNode8;
        avlNode3.right = avlNode5;
        system.testclass.AvlTree.AvlNode avlNode18 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode20 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode18.right = avlNode20;
        system.testclass.AvlTree.AvlNode avlNode23 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode23.height = 0;
        avlNode20.right = avlNode23;
        system.testclass.AvlTree.AvlNode avlNode27 = new system.testclass.AvlTree.AvlNode(0, avlNode5, avlNode20);
        avlTree0.root = avlNode27;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        system.testclass.AvlTree.AvlNode avlNode2 = avlTree0.root;
        avlTree0.insert((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        boolean boolean2 = avlTree0.composedRepOK();
        boolean boolean3 = avlTree0.composedRepOK();
        system.testclass.AvlTree.AvlNode avlNode4 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode8 = new system.testclass.AvlTree.AvlNode((int) (short) 10);
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode13 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode13.right = avlNode15;
        system.testclass.AvlTree.AvlNode avlNode17 = new system.testclass.AvlTree.AvlNode(0, avlNode11, avlNode13);
        avlNode8.right = avlNode11;
        avlNode8.element = (byte) 10;
        system.testclass.AvlTree.AvlNode avlNode22 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode24 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode22.right = avlNode24;
        system.testclass.AvlTree.AvlNode avlNode27 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode24.left = avlNode27;
        int int29 = avlNode24.height;
        int int30 = avlNode24.height;
        system.testclass.AvlTree.AvlNode avlNode31 = new system.testclass.AvlTree.AvlNode((int) '4', avlNode8, avlNode24);
        system.testclass.AvlTree.AvlNode avlNode34 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode36 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode38 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode36.right = avlNode38;
        system.testclass.AvlTree.AvlNode avlNode40 = new system.testclass.AvlTree.AvlNode(0, avlNode34, avlNode36);
        system.testclass.AvlTree.AvlNode avlNode41 = new system.testclass.AvlTree.AvlNode(100, avlNode31, avlNode34);
        avlNode31.element = (short) 10;
        system.testclass.AvlTree.AvlNode avlNode45 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode47 = new system.testclass.AvlTree.AvlNode((int) (short) 10);
        system.testclass.AvlTree.AvlNode avlNode50 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode52 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode54 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode52.right = avlNode54;
        system.testclass.AvlTree.AvlNode avlNode56 = new system.testclass.AvlTree.AvlNode(0, avlNode50, avlNode52);
        avlNode47.right = avlNode50;
        avlNode45.right = avlNode47;
        avlNode47.height = (short) 0;
        avlNode31.right = avlNode47;
        avlTree0.root = avlNode47;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        avlTree0.remove((int) (byte) 1);
        boolean boolean4 = avlTree0.composedRepOK();
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        avlTree0.insert((int) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        boolean boolean2 = avlTree0.isEmpty();
        boolean boolean3 = avlTree0.composedRepOK();
        boolean boolean4 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode7 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode9 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode9.right = avlNode11;
        system.testclass.AvlTree.AvlNode avlNode13 = new system.testclass.AvlTree.AvlNode(0, avlNode7, avlNode9);
        avlTree0.root = avlNode13;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        avlTree0.remove((int) (byte) 1);
        avlTree0.remove((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode7 = new system.testclass.AvlTree.AvlNode((int) (byte) 1);
        avlTree0.root = avlNode7;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        boolean boolean2 = avlTree0.isEmpty();
        boolean boolean3 = avlTree0.composedRepOK();
        boolean boolean4 = avlTree0.isEmpty();
        avlTree0.remove((int) (short) 100);
        avlTree0.insert((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        avlTree0.remove((int) (byte) 1);
        boolean boolean4 = avlTree0.composedRepOK();
        boolean boolean5 = avlTree0.isEmpty();
        avlTree0.remove((int) '4');
        avlTree0.remove(52);
        avlTree0.insert((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        boolean boolean2 = avlTree0.composedRepOK();
        boolean boolean3 = avlTree0.composedRepOK();
        system.testclass.AvlTree.AvlNode avlNode4 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode6 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode8 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode6.right = avlNode8;
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode11.height = 0;
        avlNode8.right = avlNode11;
        avlNode11.height = (byte) 100;
        system.testclass.AvlTree.AvlNode avlNode17 = avlNode11.left;
        avlTree0.root = avlNode17;
        boolean boolean19 = avlTree0.composedRepOK();
        system.testclass.AvlTree.AvlNode avlNode21 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode25 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode27 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode25.right = avlNode27;
        int int29 = avlNode27.height;
        system.testclass.AvlTree.AvlNode avlNode30 = avlNode27.left;
        system.testclass.AvlTree.AvlNode avlNode32 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode32.height = 0;
        system.testclass.AvlTree.AvlNode avlNode35 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode27, avlNode32);
        system.testclass.AvlTree.AvlNode avlNode37 = new system.testclass.AvlTree.AvlNode((int) (short) 10);
        system.testclass.AvlTree.AvlNode avlNode38 = new system.testclass.AvlTree.AvlNode((int) '4', avlNode35, avlNode37);
        avlNode21.left = avlNode37;
        avlTree0.root = avlNode21;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        avlTree0.remove((int) (byte) 1);
        system.testclass.AvlTree.AvlNode avlNode6 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode8 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode6.right = avlNode8;
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode11.height = 0;
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode(0, avlNode6, avlNode11);
        avlTree0.root = avlNode14;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        boolean boolean2 = avlTree0.composedRepOK();
        system.testclass.AvlTree.AvlNode avlNode4 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode6 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode4.right = avlNode6;
        system.testclass.AvlTree.AvlNode avlNode9 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode9.height = 0;
        avlNode6.right = avlNode9;
        avlTree0.root = avlNode6;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        boolean boolean2 = avlTree0.isEmpty();
        avlTree0.remove(52);
        boolean boolean5 = avlTree0.property_3();
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.insert((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        avlTree0.insert((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        avlTree0.remove((int) (byte) 1);
        boolean boolean4 = avlTree0.composedRepOK();
        boolean boolean5 = avlTree0.isEmpty();
        avlTree0.remove((int) '4');
        avlTree0.remove(52);
        avlTree0.insert(97);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        avlTree0.remove((int) (byte) 1);
        boolean boolean4 = avlTree0.composedRepOK();
        boolean boolean5 = avlTree0.composedRepOK();
        avlTree0.insert(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        boolean boolean2 = avlTree0.composedRepOK();
        boolean boolean3 = avlTree0.composedRepOK();
        system.testclass.AvlTree.AvlNode avlNode4 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode6 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode8 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode6.right = avlNode8;
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode11.height = 0;
        avlNode8.right = avlNode11;
        avlNode11.height = (byte) 100;
        system.testclass.AvlTree.AvlNode avlNode17 = avlNode11.left;
        avlTree0.root = avlNode17;
        boolean boolean19 = avlTree0.composedRepOK();
        avlTree0.insert(100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        system.testclass.AvlTree.AvlNode avlNode2 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode4 = new system.testclass.AvlTree.AvlNode(0);
        avlTree0.root = avlNode4;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        avlTree0.remove((int) (byte) 1);
        boolean boolean4 = avlTree0.composedRepOK();
        boolean boolean5 = avlTree0.isEmpty();
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode10 = new system.testclass.AvlTree.AvlNode((int) (short) 10);
        system.testclass.AvlTree.AvlNode avlNode13 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode17 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode15.right = avlNode17;
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode(0, avlNode13, avlNode15);
        avlNode10.right = avlNode13;
        avlNode10.element = (byte) 10;
        system.testclass.AvlTree.AvlNode avlNode24 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode26 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode24.right = avlNode26;
        system.testclass.AvlTree.AvlNode avlNode29 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode26.left = avlNode29;
        int int31 = avlNode26.height;
        int int32 = avlNode26.height;
        system.testclass.AvlTree.AvlNode avlNode33 = new system.testclass.AvlTree.AvlNode((int) '4', avlNode10, avlNode26);
        system.testclass.AvlTree.AvlNode avlNode34 = avlNode10.left;
        system.testclass.AvlTree.AvlNode avlNode36 = new system.testclass.AvlTree.AvlNode((int) '4');
        int int37 = avlNode36.element;
        avlNode10.right = avlNode36;
        avlNode10.element = (byte) 0;
        avlTree0.root = avlNode10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        boolean boolean2 = avlTree0.isEmpty();
        avlTree0.remove(52);
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        avlTree0.insert((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        boolean boolean2 = avlTree0.isEmpty();
        boolean boolean3 = avlTree0.composedRepOK();
        avlTree0.remove((int) (byte) 10);
        avlTree0.insert((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        system.testclass.AvlTree.AvlNode avlNode4 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode6 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode4.right = avlNode6;
        int int8 = avlNode6.height;
        system.testclass.AvlTree.AvlNode avlNode9 = avlNode6.left;
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode11.height = 0;
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode6, avlNode11);
        int int15 = avlNode6.height;
        system.testclass.AvlTree.AvlNode avlNode18 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode20 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode18.right = avlNode20;
        int int22 = avlNode20.height;
        system.testclass.AvlTree.AvlNode avlNode23 = avlNode20.left;
        system.testclass.AvlTree.AvlNode avlNode25 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode25.height = 0;
        system.testclass.AvlTree.AvlNode avlNode28 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode20, avlNode25);
        avlNode6.left = avlNode20;
        int int30 = avlNode20.element;
        avlTree0.root = avlNode20;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        boolean boolean2 = avlTree0.isEmpty();
        avlTree0.remove(52);
        boolean boolean5 = avlTree0.property_3();
        system.testclass.AvlTree.AvlNode avlNode9 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode9.right = avlNode11;
        int int13 = avlNode11.height;
        system.testclass.AvlTree.AvlNode avlNode14 = avlNode11.left;
        system.testclass.AvlTree.AvlNode avlNode16 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode16.height = 0;
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode11, avlNode16);
        system.testclass.AvlTree.AvlNode avlNode22 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode24 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode22.right = avlNode24;
        system.testclass.AvlTree.AvlNode avlNode28 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode30 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode28.right = avlNode30;
        int int32 = avlNode30.height;
        system.testclass.AvlTree.AvlNode avlNode33 = avlNode30.left;
        system.testclass.AvlTree.AvlNode avlNode35 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode35.height = 0;
        system.testclass.AvlTree.AvlNode avlNode38 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode30, avlNode35);
        int int39 = avlNode30.height;
        system.testclass.AvlTree.AvlNode avlNode40 = new system.testclass.AvlTree.AvlNode(1, avlNode22, avlNode30);
        avlNode16.left = avlNode30;
        system.testclass.AvlTree.AvlNode avlNode44 = new system.testclass.AvlTree.AvlNode((int) (short) 10);
        system.testclass.AvlTree.AvlNode avlNode47 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode49 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode51 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode49.right = avlNode51;
        system.testclass.AvlTree.AvlNode avlNode53 = new system.testclass.AvlTree.AvlNode(0, avlNode47, avlNode49);
        avlNode44.right = avlNode47;
        avlNode44.element = (byte) 10;
        system.testclass.AvlTree.AvlNode avlNode58 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode60 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode58.right = avlNode60;
        system.testclass.AvlTree.AvlNode avlNode63 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode60.left = avlNode63;
        int int65 = avlNode60.height;
        int int66 = avlNode60.height;
        system.testclass.AvlTree.AvlNode avlNode67 = new system.testclass.AvlTree.AvlNode((int) '4', avlNode44, avlNode60);
        system.testclass.AvlTree.AvlNode avlNode68 = avlNode44.left;
        system.testclass.AvlTree.AvlNode avlNode69 = avlNode44.left;
        system.testclass.AvlTree.AvlNode avlNode70 = avlNode44.left;
        system.testclass.AvlTree.AvlNode avlNode71 = new system.testclass.AvlTree.AvlNode(52, avlNode30, avlNode70);
        avlTree0.root = avlNode30;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        boolean boolean2 = avlTree0.composedRepOK();
        boolean boolean3 = avlTree0.composedRepOK();
        system.testclass.AvlTree.AvlNode avlNode4 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode6 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode8 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode6.right = avlNode8;
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode11.height = 0;
        avlNode8.right = avlNode11;
        avlNode11.height = (byte) 100;
        system.testclass.AvlTree.AvlNode avlNode17 = avlNode11.left;
        avlTree0.root = avlNode17;
        boolean boolean19 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode21 = new system.testclass.AvlTree.AvlNode((int) (short) 1);
        avlTree0.root = avlNode21;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        avlTree0.remove((int) (byte) 1);
        boolean boolean4 = avlTree0.composedRepOK();
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        avlTree0.remove((-1));
        system.testclass.AvlTree.AvlNode avlNode8 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode13 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode11.right = avlNode13;
        system.testclass.AvlTree.AvlNode avlNode16 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode16.height = 0;
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode(0, avlNode11, avlNode16);
        avlTree0.root = avlNode16;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        system.testclass.AvlTree.AvlNode avlNode2 = avlTree0.root;
        boolean boolean3 = avlTree0.property_3();
        avlTree0.remove((int) ' ');
        avlTree0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        boolean boolean2 = avlTree0.composedRepOK();
        boolean boolean3 = avlTree0.composedRepOK();
        boolean boolean4 = avlTree0.isEmpty();
        avlTree0.insert((int) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        avlTree0.remove((int) (byte) 1);
        boolean boolean4 = avlTree0.composedRepOK();
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        avlTree0.remove((-1));
        avlTree0.remove((int) ' ');
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode((int) '4');
        int int12 = avlNode11.element;
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode16 = new system.testclass.AvlTree.AvlNode((int) (short) 10);
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode21 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode23 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode21.right = avlNode23;
        system.testclass.AvlTree.AvlNode avlNode25 = new system.testclass.AvlTree.AvlNode(0, avlNode19, avlNode21);
        avlNode16.right = avlNode19;
        avlNode14.right = avlNode16;
        avlNode11.right = avlNode14;
        avlNode14.element = (short) -1;
        avlTree0.root = avlNode14;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        boolean boolean2 = avlTree0.composedRepOK();
        boolean boolean3 = avlTree0.property_3();
        system.testclass.AvlTree.AvlNode avlNode7 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode9 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode7.right = avlNode9;
        int int11 = avlNode9.height;
        system.testclass.AvlTree.AvlNode avlNode12 = avlNode9.left;
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode14.height = 0;
        system.testclass.AvlTree.AvlNode avlNode17 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode9, avlNode14);
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode((int) (short) 10);
        system.testclass.AvlTree.AvlNode avlNode20 = new system.testclass.AvlTree.AvlNode((int) '4', avlNode17, avlNode19);
        avlTree0.root = avlNode17;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        boolean boolean2 = avlTree0.isEmpty();
        avlTree0.remove(52);
        boolean boolean5 = avlTree0.property_3();
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode10 = new system.testclass.AvlTree.AvlNode((int) (short) 10);
        system.testclass.AvlTree.AvlNode avlNode13 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode17 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode15.right = avlNode17;
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode(0, avlNode13, avlNode15);
        avlNode10.right = avlNode13;
        avlNode10.element = (byte) 10;
        system.testclass.AvlTree.AvlNode avlNode24 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode26 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode24.right = avlNode26;
        system.testclass.AvlTree.AvlNode avlNode29 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode26.left = avlNode29;
        int int31 = avlNode26.height;
        int int32 = avlNode26.height;
        system.testclass.AvlTree.AvlNode avlNode33 = new system.testclass.AvlTree.AvlNode((int) '4', avlNode10, avlNode26);
        system.testclass.AvlTree.AvlNode avlNode36 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode38 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode40 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode38.right = avlNode40;
        system.testclass.AvlTree.AvlNode avlNode42 = new system.testclass.AvlTree.AvlNode(0, avlNode36, avlNode38);
        system.testclass.AvlTree.AvlNode avlNode43 = new system.testclass.AvlTree.AvlNode(100, avlNode33, avlNode36);
        avlNode33.element = (short) 10;
        int int46 = avlNode33.height;
        avlTree0.root = avlNode33;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        avlTree0.remove((int) (byte) 1);
        boolean boolean4 = avlTree0.composedRepOK();
        boolean boolean5 = avlTree0.isEmpty();
        avlTree0.remove((int) '4');
        avlTree0.insert(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        boolean boolean2 = avlTree0.composedRepOK();
        boolean boolean3 = avlTree0.property_3();
        boolean boolean4 = avlTree0.property_3();
        avlTree0.insert((int) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        system.testclass.AvlTree.AvlNode avlNode2 = avlTree0.root;
        boolean boolean3 = avlTree0.property_3();
        avlTree0.remove((int) '4');
        avlTree0.remove((-1));
        avlTree0.remove((int) (byte) 100);
        boolean boolean10 = avlTree0.composedRepOK();
        system.testclass.AvlTree.AvlNode avlNode13 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode((int) (short) 10);
        system.testclass.AvlTree.AvlNode avlNode18 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode20 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode22 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode20.right = avlNode22;
        system.testclass.AvlTree.AvlNode avlNode24 = new system.testclass.AvlTree.AvlNode(0, avlNode18, avlNode20);
        avlNode15.right = avlNode18;
        avlNode13.right = avlNode15;
        system.testclass.AvlTree.AvlNode avlNode28 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode30 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode28.right = avlNode30;
        system.testclass.AvlTree.AvlNode avlNode33 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode33.height = 0;
        avlNode30.right = avlNode33;
        system.testclass.AvlTree.AvlNode avlNode37 = new system.testclass.AvlTree.AvlNode(0, avlNode15, avlNode30);
        system.testclass.AvlTree.AvlNode avlNode40 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode42 = new system.testclass.AvlTree.AvlNode((int) (short) 10);
        system.testclass.AvlTree.AvlNode avlNode45 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode47 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode49 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode47.right = avlNode49;
        system.testclass.AvlTree.AvlNode avlNode51 = new system.testclass.AvlTree.AvlNode(0, avlNode45, avlNode47);
        avlNode42.right = avlNode45;
        avlNode40.right = avlNode42;
        system.testclass.AvlTree.AvlNode avlNode55 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode57 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode55.right = avlNode57;
        system.testclass.AvlTree.AvlNode avlNode60 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode60.height = 0;
        avlNode57.right = avlNode60;
        system.testclass.AvlTree.AvlNode avlNode64 = new system.testclass.AvlTree.AvlNode(0, avlNode42, avlNode57);
        avlNode64.height = 10;
        int int67 = avlNode64.element;
        avlNode15.right = avlNode64;
        avlTree0.root = avlNode15;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        boolean boolean2 = avlTree0.isEmpty();
        avlTree0.remove(52);
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        avlTree0.insert(100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        boolean boolean2 = avlTree0.isEmpty();
        avlTree0.remove(52);
        avlTree0.remove(0);
        avlTree0.insert((int) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        boolean boolean2 = avlTree0.isEmpty();
        boolean boolean3 = avlTree0.composedRepOK();
        boolean boolean4 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode8 = new system.testclass.AvlTree.AvlNode((int) (short) 10);
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode13 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode13.right = avlNode15;
        system.testclass.AvlTree.AvlNode avlNode17 = new system.testclass.AvlTree.AvlNode(0, avlNode11, avlNode13);
        avlNode8.right = avlNode11;
        system.testclass.AvlTree.AvlNode avlNode21 = new system.testclass.AvlTree.AvlNode((int) (short) 10);
        system.testclass.AvlTree.AvlNode avlNode24 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode26 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode28 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode26.right = avlNode28;
        system.testclass.AvlTree.AvlNode avlNode30 = new system.testclass.AvlTree.AvlNode(0, avlNode24, avlNode26);
        avlNode21.right = avlNode24;
        avlNode21.element = (byte) 10;
        system.testclass.AvlTree.AvlNode avlNode35 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode37 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode35.right = avlNode37;
        system.testclass.AvlTree.AvlNode avlNode40 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode37.left = avlNode40;
        int int42 = avlNode37.height;
        int int43 = avlNode37.height;
        system.testclass.AvlTree.AvlNode avlNode44 = new system.testclass.AvlTree.AvlNode((int) '4', avlNode21, avlNode37);
        system.testclass.AvlTree.AvlNode avlNode45 = avlNode21.left;
        system.testclass.AvlTree.AvlNode avlNode47 = new system.testclass.AvlTree.AvlNode((int) '4');
        int int48 = avlNode47.element;
        avlNode21.right = avlNode47;
        system.testclass.AvlTree.AvlNode avlNode50 = new system.testclass.AvlTree.AvlNode((-1), avlNode8, avlNode47);
        system.testclass.AvlTree.AvlNode avlNode52 = new system.testclass.AvlTree.AvlNode((int) (short) 10);
        system.testclass.AvlTree.AvlNode avlNode55 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode57 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode59 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode57.right = avlNode59;
        system.testclass.AvlTree.AvlNode avlNode61 = new system.testclass.AvlTree.AvlNode(0, avlNode55, avlNode57);
        avlNode52.right = avlNode55;
        int int63 = avlNode52.element;
        system.testclass.AvlTree.AvlNode avlNode64 = new system.testclass.AvlTree.AvlNode(0, avlNode47, avlNode52);
        avlTree0.root = avlNode64;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        avlTree0.remove((int) (byte) 1);
        boolean boolean4 = avlTree0.composedRepOK();
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        avlTree0.remove((-1));
        system.testclass.AvlTree.AvlNode avlNode9 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode9.right = avlNode11;
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode14.height = 0;
        avlNode11.right = avlNode14;
        avlNode14.height = (byte) 100;
        system.testclass.AvlTree.AvlNode avlNode20 = avlNode14.left;
        avlTree0.root = avlNode14;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        boolean boolean2 = avlTree0.composedRepOK();
        boolean boolean3 = avlTree0.isEmpty();
        boolean boolean4 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode7 = new system.testclass.AvlTree.AvlNode((int) (short) 10);
        system.testclass.AvlTree.AvlNode avlNode10 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode12 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode12.right = avlNode14;
        system.testclass.AvlTree.AvlNode avlNode16 = new system.testclass.AvlTree.AvlNode(0, avlNode10, avlNode12);
        avlNode7.right = avlNode10;
        system.testclass.AvlTree.AvlNode avlNode20 = new system.testclass.AvlTree.AvlNode((int) (short) 10);
        system.testclass.AvlTree.AvlNode avlNode23 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode25 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode27 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode25.right = avlNode27;
        system.testclass.AvlTree.AvlNode avlNode29 = new system.testclass.AvlTree.AvlNode(0, avlNode23, avlNode25);
        avlNode20.right = avlNode23;
        avlNode20.element = (byte) 10;
        system.testclass.AvlTree.AvlNode avlNode34 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode36 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode34.right = avlNode36;
        system.testclass.AvlTree.AvlNode avlNode39 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode36.left = avlNode39;
        int int41 = avlNode36.height;
        int int42 = avlNode36.height;
        system.testclass.AvlTree.AvlNode avlNode43 = new system.testclass.AvlTree.AvlNode((int) '4', avlNode20, avlNode36);
        system.testclass.AvlTree.AvlNode avlNode44 = avlNode20.left;
        system.testclass.AvlTree.AvlNode avlNode46 = new system.testclass.AvlTree.AvlNode((int) '4');
        int int47 = avlNode46.element;
        avlNode20.right = avlNode46;
        system.testclass.AvlTree.AvlNode avlNode49 = new system.testclass.AvlTree.AvlNode((-1), avlNode7, avlNode46);
        system.testclass.AvlTree.AvlNode avlNode50 = avlNode49.right;
        avlTree0.root = avlNode49;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        avlTree0.remove((int) (byte) 1);
        boolean boolean4 = avlTree0.composedRepOK();
        boolean boolean5 = avlTree0.property_3();
        avlTree0.insert((int) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        boolean boolean2 = avlTree0.isEmpty();
        avlTree0.remove(52);
        boolean boolean5 = avlTree0.property_3();
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode8 = new system.testclass.AvlTree.AvlNode((int) (byte) -1);
        avlTree0.root = avlNode8;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        boolean boolean2 = avlTree0.composedRepOK();
        boolean boolean3 = avlTree0.property_3();
        boolean boolean4 = avlTree0.property_3();
        boolean boolean5 = avlTree0.composedRepOK();
        boolean boolean6 = avlTree0.composedRepOK();
        system.testclass.AvlTree.AvlNode avlNode7 = avlTree0.root;
        avlTree0.insert((int) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        avlTree0.remove((int) (byte) 1);
        boolean boolean4 = avlTree0.composedRepOK();
        boolean boolean5 = avlTree0.composedRepOK();
        avlTree0.insert((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        system.testclass.AvlTree.AvlNode avlNode2 = avlTree0.root;
        avlTree0.remove((int) '#');
        system.testclass.AvlTree.AvlNode avlNode6 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode6.element = (byte) -1;
        avlTree0.root = avlNode6;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        avlTree0.remove((int) (byte) 1);
        boolean boolean4 = avlTree0.composedRepOK();
        boolean boolean5 = avlTree0.isEmpty();
        avlTree0.remove((int) '4');
        avlTree0.remove(52);
        system.testclass.AvlTree.AvlNode avlNode10 = avlTree0.root;
        boolean boolean11 = avlTree0.isEmpty();
        boolean boolean12 = avlTree0.isEmpty();
        avlTree0.insert(32);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        boolean boolean2 = avlTree0.isEmpty();
        boolean boolean3 = avlTree0.composedRepOK();
        boolean boolean4 = avlTree0.isEmpty();
        avlTree0.remove((int) (short) 100);
        system.testclass.AvlTree.AvlNode avlNode10 = new system.testclass.AvlTree.AvlNode((int) (short) 10);
        system.testclass.AvlTree.AvlNode avlNode13 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode17 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode15.right = avlNode17;
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode(0, avlNode13, avlNode15);
        avlNode10.right = avlNode13;
        avlNode10.element = (byte) 10;
        system.testclass.AvlTree.AvlNode avlNode24 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode26 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode24.right = avlNode26;
        system.testclass.AvlTree.AvlNode avlNode29 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode26.left = avlNode29;
        int int31 = avlNode26.height;
        int int32 = avlNode26.height;
        system.testclass.AvlTree.AvlNode avlNode33 = new system.testclass.AvlTree.AvlNode((int) '4', avlNode10, avlNode26);
        system.testclass.AvlTree.AvlNode avlNode36 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode38 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode40 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode38.right = avlNode40;
        system.testclass.AvlTree.AvlNode avlNode42 = new system.testclass.AvlTree.AvlNode(0, avlNode36, avlNode38);
        system.testclass.AvlTree.AvlNode avlNode43 = new system.testclass.AvlTree.AvlNode(100, avlNode33, avlNode36);
        avlTree0.root = avlNode36;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        boolean boolean2 = avlTree0.property_3();
        boolean boolean3 = avlTree0.composedRepOK();
        system.testclass.AvlTree.AvlNode avlNode6 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode8 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode6.right = avlNode8;
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode11.height = 0;
        avlNode8.right = avlNode11;
        system.testclass.AvlTree.AvlNode avlNode16 = new system.testclass.AvlTree.AvlNode((int) (short) 0);
        system.testclass.AvlTree.AvlNode avlNode17 = new system.testclass.AvlTree.AvlNode((int) (short) 0, avlNode8, avlNode16);
        avlTree0.root = avlNode17;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        boolean boolean2 = avlTree0.composedRepOK();
        boolean boolean3 = avlTree0.composedRepOK();
        system.testclass.AvlTree.AvlNode avlNode4 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode6 = new system.testclass.AvlTree.AvlNode(52);
        system.testclass.AvlTree.AvlNode avlNode7 = avlNode6.right;
        avlTree0.root = avlNode7;
        avlTree0.insert((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        boolean boolean2 = avlTree0.isEmpty();
        avlTree0.remove(52);
        boolean boolean5 = avlTree0.property_3();
        boolean boolean6 = avlTree0.isEmpty();
        avlTree0.insert((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        boolean boolean2 = avlTree0.isEmpty();
        avlTree0.remove(52);
        boolean boolean5 = avlTree0.composedRepOK();
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode9 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode((int) (short) 10);
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode16 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode18 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode16.right = avlNode18;
        system.testclass.AvlTree.AvlNode avlNode20 = new system.testclass.AvlTree.AvlNode(0, avlNode14, avlNode16);
        avlNode11.right = avlNode14;
        avlNode9.right = avlNode11;
        system.testclass.AvlTree.AvlNode avlNode24 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode26 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode24.right = avlNode26;
        system.testclass.AvlTree.AvlNode avlNode29 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode29.height = 0;
        avlNode26.right = avlNode29;
        system.testclass.AvlTree.AvlNode avlNode33 = new system.testclass.AvlTree.AvlNode(0, avlNode11, avlNode26);
        int int34 = avlNode33.height;
        avlTree0.root = avlNode33;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        boolean boolean2 = avlTree0.property_3();
        avlTree0.remove((int) (byte) 0);
        boolean boolean5 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode7 = new system.testclass.AvlTree.AvlNode((int) '4');
        int int8 = avlNode7.element;
        system.testclass.AvlTree.AvlNode avlNode10 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode12 = new system.testclass.AvlTree.AvlNode((int) (short) 10);
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode17 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode17.right = avlNode19;
        system.testclass.AvlTree.AvlNode avlNode21 = new system.testclass.AvlTree.AvlNode(0, avlNode15, avlNode17);
        avlNode12.right = avlNode15;
        avlNode10.right = avlNode12;
        avlNode7.right = avlNode10;
        avlNode7.height = (byte) -1;
        avlTree0.root = avlNode7;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        boolean boolean2 = avlTree0.composedRepOK();
        boolean boolean3 = avlTree0.composedRepOK();
        system.testclass.AvlTree.AvlNode avlNode4 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode6 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode8 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode6.right = avlNode8;
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode11.height = 0;
        avlNode8.right = avlNode11;
        avlNode11.height = (byte) 100;
        system.testclass.AvlTree.AvlNode avlNode17 = avlNode11.left;
        avlTree0.root = avlNode17;
        boolean boolean19 = avlTree0.composedRepOK();
        boolean boolean20 = avlTree0.property_3();
        avlTree0.remove(0);
        avlTree0.insert((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        boolean boolean2 = avlTree0.isEmpty();
        boolean boolean3 = avlTree0.composedRepOK();
        boolean boolean4 = avlTree0.isEmpty();
        avlTree0.remove((int) (short) 100);
        system.testclass.AvlTree.AvlNode avlNode10 = new system.testclass.AvlTree.AvlNode((int) (short) 10);
        system.testclass.AvlTree.AvlNode avlNode13 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode17 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode15.right = avlNode17;
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode(0, avlNode13, avlNode15);
        avlNode10.right = avlNode13;
        system.testclass.AvlTree.AvlNode avlNode23 = new system.testclass.AvlTree.AvlNode((int) (short) 10);
        system.testclass.AvlTree.AvlNode avlNode26 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode28 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode30 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode28.right = avlNode30;
        system.testclass.AvlTree.AvlNode avlNode32 = new system.testclass.AvlTree.AvlNode(0, avlNode26, avlNode28);
        avlNode23.right = avlNode26;
        avlNode23.element = (byte) 10;
        system.testclass.AvlTree.AvlNode avlNode37 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode39 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode37.right = avlNode39;
        system.testclass.AvlTree.AvlNode avlNode42 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode39.left = avlNode42;
        int int44 = avlNode39.height;
        int int45 = avlNode39.height;
        system.testclass.AvlTree.AvlNode avlNode46 = new system.testclass.AvlTree.AvlNode((int) '4', avlNode23, avlNode39);
        system.testclass.AvlTree.AvlNode avlNode47 = avlNode23.left;
        system.testclass.AvlTree.AvlNode avlNode49 = new system.testclass.AvlTree.AvlNode((int) '4');
        int int50 = avlNode49.element;
        avlNode23.right = avlNode49;
        system.testclass.AvlTree.AvlNode avlNode52 = new system.testclass.AvlTree.AvlNode((-1), avlNode10, avlNode49);
        system.testclass.AvlTree.AvlNode avlNode54 = new system.testclass.AvlTree.AvlNode((int) (short) 10);
        system.testclass.AvlTree.AvlNode avlNode57 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode59 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode61 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode59.right = avlNode61;
        system.testclass.AvlTree.AvlNode avlNode63 = new system.testclass.AvlTree.AvlNode(0, avlNode57, avlNode59);
        avlNode54.right = avlNode57;
        int int65 = avlNode54.element;
        system.testclass.AvlTree.AvlNode avlNode66 = new system.testclass.AvlTree.AvlNode(0, avlNode49, avlNode54);
        int int67 = avlNode54.height;
        system.testclass.AvlTree.AvlNode avlNode68 = avlNode54.left;
        system.testclass.AvlTree.AvlNode avlNode71 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode73 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode71.right = avlNode73;
        system.testclass.AvlTree.AvlNode avlNode76 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode76.height = 0;
        avlNode73.right = avlNode76;
        system.testclass.AvlTree.AvlNode avlNode81 = new system.testclass.AvlTree.AvlNode((int) (short) 0);
        system.testclass.AvlTree.AvlNode avlNode82 = new system.testclass.AvlTree.AvlNode((int) (short) 0, avlNode73, avlNode81);
        int int83 = avlNode81.height;
        avlNode54.left = avlNode81;
        avlTree0.root = avlNode81;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        boolean boolean2 = avlTree0.composedRepOK();
        boolean boolean3 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode8 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode10 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode8.right = avlNode10;
        int int12 = avlNode10.height;
        system.testclass.AvlTree.AvlNode avlNode13 = avlNode10.left;
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode15.height = 0;
        system.testclass.AvlTree.AvlNode avlNode18 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode10, avlNode15);
        system.testclass.AvlTree.AvlNode avlNode20 = new system.testclass.AvlTree.AvlNode((int) (short) 10);
        system.testclass.AvlTree.AvlNode avlNode21 = new system.testclass.AvlTree.AvlNode((int) '4', avlNode18, avlNode20);
        system.testclass.AvlTree.AvlNode avlNode24 = new system.testclass.AvlTree.AvlNode((int) (short) 10);
        system.testclass.AvlTree.AvlNode avlNode27 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode29 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode31 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode29.right = avlNode31;
        system.testclass.AvlTree.AvlNode avlNode33 = new system.testclass.AvlTree.AvlNode(0, avlNode27, avlNode29);
        avlNode24.right = avlNode27;
        avlNode24.element = (byte) 10;
        system.testclass.AvlTree.AvlNode avlNode38 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode40 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode38.right = avlNode40;
        system.testclass.AvlTree.AvlNode avlNode43 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode40.left = avlNode43;
        int int45 = avlNode40.height;
        int int46 = avlNode40.height;
        system.testclass.AvlTree.AvlNode avlNode47 = new system.testclass.AvlTree.AvlNode((int) '4', avlNode24, avlNode40);
        avlNode21.right = avlNode47;
        system.testclass.AvlTree.AvlNode avlNode50 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode52 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode50.right = avlNode52;
        avlNode21.right = avlNode50;
        system.testclass.AvlTree.AvlNode avlNode56 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode58 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode56.right = avlNode58;
        system.testclass.AvlTree.AvlNode avlNode61 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode61.height = 0;
        avlNode58.right = avlNode61;
        avlNode61.height = (byte) 100;
        system.testclass.AvlTree.AvlNode avlNode67 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode21, avlNode61);
        avlTree0.root = avlNode21;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        boolean boolean2 = avlTree0.property_3();
        avlTree0.remove((int) (byte) 0);
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        avlTree0.insert((int) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        boolean boolean2 = avlTree0.isEmpty();
        boolean boolean3 = avlTree0.composedRepOK();
        boolean boolean4 = avlTree0.isEmpty();
        avlTree0.remove((int) (short) 100);
        boolean boolean7 = avlTree0.property_3();
        avlTree0.remove(1);
        avlTree0.remove((int) (byte) 1);
        avlTree0.insert(100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        system.testclass.AvlTree.AvlNode avlNode2 = avlTree0.root;
        avlTree0.remove((int) '#');
        avlTree0.remove((int) 'a');
        avlTree0.insert((int) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        avlTree0.remove((int) (byte) 1);
        avlTree0.remove((int) (byte) -1);
        boolean boolean6 = avlTree0.isEmpty();
        avlTree0.remove((int) (byte) 1);
        avlTree0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        avlTree0.remove((int) (byte) 1);
        boolean boolean4 = avlTree0.composedRepOK();
        boolean boolean5 = avlTree0.isEmpty();
        avlTree0.remove((int) '4');
        avlTree0.remove((int) (short) 1);
        boolean boolean10 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode13 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode13.right = avlNode15;
        system.testclass.AvlTree.AvlNode avlNode18 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode18.height = 0;
        avlNode15.right = avlNode18;
        system.testclass.AvlTree.AvlNode avlNode23 = new system.testclass.AvlTree.AvlNode((int) (short) 0);
        system.testclass.AvlTree.AvlNode avlNode24 = new system.testclass.AvlTree.AvlNode((int) (short) 0, avlNode15, avlNode23);
        system.testclass.AvlTree.AvlNode avlNode27 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode29 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode31 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode29.right = avlNode31;
        system.testclass.AvlTree.AvlNode avlNode33 = new system.testclass.AvlTree.AvlNode(0, avlNode27, avlNode29);
        system.testclass.AvlTree.AvlNode avlNode37 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode39 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode37.right = avlNode39;
        int int41 = avlNode39.height;
        system.testclass.AvlTree.AvlNode avlNode42 = avlNode39.left;
        system.testclass.AvlTree.AvlNode avlNode44 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode44.height = 0;
        system.testclass.AvlTree.AvlNode avlNode47 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode39, avlNode44);
        system.testclass.AvlTree.AvlNode avlNode49 = new system.testclass.AvlTree.AvlNode((int) (short) 10);
        system.testclass.AvlTree.AvlNode avlNode50 = new system.testclass.AvlTree.AvlNode((int) '4', avlNode47, avlNode49);
        avlNode33.right = avlNode50;
        avlNode24.left = avlNode33;
        avlTree0.root = avlNode33;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        boolean boolean2 = avlTree0.property_3();
        avlTree0.remove(100);
        boolean boolean5 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode7 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode9 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode7.right = avlNode9;
        system.testclass.AvlTree.AvlNode avlNode12 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode12.height = 0;
        avlNode9.right = avlNode12;
        system.testclass.AvlTree.AvlNode avlNode16 = avlNode9.right;
        avlTree0.root = avlNode16;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        avlTree0.insert((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        boolean boolean2 = avlTree0.isEmpty();
        avlTree0.remove(52);
        boolean boolean5 = avlTree0.composedRepOK();
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode8 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode10 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode8.right = avlNode10;
        system.testclass.AvlTree.AvlNode avlNode13 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode13.height = 0;
        avlNode10.right = avlNode13;
        system.testclass.AvlTree.AvlNode avlNode17 = avlNode10.right;
        avlNode10.height = ' ';
        system.testclass.AvlTree.AvlNode avlNode20 = avlNode10.left;
        avlTree0.root = avlNode10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        avlTree0.remove((int) (byte) 1);
        avlTree0.remove((int) (byte) -1);
        boolean boolean6 = avlTree0.isEmpty();
        avlTree0.insert((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        avlTree0.remove((int) (byte) 1);
        boolean boolean4 = avlTree0.composedRepOK();
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        boolean boolean6 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode9 = new system.testclass.AvlTree.AvlNode((int) (byte) 0);
        avlNode9.height = 100;
        system.testclass.AvlTree.AvlNode avlNode13 = new system.testclass.AvlTree.AvlNode(52);
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode(52, avlNode9, avlNode13);
        system.testclass.AvlTree.AvlNode avlNode15 = avlNode9.left;
        avlTree0.root = avlNode9;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        boolean boolean2 = avlTree0.isEmpty();
        boolean boolean3 = avlTree0.composedRepOK();
        boolean boolean4 = avlTree0.isEmpty();
        avlTree0.remove((int) (short) 100);
        boolean boolean7 = avlTree0.property_3();
        boolean boolean8 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode12 = new system.testclass.AvlTree.AvlNode((int) (short) 10);
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode17 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode17.right = avlNode19;
        system.testclass.AvlTree.AvlNode avlNode21 = new system.testclass.AvlTree.AvlNode(0, avlNode15, avlNode17);
        avlNode12.right = avlNode15;
        system.testclass.AvlTree.AvlNode avlNode25 = new system.testclass.AvlTree.AvlNode((int) (short) 10);
        system.testclass.AvlTree.AvlNode avlNode28 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode30 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode32 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode30.right = avlNode32;
        system.testclass.AvlTree.AvlNode avlNode34 = new system.testclass.AvlTree.AvlNode(0, avlNode28, avlNode30);
        avlNode25.right = avlNode28;
        avlNode25.element = (byte) 10;
        system.testclass.AvlTree.AvlNode avlNode39 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode41 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode39.right = avlNode41;
        system.testclass.AvlTree.AvlNode avlNode44 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode41.left = avlNode44;
        int int46 = avlNode41.height;
        int int47 = avlNode41.height;
        system.testclass.AvlTree.AvlNode avlNode48 = new system.testclass.AvlTree.AvlNode((int) '4', avlNode25, avlNode41);
        system.testclass.AvlTree.AvlNode avlNode49 = avlNode25.left;
        system.testclass.AvlTree.AvlNode avlNode51 = new system.testclass.AvlTree.AvlNode((int) '4');
        int int52 = avlNode51.element;
        avlNode25.right = avlNode51;
        system.testclass.AvlTree.AvlNode avlNode54 = new system.testclass.AvlTree.AvlNode((-1), avlNode12, avlNode51);
        system.testclass.AvlTree.AvlNode avlNode56 = new system.testclass.AvlTree.AvlNode((int) (short) 10);
        system.testclass.AvlTree.AvlNode avlNode59 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode61 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode63 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode61.right = avlNode63;
        system.testclass.AvlTree.AvlNode avlNode65 = new system.testclass.AvlTree.AvlNode(0, avlNode59, avlNode61);
        avlNode56.right = avlNode59;
        int int67 = avlNode56.element;
        system.testclass.AvlTree.AvlNode avlNode68 = new system.testclass.AvlTree.AvlNode(0, avlNode51, avlNode56);
        int int69 = avlNode56.height;
        system.testclass.AvlTree.AvlNode avlNode71 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode73 = new system.testclass.AvlTree.AvlNode((int) (short) 10);
        system.testclass.AvlTree.AvlNode avlNode76 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode78 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode80 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode78.right = avlNode80;
        system.testclass.AvlTree.AvlNode avlNode82 = new system.testclass.AvlTree.AvlNode(0, avlNode76, avlNode78);
        avlNode73.right = avlNode76;
        avlNode71.right = avlNode73;
        system.testclass.AvlTree.AvlNode avlNode85 = avlNode71.right;
        system.testclass.AvlTree.AvlNode avlNode87 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode89 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode87.right = avlNode89;
        system.testclass.AvlTree.AvlNode avlNode92 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode89.left = avlNode92;
        int int94 = avlNode89.height;
        int int95 = avlNode89.height;
        avlNode71.right = avlNode89;
        avlNode56.left = avlNode89;
        avlTree0.root = avlNode56;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        boolean boolean2 = avlTree0.isEmpty();
        boolean boolean3 = avlTree0.composedRepOK();
        boolean boolean4 = avlTree0.isEmpty();
        avlTree0.remove((int) (short) 100);
        boolean boolean7 = avlTree0.property_3();
        avlTree0.remove(1);
        avlTree0.remove((int) (byte) 1);
        system.testclass.AvlTree.AvlNode avlNode13 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode((int) (short) 10);
        system.testclass.AvlTree.AvlNode avlNode18 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode20 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode22 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode20.right = avlNode22;
        system.testclass.AvlTree.AvlNode avlNode24 = new system.testclass.AvlTree.AvlNode(0, avlNode18, avlNode20);
        avlNode15.right = avlNode18;
        avlNode13.right = avlNode15;
        avlTree0.root = avlNode13;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        avlTree0.remove((int) (byte) 1);
        boolean boolean4 = avlTree0.composedRepOK();
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode7 = new system.testclass.AvlTree.AvlNode((int) (short) 10);
        system.testclass.AvlTree.AvlNode avlNode10 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode12 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode12.right = avlNode14;
        system.testclass.AvlTree.AvlNode avlNode16 = new system.testclass.AvlTree.AvlNode(0, avlNode10, avlNode12);
        avlNode7.right = avlNode10;
        avlNode7.height = 'a';
        avlNode7.element = (short) -1;
        avlTree0.root = avlNode7;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        boolean boolean2 = avlTree0.property_3();
        boolean boolean3 = avlTree0.composedRepOK();
        avlTree0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        avlTree0.remove((int) (byte) 1);
        avlTree0.remove((int) (byte) -1);
        boolean boolean6 = avlTree0.isEmpty();
        avlTree0.remove((int) (short) 1);
        system.testclass.AvlTree.AvlNode avlNode12 = new system.testclass.AvlTree.AvlNode((int) (short) 10);
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode17 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode17.right = avlNode19;
        system.testclass.AvlTree.AvlNode avlNode21 = new system.testclass.AvlTree.AvlNode(0, avlNode15, avlNode17);
        avlNode12.right = avlNode15;
        avlNode12.element = (byte) 10;
        system.testclass.AvlTree.AvlNode avlNode26 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode28 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode26.right = avlNode28;
        system.testclass.AvlTree.AvlNode avlNode31 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode28.left = avlNode31;
        int int33 = avlNode28.height;
        int int34 = avlNode28.height;
        system.testclass.AvlTree.AvlNode avlNode35 = new system.testclass.AvlTree.AvlNode((int) '4', avlNode12, avlNode28);
        system.testclass.AvlTree.AvlNode avlNode38 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode40 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode42 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode40.right = avlNode42;
        system.testclass.AvlTree.AvlNode avlNode44 = new system.testclass.AvlTree.AvlNode(0, avlNode38, avlNode40);
        system.testclass.AvlTree.AvlNode avlNode45 = new system.testclass.AvlTree.AvlNode(100, avlNode35, avlNode38);
        avlNode35.element = (short) 10;
        int int48 = avlNode35.element;
        int int49 = avlNode35.element;
        avlTree0.root = avlNode35;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        system.testclass.AvlTree.AvlNode avlNode2 = avlTree0.root;
        avlTree0.remove((int) '#');
        avlTree0.remove((int) 'a');
        avlTree0.insert(100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        boolean boolean2 = avlTree0.composedRepOK();
        boolean boolean3 = avlTree0.composedRepOK();
        system.testclass.AvlTree.AvlNode avlNode4 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode6 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode8 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode6.right = avlNode8;
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode11.height = 0;
        avlNode8.right = avlNode11;
        avlNode11.height = (byte) 100;
        system.testclass.AvlTree.AvlNode avlNode17 = avlNode11.left;
        avlTree0.root = avlNode17;
        boolean boolean19 = avlTree0.isEmpty();
        boolean boolean20 = avlTree0.isEmpty();
        avlTree0.insert((int) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        boolean boolean2 = avlTree0.isEmpty();
        avlTree0.remove(52);
        boolean boolean5 = avlTree0.composedRepOK();
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        boolean boolean7 = avlTree0.composedRepOK();
        avlTree0.remove(0);
        system.testclass.AvlTree.AvlNode avlNode13 = new system.testclass.AvlTree.AvlNode((int) (short) 10);
        system.testclass.AvlTree.AvlNode avlNode16 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode18 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode20 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode18.right = avlNode20;
        system.testclass.AvlTree.AvlNode avlNode22 = new system.testclass.AvlTree.AvlNode(0, avlNode16, avlNode18);
        avlNode13.right = avlNode16;
        avlNode13.element = (byte) 10;
        system.testclass.AvlTree.AvlNode avlNode27 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode29 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode27.right = avlNode29;
        system.testclass.AvlTree.AvlNode avlNode32 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode29.left = avlNode32;
        int int34 = avlNode29.height;
        int int35 = avlNode29.height;
        system.testclass.AvlTree.AvlNode avlNode36 = new system.testclass.AvlTree.AvlNode((int) '4', avlNode13, avlNode29);
        avlNode29.element = 0;
        system.testclass.AvlTree.AvlNode avlNode41 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode43 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode41.right = avlNode43;
        system.testclass.AvlTree.AvlNode avlNode47 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode49 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode47.right = avlNode49;
        int int51 = avlNode49.height;
        system.testclass.AvlTree.AvlNode avlNode52 = avlNode49.left;
        system.testclass.AvlTree.AvlNode avlNode54 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode54.height = 0;
        system.testclass.AvlTree.AvlNode avlNode57 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode49, avlNode54);
        int int58 = avlNode49.height;
        system.testclass.AvlTree.AvlNode avlNode59 = new system.testclass.AvlTree.AvlNode(1, avlNode41, avlNode49);
        avlNode59.height = 'a';
        system.testclass.AvlTree.AvlNode avlNode62 = new system.testclass.AvlTree.AvlNode(32, avlNode29, avlNode59);
        avlTree0.root = avlNode62;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        system.testclass.AvlTree.AvlNode avlNode2 = avlTree0.root;
        boolean boolean3 = avlTree0.property_3();
        avlTree0.remove((int) '4');
        avlTree0.remove((-1));
        avlTree0.remove((int) (byte) 100);
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode13 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode11.right = avlNode13;
        system.testclass.AvlTree.AvlNode avlNode16 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode13.left = avlNode16;
        int int18 = avlNode13.height;
        int int19 = avlNode13.height;
        avlTree0.root = avlNode13;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        boolean boolean2 = avlTree0.isEmpty();
        boolean boolean3 = avlTree0.composedRepOK();
        boolean boolean4 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode6 = new system.testclass.AvlTree.AvlNode((int) (short) 100);
        int int7 = avlNode6.height;
        avlTree0.root = avlNode6;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        avlTree0.remove((int) (byte) 1);
        boolean boolean4 = avlTree0.composedRepOK();
        boolean boolean5 = avlTree0.isEmpty();
        avlTree0.remove((int) '4');
        avlTree0.remove((int) (short) 1);
        system.testclass.AvlTree.AvlNode avlNode10 = avlTree0.root;
        avlTree0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        avlTree0.remove((int) (byte) 1);
        boolean boolean4 = avlTree0.composedRepOK();
        boolean boolean5 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode7 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode8 = avlNode7.right;
        avlTree0.root = avlNode7;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        boolean boolean2 = avlTree0.isEmpty();
        avlTree0.remove(52);
        boolean boolean5 = avlTree0.composedRepOK();
        system.testclass.AvlTree.AvlNode avlNode9 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode9.right = avlNode11;
        int int13 = avlNode11.height;
        system.testclass.AvlTree.AvlNode avlNode14 = avlNode11.left;
        system.testclass.AvlTree.AvlNode avlNode16 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode16.height = 0;
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode11, avlNode16);
        system.testclass.AvlTree.AvlNode avlNode21 = new system.testclass.AvlTree.AvlNode((int) (short) 10);
        system.testclass.AvlTree.AvlNode avlNode22 = new system.testclass.AvlTree.AvlNode((int) '4', avlNode19, avlNode21);
        system.testclass.AvlTree.AvlNode avlNode25 = new system.testclass.AvlTree.AvlNode((int) (short) 10);
        system.testclass.AvlTree.AvlNode avlNode28 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode30 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode32 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode30.right = avlNode32;
        system.testclass.AvlTree.AvlNode avlNode34 = new system.testclass.AvlTree.AvlNode(0, avlNode28, avlNode30);
        avlNode25.right = avlNode28;
        avlNode25.element = (byte) 10;
        system.testclass.AvlTree.AvlNode avlNode39 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode41 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode39.right = avlNode41;
        system.testclass.AvlTree.AvlNode avlNode44 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode41.left = avlNode44;
        int int46 = avlNode41.height;
        int int47 = avlNode41.height;
        system.testclass.AvlTree.AvlNode avlNode48 = new system.testclass.AvlTree.AvlNode((int) '4', avlNode25, avlNode41);
        avlNode22.right = avlNode48;
        system.testclass.AvlTree.AvlNode avlNode51 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode53 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode51.right = avlNode53;
        avlNode22.right = avlNode51;
        system.testclass.AvlTree.AvlNode avlNode56 = avlNode51.right;
        system.testclass.AvlTree.AvlNode avlNode59 = new system.testclass.AvlTree.AvlNode((int) (short) 10);
        system.testclass.AvlTree.AvlNode avlNode62 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode64 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode66 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode64.right = avlNode66;
        system.testclass.AvlTree.AvlNode avlNode68 = new system.testclass.AvlTree.AvlNode(0, avlNode62, avlNode64);
        avlNode59.right = avlNode62;
        avlNode59.element = (byte) 10;
        system.testclass.AvlTree.AvlNode avlNode73 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode75 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode73.right = avlNode75;
        system.testclass.AvlTree.AvlNode avlNode78 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode75.left = avlNode78;
        int int80 = avlNode75.height;
        int int81 = avlNode75.height;
        system.testclass.AvlTree.AvlNode avlNode82 = new system.testclass.AvlTree.AvlNode((int) '4', avlNode59, avlNode75);
        system.testclass.AvlTree.AvlNode avlNode83 = avlNode82.left;
        avlNode56.left = avlNode83;
        avlTree0.root = avlNode56;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        system.testclass.AvlTree.AvlNode avlNode2 = avlTree0.root;
        boolean boolean3 = avlTree0.property_3();
        avlTree0.remove((int) ' ');
        boolean boolean6 = avlTree0.composedRepOK();
        avlTree0.insert((int) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        system.testclass.AvlTree.AvlNode avlNode2 = avlTree0.root;
        boolean boolean3 = avlTree0.property_3();
        avlTree0.remove((int) ' ');
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        boolean boolean7 = avlTree0.composedRepOK();
        system.testclass.AvlTree.AvlNode avlNode8 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode10 = new system.testclass.AvlTree.AvlNode((int) (short) 100);
        int int11 = avlNode10.height;
        int int12 = avlNode10.height;
        avlTree0.root = avlNode10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        boolean boolean2 = avlTree0.composedRepOK();
        boolean boolean3 = avlTree0.property_3();
        boolean boolean4 = avlTree0.property_3();
        boolean boolean5 = avlTree0.composedRepOK();
        boolean boolean6 = avlTree0.composedRepOK();
        system.testclass.AvlTree.AvlNode avlNode7 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode9 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode9.right = avlNode11;
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode11.left = avlNode14;
        system.testclass.AvlTree.AvlNode avlNode18 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode20 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode18.right = avlNode20;
        int int22 = avlNode20.height;
        system.testclass.AvlTree.AvlNode avlNode23 = avlNode20.left;
        system.testclass.AvlTree.AvlNode avlNode25 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode25.height = 0;
        system.testclass.AvlTree.AvlNode avlNode28 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode20, avlNode25);
        avlNode14.right = avlNode20;
        avlTree0.root = avlNode20;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        boolean boolean2 = avlTree0.isEmpty();
        avlTree0.remove(52);
        boolean boolean5 = avlTree0.property_3();
        boolean boolean6 = avlTree0.isEmpty();
        avlTree0.insert((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        boolean boolean2 = avlTree0.isEmpty();
        avlTree0.remove(52);
        avlTree0.remove(0);
        avlTree0.insert(10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        boolean boolean2 = avlTree0.composedRepOK();
        avlTree0.remove((int) '4');
        avlTree0.insert(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        avlTree0.remove((int) (byte) 1);
        boolean boolean4 = avlTree0.composedRepOK();
        boolean boolean5 = avlTree0.isEmpty();
        avlTree0.insert((int) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        system.testclass.AvlTree.AvlNode avlNode2 = avlTree0.root;
        avlTree0.remove((int) '#');
        boolean boolean5 = avlTree0.isEmpty();
        avlTree0.insert(52);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        avlTree0.remove((int) (byte) 1);
        boolean boolean4 = avlTree0.composedRepOK();
        boolean boolean5 = avlTree0.isEmpty();
        avlTree0.remove((int) '4');
        avlTree0.remove((int) (short) 1);
        boolean boolean10 = avlTree0.isEmpty();
        boolean boolean11 = avlTree0.composedRepOK();
        boolean boolean12 = avlTree0.property_3();
        avlTree0.insert((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        system.testclass.AvlTree.AvlNode avlNode2 = avlTree0.root;
        boolean boolean3 = avlTree0.property_3();
        avlTree0.remove((int) '4');
        avlTree0.remove((-1));
        boolean boolean8 = avlTree0.composedRepOK();
        avlTree0.remove((int) (byte) 1);
        boolean boolean11 = avlTree0.composedRepOK();
        boolean boolean12 = avlTree0.property_3();
        avlTree0.insert((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        boolean boolean2 = avlTree0.isEmpty();
        avlTree0.remove((int) (byte) 1);
        boolean boolean5 = avlTree0.property_3();
        boolean boolean6 = avlTree0.composedRepOK();
        system.testclass.AvlTree.AvlNode avlNode7 = avlTree0.root;
        avlTree0.insert(100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        avlTree0.remove((int) (short) 10);
        boolean boolean4 = avlTree0.composedRepOK();
        avlTree0.remove((int) (short) 1);
        system.testclass.AvlTree.AvlNode avlNode9 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode9.right = avlNode11;
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode17 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode15.right = avlNode17;
        int int19 = avlNode17.height;
        system.testclass.AvlTree.AvlNode avlNode20 = avlNode17.left;
        system.testclass.AvlTree.AvlNode avlNode22 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode22.height = 0;
        system.testclass.AvlTree.AvlNode avlNode25 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode17, avlNode22);
        int int26 = avlNode17.height;
        system.testclass.AvlTree.AvlNode avlNode27 = new system.testclass.AvlTree.AvlNode(1, avlNode9, avlNode17);
        avlNode27.height = 'a';
        system.testclass.AvlTree.AvlNode avlNode33 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode35 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode33.right = avlNode35;
        int int37 = avlNode35.height;
        system.testclass.AvlTree.AvlNode avlNode38 = avlNode35.left;
        system.testclass.AvlTree.AvlNode avlNode40 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode40.height = 0;
        system.testclass.AvlTree.AvlNode avlNode43 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode35, avlNode40);
        system.testclass.AvlTree.AvlNode avlNode45 = new system.testclass.AvlTree.AvlNode((int) (short) 10);
        system.testclass.AvlTree.AvlNode avlNode46 = new system.testclass.AvlTree.AvlNode((int) '4', avlNode43, avlNode45);
        avlNode27.left = avlNode46;
        avlTree0.root = avlNode46;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        boolean boolean2 = avlTree0.isEmpty();
        boolean boolean3 = avlTree0.composedRepOK();
        boolean boolean4 = avlTree0.isEmpty();
        avlTree0.remove((int) (short) 100);
        boolean boolean7 = avlTree0.property_3();
        boolean boolean8 = avlTree0.isEmpty();
        boolean boolean9 = avlTree0.composedRepOK();
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode16 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode14.right = avlNode16;
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode19.height = 0;
        system.testclass.AvlTree.AvlNode avlNode22 = new system.testclass.AvlTree.AvlNode(0, avlNode14, avlNode19);
        system.testclass.AvlTree.AvlNode avlNode23 = avlNode22.left;
        system.testclass.AvlTree.AvlNode avlNode27 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode29 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode27.right = avlNode29;
        int int31 = avlNode29.height;
        system.testclass.AvlTree.AvlNode avlNode32 = avlNode29.left;
        system.testclass.AvlTree.AvlNode avlNode34 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode34.height = 0;
        system.testclass.AvlTree.AvlNode avlNode37 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode29, avlNode34);
        system.testclass.AvlTree.AvlNode avlNode39 = new system.testclass.AvlTree.AvlNode((int) (short) 10);
        system.testclass.AvlTree.AvlNode avlNode40 = new system.testclass.AvlTree.AvlNode((int) '4', avlNode37, avlNode39);
        system.testclass.AvlTree.AvlNode avlNode41 = new system.testclass.AvlTree.AvlNode((int) (byte) -1, avlNode22, avlNode37);
        system.testclass.AvlTree.AvlNode avlNode44 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode46 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode44.right = avlNode46;
        int int48 = avlNode46.height;
        system.testclass.AvlTree.AvlNode avlNode49 = avlNode46.left;
        system.testclass.AvlTree.AvlNode avlNode51 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode51.height = 0;
        system.testclass.AvlTree.AvlNode avlNode54 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode46, avlNode51);
        int int55 = avlNode46.height;
        system.testclass.AvlTree.AvlNode avlNode58 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode60 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode58.right = avlNode60;
        int int62 = avlNode60.height;
        system.testclass.AvlTree.AvlNode avlNode63 = avlNode60.left;
        system.testclass.AvlTree.AvlNode avlNode65 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode65.height = 0;
        system.testclass.AvlTree.AvlNode avlNode68 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode60, avlNode65);
        avlNode46.left = avlNode60;
        int int70 = avlNode60.element;
        system.testclass.AvlTree.AvlNode avlNode72 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode74 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode72.right = avlNode74;
        system.testclass.AvlTree.AvlNode avlNode77 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode77.height = 0;
        avlNode74.right = avlNode77;
        system.testclass.AvlTree.AvlNode avlNode81 = avlNode74.right;
        int int82 = avlNode81.element;
        avlNode60.right = avlNode81;
        system.testclass.AvlTree.AvlNode avlNode84 = new system.testclass.AvlTree.AvlNode((int) (short) 10, avlNode37, avlNode60);
        avlTree0.root = avlNode37;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        avlTree0.remove((int) (byte) 1);
        boolean boolean4 = avlTree0.composedRepOK();
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        avlTree0.remove((-1));
        avlTree0.remove((int) (byte) 10);
        boolean boolean10 = avlTree0.composedRepOK();
        avlTree0.insert((int) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        avlTree0.remove((int) (byte) 1);
        boolean boolean4 = avlTree0.composedRepOK();
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        avlTree0.remove((-1));
        avlTree0.remove((int) (byte) 10);
        avlTree0.remove((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode13 = new system.testclass.AvlTree.AvlNode(1);
        avlTree0.root = avlNode13;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        system.testclass.AvlTree.AvlNode avlNode2 = avlTree0.root;
        boolean boolean3 = avlTree0.property_3();
        avlTree0.remove((int) ' ');
        boolean boolean6 = avlTree0.composedRepOK();
        system.testclass.AvlTree.AvlNode avlNode9 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode((int) (short) 10);
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode16 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode18 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode16.right = avlNode18;
        system.testclass.AvlTree.AvlNode avlNode20 = new system.testclass.AvlTree.AvlNode(0, avlNode14, avlNode16);
        avlNode11.right = avlNode14;
        avlNode9.right = avlNode11;
        system.testclass.AvlTree.AvlNode avlNode24 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode26 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode24.right = avlNode26;
        system.testclass.AvlTree.AvlNode avlNode29 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode29.height = 0;
        avlNode26.right = avlNode29;
        system.testclass.AvlTree.AvlNode avlNode33 = new system.testclass.AvlTree.AvlNode(0, avlNode11, avlNode26);
        int int34 = avlNode33.height;
        avlTree0.root = avlNode33;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        system.testclass.AvlTree.AvlNode avlNode2 = avlTree0.root;
        boolean boolean3 = avlTree0.property_3();
        avlTree0.remove((int) ' ');
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        boolean boolean7 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode10 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode12 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode12.right = avlNode14;
        system.testclass.AvlTree.AvlNode avlNode16 = new system.testclass.AvlTree.AvlNode(0, avlNode10, avlNode12);
        system.testclass.AvlTree.AvlNode avlNode20 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode22 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode20.right = avlNode22;
        int int24 = avlNode22.height;
        system.testclass.AvlTree.AvlNode avlNode25 = avlNode22.left;
        system.testclass.AvlTree.AvlNode avlNode27 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode27.height = 0;
        system.testclass.AvlTree.AvlNode avlNode30 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode22, avlNode27);
        system.testclass.AvlTree.AvlNode avlNode32 = new system.testclass.AvlTree.AvlNode((int) (short) 10);
        system.testclass.AvlTree.AvlNode avlNode33 = new system.testclass.AvlTree.AvlNode((int) '4', avlNode30, avlNode32);
        avlNode16.right = avlNode33;
        system.testclass.AvlTree.AvlNode avlNode35 = avlNode16.right;
        avlTree0.root = avlNode35;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        boolean boolean2 = avlTree0.composedRepOK();
        boolean boolean3 = avlTree0.isEmpty();
        avlTree0.insert((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        boolean boolean2 = avlTree0.composedRepOK();
        boolean boolean3 = avlTree0.isEmpty();
        boolean boolean4 = avlTree0.isEmpty();
        boolean boolean5 = avlTree0.property_3();
        avlTree0.insert((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        system.testclass.AvlTree.AvlNode avlNode2 = avlTree0.root;
        avlTree0.remove((int) '#');
        avlTree0.remove((int) 'a');
        system.testclass.AvlTree.AvlNode avlNode7 = avlTree0.root;
        boolean boolean8 = avlTree0.isEmpty();
        boolean boolean9 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode((int) (short) 0);
        avlTree0.root = avlNode11;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_3();
        system.testclass.AvlTree.AvlNode avlNode2 = avlTree0.root;
        boolean boolean3 = avlTree0.property_3();
        avlTree0.remove((int) '4');
        avlTree0.remove((-1));
        avlTree0.remove((int) (byte) 100);
        boolean boolean10 = avlTree0.composedRepOK();
        boolean boolean11 = avlTree0.isEmpty();
        avlTree0.insert((int) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        avlTree0.remove((int) (byte) 1);
        boolean boolean4 = avlTree0.composedRepOK();
        boolean boolean5 = avlTree0.isEmpty();
        avlTree0.remove((int) '4');
        avlTree0.remove(52);
        boolean boolean10 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode12 = new system.testclass.AvlTree.AvlNode((int) (short) 100);
        int int13 = avlNode12.height;
        int int14 = avlNode12.height;
        avlTree0.root = avlNode12;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        avlTree0.remove((int) (byte) 1);
        boolean boolean4 = avlTree0.composedRepOK();
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode8 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode10 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode12 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode10.right = avlNode12;
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode(0, avlNode8, avlNode10);
        int int15 = avlNode8.height;
        avlTree0.root = avlNode8;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }
}

