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
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.add((java.lang.Object) true);
        boolean boolean4 = nodeCachingLinkedList0.add((java.lang.Object) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode1 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj3 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode1, linkedListNode2, obj3);
        java.lang.Object obj5 = linkedListNode1.getValue();
        boolean boolean6 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode1);
        boolean boolean8 = nodeCachingLinkedList0.add((java.lang.Object) "");
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj11 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode9, linkedListNode10, obj11);
        linkedListNode9.setValue((java.lang.Object) ' ');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj17 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode15, linkedListNode16, obj17);
        linkedListNode15.setValue((java.lang.Object) ' ');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = linkedListNode15.getPreviousNode();
        linkedListNode9.setPreviousNode(linkedListNode15);
        linkedListNode15.setValue((java.lang.Object) false);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = linkedListNode15.getPreviousNode();
        boolean boolean26 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode25);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.add((java.lang.Object) (short) 1);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList3 = new system.testclass.NodeCachingLinkedList();
        boolean boolean5 = nodeCachingLinkedList3.remove((java.lang.Object) (byte) 0);
        boolean boolean7 = nodeCachingLinkedList3.remove((java.lang.Object) "hi!");
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj10 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode8, linkedListNode9, obj10);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode11, linkedListNode12, (java.lang.Object) (short) 0);
        boolean boolean15 = nodeCachingLinkedList3.add((java.lang.Object) linkedListNode12);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList16 = new system.testclass.NodeCachingLinkedList();
        boolean boolean18 = nodeCachingLinkedList16.remove((java.lang.Object) (byte) 0);
        boolean boolean20 = nodeCachingLinkedList16.remove((java.lang.Object) "hi!");
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj23 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode21, linkedListNode22, obj23);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode24, linkedListNode25, (java.lang.Object) (short) 0);
        boolean boolean28 = nodeCachingLinkedList16.add((java.lang.Object) linkedListNode25);
        linkedListNode12.setPreviousNode(linkedListNode25);
        boolean boolean30 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode12);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        boolean boolean4 = nodeCachingLinkedList0.remove((java.lang.Object) "hi!");
        boolean boolean6 = nodeCachingLinkedList0.add((java.lang.Object) (short) 10);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj9 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode7, linkedListNode8, obj9);
        boolean boolean11 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode7);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        boolean boolean4 = nodeCachingLinkedList0.remove((java.lang.Object) '4');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, (java.lang.Object) linkedListNode7);
        boolean boolean10 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode6);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = linkedListNode11.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = linkedListNode13.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = linkedListNode17.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode15, linkedListNode16, (java.lang.Object) linkedListNode17);
        linkedListNode13.setPreviousNode(linkedListNode17);
        linkedListNode11.setValue((java.lang.Object) linkedListNode13);
        boolean boolean22 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode13);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = linkedListNode25.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode23, linkedListNode24, (java.lang.Object) linkedListNode25);
        java.lang.Object obj28 = linkedListNode24.getValue();
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList29 = new system.testclass.NodeCachingLinkedList();
        boolean boolean31 = nodeCachingLinkedList29.remove((java.lang.Object) (byte) 0);
        boolean boolean33 = nodeCachingLinkedList29.remove((java.lang.Object) "hi!");
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode35 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj36 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode37 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode34, linkedListNode35, obj36);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode40 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode37, linkedListNode38, (java.lang.Object) (short) 0);
        boolean boolean41 = nodeCachingLinkedList29.add((java.lang.Object) linkedListNode38);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList42 = new system.testclass.NodeCachingLinkedList();
        boolean boolean44 = nodeCachingLinkedList42.remove((java.lang.Object) (byte) 0);
        boolean boolean46 = nodeCachingLinkedList42.remove((java.lang.Object) "hi!");
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode47 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode48 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj49 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode50 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode47, linkedListNode48, obj49);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode51 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode53 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode50, linkedListNode51, (java.lang.Object) (short) 0);
        boolean boolean54 = nodeCachingLinkedList42.add((java.lang.Object) linkedListNode51);
        linkedListNode38.setPreviousNode(linkedListNode51);
        linkedListNode24.setPreviousNode(linkedListNode51);
        boolean boolean57 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode24);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        boolean boolean4 = nodeCachingLinkedList0.remove((java.lang.Object) '4');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, (java.lang.Object) linkedListNode7);
        boolean boolean10 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode6);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = linkedListNode11.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = linkedListNode13.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = linkedListNode17.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode15, linkedListNode16, (java.lang.Object) linkedListNode17);
        linkedListNode13.setPreviousNode(linkedListNode17);
        linkedListNode11.setValue((java.lang.Object) linkedListNode13);
        boolean boolean22 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode13);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList23 = new system.testclass.NodeCachingLinkedList();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj26 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode24, linkedListNode25, obj26);
        java.lang.Object obj28 = linkedListNode24.getValue();
        boolean boolean29 = nodeCachingLinkedList23.remove((java.lang.Object) linkedListNode24);
        boolean boolean31 = nodeCachingLinkedList23.add((java.lang.Object) "");
        boolean boolean32 = nodeCachingLinkedList0.add((java.lang.Object) boolean31);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        boolean boolean4 = nodeCachingLinkedList0.remove((java.lang.Object) '4');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, (java.lang.Object) linkedListNode7);
        boolean boolean10 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode6);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = linkedListNode11.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = linkedListNode13.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = linkedListNode17.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode15, linkedListNode16, (java.lang.Object) linkedListNode17);
        linkedListNode13.setPreviousNode(linkedListNode17);
        linkedListNode11.setValue((java.lang.Object) linkedListNode13);
        boolean boolean22 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode13);
        boolean boolean24 = nodeCachingLinkedList0.add((java.lang.Object) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode1 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj3 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode1, linkedListNode2, obj3);
        java.lang.Object obj5 = linkedListNode1.getValue();
        boolean boolean6 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode1);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList7 = new system.testclass.NodeCachingLinkedList();
        boolean boolean9 = nodeCachingLinkedList7.remove((java.lang.Object) (byte) 0);
        boolean boolean11 = nodeCachingLinkedList7.remove((java.lang.Object) "hi!");
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj14 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode12, linkedListNode13, obj14);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode15, linkedListNode16, (java.lang.Object) (short) 0);
        boolean boolean19 = nodeCachingLinkedList7.add((java.lang.Object) linkedListNode16);
        boolean boolean20 = nodeCachingLinkedList0.remove((java.lang.Object) nodeCachingLinkedList7);
        boolean boolean22 = nodeCachingLinkedList7.add((java.lang.Object) 1L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList7", nodeCachingLinkedList7.repOK_1());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        boolean boolean4 = nodeCachingLinkedList0.remove((java.lang.Object) "hi!");
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj7 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, obj7);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode8, linkedListNode9, (java.lang.Object) (short) 0);
        boolean boolean12 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode9);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList13 = new system.testclass.NodeCachingLinkedList();
        boolean boolean15 = nodeCachingLinkedList13.remove((java.lang.Object) (byte) 0);
        boolean boolean17 = nodeCachingLinkedList13.remove((java.lang.Object) "hi!");
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj20 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode18, linkedListNode19, obj20);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode21, linkedListNode22, (java.lang.Object) (short) 0);
        boolean boolean25 = nodeCachingLinkedList13.add((java.lang.Object) linkedListNode22);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList26 = new system.testclass.NodeCachingLinkedList();
        boolean boolean28 = nodeCachingLinkedList26.remove((java.lang.Object) (byte) 0);
        boolean boolean30 = nodeCachingLinkedList26.remove((java.lang.Object) "hi!");
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj33 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode31, linkedListNode32, obj33);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode35 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode37 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode34, linkedListNode35, (java.lang.Object) (short) 0);
        boolean boolean38 = nodeCachingLinkedList26.add((java.lang.Object) linkedListNode35);
        linkedListNode22.setPreviousNode(linkedListNode35);
        boolean boolean40 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode35);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        boolean boolean4 = nodeCachingLinkedList0.remove((java.lang.Object) "hi!");
        boolean boolean6 = nodeCachingLinkedList0.add((java.lang.Object) (short) 10);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj9 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode7, linkedListNode8, obj9);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode10, linkedListNode11, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = linkedListNode16.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode14, linkedListNode15, (java.lang.Object) linkedListNode16);
        linkedListNode11.setValue((java.lang.Object) linkedListNode18);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = linkedListNode18.getNextNode();
        boolean boolean21 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode20);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        boolean boolean4 = nodeCachingLinkedList0.remove((java.lang.Object) "hi!");
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj7 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, obj7);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode8, linkedListNode9, (java.lang.Object) (short) 0);
        boolean boolean12 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode9);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = linkedListNode13.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = linkedListNode14.getPreviousNode();
        boolean boolean16 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode15);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        boolean boolean4 = nodeCachingLinkedList0.remove((java.lang.Object) '4');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, (java.lang.Object) linkedListNode7);
        boolean boolean10 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode6);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList11 = new system.testclass.NodeCachingLinkedList();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj14 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode12, linkedListNode13, obj14);
        java.lang.Object obj16 = linkedListNode12.getValue();
        boolean boolean17 = nodeCachingLinkedList11.remove((java.lang.Object) linkedListNode12);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj21 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode19, linkedListNode20, obj21);
        linkedListNode19.setValue((java.lang.Object) ' ');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj27 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode25, linkedListNode26, obj27);
        linkedListNode25.setValue((java.lang.Object) ' ');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = linkedListNode25.getPreviousNode();
        linkedListNode19.setPreviousNode(linkedListNode25);
        linkedListNode25.setValue((java.lang.Object) false);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode35 = linkedListNode25.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode12, linkedListNode18, (java.lang.Object) linkedListNode25);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode37 = linkedListNode25.getPreviousNode();
        boolean boolean38 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode37);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        boolean boolean4 = nodeCachingLinkedList0.remove((java.lang.Object) '4');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, (java.lang.Object) linkedListNode7);
        boolean boolean10 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode6);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = linkedListNode11.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = linkedListNode13.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = linkedListNode17.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode15, linkedListNode16, (java.lang.Object) linkedListNode17);
        linkedListNode13.setPreviousNode(linkedListNode17);
        linkedListNode11.setValue((java.lang.Object) linkedListNode13);
        boolean boolean22 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode13);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj25 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode23, linkedListNode24, obj25);
        linkedListNode26.setValue((java.lang.Object) false);
        linkedListNode26.setValue((java.lang.Object) 0L);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = linkedListNode26.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = linkedListNode32.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = linkedListNode33.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode35 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode36 = linkedListNode35.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode37 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode38 = linkedListNode37.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode40 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = linkedListNode41.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode43 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode39, linkedListNode40, (java.lang.Object) linkedListNode41);
        linkedListNode37.setPreviousNode(linkedListNode41);
        linkedListNode35.setValue((java.lang.Object) linkedListNode37);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode47 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode48 = linkedListNode47.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode49 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode50 = linkedListNode49.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode51 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode52 = linkedListNode51.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode53 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode54 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode55 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode56 = linkedListNode55.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode57 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode53, linkedListNode54, (java.lang.Object) linkedListNode55);
        linkedListNode51.setPreviousNode(linkedListNode55);
        linkedListNode49.setValue((java.lang.Object) linkedListNode51);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode60 = linkedListNode51.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode61 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode37, linkedListNode47, (java.lang.Object) linkedListNode51);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode62 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode63 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode64 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj65 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode66 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode63, linkedListNode64, obj65);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode67 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode69 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode66, linkedListNode67, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode71 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode62, linkedListNode67, (java.lang.Object) 10);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode72 = linkedListNode71.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode74 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode51, linkedListNode72, (java.lang.Object) (-1.0d));
        linkedListNode33.setNextNode(linkedListNode74);
        linkedListNode31.setValue((java.lang.Object) linkedListNode74);
        boolean boolean77 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode31);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode1 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode2 = linkedListNode1.getNextNode();
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList3 = new system.testclass.NodeCachingLinkedList();
        boolean boolean5 = nodeCachingLinkedList3.remove((java.lang.Object) (byte) 0);
        boolean boolean7 = nodeCachingLinkedList3.remove((java.lang.Object) '4');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = linkedListNode10.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode8, linkedListNode9, (java.lang.Object) linkedListNode10);
        boolean boolean13 = nodeCachingLinkedList3.add((java.lang.Object) linkedListNode9);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) nodeCachingLinkedList3);
        linkedListNode1.setValue((java.lang.Object) nodeCachingLinkedList3);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj19 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode17, linkedListNode18, obj19);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode20, linkedListNode21, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode16, linkedListNode21, (java.lang.Object) 10);
        boolean boolean26 = nodeCachingLinkedList3.add((java.lang.Object) linkedListNode25);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList3", nodeCachingLinkedList3.repOK_1());
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        boolean boolean4 = nodeCachingLinkedList0.remove((java.lang.Object) '4');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, (java.lang.Object) linkedListNode7);
        boolean boolean10 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode6);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = linkedListNode11.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = linkedListNode13.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = linkedListNode17.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode15, linkedListNode16, (java.lang.Object) linkedListNode17);
        linkedListNode13.setPreviousNode(linkedListNode17);
        linkedListNode11.setValue((java.lang.Object) linkedListNode13);
        boolean boolean22 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode13);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = linkedListNode24.getNextNode();
        java.lang.Class<?> wildcardClass26 = linkedListNode25.getClass();
        boolean boolean27 = nodeCachingLinkedList0.remove((java.lang.Object) wildcardClass26);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList28 = new system.testclass.NodeCachingLinkedList();
        boolean boolean30 = nodeCachingLinkedList28.remove((java.lang.Object) (byte) 0);
        boolean boolean32 = nodeCachingLinkedList28.remove((java.lang.Object) "hi!");
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj35 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode33, linkedListNode34, obj35);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode37 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode36, linkedListNode37, (java.lang.Object) (short) 0);
        boolean boolean40 = nodeCachingLinkedList28.add((java.lang.Object) linkedListNode37);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList41 = new system.testclass.NodeCachingLinkedList();
        boolean boolean43 = nodeCachingLinkedList41.remove((java.lang.Object) (byte) 0);
        boolean boolean45 = nodeCachingLinkedList41.remove((java.lang.Object) "hi!");
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode46 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode47 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj48 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode49 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode46, linkedListNode47, obj48);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode50 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode52 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode49, linkedListNode50, (java.lang.Object) (short) 0);
        boolean boolean53 = nodeCachingLinkedList41.add((java.lang.Object) linkedListNode50);
        linkedListNode37.setPreviousNode(linkedListNode50);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode55 = linkedListNode37.getPreviousNode();
        boolean boolean56 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode37);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList57 = new system.testclass.NodeCachingLinkedList();
        boolean boolean59 = nodeCachingLinkedList57.remove((java.lang.Object) (byte) 0);
        boolean boolean61 = nodeCachingLinkedList57.remove((java.lang.Object) "hi!");
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode62 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode63 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj64 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode65 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode62, linkedListNode63, obj64);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode66 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode68 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode65, linkedListNode66, (java.lang.Object) (short) 0);
        boolean boolean69 = nodeCachingLinkedList57.add((java.lang.Object) linkedListNode66);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode70 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode71 = linkedListNode70.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode72 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode73 = linkedListNode72.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode74 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode75 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode76 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode77 = linkedListNode76.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode78 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode74, linkedListNode75, (java.lang.Object) linkedListNode76);
        linkedListNode72.setPreviousNode(linkedListNode76);
        linkedListNode70.setValue((java.lang.Object) linkedListNode72);
        java.lang.Object obj81 = linkedListNode70.getValue();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode82 = null;
        linkedListNode70.setNextNode(linkedListNode82);
        linkedListNode66.setValue((java.lang.Object) linkedListNode70);
        java.lang.Object obj85 = linkedListNode66.getValue();
        boolean boolean86 = nodeCachingLinkedList0.add(obj85);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.add((java.lang.Object) (short) 1);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj6 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode4, linkedListNode5, obj6);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode7, linkedListNode8, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode3, linkedListNode8, (java.lang.Object) 10);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj15 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode13, linkedListNode14, obj15);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode16, linkedListNode17, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = linkedListNode22.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode20, linkedListNode21, (java.lang.Object) linkedListNode22);
        linkedListNode17.setValue((java.lang.Object) linkedListNode24);
        linkedListNode12.setNextNode(linkedListNode17);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = linkedListNode27.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = linkedListNode29.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = linkedListNode33.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode35 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode31, linkedListNode32, (java.lang.Object) linkedListNode33);
        linkedListNode29.setPreviousNode(linkedListNode33);
        linkedListNode27.setValue((java.lang.Object) linkedListNode29);
        java.lang.Object obj38 = linkedListNode27.getValue();
        linkedListNode17.setValue((java.lang.Object) linkedListNode27);
        boolean boolean40 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode17);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.add((java.lang.Object) true);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList3 = new system.testclass.NodeCachingLinkedList();
        boolean boolean5 = nodeCachingLinkedList3.remove((java.lang.Object) (byte) 0);
        boolean boolean7 = nodeCachingLinkedList3.remove((java.lang.Object) "hi!");
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj10 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode8, linkedListNode9, obj10);
        linkedListNode8.setValue((java.lang.Object) ' ');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj16 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode14, linkedListNode15, obj16);
        linkedListNode14.setValue((java.lang.Object) ' ');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = linkedListNode14.getPreviousNode();
        linkedListNode8.setPreviousNode(linkedListNode14);
        linkedListNode14.setValue((java.lang.Object) false);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = linkedListNode14.getPreviousNode();
        boolean boolean25 = nodeCachingLinkedList3.add((java.lang.Object) linkedListNode24);
        boolean boolean26 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode24);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode1 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj3 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode1, linkedListNode2, obj3);
        java.lang.Object obj5 = linkedListNode1.getValue();
        boolean boolean6 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode1);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList7 = new system.testclass.NodeCachingLinkedList();
        boolean boolean9 = nodeCachingLinkedList7.remove((java.lang.Object) (byte) 0);
        boolean boolean11 = nodeCachingLinkedList7.remove((java.lang.Object) "hi!");
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj14 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode12, linkedListNode13, obj14);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode15, linkedListNode16, (java.lang.Object) (short) 0);
        boolean boolean19 = nodeCachingLinkedList7.add((java.lang.Object) linkedListNode16);
        boolean boolean20 = nodeCachingLinkedList0.remove((java.lang.Object) nodeCachingLinkedList7);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj23 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode21, linkedListNode22, obj23);
        linkedListNode21.setValue((java.lang.Object) ' ');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj29 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode27, linkedListNode28, obj29);
        linkedListNode27.setValue((java.lang.Object) ' ');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = linkedListNode27.getPreviousNode();
        linkedListNode21.setPreviousNode(linkedListNode27);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode35 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode37 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode38 = linkedListNode37.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode35, linkedListNode36, (java.lang.Object) linkedListNode37);
        linkedListNode27.setNextNode(linkedListNode39);
        boolean boolean41 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode27);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode43 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj44 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode45 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode42, linkedListNode43, obj44);
        linkedListNode42.setValue((java.lang.Object) ' ');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode48 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode49 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj50 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode51 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode48, linkedListNode49, obj50);
        linkedListNode48.setValue((java.lang.Object) ' ');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode54 = linkedListNode48.getPreviousNode();
        linkedListNode42.setPreviousNode(linkedListNode48);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode56 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode57 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode58 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode59 = linkedListNode58.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode60 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode56, linkedListNode57, (java.lang.Object) linkedListNode58);
        linkedListNode48.setNextNode(linkedListNode60);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode62 = linkedListNode60.getNextNode();
        boolean boolean63 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode60);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode1 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode2 = linkedListNode1.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = linkedListNode2.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = linkedListNode6.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode4, linkedListNode5, (java.lang.Object) linkedListNode6);
        java.lang.Object obj9 = linkedListNode6.getValue();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = linkedListNode10.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = linkedListNode12.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = linkedListNode16.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode14, linkedListNode15, (java.lang.Object) linkedListNode16);
        linkedListNode12.setPreviousNode(linkedListNode16);
        linkedListNode10.setValue((java.lang.Object) linkedListNode12);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = linkedListNode12.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode2, linkedListNode6, (java.lang.Object) linkedListNode12);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList23 = new system.testclass.NodeCachingLinkedList();
        boolean boolean25 = nodeCachingLinkedList23.remove((java.lang.Object) (byte) 0);
        boolean boolean27 = nodeCachingLinkedList23.remove((java.lang.Object) "hi!");
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj30 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode28, linkedListNode29, obj30);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode31, linkedListNode32, (java.lang.Object) (short) 0);
        boolean boolean35 = nodeCachingLinkedList23.add((java.lang.Object) linkedListNode32);
        linkedListNode22.setValue((java.lang.Object) nodeCachingLinkedList23);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode37 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode40 = linkedListNode39.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode37, linkedListNode38, (java.lang.Object) linkedListNode39);
        java.lang.Object obj42 = linkedListNode38.getValue();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode44 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        linkedListNode38.setNextNode(linkedListNode44);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode46 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode47 = linkedListNode46.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode48 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode49 = linkedListNode48.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode50 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode51 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode52 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode53 = linkedListNode52.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode54 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode50, linkedListNode51, (java.lang.Object) linkedListNode52);
        linkedListNode48.setPreviousNode(linkedListNode52);
        linkedListNode46.setValue((java.lang.Object) linkedListNode48);
        linkedListNode38.setPreviousNode(linkedListNode46);
        boolean boolean58 = nodeCachingLinkedList23.add((java.lang.Object) linkedListNode38);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList23", nodeCachingLinkedList23.repOK_1());
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.add((java.lang.Object) true);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj6 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode4, linkedListNode5, obj6);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode7, linkedListNode8, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode3, linkedListNode8, (java.lang.Object) 10);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj16 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode14, linkedListNode15, obj16);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = linkedListNode17.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = linkedListNode18.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = linkedListNode20.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = linkedListNode20.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = linkedListNode23.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = linkedListNode25.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = linkedListNode29.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode27, linkedListNode28, (java.lang.Object) linkedListNode29);
        linkedListNode25.setPreviousNode(linkedListNode29);
        linkedListNode23.setValue((java.lang.Object) linkedListNode25);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode35 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj36 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode37 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode34, linkedListNode35, obj36);
        linkedListNode34.setValue((java.lang.Object) ' ');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode40 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj42 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode43 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode40, linkedListNode41, obj42);
        linkedListNode40.setValue((java.lang.Object) ' ');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode46 = linkedListNode40.getPreviousNode();
        linkedListNode34.setPreviousNode(linkedListNode40);
        linkedListNode25.setPreviousNode(linkedListNode40);
        linkedListNode20.setPreviousNode(linkedListNode25);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode50 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode51 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj52 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode53 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode50, linkedListNode51, obj52);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode54 = linkedListNode53.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode55 = linkedListNode54.getPreviousNode();
        linkedListNode25.setNextNode(linkedListNode55);
        linkedListNode18.setValue((java.lang.Object) linkedListNode25);
        linkedListNode13.setNextNode(linkedListNode25);
        boolean boolean59 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode25);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.add((java.lang.Object) true);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = linkedListNode4.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = linkedListNode5.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = linkedListNode9.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode7, linkedListNode8, (java.lang.Object) linkedListNode9);
        java.lang.Object obj12 = linkedListNode9.getValue();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = linkedListNode13.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = linkedListNode15.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = linkedListNode19.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode17, linkedListNode18, (java.lang.Object) linkedListNode19);
        linkedListNode15.setPreviousNode(linkedListNode19);
        linkedListNode13.setValue((java.lang.Object) linkedListNode15);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = linkedListNode15.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode9, (java.lang.Object) linkedListNode15);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList26 = new system.testclass.NodeCachingLinkedList();
        boolean boolean28 = nodeCachingLinkedList26.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = linkedListNode31.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode29, linkedListNode30, (java.lang.Object) linkedListNode31);
        java.lang.Object obj34 = linkedListNode30.getValue();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        linkedListNode30.setNextNode(linkedListNode36);
        boolean boolean38 = nodeCachingLinkedList26.remove((java.lang.Object) linkedListNode30);
        linkedListNode25.setNextNode(linkedListNode30);
        boolean boolean40 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode30);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode43 = linkedListNode42.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode44 = linkedListNode43.getNextNode();
        java.lang.Object obj45 = linkedListNode44.getValue();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode46 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode47 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode48 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj49 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode50 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode47, linkedListNode48, obj49);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode51 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode53 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode50, linkedListNode51, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode55 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode46, linkedListNode51, (java.lang.Object) 10);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode56 = linkedListNode55.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode57 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode58 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj59 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode60 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode57, linkedListNode58, obj59);
        linkedListNode57.setValue((java.lang.Object) ' ');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode63 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode64 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj65 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode66 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode63, linkedListNode64, obj65);
        linkedListNode63.setValue((java.lang.Object) ' ');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode69 = linkedListNode63.getPreviousNode();
        linkedListNode57.setPreviousNode(linkedListNode63);
        linkedListNode63.setValue((java.lang.Object) false);
        java.lang.Object obj73 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode74 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode55, linkedListNode63, obj73);
        linkedListNode44.setPreviousNode(linkedListNode63);
        boolean boolean76 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode44);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        boolean boolean4 = nodeCachingLinkedList0.remove((java.lang.Object) "hi!");
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj7 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, obj7);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode8, linkedListNode9, (java.lang.Object) (short) 0);
        boolean boolean12 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode9);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = linkedListNode13.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = linkedListNode15.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = linkedListNode19.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode17, linkedListNode18, (java.lang.Object) linkedListNode19);
        linkedListNode15.setPreviousNode(linkedListNode19);
        linkedListNode13.setValue((java.lang.Object) linkedListNode15);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = linkedListNode25.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = linkedListNode27.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = linkedListNode29.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = linkedListNode33.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode35 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode31, linkedListNode32, (java.lang.Object) linkedListNode33);
        linkedListNode29.setPreviousNode(linkedListNode33);
        linkedListNode27.setValue((java.lang.Object) linkedListNode29);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode38 = linkedListNode29.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode15, linkedListNode25, (java.lang.Object) linkedListNode29);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode40 = linkedListNode29.getPreviousNode();
        boolean boolean41 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode40);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        boolean boolean4 = nodeCachingLinkedList0.remove((java.lang.Object) "hi!");
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj7 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, obj7);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode8, linkedListNode9, (java.lang.Object) (short) 0);
        boolean boolean12 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode9);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj16 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode14, linkedListNode15, obj16);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode17, linkedListNode18, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode13, linkedListNode18, (java.lang.Object) 10);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = linkedListNode22.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj26 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode24, linkedListNode25, obj26);
        linkedListNode24.setValue((java.lang.Object) ' ');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj32 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode30, linkedListNode31, obj32);
        linkedListNode30.setValue((java.lang.Object) ' ');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode36 = linkedListNode30.getPreviousNode();
        linkedListNode24.setPreviousNode(linkedListNode30);
        linkedListNode30.setValue((java.lang.Object) false);
        java.lang.Object obj40 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode22, linkedListNode30, obj40);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = linkedListNode22.getNextNode();
        boolean boolean43 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode22);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode1 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj3 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode1, linkedListNode2, obj3);
        linkedListNode4.setValue((java.lang.Object) false);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = linkedListNode9.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = linkedListNode13.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode11, linkedListNode12, (java.lang.Object) linkedListNode13);
        linkedListNode9.setPreviousNode(linkedListNode13);
        linkedListNode7.setValue((java.lang.Object) linkedListNode9);
        linkedListNode4.setPreviousNode(linkedListNode9);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = linkedListNode9.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = linkedListNode9.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = linkedListNode20.getNextNode();
        boolean boolean22 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode20);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj26 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode24, linkedListNode25, obj26);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode27, linkedListNode28, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode23, linkedListNode28, (java.lang.Object) 10);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = linkedListNode23.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode35 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj36 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode37 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode34, linkedListNode35, obj36);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode38 = linkedListNode37.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = linkedListNode38.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode40 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = linkedListNode40.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = linkedListNode40.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode43 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode44 = linkedListNode43.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode45 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode46 = linkedListNode45.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode47 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode48 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode49 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode50 = linkedListNode49.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode51 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode47, linkedListNode48, (java.lang.Object) linkedListNode49);
        linkedListNode45.setPreviousNode(linkedListNode49);
        linkedListNode43.setValue((java.lang.Object) linkedListNode45);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode54 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode55 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj56 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode57 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode54, linkedListNode55, obj56);
        linkedListNode54.setValue((java.lang.Object) ' ');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode60 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode61 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj62 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode63 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode60, linkedListNode61, obj62);
        linkedListNode60.setValue((java.lang.Object) ' ');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode66 = linkedListNode60.getPreviousNode();
        linkedListNode54.setPreviousNode(linkedListNode60);
        linkedListNode45.setPreviousNode(linkedListNode60);
        linkedListNode40.setPreviousNode(linkedListNode45);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode70 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode71 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj72 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode73 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode70, linkedListNode71, obj72);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode74 = linkedListNode73.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode75 = linkedListNode74.getPreviousNode();
        linkedListNode45.setNextNode(linkedListNode75);
        linkedListNode38.setValue((java.lang.Object) linkedListNode45);
        linkedListNode33.setNextNode(linkedListNode45);
        boolean boolean79 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode33);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        boolean boolean4 = nodeCachingLinkedList0.remove((java.lang.Object) "hi!");
        boolean boolean6 = nodeCachingLinkedList0.add((java.lang.Object) (short) 10);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList7 = new system.testclass.NodeCachingLinkedList();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj10 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode8, linkedListNode9, obj10);
        java.lang.Object obj12 = linkedListNode8.getValue();
        boolean boolean13 = nodeCachingLinkedList7.remove((java.lang.Object) linkedListNode8);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList14 = new system.testclass.NodeCachingLinkedList();
        boolean boolean16 = nodeCachingLinkedList14.remove((java.lang.Object) (byte) 0);
        boolean boolean18 = nodeCachingLinkedList14.remove((java.lang.Object) "hi!");
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj21 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode19, linkedListNode20, obj21);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode22, linkedListNode23, (java.lang.Object) (short) 0);
        boolean boolean26 = nodeCachingLinkedList14.add((java.lang.Object) linkedListNode23);
        boolean boolean27 = nodeCachingLinkedList7.remove((java.lang.Object) nodeCachingLinkedList14);
        boolean boolean28 = nodeCachingLinkedList0.add((java.lang.Object) nodeCachingLinkedList14);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.add((java.lang.Object) "");
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = linkedListNode4.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj8 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode6, linkedListNode7, obj8);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = linkedListNode9.getPreviousNode();
        linkedListNode5.setNextNode(linkedListNode9);
        boolean boolean12 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode5);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList1 = new system.testclass.NodeCachingLinkedList();
        boolean boolean3 = nodeCachingLinkedList1.add((java.lang.Object) (short) 1);
        boolean boolean4 = nodeCachingLinkedList0.remove((java.lang.Object) boolean3);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList5 = new system.testclass.NodeCachingLinkedList();
        boolean boolean7 = nodeCachingLinkedList5.remove((java.lang.Object) (byte) 0);
        boolean boolean9 = nodeCachingLinkedList5.remove((java.lang.Object) "hi!");
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj12 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode10, linkedListNode11, obj12);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode13, linkedListNode14, (java.lang.Object) (short) 0);
        boolean boolean17 = nodeCachingLinkedList5.add((java.lang.Object) linkedListNode14);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = linkedListNode18.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = linkedListNode20.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = linkedListNode24.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode22, linkedListNode23, (java.lang.Object) linkedListNode24);
        linkedListNode20.setPreviousNode(linkedListNode24);
        linkedListNode18.setValue((java.lang.Object) linkedListNode20);
        java.lang.Object obj29 = linkedListNode18.getValue();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = null;
        linkedListNode18.setNextNode(linkedListNode30);
        linkedListNode14.setValue((java.lang.Object) linkedListNode18);
        boolean boolean33 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode18);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode35 = linkedListNode34.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode37 = linkedListNode36.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode38 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode40 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = linkedListNode40.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode38, linkedListNode39, (java.lang.Object) linkedListNode40);
        linkedListNode36.setPreviousNode(linkedListNode40);
        linkedListNode34.setValue((java.lang.Object) linkedListNode36);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode45 = linkedListNode36.getNextNode();
        java.lang.Class<?> wildcardClass46 = linkedListNode36.getClass();
        boolean boolean47 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode36);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList48 = new system.testclass.NodeCachingLinkedList();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode49 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode50 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj51 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode52 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode49, linkedListNode50, obj51);
        java.lang.Object obj53 = linkedListNode49.getValue();
        boolean boolean54 = nodeCachingLinkedList48.remove((java.lang.Object) linkedListNode49);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList55 = new system.testclass.NodeCachingLinkedList();
        boolean boolean57 = nodeCachingLinkedList55.add((java.lang.Object) true);
        boolean boolean58 = nodeCachingLinkedList48.remove((java.lang.Object) boolean57);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode59 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode60 = linkedListNode59.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode61 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode62 = linkedListNode61.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode63 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode64 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode65 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode66 = linkedListNode65.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode67 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode63, linkedListNode64, (java.lang.Object) linkedListNode65);
        linkedListNode61.setPreviousNode(linkedListNode65);
        linkedListNode59.setValue((java.lang.Object) linkedListNode61);
        java.lang.Object obj70 = linkedListNode59.getValue();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode71 = null;
        linkedListNode59.setNextNode(linkedListNode71);
        java.lang.Object obj73 = linkedListNode59.getValue();
        boolean boolean74 = nodeCachingLinkedList48.remove((java.lang.Object) linkedListNode59);
        boolean boolean75 = nodeCachingLinkedList0.add((java.lang.Object) nodeCachingLinkedList48);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        boolean boolean4 = nodeCachingLinkedList0.remove((java.lang.Object) "hi!");
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj7 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, obj7);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode8, linkedListNode9, (java.lang.Object) (short) 0);
        boolean boolean12 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode9);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj15 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode13, linkedListNode14, obj15);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = linkedListNode16.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj20 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode18, linkedListNode19, obj20);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = linkedListNode21.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode16, linkedListNode22, (java.lang.Object) 'a');
        boolean boolean25 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode16);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = linkedListNode26.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = linkedListNode28.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = linkedListNode32.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode30, linkedListNode31, (java.lang.Object) linkedListNode32);
        linkedListNode28.setPreviousNode(linkedListNode32);
        linkedListNode26.setValue((java.lang.Object) linkedListNode28);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = linkedListNode38.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode40 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = linkedListNode40.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode43 = linkedListNode42.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode44 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode45 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode46 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode47 = linkedListNode46.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode48 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode44, linkedListNode45, (java.lang.Object) linkedListNode46);
        linkedListNode42.setPreviousNode(linkedListNode46);
        linkedListNode40.setValue((java.lang.Object) linkedListNode42);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode51 = linkedListNode42.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode52 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode28, linkedListNode38, (java.lang.Object) linkedListNode42);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode53 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode54 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode55 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj56 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode57 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode54, linkedListNode55, obj56);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode58 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode60 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode57, linkedListNode58, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode62 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode53, linkedListNode58, (java.lang.Object) 10);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode63 = linkedListNode62.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode65 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode42, linkedListNode63, (java.lang.Object) (-1.0d));
        boolean boolean66 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode42);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        boolean boolean4 = nodeCachingLinkedList0.remove((java.lang.Object) '4');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, (java.lang.Object) linkedListNode7);
        boolean boolean10 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode6);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = linkedListNode11.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = linkedListNode13.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = linkedListNode17.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode15, linkedListNode16, (java.lang.Object) linkedListNode17);
        linkedListNode13.setPreviousNode(linkedListNode17);
        linkedListNode11.setValue((java.lang.Object) linkedListNode13);
        boolean boolean22 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode13);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj25 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode23, linkedListNode24, obj25);
        linkedListNode23.setValue((java.lang.Object) ' ');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj31 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode29, linkedListNode30, obj31);
        linkedListNode29.setValue((java.lang.Object) ' ');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode35 = linkedListNode29.getPreviousNode();
        linkedListNode23.setPreviousNode(linkedListNode29);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode37 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode40 = linkedListNode39.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode37, linkedListNode38, (java.lang.Object) linkedListNode39);
        linkedListNode29.setNextNode(linkedListNode41);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode43 = linkedListNode29.getNextNode();
        boolean boolean44 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode29);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        boolean boolean4 = nodeCachingLinkedList0.remove((java.lang.Object) "hi!");
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj7 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, obj7);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode8, linkedListNode9, (java.lang.Object) (short) 0);
        boolean boolean12 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode9);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList13 = new system.testclass.NodeCachingLinkedList();
        boolean boolean15 = nodeCachingLinkedList13.remove((java.lang.Object) (byte) 0);
        boolean boolean17 = nodeCachingLinkedList13.remove((java.lang.Object) "hi!");
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj20 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode18, linkedListNode19, obj20);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode21, linkedListNode22, (java.lang.Object) (short) 0);
        boolean boolean25 = nodeCachingLinkedList13.add((java.lang.Object) linkedListNode22);
        boolean boolean26 = nodeCachingLinkedList0.add((java.lang.Object) nodeCachingLinkedList13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList1 = new system.testclass.NodeCachingLinkedList();
        boolean boolean3 = nodeCachingLinkedList1.add((java.lang.Object) (short) 1);
        boolean boolean4 = nodeCachingLinkedList0.remove((java.lang.Object) boolean3);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj7 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, obj7);
        linkedListNode8.setValue((java.lang.Object) false);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = linkedListNode11.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = linkedListNode13.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = linkedListNode17.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode15, linkedListNode16, (java.lang.Object) linkedListNode17);
        linkedListNode13.setPreviousNode(linkedListNode17);
        linkedListNode11.setValue((java.lang.Object) linkedListNode13);
        linkedListNode8.setPreviousNode(linkedListNode11);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = linkedListNode24.getNextNode();
        linkedListNode11.setValue((java.lang.Object) linkedListNode24);
        boolean boolean27 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode11);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList28 = new system.testclass.NodeCachingLinkedList();
        boolean boolean30 = nodeCachingLinkedList28.add((java.lang.Object) (short) 1);
        boolean boolean31 = nodeCachingLinkedList0.remove((java.lang.Object) nodeCachingLinkedList28);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj35 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode33, linkedListNode34, obj35);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode37 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode36, linkedListNode37, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode32, linkedListNode37, (java.lang.Object) 10);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = linkedListNode32.getPreviousNode();
        boolean boolean43 = nodeCachingLinkedList28.add((java.lang.Object) linkedListNode42);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList28", nodeCachingLinkedList28.repOK_1());
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        boolean boolean4 = nodeCachingLinkedList0.remove((java.lang.Object) "hi!");
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj7 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, obj7);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode8, linkedListNode9, (java.lang.Object) (short) 0);
        boolean boolean12 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode9);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList13 = new system.testclass.NodeCachingLinkedList();
        boolean boolean15 = nodeCachingLinkedList13.remove((java.lang.Object) (byte) 0);
        boolean boolean17 = nodeCachingLinkedList13.remove((java.lang.Object) "hi!");
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj20 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode18, linkedListNode19, obj20);
        linkedListNode18.setValue((java.lang.Object) ' ');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj26 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode24, linkedListNode25, obj26);
        linkedListNode24.setValue((java.lang.Object) ' ');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = linkedListNode24.getPreviousNode();
        linkedListNode18.setPreviousNode(linkedListNode24);
        linkedListNode24.setValue((java.lang.Object) false);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = linkedListNode24.getPreviousNode();
        boolean boolean35 = nodeCachingLinkedList13.add((java.lang.Object) linkedListNode34);
        boolean boolean36 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode34);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode37 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj39 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode40 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode37, linkedListNode38, obj39);
        linkedListNode40.setValue((java.lang.Object) false);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode43 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode44 = linkedListNode43.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode45 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode46 = linkedListNode45.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode47 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode48 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode49 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode50 = linkedListNode49.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode51 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode47, linkedListNode48, (java.lang.Object) linkedListNode49);
        linkedListNode45.setPreviousNode(linkedListNode49);
        linkedListNode43.setValue((java.lang.Object) linkedListNode45);
        linkedListNode40.setPreviousNode(linkedListNode45);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode55 = linkedListNode45.getPreviousNode();
        boolean boolean56 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode45);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode1 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj3 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode1, linkedListNode2, obj3);
        java.lang.Object obj5 = linkedListNode1.getValue();
        boolean boolean6 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode1);
        boolean boolean8 = nodeCachingLinkedList0.add((java.lang.Object) "");
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = linkedListNode9.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = linkedListNode11.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = linkedListNode15.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode13, linkedListNode14, (java.lang.Object) linkedListNode15);
        linkedListNode11.setPreviousNode(linkedListNode15);
        linkedListNode9.setValue((java.lang.Object) linkedListNode11);
        java.lang.Object obj20 = linkedListNode9.getValue();
        boolean boolean21 = nodeCachingLinkedList0.remove(obj20);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList22 = new system.testclass.NodeCachingLinkedList();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj25 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode23, linkedListNode24, obj25);
        java.lang.Object obj27 = linkedListNode23.getValue();
        boolean boolean28 = nodeCachingLinkedList22.remove((java.lang.Object) linkedListNode23);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList29 = new system.testclass.NodeCachingLinkedList();
        boolean boolean31 = nodeCachingLinkedList29.add((java.lang.Object) true);
        boolean boolean32 = nodeCachingLinkedList22.remove((java.lang.Object) boolean31);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = linkedListNode33.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode35 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode36 = linkedListNode35.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode37 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode40 = linkedListNode39.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode37, linkedListNode38, (java.lang.Object) linkedListNode39);
        linkedListNode35.setPreviousNode(linkedListNode39);
        linkedListNode33.setValue((java.lang.Object) linkedListNode35);
        java.lang.Object obj44 = linkedListNode33.getValue();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode45 = null;
        linkedListNode33.setNextNode(linkedListNode45);
        java.lang.Object obj47 = linkedListNode33.getValue();
        boolean boolean48 = nodeCachingLinkedList22.remove((java.lang.Object) linkedListNode33);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode49 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode50 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj51 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode52 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode49, linkedListNode50, obj51);
        linkedListNode52.setValue((java.lang.Object) false);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode55 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode56 = linkedListNode55.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode57 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode58 = linkedListNode57.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode59 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode60 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode61 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode62 = linkedListNode61.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode63 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode59, linkedListNode60, (java.lang.Object) linkedListNode61);
        linkedListNode57.setPreviousNode(linkedListNode61);
        linkedListNode55.setValue((java.lang.Object) linkedListNode57);
        linkedListNode52.setPreviousNode(linkedListNode57);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode67 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode68 = linkedListNode67.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode69 = linkedListNode68.getPreviousNode();
        linkedListNode57.setNextNode(linkedListNode68);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode71 = linkedListNode57.getNextNode();
        boolean boolean72 = nodeCachingLinkedList22.remove((java.lang.Object) linkedListNode57);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList73 = new system.testclass.NodeCachingLinkedList();
        boolean boolean75 = nodeCachingLinkedList73.remove((java.lang.Object) (byte) 0);
        boolean boolean77 = nodeCachingLinkedList73.remove((java.lang.Object) '4');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode78 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode79 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode80 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode81 = linkedListNode80.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode82 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode78, linkedListNode79, (java.lang.Object) linkedListNode80);
        boolean boolean83 = nodeCachingLinkedList73.add((java.lang.Object) linkedListNode79);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode84 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) nodeCachingLinkedList73);
        linkedListNode57.setPreviousNode(linkedListNode84);
        boolean boolean86 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode57);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        boolean boolean4 = nodeCachingLinkedList0.remove((java.lang.Object) "hi!");
        boolean boolean6 = nodeCachingLinkedList0.add((java.lang.Object) (short) 10);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = linkedListNode8.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = linkedListNode9.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = linkedListNode13.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode11, linkedListNode12, (java.lang.Object) linkedListNode13);
        java.lang.Object obj16 = linkedListNode13.getValue();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = linkedListNode17.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = linkedListNode19.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = linkedListNode23.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode21, linkedListNode22, (java.lang.Object) linkedListNode23);
        linkedListNode19.setPreviousNode(linkedListNode23);
        linkedListNode17.setValue((java.lang.Object) linkedListNode19);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = linkedListNode19.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode9, linkedListNode13, (java.lang.Object) linkedListNode19);
        boolean boolean30 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode29);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode1 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj4 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode2, linkedListNode3, obj4);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode1, linkedListNode6, (java.lang.Object) 10);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = linkedListNode10.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj14 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode12, linkedListNode13, obj14);
        linkedListNode12.setValue((java.lang.Object) ' ');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj20 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode18, linkedListNode19, obj20);
        linkedListNode18.setValue((java.lang.Object) ' ');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = linkedListNode18.getPreviousNode();
        linkedListNode12.setPreviousNode(linkedListNode18);
        linkedListNode18.setValue((java.lang.Object) false);
        java.lang.Object obj28 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode10, linkedListNode18, obj28);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = linkedListNode10.getNextNode();
        boolean boolean31 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode10);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj35 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode33, linkedListNode34, obj35);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode37 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode36, linkedListNode37, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode32, linkedListNode37, (java.lang.Object) 10);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = linkedListNode32.getPreviousNode();
        boolean boolean43 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode32);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode45 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode46 = linkedListNode45.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode47 = linkedListNode46.getNextNode();
        java.lang.Object obj48 = linkedListNode47.getValue();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode49 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode50 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode51 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj52 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode53 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode50, linkedListNode51, obj52);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode54 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode56 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode53, linkedListNode54, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode58 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode49, linkedListNode54, (java.lang.Object) 10);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode59 = linkedListNode58.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode60 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode61 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj62 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode63 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode60, linkedListNode61, obj62);
        linkedListNode60.setValue((java.lang.Object) ' ');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode66 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode67 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj68 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode69 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode66, linkedListNode67, obj68);
        linkedListNode66.setValue((java.lang.Object) ' ');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode72 = linkedListNode66.getPreviousNode();
        linkedListNode60.setPreviousNode(linkedListNode66);
        linkedListNode66.setValue((java.lang.Object) false);
        java.lang.Object obj76 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode77 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode58, linkedListNode66, obj76);
        linkedListNode47.setPreviousNode(linkedListNode66);
        boolean boolean79 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode47);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.add((java.lang.Object) (short) 1);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList3 = new system.testclass.NodeCachingLinkedList();
        boolean boolean5 = nodeCachingLinkedList3.remove((java.lang.Object) (byte) 0);
        boolean boolean7 = nodeCachingLinkedList3.remove((java.lang.Object) '4');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = linkedListNode10.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode8, linkedListNode9, (java.lang.Object) linkedListNode10);
        boolean boolean13 = nodeCachingLinkedList3.add((java.lang.Object) linkedListNode9);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = linkedListNode9.getNextNode();
        boolean boolean15 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode9);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode1 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj3 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode1, linkedListNode2, obj3);
        java.lang.Object obj5 = linkedListNode1.getValue();
        boolean boolean6 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode1);
        boolean boolean8 = nodeCachingLinkedList0.add((java.lang.Object) "");
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = linkedListNode10.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = linkedListNode11.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = linkedListNode15.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode13, linkedListNode14, (java.lang.Object) linkedListNode15);
        java.lang.Object obj18 = linkedListNode15.getValue();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = linkedListNode19.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = linkedListNode21.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = linkedListNode25.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode23, linkedListNode24, (java.lang.Object) linkedListNode25);
        linkedListNode21.setPreviousNode(linkedListNode25);
        linkedListNode19.setValue((java.lang.Object) linkedListNode21);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = linkedListNode21.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode11, linkedListNode15, (java.lang.Object) linkedListNode21);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList32 = new system.testclass.NodeCachingLinkedList();
        boolean boolean34 = nodeCachingLinkedList32.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode35 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode37 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode38 = linkedListNode37.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode35, linkedListNode36, (java.lang.Object) linkedListNode37);
        java.lang.Object obj40 = linkedListNode36.getValue();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        linkedListNode36.setNextNode(linkedListNode42);
        boolean boolean44 = nodeCachingLinkedList32.remove((java.lang.Object) linkedListNode36);
        linkedListNode31.setNextNode(linkedListNode36);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode46 = linkedListNode31.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode47 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode48 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj49 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode50 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode47, linkedListNode48, obj49);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode51 = linkedListNode50.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode52 = linkedListNode50.getPreviousNode();
        linkedListNode31.setValue((java.lang.Object) linkedListNode50);
        boolean boolean54 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode50);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode1 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj4 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode2, linkedListNode3, obj4);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode1, linkedListNode6, (java.lang.Object) 10);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = linkedListNode10.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj14 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode12, linkedListNode13, obj14);
        linkedListNode12.setValue((java.lang.Object) ' ');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj20 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode18, linkedListNode19, obj20);
        linkedListNode18.setValue((java.lang.Object) ' ');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = linkedListNode18.getPreviousNode();
        linkedListNode12.setPreviousNode(linkedListNode18);
        linkedListNode18.setValue((java.lang.Object) false);
        java.lang.Object obj28 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode10, linkedListNode18, obj28);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = linkedListNode10.getNextNode();
        boolean boolean31 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode10);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = linkedListNode33.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode35 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj37 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode35, linkedListNode36, obj37);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = linkedListNode38.getPreviousNode();
        linkedListNode34.setNextNode(linkedListNode38);
        boolean boolean41 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode34);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList42 = new system.testclass.NodeCachingLinkedList();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode43 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode44 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj45 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode46 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode43, linkedListNode44, obj45);
        java.lang.Object obj47 = linkedListNode43.getValue();
        boolean boolean48 = nodeCachingLinkedList42.remove((java.lang.Object) linkedListNode43);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode49 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode43);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode51 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode52 = linkedListNode51.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode53 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode54 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj55 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode56 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode53, linkedListNode54, obj55);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode57 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode49, linkedListNode51, (java.lang.Object) linkedListNode54);
        boolean boolean58 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode57);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode1 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode2 = linkedListNode1.getNextNode();
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList3 = new system.testclass.NodeCachingLinkedList();
        boolean boolean5 = nodeCachingLinkedList3.remove((java.lang.Object) (byte) 0);
        boolean boolean7 = nodeCachingLinkedList3.remove((java.lang.Object) '4');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = linkedListNode10.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode8, linkedListNode9, (java.lang.Object) linkedListNode10);
        boolean boolean13 = nodeCachingLinkedList3.add((java.lang.Object) linkedListNode9);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) nodeCachingLinkedList3);
        linkedListNode1.setValue((java.lang.Object) nodeCachingLinkedList3);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj18 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode16, linkedListNode17, obj18);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = linkedListNode19.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = linkedListNode20.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = linkedListNode20.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = linkedListNode20.getNextNode();
        boolean boolean24 = nodeCachingLinkedList3.add((java.lang.Object) linkedListNode20);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList3", nodeCachingLinkedList3.repOK_1());
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode1 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj3 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode1, linkedListNode2, obj3);
        java.lang.Object obj5 = linkedListNode1.getValue();
        boolean boolean6 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode1);
        boolean boolean8 = nodeCachingLinkedList0.add((java.lang.Object) "");
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = linkedListNode9.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = linkedListNode11.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = linkedListNode15.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode13, linkedListNode14, (java.lang.Object) linkedListNode15);
        linkedListNode11.setPreviousNode(linkedListNode15);
        linkedListNode9.setValue((java.lang.Object) linkedListNode11);
        java.lang.Object obj20 = linkedListNode9.getValue();
        boolean boolean21 = nodeCachingLinkedList0.remove(obj20);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) nodeCachingLinkedList0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = linkedListNode24.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj28 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode26, linkedListNode27, obj28);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = linkedListNode29.getPreviousNode();
        linkedListNode25.setNextNode(linkedListNode29);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = linkedListNode29.getNextNode();
        boolean boolean33 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode32);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        boolean boolean4 = nodeCachingLinkedList0.remove((java.lang.Object) "hi!");
        boolean boolean6 = nodeCachingLinkedList0.add((java.lang.Object) (short) 10);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = linkedListNode11.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode9, linkedListNode10, (java.lang.Object) linkedListNode11);
        linkedListNode7.setPreviousNode(linkedListNode11);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = linkedListNode11.getPreviousNode();
        boolean boolean16 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode15);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) 100L);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = linkedListNode5.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode3, linkedListNode4, (java.lang.Object) linkedListNode5);
        java.lang.Object obj8 = linkedListNode4.getValue();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        linkedListNode4.setNextNode(linkedListNode10);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = linkedListNode12.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = linkedListNode14.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = linkedListNode18.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode16, linkedListNode17, (java.lang.Object) linkedListNode18);
        linkedListNode14.setPreviousNode(linkedListNode18);
        linkedListNode12.setValue((java.lang.Object) linkedListNode14);
        linkedListNode4.setPreviousNode(linkedListNode12);
        boolean boolean24 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode12);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList25 = new system.testclass.NodeCachingLinkedList();
        boolean boolean27 = nodeCachingLinkedList25.remove((java.lang.Object) (byte) 0);
        boolean boolean29 = nodeCachingLinkedList25.remove((java.lang.Object) "hi!");
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj32 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode30, linkedListNode31, obj32);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode33, linkedListNode34, (java.lang.Object) (short) 0);
        boolean boolean37 = nodeCachingLinkedList25.add((java.lang.Object) linkedListNode34);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj40 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode38, linkedListNode39, obj40);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = linkedListNode41.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode43 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode44 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj45 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode46 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode43, linkedListNode44, obj45);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode47 = linkedListNode46.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode49 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode41, linkedListNode47, (java.lang.Object) 'a');
        boolean boolean50 = nodeCachingLinkedList25.remove((java.lang.Object) linkedListNode41);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode51 = linkedListNode41.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode52 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode53 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj54 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode55 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode52, linkedListNode53, obj54);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode56 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode57 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj58 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode59 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode56, linkedListNode57, obj58);
        linkedListNode56.setValue((java.lang.Object) ' ');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode62 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode41, linkedListNode52, (java.lang.Object) linkedListNode56);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode63 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode56);
        boolean boolean64 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode63);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList1 = new system.testclass.NodeCachingLinkedList();
        boolean boolean3 = nodeCachingLinkedList1.add((java.lang.Object) (short) 1);
        boolean boolean4 = nodeCachingLinkedList0.remove((java.lang.Object) boolean3);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj7 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, obj7);
        linkedListNode8.setValue((java.lang.Object) false);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = linkedListNode11.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = linkedListNode13.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = linkedListNode17.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode15, linkedListNode16, (java.lang.Object) linkedListNode17);
        linkedListNode13.setPreviousNode(linkedListNode17);
        linkedListNode11.setValue((java.lang.Object) linkedListNode13);
        linkedListNode8.setPreviousNode(linkedListNode11);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = linkedListNode24.getNextNode();
        linkedListNode11.setValue((java.lang.Object) linkedListNode24);
        boolean boolean27 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode11);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList28 = new system.testclass.NodeCachingLinkedList();
        boolean boolean30 = nodeCachingLinkedList28.add((java.lang.Object) (short) 1);
        boolean boolean31 = nodeCachingLinkedList0.remove((java.lang.Object) nodeCachingLinkedList28);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = linkedListNode32.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = linkedListNode32.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode35 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode36 = linkedListNode35.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode37 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode38 = linkedListNode37.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode40 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = linkedListNode41.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode43 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode39, linkedListNode40, (java.lang.Object) linkedListNode41);
        linkedListNode37.setPreviousNode(linkedListNode41);
        linkedListNode35.setValue((java.lang.Object) linkedListNode37);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode46 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode47 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj48 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode49 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode46, linkedListNode47, obj48);
        linkedListNode46.setValue((java.lang.Object) ' ');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode52 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode53 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj54 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode55 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode52, linkedListNode53, obj54);
        linkedListNode52.setValue((java.lang.Object) ' ');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode58 = linkedListNode52.getPreviousNode();
        linkedListNode46.setPreviousNode(linkedListNode52);
        linkedListNode37.setPreviousNode(linkedListNode52);
        linkedListNode32.setPreviousNode(linkedListNode37);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList62 = new system.testclass.NodeCachingLinkedList();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode63 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode64 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj65 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode66 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode63, linkedListNode64, obj65);
        java.lang.Object obj67 = linkedListNode63.getValue();
        boolean boolean68 = nodeCachingLinkedList62.remove((java.lang.Object) linkedListNode63);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode69 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode63);
        java.lang.Object obj70 = linkedListNode69.getValue();
        linkedListNode37.setNextNode(linkedListNode69);
        boolean boolean72 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode37);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode1 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj3 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode1, linkedListNode2, obj3);
        java.lang.Object obj5 = linkedListNode1.getValue();
        boolean boolean6 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode1);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList7 = new system.testclass.NodeCachingLinkedList();
        boolean boolean9 = nodeCachingLinkedList7.remove((java.lang.Object) (byte) 0);
        boolean boolean11 = nodeCachingLinkedList7.remove((java.lang.Object) "hi!");
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj14 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode12, linkedListNode13, obj14);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode15, linkedListNode16, (java.lang.Object) (short) 0);
        boolean boolean19 = nodeCachingLinkedList7.add((java.lang.Object) linkedListNode16);
        boolean boolean20 = nodeCachingLinkedList0.remove((java.lang.Object) nodeCachingLinkedList7);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) nodeCachingLinkedList7);
        boolean boolean23 = nodeCachingLinkedList7.add((java.lang.Object) 0.0d);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList7", nodeCachingLinkedList7.repOK_1());
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        boolean boolean4 = nodeCachingLinkedList0.remove((java.lang.Object) "hi!");
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj7 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, obj7);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode8, linkedListNode9, (java.lang.Object) (short) 0);
        boolean boolean12 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode9);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj15 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode13, linkedListNode14, obj15);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = linkedListNode16.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj20 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode18, linkedListNode19, obj20);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = linkedListNode21.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode16, linkedListNode22, (java.lang.Object) 'a');
        boolean boolean25 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode16);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj28 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode26, linkedListNode27, obj28);
        linkedListNode26.setValue((java.lang.Object) ' ');
        boolean boolean32 = nodeCachingLinkedList0.add((java.lang.Object) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode1 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj3 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode1, linkedListNode2, obj3);
        java.lang.Object obj5 = linkedListNode1.getValue();
        boolean boolean6 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode1);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj10 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode8, linkedListNode9, obj10);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode11, linkedListNode12, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode7, linkedListNode12, (java.lang.Object) 10);
        boolean boolean17 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode7);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = linkedListNode18.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = linkedListNode20.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = linkedListNode24.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode22, linkedListNode23, (java.lang.Object) linkedListNode24);
        linkedListNode20.setPreviousNode(linkedListNode24);
        linkedListNode18.setValue((java.lang.Object) linkedListNode20);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = linkedListNode18.getNextNode();
        java.lang.Object obj30 = linkedListNode18.getValue();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = linkedListNode18.getPreviousNode();
        boolean boolean32 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode31);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList33 = new system.testclass.NodeCachingLinkedList();
        boolean boolean35 = nodeCachingLinkedList33.remove((java.lang.Object) (byte) 0);
        boolean boolean37 = nodeCachingLinkedList33.remove((java.lang.Object) "hi!");
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj40 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode38, linkedListNode39, obj40);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode44 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode41, linkedListNode42, (java.lang.Object) (short) 0);
        boolean boolean45 = nodeCachingLinkedList33.add((java.lang.Object) linkedListNode42);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode46 = linkedListNode42.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode48 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode49 = linkedListNode48.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode50 = linkedListNode49.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode51 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode52 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode53 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode54 = linkedListNode53.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode55 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode51, linkedListNode52, (java.lang.Object) linkedListNode53);
        java.lang.Object obj56 = linkedListNode53.getValue();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode57 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode58 = linkedListNode57.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode59 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode60 = linkedListNode59.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode61 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode62 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode63 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode64 = linkedListNode63.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode65 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode61, linkedListNode62, (java.lang.Object) linkedListNode63);
        linkedListNode59.setPreviousNode(linkedListNode63);
        linkedListNode57.setValue((java.lang.Object) linkedListNode59);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode68 = linkedListNode59.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode69 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode49, linkedListNode53, (java.lang.Object) linkedListNode59);
        linkedListNode42.setValue((java.lang.Object) linkedListNode59);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode71 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode72 = linkedListNode71.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode74 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode42, linkedListNode72, (java.lang.Object) (short) 100);
        boolean boolean75 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode42);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        boolean boolean4 = nodeCachingLinkedList0.remove((java.lang.Object) '4');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, (java.lang.Object) linkedListNode7);
        boolean boolean10 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode6);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = linkedListNode11.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = linkedListNode13.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = linkedListNode17.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode15, linkedListNode16, (java.lang.Object) linkedListNode17);
        linkedListNode13.setPreviousNode(linkedListNode17);
        linkedListNode11.setValue((java.lang.Object) linkedListNode13);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode11);
        boolean boolean23 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode22);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode1 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj4 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode2, linkedListNode3, obj4);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode1, linkedListNode6, (java.lang.Object) 10);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = linkedListNode10.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj14 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode12, linkedListNode13, obj14);
        linkedListNode12.setValue((java.lang.Object) ' ');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj20 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode18, linkedListNode19, obj20);
        linkedListNode18.setValue((java.lang.Object) ' ');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = linkedListNode18.getPreviousNode();
        linkedListNode12.setPreviousNode(linkedListNode18);
        linkedListNode18.setValue((java.lang.Object) false);
        java.lang.Object obj28 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode10, linkedListNode18, obj28);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = linkedListNode10.getNextNode();
        boolean boolean31 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode10);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj35 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode33, linkedListNode34, obj35);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode37 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode36, linkedListNode37, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode32, linkedListNode37, (java.lang.Object) 10);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = linkedListNode32.getPreviousNode();
        boolean boolean43 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode32);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList44 = new system.testclass.NodeCachingLinkedList();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode45 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode46 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj47 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode48 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode45, linkedListNode46, obj47);
        linkedListNode48.setValue((java.lang.Object) false);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode51 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode52 = linkedListNode51.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode53 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode54 = linkedListNode53.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode55 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode56 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode57 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode58 = linkedListNode57.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode59 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode55, linkedListNode56, (java.lang.Object) linkedListNode57);
        linkedListNode53.setPreviousNode(linkedListNode57);
        linkedListNode51.setValue((java.lang.Object) linkedListNode53);
        linkedListNode48.setPreviousNode(linkedListNode53);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode63 = linkedListNode53.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode64 = linkedListNode53.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode65 = linkedListNode64.getNextNode();
        boolean boolean66 = nodeCachingLinkedList44.add((java.lang.Object) linkedListNode64);
        boolean boolean67 = nodeCachingLinkedList0.add((java.lang.Object) nodeCachingLinkedList44);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        boolean boolean4 = nodeCachingLinkedList0.remove((java.lang.Object) '4');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, (java.lang.Object) linkedListNode7);
        boolean boolean10 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode6);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) nodeCachingLinkedList0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) nodeCachingLinkedList0);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList13 = new system.testclass.NodeCachingLinkedList();
        boolean boolean15 = nodeCachingLinkedList13.remove((java.lang.Object) (byte) 0);
        boolean boolean17 = nodeCachingLinkedList13.remove((java.lang.Object) "hi!");
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj20 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode18, linkedListNode19, obj20);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode21, linkedListNode22, (java.lang.Object) (short) 0);
        boolean boolean25 = nodeCachingLinkedList13.add((java.lang.Object) linkedListNode22);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj28 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode26, linkedListNode27, obj28);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = linkedListNode29.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj33 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode31, linkedListNode32, obj33);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode35 = linkedListNode34.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode37 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode29, linkedListNode35, (java.lang.Object) 'a');
        boolean boolean38 = nodeCachingLinkedList13.remove((java.lang.Object) linkedListNode29);
        boolean boolean39 = nodeCachingLinkedList0.remove((java.lang.Object) nodeCachingLinkedList13);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode40 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = linkedListNode40.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode43 = linkedListNode42.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode44 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode45 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode46 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode47 = linkedListNode46.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode48 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode44, linkedListNode45, (java.lang.Object) linkedListNode46);
        linkedListNode42.setPreviousNode(linkedListNode46);
        linkedListNode40.setValue((java.lang.Object) linkedListNode42);
        boolean boolean51 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode42);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode1 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 1.0f);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode2 = linkedListNode1.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj5 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode3, linkedListNode4, obj5);
        linkedListNode3.setValue((java.lang.Object) ' ');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj11 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode9, linkedListNode10, obj11);
        linkedListNode9.setValue((java.lang.Object) ' ');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = linkedListNode9.getPreviousNode();
        linkedListNode3.setPreviousNode(linkedListNode9);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = linkedListNode19.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode17, linkedListNode18, (java.lang.Object) linkedListNode19);
        linkedListNode9.setNextNode(linkedListNode21);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = linkedListNode9.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = null;
        linkedListNode9.setNextNode(linkedListNode24);
        linkedListNode2.setPreviousNode(linkedListNode9);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList27 = new system.testclass.NodeCachingLinkedList();
        boolean boolean29 = nodeCachingLinkedList27.remove((java.lang.Object) (byte) 0);
        boolean boolean31 = nodeCachingLinkedList27.remove((java.lang.Object) "hi!");
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj34 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode35 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode32, linkedListNode33, obj34);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode35, linkedListNode36, (java.lang.Object) (short) 0);
        boolean boolean39 = nodeCachingLinkedList27.add((java.lang.Object) linkedListNode36);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode40 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj42 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode43 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode40, linkedListNode41, obj42);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode44 = linkedListNode43.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode45 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode46 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj47 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode48 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode45, linkedListNode46, obj47);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode49 = linkedListNode48.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode51 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode43, linkedListNode49, (java.lang.Object) 'a');
        boolean boolean52 = nodeCachingLinkedList27.remove((java.lang.Object) linkedListNode43);
        linkedListNode9.setValue((java.lang.Object) nodeCachingLinkedList27);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList54 = new system.testclass.NodeCachingLinkedList();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode55 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode56 = linkedListNode55.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode57 = linkedListNode56.getPreviousNode();
        boolean boolean58 = nodeCachingLinkedList54.remove((java.lang.Object) linkedListNode56);
        boolean boolean59 = nodeCachingLinkedList27.add((java.lang.Object) nodeCachingLinkedList54);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList27", nodeCachingLinkedList27.repOK_1());
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = linkedListNode5.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode3, linkedListNode4, (java.lang.Object) linkedListNode5);
        java.lang.Object obj8 = linkedListNode4.getValue();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        linkedListNode4.setNextNode(linkedListNode10);
        boolean boolean12 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode4);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList13 = new system.testclass.NodeCachingLinkedList();
        boolean boolean15 = nodeCachingLinkedList13.remove((java.lang.Object) (byte) 0);
        boolean boolean17 = nodeCachingLinkedList13.remove((java.lang.Object) "hi!");
        boolean boolean18 = nodeCachingLinkedList0.add((java.lang.Object) nodeCachingLinkedList13);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj22 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode20, linkedListNode21, obj22);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode23, linkedListNode24, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode19, linkedListNode24, (java.lang.Object) 10);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj31 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode29, linkedListNode30, obj31);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode35 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode32, linkedListNode33, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode36 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode37 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = linkedListNode38.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode40 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode36, linkedListNode37, (java.lang.Object) linkedListNode38);
        linkedListNode33.setValue((java.lang.Object) linkedListNode40);
        linkedListNode28.setNextNode(linkedListNode33);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode43 = linkedListNode28.getPreviousNode();
        boolean boolean44 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode28);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList45 = new system.testclass.NodeCachingLinkedList();
        boolean boolean47 = nodeCachingLinkedList45.remove((java.lang.Object) 100L);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode48 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode49 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj50 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode51 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode48, linkedListNode49, obj50);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode52 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode54 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode51, linkedListNode52, (java.lang.Object) (short) 0);
        java.lang.Class<?> wildcardClass55 = linkedListNode54.getClass();
        boolean boolean56 = nodeCachingLinkedList45.remove((java.lang.Object) wildcardClass55);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode58 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode59 = linkedListNode58.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode60 = linkedListNode59.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode61 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode62 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode63 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode64 = linkedListNode63.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode65 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode61, linkedListNode62, (java.lang.Object) linkedListNode63);
        java.lang.Object obj66 = linkedListNode63.getValue();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode67 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode68 = linkedListNode67.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode69 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode70 = linkedListNode69.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode71 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode72 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode73 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode74 = linkedListNode73.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode75 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode71, linkedListNode72, (java.lang.Object) linkedListNode73);
        linkedListNode69.setPreviousNode(linkedListNode73);
        linkedListNode67.setValue((java.lang.Object) linkedListNode69);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode78 = linkedListNode69.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode79 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode59, linkedListNode63, (java.lang.Object) linkedListNode69);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode80 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode59);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode81 = linkedListNode59.getPreviousNode();
        boolean boolean82 = nodeCachingLinkedList45.add((java.lang.Object) linkedListNode59);
        boolean boolean83 = nodeCachingLinkedList0.add((java.lang.Object) boolean82);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList1 = new system.testclass.NodeCachingLinkedList();
        boolean boolean3 = nodeCachingLinkedList1.add((java.lang.Object) (short) 1);
        boolean boolean4 = nodeCachingLinkedList0.remove((java.lang.Object) boolean3);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj7 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, obj7);
        linkedListNode8.setValue((java.lang.Object) false);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = linkedListNode11.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = linkedListNode13.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = linkedListNode17.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode15, linkedListNode16, (java.lang.Object) linkedListNode17);
        linkedListNode13.setPreviousNode(linkedListNode17);
        linkedListNode11.setValue((java.lang.Object) linkedListNode13);
        linkedListNode8.setPreviousNode(linkedListNode11);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = linkedListNode24.getNextNode();
        linkedListNode11.setValue((java.lang.Object) linkedListNode24);
        boolean boolean27 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode11);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList28 = new system.testclass.NodeCachingLinkedList();
        boolean boolean30 = nodeCachingLinkedList28.add((java.lang.Object) (short) 1);
        boolean boolean31 = nodeCachingLinkedList0.remove((java.lang.Object) nodeCachingLinkedList28);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList32 = new system.testclass.NodeCachingLinkedList();
        boolean boolean34 = nodeCachingLinkedList32.remove((java.lang.Object) (byte) 0);
        boolean boolean36 = nodeCachingLinkedList32.remove((java.lang.Object) "hi!");
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode37 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj39 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode40 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode37, linkedListNode38, obj39);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode43 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode40, linkedListNode41, (java.lang.Object) (short) 0);
        boolean boolean44 = nodeCachingLinkedList32.add((java.lang.Object) linkedListNode41);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode45 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode46 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj47 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode48 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode45, linkedListNode46, obj47);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode49 = linkedListNode48.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode50 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode51 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj52 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode53 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode50, linkedListNode51, obj52);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode54 = linkedListNode53.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode56 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode48, linkedListNode54, (java.lang.Object) 'a');
        boolean boolean57 = nodeCachingLinkedList32.remove((java.lang.Object) linkedListNode48);
        boolean boolean58 = nodeCachingLinkedList0.remove((java.lang.Object) nodeCachingLinkedList32);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode60 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode61 = linkedListNode60.getNextNode();
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList62 = new system.testclass.NodeCachingLinkedList();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode63 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode64 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj65 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode66 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode63, linkedListNode64, obj65);
        java.lang.Object obj67 = linkedListNode63.getValue();
        boolean boolean68 = nodeCachingLinkedList62.remove((java.lang.Object) linkedListNode63);
        java.lang.Object obj69 = linkedListNode63.getValue();
        linkedListNode60.setPreviousNode(linkedListNode63);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode71 = linkedListNode63.getNextNode();
        boolean boolean72 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode63);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode73 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode74 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj75 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode76 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode73, linkedListNode74, obj75);
        linkedListNode76.setValue((java.lang.Object) false);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode79 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode80 = linkedListNode79.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode81 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode82 = linkedListNode81.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode83 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode84 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode85 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode86 = linkedListNode85.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode87 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode83, linkedListNode84, (java.lang.Object) linkedListNode85);
        linkedListNode81.setPreviousNode(linkedListNode85);
        linkedListNode79.setValue((java.lang.Object) linkedListNode81);
        linkedListNode76.setPreviousNode(linkedListNode81);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode91 = linkedListNode81.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode92 = linkedListNode81.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode93 = linkedListNode92.getNextNode();
        boolean boolean94 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode92);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList1 = new system.testclass.NodeCachingLinkedList();
        boolean boolean3 = nodeCachingLinkedList1.add((java.lang.Object) (short) 1);
        boolean boolean4 = nodeCachingLinkedList0.remove((java.lang.Object) boolean3);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj8 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode6, linkedListNode7, obj8);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode9, linkedListNode10, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode10, (java.lang.Object) 10);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = linkedListNode14.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = linkedListNode18.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode16, linkedListNode17, (java.lang.Object) linkedListNode18);
        java.lang.Object obj21 = linkedListNode17.getValue();
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList22 = new system.testclass.NodeCachingLinkedList();
        boolean boolean24 = nodeCachingLinkedList22.remove((java.lang.Object) (byte) 0);
        boolean boolean26 = nodeCachingLinkedList22.remove((java.lang.Object) "hi!");
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj29 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode27, linkedListNode28, obj29);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode30, linkedListNode31, (java.lang.Object) (short) 0);
        boolean boolean34 = nodeCachingLinkedList22.add((java.lang.Object) linkedListNode31);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList35 = new system.testclass.NodeCachingLinkedList();
        boolean boolean37 = nodeCachingLinkedList35.remove((java.lang.Object) (byte) 0);
        boolean boolean39 = nodeCachingLinkedList35.remove((java.lang.Object) "hi!");
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode40 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj42 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode43 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode40, linkedListNode41, obj42);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode44 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode46 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode43, linkedListNode44, (java.lang.Object) (short) 0);
        boolean boolean47 = nodeCachingLinkedList35.add((java.lang.Object) linkedListNode44);
        linkedListNode31.setPreviousNode(linkedListNode44);
        linkedListNode17.setPreviousNode(linkedListNode44);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode50 = linkedListNode17.getNextNode();
        linkedListNode14.setNextNode(linkedListNode17);
        boolean boolean52 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode14);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode54 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode55 = linkedListNode54.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode56 = linkedListNode55.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode57 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode58 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode59 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode60 = linkedListNode59.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode61 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode57, linkedListNode58, (java.lang.Object) linkedListNode59);
        java.lang.Object obj62 = linkedListNode59.getValue();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode63 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode64 = linkedListNode63.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode65 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode66 = linkedListNode65.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode67 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode68 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode69 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode70 = linkedListNode69.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode71 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode67, linkedListNode68, (java.lang.Object) linkedListNode69);
        linkedListNode65.setPreviousNode(linkedListNode69);
        linkedListNode63.setValue((java.lang.Object) linkedListNode65);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode74 = linkedListNode65.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode75 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode55, linkedListNode59, (java.lang.Object) linkedListNode65);
        java.lang.Class<?> wildcardClass76 = linkedListNode59.getClass();
        boolean boolean77 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode59);
        boolean boolean79 = nodeCachingLinkedList0.remove((java.lang.Object) 1.0f);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode80 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode81 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj82 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode83 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode80, linkedListNode81, obj82);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode84 = linkedListNode83.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode85 = linkedListNode84.getPreviousNode();
        boolean boolean86 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode85);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode1 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj3 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode1, linkedListNode2, obj3);
        linkedListNode4.setValue((java.lang.Object) false);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = linkedListNode9.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = linkedListNode13.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode11, linkedListNode12, (java.lang.Object) linkedListNode13);
        linkedListNode9.setPreviousNode(linkedListNode13);
        linkedListNode7.setValue((java.lang.Object) linkedListNode9);
        linkedListNode4.setPreviousNode(linkedListNode9);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = linkedListNode9.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = linkedListNode9.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = linkedListNode20.getNextNode();
        boolean boolean22 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode20);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList23 = new system.testclass.NodeCachingLinkedList();
        boolean boolean25 = nodeCachingLinkedList23.remove((java.lang.Object) (byte) 0);
        boolean boolean27 = nodeCachingLinkedList23.remove((java.lang.Object) "hi!");
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj30 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode28, linkedListNode29, obj30);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode31, linkedListNode32, (java.lang.Object) (short) 0);
        boolean boolean35 = nodeCachingLinkedList23.add((java.lang.Object) linkedListNode32);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode37 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj38 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode36, linkedListNode37, obj38);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode40 = linkedListNode39.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj43 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode44 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode41, linkedListNode42, obj43);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode45 = linkedListNode44.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode47 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode39, linkedListNode45, (java.lang.Object) 'a');
        boolean boolean48 = nodeCachingLinkedList23.remove((java.lang.Object) linkedListNode39);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode49 = linkedListNode39.getPreviousNode();
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList50 = new system.testclass.NodeCachingLinkedList();
        boolean boolean52 = nodeCachingLinkedList50.remove((java.lang.Object) (byte) 0);
        boolean boolean54 = nodeCachingLinkedList50.remove((java.lang.Object) '4');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode55 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode56 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode57 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode58 = linkedListNode57.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode59 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode55, linkedListNode56, (java.lang.Object) linkedListNode57);
        boolean boolean60 = nodeCachingLinkedList50.add((java.lang.Object) linkedListNode56);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode61 = linkedListNode56.getNextNode();
        linkedListNode49.setPreviousNode(linkedListNode56);
        boolean boolean63 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode56);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        boolean boolean4 = nodeCachingLinkedList0.remove((java.lang.Object) '4');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, (java.lang.Object) linkedListNode7);
        boolean boolean10 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode6);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = linkedListNode11.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = linkedListNode13.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = linkedListNode17.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode15, linkedListNode16, (java.lang.Object) linkedListNode17);
        linkedListNode13.setPreviousNode(linkedListNode17);
        linkedListNode11.setValue((java.lang.Object) linkedListNode13);
        boolean boolean22 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode13);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = linkedListNode24.getNextNode();
        java.lang.Class<?> wildcardClass26 = linkedListNode25.getClass();
        boolean boolean27 = nodeCachingLinkedList0.remove((java.lang.Object) wildcardClass26);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList28 = new system.testclass.NodeCachingLinkedList();
        boolean boolean30 = nodeCachingLinkedList28.remove((java.lang.Object) (byte) 0);
        boolean boolean32 = nodeCachingLinkedList28.remove((java.lang.Object) "hi!");
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj35 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode33, linkedListNode34, obj35);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode37 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode36, linkedListNode37, (java.lang.Object) (short) 0);
        boolean boolean40 = nodeCachingLinkedList28.add((java.lang.Object) linkedListNode37);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList41 = new system.testclass.NodeCachingLinkedList();
        boolean boolean43 = nodeCachingLinkedList41.remove((java.lang.Object) (byte) 0);
        boolean boolean45 = nodeCachingLinkedList41.remove((java.lang.Object) "hi!");
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode46 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode47 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj48 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode49 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode46, linkedListNode47, obj48);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode50 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode52 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode49, linkedListNode50, (java.lang.Object) (short) 0);
        boolean boolean53 = nodeCachingLinkedList41.add((java.lang.Object) linkedListNode50);
        linkedListNode37.setPreviousNode(linkedListNode50);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode55 = linkedListNode37.getPreviousNode();
        boolean boolean56 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode37);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode58 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode59 = linkedListNode58.getNextNode();
        java.lang.Class<?> wildcardClass60 = linkedListNode59.getClass();
        boolean boolean61 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode59);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode62 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode63 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode64 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode65 = linkedListNode64.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode66 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode62, linkedListNode63, (java.lang.Object) linkedListNode64);
        java.lang.Object obj67 = linkedListNode63.getValue();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode69 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        linkedListNode63.setNextNode(linkedListNode69);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode71 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode72 = linkedListNode71.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode73 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode74 = linkedListNode73.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode75 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode76 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode77 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode78 = linkedListNode77.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode79 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode75, linkedListNode76, (java.lang.Object) linkedListNode77);
        linkedListNode73.setPreviousNode(linkedListNode77);
        linkedListNode71.setValue((java.lang.Object) linkedListNode73);
        linkedListNode63.setPreviousNode(linkedListNode71);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode83 = linkedListNode71.getPreviousNode();
        boolean boolean84 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode83);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode1 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj3 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode1, linkedListNode2, obj3);
        java.lang.Object obj5 = linkedListNode1.getValue();
        boolean boolean6 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode1);
        boolean boolean8 = nodeCachingLinkedList0.add((java.lang.Object) "");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList9 = new system.testclass.NodeCachingLinkedList();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj12 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode10, linkedListNode11, obj12);
        java.lang.Object obj14 = linkedListNode10.getValue();
        boolean boolean15 = nodeCachingLinkedList9.remove((java.lang.Object) linkedListNode10);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj19 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode17, linkedListNode18, obj19);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode20, linkedListNode21, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode16, linkedListNode21, (java.lang.Object) 10);
        boolean boolean26 = nodeCachingLinkedList9.remove((java.lang.Object) linkedListNode16);
        java.lang.Object obj27 = linkedListNode16.getValue();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.testclass.NodeCachingLinkedList.LinkedListNode(obj27);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = linkedListNode31.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode29, linkedListNode30, (java.lang.Object) linkedListNode31);
        java.lang.Object obj34 = linkedListNode30.getValue();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        linkedListNode30.setNextNode(linkedListNode36);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = linkedListNode38.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode40 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = linkedListNode40.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode43 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode44 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode45 = linkedListNode44.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode46 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode42, linkedListNode43, (java.lang.Object) linkedListNode44);
        linkedListNode40.setPreviousNode(linkedListNode44);
        linkedListNode38.setValue((java.lang.Object) linkedListNode40);
        linkedListNode30.setPreviousNode(linkedListNode38);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode50 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode51 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj52 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode53 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode50, linkedListNode51, obj52);
        linkedListNode50.setValue((java.lang.Object) ' ');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode56 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode57 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj58 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode59 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode56, linkedListNode57, obj58);
        linkedListNode56.setValue((java.lang.Object) ' ');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode62 = linkedListNode56.getPreviousNode();
        linkedListNode50.setPreviousNode(linkedListNode56);
        java.lang.Class<?> wildcardClass64 = linkedListNode50.getClass();
        linkedListNode30.setValue((java.lang.Object) wildcardClass64);
        java.lang.Object obj66 = linkedListNode30.getValue();
        java.lang.Class<?> wildcardClass67 = obj66.getClass();
        linkedListNode28.setValue((java.lang.Object) wildcardClass67);
        boolean boolean69 = nodeCachingLinkedList0.add((java.lang.Object) wildcardClass67);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        boolean boolean4 = nodeCachingLinkedList0.remove((java.lang.Object) "hi!");
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj7 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, obj7);
        linkedListNode5.setValue((java.lang.Object) ' ');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj13 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode11, linkedListNode12, obj13);
        linkedListNode11.setValue((java.lang.Object) ' ');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = linkedListNode11.getPreviousNode();
        linkedListNode5.setPreviousNode(linkedListNode11);
        linkedListNode11.setValue((java.lang.Object) false);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = linkedListNode11.getPreviousNode();
        boolean boolean22 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode21);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = linkedListNode24.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = linkedListNode24.getNextNode();
        java.lang.Object obj27 = linkedListNode24.getValue();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = linkedListNode30.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode28, linkedListNode29, (java.lang.Object) linkedListNode30);
        java.lang.Object obj33 = linkedListNode29.getValue();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode35 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        linkedListNode29.setNextNode(linkedListNode35);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode37 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode38 = linkedListNode37.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode40 = linkedListNode39.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode43 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode44 = linkedListNode43.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode45 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode41, linkedListNode42, (java.lang.Object) linkedListNode43);
        linkedListNode39.setPreviousNode(linkedListNode43);
        linkedListNode37.setValue((java.lang.Object) linkedListNode39);
        linkedListNode29.setPreviousNode(linkedListNode37);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode49 = linkedListNode37.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode50 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode51 = linkedListNode50.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode52 = linkedListNode50.getNextNode();
        java.lang.Object obj53 = linkedListNode50.getValue();
        linkedListNode37.setValue((java.lang.Object) linkedListNode50);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode55 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode23, linkedListNode24, (java.lang.Object) linkedListNode37);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode56 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode57 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj58 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode59 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode56, linkedListNode57, obj58);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode60 = linkedListNode59.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode61 = linkedListNode59.getPreviousNode();
        linkedListNode61.setValue((java.lang.Object) '#');
        linkedListNode55.setNextNode(linkedListNode61);
        boolean boolean65 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode55);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode1 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode2 = linkedListNode1.getNextNode();
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList3 = new system.testclass.NodeCachingLinkedList();
        boolean boolean5 = nodeCachingLinkedList3.remove((java.lang.Object) (byte) 0);
        boolean boolean7 = nodeCachingLinkedList3.remove((java.lang.Object) '4');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = linkedListNode10.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode8, linkedListNode9, (java.lang.Object) linkedListNode10);
        boolean boolean13 = nodeCachingLinkedList3.add((java.lang.Object) linkedListNode9);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) nodeCachingLinkedList3);
        linkedListNode1.setValue((java.lang.Object) nodeCachingLinkedList3);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = linkedListNode16.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = linkedListNode16.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = linkedListNode19.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = linkedListNode21.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = linkedListNode25.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode23, linkedListNode24, (java.lang.Object) linkedListNode25);
        linkedListNode21.setPreviousNode(linkedListNode25);
        linkedListNode19.setValue((java.lang.Object) linkedListNode21);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj32 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode30, linkedListNode31, obj32);
        linkedListNode30.setValue((java.lang.Object) ' ');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode37 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj38 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode36, linkedListNode37, obj38);
        linkedListNode36.setValue((java.lang.Object) ' ');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = linkedListNode36.getPreviousNode();
        linkedListNode30.setPreviousNode(linkedListNode36);
        linkedListNode21.setPreviousNode(linkedListNode36);
        linkedListNode16.setPreviousNode(linkedListNode21);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode46 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode47 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj48 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode49 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode46, linkedListNode47, obj48);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode50 = linkedListNode49.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode51 = linkedListNode50.getPreviousNode();
        linkedListNode21.setNextNode(linkedListNode51);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList53 = new system.testclass.NodeCachingLinkedList();
        boolean boolean55 = nodeCachingLinkedList53.remove((java.lang.Object) (byte) 0);
        boolean boolean57 = nodeCachingLinkedList53.remove((java.lang.Object) '4');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode58 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode59 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode60 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode61 = linkedListNode60.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode62 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode58, linkedListNode59, (java.lang.Object) linkedListNode60);
        boolean boolean63 = nodeCachingLinkedList53.add((java.lang.Object) linkedListNode59);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode64 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode65 = linkedListNode64.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode66 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode67 = linkedListNode66.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode68 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode69 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode70 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode71 = linkedListNode70.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode72 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode68, linkedListNode69, (java.lang.Object) linkedListNode70);
        linkedListNode66.setPreviousNode(linkedListNode70);
        linkedListNode64.setValue((java.lang.Object) linkedListNode66);
        boolean boolean75 = nodeCachingLinkedList53.remove((java.lang.Object) linkedListNode66);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode77 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode78 = linkedListNode77.getNextNode();
        java.lang.Class<?> wildcardClass79 = linkedListNode78.getClass();
        boolean boolean80 = nodeCachingLinkedList53.remove((java.lang.Object) wildcardClass79);
        linkedListNode51.setValue((java.lang.Object) nodeCachingLinkedList53);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode82 = linkedListNode51.getNextNode();
        boolean boolean83 = nodeCachingLinkedList3.add((java.lang.Object) linkedListNode51);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList3", nodeCachingLinkedList3.repOK_1());
    }
}

