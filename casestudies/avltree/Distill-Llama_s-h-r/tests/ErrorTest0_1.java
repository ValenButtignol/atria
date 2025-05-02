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
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.insert((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode2 = new system.testclass.AvlTree.AvlNode((int) (byte) 0);
        avlTree0.root = avlNode2;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        avlTree0.insert(100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        avlTree0.insert((int) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        avlTree0.insert((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.insert(97);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        boolean boolean6 = avlTree0.isEmpty();
        avlTree0.insert((int) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.insert((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        boolean boolean6 = avlTree0.isEmpty();
        avlTree0.insert((int) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (short) 0);
        system.testclass.AvlTree.AvlNode avlNode4 = avlTree0.root;
        boolean boolean5 = avlTree0.isEmpty();
        avlTree0.insert((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        avlTree0.insert((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (short) 0);
        system.testclass.AvlTree.AvlNode avlNode4 = avlTree0.root;
        boolean boolean5 = avlTree0.isEmpty();
        avlTree0.insert(10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (byte) -1);
        avlTree0.remove((int) ' ');
        avlTree0.insert(97);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) (byte) 10);
        avlTree0.insert((int) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (short) 0);
        system.testclass.AvlTree.AvlNode avlNode4 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode6 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode6.height = (byte) 1;
        int int9 = avlNode6.height;
        system.testclass.AvlTree.AvlNode avlNode10 = avlNode6.left;
        avlTree0.root = avlNode6;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove(97);
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode8 = new system.testclass.AvlTree.AvlNode();
        int int9 = avlNode8.height;
        system.testclass.AvlTree.AvlNode avlNode10 = new system.testclass.AvlTree.AvlNode();
        avlNode8.right = avlNode10;
        avlNode8.element = 100;
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode16 = avlNode15.left;
        avlNode15.height = (byte) 0;
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode((int) (short) 10, avlNode8, avlNode15);
        avlTree0.root = avlNode8;
        boolean boolean21 = avlTree0.isEmpty();
        avlTree0.insert((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove(97);
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode8 = new system.testclass.AvlTree.AvlNode();
        int int9 = avlNode8.height;
        system.testclass.AvlTree.AvlNode avlNode10 = new system.testclass.AvlTree.AvlNode();
        avlNode8.right = avlNode10;
        avlNode8.element = 100;
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode16 = avlNode15.left;
        avlNode15.height = (byte) 0;
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode((int) (short) 10, avlNode8, avlNode15);
        avlTree0.root = avlNode8;
        boolean boolean21 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode23 = new system.testclass.AvlTree.AvlNode();
        int int24 = avlNode23.height;
        system.testclass.AvlTree.AvlNode avlNode25 = new system.testclass.AvlTree.AvlNode();
        avlNode23.right = avlNode25;
        avlNode23.element = 100;
        system.testclass.AvlTree.AvlNode avlNode31 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode33 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode34 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode31, avlNode33);
        system.testclass.AvlTree.AvlNode avlNode35 = avlNode34.right;
        avlNode23.left = avlNode34;
        system.testclass.AvlTree.AvlNode avlNode39 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode41 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode42 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode39, avlNode41);
        system.testclass.AvlTree.AvlNode avlNode44 = new system.testclass.AvlTree.AvlNode();
        int int45 = avlNode44.height;
        system.testclass.AvlTree.AvlNode avlNode46 = new system.testclass.AvlTree.AvlNode();
        avlNode44.right = avlNode46;
        system.testclass.AvlTree.AvlNode avlNode49 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode49.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode52 = new system.testclass.AvlTree.AvlNode(10, avlNode44, avlNode49);
        avlNode41.left = avlNode44;
        system.testclass.AvlTree.AvlNode avlNode55 = new system.testclass.AvlTree.AvlNode();
        int int56 = avlNode55.height;
        system.testclass.AvlTree.AvlNode avlNode57 = new system.testclass.AvlTree.AvlNode();
        avlNode55.right = avlNode57;
        system.testclass.AvlTree.AvlNode avlNode60 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode60.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode63 = new system.testclass.AvlTree.AvlNode(10, avlNode55, avlNode60);
        avlNode41.left = avlNode63;
        avlNode34.left = avlNode41;
        system.testclass.AvlTree.AvlNode avlNode67 = new system.testclass.AvlTree.AvlNode((int) (byte) 0);
        system.testclass.AvlTree.AvlNode avlNode68 = avlNode67.right;
        int int69 = avlNode67.height;
        avlNode67.element = (short) 10;
        system.testclass.AvlTree.AvlNode avlNode72 = new system.testclass.AvlTree.AvlNode(0, avlNode41, avlNode67);
        avlTree0.root = avlNode67;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        avlTree0.insert(10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove(97);
        avlTree0.insert((int) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.insert(100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (byte) -1);
        avlTree0.remove((int) ' ');
        avlTree0.insert(10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        avlTree0.insert((int) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        avlTree0.remove((-1));
        avlTree0.insert((int) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (byte) -1);
        avlTree0.remove((int) ' ');
        system.testclass.AvlTree.AvlNode avlNode9 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode12 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode9, avlNode11);
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode();
        int int15 = avlNode14.height;
        system.testclass.AvlTree.AvlNode avlNode16 = new system.testclass.AvlTree.AvlNode();
        avlNode14.right = avlNode16;
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode19.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode22 = new system.testclass.AvlTree.AvlNode(10, avlNode14, avlNode19);
        avlNode11.left = avlNode14;
        system.testclass.AvlTree.AvlNode avlNode26 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode28 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode29 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode26, avlNode28);
        system.testclass.AvlTree.AvlNode avlNode31 = new system.testclass.AvlTree.AvlNode();
        int int32 = avlNode31.height;
        system.testclass.AvlTree.AvlNode avlNode33 = new system.testclass.AvlTree.AvlNode();
        avlNode31.right = avlNode33;
        system.testclass.AvlTree.AvlNode avlNode36 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode36.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode39 = new system.testclass.AvlTree.AvlNode(10, avlNode31, avlNode36);
        avlNode28.left = avlNode31;
        system.testclass.AvlTree.AvlNode avlNode41 = new system.testclass.AvlTree.AvlNode((int) (short) 100, avlNode11, avlNode31);
        avlTree0.root = avlNode41;
        system.testclass.AvlTree.AvlNode avlNode44 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode45 = avlNode44.left;
        avlNode44.height = (byte) 0;
        int int48 = avlNode44.element;
        avlTree0.root = avlNode44;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove(97);
        avlTree0.insert((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        avlTree0.remove((int) (byte) 100);
        avlTree0.insert((int) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) (byte) 10);
        boolean boolean9 = avlTree0.isEmpty();
        avlTree0.insert((int) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (short) 0);
        avlTree0.remove(0);
        avlTree0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        avlTree0.insert((int) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode4 = new system.testclass.AvlTree.AvlNode();
        int int5 = avlNode4.height;
        system.testclass.AvlTree.AvlNode avlNode6 = new system.testclass.AvlTree.AvlNode();
        avlNode4.right = avlNode6;
        avlNode4.element = 100;
        system.testclass.AvlTree.AvlNode avlNode12 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode12, avlNode14);
        system.testclass.AvlTree.AvlNode avlNode16 = avlNode15.right;
        avlNode4.left = avlNode15;
        system.testclass.AvlTree.AvlNode avlNode21 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode23 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode24 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode21, avlNode23);
        system.testclass.AvlTree.AvlNode avlNode26 = new system.testclass.AvlTree.AvlNode();
        int int27 = avlNode26.height;
        system.testclass.AvlTree.AvlNode avlNode28 = new system.testclass.AvlTree.AvlNode();
        avlNode26.right = avlNode28;
        system.testclass.AvlTree.AvlNode avlNode31 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode31.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode34 = new system.testclass.AvlTree.AvlNode(10, avlNode26, avlNode31);
        avlNode23.left = avlNode26;
        system.testclass.AvlTree.AvlNode avlNode38 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode40 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode41 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode38, avlNode40);
        system.testclass.AvlTree.AvlNode avlNode43 = new system.testclass.AvlTree.AvlNode();
        int int44 = avlNode43.height;
        system.testclass.AvlTree.AvlNode avlNode45 = new system.testclass.AvlTree.AvlNode();
        avlNode43.right = avlNode45;
        system.testclass.AvlTree.AvlNode avlNode48 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode48.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode51 = new system.testclass.AvlTree.AvlNode(10, avlNode43, avlNode48);
        avlNode40.left = avlNode43;
        system.testclass.AvlTree.AvlNode avlNode53 = new system.testclass.AvlTree.AvlNode((int) (short) 100, avlNode23, avlNode43);
        avlNode15.right = avlNode53;
        avlNode53.height = 1;
        avlTree0.root = avlNode53;
        avlTree0.insert((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove(0);
        avlTree0.insert((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.insert((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) (byte) 1);
        avlTree0.remove((int) ' ');
        avlTree0.insert((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) (byte) 1);
        avlTree0.remove((int) ' ');
        avlTree0.insert((int) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) (byte) 10);
        boolean boolean9 = avlTree0.isEmpty();
        avlTree0.remove((int) (short) 100);
        system.testclass.AvlTree.AvlNode avlNode12 = new system.testclass.AvlTree.AvlNode();
        int int13 = avlNode12.height;
        int int14 = avlNode12.element;
        avlTree0.root = avlNode12;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove(97);
        boolean boolean5 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode6 = new system.testclass.AvlTree.AvlNode();
        int int7 = avlNode6.height;
        int int8 = avlNode6.element;
        int int9 = avlNode6.element;
        avlTree0.root = avlNode6;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode4 = new system.testclass.AvlTree.AvlNode();
        int int5 = avlNode4.height;
        system.testclass.AvlTree.AvlNode avlNode6 = new system.testclass.AvlTree.AvlNode();
        avlNode4.right = avlNode6;
        avlNode4.element = 100;
        system.testclass.AvlTree.AvlNode avlNode12 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode12, avlNode14);
        system.testclass.AvlTree.AvlNode avlNode16 = avlNode15.right;
        avlNode4.left = avlNode15;
        system.testclass.AvlTree.AvlNode avlNode21 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode23 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode24 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode21, avlNode23);
        system.testclass.AvlTree.AvlNode avlNode26 = new system.testclass.AvlTree.AvlNode();
        int int27 = avlNode26.height;
        system.testclass.AvlTree.AvlNode avlNode28 = new system.testclass.AvlTree.AvlNode();
        avlNode26.right = avlNode28;
        system.testclass.AvlTree.AvlNode avlNode31 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode31.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode34 = new system.testclass.AvlTree.AvlNode(10, avlNode26, avlNode31);
        avlNode23.left = avlNode26;
        system.testclass.AvlTree.AvlNode avlNode38 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode40 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode41 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode38, avlNode40);
        system.testclass.AvlTree.AvlNode avlNode43 = new system.testclass.AvlTree.AvlNode();
        int int44 = avlNode43.height;
        system.testclass.AvlTree.AvlNode avlNode45 = new system.testclass.AvlTree.AvlNode();
        avlNode43.right = avlNode45;
        system.testclass.AvlTree.AvlNode avlNode48 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode48.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode51 = new system.testclass.AvlTree.AvlNode(10, avlNode43, avlNode48);
        avlNode40.left = avlNode43;
        system.testclass.AvlTree.AvlNode avlNode53 = new system.testclass.AvlTree.AvlNode((int) (short) 100, avlNode23, avlNode43);
        avlNode15.right = avlNode53;
        avlNode53.height = 1;
        avlTree0.root = avlNode53;
        avlTree0.remove((int) '#');
        avlTree0.insert((int) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (byte) -1);
        avlTree0.remove((int) ' ');
        boolean boolean6 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode7 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode8 = new system.testclass.AvlTree.AvlNode();
        int int9 = avlNode8.height;
        system.testclass.AvlTree.AvlNode avlNode10 = new system.testclass.AvlTree.AvlNode();
        avlNode8.right = avlNode10;
        avlNode8.element = 100;
        system.testclass.AvlTree.AvlNode avlNode16 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode18 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode16, avlNode18);
        system.testclass.AvlTree.AvlNode avlNode20 = avlNode19.right;
        avlNode8.left = avlNode19;
        system.testclass.AvlTree.AvlNode avlNode22 = avlNode8.right;
        avlNode8.element = (-1);
        avlTree0.root = avlNode8;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        boolean boolean6 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode7 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode9 = new system.testclass.AvlTree.AvlNode(97);
        avlTree0.root = avlNode9;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) (byte) 10);
        boolean boolean9 = avlTree0.isEmpty();
        avlTree0.remove((int) (short) 100);
        avlTree0.insert((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        system.testclass.AvlTree.AvlNode avlNode3 = avlTree0.root;
        avlTree0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (short) 0);
        avlTree0.remove(0);
        avlTree0.remove((-1));
        avlTree0.insert((int) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) (byte) 10);
        avlTree0.insert((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove(10);
        system.testclass.AvlTree.AvlNode avlNode4 = new system.testclass.AvlTree.AvlNode(100);
        avlTree0.root = avlNode4;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        avlTree0.insert(10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        boolean boolean5 = avlTree0.isEmpty();
        boolean boolean6 = avlTree0.isEmpty();
        avlTree0.remove(0);
        avlTree0.insert((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (short) 0);
        avlTree0.remove(0);
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.insert((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) (byte) 10);
        boolean boolean9 = avlTree0.isEmpty();
        avlTree0.remove((int) (short) 100);
        system.testclass.AvlTree.AvlNode avlNode12 = new system.testclass.AvlTree.AvlNode();
        int int13 = avlNode12.height;
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode();
        avlNode12.right = avlNode14;
        avlNode12.element = 'a';
        avlTree0.root = avlNode12;
        boolean boolean19 = avlTree0.isEmpty();
        avlTree0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        boolean boolean6 = avlTree0.isEmpty();
        avlTree0.insert((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove(97);
        avlTree0.remove((int) '#');
        avlTree0.remove((int) (short) 0);
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode();
        int int12 = avlNode11.height;
        system.testclass.AvlTree.AvlNode avlNode13 = new system.testclass.AvlTree.AvlNode();
        avlNode11.right = avlNode13;
        avlNode11.element = 100;
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode21 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode22 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode19, avlNode21);
        system.testclass.AvlTree.AvlNode avlNode23 = avlNode22.right;
        avlNode11.left = avlNode22;
        system.testclass.AvlTree.AvlNode avlNode25 = avlNode11.left;
        system.testclass.AvlTree.AvlNode avlNode27 = new system.testclass.AvlTree.AvlNode();
        int int28 = avlNode27.height;
        system.testclass.AvlTree.AvlNode avlNode29 = new system.testclass.AvlTree.AvlNode();
        avlNode27.right = avlNode29;
        avlNode27.element = 100;
        system.testclass.AvlTree.AvlNode avlNode34 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode34.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode37 = avlNode34.left;
        avlNode27.left = avlNode34;
        int int39 = avlNode34.height;
        int int40 = avlNode34.height;
        system.testclass.AvlTree.AvlNode avlNode42 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode42.height = (byte) 1;
        avlNode34.right = avlNode42;
        system.testclass.AvlTree.AvlNode avlNode46 = new system.testclass.AvlTree.AvlNode();
        int int47 = avlNode46.height;
        system.testclass.AvlTree.AvlNode avlNode48 = new system.testclass.AvlTree.AvlNode();
        avlNode46.right = avlNode48;
        avlNode46.element = 100;
        system.testclass.AvlTree.AvlNode avlNode54 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode56 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode57 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode54, avlNode56);
        system.testclass.AvlTree.AvlNode avlNode58 = avlNode57.right;
        avlNode46.left = avlNode57;
        system.testclass.AvlTree.AvlNode avlNode60 = avlNode46.left;
        system.testclass.AvlTree.AvlNode avlNode61 = new system.testclass.AvlTree.AvlNode((int) (short) 10, avlNode34, avlNode60);
        system.testclass.AvlTree.AvlNode avlNode62 = new system.testclass.AvlTree.AvlNode(97, avlNode11, avlNode61);
        system.testclass.AvlTree.AvlNode avlNode63 = new system.testclass.AvlTree.AvlNode();
        int int64 = avlNode63.height;
        system.testclass.AvlTree.AvlNode avlNode65 = new system.testclass.AvlTree.AvlNode();
        avlNode63.right = avlNode65;
        avlNode63.element = 100;
        system.testclass.AvlTree.AvlNode avlNode71 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode73 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode74 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode71, avlNode73);
        system.testclass.AvlTree.AvlNode avlNode75 = avlNode74.right;
        avlNode63.left = avlNode74;
        system.testclass.AvlTree.AvlNode avlNode77 = avlNode63.left;
        system.testclass.AvlTree.AvlNode avlNode78 = new system.testclass.AvlTree.AvlNode((int) (short) 0, avlNode61, avlNode77);
        avlTree0.root = avlNode77;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove(10);
        boolean boolean3 = avlTree0.isEmpty();
        boolean boolean4 = avlTree0.isEmpty();
        avlTree0.insert((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.insert((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (short) 0);
        system.testclass.AvlTree.AvlNode avlNode4 = avlTree0.root;
        avlTree0.remove((int) 'a');
        boolean boolean7 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode8 = avlTree0.root;
        avlTree0.insert((int) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.insert((int) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove(0);
        avlTree0.insert((-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove(10);
        avlTree0.insert((int) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        avlTree0.remove(0);
        system.testclass.AvlTree.AvlNode avlNode4 = avlTree0.root;
        avlTree0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        boolean boolean6 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode7 = avlTree0.root;
        avlTree0.remove((int) (short) 0);
        avlTree0.remove((int) (byte) 100);
        system.testclass.AvlTree.AvlNode avlNode13 = new system.testclass.AvlTree.AvlNode(0);
        avlNode13.element = (byte) -1;
        avlTree0.root = avlNode13;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove(10);
        system.testclass.AvlTree.AvlNode avlNode3 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode4 = new system.testclass.AvlTree.AvlNode();
        int int5 = avlNode4.height;
        system.testclass.AvlTree.AvlNode avlNode6 = new system.testclass.AvlTree.AvlNode();
        avlNode4.right = avlNode6;
        avlNode4.element = 100;
        system.testclass.AvlTree.AvlNode avlNode12 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode12, avlNode14);
        system.testclass.AvlTree.AvlNode avlNode16 = avlNode15.right;
        avlNode4.left = avlNode15;
        system.testclass.AvlTree.AvlNode avlNode18 = avlNode4.right;
        system.testclass.AvlTree.AvlNode avlNode19 = avlNode4.left;
        int int20 = avlNode19.element;
        avlTree0.root = avlNode19;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        avlTree0.remove(0);
        avlTree0.insert((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode3 = new system.testclass.AvlTree.AvlNode((int) (byte) 10);
        system.testclass.AvlTree.AvlNode avlNode5 = new system.testclass.AvlTree.AvlNode();
        int int6 = avlNode5.height;
        system.testclass.AvlTree.AvlNode avlNode7 = new system.testclass.AvlTree.AvlNode();
        avlNode5.right = avlNode7;
        avlNode5.element = 100;
        system.testclass.AvlTree.AvlNode avlNode12 = new system.testclass.AvlTree.AvlNode((int) 'a');
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode();
        int int15 = avlNode14.height;
        system.testclass.AvlTree.AvlNode avlNode16 = new system.testclass.AvlTree.AvlNode();
        avlNode14.right = avlNode16;
        avlNode14.element = 100;
        system.testclass.AvlTree.AvlNode avlNode22 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode24 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode25 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode22, avlNode24);
        system.testclass.AvlTree.AvlNode avlNode26 = avlNode25.right;
        avlNode14.left = avlNode25;
        system.testclass.AvlTree.AvlNode avlNode30 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode32 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode33 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode30, avlNode32);
        system.testclass.AvlTree.AvlNode avlNode35 = new system.testclass.AvlTree.AvlNode();
        int int36 = avlNode35.height;
        system.testclass.AvlTree.AvlNode avlNode37 = new system.testclass.AvlTree.AvlNode();
        avlNode35.right = avlNode37;
        system.testclass.AvlTree.AvlNode avlNode40 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode40.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode43 = new system.testclass.AvlTree.AvlNode(10, avlNode35, avlNode40);
        avlNode32.left = avlNode35;
        system.testclass.AvlTree.AvlNode avlNode46 = new system.testclass.AvlTree.AvlNode();
        int int47 = avlNode46.height;
        system.testclass.AvlTree.AvlNode avlNode48 = new system.testclass.AvlTree.AvlNode();
        avlNode46.right = avlNode48;
        system.testclass.AvlTree.AvlNode avlNode51 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode51.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode54 = new system.testclass.AvlTree.AvlNode(10, avlNode46, avlNode51);
        avlNode32.left = avlNode54;
        avlNode25.left = avlNode32;
        system.testclass.AvlTree.AvlNode avlNode58 = new system.testclass.AvlTree.AvlNode((int) (byte) 0);
        system.testclass.AvlTree.AvlNode avlNode59 = avlNode58.right;
        int int60 = avlNode58.height;
        avlNode58.element = (short) 10;
        system.testclass.AvlTree.AvlNode avlNode63 = new system.testclass.AvlTree.AvlNode(0, avlNode32, avlNode58);
        avlNode12.right = avlNode63;
        system.testclass.AvlTree.AvlNode avlNode65 = new system.testclass.AvlTree.AvlNode((int) 'a', avlNode5, avlNode63);
        system.testclass.AvlTree.AvlNode avlNode66 = new system.testclass.AvlTree.AvlNode((int) (byte) 100, avlNode3, avlNode63);
        avlTree0.root = avlNode66;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove(10);
        boolean boolean3 = avlTree0.isEmpty();
        boolean boolean4 = avlTree0.isEmpty();
        avlTree0.insert((int) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove(97);
        avlTree0.remove((int) '#');
        avlTree0.remove((int) (short) 0);
        avlTree0.insert((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (byte) -1);
        avlTree0.remove((int) ' ');
        avlTree0.insert((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (short) 0);
        system.testclass.AvlTree.AvlNode avlNode4 = avlTree0.root;
        boolean boolean5 = avlTree0.isEmpty();
        avlTree0.insert(52);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) (byte) 1);
        avlTree0.remove((int) ' ');
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode();
        int int12 = avlNode11.height;
        system.testclass.AvlTree.AvlNode avlNode13 = new system.testclass.AvlTree.AvlNode();
        avlNode11.right = avlNode13;
        avlNode11.element = 100;
        system.testclass.AvlTree.AvlNode avlNode18 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode18.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode21 = avlNode18.left;
        avlNode11.left = avlNode18;
        int int23 = avlNode18.height;
        int int24 = avlNode18.height;
        system.testclass.AvlTree.AvlNode avlNode26 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode26.height = (byte) 1;
        avlNode18.right = avlNode26;
        avlTree0.root = avlNode26;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove(10);
        boolean boolean3 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode5 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode6 = avlNode5.left;
        avlNode5.height = (byte) 0;
        system.testclass.AvlTree.AvlNode avlNode9 = new system.testclass.AvlTree.AvlNode();
        int int10 = avlNode9.height;
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode();
        avlNode9.right = avlNode11;
        avlNode9.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode15 = avlNode9.right;
        avlNode5.right = avlNode9;
        avlTree0.root = avlNode5;
        boolean boolean18 = avlTree0.isEmpty();
        boolean boolean19 = avlTree0.isEmpty();
        avlTree0.insert((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode4 = new system.testclass.AvlTree.AvlNode();
        int int5 = avlNode4.height;
        system.testclass.AvlTree.AvlNode avlNode6 = new system.testclass.AvlTree.AvlNode();
        avlNode4.right = avlNode6;
        avlNode4.element = 100;
        system.testclass.AvlTree.AvlNode avlNode12 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode12, avlNode14);
        system.testclass.AvlTree.AvlNode avlNode16 = avlNode15.right;
        avlNode4.left = avlNode15;
        system.testclass.AvlTree.AvlNode avlNode21 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode23 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode24 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode21, avlNode23);
        system.testclass.AvlTree.AvlNode avlNode26 = new system.testclass.AvlTree.AvlNode();
        int int27 = avlNode26.height;
        system.testclass.AvlTree.AvlNode avlNode28 = new system.testclass.AvlTree.AvlNode();
        avlNode26.right = avlNode28;
        system.testclass.AvlTree.AvlNode avlNode31 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode31.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode34 = new system.testclass.AvlTree.AvlNode(10, avlNode26, avlNode31);
        avlNode23.left = avlNode26;
        system.testclass.AvlTree.AvlNode avlNode38 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode40 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode41 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode38, avlNode40);
        system.testclass.AvlTree.AvlNode avlNode43 = new system.testclass.AvlTree.AvlNode();
        int int44 = avlNode43.height;
        system.testclass.AvlTree.AvlNode avlNode45 = new system.testclass.AvlTree.AvlNode();
        avlNode43.right = avlNode45;
        system.testclass.AvlTree.AvlNode avlNode48 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode48.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode51 = new system.testclass.AvlTree.AvlNode(10, avlNode43, avlNode48);
        avlNode40.left = avlNode43;
        system.testclass.AvlTree.AvlNode avlNode53 = new system.testclass.AvlTree.AvlNode((int) (short) 100, avlNode23, avlNode43);
        avlNode15.right = avlNode53;
        avlNode53.height = 1;
        avlTree0.root = avlNode53;
        int int58 = avlTree0.findMin();
        avlTree0.insert((int) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove(10);
        boolean boolean3 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode5 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode6 = avlNode5.left;
        avlNode5.height = (byte) 0;
        system.testclass.AvlTree.AvlNode avlNode9 = new system.testclass.AvlTree.AvlNode();
        int int10 = avlNode9.height;
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode();
        avlNode9.right = avlNode11;
        avlNode9.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode15 = avlNode9.right;
        avlNode5.right = avlNode9;
        avlTree0.root = avlNode5;
        boolean boolean18 = avlTree0.isEmpty();
        int int19 = avlTree0.findMin();
        avlTree0.insert((int) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test71");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        boolean boolean5 = avlTree0.isEmpty();
        boolean boolean6 = avlTree0.isEmpty();
        avlTree0.remove(0);
        avlTree0.insert(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test72");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (byte) -1);
        avlTree0.remove((int) ' ');
        system.testclass.AvlTree.AvlNode avlNode9 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode12 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode9, avlNode11);
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode();
        int int15 = avlNode14.height;
        system.testclass.AvlTree.AvlNode avlNode16 = new system.testclass.AvlTree.AvlNode();
        avlNode14.right = avlNode16;
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode19.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode22 = new system.testclass.AvlTree.AvlNode(10, avlNode14, avlNode19);
        avlNode11.left = avlNode14;
        system.testclass.AvlTree.AvlNode avlNode26 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode28 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode29 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode26, avlNode28);
        system.testclass.AvlTree.AvlNode avlNode31 = new system.testclass.AvlTree.AvlNode();
        int int32 = avlNode31.height;
        system.testclass.AvlTree.AvlNode avlNode33 = new system.testclass.AvlTree.AvlNode();
        avlNode31.right = avlNode33;
        system.testclass.AvlTree.AvlNode avlNode36 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode36.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode39 = new system.testclass.AvlTree.AvlNode(10, avlNode31, avlNode36);
        avlNode28.left = avlNode31;
        system.testclass.AvlTree.AvlNode avlNode41 = new system.testclass.AvlTree.AvlNode((int) (short) 100, avlNode11, avlNode31);
        avlTree0.root = avlNode41;
        avlTree0.insert((int) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test73");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove(97);
        avlTree0.remove((int) '#');
        avlTree0.remove((int) (short) 1);
        avlTree0.insert(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test74");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove(10);
        boolean boolean3 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode5 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode6 = avlNode5.left;
        avlNode5.height = (byte) 0;
        system.testclass.AvlTree.AvlNode avlNode9 = new system.testclass.AvlTree.AvlNode();
        int int10 = avlNode9.height;
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode();
        avlNode9.right = avlNode11;
        avlNode9.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode15 = avlNode9.right;
        avlNode5.right = avlNode9;
        avlTree0.root = avlNode5;
        avlTree0.insert((int) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test75");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove(10);
        boolean boolean3 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode5 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode6 = avlNode5.left;
        avlNode5.height = (byte) 0;
        system.testclass.AvlTree.AvlNode avlNode9 = new system.testclass.AvlTree.AvlNode();
        int int10 = avlNode9.height;
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode();
        avlNode9.right = avlNode11;
        avlNode9.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode15 = avlNode9.right;
        avlNode5.right = avlNode9;
        avlTree0.root = avlNode5;
        avlTree0.insert((int) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test76");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove(10);
        boolean boolean3 = avlTree0.isEmpty();
        avlTree0.remove(100);
        system.testclass.AvlTree.AvlNode avlNode7 = new system.testclass.AvlTree.AvlNode((int) 'a');
        system.testclass.AvlTree.AvlNode avlNode9 = new system.testclass.AvlTree.AvlNode();
        int int10 = avlNode9.height;
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode();
        avlNode9.right = avlNode11;
        avlNode9.element = 100;
        system.testclass.AvlTree.AvlNode avlNode17 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode20 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode17, avlNode19);
        system.testclass.AvlTree.AvlNode avlNode21 = avlNode20.right;
        avlNode9.left = avlNode20;
        system.testclass.AvlTree.AvlNode avlNode25 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode27 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode28 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode25, avlNode27);
        system.testclass.AvlTree.AvlNode avlNode30 = new system.testclass.AvlTree.AvlNode();
        int int31 = avlNode30.height;
        system.testclass.AvlTree.AvlNode avlNode32 = new system.testclass.AvlTree.AvlNode();
        avlNode30.right = avlNode32;
        system.testclass.AvlTree.AvlNode avlNode35 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode35.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode38 = new system.testclass.AvlTree.AvlNode(10, avlNode30, avlNode35);
        avlNode27.left = avlNode30;
        system.testclass.AvlTree.AvlNode avlNode41 = new system.testclass.AvlTree.AvlNode();
        int int42 = avlNode41.height;
        system.testclass.AvlTree.AvlNode avlNode43 = new system.testclass.AvlTree.AvlNode();
        avlNode41.right = avlNode43;
        system.testclass.AvlTree.AvlNode avlNode46 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode46.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode49 = new system.testclass.AvlTree.AvlNode(10, avlNode41, avlNode46);
        avlNode27.left = avlNode49;
        avlNode20.left = avlNode27;
        system.testclass.AvlTree.AvlNode avlNode53 = new system.testclass.AvlTree.AvlNode((int) (byte) 0);
        system.testclass.AvlTree.AvlNode avlNode54 = avlNode53.right;
        int int55 = avlNode53.height;
        avlNode53.element = (short) 10;
        system.testclass.AvlTree.AvlNode avlNode58 = new system.testclass.AvlTree.AvlNode(0, avlNode27, avlNode53);
        avlNode7.right = avlNode58;
        avlTree0.root = avlNode58;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test77");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        boolean boolean5 = avlTree0.isEmpty();
        boolean boolean6 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode7 = new system.testclass.AvlTree.AvlNode();
        int int8 = avlNode7.height;
        system.testclass.AvlTree.AvlNode avlNode9 = new system.testclass.AvlTree.AvlNode();
        avlNode7.right = avlNode9;
        avlNode7.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode13 = avlNode7.right;
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode();
        int int15 = avlNode14.height;
        system.testclass.AvlTree.AvlNode avlNode16 = new system.testclass.AvlTree.AvlNode();
        avlNode14.right = avlNode16;
        avlNode14.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode20 = avlNode14.right;
        avlNode13.right = avlNode14;
        avlTree0.root = avlNode14;
        system.testclass.AvlTree.AvlNode avlNode24 = new system.testclass.AvlTree.AvlNode();
        int int25 = avlNode24.height;
        system.testclass.AvlTree.AvlNode avlNode26 = new system.testclass.AvlTree.AvlNode();
        avlNode24.right = avlNode26;
        avlNode24.element = 100;
        system.testclass.AvlTree.AvlNode avlNode31 = new system.testclass.AvlTree.AvlNode((int) 'a');
        system.testclass.AvlTree.AvlNode avlNode33 = new system.testclass.AvlTree.AvlNode();
        int int34 = avlNode33.height;
        system.testclass.AvlTree.AvlNode avlNode35 = new system.testclass.AvlTree.AvlNode();
        avlNode33.right = avlNode35;
        avlNode33.element = 100;
        system.testclass.AvlTree.AvlNode avlNode41 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode43 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode44 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode41, avlNode43);
        system.testclass.AvlTree.AvlNode avlNode45 = avlNode44.right;
        avlNode33.left = avlNode44;
        system.testclass.AvlTree.AvlNode avlNode49 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode51 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode52 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode49, avlNode51);
        system.testclass.AvlTree.AvlNode avlNode54 = new system.testclass.AvlTree.AvlNode();
        int int55 = avlNode54.height;
        system.testclass.AvlTree.AvlNode avlNode56 = new system.testclass.AvlTree.AvlNode();
        avlNode54.right = avlNode56;
        system.testclass.AvlTree.AvlNode avlNode59 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode59.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode62 = new system.testclass.AvlTree.AvlNode(10, avlNode54, avlNode59);
        avlNode51.left = avlNode54;
        system.testclass.AvlTree.AvlNode avlNode65 = new system.testclass.AvlTree.AvlNode();
        int int66 = avlNode65.height;
        system.testclass.AvlTree.AvlNode avlNode67 = new system.testclass.AvlTree.AvlNode();
        avlNode65.right = avlNode67;
        system.testclass.AvlTree.AvlNode avlNode70 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode70.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode73 = new system.testclass.AvlTree.AvlNode(10, avlNode65, avlNode70);
        avlNode51.left = avlNode73;
        avlNode44.left = avlNode51;
        system.testclass.AvlTree.AvlNode avlNode77 = new system.testclass.AvlTree.AvlNode((int) (byte) 0);
        system.testclass.AvlTree.AvlNode avlNode78 = avlNode77.right;
        int int79 = avlNode77.height;
        avlNode77.element = (short) 10;
        system.testclass.AvlTree.AvlNode avlNode82 = new system.testclass.AvlTree.AvlNode(0, avlNode51, avlNode77);
        avlNode31.right = avlNode82;
        system.testclass.AvlTree.AvlNode avlNode84 = new system.testclass.AvlTree.AvlNode((int) 'a', avlNode24, avlNode82);
        avlNode84.height = (byte) 100;
        avlTree0.root = avlNode84;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test78");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        avlTree0.remove((-1));
        system.testclass.AvlTree.AvlNode avlNode4 = avlTree0.root;
        avlTree0.insert((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test79");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        boolean boolean5 = avlTree0.isEmpty();
        boolean boolean6 = avlTree0.isEmpty();
        avlTree0.remove((int) (short) 100);
        avlTree0.insert((int) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test80");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (short) 0);
        avlTree0.remove(0);
        avlTree0.remove((-1));
        avlTree0.insert((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test81");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove(10);
        boolean boolean3 = avlTree0.isEmpty();
        boolean boolean4 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode5 = new system.testclass.AvlTree.AvlNode();
        int int6 = avlNode5.height;
        system.testclass.AvlTree.AvlNode avlNode7 = new system.testclass.AvlTree.AvlNode();
        avlNode5.right = avlNode7;
        avlNode5.element = 100;
        system.testclass.AvlTree.AvlNode avlNode11 = avlNode5.left;
        system.testclass.AvlTree avlTree12 = new system.testclass.AvlTree();
        avlTree12.remove(10);
        boolean boolean15 = avlTree12.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode17 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode18 = avlNode17.left;
        avlNode17.height = (byte) 0;
        system.testclass.AvlTree.AvlNode avlNode21 = new system.testclass.AvlTree.AvlNode();
        int int22 = avlNode21.height;
        system.testclass.AvlTree.AvlNode avlNode23 = new system.testclass.AvlTree.AvlNode();
        avlNode21.right = avlNode23;
        avlNode21.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode27 = avlNode21.right;
        avlNode17.right = avlNode21;
        avlTree12.root = avlNode17;
        avlNode5.right = avlNode17;
        avlNode5.element = 100;
        avlTree0.root = avlNode5;
        boolean boolean34 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode35 = avlTree0.root;
        avlTree0.insert((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test82");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode4 = new system.testclass.AvlTree.AvlNode();
        int int5 = avlNode4.height;
        system.testclass.AvlTree.AvlNode avlNode6 = new system.testclass.AvlTree.AvlNode();
        avlNode4.right = avlNode6;
        avlNode4.element = 100;
        system.testclass.AvlTree.AvlNode avlNode12 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode12, avlNode14);
        system.testclass.AvlTree.AvlNode avlNode16 = avlNode15.right;
        avlNode4.left = avlNode15;
        system.testclass.AvlTree.AvlNode avlNode21 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode23 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode24 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode21, avlNode23);
        system.testclass.AvlTree.AvlNode avlNode26 = new system.testclass.AvlTree.AvlNode();
        int int27 = avlNode26.height;
        system.testclass.AvlTree.AvlNode avlNode28 = new system.testclass.AvlTree.AvlNode();
        avlNode26.right = avlNode28;
        system.testclass.AvlTree.AvlNode avlNode31 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode31.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode34 = new system.testclass.AvlTree.AvlNode(10, avlNode26, avlNode31);
        avlNode23.left = avlNode26;
        system.testclass.AvlTree.AvlNode avlNode38 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode40 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode41 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode38, avlNode40);
        system.testclass.AvlTree.AvlNode avlNode43 = new system.testclass.AvlTree.AvlNode();
        int int44 = avlNode43.height;
        system.testclass.AvlTree.AvlNode avlNode45 = new system.testclass.AvlTree.AvlNode();
        avlNode43.right = avlNode45;
        system.testclass.AvlTree.AvlNode avlNode48 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode48.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode51 = new system.testclass.AvlTree.AvlNode(10, avlNode43, avlNode48);
        avlNode40.left = avlNode43;
        system.testclass.AvlTree.AvlNode avlNode53 = new system.testclass.AvlTree.AvlNode((int) (short) 100, avlNode23, avlNode43);
        avlNode15.right = avlNode53;
        avlNode53.height = 1;
        avlTree0.root = avlNode53;
        avlTree0.remove((int) '#');
        avlTree0.insert((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test83");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove(97);
        avlTree0.remove((int) '4');
        avlTree0.insert((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test84");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (short) 0);
        system.testclass.AvlTree.AvlNode avlNode4 = avlTree0.root;
        avlTree0.remove((int) 'a');
        boolean boolean7 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode8 = avlTree0.root;
        boolean boolean9 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode10 = avlTree0.root;
        avlTree0.insert(52);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test85");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove(10);
        boolean boolean3 = avlTree0.isEmpty();
        boolean boolean4 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode5 = new system.testclass.AvlTree.AvlNode();
        int int6 = avlNode5.height;
        system.testclass.AvlTree.AvlNode avlNode7 = new system.testclass.AvlTree.AvlNode();
        avlNode5.right = avlNode7;
        avlNode5.element = 100;
        system.testclass.AvlTree.AvlNode avlNode11 = avlNode5.left;
        system.testclass.AvlTree avlTree12 = new system.testclass.AvlTree();
        avlTree12.remove(10);
        boolean boolean15 = avlTree12.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode17 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode18 = avlNode17.left;
        avlNode17.height = (byte) 0;
        system.testclass.AvlTree.AvlNode avlNode21 = new system.testclass.AvlTree.AvlNode();
        int int22 = avlNode21.height;
        system.testclass.AvlTree.AvlNode avlNode23 = new system.testclass.AvlTree.AvlNode();
        avlNode21.right = avlNode23;
        avlNode21.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode27 = avlNode21.right;
        avlNode17.right = avlNode21;
        avlTree12.root = avlNode17;
        avlNode5.right = avlNode17;
        avlNode5.element = 100;
        avlTree0.root = avlNode5;
        avlTree0.remove(0);
        avlTree0.insert((int) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test86");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.insert(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test87() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test87");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (short) 0);
        avlTree0.remove(0);
        avlTree0.insert(97);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test88() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test88");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) (byte) 1);
        avlTree0.remove((int) ' ');
        system.testclass.AvlTree.AvlNode avlNode13 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode13.height = (byte) 1;
        int int16 = avlNode13.height;
        system.testclass.AvlTree.AvlNode avlNode20 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode22 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode23 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode20, avlNode22);
        system.testclass.AvlTree.AvlNode avlNode25 = new system.testclass.AvlTree.AvlNode();
        int int26 = avlNode25.height;
        system.testclass.AvlTree.AvlNode avlNode27 = new system.testclass.AvlTree.AvlNode();
        avlNode25.right = avlNode27;
        system.testclass.AvlTree.AvlNode avlNode30 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode30.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode33 = new system.testclass.AvlTree.AvlNode(10, avlNode25, avlNode30);
        avlNode22.left = avlNode25;
        system.testclass.AvlTree.AvlNode avlNode37 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode39 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode40 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode37, avlNode39);
        system.testclass.AvlTree.AvlNode avlNode42 = new system.testclass.AvlTree.AvlNode();
        int int43 = avlNode42.height;
        system.testclass.AvlTree.AvlNode avlNode44 = new system.testclass.AvlTree.AvlNode();
        avlNode42.right = avlNode44;
        system.testclass.AvlTree.AvlNode avlNode47 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode47.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode50 = new system.testclass.AvlTree.AvlNode(10, avlNode42, avlNode47);
        avlNode39.left = avlNode42;
        system.testclass.AvlTree.AvlNode avlNode52 = new system.testclass.AvlTree.AvlNode((int) (short) 100, avlNode22, avlNode42);
        system.testclass.AvlTree.AvlNode avlNode53 = new system.testclass.AvlTree.AvlNode(10, avlNode13, avlNode22);
        system.testclass.AvlTree.AvlNode avlNode54 = avlNode22.left;
        avlNode22.element = 10;
        avlTree0.root = avlNode22;
        system.testclass.AvlTree.AvlNode avlNode58 = avlTree0.root;
        avlTree0.remove(10);
        avlTree0.insert(100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test89() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test89");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        boolean boolean6 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode7 = avlTree0.root;
        avlTree0.insert((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test90() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test90");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove(10);
        boolean boolean3 = avlTree0.isEmpty();
        boolean boolean4 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode5 = new system.testclass.AvlTree.AvlNode();
        int int6 = avlNode5.height;
        system.testclass.AvlTree.AvlNode avlNode7 = new system.testclass.AvlTree.AvlNode();
        avlNode5.right = avlNode7;
        avlNode5.element = 100;
        system.testclass.AvlTree.AvlNode avlNode11 = avlNode5.left;
        system.testclass.AvlTree avlTree12 = new system.testclass.AvlTree();
        avlTree12.remove(10);
        boolean boolean15 = avlTree12.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode17 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode18 = avlNode17.left;
        avlNode17.height = (byte) 0;
        system.testclass.AvlTree.AvlNode avlNode21 = new system.testclass.AvlTree.AvlNode();
        int int22 = avlNode21.height;
        system.testclass.AvlTree.AvlNode avlNode23 = new system.testclass.AvlTree.AvlNode();
        avlNode21.right = avlNode23;
        avlNode21.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode27 = avlNode21.right;
        avlNode17.right = avlNode21;
        avlTree12.root = avlNode17;
        avlNode5.right = avlNode17;
        avlNode5.element = 100;
        avlTree0.root = avlNode5;
        boolean boolean34 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode35 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode39 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode41 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode42 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode39, avlNode41);
        system.testclass.AvlTree.AvlNode avlNode44 = new system.testclass.AvlTree.AvlNode();
        int int45 = avlNode44.height;
        system.testclass.AvlTree.AvlNode avlNode46 = new system.testclass.AvlTree.AvlNode();
        avlNode44.right = avlNode46;
        system.testclass.AvlTree.AvlNode avlNode49 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode49.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode52 = new system.testclass.AvlTree.AvlNode(10, avlNode44, avlNode49);
        avlNode41.left = avlNode44;
        avlNode44.element = (short) 0;
        system.testclass.AvlTree.AvlNode avlNode58 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode60 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode61 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode58, avlNode60);
        avlNode44.left = avlNode58;
        system.testclass.AvlTree.AvlNode avlNode65 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode67 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode68 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode65, avlNode67);
        system.testclass.AvlTree.AvlNode avlNode69 = avlNode68.right;
        system.testclass.AvlTree.AvlNode avlNode70 = new system.testclass.AvlTree.AvlNode((int) (short) 0, avlNode44, avlNode68);
        avlTree0.root = avlNode70;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test91() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test91");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode4 = new system.testclass.AvlTree.AvlNode();
        int int5 = avlNode4.height;
        system.testclass.AvlTree.AvlNode avlNode6 = new system.testclass.AvlTree.AvlNode();
        avlNode4.right = avlNode6;
        avlNode4.element = 100;
        system.testclass.AvlTree.AvlNode avlNode12 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode12, avlNode14);
        system.testclass.AvlTree.AvlNode avlNode16 = avlNode15.right;
        avlNode4.left = avlNode15;
        system.testclass.AvlTree.AvlNode avlNode21 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode23 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode24 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode21, avlNode23);
        system.testclass.AvlTree.AvlNode avlNode26 = new system.testclass.AvlTree.AvlNode();
        int int27 = avlNode26.height;
        system.testclass.AvlTree.AvlNode avlNode28 = new system.testclass.AvlTree.AvlNode();
        avlNode26.right = avlNode28;
        system.testclass.AvlTree.AvlNode avlNode31 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode31.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode34 = new system.testclass.AvlTree.AvlNode(10, avlNode26, avlNode31);
        avlNode23.left = avlNode26;
        system.testclass.AvlTree.AvlNode avlNode38 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode40 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode41 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode38, avlNode40);
        system.testclass.AvlTree.AvlNode avlNode43 = new system.testclass.AvlTree.AvlNode();
        int int44 = avlNode43.height;
        system.testclass.AvlTree.AvlNode avlNode45 = new system.testclass.AvlTree.AvlNode();
        avlNode43.right = avlNode45;
        system.testclass.AvlTree.AvlNode avlNode48 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode48.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode51 = new system.testclass.AvlTree.AvlNode(10, avlNode43, avlNode48);
        avlNode40.left = avlNode43;
        system.testclass.AvlTree.AvlNode avlNode53 = new system.testclass.AvlTree.AvlNode((int) (short) 100, avlNode23, avlNode43);
        avlNode15.right = avlNode53;
        avlNode53.height = 1;
        avlTree0.root = avlNode53;
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '#');
        boolean boolean62 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode64 = new system.testclass.AvlTree.AvlNode();
        int int65 = avlNode64.height;
        system.testclass.AvlTree.AvlNode avlNode66 = new system.testclass.AvlTree.AvlNode();
        avlNode64.right = avlNode66;
        avlNode64.element = 100;
        system.testclass.AvlTree.AvlNode avlNode72 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode74 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode75 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode72, avlNode74);
        system.testclass.AvlTree.AvlNode avlNode76 = avlNode75.right;
        avlNode64.left = avlNode75;
        system.testclass.AvlTree.AvlNode avlNode78 = avlNode64.right;
        system.testclass.AvlTree.AvlNode avlNode80 = new system.testclass.AvlTree.AvlNode();
        int int81 = avlNode80.height;
        system.testclass.AvlTree.AvlNode avlNode82 = new system.testclass.AvlTree.AvlNode();
        avlNode80.right = avlNode82;
        system.testclass.AvlTree.AvlNode avlNode85 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode85.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode88 = new system.testclass.AvlTree.AvlNode(10, avlNode80, avlNode85);
        system.testclass.AvlTree.AvlNode avlNode89 = new system.testclass.AvlTree.AvlNode((int) (short) 0, avlNode78, avlNode88);
        avlTree0.root = avlNode88;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test92() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test92");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (byte) -1);
        avlTree0.remove((int) ' ');
        avlTree0.insert((int) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test93() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test93");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode4 = new system.testclass.AvlTree.AvlNode();
        int int5 = avlNode4.height;
        system.testclass.AvlTree.AvlNode avlNode6 = new system.testclass.AvlTree.AvlNode();
        avlNode4.right = avlNode6;
        avlNode4.element = 100;
        system.testclass.AvlTree.AvlNode avlNode12 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode12, avlNode14);
        system.testclass.AvlTree.AvlNode avlNode16 = avlNode15.right;
        avlNode4.left = avlNode15;
        system.testclass.AvlTree.AvlNode avlNode21 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode23 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode24 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode21, avlNode23);
        system.testclass.AvlTree.AvlNode avlNode26 = new system.testclass.AvlTree.AvlNode();
        int int27 = avlNode26.height;
        system.testclass.AvlTree.AvlNode avlNode28 = new system.testclass.AvlTree.AvlNode();
        avlNode26.right = avlNode28;
        system.testclass.AvlTree.AvlNode avlNode31 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode31.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode34 = new system.testclass.AvlTree.AvlNode(10, avlNode26, avlNode31);
        avlNode23.left = avlNode26;
        system.testclass.AvlTree.AvlNode avlNode38 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode40 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode41 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode38, avlNode40);
        system.testclass.AvlTree.AvlNode avlNode43 = new system.testclass.AvlTree.AvlNode();
        int int44 = avlNode43.height;
        system.testclass.AvlTree.AvlNode avlNode45 = new system.testclass.AvlTree.AvlNode();
        avlNode43.right = avlNode45;
        system.testclass.AvlTree.AvlNode avlNode48 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode48.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode51 = new system.testclass.AvlTree.AvlNode(10, avlNode43, avlNode48);
        avlNode40.left = avlNode43;
        system.testclass.AvlTree.AvlNode avlNode53 = new system.testclass.AvlTree.AvlNode((int) (short) 100, avlNode23, avlNode43);
        avlNode15.right = avlNode53;
        avlNode53.height = 1;
        avlTree0.root = avlNode53;
        int int58 = avlTree0.findMin();
        boolean boolean59 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode61 = new system.testclass.AvlTree.AvlNode();
        int int62 = avlNode61.height;
        system.testclass.AvlTree.AvlNode avlNode63 = new system.testclass.AvlTree.AvlNode();
        avlNode61.right = avlNode63;
        system.testclass.AvlTree.AvlNode avlNode66 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode66.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode69 = new system.testclass.AvlTree.AvlNode(10, avlNode61, avlNode66);
        avlNode66.element = (short) -1;
        avlNode66.height = (byte) -1;
        int int74 = avlNode66.element;
        avlTree0.root = avlNode66;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test94() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test94");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (byte) -1);
        avlTree0.remove((int) ' ');
        boolean boolean6 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode7 = avlTree0.root;
        avlTree0.insert((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test95() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test95");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove(10);
        system.testclass.AvlTree.AvlNode avlNode3 = avlTree0.root;
        avlTree0.remove((int) (short) 0);
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test96() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test96");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove(10);
        boolean boolean3 = avlTree0.isEmpty();
        boolean boolean4 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode5 = new system.testclass.AvlTree.AvlNode();
        int int6 = avlNode5.height;
        system.testclass.AvlTree.AvlNode avlNode7 = new system.testclass.AvlTree.AvlNode();
        avlNode5.right = avlNode7;
        avlNode5.element = 100;
        system.testclass.AvlTree.AvlNode avlNode11 = avlNode5.left;
        system.testclass.AvlTree avlTree12 = new system.testclass.AvlTree();
        avlTree12.remove(10);
        boolean boolean15 = avlTree12.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode17 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode18 = avlNode17.left;
        avlNode17.height = (byte) 0;
        system.testclass.AvlTree.AvlNode avlNode21 = new system.testclass.AvlTree.AvlNode();
        int int22 = avlNode21.height;
        system.testclass.AvlTree.AvlNode avlNode23 = new system.testclass.AvlTree.AvlNode();
        avlNode21.right = avlNode23;
        avlNode21.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode27 = avlNode21.right;
        avlNode17.right = avlNode21;
        avlTree12.root = avlNode17;
        avlNode5.right = avlNode17;
        avlNode5.element = 100;
        avlTree0.root = avlNode5;
        boolean boolean34 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode36 = new system.testclass.AvlTree.AvlNode(10);
        system.testclass.AvlTree.AvlNode avlNode37 = new system.testclass.AvlTree.AvlNode();
        int int38 = avlNode37.height;
        system.testclass.AvlTree.AvlNode avlNode39 = new system.testclass.AvlTree.AvlNode();
        avlNode37.right = avlNode39;
        avlNode37.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode43 = avlNode37.right;
        system.testclass.AvlTree.AvlNode avlNode44 = new system.testclass.AvlTree.AvlNode();
        int int45 = avlNode44.height;
        system.testclass.AvlTree.AvlNode avlNode46 = new system.testclass.AvlTree.AvlNode();
        avlNode44.right = avlNode46;
        avlNode44.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode50 = avlNode44.right;
        avlNode43.right = avlNode44;
        avlNode44.height = (short) 0;
        avlNode36.right = avlNode44;
        avlTree0.root = avlNode36;
        avlTree0.insert((int) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test97() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test97");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        avlTree0.remove((int) (short) 0);
        avlTree0.remove(0);
        avlTree0.remove((-1));
        system.testclass.AvlTree.AvlNode avlNode8 = new system.testclass.AvlTree.AvlNode();
        int int9 = avlNode8.height;
        system.testclass.AvlTree.AvlNode avlNode10 = new system.testclass.AvlTree.AvlNode();
        avlNode8.right = avlNode10;
        avlTree0.root = avlNode10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test98() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test98");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove(97);
        avlTree0.remove((int) '#');
        avlTree0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }

    @Test
    public void test99() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test99");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove((int) '#');
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) (byte) 10);
        boolean boolean9 = avlTree0.isEmpty();
        avlTree0.remove((int) (short) 100);
        system.testclass.AvlTree.AvlNode avlNode12 = new system.testclass.AvlTree.AvlNode();
        int int13 = avlNode12.height;
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode();
        avlNode12.right = avlNode14;
        avlNode12.element = 'a';
        avlTree0.root = avlNode12;
        boolean boolean19 = avlTree0.isEmpty();
        avlTree0.insert((int) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for avlTree0", avlTree0.repOK_1());
    }
}

