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
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        boolean boolean3 = linkedList0.add((java.lang.Object) 1.0d);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        boolean boolean2 = linkedList0.property_1();
        system.testclass.LinkedList linkedList3 = new system.testclass.LinkedList();
        linkedList3.clear();
        boolean boolean5 = linkedList3.property_1();
        boolean boolean6 = linkedList0.add((java.lang.Object) linkedList3);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        boolean boolean2 = linkedList0.property_1();
        boolean boolean4 = linkedList0.add((java.lang.Object) 0.0d);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        java.lang.Object obj3 = null;
        boolean boolean4 = linkedList0.remove(obj3);
        boolean boolean5 = linkedList0.property_4();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        linkedList6.clear();
        linkedList6.clear();
        java.lang.Object obj9 = null;
        boolean boolean10 = linkedList6.remove(obj9);
        boolean boolean11 = linkedList0.add((java.lang.Object) linkedList6);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        boolean boolean2 = linkedList0.property_1();
        boolean boolean4 = linkedList0.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        boolean boolean6 = linkedList5.property_4();
        boolean boolean7 = linkedList0.remove((java.lang.Object) boolean6);
        boolean boolean9 = linkedList0.add((java.lang.Object) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        system.testclass.LinkedList linkedList2 = new system.testclass.LinkedList();
        linkedList2.clear();
        linkedList2.clear();
        boolean boolean5 = linkedList2.composedRepOK();
        int int6 = linkedList2.size();
        linkedList2.clear();
        boolean boolean9 = linkedList2.remove((java.lang.Object) (byte) 0);
        boolean boolean10 = linkedList0.add((java.lang.Object) linkedList2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        boolean boolean2 = linkedList0.property_1();
        boolean boolean4 = linkedList0.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        boolean boolean6 = linkedList5.property_4();
        boolean boolean7 = linkedList0.remove((java.lang.Object) boolean6);
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        linkedList8.clear();
        linkedList8.clear();
        java.lang.Object obj11 = null;
        boolean boolean12 = linkedList8.remove(obj11);
        boolean boolean13 = linkedList8.property_1();
        boolean boolean14 = linkedList8.composedRepOK();
        boolean boolean15 = linkedList0.remove((java.lang.Object) boolean14);
        system.testclass.LinkedList linkedList16 = new system.testclass.LinkedList();
        int int17 = linkedList16.size();
        boolean boolean18 = linkedList16.property_1();
        boolean boolean19 = linkedList16.property_4();
        int int20 = linkedList16.size();
        boolean boolean21 = linkedList0.add((java.lang.Object) linkedList16);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_4();
        boolean boolean3 = linkedList0.remove((java.lang.Object) 0.0f);
        boolean boolean5 = linkedList0.add((java.lang.Object) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean4 = linkedList0.add((java.lang.Object) 10L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        boolean boolean2 = linkedList0.property_4();
        system.testclass.LinkedList linkedList3 = new system.testclass.LinkedList();
        boolean boolean4 = linkedList3.property_4();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        boolean boolean6 = linkedList3.remove((java.lang.Object) linkedList5);
        linkedList3.clear();
        boolean boolean8 = linkedList0.add((java.lang.Object) linkedList3);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean3 = linkedList0.composedRepOK();
        int int4 = linkedList0.size();
        linkedList0.clear();
        boolean boolean7 = linkedList0.remove((java.lang.Object) (byte) 0);
        boolean boolean8 = linkedList0.property_4();
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        linkedList9.clear();
        linkedList9.clear();
        boolean boolean12 = linkedList9.composedRepOK();
        boolean boolean13 = linkedList0.remove((java.lang.Object) linkedList9);
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        int int15 = linkedList14.size();
        boolean boolean16 = linkedList14.property_1();
        linkedList14.clear();
        boolean boolean18 = linkedList14.property_4();
        boolean boolean19 = linkedList0.add((java.lang.Object) boolean18);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean3 = linkedList0.composedRepOK();
        int int4 = linkedList0.size();
        linkedList0.clear();
        boolean boolean7 = linkedList0.remove((java.lang.Object) (byte) 0);
        boolean boolean8 = linkedList0.property_4();
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        linkedList9.clear();
        linkedList9.clear();
        boolean boolean12 = linkedList9.composedRepOK();
        boolean boolean13 = linkedList0.remove((java.lang.Object) linkedList9);
        linkedList0.clear();
        system.testclass.LinkedList linkedList15 = new system.testclass.LinkedList();
        int int16 = linkedList15.size();
        boolean boolean17 = linkedList15.property_1();
        linkedList15.clear();
        boolean boolean19 = linkedList15.property_4();
        boolean boolean20 = linkedList0.add((java.lang.Object) boolean19);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        boolean boolean2 = linkedList0.property_1();
        boolean boolean3 = linkedList0.property_4();
        int int4 = linkedList0.size();
        linkedList0.clear();
        linkedList0.clear();
        int int7 = linkedList0.size();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        int int9 = linkedList8.size();
        boolean boolean10 = linkedList8.property_1();
        boolean boolean11 = linkedList8.property_4();
        int int12 = linkedList8.size();
        boolean boolean14 = linkedList8.remove((java.lang.Object) 0.0f);
        linkedList8.clear();
        boolean boolean16 = linkedList0.add((java.lang.Object) linkedList8);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        boolean boolean2 = linkedList0.property_1();
        boolean boolean3 = linkedList0.property_4();
        boolean boolean4 = linkedList0.composedRepOK();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        int int6 = linkedList5.size();
        boolean boolean7 = linkedList5.property_1();
        boolean boolean9 = linkedList5.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        boolean boolean11 = linkedList10.property_4();
        boolean boolean12 = linkedList5.remove((java.lang.Object) boolean11);
        system.testclass.LinkedList linkedList13 = new system.testclass.LinkedList();
        linkedList13.clear();
        linkedList13.clear();
        java.lang.Object obj16 = null;
        boolean boolean17 = linkedList13.remove(obj16);
        boolean boolean18 = linkedList13.property_1();
        boolean boolean19 = linkedList13.composedRepOK();
        boolean boolean20 = linkedList5.remove((java.lang.Object) boolean19);
        boolean boolean21 = linkedList5.property_1();
        boolean boolean22 = linkedList5.property_1();
        boolean boolean23 = linkedList0.add((java.lang.Object) linkedList5);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_4();
        boolean boolean3 = linkedList0.remove((java.lang.Object) 0.0f);
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        int int5 = linkedList4.size();
        boolean boolean6 = linkedList4.property_1();
        boolean boolean8 = linkedList4.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        boolean boolean10 = linkedList9.property_4();
        boolean boolean11 = linkedList4.remove((java.lang.Object) boolean10);
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        linkedList12.clear();
        linkedList12.clear();
        java.lang.Object obj15 = null;
        boolean boolean16 = linkedList12.remove(obj15);
        boolean boolean17 = linkedList12.property_1();
        boolean boolean18 = linkedList12.composedRepOK();
        boolean boolean19 = linkedList4.remove((java.lang.Object) boolean18);
        boolean boolean20 = linkedList0.add((java.lang.Object) linkedList4);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        java.lang.Object obj3 = null;
        boolean boolean4 = linkedList0.remove(obj3);
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        linkedList5.clear();
        boolean boolean7 = linkedList5.property_1();
        boolean boolean8 = linkedList5.property_1();
        boolean boolean9 = linkedList0.add((java.lang.Object) linkedList5);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        int int4 = linkedList0.size();
        linkedList0.clear();
        boolean boolean6 = linkedList0.composedRepOK();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        boolean boolean8 = linkedList7.property_4();
        boolean boolean10 = linkedList7.remove((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass11 = linkedList7.getClass();
        boolean boolean12 = linkedList0.add((java.lang.Object) linkedList7);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        boolean boolean2 = linkedList0.property_1();
        boolean boolean3 = linkedList0.property_4();
        int int4 = linkedList0.size();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean8 = linkedList0.add((java.lang.Object) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_4();
        boolean boolean3 = linkedList0.remove((java.lang.Object) 0.0f);
        linkedList0.clear();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        int int6 = linkedList5.size();
        boolean boolean7 = linkedList5.property_1();
        boolean boolean8 = linkedList5.property_4();
        int int9 = linkedList5.size();
        linkedList5.clear();
        linkedList5.clear();
        boolean boolean12 = linkedList0.add((java.lang.Object) linkedList5);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        int int4 = linkedList0.size();
        linkedList0.clear();
        boolean boolean6 = linkedList0.composedRepOK();
        boolean boolean8 = linkedList0.add((java.lang.Object) 1L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        boolean boolean2 = linkedList0.property_1();
        boolean boolean3 = linkedList0.property_4();
        int int4 = linkedList0.size();
        boolean boolean6 = linkedList0.remove((java.lang.Object) 0.0f);
        linkedList0.clear();
        boolean boolean9 = linkedList0.remove((java.lang.Object) (byte) 1);
        boolean boolean10 = linkedList0.property_4();
        boolean boolean12 = linkedList0.add((java.lang.Object) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        boolean boolean2 = linkedList0.property_1();
        boolean boolean3 = linkedList0.property_4();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        int int5 = linkedList4.size();
        linkedList4.clear();
        int int7 = linkedList4.size();
        int int8 = linkedList4.size();
        linkedList4.clear();
        boolean boolean10 = linkedList4.composedRepOK();
        boolean boolean11 = linkedList4.property_4();
        boolean boolean12 = linkedList0.add((java.lang.Object) boolean11);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean3 = linkedList0.property_4();
        linkedList0.clear();
        linkedList0.clear();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        linkedList6.clear();
        linkedList6.clear();
        boolean boolean9 = linkedList6.composedRepOK();
        int int10 = linkedList6.size();
        linkedList6.clear();
        boolean boolean12 = linkedList6.property_4();
        boolean boolean13 = linkedList6.property_1();
        boolean boolean14 = linkedList0.add((java.lang.Object) boolean13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        boolean boolean2 = linkedList0.property_4();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Class<?> wildcardClass4 = obj3.getClass();
        boolean boolean5 = linkedList0.add(obj3);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        boolean boolean2 = linkedList0.property_1();
        boolean boolean4 = linkedList0.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        boolean boolean6 = linkedList5.property_4();
        boolean boolean7 = linkedList0.remove((java.lang.Object) boolean6);
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        linkedList8.clear();
        linkedList8.clear();
        java.lang.Object obj11 = null;
        boolean boolean12 = linkedList8.remove(obj11);
        boolean boolean13 = linkedList8.property_1();
        boolean boolean14 = linkedList8.composedRepOK();
        boolean boolean15 = linkedList0.remove((java.lang.Object) boolean14);
        boolean boolean16 = linkedList0.property_1();
        boolean boolean17 = linkedList0.property_1();
        boolean boolean19 = linkedList0.add((java.lang.Object) (-1.0d));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_4();
        system.testclass.LinkedList linkedList2 = new system.testclass.LinkedList();
        linkedList2.clear();
        linkedList2.clear();
        boolean boolean5 = linkedList2.property_1();
        boolean boolean6 = linkedList2.property_1();
        boolean boolean7 = linkedList0.add((java.lang.Object) boolean6);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        linkedList4.clear();
        linkedList4.clear();
        boolean boolean7 = linkedList4.composedRepOK();
        boolean boolean8 = linkedList0.add((java.lang.Object) linkedList4);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        boolean boolean2 = linkedList0.property_1();
        boolean boolean3 = linkedList0.property_4();
        int int4 = linkedList0.size();
        int int5 = linkedList0.size();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        int int7 = linkedList6.size();
        boolean boolean8 = linkedList6.property_1();
        boolean boolean9 = linkedList6.property_4();
        boolean boolean10 = linkedList6.composedRepOK();
        boolean boolean12 = linkedList6.remove((java.lang.Object) 0L);
        linkedList6.clear();
        boolean boolean14 = linkedList0.add((java.lang.Object) linkedList6);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean3 = linkedList0.property_1();
        int int4 = linkedList0.size();
        boolean boolean5 = linkedList0.composedRepOK();
        boolean boolean6 = linkedList0.property_1();
        boolean boolean7 = linkedList0.property_1();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        linkedList8.clear();
        linkedList8.clear();
        boolean boolean11 = linkedList8.property_1();
        int int12 = linkedList8.size();
        boolean boolean13 = linkedList8.composedRepOK();
        boolean boolean14 = linkedList8.property_1();
        boolean boolean15 = linkedList0.add((java.lang.Object) boolean14);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        boolean boolean2 = linkedList0.property_1();
        boolean boolean3 = linkedList0.property_4();
        int int4 = linkedList0.size();
        linkedList0.clear();
        linkedList0.clear();
        int int7 = linkedList0.size();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        linkedList8.clear();
        linkedList8.clear();
        boolean boolean11 = linkedList8.property_4();
        boolean boolean12 = linkedList8.property_4();
        boolean boolean13 = linkedList8.property_1();
        linkedList8.clear();
        linkedList8.clear();
        boolean boolean16 = linkedList0.add((java.lang.Object) linkedList8);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.property_4();
        boolean boolean5 = linkedList0.property_4();
        boolean boolean6 = linkedList0.composedRepOK();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        int int8 = linkedList7.size();
        linkedList7.clear();
        boolean boolean10 = linkedList7.property_4();
        boolean boolean11 = linkedList0.add((java.lang.Object) linkedList7);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        boolean boolean2 = linkedList0.property_1();
        linkedList0.clear();
        boolean boolean4 = linkedList0.property_4();
        boolean boolean6 = linkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        int int8 = linkedList7.size();
        boolean boolean9 = linkedList7.property_1();
        boolean boolean10 = linkedList7.property_4();
        int int11 = linkedList7.size();
        boolean boolean13 = linkedList7.remove((java.lang.Object) 0.0f);
        linkedList7.clear();
        linkedList7.clear();
        boolean boolean16 = linkedList0.add((java.lang.Object) linkedList7);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean3 = linkedList0.property_4();
        boolean boolean4 = linkedList0.property_4();
        boolean boolean5 = linkedList0.property_1();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        int int7 = linkedList6.size();
        linkedList6.clear();
        int int9 = linkedList6.size();
        boolean boolean10 = linkedList6.property_4();
        boolean boolean11 = linkedList6.property_4();
        boolean boolean12 = linkedList6.composedRepOK();
        boolean boolean13 = linkedList6.composedRepOK();
        boolean boolean14 = linkedList0.add((java.lang.Object) linkedList6);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean3 = linkedList0.composedRepOK();
        int int4 = linkedList0.size();
        boolean boolean6 = linkedList0.remove((java.lang.Object) (short) 1);
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        int int8 = linkedList7.size();
        boolean boolean9 = linkedList7.property_1();
        boolean boolean10 = linkedList7.property_4();
        int int11 = linkedList7.size();
        int int12 = linkedList7.size();
        boolean boolean13 = linkedList0.add((java.lang.Object) int12);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        java.lang.Object obj3 = null;
        boolean boolean4 = linkedList0.remove(obj3);
        boolean boolean5 = linkedList0.property_4();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        linkedList6.clear();
        java.lang.Class<?> wildcardClass8 = linkedList6.getClass();
        boolean boolean9 = linkedList0.add((java.lang.Object) wildcardClass8);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_4();
        boolean boolean3 = linkedList0.remove((java.lang.Object) 0.0f);
        linkedList0.clear();
        boolean boolean5 = linkedList0.property_1();
        linkedList0.clear();
        boolean boolean8 = linkedList0.add((java.lang.Object) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        java.lang.Object obj3 = null;
        boolean boolean4 = linkedList0.remove(obj3);
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        int int6 = linkedList5.size();
        linkedList5.clear();
        int int8 = linkedList5.size();
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        boolean boolean11 = linkedList5.remove((java.lang.Object) wildcardClass10);
        linkedList5.clear();
        boolean boolean13 = linkedList5.composedRepOK();
        boolean boolean14 = linkedList0.add((java.lang.Object) boolean13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        boolean boolean3 = linkedList0.add((java.lang.Object) false);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        boolean boolean2 = linkedList0.property_1();
        boolean boolean3 = linkedList0.property_4();
        int int4 = linkedList0.size();
        int int5 = linkedList0.size();
        boolean boolean6 = linkedList0.composedRepOK();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        int int8 = linkedList7.size();
        linkedList7.clear();
        int int10 = linkedList7.size();
        java.lang.Object obj11 = new java.lang.Object();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        boolean boolean13 = linkedList7.remove((java.lang.Object) wildcardClass12);
        linkedList7.clear();
        boolean boolean15 = linkedList0.add((java.lang.Object) linkedList7);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean3 = linkedList0.composedRepOK();
        int int4 = linkedList0.size();
        linkedList0.clear();
        boolean boolean7 = linkedList0.remove((java.lang.Object) (byte) 0);
        boolean boolean8 = linkedList0.property_4();
        boolean boolean10 = linkedList0.add((java.lang.Object) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        boolean boolean2 = linkedList0.property_1();
        boolean boolean3 = linkedList0.property_4();
        boolean boolean4 = linkedList0.composedRepOK();
        boolean boolean6 = linkedList0.add((java.lang.Object) 100.0d);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        boolean boolean2 = linkedList0.property_1();
        boolean boolean3 = linkedList0.property_4();
        int int4 = linkedList0.size();
        linkedList0.clear();
        linkedList0.clear();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        int int8 = linkedList7.size();
        boolean boolean9 = linkedList7.property_1();
        boolean boolean11 = linkedList7.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        boolean boolean13 = linkedList12.property_4();
        boolean boolean14 = linkedList7.remove((java.lang.Object) boolean13);
        system.testclass.LinkedList linkedList15 = new system.testclass.LinkedList();
        linkedList15.clear();
        linkedList15.clear();
        java.lang.Object obj18 = null;
        boolean boolean19 = linkedList15.remove(obj18);
        boolean boolean20 = linkedList15.property_1();
        boolean boolean21 = linkedList15.composedRepOK();
        boolean boolean22 = linkedList7.remove((java.lang.Object) boolean21);
        int int23 = linkedList7.size();
        boolean boolean24 = linkedList0.remove((java.lang.Object) linkedList7);
        system.testclass.LinkedList linkedList25 = new system.testclass.LinkedList();
        int int26 = linkedList25.size();
        boolean boolean27 = linkedList25.property_1();
        boolean boolean28 = linkedList25.property_4();
        boolean boolean29 = linkedList25.composedRepOK();
        boolean boolean31 = linkedList25.remove((java.lang.Object) 0L);
        linkedList25.clear();
        boolean boolean33 = linkedList7.add((java.lang.Object) linkedList25);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList7", linkedList7.property_5());
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean3 = linkedList0.property_1();
        boolean boolean4 = linkedList0.property_1();
        boolean boolean5 = linkedList0.property_4();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        int int7 = linkedList6.size();
        linkedList6.clear();
        int int9 = linkedList6.size();
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        boolean boolean12 = linkedList6.remove((java.lang.Object) wildcardClass11);
        boolean boolean13 = linkedList0.add((java.lang.Object) wildcardClass11);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean3 = linkedList0.property_4();
        boolean boolean4 = linkedList0.property_4();
        boolean boolean5 = linkedList0.property_1();
        linkedList0.clear();
        linkedList0.clear();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        linkedList8.clear();
        linkedList8.clear();
        boolean boolean11 = linkedList8.composedRepOK();
        int int12 = linkedList8.size();
        linkedList8.clear();
        boolean boolean15 = linkedList8.remove((java.lang.Object) (byte) 0);
        boolean boolean16 = linkedList0.add((java.lang.Object) linkedList8);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean3 = linkedList0.property_4();
        boolean boolean4 = linkedList0.property_4();
        boolean boolean5 = linkedList0.property_1();
        linkedList0.clear();
        linkedList0.clear();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        linkedList8.clear();
        linkedList8.clear();
        boolean boolean11 = linkedList8.property_4();
        boolean boolean12 = linkedList8.property_4();
        int int13 = linkedList8.size();
        boolean boolean14 = linkedList0.add((java.lang.Object) linkedList8);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        boolean boolean2 = linkedList0.property_4();
        java.lang.Object obj3 = null;
        boolean boolean4 = linkedList0.add(obj3);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean3 = linkedList0.property_4();
        linkedList0.clear();
        boolean boolean6 = linkedList0.add((java.lang.Object) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        boolean boolean2 = linkedList0.property_1();
        boolean boolean3 = linkedList0.property_4();
        int int4 = linkedList0.size();
        boolean boolean6 = linkedList0.remove((java.lang.Object) 0.0f);
        linkedList0.clear();
        linkedList0.clear();
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        linkedList9.clear();
        linkedList9.clear();
        boolean boolean12 = linkedList9.composedRepOK();
        int int13 = linkedList9.size();
        linkedList9.clear();
        boolean boolean15 = linkedList9.property_4();
        system.testclass.LinkedList linkedList16 = new system.testclass.LinkedList();
        int int17 = linkedList16.size();
        boolean boolean18 = linkedList16.property_1();
        boolean boolean20 = linkedList16.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList21 = new system.testclass.LinkedList();
        boolean boolean22 = linkedList21.property_4();
        boolean boolean23 = linkedList16.remove((java.lang.Object) boolean22);
        linkedList16.clear();
        java.lang.Class<?> wildcardClass25 = linkedList16.getClass();
        boolean boolean26 = linkedList9.remove((java.lang.Object) linkedList16);
        boolean boolean27 = linkedList0.add((java.lang.Object) linkedList9);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean3 = linkedList0.property_1();
        int int4 = linkedList0.size();
        boolean boolean5 = linkedList0.composedRepOK();
        boolean boolean6 = linkedList0.property_1();
        boolean boolean7 = linkedList0.property_4();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        int int9 = linkedList8.size();
        boolean boolean10 = linkedList8.property_1();
        boolean boolean12 = linkedList8.remove((java.lang.Object) (-1L));
        boolean boolean13 = linkedList0.add((java.lang.Object) boolean12);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean3 = linkedList0.property_1();
        int int4 = linkedList0.size();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        linkedList5.clear();
        linkedList5.clear();
        boolean boolean8 = linkedList5.property_1();
        int int9 = linkedList5.size();
        linkedList5.clear();
        boolean boolean11 = linkedList0.add((java.lang.Object) linkedList5);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        boolean boolean2 = linkedList0.property_1();
        boolean boolean4 = linkedList0.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        boolean boolean6 = linkedList5.property_4();
        boolean boolean7 = linkedList0.remove((java.lang.Object) boolean6);
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        linkedList8.clear();
        linkedList8.clear();
        java.lang.Object obj11 = null;
        boolean boolean12 = linkedList8.remove(obj11);
        boolean boolean13 = linkedList8.property_1();
        boolean boolean14 = linkedList8.composedRepOK();
        boolean boolean15 = linkedList0.remove((java.lang.Object) boolean14);
        boolean boolean16 = linkedList0.composedRepOK();
        system.testclass.LinkedList linkedList17 = new system.testclass.LinkedList();
        int int18 = linkedList17.size();
        linkedList17.clear();
        int int20 = linkedList17.size();
        java.lang.Object obj21 = new java.lang.Object();
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        boolean boolean23 = linkedList17.remove((java.lang.Object) wildcardClass22);
        linkedList17.clear();
        boolean boolean25 = linkedList0.remove((java.lang.Object) linkedList17);
        system.testclass.LinkedList linkedList26 = new system.testclass.LinkedList();
        linkedList26.clear();
        linkedList26.clear();
        boolean boolean29 = linkedList26.property_4();
        boolean boolean30 = linkedList26.property_4();
        boolean boolean31 = linkedList26.property_1();
        boolean boolean32 = linkedList17.add((java.lang.Object) linkedList26);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList17", linkedList17.property_5());
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        java.lang.Object obj3 = null;
        boolean boolean4 = linkedList0.remove(obj3);
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        linkedList5.clear();
        linkedList5.clear();
        java.lang.Object obj8 = null;
        boolean boolean9 = linkedList5.remove(obj8);
        boolean boolean10 = linkedList5.property_1();
        boolean boolean11 = linkedList5.property_4();
        boolean boolean12 = linkedList5.property_1();
        boolean boolean13 = linkedList0.add((java.lang.Object) boolean12);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        boolean boolean2 = linkedList0.property_1();
        boolean boolean3 = linkedList0.property_4();
        int int4 = linkedList0.size();
        linkedList0.clear();
        java.lang.Object obj6 = null;
        boolean boolean7 = linkedList0.add(obj6);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean3 = linkedList0.property_4();
        boolean boolean4 = linkedList0.property_4();
        boolean boolean5 = linkedList0.property_1();
        linkedList0.clear();
        boolean boolean7 = linkedList0.property_1();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        linkedList8.clear();
        linkedList8.clear();
        boolean boolean11 = linkedList8.composedRepOK();
        boolean boolean12 = linkedList8.composedRepOK();
        boolean boolean13 = linkedList0.add((java.lang.Object) boolean12);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        boolean boolean2 = linkedList0.property_1();
        linkedList0.clear();
        boolean boolean4 = linkedList0.property_4();
        boolean boolean6 = linkedList0.add((java.lang.Object) 1L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        boolean boolean2 = linkedList0.property_1();
        boolean boolean4 = linkedList0.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        boolean boolean6 = linkedList5.property_4();
        boolean boolean7 = linkedList0.remove((java.lang.Object) boolean6);
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        linkedList8.clear();
        linkedList8.clear();
        java.lang.Object obj11 = null;
        boolean boolean12 = linkedList8.remove(obj11);
        boolean boolean13 = linkedList8.property_1();
        boolean boolean14 = linkedList8.composedRepOK();
        boolean boolean15 = linkedList0.remove((java.lang.Object) boolean14);
        boolean boolean16 = linkedList0.composedRepOK();
        system.testclass.LinkedList linkedList17 = new system.testclass.LinkedList();
        linkedList17.clear();
        linkedList17.clear();
        boolean boolean20 = linkedList17.property_1();
        boolean boolean21 = linkedList17.property_1();
        boolean boolean22 = linkedList0.remove((java.lang.Object) boolean21);
        linkedList0.clear();
        boolean boolean24 = linkedList0.property_4();
        boolean boolean25 = linkedList0.composedRepOK();
        system.testclass.LinkedList linkedList26 = new system.testclass.LinkedList();
        int int27 = linkedList26.size();
        linkedList26.clear();
        int int29 = linkedList26.size();
        int int30 = linkedList26.size();
        linkedList26.clear();
        boolean boolean32 = linkedList26.property_4();
        boolean boolean33 = linkedList0.add((java.lang.Object) linkedList26);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean3 = linkedList0.property_4();
        linkedList0.clear();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        linkedList5.clear();
        linkedList5.clear();
        boolean boolean8 = linkedList5.composedRepOK();
        int int9 = linkedList5.size();
        linkedList5.clear();
        boolean boolean12 = linkedList5.remove((java.lang.Object) (byte) 0);
        boolean boolean13 = linkedList5.property_4();
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        linkedList14.clear();
        linkedList14.clear();
        boolean boolean17 = linkedList14.composedRepOK();
        boolean boolean18 = linkedList5.remove((java.lang.Object) linkedList14);
        boolean boolean19 = linkedList5.property_4();
        boolean boolean20 = linkedList0.add((java.lang.Object) linkedList5);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean3 = linkedList0.composedRepOK();
        int int4 = linkedList0.size();
        linkedList0.clear();
        boolean boolean6 = linkedList0.property_4();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        int int8 = linkedList7.size();
        boolean boolean9 = linkedList7.property_1();
        boolean boolean11 = linkedList7.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        boolean boolean13 = linkedList12.property_4();
        boolean boolean14 = linkedList7.remove((java.lang.Object) boolean13);
        linkedList7.clear();
        java.lang.Class<?> wildcardClass16 = linkedList7.getClass();
        boolean boolean17 = linkedList0.remove((java.lang.Object) linkedList7);
        system.testclass.LinkedList linkedList18 = new system.testclass.LinkedList();
        boolean boolean19 = linkedList0.add((java.lang.Object) linkedList18);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        boolean boolean2 = linkedList0.property_1();
        boolean boolean3 = linkedList0.property_4();
        int int4 = linkedList0.size();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        linkedList5.clear();
        linkedList5.clear();
        boolean boolean8 = linkedList5.property_4();
        boolean boolean9 = linkedList5.property_4();
        boolean boolean10 = linkedList5.property_1();
        linkedList5.clear();
        linkedList5.clear();
        boolean boolean13 = linkedList0.add((java.lang.Object) linkedList5);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        boolean boolean2 = linkedList0.property_1();
        boolean boolean3 = linkedList0.property_4();
        boolean boolean4 = linkedList0.composedRepOK();
        boolean boolean6 = linkedList0.remove((java.lang.Object) 0L);
        boolean boolean7 = linkedList0.property_1();
        boolean boolean9 = linkedList0.add((java.lang.Object) false);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        boolean boolean6 = linkedList0.remove((java.lang.Object) wildcardClass5);
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        linkedList7.clear();
        linkedList7.clear();
        boolean boolean10 = linkedList7.property_4();
        boolean boolean11 = linkedList7.property_4();
        boolean boolean12 = linkedList7.property_1();
        linkedList7.clear();
        boolean boolean14 = linkedList7.property_1();
        boolean boolean15 = linkedList0.add((java.lang.Object) linkedList7);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean3 = linkedList0.composedRepOK();
        int int4 = linkedList0.size();
        linkedList0.clear();
        boolean boolean7 = linkedList0.remove((java.lang.Object) (byte) 0);
        boolean boolean8 = linkedList0.property_4();
        boolean boolean9 = linkedList0.composedRepOK();
        boolean boolean10 = linkedList0.property_1();
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        int int12 = linkedList11.size();
        boolean boolean13 = linkedList11.property_1();
        boolean boolean14 = linkedList11.property_4();
        int int15 = linkedList11.size();
        linkedList11.clear();
        linkedList11.clear();
        int int18 = linkedList11.size();
        boolean boolean19 = linkedList11.property_4();
        boolean boolean20 = linkedList11.property_4();
        boolean boolean21 = linkedList0.add((java.lang.Object) linkedList11);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean3 = linkedList0.property_4();
        linkedList0.clear();
        linkedList0.clear();
        linkedList0.clear();
        linkedList0.clear();
        java.lang.Object obj8 = null;
        boolean boolean9 = linkedList0.add(obj8);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        boolean boolean2 = linkedList0.property_1();
        boolean boolean3 = linkedList0.composedRepOK();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        int int5 = linkedList4.size();
        boolean boolean6 = linkedList4.property_1();
        boolean boolean7 = linkedList4.property_4();
        int int8 = linkedList4.size();
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        boolean boolean10 = linkedList9.property_4();
        boolean boolean12 = linkedList9.remove((java.lang.Object) 0.0f);
        linkedList9.clear();
        int int14 = linkedList9.size();
        linkedList9.clear();
        system.testclass.LinkedList linkedList16 = new system.testclass.LinkedList();
        linkedList16.clear();
        linkedList16.clear();
        boolean boolean19 = linkedList16.property_4();
        linkedList16.clear();
        linkedList16.clear();
        boolean boolean22 = linkedList9.remove((java.lang.Object) linkedList16);
        boolean boolean23 = linkedList16.composedRepOK();
        boolean boolean24 = linkedList4.remove((java.lang.Object) boolean23);
        boolean boolean25 = linkedList0.remove((java.lang.Object) linkedList4);
        system.testclass.LinkedList linkedList26 = new system.testclass.LinkedList();
        linkedList26.clear();
        linkedList26.clear();
        boolean boolean29 = linkedList26.composedRepOK();
        int int30 = linkedList26.size();
        linkedList26.clear();
        boolean boolean33 = linkedList26.remove((java.lang.Object) (byte) 0);
        boolean boolean34 = linkedList26.property_4();
        system.testclass.LinkedList linkedList35 = new system.testclass.LinkedList();
        linkedList35.clear();
        linkedList35.clear();
        boolean boolean38 = linkedList35.composedRepOK();
        boolean boolean39 = linkedList26.remove((java.lang.Object) linkedList35);
        linkedList26.clear();
        int int41 = linkedList26.size();
        boolean boolean42 = linkedList4.add((java.lang.Object) int41);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList4", linkedList4.property_5());
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean3 = linkedList0.property_1();
        int int4 = linkedList0.size();
        boolean boolean5 = linkedList0.composedRepOK();
        boolean boolean6 = linkedList0.property_1();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        boolean boolean8 = linkedList7.property_4();
        java.lang.Class<?> wildcardClass9 = linkedList7.getClass();
        boolean boolean10 = linkedList0.add((java.lang.Object) linkedList7);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        boolean boolean2 = linkedList0.property_1();
        boolean boolean3 = linkedList0.composedRepOK();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        linkedList4.clear();
        linkedList4.clear();
        boolean boolean7 = linkedList4.composedRepOK();
        int int8 = linkedList4.size();
        linkedList4.clear();
        boolean boolean11 = linkedList4.remove((java.lang.Object) (byte) 0);
        boolean boolean12 = linkedList4.property_4();
        boolean boolean13 = linkedList4.composedRepOK();
        boolean boolean14 = linkedList4.property_1();
        boolean boolean15 = linkedList0.add((java.lang.Object) boolean14);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean3 = linkedList0.property_4();
        linkedList0.clear();
        boolean boolean5 = linkedList0.property_4();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        linkedList6.clear();
        linkedList6.clear();
        java.lang.Object obj9 = null;
        boolean boolean10 = linkedList6.remove(obj9);
        boolean boolean11 = linkedList6.property_1();
        boolean boolean12 = linkedList6.composedRepOK();
        boolean boolean14 = linkedList6.remove((java.lang.Object) (-1L));
        linkedList6.clear();
        linkedList6.clear();
        boolean boolean17 = linkedList0.add((java.lang.Object) linkedList6);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        boolean boolean2 = linkedList0.property_1();
        boolean boolean3 = linkedList0.property_4();
        int int4 = linkedList0.size();
        boolean boolean5 = linkedList0.composedRepOK();
        linkedList0.clear();
        boolean boolean8 = linkedList0.add((java.lang.Object) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_4();
        system.testclass.LinkedList linkedList2 = new system.testclass.LinkedList();
        boolean boolean3 = linkedList0.remove((java.lang.Object) linkedList2);
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        linkedList4.clear();
        linkedList4.clear();
        boolean boolean7 = linkedList4.property_1();
        linkedList4.clear();
        boolean boolean9 = linkedList2.add((java.lang.Object) linkedList4);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList2", linkedList2.property_5());
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_4();
        system.testclass.LinkedList linkedList2 = new system.testclass.LinkedList();
        boolean boolean3 = linkedList0.remove((java.lang.Object) linkedList2);
        linkedList2.clear();
        int int5 = linkedList2.size();
        int int6 = linkedList2.size();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        int int8 = linkedList7.size();
        boolean boolean9 = linkedList7.composedRepOK();
        java.lang.Class<?> wildcardClass10 = linkedList7.getClass();
        boolean boolean11 = linkedList2.add((java.lang.Object) linkedList7);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList2", linkedList2.property_5());
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean3 = linkedList0.composedRepOK();
        int int4 = linkedList0.size();
        linkedList0.clear();
        boolean boolean6 = linkedList0.property_4();
        boolean boolean7 = linkedList0.property_4();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        int int9 = linkedList8.size();
        linkedList8.clear();
        int int11 = linkedList8.size();
        boolean boolean12 = linkedList8.property_4();
        boolean boolean13 = linkedList8.property_4();
        boolean boolean14 = linkedList8.composedRepOK();
        boolean boolean15 = linkedList8.property_4();
        boolean boolean16 = linkedList0.add((java.lang.Object) boolean15);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean3 = linkedList0.property_1();
        int int4 = linkedList0.size();
        boolean boolean5 = linkedList0.composedRepOK();
        java.lang.Object obj6 = null;
        boolean boolean7 = linkedList0.add(obj6);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean3 = linkedList0.composedRepOK();
        int int4 = linkedList0.size();
        linkedList0.clear();
        boolean boolean7 = linkedList0.remove((java.lang.Object) (byte) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) (-1.0f));
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        boolean boolean11 = linkedList10.property_4();
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        boolean boolean13 = linkedList10.remove((java.lang.Object) linkedList12);
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        boolean boolean15 = linkedList14.property_4();
        java.lang.Class<?> wildcardClass16 = linkedList14.getClass();
        boolean boolean17 = linkedList12.remove((java.lang.Object) wildcardClass16);
        boolean boolean18 = linkedList0.remove((java.lang.Object) wildcardClass16);
        boolean boolean20 = linkedList0.add((java.lang.Object) (-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_4();
        system.testclass.LinkedList linkedList2 = new system.testclass.LinkedList();
        boolean boolean3 = linkedList0.remove((java.lang.Object) linkedList2);
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        boolean boolean5 = linkedList4.property_4();
        java.lang.Class<?> wildcardClass6 = linkedList4.getClass();
        boolean boolean7 = linkedList2.remove((java.lang.Object) wildcardClass6);
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        int int9 = linkedList8.size();
        boolean boolean10 = linkedList8.property_1();
        boolean boolean11 = linkedList8.property_4();
        int int12 = linkedList8.size();
        int int13 = linkedList8.size();
        boolean boolean14 = linkedList8.composedRepOK();
        system.testclass.LinkedList linkedList15 = new system.testclass.LinkedList();
        linkedList15.clear();
        linkedList15.clear();
        boolean boolean18 = linkedList15.composedRepOK();
        int int19 = linkedList15.size();
        linkedList15.clear();
        boolean boolean21 = linkedList15.property_4();
        boolean boolean22 = linkedList8.remove((java.lang.Object) boolean21);
        boolean boolean23 = linkedList2.add((java.lang.Object) linkedList8);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList2", linkedList2.property_5());
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean3 = linkedList0.property_1();
        int int4 = linkedList0.size();
        boolean boolean5 = linkedList0.composedRepOK();
        boolean boolean6 = linkedList0.composedRepOK();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        linkedList7.clear();
        linkedList7.clear();
        java.lang.Object obj10 = null;
        boolean boolean11 = linkedList7.remove(obj10);
        boolean boolean12 = linkedList7.property_1();
        int int13 = linkedList7.size();
        boolean boolean14 = linkedList7.property_1();
        boolean boolean15 = linkedList0.add((java.lang.Object) boolean14);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean3 = linkedList0.property_1();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        linkedList4.clear();
        linkedList4.clear();
        boolean boolean7 = linkedList4.composedRepOK();
        int int8 = linkedList4.size();
        linkedList4.clear();
        boolean boolean11 = linkedList4.remove((java.lang.Object) (byte) 0);
        boolean boolean12 = linkedList4.property_4();
        boolean boolean13 = linkedList4.composedRepOK();
        boolean boolean14 = linkedList0.add((java.lang.Object) linkedList4);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        boolean boolean6 = linkedList0.remove((java.lang.Object) wildcardClass5);
        linkedList0.clear();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        linkedList8.clear();
        linkedList8.clear();
        boolean boolean11 = linkedList8.composedRepOK();
        boolean boolean12 = linkedList8.composedRepOK();
        boolean boolean13 = linkedList8.property_1();
        boolean boolean14 = linkedList0.add((java.lang.Object) linkedList8);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        boolean boolean2 = linkedList0.property_1();
        boolean boolean3 = linkedList0.composedRepOK();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        int int5 = linkedList4.size();
        boolean boolean6 = linkedList4.property_1();
        boolean boolean7 = linkedList4.property_4();
        int int8 = linkedList4.size();
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        boolean boolean10 = linkedList9.property_4();
        boolean boolean12 = linkedList9.remove((java.lang.Object) 0.0f);
        linkedList9.clear();
        int int14 = linkedList9.size();
        linkedList9.clear();
        system.testclass.LinkedList linkedList16 = new system.testclass.LinkedList();
        linkedList16.clear();
        linkedList16.clear();
        boolean boolean19 = linkedList16.property_4();
        linkedList16.clear();
        linkedList16.clear();
        boolean boolean22 = linkedList9.remove((java.lang.Object) linkedList16);
        boolean boolean23 = linkedList16.composedRepOK();
        boolean boolean24 = linkedList4.remove((java.lang.Object) boolean23);
        boolean boolean25 = linkedList0.remove((java.lang.Object) linkedList4);
        system.testclass.LinkedList linkedList26 = new system.testclass.LinkedList();
        linkedList26.clear();
        boolean boolean28 = linkedList26.property_4();
        boolean boolean29 = linkedList26.property_4();
        system.testclass.LinkedList linkedList30 = new system.testclass.LinkedList();
        int int31 = linkedList30.size();
        boolean boolean32 = linkedList30.property_1();
        boolean boolean33 = linkedList30.property_4();
        int int34 = linkedList30.size();
        linkedList30.clear();
        linkedList30.clear();
        system.testclass.LinkedList linkedList37 = new system.testclass.LinkedList();
        int int38 = linkedList37.size();
        boolean boolean39 = linkedList37.property_1();
        boolean boolean41 = linkedList37.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList42 = new system.testclass.LinkedList();
        boolean boolean43 = linkedList42.property_4();
        boolean boolean44 = linkedList37.remove((java.lang.Object) boolean43);
        system.testclass.LinkedList linkedList45 = new system.testclass.LinkedList();
        linkedList45.clear();
        linkedList45.clear();
        java.lang.Object obj48 = null;
        boolean boolean49 = linkedList45.remove(obj48);
        boolean boolean50 = linkedList45.property_1();
        boolean boolean51 = linkedList45.composedRepOK();
        boolean boolean52 = linkedList37.remove((java.lang.Object) boolean51);
        int int53 = linkedList37.size();
        boolean boolean54 = linkedList30.remove((java.lang.Object) linkedList37);
        boolean boolean55 = linkedList26.remove((java.lang.Object) linkedList30);
        int int56 = linkedList26.size();
        boolean boolean57 = linkedList26.composedRepOK();
        boolean boolean58 = linkedList26.property_1();
        boolean boolean59 = linkedList0.remove((java.lang.Object) boolean58);
        system.testclass.LinkedList linkedList60 = new system.testclass.LinkedList();
        boolean boolean61 = linkedList0.add((java.lang.Object) linkedList60);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean3 = linkedList0.property_1();
        int int4 = linkedList0.size();
        boolean boolean5 = linkedList0.composedRepOK();
        boolean boolean6 = linkedList0.property_1();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        int int8 = linkedList7.size();
        linkedList7.clear();
        int int10 = linkedList7.size();
        linkedList7.clear();
        boolean boolean12 = linkedList0.add((java.lang.Object) linkedList7);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        boolean boolean2 = linkedList0.property_1();
        boolean boolean3 = linkedList0.property_4();
        int int4 = linkedList0.size();
        boolean boolean6 = linkedList0.remove((java.lang.Object) 0.0f);
        linkedList0.clear();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        int int9 = linkedList8.size();
        boolean boolean10 = linkedList8.property_1();
        boolean boolean11 = linkedList8.property_4();
        int int12 = linkedList8.size();
        boolean boolean14 = linkedList8.remove((java.lang.Object) 0.0f);
        linkedList8.clear();
        boolean boolean17 = linkedList8.remove((java.lang.Object) (byte) 1);
        java.lang.Class<?> wildcardClass18 = linkedList8.getClass();
        boolean boolean19 = linkedList0.remove((java.lang.Object) wildcardClass18);
        boolean boolean20 = linkedList0.property_1();
        system.testclass.LinkedList linkedList21 = new system.testclass.LinkedList();
        linkedList21.clear();
        linkedList21.clear();
        boolean boolean24 = linkedList21.property_4();
        boolean boolean25 = linkedList21.property_4();
        boolean boolean26 = linkedList21.property_1();
        linkedList21.clear();
        boolean boolean28 = linkedList0.add((java.lang.Object) linkedList21);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_4();
        boolean boolean3 = linkedList0.add((java.lang.Object) (-1.0f));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_4();
        boolean boolean3 = linkedList0.remove((java.lang.Object) 0.0f);
        linkedList0.clear();
        boolean boolean5 = linkedList0.property_1();
        linkedList0.clear();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        int int8 = linkedList7.size();
        linkedList7.clear();
        int int10 = linkedList7.size();
        boolean boolean11 = linkedList7.property_4();
        boolean boolean12 = linkedList7.property_4();
        boolean boolean13 = linkedList7.composedRepOK();
        boolean boolean14 = linkedList7.property_1();
        boolean boolean15 = linkedList0.add((java.lang.Object) linkedList7);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_4();
        system.testclass.LinkedList linkedList2 = new system.testclass.LinkedList();
        boolean boolean3 = linkedList0.remove((java.lang.Object) linkedList2);
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        boolean boolean5 = linkedList4.property_4();
        java.lang.Class<?> wildcardClass6 = linkedList4.getClass();
        boolean boolean7 = linkedList2.remove((java.lang.Object) wildcardClass6);
        java.lang.Object obj8 = null;
        boolean boolean9 = linkedList2.add(obj8);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList2", linkedList2.property_5());
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        boolean boolean2 = linkedList0.property_1();
        boolean boolean3 = linkedList0.property_4();
        boolean boolean4 = linkedList0.composedRepOK();
        boolean boolean6 = linkedList0.remove((java.lang.Object) 0L);
        linkedList0.clear();
        boolean boolean8 = linkedList0.composedRepOK();
        boolean boolean9 = linkedList0.property_1();
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        int int11 = linkedList10.size();
        linkedList10.clear();
        int int13 = linkedList10.size();
        int int14 = linkedList10.size();
        linkedList10.clear();
        boolean boolean16 = linkedList10.property_4();
        java.lang.Class<?> wildcardClass17 = linkedList10.getClass();
        boolean boolean18 = linkedList0.add((java.lang.Object) wildcardClass17);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean3 = linkedList0.property_1();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        int int5 = linkedList4.size();
        boolean boolean6 = linkedList4.property_1();
        boolean boolean8 = linkedList4.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        boolean boolean10 = linkedList9.property_4();
        boolean boolean11 = linkedList4.remove((java.lang.Object) boolean10);
        linkedList4.clear();
        system.testclass.LinkedList linkedList13 = new system.testclass.LinkedList();
        linkedList13.clear();
        linkedList13.clear();
        boolean boolean16 = linkedList13.composedRepOK();
        boolean boolean17 = linkedList13.composedRepOK();
        boolean boolean18 = linkedList13.property_1();
        boolean boolean19 = linkedList4.remove((java.lang.Object) linkedList13);
        boolean boolean20 = linkedList13.composedRepOK();
        system.testclass.LinkedList linkedList21 = new system.testclass.LinkedList();
        linkedList21.clear();
        linkedList21.clear();
        boolean boolean24 = linkedList21.property_4();
        linkedList21.clear();
        linkedList21.clear();
        linkedList21.clear();
        linkedList21.clear();
        boolean boolean29 = linkedList13.remove((java.lang.Object) linkedList21);
        boolean boolean30 = linkedList0.add((java.lang.Object) linkedList13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean3 = linkedList0.property_1();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        boolean boolean5 = linkedList4.property_4();
        boolean boolean7 = linkedList4.remove((java.lang.Object) 0.0f);
        boolean boolean8 = linkedList4.property_4();
        int int9 = linkedList4.size();
        boolean boolean10 = linkedList0.add((java.lang.Object) linkedList4);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        boolean boolean2 = linkedList0.property_1();
        boolean boolean3 = linkedList0.property_4();
        int int4 = linkedList0.size();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        boolean boolean6 = linkedList5.property_4();
        boolean boolean8 = linkedList5.remove((java.lang.Object) 0.0f);
        linkedList5.clear();
        int int10 = linkedList5.size();
        linkedList5.clear();
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        linkedList12.clear();
        linkedList12.clear();
        boolean boolean15 = linkedList12.property_4();
        linkedList12.clear();
        linkedList12.clear();
        boolean boolean18 = linkedList5.remove((java.lang.Object) linkedList12);
        boolean boolean19 = linkedList12.composedRepOK();
        boolean boolean20 = linkedList0.remove((java.lang.Object) boolean19);
        boolean boolean21 = linkedList0.property_4();
        java.lang.Object obj22 = null;
        boolean boolean23 = linkedList0.add(obj22);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        boolean boolean2 = linkedList0.property_4();
        int int3 = linkedList0.size();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        linkedList4.clear();
        linkedList4.clear();
        boolean boolean7 = linkedList4.property_4();
        boolean boolean8 = linkedList4.property_4();
        boolean boolean9 = linkedList4.property_1();
        boolean boolean10 = linkedList0.add((java.lang.Object) linkedList4);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        boolean boolean3 = linkedList0.property_1();
        int int4 = linkedList0.size();
        linkedList0.clear();
        linkedList0.clear();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        int int8 = linkedList7.size();
        boolean boolean9 = linkedList7.property_1();
        boolean boolean10 = linkedList7.property_4();
        int int11 = linkedList7.size();
        boolean boolean12 = linkedList0.add((java.lang.Object) linkedList7);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.property_4();
        boolean boolean5 = linkedList0.property_4();
        boolean boolean6 = linkedList0.property_4();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        int int8 = linkedList7.size();
        boolean boolean9 = linkedList7.property_1();
        boolean boolean11 = linkedList7.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        boolean boolean13 = linkedList12.property_4();
        boolean boolean14 = linkedList7.remove((java.lang.Object) boolean13);
        system.testclass.LinkedList linkedList15 = new system.testclass.LinkedList();
        linkedList15.clear();
        linkedList15.clear();
        java.lang.Object obj18 = null;
        boolean boolean19 = linkedList15.remove(obj18);
        boolean boolean20 = linkedList15.property_1();
        boolean boolean21 = linkedList15.composedRepOK();
        boolean boolean22 = linkedList7.remove((java.lang.Object) boolean21);
        boolean boolean23 = linkedList7.composedRepOK();
        boolean boolean24 = linkedList0.add((java.lang.Object) boolean23);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean3 = linkedList0.composedRepOK();
        int int4 = linkedList0.size();
        linkedList0.clear();
        boolean boolean7 = linkedList0.remove((java.lang.Object) (byte) 0);
        boolean boolean8 = linkedList0.property_4();
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        linkedList9.clear();
        linkedList9.clear();
        boolean boolean12 = linkedList9.composedRepOK();
        boolean boolean13 = linkedList0.remove((java.lang.Object) linkedList9);
        linkedList0.clear();
        boolean boolean15 = linkedList0.property_4();
        int int16 = linkedList0.size();
        int int17 = linkedList0.size();
        java.lang.Object obj18 = null;
        boolean boolean19 = linkedList0.add(obj18);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.property_4();
        boolean boolean5 = linkedList0.property_4();
        boolean boolean6 = linkedList0.composedRepOK();
        boolean boolean7 = linkedList0.composedRepOK();
        boolean boolean8 = linkedList0.composedRepOK();
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        linkedList9.clear();
        linkedList9.clear();
        boolean boolean12 = linkedList9.composedRepOK();
        int int13 = linkedList9.size();
        linkedList9.clear();
        boolean boolean16 = linkedList9.remove((java.lang.Object) (byte) 0);
        boolean boolean17 = linkedList9.property_4();
        boolean boolean18 = linkedList9.composedRepOK();
        boolean boolean19 = linkedList9.property_1();
        boolean boolean21 = linkedList9.remove((java.lang.Object) "hi!");
        boolean boolean22 = linkedList0.add((java.lang.Object) boolean21);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean3 = linkedList0.composedRepOK();
        int int4 = linkedList0.size();
        linkedList0.clear();
        boolean boolean7 = linkedList0.remove((java.lang.Object) (byte) 0);
        boolean boolean8 = linkedList0.property_4();
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        linkedList9.clear();
        linkedList9.clear();
        boolean boolean12 = linkedList9.composedRepOK();
        boolean boolean13 = linkedList0.remove((java.lang.Object) linkedList9);
        linkedList0.clear();
        boolean boolean15 = linkedList0.property_4();
        system.testclass.LinkedList linkedList16 = new system.testclass.LinkedList();
        linkedList16.clear();
        linkedList16.clear();
        boolean boolean19 = linkedList16.property_4();
        boolean boolean20 = linkedList16.property_4();
        boolean boolean21 = linkedList16.property_1();
        linkedList16.clear();
        boolean boolean23 = linkedList16.property_1();
        boolean boolean24 = linkedList0.add((java.lang.Object) boolean23);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        java.lang.Object obj3 = null;
        boolean boolean4 = linkedList0.remove(obj3);
        int int5 = linkedList0.size();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        int int7 = linkedList6.size();
        boolean boolean8 = linkedList6.property_1();
        boolean boolean10 = linkedList6.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        boolean boolean12 = linkedList11.property_4();
        boolean boolean13 = linkedList6.remove((java.lang.Object) boolean12);
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        linkedList14.clear();
        linkedList14.clear();
        java.lang.Object obj17 = null;
        boolean boolean18 = linkedList14.remove(obj17);
        boolean boolean19 = linkedList14.property_1();
        boolean boolean20 = linkedList14.composedRepOK();
        boolean boolean21 = linkedList6.remove((java.lang.Object) boolean20);
        boolean boolean22 = linkedList6.composedRepOK();
        system.testclass.LinkedList linkedList23 = new system.testclass.LinkedList();
        int int24 = linkedList23.size();
        linkedList23.clear();
        int int26 = linkedList23.size();
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        boolean boolean29 = linkedList23.remove((java.lang.Object) wildcardClass28);
        linkedList23.clear();
        boolean boolean31 = linkedList6.remove((java.lang.Object) linkedList23);
        boolean boolean32 = linkedList6.composedRepOK();
        boolean boolean33 = linkedList6.composedRepOK();
        int int34 = linkedList6.size();
        system.testclass.LinkedList linkedList35 = new system.testclass.LinkedList();
        int int36 = linkedList35.size();
        linkedList35.clear();
        int int38 = linkedList35.size();
        boolean boolean39 = linkedList35.property_4();
        boolean boolean40 = linkedList35.property_4();
        boolean boolean41 = linkedList35.composedRepOK();
        boolean boolean42 = linkedList35.composedRepOK();
        boolean boolean43 = linkedList35.composedRepOK();
        boolean boolean44 = linkedList6.remove((java.lang.Object) linkedList35);
        boolean boolean45 = linkedList0.remove((java.lang.Object) boolean44);
        system.testclass.LinkedList linkedList46 = new system.testclass.LinkedList();
        linkedList46.clear();
        linkedList46.clear();
        boolean boolean49 = linkedList46.composedRepOK();
        int int50 = linkedList46.size();
        linkedList46.clear();
        boolean boolean53 = linkedList46.remove((java.lang.Object) (byte) 0);
        boolean boolean55 = linkedList46.remove((java.lang.Object) (-1.0f));
        boolean boolean56 = linkedList46.property_4();
        boolean boolean57 = linkedList46.composedRepOK();
        boolean boolean58 = linkedList46.property_1();
        system.testclass.LinkedList linkedList59 = new system.testclass.LinkedList();
        boolean boolean60 = linkedList59.property_4();
        system.testclass.LinkedList linkedList61 = new system.testclass.LinkedList();
        boolean boolean62 = linkedList59.remove((java.lang.Object) linkedList61);
        boolean boolean63 = linkedList59.composedRepOK();
        boolean boolean64 = linkedList46.remove((java.lang.Object) boolean63);
        boolean boolean65 = linkedList0.remove((java.lang.Object) boolean63);
        system.testclass.LinkedList linkedList66 = new system.testclass.LinkedList();
        int int67 = linkedList66.size();
        linkedList66.clear();
        int int69 = linkedList66.size();
        boolean boolean70 = linkedList66.property_4();
        boolean boolean71 = linkedList66.property_4();
        boolean boolean72 = linkedList66.composedRepOK();
        boolean boolean73 = linkedList66.composedRepOK();
        boolean boolean74 = linkedList0.add((java.lang.Object) boolean73);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_4();
        boolean boolean3 = linkedList0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedList0.composedRepOK();
        int int5 = linkedList0.size();
        boolean boolean6 = linkedList0.property_4();
        boolean boolean8 = linkedList0.add((java.lang.Object) 10.0d);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        boolean boolean2 = linkedList0.property_1();
        boolean boolean3 = linkedList0.property_4();
        boolean boolean4 = linkedList0.composedRepOK();
        boolean boolean6 = linkedList0.remove((java.lang.Object) 0L);
        linkedList0.clear();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        int int9 = linkedList8.size();
        boolean boolean10 = linkedList8.property_1();
        boolean boolean11 = linkedList8.property_4();
        boolean boolean12 = linkedList8.composedRepOK();
        boolean boolean14 = linkedList8.remove((java.lang.Object) 0L);
        linkedList8.clear();
        linkedList8.clear();
        boolean boolean17 = linkedList8.composedRepOK();
        boolean boolean18 = linkedList0.add((java.lang.Object) linkedList8);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.property_4();
        boolean boolean5 = linkedList0.property_4();
        boolean boolean6 = linkedList0.property_4();
        linkedList0.clear();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        int int9 = linkedList8.size();
        boolean boolean10 = linkedList8.property_1();
        boolean boolean11 = linkedList8.property_4();
        boolean boolean12 = linkedList8.composedRepOK();
        boolean boolean14 = linkedList8.remove((java.lang.Object) 0L);
        int int15 = linkedList8.size();
        boolean boolean16 = linkedList8.property_4();
        boolean boolean17 = linkedList0.add((java.lang.Object) boolean16);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_4();
        system.testclass.LinkedList linkedList2 = new system.testclass.LinkedList();
        boolean boolean3 = linkedList0.remove((java.lang.Object) linkedList2);
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        boolean boolean5 = linkedList4.property_4();
        java.lang.Class<?> wildcardClass6 = linkedList4.getClass();
        boolean boolean7 = linkedList2.remove((java.lang.Object) wildcardClass6);
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        boolean boolean9 = linkedList2.add((java.lang.Object) linkedList8);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList2", linkedList2.property_5());
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        boolean boolean2 = linkedList0.property_1();
        boolean boolean3 = linkedList0.property_4();
        int int4 = linkedList0.size();
        boolean boolean6 = linkedList0.remove((java.lang.Object) 0.0f);
        linkedList0.clear();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        int int9 = linkedList8.size();
        boolean boolean10 = linkedList8.property_1();
        boolean boolean11 = linkedList8.property_4();
        int int12 = linkedList8.size();
        boolean boolean14 = linkedList8.remove((java.lang.Object) 0.0f);
        linkedList8.clear();
        boolean boolean17 = linkedList8.remove((java.lang.Object) (byte) 1);
        java.lang.Class<?> wildcardClass18 = linkedList8.getClass();
        boolean boolean19 = linkedList0.remove((java.lang.Object) wildcardClass18);
        boolean boolean20 = linkedList0.property_1();
        system.testclass.LinkedList linkedList21 = new system.testclass.LinkedList();
        int int22 = linkedList21.size();
        boolean boolean23 = linkedList0.add((java.lang.Object) linkedList21);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        boolean boolean2 = linkedList0.property_4();
        boolean boolean3 = linkedList0.property_4();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        int int5 = linkedList4.size();
        boolean boolean6 = linkedList4.property_1();
        boolean boolean7 = linkedList4.property_4();
        int int8 = linkedList4.size();
        linkedList4.clear();
        linkedList4.clear();
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        int int12 = linkedList11.size();
        boolean boolean13 = linkedList11.property_1();
        boolean boolean15 = linkedList11.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList16 = new system.testclass.LinkedList();
        boolean boolean17 = linkedList16.property_4();
        boolean boolean18 = linkedList11.remove((java.lang.Object) boolean17);
        system.testclass.LinkedList linkedList19 = new system.testclass.LinkedList();
        linkedList19.clear();
        linkedList19.clear();
        java.lang.Object obj22 = null;
        boolean boolean23 = linkedList19.remove(obj22);
        boolean boolean24 = linkedList19.property_1();
        boolean boolean25 = linkedList19.composedRepOK();
        boolean boolean26 = linkedList11.remove((java.lang.Object) boolean25);
        int int27 = linkedList11.size();
        boolean boolean28 = linkedList4.remove((java.lang.Object) linkedList11);
        boolean boolean29 = linkedList0.remove((java.lang.Object) linkedList4);
        int int30 = linkedList0.size();
        system.testclass.LinkedList linkedList31 = new system.testclass.LinkedList();
        int int32 = linkedList31.size();
        boolean boolean33 = linkedList31.property_1();
        boolean boolean34 = linkedList31.property_4();
        int int35 = linkedList31.size();
        linkedList31.clear();
        linkedList31.clear();
        system.testclass.LinkedList linkedList38 = new system.testclass.LinkedList();
        int int39 = linkedList38.size();
        boolean boolean40 = linkedList38.property_1();
        boolean boolean42 = linkedList38.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList43 = new system.testclass.LinkedList();
        boolean boolean44 = linkedList43.property_4();
        boolean boolean45 = linkedList38.remove((java.lang.Object) boolean44);
        system.testclass.LinkedList linkedList46 = new system.testclass.LinkedList();
        linkedList46.clear();
        linkedList46.clear();
        java.lang.Object obj49 = null;
        boolean boolean50 = linkedList46.remove(obj49);
        boolean boolean51 = linkedList46.property_1();
        boolean boolean52 = linkedList46.composedRepOK();
        boolean boolean53 = linkedList38.remove((java.lang.Object) boolean52);
        int int54 = linkedList38.size();
        boolean boolean55 = linkedList31.remove((java.lang.Object) linkedList38);
        boolean boolean56 = linkedList0.remove((java.lang.Object) linkedList38);
        system.testclass.LinkedList linkedList57 = new system.testclass.LinkedList();
        boolean boolean58 = linkedList57.property_4();
        system.testclass.LinkedList linkedList59 = new system.testclass.LinkedList();
        boolean boolean60 = linkedList57.remove((java.lang.Object) linkedList59);
        linkedList59.clear();
        int int62 = linkedList59.size();
        linkedList59.clear();
        boolean boolean64 = linkedList0.add((java.lang.Object) linkedList59);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        boolean boolean2 = linkedList0.property_1();
        boolean boolean3 = linkedList0.composedRepOK();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        int int5 = linkedList4.size();
        boolean boolean6 = linkedList4.property_1();
        boolean boolean7 = linkedList4.property_4();
        int int8 = linkedList4.size();
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        boolean boolean10 = linkedList9.property_4();
        boolean boolean12 = linkedList9.remove((java.lang.Object) 0.0f);
        linkedList9.clear();
        int int14 = linkedList9.size();
        linkedList9.clear();
        system.testclass.LinkedList linkedList16 = new system.testclass.LinkedList();
        linkedList16.clear();
        linkedList16.clear();
        boolean boolean19 = linkedList16.property_4();
        linkedList16.clear();
        linkedList16.clear();
        boolean boolean22 = linkedList9.remove((java.lang.Object) linkedList16);
        boolean boolean23 = linkedList16.composedRepOK();
        boolean boolean24 = linkedList4.remove((java.lang.Object) boolean23);
        boolean boolean25 = linkedList0.remove((java.lang.Object) linkedList4);
        system.testclass.LinkedList linkedList26 = new system.testclass.LinkedList();
        linkedList26.clear();
        linkedList26.clear();
        boolean boolean29 = linkedList26.property_1();
        boolean boolean30 = linkedList26.property_1();
        system.testclass.LinkedList linkedList31 = new system.testclass.LinkedList();
        boolean boolean32 = linkedList31.property_4();
        boolean boolean34 = linkedList31.remove((java.lang.Object) 0.0f);
        boolean boolean35 = linkedList31.property_4();
        boolean boolean36 = linkedList26.remove((java.lang.Object) linkedList31);
        boolean boolean37 = linkedList0.remove((java.lang.Object) boolean36);
        int int38 = linkedList0.size();
        system.testclass.LinkedList linkedList39 = new system.testclass.LinkedList();
        int int40 = linkedList39.size();
        boolean boolean41 = linkedList39.property_1();
        boolean boolean42 = linkedList39.property_4();
        int int43 = linkedList39.size();
        boolean boolean45 = linkedList39.remove((java.lang.Object) 0.0f);
        linkedList39.clear();
        int int47 = linkedList39.size();
        system.testclass.LinkedList linkedList48 = new system.testclass.LinkedList();
        linkedList48.clear();
        linkedList48.clear();
        boolean boolean51 = linkedList48.property_4();
        boolean boolean52 = linkedList48.property_4();
        boolean boolean53 = linkedList48.property_1();
        linkedList48.clear();
        linkedList48.clear();
        boolean boolean56 = linkedList39.remove((java.lang.Object) linkedList48);
        boolean boolean57 = linkedList0.add((java.lang.Object) linkedList48);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_4();
        system.testclass.LinkedList linkedList2 = new system.testclass.LinkedList();
        boolean boolean3 = linkedList0.remove((java.lang.Object) linkedList2);
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        boolean boolean5 = linkedList4.property_4();
        java.lang.Class<?> wildcardClass6 = linkedList4.getClass();
        boolean boolean7 = linkedList2.remove((java.lang.Object) wildcardClass6);
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        int int9 = linkedList8.size();
        boolean boolean10 = linkedList8.property_1();
        boolean boolean12 = linkedList8.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList13 = new system.testclass.LinkedList();
        boolean boolean14 = linkedList13.property_4();
        boolean boolean15 = linkedList8.remove((java.lang.Object) boolean14);
        system.testclass.LinkedList linkedList16 = new system.testclass.LinkedList();
        linkedList16.clear();
        linkedList16.clear();
        java.lang.Object obj19 = null;
        boolean boolean20 = linkedList16.remove(obj19);
        boolean boolean21 = linkedList16.property_1();
        boolean boolean22 = linkedList16.composedRepOK();
        boolean boolean23 = linkedList8.remove((java.lang.Object) boolean22);
        boolean boolean24 = linkedList8.property_1();
        boolean boolean25 = linkedList8.property_1();
        boolean boolean26 = linkedList2.remove((java.lang.Object) boolean25);
        boolean boolean27 = linkedList2.composedRepOK();
        boolean boolean28 = linkedList2.composedRepOK();
        system.testclass.LinkedList linkedList29 = new system.testclass.LinkedList();
        linkedList29.clear();
        boolean boolean31 = linkedList29.property_1();
        boolean boolean32 = linkedList29.composedRepOK();
        system.testclass.LinkedList linkedList33 = new system.testclass.LinkedList();
        int int34 = linkedList33.size();
        boolean boolean35 = linkedList33.property_1();
        boolean boolean36 = linkedList33.property_4();
        int int37 = linkedList33.size();
        system.testclass.LinkedList linkedList38 = new system.testclass.LinkedList();
        boolean boolean39 = linkedList38.property_4();
        boolean boolean41 = linkedList38.remove((java.lang.Object) 0.0f);
        linkedList38.clear();
        int int43 = linkedList38.size();
        linkedList38.clear();
        system.testclass.LinkedList linkedList45 = new system.testclass.LinkedList();
        linkedList45.clear();
        linkedList45.clear();
        boolean boolean48 = linkedList45.property_4();
        linkedList45.clear();
        linkedList45.clear();
        boolean boolean51 = linkedList38.remove((java.lang.Object) linkedList45);
        boolean boolean52 = linkedList45.composedRepOK();
        boolean boolean53 = linkedList33.remove((java.lang.Object) boolean52);
        boolean boolean54 = linkedList29.remove((java.lang.Object) linkedList33);
        system.testclass.LinkedList linkedList55 = new system.testclass.LinkedList();
        linkedList55.clear();
        linkedList55.clear();
        boolean boolean58 = linkedList55.property_1();
        boolean boolean59 = linkedList55.property_1();
        system.testclass.LinkedList linkedList60 = new system.testclass.LinkedList();
        boolean boolean61 = linkedList60.property_4();
        boolean boolean63 = linkedList60.remove((java.lang.Object) 0.0f);
        boolean boolean64 = linkedList60.property_4();
        boolean boolean65 = linkedList55.remove((java.lang.Object) linkedList60);
        boolean boolean66 = linkedList29.remove((java.lang.Object) boolean65);
        boolean boolean67 = linkedList2.add((java.lang.Object) boolean65);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList2", linkedList2.property_5());
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        boolean boolean2 = linkedList0.property_1();
        boolean boolean3 = linkedList0.property_4();
        int int4 = linkedList0.size();
        linkedList0.clear();
        linkedList0.clear();
        int int7 = linkedList0.size();
        boolean boolean8 = linkedList0.property_4();
        java.lang.Object obj9 = null;
        boolean boolean10 = linkedList0.add(obj9);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean3 = linkedList0.property_1();
        int int4 = linkedList0.size();
        boolean boolean5 = linkedList0.composedRepOK();
        boolean boolean6 = linkedList0.composedRepOK();
        boolean boolean7 = linkedList0.composedRepOK();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        int int9 = linkedList8.size();
        boolean boolean10 = linkedList8.property_1();
        boolean boolean11 = linkedList8.property_4();
        int int12 = linkedList8.size();
        int int13 = linkedList8.size();
        boolean boolean14 = linkedList8.property_4();
        boolean boolean15 = linkedList8.composedRepOK();
        system.testclass.LinkedList linkedList16 = new system.testclass.LinkedList();
        boolean boolean17 = linkedList16.property_4();
        boolean boolean19 = linkedList16.remove((java.lang.Object) 0.0f);
        linkedList16.clear();
        boolean boolean21 = linkedList16.composedRepOK();
        system.testclass.LinkedList linkedList22 = new system.testclass.LinkedList();
        int int23 = linkedList22.size();
        linkedList22.clear();
        int int25 = linkedList22.size();
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        boolean boolean28 = linkedList22.remove((java.lang.Object) wildcardClass27);
        linkedList22.clear();
        boolean boolean30 = linkedList22.composedRepOK();
        boolean boolean31 = linkedList16.remove((java.lang.Object) linkedList22);
        boolean boolean32 = linkedList8.remove((java.lang.Object) boolean31);
        boolean boolean33 = linkedList8.property_1();
        boolean boolean34 = linkedList0.add((java.lang.Object) boolean33);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        int int4 = linkedList0.size();
        linkedList0.clear();
        boolean boolean6 = linkedList0.composedRepOK();
        int int7 = linkedList0.size();
        linkedList0.clear();
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        int int10 = linkedList9.size();
        boolean boolean11 = linkedList9.property_1();
        boolean boolean12 = linkedList9.property_4();
        int int13 = linkedList9.size();
        boolean boolean14 = linkedList9.composedRepOK();
        linkedList9.clear();
        boolean boolean16 = linkedList0.add((java.lang.Object) linkedList9);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        boolean boolean2 = linkedList0.property_1();
        boolean boolean3 = linkedList0.property_4();
        boolean boolean4 = linkedList0.composedRepOK();
        boolean boolean6 = linkedList0.remove((java.lang.Object) 0L);
        boolean boolean7 = linkedList0.property_1();
        boolean boolean8 = linkedList0.property_4();
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        int int10 = linkedList9.size();
        boolean boolean11 = linkedList9.property_1();
        boolean boolean13 = linkedList9.remove((java.lang.Object) (-1L));
        boolean boolean14 = linkedList0.add((java.lang.Object) (-1L));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean3 = linkedList0.property_1();
        int int4 = linkedList0.size();
        boolean boolean5 = linkedList0.composedRepOK();
        boolean boolean6 = linkedList0.composedRepOK();
        boolean boolean7 = linkedList0.composedRepOK();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        int int9 = linkedList8.size();
        linkedList8.clear();
        boolean boolean11 = linkedList8.property_1();
        int int12 = linkedList8.size();
        linkedList8.clear();
        boolean boolean14 = linkedList0.add((java.lang.Object) linkedList8);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean3 = linkedList0.composedRepOK();
        int int4 = linkedList0.size();
        linkedList0.clear();
        boolean boolean6 = linkedList0.property_4();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        int int8 = linkedList7.size();
        boolean boolean9 = linkedList7.property_1();
        boolean boolean10 = linkedList7.property_4();
        int int11 = linkedList7.size();
        linkedList7.clear();
        linkedList7.clear();
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        int int15 = linkedList14.size();
        boolean boolean16 = linkedList14.property_1();
        boolean boolean18 = linkedList14.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList19 = new system.testclass.LinkedList();
        boolean boolean20 = linkedList19.property_4();
        boolean boolean21 = linkedList14.remove((java.lang.Object) boolean20);
        system.testclass.LinkedList linkedList22 = new system.testclass.LinkedList();
        linkedList22.clear();
        linkedList22.clear();
        java.lang.Object obj25 = null;
        boolean boolean26 = linkedList22.remove(obj25);
        boolean boolean27 = linkedList22.property_1();
        boolean boolean28 = linkedList22.composedRepOK();
        boolean boolean29 = linkedList14.remove((java.lang.Object) boolean28);
        int int30 = linkedList14.size();
        boolean boolean31 = linkedList7.remove((java.lang.Object) linkedList14);
        boolean boolean32 = linkedList0.remove((java.lang.Object) linkedList7);
        boolean boolean33 = linkedList7.property_4();
        system.testclass.LinkedList linkedList34 = new system.testclass.LinkedList();
        int int35 = linkedList34.size();
        boolean boolean36 = linkedList34.property_1();
        boolean boolean37 = linkedList34.property_4();
        int int38 = linkedList34.size();
        int int39 = linkedList34.size();
        boolean boolean40 = linkedList34.property_1();
        boolean boolean41 = linkedList34.property_4();
        boolean boolean42 = linkedList34.property_4();
        system.testclass.LinkedList linkedList43 = new system.testclass.LinkedList();
        linkedList43.clear();
        linkedList43.clear();
        boolean boolean46 = linkedList43.property_4();
        boolean boolean47 = linkedList43.property_4();
        boolean boolean48 = linkedList43.property_1();
        linkedList43.clear();
        boolean boolean50 = linkedList43.property_1();
        boolean boolean51 = linkedList34.remove((java.lang.Object) boolean50);
        boolean boolean52 = linkedList7.add((java.lang.Object) boolean51);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList7", linkedList7.property_5());
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        boolean boolean2 = linkedList0.property_4();
        boolean boolean3 = linkedList0.property_4();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        linkedList4.clear();
        linkedList4.clear();
        boolean boolean7 = linkedList4.composedRepOK();
        boolean boolean8 = linkedList0.add((java.lang.Object) linkedList4);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean3 = linkedList0.composedRepOK();
        int int4 = linkedList0.size();
        linkedList0.clear();
        boolean boolean7 = linkedList0.remove((java.lang.Object) (byte) 0);
        boolean boolean8 = linkedList0.property_4();
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        linkedList9.clear();
        linkedList9.clear();
        boolean boolean12 = linkedList9.composedRepOK();
        boolean boolean13 = linkedList0.remove((java.lang.Object) linkedList9);
        linkedList0.clear();
        boolean boolean15 = linkedList0.property_4();
        int int16 = linkedList0.size();
        int int17 = linkedList0.size();
        boolean boolean18 = linkedList0.property_1();
        linkedList0.clear();
        system.testclass.LinkedList linkedList20 = new system.testclass.LinkedList();
        linkedList20.clear();
        linkedList20.clear();
        boolean boolean23 = linkedList20.property_1();
        boolean boolean24 = linkedList20.property_1();
        system.testclass.LinkedList linkedList25 = new system.testclass.LinkedList();
        boolean boolean26 = linkedList25.property_4();
        boolean boolean28 = linkedList25.remove((java.lang.Object) 0.0f);
        boolean boolean29 = linkedList25.property_4();
        boolean boolean30 = linkedList20.remove((java.lang.Object) linkedList25);
        boolean boolean31 = linkedList25.property_4();
        int int32 = linkedList25.size();
        boolean boolean33 = linkedList25.composedRepOK();
        boolean boolean34 = linkedList25.property_4();
        boolean boolean35 = linkedList0.add((java.lang.Object) linkedList25);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean3 = linkedList0.composedRepOK();
        int int4 = linkedList0.size();
        linkedList0.clear();
        boolean boolean7 = linkedList0.remove((java.lang.Object) (byte) 0);
        boolean boolean8 = linkedList0.property_4();
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        linkedList9.clear();
        linkedList9.clear();
        boolean boolean12 = linkedList9.composedRepOK();
        boolean boolean13 = linkedList0.remove((java.lang.Object) linkedList9);
        boolean boolean14 = linkedList0.composedRepOK();
        system.testclass.LinkedList linkedList15 = new system.testclass.LinkedList();
        linkedList15.clear();
        linkedList15.clear();
        boolean boolean18 = linkedList15.property_1();
        boolean boolean19 = linkedList15.property_1();
        system.testclass.LinkedList linkedList20 = new system.testclass.LinkedList();
        boolean boolean21 = linkedList20.property_4();
        boolean boolean23 = linkedList20.remove((java.lang.Object) 0.0f);
        boolean boolean24 = linkedList20.property_4();
        boolean boolean25 = linkedList15.remove((java.lang.Object) linkedList20);
        boolean boolean26 = linkedList20.property_4();
        system.testclass.LinkedList linkedList27 = new system.testclass.LinkedList();
        int int28 = linkedList27.size();
        boolean boolean29 = linkedList27.property_1();
        boolean boolean30 = linkedList27.property_4();
        int int31 = linkedList27.size();
        boolean boolean33 = linkedList27.remove((java.lang.Object) 0.0f);
        linkedList27.clear();
        boolean boolean36 = linkedList27.remove((java.lang.Object) (byte) 1);
        boolean boolean37 = linkedList27.property_4();
        boolean boolean38 = linkedList27.property_4();
        linkedList27.clear();
        boolean boolean40 = linkedList20.remove((java.lang.Object) linkedList27);
        boolean boolean41 = linkedList0.add((java.lang.Object) linkedList27);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_4();
        boolean boolean3 = linkedList0.remove((java.lang.Object) 0.0f);
        linkedList0.clear();
        boolean boolean5 = linkedList0.property_1();
        boolean boolean6 = linkedList0.property_4();
        boolean boolean8 = linkedList0.add((java.lang.Object) (-1.0f));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean3 = linkedList0.property_1();
        int int4 = linkedList0.size();
        boolean boolean5 = linkedList0.composedRepOK();
        boolean boolean6 = linkedList0.property_1();
        int int7 = linkedList0.size();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        linkedList8.clear();
        linkedList8.clear();
        boolean boolean11 = linkedList8.composedRepOK();
        int int12 = linkedList8.size();
        linkedList8.clear();
        boolean boolean15 = linkedList8.remove((java.lang.Object) (byte) 0);
        boolean boolean17 = linkedList8.remove((java.lang.Object) (-1.0f));
        boolean boolean18 = linkedList8.property_4();
        boolean boolean19 = linkedList8.composedRepOK();
        boolean boolean20 = linkedList8.property_1();
        boolean boolean21 = linkedList0.add((java.lang.Object) boolean20);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        boolean boolean2 = linkedList0.property_1();
        boolean boolean3 = linkedList0.property_4();
        int int4 = linkedList0.size();
        linkedList0.clear();
        linkedList0.clear();
        int int7 = linkedList0.size();
        boolean boolean8 = linkedList0.property_4();
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        boolean boolean10 = linkedList9.property_4();
        boolean boolean12 = linkedList9.remove((java.lang.Object) 0.0f);
        linkedList9.clear();
        boolean boolean14 = linkedList9.property_4();
        linkedList9.clear();
        int int16 = linkedList9.size();
        boolean boolean17 = linkedList0.add((java.lang.Object) linkedList9);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        boolean boolean2 = linkedList0.property_1();
        boolean boolean3 = linkedList0.property_1();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        linkedList4.clear();
        linkedList4.clear();
        boolean boolean7 = linkedList4.composedRepOK();
        int int8 = linkedList4.size();
        linkedList4.clear();
        boolean boolean11 = linkedList4.remove((java.lang.Object) (byte) 0);
        boolean boolean12 = linkedList4.property_4();
        system.testclass.LinkedList linkedList13 = new system.testclass.LinkedList();
        linkedList13.clear();
        linkedList13.clear();
        boolean boolean16 = linkedList13.composedRepOK();
        boolean boolean17 = linkedList4.remove((java.lang.Object) linkedList13);
        linkedList4.clear();
        int int19 = linkedList4.size();
        boolean boolean20 = linkedList0.add((java.lang.Object) int19);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_4();
        boolean boolean3 = linkedList0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedList0.property_4();
        int int5 = linkedList0.size();
        boolean boolean7 = linkedList0.add((java.lang.Object) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        java.lang.Object obj3 = null;
        boolean boolean4 = linkedList0.remove(obj3);
        boolean boolean5 = linkedList0.property_4();
        boolean boolean7 = linkedList0.remove((java.lang.Object) (-1.0f));
        boolean boolean8 = linkedList0.composedRepOK();
        boolean boolean10 = linkedList0.add((java.lang.Object) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean3 = linkedList0.composedRepOK();
        int int4 = linkedList0.size();
        linkedList0.clear();
        boolean boolean6 = linkedList0.property_1();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        linkedList7.clear();
        linkedList7.clear();
        boolean boolean10 = linkedList7.composedRepOK();
        int int11 = linkedList7.size();
        linkedList7.clear();
        boolean boolean14 = linkedList7.remove((java.lang.Object) (byte) 0);
        boolean boolean15 = linkedList7.property_4();
        boolean boolean16 = linkedList7.composedRepOK();
        boolean boolean17 = linkedList7.property_1();
        boolean boolean19 = linkedList7.remove((java.lang.Object) "hi!");
        boolean boolean20 = linkedList0.add((java.lang.Object) linkedList7);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        int int4 = linkedList0.size();
        linkedList0.clear();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        int int7 = linkedList6.size();
        boolean boolean8 = linkedList6.property_1();
        boolean boolean9 = linkedList6.property_4();
        boolean boolean10 = linkedList6.composedRepOK();
        boolean boolean12 = linkedList6.remove((java.lang.Object) 0L);
        boolean boolean13 = linkedList6.property_1();
        boolean boolean14 = linkedList6.property_4();
        boolean boolean15 = linkedList0.remove((java.lang.Object) boolean14);
        system.testclass.LinkedList linkedList16 = new system.testclass.LinkedList();
        boolean boolean17 = linkedList16.property_4();
        boolean boolean18 = linkedList0.add((java.lang.Object) linkedList16);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean3 = linkedList0.composedRepOK();
        int int4 = linkedList0.size();
        linkedList0.clear();
        boolean boolean7 = linkedList0.remove((java.lang.Object) (byte) 0);
        boolean boolean8 = linkedList0.property_4();
        boolean boolean9 = linkedList0.composedRepOK();
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        linkedList10.clear();
        linkedList10.clear();
        boolean boolean13 = linkedList10.property_4();
        boolean boolean14 = linkedList10.property_4();
        int int15 = linkedList10.size();
        boolean boolean16 = linkedList10.composedRepOK();
        boolean boolean17 = linkedList10.composedRepOK();
        boolean boolean18 = linkedList0.add((java.lang.Object) linkedList10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        boolean boolean6 = linkedList0.remove((java.lang.Object) wildcardClass5);
        int int7 = linkedList0.size();
        boolean boolean8 = linkedList0.property_4();
        boolean boolean9 = linkedList0.property_4();
        linkedList0.clear();
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        linkedList11.clear();
        linkedList11.clear();
        java.lang.Object obj14 = null;
        boolean boolean15 = linkedList11.remove(obj14);
        int int16 = linkedList11.size();
        boolean boolean17 = linkedList0.add((java.lang.Object) int16);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_4();
        boolean boolean3 = linkedList0.remove((java.lang.Object) 0.0f);
        linkedList0.clear();
        int int5 = linkedList0.size();
        linkedList0.clear();
        boolean boolean7 = linkedList0.composedRepOK();
        boolean boolean8 = linkedList0.property_4();
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        boolean boolean11 = linkedList0.add(obj9);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.property_4();
        boolean boolean5 = linkedList0.property_4();
        boolean boolean6 = linkedList0.composedRepOK();
        int int7 = linkedList0.size();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        linkedList8.clear();
        linkedList8.clear();
        boolean boolean11 = linkedList8.property_1();
        linkedList8.clear();
        boolean boolean14 = linkedList8.remove((java.lang.Object) true);
        int int15 = linkedList8.size();
        boolean boolean16 = linkedList0.add((java.lang.Object) linkedList8);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        boolean boolean2 = linkedList0.property_4();
        boolean boolean3 = linkedList0.property_4();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        int int5 = linkedList4.size();
        boolean boolean6 = linkedList4.property_1();
        boolean boolean7 = linkedList4.property_4();
        int int8 = linkedList4.size();
        linkedList4.clear();
        linkedList4.clear();
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        int int12 = linkedList11.size();
        boolean boolean13 = linkedList11.property_1();
        boolean boolean15 = linkedList11.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList16 = new system.testclass.LinkedList();
        boolean boolean17 = linkedList16.property_4();
        boolean boolean18 = linkedList11.remove((java.lang.Object) boolean17);
        system.testclass.LinkedList linkedList19 = new system.testclass.LinkedList();
        linkedList19.clear();
        linkedList19.clear();
        java.lang.Object obj22 = null;
        boolean boolean23 = linkedList19.remove(obj22);
        boolean boolean24 = linkedList19.property_1();
        boolean boolean25 = linkedList19.composedRepOK();
        boolean boolean26 = linkedList11.remove((java.lang.Object) boolean25);
        int int27 = linkedList11.size();
        boolean boolean28 = linkedList4.remove((java.lang.Object) linkedList11);
        boolean boolean29 = linkedList0.remove((java.lang.Object) linkedList4);
        int int30 = linkedList0.size();
        system.testclass.LinkedList linkedList31 = new system.testclass.LinkedList();
        int int32 = linkedList31.size();
        boolean boolean33 = linkedList31.property_1();
        boolean boolean34 = linkedList31.property_4();
        int int35 = linkedList31.size();
        linkedList31.clear();
        linkedList31.clear();
        system.testclass.LinkedList linkedList38 = new system.testclass.LinkedList();
        int int39 = linkedList38.size();
        boolean boolean40 = linkedList38.property_1();
        boolean boolean42 = linkedList38.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList43 = new system.testclass.LinkedList();
        boolean boolean44 = linkedList43.property_4();
        boolean boolean45 = linkedList38.remove((java.lang.Object) boolean44);
        system.testclass.LinkedList linkedList46 = new system.testclass.LinkedList();
        linkedList46.clear();
        linkedList46.clear();
        java.lang.Object obj49 = null;
        boolean boolean50 = linkedList46.remove(obj49);
        boolean boolean51 = linkedList46.property_1();
        boolean boolean52 = linkedList46.composedRepOK();
        boolean boolean53 = linkedList38.remove((java.lang.Object) boolean52);
        int int54 = linkedList38.size();
        boolean boolean55 = linkedList31.remove((java.lang.Object) linkedList38);
        boolean boolean56 = linkedList0.remove((java.lang.Object) linkedList38);
        system.testclass.LinkedList linkedList57 = new system.testclass.LinkedList();
        int int58 = linkedList57.size();
        boolean boolean59 = linkedList57.composedRepOK();
        boolean boolean60 = linkedList0.add((java.lang.Object) boolean59);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean3 = linkedList0.property_1();
        int int4 = linkedList0.size();
        boolean boolean5 = linkedList0.composedRepOK();
        boolean boolean6 = linkedList0.composedRepOK();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        int int8 = linkedList7.size();
        boolean boolean9 = linkedList7.property_1();
        boolean boolean11 = linkedList7.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        boolean boolean13 = linkedList12.property_4();
        boolean boolean14 = linkedList7.remove((java.lang.Object) boolean13);
        boolean boolean15 = linkedList0.add((java.lang.Object) boolean14);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean3 = linkedList0.composedRepOK();
        int int4 = linkedList0.size();
        linkedList0.clear();
        boolean boolean7 = linkedList0.remove((java.lang.Object) (byte) 0);
        boolean boolean8 = linkedList0.property_4();
        boolean boolean9 = linkedList0.composedRepOK();
        linkedList0.clear();
        int int11 = linkedList0.size();
        linkedList0.clear();
        system.testclass.LinkedList linkedList13 = new system.testclass.LinkedList();
        linkedList13.clear();
        boolean boolean15 = linkedList13.property_4();
        boolean boolean16 = linkedList13.property_4();
        system.testclass.LinkedList linkedList17 = new system.testclass.LinkedList();
        int int18 = linkedList17.size();
        boolean boolean19 = linkedList17.property_1();
        boolean boolean20 = linkedList17.property_4();
        int int21 = linkedList17.size();
        linkedList17.clear();
        linkedList17.clear();
        system.testclass.LinkedList linkedList24 = new system.testclass.LinkedList();
        int int25 = linkedList24.size();
        boolean boolean26 = linkedList24.property_1();
        boolean boolean28 = linkedList24.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList29 = new system.testclass.LinkedList();
        boolean boolean30 = linkedList29.property_4();
        boolean boolean31 = linkedList24.remove((java.lang.Object) boolean30);
        system.testclass.LinkedList linkedList32 = new system.testclass.LinkedList();
        linkedList32.clear();
        linkedList32.clear();
        java.lang.Object obj35 = null;
        boolean boolean36 = linkedList32.remove(obj35);
        boolean boolean37 = linkedList32.property_1();
        boolean boolean38 = linkedList32.composedRepOK();
        boolean boolean39 = linkedList24.remove((java.lang.Object) boolean38);
        int int40 = linkedList24.size();
        boolean boolean41 = linkedList17.remove((java.lang.Object) linkedList24);
        boolean boolean42 = linkedList13.remove((java.lang.Object) linkedList17);
        system.testclass.LinkedList linkedList43 = new system.testclass.LinkedList();
        linkedList43.clear();
        linkedList43.clear();
        boolean boolean46 = linkedList43.property_4();
        linkedList43.clear();
        boolean boolean48 = linkedList17.remove((java.lang.Object) linkedList43);
        boolean boolean49 = linkedList0.add((java.lang.Object) linkedList17);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean3 = linkedList0.composedRepOK();
        int int4 = linkedList0.size();
        linkedList0.clear();
        boolean boolean7 = linkedList0.remove((java.lang.Object) (byte) 0);
        boolean boolean8 = linkedList0.property_4();
        boolean boolean9 = linkedList0.composedRepOK();
        linkedList0.clear();
        linkedList0.clear();
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        linkedList12.clear();
        linkedList12.clear();
        boolean boolean15 = linkedList12.composedRepOK();
        int int16 = linkedList12.size();
        linkedList12.clear();
        boolean boolean19 = linkedList12.remove((java.lang.Object) (byte) 0);
        boolean boolean20 = linkedList12.property_4();
        system.testclass.LinkedList linkedList21 = new system.testclass.LinkedList();
        linkedList21.clear();
        linkedList21.clear();
        boolean boolean24 = linkedList21.composedRepOK();
        boolean boolean25 = linkedList12.remove((java.lang.Object) linkedList21);
        linkedList12.clear();
        boolean boolean27 = linkedList12.property_4();
        linkedList12.clear();
        boolean boolean29 = linkedList0.add((java.lang.Object) linkedList12);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        boolean boolean2 = linkedList0.property_1();
        boolean boolean4 = linkedList0.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        boolean boolean6 = linkedList5.property_4();
        boolean boolean7 = linkedList0.remove((java.lang.Object) boolean6);
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        linkedList8.clear();
        linkedList8.clear();
        java.lang.Object obj11 = null;
        boolean boolean12 = linkedList8.remove(obj11);
        boolean boolean13 = linkedList8.property_1();
        boolean boolean14 = linkedList8.composedRepOK();
        boolean boolean15 = linkedList0.remove((java.lang.Object) boolean14);
        boolean boolean16 = linkedList0.composedRepOK();
        system.testclass.LinkedList linkedList17 = new system.testclass.LinkedList();
        int int18 = linkedList17.size();
        linkedList17.clear();
        int int20 = linkedList17.size();
        java.lang.Object obj21 = new java.lang.Object();
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        boolean boolean23 = linkedList17.remove((java.lang.Object) wildcardClass22);
        linkedList17.clear();
        boolean boolean25 = linkedList0.remove((java.lang.Object) linkedList17);
        boolean boolean26 = linkedList0.composedRepOK();
        boolean boolean27 = linkedList0.composedRepOK();
        int int28 = linkedList0.size();
        system.testclass.LinkedList linkedList29 = new system.testclass.LinkedList();
        int int30 = linkedList29.size();
        linkedList29.clear();
        int int32 = linkedList29.size();
        boolean boolean33 = linkedList29.property_4();
        boolean boolean34 = linkedList29.property_4();
        boolean boolean35 = linkedList29.composedRepOK();
        boolean boolean36 = linkedList29.composedRepOK();
        boolean boolean37 = linkedList29.composedRepOK();
        boolean boolean38 = linkedList0.remove((java.lang.Object) linkedList29);
        system.testclass.LinkedList linkedList39 = new system.testclass.LinkedList();
        int int40 = linkedList39.size();
        linkedList39.clear();
        int int42 = linkedList39.size();
        int int43 = linkedList39.size();
        linkedList39.clear();
        boolean boolean45 = linkedList39.composedRepOK();
        int int46 = linkedList39.size();
        boolean boolean47 = linkedList29.remove((java.lang.Object) linkedList39);
        system.testclass.LinkedList linkedList48 = new system.testclass.LinkedList();
        linkedList48.clear();
        linkedList48.clear();
        boolean boolean51 = linkedList48.property_1();
        int int52 = linkedList48.size();
        boolean boolean53 = linkedList48.composedRepOK();
        boolean boolean54 = linkedList48.property_1();
        int int55 = linkedList48.size();
        boolean boolean56 = linkedList39.add((java.lang.Object) linkedList48);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList39", linkedList39.property_5());
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean3 = linkedList0.property_1();
        int int4 = linkedList0.size();
        boolean boolean5 = linkedList0.composedRepOK();
        boolean boolean6 = linkedList0.property_1();
        boolean boolean7 = linkedList0.property_1();
        int int8 = linkedList0.size();
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        linkedList9.clear();
        linkedList9.clear();
        boolean boolean12 = linkedList9.composedRepOK();
        int int13 = linkedList9.size();
        linkedList9.clear();
        boolean boolean16 = linkedList9.remove((java.lang.Object) (byte) 0);
        boolean boolean18 = linkedList9.remove((java.lang.Object) (-1.0f));
        system.testclass.LinkedList linkedList19 = new system.testclass.LinkedList();
        boolean boolean20 = linkedList19.property_4();
        system.testclass.LinkedList linkedList21 = new system.testclass.LinkedList();
        boolean boolean22 = linkedList19.remove((java.lang.Object) linkedList21);
        system.testclass.LinkedList linkedList23 = new system.testclass.LinkedList();
        boolean boolean24 = linkedList23.property_4();
        java.lang.Class<?> wildcardClass25 = linkedList23.getClass();
        boolean boolean26 = linkedList21.remove((java.lang.Object) wildcardClass25);
        boolean boolean27 = linkedList9.remove((java.lang.Object) wildcardClass25);
        boolean boolean28 = linkedList0.add((java.lang.Object) boolean27);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        boolean boolean2 = linkedList0.property_1();
        boolean boolean3 = linkedList0.property_4();
        int int4 = linkedList0.size();
        boolean boolean6 = linkedList0.remove((java.lang.Object) 0.0f);
        linkedList0.clear();
        boolean boolean8 = linkedList0.composedRepOK();
        boolean boolean9 = linkedList0.composedRepOK();
        boolean boolean10 = linkedList0.property_4();
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        boolean boolean12 = linkedList11.property_4();
        java.lang.Class<?> wildcardClass13 = linkedList11.getClass();
        boolean boolean14 = linkedList0.add((java.lang.Object) wildcardClass13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean3 = linkedList0.composedRepOK();
        int int4 = linkedList0.size();
        linkedList0.clear();
        boolean boolean7 = linkedList0.remove((java.lang.Object) (byte) 0);
        boolean boolean9 = linkedList0.remove((java.lang.Object) (-1.0f));
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        boolean boolean11 = linkedList10.property_4();
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        boolean boolean13 = linkedList10.remove((java.lang.Object) linkedList12);
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        boolean boolean15 = linkedList14.property_4();
        java.lang.Class<?> wildcardClass16 = linkedList14.getClass();
        boolean boolean17 = linkedList12.remove((java.lang.Object) wildcardClass16);
        boolean boolean18 = linkedList0.remove((java.lang.Object) wildcardClass16);
        linkedList0.clear();
        system.testclass.LinkedList linkedList20 = new system.testclass.LinkedList();
        linkedList20.clear();
        boolean boolean22 = linkedList20.property_1();
        boolean boolean23 = linkedList20.composedRepOK();
        boolean boolean24 = linkedList0.add((java.lang.Object) linkedList20);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean3 = linkedList0.composedRepOK();
        int int4 = linkedList0.size();
        linkedList0.clear();
        boolean boolean6 = linkedList0.property_1();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        boolean boolean8 = linkedList7.property_4();
        boolean boolean10 = linkedList7.remove((java.lang.Object) 0.0f);
        linkedList7.clear();
        int int12 = linkedList7.size();
        linkedList7.clear();
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        linkedList14.clear();
        linkedList14.clear();
        boolean boolean17 = linkedList14.property_4();
        linkedList14.clear();
        linkedList14.clear();
        boolean boolean20 = linkedList7.remove((java.lang.Object) linkedList14);
        linkedList14.clear();
        boolean boolean22 = linkedList0.remove((java.lang.Object) linkedList14);
        linkedList0.clear();
        system.testclass.LinkedList linkedList24 = new system.testclass.LinkedList();
        boolean boolean25 = linkedList24.property_4();
        boolean boolean27 = linkedList24.remove((java.lang.Object) 0.0f);
        linkedList24.clear();
        int int29 = linkedList24.size();
        linkedList24.clear();
        system.testclass.LinkedList linkedList31 = new system.testclass.LinkedList();
        linkedList31.clear();
        linkedList31.clear();
        boolean boolean34 = linkedList31.property_4();
        linkedList31.clear();
        linkedList31.clear();
        boolean boolean37 = linkedList24.remove((java.lang.Object) linkedList31);
        boolean boolean38 = linkedList0.add((java.lang.Object) linkedList31);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        boolean boolean2 = linkedList0.property_1();
        boolean boolean4 = linkedList0.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        boolean boolean6 = linkedList5.property_4();
        boolean boolean7 = linkedList0.remove((java.lang.Object) boolean6);
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        linkedList8.clear();
        linkedList8.clear();
        java.lang.Object obj11 = null;
        boolean boolean12 = linkedList8.remove(obj11);
        boolean boolean13 = linkedList8.property_1();
        boolean boolean14 = linkedList8.composedRepOK();
        boolean boolean15 = linkedList0.remove((java.lang.Object) boolean14);
        boolean boolean16 = linkedList0.composedRepOK();
        system.testclass.LinkedList linkedList17 = new system.testclass.LinkedList();
        int int18 = linkedList17.size();
        linkedList17.clear();
        int int20 = linkedList17.size();
        java.lang.Object obj21 = new java.lang.Object();
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        boolean boolean23 = linkedList17.remove((java.lang.Object) wildcardClass22);
        linkedList17.clear();
        boolean boolean25 = linkedList0.remove((java.lang.Object) linkedList17);
        boolean boolean26 = linkedList0.composedRepOK();
        boolean boolean27 = linkedList0.property_1();
        boolean boolean28 = linkedList0.composedRepOK();
        system.testclass.LinkedList linkedList29 = new system.testclass.LinkedList();
        int int30 = linkedList29.size();
        linkedList29.clear();
        int int32 = linkedList29.size();
        java.lang.Object obj33 = new java.lang.Object();
        java.lang.Class<?> wildcardClass34 = obj33.getClass();
        boolean boolean35 = linkedList29.remove((java.lang.Object) wildcardClass34);
        int int36 = linkedList29.size();
        boolean boolean37 = linkedList0.remove((java.lang.Object) linkedList29);
        boolean boolean39 = linkedList0.add((java.lang.Object) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        boolean boolean2 = linkedList0.property_1();
        boolean boolean3 = linkedList0.property_1();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        linkedList4.clear();
        linkedList4.clear();
        boolean boolean7 = linkedList4.property_4();
        boolean boolean8 = linkedList4.property_4();
        boolean boolean9 = linkedList4.property_1();
        linkedList4.clear();
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        linkedList11.clear();
        linkedList11.clear();
        boolean boolean14 = linkedList11.composedRepOK();
        int int15 = linkedList11.size();
        linkedList11.clear();
        boolean boolean18 = linkedList11.remove((java.lang.Object) (byte) 0);
        boolean boolean19 = linkedList11.property_4();
        system.testclass.LinkedList linkedList20 = new system.testclass.LinkedList();
        linkedList20.clear();
        linkedList20.clear();
        boolean boolean23 = linkedList20.composedRepOK();
        boolean boolean24 = linkedList11.remove((java.lang.Object) linkedList20);
        linkedList11.clear();
        boolean boolean26 = linkedList4.remove((java.lang.Object) linkedList11);
        linkedList4.clear();
        int int28 = linkedList4.size();
        linkedList4.clear();
        boolean boolean30 = linkedList0.add((java.lang.Object) linkedList4);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        boolean boolean2 = linkedList0.composedRepOK();
        system.testclass.LinkedList linkedList3 = new system.testclass.LinkedList();
        int int4 = linkedList3.size();
        boolean boolean5 = linkedList3.property_1();
        boolean boolean6 = linkedList3.property_4();
        int int7 = linkedList3.size();
        boolean boolean9 = linkedList3.remove((java.lang.Object) 0.0f);
        linkedList3.clear();
        int int11 = linkedList3.size();
        boolean boolean12 = linkedList0.add((java.lang.Object) linkedList3);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_4();
        system.testclass.LinkedList linkedList2 = new system.testclass.LinkedList();
        boolean boolean3 = linkedList0.remove((java.lang.Object) linkedList2);
        linkedList2.clear();
        int int5 = linkedList2.size();
        linkedList2.clear();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        int int8 = linkedList7.size();
        boolean boolean9 = linkedList7.property_1();
        boolean boolean10 = linkedList7.property_4();
        int int11 = linkedList7.size();
        boolean boolean13 = linkedList7.remove((java.lang.Object) 0.0f);
        linkedList7.clear();
        boolean boolean16 = linkedList7.remove((java.lang.Object) (byte) 1);
        boolean boolean17 = linkedList7.property_4();
        boolean boolean18 = linkedList7.property_4();
        boolean boolean19 = linkedList7.property_4();
        boolean boolean20 = linkedList2.add((java.lang.Object) linkedList7);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList2", linkedList2.property_5());
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean3 = linkedList0.composedRepOK();
        int int4 = linkedList0.size();
        linkedList0.clear();
        boolean boolean6 = linkedList0.property_4();
        boolean boolean7 = linkedList0.property_4();
        linkedList0.clear();
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        int int10 = linkedList9.size();
        linkedList9.clear();
        int int12 = linkedList9.size();
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        boolean boolean15 = linkedList9.remove((java.lang.Object) wildcardClass14);
        boolean boolean16 = linkedList0.add((java.lang.Object) linkedList9);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.property_4();
        boolean boolean5 = linkedList0.property_4();
        boolean boolean6 = linkedList0.composedRepOK();
        boolean boolean7 = linkedList0.composedRepOK();
        boolean boolean9 = linkedList0.add((java.lang.Object) (-1.0f));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        boolean boolean2 = linkedList0.property_1();
        boolean boolean4 = linkedList0.remove((java.lang.Object) (-1L));
        boolean boolean5 = linkedList0.property_4();
        boolean boolean6 = linkedList0.composedRepOK();
        boolean boolean8 = linkedList0.add((java.lang.Object) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean3 = linkedList0.composedRepOK();
        int int4 = linkedList0.size();
        linkedList0.clear();
        boolean boolean6 = linkedList0.property_4();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        int int8 = linkedList7.size();
        boolean boolean9 = linkedList7.property_1();
        boolean boolean10 = linkedList7.property_4();
        int int11 = linkedList7.size();
        linkedList7.clear();
        linkedList7.clear();
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        int int15 = linkedList14.size();
        boolean boolean16 = linkedList14.property_1();
        boolean boolean18 = linkedList14.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList19 = new system.testclass.LinkedList();
        boolean boolean20 = linkedList19.property_4();
        boolean boolean21 = linkedList14.remove((java.lang.Object) boolean20);
        system.testclass.LinkedList linkedList22 = new system.testclass.LinkedList();
        linkedList22.clear();
        linkedList22.clear();
        java.lang.Object obj25 = null;
        boolean boolean26 = linkedList22.remove(obj25);
        boolean boolean27 = linkedList22.property_1();
        boolean boolean28 = linkedList22.composedRepOK();
        boolean boolean29 = linkedList14.remove((java.lang.Object) boolean28);
        int int30 = linkedList14.size();
        boolean boolean31 = linkedList7.remove((java.lang.Object) linkedList14);
        boolean boolean32 = linkedList0.remove((java.lang.Object) linkedList7);
        boolean boolean33 = linkedList7.property_4();
        system.testclass.LinkedList linkedList34 = new system.testclass.LinkedList();
        linkedList34.clear();
        linkedList34.clear();
        boolean boolean37 = linkedList34.composedRepOK();
        int int38 = linkedList34.size();
        linkedList34.clear();
        boolean boolean41 = linkedList34.remove((java.lang.Object) (byte) 0);
        boolean boolean42 = linkedList34.property_4();
        system.testclass.LinkedList linkedList43 = new system.testclass.LinkedList();
        linkedList43.clear();
        linkedList43.clear();
        boolean boolean46 = linkedList43.composedRepOK();
        boolean boolean47 = linkedList34.remove((java.lang.Object) linkedList43);
        linkedList34.clear();
        boolean boolean49 = linkedList34.property_4();
        int int50 = linkedList34.size();
        boolean boolean51 = linkedList34.composedRepOK();
        boolean boolean52 = linkedList7.add((java.lang.Object) linkedList34);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList7", linkedList7.property_5());
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        boolean boolean2 = linkedList0.property_1();
        boolean boolean3 = linkedList0.property_4();
        int int4 = linkedList0.size();
        linkedList0.clear();
        linkedList0.clear();
        int int7 = linkedList0.size();
        boolean boolean8 = linkedList0.property_4();
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        int int10 = linkedList9.size();
        boolean boolean11 = linkedList9.property_1();
        boolean boolean13 = linkedList9.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        boolean boolean15 = linkedList14.property_4();
        boolean boolean16 = linkedList9.remove((java.lang.Object) boolean15);
        system.testclass.LinkedList linkedList17 = new system.testclass.LinkedList();
        linkedList17.clear();
        linkedList17.clear();
        java.lang.Object obj20 = null;
        boolean boolean21 = linkedList17.remove(obj20);
        boolean boolean22 = linkedList17.property_1();
        boolean boolean23 = linkedList17.composedRepOK();
        boolean boolean24 = linkedList9.remove((java.lang.Object) boolean23);
        boolean boolean25 = linkedList9.composedRepOK();
        system.testclass.LinkedList linkedList26 = new system.testclass.LinkedList();
        int int27 = linkedList26.size();
        linkedList26.clear();
        int int29 = linkedList26.size();
        java.lang.Object obj30 = new java.lang.Object();
        java.lang.Class<?> wildcardClass31 = obj30.getClass();
        boolean boolean32 = linkedList26.remove((java.lang.Object) wildcardClass31);
        linkedList26.clear();
        boolean boolean34 = linkedList9.remove((java.lang.Object) linkedList26);
        boolean boolean35 = linkedList0.remove((java.lang.Object) linkedList9);
        boolean boolean37 = linkedList9.remove((java.lang.Object) (-1.0d));
        system.testclass.LinkedList linkedList38 = new system.testclass.LinkedList();
        int int39 = linkedList38.size();
        boolean boolean40 = linkedList38.property_1();
        boolean boolean41 = linkedList38.property_4();
        int int42 = linkedList38.size();
        boolean boolean44 = linkedList38.remove((java.lang.Object) 0.0f);
        linkedList38.clear();
        boolean boolean47 = linkedList38.remove((java.lang.Object) (byte) 1);
        int int48 = linkedList38.size();
        boolean boolean49 = linkedList9.add((java.lang.Object) int48);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList9", linkedList9.property_5());
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        java.lang.Object obj3 = null;
        boolean boolean4 = linkedList0.remove(obj3);
        boolean boolean5 = linkedList0.property_1();
        int int6 = linkedList0.size();
        boolean boolean7 = linkedList0.property_1();
        boolean boolean8 = linkedList0.property_1();
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        int int10 = linkedList9.size();
        boolean boolean11 = linkedList9.property_1();
        boolean boolean12 = linkedList9.property_4();
        boolean boolean13 = linkedList9.composedRepOK();
        boolean boolean15 = linkedList9.remove((java.lang.Object) 0L);
        boolean boolean16 = linkedList9.property_1();
        linkedList9.clear();
        system.testclass.LinkedList linkedList18 = new system.testclass.LinkedList();
        linkedList18.clear();
        linkedList18.clear();
        boolean boolean21 = linkedList18.composedRepOK();
        int int22 = linkedList18.size();
        linkedList18.clear();
        boolean boolean24 = linkedList18.property_4();
        system.testclass.LinkedList linkedList25 = new system.testclass.LinkedList();
        int int26 = linkedList25.size();
        boolean boolean27 = linkedList25.property_1();
        boolean boolean29 = linkedList25.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList30 = new system.testclass.LinkedList();
        boolean boolean31 = linkedList30.property_4();
        boolean boolean32 = linkedList25.remove((java.lang.Object) boolean31);
        linkedList25.clear();
        java.lang.Class<?> wildcardClass34 = linkedList25.getClass();
        boolean boolean35 = linkedList18.remove((java.lang.Object) linkedList25);
        boolean boolean37 = linkedList18.remove((java.lang.Object) false);
        boolean boolean38 = linkedList18.composedRepOK();
        boolean boolean39 = linkedList9.remove((java.lang.Object) linkedList18);
        boolean boolean40 = linkedList0.add((java.lang.Object) linkedList9);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        boolean boolean2 = linkedList0.property_1();
        boolean boolean4 = linkedList0.remove((java.lang.Object) (-1L));
        boolean boolean5 = linkedList0.property_4();
        boolean boolean6 = linkedList0.composedRepOK();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        int int8 = linkedList7.size();
        boolean boolean9 = linkedList7.property_1();
        boolean boolean10 = linkedList7.property_4();
        boolean boolean11 = linkedList7.composedRepOK();
        boolean boolean13 = linkedList7.remove((java.lang.Object) 0L);
        boolean boolean14 = linkedList7.property_1();
        boolean boolean15 = linkedList7.property_4();
        boolean boolean16 = linkedList0.add((java.lang.Object) boolean15);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        boolean boolean2 = linkedList0.property_1();
        boolean boolean3 = linkedList0.property_4();
        int int4 = linkedList0.size();
        boolean boolean6 = linkedList0.remove((java.lang.Object) 0.0f);
        linkedList0.clear();
        linkedList0.clear();
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        linkedList9.clear();
        linkedList9.clear();
        boolean boolean12 = linkedList9.composedRepOK();
        int int13 = linkedList9.size();
        linkedList9.clear();
        boolean boolean16 = linkedList9.remove((java.lang.Object) (byte) 0);
        boolean boolean18 = linkedList9.remove((java.lang.Object) (-1.0f));
        system.testclass.LinkedList linkedList19 = new system.testclass.LinkedList();
        boolean boolean20 = linkedList19.property_4();
        system.testclass.LinkedList linkedList21 = new system.testclass.LinkedList();
        boolean boolean22 = linkedList19.remove((java.lang.Object) linkedList21);
        system.testclass.LinkedList linkedList23 = new system.testclass.LinkedList();
        boolean boolean24 = linkedList23.property_4();
        java.lang.Class<?> wildcardClass25 = linkedList23.getClass();
        boolean boolean26 = linkedList21.remove((java.lang.Object) wildcardClass25);
        boolean boolean27 = linkedList9.remove((java.lang.Object) wildcardClass25);
        system.testclass.LinkedList linkedList28 = new system.testclass.LinkedList();
        boolean boolean29 = linkedList28.property_4();
        boolean boolean31 = linkedList28.remove((java.lang.Object) 0.0f);
        linkedList28.clear();
        boolean boolean33 = linkedList28.property_4();
        boolean boolean34 = linkedList9.remove((java.lang.Object) boolean33);
        system.testclass.LinkedList linkedList35 = new system.testclass.LinkedList();
        int int36 = linkedList35.size();
        boolean boolean37 = linkedList35.property_1();
        boolean boolean38 = linkedList35.property_4();
        boolean boolean39 = linkedList35.composedRepOK();
        boolean boolean41 = linkedList35.remove((java.lang.Object) 0L);
        boolean boolean42 = linkedList35.property_1();
        linkedList35.clear();
        boolean boolean44 = linkedList35.property_4();
        boolean boolean45 = linkedList9.remove((java.lang.Object) linkedList35);
        system.testclass.LinkedList linkedList46 = new system.testclass.LinkedList();
        int int47 = linkedList46.size();
        boolean boolean48 = linkedList46.property_1();
        boolean boolean50 = linkedList46.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList51 = new system.testclass.LinkedList();
        boolean boolean52 = linkedList51.property_4();
        boolean boolean53 = linkedList46.remove((java.lang.Object) boolean52);
        system.testclass.LinkedList linkedList54 = new system.testclass.LinkedList();
        linkedList54.clear();
        linkedList54.clear();
        java.lang.Object obj57 = null;
        boolean boolean58 = linkedList54.remove(obj57);
        boolean boolean59 = linkedList54.property_1();
        boolean boolean60 = linkedList54.composedRepOK();
        boolean boolean61 = linkedList46.remove((java.lang.Object) boolean60);
        boolean boolean62 = linkedList46.composedRepOK();
        system.testclass.LinkedList linkedList63 = new system.testclass.LinkedList();
        int int64 = linkedList63.size();
        linkedList63.clear();
        int int66 = linkedList63.size();
        java.lang.Object obj67 = new java.lang.Object();
        java.lang.Class<?> wildcardClass68 = obj67.getClass();
        boolean boolean69 = linkedList63.remove((java.lang.Object) wildcardClass68);
        linkedList63.clear();
        boolean boolean71 = linkedList46.remove((java.lang.Object) linkedList63);
        boolean boolean72 = linkedList46.composedRepOK();
        boolean boolean73 = linkedList46.property_1();
        boolean boolean74 = linkedList46.composedRepOK();
        system.testclass.LinkedList linkedList75 = new system.testclass.LinkedList();
        int int76 = linkedList75.size();
        linkedList75.clear();
        int int78 = linkedList75.size();
        java.lang.Object obj79 = new java.lang.Object();
        java.lang.Class<?> wildcardClass80 = obj79.getClass();
        boolean boolean81 = linkedList75.remove((java.lang.Object) wildcardClass80);
        int int82 = linkedList75.size();
        boolean boolean83 = linkedList46.remove((java.lang.Object) linkedList75);
        boolean boolean84 = linkedList35.remove((java.lang.Object) linkedList75);
        boolean boolean85 = linkedList75.composedRepOK();
        java.lang.Class<?> wildcardClass86 = linkedList75.getClass();
        boolean boolean87 = linkedList0.add((java.lang.Object) linkedList75);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_4();
        boolean boolean3 = linkedList0.remove((java.lang.Object) 0.0f);
        linkedList0.clear();
        int int5 = linkedList0.size();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        boolean boolean7 = linkedList6.property_4();
        boolean boolean9 = linkedList6.remove((java.lang.Object) 0.0f);
        linkedList6.clear();
        int int11 = linkedList6.size();
        linkedList6.clear();
        system.testclass.LinkedList linkedList13 = new system.testclass.LinkedList();
        linkedList13.clear();
        linkedList13.clear();
        boolean boolean16 = linkedList13.property_4();
        linkedList13.clear();
        linkedList13.clear();
        boolean boolean19 = linkedList6.remove((java.lang.Object) linkedList13);
        boolean boolean20 = linkedList13.composedRepOK();
        boolean boolean21 = linkedList0.add((java.lang.Object) boolean20);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        int int4 = linkedList0.size();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        boolean boolean6 = linkedList5.property_4();
        boolean boolean8 = linkedList5.remove((java.lang.Object) 0.0f);
        linkedList5.clear();
        int int10 = linkedList5.size();
        linkedList5.clear();
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        linkedList12.clear();
        linkedList12.clear();
        boolean boolean15 = linkedList12.property_4();
        linkedList12.clear();
        linkedList12.clear();
        boolean boolean18 = linkedList5.remove((java.lang.Object) linkedList12);
        boolean boolean19 = linkedList0.add((java.lang.Object) linkedList5);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        boolean boolean2 = linkedList0.property_1();
        boolean boolean3 = linkedList0.property_4();
        boolean boolean4 = linkedList0.composedRepOK();
        boolean boolean6 = linkedList0.remove((java.lang.Object) 0L);
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean9 = linkedList0.composedRepOK();
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        int int11 = linkedList10.size();
        boolean boolean12 = linkedList10.property_1();
        boolean boolean13 = linkedList10.property_4();
        int int14 = linkedList10.size();
        int int15 = linkedList10.size();
        boolean boolean16 = linkedList10.composedRepOK();
        boolean boolean17 = linkedList0.add((java.lang.Object) boolean16);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_4();
        system.testclass.LinkedList linkedList2 = new system.testclass.LinkedList();
        boolean boolean3 = linkedList0.remove((java.lang.Object) linkedList2);
        linkedList2.clear();
        int int5 = linkedList2.size();
        int int6 = linkedList2.size();
        linkedList2.clear();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        int int9 = linkedList8.size();
        boolean boolean10 = linkedList8.property_1();
        boolean boolean11 = linkedList8.property_4();
        int int12 = linkedList8.size();
        int int13 = linkedList8.size();
        boolean boolean14 = linkedList8.property_4();
        linkedList8.clear();
        boolean boolean16 = linkedList8.property_4();
        boolean boolean17 = linkedList2.add((java.lang.Object) linkedList8);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList2", linkedList2.property_5());
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        boolean boolean2 = linkedList0.property_1();
        boolean boolean3 = linkedList0.property_4();
        int int4 = linkedList0.size();
        linkedList0.clear();
        linkedList0.clear();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        int int8 = linkedList7.size();
        boolean boolean9 = linkedList7.property_1();
        boolean boolean11 = linkedList7.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        boolean boolean13 = linkedList12.property_4();
        boolean boolean14 = linkedList7.remove((java.lang.Object) boolean13);
        system.testclass.LinkedList linkedList15 = new system.testclass.LinkedList();
        linkedList15.clear();
        linkedList15.clear();
        java.lang.Object obj18 = null;
        boolean boolean19 = linkedList15.remove(obj18);
        boolean boolean20 = linkedList15.property_1();
        boolean boolean21 = linkedList15.composedRepOK();
        boolean boolean22 = linkedList7.remove((java.lang.Object) boolean21);
        int int23 = linkedList7.size();
        boolean boolean24 = linkedList0.remove((java.lang.Object) linkedList7);
        int int25 = linkedList0.size();
        int int26 = linkedList0.size();
        system.testclass.LinkedList linkedList27 = new system.testclass.LinkedList();
        int int28 = linkedList27.size();
        boolean boolean29 = linkedList27.property_1();
        boolean boolean30 = linkedList27.property_4();
        int int31 = linkedList27.size();
        int int32 = linkedList27.size();
        boolean boolean33 = linkedList27.property_4();
        boolean boolean34 = linkedList27.composedRepOK();
        system.testclass.LinkedList linkedList35 = new system.testclass.LinkedList();
        boolean boolean36 = linkedList35.property_4();
        boolean boolean38 = linkedList35.remove((java.lang.Object) 0.0f);
        linkedList35.clear();
        boolean boolean40 = linkedList35.composedRepOK();
        system.testclass.LinkedList linkedList41 = new system.testclass.LinkedList();
        int int42 = linkedList41.size();
        linkedList41.clear();
        int int44 = linkedList41.size();
        java.lang.Object obj45 = new java.lang.Object();
        java.lang.Class<?> wildcardClass46 = obj45.getClass();
        boolean boolean47 = linkedList41.remove((java.lang.Object) wildcardClass46);
        linkedList41.clear();
        boolean boolean49 = linkedList41.composedRepOK();
        boolean boolean50 = linkedList35.remove((java.lang.Object) linkedList41);
        boolean boolean51 = linkedList27.remove((java.lang.Object) boolean50);
        boolean boolean52 = linkedList0.remove((java.lang.Object) boolean51);
        boolean boolean53 = linkedList0.property_1();
        system.testclass.LinkedList linkedList54 = new system.testclass.LinkedList();
        int int55 = linkedList54.size();
        boolean boolean56 = linkedList54.property_1();
        boolean boolean58 = linkedList54.remove((java.lang.Object) (-1L));
        boolean boolean59 = linkedList0.add((java.lang.Object) boolean58);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        int int4 = linkedList0.size();
        boolean boolean5 = linkedList0.composedRepOK();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        linkedList6.clear();
        linkedList6.clear();
        boolean boolean9 = linkedList6.property_4();
        boolean boolean10 = linkedList6.property_4();
        int int11 = linkedList6.size();
        boolean boolean12 = linkedList0.add((java.lang.Object) linkedList6);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_4();
        boolean boolean3 = linkedList0.remove((java.lang.Object) 0.0f);
        boolean boolean4 = linkedList0.property_4();
        int int5 = linkedList0.size();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        int int7 = linkedList6.size();
        boolean boolean8 = linkedList6.property_1();
        boolean boolean10 = linkedList6.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        boolean boolean12 = linkedList11.property_4();
        boolean boolean13 = linkedList6.remove((java.lang.Object) boolean12);
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        linkedList14.clear();
        linkedList14.clear();
        java.lang.Object obj17 = null;
        boolean boolean18 = linkedList14.remove(obj17);
        boolean boolean19 = linkedList14.property_1();
        boolean boolean20 = linkedList14.composedRepOK();
        boolean boolean21 = linkedList6.remove((java.lang.Object) boolean20);
        boolean boolean22 = linkedList6.property_1();
        boolean boolean23 = linkedList6.composedRepOK();
        boolean boolean24 = linkedList6.property_4();
        boolean boolean25 = linkedList0.add((java.lang.Object) boolean24);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        boolean boolean2 = linkedList0.property_1();
        boolean boolean3 = linkedList0.property_4();
        int int4 = linkedList0.size();
        int int5 = linkedList0.size();
        boolean boolean6 = linkedList0.composedRepOK();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        linkedList7.clear();
        linkedList7.clear();
        boolean boolean10 = linkedList7.composedRepOK();
        int int11 = linkedList7.size();
        linkedList7.clear();
        boolean boolean13 = linkedList7.property_4();
        boolean boolean14 = linkedList0.remove((java.lang.Object) boolean13);
        system.testclass.LinkedList linkedList15 = new system.testclass.LinkedList();
        boolean boolean16 = linkedList15.property_4();
        boolean boolean18 = linkedList15.remove((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass19 = linkedList15.getClass();
        boolean boolean20 = linkedList0.add((java.lang.Object) wildcardClass19);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_4();
        boolean boolean3 = linkedList0.remove((java.lang.Object) 0.0f);
        linkedList0.clear();
        boolean boolean5 = linkedList0.composedRepOK();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        int int7 = linkedList6.size();
        linkedList6.clear();
        int int9 = linkedList6.size();
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        boolean boolean12 = linkedList6.remove((java.lang.Object) wildcardClass11);
        linkedList6.clear();
        boolean boolean14 = linkedList6.composedRepOK();
        boolean boolean15 = linkedList0.remove((java.lang.Object) linkedList6);
        linkedList6.clear();
        system.testclass.LinkedList linkedList17 = new system.testclass.LinkedList();
        int int18 = linkedList17.size();
        boolean boolean19 = linkedList17.property_1();
        boolean boolean21 = linkedList17.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList22 = new system.testclass.LinkedList();
        boolean boolean23 = linkedList22.property_4();
        boolean boolean24 = linkedList17.remove((java.lang.Object) boolean23);
        linkedList17.clear();
        system.testclass.LinkedList linkedList26 = new system.testclass.LinkedList();
        linkedList26.clear();
        linkedList26.clear();
        boolean boolean29 = linkedList26.composedRepOK();
        boolean boolean30 = linkedList26.composedRepOK();
        boolean boolean31 = linkedList26.property_1();
        boolean boolean32 = linkedList17.remove((java.lang.Object) linkedList26);
        boolean boolean33 = linkedList17.composedRepOK();
        boolean boolean34 = linkedList17.property_4();
        system.testclass.LinkedList linkedList35 = new system.testclass.LinkedList();
        linkedList35.clear();
        linkedList35.clear();
        boolean boolean38 = linkedList35.composedRepOK();
        int int39 = linkedList35.size();
        linkedList35.clear();
        boolean boolean41 = linkedList35.property_4();
        boolean boolean42 = linkedList35.property_4();
        boolean boolean43 = linkedList35.composedRepOK();
        system.testclass.LinkedList linkedList44 = new system.testclass.LinkedList();
        linkedList44.clear();
        linkedList44.clear();
        boolean boolean47 = linkedList44.property_4();
        java.lang.Class<?> wildcardClass48 = linkedList44.getClass();
        boolean boolean49 = linkedList35.remove((java.lang.Object) wildcardClass48);
        boolean boolean50 = linkedList17.remove((java.lang.Object) linkedList35);
        int int51 = linkedList17.size();
        java.lang.Class<?> wildcardClass52 = linkedList17.getClass();
        boolean boolean53 = linkedList6.add((java.lang.Object) wildcardClass52);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList6", linkedList6.property_5());
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_4();
        system.testclass.LinkedList linkedList2 = new system.testclass.LinkedList();
        boolean boolean3 = linkedList0.remove((java.lang.Object) linkedList2);
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        boolean boolean5 = linkedList4.property_4();
        java.lang.Class<?> wildcardClass6 = linkedList4.getClass();
        boolean boolean7 = linkedList2.remove((java.lang.Object) wildcardClass6);
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        int int9 = linkedList8.size();
        boolean boolean10 = linkedList8.property_1();
        boolean boolean12 = linkedList8.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList13 = new system.testclass.LinkedList();
        boolean boolean14 = linkedList13.property_4();
        boolean boolean15 = linkedList8.remove((java.lang.Object) boolean14);
        system.testclass.LinkedList linkedList16 = new system.testclass.LinkedList();
        linkedList16.clear();
        linkedList16.clear();
        java.lang.Object obj19 = null;
        boolean boolean20 = linkedList16.remove(obj19);
        boolean boolean21 = linkedList16.property_1();
        boolean boolean22 = linkedList16.composedRepOK();
        boolean boolean23 = linkedList8.remove((java.lang.Object) boolean22);
        boolean boolean24 = linkedList8.property_1();
        boolean boolean25 = linkedList8.property_1();
        boolean boolean26 = linkedList2.remove((java.lang.Object) boolean25);
        boolean boolean27 = linkedList2.composedRepOK();
        boolean boolean28 = linkedList2.composedRepOK();
        boolean boolean29 = linkedList2.property_4();
        system.testclass.LinkedList linkedList30 = new system.testclass.LinkedList();
        linkedList30.clear();
        boolean boolean32 = linkedList30.property_4();
        boolean boolean33 = linkedList30.property_4();
        system.testclass.LinkedList linkedList34 = new system.testclass.LinkedList();
        int int35 = linkedList34.size();
        boolean boolean36 = linkedList34.property_1();
        boolean boolean37 = linkedList34.property_4();
        int int38 = linkedList34.size();
        linkedList34.clear();
        linkedList34.clear();
        system.testclass.LinkedList linkedList41 = new system.testclass.LinkedList();
        int int42 = linkedList41.size();
        boolean boolean43 = linkedList41.property_1();
        boolean boolean45 = linkedList41.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList46 = new system.testclass.LinkedList();
        boolean boolean47 = linkedList46.property_4();
        boolean boolean48 = linkedList41.remove((java.lang.Object) boolean47);
        system.testclass.LinkedList linkedList49 = new system.testclass.LinkedList();
        linkedList49.clear();
        linkedList49.clear();
        java.lang.Object obj52 = null;
        boolean boolean53 = linkedList49.remove(obj52);
        boolean boolean54 = linkedList49.property_1();
        boolean boolean55 = linkedList49.composedRepOK();
        boolean boolean56 = linkedList41.remove((java.lang.Object) boolean55);
        int int57 = linkedList41.size();
        boolean boolean58 = linkedList34.remove((java.lang.Object) linkedList41);
        boolean boolean59 = linkedList30.remove((java.lang.Object) linkedList34);
        int int60 = linkedList30.size();
        boolean boolean61 = linkedList30.composedRepOK();
        boolean boolean62 = linkedList30.property_4();
        boolean boolean63 = linkedList2.remove((java.lang.Object) linkedList30);
        boolean boolean65 = linkedList2.add((java.lang.Object) 100L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList2", linkedList2.property_5());
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        boolean boolean2 = linkedList0.property_1();
        boolean boolean4 = linkedList0.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        boolean boolean6 = linkedList5.property_4();
        boolean boolean7 = linkedList0.remove((java.lang.Object) boolean6);
        linkedList0.clear();
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        linkedList9.clear();
        linkedList9.clear();
        boolean boolean12 = linkedList9.composedRepOK();
        boolean boolean13 = linkedList9.composedRepOK();
        boolean boolean14 = linkedList9.property_1();
        boolean boolean15 = linkedList0.remove((java.lang.Object) linkedList9);
        boolean boolean16 = linkedList0.composedRepOK();
        java.lang.Object obj17 = null;
        boolean boolean18 = linkedList0.add(obj17);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for linkedList0", linkedList0.property_5());
    }
}

