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
        boolean boolean2 = nodeCachingLinkedList0.add((java.lang.Object) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, (java.lang.Object) linkedListNode7);
        linkedListNode3.setPreviousNode(linkedListNode7);
        boolean boolean11 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode7);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj14 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode12, linkedListNode13, obj14);
        java.lang.Object obj16 = linkedListNode12.getValue();
        boolean boolean17 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode12);
        boolean boolean19 = nodeCachingLinkedList0.add((java.lang.Object) "");
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, (java.lang.Object) linkedListNode7);
        linkedListNode3.setPreviousNode(linkedListNode7);
        boolean boolean11 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode7);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj14 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode12, linkedListNode13, obj14);
        java.lang.Object obj16 = linkedListNode12.getValue();
        boolean boolean17 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode12);
        boolean boolean19 = nodeCachingLinkedList0.add((java.lang.Object) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, (java.lang.Object) linkedListNode7);
        linkedListNode3.setPreviousNode(linkedListNode7);
        boolean boolean11 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode7);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj14 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode12, linkedListNode13, obj14);
        java.lang.Object obj16 = linkedListNode12.getValue();
        boolean boolean17 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode12);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = linkedListNode18.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj22 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode20, linkedListNode21, obj22);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode23, linkedListNode24, (java.lang.Object) (short) 0);
        linkedListNode19.setNextNode(linkedListNode23);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = linkedListNode30.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode28, linkedListNode29, (java.lang.Object) linkedListNode30);
        java.lang.Object obj33 = linkedListNode29.getValue();
        linkedListNode19.setPreviousNode(linkedListNode29);
        boolean boolean35 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode29);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList3 = new system.testclass.NodeCachingLinkedList();
        boolean boolean5 = nodeCachingLinkedList3.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = linkedListNode6.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = linkedListNode10.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode8, linkedListNode9, (java.lang.Object) linkedListNode10);
        linkedListNode6.setPreviousNode(linkedListNode10);
        boolean boolean14 = nodeCachingLinkedList3.remove((java.lang.Object) linkedListNode10);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj17 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode15, linkedListNode16, obj17);
        java.lang.Object obj19 = linkedListNode15.getValue();
        boolean boolean20 = nodeCachingLinkedList3.remove((java.lang.Object) linkedListNode15);
        boolean boolean21 = nodeCachingLinkedList0.add((java.lang.Object) boolean20);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, (java.lang.Object) linkedListNode7);
        linkedListNode3.setPreviousNode(linkedListNode7);
        boolean boolean11 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode7);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj14 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode12, linkedListNode13, obj14);
        java.lang.Object obj16 = linkedListNode12.getValue();
        boolean boolean17 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode12);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = linkedListNode18.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj22 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode20, linkedListNode21, obj22);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode23, linkedListNode24, (java.lang.Object) (short) 0);
        linkedListNode19.setNextNode(linkedListNode23);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = linkedListNode23.getNextNode();
        boolean boolean29 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode23);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) 100L);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, (java.lang.Object) linkedListNode7);
        linkedListNode3.setPreviousNode(linkedListNode7);
        boolean boolean11 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode7);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, (java.lang.Object) linkedListNode7);
        linkedListNode3.setPreviousNode(linkedListNode7);
        boolean boolean11 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode7);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj14 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode12, linkedListNode13, obj14);
        linkedListNode12.setValue((java.lang.Object) ' ');
        boolean boolean18 = nodeCachingLinkedList0.remove((java.lang.Object) ' ');
        boolean boolean20 = nodeCachingLinkedList0.add((java.lang.Object) 0.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) 10.0d);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj5 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode3, linkedListNode4, obj5);
        boolean boolean7 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode3);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) 100L);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = linkedListNode4.getPreviousNode();
        boolean boolean6 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode5);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode1 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode1, linkedListNode2, (java.lang.Object) linkedListNode3);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = linkedListNode5.getNextNode();
        linkedListNode5.setValue((java.lang.Object) (short) 1);
        boolean boolean9 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode5);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = linkedListNode10.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj14 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode12, linkedListNode13, obj14);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode15, linkedListNode16, (java.lang.Object) (short) 0);
        linkedListNode11.setNextNode(linkedListNode15);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = linkedListNode15.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode15);
        boolean boolean22 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode15);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, (java.lang.Object) linkedListNode7);
        linkedListNode3.setPreviousNode(linkedListNode7);
        boolean boolean11 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode7);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj14 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode12, linkedListNode13, obj14);
        linkedListNode12.setValue((java.lang.Object) ' ');
        boolean boolean18 = nodeCachingLinkedList0.remove((java.lang.Object) ' ');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj21 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode19, linkedListNode20, obj21);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj25 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode23, linkedListNode24, obj25);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode26, linkedListNode27, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = linkedListNode32.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode35 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj36 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode37 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode34, linkedListNode35, obj36);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode40 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode37, linkedListNode38, (java.lang.Object) (short) 0);
        linkedListNode33.setNextNode(linkedListNode37);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode29, linkedListNode31, (java.lang.Object) linkedListNode33);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode43 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode44 = linkedListNode43.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode45 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode46 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode47 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode48 = linkedListNode47.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode49 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode45, linkedListNode46, (java.lang.Object) linkedListNode47);
        linkedListNode43.setPreviousNode(linkedListNode47);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode51 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode19, linkedListNode33, (java.lang.Object) linkedListNode47);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode52 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode53 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode54 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode55 = linkedListNode54.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode56 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode52, linkedListNode53, (java.lang.Object) linkedListNode54);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode57 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode58 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj59 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode60 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode57, linkedListNode58, obj59);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode61 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode62 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj63 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode64 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode61, linkedListNode62, obj63);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode65 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode67 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode64, linkedListNode65, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode69 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode70 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode71 = linkedListNode70.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode72 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode73 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj74 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode75 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode72, linkedListNode73, obj74);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode76 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode78 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode75, linkedListNode76, (java.lang.Object) (short) 0);
        linkedListNode71.setNextNode(linkedListNode75);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode80 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode67, linkedListNode69, (java.lang.Object) linkedListNode71);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode81 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode82 = linkedListNode81.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode83 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode84 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode85 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode86 = linkedListNode85.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode87 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode83, linkedListNode84, (java.lang.Object) linkedListNode85);
        linkedListNode81.setPreviousNode(linkedListNode85);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode89 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode57, linkedListNode71, (java.lang.Object) linkedListNode85);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode90 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode47, linkedListNode53, (java.lang.Object) linkedListNode89);
        boolean boolean91 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode90);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj5 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode3, linkedListNode4, obj5);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj9 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode7, linkedListNode8, obj9);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode10, linkedListNode11, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = linkedListNode14.getPreviousNode();
        linkedListNode14.setValue((java.lang.Object) 1.0d);
        java.lang.Object obj18 = linkedListNode14.getValue();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = linkedListNode21.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode19, linkedListNode20, (java.lang.Object) linkedListNode21);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = linkedListNode20.getNextNode();
        linkedListNode14.setPreviousNode(linkedListNode24);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList26 = new system.testclass.NodeCachingLinkedList();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = linkedListNode29.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode27, linkedListNode28, (java.lang.Object) linkedListNode29);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = linkedListNode31.getNextNode();
        linkedListNode31.setValue((java.lang.Object) (short) 1);
        boolean boolean35 = nodeCachingLinkedList26.remove((java.lang.Object) linkedListNode31);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode11, linkedListNode14, (java.lang.Object) boolean35);
        linkedListNode6.setNextNode(linkedListNode36);
        boolean boolean38 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode6);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, (java.lang.Object) linkedListNode7);
        linkedListNode3.setPreviousNode(linkedListNode7);
        boolean boolean11 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode7);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj14 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode12, linkedListNode13, obj14);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj18 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode16, linkedListNode17, obj18);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode19, linkedListNode20, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = linkedListNode25.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj29 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode27, linkedListNode28, obj29);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode30, linkedListNode31, (java.lang.Object) (short) 0);
        linkedListNode26.setNextNode(linkedListNode30);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode35 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode22, linkedListNode24, (java.lang.Object) linkedListNode26);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode37 = linkedListNode36.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode38 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode40 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = linkedListNode40.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode38, linkedListNode39, (java.lang.Object) linkedListNode40);
        linkedListNode36.setPreviousNode(linkedListNode40);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode44 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode12, linkedListNode26, (java.lang.Object) linkedListNode40);
        boolean boolean45 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode44);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj7 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, obj7);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode8, linkedListNode9, (java.lang.Object) (short) 0);
        linkedListNode4.setNextNode(linkedListNode8);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode8);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = linkedListNode13.getPreviousNode();
        boolean boolean15 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode14);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj18 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode16, linkedListNode17, obj18);
        linkedListNode16.setValue((java.lang.Object) ' ');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        linkedListNode16.setValue((java.lang.Object) linkedListNode22);
        java.lang.Class<?> wildcardClass24 = linkedListNode22.getClass();
        boolean boolean25 = nodeCachingLinkedList0.add((java.lang.Object) wildcardClass24);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode1 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode1, linkedListNode2, (java.lang.Object) linkedListNode3);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = linkedListNode5.getNextNode();
        linkedListNode5.setValue((java.lang.Object) (short) 1);
        boolean boolean9 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode5);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = linkedListNode12.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode10, linkedListNode11, (java.lang.Object) linkedListNode12);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = linkedListNode11.getNextNode();
        boolean boolean16 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode15);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = linkedListNode21.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode19, linkedListNode20, (java.lang.Object) linkedListNode21);
        java.lang.Object obj24 = linkedListNode20.getValue();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode20);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = linkedListNode25.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj29 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode27, linkedListNode28, obj29);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj33 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode31, linkedListNode32, obj33);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode35 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode37 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode34, linkedListNode35, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode40 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = linkedListNode40.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode43 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj44 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode45 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode42, linkedListNode43, obj44);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode46 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode48 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode45, linkedListNode46, (java.lang.Object) (short) 0);
        linkedListNode41.setNextNode(linkedListNode45);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode50 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode37, linkedListNode39, (java.lang.Object) linkedListNode41);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode51 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode52 = linkedListNode51.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode53 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode54 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode55 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode56 = linkedListNode55.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode57 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode53, linkedListNode54, (java.lang.Object) linkedListNode55);
        linkedListNode51.setPreviousNode(linkedListNode55);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode59 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode27, linkedListNode41, (java.lang.Object) linkedListNode55);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode60 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode61 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj62 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode63 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode60, linkedListNode61, obj62);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode64 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode66 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode63, linkedListNode64, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode68 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode69 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode70 = linkedListNode69.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode71 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode72 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj73 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode74 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode71, linkedListNode72, obj73);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode75 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode77 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode74, linkedListNode75, (java.lang.Object) (short) 0);
        linkedListNode70.setNextNode(linkedListNode74);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode79 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode66, linkedListNode68, (java.lang.Object) linkedListNode70);
        linkedListNode27.setPreviousNode(linkedListNode70);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode81 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode82 = linkedListNode81.getPreviousNode();
        linkedListNode81.setValue((java.lang.Object) 1.0d);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode85 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode26, linkedListNode27, (java.lang.Object) 1.0d);
        linkedListNode18.setNextNode(linkedListNode26);
        boolean boolean87 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode18);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, (java.lang.Object) linkedListNode7);
        linkedListNode3.setPreviousNode(linkedListNode7);
        boolean boolean11 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode7);
        boolean boolean13 = nodeCachingLinkedList0.remove((java.lang.Object) 0.0d);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = linkedListNode16.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode14, linkedListNode15, (java.lang.Object) linkedListNode16);
        java.lang.Object obj19 = linkedListNode16.getValue();
        boolean boolean20 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode16);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList21 = new system.testclass.NodeCachingLinkedList();
        boolean boolean22 = nodeCachingLinkedList0.remove((java.lang.Object) nodeCachingLinkedList21);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = linkedListNode23.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj27 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode25, linkedListNode26, obj27);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode28, linkedListNode29, (java.lang.Object) (short) 0);
        linkedListNode24.setNextNode(linkedListNode28);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = linkedListNode28.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode28);
        boolean boolean35 = nodeCachingLinkedList21.remove((java.lang.Object) linkedListNode28);
        boolean boolean37 = nodeCachingLinkedList21.remove((java.lang.Object) 1);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj40 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode38, linkedListNode39, obj40);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode43 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj44 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode45 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode42, linkedListNode43, obj44);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode46 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode48 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode45, linkedListNode46, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode50 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode51 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode52 = linkedListNode51.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode53 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode54 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj55 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode56 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode53, linkedListNode54, obj55);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode57 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode59 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode56, linkedListNode57, (java.lang.Object) (short) 0);
        linkedListNode52.setNextNode(linkedListNode56);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode61 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode48, linkedListNode50, (java.lang.Object) linkedListNode52);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode62 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode63 = linkedListNode62.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode64 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode65 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode66 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode67 = linkedListNode66.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode68 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode64, linkedListNode65, (java.lang.Object) linkedListNode66);
        linkedListNode62.setPreviousNode(linkedListNode66);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode70 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode38, linkedListNode52, (java.lang.Object) linkedListNode66);
        boolean boolean71 = nodeCachingLinkedList21.add((java.lang.Object) linkedListNode70);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList21", nodeCachingLinkedList21.repOK_1());
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList3 = new system.testclass.NodeCachingLinkedList();
        boolean boolean5 = nodeCachingLinkedList3.remove((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass6 = nodeCachingLinkedList3.getClass();
        boolean boolean7 = nodeCachingLinkedList0.remove((java.lang.Object) wildcardClass6);
        boolean boolean9 = nodeCachingLinkedList0.add((java.lang.Object) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, (java.lang.Object) linkedListNode7);
        linkedListNode3.setPreviousNode(linkedListNode7);
        boolean boolean11 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode7);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj14 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode12, linkedListNode13, obj14);
        java.lang.Object obj16 = linkedListNode12.getValue();
        boolean boolean17 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode12);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = linkedListNode18.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj22 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode20, linkedListNode21, obj22);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode23, linkedListNode24, (java.lang.Object) (short) 0);
        linkedListNode19.setNextNode(linkedListNode23);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode23);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = linkedListNode23.getPreviousNode();
        boolean boolean30 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode29);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, (java.lang.Object) linkedListNode7);
        linkedListNode3.setPreviousNode(linkedListNode7);
        boolean boolean11 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode7);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj14 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode12, linkedListNode13, obj14);
        java.lang.Object obj16 = linkedListNode12.getValue();
        boolean boolean17 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode12);
        boolean boolean19 = nodeCachingLinkedList0.remove((java.lang.Object) (-1.0f));
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList20 = new system.testclass.NodeCachingLinkedList();
        boolean boolean22 = nodeCachingLinkedList20.remove((java.lang.Object) 100L);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj25 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode23, linkedListNode24, obj25);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj29 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode27, linkedListNode28, obj29);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode30, linkedListNode31, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode35 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode37 = linkedListNode36.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj40 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode38, linkedListNode39, obj40);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode44 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode41, linkedListNode42, (java.lang.Object) (short) 0);
        linkedListNode37.setNextNode(linkedListNode41);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode46 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode33, linkedListNode35, (java.lang.Object) linkedListNode37);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode47 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode48 = linkedListNode47.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode49 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode50 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode51 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode52 = linkedListNode51.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode53 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode49, linkedListNode50, (java.lang.Object) linkedListNode51);
        linkedListNode47.setPreviousNode(linkedListNode51);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode55 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode23, linkedListNode37, (java.lang.Object) linkedListNode51);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode56 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode57 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode58 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode59 = linkedListNode58.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode60 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode56, linkedListNode57, (java.lang.Object) linkedListNode58);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode61 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode62 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj63 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode64 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode61, linkedListNode62, obj63);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode65 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode66 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj67 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode68 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode65, linkedListNode66, obj67);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode69 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode71 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode68, linkedListNode69, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode73 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode74 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode75 = linkedListNode74.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode76 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode77 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj78 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode79 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode76, linkedListNode77, obj78);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode80 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode82 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode79, linkedListNode80, (java.lang.Object) (short) 0);
        linkedListNode75.setNextNode(linkedListNode79);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode84 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode71, linkedListNode73, (java.lang.Object) linkedListNode75);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode85 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode86 = linkedListNode85.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode87 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode88 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode89 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode90 = linkedListNode89.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode91 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode87, linkedListNode88, (java.lang.Object) linkedListNode89);
        linkedListNode85.setPreviousNode(linkedListNode89);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode93 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode61, linkedListNode75, (java.lang.Object) linkedListNode89);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode94 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode51, linkedListNode57, (java.lang.Object) linkedListNode93);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode95 = linkedListNode93.getNextNode();
        boolean boolean96 = nodeCachingLinkedList20.remove((java.lang.Object) linkedListNode95);
        boolean boolean97 = nodeCachingLinkedList0.add((java.lang.Object) boolean96);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj7 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, obj7);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode8, linkedListNode9, (java.lang.Object) (short) 0);
        linkedListNode4.setNextNode(linkedListNode8);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode8);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = linkedListNode13.getPreviousNode();
        boolean boolean15 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode14);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList16 = new system.testclass.NodeCachingLinkedList();
        boolean boolean17 = nodeCachingLinkedList0.remove((java.lang.Object) nodeCachingLinkedList16);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = linkedListNode22.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode20, linkedListNode21, (java.lang.Object) linkedListNode22);
        java.lang.Object obj25 = linkedListNode21.getValue();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode21);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = linkedListNode26.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj30 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode28, linkedListNode29, obj30);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj34 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode35 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode32, linkedListNode33, obj34);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode35, linkedListNode36, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode40 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = linkedListNode41.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode43 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode44 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj45 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode46 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode43, linkedListNode44, obj45);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode47 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode49 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode46, linkedListNode47, (java.lang.Object) (short) 0);
        linkedListNode42.setNextNode(linkedListNode46);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode51 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode38, linkedListNode40, (java.lang.Object) linkedListNode42);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode52 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode53 = linkedListNode52.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode54 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode55 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode56 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode57 = linkedListNode56.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode58 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode54, linkedListNode55, (java.lang.Object) linkedListNode56);
        linkedListNode52.setPreviousNode(linkedListNode56);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode60 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode28, linkedListNode42, (java.lang.Object) linkedListNode56);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode61 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode62 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj63 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode64 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode61, linkedListNode62, obj63);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode65 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode67 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode64, linkedListNode65, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode69 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode70 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode71 = linkedListNode70.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode72 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode73 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj74 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode75 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode72, linkedListNode73, obj74);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode76 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode78 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode75, linkedListNode76, (java.lang.Object) (short) 0);
        linkedListNode71.setNextNode(linkedListNode75);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode80 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode67, linkedListNode69, (java.lang.Object) linkedListNode71);
        linkedListNode28.setPreviousNode(linkedListNode71);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode82 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode83 = linkedListNode82.getPreviousNode();
        linkedListNode82.setValue((java.lang.Object) 1.0d);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode86 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode27, linkedListNode28, (java.lang.Object) 1.0d);
        linkedListNode19.setNextNode(linkedListNode27);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode88 = linkedListNode27.getPreviousNode();
        boolean boolean89 = nodeCachingLinkedList16.add((java.lang.Object) linkedListNode88);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList16", nodeCachingLinkedList16.repOK_1());
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, (java.lang.Object) linkedListNode7);
        linkedListNode3.setPreviousNode(linkedListNode7);
        boolean boolean11 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode7);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj14 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode12, linkedListNode13, obj14);
        linkedListNode12.setValue((java.lang.Object) ' ');
        boolean boolean18 = nodeCachingLinkedList0.remove((java.lang.Object) ' ');
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj21 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode19, linkedListNode20, obj21);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode22, linkedListNode23, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = linkedListNode28.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj32 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode30, linkedListNode31, obj32);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode33, linkedListNode34, (java.lang.Object) (short) 0);
        linkedListNode29.setNextNode(linkedListNode33);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode25, linkedListNode27, (java.lang.Object) linkedListNode29);
        boolean boolean39 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode25);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, (java.lang.Object) linkedListNode7);
        linkedListNode3.setPreviousNode(linkedListNode7);
        boolean boolean11 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode7);
        boolean boolean13 = nodeCachingLinkedList0.remove((java.lang.Object) 0.0d);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = linkedListNode16.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode14, linkedListNode15, (java.lang.Object) linkedListNode16);
        java.lang.Object obj19 = linkedListNode16.getValue();
        boolean boolean20 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode16);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList21 = new system.testclass.NodeCachingLinkedList();
        boolean boolean22 = nodeCachingLinkedList0.remove((java.lang.Object) nodeCachingLinkedList21);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj25 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode23, linkedListNode24, obj25);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj29 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode27, linkedListNode28, obj29);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode30, linkedListNode31, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode35 = linkedListNode34.getPreviousNode();
        linkedListNode34.setValue((java.lang.Object) 1.0d);
        java.lang.Object obj38 = linkedListNode34.getValue();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode40 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = linkedListNode41.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode43 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode39, linkedListNode40, (java.lang.Object) linkedListNode41);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode44 = linkedListNode40.getNextNode();
        linkedListNode34.setPreviousNode(linkedListNode44);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList46 = new system.testclass.NodeCachingLinkedList();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode47 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode48 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode49 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode50 = linkedListNode49.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode51 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode47, linkedListNode48, (java.lang.Object) linkedListNode49);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode52 = linkedListNode51.getNextNode();
        linkedListNode51.setValue((java.lang.Object) (short) 1);
        boolean boolean55 = nodeCachingLinkedList46.remove((java.lang.Object) linkedListNode51);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode56 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode31, linkedListNode34, (java.lang.Object) boolean55);
        linkedListNode26.setNextNode(linkedListNode56);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode58 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode26);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode59 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode60 = linkedListNode59.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode61 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode62 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj63 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode64 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode61, linkedListNode62, obj63);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode65 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode67 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode64, linkedListNode65, (java.lang.Object) (short) 0);
        linkedListNode60.setNextNode(linkedListNode64);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode69 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode64);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode70 = linkedListNode69.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode71 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode72 = linkedListNode71.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode73 = linkedListNode72.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode74 = linkedListNode72.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode75 = linkedListNode74.getNextNode();
        linkedListNode70.setNextNode(linkedListNode75);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList77 = new system.testclass.NodeCachingLinkedList();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode78 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode79 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode80 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode81 = linkedListNode80.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode82 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode78, linkedListNode79, (java.lang.Object) linkedListNode80);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode83 = linkedListNode82.getNextNode();
        linkedListNode82.setValue((java.lang.Object) (short) 1);
        boolean boolean86 = nodeCachingLinkedList77.remove((java.lang.Object) linkedListNode82);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode87 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode26, linkedListNode75, (java.lang.Object) boolean86);
        boolean boolean88 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode75);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, (java.lang.Object) linkedListNode7);
        linkedListNode3.setPreviousNode(linkedListNode7);
        boolean boolean11 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode7);
        boolean boolean13 = nodeCachingLinkedList0.remove((java.lang.Object) 0.0d);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = linkedListNode16.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode14, linkedListNode15, (java.lang.Object) linkedListNode16);
        java.lang.Object obj19 = linkedListNode16.getValue();
        boolean boolean20 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode16);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList21 = new system.testclass.NodeCachingLinkedList();
        boolean boolean22 = nodeCachingLinkedList0.remove((java.lang.Object) nodeCachingLinkedList21);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        boolean boolean25 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode24);
        java.lang.Object obj26 = new java.lang.Object();
        boolean boolean27 = nodeCachingLinkedList0.add(obj26);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) 10.0d);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        linkedListNode3.setNextNode(linkedListNode4);
        java.lang.Class<?> wildcardClass6 = linkedListNode4.getClass();
        boolean boolean7 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode4);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj7 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, obj7);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode8, linkedListNode9, (java.lang.Object) (short) 0);
        linkedListNode4.setNextNode(linkedListNode8);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode8);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = linkedListNode13.getPreviousNode();
        boolean boolean15 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode14);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList16 = new system.testclass.NodeCachingLinkedList();
        boolean boolean17 = nodeCachingLinkedList0.remove((java.lang.Object) nodeCachingLinkedList16);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = linkedListNode19.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = linkedListNode20.getPreviousNode();
        java.lang.Class<?> wildcardClass22 = linkedListNode21.getClass();
        boolean boolean23 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode21);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj7 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, obj7);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode8, linkedListNode9, (java.lang.Object) (short) 0);
        linkedListNode4.setNextNode(linkedListNode8);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode8);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = linkedListNode13.getPreviousNode();
        boolean boolean15 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode14);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList16 = new system.testclass.NodeCachingLinkedList();
        boolean boolean17 = nodeCachingLinkedList0.remove((java.lang.Object) nodeCachingLinkedList16);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList18 = new system.testclass.NodeCachingLinkedList();
        boolean boolean20 = nodeCachingLinkedList18.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = linkedListNode21.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = linkedListNode25.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode23, linkedListNode24, (java.lang.Object) linkedListNode25);
        linkedListNode21.setPreviousNode(linkedListNode25);
        boolean boolean29 = nodeCachingLinkedList18.remove((java.lang.Object) linkedListNode25);
        boolean boolean31 = nodeCachingLinkedList18.remove((java.lang.Object) 0.0d);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode35 = linkedListNode34.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode32, linkedListNode33, (java.lang.Object) linkedListNode34);
        java.lang.Object obj37 = linkedListNode34.getValue();
        boolean boolean38 = nodeCachingLinkedList18.remove((java.lang.Object) linkedListNode34);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList39 = new system.testclass.NodeCachingLinkedList();
        boolean boolean40 = nodeCachingLinkedList18.remove((java.lang.Object) nodeCachingLinkedList39);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        boolean boolean43 = nodeCachingLinkedList18.remove((java.lang.Object) linkedListNode42);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode44 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode45 = linkedListNode44.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode46 = linkedListNode45.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode47 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode48 = linkedListNode47.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode49 = linkedListNode48.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode50 = linkedListNode48.getPreviousNode();
        linkedListNode46.setValue((java.lang.Object) linkedListNode50);
        java.lang.Object obj52 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode53 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode42, linkedListNode50, obj52);
        boolean boolean54 = nodeCachingLinkedList16.add((java.lang.Object) linkedListNode53);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList16", nodeCachingLinkedList16.repOK_1());
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, (java.lang.Object) linkedListNode7);
        linkedListNode3.setPreviousNode(linkedListNode7);
        boolean boolean11 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode7);
        boolean boolean13 = nodeCachingLinkedList0.remove((java.lang.Object) 0.0d);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = linkedListNode16.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode14, linkedListNode15, (java.lang.Object) linkedListNode16);
        java.lang.Object obj19 = linkedListNode16.getValue();
        boolean boolean20 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode16);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList21 = new system.testclass.NodeCachingLinkedList();
        boolean boolean22 = nodeCachingLinkedList0.remove((java.lang.Object) nodeCachingLinkedList21);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = linkedListNode23.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj27 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode25, linkedListNode26, obj27);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode28, linkedListNode29, (java.lang.Object) (short) 0);
        linkedListNode24.setNextNode(linkedListNode28);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = linkedListNode28.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode28);
        boolean boolean35 = nodeCachingLinkedList21.remove((java.lang.Object) linkedListNode28);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode37 = linkedListNode36.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj40 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode38, linkedListNode39, obj40);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode44 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode41, linkedListNode42, (java.lang.Object) (short) 0);
        linkedListNode37.setNextNode(linkedListNode41);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode46 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode41);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode47 = linkedListNode41.getPreviousNode();
        boolean boolean48 = nodeCachingLinkedList21.remove((java.lang.Object) linkedListNode41);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode49 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        boolean boolean50 = nodeCachingLinkedList21.remove((java.lang.Object) linkedListNode49);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode51 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode52 = linkedListNode51.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode53 = linkedListNode52.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode54 = linkedListNode52.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode55 = linkedListNode54.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode56 = linkedListNode54.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode57 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode58 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj59 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode60 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode57, linkedListNode58, obj59);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode61 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode63 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode60, linkedListNode61, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode64 = linkedListNode60.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode65 = linkedListNode64.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode66 = linkedListNode64.getPreviousNode();
        linkedListNode54.setNextNode(linkedListNode64);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode68 = linkedListNode54.getPreviousNode();
        boolean boolean69 = nodeCachingLinkedList21.add((java.lang.Object) linkedListNode68);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList21", nodeCachingLinkedList21.repOK_1());
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj7 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, obj7);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode8, linkedListNode9, (java.lang.Object) (short) 0);
        linkedListNode4.setNextNode(linkedListNode8);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode8);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = linkedListNode13.getPreviousNode();
        boolean boolean15 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode14);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList16 = new system.testclass.NodeCachingLinkedList();
        boolean boolean18 = nodeCachingLinkedList16.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = linkedListNode19.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = linkedListNode23.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode21, linkedListNode22, (java.lang.Object) linkedListNode23);
        linkedListNode19.setPreviousNode(linkedListNode23);
        boolean boolean27 = nodeCachingLinkedList16.remove((java.lang.Object) linkedListNode23);
        boolean boolean29 = nodeCachingLinkedList16.remove((java.lang.Object) 0.0d);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = linkedListNode32.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode30, linkedListNode31, (java.lang.Object) linkedListNode32);
        java.lang.Object obj35 = linkedListNode32.getValue();
        boolean boolean36 = nodeCachingLinkedList16.remove((java.lang.Object) linkedListNode32);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList37 = new system.testclass.NodeCachingLinkedList();
        boolean boolean38 = nodeCachingLinkedList16.remove((java.lang.Object) nodeCachingLinkedList37);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode40 = linkedListNode39.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj43 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode44 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode41, linkedListNode42, obj43);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode45 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode47 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode44, linkedListNode45, (java.lang.Object) (short) 0);
        linkedListNode40.setNextNode(linkedListNode44);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode49 = linkedListNode44.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode50 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode44);
        boolean boolean51 = nodeCachingLinkedList37.remove((java.lang.Object) linkedListNode44);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList52 = new system.testclass.NodeCachingLinkedList();
        boolean boolean54 = nodeCachingLinkedList52.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode55 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode56 = linkedListNode55.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode57 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode58 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode59 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode60 = linkedListNode59.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode61 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode57, linkedListNode58, (java.lang.Object) linkedListNode59);
        linkedListNode55.setPreviousNode(linkedListNode59);
        boolean boolean63 = nodeCachingLinkedList52.remove((java.lang.Object) linkedListNode59);
        boolean boolean65 = nodeCachingLinkedList52.remove((java.lang.Object) 0.0d);
        boolean boolean66 = nodeCachingLinkedList37.remove((java.lang.Object) nodeCachingLinkedList52);
        boolean boolean67 = nodeCachingLinkedList0.add((java.lang.Object) nodeCachingLinkedList52);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, (java.lang.Object) linkedListNode7);
        linkedListNode3.setPreviousNode(linkedListNode7);
        boolean boolean11 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode7);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj14 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode12, linkedListNode13, obj14);
        java.lang.Object obj16 = linkedListNode12.getValue();
        boolean boolean17 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode12);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = linkedListNode20.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode18, linkedListNode19, (java.lang.Object) linkedListNode20);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = linkedListNode19.getNextNode();
        boolean boolean24 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode19);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, (java.lang.Object) linkedListNode7);
        linkedListNode3.setPreviousNode(linkedListNode7);
        boolean boolean11 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode7);
        boolean boolean13 = nodeCachingLinkedList0.remove((java.lang.Object) 0.0d);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = linkedListNode16.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode14, linkedListNode15, (java.lang.Object) linkedListNode16);
        java.lang.Object obj19 = linkedListNode16.getValue();
        boolean boolean20 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode16);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList21 = new system.testclass.NodeCachingLinkedList();
        boolean boolean22 = nodeCachingLinkedList0.remove((java.lang.Object) nodeCachingLinkedList21);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList23 = new system.testclass.NodeCachingLinkedList();
        boolean boolean25 = nodeCachingLinkedList23.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = linkedListNode26.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = linkedListNode30.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode28, linkedListNode29, (java.lang.Object) linkedListNode30);
        linkedListNode26.setPreviousNode(linkedListNode30);
        boolean boolean34 = nodeCachingLinkedList23.remove((java.lang.Object) linkedListNode30);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode35 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj37 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode35, linkedListNode36, obj37);
        java.lang.Object obj39 = linkedListNode35.getValue();
        boolean boolean40 = nodeCachingLinkedList23.remove((java.lang.Object) linkedListNode35);
        boolean boolean41 = nodeCachingLinkedList21.remove((java.lang.Object) boolean40);
        java.lang.Object obj42 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode43 = new system.testclass.NodeCachingLinkedList.LinkedListNode(obj42);
        java.lang.Object obj44 = linkedListNode43.getValue();
        boolean boolean45 = nodeCachingLinkedList21.remove((java.lang.Object) linkedListNode43);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode46 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode47 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj48 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode49 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode46, linkedListNode47, obj48);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode50 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode52 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode49, linkedListNode50, (java.lang.Object) (short) 0);
        boolean boolean53 = nodeCachingLinkedList21.add((java.lang.Object) linkedListNode52);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList21", nodeCachingLinkedList21.repOK_1());
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        linkedListNode3.setValue((java.lang.Object) 1.0d);
        java.lang.Object obj7 = linkedListNode3.getValue();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = linkedListNode10.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode8, linkedListNode9, (java.lang.Object) linkedListNode10);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = linkedListNode9.getNextNode();
        linkedListNode3.setPreviousNode(linkedListNode13);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj17 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode15, linkedListNode16, obj17);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj21 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode19, linkedListNode20, obj21);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode22, linkedListNode23, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = linkedListNode28.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj32 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode30, linkedListNode31, obj32);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode33, linkedListNode34, (java.lang.Object) (short) 0);
        linkedListNode29.setNextNode(linkedListNode33);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode25, linkedListNode27, (java.lang.Object) linkedListNode29);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode40 = linkedListNode39.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode43 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode44 = linkedListNode43.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode45 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode41, linkedListNode42, (java.lang.Object) linkedListNode43);
        linkedListNode39.setPreviousNode(linkedListNode43);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode47 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode15, linkedListNode29, (java.lang.Object) linkedListNode43);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode48 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode49 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj50 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode51 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode48, linkedListNode49, obj50);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode52 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode54 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode51, linkedListNode52, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode56 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode57 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode58 = linkedListNode57.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode59 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode60 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj61 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode62 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode59, linkedListNode60, obj61);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode63 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode65 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode62, linkedListNode63, (java.lang.Object) (short) 0);
        linkedListNode58.setNextNode(linkedListNode62);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode67 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode54, linkedListNode56, (java.lang.Object) linkedListNode58);
        linkedListNode15.setPreviousNode(linkedListNode58);
        linkedListNode13.setValue((java.lang.Object) linkedListNode58);
        boolean boolean70 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode58);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList71 = new system.testclass.NodeCachingLinkedList();
        boolean boolean73 = nodeCachingLinkedList71.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList74 = new system.testclass.NodeCachingLinkedList();
        boolean boolean76 = nodeCachingLinkedList74.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList77 = new system.testclass.NodeCachingLinkedList();
        boolean boolean79 = nodeCachingLinkedList77.remove((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass80 = nodeCachingLinkedList77.getClass();
        boolean boolean81 = nodeCachingLinkedList74.remove((java.lang.Object) wildcardClass80);
        boolean boolean82 = nodeCachingLinkedList71.remove((java.lang.Object) nodeCachingLinkedList74);
        boolean boolean83 = nodeCachingLinkedList0.add((java.lang.Object) nodeCachingLinkedList71);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, (java.lang.Object) linkedListNode7);
        linkedListNode3.setPreviousNode(linkedListNode7);
        boolean boolean11 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode7);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj14 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode12, linkedListNode13, obj14);
        linkedListNode12.setValue((java.lang.Object) ' ');
        boolean boolean18 = nodeCachingLinkedList0.remove((java.lang.Object) ' ');
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList19 = new system.testclass.NodeCachingLinkedList();
        boolean boolean21 = nodeCachingLinkedList19.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = linkedListNode22.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = linkedListNode26.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode24, linkedListNode25, (java.lang.Object) linkedListNode26);
        linkedListNode22.setPreviousNode(linkedListNode26);
        boolean boolean30 = nodeCachingLinkedList19.remove((java.lang.Object) linkedListNode26);
        boolean boolean32 = nodeCachingLinkedList19.remove((java.lang.Object) 0.0d);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode35 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode36 = linkedListNode35.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode37 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode33, linkedListNode34, (java.lang.Object) linkedListNode35);
        java.lang.Object obj38 = linkedListNode35.getValue();
        boolean boolean39 = nodeCachingLinkedList19.remove((java.lang.Object) linkedListNode35);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode40 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode35);
        boolean boolean41 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode35);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode43 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj44 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode45 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode42, linkedListNode43, obj44);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode46 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode48 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode45, linkedListNode46, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode49 = linkedListNode45.getPreviousNode();
        boolean boolean50 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode45);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, (java.lang.Object) linkedListNode7);
        linkedListNode3.setPreviousNode(linkedListNode7);
        boolean boolean11 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode7);
        boolean boolean13 = nodeCachingLinkedList0.remove((java.lang.Object) 0.0d);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = linkedListNode16.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode14, linkedListNode15, (java.lang.Object) linkedListNode16);
        java.lang.Object obj19 = linkedListNode16.getValue();
        boolean boolean20 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode16);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList21 = new system.testclass.NodeCachingLinkedList();
        boolean boolean22 = nodeCachingLinkedList0.remove((java.lang.Object) nodeCachingLinkedList21);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList23 = new system.testclass.NodeCachingLinkedList();
        boolean boolean24 = nodeCachingLinkedList21.remove((java.lang.Object) nodeCachingLinkedList23);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = linkedListNode25.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj29 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode27, linkedListNode28, obj29);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode30, linkedListNode31, (java.lang.Object) (short) 0);
        linkedListNode26.setNextNode(linkedListNode30);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode35 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode30);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode36 = linkedListNode30.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode37 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode40 = linkedListNode39.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode37, linkedListNode38, (java.lang.Object) linkedListNode39);
        java.lang.Object obj42 = linkedListNode38.getValue();
        linkedListNode30.setValue((java.lang.Object) linkedListNode38);
        boolean boolean44 = nodeCachingLinkedList23.add((java.lang.Object) linkedListNode38);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList23", nodeCachingLinkedList23.repOK_1());
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode1 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode1, linkedListNode2, (java.lang.Object) linkedListNode3);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = linkedListNode5.getNextNode();
        linkedListNode5.setValue((java.lang.Object) (short) 1);
        boolean boolean9 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode5);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = linkedListNode12.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode10, linkedListNode11, (java.lang.Object) linkedListNode12);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = linkedListNode11.getNextNode();
        boolean boolean16 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode15);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj19 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode17, linkedListNode18, obj19);
        java.lang.Object obj21 = linkedListNode17.getValue();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = linkedListNode17.getNextNode();
        boolean boolean23 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode17);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, (java.lang.Object) linkedListNode7);
        linkedListNode3.setPreviousNode(linkedListNode7);
        boolean boolean11 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode7);
        boolean boolean13 = nodeCachingLinkedList0.remove((java.lang.Object) 0.0d);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = linkedListNode16.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode14, linkedListNode15, (java.lang.Object) linkedListNode16);
        java.lang.Object obj19 = linkedListNode16.getValue();
        boolean boolean20 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode16);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList21 = new system.testclass.NodeCachingLinkedList();
        boolean boolean22 = nodeCachingLinkedList0.remove((java.lang.Object) nodeCachingLinkedList21);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = linkedListNode25.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode23, linkedListNode24, (java.lang.Object) linkedListNode25);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = linkedListNode25.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = linkedListNode25.getPreviousNode();
        boolean boolean30 = nodeCachingLinkedList21.remove((java.lang.Object) linkedListNode29);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = linkedListNode31.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj35 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode33, linkedListNode34, obj35);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode37 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode36, linkedListNode37, (java.lang.Object) (short) 0);
        linkedListNode32.setNextNode(linkedListNode36);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode36);
        java.lang.Class<?> wildcardClass42 = linkedListNode36.getClass();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode43 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) wildcardClass42);
        boolean boolean44 = nodeCachingLinkedList21.add((java.lang.Object) wildcardClass42);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList21", nodeCachingLinkedList21.repOK_1());
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode1 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode1, linkedListNode2, (java.lang.Object) linkedListNode3);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = linkedListNode5.getNextNode();
        linkedListNode5.setValue((java.lang.Object) (short) 1);
        boolean boolean9 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode5);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) nodeCachingLinkedList0);
        boolean boolean12 = nodeCachingLinkedList0.add((java.lang.Object) 1.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) 10.0d);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj5 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode3, linkedListNode4, obj5);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode6, linkedListNode7, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = linkedListNode6.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj13 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode11, linkedListNode12, obj13);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode14, linkedListNode15, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = linkedListNode14.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = linkedListNode14.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = linkedListNode20.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = linkedListNode24.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode22, linkedListNode23, (java.lang.Object) linkedListNode24);
        linkedListNode20.setPreviousNode(linkedListNode24);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode10, linkedListNode14, (java.lang.Object) linkedListNode24);
        linkedListNode28.setValue((java.lang.Object) (byte) 10);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = linkedListNode28.getPreviousNode();
        boolean boolean32 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode28);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, (java.lang.Object) linkedListNode7);
        linkedListNode3.setPreviousNode(linkedListNode7);
        boolean boolean11 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode7);
        boolean boolean13 = nodeCachingLinkedList0.remove((java.lang.Object) 0.0d);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = linkedListNode16.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode14, linkedListNode15, (java.lang.Object) linkedListNode16);
        java.lang.Object obj19 = linkedListNode16.getValue();
        boolean boolean20 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode16);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList21 = new system.testclass.NodeCachingLinkedList();
        boolean boolean22 = nodeCachingLinkedList0.remove((java.lang.Object) nodeCachingLinkedList21);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = linkedListNode23.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj27 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode25, linkedListNode26, obj27);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode28, linkedListNode29, (java.lang.Object) (short) 0);
        linkedListNode24.setNextNode(linkedListNode28);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = linkedListNode28.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode28);
        boolean boolean35 = nodeCachingLinkedList21.remove((java.lang.Object) linkedListNode28);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList36 = new system.testclass.NodeCachingLinkedList();
        boolean boolean38 = nodeCachingLinkedList36.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode40 = linkedListNode39.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode43 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode44 = linkedListNode43.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode45 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode41, linkedListNode42, (java.lang.Object) linkedListNode43);
        linkedListNode39.setPreviousNode(linkedListNode43);
        boolean boolean47 = nodeCachingLinkedList36.remove((java.lang.Object) linkedListNode43);
        boolean boolean49 = nodeCachingLinkedList36.remove((java.lang.Object) 0.0d);
        boolean boolean50 = nodeCachingLinkedList21.remove((java.lang.Object) nodeCachingLinkedList36);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode51 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode52 = linkedListNode51.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode53 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode54 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj55 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode56 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode53, linkedListNode54, obj55);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode57 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode59 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode56, linkedListNode57, (java.lang.Object) (short) 0);
        linkedListNode52.setNextNode(linkedListNode56);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode61 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode56);
        boolean boolean62 = nodeCachingLinkedList36.add((java.lang.Object) linkedListNode56);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList36", nodeCachingLinkedList36.repOK_1());
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, (java.lang.Object) linkedListNode7);
        linkedListNode3.setPreviousNode(linkedListNode7);
        boolean boolean11 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode7);
        boolean boolean13 = nodeCachingLinkedList0.remove((java.lang.Object) 0.0d);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = linkedListNode16.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode14, linkedListNode15, (java.lang.Object) linkedListNode16);
        java.lang.Object obj19 = linkedListNode16.getValue();
        boolean boolean20 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode16);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList21 = new system.testclass.NodeCachingLinkedList();
        boolean boolean22 = nodeCachingLinkedList0.remove((java.lang.Object) nodeCachingLinkedList21);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        boolean boolean25 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode24);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj28 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode26, linkedListNode27, obj28);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode29, linkedListNode30, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = linkedListNode29.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode35 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj36 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode37 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode34, linkedListNode35, obj36);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode40 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode37, linkedListNode38, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = linkedListNode37.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = linkedListNode37.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode43 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode44 = linkedListNode43.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode45 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode46 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode47 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode48 = linkedListNode47.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode49 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode45, linkedListNode46, (java.lang.Object) linkedListNode47);
        linkedListNode43.setPreviousNode(linkedListNode47);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode51 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode33, linkedListNode37, (java.lang.Object) linkedListNode47);
        boolean boolean52 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode51);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj7 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, obj7);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode8, linkedListNode9, (java.lang.Object) (short) 0);
        linkedListNode4.setNextNode(linkedListNode8);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode8);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = linkedListNode13.getPreviousNode();
        boolean boolean15 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode14);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj18 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode16, linkedListNode17, obj18);
        linkedListNode17.setValue((java.lang.Object) 100.0f);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = linkedListNode17.getPreviousNode();
        boolean boolean23 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode17);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = linkedListNode26.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode24, linkedListNode25, (java.lang.Object) linkedListNode26);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = linkedListNode25.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = linkedListNode31.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode29, linkedListNode32, (java.lang.Object) (byte) 10);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode35 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode29);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode29);
        boolean boolean37 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode29);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, (java.lang.Object) linkedListNode7);
        linkedListNode3.setPreviousNode(linkedListNode7);
        boolean boolean11 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode7);
        boolean boolean13 = nodeCachingLinkedList0.remove((java.lang.Object) 0.0d);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = linkedListNode16.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode14, linkedListNode15, (java.lang.Object) linkedListNode16);
        java.lang.Object obj19 = linkedListNode16.getValue();
        boolean boolean20 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode16);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList21 = new system.testclass.NodeCachingLinkedList();
        boolean boolean22 = nodeCachingLinkedList0.remove((java.lang.Object) nodeCachingLinkedList21);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = linkedListNode23.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj27 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode25, linkedListNode26, obj27);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode28, linkedListNode29, (java.lang.Object) (short) 0);
        linkedListNode24.setNextNode(linkedListNode28);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = linkedListNode28.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode28);
        boolean boolean35 = nodeCachingLinkedList21.remove((java.lang.Object) linkedListNode28);
        boolean boolean37 = nodeCachingLinkedList21.remove((java.lang.Object) 1);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode38 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode40 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        linkedListNode39.setNextNode(linkedListNode40);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = linkedListNode39.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode43 = linkedListNode42.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode44 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode45 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode46 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode47 = linkedListNode46.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode48 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode44, linkedListNode45, (java.lang.Object) linkedListNode46);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode49 = linkedListNode45.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode51 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode52 = linkedListNode51.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode54 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode49, linkedListNode52, (java.lang.Object) (byte) 10);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode55 = linkedListNode52.getNextNode();
        linkedListNode43.setNextNode(linkedListNode52);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode58 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode59 = linkedListNode58.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode60 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode38, linkedListNode43, (java.lang.Object) linkedListNode58);
        boolean boolean61 = nodeCachingLinkedList21.add((java.lang.Object) linkedListNode43);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList21", nodeCachingLinkedList21.repOK_1());
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) 10.0d);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj5 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode3, linkedListNode4, obj5);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj9 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode7, linkedListNode8, obj9);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode10, linkedListNode11, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = linkedListNode16.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj20 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode18, linkedListNode19, obj20);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode21, linkedListNode22, (java.lang.Object) (short) 0);
        linkedListNode17.setNextNode(linkedListNode21);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode13, linkedListNode15, (java.lang.Object) linkedListNode17);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = linkedListNode27.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = linkedListNode31.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode29, linkedListNode30, (java.lang.Object) linkedListNode31);
        linkedListNode27.setPreviousNode(linkedListNode31);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode35 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode3, linkedListNode17, (java.lang.Object) linkedListNode31);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode36 = linkedListNode3.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode37 = linkedListNode36.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj40 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode38, linkedListNode39, obj40);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode44 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode41, linkedListNode42, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode45 = linkedListNode41.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode46 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode47 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj48 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode49 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode46, linkedListNode47, obj48);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode50 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode52 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode49, linkedListNode50, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode53 = linkedListNode49.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode54 = linkedListNode49.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode55 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode56 = linkedListNode55.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode57 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode58 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode59 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode60 = linkedListNode59.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode61 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode57, linkedListNode58, (java.lang.Object) linkedListNode59);
        linkedListNode55.setPreviousNode(linkedListNode59);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode63 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode45, linkedListNode49, (java.lang.Object) linkedListNode59);
        java.lang.Object obj64 = linkedListNode59.getValue();
        linkedListNode37.setValue(obj64);
        boolean boolean66 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode37);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode67 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode68 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj69 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode70 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode67, linkedListNode68, obj69);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode71 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode73 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode70, linkedListNode71, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode74 = linkedListNode70.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode75 = linkedListNode74.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode76 = linkedListNode74.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode77 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode76);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode78 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode79 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj80 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode81 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode78, linkedListNode79, obj80);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode82 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode84 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode81, linkedListNode82, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode85 = linkedListNode81.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode86 = linkedListNode81.getNextNode();
        java.lang.Object obj87 = linkedListNode81.getValue();
        linkedListNode76.setNextNode(linkedListNode81);
        boolean boolean89 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode76);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode1 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode1, linkedListNode2, (java.lang.Object) linkedListNode3);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = linkedListNode5.getNextNode();
        linkedListNode5.setValue((java.lang.Object) (short) 1);
        boolean boolean9 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode5);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) nodeCachingLinkedList0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj13 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode11, linkedListNode12, obj13);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode14, linkedListNode15, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = linkedListNode14.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = linkedListNode18.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = linkedListNode18.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode20);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = linkedListNode21.getNextNode();
        boolean boolean23 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode21);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) 100L);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList3 = new system.testclass.NodeCachingLinkedList();
        boolean boolean5 = nodeCachingLinkedList3.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = linkedListNode6.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = linkedListNode10.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode8, linkedListNode9, (java.lang.Object) linkedListNode10);
        linkedListNode6.setPreviousNode(linkedListNode10);
        boolean boolean14 = nodeCachingLinkedList3.remove((java.lang.Object) linkedListNode10);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj17 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode15, linkedListNode16, obj17);
        java.lang.Object obj19 = linkedListNode15.getValue();
        boolean boolean20 = nodeCachingLinkedList3.remove((java.lang.Object) linkedListNode15);
        java.lang.Class<?> wildcardClass21 = linkedListNode15.getClass();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) wildcardClass21);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = linkedListNode22.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = linkedListNode24.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = linkedListNode25.getNextNode();
        linkedListNode23.setValue((java.lang.Object) linkedListNode25);
        boolean boolean28 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode25);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = linkedListNode31.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode29, linkedListNode30, (java.lang.Object) linkedListNode31);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode35 = linkedListNode34.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode36 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode37 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = linkedListNode38.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode40 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode36, linkedListNode37, (java.lang.Object) linkedListNode38);
        linkedListNode34.setPreviousNode(linkedListNode38);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList42 = new system.testclass.NodeCachingLinkedList();
        boolean boolean44 = nodeCachingLinkedList42.remove((java.lang.Object) 100L);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode45 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode31, linkedListNode34, (java.lang.Object) boolean44);
        boolean boolean46 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode34);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj7 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, obj7);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode8, linkedListNode9, (java.lang.Object) (short) 0);
        linkedListNode4.setNextNode(linkedListNode8);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode8);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = linkedListNode13.getPreviousNode();
        boolean boolean15 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode14);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList16 = new system.testclass.NodeCachingLinkedList();
        boolean boolean17 = nodeCachingLinkedList0.remove((java.lang.Object) nodeCachingLinkedList16);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = linkedListNode19.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = linkedListNode20.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = linkedListNode20.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = linkedListNode23.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj27 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode25, linkedListNode26, obj27);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode28, linkedListNode29, (java.lang.Object) (short) 0);
        linkedListNode24.setNextNode(linkedListNode28);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode28);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode35 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj36 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode37 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode34, linkedListNode35, obj36);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj40 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode38, linkedListNode39, obj40);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode44 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode41, linkedListNode42, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode46 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode47 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode48 = linkedListNode47.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode49 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode50 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj51 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode52 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode49, linkedListNode50, obj51);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode53 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode55 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode52, linkedListNode53, (java.lang.Object) (short) 0);
        linkedListNode48.setNextNode(linkedListNode52);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode57 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode44, linkedListNode46, (java.lang.Object) linkedListNode48);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode58 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode59 = linkedListNode58.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode60 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode61 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode62 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode63 = linkedListNode62.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode64 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode60, linkedListNode61, (java.lang.Object) linkedListNode62);
        linkedListNode58.setPreviousNode(linkedListNode62);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode66 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode34, linkedListNode48, (java.lang.Object) linkedListNode62);
        linkedListNode33.setNextNode(linkedListNode34);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode68 = linkedListNode34.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode69 = linkedListNode68.getNextNode();
        linkedListNode20.setNextNode(linkedListNode69);
        boolean boolean71 = nodeCachingLinkedList16.add((java.lang.Object) linkedListNode69);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList16", nodeCachingLinkedList16.repOK_1());
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj7 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, obj7);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode8, linkedListNode9, (java.lang.Object) (short) 0);
        linkedListNode4.setNextNode(linkedListNode8);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode8);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = linkedListNode13.getPreviousNode();
        boolean boolean15 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode14);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList16 = new system.testclass.NodeCachingLinkedList();
        boolean boolean17 = nodeCachingLinkedList0.remove((java.lang.Object) nodeCachingLinkedList16);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj20 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode18, linkedListNode19, obj20);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode21, linkedListNode22, (java.lang.Object) (short) 0);
        boolean boolean25 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode24);
        java.lang.Object obj26 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = new system.testclass.NodeCachingLinkedList.LinkedListNode(obj26);
        java.lang.Object obj28 = linkedListNode27.getValue();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = linkedListNode27.getNextNode();
        boolean boolean30 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode27);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode0 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode1 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = linkedListNode2.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode0, linkedListNode1, (java.lang.Object) linkedListNode2);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = linkedListNode1.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode8, (java.lang.Object) (byte) 10);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList11 = new system.testclass.NodeCachingLinkedList();
        boolean boolean13 = nodeCachingLinkedList11.remove((java.lang.Object) 10.0d);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj16 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode14, linkedListNode15, obj16);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj20 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode18, linkedListNode19, obj20);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode21, linkedListNode22, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = linkedListNode27.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj31 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode29, linkedListNode30, obj31);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode35 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode32, linkedListNode33, (java.lang.Object) (short) 0);
        linkedListNode28.setNextNode(linkedListNode32);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode37 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode24, linkedListNode26, (java.lang.Object) linkedListNode28);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = linkedListNode38.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode40 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode43 = linkedListNode42.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode44 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode40, linkedListNode41, (java.lang.Object) linkedListNode42);
        linkedListNode38.setPreviousNode(linkedListNode42);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode46 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode14, linkedListNode28, (java.lang.Object) linkedListNode42);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode47 = linkedListNode14.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode48 = linkedListNode47.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode49 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode50 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj51 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode52 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode49, linkedListNode50, obj51);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode53 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode55 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode52, linkedListNode53, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode56 = linkedListNode52.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode57 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode58 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj59 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode60 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode57, linkedListNode58, obj59);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode61 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode63 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode60, linkedListNode61, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode64 = linkedListNode60.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode65 = linkedListNode60.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode66 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode67 = linkedListNode66.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode68 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode69 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode70 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode71 = linkedListNode70.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode72 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode68, linkedListNode69, (java.lang.Object) linkedListNode70);
        linkedListNode66.setPreviousNode(linkedListNode70);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode74 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode56, linkedListNode60, (java.lang.Object) linkedListNode70);
        java.lang.Object obj75 = linkedListNode70.getValue();
        linkedListNode48.setValue(obj75);
        boolean boolean77 = nodeCachingLinkedList11.remove((java.lang.Object) linkedListNode48);
        linkedListNode10.setValue((java.lang.Object) nodeCachingLinkedList11);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode79 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode80 = linkedListNode79.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode81 = linkedListNode80.getPreviousNode();
        boolean boolean82 = nodeCachingLinkedList11.add((java.lang.Object) linkedListNode81);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList11", nodeCachingLinkedList11.repOK_1());
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, (java.lang.Object) linkedListNode7);
        linkedListNode3.setPreviousNode(linkedListNode7);
        boolean boolean11 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode7);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj14 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode12, linkedListNode13, obj14);
        linkedListNode12.setValue((java.lang.Object) ' ');
        boolean boolean18 = nodeCachingLinkedList0.remove((java.lang.Object) ' ');
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList19 = new system.testclass.NodeCachingLinkedList();
        boolean boolean21 = nodeCachingLinkedList19.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = linkedListNode22.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = linkedListNode26.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode24, linkedListNode25, (java.lang.Object) linkedListNode26);
        linkedListNode22.setPreviousNode(linkedListNode26);
        boolean boolean30 = nodeCachingLinkedList19.remove((java.lang.Object) linkedListNode26);
        boolean boolean32 = nodeCachingLinkedList19.remove((java.lang.Object) 0.0d);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode35 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode36 = linkedListNode35.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode37 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode33, linkedListNode34, (java.lang.Object) linkedListNode35);
        java.lang.Object obj38 = linkedListNode35.getValue();
        boolean boolean39 = nodeCachingLinkedList19.remove((java.lang.Object) linkedListNode35);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode40 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode35);
        boolean boolean41 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode35);
        java.lang.Object obj42 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode43 = new system.testclass.NodeCachingLinkedList.LinkedListNode(obj42);
        java.lang.Object obj44 = linkedListNode43.getValue();
        java.lang.Object obj45 = linkedListNode43.getValue();
        boolean boolean46 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode43);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode48 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode49 = linkedListNode48.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode50 = linkedListNode49.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode51 = linkedListNode49.getNextNode();
        boolean boolean52 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode51);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList3 = new system.testclass.NodeCachingLinkedList();
        boolean boolean5 = nodeCachingLinkedList3.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList6 = new system.testclass.NodeCachingLinkedList();
        boolean boolean8 = nodeCachingLinkedList6.remove((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass9 = nodeCachingLinkedList6.getClass();
        boolean boolean10 = nodeCachingLinkedList3.remove((java.lang.Object) wildcardClass9);
        boolean boolean11 = nodeCachingLinkedList0.remove((java.lang.Object) nodeCachingLinkedList3);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        linkedListNode13.setNextNode(linkedListNode14);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = linkedListNode13.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = linkedListNode16.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = linkedListNode20.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode18, linkedListNode19, (java.lang.Object) linkedListNode20);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = linkedListNode19.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = linkedListNode25.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode23, linkedListNode26, (java.lang.Object) (byte) 10);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = linkedListNode26.getNextNode();
        linkedListNode17.setNextNode(linkedListNode26);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = linkedListNode32.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode12, linkedListNode17, (java.lang.Object) linkedListNode32);
        boolean boolean35 = nodeCachingLinkedList3.add((java.lang.Object) linkedListNode32);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList3", nodeCachingLinkedList3.repOK_1());
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, (java.lang.Object) linkedListNode7);
        linkedListNode3.setPreviousNode(linkedListNode7);
        boolean boolean11 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode7);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList12 = new system.testclass.NodeCachingLinkedList();
        boolean boolean14 = nodeCachingLinkedList12.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = linkedListNode15.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = linkedListNode19.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode17, linkedListNode18, (java.lang.Object) linkedListNode19);
        linkedListNode15.setPreviousNode(linkedListNode19);
        boolean boolean23 = nodeCachingLinkedList12.remove((java.lang.Object) linkedListNode19);
        boolean boolean25 = nodeCachingLinkedList12.remove((java.lang.Object) 0.0d);
        boolean boolean26 = nodeCachingLinkedList0.add((java.lang.Object) nodeCachingLinkedList12);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode1 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode1, linkedListNode2, (java.lang.Object) linkedListNode3);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = linkedListNode5.getNextNode();
        linkedListNode5.setValue((java.lang.Object) (short) 1);
        boolean boolean9 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode5);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = linkedListNode12.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode10, linkedListNode11, (java.lang.Object) linkedListNode12);
        java.lang.Object obj15 = linkedListNode11.getValue();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode11);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = linkedListNode16.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj20 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode18, linkedListNode19, obj20);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj24 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode22, linkedListNode23, obj24);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode25, linkedListNode26, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = linkedListNode31.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj35 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode33, linkedListNode34, obj35);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode37 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode36, linkedListNode37, (java.lang.Object) (short) 0);
        linkedListNode32.setNextNode(linkedListNode36);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode28, linkedListNode30, (java.lang.Object) linkedListNode32);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode43 = linkedListNode42.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode44 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode45 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode46 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode47 = linkedListNode46.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode48 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode44, linkedListNode45, (java.lang.Object) linkedListNode46);
        linkedListNode42.setPreviousNode(linkedListNode46);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode50 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode18, linkedListNode32, (java.lang.Object) linkedListNode46);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode51 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode52 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj53 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode54 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode51, linkedListNode52, obj53);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode55 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode57 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode54, linkedListNode55, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode59 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode60 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode61 = linkedListNode60.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode62 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode63 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj64 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode65 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode62, linkedListNode63, obj64);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode66 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode68 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode65, linkedListNode66, (java.lang.Object) (short) 0);
        linkedListNode61.setNextNode(linkedListNode65);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode70 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode57, linkedListNode59, (java.lang.Object) linkedListNode61);
        linkedListNode18.setPreviousNode(linkedListNode61);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode72 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode73 = linkedListNode72.getPreviousNode();
        linkedListNode72.setValue((java.lang.Object) 1.0d);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode76 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode17, linkedListNode18, (java.lang.Object) 1.0d);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode77 = linkedListNode76.getPreviousNode();
        boolean boolean78 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode77);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, (java.lang.Object) linkedListNode7);
        linkedListNode3.setPreviousNode(linkedListNode7);
        boolean boolean11 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode7);
        boolean boolean13 = nodeCachingLinkedList0.remove((java.lang.Object) 0.0d);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = linkedListNode16.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode14, linkedListNode15, (java.lang.Object) linkedListNode16);
        java.lang.Object obj19 = linkedListNode16.getValue();
        boolean boolean20 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode16);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList21 = new system.testclass.NodeCachingLinkedList();
        boolean boolean22 = nodeCachingLinkedList0.remove((java.lang.Object) nodeCachingLinkedList21);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = linkedListNode23.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj27 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode25, linkedListNode26, obj27);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode28, linkedListNode29, (java.lang.Object) (short) 0);
        linkedListNode24.setNextNode(linkedListNode28);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = linkedListNode28.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode28);
        boolean boolean35 = nodeCachingLinkedList21.remove((java.lang.Object) linkedListNode28);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode36 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode37 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = linkedListNode38.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode40 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode36, linkedListNode37, (java.lang.Object) linkedListNode38);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = linkedListNode37.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode43 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode44 = linkedListNode43.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode46 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode41, linkedListNode44, (java.lang.Object) (byte) 10);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode47 = linkedListNode44.getNextNode();
        boolean boolean48 = nodeCachingLinkedList21.remove((java.lang.Object) linkedListNode44);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode49 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode50 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode51 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj52 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode53 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode50, linkedListNode51, obj52);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode54 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode56 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode53, linkedListNode54, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode58 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode59 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode60 = linkedListNode59.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode61 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode62 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj63 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode64 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode61, linkedListNode62, obj63);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode65 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode67 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode64, linkedListNode65, (java.lang.Object) (short) 0);
        linkedListNode60.setNextNode(linkedListNode64);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode69 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode56, linkedListNode58, (java.lang.Object) linkedListNode60);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode70 = linkedListNode69.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode71 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode72 = linkedListNode71.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode73 = linkedListNode72.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode74 = linkedListNode72.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode75 = linkedListNode74.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode76 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode49, linkedListNode70, (java.lang.Object) linkedListNode74);
        boolean boolean77 = nodeCachingLinkedList21.add((java.lang.Object) linkedListNode76);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList21", nodeCachingLinkedList21.repOK_1());
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) 100L);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = linkedListNode5.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = linkedListNode6.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = linkedListNode12.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode10, linkedListNode11, (java.lang.Object) linkedListNode12);
        java.lang.Object obj15 = linkedListNode11.getValue();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode11);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = linkedListNode16.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj20 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode18, linkedListNode19, obj20);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj24 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode22, linkedListNode23, obj24);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode25, linkedListNode26, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = linkedListNode31.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj35 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode33, linkedListNode34, obj35);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode37 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode36, linkedListNode37, (java.lang.Object) (short) 0);
        linkedListNode32.setNextNode(linkedListNode36);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode28, linkedListNode30, (java.lang.Object) linkedListNode32);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode43 = linkedListNode42.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode44 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode45 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode46 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode47 = linkedListNode46.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode48 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode44, linkedListNode45, (java.lang.Object) linkedListNode46);
        linkedListNode42.setPreviousNode(linkedListNode46);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode50 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode18, linkedListNode32, (java.lang.Object) linkedListNode46);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode51 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode52 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj53 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode54 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode51, linkedListNode52, obj53);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode55 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode57 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode54, linkedListNode55, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode59 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode60 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode61 = linkedListNode60.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode62 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode63 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj64 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode65 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode62, linkedListNode63, obj64);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode66 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode68 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode65, linkedListNode66, (java.lang.Object) (short) 0);
        linkedListNode61.setNextNode(linkedListNode65);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode70 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode57, linkedListNode59, (java.lang.Object) linkedListNode61);
        linkedListNode18.setPreviousNode(linkedListNode61);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode72 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode73 = linkedListNode72.getPreviousNode();
        linkedListNode72.setValue((java.lang.Object) 1.0d);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode76 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode17, linkedListNode18, (java.lang.Object) 1.0d);
        linkedListNode9.setNextNode(linkedListNode17);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode78 = linkedListNode17.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode79 = linkedListNode17.getPreviousNode();
        linkedListNode7.setValue((java.lang.Object) linkedListNode79);
        linkedListNode4.setPreviousNode(linkedListNode7);
        boolean boolean82 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode7);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode84 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        linkedListNode84.setValue((java.lang.Object) 0L);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode87 = linkedListNode84.getPreviousNode();
        boolean boolean88 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode87);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) 100L);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList3 = new system.testclass.NodeCachingLinkedList();
        boolean boolean5 = nodeCachingLinkedList3.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = linkedListNode6.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = linkedListNode10.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode8, linkedListNode9, (java.lang.Object) linkedListNode10);
        linkedListNode6.setPreviousNode(linkedListNode10);
        boolean boolean14 = nodeCachingLinkedList3.remove((java.lang.Object) linkedListNode10);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj17 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode15, linkedListNode16, obj17);
        java.lang.Object obj19 = linkedListNode15.getValue();
        boolean boolean20 = nodeCachingLinkedList3.remove((java.lang.Object) linkedListNode15);
        java.lang.Class<?> wildcardClass21 = linkedListNode15.getClass();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) wildcardClass21);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = linkedListNode22.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = linkedListNode24.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = linkedListNode25.getNextNode();
        linkedListNode23.setValue((java.lang.Object) linkedListNode25);
        boolean boolean28 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode25);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = linkedListNode29.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = linkedListNode30.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = linkedListNode30.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = linkedListNode30.getNextNode();
        boolean boolean34 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode30);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, (java.lang.Object) linkedListNode7);
        linkedListNode3.setPreviousNode(linkedListNode7);
        boolean boolean11 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode7);
        boolean boolean13 = nodeCachingLinkedList0.remove((java.lang.Object) 0.0d);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = linkedListNode16.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode14, linkedListNode15, (java.lang.Object) linkedListNode16);
        java.lang.Object obj19 = linkedListNode16.getValue();
        boolean boolean20 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode16);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList21 = new system.testclass.NodeCachingLinkedList();
        boolean boolean22 = nodeCachingLinkedList0.remove((java.lang.Object) nodeCachingLinkedList21);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList23 = new system.testclass.NodeCachingLinkedList();
        boolean boolean25 = nodeCachingLinkedList23.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = linkedListNode26.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = linkedListNode30.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode28, linkedListNode29, (java.lang.Object) linkedListNode30);
        linkedListNode26.setPreviousNode(linkedListNode30);
        boolean boolean34 = nodeCachingLinkedList23.remove((java.lang.Object) linkedListNode30);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode35 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj37 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode35, linkedListNode36, obj37);
        java.lang.Object obj39 = linkedListNode35.getValue();
        boolean boolean40 = nodeCachingLinkedList23.remove((java.lang.Object) linkedListNode35);
        boolean boolean41 = nodeCachingLinkedList21.remove((java.lang.Object) boolean40);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode43 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode44 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj45 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode46 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode43, linkedListNode44, obj45);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode47 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode49 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode46, linkedListNode47, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode51 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode52 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode53 = linkedListNode52.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode54 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode55 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj56 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode57 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode54, linkedListNode55, obj56);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode58 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode60 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode57, linkedListNode58, (java.lang.Object) (short) 0);
        linkedListNode53.setNextNode(linkedListNode57);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode62 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode49, linkedListNode51, (java.lang.Object) linkedListNode53);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode63 = linkedListNode62.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode64 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode65 = linkedListNode64.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode66 = linkedListNode65.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode67 = linkedListNode65.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode68 = linkedListNode67.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode69 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode42, linkedListNode63, (java.lang.Object) linkedListNode67);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode70 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode71 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj72 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode73 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode70, linkedListNode71, obj72);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode74 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode76 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode73, linkedListNode74, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode77 = linkedListNode73.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode78 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode79 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj80 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode81 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode78, linkedListNode79, obj80);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode82 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode84 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode81, linkedListNode82, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode85 = linkedListNode81.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode86 = linkedListNode81.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode87 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode88 = linkedListNode87.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode89 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode90 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode91 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode92 = linkedListNode91.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode93 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode89, linkedListNode90, (java.lang.Object) linkedListNode91);
        linkedListNode87.setPreviousNode(linkedListNode91);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode95 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode77, linkedListNode81, (java.lang.Object) linkedListNode91);
        java.lang.Object obj96 = linkedListNode77.getValue();
        linkedListNode67.setNextNode(linkedListNode77);
        boolean boolean98 = nodeCachingLinkedList21.add((java.lang.Object) linkedListNode77);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList21", nodeCachingLinkedList21.repOK_1());
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, (java.lang.Object) linkedListNode7);
        linkedListNode3.setPreviousNode(linkedListNode7);
        boolean boolean11 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode7);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj14 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode12, linkedListNode13, obj14);
        java.lang.Object obj16 = linkedListNode12.getValue();
        boolean boolean17 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode12);
        boolean boolean19 = nodeCachingLinkedList0.remove((java.lang.Object) (-1.0f));
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = linkedListNode22.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode20, linkedListNode21, (java.lang.Object) linkedListNode22);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = linkedListNode24.getNextNode();
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList26 = new system.testclass.NodeCachingLinkedList();
        boolean boolean28 = nodeCachingLinkedList26.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = linkedListNode29.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = linkedListNode33.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode35 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode31, linkedListNode32, (java.lang.Object) linkedListNode33);
        linkedListNode29.setPreviousNode(linkedListNode33);
        boolean boolean37 = nodeCachingLinkedList26.remove((java.lang.Object) linkedListNode33);
        boolean boolean39 = nodeCachingLinkedList26.remove((java.lang.Object) 0.0d);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode40 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode43 = linkedListNode42.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode44 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode40, linkedListNode41, (java.lang.Object) linkedListNode42);
        java.lang.Object obj45 = linkedListNode42.getValue();
        boolean boolean46 = nodeCachingLinkedList26.remove((java.lang.Object) linkedListNode42);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList47 = new system.testclass.NodeCachingLinkedList();
        boolean boolean48 = nodeCachingLinkedList26.remove((java.lang.Object) nodeCachingLinkedList47);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode49 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode50 = linkedListNode49.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode51 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode52 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj53 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode54 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode51, linkedListNode52, obj53);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode55 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode57 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode54, linkedListNode55, (java.lang.Object) (short) 0);
        linkedListNode50.setNextNode(linkedListNode54);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode59 = linkedListNode54.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode60 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode54);
        boolean boolean61 = nodeCachingLinkedList47.remove((java.lang.Object) linkedListNode54);
        linkedListNode25.setNextNode(linkedListNode54);
        boolean boolean63 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode54);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj7 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, obj7);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode8, linkedListNode9, (java.lang.Object) (short) 0);
        linkedListNode4.setNextNode(linkedListNode8);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode8);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = linkedListNode13.getPreviousNode();
        boolean boolean15 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode14);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList16 = new system.testclass.NodeCachingLinkedList();
        boolean boolean17 = nodeCachingLinkedList0.remove((java.lang.Object) nodeCachingLinkedList16);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj20 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode18, linkedListNode19, obj20);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode21, linkedListNode22, (java.lang.Object) (short) 0);
        boolean boolean25 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode24);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList26 = new system.testclass.NodeCachingLinkedList();
        boolean boolean28 = nodeCachingLinkedList26.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = linkedListNode29.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj33 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode31, linkedListNode32, obj33);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode35 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode37 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode34, linkedListNode35, (java.lang.Object) (short) 0);
        linkedListNode30.setNextNode(linkedListNode34);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode34);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode40 = linkedListNode39.getPreviousNode();
        boolean boolean41 = nodeCachingLinkedList26.remove((java.lang.Object) linkedListNode40);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList42 = new system.testclass.NodeCachingLinkedList();
        boolean boolean43 = nodeCachingLinkedList26.remove((java.lang.Object) nodeCachingLinkedList42);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode44 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode45 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj46 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode47 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode44, linkedListNode45, obj46);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode48 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode50 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode47, linkedListNode48, (java.lang.Object) (short) 0);
        boolean boolean51 = nodeCachingLinkedList26.remove((java.lang.Object) linkedListNode50);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode53 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 100.0d);
        boolean boolean54 = nodeCachingLinkedList26.remove((java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass55 = nodeCachingLinkedList26.getClass();
        boolean boolean56 = nodeCachingLinkedList0.remove((java.lang.Object) wildcardClass55);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode57 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode58 = linkedListNode57.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode59 = linkedListNode58.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode60 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode61 = linkedListNode60.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode62 = linkedListNode61.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode63 = linkedListNode61.getPreviousNode();
        linkedListNode59.setValue((java.lang.Object) linkedListNode63);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode65 = linkedListNode59.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode66 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode67 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode68 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode69 = linkedListNode68.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode70 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode66, linkedListNode67, (java.lang.Object) linkedListNode68);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode71 = linkedListNode67.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode73 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode74 = linkedListNode73.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode76 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode71, linkedListNode74, (java.lang.Object) (byte) 10);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode77 = linkedListNode74.getNextNode();
        linkedListNode59.setValue((java.lang.Object) linkedListNode77);
        boolean boolean79 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode77);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, (java.lang.Object) linkedListNode7);
        linkedListNode3.setPreviousNode(linkedListNode7);
        boolean boolean11 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode7);
        boolean boolean13 = nodeCachingLinkedList0.remove((java.lang.Object) 0.0d);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = linkedListNode16.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode14, linkedListNode15, (java.lang.Object) linkedListNode16);
        java.lang.Object obj19 = linkedListNode16.getValue();
        boolean boolean20 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode16);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList21 = new system.testclass.NodeCachingLinkedList();
        boolean boolean22 = nodeCachingLinkedList0.remove((java.lang.Object) nodeCachingLinkedList21);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = linkedListNode23.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj27 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode25, linkedListNode26, obj27);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode28, linkedListNode29, (java.lang.Object) (short) 0);
        linkedListNode24.setNextNode(linkedListNode28);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = linkedListNode28.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode28);
        boolean boolean35 = nodeCachingLinkedList21.remove((java.lang.Object) linkedListNode28);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList36 = new system.testclass.NodeCachingLinkedList();
        boolean boolean38 = nodeCachingLinkedList36.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode40 = linkedListNode39.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode43 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode44 = linkedListNode43.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode45 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode41, linkedListNode42, (java.lang.Object) linkedListNode43);
        linkedListNode39.setPreviousNode(linkedListNode43);
        boolean boolean47 = nodeCachingLinkedList36.remove((java.lang.Object) linkedListNode43);
        boolean boolean49 = nodeCachingLinkedList36.remove((java.lang.Object) 0.0d);
        boolean boolean50 = nodeCachingLinkedList21.remove((java.lang.Object) nodeCachingLinkedList36);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList51 = new system.testclass.NodeCachingLinkedList();
        boolean boolean53 = nodeCachingLinkedList51.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode54 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode55 = linkedListNode54.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode56 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode57 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode58 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode59 = linkedListNode58.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode60 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode56, linkedListNode57, (java.lang.Object) linkedListNode58);
        linkedListNode54.setPreviousNode(linkedListNode58);
        boolean boolean62 = nodeCachingLinkedList51.remove((java.lang.Object) linkedListNode58);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode63 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode64 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj65 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode66 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode63, linkedListNode64, obj65);
        linkedListNode63.setValue((java.lang.Object) ' ');
        boolean boolean69 = nodeCachingLinkedList51.remove((java.lang.Object) ' ');
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList70 = new system.testclass.NodeCachingLinkedList();
        boolean boolean72 = nodeCachingLinkedList70.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode73 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode74 = linkedListNode73.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode75 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode76 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode77 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode78 = linkedListNode77.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode79 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode75, linkedListNode76, (java.lang.Object) linkedListNode77);
        linkedListNode73.setPreviousNode(linkedListNode77);
        boolean boolean81 = nodeCachingLinkedList70.remove((java.lang.Object) linkedListNode77);
        boolean boolean83 = nodeCachingLinkedList70.remove((java.lang.Object) 0.0d);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode84 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode85 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode86 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode87 = linkedListNode86.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode88 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode84, linkedListNode85, (java.lang.Object) linkedListNode86);
        java.lang.Object obj89 = linkedListNode86.getValue();
        boolean boolean90 = nodeCachingLinkedList70.remove((java.lang.Object) linkedListNode86);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode91 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode86);
        boolean boolean92 = nodeCachingLinkedList51.remove((java.lang.Object) linkedListNode86);
        boolean boolean93 = nodeCachingLinkedList21.add((java.lang.Object) linkedListNode86);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList21", nodeCachingLinkedList21.repOK_1());
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, (java.lang.Object) linkedListNode7);
        linkedListNode3.setPreviousNode(linkedListNode7);
        boolean boolean11 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode7);
        boolean boolean13 = nodeCachingLinkedList0.remove((java.lang.Object) 0.0d);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = linkedListNode16.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode14, linkedListNode15, (java.lang.Object) linkedListNode16);
        java.lang.Object obj19 = linkedListNode16.getValue();
        boolean boolean20 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode16);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList21 = new system.testclass.NodeCachingLinkedList();
        boolean boolean22 = nodeCachingLinkedList0.remove((java.lang.Object) nodeCachingLinkedList21);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList23 = new system.testclass.NodeCachingLinkedList();
        boolean boolean25 = nodeCachingLinkedList23.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = linkedListNode26.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = linkedListNode30.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode28, linkedListNode29, (java.lang.Object) linkedListNode30);
        linkedListNode26.setPreviousNode(linkedListNode30);
        boolean boolean34 = nodeCachingLinkedList23.remove((java.lang.Object) linkedListNode30);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode35 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj37 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode35, linkedListNode36, obj37);
        java.lang.Object obj39 = linkedListNode35.getValue();
        boolean boolean40 = nodeCachingLinkedList23.remove((java.lang.Object) linkedListNode35);
        boolean boolean41 = nodeCachingLinkedList21.remove((java.lang.Object) boolean40);
        java.lang.Object obj42 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode43 = new system.testclass.NodeCachingLinkedList.LinkedListNode(obj42);
        java.lang.Object obj44 = linkedListNode43.getValue();
        boolean boolean45 = nodeCachingLinkedList21.remove((java.lang.Object) linkedListNode43);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode47 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode48 = linkedListNode47.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode49 = linkedListNode48.getPreviousNode();
        java.lang.Object obj50 = linkedListNode48.getValue();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode51 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode52 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode53 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode54 = linkedListNode53.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode55 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode51, linkedListNode52, (java.lang.Object) linkedListNode53);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode56 = linkedListNode55.getNextNode();
        linkedListNode48.setNextNode(linkedListNode56);
        boolean boolean58 = nodeCachingLinkedList21.add((java.lang.Object) linkedListNode56);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList21", nodeCachingLinkedList21.repOK_1());
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) 100L);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = linkedListNode5.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = linkedListNode6.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = linkedListNode12.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode10, linkedListNode11, (java.lang.Object) linkedListNode12);
        java.lang.Object obj15 = linkedListNode11.getValue();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode11);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = linkedListNode16.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj20 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode18, linkedListNode19, obj20);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj24 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode22, linkedListNode23, obj24);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode25, linkedListNode26, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = linkedListNode31.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj35 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode33, linkedListNode34, obj35);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode37 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode36, linkedListNode37, (java.lang.Object) (short) 0);
        linkedListNode32.setNextNode(linkedListNode36);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode28, linkedListNode30, (java.lang.Object) linkedListNode32);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode43 = linkedListNode42.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode44 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode45 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode46 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode47 = linkedListNode46.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode48 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode44, linkedListNode45, (java.lang.Object) linkedListNode46);
        linkedListNode42.setPreviousNode(linkedListNode46);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode50 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode18, linkedListNode32, (java.lang.Object) linkedListNode46);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode51 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode52 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj53 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode54 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode51, linkedListNode52, obj53);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode55 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode57 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode54, linkedListNode55, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode59 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode60 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode61 = linkedListNode60.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode62 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode63 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj64 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode65 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode62, linkedListNode63, obj64);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode66 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode68 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode65, linkedListNode66, (java.lang.Object) (short) 0);
        linkedListNode61.setNextNode(linkedListNode65);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode70 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode57, linkedListNode59, (java.lang.Object) linkedListNode61);
        linkedListNode18.setPreviousNode(linkedListNode61);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode72 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode73 = linkedListNode72.getPreviousNode();
        linkedListNode72.setValue((java.lang.Object) 1.0d);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode76 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode17, linkedListNode18, (java.lang.Object) 1.0d);
        linkedListNode9.setNextNode(linkedListNode17);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode78 = linkedListNode17.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode79 = linkedListNode17.getPreviousNode();
        linkedListNode7.setValue((java.lang.Object) linkedListNode79);
        linkedListNode4.setPreviousNode(linkedListNode7);
        boolean boolean82 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode7);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode83 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode84 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj85 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode86 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode83, linkedListNode84, obj85);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode87 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode89 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode86, linkedListNode87, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode90 = linkedListNode86.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode91 = linkedListNode86.getPreviousNode();
        boolean boolean92 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode91);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, (java.lang.Object) linkedListNode7);
        linkedListNode3.setPreviousNode(linkedListNode7);
        boolean boolean11 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode7);
        boolean boolean13 = nodeCachingLinkedList0.remove((java.lang.Object) 0.0d);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = linkedListNode16.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode14, linkedListNode15, (java.lang.Object) linkedListNode16);
        java.lang.Object obj19 = linkedListNode16.getValue();
        boolean boolean20 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode16);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList21 = new system.testclass.NodeCachingLinkedList();
        boolean boolean22 = nodeCachingLinkedList0.remove((java.lang.Object) nodeCachingLinkedList21);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList23 = new system.testclass.NodeCachingLinkedList();
        boolean boolean25 = nodeCachingLinkedList23.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = linkedListNode26.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = linkedListNode30.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode28, linkedListNode29, (java.lang.Object) linkedListNode30);
        linkedListNode26.setPreviousNode(linkedListNode30);
        boolean boolean34 = nodeCachingLinkedList23.remove((java.lang.Object) linkedListNode30);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode35 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj37 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode35, linkedListNode36, obj37);
        java.lang.Object obj39 = linkedListNode35.getValue();
        boolean boolean40 = nodeCachingLinkedList23.remove((java.lang.Object) linkedListNode35);
        java.lang.Class<?> wildcardClass41 = linkedListNode35.getClass();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) wildcardClass41);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode43 = linkedListNode42.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode44 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode45 = linkedListNode44.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode46 = linkedListNode45.getNextNode();
        linkedListNode43.setValue((java.lang.Object) linkedListNode45);
        boolean boolean48 = nodeCachingLinkedList21.add((java.lang.Object) linkedListNode45);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList21", nodeCachingLinkedList21.repOK_1());
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, (java.lang.Object) linkedListNode7);
        linkedListNode3.setPreviousNode(linkedListNode7);
        boolean boolean11 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode7);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj14 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode12, linkedListNode13, obj14);
        java.lang.Object obj16 = linkedListNode12.getValue();
        boolean boolean17 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode12);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList18 = new system.testclass.NodeCachingLinkedList();
        boolean boolean20 = nodeCachingLinkedList18.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = linkedListNode21.getPreviousNode();
        linkedListNode21.setValue((java.lang.Object) 1.0d);
        java.lang.Object obj25 = linkedListNode21.getValue();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = linkedListNode28.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode26, linkedListNode27, (java.lang.Object) linkedListNode28);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = linkedListNode27.getNextNode();
        linkedListNode21.setPreviousNode(linkedListNode31);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj35 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode33, linkedListNode34, obj35);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode37 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj39 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode40 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode37, linkedListNode38, obj39);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode43 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode40, linkedListNode41, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode45 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode46 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode47 = linkedListNode46.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode48 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode49 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj50 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode51 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode48, linkedListNode49, obj50);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode52 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode54 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode51, linkedListNode52, (java.lang.Object) (short) 0);
        linkedListNode47.setNextNode(linkedListNode51);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode56 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode43, linkedListNode45, (java.lang.Object) linkedListNode47);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode57 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode58 = linkedListNode57.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode59 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode60 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode61 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode62 = linkedListNode61.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode63 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode59, linkedListNode60, (java.lang.Object) linkedListNode61);
        linkedListNode57.setPreviousNode(linkedListNode61);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode65 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode33, linkedListNode47, (java.lang.Object) linkedListNode61);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode66 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode67 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj68 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode69 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode66, linkedListNode67, obj68);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode70 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode72 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode69, linkedListNode70, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode74 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode75 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode76 = linkedListNode75.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode77 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode78 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj79 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode80 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode77, linkedListNode78, obj79);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode81 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode83 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode80, linkedListNode81, (java.lang.Object) (short) 0);
        linkedListNode76.setNextNode(linkedListNode80);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode85 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode72, linkedListNode74, (java.lang.Object) linkedListNode76);
        linkedListNode33.setPreviousNode(linkedListNode76);
        linkedListNode31.setValue((java.lang.Object) linkedListNode76);
        boolean boolean88 = nodeCachingLinkedList18.remove((java.lang.Object) linkedListNode76);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode89 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode90 = linkedListNode89.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode91 = linkedListNode90.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode92 = linkedListNode90.getPreviousNode();
        boolean boolean93 = nodeCachingLinkedList18.remove((java.lang.Object) linkedListNode92);
        boolean boolean94 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode92);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, (java.lang.Object) linkedListNode7);
        linkedListNode3.setPreviousNode(linkedListNode7);
        boolean boolean11 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode7);
        boolean boolean13 = nodeCachingLinkedList0.remove((java.lang.Object) 0.0d);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = linkedListNode16.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode14, linkedListNode15, (java.lang.Object) linkedListNode16);
        java.lang.Object obj19 = linkedListNode16.getValue();
        boolean boolean20 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode16);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList21 = new system.testclass.NodeCachingLinkedList();
        boolean boolean22 = nodeCachingLinkedList0.remove((java.lang.Object) nodeCachingLinkedList21);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = linkedListNode23.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj27 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode25, linkedListNode26, obj27);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode28, linkedListNode29, (java.lang.Object) (short) 0);
        linkedListNode24.setNextNode(linkedListNode28);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = linkedListNode28.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode28);
        boolean boolean35 = nodeCachingLinkedList21.remove((java.lang.Object) linkedListNode28);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList36 = new system.testclass.NodeCachingLinkedList();
        boolean boolean38 = nodeCachingLinkedList36.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode40 = linkedListNode39.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode43 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode44 = linkedListNode43.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode45 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode41, linkedListNode42, (java.lang.Object) linkedListNode43);
        linkedListNode39.setPreviousNode(linkedListNode43);
        boolean boolean47 = nodeCachingLinkedList36.remove((java.lang.Object) linkedListNode43);
        boolean boolean49 = nodeCachingLinkedList36.remove((java.lang.Object) 0.0d);
        boolean boolean50 = nodeCachingLinkedList21.remove((java.lang.Object) nodeCachingLinkedList36);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode51 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode52 = linkedListNode51.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode53 = linkedListNode52.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode54 = linkedListNode52.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode55 = linkedListNode54.getNextNode();
        java.lang.Object obj56 = linkedListNode54.getValue();
        boolean boolean57 = nodeCachingLinkedList21.remove((java.lang.Object) linkedListNode54);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode58 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode59 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode60 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode61 = linkedListNode60.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode62 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode58, linkedListNode59, (java.lang.Object) linkedListNode60);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode63 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode64 = linkedListNode63.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode65 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode66 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode67 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode68 = linkedListNode67.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode69 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode65, linkedListNode66, (java.lang.Object) linkedListNode67);
        linkedListNode63.setPreviousNode(linkedListNode67);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList71 = new system.testclass.NodeCachingLinkedList();
        boolean boolean73 = nodeCachingLinkedList71.remove((java.lang.Object) 100L);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode74 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode60, linkedListNode63, (java.lang.Object) boolean73);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode75 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode76 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode77 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode78 = linkedListNode77.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode79 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode75, linkedListNode76, (java.lang.Object) linkedListNode77);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode80 = linkedListNode76.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode82 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode83 = linkedListNode82.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode85 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode80, linkedListNode83, (java.lang.Object) (byte) 10);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode86 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode80);
        linkedListNode60.setNextNode(linkedListNode86);
        boolean boolean88 = nodeCachingLinkedList21.add((java.lang.Object) linkedListNode86);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList21", nodeCachingLinkedList21.repOK_1());
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList3 = new system.testclass.NodeCachingLinkedList();
        boolean boolean5 = nodeCachingLinkedList3.remove((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass6 = nodeCachingLinkedList3.getClass();
        boolean boolean7 = nodeCachingLinkedList0.remove((java.lang.Object) wildcardClass6);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList8 = new system.testclass.NodeCachingLinkedList();
        boolean boolean10 = nodeCachingLinkedList8.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = linkedListNode11.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = linkedListNode15.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode13, linkedListNode14, (java.lang.Object) linkedListNode15);
        linkedListNode11.setPreviousNode(linkedListNode15);
        boolean boolean19 = nodeCachingLinkedList8.remove((java.lang.Object) linkedListNode15);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj22 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode20, linkedListNode21, obj22);
        java.lang.Object obj24 = linkedListNode20.getValue();
        boolean boolean25 = nodeCachingLinkedList8.remove((java.lang.Object) linkedListNode20);
        java.lang.Class<?> wildcardClass26 = linkedListNode20.getClass();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) wildcardClass26);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList28 = new system.testclass.NodeCachingLinkedList();
        boolean boolean30 = nodeCachingLinkedList28.remove((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass31 = nodeCachingLinkedList28.getClass();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) nodeCachingLinkedList28);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = linkedListNode32.getNextNode();
        linkedListNode27.setValue((java.lang.Object) linkedListNode33);
        boolean boolean35 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode33);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, (java.lang.Object) linkedListNode7);
        linkedListNode3.setPreviousNode(linkedListNode7);
        boolean boolean11 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode7);
        boolean boolean13 = nodeCachingLinkedList0.remove((java.lang.Object) 0.0d);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = linkedListNode16.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode14, linkedListNode15, (java.lang.Object) linkedListNode16);
        java.lang.Object obj19 = linkedListNode16.getValue();
        boolean boolean20 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode16);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList21 = new system.testclass.NodeCachingLinkedList();
        boolean boolean22 = nodeCachingLinkedList0.remove((java.lang.Object) nodeCachingLinkedList21);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList23 = new system.testclass.NodeCachingLinkedList();
        boolean boolean24 = nodeCachingLinkedList21.remove((java.lang.Object) nodeCachingLinkedList23);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = linkedListNode27.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode25, linkedListNode26, (java.lang.Object) linkedListNode27);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = linkedListNode27.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = linkedListNode27.getPreviousNode();
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList32 = new system.testclass.NodeCachingLinkedList();
        boolean boolean34 = nodeCachingLinkedList32.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode35 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode36 = linkedListNode35.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode37 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj39 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode40 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode37, linkedListNode38, obj39);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode43 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode40, linkedListNode41, (java.lang.Object) (short) 0);
        linkedListNode36.setNextNode(linkedListNode40);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode45 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode40);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode46 = linkedListNode45.getPreviousNode();
        boolean boolean47 = nodeCachingLinkedList32.remove((java.lang.Object) linkedListNode46);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList48 = new system.testclass.NodeCachingLinkedList();
        boolean boolean49 = nodeCachingLinkedList32.remove((java.lang.Object) nodeCachingLinkedList48);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode50 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode51 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj52 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode53 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode50, linkedListNode51, obj52);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode54 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode56 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode53, linkedListNode54, (java.lang.Object) (short) 0);
        boolean boolean57 = nodeCachingLinkedList32.remove((java.lang.Object) linkedListNode56);
        linkedListNode31.setPreviousNode(linkedListNode56);
        boolean boolean59 = nodeCachingLinkedList21.add((java.lang.Object) linkedListNode56);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList21", nodeCachingLinkedList21.repOK_1());
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode1 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode1, linkedListNode2, (java.lang.Object) linkedListNode3);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = linkedListNode5.getNextNode();
        linkedListNode5.setValue((java.lang.Object) (short) 1);
        boolean boolean9 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode5);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = linkedListNode12.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode10, linkedListNode11, (java.lang.Object) linkedListNode12);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = linkedListNode11.getNextNode();
        boolean boolean16 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode15);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList17 = new system.testclass.NodeCachingLinkedList();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = linkedListNode20.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode18, linkedListNode19, (java.lang.Object) linkedListNode20);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = linkedListNode22.getNextNode();
        boolean boolean24 = nodeCachingLinkedList17.remove((java.lang.Object) linkedListNode23);
        boolean boolean25 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode23);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, (java.lang.Object) linkedListNode7);
        linkedListNode3.setPreviousNode(linkedListNode7);
        boolean boolean11 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode7);
        boolean boolean13 = nodeCachingLinkedList0.remove((java.lang.Object) 0.0d);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = linkedListNode16.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode14, linkedListNode15, (java.lang.Object) linkedListNode16);
        java.lang.Object obj19 = linkedListNode16.getValue();
        boolean boolean20 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode16);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList21 = new system.testclass.NodeCachingLinkedList();
        boolean boolean22 = nodeCachingLinkedList0.remove((java.lang.Object) nodeCachingLinkedList21);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = linkedListNode23.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj27 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode25, linkedListNode26, obj27);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode28, linkedListNode29, (java.lang.Object) (short) 0);
        linkedListNode24.setNextNode(linkedListNode28);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = linkedListNode28.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode28);
        boolean boolean35 = nodeCachingLinkedList21.remove((java.lang.Object) linkedListNode28);
        boolean boolean37 = nodeCachingLinkedList21.remove((java.lang.Object) 1);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj40 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode38, linkedListNode39, obj40);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode44 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode41, linkedListNode42, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode45 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode46 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        linkedListNode45.setNextNode(linkedListNode46);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode48 = linkedListNode45.getPreviousNode();
        linkedListNode42.setPreviousNode(linkedListNode45);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode50 = linkedListNode42.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode51 = linkedListNode42.getPreviousNode();
        boolean boolean52 = nodeCachingLinkedList21.remove((java.lang.Object) linkedListNode42);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode53 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode54 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj55 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode56 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode53, linkedListNode54, obj55);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode57 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode59 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode56, linkedListNode57, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode60 = linkedListNode56.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode61 = linkedListNode56.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode62 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode63 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        linkedListNode62.setNextNode(linkedListNode63);
        linkedListNode61.setPreviousNode(linkedListNode63);
        boolean boolean66 = nodeCachingLinkedList21.add((java.lang.Object) linkedListNode63);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList21", nodeCachingLinkedList21.repOK_1());
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj7 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, obj7);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode8, linkedListNode9, (java.lang.Object) (short) 0);
        linkedListNode4.setNextNode(linkedListNode8);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode8);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = linkedListNode13.getPreviousNode();
        boolean boolean15 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode14);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList16 = new system.testclass.NodeCachingLinkedList();
        boolean boolean17 = nodeCachingLinkedList0.remove((java.lang.Object) nodeCachingLinkedList16);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList18 = new system.testclass.NodeCachingLinkedList();
        boolean boolean20 = nodeCachingLinkedList18.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = linkedListNode21.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = linkedListNode25.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode23, linkedListNode24, (java.lang.Object) linkedListNode25);
        linkedListNode21.setPreviousNode(linkedListNode25);
        boolean boolean29 = nodeCachingLinkedList18.remove((java.lang.Object) linkedListNode25);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj32 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode30, linkedListNode31, obj32);
        linkedListNode30.setValue((java.lang.Object) ' ');
        boolean boolean36 = nodeCachingLinkedList18.remove((java.lang.Object) ' ');
        boolean boolean37 = nodeCachingLinkedList0.add((java.lang.Object) nodeCachingLinkedList18);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, (java.lang.Object) linkedListNode7);
        linkedListNode3.setPreviousNode(linkedListNode7);
        boolean boolean11 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode7);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj14 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode12, linkedListNode13, obj14);
        java.lang.Object obj16 = linkedListNode12.getValue();
        boolean boolean17 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode12);
        boolean boolean19 = nodeCachingLinkedList0.remove((java.lang.Object) (-1.0f));
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = linkedListNode20.getPreviousNode();
        linkedListNode20.setValue((java.lang.Object) 1.0d);
        java.lang.Object obj24 = linkedListNode20.getValue();
        boolean boolean25 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode20);
        boolean boolean27 = nodeCachingLinkedList0.remove((java.lang.Object) 10);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj30 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode28, linkedListNode29, obj30);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode31, linkedListNode32, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode35 = linkedListNode31.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode37 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj38 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode36, linkedListNode37, obj38);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode40 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode39, linkedListNode40, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode44 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode45 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode46 = linkedListNode45.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode47 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode48 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj49 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode50 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode47, linkedListNode48, obj49);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode51 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode53 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode50, linkedListNode51, (java.lang.Object) (short) 0);
        linkedListNode46.setNextNode(linkedListNode50);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode55 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode42, linkedListNode44, (java.lang.Object) linkedListNode46);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode56 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode57 = linkedListNode56.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode58 = linkedListNode57.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode59 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode60 = linkedListNode59.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode61 = linkedListNode60.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode62 = linkedListNode60.getPreviousNode();
        linkedListNode58.setValue((java.lang.Object) linkedListNode62);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode64 = linkedListNode58.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode65 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode66 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode67 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode68 = linkedListNode67.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode69 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode65, linkedListNode66, (java.lang.Object) linkedListNode67);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode70 = linkedListNode66.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode72 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode73 = linkedListNode72.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode75 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode70, linkedListNode73, (java.lang.Object) (byte) 10);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode76 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode55, linkedListNode58, (java.lang.Object) linkedListNode73);
        linkedListNode35.setPreviousNode(linkedListNode58);
        boolean boolean78 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode35);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test71");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, (java.lang.Object) linkedListNode7);
        linkedListNode3.setPreviousNode(linkedListNode7);
        boolean boolean11 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode7);
        boolean boolean13 = nodeCachingLinkedList0.remove((java.lang.Object) 0.0d);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = linkedListNode16.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode14, linkedListNode15, (java.lang.Object) linkedListNode16);
        java.lang.Object obj19 = linkedListNode16.getValue();
        boolean boolean20 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode16);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList21 = new system.testclass.NodeCachingLinkedList();
        boolean boolean22 = nodeCachingLinkedList0.remove((java.lang.Object) nodeCachingLinkedList21);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList23 = new system.testclass.NodeCachingLinkedList();
        boolean boolean24 = nodeCachingLinkedList21.remove((java.lang.Object) nodeCachingLinkedList23);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = linkedListNode25.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = linkedListNode26.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode27);
        boolean boolean29 = nodeCachingLinkedList23.remove((java.lang.Object) linkedListNode27);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList30 = new system.testclass.NodeCachingLinkedList();
        boolean boolean32 = nodeCachingLinkedList30.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = linkedListNode33.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode35 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode37 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode38 = linkedListNode37.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode35, linkedListNode36, (java.lang.Object) linkedListNode37);
        linkedListNode33.setPreviousNode(linkedListNode37);
        boolean boolean41 = nodeCachingLinkedList30.remove((java.lang.Object) linkedListNode37);
        boolean boolean43 = nodeCachingLinkedList30.remove((java.lang.Object) 0.0d);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode44 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode45 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode46 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode47 = linkedListNode46.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode48 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode44, linkedListNode45, (java.lang.Object) linkedListNode46);
        java.lang.Object obj49 = linkedListNode46.getValue();
        boolean boolean50 = nodeCachingLinkedList30.remove((java.lang.Object) linkedListNode46);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList51 = new system.testclass.NodeCachingLinkedList();
        boolean boolean52 = nodeCachingLinkedList30.remove((java.lang.Object) nodeCachingLinkedList51);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode53 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode54 = linkedListNode53.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode55 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode56 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj57 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode58 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode55, linkedListNode56, obj57);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode59 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode61 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode58, linkedListNode59, (java.lang.Object) (short) 0);
        linkedListNode54.setNextNode(linkedListNode58);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode63 = linkedListNode58.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode64 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode58);
        boolean boolean65 = nodeCachingLinkedList51.remove((java.lang.Object) linkedListNode58);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList66 = new system.testclass.NodeCachingLinkedList();
        boolean boolean68 = nodeCachingLinkedList66.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode69 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode70 = linkedListNode69.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode71 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode72 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode73 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode74 = linkedListNode73.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode75 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode71, linkedListNode72, (java.lang.Object) linkedListNode73);
        linkedListNode69.setPreviousNode(linkedListNode73);
        boolean boolean77 = nodeCachingLinkedList66.remove((java.lang.Object) linkedListNode73);
        boolean boolean79 = nodeCachingLinkedList66.remove((java.lang.Object) 0.0d);
        boolean boolean80 = nodeCachingLinkedList51.remove((java.lang.Object) nodeCachingLinkedList66);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode81 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode82 = linkedListNode81.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode83 = linkedListNode82.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode84 = linkedListNode82.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode85 = linkedListNode84.getNextNode();
        java.lang.Object obj86 = linkedListNode84.getValue();
        boolean boolean87 = nodeCachingLinkedList51.remove((java.lang.Object) linkedListNode84);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode88 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode89 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode90 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode91 = linkedListNode90.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode92 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode88, linkedListNode89, (java.lang.Object) linkedListNode90);
        java.lang.Object obj93 = linkedListNode89.getValue();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode94 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode89);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode95 = linkedListNode94.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode96 = linkedListNode94.getPreviousNode();
        boolean boolean97 = nodeCachingLinkedList51.remove((java.lang.Object) linkedListNode96);
        boolean boolean98 = nodeCachingLinkedList23.add((java.lang.Object) linkedListNode96);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList23", nodeCachingLinkedList23.repOK_1());
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test72");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, (java.lang.Object) linkedListNode7);
        linkedListNode3.setPreviousNode(linkedListNode7);
        boolean boolean11 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode7);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj14 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode12, linkedListNode13, obj14);
        java.lang.Object obj16 = linkedListNode12.getValue();
        boolean boolean17 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode12);
        boolean boolean19 = nodeCachingLinkedList0.remove((java.lang.Object) (-1.0f));
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj22 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode20, linkedListNode21, obj22);
        java.lang.Object obj24 = linkedListNode20.getValue();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = linkedListNode20.getNextNode();
        boolean boolean26 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode25);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test73");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, (java.lang.Object) linkedListNode7);
        linkedListNode3.setPreviousNode(linkedListNode7);
        boolean boolean11 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode7);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj14 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode12, linkedListNode13, obj14);
        java.lang.Object obj16 = linkedListNode12.getValue();
        boolean boolean17 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode12);
        boolean boolean19 = nodeCachingLinkedList0.remove((java.lang.Object) (-1.0f));
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = linkedListNode20.getPreviousNode();
        linkedListNode20.setValue((java.lang.Object) 1.0d);
        java.lang.Object obj24 = linkedListNode20.getValue();
        boolean boolean25 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode20);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = linkedListNode26.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = linkedListNode27.getNextNode();
        boolean boolean29 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode27);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test74");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList3 = new system.testclass.NodeCachingLinkedList();
        boolean boolean5 = nodeCachingLinkedList3.remove((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass6 = nodeCachingLinkedList3.getClass();
        boolean boolean7 = nodeCachingLinkedList0.remove((java.lang.Object) wildcardClass6);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList8 = new system.testclass.NodeCachingLinkedList();
        boolean boolean10 = nodeCachingLinkedList8.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = linkedListNode11.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = linkedListNode15.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode13, linkedListNode14, (java.lang.Object) linkedListNode15);
        linkedListNode11.setPreviousNode(linkedListNode15);
        boolean boolean19 = nodeCachingLinkedList8.remove((java.lang.Object) linkedListNode15);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj22 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode20, linkedListNode21, obj22);
        java.lang.Object obj24 = linkedListNode20.getValue();
        boolean boolean25 = nodeCachingLinkedList8.remove((java.lang.Object) linkedListNode20);
        java.lang.Class<?> wildcardClass26 = linkedListNode20.getClass();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) wildcardClass26);
        boolean boolean28 = nodeCachingLinkedList0.add((java.lang.Object) wildcardClass26);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test75");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj7 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, obj7);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode8, linkedListNode9, (java.lang.Object) (short) 0);
        linkedListNode4.setNextNode(linkedListNode8);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode8);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = linkedListNode13.getPreviousNode();
        boolean boolean15 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode14);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) nodeCachingLinkedList0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = linkedListNode17.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj21 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode19, linkedListNode20, obj21);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode22, linkedListNode23, (java.lang.Object) (short) 0);
        linkedListNode18.setNextNode(linkedListNode22);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode22);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj30 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode28, linkedListNode29, obj30);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj34 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode35 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode32, linkedListNode33, obj34);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode35, linkedListNode36, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode40 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = linkedListNode41.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode43 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode44 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj45 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode46 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode43, linkedListNode44, obj45);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode47 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode49 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode46, linkedListNode47, (java.lang.Object) (short) 0);
        linkedListNode42.setNextNode(linkedListNode46);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode51 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode38, linkedListNode40, (java.lang.Object) linkedListNode42);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode52 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode53 = linkedListNode52.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode54 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode55 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode56 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode57 = linkedListNode56.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode58 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode54, linkedListNode55, (java.lang.Object) linkedListNode56);
        linkedListNode52.setPreviousNode(linkedListNode56);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode60 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode28, linkedListNode42, (java.lang.Object) linkedListNode56);
        linkedListNode27.setNextNode(linkedListNode28);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode62 = linkedListNode27.getPreviousNode();
        java.lang.Object obj63 = linkedListNode62.getValue();
        boolean boolean64 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode62);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test76");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, (java.lang.Object) linkedListNode7);
        linkedListNode3.setPreviousNode(linkedListNode7);
        boolean boolean11 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode7);
        boolean boolean13 = nodeCachingLinkedList0.remove((java.lang.Object) 0.0d);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = linkedListNode16.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode14, linkedListNode15, (java.lang.Object) linkedListNode16);
        java.lang.Object obj19 = linkedListNode16.getValue();
        boolean boolean20 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode16);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList21 = new system.testclass.NodeCachingLinkedList();
        boolean boolean22 = nodeCachingLinkedList0.remove((java.lang.Object) nodeCachingLinkedList21);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = linkedListNode23.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj27 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode25, linkedListNode26, obj27);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode28, linkedListNode29, (java.lang.Object) (short) 0);
        linkedListNode24.setNextNode(linkedListNode28);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = linkedListNode28.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode28);
        boolean boolean35 = nodeCachingLinkedList21.remove((java.lang.Object) linkedListNode28);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode37 = linkedListNode36.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj40 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode38, linkedListNode39, obj40);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode44 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode41, linkedListNode42, (java.lang.Object) (short) 0);
        linkedListNode37.setNextNode(linkedListNode41);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode46 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode41);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode47 = linkedListNode41.getPreviousNode();
        boolean boolean48 = nodeCachingLinkedList21.remove((java.lang.Object) linkedListNode41);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode49 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        boolean boolean50 = nodeCachingLinkedList21.remove((java.lang.Object) linkedListNode49);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode51 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode52 = linkedListNode51.getPreviousNode();
        boolean boolean53 = nodeCachingLinkedList21.add((java.lang.Object) linkedListNode51);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList21", nodeCachingLinkedList21.repOK_1());
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test77");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, (java.lang.Object) linkedListNode7);
        linkedListNode3.setPreviousNode(linkedListNode7);
        boolean boolean11 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode7);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj14 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode12, linkedListNode13, obj14);
        java.lang.Object obj16 = linkedListNode12.getValue();
        boolean boolean17 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode12);
        boolean boolean19 = nodeCachingLinkedList0.remove((java.lang.Object) (-1.0f));
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = linkedListNode20.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj24 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode22, linkedListNode23, obj24);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode25, linkedListNode26, (java.lang.Object) (short) 0);
        linkedListNode21.setNextNode(linkedListNode25);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode25);
        java.lang.Object obj31 = linkedListNode30.getValue();
        boolean boolean32 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode30);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test78");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj7 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, obj7);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode8, linkedListNode9, (java.lang.Object) (short) 0);
        linkedListNode4.setNextNode(linkedListNode8);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode8);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = linkedListNode13.getPreviousNode();
        boolean boolean15 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode14);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList16 = new system.testclass.NodeCachingLinkedList();
        boolean boolean17 = nodeCachingLinkedList0.remove((java.lang.Object) nodeCachingLinkedList16);
        boolean boolean19 = nodeCachingLinkedList0.remove((java.lang.Object) (short) 1);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = linkedListNode22.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode20, linkedListNode21, (java.lang.Object) linkedListNode22);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = linkedListNode21.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = linkedListNode27.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode25, linkedListNode28, (java.lang.Object) (byte) 10);
        boolean boolean31 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode28);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj34 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode35 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode32, linkedListNode33, obj34);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode35, linkedListNode36, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = linkedListNode35.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode40 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj42 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode43 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode40, linkedListNode41, obj42);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode44 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode46 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode43, linkedListNode44, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode47 = linkedListNode43.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode48 = linkedListNode43.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode49 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode50 = linkedListNode49.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode51 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode52 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode53 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode54 = linkedListNode53.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode55 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode51, linkedListNode52, (java.lang.Object) linkedListNode53);
        linkedListNode49.setPreviousNode(linkedListNode53);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode57 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode39, linkedListNode43, (java.lang.Object) linkedListNode53);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode58 = linkedListNode53.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode59 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode60 = linkedListNode59.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode61 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode62 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj63 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode64 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode61, linkedListNode62, obj63);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode65 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode67 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode64, linkedListNode65, (java.lang.Object) (short) 0);
        linkedListNode60.setNextNode(linkedListNode64);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode69 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode70 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode71 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode72 = linkedListNode71.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode73 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode69, linkedListNode70, (java.lang.Object) linkedListNode71);
        java.lang.Object obj74 = linkedListNode70.getValue();
        linkedListNode60.setPreviousNode(linkedListNode70);
        java.lang.Object obj76 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode77 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode53, linkedListNode70, obj76);
        boolean boolean78 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode77);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test79");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode1 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) nodeCachingLinkedList0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = linkedListNode2.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj6 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode4, linkedListNode5, obj6);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode7, linkedListNode8, (java.lang.Object) (short) 0);
        linkedListNode3.setNextNode(linkedListNode7);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode7);
        boolean boolean13 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode12);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test80");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, (java.lang.Object) linkedListNode7);
        linkedListNode3.setPreviousNode(linkedListNode7);
        boolean boolean11 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode7);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj14 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode12, linkedListNode13, obj14);
        java.lang.Object obj16 = linkedListNode12.getValue();
        boolean boolean17 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode12);
        boolean boolean19 = nodeCachingLinkedList0.remove((java.lang.Object) (-1.0f));
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = linkedListNode20.getPreviousNode();
        linkedListNode20.setValue((java.lang.Object) 1.0d);
        java.lang.Object obj24 = linkedListNode20.getValue();
        boolean boolean25 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode20);
        boolean boolean27 = nodeCachingLinkedList0.remove((java.lang.Object) 10);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj30 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode28, linkedListNode29, obj30);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj34 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode35 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode32, linkedListNode33, obj34);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode35, linkedListNode36, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode40 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = linkedListNode41.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode43 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode44 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj45 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode46 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode43, linkedListNode44, obj45);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode47 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode49 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode46, linkedListNode47, (java.lang.Object) (short) 0);
        linkedListNode42.setNextNode(linkedListNode46);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode51 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode38, linkedListNode40, (java.lang.Object) linkedListNode42);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode52 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode53 = linkedListNode52.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode54 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode55 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode56 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode57 = linkedListNode56.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode58 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode54, linkedListNode55, (java.lang.Object) linkedListNode56);
        linkedListNode52.setPreviousNode(linkedListNode56);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode60 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode28, linkedListNode42, (java.lang.Object) linkedListNode56);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode61 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode62 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj63 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode64 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode61, linkedListNode62, obj63);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode65 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode67 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode64, linkedListNode65, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode69 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode70 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode71 = linkedListNode70.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode72 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode73 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj74 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode75 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode72, linkedListNode73, obj74);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode76 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode78 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode75, linkedListNode76, (java.lang.Object) (short) 0);
        linkedListNode71.setNextNode(linkedListNode75);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode80 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode67, linkedListNode69, (java.lang.Object) linkedListNode71);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode81 = linkedListNode80.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode82 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode83 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode60, linkedListNode80, (java.lang.Object) linkedListNode82);
        java.lang.Object obj84 = linkedListNode80.getValue();
        boolean boolean85 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode80);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test81");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList3 = new system.testclass.NodeCachingLinkedList();
        boolean boolean5 = nodeCachingLinkedList3.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList6 = new system.testclass.NodeCachingLinkedList();
        boolean boolean8 = nodeCachingLinkedList6.remove((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass9 = nodeCachingLinkedList6.getClass();
        boolean boolean10 = nodeCachingLinkedList3.remove((java.lang.Object) wildcardClass9);
        boolean boolean11 = nodeCachingLinkedList0.remove((java.lang.Object) nodeCachingLinkedList3);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = linkedListNode14.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode12, linkedListNode13, (java.lang.Object) linkedListNode14);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = linkedListNode13.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode20 = linkedListNode19.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode17, linkedListNode20, (java.lang.Object) (byte) 10);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = linkedListNode23.getPreviousNode();
        linkedListNode23.setValue((java.lang.Object) 1.0d);
        java.lang.Object obj27 = linkedListNode23.getValue();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = linkedListNode30.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode28, linkedListNode29, (java.lang.Object) linkedListNode30);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = linkedListNode29.getNextNode();
        linkedListNode23.setPreviousNode(linkedListNode33);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode35 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj37 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode35, linkedListNode36, obj37);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode38, linkedListNode39, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode43 = linkedListNode42.getPreviousNode();
        linkedListNode42.setValue((java.lang.Object) 1.0d);
        java.lang.Object obj46 = linkedListNode42.getValue();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode47 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode48 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode49 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode50 = linkedListNode49.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode51 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode47, linkedListNode48, (java.lang.Object) linkedListNode49);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode52 = linkedListNode48.getNextNode();
        linkedListNode42.setPreviousNode(linkedListNode52);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList54 = new system.testclass.NodeCachingLinkedList();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode55 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode56 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode57 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode58 = linkedListNode57.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode59 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode55, linkedListNode56, (java.lang.Object) linkedListNode57);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode60 = linkedListNode59.getNextNode();
        linkedListNode59.setValue((java.lang.Object) (short) 1);
        boolean boolean63 = nodeCachingLinkedList54.remove((java.lang.Object) linkedListNode59);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode64 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode39, linkedListNode42, (java.lang.Object) boolean63);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode65 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode17, linkedListNode33, (java.lang.Object) linkedListNode64);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode66 = linkedListNode64.getPreviousNode();
        boolean boolean67 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode66);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test82");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) 100L);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList3 = new system.testclass.NodeCachingLinkedList();
        boolean boolean5 = nodeCachingLinkedList3.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = linkedListNode6.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode10 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = linkedListNode10.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode8, linkedListNode9, (java.lang.Object) linkedListNode10);
        linkedListNode6.setPreviousNode(linkedListNode10);
        boolean boolean14 = nodeCachingLinkedList3.remove((java.lang.Object) linkedListNode10);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj17 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode15, linkedListNode16, obj17);
        java.lang.Object obj19 = linkedListNode15.getValue();
        boolean boolean20 = nodeCachingLinkedList3.remove((java.lang.Object) linkedListNode15);
        java.lang.Class<?> wildcardClass21 = linkedListNode15.getClass();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) wildcardClass21);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = linkedListNode22.getPreviousNode();
        boolean boolean24 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode22);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj27 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode25, linkedListNode26, obj27);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode28, linkedListNode29, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = linkedListNode28.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj35 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode33, linkedListNode34, obj35);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode37 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode36, linkedListNode37, (java.lang.Object) (short) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode40 = linkedListNode36.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = linkedListNode36.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode43 = linkedListNode42.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode44 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode45 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode46 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode47 = linkedListNode46.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode48 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode44, linkedListNode45, (java.lang.Object) linkedListNode46);
        linkedListNode42.setPreviousNode(linkedListNode46);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode50 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode32, linkedListNode36, (java.lang.Object) linkedListNode46);
        boolean boolean51 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode32);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode52 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode53 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode54 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode55 = linkedListNode54.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode56 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode52, linkedListNode53, (java.lang.Object) linkedListNode54);
        java.lang.Object obj57 = linkedListNode53.getValue();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode58 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode53);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode59 = linkedListNode58.getPreviousNode();
        boolean boolean60 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode58);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test83");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj7 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, obj7);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode8, linkedListNode9, (java.lang.Object) (short) 0);
        linkedListNode4.setNextNode(linkedListNode8);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode8);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = linkedListNode13.getPreviousNode();
        boolean boolean15 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode14);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj18 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode16, linkedListNode17, obj18);
        linkedListNode17.setValue((java.lang.Object) 100.0f);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode22 = linkedListNode17.getPreviousNode();
        boolean boolean23 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode17);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList24 = new system.testclass.NodeCachingLinkedList();
        boolean boolean26 = nodeCachingLinkedList24.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode27 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = linkedListNode27.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode30 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode32 = linkedListNode31.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode29, linkedListNode30, (java.lang.Object) linkedListNode31);
        linkedListNode27.setPreviousNode(linkedListNode31);
        boolean boolean35 = nodeCachingLinkedList24.remove((java.lang.Object) linkedListNode31);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode37 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj38 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode36, linkedListNode37, obj38);
        java.lang.Object obj40 = linkedListNode36.getValue();
        boolean boolean41 = nodeCachingLinkedList24.remove((java.lang.Object) linkedListNode36);
        java.lang.Class<?> wildcardClass42 = linkedListNode36.getClass();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode43 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) wildcardClass42);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode44 = linkedListNode43.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode45 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode46 = linkedListNode45.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode47 = linkedListNode46.getNextNode();
        linkedListNode44.setValue((java.lang.Object) linkedListNode46);
        boolean boolean49 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode44);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList50 = new system.testclass.NodeCachingLinkedList();
        boolean boolean52 = nodeCachingLinkedList50.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode53 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode54 = linkedListNode53.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode55 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode56 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode57 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode58 = linkedListNode57.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode59 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode55, linkedListNode56, (java.lang.Object) linkedListNode57);
        linkedListNode53.setPreviousNode(linkedListNode57);
        boolean boolean61 = nodeCachingLinkedList50.remove((java.lang.Object) linkedListNode57);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode62 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode63 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj64 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode65 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode62, linkedListNode63, obj64);
        java.lang.Object obj66 = linkedListNode62.getValue();
        boolean boolean67 = nodeCachingLinkedList50.remove((java.lang.Object) linkedListNode62);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode68 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode69 = linkedListNode68.getPreviousNode();
        linkedListNode68.setValue((java.lang.Object) 1.0d);
        java.lang.Class<?> wildcardClass72 = linkedListNode68.getClass();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode73 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) wildcardClass72);
        boolean boolean74 = nodeCachingLinkedList50.remove((java.lang.Object) wildcardClass72);
        boolean boolean75 = nodeCachingLinkedList0.add((java.lang.Object) boolean74);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test84");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode7.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode5, linkedListNode6, (java.lang.Object) linkedListNode7);
        linkedListNode3.setPreviousNode(linkedListNode7);
        boolean boolean11 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode7);
        boolean boolean13 = nodeCachingLinkedList0.remove((java.lang.Object) 0.0d);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode17 = linkedListNode16.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode14, linkedListNode15, (java.lang.Object) linkedListNode16);
        java.lang.Object obj19 = linkedListNode16.getValue();
        boolean boolean20 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode16);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList21 = new system.testclass.NodeCachingLinkedList();
        boolean boolean22 = nodeCachingLinkedList0.remove((java.lang.Object) nodeCachingLinkedList21);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode24 = linkedListNode23.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode26 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj27 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode25, linkedListNode26, obj27);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode28, linkedListNode29, (java.lang.Object) (short) 0);
        linkedListNode24.setNextNode(linkedListNode28);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode33 = linkedListNode28.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode34 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode28);
        boolean boolean35 = nodeCachingLinkedList21.remove((java.lang.Object) linkedListNode28);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList36 = new system.testclass.NodeCachingLinkedList();
        boolean boolean38 = nodeCachingLinkedList36.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode39 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode40 = linkedListNode39.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode41 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode43 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode44 = linkedListNode43.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode45 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode41, linkedListNode42, (java.lang.Object) linkedListNode43);
        linkedListNode39.setPreviousNode(linkedListNode43);
        boolean boolean47 = nodeCachingLinkedList36.remove((java.lang.Object) linkedListNode43);
        boolean boolean49 = nodeCachingLinkedList36.remove((java.lang.Object) 0.0d);
        boolean boolean50 = nodeCachingLinkedList21.remove((java.lang.Object) nodeCachingLinkedList36);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode51 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode52 = linkedListNode51.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode53 = linkedListNode52.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode54 = linkedListNode52.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode55 = linkedListNode54.getNextNode();
        java.lang.Object obj56 = linkedListNode54.getValue();
        boolean boolean57 = nodeCachingLinkedList21.remove((java.lang.Object) linkedListNode54);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode58 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode59 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode60 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode61 = linkedListNode60.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode62 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode58, linkedListNode59, (java.lang.Object) linkedListNode60);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode63 = linkedListNode59.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode64 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode59);
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList65 = new system.testclass.NodeCachingLinkedList();
        boolean boolean67 = nodeCachingLinkedList65.remove((java.lang.Object) (byte) 0);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode68 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode69 = linkedListNode68.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode70 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode71 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode72 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode73 = linkedListNode72.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode74 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode70, linkedListNode71, (java.lang.Object) linkedListNode72);
        linkedListNode68.setPreviousNode(linkedListNode72);
        boolean boolean76 = nodeCachingLinkedList65.remove((java.lang.Object) linkedListNode72);
        boolean boolean78 = nodeCachingLinkedList65.remove((java.lang.Object) 0.0d);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode79 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode80 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode81 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode82 = linkedListNode81.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode83 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode79, linkedListNode80, (java.lang.Object) linkedListNode81);
        java.lang.Object obj84 = linkedListNode81.getValue();
        boolean boolean85 = nodeCachingLinkedList65.remove((java.lang.Object) linkedListNode81);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode86 = new system.testclass.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode81);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode87 = linkedListNode86.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode88 = linkedListNode87.getPreviousNode();
        linkedListNode64.setNextNode(linkedListNode87);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode90 = linkedListNode87.getPreviousNode();
        boolean boolean91 = nodeCachingLinkedList21.add((java.lang.Object) linkedListNode87);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList21", nodeCachingLinkedList21.repOK_1());
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test85");
        system.testclass.NodeCachingLinkedList nodeCachingLinkedList0 = new system.testclass.NodeCachingLinkedList();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode1 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode4 = linkedListNode3.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode1, linkedListNode2, (java.lang.Object) linkedListNode3);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode6 = linkedListNode5.getNextNode();
        linkedListNode5.setValue((java.lang.Object) (short) 1);
        boolean boolean9 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode5);
        java.lang.Object obj10 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.testclass.NodeCachingLinkedList.LinkedListNode(obj10);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode12 = linkedListNode11.getNextNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode14 = linkedListNode13.getPreviousNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        java.lang.Object obj17 = null;
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode15, linkedListNode16, obj17);
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.testclass.NodeCachingLinkedList.LinkedListNode();
        system.testclass.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.testclass.NodeCachingLinkedList.LinkedListNode(linkedListNode18, linkedListNode19, (java.lang.Object) (short) 0);
        linkedListNode14.setNextNode(linkedListNode18);
        linkedListNode12.setPreviousNode(linkedListNode14);
        boolean boolean24 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode12);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_1());
    }
}

