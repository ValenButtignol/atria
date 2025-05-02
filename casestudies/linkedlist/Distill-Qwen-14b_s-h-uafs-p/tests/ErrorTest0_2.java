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
        boolean boolean1 = linkedList0.property_1();
        boolean boolean3 = linkedList0.add((java.lang.Object) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean2 = linkedList0.add((java.lang.Object) 1L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_1();
        int int2 = linkedList0.size();
        java.lang.Object obj3 = null;
        boolean boolean4 = linkedList0.remove(obj3);
        boolean boolean5 = linkedList0.composedRepOK();
        boolean boolean7 = linkedList0.add((java.lang.Object) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean2 = linkedList0.add((java.lang.Object) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_1();
        boolean boolean3 = linkedList0.remove((java.lang.Object) true);
        boolean boolean5 = linkedList0.remove((java.lang.Object) 10.0d);
        int int6 = linkedList0.size();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        boolean boolean8 = linkedList7.property_1();
        int int9 = linkedList7.size();
        java.lang.Object obj10 = null;
        boolean boolean11 = linkedList7.remove(obj10);
        boolean boolean12 = linkedList0.add((java.lang.Object) linkedList7);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_1();
        boolean boolean3 = linkedList0.remove((java.lang.Object) true);
        boolean boolean5 = linkedList0.remove((java.lang.Object) 10.0d);
        boolean boolean7 = linkedList0.add((java.lang.Object) "hi!");
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        int int2 = linkedList0.size();
        boolean boolean3 = linkedList0.property_1();
        int int4 = linkedList0.size();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        boolean boolean6 = linkedList5.property_1();
        int int7 = linkedList5.size();
        java.lang.Object obj8 = null;
        boolean boolean9 = linkedList5.remove(obj8);
        boolean boolean10 = linkedList5.property_1();
        boolean boolean11 = linkedList0.add((java.lang.Object) linkedList5);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.property_1();
        boolean boolean4 = linkedList0.add((java.lang.Object) 1L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.property_1();
        linkedList0.clear();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        int int5 = linkedList4.size();
        boolean boolean6 = linkedList4.composedRepOK();
        boolean boolean7 = linkedList0.add((java.lang.Object) boolean6);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.composedRepOK();
        boolean boolean3 = linkedList0.composedRepOK();
        linkedList0.clear();
        boolean boolean6 = linkedList0.add((java.lang.Object) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        int int2 = linkedList0.size();
        boolean boolean3 = linkedList0.property_1();
        int int4 = linkedList0.size();
        linkedList0.clear();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        boolean boolean7 = linkedList6.composedRepOK();
        boolean boolean8 = linkedList6.property_1();
        boolean boolean9 = linkedList6.property_1();
        linkedList6.clear();
        boolean boolean11 = linkedList6.property_1();
        boolean boolean12 = linkedList0.remove((java.lang.Object) linkedList6);
        system.testclass.LinkedList linkedList13 = new system.testclass.LinkedList();
        boolean boolean14 = linkedList13.composedRepOK();
        boolean boolean15 = linkedList13.property_1();
        boolean boolean16 = linkedList13.property_1();
        linkedList13.clear();
        linkedList13.clear();
        boolean boolean19 = linkedList6.add((java.lang.Object) linkedList13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList6", linkedList6.property_2());
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.property_1();
        boolean boolean3 = linkedList0.property_1();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        int int5 = linkedList4.size();
        int int6 = linkedList4.size();
        boolean boolean7 = linkedList4.property_1();
        int int8 = linkedList4.size();
        linkedList4.clear();
        boolean boolean10 = linkedList0.add((java.lang.Object) linkedList4);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        boolean boolean3 = linkedList0.add((java.lang.Object) (-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.property_1();
        system.testclass.LinkedList linkedList3 = new system.testclass.LinkedList();
        boolean boolean4 = linkedList3.property_1();
        boolean boolean6 = linkedList3.remove((java.lang.Object) true);
        boolean boolean8 = linkedList3.remove((java.lang.Object) 10.0d);
        int int9 = linkedList3.size();
        boolean boolean10 = linkedList3.property_1();
        linkedList3.clear();
        boolean boolean12 = linkedList0.add((java.lang.Object) linkedList3);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_1();
        boolean boolean3 = linkedList0.remove((java.lang.Object) true);
        boolean boolean5 = linkedList0.remove((java.lang.Object) 10.0d);
        int int6 = linkedList0.size();
        boolean boolean7 = linkedList0.property_1();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        boolean boolean9 = linkedList8.composedRepOK();
        boolean boolean11 = linkedList8.remove((java.lang.Object) 1.0d);
        java.lang.Class<?> wildcardClass12 = linkedList8.getClass();
        boolean boolean13 = linkedList0.add((java.lang.Object) wildcardClass12);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_1();
        int int2 = linkedList0.size();
        java.lang.Object obj3 = null;
        boolean boolean4 = linkedList0.remove(obj3);
        boolean boolean6 = linkedList0.remove((java.lang.Object) 1.0f);
        linkedList0.clear();
        boolean boolean9 = linkedList0.add((java.lang.Object) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        int int2 = linkedList0.size();
        system.testclass.LinkedList linkedList3 = new system.testclass.LinkedList();
        boolean boolean4 = linkedList3.property_1();
        int int5 = linkedList3.size();
        int int6 = linkedList3.size();
        boolean boolean7 = linkedList3.composedRepOK();
        boolean boolean8 = linkedList0.add((java.lang.Object) linkedList3);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.composedRepOK();
        boolean boolean3 = linkedList0.composedRepOK();
        boolean boolean5 = linkedList0.remove((java.lang.Object) (byte) 1);
        int int6 = linkedList0.size();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        linkedList7.clear();
        java.lang.Class<?> wildcardClass9 = linkedList7.getClass();
        boolean boolean10 = linkedList0.add((java.lang.Object) wildcardClass9);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList1 = new system.testclass.LinkedList();
        boolean boolean2 = linkedList1.composedRepOK();
        boolean boolean3 = linkedList1.composedRepOK();
        boolean boolean4 = linkedList1.composedRepOK();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        int int6 = linkedList5.size();
        int int7 = linkedList5.size();
        boolean boolean8 = linkedList5.property_1();
        boolean boolean9 = linkedList1.remove((java.lang.Object) linkedList5);
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        boolean boolean11 = linkedList10.property_1();
        int int12 = linkedList10.size();
        int int13 = linkedList10.size();
        boolean boolean15 = linkedList10.remove((java.lang.Object) (byte) 0);
        boolean boolean16 = linkedList5.remove((java.lang.Object) (byte) 0);
        boolean boolean17 = linkedList0.add((java.lang.Object) linkedList5);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_1();
        boolean boolean3 = linkedList0.remove((java.lang.Object) true);
        boolean boolean5 = linkedList0.remove((java.lang.Object) 10.0d);
        int int6 = linkedList0.size();
        boolean boolean7 = linkedList0.property_1();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean10 = linkedList0.property_1();
        boolean boolean12 = linkedList0.add((java.lang.Object) (-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        system.testclass.LinkedList linkedList2 = new system.testclass.LinkedList();
        boolean boolean3 = linkedList2.composedRepOK();
        boolean boolean4 = linkedList2.property_1();
        boolean boolean5 = linkedList2.property_1();
        boolean boolean6 = linkedList2.composedRepOK();
        int int7 = linkedList2.size();
        boolean boolean8 = linkedList0.add((java.lang.Object) linkedList2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.composedRepOK();
        linkedList0.clear();
        boolean boolean4 = linkedList0.property_1();
        java.lang.Object obj5 = null;
        boolean boolean6 = linkedList0.add(obj5);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_1();
        int int2 = linkedList0.size();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.composedRepOK();
        boolean boolean5 = linkedList0.composedRepOK();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        boolean boolean7 = linkedList6.property_1();
        int int8 = linkedList6.size();
        int int9 = linkedList6.size();
        boolean boolean10 = linkedList0.add((java.lang.Object) int9);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        int int2 = linkedList0.size();
        boolean boolean3 = linkedList0.property_1();
        int int4 = linkedList0.size();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        boolean boolean6 = linkedList5.property_1();
        int int7 = linkedList5.size();
        int int8 = linkedList5.size();
        boolean boolean10 = linkedList5.remove((java.lang.Object) (byte) 0);
        linkedList5.clear();
        boolean boolean12 = linkedList0.remove((java.lang.Object) linkedList5);
        system.testclass.LinkedList linkedList13 = new system.testclass.LinkedList();
        boolean boolean14 = linkedList13.composedRepOK();
        boolean boolean15 = linkedList13.property_1();
        boolean boolean16 = linkedList13.property_1();
        boolean boolean17 = linkedList13.composedRepOK();
        boolean boolean18 = linkedList13.composedRepOK();
        boolean boolean19 = linkedList0.add((java.lang.Object) linkedList13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_1();
        int int2 = linkedList0.size();
        java.lang.Object obj3 = null;
        boolean boolean4 = linkedList0.remove(obj3);
        boolean boolean5 = linkedList0.composedRepOK();
        boolean boolean6 = linkedList0.property_1();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        boolean boolean8 = linkedList7.composedRepOK();
        boolean boolean9 = linkedList7.property_1();
        java.lang.Class<?> wildcardClass10 = linkedList7.getClass();
        boolean boolean11 = linkedList0.add((java.lang.Object) wildcardClass10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.composedRepOK();
        boolean boolean3 = linkedList0.composedRepOK();
        boolean boolean5 = linkedList0.remove((java.lang.Object) (byte) 1);
        boolean boolean6 = linkedList0.property_1();
        int int7 = linkedList0.size();
        boolean boolean9 = linkedList0.add((java.lang.Object) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        int int2 = linkedList0.size();
        boolean boolean3 = linkedList0.property_1();
        int int4 = linkedList0.size();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        boolean boolean6 = linkedList5.property_1();
        int int7 = linkedList5.size();
        int int8 = linkedList5.size();
        boolean boolean10 = linkedList5.remove((java.lang.Object) (byte) 0);
        linkedList5.clear();
        boolean boolean12 = linkedList0.remove((java.lang.Object) linkedList5);
        linkedList5.clear();
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        boolean boolean15 = linkedList14.composedRepOK();
        boolean boolean16 = linkedList14.composedRepOK();
        boolean boolean17 = linkedList14.composedRepOK();
        system.testclass.LinkedList linkedList18 = new system.testclass.LinkedList();
        int int19 = linkedList18.size();
        int int20 = linkedList18.size();
        boolean boolean21 = linkedList18.property_1();
        boolean boolean22 = linkedList14.remove((java.lang.Object) linkedList18);
        system.testclass.LinkedList linkedList23 = new system.testclass.LinkedList();
        boolean boolean24 = linkedList23.composedRepOK();
        boolean boolean25 = linkedList23.composedRepOK();
        boolean boolean26 = linkedList14.remove((java.lang.Object) boolean25);
        boolean boolean27 = linkedList5.add((java.lang.Object) linkedList14);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList5", linkedList5.property_2());
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.composedRepOK();
        linkedList0.clear();
        boolean boolean4 = linkedList0.property_1();
        boolean boolean5 = linkedList0.property_1();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        boolean boolean7 = linkedList6.composedRepOK();
        boolean boolean8 = linkedList6.composedRepOK();
        linkedList6.clear();
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        boolean boolean11 = linkedList10.property_1();
        int int12 = linkedList10.size();
        int int13 = linkedList10.size();
        boolean boolean15 = linkedList10.remove((java.lang.Object) (byte) 0);
        boolean boolean16 = linkedList6.remove((java.lang.Object) linkedList10);
        boolean boolean17 = linkedList0.add((java.lang.Object) linkedList6);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.composedRepOK();
        boolean boolean3 = linkedList0.composedRepOK();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        int int5 = linkedList4.size();
        int int6 = linkedList4.size();
        boolean boolean7 = linkedList4.property_1();
        boolean boolean8 = linkedList0.remove((java.lang.Object) linkedList4);
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        boolean boolean10 = linkedList9.property_1();
        int int11 = linkedList9.size();
        int int12 = linkedList9.size();
        boolean boolean14 = linkedList9.remove((java.lang.Object) (byte) 0);
        boolean boolean15 = linkedList4.remove((java.lang.Object) (byte) 0);
        boolean boolean16 = linkedList4.composedRepOK();
        linkedList4.clear();
        system.testclass.LinkedList linkedList18 = new system.testclass.LinkedList();
        int int19 = linkedList18.size();
        int int20 = linkedList18.size();
        boolean boolean21 = linkedList18.property_1();
        int int22 = linkedList18.size();
        system.testclass.LinkedList linkedList23 = new system.testclass.LinkedList();
        boolean boolean24 = linkedList23.composedRepOK();
        boolean boolean25 = linkedList23.composedRepOK();
        boolean boolean26 = linkedList23.composedRepOK();
        system.testclass.LinkedList linkedList27 = new system.testclass.LinkedList();
        int int28 = linkedList27.size();
        int int29 = linkedList27.size();
        boolean boolean30 = linkedList27.property_1();
        boolean boolean31 = linkedList23.remove((java.lang.Object) linkedList27);
        boolean boolean33 = linkedList27.remove((java.lang.Object) (-1));
        boolean boolean34 = linkedList18.remove((java.lang.Object) (-1));
        boolean boolean35 = linkedList4.add((java.lang.Object) boolean34);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList4", linkedList4.property_2());
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_1();
        boolean boolean3 = linkedList0.remove((java.lang.Object) true);
        boolean boolean5 = linkedList0.remove((java.lang.Object) 10.0d);
        int int6 = linkedList0.size();
        boolean boolean7 = linkedList0.property_1();
        linkedList0.clear();
        int int9 = linkedList0.size();
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        boolean boolean11 = linkedList10.property_1();
        int int12 = linkedList10.size();
        java.lang.Object obj13 = null;
        boolean boolean14 = linkedList10.remove(obj13);
        boolean boolean15 = linkedList10.property_1();
        linkedList10.clear();
        boolean boolean17 = linkedList0.remove((java.lang.Object) linkedList10);
        system.testclass.LinkedList linkedList18 = new system.testclass.LinkedList();
        int int19 = linkedList18.size();
        int int20 = linkedList18.size();
        boolean boolean21 = linkedList18.property_1();
        int int22 = linkedList18.size();
        system.testclass.LinkedList linkedList23 = new system.testclass.LinkedList();
        boolean boolean24 = linkedList23.composedRepOK();
        boolean boolean25 = linkedList23.composedRepOK();
        boolean boolean26 = linkedList23.composedRepOK();
        system.testclass.LinkedList linkedList27 = new system.testclass.LinkedList();
        int int28 = linkedList27.size();
        int int29 = linkedList27.size();
        boolean boolean30 = linkedList27.property_1();
        boolean boolean31 = linkedList23.remove((java.lang.Object) linkedList27);
        boolean boolean33 = linkedList27.remove((java.lang.Object) (-1));
        boolean boolean34 = linkedList18.remove((java.lang.Object) (-1));
        boolean boolean35 = linkedList10.add((java.lang.Object) boolean34);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList10", linkedList10.property_2());
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.composedRepOK();
        linkedList0.clear();
        boolean boolean4 = linkedList0.property_1();
        boolean boolean5 = linkedList0.property_1();
        linkedList0.clear();
        boolean boolean7 = linkedList0.property_1();
        boolean boolean8 = linkedList0.property_1();
        boolean boolean10 = linkedList0.add((java.lang.Object) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.property_1();
        boolean boolean3 = linkedList0.property_1();
        boolean boolean4 = linkedList0.composedRepOK();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean8 = linkedList0.add((java.lang.Object) 1.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.composedRepOK();
        boolean boolean3 = linkedList0.composedRepOK();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        boolean boolean5 = linkedList4.composedRepOK();
        boolean boolean6 = linkedList4.composedRepOK();
        boolean boolean7 = linkedList4.composedRepOK();
        boolean boolean9 = linkedList4.remove((java.lang.Object) (byte) 1);
        boolean boolean10 = linkedList4.composedRepOK();
        boolean boolean11 = linkedList0.remove((java.lang.Object) linkedList4);
        boolean boolean12 = linkedList0.property_1();
        system.testclass.LinkedList linkedList13 = new system.testclass.LinkedList();
        boolean boolean14 = linkedList13.composedRepOK();
        boolean boolean15 = linkedList13.composedRepOK();
        boolean boolean16 = linkedList13.composedRepOK();
        boolean boolean18 = linkedList13.remove((java.lang.Object) (byte) 1);
        boolean boolean19 = linkedList13.composedRepOK();
        int int20 = linkedList13.size();
        boolean boolean21 = linkedList0.add((java.lang.Object) linkedList13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.composedRepOK();
        boolean boolean3 = linkedList0.composedRepOK();
        boolean boolean5 = linkedList0.remove((java.lang.Object) (byte) 1);
        boolean boolean6 = linkedList0.property_1();
        int int7 = linkedList0.size();
        java.lang.Object obj8 = null;
        boolean boolean9 = linkedList0.add(obj8);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean3 = linkedList0.remove((java.lang.Object) 1.0d);
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        int int5 = linkedList4.size();
        int int6 = linkedList4.size();
        boolean boolean7 = linkedList4.property_1();
        int int8 = linkedList4.size();
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        boolean boolean10 = linkedList9.composedRepOK();
        boolean boolean11 = linkedList9.composedRepOK();
        boolean boolean12 = linkedList9.composedRepOK();
        system.testclass.LinkedList linkedList13 = new system.testclass.LinkedList();
        int int14 = linkedList13.size();
        int int15 = linkedList13.size();
        boolean boolean16 = linkedList13.property_1();
        boolean boolean17 = linkedList9.remove((java.lang.Object) linkedList13);
        boolean boolean19 = linkedList13.remove((java.lang.Object) (-1));
        boolean boolean20 = linkedList4.remove((java.lang.Object) (-1));
        boolean boolean21 = linkedList0.remove((java.lang.Object) boolean20);
        boolean boolean22 = linkedList0.property_1();
        system.testclass.LinkedList linkedList23 = new system.testclass.LinkedList();
        boolean boolean24 = linkedList23.composedRepOK();
        boolean boolean25 = linkedList23.composedRepOK();
        boolean boolean26 = linkedList23.composedRepOK();
        system.testclass.LinkedList linkedList27 = new system.testclass.LinkedList();
        int int28 = linkedList27.size();
        int int29 = linkedList27.size();
        boolean boolean30 = linkedList27.property_1();
        boolean boolean31 = linkedList23.remove((java.lang.Object) linkedList27);
        system.testclass.LinkedList linkedList32 = new system.testclass.LinkedList();
        boolean boolean33 = linkedList32.composedRepOK();
        boolean boolean34 = linkedList32.composedRepOK();
        boolean boolean35 = linkedList23.remove((java.lang.Object) boolean34);
        boolean boolean36 = linkedList0.add((java.lang.Object) boolean35);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_1();
        linkedList0.clear();
        system.testclass.LinkedList linkedList3 = new system.testclass.LinkedList();
        int int4 = linkedList3.size();
        int int5 = linkedList3.size();
        boolean boolean6 = linkedList3.property_1();
        int int7 = linkedList3.size();
        boolean boolean8 = linkedList0.add((java.lang.Object) int7);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        int int2 = linkedList0.size();
        system.testclass.LinkedList linkedList3 = new system.testclass.LinkedList();
        boolean boolean4 = linkedList3.property_1();
        int int5 = linkedList3.size();
        boolean boolean6 = linkedList3.property_1();
        linkedList3.clear();
        linkedList3.clear();
        boolean boolean9 = linkedList0.add((java.lang.Object) linkedList3);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.property_1();
        system.testclass.LinkedList linkedList3 = new system.testclass.LinkedList();
        boolean boolean4 = linkedList3.property_1();
        int int5 = linkedList3.size();
        java.lang.Object obj6 = null;
        boolean boolean7 = linkedList3.remove(obj6);
        boolean boolean9 = linkedList3.remove((java.lang.Object) 1.0f);
        boolean boolean10 = linkedList0.add((java.lang.Object) boolean9);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.composedRepOK();
        boolean boolean3 = linkedList0.composedRepOK();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        boolean boolean5 = linkedList4.composedRepOK();
        boolean boolean6 = linkedList4.composedRepOK();
        boolean boolean7 = linkedList4.composedRepOK();
        boolean boolean9 = linkedList4.remove((java.lang.Object) (byte) 1);
        boolean boolean10 = linkedList4.composedRepOK();
        boolean boolean11 = linkedList0.remove((java.lang.Object) linkedList4);
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        boolean boolean13 = linkedList12.property_1();
        int int14 = linkedList12.size();
        int int15 = linkedList12.size();
        boolean boolean17 = linkedList12.remove((java.lang.Object) (byte) 0);
        int int18 = linkedList12.size();
        boolean boolean19 = linkedList0.add((java.lang.Object) int18);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        boolean boolean2 = linkedList0.composedRepOK();
        boolean boolean4 = linkedList0.remove((java.lang.Object) '4');
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        boolean boolean6 = linkedList5.composedRepOK();
        boolean boolean7 = linkedList5.composedRepOK();
        boolean boolean8 = linkedList5.composedRepOK();
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        boolean boolean10 = linkedList9.composedRepOK();
        boolean boolean11 = linkedList9.composedRepOK();
        boolean boolean12 = linkedList9.composedRepOK();
        boolean boolean14 = linkedList9.remove((java.lang.Object) (byte) 1);
        boolean boolean15 = linkedList9.composedRepOK();
        boolean boolean16 = linkedList5.remove((java.lang.Object) linkedList9);
        boolean boolean17 = linkedList5.property_1();
        int int18 = linkedList5.size();
        boolean boolean19 = linkedList5.property_1();
        system.testclass.LinkedList linkedList20 = new system.testclass.LinkedList();
        boolean boolean21 = linkedList20.property_1();
        int int22 = linkedList20.size();
        int int23 = linkedList20.size();
        boolean boolean24 = linkedList20.composedRepOK();
        boolean boolean25 = linkedList20.composedRepOK();
        boolean boolean26 = linkedList5.remove((java.lang.Object) linkedList20);
        boolean boolean27 = linkedList0.add((java.lang.Object) boolean26);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.composedRepOK();
        linkedList0.clear();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        boolean boolean5 = linkedList4.property_1();
        int int6 = linkedList4.size();
        int int7 = linkedList4.size();
        boolean boolean9 = linkedList4.remove((java.lang.Object) (byte) 0);
        int int10 = linkedList4.size();
        boolean boolean11 = linkedList0.add((java.lang.Object) int10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        int int2 = linkedList0.size();
        linkedList0.clear();
        boolean boolean4 = linkedList0.property_1();
        boolean boolean6 = linkedList0.add((java.lang.Object) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_1();
        boolean boolean3 = linkedList0.remove((java.lang.Object) true);
        boolean boolean5 = linkedList0.remove((java.lang.Object) 10.0d);
        int int6 = linkedList0.size();
        boolean boolean7 = linkedList0.property_1();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean10 = linkedList0.property_1();
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        int int12 = linkedList11.size();
        int int13 = linkedList11.size();
        boolean boolean14 = linkedList11.property_1();
        boolean boolean15 = linkedList11.composedRepOK();
        int int16 = linkedList11.size();
        boolean boolean17 = linkedList0.add((java.lang.Object) linkedList11);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.composedRepOK();
        boolean boolean3 = linkedList0.composedRepOK();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        boolean boolean5 = linkedList4.composedRepOK();
        boolean boolean6 = linkedList4.composedRepOK();
        boolean boolean7 = linkedList4.composedRepOK();
        boolean boolean9 = linkedList4.remove((java.lang.Object) (byte) 1);
        boolean boolean10 = linkedList4.composedRepOK();
        boolean boolean11 = linkedList0.remove((java.lang.Object) linkedList4);
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        boolean boolean13 = linkedList12.composedRepOK();
        boolean boolean14 = linkedList12.composedRepOK();
        boolean boolean15 = linkedList12.composedRepOK();
        system.testclass.LinkedList linkedList16 = new system.testclass.LinkedList();
        int int17 = linkedList16.size();
        int int18 = linkedList16.size();
        boolean boolean19 = linkedList16.property_1();
        boolean boolean20 = linkedList12.remove((java.lang.Object) linkedList16);
        system.testclass.LinkedList linkedList21 = new system.testclass.LinkedList();
        boolean boolean22 = linkedList21.composedRepOK();
        boolean boolean23 = linkedList21.composedRepOK();
        boolean boolean24 = linkedList12.remove((java.lang.Object) boolean23);
        boolean boolean25 = linkedList12.composedRepOK();
        boolean boolean26 = linkedList0.add((java.lang.Object) boolean25);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.composedRepOK();
        int int3 = linkedList0.size();
        boolean boolean5 = linkedList0.remove((java.lang.Object) ' ');
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        boolean boolean7 = linkedList6.composedRepOK();
        boolean boolean8 = linkedList6.property_1();
        boolean boolean9 = linkedList6.property_1();
        boolean boolean10 = linkedList6.composedRepOK();
        linkedList6.clear();
        boolean boolean12 = linkedList0.add((java.lang.Object) linkedList6);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_1();
        int int2 = linkedList0.size();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.composedRepOK();
        boolean boolean5 = linkedList0.composedRepOK();
        linkedList0.clear();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        boolean boolean8 = linkedList7.composedRepOK();
        boolean boolean9 = linkedList7.composedRepOK();
        boolean boolean10 = linkedList7.composedRepOK();
        linkedList7.clear();
        boolean boolean12 = linkedList7.composedRepOK();
        boolean boolean13 = linkedList7.composedRepOK();
        boolean boolean14 = linkedList0.remove((java.lang.Object) linkedList7);
        system.testclass.LinkedList linkedList15 = new system.testclass.LinkedList();
        boolean boolean16 = linkedList15.composedRepOK();
        boolean boolean18 = linkedList15.remove((java.lang.Object) 1.0d);
        system.testclass.LinkedList linkedList19 = new system.testclass.LinkedList();
        int int20 = linkedList19.size();
        int int21 = linkedList19.size();
        boolean boolean22 = linkedList19.property_1();
        int int23 = linkedList19.size();
        boolean boolean24 = linkedList15.remove((java.lang.Object) linkedList19);
        boolean boolean25 = linkedList0.add((java.lang.Object) boolean24);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        system.testclass.LinkedList linkedList2 = new system.testclass.LinkedList();
        boolean boolean3 = linkedList2.composedRepOK();
        boolean boolean4 = linkedList2.composedRepOK();
        boolean boolean5 = linkedList0.add((java.lang.Object) linkedList2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean3 = linkedList0.remove((java.lang.Object) 1.0d);
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        boolean boolean5 = linkedList4.property_1();
        boolean boolean7 = linkedList4.remove((java.lang.Object) true);
        linkedList4.clear();
        int int9 = linkedList4.size();
        int int10 = linkedList4.size();
        java.lang.Class<?> wildcardClass11 = linkedList4.getClass();
        boolean boolean12 = linkedList0.add((java.lang.Object) linkedList4);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_1();
        boolean boolean3 = linkedList0.remove((java.lang.Object) true);
        boolean boolean5 = linkedList0.remove((java.lang.Object) 10.0d);
        int int6 = linkedList0.size();
        boolean boolean7 = linkedList0.property_1();
        linkedList0.clear();
        int int9 = linkedList0.size();
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        boolean boolean11 = linkedList10.property_1();
        int int12 = linkedList10.size();
        java.lang.Object obj13 = null;
        boolean boolean14 = linkedList10.remove(obj13);
        boolean boolean15 = linkedList10.property_1();
        linkedList10.clear();
        boolean boolean17 = linkedList0.remove((java.lang.Object) linkedList10);
        system.testclass.LinkedList linkedList18 = new system.testclass.LinkedList();
        boolean boolean19 = linkedList18.property_1();
        int int20 = linkedList18.size();
        boolean boolean21 = linkedList18.property_1();
        system.testclass.LinkedList linkedList22 = new system.testclass.LinkedList();
        int int23 = linkedList22.size();
        int int24 = linkedList22.size();
        boolean boolean25 = linkedList22.property_1();
        int int26 = linkedList22.size();
        system.testclass.LinkedList linkedList27 = new system.testclass.LinkedList();
        boolean boolean28 = linkedList27.property_1();
        int int29 = linkedList27.size();
        java.lang.Object obj30 = null;
        boolean boolean31 = linkedList27.remove(obj30);
        boolean boolean33 = linkedList27.remove((java.lang.Object) 1.0f);
        boolean boolean34 = linkedList22.remove((java.lang.Object) boolean33);
        java.lang.Object obj35 = null;
        boolean boolean36 = linkedList22.remove(obj35);
        int int37 = linkedList22.size();
        boolean boolean38 = linkedList18.remove((java.lang.Object) linkedList22);
        boolean boolean39 = linkedList10.add((java.lang.Object) linkedList22);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList10", linkedList10.property_2());
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.composedRepOK();
        boolean boolean3 = linkedList0.composedRepOK();
        boolean boolean5 = linkedList0.remove((java.lang.Object) (byte) 1);
        boolean boolean6 = linkedList0.composedRepOK();
        int int7 = linkedList0.size();
        boolean boolean8 = linkedList0.property_1();
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        boolean boolean10 = linkedList9.composedRepOK();
        boolean boolean11 = linkedList9.property_1();
        boolean boolean12 = linkedList9.property_1();
        linkedList9.clear();
        java.lang.Class<?> wildcardClass14 = linkedList9.getClass();
        boolean boolean15 = linkedList0.add((java.lang.Object) linkedList9);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_1();
        boolean boolean3 = linkedList0.remove((java.lang.Object) true);
        boolean boolean5 = linkedList0.remove((java.lang.Object) 10.0d);
        int int6 = linkedList0.size();
        linkedList0.clear();
        java.lang.Object obj8 = null;
        boolean boolean9 = linkedList0.add(obj8);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_1();
        boolean boolean3 = linkedList0.remove((java.lang.Object) true);
        linkedList0.clear();
        int int5 = linkedList0.size();
        int int6 = linkedList0.size();
        int int7 = linkedList0.size();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        boolean boolean9 = linkedList0.add((java.lang.Object) linkedList8);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.composedRepOK();
        linkedList0.clear();
        boolean boolean4 = linkedList0.property_1();
        boolean boolean5 = linkedList0.property_1();
        linkedList0.clear();
        boolean boolean7 = linkedList0.composedRepOK();
        boolean boolean8 = linkedList0.composedRepOK();
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        boolean boolean10 = linkedList9.property_1();
        int int11 = linkedList9.size();
        int int12 = linkedList9.size();
        boolean boolean14 = linkedList9.remove((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass15 = linkedList9.getClass();
        boolean boolean16 = linkedList0.add((java.lang.Object) wildcardClass15);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_1();
        int int2 = linkedList0.size();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.composedRepOK();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        int int6 = linkedList5.size();
        int int7 = linkedList5.size();
        boolean boolean8 = linkedList5.property_1();
        int int9 = linkedList5.size();
        linkedList5.clear();
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        boolean boolean12 = linkedList11.composedRepOK();
        boolean boolean13 = linkedList11.property_1();
        boolean boolean14 = linkedList11.property_1();
        linkedList11.clear();
        boolean boolean16 = linkedList11.property_1();
        boolean boolean17 = linkedList5.remove((java.lang.Object) linkedList11);
        boolean boolean18 = linkedList5.property_1();
        boolean boolean19 = linkedList5.composedRepOK();
        boolean boolean20 = linkedList0.add((java.lang.Object) linkedList5);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_1();
        boolean boolean3 = linkedList0.remove((java.lang.Object) true);
        boolean boolean5 = linkedList0.remove((java.lang.Object) 10.0d);
        int int6 = linkedList0.size();
        boolean boolean7 = linkedList0.property_1();
        linkedList0.clear();
        int int9 = linkedList0.size();
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        boolean boolean11 = linkedList10.property_1();
        int int12 = linkedList10.size();
        java.lang.Object obj13 = null;
        boolean boolean14 = linkedList10.remove(obj13);
        boolean boolean15 = linkedList10.property_1();
        linkedList10.clear();
        boolean boolean17 = linkedList0.remove((java.lang.Object) linkedList10);
        system.testclass.LinkedList linkedList18 = new system.testclass.LinkedList();
        boolean boolean19 = linkedList18.composedRepOK();
        boolean boolean20 = linkedList18.composedRepOK();
        int int21 = linkedList18.size();
        boolean boolean23 = linkedList18.remove((java.lang.Object) ' ');
        boolean boolean24 = linkedList10.remove((java.lang.Object) ' ');
        system.testclass.LinkedList linkedList25 = new system.testclass.LinkedList();
        boolean boolean26 = linkedList25.composedRepOK();
        boolean boolean27 = linkedList25.composedRepOK();
        boolean boolean28 = linkedList25.composedRepOK();
        system.testclass.LinkedList linkedList29 = new system.testclass.LinkedList();
        boolean boolean30 = linkedList29.composedRepOK();
        boolean boolean31 = linkedList29.composedRepOK();
        boolean boolean32 = linkedList29.composedRepOK();
        boolean boolean34 = linkedList29.remove((java.lang.Object) (byte) 1);
        boolean boolean35 = linkedList29.composedRepOK();
        boolean boolean36 = linkedList25.remove((java.lang.Object) linkedList29);
        system.testclass.LinkedList linkedList37 = new system.testclass.LinkedList();
        boolean boolean38 = linkedList37.composedRepOK();
        boolean boolean39 = linkedList37.composedRepOK();
        linkedList37.clear();
        system.testclass.LinkedList linkedList41 = new system.testclass.LinkedList();
        boolean boolean42 = linkedList41.property_1();
        int int43 = linkedList41.size();
        int int44 = linkedList41.size();
        boolean boolean46 = linkedList41.remove((java.lang.Object) (byte) 0);
        boolean boolean47 = linkedList37.remove((java.lang.Object) linkedList41);
        boolean boolean48 = linkedList25.remove((java.lang.Object) linkedList41);
        java.lang.Class<?> wildcardClass49 = linkedList25.getClass();
        boolean boolean50 = linkedList10.add((java.lang.Object) wildcardClass49);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList10", linkedList10.property_2());
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_1();
        boolean boolean3 = linkedList0.remove((java.lang.Object) true);
        boolean boolean5 = linkedList0.remove((java.lang.Object) 10.0d);
        int int6 = linkedList0.size();
        boolean boolean7 = linkedList0.property_1();
        linkedList0.clear();
        int int9 = linkedList0.size();
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        boolean boolean11 = linkedList10.property_1();
        int int12 = linkedList10.size();
        java.lang.Object obj13 = null;
        boolean boolean14 = linkedList10.remove(obj13);
        boolean boolean15 = linkedList10.property_1();
        linkedList10.clear();
        boolean boolean17 = linkedList0.remove((java.lang.Object) linkedList10);
        system.testclass.LinkedList linkedList18 = new system.testclass.LinkedList();
        boolean boolean19 = linkedList18.composedRepOK();
        boolean boolean20 = linkedList18.property_1();
        linkedList18.clear();
        boolean boolean22 = linkedList18.composedRepOK();
        boolean boolean23 = linkedList10.remove((java.lang.Object) linkedList18);
        system.testclass.LinkedList linkedList24 = new system.testclass.LinkedList();
        boolean boolean25 = linkedList24.property_1();
        int int26 = linkedList24.size();
        int int27 = linkedList24.size();
        boolean boolean29 = linkedList24.remove((java.lang.Object) (byte) 0);
        linkedList24.clear();
        boolean boolean31 = linkedList24.property_1();
        linkedList24.clear();
        boolean boolean33 = linkedList10.add((java.lang.Object) linkedList24);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList10", linkedList10.property_2());
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.composedRepOK();
        boolean boolean3 = linkedList0.composedRepOK();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        boolean boolean5 = linkedList4.composedRepOK();
        boolean boolean6 = linkedList4.composedRepOK();
        boolean boolean7 = linkedList4.composedRepOK();
        boolean boolean9 = linkedList4.remove((java.lang.Object) (byte) 1);
        boolean boolean10 = linkedList4.composedRepOK();
        boolean boolean11 = linkedList0.remove((java.lang.Object) linkedList4);
        boolean boolean12 = linkedList0.property_1();
        system.testclass.LinkedList linkedList13 = new system.testclass.LinkedList();
        boolean boolean14 = linkedList13.composedRepOK();
        boolean boolean15 = linkedList13.composedRepOK();
        boolean boolean16 = linkedList13.composedRepOK();
        boolean boolean18 = linkedList13.remove((java.lang.Object) (byte) 1);
        boolean boolean19 = linkedList13.composedRepOK();
        boolean boolean20 = linkedList0.add((java.lang.Object) linkedList13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_1();
        boolean boolean3 = linkedList0.remove((java.lang.Object) true);
        linkedList0.clear();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        boolean boolean6 = linkedList5.property_1();
        int int7 = linkedList5.size();
        java.lang.Object obj8 = null;
        boolean boolean9 = linkedList5.remove(obj8);
        boolean boolean10 = linkedList5.composedRepOK();
        linkedList5.clear();
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        boolean boolean13 = linkedList12.composedRepOK();
        boolean boolean14 = linkedList12.composedRepOK();
        int int15 = linkedList12.size();
        boolean boolean17 = linkedList12.remove((java.lang.Object) ' ');
        java.lang.Class<?> wildcardClass18 = linkedList12.getClass();
        boolean boolean19 = linkedList5.remove((java.lang.Object) wildcardClass18);
        system.testclass.LinkedList linkedList20 = new system.testclass.LinkedList();
        boolean boolean21 = linkedList20.composedRepOK();
        boolean boolean22 = linkedList20.property_1();
        boolean boolean23 = linkedList20.property_1();
        boolean boolean24 = linkedList5.remove((java.lang.Object) linkedList20);
        boolean boolean25 = linkedList0.add((java.lang.Object) boolean24);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.composedRepOK();
        linkedList0.clear();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        boolean boolean5 = linkedList4.property_1();
        int int6 = linkedList4.size();
        int int7 = linkedList4.size();
        boolean boolean9 = linkedList4.remove((java.lang.Object) (byte) 0);
        boolean boolean10 = linkedList0.remove((java.lang.Object) linkedList4);
        boolean boolean11 = linkedList0.property_1();
        linkedList0.clear();
        boolean boolean14 = linkedList0.add((java.lang.Object) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_1();
        int int2 = linkedList0.size();
        boolean boolean3 = linkedList0.property_1();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        int int5 = linkedList4.size();
        int int6 = linkedList4.size();
        boolean boolean7 = linkedList4.property_1();
        int int8 = linkedList4.size();
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        boolean boolean10 = linkedList9.property_1();
        int int11 = linkedList9.size();
        java.lang.Object obj12 = null;
        boolean boolean13 = linkedList9.remove(obj12);
        boolean boolean15 = linkedList9.remove((java.lang.Object) 1.0f);
        boolean boolean16 = linkedList4.remove((java.lang.Object) boolean15);
        java.lang.Object obj17 = null;
        boolean boolean18 = linkedList4.remove(obj17);
        int int19 = linkedList4.size();
        boolean boolean20 = linkedList0.remove((java.lang.Object) linkedList4);
        system.testclass.LinkedList linkedList21 = new system.testclass.LinkedList();
        boolean boolean22 = linkedList21.composedRepOK();
        boolean boolean23 = linkedList21.property_1();
        boolean boolean24 = linkedList21.property_1();
        linkedList21.clear();
        boolean boolean26 = linkedList4.add((java.lang.Object) linkedList21);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList4", linkedList4.property_2());
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_1();
        boolean boolean3 = linkedList0.remove((java.lang.Object) true);
        boolean boolean5 = linkedList0.remove((java.lang.Object) 10.0d);
        boolean boolean6 = linkedList0.composedRepOK();
        linkedList0.clear();
        boolean boolean8 = linkedList0.composedRepOK();
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        boolean boolean10 = linkedList9.composedRepOK();
        boolean boolean11 = linkedList9.composedRepOK();
        boolean boolean12 = linkedList9.composedRepOK();
        linkedList9.clear();
        boolean boolean14 = linkedList9.composedRepOK();
        boolean boolean15 = linkedList0.add((java.lang.Object) linkedList9);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        int int2 = linkedList0.size();
        boolean boolean3 = linkedList0.property_1();
        int int4 = linkedList0.size();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        boolean boolean6 = linkedList5.property_1();
        int int7 = linkedList5.size();
        int int8 = linkedList5.size();
        boolean boolean10 = linkedList5.remove((java.lang.Object) (byte) 0);
        linkedList5.clear();
        boolean boolean12 = linkedList0.remove((java.lang.Object) linkedList5);
        linkedList0.clear();
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        boolean boolean15 = linkedList14.composedRepOK();
        boolean boolean17 = linkedList14.remove((java.lang.Object) 1.0d);
        linkedList14.clear();
        boolean boolean19 = linkedList14.property_1();
        boolean boolean20 = linkedList0.add((java.lang.Object) linkedList14);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        int int2 = linkedList0.size();
        boolean boolean3 = linkedList0.property_1();
        int int4 = linkedList0.size();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        boolean boolean6 = linkedList5.property_1();
        int int7 = linkedList5.size();
        int int8 = linkedList5.size();
        boolean boolean10 = linkedList5.remove((java.lang.Object) (byte) 0);
        linkedList5.clear();
        boolean boolean12 = linkedList0.remove((java.lang.Object) linkedList5);
        boolean boolean13 = linkedList0.composedRepOK();
        boolean boolean14 = linkedList0.property_1();
        int int15 = linkedList0.size();
        system.testclass.LinkedList linkedList16 = new system.testclass.LinkedList();
        int int17 = linkedList16.size();
        int int18 = linkedList16.size();
        boolean boolean19 = linkedList16.property_1();
        boolean boolean20 = linkedList16.composedRepOK();
        linkedList16.clear();
        boolean boolean22 = linkedList0.add((java.lang.Object) linkedList16);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.composedRepOK();
        boolean boolean3 = linkedList0.property_1();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        linkedList4.clear();
        int int6 = linkedList4.size();
        int int7 = linkedList4.size();
        java.lang.Class<?> wildcardClass8 = linkedList4.getClass();
        boolean boolean9 = linkedList0.add((java.lang.Object) wildcardClass8);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.composedRepOK();
        boolean boolean3 = linkedList0.composedRepOK();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        int int5 = linkedList4.size();
        int int6 = linkedList4.size();
        boolean boolean7 = linkedList4.property_1();
        boolean boolean8 = linkedList0.remove((java.lang.Object) linkedList4);
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        boolean boolean10 = linkedList9.property_1();
        int int11 = linkedList9.size();
        int int12 = linkedList9.size();
        boolean boolean14 = linkedList9.remove((java.lang.Object) (byte) 0);
        boolean boolean15 = linkedList4.remove((java.lang.Object) (byte) 0);
        boolean boolean16 = linkedList4.composedRepOK();
        linkedList4.clear();
        system.testclass.LinkedList linkedList18 = new system.testclass.LinkedList();
        boolean boolean19 = linkedList18.property_1();
        int int20 = linkedList18.size();
        java.lang.Object obj21 = null;
        boolean boolean22 = linkedList18.remove(obj21);
        linkedList18.clear();
        boolean boolean24 = linkedList18.property_1();
        linkedList18.clear();
        java.lang.Object obj26 = null;
        boolean boolean27 = linkedList18.remove(obj26);
        int int28 = linkedList18.size();
        boolean boolean29 = linkedList4.add((java.lang.Object) linkedList18);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList4", linkedList4.property_2());
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean3 = linkedList0.remove((java.lang.Object) 1.0d);
        linkedList0.clear();
        boolean boolean5 = linkedList0.composedRepOK();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        int int7 = linkedList6.size();
        int int8 = linkedList6.size();
        boolean boolean9 = linkedList6.property_1();
        boolean boolean10 = linkedList6.composedRepOK();
        int int11 = linkedList6.size();
        boolean boolean12 = linkedList0.add((java.lang.Object) int11);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_1();
        int int2 = linkedList0.size();
        java.lang.Object obj3 = null;
        boolean boolean4 = linkedList0.remove(obj3);
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        boolean boolean6 = linkedList5.property_1();
        int int7 = linkedList5.size();
        int int8 = linkedList5.size();
        boolean boolean10 = linkedList5.remove((java.lang.Object) (byte) 0);
        linkedList5.clear();
        boolean boolean12 = linkedList5.property_1();
        linkedList5.clear();
        boolean boolean14 = linkedList5.property_1();
        boolean boolean15 = linkedList0.add((java.lang.Object) boolean14);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.property_1();
        boolean boolean4 = linkedList0.remove((java.lang.Object) 1.0d);
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        boolean boolean6 = linkedList5.property_1();
        int int7 = linkedList5.size();
        int int8 = linkedList5.size();
        boolean boolean9 = linkedList5.composedRepOK();
        boolean boolean10 = linkedList5.composedRepOK();
        boolean boolean11 = linkedList5.composedRepOK();
        boolean boolean12 = linkedList5.property_1();
        boolean boolean13 = linkedList0.add((java.lang.Object) boolean12);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        int int2 = linkedList0.size();
        boolean boolean3 = linkedList0.property_1();
        int int4 = linkedList0.size();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        boolean boolean6 = linkedList5.property_1();
        int int7 = linkedList5.size();
        java.lang.Object obj8 = null;
        boolean boolean9 = linkedList5.remove(obj8);
        boolean boolean11 = linkedList5.remove((java.lang.Object) 1.0f);
        boolean boolean12 = linkedList0.remove((java.lang.Object) boolean11);
        java.lang.Object obj13 = null;
        boolean boolean14 = linkedList0.remove(obj13);
        int int15 = linkedList0.size();
        boolean boolean16 = linkedList0.composedRepOK();
        java.lang.Object obj17 = null;
        boolean boolean18 = linkedList0.add(obj17);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.composedRepOK();
        boolean boolean3 = linkedList0.composedRepOK();
        boolean boolean5 = linkedList0.remove((java.lang.Object) (byte) 1);
        boolean boolean6 = linkedList0.composedRepOK();
        int int7 = linkedList0.size();
        boolean boolean9 = linkedList0.add((java.lang.Object) 100.0d);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.composedRepOK();
        linkedList0.clear();
        boolean boolean4 = linkedList0.property_1();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        boolean boolean6 = linkedList5.property_1();
        int int7 = linkedList5.size();
        boolean boolean8 = linkedList5.property_1();
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        int int10 = linkedList9.size();
        int int11 = linkedList9.size();
        boolean boolean12 = linkedList9.property_1();
        int int13 = linkedList9.size();
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        boolean boolean15 = linkedList14.property_1();
        int int16 = linkedList14.size();
        java.lang.Object obj17 = null;
        boolean boolean18 = linkedList14.remove(obj17);
        boolean boolean20 = linkedList14.remove((java.lang.Object) 1.0f);
        boolean boolean21 = linkedList9.remove((java.lang.Object) boolean20);
        java.lang.Object obj22 = null;
        boolean boolean23 = linkedList9.remove(obj22);
        int int24 = linkedList9.size();
        boolean boolean25 = linkedList5.remove((java.lang.Object) linkedList9);
        system.testclass.LinkedList linkedList26 = new system.testclass.LinkedList();
        boolean boolean27 = linkedList26.property_1();
        int int28 = linkedList26.size();
        int int29 = linkedList26.size();
        boolean boolean30 = linkedList5.remove((java.lang.Object) linkedList26);
        boolean boolean31 = linkedList5.property_1();
        boolean boolean32 = linkedList0.add((java.lang.Object) boolean31);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.composedRepOK();
        boolean boolean3 = linkedList0.composedRepOK();
        boolean boolean5 = linkedList0.remove((java.lang.Object) (byte) 1);
        boolean boolean6 = linkedList0.property_1();
        boolean boolean8 = linkedList0.add((java.lang.Object) (-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.composedRepOK();
        boolean boolean3 = linkedList0.composedRepOK();
        boolean boolean5 = linkedList0.remove((java.lang.Object) (byte) 1);
        boolean boolean6 = linkedList0.composedRepOK();
        int int7 = linkedList0.size();
        boolean boolean9 = linkedList0.remove((java.lang.Object) 10.0d);
        boolean boolean10 = linkedList0.property_1();
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        boolean boolean12 = linkedList11.composedRepOK();
        boolean boolean13 = linkedList11.composedRepOK();
        boolean boolean14 = linkedList11.composedRepOK();
        boolean boolean16 = linkedList11.remove((java.lang.Object) (byte) 1);
        boolean boolean17 = linkedList11.property_1();
        int int18 = linkedList11.size();
        int int19 = linkedList11.size();
        boolean boolean20 = linkedList11.composedRepOK();
        int int21 = linkedList11.size();
        boolean boolean22 = linkedList11.property_1();
        boolean boolean23 = linkedList0.add((java.lang.Object) linkedList11);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.composedRepOK();
        boolean boolean3 = linkedList0.composedRepOK();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        boolean boolean5 = linkedList4.composedRepOK();
        boolean boolean6 = linkedList4.composedRepOK();
        boolean boolean7 = linkedList4.composedRepOK();
        boolean boolean9 = linkedList4.remove((java.lang.Object) (byte) 1);
        boolean boolean10 = linkedList4.composedRepOK();
        boolean boolean11 = linkedList0.remove((java.lang.Object) linkedList4);
        boolean boolean12 = linkedList0.property_1();
        int int13 = linkedList0.size();
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        boolean boolean15 = linkedList14.composedRepOK();
        boolean boolean16 = linkedList14.property_1();
        boolean boolean17 = linkedList14.property_1();
        linkedList14.clear();
        boolean boolean19 = linkedList14.property_1();
        boolean boolean20 = linkedList0.remove((java.lang.Object) boolean19);
        system.testclass.LinkedList linkedList21 = new system.testclass.LinkedList();
        boolean boolean22 = linkedList21.composedRepOK();
        boolean boolean23 = linkedList21.property_1();
        boolean boolean24 = linkedList21.property_1();
        boolean boolean25 = linkedList21.composedRepOK();
        boolean boolean26 = linkedList21.composedRepOK();
        boolean boolean27 = linkedList21.composedRepOK();
        boolean boolean28 = linkedList0.add((java.lang.Object) linkedList21);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.composedRepOK();
        boolean boolean3 = linkedList0.composedRepOK();
        boolean boolean5 = linkedList0.remove((java.lang.Object) (byte) 1);
        boolean boolean6 = linkedList0.composedRepOK();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        boolean boolean8 = linkedList7.property_1();
        boolean boolean10 = linkedList7.remove((java.lang.Object) true);
        boolean boolean12 = linkedList7.remove((java.lang.Object) 10.0d);
        int int13 = linkedList7.size();
        boolean boolean14 = linkedList7.property_1();
        linkedList7.clear();
        int int16 = linkedList7.size();
        boolean boolean17 = linkedList0.add((java.lang.Object) int16);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.property_1();
        linkedList0.clear();
        int int4 = linkedList0.size();
        int int5 = linkedList0.size();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        boolean boolean7 = linkedList6.property_1();
        boolean boolean9 = linkedList6.remove((java.lang.Object) true);
        boolean boolean11 = linkedList6.remove((java.lang.Object) 10.0d);
        boolean boolean12 = linkedList0.add((java.lang.Object) linkedList6);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_1();
        int int2 = linkedList0.size();
        java.lang.Object obj3 = null;
        boolean boolean4 = linkedList0.remove(obj3);
        linkedList0.clear();
        boolean boolean6 = linkedList0.property_1();
        linkedList0.clear();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        boolean boolean9 = linkedList8.composedRepOK();
        boolean boolean10 = linkedList8.composedRepOK();
        boolean boolean11 = linkedList8.composedRepOK();
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        boolean boolean13 = linkedList12.composedRepOK();
        boolean boolean14 = linkedList12.composedRepOK();
        boolean boolean15 = linkedList12.composedRepOK();
        boolean boolean17 = linkedList12.remove((java.lang.Object) (byte) 1);
        boolean boolean18 = linkedList12.composedRepOK();
        boolean boolean19 = linkedList8.remove((java.lang.Object) linkedList12);
        boolean boolean20 = linkedList8.property_1();
        int int21 = linkedList8.size();
        boolean boolean22 = linkedList0.remove((java.lang.Object) linkedList8);
        int int23 = linkedList0.size();
        system.testclass.LinkedList linkedList24 = new system.testclass.LinkedList();
        boolean boolean25 = linkedList24.composedRepOK();
        boolean boolean26 = linkedList24.composedRepOK();
        boolean boolean27 = linkedList24.composedRepOK();
        boolean boolean28 = linkedList0.add((java.lang.Object) boolean27);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_1();
        int int2 = linkedList0.size();
        java.lang.Object obj3 = null;
        boolean boolean4 = linkedList0.remove(obj3);
        linkedList0.clear();
        boolean boolean6 = linkedList0.property_1();
        linkedList0.clear();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        boolean boolean9 = linkedList8.composedRepOK();
        boolean boolean10 = linkedList8.composedRepOK();
        boolean boolean11 = linkedList8.composedRepOK();
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        boolean boolean13 = linkedList12.composedRepOK();
        boolean boolean14 = linkedList12.composedRepOK();
        boolean boolean15 = linkedList12.composedRepOK();
        boolean boolean17 = linkedList12.remove((java.lang.Object) (byte) 1);
        boolean boolean18 = linkedList12.composedRepOK();
        boolean boolean19 = linkedList8.remove((java.lang.Object) linkedList12);
        boolean boolean20 = linkedList8.property_1();
        int int21 = linkedList8.size();
        boolean boolean22 = linkedList0.remove((java.lang.Object) linkedList8);
        system.testclass.LinkedList linkedList23 = new system.testclass.LinkedList();
        linkedList23.clear();
        java.lang.Class<?> wildcardClass25 = linkedList23.getClass();
        boolean boolean26 = linkedList0.add((java.lang.Object) wildcardClass25);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_1();
        int int2 = linkedList0.size();
        java.lang.Object obj3 = null;
        boolean boolean4 = linkedList0.remove(obj3);
        linkedList0.clear();
        boolean boolean6 = linkedList0.property_1();
        linkedList0.clear();
        java.lang.Object obj8 = null;
        boolean boolean9 = linkedList0.remove(obj8);
        int int10 = linkedList0.size();
        boolean boolean12 = linkedList0.add((java.lang.Object) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        linkedList0.clear();
        system.testclass.LinkedList linkedList3 = new system.testclass.LinkedList();
        boolean boolean4 = linkedList3.property_1();
        boolean boolean6 = linkedList3.remove((java.lang.Object) true);
        boolean boolean8 = linkedList3.remove((java.lang.Object) 10.0d);
        int int9 = linkedList3.size();
        boolean boolean10 = linkedList3.property_1();
        linkedList3.clear();
        int int12 = linkedList3.size();
        system.testclass.LinkedList linkedList13 = new system.testclass.LinkedList();
        boolean boolean14 = linkedList13.property_1();
        int int15 = linkedList13.size();
        java.lang.Object obj16 = null;
        boolean boolean17 = linkedList13.remove(obj16);
        boolean boolean18 = linkedList13.property_1();
        linkedList13.clear();
        boolean boolean20 = linkedList3.remove((java.lang.Object) linkedList13);
        system.testclass.LinkedList linkedList21 = new system.testclass.LinkedList();
        boolean boolean22 = linkedList21.composedRepOK();
        boolean boolean23 = linkedList21.composedRepOK();
        int int24 = linkedList21.size();
        boolean boolean26 = linkedList21.remove((java.lang.Object) ' ');
        boolean boolean27 = linkedList13.remove((java.lang.Object) ' ');
        java.lang.Class<?> wildcardClass28 = linkedList13.getClass();
        boolean boolean29 = linkedList0.add((java.lang.Object) wildcardClass28);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        int int2 = linkedList0.size();
        boolean boolean3 = linkedList0.property_1();
        int int4 = linkedList0.size();
        linkedList0.clear();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        boolean boolean7 = linkedList6.composedRepOK();
        boolean boolean8 = linkedList6.property_1();
        boolean boolean9 = linkedList6.property_1();
        linkedList6.clear();
        boolean boolean11 = linkedList6.property_1();
        boolean boolean12 = linkedList0.remove((java.lang.Object) linkedList6);
        system.testclass.LinkedList linkedList13 = new system.testclass.LinkedList();
        boolean boolean14 = linkedList13.composedRepOK();
        boolean boolean15 = linkedList13.composedRepOK();
        int int16 = linkedList13.size();
        boolean boolean18 = linkedList13.remove((java.lang.Object) ' ');
        java.lang.Class<?> wildcardClass19 = linkedList13.getClass();
        boolean boolean20 = linkedList0.add((java.lang.Object) linkedList13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_1();
        boolean boolean3 = linkedList0.remove((java.lang.Object) true);
        boolean boolean5 = linkedList0.remove((java.lang.Object) 10.0d);
        int int6 = linkedList0.size();
        boolean boolean7 = linkedList0.property_1();
        linkedList0.clear();
        int int9 = linkedList0.size();
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        boolean boolean11 = linkedList10.property_1();
        int int12 = linkedList10.size();
        java.lang.Object obj13 = null;
        boolean boolean14 = linkedList10.remove(obj13);
        boolean boolean15 = linkedList10.property_1();
        linkedList10.clear();
        boolean boolean17 = linkedList0.remove((java.lang.Object) linkedList10);
        system.testclass.LinkedList linkedList18 = new system.testclass.LinkedList();
        boolean boolean19 = linkedList18.composedRepOK();
        boolean boolean20 = linkedList18.property_1();
        linkedList18.clear();
        boolean boolean22 = linkedList18.composedRepOK();
        boolean boolean23 = linkedList10.remove((java.lang.Object) linkedList18);
        boolean boolean25 = linkedList10.add((java.lang.Object) 100L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList10", linkedList10.property_2());
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.property_1();
        linkedList0.clear();
        int int4 = linkedList0.size();
        int int5 = linkedList0.size();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        boolean boolean7 = linkedList6.property_1();
        int int8 = linkedList6.size();
        java.lang.Object obj9 = null;
        boolean boolean10 = linkedList6.remove(obj9);
        boolean boolean11 = linkedList6.composedRepOK();
        boolean boolean12 = linkedList6.composedRepOK();
        java.lang.Class<?> wildcardClass13 = linkedList6.getClass();
        boolean boolean14 = linkedList0.add((java.lang.Object) linkedList6);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_1();
        boolean boolean3 = linkedList0.remove((java.lang.Object) true);
        linkedList0.clear();
        int int5 = linkedList0.size();
        int int6 = linkedList0.size();
        int int7 = linkedList0.size();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        boolean boolean9 = linkedList8.composedRepOK();
        boolean boolean10 = linkedList8.composedRepOK();
        boolean boolean11 = linkedList8.composedRepOK();
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        int int13 = linkedList12.size();
        int int14 = linkedList12.size();
        boolean boolean15 = linkedList12.property_1();
        boolean boolean16 = linkedList8.remove((java.lang.Object) linkedList12);
        system.testclass.LinkedList linkedList17 = new system.testclass.LinkedList();
        boolean boolean18 = linkedList17.property_1();
        int int19 = linkedList17.size();
        int int20 = linkedList17.size();
        boolean boolean22 = linkedList17.remove((java.lang.Object) (byte) 0);
        boolean boolean23 = linkedList12.remove((java.lang.Object) (byte) 0);
        boolean boolean24 = linkedList12.composedRepOK();
        linkedList12.clear();
        boolean boolean26 = linkedList12.property_1();
        java.lang.Class<?> wildcardClass27 = linkedList12.getClass();
        boolean boolean28 = linkedList0.add((java.lang.Object) wildcardClass27);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_1();
        int int2 = linkedList0.size();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.composedRepOK();
        boolean boolean5 = linkedList0.composedRepOK();
        linkedList0.clear();
        linkedList0.clear();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        boolean boolean9 = linkedList8.property_1();
        int int10 = linkedList8.size();
        boolean boolean11 = linkedList8.property_1();
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        int int13 = linkedList12.size();
        int int14 = linkedList12.size();
        boolean boolean15 = linkedList12.property_1();
        int int16 = linkedList12.size();
        system.testclass.LinkedList linkedList17 = new system.testclass.LinkedList();
        boolean boolean18 = linkedList17.property_1();
        int int19 = linkedList17.size();
        java.lang.Object obj20 = null;
        boolean boolean21 = linkedList17.remove(obj20);
        boolean boolean23 = linkedList17.remove((java.lang.Object) 1.0f);
        boolean boolean24 = linkedList12.remove((java.lang.Object) boolean23);
        java.lang.Object obj25 = null;
        boolean boolean26 = linkedList12.remove(obj25);
        int int27 = linkedList12.size();
        boolean boolean28 = linkedList8.remove((java.lang.Object) linkedList12);
        system.testclass.LinkedList linkedList29 = new system.testclass.LinkedList();
        boolean boolean30 = linkedList29.property_1();
        int int31 = linkedList29.size();
        int int32 = linkedList29.size();
        boolean boolean33 = linkedList8.remove((java.lang.Object) linkedList29);
        boolean boolean34 = linkedList0.remove((java.lang.Object) boolean33);
        linkedList0.clear();
        system.testclass.LinkedList linkedList36 = new system.testclass.LinkedList();
        boolean boolean37 = linkedList36.property_1();
        boolean boolean39 = linkedList36.remove((java.lang.Object) true);
        boolean boolean41 = linkedList36.remove((java.lang.Object) 10.0d);
        int int42 = linkedList36.size();
        boolean boolean43 = linkedList36.property_1();
        linkedList36.clear();
        linkedList36.clear();
        boolean boolean46 = linkedList36.composedRepOK();
        boolean boolean47 = linkedList0.add((java.lang.Object) linkedList36);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.property_1();
        boolean boolean3 = linkedList0.property_1();
        boolean boolean4 = linkedList0.composedRepOK();
        int int5 = linkedList0.size();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        boolean boolean7 = linkedList6.property_1();
        int int8 = linkedList6.size();
        java.lang.Object obj9 = null;
        boolean boolean10 = linkedList6.remove(obj9);
        boolean boolean12 = linkedList6.remove((java.lang.Object) 1.0f);
        linkedList6.clear();
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        boolean boolean15 = linkedList14.property_1();
        int int16 = linkedList14.size();
        java.lang.Object obj17 = null;
        boolean boolean18 = linkedList14.remove(obj17);
        boolean boolean19 = linkedList14.composedRepOK();
        boolean boolean20 = linkedList14.property_1();
        boolean boolean21 = linkedList6.remove((java.lang.Object) boolean20);
        java.lang.Class<?> wildcardClass22 = linkedList6.getClass();
        boolean boolean23 = linkedList0.add((java.lang.Object) wildcardClass22);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_1();
        int int2 = linkedList0.size();
        java.lang.Object obj3 = null;
        boolean boolean4 = linkedList0.remove(obj3);
        linkedList0.clear();
        boolean boolean6 = linkedList0.property_1();
        linkedList0.clear();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        boolean boolean9 = linkedList8.composedRepOK();
        boolean boolean10 = linkedList8.composedRepOK();
        boolean boolean11 = linkedList8.composedRepOK();
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        boolean boolean13 = linkedList12.composedRepOK();
        boolean boolean14 = linkedList12.composedRepOK();
        boolean boolean15 = linkedList12.composedRepOK();
        boolean boolean17 = linkedList12.remove((java.lang.Object) (byte) 1);
        boolean boolean18 = linkedList12.composedRepOK();
        boolean boolean19 = linkedList8.remove((java.lang.Object) linkedList12);
        boolean boolean20 = linkedList8.property_1();
        int int21 = linkedList8.size();
        boolean boolean22 = linkedList0.remove((java.lang.Object) linkedList8);
        int int23 = linkedList0.size();
        system.testclass.LinkedList linkedList24 = new system.testclass.LinkedList();
        boolean boolean25 = linkedList24.property_1();
        boolean boolean27 = linkedList24.remove((java.lang.Object) true);
        boolean boolean29 = linkedList24.remove((java.lang.Object) 10.0d);
        int int30 = linkedList24.size();
        boolean boolean31 = linkedList24.property_1();
        linkedList24.clear();
        int int33 = linkedList24.size();
        system.testclass.LinkedList linkedList34 = new system.testclass.LinkedList();
        boolean boolean35 = linkedList34.property_1();
        int int36 = linkedList34.size();
        java.lang.Object obj37 = null;
        boolean boolean38 = linkedList34.remove(obj37);
        boolean boolean39 = linkedList34.property_1();
        linkedList34.clear();
        boolean boolean41 = linkedList24.remove((java.lang.Object) linkedList34);
        system.testclass.LinkedList linkedList42 = new system.testclass.LinkedList();
        boolean boolean43 = linkedList42.composedRepOK();
        boolean boolean44 = linkedList42.composedRepOK();
        int int45 = linkedList42.size();
        boolean boolean47 = linkedList42.remove((java.lang.Object) ' ');
        boolean boolean48 = linkedList34.remove((java.lang.Object) ' ');
        boolean boolean49 = linkedList0.add((java.lang.Object) boolean48);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_1();
        int int2 = linkedList0.size();
        java.lang.Object obj3 = null;
        boolean boolean4 = linkedList0.remove(obj3);
        linkedList0.clear();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        boolean boolean7 = linkedList6.property_1();
        int int8 = linkedList6.size();
        java.lang.Object obj9 = null;
        boolean boolean10 = linkedList6.remove(obj9);
        linkedList6.clear();
        boolean boolean12 = linkedList6.property_1();
        linkedList6.clear();
        java.lang.Object obj14 = null;
        boolean boolean15 = linkedList6.remove(obj14);
        boolean boolean16 = linkedList0.add(obj14);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_1();
        linkedList0.clear();
        system.testclass.LinkedList linkedList3 = new system.testclass.LinkedList();
        boolean boolean4 = linkedList3.composedRepOK();
        boolean boolean6 = linkedList3.remove((java.lang.Object) 1.0d);
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        int int8 = linkedList7.size();
        int int9 = linkedList7.size();
        boolean boolean10 = linkedList7.property_1();
        int int11 = linkedList7.size();
        boolean boolean12 = linkedList3.remove((java.lang.Object) linkedList7);
        boolean boolean13 = linkedList0.remove((java.lang.Object) linkedList7);
        linkedList0.clear();
        system.testclass.LinkedList linkedList15 = new system.testclass.LinkedList();
        int int16 = linkedList15.size();
        int int17 = linkedList15.size();
        boolean boolean18 = linkedList15.property_1();
        linkedList15.clear();
        linkedList15.clear();
        boolean boolean21 = linkedList0.add((java.lang.Object) linkedList15);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_1();
        int int2 = linkedList0.size();
        java.lang.Object obj3 = null;
        boolean boolean4 = linkedList0.remove(obj3);
        linkedList0.clear();
        boolean boolean6 = linkedList0.property_1();
        linkedList0.clear();
        java.lang.Object obj8 = null;
        boolean boolean9 = linkedList0.remove(obj8);
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        boolean boolean11 = linkedList10.property_1();
        boolean boolean13 = linkedList10.remove((java.lang.Object) true);
        boolean boolean15 = linkedList10.remove((java.lang.Object) 10.0d);
        int int16 = linkedList10.size();
        boolean boolean17 = linkedList10.property_1();
        linkedList10.clear();
        int int19 = linkedList10.size();
        system.testclass.LinkedList linkedList20 = new system.testclass.LinkedList();
        boolean boolean21 = linkedList20.property_1();
        int int22 = linkedList20.size();
        java.lang.Object obj23 = null;
        boolean boolean24 = linkedList20.remove(obj23);
        boolean boolean25 = linkedList20.property_1();
        linkedList20.clear();
        boolean boolean27 = linkedList10.remove((java.lang.Object) linkedList20);
        system.testclass.LinkedList linkedList28 = new system.testclass.LinkedList();
        boolean boolean29 = linkedList28.composedRepOK();
        boolean boolean31 = linkedList28.remove((java.lang.Object) 1.0d);
        linkedList28.clear();
        boolean boolean33 = linkedList20.remove((java.lang.Object) linkedList28);
        boolean boolean34 = linkedList0.add((java.lang.Object) linkedList20);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_1();
        int int2 = linkedList0.size();
        int int3 = linkedList0.size();
        boolean boolean4 = linkedList0.composedRepOK();
        boolean boolean5 = linkedList0.composedRepOK();
        linkedList0.clear();
        linkedList0.clear();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        boolean boolean9 = linkedList8.composedRepOK();
        boolean boolean10 = linkedList8.composedRepOK();
        boolean boolean11 = linkedList8.composedRepOK();
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        boolean boolean13 = linkedList12.composedRepOK();
        boolean boolean14 = linkedList12.composedRepOK();
        boolean boolean15 = linkedList12.composedRepOK();
        boolean boolean17 = linkedList12.remove((java.lang.Object) (byte) 1);
        boolean boolean18 = linkedList12.composedRepOK();
        boolean boolean19 = linkedList8.remove((java.lang.Object) linkedList12);
        boolean boolean20 = linkedList8.property_1();
        int int21 = linkedList8.size();
        boolean boolean22 = linkedList8.property_1();
        system.testclass.LinkedList linkedList23 = new system.testclass.LinkedList();
        boolean boolean24 = linkedList23.property_1();
        int int25 = linkedList23.size();
        int int26 = linkedList23.size();
        boolean boolean27 = linkedList23.composedRepOK();
        boolean boolean28 = linkedList23.composedRepOK();
        boolean boolean29 = linkedList8.remove((java.lang.Object) linkedList23);
        boolean boolean30 = linkedList0.add((java.lang.Object) linkedList23);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.composedRepOK();
        boolean boolean3 = linkedList0.composedRepOK();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        int int5 = linkedList4.size();
        int int6 = linkedList4.size();
        boolean boolean7 = linkedList4.property_1();
        boolean boolean8 = linkedList0.remove((java.lang.Object) linkedList4);
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        boolean boolean10 = linkedList9.property_1();
        int int11 = linkedList9.size();
        int int12 = linkedList9.size();
        boolean boolean14 = linkedList9.remove((java.lang.Object) (byte) 0);
        boolean boolean15 = linkedList4.remove((java.lang.Object) (byte) 0);
        boolean boolean16 = linkedList4.composedRepOK();
        linkedList4.clear();
        boolean boolean18 = linkedList4.property_1();
        int int19 = linkedList4.size();
        system.testclass.LinkedList linkedList20 = new system.testclass.LinkedList();
        boolean boolean21 = linkedList20.composedRepOK();
        boolean boolean22 = linkedList20.composedRepOK();
        int int23 = linkedList20.size();
        int int24 = linkedList20.size();
        int int25 = linkedList20.size();
        boolean boolean26 = linkedList4.remove((java.lang.Object) linkedList20);
        system.testclass.LinkedList linkedList27 = new system.testclass.LinkedList();
        boolean boolean28 = linkedList27.property_1();
        boolean boolean30 = linkedList27.remove((java.lang.Object) true);
        boolean boolean32 = linkedList27.remove((java.lang.Object) 10.0d);
        boolean boolean33 = linkedList27.composedRepOK();
        linkedList27.clear();
        linkedList27.clear();
        system.testclass.LinkedList linkedList36 = new system.testclass.LinkedList();
        boolean boolean37 = linkedList36.composedRepOK();
        boolean boolean38 = linkedList36.composedRepOK();
        boolean boolean39 = linkedList36.composedRepOK();
        boolean boolean41 = linkedList36.remove((java.lang.Object) (byte) 1);
        boolean boolean42 = linkedList36.property_1();
        int int43 = linkedList36.size();
        java.lang.Class<?> wildcardClass44 = linkedList36.getClass();
        boolean boolean45 = linkedList27.remove((java.lang.Object) linkedList36);
        boolean boolean46 = linkedList20.add((java.lang.Object) boolean45);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList20", linkedList20.property_2());
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_1();
        boolean boolean3 = linkedList0.remove((java.lang.Object) true);
        boolean boolean5 = linkedList0.remove((java.lang.Object) 10.0d);
        boolean boolean6 = linkedList0.composedRepOK();
        linkedList0.clear();
        linkedList0.clear();
        java.lang.Object obj9 = null;
        boolean boolean10 = linkedList0.add(obj9);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_1();
        boolean boolean3 = linkedList0.remove((java.lang.Object) true);
        boolean boolean5 = linkedList0.remove((java.lang.Object) 10.0d);
        int int6 = linkedList0.size();
        boolean boolean7 = linkedList0.property_1();
        linkedList0.clear();
        linkedList0.clear();
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        boolean boolean11 = linkedList10.composedRepOK();
        boolean boolean13 = linkedList10.remove((java.lang.Object) 1.0d);
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        int int15 = linkedList14.size();
        int int16 = linkedList14.size();
        boolean boolean17 = linkedList14.property_1();
        int int18 = linkedList14.size();
        boolean boolean19 = linkedList10.remove((java.lang.Object) linkedList14);
        boolean boolean20 = linkedList14.property_1();
        boolean boolean21 = linkedList14.property_1();
        boolean boolean22 = linkedList0.add((java.lang.Object) boolean21);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        int int2 = linkedList0.size();
        boolean boolean3 = linkedList0.property_1();
        int int4 = linkedList0.size();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        boolean boolean6 = linkedList5.property_1();
        int int7 = linkedList5.size();
        int int8 = linkedList5.size();
        boolean boolean10 = linkedList5.remove((java.lang.Object) (byte) 0);
        linkedList5.clear();
        boolean boolean12 = linkedList0.remove((java.lang.Object) linkedList5);
        linkedList5.clear();
        linkedList5.clear();
        system.testclass.LinkedList linkedList15 = new system.testclass.LinkedList();
        boolean boolean16 = linkedList15.property_1();
        boolean boolean18 = linkedList15.remove((java.lang.Object) true);
        boolean boolean20 = linkedList15.remove((java.lang.Object) 10.0d);
        int int21 = linkedList15.size();
        boolean boolean22 = linkedList15.property_1();
        linkedList15.clear();
        int int24 = linkedList15.size();
        system.testclass.LinkedList linkedList25 = new system.testclass.LinkedList();
        boolean boolean26 = linkedList25.property_1();
        int int27 = linkedList25.size();
        java.lang.Object obj28 = null;
        boolean boolean29 = linkedList25.remove(obj28);
        boolean boolean30 = linkedList25.property_1();
        linkedList25.clear();
        boolean boolean32 = linkedList15.remove((java.lang.Object) linkedList25);
        system.testclass.LinkedList linkedList33 = new system.testclass.LinkedList();
        boolean boolean34 = linkedList33.composedRepOK();
        boolean boolean35 = linkedList33.property_1();
        linkedList33.clear();
        boolean boolean37 = linkedList33.composedRepOK();
        boolean boolean38 = linkedList25.remove((java.lang.Object) linkedList33);
        linkedList25.clear();
        boolean boolean40 = linkedList5.add((java.lang.Object) linkedList25);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList5", linkedList5.property_2());
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.composedRepOK();
        linkedList0.clear();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        boolean boolean5 = linkedList4.property_1();
        int int6 = linkedList4.size();
        int int7 = linkedList4.size();
        boolean boolean9 = linkedList4.remove((java.lang.Object) (byte) 0);
        boolean boolean10 = linkedList0.remove((java.lang.Object) linkedList4);
        boolean boolean11 = linkedList0.property_1();
        linkedList0.clear();
        boolean boolean14 = linkedList0.add((java.lang.Object) 10L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_1();
        boolean boolean3 = linkedList0.remove((java.lang.Object) true);
        linkedList0.clear();
        int int5 = linkedList0.size();
        linkedList0.clear();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        boolean boolean8 = linkedList7.composedRepOK();
        boolean boolean10 = linkedList7.remove((java.lang.Object) 1.0d);
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        int int12 = linkedList11.size();
        int int13 = linkedList11.size();
        boolean boolean14 = linkedList11.property_1();
        int int15 = linkedList11.size();
        system.testclass.LinkedList linkedList16 = new system.testclass.LinkedList();
        boolean boolean17 = linkedList16.composedRepOK();
        boolean boolean18 = linkedList16.composedRepOK();
        boolean boolean19 = linkedList16.composedRepOK();
        system.testclass.LinkedList linkedList20 = new system.testclass.LinkedList();
        int int21 = linkedList20.size();
        int int22 = linkedList20.size();
        boolean boolean23 = linkedList20.property_1();
        boolean boolean24 = linkedList16.remove((java.lang.Object) linkedList20);
        boolean boolean26 = linkedList20.remove((java.lang.Object) (-1));
        boolean boolean27 = linkedList11.remove((java.lang.Object) (-1));
        boolean boolean28 = linkedList7.remove((java.lang.Object) boolean27);
        boolean boolean29 = linkedList7.property_1();
        boolean boolean30 = linkedList7.property_1();
        boolean boolean31 = linkedList0.add((java.lang.Object) linkedList7);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.composedRepOK();
        boolean boolean3 = linkedList0.composedRepOK();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        boolean boolean5 = linkedList4.composedRepOK();
        boolean boolean6 = linkedList4.composedRepOK();
        boolean boolean7 = linkedList4.composedRepOK();
        boolean boolean9 = linkedList4.remove((java.lang.Object) (byte) 1);
        boolean boolean10 = linkedList4.composedRepOK();
        boolean boolean11 = linkedList0.remove((java.lang.Object) linkedList4);
        boolean boolean12 = linkedList0.property_1();
        int int13 = linkedList0.size();
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        boolean boolean15 = linkedList14.composedRepOK();
        boolean boolean16 = linkedList14.property_1();
        boolean boolean17 = linkedList14.property_1();
        linkedList14.clear();
        boolean boolean19 = linkedList14.property_1();
        boolean boolean20 = linkedList0.remove((java.lang.Object) boolean19);
        boolean boolean21 = linkedList0.composedRepOK();
        system.testclass.LinkedList linkedList22 = new system.testclass.LinkedList();
        boolean boolean23 = linkedList22.property_1();
        int int24 = linkedList22.size();
        int int25 = linkedList22.size();
        boolean boolean27 = linkedList22.remove((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass28 = linkedList22.getClass();
        boolean boolean29 = linkedList0.add((java.lang.Object) linkedList22);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        system.testclass.LinkedList linkedList2 = new system.testclass.LinkedList();
        int int3 = linkedList2.size();
        int int4 = linkedList2.size();
        boolean boolean5 = linkedList2.property_1();
        int int6 = linkedList2.size();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        boolean boolean8 = linkedList7.property_1();
        int int9 = linkedList7.size();
        int int10 = linkedList7.size();
        boolean boolean12 = linkedList7.remove((java.lang.Object) (byte) 0);
        linkedList7.clear();
        boolean boolean14 = linkedList2.remove((java.lang.Object) linkedList7);
        boolean boolean15 = linkedList2.composedRepOK();
        linkedList2.clear();
        boolean boolean17 = linkedList2.property_1();
        boolean boolean18 = linkedList0.add((java.lang.Object) linkedList2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.composedRepOK();
        int int3 = linkedList0.size();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        boolean boolean5 = linkedList4.composedRepOK();
        boolean boolean7 = linkedList4.remove((java.lang.Object) 1.0d);
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        int int9 = linkedList8.size();
        int int10 = linkedList8.size();
        boolean boolean11 = linkedList8.property_1();
        int int12 = linkedList8.size();
        boolean boolean13 = linkedList4.remove((java.lang.Object) linkedList8);
        java.lang.Class<?> wildcardClass14 = linkedList4.getClass();
        boolean boolean15 = linkedList0.add((java.lang.Object) linkedList4);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.composedRepOK();
        int int3 = linkedList0.size();
        int int4 = linkedList0.size();
        int int5 = linkedList0.size();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        int int7 = linkedList6.size();
        int int8 = linkedList6.size();
        boolean boolean9 = linkedList6.property_1();
        int int10 = linkedList6.size();
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        boolean boolean12 = linkedList11.property_1();
        int int13 = linkedList11.size();
        int int14 = linkedList11.size();
        boolean boolean16 = linkedList11.remove((java.lang.Object) (byte) 0);
        linkedList11.clear();
        boolean boolean18 = linkedList6.remove((java.lang.Object) linkedList11);
        linkedList6.clear();
        linkedList6.clear();
        boolean boolean21 = linkedList0.add((java.lang.Object) linkedList6);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_1();
        int int2 = linkedList0.size();
        boolean boolean3 = linkedList0.property_1();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean6 = linkedList0.property_1();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        boolean boolean8 = linkedList7.composedRepOK();
        boolean boolean9 = linkedList7.composedRepOK();
        boolean boolean10 = linkedList7.composedRepOK();
        boolean boolean12 = linkedList7.remove((java.lang.Object) (byte) 1);
        boolean boolean13 = linkedList7.property_1();
        int int14 = linkedList7.size();
        boolean boolean15 = linkedList0.remove((java.lang.Object) linkedList7);
        int int16 = linkedList0.size();
        system.testclass.LinkedList linkedList17 = new system.testclass.LinkedList();
        boolean boolean18 = linkedList17.composedRepOK();
        boolean boolean19 = linkedList17.property_1();
        linkedList17.clear();
        int int21 = linkedList17.size();
        boolean boolean22 = linkedList0.add((java.lang.Object) linkedList17);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.composedRepOK();
        int int3 = linkedList0.size();
        int int4 = linkedList0.size();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        boolean boolean6 = linkedList5.composedRepOK();
        boolean boolean7 = linkedList5.property_1();
        boolean boolean8 = linkedList5.property_1();
        boolean boolean9 = linkedList5.composedRepOK();
        boolean boolean10 = linkedList5.composedRepOK();
        boolean boolean11 = linkedList5.composedRepOK();
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        boolean boolean13 = linkedList12.property_1();
        boolean boolean14 = linkedList5.remove((java.lang.Object) linkedList12);
        boolean boolean15 = linkedList5.property_1();
        boolean boolean16 = linkedList5.property_1();
        boolean boolean17 = linkedList0.add((java.lang.Object) linkedList5);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.composedRepOK();
        boolean boolean3 = linkedList0.composedRepOK();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        int int5 = linkedList4.size();
        int int6 = linkedList4.size();
        boolean boolean7 = linkedList4.property_1();
        boolean boolean8 = linkedList0.remove((java.lang.Object) linkedList4);
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        boolean boolean10 = linkedList9.property_1();
        int int11 = linkedList9.size();
        int int12 = linkedList9.size();
        boolean boolean14 = linkedList9.remove((java.lang.Object) (byte) 0);
        boolean boolean15 = linkedList4.remove((java.lang.Object) (byte) 0);
        boolean boolean16 = linkedList4.composedRepOK();
        linkedList4.clear();
        boolean boolean18 = linkedList4.property_1();
        int int19 = linkedList4.size();
        int int20 = linkedList4.size();
        boolean boolean21 = linkedList4.property_1();
        system.testclass.LinkedList linkedList22 = new system.testclass.LinkedList();
        boolean boolean23 = linkedList22.property_1();
        int int24 = linkedList22.size();
        int int25 = linkedList22.size();
        boolean boolean27 = linkedList22.remove((java.lang.Object) (byte) 0);
        linkedList22.clear();
        boolean boolean29 = linkedList22.property_1();
        linkedList22.clear();
        boolean boolean31 = linkedList22.property_1();
        boolean boolean32 = linkedList4.remove((java.lang.Object) linkedList22);
        system.testclass.LinkedList linkedList33 = new system.testclass.LinkedList();
        boolean boolean34 = linkedList33.composedRepOK();
        boolean boolean35 = linkedList33.composedRepOK();
        boolean boolean36 = linkedList33.composedRepOK();
        boolean boolean38 = linkedList33.remove((java.lang.Object) (byte) 1);
        boolean boolean39 = linkedList33.composedRepOK();
        boolean boolean40 = linkedList33.property_1();
        boolean boolean41 = linkedList33.composedRepOK();
        boolean boolean42 = linkedList33.composedRepOK();
        boolean boolean43 = linkedList4.remove((java.lang.Object) linkedList33);
        system.testclass.LinkedList linkedList44 = new system.testclass.LinkedList();
        boolean boolean45 = linkedList44.property_1();
        boolean boolean47 = linkedList44.remove((java.lang.Object) true);
        linkedList44.clear();
        int int49 = linkedList44.size();
        linkedList44.clear();
        system.testclass.LinkedList linkedList51 = new system.testclass.LinkedList();
        boolean boolean52 = linkedList51.composedRepOK();
        boolean boolean53 = linkedList51.composedRepOK();
        boolean boolean54 = linkedList51.composedRepOK();
        boolean boolean56 = linkedList51.remove((java.lang.Object) (byte) 1);
        int int57 = linkedList51.size();
        boolean boolean58 = linkedList44.remove((java.lang.Object) linkedList51);
        int int59 = linkedList51.size();
        boolean boolean60 = linkedList33.add((java.lang.Object) linkedList51);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList33", linkedList33.property_2());
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.composedRepOK();
        boolean boolean3 = linkedList0.composedRepOK();
        boolean boolean5 = linkedList0.remove((java.lang.Object) (byte) 1);
        boolean boolean6 = linkedList0.composedRepOK();
        int int7 = linkedList0.size();
        int int8 = linkedList0.size();
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        int int10 = linkedList9.size();
        int int11 = linkedList9.size();
        boolean boolean12 = linkedList9.property_1();
        int int13 = linkedList9.size();
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        boolean boolean15 = linkedList14.property_1();
        int int16 = linkedList14.size();
        int int17 = linkedList14.size();
        boolean boolean19 = linkedList14.remove((java.lang.Object) (byte) 0);
        linkedList14.clear();
        boolean boolean21 = linkedList9.remove((java.lang.Object) linkedList14);
        linkedList14.clear();
        system.testclass.LinkedList linkedList23 = new system.testclass.LinkedList();
        boolean boolean24 = linkedList23.composedRepOK();
        boolean boolean25 = linkedList23.composedRepOK();
        linkedList23.clear();
        boolean boolean27 = linkedList23.property_1();
        boolean boolean28 = linkedList23.property_1();
        linkedList23.clear();
        boolean boolean30 = linkedList23.property_1();
        boolean boolean31 = linkedList23.property_1();
        boolean boolean32 = linkedList14.remove((java.lang.Object) linkedList23);
        system.testclass.LinkedList linkedList33 = new system.testclass.LinkedList();
        boolean boolean34 = linkedList33.property_1();
        boolean boolean35 = linkedList14.remove((java.lang.Object) linkedList33);
        boolean boolean36 = linkedList0.add((java.lang.Object) linkedList33);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_1();
        boolean boolean3 = linkedList0.remove((java.lang.Object) true);
        linkedList0.clear();
        int int5 = linkedList0.size();
        linkedList0.clear();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        boolean boolean8 = linkedList7.composedRepOK();
        boolean boolean9 = linkedList7.composedRepOK();
        boolean boolean10 = linkedList7.composedRepOK();
        boolean boolean12 = linkedList7.remove((java.lang.Object) (byte) 1);
        int int13 = linkedList7.size();
        boolean boolean14 = linkedList0.remove((java.lang.Object) linkedList7);
        system.testclass.LinkedList linkedList15 = new system.testclass.LinkedList();
        boolean boolean16 = linkedList15.composedRepOK();
        boolean boolean17 = linkedList15.composedRepOK();
        linkedList15.clear();
        boolean boolean19 = linkedList7.remove((java.lang.Object) linkedList15);
        int int20 = linkedList7.size();
        system.testclass.LinkedList linkedList21 = new system.testclass.LinkedList();
        boolean boolean22 = linkedList21.composedRepOK();
        boolean boolean23 = linkedList21.composedRepOK();
        boolean boolean24 = linkedList21.composedRepOK();
        system.testclass.LinkedList linkedList25 = new system.testclass.LinkedList();
        int int26 = linkedList25.size();
        int int27 = linkedList25.size();
        boolean boolean28 = linkedList25.property_1();
        boolean boolean29 = linkedList21.remove((java.lang.Object) linkedList25);
        system.testclass.LinkedList linkedList30 = new system.testclass.LinkedList();
        boolean boolean31 = linkedList30.composedRepOK();
        boolean boolean32 = linkedList30.composedRepOK();
        boolean boolean33 = linkedList21.remove((java.lang.Object) boolean32);
        boolean boolean34 = linkedList7.add((java.lang.Object) boolean32);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList7", linkedList7.property_2());
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        int int2 = linkedList0.size();
        boolean boolean3 = linkedList0.property_1();
        int int4 = linkedList0.size();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        boolean boolean6 = linkedList5.property_1();
        int int7 = linkedList5.size();
        int int8 = linkedList5.size();
        boolean boolean10 = linkedList5.remove((java.lang.Object) (byte) 0);
        linkedList5.clear();
        boolean boolean12 = linkedList0.remove((java.lang.Object) linkedList5);
        linkedList5.clear();
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        int int15 = linkedList14.size();
        system.testclass.LinkedList linkedList16 = new system.testclass.LinkedList();
        int int17 = linkedList16.size();
        int int18 = linkedList16.size();
        boolean boolean19 = linkedList14.remove((java.lang.Object) int18);
        boolean boolean20 = linkedList5.remove((java.lang.Object) boolean19);
        linkedList5.clear();
        system.testclass.LinkedList linkedList22 = new system.testclass.LinkedList();
        boolean boolean23 = linkedList22.composedRepOK();
        boolean boolean24 = linkedList22.composedRepOK();
        boolean boolean25 = linkedList22.composedRepOK();
        system.testclass.LinkedList linkedList26 = new system.testclass.LinkedList();
        int int27 = linkedList26.size();
        int int28 = linkedList26.size();
        boolean boolean29 = linkedList26.property_1();
        boolean boolean30 = linkedList22.remove((java.lang.Object) linkedList26);
        system.testclass.LinkedList linkedList31 = new system.testclass.LinkedList();
        boolean boolean32 = linkedList31.property_1();
        int int33 = linkedList31.size();
        int int34 = linkedList31.size();
        boolean boolean36 = linkedList31.remove((java.lang.Object) (byte) 0);
        boolean boolean37 = linkedList26.remove((java.lang.Object) (byte) 0);
        boolean boolean38 = linkedList26.composedRepOK();
        linkedList26.clear();
        boolean boolean40 = linkedList26.property_1();
        linkedList26.clear();
        boolean boolean42 = linkedList5.add((java.lang.Object) linkedList26);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList5", linkedList5.property_2());
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_1();
        boolean boolean3 = linkedList0.remove((java.lang.Object) true);
        linkedList0.clear();
        int int5 = linkedList0.size();
        boolean boolean6 = linkedList0.property_1();
        int int7 = linkedList0.size();
        boolean boolean8 = linkedList0.property_1();
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        boolean boolean10 = linkedList9.property_1();
        boolean boolean12 = linkedList9.remove((java.lang.Object) true);
        boolean boolean14 = linkedList9.remove((java.lang.Object) 10.0d);
        int int15 = linkedList9.size();
        boolean boolean16 = linkedList9.property_1();
        linkedList9.clear();
        linkedList9.clear();
        boolean boolean19 = linkedList9.property_1();
        int int20 = linkedList9.size();
        system.testclass.LinkedList linkedList21 = new system.testclass.LinkedList();
        boolean boolean22 = linkedList21.composedRepOK();
        boolean boolean23 = linkedList21.property_1();
        boolean boolean24 = linkedList21.composedRepOK();
        boolean boolean25 = linkedList9.remove((java.lang.Object) boolean24);
        boolean boolean26 = linkedList0.add((java.lang.Object) boolean24);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        int int2 = linkedList0.size();
        boolean boolean3 = linkedList0.property_1();
        int int4 = linkedList0.size();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        boolean boolean6 = linkedList5.property_1();
        int int7 = linkedList5.size();
        int int8 = linkedList5.size();
        boolean boolean10 = linkedList5.remove((java.lang.Object) (byte) 0);
        linkedList5.clear();
        boolean boolean12 = linkedList0.remove((java.lang.Object) linkedList5);
        boolean boolean13 = linkedList0.composedRepOK();
        linkedList0.clear();
        boolean boolean15 = linkedList0.property_1();
        system.testclass.LinkedList linkedList16 = new system.testclass.LinkedList();
        boolean boolean17 = linkedList16.property_1();
        int int18 = linkedList16.size();
        boolean boolean19 = linkedList16.property_1();
        linkedList16.clear();
        boolean boolean21 = linkedList16.property_1();
        boolean boolean22 = linkedList16.composedRepOK();
        boolean boolean23 = linkedList0.add((java.lang.Object) linkedList16);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.composedRepOK();
        boolean boolean3 = linkedList0.composedRepOK();
        boolean boolean5 = linkedList0.remove((java.lang.Object) (byte) 1);
        boolean boolean6 = linkedList0.composedRepOK();
        boolean boolean7 = linkedList0.property_1();
        int int8 = linkedList0.size();
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        boolean boolean10 = linkedList9.property_1();
        int int11 = linkedList9.size();
        java.lang.Object obj12 = null;
        boolean boolean13 = linkedList9.remove(obj12);
        linkedList9.clear();
        boolean boolean15 = linkedList9.property_1();
        boolean boolean16 = linkedList9.property_1();
        boolean boolean17 = linkedList9.property_1();
        boolean boolean18 = linkedList0.add((java.lang.Object) boolean17);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        int int2 = linkedList0.size();
        boolean boolean3 = linkedList0.property_1();
        int int4 = linkedList0.size();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        boolean boolean6 = linkedList5.property_1();
        int int7 = linkedList5.size();
        java.lang.Object obj8 = null;
        boolean boolean9 = linkedList5.remove(obj8);
        boolean boolean11 = linkedList5.remove((java.lang.Object) 1.0f);
        boolean boolean12 = linkedList0.remove((java.lang.Object) boolean11);
        linkedList0.clear();
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        boolean boolean15 = linkedList14.property_1();
        boolean boolean17 = linkedList14.remove((java.lang.Object) true);
        linkedList14.clear();
        int int19 = linkedList14.size();
        boolean boolean20 = linkedList14.property_1();
        int int21 = linkedList14.size();
        boolean boolean22 = linkedList14.property_1();
        boolean boolean23 = linkedList0.add((java.lang.Object) linkedList14);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        int int2 = linkedList0.size();
        boolean boolean3 = linkedList0.property_1();
        int int4 = linkedList0.size();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        boolean boolean6 = linkedList5.property_1();
        int int7 = linkedList5.size();
        java.lang.Object obj8 = null;
        boolean boolean9 = linkedList5.remove(obj8);
        boolean boolean11 = linkedList5.remove((java.lang.Object) 1.0f);
        boolean boolean12 = linkedList0.remove((java.lang.Object) boolean11);
        java.lang.Object obj13 = null;
        boolean boolean14 = linkedList0.remove(obj13);
        int int15 = linkedList0.size();
        system.testclass.LinkedList linkedList16 = new system.testclass.LinkedList();
        boolean boolean17 = linkedList16.composedRepOK();
        boolean boolean18 = linkedList16.composedRepOK();
        linkedList16.clear();
        boolean boolean20 = linkedList16.property_1();
        boolean boolean21 = linkedList0.remove((java.lang.Object) boolean20);
        linkedList0.clear();
        system.testclass.LinkedList linkedList23 = new system.testclass.LinkedList();
        boolean boolean24 = linkedList23.composedRepOK();
        boolean boolean25 = linkedList23.property_1();
        boolean boolean26 = linkedList23.property_1();
        linkedList23.clear();
        boolean boolean28 = linkedList0.remove((java.lang.Object) linkedList23);
        system.testclass.LinkedList linkedList29 = new system.testclass.LinkedList();
        boolean boolean30 = linkedList29.composedRepOK();
        boolean boolean31 = linkedList29.composedRepOK();
        boolean boolean32 = linkedList29.composedRepOK();
        system.testclass.LinkedList linkedList33 = new system.testclass.LinkedList();
        int int34 = linkedList33.size();
        int int35 = linkedList33.size();
        boolean boolean36 = linkedList33.property_1();
        boolean boolean37 = linkedList29.remove((java.lang.Object) linkedList33);
        system.testclass.LinkedList linkedList38 = new system.testclass.LinkedList();
        boolean boolean39 = linkedList38.property_1();
        int int40 = linkedList38.size();
        int int41 = linkedList38.size();
        boolean boolean43 = linkedList38.remove((java.lang.Object) (byte) 0);
        boolean boolean44 = linkedList33.remove((java.lang.Object) (byte) 0);
        boolean boolean45 = linkedList33.composedRepOK();
        linkedList33.clear();
        boolean boolean47 = linkedList33.property_1();
        int int48 = linkedList33.size();
        int int49 = linkedList33.size();
        boolean boolean50 = linkedList33.property_1();
        boolean boolean51 = linkedList23.add((java.lang.Object) boolean50);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList23", linkedList23.property_2());
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.property_1();
        linkedList0.clear();
        boolean boolean4 = linkedList0.composedRepOK();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        int int6 = linkedList5.size();
        int int7 = linkedList5.size();
        boolean boolean8 = linkedList5.property_1();
        int int9 = linkedList5.size();
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        boolean boolean11 = linkedList10.property_1();
        int int12 = linkedList10.size();
        int int13 = linkedList10.size();
        boolean boolean15 = linkedList10.remove((java.lang.Object) (byte) 0);
        linkedList10.clear();
        boolean boolean17 = linkedList5.remove((java.lang.Object) linkedList10);
        linkedList5.clear();
        boolean boolean19 = linkedList0.add((java.lang.Object) linkedList5);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.composedRepOK();
        boolean boolean3 = linkedList0.composedRepOK();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        boolean boolean5 = linkedList4.composedRepOK();
        boolean boolean6 = linkedList4.composedRepOK();
        boolean boolean7 = linkedList4.composedRepOK();
        boolean boolean9 = linkedList4.remove((java.lang.Object) (byte) 1);
        boolean boolean10 = linkedList4.composedRepOK();
        boolean boolean11 = linkedList0.remove((java.lang.Object) linkedList4);
        boolean boolean12 = linkedList0.property_1();
        int int13 = linkedList0.size();
        boolean boolean14 = linkedList0.property_1();
        system.testclass.LinkedList linkedList15 = new system.testclass.LinkedList();
        boolean boolean16 = linkedList15.property_1();
        int int17 = linkedList15.size();
        int int18 = linkedList15.size();
        boolean boolean19 = linkedList15.composedRepOK();
        boolean boolean20 = linkedList15.composedRepOK();
        boolean boolean21 = linkedList0.remove((java.lang.Object) linkedList15);
        int int22 = linkedList0.size();
        system.testclass.LinkedList linkedList23 = new system.testclass.LinkedList();
        boolean boolean24 = linkedList23.property_1();
        int int25 = linkedList23.size();
        int int26 = linkedList23.size();
        boolean boolean27 = linkedList23.composedRepOK();
        boolean boolean28 = linkedList23.composedRepOK();
        linkedList23.clear();
        linkedList23.clear();
        system.testclass.LinkedList linkedList31 = new system.testclass.LinkedList();
        boolean boolean32 = linkedList31.property_1();
        int int33 = linkedList31.size();
        boolean boolean34 = linkedList31.property_1();
        system.testclass.LinkedList linkedList35 = new system.testclass.LinkedList();
        int int36 = linkedList35.size();
        int int37 = linkedList35.size();
        boolean boolean38 = linkedList35.property_1();
        int int39 = linkedList35.size();
        system.testclass.LinkedList linkedList40 = new system.testclass.LinkedList();
        boolean boolean41 = linkedList40.property_1();
        int int42 = linkedList40.size();
        java.lang.Object obj43 = null;
        boolean boolean44 = linkedList40.remove(obj43);
        boolean boolean46 = linkedList40.remove((java.lang.Object) 1.0f);
        boolean boolean47 = linkedList35.remove((java.lang.Object) boolean46);
        java.lang.Object obj48 = null;
        boolean boolean49 = linkedList35.remove(obj48);
        int int50 = linkedList35.size();
        boolean boolean51 = linkedList31.remove((java.lang.Object) linkedList35);
        system.testclass.LinkedList linkedList52 = new system.testclass.LinkedList();
        boolean boolean53 = linkedList52.property_1();
        int int54 = linkedList52.size();
        int int55 = linkedList52.size();
        boolean boolean56 = linkedList31.remove((java.lang.Object) linkedList52);
        boolean boolean57 = linkedList23.remove((java.lang.Object) boolean56);
        linkedList23.clear();
        int int59 = linkedList23.size();
        boolean boolean60 = linkedList0.add((java.lang.Object) linkedList23);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_1();
        int int2 = linkedList0.size();
        int int3 = linkedList0.size();
        boolean boolean5 = linkedList0.remove((java.lang.Object) (byte) 0);
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        boolean boolean7 = linkedList6.property_1();
        boolean boolean9 = linkedList6.remove((java.lang.Object) true);
        linkedList6.clear();
        int int11 = linkedList6.size();
        boolean boolean12 = linkedList6.property_1();
        int int13 = linkedList6.size();
        boolean boolean14 = linkedList0.add((java.lang.Object) linkedList6);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_1();
        boolean boolean3 = linkedList0.remove((java.lang.Object) true);
        boolean boolean5 = linkedList0.remove((java.lang.Object) 10.0d);
        boolean boolean6 = linkedList0.composedRepOK();
        boolean boolean7 = linkedList0.composedRepOK();
        linkedList0.clear();
        boolean boolean10 = linkedList0.add((java.lang.Object) (-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_1();
        boolean boolean3 = linkedList0.remove((java.lang.Object) true);
        linkedList0.clear();
        int int5 = linkedList0.size();
        linkedList0.clear();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        boolean boolean8 = linkedList7.composedRepOK();
        boolean boolean9 = linkedList7.composedRepOK();
        boolean boolean10 = linkedList7.composedRepOK();
        boolean boolean12 = linkedList7.remove((java.lang.Object) (byte) 1);
        int int13 = linkedList7.size();
        boolean boolean14 = linkedList0.remove((java.lang.Object) linkedList7);
        linkedList7.clear();
        int int16 = linkedList7.size();
        system.testclass.LinkedList linkedList17 = new system.testclass.LinkedList();
        int int18 = linkedList17.size();
        int int19 = linkedList17.size();
        boolean boolean20 = linkedList17.property_1();
        int int21 = linkedList17.size();
        system.testclass.LinkedList linkedList22 = new system.testclass.LinkedList();
        boolean boolean23 = linkedList22.property_1();
        int int24 = linkedList22.size();
        java.lang.Object obj25 = null;
        boolean boolean26 = linkedList22.remove(obj25);
        boolean boolean28 = linkedList22.remove((java.lang.Object) 1.0f);
        boolean boolean29 = linkedList17.remove((java.lang.Object) boolean28);
        java.lang.Object obj30 = null;
        boolean boolean31 = linkedList17.remove(obj30);
        int int32 = linkedList17.size();
        boolean boolean33 = linkedList7.add((java.lang.Object) int32);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList7", linkedList7.property_2());
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_1();
        int int2 = linkedList0.size();
        java.lang.Object obj3 = null;
        boolean boolean4 = linkedList0.remove(obj3);
        linkedList0.clear();
        boolean boolean6 = linkedList0.property_1();
        linkedList0.clear();
        java.lang.Object obj8 = null;
        boolean boolean9 = linkedList0.remove(obj8);
        int int10 = linkedList0.size();
        boolean boolean11 = linkedList0.property_1();
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        boolean boolean13 = linkedList12.property_1();
        boolean boolean15 = linkedList12.remove((java.lang.Object) true);
        linkedList12.clear();
        int int17 = linkedList12.size();
        linkedList12.clear();
        system.testclass.LinkedList linkedList19 = new system.testclass.LinkedList();
        boolean boolean20 = linkedList19.composedRepOK();
        boolean boolean21 = linkedList19.composedRepOK();
        boolean boolean22 = linkedList19.composedRepOK();
        boolean boolean24 = linkedList19.remove((java.lang.Object) (byte) 1);
        int int25 = linkedList19.size();
        boolean boolean26 = linkedList12.remove((java.lang.Object) linkedList19);
        linkedList19.clear();
        int int28 = linkedList19.size();
        boolean boolean29 = linkedList0.add((java.lang.Object) linkedList19);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.property_1();
        linkedList0.clear();
        int int4 = linkedList0.size();
        linkedList0.clear();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        boolean boolean7 = linkedList6.property_1();
        boolean boolean9 = linkedList6.remove((java.lang.Object) true);
        boolean boolean11 = linkedList6.remove((java.lang.Object) 10.0d);
        int int12 = linkedList6.size();
        boolean boolean13 = linkedList6.property_1();
        linkedList6.clear();
        int int15 = linkedList6.size();
        system.testclass.LinkedList linkedList16 = new system.testclass.LinkedList();
        boolean boolean17 = linkedList16.property_1();
        int int18 = linkedList16.size();
        java.lang.Object obj19 = null;
        boolean boolean20 = linkedList16.remove(obj19);
        boolean boolean21 = linkedList16.property_1();
        linkedList16.clear();
        boolean boolean23 = linkedList6.remove((java.lang.Object) linkedList16);
        system.testclass.LinkedList linkedList24 = new system.testclass.LinkedList();
        boolean boolean25 = linkedList24.composedRepOK();
        boolean boolean26 = linkedList24.property_1();
        linkedList24.clear();
        boolean boolean28 = linkedList24.composedRepOK();
        boolean boolean29 = linkedList16.remove((java.lang.Object) linkedList24);
        system.testclass.LinkedList linkedList30 = new system.testclass.LinkedList();
        boolean boolean31 = linkedList30.composedRepOK();
        boolean boolean32 = linkedList30.composedRepOK();
        linkedList30.clear();
        boolean boolean34 = linkedList30.property_1();
        boolean boolean35 = linkedList30.property_1();
        linkedList30.clear();
        int int37 = linkedList30.size();
        boolean boolean38 = linkedList24.remove((java.lang.Object) int37);
        boolean boolean39 = linkedList0.add((java.lang.Object) boolean38);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.composedRepOK();
        linkedList0.clear();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        boolean boolean5 = linkedList4.composedRepOK();
        boolean boolean7 = linkedList4.remove((java.lang.Object) 1.0d);
        linkedList4.clear();
        boolean boolean9 = linkedList4.composedRepOK();
        boolean boolean10 = linkedList0.add((java.lang.Object) linkedList4);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        int int2 = linkedList0.size();
        boolean boolean3 = linkedList0.property_1();
        int int4 = linkedList0.size();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        boolean boolean6 = linkedList5.property_1();
        int int7 = linkedList5.size();
        int int8 = linkedList5.size();
        boolean boolean10 = linkedList5.remove((java.lang.Object) (byte) 0);
        linkedList5.clear();
        boolean boolean12 = linkedList0.remove((java.lang.Object) linkedList5);
        boolean boolean13 = linkedList0.composedRepOK();
        linkedList0.clear();
        system.testclass.LinkedList linkedList15 = new system.testclass.LinkedList();
        boolean boolean16 = linkedList15.composedRepOK();
        boolean boolean17 = linkedList15.composedRepOK();
        boolean boolean18 = linkedList0.add((java.lang.Object) linkedList15);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.composedRepOK();
        linkedList0.clear();
        boolean boolean4 = linkedList0.property_1();
        boolean boolean5 = linkedList0.property_1();
        linkedList0.clear();
        boolean boolean7 = linkedList0.property_1();
        boolean boolean8 = linkedList0.property_1();
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        boolean boolean10 = linkedList9.property_1();
        int int11 = linkedList9.size();
        java.lang.Object obj12 = null;
        boolean boolean13 = linkedList9.remove(obj12);
        linkedList9.clear();
        boolean boolean15 = linkedList9.property_1();
        boolean boolean16 = linkedList9.property_1();
        boolean boolean17 = linkedList0.add((java.lang.Object) linkedList9);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_1();
        boolean boolean3 = linkedList0.remove((java.lang.Object) true);
        boolean boolean5 = linkedList0.remove((java.lang.Object) 10.0d);
        int int6 = linkedList0.size();
        boolean boolean7 = linkedList0.property_1();
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean10 = linkedList0.property_1();
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        boolean boolean12 = linkedList11.property_1();
        int int13 = linkedList11.size();
        int int14 = linkedList11.size();
        boolean boolean16 = linkedList11.remove((java.lang.Object) (byte) 0);
        linkedList11.clear();
        boolean boolean18 = linkedList11.composedRepOK();
        linkedList11.clear();
        boolean boolean20 = linkedList0.add((java.lang.Object) linkedList11);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.composedRepOK();
        linkedList0.clear();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        boolean boolean5 = linkedList4.property_1();
        int int6 = linkedList4.size();
        int int7 = linkedList4.size();
        boolean boolean9 = linkedList4.remove((java.lang.Object) (byte) 0);
        boolean boolean10 = linkedList0.remove((java.lang.Object) linkedList4);
        boolean boolean11 = linkedList4.property_1();
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        boolean boolean13 = linkedList12.property_1();
        int int14 = linkedList12.size();
        java.lang.Object obj15 = null;
        boolean boolean16 = linkedList12.remove(obj15);
        boolean boolean18 = linkedList12.remove((java.lang.Object) 1.0f);
        linkedList12.clear();
        java.lang.Class<?> wildcardClass20 = linkedList12.getClass();
        boolean boolean21 = linkedList4.add((java.lang.Object) wildcardClass20);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList4", linkedList4.property_2());
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.composedRepOK();
        boolean boolean3 = linkedList0.composedRepOK();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        boolean boolean5 = linkedList4.composedRepOK();
        boolean boolean6 = linkedList4.composedRepOK();
        boolean boolean7 = linkedList4.composedRepOK();
        boolean boolean9 = linkedList4.remove((java.lang.Object) (byte) 1);
        boolean boolean10 = linkedList4.composedRepOK();
        boolean boolean11 = linkedList0.remove((java.lang.Object) linkedList4);
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        boolean boolean13 = linkedList12.composedRepOK();
        boolean boolean14 = linkedList12.composedRepOK();
        linkedList12.clear();
        system.testclass.LinkedList linkedList16 = new system.testclass.LinkedList();
        boolean boolean17 = linkedList16.property_1();
        int int18 = linkedList16.size();
        int int19 = linkedList16.size();
        boolean boolean21 = linkedList16.remove((java.lang.Object) (byte) 0);
        boolean boolean22 = linkedList12.remove((java.lang.Object) linkedList16);
        boolean boolean23 = linkedList0.remove((java.lang.Object) linkedList16);
        system.testclass.LinkedList linkedList24 = new system.testclass.LinkedList();
        boolean boolean25 = linkedList24.composedRepOK();
        boolean boolean26 = linkedList24.composedRepOK();
        boolean boolean27 = linkedList24.composedRepOK();
        boolean boolean29 = linkedList24.remove((java.lang.Object) (byte) 1);
        boolean boolean30 = linkedList24.composedRepOK();
        int int31 = linkedList24.size();
        boolean boolean32 = linkedList16.remove((java.lang.Object) int31);
        system.testclass.LinkedList linkedList33 = new system.testclass.LinkedList();
        boolean boolean34 = linkedList33.property_1();
        int int35 = linkedList33.size();
        boolean boolean36 = linkedList33.property_1();
        system.testclass.LinkedList linkedList37 = new system.testclass.LinkedList();
        int int38 = linkedList37.size();
        int int39 = linkedList37.size();
        boolean boolean40 = linkedList37.property_1();
        int int41 = linkedList37.size();
        system.testclass.LinkedList linkedList42 = new system.testclass.LinkedList();
        boolean boolean43 = linkedList42.property_1();
        int int44 = linkedList42.size();
        java.lang.Object obj45 = null;
        boolean boolean46 = linkedList42.remove(obj45);
        boolean boolean48 = linkedList42.remove((java.lang.Object) 1.0f);
        boolean boolean49 = linkedList37.remove((java.lang.Object) boolean48);
        java.lang.Object obj50 = null;
        boolean boolean51 = linkedList37.remove(obj50);
        int int52 = linkedList37.size();
        boolean boolean53 = linkedList33.remove((java.lang.Object) linkedList37);
        java.lang.Class<?> wildcardClass54 = linkedList33.getClass();
        boolean boolean55 = linkedList16.add((java.lang.Object) linkedList33);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList16", linkedList16.property_2());
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.composedRepOK();
        boolean boolean3 = linkedList0.composedRepOK();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        boolean boolean5 = linkedList4.composedRepOK();
        boolean boolean6 = linkedList4.composedRepOK();
        boolean boolean7 = linkedList4.composedRepOK();
        boolean boolean9 = linkedList4.remove((java.lang.Object) (byte) 1);
        boolean boolean10 = linkedList4.composedRepOK();
        boolean boolean11 = linkedList0.remove((java.lang.Object) linkedList4);
        boolean boolean12 = linkedList0.property_1();
        int int13 = linkedList0.size();
        boolean boolean14 = linkedList0.property_1();
        system.testclass.LinkedList linkedList15 = new system.testclass.LinkedList();
        boolean boolean16 = linkedList15.property_1();
        int int17 = linkedList15.size();
        int int18 = linkedList15.size();
        boolean boolean19 = linkedList15.composedRepOK();
        boolean boolean20 = linkedList15.composedRepOK();
        boolean boolean21 = linkedList0.remove((java.lang.Object) linkedList15);
        boolean boolean22 = linkedList0.property_1();
        boolean boolean23 = linkedList0.composedRepOK();
        system.testclass.LinkedList linkedList24 = new system.testclass.LinkedList();
        boolean boolean25 = linkedList24.property_1();
        boolean boolean27 = linkedList24.remove((java.lang.Object) true);
        boolean boolean29 = linkedList24.remove((java.lang.Object) 10.0d);
        int int30 = linkedList24.size();
        boolean boolean31 = linkedList24.property_1();
        linkedList24.clear();
        linkedList24.clear();
        boolean boolean34 = linkedList24.property_1();
        int int35 = linkedList24.size();
        java.lang.Class<?> wildcardClass36 = linkedList24.getClass();
        boolean boolean37 = linkedList0.add((java.lang.Object) linkedList24);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.composedRepOK();
        boolean boolean3 = linkedList0.composedRepOK();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        int int5 = linkedList4.size();
        int int6 = linkedList4.size();
        boolean boolean7 = linkedList4.property_1();
        boolean boolean8 = linkedList0.remove((java.lang.Object) linkedList4);
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        boolean boolean10 = linkedList9.property_1();
        int int11 = linkedList9.size();
        int int12 = linkedList9.size();
        boolean boolean14 = linkedList9.remove((java.lang.Object) (byte) 0);
        boolean boolean15 = linkedList4.remove((java.lang.Object) (byte) 0);
        system.testclass.LinkedList linkedList16 = new system.testclass.LinkedList();
        int int17 = linkedList16.size();
        boolean boolean18 = linkedList16.composedRepOK();
        boolean boolean19 = linkedList4.remove((java.lang.Object) boolean18);
        boolean boolean20 = linkedList4.property_1();
        boolean boolean22 = linkedList4.add((java.lang.Object) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList4", linkedList4.property_2());
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.composedRepOK();
        boolean boolean3 = linkedList0.composedRepOK();
        linkedList0.clear();
        boolean boolean5 = linkedList0.composedRepOK();
        boolean boolean6 = linkedList0.composedRepOK();
        boolean boolean7 = linkedList0.composedRepOK();
        boolean boolean8 = linkedList0.composedRepOK();
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        boolean boolean10 = linkedList9.composedRepOK();
        boolean boolean11 = linkedList9.composedRepOK();
        linkedList9.clear();
        system.testclass.LinkedList linkedList13 = new system.testclass.LinkedList();
        boolean boolean14 = linkedList13.property_1();
        int int15 = linkedList13.size();
        int int16 = linkedList13.size();
        boolean boolean18 = linkedList13.remove((java.lang.Object) (byte) 0);
        boolean boolean19 = linkedList9.remove((java.lang.Object) linkedList13);
        boolean boolean20 = linkedList0.add((java.lang.Object) linkedList9);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.composedRepOK();
        boolean boolean3 = linkedList0.composedRepOK();
        linkedList0.clear();
        boolean boolean5 = linkedList0.composedRepOK();
        boolean boolean6 = linkedList0.composedRepOK();
        boolean boolean7 = linkedList0.composedRepOK();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        boolean boolean9 = linkedList8.property_1();
        int int10 = linkedList8.size();
        int int11 = linkedList8.size();
        boolean boolean13 = linkedList8.remove((java.lang.Object) (byte) 0);
        linkedList8.clear();
        boolean boolean15 = linkedList8.composedRepOK();
        system.testclass.LinkedList linkedList16 = new system.testclass.LinkedList();
        boolean boolean17 = linkedList16.composedRepOK();
        boolean boolean18 = linkedList16.composedRepOK();
        boolean boolean19 = linkedList16.composedRepOK();
        boolean boolean21 = linkedList16.remove((java.lang.Object) (byte) 1);
        boolean boolean22 = linkedList16.composedRepOK();
        int int23 = linkedList16.size();
        boolean boolean24 = linkedList8.remove((java.lang.Object) int23);
        boolean boolean25 = linkedList0.add((java.lang.Object) int23);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        int int2 = linkedList0.size();
        boolean boolean3 = linkedList0.property_1();
        int int4 = linkedList0.size();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        boolean boolean6 = linkedList5.property_1();
        int int7 = linkedList5.size();
        java.lang.Object obj8 = null;
        boolean boolean9 = linkedList5.remove(obj8);
        boolean boolean11 = linkedList5.remove((java.lang.Object) 1.0f);
        boolean boolean12 = linkedList0.remove((java.lang.Object) boolean11);
        system.testclass.LinkedList linkedList13 = new system.testclass.LinkedList();
        boolean boolean14 = linkedList13.property_1();
        boolean boolean16 = linkedList13.remove((java.lang.Object) true);
        boolean boolean18 = linkedList13.remove((java.lang.Object) 10.0d);
        linkedList13.clear();
        system.testclass.LinkedList linkedList20 = new system.testclass.LinkedList();
        boolean boolean21 = linkedList20.composedRepOK();
        boolean boolean22 = linkedList20.composedRepOK();
        boolean boolean23 = linkedList20.composedRepOK();
        system.testclass.LinkedList linkedList24 = new system.testclass.LinkedList();
        boolean boolean25 = linkedList24.composedRepOK();
        boolean boolean26 = linkedList24.composedRepOK();
        boolean boolean27 = linkedList24.composedRepOK();
        boolean boolean29 = linkedList24.remove((java.lang.Object) (byte) 1);
        boolean boolean30 = linkedList24.composedRepOK();
        boolean boolean31 = linkedList20.remove((java.lang.Object) linkedList24);
        boolean boolean32 = linkedList20.property_1();
        int int33 = linkedList20.size();
        boolean boolean34 = linkedList20.property_1();
        int int35 = linkedList20.size();
        boolean boolean36 = linkedList13.remove((java.lang.Object) linkedList20);
        boolean boolean37 = linkedList0.add((java.lang.Object) linkedList20);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        int int2 = linkedList0.size();
        boolean boolean3 = linkedList0.property_1();
        int int4 = linkedList0.size();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        boolean boolean6 = linkedList5.property_1();
        int int7 = linkedList5.size();
        int int8 = linkedList5.size();
        boolean boolean10 = linkedList5.remove((java.lang.Object) (byte) 0);
        linkedList5.clear();
        boolean boolean12 = linkedList0.remove((java.lang.Object) linkedList5);
        linkedList5.clear();
        linkedList5.clear();
        linkedList5.clear();
        linkedList5.clear();
        system.testclass.LinkedList linkedList17 = new system.testclass.LinkedList();
        boolean boolean18 = linkedList17.composedRepOK();
        boolean boolean20 = linkedList17.remove((java.lang.Object) 1.0d);
        linkedList17.clear();
        boolean boolean22 = linkedList17.property_1();
        boolean boolean23 = linkedList5.add((java.lang.Object) linkedList17);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList5", linkedList5.property_2());
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.composedRepOK();
        boolean boolean3 = linkedList0.composedRepOK();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        int int5 = linkedList4.size();
        int int6 = linkedList4.size();
        boolean boolean7 = linkedList4.property_1();
        boolean boolean8 = linkedList0.remove((java.lang.Object) linkedList4);
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        boolean boolean10 = linkedList9.property_1();
        int int11 = linkedList9.size();
        int int12 = linkedList9.size();
        boolean boolean14 = linkedList9.remove((java.lang.Object) (byte) 0);
        boolean boolean15 = linkedList4.remove((java.lang.Object) (byte) 0);
        system.testclass.LinkedList linkedList16 = new system.testclass.LinkedList();
        int int17 = linkedList16.size();
        boolean boolean18 = linkedList16.composedRepOK();
        boolean boolean19 = linkedList4.remove((java.lang.Object) boolean18);
        boolean boolean20 = linkedList4.property_1();
        system.testclass.LinkedList linkedList21 = new system.testclass.LinkedList();
        boolean boolean22 = linkedList21.property_1();
        boolean boolean24 = linkedList21.remove((java.lang.Object) true);
        boolean boolean26 = linkedList21.remove((java.lang.Object) 10.0d);
        int int27 = linkedList21.size();
        boolean boolean28 = linkedList21.property_1();
        linkedList21.clear();
        int int30 = linkedList21.size();
        system.testclass.LinkedList linkedList31 = new system.testclass.LinkedList();
        boolean boolean32 = linkedList31.property_1();
        int int33 = linkedList31.size();
        java.lang.Object obj34 = null;
        boolean boolean35 = linkedList31.remove(obj34);
        boolean boolean36 = linkedList31.property_1();
        linkedList31.clear();
        boolean boolean38 = linkedList21.remove((java.lang.Object) linkedList31);
        system.testclass.LinkedList linkedList39 = new system.testclass.LinkedList();
        boolean boolean40 = linkedList39.composedRepOK();
        boolean boolean41 = linkedList39.property_1();
        linkedList39.clear();
        boolean boolean43 = linkedList39.composedRepOK();
        boolean boolean44 = linkedList31.remove((java.lang.Object) linkedList39);
        system.testclass.LinkedList linkedList45 = new system.testclass.LinkedList();
        boolean boolean46 = linkedList45.composedRepOK();
        boolean boolean48 = linkedList45.remove((java.lang.Object) 1.0d);
        system.testclass.LinkedList linkedList49 = new system.testclass.LinkedList();
        int int50 = linkedList49.size();
        int int51 = linkedList49.size();
        boolean boolean52 = linkedList49.property_1();
        int int53 = linkedList49.size();
        system.testclass.LinkedList linkedList54 = new system.testclass.LinkedList();
        boolean boolean55 = linkedList54.composedRepOK();
        boolean boolean56 = linkedList54.composedRepOK();
        boolean boolean57 = linkedList54.composedRepOK();
        system.testclass.LinkedList linkedList58 = new system.testclass.LinkedList();
        int int59 = linkedList58.size();
        int int60 = linkedList58.size();
        boolean boolean61 = linkedList58.property_1();
        boolean boolean62 = linkedList54.remove((java.lang.Object) linkedList58);
        boolean boolean64 = linkedList58.remove((java.lang.Object) (-1));
        boolean boolean65 = linkedList49.remove((java.lang.Object) (-1));
        boolean boolean66 = linkedList45.remove((java.lang.Object) boolean65);
        java.lang.Class<?> wildcardClass67 = linkedList45.getClass();
        boolean boolean68 = linkedList31.remove((java.lang.Object) wildcardClass67);
        boolean boolean69 = linkedList4.add((java.lang.Object) wildcardClass67);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList4", linkedList4.property_2());
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.composedRepOK();
        boolean boolean3 = linkedList0.composedRepOK();
        boolean boolean5 = linkedList0.remove((java.lang.Object) (byte) 1);
        boolean boolean6 = linkedList0.property_1();
        int int7 = linkedList0.size();
        int int8 = linkedList0.size();
        boolean boolean9 = linkedList0.composedRepOK();
        int int10 = linkedList0.size();
        boolean boolean11 = linkedList0.composedRepOK();
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        boolean boolean13 = linkedList12.composedRepOK();
        boolean boolean14 = linkedList12.composedRepOK();
        boolean boolean15 = linkedList12.composedRepOK();
        system.testclass.LinkedList linkedList16 = new system.testclass.LinkedList();
        int int17 = linkedList16.size();
        int int18 = linkedList16.size();
        boolean boolean19 = linkedList16.property_1();
        boolean boolean20 = linkedList12.remove((java.lang.Object) linkedList16);
        system.testclass.LinkedList linkedList21 = new system.testclass.LinkedList();
        boolean boolean22 = linkedList21.property_1();
        int int23 = linkedList21.size();
        int int24 = linkedList21.size();
        boolean boolean26 = linkedList21.remove((java.lang.Object) (byte) 0);
        boolean boolean27 = linkedList16.remove((java.lang.Object) (byte) 0);
        boolean boolean28 = linkedList16.composedRepOK();
        linkedList16.clear();
        boolean boolean30 = linkedList16.property_1();
        int int31 = linkedList16.size();
        int int32 = linkedList16.size();
        system.testclass.LinkedList linkedList33 = new system.testclass.LinkedList();
        boolean boolean34 = linkedList33.composedRepOK();
        boolean boolean35 = linkedList33.property_1();
        boolean boolean36 = linkedList33.property_1();
        linkedList33.clear();
        java.lang.Class<?> wildcardClass38 = linkedList33.getClass();
        boolean boolean39 = linkedList16.remove((java.lang.Object) wildcardClass38);
        boolean boolean40 = linkedList16.property_1();
        linkedList16.clear();
        boolean boolean42 = linkedList0.add((java.lang.Object) linkedList16);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.composedRepOK();
        boolean boolean3 = linkedList0.composedRepOK();
        boolean boolean5 = linkedList0.remove((java.lang.Object) (byte) 1);
        boolean boolean6 = linkedList0.property_1();
        int int7 = linkedList0.size();
        int int8 = linkedList0.size();
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        int int10 = linkedList9.size();
        int int11 = linkedList9.size();
        boolean boolean12 = linkedList9.property_1();
        boolean boolean13 = linkedList9.composedRepOK();
        boolean boolean14 = linkedList0.remove((java.lang.Object) boolean13);
        boolean boolean15 = linkedList0.composedRepOK();
        system.testclass.LinkedList linkedList16 = new system.testclass.LinkedList();
        int int17 = linkedList16.size();
        int int18 = linkedList16.size();
        linkedList16.clear();
        boolean boolean20 = linkedList16.property_1();
        boolean boolean21 = linkedList16.composedRepOK();
        boolean boolean22 = linkedList0.add((java.lang.Object) boolean21);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.composedRepOK();
        linkedList0.clear();
        int int4 = linkedList0.size();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        boolean boolean6 = linkedList5.composedRepOK();
        boolean boolean7 = linkedList5.composedRepOK();
        boolean boolean8 = linkedList5.composedRepOK();
        boolean boolean10 = linkedList5.remove((java.lang.Object) (byte) 1);
        boolean boolean11 = linkedList5.property_1();
        int int12 = linkedList5.size();
        int int13 = linkedList5.size();
        boolean boolean14 = linkedList5.composedRepOK();
        int int15 = linkedList5.size();
        boolean boolean16 = linkedList5.property_1();
        boolean boolean17 = linkedList0.add((java.lang.Object) linkedList5);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        int int2 = linkedList0.size();
        boolean boolean3 = linkedList0.property_1();
        int int4 = linkedList0.size();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        boolean boolean6 = linkedList5.property_1();
        int int7 = linkedList5.size();
        int int8 = linkedList5.size();
        boolean boolean10 = linkedList5.remove((java.lang.Object) (byte) 0);
        linkedList5.clear();
        boolean boolean12 = linkedList0.remove((java.lang.Object) linkedList5);
        linkedList5.clear();
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        boolean boolean15 = linkedList14.property_1();
        int int16 = linkedList14.size();
        int int17 = linkedList14.size();
        boolean boolean19 = linkedList14.remove((java.lang.Object) (byte) 0);
        boolean boolean20 = linkedList5.add((java.lang.Object) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList5", linkedList5.property_2());
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_1();
        boolean boolean3 = linkedList0.remove((java.lang.Object) true);
        boolean boolean5 = linkedList0.remove((java.lang.Object) 10.0d);
        int int6 = linkedList0.size();
        boolean boolean7 = linkedList0.property_1();
        linkedList0.clear();
        linkedList0.clear();
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        boolean boolean11 = linkedList10.property_1();
        int int12 = linkedList10.size();
        java.lang.Object obj13 = null;
        boolean boolean14 = linkedList10.remove(obj13);
        linkedList10.clear();
        system.testclass.LinkedList linkedList16 = new system.testclass.LinkedList();
        boolean boolean17 = linkedList16.property_1();
        int int18 = linkedList16.size();
        java.lang.Object obj19 = null;
        boolean boolean20 = linkedList16.remove(obj19);
        boolean boolean21 = linkedList16.composedRepOK();
        boolean boolean22 = linkedList16.property_1();
        boolean boolean23 = linkedList10.remove((java.lang.Object) boolean22);
        boolean boolean24 = linkedList0.add((java.lang.Object) boolean22);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_1();
        linkedList0.clear();
        system.testclass.LinkedList linkedList3 = new system.testclass.LinkedList();
        boolean boolean4 = linkedList3.composedRepOK();
        boolean boolean6 = linkedList3.remove((java.lang.Object) 1.0d);
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        int int8 = linkedList7.size();
        int int9 = linkedList7.size();
        boolean boolean10 = linkedList7.property_1();
        int int11 = linkedList7.size();
        boolean boolean12 = linkedList3.remove((java.lang.Object) linkedList7);
        boolean boolean13 = linkedList0.remove((java.lang.Object) linkedList7);
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        boolean boolean15 = linkedList14.property_1();
        boolean boolean17 = linkedList14.remove((java.lang.Object) true);
        linkedList14.clear();
        int int19 = linkedList14.size();
        linkedList14.clear();
        system.testclass.LinkedList linkedList21 = new system.testclass.LinkedList();
        boolean boolean22 = linkedList21.composedRepOK();
        boolean boolean23 = linkedList21.composedRepOK();
        boolean boolean24 = linkedList21.composedRepOK();
        boolean boolean26 = linkedList21.remove((java.lang.Object) (byte) 1);
        int int27 = linkedList21.size();
        boolean boolean28 = linkedList14.remove((java.lang.Object) linkedList21);
        int int29 = linkedList21.size();
        system.testclass.LinkedList linkedList30 = new system.testclass.LinkedList();
        boolean boolean31 = linkedList30.property_1();
        boolean boolean33 = linkedList30.remove((java.lang.Object) true);
        boolean boolean35 = linkedList30.remove((java.lang.Object) 10.0d);
        int int36 = linkedList30.size();
        boolean boolean37 = linkedList30.property_1();
        linkedList30.clear();
        int int39 = linkedList30.size();
        system.testclass.LinkedList linkedList40 = new system.testclass.LinkedList();
        boolean boolean41 = linkedList40.property_1();
        int int42 = linkedList40.size();
        java.lang.Object obj43 = null;
        boolean boolean44 = linkedList40.remove(obj43);
        boolean boolean45 = linkedList40.property_1();
        linkedList40.clear();
        boolean boolean47 = linkedList30.remove((java.lang.Object) linkedList40);
        system.testclass.LinkedList linkedList48 = new system.testclass.LinkedList();
        boolean boolean49 = linkedList48.composedRepOK();
        boolean boolean50 = linkedList48.property_1();
        linkedList48.clear();
        boolean boolean52 = linkedList48.composedRepOK();
        boolean boolean53 = linkedList40.remove((java.lang.Object) linkedList48);
        system.testclass.LinkedList linkedList54 = new system.testclass.LinkedList();
        boolean boolean55 = linkedList54.composedRepOK();
        boolean boolean56 = linkedList54.composedRepOK();
        linkedList54.clear();
        boolean boolean58 = linkedList54.property_1();
        boolean boolean59 = linkedList54.property_1();
        linkedList54.clear();
        int int61 = linkedList54.size();
        boolean boolean62 = linkedList48.remove((java.lang.Object) int61);
        boolean boolean63 = linkedList48.property_1();
        boolean boolean64 = linkedList21.remove((java.lang.Object) linkedList48);
        boolean boolean65 = linkedList7.add((java.lang.Object) boolean64);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList7", linkedList7.property_2());
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.composedRepOK();
        boolean boolean3 = linkedList0.composedRepOK();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        int int5 = linkedList4.size();
        int int6 = linkedList4.size();
        boolean boolean7 = linkedList4.property_1();
        boolean boolean8 = linkedList0.remove((java.lang.Object) linkedList4);
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        boolean boolean10 = linkedList9.property_1();
        int int11 = linkedList9.size();
        int int12 = linkedList9.size();
        boolean boolean14 = linkedList9.remove((java.lang.Object) (byte) 0);
        boolean boolean15 = linkedList4.remove((java.lang.Object) (byte) 0);
        boolean boolean16 = linkedList4.composedRepOK();
        linkedList4.clear();
        boolean boolean18 = linkedList4.property_1();
        system.testclass.LinkedList linkedList19 = new system.testclass.LinkedList();
        boolean boolean20 = linkedList19.property_1();
        int int21 = linkedList19.size();
        java.lang.Object obj22 = null;
        boolean boolean23 = linkedList19.remove(obj22);
        boolean boolean25 = linkedList19.remove((java.lang.Object) 1.0f);
        linkedList19.clear();
        system.testclass.LinkedList linkedList27 = new system.testclass.LinkedList();
        int int28 = linkedList27.size();
        int int29 = linkedList27.size();
        boolean boolean30 = linkedList27.property_1();
        boolean boolean31 = linkedList19.remove((java.lang.Object) linkedList27);
        boolean boolean32 = linkedList4.add((java.lang.Object) linkedList27);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList4", linkedList4.property_2());
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_1();
        int int2 = linkedList0.size();
        java.lang.Object obj3 = null;
        boolean boolean4 = linkedList0.remove(obj3);
        boolean boolean6 = linkedList0.remove((java.lang.Object) 1.0f);
        linkedList0.clear();
        boolean boolean8 = linkedList0.property_1();
        boolean boolean9 = linkedList0.property_1();
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        boolean boolean11 = linkedList10.property_1();
        int int12 = linkedList10.size();
        int int13 = linkedList10.size();
        boolean boolean14 = linkedList10.composedRepOK();
        boolean boolean15 = linkedList10.composedRepOK();
        linkedList10.clear();
        linkedList10.clear();
        boolean boolean18 = linkedList0.add((java.lang.Object) linkedList10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.composedRepOK();
        boolean boolean3 = linkedList0.composedRepOK();
        boolean boolean5 = linkedList0.remove((java.lang.Object) (byte) 1);
        boolean boolean6 = linkedList0.property_1();
        int int7 = linkedList0.size();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        boolean boolean9 = linkedList8.composedRepOK();
        boolean boolean10 = linkedList8.composedRepOK();
        boolean boolean11 = linkedList8.composedRepOK();
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        boolean boolean13 = linkedList12.composedRepOK();
        boolean boolean14 = linkedList12.composedRepOK();
        boolean boolean15 = linkedList12.composedRepOK();
        boolean boolean17 = linkedList12.remove((java.lang.Object) (byte) 1);
        boolean boolean18 = linkedList12.composedRepOK();
        boolean boolean19 = linkedList8.remove((java.lang.Object) linkedList12);
        linkedList8.clear();
        int int21 = linkedList8.size();
        boolean boolean22 = linkedList8.property_1();
        boolean boolean23 = linkedList8.property_1();
        linkedList8.clear();
        int int25 = linkedList8.size();
        boolean boolean26 = linkedList0.add((java.lang.Object) int25);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.composedRepOK();
        linkedList0.clear();
        boolean boolean4 = linkedList0.property_1();
        boolean boolean5 = linkedList0.property_1();
        boolean boolean6 = linkedList0.composedRepOK();
        boolean boolean7 = linkedList0.property_1();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        boolean boolean9 = linkedList8.property_1();
        boolean boolean11 = linkedList8.remove((java.lang.Object) true);
        linkedList8.clear();
        int int13 = linkedList8.size();
        linkedList8.clear();
        system.testclass.LinkedList linkedList15 = new system.testclass.LinkedList();
        boolean boolean16 = linkedList15.composedRepOK();
        boolean boolean17 = linkedList15.composedRepOK();
        boolean boolean18 = linkedList15.composedRepOK();
        boolean boolean20 = linkedList15.remove((java.lang.Object) (byte) 1);
        int int21 = linkedList15.size();
        boolean boolean22 = linkedList8.remove((java.lang.Object) linkedList15);
        linkedList15.clear();
        int int24 = linkedList15.size();
        boolean boolean25 = linkedList0.add((java.lang.Object) int24);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.composedRepOK();
        boolean boolean3 = linkedList0.composedRepOK();
        boolean boolean5 = linkedList0.remove((java.lang.Object) (byte) 1);
        boolean boolean6 = linkedList0.composedRepOK();
        int int7 = linkedList0.size();
        boolean boolean9 = linkedList0.remove((java.lang.Object) 10.0d);
        boolean boolean10 = linkedList0.property_1();
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        boolean boolean12 = linkedList11.composedRepOK();
        boolean boolean13 = linkedList11.composedRepOK();
        boolean boolean14 = linkedList11.composedRepOK();
        boolean boolean16 = linkedList11.remove((java.lang.Object) (byte) 1);
        int int17 = linkedList11.size();
        boolean boolean18 = linkedList0.add((java.lang.Object) int17);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        int int2 = linkedList0.size();
        boolean boolean3 = linkedList0.property_1();
        int int4 = linkedList0.size();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        boolean boolean6 = linkedList5.property_1();
        int int7 = linkedList5.size();
        int int8 = linkedList5.size();
        boolean boolean10 = linkedList5.remove((java.lang.Object) (byte) 0);
        linkedList5.clear();
        boolean boolean12 = linkedList0.remove((java.lang.Object) linkedList5);
        boolean boolean13 = linkedList0.composedRepOK();
        boolean boolean14 = linkedList0.property_1();
        int int15 = linkedList0.size();
        system.testclass.LinkedList linkedList16 = new system.testclass.LinkedList();
        boolean boolean17 = linkedList16.property_1();
        int int18 = linkedList16.size();
        int int19 = linkedList16.size();
        boolean boolean21 = linkedList16.remove((java.lang.Object) (byte) 0);
        linkedList16.clear();
        boolean boolean23 = linkedList16.property_1();
        linkedList16.clear();
        boolean boolean25 = linkedList16.property_1();
        boolean boolean26 = linkedList16.property_1();
        boolean boolean27 = linkedList0.add((java.lang.Object) linkedList16);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_1();
        int int2 = linkedList0.size();
        java.lang.Object obj3 = null;
        boolean boolean4 = linkedList0.remove(obj3);
        boolean boolean6 = linkedList0.remove((java.lang.Object) 1.0f);
        linkedList0.clear();
        boolean boolean8 = linkedList0.property_1();
        boolean boolean9 = linkedList0.property_1();
        int int10 = linkedList0.size();
        boolean boolean11 = linkedList0.property_1();
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        boolean boolean13 = linkedList12.composedRepOK();
        boolean boolean14 = linkedList12.composedRepOK();
        linkedList12.clear();
        boolean boolean16 = linkedList12.property_1();
        boolean boolean17 = linkedList12.property_1();
        boolean boolean18 = linkedList12.composedRepOK();
        boolean boolean19 = linkedList12.property_1();
        boolean boolean20 = linkedList0.remove((java.lang.Object) linkedList12);
        system.testclass.LinkedList linkedList21 = new system.testclass.LinkedList();
        boolean boolean22 = linkedList21.composedRepOK();
        boolean boolean23 = linkedList21.composedRepOK();
        boolean boolean24 = linkedList21.composedRepOK();
        system.testclass.LinkedList linkedList25 = new system.testclass.LinkedList();
        int int26 = linkedList25.size();
        int int27 = linkedList25.size();
        boolean boolean28 = linkedList25.property_1();
        boolean boolean29 = linkedList21.remove((java.lang.Object) linkedList25);
        system.testclass.LinkedList linkedList30 = new system.testclass.LinkedList();
        boolean boolean31 = linkedList30.property_1();
        int int32 = linkedList30.size();
        int int33 = linkedList30.size();
        boolean boolean35 = linkedList30.remove((java.lang.Object) (byte) 0);
        boolean boolean36 = linkedList25.remove((java.lang.Object) (byte) 0);
        boolean boolean37 = linkedList25.composedRepOK();
        boolean boolean38 = linkedList25.property_1();
        boolean boolean39 = linkedList12.add((java.lang.Object) boolean38);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList12", linkedList12.property_2());
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_1();
        int int2 = linkedList0.size();
        int int3 = linkedList0.size();
        boolean boolean5 = linkedList0.remove((java.lang.Object) (byte) 0);
        linkedList0.clear();
        boolean boolean7 = linkedList0.property_1();
        linkedList0.clear();
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        boolean boolean10 = linkedList9.composedRepOK();
        boolean boolean11 = linkedList9.composedRepOK();
        boolean boolean12 = linkedList9.composedRepOK();
        boolean boolean14 = linkedList9.remove((java.lang.Object) (byte) 1);
        boolean boolean15 = linkedList9.composedRepOK();
        int int16 = linkedList9.size();
        boolean boolean17 = linkedList9.composedRepOK();
        boolean boolean18 = linkedList0.add((java.lang.Object) boolean17);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        int int2 = linkedList0.size();
        boolean boolean3 = linkedList0.property_1();
        int int4 = linkedList0.size();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        boolean boolean6 = linkedList5.property_1();
        int int7 = linkedList5.size();
        int int8 = linkedList5.size();
        boolean boolean10 = linkedList5.remove((java.lang.Object) (byte) 0);
        linkedList5.clear();
        boolean boolean12 = linkedList0.remove((java.lang.Object) linkedList5);
        boolean boolean13 = linkedList0.composedRepOK();
        boolean boolean14 = linkedList0.composedRepOK();
        system.testclass.LinkedList linkedList15 = new system.testclass.LinkedList();
        int int16 = linkedList15.size();
        int int17 = linkedList15.size();
        boolean boolean18 = linkedList15.property_1();
        linkedList15.clear();
        linkedList15.clear();
        java.lang.Class<?> wildcardClass21 = linkedList15.getClass();
        boolean boolean22 = linkedList0.add((java.lang.Object) wildcardClass21);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_1();
        int int2 = linkedList0.size();
        boolean boolean3 = linkedList0.property_1();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        int int5 = linkedList4.size();
        int int6 = linkedList4.size();
        boolean boolean7 = linkedList4.property_1();
        int int8 = linkedList4.size();
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        boolean boolean10 = linkedList9.property_1();
        int int11 = linkedList9.size();
        java.lang.Object obj12 = null;
        boolean boolean13 = linkedList9.remove(obj12);
        boolean boolean15 = linkedList9.remove((java.lang.Object) 1.0f);
        boolean boolean16 = linkedList4.remove((java.lang.Object) boolean15);
        java.lang.Object obj17 = null;
        boolean boolean18 = linkedList4.remove(obj17);
        int int19 = linkedList4.size();
        boolean boolean20 = linkedList0.remove((java.lang.Object) linkedList4);
        system.testclass.LinkedList linkedList21 = new system.testclass.LinkedList();
        boolean boolean22 = linkedList21.property_1();
        int int23 = linkedList21.size();
        int int24 = linkedList21.size();
        boolean boolean26 = linkedList21.remove((java.lang.Object) (byte) 0);
        linkedList21.clear();
        boolean boolean28 = linkedList21.property_1();
        linkedList21.clear();
        boolean boolean30 = linkedList21.property_1();
        boolean boolean31 = linkedList21.property_1();
        boolean boolean32 = linkedList4.add((java.lang.Object) linkedList21);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList4", linkedList4.property_2());
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.composedRepOK();
        linkedList0.clear();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        boolean boolean5 = linkedList4.property_1();
        int int6 = linkedList4.size();
        int int7 = linkedList4.size();
        boolean boolean9 = linkedList4.remove((java.lang.Object) (byte) 0);
        boolean boolean10 = linkedList0.remove((java.lang.Object) linkedList4);
        boolean boolean11 = linkedList0.composedRepOK();
        boolean boolean12 = linkedList0.property_1();
        system.testclass.LinkedList linkedList13 = new system.testclass.LinkedList();
        boolean boolean14 = linkedList13.composedRepOK();
        boolean boolean15 = linkedList13.composedRepOK();
        boolean boolean16 = linkedList13.composedRepOK();
        system.testclass.LinkedList linkedList17 = new system.testclass.LinkedList();
        int int18 = linkedList17.size();
        int int19 = linkedList17.size();
        boolean boolean20 = linkedList17.property_1();
        boolean boolean21 = linkedList13.remove((java.lang.Object) linkedList17);
        system.testclass.LinkedList linkedList22 = new system.testclass.LinkedList();
        boolean boolean23 = linkedList22.property_1();
        int int24 = linkedList22.size();
        int int25 = linkedList22.size();
        boolean boolean27 = linkedList22.remove((java.lang.Object) (byte) 0);
        boolean boolean28 = linkedList17.remove((java.lang.Object) (byte) 0);
        boolean boolean29 = linkedList17.composedRepOK();
        linkedList17.clear();
        boolean boolean31 = linkedList17.property_1();
        int int32 = linkedList17.size();
        int int33 = linkedList17.size();
        boolean boolean34 = linkedList17.property_1();
        system.testclass.LinkedList linkedList35 = new system.testclass.LinkedList();
        boolean boolean36 = linkedList35.property_1();
        int int37 = linkedList35.size();
        int int38 = linkedList35.size();
        boolean boolean40 = linkedList35.remove((java.lang.Object) (byte) 0);
        linkedList35.clear();
        boolean boolean42 = linkedList35.property_1();
        linkedList35.clear();
        boolean boolean44 = linkedList35.property_1();
        boolean boolean45 = linkedList17.remove((java.lang.Object) linkedList35);
        system.testclass.LinkedList linkedList46 = new system.testclass.LinkedList();
        boolean boolean47 = linkedList46.composedRepOK();
        boolean boolean48 = linkedList46.composedRepOK();
        boolean boolean49 = linkedList46.composedRepOK();
        boolean boolean51 = linkedList46.remove((java.lang.Object) (byte) 1);
        boolean boolean52 = linkedList46.composedRepOK();
        boolean boolean53 = linkedList46.property_1();
        boolean boolean54 = linkedList46.composedRepOK();
        boolean boolean55 = linkedList46.composedRepOK();
        boolean boolean56 = linkedList17.remove((java.lang.Object) linkedList46);
        boolean boolean57 = linkedList0.add((java.lang.Object) boolean56);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.composedRepOK();
        boolean boolean2 = linkedList0.property_1();
        linkedList0.clear();
        int int4 = linkedList0.size();
        int int5 = linkedList0.size();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        int int7 = linkedList6.size();
        int int8 = linkedList6.size();
        boolean boolean9 = linkedList6.property_1();
        int int10 = linkedList6.size();
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        boolean boolean12 = linkedList11.property_1();
        int int13 = linkedList11.size();
        java.lang.Object obj14 = null;
        boolean boolean15 = linkedList11.remove(obj14);
        boolean boolean17 = linkedList11.remove((java.lang.Object) 1.0f);
        boolean boolean18 = linkedList6.remove((java.lang.Object) boolean17);
        java.lang.Object obj19 = null;
        boolean boolean20 = linkedList6.remove(obj19);
        boolean boolean22 = linkedList6.remove((java.lang.Object) 10L);
        boolean boolean23 = linkedList6.composedRepOK();
        boolean boolean24 = linkedList0.add((java.lang.Object) linkedList6);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_1();
        boolean boolean3 = linkedList0.remove((java.lang.Object) true);
        boolean boolean5 = linkedList0.remove((java.lang.Object) 10.0d);
        int int6 = linkedList0.size();
        boolean boolean7 = linkedList0.property_1();
        linkedList0.clear();
        int int9 = linkedList0.size();
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        boolean boolean11 = linkedList10.property_1();
        int int12 = linkedList10.size();
        java.lang.Object obj13 = null;
        boolean boolean14 = linkedList10.remove(obj13);
        boolean boolean15 = linkedList10.property_1();
        linkedList10.clear();
        boolean boolean17 = linkedList0.remove((java.lang.Object) linkedList10);
        system.testclass.LinkedList linkedList18 = new system.testclass.LinkedList();
        boolean boolean19 = linkedList18.composedRepOK();
        boolean boolean20 = linkedList18.property_1();
        linkedList18.clear();
        boolean boolean22 = linkedList18.composedRepOK();
        boolean boolean23 = linkedList10.remove((java.lang.Object) linkedList18);
        system.testclass.LinkedList linkedList24 = new system.testclass.LinkedList();
        boolean boolean25 = linkedList24.composedRepOK();
        boolean boolean26 = linkedList24.property_1();
        boolean boolean27 = linkedList24.composedRepOK();
        system.testclass.LinkedList linkedList28 = new system.testclass.LinkedList();
        boolean boolean29 = linkedList28.property_1();
        int int30 = linkedList28.size();
        boolean boolean31 = linkedList24.remove((java.lang.Object) int30);
        int int32 = linkedList24.size();
        boolean boolean33 = linkedList18.remove((java.lang.Object) int32);
        system.testclass.LinkedList linkedList34 = new system.testclass.LinkedList();
        int int35 = linkedList34.size();
        int int36 = linkedList34.size();
        boolean boolean37 = linkedList34.property_1();
        int int38 = linkedList34.size();
        system.testclass.LinkedList linkedList39 = new system.testclass.LinkedList();
        boolean boolean40 = linkedList39.property_1();
        int int41 = linkedList39.size();
        java.lang.Object obj42 = null;
        boolean boolean43 = linkedList39.remove(obj42);
        boolean boolean45 = linkedList39.remove((java.lang.Object) 1.0f);
        boolean boolean46 = linkedList34.remove((java.lang.Object) boolean45);
        java.lang.Object obj47 = null;
        boolean boolean48 = linkedList34.remove(obj47);
        boolean boolean50 = linkedList34.remove((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass51 = linkedList34.getClass();
        boolean boolean52 = linkedList18.add((java.lang.Object) wildcardClass51);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList18", linkedList18.property_2());
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_1();
        int int2 = linkedList0.size();
        java.lang.Object obj3 = null;
        boolean boolean4 = linkedList0.remove(obj3);
        boolean boolean6 = linkedList0.remove((java.lang.Object) 1.0f);
        linkedList0.clear();
        boolean boolean8 = linkedList0.property_1();
        boolean boolean9 = linkedList0.property_1();
        int int10 = linkedList0.size();
        boolean boolean11 = linkedList0.property_1();
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        boolean boolean13 = linkedList12.composedRepOK();
        boolean boolean14 = linkedList12.composedRepOK();
        linkedList12.clear();
        boolean boolean16 = linkedList12.property_1();
        boolean boolean17 = linkedList12.property_1();
        boolean boolean18 = linkedList12.composedRepOK();
        boolean boolean19 = linkedList12.property_1();
        boolean boolean20 = linkedList0.remove((java.lang.Object) linkedList12);
        boolean boolean22 = linkedList0.add((java.lang.Object) 100.0d);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean1 = linkedList0.property_1();
        boolean boolean3 = linkedList0.remove((java.lang.Object) true);
        boolean boolean5 = linkedList0.remove((java.lang.Object) 10.0d);
        boolean boolean6 = linkedList0.composedRepOK();
        linkedList0.clear();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        boolean boolean9 = linkedList8.composedRepOK();
        boolean boolean10 = linkedList8.composedRepOK();
        linkedList8.clear();
        boolean boolean12 = linkedList8.property_1();
        boolean boolean13 = linkedList8.property_1();
        linkedList8.clear();
        boolean boolean15 = linkedList8.composedRepOK();
        int int16 = linkedList8.size();
        boolean boolean17 = linkedList0.add((java.lang.Object) linkedList8);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for linkedList0", linkedList0.property_2());
    }
}

