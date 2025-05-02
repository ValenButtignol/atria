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
        boolean boolean1 = avlTree0.property_4();
        boolean boolean2 = avlTree0.isEmpty();
        boolean boolean3 = avlTree0.property_4();
        system.testclass.AvlTree.AvlNode avlNode4 = avlTree0.root;
        boolean boolean5 = avlTree0.composedRepOK();
        system.testclass.AvlTree.AvlNode avlNode8 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode10 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode8.right = avlNode10;
        int int12 = avlNode10.height;
        system.testclass.AvlTree.AvlNode avlNode13 = avlNode10.left;
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode15.height = 0;
        system.testclass.AvlTree.AvlNode avlNode18 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode10, avlNode15);
        avlTree0.root = avlNode18;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for avlTree0", avlTree0.property_5());
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode3 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode5 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode3.right = avlNode5;
        int int7 = avlNode5.height;
        system.testclass.AvlTree.AvlNode avlNode8 = avlNode5.left;
        system.testclass.AvlTree.AvlNode avlNode10 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode10.height = 0;
        system.testclass.AvlTree.AvlNode avlNode13 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode5, avlNode10);
        avlTree0.root = avlNode13;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for avlTree0", avlTree0.property_5());
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_4();
        system.testclass.AvlTree.AvlNode avlNode2 = avlTree0.root;
        boolean boolean3 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode7 = new system.testclass.AvlTree.AvlNode((int) (short) 10);
        system.testclass.AvlTree.AvlNode avlNode10 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode12 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode12.right = avlNode14;
        system.testclass.AvlTree.AvlNode avlNode16 = new system.testclass.AvlTree.AvlNode(0, avlNode10, avlNode12);
        avlNode7.right = avlNode10;
        avlNode7.element = (byte) 10;
        system.testclass.AvlTree.AvlNode avlNode21 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode23 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode21.right = avlNode23;
        system.testclass.AvlTree.AvlNode avlNode26 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode23.left = avlNode26;
        int int28 = avlNode23.height;
        int int29 = avlNode23.height;
        system.testclass.AvlTree.AvlNode avlNode30 = new system.testclass.AvlTree.AvlNode((int) '4', avlNode7, avlNode23);
        system.testclass.AvlTree.AvlNode avlNode33 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode35 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode37 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode35.right = avlNode37;
        system.testclass.AvlTree.AvlNode avlNode39 = new system.testclass.AvlTree.AvlNode(0, avlNode33, avlNode35);
        system.testclass.AvlTree.AvlNode avlNode40 = new system.testclass.AvlTree.AvlNode(100, avlNode30, avlNode33);
        avlNode33.height = '4';
        avlTree0.root = avlNode33;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for avlTree0", avlTree0.property_5());
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_4();
        boolean boolean2 = avlTree0.isEmpty();
        boolean boolean3 = avlTree0.property_4();
        system.testclass.AvlTree.AvlNode avlNode4 = avlTree0.root;
        boolean boolean5 = avlTree0.composedRepOK();
        system.testclass.AvlTree.AvlNode avlNode7 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode9 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode7.right = avlNode9;
        system.testclass.AvlTree.AvlNode avlNode12 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode12.height = 0;
        avlNode9.right = avlNode12;
        avlNode12.height = (byte) 100;
        system.testclass.AvlTree.AvlNode avlNode18 = avlNode12.left;
        avlTree0.root = avlNode12;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for avlTree0", avlTree0.property_5());
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_4();
        boolean boolean2 = avlTree0.isEmpty();
        boolean boolean3 = avlTree0.property_4();
        system.testclass.AvlTree.AvlNode avlNode4 = avlTree0.root;
        boolean boolean5 = avlTree0.composedRepOK();
        boolean boolean6 = avlTree0.property_4();
        system.testclass.AvlTree.AvlNode avlNode8 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode12 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode12.right = avlNode14;
        int int16 = avlNode14.height;
        system.testclass.AvlTree.AvlNode avlNode17 = avlNode14.left;
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode19.height = 0;
        system.testclass.AvlTree.AvlNode avlNode22 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode14, avlNode19);
        system.testclass.AvlTree.AvlNode avlNode24 = new system.testclass.AvlTree.AvlNode((int) (short) 10);
        system.testclass.AvlTree.AvlNode avlNode25 = new system.testclass.AvlTree.AvlNode((int) '4', avlNode22, avlNode24);
        avlNode8.left = avlNode24;
        avlTree0.root = avlNode8;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for avlTree0", avlTree0.property_5());
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_4();
        avlTree0.remove(52);
        avlTree0.remove((int) (byte) 1);
        avlTree0.insert((-1));
        system.testclass.AvlTree.AvlNode avlNode9 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode12 = new system.testclass.AvlTree.AvlNode((int) (short) 10);
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode17 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode17.right = avlNode19;
        system.testclass.AvlTree.AvlNode avlNode21 = new system.testclass.AvlTree.AvlNode(0, avlNode15, avlNode17);
        avlNode12.right = avlNode15;
        system.testclass.AvlTree.AvlNode avlNode26 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode28 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode26.right = avlNode28;
        system.testclass.AvlTree.AvlNode avlNode32 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode34 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode32.right = avlNode34;
        int int36 = avlNode34.height;
        system.testclass.AvlTree.AvlNode avlNode37 = avlNode34.left;
        system.testclass.AvlTree.AvlNode avlNode39 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode39.height = 0;
        system.testclass.AvlTree.AvlNode avlNode42 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode34, avlNode39);
        int int43 = avlNode34.height;
        system.testclass.AvlTree.AvlNode avlNode44 = new system.testclass.AvlTree.AvlNode(1, avlNode26, avlNode34);
        system.testclass.AvlTree.AvlNode avlNode47 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode49 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode51 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode49.right = avlNode51;
        system.testclass.AvlTree.AvlNode avlNode53 = new system.testclass.AvlTree.AvlNode(0, avlNode47, avlNode49);
        system.testclass.AvlTree.AvlNode avlNode54 = new system.testclass.AvlTree.AvlNode((int) (short) 0, avlNode44, avlNode53);
        avlNode44.height = 0;
        system.testclass.AvlTree.AvlNode avlNode57 = new system.testclass.AvlTree.AvlNode((-1), avlNode12, avlNode44);
        avlNode9.right = avlNode44;
        system.testclass.AvlTree.AvlNode avlNode61 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode63 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode61.right = avlNode63;
        system.testclass.AvlTree.AvlNode avlNode67 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode69 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode67.right = avlNode69;
        int int71 = avlNode69.height;
        system.testclass.AvlTree.AvlNode avlNode72 = avlNode69.left;
        system.testclass.AvlTree.AvlNode avlNode74 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode74.height = 0;
        system.testclass.AvlTree.AvlNode avlNode77 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode69, avlNode74);
        int int78 = avlNode69.height;
        system.testclass.AvlTree.AvlNode avlNode79 = new system.testclass.AvlTree.AvlNode(1, avlNode61, avlNode69);
        system.testclass.AvlTree.AvlNode avlNode80 = new system.testclass.AvlTree.AvlNode((int) '#', avlNode44, avlNode79);
        avlTree0.root = avlNode80;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for avlTree0", avlTree0.property_5());
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode3 = new system.testclass.AvlTree.AvlNode((int) (byte) 1);
        avlTree0.root = avlNode3;
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode10 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode12 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode10.right = avlNode12;
        int int14 = avlNode12.height;
        system.testclass.AvlTree.AvlNode avlNode15 = avlNode12.left;
        system.testclass.AvlTree.AvlNode avlNode17 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode17.height = 0;
        system.testclass.AvlTree.AvlNode avlNode20 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode12, avlNode17);
        system.testclass.AvlTree.AvlNode avlNode22 = new system.testclass.AvlTree.AvlNode((int) (short) 10);
        system.testclass.AvlTree.AvlNode avlNode23 = new system.testclass.AvlTree.AvlNode((int) '4', avlNode20, avlNode22);
        system.testclass.AvlTree.AvlNode avlNode26 = new system.testclass.AvlTree.AvlNode((int) (short) 10);
        system.testclass.AvlTree.AvlNode avlNode29 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode31 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode33 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode31.right = avlNode33;
        system.testclass.AvlTree.AvlNode avlNode35 = new system.testclass.AvlTree.AvlNode(0, avlNode29, avlNode31);
        avlNode26.right = avlNode29;
        avlNode26.element = (byte) 10;
        system.testclass.AvlTree.AvlNode avlNode40 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode42 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode40.right = avlNode42;
        system.testclass.AvlTree.AvlNode avlNode45 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode42.left = avlNode45;
        int int47 = avlNode42.height;
        int int48 = avlNode42.height;
        system.testclass.AvlTree.AvlNode avlNode49 = new system.testclass.AvlTree.AvlNode((int) '4', avlNode26, avlNode42);
        avlNode23.right = avlNode49;
        system.testclass.AvlTree.AvlNode avlNode52 = new system.testclass.AvlTree.AvlNode((int) (short) 100);
        system.testclass.AvlTree.AvlNode avlNode53 = new system.testclass.AvlTree.AvlNode(52, avlNode49, avlNode52);
        int int54 = avlNode49.height;
        avlTree0.root = avlNode49;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for avlTree0", avlTree0.property_5());
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        avlTree0.insert((int) (short) 10);
        boolean boolean4 = avlTree0.isEmpty();
        int int5 = avlTree0.findMin();
        boolean boolean6 = avlTree0.property_4();
        system.testclass.AvlTree.AvlNode avlNode9 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode9.right = avlNode11;
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode14.height = 0;
        avlNode11.right = avlNode14;
        system.testclass.AvlTree.AvlNode avlNode18 = avlNode11.right;
        system.testclass.AvlTree.AvlNode avlNode22 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode24 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode26 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode24.right = avlNode26;
        system.testclass.AvlTree.AvlNode avlNode28 = new system.testclass.AvlTree.AvlNode(0, avlNode22, avlNode24);
        system.testclass.AvlTree.AvlNode avlNode29 = avlNode24.right;
        system.testclass.AvlTree.AvlNode avlNode32 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode34 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode36 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode34.right = avlNode36;
        system.testclass.AvlTree.AvlNode avlNode38 = new system.testclass.AvlTree.AvlNode(0, avlNode32, avlNode34);
        system.testclass.AvlTree.AvlNode avlNode39 = new system.testclass.AvlTree.AvlNode((int) (short) 0, avlNode29, avlNode38);
        system.testclass.AvlTree.AvlNode avlNode40 = new system.testclass.AvlTree.AvlNode((int) (byte) 10, avlNode11, avlNode29);
        avlTree0.root = avlNode40;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for avlTree0", avlTree0.property_5());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        avlTree0.insert((int) (short) 10);
        boolean boolean4 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode9 = new system.testclass.AvlTree.AvlNode((int) (short) 10);
        system.testclass.AvlTree.AvlNode avlNode12 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode16 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode14.right = avlNode16;
        system.testclass.AvlTree.AvlNode avlNode18 = new system.testclass.AvlTree.AvlNode(0, avlNode12, avlNode14);
        avlNode9.right = avlNode12;
        avlNode9.element = (byte) 10;
        system.testclass.AvlTree.AvlNode avlNode23 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode25 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode23.right = avlNode25;
        system.testclass.AvlTree.AvlNode avlNode28 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode25.left = avlNode28;
        int int30 = avlNode25.height;
        int int31 = avlNode25.height;
        system.testclass.AvlTree.AvlNode avlNode32 = new system.testclass.AvlTree.AvlNode((int) '4', avlNode9, avlNode25);
        avlTree0.root = avlNode32;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for avlTree0", avlTree0.property_5());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        avlTree0.insert((int) (short) 10);
        avlTree0.remove(0);
        avlTree0.remove((int) (short) 0);
        system.testclass.AvlTree avlTree8 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode9 = avlTree8.root;
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode((int) (byte) 1);
        avlTree8.root = avlNode11;
        avlTree0.root = avlNode11;
        system.testclass.AvlTree.AvlNode avlNode16 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode18 = new system.testclass.AvlTree.AvlNode((int) (short) 10);
        system.testclass.AvlTree.AvlNode avlNode21 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode23 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode25 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode23.right = avlNode25;
        system.testclass.AvlTree.AvlNode avlNode27 = new system.testclass.AvlTree.AvlNode(0, avlNode21, avlNode23);
        avlNode18.right = avlNode21;
        avlNode16.right = avlNode18;
        system.testclass.AvlTree.AvlNode avlNode31 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode33 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode31.right = avlNode33;
        system.testclass.AvlTree.AvlNode avlNode36 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode36.height = 0;
        avlNode33.right = avlNode36;
        system.testclass.AvlTree.AvlNode avlNode40 = new system.testclass.AvlTree.AvlNode(0, avlNode18, avlNode33);
        avlTree0.root = avlNode33;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for avlTree0", avlTree0.property_5());
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_4();
        avlTree0.remove((int) (byte) 1);
        boolean boolean4 = avlTree0.composedRepOK();
        boolean boolean5 = avlTree0.composedRepOK();
        boolean boolean6 = avlTree0.composedRepOK();
        avlTree0.insert((int) (short) 1);
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode13 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode11.right = avlNode13;
        system.testclass.AvlTree.AvlNode avlNode16 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode16.height = 0;
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode(0, avlNode11, avlNode16);
        system.testclass.AvlTree.AvlNode avlNode21 = new system.testclass.AvlTree.AvlNode((int) (short) 100);
        system.testclass.AvlTree.AvlNode avlNode22 = avlNode21.right;
        avlNode19.right = avlNode22;
        avlNode19.height = ' ';
        avlTree0.root = avlNode19;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for avlTree0", avlTree0.property_5());
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_4();
        avlTree0.remove((int) (byte) 1);
        boolean boolean4 = avlTree0.composedRepOK();
        avlTree0.remove(52);
        avlTree0.insert((int) (short) 10);
        boolean boolean9 = avlTree0.property_4();
        boolean boolean10 = avlTree0.property_4();
        system.testclass.AvlTree.AvlNode avlNode12 = new system.testclass.AvlTree.AvlNode((int) '4');
        int int13 = avlNode12.element;
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode17 = new system.testclass.AvlTree.AvlNode((int) (short) 10);
        system.testclass.AvlTree.AvlNode avlNode20 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode22 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode24 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode22.right = avlNode24;
        system.testclass.AvlTree.AvlNode avlNode26 = new system.testclass.AvlTree.AvlNode(0, avlNode20, avlNode22);
        avlNode17.right = avlNode20;
        avlNode15.right = avlNode17;
        avlNode12.right = avlNode15;
        avlTree0.root = avlNode15;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for avlTree0", avlTree0.property_5());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_4();
        boolean boolean2 = avlTree0.isEmpty();
        boolean boolean3 = avlTree0.property_4();
        boolean boolean4 = avlTree0.composedRepOK();
        system.testclass.AvlTree.AvlNode avlNode6 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode8 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode6.right = avlNode8;
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode8.left = avlNode11;
        int int13 = avlNode8.height;
        int int14 = avlNode8.height;
        system.testclass.AvlTree.AvlNode avlNode17 = new system.testclass.AvlTree.AvlNode((int) (short) 10);
        system.testclass.AvlTree.AvlNode avlNode20 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode22 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode24 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode22.right = avlNode24;
        system.testclass.AvlTree.AvlNode avlNode26 = new system.testclass.AvlTree.AvlNode(0, avlNode20, avlNode22);
        avlNode17.right = avlNode20;
        system.testclass.AvlTree.AvlNode avlNode31 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode33 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode31.right = avlNode33;
        system.testclass.AvlTree.AvlNode avlNode37 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode39 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode37.right = avlNode39;
        int int41 = avlNode39.height;
        system.testclass.AvlTree.AvlNode avlNode42 = avlNode39.left;
        system.testclass.AvlTree.AvlNode avlNode44 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode44.height = 0;
        system.testclass.AvlTree.AvlNode avlNode47 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode39, avlNode44);
        int int48 = avlNode39.height;
        system.testclass.AvlTree.AvlNode avlNode49 = new system.testclass.AvlTree.AvlNode(1, avlNode31, avlNode39);
        system.testclass.AvlTree.AvlNode avlNode52 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode54 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode56 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode54.right = avlNode56;
        system.testclass.AvlTree.AvlNode avlNode58 = new system.testclass.AvlTree.AvlNode(0, avlNode52, avlNode54);
        system.testclass.AvlTree.AvlNode avlNode59 = new system.testclass.AvlTree.AvlNode((int) (short) 0, avlNode49, avlNode58);
        avlNode49.height = 0;
        system.testclass.AvlTree.AvlNode avlNode62 = new system.testclass.AvlTree.AvlNode((-1), avlNode17, avlNode49);
        avlNode8.right = avlNode62;
        avlTree0.root = avlNode62;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for avlTree0", avlTree0.property_5());
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        avlTree0.insert((int) (short) 10);
        boolean boolean4 = avlTree0.composedRepOK();
        system.testclass.AvlTree.AvlNode avlNode6 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode8 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode6.right = avlNode8;
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode11.height = 0;
        avlNode8.right = avlNode11;
        avlNode8.height = '#';
        avlTree0.root = avlNode8;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for avlTree0", avlTree0.property_5());
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_4();
        system.testclass.AvlTree.AvlNode avlNode2 = avlTree0.root;
        boolean boolean3 = avlTree0.isEmpty();
        boolean boolean4 = avlTree0.property_4();
        system.testclass.AvlTree.AvlNode avlNode6 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode8 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode6.right = avlNode8;
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode8.left = avlNode11;
        system.testclass.AvlTree.AvlNode avlNode13 = avlNode8.left;
        avlTree0.root = avlNode8;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for avlTree0", avlTree0.property_5());
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode1 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode3 = new system.testclass.AvlTree.AvlNode((int) (byte) 1);
        avlTree0.root = avlNode3;
        boolean boolean5 = avlTree0.property_4();
        boolean boolean6 = avlTree0.property_4();
        boolean boolean7 = avlTree0.property_4();
        system.testclass.AvlTree.AvlNode avlNode12 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode12.right = avlNode14;
        int int16 = avlNode14.height;
        system.testclass.AvlTree.AvlNode avlNode17 = avlNode14.left;
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode19.height = 0;
        system.testclass.AvlTree.AvlNode avlNode22 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode14, avlNode19);
        system.testclass.AvlTree.AvlNode avlNode24 = new system.testclass.AvlTree.AvlNode((int) (short) 10);
        system.testclass.AvlTree.AvlNode avlNode25 = new system.testclass.AvlTree.AvlNode((int) '4', avlNode22, avlNode24);
        system.testclass.AvlTree.AvlNode avlNode28 = new system.testclass.AvlTree.AvlNode((int) (short) 10);
        system.testclass.AvlTree.AvlNode avlNode31 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode33 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode35 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode33.right = avlNode35;
        system.testclass.AvlTree.AvlNode avlNode37 = new system.testclass.AvlTree.AvlNode(0, avlNode31, avlNode33);
        avlNode28.right = avlNode31;
        avlNode28.element = (byte) 10;
        system.testclass.AvlTree.AvlNode avlNode42 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode44 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode42.right = avlNode44;
        system.testclass.AvlTree.AvlNode avlNode47 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode44.left = avlNode47;
        int int49 = avlNode44.height;
        int int50 = avlNode44.height;
        system.testclass.AvlTree.AvlNode avlNode51 = new system.testclass.AvlTree.AvlNode((int) '4', avlNode28, avlNode44);
        avlNode25.right = avlNode51;
        system.testclass.AvlTree.AvlNode avlNode54 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode54.height = 0;
        system.testclass.AvlTree.AvlNode avlNode59 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode61 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode63 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode61.right = avlNode63;
        system.testclass.AvlTree.AvlNode avlNode65 = new system.testclass.AvlTree.AvlNode(0, avlNode59, avlNode61);
        system.testclass.AvlTree.AvlNode avlNode66 = avlNode61.right;
        avlNode54.left = avlNode61;
        system.testclass.AvlTree.AvlNode avlNode68 = new system.testclass.AvlTree.AvlNode((int) 'a', avlNode51, avlNode61);
        avlTree0.root = avlNode51;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for avlTree0", avlTree0.property_5());
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_4();
        avlTree0.remove((int) (byte) 1);
        boolean boolean4 = avlTree0.composedRepOK();
        boolean boolean5 = avlTree0.composedRepOK();
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
        system.testclass.AvlTree.AvlNode avlNode35 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode37 = new system.testclass.AvlTree.AvlNode((int) (short) 10);
        system.testclass.AvlTree.AvlNode avlNode40 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode42 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode44 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode42.right = avlNode44;
        system.testclass.AvlTree.AvlNode avlNode46 = new system.testclass.AvlTree.AvlNode(0, avlNode40, avlNode42);
        avlNode37.right = avlNode40;
        avlNode35.right = avlNode37;
        avlNode37.height = (short) 0;
        int int51 = avlNode37.height;
        avlNode11.right = avlNode37;
        avlTree0.root = avlNode11;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for avlTree0", avlTree0.property_5());
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        avlTree0.insert((int) (short) 10);
        avlTree0.remove((int) (byte) -1);
        int int6 = avlTree0.findMin();
        system.testclass.AvlTree.AvlNode avlNode9 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode13 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode11.right = avlNode13;
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode(0, avlNode9, avlNode11);
        system.testclass.AvlTree.AvlNode avlNode16 = avlNode11.right;
        avlTree0.root = avlNode16;
        system.testclass.AvlTree.AvlNode avlNode20 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode22 = new system.testclass.AvlTree.AvlNode((int) (short) 10);
        system.testclass.AvlTree.AvlNode avlNode25 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode27 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode29 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode27.right = avlNode29;
        system.testclass.AvlTree.AvlNode avlNode31 = new system.testclass.AvlTree.AvlNode(0, avlNode25, avlNode27);
        avlNode22.right = avlNode25;
        avlNode20.right = avlNode22;
        system.testclass.AvlTree.AvlNode avlNode35 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode37 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode35.right = avlNode37;
        system.testclass.AvlTree.AvlNode avlNode40 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode40.height = 0;
        avlNode37.right = avlNode40;
        system.testclass.AvlTree.AvlNode avlNode44 = new system.testclass.AvlTree.AvlNode(0, avlNode22, avlNode37);
        system.testclass.AvlTree.AvlNode avlNode46 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode48 = new system.testclass.AvlTree.AvlNode((int) (short) 10);
        system.testclass.AvlTree.AvlNode avlNode51 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode53 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode55 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode53.right = avlNode55;
        system.testclass.AvlTree.AvlNode avlNode57 = new system.testclass.AvlTree.AvlNode(0, avlNode51, avlNode53);
        avlNode48.right = avlNode51;
        avlNode46.right = avlNode48;
        avlNode48.height = (short) 0;
        int int62 = avlNode48.height;
        avlNode22.right = avlNode48;
        avlTree0.root = avlNode48;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for avlTree0", avlTree0.property_5());
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_4();
        avlTree0.remove((int) (byte) 1);
        boolean boolean4 = avlTree0.composedRepOK();
        avlTree0.remove(52);
        avlTree0.insert((int) (short) 10);
        boolean boolean9 = avlTree0.property_4();
        boolean boolean10 = avlTree0.property_4();
        int int11 = avlTree0.findMin();
        system.testclass.AvlTree.AvlNode avlNode13 = new system.testclass.AvlTree.AvlNode((int) (short) 10);
        system.testclass.AvlTree.AvlNode avlNode16 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode18 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode20 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode18.right = avlNode20;
        system.testclass.AvlTree.AvlNode avlNode22 = new system.testclass.AvlTree.AvlNode(0, avlNode16, avlNode18);
        avlNode13.right = avlNode16;
        int int24 = avlNode13.element;
        avlTree0.root = avlNode13;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for avlTree0", avlTree0.property_5());
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_4();
        boolean boolean2 = avlTree0.isEmpty();
        boolean boolean3 = avlTree0.property_4();
        avlTree0.insert((int) (byte) 100);
        avlTree0.remove((int) '#');
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode((int) (short) 10);
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode16 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode18 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode16.right = avlNode18;
        system.testclass.AvlTree.AvlNode avlNode20 = new system.testclass.AvlTree.AvlNode(0, avlNode14, avlNode16);
        avlNode11.right = avlNode14;
        avlNode11.element = (byte) 10;
        system.testclass.AvlTree.AvlNode avlNode25 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode27 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode25.right = avlNode27;
        system.testclass.AvlTree.AvlNode avlNode30 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode27.left = avlNode30;
        int int32 = avlNode27.height;
        int int33 = avlNode27.height;
        system.testclass.AvlTree.AvlNode avlNode34 = new system.testclass.AvlTree.AvlNode((int) '4', avlNode11, avlNode27);
        system.testclass.AvlTree.AvlNode avlNode37 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode39 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode41 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode39.right = avlNode41;
        system.testclass.AvlTree.AvlNode avlNode43 = new system.testclass.AvlTree.AvlNode(0, avlNode37, avlNode39);
        system.testclass.AvlTree.AvlNode avlNode44 = new system.testclass.AvlTree.AvlNode(100, avlNode34, avlNode37);
        avlNode34.element = (short) 10;
        int int47 = avlNode34.height;
        system.testclass.AvlTree.AvlNode avlNode48 = avlNode34.right;
        int int49 = avlNode34.height;
        system.testclass.AvlTree.AvlNode avlNode50 = avlNode34.right;
        avlTree0.root = avlNode34;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for avlTree0", avlTree0.property_5());
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_4();
        avlTree0.remove(52);
        boolean boolean4 = avlTree0.property_4();
        system.testclass.AvlTree.AvlNode avlNode6 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode8 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode6.right = avlNode8;
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode11.height = 0;
        avlNode8.right = avlNode11;
        avlNode8.element = 0;
        avlNode8.height = 'a';
        avlTree0.root = avlNode8;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for avlTree0", avlTree0.property_5());
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        avlTree0.insert((int) (short) 10);
        boolean boolean4 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode5 = new system.testclass.AvlTree.AvlNode();
        avlTree0.root = avlNode5;
        int int7 = avlTree0.findMin();
        boolean boolean8 = avlTree0.property_4();
        avlTree0.insert((int) '#');
        boolean boolean11 = avlTree0.isEmpty();
        boolean boolean12 = avlTree0.isEmpty();
        int int13 = avlTree0.findMin();
        system.testclass.AvlTree.AvlNode avlNode17 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode17.right = avlNode19;
        int int21 = avlNode19.height;
        system.testclass.AvlTree.AvlNode avlNode22 = avlNode19.left;
        system.testclass.AvlTree.AvlNode avlNode24 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode24.height = 0;
        system.testclass.AvlTree.AvlNode avlNode27 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode19, avlNode24);
        system.testclass.AvlTree.AvlNode avlNode29 = new system.testclass.AvlTree.AvlNode((int) (short) 10);
        system.testclass.AvlTree.AvlNode avlNode30 = new system.testclass.AvlTree.AvlNode((int) '4', avlNode27, avlNode29);
        avlTree0.root = avlNode30;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for avlTree0", avlTree0.property_5());
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.insert((int) (byte) 10);
        system.testclass.AvlTree.AvlNode avlNode5 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode7 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode5.right = avlNode7;
        system.testclass.AvlTree.AvlNode avlNode10 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode10.height = 0;
        system.testclass.AvlTree.AvlNode avlNode13 = new system.testclass.AvlTree.AvlNode(0, avlNode5, avlNode10);
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode17 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode15.right = avlNode17;
        system.testclass.AvlTree.AvlNode avlNode20 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode17.left = avlNode20;
        avlNode10.left = avlNode17;
        avlTree0.root = avlNode10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for avlTree0", avlTree0.property_5());
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.composedRepOK();
        system.testclass.AvlTree.AvlNode avlNode4 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode6 = new system.testclass.AvlTree.AvlNode((int) (short) 10);
        system.testclass.AvlTree.AvlNode avlNode9 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode13 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode11.right = avlNode13;
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode(0, avlNode9, avlNode11);
        avlNode6.right = avlNode9;
        avlNode4.right = avlNode6;
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode21 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode19.right = avlNode21;
        system.testclass.AvlTree.AvlNode avlNode24 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode24.height = 0;
        avlNode21.right = avlNode24;
        system.testclass.AvlTree.AvlNode avlNode28 = new system.testclass.AvlTree.AvlNode(0, avlNode6, avlNode21);
        system.testclass.AvlTree.AvlNode avlNode30 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode32 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode30.right = avlNode32;
        system.testclass.AvlTree.AvlNode avlNode35 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode32.left = avlNode35;
        system.testclass.AvlTree.AvlNode avlNode37 = avlNode32.left;
        avlNode28.right = avlNode37;
        avlTree0.root = avlNode37;
        avlTree0.remove((-1));
        system.testclass.AvlTree.AvlNode avlNode45 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode47 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode49 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode47.right = avlNode49;
        system.testclass.AvlTree.AvlNode avlNode51 = new system.testclass.AvlTree.AvlNode(0, avlNode45, avlNode47);
        system.testclass.AvlTree.AvlNode avlNode52 = avlNode47.right;
        system.testclass.AvlTree.AvlNode avlNode55 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode57 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode59 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode57.right = avlNode59;
        system.testclass.AvlTree.AvlNode avlNode61 = new system.testclass.AvlTree.AvlNode(0, avlNode55, avlNode57);
        system.testclass.AvlTree.AvlNode avlNode62 = new system.testclass.AvlTree.AvlNode((int) (short) 0, avlNode52, avlNode61);
        avlTree0.root = avlNode61;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for avlTree0", avlTree0.property_5());
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.composedRepOK();
        avlTree0.remove(35);
        boolean boolean4 = avlTree0.property_4();
        system.testclass.AvlTree.AvlNode avlNode7 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode8 = avlNode7.right;
        system.testclass.AvlTree.AvlNode avlNode10 = new system.testclass.AvlTree.AvlNode((int) '4');
        int int11 = avlNode10.element;
        system.testclass.AvlTree.AvlNode avlNode13 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode((int) (short) 10);
        system.testclass.AvlTree.AvlNode avlNode18 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode20 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode22 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode20.right = avlNode22;
        system.testclass.AvlTree.AvlNode avlNode24 = new system.testclass.AvlTree.AvlNode(0, avlNode18, avlNode20);
        avlNode15.right = avlNode18;
        avlNode13.right = avlNode15;
        avlNode10.right = avlNode13;
        system.testclass.AvlTree.AvlNode avlNode28 = new system.testclass.AvlTree.AvlNode((int) ' ', avlNode8, avlNode10);
        system.testclass.AvlTree.AvlNode avlNode31 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode33 = new system.testclass.AvlTree.AvlNode((int) (short) 10);
        system.testclass.AvlTree.AvlNode avlNode36 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode38 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode40 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode38.right = avlNode40;
        system.testclass.AvlTree.AvlNode avlNode42 = new system.testclass.AvlTree.AvlNode(0, avlNode36, avlNode38);
        avlNode33.right = avlNode36;
        avlNode31.right = avlNode33;
        int int45 = avlNode31.element;
        system.testclass.AvlTree.AvlNode avlNode47 = new system.testclass.AvlTree.AvlNode((int) (byte) 0);
        avlNode47.height = (byte) 0;
        system.testclass.AvlTree.AvlNode avlNode50 = new system.testclass.AvlTree.AvlNode(10, avlNode31, avlNode47);
        system.testclass.AvlTree.AvlNode avlNode51 = new system.testclass.AvlTree.AvlNode((int) '4', avlNode10, avlNode50);
        avlTree0.root = avlNode10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for avlTree0", avlTree0.property_5());
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_4();
        boolean boolean2 = avlTree0.isEmpty();
        boolean boolean3 = avlTree0.composedRepOK();
        boolean boolean4 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode8 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode10 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode12 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode10.right = avlNode12;
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode(0, avlNode8, avlNode10);
        system.testclass.AvlTree.AvlNode avlNode15 = avlNode10.right;
        system.testclass.AvlTree.AvlNode avlNode16 = avlNode10.right;
        avlTree0.root = avlNode10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for avlTree0", avlTree0.property_5());
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.insert((int) (byte) 10);
        boolean boolean3 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode7 = new system.testclass.AvlTree.AvlNode((int) (short) 10);
        system.testclass.AvlTree.AvlNode avlNode10 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode12 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode12.right = avlNode14;
        system.testclass.AvlTree.AvlNode avlNode16 = new system.testclass.AvlTree.AvlNode(0, avlNode10, avlNode12);
        avlNode7.right = avlNode10;
        system.testclass.AvlTree.AvlNode avlNode21 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode23 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode21.right = avlNode23;
        system.testclass.AvlTree.AvlNode avlNode27 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode29 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode27.right = avlNode29;
        int int31 = avlNode29.height;
        system.testclass.AvlTree.AvlNode avlNode32 = avlNode29.left;
        system.testclass.AvlTree.AvlNode avlNode34 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode34.height = 0;
        system.testclass.AvlTree.AvlNode avlNode37 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode29, avlNode34);
        int int38 = avlNode29.height;
        system.testclass.AvlTree.AvlNode avlNode39 = new system.testclass.AvlTree.AvlNode(1, avlNode21, avlNode29);
        system.testclass.AvlTree.AvlNode avlNode42 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode44 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode46 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode44.right = avlNode46;
        system.testclass.AvlTree.AvlNode avlNode48 = new system.testclass.AvlTree.AvlNode(0, avlNode42, avlNode44);
        system.testclass.AvlTree.AvlNode avlNode49 = new system.testclass.AvlTree.AvlNode((int) (short) 0, avlNode39, avlNode48);
        avlNode39.height = 0;
        system.testclass.AvlTree.AvlNode avlNode52 = new system.testclass.AvlTree.AvlNode((-1), avlNode7, avlNode39);
        system.testclass.AvlTree.AvlNode avlNode54 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode56 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode54.right = avlNode56;
        system.testclass.AvlTree.AvlNode avlNode59 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode59.height = 0;
        avlNode56.right = avlNode59;
        avlNode59.height = (byte) 100;
        system.testclass.AvlTree.AvlNode avlNode65 = avlNode59.left;
        avlNode59.height = 1;
        system.testclass.AvlTree.AvlNode avlNode68 = new system.testclass.AvlTree.AvlNode((int) (short) 0, avlNode52, avlNode59);
        system.testclass.AvlTree.AvlNode avlNode70 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode72 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode70.right = avlNode72;
        system.testclass.AvlTree.AvlNode avlNode75 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode75.height = 0;
        avlNode72.right = avlNode75;
        system.testclass.AvlTree.AvlNode avlNode79 = avlNode75.right;
        avlNode52.right = avlNode79;
        avlTree0.root = avlNode52;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for avlTree0", avlTree0.property_5());
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_4();
        boolean boolean2 = avlTree0.isEmpty();
        boolean boolean3 = avlTree0.property_4();
        boolean boolean4 = avlTree0.isEmpty();
        avlTree0.insert((int) (short) 100);
        system.testclass.AvlTree.AvlNode avlNode10 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode12 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode10.right = avlNode12;
        int int14 = avlNode12.height;
        system.testclass.AvlTree.AvlNode avlNode15 = avlNode12.left;
        system.testclass.AvlTree.AvlNode avlNode17 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode17.height = 0;
        system.testclass.AvlTree.AvlNode avlNode20 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode12, avlNode17);
        system.testclass.AvlTree.AvlNode avlNode22 = new system.testclass.AvlTree.AvlNode((int) (short) 10);
        system.testclass.AvlTree.AvlNode avlNode23 = new system.testclass.AvlTree.AvlNode((int) '4', avlNode20, avlNode22);
        system.testclass.AvlTree.AvlNode avlNode24 = avlNode23.left;
        int int25 = avlNode23.height;
        avlTree0.root = avlNode23;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for avlTree0", avlTree0.property_5());
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.property_4();
        avlTree0.remove(52);
        avlTree0.remove((int) (byte) 1);
        avlTree0.remove((int) (byte) 1);
        avlTree0.insert((int) (byte) 10);
        system.testclass.AvlTree.AvlNode avlNode10 = avlTree0.root;
        boolean boolean11 = avlTree0.property_4();
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode16 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode14.right = avlNode16;
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode16.left = avlNode19;
        system.testclass.AvlTree.AvlNode avlNode21 = avlNode16.left;
        system.testclass.AvlTree.AvlNode avlNode24 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode26 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode24.right = avlNode26;
        system.testclass.AvlTree.AvlNode avlNode30 = new system.testclass.AvlTree.AvlNode((int) '4');
        system.testclass.AvlTree.AvlNode avlNode32 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode30.right = avlNode32;
        int int34 = avlNode32.height;
        system.testclass.AvlTree.AvlNode avlNode35 = avlNode32.left;
        system.testclass.AvlTree.AvlNode avlNode37 = new system.testclass.AvlTree.AvlNode((int) '4');
        avlNode37.height = 0;
        system.testclass.AvlTree.AvlNode avlNode40 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode32, avlNode37);
        int int41 = avlNode32.height;
        system.testclass.AvlTree.AvlNode avlNode42 = new system.testclass.AvlTree.AvlNode(1, avlNode24, avlNode32);
        avlNode21.right = avlNode32;
        system.testclass.AvlTree avlTree44 = new system.testclass.AvlTree();
        boolean boolean45 = avlTree44.isEmpty();
        avlTree44.insert((int) (short) 10);
        avlTree44.remove(0);
        avlTree44.remove((int) (short) 0);
        system.testclass.AvlTree avlTree52 = new system.testclass.AvlTree();
        system.testclass.AvlTree.AvlNode avlNode53 = avlTree52.root;
        system.testclass.AvlTree.AvlNode avlNode55 = new system.testclass.AvlTree.AvlNode((int) (byte) 1);
        avlTree52.root = avlNode55;
        avlTree44.root = avlNode55;
        system.testclass.AvlTree.AvlNode avlNode58 = new system.testclass.AvlTree.AvlNode((int) (byte) 10, avlNode21, avlNode55);
        avlTree0.root = avlNode21;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for avlTree0", avlTree0.property_5());
    }
}

