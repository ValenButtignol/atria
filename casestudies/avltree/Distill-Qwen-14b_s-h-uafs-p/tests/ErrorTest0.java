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
        avlTree0.remove(0);
        boolean boolean3 = avlTree0.property();
        boolean boolean4 = avlTree0.isEmpty();
        boolean boolean5 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode7 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        system.classfixer.classes.AvlTree.AvlNode avlNode9 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        avlNode7.right = avlNode9;
        system.classfixer.classes.AvlTree.AvlNode avlNode12 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        avlNode12.height = 0;
        avlNode9.right = avlNode12;
        avlTree0.root = avlNode9;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for avlTree0", avlTree0.property_2());
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        boolean boolean1 = avlTree0.property();
        avlTree0.insert(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode4 = avlTree0.root;
        boolean boolean5 = avlTree0.property();
        system.classfixer.classes.AvlTree.AvlNode avlNode7 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 1);
        int int8 = avlNode7.element;
        avlTree0.root = avlNode7;
        boolean boolean10 = avlTree0.repOK();
        boolean boolean11 = avlTree0.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode14 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        system.classfixer.classes.AvlTree.AvlNode avlNode16 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        system.classfixer.classes.AvlTree.AvlNode avlNode18 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        avlNode16.right = avlNode18;
        system.classfixer.classes.AvlTree.AvlNode avlNode20 = new system.classfixer.classes.AvlTree.AvlNode(0, avlNode14, avlNode16);
        avlTree0.root = avlNode20;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for avlTree0", avlTree0.property_2());
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        boolean boolean1 = avlTree0.property();
        avlTree0.remove((int) (byte) 10);
        system.classfixer.classes.AvlTree.AvlNode avlNode4 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode7 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 1);
        int int8 = avlNode7.element;
        system.classfixer.classes.AvlTree.AvlNode avlNode9 = new system.classfixer.classes.AvlTree.AvlNode();
        system.classfixer.classes.AvlTree.AvlNode avlNode10 = new system.classfixer.classes.AvlTree.AvlNode((int) '4', avlNode7, avlNode9);
        system.classfixer.classes.AvlTree.AvlNode avlNode11 = avlNode10.right;
        system.classfixer.classes.AvlTree.AvlNode avlNode12 = avlNode11.right;
        avlTree0.root = avlNode11;
        system.classfixer.classes.AvlTree.AvlNode avlNode16 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 1);
        int int17 = avlNode16.element;
        system.classfixer.classes.AvlTree avlTree18 = new system.classfixer.classes.AvlTree();
        boolean boolean19 = avlTree18.property();
        avlTree18.insert(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode22 = avlTree18.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode24 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        system.classfixer.classes.AvlTree.AvlNode avlNode26 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        avlNode24.right = avlNode26;
        system.classfixer.classes.AvlTree.AvlNode avlNode29 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        avlNode26.left = avlNode29;
        avlTree18.root = avlNode26;
        avlNode16.left = avlNode26;
        system.classfixer.classes.AvlTree.AvlNode avlNode34 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        system.classfixer.classes.AvlTree.AvlNode avlNode36 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        avlNode34.right = avlNode36;
        system.classfixer.classes.AvlTree.AvlNode avlNode39 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        avlNode39.height = 0;
        avlNode36.right = avlNode39;
        system.classfixer.classes.AvlTree.AvlNode avlNode43 = new system.classfixer.classes.AvlTree.AvlNode(1, avlNode26, avlNode39);
        avlTree0.root = avlNode43;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for avlTree0", avlTree0.property_2());
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.remove(0);
        boolean boolean3 = avlTree0.property();
        boolean boolean4 = avlTree0.isEmpty();
        boolean boolean5 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode11 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        system.classfixer.classes.AvlTree.AvlNode avlNode13 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        avlNode11.right = avlNode13;
        system.classfixer.classes.AvlTree.AvlNode avlNode16 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10);
        int int17 = avlNode16.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode18 = new system.classfixer.classes.AvlTree.AvlNode(52, avlNode11, avlNode16);
        system.classfixer.classes.AvlTree.AvlNode avlNode19 = avlNode18.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode21 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) -1);
        system.classfixer.classes.AvlTree.AvlNode avlNode22 = new system.classfixer.classes.AvlTree.AvlNode((int) ' ', avlNode18, avlNode21);
        system.classfixer.classes.AvlTree.AvlNode avlNode25 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        system.classfixer.classes.AvlTree.AvlNode avlNode27 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        avlNode25.right = avlNode27;
        system.classfixer.classes.AvlTree.AvlNode avlNode30 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10);
        int int31 = avlNode30.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode32 = new system.classfixer.classes.AvlTree.AvlNode(52, avlNode25, avlNode30);
        system.classfixer.classes.AvlTree.AvlNode avlNode33 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 0, avlNode18, avlNode32);
        system.classfixer.classes.AvlTree.AvlNode avlNode35 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        system.classfixer.classes.AvlTree.AvlNode avlNode37 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        avlNode35.right = avlNode37;
        int int39 = avlNode37.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode40 = avlNode37.right;
        avlNode37.height = 10;
        system.classfixer.classes.AvlTree.AvlNode avlNode44 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) -1);
        avlNode37.left = avlNode44;
        system.classfixer.classes.AvlTree.AvlNode avlNode46 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 10, avlNode33, avlNode37);
        avlTree0.root = avlNode33;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for avlTree0", avlTree0.property_2());
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        boolean boolean1 = avlTree0.property();
        avlTree0.insert(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode4 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode6 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        system.classfixer.classes.AvlTree.AvlNode avlNode8 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        avlNode6.right = avlNode8;
        system.classfixer.classes.AvlTree.AvlNode avlNode11 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        avlNode8.left = avlNode11;
        avlTree0.root = avlNode8;
        boolean boolean14 = avlTree0.isEmpty();
        avlTree0.insert(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for avlTree0", avlTree0.property_2());
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        boolean boolean1 = avlTree0.property();
        avlTree0.insert(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode4 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode6 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        system.classfixer.classes.AvlTree.AvlNode avlNode8 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        avlNode6.right = avlNode8;
        system.classfixer.classes.AvlTree.AvlNode avlNode11 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        avlNode8.left = avlNode11;
        avlTree0.root = avlNode8;
        system.classfixer.classes.AvlTree.AvlNode avlNode15 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 1);
        system.classfixer.classes.AvlTree.AvlNode avlNode16 = new system.classfixer.classes.AvlTree.AvlNode();
        avlNode15.right = avlNode16;
        int int18 = avlNode15.element;
        avlNode15.element = 52;
        avlTree0.root = avlNode15;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for avlTree0", avlTree0.property_2());
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        boolean boolean1 = avlTree0.property();
        avlTree0.insert(0);
        boolean boolean4 = avlTree0.property();
        boolean boolean5 = avlTree0.property();
        system.classfixer.classes.AvlTree.AvlNode avlNode7 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 1);
        int int8 = avlNode7.element;
        system.classfixer.classes.AvlTree avlTree9 = new system.classfixer.classes.AvlTree();
        boolean boolean10 = avlTree9.property();
        avlTree9.insert(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode13 = avlTree9.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode15 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        system.classfixer.classes.AvlTree.AvlNode avlNode17 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        avlNode15.right = avlNode17;
        system.classfixer.classes.AvlTree.AvlNode avlNode20 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        avlNode17.left = avlNode20;
        avlTree9.root = avlNode17;
        avlNode7.left = avlNode17;
        avlTree0.root = avlNode7;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for avlTree0", avlTree0.property_2());
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.remove((int) (short) 100);
        boolean boolean3 = avlTree0.repOK();
        system.classfixer.classes.AvlTree avlTree4 = new system.classfixer.classes.AvlTree();
        avlTree4.remove(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode8 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        system.classfixer.classes.AvlTree.AvlNode avlNode10 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        avlNode8.right = avlNode10;
        avlNode10.height = (byte) 100;
        avlTree4.root = avlNode10;
        system.classfixer.classes.AvlTree.AvlNode avlNode16 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        system.classfixer.classes.AvlTree.AvlNode avlNode18 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        avlNode16.right = avlNode18;
        int int20 = avlNode18.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode21 = avlNode18.right;
        avlNode18.height = 10;
        avlNode18.element = 1;
        avlNode10.left = avlNode18;
        system.classfixer.classes.AvlTree.AvlNode avlNode28 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        system.classfixer.classes.AvlTree.AvlNode avlNode30 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        avlNode28.right = avlNode30;
        system.classfixer.classes.AvlTree.AvlNode avlNode33 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        avlNode30.left = avlNode33;
        avlNode30.element = (byte) 10;
        system.classfixer.classes.AvlTree.AvlNode avlNode37 = avlNode30.left;
        avlNode18.left = avlNode37;
        avlTree0.root = avlNode18;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for avlTree0", avlTree0.property_2());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        boolean boolean1 = avlTree0.property();
        avlTree0.insert(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode4 = avlTree0.root;
        boolean boolean5 = avlTree0.property();
        system.classfixer.classes.AvlTree.AvlNode avlNode7 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 1);
        int int8 = avlNode7.element;
        avlTree0.root = avlNode7;
        avlTree0.remove(10);
        boolean boolean12 = avlTree0.isEmpty();
        boolean boolean13 = avlTree0.repOK();
        boolean boolean14 = avlTree0.property();
        system.classfixer.classes.AvlTree.AvlNode avlNode20 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        system.classfixer.classes.AvlTree.AvlNode avlNode22 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        avlNode20.right = avlNode22;
        system.classfixer.classes.AvlTree.AvlNode avlNode25 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10);
        int int26 = avlNode25.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode27 = new system.classfixer.classes.AvlTree.AvlNode(52, avlNode20, avlNode25);
        system.classfixer.classes.AvlTree.AvlNode avlNode28 = avlNode27.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode30 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) -1);
        system.classfixer.classes.AvlTree.AvlNode avlNode31 = new system.classfixer.classes.AvlTree.AvlNode((int) ' ', avlNode27, avlNode30);
        system.classfixer.classes.AvlTree.AvlNode avlNode34 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        system.classfixer.classes.AvlTree.AvlNode avlNode36 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        avlNode34.right = avlNode36;
        system.classfixer.classes.AvlTree.AvlNode avlNode39 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10);
        int int40 = avlNode39.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode41 = new system.classfixer.classes.AvlTree.AvlNode(52, avlNode34, avlNode39);
        system.classfixer.classes.AvlTree.AvlNode avlNode42 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 0, avlNode27, avlNode41);
        system.classfixer.classes.AvlTree.AvlNode avlNode44 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 1);
        system.classfixer.classes.AvlTree.AvlNode avlNode45 = new system.classfixer.classes.AvlTree.AvlNode();
        avlNode44.right = avlNode45;
        system.classfixer.classes.AvlTree.AvlNode avlNode48 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        system.classfixer.classes.AvlTree.AvlNode avlNode50 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        avlNode48.right = avlNode50;
        system.classfixer.classes.AvlTree.AvlNode avlNode53 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        avlNode50.left = avlNode53;
        avlNode50.element = (byte) 10;
        avlNode45.right = avlNode50;
        system.classfixer.classes.AvlTree.AvlNode avlNode58 = avlNode45.left;
        system.classfixer.classes.AvlTree.AvlNode avlNode59 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) -1, avlNode27, avlNode45);
        system.classfixer.classes.AvlTree.AvlNode avlNode61 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        system.classfixer.classes.AvlTree.AvlNode avlNode63 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        avlNode61.right = avlNode63;
        system.classfixer.classes.AvlTree.AvlNode avlNode66 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        avlNode63.left = avlNode66;
        system.classfixer.classes.AvlTree.AvlNode avlNode68 = avlNode63.left;
        system.classfixer.classes.AvlTree avlTree69 = new system.classfixer.classes.AvlTree();
        avlTree69.remove(0);
        boolean boolean72 = avlTree69.property();
        boolean boolean73 = avlTree69.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode75 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10);
        int int76 = avlNode75.height;
        avlTree69.root = avlNode75;
        int int78 = avlTree69.findMin();
        system.classfixer.classes.AvlTree.AvlNode avlNode80 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 1);
        int int81 = avlNode80.height;
        int int82 = avlNode80.height;
        int int83 = avlNode80.height;
        avlTree69.root = avlNode80;
        avlNode63.right = avlNode80;
        avlNode27.left = avlNode63;
        avlTree0.root = avlNode27;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for avlTree0", avlTree0.property_2());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        boolean boolean1 = avlTree0.property();
        avlTree0.insert(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode4 = avlTree0.root;
        system.classfixer.classes.AvlTree.AvlNode avlNode6 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        system.classfixer.classes.AvlTree.AvlNode avlNode8 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        avlNode6.right = avlNode8;
        system.classfixer.classes.AvlTree.AvlNode avlNode11 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        avlNode8.left = avlNode11;
        avlTree0.root = avlNode8;
        boolean boolean14 = avlTree0.repOK();
        avlTree0.insert((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for avlTree0", avlTree0.property_2());
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        boolean boolean1 = avlTree0.property();
        avlTree0.insert(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode4 = avlTree0.root;
        boolean boolean5 = avlTree0.property();
        boolean boolean6 = avlTree0.repOK();
        system.classfixer.classes.AvlTree.AvlNode avlNode9 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        int int10 = avlNode9.element;
        system.classfixer.classes.AvlTree.AvlNode avlNode12 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        system.classfixer.classes.AvlTree.AvlNode avlNode14 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        avlNode12.right = avlNode14;
        system.classfixer.classes.AvlTree.AvlNode avlNode17 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        avlNode14.left = avlNode17;
        avlNode14.element = (byte) 10;
        system.classfixer.classes.AvlTree.AvlNode avlNode21 = new system.classfixer.classes.AvlTree.AvlNode((-1), avlNode9, avlNode14);
        avlTree0.root = avlNode21;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for avlTree0", avlTree0.property_2());
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        boolean boolean1 = avlTree0.property();
        avlTree0.insert(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode4 = avlTree0.root;
        boolean boolean5 = avlTree0.property();
        system.classfixer.classes.AvlTree.AvlNode avlNode7 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 1);
        int int8 = avlNode7.element;
        avlTree0.root = avlNode7;
        boolean boolean10 = avlTree0.repOK();
        avlTree0.remove((int) '4');
        int int13 = avlTree0.findMin();
        system.classfixer.classes.AvlTree.AvlNode avlNode17 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 1);
        int int18 = avlNode17.element;
        system.classfixer.classes.AvlTree.AvlNode avlNode19 = new system.classfixer.classes.AvlTree.AvlNode();
        system.classfixer.classes.AvlTree.AvlNode avlNode20 = new system.classfixer.classes.AvlTree.AvlNode((int) '4', avlNode17, avlNode19);
        system.classfixer.classes.AvlTree.AvlNode avlNode21 = avlNode17.right;
        system.classfixer.classes.AvlTree avlTree22 = new system.classfixer.classes.AvlTree();
        boolean boolean23 = avlTree22.property();
        avlTree22.insert(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode26 = avlTree22.root;
        boolean boolean27 = avlTree22.property();
        system.classfixer.classes.AvlTree.AvlNode avlNode29 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 1);
        int int30 = avlNode29.element;
        avlTree22.root = avlNode29;
        avlTree22.remove(10);
        boolean boolean34 = avlTree22.repOK();
        boolean boolean35 = avlTree22.property();
        system.classfixer.classes.AvlTree.AvlNode avlNode38 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 1);
        int int39 = avlNode38.element;
        system.classfixer.classes.AvlTree.AvlNode avlNode40 = new system.classfixer.classes.AvlTree.AvlNode();
        system.classfixer.classes.AvlTree.AvlNode avlNode41 = new system.classfixer.classes.AvlTree.AvlNode((int) '4', avlNode38, avlNode40);
        system.classfixer.classes.AvlTree.AvlNode avlNode44 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        system.classfixer.classes.AvlTree.AvlNode avlNode46 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        avlNode44.right = avlNode46;
        system.classfixer.classes.AvlTree.AvlNode avlNode49 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10);
        int int50 = avlNode49.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode51 = new system.classfixer.classes.AvlTree.AvlNode(52, avlNode44, avlNode49);
        avlNode41.right = avlNode49;
        system.classfixer.classes.AvlTree.AvlNode avlNode54 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        system.classfixer.classes.AvlTree.AvlNode avlNode56 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        avlNode54.right = avlNode56;
        system.classfixer.classes.AvlTree.AvlNode avlNode59 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        avlNode56.left = avlNode59;
        avlNode59.element = 1;
        avlNode49.left = avlNode59;
        avlTree22.root = avlNode49;
        system.classfixer.classes.AvlTree.AvlNode avlNode65 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) -1, avlNode17, avlNode49);
        avlTree0.root = avlNode65;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for avlTree0", avlTree0.property_2());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        system.classfixer.classes.AvlTree avlTree0 = new system.classfixer.classes.AvlTree();
        avlTree0.remove(0);
        boolean boolean3 = avlTree0.property();
        boolean boolean4 = avlTree0.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode6 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10);
        int int7 = avlNode6.height;
        avlTree0.root = avlNode6;
        int int9 = avlTree0.findMin();
        system.classfixer.classes.AvlTree.AvlNode avlNode11 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 1);
        int int12 = avlNode11.height;
        int int13 = avlNode11.height;
        int int14 = avlNode11.height;
        avlTree0.root = avlNode11;
        system.classfixer.classes.AvlTree.AvlNode avlNode16 = avlTree0.root;
        avlTree0.insert((int) '4');
        system.classfixer.classes.AvlTree avlTree19 = new system.classfixer.classes.AvlTree();
        boolean boolean20 = avlTree19.property();
        avlTree19.insert(0);
        system.classfixer.classes.AvlTree.AvlNode avlNode23 = avlTree19.root;
        boolean boolean24 = avlTree19.property();
        system.classfixer.classes.AvlTree.AvlNode avlNode26 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 1);
        int int27 = avlNode26.element;
        avlTree19.root = avlNode26;
        boolean boolean29 = avlTree19.repOK();
        boolean boolean30 = avlTree19.repOK();
        boolean boolean31 = avlTree19.property();
        avlTree19.remove(0);
        boolean boolean34 = avlTree19.isEmpty();
        system.classfixer.classes.AvlTree.AvlNode avlNode35 = new system.classfixer.classes.AvlTree.AvlNode();
        avlNode35.height = (byte) 100;
        avlTree19.root = avlNode35;
        avlNode35.height = 0;
        system.classfixer.classes.AvlTree.AvlNode avlNode44 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        system.classfixer.classes.AvlTree.AvlNode avlNode46 = new system.classfixer.classes.AvlTree.AvlNode((int) '4');
        avlNode44.right = avlNode46;
        system.classfixer.classes.AvlTree.AvlNode avlNode49 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 10);
        int int50 = avlNode49.height;
        system.classfixer.classes.AvlTree.AvlNode avlNode51 = new system.classfixer.classes.AvlTree.AvlNode(52, avlNode44, avlNode49);
        avlNode49.height = (short) 100;
        system.classfixer.classes.AvlTree.AvlNode avlNode56 = new system.classfixer.classes.AvlTree.AvlNode((int) (byte) 1);
        int int57 = avlNode56.element;
        system.classfixer.classes.AvlTree.AvlNode avlNode58 = new system.classfixer.classes.AvlTree.AvlNode();
        system.classfixer.classes.AvlTree.AvlNode avlNode59 = new system.classfixer.classes.AvlTree.AvlNode((int) '4', avlNode56, avlNode58);
        system.classfixer.classes.AvlTree.AvlNode avlNode60 = new system.classfixer.classes.AvlTree.AvlNode((int) (short) 100, avlNode49, avlNode59);
        avlNode35.right = avlNode59;
        avlTree0.root = avlNode35;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for avlTree0", avlTree0.property_2());
    }
}

