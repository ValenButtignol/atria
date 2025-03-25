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
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) "");
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        boolean boolean5 = nodeCachingLinkedList0.add((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList6 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean8 = nodeCachingLinkedList6.remove((java.lang.Object) "");
        boolean boolean9 = nodeCachingLinkedList0.add((java.lang.Object) boolean8);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) "");
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        boolean boolean5 = nodeCachingLinkedList0.add((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList6 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean7 = nodeCachingLinkedList6.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode10 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode10.setNextNode(linkedListNode12);
        linkedListNode12.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode16 = linkedListNode12.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode18.setNextNode(linkedListNode20);
        java.lang.Object obj22 = null;
        linkedListNode20.setValue(obj22);
        linkedListNode16.setPreviousNode(linkedListNode20);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode26 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode30 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode28.setNextNode(linkedListNode30);
        linkedListNode30.setValue((java.lang.Object) (-1.0f));
        linkedListNode26.setPreviousNode(linkedListNode30);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode35 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode8, linkedListNode20, (java.lang.Object) linkedListNode26);
        boolean boolean36 = nodeCachingLinkedList6.remove((java.lang.Object) linkedListNode26);
        boolean boolean37 = nodeCachingLinkedList0.add((java.lang.Object) boolean36);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) '4');
        boolean boolean4 = nodeCachingLinkedList0.add((java.lang.Object) ' ');
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode10 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode8.setNextNode(linkedListNode10);
        linkedListNode10.setValue((java.lang.Object) (-1.0f));
        linkedListNode6.setPreviousNode(linkedListNode10);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode15 = linkedListNode6.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode6, linkedListNode17, (java.lang.Object) ' ');
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList20 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean22 = nodeCachingLinkedList20.remove((java.lang.Object) '4');
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) boolean22);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode19, linkedListNode23, (java.lang.Object) (short) 10);
        boolean boolean26 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode25);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode7.setNextNode(linkedListNode9);
        linkedListNode9.setValue((java.lang.Object) (-1.0f));
        linkedListNode9.setValue((java.lang.Object) ' ');
        linkedListNode5.setNextNode(linkedListNode9);
        linkedListNode3.setPreviousNode(linkedListNode9);
        boolean boolean17 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode9);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode21.setNextNode(linkedListNode23);
        linkedListNode23.setValue((java.lang.Object) (-1.0f));
        linkedListNode19.setPreviousNode(linkedListNode23);
        java.lang.Class<?> wildcardClass28 = linkedListNode23.getClass();
        boolean boolean29 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode23);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode7.setNextNode(linkedListNode9);
        linkedListNode9.setValue((java.lang.Object) (-1.0f));
        linkedListNode9.setValue((java.lang.Object) ' ');
        linkedListNode5.setNextNode(linkedListNode9);
        linkedListNode3.setPreviousNode(linkedListNode9);
        boolean boolean17 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode9);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode20.setNextNode(linkedListNode22);
        linkedListNode22.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode26 = linkedListNode22.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode30 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode28.setNextNode(linkedListNode30);
        java.lang.Object obj32 = null;
        linkedListNode30.setValue(obj32);
        linkedListNode26.setPreviousNode(linkedListNode30);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode40 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode38.setNextNode(linkedListNode40);
        linkedListNode40.setValue((java.lang.Object) (-1.0f));
        linkedListNode36.setPreviousNode(linkedListNode40);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode45 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode18, linkedListNode30, (java.lang.Object) linkedListNode36);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode46 = linkedListNode45.getNextNode();
        java.lang.Object obj47 = linkedListNode45.getValue();
        boolean boolean48 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode45);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) "");
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        boolean boolean5 = nodeCachingLinkedList0.add((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode7.setNextNode(linkedListNode9);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode11 = linkedListNode9.getNextNode();
        boolean boolean12 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode11);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) '4');
        boolean boolean4 = nodeCachingLinkedList0.add((java.lang.Object) ' ');
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 100.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode10 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode8.setNextNode(linkedListNode10);
        linkedListNode10.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode14 = linkedListNode10.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode17.setNextNode(linkedListNode19);
        linkedListNode19.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode23 = linkedListNode19.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode27 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode25.setNextNode(linkedListNode27);
        java.lang.Object obj29 = null;
        linkedListNode27.setValue(obj29);
        linkedListNode23.setPreviousNode(linkedListNode27);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode35 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode37 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode35.setNextNode(linkedListNode37);
        linkedListNode37.setValue((java.lang.Object) (-1.0f));
        linkedListNode33.setPreviousNode(linkedListNode37);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode15, linkedListNode27, (java.lang.Object) linkedListNode33);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode43 = linkedListNode42.getNextNode();
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
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode60 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode14, linkedListNode42, (java.lang.Object) linkedListNode51);
        linkedListNode6.setNextNode(linkedListNode42);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode62 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode64 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode66 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode64.setNextNode(linkedListNode66);
        linkedListNode66.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode70 = linkedListNode66.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode72 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode74 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode72.setNextNode(linkedListNode74);
        java.lang.Object obj76 = null;
        linkedListNode74.setValue(obj76);
        linkedListNode70.setPreviousNode(linkedListNode74);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode80 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode82 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode84 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode82.setNextNode(linkedListNode84);
        linkedListNode84.setValue((java.lang.Object) (-1.0f));
        linkedListNode80.setPreviousNode(linkedListNode84);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode89 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode62, linkedListNode74, (java.lang.Object) linkedListNode80);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode90 = linkedListNode89.getNextNode();
        linkedListNode6.setNextNode(linkedListNode89);
        boolean boolean92 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode6);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode7.setNextNode(linkedListNode9);
        linkedListNode9.setValue((java.lang.Object) (-1.0f));
        linkedListNode9.setValue((java.lang.Object) ' ');
        linkedListNode5.setNextNode(linkedListNode9);
        linkedListNode3.setPreviousNode(linkedListNode9);
        boolean boolean17 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode9);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode23.setNextNode(linkedListNode25);
        linkedListNode25.setValue((java.lang.Object) (-1.0f));
        linkedListNode25.setValue((java.lang.Object) ' ');
        linkedListNode21.setNextNode(linkedListNode25);
        linkedListNode19.setPreviousNode(linkedListNode25);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode34 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode34.setNextNode(linkedListNode36);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode38 = null;
        linkedListNode36.setNextNode(linkedListNode38);
        java.lang.Object obj40 = linkedListNode36.getValue();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) (byte) -1);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode43 = linkedListNode42.getPreviousNode();
        linkedListNode36.setPreviousNode(linkedListNode43);
        linkedListNode25.setNextNode(linkedListNode43);
        boolean boolean46 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode43);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode7.setNextNode(linkedListNode9);
        linkedListNode9.setValue((java.lang.Object) (-1.0f));
        linkedListNode9.setValue((java.lang.Object) ' ');
        linkedListNode5.setNextNode(linkedListNode9);
        linkedListNode3.setPreviousNode(linkedListNode9);
        boolean boolean17 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode9);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode19.setNextNode(linkedListNode21);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode23 = null;
        linkedListNode21.setNextNode(linkedListNode23);
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList25 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean27 = nodeCachingLinkedList25.remove((java.lang.Object) '4');
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) boolean27);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode30 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode32 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode30.setNextNode(linkedListNode32);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode34 = linkedListNode32.getNextNode();
        linkedListNode28.setPreviousNode(linkedListNode34);
        linkedListNode21.setNextNode(linkedListNode34);
        java.lang.Object obj37 = linkedListNode21.getValue();
        boolean boolean38 = nodeCachingLinkedList0.add(obj37);
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
        boolean boolean30 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode20);
        boolean boolean32 = nodeCachingLinkedList0.add((java.lang.Object) (short) 0);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode34 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode36.setNextNode(linkedListNode38);
        linkedListNode38.setValue((java.lang.Object) (-1.0f));
        linkedListNode34.setPreviousNode(linkedListNode38);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode43 = linkedListNode34.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode45 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode47 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode34, linkedListNode45, (java.lang.Object) ' ');
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList48 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean50 = nodeCachingLinkedList48.remove((java.lang.Object) '4');
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode51 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) boolean50);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode53 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode47, linkedListNode51, (java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass54 = linkedListNode47.getClass();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode55 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) wildcardClass54);
        boolean boolean56 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode55);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) '4');
        boolean boolean4 = nodeCachingLinkedList0.add((java.lang.Object) ' ');
        boolean boolean5 = nodeCachingLinkedList0.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode9.setNextNode(linkedListNode11);
        linkedListNode11.setValue((java.lang.Object) (-1.0f));
        linkedListNode7.setPreviousNode(linkedListNode11);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode17.setNextNode(linkedListNode19);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode21 = null;
        linkedListNode19.setNextNode(linkedListNode21);
        linkedListNode11.setNextNode(linkedListNode19);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode27 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode25.setNextNode(linkedListNode27);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode29 = linkedListNode27.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode30 = linkedListNode29.getNextNode();
        linkedListNode19.setValue((java.lang.Object) linkedListNode29);
        boolean boolean32 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode29);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.repOK();
        boolean boolean3 = nodeCachingLinkedList0.add((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList4 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean5 = nodeCachingLinkedList4.repOK();
        boolean boolean7 = nodeCachingLinkedList4.remove((java.lang.Object) "");
        boolean boolean8 = nodeCachingLinkedList4.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode10 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode10.setNextNode(linkedListNode12);
        linkedListNode12.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode16 = linkedListNode12.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode17 = linkedListNode12.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode21.setNextNode(linkedListNode23);
        linkedListNode23.setValue((java.lang.Object) (-1.0f));
        linkedListNode19.setPreviousNode(linkedListNode23);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode28 = linkedListNode19.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode30 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode32 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode19, linkedListNode30, (java.lang.Object) ' ');
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList33 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean35 = nodeCachingLinkedList33.remove((java.lang.Object) '4');
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) boolean35);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode32, linkedListNode36, (java.lang.Object) (short) 10);
        java.lang.Object obj39 = linkedListNode38.getValue();
        linkedListNode17.setPreviousNode(linkedListNode38);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode44 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode46 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode44.setNextNode(linkedListNode46);
        linkedListNode46.setValue((java.lang.Object) (-1.0f));
        linkedListNode42.setPreviousNode(linkedListNode46);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode51 = linkedListNode42.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode53 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode55 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode42, linkedListNode53, (java.lang.Object) ' ');
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode57 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 100.0d);
        linkedListNode53.setNextNode(linkedListNode57);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode60 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode62 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode64 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode62.setNextNode(linkedListNode64);
        linkedListNode64.setValue((java.lang.Object) (-1.0f));
        linkedListNode60.setPreviousNode(linkedListNode64);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode69 = linkedListNode60.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode71 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode73 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode60, linkedListNode71, (java.lang.Object) ' ');
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList74 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean76 = nodeCachingLinkedList74.remove((java.lang.Object) '4');
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode77 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) boolean76);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode79 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode73, linkedListNode77, (java.lang.Object) (short) 10);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode80 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode17, linkedListNode57, (java.lang.Object) (short) 10);
        boolean boolean81 = nodeCachingLinkedList4.add((java.lang.Object) linkedListNode17);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode82 = linkedListNode17.getNextNode();
        boolean boolean83 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode17);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
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
        boolean boolean30 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode20);
        boolean boolean32 = nodeCachingLinkedList0.add((java.lang.Object) (short) 0);
        boolean boolean33 = nodeCachingLinkedList0.repOK();
        boolean boolean34 = nodeCachingLinkedList0.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode40 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode38.setNextNode(linkedListNode40);
        linkedListNode40.setValue((java.lang.Object) (-1.0f));
        linkedListNode36.setPreviousNode(linkedListNode40);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode45 = linkedListNode36.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode46 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode36);
        boolean boolean47 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode36);
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
        boolean boolean30 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode20);
        boolean boolean32 = nodeCachingLinkedList0.remove((java.lang.Object) 10L);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode34 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode36.setNextNode(linkedListNode38);
        linkedListNode38.setValue((java.lang.Object) (-1.0f));
        linkedListNode38.setValue((java.lang.Object) ' ');
        linkedListNode34.setNextNode(linkedListNode38);
        boolean boolean45 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode34);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode47 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode49 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode47.setNextNode(linkedListNode49);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode51 = linkedListNode49.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode52 = linkedListNode49.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode53 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode49);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode55 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        java.lang.Object obj56 = linkedListNode55.getValue();
        linkedListNode53.setPreviousNode(linkedListNode55);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode58 = linkedListNode55.getNextNode();
        boolean boolean59 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode55);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.repOK();
        boolean boolean3 = nodeCachingLinkedList0.remove((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList4 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean6 = nodeCachingLinkedList4.remove((java.lang.Object) '4');
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) boolean6);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode9.setNextNode(linkedListNode11);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode13 = linkedListNode11.getNextNode();
        linkedListNode7.setPreviousNode(linkedListNode13);
        java.lang.Class<?> wildcardClass15 = linkedListNode7.getClass();
        boolean boolean16 = nodeCachingLinkedList0.add((java.lang.Object) wildcardClass15);
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList17 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean19 = nodeCachingLinkedList17.remove((java.lang.Object) '4');
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) boolean19);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode24 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode22.setNextNode(linkedListNode24);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode26 = linkedListNode24.getNextNode();
        linkedListNode20.setPreviousNode(linkedListNode26);
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList28 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean30 = nodeCachingLinkedList28.remove((java.lang.Object) '4');
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) boolean30);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode35 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode37 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode35.setNextNode(linkedListNode37);
        linkedListNode37.setValue((java.lang.Object) (-1.0f));
        linkedListNode33.setPreviousNode(linkedListNode37);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode42 = linkedListNode33.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode44 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode46 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode33, linkedListNode44, (java.lang.Object) ' ');
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode47 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode46);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode48 = linkedListNode46.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode49 = linkedListNode48.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode50 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode26, linkedListNode31, (java.lang.Object) linkedListNode48);
        boolean boolean51 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode26);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) '4');
        boolean boolean4 = nodeCachingLinkedList0.add((java.lang.Object) ' ');
        boolean boolean6 = nodeCachingLinkedList0.remove((java.lang.Object) "");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList7 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean8 = nodeCachingLinkedList7.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode10 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode14 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode14.setNextNode(linkedListNode16);
        linkedListNode16.setValue((java.lang.Object) (-1.0f));
        linkedListNode16.setValue((java.lang.Object) ' ');
        linkedListNode12.setNextNode(linkedListNode16);
        linkedListNode10.setPreviousNode(linkedListNode16);
        boolean boolean24 = nodeCachingLinkedList7.add((java.lang.Object) linkedListNode16);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode26 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode26.setNextNode(linkedListNode28);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode30 = null;
        linkedListNode28.setNextNode(linkedListNode30);
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList32 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean34 = nodeCachingLinkedList32.remove((java.lang.Object) '4');
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode35 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) boolean34);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode37 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode39 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode37.setNextNode(linkedListNode39);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode41 = linkedListNode39.getNextNode();
        linkedListNode35.setPreviousNode(linkedListNode41);
        linkedListNode28.setNextNode(linkedListNode41);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode44 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode28);
        linkedListNode16.setValue((java.lang.Object) linkedListNode44);
        boolean boolean46 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode16);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) '4');
        boolean boolean4 = nodeCachingLinkedList0.add((java.lang.Object) ' ');
        boolean boolean6 = nodeCachingLinkedList0.remove((java.lang.Object) "");
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode10 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode8.setNextNode(linkedListNode10);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode12 = linkedListNode10.getPreviousNode();
        boolean boolean13 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode12);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.repOK();
        boolean boolean3 = nodeCachingLinkedList0.add((java.lang.Object) 10.0f);
        boolean boolean4 = nodeCachingLinkedList0.repOK();
        boolean boolean5 = nodeCachingLinkedList0.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode7.setNextNode(linkedListNode9);
        linkedListNode9.setValue((java.lang.Object) (-1.0f));
        linkedListNode9.setValue((java.lang.Object) ' ');
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList15 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean16 = nodeCachingLinkedList15.repOK();
        boolean boolean18 = nodeCachingLinkedList15.remove((java.lang.Object) "");
        boolean boolean19 = nodeCachingLinkedList15.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode21.setNextNode(linkedListNode23);
        linkedListNode23.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode27 = linkedListNode23.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode28 = linkedListNode23.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode30 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode32 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode34 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode32.setNextNode(linkedListNode34);
        linkedListNode34.setValue((java.lang.Object) (-1.0f));
        linkedListNode30.setPreviousNode(linkedListNode34);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode39 = linkedListNode30.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode41 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode43 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode30, linkedListNode41, (java.lang.Object) ' ');
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList44 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean46 = nodeCachingLinkedList44.remove((java.lang.Object) '4');
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode47 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) boolean46);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode49 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode43, linkedListNode47, (java.lang.Object) (short) 10);
        java.lang.Object obj50 = linkedListNode49.getValue();
        linkedListNode28.setPreviousNode(linkedListNode49);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode53 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode55 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode57 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode55.setNextNode(linkedListNode57);
        linkedListNode57.setValue((java.lang.Object) (-1.0f));
        linkedListNode53.setPreviousNode(linkedListNode57);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode62 = linkedListNode53.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode64 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode66 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode53, linkedListNode64, (java.lang.Object) ' ');
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode68 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 100.0d);
        linkedListNode64.setNextNode(linkedListNode68);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode71 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode73 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode75 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode73.setNextNode(linkedListNode75);
        linkedListNode75.setValue((java.lang.Object) (-1.0f));
        linkedListNode71.setPreviousNode(linkedListNode75);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode80 = linkedListNode71.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode82 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode84 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode71, linkedListNode82, (java.lang.Object) ' ');
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList85 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean87 = nodeCachingLinkedList85.remove((java.lang.Object) '4');
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode88 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) boolean87);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode90 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode84, linkedListNode88, (java.lang.Object) (short) 10);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode91 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode28, linkedListNode68, (java.lang.Object) (short) 10);
        boolean boolean92 = nodeCachingLinkedList15.add((java.lang.Object) linkedListNode28);
        linkedListNode9.setNextNode(linkedListNode28);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode94 = linkedListNode9.getNextNode();
        boolean boolean95 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode94);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode7.setNextNode(linkedListNode9);
        linkedListNode9.setValue((java.lang.Object) (-1.0f));
        linkedListNode9.setValue((java.lang.Object) ' ');
        linkedListNode5.setNextNode(linkedListNode9);
        linkedListNode3.setPreviousNode(linkedListNode9);
        boolean boolean17 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode9);
        boolean boolean19 = nodeCachingLinkedList0.remove((java.lang.Object) 10);
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList20 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean21 = nodeCachingLinkedList20.repOK();
        boolean boolean23 = nodeCachingLinkedList20.add((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode27 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode27.setNextNode(linkedListNode29);
        linkedListNode29.setValue((java.lang.Object) (-1.0f));
        linkedListNode25.setPreviousNode(linkedListNode29);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode34 = linkedListNode25.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode25, linkedListNode36, (java.lang.Object) ' ');
        boolean boolean39 = nodeCachingLinkedList20.remove((java.lang.Object) linkedListNode25);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode40 = linkedListNode25.getNextNode();
        boolean boolean41 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode25);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode43 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode45 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode43.setNextNode(linkedListNode45);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode48 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode50 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode48.setNextNode(linkedListNode50);
        java.lang.Object obj52 = null;
        linkedListNode50.setValue(obj52);
        linkedListNode43.setNextNode(linkedListNode50);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode56 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode58 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode56.setNextNode(linkedListNode58);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode60 = linkedListNode58.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode61 = linkedListNode60.getNextNode();
        linkedListNode43.setValue((java.lang.Object) linkedListNode61);
        boolean boolean63 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode43);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
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
        boolean boolean30 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode20);
        boolean boolean32 = nodeCachingLinkedList0.add((java.lang.Object) (short) 0);
        boolean boolean33 = nodeCachingLinkedList0.repOK();
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList34 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean36 = nodeCachingLinkedList34.remove((java.lang.Object) "");
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode40 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode44 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode42.setNextNode(linkedListNode44);
        linkedListNode44.setValue((java.lang.Object) (-1.0f));
        linkedListNode44.setValue((java.lang.Object) ' ');
        linkedListNode40.setNextNode(linkedListNode44);
        linkedListNode38.setPreviousNode(linkedListNode44);
        boolean boolean52 = nodeCachingLinkedList34.remove((java.lang.Object) linkedListNode38);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode54 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode56 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode58 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode56.setNextNode(linkedListNode58);
        linkedListNode58.setValue((java.lang.Object) (-1.0f));
        linkedListNode54.setPreviousNode(linkedListNode58);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode63 = linkedListNode54.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode65 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode67 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode54, linkedListNode65, (java.lang.Object) ' ');
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList68 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean70 = nodeCachingLinkedList68.remove((java.lang.Object) '4');
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode71 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) boolean70);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode73 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode67, linkedListNode71, (java.lang.Object) (short) 10);
        java.lang.Object obj74 = linkedListNode67.getValue();
        linkedListNode38.setPreviousNode(linkedListNode67);
        boolean boolean76 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode67);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) '4');
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode5.setNextNode(linkedListNode7);
        linkedListNode7.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode11 = linkedListNode7.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode13.setNextNode(linkedListNode15);
        java.lang.Object obj17 = null;
        linkedListNode15.setValue(obj17);
        linkedListNode11.setPreviousNode(linkedListNode15);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode23.setNextNode(linkedListNode25);
        linkedListNode25.setValue((java.lang.Object) (-1.0f));
        linkedListNode21.setPreviousNode(linkedListNode25);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode30 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode3, linkedListNode15, (java.lang.Object) linkedListNode21);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode35 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode33.setNextNode(linkedListNode35);
        linkedListNode35.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode39 = linkedListNode35.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode41 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode43 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode41.setNextNode(linkedListNode43);
        java.lang.Object obj45 = null;
        linkedListNode43.setValue(obj45);
        linkedListNode39.setPreviousNode(linkedListNode43);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode49 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode51 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode53 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode51.setNextNode(linkedListNode53);
        linkedListNode53.setValue((java.lang.Object) (-1.0f));
        linkedListNode49.setPreviousNode(linkedListNode53);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode58 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode31, linkedListNode43, (java.lang.Object) linkedListNode49);
        linkedListNode15.setNextNode(linkedListNode49);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode60 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode62 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode64 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode62.setNextNode(linkedListNode64);
        linkedListNode60.setPreviousNode(linkedListNode64);
        linkedListNode15.setValue((java.lang.Object) linkedListNode60);
        boolean boolean68 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode60);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode70 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode72 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode70.setNextNode(linkedListNode72);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode74 = null;
        linkedListNode72.setNextNode(linkedListNode74);
        java.lang.Object obj76 = linkedListNode72.getValue();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode78 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode80 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode78.setNextNode(linkedListNode80);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode83 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode85 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode83.setNextNode(linkedListNode85);
        java.lang.Object obj87 = null;
        linkedListNode85.setValue(obj87);
        linkedListNode78.setNextNode(linkedListNode85);
        linkedListNode72.setNextNode(linkedListNode85);
        boolean boolean91 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode72);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
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
        boolean boolean30 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode20);
        boolean boolean32 = nodeCachingLinkedList0.add((java.lang.Object) 1);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode34 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode34.setNextNode(linkedListNode36);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode38 = null;
        linkedListNode36.setNextNode(linkedListNode38);
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList40 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean42 = nodeCachingLinkedList40.remove((java.lang.Object) '4');
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode43 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) boolean42);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode45 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode47 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode45.setNextNode(linkedListNode47);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode49 = linkedListNode47.getNextNode();
        linkedListNode43.setPreviousNode(linkedListNode49);
        linkedListNode36.setNextNode(linkedListNode49);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode52 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode36);
        java.lang.Object obj53 = linkedListNode52.getValue();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode54 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode52);
        boolean boolean55 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode54);
        boolean boolean56 = nodeCachingLinkedList0.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode58 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode60 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode62 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode60.setNextNode(linkedListNode62);
        linkedListNode62.setValue((java.lang.Object) (-1.0f));
        linkedListNode58.setPreviousNode(linkedListNode62);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode67 = linkedListNode58.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode69 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode71 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode58, linkedListNode69, (java.lang.Object) ' ');
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode73 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 100.0d);
        linkedListNode69.setNextNode(linkedListNode73);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode75 = linkedListNode73.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode76 = linkedListNode75.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode78 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode80 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode78.setNextNode(linkedListNode80);
        linkedListNode80.setValue((java.lang.Object) (-1.0f));
        linkedListNode75.setValue((java.lang.Object) linkedListNode80);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode85 = linkedListNode75.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode87 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode89 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode87.setNextNode(linkedListNode89);
        java.lang.Object obj91 = null;
        linkedListNode89.setValue(obj91);
        linkedListNode75.setPreviousNode(linkedListNode89);
        boolean boolean94 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode75);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) "");
        boolean boolean4 = nodeCachingLinkedList0.add((java.lang.Object) (-1.0d));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode6.setNextNode(linkedListNode8);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode10 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode8);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode14 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode16 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode14.setNextNode(linkedListNode16);
        linkedListNode16.setValue((java.lang.Object) (-1.0f));
        linkedListNode12.setPreviousNode(linkedListNode16);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode21 = linkedListNode12.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode12, linkedListNode23, (java.lang.Object) ' ');
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode27 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 100.0d);
        linkedListNode23.setNextNode(linkedListNode27);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode29 = linkedListNode27.getPreviousNode();
        java.lang.Object obj30 = linkedListNode29.getValue();
        linkedListNode10.setValue((java.lang.Object) linkedListNode29);
        boolean boolean32 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) "");
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode6.setNextNode(linkedListNode8);
        linkedListNode8.setValue((java.lang.Object) (-1.0f));
        linkedListNode4.setPreviousNode(linkedListNode8);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode13 = linkedListNode4.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode4, linkedListNode15, (java.lang.Object) ' ');
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 100.0d);
        linkedListNode15.setNextNode(linkedListNode19);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode21 = linkedListNode19.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode22 = linkedListNode21.getNextNode();
        boolean boolean23 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode21);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode27 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode27.setNextNode(linkedListNode29);
        linkedListNode29.setValue((java.lang.Object) (-1.0f));
        linkedListNode25.setPreviousNode(linkedListNode29);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode34 = linkedListNode25.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode36.setNextNode(linkedListNode38);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode40 = null;
        linkedListNode38.setNextNode(linkedListNode40);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode42 = linkedListNode38.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode43 = linkedListNode42.getPreviousNode();
        linkedListNode25.setPreviousNode(linkedListNode42);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode46 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode48 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode50 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode48.setNextNode(linkedListNode50);
        linkedListNode50.setValue((java.lang.Object) (-1.0f));
        linkedListNode46.setPreviousNode(linkedListNode50);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode56 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode58 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode56.setNextNode(linkedListNode58);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode60 = null;
        linkedListNode58.setNextNode(linkedListNode60);
        linkedListNode50.setNextNode(linkedListNode58);
        linkedListNode25.setValue((java.lang.Object) linkedListNode58);
        boolean boolean64 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode25);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.repOK();
        boolean boolean3 = nodeCachingLinkedList0.add((java.lang.Object) 10.0f);
        boolean boolean4 = nodeCachingLinkedList0.repOK();
        boolean boolean5 = nodeCachingLinkedList0.repOK();
        boolean boolean6 = nodeCachingLinkedList0.repOK();
        boolean boolean7 = nodeCachingLinkedList0.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode9.setNextNode(linkedListNode11);
        linkedListNode11.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode15 = linkedListNode11.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode17.setNextNode(linkedListNode19);
        java.lang.Object obj21 = null;
        linkedListNode19.setValue(obj21);
        linkedListNode15.setPreviousNode(linkedListNode19);
        java.lang.Object obj24 = linkedListNode19.getValue();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode27 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode27.setNextNode(linkedListNode29);
        linkedListNode29.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode33 = linkedListNode29.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode35 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode37 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode35.setNextNode(linkedListNode37);
        java.lang.Object obj39 = null;
        linkedListNode37.setValue(obj39);
        linkedListNode33.setPreviousNode(linkedListNode37);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode43 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode45 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode47 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode45.setNextNode(linkedListNode47);
        linkedListNode47.setValue((java.lang.Object) (-1.0f));
        linkedListNode43.setPreviousNode(linkedListNode47);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode52 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode25, linkedListNode37, (java.lang.Object) linkedListNode43);
        linkedListNode19.setNextNode(linkedListNode52);
        boolean boolean54 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode52);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) "");
        boolean boolean4 = nodeCachingLinkedList0.add((java.lang.Object) (-1.0d));
        boolean boolean6 = nodeCachingLinkedList0.remove((java.lang.Object) (byte) 100);
        boolean boolean7 = nodeCachingLinkedList0.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 100.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode11.setNextNode(linkedListNode13);
        linkedListNode13.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode17 = linkedListNode13.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode20.setNextNode(linkedListNode22);
        linkedListNode22.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode26 = linkedListNode22.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode30 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode28.setNextNode(linkedListNode30);
        java.lang.Object obj32 = null;
        linkedListNode30.setValue(obj32);
        linkedListNode26.setPreviousNode(linkedListNode30);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode40 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode38.setNextNode(linkedListNode40);
        linkedListNode40.setValue((java.lang.Object) (-1.0f));
        linkedListNode36.setPreviousNode(linkedListNode40);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode45 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode18, linkedListNode30, (java.lang.Object) linkedListNode36);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode46 = linkedListNode45.getNextNode();
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
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode63 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode17, linkedListNode45, (java.lang.Object) linkedListNode54);
        linkedListNode9.setNextNode(linkedListNode45);
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
        linkedListNode9.setNextNode(linkedListNode92);
        boolean boolean95 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode9);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode7.setNextNode(linkedListNode9);
        linkedListNode9.setValue((java.lang.Object) (-1.0f));
        linkedListNode9.setValue((java.lang.Object) ' ');
        linkedListNode5.setNextNode(linkedListNode9);
        linkedListNode3.setPreviousNode(linkedListNode9);
        boolean boolean17 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode9);
        boolean boolean18 = nodeCachingLinkedList0.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode20.setNextNode(linkedListNode22);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode24 = null;
        linkedListNode22.setNextNode(linkedListNode24);
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList26 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean28 = nodeCachingLinkedList26.remove((java.lang.Object) '4');
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) boolean28);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode33 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode31.setNextNode(linkedListNode33);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode35 = linkedListNode33.getNextNode();
        linkedListNode29.setPreviousNode(linkedListNode35);
        linkedListNode22.setNextNode(linkedListNode35);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode38 = linkedListNode35.getNextNode();
        boolean boolean39 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode35);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.repOK();
        boolean boolean3 = nodeCachingLinkedList0.add((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList4 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean6 = nodeCachingLinkedList4.remove((java.lang.Object) "");
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode10 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode14 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode12.setNextNode(linkedListNode14);
        linkedListNode14.setValue((java.lang.Object) (-1.0f));
        linkedListNode14.setValue((java.lang.Object) ' ');
        linkedListNode10.setNextNode(linkedListNode14);
        linkedListNode8.setPreviousNode(linkedListNode14);
        boolean boolean22 = nodeCachingLinkedList4.remove((java.lang.Object) linkedListNode8);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode8);
        boolean boolean24 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode23);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode26 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode26.setNextNode(linkedListNode28);
        linkedListNode28.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode32 = linkedListNode28.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode33 = linkedListNode28.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode35 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode37 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode39 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode37.setNextNode(linkedListNode39);
        linkedListNode39.setValue((java.lang.Object) (-1.0f));
        linkedListNode35.setPreviousNode(linkedListNode39);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode44 = linkedListNode35.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode46 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode48 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode35, linkedListNode46, (java.lang.Object) ' ');
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList49 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean51 = nodeCachingLinkedList49.remove((java.lang.Object) '4');
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode52 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) boolean51);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode54 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode48, linkedListNode52, (java.lang.Object) (short) 10);
        java.lang.Object obj55 = linkedListNode54.getValue();
        linkedListNode33.setPreviousNode(linkedListNode54);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode58 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode60 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode62 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode60.setNextNode(linkedListNode62);
        linkedListNode62.setValue((java.lang.Object) (-1.0f));
        linkedListNode58.setPreviousNode(linkedListNode62);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode67 = linkedListNode58.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode69 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode71 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode58, linkedListNode69, (java.lang.Object) ' ');
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode73 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 100.0d);
        linkedListNode69.setNextNode(linkedListNode73);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode76 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode78 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode80 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode78.setNextNode(linkedListNode80);
        linkedListNode80.setValue((java.lang.Object) (-1.0f));
        linkedListNode76.setPreviousNode(linkedListNode80);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode85 = linkedListNode76.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode87 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode89 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode76, linkedListNode87, (java.lang.Object) ' ');
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList90 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean92 = nodeCachingLinkedList90.remove((java.lang.Object) '4');
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode93 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) boolean92);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode95 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode89, linkedListNode93, (java.lang.Object) (short) 10);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode96 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode33, linkedListNode73, (java.lang.Object) (short) 10);
        boolean boolean97 = nodeCachingLinkedList0.add((java.lang.Object) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) '4');
        boolean boolean4 = nodeCachingLinkedList0.add((java.lang.Object) ' ');
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList5 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean7 = nodeCachingLinkedList5.remove((java.lang.Object) "");
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode13 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode13.setNextNode(linkedListNode15);
        linkedListNode15.setValue((java.lang.Object) (-1.0f));
        linkedListNode15.setValue((java.lang.Object) ' ');
        linkedListNode11.setNextNode(linkedListNode15);
        linkedListNode9.setPreviousNode(linkedListNode15);
        boolean boolean23 = nodeCachingLinkedList5.remove((java.lang.Object) linkedListNode9);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode27 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode27.setNextNode(linkedListNode29);
        linkedListNode29.setValue((java.lang.Object) (-1.0f));
        linkedListNode25.setPreviousNode(linkedListNode29);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode34 = linkedListNode25.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode25, linkedListNode36, (java.lang.Object) ' ');
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList39 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean41 = nodeCachingLinkedList39.remove((java.lang.Object) '4');
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) boolean41);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode44 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode38, linkedListNode42, (java.lang.Object) (short) 10);
        java.lang.Object obj45 = linkedListNode38.getValue();
        linkedListNode9.setPreviousNode(linkedListNode38);
        boolean boolean47 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode38);
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList48 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean49 = nodeCachingLinkedList48.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode51 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode53 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode55 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode53.setNextNode(linkedListNode55);
        linkedListNode55.setValue((java.lang.Object) (-1.0f));
        linkedListNode51.setPreviousNode(linkedListNode55);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode61 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode63 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode65 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode63.setNextNode(linkedListNode65);
        linkedListNode65.setValue((java.lang.Object) (-1.0f));
        linkedListNode61.setPreviousNode(linkedListNode65);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode70 = linkedListNode61.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode72 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode74 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode61, linkedListNode72, (java.lang.Object) ' ');
        linkedListNode55.setNextNode(linkedListNode74);
        boolean boolean76 = nodeCachingLinkedList48.add((java.lang.Object) linkedListNode55);
        boolean boolean77 = nodeCachingLinkedList0.add((java.lang.Object) nodeCachingLinkedList48);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean2 = nodeCachingLinkedList0.remove((java.lang.Object) '4');
        boolean boolean4 = nodeCachingLinkedList0.add((java.lang.Object) ' ');
        boolean boolean6 = nodeCachingLinkedList0.remove((java.lang.Object) "");
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode11 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode9.setNextNode(linkedListNode11);
        linkedListNode11.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode15 = linkedListNode11.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode19 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode17.setNextNode(linkedListNode19);
        java.lang.Object obj21 = null;
        linkedListNode19.setValue(obj21);
        linkedListNode15.setPreviousNode(linkedListNode19);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode25 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode27 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode27.setNextNode(linkedListNode29);
        linkedListNode29.setValue((java.lang.Object) (-1.0f));
        linkedListNode25.setPreviousNode(linkedListNode29);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode34 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode7, linkedListNode19, (java.lang.Object) linkedListNode25);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode35 = linkedListNode7.getPreviousNode();
        boolean boolean36 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode35);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode3 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode5 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode7 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode9 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode7.setNextNode(linkedListNode9);
        linkedListNode9.setValue((java.lang.Object) (-1.0f));
        linkedListNode9.setValue((java.lang.Object) ' ');
        linkedListNode5.setNextNode(linkedListNode9);
        linkedListNode3.setPreviousNode(linkedListNode9);
        boolean boolean17 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode9);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode18 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode20 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode22 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode20.setNextNode(linkedListNode22);
        linkedListNode18.setPreviousNode(linkedListNode22);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode25 = linkedListNode22.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode27 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode27.setNextNode(linkedListNode29);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode32 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode34 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode32.setNextNode(linkedListNode34);
        java.lang.Object obj36 = null;
        linkedListNode34.setValue(obj36);
        linkedListNode27.setNextNode(linkedListNode34);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode40 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode42 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode40.setNextNode(linkedListNode42);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode44 = linkedListNode42.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode45 = linkedListNode44.getNextNode();
        linkedListNode27.setValue((java.lang.Object) linkedListNode45);
        linkedListNode25.setPreviousNode(linkedListNode45);
        boolean boolean48 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode45);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.repOK();
        boolean boolean2 = nodeCachingLinkedList0.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode4 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode6 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode6.setNextNode(linkedListNode8);
        linkedListNode8.setValue((java.lang.Object) (-1.0f));
        linkedListNode4.setPreviousNode(linkedListNode8);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode13 = linkedListNode4.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode15 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode17 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode4, linkedListNode15, (java.lang.Object) ' ');
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList18 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean20 = nodeCachingLinkedList18.remove((java.lang.Object) '4');
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode21 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) boolean20);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode17, linkedListNode21, (java.lang.Object) (short) 10);
        java.lang.Object obj24 = linkedListNode23.getValue();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode26 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        java.lang.Object obj27 = linkedListNode26.getValue();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode29 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode31 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode29.setNextNode(linkedListNode31);
        linkedListNode31.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode35 = linkedListNode31.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode38 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode40 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode38.setNextNode(linkedListNode40);
        linkedListNode40.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode44 = linkedListNode40.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode46 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode48 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode46.setNextNode(linkedListNode48);
        java.lang.Object obj50 = null;
        linkedListNode48.setValue(obj50);
        linkedListNode44.setPreviousNode(linkedListNode48);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode54 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode56 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode58 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode56.setNextNode(linkedListNode58);
        linkedListNode58.setValue((java.lang.Object) (-1.0f));
        linkedListNode54.setPreviousNode(linkedListNode58);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode63 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode36, linkedListNode48, (java.lang.Object) linkedListNode54);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode64 = linkedListNode63.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode66 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode68 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode66.setNextNode(linkedListNode68);
        linkedListNode68.setValue((java.lang.Object) (-1.0f));
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode72 = linkedListNode68.getPreviousNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode74 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode76 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode74.setNextNode(linkedListNode76);
        java.lang.Object obj78 = null;
        linkedListNode76.setValue(obj78);
        linkedListNode72.setPreviousNode(linkedListNode76);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode81 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode35, linkedListNode63, (java.lang.Object) linkedListNode72);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode83 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode85 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode83.setNextNode(linkedListNode85);
        linkedListNode63.setNextNode(linkedListNode83);
        linkedListNode63.setValue((java.lang.Object) (byte) 10);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode90 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode(linkedListNode23, linkedListNode26, (java.lang.Object) linkedListNode63);
        boolean boolean91 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode23);
        boolean boolean92 = nodeCachingLinkedList0.repOK();
        boolean boolean94 = nodeCachingLinkedList0.add((java.lang.Object) 0L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean1 = nodeCachingLinkedList0.repOK();
        boolean boolean3 = nodeCachingLinkedList0.add((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList4 = new system.classfixer.classes.NodeCachingLinkedList();
        boolean boolean6 = nodeCachingLinkedList4.remove((java.lang.Object) "");
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode8 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 10.0f);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode10 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode12 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode14 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode12.setNextNode(linkedListNode14);
        linkedListNode14.setValue((java.lang.Object) (-1.0f));
        linkedListNode14.setValue((java.lang.Object) ' ');
        linkedListNode10.setNextNode(linkedListNode14);
        linkedListNode8.setPreviousNode(linkedListNode14);
        boolean boolean22 = nodeCachingLinkedList4.remove((java.lang.Object) linkedListNode8);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode23 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode8);
        boolean boolean24 = nodeCachingLinkedList0.remove((java.lang.Object) linkedListNode23);
        boolean boolean25 = nodeCachingLinkedList0.repOK();
        boolean boolean26 = nodeCachingLinkedList0.repOK();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode28 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode30 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        linkedListNode28.setNextNode(linkedListNode30);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode32 = linkedListNode30.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode33 = linkedListNode30.getNextNode();
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode34 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) linkedListNode30);
        system.classfixer.classes.NodeCachingLinkedList.LinkedListNode linkedListNode36 = new system.classfixer.classes.NodeCachingLinkedList.LinkedListNode((java.lang.Object) 0.0d);
        java.lang.Object obj37 = linkedListNode36.getValue();
        linkedListNode34.setPreviousNode(linkedListNode36);
        boolean boolean39 = nodeCachingLinkedList0.add((java.lang.Object) linkedListNode34);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.repOK_2());
    }
}

