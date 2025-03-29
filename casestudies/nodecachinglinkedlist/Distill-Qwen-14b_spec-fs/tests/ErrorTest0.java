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
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.repOK();
        boolean boolean3 = nodeCachingLinkedList0.add((java.lang.Object) 10.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) (short) 100);
        boolean boolean4 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode3);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode4.setNextNode(linkedListNode6);
        linkedListNode6.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode10 = linkedListNode6.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode14 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode12.setNextNode(linkedListNode14);
        java.lang.Object obj16 = null;
        linkedListNode14.setValue(obj16);
        linkedListNode10.setPreviousNode(linkedListNode14);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode22.setNextNode(linkedListNode24);
        linkedListNode24.setValue((java.lang.Object) (-1.0f));
        linkedListNode20.setPreviousNode(linkedListNode24);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode2, linkedListNode14, (java.lang.Object) linkedListNode20);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode30 = linkedListNode29.getNextNode();
        boolean boolean31 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode30);
        boolean boolean33 = nodeCachingLinkedList0.add((java.lang.Object) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode4.setNextNode(linkedListNode6);
        linkedListNode6.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode10 = linkedListNode6.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode14 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode12.setNextNode(linkedListNode14);
        java.lang.Object obj16 = null;
        linkedListNode14.setValue(obj16);
        linkedListNode10.setPreviousNode(linkedListNode14);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode22.setNextNode(linkedListNode24);
        linkedListNode24.setValue((java.lang.Object) (-1.0f));
        linkedListNode20.setPreviousNode(linkedListNode24);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode2, linkedListNode14, (java.lang.Object) linkedListNode20);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode30 = linkedListNode29.getNextNode();
        boolean boolean31 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode30);
        boolean boolean32 = nodeCachingLinkedList0.repOK();
        boolean boolean34 = nodeCachingLinkedList0.remove((java.lang.Object) 0);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode40 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode38.setNextNode(linkedListNode40);
        linkedListNode40.setValue((java.lang.Object) (-1.0f));
        linkedListNode36.setPreviousNode(linkedListNode40);
        boolean boolean45 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode36);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) 0);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 100.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) (short) 100);
        java.lang.Object obj7 = linkedListNode6.getValue();
        linkedListNode4.setNextNode(linkedListNode6);
        boolean boolean9 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode4);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) 0);
        boolean boolean4 = nodeCachingLinkedList0.add((java.lang.Object) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode4.setNextNode(linkedListNode6);
        linkedListNode6.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode10 = linkedListNode6.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode14 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode12.setNextNode(linkedListNode14);
        java.lang.Object obj16 = null;
        linkedListNode14.setValue(obj16);
        linkedListNode10.setPreviousNode(linkedListNode14);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode22.setNextNode(linkedListNode24);
        linkedListNode24.setValue((java.lang.Object) (-1.0f));
        linkedListNode20.setPreviousNode(linkedListNode24);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode2, linkedListNode14, (java.lang.Object) linkedListNode20);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode30 = linkedListNode29.getNextNode();
        boolean boolean31 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode30);
        boolean boolean32 = nodeCachingLinkedList0.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode34 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 1);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode36.setNextNode(linkedListNode38);
        linkedListNode38.setValue((java.lang.Object) (-1.0f));
        linkedListNode38.setValue((java.lang.Object) ' ');
        linkedListNode34.setNextNode(linkedListNode38);
        boolean boolean45 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode34);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) 0);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode4.setNextNode(linkedListNode6);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode8 = null;
        linkedListNode6.setNextNode(linkedListNode8);
        java.lang.Object obj10 = linkedListNode6.getValue();
        boolean boolean11 = nodeCachingLinkedList0.add(obj10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) 1.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode4.setNextNode(linkedListNode6);
        linkedListNode6.setValue((java.lang.Object) (-1.0f));
        linkedListNode6.setValue((java.lang.Object) ' ');
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode12 = linkedListNode6.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode14 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 100.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode16.setNextNode(linkedListNode18);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode21.setNextNode(linkedListNode23);
        java.lang.Object obj25 = null;
        linkedListNode23.setValue(obj25);
        linkedListNode16.setNextNode(linkedListNode23);
        linkedListNode14.setValue((java.lang.Object) linkedListNode16);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode29 = linkedListNode14.getNextNode();
        linkedListNode6.setValue((java.lang.Object) linkedListNode29);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode32 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode34 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode34.setNextNode(linkedListNode36);
        linkedListNode36.setValue((java.lang.Object) (-1.0f));
        linkedListNode36.setValue((java.lang.Object) ' ');
        linkedListNode32.setNextNode(linkedListNode36);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode43 = linkedListNode32.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode44 = linkedListNode32.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode46 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) (short) 100);
        linkedListNode44.setPreviousNode(linkedListNode46);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode49 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode51 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode49.setNextNode(linkedListNode51);
        linkedListNode51.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode55 = linkedListNode51.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode56 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode55);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode57 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode56);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode59 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode46, linkedListNode57, (java.lang.Object) 0.0d);
        linkedListNode6.setValue((java.lang.Object) linkedListNode59);
        boolean boolean61 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode6);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode4.setNextNode(linkedListNode6);
        linkedListNode6.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode10 = linkedListNode6.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode14 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode12.setNextNode(linkedListNode14);
        java.lang.Object obj16 = null;
        linkedListNode14.setValue(obj16);
        linkedListNode10.setPreviousNode(linkedListNode14);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode22.setNextNode(linkedListNode24);
        linkedListNode24.setValue((java.lang.Object) (-1.0f));
        linkedListNode20.setPreviousNode(linkedListNode24);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode2, linkedListNode14, (java.lang.Object) linkedListNode20);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode30 = linkedListNode29.getNextNode();
        boolean boolean31 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode30);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode35 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode37 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode35.setNextNode(linkedListNode37);
        linkedListNode37.setValue((java.lang.Object) (-1.0f));
        linkedListNode37.setValue((java.lang.Object) ' ');
        linkedListNode33.setNextNode(linkedListNode37);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode44 = linkedListNode33.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode45 = linkedListNode33.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode47 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) (short) 100);
        linkedListNode45.setPreviousNode(linkedListNode47);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode50 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 1);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode52 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode54 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode52.setNextNode(linkedListNode54);
        linkedListNode54.setValue((java.lang.Object) (-1.0f));
        linkedListNode54.setValue((java.lang.Object) ' ');
        linkedListNode50.setNextNode(linkedListNode54);
        linkedListNode45.setPreviousNode(linkedListNode54);
        java.lang.Object obj62 = linkedListNode45.getValue();
        boolean boolean63 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode45);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode4.setNextNode(linkedListNode6);
        linkedListNode6.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode10 = linkedListNode6.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode14 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode12.setNextNode(linkedListNode14);
        java.lang.Object obj16 = null;
        linkedListNode14.setValue(obj16);
        linkedListNode10.setPreviousNode(linkedListNode14);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode22.setNextNode(linkedListNode24);
        linkedListNode24.setValue((java.lang.Object) (-1.0f));
        linkedListNode20.setPreviousNode(linkedListNode24);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode2, linkedListNode14, (java.lang.Object) linkedListNode20);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode30 = linkedListNode29.getNextNode();
        boolean boolean31 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode30);
        boolean boolean32 = nodeCachingLinkedList0.repOK();
        boolean boolean33 = nodeCachingLinkedList0.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode35 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode37 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode39 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode37.setNextNode(linkedListNode39);
        linkedListNode39.setValue((java.lang.Object) (-1.0f));
        linkedListNode39.setValue((java.lang.Object) ' ');
        linkedListNode35.setNextNode(linkedListNode39);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode46 = linkedListNode35.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode47 = linkedListNode35.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode49 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) (short) 100);
        linkedListNode47.setPreviousNode(linkedListNode49);
        boolean boolean51 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode49);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode5.setNextNode(linkedListNode7);
        linkedListNode7.setValue((java.lang.Object) (-1.0f));
        linkedListNode3.setPreviousNode(linkedListNode7);
        boolean boolean12 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode3);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode6.setNextNode(linkedListNode8);
        linkedListNode8.setValue((java.lang.Object) (-1.0f));
        linkedListNode8.setValue((java.lang.Object) ' ');
        linkedListNode4.setNextNode(linkedListNode8);
        linkedListNode2.setPreviousNode(linkedListNode8);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode19.setNextNode(linkedListNode21);
        linkedListNode21.setValue((java.lang.Object) (-1.0f));
        linkedListNode21.setValue((java.lang.Object) ' ');
        linkedListNode17.setNextNode(linkedListNode21);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode2, linkedListNode21, (java.lang.Object) (short) 100);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode31.setNextNode(linkedListNode33);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode35 = null;
        linkedListNode33.setNextNode(linkedListNode35);
        linkedListNode29.setPreviousNode(linkedListNode33);
        boolean boolean38 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode29);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode40 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 1);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode44 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode42.setNextNode(linkedListNode44);
        linkedListNode44.setValue((java.lang.Object) (-1.0f));
        linkedListNode44.setValue((java.lang.Object) ' ');
        linkedListNode40.setNextNode(linkedListNode44);
        java.lang.Object obj51 = linkedListNode44.getValue();
        boolean boolean52 = nodeCachingLinkedList0.add(obj51);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode4.setNextNode(linkedListNode6);
        linkedListNode6.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode10 = linkedListNode6.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode14 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode12.setNextNode(linkedListNode14);
        java.lang.Object obj16 = null;
        linkedListNode14.setValue(obj16);
        linkedListNode10.setPreviousNode(linkedListNode14);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode22.setNextNode(linkedListNode24);
        linkedListNode24.setValue((java.lang.Object) (-1.0f));
        linkedListNode20.setPreviousNode(linkedListNode24);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode2, linkedListNode14, (java.lang.Object) linkedListNode20);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode30 = linkedListNode29.getNextNode();
        boolean boolean31 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode30);
        boolean boolean32 = nodeCachingLinkedList0.repOK();
        boolean boolean34 = nodeCachingLinkedList0.remove((java.lang.Object) 0);
        boolean boolean35 = nodeCachingLinkedList0.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode37 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 1);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode39 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode41 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode39.setNextNode(linkedListNode41);
        linkedListNode41.setValue((java.lang.Object) (-1.0f));
        linkedListNode41.setValue((java.lang.Object) ' ');
        linkedListNode37.setNextNode(linkedListNode41);
        java.lang.Object obj48 = linkedListNode41.getValue();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode50 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode52 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode54 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode52.setNextNode(linkedListNode54);
        linkedListNode54.setValue((java.lang.Object) (-1.0f));
        linkedListNode54.setValue((java.lang.Object) ' ');
        linkedListNode50.setNextNode(linkedListNode54);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode61 = linkedListNode50.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode62 = linkedListNode50.getNextNode();
        linkedListNode41.setNextNode(linkedListNode50);
        boolean boolean64 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode41);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode4.setNextNode(linkedListNode6);
        linkedListNode6.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode10 = linkedListNode6.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode14 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode12.setNextNode(linkedListNode14);
        java.lang.Object obj16 = null;
        linkedListNode14.setValue(obj16);
        linkedListNode10.setPreviousNode(linkedListNode14);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode22.setNextNode(linkedListNode24);
        linkedListNode24.setValue((java.lang.Object) (-1.0f));
        linkedListNode20.setPreviousNode(linkedListNode24);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode2, linkedListNode14, (java.lang.Object) linkedListNode20);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode30 = linkedListNode29.getNextNode();
        boolean boolean31 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode30);
        boolean boolean32 = nodeCachingLinkedList0.repOK();
        boolean boolean33 = nodeCachingLinkedList0.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode35 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode37 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode35.setNextNode(linkedListNode37);
        linkedListNode37.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode41 = linkedListNode37.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode41);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode43 = linkedListNode42.getPreviousNode();
        boolean boolean44 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode43);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode1 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode3.setNextNode(linkedListNode5);
        linkedListNode5.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode9 = linkedListNode5.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode11.setNextNode(linkedListNode13);
        java.lang.Object obj15 = null;
        linkedListNode13.setValue(obj15);
        linkedListNode9.setPreviousNode(linkedListNode13);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode21.setNextNode(linkedListNode23);
        linkedListNode23.setValue((java.lang.Object) (-1.0f));
        linkedListNode19.setPreviousNode(linkedListNode23);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode1, linkedListNode13, (java.lang.Object) linkedListNode19);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode30 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode32 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode30.setNextNode(linkedListNode32);
        linkedListNode32.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode36 = linkedListNode32.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode40 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode38.setNextNode(linkedListNode40);
        java.lang.Object obj42 = null;
        linkedListNode40.setValue(obj42);
        linkedListNode36.setPreviousNode(linkedListNode40);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode46 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode1, linkedListNode40, (java.lang.Object) (short) -1);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode48 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 100.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode50 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode52 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode54 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode52.setNextNode(linkedListNode54);
        linkedListNode54.setValue((java.lang.Object) (-1.0f));
        linkedListNode54.setValue((java.lang.Object) ' ');
        linkedListNode50.setNextNode(linkedListNode54);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode61 = linkedListNode50.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode63 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode65 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode67 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode69 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode67.setNextNode(linkedListNode69);
        linkedListNode69.setValue((java.lang.Object) (-1.0f));
        linkedListNode69.setValue((java.lang.Object) ' ');
        linkedListNode65.setNextNode(linkedListNode69);
        linkedListNode63.setPreviousNode(linkedListNode69);
        linkedListNode61.setPreviousNode(linkedListNode69);
        linkedListNode61.setValue((java.lang.Object) (short) 1);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode80 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode40, linkedListNode48, (java.lang.Object) (short) 1);
        boolean boolean81 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode48);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode83 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode84 = linkedListNode83.getNextNode();
        boolean boolean85 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode83);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode4.setNextNode(linkedListNode6);
        linkedListNode6.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode10 = linkedListNode6.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode14 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode12.setNextNode(linkedListNode14);
        java.lang.Object obj16 = null;
        linkedListNode14.setValue(obj16);
        linkedListNode10.setPreviousNode(linkedListNode14);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode22.setNextNode(linkedListNode24);
        linkedListNode24.setValue((java.lang.Object) (-1.0f));
        linkedListNode20.setPreviousNode(linkedListNode24);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode2, linkedListNode14, (java.lang.Object) linkedListNode20);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode30 = linkedListNode29.getNextNode();
        boolean boolean31 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode30);
        boolean boolean32 = nodeCachingLinkedList0.repOK();
        boolean boolean33 = nodeCachingLinkedList0.repOK();
        boolean boolean34 = nodeCachingLinkedList0.repOK();
        boolean boolean35 = nodeCachingLinkedList0.repOK();
        boolean boolean37 = nodeCachingLinkedList0.add((java.lang.Object) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode6.setNextNode(linkedListNode8);
        linkedListNode8.setValue((java.lang.Object) (-1.0f));
        linkedListNode8.setValue((java.lang.Object) ' ');
        linkedListNode4.setNextNode(linkedListNode8);
        linkedListNode2.setPreviousNode(linkedListNode8);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode19.setNextNode(linkedListNode21);
        linkedListNode21.setValue((java.lang.Object) (-1.0f));
        linkedListNode21.setValue((java.lang.Object) ' ');
        linkedListNode17.setNextNode(linkedListNode21);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode2, linkedListNode21, (java.lang.Object) (short) 100);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode31.setNextNode(linkedListNode33);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode35 = null;
        linkedListNode33.setNextNode(linkedListNode35);
        linkedListNode29.setPreviousNode(linkedListNode33);
        boolean boolean38 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode29);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode40 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode40.setNextNode(linkedListNode42);
        boolean boolean44 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode40);
        boolean boolean46 = nodeCachingLinkedList0.add((java.lang.Object) 0L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode1 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode5.setNextNode(linkedListNode7);
        linkedListNode7.setValue((java.lang.Object) (-1.0f));
        linkedListNode7.setValue((java.lang.Object) ' ');
        linkedListNode3.setNextNode(linkedListNode7);
        linkedListNode1.setPreviousNode(linkedListNode7);
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList15 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean16 = nodeCachingLinkedList15.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode19.setNextNode(linkedListNode21);
        linkedListNode21.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode25 = linkedListNode21.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode27 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode27.setNextNode(linkedListNode29);
        java.lang.Object obj31 = null;
        linkedListNode29.setValue(obj31);
        linkedListNode25.setPreviousNode(linkedListNode29);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode35 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode37 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode39 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode37.setNextNode(linkedListNode39);
        linkedListNode39.setValue((java.lang.Object) (-1.0f));
        linkedListNode35.setPreviousNode(linkedListNode39);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode44 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode17, linkedListNode29, (java.lang.Object) linkedListNode35);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode45 = linkedListNode44.getNextNode();
        boolean boolean46 = nodeCachingLinkedList15.remove((java.lang.Object) linkedListNode45);
        boolean boolean47 = nodeCachingLinkedList15.repOK();
        boolean boolean49 = nodeCachingLinkedList15.remove((java.lang.Object) 0);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode51 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode53 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode51.setNextNode(linkedListNode53);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode55 = linkedListNode53.getNextNode();
        boolean boolean56 = nodeCachingLinkedList15.remove((java.lang.Object) linkedListNode53);
        linkedListNode7.setValue((java.lang.Object) nodeCachingLinkedList15);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode59 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode61 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode63 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode65 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode67 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode65.setNextNode(linkedListNode67);
        linkedListNode67.setValue((java.lang.Object) (-1.0f));
        linkedListNode67.setValue((java.lang.Object) ' ');
        linkedListNode63.setNextNode(linkedListNode67);
        linkedListNode61.setPreviousNode(linkedListNode67);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode76 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode78 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode80 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode78.setNextNode(linkedListNode80);
        linkedListNode80.setValue((java.lang.Object) (-1.0f));
        linkedListNode80.setValue((java.lang.Object) ' ');
        linkedListNode76.setNextNode(linkedListNode80);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode88 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode61, linkedListNode80, (java.lang.Object) (short) 100);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode90 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode59, linkedListNode61, (java.lang.Object) 100);
        boolean boolean91 = nodeCachingLinkedList15.add((java.lang.Object) linkedListNode61);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList15", nodeCachingLinkedList15.repOK_2());
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.repOK();
        boolean boolean2 = nodeCachingLinkedList0.repOK();
        boolean boolean3 = nodeCachingLinkedList0.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 100.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) (short) 100);
        java.lang.Object obj8 = linkedListNode7.getValue();
        linkedListNode5.setNextNode(linkedListNode7);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode10 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode14 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode12.setNextNode(linkedListNode14);
        linkedListNode14.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode18 = linkedListNode14.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode20.setNextNode(linkedListNode22);
        java.lang.Object obj24 = null;
        linkedListNode22.setValue(obj24);
        linkedListNode18.setPreviousNode(linkedListNode22);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode30 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode32 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode30.setNextNode(linkedListNode32);
        linkedListNode32.setValue((java.lang.Object) (-1.0f));
        linkedListNode28.setPreviousNode(linkedListNode32);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode37 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode10, linkedListNode22, (java.lang.Object) linkedListNode28);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode38 = linkedListNode37.getNextNode();
        linkedListNode38.setValue((java.lang.Object) 100.0d);
        linkedListNode5.setPreviousNode(linkedListNode38);
        boolean boolean42 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode5);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode6.setNextNode(linkedListNode8);
        linkedListNode8.setValue((java.lang.Object) (-1.0f));
        linkedListNode8.setValue((java.lang.Object) ' ');
        linkedListNode4.setNextNode(linkedListNode8);
        linkedListNode2.setPreviousNode(linkedListNode8);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode19.setNextNode(linkedListNode21);
        linkedListNode21.setValue((java.lang.Object) (-1.0f));
        linkedListNode21.setValue((java.lang.Object) ' ');
        linkedListNode17.setNextNode(linkedListNode21);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode2, linkedListNode21, (java.lang.Object) (short) 100);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode31.setNextNode(linkedListNode33);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode35 = null;
        linkedListNode33.setNextNode(linkedListNode35);
        linkedListNode29.setPreviousNode(linkedListNode33);
        boolean boolean38 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode29);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode40 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode40.setNextNode(linkedListNode42);
        boolean boolean44 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode40);
        boolean boolean46 = nodeCachingLinkedList0.remove((java.lang.Object) (-1L));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode48 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode49 = linkedListNode48.getPreviousNode();
        java.lang.Object obj50 = linkedListNode48.getValue();
        boolean boolean51 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode48);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode6.setNextNode(linkedListNode8);
        linkedListNode8.setValue((java.lang.Object) (-1.0f));
        linkedListNode8.setValue((java.lang.Object) ' ');
        linkedListNode4.setNextNode(linkedListNode8);
        linkedListNode2.setPreviousNode(linkedListNode8);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode19.setNextNode(linkedListNode21);
        linkedListNode21.setValue((java.lang.Object) (-1.0f));
        linkedListNode21.setValue((java.lang.Object) ' ');
        linkedListNode17.setNextNode(linkedListNode21);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode2, linkedListNode21, (java.lang.Object) (short) 100);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode31.setNextNode(linkedListNode33);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode35 = null;
        linkedListNode33.setNextNode(linkedListNode35);
        linkedListNode29.setPreviousNode(linkedListNode33);
        boolean boolean38 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode29);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode40 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode40.setNextNode(linkedListNode42);
        boolean boolean44 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode40);
        boolean boolean45 = nodeCachingLinkedList0.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode47 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode49 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode47.setNextNode(linkedListNode49);
        java.lang.Object obj51 = null;
        linkedListNode49.setValue(obj51);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode53 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(obj51);
        boolean boolean54 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode53);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode1 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode5.setNextNode(linkedListNode7);
        linkedListNode7.setValue((java.lang.Object) (-1.0f));
        linkedListNode7.setValue((java.lang.Object) ' ');
        linkedListNode3.setNextNode(linkedListNode7);
        linkedListNode1.setPreviousNode(linkedListNode7);
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList15 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean16 = nodeCachingLinkedList15.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode19.setNextNode(linkedListNode21);
        linkedListNode21.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode25 = linkedListNode21.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode27 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode27.setNextNode(linkedListNode29);
        java.lang.Object obj31 = null;
        linkedListNode29.setValue(obj31);
        linkedListNode25.setPreviousNode(linkedListNode29);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode35 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode37 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode39 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode37.setNextNode(linkedListNode39);
        linkedListNode39.setValue((java.lang.Object) (-1.0f));
        linkedListNode35.setPreviousNode(linkedListNode39);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode44 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode17, linkedListNode29, (java.lang.Object) linkedListNode35);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode45 = linkedListNode44.getNextNode();
        boolean boolean46 = nodeCachingLinkedList15.remove((java.lang.Object) linkedListNode45);
        boolean boolean47 = nodeCachingLinkedList15.repOK();
        boolean boolean49 = nodeCachingLinkedList15.remove((java.lang.Object) 0);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode51 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode53 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode51.setNextNode(linkedListNode53);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode55 = linkedListNode53.getNextNode();
        boolean boolean56 = nodeCachingLinkedList15.remove((java.lang.Object) linkedListNode53);
        linkedListNode7.setValue((java.lang.Object) nodeCachingLinkedList15);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode59 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode61 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode59.setNextNode(linkedListNode61);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode63 = null;
        linkedListNode61.setNextNode(linkedListNode63);
        java.lang.Object obj65 = linkedListNode61.getValue();
        boolean boolean66 = nodeCachingLinkedList15.add(obj65);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList15", nodeCachingLinkedList15.repOK_2());
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode6.setNextNode(linkedListNode8);
        linkedListNode8.setValue((java.lang.Object) (-1.0f));
        linkedListNode8.setValue((java.lang.Object) ' ');
        linkedListNode4.setNextNode(linkedListNode8);
        linkedListNode2.setPreviousNode(linkedListNode8);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode19.setNextNode(linkedListNode21);
        linkedListNode21.setValue((java.lang.Object) (-1.0f));
        linkedListNode21.setValue((java.lang.Object) ' ');
        linkedListNode17.setNextNode(linkedListNode21);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode2, linkedListNode21, (java.lang.Object) (short) 100);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode31.setNextNode(linkedListNode33);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode35 = null;
        linkedListNode33.setNextNode(linkedListNode35);
        linkedListNode29.setPreviousNode(linkedListNode33);
        boolean boolean38 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode29);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode40 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode40.setNextNode(linkedListNode42);
        boolean boolean44 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode40);
        boolean boolean45 = nodeCachingLinkedList0.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode46 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode48 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode50 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode48.setNextNode(linkedListNode50);
        linkedListNode50.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode54 = linkedListNode50.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode56 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode58 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode56.setNextNode(linkedListNode58);
        java.lang.Object obj60 = null;
        linkedListNode58.setValue(obj60);
        linkedListNode54.setPreviousNode(linkedListNode58);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode64 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode66 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode68 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode66.setNextNode(linkedListNode68);
        linkedListNode68.setValue((java.lang.Object) (-1.0f));
        linkedListNode64.setPreviousNode(linkedListNode68);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode73 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode46, linkedListNode58, (java.lang.Object) linkedListNode64);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode75 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode77 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode75.setNextNode(linkedListNode77);
        linkedListNode77.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode81 = linkedListNode77.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode83 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode85 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode83.setNextNode(linkedListNode85);
        java.lang.Object obj87 = null;
        linkedListNode85.setValue(obj87);
        linkedListNode81.setPreviousNode(linkedListNode85);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode91 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode46, linkedListNode85, (java.lang.Object) (short) -1);
        boolean boolean92 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode46);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode6.setNextNode(linkedListNode8);
        linkedListNode8.setValue((java.lang.Object) (-1.0f));
        linkedListNode8.setValue((java.lang.Object) ' ');
        linkedListNode4.setNextNode(linkedListNode8);
        linkedListNode2.setPreviousNode(linkedListNode8);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode19.setNextNode(linkedListNode21);
        linkedListNode21.setValue((java.lang.Object) (-1.0f));
        linkedListNode21.setValue((java.lang.Object) ' ');
        linkedListNode17.setNextNode(linkedListNode21);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode2, linkedListNode21, (java.lang.Object) (short) 100);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode31.setNextNode(linkedListNode33);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode35 = null;
        linkedListNode33.setNextNode(linkedListNode35);
        linkedListNode29.setPreviousNode(linkedListNode33);
        boolean boolean38 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode29);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode40 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode40.setNextNode(linkedListNode42);
        boolean boolean44 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode40);
        boolean boolean46 = nodeCachingLinkedList0.remove((java.lang.Object) (-1L));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode48 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode50 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode48.setNextNode(linkedListNode50);
        linkedListNode50.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode54 = linkedListNode50.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode55 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode54);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode56 = linkedListNode55.getPreviousNode();
        boolean boolean57 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode55);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode59 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode61 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode59.setNextNode(linkedListNode61);
        linkedListNode61.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode66 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode68 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode70 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode68.setNextNode(linkedListNode70);
        linkedListNode70.setValue((java.lang.Object) (-1.0f));
        linkedListNode70.setValue((java.lang.Object) ' ');
        linkedListNode66.setNextNode(linkedListNode70);
        linkedListNode61.setNextNode(linkedListNode70);
        boolean boolean78 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode70);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode6.setNextNode(linkedListNode8);
        linkedListNode8.setValue((java.lang.Object) (-1.0f));
        linkedListNode8.setValue((java.lang.Object) ' ');
        linkedListNode4.setNextNode(linkedListNode8);
        linkedListNode2.setPreviousNode(linkedListNode8);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode19.setNextNode(linkedListNode21);
        linkedListNode21.setValue((java.lang.Object) (-1.0f));
        linkedListNode21.setValue((java.lang.Object) ' ');
        linkedListNode17.setNextNode(linkedListNode21);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode2, linkedListNode21, (java.lang.Object) (short) 100);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode31.setNextNode(linkedListNode33);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode35 = null;
        linkedListNode33.setNextNode(linkedListNode35);
        linkedListNode29.setPreviousNode(linkedListNode33);
        boolean boolean38 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode29);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode40 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode40.setNextNode(linkedListNode42);
        boolean boolean44 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode40);
        boolean boolean46 = nodeCachingLinkedList0.remove((java.lang.Object) (-1L));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode48 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode50 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode48.setNextNode(linkedListNode50);
        linkedListNode50.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode54 = linkedListNode50.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode55 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode54);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode56 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode55);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode57 = linkedListNode56.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode58 = linkedListNode57.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode60 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode62 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode60.setNextNode(linkedListNode62);
        java.lang.Object obj64 = null;
        linkedListNode62.setValue(obj64);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode66 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(obj64);
        linkedListNode57.setNextNode(linkedListNode66);
        boolean boolean68 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode57);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode4.setNextNode(linkedListNode6);
        linkedListNode6.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode10 = linkedListNode6.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode14 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode12.setNextNode(linkedListNode14);
        java.lang.Object obj16 = null;
        linkedListNode14.setValue(obj16);
        linkedListNode10.setPreviousNode(linkedListNode14);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode22.setNextNode(linkedListNode24);
        linkedListNode24.setValue((java.lang.Object) (-1.0f));
        linkedListNode20.setPreviousNode(linkedListNode24);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode2, linkedListNode14, (java.lang.Object) linkedListNode20);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode30 = linkedListNode29.getNextNode();
        boolean boolean31 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode30);
        boolean boolean32 = nodeCachingLinkedList0.repOK();
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList33 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean35 = nodeCachingLinkedList33.remove((java.lang.Object) 0);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) boolean35);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode37 = linkedListNode36.getPreviousNode();
        boolean boolean38 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode36);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode6.setNextNode(linkedListNode8);
        linkedListNode8.setValue((java.lang.Object) (-1.0f));
        linkedListNode8.setValue((java.lang.Object) ' ');
        linkedListNode4.setNextNode(linkedListNode8);
        linkedListNode2.setPreviousNode(linkedListNode8);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode19.setNextNode(linkedListNode21);
        linkedListNode21.setValue((java.lang.Object) (-1.0f));
        linkedListNode21.setValue((java.lang.Object) ' ');
        linkedListNode17.setNextNode(linkedListNode21);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode2, linkedListNode21, (java.lang.Object) (short) 100);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode31.setNextNode(linkedListNode33);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode35 = null;
        linkedListNode33.setNextNode(linkedListNode35);
        linkedListNode29.setPreviousNode(linkedListNode33);
        boolean boolean38 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode29);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode40 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode40.setNextNode(linkedListNode42);
        java.lang.Object obj44 = linkedListNode40.getValue();
        boolean boolean45 = nodeCachingLinkedList0.remove(obj44);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode47 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode49 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode47.setNextNode(linkedListNode49);
        linkedListNode49.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode53 = linkedListNode49.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode54 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode53);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode55 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode54);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode56 = linkedListNode55.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode58 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode60 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode62 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode60.setNextNode(linkedListNode62);
        linkedListNode62.setValue((java.lang.Object) (-1.0f));
        linkedListNode62.setValue((java.lang.Object) ' ');
        linkedListNode58.setNextNode(linkedListNode62);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode69 = linkedListNode58.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode70 = linkedListNode58.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode72 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) (short) 100);
        linkedListNode70.setPreviousNode(linkedListNode72);
        linkedListNode56.setPreviousNode(linkedListNode72);
        boolean boolean75 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode56);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) 1.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 1);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode6.setNextNode(linkedListNode8);
        linkedListNode8.setValue((java.lang.Object) (-1.0f));
        linkedListNode8.setValue((java.lang.Object) ' ');
        linkedListNode4.setNextNode(linkedListNode8);
        java.lang.Object obj15 = linkedListNode8.getValue();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode18.setNextNode(linkedListNode20);
        linkedListNode20.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode24 = linkedListNode20.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode26 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode26.setNextNode(linkedListNode28);
        java.lang.Object obj30 = null;
        linkedListNode28.setValue(obj30);
        linkedListNode24.setPreviousNode(linkedListNode28);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode34 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode36.setNextNode(linkedListNode38);
        linkedListNode38.setValue((java.lang.Object) (-1.0f));
        linkedListNode34.setPreviousNode(linkedListNode38);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode43 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode16, linkedListNode28, (java.lang.Object) linkedListNode34);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode45 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode47 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode45.setNextNode(linkedListNode47);
        linkedListNode47.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode51 = linkedListNode47.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode53 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode55 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode53.setNextNode(linkedListNode55);
        java.lang.Object obj57 = null;
        linkedListNode55.setValue(obj57);
        linkedListNode51.setPreviousNode(linkedListNode55);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode61 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode16, linkedListNode55, (java.lang.Object) (short) -1);
        linkedListNode8.setValue((java.lang.Object) linkedListNode16);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode63 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode8);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode65 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 1);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode67 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode69 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode67.setNextNode(linkedListNode69);
        linkedListNode69.setValue((java.lang.Object) (-1.0f));
        linkedListNode69.setValue((java.lang.Object) ' ');
        linkedListNode65.setNextNode(linkedListNode69);
        java.lang.Object obj76 = linkedListNode69.getValue();
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList77 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean79 = nodeCachingLinkedList77.remove((java.lang.Object) 0);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode80 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) boolean79);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode81 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode63, linkedListNode69, (java.lang.Object) boolean79);
        boolean boolean82 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode81);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode4.setNextNode(linkedListNode6);
        linkedListNode6.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode10 = linkedListNode6.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode14 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode12.setNextNode(linkedListNode14);
        java.lang.Object obj16 = null;
        linkedListNode14.setValue(obj16);
        linkedListNode10.setPreviousNode(linkedListNode14);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode22.setNextNode(linkedListNode24);
        linkedListNode24.setValue((java.lang.Object) (-1.0f));
        linkedListNode20.setPreviousNode(linkedListNode24);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode2, linkedListNode14, (java.lang.Object) linkedListNode20);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode30 = linkedListNode29.getNextNode();
        boolean boolean31 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode30);
        boolean boolean32 = nodeCachingLinkedList0.repOK();
        boolean boolean34 = nodeCachingLinkedList0.remove((java.lang.Object) 0);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode36.setNextNode(linkedListNode38);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode40 = linkedListNode38.getNextNode();
        boolean boolean41 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode38);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode43 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode45 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode47 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode45.setNextNode(linkedListNode47);
        linkedListNode47.setValue((java.lang.Object) (-1.0f));
        linkedListNode47.setValue((java.lang.Object) ' ');
        linkedListNode43.setNextNode(linkedListNode47);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode54 = linkedListNode43.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode55 = linkedListNode43.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode57 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) (short) 100);
        linkedListNode55.setPreviousNode(linkedListNode57);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode60 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode62 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode60.setNextNode(linkedListNode62);
        linkedListNode62.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode66 = linkedListNode62.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode67 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode66);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode68 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode67);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode70 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode57, linkedListNode68, (java.lang.Object) 0.0d);
        boolean boolean71 = nodeCachingLinkedList0.remove((java.lang.Object) 0.0d);
        boolean boolean72 = nodeCachingLinkedList0.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode74 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode76 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode78 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode76.setNextNode(linkedListNode78);
        linkedListNode78.setValue((java.lang.Object) (-1.0f));
        linkedListNode78.setValue((java.lang.Object) ' ');
        linkedListNode74.setNextNode(linkedListNode78);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode85 = linkedListNode74.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode86 = linkedListNode74.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode88 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) (short) 100);
        linkedListNode86.setPreviousNode(linkedListNode88);
        boolean boolean90 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode88);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode4.setNextNode(linkedListNode6);
        linkedListNode6.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode10 = linkedListNode6.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode14 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode12.setNextNode(linkedListNode14);
        java.lang.Object obj16 = null;
        linkedListNode14.setValue(obj16);
        linkedListNode10.setPreviousNode(linkedListNode14);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode22.setNextNode(linkedListNode24);
        linkedListNode24.setValue((java.lang.Object) (-1.0f));
        linkedListNode20.setPreviousNode(linkedListNode24);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode2, linkedListNode14, (java.lang.Object) linkedListNode20);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode30 = linkedListNode29.getNextNode();
        boolean boolean31 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode30);
        boolean boolean32 = nodeCachingLinkedList0.repOK();
        boolean boolean34 = nodeCachingLinkedList0.remove((java.lang.Object) 0);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode36.setNextNode(linkedListNode38);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode40 = linkedListNode38.getNextNode();
        boolean boolean41 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode38);
        boolean boolean42 = nodeCachingLinkedList0.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode44 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 100.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode46 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode48 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode46.setNextNode(linkedListNode48);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode51 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode53 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode51.setNextNode(linkedListNode53);
        java.lang.Object obj55 = null;
        linkedListNode53.setValue(obj55);
        linkedListNode46.setNextNode(linkedListNode53);
        linkedListNode44.setValue((java.lang.Object) linkedListNode46);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode59 = linkedListNode44.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode61 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) (short) 100);
        java.lang.Object obj62 = linkedListNode61.getValue();
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList63 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean64 = nodeCachingLinkedList63.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode65 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode67 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode69 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode67.setNextNode(linkedListNode69);
        linkedListNode69.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode73 = linkedListNode69.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode75 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode77 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode75.setNextNode(linkedListNode77);
        java.lang.Object obj79 = null;
        linkedListNode77.setValue(obj79);
        linkedListNode73.setPreviousNode(linkedListNode77);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode83 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode85 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode87 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode85.setNextNode(linkedListNode87);
        linkedListNode87.setValue((java.lang.Object) (-1.0f));
        linkedListNode83.setPreviousNode(linkedListNode87);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode92 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode65, linkedListNode77, (java.lang.Object) linkedListNode83);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode93 = linkedListNode92.getNextNode();
        boolean boolean94 = nodeCachingLinkedList63.remove((java.lang.Object) linkedListNode93);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode95 = linkedListNode93.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode96 = linkedListNode95.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode97 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode44, linkedListNode61, (java.lang.Object) linkedListNode95);
        boolean boolean98 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode61);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode6.setNextNode(linkedListNode8);
        linkedListNode8.setValue((java.lang.Object) (-1.0f));
        linkedListNode8.setValue((java.lang.Object) ' ');
        linkedListNode4.setNextNode(linkedListNode8);
        linkedListNode2.setPreviousNode(linkedListNode8);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode19.setNextNode(linkedListNode21);
        linkedListNode21.setValue((java.lang.Object) (-1.0f));
        linkedListNode21.setValue((java.lang.Object) ' ');
        linkedListNode17.setNextNode(linkedListNode21);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode2, linkedListNode21, (java.lang.Object) (short) 100);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode31.setNextNode(linkedListNode33);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode35 = null;
        linkedListNode33.setNextNode(linkedListNode35);
        linkedListNode29.setPreviousNode(linkedListNode33);
        boolean boolean38 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode29);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode40 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode40.setNextNode(linkedListNode42);
        boolean boolean44 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode40);
        boolean boolean45 = nodeCachingLinkedList0.repOK();
        boolean boolean46 = nodeCachingLinkedList0.repOK();
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList47 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean49 = nodeCachingLinkedList47.remove((java.lang.Object) 0);
        boolean boolean50 = nodeCachingLinkedList47.repOK();
        boolean boolean51 = nodeCachingLinkedList0.add((java.lang.Object) boolean50);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode1 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode5.setNextNode(linkedListNode7);
        linkedListNode7.setValue((java.lang.Object) (-1.0f));
        linkedListNode7.setValue((java.lang.Object) ' ');
        linkedListNode3.setNextNode(linkedListNode7);
        linkedListNode1.setPreviousNode(linkedListNode7);
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList15 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean16 = nodeCachingLinkedList15.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode19.setNextNode(linkedListNode21);
        linkedListNode21.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode25 = linkedListNode21.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode27 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode27.setNextNode(linkedListNode29);
        java.lang.Object obj31 = null;
        linkedListNode29.setValue(obj31);
        linkedListNode25.setPreviousNode(linkedListNode29);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode35 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode37 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode39 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode37.setNextNode(linkedListNode39);
        linkedListNode39.setValue((java.lang.Object) (-1.0f));
        linkedListNode35.setPreviousNode(linkedListNode39);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode44 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode17, linkedListNode29, (java.lang.Object) linkedListNode35);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode45 = linkedListNode44.getNextNode();
        boolean boolean46 = nodeCachingLinkedList15.remove((java.lang.Object) linkedListNode45);
        boolean boolean47 = nodeCachingLinkedList15.repOK();
        boolean boolean49 = nodeCachingLinkedList15.remove((java.lang.Object) 0);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode51 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode53 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode51.setNextNode(linkedListNode53);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode55 = linkedListNode53.getNextNode();
        boolean boolean56 = nodeCachingLinkedList15.remove((java.lang.Object) linkedListNode53);
        linkedListNode7.setValue((java.lang.Object) nodeCachingLinkedList15);
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList58 = new system.classfixer.classes.NodeCachingLinkedList();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode60 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode62 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode60.setNextNode(linkedListNode62);
        linkedListNode62.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode66 = linkedListNode62.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode68 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode70 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode68.setNextNode(linkedListNode70);
        java.lang.Object obj72 = null;
        linkedListNode70.setValue(obj72);
        linkedListNode66.setPreviousNode(linkedListNode70);
        boolean boolean75 = nodeCachingLinkedList58.remove((java.lang.Object) linkedListNode70);
        boolean boolean76 = nodeCachingLinkedList15.add((java.lang.Object) linkedListNode70);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList15", nodeCachingLinkedList15.repOK_2());
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode6.setNextNode(linkedListNode8);
        linkedListNode8.setValue((java.lang.Object) (-1.0f));
        linkedListNode8.setValue((java.lang.Object) ' ');
        linkedListNode4.setNextNode(linkedListNode8);
        linkedListNode2.setPreviousNode(linkedListNode8);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode19.setNextNode(linkedListNode21);
        linkedListNode21.setValue((java.lang.Object) (-1.0f));
        linkedListNode21.setValue((java.lang.Object) ' ');
        linkedListNode17.setNextNode(linkedListNode21);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode2, linkedListNode21, (java.lang.Object) (short) 100);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode31.setNextNode(linkedListNode33);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode35 = null;
        linkedListNode33.setNextNode(linkedListNode35);
        linkedListNode29.setPreviousNode(linkedListNode33);
        boolean boolean38 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode29);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode40 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode40.setNextNode(linkedListNode42);
        java.lang.Object obj44 = linkedListNode40.getValue();
        boolean boolean45 = nodeCachingLinkedList0.remove(obj44);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode47 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode49 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode51 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode53 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode55 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode57 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode55.setNextNode(linkedListNode57);
        linkedListNode57.setValue((java.lang.Object) (-1.0f));
        linkedListNode57.setValue((java.lang.Object) ' ');
        linkedListNode53.setNextNode(linkedListNode57);
        linkedListNode51.setPreviousNode(linkedListNode57);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode66 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode68 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode70 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode68.setNextNode(linkedListNode70);
        linkedListNode70.setValue((java.lang.Object) (-1.0f));
        linkedListNode70.setValue((java.lang.Object) ' ');
        linkedListNode66.setNextNode(linkedListNode70);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode78 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode51, linkedListNode70, (java.lang.Object) (short) 100);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode80 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode49, linkedListNode51, (java.lang.Object) 100);
        linkedListNode47.setNextNode(linkedListNode80);
        boolean boolean82 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode47);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode6.setNextNode(linkedListNode8);
        linkedListNode8.setValue((java.lang.Object) (-1.0f));
        linkedListNode8.setValue((java.lang.Object) ' ');
        linkedListNode4.setNextNode(linkedListNode8);
        linkedListNode2.setPreviousNode(linkedListNode8);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode19.setNextNode(linkedListNode21);
        linkedListNode21.setValue((java.lang.Object) (-1.0f));
        linkedListNode21.setValue((java.lang.Object) ' ');
        linkedListNode17.setNextNode(linkedListNode21);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode2, linkedListNode21, (java.lang.Object) (short) 100);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode31.setNextNode(linkedListNode33);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode35 = null;
        linkedListNode33.setNextNode(linkedListNode35);
        linkedListNode29.setPreviousNode(linkedListNode33);
        boolean boolean38 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode29);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode40 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode40.setNextNode(linkedListNode42);
        boolean boolean44 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode40);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode46 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode48 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode46.setNextNode(linkedListNode48);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode51 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode53 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode51.setNextNode(linkedListNode53);
        java.lang.Object obj55 = null;
        linkedListNode53.setValue(obj55);
        linkedListNode46.setNextNode(linkedListNode53);
        boolean boolean58 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode53);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode60 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode62 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode60.setNextNode(linkedListNode62);
        java.lang.Object obj64 = null;
        linkedListNode62.setValue(obj64);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode67 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode69 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode67.setNextNode(linkedListNode69);
        linkedListNode69.setValue((java.lang.Object) (-1.0f));
        linkedListNode69.setValue((java.lang.Object) ' ');
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode75 = linkedListNode69.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode77 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 100.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode79 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode81 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode79.setNextNode(linkedListNode81);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode84 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode86 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode84.setNextNode(linkedListNode86);
        java.lang.Object obj88 = null;
        linkedListNode86.setValue(obj88);
        linkedListNode79.setNextNode(linkedListNode86);
        linkedListNode77.setValue((java.lang.Object) linkedListNode79);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode92 = linkedListNode77.getNextNode();
        linkedListNode69.setValue((java.lang.Object) linkedListNode92);
        linkedListNode62.setPreviousNode(linkedListNode69);
        boolean boolean95 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode69);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode6.setNextNode(linkedListNode8);
        linkedListNode8.setValue((java.lang.Object) (-1.0f));
        linkedListNode8.setValue((java.lang.Object) ' ');
        linkedListNode4.setNextNode(linkedListNode8);
        linkedListNode2.setPreviousNode(linkedListNode8);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode19.setNextNode(linkedListNode21);
        linkedListNode21.setValue((java.lang.Object) (-1.0f));
        linkedListNode21.setValue((java.lang.Object) ' ');
        linkedListNode17.setNextNode(linkedListNode21);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode2, linkedListNode21, (java.lang.Object) (short) 100);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode31.setNextNode(linkedListNode33);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode35 = null;
        linkedListNode33.setNextNode(linkedListNode35);
        linkedListNode29.setPreviousNode(linkedListNode33);
        boolean boolean38 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode29);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode40 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode40.setNextNode(linkedListNode42);
        boolean boolean44 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode40);
        boolean boolean46 = nodeCachingLinkedList0.remove((java.lang.Object) (-1L));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode48 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode50 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode48.setNextNode(linkedListNode50);
        linkedListNode50.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode54 = linkedListNode50.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode55 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode54);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode56 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode55);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode57 = linkedListNode56.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode58 = linkedListNode57.getNextNode();
        java.lang.Object obj59 = null;
        linkedListNode57.setValue(obj59);
        boolean boolean61 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode57);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode6.setNextNode(linkedListNode8);
        linkedListNode8.setValue((java.lang.Object) (-1.0f));
        linkedListNode8.setValue((java.lang.Object) ' ');
        linkedListNode4.setNextNode(linkedListNode8);
        linkedListNode2.setPreviousNode(linkedListNode8);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode19.setNextNode(linkedListNode21);
        linkedListNode21.setValue((java.lang.Object) (-1.0f));
        linkedListNode21.setValue((java.lang.Object) ' ');
        linkedListNode17.setNextNode(linkedListNode21);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode2, linkedListNode21, (java.lang.Object) (short) 100);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode31.setNextNode(linkedListNode33);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode35 = null;
        linkedListNode33.setNextNode(linkedListNode35);
        linkedListNode29.setPreviousNode(linkedListNode33);
        boolean boolean38 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode29);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode40 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode40.setNextNode(linkedListNode42);
        boolean boolean44 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode40);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode45 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) nodeCachingLinkedList0);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode47 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode49 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode47.setNextNode(linkedListNode49);
        linkedListNode49.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode53 = linkedListNode49.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode54 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode53);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode55 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode54);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode56 = linkedListNode55.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode57 = linkedListNode56.getNextNode();
        boolean boolean58 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode56);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.repOK();
        boolean boolean2 = nodeCachingLinkedList0.repOK();
        boolean boolean3 = nodeCachingLinkedList0.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode7.setNextNode(linkedListNode9);
        linkedListNode9.setValue((java.lang.Object) (-1.0f));
        linkedListNode9.setValue((java.lang.Object) ' ');
        linkedListNode5.setNextNode(linkedListNode9);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode16 = linkedListNode5.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode17 = linkedListNode5.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) (short) 100);
        linkedListNode17.setPreviousNode(linkedListNode19);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 1);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode26 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode24.setNextNode(linkedListNode26);
        linkedListNode26.setValue((java.lang.Object) (-1.0f));
        linkedListNode26.setValue((java.lang.Object) ' ');
        linkedListNode22.setNextNode(linkedListNode26);
        linkedListNode17.setPreviousNode(linkedListNode26);
        boolean boolean34 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode17);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode4.setNextNode(linkedListNode6);
        linkedListNode6.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode10 = linkedListNode6.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode14 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode12.setNextNode(linkedListNode14);
        java.lang.Object obj16 = null;
        linkedListNode14.setValue(obj16);
        linkedListNode10.setPreviousNode(linkedListNode14);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode22.setNextNode(linkedListNode24);
        linkedListNode24.setValue((java.lang.Object) (-1.0f));
        linkedListNode20.setPreviousNode(linkedListNode24);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode2, linkedListNode14, (java.lang.Object) linkedListNode20);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode30 = linkedListNode29.getNextNode();
        boolean boolean31 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode30);
        boolean boolean32 = nodeCachingLinkedList0.repOK();
        boolean boolean34 = nodeCachingLinkedList0.remove((java.lang.Object) 0);
        boolean boolean35 = nodeCachingLinkedList0.repOK();
        boolean boolean36 = nodeCachingLinkedList0.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode39 = linkedListNode38.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode40 = linkedListNode38.getPreviousNode();
        boolean boolean41 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode38);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) 0);
        boolean boolean3 = nodeCachingLinkedList0.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) (short) 100);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode6 = linkedListNode5.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) (short) 100);
        java.lang.Object obj9 = linkedListNode8.getValue();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode10 = linkedListNode8.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 1);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode14 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode14.setNextNode(linkedListNode16);
        linkedListNode16.setValue((java.lang.Object) (-1.0f));
        linkedListNode16.setValue((java.lang.Object) ' ');
        linkedListNode12.setNextNode(linkedListNode16);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode26 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode26.setNextNode(linkedListNode28);
        linkedListNode28.setValue((java.lang.Object) (-1.0f));
        linkedListNode28.setValue((java.lang.Object) ' ');
        linkedListNode24.setNextNode(linkedListNode28);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode36.setNextNode(linkedListNode38);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode40 = linkedListNode38.getNextNode();
        linkedListNode28.setNextNode(linkedListNode38);
        linkedListNode12.setValue((java.lang.Object) linkedListNode28);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode43 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode();
        linkedListNode28.setNextNode(linkedListNode43);
        linkedListNode10.setNextNode(linkedListNode28);
        linkedListNode6.setNextNode(linkedListNode28);
        boolean boolean47 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode6);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode49 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode51 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode53 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode51.setNextNode(linkedListNode53);
        linkedListNode53.setValue((java.lang.Object) (-1.0f));
        linkedListNode53.setValue((java.lang.Object) ' ');
        linkedListNode49.setNextNode(linkedListNode53);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode60 = linkedListNode49.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode61 = linkedListNode49.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode63 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) (short) 100);
        linkedListNode61.setPreviousNode(linkedListNode63);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode66 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 1);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode68 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode70 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode68.setNextNode(linkedListNode70);
        linkedListNode70.setValue((java.lang.Object) (-1.0f));
        linkedListNode70.setValue((java.lang.Object) ' ');
        linkedListNode66.setNextNode(linkedListNode70);
        linkedListNode61.setPreviousNode(linkedListNode70);
        boolean boolean78 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode61);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) 0);
        boolean boolean3 = nodeCachingLinkedList0.repOK();
        boolean boolean4 = nodeCachingLinkedList0.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode6.setNextNode(linkedListNode8);
        linkedListNode8.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode12 = linkedListNode8.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode14 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode14.setNextNode(linkedListNode16);
        java.lang.Object obj18 = null;
        linkedListNode16.setValue(obj18);
        linkedListNode12.setPreviousNode(linkedListNode16);
        java.lang.Object obj21 = linkedListNode16.getValue();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode27 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode27.setNextNode(linkedListNode29);
        linkedListNode29.setValue((java.lang.Object) (-1.0f));
        linkedListNode29.setValue((java.lang.Object) ' ');
        linkedListNode25.setNextNode(linkedListNode29);
        linkedListNode23.setPreviousNode(linkedListNode29);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode37 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode23);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode38 = linkedListNode23.getNextNode();
        linkedListNode16.setNextNode(linkedListNode23);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode40 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode23);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode41 = linkedListNode23.getPreviousNode();
        boolean boolean42 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode23);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) 0);
        boolean boolean3 = nodeCachingLinkedList0.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode5.setNextNode(linkedListNode7);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode9 = null;
        linkedListNode7.setNextNode(linkedListNode9);
        java.lang.Class<?> wildcardClass11 = linkedListNode7.getClass();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode7);
        boolean boolean13 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode12);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) 0);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode4.setNextNode(linkedListNode6);
        linkedListNode6.setValue((java.lang.Object) (-1.0f));
        boolean boolean10 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode6);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.repOK();
        boolean boolean2 = nodeCachingLinkedList0.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode6.setNextNode(linkedListNode8);
        linkedListNode8.setValue((java.lang.Object) (-1.0f));
        linkedListNode8.setValue((java.lang.Object) ' ');
        linkedListNode4.setNextNode(linkedListNode8);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode15 = linkedListNode4.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode16 = linkedListNode4.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) (short) 100);
        linkedListNode16.setPreviousNode(linkedListNode18);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode21.setNextNode(linkedListNode23);
        linkedListNode23.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode27 = linkedListNode23.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode27);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode28);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode18, linkedListNode29, (java.lang.Object) 0.0d);
        java.lang.Object obj32 = linkedListNode18.getValue();
        boolean boolean33 = nodeCachingLinkedList0.remove(obj32);
        boolean boolean34 = nodeCachingLinkedList0.repOK();
        boolean boolean35 = nodeCachingLinkedList0.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode37 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode39 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode41 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode43 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode45 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode43.setNextNode(linkedListNode45);
        linkedListNode45.setValue((java.lang.Object) (-1.0f));
        linkedListNode45.setValue((java.lang.Object) ' ');
        linkedListNode41.setNextNode(linkedListNode45);
        linkedListNode39.setPreviousNode(linkedListNode45);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode54 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode56 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode58 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode56.setNextNode(linkedListNode58);
        linkedListNode58.setValue((java.lang.Object) (-1.0f));
        linkedListNode58.setValue((java.lang.Object) ' ');
        linkedListNode54.setNextNode(linkedListNode58);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode66 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode39, linkedListNode58, (java.lang.Object) (short) 100);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode68 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode37, linkedListNode39, (java.lang.Object) 100);
        java.lang.Object obj69 = linkedListNode68.getValue();
        boolean boolean70 = nodeCachingLinkedList0.add(obj69);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode4.setNextNode(linkedListNode6);
        linkedListNode6.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode10 = linkedListNode6.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode14 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode12.setNextNode(linkedListNode14);
        java.lang.Object obj16 = null;
        linkedListNode14.setValue(obj16);
        linkedListNode10.setPreviousNode(linkedListNode14);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode22.setNextNode(linkedListNode24);
        linkedListNode24.setValue((java.lang.Object) (-1.0f));
        linkedListNode20.setPreviousNode(linkedListNode24);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode2, linkedListNode14, (java.lang.Object) linkedListNode20);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode30 = linkedListNode29.getNextNode();
        boolean boolean31 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode30);
        boolean boolean32 = nodeCachingLinkedList0.repOK();
        boolean boolean34 = nodeCachingLinkedList0.remove((java.lang.Object) 0);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode36.setNextNode(linkedListNode38);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode40 = linkedListNode38.getNextNode();
        boolean boolean41 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode38);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode43 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode45 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode47 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode45.setNextNode(linkedListNode47);
        linkedListNode47.setValue((java.lang.Object) (-1.0f));
        linkedListNode47.setValue((java.lang.Object) ' ');
        linkedListNode43.setNextNode(linkedListNode47);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode54 = linkedListNode43.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode55 = linkedListNode43.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode57 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) (short) 100);
        linkedListNode55.setPreviousNode(linkedListNode57);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode60 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode62 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode60.setNextNode(linkedListNode62);
        linkedListNode62.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode66 = linkedListNode62.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode67 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode66);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode68 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode67);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode70 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode57, linkedListNode68, (java.lang.Object) 0.0d);
        boolean boolean71 = nodeCachingLinkedList0.remove((java.lang.Object) 0.0d);
        boolean boolean72 = nodeCachingLinkedList0.repOK();
        boolean boolean73 = nodeCachingLinkedList0.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode75 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode77 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode75.setNextNode(linkedListNode77);
        boolean boolean79 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode75);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode6.setNextNode(linkedListNode8);
        linkedListNode8.setValue((java.lang.Object) (-1.0f));
        linkedListNode8.setValue((java.lang.Object) ' ');
        linkedListNode4.setNextNode(linkedListNode8);
        linkedListNode2.setPreviousNode(linkedListNode8);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode19.setNextNode(linkedListNode21);
        linkedListNode21.setValue((java.lang.Object) (-1.0f));
        linkedListNode21.setValue((java.lang.Object) ' ');
        linkedListNode17.setNextNode(linkedListNode21);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode2, linkedListNode21, (java.lang.Object) (short) 100);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode31.setNextNode(linkedListNode33);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode35 = null;
        linkedListNode33.setNextNode(linkedListNode35);
        linkedListNode29.setPreviousNode(linkedListNode33);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode38 = linkedListNode29.getPreviousNode();
        boolean boolean39 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode38);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode41 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode43 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode45 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode43.setNextNode(linkedListNode45);
        linkedListNode45.setValue((java.lang.Object) (-1.0f));
        linkedListNode45.setValue((java.lang.Object) ' ');
        linkedListNode41.setNextNode(linkedListNode45);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode52 = linkedListNode41.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode53 = linkedListNode41.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode55 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) (short) 100);
        linkedListNode53.setPreviousNode(linkedListNode55);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode57 = linkedListNode55.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode58 = linkedListNode57.getPreviousNode();
        boolean boolean59 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode58);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode61 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode63 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode65 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode63.setNextNode(linkedListNode65);
        linkedListNode65.setValue((java.lang.Object) (-1.0f));
        linkedListNode65.setValue((java.lang.Object) ' ');
        linkedListNode61.setNextNode(linkedListNode65);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode72 = linkedListNode61.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode73 = linkedListNode61.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode75 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) (short) 100);
        linkedListNode73.setPreviousNode(linkedListNode75);
        boolean boolean77 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode73);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.repOK();
        boolean boolean2 = nodeCachingLinkedList0.repOK();
        boolean boolean3 = nodeCachingLinkedList0.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 100.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode7.setNextNode(linkedListNode9);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode14 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode12.setNextNode(linkedListNode14);
        java.lang.Object obj16 = null;
        linkedListNode14.setValue(obj16);
        linkedListNode7.setNextNode(linkedListNode14);
        linkedListNode5.setValue((java.lang.Object) linkedListNode7);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode20 = linkedListNode5.getNextNode();
        java.lang.Object obj21 = linkedListNode5.getValue();
        boolean boolean22 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode5);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode6.setNextNode(linkedListNode8);
        linkedListNode8.setValue((java.lang.Object) (-1.0f));
        linkedListNode8.setValue((java.lang.Object) ' ');
        linkedListNode4.setNextNode(linkedListNode8);
        linkedListNode2.setPreviousNode(linkedListNode8);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode19.setNextNode(linkedListNode21);
        linkedListNode21.setValue((java.lang.Object) (-1.0f));
        linkedListNode21.setValue((java.lang.Object) ' ');
        linkedListNode17.setNextNode(linkedListNode21);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode2, linkedListNode21, (java.lang.Object) (short) 100);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode31.setNextNode(linkedListNode33);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode35 = null;
        linkedListNode33.setNextNode(linkedListNode35);
        linkedListNode29.setPreviousNode(linkedListNode33);
        boolean boolean38 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode29);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode40 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode40.setNextNode(linkedListNode42);
        boolean boolean44 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode40);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode46 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode48 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode46.setNextNode(linkedListNode48);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode51 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode53 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode51.setNextNode(linkedListNode53);
        java.lang.Object obj55 = null;
        linkedListNode53.setValue(obj55);
        linkedListNode46.setNextNode(linkedListNode53);
        boolean boolean58 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode53);
        boolean boolean59 = nodeCachingLinkedList0.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode60 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode62 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode64 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode62.setNextNode(linkedListNode64);
        linkedListNode64.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode68 = linkedListNode64.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode70 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode72 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode70.setNextNode(linkedListNode72);
        java.lang.Object obj74 = null;
        linkedListNode72.setValue(obj74);
        linkedListNode68.setPreviousNode(linkedListNode72);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode78 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode80 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode82 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode80.setNextNode(linkedListNode82);
        linkedListNode82.setValue((java.lang.Object) (-1.0f));
        linkedListNode78.setPreviousNode(linkedListNode82);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode87 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode60, linkedListNode72, (java.lang.Object) linkedListNode78);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode88 = linkedListNode87.getNextNode();
        linkedListNode87.setValue((java.lang.Object) (short) 0);
        java.lang.Class<?> wildcardClass91 = linkedListNode87.getClass();
        boolean boolean92 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode87);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode6.setNextNode(linkedListNode8);
        linkedListNode8.setValue((java.lang.Object) (-1.0f));
        linkedListNode8.setValue((java.lang.Object) ' ');
        linkedListNode4.setNextNode(linkedListNode8);
        linkedListNode2.setPreviousNode(linkedListNode8);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode19.setNextNode(linkedListNode21);
        linkedListNode21.setValue((java.lang.Object) (-1.0f));
        linkedListNode21.setValue((java.lang.Object) ' ');
        linkedListNode17.setNextNode(linkedListNode21);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode2, linkedListNode21, (java.lang.Object) (short) 100);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode31.setNextNode(linkedListNode33);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode35 = null;
        linkedListNode33.setNextNode(linkedListNode35);
        linkedListNode29.setPreviousNode(linkedListNode33);
        boolean boolean38 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode29);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode40 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode40.setNextNode(linkedListNode42);
        boolean boolean44 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode40);
        boolean boolean45 = nodeCachingLinkedList0.repOK();
        boolean boolean46 = nodeCachingLinkedList0.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode47 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode49 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode51 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode49.setNextNode(linkedListNode51);
        linkedListNode51.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode55 = linkedListNode51.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode57 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode59 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode57.setNextNode(linkedListNode59);
        java.lang.Object obj61 = null;
        linkedListNode59.setValue(obj61);
        linkedListNode55.setPreviousNode(linkedListNode59);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode65 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode67 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode69 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode67.setNextNode(linkedListNode69);
        linkedListNode69.setValue((java.lang.Object) (-1.0f));
        linkedListNode65.setPreviousNode(linkedListNode69);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode74 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode47, linkedListNode59, (java.lang.Object) linkedListNode65);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode76 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode78 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode76.setNextNode(linkedListNode78);
        linkedListNode78.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode82 = linkedListNode78.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode84 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode86 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode84.setNextNode(linkedListNode86);
        java.lang.Object obj88 = null;
        linkedListNode86.setValue(obj88);
        linkedListNode82.setPreviousNode(linkedListNode86);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode92 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode47, linkedListNode86, (java.lang.Object) (short) -1);
        boolean boolean93 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode86);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode2.setNextNode(linkedListNode4);
        linkedListNode4.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode8 = linkedListNode4.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode10 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode10.setNextNode(linkedListNode12);
        java.lang.Object obj14 = null;
        linkedListNode12.setValue(obj14);
        linkedListNode8.setPreviousNode(linkedListNode12);
        boolean boolean17 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode12);
        boolean boolean19 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 10);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode27 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode25.setNextNode(linkedListNode27);
        linkedListNode27.setValue((java.lang.Object) (-1.0f));
        linkedListNode27.setValue((java.lang.Object) ' ');
        linkedListNode23.setNextNode(linkedListNode27);
        linkedListNode21.setPreviousNode(linkedListNode27);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode40 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode38.setNextNode(linkedListNode40);
        linkedListNode40.setValue((java.lang.Object) (-1.0f));
        linkedListNode40.setValue((java.lang.Object) ' ');
        linkedListNode36.setNextNode(linkedListNode40);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode48 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode21, linkedListNode40, (java.lang.Object) (short) 100);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode50 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode52 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode50.setNextNode(linkedListNode52);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode54 = null;
        linkedListNode52.setNextNode(linkedListNode54);
        linkedListNode48.setPreviousNode(linkedListNode52);
        boolean boolean57 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode52);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode59 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode61 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode63 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode65 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode63.setNextNode(linkedListNode65);
        linkedListNode65.setValue((java.lang.Object) (-1.0f));
        linkedListNode65.setValue((java.lang.Object) ' ');
        linkedListNode61.setNextNode(linkedListNode65);
        linkedListNode59.setPreviousNode(linkedListNode65);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode73 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode59);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode74 = linkedListNode59.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode76 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode78 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode80 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode78.setNextNode(linkedListNode80);
        linkedListNode80.setValue((java.lang.Object) (-1.0f));
        linkedListNode76.setPreviousNode(linkedListNode80);
        linkedListNode59.setNextNode(linkedListNode76);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode87 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 100.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode89 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) (short) 100);
        java.lang.Object obj90 = linkedListNode89.getValue();
        linkedListNode87.setNextNode(linkedListNode89);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode92 = linkedListNode89.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode93 = linkedListNode92.getPreviousNode();
        linkedListNode76.setValue((java.lang.Object) linkedListNode93);
        boolean boolean95 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode76);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.repOK();
        boolean boolean2 = nodeCachingLinkedList0.repOK();
        boolean boolean3 = nodeCachingLinkedList0.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 1);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode7.setNextNode(linkedListNode9);
        linkedListNode9.setValue((java.lang.Object) (-1.0f));
        linkedListNode9.setValue((java.lang.Object) ' ');
        linkedListNode5.setNextNode(linkedListNode9);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode19.setNextNode(linkedListNode21);
        linkedListNode21.setValue((java.lang.Object) (-1.0f));
        linkedListNode21.setValue((java.lang.Object) ' ');
        linkedListNode17.setNextNode(linkedListNode21);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode29.setNextNode(linkedListNode31);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode33 = linkedListNode31.getNextNode();
        linkedListNode21.setNextNode(linkedListNode31);
        linkedListNode5.setValue((java.lang.Object) linkedListNode21);
        java.lang.Object obj36 = linkedListNode5.getValue();
        boolean boolean37 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode5);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.repOK();
        boolean boolean2 = nodeCachingLinkedList0.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode6.setNextNode(linkedListNode8);
        linkedListNode8.setValue((java.lang.Object) (-1.0f));
        linkedListNode8.setValue((java.lang.Object) ' ');
        linkedListNode4.setNextNode(linkedListNode8);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode15 = linkedListNode4.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode16 = linkedListNode4.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) (short) 100);
        linkedListNode16.setPreviousNode(linkedListNode18);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode21.setNextNode(linkedListNode23);
        linkedListNode23.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode27 = linkedListNode23.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode27);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode28);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode18, linkedListNode29, (java.lang.Object) 0.0d);
        java.lang.Object obj32 = linkedListNode18.getValue();
        boolean boolean33 = nodeCachingLinkedList0.remove(obj32);
        boolean boolean34 = nodeCachingLinkedList0.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode36.setNextNode(linkedListNode38);
        java.lang.Object obj40 = null;
        linkedListNode38.setValue(obj40);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode43 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode45 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode43.setNextNode(linkedListNode45);
        linkedListNode45.setValue((java.lang.Object) (-1.0f));
        linkedListNode45.setValue((java.lang.Object) ' ');
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode51 = linkedListNode45.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode53 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 100.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode55 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode57 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode55.setNextNode(linkedListNode57);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode60 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode62 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode60.setNextNode(linkedListNode62);
        java.lang.Object obj64 = null;
        linkedListNode62.setValue(obj64);
        linkedListNode55.setNextNode(linkedListNode62);
        linkedListNode53.setValue((java.lang.Object) linkedListNode55);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode68 = linkedListNode53.getNextNode();
        linkedListNode45.setValue((java.lang.Object) linkedListNode68);
        linkedListNode38.setPreviousNode(linkedListNode45);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode72 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) (short) 100);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode74 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 100.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode76 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode78 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode76.setNextNode(linkedListNode78);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode81 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode83 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode81.setNextNode(linkedListNode83);
        java.lang.Object obj85 = null;
        linkedListNode83.setValue(obj85);
        linkedListNode76.setNextNode(linkedListNode83);
        linkedListNode74.setValue((java.lang.Object) linkedListNode76);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode89 = linkedListNode74.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode91 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode72, linkedListNode89, (java.lang.Object) 10);
        linkedListNode38.setNextNode(linkedListNode89);
        java.lang.Object obj93 = linkedListNode38.getValue();
        boolean boolean94 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode38);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode4.setNextNode(linkedListNode6);
        linkedListNode6.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode10 = linkedListNode6.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode14 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode12.setNextNode(linkedListNode14);
        java.lang.Object obj16 = null;
        linkedListNode14.setValue(obj16);
        linkedListNode10.setPreviousNode(linkedListNode14);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode22.setNextNode(linkedListNode24);
        linkedListNode24.setValue((java.lang.Object) (-1.0f));
        linkedListNode20.setPreviousNode(linkedListNode24);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode2, linkedListNode14, (java.lang.Object) linkedListNode20);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode30 = linkedListNode29.getNextNode();
        boolean boolean31 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode30);
        boolean boolean32 = nodeCachingLinkedList0.repOK();
        boolean boolean34 = nodeCachingLinkedList0.remove((java.lang.Object) 0);
        boolean boolean35 = nodeCachingLinkedList0.repOK();
        boolean boolean36 = nodeCachingLinkedList0.repOK();
        boolean boolean38 = nodeCachingLinkedList0.remove((java.lang.Object) (short) 10);
        boolean boolean39 = nodeCachingLinkedList0.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode41 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode43 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode41.setNextNode(linkedListNode43);
        linkedListNode43.setValue((java.lang.Object) (-1.0f));
        linkedListNode43.setValue((java.lang.Object) ' ');
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode49 = linkedListNode43.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode51 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 100.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode53 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode55 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode53.setNextNode(linkedListNode55);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode58 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode60 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode58.setNextNode(linkedListNode60);
        java.lang.Object obj62 = null;
        linkedListNode60.setValue(obj62);
        linkedListNode53.setNextNode(linkedListNode60);
        linkedListNode51.setValue((java.lang.Object) linkedListNode53);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode66 = linkedListNode53.getNextNode();
        linkedListNode49.setValue((java.lang.Object) linkedListNode66);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode68 = linkedListNode49.getPreviousNode();
        boolean boolean69 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode49);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode1 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode5.setNextNode(linkedListNode7);
        linkedListNode7.setValue((java.lang.Object) (-1.0f));
        linkedListNode7.setValue((java.lang.Object) ' ');
        linkedListNode3.setNextNode(linkedListNode7);
        linkedListNode1.setPreviousNode(linkedListNode7);
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList15 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean16 = nodeCachingLinkedList15.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode19.setNextNode(linkedListNode21);
        linkedListNode21.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode25 = linkedListNode21.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode27 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode27.setNextNode(linkedListNode29);
        java.lang.Object obj31 = null;
        linkedListNode29.setValue(obj31);
        linkedListNode25.setPreviousNode(linkedListNode29);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode35 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode37 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode39 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode37.setNextNode(linkedListNode39);
        linkedListNode39.setValue((java.lang.Object) (-1.0f));
        linkedListNode35.setPreviousNode(linkedListNode39);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode44 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode17, linkedListNode29, (java.lang.Object) linkedListNode35);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode45 = linkedListNode44.getNextNode();
        boolean boolean46 = nodeCachingLinkedList15.remove((java.lang.Object) linkedListNode45);
        boolean boolean47 = nodeCachingLinkedList15.repOK();
        boolean boolean49 = nodeCachingLinkedList15.remove((java.lang.Object) 0);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode51 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode53 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode51.setNextNode(linkedListNode53);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode55 = linkedListNode53.getNextNode();
        boolean boolean56 = nodeCachingLinkedList15.remove((java.lang.Object) linkedListNode53);
        linkedListNode7.setValue((java.lang.Object) nodeCachingLinkedList15);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode59 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode61 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode59.setNextNode(linkedListNode61);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode63 = null;
        linkedListNode61.setNextNode(linkedListNode63);
        java.lang.Class<?> wildcardClass65 = linkedListNode61.getClass();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode66 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode61);
        boolean boolean67 = nodeCachingLinkedList15.add((java.lang.Object) linkedListNode61);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList15", nodeCachingLinkedList15.repOK_2());
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode6.setNextNode(linkedListNode8);
        linkedListNode8.setValue((java.lang.Object) (-1.0f));
        linkedListNode8.setValue((java.lang.Object) ' ');
        linkedListNode4.setNextNode(linkedListNode8);
        linkedListNode2.setPreviousNode(linkedListNode8);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode19.setNextNode(linkedListNode21);
        linkedListNode21.setValue((java.lang.Object) (-1.0f));
        linkedListNode21.setValue((java.lang.Object) ' ');
        linkedListNode17.setNextNode(linkedListNode21);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode2, linkedListNode21, (java.lang.Object) (short) 100);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode31.setNextNode(linkedListNode33);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode35 = null;
        linkedListNode33.setNextNode(linkedListNode35);
        linkedListNode29.setPreviousNode(linkedListNode33);
        boolean boolean38 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode29);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode40 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode40.setNextNode(linkedListNode42);
        boolean boolean44 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode40);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode46 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode48 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode46.setNextNode(linkedListNode48);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode51 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode53 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode51.setNextNode(linkedListNode53);
        java.lang.Object obj55 = null;
        linkedListNode53.setValue(obj55);
        linkedListNode46.setNextNode(linkedListNode53);
        boolean boolean58 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode53);
        boolean boolean59 = nodeCachingLinkedList0.repOK();
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList60 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean62 = nodeCachingLinkedList60.remove((java.lang.Object) 0);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode63 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) boolean62);
        boolean boolean64 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode63);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode66 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode68 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode70 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode68.setNextNode(linkedListNode70);
        linkedListNode70.setValue((java.lang.Object) (-1.0f));
        linkedListNode66.setPreviousNode(linkedListNode70);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode75 = linkedListNode70.getNextNode();
        boolean boolean76 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode75);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode6.setNextNode(linkedListNode8);
        linkedListNode8.setValue((java.lang.Object) (-1.0f));
        linkedListNode8.setValue((java.lang.Object) ' ');
        linkedListNode4.setNextNode(linkedListNode8);
        linkedListNode2.setPreviousNode(linkedListNode8);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode19.setNextNode(linkedListNode21);
        linkedListNode21.setValue((java.lang.Object) (-1.0f));
        linkedListNode21.setValue((java.lang.Object) ' ');
        linkedListNode17.setNextNode(linkedListNode21);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode2, linkedListNode21, (java.lang.Object) (short) 100);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode31.setNextNode(linkedListNode33);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode35 = null;
        linkedListNode33.setNextNode(linkedListNode35);
        linkedListNode29.setPreviousNode(linkedListNode33);
        boolean boolean38 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode29);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode40 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode40.setNextNode(linkedListNode42);
        java.lang.Object obj44 = linkedListNode40.getValue();
        boolean boolean45 = nodeCachingLinkedList0.remove(obj44);
        boolean boolean46 = nodeCachingLinkedList0.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode48 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 1);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode50 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode52 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode50.setNextNode(linkedListNode52);
        linkedListNode52.setValue((java.lang.Object) (-1.0f));
        linkedListNode52.setValue((java.lang.Object) ' ');
        linkedListNode48.setNextNode(linkedListNode52);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode60 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode62 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode64 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode62.setNextNode(linkedListNode64);
        linkedListNode64.setValue((java.lang.Object) (-1.0f));
        linkedListNode64.setValue((java.lang.Object) ' ');
        linkedListNode60.setNextNode(linkedListNode64);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode72 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode74 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode72.setNextNode(linkedListNode74);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode76 = linkedListNode74.getNextNode();
        linkedListNode64.setNextNode(linkedListNode74);
        linkedListNode48.setValue((java.lang.Object) linkedListNode64);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode79 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode();
        linkedListNode64.setNextNode(linkedListNode79);
        java.lang.Class<?> wildcardClass81 = linkedListNode79.getClass();
        boolean boolean82 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode79);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode2.setNextNode(linkedListNode4);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode6 = null;
        linkedListNode4.setNextNode(linkedListNode6);
        java.lang.Object obj8 = linkedListNode4.getValue();
        boolean boolean9 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode4);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode15.setNextNode(linkedListNode17);
        linkedListNode17.setValue((java.lang.Object) (-1.0f));
        linkedListNode17.setValue((java.lang.Object) ' ');
        linkedListNode13.setNextNode(linkedListNode17);
        linkedListNode11.setPreviousNode(linkedListNode17);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode11);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode26 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode30 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode28.setNextNode(linkedListNode30);
        linkedListNode30.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode34 = linkedListNode30.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode36.setNextNode(linkedListNode38);
        java.lang.Object obj40 = null;
        linkedListNode38.setValue(obj40);
        linkedListNode34.setPreviousNode(linkedListNode38);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode44 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode46 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode48 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode46.setNextNode(linkedListNode48);
        linkedListNode48.setValue((java.lang.Object) (-1.0f));
        linkedListNode44.setPreviousNode(linkedListNode48);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode53 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode26, linkedListNode38, (java.lang.Object) linkedListNode44);
        linkedListNode25.setNextNode(linkedListNode38);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode55 = linkedListNode38.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode56 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode55);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode57 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode56);
        boolean boolean58 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode57);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode6.setNextNode(linkedListNode8);
        linkedListNode8.setValue((java.lang.Object) (-1.0f));
        linkedListNode8.setValue((java.lang.Object) ' ');
        linkedListNode4.setNextNode(linkedListNode8);
        linkedListNode2.setPreviousNode(linkedListNode8);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode19.setNextNode(linkedListNode21);
        linkedListNode21.setValue((java.lang.Object) (-1.0f));
        linkedListNode21.setValue((java.lang.Object) ' ');
        linkedListNode17.setNextNode(linkedListNode21);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode2, linkedListNode21, (java.lang.Object) (short) 100);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode31.setNextNode(linkedListNode33);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode35 = null;
        linkedListNode33.setNextNode(linkedListNode35);
        linkedListNode29.setPreviousNode(linkedListNode33);
        boolean boolean38 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode29);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode40 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        boolean boolean41 = nodeCachingLinkedList0.remove((java.lang.Object) 0.0d);
        boolean boolean42 = nodeCachingLinkedList0.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode44 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode46 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode48 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode46.setNextNode(linkedListNode48);
        linkedListNode48.setValue((java.lang.Object) (-1.0f));
        linkedListNode48.setValue((java.lang.Object) ' ');
        linkedListNode44.setNextNode(linkedListNode48);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode55 = linkedListNode44.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode57 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode59 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode61 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode63 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode61.setNextNode(linkedListNode63);
        linkedListNode63.setValue((java.lang.Object) (-1.0f));
        linkedListNode63.setValue((java.lang.Object) ' ');
        linkedListNode59.setNextNode(linkedListNode63);
        linkedListNode57.setPreviousNode(linkedListNode63);
        linkedListNode55.setPreviousNode(linkedListNode63);
        linkedListNode55.setValue((java.lang.Object) (short) 1);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode75 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode77 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode75.setNextNode(linkedListNode77);
        linkedListNode77.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode81 = linkedListNode77.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode82 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode81);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode83 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode82);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode84 = linkedListNode83.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode85 = linkedListNode84.getNextNode();
        java.lang.Object obj86 = null;
        linkedListNode84.setValue(obj86);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode88 = linkedListNode84.getPreviousNode();
        linkedListNode55.setPreviousNode(linkedListNode84);
        boolean boolean90 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode55);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode2 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode4.setNextNode(linkedListNode6);
        linkedListNode6.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode10 = linkedListNode6.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode14 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode12.setNextNode(linkedListNode14);
        java.lang.Object obj16 = null;
        linkedListNode14.setValue(obj16);
        linkedListNode10.setPreviousNode(linkedListNode14);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode22.setNextNode(linkedListNode24);
        linkedListNode24.setValue((java.lang.Object) (-1.0f));
        linkedListNode20.setPreviousNode(linkedListNode24);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode2, linkedListNode14, (java.lang.Object) linkedListNode20);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode30 = linkedListNode29.getNextNode();
        boolean boolean31 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode30);
        boolean boolean32 = nodeCachingLinkedList0.repOK();
        boolean boolean33 = nodeCachingLinkedList0.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode34 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode36.setNextNode(linkedListNode38);
        linkedListNode38.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode42 = linkedListNode38.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode44 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode46 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode44.setNextNode(linkedListNode46);
        java.lang.Object obj48 = null;
        linkedListNode46.setValue(obj48);
        linkedListNode42.setPreviousNode(linkedListNode46);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode52 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode54 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode56 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode54.setNextNode(linkedListNode56);
        linkedListNode56.setValue((java.lang.Object) (-1.0f));
        linkedListNode52.setPreviousNode(linkedListNode56);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode61 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode34, linkedListNode46, (java.lang.Object) linkedListNode52);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode63 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode65 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode63.setNextNode(linkedListNode65);
        linkedListNode65.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode69 = linkedListNode65.getPreviousNode();
        linkedListNode46.setNextNode(linkedListNode65);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode71 = linkedListNode65.getNextNode();
        boolean boolean72 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode65);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }
}

