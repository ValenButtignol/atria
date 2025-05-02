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
        system.testclass.LinkedList linkedList1 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass2 = linkedList1.getClass();
        boolean boolean3 = linkedList0.remove((java.lang.Object) wildcardClass2);
        boolean boolean5 = linkedList0.add((java.lang.Object) false);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean5 = linkedList0.add((java.lang.Object) (-1.0f));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList1 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass2 = linkedList1.getClass();
        boolean boolean3 = linkedList0.remove((java.lang.Object) wildcardClass2);
        java.lang.Object obj4 = null;
        boolean boolean5 = linkedList0.add(obj4);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        boolean boolean5 = linkedList0.add((java.lang.Object) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        system.testclass.LinkedList linkedList2 = new system.testclass.LinkedList();
        boolean boolean4 = linkedList2.remove((java.lang.Object) 1.0d);
        boolean boolean6 = linkedList2.remove((java.lang.Object) 10);
        boolean boolean8 = linkedList2.remove((java.lang.Object) 1L);
        boolean boolean9 = linkedList0.add((java.lang.Object) boolean8);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        system.testclass.LinkedList linkedList3 = new system.testclass.LinkedList();
        linkedList3.clear();
        boolean boolean5 = linkedList0.add((java.lang.Object) linkedList3);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList1 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass2 = linkedList1.getClass();
        boolean boolean3 = linkedList0.remove((java.lang.Object) wildcardClass2);
        int int4 = linkedList0.size();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass6 = linkedList5.getClass();
        boolean boolean7 = linkedList0.add((java.lang.Object) linkedList5);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean2 = linkedList0.remove((java.lang.Object) 1.0d);
        linkedList0.clear();
        boolean boolean5 = linkedList0.add((java.lang.Object) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        int int2 = linkedList0.size();
        boolean boolean4 = linkedList0.add((java.lang.Object) 10.0d);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        int int2 = linkedList0.size();
        system.testclass.LinkedList linkedList3 = new system.testclass.LinkedList();
        int int4 = linkedList3.size();
        linkedList3.clear();
        int int6 = linkedList3.size();
        int int7 = linkedList3.size();
        int int8 = linkedList3.size();
        boolean boolean9 = linkedList0.add((java.lang.Object) int8);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        int int4 = linkedList0.size();
        java.lang.Object obj5 = null;
        boolean boolean6 = linkedList0.add(obj5);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList1 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass2 = linkedList1.getClass();
        boolean boolean3 = linkedList0.remove((java.lang.Object) wildcardClass2);
        boolean boolean5 = linkedList0.add((java.lang.Object) (-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean2 = linkedList0.remove((java.lang.Object) 1.0d);
        boolean boolean4 = linkedList0.add((java.lang.Object) "hi!");
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        boolean boolean4 = linkedList0.add((java.lang.Object) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass6 = linkedList5.getClass();
        boolean boolean7 = linkedList4.remove((java.lang.Object) wildcardClass6);
        int int8 = linkedList4.size();
        linkedList4.clear();
        java.lang.Class<?> wildcardClass10 = linkedList4.getClass();
        boolean boolean11 = linkedList0.remove((java.lang.Object) wildcardClass10);
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        int int13 = linkedList12.size();
        linkedList12.clear();
        int int15 = linkedList12.size();
        linkedList12.clear();
        boolean boolean17 = linkedList0.add((java.lang.Object) linkedList12);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        boolean boolean3 = linkedList0.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass6 = linkedList5.getClass();
        boolean boolean7 = linkedList4.remove((java.lang.Object) wildcardClass6);
        java.lang.Class<?> wildcardClass8 = linkedList4.getClass();
        boolean boolean9 = linkedList0.remove((java.lang.Object) wildcardClass8);
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        int int11 = linkedList10.size();
        linkedList10.clear();
        int int13 = linkedList10.size();
        int int14 = linkedList10.size();
        int int15 = linkedList10.size();
        system.testclass.LinkedList linkedList16 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList17 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass18 = linkedList17.getClass();
        boolean boolean19 = linkedList16.remove((java.lang.Object) wildcardClass18);
        system.testclass.LinkedList linkedList20 = new system.testclass.LinkedList();
        int int21 = linkedList20.size();
        linkedList20.clear();
        int int23 = linkedList20.size();
        java.lang.Class<?> wildcardClass24 = linkedList20.getClass();
        boolean boolean25 = linkedList16.remove((java.lang.Object) linkedList20);
        boolean boolean26 = linkedList10.remove((java.lang.Object) boolean25);
        boolean boolean27 = linkedList0.add((java.lang.Object) linkedList10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList1 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass2 = linkedList1.getClass();
        boolean boolean3 = linkedList0.remove((java.lang.Object) wildcardClass2);
        int int4 = linkedList0.size();
        linkedList0.clear();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        linkedList6.clear();
        boolean boolean8 = linkedList0.add((java.lang.Object) linkedList6);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass6 = linkedList5.getClass();
        boolean boolean7 = linkedList4.remove((java.lang.Object) wildcardClass6);
        int int8 = linkedList4.size();
        linkedList4.clear();
        java.lang.Class<?> wildcardClass10 = linkedList4.getClass();
        boolean boolean11 = linkedList0.remove((java.lang.Object) wildcardClass10);
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList13 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass14 = linkedList13.getClass();
        boolean boolean15 = linkedList12.remove((java.lang.Object) wildcardClass14);
        system.testclass.LinkedList linkedList16 = new system.testclass.LinkedList();
        int int17 = linkedList16.size();
        linkedList16.clear();
        int int19 = linkedList16.size();
        java.lang.Class<?> wildcardClass20 = linkedList16.getClass();
        boolean boolean21 = linkedList12.remove((java.lang.Object) linkedList16);
        boolean boolean22 = linkedList0.add((java.lang.Object) boolean21);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList1 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass2 = linkedList1.getClass();
        boolean boolean3 = linkedList0.remove((java.lang.Object) wildcardClass2);
        linkedList0.clear();
        boolean boolean6 = linkedList0.add((java.lang.Object) 100.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList1 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass2 = linkedList1.getClass();
        boolean boolean3 = linkedList0.remove((java.lang.Object) wildcardClass2);
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        int int5 = linkedList4.size();
        linkedList4.clear();
        int int7 = linkedList4.size();
        java.lang.Class<?> wildcardClass8 = linkedList4.getClass();
        boolean boolean9 = linkedList0.remove((java.lang.Object) linkedList4);
        boolean boolean11 = linkedList0.add((java.lang.Object) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean2 = linkedList0.remove((java.lang.Object) 1.0d);
        linkedList0.clear();
        boolean boolean5 = linkedList0.add((java.lang.Object) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        int int5 = linkedList4.size();
        linkedList4.clear();
        int int7 = linkedList4.size();
        boolean boolean8 = linkedList0.add((java.lang.Object) linkedList4);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass6 = linkedList5.getClass();
        boolean boolean7 = linkedList4.remove((java.lang.Object) wildcardClass6);
        int int8 = linkedList4.size();
        linkedList4.clear();
        boolean boolean10 = linkedList0.remove((java.lang.Object) linkedList4);
        boolean boolean12 = linkedList4.add((java.lang.Object) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList4", linkedList4.repOK_1());
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList1 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass2 = linkedList1.getClass();
        boolean boolean3 = linkedList0.remove((java.lang.Object) wildcardClass2);
        int int4 = linkedList0.size();
        linkedList0.clear();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        boolean boolean8 = linkedList6.remove((java.lang.Object) 1.0d);
        linkedList6.clear();
        boolean boolean10 = linkedList0.add((java.lang.Object) linkedList6);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        boolean boolean3 = linkedList0.add((java.lang.Object) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean2 = linkedList0.remove((java.lang.Object) 1.0d);
        system.testclass.LinkedList linkedList3 = new system.testclass.LinkedList();
        int int4 = linkedList3.size();
        boolean boolean5 = linkedList0.add((java.lang.Object) int4);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean2 = linkedList0.remove((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedList0.remove((java.lang.Object) 0L);
        int int5 = linkedList0.size();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        boolean boolean8 = linkedList6.remove((java.lang.Object) 1.0d);
        linkedList6.clear();
        java.lang.Class<?> wildcardClass10 = linkedList6.getClass();
        boolean boolean11 = linkedList0.add((java.lang.Object) linkedList6);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        boolean boolean4 = linkedList0.remove((java.lang.Object) "hi!");
        boolean boolean6 = linkedList0.add((java.lang.Object) 100.0d);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        boolean boolean4 = linkedList0.remove((java.lang.Object) "hi!");
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        linkedList5.clear();
        linkedList5.clear();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        linkedList8.clear();
        int int10 = linkedList8.size();
        boolean boolean11 = linkedList5.remove((java.lang.Object) linkedList8);
        boolean boolean12 = linkedList0.add((java.lang.Object) linkedList5);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        boolean boolean3 = linkedList0.remove((java.lang.Object) (-1L));
        int int4 = linkedList0.size();
        boolean boolean6 = linkedList0.add((java.lang.Object) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean2 = linkedList0.remove((java.lang.Object) 1.0d);
        boolean boolean4 = linkedList0.remove((java.lang.Object) 10);
        boolean boolean6 = linkedList0.remove((java.lang.Object) 1L);
        java.lang.Object obj7 = null;
        boolean boolean8 = linkedList0.add(obj7);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean2 = linkedList0.remove((java.lang.Object) 1.0d);
        boolean boolean4 = linkedList0.remove((java.lang.Object) 10);
        boolean boolean6 = linkedList0.remove((java.lang.Object) 1L);
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        linkedList7.clear();
        linkedList7.clear();
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        boolean boolean12 = linkedList10.remove((java.lang.Object) 1.0d);
        linkedList10.clear();
        java.lang.Class<?> wildcardClass14 = linkedList10.getClass();
        boolean boolean15 = linkedList7.remove((java.lang.Object) wildcardClass14);
        boolean boolean16 = linkedList0.add((java.lang.Object) wildcardClass14);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean2 = linkedList0.remove((java.lang.Object) 1.0d);
        boolean boolean4 = linkedList0.remove((java.lang.Object) 10);
        boolean boolean6 = linkedList0.remove((java.lang.Object) 1L);
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        linkedList7.clear();
        boolean boolean9 = linkedList0.add((java.lang.Object) linkedList7);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList1 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass2 = linkedList1.getClass();
        boolean boolean3 = linkedList0.remove((java.lang.Object) wildcardClass2);
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        int int5 = linkedList4.size();
        linkedList4.clear();
        int int7 = linkedList4.size();
        java.lang.Class<?> wildcardClass8 = linkedList4.getClass();
        boolean boolean9 = linkedList0.remove((java.lang.Object) linkedList4);
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        linkedList10.clear();
        boolean boolean13 = linkedList10.remove((java.lang.Object) (-1L));
        boolean boolean14 = linkedList0.remove((java.lang.Object) boolean13);
        system.testclass.LinkedList linkedList15 = new system.testclass.LinkedList();
        boolean boolean17 = linkedList15.remove((java.lang.Object) 1.0d);
        boolean boolean19 = linkedList15.remove((java.lang.Object) 10);
        int int20 = linkedList15.size();
        boolean boolean21 = linkedList0.add((java.lang.Object) int20);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        boolean boolean3 = linkedList0.remove((java.lang.Object) (-1L));
        int int4 = linkedList0.size();
        boolean boolean6 = linkedList0.add((java.lang.Object) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean2 = linkedList0.remove((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedList0.remove((java.lang.Object) 0L);
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        boolean boolean7 = linkedList5.remove((java.lang.Object) 1.0d);
        linkedList5.clear();
        linkedList5.clear();
        boolean boolean10 = linkedList0.add((java.lang.Object) linkedList5);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        system.testclass.LinkedList linkedList3 = new system.testclass.LinkedList();
        boolean boolean5 = linkedList3.remove((java.lang.Object) 1.0d);
        linkedList3.clear();
        java.lang.Class<?> wildcardClass7 = linkedList3.getClass();
        boolean boolean8 = linkedList0.remove((java.lang.Object) wildcardClass7);
        boolean boolean10 = linkedList0.add((java.lang.Object) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList1 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass2 = linkedList1.getClass();
        boolean boolean3 = linkedList0.remove((java.lang.Object) wildcardClass2);
        boolean boolean5 = linkedList0.add((java.lang.Object) 1L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        linkedList0.clear();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        boolean boolean7 = linkedList5.remove((java.lang.Object) 1.0d);
        int int8 = linkedList5.size();
        java.lang.Object obj9 = null;
        boolean boolean10 = linkedList5.remove(obj9);
        boolean boolean11 = linkedList0.add((java.lang.Object) boolean10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        boolean boolean3 = linkedList0.remove((java.lang.Object) (-1L));
        boolean boolean5 = linkedList0.remove((java.lang.Object) (-1L));
        int int6 = linkedList0.size();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        boolean boolean9 = linkedList7.remove((java.lang.Object) 1.0d);
        int int10 = linkedList7.size();
        boolean boolean11 = linkedList0.remove((java.lang.Object) int10);
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        boolean boolean14 = linkedList12.remove((java.lang.Object) 1.0d);
        boolean boolean16 = linkedList12.remove((java.lang.Object) 10);
        boolean boolean18 = linkedList12.remove((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass19 = linkedList12.getClass();
        boolean boolean20 = linkedList0.add((java.lang.Object) wildcardClass19);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        system.testclass.LinkedList linkedList3 = new system.testclass.LinkedList();
        linkedList3.clear();
        int int5 = linkedList3.size();
        boolean boolean6 = linkedList0.remove((java.lang.Object) linkedList3);
        int int7 = linkedList0.size();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        linkedList8.clear();
        java.lang.Class<?> wildcardClass10 = linkedList8.getClass();
        boolean boolean11 = linkedList0.add((java.lang.Object) wildcardClass10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean2 = linkedList0.remove((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedList0.remove((java.lang.Object) '#');
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        int int6 = linkedList5.size();
        linkedList5.clear();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        boolean boolean10 = linkedList8.remove((java.lang.Object) 1.0d);
        boolean boolean12 = linkedList8.remove((java.lang.Object) 10);
        boolean boolean14 = linkedList8.remove((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass15 = linkedList8.getClass();
        boolean boolean16 = linkedList5.remove((java.lang.Object) wildcardClass15);
        boolean boolean17 = linkedList0.add((java.lang.Object) boolean16);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        int int2 = linkedList0.size();
        linkedList0.clear();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        linkedList4.clear();
        boolean boolean6 = linkedList0.add((java.lang.Object) linkedList4);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        int int4 = linkedList0.size();
        int int5 = linkedList0.size();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass8 = linkedList7.getClass();
        boolean boolean9 = linkedList6.remove((java.lang.Object) wildcardClass8);
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        int int11 = linkedList10.size();
        linkedList10.clear();
        int int13 = linkedList10.size();
        java.lang.Class<?> wildcardClass14 = linkedList10.getClass();
        boolean boolean15 = linkedList6.remove((java.lang.Object) linkedList10);
        boolean boolean16 = linkedList0.remove((java.lang.Object) boolean15);
        system.testclass.LinkedList linkedList17 = new system.testclass.LinkedList();
        linkedList17.clear();
        boolean boolean20 = linkedList17.remove((java.lang.Object) (-1L));
        boolean boolean22 = linkedList17.remove((java.lang.Object) (-1L));
        int int23 = linkedList17.size();
        boolean boolean24 = linkedList0.add((java.lang.Object) int23);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList1 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass2 = linkedList1.getClass();
        boolean boolean3 = linkedList0.remove((java.lang.Object) wildcardClass2);
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        linkedList4.clear();
        linkedList4.clear();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        boolean boolean9 = linkedList7.remove((java.lang.Object) 1.0d);
        linkedList7.clear();
        java.lang.Class<?> wildcardClass11 = linkedList7.getClass();
        boolean boolean12 = linkedList4.remove((java.lang.Object) wildcardClass11);
        boolean boolean13 = linkedList0.add((java.lang.Object) wildcardClass11);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        linkedList0.clear();
        linkedList0.clear();
        linkedList0.clear();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        linkedList7.clear();
        boolean boolean10 = linkedList7.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        boolean boolean13 = linkedList11.remove((java.lang.Object) (byte) -1);
        boolean boolean14 = linkedList7.remove((java.lang.Object) linkedList11);
        boolean boolean15 = linkedList0.add((java.lang.Object) boolean14);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        int int4 = linkedList0.size();
        int int5 = linkedList0.size();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        int int7 = linkedList6.size();
        linkedList6.clear();
        int int9 = linkedList6.size();
        int int10 = linkedList6.size();
        boolean boolean11 = linkedList0.remove((java.lang.Object) linkedList6);
        int int12 = linkedList6.size();
        system.testclass.LinkedList linkedList13 = new system.testclass.LinkedList();
        int int14 = linkedList13.size();
        linkedList13.clear();
        java.lang.Class<?> wildcardClass16 = linkedList13.getClass();
        boolean boolean17 = linkedList6.add((java.lang.Object) linkedList13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList6", linkedList6.repOK_1());
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        int int4 = linkedList0.size();
        int int5 = linkedList0.size();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass8 = linkedList7.getClass();
        boolean boolean9 = linkedList6.remove((java.lang.Object) wildcardClass8);
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        int int11 = linkedList10.size();
        linkedList10.clear();
        int int13 = linkedList10.size();
        java.lang.Class<?> wildcardClass14 = linkedList10.getClass();
        boolean boolean15 = linkedList6.remove((java.lang.Object) linkedList10);
        boolean boolean16 = linkedList0.remove((java.lang.Object) boolean15);
        boolean boolean18 = linkedList0.add((java.lang.Object) true);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean2 = linkedList0.remove((java.lang.Object) 1.0d);
        int int3 = linkedList0.size();
        java.lang.Object obj4 = null;
        boolean boolean5 = linkedList0.remove(obj4);
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass8 = linkedList7.getClass();
        boolean boolean9 = linkedList6.remove((java.lang.Object) wildcardClass8);
        int int10 = linkedList6.size();
        linkedList6.clear();
        java.lang.Class<?> wildcardClass12 = linkedList6.getClass();
        boolean boolean13 = linkedList0.add((java.lang.Object) wildcardClass12);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        system.testclass.LinkedList linkedList2 = new system.testclass.LinkedList();
        boolean boolean4 = linkedList2.remove((java.lang.Object) (byte) -1);
        boolean boolean6 = linkedList2.remove((java.lang.Object) 0L);
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass9 = linkedList8.getClass();
        boolean boolean10 = linkedList7.remove((java.lang.Object) wildcardClass9);
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        int int12 = linkedList11.size();
        linkedList11.clear();
        int int14 = linkedList11.size();
        java.lang.Class<?> wildcardClass15 = linkedList11.getClass();
        boolean boolean16 = linkedList7.remove((java.lang.Object) linkedList11);
        system.testclass.LinkedList linkedList17 = new system.testclass.LinkedList();
        linkedList17.clear();
        boolean boolean20 = linkedList17.remove((java.lang.Object) (-1L));
        boolean boolean21 = linkedList7.remove((java.lang.Object) boolean20);
        int int22 = linkedList7.size();
        boolean boolean23 = linkedList2.remove((java.lang.Object) int22);
        boolean boolean24 = linkedList0.add((java.lang.Object) linkedList2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        boolean boolean3 = linkedList0.remove((java.lang.Object) (-1L));
        boolean boolean5 = linkedList0.remove((java.lang.Object) (-1L));
        int int6 = linkedList0.size();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        int int8 = linkedList7.size();
        linkedList7.clear();
        int int10 = linkedList7.size();
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass13 = linkedList12.getClass();
        boolean boolean14 = linkedList11.remove((java.lang.Object) wildcardClass13);
        int int15 = linkedList11.size();
        linkedList11.clear();
        java.lang.Class<?> wildcardClass17 = linkedList11.getClass();
        boolean boolean18 = linkedList7.remove((java.lang.Object) wildcardClass17);
        boolean boolean19 = linkedList0.remove((java.lang.Object) linkedList7);
        int int20 = linkedList0.size();
        boolean boolean22 = linkedList0.remove((java.lang.Object) (short) 10);
        system.testclass.LinkedList linkedList23 = new system.testclass.LinkedList();
        int int24 = linkedList23.size();
        linkedList23.clear();
        int int26 = linkedList23.size();
        int int27 = linkedList23.size();
        int int28 = linkedList23.size();
        system.testclass.LinkedList linkedList29 = new system.testclass.LinkedList();
        int int30 = linkedList29.size();
        linkedList29.clear();
        int int32 = linkedList29.size();
        int int33 = linkedList29.size();
        boolean boolean34 = linkedList23.remove((java.lang.Object) linkedList29);
        linkedList29.clear();
        boolean boolean36 = linkedList0.add((java.lang.Object) linkedList29);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList1 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass2 = linkedList1.getClass();
        boolean boolean3 = linkedList0.remove((java.lang.Object) wildcardClass2);
        int int4 = linkedList0.size();
        boolean boolean6 = linkedList0.add((java.lang.Object) 100L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean2 = linkedList0.remove((java.lang.Object) 1.0d);
        boolean boolean4 = linkedList0.remove((java.lang.Object) 10);
        java.lang.Object obj5 = null;
        boolean boolean6 = linkedList0.add(obj5);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean2 = linkedList0.remove((java.lang.Object) 1.0d);
        linkedList0.clear();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        int int5 = linkedList4.size();
        linkedList4.clear();
        boolean boolean8 = linkedList4.remove((java.lang.Object) "hi!");
        boolean boolean9 = linkedList0.add((java.lang.Object) boolean8);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList1 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass2 = linkedList1.getClass();
        boolean boolean3 = linkedList0.remove((java.lang.Object) wildcardClass2);
        int int4 = linkedList0.size();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        boolean boolean7 = linkedList5.remove((java.lang.Object) 1.0d);
        boolean boolean9 = linkedList5.remove((java.lang.Object) 10);
        boolean boolean11 = linkedList5.remove((java.lang.Object) 1L);
        boolean boolean13 = linkedList5.remove((java.lang.Object) 10.0d);
        linkedList5.clear();
        boolean boolean15 = linkedList0.add((java.lang.Object) linkedList5);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean2 = linkedList0.remove((java.lang.Object) 1.0d);
        boolean boolean4 = linkedList0.remove((java.lang.Object) 10);
        boolean boolean6 = linkedList0.remove((java.lang.Object) 1L);
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        boolean boolean9 = linkedList7.remove((java.lang.Object) 1.0d);
        boolean boolean11 = linkedList7.remove((java.lang.Object) 10);
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass13 = linkedList12.getClass();
        boolean boolean14 = linkedList7.remove((java.lang.Object) linkedList12);
        boolean boolean15 = linkedList0.remove((java.lang.Object) linkedList7);
        system.testclass.LinkedList linkedList16 = new system.testclass.LinkedList();
        int int17 = linkedList16.size();
        linkedList16.clear();
        int int19 = linkedList16.size();
        int int20 = linkedList16.size();
        int int21 = linkedList16.size();
        boolean boolean22 = linkedList0.add((java.lang.Object) int21);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        system.testclass.LinkedList linkedList3 = new system.testclass.LinkedList();
        boolean boolean5 = linkedList3.remove((java.lang.Object) 1.0d);
        linkedList3.clear();
        java.lang.Class<?> wildcardClass7 = linkedList3.getClass();
        boolean boolean8 = linkedList0.remove((java.lang.Object) wildcardClass7);
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        linkedList9.clear();
        int int11 = linkedList9.size();
        linkedList9.clear();
        system.testclass.LinkedList linkedList13 = new system.testclass.LinkedList();
        linkedList13.clear();
        boolean boolean16 = linkedList13.remove((java.lang.Object) (-1L));
        boolean boolean18 = linkedList13.remove((java.lang.Object) (-1L));
        int int19 = linkedList13.size();
        system.testclass.LinkedList linkedList20 = new system.testclass.LinkedList();
        int int21 = linkedList20.size();
        linkedList20.clear();
        int int23 = linkedList20.size();
        system.testclass.LinkedList linkedList24 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList25 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass26 = linkedList25.getClass();
        boolean boolean27 = linkedList24.remove((java.lang.Object) wildcardClass26);
        int int28 = linkedList24.size();
        linkedList24.clear();
        java.lang.Class<?> wildcardClass30 = linkedList24.getClass();
        boolean boolean31 = linkedList20.remove((java.lang.Object) wildcardClass30);
        boolean boolean32 = linkedList13.remove((java.lang.Object) linkedList20);
        boolean boolean33 = linkedList9.remove((java.lang.Object) linkedList20);
        boolean boolean34 = linkedList0.add((java.lang.Object) linkedList9);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean2 = linkedList0.remove((java.lang.Object) 1.0d);
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean6 = linkedList0.remove((java.lang.Object) (short) 10);
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        boolean boolean9 = linkedList7.remove((java.lang.Object) 1.0d);
        int int10 = linkedList7.size();
        java.lang.Object obj11 = null;
        boolean boolean12 = linkedList7.remove(obj11);
        boolean boolean13 = linkedList0.remove(obj11);
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        int int15 = linkedList14.size();
        linkedList14.clear();
        int int17 = linkedList14.size();
        linkedList14.clear();
        linkedList14.clear();
        boolean boolean20 = linkedList0.add((java.lang.Object) linkedList14);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean2 = linkedList0.remove((java.lang.Object) 1.0d);
        boolean boolean4 = linkedList0.remove((java.lang.Object) 10);
        boolean boolean6 = linkedList0.remove((java.lang.Object) 1L);
        boolean boolean8 = linkedList0.remove((java.lang.Object) 10.0d);
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        int int10 = linkedList9.size();
        linkedList9.clear();
        int int12 = linkedList9.size();
        int int13 = linkedList9.size();
        int int14 = linkedList9.size();
        system.testclass.LinkedList linkedList15 = new system.testclass.LinkedList();
        int int16 = linkedList15.size();
        linkedList15.clear();
        int int18 = linkedList15.size();
        int int19 = linkedList15.size();
        boolean boolean20 = linkedList9.remove((java.lang.Object) linkedList15);
        boolean boolean21 = linkedList0.add((java.lang.Object) linkedList9);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        boolean boolean3 = linkedList0.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        boolean boolean6 = linkedList4.remove((java.lang.Object) (byte) -1);
        boolean boolean7 = linkedList0.remove((java.lang.Object) linkedList4);
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        linkedList8.clear();
        boolean boolean11 = linkedList8.remove((java.lang.Object) (-1L));
        boolean boolean13 = linkedList8.remove((java.lang.Object) (-1L));
        java.lang.Class<?> wildcardClass14 = linkedList8.getClass();
        boolean boolean15 = linkedList0.add((java.lang.Object) linkedList8);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        boolean boolean4 = linkedList0.remove((java.lang.Object) "hi!");
        boolean boolean6 = linkedList0.add((java.lang.Object) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        int int4 = linkedList0.size();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        linkedList5.clear();
        linkedList5.clear();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        linkedList8.clear();
        int int10 = linkedList8.size();
        boolean boolean11 = linkedList5.remove((java.lang.Object) linkedList8);
        java.lang.Class<?> wildcardClass12 = linkedList5.getClass();
        boolean boolean13 = linkedList0.add((java.lang.Object) wildcardClass12);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        boolean boolean4 = linkedList0.remove((java.lang.Object) "hi!");
        int int5 = linkedList0.size();
        int int6 = linkedList0.size();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        linkedList7.clear();
        boolean boolean10 = linkedList7.remove((java.lang.Object) (-1L));
        boolean boolean12 = linkedList7.remove((java.lang.Object) (-1L));
        int int13 = linkedList7.size();
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        boolean boolean16 = linkedList14.remove((java.lang.Object) 1.0d);
        int int17 = linkedList14.size();
        boolean boolean18 = linkedList7.remove((java.lang.Object) int17);
        java.lang.Class<?> wildcardClass19 = linkedList7.getClass();
        boolean boolean20 = linkedList0.add((java.lang.Object) linkedList7);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        linkedList0.clear();
        linkedList0.clear();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        int int7 = linkedList6.size();
        linkedList6.clear();
        int int9 = linkedList6.size();
        boolean boolean10 = linkedList0.add((java.lang.Object) int9);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        boolean boolean4 = linkedList0.remove((java.lang.Object) "hi!");
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        boolean boolean7 = linkedList5.remove((java.lang.Object) (byte) -1);
        java.lang.Class<?> wildcardClass8 = linkedList5.getClass();
        boolean boolean9 = linkedList0.add((java.lang.Object) wildcardClass8);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        int int4 = linkedList0.size();
        int int5 = linkedList0.size();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        int int7 = linkedList6.size();
        linkedList6.clear();
        int int9 = linkedList6.size();
        int int10 = linkedList6.size();
        boolean boolean11 = linkedList0.remove((java.lang.Object) linkedList6);
        linkedList6.clear();
        int int13 = linkedList6.size();
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        boolean boolean16 = linkedList14.remove((java.lang.Object) (byte) -1);
        boolean boolean18 = linkedList14.remove((java.lang.Object) '#');
        linkedList14.clear();
        boolean boolean20 = linkedList6.remove((java.lang.Object) linkedList14);
        system.testclass.LinkedList linkedList21 = new system.testclass.LinkedList();
        boolean boolean23 = linkedList21.remove((java.lang.Object) 1.0d);
        linkedList21.clear();
        linkedList21.clear();
        boolean boolean26 = linkedList6.add((java.lang.Object) linkedList21);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList6", linkedList6.repOK_1());
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList1 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass2 = linkedList1.getClass();
        boolean boolean3 = linkedList0.remove((java.lang.Object) wildcardClass2);
        int int4 = linkedList0.size();
        linkedList0.clear();
        int int6 = linkedList0.size();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        linkedList7.clear();
        boolean boolean10 = linkedList7.remove((java.lang.Object) (-1));
        boolean boolean11 = linkedList0.remove((java.lang.Object) linkedList7);
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        boolean boolean14 = linkedList12.remove((java.lang.Object) 1.0d);
        boolean boolean16 = linkedList12.remove((java.lang.Object) 10);
        boolean boolean17 = linkedList0.add((java.lang.Object) linkedList12);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean2 = linkedList0.remove((java.lang.Object) 1.0d);
        int int3 = linkedList0.size();
        int int4 = linkedList0.size();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        boolean boolean7 = linkedList5.remove((java.lang.Object) 1.0d);
        linkedList5.clear();
        linkedList5.clear();
        boolean boolean11 = linkedList5.remove((java.lang.Object) (short) 10);
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        boolean boolean14 = linkedList12.remove((java.lang.Object) 1.0d);
        int int15 = linkedList12.size();
        java.lang.Object obj16 = null;
        boolean boolean17 = linkedList12.remove(obj16);
        boolean boolean18 = linkedList5.remove(obj16);
        boolean boolean19 = linkedList0.add((java.lang.Object) boolean18);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        int int4 = linkedList0.size();
        linkedList0.clear();
        int int6 = linkedList0.size();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        linkedList7.clear();
        boolean boolean10 = linkedList7.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        boolean boolean13 = linkedList11.remove((java.lang.Object) (byte) -1);
        boolean boolean14 = linkedList7.remove((java.lang.Object) linkedList11);
        boolean boolean15 = linkedList0.add((java.lang.Object) linkedList11);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        system.testclass.LinkedList linkedList2 = new system.testclass.LinkedList();
        linkedList2.clear();
        linkedList2.clear();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        linkedList5.clear();
        int int7 = linkedList5.size();
        boolean boolean8 = linkedList2.remove((java.lang.Object) linkedList5);
        linkedList5.clear();
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        linkedList10.clear();
        boolean boolean13 = linkedList10.remove((java.lang.Object) (-1L));
        boolean boolean14 = linkedList5.remove((java.lang.Object) linkedList10);
        boolean boolean15 = linkedList0.add((java.lang.Object) linkedList5);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        boolean boolean3 = linkedList0.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        boolean boolean6 = linkedList4.remove((java.lang.Object) (byte) -1);
        boolean boolean7 = linkedList0.remove((java.lang.Object) linkedList4);
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        int int9 = linkedList8.size();
        linkedList8.clear();
        boolean boolean12 = linkedList8.remove((java.lang.Object) "hi!");
        int int13 = linkedList8.size();
        linkedList8.clear();
        boolean boolean15 = linkedList0.add((java.lang.Object) linkedList8);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        boolean boolean3 = linkedList0.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        boolean boolean6 = linkedList4.remove((java.lang.Object) (byte) -1);
        boolean boolean7 = linkedList0.remove((java.lang.Object) linkedList4);
        linkedList0.clear();
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        int int10 = linkedList9.size();
        linkedList9.clear();
        int int12 = linkedList9.size();
        linkedList9.clear();
        linkedList9.clear();
        int int15 = linkedList9.size();
        boolean boolean17 = linkedList9.remove((java.lang.Object) ' ');
        linkedList9.clear();
        int int19 = linkedList9.size();
        boolean boolean20 = linkedList0.add((java.lang.Object) linkedList9);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        int int4 = linkedList0.size();
        int int5 = linkedList0.size();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        int int7 = linkedList6.size();
        linkedList6.clear();
        int int9 = linkedList6.size();
        int int10 = linkedList6.size();
        boolean boolean11 = linkedList0.remove((java.lang.Object) linkedList6);
        int int12 = linkedList6.size();
        linkedList6.clear();
        linkedList6.clear();
        system.testclass.LinkedList linkedList15 = new system.testclass.LinkedList();
        int int16 = linkedList15.size();
        linkedList15.clear();
        int int18 = linkedList15.size();
        linkedList15.clear();
        linkedList15.clear();
        linkedList15.clear();
        boolean boolean22 = linkedList6.add((java.lang.Object) linkedList15);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList6", linkedList6.repOK_1());
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean2 = linkedList0.remove((java.lang.Object) (byte) -1);
        system.testclass.LinkedList linkedList3 = new system.testclass.LinkedList();
        int int4 = linkedList3.size();
        linkedList3.clear();
        int int6 = linkedList3.size();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass9 = linkedList8.getClass();
        boolean boolean10 = linkedList7.remove((java.lang.Object) wildcardClass9);
        int int11 = linkedList7.size();
        linkedList7.clear();
        boolean boolean13 = linkedList3.remove((java.lang.Object) linkedList7);
        linkedList7.clear();
        int int15 = linkedList7.size();
        system.testclass.LinkedList linkedList16 = new system.testclass.LinkedList();
        linkedList16.clear();
        boolean boolean19 = linkedList16.remove((java.lang.Object) (-1L));
        boolean boolean21 = linkedList16.remove((java.lang.Object) (-1L));
        int int22 = linkedList16.size();
        boolean boolean23 = linkedList7.remove((java.lang.Object) linkedList16);
        boolean boolean24 = linkedList0.remove((java.lang.Object) linkedList16);
        system.testclass.LinkedList linkedList25 = new system.testclass.LinkedList();
        int int26 = linkedList25.size();
        linkedList25.clear();
        int int28 = linkedList25.size();
        int int29 = linkedList25.size();
        int int30 = linkedList25.size();
        system.testclass.LinkedList linkedList31 = new system.testclass.LinkedList();
        int int32 = linkedList31.size();
        linkedList31.clear();
        int int34 = linkedList31.size();
        int int35 = linkedList31.size();
        boolean boolean36 = linkedList25.remove((java.lang.Object) linkedList31);
        int int37 = linkedList31.size();
        linkedList31.clear();
        boolean boolean39 = linkedList0.add((java.lang.Object) linkedList31);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        int int4 = linkedList0.size();
        int int5 = linkedList0.size();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        int int7 = linkedList6.size();
        linkedList6.clear();
        int int9 = linkedList6.size();
        int int10 = linkedList6.size();
        boolean boolean11 = linkedList0.remove((java.lang.Object) linkedList6);
        linkedList6.clear();
        int int13 = linkedList6.size();
        linkedList6.clear();
        system.testclass.LinkedList linkedList15 = new system.testclass.LinkedList();
        int int16 = linkedList15.size();
        linkedList15.clear();
        int int18 = linkedList15.size();
        int int19 = linkedList15.size();
        int int20 = linkedList15.size();
        system.testclass.LinkedList linkedList21 = new system.testclass.LinkedList();
        int int22 = linkedList21.size();
        linkedList21.clear();
        int int24 = linkedList21.size();
        int int25 = linkedList21.size();
        boolean boolean26 = linkedList15.remove((java.lang.Object) linkedList21);
        linkedList21.clear();
        int int28 = linkedList21.size();
        system.testclass.LinkedList linkedList29 = new system.testclass.LinkedList();
        boolean boolean31 = linkedList29.remove((java.lang.Object) (byte) -1);
        boolean boolean33 = linkedList29.remove((java.lang.Object) '#');
        linkedList29.clear();
        boolean boolean35 = linkedList21.remove((java.lang.Object) linkedList29);
        int int36 = linkedList21.size();
        int int37 = linkedList21.size();
        boolean boolean38 = linkedList6.add((java.lang.Object) int37);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList6", linkedList6.repOK_1());
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        int int4 = linkedList0.size();
        int int5 = linkedList0.size();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass8 = linkedList7.getClass();
        boolean boolean9 = linkedList6.remove((java.lang.Object) wildcardClass8);
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        int int11 = linkedList10.size();
        linkedList10.clear();
        int int13 = linkedList10.size();
        java.lang.Class<?> wildcardClass14 = linkedList10.getClass();
        boolean boolean15 = linkedList6.remove((java.lang.Object) linkedList10);
        boolean boolean16 = linkedList0.remove((java.lang.Object) boolean15);
        system.testclass.LinkedList linkedList17 = new system.testclass.LinkedList();
        linkedList17.clear();
        boolean boolean20 = linkedList17.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList21 = new system.testclass.LinkedList();
        boolean boolean23 = linkedList21.remove((java.lang.Object) (byte) -1);
        boolean boolean24 = linkedList17.remove((java.lang.Object) linkedList21);
        boolean boolean26 = linkedList17.remove((java.lang.Object) (byte) -1);
        boolean boolean27 = linkedList0.add((java.lang.Object) boolean26);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass6 = linkedList5.getClass();
        boolean boolean7 = linkedList4.remove((java.lang.Object) wildcardClass6);
        int int8 = linkedList4.size();
        linkedList4.clear();
        boolean boolean10 = linkedList0.remove((java.lang.Object) linkedList4);
        boolean boolean12 = linkedList0.add((java.lang.Object) 100L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList1 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass2 = linkedList1.getClass();
        boolean boolean3 = linkedList0.remove((java.lang.Object) wildcardClass2);
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        int int5 = linkedList4.size();
        linkedList4.clear();
        int int7 = linkedList4.size();
        java.lang.Class<?> wildcardClass8 = linkedList4.getClass();
        boolean boolean9 = linkedList0.remove((java.lang.Object) linkedList4);
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        linkedList10.clear();
        boolean boolean13 = linkedList10.remove((java.lang.Object) (-1L));
        boolean boolean14 = linkedList0.remove((java.lang.Object) boolean13);
        int int15 = linkedList0.size();
        linkedList0.clear();
        linkedList0.clear();
        system.testclass.LinkedList linkedList18 = new system.testclass.LinkedList();
        boolean boolean20 = linkedList18.remove((java.lang.Object) 1.0d);
        int int21 = linkedList18.size();
        java.lang.Object obj22 = null;
        boolean boolean23 = linkedList18.remove(obj22);
        boolean boolean24 = linkedList0.add(obj22);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        int int2 = linkedList0.size();
        linkedList0.clear();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        linkedList4.clear();
        boolean boolean7 = linkedList4.remove((java.lang.Object) (-1L));
        boolean boolean9 = linkedList4.remove((java.lang.Object) (-1L));
        int int10 = linkedList4.size();
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        int int12 = linkedList11.size();
        linkedList11.clear();
        int int14 = linkedList11.size();
        system.testclass.LinkedList linkedList15 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList16 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass17 = linkedList16.getClass();
        boolean boolean18 = linkedList15.remove((java.lang.Object) wildcardClass17);
        int int19 = linkedList15.size();
        linkedList15.clear();
        java.lang.Class<?> wildcardClass21 = linkedList15.getClass();
        boolean boolean22 = linkedList11.remove((java.lang.Object) wildcardClass21);
        boolean boolean23 = linkedList4.remove((java.lang.Object) linkedList11);
        boolean boolean24 = linkedList0.remove((java.lang.Object) linkedList11);
        java.lang.Object obj25 = null;
        boolean boolean26 = linkedList0.add(obj25);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        system.testclass.LinkedList linkedList3 = new system.testclass.LinkedList();
        linkedList3.clear();
        int int5 = linkedList3.size();
        boolean boolean6 = linkedList0.remove((java.lang.Object) linkedList3);
        linkedList3.clear();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        linkedList8.clear();
        boolean boolean11 = linkedList8.remove((java.lang.Object) (-1L));
        boolean boolean12 = linkedList3.remove((java.lang.Object) linkedList8);
        system.testclass.LinkedList linkedList13 = new system.testclass.LinkedList();
        int int14 = linkedList13.size();
        linkedList13.clear();
        boolean boolean17 = linkedList13.remove((java.lang.Object) "hi!");
        int int18 = linkedList13.size();
        int int19 = linkedList13.size();
        system.testclass.LinkedList linkedList20 = new system.testclass.LinkedList();
        linkedList20.clear();
        linkedList20.clear();
        system.testclass.LinkedList linkedList23 = new system.testclass.LinkedList();
        linkedList23.clear();
        int int25 = linkedList23.size();
        boolean boolean26 = linkedList20.remove((java.lang.Object) linkedList23);
        int int27 = linkedList23.size();
        java.lang.Class<?> wildcardClass28 = linkedList23.getClass();
        boolean boolean29 = linkedList13.remove((java.lang.Object) wildcardClass28);
        boolean boolean30 = linkedList3.add((java.lang.Object) wildcardClass28);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList3", linkedList3.repOK_1());
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean2 = linkedList0.remove((java.lang.Object) 1.0d);
        int int3 = linkedList0.size();
        java.lang.Object obj4 = null;
        boolean boolean5 = linkedList0.remove(obj4);
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        int int7 = linkedList6.size();
        linkedList6.clear();
        int int9 = linkedList6.size();
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass12 = linkedList11.getClass();
        boolean boolean13 = linkedList10.remove((java.lang.Object) wildcardClass12);
        int int14 = linkedList10.size();
        linkedList10.clear();
        boolean boolean16 = linkedList6.remove((java.lang.Object) linkedList10);
        linkedList10.clear();
        int int18 = linkedList10.size();
        system.testclass.LinkedList linkedList19 = new system.testclass.LinkedList();
        linkedList19.clear();
        boolean boolean22 = linkedList19.remove((java.lang.Object) (-1L));
        boolean boolean24 = linkedList19.remove((java.lang.Object) (-1L));
        int int25 = linkedList19.size();
        boolean boolean26 = linkedList10.remove((java.lang.Object) linkedList19);
        boolean boolean27 = linkedList0.remove((java.lang.Object) linkedList10);
        system.testclass.LinkedList linkedList28 = new system.testclass.LinkedList();
        int int29 = linkedList28.size();
        linkedList28.clear();
        int int31 = linkedList28.size();
        int int32 = linkedList28.size();
        int int33 = linkedList28.size();
        system.testclass.LinkedList linkedList34 = new system.testclass.LinkedList();
        int int35 = linkedList34.size();
        linkedList34.clear();
        int int37 = linkedList34.size();
        int int38 = linkedList34.size();
        boolean boolean39 = linkedList28.remove((java.lang.Object) linkedList34);
        linkedList34.clear();
        int int41 = linkedList34.size();
        linkedList34.clear();
        system.testclass.LinkedList linkedList43 = new system.testclass.LinkedList();
        linkedList43.clear();
        boolean boolean46 = linkedList43.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList47 = new system.testclass.LinkedList();
        boolean boolean49 = linkedList47.remove((java.lang.Object) (byte) -1);
        boolean boolean50 = linkedList43.remove((java.lang.Object) linkedList47);
        boolean boolean51 = linkedList34.remove((java.lang.Object) linkedList43);
        boolean boolean52 = linkedList0.add((java.lang.Object) boolean51);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        boolean boolean3 = linkedList0.remove((java.lang.Object) (-1L));
        linkedList0.clear();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass7 = linkedList6.getClass();
        boolean boolean8 = linkedList5.remove((java.lang.Object) wildcardClass7);
        int int9 = linkedList5.size();
        linkedList5.clear();
        int int11 = linkedList5.size();
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        linkedList12.clear();
        boolean boolean15 = linkedList12.remove((java.lang.Object) (-1));
        boolean boolean16 = linkedList5.remove((java.lang.Object) linkedList12);
        system.testclass.LinkedList linkedList17 = new system.testclass.LinkedList();
        boolean boolean19 = linkedList17.remove((java.lang.Object) 1.0d);
        boolean boolean21 = linkedList17.remove((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass22 = linkedList17.getClass();
        boolean boolean23 = linkedList5.remove((java.lang.Object) wildcardClass22);
        boolean boolean24 = linkedList0.add((java.lang.Object) linkedList5);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean2 = linkedList0.remove((java.lang.Object) 1.0d);
        boolean boolean4 = linkedList0.remove((java.lang.Object) 10);
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass6 = linkedList5.getClass();
        boolean boolean7 = linkedList0.remove((java.lang.Object) linkedList5);
        linkedList0.clear();
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        boolean boolean11 = linkedList9.remove((java.lang.Object) 1.0d);
        linkedList9.clear();
        int int13 = linkedList9.size();
        boolean boolean14 = linkedList0.add((java.lang.Object) int13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        boolean boolean3 = linkedList0.remove((java.lang.Object) (-1L));
        boolean boolean5 = linkedList0.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        int int7 = linkedList6.size();
        linkedList6.clear();
        int int9 = linkedList6.size();
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass12 = linkedList11.getClass();
        boolean boolean13 = linkedList10.remove((java.lang.Object) wildcardClass12);
        int int14 = linkedList10.size();
        linkedList10.clear();
        java.lang.Class<?> wildcardClass16 = linkedList10.getClass();
        boolean boolean17 = linkedList6.remove((java.lang.Object) wildcardClass16);
        boolean boolean18 = linkedList0.remove((java.lang.Object) boolean17);
        system.testclass.LinkedList linkedList19 = new system.testclass.LinkedList();
        boolean boolean21 = linkedList19.remove((java.lang.Object) 1.0d);
        linkedList19.clear();
        int int23 = linkedList19.size();
        boolean boolean24 = linkedList0.add((java.lang.Object) int23);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        boolean boolean3 = linkedList0.remove((java.lang.Object) (-1L));
        boolean boolean5 = linkedList0.remove((java.lang.Object) (-1L));
        int int6 = linkedList0.size();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        int int8 = linkedList7.size();
        linkedList7.clear();
        int int10 = linkedList7.size();
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass13 = linkedList12.getClass();
        boolean boolean14 = linkedList11.remove((java.lang.Object) wildcardClass13);
        int int15 = linkedList11.size();
        linkedList11.clear();
        java.lang.Class<?> wildcardClass17 = linkedList11.getClass();
        boolean boolean18 = linkedList7.remove((java.lang.Object) wildcardClass17);
        boolean boolean19 = linkedList0.remove((java.lang.Object) linkedList7);
        int int20 = linkedList0.size();
        boolean boolean22 = linkedList0.remove((java.lang.Object) (short) 10);
        int int23 = linkedList0.size();
        system.testclass.LinkedList linkedList24 = new system.testclass.LinkedList();
        int int25 = linkedList24.size();
        linkedList24.clear();
        int int27 = linkedList24.size();
        linkedList24.clear();
        boolean boolean30 = linkedList24.remove((java.lang.Object) (byte) 1);
        linkedList24.clear();
        boolean boolean32 = linkedList0.add((java.lang.Object) linkedList24);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        system.testclass.LinkedList linkedList3 = new system.testclass.LinkedList();
        linkedList3.clear();
        int int5 = linkedList3.size();
        boolean boolean6 = linkedList0.remove((java.lang.Object) linkedList3);
        int int7 = linkedList0.size();
        linkedList0.clear();
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        int int10 = linkedList9.size();
        linkedList9.clear();
        int int12 = linkedList9.size();
        system.testclass.LinkedList linkedList13 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass15 = linkedList14.getClass();
        boolean boolean16 = linkedList13.remove((java.lang.Object) wildcardClass15);
        int int17 = linkedList13.size();
        linkedList13.clear();
        boolean boolean19 = linkedList9.remove((java.lang.Object) linkedList13);
        linkedList13.clear();
        linkedList13.clear();
        boolean boolean22 = linkedList0.add((java.lang.Object) linkedList13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        int int4 = linkedList0.size();
        int int5 = linkedList0.size();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        int int7 = linkedList6.size();
        linkedList6.clear();
        int int9 = linkedList6.size();
        int int10 = linkedList6.size();
        boolean boolean11 = linkedList0.remove((java.lang.Object) linkedList6);
        linkedList6.clear();
        int int13 = linkedList6.size();
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        boolean boolean16 = linkedList14.remove((java.lang.Object) (byte) -1);
        boolean boolean18 = linkedList14.remove((java.lang.Object) '#');
        linkedList14.clear();
        boolean boolean20 = linkedList6.remove((java.lang.Object) linkedList14);
        int int21 = linkedList6.size();
        system.testclass.LinkedList linkedList22 = new system.testclass.LinkedList();
        boolean boolean24 = linkedList22.remove((java.lang.Object) 1.0d);
        boolean boolean26 = linkedList22.remove((java.lang.Object) 10);
        boolean boolean28 = linkedList22.remove((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass29 = linkedList22.getClass();
        boolean boolean30 = linkedList6.add((java.lang.Object) linkedList22);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList6", linkedList6.repOK_1());
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean2 = linkedList0.remove((java.lang.Object) 1.0d);
        int int3 = linkedList0.size();
        int int4 = linkedList0.size();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        boolean boolean7 = linkedList5.remove((java.lang.Object) (byte) -1);
        boolean boolean9 = linkedList5.remove((java.lang.Object) 0L);
        int int10 = linkedList5.size();
        boolean boolean11 = linkedList0.remove((java.lang.Object) linkedList5);
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        boolean boolean14 = linkedList12.remove((java.lang.Object) 1.0d);
        boolean boolean16 = linkedList12.remove((java.lang.Object) 10);
        boolean boolean18 = linkedList12.remove((java.lang.Object) 1L);
        system.testclass.LinkedList linkedList19 = new system.testclass.LinkedList();
        boolean boolean21 = linkedList19.remove((java.lang.Object) 1.0d);
        boolean boolean23 = linkedList19.remove((java.lang.Object) 10);
        system.testclass.LinkedList linkedList24 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass25 = linkedList24.getClass();
        boolean boolean26 = linkedList19.remove((java.lang.Object) linkedList24);
        boolean boolean27 = linkedList12.remove((java.lang.Object) linkedList19);
        boolean boolean28 = linkedList5.add((java.lang.Object) linkedList19);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList5", linkedList5.repOK_1());
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean2 = linkedList0.remove((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedList0.remove((java.lang.Object) '#');
        int int5 = linkedList0.size();
        java.lang.Object obj6 = null;
        boolean boolean7 = linkedList0.add(obj6);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass6 = linkedList5.getClass();
        boolean boolean7 = linkedList4.remove((java.lang.Object) wildcardClass6);
        int int8 = linkedList4.size();
        linkedList4.clear();
        boolean boolean10 = linkedList0.remove((java.lang.Object) linkedList4);
        linkedList4.clear();
        int int12 = linkedList4.size();
        system.testclass.LinkedList linkedList13 = new system.testclass.LinkedList();
        linkedList13.clear();
        boolean boolean16 = linkedList13.remove((java.lang.Object) (-1L));
        boolean boolean18 = linkedList13.remove((java.lang.Object) (-1L));
        int int19 = linkedList13.size();
        boolean boolean20 = linkedList4.remove((java.lang.Object) linkedList13);
        boolean boolean22 = linkedList4.add((java.lang.Object) 0L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList4", linkedList4.repOK_1());
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        boolean boolean4 = linkedList0.remove((java.lang.Object) "hi!");
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        boolean boolean7 = linkedList5.remove((java.lang.Object) (byte) -1);
        boolean boolean9 = linkedList5.remove((java.lang.Object) 0L);
        int int10 = linkedList5.size();
        int int11 = linkedList5.size();
        boolean boolean12 = linkedList0.add((java.lang.Object) int11);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList1 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass2 = linkedList1.getClass();
        boolean boolean3 = linkedList0.remove((java.lang.Object) wildcardClass2);
        linkedList0.clear();
        linkedList0.clear();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        linkedList6.clear();
        boolean boolean9 = linkedList6.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        boolean boolean12 = linkedList10.remove((java.lang.Object) (byte) -1);
        boolean boolean13 = linkedList6.remove((java.lang.Object) linkedList10);
        boolean boolean15 = linkedList6.remove((java.lang.Object) (byte) -1);
        boolean boolean16 = linkedList0.add((java.lang.Object) boolean15);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        int int2 = linkedList0.size();
        linkedList0.clear();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        boolean boolean6 = linkedList4.remove((java.lang.Object) 1.0d);
        int int7 = linkedList4.size();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        int int9 = linkedList8.size();
        linkedList8.clear();
        int int11 = linkedList8.size();
        linkedList8.clear();
        java.lang.Class<?> wildcardClass13 = linkedList8.getClass();
        boolean boolean14 = linkedList4.remove((java.lang.Object) linkedList8);
        linkedList4.clear();
        boolean boolean16 = linkedList0.add((java.lang.Object) linkedList4);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        system.testclass.LinkedList linkedList3 = new system.testclass.LinkedList();
        linkedList3.clear();
        boolean boolean6 = linkedList3.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass9 = linkedList8.getClass();
        boolean boolean10 = linkedList7.remove((java.lang.Object) wildcardClass9);
        java.lang.Class<?> wildcardClass11 = linkedList7.getClass();
        boolean boolean12 = linkedList3.remove((java.lang.Object) wildcardClass11);
        boolean boolean13 = linkedList0.remove((java.lang.Object) boolean12);
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        linkedList14.clear();
        linkedList14.clear();
        system.testclass.LinkedList linkedList17 = new system.testclass.LinkedList();
        linkedList17.clear();
        boolean boolean20 = linkedList17.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList21 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList22 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass23 = linkedList22.getClass();
        boolean boolean24 = linkedList21.remove((java.lang.Object) wildcardClass23);
        java.lang.Class<?> wildcardClass25 = linkedList21.getClass();
        boolean boolean26 = linkedList17.remove((java.lang.Object) wildcardClass25);
        boolean boolean27 = linkedList14.remove((java.lang.Object) boolean26);
        boolean boolean29 = linkedList14.remove((java.lang.Object) ' ');
        boolean boolean30 = linkedList0.remove((java.lang.Object) linkedList14);
        system.testclass.LinkedList linkedList31 = new system.testclass.LinkedList();
        boolean boolean33 = linkedList31.remove((java.lang.Object) (byte) -1);
        boolean boolean35 = linkedList31.remove((java.lang.Object) 0L);
        linkedList31.clear();
        boolean boolean37 = linkedList0.add((java.lang.Object) linkedList31);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        int int4 = linkedList0.size();
        int int5 = linkedList0.size();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        int int7 = linkedList6.size();
        linkedList6.clear();
        int int9 = linkedList6.size();
        int int10 = linkedList6.size();
        boolean boolean11 = linkedList0.remove((java.lang.Object) linkedList6);
        linkedList6.clear();
        int int13 = linkedList6.size();
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        boolean boolean16 = linkedList14.remove((java.lang.Object) (byte) -1);
        boolean boolean18 = linkedList14.remove((java.lang.Object) '#');
        linkedList14.clear();
        boolean boolean20 = linkedList6.remove((java.lang.Object) linkedList14);
        int int21 = linkedList6.size();
        system.testclass.LinkedList linkedList22 = new system.testclass.LinkedList();
        linkedList22.clear();
        linkedList22.clear();
        system.testclass.LinkedList linkedList25 = new system.testclass.LinkedList();
        linkedList25.clear();
        boolean boolean28 = linkedList25.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList29 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList30 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass31 = linkedList30.getClass();
        boolean boolean32 = linkedList29.remove((java.lang.Object) wildcardClass31);
        java.lang.Class<?> wildcardClass33 = linkedList29.getClass();
        boolean boolean34 = linkedList25.remove((java.lang.Object) wildcardClass33);
        boolean boolean35 = linkedList22.remove((java.lang.Object) boolean34);
        system.testclass.LinkedList linkedList36 = new system.testclass.LinkedList();
        linkedList36.clear();
        linkedList36.clear();
        system.testclass.LinkedList linkedList39 = new system.testclass.LinkedList();
        linkedList39.clear();
        boolean boolean42 = linkedList39.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList43 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList44 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass45 = linkedList44.getClass();
        boolean boolean46 = linkedList43.remove((java.lang.Object) wildcardClass45);
        java.lang.Class<?> wildcardClass47 = linkedList43.getClass();
        boolean boolean48 = linkedList39.remove((java.lang.Object) wildcardClass47);
        boolean boolean49 = linkedList36.remove((java.lang.Object) boolean48);
        boolean boolean51 = linkedList36.remove((java.lang.Object) ' ');
        boolean boolean52 = linkedList22.remove((java.lang.Object) linkedList36);
        boolean boolean53 = linkedList6.add((java.lang.Object) linkedList22);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList6", linkedList6.repOK_1());
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        int int2 = linkedList0.size();
        linkedList0.clear();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        int int5 = linkedList4.size();
        linkedList4.clear();
        int int7 = linkedList4.size();
        linkedList4.clear();
        boolean boolean10 = linkedList4.remove((java.lang.Object) (byte) 1);
        linkedList4.clear();
        boolean boolean12 = linkedList0.remove((java.lang.Object) linkedList4);
        system.testclass.LinkedList linkedList13 = new system.testclass.LinkedList();
        linkedList13.clear();
        boolean boolean16 = linkedList13.remove((java.lang.Object) (-1L));
        linkedList13.clear();
        boolean boolean18 = linkedList0.add((java.lang.Object) linkedList13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean2 = linkedList0.remove((java.lang.Object) 1.0d);
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean6 = linkedList0.remove((java.lang.Object) (short) 10);
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        boolean boolean9 = linkedList7.remove((java.lang.Object) 1.0d);
        boolean boolean11 = linkedList7.remove((java.lang.Object) 10);
        int int12 = linkedList7.size();
        boolean boolean13 = linkedList0.add((java.lang.Object) int12);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        boolean boolean3 = linkedList0.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        boolean boolean6 = linkedList4.remove((java.lang.Object) (byte) -1);
        boolean boolean7 = linkedList0.remove((java.lang.Object) linkedList4);
        boolean boolean9 = linkedList0.remove((java.lang.Object) (byte) -1);
        int int10 = linkedList0.size();
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass13 = linkedList12.getClass();
        boolean boolean14 = linkedList11.remove((java.lang.Object) wildcardClass13);
        int int15 = linkedList11.size();
        java.lang.Class<?> wildcardClass16 = linkedList11.getClass();
        boolean boolean17 = linkedList0.add((java.lang.Object) linkedList11);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList1 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass2 = linkedList1.getClass();
        boolean boolean3 = linkedList0.remove((java.lang.Object) wildcardClass2);
        int int4 = linkedList0.size();
        linkedList0.clear();
        int int6 = linkedList0.size();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass9 = linkedList8.getClass();
        boolean boolean10 = linkedList7.remove((java.lang.Object) wildcardClass9);
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        int int12 = linkedList11.size();
        linkedList11.clear();
        int int14 = linkedList11.size();
        java.lang.Class<?> wildcardClass15 = linkedList11.getClass();
        boolean boolean16 = linkedList7.remove((java.lang.Object) linkedList11);
        linkedList7.clear();
        boolean boolean18 = linkedList0.remove((java.lang.Object) linkedList7);
        system.testclass.LinkedList linkedList19 = new system.testclass.LinkedList();
        linkedList19.clear();
        boolean boolean22 = linkedList19.remove((java.lang.Object) (-1L));
        boolean boolean23 = linkedList0.add((java.lang.Object) linkedList19);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean2 = linkedList0.remove((java.lang.Object) 1.0d);
        boolean boolean4 = linkedList0.remove((java.lang.Object) 10);
        boolean boolean6 = linkedList0.remove((java.lang.Object) 1L);
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        boolean boolean9 = linkedList7.remove((java.lang.Object) 1.0d);
        boolean boolean11 = linkedList7.remove((java.lang.Object) 10);
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass13 = linkedList12.getClass();
        boolean boolean14 = linkedList7.remove((java.lang.Object) linkedList12);
        boolean boolean15 = linkedList0.remove((java.lang.Object) linkedList7);
        system.testclass.LinkedList linkedList16 = new system.testclass.LinkedList();
        int int17 = linkedList16.size();
        boolean boolean18 = linkedList0.add((java.lang.Object) linkedList16);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        boolean boolean3 = linkedList0.remove((java.lang.Object) (-1L));
        boolean boolean5 = linkedList0.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        boolean boolean8 = linkedList6.remove((java.lang.Object) 1.0d);
        boolean boolean10 = linkedList6.remove((java.lang.Object) 10);
        boolean boolean12 = linkedList6.remove((java.lang.Object) 1L);
        system.testclass.LinkedList linkedList13 = new system.testclass.LinkedList();
        boolean boolean15 = linkedList13.remove((java.lang.Object) 1.0d);
        boolean boolean17 = linkedList13.remove((java.lang.Object) 10);
        system.testclass.LinkedList linkedList18 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass19 = linkedList18.getClass();
        boolean boolean20 = linkedList13.remove((java.lang.Object) linkedList18);
        boolean boolean21 = linkedList6.remove((java.lang.Object) linkedList13);
        system.testclass.LinkedList linkedList22 = new system.testclass.LinkedList();
        linkedList22.clear();
        boolean boolean25 = linkedList22.remove((java.lang.Object) (-1L));
        int int26 = linkedList22.size();
        int int27 = linkedList22.size();
        boolean boolean28 = linkedList6.remove((java.lang.Object) int27);
        boolean boolean29 = linkedList0.add((java.lang.Object) linkedList6);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        system.testclass.LinkedList linkedList3 = new system.testclass.LinkedList();
        boolean boolean5 = linkedList3.remove((java.lang.Object) 1.0d);
        boolean boolean7 = linkedList3.remove((java.lang.Object) 10);
        boolean boolean9 = linkedList3.remove((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass10 = linkedList3.getClass();
        boolean boolean11 = linkedList0.remove((java.lang.Object) wildcardClass10);
        boolean boolean13 = linkedList0.add((java.lang.Object) 1.0d);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        linkedList0.clear();
        linkedList0.clear();
        int int6 = linkedList0.size();
        boolean boolean8 = linkedList0.remove((java.lang.Object) ' ');
        linkedList0.clear();
        int int10 = linkedList0.size();
        linkedList0.clear();
        boolean boolean13 = linkedList0.add((java.lang.Object) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList1 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass2 = linkedList1.getClass();
        boolean boolean3 = linkedList0.remove((java.lang.Object) wildcardClass2);
        int int4 = linkedList0.size();
        linkedList0.clear();
        int int6 = linkedList0.size();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        linkedList7.clear();
        boolean boolean10 = linkedList7.remove((java.lang.Object) (-1));
        boolean boolean11 = linkedList0.remove((java.lang.Object) linkedList7);
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        boolean boolean14 = linkedList12.remove((java.lang.Object) 1.0d);
        boolean boolean16 = linkedList12.remove((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass17 = linkedList12.getClass();
        boolean boolean18 = linkedList0.remove((java.lang.Object) wildcardClass17);
        int int19 = linkedList0.size();
        system.testclass.LinkedList linkedList20 = new system.testclass.LinkedList();
        linkedList20.clear();
        boolean boolean23 = linkedList20.remove((java.lang.Object) (-1L));
        boolean boolean25 = linkedList20.remove((java.lang.Object) (-1L));
        int int26 = linkedList20.size();
        int int27 = linkedList20.size();
        int int28 = linkedList20.size();
        int int29 = linkedList20.size();
        boolean boolean30 = linkedList0.add((java.lang.Object) int29);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        boolean boolean3 = linkedList0.remove((java.lang.Object) (-1L));
        int int4 = linkedList0.size();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        linkedList5.clear();
        boolean boolean8 = linkedList5.remove((java.lang.Object) (-1L));
        boolean boolean10 = linkedList5.remove((java.lang.Object) (-1L));
        int int11 = linkedList5.size();
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        int int13 = linkedList12.size();
        linkedList12.clear();
        int int15 = linkedList12.size();
        int int16 = linkedList12.size();
        int int17 = linkedList12.size();
        system.testclass.LinkedList linkedList18 = new system.testclass.LinkedList();
        int int19 = linkedList18.size();
        linkedList18.clear();
        int int21 = linkedList18.size();
        int int22 = linkedList18.size();
        boolean boolean23 = linkedList12.remove((java.lang.Object) linkedList18);
        linkedList18.clear();
        int int25 = linkedList18.size();
        boolean boolean26 = linkedList5.remove((java.lang.Object) int25);
        boolean boolean27 = linkedList0.remove((java.lang.Object) int25);
        system.testclass.LinkedList linkedList28 = new system.testclass.LinkedList();
        linkedList28.clear();
        boolean boolean31 = linkedList28.remove((java.lang.Object) (-1L));
        boolean boolean33 = linkedList28.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList34 = new system.testclass.LinkedList();
        boolean boolean36 = linkedList34.remove((java.lang.Object) (byte) -1);
        boolean boolean38 = linkedList34.remove((java.lang.Object) 0L);
        int int39 = linkedList34.size();
        int int40 = linkedList34.size();
        boolean boolean41 = linkedList28.remove((java.lang.Object) linkedList34);
        boolean boolean42 = linkedList0.remove((java.lang.Object) boolean41);
        boolean boolean44 = linkedList0.add((java.lang.Object) (-1L));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        boolean boolean3 = linkedList0.remove((java.lang.Object) (-1L));
        boolean boolean5 = linkedList0.remove((java.lang.Object) (-1L));
        int int6 = linkedList0.size();
        int int7 = linkedList0.size();
        int int8 = linkedList0.size();
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        int int10 = linkedList9.size();
        linkedList9.clear();
        int int12 = linkedList9.size();
        linkedList9.clear();
        linkedList9.clear();
        int int15 = linkedList9.size();
        boolean boolean17 = linkedList9.remove((java.lang.Object) 100.0d);
        boolean boolean18 = linkedList0.add((java.lang.Object) 100.0d);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        int int4 = linkedList0.size();
        linkedList0.clear();
        int int6 = linkedList0.size();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass9 = linkedList8.getClass();
        boolean boolean10 = linkedList7.remove((java.lang.Object) wildcardClass9);
        int int11 = linkedList7.size();
        linkedList7.clear();
        int int13 = linkedList7.size();
        boolean boolean14 = linkedList0.add((java.lang.Object) int13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        int int4 = linkedList0.size();
        int int5 = linkedList0.size();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        int int7 = linkedList6.size();
        linkedList6.clear();
        int int9 = linkedList6.size();
        int int10 = linkedList6.size();
        boolean boolean11 = linkedList0.remove((java.lang.Object) linkedList6);
        linkedList6.clear();
        int int13 = linkedList6.size();
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        boolean boolean16 = linkedList14.remove((java.lang.Object) (byte) -1);
        boolean boolean18 = linkedList14.remove((java.lang.Object) '#');
        linkedList14.clear();
        boolean boolean20 = linkedList6.remove((java.lang.Object) linkedList14);
        system.testclass.LinkedList linkedList21 = new system.testclass.LinkedList();
        int int22 = linkedList21.size();
        linkedList21.clear();
        int int24 = linkedList21.size();
        system.testclass.LinkedList linkedList25 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList26 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass27 = linkedList26.getClass();
        boolean boolean28 = linkedList25.remove((java.lang.Object) wildcardClass27);
        int int29 = linkedList25.size();
        linkedList25.clear();
        java.lang.Class<?> wildcardClass31 = linkedList25.getClass();
        boolean boolean32 = linkedList21.remove((java.lang.Object) wildcardClass31);
        boolean boolean33 = linkedList14.remove((java.lang.Object) linkedList21);
        system.testclass.LinkedList linkedList34 = new system.testclass.LinkedList();
        linkedList34.clear();
        boolean boolean37 = linkedList34.remove((java.lang.Object) (-1));
        boolean boolean38 = linkedList14.add((java.lang.Object) linkedList34);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList14", linkedList14.repOK_1());
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        boolean boolean3 = linkedList0.remove((java.lang.Object) (-1L));
        boolean boolean5 = linkedList0.remove((java.lang.Object) (-1L));
        int int6 = linkedList0.size();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        int int8 = linkedList7.size();
        linkedList7.clear();
        int int10 = linkedList7.size();
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass13 = linkedList12.getClass();
        boolean boolean14 = linkedList11.remove((java.lang.Object) wildcardClass13);
        int int15 = linkedList11.size();
        linkedList11.clear();
        java.lang.Class<?> wildcardClass17 = linkedList11.getClass();
        boolean boolean18 = linkedList7.remove((java.lang.Object) wildcardClass17);
        boolean boolean19 = linkedList0.remove((java.lang.Object) linkedList7);
        system.testclass.LinkedList linkedList20 = new system.testclass.LinkedList();
        int int21 = linkedList20.size();
        linkedList20.clear();
        int int23 = linkedList20.size();
        int int24 = linkedList20.size();
        int int25 = linkedList20.size();
        system.testclass.LinkedList linkedList26 = new system.testclass.LinkedList();
        int int27 = linkedList26.size();
        linkedList26.clear();
        int int29 = linkedList26.size();
        int int30 = linkedList26.size();
        boolean boolean31 = linkedList20.remove((java.lang.Object) linkedList26);
        linkedList26.clear();
        int int33 = linkedList26.size();
        system.testclass.LinkedList linkedList34 = new system.testclass.LinkedList();
        boolean boolean36 = linkedList34.remove((java.lang.Object) (byte) -1);
        boolean boolean38 = linkedList34.remove((java.lang.Object) '#');
        linkedList34.clear();
        boolean boolean40 = linkedList26.remove((java.lang.Object) linkedList34);
        boolean boolean41 = linkedList0.add((java.lang.Object) linkedList26);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean2 = linkedList0.remove((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedList0.remove((java.lang.Object) 100.0d);
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass6 = linkedList5.getClass();
        boolean boolean7 = linkedList0.remove((java.lang.Object) linkedList5);
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        int int9 = linkedList8.size();
        linkedList8.clear();
        int int11 = linkedList8.size();
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList13 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass14 = linkedList13.getClass();
        boolean boolean15 = linkedList12.remove((java.lang.Object) wildcardClass14);
        int int16 = linkedList12.size();
        linkedList12.clear();
        boolean boolean18 = linkedList8.remove((java.lang.Object) linkedList12);
        linkedList12.clear();
        system.testclass.LinkedList linkedList20 = new system.testclass.LinkedList();
        linkedList20.clear();
        boolean boolean23 = linkedList20.remove((java.lang.Object) (-1L));
        boolean boolean25 = linkedList20.remove((java.lang.Object) (-1L));
        int int26 = linkedList20.size();
        system.testclass.LinkedList linkedList27 = new system.testclass.LinkedList();
        int int28 = linkedList27.size();
        linkedList27.clear();
        int int30 = linkedList27.size();
        system.testclass.LinkedList linkedList31 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList32 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass33 = linkedList32.getClass();
        boolean boolean34 = linkedList31.remove((java.lang.Object) wildcardClass33);
        int int35 = linkedList31.size();
        linkedList31.clear();
        java.lang.Class<?> wildcardClass37 = linkedList31.getClass();
        boolean boolean38 = linkedList27.remove((java.lang.Object) wildcardClass37);
        boolean boolean39 = linkedList20.remove((java.lang.Object) linkedList27);
        boolean boolean40 = linkedList12.remove((java.lang.Object) boolean39);
        int int41 = linkedList12.size();
        boolean boolean42 = linkedList0.add((java.lang.Object) int41);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        boolean boolean3 = linkedList0.remove((java.lang.Object) (-1L));
        boolean boolean5 = linkedList0.remove((java.lang.Object) (-1L));
        int int6 = linkedList0.size();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        int int8 = linkedList7.size();
        linkedList7.clear();
        int int10 = linkedList7.size();
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass13 = linkedList12.getClass();
        boolean boolean14 = linkedList11.remove((java.lang.Object) wildcardClass13);
        int int15 = linkedList11.size();
        linkedList11.clear();
        java.lang.Class<?> wildcardClass17 = linkedList11.getClass();
        boolean boolean18 = linkedList7.remove((java.lang.Object) wildcardClass17);
        boolean boolean19 = linkedList0.remove((java.lang.Object) linkedList7);
        system.testclass.LinkedList linkedList20 = new system.testclass.LinkedList();
        linkedList20.clear();
        boolean boolean23 = linkedList20.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList24 = new system.testclass.LinkedList();
        boolean boolean26 = linkedList24.remove((java.lang.Object) (byte) -1);
        boolean boolean27 = linkedList20.remove((java.lang.Object) linkedList24);
        boolean boolean28 = linkedList0.add((java.lang.Object) linkedList24);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        linkedList0.clear();
        linkedList0.clear();
        int int6 = linkedList0.size();
        boolean boolean8 = linkedList0.remove((java.lang.Object) ' ');
        linkedList0.clear();
        int int10 = linkedList0.size();
        linkedList0.clear();
        boolean boolean13 = linkedList0.add((java.lang.Object) true);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        linkedList0.clear();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        linkedList4.clear();
        boolean boolean7 = linkedList4.remove((java.lang.Object) (-1L));
        boolean boolean9 = linkedList4.remove((java.lang.Object) (-1L));
        int int10 = linkedList4.size();
        int int11 = linkedList4.size();
        int int12 = linkedList4.size();
        int int13 = linkedList4.size();
        boolean boolean14 = linkedList0.add((java.lang.Object) int13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean2 = linkedList0.remove((java.lang.Object) 1.0d);
        int int3 = linkedList0.size();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        int int5 = linkedList4.size();
        linkedList4.clear();
        int int7 = linkedList4.size();
        linkedList4.clear();
        java.lang.Class<?> wildcardClass9 = linkedList4.getClass();
        boolean boolean10 = linkedList0.remove((java.lang.Object) linkedList4);
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        int int12 = linkedList11.size();
        linkedList11.clear();
        int int14 = linkedList11.size();
        int int15 = linkedList11.size();
        int int16 = linkedList11.size();
        system.testclass.LinkedList linkedList17 = new system.testclass.LinkedList();
        int int18 = linkedList17.size();
        linkedList17.clear();
        int int20 = linkedList17.size();
        int int21 = linkedList17.size();
        boolean boolean22 = linkedList11.remove((java.lang.Object) linkedList17);
        linkedList11.clear();
        boolean boolean24 = linkedList0.add((java.lang.Object) linkedList11);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        system.testclass.LinkedList linkedList3 = new system.testclass.LinkedList();
        linkedList3.clear();
        int int5 = linkedList3.size();
        boolean boolean6 = linkedList0.remove((java.lang.Object) linkedList3);
        linkedList3.clear();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        linkedList8.clear();
        boolean boolean11 = linkedList8.remove((java.lang.Object) (-1L));
        boolean boolean12 = linkedList3.remove((java.lang.Object) linkedList8);
        system.testclass.LinkedList linkedList13 = new system.testclass.LinkedList();
        boolean boolean15 = linkedList13.remove((java.lang.Object) 1.0d);
        boolean boolean17 = linkedList13.remove((java.lang.Object) 10);
        boolean boolean19 = linkedList13.remove((java.lang.Object) 1L);
        boolean boolean20 = linkedList8.remove((java.lang.Object) linkedList13);
        int int21 = linkedList8.size();
        boolean boolean23 = linkedList8.add((java.lang.Object) 10.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList8", linkedList8.repOK_1());
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        linkedList0.clear();
        linkedList0.clear();
        int int6 = linkedList0.size();
        java.lang.Object obj7 = null;
        boolean boolean8 = linkedList0.add(obj7);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        int int4 = linkedList0.size();
        int int5 = linkedList0.size();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        int int7 = linkedList6.size();
        linkedList6.clear();
        int int9 = linkedList6.size();
        int int10 = linkedList6.size();
        boolean boolean11 = linkedList0.remove((java.lang.Object) linkedList6);
        linkedList6.clear();
        boolean boolean14 = linkedList6.remove((java.lang.Object) 0L);
        system.testclass.LinkedList linkedList15 = new system.testclass.LinkedList();
        boolean boolean17 = linkedList15.remove((java.lang.Object) 1.0d);
        boolean boolean19 = linkedList15.remove((java.lang.Object) 10);
        boolean boolean21 = linkedList15.remove((java.lang.Object) 1L);
        boolean boolean23 = linkedList15.remove((java.lang.Object) 10.0d);
        java.lang.Class<?> wildcardClass24 = linkedList15.getClass();
        boolean boolean25 = linkedList6.add((java.lang.Object) wildcardClass24);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList6", linkedList6.repOK_1());
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean2 = linkedList0.remove((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedList0.remove((java.lang.Object) 0L);
        int int5 = linkedList0.size();
        int int6 = linkedList0.size();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        boolean boolean9 = linkedList7.remove((java.lang.Object) (byte) -1);
        boolean boolean11 = linkedList7.remove((java.lang.Object) 0L);
        boolean boolean12 = linkedList0.remove((java.lang.Object) boolean11);
        system.testclass.LinkedList linkedList13 = new system.testclass.LinkedList();
        linkedList13.clear();
        linkedList13.clear();
        system.testclass.LinkedList linkedList16 = new system.testclass.LinkedList();
        boolean boolean18 = linkedList16.remove((java.lang.Object) 1.0d);
        linkedList16.clear();
        java.lang.Class<?> wildcardClass20 = linkedList16.getClass();
        boolean boolean21 = linkedList13.remove((java.lang.Object) wildcardClass20);
        boolean boolean22 = linkedList0.add((java.lang.Object) linkedList13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        linkedList0.clear();
        boolean boolean6 = linkedList0.remove((java.lang.Object) (byte) 1);
        linkedList0.clear();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        linkedList8.clear();
        int int10 = linkedList8.size();
        linkedList8.clear();
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        linkedList12.clear();
        boolean boolean15 = linkedList12.remove((java.lang.Object) (-1L));
        boolean boolean17 = linkedList12.remove((java.lang.Object) (-1L));
        int int18 = linkedList12.size();
        system.testclass.LinkedList linkedList19 = new system.testclass.LinkedList();
        int int20 = linkedList19.size();
        linkedList19.clear();
        int int22 = linkedList19.size();
        system.testclass.LinkedList linkedList23 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList24 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass25 = linkedList24.getClass();
        boolean boolean26 = linkedList23.remove((java.lang.Object) wildcardClass25);
        int int27 = linkedList23.size();
        linkedList23.clear();
        java.lang.Class<?> wildcardClass29 = linkedList23.getClass();
        boolean boolean30 = linkedList19.remove((java.lang.Object) wildcardClass29);
        boolean boolean31 = linkedList12.remove((java.lang.Object) linkedList19);
        boolean boolean32 = linkedList8.remove((java.lang.Object) linkedList19);
        boolean boolean33 = linkedList0.add((java.lang.Object) boolean32);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean2 = linkedList0.remove((java.lang.Object) 1.0d);
        boolean boolean4 = linkedList0.remove((java.lang.Object) 10);
        boolean boolean6 = linkedList0.remove((java.lang.Object) 1L);
        int int7 = linkedList0.size();
        int int8 = linkedList0.size();
        linkedList0.clear();
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        int int11 = linkedList10.size();
        linkedList10.clear();
        int int13 = linkedList10.size();
        int int14 = linkedList10.size();
        int int15 = linkedList10.size();
        system.testclass.LinkedList linkedList16 = new system.testclass.LinkedList();
        int int17 = linkedList16.size();
        linkedList16.clear();
        int int19 = linkedList16.size();
        int int20 = linkedList16.size();
        boolean boolean21 = linkedList10.remove((java.lang.Object) linkedList16);
        linkedList16.clear();
        boolean boolean24 = linkedList16.remove((java.lang.Object) 0L);
        linkedList16.clear();
        boolean boolean26 = linkedList0.add((java.lang.Object) linkedList16);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList1 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass2 = linkedList1.getClass();
        boolean boolean3 = linkedList0.remove((java.lang.Object) wildcardClass2);
        int int4 = linkedList0.size();
        linkedList0.clear();
        int int6 = linkedList0.size();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        int int8 = linkedList7.size();
        linkedList7.clear();
        int int10 = linkedList7.size();
        int int11 = linkedList7.size();
        int int12 = linkedList7.size();
        system.testclass.LinkedList linkedList13 = new system.testclass.LinkedList();
        int int14 = linkedList13.size();
        linkedList13.clear();
        int int16 = linkedList13.size();
        int int17 = linkedList13.size();
        boolean boolean18 = linkedList7.remove((java.lang.Object) linkedList13);
        linkedList13.clear();
        int int20 = linkedList13.size();
        system.testclass.LinkedList linkedList21 = new system.testclass.LinkedList();
        boolean boolean23 = linkedList21.remove((java.lang.Object) (byte) -1);
        boolean boolean25 = linkedList21.remove((java.lang.Object) '#');
        linkedList21.clear();
        boolean boolean27 = linkedList13.remove((java.lang.Object) linkedList21);
        boolean boolean28 = linkedList0.add((java.lang.Object) linkedList13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        boolean boolean3 = linkedList0.remove((java.lang.Object) (-1L));
        boolean boolean5 = linkedList0.remove((java.lang.Object) (-1L));
        int int6 = linkedList0.size();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        int int8 = linkedList7.size();
        linkedList7.clear();
        int int10 = linkedList7.size();
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass13 = linkedList12.getClass();
        boolean boolean14 = linkedList11.remove((java.lang.Object) wildcardClass13);
        int int15 = linkedList11.size();
        linkedList11.clear();
        java.lang.Class<?> wildcardClass17 = linkedList11.getClass();
        boolean boolean18 = linkedList7.remove((java.lang.Object) wildcardClass17);
        boolean boolean19 = linkedList0.remove((java.lang.Object) linkedList7);
        int int20 = linkedList0.size();
        system.testclass.LinkedList linkedList21 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList22 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass23 = linkedList22.getClass();
        boolean boolean24 = linkedList21.remove((java.lang.Object) wildcardClass23);
        linkedList21.clear();
        linkedList21.clear();
        boolean boolean27 = linkedList0.add((java.lang.Object) linkedList21);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        boolean boolean3 = linkedList0.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        boolean boolean6 = linkedList4.remove((java.lang.Object) (byte) -1);
        boolean boolean7 = linkedList0.remove((java.lang.Object) linkedList4);
        boolean boolean9 = linkedList0.remove((java.lang.Object) (byte) -1);
        linkedList0.clear();
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        boolean boolean13 = linkedList11.remove((java.lang.Object) 1.0d);
        boolean boolean15 = linkedList11.remove((java.lang.Object) 10);
        boolean boolean17 = linkedList11.remove((java.lang.Object) 1L);
        int int18 = linkedList11.size();
        int int19 = linkedList11.size();
        linkedList11.clear();
        boolean boolean21 = linkedList0.remove((java.lang.Object) linkedList11);
        linkedList11.clear();
        system.testclass.LinkedList linkedList23 = new system.testclass.LinkedList();
        int int24 = linkedList23.size();
        linkedList23.clear();
        system.testclass.LinkedList linkedList26 = new system.testclass.LinkedList();
        boolean boolean28 = linkedList26.remove((java.lang.Object) 1.0d);
        boolean boolean30 = linkedList26.remove((java.lang.Object) 10);
        boolean boolean32 = linkedList26.remove((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass33 = linkedList26.getClass();
        boolean boolean34 = linkedList23.remove((java.lang.Object) wildcardClass33);
        boolean boolean35 = linkedList11.add((java.lang.Object) wildcardClass33);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList11", linkedList11.repOK_1());
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean2 = linkedList0.remove((java.lang.Object) 1.0d);
        linkedList0.clear();
        int int4 = linkedList0.size();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        linkedList5.clear();
        linkedList5.clear();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        boolean boolean10 = linkedList8.remove((java.lang.Object) 1.0d);
        linkedList8.clear();
        java.lang.Class<?> wildcardClass12 = linkedList8.getClass();
        boolean boolean13 = linkedList5.remove((java.lang.Object) wildcardClass12);
        int int14 = linkedList5.size();
        boolean boolean15 = linkedList0.remove((java.lang.Object) linkedList5);
        system.testclass.LinkedList linkedList16 = new system.testclass.LinkedList();
        int int17 = linkedList16.size();
        linkedList16.clear();
        int int19 = linkedList16.size();
        int int20 = linkedList16.size();
        java.lang.Class<?> wildcardClass21 = linkedList16.getClass();
        boolean boolean22 = linkedList5.add((java.lang.Object) wildcardClass21);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList5", linkedList5.repOK_1());
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        system.testclass.LinkedList linkedList3 = new system.testclass.LinkedList();
        linkedList3.clear();
        boolean boolean6 = linkedList3.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass9 = linkedList8.getClass();
        boolean boolean10 = linkedList7.remove((java.lang.Object) wildcardClass9);
        java.lang.Class<?> wildcardClass11 = linkedList7.getClass();
        boolean boolean12 = linkedList3.remove((java.lang.Object) wildcardClass11);
        boolean boolean13 = linkedList0.remove((java.lang.Object) boolean12);
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        linkedList14.clear();
        linkedList14.clear();
        system.testclass.LinkedList linkedList17 = new system.testclass.LinkedList();
        linkedList17.clear();
        boolean boolean20 = linkedList17.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList21 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList22 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass23 = linkedList22.getClass();
        boolean boolean24 = linkedList21.remove((java.lang.Object) wildcardClass23);
        java.lang.Class<?> wildcardClass25 = linkedList21.getClass();
        boolean boolean26 = linkedList17.remove((java.lang.Object) wildcardClass25);
        boolean boolean27 = linkedList14.remove((java.lang.Object) boolean26);
        boolean boolean29 = linkedList14.remove((java.lang.Object) ' ');
        boolean boolean30 = linkedList0.remove((java.lang.Object) linkedList14);
        int int31 = linkedList0.size();
        system.testclass.LinkedList linkedList32 = new system.testclass.LinkedList();
        int int33 = linkedList32.size();
        linkedList32.clear();
        system.testclass.LinkedList linkedList35 = new system.testclass.LinkedList();
        linkedList35.clear();
        boolean boolean38 = linkedList35.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList39 = new system.testclass.LinkedList();
        boolean boolean41 = linkedList39.remove((java.lang.Object) (byte) -1);
        boolean boolean42 = linkedList35.remove((java.lang.Object) linkedList39);
        linkedList39.clear();
        java.lang.Class<?> wildcardClass44 = linkedList39.getClass();
        boolean boolean45 = linkedList32.remove((java.lang.Object) linkedList39);
        boolean boolean46 = linkedList0.add((java.lang.Object) boolean45);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean2 = linkedList0.remove((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedList0.remove((java.lang.Object) 0L);
        int int5 = linkedList0.size();
        int int6 = linkedList0.size();
        linkedList0.clear();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        int int9 = linkedList8.size();
        linkedList8.clear();
        int int11 = linkedList8.size();
        java.lang.Class<?> wildcardClass12 = linkedList8.getClass();
        boolean boolean13 = linkedList0.add((java.lang.Object) linkedList8);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        system.testclass.LinkedList linkedList3 = new system.testclass.LinkedList();
        linkedList3.clear();
        int int5 = linkedList3.size();
        boolean boolean6 = linkedList0.remove((java.lang.Object) linkedList3);
        linkedList3.clear();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        linkedList8.clear();
        boolean boolean11 = linkedList8.remove((java.lang.Object) (-1L));
        boolean boolean12 = linkedList3.remove((java.lang.Object) linkedList8);
        linkedList8.clear();
        int int14 = linkedList8.size();
        system.testclass.LinkedList linkedList15 = new system.testclass.LinkedList();
        int int16 = linkedList15.size();
        linkedList15.clear();
        int int18 = linkedList15.size();
        int int19 = linkedList15.size();
        linkedList15.clear();
        java.lang.Class<?> wildcardClass21 = linkedList15.getClass();
        boolean boolean22 = linkedList8.add((java.lang.Object) wildcardClass21);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList8", linkedList8.repOK_1());
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        system.testclass.LinkedList linkedList3 = new system.testclass.LinkedList();
        linkedList3.clear();
        boolean boolean6 = linkedList3.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        boolean boolean9 = linkedList7.remove((java.lang.Object) (byte) -1);
        boolean boolean10 = linkedList3.remove((java.lang.Object) linkedList7);
        linkedList7.clear();
        java.lang.Class<?> wildcardClass12 = linkedList7.getClass();
        boolean boolean13 = linkedList0.remove((java.lang.Object) linkedList7);
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        int int15 = linkedList14.size();
        linkedList14.clear();
        int int17 = linkedList14.size();
        int int18 = linkedList14.size();
        linkedList14.clear();
        int int20 = linkedList14.size();
        int int21 = linkedList14.size();
        boolean boolean22 = linkedList7.add((java.lang.Object) int21);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList7", linkedList7.repOK_1());
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean2 = linkedList0.remove((java.lang.Object) 1.0d);
        boolean boolean4 = linkedList0.remove((java.lang.Object) 10);
        linkedList0.clear();
        linkedList0.clear();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        linkedList7.clear();
        linkedList7.clear();
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        linkedList10.clear();
        boolean boolean13 = linkedList10.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList15 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass16 = linkedList15.getClass();
        boolean boolean17 = linkedList14.remove((java.lang.Object) wildcardClass16);
        java.lang.Class<?> wildcardClass18 = linkedList14.getClass();
        boolean boolean19 = linkedList10.remove((java.lang.Object) wildcardClass18);
        boolean boolean20 = linkedList7.remove((java.lang.Object) boolean19);
        boolean boolean22 = linkedList7.remove((java.lang.Object) ' ');
        system.testclass.LinkedList linkedList23 = new system.testclass.LinkedList();
        int int24 = linkedList23.size();
        linkedList23.clear();
        int int26 = linkedList23.size();
        int int27 = linkedList23.size();
        int int28 = linkedList23.size();
        system.testclass.LinkedList linkedList29 = new system.testclass.LinkedList();
        int int30 = linkedList29.size();
        linkedList29.clear();
        int int32 = linkedList29.size();
        int int33 = linkedList29.size();
        boolean boolean34 = linkedList23.remove((java.lang.Object) linkedList29);
        linkedList29.clear();
        boolean boolean37 = linkedList29.remove((java.lang.Object) 0L);
        linkedList29.clear();
        int int39 = linkedList29.size();
        boolean boolean40 = linkedList7.remove((java.lang.Object) linkedList29);
        boolean boolean41 = linkedList0.add((java.lang.Object) linkedList7);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass6 = linkedList5.getClass();
        boolean boolean7 = linkedList4.remove((java.lang.Object) wildcardClass6);
        int int8 = linkedList4.size();
        linkedList4.clear();
        boolean boolean10 = linkedList0.remove((java.lang.Object) linkedList4);
        linkedList4.clear();
        linkedList4.clear();
        system.testclass.LinkedList linkedList13 = new system.testclass.LinkedList();
        boolean boolean15 = linkedList13.remove((java.lang.Object) 1.0d);
        linkedList13.clear();
        boolean boolean17 = linkedList4.remove((java.lang.Object) linkedList13);
        int int18 = linkedList13.size();
        int int19 = linkedList13.size();
        system.testclass.LinkedList linkedList20 = new system.testclass.LinkedList();
        int int21 = linkedList20.size();
        linkedList20.clear();
        int int23 = linkedList20.size();
        int int24 = linkedList20.size();
        int int25 = linkedList20.size();
        system.testclass.LinkedList linkedList26 = new system.testclass.LinkedList();
        int int27 = linkedList26.size();
        linkedList26.clear();
        int int29 = linkedList26.size();
        int int30 = linkedList26.size();
        boolean boolean31 = linkedList20.remove((java.lang.Object) linkedList26);
        linkedList26.clear();
        int int33 = linkedList26.size();
        linkedList26.clear();
        linkedList26.clear();
        boolean boolean36 = linkedList13.add((java.lang.Object) linkedList26);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList13", linkedList13.repOK_1());
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean2 = linkedList0.remove((java.lang.Object) 1.0d);
        boolean boolean4 = linkedList0.remove((java.lang.Object) 10);
        boolean boolean6 = linkedList0.remove((java.lang.Object) 1L);
        int int7 = linkedList0.size();
        int int8 = linkedList0.size();
        linkedList0.clear();
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        int int11 = linkedList10.size();
        linkedList10.clear();
        boolean boolean14 = linkedList10.remove((java.lang.Object) "hi!");
        int int15 = linkedList10.size();
        int int16 = linkedList10.size();
        boolean boolean17 = linkedList0.add((java.lang.Object) linkedList10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        int int2 = linkedList0.size();
        linkedList0.clear();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        linkedList4.clear();
        boolean boolean7 = linkedList4.remove((java.lang.Object) (-1L));
        boolean boolean9 = linkedList4.remove((java.lang.Object) (-1L));
        int int10 = linkedList4.size();
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        int int12 = linkedList11.size();
        linkedList11.clear();
        int int14 = linkedList11.size();
        system.testclass.LinkedList linkedList15 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList16 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass17 = linkedList16.getClass();
        boolean boolean18 = linkedList15.remove((java.lang.Object) wildcardClass17);
        int int19 = linkedList15.size();
        linkedList15.clear();
        java.lang.Class<?> wildcardClass21 = linkedList15.getClass();
        boolean boolean22 = linkedList11.remove((java.lang.Object) wildcardClass21);
        boolean boolean23 = linkedList4.remove((java.lang.Object) linkedList11);
        boolean boolean24 = linkedList0.remove((java.lang.Object) linkedList11);
        system.testclass.LinkedList linkedList25 = new system.testclass.LinkedList();
        int int26 = linkedList25.size();
        linkedList25.clear();
        int int28 = linkedList25.size();
        int int29 = linkedList25.size();
        int int30 = linkedList25.size();
        system.testclass.LinkedList linkedList31 = new system.testclass.LinkedList();
        int int32 = linkedList31.size();
        linkedList31.clear();
        int int34 = linkedList31.size();
        int int35 = linkedList31.size();
        boolean boolean36 = linkedList25.remove((java.lang.Object) linkedList31);
        linkedList31.clear();
        boolean boolean39 = linkedList31.remove((java.lang.Object) 0L);
        int int40 = linkedList31.size();
        java.lang.Class<?> wildcardClass41 = linkedList31.getClass();
        boolean boolean42 = linkedList0.add((java.lang.Object) wildcardClass41);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        system.testclass.LinkedList linkedList3 = new system.testclass.LinkedList();
        linkedList3.clear();
        int int5 = linkedList3.size();
        boolean boolean6 = linkedList0.remove((java.lang.Object) linkedList3);
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        linkedList7.clear();
        linkedList7.clear();
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        linkedList10.clear();
        boolean boolean13 = linkedList10.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList15 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass16 = linkedList15.getClass();
        boolean boolean17 = linkedList14.remove((java.lang.Object) wildcardClass16);
        java.lang.Class<?> wildcardClass18 = linkedList14.getClass();
        boolean boolean19 = linkedList10.remove((java.lang.Object) wildcardClass18);
        boolean boolean20 = linkedList7.remove((java.lang.Object) boolean19);
        system.testclass.LinkedList linkedList21 = new system.testclass.LinkedList();
        linkedList21.clear();
        linkedList21.clear();
        system.testclass.LinkedList linkedList24 = new system.testclass.LinkedList();
        linkedList24.clear();
        boolean boolean27 = linkedList24.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList28 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList29 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass30 = linkedList29.getClass();
        boolean boolean31 = linkedList28.remove((java.lang.Object) wildcardClass30);
        java.lang.Class<?> wildcardClass32 = linkedList28.getClass();
        boolean boolean33 = linkedList24.remove((java.lang.Object) wildcardClass32);
        boolean boolean34 = linkedList21.remove((java.lang.Object) boolean33);
        boolean boolean36 = linkedList21.remove((java.lang.Object) ' ');
        boolean boolean37 = linkedList7.remove((java.lang.Object) linkedList21);
        linkedList21.clear();
        boolean boolean39 = linkedList3.add((java.lang.Object) linkedList21);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList3", linkedList3.repOK_1());
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList1 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass2 = linkedList1.getClass();
        boolean boolean3 = linkedList0.remove((java.lang.Object) wildcardClass2);
        int int4 = linkedList0.size();
        linkedList0.clear();
        int int6 = linkedList0.size();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        linkedList7.clear();
        boolean boolean10 = linkedList7.remove((java.lang.Object) (-1));
        boolean boolean11 = linkedList0.remove((java.lang.Object) linkedList7);
        java.lang.Object obj12 = null;
        boolean boolean13 = linkedList7.add(obj12);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList7", linkedList7.repOK_1());
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        linkedList0.clear();
        linkedList0.clear();
        int int6 = linkedList0.size();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass9 = linkedList8.getClass();
        boolean boolean10 = linkedList7.remove((java.lang.Object) wildcardClass9);
        int int11 = linkedList7.size();
        linkedList7.clear();
        boolean boolean13 = linkedList0.remove((java.lang.Object) linkedList7);
        int int14 = linkedList0.size();
        linkedList0.clear();
        system.testclass.LinkedList linkedList16 = new system.testclass.LinkedList();
        boolean boolean18 = linkedList16.remove((java.lang.Object) 1.0d);
        int int19 = linkedList16.size();
        int int20 = linkedList16.size();
        system.testclass.LinkedList linkedList21 = new system.testclass.LinkedList();
        boolean boolean23 = linkedList21.remove((java.lang.Object) (byte) -1);
        boolean boolean25 = linkedList21.remove((java.lang.Object) 0L);
        int int26 = linkedList21.size();
        boolean boolean27 = linkedList16.remove((java.lang.Object) linkedList21);
        int int28 = linkedList21.size();
        boolean boolean29 = linkedList0.add((java.lang.Object) int28);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean2 = linkedList0.remove((java.lang.Object) (byte) -1);
        system.testclass.LinkedList linkedList3 = new system.testclass.LinkedList();
        int int4 = linkedList3.size();
        linkedList3.clear();
        int int6 = linkedList3.size();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass9 = linkedList8.getClass();
        boolean boolean10 = linkedList7.remove((java.lang.Object) wildcardClass9);
        int int11 = linkedList7.size();
        linkedList7.clear();
        boolean boolean13 = linkedList3.remove((java.lang.Object) linkedList7);
        linkedList7.clear();
        int int15 = linkedList7.size();
        system.testclass.LinkedList linkedList16 = new system.testclass.LinkedList();
        linkedList16.clear();
        boolean boolean19 = linkedList16.remove((java.lang.Object) (-1L));
        boolean boolean21 = linkedList16.remove((java.lang.Object) (-1L));
        int int22 = linkedList16.size();
        boolean boolean23 = linkedList7.remove((java.lang.Object) linkedList16);
        boolean boolean24 = linkedList0.remove((java.lang.Object) linkedList16);
        int int25 = linkedList16.size();
        system.testclass.LinkedList linkedList26 = new system.testclass.LinkedList();
        int int27 = linkedList26.size();
        linkedList26.clear();
        int int29 = linkedList26.size();
        system.testclass.LinkedList linkedList30 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList31 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass32 = linkedList31.getClass();
        boolean boolean33 = linkedList30.remove((java.lang.Object) wildcardClass32);
        int int34 = linkedList30.size();
        linkedList30.clear();
        boolean boolean36 = linkedList26.remove((java.lang.Object) linkedList30);
        linkedList30.clear();
        linkedList30.clear();
        system.testclass.LinkedList linkedList39 = new system.testclass.LinkedList();
        boolean boolean41 = linkedList39.remove((java.lang.Object) 1.0d);
        linkedList39.clear();
        boolean boolean43 = linkedList30.remove((java.lang.Object) linkedList39);
        int int44 = linkedList39.size();
        linkedList39.clear();
        boolean boolean46 = linkedList16.add((java.lang.Object) linkedList39);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList16", linkedList16.repOK_1());
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean2 = linkedList0.remove((java.lang.Object) 1.0d);
        linkedList0.clear();
        boolean boolean5 = linkedList0.add((java.lang.Object) 0.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        int int4 = linkedList0.size();
        int int5 = linkedList0.size();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        int int7 = linkedList6.size();
        linkedList6.clear();
        int int9 = linkedList6.size();
        int int10 = linkedList6.size();
        boolean boolean11 = linkedList0.remove((java.lang.Object) linkedList6);
        linkedList6.clear();
        int int13 = linkedList6.size();
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        boolean boolean16 = linkedList14.remove((java.lang.Object) (byte) -1);
        boolean boolean18 = linkedList14.remove((java.lang.Object) '#');
        linkedList14.clear();
        boolean boolean20 = linkedList6.remove((java.lang.Object) linkedList14);
        linkedList6.clear();
        system.testclass.LinkedList linkedList22 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList23 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass24 = linkedList23.getClass();
        boolean boolean25 = linkedList22.remove((java.lang.Object) wildcardClass24);
        system.testclass.LinkedList linkedList26 = new system.testclass.LinkedList();
        int int27 = linkedList26.size();
        linkedList26.clear();
        int int29 = linkedList26.size();
        java.lang.Class<?> wildcardClass30 = linkedList26.getClass();
        boolean boolean31 = linkedList22.remove((java.lang.Object) linkedList26);
        java.lang.Class<?> wildcardClass32 = linkedList22.getClass();
        boolean boolean33 = linkedList6.add((java.lang.Object) linkedList22);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList6", linkedList6.repOK_1());
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        int int4 = linkedList0.size();
        int int5 = linkedList0.size();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        int int7 = linkedList6.size();
        linkedList6.clear();
        int int9 = linkedList6.size();
        int int10 = linkedList6.size();
        boolean boolean11 = linkedList0.remove((java.lang.Object) linkedList6);
        linkedList6.clear();
        int int13 = linkedList6.size();
        boolean boolean15 = linkedList6.add((java.lang.Object) (-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList6", linkedList6.repOK_1());
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        system.testclass.LinkedList linkedList3 = new system.testclass.LinkedList();
        boolean boolean5 = linkedList3.remove((java.lang.Object) (byte) -1);
        boolean boolean7 = linkedList3.remove((java.lang.Object) 0L);
        linkedList3.clear();
        boolean boolean9 = linkedList0.add((java.lang.Object) linkedList3);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        boolean boolean3 = linkedList0.remove((java.lang.Object) (-1L));
        boolean boolean5 = linkedList0.remove((java.lang.Object) (-1L));
        int int6 = linkedList0.size();
        int int7 = linkedList0.size();
        int int8 = linkedList0.size();
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        linkedList9.clear();
        boolean boolean12 = linkedList9.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList13 = new system.testclass.LinkedList();
        boolean boolean15 = linkedList13.remove((java.lang.Object) (byte) -1);
        boolean boolean16 = linkedList9.remove((java.lang.Object) linkedList13);
        boolean boolean18 = linkedList9.remove((java.lang.Object) (byte) -1);
        linkedList9.clear();
        system.testclass.LinkedList linkedList20 = new system.testclass.LinkedList();
        boolean boolean22 = linkedList20.remove((java.lang.Object) 1.0d);
        boolean boolean24 = linkedList20.remove((java.lang.Object) 10);
        boolean boolean26 = linkedList20.remove((java.lang.Object) 1L);
        int int27 = linkedList20.size();
        int int28 = linkedList20.size();
        linkedList20.clear();
        boolean boolean30 = linkedList9.remove((java.lang.Object) linkedList20);
        system.testclass.LinkedList linkedList31 = new system.testclass.LinkedList();
        boolean boolean33 = linkedList31.remove((java.lang.Object) 1.0d);
        boolean boolean35 = linkedList31.remove((java.lang.Object) 10);
        boolean boolean37 = linkedList31.remove((java.lang.Object) 1L);
        boolean boolean38 = linkedList9.remove((java.lang.Object) boolean37);
        boolean boolean39 = linkedList0.add((java.lang.Object) boolean37);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean2 = linkedList0.remove((java.lang.Object) 1.0d);
        boolean boolean4 = linkedList0.remove((java.lang.Object) 10);
        boolean boolean6 = linkedList0.remove((java.lang.Object) 1L);
        boolean boolean8 = linkedList0.remove((java.lang.Object) 10.0d);
        linkedList0.clear();
        linkedList0.clear();
        linkedList0.clear();
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        int int13 = linkedList12.size();
        linkedList12.clear();
        int int15 = linkedList12.size();
        system.testclass.LinkedList linkedList16 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList17 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass18 = linkedList17.getClass();
        boolean boolean19 = linkedList16.remove((java.lang.Object) wildcardClass18);
        int int20 = linkedList16.size();
        linkedList16.clear();
        boolean boolean22 = linkedList12.remove((java.lang.Object) linkedList16);
        linkedList16.clear();
        boolean boolean24 = linkedList0.add((java.lang.Object) linkedList16);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        int int4 = linkedList0.size();
        int int5 = linkedList0.size();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        int int7 = linkedList6.size();
        linkedList6.clear();
        int int9 = linkedList6.size();
        int int10 = linkedList6.size();
        boolean boolean11 = linkedList0.remove((java.lang.Object) linkedList6);
        linkedList6.clear();
        int int13 = linkedList6.size();
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        boolean boolean16 = linkedList14.remove((java.lang.Object) (byte) -1);
        boolean boolean18 = linkedList14.remove((java.lang.Object) '#');
        linkedList14.clear();
        boolean boolean20 = linkedList6.remove((java.lang.Object) linkedList14);
        int int21 = linkedList6.size();
        boolean boolean23 = linkedList6.remove((java.lang.Object) 'a');
        system.testclass.LinkedList linkedList24 = new system.testclass.LinkedList();
        boolean boolean26 = linkedList24.remove((java.lang.Object) 1.0d);
        boolean boolean28 = linkedList24.remove((java.lang.Object) 10);
        boolean boolean30 = linkedList24.remove((java.lang.Object) 1L);
        boolean boolean32 = linkedList24.remove((java.lang.Object) 10.0d);
        linkedList24.clear();
        linkedList24.clear();
        boolean boolean35 = linkedList6.add((java.lang.Object) linkedList24);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList6", linkedList6.repOK_1());
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        boolean boolean4 = linkedList0.remove((java.lang.Object) "hi!");
        int int5 = linkedList0.size();
        int int6 = linkedList0.size();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        boolean boolean9 = linkedList7.remove((java.lang.Object) (byte) -1);
        linkedList7.clear();
        linkedList7.clear();
        boolean boolean12 = linkedList0.add((java.lang.Object) linkedList7);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean2 = linkedList0.remove((java.lang.Object) 1.0d);
        int int3 = linkedList0.size();
        int int4 = linkedList0.size();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        boolean boolean7 = linkedList5.remove((java.lang.Object) (byte) -1);
        boolean boolean9 = linkedList5.remove((java.lang.Object) 0L);
        int int10 = linkedList5.size();
        boolean boolean11 = linkedList0.remove((java.lang.Object) linkedList5);
        int int12 = linkedList5.size();
        system.testclass.LinkedList linkedList13 = new system.testclass.LinkedList();
        linkedList13.clear();
        java.lang.Class<?> wildcardClass15 = linkedList13.getClass();
        boolean boolean16 = linkedList5.add((java.lang.Object) wildcardClass15);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList5", linkedList5.repOK_1());
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        linkedList0.clear();
        linkedList0.clear();
        int int6 = linkedList0.size();
        boolean boolean8 = linkedList0.remove((java.lang.Object) ' ');
        linkedList0.clear();
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        linkedList10.clear();
        int int12 = linkedList10.size();
        linkedList10.clear();
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        int int15 = linkedList14.size();
        linkedList14.clear();
        int int17 = linkedList14.size();
        linkedList14.clear();
        boolean boolean20 = linkedList14.remove((java.lang.Object) (byte) 1);
        linkedList14.clear();
        boolean boolean22 = linkedList10.remove((java.lang.Object) linkedList14);
        boolean boolean23 = linkedList0.remove((java.lang.Object) linkedList14);
        system.testclass.LinkedList linkedList24 = new system.testclass.LinkedList();
        linkedList24.clear();
        linkedList24.clear();
        system.testclass.LinkedList linkedList27 = new system.testclass.LinkedList();
        linkedList27.clear();
        boolean boolean30 = linkedList27.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList31 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList32 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass33 = linkedList32.getClass();
        boolean boolean34 = linkedList31.remove((java.lang.Object) wildcardClass33);
        java.lang.Class<?> wildcardClass35 = linkedList31.getClass();
        boolean boolean36 = linkedList27.remove((java.lang.Object) wildcardClass35);
        boolean boolean37 = linkedList24.remove((java.lang.Object) boolean36);
        boolean boolean39 = linkedList24.remove((java.lang.Object) ' ');
        system.testclass.LinkedList linkedList40 = new system.testclass.LinkedList();
        int int41 = linkedList40.size();
        linkedList40.clear();
        int int43 = linkedList40.size();
        int int44 = linkedList40.size();
        int int45 = linkedList40.size();
        system.testclass.LinkedList linkedList46 = new system.testclass.LinkedList();
        int int47 = linkedList46.size();
        linkedList46.clear();
        int int49 = linkedList46.size();
        int int50 = linkedList46.size();
        boolean boolean51 = linkedList40.remove((java.lang.Object) linkedList46);
        linkedList46.clear();
        boolean boolean54 = linkedList46.remove((java.lang.Object) 0L);
        linkedList46.clear();
        int int56 = linkedList46.size();
        boolean boolean57 = linkedList24.remove((java.lang.Object) linkedList46);
        boolean boolean58 = linkedList14.add((java.lang.Object) linkedList24);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList14", linkedList14.repOK_1());
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean2 = linkedList0.remove((java.lang.Object) 1.0d);
        int int3 = linkedList0.size();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        int int5 = linkedList4.size();
        linkedList4.clear();
        int int7 = linkedList4.size();
        linkedList4.clear();
        java.lang.Class<?> wildcardClass9 = linkedList4.getClass();
        boolean boolean10 = linkedList0.remove((java.lang.Object) linkedList4);
        linkedList0.clear();
        int int12 = linkedList0.size();
        linkedList0.clear();
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        int int15 = linkedList14.size();
        linkedList14.clear();
        boolean boolean18 = linkedList14.remove((java.lang.Object) "hi!");
        int int19 = linkedList14.size();
        int int20 = linkedList14.size();
        system.testclass.LinkedList linkedList21 = new system.testclass.LinkedList();
        linkedList21.clear();
        linkedList21.clear();
        system.testclass.LinkedList linkedList24 = new system.testclass.LinkedList();
        linkedList24.clear();
        int int26 = linkedList24.size();
        boolean boolean27 = linkedList21.remove((java.lang.Object) linkedList24);
        int int28 = linkedList24.size();
        java.lang.Class<?> wildcardClass29 = linkedList24.getClass();
        boolean boolean30 = linkedList14.remove((java.lang.Object) wildcardClass29);
        boolean boolean31 = linkedList0.add((java.lang.Object) linkedList14);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        boolean boolean3 = linkedList0.remove((java.lang.Object) (-1L));
        boolean boolean5 = linkedList0.remove((java.lang.Object) (-1L));
        int int6 = linkedList0.size();
        int int7 = linkedList0.size();
        linkedList0.clear();
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        boolean boolean11 = linkedList9.remove((java.lang.Object) 1.0d);
        int int12 = linkedList9.size();
        java.lang.Object obj13 = null;
        boolean boolean14 = linkedList9.remove(obj13);
        int int15 = linkedList9.size();
        boolean boolean16 = linkedList0.add((java.lang.Object) int15);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        boolean boolean3 = linkedList0.remove((java.lang.Object) (-1));
        linkedList0.clear();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        int int6 = linkedList5.size();
        linkedList5.clear();
        int int8 = linkedList5.size();
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass11 = linkedList10.getClass();
        boolean boolean12 = linkedList9.remove((java.lang.Object) wildcardClass11);
        int int13 = linkedList9.size();
        linkedList9.clear();
        boolean boolean15 = linkedList5.remove((java.lang.Object) linkedList9);
        linkedList9.clear();
        linkedList9.clear();
        system.testclass.LinkedList linkedList18 = new system.testclass.LinkedList();
        boolean boolean20 = linkedList18.remove((java.lang.Object) 1.0d);
        linkedList18.clear();
        boolean boolean22 = linkedList9.remove((java.lang.Object) linkedList18);
        system.testclass.LinkedList linkedList23 = new system.testclass.LinkedList();
        int int24 = linkedList23.size();
        linkedList23.clear();
        int int26 = linkedList23.size();
        int int27 = linkedList23.size();
        int int28 = linkedList23.size();
        system.testclass.LinkedList linkedList29 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList30 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass31 = linkedList30.getClass();
        boolean boolean32 = linkedList29.remove((java.lang.Object) wildcardClass31);
        system.testclass.LinkedList linkedList33 = new system.testclass.LinkedList();
        int int34 = linkedList33.size();
        linkedList33.clear();
        int int36 = linkedList33.size();
        java.lang.Class<?> wildcardClass37 = linkedList33.getClass();
        boolean boolean38 = linkedList29.remove((java.lang.Object) linkedList33);
        boolean boolean39 = linkedList23.remove((java.lang.Object) boolean38);
        linkedList23.clear();
        boolean boolean41 = linkedList18.remove((java.lang.Object) linkedList23);
        boolean boolean42 = linkedList0.add((java.lang.Object) linkedList18);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean2 = linkedList0.remove((java.lang.Object) 1.0d);
        linkedList0.clear();
        int int4 = linkedList0.size();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        int int6 = linkedList5.size();
        linkedList5.clear();
        int int8 = linkedList5.size();
        linkedList5.clear();
        linkedList5.clear();
        linkedList5.clear();
        java.lang.Class<?> wildcardClass12 = linkedList5.getClass();
        boolean boolean13 = linkedList0.add((java.lang.Object) linkedList5);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        system.testclass.LinkedList linkedList3 = new system.testclass.LinkedList();
        linkedList3.clear();
        boolean boolean6 = linkedList3.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass9 = linkedList8.getClass();
        boolean boolean10 = linkedList7.remove((java.lang.Object) wildcardClass9);
        java.lang.Class<?> wildcardClass11 = linkedList7.getClass();
        boolean boolean12 = linkedList3.remove((java.lang.Object) wildcardClass11);
        boolean boolean13 = linkedList0.remove((java.lang.Object) boolean12);
        boolean boolean15 = linkedList0.remove((java.lang.Object) ' ');
        system.testclass.LinkedList linkedList16 = new system.testclass.LinkedList();
        int int17 = linkedList16.size();
        linkedList16.clear();
        int int19 = linkedList16.size();
        int int20 = linkedList16.size();
        int int21 = linkedList16.size();
        system.testclass.LinkedList linkedList22 = new system.testclass.LinkedList();
        int int23 = linkedList22.size();
        linkedList22.clear();
        int int25 = linkedList22.size();
        int int26 = linkedList22.size();
        boolean boolean27 = linkedList16.remove((java.lang.Object) linkedList22);
        linkedList22.clear();
        boolean boolean30 = linkedList22.remove((java.lang.Object) 0L);
        linkedList22.clear();
        int int32 = linkedList22.size();
        boolean boolean33 = linkedList0.remove((java.lang.Object) linkedList22);
        system.testclass.LinkedList linkedList34 = new system.testclass.LinkedList();
        int int35 = linkedList34.size();
        linkedList34.clear();
        system.testclass.LinkedList linkedList37 = new system.testclass.LinkedList();
        boolean boolean39 = linkedList37.remove((java.lang.Object) 1.0d);
        boolean boolean41 = linkedList37.remove((java.lang.Object) 10);
        boolean boolean43 = linkedList37.remove((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass44 = linkedList37.getClass();
        boolean boolean45 = linkedList34.remove((java.lang.Object) wildcardClass44);
        boolean boolean46 = linkedList22.add((java.lang.Object) boolean45);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList22", linkedList22.repOK_1());
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean2 = linkedList0.remove((java.lang.Object) (byte) -1);
        system.testclass.LinkedList linkedList3 = new system.testclass.LinkedList();
        int int4 = linkedList3.size();
        linkedList3.clear();
        int int6 = linkedList3.size();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass9 = linkedList8.getClass();
        boolean boolean10 = linkedList7.remove((java.lang.Object) wildcardClass9);
        int int11 = linkedList7.size();
        linkedList7.clear();
        boolean boolean13 = linkedList3.remove((java.lang.Object) linkedList7);
        linkedList7.clear();
        int int15 = linkedList7.size();
        system.testclass.LinkedList linkedList16 = new system.testclass.LinkedList();
        linkedList16.clear();
        boolean boolean19 = linkedList16.remove((java.lang.Object) (-1L));
        boolean boolean21 = linkedList16.remove((java.lang.Object) (-1L));
        int int22 = linkedList16.size();
        boolean boolean23 = linkedList7.remove((java.lang.Object) linkedList16);
        boolean boolean24 = linkedList0.remove((java.lang.Object) linkedList16);
        system.testclass.LinkedList linkedList25 = new system.testclass.LinkedList();
        boolean boolean27 = linkedList25.remove((java.lang.Object) 1.0d);
        linkedList25.clear();
        boolean boolean29 = linkedList16.add((java.lang.Object) linkedList25);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList16", linkedList16.repOK_1());
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        boolean boolean3 = linkedList0.remove((java.lang.Object) (-1L));
        boolean boolean5 = linkedList0.remove((java.lang.Object) (-1L));
        int int6 = linkedList0.size();
        int int7 = linkedList0.size();
        linkedList0.clear();
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        boolean boolean11 = linkedList9.remove((java.lang.Object) (byte) -1);
        boolean boolean13 = linkedList9.remove((java.lang.Object) 0L);
        linkedList9.clear();
        boolean boolean16 = linkedList9.remove((java.lang.Object) 100.0f);
        int int17 = linkedList9.size();
        linkedList9.clear();
        boolean boolean19 = linkedList0.add((java.lang.Object) linkedList9);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        boolean boolean3 = linkedList0.remove((java.lang.Object) (-1L));
        linkedList0.clear();
        int int5 = linkedList0.size();
        java.lang.Object obj6 = null;
        boolean boolean7 = linkedList0.remove(obj6);
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        int int9 = linkedList8.size();
        linkedList8.clear();
        int int11 = linkedList8.size();
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList13 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass14 = linkedList13.getClass();
        boolean boolean15 = linkedList12.remove((java.lang.Object) wildcardClass14);
        int int16 = linkedList12.size();
        linkedList12.clear();
        java.lang.Class<?> wildcardClass18 = linkedList12.getClass();
        boolean boolean19 = linkedList8.remove((java.lang.Object) wildcardClass18);
        boolean boolean20 = linkedList0.add((java.lang.Object) boolean19);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean2 = linkedList0.remove((java.lang.Object) 1.0d);
        int int3 = linkedList0.size();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        int int5 = linkedList4.size();
        linkedList4.clear();
        int int7 = linkedList4.size();
        linkedList4.clear();
        java.lang.Class<?> wildcardClass9 = linkedList4.getClass();
        boolean boolean10 = linkedList0.remove((java.lang.Object) linkedList4);
        linkedList0.clear();
        boolean boolean13 = linkedList0.remove((java.lang.Object) 0.0d);
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        int int15 = linkedList14.size();
        linkedList14.clear();
        int int17 = linkedList14.size();
        linkedList14.clear();
        linkedList14.clear();
        linkedList14.clear();
        java.lang.Class<?> wildcardClass21 = linkedList14.getClass();
        boolean boolean22 = linkedList0.add((java.lang.Object) wildcardClass21);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        boolean boolean4 = linkedList0.remove((java.lang.Object) "hi!");
        int int5 = linkedList0.size();
        int int6 = linkedList0.size();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        linkedList7.clear();
        linkedList7.clear();
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        linkedList10.clear();
        int int12 = linkedList10.size();
        boolean boolean13 = linkedList7.remove((java.lang.Object) linkedList10);
        int int14 = linkedList10.size();
        java.lang.Class<?> wildcardClass15 = linkedList10.getClass();
        boolean boolean16 = linkedList0.remove((java.lang.Object) wildcardClass15);
        system.testclass.LinkedList linkedList17 = new system.testclass.LinkedList();
        boolean boolean19 = linkedList17.remove((java.lang.Object) (byte) -1);
        boolean boolean21 = linkedList17.remove((java.lang.Object) 0L);
        int int22 = linkedList17.size();
        int int23 = linkedList17.size();
        int int24 = linkedList17.size();
        boolean boolean25 = linkedList0.add((java.lang.Object) linkedList17);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        system.testclass.LinkedList linkedList3 = new system.testclass.LinkedList();
        linkedList3.clear();
        int int5 = linkedList3.size();
        boolean boolean6 = linkedList0.remove((java.lang.Object) linkedList3);
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        int int8 = linkedList7.size();
        linkedList7.clear();
        int int10 = linkedList7.size();
        linkedList7.clear();
        linkedList7.clear();
        boolean boolean13 = linkedList3.add((java.lang.Object) linkedList7);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList3", linkedList3.repOK_1());
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean2 = linkedList0.remove((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedList0.remove((java.lang.Object) 100.0d);
        int int5 = linkedList0.size();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        int int7 = linkedList6.size();
        linkedList6.clear();
        boolean boolean10 = linkedList6.remove((java.lang.Object) "hi!");
        int int11 = linkedList6.size();
        linkedList6.clear();
        boolean boolean13 = linkedList0.remove((java.lang.Object) linkedList6);
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        linkedList14.clear();
        boolean boolean17 = linkedList14.remove((java.lang.Object) (-1L));
        int int18 = linkedList14.size();
        boolean boolean19 = linkedList0.add((java.lang.Object) int18);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        system.testclass.LinkedList linkedList3 = new system.testclass.LinkedList();
        linkedList3.clear();
        int int5 = linkedList3.size();
        boolean boolean6 = linkedList0.remove((java.lang.Object) linkedList3);
        linkedList3.clear();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        linkedList8.clear();
        boolean boolean11 = linkedList8.remove((java.lang.Object) (-1L));
        boolean boolean12 = linkedList3.remove((java.lang.Object) linkedList8);
        system.testclass.LinkedList linkedList13 = new system.testclass.LinkedList();
        boolean boolean15 = linkedList13.remove((java.lang.Object) 1.0d);
        boolean boolean17 = linkedList13.remove((java.lang.Object) 10);
        boolean boolean19 = linkedList13.remove((java.lang.Object) 1L);
        boolean boolean20 = linkedList8.remove((java.lang.Object) linkedList13);
        int int21 = linkedList8.size();
        system.testclass.LinkedList linkedList22 = new system.testclass.LinkedList();
        boolean boolean24 = linkedList22.remove((java.lang.Object) 1.0d);
        boolean boolean26 = linkedList22.remove((java.lang.Object) 10);
        boolean boolean28 = linkedList22.remove((java.lang.Object) 1L);
        system.testclass.LinkedList linkedList29 = new system.testclass.LinkedList();
        boolean boolean31 = linkedList29.remove((java.lang.Object) 1.0d);
        boolean boolean33 = linkedList29.remove((java.lang.Object) 10);
        system.testclass.LinkedList linkedList34 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass35 = linkedList34.getClass();
        boolean boolean36 = linkedList29.remove((java.lang.Object) linkedList34);
        boolean boolean37 = linkedList22.remove((java.lang.Object) linkedList29);
        boolean boolean38 = linkedList8.remove((java.lang.Object) linkedList22);
        system.testclass.LinkedList linkedList39 = new system.testclass.LinkedList();
        int int40 = linkedList39.size();
        linkedList39.clear();
        int int42 = linkedList39.size();
        linkedList39.clear();
        system.testclass.LinkedList linkedList44 = new system.testclass.LinkedList();
        int int45 = linkedList44.size();
        linkedList44.clear();
        int int47 = linkedList44.size();
        system.testclass.LinkedList linkedList48 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList49 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass50 = linkedList49.getClass();
        boolean boolean51 = linkedList48.remove((java.lang.Object) wildcardClass50);
        int int52 = linkedList48.size();
        linkedList48.clear();
        boolean boolean54 = linkedList44.remove((java.lang.Object) linkedList48);
        linkedList48.clear();
        int int56 = linkedList48.size();
        system.testclass.LinkedList linkedList57 = new system.testclass.LinkedList();
        linkedList57.clear();
        boolean boolean60 = linkedList57.remove((java.lang.Object) (-1L));
        boolean boolean62 = linkedList57.remove((java.lang.Object) (-1L));
        int int63 = linkedList57.size();
        boolean boolean64 = linkedList48.remove((java.lang.Object) linkedList57);
        system.testclass.LinkedList linkedList65 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList66 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass67 = linkedList66.getClass();
        boolean boolean68 = linkedList65.remove((java.lang.Object) wildcardClass67);
        java.lang.Class<?> wildcardClass69 = linkedList65.getClass();
        boolean boolean70 = linkedList48.remove((java.lang.Object) linkedList65);
        boolean boolean71 = linkedList39.remove((java.lang.Object) boolean70);
        boolean boolean72 = linkedList8.add((java.lang.Object) boolean71);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList8", linkedList8.repOK_1());
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        int int4 = linkedList0.size();
        int int5 = linkedList0.size();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        int int7 = linkedList6.size();
        linkedList6.clear();
        int int9 = linkedList6.size();
        int int10 = linkedList6.size();
        boolean boolean11 = linkedList0.remove((java.lang.Object) linkedList6);
        linkedList6.clear();
        boolean boolean14 = linkedList6.remove((java.lang.Object) 0L);
        linkedList6.clear();
        system.testclass.LinkedList linkedList16 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList17 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass18 = linkedList17.getClass();
        boolean boolean19 = linkedList16.remove((java.lang.Object) wildcardClass18);
        system.testclass.LinkedList linkedList20 = new system.testclass.LinkedList();
        int int21 = linkedList20.size();
        linkedList20.clear();
        int int23 = linkedList20.size();
        java.lang.Class<?> wildcardClass24 = linkedList20.getClass();
        boolean boolean25 = linkedList16.remove((java.lang.Object) linkedList20);
        system.testclass.LinkedList linkedList26 = new system.testclass.LinkedList();
        linkedList26.clear();
        boolean boolean29 = linkedList26.remove((java.lang.Object) (-1L));
        boolean boolean30 = linkedList16.remove((java.lang.Object) boolean29);
        boolean boolean31 = linkedList6.add((java.lang.Object) linkedList16);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList6", linkedList6.repOK_1());
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        system.testclass.LinkedList linkedList3 = new system.testclass.LinkedList();
        linkedList3.clear();
        int int5 = linkedList3.size();
        boolean boolean6 = linkedList0.remove((java.lang.Object) linkedList3);
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        int int8 = linkedList7.size();
        linkedList7.clear();
        int int10 = linkedList7.size();
        int int11 = linkedList7.size();
        int int12 = linkedList7.size();
        system.testclass.LinkedList linkedList13 = new system.testclass.LinkedList();
        int int14 = linkedList13.size();
        linkedList13.clear();
        int int16 = linkedList13.size();
        int int17 = linkedList13.size();
        boolean boolean18 = linkedList7.remove((java.lang.Object) linkedList13);
        boolean boolean19 = linkedList0.add((java.lang.Object) linkedList13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList1 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass2 = linkedList1.getClass();
        boolean boolean3 = linkedList0.remove((java.lang.Object) wildcardClass2);
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        int int5 = linkedList4.size();
        linkedList4.clear();
        int int7 = linkedList4.size();
        java.lang.Class<?> wildcardClass8 = linkedList4.getClass();
        boolean boolean9 = linkedList0.remove((java.lang.Object) linkedList4);
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        linkedList10.clear();
        boolean boolean13 = linkedList10.remove((java.lang.Object) (-1L));
        boolean boolean14 = linkedList0.remove((java.lang.Object) boolean13);
        system.testclass.LinkedList linkedList15 = new system.testclass.LinkedList();
        boolean boolean17 = linkedList15.remove((java.lang.Object) 1.0d);
        linkedList15.clear();
        java.lang.Class<?> wildcardClass19 = linkedList15.getClass();
        boolean boolean20 = linkedList0.add((java.lang.Object) linkedList15);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean2 = linkedList0.remove((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedList0.remove((java.lang.Object) 0L);
        linkedList0.clear();
        boolean boolean7 = linkedList0.remove((java.lang.Object) 100.0f);
        int int8 = linkedList0.size();
        linkedList0.clear();
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        linkedList10.clear();
        boolean boolean13 = linkedList10.remove((java.lang.Object) (-1L));
        boolean boolean15 = linkedList10.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList16 = new system.testclass.LinkedList();
        int int17 = linkedList16.size();
        linkedList16.clear();
        int int19 = linkedList16.size();
        system.testclass.LinkedList linkedList20 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList21 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass22 = linkedList21.getClass();
        boolean boolean23 = linkedList20.remove((java.lang.Object) wildcardClass22);
        int int24 = linkedList20.size();
        linkedList20.clear();
        java.lang.Class<?> wildcardClass26 = linkedList20.getClass();
        boolean boolean27 = linkedList16.remove((java.lang.Object) wildcardClass26);
        boolean boolean28 = linkedList10.remove((java.lang.Object) boolean27);
        system.testclass.LinkedList linkedList29 = new system.testclass.LinkedList();
        int int30 = linkedList29.size();
        linkedList29.clear();
        boolean boolean33 = linkedList29.remove((java.lang.Object) "hi!");
        int int34 = linkedList29.size();
        int int35 = linkedList29.size();
        system.testclass.LinkedList linkedList36 = new system.testclass.LinkedList();
        linkedList36.clear();
        linkedList36.clear();
        system.testclass.LinkedList linkedList39 = new system.testclass.LinkedList();
        linkedList39.clear();
        int int41 = linkedList39.size();
        boolean boolean42 = linkedList36.remove((java.lang.Object) linkedList39);
        int int43 = linkedList39.size();
        java.lang.Class<?> wildcardClass44 = linkedList39.getClass();
        boolean boolean45 = linkedList29.remove((java.lang.Object) wildcardClass44);
        boolean boolean46 = linkedList10.remove((java.lang.Object) linkedList29);
        boolean boolean47 = linkedList0.add((java.lang.Object) linkedList29);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        system.testclass.LinkedList linkedList3 = new system.testclass.LinkedList();
        boolean boolean5 = linkedList3.remove((java.lang.Object) 1.0d);
        linkedList3.clear();
        java.lang.Class<?> wildcardClass7 = linkedList3.getClass();
        boolean boolean8 = linkedList0.remove((java.lang.Object) wildcardClass7);
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        boolean boolean11 = linkedList9.remove((java.lang.Object) 1.0d);
        boolean boolean13 = linkedList9.remove((java.lang.Object) 10);
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass15 = linkedList14.getClass();
        boolean boolean16 = linkedList9.remove((java.lang.Object) linkedList14);
        linkedList9.clear();
        system.testclass.LinkedList linkedList18 = new system.testclass.LinkedList();
        int int19 = linkedList18.size();
        linkedList18.clear();
        int int21 = linkedList18.size();
        int int22 = linkedList18.size();
        int int23 = linkedList18.size();
        system.testclass.LinkedList linkedList24 = new system.testclass.LinkedList();
        int int25 = linkedList24.size();
        linkedList24.clear();
        int int27 = linkedList24.size();
        int int28 = linkedList24.size();
        boolean boolean29 = linkedList18.remove((java.lang.Object) linkedList24);
        linkedList24.clear();
        int int31 = linkedList24.size();
        system.testclass.LinkedList linkedList32 = new system.testclass.LinkedList();
        boolean boolean34 = linkedList32.remove((java.lang.Object) (byte) -1);
        boolean boolean36 = linkedList32.remove((java.lang.Object) '#');
        linkedList32.clear();
        boolean boolean38 = linkedList24.remove((java.lang.Object) linkedList32);
        linkedList24.clear();
        java.lang.Class<?> wildcardClass40 = linkedList24.getClass();
        boolean boolean41 = linkedList9.remove((java.lang.Object) wildcardClass40);
        boolean boolean42 = linkedList0.remove((java.lang.Object) boolean41);
        system.testclass.LinkedList linkedList43 = new system.testclass.LinkedList();
        linkedList43.clear();
        linkedList43.clear();
        system.testclass.LinkedList linkedList46 = new system.testclass.LinkedList();
        linkedList46.clear();
        int int48 = linkedList46.size();
        boolean boolean49 = linkedList43.remove((java.lang.Object) linkedList46);
        int int50 = linkedList43.size();
        linkedList43.clear();
        boolean boolean52 = linkedList0.remove((java.lang.Object) linkedList43);
        boolean boolean54 = linkedList43.add((java.lang.Object) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList43", linkedList43.repOK_1());
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean2 = linkedList0.remove((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedList0.remove((java.lang.Object) 0L);
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass7 = linkedList6.getClass();
        boolean boolean8 = linkedList5.remove((java.lang.Object) wildcardClass7);
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        int int10 = linkedList9.size();
        linkedList9.clear();
        int int12 = linkedList9.size();
        java.lang.Class<?> wildcardClass13 = linkedList9.getClass();
        boolean boolean14 = linkedList5.remove((java.lang.Object) linkedList9);
        system.testclass.LinkedList linkedList15 = new system.testclass.LinkedList();
        linkedList15.clear();
        boolean boolean18 = linkedList15.remove((java.lang.Object) (-1L));
        boolean boolean19 = linkedList5.remove((java.lang.Object) boolean18);
        int int20 = linkedList5.size();
        boolean boolean21 = linkedList0.remove((java.lang.Object) int20);
        system.testclass.LinkedList linkedList22 = new system.testclass.LinkedList();
        linkedList22.clear();
        linkedList22.clear();
        system.testclass.LinkedList linkedList25 = new system.testclass.LinkedList();
        linkedList25.clear();
        boolean boolean28 = linkedList25.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList29 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList30 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass31 = linkedList30.getClass();
        boolean boolean32 = linkedList29.remove((java.lang.Object) wildcardClass31);
        java.lang.Class<?> wildcardClass33 = linkedList29.getClass();
        boolean boolean34 = linkedList25.remove((java.lang.Object) wildcardClass33);
        boolean boolean35 = linkedList22.remove((java.lang.Object) boolean34);
        boolean boolean37 = linkedList22.remove((java.lang.Object) ' ');
        boolean boolean38 = linkedList0.add((java.lang.Object) linkedList22);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList1 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass2 = linkedList1.getClass();
        boolean boolean3 = linkedList0.remove((java.lang.Object) wildcardClass2);
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        int int5 = linkedList4.size();
        linkedList4.clear();
        int int7 = linkedList4.size();
        java.lang.Class<?> wildcardClass8 = linkedList4.getClass();
        boolean boolean9 = linkedList0.remove((java.lang.Object) linkedList4);
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        boolean boolean12 = linkedList10.remove((java.lang.Object) 1.0d);
        boolean boolean14 = linkedList10.remove((java.lang.Object) 10);
        boolean boolean16 = linkedList10.remove((java.lang.Object) 1L);
        boolean boolean18 = linkedList10.remove((java.lang.Object) 10.0d);
        linkedList10.clear();
        boolean boolean20 = linkedList0.remove((java.lang.Object) linkedList10);
        system.testclass.LinkedList linkedList21 = new system.testclass.LinkedList();
        int int22 = linkedList21.size();
        linkedList21.clear();
        system.testclass.LinkedList linkedList24 = new system.testclass.LinkedList();
        boolean boolean26 = linkedList24.remove((java.lang.Object) 1.0d);
        boolean boolean28 = linkedList24.remove((java.lang.Object) 10);
        boolean boolean30 = linkedList24.remove((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass31 = linkedList24.getClass();
        boolean boolean32 = linkedList21.remove((java.lang.Object) wildcardClass31);
        boolean boolean34 = linkedList21.remove((java.lang.Object) (byte) 100);
        int int35 = linkedList21.size();
        boolean boolean36 = linkedList0.add((java.lang.Object) int35);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        boolean boolean3 = linkedList0.remove((java.lang.Object) (-1L));
        boolean boolean5 = linkedList0.remove((java.lang.Object) (-1L));
        int int6 = linkedList0.size();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        boolean boolean9 = linkedList7.remove((java.lang.Object) 1.0d);
        boolean boolean11 = linkedList7.remove((java.lang.Object) 10);
        boolean boolean13 = linkedList7.remove((java.lang.Object) 1L);
        boolean boolean15 = linkedList7.remove((java.lang.Object) (-1L));
        boolean boolean16 = linkedList0.add((java.lang.Object) (-1L));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean2 = linkedList0.remove((java.lang.Object) (byte) -1);
        system.testclass.LinkedList linkedList3 = new system.testclass.LinkedList();
        linkedList3.clear();
        boolean boolean6 = linkedList3.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        boolean boolean9 = linkedList7.remove((java.lang.Object) (byte) -1);
        boolean boolean10 = linkedList3.remove((java.lang.Object) linkedList7);
        boolean boolean12 = linkedList3.remove((java.lang.Object) (byte) -1);
        linkedList3.clear();
        linkedList3.clear();
        boolean boolean15 = linkedList0.add((java.lang.Object) linkedList3);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        system.testclass.LinkedList linkedList3 = new system.testclass.LinkedList();
        linkedList3.clear();
        int int5 = linkedList3.size();
        boolean boolean6 = linkedList0.remove((java.lang.Object) linkedList3);
        linkedList3.clear();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        linkedList8.clear();
        boolean boolean11 = linkedList8.remove((java.lang.Object) (-1L));
        boolean boolean12 = linkedList3.remove((java.lang.Object) linkedList8);
        system.testclass.LinkedList linkedList13 = new system.testclass.LinkedList();
        boolean boolean15 = linkedList13.remove((java.lang.Object) 1.0d);
        boolean boolean17 = linkedList13.remove((java.lang.Object) 10);
        boolean boolean19 = linkedList13.remove((java.lang.Object) 1L);
        boolean boolean20 = linkedList8.remove((java.lang.Object) linkedList13);
        system.testclass.LinkedList linkedList21 = new system.testclass.LinkedList();
        int int22 = linkedList21.size();
        linkedList21.clear();
        int int24 = linkedList21.size();
        int int25 = linkedList21.size();
        int int26 = linkedList21.size();
        system.testclass.LinkedList linkedList27 = new system.testclass.LinkedList();
        int int28 = linkedList27.size();
        linkedList27.clear();
        int int30 = linkedList27.size();
        int int31 = linkedList27.size();
        boolean boolean32 = linkedList21.remove((java.lang.Object) linkedList27);
        java.lang.Class<?> wildcardClass33 = linkedList27.getClass();
        boolean boolean34 = linkedList13.add((java.lang.Object) wildcardClass33);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList13", linkedList13.repOK_1());
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        boolean boolean3 = linkedList0.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        boolean boolean6 = linkedList4.remove((java.lang.Object) (byte) -1);
        boolean boolean7 = linkedList0.remove((java.lang.Object) linkedList4);
        boolean boolean9 = linkedList0.remove((java.lang.Object) (byte) -1);
        linkedList0.clear();
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        boolean boolean13 = linkedList11.remove((java.lang.Object) 1.0d);
        boolean boolean15 = linkedList11.remove((java.lang.Object) 10);
        boolean boolean17 = linkedList11.remove((java.lang.Object) 1L);
        int int18 = linkedList11.size();
        int int19 = linkedList11.size();
        linkedList11.clear();
        boolean boolean21 = linkedList0.remove((java.lang.Object) linkedList11);
        linkedList11.clear();
        system.testclass.LinkedList linkedList23 = new system.testclass.LinkedList();
        linkedList23.clear();
        boolean boolean26 = linkedList23.remove((java.lang.Object) (-1L));
        int int27 = linkedList23.size();
        boolean boolean28 = linkedList11.add((java.lang.Object) linkedList23);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList11", linkedList11.repOK_1());
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        boolean boolean3 = linkedList0.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        boolean boolean6 = linkedList4.remove((java.lang.Object) (byte) -1);
        boolean boolean7 = linkedList0.remove((java.lang.Object) linkedList4);
        boolean boolean9 = linkedList0.remove((java.lang.Object) (byte) -1);
        linkedList0.clear();
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        boolean boolean13 = linkedList11.remove((java.lang.Object) 1.0d);
        boolean boolean15 = linkedList11.remove((java.lang.Object) 10);
        boolean boolean17 = linkedList11.remove((java.lang.Object) 1L);
        int int18 = linkedList11.size();
        int int19 = linkedList11.size();
        linkedList11.clear();
        boolean boolean21 = linkedList0.remove((java.lang.Object) linkedList11);
        system.testclass.LinkedList linkedList22 = new system.testclass.LinkedList();
        int int23 = linkedList22.size();
        linkedList22.clear();
        int int25 = linkedList22.size();
        linkedList22.clear();
        linkedList22.clear();
        int int28 = linkedList22.size();
        boolean boolean30 = linkedList22.remove((java.lang.Object) ' ');
        int int31 = linkedList22.size();
        java.lang.Class<?> wildcardClass32 = linkedList22.getClass();
        boolean boolean33 = linkedList11.add((java.lang.Object) linkedList22);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList11", linkedList11.repOK_1());
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList1 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass2 = linkedList1.getClass();
        boolean boolean3 = linkedList0.remove((java.lang.Object) wildcardClass2);
        int int4 = linkedList0.size();
        linkedList0.clear();
        int int6 = linkedList0.size();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        linkedList7.clear();
        boolean boolean10 = linkedList7.remove((java.lang.Object) (-1));
        boolean boolean11 = linkedList0.remove((java.lang.Object) linkedList7);
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        boolean boolean14 = linkedList12.remove((java.lang.Object) 1.0d);
        boolean boolean16 = linkedList12.remove((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass17 = linkedList12.getClass();
        boolean boolean18 = linkedList0.remove((java.lang.Object) wildcardClass17);
        int int19 = linkedList0.size();
        boolean boolean21 = linkedList0.remove((java.lang.Object) 'a');
        system.testclass.LinkedList linkedList22 = new system.testclass.LinkedList();
        int int23 = linkedList22.size();
        linkedList22.clear();
        int int25 = linkedList22.size();
        int int26 = linkedList22.size();
        int int27 = linkedList22.size();
        system.testclass.LinkedList linkedList28 = new system.testclass.LinkedList();
        int int29 = linkedList28.size();
        linkedList28.clear();
        int int31 = linkedList28.size();
        int int32 = linkedList28.size();
        boolean boolean33 = linkedList22.remove((java.lang.Object) linkedList28);
        linkedList28.clear();
        int int35 = linkedList28.size();
        linkedList28.clear();
        java.lang.Class<?> wildcardClass37 = linkedList28.getClass();
        boolean boolean38 = linkedList0.remove((java.lang.Object) linkedList28);
        system.testclass.LinkedList linkedList39 = new system.testclass.LinkedList();
        linkedList39.clear();
        boolean boolean42 = linkedList39.remove((java.lang.Object) (-1L));
        boolean boolean44 = linkedList39.remove((java.lang.Object) (-1L));
        int int45 = linkedList39.size();
        system.testclass.LinkedList linkedList46 = new system.testclass.LinkedList();
        int int47 = linkedList46.size();
        linkedList46.clear();
        int int49 = linkedList46.size();
        system.testclass.LinkedList linkedList50 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList51 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass52 = linkedList51.getClass();
        boolean boolean53 = linkedList50.remove((java.lang.Object) wildcardClass52);
        int int54 = linkedList50.size();
        linkedList50.clear();
        java.lang.Class<?> wildcardClass56 = linkedList50.getClass();
        boolean boolean57 = linkedList46.remove((java.lang.Object) wildcardClass56);
        boolean boolean58 = linkedList39.remove((java.lang.Object) linkedList46);
        boolean boolean59 = linkedList28.add((java.lang.Object) linkedList39);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList28", linkedList28.repOK_1());
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        boolean boolean4 = linkedList0.remove((java.lang.Object) "hi!");
        int int5 = linkedList0.size();
        linkedList0.clear();
        int int7 = linkedList0.size();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass10 = linkedList9.getClass();
        boolean boolean11 = linkedList8.remove((java.lang.Object) wildcardClass10);
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        int int13 = linkedList12.size();
        linkedList12.clear();
        int int15 = linkedList12.size();
        java.lang.Class<?> wildcardClass16 = linkedList12.getClass();
        boolean boolean17 = linkedList8.remove((java.lang.Object) linkedList12);
        system.testclass.LinkedList linkedList18 = new system.testclass.LinkedList();
        boolean boolean20 = linkedList18.remove((java.lang.Object) 1.0d);
        boolean boolean22 = linkedList18.remove((java.lang.Object) 10);
        boolean boolean24 = linkedList18.remove((java.lang.Object) 1L);
        boolean boolean26 = linkedList18.remove((java.lang.Object) 10.0d);
        linkedList18.clear();
        boolean boolean28 = linkedList8.remove((java.lang.Object) linkedList18);
        linkedList18.clear();
        boolean boolean30 = linkedList0.add((java.lang.Object) linkedList18);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        int int4 = linkedList0.size();
        int int5 = linkedList0.size();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        int int7 = linkedList6.size();
        linkedList6.clear();
        int int9 = linkedList6.size();
        int int10 = linkedList6.size();
        boolean boolean11 = linkedList0.remove((java.lang.Object) linkedList6);
        linkedList0.clear();
        int int13 = linkedList0.size();
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        linkedList14.clear();
        boolean boolean17 = linkedList14.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList18 = new system.testclass.LinkedList();
        boolean boolean20 = linkedList18.remove((java.lang.Object) (byte) -1);
        boolean boolean21 = linkedList14.remove((java.lang.Object) linkedList18);
        boolean boolean23 = linkedList14.remove((java.lang.Object) (byte) -1);
        linkedList14.clear();
        linkedList14.clear();
        boolean boolean27 = linkedList14.remove((java.lang.Object) (short) 10);
        linkedList14.clear();
        boolean boolean29 = linkedList0.add((java.lang.Object) linkedList14);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        int int4 = linkedList0.size();
        int int5 = linkedList0.size();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        int int7 = linkedList6.size();
        linkedList6.clear();
        int int9 = linkedList6.size();
        int int10 = linkedList6.size();
        boolean boolean11 = linkedList0.remove((java.lang.Object) linkedList6);
        linkedList0.clear();
        int int13 = linkedList0.size();
        int int14 = linkedList0.size();
        system.testclass.LinkedList linkedList15 = new system.testclass.LinkedList();
        boolean boolean17 = linkedList15.remove((java.lang.Object) 1.0d);
        boolean boolean19 = linkedList15.remove((java.lang.Object) 10);
        boolean boolean21 = linkedList15.remove((java.lang.Object) 1L);
        system.testclass.LinkedList linkedList22 = new system.testclass.LinkedList();
        boolean boolean24 = linkedList22.remove((java.lang.Object) 1.0d);
        boolean boolean26 = linkedList22.remove((java.lang.Object) 10);
        system.testclass.LinkedList linkedList27 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass28 = linkedList27.getClass();
        boolean boolean29 = linkedList22.remove((java.lang.Object) linkedList27);
        boolean boolean30 = linkedList15.remove((java.lang.Object) linkedList22);
        system.testclass.LinkedList linkedList31 = new system.testclass.LinkedList();
        int int32 = linkedList31.size();
        linkedList31.clear();
        int int34 = linkedList31.size();
        system.testclass.LinkedList linkedList35 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList36 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass37 = linkedList36.getClass();
        boolean boolean38 = linkedList35.remove((java.lang.Object) wildcardClass37);
        int int39 = linkedList35.size();
        linkedList35.clear();
        boolean boolean41 = linkedList31.remove((java.lang.Object) linkedList35);
        linkedList35.clear();
        linkedList35.clear();
        system.testclass.LinkedList linkedList44 = new system.testclass.LinkedList();
        boolean boolean46 = linkedList44.remove((java.lang.Object) 1.0d);
        linkedList44.clear();
        boolean boolean48 = linkedList35.remove((java.lang.Object) linkedList44);
        boolean boolean49 = linkedList15.remove((java.lang.Object) linkedList35);
        system.testclass.LinkedList linkedList50 = new system.testclass.LinkedList();
        linkedList50.clear();
        linkedList50.clear();
        system.testclass.LinkedList linkedList53 = new system.testclass.LinkedList();
        boolean boolean55 = linkedList53.remove((java.lang.Object) 1.0d);
        linkedList53.clear();
        java.lang.Class<?> wildcardClass57 = linkedList53.getClass();
        boolean boolean58 = linkedList50.remove((java.lang.Object) wildcardClass57);
        system.testclass.LinkedList linkedList59 = new system.testclass.LinkedList();
        boolean boolean61 = linkedList59.remove((java.lang.Object) 1.0d);
        boolean boolean63 = linkedList59.remove((java.lang.Object) 10);
        system.testclass.LinkedList linkedList64 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass65 = linkedList64.getClass();
        boolean boolean66 = linkedList59.remove((java.lang.Object) linkedList64);
        linkedList59.clear();
        system.testclass.LinkedList linkedList68 = new system.testclass.LinkedList();
        int int69 = linkedList68.size();
        linkedList68.clear();
        int int71 = linkedList68.size();
        int int72 = linkedList68.size();
        int int73 = linkedList68.size();
        system.testclass.LinkedList linkedList74 = new system.testclass.LinkedList();
        int int75 = linkedList74.size();
        linkedList74.clear();
        int int77 = linkedList74.size();
        int int78 = linkedList74.size();
        boolean boolean79 = linkedList68.remove((java.lang.Object) linkedList74);
        linkedList74.clear();
        int int81 = linkedList74.size();
        system.testclass.LinkedList linkedList82 = new system.testclass.LinkedList();
        boolean boolean84 = linkedList82.remove((java.lang.Object) (byte) -1);
        boolean boolean86 = linkedList82.remove((java.lang.Object) '#');
        linkedList82.clear();
        boolean boolean88 = linkedList74.remove((java.lang.Object) linkedList82);
        linkedList74.clear();
        java.lang.Class<?> wildcardClass90 = linkedList74.getClass();
        boolean boolean91 = linkedList59.remove((java.lang.Object) wildcardClass90);
        boolean boolean92 = linkedList50.remove((java.lang.Object) boolean91);
        boolean boolean93 = linkedList35.remove((java.lang.Object) linkedList50);
        boolean boolean94 = linkedList0.add((java.lang.Object) linkedList50);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass6 = linkedList5.getClass();
        boolean boolean7 = linkedList4.remove((java.lang.Object) wildcardClass6);
        int int8 = linkedList4.size();
        linkedList4.clear();
        boolean boolean10 = linkedList0.remove((java.lang.Object) linkedList4);
        linkedList4.clear();
        int int12 = linkedList4.size();
        system.testclass.LinkedList linkedList13 = new system.testclass.LinkedList();
        linkedList13.clear();
        boolean boolean16 = linkedList13.remove((java.lang.Object) (-1L));
        boolean boolean18 = linkedList13.remove((java.lang.Object) (-1L));
        int int19 = linkedList13.size();
        boolean boolean20 = linkedList4.remove((java.lang.Object) linkedList13);
        int int21 = linkedList13.size();
        system.testclass.LinkedList linkedList22 = new system.testclass.LinkedList();
        linkedList22.clear();
        boolean boolean25 = linkedList22.remove((java.lang.Object) (-1L));
        boolean boolean27 = linkedList22.remove((java.lang.Object) (-1L));
        int int28 = linkedList22.size();
        system.testclass.LinkedList linkedList29 = new system.testclass.LinkedList();
        int int30 = linkedList29.size();
        linkedList29.clear();
        int int32 = linkedList29.size();
        system.testclass.LinkedList linkedList33 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList34 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass35 = linkedList34.getClass();
        boolean boolean36 = linkedList33.remove((java.lang.Object) wildcardClass35);
        int int37 = linkedList33.size();
        linkedList33.clear();
        java.lang.Class<?> wildcardClass39 = linkedList33.getClass();
        boolean boolean40 = linkedList29.remove((java.lang.Object) wildcardClass39);
        boolean boolean41 = linkedList22.remove((java.lang.Object) linkedList29);
        boolean boolean42 = linkedList13.add((java.lang.Object) linkedList29);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList13", linkedList13.repOK_1());
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        int int4 = linkedList0.size();
        linkedList0.clear();
        int int6 = linkedList0.size();
        linkedList0.clear();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        linkedList8.clear();
        int int10 = linkedList8.size();
        linkedList8.clear();
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        int int13 = linkedList12.size();
        linkedList12.clear();
        int int15 = linkedList12.size();
        linkedList12.clear();
        boolean boolean18 = linkedList12.remove((java.lang.Object) (byte) 1);
        linkedList12.clear();
        boolean boolean20 = linkedList8.remove((java.lang.Object) linkedList12);
        linkedList8.clear();
        boolean boolean22 = linkedList0.add((java.lang.Object) linkedList8);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList1 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass2 = linkedList1.getClass();
        boolean boolean3 = linkedList0.remove((java.lang.Object) wildcardClass2);
        int int4 = linkedList0.size();
        java.lang.Object obj5 = null;
        boolean boolean6 = linkedList0.add(obj5);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean2 = linkedList0.remove((java.lang.Object) 1.0d);
        boolean boolean4 = linkedList0.remove((java.lang.Object) 10);
        boolean boolean6 = linkedList0.remove((java.lang.Object) 1L);
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        boolean boolean9 = linkedList7.remove((java.lang.Object) 1.0d);
        boolean boolean11 = linkedList7.remove((java.lang.Object) 10);
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass13 = linkedList12.getClass();
        boolean boolean14 = linkedList7.remove((java.lang.Object) linkedList12);
        boolean boolean15 = linkedList0.remove((java.lang.Object) linkedList7);
        boolean boolean17 = linkedList0.add((java.lang.Object) (-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        system.testclass.LinkedList linkedList3 = new system.testclass.LinkedList();
        linkedList3.clear();
        boolean boolean6 = linkedList3.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass9 = linkedList8.getClass();
        boolean boolean10 = linkedList7.remove((java.lang.Object) wildcardClass9);
        java.lang.Class<?> wildcardClass11 = linkedList7.getClass();
        boolean boolean12 = linkedList3.remove((java.lang.Object) wildcardClass11);
        boolean boolean13 = linkedList0.remove((java.lang.Object) boolean12);
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        linkedList14.clear();
        linkedList14.clear();
        system.testclass.LinkedList linkedList17 = new system.testclass.LinkedList();
        linkedList17.clear();
        boolean boolean20 = linkedList17.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList21 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList22 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass23 = linkedList22.getClass();
        boolean boolean24 = linkedList21.remove((java.lang.Object) wildcardClass23);
        java.lang.Class<?> wildcardClass25 = linkedList21.getClass();
        boolean boolean26 = linkedList17.remove((java.lang.Object) wildcardClass25);
        boolean boolean27 = linkedList14.remove((java.lang.Object) boolean26);
        boolean boolean29 = linkedList14.remove((java.lang.Object) ' ');
        boolean boolean30 = linkedList0.remove((java.lang.Object) linkedList14);
        int int31 = linkedList0.size();
        system.testclass.LinkedList linkedList32 = new system.testclass.LinkedList();
        int int33 = linkedList32.size();
        linkedList32.clear();
        int int35 = linkedList32.size();
        system.testclass.LinkedList linkedList36 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList37 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass38 = linkedList37.getClass();
        boolean boolean39 = linkedList36.remove((java.lang.Object) wildcardClass38);
        int int40 = linkedList36.size();
        linkedList36.clear();
        boolean boolean42 = linkedList32.remove((java.lang.Object) linkedList36);
        linkedList36.clear();
        int int44 = linkedList36.size();
        system.testclass.LinkedList linkedList45 = new system.testclass.LinkedList();
        linkedList45.clear();
        boolean boolean48 = linkedList45.remove((java.lang.Object) (-1L));
        boolean boolean50 = linkedList45.remove((java.lang.Object) (-1L));
        int int51 = linkedList45.size();
        boolean boolean52 = linkedList36.remove((java.lang.Object) linkedList45);
        linkedList45.clear();
        boolean boolean54 = linkedList0.add((java.lang.Object) linkedList45);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        boolean boolean3 = linkedList0.remove((java.lang.Object) (-1L));
        boolean boolean5 = linkedList0.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        boolean boolean8 = linkedList6.remove((java.lang.Object) (byte) -1);
        boolean boolean10 = linkedList6.remove((java.lang.Object) 0L);
        int int11 = linkedList6.size();
        int int12 = linkedList6.size();
        boolean boolean13 = linkedList0.remove((java.lang.Object) linkedList6);
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        int int15 = linkedList14.size();
        linkedList14.clear();
        int int17 = linkedList14.size();
        int int18 = linkedList14.size();
        int int19 = linkedList14.size();
        system.testclass.LinkedList linkedList20 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList21 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass22 = linkedList21.getClass();
        boolean boolean23 = linkedList20.remove((java.lang.Object) wildcardClass22);
        system.testclass.LinkedList linkedList24 = new system.testclass.LinkedList();
        int int25 = linkedList24.size();
        linkedList24.clear();
        int int27 = linkedList24.size();
        java.lang.Class<?> wildcardClass28 = linkedList24.getClass();
        boolean boolean29 = linkedList20.remove((java.lang.Object) linkedList24);
        boolean boolean30 = linkedList14.remove((java.lang.Object) boolean29);
        linkedList14.clear();
        int int32 = linkedList14.size();
        int int33 = linkedList14.size();
        system.testclass.LinkedList linkedList34 = new system.testclass.LinkedList();
        int int35 = linkedList34.size();
        linkedList34.clear();
        int int37 = linkedList34.size();
        int int38 = linkedList34.size();
        int int39 = linkedList34.size();
        system.testclass.LinkedList linkedList40 = new system.testclass.LinkedList();
        int int41 = linkedList40.size();
        linkedList40.clear();
        int int43 = linkedList40.size();
        int int44 = linkedList40.size();
        boolean boolean45 = linkedList34.remove((java.lang.Object) linkedList40);
        linkedList40.clear();
        boolean boolean48 = linkedList40.remove((java.lang.Object) 0L);
        linkedList40.clear();
        boolean boolean50 = linkedList14.remove((java.lang.Object) linkedList40);
        boolean boolean51 = linkedList0.add((java.lang.Object) linkedList14);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        int int2 = linkedList0.size();
        linkedList0.clear();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        linkedList4.clear();
        int int6 = linkedList4.size();
        linkedList4.clear();
        boolean boolean9 = linkedList4.remove((java.lang.Object) (short) 0);
        linkedList4.clear();
        boolean boolean11 = linkedList0.add((java.lang.Object) linkedList4);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        boolean boolean3 = linkedList0.remove((java.lang.Object) (-1L));
        boolean boolean5 = linkedList0.remove((java.lang.Object) (-1L));
        int int6 = linkedList0.size();
        int int7 = linkedList0.size();
        linkedList0.clear();
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        int int10 = linkedList9.size();
        linkedList9.clear();
        int int12 = linkedList9.size();
        system.testclass.LinkedList linkedList13 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass15 = linkedList14.getClass();
        boolean boolean16 = linkedList13.remove((java.lang.Object) wildcardClass15);
        int int17 = linkedList13.size();
        linkedList13.clear();
        boolean boolean19 = linkedList9.remove((java.lang.Object) linkedList13);
        linkedList13.clear();
        int int21 = linkedList13.size();
        system.testclass.LinkedList linkedList22 = new system.testclass.LinkedList();
        linkedList22.clear();
        boolean boolean25 = linkedList22.remove((java.lang.Object) (-1L));
        boolean boolean27 = linkedList22.remove((java.lang.Object) (-1L));
        int int28 = linkedList22.size();
        boolean boolean29 = linkedList13.remove((java.lang.Object) linkedList22);
        system.testclass.LinkedList linkedList30 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList31 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass32 = linkedList31.getClass();
        boolean boolean33 = linkedList30.remove((java.lang.Object) wildcardClass32);
        java.lang.Class<?> wildcardClass34 = linkedList30.getClass();
        boolean boolean35 = linkedList13.remove((java.lang.Object) linkedList30);
        linkedList13.clear();
        boolean boolean37 = linkedList0.add((java.lang.Object) linkedList13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean2 = linkedList0.remove((java.lang.Object) 1.0d);
        boolean boolean4 = linkedList0.remove((java.lang.Object) 10);
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass6 = linkedList5.getClass();
        boolean boolean7 = linkedList0.remove((java.lang.Object) linkedList5);
        linkedList0.clear();
        boolean boolean10 = linkedList0.add((java.lang.Object) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass6 = linkedList5.getClass();
        boolean boolean7 = linkedList4.remove((java.lang.Object) wildcardClass6);
        int int8 = linkedList4.size();
        linkedList4.clear();
        boolean boolean10 = linkedList0.remove((java.lang.Object) linkedList4);
        linkedList4.clear();
        linkedList4.clear();
        system.testclass.LinkedList linkedList13 = new system.testclass.LinkedList();
        linkedList13.clear();
        boolean boolean16 = linkedList13.remove((java.lang.Object) (-1L));
        boolean boolean18 = linkedList13.remove((java.lang.Object) (-1L));
        int int19 = linkedList13.size();
        system.testclass.LinkedList linkedList20 = new system.testclass.LinkedList();
        int int21 = linkedList20.size();
        linkedList20.clear();
        int int23 = linkedList20.size();
        system.testclass.LinkedList linkedList24 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList25 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass26 = linkedList25.getClass();
        boolean boolean27 = linkedList24.remove((java.lang.Object) wildcardClass26);
        int int28 = linkedList24.size();
        linkedList24.clear();
        java.lang.Class<?> wildcardClass30 = linkedList24.getClass();
        boolean boolean31 = linkedList20.remove((java.lang.Object) wildcardClass30);
        boolean boolean32 = linkedList13.remove((java.lang.Object) linkedList20);
        java.lang.Class<?> wildcardClass33 = linkedList20.getClass();
        boolean boolean34 = linkedList4.add((java.lang.Object) linkedList20);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList4", linkedList4.repOK_1());
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean2 = linkedList0.remove((java.lang.Object) 1.0d);
        boolean boolean4 = linkedList0.remove((java.lang.Object) 10);
        boolean boolean6 = linkedList0.remove((java.lang.Object) 1L);
        boolean boolean8 = linkedList0.remove((java.lang.Object) (-1L));
        int int9 = linkedList0.size();
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        int int11 = linkedList10.size();
        linkedList10.clear();
        int int13 = linkedList10.size();
        int int14 = linkedList10.size();
        int int15 = linkedList10.size();
        system.testclass.LinkedList linkedList16 = new system.testclass.LinkedList();
        int int17 = linkedList16.size();
        linkedList16.clear();
        int int19 = linkedList16.size();
        int int20 = linkedList16.size();
        boolean boolean21 = linkedList10.remove((java.lang.Object) linkedList16);
        int int22 = linkedList16.size();
        linkedList16.clear();
        linkedList16.clear();
        boolean boolean25 = linkedList0.add((java.lang.Object) linkedList16);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass6 = linkedList5.getClass();
        boolean boolean7 = linkedList4.remove((java.lang.Object) wildcardClass6);
        int int8 = linkedList4.size();
        linkedList4.clear();
        boolean boolean10 = linkedList0.remove((java.lang.Object) linkedList4);
        linkedList4.clear();
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        linkedList12.clear();
        boolean boolean15 = linkedList12.remove((java.lang.Object) (-1L));
        boolean boolean17 = linkedList12.remove((java.lang.Object) (-1L));
        int int18 = linkedList12.size();
        system.testclass.LinkedList linkedList19 = new system.testclass.LinkedList();
        int int20 = linkedList19.size();
        linkedList19.clear();
        int int22 = linkedList19.size();
        system.testclass.LinkedList linkedList23 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList24 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass25 = linkedList24.getClass();
        boolean boolean26 = linkedList23.remove((java.lang.Object) wildcardClass25);
        int int27 = linkedList23.size();
        linkedList23.clear();
        java.lang.Class<?> wildcardClass29 = linkedList23.getClass();
        boolean boolean30 = linkedList19.remove((java.lang.Object) wildcardClass29);
        boolean boolean31 = linkedList12.remove((java.lang.Object) linkedList19);
        boolean boolean32 = linkedList4.remove((java.lang.Object) boolean31);
        int int33 = linkedList4.size();
        system.testclass.LinkedList linkedList34 = new system.testclass.LinkedList();
        linkedList34.clear();
        int int36 = linkedList34.size();
        linkedList34.clear();
        system.testclass.LinkedList linkedList38 = new system.testclass.LinkedList();
        int int39 = linkedList38.size();
        linkedList38.clear();
        int int41 = linkedList38.size();
        system.testclass.LinkedList linkedList42 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList43 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass44 = linkedList43.getClass();
        boolean boolean45 = linkedList42.remove((java.lang.Object) wildcardClass44);
        int int46 = linkedList42.size();
        linkedList42.clear();
        boolean boolean48 = linkedList38.remove((java.lang.Object) linkedList42);
        linkedList42.clear();
        int int50 = linkedList42.size();
        boolean boolean51 = linkedList34.remove((java.lang.Object) int50);
        int int52 = linkedList34.size();
        boolean boolean53 = linkedList4.add((java.lang.Object) linkedList34);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList4", linkedList4.repOK_1());
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean2 = linkedList0.remove((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedList0.remove((java.lang.Object) 0L);
        int int5 = linkedList0.size();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        int int7 = linkedList6.size();
        linkedList6.clear();
        int int9 = linkedList6.size();
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass12 = linkedList11.getClass();
        boolean boolean13 = linkedList10.remove((java.lang.Object) wildcardClass12);
        int int14 = linkedList10.size();
        linkedList10.clear();
        java.lang.Class<?> wildcardClass16 = linkedList10.getClass();
        boolean boolean17 = linkedList6.remove((java.lang.Object) wildcardClass16);
        boolean boolean18 = linkedList0.add((java.lang.Object) boolean17);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean2 = linkedList0.remove((java.lang.Object) 1.0d);
        boolean boolean4 = linkedList0.remove((java.lang.Object) 10);
        boolean boolean6 = linkedList0.remove((java.lang.Object) true);
        linkedList0.clear();
        linkedList0.clear();
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        linkedList9.clear();
        boolean boolean12 = linkedList9.remove((java.lang.Object) (-1L));
        boolean boolean14 = linkedList9.remove((java.lang.Object) (-1L));
        int int15 = linkedList9.size();
        system.testclass.LinkedList linkedList16 = new system.testclass.LinkedList();
        int int17 = linkedList16.size();
        linkedList16.clear();
        int int19 = linkedList16.size();
        system.testclass.LinkedList linkedList20 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList21 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass22 = linkedList21.getClass();
        boolean boolean23 = linkedList20.remove((java.lang.Object) wildcardClass22);
        int int24 = linkedList20.size();
        linkedList20.clear();
        java.lang.Class<?> wildcardClass26 = linkedList20.getClass();
        boolean boolean27 = linkedList16.remove((java.lang.Object) wildcardClass26);
        boolean boolean28 = linkedList9.remove((java.lang.Object) linkedList16);
        linkedList9.clear();
        int int30 = linkedList9.size();
        linkedList9.clear();
        boolean boolean32 = linkedList0.add((java.lang.Object) linkedList9);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        int int4 = linkedList0.size();
        int int5 = linkedList0.size();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        int int7 = linkedList6.size();
        linkedList6.clear();
        int int9 = linkedList6.size();
        int int10 = linkedList6.size();
        boolean boolean11 = linkedList0.remove((java.lang.Object) linkedList6);
        linkedList6.clear();
        int int13 = linkedList6.size();
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        boolean boolean16 = linkedList14.remove((java.lang.Object) (byte) -1);
        boolean boolean18 = linkedList14.remove((java.lang.Object) '#');
        linkedList14.clear();
        boolean boolean20 = linkedList6.remove((java.lang.Object) linkedList14);
        system.testclass.LinkedList linkedList21 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass22 = linkedList21.getClass();
        boolean boolean23 = linkedList6.add((java.lang.Object) linkedList21);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList6", linkedList6.repOK_1());
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean2 = linkedList0.remove((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedList0.remove((java.lang.Object) 100.0d);
        int int5 = linkedList0.size();
        int int6 = linkedList0.size();
        linkedList0.clear();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass10 = linkedList9.getClass();
        boolean boolean11 = linkedList8.remove((java.lang.Object) wildcardClass10);
        int int12 = linkedList8.size();
        linkedList8.clear();
        int int14 = linkedList8.size();
        system.testclass.LinkedList linkedList15 = new system.testclass.LinkedList();
        linkedList15.clear();
        boolean boolean18 = linkedList15.remove((java.lang.Object) (-1));
        boolean boolean19 = linkedList8.remove((java.lang.Object) linkedList15);
        system.testclass.LinkedList linkedList20 = new system.testclass.LinkedList();
        boolean boolean22 = linkedList20.remove((java.lang.Object) 1.0d);
        boolean boolean24 = linkedList20.remove((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass25 = linkedList20.getClass();
        boolean boolean26 = linkedList8.remove((java.lang.Object) wildcardClass25);
        linkedList8.clear();
        boolean boolean28 = linkedList0.add((java.lang.Object) linkedList8);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        int int4 = linkedList0.size();
        int int5 = linkedList0.size();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        int int7 = linkedList6.size();
        linkedList6.clear();
        int int9 = linkedList6.size();
        int int10 = linkedList6.size();
        boolean boolean11 = linkedList0.remove((java.lang.Object) linkedList6);
        linkedList6.clear();
        boolean boolean14 = linkedList6.remove((java.lang.Object) 0L);
        system.testclass.LinkedList linkedList15 = new system.testclass.LinkedList();
        boolean boolean17 = linkedList15.remove((java.lang.Object) 1.0d);
        boolean boolean19 = linkedList15.remove((java.lang.Object) 10);
        boolean boolean21 = linkedList15.remove((java.lang.Object) 1L);
        system.testclass.LinkedList linkedList22 = new system.testclass.LinkedList();
        boolean boolean24 = linkedList22.remove((java.lang.Object) 1.0d);
        boolean boolean26 = linkedList22.remove((java.lang.Object) 10);
        system.testclass.LinkedList linkedList27 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass28 = linkedList27.getClass();
        boolean boolean29 = linkedList22.remove((java.lang.Object) linkedList27);
        boolean boolean30 = linkedList15.remove((java.lang.Object) linkedList22);
        system.testclass.LinkedList linkedList31 = new system.testclass.LinkedList();
        int int32 = linkedList31.size();
        linkedList31.clear();
        int int34 = linkedList31.size();
        system.testclass.LinkedList linkedList35 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList36 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass37 = linkedList36.getClass();
        boolean boolean38 = linkedList35.remove((java.lang.Object) wildcardClass37);
        int int39 = linkedList35.size();
        linkedList35.clear();
        boolean boolean41 = linkedList31.remove((java.lang.Object) linkedList35);
        linkedList35.clear();
        linkedList35.clear();
        system.testclass.LinkedList linkedList44 = new system.testclass.LinkedList();
        boolean boolean46 = linkedList44.remove((java.lang.Object) 1.0d);
        linkedList44.clear();
        boolean boolean48 = linkedList35.remove((java.lang.Object) linkedList44);
        boolean boolean49 = linkedList15.remove((java.lang.Object) linkedList35);
        java.lang.Class<?> wildcardClass50 = linkedList35.getClass();
        boolean boolean51 = linkedList6.add((java.lang.Object) linkedList35);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList6", linkedList6.repOK_1());
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        system.testclass.LinkedList linkedList3 = new system.testclass.LinkedList();
        linkedList3.clear();
        boolean boolean6 = linkedList3.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        boolean boolean9 = linkedList7.remove((java.lang.Object) (byte) -1);
        boolean boolean10 = linkedList3.remove((java.lang.Object) linkedList7);
        linkedList7.clear();
        java.lang.Class<?> wildcardClass12 = linkedList7.getClass();
        boolean boolean13 = linkedList0.remove((java.lang.Object) linkedList7);
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        int int15 = linkedList14.size();
        linkedList14.clear();
        int int17 = linkedList14.size();
        int int18 = linkedList14.size();
        int int19 = linkedList14.size();
        system.testclass.LinkedList linkedList20 = new system.testclass.LinkedList();
        int int21 = linkedList20.size();
        linkedList20.clear();
        int int23 = linkedList20.size();
        int int24 = linkedList20.size();
        boolean boolean25 = linkedList14.remove((java.lang.Object) linkedList20);
        int int26 = linkedList20.size();
        linkedList20.clear();
        boolean boolean28 = linkedList0.add((java.lang.Object) linkedList20);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean2 = linkedList0.remove((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedList0.remove((java.lang.Object) 0L);
        int int5 = linkedList0.size();
        int int6 = linkedList0.size();
        int int7 = linkedList0.size();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        linkedList8.clear();
        linkedList8.clear();
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        linkedList11.clear();
        int int13 = linkedList11.size();
        boolean boolean14 = linkedList8.remove((java.lang.Object) linkedList11);
        system.testclass.LinkedList linkedList15 = new system.testclass.LinkedList();
        linkedList15.clear();
        boolean boolean18 = linkedList15.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList19 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList20 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass21 = linkedList20.getClass();
        boolean boolean22 = linkedList19.remove((java.lang.Object) wildcardClass21);
        java.lang.Class<?> wildcardClass23 = linkedList19.getClass();
        boolean boolean24 = linkedList15.remove((java.lang.Object) wildcardClass23);
        boolean boolean25 = linkedList8.remove((java.lang.Object) wildcardClass23);
        boolean boolean26 = linkedList0.remove((java.lang.Object) linkedList8);
        int int27 = linkedList0.size();
        system.testclass.LinkedList linkedList28 = new system.testclass.LinkedList();
        int int29 = linkedList28.size();
        linkedList28.clear();
        int int31 = linkedList28.size();
        linkedList28.clear();
        linkedList28.clear();
        int int34 = linkedList28.size();
        boolean boolean36 = linkedList28.remove((java.lang.Object) ' ');
        linkedList28.clear();
        boolean boolean38 = linkedList0.remove((java.lang.Object) linkedList28);
        system.testclass.LinkedList linkedList39 = new system.testclass.LinkedList();
        boolean boolean41 = linkedList39.remove((java.lang.Object) 1.0d);
        int int42 = linkedList39.size();
        java.lang.Object obj43 = null;
        boolean boolean44 = linkedList39.remove(obj43);
        system.testclass.LinkedList linkedList45 = new system.testclass.LinkedList();
        int int46 = linkedList45.size();
        linkedList45.clear();
        int int48 = linkedList45.size();
        system.testclass.LinkedList linkedList49 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList50 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass51 = linkedList50.getClass();
        boolean boolean52 = linkedList49.remove((java.lang.Object) wildcardClass51);
        int int53 = linkedList49.size();
        linkedList49.clear();
        boolean boolean55 = linkedList45.remove((java.lang.Object) linkedList49);
        linkedList49.clear();
        int int57 = linkedList49.size();
        system.testclass.LinkedList linkedList58 = new system.testclass.LinkedList();
        linkedList58.clear();
        boolean boolean61 = linkedList58.remove((java.lang.Object) (-1L));
        boolean boolean63 = linkedList58.remove((java.lang.Object) (-1L));
        int int64 = linkedList58.size();
        boolean boolean65 = linkedList49.remove((java.lang.Object) linkedList58);
        boolean boolean66 = linkedList39.remove((java.lang.Object) linkedList49);
        boolean boolean67 = linkedList28.add((java.lang.Object) linkedList49);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList28", linkedList28.repOK_1());
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList1 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass2 = linkedList1.getClass();
        boolean boolean3 = linkedList0.remove((java.lang.Object) wildcardClass2);
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        int int5 = linkedList4.size();
        linkedList4.clear();
        int int7 = linkedList4.size();
        java.lang.Class<?> wildcardClass8 = linkedList4.getClass();
        boolean boolean9 = linkedList0.remove((java.lang.Object) linkedList4);
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        boolean boolean12 = linkedList10.remove((java.lang.Object) 1.0d);
        boolean boolean14 = linkedList10.remove((java.lang.Object) 10);
        boolean boolean16 = linkedList10.remove((java.lang.Object) 1L);
        system.testclass.LinkedList linkedList17 = new system.testclass.LinkedList();
        boolean boolean19 = linkedList17.remove((java.lang.Object) 1.0d);
        boolean boolean21 = linkedList17.remove((java.lang.Object) 10);
        system.testclass.LinkedList linkedList22 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass23 = linkedList22.getClass();
        boolean boolean24 = linkedList17.remove((java.lang.Object) linkedList22);
        boolean boolean25 = linkedList10.remove((java.lang.Object) linkedList17);
        system.testclass.LinkedList linkedList26 = new system.testclass.LinkedList();
        int int27 = linkedList26.size();
        linkedList26.clear();
        int int29 = linkedList26.size();
        system.testclass.LinkedList linkedList30 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList31 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass32 = linkedList31.getClass();
        boolean boolean33 = linkedList30.remove((java.lang.Object) wildcardClass32);
        int int34 = linkedList30.size();
        linkedList30.clear();
        boolean boolean36 = linkedList26.remove((java.lang.Object) linkedList30);
        linkedList30.clear();
        linkedList30.clear();
        system.testclass.LinkedList linkedList39 = new system.testclass.LinkedList();
        boolean boolean41 = linkedList39.remove((java.lang.Object) 1.0d);
        linkedList39.clear();
        boolean boolean43 = linkedList30.remove((java.lang.Object) linkedList39);
        boolean boolean44 = linkedList10.remove((java.lang.Object) linkedList30);
        boolean boolean45 = linkedList0.add((java.lang.Object) linkedList30);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList1 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass2 = linkedList1.getClass();
        boolean boolean3 = linkedList0.remove((java.lang.Object) wildcardClass2);
        int int4 = linkedList0.size();
        linkedList0.clear();
        int int6 = linkedList0.size();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass9 = linkedList8.getClass();
        boolean boolean10 = linkedList7.remove((java.lang.Object) wildcardClass9);
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        int int12 = linkedList11.size();
        linkedList11.clear();
        int int14 = linkedList11.size();
        java.lang.Class<?> wildcardClass15 = linkedList11.getClass();
        boolean boolean16 = linkedList7.remove((java.lang.Object) linkedList11);
        linkedList7.clear();
        boolean boolean18 = linkedList0.remove((java.lang.Object) linkedList7);
        int int19 = linkedList0.size();
        int int20 = linkedList0.size();
        system.testclass.LinkedList linkedList21 = new system.testclass.LinkedList();
        int int22 = linkedList21.size();
        linkedList21.clear();
        int int24 = linkedList21.size();
        int int25 = linkedList21.size();
        linkedList21.clear();
        int int27 = linkedList21.size();
        int int28 = linkedList21.size();
        boolean boolean29 = linkedList0.add((java.lang.Object) int28);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        int int4 = linkedList0.size();
        int int5 = linkedList0.size();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        int int7 = linkedList6.size();
        linkedList6.clear();
        int int9 = linkedList6.size();
        int int10 = linkedList6.size();
        boolean boolean11 = linkedList0.remove((java.lang.Object) linkedList6);
        linkedList6.clear();
        int int13 = linkedList6.size();
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        boolean boolean16 = linkedList14.remove((java.lang.Object) (byte) -1);
        boolean boolean18 = linkedList14.remove((java.lang.Object) '#');
        linkedList14.clear();
        boolean boolean20 = linkedList6.remove((java.lang.Object) linkedList14);
        int int21 = linkedList6.size();
        int int22 = linkedList6.size();
        system.testclass.LinkedList linkedList23 = new system.testclass.LinkedList();
        boolean boolean25 = linkedList23.remove((java.lang.Object) 1.0d);
        boolean boolean27 = linkedList23.remove((java.lang.Object) 10);
        boolean boolean29 = linkedList23.remove((java.lang.Object) 1L);
        boolean boolean31 = linkedList23.remove((java.lang.Object) 10.0d);
        linkedList23.clear();
        boolean boolean33 = linkedList6.add((java.lang.Object) linkedList23);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList6", linkedList6.repOK_1());
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        int int4 = linkedList0.size();
        linkedList0.clear();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        linkedList6.clear();
        boolean boolean9 = linkedList6.remove((java.lang.Object) (-1L));
        boolean boolean11 = linkedList6.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        int int13 = linkedList12.size();
        linkedList12.clear();
        int int15 = linkedList12.size();
        system.testclass.LinkedList linkedList16 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList17 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass18 = linkedList17.getClass();
        boolean boolean19 = linkedList16.remove((java.lang.Object) wildcardClass18);
        int int20 = linkedList16.size();
        linkedList16.clear();
        java.lang.Class<?> wildcardClass22 = linkedList16.getClass();
        boolean boolean23 = linkedList12.remove((java.lang.Object) wildcardClass22);
        boolean boolean24 = linkedList6.remove((java.lang.Object) boolean23);
        boolean boolean25 = linkedList0.remove((java.lang.Object) boolean23);
        system.testclass.LinkedList linkedList26 = new system.testclass.LinkedList();
        boolean boolean28 = linkedList26.remove((java.lang.Object) 1.0d);
        int int29 = linkedList26.size();
        system.testclass.LinkedList linkedList30 = new system.testclass.LinkedList();
        int int31 = linkedList30.size();
        linkedList30.clear();
        int int33 = linkedList30.size();
        linkedList30.clear();
        java.lang.Class<?> wildcardClass35 = linkedList30.getClass();
        boolean boolean36 = linkedList26.remove((java.lang.Object) linkedList30);
        linkedList26.clear();
        int int38 = linkedList26.size();
        linkedList26.clear();
        boolean boolean40 = linkedList0.add((java.lang.Object) linkedList26);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        int int4 = linkedList0.size();
        int int5 = linkedList0.size();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        int int7 = linkedList6.size();
        linkedList6.clear();
        int int9 = linkedList6.size();
        int int10 = linkedList6.size();
        boolean boolean11 = linkedList0.remove((java.lang.Object) linkedList6);
        int int12 = linkedList6.size();
        linkedList6.clear();
        int int14 = linkedList6.size();
        system.testclass.LinkedList linkedList15 = new system.testclass.LinkedList();
        int int16 = linkedList15.size();
        linkedList15.clear();
        int int18 = linkedList15.size();
        system.testclass.LinkedList linkedList19 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList20 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass21 = linkedList20.getClass();
        boolean boolean22 = linkedList19.remove((java.lang.Object) wildcardClass21);
        int int23 = linkedList19.size();
        linkedList19.clear();
        boolean boolean25 = linkedList15.remove((java.lang.Object) linkedList19);
        linkedList19.clear();
        int int27 = linkedList19.size();
        system.testclass.LinkedList linkedList28 = new system.testclass.LinkedList();
        linkedList28.clear();
        boolean boolean31 = linkedList28.remove((java.lang.Object) (-1L));
        boolean boolean33 = linkedList28.remove((java.lang.Object) (-1L));
        int int34 = linkedList28.size();
        boolean boolean35 = linkedList19.remove((java.lang.Object) linkedList28);
        linkedList28.clear();
        boolean boolean37 = linkedList6.remove((java.lang.Object) linkedList28);
        system.testclass.LinkedList linkedList38 = new system.testclass.LinkedList();
        boolean boolean40 = linkedList38.remove((java.lang.Object) 1.0d);
        boolean boolean42 = linkedList38.remove((java.lang.Object) 10);
        boolean boolean44 = linkedList38.remove((java.lang.Object) 1L);
        boolean boolean46 = linkedList38.remove((java.lang.Object) 10.0d);
        system.testclass.LinkedList linkedList47 = new system.testclass.LinkedList();
        linkedList47.clear();
        boolean boolean50 = linkedList47.remove((java.lang.Object) (-1L));
        boolean boolean52 = linkedList47.remove((java.lang.Object) (-1L));
        int int53 = linkedList47.size();
        system.testclass.LinkedList linkedList54 = new system.testclass.LinkedList();
        int int55 = linkedList54.size();
        linkedList54.clear();
        int int57 = linkedList54.size();
        system.testclass.LinkedList linkedList58 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList59 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass60 = linkedList59.getClass();
        boolean boolean61 = linkedList58.remove((java.lang.Object) wildcardClass60);
        int int62 = linkedList58.size();
        linkedList58.clear();
        java.lang.Class<?> wildcardClass64 = linkedList58.getClass();
        boolean boolean65 = linkedList54.remove((java.lang.Object) wildcardClass64);
        boolean boolean66 = linkedList47.remove((java.lang.Object) linkedList54);
        java.lang.Class<?> wildcardClass67 = linkedList54.getClass();
        boolean boolean68 = linkedList38.remove((java.lang.Object) linkedList54);
        boolean boolean69 = linkedList6.add((java.lang.Object) linkedList38);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList6", linkedList6.repOK_1());
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean2 = linkedList0.remove((java.lang.Object) 1.0d);
        linkedList0.clear();
        linkedList0.clear();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        boolean boolean7 = linkedList5.remove((java.lang.Object) 1.0d);
        int int8 = linkedList5.size();
        int int9 = linkedList5.size();
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        boolean boolean12 = linkedList10.remove((java.lang.Object) (byte) -1);
        boolean boolean14 = linkedList10.remove((java.lang.Object) 0L);
        int int15 = linkedList10.size();
        boolean boolean16 = linkedList5.remove((java.lang.Object) linkedList10);
        java.lang.Class<?> wildcardClass17 = linkedList10.getClass();
        boolean boolean18 = linkedList0.remove((java.lang.Object) wildcardClass17);
        system.testclass.LinkedList linkedList19 = new system.testclass.LinkedList();
        int int20 = linkedList19.size();
        linkedList19.clear();
        int int22 = linkedList19.size();
        system.testclass.LinkedList linkedList23 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList24 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass25 = linkedList24.getClass();
        boolean boolean26 = linkedList23.remove((java.lang.Object) wildcardClass25);
        int int27 = linkedList23.size();
        linkedList23.clear();
        boolean boolean29 = linkedList19.remove((java.lang.Object) linkedList23);
        linkedList23.clear();
        system.testclass.LinkedList linkedList31 = new system.testclass.LinkedList();
        linkedList31.clear();
        boolean boolean34 = linkedList31.remove((java.lang.Object) (-1L));
        boolean boolean36 = linkedList31.remove((java.lang.Object) (-1L));
        int int37 = linkedList31.size();
        system.testclass.LinkedList linkedList38 = new system.testclass.LinkedList();
        int int39 = linkedList38.size();
        linkedList38.clear();
        int int41 = linkedList38.size();
        system.testclass.LinkedList linkedList42 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList43 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass44 = linkedList43.getClass();
        boolean boolean45 = linkedList42.remove((java.lang.Object) wildcardClass44);
        int int46 = linkedList42.size();
        linkedList42.clear();
        java.lang.Class<?> wildcardClass48 = linkedList42.getClass();
        boolean boolean49 = linkedList38.remove((java.lang.Object) wildcardClass48);
        boolean boolean50 = linkedList31.remove((java.lang.Object) linkedList38);
        boolean boolean51 = linkedList23.remove((java.lang.Object) boolean50);
        int int52 = linkedList23.size();
        linkedList23.clear();
        java.lang.Class<?> wildcardClass54 = linkedList23.getClass();
        boolean boolean55 = linkedList0.add((java.lang.Object) linkedList23);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean2 = linkedList0.remove((java.lang.Object) (byte) -1);
        system.testclass.LinkedList linkedList3 = new system.testclass.LinkedList();
        int int4 = linkedList3.size();
        linkedList3.clear();
        int int6 = linkedList3.size();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass9 = linkedList8.getClass();
        boolean boolean10 = linkedList7.remove((java.lang.Object) wildcardClass9);
        int int11 = linkedList7.size();
        linkedList7.clear();
        boolean boolean13 = linkedList3.remove((java.lang.Object) linkedList7);
        linkedList7.clear();
        int int15 = linkedList7.size();
        system.testclass.LinkedList linkedList16 = new system.testclass.LinkedList();
        linkedList16.clear();
        boolean boolean19 = linkedList16.remove((java.lang.Object) (-1L));
        boolean boolean21 = linkedList16.remove((java.lang.Object) (-1L));
        int int22 = linkedList16.size();
        boolean boolean23 = linkedList7.remove((java.lang.Object) linkedList16);
        boolean boolean24 = linkedList0.remove((java.lang.Object) linkedList16);
        int int25 = linkedList16.size();
        linkedList16.clear();
        system.testclass.LinkedList linkedList27 = new system.testclass.LinkedList();
        boolean boolean29 = linkedList27.remove((java.lang.Object) 1.0d);
        boolean boolean31 = linkedList27.remove((java.lang.Object) 10);
        boolean boolean33 = linkedList27.remove((java.lang.Object) true);
        boolean boolean34 = linkedList16.add((java.lang.Object) true);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList16", linkedList16.repOK_1());
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        linkedList0.clear();
        linkedList0.clear();
        int int6 = linkedList0.size();
        boolean boolean8 = linkedList0.remove((java.lang.Object) ' ');
        linkedList0.clear();
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        linkedList10.clear();
        int int12 = linkedList10.size();
        linkedList10.clear();
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        int int15 = linkedList14.size();
        linkedList14.clear();
        int int17 = linkedList14.size();
        linkedList14.clear();
        boolean boolean20 = linkedList14.remove((java.lang.Object) (byte) 1);
        linkedList14.clear();
        boolean boolean22 = linkedList10.remove((java.lang.Object) linkedList14);
        boolean boolean23 = linkedList0.remove((java.lang.Object) linkedList14);
        system.testclass.LinkedList linkedList24 = new system.testclass.LinkedList();
        linkedList24.clear();
        linkedList24.clear();
        linkedList24.clear();
        boolean boolean28 = linkedList0.add((java.lang.Object) linkedList24);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        system.testclass.LinkedList linkedList3 = new system.testclass.LinkedList();
        linkedList3.clear();
        boolean boolean6 = linkedList3.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass9 = linkedList8.getClass();
        boolean boolean10 = linkedList7.remove((java.lang.Object) wildcardClass9);
        java.lang.Class<?> wildcardClass11 = linkedList7.getClass();
        boolean boolean12 = linkedList3.remove((java.lang.Object) wildcardClass11);
        boolean boolean13 = linkedList0.remove((java.lang.Object) boolean12);
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        linkedList14.clear();
        linkedList14.clear();
        system.testclass.LinkedList linkedList17 = new system.testclass.LinkedList();
        linkedList17.clear();
        boolean boolean20 = linkedList17.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList21 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList22 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass23 = linkedList22.getClass();
        boolean boolean24 = linkedList21.remove((java.lang.Object) wildcardClass23);
        java.lang.Class<?> wildcardClass25 = linkedList21.getClass();
        boolean boolean26 = linkedList17.remove((java.lang.Object) wildcardClass25);
        boolean boolean27 = linkedList14.remove((java.lang.Object) boolean26);
        boolean boolean29 = linkedList14.remove((java.lang.Object) ' ');
        boolean boolean30 = linkedList0.remove((java.lang.Object) linkedList14);
        int int31 = linkedList0.size();
        system.testclass.LinkedList linkedList32 = new system.testclass.LinkedList();
        linkedList32.clear();
        boolean boolean35 = linkedList32.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList36 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList37 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass38 = linkedList37.getClass();
        boolean boolean39 = linkedList36.remove((java.lang.Object) wildcardClass38);
        java.lang.Class<?> wildcardClass40 = linkedList36.getClass();
        boolean boolean41 = linkedList32.remove((java.lang.Object) wildcardClass40);
        boolean boolean42 = linkedList0.add((java.lang.Object) boolean41);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList1 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass2 = linkedList1.getClass();
        boolean boolean3 = linkedList0.remove((java.lang.Object) wildcardClass2);
        int int4 = linkedList0.size();
        linkedList0.clear();
        int int6 = linkedList0.size();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        linkedList7.clear();
        boolean boolean10 = linkedList7.remove((java.lang.Object) (-1));
        boolean boolean11 = linkedList0.remove((java.lang.Object) linkedList7);
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        boolean boolean14 = linkedList12.remove((java.lang.Object) 1.0d);
        boolean boolean16 = linkedList12.remove((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass17 = linkedList12.getClass();
        boolean boolean18 = linkedList0.remove((java.lang.Object) wildcardClass17);
        int int19 = linkedList0.size();
        boolean boolean21 = linkedList0.remove((java.lang.Object) 'a');
        system.testclass.LinkedList linkedList22 = new system.testclass.LinkedList();
        int int23 = linkedList22.size();
        linkedList22.clear();
        int int25 = linkedList22.size();
        int int26 = linkedList22.size();
        int int27 = linkedList22.size();
        system.testclass.LinkedList linkedList28 = new system.testclass.LinkedList();
        int int29 = linkedList28.size();
        linkedList28.clear();
        int int31 = linkedList28.size();
        int int32 = linkedList28.size();
        boolean boolean33 = linkedList22.remove((java.lang.Object) linkedList28);
        linkedList28.clear();
        int int35 = linkedList28.size();
        linkedList28.clear();
        java.lang.Class<?> wildcardClass37 = linkedList28.getClass();
        boolean boolean38 = linkedList0.remove((java.lang.Object) linkedList28);
        int int39 = linkedList0.size();
        system.testclass.LinkedList linkedList40 = new system.testclass.LinkedList();
        linkedList40.clear();
        boolean boolean43 = linkedList40.remove((java.lang.Object) (-1L));
        boolean boolean45 = linkedList40.remove((java.lang.Object) (-1L));
        int int46 = linkedList40.size();
        system.testclass.LinkedList linkedList47 = new system.testclass.LinkedList();
        boolean boolean49 = linkedList47.remove((java.lang.Object) 1.0d);
        int int50 = linkedList47.size();
        boolean boolean51 = linkedList40.remove((java.lang.Object) int50);
        java.lang.Class<?> wildcardClass52 = linkedList40.getClass();
        boolean boolean53 = linkedList0.add((java.lang.Object) linkedList40);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList1 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass2 = linkedList1.getClass();
        boolean boolean3 = linkedList0.remove((java.lang.Object) wildcardClass2);
        int int4 = linkedList0.size();
        linkedList0.clear();
        int int6 = linkedList0.size();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        linkedList7.clear();
        boolean boolean10 = linkedList7.remove((java.lang.Object) (-1));
        boolean boolean11 = linkedList0.remove((java.lang.Object) linkedList7);
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        boolean boolean14 = linkedList12.remove((java.lang.Object) 1.0d);
        boolean boolean16 = linkedList12.remove((java.lang.Object) 10);
        boolean boolean18 = linkedList12.remove((java.lang.Object) 1L);
        boolean boolean20 = linkedList12.remove((java.lang.Object) 10.0d);
        java.lang.Class<?> wildcardClass21 = linkedList12.getClass();
        boolean boolean22 = linkedList0.add((java.lang.Object) linkedList12);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        int int4 = linkedList0.size();
        int int5 = linkedList0.size();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        int int7 = linkedList6.size();
        linkedList6.clear();
        int int9 = linkedList6.size();
        int int10 = linkedList6.size();
        boolean boolean11 = linkedList0.remove((java.lang.Object) linkedList6);
        int int12 = linkedList6.size();
        linkedList6.clear();
        int int14 = linkedList6.size();
        system.testclass.LinkedList linkedList15 = new system.testclass.LinkedList();
        int int16 = linkedList15.size();
        linkedList15.clear();
        int int18 = linkedList15.size();
        system.testclass.LinkedList linkedList19 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList20 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass21 = linkedList20.getClass();
        boolean boolean22 = linkedList19.remove((java.lang.Object) wildcardClass21);
        int int23 = linkedList19.size();
        linkedList19.clear();
        boolean boolean25 = linkedList15.remove((java.lang.Object) linkedList19);
        linkedList19.clear();
        int int27 = linkedList19.size();
        system.testclass.LinkedList linkedList28 = new system.testclass.LinkedList();
        linkedList28.clear();
        boolean boolean31 = linkedList28.remove((java.lang.Object) (-1L));
        boolean boolean33 = linkedList28.remove((java.lang.Object) (-1L));
        int int34 = linkedList28.size();
        boolean boolean35 = linkedList19.remove((java.lang.Object) linkedList28);
        linkedList28.clear();
        boolean boolean37 = linkedList6.remove((java.lang.Object) linkedList28);
        system.testclass.LinkedList linkedList38 = new system.testclass.LinkedList();
        int int39 = linkedList38.size();
        linkedList38.clear();
        int int41 = linkedList38.size();
        int int42 = linkedList38.size();
        int int43 = linkedList38.size();
        system.testclass.LinkedList linkedList44 = new system.testclass.LinkedList();
        int int45 = linkedList44.size();
        linkedList44.clear();
        int int47 = linkedList44.size();
        int int48 = linkedList44.size();
        boolean boolean49 = linkedList38.remove((java.lang.Object) linkedList44);
        linkedList44.clear();
        int int51 = linkedList44.size();
        system.testclass.LinkedList linkedList52 = new system.testclass.LinkedList();
        boolean boolean54 = linkedList52.remove((java.lang.Object) (byte) -1);
        boolean boolean56 = linkedList52.remove((java.lang.Object) '#');
        linkedList52.clear();
        boolean boolean58 = linkedList44.remove((java.lang.Object) linkedList52);
        system.testclass.LinkedList linkedList59 = new system.testclass.LinkedList();
        int int60 = linkedList59.size();
        linkedList59.clear();
        int int62 = linkedList59.size();
        system.testclass.LinkedList linkedList63 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList64 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass65 = linkedList64.getClass();
        boolean boolean66 = linkedList63.remove((java.lang.Object) wildcardClass65);
        int int67 = linkedList63.size();
        linkedList63.clear();
        java.lang.Class<?> wildcardClass69 = linkedList63.getClass();
        boolean boolean70 = linkedList59.remove((java.lang.Object) wildcardClass69);
        boolean boolean71 = linkedList52.remove((java.lang.Object) linkedList59);
        system.testclass.LinkedList linkedList72 = new system.testclass.LinkedList();
        int int73 = linkedList72.size();
        linkedList72.clear();
        int int75 = linkedList72.size();
        linkedList72.clear();
        linkedList72.clear();
        int int78 = linkedList72.size();
        boolean boolean80 = linkedList72.remove((java.lang.Object) ' ');
        linkedList72.clear();
        int int82 = linkedList72.size();
        linkedList72.clear();
        boolean boolean84 = linkedList59.remove((java.lang.Object) linkedList72);
        boolean boolean85 = linkedList28.add((java.lang.Object) boolean84);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList28", linkedList28.repOK_1());
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        boolean boolean3 = linkedList0.remove((java.lang.Object) (-1L));
        boolean boolean5 = linkedList0.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        int int7 = linkedList6.size();
        linkedList6.clear();
        int int9 = linkedList6.size();
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass12 = linkedList11.getClass();
        boolean boolean13 = linkedList10.remove((java.lang.Object) wildcardClass12);
        int int14 = linkedList10.size();
        linkedList10.clear();
        java.lang.Class<?> wildcardClass16 = linkedList10.getClass();
        boolean boolean17 = linkedList6.remove((java.lang.Object) wildcardClass16);
        boolean boolean18 = linkedList0.remove((java.lang.Object) boolean17);
        system.testclass.LinkedList linkedList19 = new system.testclass.LinkedList();
        int int20 = linkedList19.size();
        linkedList19.clear();
        boolean boolean23 = linkedList19.remove((java.lang.Object) "hi!");
        int int24 = linkedList19.size();
        int int25 = linkedList19.size();
        system.testclass.LinkedList linkedList26 = new system.testclass.LinkedList();
        linkedList26.clear();
        linkedList26.clear();
        system.testclass.LinkedList linkedList29 = new system.testclass.LinkedList();
        linkedList29.clear();
        int int31 = linkedList29.size();
        boolean boolean32 = linkedList26.remove((java.lang.Object) linkedList29);
        int int33 = linkedList29.size();
        java.lang.Class<?> wildcardClass34 = linkedList29.getClass();
        boolean boolean35 = linkedList19.remove((java.lang.Object) wildcardClass34);
        boolean boolean36 = linkedList0.remove((java.lang.Object) linkedList19);
        system.testclass.LinkedList linkedList37 = new system.testclass.LinkedList();
        int int38 = linkedList37.size();
        linkedList37.clear();
        int int40 = linkedList37.size();
        system.testclass.LinkedList linkedList41 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList42 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass43 = linkedList42.getClass();
        boolean boolean44 = linkedList41.remove((java.lang.Object) wildcardClass43);
        int int45 = linkedList41.size();
        linkedList41.clear();
        boolean boolean47 = linkedList37.remove((java.lang.Object) linkedList41);
        linkedList41.clear();
        system.testclass.LinkedList linkedList49 = new system.testclass.LinkedList();
        linkedList49.clear();
        boolean boolean52 = linkedList49.remove((java.lang.Object) (-1L));
        boolean boolean54 = linkedList49.remove((java.lang.Object) (-1L));
        int int55 = linkedList49.size();
        system.testclass.LinkedList linkedList56 = new system.testclass.LinkedList();
        int int57 = linkedList56.size();
        linkedList56.clear();
        int int59 = linkedList56.size();
        system.testclass.LinkedList linkedList60 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList61 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass62 = linkedList61.getClass();
        boolean boolean63 = linkedList60.remove((java.lang.Object) wildcardClass62);
        int int64 = linkedList60.size();
        linkedList60.clear();
        java.lang.Class<?> wildcardClass66 = linkedList60.getClass();
        boolean boolean67 = linkedList56.remove((java.lang.Object) wildcardClass66);
        boolean boolean68 = linkedList49.remove((java.lang.Object) linkedList56);
        boolean boolean69 = linkedList41.remove((java.lang.Object) boolean68);
        int int70 = linkedList41.size();
        linkedList41.clear();
        boolean boolean72 = linkedList0.add((java.lang.Object) linkedList41);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean2 = linkedList0.remove((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedList0.remove((java.lang.Object) 100.0d);
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass6 = linkedList5.getClass();
        boolean boolean7 = linkedList0.remove((java.lang.Object) linkedList5);
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        linkedList8.clear();
        linkedList8.clear();
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        boolean boolean13 = linkedList11.remove((java.lang.Object) 1.0d);
        linkedList11.clear();
        java.lang.Class<?> wildcardClass15 = linkedList11.getClass();
        boolean boolean16 = linkedList8.remove((java.lang.Object) wildcardClass15);
        int int17 = linkedList8.size();
        boolean boolean19 = linkedList8.remove((java.lang.Object) 1);
        boolean boolean20 = linkedList5.add((java.lang.Object) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList5", linkedList5.repOK_1());
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        int int2 = linkedList0.size();
        linkedList0.clear();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        int int5 = linkedList4.size();
        linkedList4.clear();
        int int7 = linkedList4.size();
        linkedList4.clear();
        boolean boolean10 = linkedList4.remove((java.lang.Object) (byte) 1);
        linkedList4.clear();
        boolean boolean12 = linkedList0.remove((java.lang.Object) linkedList4);
        system.testclass.LinkedList linkedList13 = new system.testclass.LinkedList();
        int int14 = linkedList13.size();
        linkedList13.clear();
        int int16 = linkedList13.size();
        java.lang.Class<?> wildcardClass17 = linkedList13.getClass();
        boolean boolean18 = linkedList4.add((java.lang.Object) linkedList13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList4", linkedList4.repOK_1());
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        boolean boolean4 = linkedList0.remove((java.lang.Object) "hi!");
        int int5 = linkedList0.size();
        int int6 = linkedList0.size();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        linkedList7.clear();
        linkedList7.clear();
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        linkedList10.clear();
        int int12 = linkedList10.size();
        boolean boolean13 = linkedList7.remove((java.lang.Object) linkedList10);
        int int14 = linkedList10.size();
        java.lang.Class<?> wildcardClass15 = linkedList10.getClass();
        boolean boolean16 = linkedList0.remove((java.lang.Object) wildcardClass15);
        java.lang.Object obj17 = null;
        boolean boolean18 = linkedList0.add(obj17);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        int int4 = linkedList0.size();
        int int5 = linkedList0.size();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass8 = linkedList7.getClass();
        boolean boolean9 = linkedList6.remove((java.lang.Object) wildcardClass8);
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        int int11 = linkedList10.size();
        linkedList10.clear();
        int int13 = linkedList10.size();
        java.lang.Class<?> wildcardClass14 = linkedList10.getClass();
        boolean boolean15 = linkedList6.remove((java.lang.Object) linkedList10);
        boolean boolean16 = linkedList0.remove((java.lang.Object) boolean15);
        linkedList0.clear();
        int int18 = linkedList0.size();
        int int19 = linkedList0.size();
        system.testclass.LinkedList linkedList20 = new system.testclass.LinkedList();
        linkedList20.clear();
        int int22 = linkedList20.size();
        linkedList20.clear();
        system.testclass.LinkedList linkedList24 = new system.testclass.LinkedList();
        int int25 = linkedList24.size();
        linkedList24.clear();
        int int27 = linkedList24.size();
        system.testclass.LinkedList linkedList28 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList29 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass30 = linkedList29.getClass();
        boolean boolean31 = linkedList28.remove((java.lang.Object) wildcardClass30);
        int int32 = linkedList28.size();
        linkedList28.clear();
        boolean boolean34 = linkedList24.remove((java.lang.Object) linkedList28);
        linkedList28.clear();
        int int36 = linkedList28.size();
        boolean boolean37 = linkedList20.remove((java.lang.Object) int36);
        int int38 = linkedList20.size();
        boolean boolean39 = linkedList0.add((java.lang.Object) linkedList20);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        system.testclass.LinkedList linkedList3 = new system.testclass.LinkedList();
        boolean boolean5 = linkedList3.remove((java.lang.Object) 1.0d);
        linkedList3.clear();
        java.lang.Class<?> wildcardClass7 = linkedList3.getClass();
        boolean boolean8 = linkedList0.remove((java.lang.Object) wildcardClass7);
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        boolean boolean11 = linkedList9.remove((java.lang.Object) 1.0d);
        boolean boolean13 = linkedList9.remove((java.lang.Object) 10);
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass15 = linkedList14.getClass();
        boolean boolean16 = linkedList9.remove((java.lang.Object) linkedList14);
        linkedList9.clear();
        system.testclass.LinkedList linkedList18 = new system.testclass.LinkedList();
        int int19 = linkedList18.size();
        linkedList18.clear();
        int int21 = linkedList18.size();
        int int22 = linkedList18.size();
        int int23 = linkedList18.size();
        system.testclass.LinkedList linkedList24 = new system.testclass.LinkedList();
        int int25 = linkedList24.size();
        linkedList24.clear();
        int int27 = linkedList24.size();
        int int28 = linkedList24.size();
        boolean boolean29 = linkedList18.remove((java.lang.Object) linkedList24);
        linkedList24.clear();
        int int31 = linkedList24.size();
        system.testclass.LinkedList linkedList32 = new system.testclass.LinkedList();
        boolean boolean34 = linkedList32.remove((java.lang.Object) (byte) -1);
        boolean boolean36 = linkedList32.remove((java.lang.Object) '#');
        linkedList32.clear();
        boolean boolean38 = linkedList24.remove((java.lang.Object) linkedList32);
        linkedList24.clear();
        java.lang.Class<?> wildcardClass40 = linkedList24.getClass();
        boolean boolean41 = linkedList9.remove((java.lang.Object) wildcardClass40);
        boolean boolean42 = linkedList0.remove((java.lang.Object) boolean41);
        system.testclass.LinkedList linkedList43 = new system.testclass.LinkedList();
        linkedList43.clear();
        linkedList43.clear();
        system.testclass.LinkedList linkedList46 = new system.testclass.LinkedList();
        linkedList46.clear();
        int int48 = linkedList46.size();
        boolean boolean49 = linkedList43.remove((java.lang.Object) linkedList46);
        int int50 = linkedList43.size();
        linkedList43.clear();
        boolean boolean52 = linkedList0.remove((java.lang.Object) linkedList43);
        boolean boolean54 = linkedList43.add((java.lang.Object) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList43", linkedList43.repOK_1());
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList1 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass2 = linkedList1.getClass();
        boolean boolean3 = linkedList0.remove((java.lang.Object) wildcardClass2);
        int int4 = linkedList0.size();
        linkedList0.clear();
        int int6 = linkedList0.size();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        linkedList7.clear();
        boolean boolean10 = linkedList7.remove((java.lang.Object) (-1));
        boolean boolean11 = linkedList0.remove((java.lang.Object) linkedList7);
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        int int13 = linkedList12.size();
        linkedList12.clear();
        int int15 = linkedList12.size();
        int int16 = linkedList12.size();
        linkedList12.clear();
        int int18 = linkedList12.size();
        linkedList12.clear();
        int int20 = linkedList12.size();
        boolean boolean21 = linkedList7.add((java.lang.Object) int20);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList7", linkedList7.repOK_1());
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        boolean boolean3 = linkedList0.remove((java.lang.Object) (-1));
        linkedList0.clear();
        int int5 = linkedList0.size();
        linkedList0.clear();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        int int8 = linkedList7.size();
        linkedList7.clear();
        int int10 = linkedList7.size();
        int int11 = linkedList7.size();
        int int12 = linkedList7.size();
        system.testclass.LinkedList linkedList13 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass15 = linkedList14.getClass();
        boolean boolean16 = linkedList13.remove((java.lang.Object) wildcardClass15);
        system.testclass.LinkedList linkedList17 = new system.testclass.LinkedList();
        int int18 = linkedList17.size();
        linkedList17.clear();
        int int20 = linkedList17.size();
        java.lang.Class<?> wildcardClass21 = linkedList17.getClass();
        boolean boolean22 = linkedList13.remove((java.lang.Object) linkedList17);
        boolean boolean23 = linkedList7.remove((java.lang.Object) boolean22);
        system.testclass.LinkedList linkedList24 = new system.testclass.LinkedList();
        linkedList24.clear();
        boolean boolean27 = linkedList24.remove((java.lang.Object) (-1L));
        linkedList24.clear();
        boolean boolean29 = linkedList7.remove((java.lang.Object) linkedList24);
        boolean boolean30 = linkedList0.add((java.lang.Object) boolean29);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean2 = linkedList0.remove((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedList0.remove((java.lang.Object) 0L);
        boolean boolean6 = linkedList0.remove((java.lang.Object) (short) 100);
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        boolean boolean9 = linkedList7.remove((java.lang.Object) 1.0d);
        boolean boolean11 = linkedList7.remove((java.lang.Object) 10);
        boolean boolean13 = linkedList7.remove((java.lang.Object) 1L);
        boolean boolean15 = linkedList7.remove((java.lang.Object) 10.0d);
        linkedList7.clear();
        linkedList7.clear();
        linkedList7.clear();
        system.testclass.LinkedList linkedList19 = new system.testclass.LinkedList();
        int int20 = linkedList19.size();
        linkedList19.clear();
        system.testclass.LinkedList linkedList22 = new system.testclass.LinkedList();
        linkedList22.clear();
        boolean boolean25 = linkedList22.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList26 = new system.testclass.LinkedList();
        boolean boolean28 = linkedList26.remove((java.lang.Object) (byte) -1);
        boolean boolean29 = linkedList22.remove((java.lang.Object) linkedList26);
        linkedList26.clear();
        java.lang.Class<?> wildcardClass31 = linkedList26.getClass();
        boolean boolean32 = linkedList19.remove((java.lang.Object) linkedList26);
        boolean boolean33 = linkedList7.remove((java.lang.Object) linkedList19);
        boolean boolean34 = linkedList0.add((java.lang.Object) linkedList7);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        system.testclass.LinkedList linkedList3 = new system.testclass.LinkedList();
        linkedList3.clear();
        boolean boolean6 = linkedList3.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass9 = linkedList8.getClass();
        boolean boolean10 = linkedList7.remove((java.lang.Object) wildcardClass9);
        java.lang.Class<?> wildcardClass11 = linkedList7.getClass();
        boolean boolean12 = linkedList3.remove((java.lang.Object) wildcardClass11);
        boolean boolean13 = linkedList0.remove((java.lang.Object) boolean12);
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        linkedList14.clear();
        linkedList14.clear();
        system.testclass.LinkedList linkedList17 = new system.testclass.LinkedList();
        linkedList17.clear();
        boolean boolean20 = linkedList17.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList21 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList22 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass23 = linkedList22.getClass();
        boolean boolean24 = linkedList21.remove((java.lang.Object) wildcardClass23);
        java.lang.Class<?> wildcardClass25 = linkedList21.getClass();
        boolean boolean26 = linkedList17.remove((java.lang.Object) wildcardClass25);
        boolean boolean27 = linkedList14.remove((java.lang.Object) boolean26);
        boolean boolean29 = linkedList14.remove((java.lang.Object) ' ');
        boolean boolean30 = linkedList0.remove((java.lang.Object) linkedList14);
        system.testclass.LinkedList linkedList31 = new system.testclass.LinkedList();
        linkedList31.clear();
        boolean boolean34 = linkedList31.remove((java.lang.Object) (-1));
        boolean boolean35 = linkedList14.remove((java.lang.Object) (-1));
        linkedList14.clear();
        system.testclass.LinkedList linkedList37 = new system.testclass.LinkedList();
        linkedList37.clear();
        linkedList37.clear();
        system.testclass.LinkedList linkedList40 = new system.testclass.LinkedList();
        linkedList40.clear();
        boolean boolean43 = linkedList40.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList44 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList45 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass46 = linkedList45.getClass();
        boolean boolean47 = linkedList44.remove((java.lang.Object) wildcardClass46);
        java.lang.Class<?> wildcardClass48 = linkedList44.getClass();
        boolean boolean49 = linkedList40.remove((java.lang.Object) wildcardClass48);
        boolean boolean50 = linkedList37.remove((java.lang.Object) boolean49);
        system.testclass.LinkedList linkedList51 = new system.testclass.LinkedList();
        linkedList51.clear();
        linkedList51.clear();
        system.testclass.LinkedList linkedList54 = new system.testclass.LinkedList();
        linkedList54.clear();
        boolean boolean57 = linkedList54.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList58 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList59 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass60 = linkedList59.getClass();
        boolean boolean61 = linkedList58.remove((java.lang.Object) wildcardClass60);
        java.lang.Class<?> wildcardClass62 = linkedList58.getClass();
        boolean boolean63 = linkedList54.remove((java.lang.Object) wildcardClass62);
        boolean boolean64 = linkedList51.remove((java.lang.Object) boolean63);
        boolean boolean66 = linkedList51.remove((java.lang.Object) ' ');
        boolean boolean67 = linkedList37.remove((java.lang.Object) linkedList51);
        int int68 = linkedList37.size();
        boolean boolean69 = linkedList14.add((java.lang.Object) int68);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList14", linkedList14.repOK_1());
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        system.testclass.LinkedList linkedList3 = new system.testclass.LinkedList();
        linkedList3.clear();
        boolean boolean6 = linkedList3.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass9 = linkedList8.getClass();
        boolean boolean10 = linkedList7.remove((java.lang.Object) wildcardClass9);
        java.lang.Class<?> wildcardClass11 = linkedList7.getClass();
        boolean boolean12 = linkedList3.remove((java.lang.Object) wildcardClass11);
        boolean boolean13 = linkedList0.remove((java.lang.Object) boolean12);
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        linkedList14.clear();
        boolean boolean17 = linkedList14.remove((java.lang.Object) (-1L));
        java.lang.Class<?> wildcardClass18 = linkedList14.getClass();
        boolean boolean19 = linkedList0.remove((java.lang.Object) linkedList14);
        system.testclass.LinkedList linkedList20 = new system.testclass.LinkedList();
        boolean boolean22 = linkedList20.remove((java.lang.Object) 1.0d);
        int int23 = linkedList20.size();
        int int24 = linkedList20.size();
        boolean boolean26 = linkedList20.remove((java.lang.Object) (short) 10);
        boolean boolean27 = linkedList0.add((java.lang.Object) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        boolean boolean3 = linkedList0.remove((java.lang.Object) (-1L));
        boolean boolean5 = linkedList0.remove((java.lang.Object) (-1L));
        int int6 = linkedList0.size();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        int int8 = linkedList7.size();
        linkedList7.clear();
        int int10 = linkedList7.size();
        int int11 = linkedList7.size();
        int int12 = linkedList7.size();
        system.testclass.LinkedList linkedList13 = new system.testclass.LinkedList();
        int int14 = linkedList13.size();
        linkedList13.clear();
        int int16 = linkedList13.size();
        int int17 = linkedList13.size();
        boolean boolean18 = linkedList7.remove((java.lang.Object) linkedList13);
        linkedList13.clear();
        boolean boolean21 = linkedList13.remove((java.lang.Object) 0L);
        linkedList13.clear();
        linkedList13.clear();
        boolean boolean24 = linkedList0.add((java.lang.Object) linkedList13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        boolean boolean4 = linkedList0.remove((java.lang.Object) "hi!");
        int int5 = linkedList0.size();
        int int6 = linkedList0.size();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        linkedList7.clear();
        boolean boolean10 = linkedList7.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        boolean boolean13 = linkedList11.remove((java.lang.Object) (byte) -1);
        boolean boolean14 = linkedList7.remove((java.lang.Object) linkedList11);
        boolean boolean16 = linkedList7.remove((java.lang.Object) (byte) -1);
        int int17 = linkedList7.size();
        linkedList7.clear();
        boolean boolean19 = linkedList0.remove((java.lang.Object) linkedList7);
        system.testclass.LinkedList linkedList20 = new system.testclass.LinkedList();
        linkedList20.clear();
        boolean boolean23 = linkedList20.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList24 = new system.testclass.LinkedList();
        boolean boolean26 = linkedList24.remove((java.lang.Object) (byte) -1);
        boolean boolean27 = linkedList20.remove((java.lang.Object) linkedList24);
        linkedList24.clear();
        linkedList24.clear();
        linkedList24.clear();
        boolean boolean31 = linkedList7.add((java.lang.Object) linkedList24);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList7", linkedList7.repOK_1());
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        int int4 = linkedList0.size();
        int int5 = linkedList0.size();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass8 = linkedList7.getClass();
        boolean boolean9 = linkedList6.remove((java.lang.Object) wildcardClass8);
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        int int11 = linkedList10.size();
        linkedList10.clear();
        int int13 = linkedList10.size();
        java.lang.Class<?> wildcardClass14 = linkedList10.getClass();
        boolean boolean15 = linkedList6.remove((java.lang.Object) linkedList10);
        boolean boolean16 = linkedList0.remove((java.lang.Object) boolean15);
        int int17 = linkedList0.size();
        system.testclass.LinkedList linkedList18 = new system.testclass.LinkedList();
        boolean boolean20 = linkedList18.remove((java.lang.Object) (byte) -1);
        boolean boolean22 = linkedList18.remove((java.lang.Object) 0L);
        int int23 = linkedList18.size();
        int int24 = linkedList18.size();
        int int25 = linkedList18.size();
        system.testclass.LinkedList linkedList26 = new system.testclass.LinkedList();
        linkedList26.clear();
        linkedList26.clear();
        system.testclass.LinkedList linkedList29 = new system.testclass.LinkedList();
        linkedList29.clear();
        int int31 = linkedList29.size();
        boolean boolean32 = linkedList26.remove((java.lang.Object) linkedList29);
        system.testclass.LinkedList linkedList33 = new system.testclass.LinkedList();
        linkedList33.clear();
        boolean boolean36 = linkedList33.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList37 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList38 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass39 = linkedList38.getClass();
        boolean boolean40 = linkedList37.remove((java.lang.Object) wildcardClass39);
        java.lang.Class<?> wildcardClass41 = linkedList37.getClass();
        boolean boolean42 = linkedList33.remove((java.lang.Object) wildcardClass41);
        boolean boolean43 = linkedList26.remove((java.lang.Object) wildcardClass41);
        boolean boolean44 = linkedList18.remove((java.lang.Object) linkedList26);
        int int45 = linkedList26.size();
        boolean boolean46 = linkedList0.add((java.lang.Object) linkedList26);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        linkedList0.clear();
        linkedList0.clear();
        int int6 = linkedList0.size();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass9 = linkedList8.getClass();
        boolean boolean10 = linkedList7.remove((java.lang.Object) wildcardClass9);
        int int11 = linkedList7.size();
        linkedList7.clear();
        boolean boolean13 = linkedList0.remove((java.lang.Object) linkedList7);
        int int14 = linkedList0.size();
        system.testclass.LinkedList linkedList15 = new system.testclass.LinkedList();
        boolean boolean17 = linkedList15.remove((java.lang.Object) 1.0d);
        int int18 = linkedList15.size();
        system.testclass.LinkedList linkedList19 = new system.testclass.LinkedList();
        int int20 = linkedList19.size();
        linkedList19.clear();
        int int22 = linkedList19.size();
        linkedList19.clear();
        java.lang.Class<?> wildcardClass24 = linkedList19.getClass();
        boolean boolean25 = linkedList15.remove((java.lang.Object) linkedList19);
        linkedList15.clear();
        boolean boolean27 = linkedList0.remove((java.lang.Object) linkedList15);
        system.testclass.LinkedList linkedList28 = new system.testclass.LinkedList();
        int int29 = linkedList28.size();
        linkedList28.clear();
        int int31 = linkedList28.size();
        system.testclass.LinkedList linkedList32 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList33 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass34 = linkedList33.getClass();
        boolean boolean35 = linkedList32.remove((java.lang.Object) wildcardClass34);
        int int36 = linkedList32.size();
        linkedList32.clear();
        boolean boolean38 = linkedList28.remove((java.lang.Object) linkedList32);
        linkedList32.clear();
        int int40 = linkedList32.size();
        system.testclass.LinkedList linkedList41 = new system.testclass.LinkedList();
        linkedList41.clear();
        boolean boolean44 = linkedList41.remove((java.lang.Object) (-1L));
        boolean boolean46 = linkedList41.remove((java.lang.Object) (-1L));
        int int47 = linkedList41.size();
        boolean boolean48 = linkedList32.remove((java.lang.Object) linkedList41);
        system.testclass.LinkedList linkedList49 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList50 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass51 = linkedList50.getClass();
        boolean boolean52 = linkedList49.remove((java.lang.Object) wildcardClass51);
        java.lang.Class<?> wildcardClass53 = linkedList49.getClass();
        boolean boolean54 = linkedList32.remove((java.lang.Object) linkedList49);
        linkedList32.clear();
        int int56 = linkedList32.size();
        int int57 = linkedList32.size();
        boolean boolean58 = linkedList0.add((java.lang.Object) linkedList32);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        system.testclass.LinkedList linkedList3 = new system.testclass.LinkedList();
        linkedList3.clear();
        boolean boolean6 = linkedList3.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass9 = linkedList8.getClass();
        boolean boolean10 = linkedList7.remove((java.lang.Object) wildcardClass9);
        java.lang.Class<?> wildcardClass11 = linkedList7.getClass();
        boolean boolean12 = linkedList3.remove((java.lang.Object) wildcardClass11);
        boolean boolean13 = linkedList0.remove((java.lang.Object) boolean12);
        boolean boolean15 = linkedList0.remove((java.lang.Object) ' ');
        system.testclass.LinkedList linkedList16 = new system.testclass.LinkedList();
        int int17 = linkedList16.size();
        linkedList16.clear();
        int int19 = linkedList16.size();
        int int20 = linkedList16.size();
        int int21 = linkedList16.size();
        system.testclass.LinkedList linkedList22 = new system.testclass.LinkedList();
        int int23 = linkedList22.size();
        linkedList22.clear();
        int int25 = linkedList22.size();
        int int26 = linkedList22.size();
        boolean boolean27 = linkedList16.remove((java.lang.Object) linkedList22);
        linkedList22.clear();
        boolean boolean30 = linkedList22.remove((java.lang.Object) 0L);
        linkedList22.clear();
        int int32 = linkedList22.size();
        boolean boolean33 = linkedList0.remove((java.lang.Object) linkedList22);
        system.testclass.LinkedList linkedList34 = new system.testclass.LinkedList();
        boolean boolean36 = linkedList34.remove((java.lang.Object) 1.0d);
        boolean boolean38 = linkedList34.remove((java.lang.Object) 10);
        linkedList34.clear();
        boolean boolean40 = linkedList22.remove((java.lang.Object) linkedList34);
        linkedList34.clear();
        system.testclass.LinkedList linkedList42 = new system.testclass.LinkedList();
        linkedList42.clear();
        linkedList42.clear();
        system.testclass.LinkedList linkedList45 = new system.testclass.LinkedList();
        boolean boolean47 = linkedList45.remove((java.lang.Object) (byte) -1);
        boolean boolean49 = linkedList45.remove((java.lang.Object) 100.0d);
        system.testclass.LinkedList linkedList50 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass51 = linkedList50.getClass();
        boolean boolean52 = linkedList45.remove((java.lang.Object) linkedList50);
        boolean boolean53 = linkedList42.remove((java.lang.Object) linkedList50);
        boolean boolean54 = linkedList34.add((java.lang.Object) linkedList50);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList34", linkedList34.repOK_1());
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        boolean boolean3 = linkedList0.remove((java.lang.Object) (-1L));
        boolean boolean5 = linkedList0.remove((java.lang.Object) (-1L));
        int int6 = linkedList0.size();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        int int8 = linkedList7.size();
        linkedList7.clear();
        int int10 = linkedList7.size();
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass13 = linkedList12.getClass();
        boolean boolean14 = linkedList11.remove((java.lang.Object) wildcardClass13);
        int int15 = linkedList11.size();
        linkedList11.clear();
        java.lang.Class<?> wildcardClass17 = linkedList11.getClass();
        boolean boolean18 = linkedList7.remove((java.lang.Object) wildcardClass17);
        boolean boolean19 = linkedList0.remove((java.lang.Object) linkedList7);
        int int20 = linkedList7.size();
        linkedList7.clear();
        system.testclass.LinkedList linkedList22 = new system.testclass.LinkedList();
        int int23 = linkedList22.size();
        linkedList22.clear();
        int int25 = linkedList22.size();
        int int26 = linkedList22.size();
        int int27 = linkedList22.size();
        system.testclass.LinkedList linkedList28 = new system.testclass.LinkedList();
        int int29 = linkedList28.size();
        linkedList28.clear();
        int int31 = linkedList28.size();
        int int32 = linkedList28.size();
        boolean boolean33 = linkedList22.remove((java.lang.Object) linkedList28);
        linkedList28.clear();
        int int35 = linkedList28.size();
        system.testclass.LinkedList linkedList36 = new system.testclass.LinkedList();
        boolean boolean38 = linkedList36.remove((java.lang.Object) (byte) -1);
        boolean boolean40 = linkedList36.remove((java.lang.Object) '#');
        linkedList36.clear();
        boolean boolean42 = linkedList28.remove((java.lang.Object) linkedList36);
        system.testclass.LinkedList linkedList43 = new system.testclass.LinkedList();
        int int44 = linkedList43.size();
        linkedList43.clear();
        int int46 = linkedList43.size();
        system.testclass.LinkedList linkedList47 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList48 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass49 = linkedList48.getClass();
        boolean boolean50 = linkedList47.remove((java.lang.Object) wildcardClass49);
        int int51 = linkedList47.size();
        linkedList47.clear();
        java.lang.Class<?> wildcardClass53 = linkedList47.getClass();
        boolean boolean54 = linkedList43.remove((java.lang.Object) wildcardClass53);
        boolean boolean55 = linkedList36.remove((java.lang.Object) linkedList43);
        system.testclass.LinkedList linkedList56 = new system.testclass.LinkedList();
        int int57 = linkedList56.size();
        linkedList56.clear();
        int int59 = linkedList56.size();
        linkedList56.clear();
        linkedList56.clear();
        int int62 = linkedList56.size();
        boolean boolean64 = linkedList56.remove((java.lang.Object) ' ');
        linkedList56.clear();
        int int66 = linkedList56.size();
        linkedList56.clear();
        boolean boolean68 = linkedList43.remove((java.lang.Object) linkedList56);
        system.testclass.LinkedList linkedList69 = new system.testclass.LinkedList();
        boolean boolean71 = linkedList69.remove((java.lang.Object) (byte) -1);
        system.testclass.LinkedList linkedList72 = new system.testclass.LinkedList();
        int int73 = linkedList72.size();
        linkedList72.clear();
        int int75 = linkedList72.size();
        system.testclass.LinkedList linkedList76 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList77 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass78 = linkedList77.getClass();
        boolean boolean79 = linkedList76.remove((java.lang.Object) wildcardClass78);
        int int80 = linkedList76.size();
        linkedList76.clear();
        boolean boolean82 = linkedList72.remove((java.lang.Object) linkedList76);
        linkedList76.clear();
        int int84 = linkedList76.size();
        system.testclass.LinkedList linkedList85 = new system.testclass.LinkedList();
        linkedList85.clear();
        boolean boolean88 = linkedList85.remove((java.lang.Object) (-1L));
        boolean boolean90 = linkedList85.remove((java.lang.Object) (-1L));
        int int91 = linkedList85.size();
        boolean boolean92 = linkedList76.remove((java.lang.Object) linkedList85);
        boolean boolean93 = linkedList69.remove((java.lang.Object) linkedList85);
        int int94 = linkedList69.size();
        boolean boolean95 = linkedList56.remove((java.lang.Object) linkedList69);
        boolean boolean96 = linkedList7.add((java.lang.Object) linkedList69);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList7", linkedList7.repOK_1());
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass6 = linkedList5.getClass();
        boolean boolean7 = linkedList4.remove((java.lang.Object) wildcardClass6);
        int int8 = linkedList4.size();
        linkedList4.clear();
        boolean boolean10 = linkedList0.remove((java.lang.Object) linkedList4);
        linkedList4.clear();
        linkedList4.clear();
        system.testclass.LinkedList linkedList13 = new system.testclass.LinkedList();
        boolean boolean15 = linkedList13.remove((java.lang.Object) 1.0d);
        linkedList13.clear();
        boolean boolean17 = linkedList4.remove((java.lang.Object) linkedList13);
        system.testclass.LinkedList linkedList18 = new system.testclass.LinkedList();
        int int19 = linkedList18.size();
        linkedList18.clear();
        int int21 = linkedList18.size();
        system.testclass.LinkedList linkedList22 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList23 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass24 = linkedList23.getClass();
        boolean boolean25 = linkedList22.remove((java.lang.Object) wildcardClass24);
        int int26 = linkedList22.size();
        linkedList22.clear();
        boolean boolean28 = linkedList18.remove((java.lang.Object) linkedList22);
        linkedList22.clear();
        int int30 = linkedList22.size();
        system.testclass.LinkedList linkedList31 = new system.testclass.LinkedList();
        linkedList31.clear();
        boolean boolean34 = linkedList31.remove((java.lang.Object) (-1L));
        boolean boolean36 = linkedList31.remove((java.lang.Object) (-1L));
        int int37 = linkedList31.size();
        boolean boolean38 = linkedList22.remove((java.lang.Object) linkedList31);
        system.testclass.LinkedList linkedList39 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList40 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass41 = linkedList40.getClass();
        boolean boolean42 = linkedList39.remove((java.lang.Object) wildcardClass41);
        java.lang.Class<?> wildcardClass43 = linkedList39.getClass();
        boolean boolean44 = linkedList22.remove((java.lang.Object) linkedList39);
        linkedList22.clear();
        boolean boolean46 = linkedList13.add((java.lang.Object) linkedList22);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList13", linkedList13.repOK_1());
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        boolean boolean3 = linkedList0.remove((java.lang.Object) (-1L));
        boolean boolean5 = linkedList0.remove((java.lang.Object) (-1L));
        int int6 = linkedList0.size();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        int int8 = linkedList7.size();
        linkedList7.clear();
        int int10 = linkedList7.size();
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass13 = linkedList12.getClass();
        boolean boolean14 = linkedList11.remove((java.lang.Object) wildcardClass13);
        int int15 = linkedList11.size();
        linkedList11.clear();
        java.lang.Class<?> wildcardClass17 = linkedList11.getClass();
        boolean boolean18 = linkedList7.remove((java.lang.Object) wildcardClass17);
        boolean boolean19 = linkedList0.remove((java.lang.Object) linkedList7);
        int int20 = linkedList0.size();
        boolean boolean22 = linkedList0.remove((java.lang.Object) (short) 10);
        int int23 = linkedList0.size();
        boolean boolean25 = linkedList0.remove((java.lang.Object) 0.0d);
        int int26 = linkedList0.size();
        system.testclass.LinkedList linkedList27 = new system.testclass.LinkedList();
        boolean boolean29 = linkedList27.remove((java.lang.Object) 1.0d);
        linkedList27.clear();
        int int31 = linkedList27.size();
        system.testclass.LinkedList linkedList32 = new system.testclass.LinkedList();
        int int33 = linkedList32.size();
        linkedList32.clear();
        int int35 = linkedList32.size();
        linkedList32.clear();
        linkedList32.clear();
        int int38 = linkedList32.size();
        boolean boolean40 = linkedList32.remove((java.lang.Object) 100.0d);
        boolean boolean41 = linkedList27.remove((java.lang.Object) linkedList32);
        boolean boolean42 = linkedList0.add((java.lang.Object) linkedList32);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean2 = linkedList0.remove((java.lang.Object) 1.0d);
        boolean boolean4 = linkedList0.remove((java.lang.Object) 10);
        boolean boolean6 = linkedList0.remove((java.lang.Object) 1L);
        int int7 = linkedList0.size();
        int int8 = linkedList0.size();
        linkedList0.clear();
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        boolean boolean12 = linkedList10.remove((java.lang.Object) 1.0d);
        int int13 = linkedList10.size();
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        int int15 = linkedList14.size();
        linkedList14.clear();
        int int17 = linkedList14.size();
        linkedList14.clear();
        java.lang.Class<?> wildcardClass19 = linkedList14.getClass();
        boolean boolean20 = linkedList10.remove((java.lang.Object) linkedList14);
        linkedList10.clear();
        int int22 = linkedList10.size();
        linkedList10.clear();
        boolean boolean24 = linkedList0.remove((java.lang.Object) linkedList10);
        system.testclass.LinkedList linkedList25 = new system.testclass.LinkedList();
        int int26 = linkedList25.size();
        linkedList25.clear();
        system.testclass.LinkedList linkedList28 = new system.testclass.LinkedList();
        boolean boolean30 = linkedList28.remove((java.lang.Object) 1.0d);
        boolean boolean32 = linkedList28.remove((java.lang.Object) 10);
        boolean boolean34 = linkedList28.remove((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass35 = linkedList28.getClass();
        boolean boolean36 = linkedList25.remove((java.lang.Object) wildcardClass35);
        boolean boolean38 = linkedList25.remove((java.lang.Object) (byte) 100);
        int int39 = linkedList25.size();
        int int40 = linkedList25.size();
        boolean boolean41 = linkedList0.add((java.lang.Object) int40);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        int int2 = linkedList0.size();
        linkedList0.clear();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        int int5 = linkedList4.size();
        linkedList4.clear();
        int int7 = linkedList4.size();
        linkedList4.clear();
        boolean boolean10 = linkedList4.remove((java.lang.Object) (byte) 1);
        linkedList4.clear();
        boolean boolean12 = linkedList0.remove((java.lang.Object) linkedList4);
        system.testclass.LinkedList linkedList13 = new system.testclass.LinkedList();
        boolean boolean15 = linkedList13.remove((java.lang.Object) 1.0d);
        boolean boolean17 = linkedList13.remove((java.lang.Object) 10);
        int int18 = linkedList13.size();
        boolean boolean19 = linkedList0.add((java.lang.Object) linkedList13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass6 = linkedList5.getClass();
        boolean boolean7 = linkedList4.remove((java.lang.Object) wildcardClass6);
        int int8 = linkedList4.size();
        linkedList4.clear();
        boolean boolean10 = linkedList0.remove((java.lang.Object) linkedList4);
        linkedList4.clear();
        linkedList4.clear();
        system.testclass.LinkedList linkedList13 = new system.testclass.LinkedList();
        boolean boolean15 = linkedList13.remove((java.lang.Object) 1.0d);
        linkedList13.clear();
        boolean boolean17 = linkedList4.remove((java.lang.Object) linkedList13);
        system.testclass.LinkedList linkedList18 = new system.testclass.LinkedList();
        int int19 = linkedList18.size();
        linkedList18.clear();
        int int21 = linkedList18.size();
        int int22 = linkedList18.size();
        int int23 = linkedList18.size();
        system.testclass.LinkedList linkedList24 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList25 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass26 = linkedList25.getClass();
        boolean boolean27 = linkedList24.remove((java.lang.Object) wildcardClass26);
        system.testclass.LinkedList linkedList28 = new system.testclass.LinkedList();
        int int29 = linkedList28.size();
        linkedList28.clear();
        int int31 = linkedList28.size();
        java.lang.Class<?> wildcardClass32 = linkedList28.getClass();
        boolean boolean33 = linkedList24.remove((java.lang.Object) linkedList28);
        boolean boolean34 = linkedList18.remove((java.lang.Object) boolean33);
        linkedList18.clear();
        boolean boolean36 = linkedList13.remove((java.lang.Object) linkedList18);
        system.testclass.LinkedList linkedList37 = new system.testclass.LinkedList();
        int int38 = linkedList37.size();
        linkedList37.clear();
        int int40 = linkedList37.size();
        linkedList37.clear();
        linkedList37.clear();
        linkedList37.clear();
        boolean boolean44 = linkedList18.add((java.lang.Object) linkedList37);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList18", linkedList18.repOK_1());
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        boolean boolean3 = linkedList0.remove((java.lang.Object) (-1L));
        boolean boolean5 = linkedList0.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        int int7 = linkedList6.size();
        linkedList6.clear();
        int int9 = linkedList6.size();
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass12 = linkedList11.getClass();
        boolean boolean13 = linkedList10.remove((java.lang.Object) wildcardClass12);
        int int14 = linkedList10.size();
        linkedList10.clear();
        java.lang.Class<?> wildcardClass16 = linkedList10.getClass();
        boolean boolean17 = linkedList6.remove((java.lang.Object) wildcardClass16);
        boolean boolean18 = linkedList0.remove((java.lang.Object) boolean17);
        system.testclass.LinkedList linkedList19 = new system.testclass.LinkedList();
        int int20 = linkedList19.size();
        linkedList19.clear();
        boolean boolean23 = linkedList19.remove((java.lang.Object) "hi!");
        int int24 = linkedList19.size();
        int int25 = linkedList19.size();
        system.testclass.LinkedList linkedList26 = new system.testclass.LinkedList();
        linkedList26.clear();
        linkedList26.clear();
        system.testclass.LinkedList linkedList29 = new system.testclass.LinkedList();
        linkedList29.clear();
        int int31 = linkedList29.size();
        boolean boolean32 = linkedList26.remove((java.lang.Object) linkedList29);
        int int33 = linkedList29.size();
        java.lang.Class<?> wildcardClass34 = linkedList29.getClass();
        boolean boolean35 = linkedList19.remove((java.lang.Object) wildcardClass34);
        boolean boolean36 = linkedList0.remove((java.lang.Object) linkedList19);
        linkedList0.clear();
        linkedList0.clear();
        system.testclass.LinkedList linkedList39 = new system.testclass.LinkedList();
        int int40 = linkedList39.size();
        linkedList39.clear();
        int int42 = linkedList39.size();
        linkedList39.clear();
        linkedList39.clear();
        int int45 = linkedList39.size();
        system.testclass.LinkedList linkedList46 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList47 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass48 = linkedList47.getClass();
        boolean boolean49 = linkedList46.remove((java.lang.Object) wildcardClass48);
        int int50 = linkedList46.size();
        linkedList46.clear();
        boolean boolean52 = linkedList39.remove((java.lang.Object) linkedList46);
        int int53 = linkedList39.size();
        system.testclass.LinkedList linkedList54 = new system.testclass.LinkedList();
        boolean boolean56 = linkedList54.remove((java.lang.Object) 1.0d);
        int int57 = linkedList54.size();
        system.testclass.LinkedList linkedList58 = new system.testclass.LinkedList();
        int int59 = linkedList58.size();
        linkedList58.clear();
        int int61 = linkedList58.size();
        linkedList58.clear();
        java.lang.Class<?> wildcardClass63 = linkedList58.getClass();
        boolean boolean64 = linkedList54.remove((java.lang.Object) linkedList58);
        linkedList54.clear();
        boolean boolean66 = linkedList39.remove((java.lang.Object) linkedList54);
        boolean boolean67 = linkedList0.add((java.lang.Object) boolean66);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean2 = linkedList0.remove((java.lang.Object) 1.0d);
        boolean boolean4 = linkedList0.remove((java.lang.Object) 10);
        boolean boolean6 = linkedList0.remove((java.lang.Object) 1L);
        boolean boolean8 = linkedList0.remove((java.lang.Object) 10.0d);
        int int9 = linkedList0.size();
        int int10 = linkedList0.size();
        int int11 = linkedList0.size();
        boolean boolean13 = linkedList0.add((java.lang.Object) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        linkedList0.clear();
        linkedList0.clear();
        int int6 = linkedList0.size();
        linkedList0.clear();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        int int9 = linkedList8.size();
        linkedList8.clear();
        int int11 = linkedList8.size();
        int int12 = linkedList8.size();
        java.lang.Class<?> wildcardClass13 = linkedList8.getClass();
        boolean boolean14 = linkedList0.add((java.lang.Object) linkedList8);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        int int4 = linkedList0.size();
        int int5 = linkedList0.size();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        int int7 = linkedList6.size();
        linkedList6.clear();
        int int9 = linkedList6.size();
        int int10 = linkedList6.size();
        boolean boolean11 = linkedList0.remove((java.lang.Object) linkedList6);
        linkedList6.clear();
        int int13 = linkedList6.size();
        int int14 = linkedList6.size();
        system.testclass.LinkedList linkedList15 = new system.testclass.LinkedList();
        boolean boolean17 = linkedList15.remove((java.lang.Object) (byte) -1);
        system.testclass.LinkedList linkedList18 = new system.testclass.LinkedList();
        int int19 = linkedList18.size();
        linkedList18.clear();
        int int21 = linkedList18.size();
        system.testclass.LinkedList linkedList22 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList23 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass24 = linkedList23.getClass();
        boolean boolean25 = linkedList22.remove((java.lang.Object) wildcardClass24);
        int int26 = linkedList22.size();
        linkedList22.clear();
        boolean boolean28 = linkedList18.remove((java.lang.Object) linkedList22);
        linkedList22.clear();
        int int30 = linkedList22.size();
        system.testclass.LinkedList linkedList31 = new system.testclass.LinkedList();
        linkedList31.clear();
        boolean boolean34 = linkedList31.remove((java.lang.Object) (-1L));
        boolean boolean36 = linkedList31.remove((java.lang.Object) (-1L));
        int int37 = linkedList31.size();
        boolean boolean38 = linkedList22.remove((java.lang.Object) linkedList31);
        boolean boolean39 = linkedList15.remove((java.lang.Object) linkedList31);
        int int40 = linkedList15.size();
        linkedList15.clear();
        boolean boolean42 = linkedList6.add((java.lang.Object) linkedList15);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList6", linkedList6.repOK_1());
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        int int4 = linkedList0.size();
        int int5 = linkedList0.size();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        int int7 = linkedList6.size();
        linkedList6.clear();
        int int9 = linkedList6.size();
        int int10 = linkedList6.size();
        boolean boolean11 = linkedList0.remove((java.lang.Object) linkedList6);
        int int12 = linkedList6.size();
        linkedList6.clear();
        int int14 = linkedList6.size();
        system.testclass.LinkedList linkedList15 = new system.testclass.LinkedList();
        int int16 = linkedList15.size();
        linkedList15.clear();
        int int18 = linkedList15.size();
        linkedList15.clear();
        linkedList15.clear();
        int int21 = linkedList15.size();
        boolean boolean23 = linkedList15.remove((java.lang.Object) ' ');
        linkedList15.clear();
        int int25 = linkedList15.size();
        boolean boolean26 = linkedList6.remove((java.lang.Object) linkedList15);
        int int27 = linkedList6.size();
        system.testclass.LinkedList linkedList28 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList29 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass30 = linkedList29.getClass();
        boolean boolean31 = linkedList28.remove((java.lang.Object) wildcardClass30);
        int int32 = linkedList28.size();
        linkedList28.clear();
        int int34 = linkedList28.size();
        system.testclass.LinkedList linkedList35 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList36 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass37 = linkedList36.getClass();
        boolean boolean38 = linkedList35.remove((java.lang.Object) wildcardClass37);
        system.testclass.LinkedList linkedList39 = new system.testclass.LinkedList();
        int int40 = linkedList39.size();
        linkedList39.clear();
        int int42 = linkedList39.size();
        java.lang.Class<?> wildcardClass43 = linkedList39.getClass();
        boolean boolean44 = linkedList35.remove((java.lang.Object) linkedList39);
        linkedList35.clear();
        boolean boolean46 = linkedList28.remove((java.lang.Object) linkedList35);
        int int47 = linkedList28.size();
        linkedList28.clear();
        boolean boolean49 = linkedList6.add((java.lang.Object) linkedList28);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList6", linkedList6.repOK_1());
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        boolean boolean3 = linkedList0.remove((java.lang.Object) (-1L));
        boolean boolean5 = linkedList0.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        int int7 = linkedList6.size();
        linkedList6.clear();
        int int9 = linkedList6.size();
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass12 = linkedList11.getClass();
        boolean boolean13 = linkedList10.remove((java.lang.Object) wildcardClass12);
        int int14 = linkedList10.size();
        linkedList10.clear();
        java.lang.Class<?> wildcardClass16 = linkedList10.getClass();
        boolean boolean17 = linkedList6.remove((java.lang.Object) wildcardClass16);
        boolean boolean18 = linkedList0.remove((java.lang.Object) boolean17);
        system.testclass.LinkedList linkedList19 = new system.testclass.LinkedList();
        int int20 = linkedList19.size();
        linkedList19.clear();
        boolean boolean23 = linkedList19.remove((java.lang.Object) "hi!");
        int int24 = linkedList19.size();
        int int25 = linkedList19.size();
        system.testclass.LinkedList linkedList26 = new system.testclass.LinkedList();
        linkedList26.clear();
        linkedList26.clear();
        system.testclass.LinkedList linkedList29 = new system.testclass.LinkedList();
        linkedList29.clear();
        int int31 = linkedList29.size();
        boolean boolean32 = linkedList26.remove((java.lang.Object) linkedList29);
        int int33 = linkedList29.size();
        java.lang.Class<?> wildcardClass34 = linkedList29.getClass();
        boolean boolean35 = linkedList19.remove((java.lang.Object) wildcardClass34);
        boolean boolean36 = linkedList0.remove((java.lang.Object) linkedList19);
        system.testclass.LinkedList linkedList37 = new system.testclass.LinkedList();
        int int38 = linkedList37.size();
        linkedList37.clear();
        int int40 = linkedList37.size();
        int int41 = linkedList37.size();
        int int42 = linkedList37.size();
        system.testclass.LinkedList linkedList43 = new system.testclass.LinkedList();
        int int44 = linkedList43.size();
        linkedList43.clear();
        int int46 = linkedList43.size();
        int int47 = linkedList43.size();
        boolean boolean48 = linkedList37.remove((java.lang.Object) linkedList43);
        linkedList43.clear();
        int int50 = linkedList43.size();
        system.testclass.LinkedList linkedList51 = new system.testclass.LinkedList();
        boolean boolean53 = linkedList51.remove((java.lang.Object) (byte) -1);
        boolean boolean55 = linkedList51.remove((java.lang.Object) '#');
        linkedList51.clear();
        boolean boolean57 = linkedList43.remove((java.lang.Object) linkedList51);
        linkedList43.clear();
        java.lang.Class<?> wildcardClass59 = linkedList43.getClass();
        boolean boolean60 = linkedList0.add((java.lang.Object) linkedList43);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        linkedList0.clear();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        int int6 = linkedList5.size();
        linkedList5.clear();
        int int8 = linkedList5.size();
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass11 = linkedList10.getClass();
        boolean boolean12 = linkedList9.remove((java.lang.Object) wildcardClass11);
        int int13 = linkedList9.size();
        linkedList9.clear();
        boolean boolean15 = linkedList5.remove((java.lang.Object) linkedList9);
        linkedList9.clear();
        int int17 = linkedList9.size();
        system.testclass.LinkedList linkedList18 = new system.testclass.LinkedList();
        linkedList18.clear();
        boolean boolean21 = linkedList18.remove((java.lang.Object) (-1L));
        boolean boolean23 = linkedList18.remove((java.lang.Object) (-1L));
        int int24 = linkedList18.size();
        boolean boolean25 = linkedList9.remove((java.lang.Object) linkedList18);
        system.testclass.LinkedList linkedList26 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList27 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass28 = linkedList27.getClass();
        boolean boolean29 = linkedList26.remove((java.lang.Object) wildcardClass28);
        java.lang.Class<?> wildcardClass30 = linkedList26.getClass();
        boolean boolean31 = linkedList9.remove((java.lang.Object) linkedList26);
        boolean boolean32 = linkedList0.remove((java.lang.Object) boolean31);
        system.testclass.LinkedList linkedList33 = new system.testclass.LinkedList();
        linkedList33.clear();
        linkedList33.clear();
        system.testclass.LinkedList linkedList36 = new system.testclass.LinkedList();
        linkedList36.clear();
        int int38 = linkedList36.size();
        boolean boolean39 = linkedList33.remove((java.lang.Object) linkedList36);
        linkedList36.clear();
        system.testclass.LinkedList linkedList41 = new system.testclass.LinkedList();
        linkedList41.clear();
        boolean boolean44 = linkedList41.remove((java.lang.Object) (-1L));
        boolean boolean45 = linkedList36.remove((java.lang.Object) linkedList41);
        system.testclass.LinkedList linkedList46 = new system.testclass.LinkedList();
        boolean boolean48 = linkedList46.remove((java.lang.Object) 1.0d);
        boolean boolean50 = linkedList46.remove((java.lang.Object) 10);
        boolean boolean52 = linkedList46.remove((java.lang.Object) 1L);
        boolean boolean53 = linkedList41.remove((java.lang.Object) linkedList46);
        java.lang.Class<?> wildcardClass54 = linkedList46.getClass();
        boolean boolean55 = linkedList0.remove((java.lang.Object) linkedList46);
        linkedList0.clear();
        system.testclass.LinkedList linkedList57 = new system.testclass.LinkedList();
        boolean boolean59 = linkedList57.remove((java.lang.Object) 1.0d);
        linkedList57.clear();
        linkedList57.clear();
        boolean boolean63 = linkedList57.remove((java.lang.Object) (short) 10);
        system.testclass.LinkedList linkedList64 = new system.testclass.LinkedList();
        boolean boolean66 = linkedList64.remove((java.lang.Object) 1.0d);
        int int67 = linkedList64.size();
        java.lang.Object obj68 = null;
        boolean boolean69 = linkedList64.remove(obj68);
        boolean boolean70 = linkedList57.remove(obj68);
        boolean boolean71 = linkedList0.add((java.lang.Object) linkedList57);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean2 = linkedList0.remove((java.lang.Object) (byte) -1);
        boolean boolean4 = linkedList0.remove((java.lang.Object) 0L);
        boolean boolean6 = linkedList0.remove((java.lang.Object) (short) 100);
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        boolean boolean9 = linkedList7.remove((java.lang.Object) 1.0d);
        int int10 = linkedList7.size();
        java.lang.Object obj11 = null;
        boolean boolean12 = linkedList7.remove(obj11);
        boolean boolean13 = linkedList0.add((java.lang.Object) linkedList7);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        int int4 = linkedList0.size();
        system.testclass.LinkedList linkedList5 = new system.testclass.LinkedList();
        int int6 = linkedList5.size();
        linkedList5.clear();
        int int8 = linkedList5.size();
        linkedList5.clear();
        linkedList5.clear();
        int int11 = linkedList5.size();
        linkedList5.clear();
        boolean boolean13 = linkedList0.add((java.lang.Object) linkedList5);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList1 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass2 = linkedList1.getClass();
        boolean boolean3 = linkedList0.remove((java.lang.Object) wildcardClass2);
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        int int5 = linkedList4.size();
        linkedList4.clear();
        int int7 = linkedList4.size();
        java.lang.Class<?> wildcardClass8 = linkedList4.getClass();
        boolean boolean9 = linkedList0.remove((java.lang.Object) linkedList4);
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        linkedList10.clear();
        boolean boolean13 = linkedList10.remove((java.lang.Object) (-1L));
        boolean boolean14 = linkedList0.remove((java.lang.Object) boolean13);
        int int15 = linkedList0.size();
        linkedList0.clear();
        linkedList0.clear();
        system.testclass.LinkedList linkedList18 = new system.testclass.LinkedList();
        linkedList18.clear();
        int int20 = linkedList18.size();
        linkedList18.clear();
        boolean boolean23 = linkedList18.remove((java.lang.Object) (short) 0);
        boolean boolean24 = linkedList0.add((java.lang.Object) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList1 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass2 = linkedList1.getClass();
        boolean boolean3 = linkedList0.remove((java.lang.Object) wildcardClass2);
        int int4 = linkedList0.size();
        linkedList0.clear();
        int int6 = linkedList0.size();
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass9 = linkedList8.getClass();
        boolean boolean10 = linkedList7.remove((java.lang.Object) wildcardClass9);
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        int int12 = linkedList11.size();
        linkedList11.clear();
        int int14 = linkedList11.size();
        java.lang.Class<?> wildcardClass15 = linkedList11.getClass();
        boolean boolean16 = linkedList7.remove((java.lang.Object) linkedList11);
        linkedList7.clear();
        boolean boolean18 = linkedList0.remove((java.lang.Object) linkedList7);
        int int19 = linkedList0.size();
        system.testclass.LinkedList linkedList20 = new system.testclass.LinkedList();
        boolean boolean22 = linkedList20.remove((java.lang.Object) 1.0d);
        int int23 = linkedList20.size();
        int int24 = linkedList20.size();
        system.testclass.LinkedList linkedList25 = new system.testclass.LinkedList();
        boolean boolean27 = linkedList25.remove((java.lang.Object) (byte) -1);
        boolean boolean29 = linkedList25.remove((java.lang.Object) 0L);
        int int30 = linkedList25.size();
        boolean boolean31 = linkedList20.remove((java.lang.Object) linkedList25);
        java.lang.Class<?> wildcardClass32 = linkedList20.getClass();
        boolean boolean33 = linkedList0.add((java.lang.Object) linkedList20);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        boolean boolean3 = linkedList0.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        boolean boolean6 = linkedList4.remove((java.lang.Object) (byte) -1);
        boolean boolean7 = linkedList0.remove((java.lang.Object) linkedList4);
        boolean boolean9 = linkedList0.remove((java.lang.Object) (byte) -1);
        linkedList0.clear();
        linkedList0.clear();
        system.testclass.LinkedList linkedList12 = new system.testclass.LinkedList();
        linkedList12.clear();
        linkedList12.clear();
        system.testclass.LinkedList linkedList15 = new system.testclass.LinkedList();
        linkedList15.clear();
        boolean boolean18 = linkedList15.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList19 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList20 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass21 = linkedList20.getClass();
        boolean boolean22 = linkedList19.remove((java.lang.Object) wildcardClass21);
        java.lang.Class<?> wildcardClass23 = linkedList19.getClass();
        boolean boolean24 = linkedList15.remove((java.lang.Object) wildcardClass23);
        boolean boolean25 = linkedList12.remove((java.lang.Object) boolean24);
        system.testclass.LinkedList linkedList26 = new system.testclass.LinkedList();
        linkedList26.clear();
        linkedList26.clear();
        system.testclass.LinkedList linkedList29 = new system.testclass.LinkedList();
        linkedList29.clear();
        boolean boolean32 = linkedList29.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList33 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList34 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass35 = linkedList34.getClass();
        boolean boolean36 = linkedList33.remove((java.lang.Object) wildcardClass35);
        java.lang.Class<?> wildcardClass37 = linkedList33.getClass();
        boolean boolean38 = linkedList29.remove((java.lang.Object) wildcardClass37);
        boolean boolean39 = linkedList26.remove((java.lang.Object) boolean38);
        boolean boolean41 = linkedList26.remove((java.lang.Object) ' ');
        boolean boolean42 = linkedList12.remove((java.lang.Object) linkedList26);
        system.testclass.LinkedList linkedList43 = new system.testclass.LinkedList();
        linkedList43.clear();
        boolean boolean46 = linkedList43.remove((java.lang.Object) (-1));
        boolean boolean47 = linkedList26.remove((java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass48 = linkedList26.getClass();
        boolean boolean49 = linkedList0.add((java.lang.Object) wildcardClass48);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        linkedList0.clear();
        linkedList0.clear();
        int int6 = linkedList0.size();
        boolean boolean8 = linkedList0.remove((java.lang.Object) ' ');
        linkedList0.clear();
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        linkedList10.clear();
        boolean boolean13 = linkedList10.remove((java.lang.Object) (-1L));
        boolean boolean15 = linkedList10.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList16 = new system.testclass.LinkedList();
        int int17 = linkedList16.size();
        linkedList16.clear();
        int int19 = linkedList16.size();
        system.testclass.LinkedList linkedList20 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList21 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass22 = linkedList21.getClass();
        boolean boolean23 = linkedList20.remove((java.lang.Object) wildcardClass22);
        int int24 = linkedList20.size();
        linkedList20.clear();
        java.lang.Class<?> wildcardClass26 = linkedList20.getClass();
        boolean boolean27 = linkedList16.remove((java.lang.Object) wildcardClass26);
        boolean boolean28 = linkedList10.remove((java.lang.Object) boolean27);
        boolean boolean29 = linkedList0.remove((java.lang.Object) boolean28);
        system.testclass.LinkedList linkedList30 = new system.testclass.LinkedList();
        int int31 = linkedList30.size();
        linkedList30.clear();
        int int33 = linkedList30.size();
        int int34 = linkedList30.size();
        int int35 = linkedList30.size();
        system.testclass.LinkedList linkedList36 = new system.testclass.LinkedList();
        int int37 = linkedList36.size();
        linkedList36.clear();
        int int39 = linkedList36.size();
        int int40 = linkedList36.size();
        boolean boolean41 = linkedList30.remove((java.lang.Object) linkedList36);
        linkedList30.clear();
        int int43 = linkedList30.size();
        boolean boolean44 = linkedList0.remove((java.lang.Object) linkedList30);
        boolean boolean46 = linkedList0.add((java.lang.Object) 1.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        int int4 = linkedList0.size();
        int int5 = linkedList0.size();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        int int7 = linkedList6.size();
        linkedList6.clear();
        int int9 = linkedList6.size();
        int int10 = linkedList6.size();
        boolean boolean11 = linkedList0.remove((java.lang.Object) linkedList6);
        linkedList6.clear();
        int int13 = linkedList6.size();
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        boolean boolean16 = linkedList14.remove((java.lang.Object) 1.0d);
        boolean boolean18 = linkedList14.remove((java.lang.Object) 10);
        boolean boolean20 = linkedList14.remove((java.lang.Object) true);
        linkedList14.clear();
        linkedList14.clear();
        linkedList14.clear();
        boolean boolean24 = linkedList6.add((java.lang.Object) linkedList14);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList6", linkedList6.repOK_1());
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        system.testclass.LinkedList linkedList3 = new system.testclass.LinkedList();
        boolean boolean5 = linkedList3.remove((java.lang.Object) 1.0d);
        linkedList3.clear();
        java.lang.Class<?> wildcardClass7 = linkedList3.getClass();
        boolean boolean8 = linkedList0.remove((java.lang.Object) wildcardClass7);
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList10 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass11 = linkedList10.getClass();
        boolean boolean12 = linkedList9.remove((java.lang.Object) wildcardClass11);
        system.testclass.LinkedList linkedList13 = new system.testclass.LinkedList();
        int int14 = linkedList13.size();
        linkedList13.clear();
        int int16 = linkedList13.size();
        java.lang.Class<?> wildcardClass17 = linkedList13.getClass();
        boolean boolean18 = linkedList9.remove((java.lang.Object) linkedList13);
        linkedList9.clear();
        int int20 = linkedList9.size();
        boolean boolean21 = linkedList0.remove((java.lang.Object) int20);
        system.testclass.LinkedList linkedList22 = new system.testclass.LinkedList();
        int int23 = linkedList22.size();
        linkedList22.clear();
        int int25 = linkedList22.size();
        int int26 = linkedList22.size();
        int int27 = linkedList22.size();
        system.testclass.LinkedList linkedList28 = new system.testclass.LinkedList();
        int int29 = linkedList28.size();
        linkedList28.clear();
        int int31 = linkedList28.size();
        int int32 = linkedList28.size();
        boolean boolean33 = linkedList22.remove((java.lang.Object) linkedList28);
        linkedList28.clear();
        int int35 = linkedList28.size();
        system.testclass.LinkedList linkedList36 = new system.testclass.LinkedList();
        boolean boolean38 = linkedList36.remove((java.lang.Object) (byte) -1);
        boolean boolean40 = linkedList36.remove((java.lang.Object) '#');
        linkedList36.clear();
        boolean boolean42 = linkedList28.remove((java.lang.Object) linkedList36);
        system.testclass.LinkedList linkedList43 = new system.testclass.LinkedList();
        int int44 = linkedList43.size();
        linkedList43.clear();
        int int46 = linkedList43.size();
        system.testclass.LinkedList linkedList47 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList48 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass49 = linkedList48.getClass();
        boolean boolean50 = linkedList47.remove((java.lang.Object) wildcardClass49);
        int int51 = linkedList47.size();
        linkedList47.clear();
        java.lang.Class<?> wildcardClass53 = linkedList47.getClass();
        boolean boolean54 = linkedList43.remove((java.lang.Object) wildcardClass53);
        boolean boolean55 = linkedList36.remove((java.lang.Object) linkedList43);
        system.testclass.LinkedList linkedList56 = new system.testclass.LinkedList();
        int int57 = linkedList56.size();
        linkedList56.clear();
        int int59 = linkedList56.size();
        linkedList56.clear();
        linkedList56.clear();
        int int62 = linkedList56.size();
        boolean boolean64 = linkedList56.remove((java.lang.Object) ' ');
        linkedList56.clear();
        int int66 = linkedList56.size();
        linkedList56.clear();
        boolean boolean68 = linkedList43.remove((java.lang.Object) linkedList56);
        system.testclass.LinkedList linkedList69 = new system.testclass.LinkedList();
        boolean boolean71 = linkedList69.remove((java.lang.Object) (byte) -1);
        system.testclass.LinkedList linkedList72 = new system.testclass.LinkedList();
        int int73 = linkedList72.size();
        linkedList72.clear();
        int int75 = linkedList72.size();
        system.testclass.LinkedList linkedList76 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList77 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass78 = linkedList77.getClass();
        boolean boolean79 = linkedList76.remove((java.lang.Object) wildcardClass78);
        int int80 = linkedList76.size();
        linkedList76.clear();
        boolean boolean82 = linkedList72.remove((java.lang.Object) linkedList76);
        linkedList76.clear();
        int int84 = linkedList76.size();
        system.testclass.LinkedList linkedList85 = new system.testclass.LinkedList();
        linkedList85.clear();
        boolean boolean88 = linkedList85.remove((java.lang.Object) (-1L));
        boolean boolean90 = linkedList85.remove((java.lang.Object) (-1L));
        int int91 = linkedList85.size();
        boolean boolean92 = linkedList76.remove((java.lang.Object) linkedList85);
        boolean boolean93 = linkedList69.remove((java.lang.Object) linkedList85);
        int int94 = linkedList69.size();
        boolean boolean95 = linkedList56.remove((java.lang.Object) linkedList69);
        boolean boolean96 = linkedList0.add((java.lang.Object) linkedList69);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        linkedList0.clear();
        system.testclass.LinkedList linkedList3 = new system.testclass.LinkedList();
        linkedList3.clear();
        boolean boolean6 = linkedList3.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass9 = linkedList8.getClass();
        boolean boolean10 = linkedList7.remove((java.lang.Object) wildcardClass9);
        java.lang.Class<?> wildcardClass11 = linkedList7.getClass();
        boolean boolean12 = linkedList3.remove((java.lang.Object) wildcardClass11);
        boolean boolean13 = linkedList0.remove((java.lang.Object) boolean12);
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        linkedList14.clear();
        linkedList14.clear();
        system.testclass.LinkedList linkedList17 = new system.testclass.LinkedList();
        linkedList17.clear();
        boolean boolean20 = linkedList17.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList21 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList22 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass23 = linkedList22.getClass();
        boolean boolean24 = linkedList21.remove((java.lang.Object) wildcardClass23);
        java.lang.Class<?> wildcardClass25 = linkedList21.getClass();
        boolean boolean26 = linkedList17.remove((java.lang.Object) wildcardClass25);
        boolean boolean27 = linkedList14.remove((java.lang.Object) boolean26);
        boolean boolean29 = linkedList14.remove((java.lang.Object) ' ');
        boolean boolean30 = linkedList0.remove((java.lang.Object) linkedList14);
        int int31 = linkedList0.size();
        system.testclass.LinkedList linkedList32 = new system.testclass.LinkedList();
        int int33 = linkedList32.size();
        linkedList32.clear();
        int int35 = linkedList32.size();
        system.testclass.LinkedList linkedList36 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList37 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass38 = linkedList37.getClass();
        boolean boolean39 = linkedList36.remove((java.lang.Object) wildcardClass38);
        int int40 = linkedList36.size();
        linkedList36.clear();
        boolean boolean42 = linkedList32.remove((java.lang.Object) linkedList36);
        linkedList36.clear();
        linkedList36.clear();
        system.testclass.LinkedList linkedList45 = new system.testclass.LinkedList();
        boolean boolean47 = linkedList45.remove((java.lang.Object) 1.0d);
        linkedList45.clear();
        boolean boolean49 = linkedList36.remove((java.lang.Object) linkedList45);
        system.testclass.LinkedList linkedList50 = new system.testclass.LinkedList();
        boolean boolean52 = linkedList50.remove((java.lang.Object) 1.0d);
        int int53 = linkedList50.size();
        java.lang.Object obj54 = null;
        boolean boolean55 = linkedList50.remove(obj54);
        system.testclass.LinkedList linkedList56 = new system.testclass.LinkedList();
        int int57 = linkedList56.size();
        linkedList56.clear();
        int int59 = linkedList56.size();
        system.testclass.LinkedList linkedList60 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList61 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass62 = linkedList61.getClass();
        boolean boolean63 = linkedList60.remove((java.lang.Object) wildcardClass62);
        int int64 = linkedList60.size();
        linkedList60.clear();
        boolean boolean66 = linkedList56.remove((java.lang.Object) linkedList60);
        linkedList60.clear();
        int int68 = linkedList60.size();
        system.testclass.LinkedList linkedList69 = new system.testclass.LinkedList();
        linkedList69.clear();
        boolean boolean72 = linkedList69.remove((java.lang.Object) (-1L));
        boolean boolean74 = linkedList69.remove((java.lang.Object) (-1L));
        int int75 = linkedList69.size();
        boolean boolean76 = linkedList60.remove((java.lang.Object) linkedList69);
        boolean boolean77 = linkedList50.remove((java.lang.Object) linkedList60);
        int int78 = linkedList60.size();
        boolean boolean79 = linkedList36.remove((java.lang.Object) int78);
        boolean boolean80 = linkedList0.add((java.lang.Object) int78);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean2 = linkedList0.remove((java.lang.Object) 1.0d);
        linkedList0.clear();
        linkedList0.clear();
        boolean boolean6 = linkedList0.remove((java.lang.Object) (short) 10);
        system.testclass.LinkedList linkedList7 = new system.testclass.LinkedList();
        boolean boolean9 = linkedList7.remove((java.lang.Object) 1.0d);
        int int10 = linkedList7.size();
        java.lang.Object obj11 = null;
        boolean boolean12 = linkedList7.remove(obj11);
        boolean boolean13 = linkedList0.remove(obj11);
        system.testclass.LinkedList linkedList14 = new system.testclass.LinkedList();
        boolean boolean16 = linkedList14.remove((java.lang.Object) 1.0d);
        int int17 = linkedList14.size();
        java.lang.Object obj18 = null;
        boolean boolean19 = linkedList14.remove(obj18);
        system.testclass.LinkedList linkedList20 = new system.testclass.LinkedList();
        int int21 = linkedList20.size();
        linkedList20.clear();
        int int23 = linkedList20.size();
        system.testclass.LinkedList linkedList24 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList25 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass26 = linkedList25.getClass();
        boolean boolean27 = linkedList24.remove((java.lang.Object) wildcardClass26);
        int int28 = linkedList24.size();
        linkedList24.clear();
        boolean boolean30 = linkedList20.remove((java.lang.Object) linkedList24);
        linkedList24.clear();
        int int32 = linkedList24.size();
        system.testclass.LinkedList linkedList33 = new system.testclass.LinkedList();
        linkedList33.clear();
        boolean boolean36 = linkedList33.remove((java.lang.Object) (-1L));
        boolean boolean38 = linkedList33.remove((java.lang.Object) (-1L));
        int int39 = linkedList33.size();
        boolean boolean40 = linkedList24.remove((java.lang.Object) linkedList33);
        boolean boolean41 = linkedList14.remove((java.lang.Object) linkedList24);
        int int42 = linkedList24.size();
        boolean boolean43 = linkedList0.remove((java.lang.Object) int42);
        int int44 = linkedList0.size();
        system.testclass.LinkedList linkedList45 = new system.testclass.LinkedList();
        int int46 = linkedList45.size();
        linkedList45.clear();
        int int48 = linkedList45.size();
        int int49 = linkedList45.size();
        int int50 = linkedList45.size();
        system.testclass.LinkedList linkedList51 = new system.testclass.LinkedList();
        int int52 = linkedList51.size();
        linkedList51.clear();
        int int54 = linkedList51.size();
        int int55 = linkedList51.size();
        boolean boolean56 = linkedList45.remove((java.lang.Object) linkedList51);
        linkedList51.clear();
        int int58 = linkedList51.size();
        system.testclass.LinkedList linkedList59 = new system.testclass.LinkedList();
        boolean boolean61 = linkedList59.remove((java.lang.Object) (byte) -1);
        boolean boolean63 = linkedList59.remove((java.lang.Object) '#');
        linkedList59.clear();
        boolean boolean65 = linkedList51.remove((java.lang.Object) linkedList59);
        int int66 = linkedList51.size();
        linkedList51.clear();
        boolean boolean68 = linkedList0.add((java.lang.Object) linkedList51);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean2 = linkedList0.remove((java.lang.Object) (byte) -1);
        system.testclass.LinkedList linkedList3 = new system.testclass.LinkedList();
        boolean boolean5 = linkedList3.remove((java.lang.Object) 1.0d);
        boolean boolean7 = linkedList3.remove((java.lang.Object) 10);
        boolean boolean9 = linkedList3.remove((java.lang.Object) 1L);
        boolean boolean11 = linkedList3.remove((java.lang.Object) 10.0d);
        int int12 = linkedList3.size();
        int int13 = linkedList3.size();
        int int14 = linkedList3.size();
        boolean boolean15 = linkedList0.add((java.lang.Object) int14);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        boolean boolean2 = linkedList0.remove((java.lang.Object) 1.0d);
        boolean boolean4 = linkedList0.remove((java.lang.Object) 10);
        boolean boolean6 = linkedList0.remove((java.lang.Object) true);
        linkedList0.clear();
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        boolean boolean10 = linkedList8.remove((java.lang.Object) (byte) -1);
        system.testclass.LinkedList linkedList11 = new system.testclass.LinkedList();
        int int12 = linkedList11.size();
        linkedList11.clear();
        int int14 = linkedList11.size();
        system.testclass.LinkedList linkedList15 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList16 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass17 = linkedList16.getClass();
        boolean boolean18 = linkedList15.remove((java.lang.Object) wildcardClass17);
        int int19 = linkedList15.size();
        linkedList15.clear();
        boolean boolean21 = linkedList11.remove((java.lang.Object) linkedList15);
        linkedList15.clear();
        int int23 = linkedList15.size();
        system.testclass.LinkedList linkedList24 = new system.testclass.LinkedList();
        linkedList24.clear();
        boolean boolean27 = linkedList24.remove((java.lang.Object) (-1L));
        boolean boolean29 = linkedList24.remove((java.lang.Object) (-1L));
        int int30 = linkedList24.size();
        boolean boolean31 = linkedList15.remove((java.lang.Object) linkedList24);
        boolean boolean32 = linkedList8.remove((java.lang.Object) linkedList24);
        boolean boolean33 = linkedList0.add((java.lang.Object) boolean32);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList0", linkedList0.repOK_1());
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        int int1 = linkedList0.size();
        linkedList0.clear();
        int int3 = linkedList0.size();
        int int4 = linkedList0.size();
        int int5 = linkedList0.size();
        system.testclass.LinkedList linkedList6 = new system.testclass.LinkedList();
        int int7 = linkedList6.size();
        linkedList6.clear();
        int int9 = linkedList6.size();
        int int10 = linkedList6.size();
        boolean boolean11 = linkedList0.remove((java.lang.Object) linkedList6);
        int int12 = linkedList6.size();
        linkedList6.clear();
        linkedList6.clear();
        system.testclass.LinkedList linkedList15 = new system.testclass.LinkedList();
        boolean boolean17 = linkedList15.remove((java.lang.Object) 1.0d);
        linkedList15.clear();
        linkedList15.clear();
        boolean boolean21 = linkedList15.remove((java.lang.Object) (short) 10);
        system.testclass.LinkedList linkedList22 = new system.testclass.LinkedList();
        boolean boolean24 = linkedList22.remove((java.lang.Object) 1.0d);
        int int25 = linkedList22.size();
        java.lang.Object obj26 = null;
        boolean boolean27 = linkedList22.remove(obj26);
        boolean boolean28 = linkedList15.remove(obj26);
        boolean boolean29 = linkedList6.remove((java.lang.Object) boolean28);
        linkedList6.clear();
        system.testclass.LinkedList linkedList31 = new system.testclass.LinkedList();
        linkedList31.clear();
        int int33 = linkedList31.size();
        linkedList31.clear();
        java.lang.Object obj35 = null;
        boolean boolean36 = linkedList31.remove(obj35);
        boolean boolean37 = linkedList6.add((java.lang.Object) boolean36);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList6", linkedList6.repOK_1());
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        system.testclass.LinkedList linkedList0 = new system.testclass.LinkedList();
        linkedList0.clear();
        boolean boolean3 = linkedList0.remove((java.lang.Object) (-1L));
        system.testclass.LinkedList linkedList4 = new system.testclass.LinkedList();
        boolean boolean6 = linkedList4.remove((java.lang.Object) (byte) -1);
        boolean boolean7 = linkedList0.remove((java.lang.Object) linkedList4);
        system.testclass.LinkedList linkedList8 = new system.testclass.LinkedList();
        system.testclass.LinkedList linkedList9 = new system.testclass.LinkedList();
        java.lang.Class<?> wildcardClass10 = linkedList9.getClass();
        boolean boolean11 = linkedList8.remove((java.lang.Object) wildcardClass10);
        int int12 = linkedList8.size();
        linkedList8.clear();
        int int14 = linkedList8.size();
        system.testclass.LinkedList linkedList15 = new system.testclass.LinkedList();
        linkedList15.clear();
        boolean boolean18 = linkedList15.remove((java.lang.Object) (-1));
        boolean boolean19 = linkedList8.remove((java.lang.Object) linkedList15);
        system.testclass.LinkedList linkedList20 = new system.testclass.LinkedList();
        boolean boolean22 = linkedList20.remove((java.lang.Object) 1.0d);
        boolean boolean24 = linkedList20.remove((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass25 = linkedList20.getClass();
        boolean boolean26 = linkedList8.remove((java.lang.Object) wildcardClass25);
        int int27 = linkedList8.size();
        boolean boolean28 = linkedList4.add((java.lang.Object) linkedList8);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for linkedList4", linkedList4.repOK_1());
    }
}

