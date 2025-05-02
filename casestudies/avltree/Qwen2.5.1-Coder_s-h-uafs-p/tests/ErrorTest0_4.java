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
        system.testclass.AvlTree.AvlNode avlNode1 = new system.testclass.AvlTree.AvlNode();
        int int2 = avlNode1.height;
        system.testclass.AvlTree.AvlNode avlNode3 = new system.testclass.AvlTree.AvlNode();
        avlNode1.right = avlNode3;
        avlNode1.element = 'a';
        avlTree0.root = avlNode1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove(0);
        avlTree0.insert(100);
        system.testclass.AvlTree.AvlNode avlNode7 = new system.testclass.AvlTree.AvlNode((int) (byte) 0);
        system.testclass.AvlTree.AvlNode avlNode8 = new system.testclass.AvlTree.AvlNode();
        int int9 = avlNode8.height;
        system.testclass.AvlTree.AvlNode avlNode10 = new system.testclass.AvlTree.AvlNode();
        avlNode8.right = avlNode10;
        avlNode7.right = avlNode10;
        system.testclass.AvlTree.AvlNode avlNode13 = avlNode7.right;
        system.testclass.AvlTree avlTree14 = new system.testclass.AvlTree();
        avlTree14.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode17 = avlTree14.root;
        avlTree14.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode20 = avlTree14.root;
        avlTree14.remove((int) ' ');
        system.testclass.AvlTree.AvlNode avlNode24 = new system.testclass.AvlTree.AvlNode(1);
        avlTree14.root = avlNode24;
        avlNode13.right = avlNode24;
        avlNode24.height = (byte) -1;
        system.testclass.AvlTree.AvlNode avlNode30 = new system.testclass.AvlTree.AvlNode();
        int int31 = avlNode30.height;
        int int32 = avlNode30.height;
        system.testclass.AvlTree.AvlNode avlNode34 = new system.testclass.AvlTree.AvlNode((int) (byte) 0);
        system.testclass.AvlTree.AvlNode avlNode35 = new system.testclass.AvlTree.AvlNode();
        int int36 = avlNode35.height;
        system.testclass.AvlTree.AvlNode avlNode37 = new system.testclass.AvlTree.AvlNode();
        avlNode35.right = avlNode37;
        avlNode34.right = avlNode37;
        system.testclass.AvlTree.AvlNode avlNode40 = avlNode34.right;
        system.testclass.AvlTree avlTree41 = new system.testclass.AvlTree();
        avlTree41.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode44 = avlTree41.root;
        avlTree41.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode47 = avlTree41.root;
        avlTree41.remove((int) ' ');
        system.testclass.AvlTree.AvlNode avlNode51 = new system.testclass.AvlTree.AvlNode(1);
        avlTree41.root = avlNode51;
        avlNode40.right = avlNode51;
        avlNode30.left = avlNode51;
        system.testclass.AvlTree.AvlNode avlNode56 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode57 = avlNode56.left;
        system.testclass.AvlTree.AvlNode avlNode59 = new system.testclass.AvlTree.AvlNode(0);
        avlNode59.element = 0;
        system.testclass.AvlTree.AvlNode avlNode62 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode63 = avlNode62.left;
        int int64 = avlNode62.element;
        avlNode59.right = avlNode62;
        system.testclass.AvlTree.AvlNode avlNode66 = new system.testclass.AvlTree.AvlNode((int) (byte) 100, avlNode57, avlNode62);
        system.testclass.AvlTree.AvlNode avlNode67 = new system.testclass.AvlTree.AvlNode((int) (byte) 100, avlNode51, avlNode66);
        system.testclass.AvlTree.AvlNode avlNode68 = new system.testclass.AvlTree.AvlNode((int) (byte) 100, avlNode24, avlNode67);
        system.testclass.AvlTree.AvlNode avlNode70 = new system.testclass.AvlTree.AvlNode();
        int int71 = avlNode70.height;
        system.testclass.AvlTree.AvlNode avlNode72 = new system.testclass.AvlTree.AvlNode();
        avlNode70.right = avlNode72;
        avlNode70.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode76 = avlNode70.left;
        system.testclass.AvlTree.AvlNode avlNode78 = new system.testclass.AvlTree.AvlNode((int) (byte) 0);
        int int79 = avlNode78.height;
        system.testclass.AvlTree.AvlNode avlNode80 = new system.testclass.AvlTree.AvlNode((int) (short) 1, avlNode70, avlNode78);
        int int81 = avlNode70.element;
        avlNode67.left = avlNode70;
        avlTree0.root = avlNode67;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove(0);
        boolean boolean3 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode4 = avlTree0.root;
        boolean boolean5 = avlTree0.isEmpty();
        system.testclass.AvlTree avlTree6 = new system.testclass.AvlTree();
        avlTree6.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode9 = avlTree6.root;
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode9.left = avlNode11;
        avlTree0.root = avlNode9;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode3 = avlTree0.root;
        int int4 = avlTree0.findMin();
        avlTree0.insert((int) (short) 1);
        boolean boolean7 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode10 = new system.testclass.AvlTree.AvlNode();
        int int11 = avlNode10.height;
        system.testclass.AvlTree.AvlNode avlNode12 = null;
        avlNode10.right = avlNode12;
        int int14 = avlNode10.element;
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode();
        int int16 = avlNode15.height;
        system.testclass.AvlTree.AvlNode avlNode17 = new system.testclass.AvlTree.AvlNode();
        avlNode15.right = avlNode17;
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode((int) (byte) 100, avlNode10, avlNode15);
        system.testclass.AvlTree.AvlNode avlNode21 = new system.testclass.AvlTree.AvlNode(10);
        int int22 = avlNode21.element;
        system.testclass.AvlTree.AvlNode avlNode23 = new system.testclass.AvlTree.AvlNode((int) (byte) 100, avlNode19, avlNode21);
        avlTree0.root = avlNode23;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode3 = avlTree0.root;
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) ' ');
        boolean boolean9 = avlTree0.isEmpty();
        boolean boolean10 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode11 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode12 = new system.testclass.AvlTree.AvlNode();
        int int13 = avlNode12.height;
        system.testclass.AvlTree.AvlNode avlNode14 = null;
        avlNode12.right = avlNode14;
        int int16 = avlNode12.element;
        system.testclass.AvlTree avlTree17 = new system.testclass.AvlTree();
        avlTree17.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode20 = avlTree17.root;
        system.testclass.AvlTree.AvlNode avlNode22 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode20.left = avlNode22;
        avlNode12.right = avlNode22;
        system.testclass.AvlTree.AvlNode avlNode25 = avlNode22.left;
        avlTree0.root = avlNode22;
        system.testclass.AvlTree.AvlNode avlNode27 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode28 = new system.testclass.AvlTree.AvlNode();
        int int29 = avlNode28.height;
        system.testclass.AvlTree.AvlNode avlNode30 = new system.testclass.AvlTree.AvlNode();
        avlNode28.right = avlNode30;
        avlNode28.element = 'a';
        system.testclass.AvlTree.AvlNode avlNode34 = avlNode28.left;
        int int35 = avlNode28.height;
        avlTree0.root = avlNode28;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        boolean boolean1 = avlTree0.isEmpty();
        boolean boolean2 = avlTree0.isEmpty();
        avlTree0.remove((int) (short) 1);
        system.testclass.AvlTree.AvlNode avlNode5 = avlTree0.root;
        system.testclass.AvlTree avlTree6 = new system.testclass.AvlTree();
        avlTree6.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode9 = avlTree6.root;
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode9.left = avlNode11;
        avlTree0.root = avlNode9;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.remove(0);
        system.testclass.AvlTree.AvlNode avlNode4 = new system.testclass.AvlTree.AvlNode(10);
        int int5 = avlNode4.height;
        avlTree0.root = avlNode4;
        system.testclass.AvlTree.AvlNode avlNode9 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode10 = new system.testclass.AvlTree.AvlNode();
        int int11 = avlNode10.height;
        system.testclass.AvlTree.AvlNode avlNode12 = null;
        avlNode10.right = avlNode12;
        int int14 = avlNode10.element;
        system.testclass.AvlTree.AvlNode avlNode16 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode16.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode19 = avlNode16.left;
        avlNode10.right = avlNode16;
        avlNode9.left = avlNode10;
        system.testclass.AvlTree.AvlNode avlNode22 = avlNode10.left;
        system.testclass.AvlTree.AvlNode avlNode23 = new system.testclass.AvlTree.AvlNode();
        avlNode23.height = '4';
        avlNode10.left = avlNode23;
        system.testclass.AvlTree avlTree27 = new system.testclass.AvlTree();
        avlTree27.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode30 = avlTree27.root;
        avlTree27.remove((int) '4');
        int int33 = avlTree27.findMin();
        system.testclass.AvlTree.AvlNode avlNode34 = avlTree27.root;
        system.testclass.AvlTree.AvlNode avlNode35 = new system.testclass.AvlTree.AvlNode(1, avlNode23, avlNode34);
        avlTree0.root = avlNode35;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode3 = avlTree0.root;
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) ' ');
        system.testclass.AvlTree.AvlNode avlNode9 = new system.testclass.AvlTree.AvlNode();
        int int10 = avlNode9.height;
        system.testclass.AvlTree.AvlNode avlNode11 = null;
        avlNode9.right = avlNode11;
        system.testclass.AvlTree.AvlNode avlNode13 = avlNode9.left;
        avlTree0.root = avlNode13;
        boolean boolean15 = avlTree0.isEmpty();
        system.testclass.AvlTree avlTree16 = new system.testclass.AvlTree();
        avlTree16.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode19 = avlTree16.root;
        avlNode19.height = 'a';
        system.testclass.AvlTree.AvlNode avlNode22 = new system.testclass.AvlTree.AvlNode();
        int int23 = avlNode22.height;
        system.testclass.AvlTree.AvlNode avlNode24 = new system.testclass.AvlTree.AvlNode();
        avlNode22.right = avlNode24;
        avlNode19.left = avlNode24;
        int int27 = avlNode19.element;
        avlTree0.root = avlNode19;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode3 = avlTree0.root;
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) ' ');
        avlTree0.insert((int) (byte) 0);
        system.testclass.AvlTree.AvlNode avlNode13 = new system.testclass.AvlTree.AvlNode();
        int int14 = avlNode13.height;
        system.testclass.AvlTree.AvlNode avlNode15 = null;
        avlNode13.right = avlNode15;
        int int17 = avlNode13.element;
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode19.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode22 = avlNode19.left;
        avlNode13.right = avlNode19;
        system.testclass.AvlTree avlTree24 = new system.testclass.AvlTree();
        avlTree24.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode27 = avlTree24.root;
        avlNode27.height = 'a';
        system.testclass.AvlTree.AvlNode avlNode30 = new system.testclass.AvlTree.AvlNode();
        int int31 = avlNode30.height;
        system.testclass.AvlTree.AvlNode avlNode32 = new system.testclass.AvlTree.AvlNode();
        avlNode30.right = avlNode32;
        avlNode27.left = avlNode32;
        system.testclass.AvlTree.AvlNode avlNode35 = avlNode27.left;
        system.testclass.AvlTree.AvlNode avlNode36 = new system.testclass.AvlTree.AvlNode((int) 'a', avlNode13, avlNode35);
        system.testclass.AvlTree.AvlNode avlNode37 = avlNode13.right;
        system.testclass.AvlTree.AvlNode avlNode39 = new system.testclass.AvlTree.AvlNode();
        int int40 = avlNode39.height;
        int int41 = avlNode39.height;
        system.testclass.AvlTree.AvlNode avlNode43 = new system.testclass.AvlTree.AvlNode((int) (byte) 0);
        system.testclass.AvlTree.AvlNode avlNode44 = new system.testclass.AvlTree.AvlNode();
        int int45 = avlNode44.height;
        system.testclass.AvlTree.AvlNode avlNode46 = new system.testclass.AvlTree.AvlNode();
        avlNode44.right = avlNode46;
        avlNode43.right = avlNode46;
        system.testclass.AvlTree.AvlNode avlNode49 = avlNode43.right;
        system.testclass.AvlTree avlTree50 = new system.testclass.AvlTree();
        avlTree50.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode53 = avlTree50.root;
        avlTree50.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode56 = avlTree50.root;
        avlTree50.remove((int) ' ');
        system.testclass.AvlTree.AvlNode avlNode60 = new system.testclass.AvlTree.AvlNode(1);
        avlTree50.root = avlNode60;
        avlNode49.right = avlNode60;
        avlNode39.left = avlNode60;
        system.testclass.AvlTree.AvlNode avlNode65 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode66 = avlNode65.left;
        system.testclass.AvlTree.AvlNode avlNode68 = new system.testclass.AvlTree.AvlNode(0);
        avlNode68.element = 0;
        system.testclass.AvlTree.AvlNode avlNode71 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode72 = avlNode71.left;
        int int73 = avlNode71.element;
        avlNode68.right = avlNode71;
        system.testclass.AvlTree.AvlNode avlNode75 = new system.testclass.AvlTree.AvlNode((int) (byte) 100, avlNode66, avlNode71);
        system.testclass.AvlTree.AvlNode avlNode76 = new system.testclass.AvlTree.AvlNode((int) (byte) 100, avlNode60, avlNode75);
        system.testclass.AvlTree.AvlNode avlNode77 = avlNode76.right;
        avlNode76.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode80 = new system.testclass.AvlTree.AvlNode((int) (byte) 100, avlNode13, avlNode76);
        avlTree0.root = avlNode13;
        system.testclass.AvlTree.AvlNode avlNode82 = new system.testclass.AvlTree.AvlNode();
        int int83 = avlNode82.element;
        system.testclass.AvlTree.AvlNode avlNode85 = new system.testclass.AvlTree.AvlNode();
        int int86 = avlNode85.height;
        system.testclass.AvlTree.AvlNode avlNode87 = null;
        avlNode85.right = avlNode87;
        int int89 = avlNode85.element;
        system.testclass.AvlTree.AvlNode avlNode90 = new system.testclass.AvlTree.AvlNode();
        int int91 = avlNode90.height;
        system.testclass.AvlTree.AvlNode avlNode92 = new system.testclass.AvlTree.AvlNode();
        avlNode90.right = avlNode92;
        system.testclass.AvlTree.AvlNode avlNode94 = new system.testclass.AvlTree.AvlNode((int) (byte) 100, avlNode85, avlNode90);
        avlNode82.left = avlNode94;
        int int96 = avlNode82.height;
        avlTree0.root = avlNode82;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode3 = avlTree0.root;
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) ' ');
        boolean boolean9 = avlTree0.isEmpty();
        int int10 = avlTree0.findMin();
        int int11 = avlTree0.findMin();
        system.testclass.AvlTree.AvlNode avlNode13 = null;
        system.testclass.AvlTree.AvlNode avlNode15 = null;
        system.testclass.AvlTree.AvlNode avlNode16 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode17 = avlNode16.left;
        system.testclass.AvlTree.AvlNode avlNode18 = new system.testclass.AvlTree.AvlNode(0, avlNode15, avlNode16);
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode((int) (short) 1, avlNode13, avlNode18);
        avlTree0.root = avlNode19;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode3 = avlTree0.root;
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) ' ');
        boolean boolean9 = avlTree0.isEmpty();
        boolean boolean10 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode11 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode12 = new system.testclass.AvlTree.AvlNode();
        int int13 = avlNode12.height;
        int int14 = avlNode12.height;
        system.testclass.AvlTree.AvlNode avlNode16 = new system.testclass.AvlTree.AvlNode((int) (byte) 0);
        system.testclass.AvlTree.AvlNode avlNode17 = new system.testclass.AvlTree.AvlNode();
        int int18 = avlNode17.height;
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode();
        avlNode17.right = avlNode19;
        avlNode16.right = avlNode19;
        system.testclass.AvlTree.AvlNode avlNode22 = avlNode16.right;
        system.testclass.AvlTree avlTree23 = new system.testclass.AvlTree();
        avlTree23.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode26 = avlTree23.root;
        avlTree23.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode29 = avlTree23.root;
        avlTree23.remove((int) ' ');
        system.testclass.AvlTree.AvlNode avlNode33 = new system.testclass.AvlTree.AvlNode(1);
        avlTree23.root = avlNode33;
        avlNode22.right = avlNode33;
        avlNode12.left = avlNode33;
        avlNode12.height = 'a';
        avlTree0.root = avlNode12;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode3 = avlTree0.root;
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) ' ');
        boolean boolean9 = avlTree0.isEmpty();
        int int10 = avlTree0.findMin();
        boolean boolean11 = avlTree0.isEmpty();
        avlTree0.insert(10);
        system.testclass.AvlTree avlTree14 = new system.testclass.AvlTree();
        avlTree14.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode17 = avlTree14.root;
        avlNode17.height = 'a';
        system.testclass.AvlTree.AvlNode avlNode20 = new system.testclass.AvlTree.AvlNode();
        int int21 = avlNode20.height;
        system.testclass.AvlTree.AvlNode avlNode22 = new system.testclass.AvlTree.AvlNode();
        avlNode20.right = avlNode22;
        avlNode17.left = avlNode22;
        avlTree0.root = avlNode17;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode3 = avlTree0.root;
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) ' ');
        boolean boolean9 = avlTree0.isEmpty();
        int int10 = avlTree0.findMin();
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode();
        avlTree0.root = avlNode11;
        avlTree0.remove((int) (short) 1);
        avlTree0.insert((int) 'a');
        system.testclass.AvlTree avlTree18 = new system.testclass.AvlTree();
        avlTree18.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode21 = avlTree18.root;
        int int22 = avlTree18.findMin();
        system.testclass.AvlTree.AvlNode avlNode23 = avlTree18.root;
        system.testclass.AvlTree avlTree24 = new system.testclass.AvlTree();
        avlTree24.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode27 = avlTree24.root;
        avlNode27.height = 'a';
        system.testclass.AvlTree.AvlNode avlNode30 = new system.testclass.AvlTree.AvlNode();
        int int31 = avlNode30.height;
        system.testclass.AvlTree.AvlNode avlNode32 = new system.testclass.AvlTree.AvlNode();
        avlNode30.right = avlNode32;
        avlNode27.left = avlNode32;
        system.testclass.AvlTree.AvlNode avlNode35 = avlNode27.left;
        int int36 = avlNode35.element;
        system.testclass.AvlTree.AvlNode avlNode37 = new system.testclass.AvlTree.AvlNode((int) (short) 100, avlNode23, avlNode35);
        int int38 = avlNode37.height;
        system.testclass.AvlTree.AvlNode avlNode39 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode40 = avlNode39.left;
        int int41 = avlNode39.element;
        system.testclass.AvlTree.AvlNode avlNode42 = new system.testclass.AvlTree.AvlNode();
        int int43 = avlNode42.height;
        system.testclass.AvlTree.AvlNode avlNode44 = new system.testclass.AvlTree.AvlNode();
        avlNode42.right = avlNode44;
        avlNode39.left = avlNode42;
        avlNode39.element = (-1);
        avlNode37.right = avlNode39;
        avlTree0.root = avlNode37;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode3 = avlTree0.root;
        avlTree0.remove(100);
        system.testclass.AvlTree.AvlNode avlNode7 = new system.testclass.AvlTree.AvlNode();
        int int8 = avlNode7.height;
        system.testclass.AvlTree.AvlNode avlNode9 = null;
        avlNode7.right = avlNode9;
        int int11 = avlNode7.element;
        system.testclass.AvlTree.AvlNode avlNode12 = new system.testclass.AvlTree.AvlNode();
        int int13 = avlNode12.height;
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode();
        avlNode12.right = avlNode14;
        system.testclass.AvlTree.AvlNode avlNode16 = new system.testclass.AvlTree.AvlNode((int) (byte) 100, avlNode7, avlNode12);
        system.testclass.AvlTree.AvlNode avlNode18 = new system.testclass.AvlTree.AvlNode(0);
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode();
        int int20 = avlNode19.height;
        system.testclass.AvlTree.AvlNode avlNode21 = null;
        avlNode19.right = avlNode21;
        int int23 = avlNode19.element;
        system.testclass.AvlTree.AvlNode avlNode25 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode25.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode28 = avlNode25.left;
        avlNode19.right = avlNode25;
        avlNode18.left = avlNode19;
        avlNode7.right = avlNode19;
        int int32 = avlNode7.height;
        avlNode7.element = '4';
        avlNode7.element = 'a';
        avlTree0.root = avlNode7;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode3 = avlTree0.root;
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        int int7 = avlTree0.findMin();
        avlTree0.remove((-1));
        avlTree0.remove(10);
        system.testclass.AvlTree.AvlNode avlNode13 = new system.testclass.AvlTree.AvlNode();
        int int14 = avlNode13.height;
        system.testclass.AvlTree.AvlNode avlNode15 = null;
        avlNode13.right = avlNode15;
        int int17 = avlNode13.element;
        system.testclass.AvlTree.AvlNode avlNode19 = new system.testclass.AvlTree.AvlNode((int) 'a');
        avlNode19.height = (byte) 1;
        system.testclass.AvlTree.AvlNode avlNode22 = avlNode19.left;
        avlNode13.right = avlNode19;
        system.testclass.AvlTree avlTree24 = new system.testclass.AvlTree();
        avlTree24.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode27 = avlTree24.root;
        avlNode27.height = 'a';
        system.testclass.AvlTree.AvlNode avlNode30 = new system.testclass.AvlTree.AvlNode();
        int int31 = avlNode30.height;
        system.testclass.AvlTree.AvlNode avlNode32 = new system.testclass.AvlTree.AvlNode();
        avlNode30.right = avlNode32;
        avlNode27.left = avlNode32;
        system.testclass.AvlTree.AvlNode avlNode35 = avlNode27.left;
        system.testclass.AvlTree.AvlNode avlNode36 = new system.testclass.AvlTree.AvlNode((int) 'a', avlNode13, avlNode35);
        system.testclass.AvlTree avlTree37 = new system.testclass.AvlTree();
        avlTree37.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode40 = avlTree37.root;
        avlTree37.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode43 = avlTree37.root;
        avlTree37.remove((int) ' ');
        boolean boolean46 = avlTree37.isEmpty();
        boolean boolean47 = avlTree37.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode48 = avlTree37.root;
        system.testclass.AvlTree.AvlNode avlNode49 = avlTree37.root;
        avlNode36.right = avlNode49;
        avlTree0.root = avlNode36;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode3 = avlTree0.root;
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) ' ');
        boolean boolean9 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode11 = new system.testclass.AvlTree.AvlNode((int) (byte) 0);
        system.testclass.AvlTree.AvlNode avlNode12 = new system.testclass.AvlTree.AvlNode();
        int int13 = avlNode12.height;
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode();
        avlNode12.right = avlNode14;
        avlNode11.right = avlNode14;
        system.testclass.AvlTree.AvlNode avlNode17 = avlNode11.right;
        system.testclass.AvlTree avlTree18 = new system.testclass.AvlTree();
        avlTree18.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode21 = avlTree18.root;
        avlTree18.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode24 = avlTree18.root;
        avlTree18.remove((int) ' ');
        system.testclass.AvlTree.AvlNode avlNode28 = new system.testclass.AvlTree.AvlNode(1);
        avlTree18.root = avlNode28;
        avlNode17.right = avlNode28;
        avlNode17.element = '#';
        system.testclass.AvlTree.AvlNode avlNode33 = avlNode17.right;
        system.testclass.AvlTree.AvlNode avlNode34 = avlNode17.right;
        avlTree0.root = avlNode34;
        system.testclass.AvlTree.AvlNode avlNode37 = new system.testclass.AvlTree.AvlNode((int) (byte) 0);
        system.testclass.AvlTree.AvlNode avlNode38 = new system.testclass.AvlTree.AvlNode();
        int int39 = avlNode38.height;
        system.testclass.AvlTree.AvlNode avlNode40 = new system.testclass.AvlTree.AvlNode();
        avlNode38.right = avlNode40;
        avlNode37.right = avlNode40;
        system.testclass.AvlTree.AvlNode avlNode43 = avlNode37.right;
        system.testclass.AvlTree avlTree44 = new system.testclass.AvlTree();
        avlTree44.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode47 = avlTree44.root;
        avlTree44.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode50 = avlTree44.root;
        avlTree44.remove((int) ' ');
        system.testclass.AvlTree.AvlNode avlNode54 = new system.testclass.AvlTree.AvlNode(1);
        avlTree44.root = avlNode54;
        avlNode43.right = avlNode54;
        avlNode43.element = '#';
        system.testclass.AvlTree.AvlNode avlNode59 = avlNode43.right;
        int int60 = avlNode43.element;
        system.testclass.AvlTree avlTree61 = new system.testclass.AvlTree();
        avlTree61.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode64 = avlTree61.root;
        avlTree61.remove(100);
        system.testclass.AvlTree.AvlNode avlNode67 = null;
        avlTree61.root = avlNode67;
        system.testclass.AvlTree.AvlNode avlNode69 = avlTree61.root;
        system.testclass.AvlTree.AvlNode avlNode71 = new system.testclass.AvlTree.AvlNode((int) (byte) 0);
        system.testclass.AvlTree.AvlNode avlNode72 = new system.testclass.AvlTree.AvlNode();
        int int73 = avlNode72.height;
        system.testclass.AvlTree.AvlNode avlNode74 = new system.testclass.AvlTree.AvlNode();
        avlNode72.right = avlNode74;
        avlNode71.right = avlNode74;
        system.testclass.AvlTree.AvlNode avlNode77 = avlNode71.right;
        system.testclass.AvlTree avlTree78 = new system.testclass.AvlTree();
        avlTree78.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode81 = avlTree78.root;
        avlTree78.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode84 = avlTree78.root;
        avlTree78.remove((int) ' ');
        system.testclass.AvlTree.AvlNode avlNode88 = new system.testclass.AvlTree.AvlNode(1);
        avlTree78.root = avlNode88;
        avlNode77.right = avlNode88;
        avlNode88.height = (byte) -1;
        avlTree61.root = avlNode88;
        avlNode43.right = avlNode88;
        avlTree0.root = avlNode43;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode3 = avlTree0.root;
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) ' ');
        boolean boolean9 = avlTree0.isEmpty();
        boolean boolean10 = avlTree0.isEmpty();
        system.testclass.AvlTree.AvlNode avlNode11 = avlTree0.root;
        int int12 = avlTree0.findMin();
        avlTree0.remove((int) (byte) 100);
        system.testclass.AvlTree.AvlNode avlNode16 = new system.testclass.AvlTree.AvlNode(0);
        int int17 = avlNode16.element;
        avlNode16.height = 100;
        system.testclass.AvlTree.AvlNode avlNode20 = avlNode16.right;
        system.testclass.AvlTree.AvlNode avlNode21 = avlNode16.right;
        system.testclass.AvlTree.AvlNode avlNode23 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode24 = avlNode23.left;
        system.testclass.AvlTree.AvlNode avlNode26 = new system.testclass.AvlTree.AvlNode(0);
        avlNode26.element = 0;
        system.testclass.AvlTree.AvlNode avlNode29 = new system.testclass.AvlTree.AvlNode();
        system.testclass.AvlTree.AvlNode avlNode30 = avlNode29.left;
        int int31 = avlNode29.element;
        avlNode26.right = avlNode29;
        system.testclass.AvlTree.AvlNode avlNode33 = new system.testclass.AvlTree.AvlNode((int) (byte) 100, avlNode24, avlNode29);
        int int34 = avlNode33.height;
        int int35 = avlNode33.height;
        avlNode16.right = avlNode33;
        avlTree0.root = avlNode16;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode3 = avlTree0.root;
        avlTree0.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode6 = avlTree0.root;
        avlTree0.remove((int) ' ');
        boolean boolean9 = avlTree0.isEmpty();
        avlTree0.remove((int) 'a');
        system.testclass.AvlTree.AvlNode avlNode12 = avlTree0.root;
        system.testclass.AvlTree.AvlNode avlNode15 = new system.testclass.AvlTree.AvlNode((int) (byte) 0);
        system.testclass.AvlTree.AvlNode avlNode16 = avlNode15.right;
        system.testclass.AvlTree.AvlNode avlNode17 = new system.testclass.AvlTree.AvlNode();
        int int18 = avlNode17.height;
        system.testclass.AvlTree.AvlNode avlNode19 = null;
        avlNode17.right = avlNode19;
        system.testclass.AvlTree.AvlNode avlNode21 = avlNode17.left;
        avlNode15.right = avlNode17;
        system.testclass.AvlTree avlTree23 = new system.testclass.AvlTree();
        avlTree23.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode26 = avlTree23.root;
        avlTree23.remove(100);
        system.testclass.AvlTree.AvlNode avlNode29 = avlTree23.root;
        system.testclass.AvlTree.AvlNode avlNode30 = new system.testclass.AvlTree.AvlNode((int) (short) -1, avlNode17, avlNode29);
        avlTree0.root = avlNode30;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode3 = avlTree0.root;
        avlTree0.remove(100);
        system.testclass.AvlTree.AvlNode avlNode6 = new system.testclass.AvlTree.AvlNode();
        int int7 = avlNode6.element;
        system.testclass.AvlTree.AvlNode avlNode9 = new system.testclass.AvlTree.AvlNode();
        int int10 = avlNode9.height;
        system.testclass.AvlTree.AvlNode avlNode11 = null;
        avlNode9.right = avlNode11;
        int int13 = avlNode9.element;
        system.testclass.AvlTree.AvlNode avlNode14 = new system.testclass.AvlTree.AvlNode();
        int int15 = avlNode14.height;
        system.testclass.AvlTree.AvlNode avlNode16 = new system.testclass.AvlTree.AvlNode();
        avlNode14.right = avlNode16;
        system.testclass.AvlTree.AvlNode avlNode18 = new system.testclass.AvlTree.AvlNode((int) (byte) 100, avlNode9, avlNode14);
        avlNode6.left = avlNode18;
        avlNode18.height = (-1);
        avlTree0.root = avlNode18;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        system.testclass.AvlTree avlTree0 = new system.testclass.AvlTree();
        avlTree0.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode3 = avlTree0.root;
        avlTree0.remove(100);
        system.testclass.AvlTree.AvlNode avlNode6 = null;
        avlTree0.root = avlNode6;
        system.testclass.AvlTree.AvlNode avlNode8 = avlTree0.root;
        system.testclass.AvlTree avlTree9 = new system.testclass.AvlTree();
        avlTree9.insert((int) (byte) -1);
        system.testclass.AvlTree.AvlNode avlNode12 = avlTree9.root;
        avlTree9.remove((int) '4');
        system.testclass.AvlTree.AvlNode avlNode15 = avlTree9.root;
        avlNode15.height = 1;
        system.testclass.AvlTree.AvlNode avlNode18 = new system.testclass.AvlTree.AvlNode();
        int int19 = avlNode18.height;
        system.testclass.AvlTree.AvlNode avlNode20 = null;
        avlNode18.right = avlNode20;
        int int22 = avlNode18.element;
        system.testclass.AvlTree.AvlNode avlNode24 = new system.testclass.AvlTree.AvlNode();
        int int25 = avlNode24.height;
        system.testclass.AvlTree.AvlNode avlNode26 = null;
        avlNode24.right = avlNode26;
        int int28 = avlNode24.element;
        system.testclass.AvlTree.AvlNode avlNode29 = new system.testclass.AvlTree.AvlNode();
        int int30 = avlNode29.height;
        system.testclass.AvlTree.AvlNode avlNode31 = new system.testclass.AvlTree.AvlNode();
        avlNode29.right = avlNode31;
        system.testclass.AvlTree.AvlNode avlNode33 = new system.testclass.AvlTree.AvlNode((int) (byte) 100, avlNode24, avlNode29);
        avlNode18.right = avlNode33;
        int int35 = avlNode33.height;
        avlNode15.left = avlNode33;
        avlTree0.root = avlNode33;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_4) for avlTree0", avlTree0.property_4());
    }
}

