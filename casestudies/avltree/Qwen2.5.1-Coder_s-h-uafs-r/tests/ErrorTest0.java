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
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.insert(1);
        int int3 = avlTree0.findMin();
        boolean boolean4 = avlTree0.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode8 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode9 = avlNode8.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode10 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode11 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode8, avlNode10);
        avlTree0.root = avlNode11;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.insert(1);
        int int3 = avlTree0.findMin();
        boolean boolean4 = avlTree0.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode8 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode9 = avlNode8.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode10 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode11 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode8, avlNode10);
        int int12 = avlNode11.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode14 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode11.right = avlNode14;
        avlNode14.element = '4';
        system.classfixer.classes.AvlTree.AvlNode avlNode20 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode21 = avlNode20.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode22 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode23 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode20, avlNode22);
        int int24 = avlNode23.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode26 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode23.right = avlNode26;
        system.classfixer.classes.AvlTree.AvlNode avlNode29 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode23.right = avlNode29;
        system.classfixer.classes.AvlTree.AvlNode avlNode31 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) -1, avlNode14, avlNode23);
        avlTree0.root = avlNode23;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.insert(1);
        int int3 = avlTree0.findMin();
        boolean boolean4 = avlTree0.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode5 = avlTree0.root;
        boolean boolean6 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode7 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode10 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode11 = avlNode10.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode12 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode13 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode10, avlNode12);
        avlTree0.root = avlNode13;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.insert(1);
        int int3 = avlTree0.findMin();
        boolean boolean4 = avlTree0.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode5 = avlTree0.root;
        boolean boolean6 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode7 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode8 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode10 = new system.classfixer.classes.AvlTree.AvlNode();
        system.classfixer.classes.AvlTree avlTree12 = new system.classfixer.classes.AvlTree();
        avlTree12.insert(1);
        int int15 = avlTree12.findMin();
        boolean boolean16 = avlTree12.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode17 = avlTree12.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode19 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode20 = avlNode19.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode21 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode17, avlNode20);
        system.classfixer.classes.AvlTree.AvlNode avlNode22 = avlNode17.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode23 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 100, avlNode10, avlNode17);
        system.classfixer.classes.AvlTree.AvlNode avlNode26 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode27 = avlNode26.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode28 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode29 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode26, avlNode28);
        int int30 = avlNode29.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode32 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode29.right = avlNode32;
        avlNode32.element = '4';
        avlNode10.left = avlNode32;
        avlTree0.root = avlNode10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = null;
        avlTree0.root = avlNode1;
        system.classfixer.classes.AvlTree.AvlNode avlNode3 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode7 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode8 = avlNode7.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode9 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode10 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode7, avlNode9);
        int int11 = avlNode10.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode13 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode10.right = avlNode13;
        avlNode13.element = '4';
        system.classfixer.classes.AvlTree.AvlNode avlNode19 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode20 = avlNode19.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode21 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode22 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode19, avlNode21);
        int int23 = avlNode22.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode25 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode22.right = avlNode25;
        system.classfixer.classes.AvlTree.AvlNode avlNode28 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode22.right = avlNode28;
        system.classfixer.classes.AvlTree.AvlNode avlNode30 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) -1, avlNode13, avlNode22);
        system.classfixer.classes.AvlTree.AvlNode avlNode32 = new system.classfixer.classes.AvlTree.AvlNode(0);
        int int33 = avlNode32.element;
        avlNode22.left = avlNode32;
        avlTree0.root = avlNode22;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode2 = null;
        avlTree0.root = avlNode2;
        system.classfixer.classes.AvlTree.AvlNode avlNode7 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode8 = avlNode7.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode9 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode10 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode7, avlNode9);
        int int11 = avlNode10.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode13 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode10.right = avlNode13;
        avlNode13.element = '4';
        system.classfixer.classes.AvlTree.AvlNode avlNode19 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode20 = avlNode19.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode21 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode22 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode19, avlNode21);
        int int23 = avlNode22.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode25 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode22.right = avlNode25;
        system.classfixer.classes.AvlTree.AvlNode avlNode28 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode22.right = avlNode28;
        system.classfixer.classes.AvlTree.AvlNode avlNode30 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) -1, avlNode13, avlNode22);
        system.classfixer.classes.AvlTree.AvlNode avlNode32 = new system.classfixer.classes.AvlTree.AvlNode(0);
        int int33 = avlNode32.element;
        avlNode22.left = avlNode32;
        avlNode22.element = (byte) -1;
        avlTree0.root = avlNode22;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.insert(1);
        int int3 = avlTree0.findMin();
        boolean boolean4 = avlTree0.repOK();
        int int5 = avlTree0.findMin();
        system.classfixer.classes.AvlTree.AvlNode avlNode6 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode8 = new system.classfixer.classes.AvlTree.AvlNode();
        system.classfixer.classes.AvlTree avlTree10 = new system.classfixer.classes.AvlTree();
        avlTree10.insert(1);
        int int13 = avlTree10.findMin();
        boolean boolean14 = avlTree10.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode15 = avlTree10.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode17 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode18 = avlNode17.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode19 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode15, avlNode18);
        system.classfixer.classes.AvlTree.AvlNode avlNode20 = avlNode15.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode21 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 100, avlNode8, avlNode15);
        system.classfixer.classes.AvlTree.AvlNode avlNode24 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode25 = avlNode24.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode26 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode27 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode24, avlNode26);
        int int28 = avlNode27.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode30 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode27.right = avlNode30;
        avlNode30.element = '4';
        avlNode8.left = avlNode30;
        system.classfixer.classes.AvlTree avlTree35 = new system.classfixer.classes.AvlTree();
        avlTree35.insert(1);
        int int38 = avlTree35.findMin();
        boolean boolean39 = avlTree35.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode40 = avlTree35.root;
        boolean boolean41 = avlTree35.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode42 = avlTree35.root;
        int int43 = avlNode42.element;
        avlNode30.right = avlNode42;
        avlTree0.root = avlNode30;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.insert(1);
        int int3 = avlTree0.findMin();
        avlTree0.insert((int) '4');
        avlTree0.remove((int) '#');
        int int8 = avlTree0.findMin();
        system.classfixer.classes.AvlTree.AvlNode avlNode11 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode12 = avlNode11.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode13 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode14 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode11, avlNode13);
        int int15 = avlNode14.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode17 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode14.right = avlNode17;
        system.classfixer.classes.AvlTree.AvlNode avlNode20 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode14.right = avlNode20;
        avlTree0.root = avlNode14;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode6 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode7 = avlNode6.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode8 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode9 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode6, avlNode8);
        system.classfixer.classes.AvlTree.AvlNode avlNode12 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode13 = avlNode12.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode14 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode15 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode12, avlNode14);
        system.classfixer.classes.AvlTree.AvlNode avlNode16 = new system.classfixer.classes.AvlTree.AvlNode((int) 'a', avlNode9, avlNode12);
        system.classfixer.classes.AvlTree.AvlNode avlNode19 = new system.classfixer.classes.AvlTree.AvlNode(100);
        system.classfixer.classes.AvlTree avlTree20 = new system.classfixer.classes.AvlTree();
        avlTree20.insert(1);
        int int23 = avlTree20.findMin();
        boolean boolean24 = avlTree20.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode25 = avlTree20.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode26 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 100, avlNode19, avlNode25);
        system.classfixer.classes.AvlTree.AvlNode avlNode28 = new system.classfixer.classes.AvlTree.AvlNode();
        system.classfixer.classes.AvlTree avlTree30 = new system.classfixer.classes.AvlTree();
        avlTree30.insert(1);
        int int33 = avlTree30.findMin();
        boolean boolean34 = avlTree30.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode35 = avlTree30.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode37 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode38 = avlNode37.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode39 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode35, avlNode38);
        system.classfixer.classes.AvlTree.AvlNode avlNode40 = avlNode35.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode41 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 100, avlNode28, avlNode35);
        avlNode28.element = (short) 1;
        avlNode19.right = avlNode28;
        system.classfixer.classes.AvlTree.AvlNode avlNode45 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) -1, avlNode9, avlNode19);
        int int46 = avlNode45.element;
        avlTree0.root = avlNode45;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.insert(1);
        int int3 = avlTree0.findMin();
        boolean boolean4 = avlTree0.isEmpty();
        int int5 = avlTree0.findMin();
        system.classfixer.classes.AvlTree.AvlNode avlNode10 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode11 = avlNode10.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode12 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode13 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode10, avlNode12);
        int int14 = avlNode13.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode16 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode13.right = avlNode16;
        avlNode16.element = '4';
        system.classfixer.classes.AvlTree.AvlNode avlNode22 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode23 = avlNode22.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode24 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode25 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode22, avlNode24);
        int int26 = avlNode25.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode28 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode25.right = avlNode28;
        system.classfixer.classes.AvlTree.AvlNode avlNode31 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode25.right = avlNode31;
        system.classfixer.classes.AvlTree.AvlNode avlNode33 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) -1, avlNode16, avlNode25);
        avlNode25.height = (byte) 1;
        system.classfixer.classes.AvlTree.AvlNode avlNode37 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode38 = new system.classfixer.classes.AvlTree.AvlNode((int) ' ', avlNode25, avlNode37);
        system.classfixer.classes.AvlTree.AvlNode avlNode39 = avlNode37.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode41 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode42 = avlNode41.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode47 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode48 = avlNode47.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode49 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode50 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode47, avlNode49);
        system.classfixer.classes.AvlTree.AvlNode avlNode53 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode54 = avlNode53.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode55 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode56 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode53, avlNode55);
        system.classfixer.classes.AvlTree.AvlNode avlNode57 = new system.classfixer.classes.AvlTree.AvlNode((int) 'a', avlNode50, avlNode53);
        system.classfixer.classes.AvlTree.AvlNode avlNode60 = new system.classfixer.classes.AvlTree.AvlNode(100);
        system.classfixer.classes.AvlTree avlTree61 = new system.classfixer.classes.AvlTree();
        avlTree61.insert(1);
        int int64 = avlTree61.findMin();
        boolean boolean65 = avlTree61.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode66 = avlTree61.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode67 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 100, avlNode60, avlNode66);
        system.classfixer.classes.AvlTree.AvlNode avlNode69 = new system.classfixer.classes.AvlTree.AvlNode();
        system.classfixer.classes.AvlTree avlTree71 = new system.classfixer.classes.AvlTree();
        avlTree71.insert(1);
        int int74 = avlTree71.findMin();
        boolean boolean75 = avlTree71.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode76 = avlTree71.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode78 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode79 = avlNode78.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode80 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode76, avlNode79);
        system.classfixer.classes.AvlTree.AvlNode avlNode81 = avlNode76.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode82 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 100, avlNode69, avlNode76);
        avlNode69.element = (short) 1;
        avlNode60.right = avlNode69;
        system.classfixer.classes.AvlTree.AvlNode avlNode86 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) -1, avlNode50, avlNode60);
        avlNode41.left = avlNode60;
        avlNode37.left = avlNode60;
        avlTree0.root = avlNode37;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.insert(1);
        int int3 = avlTree0.findMin();
        boolean boolean4 = avlTree0.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode5 = avlTree0.root;
        boolean boolean6 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode7 = avlTree0.root;
        avlTree0.insert((int) (byte) 0);
        avlTree0.remove(0);
        boolean boolean12 = avlTree0.repOK();
        int int13 = avlTree0.findMin();
        avlTree0.insert((int) (byte) 1);
        system.classfixer.classes.AvlTree.AvlNode avlNode19 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode20 = avlNode19.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode21 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode22 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode19, avlNode21);
        int int23 = avlNode22.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode25 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode22.right = avlNode25;
        avlNode25.element = '4';
        system.classfixer.classes.AvlTree.AvlNode avlNode31 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode32 = avlNode31.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode33 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode34 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode31, avlNode33);
        int int35 = avlNode34.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode37 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode34.right = avlNode37;
        system.classfixer.classes.AvlTree.AvlNode avlNode40 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode34.right = avlNode40;
        system.classfixer.classes.AvlTree.AvlNode avlNode42 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) -1, avlNode25, avlNode34);
        system.classfixer.classes.AvlTree.AvlNode avlNode44 = new system.classfixer.classes.AvlTree.AvlNode(0);
        int int45 = avlNode44.element;
        avlNode34.left = avlNode44;
        avlNode34.element = (byte) -1;
        system.classfixer.classes.AvlTree.AvlNode avlNode49 = avlNode34.left;
        int int50 = avlNode49.height;
        system.classfixer.classes.AvlTree avlTree53 = new system.classfixer.classes.AvlTree();
        avlTree53.insert(1);
        int int56 = avlTree53.findMin();
        boolean boolean57 = avlTree53.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode58 = avlTree53.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode60 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode61 = avlNode60.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode62 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode58, avlNode61);
        system.classfixer.classes.AvlTree.AvlNode avlNode65 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode66 = avlNode65.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode67 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode68 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode65, avlNode67);
        int int69 = avlNode68.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode71 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode68.right = avlNode71;
        system.classfixer.classes.AvlTree.AvlNode avlNode74 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode68.right = avlNode74;
        system.classfixer.classes.AvlTree.AvlNode avlNode78 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode79 = avlNode78.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode80 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode81 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode78, avlNode80);
        system.classfixer.classes.AvlTree.AvlNode avlNode82 = avlNode78.right;
        avlNode68.right = avlNode78;
        system.classfixer.classes.AvlTree.AvlNode avlNode84 = new system.classfixer.classes.AvlTree.AvlNode(100, avlNode62, avlNode78);
        avlNode49.left = avlNode62;
        avlTree0.root = avlNode49;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.insert(1);
        int int3 = avlTree0.findMin();
        boolean boolean4 = avlTree0.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode5 = avlTree0.root;
        boolean boolean6 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode7 = avlTree0.root;
        avlTree0.insert((int) (byte) 0);
        avlTree0.remove(0);
        avlTree0.remove((int) (byte) -1);
        boolean boolean14 = avlTree0.isEmpty();
        boolean boolean15 = avlTree0.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode17 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 100);
        system.classfixer.classes.AvlTree.AvlNode avlNode19 = new system.classfixer.classes.AvlTree.AvlNode((int) 'a');
        avlNode19.element = (-1);
        avlNode17.right = avlNode19;
        avlTree0.root = avlNode17;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.insert(1);
        int int3 = avlTree0.findMin();
        boolean boolean4 = avlTree0.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode5 = avlTree0.root;
        boolean boolean6 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode7 = avlTree0.root;
        avlTree0.insert((int) (byte) 0);
        avlTree0.remove(0);
        avlTree0.remove((int) (byte) -1);
        system.classfixer.classes.AvlTree avlTree15 = new system.classfixer.classes.AvlTree();
        avlTree15.insert(1);
        int int18 = avlTree15.findMin();
        boolean boolean19 = avlTree15.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode20 = avlTree15.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode22 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode23 = avlNode22.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode24 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode20, avlNode23);
        avlNode24.element = (short) 0;
        avlTree0.root = avlNode24;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = null;
        avlTree0.root = avlNode1;
        system.classfixer.classes.AvlTree.AvlNode avlNode7 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode8 = avlNode7.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode9 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode10 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode7, avlNode9);
        system.classfixer.classes.AvlTree.AvlNode avlNode13 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode14 = avlNode13.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode15 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode16 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode13, avlNode15);
        system.classfixer.classes.AvlTree.AvlNode avlNode17 = new system.classfixer.classes.AvlTree.AvlNode((int) 'a', avlNode10, avlNode13);
        system.classfixer.classes.AvlTree.AvlNode avlNode20 = new system.classfixer.classes.AvlTree.AvlNode(100);
        system.classfixer.classes.AvlTree avlTree21 = new system.classfixer.classes.AvlTree();
        avlTree21.insert(1);
        int int24 = avlTree21.findMin();
        boolean boolean25 = avlTree21.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode26 = avlTree21.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode27 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 100, avlNode20, avlNode26);
        system.classfixer.classes.AvlTree.AvlNode avlNode29 = new system.classfixer.classes.AvlTree.AvlNode();
        system.classfixer.classes.AvlTree avlTree31 = new system.classfixer.classes.AvlTree();
        avlTree31.insert(1);
        int int34 = avlTree31.findMin();
        boolean boolean35 = avlTree31.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode36 = avlTree31.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode38 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode39 = avlNode38.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode40 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode36, avlNode39);
        system.classfixer.classes.AvlTree.AvlNode avlNode41 = avlNode36.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode42 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 100, avlNode29, avlNode36);
        avlNode29.element = (short) 1;
        avlNode20.right = avlNode29;
        system.classfixer.classes.AvlTree.AvlNode avlNode46 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) -1, avlNode10, avlNode20);
        avlTree0.root = avlNode20;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode3 = new system.classfixer.classes.AvlTree.AvlNode(100);
        system.classfixer.classes.AvlTree avlTree4 = new system.classfixer.classes.AvlTree();
        avlTree4.insert(1);
        int int7 = avlTree4.findMin();
        boolean boolean8 = avlTree4.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode9 = avlTree4.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode10 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 100, avlNode3, avlNode9);
        avlTree0.root = avlNode3;
        avlTree0.remove((int) (short) 100);
        avlTree0.insert((int) (byte) -1);
        int int16 = avlTree0.findMin();
        avlTree0.insert((int) 'a');
        avlTree0.remove(100);
        system.classfixer.classes.AvlTree.AvlNode avlNode22 = new system.classfixer.classes.AvlTree.AvlNode();
        system.classfixer.classes.AvlTree avlTree24 = new system.classfixer.classes.AvlTree();
        avlTree24.insert(1);
        int int27 = avlTree24.findMin();
        boolean boolean28 = avlTree24.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode29 = avlTree24.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode31 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode32 = avlNode31.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode33 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode29, avlNode32);
        system.classfixer.classes.AvlTree.AvlNode avlNode34 = avlNode29.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode35 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 100, avlNode22, avlNode29);
        system.classfixer.classes.AvlTree.AvlNode avlNode38 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode39 = avlNode38.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode40 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode41 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode38, avlNode40);
        int int42 = avlNode41.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode44 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode41.right = avlNode44;
        avlNode44.element = '4';
        avlNode22.left = avlNode44;
        system.classfixer.classes.AvlTree.AvlNode avlNode49 = avlNode22.left;
        int int50 = avlNode22.element;
        avlTree0.root = avlNode22;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.insert(1);
        int int3 = avlTree0.findMin();
        boolean boolean4 = avlTree0.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode5 = avlTree0.root;
        boolean boolean6 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode7 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode8 = avlTree0.root;
        int int9 = avlTree0.findMin();
        system.classfixer.classes.AvlTree.AvlNode avlNode12 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 1);
        system.classfixer.classes.AvlTree.AvlNode avlNode15 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode16 = avlNode15.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode17 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode18 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode15, avlNode17);
        system.classfixer.classes.AvlTree.AvlNode avlNode19 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode12, avlNode15);
        avlTree0.root = avlNode19;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        system.classfixer.classes.AvlTree.AvlNode avlNode1 = null;
        avlTree0.root = avlNode1;
        system.classfixer.classes.AvlTree.AvlNode avlNode8 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode9 = avlNode8.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode10 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode11 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode8, avlNode10);
        int int12 = avlNode11.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode14 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode11.right = avlNode14;
        avlNode14.element = '4';
        system.classfixer.classes.AvlTree.AvlNode avlNode20 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode21 = avlNode20.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode22 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode23 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode20, avlNode22);
        int int24 = avlNode23.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode26 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode23.right = avlNode26;
        system.classfixer.classes.AvlTree.AvlNode avlNode29 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode23.right = avlNode29;
        system.classfixer.classes.AvlTree.AvlNode avlNode31 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) -1, avlNode14, avlNode23);
        avlNode23.element = '#';
        avlNode23.height = ' ';
        system.classfixer.classes.AvlTree.AvlNode avlNode39 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode40 = avlNode39.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode41 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode42 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode39, avlNode41);
        int int43 = avlNode42.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode45 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode42.right = avlNode45;
        avlNode45.element = '4';
        system.classfixer.classes.AvlTree.AvlNode avlNode51 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode52 = avlNode51.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode53 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode54 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode51, avlNode53);
        int int55 = avlNode54.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode57 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode54.right = avlNode57;
        system.classfixer.classes.AvlTree.AvlNode avlNode60 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode54.right = avlNode60;
        system.classfixer.classes.AvlTree.AvlNode avlNode62 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) -1, avlNode45, avlNode54);
        avlNode54.element = '#';
        avlNode54.height = ' ';
        system.classfixer.classes.AvlTree.AvlNode avlNode67 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 1, avlNode23, avlNode54);
        system.classfixer.classes.AvlTree avlTree68 = new system.classfixer.classes.AvlTree();
        avlTree68.insert(1);
        int int71 = avlTree68.findMin();
        boolean boolean72 = avlTree68.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode73 = avlTree68.root;
        boolean boolean74 = avlTree68.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode75 = avlTree68.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode76 = avlTree68.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode77 = new system.classfixer.classes.AvlTree.AvlNode(1, avlNode67, avlNode76);
        int int78 = avlNode67.height;
        avlTree0.root = avlNode67;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.insert(1);
        int int3 = avlTree0.findMin();
        boolean boolean4 = avlTree0.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode5 = avlTree0.root;
        boolean boolean6 = avlTree0.isEmpty();
        int int7 = avlTree0.findMin();
        boolean boolean8 = avlTree0.repOK();
        avlTree0.insert(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode12 = new system.classfixer.classes.AvlTree.AvlNode();
        system.classfixer.classes.AvlTree avlTree14 = new system.classfixer.classes.AvlTree();
        avlTree14.insert(1);
        int int17 = avlTree14.findMin();
        boolean boolean18 = avlTree14.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode19 = avlTree14.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode21 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode22 = avlNode21.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode23 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode19, avlNode22);
        system.classfixer.classes.AvlTree.AvlNode avlNode24 = avlNode19.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode25 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 100, avlNode12, avlNode19);
        avlNode25.element = '4';
        avlTree0.root = avlNode25;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.insert(1);
        int int3 = avlTree0.findMin();
        boolean boolean4 = avlTree0.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode5 = avlTree0.root;
        boolean boolean6 = avlTree0.isEmpty();
        int int7 = avlTree0.findMin();
        boolean boolean8 = avlTree0.repOK();
        avlTree0.insert((int) (byte) 0);
        avlTree0.remove((int) (byte) -1);
        system.classfixer.classes.AvlTree.AvlNode avlNode17 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode18 = avlNode17.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode19 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode20 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode17, avlNode19);
        system.classfixer.classes.AvlTree.AvlNode avlNode23 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode24 = avlNode23.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode25 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode26 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode23, avlNode25);
        system.classfixer.classes.AvlTree.AvlNode avlNode27 = new system.classfixer.classes.AvlTree.AvlNode((int) 'a', avlNode20, avlNode23);
        system.classfixer.classes.AvlTree.AvlNode avlNode30 = new system.classfixer.classes.AvlTree.AvlNode(100);
        system.classfixer.classes.AvlTree avlTree31 = new system.classfixer.classes.AvlTree();
        avlTree31.insert(1);
        int int34 = avlTree31.findMin();
        boolean boolean35 = avlTree31.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode36 = avlTree31.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode37 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 100, avlNode30, avlNode36);
        system.classfixer.classes.AvlTree.AvlNode avlNode39 = new system.classfixer.classes.AvlTree.AvlNode();
        system.classfixer.classes.AvlTree avlTree41 = new system.classfixer.classes.AvlTree();
        avlTree41.insert(1);
        int int44 = avlTree41.findMin();
        boolean boolean45 = avlTree41.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode46 = avlTree41.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode48 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode49 = avlNode48.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode50 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode46, avlNode49);
        system.classfixer.classes.AvlTree.AvlNode avlNode51 = avlNode46.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode52 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 100, avlNode39, avlNode46);
        avlNode39.element = (short) 1;
        avlNode30.right = avlNode39;
        system.classfixer.classes.AvlTree.AvlNode avlNode56 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) -1, avlNode20, avlNode30);
        system.classfixer.classes.AvlTree avlTree58 = new system.classfixer.classes.AvlTree();
        avlTree58.insert(1);
        int int61 = avlTree58.findMin();
        boolean boolean62 = avlTree58.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode63 = avlTree58.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode65 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode66 = avlNode65.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode67 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode63, avlNode66);
        system.classfixer.classes.AvlTree.AvlNode avlNode68 = avlNode63.left;
        system.classfixer.classes.AvlTree avlTree69 = new system.classfixer.classes.AvlTree();
        avlTree69.insert(1);
        int int72 = avlTree69.findMin();
        boolean boolean73 = avlTree69.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode74 = avlTree69.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode75 = avlNode74.right;
        avlNode63.left = avlNode74;
        avlNode56.left = avlNode63;
        avlTree0.root = avlNode63;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.insert(1);
        int int3 = avlTree0.findMin();
        boolean boolean4 = avlTree0.isEmpty();
        avlTree0.insert(1);
        boolean boolean7 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode10 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode11 = avlNode10.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode12 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode13 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode10, avlNode12);
        int int14 = avlNode13.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode16 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode13.right = avlNode16;
        system.classfixer.classes.AvlTree.AvlNode avlNode19 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode13.right = avlNode19;
        avlTree0.root = avlNode13;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.insert(1);
        int int3 = avlTree0.findMin();
        boolean boolean4 = avlTree0.isEmpty();
        int int5 = avlTree0.findMin();
        avlTree0.remove((int) (short) 1);
        avlTree0.remove((int) '#');
        boolean boolean10 = avlTree0.isEmpty();
        avlTree0.insert((int) (byte) 100);
        system.classfixer.classes.AvlTree.AvlNode avlNode16 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode17 = avlNode16.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode18 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode19 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode16, avlNode18);
        system.classfixer.classes.AvlTree.AvlNode avlNode22 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode23 = avlNode22.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode24 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode25 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode22, avlNode24);
        system.classfixer.classes.AvlTree.AvlNode avlNode26 = new system.classfixer.classes.AvlTree.AvlNode((int) 'a', avlNode19, avlNode22);
        avlTree0.root = avlNode19;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.insert(1);
        system.classfixer.classes.AvlTree.AvlNode avlNode4 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlTree0.root = avlNode4;
        system.classfixer.classes.AvlTree avlTree8 = new system.classfixer.classes.AvlTree();
        avlTree8.insert(1);
        int int11 = avlTree8.findMin();
        boolean boolean12 = avlTree8.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode13 = avlTree8.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode15 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode16 = avlNode15.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode17 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10, avlNode13, avlNode16);
        system.classfixer.classes.AvlTree.AvlNode avlNode18 = avlNode13.left;
        system.classfixer.classes.AvlTree avlTree19 = new system.classfixer.classes.AvlTree();
        avlTree19.insert(1);
        int int22 = avlTree19.findMin();
        boolean boolean23 = avlTree19.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode24 = avlTree19.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode25 = avlNode24.right;
        avlNode13.left = avlNode24;
        system.classfixer.classes.AvlTree.AvlNode avlNode30 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode31 = avlNode30.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode32 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode33 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode30, avlNode32);
        int int34 = avlNode33.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode36 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode33.right = avlNode36;
        avlNode36.element = '4';
        system.classfixer.classes.AvlTree.AvlNode avlNode42 = new system.classfixer.classes.AvlTree.AvlNode(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode43 = avlNode42.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode44 = null;
        system.classfixer.classes.AvlTree.AvlNode avlNode45 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode42, avlNode44);
        int int46 = avlNode45.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode48 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode45.right = avlNode48;
        system.classfixer.classes.AvlTree.AvlNode avlNode51 = new system.classfixer.classes.AvlTree.AvlNode(100);
        avlNode45.right = avlNode51;
        system.classfixer.classes.AvlTree.AvlNode avlNode53 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) -1, avlNode36, avlNode45);
        system.classfixer.classes.AvlTree.AvlNode avlNode54 = new system.classfixer.classes.AvlTree.AvlNode(100, avlNode24, avlNode36);
        int int55 = avlNode54.element;
        avlTree0.root = avlNode54;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for avlTree0", avlTree0.repOK_2());
    }
}

