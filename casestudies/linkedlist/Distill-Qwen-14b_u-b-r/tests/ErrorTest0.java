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
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        boolean boolean2 = linkedList0.add((java.lang.Object) 100.0d);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        boolean boolean2 = linkedList0.add((java.lang.Object) 0.0d);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        boolean boolean3 = linkedList0.add((java.lang.Object) "");
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        boolean boolean4 = linkedList0.remove((java.lang.Object) (-1.0f));
        system.classfixer.classes.LinkedList linkedList5 = new system.classfixer.classes.LinkedList();
        linkedList5.clear();
        boolean boolean7 = linkedList0.add((java.lang.Object) linkedList5);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        system.classfixer.classes.LinkedList linkedList3 = new system.classfixer.classes.LinkedList();
        linkedList3.clear();
        boolean boolean5 = linkedList0.add((java.lang.Object) linkedList3);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        linkedList0.clear();
        boolean boolean2 = linkedList0.repOK();
        boolean boolean4 = linkedList0.add((java.lang.Object) 1.0d);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        linkedList0.clear();
        boolean boolean2 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList3 = new system.classfixer.classes.LinkedList();
        boolean boolean4 = linkedList0.add((java.lang.Object) linkedList3);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        system.classfixer.classes.LinkedList linkedList6 = new system.classfixer.classes.LinkedList();
        int int7 = linkedList6.size();
        linkedList6.clear();
        int int9 = linkedList6.size();
        boolean boolean10 = linkedList6.repOK();
        int int11 = linkedList6.size();
        boolean boolean12 = linkedList0.add((java.lang.Object) int11);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        linkedList0.clear();
        system.classfixer.classes.LinkedList linkedList2 = new system.classfixer.classes.LinkedList();
        int int3 = linkedList2.size();
        linkedList2.clear();
        boolean boolean6 = linkedList2.remove((java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass7 = linkedList2.getClass();
        boolean boolean8 = linkedList0.add((java.lang.Object) wildcardClass7);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        boolean boolean3 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList4 = new system.classfixer.classes.LinkedList();
        int int5 = linkedList4.size();
        linkedList4.clear();
        int int7 = linkedList4.size();
        boolean boolean8 = linkedList4.repOK();
        int int9 = linkedList4.size();
        boolean boolean11 = linkedList4.remove((java.lang.Object) 0);
        boolean boolean13 = linkedList4.remove((java.lang.Object) 0);
        int int14 = linkedList4.size();
        boolean boolean15 = linkedList0.add((java.lang.Object) int14);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        boolean boolean11 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList12 = new system.classfixer.classes.LinkedList();
        int int13 = linkedList12.size();
        linkedList12.clear();
        boolean boolean15 = linkedList0.remove((java.lang.Object) linkedList12);
        system.classfixer.classes.LinkedList linkedList16 = new system.classfixer.classes.LinkedList();
        int int17 = linkedList16.size();
        linkedList16.clear();
        boolean boolean19 = linkedList0.add((java.lang.Object) linkedList16);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        java.lang.Object obj4 = null;
        boolean boolean5 = linkedList0.add(obj4);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        boolean boolean11 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList12 = new system.classfixer.classes.LinkedList();
        int int13 = linkedList12.size();
        linkedList12.clear();
        boolean boolean15 = linkedList0.remove((java.lang.Object) linkedList12);
        boolean boolean17 = linkedList0.add((java.lang.Object) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        linkedList0.clear();
        boolean boolean2 = linkedList0.repOK();
        boolean boolean3 = linkedList0.repOK();
        boolean boolean5 = linkedList0.remove((java.lang.Object) '#');
        int int6 = linkedList0.size();
        boolean boolean8 = linkedList0.add((java.lang.Object) (-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        boolean boolean1 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList2 = new system.classfixer.classes.LinkedList();
        linkedList2.clear();
        boolean boolean4 = linkedList2.repOK();
        boolean boolean5 = linkedList2.repOK();
        boolean boolean7 = linkedList2.remove((java.lang.Object) '#');
        boolean boolean8 = linkedList0.add((java.lang.Object) linkedList2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        linkedList0.clear();
        system.classfixer.classes.LinkedList linkedList11 = new system.classfixer.classes.LinkedList();
        int int12 = linkedList11.size();
        linkedList11.clear();
        boolean boolean15 = linkedList11.remove((java.lang.Object) (-1.0f));
        boolean boolean16 = linkedList0.add((java.lang.Object) linkedList11);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        boolean boolean3 = linkedList0.repOK();
        int int4 = linkedList0.size();
        boolean boolean6 = linkedList0.add((java.lang.Object) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        boolean boolean1 = linkedList0.repOK();
        boolean boolean2 = linkedList0.repOK();
        boolean boolean4 = linkedList0.add((java.lang.Object) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        boolean boolean5 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList6 = new system.classfixer.classes.LinkedList();
        int int7 = linkedList6.size();
        linkedList6.clear();
        int int9 = linkedList6.size();
        boolean boolean10 = linkedList6.repOK();
        int int11 = linkedList6.size();
        boolean boolean13 = linkedList6.remove((java.lang.Object) 0);
        boolean boolean15 = linkedList6.remove((java.lang.Object) 0);
        int int16 = linkedList6.size();
        boolean boolean17 = linkedList6.repOK();
        system.classfixer.classes.LinkedList linkedList18 = new system.classfixer.classes.LinkedList();
        int int19 = linkedList18.size();
        linkedList18.clear();
        boolean boolean21 = linkedList6.remove((java.lang.Object) linkedList18);
        boolean boolean22 = linkedList18.repOK();
        boolean boolean23 = linkedList0.add((java.lang.Object) linkedList18);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        system.classfixer.classes.LinkedList linkedList2 = new system.classfixer.classes.LinkedList();
        int int3 = linkedList2.size();
        linkedList2.clear();
        int int5 = linkedList2.size();
        boolean boolean6 = linkedList2.repOK();
        int int7 = linkedList2.size();
        boolean boolean9 = linkedList2.remove((java.lang.Object) 0);
        boolean boolean11 = linkedList2.remove((java.lang.Object) 0);
        int int12 = linkedList2.size();
        boolean boolean13 = linkedList2.repOK();
        system.classfixer.classes.LinkedList linkedList14 = new system.classfixer.classes.LinkedList();
        int int15 = linkedList14.size();
        linkedList14.clear();
        boolean boolean17 = linkedList2.remove((java.lang.Object) linkedList14);
        boolean boolean18 = linkedList0.add((java.lang.Object) boolean17);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        boolean boolean11 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList12 = new system.classfixer.classes.LinkedList();
        int int13 = linkedList12.size();
        linkedList12.clear();
        boolean boolean15 = linkedList0.remove((java.lang.Object) linkedList12);
        boolean boolean16 = linkedList12.repOK();
        linkedList12.clear();
        int int18 = linkedList12.size();
        system.classfixer.classes.LinkedList linkedList19 = new system.classfixer.classes.LinkedList();
        int int20 = linkedList19.size();
        linkedList19.clear();
        int int22 = linkedList19.size();
        boolean boolean23 = linkedList19.repOK();
        int int24 = linkedList19.size();
        boolean boolean26 = linkedList19.remove((java.lang.Object) 0);
        boolean boolean28 = linkedList19.remove((java.lang.Object) 0);
        int int29 = linkedList19.size();
        boolean boolean30 = linkedList19.repOK();
        system.classfixer.classes.LinkedList linkedList31 = new system.classfixer.classes.LinkedList();
        int int32 = linkedList31.size();
        linkedList31.clear();
        boolean boolean34 = linkedList19.remove((java.lang.Object) linkedList31);
        java.lang.Class<?> wildcardClass35 = linkedList31.getClass();
        boolean boolean36 = linkedList12.add((java.lang.Object) wildcardClass35);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList12", linkedList12.repOK_2());
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        system.classfixer.classes.LinkedList linkedList8 = new system.classfixer.classes.LinkedList();
        int int9 = linkedList8.size();
        int int10 = linkedList8.size();
        boolean boolean11 = linkedList8.repOK();
        system.classfixer.classes.LinkedList linkedList12 = new system.classfixer.classes.LinkedList();
        int int13 = linkedList12.size();
        linkedList12.clear();
        int int15 = linkedList12.size();
        boolean boolean16 = linkedList12.repOK();
        int int17 = linkedList12.size();
        boolean boolean19 = linkedList12.remove((java.lang.Object) 0);
        boolean boolean21 = linkedList12.remove((java.lang.Object) 0);
        int int22 = linkedList12.size();
        boolean boolean23 = linkedList12.repOK();
        int int24 = linkedList12.size();
        boolean boolean25 = linkedList12.repOK();
        boolean boolean26 = linkedList8.remove((java.lang.Object) boolean25);
        boolean boolean27 = linkedList0.add((java.lang.Object) boolean25);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        java.lang.Object obj11 = null;
        boolean boolean12 = linkedList0.add(obj11);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        int int2 = linkedList0.size();
        boolean boolean3 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList4 = new system.classfixer.classes.LinkedList();
        int int5 = linkedList4.size();
        linkedList4.clear();
        int int7 = linkedList4.size();
        boolean boolean8 = linkedList4.repOK();
        int int9 = linkedList4.size();
        boolean boolean11 = linkedList4.remove((java.lang.Object) 0);
        boolean boolean13 = linkedList4.remove((java.lang.Object) 0);
        int int14 = linkedList4.size();
        boolean boolean15 = linkedList4.repOK();
        int int16 = linkedList4.size();
        boolean boolean17 = linkedList4.repOK();
        boolean boolean18 = linkedList0.remove((java.lang.Object) boolean17);
        java.lang.Object obj19 = null;
        boolean boolean20 = linkedList0.add(obj19);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        boolean boolean11 = linkedList0.repOK();
        int int12 = linkedList0.size();
        boolean boolean13 = linkedList0.repOK();
        boolean boolean14 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList15 = new system.classfixer.classes.LinkedList();
        int int16 = linkedList15.size();
        linkedList15.clear();
        int int18 = linkedList15.size();
        boolean boolean19 = linkedList15.repOK();
        int int20 = linkedList15.size();
        boolean boolean22 = linkedList15.remove((java.lang.Object) 0);
        boolean boolean24 = linkedList15.remove((java.lang.Object) 0);
        int int25 = linkedList15.size();
        boolean boolean26 = linkedList15.repOK();
        system.classfixer.classes.LinkedList linkedList27 = new system.classfixer.classes.LinkedList();
        int int28 = linkedList27.size();
        linkedList27.clear();
        boolean boolean30 = linkedList15.remove((java.lang.Object) linkedList27);
        boolean boolean31 = linkedList15.repOK();
        linkedList15.clear();
        linkedList15.clear();
        int int34 = linkedList15.size();
        java.lang.Class<?> wildcardClass35 = linkedList15.getClass();
        boolean boolean36 = linkedList0.remove((java.lang.Object) wildcardClass35);
        boolean boolean38 = linkedList0.add((java.lang.Object) 0.0d);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        boolean boolean11 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList12 = new system.classfixer.classes.LinkedList();
        int int13 = linkedList12.size();
        linkedList12.clear();
        boolean boolean15 = linkedList0.remove((java.lang.Object) linkedList12);
        boolean boolean16 = linkedList0.repOK();
        linkedList0.clear();
        linkedList0.clear();
        int int19 = linkedList0.size();
        int int20 = linkedList0.size();
        boolean boolean22 = linkedList0.add((java.lang.Object) 100.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean11 = linkedList0.remove((java.lang.Object) (-1.0f));
        system.classfixer.classes.LinkedList linkedList12 = new system.classfixer.classes.LinkedList();
        int int13 = linkedList12.size();
        boolean boolean14 = linkedList12.repOK();
        boolean boolean15 = linkedList0.add((java.lang.Object) linkedList12);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean11 = linkedList0.add((java.lang.Object) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        boolean boolean11 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList12 = new system.classfixer.classes.LinkedList();
        int int13 = linkedList12.size();
        linkedList12.clear();
        int int15 = linkedList12.size();
        boolean boolean16 = linkedList12.repOK();
        int int17 = linkedList12.size();
        boolean boolean19 = linkedList12.remove((java.lang.Object) 0);
        boolean boolean21 = linkedList12.remove((java.lang.Object) 0);
        int int22 = linkedList12.size();
        boolean boolean23 = linkedList12.repOK();
        system.classfixer.classes.LinkedList linkedList24 = new system.classfixer.classes.LinkedList();
        int int25 = linkedList24.size();
        linkedList24.clear();
        boolean boolean27 = linkedList12.remove((java.lang.Object) linkedList24);
        boolean boolean28 = linkedList24.repOK();
        boolean boolean29 = linkedList24.repOK();
        boolean boolean30 = linkedList0.add((java.lang.Object) boolean29);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        boolean boolean4 = linkedList0.remove((java.lang.Object) (-1.0f));
        int int5 = linkedList0.size();
        system.classfixer.classes.LinkedList linkedList6 = new system.classfixer.classes.LinkedList();
        boolean boolean7 = linkedList6.repOK();
        boolean boolean8 = linkedList6.repOK();
        int int9 = linkedList6.size();
        boolean boolean10 = linkedList0.add((java.lang.Object) int9);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        linkedList0.clear();
        linkedList0.clear();
        system.classfixer.classes.LinkedList linkedList12 = new system.classfixer.classes.LinkedList();
        int int13 = linkedList12.size();
        linkedList12.clear();
        int int15 = linkedList12.size();
        boolean boolean16 = linkedList12.repOK();
        int int17 = linkedList12.size();
        boolean boolean19 = linkedList12.remove((java.lang.Object) 0);
        boolean boolean21 = linkedList12.remove((java.lang.Object) 0);
        int int22 = linkedList12.size();
        boolean boolean23 = linkedList12.repOK();
        system.classfixer.classes.LinkedList linkedList24 = new system.classfixer.classes.LinkedList();
        int int25 = linkedList24.size();
        linkedList24.clear();
        boolean boolean27 = linkedList12.remove((java.lang.Object) linkedList24);
        boolean boolean28 = linkedList12.repOK();
        linkedList12.clear();
        linkedList12.clear();
        int int31 = linkedList12.size();
        java.lang.Class<?> wildcardClass32 = linkedList12.getClass();
        boolean boolean33 = linkedList0.remove((java.lang.Object) wildcardClass32);
        system.classfixer.classes.LinkedList linkedList34 = new system.classfixer.classes.LinkedList();
        int int35 = linkedList34.size();
        linkedList34.clear();
        int int37 = linkedList34.size();
        boolean boolean38 = linkedList34.repOK();
        int int39 = linkedList34.size();
        boolean boolean41 = linkedList34.remove((java.lang.Object) 0);
        boolean boolean43 = linkedList34.remove((java.lang.Object) 0);
        int int44 = linkedList34.size();
        boolean boolean45 = linkedList34.repOK();
        int int46 = linkedList34.size();
        int int47 = linkedList34.size();
        system.classfixer.classes.LinkedList linkedList48 = new system.classfixer.classes.LinkedList();
        linkedList48.clear();
        boolean boolean50 = linkedList48.repOK();
        boolean boolean51 = linkedList48.repOK();
        boolean boolean52 = linkedList34.remove((java.lang.Object) linkedList48);
        boolean boolean53 = linkedList0.remove((java.lang.Object) boolean52);
        boolean boolean55 = linkedList0.add((java.lang.Object) "hi!");
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        system.classfixer.classes.LinkedList linkedList1 = new system.classfixer.classes.LinkedList();
        int int2 = linkedList1.size();
        linkedList1.clear();
        int int4 = linkedList1.size();
        boolean boolean5 = linkedList1.repOK();
        int int6 = linkedList1.size();
        boolean boolean8 = linkedList1.remove((java.lang.Object) 0);
        boolean boolean10 = linkedList1.remove((java.lang.Object) 0);
        int int11 = linkedList1.size();
        boolean boolean12 = linkedList1.repOK();
        int int13 = linkedList1.size();
        boolean boolean14 = linkedList1.repOK();
        boolean boolean15 = linkedList1.repOK();
        boolean boolean16 = linkedList0.add((java.lang.Object) boolean15);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        linkedList0.clear();
        boolean boolean12 = linkedList0.remove((java.lang.Object) 100);
        int int13 = linkedList0.size();
        system.classfixer.classes.LinkedList linkedList14 = new system.classfixer.classes.LinkedList();
        int int15 = linkedList14.size();
        linkedList14.clear();
        boolean boolean17 = linkedList14.repOK();
        int int18 = linkedList14.size();
        boolean boolean20 = linkedList14.remove((java.lang.Object) (short) 0);
        boolean boolean21 = linkedList0.add((java.lang.Object) boolean20);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        boolean boolean3 = linkedList0.repOK();
        linkedList0.clear();
        int int5 = linkedList0.size();
        system.classfixer.classes.LinkedList linkedList6 = new system.classfixer.classes.LinkedList();
        int int7 = linkedList6.size();
        linkedList6.clear();
        int int9 = linkedList6.size();
        boolean boolean10 = linkedList6.repOK();
        int int11 = linkedList6.size();
        boolean boolean13 = linkedList6.remove((java.lang.Object) 0);
        boolean boolean15 = linkedList6.remove((java.lang.Object) 0);
        boolean boolean17 = linkedList6.remove((java.lang.Object) (short) -1);
        boolean boolean18 = linkedList6.repOK();
        system.classfixer.classes.LinkedList linkedList19 = new system.classfixer.classes.LinkedList();
        int int20 = linkedList19.size();
        boolean boolean21 = linkedList19.repOK();
        boolean boolean23 = linkedList19.remove((java.lang.Object) (short) 1);
        boolean boolean24 = linkedList6.remove((java.lang.Object) linkedList19);
        system.classfixer.classes.LinkedList linkedList25 = new system.classfixer.classes.LinkedList();
        int int26 = linkedList25.size();
        linkedList25.clear();
        int int28 = linkedList25.size();
        boolean boolean29 = linkedList25.repOK();
        int int30 = linkedList25.size();
        boolean boolean32 = linkedList25.remove((java.lang.Object) 0);
        boolean boolean34 = linkedList25.remove((java.lang.Object) 0);
        boolean boolean36 = linkedList25.remove((java.lang.Object) (short) -1);
        boolean boolean37 = linkedList25.repOK();
        system.classfixer.classes.LinkedList linkedList38 = new system.classfixer.classes.LinkedList();
        int int39 = linkedList38.size();
        boolean boolean40 = linkedList38.repOK();
        boolean boolean42 = linkedList38.remove((java.lang.Object) (short) 1);
        boolean boolean43 = linkedList25.remove((java.lang.Object) linkedList38);
        boolean boolean44 = linkedList6.remove((java.lang.Object) linkedList25);
        boolean boolean45 = linkedList0.add((java.lang.Object) linkedList6);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        boolean boolean11 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList12 = new system.classfixer.classes.LinkedList();
        int int13 = linkedList12.size();
        linkedList12.clear();
        boolean boolean15 = linkedList0.remove((java.lang.Object) linkedList12);
        boolean boolean16 = linkedList12.repOK();
        linkedList12.clear();
        system.classfixer.classes.LinkedList linkedList18 = new system.classfixer.classes.LinkedList();
        int int19 = linkedList18.size();
        linkedList18.clear();
        int int21 = linkedList18.size();
        boolean boolean22 = linkedList18.repOK();
        int int23 = linkedList18.size();
        boolean boolean25 = linkedList18.remove((java.lang.Object) 0);
        boolean boolean27 = linkedList18.remove((java.lang.Object) 0);
        int int28 = linkedList18.size();
        system.classfixer.classes.LinkedList linkedList29 = new system.classfixer.classes.LinkedList();
        linkedList29.clear();
        boolean boolean31 = linkedList29.repOK();
        boolean boolean32 = linkedList29.repOK();
        boolean boolean34 = linkedList29.remove((java.lang.Object) "");
        linkedList29.clear();
        boolean boolean36 = linkedList18.remove((java.lang.Object) linkedList29);
        linkedList18.clear();
        boolean boolean38 = linkedList12.remove((java.lang.Object) linkedList18);
        system.classfixer.classes.LinkedList linkedList39 = new system.classfixer.classes.LinkedList();
        int int40 = linkedList39.size();
        int int41 = linkedList39.size();
        boolean boolean42 = linkedList39.repOK();
        boolean boolean43 = linkedList18.remove((java.lang.Object) linkedList39);
        system.classfixer.classes.LinkedList linkedList44 = new system.classfixer.classes.LinkedList();
        int int45 = linkedList44.size();
        linkedList44.clear();
        int int47 = linkedList44.size();
        boolean boolean48 = linkedList44.repOK();
        int int49 = linkedList44.size();
        boolean boolean51 = linkedList44.remove((java.lang.Object) 0);
        boolean boolean53 = linkedList44.remove((java.lang.Object) 0);
        int int54 = linkedList44.size();
        boolean boolean55 = linkedList44.repOK();
        system.classfixer.classes.LinkedList linkedList56 = new system.classfixer.classes.LinkedList();
        int int57 = linkedList56.size();
        linkedList56.clear();
        boolean boolean59 = linkedList44.remove((java.lang.Object) linkedList56);
        int int60 = linkedList44.size();
        linkedList44.clear();
        boolean boolean62 = linkedList39.add((java.lang.Object) linkedList44);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList39", linkedList39.repOK_2());
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        linkedList0.clear();
        boolean boolean2 = linkedList0.repOK();
        boolean boolean3 = linkedList0.repOK();
        boolean boolean5 = linkedList0.remove((java.lang.Object) '#');
        int int6 = linkedList0.size();
        system.classfixer.classes.LinkedList linkedList7 = new system.classfixer.classes.LinkedList();
        int int8 = linkedList7.size();
        linkedList7.clear();
        int int10 = linkedList7.size();
        boolean boolean11 = linkedList7.repOK();
        int int12 = linkedList7.size();
        boolean boolean14 = linkedList7.remove((java.lang.Object) 0);
        boolean boolean16 = linkedList7.remove((java.lang.Object) 0);
        linkedList7.clear();
        linkedList7.clear();
        system.classfixer.classes.LinkedList linkedList19 = new system.classfixer.classes.LinkedList();
        int int20 = linkedList19.size();
        linkedList19.clear();
        int int22 = linkedList19.size();
        boolean boolean23 = linkedList19.repOK();
        int int24 = linkedList19.size();
        boolean boolean26 = linkedList19.remove((java.lang.Object) 0);
        boolean boolean28 = linkedList19.remove((java.lang.Object) 0);
        int int29 = linkedList19.size();
        boolean boolean30 = linkedList19.repOK();
        system.classfixer.classes.LinkedList linkedList31 = new system.classfixer.classes.LinkedList();
        int int32 = linkedList31.size();
        linkedList31.clear();
        boolean boolean34 = linkedList19.remove((java.lang.Object) linkedList31);
        boolean boolean35 = linkedList19.repOK();
        linkedList19.clear();
        linkedList19.clear();
        int int38 = linkedList19.size();
        java.lang.Class<?> wildcardClass39 = linkedList19.getClass();
        boolean boolean40 = linkedList7.remove((java.lang.Object) wildcardClass39);
        system.classfixer.classes.LinkedList linkedList41 = new system.classfixer.classes.LinkedList();
        int int42 = linkedList41.size();
        linkedList41.clear();
        int int44 = linkedList41.size();
        boolean boolean45 = linkedList41.repOK();
        int int46 = linkedList41.size();
        boolean boolean48 = linkedList41.remove((java.lang.Object) 0);
        boolean boolean50 = linkedList41.remove((java.lang.Object) 0);
        int int51 = linkedList41.size();
        boolean boolean52 = linkedList41.repOK();
        int int53 = linkedList41.size();
        int int54 = linkedList41.size();
        system.classfixer.classes.LinkedList linkedList55 = new system.classfixer.classes.LinkedList();
        linkedList55.clear();
        boolean boolean57 = linkedList55.repOK();
        boolean boolean58 = linkedList55.repOK();
        boolean boolean59 = linkedList41.remove((java.lang.Object) linkedList55);
        boolean boolean60 = linkedList7.remove((java.lang.Object) boolean59);
        system.classfixer.classes.LinkedList linkedList61 = new system.classfixer.classes.LinkedList();
        int int62 = linkedList61.size();
        linkedList61.clear();
        int int64 = linkedList61.size();
        boolean boolean65 = linkedList61.repOK();
        int int66 = linkedList61.size();
        boolean boolean68 = linkedList61.remove((java.lang.Object) 0);
        boolean boolean70 = linkedList61.remove((java.lang.Object) 0);
        int int71 = linkedList61.size();
        boolean boolean72 = linkedList61.repOK();
        system.classfixer.classes.LinkedList linkedList73 = new system.classfixer.classes.LinkedList();
        int int74 = linkedList73.size();
        linkedList73.clear();
        boolean boolean76 = linkedList61.remove((java.lang.Object) linkedList73);
        int int77 = linkedList61.size();
        int int78 = linkedList61.size();
        boolean boolean79 = linkedList7.remove((java.lang.Object) int78);
        linkedList7.clear();
        boolean boolean81 = linkedList0.add((java.lang.Object) linkedList7);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        system.classfixer.classes.LinkedList linkedList4 = new system.classfixer.classes.LinkedList();
        int int5 = linkedList4.size();
        linkedList4.clear();
        int int7 = linkedList4.size();
        boolean boolean8 = linkedList4.repOK();
        int int9 = linkedList4.size();
        boolean boolean11 = linkedList4.remove((java.lang.Object) 0);
        boolean boolean13 = linkedList4.remove((java.lang.Object) 0);
        linkedList4.clear();
        linkedList4.clear();
        system.classfixer.classes.LinkedList linkedList16 = new system.classfixer.classes.LinkedList();
        int int17 = linkedList16.size();
        linkedList16.clear();
        int int19 = linkedList16.size();
        boolean boolean20 = linkedList16.repOK();
        int int21 = linkedList16.size();
        boolean boolean23 = linkedList16.remove((java.lang.Object) 0);
        boolean boolean25 = linkedList16.remove((java.lang.Object) 0);
        int int26 = linkedList16.size();
        boolean boolean27 = linkedList16.repOK();
        system.classfixer.classes.LinkedList linkedList28 = new system.classfixer.classes.LinkedList();
        int int29 = linkedList28.size();
        linkedList28.clear();
        boolean boolean31 = linkedList16.remove((java.lang.Object) linkedList28);
        boolean boolean32 = linkedList16.repOK();
        linkedList16.clear();
        linkedList16.clear();
        int int35 = linkedList16.size();
        java.lang.Class<?> wildcardClass36 = linkedList16.getClass();
        boolean boolean37 = linkedList4.remove((java.lang.Object) wildcardClass36);
        system.classfixer.classes.LinkedList linkedList38 = new system.classfixer.classes.LinkedList();
        int int39 = linkedList38.size();
        linkedList38.clear();
        int int41 = linkedList38.size();
        boolean boolean42 = linkedList38.repOK();
        int int43 = linkedList38.size();
        boolean boolean45 = linkedList38.remove((java.lang.Object) 0);
        boolean boolean47 = linkedList38.remove((java.lang.Object) 0);
        int int48 = linkedList38.size();
        boolean boolean49 = linkedList38.repOK();
        int int50 = linkedList38.size();
        int int51 = linkedList38.size();
        system.classfixer.classes.LinkedList linkedList52 = new system.classfixer.classes.LinkedList();
        linkedList52.clear();
        boolean boolean54 = linkedList52.repOK();
        boolean boolean55 = linkedList52.repOK();
        boolean boolean56 = linkedList38.remove((java.lang.Object) linkedList52);
        boolean boolean57 = linkedList4.remove((java.lang.Object) boolean56);
        system.classfixer.classes.LinkedList linkedList58 = new system.classfixer.classes.LinkedList();
        int int59 = linkedList58.size();
        linkedList58.clear();
        int int61 = linkedList58.size();
        boolean boolean62 = linkedList58.repOK();
        int int63 = linkedList58.size();
        boolean boolean65 = linkedList58.remove((java.lang.Object) 0);
        boolean boolean67 = linkedList58.remove((java.lang.Object) 0);
        int int68 = linkedList58.size();
        boolean boolean69 = linkedList58.repOK();
        system.classfixer.classes.LinkedList linkedList70 = new system.classfixer.classes.LinkedList();
        int int71 = linkedList70.size();
        linkedList70.clear();
        boolean boolean73 = linkedList58.remove((java.lang.Object) linkedList70);
        int int74 = linkedList58.size();
        int int75 = linkedList58.size();
        boolean boolean76 = linkedList4.remove((java.lang.Object) int75);
        boolean boolean77 = linkedList0.add((java.lang.Object) linkedList4);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        boolean boolean2 = linkedList0.remove((java.lang.Object) 1L);
        boolean boolean4 = linkedList0.add((java.lang.Object) "hi!");
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        boolean boolean11 = linkedList0.repOK();
        int int12 = linkedList0.size();
        boolean boolean13 = linkedList0.repOK();
        boolean boolean14 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList15 = new system.classfixer.classes.LinkedList();
        int int16 = linkedList15.size();
        linkedList15.clear();
        int int18 = linkedList15.size();
        boolean boolean19 = linkedList15.repOK();
        int int20 = linkedList15.size();
        boolean boolean21 = linkedList0.add((java.lang.Object) int20);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean11 = linkedList0.remove((java.lang.Object) (-1.0f));
        system.classfixer.classes.LinkedList linkedList12 = new system.classfixer.classes.LinkedList();
        linkedList12.clear();
        boolean boolean14 = linkedList12.repOK();
        boolean boolean15 = linkedList12.repOK();
        boolean boolean17 = linkedList12.remove((java.lang.Object) "");
        linkedList12.clear();
        boolean boolean19 = linkedList0.remove((java.lang.Object) linkedList12);
        java.lang.Object obj20 = null;
        boolean boolean21 = linkedList12.add(obj20);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList12", linkedList12.repOK_2());
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        boolean boolean11 = linkedList0.repOK();
        int int12 = linkedList0.size();
        boolean boolean13 = linkedList0.repOK();
        boolean boolean14 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList15 = new system.classfixer.classes.LinkedList();
        int int16 = linkedList15.size();
        linkedList15.clear();
        int int18 = linkedList15.size();
        boolean boolean19 = linkedList15.repOK();
        int int20 = linkedList15.size();
        boolean boolean22 = linkedList15.remove((java.lang.Object) 0);
        boolean boolean24 = linkedList15.remove((java.lang.Object) 0);
        int int25 = linkedList15.size();
        boolean boolean26 = linkedList15.repOK();
        system.classfixer.classes.LinkedList linkedList27 = new system.classfixer.classes.LinkedList();
        int int28 = linkedList27.size();
        linkedList27.clear();
        boolean boolean30 = linkedList15.remove((java.lang.Object) linkedList27);
        boolean boolean31 = linkedList15.repOK();
        linkedList15.clear();
        linkedList15.clear();
        int int34 = linkedList15.size();
        java.lang.Class<?> wildcardClass35 = linkedList15.getClass();
        boolean boolean36 = linkedList0.remove((java.lang.Object) wildcardClass35);
        linkedList0.clear();
        boolean boolean39 = linkedList0.remove((java.lang.Object) ' ');
        system.classfixer.classes.LinkedList linkedList40 = new system.classfixer.classes.LinkedList();
        int int41 = linkedList40.size();
        linkedList40.clear();
        int int43 = linkedList40.size();
        boolean boolean44 = linkedList40.repOK();
        int int45 = linkedList40.size();
        boolean boolean47 = linkedList40.remove((java.lang.Object) 0);
        boolean boolean49 = linkedList40.remove((java.lang.Object) 0);
        int int50 = linkedList40.size();
        boolean boolean51 = linkedList40.repOK();
        int int52 = linkedList40.size();
        boolean boolean53 = linkedList40.repOK();
        boolean boolean54 = linkedList40.repOK();
        system.classfixer.classes.LinkedList linkedList55 = new system.classfixer.classes.LinkedList();
        int int56 = linkedList55.size();
        linkedList55.clear();
        int int58 = linkedList55.size();
        boolean boolean59 = linkedList55.repOK();
        int int60 = linkedList55.size();
        boolean boolean62 = linkedList55.remove((java.lang.Object) 0);
        boolean boolean64 = linkedList55.remove((java.lang.Object) 0);
        int int65 = linkedList55.size();
        boolean boolean66 = linkedList55.repOK();
        system.classfixer.classes.LinkedList linkedList67 = new system.classfixer.classes.LinkedList();
        int int68 = linkedList67.size();
        linkedList67.clear();
        boolean boolean70 = linkedList55.remove((java.lang.Object) linkedList67);
        boolean boolean71 = linkedList55.repOK();
        linkedList55.clear();
        linkedList55.clear();
        int int74 = linkedList55.size();
        java.lang.Class<?> wildcardClass75 = linkedList55.getClass();
        boolean boolean76 = linkedList40.remove((java.lang.Object) wildcardClass75);
        linkedList40.clear();
        boolean boolean79 = linkedList40.remove((java.lang.Object) ' ');
        boolean boolean80 = linkedList40.repOK();
        boolean boolean81 = linkedList0.add((java.lang.Object) linkedList40);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean11 = linkedList0.remove((java.lang.Object) (short) -1);
        boolean boolean12 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList13 = new system.classfixer.classes.LinkedList();
        int int14 = linkedList13.size();
        boolean boolean15 = linkedList13.repOK();
        boolean boolean17 = linkedList13.remove((java.lang.Object) (short) 1);
        boolean boolean18 = linkedList0.remove((java.lang.Object) linkedList13);
        system.classfixer.classes.LinkedList linkedList19 = new system.classfixer.classes.LinkedList();
        int int20 = linkedList19.size();
        linkedList19.clear();
        int int22 = linkedList19.size();
        boolean boolean23 = linkedList19.repOK();
        int int24 = linkedList19.size();
        boolean boolean26 = linkedList19.remove((java.lang.Object) 0);
        boolean boolean28 = linkedList19.remove((java.lang.Object) 0);
        boolean boolean30 = linkedList19.remove((java.lang.Object) (short) -1);
        boolean boolean31 = linkedList19.repOK();
        system.classfixer.classes.LinkedList linkedList32 = new system.classfixer.classes.LinkedList();
        int int33 = linkedList32.size();
        boolean boolean34 = linkedList32.repOK();
        boolean boolean36 = linkedList32.remove((java.lang.Object) (short) 1);
        boolean boolean37 = linkedList19.remove((java.lang.Object) linkedList32);
        boolean boolean38 = linkedList0.remove((java.lang.Object) linkedList19);
        system.classfixer.classes.LinkedList linkedList39 = new system.classfixer.classes.LinkedList();
        boolean boolean40 = linkedList39.repOK();
        boolean boolean41 = linkedList39.repOK();
        java.lang.Class<?> wildcardClass42 = linkedList39.getClass();
        boolean boolean43 = linkedList0.add((java.lang.Object) wildcardClass42);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        boolean boolean11 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList12 = new system.classfixer.classes.LinkedList();
        int int13 = linkedList12.size();
        linkedList12.clear();
        boolean boolean15 = linkedList0.remove((java.lang.Object) linkedList12);
        boolean boolean16 = linkedList12.repOK();
        boolean boolean17 = linkedList12.repOK();
        linkedList12.clear();
        system.classfixer.classes.LinkedList linkedList19 = new system.classfixer.classes.LinkedList();
        int int20 = linkedList19.size();
        linkedList19.clear();
        int int22 = linkedList19.size();
        boolean boolean23 = linkedList19.repOK();
        int int24 = linkedList19.size();
        boolean boolean26 = linkedList19.remove((java.lang.Object) 0);
        boolean boolean28 = linkedList19.remove((java.lang.Object) 0);
        boolean boolean30 = linkedList19.remove((java.lang.Object) (short) -1);
        boolean boolean31 = linkedList19.repOK();
        system.classfixer.classes.LinkedList linkedList32 = new system.classfixer.classes.LinkedList();
        int int33 = linkedList32.size();
        boolean boolean34 = linkedList32.repOK();
        boolean boolean36 = linkedList32.remove((java.lang.Object) (short) 1);
        boolean boolean37 = linkedList19.remove((java.lang.Object) linkedList32);
        boolean boolean38 = linkedList12.add((java.lang.Object) linkedList32);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList12", linkedList12.repOK_2());
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        boolean boolean2 = linkedList0.remove((java.lang.Object) 1L);
        boolean boolean4 = linkedList0.add((java.lang.Object) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        boolean boolean5 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList6 = new system.classfixer.classes.LinkedList();
        int int7 = linkedList6.size();
        linkedList6.clear();
        int int9 = linkedList6.size();
        boolean boolean10 = linkedList6.repOK();
        int int11 = linkedList6.size();
        boolean boolean13 = linkedList6.remove((java.lang.Object) 0);
        boolean boolean15 = linkedList6.remove((java.lang.Object) 0);
        int int16 = linkedList6.size();
        boolean boolean17 = linkedList6.repOK();
        system.classfixer.classes.LinkedList linkedList18 = new system.classfixer.classes.LinkedList();
        int int19 = linkedList18.size();
        linkedList18.clear();
        boolean boolean21 = linkedList6.remove((java.lang.Object) linkedList18);
        int int22 = linkedList6.size();
        linkedList6.clear();
        boolean boolean24 = linkedList0.add((java.lang.Object) linkedList6);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        linkedList0.clear();
        linkedList0.clear();
        system.classfixer.classes.LinkedList linkedList12 = new system.classfixer.classes.LinkedList();
        int int13 = linkedList12.size();
        linkedList12.clear();
        int int15 = linkedList12.size();
        boolean boolean16 = linkedList12.repOK();
        int int17 = linkedList12.size();
        boolean boolean19 = linkedList12.remove((java.lang.Object) 0);
        boolean boolean21 = linkedList12.remove((java.lang.Object) 0);
        int int22 = linkedList12.size();
        boolean boolean23 = linkedList12.repOK();
        system.classfixer.classes.LinkedList linkedList24 = new system.classfixer.classes.LinkedList();
        int int25 = linkedList24.size();
        linkedList24.clear();
        boolean boolean27 = linkedList12.remove((java.lang.Object) linkedList24);
        boolean boolean28 = linkedList12.repOK();
        linkedList12.clear();
        linkedList12.clear();
        int int31 = linkedList12.size();
        java.lang.Class<?> wildcardClass32 = linkedList12.getClass();
        boolean boolean33 = linkedList0.remove((java.lang.Object) wildcardClass32);
        system.classfixer.classes.LinkedList linkedList34 = new system.classfixer.classes.LinkedList();
        int int35 = linkedList34.size();
        linkedList34.clear();
        int int37 = linkedList34.size();
        boolean boolean38 = linkedList34.repOK();
        int int39 = linkedList34.size();
        boolean boolean41 = linkedList34.remove((java.lang.Object) 0);
        boolean boolean43 = linkedList34.remove((java.lang.Object) 0);
        int int44 = linkedList34.size();
        boolean boolean45 = linkedList34.repOK();
        int int46 = linkedList34.size();
        int int47 = linkedList34.size();
        system.classfixer.classes.LinkedList linkedList48 = new system.classfixer.classes.LinkedList();
        linkedList48.clear();
        boolean boolean50 = linkedList48.repOK();
        boolean boolean51 = linkedList48.repOK();
        boolean boolean52 = linkedList34.remove((java.lang.Object) linkedList48);
        boolean boolean53 = linkedList0.remove((java.lang.Object) boolean52);
        system.classfixer.classes.LinkedList linkedList54 = new system.classfixer.classes.LinkedList();
        int int55 = linkedList54.size();
        linkedList54.clear();
        int int57 = linkedList54.size();
        boolean boolean58 = linkedList54.repOK();
        int int59 = linkedList54.size();
        boolean boolean61 = linkedList54.remove((java.lang.Object) 0);
        boolean boolean63 = linkedList54.remove((java.lang.Object) 0);
        int int64 = linkedList54.size();
        boolean boolean65 = linkedList54.repOK();
        system.classfixer.classes.LinkedList linkedList66 = new system.classfixer.classes.LinkedList();
        int int67 = linkedList66.size();
        linkedList66.clear();
        boolean boolean69 = linkedList54.remove((java.lang.Object) linkedList66);
        int int70 = linkedList54.size();
        int int71 = linkedList54.size();
        boolean boolean72 = linkedList0.remove((java.lang.Object) int71);
        boolean boolean74 = linkedList0.add((java.lang.Object) 1.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        boolean boolean11 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList12 = new system.classfixer.classes.LinkedList();
        int int13 = linkedList12.size();
        linkedList12.clear();
        boolean boolean15 = linkedList0.remove((java.lang.Object) linkedList12);
        boolean boolean16 = linkedList12.repOK();
        linkedList12.clear();
        system.classfixer.classes.LinkedList linkedList18 = new system.classfixer.classes.LinkedList();
        int int19 = linkedList18.size();
        linkedList18.clear();
        int int21 = linkedList18.size();
        boolean boolean22 = linkedList18.repOK();
        int int23 = linkedList18.size();
        boolean boolean25 = linkedList18.remove((java.lang.Object) 0);
        boolean boolean27 = linkedList18.remove((java.lang.Object) 0);
        int int28 = linkedList18.size();
        boolean boolean29 = linkedList18.repOK();
        system.classfixer.classes.LinkedList linkedList30 = new system.classfixer.classes.LinkedList();
        int int31 = linkedList30.size();
        linkedList30.clear();
        boolean boolean33 = linkedList18.remove((java.lang.Object) linkedList30);
        java.lang.Class<?> wildcardClass34 = linkedList30.getClass();
        boolean boolean35 = linkedList12.remove((java.lang.Object) linkedList30);
        system.classfixer.classes.LinkedList linkedList36 = new system.classfixer.classes.LinkedList();
        int int37 = linkedList36.size();
        linkedList36.clear();
        boolean boolean39 = linkedList36.repOK();
        linkedList36.clear();
        int int41 = linkedList36.size();
        boolean boolean42 = linkedList12.add((java.lang.Object) int41);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList12", linkedList12.repOK_2());
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        boolean boolean3 = linkedList0.repOK();
        boolean boolean5 = linkedList0.remove((java.lang.Object) 1.0f);
        system.classfixer.classes.LinkedList linkedList6 = new system.classfixer.classes.LinkedList();
        int int7 = linkedList6.size();
        linkedList6.clear();
        int int9 = linkedList6.size();
        boolean boolean10 = linkedList6.repOK();
        int int11 = linkedList6.size();
        boolean boolean13 = linkedList6.remove((java.lang.Object) 0);
        boolean boolean15 = linkedList6.remove((java.lang.Object) 0);
        boolean boolean17 = linkedList6.remove((java.lang.Object) (byte) 0);
        boolean boolean18 = linkedList0.add((java.lang.Object) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        system.classfixer.classes.LinkedList linkedList11 = new system.classfixer.classes.LinkedList();
        int int12 = linkedList11.size();
        linkedList11.clear();
        int int14 = linkedList11.size();
        boolean boolean15 = linkedList11.repOK();
        int int16 = linkedList11.size();
        boolean boolean18 = linkedList11.remove((java.lang.Object) 0);
        boolean boolean20 = linkedList11.remove((java.lang.Object) 0);
        int int21 = linkedList11.size();
        boolean boolean22 = linkedList11.repOK();
        system.classfixer.classes.LinkedList linkedList23 = new system.classfixer.classes.LinkedList();
        int int24 = linkedList23.size();
        linkedList23.clear();
        boolean boolean26 = linkedList11.remove((java.lang.Object) linkedList23);
        boolean boolean27 = linkedList23.repOK();
        linkedList23.clear();
        system.classfixer.classes.LinkedList linkedList29 = new system.classfixer.classes.LinkedList();
        int int30 = linkedList29.size();
        linkedList29.clear();
        int int32 = linkedList29.size();
        boolean boolean33 = linkedList29.repOK();
        int int34 = linkedList29.size();
        boolean boolean36 = linkedList29.remove((java.lang.Object) 0);
        boolean boolean38 = linkedList29.remove((java.lang.Object) 0);
        int int39 = linkedList29.size();
        boolean boolean40 = linkedList29.repOK();
        system.classfixer.classes.LinkedList linkedList41 = new system.classfixer.classes.LinkedList();
        int int42 = linkedList41.size();
        linkedList41.clear();
        boolean boolean44 = linkedList29.remove((java.lang.Object) linkedList41);
        java.lang.Class<?> wildcardClass45 = linkedList41.getClass();
        boolean boolean46 = linkedList23.remove((java.lang.Object) linkedList41);
        int int47 = linkedList23.size();
        system.classfixer.classes.LinkedList linkedList48 = new system.classfixer.classes.LinkedList();
        int int49 = linkedList48.size();
        linkedList48.clear();
        int int51 = linkedList48.size();
        boolean boolean52 = linkedList48.repOK();
        int int53 = linkedList48.size();
        boolean boolean55 = linkedList48.remove((java.lang.Object) 0);
        boolean boolean57 = linkedList48.remove((java.lang.Object) 0);
        int int58 = linkedList48.size();
        boolean boolean59 = linkedList48.repOK();
        system.classfixer.classes.LinkedList linkedList60 = new system.classfixer.classes.LinkedList();
        int int61 = linkedList60.size();
        linkedList60.clear();
        boolean boolean63 = linkedList48.remove((java.lang.Object) linkedList60);
        boolean boolean64 = linkedList48.repOK();
        boolean boolean65 = linkedList23.remove((java.lang.Object) linkedList48);
        boolean boolean66 = linkedList0.add((java.lang.Object) linkedList23);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        system.classfixer.classes.LinkedList linkedList11 = new system.classfixer.classes.LinkedList();
        linkedList11.clear();
        boolean boolean13 = linkedList11.repOK();
        boolean boolean14 = linkedList11.repOK();
        boolean boolean16 = linkedList11.remove((java.lang.Object) "");
        linkedList11.clear();
        boolean boolean18 = linkedList0.remove((java.lang.Object) linkedList11);
        system.classfixer.classes.LinkedList linkedList19 = new system.classfixer.classes.LinkedList();
        int int20 = linkedList19.size();
        linkedList19.clear();
        int int22 = linkedList19.size();
        boolean boolean23 = linkedList19.repOK();
        int int24 = linkedList19.size();
        boolean boolean26 = linkedList19.remove((java.lang.Object) 0);
        boolean boolean28 = linkedList19.remove((java.lang.Object) 0);
        int int29 = linkedList19.size();
        boolean boolean30 = linkedList19.repOK();
        system.classfixer.classes.LinkedList linkedList31 = new system.classfixer.classes.LinkedList();
        int int32 = linkedList31.size();
        linkedList31.clear();
        boolean boolean34 = linkedList19.remove((java.lang.Object) linkedList31);
        boolean boolean35 = linkedList19.repOK();
        linkedList19.clear();
        linkedList19.clear();
        int int38 = linkedList19.size();
        int int39 = linkedList19.size();
        int int40 = linkedList19.size();
        boolean boolean41 = linkedList0.remove((java.lang.Object) linkedList19);
        boolean boolean43 = linkedList19.add((java.lang.Object) 10.0d);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList19", linkedList19.repOK_2());
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        boolean boolean11 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList12 = new system.classfixer.classes.LinkedList();
        int int13 = linkedList12.size();
        linkedList12.clear();
        boolean boolean15 = linkedList0.remove((java.lang.Object) linkedList12);
        boolean boolean16 = linkedList0.repOK();
        linkedList0.clear();
        linkedList0.clear();
        int int19 = linkedList0.size();
        boolean boolean21 = linkedList0.add((java.lang.Object) (-1.0d));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        boolean boolean11 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList12 = new system.classfixer.classes.LinkedList();
        int int13 = linkedList12.size();
        linkedList12.clear();
        boolean boolean15 = linkedList0.remove((java.lang.Object) linkedList12);
        boolean boolean16 = linkedList12.repOK();
        linkedList12.clear();
        system.classfixer.classes.LinkedList linkedList18 = new system.classfixer.classes.LinkedList();
        int int19 = linkedList18.size();
        linkedList18.clear();
        int int21 = linkedList18.size();
        boolean boolean22 = linkedList18.repOK();
        int int23 = linkedList18.size();
        boolean boolean25 = linkedList18.remove((java.lang.Object) 0);
        boolean boolean27 = linkedList18.remove((java.lang.Object) 0);
        int int28 = linkedList18.size();
        system.classfixer.classes.LinkedList linkedList29 = new system.classfixer.classes.LinkedList();
        linkedList29.clear();
        boolean boolean31 = linkedList29.repOK();
        boolean boolean32 = linkedList29.repOK();
        boolean boolean34 = linkedList29.remove((java.lang.Object) "");
        linkedList29.clear();
        boolean boolean36 = linkedList18.remove((java.lang.Object) linkedList29);
        linkedList18.clear();
        boolean boolean38 = linkedList12.remove((java.lang.Object) linkedList18);
        system.classfixer.classes.LinkedList linkedList39 = new system.classfixer.classes.LinkedList();
        int int40 = linkedList39.size();
        int int41 = linkedList39.size();
        boolean boolean42 = linkedList39.repOK();
        boolean boolean43 = linkedList18.remove((java.lang.Object) linkedList39);
        system.classfixer.classes.LinkedList linkedList44 = new system.classfixer.classes.LinkedList();
        int int45 = linkedList44.size();
        linkedList44.clear();
        int int47 = linkedList44.size();
        boolean boolean48 = linkedList44.repOK();
        int int49 = linkedList44.size();
        boolean boolean51 = linkedList44.remove((java.lang.Object) 0);
        boolean boolean53 = linkedList44.remove((java.lang.Object) 0);
        linkedList44.clear();
        linkedList44.clear();
        system.classfixer.classes.LinkedList linkedList56 = new system.classfixer.classes.LinkedList();
        linkedList56.clear();
        boolean boolean58 = linkedList56.repOK();
        system.classfixer.classes.LinkedList linkedList59 = new system.classfixer.classes.LinkedList();
        int int60 = linkedList59.size();
        linkedList59.clear();
        int int62 = linkedList59.size();
        boolean boolean63 = linkedList59.repOK();
        int int64 = linkedList59.size();
        boolean boolean66 = linkedList59.remove((java.lang.Object) 0);
        boolean boolean68 = linkedList59.remove((java.lang.Object) 0);
        int int69 = linkedList59.size();
        boolean boolean70 = linkedList59.repOK();
        int int71 = linkedList59.size();
        linkedList59.clear();
        boolean boolean73 = linkedList56.remove((java.lang.Object) linkedList59);
        boolean boolean74 = linkedList44.remove((java.lang.Object) boolean73);
        boolean boolean75 = linkedList18.remove((java.lang.Object) linkedList44);
        system.classfixer.classes.LinkedList linkedList76 = new system.classfixer.classes.LinkedList();
        int int77 = linkedList76.size();
        linkedList76.clear();
        int int79 = linkedList76.size();
        boolean boolean80 = linkedList76.repOK();
        int int81 = linkedList76.size();
        boolean boolean83 = linkedList76.remove((java.lang.Object) 0);
        boolean boolean85 = linkedList76.remove((java.lang.Object) 0);
        int int86 = linkedList76.size();
        boolean boolean87 = linkedList76.repOK();
        system.classfixer.classes.LinkedList linkedList88 = new system.classfixer.classes.LinkedList();
        int int89 = linkedList88.size();
        linkedList88.clear();
        boolean boolean91 = linkedList76.remove((java.lang.Object) linkedList88);
        boolean boolean92 = linkedList76.repOK();
        linkedList76.clear();
        linkedList76.clear();
        int int95 = linkedList76.size();
        int int96 = linkedList76.size();
        boolean boolean97 = linkedList44.add((java.lang.Object) int96);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList44", linkedList44.repOK_2());
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        boolean boolean1 = linkedList0.repOK();
        linkedList0.clear();
        int int3 = linkedList0.size();
        system.classfixer.classes.LinkedList linkedList4 = new system.classfixer.classes.LinkedList();
        int int5 = linkedList4.size();
        linkedList4.clear();
        int int7 = linkedList4.size();
        boolean boolean8 = linkedList4.repOK();
        int int9 = linkedList4.size();
        boolean boolean11 = linkedList4.remove((java.lang.Object) 0);
        boolean boolean13 = linkedList4.remove((java.lang.Object) 0);
        boolean boolean15 = linkedList4.remove((java.lang.Object) (-1.0f));
        boolean boolean16 = linkedList0.add((java.lang.Object) boolean15);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        boolean boolean11 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList12 = new system.classfixer.classes.LinkedList();
        int int13 = linkedList12.size();
        linkedList12.clear();
        boolean boolean15 = linkedList0.remove((java.lang.Object) linkedList12);
        boolean boolean16 = linkedList12.repOK();
        linkedList12.clear();
        system.classfixer.classes.LinkedList linkedList18 = new system.classfixer.classes.LinkedList();
        int int19 = linkedList18.size();
        linkedList18.clear();
        int int21 = linkedList18.size();
        boolean boolean22 = linkedList18.repOK();
        int int23 = linkedList18.size();
        boolean boolean25 = linkedList18.remove((java.lang.Object) 0);
        boolean boolean27 = linkedList18.remove((java.lang.Object) 0);
        int int28 = linkedList18.size();
        boolean boolean29 = linkedList18.repOK();
        system.classfixer.classes.LinkedList linkedList30 = new system.classfixer.classes.LinkedList();
        int int31 = linkedList30.size();
        linkedList30.clear();
        boolean boolean33 = linkedList18.remove((java.lang.Object) linkedList30);
        java.lang.Class<?> wildcardClass34 = linkedList30.getClass();
        boolean boolean35 = linkedList12.remove((java.lang.Object) linkedList30);
        int int36 = linkedList12.size();
        system.classfixer.classes.LinkedList linkedList37 = new system.classfixer.classes.LinkedList();
        int int38 = linkedList37.size();
        linkedList37.clear();
        int int40 = linkedList37.size();
        boolean boolean41 = linkedList37.repOK();
        int int42 = linkedList37.size();
        boolean boolean44 = linkedList37.remove((java.lang.Object) 0);
        boolean boolean46 = linkedList37.remove((java.lang.Object) 0);
        int int47 = linkedList37.size();
        boolean boolean48 = linkedList37.repOK();
        system.classfixer.classes.LinkedList linkedList49 = new system.classfixer.classes.LinkedList();
        int int50 = linkedList49.size();
        linkedList49.clear();
        boolean boolean52 = linkedList37.remove((java.lang.Object) linkedList49);
        boolean boolean53 = linkedList37.repOK();
        boolean boolean54 = linkedList12.remove((java.lang.Object) linkedList37);
        system.classfixer.classes.LinkedList linkedList55 = new system.classfixer.classes.LinkedList();
        int int56 = linkedList55.size();
        linkedList55.clear();
        boolean boolean59 = linkedList55.remove((java.lang.Object) (-1.0f));
        int int60 = linkedList55.size();
        int int61 = linkedList55.size();
        system.classfixer.classes.LinkedList linkedList62 = new system.classfixer.classes.LinkedList();
        int int63 = linkedList62.size();
        linkedList62.clear();
        int int65 = linkedList62.size();
        boolean boolean66 = linkedList62.repOK();
        int int67 = linkedList62.size();
        boolean boolean69 = linkedList62.remove((java.lang.Object) 0);
        boolean boolean71 = linkedList62.remove((java.lang.Object) 0);
        int int72 = linkedList62.size();
        boolean boolean73 = linkedList62.repOK();
        int int74 = linkedList62.size();
        int int75 = linkedList62.size();
        boolean boolean76 = linkedList55.remove((java.lang.Object) int75);
        boolean boolean77 = linkedList12.add((java.lang.Object) boolean76);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList12", linkedList12.repOK_2());
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean11 = linkedList0.remove((java.lang.Object) (-1.0f));
        system.classfixer.classes.LinkedList linkedList12 = new system.classfixer.classes.LinkedList();
        linkedList12.clear();
        boolean boolean14 = linkedList12.repOK();
        boolean boolean15 = linkedList12.repOK();
        boolean boolean17 = linkedList12.remove((java.lang.Object) "");
        linkedList12.clear();
        boolean boolean19 = linkedList0.remove((java.lang.Object) linkedList12);
        system.classfixer.classes.LinkedList linkedList20 = new system.classfixer.classes.LinkedList();
        linkedList20.clear();
        boolean boolean22 = linkedList20.repOK();
        boolean boolean23 = linkedList20.repOK();
        boolean boolean25 = linkedList20.remove((java.lang.Object) "");
        linkedList20.clear();
        int int27 = linkedList20.size();
        boolean boolean28 = linkedList12.add((java.lang.Object) int27);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList12", linkedList12.repOK_2());
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        linkedList0.clear();
        linkedList0.clear();
        system.classfixer.classes.LinkedList linkedList12 = new system.classfixer.classes.LinkedList();
        int int13 = linkedList12.size();
        linkedList12.clear();
        int int15 = linkedList12.size();
        boolean boolean16 = linkedList12.repOK();
        int int17 = linkedList12.size();
        boolean boolean19 = linkedList12.remove((java.lang.Object) 0);
        boolean boolean21 = linkedList12.remove((java.lang.Object) 0);
        int int22 = linkedList12.size();
        boolean boolean23 = linkedList12.repOK();
        system.classfixer.classes.LinkedList linkedList24 = new system.classfixer.classes.LinkedList();
        int int25 = linkedList24.size();
        linkedList24.clear();
        boolean boolean27 = linkedList12.remove((java.lang.Object) linkedList24);
        boolean boolean28 = linkedList12.repOK();
        linkedList12.clear();
        linkedList12.clear();
        int int31 = linkedList12.size();
        java.lang.Class<?> wildcardClass32 = linkedList12.getClass();
        boolean boolean33 = linkedList0.remove((java.lang.Object) wildcardClass32);
        system.classfixer.classes.LinkedList linkedList34 = new system.classfixer.classes.LinkedList();
        int int35 = linkedList34.size();
        linkedList34.clear();
        int int37 = linkedList34.size();
        boolean boolean38 = linkedList34.repOK();
        int int39 = linkedList34.size();
        boolean boolean41 = linkedList34.remove((java.lang.Object) 0);
        boolean boolean43 = linkedList34.remove((java.lang.Object) 0);
        int int44 = linkedList34.size();
        boolean boolean45 = linkedList34.repOK();
        int int46 = linkedList34.size();
        int int47 = linkedList34.size();
        system.classfixer.classes.LinkedList linkedList48 = new system.classfixer.classes.LinkedList();
        linkedList48.clear();
        boolean boolean50 = linkedList48.repOK();
        boolean boolean51 = linkedList48.repOK();
        boolean boolean52 = linkedList34.remove((java.lang.Object) linkedList48);
        boolean boolean53 = linkedList0.remove((java.lang.Object) boolean52);
        boolean boolean55 = linkedList0.add((java.lang.Object) 100.0d);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        boolean boolean11 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList12 = new system.classfixer.classes.LinkedList();
        int int13 = linkedList12.size();
        linkedList12.clear();
        boolean boolean15 = linkedList0.remove((java.lang.Object) linkedList12);
        boolean boolean16 = linkedList12.repOK();
        linkedList12.clear();
        system.classfixer.classes.LinkedList linkedList18 = new system.classfixer.classes.LinkedList();
        int int19 = linkedList18.size();
        linkedList18.clear();
        int int21 = linkedList18.size();
        boolean boolean22 = linkedList18.repOK();
        int int23 = linkedList18.size();
        boolean boolean25 = linkedList18.remove((java.lang.Object) 0);
        boolean boolean27 = linkedList18.remove((java.lang.Object) 0);
        int int28 = linkedList18.size();
        system.classfixer.classes.LinkedList linkedList29 = new system.classfixer.classes.LinkedList();
        linkedList29.clear();
        boolean boolean31 = linkedList29.repOK();
        boolean boolean32 = linkedList29.repOK();
        boolean boolean34 = linkedList29.remove((java.lang.Object) "");
        linkedList29.clear();
        boolean boolean36 = linkedList18.remove((java.lang.Object) linkedList29);
        linkedList18.clear();
        boolean boolean38 = linkedList12.remove((java.lang.Object) linkedList18);
        linkedList12.clear();
        int int40 = linkedList12.size();
        system.classfixer.classes.LinkedList linkedList41 = new system.classfixer.classes.LinkedList();
        linkedList41.clear();
        boolean boolean43 = linkedList41.repOK();
        system.classfixer.classes.LinkedList linkedList44 = new system.classfixer.classes.LinkedList();
        int int45 = linkedList44.size();
        linkedList44.clear();
        int int47 = linkedList44.size();
        boolean boolean48 = linkedList44.repOK();
        int int49 = linkedList44.size();
        boolean boolean51 = linkedList44.remove((java.lang.Object) 0);
        boolean boolean53 = linkedList44.remove((java.lang.Object) 0);
        int int54 = linkedList44.size();
        boolean boolean55 = linkedList44.repOK();
        int int56 = linkedList44.size();
        linkedList44.clear();
        boolean boolean58 = linkedList41.remove((java.lang.Object) linkedList44);
        boolean boolean60 = linkedList44.remove((java.lang.Object) 1);
        boolean boolean61 = linkedList12.add((java.lang.Object) boolean60);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList12", linkedList12.repOK_2());
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        linkedList0.clear();
        system.classfixer.classes.LinkedList linkedList2 = new system.classfixer.classes.LinkedList();
        int int3 = linkedList2.size();
        linkedList2.clear();
        int int5 = linkedList2.size();
        boolean boolean6 = linkedList2.repOK();
        int int7 = linkedList2.size();
        boolean boolean9 = linkedList2.remove((java.lang.Object) 0);
        boolean boolean11 = linkedList2.remove((java.lang.Object) 0);
        int int12 = linkedList2.size();
        boolean boolean13 = linkedList2.repOK();
        int int14 = linkedList2.size();
        boolean boolean15 = linkedList2.repOK();
        linkedList2.clear();
        boolean boolean17 = linkedList0.add((java.lang.Object) linkedList2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        boolean boolean11 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList12 = new system.classfixer.classes.LinkedList();
        int int13 = linkedList12.size();
        linkedList12.clear();
        boolean boolean15 = linkedList0.remove((java.lang.Object) linkedList12);
        boolean boolean16 = linkedList12.repOK();
        linkedList12.clear();
        system.classfixer.classes.LinkedList linkedList18 = new system.classfixer.classes.LinkedList();
        int int19 = linkedList18.size();
        linkedList18.clear();
        int int21 = linkedList18.size();
        boolean boolean22 = linkedList18.repOK();
        int int23 = linkedList18.size();
        boolean boolean25 = linkedList18.remove((java.lang.Object) 0);
        boolean boolean27 = linkedList18.remove((java.lang.Object) 0);
        int int28 = linkedList18.size();
        system.classfixer.classes.LinkedList linkedList29 = new system.classfixer.classes.LinkedList();
        linkedList29.clear();
        boolean boolean31 = linkedList29.repOK();
        boolean boolean32 = linkedList29.repOK();
        boolean boolean34 = linkedList29.remove((java.lang.Object) "");
        linkedList29.clear();
        boolean boolean36 = linkedList18.remove((java.lang.Object) linkedList29);
        linkedList18.clear();
        boolean boolean38 = linkedList12.remove((java.lang.Object) linkedList18);
        system.classfixer.classes.LinkedList linkedList39 = new system.classfixer.classes.LinkedList();
        int int40 = linkedList39.size();
        linkedList39.clear();
        linkedList39.clear();
        boolean boolean43 = linkedList39.repOK();
        system.classfixer.classes.LinkedList linkedList44 = new system.classfixer.classes.LinkedList();
        int int45 = linkedList44.size();
        linkedList44.clear();
        int int47 = linkedList44.size();
        boolean boolean48 = linkedList44.repOK();
        int int49 = linkedList44.size();
        boolean boolean51 = linkedList44.remove((java.lang.Object) 0);
        boolean boolean53 = linkedList44.remove((java.lang.Object) 0);
        int int54 = linkedList44.size();
        boolean boolean55 = linkedList44.repOK();
        system.classfixer.classes.LinkedList linkedList56 = new system.classfixer.classes.LinkedList();
        int int57 = linkedList56.size();
        linkedList56.clear();
        boolean boolean59 = linkedList44.remove((java.lang.Object) linkedList56);
        boolean boolean60 = linkedList56.repOK();
        linkedList56.clear();
        system.classfixer.classes.LinkedList linkedList62 = new system.classfixer.classes.LinkedList();
        int int63 = linkedList62.size();
        linkedList62.clear();
        int int65 = linkedList62.size();
        boolean boolean66 = linkedList62.repOK();
        int int67 = linkedList62.size();
        boolean boolean69 = linkedList62.remove((java.lang.Object) 0);
        boolean boolean71 = linkedList62.remove((java.lang.Object) 0);
        int int72 = linkedList62.size();
        system.classfixer.classes.LinkedList linkedList73 = new system.classfixer.classes.LinkedList();
        linkedList73.clear();
        boolean boolean75 = linkedList73.repOK();
        boolean boolean76 = linkedList73.repOK();
        boolean boolean78 = linkedList73.remove((java.lang.Object) "");
        linkedList73.clear();
        boolean boolean80 = linkedList62.remove((java.lang.Object) linkedList73);
        linkedList62.clear();
        boolean boolean82 = linkedList56.remove((java.lang.Object) linkedList62);
        boolean boolean83 = linkedList39.remove((java.lang.Object) linkedList56);
        boolean boolean84 = linkedList12.add((java.lang.Object) boolean83);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList12", linkedList12.repOK_2());
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        linkedList0.clear();
        boolean boolean2 = linkedList0.repOK();
        boolean boolean3 = linkedList0.repOK();
        boolean boolean5 = linkedList0.remove((java.lang.Object) "");
        system.classfixer.classes.LinkedList linkedList6 = new system.classfixer.classes.LinkedList();
        int int7 = linkedList6.size();
        linkedList6.clear();
        int int9 = linkedList6.size();
        boolean boolean10 = linkedList6.repOK();
        int int11 = linkedList6.size();
        boolean boolean13 = linkedList6.remove((java.lang.Object) 0);
        boolean boolean15 = linkedList6.remove((java.lang.Object) 0);
        int int16 = linkedList6.size();
        boolean boolean17 = linkedList6.repOK();
        system.classfixer.classes.LinkedList linkedList18 = new system.classfixer.classes.LinkedList();
        int int19 = linkedList18.size();
        linkedList18.clear();
        boolean boolean21 = linkedList6.remove((java.lang.Object) linkedList18);
        boolean boolean22 = linkedList18.repOK();
        linkedList18.clear();
        system.classfixer.classes.LinkedList linkedList24 = new system.classfixer.classes.LinkedList();
        int int25 = linkedList24.size();
        linkedList24.clear();
        int int27 = linkedList24.size();
        boolean boolean28 = linkedList24.repOK();
        int int29 = linkedList24.size();
        boolean boolean31 = linkedList24.remove((java.lang.Object) 0);
        boolean boolean33 = linkedList24.remove((java.lang.Object) 0);
        int int34 = linkedList24.size();
        system.classfixer.classes.LinkedList linkedList35 = new system.classfixer.classes.LinkedList();
        linkedList35.clear();
        boolean boolean37 = linkedList35.repOK();
        boolean boolean38 = linkedList35.repOK();
        boolean boolean40 = linkedList35.remove((java.lang.Object) "");
        linkedList35.clear();
        boolean boolean42 = linkedList24.remove((java.lang.Object) linkedList35);
        linkedList24.clear();
        boolean boolean44 = linkedList18.remove((java.lang.Object) linkedList24);
        system.classfixer.classes.LinkedList linkedList45 = new system.classfixer.classes.LinkedList();
        int int46 = linkedList45.size();
        int int47 = linkedList45.size();
        boolean boolean48 = linkedList45.repOK();
        boolean boolean49 = linkedList24.remove((java.lang.Object) linkedList45);
        system.classfixer.classes.LinkedList linkedList50 = new system.classfixer.classes.LinkedList();
        int int51 = linkedList50.size();
        linkedList50.clear();
        int int53 = linkedList50.size();
        boolean boolean54 = linkedList50.repOK();
        int int55 = linkedList50.size();
        boolean boolean57 = linkedList50.remove((java.lang.Object) 0);
        boolean boolean59 = linkedList50.remove((java.lang.Object) 0);
        int int60 = linkedList50.size();
        boolean boolean61 = linkedList50.repOK();
        system.classfixer.classes.LinkedList linkedList62 = new system.classfixer.classes.LinkedList();
        int int63 = linkedList62.size();
        linkedList62.clear();
        boolean boolean65 = linkedList50.remove((java.lang.Object) linkedList62);
        boolean boolean66 = linkedList62.repOK();
        linkedList62.clear();
        system.classfixer.classes.LinkedList linkedList68 = new system.classfixer.classes.LinkedList();
        int int69 = linkedList68.size();
        linkedList68.clear();
        int int71 = linkedList68.size();
        boolean boolean72 = linkedList68.repOK();
        int int73 = linkedList68.size();
        boolean boolean75 = linkedList68.remove((java.lang.Object) 0);
        boolean boolean77 = linkedList68.remove((java.lang.Object) 0);
        int int78 = linkedList68.size();
        system.classfixer.classes.LinkedList linkedList79 = new system.classfixer.classes.LinkedList();
        linkedList79.clear();
        boolean boolean81 = linkedList79.repOK();
        boolean boolean82 = linkedList79.repOK();
        boolean boolean84 = linkedList79.remove((java.lang.Object) "");
        linkedList79.clear();
        boolean boolean86 = linkedList68.remove((java.lang.Object) linkedList79);
        linkedList68.clear();
        boolean boolean88 = linkedList62.remove((java.lang.Object) linkedList68);
        boolean boolean89 = linkedList24.remove((java.lang.Object) linkedList62);
        boolean boolean90 = linkedList24.repOK();
        boolean boolean91 = linkedList0.add((java.lang.Object) linkedList24);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        int int11 = linkedList0.size();
        int int12 = linkedList0.size();
        system.classfixer.classes.LinkedList linkedList13 = new system.classfixer.classes.LinkedList();
        int int14 = linkedList13.size();
        linkedList13.clear();
        int int16 = linkedList13.size();
        boolean boolean17 = linkedList13.repOK();
        int int18 = linkedList13.size();
        boolean boolean20 = linkedList13.remove((java.lang.Object) 0);
        boolean boolean22 = linkedList13.remove((java.lang.Object) 0);
        int int23 = linkedList13.size();
        boolean boolean24 = linkedList13.repOK();
        system.classfixer.classes.LinkedList linkedList25 = new system.classfixer.classes.LinkedList();
        int int26 = linkedList25.size();
        linkedList25.clear();
        boolean boolean28 = linkedList13.remove((java.lang.Object) linkedList25);
        boolean boolean29 = linkedList25.repOK();
        linkedList25.clear();
        boolean boolean31 = linkedList0.add((java.lang.Object) linkedList25);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        boolean boolean11 = linkedList0.repOK();
        int int12 = linkedList0.size();
        boolean boolean13 = linkedList0.repOK();
        boolean boolean14 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList15 = new system.classfixer.classes.LinkedList();
        int int16 = linkedList15.size();
        linkedList15.clear();
        int int18 = linkedList15.size();
        boolean boolean19 = linkedList15.repOK();
        int int20 = linkedList15.size();
        boolean boolean22 = linkedList15.remove((java.lang.Object) 0);
        boolean boolean24 = linkedList15.remove((java.lang.Object) 0);
        int int25 = linkedList15.size();
        boolean boolean26 = linkedList15.repOK();
        system.classfixer.classes.LinkedList linkedList27 = new system.classfixer.classes.LinkedList();
        int int28 = linkedList27.size();
        linkedList27.clear();
        boolean boolean30 = linkedList15.remove((java.lang.Object) linkedList27);
        boolean boolean31 = linkedList15.repOK();
        linkedList15.clear();
        linkedList15.clear();
        int int34 = linkedList15.size();
        java.lang.Class<?> wildcardClass35 = linkedList15.getClass();
        boolean boolean36 = linkedList0.remove((java.lang.Object) wildcardClass35);
        linkedList0.clear();
        boolean boolean39 = linkedList0.remove((java.lang.Object) ' ');
        boolean boolean40 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList41 = new system.classfixer.classes.LinkedList();
        int int42 = linkedList41.size();
        linkedList41.clear();
        boolean boolean44 = linkedList41.repOK();
        linkedList41.clear();
        system.classfixer.classes.LinkedList linkedList46 = new system.classfixer.classes.LinkedList();
        linkedList46.clear();
        boolean boolean48 = linkedList46.repOK();
        boolean boolean49 = linkedList41.remove((java.lang.Object) linkedList46);
        linkedList41.clear();
        boolean boolean51 = linkedList0.remove((java.lang.Object) linkedList41);
        system.classfixer.classes.LinkedList linkedList52 = new system.classfixer.classes.LinkedList();
        int int53 = linkedList52.size();
        linkedList52.clear();
        int int55 = linkedList52.size();
        boolean boolean56 = linkedList52.repOK();
        int int57 = linkedList52.size();
        boolean boolean59 = linkedList52.remove((java.lang.Object) 0);
        boolean boolean61 = linkedList52.remove((java.lang.Object) 0);
        int int62 = linkedList52.size();
        boolean boolean63 = linkedList52.repOK();
        system.classfixer.classes.LinkedList linkedList64 = new system.classfixer.classes.LinkedList();
        int int65 = linkedList64.size();
        linkedList64.clear();
        boolean boolean67 = linkedList52.remove((java.lang.Object) linkedList64);
        boolean boolean68 = linkedList64.repOK();
        linkedList64.clear();
        system.classfixer.classes.LinkedList linkedList70 = new system.classfixer.classes.LinkedList();
        int int71 = linkedList70.size();
        linkedList70.clear();
        int int73 = linkedList70.size();
        boolean boolean74 = linkedList70.repOK();
        int int75 = linkedList70.size();
        boolean boolean77 = linkedList70.remove((java.lang.Object) 0);
        boolean boolean79 = linkedList70.remove((java.lang.Object) 0);
        int int80 = linkedList70.size();
        boolean boolean81 = linkedList70.repOK();
        system.classfixer.classes.LinkedList linkedList82 = new system.classfixer.classes.LinkedList();
        int int83 = linkedList82.size();
        linkedList82.clear();
        boolean boolean85 = linkedList70.remove((java.lang.Object) linkedList82);
        java.lang.Class<?> wildcardClass86 = linkedList82.getClass();
        boolean boolean87 = linkedList64.remove((java.lang.Object) linkedList82);
        boolean boolean88 = linkedList64.repOK();
        int int89 = linkedList64.size();
        boolean boolean90 = linkedList41.add((java.lang.Object) int89);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList41", linkedList41.repOK_2());
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        boolean boolean1 = linkedList0.repOK();
        linkedList0.clear();
        int int3 = linkedList0.size();
        system.classfixer.classes.LinkedList linkedList4 = new system.classfixer.classes.LinkedList();
        int int5 = linkedList4.size();
        linkedList4.clear();
        boolean boolean7 = linkedList4.repOK();
        int int8 = linkedList4.size();
        boolean boolean10 = linkedList4.remove((java.lang.Object) (short) 0);
        system.classfixer.classes.LinkedList linkedList11 = new system.classfixer.classes.LinkedList();
        int int12 = linkedList11.size();
        linkedList11.clear();
        int int14 = linkedList11.size();
        boolean boolean15 = linkedList11.repOK();
        int int16 = linkedList11.size();
        boolean boolean18 = linkedList11.remove((java.lang.Object) 0);
        boolean boolean20 = linkedList11.remove((java.lang.Object) 0);
        int int21 = linkedList11.size();
        system.classfixer.classes.LinkedList linkedList22 = new system.classfixer.classes.LinkedList();
        linkedList22.clear();
        boolean boolean24 = linkedList22.repOK();
        boolean boolean25 = linkedList22.repOK();
        boolean boolean27 = linkedList22.remove((java.lang.Object) "");
        linkedList22.clear();
        boolean boolean29 = linkedList11.remove((java.lang.Object) linkedList22);
        boolean boolean30 = linkedList4.remove((java.lang.Object) boolean29);
        system.classfixer.classes.LinkedList linkedList31 = new system.classfixer.classes.LinkedList();
        int int32 = linkedList31.size();
        linkedList31.clear();
        int int34 = linkedList31.size();
        boolean boolean35 = linkedList31.repOK();
        int int36 = linkedList31.size();
        boolean boolean38 = linkedList31.remove((java.lang.Object) 0);
        boolean boolean40 = linkedList31.remove((java.lang.Object) 0);
        int int41 = linkedList31.size();
        boolean boolean42 = linkedList31.repOK();
        system.classfixer.classes.LinkedList linkedList43 = new system.classfixer.classes.LinkedList();
        int int44 = linkedList43.size();
        linkedList43.clear();
        boolean boolean46 = linkedList31.remove((java.lang.Object) linkedList43);
        boolean boolean47 = linkedList4.remove((java.lang.Object) linkedList43);
        boolean boolean48 = linkedList0.add((java.lang.Object) linkedList4);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        boolean boolean11 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList12 = new system.classfixer.classes.LinkedList();
        int int13 = linkedList12.size();
        linkedList12.clear();
        boolean boolean15 = linkedList0.remove((java.lang.Object) linkedList12);
        boolean boolean16 = linkedList12.repOK();
        system.classfixer.classes.LinkedList linkedList17 = new system.classfixer.classes.LinkedList();
        int int18 = linkedList17.size();
        linkedList17.clear();
        boolean boolean20 = linkedList17.repOK();
        linkedList17.clear();
        system.classfixer.classes.LinkedList linkedList22 = new system.classfixer.classes.LinkedList();
        linkedList22.clear();
        boolean boolean24 = linkedList22.repOK();
        boolean boolean25 = linkedList17.remove((java.lang.Object) linkedList22);
        boolean boolean26 = linkedList12.add((java.lang.Object) boolean25);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList12", linkedList12.repOK_2());
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        boolean boolean11 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList12 = new system.classfixer.classes.LinkedList();
        int int13 = linkedList12.size();
        linkedList12.clear();
        boolean boolean15 = linkedList0.remove((java.lang.Object) linkedList12);
        int int16 = linkedList0.size();
        linkedList0.clear();
        boolean boolean19 = linkedList0.add((java.lang.Object) (-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        system.classfixer.classes.LinkedList linkedList6 = new system.classfixer.classes.LinkedList();
        int int7 = linkedList6.size();
        linkedList6.clear();
        int int9 = linkedList6.size();
        boolean boolean10 = linkedList6.repOK();
        int int11 = linkedList6.size();
        boolean boolean13 = linkedList6.remove((java.lang.Object) 0);
        boolean boolean15 = linkedList6.remove((java.lang.Object) 0);
        int int16 = linkedList6.size();
        boolean boolean17 = linkedList6.repOK();
        system.classfixer.classes.LinkedList linkedList18 = new system.classfixer.classes.LinkedList();
        int int19 = linkedList18.size();
        linkedList18.clear();
        boolean boolean21 = linkedList6.remove((java.lang.Object) linkedList18);
        boolean boolean22 = linkedList18.repOK();
        linkedList18.clear();
        system.classfixer.classes.LinkedList linkedList24 = new system.classfixer.classes.LinkedList();
        int int25 = linkedList24.size();
        linkedList24.clear();
        int int27 = linkedList24.size();
        boolean boolean28 = linkedList24.repOK();
        int int29 = linkedList24.size();
        boolean boolean31 = linkedList24.remove((java.lang.Object) 0);
        boolean boolean33 = linkedList24.remove((java.lang.Object) 0);
        int int34 = linkedList24.size();
        system.classfixer.classes.LinkedList linkedList35 = new system.classfixer.classes.LinkedList();
        linkedList35.clear();
        boolean boolean37 = linkedList35.repOK();
        boolean boolean38 = linkedList35.repOK();
        boolean boolean40 = linkedList35.remove((java.lang.Object) "");
        linkedList35.clear();
        boolean boolean42 = linkedList24.remove((java.lang.Object) linkedList35);
        linkedList24.clear();
        boolean boolean44 = linkedList18.remove((java.lang.Object) linkedList24);
        system.classfixer.classes.LinkedList linkedList45 = new system.classfixer.classes.LinkedList();
        int int46 = linkedList45.size();
        int int47 = linkedList45.size();
        boolean boolean48 = linkedList45.repOK();
        boolean boolean49 = linkedList24.remove((java.lang.Object) linkedList45);
        system.classfixer.classes.LinkedList linkedList50 = new system.classfixer.classes.LinkedList();
        int int51 = linkedList50.size();
        linkedList50.clear();
        int int53 = linkedList50.size();
        boolean boolean54 = linkedList50.repOK();
        int int55 = linkedList50.size();
        boolean boolean57 = linkedList50.remove((java.lang.Object) 0);
        boolean boolean59 = linkedList50.remove((java.lang.Object) 0);
        int int60 = linkedList50.size();
        boolean boolean61 = linkedList50.repOK();
        system.classfixer.classes.LinkedList linkedList62 = new system.classfixer.classes.LinkedList();
        int int63 = linkedList62.size();
        linkedList62.clear();
        boolean boolean65 = linkedList50.remove((java.lang.Object) linkedList62);
        boolean boolean66 = linkedList62.repOK();
        linkedList62.clear();
        system.classfixer.classes.LinkedList linkedList68 = new system.classfixer.classes.LinkedList();
        int int69 = linkedList68.size();
        linkedList68.clear();
        int int71 = linkedList68.size();
        boolean boolean72 = linkedList68.repOK();
        int int73 = linkedList68.size();
        boolean boolean75 = linkedList68.remove((java.lang.Object) 0);
        boolean boolean77 = linkedList68.remove((java.lang.Object) 0);
        int int78 = linkedList68.size();
        system.classfixer.classes.LinkedList linkedList79 = new system.classfixer.classes.LinkedList();
        linkedList79.clear();
        boolean boolean81 = linkedList79.repOK();
        boolean boolean82 = linkedList79.repOK();
        boolean boolean84 = linkedList79.remove((java.lang.Object) "");
        linkedList79.clear();
        boolean boolean86 = linkedList68.remove((java.lang.Object) linkedList79);
        linkedList68.clear();
        boolean boolean88 = linkedList62.remove((java.lang.Object) linkedList68);
        boolean boolean89 = linkedList24.remove((java.lang.Object) linkedList62);
        system.classfixer.classes.LinkedList linkedList90 = new system.classfixer.classes.LinkedList();
        linkedList90.clear();
        linkedList90.clear();
        linkedList90.clear();
        boolean boolean94 = linkedList24.remove((java.lang.Object) linkedList90);
        boolean boolean95 = linkedList24.repOK();
        boolean boolean96 = linkedList0.add((java.lang.Object) linkedList24);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        java.lang.Object obj6 = null;
        boolean boolean7 = linkedList0.add(obj6);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        boolean boolean11 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList12 = new system.classfixer.classes.LinkedList();
        int int13 = linkedList12.size();
        linkedList12.clear();
        boolean boolean15 = linkedList0.remove((java.lang.Object) linkedList12);
        boolean boolean16 = linkedList12.repOK();
        linkedList12.clear();
        system.classfixer.classes.LinkedList linkedList18 = new system.classfixer.classes.LinkedList();
        int int19 = linkedList18.size();
        linkedList18.clear();
        int int21 = linkedList18.size();
        boolean boolean22 = linkedList18.repOK();
        int int23 = linkedList18.size();
        boolean boolean25 = linkedList18.remove((java.lang.Object) 0);
        boolean boolean27 = linkedList18.remove((java.lang.Object) 0);
        int int28 = linkedList18.size();
        boolean boolean29 = linkedList18.repOK();
        system.classfixer.classes.LinkedList linkedList30 = new system.classfixer.classes.LinkedList();
        int int31 = linkedList30.size();
        linkedList30.clear();
        boolean boolean33 = linkedList18.remove((java.lang.Object) linkedList30);
        java.lang.Class<?> wildcardClass34 = linkedList30.getClass();
        boolean boolean35 = linkedList12.remove((java.lang.Object) linkedList30);
        system.classfixer.classes.LinkedList linkedList36 = new system.classfixer.classes.LinkedList();
        boolean boolean37 = linkedList36.repOK();
        int int38 = linkedList36.size();
        java.lang.Class<?> wildcardClass39 = linkedList36.getClass();
        boolean boolean40 = linkedList30.add((java.lang.Object) wildcardClass39);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList30", linkedList30.repOK_2());
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        boolean boolean11 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList12 = new system.classfixer.classes.LinkedList();
        int int13 = linkedList12.size();
        linkedList12.clear();
        boolean boolean15 = linkedList0.remove((java.lang.Object) linkedList12);
        boolean boolean16 = linkedList12.repOK();
        linkedList12.clear();
        system.classfixer.classes.LinkedList linkedList18 = new system.classfixer.classes.LinkedList();
        int int19 = linkedList18.size();
        linkedList18.clear();
        int int21 = linkedList18.size();
        boolean boolean22 = linkedList18.repOK();
        int int23 = linkedList18.size();
        boolean boolean25 = linkedList18.remove((java.lang.Object) 0);
        boolean boolean27 = linkedList18.remove((java.lang.Object) 0);
        int int28 = linkedList18.size();
        system.classfixer.classes.LinkedList linkedList29 = new system.classfixer.classes.LinkedList();
        linkedList29.clear();
        boolean boolean31 = linkedList29.repOK();
        boolean boolean32 = linkedList29.repOK();
        boolean boolean34 = linkedList29.remove((java.lang.Object) "");
        linkedList29.clear();
        boolean boolean36 = linkedList18.remove((java.lang.Object) linkedList29);
        linkedList18.clear();
        boolean boolean38 = linkedList12.remove((java.lang.Object) linkedList18);
        system.classfixer.classes.LinkedList linkedList39 = new system.classfixer.classes.LinkedList();
        int int40 = linkedList39.size();
        int int41 = linkedList39.size();
        boolean boolean42 = linkedList39.repOK();
        boolean boolean43 = linkedList18.remove((java.lang.Object) linkedList39);
        system.classfixer.classes.LinkedList linkedList44 = new system.classfixer.classes.LinkedList();
        int int45 = linkedList44.size();
        linkedList44.clear();
        int int47 = linkedList44.size();
        boolean boolean48 = linkedList44.repOK();
        int int49 = linkedList44.size();
        boolean boolean51 = linkedList44.remove((java.lang.Object) 0);
        boolean boolean53 = linkedList44.remove((java.lang.Object) 0);
        linkedList44.clear();
        linkedList44.clear();
        system.classfixer.classes.LinkedList linkedList56 = new system.classfixer.classes.LinkedList();
        linkedList56.clear();
        boolean boolean58 = linkedList56.repOK();
        system.classfixer.classes.LinkedList linkedList59 = new system.classfixer.classes.LinkedList();
        int int60 = linkedList59.size();
        linkedList59.clear();
        int int62 = linkedList59.size();
        boolean boolean63 = linkedList59.repOK();
        int int64 = linkedList59.size();
        boolean boolean66 = linkedList59.remove((java.lang.Object) 0);
        boolean boolean68 = linkedList59.remove((java.lang.Object) 0);
        int int69 = linkedList59.size();
        boolean boolean70 = linkedList59.repOK();
        int int71 = linkedList59.size();
        linkedList59.clear();
        boolean boolean73 = linkedList56.remove((java.lang.Object) linkedList59);
        boolean boolean74 = linkedList44.remove((java.lang.Object) boolean73);
        boolean boolean75 = linkedList18.remove((java.lang.Object) linkedList44);
        system.classfixer.classes.LinkedList linkedList76 = new system.classfixer.classes.LinkedList();
        int int77 = linkedList76.size();
        linkedList76.clear();
        int int79 = linkedList76.size();
        boolean boolean80 = linkedList76.repOK();
        int int81 = linkedList76.size();
        boolean boolean83 = linkedList76.remove((java.lang.Object) 0);
        boolean boolean85 = linkedList76.remove((java.lang.Object) 0);
        int int86 = linkedList76.size();
        boolean boolean87 = linkedList76.repOK();
        system.classfixer.classes.LinkedList linkedList88 = new system.classfixer.classes.LinkedList();
        int int89 = linkedList88.size();
        linkedList88.clear();
        boolean boolean91 = linkedList76.remove((java.lang.Object) linkedList88);
        boolean boolean92 = linkedList88.repOK();
        linkedList88.clear();
        boolean boolean94 = linkedList88.repOK();
        boolean boolean95 = linkedList44.add((java.lang.Object) linkedList88);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList44", linkedList44.repOK_2());
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        linkedList0.clear();
        boolean boolean2 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList3 = new system.classfixer.classes.LinkedList();
        int int4 = linkedList3.size();
        linkedList3.clear();
        int int6 = linkedList3.size();
        boolean boolean7 = linkedList3.repOK();
        int int8 = linkedList3.size();
        boolean boolean10 = linkedList3.remove((java.lang.Object) 0);
        boolean boolean12 = linkedList3.remove((java.lang.Object) 0);
        int int13 = linkedList3.size();
        boolean boolean14 = linkedList3.repOK();
        int int15 = linkedList3.size();
        linkedList3.clear();
        boolean boolean17 = linkedList0.remove((java.lang.Object) linkedList3);
        int int18 = linkedList0.size();
        system.classfixer.classes.LinkedList linkedList19 = new system.classfixer.classes.LinkedList();
        int int20 = linkedList19.size();
        linkedList19.clear();
        int int22 = linkedList19.size();
        boolean boolean23 = linkedList19.repOK();
        int int24 = linkedList19.size();
        boolean boolean26 = linkedList19.remove((java.lang.Object) 0);
        boolean boolean28 = linkedList19.remove((java.lang.Object) 0);
        int int29 = linkedList19.size();
        boolean boolean30 = linkedList19.repOK();
        system.classfixer.classes.LinkedList linkedList31 = new system.classfixer.classes.LinkedList();
        int int32 = linkedList31.size();
        linkedList31.clear();
        boolean boolean34 = linkedList19.remove((java.lang.Object) linkedList31);
        boolean boolean35 = linkedList31.repOK();
        boolean boolean36 = linkedList0.add((java.lang.Object) boolean35);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        boolean boolean11 = linkedList0.repOK();
        boolean boolean12 = linkedList0.repOK();
        boolean boolean13 = linkedList0.repOK();
        java.lang.Object obj14 = null;
        boolean boolean15 = linkedList0.add(obj14);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        boolean boolean1 = linkedList0.repOK();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList5 = new system.classfixer.classes.LinkedList();
        int int6 = linkedList5.size();
        boolean boolean7 = linkedList5.repOK();
        boolean boolean9 = linkedList5.remove((java.lang.Object) (short) 1);
        boolean boolean10 = linkedList0.add((java.lang.Object) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        boolean boolean3 = linkedList0.repOK();
        int int4 = linkedList0.size();
        boolean boolean6 = linkedList0.remove((java.lang.Object) (short) 0);
        system.classfixer.classes.LinkedList linkedList7 = new system.classfixer.classes.LinkedList();
        int int8 = linkedList7.size();
        linkedList7.clear();
        int int10 = linkedList7.size();
        boolean boolean11 = linkedList7.repOK();
        int int12 = linkedList7.size();
        boolean boolean14 = linkedList7.remove((java.lang.Object) 0);
        boolean boolean16 = linkedList7.remove((java.lang.Object) 0);
        int int17 = linkedList7.size();
        system.classfixer.classes.LinkedList linkedList18 = new system.classfixer.classes.LinkedList();
        linkedList18.clear();
        boolean boolean20 = linkedList18.repOK();
        boolean boolean21 = linkedList18.repOK();
        boolean boolean23 = linkedList18.remove((java.lang.Object) "");
        linkedList18.clear();
        boolean boolean25 = linkedList7.remove((java.lang.Object) linkedList18);
        boolean boolean26 = linkedList0.remove((java.lang.Object) boolean25);
        system.classfixer.classes.LinkedList linkedList27 = new system.classfixer.classes.LinkedList();
        int int28 = linkedList27.size();
        linkedList27.clear();
        int int30 = linkedList27.size();
        boolean boolean31 = linkedList27.repOK();
        int int32 = linkedList27.size();
        boolean boolean34 = linkedList27.remove((java.lang.Object) 0);
        boolean boolean36 = linkedList27.remove((java.lang.Object) 0);
        int int37 = linkedList27.size();
        boolean boolean38 = linkedList27.repOK();
        system.classfixer.classes.LinkedList linkedList39 = new system.classfixer.classes.LinkedList();
        int int40 = linkedList39.size();
        linkedList39.clear();
        boolean boolean42 = linkedList27.remove((java.lang.Object) linkedList39);
        boolean boolean43 = linkedList0.remove((java.lang.Object) linkedList39);
        system.classfixer.classes.LinkedList linkedList44 = new system.classfixer.classes.LinkedList();
        int int45 = linkedList44.size();
        int int46 = linkedList44.size();
        boolean boolean47 = linkedList44.repOK();
        boolean boolean48 = linkedList44.repOK();
        boolean boolean49 = linkedList39.add((java.lang.Object) boolean48);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList39", linkedList39.repOK_2());
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        boolean boolean3 = linkedList0.repOK();
        linkedList0.clear();
        system.classfixer.classes.LinkedList linkedList5 = new system.classfixer.classes.LinkedList();
        linkedList5.clear();
        boolean boolean7 = linkedList5.repOK();
        boolean boolean8 = linkedList0.remove((java.lang.Object) linkedList5);
        linkedList0.clear();
        boolean boolean10 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList11 = new system.classfixer.classes.LinkedList();
        int int12 = linkedList11.size();
        linkedList11.clear();
        int int14 = linkedList11.size();
        boolean boolean15 = linkedList11.repOK();
        int int16 = linkedList11.size();
        boolean boolean18 = linkedList11.remove((java.lang.Object) 0);
        boolean boolean20 = linkedList11.remove((java.lang.Object) 0);
        linkedList11.clear();
        linkedList11.clear();
        system.classfixer.classes.LinkedList linkedList23 = new system.classfixer.classes.LinkedList();
        linkedList23.clear();
        boolean boolean25 = linkedList23.repOK();
        system.classfixer.classes.LinkedList linkedList26 = new system.classfixer.classes.LinkedList();
        int int27 = linkedList26.size();
        linkedList26.clear();
        int int29 = linkedList26.size();
        boolean boolean30 = linkedList26.repOK();
        int int31 = linkedList26.size();
        boolean boolean33 = linkedList26.remove((java.lang.Object) 0);
        boolean boolean35 = linkedList26.remove((java.lang.Object) 0);
        int int36 = linkedList26.size();
        boolean boolean37 = linkedList26.repOK();
        int int38 = linkedList26.size();
        linkedList26.clear();
        boolean boolean40 = linkedList23.remove((java.lang.Object) linkedList26);
        boolean boolean41 = linkedList11.remove((java.lang.Object) boolean40);
        linkedList11.clear();
        system.classfixer.classes.LinkedList linkedList43 = new system.classfixer.classes.LinkedList();
        int int44 = linkedList43.size();
        linkedList43.clear();
        int int46 = linkedList43.size();
        boolean boolean47 = linkedList43.repOK();
        int int48 = linkedList43.size();
        boolean boolean50 = linkedList43.remove((java.lang.Object) 0);
        boolean boolean52 = linkedList43.remove((java.lang.Object) 0);
        int int53 = linkedList43.size();
        boolean boolean54 = linkedList43.repOK();
        int int55 = linkedList43.size();
        boolean boolean56 = linkedList43.repOK();
        boolean boolean57 = linkedList43.repOK();
        int int58 = linkedList43.size();
        boolean boolean59 = linkedList11.remove((java.lang.Object) int58);
        boolean boolean60 = linkedList0.add((java.lang.Object) boolean59);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        boolean boolean11 = linkedList0.repOK();
        int int12 = linkedList0.size();
        int int13 = linkedList0.size();
        boolean boolean14 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList15 = new system.classfixer.classes.LinkedList();
        linkedList15.clear();
        boolean boolean17 = linkedList15.repOK();
        int int18 = linkedList15.size();
        boolean boolean19 = linkedList0.add((java.lang.Object) int18);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        boolean boolean11 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList12 = new system.classfixer.classes.LinkedList();
        int int13 = linkedList12.size();
        linkedList12.clear();
        boolean boolean15 = linkedList0.remove((java.lang.Object) linkedList12);
        boolean boolean16 = linkedList12.repOK();
        linkedList12.clear();
        system.classfixer.classes.LinkedList linkedList18 = new system.classfixer.classes.LinkedList();
        int int19 = linkedList18.size();
        linkedList18.clear();
        int int21 = linkedList18.size();
        boolean boolean22 = linkedList18.repOK();
        int int23 = linkedList18.size();
        boolean boolean25 = linkedList18.remove((java.lang.Object) 0);
        boolean boolean27 = linkedList18.remove((java.lang.Object) 0);
        int int28 = linkedList18.size();
        system.classfixer.classes.LinkedList linkedList29 = new system.classfixer.classes.LinkedList();
        linkedList29.clear();
        boolean boolean31 = linkedList29.repOK();
        boolean boolean32 = linkedList29.repOK();
        boolean boolean34 = linkedList29.remove((java.lang.Object) "");
        linkedList29.clear();
        boolean boolean36 = linkedList18.remove((java.lang.Object) linkedList29);
        linkedList18.clear();
        boolean boolean38 = linkedList12.remove((java.lang.Object) linkedList18);
        int int39 = linkedList18.size();
        linkedList18.clear();
        system.classfixer.classes.LinkedList linkedList41 = new system.classfixer.classes.LinkedList();
        boolean boolean42 = linkedList18.add((java.lang.Object) linkedList41);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList18", linkedList18.repOK_2());
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        boolean boolean11 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList12 = new system.classfixer.classes.LinkedList();
        int int13 = linkedList12.size();
        linkedList12.clear();
        boolean boolean15 = linkedList0.remove((java.lang.Object) linkedList12);
        boolean boolean16 = linkedList12.repOK();
        linkedList12.clear();
        system.classfixer.classes.LinkedList linkedList18 = new system.classfixer.classes.LinkedList();
        int int19 = linkedList18.size();
        linkedList18.clear();
        int int21 = linkedList18.size();
        boolean boolean22 = linkedList18.repOK();
        int int23 = linkedList18.size();
        boolean boolean25 = linkedList18.remove((java.lang.Object) 0);
        boolean boolean27 = linkedList18.remove((java.lang.Object) 0);
        int int28 = linkedList18.size();
        system.classfixer.classes.LinkedList linkedList29 = new system.classfixer.classes.LinkedList();
        linkedList29.clear();
        boolean boolean31 = linkedList29.repOK();
        boolean boolean32 = linkedList29.repOK();
        boolean boolean34 = linkedList29.remove((java.lang.Object) "");
        linkedList29.clear();
        boolean boolean36 = linkedList18.remove((java.lang.Object) linkedList29);
        linkedList18.clear();
        boolean boolean38 = linkedList12.remove((java.lang.Object) linkedList18);
        system.classfixer.classes.LinkedList linkedList39 = new system.classfixer.classes.LinkedList();
        int int40 = linkedList39.size();
        int int41 = linkedList39.size();
        boolean boolean42 = linkedList39.repOK();
        boolean boolean43 = linkedList18.remove((java.lang.Object) linkedList39);
        system.classfixer.classes.LinkedList linkedList44 = new system.classfixer.classes.LinkedList();
        int int45 = linkedList44.size();
        linkedList44.clear();
        int int47 = linkedList44.size();
        boolean boolean48 = linkedList44.repOK();
        int int49 = linkedList44.size();
        boolean boolean51 = linkedList44.remove((java.lang.Object) 0);
        boolean boolean53 = linkedList44.remove((java.lang.Object) 0);
        int int54 = linkedList44.size();
        boolean boolean55 = linkedList44.repOK();
        system.classfixer.classes.LinkedList linkedList56 = new system.classfixer.classes.LinkedList();
        int int57 = linkedList56.size();
        linkedList56.clear();
        boolean boolean59 = linkedList44.remove((java.lang.Object) linkedList56);
        boolean boolean60 = linkedList56.repOK();
        linkedList56.clear();
        system.classfixer.classes.LinkedList linkedList62 = new system.classfixer.classes.LinkedList();
        int int63 = linkedList62.size();
        linkedList62.clear();
        int int65 = linkedList62.size();
        boolean boolean66 = linkedList62.repOK();
        int int67 = linkedList62.size();
        boolean boolean69 = linkedList62.remove((java.lang.Object) 0);
        boolean boolean71 = linkedList62.remove((java.lang.Object) 0);
        int int72 = linkedList62.size();
        system.classfixer.classes.LinkedList linkedList73 = new system.classfixer.classes.LinkedList();
        linkedList73.clear();
        boolean boolean75 = linkedList73.repOK();
        boolean boolean76 = linkedList73.repOK();
        boolean boolean78 = linkedList73.remove((java.lang.Object) "");
        linkedList73.clear();
        boolean boolean80 = linkedList62.remove((java.lang.Object) linkedList73);
        linkedList62.clear();
        boolean boolean82 = linkedList56.remove((java.lang.Object) linkedList62);
        boolean boolean83 = linkedList18.remove((java.lang.Object) linkedList56);
        boolean boolean84 = linkedList18.repOK();
        linkedList18.clear();
        java.lang.Object obj86 = null;
        boolean boolean87 = linkedList18.add(obj86);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList18", linkedList18.repOK_2());
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        boolean boolean3 = linkedList0.repOK();
        int int4 = linkedList0.size();
        boolean boolean6 = linkedList0.remove((java.lang.Object) (short) 0);
        system.classfixer.classes.LinkedList linkedList7 = new system.classfixer.classes.LinkedList();
        int int8 = linkedList7.size();
        linkedList7.clear();
        int int10 = linkedList7.size();
        boolean boolean11 = linkedList7.repOK();
        int int12 = linkedList7.size();
        boolean boolean14 = linkedList7.remove((java.lang.Object) 0);
        boolean boolean16 = linkedList7.remove((java.lang.Object) 0);
        int int17 = linkedList7.size();
        system.classfixer.classes.LinkedList linkedList18 = new system.classfixer.classes.LinkedList();
        linkedList18.clear();
        boolean boolean20 = linkedList18.repOK();
        boolean boolean21 = linkedList18.repOK();
        boolean boolean23 = linkedList18.remove((java.lang.Object) "");
        linkedList18.clear();
        boolean boolean25 = linkedList7.remove((java.lang.Object) linkedList18);
        boolean boolean26 = linkedList0.remove((java.lang.Object) boolean25);
        system.classfixer.classes.LinkedList linkedList27 = new system.classfixer.classes.LinkedList();
        boolean boolean28 = linkedList27.repOK();
        boolean boolean29 = linkedList27.repOK();
        int int30 = linkedList27.size();
        boolean boolean31 = linkedList27.repOK();
        boolean boolean32 = linkedList0.add((java.lang.Object) linkedList27);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        boolean boolean11 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList12 = new system.classfixer.classes.LinkedList();
        int int13 = linkedList12.size();
        linkedList12.clear();
        boolean boolean15 = linkedList0.remove((java.lang.Object) linkedList12);
        boolean boolean16 = linkedList12.repOK();
        linkedList12.clear();
        system.classfixer.classes.LinkedList linkedList18 = new system.classfixer.classes.LinkedList();
        int int19 = linkedList18.size();
        linkedList18.clear();
        int int21 = linkedList18.size();
        boolean boolean22 = linkedList18.repOK();
        int int23 = linkedList18.size();
        boolean boolean25 = linkedList18.remove((java.lang.Object) 0);
        boolean boolean27 = linkedList18.remove((java.lang.Object) 0);
        int int28 = linkedList18.size();
        system.classfixer.classes.LinkedList linkedList29 = new system.classfixer.classes.LinkedList();
        linkedList29.clear();
        boolean boolean31 = linkedList29.repOK();
        boolean boolean32 = linkedList29.repOK();
        boolean boolean34 = linkedList29.remove((java.lang.Object) "");
        linkedList29.clear();
        boolean boolean36 = linkedList18.remove((java.lang.Object) linkedList29);
        linkedList18.clear();
        boolean boolean38 = linkedList12.remove((java.lang.Object) linkedList18);
        int int39 = linkedList12.size();
        int int40 = linkedList12.size();
        system.classfixer.classes.LinkedList linkedList41 = new system.classfixer.classes.LinkedList();
        int int42 = linkedList41.size();
        linkedList41.clear();
        int int44 = linkedList41.size();
        boolean boolean45 = linkedList41.repOK();
        int int46 = linkedList41.size();
        boolean boolean48 = linkedList41.remove((java.lang.Object) 0);
        boolean boolean50 = linkedList41.remove((java.lang.Object) 0);
        int int51 = linkedList41.size();
        int int52 = linkedList41.size();
        int int53 = linkedList41.size();
        boolean boolean54 = linkedList12.add((java.lang.Object) int53);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList12", linkedList12.repOK_2());
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        boolean boolean3 = linkedList0.repOK();
        linkedList0.clear();
        int int5 = linkedList0.size();
        system.classfixer.classes.LinkedList linkedList6 = new system.classfixer.classes.LinkedList();
        int int7 = linkedList6.size();
        linkedList6.clear();
        int int9 = linkedList6.size();
        boolean boolean10 = linkedList6.repOK();
        int int11 = linkedList6.size();
        boolean boolean13 = linkedList6.remove((java.lang.Object) 0);
        boolean boolean15 = linkedList6.remove((java.lang.Object) 0);
        int int16 = linkedList6.size();
        system.classfixer.classes.LinkedList linkedList17 = new system.classfixer.classes.LinkedList();
        linkedList17.clear();
        boolean boolean19 = linkedList17.repOK();
        boolean boolean20 = linkedList17.repOK();
        boolean boolean22 = linkedList17.remove((java.lang.Object) "");
        linkedList17.clear();
        boolean boolean24 = linkedList6.remove((java.lang.Object) linkedList17);
        boolean boolean25 = linkedList0.remove((java.lang.Object) linkedList6);
        system.classfixer.classes.LinkedList linkedList26 = new system.classfixer.classes.LinkedList();
        int int27 = linkedList26.size();
        linkedList26.clear();
        int int29 = linkedList26.size();
        boolean boolean30 = linkedList26.repOK();
        boolean boolean31 = linkedList6.add((java.lang.Object) linkedList26);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList6", linkedList6.repOK_2());
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        boolean boolean11 = linkedList0.repOK();
        boolean boolean12 = linkedList0.repOK();
        boolean boolean13 = linkedList0.repOK();
        int int14 = linkedList0.size();
        boolean boolean16 = linkedList0.add((java.lang.Object) 0.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        boolean boolean3 = linkedList0.repOK();
        linkedList0.clear();
        linkedList0.clear();
        system.classfixer.classes.LinkedList linkedList6 = new system.classfixer.classes.LinkedList();
        int int7 = linkedList6.size();
        linkedList6.clear();
        int int9 = linkedList6.size();
        boolean boolean10 = linkedList6.repOK();
        int int11 = linkedList6.size();
        boolean boolean13 = linkedList6.remove((java.lang.Object) 0);
        boolean boolean15 = linkedList6.remove((java.lang.Object) 0);
        int int16 = linkedList6.size();
        boolean boolean17 = linkedList6.repOK();
        system.classfixer.classes.LinkedList linkedList18 = new system.classfixer.classes.LinkedList();
        int int19 = linkedList18.size();
        linkedList18.clear();
        boolean boolean21 = linkedList6.remove((java.lang.Object) linkedList18);
        boolean boolean22 = linkedList18.repOK();
        linkedList18.clear();
        system.classfixer.classes.LinkedList linkedList24 = new system.classfixer.classes.LinkedList();
        int int25 = linkedList24.size();
        linkedList24.clear();
        int int27 = linkedList24.size();
        boolean boolean28 = linkedList24.repOK();
        int int29 = linkedList24.size();
        boolean boolean31 = linkedList24.remove((java.lang.Object) 0);
        boolean boolean33 = linkedList24.remove((java.lang.Object) 0);
        int int34 = linkedList24.size();
        system.classfixer.classes.LinkedList linkedList35 = new system.classfixer.classes.LinkedList();
        linkedList35.clear();
        boolean boolean37 = linkedList35.repOK();
        boolean boolean38 = linkedList35.repOK();
        boolean boolean40 = linkedList35.remove((java.lang.Object) "");
        linkedList35.clear();
        boolean boolean42 = linkedList24.remove((java.lang.Object) linkedList35);
        linkedList24.clear();
        boolean boolean44 = linkedList18.remove((java.lang.Object) linkedList24);
        system.classfixer.classes.LinkedList linkedList45 = new system.classfixer.classes.LinkedList();
        int int46 = linkedList45.size();
        int int47 = linkedList45.size();
        boolean boolean48 = linkedList45.repOK();
        boolean boolean49 = linkedList24.remove((java.lang.Object) linkedList45);
        boolean boolean51 = linkedList24.remove((java.lang.Object) 0.0d);
        boolean boolean52 = linkedList0.add((java.lang.Object) 0.0d);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean11 = linkedList0.remove((java.lang.Object) (short) -1);
        boolean boolean12 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList13 = new system.classfixer.classes.LinkedList();
        int int14 = linkedList13.size();
        boolean boolean15 = linkedList13.repOK();
        boolean boolean17 = linkedList13.remove((java.lang.Object) (short) 1);
        boolean boolean18 = linkedList0.remove((java.lang.Object) linkedList13);
        system.classfixer.classes.LinkedList linkedList19 = new system.classfixer.classes.LinkedList();
        int int20 = linkedList19.size();
        linkedList19.clear();
        int int22 = linkedList19.size();
        boolean boolean23 = linkedList19.repOK();
        int int24 = linkedList19.size();
        boolean boolean26 = linkedList19.remove((java.lang.Object) 0);
        boolean boolean28 = linkedList19.remove((java.lang.Object) 0);
        boolean boolean30 = linkedList19.remove((java.lang.Object) (short) -1);
        boolean boolean31 = linkedList19.repOK();
        system.classfixer.classes.LinkedList linkedList32 = new system.classfixer.classes.LinkedList();
        int int33 = linkedList32.size();
        boolean boolean34 = linkedList32.repOK();
        boolean boolean36 = linkedList32.remove((java.lang.Object) (short) 1);
        boolean boolean37 = linkedList19.remove((java.lang.Object) linkedList32);
        boolean boolean38 = linkedList0.remove((java.lang.Object) linkedList19);
        int int39 = linkedList0.size();
        int int40 = linkedList0.size();
        system.classfixer.classes.LinkedList linkedList41 = new system.classfixer.classes.LinkedList();
        int int42 = linkedList41.size();
        int int43 = linkedList41.size();
        boolean boolean44 = linkedList41.repOK();
        boolean boolean45 = linkedList41.repOK();
        boolean boolean46 = linkedList0.add((java.lang.Object) boolean45);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        boolean boolean11 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList12 = new system.classfixer.classes.LinkedList();
        int int13 = linkedList12.size();
        linkedList12.clear();
        boolean boolean15 = linkedList0.remove((java.lang.Object) linkedList12);
        boolean boolean16 = linkedList12.repOK();
        linkedList12.clear();
        system.classfixer.classes.LinkedList linkedList18 = new system.classfixer.classes.LinkedList();
        int int19 = linkedList18.size();
        linkedList18.clear();
        int int21 = linkedList18.size();
        boolean boolean22 = linkedList18.repOK();
        int int23 = linkedList18.size();
        boolean boolean25 = linkedList18.remove((java.lang.Object) 0);
        boolean boolean27 = linkedList18.remove((java.lang.Object) 0);
        int int28 = linkedList18.size();
        system.classfixer.classes.LinkedList linkedList29 = new system.classfixer.classes.LinkedList();
        linkedList29.clear();
        boolean boolean31 = linkedList29.repOK();
        boolean boolean32 = linkedList29.repOK();
        boolean boolean34 = linkedList29.remove((java.lang.Object) "");
        linkedList29.clear();
        boolean boolean36 = linkedList18.remove((java.lang.Object) linkedList29);
        linkedList18.clear();
        boolean boolean38 = linkedList12.remove((java.lang.Object) linkedList18);
        int int39 = linkedList12.size();
        int int40 = linkedList12.size();
        boolean boolean41 = linkedList12.repOK();
        system.classfixer.classes.LinkedList linkedList42 = new system.classfixer.classes.LinkedList();
        int int43 = linkedList42.size();
        linkedList42.clear();
        int int45 = linkedList42.size();
        boolean boolean46 = linkedList42.repOK();
        int int47 = linkedList42.size();
        boolean boolean49 = linkedList42.remove((java.lang.Object) 0);
        boolean boolean51 = linkedList42.remove((java.lang.Object) 0);
        int int52 = linkedList42.size();
        boolean boolean53 = linkedList42.repOK();
        system.classfixer.classes.LinkedList linkedList54 = new system.classfixer.classes.LinkedList();
        int int55 = linkedList54.size();
        linkedList54.clear();
        boolean boolean57 = linkedList42.remove((java.lang.Object) linkedList54);
        boolean boolean58 = linkedList54.repOK();
        linkedList54.clear();
        system.classfixer.classes.LinkedList linkedList60 = new system.classfixer.classes.LinkedList();
        int int61 = linkedList60.size();
        linkedList60.clear();
        int int63 = linkedList60.size();
        boolean boolean64 = linkedList60.repOK();
        int int65 = linkedList60.size();
        boolean boolean67 = linkedList60.remove((java.lang.Object) 0);
        boolean boolean69 = linkedList60.remove((java.lang.Object) 0);
        int int70 = linkedList60.size();
        system.classfixer.classes.LinkedList linkedList71 = new system.classfixer.classes.LinkedList();
        linkedList71.clear();
        boolean boolean73 = linkedList71.repOK();
        boolean boolean74 = linkedList71.repOK();
        boolean boolean76 = linkedList71.remove((java.lang.Object) "");
        linkedList71.clear();
        boolean boolean78 = linkedList60.remove((java.lang.Object) linkedList71);
        linkedList60.clear();
        boolean boolean80 = linkedList54.remove((java.lang.Object) linkedList60);
        system.classfixer.classes.LinkedList linkedList81 = new system.classfixer.classes.LinkedList();
        int int82 = linkedList81.size();
        int int83 = linkedList81.size();
        boolean boolean84 = linkedList81.repOK();
        boolean boolean85 = linkedList60.remove((java.lang.Object) linkedList81);
        linkedList60.clear();
        boolean boolean87 = linkedList12.add((java.lang.Object) linkedList60);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList12", linkedList12.repOK_2());
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        boolean boolean11 = linkedList0.repOK();
        int int12 = linkedList0.size();
        boolean boolean13 = linkedList0.repOK();
        boolean boolean14 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList15 = new system.classfixer.classes.LinkedList();
        int int16 = linkedList15.size();
        linkedList15.clear();
        int int18 = linkedList15.size();
        boolean boolean19 = linkedList15.repOK();
        int int20 = linkedList15.size();
        boolean boolean22 = linkedList15.remove((java.lang.Object) 0);
        boolean boolean24 = linkedList15.remove((java.lang.Object) 0);
        int int25 = linkedList15.size();
        boolean boolean26 = linkedList15.repOK();
        system.classfixer.classes.LinkedList linkedList27 = new system.classfixer.classes.LinkedList();
        int int28 = linkedList27.size();
        linkedList27.clear();
        boolean boolean30 = linkedList15.remove((java.lang.Object) linkedList27);
        boolean boolean31 = linkedList15.repOK();
        linkedList15.clear();
        linkedList15.clear();
        int int34 = linkedList15.size();
        java.lang.Class<?> wildcardClass35 = linkedList15.getClass();
        boolean boolean36 = linkedList0.remove((java.lang.Object) wildcardClass35);
        linkedList0.clear();
        boolean boolean39 = linkedList0.remove((java.lang.Object) ' ');
        boolean boolean40 = linkedList0.repOK();
        int int41 = linkedList0.size();
        linkedList0.clear();
        system.classfixer.classes.LinkedList linkedList43 = new system.classfixer.classes.LinkedList();
        int int44 = linkedList43.size();
        linkedList43.clear();
        int int46 = linkedList43.size();
        boolean boolean47 = linkedList43.repOK();
        int int48 = linkedList43.size();
        boolean boolean50 = linkedList43.remove((java.lang.Object) 0);
        boolean boolean52 = linkedList43.remove((java.lang.Object) 0);
        int int53 = linkedList43.size();
        boolean boolean54 = linkedList43.repOK();
        system.classfixer.classes.LinkedList linkedList55 = new system.classfixer.classes.LinkedList();
        int int56 = linkedList55.size();
        linkedList55.clear();
        boolean boolean58 = linkedList43.remove((java.lang.Object) linkedList55);
        boolean boolean59 = linkedList55.repOK();
        linkedList55.clear();
        system.classfixer.classes.LinkedList linkedList61 = new system.classfixer.classes.LinkedList();
        int int62 = linkedList61.size();
        linkedList61.clear();
        int int64 = linkedList61.size();
        boolean boolean65 = linkedList61.repOK();
        int int66 = linkedList61.size();
        boolean boolean68 = linkedList61.remove((java.lang.Object) 0);
        boolean boolean70 = linkedList61.remove((java.lang.Object) 0);
        int int71 = linkedList61.size();
        system.classfixer.classes.LinkedList linkedList72 = new system.classfixer.classes.LinkedList();
        linkedList72.clear();
        boolean boolean74 = linkedList72.repOK();
        boolean boolean75 = linkedList72.repOK();
        boolean boolean77 = linkedList72.remove((java.lang.Object) "");
        linkedList72.clear();
        boolean boolean79 = linkedList61.remove((java.lang.Object) linkedList72);
        linkedList61.clear();
        boolean boolean81 = linkedList55.remove((java.lang.Object) linkedList61);
        linkedList55.clear();
        int int83 = linkedList55.size();
        boolean boolean84 = linkedList0.add((java.lang.Object) linkedList55);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        linkedList0.clear();
        boolean boolean12 = linkedList0.remove((java.lang.Object) 100);
        system.classfixer.classes.LinkedList linkedList13 = new system.classfixer.classes.LinkedList();
        int int14 = linkedList13.size();
        linkedList13.clear();
        int int16 = linkedList13.size();
        boolean boolean17 = linkedList13.repOK();
        int int18 = linkedList13.size();
        boolean boolean20 = linkedList13.remove((java.lang.Object) 0);
        boolean boolean22 = linkedList13.remove((java.lang.Object) 0);
        int int23 = linkedList13.size();
        boolean boolean24 = linkedList13.repOK();
        system.classfixer.classes.LinkedList linkedList25 = new system.classfixer.classes.LinkedList();
        int int26 = linkedList25.size();
        linkedList25.clear();
        boolean boolean28 = linkedList13.remove((java.lang.Object) linkedList25);
        boolean boolean29 = linkedList25.repOK();
        linkedList25.clear();
        system.classfixer.classes.LinkedList linkedList31 = new system.classfixer.classes.LinkedList();
        int int32 = linkedList31.size();
        linkedList31.clear();
        int int34 = linkedList31.size();
        boolean boolean35 = linkedList31.repOK();
        int int36 = linkedList31.size();
        boolean boolean38 = linkedList31.remove((java.lang.Object) 0);
        boolean boolean40 = linkedList31.remove((java.lang.Object) 0);
        int int41 = linkedList31.size();
        system.classfixer.classes.LinkedList linkedList42 = new system.classfixer.classes.LinkedList();
        linkedList42.clear();
        boolean boolean44 = linkedList42.repOK();
        boolean boolean45 = linkedList42.repOK();
        boolean boolean47 = linkedList42.remove((java.lang.Object) "");
        linkedList42.clear();
        boolean boolean49 = linkedList31.remove((java.lang.Object) linkedList42);
        linkedList31.clear();
        boolean boolean51 = linkedList25.remove((java.lang.Object) linkedList31);
        system.classfixer.classes.LinkedList linkedList52 = new system.classfixer.classes.LinkedList();
        int int53 = linkedList52.size();
        int int54 = linkedList52.size();
        boolean boolean55 = linkedList52.repOK();
        boolean boolean56 = linkedList31.remove((java.lang.Object) linkedList52);
        system.classfixer.classes.LinkedList linkedList57 = new system.classfixer.classes.LinkedList();
        int int58 = linkedList57.size();
        linkedList57.clear();
        int int60 = linkedList57.size();
        boolean boolean61 = linkedList57.repOK();
        int int62 = linkedList57.size();
        boolean boolean64 = linkedList57.remove((java.lang.Object) 0);
        boolean boolean66 = linkedList57.remove((java.lang.Object) 0);
        linkedList57.clear();
        linkedList57.clear();
        system.classfixer.classes.LinkedList linkedList69 = new system.classfixer.classes.LinkedList();
        linkedList69.clear();
        boolean boolean71 = linkedList69.repOK();
        system.classfixer.classes.LinkedList linkedList72 = new system.classfixer.classes.LinkedList();
        int int73 = linkedList72.size();
        linkedList72.clear();
        int int75 = linkedList72.size();
        boolean boolean76 = linkedList72.repOK();
        int int77 = linkedList72.size();
        boolean boolean79 = linkedList72.remove((java.lang.Object) 0);
        boolean boolean81 = linkedList72.remove((java.lang.Object) 0);
        int int82 = linkedList72.size();
        boolean boolean83 = linkedList72.repOK();
        int int84 = linkedList72.size();
        linkedList72.clear();
        boolean boolean86 = linkedList69.remove((java.lang.Object) linkedList72);
        boolean boolean87 = linkedList57.remove((java.lang.Object) boolean86);
        boolean boolean88 = linkedList31.remove((java.lang.Object) linkedList57);
        linkedList57.clear();
        boolean boolean90 = linkedList0.add((java.lang.Object) linkedList57);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        system.classfixer.classes.LinkedList linkedList11 = new system.classfixer.classes.LinkedList();
        linkedList11.clear();
        boolean boolean13 = linkedList11.repOK();
        boolean boolean14 = linkedList11.repOK();
        boolean boolean16 = linkedList11.remove((java.lang.Object) "");
        linkedList11.clear();
        boolean boolean18 = linkedList0.remove((java.lang.Object) linkedList11);
        boolean boolean20 = linkedList11.remove((java.lang.Object) (byte) -1);
        boolean boolean21 = linkedList11.repOK();
        system.classfixer.classes.LinkedList linkedList22 = new system.classfixer.classes.LinkedList();
        int int23 = linkedList22.size();
        java.lang.Class<?> wildcardClass24 = linkedList22.getClass();
        boolean boolean25 = linkedList11.add((java.lang.Object) linkedList22);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList11", linkedList11.repOK_2());
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        boolean boolean11 = linkedList0.repOK();
        int int12 = linkedList0.size();
        boolean boolean13 = linkedList0.repOK();
        boolean boolean14 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList15 = new system.classfixer.classes.LinkedList();
        int int16 = linkedList15.size();
        linkedList15.clear();
        int int18 = linkedList15.size();
        boolean boolean19 = linkedList15.repOK();
        int int20 = linkedList15.size();
        boolean boolean22 = linkedList15.remove((java.lang.Object) 0);
        boolean boolean24 = linkedList15.remove((java.lang.Object) 0);
        int int25 = linkedList15.size();
        boolean boolean26 = linkedList15.repOK();
        system.classfixer.classes.LinkedList linkedList27 = new system.classfixer.classes.LinkedList();
        int int28 = linkedList27.size();
        linkedList27.clear();
        boolean boolean30 = linkedList15.remove((java.lang.Object) linkedList27);
        boolean boolean31 = linkedList15.repOK();
        linkedList15.clear();
        linkedList15.clear();
        int int34 = linkedList15.size();
        java.lang.Class<?> wildcardClass35 = linkedList15.getClass();
        boolean boolean36 = linkedList0.remove((java.lang.Object) wildcardClass35);
        linkedList0.clear();
        boolean boolean39 = linkedList0.remove((java.lang.Object) ' ');
        boolean boolean40 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList41 = new system.classfixer.classes.LinkedList();
        int int42 = linkedList41.size();
        linkedList41.clear();
        boolean boolean44 = linkedList41.repOK();
        linkedList41.clear();
        system.classfixer.classes.LinkedList linkedList46 = new system.classfixer.classes.LinkedList();
        linkedList46.clear();
        boolean boolean48 = linkedList46.repOK();
        boolean boolean49 = linkedList41.remove((java.lang.Object) linkedList46);
        linkedList41.clear();
        boolean boolean51 = linkedList0.remove((java.lang.Object) linkedList41);
        system.classfixer.classes.LinkedList linkedList52 = new system.classfixer.classes.LinkedList();
        int int53 = linkedList52.size();
        linkedList52.clear();
        int int55 = linkedList52.size();
        boolean boolean56 = linkedList52.repOK();
        int int57 = linkedList52.size();
        boolean boolean59 = linkedList52.remove((java.lang.Object) 0);
        boolean boolean61 = linkedList52.remove((java.lang.Object) 0);
        int int62 = linkedList52.size();
        boolean boolean63 = linkedList0.add((java.lang.Object) int62);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        boolean boolean11 = linkedList0.repOK();
        boolean boolean12 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList13 = new system.classfixer.classes.LinkedList();
        linkedList13.clear();
        boolean boolean15 = linkedList13.repOK();
        system.classfixer.classes.LinkedList linkedList16 = new system.classfixer.classes.LinkedList();
        int int17 = linkedList16.size();
        linkedList16.clear();
        int int19 = linkedList16.size();
        boolean boolean20 = linkedList16.repOK();
        int int21 = linkedList16.size();
        boolean boolean23 = linkedList16.remove((java.lang.Object) 0);
        boolean boolean25 = linkedList16.remove((java.lang.Object) 0);
        int int26 = linkedList16.size();
        boolean boolean27 = linkedList16.repOK();
        int int28 = linkedList16.size();
        linkedList16.clear();
        boolean boolean30 = linkedList13.remove((java.lang.Object) linkedList16);
        boolean boolean31 = linkedList0.add((java.lang.Object) boolean30);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        linkedList0.clear();
        boolean boolean12 = linkedList0.remove((java.lang.Object) 100);
        int int13 = linkedList0.size();
        system.classfixer.classes.LinkedList linkedList14 = new system.classfixer.classes.LinkedList();
        int int15 = linkedList14.size();
        linkedList14.clear();
        int int17 = linkedList14.size();
        boolean boolean18 = linkedList14.repOK();
        int int19 = linkedList14.size();
        boolean boolean21 = linkedList14.remove((java.lang.Object) 0);
        boolean boolean23 = linkedList14.remove((java.lang.Object) 0);
        int int24 = linkedList14.size();
        boolean boolean25 = linkedList14.repOK();
        int int26 = linkedList14.size();
        boolean boolean27 = linkedList14.repOK();
        boolean boolean28 = linkedList14.repOK();
        boolean boolean29 = linkedList0.remove((java.lang.Object) boolean28);
        system.classfixer.classes.LinkedList linkedList30 = new system.classfixer.classes.LinkedList();
        int int31 = linkedList30.size();
        linkedList30.clear();
        int int33 = linkedList30.size();
        boolean boolean34 = linkedList30.repOK();
        int int35 = linkedList30.size();
        boolean boolean37 = linkedList30.remove((java.lang.Object) 0);
        boolean boolean39 = linkedList30.remove((java.lang.Object) 0);
        int int40 = linkedList30.size();
        boolean boolean41 = linkedList30.repOK();
        int int42 = linkedList30.size();
        boolean boolean43 = linkedList30.repOK();
        boolean boolean44 = linkedList30.repOK();
        system.classfixer.classes.LinkedList linkedList45 = new system.classfixer.classes.LinkedList();
        int int46 = linkedList45.size();
        linkedList45.clear();
        int int48 = linkedList45.size();
        boolean boolean49 = linkedList45.repOK();
        int int50 = linkedList45.size();
        boolean boolean52 = linkedList45.remove((java.lang.Object) 0);
        boolean boolean54 = linkedList45.remove((java.lang.Object) 0);
        int int55 = linkedList45.size();
        boolean boolean56 = linkedList45.repOK();
        system.classfixer.classes.LinkedList linkedList57 = new system.classfixer.classes.LinkedList();
        int int58 = linkedList57.size();
        linkedList57.clear();
        boolean boolean60 = linkedList45.remove((java.lang.Object) linkedList57);
        boolean boolean61 = linkedList45.repOK();
        linkedList45.clear();
        linkedList45.clear();
        int int64 = linkedList45.size();
        java.lang.Class<?> wildcardClass65 = linkedList45.getClass();
        boolean boolean66 = linkedList30.remove((java.lang.Object) wildcardClass65);
        linkedList30.clear();
        boolean boolean69 = linkedList30.remove((java.lang.Object) ' ');
        boolean boolean70 = linkedList30.repOK();
        system.classfixer.classes.LinkedList linkedList71 = new system.classfixer.classes.LinkedList();
        int int72 = linkedList71.size();
        linkedList71.clear();
        boolean boolean74 = linkedList71.repOK();
        linkedList71.clear();
        system.classfixer.classes.LinkedList linkedList76 = new system.classfixer.classes.LinkedList();
        linkedList76.clear();
        boolean boolean78 = linkedList76.repOK();
        boolean boolean79 = linkedList71.remove((java.lang.Object) linkedList76);
        linkedList71.clear();
        boolean boolean81 = linkedList30.remove((java.lang.Object) linkedList71);
        boolean boolean82 = linkedList0.add((java.lang.Object) boolean81);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean11 = linkedList0.remove((java.lang.Object) (-1.0f));
        system.classfixer.classes.LinkedList linkedList12 = new system.classfixer.classes.LinkedList();
        linkedList12.clear();
        boolean boolean14 = linkedList12.repOK();
        boolean boolean15 = linkedList12.repOK();
        boolean boolean17 = linkedList12.remove((java.lang.Object) "");
        linkedList12.clear();
        boolean boolean19 = linkedList0.remove((java.lang.Object) linkedList12);
        system.classfixer.classes.LinkedList linkedList20 = new system.classfixer.classes.LinkedList();
        int int21 = linkedList20.size();
        int int22 = linkedList20.size();
        boolean boolean23 = linkedList12.remove((java.lang.Object) linkedList20);
        boolean boolean25 = linkedList20.add((java.lang.Object) (-1.0f));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList20", linkedList20.repOK_2());
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        boolean boolean11 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList12 = new system.classfixer.classes.LinkedList();
        int int13 = linkedList12.size();
        linkedList12.clear();
        boolean boolean15 = linkedList0.remove((java.lang.Object) linkedList12);
        boolean boolean16 = linkedList12.repOK();
        linkedList12.clear();
        system.classfixer.classes.LinkedList linkedList18 = new system.classfixer.classes.LinkedList();
        int int19 = linkedList18.size();
        linkedList18.clear();
        int int21 = linkedList18.size();
        boolean boolean22 = linkedList18.repOK();
        int int23 = linkedList18.size();
        boolean boolean25 = linkedList18.remove((java.lang.Object) 0);
        boolean boolean27 = linkedList18.remove((java.lang.Object) 0);
        boolean boolean29 = linkedList18.remove((java.lang.Object) (byte) 0);
        boolean boolean30 = linkedList12.add((java.lang.Object) linkedList18);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList12", linkedList12.repOK_2());
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean11 = linkedList0.remove((java.lang.Object) (short) -1);
        boolean boolean12 = linkedList0.repOK();
        linkedList0.clear();
        linkedList0.clear();
        system.classfixer.classes.LinkedList linkedList15 = new system.classfixer.classes.LinkedList();
        int int16 = linkedList15.size();
        linkedList15.clear();
        int int18 = linkedList15.size();
        boolean boolean19 = linkedList15.repOK();
        int int20 = linkedList15.size();
        boolean boolean22 = linkedList15.remove((java.lang.Object) 0);
        boolean boolean24 = linkedList15.remove((java.lang.Object) 0);
        linkedList15.clear();
        boolean boolean27 = linkedList15.remove((java.lang.Object) 100);
        int int28 = linkedList15.size();
        system.classfixer.classes.LinkedList linkedList29 = new system.classfixer.classes.LinkedList();
        int int30 = linkedList29.size();
        boolean boolean31 = linkedList15.remove((java.lang.Object) int30);
        boolean boolean32 = linkedList0.remove((java.lang.Object) linkedList15);
        system.classfixer.classes.LinkedList linkedList33 = new system.classfixer.classes.LinkedList();
        int int34 = linkedList33.size();
        int int35 = linkedList33.size();
        boolean boolean37 = linkedList33.remove((java.lang.Object) 0);
        java.lang.Class<?> wildcardClass38 = linkedList33.getClass();
        boolean boolean39 = linkedList15.add((java.lang.Object) wildcardClass38);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList15", linkedList15.repOK_2());
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean11 = linkedList0.remove((java.lang.Object) (short) -1);
        boolean boolean12 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList13 = new system.classfixer.classes.LinkedList();
        int int14 = linkedList13.size();
        linkedList13.clear();
        int int16 = linkedList13.size();
        boolean boolean17 = linkedList13.repOK();
        int int18 = linkedList13.size();
        boolean boolean20 = linkedList13.remove((java.lang.Object) 0);
        boolean boolean21 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean22 = linkedList0.repOK();
        boolean boolean23 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList24 = new system.classfixer.classes.LinkedList();
        linkedList24.clear();
        boolean boolean26 = linkedList24.repOK();
        boolean boolean27 = linkedList24.repOK();
        boolean boolean29 = linkedList24.remove((java.lang.Object) '#');
        int int30 = linkedList24.size();
        java.lang.Class<?> wildcardClass31 = linkedList24.getClass();
        boolean boolean32 = linkedList0.add((java.lang.Object) wildcardClass31);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean11 = linkedList0.remove((java.lang.Object) (byte) 0);
        boolean boolean12 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList13 = new system.classfixer.classes.LinkedList();
        int int14 = linkedList13.size();
        linkedList13.clear();
        int int16 = linkedList13.size();
        boolean boolean17 = linkedList13.repOK();
        int int18 = linkedList13.size();
        boolean boolean20 = linkedList13.remove((java.lang.Object) 0);
        boolean boolean22 = linkedList13.remove((java.lang.Object) 0);
        int int23 = linkedList13.size();
        boolean boolean24 = linkedList13.repOK();
        system.classfixer.classes.LinkedList linkedList25 = new system.classfixer.classes.LinkedList();
        int int26 = linkedList25.size();
        linkedList25.clear();
        boolean boolean28 = linkedList13.remove((java.lang.Object) linkedList25);
        boolean boolean29 = linkedList13.repOK();
        linkedList13.clear();
        linkedList13.clear();
        int int32 = linkedList13.size();
        int int33 = linkedList13.size();
        int int34 = linkedList13.size();
        boolean boolean35 = linkedList0.add((java.lang.Object) int34);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        boolean boolean2 = linkedList0.remove((java.lang.Object) 1L);
        system.classfixer.classes.LinkedList linkedList3 = new system.classfixer.classes.LinkedList();
        int int4 = linkedList3.size();
        linkedList3.clear();
        int int6 = linkedList3.size();
        boolean boolean7 = linkedList3.repOK();
        int int8 = linkedList3.size();
        boolean boolean10 = linkedList3.remove((java.lang.Object) 0);
        boolean boolean12 = linkedList3.remove((java.lang.Object) 0);
        int int13 = linkedList3.size();
        boolean boolean14 = linkedList3.repOK();
        system.classfixer.classes.LinkedList linkedList15 = new system.classfixer.classes.LinkedList();
        int int16 = linkedList15.size();
        linkedList15.clear();
        boolean boolean18 = linkedList3.remove((java.lang.Object) linkedList15);
        boolean boolean19 = linkedList15.repOK();
        boolean boolean20 = linkedList15.repOK();
        boolean boolean22 = linkedList15.remove((java.lang.Object) (-1.0d));
        int int23 = linkedList15.size();
        java.lang.Class<?> wildcardClass24 = linkedList15.getClass();
        boolean boolean25 = linkedList0.add((java.lang.Object) wildcardClass24);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        boolean boolean11 = linkedList0.repOK();
        boolean boolean12 = linkedList0.repOK();
        boolean boolean13 = linkedList0.repOK();
        int int14 = linkedList0.size();
        system.classfixer.classes.LinkedList linkedList15 = new system.classfixer.classes.LinkedList();
        int int16 = linkedList15.size();
        linkedList15.clear();
        boolean boolean18 = linkedList15.repOK();
        int int19 = linkedList15.size();
        boolean boolean21 = linkedList15.remove((java.lang.Object) (short) 0);
        boolean boolean22 = linkedList15.repOK();
        boolean boolean23 = linkedList0.add((java.lang.Object) boolean22);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean11 = linkedList0.remove((java.lang.Object) (short) -1);
        boolean boolean12 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList13 = new system.classfixer.classes.LinkedList();
        int int14 = linkedList13.size();
        boolean boolean15 = linkedList13.repOK();
        boolean boolean17 = linkedList13.remove((java.lang.Object) (short) 1);
        boolean boolean18 = linkedList0.remove((java.lang.Object) linkedList13);
        system.classfixer.classes.LinkedList linkedList19 = new system.classfixer.classes.LinkedList();
        int int20 = linkedList19.size();
        linkedList19.clear();
        int int22 = linkedList19.size();
        boolean boolean23 = linkedList19.repOK();
        int int24 = linkedList19.size();
        boolean boolean26 = linkedList19.remove((java.lang.Object) 0);
        boolean boolean28 = linkedList19.remove((java.lang.Object) 0);
        boolean boolean30 = linkedList19.remove((java.lang.Object) (short) -1);
        boolean boolean31 = linkedList19.repOK();
        system.classfixer.classes.LinkedList linkedList32 = new system.classfixer.classes.LinkedList();
        int int33 = linkedList32.size();
        boolean boolean34 = linkedList32.repOK();
        boolean boolean36 = linkedList32.remove((java.lang.Object) (short) 1);
        boolean boolean37 = linkedList19.remove((java.lang.Object) linkedList32);
        boolean boolean38 = linkedList0.remove((java.lang.Object) linkedList19);
        boolean boolean39 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList40 = new system.classfixer.classes.LinkedList();
        int int41 = linkedList40.size();
        linkedList40.clear();
        int int43 = linkedList40.size();
        boolean boolean44 = linkedList40.repOK();
        int int45 = linkedList40.size();
        boolean boolean47 = linkedList40.remove((java.lang.Object) 0);
        boolean boolean49 = linkedList40.remove((java.lang.Object) 0);
        linkedList40.clear();
        boolean boolean52 = linkedList40.remove((java.lang.Object) 100);
        int int53 = linkedList40.size();
        system.classfixer.classes.LinkedList linkedList54 = new system.classfixer.classes.LinkedList();
        int int55 = linkedList54.size();
        linkedList54.clear();
        int int57 = linkedList54.size();
        boolean boolean58 = linkedList54.repOK();
        int int59 = linkedList54.size();
        boolean boolean61 = linkedList54.remove((java.lang.Object) 0);
        boolean boolean63 = linkedList54.remove((java.lang.Object) 0);
        int int64 = linkedList54.size();
        boolean boolean65 = linkedList54.repOK();
        int int66 = linkedList54.size();
        boolean boolean67 = linkedList54.repOK();
        boolean boolean68 = linkedList54.repOK();
        boolean boolean69 = linkedList40.remove((java.lang.Object) boolean68);
        boolean boolean71 = linkedList40.remove((java.lang.Object) 100L);
        boolean boolean72 = linkedList0.remove((java.lang.Object) linkedList40);
        system.classfixer.classes.LinkedList linkedList73 = new system.classfixer.classes.LinkedList();
        int int74 = linkedList73.size();
        linkedList73.clear();
        boolean boolean76 = linkedList73.repOK();
        linkedList73.clear();
        int int78 = linkedList73.size();
        int int79 = linkedList73.size();
        int int80 = linkedList73.size();
        boolean boolean81 = linkedList40.add((java.lang.Object) int80);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList40", linkedList40.repOK_2());
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        boolean boolean5 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList6 = new system.classfixer.classes.LinkedList();
        boolean boolean7 = linkedList6.repOK();
        boolean boolean8 = linkedList6.repOK();
        system.classfixer.classes.LinkedList linkedList9 = new system.classfixer.classes.LinkedList();
        int int10 = linkedList9.size();
        linkedList9.clear();
        int int12 = linkedList9.size();
        boolean boolean13 = linkedList9.repOK();
        int int14 = linkedList9.size();
        boolean boolean16 = linkedList9.remove((java.lang.Object) 0);
        boolean boolean18 = linkedList9.remove((java.lang.Object) 0);
        linkedList9.clear();
        linkedList9.clear();
        system.classfixer.classes.LinkedList linkedList21 = new system.classfixer.classes.LinkedList();
        int int22 = linkedList21.size();
        linkedList21.clear();
        int int24 = linkedList21.size();
        boolean boolean25 = linkedList21.repOK();
        int int26 = linkedList21.size();
        boolean boolean28 = linkedList21.remove((java.lang.Object) 0);
        boolean boolean30 = linkedList21.remove((java.lang.Object) 0);
        int int31 = linkedList21.size();
        boolean boolean32 = linkedList21.repOK();
        system.classfixer.classes.LinkedList linkedList33 = new system.classfixer.classes.LinkedList();
        int int34 = linkedList33.size();
        linkedList33.clear();
        boolean boolean36 = linkedList21.remove((java.lang.Object) linkedList33);
        boolean boolean37 = linkedList21.repOK();
        linkedList21.clear();
        linkedList21.clear();
        int int40 = linkedList21.size();
        java.lang.Class<?> wildcardClass41 = linkedList21.getClass();
        boolean boolean42 = linkedList9.remove((java.lang.Object) wildcardClass41);
        boolean boolean43 = linkedList6.remove((java.lang.Object) linkedList9);
        system.classfixer.classes.LinkedList linkedList44 = new system.classfixer.classes.LinkedList();
        boolean boolean45 = linkedList44.repOK();
        linkedList44.clear();
        int int47 = linkedList44.size();
        boolean boolean48 = linkedList6.remove((java.lang.Object) linkedList44);
        linkedList6.clear();
        boolean boolean50 = linkedList0.add((java.lang.Object) linkedList6);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        boolean boolean1 = linkedList0.repOK();
        boolean boolean2 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList3 = new system.classfixer.classes.LinkedList();
        int int4 = linkedList3.size();
        linkedList3.clear();
        boolean boolean7 = linkedList3.remove((java.lang.Object) (-1.0f));
        int int8 = linkedList3.size();
        boolean boolean9 = linkedList0.remove((java.lang.Object) linkedList3);
        system.classfixer.classes.LinkedList linkedList10 = new system.classfixer.classes.LinkedList();
        int int11 = linkedList10.size();
        linkedList10.clear();
        int int13 = linkedList10.size();
        boolean boolean14 = linkedList10.repOK();
        int int15 = linkedList10.size();
        boolean boolean17 = linkedList10.remove((java.lang.Object) 0);
        boolean boolean19 = linkedList10.remove((java.lang.Object) 0);
        linkedList10.clear();
        linkedList10.clear();
        system.classfixer.classes.LinkedList linkedList22 = new system.classfixer.classes.LinkedList();
        int int23 = linkedList22.size();
        linkedList22.clear();
        int int25 = linkedList22.size();
        boolean boolean26 = linkedList22.repOK();
        int int27 = linkedList22.size();
        boolean boolean29 = linkedList22.remove((java.lang.Object) 0);
        boolean boolean31 = linkedList22.remove((java.lang.Object) 0);
        int int32 = linkedList22.size();
        boolean boolean33 = linkedList22.repOK();
        system.classfixer.classes.LinkedList linkedList34 = new system.classfixer.classes.LinkedList();
        int int35 = linkedList34.size();
        linkedList34.clear();
        boolean boolean37 = linkedList22.remove((java.lang.Object) linkedList34);
        boolean boolean38 = linkedList22.repOK();
        linkedList22.clear();
        linkedList22.clear();
        int int41 = linkedList22.size();
        java.lang.Class<?> wildcardClass42 = linkedList22.getClass();
        boolean boolean43 = linkedList10.remove((java.lang.Object) wildcardClass42);
        system.classfixer.classes.LinkedList linkedList44 = new system.classfixer.classes.LinkedList();
        int int45 = linkedList44.size();
        linkedList44.clear();
        int int47 = linkedList44.size();
        boolean boolean48 = linkedList44.repOK();
        int int49 = linkedList44.size();
        boolean boolean51 = linkedList44.remove((java.lang.Object) 0);
        boolean boolean53 = linkedList44.remove((java.lang.Object) 0);
        int int54 = linkedList44.size();
        boolean boolean55 = linkedList44.repOK();
        int int56 = linkedList44.size();
        int int57 = linkedList44.size();
        system.classfixer.classes.LinkedList linkedList58 = new system.classfixer.classes.LinkedList();
        linkedList58.clear();
        boolean boolean60 = linkedList58.repOK();
        boolean boolean61 = linkedList58.repOK();
        boolean boolean62 = linkedList44.remove((java.lang.Object) linkedList58);
        boolean boolean63 = linkedList10.remove((java.lang.Object) boolean62);
        system.classfixer.classes.LinkedList linkedList64 = new system.classfixer.classes.LinkedList();
        int int65 = linkedList64.size();
        linkedList64.clear();
        int int67 = linkedList64.size();
        boolean boolean68 = linkedList64.repOK();
        int int69 = linkedList64.size();
        boolean boolean71 = linkedList64.remove((java.lang.Object) 0);
        boolean boolean73 = linkedList64.remove((java.lang.Object) 0);
        int int74 = linkedList64.size();
        boolean boolean75 = linkedList64.repOK();
        system.classfixer.classes.LinkedList linkedList76 = new system.classfixer.classes.LinkedList();
        int int77 = linkedList76.size();
        linkedList76.clear();
        boolean boolean79 = linkedList64.remove((java.lang.Object) linkedList76);
        int int80 = linkedList64.size();
        int int81 = linkedList64.size();
        boolean boolean82 = linkedList10.remove((java.lang.Object) int81);
        system.classfixer.classes.LinkedList linkedList83 = new system.classfixer.classes.LinkedList();
        int int84 = linkedList83.size();
        linkedList83.clear();
        boolean boolean86 = linkedList83.repOK();
        linkedList83.clear();
        boolean boolean89 = linkedList83.remove((java.lang.Object) "");
        boolean boolean90 = linkedList10.remove((java.lang.Object) linkedList83);
        boolean boolean91 = linkedList0.add((java.lang.Object) linkedList83);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        boolean boolean11 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList12 = new system.classfixer.classes.LinkedList();
        int int13 = linkedList12.size();
        linkedList12.clear();
        boolean boolean15 = linkedList0.remove((java.lang.Object) linkedList12);
        boolean boolean16 = linkedList12.repOK();
        linkedList12.clear();
        system.classfixer.classes.LinkedList linkedList18 = new system.classfixer.classes.LinkedList();
        int int19 = linkedList18.size();
        linkedList18.clear();
        int int21 = linkedList18.size();
        boolean boolean22 = linkedList18.repOK();
        int int23 = linkedList18.size();
        boolean boolean25 = linkedList18.remove((java.lang.Object) 0);
        boolean boolean27 = linkedList18.remove((java.lang.Object) 0);
        int int28 = linkedList18.size();
        boolean boolean29 = linkedList18.repOK();
        system.classfixer.classes.LinkedList linkedList30 = new system.classfixer.classes.LinkedList();
        int int31 = linkedList30.size();
        linkedList30.clear();
        boolean boolean33 = linkedList18.remove((java.lang.Object) linkedList30);
        java.lang.Class<?> wildcardClass34 = linkedList30.getClass();
        boolean boolean35 = linkedList12.remove((java.lang.Object) linkedList30);
        int int36 = linkedList12.size();
        system.classfixer.classes.LinkedList linkedList37 = new system.classfixer.classes.LinkedList();
        int int38 = linkedList37.size();
        linkedList37.clear();
        int int40 = linkedList37.size();
        boolean boolean41 = linkedList37.repOK();
        int int42 = linkedList37.size();
        boolean boolean44 = linkedList37.remove((java.lang.Object) 0);
        boolean boolean46 = linkedList37.remove((java.lang.Object) 0);
        int int47 = linkedList37.size();
        boolean boolean48 = linkedList37.repOK();
        system.classfixer.classes.LinkedList linkedList49 = new system.classfixer.classes.LinkedList();
        int int50 = linkedList49.size();
        linkedList49.clear();
        boolean boolean52 = linkedList37.remove((java.lang.Object) linkedList49);
        boolean boolean53 = linkedList37.repOK();
        boolean boolean54 = linkedList12.remove((java.lang.Object) linkedList37);
        linkedList37.clear();
        system.classfixer.classes.LinkedList linkedList56 = new system.classfixer.classes.LinkedList();
        int int57 = linkedList56.size();
        linkedList56.clear();
        int int59 = linkedList56.size();
        boolean boolean60 = linkedList56.repOK();
        int int61 = linkedList56.size();
        boolean boolean63 = linkedList56.remove((java.lang.Object) 0);
        boolean boolean65 = linkedList56.remove((java.lang.Object) 0);
        int int66 = linkedList56.size();
        boolean boolean67 = linkedList56.repOK();
        int int68 = linkedList56.size();
        boolean boolean69 = linkedList56.repOK();
        int int70 = linkedList56.size();
        boolean boolean71 = linkedList37.add((java.lang.Object) linkedList56);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList37", linkedList37.repOK_2());
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        system.classfixer.classes.LinkedList linkedList11 = new system.classfixer.classes.LinkedList();
        linkedList11.clear();
        boolean boolean13 = linkedList11.repOK();
        boolean boolean14 = linkedList11.repOK();
        boolean boolean16 = linkedList11.remove((java.lang.Object) "");
        linkedList11.clear();
        boolean boolean18 = linkedList0.remove((java.lang.Object) linkedList11);
        system.classfixer.classes.LinkedList linkedList19 = new system.classfixer.classes.LinkedList();
        int int20 = linkedList19.size();
        linkedList19.clear();
        int int22 = linkedList19.size();
        boolean boolean23 = linkedList19.repOK();
        int int24 = linkedList19.size();
        boolean boolean26 = linkedList19.remove((java.lang.Object) 0);
        boolean boolean28 = linkedList19.remove((java.lang.Object) 0);
        int int29 = linkedList19.size();
        boolean boolean30 = linkedList19.repOK();
        system.classfixer.classes.LinkedList linkedList31 = new system.classfixer.classes.LinkedList();
        int int32 = linkedList31.size();
        linkedList31.clear();
        boolean boolean34 = linkedList19.remove((java.lang.Object) linkedList31);
        boolean boolean35 = linkedList19.repOK();
        linkedList19.clear();
        linkedList19.clear();
        int int38 = linkedList19.size();
        int int39 = linkedList19.size();
        int int40 = linkedList19.size();
        boolean boolean41 = linkedList0.remove((java.lang.Object) linkedList19);
        int int42 = linkedList19.size();
        system.classfixer.classes.LinkedList linkedList43 = new system.classfixer.classes.LinkedList();
        int int44 = linkedList43.size();
        linkedList43.clear();
        int int46 = linkedList43.size();
        boolean boolean47 = linkedList43.repOK();
        int int48 = linkedList43.size();
        boolean boolean50 = linkedList43.remove((java.lang.Object) 0);
        boolean boolean52 = linkedList43.remove((java.lang.Object) 0);
        boolean boolean54 = linkedList43.remove((java.lang.Object) (short) -1);
        boolean boolean55 = linkedList43.repOK();
        system.classfixer.classes.LinkedList linkedList56 = new system.classfixer.classes.LinkedList();
        int int57 = linkedList56.size();
        linkedList56.clear();
        int int59 = linkedList56.size();
        boolean boolean60 = linkedList56.repOK();
        int int61 = linkedList56.size();
        boolean boolean63 = linkedList56.remove((java.lang.Object) 0);
        boolean boolean64 = linkedList43.remove((java.lang.Object) 0);
        boolean boolean65 = linkedList43.repOK();
        boolean boolean66 = linkedList43.repOK();
        boolean boolean67 = linkedList19.add((java.lang.Object) linkedList43);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList19", linkedList19.repOK_2());
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        int int4 = linkedList0.size();
        system.classfixer.classes.LinkedList linkedList5 = new system.classfixer.classes.LinkedList();
        int int6 = linkedList5.size();
        linkedList5.clear();
        int int8 = linkedList5.size();
        boolean boolean9 = linkedList5.repOK();
        int int10 = linkedList5.size();
        boolean boolean12 = linkedList5.remove((java.lang.Object) 0);
        boolean boolean13 = linkedList5.repOK();
        boolean boolean14 = linkedList0.add((java.lang.Object) boolean13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        system.classfixer.classes.LinkedList linkedList4 = new system.classfixer.classes.LinkedList();
        int int5 = linkedList4.size();
        linkedList4.clear();
        int int7 = linkedList4.size();
        boolean boolean8 = linkedList4.repOK();
        int int9 = linkedList4.size();
        boolean boolean11 = linkedList4.remove((java.lang.Object) 0);
        boolean boolean13 = linkedList4.remove((java.lang.Object) 0);
        int int14 = linkedList4.size();
        boolean boolean15 = linkedList4.repOK();
        system.classfixer.classes.LinkedList linkedList16 = new system.classfixer.classes.LinkedList();
        int int17 = linkedList16.size();
        linkedList16.clear();
        boolean boolean19 = linkedList4.remove((java.lang.Object) linkedList16);
        boolean boolean20 = linkedList16.repOK();
        linkedList16.clear();
        system.classfixer.classes.LinkedList linkedList22 = new system.classfixer.classes.LinkedList();
        int int23 = linkedList22.size();
        linkedList22.clear();
        int int25 = linkedList22.size();
        boolean boolean26 = linkedList22.repOK();
        int int27 = linkedList22.size();
        boolean boolean29 = linkedList22.remove((java.lang.Object) 0);
        boolean boolean31 = linkedList22.remove((java.lang.Object) 0);
        int int32 = linkedList22.size();
        boolean boolean33 = linkedList22.repOK();
        system.classfixer.classes.LinkedList linkedList34 = new system.classfixer.classes.LinkedList();
        int int35 = linkedList34.size();
        linkedList34.clear();
        boolean boolean37 = linkedList22.remove((java.lang.Object) linkedList34);
        java.lang.Class<?> wildcardClass38 = linkedList34.getClass();
        boolean boolean39 = linkedList16.remove((java.lang.Object) linkedList34);
        boolean boolean40 = linkedList16.repOK();
        system.classfixer.classes.LinkedList linkedList41 = new system.classfixer.classes.LinkedList();
        linkedList41.clear();
        boolean boolean43 = linkedList41.repOK();
        boolean boolean44 = linkedList41.repOK();
        boolean boolean46 = linkedList41.remove((java.lang.Object) "");
        boolean boolean47 = linkedList16.remove((java.lang.Object) linkedList41);
        boolean boolean48 = linkedList0.add((java.lang.Object) linkedList41);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        boolean boolean5 = linkedList0.repOK();
        linkedList0.clear();
        system.classfixer.classes.LinkedList linkedList7 = new system.classfixer.classes.LinkedList();
        int int8 = linkedList7.size();
        linkedList7.clear();
        boolean boolean10 = linkedList7.repOK();
        int int11 = linkedList7.size();
        boolean boolean13 = linkedList7.remove((java.lang.Object) (short) 0);
        system.classfixer.classes.LinkedList linkedList14 = new system.classfixer.classes.LinkedList();
        int int15 = linkedList14.size();
        linkedList14.clear();
        int int17 = linkedList14.size();
        boolean boolean18 = linkedList14.repOK();
        int int19 = linkedList14.size();
        boolean boolean21 = linkedList14.remove((java.lang.Object) 0);
        boolean boolean23 = linkedList14.remove((java.lang.Object) 0);
        int int24 = linkedList14.size();
        system.classfixer.classes.LinkedList linkedList25 = new system.classfixer.classes.LinkedList();
        linkedList25.clear();
        boolean boolean27 = linkedList25.repOK();
        boolean boolean28 = linkedList25.repOK();
        boolean boolean30 = linkedList25.remove((java.lang.Object) "");
        linkedList25.clear();
        boolean boolean32 = linkedList14.remove((java.lang.Object) linkedList25);
        boolean boolean33 = linkedList7.remove((java.lang.Object) boolean32);
        system.classfixer.classes.LinkedList linkedList34 = new system.classfixer.classes.LinkedList();
        int int35 = linkedList34.size();
        linkedList34.clear();
        int int37 = linkedList34.size();
        boolean boolean38 = linkedList34.repOK();
        int int39 = linkedList34.size();
        boolean boolean41 = linkedList34.remove((java.lang.Object) 0);
        boolean boolean43 = linkedList34.remove((java.lang.Object) 0);
        int int44 = linkedList34.size();
        boolean boolean45 = linkedList34.repOK();
        system.classfixer.classes.LinkedList linkedList46 = new system.classfixer.classes.LinkedList();
        int int47 = linkedList46.size();
        linkedList46.clear();
        boolean boolean49 = linkedList34.remove((java.lang.Object) linkedList46);
        boolean boolean50 = linkedList7.remove((java.lang.Object) linkedList46);
        boolean boolean51 = linkedList46.repOK();
        boolean boolean52 = linkedList0.add((java.lang.Object) boolean51);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        boolean boolean11 = linkedList0.repOK();
        int int12 = linkedList0.size();
        boolean boolean13 = linkedList0.repOK();
        boolean boolean14 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList15 = new system.classfixer.classes.LinkedList();
        int int16 = linkedList15.size();
        linkedList15.clear();
        int int18 = linkedList15.size();
        boolean boolean19 = linkedList15.repOK();
        int int20 = linkedList15.size();
        boolean boolean22 = linkedList15.remove((java.lang.Object) 0);
        boolean boolean24 = linkedList15.remove((java.lang.Object) 0);
        int int25 = linkedList15.size();
        boolean boolean26 = linkedList15.repOK();
        system.classfixer.classes.LinkedList linkedList27 = new system.classfixer.classes.LinkedList();
        int int28 = linkedList27.size();
        linkedList27.clear();
        boolean boolean30 = linkedList15.remove((java.lang.Object) linkedList27);
        boolean boolean31 = linkedList15.repOK();
        linkedList15.clear();
        linkedList15.clear();
        int int34 = linkedList15.size();
        java.lang.Class<?> wildcardClass35 = linkedList15.getClass();
        boolean boolean36 = linkedList0.remove((java.lang.Object) wildcardClass35);
        linkedList0.clear();
        linkedList0.clear();
        system.classfixer.classes.LinkedList linkedList39 = new system.classfixer.classes.LinkedList();
        int int40 = linkedList39.size();
        linkedList39.clear();
        int int42 = linkedList39.size();
        boolean boolean43 = linkedList39.repOK();
        int int44 = linkedList39.size();
        boolean boolean46 = linkedList39.remove((java.lang.Object) 0);
        boolean boolean48 = linkedList39.remove((java.lang.Object) 0);
        int int49 = linkedList39.size();
        boolean boolean50 = linkedList39.repOK();
        int int51 = linkedList39.size();
        int int52 = linkedList39.size();
        system.classfixer.classes.LinkedList linkedList53 = new system.classfixer.classes.LinkedList();
        linkedList53.clear();
        boolean boolean55 = linkedList53.repOK();
        boolean boolean56 = linkedList53.repOK();
        boolean boolean57 = linkedList39.remove((java.lang.Object) linkedList53);
        system.classfixer.classes.LinkedList linkedList58 = new system.classfixer.classes.LinkedList();
        int int59 = linkedList58.size();
        linkedList58.clear();
        int int61 = linkedList58.size();
        boolean boolean62 = linkedList58.repOK();
        int int63 = linkedList58.size();
        boolean boolean65 = linkedList58.remove((java.lang.Object) 0);
        boolean boolean67 = linkedList58.remove((java.lang.Object) 0);
        int int68 = linkedList58.size();
        system.classfixer.classes.LinkedList linkedList69 = new system.classfixer.classes.LinkedList();
        linkedList69.clear();
        boolean boolean71 = linkedList69.repOK();
        boolean boolean72 = linkedList69.repOK();
        boolean boolean74 = linkedList69.remove((java.lang.Object) "");
        linkedList69.clear();
        boolean boolean76 = linkedList58.remove((java.lang.Object) linkedList69);
        boolean boolean77 = linkedList39.remove((java.lang.Object) linkedList69);
        java.lang.Class<?> wildcardClass78 = linkedList69.getClass();
        boolean boolean79 = linkedList0.add((java.lang.Object) wildcardClass78);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        boolean boolean11 = linkedList0.repOK();
        int int12 = linkedList0.size();
        boolean boolean13 = linkedList0.repOK();
        java.lang.Object obj14 = null;
        boolean boolean15 = linkedList0.remove(obj14);
        boolean boolean16 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList17 = new system.classfixer.classes.LinkedList();
        int int18 = linkedList17.size();
        linkedList17.clear();
        int int20 = linkedList17.size();
        boolean boolean21 = linkedList17.repOK();
        int int22 = linkedList17.size();
        boolean boolean24 = linkedList17.remove((java.lang.Object) 0);
        boolean boolean26 = linkedList17.remove((java.lang.Object) 0);
        int int27 = linkedList17.size();
        boolean boolean28 = linkedList17.repOK();
        int int29 = linkedList17.size();
        linkedList17.clear();
        boolean boolean31 = linkedList0.add((java.lang.Object) linkedList17);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        linkedList0.clear();
        boolean boolean2 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList3 = new system.classfixer.classes.LinkedList();
        int int4 = linkedList3.size();
        linkedList3.clear();
        boolean boolean6 = linkedList3.repOK();
        linkedList3.clear();
        int int8 = linkedList3.size();
        system.classfixer.classes.LinkedList linkedList9 = new system.classfixer.classes.LinkedList();
        linkedList9.clear();
        boolean boolean11 = linkedList9.repOK();
        boolean boolean12 = linkedList9.repOK();
        boolean boolean14 = linkedList9.remove((java.lang.Object) '#');
        java.lang.Class<?> wildcardClass15 = linkedList9.getClass();
        boolean boolean16 = linkedList3.remove((java.lang.Object) wildcardClass15);
        boolean boolean17 = linkedList0.add((java.lang.Object) linkedList3);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        boolean boolean4 = linkedList0.remove((java.lang.Object) (-1.0f));
        int int5 = linkedList0.size();
        linkedList0.clear();
        boolean boolean8 = linkedList0.remove((java.lang.Object) "");
        boolean boolean10 = linkedList0.add((java.lang.Object) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        boolean boolean1 = linkedList0.repOK();
        linkedList0.clear();
        system.classfixer.classes.LinkedList linkedList3 = new system.classfixer.classes.LinkedList();
        int int4 = linkedList3.size();
        linkedList3.clear();
        int int6 = linkedList3.size();
        boolean boolean7 = linkedList3.repOK();
        int int8 = linkedList3.size();
        boolean boolean10 = linkedList3.remove((java.lang.Object) 0);
        boolean boolean12 = linkedList3.remove((java.lang.Object) 0);
        boolean boolean14 = linkedList3.remove((java.lang.Object) (-1.0f));
        boolean boolean15 = linkedList0.add((java.lang.Object) boolean14);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean11 = linkedList0.remove((java.lang.Object) (short) -1);
        boolean boolean12 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList13 = new system.classfixer.classes.LinkedList();
        int int14 = linkedList13.size();
        boolean boolean15 = linkedList13.repOK();
        boolean boolean17 = linkedList13.remove((java.lang.Object) (short) 1);
        boolean boolean18 = linkedList0.remove((java.lang.Object) linkedList13);
        linkedList0.clear();
        system.classfixer.classes.LinkedList linkedList20 = new system.classfixer.classes.LinkedList();
        int int21 = linkedList20.size();
        linkedList20.clear();
        boolean boolean23 = linkedList20.repOK();
        linkedList20.clear();
        int int25 = linkedList20.size();
        int int26 = linkedList20.size();
        boolean boolean27 = linkedList20.repOK();
        boolean boolean28 = linkedList0.add((java.lang.Object) boolean27);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean11 = linkedList0.remove((java.lang.Object) (short) -1);
        boolean boolean12 = linkedList0.repOK();
        linkedList0.clear();
        system.classfixer.classes.LinkedList linkedList14 = new system.classfixer.classes.LinkedList();
        int int15 = linkedList14.size();
        linkedList14.clear();
        int int17 = linkedList14.size();
        boolean boolean18 = linkedList14.repOK();
        int int19 = linkedList14.size();
        boolean boolean21 = linkedList14.remove((java.lang.Object) 0);
        boolean boolean23 = linkedList14.remove((java.lang.Object) 0);
        int int24 = linkedList14.size();
        boolean boolean25 = linkedList14.repOK();
        int int26 = linkedList14.size();
        boolean boolean27 = linkedList14.repOK();
        int int28 = linkedList14.size();
        boolean boolean29 = linkedList0.add((java.lang.Object) linkedList14);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        linkedList0.clear();
        boolean boolean2 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList3 = new system.classfixer.classes.LinkedList();
        int int4 = linkedList3.size();
        linkedList3.clear();
        int int6 = linkedList3.size();
        boolean boolean7 = linkedList3.repOK();
        int int8 = linkedList3.size();
        boolean boolean10 = linkedList3.remove((java.lang.Object) 0);
        boolean boolean12 = linkedList3.remove((java.lang.Object) 0);
        int int13 = linkedList3.size();
        boolean boolean14 = linkedList3.repOK();
        int int15 = linkedList3.size();
        linkedList3.clear();
        boolean boolean17 = linkedList0.remove((java.lang.Object) linkedList3);
        int int18 = linkedList0.size();
        int int19 = linkedList0.size();
        int int20 = linkedList0.size();
        boolean boolean21 = linkedList0.repOK();
        java.lang.Object obj22 = null;
        boolean boolean23 = linkedList0.add(obj22);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        boolean boolean11 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList12 = new system.classfixer.classes.LinkedList();
        int int13 = linkedList12.size();
        linkedList12.clear();
        boolean boolean15 = linkedList0.remove((java.lang.Object) linkedList12);
        boolean boolean16 = linkedList12.repOK();
        linkedList12.clear();
        system.classfixer.classes.LinkedList linkedList18 = new system.classfixer.classes.LinkedList();
        int int19 = linkedList18.size();
        linkedList18.clear();
        int int21 = linkedList18.size();
        boolean boolean22 = linkedList18.repOK();
        int int23 = linkedList18.size();
        boolean boolean25 = linkedList18.remove((java.lang.Object) 0);
        boolean boolean27 = linkedList18.remove((java.lang.Object) 0);
        int int28 = linkedList18.size();
        system.classfixer.classes.LinkedList linkedList29 = new system.classfixer.classes.LinkedList();
        linkedList29.clear();
        boolean boolean31 = linkedList29.repOK();
        boolean boolean32 = linkedList29.repOK();
        boolean boolean34 = linkedList29.remove((java.lang.Object) "");
        linkedList29.clear();
        boolean boolean36 = linkedList18.remove((java.lang.Object) linkedList29);
        linkedList18.clear();
        boolean boolean38 = linkedList12.remove((java.lang.Object) linkedList18);
        system.classfixer.classes.LinkedList linkedList39 = new system.classfixer.classes.LinkedList();
        int int40 = linkedList39.size();
        linkedList39.clear();
        int int42 = linkedList39.size();
        boolean boolean43 = linkedList39.repOK();
        int int44 = linkedList39.size();
        boolean boolean46 = linkedList39.remove((java.lang.Object) 0);
        boolean boolean48 = linkedList39.remove((java.lang.Object) 0);
        int int49 = linkedList39.size();
        system.classfixer.classes.LinkedList linkedList50 = new system.classfixer.classes.LinkedList();
        linkedList50.clear();
        boolean boolean52 = linkedList50.repOK();
        boolean boolean53 = linkedList50.repOK();
        boolean boolean55 = linkedList50.remove((java.lang.Object) "");
        linkedList50.clear();
        boolean boolean57 = linkedList39.remove((java.lang.Object) linkedList50);
        system.classfixer.classes.LinkedList linkedList58 = new system.classfixer.classes.LinkedList();
        int int59 = linkedList58.size();
        linkedList58.clear();
        int int61 = linkedList58.size();
        boolean boolean62 = linkedList58.repOK();
        int int63 = linkedList58.size();
        boolean boolean65 = linkedList58.remove((java.lang.Object) 0);
        boolean boolean67 = linkedList58.remove((java.lang.Object) 0);
        int int68 = linkedList58.size();
        boolean boolean69 = linkedList58.repOK();
        system.classfixer.classes.LinkedList linkedList70 = new system.classfixer.classes.LinkedList();
        int int71 = linkedList70.size();
        linkedList70.clear();
        boolean boolean73 = linkedList58.remove((java.lang.Object) linkedList70);
        boolean boolean74 = linkedList58.repOK();
        linkedList58.clear();
        linkedList58.clear();
        int int77 = linkedList58.size();
        int int78 = linkedList58.size();
        int int79 = linkedList58.size();
        boolean boolean80 = linkedList39.remove((java.lang.Object) linkedList58);
        system.classfixer.classes.LinkedList linkedList81 = new system.classfixer.classes.LinkedList();
        int int82 = linkedList81.size();
        linkedList81.clear();
        int int84 = linkedList81.size();
        boolean boolean85 = linkedList81.repOK();
        int int86 = linkedList81.size();
        boolean boolean88 = linkedList81.remove((java.lang.Object) 0);
        boolean boolean90 = linkedList81.remove((java.lang.Object) 0);
        boolean boolean91 = linkedList58.remove((java.lang.Object) linkedList81);
        boolean boolean92 = linkedList58.repOK();
        linkedList58.clear();
        boolean boolean94 = linkedList18.add((java.lang.Object) linkedList58);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList18", linkedList18.repOK_2());
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        system.classfixer.classes.LinkedList linkedList4 = new system.classfixer.classes.LinkedList();
        int int5 = linkedList4.size();
        linkedList4.clear();
        int int7 = linkedList4.size();
        boolean boolean8 = linkedList4.repOK();
        int int9 = linkedList4.size();
        boolean boolean11 = linkedList4.remove((java.lang.Object) 0);
        boolean boolean13 = linkedList4.remove((java.lang.Object) 0);
        boolean boolean15 = linkedList4.remove((java.lang.Object) (short) -1);
        boolean boolean16 = linkedList4.repOK();
        system.classfixer.classes.LinkedList linkedList17 = new system.classfixer.classes.LinkedList();
        int int18 = linkedList17.size();
        linkedList17.clear();
        int int20 = linkedList17.size();
        boolean boolean21 = linkedList17.repOK();
        int int22 = linkedList17.size();
        boolean boolean24 = linkedList17.remove((java.lang.Object) 0);
        boolean boolean25 = linkedList4.remove((java.lang.Object) 0);
        java.lang.Class<?> wildcardClass26 = linkedList4.getClass();
        boolean boolean27 = linkedList0.add((java.lang.Object) linkedList4);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        boolean boolean1 = linkedList0.repOK();
        int int2 = linkedList0.size();
        java.lang.Object obj3 = null;
        boolean boolean4 = linkedList0.add(obj3);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        boolean boolean11 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList12 = new system.classfixer.classes.LinkedList();
        int int13 = linkedList12.size();
        linkedList12.clear();
        boolean boolean15 = linkedList0.remove((java.lang.Object) linkedList12);
        boolean boolean16 = linkedList12.repOK();
        boolean boolean17 = linkedList12.repOK();
        linkedList12.clear();
        linkedList12.clear();
        system.classfixer.classes.LinkedList linkedList20 = new system.classfixer.classes.LinkedList();
        boolean boolean21 = linkedList20.repOK();
        linkedList20.clear();
        int int23 = linkedList20.size();
        boolean boolean24 = linkedList20.repOK();
        java.lang.Class<?> wildcardClass25 = linkedList20.getClass();
        boolean boolean26 = linkedList12.add((java.lang.Object) linkedList20);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList12", linkedList12.repOK_2());
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        system.classfixer.classes.LinkedList linkedList11 = new system.classfixer.classes.LinkedList();
        linkedList11.clear();
        boolean boolean13 = linkedList11.repOK();
        boolean boolean14 = linkedList11.repOK();
        boolean boolean16 = linkedList11.remove((java.lang.Object) "");
        linkedList11.clear();
        boolean boolean18 = linkedList0.remove((java.lang.Object) linkedList11);
        int int19 = linkedList0.size();
        boolean boolean21 = linkedList0.remove((java.lang.Object) 0);
        system.classfixer.classes.LinkedList linkedList22 = new system.classfixer.classes.LinkedList();
        int int23 = linkedList22.size();
        linkedList22.clear();
        boolean boolean25 = linkedList22.repOK();
        linkedList22.clear();
        int int27 = linkedList22.size();
        linkedList22.clear();
        boolean boolean29 = linkedList22.repOK();
        boolean boolean30 = linkedList0.add((java.lang.Object) boolean29);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        boolean boolean3 = linkedList0.repOK();
        linkedList0.clear();
        system.classfixer.classes.LinkedList linkedList5 = new system.classfixer.classes.LinkedList();
        int int6 = linkedList5.size();
        int int7 = linkedList5.size();
        boolean boolean9 = linkedList5.remove((java.lang.Object) 0);
        boolean boolean10 = linkedList5.repOK();
        boolean boolean11 = linkedList0.add((java.lang.Object) boolean10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        boolean boolean11 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList12 = new system.classfixer.classes.LinkedList();
        int int13 = linkedList12.size();
        linkedList12.clear();
        boolean boolean15 = linkedList0.remove((java.lang.Object) linkedList12);
        boolean boolean16 = linkedList12.repOK();
        linkedList12.clear();
        system.classfixer.classes.LinkedList linkedList18 = new system.classfixer.classes.LinkedList();
        int int19 = linkedList18.size();
        linkedList18.clear();
        int int21 = linkedList18.size();
        boolean boolean22 = linkedList18.repOK();
        int int23 = linkedList18.size();
        boolean boolean25 = linkedList18.remove((java.lang.Object) 0);
        boolean boolean27 = linkedList18.remove((java.lang.Object) 0);
        int int28 = linkedList18.size();
        boolean boolean29 = linkedList18.repOK();
        system.classfixer.classes.LinkedList linkedList30 = new system.classfixer.classes.LinkedList();
        int int31 = linkedList30.size();
        linkedList30.clear();
        boolean boolean33 = linkedList18.remove((java.lang.Object) linkedList30);
        java.lang.Class<?> wildcardClass34 = linkedList30.getClass();
        boolean boolean35 = linkedList12.remove((java.lang.Object) linkedList30);
        boolean boolean36 = linkedList12.repOK();
        linkedList12.clear();
        java.lang.Object obj38 = null;
        boolean boolean39 = linkedList12.add(obj38);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList12", linkedList12.repOK_2());
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        boolean boolean11 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList12 = new system.classfixer.classes.LinkedList();
        int int13 = linkedList12.size();
        linkedList12.clear();
        boolean boolean15 = linkedList0.remove((java.lang.Object) linkedList12);
        boolean boolean16 = linkedList12.repOK();
        linkedList12.clear();
        system.classfixer.classes.LinkedList linkedList18 = new system.classfixer.classes.LinkedList();
        int int19 = linkedList18.size();
        linkedList18.clear();
        int int21 = linkedList18.size();
        boolean boolean22 = linkedList18.repOK();
        int int23 = linkedList18.size();
        boolean boolean25 = linkedList18.remove((java.lang.Object) 0);
        boolean boolean27 = linkedList18.remove((java.lang.Object) 0);
        int int28 = linkedList18.size();
        boolean boolean29 = linkedList18.repOK();
        system.classfixer.classes.LinkedList linkedList30 = new system.classfixer.classes.LinkedList();
        int int31 = linkedList30.size();
        linkedList30.clear();
        boolean boolean33 = linkedList18.remove((java.lang.Object) linkedList30);
        java.lang.Class<?> wildcardClass34 = linkedList30.getClass();
        boolean boolean35 = linkedList12.remove((java.lang.Object) linkedList30);
        boolean boolean36 = linkedList12.repOK();
        system.classfixer.classes.LinkedList linkedList37 = new system.classfixer.classes.LinkedList();
        linkedList37.clear();
        boolean boolean39 = linkedList37.repOK();
        boolean boolean40 = linkedList37.repOK();
        boolean boolean42 = linkedList37.remove((java.lang.Object) "");
        boolean boolean43 = linkedList12.remove((java.lang.Object) linkedList37);
        linkedList37.clear();
        system.classfixer.classes.LinkedList linkedList45 = new system.classfixer.classes.LinkedList();
        int int46 = linkedList45.size();
        linkedList45.clear();
        int int48 = linkedList45.size();
        boolean boolean49 = linkedList45.repOK();
        int int50 = linkedList45.size();
        boolean boolean52 = linkedList45.remove((java.lang.Object) 0);
        boolean boolean54 = linkedList45.remove((java.lang.Object) 0);
        int int55 = linkedList45.size();
        boolean boolean56 = linkedList45.repOK();
        system.classfixer.classes.LinkedList linkedList57 = new system.classfixer.classes.LinkedList();
        int int58 = linkedList57.size();
        linkedList57.clear();
        boolean boolean60 = linkedList45.remove((java.lang.Object) linkedList57);
        boolean boolean61 = linkedList57.repOK();
        linkedList57.clear();
        system.classfixer.classes.LinkedList linkedList63 = new system.classfixer.classes.LinkedList();
        int int64 = linkedList63.size();
        linkedList63.clear();
        int int66 = linkedList63.size();
        boolean boolean67 = linkedList63.repOK();
        int int68 = linkedList63.size();
        boolean boolean70 = linkedList63.remove((java.lang.Object) 0);
        boolean boolean72 = linkedList63.remove((java.lang.Object) 0);
        int int73 = linkedList63.size();
        system.classfixer.classes.LinkedList linkedList74 = new system.classfixer.classes.LinkedList();
        linkedList74.clear();
        boolean boolean76 = linkedList74.repOK();
        boolean boolean77 = linkedList74.repOK();
        boolean boolean79 = linkedList74.remove((java.lang.Object) "");
        linkedList74.clear();
        boolean boolean81 = linkedList63.remove((java.lang.Object) linkedList74);
        linkedList63.clear();
        boolean boolean83 = linkedList57.remove((java.lang.Object) linkedList63);
        system.classfixer.classes.LinkedList linkedList84 = new system.classfixer.classes.LinkedList();
        int int85 = linkedList84.size();
        int int86 = linkedList84.size();
        boolean boolean87 = linkedList84.repOK();
        boolean boolean88 = linkedList63.remove((java.lang.Object) linkedList84);
        linkedList63.clear();
        linkedList63.clear();
        linkedList63.clear();
        java.lang.Class<?> wildcardClass92 = linkedList63.getClass();
        boolean boolean93 = linkedList37.add((java.lang.Object) wildcardClass92);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList37", linkedList37.repOK_2());
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        system.classfixer.classes.LinkedList linkedList11 = new system.classfixer.classes.LinkedList();
        linkedList11.clear();
        boolean boolean13 = linkedList11.repOK();
        boolean boolean14 = linkedList11.repOK();
        boolean boolean16 = linkedList11.remove((java.lang.Object) "");
        linkedList11.clear();
        boolean boolean18 = linkedList0.remove((java.lang.Object) linkedList11);
        system.classfixer.classes.LinkedList linkedList19 = new system.classfixer.classes.LinkedList();
        int int20 = linkedList19.size();
        linkedList19.clear();
        int int22 = linkedList19.size();
        boolean boolean23 = linkedList19.repOK();
        int int24 = linkedList19.size();
        boolean boolean26 = linkedList19.remove((java.lang.Object) 0);
        boolean boolean28 = linkedList19.remove((java.lang.Object) 0);
        int int29 = linkedList19.size();
        boolean boolean30 = linkedList19.repOK();
        system.classfixer.classes.LinkedList linkedList31 = new system.classfixer.classes.LinkedList();
        int int32 = linkedList31.size();
        linkedList31.clear();
        boolean boolean34 = linkedList19.remove((java.lang.Object) linkedList31);
        boolean boolean35 = linkedList19.repOK();
        linkedList19.clear();
        linkedList19.clear();
        int int38 = linkedList19.size();
        int int39 = linkedList19.size();
        int int40 = linkedList19.size();
        boolean boolean41 = linkedList0.remove((java.lang.Object) linkedList19);
        boolean boolean42 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList43 = new system.classfixer.classes.LinkedList();
        int int44 = linkedList43.size();
        linkedList43.clear();
        int int46 = linkedList43.size();
        boolean boolean47 = linkedList43.repOK();
        int int48 = linkedList43.size();
        boolean boolean50 = linkedList43.remove((java.lang.Object) 0);
        boolean boolean52 = linkedList43.remove((java.lang.Object) 0);
        int int53 = linkedList43.size();
        system.classfixer.classes.LinkedList linkedList54 = new system.classfixer.classes.LinkedList();
        linkedList54.clear();
        boolean boolean56 = linkedList54.repOK();
        boolean boolean57 = linkedList54.repOK();
        boolean boolean59 = linkedList54.remove((java.lang.Object) "");
        linkedList54.clear();
        boolean boolean61 = linkedList43.remove((java.lang.Object) linkedList54);
        system.classfixer.classes.LinkedList linkedList62 = new system.classfixer.classes.LinkedList();
        int int63 = linkedList62.size();
        linkedList62.clear();
        int int65 = linkedList62.size();
        boolean boolean66 = linkedList62.repOK();
        int int67 = linkedList62.size();
        boolean boolean69 = linkedList62.remove((java.lang.Object) 0);
        boolean boolean71 = linkedList62.remove((java.lang.Object) 0);
        int int72 = linkedList62.size();
        boolean boolean73 = linkedList62.repOK();
        system.classfixer.classes.LinkedList linkedList74 = new system.classfixer.classes.LinkedList();
        int int75 = linkedList74.size();
        linkedList74.clear();
        boolean boolean77 = linkedList62.remove((java.lang.Object) linkedList74);
        boolean boolean78 = linkedList62.repOK();
        linkedList62.clear();
        linkedList62.clear();
        int int81 = linkedList62.size();
        int int82 = linkedList62.size();
        int int83 = linkedList62.size();
        boolean boolean84 = linkedList43.remove((java.lang.Object) linkedList62);
        int int85 = linkedList62.size();
        boolean boolean86 = linkedList0.add((java.lang.Object) linkedList62);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        system.classfixer.classes.LinkedList linkedList8 = new system.classfixer.classes.LinkedList();
        int int9 = linkedList8.size();
        linkedList8.clear();
        int int11 = linkedList8.size();
        boolean boolean12 = linkedList8.repOK();
        int int13 = linkedList8.size();
        boolean boolean15 = linkedList8.remove((java.lang.Object) 0);
        boolean boolean17 = linkedList8.remove((java.lang.Object) 0);
        int int18 = linkedList8.size();
        boolean boolean19 = linkedList8.repOK();
        system.classfixer.classes.LinkedList linkedList20 = new system.classfixer.classes.LinkedList();
        int int21 = linkedList20.size();
        linkedList20.clear();
        boolean boolean23 = linkedList8.remove((java.lang.Object) linkedList20);
        boolean boolean24 = linkedList20.repOK();
        linkedList20.clear();
        system.classfixer.classes.LinkedList linkedList26 = new system.classfixer.classes.LinkedList();
        int int27 = linkedList26.size();
        linkedList26.clear();
        int int29 = linkedList26.size();
        boolean boolean30 = linkedList26.repOK();
        int int31 = linkedList26.size();
        boolean boolean33 = linkedList26.remove((java.lang.Object) 0);
        boolean boolean35 = linkedList26.remove((java.lang.Object) 0);
        int int36 = linkedList26.size();
        boolean boolean37 = linkedList26.repOK();
        system.classfixer.classes.LinkedList linkedList38 = new system.classfixer.classes.LinkedList();
        int int39 = linkedList38.size();
        linkedList38.clear();
        boolean boolean41 = linkedList26.remove((java.lang.Object) linkedList38);
        java.lang.Class<?> wildcardClass42 = linkedList38.getClass();
        boolean boolean43 = linkedList20.remove((java.lang.Object) linkedList38);
        int int44 = linkedList20.size();
        system.classfixer.classes.LinkedList linkedList45 = new system.classfixer.classes.LinkedList();
        int int46 = linkedList45.size();
        linkedList45.clear();
        int int48 = linkedList45.size();
        boolean boolean49 = linkedList45.repOK();
        int int50 = linkedList45.size();
        boolean boolean52 = linkedList45.remove((java.lang.Object) 0);
        boolean boolean54 = linkedList45.remove((java.lang.Object) 0);
        int int55 = linkedList45.size();
        boolean boolean56 = linkedList45.repOK();
        system.classfixer.classes.LinkedList linkedList57 = new system.classfixer.classes.LinkedList();
        int int58 = linkedList57.size();
        linkedList57.clear();
        boolean boolean60 = linkedList45.remove((java.lang.Object) linkedList57);
        boolean boolean61 = linkedList45.repOK();
        boolean boolean62 = linkedList20.remove((java.lang.Object) linkedList45);
        linkedList45.clear();
        boolean boolean64 = linkedList0.add((java.lang.Object) linkedList45);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean11 = linkedList0.remove((java.lang.Object) (-1.0f));
        system.classfixer.classes.LinkedList linkedList12 = new system.classfixer.classes.LinkedList();
        linkedList12.clear();
        boolean boolean14 = linkedList12.repOK();
        boolean boolean15 = linkedList12.repOK();
        boolean boolean17 = linkedList12.remove((java.lang.Object) "");
        linkedList12.clear();
        boolean boolean19 = linkedList0.remove((java.lang.Object) linkedList12);
        int int20 = linkedList0.size();
        system.classfixer.classes.LinkedList linkedList21 = new system.classfixer.classes.LinkedList();
        int int22 = linkedList21.size();
        linkedList21.clear();
        int int24 = linkedList21.size();
        boolean boolean25 = linkedList21.repOK();
        int int26 = linkedList21.size();
        boolean boolean28 = linkedList21.remove((java.lang.Object) 0);
        boolean boolean30 = linkedList21.remove((java.lang.Object) 0);
        boolean boolean32 = linkedList21.remove((java.lang.Object) (-1.0f));
        system.classfixer.classes.LinkedList linkedList33 = new system.classfixer.classes.LinkedList();
        linkedList33.clear();
        boolean boolean35 = linkedList33.repOK();
        boolean boolean36 = linkedList33.repOK();
        boolean boolean38 = linkedList33.remove((java.lang.Object) "");
        linkedList33.clear();
        boolean boolean40 = linkedList21.remove((java.lang.Object) linkedList33);
        int int41 = linkedList21.size();
        java.lang.Class<?> wildcardClass42 = linkedList21.getClass();
        boolean boolean43 = linkedList0.remove((java.lang.Object) linkedList21);
        system.classfixer.classes.LinkedList linkedList44 = new system.classfixer.classes.LinkedList();
        int int45 = linkedList44.size();
        linkedList44.clear();
        int int47 = linkedList44.size();
        boolean boolean48 = linkedList44.repOK();
        int int49 = linkedList44.size();
        boolean boolean51 = linkedList44.remove((java.lang.Object) 0);
        boolean boolean53 = linkedList44.remove((java.lang.Object) 0);
        int int54 = linkedList44.size();
        boolean boolean55 = linkedList44.repOK();
        system.classfixer.classes.LinkedList linkedList56 = new system.classfixer.classes.LinkedList();
        int int57 = linkedList56.size();
        linkedList56.clear();
        boolean boolean59 = linkedList44.remove((java.lang.Object) linkedList56);
        boolean boolean60 = linkedList56.repOK();
        linkedList56.clear();
        int int62 = linkedList56.size();
        linkedList56.clear();
        boolean boolean64 = linkedList56.repOK();
        boolean boolean65 = linkedList0.add((java.lang.Object) linkedList56);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        int int2 = linkedList0.size();
        boolean boolean4 = linkedList0.remove((java.lang.Object) 0);
        int int5 = linkedList0.size();
        system.classfixer.classes.LinkedList linkedList6 = new system.classfixer.classes.LinkedList();
        int int7 = linkedList6.size();
        linkedList6.clear();
        int int9 = linkedList6.size();
        boolean boolean10 = linkedList6.repOK();
        int int11 = linkedList6.size();
        boolean boolean13 = linkedList6.remove((java.lang.Object) 0);
        boolean boolean15 = linkedList6.remove((java.lang.Object) 0);
        int int16 = linkedList6.size();
        boolean boolean17 = linkedList6.repOK();
        int int18 = linkedList6.size();
        boolean boolean19 = linkedList6.repOK();
        system.classfixer.classes.LinkedList linkedList20 = new system.classfixer.classes.LinkedList();
        boolean boolean21 = linkedList20.repOK();
        linkedList20.clear();
        int int23 = linkedList20.size();
        boolean boolean24 = linkedList20.repOK();
        java.lang.Class<?> wildcardClass25 = linkedList20.getClass();
        boolean boolean26 = linkedList6.remove((java.lang.Object) wildcardClass25);
        boolean boolean27 = linkedList0.remove((java.lang.Object) wildcardClass25);
        system.classfixer.classes.LinkedList linkedList28 = new system.classfixer.classes.LinkedList();
        int int29 = linkedList28.size();
        linkedList28.clear();
        int int31 = linkedList28.size();
        boolean boolean32 = linkedList28.repOK();
        int int33 = linkedList28.size();
        boolean boolean35 = linkedList28.remove((java.lang.Object) 0);
        boolean boolean37 = linkedList28.remove((java.lang.Object) 0);
        boolean boolean39 = linkedList28.remove((java.lang.Object) (-1.0f));
        system.classfixer.classes.LinkedList linkedList40 = new system.classfixer.classes.LinkedList();
        int int41 = linkedList40.size();
        linkedList40.clear();
        int int43 = linkedList40.size();
        boolean boolean44 = linkedList40.repOK();
        int int45 = linkedList40.size();
        boolean boolean47 = linkedList40.remove((java.lang.Object) 0);
        boolean boolean49 = linkedList40.remove((java.lang.Object) 0);
        int int50 = linkedList40.size();
        boolean boolean51 = linkedList40.repOK();
        system.classfixer.classes.LinkedList linkedList52 = new system.classfixer.classes.LinkedList();
        int int53 = linkedList52.size();
        linkedList52.clear();
        boolean boolean55 = linkedList40.remove((java.lang.Object) linkedList52);
        boolean boolean56 = linkedList28.remove((java.lang.Object) linkedList40);
        int int57 = linkedList28.size();
        system.classfixer.classes.LinkedList linkedList58 = new system.classfixer.classes.LinkedList();
        boolean boolean59 = linkedList58.repOK();
        linkedList58.clear();
        int int61 = linkedList58.size();
        boolean boolean62 = linkedList58.repOK();
        java.lang.Class<?> wildcardClass63 = linkedList58.getClass();
        boolean boolean64 = linkedList28.remove((java.lang.Object) wildcardClass63);
        boolean boolean65 = linkedList0.add((java.lang.Object) boolean64);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        boolean boolean3 = linkedList0.repOK();
        linkedList0.clear();
        system.classfixer.classes.LinkedList linkedList5 = new system.classfixer.classes.LinkedList();
        linkedList5.clear();
        boolean boolean7 = linkedList5.repOK();
        boolean boolean8 = linkedList0.remove((java.lang.Object) linkedList5);
        boolean boolean9 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList10 = new system.classfixer.classes.LinkedList();
        int int11 = linkedList10.size();
        linkedList10.clear();
        int int13 = linkedList10.size();
        boolean boolean14 = linkedList10.repOK();
        int int15 = linkedList10.size();
        boolean boolean17 = linkedList10.remove((java.lang.Object) 0);
        boolean boolean19 = linkedList10.remove((java.lang.Object) 0);
        boolean boolean21 = linkedList10.remove((java.lang.Object) (-1.0f));
        boolean boolean22 = linkedList0.add((java.lang.Object) (-1.0f));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean11 = linkedList0.remove((java.lang.Object) (-1.0f));
        system.classfixer.classes.LinkedList linkedList12 = new system.classfixer.classes.LinkedList();
        linkedList12.clear();
        boolean boolean14 = linkedList12.repOK();
        boolean boolean15 = linkedList12.repOK();
        boolean boolean17 = linkedList12.remove((java.lang.Object) "");
        linkedList12.clear();
        boolean boolean19 = linkedList0.remove((java.lang.Object) linkedList12);
        linkedList0.clear();
        system.classfixer.classes.LinkedList linkedList21 = new system.classfixer.classes.LinkedList();
        int int22 = linkedList21.size();
        linkedList21.clear();
        int int24 = linkedList21.size();
        boolean boolean25 = linkedList21.repOK();
        int int26 = linkedList21.size();
        boolean boolean28 = linkedList21.remove((java.lang.Object) 0);
        boolean boolean30 = linkedList21.remove((java.lang.Object) 0);
        linkedList21.clear();
        linkedList21.clear();
        system.classfixer.classes.LinkedList linkedList33 = new system.classfixer.classes.LinkedList();
        int int34 = linkedList33.size();
        linkedList33.clear();
        int int36 = linkedList33.size();
        boolean boolean37 = linkedList33.repOK();
        int int38 = linkedList33.size();
        boolean boolean40 = linkedList33.remove((java.lang.Object) 0);
        boolean boolean42 = linkedList33.remove((java.lang.Object) 0);
        int int43 = linkedList33.size();
        boolean boolean44 = linkedList33.repOK();
        system.classfixer.classes.LinkedList linkedList45 = new system.classfixer.classes.LinkedList();
        int int46 = linkedList45.size();
        linkedList45.clear();
        boolean boolean48 = linkedList33.remove((java.lang.Object) linkedList45);
        boolean boolean49 = linkedList33.repOK();
        linkedList33.clear();
        linkedList33.clear();
        int int52 = linkedList33.size();
        java.lang.Class<?> wildcardClass53 = linkedList33.getClass();
        boolean boolean54 = linkedList21.remove((java.lang.Object) wildcardClass53);
        system.classfixer.classes.LinkedList linkedList55 = new system.classfixer.classes.LinkedList();
        int int56 = linkedList55.size();
        linkedList55.clear();
        int int58 = linkedList55.size();
        boolean boolean59 = linkedList55.repOK();
        int int60 = linkedList55.size();
        boolean boolean62 = linkedList55.remove((java.lang.Object) 0);
        boolean boolean64 = linkedList55.remove((java.lang.Object) 0);
        int int65 = linkedList55.size();
        boolean boolean66 = linkedList55.repOK();
        int int67 = linkedList55.size();
        int int68 = linkedList55.size();
        system.classfixer.classes.LinkedList linkedList69 = new system.classfixer.classes.LinkedList();
        linkedList69.clear();
        boolean boolean71 = linkedList69.repOK();
        boolean boolean72 = linkedList69.repOK();
        boolean boolean73 = linkedList55.remove((java.lang.Object) linkedList69);
        boolean boolean74 = linkedList21.remove((java.lang.Object) boolean73);
        system.classfixer.classes.LinkedList linkedList75 = new system.classfixer.classes.LinkedList();
        int int76 = linkedList75.size();
        linkedList75.clear();
        int int78 = linkedList75.size();
        boolean boolean79 = linkedList75.repOK();
        int int80 = linkedList75.size();
        boolean boolean82 = linkedList75.remove((java.lang.Object) 0);
        boolean boolean84 = linkedList75.remove((java.lang.Object) 0);
        int int85 = linkedList75.size();
        boolean boolean86 = linkedList75.repOK();
        system.classfixer.classes.LinkedList linkedList87 = new system.classfixer.classes.LinkedList();
        int int88 = linkedList87.size();
        linkedList87.clear();
        boolean boolean90 = linkedList75.remove((java.lang.Object) linkedList87);
        int int91 = linkedList75.size();
        int int92 = linkedList75.size();
        boolean boolean93 = linkedList21.remove((java.lang.Object) int92);
        linkedList21.clear();
        linkedList21.clear();
        linkedList21.clear();
        int int97 = linkedList21.size();
        boolean boolean98 = linkedList21.repOK();
        boolean boolean99 = linkedList0.add((java.lang.Object) linkedList21);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        boolean boolean11 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList12 = new system.classfixer.classes.LinkedList();
        int int13 = linkedList12.size();
        linkedList12.clear();
        boolean boolean15 = linkedList0.remove((java.lang.Object) linkedList12);
        boolean boolean16 = linkedList12.repOK();
        boolean boolean17 = linkedList12.repOK();
        boolean boolean19 = linkedList12.remove((java.lang.Object) (-1.0d));
        int int20 = linkedList12.size();
        system.classfixer.classes.LinkedList linkedList21 = new system.classfixer.classes.LinkedList();
        int int22 = linkedList21.size();
        linkedList21.clear();
        int int24 = linkedList21.size();
        boolean boolean25 = linkedList21.repOK();
        int int26 = linkedList21.size();
        boolean boolean28 = linkedList21.remove((java.lang.Object) 0);
        boolean boolean30 = linkedList21.remove((java.lang.Object) 0);
        int int31 = linkedList21.size();
        boolean boolean32 = linkedList21.repOK();
        boolean boolean33 = linkedList21.repOK();
        boolean boolean34 = linkedList12.remove((java.lang.Object) linkedList21);
        linkedList21.clear();
        system.classfixer.classes.LinkedList linkedList36 = new system.classfixer.classes.LinkedList();
        int int37 = linkedList36.size();
        linkedList36.clear();
        int int39 = linkedList36.size();
        boolean boolean40 = linkedList36.repOK();
        int int41 = linkedList36.size();
        boolean boolean43 = linkedList36.remove((java.lang.Object) 0);
        boolean boolean45 = linkedList36.remove((java.lang.Object) 0);
        int int46 = linkedList36.size();
        boolean boolean47 = linkedList36.repOK();
        int int48 = linkedList36.size();
        boolean boolean49 = linkedList36.repOK();
        boolean boolean50 = linkedList36.repOK();
        java.lang.Class<?> wildcardClass51 = linkedList36.getClass();
        boolean boolean52 = linkedList21.add((java.lang.Object) wildcardClass51);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList21", linkedList21.repOK_2());
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        boolean boolean3 = linkedList0.repOK();
        linkedList0.clear();
        int int5 = linkedList0.size();
        system.classfixer.classes.LinkedList linkedList6 = new system.classfixer.classes.LinkedList();
        linkedList6.clear();
        boolean boolean8 = linkedList6.repOK();
        boolean boolean9 = linkedList6.repOK();
        boolean boolean11 = linkedList6.remove((java.lang.Object) '#');
        java.lang.Class<?> wildcardClass12 = linkedList6.getClass();
        boolean boolean13 = linkedList0.remove((java.lang.Object) wildcardClass12);
        system.classfixer.classes.LinkedList linkedList14 = new system.classfixer.classes.LinkedList();
        int int15 = linkedList14.size();
        linkedList14.clear();
        int int17 = linkedList14.size();
        boolean boolean18 = linkedList14.repOK();
        int int19 = linkedList14.size();
        boolean boolean21 = linkedList14.remove((java.lang.Object) 0);
        boolean boolean23 = linkedList14.remove((java.lang.Object) 0);
        int int24 = linkedList14.size();
        boolean boolean25 = linkedList14.repOK();
        system.classfixer.classes.LinkedList linkedList26 = new system.classfixer.classes.LinkedList();
        int int27 = linkedList26.size();
        linkedList26.clear();
        boolean boolean29 = linkedList14.remove((java.lang.Object) linkedList26);
        boolean boolean30 = linkedList26.repOK();
        linkedList26.clear();
        system.classfixer.classes.LinkedList linkedList32 = new system.classfixer.classes.LinkedList();
        int int33 = linkedList32.size();
        linkedList32.clear();
        int int35 = linkedList32.size();
        boolean boolean36 = linkedList32.repOK();
        int int37 = linkedList32.size();
        boolean boolean39 = linkedList32.remove((java.lang.Object) 0);
        boolean boolean41 = linkedList32.remove((java.lang.Object) 0);
        int int42 = linkedList32.size();
        system.classfixer.classes.LinkedList linkedList43 = new system.classfixer.classes.LinkedList();
        linkedList43.clear();
        boolean boolean45 = linkedList43.repOK();
        boolean boolean46 = linkedList43.repOK();
        boolean boolean48 = linkedList43.remove((java.lang.Object) "");
        linkedList43.clear();
        boolean boolean50 = linkedList32.remove((java.lang.Object) linkedList43);
        linkedList32.clear();
        boolean boolean52 = linkedList26.remove((java.lang.Object) linkedList32);
        system.classfixer.classes.LinkedList linkedList53 = new system.classfixer.classes.LinkedList();
        int int54 = linkedList53.size();
        int int55 = linkedList53.size();
        boolean boolean56 = linkedList53.repOK();
        boolean boolean57 = linkedList32.remove((java.lang.Object) linkedList53);
        linkedList32.clear();
        linkedList32.clear();
        boolean boolean60 = linkedList0.remove((java.lang.Object) linkedList32);
        boolean boolean62 = linkedList0.add((java.lang.Object) (-1.0f));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        boolean boolean11 = linkedList0.repOK();
        int int12 = linkedList0.size();
        int int13 = linkedList0.size();
        boolean boolean14 = linkedList0.repOK();
        linkedList0.clear();
        system.classfixer.classes.LinkedList linkedList16 = new system.classfixer.classes.LinkedList();
        int int17 = linkedList16.size();
        linkedList16.clear();
        int int19 = linkedList16.size();
        boolean boolean20 = linkedList16.repOK();
        int int21 = linkedList16.size();
        boolean boolean23 = linkedList16.remove((java.lang.Object) 0);
        boolean boolean25 = linkedList16.remove((java.lang.Object) 0);
        boolean boolean27 = linkedList16.remove((java.lang.Object) (byte) 0);
        boolean boolean28 = linkedList16.repOK();
        boolean boolean29 = linkedList0.add((java.lang.Object) linkedList16);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean11 = linkedList0.remove((java.lang.Object) (short) -1);
        boolean boolean12 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList13 = new system.classfixer.classes.LinkedList();
        int int14 = linkedList13.size();
        boolean boolean15 = linkedList13.repOK();
        boolean boolean17 = linkedList13.remove((java.lang.Object) (short) 1);
        boolean boolean18 = linkedList0.remove((java.lang.Object) linkedList13);
        linkedList0.clear();
        linkedList0.clear();
        linkedList0.clear();
        java.lang.Object obj22 = null;
        boolean boolean23 = linkedList0.add(obj22);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        boolean boolean3 = linkedList0.repOK();
        int int4 = linkedList0.size();
        boolean boolean6 = linkedList0.remove((java.lang.Object) (short) 0);
        boolean boolean7 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList8 = new system.classfixer.classes.LinkedList();
        boolean boolean9 = linkedList8.repOK();
        int int10 = linkedList8.size();
        system.classfixer.classes.LinkedList linkedList11 = new system.classfixer.classes.LinkedList();
        int int12 = linkedList11.size();
        linkedList11.clear();
        int int14 = linkedList11.size();
        boolean boolean15 = linkedList11.repOK();
        int int16 = linkedList11.size();
        boolean boolean18 = linkedList11.remove((java.lang.Object) 0);
        boolean boolean20 = linkedList11.remove((java.lang.Object) 0);
        int int21 = linkedList11.size();
        boolean boolean22 = linkedList11.repOK();
        system.classfixer.classes.LinkedList linkedList23 = new system.classfixer.classes.LinkedList();
        int int24 = linkedList23.size();
        linkedList23.clear();
        boolean boolean26 = linkedList11.remove((java.lang.Object) linkedList23);
        boolean boolean27 = linkedList23.repOK();
        boolean boolean28 = linkedList23.repOK();
        linkedList23.clear();
        int int30 = linkedList23.size();
        boolean boolean31 = linkedList8.remove((java.lang.Object) linkedList23);
        int int32 = linkedList23.size();
        java.lang.Class<?> wildcardClass33 = linkedList23.getClass();
        boolean boolean34 = linkedList0.add((java.lang.Object) linkedList23);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        linkedList0.clear();
        boolean boolean2 = linkedList0.repOK();
        int int3 = linkedList0.size();
        system.classfixer.classes.LinkedList linkedList4 = new system.classfixer.classes.LinkedList();
        boolean boolean5 = linkedList4.repOK();
        boolean boolean6 = linkedList4.repOK();
        system.classfixer.classes.LinkedList linkedList7 = new system.classfixer.classes.LinkedList();
        int int8 = linkedList7.size();
        linkedList7.clear();
        int int10 = linkedList7.size();
        boolean boolean11 = linkedList7.repOK();
        int int12 = linkedList7.size();
        boolean boolean14 = linkedList7.remove((java.lang.Object) 0);
        boolean boolean16 = linkedList7.remove((java.lang.Object) 0);
        linkedList7.clear();
        linkedList7.clear();
        system.classfixer.classes.LinkedList linkedList19 = new system.classfixer.classes.LinkedList();
        int int20 = linkedList19.size();
        linkedList19.clear();
        int int22 = linkedList19.size();
        boolean boolean23 = linkedList19.repOK();
        int int24 = linkedList19.size();
        boolean boolean26 = linkedList19.remove((java.lang.Object) 0);
        boolean boolean28 = linkedList19.remove((java.lang.Object) 0);
        int int29 = linkedList19.size();
        boolean boolean30 = linkedList19.repOK();
        system.classfixer.classes.LinkedList linkedList31 = new system.classfixer.classes.LinkedList();
        int int32 = linkedList31.size();
        linkedList31.clear();
        boolean boolean34 = linkedList19.remove((java.lang.Object) linkedList31);
        boolean boolean35 = linkedList19.repOK();
        linkedList19.clear();
        linkedList19.clear();
        int int38 = linkedList19.size();
        java.lang.Class<?> wildcardClass39 = linkedList19.getClass();
        boolean boolean40 = linkedList7.remove((java.lang.Object) wildcardClass39);
        boolean boolean41 = linkedList4.remove((java.lang.Object) linkedList7);
        boolean boolean42 = linkedList0.remove((java.lang.Object) boolean41);
        system.classfixer.classes.LinkedList linkedList43 = new system.classfixer.classes.LinkedList();
        int int44 = linkedList43.size();
        linkedList43.clear();
        int int46 = linkedList43.size();
        boolean boolean47 = linkedList43.repOK();
        int int48 = linkedList43.size();
        boolean boolean50 = linkedList43.remove((java.lang.Object) 0);
        boolean boolean52 = linkedList43.remove((java.lang.Object) 0);
        int int53 = linkedList43.size();
        system.classfixer.classes.LinkedList linkedList54 = new system.classfixer.classes.LinkedList();
        linkedList54.clear();
        boolean boolean56 = linkedList54.repOK();
        boolean boolean57 = linkedList54.repOK();
        boolean boolean59 = linkedList54.remove((java.lang.Object) "");
        linkedList54.clear();
        boolean boolean61 = linkedList43.remove((java.lang.Object) linkedList54);
        int int62 = linkedList43.size();
        boolean boolean64 = linkedList43.remove((java.lang.Object) 0);
        int int65 = linkedList43.size();
        boolean boolean66 = linkedList0.add((java.lang.Object) linkedList43);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        boolean boolean11 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList12 = new system.classfixer.classes.LinkedList();
        int int13 = linkedList12.size();
        linkedList12.clear();
        boolean boolean15 = linkedList0.remove((java.lang.Object) linkedList12);
        boolean boolean16 = linkedList12.repOK();
        boolean boolean17 = linkedList12.repOK();
        boolean boolean19 = linkedList12.remove((java.lang.Object) (-1.0d));
        linkedList12.clear();
        linkedList12.clear();
        system.classfixer.classes.LinkedList linkedList22 = new system.classfixer.classes.LinkedList();
        int int23 = linkedList22.size();
        linkedList22.clear();
        boolean boolean25 = linkedList22.repOK();
        linkedList22.clear();
        system.classfixer.classes.LinkedList linkedList27 = new system.classfixer.classes.LinkedList();
        linkedList27.clear();
        boolean boolean29 = linkedList27.repOK();
        boolean boolean30 = linkedList22.remove((java.lang.Object) linkedList27);
        int int31 = linkedList22.size();
        int int32 = linkedList22.size();
        boolean boolean33 = linkedList12.add((java.lang.Object) int32);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList12", linkedList12.repOK_2());
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        boolean boolean11 = linkedList0.repOK();
        int int12 = linkedList0.size();
        boolean boolean13 = linkedList0.repOK();
        boolean boolean14 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList15 = new system.classfixer.classes.LinkedList();
        int int16 = linkedList15.size();
        linkedList15.clear();
        int int18 = linkedList15.size();
        boolean boolean19 = linkedList15.repOK();
        int int20 = linkedList15.size();
        boolean boolean22 = linkedList15.remove((java.lang.Object) 0);
        boolean boolean24 = linkedList15.remove((java.lang.Object) 0);
        int int25 = linkedList15.size();
        boolean boolean26 = linkedList15.repOK();
        system.classfixer.classes.LinkedList linkedList27 = new system.classfixer.classes.LinkedList();
        int int28 = linkedList27.size();
        linkedList27.clear();
        boolean boolean30 = linkedList15.remove((java.lang.Object) linkedList27);
        boolean boolean31 = linkedList15.repOK();
        linkedList15.clear();
        linkedList15.clear();
        int int34 = linkedList15.size();
        java.lang.Class<?> wildcardClass35 = linkedList15.getClass();
        boolean boolean36 = linkedList0.remove((java.lang.Object) wildcardClass35);
        linkedList0.clear();
        boolean boolean39 = linkedList0.remove((java.lang.Object) ' ');
        boolean boolean40 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList41 = new system.classfixer.classes.LinkedList();
        int int42 = linkedList41.size();
        linkedList41.clear();
        boolean boolean44 = linkedList41.repOK();
        linkedList41.clear();
        system.classfixer.classes.LinkedList linkedList46 = new system.classfixer.classes.LinkedList();
        linkedList46.clear();
        boolean boolean48 = linkedList46.repOK();
        boolean boolean49 = linkedList41.remove((java.lang.Object) linkedList46);
        linkedList41.clear();
        boolean boolean51 = linkedList0.remove((java.lang.Object) linkedList41);
        boolean boolean52 = linkedList0.repOK();
        linkedList0.clear();
        system.classfixer.classes.LinkedList linkedList54 = new system.classfixer.classes.LinkedList();
        int int55 = linkedList54.size();
        linkedList54.clear();
        boolean boolean57 = linkedList54.repOK();
        linkedList54.clear();
        int int59 = linkedList54.size();
        int int60 = linkedList54.size();
        int int61 = linkedList54.size();
        boolean boolean62 = linkedList54.repOK();
        boolean boolean63 = linkedList0.add((java.lang.Object) linkedList54);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        linkedList0.clear();
        boolean boolean12 = linkedList0.remove((java.lang.Object) 100);
        int int13 = linkedList0.size();
        int int14 = linkedList0.size();
        int int15 = linkedList0.size();
        system.classfixer.classes.LinkedList linkedList16 = new system.classfixer.classes.LinkedList();
        int int17 = linkedList16.size();
        linkedList16.clear();
        int int19 = linkedList16.size();
        boolean boolean20 = linkedList16.repOK();
        int int21 = linkedList16.size();
        boolean boolean23 = linkedList16.remove((java.lang.Object) 0);
        boolean boolean25 = linkedList16.remove((java.lang.Object) 0);
        int int26 = linkedList16.size();
        boolean boolean27 = linkedList16.repOK();
        int int28 = linkedList16.size();
        boolean boolean29 = linkedList16.repOK();
        system.classfixer.classes.LinkedList linkedList30 = new system.classfixer.classes.LinkedList();
        boolean boolean31 = linkedList30.repOK();
        linkedList30.clear();
        int int33 = linkedList30.size();
        boolean boolean34 = linkedList30.repOK();
        java.lang.Class<?> wildcardClass35 = linkedList30.getClass();
        boolean boolean36 = linkedList16.remove((java.lang.Object) wildcardClass35);
        boolean boolean37 = linkedList0.add((java.lang.Object) wildcardClass35);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean11 = linkedList0.remove((java.lang.Object) (-1.0f));
        system.classfixer.classes.LinkedList linkedList12 = new system.classfixer.classes.LinkedList();
        int int13 = linkedList12.size();
        linkedList12.clear();
        int int15 = linkedList12.size();
        boolean boolean16 = linkedList12.repOK();
        int int17 = linkedList12.size();
        boolean boolean19 = linkedList12.remove((java.lang.Object) 0);
        boolean boolean21 = linkedList12.remove((java.lang.Object) 0);
        int int22 = linkedList12.size();
        boolean boolean23 = linkedList12.repOK();
        system.classfixer.classes.LinkedList linkedList24 = new system.classfixer.classes.LinkedList();
        int int25 = linkedList24.size();
        linkedList24.clear();
        boolean boolean27 = linkedList12.remove((java.lang.Object) linkedList24);
        boolean boolean28 = linkedList0.remove((java.lang.Object) linkedList12);
        int int29 = linkedList0.size();
        system.classfixer.classes.LinkedList linkedList30 = new system.classfixer.classes.LinkedList();
        boolean boolean31 = linkedList30.repOK();
        linkedList30.clear();
        int int33 = linkedList30.size();
        boolean boolean34 = linkedList30.repOK();
        java.lang.Class<?> wildcardClass35 = linkedList30.getClass();
        boolean boolean36 = linkedList0.remove((java.lang.Object) wildcardClass35);
        system.classfixer.classes.LinkedList linkedList37 = new system.classfixer.classes.LinkedList();
        int int38 = linkedList37.size();
        linkedList37.clear();
        boolean boolean40 = linkedList37.repOK();
        int int41 = linkedList37.size();
        boolean boolean43 = linkedList37.remove((java.lang.Object) (short) 0);
        system.classfixer.classes.LinkedList linkedList44 = new system.classfixer.classes.LinkedList();
        int int45 = linkedList44.size();
        linkedList44.clear();
        int int47 = linkedList44.size();
        boolean boolean48 = linkedList44.repOK();
        int int49 = linkedList44.size();
        boolean boolean51 = linkedList44.remove((java.lang.Object) 0);
        boolean boolean53 = linkedList44.remove((java.lang.Object) 0);
        int int54 = linkedList44.size();
        system.classfixer.classes.LinkedList linkedList55 = new system.classfixer.classes.LinkedList();
        linkedList55.clear();
        boolean boolean57 = linkedList55.repOK();
        boolean boolean58 = linkedList55.repOK();
        boolean boolean60 = linkedList55.remove((java.lang.Object) "");
        linkedList55.clear();
        boolean boolean62 = linkedList44.remove((java.lang.Object) linkedList55);
        boolean boolean63 = linkedList37.remove((java.lang.Object) boolean62);
        boolean boolean64 = linkedList0.add((java.lang.Object) linkedList37);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        boolean boolean11 = linkedList0.repOK();
        int int12 = linkedList0.size();
        boolean boolean13 = linkedList0.repOK();
        boolean boolean14 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList15 = new system.classfixer.classes.LinkedList();
        int int16 = linkedList15.size();
        linkedList15.clear();
        int int18 = linkedList15.size();
        boolean boolean19 = linkedList15.repOK();
        int int20 = linkedList15.size();
        boolean boolean22 = linkedList15.remove((java.lang.Object) 0);
        boolean boolean24 = linkedList15.remove((java.lang.Object) 0);
        int int25 = linkedList15.size();
        boolean boolean26 = linkedList15.repOK();
        system.classfixer.classes.LinkedList linkedList27 = new system.classfixer.classes.LinkedList();
        int int28 = linkedList27.size();
        linkedList27.clear();
        boolean boolean30 = linkedList15.remove((java.lang.Object) linkedList27);
        boolean boolean31 = linkedList15.repOK();
        linkedList15.clear();
        linkedList15.clear();
        int int34 = linkedList15.size();
        java.lang.Class<?> wildcardClass35 = linkedList15.getClass();
        boolean boolean36 = linkedList0.remove((java.lang.Object) wildcardClass35);
        linkedList0.clear();
        boolean boolean39 = linkedList0.remove((java.lang.Object) ' ');
        boolean boolean40 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList41 = new system.classfixer.classes.LinkedList();
        linkedList41.clear();
        boolean boolean43 = linkedList41.repOK();
        boolean boolean44 = linkedList41.repOK();
        boolean boolean46 = linkedList41.remove((java.lang.Object) "");
        linkedList41.clear();
        boolean boolean48 = linkedList0.add((java.lang.Object) linkedList41);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        linkedList0.clear();
        linkedList0.clear();
        system.classfixer.classes.LinkedList linkedList12 = new system.classfixer.classes.LinkedList();
        linkedList12.clear();
        boolean boolean14 = linkedList12.repOK();
        system.classfixer.classes.LinkedList linkedList15 = new system.classfixer.classes.LinkedList();
        int int16 = linkedList15.size();
        linkedList15.clear();
        int int18 = linkedList15.size();
        boolean boolean19 = linkedList15.repOK();
        int int20 = linkedList15.size();
        boolean boolean22 = linkedList15.remove((java.lang.Object) 0);
        boolean boolean24 = linkedList15.remove((java.lang.Object) 0);
        int int25 = linkedList15.size();
        boolean boolean26 = linkedList15.repOK();
        int int27 = linkedList15.size();
        linkedList15.clear();
        boolean boolean29 = linkedList12.remove((java.lang.Object) linkedList15);
        boolean boolean30 = linkedList0.remove((java.lang.Object) boolean29);
        linkedList0.clear();
        boolean boolean32 = linkedList0.repOK();
        linkedList0.clear();
        boolean boolean34 = linkedList0.repOK();
        int int35 = linkedList0.size();
        system.classfixer.classes.LinkedList linkedList36 = new system.classfixer.classes.LinkedList();
        int int37 = linkedList36.size();
        linkedList36.clear();
        int int39 = linkedList36.size();
        boolean boolean40 = linkedList36.repOK();
        boolean boolean41 = linkedList36.repOK();
        boolean boolean42 = linkedList36.repOK();
        java.lang.Class<?> wildcardClass43 = linkedList36.getClass();
        boolean boolean44 = linkedList0.add((java.lang.Object) linkedList36);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        boolean boolean11 = linkedList0.repOK();
        int int12 = linkedList0.size();
        boolean boolean13 = linkedList0.repOK();
        int int14 = linkedList0.size();
        boolean boolean15 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList16 = new system.classfixer.classes.LinkedList();
        int int17 = linkedList16.size();
        linkedList16.clear();
        int int19 = linkedList16.size();
        boolean boolean20 = linkedList16.repOK();
        int int21 = linkedList16.size();
        boolean boolean23 = linkedList16.remove((java.lang.Object) 0);
        boolean boolean25 = linkedList16.remove((java.lang.Object) 0);
        boolean boolean27 = linkedList16.remove((java.lang.Object) (-1.0f));
        int int28 = linkedList16.size();
        int int29 = linkedList16.size();
        boolean boolean30 = linkedList0.add((java.lang.Object) linkedList16);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        boolean boolean11 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList12 = new system.classfixer.classes.LinkedList();
        int int13 = linkedList12.size();
        linkedList12.clear();
        boolean boolean15 = linkedList0.remove((java.lang.Object) linkedList12);
        boolean boolean16 = linkedList12.repOK();
        linkedList12.clear();
        system.classfixer.classes.LinkedList linkedList18 = new system.classfixer.classes.LinkedList();
        int int19 = linkedList18.size();
        linkedList18.clear();
        int int21 = linkedList18.size();
        boolean boolean22 = linkedList18.repOK();
        int int23 = linkedList18.size();
        boolean boolean25 = linkedList18.remove((java.lang.Object) 0);
        boolean boolean27 = linkedList18.remove((java.lang.Object) 0);
        int int28 = linkedList18.size();
        system.classfixer.classes.LinkedList linkedList29 = new system.classfixer.classes.LinkedList();
        linkedList29.clear();
        boolean boolean31 = linkedList29.repOK();
        boolean boolean32 = linkedList29.repOK();
        boolean boolean34 = linkedList29.remove((java.lang.Object) "");
        linkedList29.clear();
        boolean boolean36 = linkedList18.remove((java.lang.Object) linkedList29);
        linkedList18.clear();
        boolean boolean38 = linkedList12.remove((java.lang.Object) linkedList18);
        system.classfixer.classes.LinkedList linkedList39 = new system.classfixer.classes.LinkedList();
        int int40 = linkedList39.size();
        int int41 = linkedList39.size();
        boolean boolean42 = linkedList39.repOK();
        boolean boolean43 = linkedList18.remove((java.lang.Object) linkedList39);
        linkedList18.clear();
        linkedList18.clear();
        system.classfixer.classes.LinkedList linkedList46 = new system.classfixer.classes.LinkedList();
        int int47 = linkedList46.size();
        linkedList46.clear();
        int int49 = linkedList46.size();
        boolean boolean50 = linkedList46.repOK();
        int int51 = linkedList46.size();
        boolean boolean53 = linkedList46.remove((java.lang.Object) 0);
        boolean boolean55 = linkedList46.remove((java.lang.Object) 0);
        linkedList46.clear();
        boolean boolean58 = linkedList46.remove((java.lang.Object) 100);
        int int59 = linkedList46.size();
        system.classfixer.classes.LinkedList linkedList60 = new system.classfixer.classes.LinkedList();
        int int61 = linkedList60.size();
        linkedList60.clear();
        int int63 = linkedList60.size();
        boolean boolean64 = linkedList60.repOK();
        int int65 = linkedList60.size();
        boolean boolean67 = linkedList60.remove((java.lang.Object) 0);
        boolean boolean69 = linkedList60.remove((java.lang.Object) 0);
        int int70 = linkedList60.size();
        boolean boolean71 = linkedList60.repOK();
        int int72 = linkedList60.size();
        boolean boolean73 = linkedList60.repOK();
        boolean boolean74 = linkedList60.repOK();
        boolean boolean75 = linkedList46.remove((java.lang.Object) boolean74);
        linkedList46.clear();
        boolean boolean77 = linkedList18.add((java.lang.Object) linkedList46);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList18", linkedList18.repOK_2());
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean11 = linkedList0.remove((java.lang.Object) (short) -1);
        boolean boolean12 = linkedList0.repOK();
        linkedList0.clear();
        boolean boolean14 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList15 = new system.classfixer.classes.LinkedList();
        int int16 = linkedList15.size();
        linkedList15.clear();
        boolean boolean18 = linkedList15.repOK();
        linkedList15.clear();
        system.classfixer.classes.LinkedList linkedList20 = new system.classfixer.classes.LinkedList();
        linkedList20.clear();
        boolean boolean22 = linkedList20.repOK();
        boolean boolean23 = linkedList15.remove((java.lang.Object) linkedList20);
        int int24 = linkedList15.size();
        int int25 = linkedList15.size();
        boolean boolean26 = linkedList0.add((java.lang.Object) int25);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        boolean boolean3 = linkedList0.repOK();
        linkedList0.clear();
        system.classfixer.classes.LinkedList linkedList5 = new system.classfixer.classes.LinkedList();
        linkedList5.clear();
        boolean boolean7 = linkedList5.repOK();
        boolean boolean8 = linkedList0.remove((java.lang.Object) linkedList5);
        linkedList0.clear();
        system.classfixer.classes.LinkedList linkedList10 = new system.classfixer.classes.LinkedList();
        int int11 = linkedList10.size();
        linkedList10.clear();
        int int13 = linkedList10.size();
        boolean boolean14 = linkedList10.repOK();
        int int15 = linkedList10.size();
        boolean boolean17 = linkedList10.remove((java.lang.Object) 0);
        boolean boolean19 = linkedList10.remove((java.lang.Object) 0);
        linkedList10.clear();
        linkedList10.clear();
        system.classfixer.classes.LinkedList linkedList22 = new system.classfixer.classes.LinkedList();
        linkedList22.clear();
        boolean boolean24 = linkedList22.repOK();
        system.classfixer.classes.LinkedList linkedList25 = new system.classfixer.classes.LinkedList();
        int int26 = linkedList25.size();
        linkedList25.clear();
        int int28 = linkedList25.size();
        boolean boolean29 = linkedList25.repOK();
        int int30 = linkedList25.size();
        boolean boolean32 = linkedList25.remove((java.lang.Object) 0);
        boolean boolean34 = linkedList25.remove((java.lang.Object) 0);
        int int35 = linkedList25.size();
        boolean boolean36 = linkedList25.repOK();
        int int37 = linkedList25.size();
        linkedList25.clear();
        boolean boolean39 = linkedList22.remove((java.lang.Object) linkedList25);
        boolean boolean40 = linkedList10.remove((java.lang.Object) boolean39);
        boolean boolean41 = linkedList0.add((java.lang.Object) boolean39);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean11 = linkedList0.remove((java.lang.Object) (short) -1);
        boolean boolean12 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList13 = new system.classfixer.classes.LinkedList();
        int int14 = linkedList13.size();
        boolean boolean15 = linkedList13.repOK();
        boolean boolean17 = linkedList13.remove((java.lang.Object) (short) 1);
        boolean boolean18 = linkedList0.remove((java.lang.Object) linkedList13);
        system.classfixer.classes.LinkedList linkedList19 = new system.classfixer.classes.LinkedList();
        int int20 = linkedList19.size();
        linkedList19.clear();
        boolean boolean22 = linkedList19.repOK();
        linkedList19.clear();
        int int24 = linkedList19.size();
        system.classfixer.classes.LinkedList linkedList25 = new system.classfixer.classes.LinkedList();
        int int26 = linkedList25.size();
        linkedList25.clear();
        int int28 = linkedList25.size();
        boolean boolean29 = linkedList25.repOK();
        int int30 = linkedList25.size();
        boolean boolean32 = linkedList25.remove((java.lang.Object) 0);
        boolean boolean34 = linkedList25.remove((java.lang.Object) 0);
        int int35 = linkedList25.size();
        system.classfixer.classes.LinkedList linkedList36 = new system.classfixer.classes.LinkedList();
        linkedList36.clear();
        boolean boolean38 = linkedList36.repOK();
        boolean boolean39 = linkedList36.repOK();
        boolean boolean41 = linkedList36.remove((java.lang.Object) "");
        linkedList36.clear();
        boolean boolean43 = linkedList25.remove((java.lang.Object) linkedList36);
        boolean boolean44 = linkedList19.remove((java.lang.Object) linkedList25);
        boolean boolean45 = linkedList13.add((java.lang.Object) boolean44);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList13", linkedList13.repOK_2());
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        boolean boolean11 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList12 = new system.classfixer.classes.LinkedList();
        int int13 = linkedList12.size();
        linkedList12.clear();
        boolean boolean15 = linkedList0.remove((java.lang.Object) linkedList12);
        boolean boolean16 = linkedList12.repOK();
        linkedList12.clear();
        system.classfixer.classes.LinkedList linkedList18 = new system.classfixer.classes.LinkedList();
        int int19 = linkedList18.size();
        linkedList18.clear();
        int int21 = linkedList18.size();
        boolean boolean22 = linkedList18.repOK();
        int int23 = linkedList18.size();
        boolean boolean25 = linkedList18.remove((java.lang.Object) 0);
        boolean boolean27 = linkedList18.remove((java.lang.Object) 0);
        int int28 = linkedList18.size();
        system.classfixer.classes.LinkedList linkedList29 = new system.classfixer.classes.LinkedList();
        linkedList29.clear();
        boolean boolean31 = linkedList29.repOK();
        boolean boolean32 = linkedList29.repOK();
        boolean boolean34 = linkedList29.remove((java.lang.Object) "");
        linkedList29.clear();
        boolean boolean36 = linkedList18.remove((java.lang.Object) linkedList29);
        linkedList18.clear();
        boolean boolean38 = linkedList12.remove((java.lang.Object) linkedList18);
        int int39 = linkedList12.size();
        system.classfixer.classes.LinkedList linkedList40 = new system.classfixer.classes.LinkedList();
        boolean boolean41 = linkedList40.repOK();
        boolean boolean42 = linkedList40.repOK();
        system.classfixer.classes.LinkedList linkedList43 = new system.classfixer.classes.LinkedList();
        int int44 = linkedList43.size();
        linkedList43.clear();
        int int46 = linkedList43.size();
        boolean boolean47 = linkedList43.repOK();
        int int48 = linkedList43.size();
        boolean boolean50 = linkedList43.remove((java.lang.Object) 0);
        boolean boolean52 = linkedList43.remove((java.lang.Object) 0);
        linkedList43.clear();
        linkedList43.clear();
        system.classfixer.classes.LinkedList linkedList55 = new system.classfixer.classes.LinkedList();
        int int56 = linkedList55.size();
        linkedList55.clear();
        int int58 = linkedList55.size();
        boolean boolean59 = linkedList55.repOK();
        int int60 = linkedList55.size();
        boolean boolean62 = linkedList55.remove((java.lang.Object) 0);
        boolean boolean64 = linkedList55.remove((java.lang.Object) 0);
        int int65 = linkedList55.size();
        boolean boolean66 = linkedList55.repOK();
        system.classfixer.classes.LinkedList linkedList67 = new system.classfixer.classes.LinkedList();
        int int68 = linkedList67.size();
        linkedList67.clear();
        boolean boolean70 = linkedList55.remove((java.lang.Object) linkedList67);
        boolean boolean71 = linkedList55.repOK();
        linkedList55.clear();
        linkedList55.clear();
        int int74 = linkedList55.size();
        java.lang.Class<?> wildcardClass75 = linkedList55.getClass();
        boolean boolean76 = linkedList43.remove((java.lang.Object) wildcardClass75);
        boolean boolean77 = linkedList40.remove((java.lang.Object) linkedList43);
        system.classfixer.classes.LinkedList linkedList78 = new system.classfixer.classes.LinkedList();
        boolean boolean79 = linkedList78.repOK();
        linkedList78.clear();
        int int81 = linkedList78.size();
        boolean boolean82 = linkedList40.remove((java.lang.Object) linkedList78);
        boolean boolean83 = linkedList12.add((java.lang.Object) linkedList78);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList12", linkedList12.repOK_2());
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        linkedList0.clear();
        boolean boolean2 = linkedList0.repOK();
        boolean boolean3 = linkedList0.repOK();
        boolean boolean5 = linkedList0.remove((java.lang.Object) '#');
        boolean boolean7 = linkedList0.remove((java.lang.Object) 1.0f);
        system.classfixer.classes.LinkedList linkedList8 = new system.classfixer.classes.LinkedList();
        boolean boolean9 = linkedList8.repOK();
        boolean boolean10 = linkedList8.repOK();
        boolean boolean11 = linkedList0.add((java.lang.Object) linkedList8);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        boolean boolean11 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList12 = new system.classfixer.classes.LinkedList();
        int int13 = linkedList12.size();
        linkedList12.clear();
        boolean boolean15 = linkedList0.remove((java.lang.Object) linkedList12);
        boolean boolean16 = linkedList0.repOK();
        linkedList0.clear();
        linkedList0.clear();
        system.classfixer.classes.LinkedList linkedList19 = new system.classfixer.classes.LinkedList();
        boolean boolean20 = linkedList19.repOK();
        boolean boolean21 = linkedList19.repOK();
        system.classfixer.classes.LinkedList linkedList22 = new system.classfixer.classes.LinkedList();
        int int23 = linkedList22.size();
        linkedList22.clear();
        boolean boolean26 = linkedList22.remove((java.lang.Object) (-1.0f));
        int int27 = linkedList22.size();
        boolean boolean28 = linkedList19.remove((java.lang.Object) linkedList22);
        boolean boolean29 = linkedList0.add((java.lang.Object) linkedList22);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        boolean boolean1 = linkedList0.repOK();
        boolean boolean2 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList3 = new system.classfixer.classes.LinkedList();
        int int4 = linkedList3.size();
        linkedList3.clear();
        boolean boolean7 = linkedList3.remove((java.lang.Object) (-1.0f));
        int int8 = linkedList3.size();
        boolean boolean9 = linkedList0.remove((java.lang.Object) linkedList3);
        int int10 = linkedList3.size();
        boolean boolean11 = linkedList3.repOK();
        int int12 = linkedList3.size();
        system.classfixer.classes.LinkedList linkedList13 = new system.classfixer.classes.LinkedList();
        int int14 = linkedList13.size();
        linkedList13.clear();
        int int16 = linkedList13.size();
        boolean boolean17 = linkedList13.repOK();
        int int18 = linkedList13.size();
        boolean boolean20 = linkedList13.remove((java.lang.Object) 0);
        boolean boolean22 = linkedList13.remove((java.lang.Object) 0);
        boolean boolean24 = linkedList13.remove((java.lang.Object) (short) -1);
        boolean boolean25 = linkedList13.repOK();
        system.classfixer.classes.LinkedList linkedList26 = new system.classfixer.classes.LinkedList();
        int int27 = linkedList26.size();
        linkedList26.clear();
        int int29 = linkedList26.size();
        boolean boolean30 = linkedList26.repOK();
        int int31 = linkedList26.size();
        boolean boolean33 = linkedList26.remove((java.lang.Object) 0);
        boolean boolean34 = linkedList13.remove((java.lang.Object) 0);
        boolean boolean35 = linkedList13.repOK();
        boolean boolean36 = linkedList13.repOK();
        linkedList13.clear();
        boolean boolean38 = linkedList13.repOK();
        boolean boolean39 = linkedList3.add((java.lang.Object) linkedList13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList3", linkedList3.repOK_2());
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        boolean boolean1 = linkedList0.repOK();
        boolean boolean2 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList3 = new system.classfixer.classes.LinkedList();
        int int4 = linkedList3.size();
        linkedList3.clear();
        boolean boolean7 = linkedList3.remove((java.lang.Object) (-1.0f));
        int int8 = linkedList3.size();
        boolean boolean9 = linkedList0.remove((java.lang.Object) linkedList3);
        int int10 = linkedList3.size();
        boolean boolean11 = linkedList3.repOK();
        system.classfixer.classes.LinkedList linkedList12 = new system.classfixer.classes.LinkedList();
        int int13 = linkedList12.size();
        linkedList12.clear();
        int int15 = linkedList12.size();
        boolean boolean16 = linkedList12.repOK();
        int int17 = linkedList12.size();
        boolean boolean19 = linkedList12.remove((java.lang.Object) 0);
        boolean boolean21 = linkedList12.remove((java.lang.Object) 0);
        int int22 = linkedList12.size();
        boolean boolean23 = linkedList12.repOK();
        system.classfixer.classes.LinkedList linkedList24 = new system.classfixer.classes.LinkedList();
        int int25 = linkedList24.size();
        linkedList24.clear();
        boolean boolean27 = linkedList12.remove((java.lang.Object) linkedList24);
        boolean boolean28 = linkedList24.repOK();
        boolean boolean29 = linkedList24.repOK();
        int int30 = linkedList24.size();
        system.classfixer.classes.LinkedList linkedList31 = new system.classfixer.classes.LinkedList();
        int int32 = linkedList31.size();
        linkedList31.clear();
        int int34 = linkedList31.size();
        boolean boolean35 = linkedList31.repOK();
        int int36 = linkedList31.size();
        boolean boolean38 = linkedList31.remove((java.lang.Object) 0);
        boolean boolean40 = linkedList31.remove((java.lang.Object) 0);
        int int41 = linkedList31.size();
        boolean boolean42 = linkedList31.repOK();
        system.classfixer.classes.LinkedList linkedList43 = new system.classfixer.classes.LinkedList();
        int int44 = linkedList43.size();
        linkedList43.clear();
        boolean boolean46 = linkedList31.remove((java.lang.Object) linkedList43);
        boolean boolean47 = linkedList43.repOK();
        boolean boolean48 = linkedList43.repOK();
        boolean boolean50 = linkedList43.remove((java.lang.Object) (-1.0d));
        system.classfixer.classes.LinkedList linkedList51 = new system.classfixer.classes.LinkedList();
        int int52 = linkedList51.size();
        linkedList51.clear();
        boolean boolean54 = linkedList51.repOK();
        linkedList51.clear();
        system.classfixer.classes.LinkedList linkedList56 = new system.classfixer.classes.LinkedList();
        linkedList56.clear();
        boolean boolean58 = linkedList56.repOK();
        boolean boolean59 = linkedList51.remove((java.lang.Object) linkedList56);
        linkedList51.clear();
        boolean boolean61 = linkedList43.remove((java.lang.Object) linkedList51);
        boolean boolean62 = linkedList24.remove((java.lang.Object) boolean61);
        boolean boolean63 = linkedList3.remove((java.lang.Object) linkedList24);
        system.classfixer.classes.LinkedList linkedList64 = new system.classfixer.classes.LinkedList();
        int int65 = linkedList64.size();
        linkedList64.clear();
        int int67 = linkedList64.size();
        boolean boolean68 = linkedList64.repOK();
        int int69 = linkedList64.size();
        boolean boolean71 = linkedList64.remove((java.lang.Object) 0);
        boolean boolean73 = linkedList64.remove((java.lang.Object) 0);
        int int74 = linkedList64.size();
        boolean boolean75 = linkedList64.repOK();
        int int76 = linkedList64.size();
        boolean boolean77 = linkedList64.repOK();
        system.classfixer.classes.LinkedList linkedList78 = new system.classfixer.classes.LinkedList();
        boolean boolean79 = linkedList78.repOK();
        linkedList78.clear();
        int int81 = linkedList78.size();
        boolean boolean82 = linkedList78.repOK();
        java.lang.Class<?> wildcardClass83 = linkedList78.getClass();
        boolean boolean84 = linkedList64.remove((java.lang.Object) wildcardClass83);
        boolean boolean85 = linkedList24.add((java.lang.Object) boolean84);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList24", linkedList24.repOK_2());
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        boolean boolean11 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList12 = new system.classfixer.classes.LinkedList();
        int int13 = linkedList12.size();
        linkedList12.clear();
        boolean boolean15 = linkedList0.remove((java.lang.Object) linkedList12);
        boolean boolean16 = linkedList12.repOK();
        boolean boolean17 = linkedList12.repOK();
        boolean boolean19 = linkedList12.remove((java.lang.Object) (-1.0d));
        java.lang.Object obj20 = null;
        boolean boolean21 = linkedList12.add(obj20);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList12", linkedList12.repOK_2());
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean11 = linkedList0.remove((java.lang.Object) (short) -1);
        boolean boolean12 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList13 = new system.classfixer.classes.LinkedList();
        int int14 = linkedList13.size();
        boolean boolean15 = linkedList13.repOK();
        boolean boolean17 = linkedList13.remove((java.lang.Object) (short) 1);
        boolean boolean18 = linkedList0.remove((java.lang.Object) linkedList13);
        system.classfixer.classes.LinkedList linkedList19 = new system.classfixer.classes.LinkedList();
        int int20 = linkedList19.size();
        linkedList19.clear();
        int int22 = linkedList19.size();
        boolean boolean23 = linkedList19.repOK();
        int int24 = linkedList19.size();
        boolean boolean26 = linkedList19.remove((java.lang.Object) 0);
        boolean boolean28 = linkedList19.remove((java.lang.Object) 0);
        int int29 = linkedList19.size();
        boolean boolean30 = linkedList19.repOK();
        system.classfixer.classes.LinkedList linkedList31 = new system.classfixer.classes.LinkedList();
        int int32 = linkedList31.size();
        linkedList31.clear();
        boolean boolean34 = linkedList19.remove((java.lang.Object) linkedList31);
        boolean boolean35 = linkedList31.repOK();
        linkedList31.clear();
        int int37 = linkedList31.size();
        boolean boolean38 = linkedList0.remove((java.lang.Object) int37);
        system.classfixer.classes.LinkedList linkedList39 = new system.classfixer.classes.LinkedList();
        int int40 = linkedList39.size();
        linkedList39.clear();
        int int42 = linkedList39.size();
        boolean boolean43 = linkedList39.repOK();
        int int44 = linkedList39.size();
        boolean boolean46 = linkedList39.remove((java.lang.Object) 0);
        boolean boolean48 = linkedList39.remove((java.lang.Object) 0);
        int int49 = linkedList39.size();
        boolean boolean50 = linkedList39.repOK();
        system.classfixer.classes.LinkedList linkedList51 = new system.classfixer.classes.LinkedList();
        int int52 = linkedList51.size();
        linkedList51.clear();
        boolean boolean54 = linkedList39.remove((java.lang.Object) linkedList51);
        java.lang.Class<?> wildcardClass55 = linkedList39.getClass();
        boolean boolean56 = linkedList0.remove((java.lang.Object) linkedList39);
        system.classfixer.classes.LinkedList linkedList57 = new system.classfixer.classes.LinkedList();
        int int58 = linkedList57.size();
        linkedList57.clear();
        int int60 = linkedList57.size();
        boolean boolean61 = linkedList57.repOK();
        int int62 = linkedList57.size();
        boolean boolean64 = linkedList57.remove((java.lang.Object) 0);
        boolean boolean66 = linkedList57.remove((java.lang.Object) 0);
        int int67 = linkedList57.size();
        boolean boolean68 = linkedList57.repOK();
        system.classfixer.classes.LinkedList linkedList69 = new system.classfixer.classes.LinkedList();
        int int70 = linkedList69.size();
        linkedList69.clear();
        boolean boolean72 = linkedList57.remove((java.lang.Object) linkedList69);
        int int73 = linkedList69.size();
        linkedList69.clear();
        int int75 = linkedList69.size();
        linkedList69.clear();
        boolean boolean77 = linkedList0.add((java.lang.Object) linkedList69);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        boolean boolean11 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList12 = new system.classfixer.classes.LinkedList();
        int int13 = linkedList12.size();
        linkedList12.clear();
        boolean boolean15 = linkedList0.remove((java.lang.Object) linkedList12);
        boolean boolean16 = linkedList12.repOK();
        boolean boolean17 = linkedList12.repOK();
        int int18 = linkedList12.size();
        system.classfixer.classes.LinkedList linkedList19 = new system.classfixer.classes.LinkedList();
        int int20 = linkedList19.size();
        linkedList19.clear();
        int int22 = linkedList19.size();
        boolean boolean23 = linkedList19.repOK();
        int int24 = linkedList19.size();
        boolean boolean26 = linkedList19.remove((java.lang.Object) 0);
        boolean boolean28 = linkedList19.remove((java.lang.Object) 0);
        int int29 = linkedList19.size();
        boolean boolean30 = linkedList19.repOK();
        system.classfixer.classes.LinkedList linkedList31 = new system.classfixer.classes.LinkedList();
        int int32 = linkedList31.size();
        linkedList31.clear();
        boolean boolean34 = linkedList19.remove((java.lang.Object) linkedList31);
        boolean boolean35 = linkedList31.repOK();
        boolean boolean36 = linkedList31.repOK();
        boolean boolean38 = linkedList31.remove((java.lang.Object) (-1.0d));
        system.classfixer.classes.LinkedList linkedList39 = new system.classfixer.classes.LinkedList();
        int int40 = linkedList39.size();
        linkedList39.clear();
        boolean boolean42 = linkedList39.repOK();
        linkedList39.clear();
        system.classfixer.classes.LinkedList linkedList44 = new system.classfixer.classes.LinkedList();
        linkedList44.clear();
        boolean boolean46 = linkedList44.repOK();
        boolean boolean47 = linkedList39.remove((java.lang.Object) linkedList44);
        linkedList39.clear();
        boolean boolean49 = linkedList31.remove((java.lang.Object) linkedList39);
        boolean boolean50 = linkedList12.remove((java.lang.Object) boolean49);
        int int51 = linkedList12.size();
        system.classfixer.classes.LinkedList linkedList52 = new system.classfixer.classes.LinkedList();
        int int53 = linkedList52.size();
        linkedList52.clear();
        int int55 = linkedList52.size();
        boolean boolean56 = linkedList52.repOK();
        int int57 = linkedList52.size();
        boolean boolean59 = linkedList52.remove((java.lang.Object) 0);
        boolean boolean61 = linkedList52.remove((java.lang.Object) 0);
        boolean boolean63 = linkedList52.remove((java.lang.Object) (short) -1);
        boolean boolean64 = linkedList52.repOK();
        system.classfixer.classes.LinkedList linkedList65 = new system.classfixer.classes.LinkedList();
        int int66 = linkedList65.size();
        boolean boolean67 = linkedList65.repOK();
        boolean boolean69 = linkedList65.remove((java.lang.Object) (short) 1);
        boolean boolean70 = linkedList52.remove((java.lang.Object) linkedList65);
        boolean boolean71 = linkedList12.add((java.lang.Object) boolean70);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList12", linkedList12.repOK_2());
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        boolean boolean11 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList12 = new system.classfixer.classes.LinkedList();
        int int13 = linkedList12.size();
        linkedList12.clear();
        boolean boolean15 = linkedList0.remove((java.lang.Object) linkedList12);
        boolean boolean16 = linkedList12.repOK();
        boolean boolean17 = linkedList12.repOK();
        int int18 = linkedList12.size();
        system.classfixer.classes.LinkedList linkedList19 = new system.classfixer.classes.LinkedList();
        int int20 = linkedList19.size();
        linkedList19.clear();
        int int22 = linkedList19.size();
        boolean boolean23 = linkedList19.repOK();
        int int24 = linkedList19.size();
        boolean boolean26 = linkedList19.remove((java.lang.Object) 0);
        boolean boolean28 = linkedList19.remove((java.lang.Object) 0);
        int int29 = linkedList19.size();
        boolean boolean30 = linkedList19.repOK();
        system.classfixer.classes.LinkedList linkedList31 = new system.classfixer.classes.LinkedList();
        int int32 = linkedList31.size();
        linkedList31.clear();
        boolean boolean34 = linkedList19.remove((java.lang.Object) linkedList31);
        boolean boolean35 = linkedList31.repOK();
        boolean boolean36 = linkedList31.repOK();
        boolean boolean38 = linkedList31.remove((java.lang.Object) (-1.0d));
        system.classfixer.classes.LinkedList linkedList39 = new system.classfixer.classes.LinkedList();
        int int40 = linkedList39.size();
        linkedList39.clear();
        boolean boolean42 = linkedList39.repOK();
        linkedList39.clear();
        system.classfixer.classes.LinkedList linkedList44 = new system.classfixer.classes.LinkedList();
        linkedList44.clear();
        boolean boolean46 = linkedList44.repOK();
        boolean boolean47 = linkedList39.remove((java.lang.Object) linkedList44);
        linkedList39.clear();
        boolean boolean49 = linkedList31.remove((java.lang.Object) linkedList39);
        boolean boolean50 = linkedList12.remove((java.lang.Object) boolean49);
        int int51 = linkedList12.size();
        system.classfixer.classes.LinkedList linkedList52 = new system.classfixer.classes.LinkedList();
        int int53 = linkedList52.size();
        linkedList52.clear();
        int int55 = linkedList52.size();
        boolean boolean56 = linkedList52.repOK();
        int int57 = linkedList52.size();
        boolean boolean59 = linkedList52.remove((java.lang.Object) 0);
        boolean boolean61 = linkedList52.remove((java.lang.Object) 0);
        int int62 = linkedList52.size();
        boolean boolean63 = linkedList52.repOK();
        int int64 = linkedList52.size();
        boolean boolean65 = linkedList52.repOK();
        system.classfixer.classes.LinkedList linkedList66 = new system.classfixer.classes.LinkedList();
        boolean boolean67 = linkedList66.repOK();
        linkedList66.clear();
        int int69 = linkedList66.size();
        boolean boolean70 = linkedList66.repOK();
        java.lang.Class<?> wildcardClass71 = linkedList66.getClass();
        boolean boolean72 = linkedList52.remove((java.lang.Object) wildcardClass71);
        boolean boolean73 = linkedList12.add((java.lang.Object) wildcardClass71);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList12", linkedList12.repOK_2());
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        boolean boolean3 = linkedList0.repOK();
        linkedList0.clear();
        int int5 = linkedList0.size();
        system.classfixer.classes.LinkedList linkedList6 = new system.classfixer.classes.LinkedList();
        int int7 = linkedList6.size();
        linkedList6.clear();
        int int9 = linkedList6.size();
        boolean boolean10 = linkedList6.repOK();
        int int11 = linkedList6.size();
        boolean boolean13 = linkedList6.remove((java.lang.Object) 0);
        boolean boolean15 = linkedList6.remove((java.lang.Object) 0);
        int int16 = linkedList6.size();
        system.classfixer.classes.LinkedList linkedList17 = new system.classfixer.classes.LinkedList();
        linkedList17.clear();
        boolean boolean19 = linkedList17.repOK();
        boolean boolean20 = linkedList17.repOK();
        boolean boolean22 = linkedList17.remove((java.lang.Object) "");
        linkedList17.clear();
        boolean boolean24 = linkedList6.remove((java.lang.Object) linkedList17);
        boolean boolean25 = linkedList0.remove((java.lang.Object) linkedList6);
        boolean boolean26 = linkedList6.repOK();
        system.classfixer.classes.LinkedList linkedList27 = new system.classfixer.classes.LinkedList();
        linkedList27.clear();
        boolean boolean29 = linkedList27.repOK();
        system.classfixer.classes.LinkedList linkedList30 = new system.classfixer.classes.LinkedList();
        int int31 = linkedList30.size();
        linkedList30.clear();
        int int33 = linkedList30.size();
        boolean boolean34 = linkedList30.repOK();
        int int35 = linkedList30.size();
        boolean boolean37 = linkedList30.remove((java.lang.Object) 0);
        boolean boolean39 = linkedList30.remove((java.lang.Object) 0);
        int int40 = linkedList30.size();
        boolean boolean41 = linkedList30.repOK();
        int int42 = linkedList30.size();
        linkedList30.clear();
        boolean boolean44 = linkedList27.remove((java.lang.Object) linkedList30);
        boolean boolean45 = linkedList6.add((java.lang.Object) linkedList27);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList6", linkedList6.repOK_2());
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        boolean boolean11 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList12 = new system.classfixer.classes.LinkedList();
        int int13 = linkedList12.size();
        linkedList12.clear();
        boolean boolean15 = linkedList0.remove((java.lang.Object) linkedList12);
        system.classfixer.classes.LinkedList linkedList16 = new system.classfixer.classes.LinkedList();
        int int17 = linkedList16.size();
        linkedList16.clear();
        int int19 = linkedList16.size();
        boolean boolean20 = linkedList16.repOK();
        int int21 = linkedList16.size();
        boolean boolean23 = linkedList16.remove((java.lang.Object) 0);
        boolean boolean25 = linkedList16.remove((java.lang.Object) 0);
        int int26 = linkedList16.size();
        boolean boolean27 = linkedList16.repOK();
        system.classfixer.classes.LinkedList linkedList28 = new system.classfixer.classes.LinkedList();
        int int29 = linkedList28.size();
        linkedList28.clear();
        boolean boolean31 = linkedList16.remove((java.lang.Object) linkedList28);
        boolean boolean32 = linkedList28.repOK();
        linkedList28.clear();
        system.classfixer.classes.LinkedList linkedList34 = new system.classfixer.classes.LinkedList();
        int int35 = linkedList34.size();
        linkedList34.clear();
        int int37 = linkedList34.size();
        boolean boolean38 = linkedList34.repOK();
        int int39 = linkedList34.size();
        boolean boolean41 = linkedList34.remove((java.lang.Object) 0);
        boolean boolean43 = linkedList34.remove((java.lang.Object) 0);
        int int44 = linkedList34.size();
        boolean boolean45 = linkedList34.repOK();
        system.classfixer.classes.LinkedList linkedList46 = new system.classfixer.classes.LinkedList();
        int int47 = linkedList46.size();
        linkedList46.clear();
        boolean boolean49 = linkedList34.remove((java.lang.Object) linkedList46);
        java.lang.Class<?> wildcardClass50 = linkedList46.getClass();
        boolean boolean51 = linkedList28.remove((java.lang.Object) linkedList46);
        boolean boolean52 = linkedList28.repOK();
        int int53 = linkedList28.size();
        system.classfixer.classes.LinkedList linkedList54 = new system.classfixer.classes.LinkedList();
        int int55 = linkedList54.size();
        linkedList54.clear();
        int int57 = linkedList54.size();
        boolean boolean58 = linkedList54.repOK();
        int int59 = linkedList54.size();
        boolean boolean61 = linkedList54.remove((java.lang.Object) 0);
        boolean boolean63 = linkedList54.remove((java.lang.Object) 0);
        int int64 = linkedList54.size();
        boolean boolean65 = linkedList54.repOK();
        system.classfixer.classes.LinkedList linkedList66 = new system.classfixer.classes.LinkedList();
        int int67 = linkedList66.size();
        linkedList66.clear();
        boolean boolean69 = linkedList54.remove((java.lang.Object) linkedList66);
        int int70 = linkedList54.size();
        int int71 = linkedList54.size();
        boolean boolean72 = linkedList28.remove((java.lang.Object) int71);
        boolean boolean73 = linkedList12.add((java.lang.Object) linkedList28);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList12", linkedList12.repOK_2());
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        boolean boolean3 = linkedList0.repOK();
        linkedList0.clear();
        int int5 = linkedList0.size();
        system.classfixer.classes.LinkedList linkedList6 = new system.classfixer.classes.LinkedList();
        int int7 = linkedList6.size();
        linkedList6.clear();
        int int9 = linkedList6.size();
        boolean boolean10 = linkedList6.repOK();
        int int11 = linkedList6.size();
        boolean boolean13 = linkedList6.remove((java.lang.Object) 0);
        boolean boolean15 = linkedList6.remove((java.lang.Object) 0);
        boolean boolean17 = linkedList6.remove((java.lang.Object) (short) -1);
        boolean boolean18 = linkedList6.repOK();
        system.classfixer.classes.LinkedList linkedList19 = new system.classfixer.classes.LinkedList();
        int int20 = linkedList19.size();
        boolean boolean21 = linkedList19.repOK();
        boolean boolean23 = linkedList19.remove((java.lang.Object) (short) 1);
        boolean boolean24 = linkedList6.remove((java.lang.Object) linkedList19);
        system.classfixer.classes.LinkedList linkedList25 = new system.classfixer.classes.LinkedList();
        int int26 = linkedList25.size();
        linkedList25.clear();
        int int28 = linkedList25.size();
        boolean boolean29 = linkedList25.repOK();
        int int30 = linkedList25.size();
        boolean boolean32 = linkedList25.remove((java.lang.Object) 0);
        boolean boolean34 = linkedList25.remove((java.lang.Object) 0);
        boolean boolean36 = linkedList25.remove((java.lang.Object) (short) -1);
        boolean boolean37 = linkedList25.repOK();
        system.classfixer.classes.LinkedList linkedList38 = new system.classfixer.classes.LinkedList();
        int int39 = linkedList38.size();
        boolean boolean40 = linkedList38.repOK();
        boolean boolean42 = linkedList38.remove((java.lang.Object) (short) 1);
        boolean boolean43 = linkedList25.remove((java.lang.Object) linkedList38);
        boolean boolean44 = linkedList6.remove((java.lang.Object) linkedList25);
        boolean boolean45 = linkedList6.repOK();
        system.classfixer.classes.LinkedList linkedList46 = new system.classfixer.classes.LinkedList();
        int int47 = linkedList46.size();
        linkedList46.clear();
        int int49 = linkedList46.size();
        boolean boolean50 = linkedList46.repOK();
        int int51 = linkedList46.size();
        boolean boolean53 = linkedList46.remove((java.lang.Object) 0);
        boolean boolean55 = linkedList46.remove((java.lang.Object) 0);
        linkedList46.clear();
        boolean boolean58 = linkedList46.remove((java.lang.Object) 100);
        int int59 = linkedList46.size();
        system.classfixer.classes.LinkedList linkedList60 = new system.classfixer.classes.LinkedList();
        int int61 = linkedList60.size();
        linkedList60.clear();
        int int63 = linkedList60.size();
        boolean boolean64 = linkedList60.repOK();
        int int65 = linkedList60.size();
        boolean boolean67 = linkedList60.remove((java.lang.Object) 0);
        boolean boolean69 = linkedList60.remove((java.lang.Object) 0);
        int int70 = linkedList60.size();
        boolean boolean71 = linkedList60.repOK();
        int int72 = linkedList60.size();
        boolean boolean73 = linkedList60.repOK();
        boolean boolean74 = linkedList60.repOK();
        boolean boolean75 = linkedList46.remove((java.lang.Object) boolean74);
        boolean boolean77 = linkedList46.remove((java.lang.Object) 100L);
        boolean boolean78 = linkedList6.remove((java.lang.Object) linkedList46);
        boolean boolean79 = linkedList0.remove((java.lang.Object) linkedList46);
        boolean boolean80 = linkedList46.repOK();
        system.classfixer.classes.LinkedList linkedList81 = new system.classfixer.classes.LinkedList();
        int int82 = linkedList81.size();
        linkedList81.clear();
        int int84 = linkedList81.size();
        boolean boolean85 = linkedList81.repOK();
        int int86 = linkedList81.size();
        boolean boolean88 = linkedList81.remove((java.lang.Object) 0);
        boolean boolean90 = linkedList81.remove((java.lang.Object) 0);
        int int91 = linkedList81.size();
        boolean boolean92 = linkedList81.repOK();
        system.classfixer.classes.LinkedList linkedList93 = new system.classfixer.classes.LinkedList();
        int int94 = linkedList93.size();
        linkedList93.clear();
        boolean boolean96 = linkedList81.remove((java.lang.Object) linkedList93);
        int int97 = linkedList81.size();
        boolean boolean98 = linkedList46.add((java.lang.Object) linkedList81);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList46", linkedList46.repOK_2());
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        linkedList0.clear();
        boolean boolean12 = linkedList0.remove((java.lang.Object) 100);
        int int13 = linkedList0.size();
        int int14 = linkedList0.size();
        system.classfixer.classes.LinkedList linkedList15 = new system.classfixer.classes.LinkedList();
        int int16 = linkedList15.size();
        linkedList15.clear();
        int int18 = linkedList15.size();
        boolean boolean19 = linkedList15.repOK();
        int int20 = linkedList15.size();
        boolean boolean22 = linkedList15.remove((java.lang.Object) 0);
        boolean boolean24 = linkedList15.remove((java.lang.Object) 0);
        int int25 = linkedList15.size();
        boolean boolean26 = linkedList15.repOK();
        system.classfixer.classes.LinkedList linkedList27 = new system.classfixer.classes.LinkedList();
        int int28 = linkedList27.size();
        linkedList27.clear();
        boolean boolean30 = linkedList15.remove((java.lang.Object) linkedList27);
        boolean boolean31 = linkedList27.repOK();
        system.classfixer.classes.LinkedList linkedList32 = new system.classfixer.classes.LinkedList();
        int int33 = linkedList32.size();
        linkedList32.clear();
        int int35 = linkedList32.size();
        boolean boolean36 = linkedList32.repOK();
        int int37 = linkedList32.size();
        boolean boolean39 = linkedList32.remove((java.lang.Object) 0);
        boolean boolean41 = linkedList32.remove((java.lang.Object) 0);
        boolean boolean43 = linkedList32.remove((java.lang.Object) (short) -1);
        boolean boolean44 = linkedList32.repOK();
        system.classfixer.classes.LinkedList linkedList45 = new system.classfixer.classes.LinkedList();
        int int46 = linkedList45.size();
        boolean boolean47 = linkedList45.repOK();
        boolean boolean49 = linkedList45.remove((java.lang.Object) (short) 1);
        boolean boolean50 = linkedList32.remove((java.lang.Object) linkedList45);
        system.classfixer.classes.LinkedList linkedList51 = new system.classfixer.classes.LinkedList();
        int int52 = linkedList51.size();
        linkedList51.clear();
        int int54 = linkedList51.size();
        boolean boolean55 = linkedList51.repOK();
        int int56 = linkedList51.size();
        boolean boolean58 = linkedList51.remove((java.lang.Object) 0);
        boolean boolean60 = linkedList51.remove((java.lang.Object) 0);
        boolean boolean62 = linkedList51.remove((java.lang.Object) (short) -1);
        boolean boolean63 = linkedList51.repOK();
        system.classfixer.classes.LinkedList linkedList64 = new system.classfixer.classes.LinkedList();
        int int65 = linkedList64.size();
        boolean boolean66 = linkedList64.repOK();
        boolean boolean68 = linkedList64.remove((java.lang.Object) (short) 1);
        boolean boolean69 = linkedList51.remove((java.lang.Object) linkedList64);
        boolean boolean70 = linkedList32.remove((java.lang.Object) linkedList51);
        system.classfixer.classes.LinkedList linkedList71 = new system.classfixer.classes.LinkedList();
        int int72 = linkedList71.size();
        linkedList71.clear();
        int int74 = linkedList71.size();
        boolean boolean75 = linkedList71.repOK();
        int int76 = linkedList71.size();
        boolean boolean78 = linkedList71.remove((java.lang.Object) 0);
        boolean boolean80 = linkedList71.remove((java.lang.Object) 0);
        int int81 = linkedList71.size();
        int int82 = linkedList71.size();
        boolean boolean83 = linkedList51.remove((java.lang.Object) int82);
        boolean boolean84 = linkedList51.repOK();
        java.lang.Class<?> wildcardClass85 = linkedList51.getClass();
        boolean boolean86 = linkedList27.remove((java.lang.Object) wildcardClass85);
        boolean boolean87 = linkedList0.add((java.lang.Object) wildcardClass85);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        boolean boolean11 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList12 = new system.classfixer.classes.LinkedList();
        int int13 = linkedList12.size();
        linkedList12.clear();
        boolean boolean15 = linkedList0.remove((java.lang.Object) linkedList12);
        int int16 = linkedList12.size();
        int int17 = linkedList12.size();
        boolean boolean18 = linkedList12.repOK();
        system.classfixer.classes.LinkedList linkedList19 = new system.classfixer.classes.LinkedList();
        int int20 = linkedList19.size();
        linkedList19.clear();
        int int22 = linkedList19.size();
        boolean boolean23 = linkedList19.repOK();
        boolean boolean24 = linkedList19.repOK();
        system.classfixer.classes.LinkedList linkedList25 = new system.classfixer.classes.LinkedList();
        int int26 = linkedList25.size();
        linkedList25.clear();
        int int28 = linkedList25.size();
        boolean boolean29 = linkedList25.repOK();
        int int30 = linkedList25.size();
        boolean boolean32 = linkedList25.remove((java.lang.Object) 0);
        boolean boolean34 = linkedList25.remove((java.lang.Object) 0);
        int int35 = linkedList25.size();
        system.classfixer.classes.LinkedList linkedList36 = new system.classfixer.classes.LinkedList();
        linkedList36.clear();
        boolean boolean38 = linkedList36.repOK();
        boolean boolean39 = linkedList36.repOK();
        boolean boolean41 = linkedList36.remove((java.lang.Object) "");
        linkedList36.clear();
        boolean boolean43 = linkedList25.remove((java.lang.Object) linkedList36);
        system.classfixer.classes.LinkedList linkedList44 = new system.classfixer.classes.LinkedList();
        int int45 = linkedList44.size();
        linkedList44.clear();
        int int47 = linkedList44.size();
        boolean boolean48 = linkedList44.repOK();
        int int49 = linkedList44.size();
        boolean boolean51 = linkedList44.remove((java.lang.Object) 0);
        boolean boolean53 = linkedList44.remove((java.lang.Object) 0);
        int int54 = linkedList44.size();
        boolean boolean55 = linkedList44.repOK();
        system.classfixer.classes.LinkedList linkedList56 = new system.classfixer.classes.LinkedList();
        int int57 = linkedList56.size();
        linkedList56.clear();
        boolean boolean59 = linkedList44.remove((java.lang.Object) linkedList56);
        boolean boolean60 = linkedList44.repOK();
        linkedList44.clear();
        linkedList44.clear();
        int int63 = linkedList44.size();
        int int64 = linkedList44.size();
        int int65 = linkedList44.size();
        boolean boolean66 = linkedList25.remove((java.lang.Object) linkedList44);
        system.classfixer.classes.LinkedList linkedList67 = new system.classfixer.classes.LinkedList();
        int int68 = linkedList67.size();
        linkedList67.clear();
        int int70 = linkedList67.size();
        boolean boolean71 = linkedList67.repOK();
        int int72 = linkedList67.size();
        boolean boolean74 = linkedList67.remove((java.lang.Object) 0);
        boolean boolean76 = linkedList67.remove((java.lang.Object) 0);
        boolean boolean77 = linkedList44.remove((java.lang.Object) linkedList67);
        boolean boolean78 = linkedList19.remove((java.lang.Object) linkedList67);
        boolean boolean79 = linkedList12.add((java.lang.Object) linkedList67);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList12", linkedList12.repOK_2());
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        system.classfixer.classes.LinkedList linkedList2 = new system.classfixer.classes.LinkedList();
        int int3 = linkedList2.size();
        linkedList2.clear();
        boolean boolean5 = linkedList2.repOK();
        linkedList2.clear();
        int int7 = linkedList2.size();
        linkedList2.clear();
        boolean boolean9 = linkedList2.repOK();
        system.classfixer.classes.LinkedList linkedList10 = new system.classfixer.classes.LinkedList();
        int int11 = linkedList10.size();
        linkedList10.clear();
        int int13 = linkedList10.size();
        boolean boolean14 = linkedList10.repOK();
        int int15 = linkedList10.size();
        boolean boolean17 = linkedList10.remove((java.lang.Object) 0);
        boolean boolean19 = linkedList10.remove((java.lang.Object) 0);
        int int20 = linkedList10.size();
        boolean boolean21 = linkedList10.repOK();
        system.classfixer.classes.LinkedList linkedList22 = new system.classfixer.classes.LinkedList();
        int int23 = linkedList22.size();
        linkedList22.clear();
        boolean boolean25 = linkedList10.remove((java.lang.Object) linkedList22);
        boolean boolean26 = linkedList22.repOK();
        linkedList22.clear();
        system.classfixer.classes.LinkedList linkedList28 = new system.classfixer.classes.LinkedList();
        int int29 = linkedList28.size();
        linkedList28.clear();
        int int31 = linkedList28.size();
        boolean boolean32 = linkedList28.repOK();
        int int33 = linkedList28.size();
        boolean boolean35 = linkedList28.remove((java.lang.Object) 0);
        boolean boolean37 = linkedList28.remove((java.lang.Object) 0);
        int int38 = linkedList28.size();
        system.classfixer.classes.LinkedList linkedList39 = new system.classfixer.classes.LinkedList();
        linkedList39.clear();
        boolean boolean41 = linkedList39.repOK();
        boolean boolean42 = linkedList39.repOK();
        boolean boolean44 = linkedList39.remove((java.lang.Object) "");
        linkedList39.clear();
        boolean boolean46 = linkedList28.remove((java.lang.Object) linkedList39);
        linkedList28.clear();
        boolean boolean48 = linkedList22.remove((java.lang.Object) linkedList28);
        system.classfixer.classes.LinkedList linkedList49 = new system.classfixer.classes.LinkedList();
        int int50 = linkedList49.size();
        int int51 = linkedList49.size();
        boolean boolean52 = linkedList49.repOK();
        boolean boolean53 = linkedList28.remove((java.lang.Object) linkedList49);
        system.classfixer.classes.LinkedList linkedList54 = new system.classfixer.classes.LinkedList();
        int int55 = linkedList54.size();
        linkedList54.clear();
        int int57 = linkedList54.size();
        boolean boolean58 = linkedList54.repOK();
        int int59 = linkedList54.size();
        boolean boolean61 = linkedList54.remove((java.lang.Object) 0);
        boolean boolean63 = linkedList54.remove((java.lang.Object) 0);
        linkedList54.clear();
        linkedList54.clear();
        system.classfixer.classes.LinkedList linkedList66 = new system.classfixer.classes.LinkedList();
        linkedList66.clear();
        boolean boolean68 = linkedList66.repOK();
        system.classfixer.classes.LinkedList linkedList69 = new system.classfixer.classes.LinkedList();
        int int70 = linkedList69.size();
        linkedList69.clear();
        int int72 = linkedList69.size();
        boolean boolean73 = linkedList69.repOK();
        int int74 = linkedList69.size();
        boolean boolean76 = linkedList69.remove((java.lang.Object) 0);
        boolean boolean78 = linkedList69.remove((java.lang.Object) 0);
        int int79 = linkedList69.size();
        boolean boolean80 = linkedList69.repOK();
        int int81 = linkedList69.size();
        linkedList69.clear();
        boolean boolean83 = linkedList66.remove((java.lang.Object) linkedList69);
        boolean boolean84 = linkedList54.remove((java.lang.Object) boolean83);
        boolean boolean85 = linkedList28.remove((java.lang.Object) linkedList54);
        boolean boolean86 = linkedList2.remove((java.lang.Object) boolean85);
        boolean boolean87 = linkedList0.add((java.lang.Object) linkedList2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        boolean boolean3 = linkedList0.repOK();
        linkedList0.clear();
        int int5 = linkedList0.size();
        system.classfixer.classes.LinkedList linkedList6 = new system.classfixer.classes.LinkedList();
        linkedList6.clear();
        boolean boolean8 = linkedList6.repOK();
        boolean boolean9 = linkedList6.repOK();
        boolean boolean11 = linkedList6.remove((java.lang.Object) '#');
        java.lang.Class<?> wildcardClass12 = linkedList6.getClass();
        boolean boolean13 = linkedList0.remove((java.lang.Object) wildcardClass12);
        system.classfixer.classes.LinkedList linkedList14 = new system.classfixer.classes.LinkedList();
        int int15 = linkedList14.size();
        linkedList14.clear();
        int int17 = linkedList14.size();
        boolean boolean18 = linkedList14.repOK();
        int int19 = linkedList14.size();
        boolean boolean21 = linkedList14.remove((java.lang.Object) 0);
        boolean boolean23 = linkedList14.remove((java.lang.Object) 0);
        boolean boolean25 = linkedList14.remove((java.lang.Object) (short) -1);
        boolean boolean26 = linkedList14.repOK();
        boolean boolean27 = linkedList0.remove((java.lang.Object) linkedList14);
        linkedList14.clear();
        system.classfixer.classes.LinkedList linkedList29 = new system.classfixer.classes.LinkedList();
        int int30 = linkedList29.size();
        linkedList29.clear();
        int int32 = linkedList29.size();
        boolean boolean33 = linkedList29.repOK();
        int int34 = linkedList29.size();
        boolean boolean36 = linkedList29.remove((java.lang.Object) 0);
        boolean boolean38 = linkedList29.remove((java.lang.Object) 0);
        int int39 = linkedList29.size();
        int int40 = linkedList29.size();
        system.classfixer.classes.LinkedList linkedList41 = new system.classfixer.classes.LinkedList();
        int int42 = linkedList41.size();
        linkedList41.clear();
        int int44 = linkedList41.size();
        boolean boolean45 = linkedList41.repOK();
        int int46 = linkedList41.size();
        boolean boolean48 = linkedList41.remove((java.lang.Object) 0);
        boolean boolean50 = linkedList41.remove((java.lang.Object) 0);
        boolean boolean52 = linkedList41.remove((java.lang.Object) (short) -1);
        boolean boolean53 = linkedList41.repOK();
        system.classfixer.classes.LinkedList linkedList54 = new system.classfixer.classes.LinkedList();
        int int55 = linkedList54.size();
        boolean boolean56 = linkedList54.repOK();
        boolean boolean58 = linkedList54.remove((java.lang.Object) (short) 1);
        boolean boolean59 = linkedList41.remove((java.lang.Object) linkedList54);
        boolean boolean60 = linkedList29.remove((java.lang.Object) linkedList54);
        int int61 = linkedList54.size();
        system.classfixer.classes.LinkedList linkedList62 = new system.classfixer.classes.LinkedList();
        int int63 = linkedList62.size();
        linkedList62.clear();
        boolean boolean65 = linkedList62.repOK();
        linkedList62.clear();
        int int67 = linkedList62.size();
        linkedList62.clear();
        boolean boolean69 = linkedList54.remove((java.lang.Object) linkedList62);
        boolean boolean70 = linkedList14.add((java.lang.Object) boolean69);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList14", linkedList14.repOK_2());
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        boolean boolean11 = linkedList0.repOK();
        int int12 = linkedList0.size();
        boolean boolean13 = linkedList0.repOK();
        boolean boolean14 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList15 = new system.classfixer.classes.LinkedList();
        int int16 = linkedList15.size();
        linkedList15.clear();
        int int18 = linkedList15.size();
        boolean boolean19 = linkedList15.repOK();
        int int20 = linkedList15.size();
        boolean boolean22 = linkedList15.remove((java.lang.Object) 0);
        boolean boolean24 = linkedList15.remove((java.lang.Object) 0);
        int int25 = linkedList15.size();
        boolean boolean26 = linkedList15.repOK();
        system.classfixer.classes.LinkedList linkedList27 = new system.classfixer.classes.LinkedList();
        int int28 = linkedList27.size();
        linkedList27.clear();
        boolean boolean30 = linkedList15.remove((java.lang.Object) linkedList27);
        boolean boolean31 = linkedList15.repOK();
        linkedList15.clear();
        linkedList15.clear();
        int int34 = linkedList15.size();
        java.lang.Class<?> wildcardClass35 = linkedList15.getClass();
        boolean boolean36 = linkedList0.remove((java.lang.Object) wildcardClass35);
        linkedList0.clear();
        boolean boolean39 = linkedList0.remove((java.lang.Object) ' ');
        boolean boolean40 = linkedList0.repOK();
        int int41 = linkedList0.size();
        system.classfixer.classes.LinkedList linkedList42 = new system.classfixer.classes.LinkedList();
        int int43 = linkedList42.size();
        linkedList42.clear();
        int int45 = linkedList42.size();
        boolean boolean46 = linkedList42.repOK();
        int int47 = linkedList42.size();
        boolean boolean49 = linkedList42.remove((java.lang.Object) 0);
        boolean boolean51 = linkedList42.remove((java.lang.Object) 0);
        boolean boolean53 = linkedList42.remove((java.lang.Object) (byte) 0);
        linkedList42.clear();
        boolean boolean55 = linkedList0.add((java.lang.Object) linkedList42);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean11 = linkedList0.remove((java.lang.Object) (byte) 0);
        linkedList0.clear();
        system.classfixer.classes.LinkedList linkedList13 = new system.classfixer.classes.LinkedList();
        int int14 = linkedList13.size();
        linkedList13.clear();
        boolean boolean16 = linkedList13.repOK();
        int int17 = linkedList13.size();
        boolean boolean19 = linkedList13.remove((java.lang.Object) (short) 0);
        system.classfixer.classes.LinkedList linkedList20 = new system.classfixer.classes.LinkedList();
        int int21 = linkedList20.size();
        linkedList20.clear();
        int int23 = linkedList20.size();
        boolean boolean24 = linkedList20.repOK();
        int int25 = linkedList20.size();
        boolean boolean27 = linkedList20.remove((java.lang.Object) 0);
        boolean boolean29 = linkedList20.remove((java.lang.Object) 0);
        int int30 = linkedList20.size();
        system.classfixer.classes.LinkedList linkedList31 = new system.classfixer.classes.LinkedList();
        linkedList31.clear();
        boolean boolean33 = linkedList31.repOK();
        boolean boolean34 = linkedList31.repOK();
        boolean boolean36 = linkedList31.remove((java.lang.Object) "");
        linkedList31.clear();
        boolean boolean38 = linkedList20.remove((java.lang.Object) linkedList31);
        boolean boolean39 = linkedList13.remove((java.lang.Object) boolean38);
        system.classfixer.classes.LinkedList linkedList40 = new system.classfixer.classes.LinkedList();
        int int41 = linkedList40.size();
        linkedList40.clear();
        int int43 = linkedList40.size();
        boolean boolean44 = linkedList40.repOK();
        int int45 = linkedList40.size();
        boolean boolean47 = linkedList40.remove((java.lang.Object) 0);
        boolean boolean49 = linkedList40.remove((java.lang.Object) 0);
        int int50 = linkedList40.size();
        boolean boolean51 = linkedList40.repOK();
        system.classfixer.classes.LinkedList linkedList52 = new system.classfixer.classes.LinkedList();
        int int53 = linkedList52.size();
        linkedList52.clear();
        boolean boolean55 = linkedList40.remove((java.lang.Object) linkedList52);
        boolean boolean56 = linkedList13.remove((java.lang.Object) linkedList52);
        boolean boolean57 = linkedList52.repOK();
        int int58 = linkedList52.size();
        linkedList52.clear();
        boolean boolean60 = linkedList0.add((java.lang.Object) linkedList52);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        boolean boolean1 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList2 = new system.classfixer.classes.LinkedList();
        int int3 = linkedList2.size();
        linkedList2.clear();
        int int5 = linkedList2.size();
        boolean boolean6 = linkedList2.repOK();
        int int7 = linkedList2.size();
        boolean boolean9 = linkedList2.remove((java.lang.Object) 0);
        boolean boolean11 = linkedList2.remove((java.lang.Object) 0);
        boolean boolean13 = linkedList2.remove((java.lang.Object) (short) -1);
        boolean boolean14 = linkedList2.repOK();
        system.classfixer.classes.LinkedList linkedList15 = new system.classfixer.classes.LinkedList();
        int int16 = linkedList15.size();
        boolean boolean17 = linkedList15.repOK();
        boolean boolean19 = linkedList15.remove((java.lang.Object) (short) 1);
        boolean boolean20 = linkedList2.remove((java.lang.Object) linkedList15);
        system.classfixer.classes.LinkedList linkedList21 = new system.classfixer.classes.LinkedList();
        int int22 = linkedList21.size();
        linkedList21.clear();
        int int24 = linkedList21.size();
        boolean boolean25 = linkedList21.repOK();
        int int26 = linkedList21.size();
        boolean boolean28 = linkedList21.remove((java.lang.Object) 0);
        boolean boolean30 = linkedList21.remove((java.lang.Object) 0);
        boolean boolean32 = linkedList21.remove((java.lang.Object) (short) -1);
        boolean boolean33 = linkedList21.repOK();
        system.classfixer.classes.LinkedList linkedList34 = new system.classfixer.classes.LinkedList();
        int int35 = linkedList34.size();
        boolean boolean36 = linkedList34.repOK();
        boolean boolean38 = linkedList34.remove((java.lang.Object) (short) 1);
        boolean boolean39 = linkedList21.remove((java.lang.Object) linkedList34);
        boolean boolean40 = linkedList2.remove((java.lang.Object) linkedList21);
        boolean boolean41 = linkedList2.repOK();
        boolean boolean42 = linkedList2.repOK();
        boolean boolean43 = linkedList0.add((java.lang.Object) boolean42);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        boolean boolean3 = linkedList0.repOK();
        linkedList0.clear();
        int int5 = linkedList0.size();
        system.classfixer.classes.LinkedList linkedList6 = new system.classfixer.classes.LinkedList();
        linkedList6.clear();
        boolean boolean8 = linkedList6.repOK();
        boolean boolean9 = linkedList6.repOK();
        boolean boolean11 = linkedList6.remove((java.lang.Object) '#');
        java.lang.Class<?> wildcardClass12 = linkedList6.getClass();
        boolean boolean13 = linkedList0.remove((java.lang.Object) wildcardClass12);
        system.classfixer.classes.LinkedList linkedList14 = new system.classfixer.classes.LinkedList();
        int int15 = linkedList14.size();
        linkedList14.clear();
        boolean boolean18 = linkedList14.remove((java.lang.Object) (-1.0f));
        int int19 = linkedList14.size();
        int int20 = linkedList14.size();
        java.lang.Class<?> wildcardClass21 = linkedList14.getClass();
        boolean boolean22 = linkedList0.add((java.lang.Object) wildcardClass21);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        int int2 = linkedList0.size();
        boolean boolean3 = linkedList0.repOK();
        boolean boolean4 = linkedList0.repOK();
        linkedList0.clear();
        boolean boolean6 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList7 = new system.classfixer.classes.LinkedList();
        int int8 = linkedList7.size();
        linkedList7.clear();
        int int10 = linkedList7.size();
        boolean boolean11 = linkedList7.repOK();
        int int12 = linkedList7.size();
        boolean boolean14 = linkedList7.remove((java.lang.Object) 0);
        boolean boolean16 = linkedList7.remove((java.lang.Object) 0);
        int int17 = linkedList7.size();
        boolean boolean18 = linkedList7.repOK();
        system.classfixer.classes.LinkedList linkedList19 = new system.classfixer.classes.LinkedList();
        int int20 = linkedList19.size();
        linkedList19.clear();
        boolean boolean22 = linkedList7.remove((java.lang.Object) linkedList19);
        boolean boolean23 = linkedList19.repOK();
        linkedList19.clear();
        system.classfixer.classes.LinkedList linkedList25 = new system.classfixer.classes.LinkedList();
        int int26 = linkedList25.size();
        linkedList25.clear();
        int int28 = linkedList25.size();
        boolean boolean29 = linkedList25.repOK();
        int int30 = linkedList25.size();
        boolean boolean32 = linkedList25.remove((java.lang.Object) 0);
        boolean boolean34 = linkedList25.remove((java.lang.Object) 0);
        int int35 = linkedList25.size();
        system.classfixer.classes.LinkedList linkedList36 = new system.classfixer.classes.LinkedList();
        linkedList36.clear();
        boolean boolean38 = linkedList36.repOK();
        boolean boolean39 = linkedList36.repOK();
        boolean boolean41 = linkedList36.remove((java.lang.Object) "");
        linkedList36.clear();
        boolean boolean43 = linkedList25.remove((java.lang.Object) linkedList36);
        linkedList25.clear();
        boolean boolean45 = linkedList19.remove((java.lang.Object) linkedList25);
        system.classfixer.classes.LinkedList linkedList46 = new system.classfixer.classes.LinkedList();
        int int47 = linkedList46.size();
        linkedList46.clear();
        int int49 = linkedList46.size();
        boolean boolean50 = linkedList46.repOK();
        int int51 = linkedList46.size();
        boolean boolean53 = linkedList46.remove((java.lang.Object) 0);
        boolean boolean55 = linkedList46.remove((java.lang.Object) 0);
        int int56 = linkedList46.size();
        boolean boolean57 = linkedList46.repOK();
        system.classfixer.classes.LinkedList linkedList58 = new system.classfixer.classes.LinkedList();
        int int59 = linkedList58.size();
        linkedList58.clear();
        boolean boolean61 = linkedList46.remove((java.lang.Object) linkedList58);
        boolean boolean62 = linkedList58.repOK();
        int int63 = linkedList58.size();
        boolean boolean64 = linkedList19.remove((java.lang.Object) int63);
        boolean boolean65 = linkedList0.remove((java.lang.Object) linkedList19);
        system.classfixer.classes.LinkedList linkedList66 = new system.classfixer.classes.LinkedList();
        int int67 = linkedList66.size();
        linkedList66.clear();
        int int69 = linkedList66.size();
        boolean boolean70 = linkedList66.repOK();
        int int71 = linkedList66.size();
        boolean boolean73 = linkedList66.remove((java.lang.Object) 0);
        boolean boolean75 = linkedList66.remove((java.lang.Object) 0);
        linkedList66.clear();
        boolean boolean78 = linkedList66.remove((java.lang.Object) 100);
        int int79 = linkedList66.size();
        int int80 = linkedList66.size();
        java.lang.Class<?> wildcardClass81 = linkedList66.getClass();
        boolean boolean82 = linkedList19.add((java.lang.Object) wildcardClass81);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList19", linkedList19.repOK_2());
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        boolean boolean1 = linkedList0.repOK();
        boolean boolean2 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList3 = new system.classfixer.classes.LinkedList();
        int int4 = linkedList3.size();
        linkedList3.clear();
        boolean boolean7 = linkedList3.remove((java.lang.Object) (-1.0f));
        int int8 = linkedList3.size();
        boolean boolean9 = linkedList0.remove((java.lang.Object) linkedList3);
        system.classfixer.classes.LinkedList linkedList10 = new system.classfixer.classes.LinkedList();
        boolean boolean11 = linkedList10.repOK();
        linkedList10.clear();
        int int13 = linkedList10.size();
        boolean boolean14 = linkedList10.repOK();
        boolean boolean15 = linkedList3.add((java.lang.Object) boolean14);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList3", linkedList3.repOK_2());
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        boolean boolean11 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList12 = new system.classfixer.classes.LinkedList();
        int int13 = linkedList12.size();
        linkedList12.clear();
        boolean boolean15 = linkedList0.remove((java.lang.Object) linkedList12);
        boolean boolean16 = linkedList12.repOK();
        linkedList12.clear();
        system.classfixer.classes.LinkedList linkedList18 = new system.classfixer.classes.LinkedList();
        int int19 = linkedList18.size();
        linkedList18.clear();
        int int21 = linkedList18.size();
        boolean boolean22 = linkedList18.repOK();
        int int23 = linkedList18.size();
        boolean boolean25 = linkedList18.remove((java.lang.Object) 0);
        boolean boolean27 = linkedList18.remove((java.lang.Object) 0);
        int int28 = linkedList18.size();
        system.classfixer.classes.LinkedList linkedList29 = new system.classfixer.classes.LinkedList();
        linkedList29.clear();
        boolean boolean31 = linkedList29.repOK();
        boolean boolean32 = linkedList29.repOK();
        boolean boolean34 = linkedList29.remove((java.lang.Object) "");
        linkedList29.clear();
        boolean boolean36 = linkedList18.remove((java.lang.Object) linkedList29);
        linkedList18.clear();
        boolean boolean38 = linkedList12.remove((java.lang.Object) linkedList18);
        system.classfixer.classes.LinkedList linkedList39 = new system.classfixer.classes.LinkedList();
        int int40 = linkedList39.size();
        int int41 = linkedList39.size();
        boolean boolean42 = linkedList39.repOK();
        boolean boolean43 = linkedList18.remove((java.lang.Object) linkedList39);
        boolean boolean44 = linkedList39.repOK();
        int int45 = linkedList39.size();
        system.classfixer.classes.LinkedList linkedList46 = new system.classfixer.classes.LinkedList();
        int int47 = linkedList46.size();
        linkedList46.clear();
        boolean boolean49 = linkedList46.repOK();
        boolean boolean50 = linkedList39.add((java.lang.Object) boolean49);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList39", linkedList39.repOK_2());
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        boolean boolean11 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList12 = new system.classfixer.classes.LinkedList();
        int int13 = linkedList12.size();
        linkedList12.clear();
        boolean boolean15 = linkedList0.remove((java.lang.Object) linkedList12);
        boolean boolean16 = linkedList12.repOK();
        boolean boolean17 = linkedList12.repOK();
        linkedList12.clear();
        int int19 = linkedList12.size();
        system.classfixer.classes.LinkedList linkedList20 = new system.classfixer.classes.LinkedList();
        linkedList20.clear();
        boolean boolean22 = linkedList20.repOK();
        system.classfixer.classes.LinkedList linkedList23 = new system.classfixer.classes.LinkedList();
        int int24 = linkedList23.size();
        linkedList23.clear();
        int int26 = linkedList23.size();
        boolean boolean27 = linkedList23.repOK();
        int int28 = linkedList23.size();
        boolean boolean30 = linkedList23.remove((java.lang.Object) 0);
        boolean boolean32 = linkedList23.remove((java.lang.Object) 0);
        int int33 = linkedList23.size();
        boolean boolean34 = linkedList23.repOK();
        int int35 = linkedList23.size();
        linkedList23.clear();
        boolean boolean37 = linkedList20.remove((java.lang.Object) linkedList23);
        boolean boolean39 = linkedList23.remove((java.lang.Object) 1);
        int int40 = linkedList23.size();
        int int41 = linkedList23.size();
        boolean boolean42 = linkedList23.repOK();
        boolean boolean43 = linkedList12.add((java.lang.Object) boolean42);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList12", linkedList12.repOK_2());
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.repOK();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) 0);
        int int10 = linkedList0.size();
        boolean boolean11 = linkedList0.repOK();
        system.classfixer.classes.LinkedList linkedList12 = new system.classfixer.classes.LinkedList();
        int int13 = linkedList12.size();
        linkedList12.clear();
        boolean boolean15 = linkedList0.remove((java.lang.Object) linkedList12);
        boolean boolean16 = linkedList12.repOK();
        linkedList12.clear();
        system.classfixer.classes.LinkedList linkedList18 = new system.classfixer.classes.LinkedList();
        int int19 = linkedList18.size();
        linkedList18.clear();
        int int21 = linkedList18.size();
        boolean boolean22 = linkedList18.repOK();
        int int23 = linkedList18.size();
        boolean boolean25 = linkedList18.remove((java.lang.Object) 0);
        boolean boolean27 = linkedList18.remove((java.lang.Object) 0);
        int int28 = linkedList18.size();
        boolean boolean29 = linkedList18.repOK();
        system.classfixer.classes.LinkedList linkedList30 = new system.classfixer.classes.LinkedList();
        int int31 = linkedList30.size();
        linkedList30.clear();
        boolean boolean33 = linkedList18.remove((java.lang.Object) linkedList30);
        java.lang.Class<?> wildcardClass34 = linkedList30.getClass();
        boolean boolean35 = linkedList12.remove((java.lang.Object) linkedList30);
        boolean boolean36 = linkedList12.repOK();
        linkedList12.clear();
        system.classfixer.classes.LinkedList linkedList38 = new system.classfixer.classes.LinkedList();
        boolean boolean39 = linkedList38.repOK();
        boolean boolean40 = linkedList38.repOK();
        system.classfixer.classes.LinkedList linkedList41 = new system.classfixer.classes.LinkedList();
        int int42 = linkedList41.size();
        linkedList41.clear();
        int int44 = linkedList41.size();
        boolean boolean45 = linkedList41.repOK();
        int int46 = linkedList41.size();
        boolean boolean48 = linkedList41.remove((java.lang.Object) 0);
        boolean boolean50 = linkedList41.remove((java.lang.Object) 0);
        linkedList41.clear();
        linkedList41.clear();
        system.classfixer.classes.LinkedList linkedList53 = new system.classfixer.classes.LinkedList();
        int int54 = linkedList53.size();
        linkedList53.clear();
        int int56 = linkedList53.size();
        boolean boolean57 = linkedList53.repOK();
        int int58 = linkedList53.size();
        boolean boolean60 = linkedList53.remove((java.lang.Object) 0);
        boolean boolean62 = linkedList53.remove((java.lang.Object) 0);
        int int63 = linkedList53.size();
        boolean boolean64 = linkedList53.repOK();
        system.classfixer.classes.LinkedList linkedList65 = new system.classfixer.classes.LinkedList();
        int int66 = linkedList65.size();
        linkedList65.clear();
        boolean boolean68 = linkedList53.remove((java.lang.Object) linkedList65);
        boolean boolean69 = linkedList53.repOK();
        linkedList53.clear();
        linkedList53.clear();
        int int72 = linkedList53.size();
        java.lang.Class<?> wildcardClass73 = linkedList53.getClass();
        boolean boolean74 = linkedList41.remove((java.lang.Object) wildcardClass73);
        boolean boolean75 = linkedList38.remove((java.lang.Object) linkedList41);
        system.classfixer.classes.LinkedList linkedList76 = new system.classfixer.classes.LinkedList();
        boolean boolean77 = linkedList76.repOK();
        linkedList76.clear();
        int int79 = linkedList76.size();
        boolean boolean80 = linkedList38.remove((java.lang.Object) linkedList76);
        linkedList38.clear();
        boolean boolean82 = linkedList12.add((java.lang.Object) linkedList38);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList12", linkedList12.repOK_2());
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        boolean boolean1 = linkedList0.repOK();
        linkedList0.clear();
        int int3 = linkedList0.size();
        int int4 = linkedList0.size();
        linkedList0.clear();
        system.classfixer.classes.LinkedList linkedList6 = new system.classfixer.classes.LinkedList();
        int int7 = linkedList6.size();
        linkedList6.clear();
        int int9 = linkedList6.size();
        boolean boolean10 = linkedList6.repOK();
        boolean boolean11 = linkedList6.repOK();
        linkedList6.clear();
        boolean boolean13 = linkedList0.add((java.lang.Object) linkedList6);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList0", linkedList0.repOK_2());
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        system.classfixer.classes.LinkedList linkedList0 = new system.classfixer.classes.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        boolean boolean3 = linkedList0.repOK();
        linkedList0.clear();
        int int5 = linkedList0.size();
        system.classfixer.classes.LinkedList linkedList6 = new system.classfixer.classes.LinkedList();
        int int7 = linkedList6.size();
        linkedList6.clear();
        int int9 = linkedList6.size();
        boolean boolean10 = linkedList6.repOK();
        int int11 = linkedList6.size();
        boolean boolean13 = linkedList6.remove((java.lang.Object) 0);
        boolean boolean15 = linkedList6.remove((java.lang.Object) 0);
        int int16 = linkedList6.size();
        system.classfixer.classes.LinkedList linkedList17 = new system.classfixer.classes.LinkedList();
        linkedList17.clear();
        boolean boolean19 = linkedList17.repOK();
        boolean boolean20 = linkedList17.repOK();
        boolean boolean22 = linkedList17.remove((java.lang.Object) "");
        linkedList17.clear();
        boolean boolean24 = linkedList6.remove((java.lang.Object) linkedList17);
        boolean boolean25 = linkedList0.remove((java.lang.Object) linkedList6);
        linkedList6.clear();
        system.classfixer.classes.LinkedList linkedList27 = new system.classfixer.classes.LinkedList();
        int int28 = linkedList27.size();
        linkedList27.clear();
        int int30 = linkedList27.size();
        boolean boolean31 = linkedList27.repOK();
        int int32 = linkedList27.size();
        boolean boolean34 = linkedList27.remove((java.lang.Object) 0);
        boolean boolean36 = linkedList27.remove((java.lang.Object) 0);
        boolean boolean38 = linkedList27.remove((java.lang.Object) (short) -1);
        boolean boolean39 = linkedList27.repOK();
        system.classfixer.classes.LinkedList linkedList40 = new system.classfixer.classes.LinkedList();
        int int41 = linkedList40.size();
        boolean boolean42 = linkedList40.repOK();
        boolean boolean44 = linkedList40.remove((java.lang.Object) (short) 1);
        boolean boolean45 = linkedList27.remove((java.lang.Object) linkedList40);
        system.classfixer.classes.LinkedList linkedList46 = new system.classfixer.classes.LinkedList();
        int int47 = linkedList46.size();
        linkedList46.clear();
        int int49 = linkedList46.size();
        boolean boolean50 = linkedList46.repOK();
        int int51 = linkedList46.size();
        boolean boolean53 = linkedList46.remove((java.lang.Object) 0);
        boolean boolean55 = linkedList46.remove((java.lang.Object) 0);
        boolean boolean57 = linkedList46.remove((java.lang.Object) (short) -1);
        boolean boolean58 = linkedList46.repOK();
        system.classfixer.classes.LinkedList linkedList59 = new system.classfixer.classes.LinkedList();
        int int60 = linkedList59.size();
        boolean boolean61 = linkedList59.repOK();
        boolean boolean63 = linkedList59.remove((java.lang.Object) (short) 1);
        boolean boolean64 = linkedList46.remove((java.lang.Object) linkedList59);
        boolean boolean65 = linkedList27.remove((java.lang.Object) linkedList46);
        system.classfixer.classes.LinkedList linkedList66 = new system.classfixer.classes.LinkedList();
        int int67 = linkedList66.size();
        linkedList66.clear();
        int int69 = linkedList66.size();
        boolean boolean70 = linkedList66.repOK();
        int int71 = linkedList66.size();
        boolean boolean73 = linkedList66.remove((java.lang.Object) 0);
        boolean boolean75 = linkedList66.remove((java.lang.Object) 0);
        int int76 = linkedList66.size();
        int int77 = linkedList66.size();
        boolean boolean78 = linkedList46.remove((java.lang.Object) int77);
        boolean boolean79 = linkedList46.repOK();
        boolean boolean80 = linkedList6.add((java.lang.Object) linkedList46);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for linkedList6", linkedList6.repOK_2());
    }
}

