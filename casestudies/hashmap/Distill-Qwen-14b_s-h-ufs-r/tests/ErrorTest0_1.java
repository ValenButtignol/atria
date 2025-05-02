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
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.clear();
        java.lang.Object obj4 = hashMap0.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        int int3 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray4 = new system.testclass.HashMap.Entry[] {};
        hashMap0.table = entryArray4;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) ' ', (float) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 10);
        hashMap1.clear();
        system.testclass.HashMap.Entry[] entryArray3 = new system.testclass.HashMap.Entry[] {};
        hashMap1.table = entryArray3;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap((int) (byte) 0);
        hashMap3.clear();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap3.table;
        hashMap1.table = entryArray5;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        boolean boolean4 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        hashMap5.clear();
        system.testclass.HashMap.Entry[] entryArray7 = hashMap5.table;
        hashMap0.table = entryArray7;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) (byte) 0);
        hashMap10.clear();
        system.testclass.HashMap.Entry[] entryArray12 = hashMap10.table;
        hashMap0.table = entryArray12;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        hashMap1.clear();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap1.table;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        int int6 = hashMap4.size();
        java.lang.Object obj8 = hashMap4.get((java.lang.Object) 10);
        java.lang.Object obj9 = hashMap1.remove((java.lang.Object) hashMap4);
        java.lang.Object obj11 = hashMap1.remove((java.lang.Object) 0.0d);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        hashMap12.modCount = 0;
        java.lang.Object obj15 = hashMap1.get((java.lang.Object) hashMap12);
        java.lang.Object obj17 = hashMap12.get((java.lang.Object) (-1.0d));
        int int18 = hashMap12.modCount;
        system.testclass.HashMap.Entry[] entryArray19 = new system.testclass.HashMap.Entry[] {};
        hashMap12.table = entryArray19;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap12", hashMap12.repOK_1());
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        hashMap1.clear();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap1.table;
        boolean boolean4 = hashMap1.isEmpty();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        boolean boolean6 = hashMap5.isEmpty();
        boolean boolean7 = hashMap5.isEmpty();
        int int8 = hashMap5.modCount;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        hashMap9.clear();
        java.lang.Object obj11 = hashMap5.get((java.lang.Object) hashMap9);
        hashMap9.clear();
        int int13 = hashMap9.size();
        java.lang.Object obj15 = hashMap1.put((java.lang.Object) int13, (java.lang.Object) 97);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap(0);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object obj5 = hashMap3.remove(obj4);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        hashMap6.clear();
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = hashMap6.remove(obj8);
        java.lang.Object obj10 = hashMap0.put(obj5, (java.lang.Object) hashMap6);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 1);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        int int3 = hashMap2.modCount;
        system.testclass.HashMap.Entry[] entryArray4 = hashMap2.table;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        boolean boolean6 = hashMap5.isEmpty();
        boolean boolean7 = hashMap5.isEmpty();
        java.lang.Object obj8 = hashMap1.put((java.lang.Object) hashMap2, (java.lang.Object) hashMap5);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 0, (float) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.clear();
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        int int3 = hashMap2.modCount;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        int int6 = hashMap4.size();
        hashMap4.clear();
        boolean boolean8 = hashMap4.isEmpty();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        hashMap9.clear();
        system.testclass.HashMap.Entry[] entryArray11 = hashMap9.table;
        hashMap4.table = entryArray11;
        java.lang.Object obj13 = hashMap0.put((java.lang.Object) int3, (java.lang.Object) entryArray11);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(97, 10.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        system.testclass.HashMap.Entry[] entryArray7 = hashMap5.table;
        system.testclass.HashMap.Entry[] entryArray8 = hashMap5.table;
        hashMap4.table = entryArray8;
        java.lang.Object obj11 = hashMap0.put((java.lang.Object) entryArray8, (java.lang.Object) 0.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        hashMap1.clear();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap1.table;
        system.testclass.HashMap.Entry[] entryArray4 = null;
        hashMap1.table = entryArray4;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '#', (float) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = hashMap1.remove(obj2);
        java.lang.Object obj5 = hashMap1.get((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap(0);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object obj10 = hashMap8.remove(obj9);
        java.lang.Object obj12 = hashMap8.get((java.lang.Object) (short) 1);
        java.lang.Object obj13 = hashMap1.put((java.lang.Object) ' ', obj12);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        hashMap1.clear();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap1.table;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        boolean boolean6 = hashMap5.isEmpty();
        int int7 = hashMap5.size();
        hashMap5.clear();
        boolean boolean9 = hashMap5.isEmpty();
        hashMap5.clear();
        hashMap5.modCount = (byte) 10;
        system.testclass.HashMap.Entry[] entryArray13 = hashMap5.table;
        java.lang.Object obj14 = hashMap1.put((java.lang.Object) 100, (java.lang.Object) hashMap5);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 10, (float) 100L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        boolean boolean3 = hashMap2.isEmpty();
        java.lang.Object obj4 = hashMap1.remove((java.lang.Object) hashMap2);
        int int5 = hashMap1.modCount;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.modCount;
        system.testclass.HashMap.Entry[] entryArray8 = hashMap6.table;
        system.testclass.HashMap.Entry[] entryArray9 = hashMap6.table;
        int int10 = hashMap6.modCount;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap((int) (short) 10);
        java.lang.Object obj14 = hashMap12.remove((java.lang.Object) (short) -1);
        java.lang.Object obj15 = hashMap1.put((java.lang.Object) hashMap6, (java.lang.Object) hashMap12);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, 100.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        java.lang.Object obj5 = hashMap2.remove((java.lang.Object) hashMap3);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        int int8 = hashMap6.size();
        hashMap6.clear();
        boolean boolean10 = hashMap6.isEmpty();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        hashMap11.clear();
        system.testclass.HashMap.Entry[] entryArray13 = hashMap11.table;
        hashMap6.table = entryArray13;
        system.testclass.HashMap.Entry[] entryArray15 = hashMap6.table;
        java.lang.Object obj16 = hashMap0.put((java.lang.Object) hashMap3, (java.lang.Object) entryArray15);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        int int3 = hashMap0.size();
        hashMap0.modCount = 97;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap(0);
        java.lang.Object obj8 = new java.lang.Object();
        java.lang.Object obj9 = hashMap7.remove(obj8);
        java.lang.Object obj10 = hashMap0.get(obj8);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap((int) (byte) 0);
        hashMap12.clear();
        system.testclass.HashMap.Entry[] entryArray14 = hashMap12.table;
        hashMap0.table = entryArray14;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.modCount = 10;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        hashMap5.clear();
        java.lang.Object obj10 = hashMap5.remove((java.lang.Object) 10.0f);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        hashMap11.modCount = 0;
        system.testclass.HashMap.Entry[] entryArray14 = hashMap11.table;
        java.lang.Object obj15 = hashMap0.put((java.lang.Object) 10.0f, (java.lang.Object) hashMap11);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        int int3 = hashMap0.modCount;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        hashMap4.clear();
        java.lang.Object obj6 = hashMap0.get((java.lang.Object) hashMap4);
        hashMap4.clear();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        java.lang.Object obj12 = hashMap9.remove((java.lang.Object) hashMap10);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap(0);
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Object obj16 = hashMap14.remove(obj15);
        java.lang.Object obj18 = hashMap14.get((java.lang.Object) (short) 1);
        boolean boolean19 = hashMap14.isEmpty();
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        boolean boolean21 = hashMap20.isEmpty();
        int int22 = hashMap20.size();
        hashMap20.clear();
        boolean boolean24 = hashMap20.isEmpty();
        hashMap20.clear();
        hashMap20.modCount = (byte) 10;
        system.testclass.HashMap.Entry[] entryArray28 = hashMap20.table;
        java.lang.Object obj29 = hashMap14.get((java.lang.Object) entryArray28);
        java.lang.Object obj30 = hashMap9.get((java.lang.Object) entryArray28);
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        boolean boolean32 = hashMap31.isEmpty();
        boolean boolean33 = hashMap31.isEmpty();
        int int34 = hashMap31.modCount;
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        hashMap35.clear();
        java.lang.Object obj37 = hashMap31.get((java.lang.Object) hashMap35);
        java.lang.Object obj38 = hashMap4.put((java.lang.Object) entryArray28, (java.lang.Object) hashMap35);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap4", hashMap4.repOK_1());
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 1);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        int int3 = hashMap2.modCount;
        system.testclass.HashMap.Entry[] entryArray4 = hashMap2.table;
        java.lang.Object obj6 = hashMap1.put((java.lang.Object) entryArray4, (java.lang.Object) 1L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(10, (float) 97);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 0, (float) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        java.lang.Object obj4 = hashMap0.get((java.lang.Object) 10);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        hashMap5.clear();
        system.testclass.HashMap.Entry[] entryArray7 = hashMap5.table;
        hashMap0.table = entryArray7;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap((int) (short) 10);
        hashMap11.clear();
        java.lang.Object obj13 = hashMap0.put((java.lang.Object) (short) -1, (java.lang.Object) hashMap11);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap(0);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object obj5 = hashMap3.remove(obj4);
        java.lang.Object obj7 = hashMap3.get((java.lang.Object) (short) 1);
        boolean boolean8 = hashMap3.isEmpty();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        int int11 = hashMap9.size();
        hashMap9.clear();
        boolean boolean13 = hashMap9.isEmpty();
        hashMap9.clear();
        hashMap9.modCount = (byte) 10;
        system.testclass.HashMap.Entry[] entryArray17 = hashMap9.table;
        java.lang.Object obj18 = hashMap3.get((java.lang.Object) entryArray17);
        java.lang.Object obj19 = hashMap0.get((java.lang.Object) entryArray17);
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap((int) (byte) 1);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        boolean boolean23 = hashMap22.isEmpty();
        boolean boolean24 = hashMap22.isEmpty();
        int int25 = hashMap22.modCount;
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        hashMap26.clear();
        java.lang.Object obj28 = hashMap22.get((java.lang.Object) hashMap26);
        hashMap26.clear();
        java.lang.Class<?> wildcardClass30 = hashMap26.getClass();
        java.lang.Object obj31 = hashMap0.put((java.lang.Object) (byte) 1, (java.lang.Object) wildcardClass30);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) ' ', (float) 1);
        system.testclass.HashMap.Entry[] entryArray3 = hashMap2.table;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        boolean boolean6 = hashMap4.isEmpty();
        boolean boolean7 = hashMap4.isEmpty();
        java.lang.Object obj9 = hashMap2.put((java.lang.Object) hashMap4, (java.lang.Object) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 100);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        hashMap2.clear();
        java.lang.Object obj5 = hashMap2.get((java.lang.Object) (byte) 0);
        hashMap2.modCount = 'a';
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap((int) (byte) 0);
        hashMap9.clear();
        system.testclass.HashMap.Entry[] entryArray11 = hashMap9.table;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        boolean boolean13 = hashMap12.isEmpty();
        int int14 = hashMap12.size();
        java.lang.Object obj16 = hashMap12.get((java.lang.Object) 10);
        java.lang.Object obj17 = hashMap9.remove((java.lang.Object) hashMap12);
        java.lang.Object obj19 = hashMap9.remove((java.lang.Object) 0.0d);
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        hashMap20.modCount = 0;
        java.lang.Object obj23 = hashMap9.get((java.lang.Object) hashMap20);
        java.lang.Object obj25 = hashMap20.get((java.lang.Object) (-1.0d));
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        hashMap26.clear();
        system.testclass.HashMap.Entry[] entryArray28 = hashMap26.table;
        hashMap20.table = entryArray28;
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        boolean boolean31 = hashMap30.isEmpty();
        int int32 = hashMap30.size();
        hashMap30.clear();
        boolean boolean34 = hashMap30.isEmpty();
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        hashMap35.clear();
        system.testclass.HashMap.Entry[] entryArray37 = hashMap35.table;
        hashMap30.table = entryArray37;
        hashMap20.table = entryArray37;
        hashMap2.table = entryArray37;
        hashMap1.table = entryArray37;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        int int5 = hashMap3.size();
        java.lang.Object obj7 = hashMap3.get((java.lang.Object) 10);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        hashMap8.clear();
        system.testclass.HashMap.Entry[] entryArray10 = hashMap8.table;
        hashMap3.table = entryArray10;
        hashMap0.table = entryArray10;
        java.lang.Object obj14 = hashMap0.remove((java.lang.Object) 0L);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap(0);
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Object obj18 = hashMap16.remove(obj17);
        java.lang.Object obj20 = hashMap16.get((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        hashMap23.modCount = 0;
        java.lang.Object obj26 = hashMap22.remove((java.lang.Object) hashMap23);
        system.testclass.HashMap.Entry[] entryArray27 = hashMap23.table;
        java.lang.Object obj28 = hashMap16.remove((java.lang.Object) hashMap23);
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        hashMap29.clear();
        system.testclass.HashMap.Entry[] entryArray31 = hashMap29.table;
        java.lang.Object obj32 = hashMap16.remove((java.lang.Object) hashMap29);
        java.lang.Object obj33 = null;
        java.lang.Object obj34 = hashMap29.get(obj33);
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        boolean boolean36 = hashMap35.isEmpty();
        boolean boolean37 = hashMap35.isEmpty();
        int int38 = hashMap35.modCount;
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        hashMap39.clear();
        java.lang.Object obj41 = hashMap35.get((java.lang.Object) hashMap39);
        int int42 = hashMap39.size();
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap((int) (byte) 0);
        hashMap44.clear();
        system.testclass.HashMap.Entry[] entryArray46 = hashMap44.table;
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap();
        boolean boolean48 = hashMap47.isEmpty();
        int int49 = hashMap47.size();
        java.lang.Object obj51 = hashMap47.get((java.lang.Object) 10);
        java.lang.Object obj52 = hashMap44.remove((java.lang.Object) hashMap47);
        hashMap47.clear();
        java.lang.Object obj54 = hashMap39.get((java.lang.Object) hashMap47);
        java.lang.Object obj55 = hashMap29.remove((java.lang.Object) hashMap39);
        system.testclass.HashMap hashMap56 = new system.testclass.HashMap();
        boolean boolean57 = hashMap56.isEmpty();
        int int58 = hashMap56.size();
        java.lang.Object obj60 = hashMap56.get((java.lang.Object) 10);
        hashMap56.modCount = (short) 1;
        system.testclass.HashMap hashMap64 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap65 = new system.testclass.HashMap();
        boolean boolean66 = hashMap65.isEmpty();
        java.lang.Object obj67 = hashMap64.remove((java.lang.Object) hashMap65);
        java.lang.Object obj68 = hashMap56.remove((java.lang.Object) hashMap64);
        java.lang.Object obj69 = hashMap0.put(obj55, (java.lang.Object) hashMap64);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        int int3 = hashMap0.modCount;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        hashMap4.clear();
        java.lang.Object obj6 = hashMap0.get((java.lang.Object) hashMap4);
        hashMap4.clear();
        int int8 = hashMap4.size();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        system.testclass.HashMap.Entry[] entryArray11 = hashMap9.table;
        system.testclass.HashMap.Entry[] entryArray12 = hashMap9.table;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        hashMap13.modCount = 0;
        system.testclass.HashMap.Entry[] entryArray16 = hashMap13.table;
        java.lang.Object obj17 = hashMap9.remove((java.lang.Object) entryArray16);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        hashMap18.clear();
        java.lang.Object obj21 = hashMap18.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        boolean boolean23 = hashMap22.isEmpty();
        boolean boolean24 = hashMap22.isEmpty();
        int int25 = hashMap22.modCount;
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        hashMap26.clear();
        java.lang.Object obj28 = hashMap22.get((java.lang.Object) hashMap26);
        java.lang.Object obj29 = hashMap18.remove((java.lang.Object) hashMap26);
        java.lang.Object obj30 = hashMap4.put((java.lang.Object) hashMap9, (java.lang.Object) hashMap18);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap4", hashMap4.repOK_1());
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        hashMap0.clear();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.modCount;
        int int8 = hashMap6.modCount;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        int int11 = hashMap9.size();
        java.lang.Object obj13 = hashMap9.get((java.lang.Object) 10);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        hashMap14.clear();
        system.testclass.HashMap.Entry[] entryArray16 = hashMap14.table;
        hashMap9.table = entryArray16;
        hashMap6.table = entryArray16;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        hashMap19.clear();
        int int21 = hashMap19.modCount;
        boolean boolean22 = hashMap19.isEmpty();
        java.lang.Object obj23 = hashMap6.remove((java.lang.Object) boolean22);
        java.lang.Object obj24 = hashMap0.put((java.lang.Object) 0.0f, (java.lang.Object) boolean22);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = hashMap1.remove(obj2);
        java.lang.Object obj5 = hashMap1.get((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        hashMap8.modCount = 0;
        java.lang.Object obj11 = hashMap7.remove((java.lang.Object) hashMap8);
        system.testclass.HashMap.Entry[] entryArray12 = hashMap8.table;
        java.lang.Object obj13 = hashMap1.remove((java.lang.Object) hashMap8);
        java.lang.Object obj15 = hashMap8.remove((java.lang.Object) 100L);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap(0);
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Object obj19 = hashMap17.remove(obj18);
        java.lang.Object obj21 = hashMap17.get((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        hashMap24.modCount = 0;
        java.lang.Object obj27 = hashMap23.remove((java.lang.Object) hashMap24);
        system.testclass.HashMap.Entry[] entryArray28 = hashMap24.table;
        java.lang.Object obj29 = hashMap17.remove((java.lang.Object) hashMap24);
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        hashMap30.clear();
        system.testclass.HashMap.Entry[] entryArray32 = hashMap30.table;
        java.lang.Object obj33 = hashMap17.remove((java.lang.Object) hashMap30);
        java.lang.Object obj34 = null;
        java.lang.Object obj35 = hashMap30.get(obj34);
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        boolean boolean37 = hashMap36.isEmpty();
        boolean boolean38 = hashMap36.isEmpty();
        int int39 = hashMap36.modCount;
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        hashMap40.clear();
        java.lang.Object obj42 = hashMap36.get((java.lang.Object) hashMap40);
        int int43 = hashMap40.size();
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap((int) (byte) 0);
        hashMap45.clear();
        system.testclass.HashMap.Entry[] entryArray47 = hashMap45.table;
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap();
        boolean boolean49 = hashMap48.isEmpty();
        int int50 = hashMap48.size();
        java.lang.Object obj52 = hashMap48.get((java.lang.Object) 10);
        java.lang.Object obj53 = hashMap45.remove((java.lang.Object) hashMap48);
        hashMap48.clear();
        java.lang.Object obj55 = hashMap40.get((java.lang.Object) hashMap48);
        java.lang.Object obj56 = hashMap30.remove((java.lang.Object) hashMap40);
        system.testclass.HashMap hashMap58 = new system.testclass.HashMap((int) (short) 0);
        java.lang.Object obj59 = hashMap8.put((java.lang.Object) hashMap30, (java.lang.Object) hashMap58);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap8", hashMap8.repOK_1());
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.clear();
        int int2 = hashMap0.modCount;
        boolean boolean3 = hashMap0.isEmpty();
        int int4 = hashMap0.modCount;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap(0);
        hashMap6.modCount = (byte) 100;
        system.testclass.HashMap.Entry[] entryArray9 = hashMap6.table;
        java.lang.Object obj10 = hashMap0.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap.Entry[] entryArray11 = null;
        hashMap0.table = entryArray11;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 1);
        system.testclass.HashMap.Entry[] entryArray2 = hashMap1.table;
        hashMap1.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        hashMap1.clear();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap1.table;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        hashMap6.modCount = 0;
        java.lang.Object obj9 = hashMap5.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap.Entry[] entryArray10 = hashMap6.table;
        system.testclass.HashMap.Entry[] entryArray11 = hashMap6.table;
        system.testclass.HashMap.Entry[] entryArray12 = hashMap6.table;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        boolean boolean17 = hashMap16.isEmpty();
        int int18 = hashMap16.size();
        java.lang.Object obj20 = hashMap16.get((java.lang.Object) 10);
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        hashMap21.clear();
        system.testclass.HashMap.Entry[] entryArray23 = hashMap21.table;
        hashMap16.table = entryArray23;
        hashMap13.table = entryArray23;
        java.lang.Object obj26 = hashMap1.put((java.lang.Object) hashMap6, (java.lang.Object) hashMap13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        int int2 = hashMap1.size();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap1.table;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap(0);
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object obj7 = hashMap5.remove(obj6);
        java.lang.Object obj9 = hashMap5.get((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        hashMap12.modCount = 0;
        java.lang.Object obj15 = hashMap11.remove((java.lang.Object) hashMap12);
        system.testclass.HashMap.Entry[] entryArray16 = hashMap12.table;
        java.lang.Object obj17 = hashMap5.remove((java.lang.Object) hashMap12);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        hashMap18.clear();
        system.testclass.HashMap.Entry[] entryArray20 = hashMap18.table;
        java.lang.Object obj21 = hashMap5.remove((java.lang.Object) hashMap18);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        int int23 = hashMap22.modCount;
        java.lang.Object obj24 = hashMap5.remove((java.lang.Object) hashMap22);
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        boolean boolean26 = hashMap25.isEmpty();
        int int27 = hashMap25.size();
        hashMap25.clear();
        boolean boolean29 = hashMap25.isEmpty();
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        hashMap30.clear();
        system.testclass.HashMap.Entry[] entryArray32 = hashMap30.table;
        hashMap25.table = entryArray32;
        system.testclass.HashMap.Entry[] entryArray34 = hashMap25.table;
        java.lang.Object obj35 = hashMap1.put((java.lang.Object) hashMap22, (java.lang.Object) entryArray34);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap((int) (short) 1);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        boolean boolean6 = hashMap4.isEmpty();
        int int7 = hashMap4.modCount;
        int int8 = hashMap4.size();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        hashMap9.clear();
        system.testclass.HashMap.Entry[] entryArray11 = hashMap9.table;
        int int12 = hashMap9.modCount;
        java.lang.Object obj13 = hashMap4.get((java.lang.Object) int12);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        boolean boolean15 = hashMap14.isEmpty();
        int int16 = hashMap14.size();
        java.lang.Object obj18 = hashMap14.get((java.lang.Object) 10);
        hashMap14.clear();
        java.lang.Class<?> wildcardClass20 = hashMap14.getClass();
        java.lang.Object obj21 = hashMap4.get((java.lang.Object) wildcardClass20);
        java.lang.Object obj22 = hashMap0.put((java.lang.Object) hashMap3, obj21);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 1);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        boolean boolean3 = hashMap2.isEmpty();
        int int4 = hashMap2.size();
        java.lang.Object obj6 = hashMap2.get((java.lang.Object) 10);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        hashMap7.clear();
        system.testclass.HashMap.Entry[] entryArray9 = hashMap7.table;
        hashMap2.table = entryArray9;
        java.lang.Object obj11 = hashMap1.remove((java.lang.Object) entryArray9);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        boolean boolean15 = hashMap14.isEmpty();
        java.lang.Object obj16 = hashMap13.remove((java.lang.Object) hashMap14);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        boolean boolean18 = hashMap17.isEmpty();
        boolean boolean19 = hashMap17.isEmpty();
        int int20 = hashMap17.size();
        hashMap17.modCount = 97;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap(0);
        java.lang.Object obj25 = new java.lang.Object();
        java.lang.Object obj26 = hashMap24.remove(obj25);
        java.lang.Object obj27 = hashMap17.get(obj25);
        java.lang.Object obj28 = hashMap1.put((java.lang.Object) hashMap14, obj27);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 10, 10.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        int int2 = hashMap1.size();
        hashMap1.clear();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        boolean boolean6 = hashMap4.isEmpty();
        system.testclass.HashMap.Entry[] entryArray7 = hashMap4.table;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        hashMap10.modCount = 0;
        java.lang.Object obj13 = hashMap9.remove((java.lang.Object) hashMap10);
        hashMap9.clear();
        hashMap9.clear();
        system.testclass.HashMap.Entry[] entryArray16 = hashMap9.table;
        java.lang.Object obj17 = hashMap1.put((java.lang.Object) entryArray7, (java.lang.Object) hashMap9);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap((int) (byte) 0);
        hashMap4.clear();
        system.testclass.HashMap.Entry[] entryArray6 = hashMap4.table;
        java.lang.Object obj8 = hashMap4.get((java.lang.Object) (short) 1);
        system.testclass.HashMap.Entry[] entryArray9 = hashMap4.table;
        hashMap0.table = entryArray9;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.clear();
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) (byte) 0);
        int int4 = hashMap0.size();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        boolean boolean6 = hashMap5.isEmpty();
        int int7 = hashMap5.size();
        hashMap5.clear();
        hashMap5.clear();
        system.testclass.HashMap.Entry[] entryArray10 = hashMap5.table;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap(0);
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Object obj14 = hashMap12.remove(obj13);
        java.lang.Object obj16 = hashMap12.get((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        hashMap19.modCount = 0;
        java.lang.Object obj22 = hashMap18.remove((java.lang.Object) hashMap19);
        system.testclass.HashMap.Entry[] entryArray23 = hashMap19.table;
        java.lang.Object obj24 = hashMap12.remove((java.lang.Object) hashMap19);
        int int25 = hashMap12.size();
        int int26 = hashMap12.modCount;
        java.lang.Object obj27 = hashMap0.put((java.lang.Object) entryArray10, (java.lang.Object) int26);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 0, (float) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.clear();
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = hashMap0.remove(obj2);
        int int4 = hashMap0.size();
        system.testclass.HashMap.Entry entry5 = null;
        system.testclass.HashMap.Entry[] entryArray6 = new system.testclass.HashMap.Entry[] { entry5 };
        hashMap0.table = entryArray6;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '#', (float) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap(0);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object obj5 = hashMap3.remove(obj4);
        java.lang.Object obj7 = hashMap3.get((java.lang.Object) (short) 1);
        boolean boolean8 = hashMap3.isEmpty();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        int int11 = hashMap9.size();
        hashMap9.clear();
        boolean boolean13 = hashMap9.isEmpty();
        hashMap9.clear();
        hashMap9.modCount = (byte) 10;
        system.testclass.HashMap.Entry[] entryArray17 = hashMap9.table;
        java.lang.Object obj18 = hashMap3.get((java.lang.Object) entryArray17);
        java.lang.Object obj19 = hashMap0.get((java.lang.Object) entryArray17);
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        int int21 = hashMap20.modCount;
        int int22 = hashMap20.modCount;
        int int23 = hashMap20.size();
        system.testclass.HashMap.Entry[] entryArray24 = hashMap20.table;
        java.lang.Object obj25 = hashMap0.remove((java.lang.Object) hashMap20);
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap((int) (byte) 0);
        hashMap27.clear();
        system.testclass.HashMap.Entry[] entryArray29 = hashMap27.table;
        hashMap20.table = entryArray29;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap20", hashMap20.repOK_1());
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        int int5 = hashMap3.size();
        java.lang.Object obj7 = hashMap3.get((java.lang.Object) 10);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        hashMap8.clear();
        system.testclass.HashMap.Entry[] entryArray10 = hashMap8.table;
        hashMap3.table = entryArray10;
        hashMap0.table = entryArray10;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        hashMap13.clear();
        int int15 = hashMap13.modCount;
        boolean boolean16 = hashMap13.isEmpty();
        java.lang.Object obj17 = hashMap0.remove((java.lang.Object) boolean16);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        boolean boolean19 = hashMap18.isEmpty();
        boolean boolean20 = hashMap18.isEmpty();
        int int21 = hashMap18.modCount;
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        hashMap22.clear();
        java.lang.Object obj24 = hashMap18.get((java.lang.Object) hashMap22);
        hashMap22.clear();
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap((int) (byte) 0);
        hashMap27.clear();
        system.testclass.HashMap.Entry[] entryArray29 = hashMap27.table;
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        boolean boolean31 = hashMap30.isEmpty();
        int int32 = hashMap30.size();
        java.lang.Object obj34 = hashMap30.get((java.lang.Object) 10);
        java.lang.Object obj35 = hashMap27.remove((java.lang.Object) hashMap30);
        java.lang.Object obj37 = hashMap27.remove((java.lang.Object) 0.0d);
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        hashMap38.modCount = 0;
        java.lang.Object obj41 = hashMap27.get((java.lang.Object) hashMap38);
        java.lang.Object obj43 = hashMap38.get((java.lang.Object) (-1.0d));
        boolean boolean44 = hashMap38.isEmpty();
        java.lang.Object obj45 = hashMap0.put((java.lang.Object) hashMap22, (java.lang.Object) boolean44);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        int int3 = hashMap2.modCount;
        system.testclass.HashMap.Entry[] entryArray4 = hashMap2.table;
        system.testclass.HashMap.Entry[] entryArray5 = hashMap2.table;
        hashMap1.table = entryArray5;
        hashMap1.clear();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        boolean boolean10 = hashMap8.isEmpty();
        int int11 = hashMap8.modCount;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        hashMap12.clear();
        java.lang.Object obj14 = hashMap8.get((java.lang.Object) hashMap12);
        hashMap12.clear();
        int int16 = hashMap12.size();
        java.lang.Object obj18 = hashMap12.remove((java.lang.Object) 10.0f);
        java.lang.Class<?> wildcardClass19 = hashMap12.getClass();
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        boolean boolean21 = hashMap20.isEmpty();
        int int22 = hashMap20.size();
        hashMap20.clear();
        hashMap20.clear();
        system.testclass.HashMap.Entry[] entryArray25 = hashMap20.table;
        hashMap20.modCount = (byte) 0;
        java.lang.Object obj28 = hashMap1.put((java.lang.Object) hashMap12, (java.lang.Object) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        hashMap0.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        java.lang.Object obj4 = hashMap0.get((java.lang.Object) 10);
        hashMap0.modCount = (short) 1;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        java.lang.Object obj11 = hashMap8.remove((java.lang.Object) hashMap9);
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap8);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap(0);
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Object obj16 = hashMap14.remove(obj15);
        java.lang.Object obj18 = hashMap14.get((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        hashMap21.modCount = 0;
        java.lang.Object obj24 = hashMap20.remove((java.lang.Object) hashMap21);
        system.testclass.HashMap.Entry[] entryArray25 = hashMap21.table;
        java.lang.Object obj26 = hashMap14.remove((java.lang.Object) hashMap21);
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        hashMap27.clear();
        system.testclass.HashMap.Entry[] entryArray29 = hashMap27.table;
        java.lang.Object obj30 = hashMap14.remove((java.lang.Object) hashMap27);
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        boolean boolean32 = hashMap31.isEmpty();
        int int33 = hashMap31.size();
        hashMap31.clear();
        boolean boolean35 = hashMap31.isEmpty();
        hashMap31.clear();
        hashMap31.modCount = (byte) 10;
        system.testclass.HashMap.Entry[] entryArray39 = hashMap31.table;
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        boolean boolean41 = hashMap40.isEmpty();
        int int42 = hashMap40.size();
        java.lang.Object obj44 = hashMap40.get((java.lang.Object) 10);
        hashMap40.modCount = (short) 1;
        java.lang.Object obj47 = hashMap31.remove((java.lang.Object) (short) 1);
        java.lang.Object obj48 = hashMap0.put((java.lang.Object) hashMap27, (java.lang.Object) hashMap31);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) 10.0f);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        hashMap6.clear();
        java.lang.Object obj9 = hashMap6.get((java.lang.Object) (byte) 0);
        boolean boolean10 = hashMap6.isEmpty();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap((int) (short) 1);
        java.lang.Object obj13 = hashMap6.get((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap(0);
        java.lang.Class<?> wildcardClass16 = hashMap15.getClass();
        java.lang.Object obj17 = hashMap6.remove((java.lang.Object) wildcardClass16);
        boolean boolean18 = hashMap6.isEmpty();
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        boolean boolean20 = hashMap19.isEmpty();
        boolean boolean21 = hashMap19.isEmpty();
        int int22 = hashMap19.modCount;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        hashMap23.clear();
        java.lang.Object obj25 = hashMap19.get((java.lang.Object) hashMap23);
        boolean boolean26 = hashMap19.isEmpty();
        java.lang.Object obj27 = hashMap0.put((java.lang.Object) hashMap6, (java.lang.Object) boolean26);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        hashMap1.clear();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap1.table;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        int int6 = hashMap4.size();
        java.lang.Object obj8 = hashMap4.get((java.lang.Object) 10);
        java.lang.Object obj9 = hashMap1.remove((java.lang.Object) hashMap4);
        int int10 = hashMap1.modCount;
        boolean boolean11 = hashMap1.isEmpty();
        java.lang.Object obj12 = null;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap((int) (byte) 0);
        hashMap14.clear();
        system.testclass.HashMap.Entry[] entryArray16 = hashMap14.table;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        boolean boolean18 = hashMap17.isEmpty();
        int int19 = hashMap17.size();
        java.lang.Object obj21 = hashMap17.get((java.lang.Object) 10);
        java.lang.Object obj22 = hashMap14.remove((java.lang.Object) hashMap17);
        hashMap17.clear();
        hashMap17.modCount = 10;
        int int26 = hashMap17.size();
        java.lang.Object obj27 = hashMap1.put(obj12, (java.lang.Object) int26);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = hashMap1.remove(obj2);
        java.lang.Object obj5 = hashMap1.get((java.lang.Object) (short) 1);
        boolean boolean6 = hashMap1.isEmpty();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        java.lang.Object obj11 = hashMap8.remove((java.lang.Object) hashMap9);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap((int) (byte) 0);
        hashMap13.clear();
        system.testclass.HashMap.Entry[] entryArray15 = hashMap13.table;
        java.lang.Object obj17 = hashMap13.get((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        boolean boolean19 = hashMap18.isEmpty();
        int int20 = hashMap18.size();
        hashMap18.clear();
        java.lang.Object obj22 = hashMap13.remove((java.lang.Object) hashMap18);
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        int int26 = hashMap25.modCount;
        system.testclass.HashMap.Entry[] entryArray27 = hashMap25.table;
        system.testclass.HashMap.Entry[] entryArray28 = hashMap25.table;
        hashMap24.table = entryArray28;
        hashMap18.table = entryArray28;
        int int31 = hashMap18.size();
        java.lang.Object obj32 = hashMap1.put((java.lang.Object) hashMap9, (java.lang.Object) hashMap18);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 100L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = hashMap1.remove(obj2);
        java.lang.Object obj5 = hashMap1.get((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        hashMap8.modCount = 0;
        java.lang.Object obj11 = hashMap7.remove((java.lang.Object) hashMap8);
        system.testclass.HashMap.Entry[] entryArray12 = hashMap8.table;
        java.lang.Object obj13 = hashMap1.remove((java.lang.Object) hashMap8);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        hashMap14.clear();
        system.testclass.HashMap.Entry[] entryArray16 = hashMap14.table;
        java.lang.Object obj17 = hashMap1.remove((java.lang.Object) hashMap14);
        boolean boolean18 = hashMap14.isEmpty();
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        hashMap19.clear();
        int int21 = hashMap19.modCount;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        hashMap24.modCount = 0;
        java.lang.Object obj27 = hashMap23.remove((java.lang.Object) hashMap24);
        hashMap23.clear();
        java.lang.Object obj30 = hashMap23.get((java.lang.Object) (-1));
        java.lang.Object obj31 = hashMap19.get(obj30);
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        hashMap32.clear();
        java.lang.Object obj34 = hashMap19.get((java.lang.Object) hashMap32);
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        boolean boolean36 = hashMap35.isEmpty();
        boolean boolean37 = hashMap35.isEmpty();
        int int38 = hashMap35.size();
        hashMap35.modCount = 97;
        system.testclass.HashMap.Entry[] entryArray41 = hashMap35.table;
        java.lang.Object obj42 = hashMap14.put((java.lang.Object) hashMap19, (java.lang.Object) entryArray41);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap14", hashMap14.repOK_1());
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        hashMap1.clear();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap1.table;
        java.lang.Object obj5 = hashMap1.get((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        int int8 = hashMap6.size();
        hashMap6.clear();
        java.lang.Object obj10 = hashMap1.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        system.testclass.HashMap.Entry[] entryArray15 = hashMap13.table;
        system.testclass.HashMap.Entry[] entryArray16 = hashMap13.table;
        hashMap12.table = entryArray16;
        hashMap6.table = entryArray16;
        hashMap6.modCount = (short) 1;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        boolean boolean22 = hashMap21.isEmpty();
        int int23 = hashMap21.size();
        hashMap21.clear();
        boolean boolean25 = hashMap21.isEmpty();
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        java.lang.Object obj27 = hashMap21.remove((java.lang.Object) hashMap26);
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        int int29 = hashMap28.modCount;
        system.testclass.HashMap.Entry[] entryArray30 = hashMap28.table;
        system.testclass.HashMap.Entry[] entryArray31 = hashMap28.table;
        java.lang.Object obj32 = hashMap6.put((java.lang.Object) hashMap21, (java.lang.Object) entryArray31);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap6", hashMap6.repOK_1());
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        boolean boolean3 = hashMap2.isEmpty();
        java.lang.Object obj4 = hashMap1.remove((java.lang.Object) hashMap2);
        hashMap1.modCount = (byte) 100;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap((int) (short) 1);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        int int11 = hashMap9.modCount;
        hashMap9.clear();
        java.lang.Object obj14 = hashMap9.remove((java.lang.Object) 10.0f);
        java.lang.Object obj15 = hashMap8.get(obj14);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        int int19 = hashMap18.modCount;
        system.testclass.HashMap.Entry[] entryArray20 = hashMap18.table;
        system.testclass.HashMap.Entry[] entryArray21 = hashMap18.table;
        hashMap17.table = entryArray21;
        hashMap17.clear();
        java.lang.Object obj24 = hashMap1.put((java.lang.Object) hashMap8, (java.lang.Object) hashMap17);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray1 = hashMap0.table;
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        int int3 = hashMap2.modCount;
        system.testclass.HashMap.Entry[] entryArray4 = hashMap2.table;
        system.testclass.HashMap.Entry[] entryArray5 = hashMap2.table;
        hashMap0.table = entryArray5;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap((int) (byte) 0);
        hashMap8.clear();
        system.testclass.HashMap.Entry[] entryArray10 = hashMap8.table;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        boolean boolean12 = hashMap11.isEmpty();
        int int13 = hashMap11.size();
        java.lang.Object obj15 = hashMap11.get((java.lang.Object) 10);
        java.lang.Object obj16 = hashMap8.remove((java.lang.Object) hashMap11);
        hashMap11.clear();
        hashMap11.modCount = 10;
        int int20 = hashMap11.size();
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        hashMap21.clear();
        int int23 = hashMap21.modCount;
        boolean boolean24 = hashMap21.isEmpty();
        int int25 = hashMap21.modCount;
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        boolean boolean27 = hashMap26.isEmpty();
        int int28 = hashMap26.size();
        hashMap26.clear();
        boolean boolean30 = hashMap26.isEmpty();
        hashMap26.clear();
        hashMap26.modCount = (byte) 10;
        java.lang.Object obj34 = hashMap21.get((java.lang.Object) hashMap26);
        java.lang.Object obj35 = hashMap0.put((java.lang.Object) hashMap11, (java.lang.Object) hashMap26);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '#', (float) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        hashMap0.clear();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap0.table;
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) (short) 100);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap((int) (byte) 0);
        int int10 = hashMap9.size();
        hashMap9.clear();
        int int12 = hashMap9.size();
        boolean boolean13 = hashMap9.isEmpty();
        system.testclass.HashMap.Entry[] entryArray14 = hashMap9.table;
        hashMap0.table = entryArray14;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        hashMap1.clear();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap1.table;
        java.lang.Object obj5 = hashMap1.get((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        int int8 = hashMap6.size();
        hashMap6.clear();
        java.lang.Object obj10 = hashMap1.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        boolean boolean12 = hashMap11.isEmpty();
        boolean boolean13 = hashMap11.isEmpty();
        int int14 = hashMap11.modCount;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        hashMap15.clear();
        java.lang.Object obj17 = hashMap11.get((java.lang.Object) hashMap15);
        int int18 = hashMap15.size();
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        int int20 = hashMap19.modCount;
        int int21 = hashMap19.modCount;
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        boolean boolean23 = hashMap22.isEmpty();
        int int24 = hashMap22.size();
        java.lang.Object obj26 = hashMap22.get((java.lang.Object) 10);
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        hashMap27.clear();
        system.testclass.HashMap.Entry[] entryArray29 = hashMap27.table;
        hashMap22.table = entryArray29;
        hashMap19.table = entryArray29;
        java.lang.Object obj33 = hashMap19.remove((java.lang.Object) 0L);
        java.lang.Object obj34 = hashMap15.get(obj33);
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        hashMap37.modCount = 0;
        java.lang.Object obj40 = hashMap36.remove((java.lang.Object) hashMap37);
        system.testclass.HashMap.Entry[] entryArray41 = hashMap37.table;
        int int42 = hashMap37.modCount;
        java.lang.Object obj43 = hashMap15.get((java.lang.Object) hashMap37);
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap();
        int int45 = hashMap44.modCount;
        system.testclass.HashMap.Entry[] entryArray46 = hashMap44.table;
        java.lang.Object obj47 = hashMap6.put(obj43, (java.lang.Object) entryArray46);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap6", hashMap6.repOK_1());
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        java.lang.Object obj4 = hashMap0.get((java.lang.Object) 10);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        hashMap5.clear();
        system.testclass.HashMap.Entry[] entryArray7 = hashMap5.table;
        hashMap0.table = entryArray7;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        boolean boolean12 = hashMap11.isEmpty();
        java.lang.Object obj13 = hashMap10.remove((java.lang.Object) hashMap11);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap(0);
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Object obj17 = hashMap15.remove(obj16);
        java.lang.Object obj19 = hashMap15.get((java.lang.Object) (short) 1);
        boolean boolean20 = hashMap15.isEmpty();
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        boolean boolean22 = hashMap21.isEmpty();
        int int23 = hashMap21.size();
        hashMap21.clear();
        boolean boolean25 = hashMap21.isEmpty();
        hashMap21.clear();
        hashMap21.modCount = (byte) 10;
        system.testclass.HashMap.Entry[] entryArray29 = hashMap21.table;
        java.lang.Object obj30 = hashMap15.get((java.lang.Object) entryArray29);
        java.lang.Object obj31 = hashMap10.get((java.lang.Object) entryArray29);
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap((int) (byte) 0);
        hashMap33.clear();
        system.testclass.HashMap.Entry[] entryArray35 = hashMap33.table;
        java.lang.Object obj37 = hashMap33.get((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        int int39 = hashMap38.modCount;
        int int40 = hashMap38.size();
        java.lang.Object obj41 = hashMap33.get((java.lang.Object) hashMap38);
        java.lang.Object obj42 = hashMap10.remove((java.lang.Object) hashMap38);
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap();
        hashMap43.clear();
        int int45 = hashMap43.modCount;
        boolean boolean46 = hashMap43.isEmpty();
        int int47 = hashMap43.modCount;
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap();
        boolean boolean49 = hashMap48.isEmpty();
        int int50 = hashMap48.size();
        hashMap48.clear();
        boolean boolean52 = hashMap48.isEmpty();
        hashMap48.clear();
        hashMap48.modCount = (byte) 10;
        java.lang.Object obj56 = hashMap43.get((java.lang.Object) hashMap48);
        java.lang.Object obj57 = hashMap0.put((java.lang.Object) hashMap38, (java.lang.Object) hashMap43);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        boolean boolean4 = hashMap0.isEmpty();
        boolean boolean5 = hashMap0.isEmpty();
        hashMap0.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        hashMap0.clear();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) (byte) 0);
        hashMap6.clear();
        system.testclass.HashMap.Entry[] entryArray8 = hashMap6.table;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        int int11 = hashMap9.size();
        java.lang.Object obj13 = hashMap9.get((java.lang.Object) 10);
        java.lang.Object obj14 = hashMap6.remove((java.lang.Object) hashMap9);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        boolean boolean16 = hashMap15.isEmpty();
        int int17 = hashMap15.size();
        hashMap15.clear();
        boolean boolean19 = hashMap15.isEmpty();
        hashMap15.clear();
        hashMap15.modCount = (byte) 10;
        system.testclass.HashMap.Entry[] entryArray23 = hashMap15.table;
        hashMap9.table = entryArray23;
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        boolean boolean26 = hashMap25.isEmpty();
        int int27 = hashMap25.size();
        hashMap25.clear();
        boolean boolean29 = hashMap25.isEmpty();
        boolean boolean30 = hashMap25.isEmpty();
        java.lang.Object obj31 = hashMap0.put((java.lang.Object) hashMap9, (java.lang.Object) hashMap25);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        hashMap1.clear();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap1.table;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        int int6 = hashMap4.size();
        java.lang.Object obj8 = hashMap4.get((java.lang.Object) 10);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        hashMap9.clear();
        system.testclass.HashMap.Entry[] entryArray11 = hashMap9.table;
        hashMap4.table = entryArray11;
        hashMap1.table = entryArray11;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap((int) (byte) 0);
        hashMap15.clear();
        system.testclass.HashMap.Entry[] entryArray17 = hashMap15.table;
        java.lang.Object obj19 = hashMap15.get((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        boolean boolean21 = hashMap20.isEmpty();
        int int22 = hashMap20.size();
        hashMap20.clear();
        java.lang.Object obj24 = hashMap15.remove((java.lang.Object) hashMap20);
        java.lang.Object obj25 = hashMap1.get(obj24);
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        int int27 = hashMap26.modCount;
        int int28 = hashMap26.modCount;
        int int29 = hashMap26.size();
        system.testclass.HashMap.Entry[] entryArray30 = hashMap26.table;
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        int int32 = hashMap31.modCount;
        int int33 = hashMap31.size();
        hashMap31.clear();
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap((int) (byte) 0);
        hashMap36.clear();
        system.testclass.HashMap.Entry[] entryArray38 = hashMap36.table;
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        boolean boolean40 = hashMap39.isEmpty();
        int int41 = hashMap39.size();
        java.lang.Object obj43 = hashMap39.get((java.lang.Object) 10);
        java.lang.Object obj44 = hashMap36.remove((java.lang.Object) hashMap39);
        java.lang.Object obj46 = hashMap36.remove((java.lang.Object) 0.0d);
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap();
        hashMap47.modCount = 0;
        java.lang.Object obj50 = hashMap36.get((java.lang.Object) hashMap47);
        java.lang.Object obj52 = hashMap47.get((java.lang.Object) (-1.0d));
        system.testclass.HashMap hashMap53 = new system.testclass.HashMap();
        hashMap53.clear();
        system.testclass.HashMap.Entry[] entryArray55 = hashMap53.table;
        hashMap47.table = entryArray55;
        system.testclass.HashMap hashMap58 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap59 = new system.testclass.HashMap();
        hashMap59.modCount = 0;
        java.lang.Object obj62 = hashMap58.remove((java.lang.Object) hashMap59);
        system.testclass.HashMap.Entry[] entryArray63 = hashMap59.table;
        system.testclass.HashMap.Entry[] entryArray64 = hashMap59.table;
        java.lang.Object obj65 = hashMap47.get((java.lang.Object) entryArray64);
        java.lang.Object obj66 = hashMap31.remove((java.lang.Object) hashMap47);
        java.lang.Object obj67 = hashMap1.put((java.lang.Object) entryArray30, obj66);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) ' ', (float) 2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        java.lang.Object obj4 = hashMap0.get((java.lang.Object) 10);
        hashMap0.modCount = (short) 1;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        java.lang.Object obj11 = hashMap8.remove((java.lang.Object) hashMap9);
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap8);
        system.testclass.HashMap.Entry[] entryArray13 = null;
        hashMap0.table = entryArray13;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(100, (float) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        int int3 = hashMap0.modCount;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        hashMap4.clear();
        java.lang.Object obj6 = hashMap0.get((java.lang.Object) hashMap4);
        hashMap4.clear();
        hashMap4.modCount = '#';
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        boolean boolean12 = hashMap10.isEmpty();
        int int13 = hashMap10.modCount;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        hashMap14.clear();
        java.lang.Object obj16 = hashMap10.get((java.lang.Object) hashMap14);
        hashMap14.clear();
        java.lang.Class<?> wildcardClass18 = hashMap14.getClass();
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap((int) (byte) 0);
        hashMap20.clear();
        system.testclass.HashMap.Entry[] entryArray22 = hashMap20.table;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        boolean boolean24 = hashMap23.isEmpty();
        int int25 = hashMap23.size();
        java.lang.Object obj27 = hashMap23.get((java.lang.Object) 10);
        java.lang.Object obj28 = hashMap20.remove((java.lang.Object) hashMap23);
        hashMap23.clear();
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        boolean boolean31 = hashMap30.isEmpty();
        boolean boolean32 = hashMap30.isEmpty();
        int int33 = hashMap30.modCount;
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        hashMap34.clear();
        java.lang.Object obj36 = hashMap30.get((java.lang.Object) hashMap34);
        hashMap34.clear();
        hashMap34.modCount = '#';
        java.lang.Object obj40 = hashMap23.get((java.lang.Object) hashMap34);
        java.lang.Object obj41 = hashMap4.put((java.lang.Object) hashMap14, (java.lang.Object) hashMap34);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap4", hashMap4.repOK_1());
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap((int) (byte) 0);
        hashMap3.clear();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap3.table;
        hashMap0.table = entryArray5;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        int int3 = hashMap0.modCount;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        hashMap4.clear();
        java.lang.Object obj6 = hashMap0.get((java.lang.Object) hashMap4);
        int int7 = hashMap4.size();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap((int) (byte) 0);
        hashMap9.clear();
        system.testclass.HashMap.Entry[] entryArray11 = hashMap9.table;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        boolean boolean13 = hashMap12.isEmpty();
        int int14 = hashMap12.size();
        java.lang.Object obj16 = hashMap12.get((java.lang.Object) 10);
        java.lang.Object obj17 = hashMap9.remove((java.lang.Object) hashMap12);
        hashMap12.clear();
        java.lang.Object obj19 = hashMap4.get((java.lang.Object) hashMap12);
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        int int21 = hashMap20.modCount;
        int int22 = hashMap20.size();
        java.lang.Object obj23 = hashMap12.remove((java.lang.Object) hashMap20);
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        int int27 = hashMap26.modCount;
        system.testclass.HashMap.Entry[] entryArray28 = hashMap26.table;
        system.testclass.HashMap.Entry[] entryArray29 = hashMap26.table;
        hashMap25.table = entryArray29;
        boolean boolean31 = hashMap25.isEmpty();
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap((int) (byte) 0);
        hashMap33.clear();
        system.testclass.HashMap.Entry[] entryArray35 = hashMap33.table;
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        boolean boolean37 = hashMap36.isEmpty();
        int int38 = hashMap36.size();
        java.lang.Object obj40 = hashMap36.get((java.lang.Object) 10);
        java.lang.Object obj41 = hashMap33.remove((java.lang.Object) hashMap36);
        java.lang.Object obj43 = hashMap33.remove((java.lang.Object) 0.0d);
        int int44 = hashMap33.modCount;
        java.lang.Object obj45 = hashMap12.put((java.lang.Object) hashMap25, (java.lang.Object) hashMap33);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap12", hashMap12.repOK_1());
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        int int3 = hashMap0.modCount;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        hashMap4.clear();
        java.lang.Object obj6 = hashMap0.get((java.lang.Object) hashMap4);
        int int7 = hashMap4.size();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.modCount;
        int int10 = hashMap8.modCount;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        boolean boolean12 = hashMap11.isEmpty();
        int int13 = hashMap11.size();
        java.lang.Object obj15 = hashMap11.get((java.lang.Object) 10);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        hashMap16.clear();
        system.testclass.HashMap.Entry[] entryArray18 = hashMap16.table;
        hashMap11.table = entryArray18;
        hashMap8.table = entryArray18;
        java.lang.Object obj22 = hashMap8.remove((java.lang.Object) 0L);
        java.lang.Object obj23 = hashMap4.get(obj22);
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        hashMap26.modCount = 0;
        java.lang.Object obj29 = hashMap25.remove((java.lang.Object) hashMap26);
        system.testclass.HashMap.Entry[] entryArray30 = hashMap26.table;
        int int31 = hashMap26.modCount;
        java.lang.Object obj32 = hashMap4.get((java.lang.Object) hashMap26);
        system.testclass.HashMap.Entry[] entryArray33 = hashMap26.table;
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        int int35 = hashMap34.modCount;
        int int36 = hashMap34.modCount;
        int int37 = hashMap34.size();
        java.lang.Class<?> wildcardClass38 = hashMap34.getClass();
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        boolean boolean40 = hashMap39.isEmpty();
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap(0);
        java.lang.Object obj43 = new java.lang.Object();
        java.lang.Object obj44 = hashMap42.remove(obj43);
        java.lang.Object obj46 = hashMap42.get((java.lang.Object) (short) 1);
        boolean boolean47 = hashMap42.isEmpty();
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap();
        boolean boolean49 = hashMap48.isEmpty();
        int int50 = hashMap48.size();
        hashMap48.clear();
        boolean boolean52 = hashMap48.isEmpty();
        hashMap48.clear();
        hashMap48.modCount = (byte) 10;
        system.testclass.HashMap.Entry[] entryArray56 = hashMap48.table;
        java.lang.Object obj57 = hashMap42.get((java.lang.Object) entryArray56);
        java.lang.Object obj58 = hashMap39.get((java.lang.Object) entryArray56);
        system.testclass.HashMap hashMap59 = new system.testclass.HashMap();
        int int60 = hashMap59.modCount;
        int int61 = hashMap59.modCount;
        int int62 = hashMap59.size();
        system.testclass.HashMap.Entry[] entryArray63 = hashMap59.table;
        java.lang.Object obj64 = hashMap39.remove((java.lang.Object) hashMap59);
        java.lang.Object obj65 = hashMap26.put((java.lang.Object) hashMap34, (java.lang.Object) hashMap39);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap26", hashMap26.repOK_1());
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.clear();
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = hashMap0.remove(obj2);
        int int4 = hashMap0.modCount;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        java.lang.Object obj9 = hashMap6.remove((java.lang.Object) hashMap7);
        hashMap6.modCount = (byte) 100;
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) (byte) 100);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        hashMap13.clear();
        hashMap13.clear();
        hashMap13.modCount = (short) 1;
        int int20 = hashMap13.modCount;
        boolean boolean21 = hashMap13.isEmpty();
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        hashMap24.modCount = 0;
        java.lang.Object obj27 = hashMap23.remove((java.lang.Object) hashMap24);
        hashMap23.clear();
        hashMap23.clear();
        system.testclass.HashMap.Entry[] entryArray30 = hashMap23.table;
        hashMap23.modCount = (short) 100;
        java.lang.Object obj33 = hashMap0.put((java.lang.Object) hashMap13, (java.lang.Object) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) ' ');
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        int int3 = hashMap2.modCount;
        int int4 = hashMap2.modCount;
        hashMap2.clear();
        hashMap2.clear();
        hashMap2.modCount = (short) 1;
        int int9 = hashMap2.modCount;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap((int) (short) 0);
        java.lang.Object obj12 = hashMap2.remove((java.lang.Object) hashMap11);
        system.testclass.HashMap.Entry[] entryArray13 = hashMap2.table;
        hashMap1.table = entryArray13;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.clear();
        int int2 = hashMap0.modCount;
        boolean boolean3 = hashMap0.isEmpty();
        int int4 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray5 = null;
        hashMap0.table = entryArray5;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(2, (float) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) '4');
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap((int) (short) 1);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        hashMap4.clear();
        java.lang.Object obj9 = hashMap4.remove((java.lang.Object) 10.0f);
        java.lang.Object obj10 = hashMap3.get(obj9);
        java.lang.Object obj11 = hashMap1.remove(obj9);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        int int13 = hashMap12.modCount;
        int int14 = hashMap12.modCount;
        hashMap12.clear();
        hashMap12.clear();
        hashMap12.modCount = (short) 1;
        int int19 = hashMap12.modCount;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap((int) (short) 0);
        java.lang.Object obj22 = hashMap12.remove((java.lang.Object) hashMap21);
        hashMap12.modCount = 100;
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap((int) (byte) 0);
        hashMap26.clear();
        system.testclass.HashMap.Entry[] entryArray28 = hashMap26.table;
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        boolean boolean30 = hashMap29.isEmpty();
        int int31 = hashMap29.size();
        java.lang.Object obj33 = hashMap29.get((java.lang.Object) 10);
        java.lang.Object obj34 = hashMap26.remove((java.lang.Object) hashMap29);
        hashMap29.clear();
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        boolean boolean37 = hashMap36.isEmpty();
        boolean boolean38 = hashMap36.isEmpty();
        int int39 = hashMap36.modCount;
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        hashMap40.clear();
        java.lang.Object obj42 = hashMap36.get((java.lang.Object) hashMap40);
        hashMap40.clear();
        hashMap40.modCount = '#';
        java.lang.Object obj46 = hashMap29.get((java.lang.Object) hashMap40);
        hashMap29.clear();
        java.lang.Object obj48 = hashMap1.put((java.lang.Object) 100, (java.lang.Object) hashMap29);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.clear();
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) (byte) 0);
        int int4 = hashMap0.size();
        boolean boolean5 = hashMap0.isEmpty();
        hashMap0.clear();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        int int9 = hashMap7.size();
        hashMap7.clear();
        hashMap7.clear();
        system.testclass.HashMap.Entry[] entryArray12 = hashMap7.table;
        hashMap7.modCount = (byte) 0;
        system.testclass.HashMap.Entry[] entryArray15 = hashMap7.table;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap(0);
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Object obj19 = hashMap17.remove(obj18);
        java.lang.Object obj21 = hashMap17.get((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        hashMap24.modCount = 0;
        java.lang.Object obj27 = hashMap23.remove((java.lang.Object) hashMap24);
        system.testclass.HashMap.Entry[] entryArray28 = hashMap24.table;
        java.lang.Object obj29 = hashMap17.remove((java.lang.Object) hashMap24);
        int int30 = hashMap17.size();
        int int31 = hashMap17.modCount;
        java.lang.Object obj32 = hashMap0.put((java.lang.Object) hashMap7, (java.lang.Object) hashMap17);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.clear();
        int int2 = hashMap0.modCount;
        boolean boolean3 = hashMap0.isEmpty();
        int int4 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray5 = hashMap0.table;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap(0);
        hashMap7.modCount = (byte) 100;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap((int) (short) 10);
        java.lang.Object obj13 = hashMap11.remove((java.lang.Object) (short) -1);
        system.testclass.HashMap.Entry[] entryArray14 = hashMap11.table;
        java.lang.Object obj15 = hashMap0.put((java.lang.Object) (byte) 100, (java.lang.Object) entryArray14);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        boolean boolean3 = hashMap0.isEmpty();
        boolean boolean4 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        int int10 = hashMap8.size();
        java.lang.Object obj12 = hashMap8.get((java.lang.Object) 10);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        hashMap13.clear();
        system.testclass.HashMap.Entry[] entryArray15 = hashMap13.table;
        hashMap8.table = entryArray15;
        hashMap5.table = entryArray15;
        hashMap0.table = entryArray15;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        int int20 = hashMap19.modCount;
        int int21 = hashMap19.modCount;
        hashMap19.clear();
        hashMap19.clear();
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.modCount;
        int int26 = hashMap24.modCount;
        hashMap24.clear();
        hashMap24.clear();
        hashMap24.modCount = (short) 1;
        int int31 = hashMap24.modCount;
        java.lang.Object obj32 = hashMap0.put((java.lang.Object) hashMap19, (java.lang.Object) int31);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        int int3 = hashMap0.modCount;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        hashMap4.clear();
        java.lang.Object obj6 = hashMap0.get((java.lang.Object) hashMap4);
        hashMap4.clear();
        int int8 = hashMap4.size();
        hashMap4.clear();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.modCount;
        system.testclass.HashMap.Entry[] entryArray12 = hashMap10.table;
        system.testclass.HashMap.Entry[] entryArray13 = hashMap10.table;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        hashMap14.modCount = 0;
        system.testclass.HashMap.Entry[] entryArray17 = hashMap14.table;
        java.lang.Object obj18 = hashMap10.remove((java.lang.Object) entryArray17);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        boolean boolean20 = hashMap19.isEmpty();
        boolean boolean21 = hashMap19.isEmpty();
        int int22 = hashMap19.modCount;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        hashMap23.clear();
        java.lang.Object obj25 = hashMap19.get((java.lang.Object) hashMap23);
        hashMap23.clear();
        hashMap23.modCount = '#';
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        boolean boolean30 = hashMap29.isEmpty();
        boolean boolean31 = hashMap29.isEmpty();
        int int32 = hashMap29.modCount;
        int int33 = hashMap29.size();
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        hashMap34.clear();
        system.testclass.HashMap.Entry[] entryArray36 = hashMap34.table;
        int int37 = hashMap34.modCount;
        java.lang.Object obj38 = hashMap29.get((java.lang.Object) int37);
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        boolean boolean40 = hashMap39.isEmpty();
        int int41 = hashMap39.size();
        java.lang.Object obj43 = hashMap39.get((java.lang.Object) 10);
        hashMap39.clear();
        java.lang.Class<?> wildcardClass45 = hashMap39.getClass();
        java.lang.Object obj46 = hashMap29.get((java.lang.Object) wildcardClass45);
        java.lang.Object obj47 = hashMap23.get(obj46);
        system.testclass.HashMap hashMap49 = new system.testclass.HashMap((int) (byte) 0);
        hashMap49.clear();
        system.testclass.HashMap.Entry[] entryArray51 = hashMap49.table;
        java.lang.Object obj53 = hashMap49.get((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap54 = new system.testclass.HashMap();
        boolean boolean55 = hashMap54.isEmpty();
        int int56 = hashMap54.size();
        java.lang.Object obj58 = hashMap54.get((java.lang.Object) 10);
        system.testclass.HashMap hashMap59 = new system.testclass.HashMap();
        hashMap59.clear();
        system.testclass.HashMap.Entry[] entryArray61 = hashMap59.table;
        hashMap54.table = entryArray61;
        hashMap49.table = entryArray61;
        java.lang.Object obj64 = hashMap23.remove((java.lang.Object) entryArray61);
        java.lang.Object obj65 = hashMap4.put(obj18, obj64);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap4", hashMap4.repOK_1());
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        boolean boolean3 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap(0);
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object obj7 = hashMap5.remove(obj6);
        java.lang.Object obj9 = hashMap5.get((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        hashMap12.modCount = 0;
        java.lang.Object obj15 = hashMap11.remove((java.lang.Object) hashMap12);
        system.testclass.HashMap.Entry[] entryArray16 = hashMap12.table;
        java.lang.Object obj17 = hashMap5.remove((java.lang.Object) hashMap12);
        java.lang.Object obj19 = hashMap12.remove((java.lang.Object) 100L);
        java.lang.Object obj20 = hashMap0.remove((java.lang.Object) hashMap12);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap(0);
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Object obj24 = hashMap22.remove(obj23);
        java.lang.Object obj26 = hashMap22.get((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        hashMap29.modCount = 0;
        java.lang.Object obj32 = hashMap28.remove((java.lang.Object) hashMap29);
        system.testclass.HashMap.Entry[] entryArray33 = hashMap29.table;
        java.lang.Object obj34 = hashMap22.remove((java.lang.Object) hashMap29);
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        hashMap35.clear();
        system.testclass.HashMap.Entry[] entryArray37 = hashMap35.table;
        java.lang.Object obj38 = hashMap22.remove((java.lang.Object) hashMap35);
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        hashMap39.modCount = 0;
        java.lang.Object obj42 = hashMap35.get((java.lang.Object) hashMap39);
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap();
        boolean boolean44 = hashMap43.isEmpty();
        boolean boolean45 = hashMap43.isEmpty();
        boolean boolean46 = hashMap43.isEmpty();
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap(0);
        java.lang.Object obj49 = new java.lang.Object();
        java.lang.Object obj50 = hashMap48.remove(obj49);
        java.lang.Object obj52 = hashMap48.get((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap54 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap55 = new system.testclass.HashMap();
        hashMap55.modCount = 0;
        java.lang.Object obj58 = hashMap54.remove((java.lang.Object) hashMap55);
        system.testclass.HashMap.Entry[] entryArray59 = hashMap55.table;
        java.lang.Object obj60 = hashMap48.remove((java.lang.Object) hashMap55);
        java.lang.Object obj62 = hashMap55.remove((java.lang.Object) 100L);
        java.lang.Object obj63 = hashMap43.remove((java.lang.Object) hashMap55);
        int int64 = hashMap43.modCount;
        java.lang.Object obj65 = hashMap12.put((java.lang.Object) hashMap35, (java.lang.Object) int64);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap12", hashMap12.repOK_1());
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 100, (float) 100L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        int int3 = hashMap0.modCount;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        hashMap4.clear();
        java.lang.Object obj6 = hashMap0.get((java.lang.Object) hashMap4);
        int int7 = hashMap4.size();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap((int) (byte) 0);
        hashMap9.clear();
        system.testclass.HashMap.Entry[] entryArray11 = hashMap9.table;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        boolean boolean13 = hashMap12.isEmpty();
        int int14 = hashMap12.size();
        java.lang.Object obj16 = hashMap12.get((java.lang.Object) 10);
        java.lang.Object obj17 = hashMap9.remove((java.lang.Object) hashMap12);
        hashMap12.clear();
        java.lang.Object obj19 = hashMap4.get((java.lang.Object) hashMap12);
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap((int) (short) 10);
        java.lang.Object obj23 = hashMap21.remove((java.lang.Object) (short) -1);
        boolean boolean24 = hashMap21.isEmpty();
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        hashMap25.clear();
        java.lang.Object obj28 = hashMap25.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        boolean boolean30 = hashMap29.isEmpty();
        boolean boolean31 = hashMap29.isEmpty();
        int int32 = hashMap29.modCount;
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        hashMap33.clear();
        java.lang.Object obj35 = hashMap29.get((java.lang.Object) hashMap33);
        java.lang.Object obj36 = hashMap25.remove((java.lang.Object) hashMap33);
        java.lang.Object obj37 = hashMap21.remove((java.lang.Object) hashMap25);
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        boolean boolean39 = hashMap38.isEmpty();
        boolean boolean40 = hashMap38.isEmpty();
        int int41 = hashMap38.modCount;
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap();
        hashMap42.clear();
        java.lang.Object obj44 = hashMap38.get((java.lang.Object) hashMap42);
        hashMap42.clear();
        java.lang.Object obj46 = hashMap4.put(obj37, (java.lang.Object) hashMap42);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap4", hashMap4.repOK_1());
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray2 = hashMap0.table;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        int int4 = hashMap0.modCount;
        hashMap0.clear();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) (byte) 0);
        hashMap7.clear();
        system.testclass.HashMap.Entry[] entryArray9 = hashMap7.table;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        int int12 = hashMap10.size();
        java.lang.Object obj14 = hashMap10.get((java.lang.Object) 10);
        java.lang.Object obj15 = hashMap7.remove((java.lang.Object) hashMap10);
        java.lang.Object obj17 = hashMap7.remove((java.lang.Object) 0.0d);
        int int18 = hashMap7.modCount;
        system.testclass.HashMap.Entry[] entryArray19 = hashMap7.table;
        hashMap0.table = entryArray19;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        int int3 = hashMap0.modCount;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        hashMap4.clear();
        java.lang.Object obj6 = hashMap0.get((java.lang.Object) hashMap4);
        hashMap4.clear();
        hashMap4.modCount = '#';
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        boolean boolean12 = hashMap10.isEmpty();
        int int13 = hashMap10.modCount;
        int int14 = hashMap10.size();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        hashMap15.clear();
        system.testclass.HashMap.Entry[] entryArray17 = hashMap15.table;
        int int18 = hashMap15.modCount;
        java.lang.Object obj19 = hashMap10.get((java.lang.Object) int18);
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        boolean boolean21 = hashMap20.isEmpty();
        int int22 = hashMap20.size();
        java.lang.Object obj24 = hashMap20.get((java.lang.Object) 10);
        hashMap20.clear();
        java.lang.Class<?> wildcardClass26 = hashMap20.getClass();
        java.lang.Object obj27 = hashMap10.get((java.lang.Object) wildcardClass26);
        java.lang.Object obj28 = hashMap4.get(obj27);
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        hashMap31.modCount = 0;
        java.lang.Object obj34 = hashMap30.remove((java.lang.Object) hashMap31);
        hashMap30.clear();
        system.testclass.HashMap.Entry[] entryArray36 = hashMap30.table;
        hashMap4.table = entryArray36;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap4", hashMap4.repOK_1());
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = hashMap0.remove(obj2);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        int int6 = hashMap4.size();
        hashMap4.clear();
        boolean boolean8 = hashMap4.isEmpty();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        hashMap9.clear();
        system.testclass.HashMap.Entry[] entryArray11 = hashMap9.table;
        hashMap4.table = entryArray11;
        system.testclass.HashMap.Entry[] entryArray13 = hashMap4.table;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        boolean boolean15 = hashMap14.isEmpty();
        boolean boolean16 = hashMap14.isEmpty();
        int int17 = hashMap14.modCount;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        hashMap18.clear();
        java.lang.Object obj20 = hashMap14.get((java.lang.Object) hashMap18);
        int int21 = hashMap18.size();
        system.testclass.HashMap.Entry[] entryArray22 = hashMap18.table;
        java.lang.Object obj23 = hashMap0.put((java.lang.Object) entryArray13, (java.lang.Object) hashMap18);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        int int3 = hashMap0.size();
        hashMap0.modCount = 97;
        hashMap0.clear();
        system.testclass.HashMap.Entry[] entryArray7 = null;
        hashMap0.table = entryArray7;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.clear();
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) (byte) 0);
        hashMap0.modCount = 'a';
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) (byte) 0);
        hashMap7.clear();
        system.testclass.HashMap.Entry[] entryArray9 = hashMap7.table;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        int int12 = hashMap10.size();
        java.lang.Object obj14 = hashMap10.get((java.lang.Object) 10);
        java.lang.Object obj15 = hashMap7.remove((java.lang.Object) hashMap10);
        java.lang.Object obj17 = hashMap7.remove((java.lang.Object) 0.0d);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        hashMap18.modCount = 0;
        java.lang.Object obj21 = hashMap7.get((java.lang.Object) hashMap18);
        java.lang.Object obj23 = hashMap18.get((java.lang.Object) (-1.0d));
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        hashMap24.clear();
        system.testclass.HashMap.Entry[] entryArray26 = hashMap24.table;
        hashMap18.table = entryArray26;
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        boolean boolean29 = hashMap28.isEmpty();
        int int30 = hashMap28.size();
        hashMap28.clear();
        boolean boolean32 = hashMap28.isEmpty();
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        hashMap33.clear();
        system.testclass.HashMap.Entry[] entryArray35 = hashMap33.table;
        hashMap28.table = entryArray35;
        hashMap18.table = entryArray35;
        hashMap0.table = entryArray35;
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        boolean boolean40 = hashMap39.isEmpty();
        int int41 = hashMap39.size();
        hashMap39.clear();
        hashMap39.clear();
        system.testclass.HashMap.Entry[] entryArray44 = hashMap39.table;
        hashMap0.table = entryArray44;
        boolean boolean46 = hashMap0.isEmpty();
        system.testclass.HashMap.Entry[] entryArray47 = hashMap0.table;
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap();
        hashMap48.clear();
        int int50 = hashMap48.modCount;
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap53 = new system.testclass.HashMap();
        hashMap53.modCount = 0;
        java.lang.Object obj56 = hashMap52.remove((java.lang.Object) hashMap53);
        hashMap52.clear();
        java.lang.Object obj59 = hashMap52.get((java.lang.Object) (-1));
        java.lang.Object obj60 = hashMap48.get(obj59);
        hashMap48.clear();
        int int62 = hashMap48.modCount;
        system.testclass.HashMap hashMap64 = new system.testclass.HashMap(1);
        system.testclass.HashMap hashMap65 = new system.testclass.HashMap();
        boolean boolean66 = hashMap65.isEmpty();
        int int67 = hashMap65.size();
        java.lang.Object obj69 = hashMap65.get((java.lang.Object) 10);
        system.testclass.HashMap hashMap70 = new system.testclass.HashMap();
        hashMap70.clear();
        system.testclass.HashMap.Entry[] entryArray72 = hashMap70.table;
        hashMap65.table = entryArray72;
        java.lang.Object obj74 = hashMap64.get((java.lang.Object) hashMap65);
        system.testclass.HashMap hashMap76 = new system.testclass.HashMap(0);
        hashMap76.modCount = (byte) 100;
        system.testclass.HashMap hashMap79 = new system.testclass.HashMap();
        boolean boolean80 = hashMap79.isEmpty();
        int int81 = hashMap79.size();
        hashMap79.clear();
        boolean boolean83 = hashMap79.isEmpty();
        hashMap79.clear();
        hashMap79.modCount = (byte) 10;
        system.testclass.HashMap.Entry[] entryArray87 = hashMap79.table;
        hashMap76.table = entryArray87;
        hashMap65.table = entryArray87;
        java.lang.Object obj90 = hashMap0.put((java.lang.Object) int62, (java.lang.Object) hashMap65);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 100, (float) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(100, (float) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 10, 100.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        hashMap1.clear();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap1.table;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        int int6 = hashMap4.size();
        java.lang.Object obj8 = hashMap4.get((java.lang.Object) 10);
        java.lang.Object obj9 = hashMap1.remove((java.lang.Object) hashMap4);
        java.lang.Object obj11 = hashMap1.remove((java.lang.Object) 0.0d);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        hashMap12.modCount = 0;
        java.lang.Object obj15 = hashMap1.get((java.lang.Object) hashMap12);
        java.lang.Object obj17 = hashMap12.get((java.lang.Object) (-1.0d));
        int int18 = hashMap12.modCount;
        system.testclass.HashMap.Entry[] entryArray19 = hashMap12.table;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        hashMap21.clear();
        int int23 = hashMap21.modCount;
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        hashMap26.modCount = 0;
        java.lang.Object obj29 = hashMap25.remove((java.lang.Object) hashMap26);
        hashMap25.clear();
        java.lang.Object obj32 = hashMap25.get((java.lang.Object) (-1));
        java.lang.Object obj33 = hashMap21.get(obj32);
        java.lang.Object obj35 = hashMap21.get((java.lang.Object) '#');
        int int36 = hashMap21.modCount;
        int int37 = hashMap21.size();
        java.lang.Object obj38 = hashMap12.put((java.lang.Object) 1, (java.lang.Object) int37);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap12", hashMap12.repOK_1());
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.clear();
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = hashMap0.remove(obj2);
        int int4 = hashMap0.modCount;
        hashMap0.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(100, (float) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        boolean boolean4 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        java.lang.Object obj6 = hashMap0.remove((java.lang.Object) hashMap5);
        int int7 = hashMap0.modCount;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap((int) (byte) 0);
        hashMap9.clear();
        system.testclass.HashMap.Entry[] entryArray11 = hashMap9.table;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        boolean boolean13 = hashMap12.isEmpty();
        int int14 = hashMap12.size();
        java.lang.Object obj16 = hashMap12.get((java.lang.Object) 10);
        java.lang.Object obj17 = hashMap9.remove((java.lang.Object) hashMap12);
        java.lang.Object obj19 = hashMap9.remove((java.lang.Object) 0.0d);
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        hashMap20.modCount = 0;
        java.lang.Object obj23 = hashMap9.get((java.lang.Object) hashMap20);
        java.lang.Object obj25 = hashMap20.get((java.lang.Object) (-1.0d));
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        hashMap26.clear();
        system.testclass.HashMap.Entry[] entryArray28 = hashMap26.table;
        hashMap20.table = entryArray28;
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        boolean boolean31 = hashMap30.isEmpty();
        boolean boolean32 = hashMap30.isEmpty();
        int int33 = hashMap30.modCount;
        int int34 = hashMap30.modCount;
        java.lang.Object obj35 = hashMap0.put((java.lang.Object) entryArray28, (java.lang.Object) hashMap30);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        int int3 = hashMap0.modCount;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        hashMap4.clear();
        java.lang.Object obj6 = hashMap0.get((java.lang.Object) hashMap4);
        hashMap4.clear();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap((int) (byte) 0);
        hashMap9.clear();
        system.testclass.HashMap.Entry[] entryArray11 = hashMap9.table;
        java.lang.Object obj13 = hashMap9.get((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        hashMap16.modCount = 0;
        java.lang.Object obj19 = hashMap15.remove((java.lang.Object) hashMap16);
        system.testclass.HashMap.Entry[] entryArray20 = hashMap16.table;
        hashMap9.table = entryArray20;
        hashMap4.table = entryArray20;
        system.testclass.HashMap.Entry[] entryArray23 = hashMap4.table;
        java.lang.Object obj24 = null;
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        boolean boolean26 = hashMap25.isEmpty();
        java.lang.Object obj27 = null;
        java.lang.Object obj28 = hashMap25.remove(obj27);
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        boolean boolean30 = hashMap29.isEmpty();
        int int31 = hashMap29.size();
        java.lang.Object obj32 = hashMap25.get((java.lang.Object) int31);
        java.lang.Object obj33 = hashMap4.put(obj24, (java.lang.Object) hashMap25);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap4", hashMap4.repOK_1());
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        hashMap1.clear();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap1.table;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        int int6 = hashMap4.size();
        java.lang.Object obj8 = hashMap4.get((java.lang.Object) 10);
        java.lang.Object obj9 = hashMap1.remove((java.lang.Object) hashMap4);
        hashMap4.clear();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        boolean boolean12 = hashMap11.isEmpty();
        boolean boolean13 = hashMap11.isEmpty();
        int int14 = hashMap11.modCount;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        hashMap15.clear();
        java.lang.Object obj17 = hashMap11.get((java.lang.Object) hashMap15);
        hashMap15.clear();
        hashMap15.modCount = '#';
        java.lang.Object obj21 = hashMap4.get((java.lang.Object) hashMap15);
        hashMap4.clear();
        boolean boolean23 = hashMap4.isEmpty();
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap(1);
        system.testclass.HashMap.Entry[] entryArray26 = hashMap25.table;
        hashMap4.table = entryArray26;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap4", hashMap4.repOK_1());
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.clear();
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) (byte) 0);
        hashMap0.modCount = 'a';
        int int6 = hashMap0.modCount;
        int int7 = hashMap0.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.modCount;
        int int10 = hashMap8.modCount;
        boolean boolean11 = hashMap8.isEmpty();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap(0);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Object obj15 = hashMap13.remove(obj14);
        java.lang.Object obj17 = hashMap13.get((java.lang.Object) (short) 1);
        boolean boolean18 = hashMap13.isEmpty();
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        boolean boolean20 = hashMap19.isEmpty();
        int int21 = hashMap19.size();
        hashMap19.clear();
        boolean boolean23 = hashMap19.isEmpty();
        hashMap19.clear();
        hashMap19.modCount = (byte) 10;
        system.testclass.HashMap.Entry[] entryArray27 = hashMap19.table;
        java.lang.Object obj28 = hashMap13.get((java.lang.Object) entryArray27);
        hashMap8.table = entryArray27;
        system.testclass.HashMap.Entry[] entryArray30 = hashMap8.table;
        int int31 = hashMap8.size();
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        boolean boolean33 = hashMap32.isEmpty();
        boolean boolean34 = hashMap32.isEmpty();
        int int35 = hashMap32.modCount;
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        hashMap36.clear();
        java.lang.Object obj38 = hashMap32.get((java.lang.Object) hashMap36);
        int int39 = hashMap36.size();
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap((int) (byte) 0);
        hashMap41.clear();
        system.testclass.HashMap.Entry[] entryArray43 = hashMap41.table;
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap();
        boolean boolean45 = hashMap44.isEmpty();
        int int46 = hashMap44.size();
        java.lang.Object obj48 = hashMap44.get((java.lang.Object) 10);
        java.lang.Object obj49 = hashMap41.remove((java.lang.Object) hashMap44);
        hashMap44.clear();
        java.lang.Object obj51 = hashMap36.get((java.lang.Object) hashMap44);
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap();
        int int53 = hashMap52.modCount;
        int int54 = hashMap52.size();
        java.lang.Object obj55 = hashMap44.remove((java.lang.Object) hashMap52);
        system.testclass.HashMap.Entry[] entryArray56 = hashMap52.table;
        java.lang.Object obj57 = hashMap0.put((java.lang.Object) int31, (java.lang.Object) entryArray56);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(1, (float) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        int int3 = hashMap0.modCount;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        hashMap4.clear();
        java.lang.Object obj6 = hashMap0.get((java.lang.Object) hashMap4);
        int int7 = hashMap4.size();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap((int) (byte) 0);
        hashMap9.clear();
        system.testclass.HashMap.Entry[] entryArray11 = hashMap9.table;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        boolean boolean13 = hashMap12.isEmpty();
        int int14 = hashMap12.size();
        java.lang.Object obj16 = hashMap12.get((java.lang.Object) 10);
        java.lang.Object obj17 = hashMap9.remove((java.lang.Object) hashMap12);
        hashMap12.clear();
        java.lang.Object obj19 = hashMap4.get((java.lang.Object) hashMap12);
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        int int21 = hashMap20.modCount;
        int int22 = hashMap20.size();
        java.lang.Object obj23 = hashMap12.remove((java.lang.Object) hashMap20);
        hashMap12.modCount = 100;
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap(0);
        java.lang.Object obj28 = new java.lang.Object();
        java.lang.Object obj29 = hashMap27.remove(obj28);
        java.lang.Object obj31 = hashMap27.get((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        hashMap34.modCount = 0;
        java.lang.Object obj37 = hashMap33.remove((java.lang.Object) hashMap34);
        system.testclass.HashMap.Entry[] entryArray38 = hashMap34.table;
        java.lang.Object obj39 = hashMap27.remove((java.lang.Object) hashMap34);
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        hashMap40.clear();
        system.testclass.HashMap.Entry[] entryArray42 = hashMap40.table;
        java.lang.Object obj43 = hashMap27.remove((java.lang.Object) hashMap40);
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap();
        int int45 = hashMap44.modCount;
        java.lang.Object obj46 = hashMap27.remove((java.lang.Object) hashMap44);
        boolean boolean47 = hashMap44.isEmpty();
        int int48 = hashMap44.size();
        system.testclass.HashMap hashMap50 = new system.testclass.HashMap((int) (byte) 0);
        hashMap50.clear();
        system.testclass.HashMap.Entry[] entryArray52 = hashMap50.table;
        system.testclass.HashMap hashMap53 = new system.testclass.HashMap();
        boolean boolean54 = hashMap53.isEmpty();
        int int55 = hashMap53.size();
        java.lang.Object obj57 = hashMap53.get((java.lang.Object) 10);
        java.lang.Object obj58 = hashMap50.remove((java.lang.Object) hashMap53);
        java.lang.Object obj60 = hashMap50.remove((java.lang.Object) 0.0d);
        system.testclass.HashMap hashMap61 = new system.testclass.HashMap();
        hashMap61.modCount = 0;
        java.lang.Object obj64 = hashMap50.get((java.lang.Object) hashMap61);
        java.lang.Object obj65 = hashMap12.put((java.lang.Object) hashMap44, obj64);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap12", hashMap12.repOK_1());
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        boolean boolean4 = hashMap0.isEmpty();
        boolean boolean5 = hashMap0.isEmpty();
        hashMap0.clear();
        hashMap0.modCount = (short) 100;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) (byte) 0);
        hashMap10.clear();
        system.testclass.HashMap.Entry[] entryArray12 = hashMap10.table;
        java.lang.Object obj14 = hashMap10.get((java.lang.Object) (short) 1);
        system.testclass.HashMap.Entry[] entryArray15 = hashMap10.table;
        hashMap0.table = entryArray15;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 10, (float) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        int int3 = hashMap0.modCount;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        hashMap4.clear();
        java.lang.Object obj6 = hashMap0.get((java.lang.Object) hashMap4);
        int int7 = hashMap4.size();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap((int) (byte) 0);
        hashMap9.clear();
        system.testclass.HashMap.Entry[] entryArray11 = hashMap9.table;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        boolean boolean13 = hashMap12.isEmpty();
        int int14 = hashMap12.size();
        java.lang.Object obj16 = hashMap12.get((java.lang.Object) 10);
        java.lang.Object obj17 = hashMap9.remove((java.lang.Object) hashMap12);
        hashMap12.clear();
        java.lang.Object obj19 = hashMap4.get((java.lang.Object) hashMap12);
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        int int21 = hashMap20.modCount;
        int int22 = hashMap20.size();
        java.lang.Object obj23 = hashMap12.remove((java.lang.Object) hashMap20);
        hashMap20.clear();
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        hashMap27.modCount = 0;
        java.lang.Object obj30 = hashMap26.remove((java.lang.Object) hashMap27);
        hashMap26.clear();
        java.lang.Object obj33 = hashMap26.get((java.lang.Object) (-1));
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        boolean boolean35 = hashMap34.isEmpty();
        boolean boolean36 = hashMap34.isEmpty();
        int int37 = hashMap34.modCount;
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        hashMap38.clear();
        java.lang.Object obj40 = hashMap34.get((java.lang.Object) hashMap38);
        hashMap38.clear();
        hashMap38.modCount = '#';
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap();
        boolean boolean45 = hashMap44.isEmpty();
        boolean boolean46 = hashMap44.isEmpty();
        int int47 = hashMap44.modCount;
        int int48 = hashMap44.size();
        system.testclass.HashMap hashMap49 = new system.testclass.HashMap();
        hashMap49.clear();
        system.testclass.HashMap.Entry[] entryArray51 = hashMap49.table;
        int int52 = hashMap49.modCount;
        java.lang.Object obj53 = hashMap44.get((java.lang.Object) int52);
        system.testclass.HashMap hashMap54 = new system.testclass.HashMap();
        boolean boolean55 = hashMap54.isEmpty();
        int int56 = hashMap54.size();
        java.lang.Object obj58 = hashMap54.get((java.lang.Object) 10);
        hashMap54.clear();
        java.lang.Class<?> wildcardClass60 = hashMap54.getClass();
        java.lang.Object obj61 = hashMap44.get((java.lang.Object) wildcardClass60);
        java.lang.Object obj62 = hashMap38.get(obj61);
        system.testclass.HashMap hashMap64 = new system.testclass.HashMap((int) (byte) 0);
        hashMap64.clear();
        system.testclass.HashMap.Entry[] entryArray66 = hashMap64.table;
        java.lang.Object obj68 = hashMap64.get((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap69 = new system.testclass.HashMap();
        boolean boolean70 = hashMap69.isEmpty();
        int int71 = hashMap69.size();
        java.lang.Object obj73 = hashMap69.get((java.lang.Object) 10);
        system.testclass.HashMap hashMap74 = new system.testclass.HashMap();
        hashMap74.clear();
        system.testclass.HashMap.Entry[] entryArray76 = hashMap74.table;
        hashMap69.table = entryArray76;
        hashMap64.table = entryArray76;
        java.lang.Object obj79 = hashMap38.remove((java.lang.Object) entryArray76);
        hashMap26.table = entryArray76;
        system.testclass.HashMap hashMap81 = new system.testclass.HashMap();
        int int82 = hashMap81.modCount;
        int int83 = hashMap81.modCount;
        hashMap81.clear();
        hashMap81.clear();
        hashMap81.modCount = (short) 1;
        int int88 = hashMap81.modCount;
        system.testclass.HashMap hashMap90 = new system.testclass.HashMap((int) (short) 0);
        java.lang.Object obj91 = hashMap81.remove((java.lang.Object) hashMap90);
        hashMap81.modCount = 100;
        java.lang.Object obj94 = hashMap20.put((java.lang.Object) entryArray76, (java.lang.Object) hashMap81);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap20", hashMap20.repOK_1());
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) ' ', (float) 1);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        boolean boolean5 = hashMap3.isEmpty();
        int int6 = hashMap3.modCount;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        hashMap7.clear();
        java.lang.Object obj9 = hashMap3.get((java.lang.Object) hashMap7);
        hashMap7.clear();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap((int) (byte) 0);
        hashMap12.clear();
        system.testclass.HashMap.Entry[] entryArray14 = hashMap12.table;
        java.lang.Object obj16 = hashMap12.get((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        hashMap19.modCount = 0;
        java.lang.Object obj22 = hashMap18.remove((java.lang.Object) hashMap19);
        system.testclass.HashMap.Entry[] entryArray23 = hashMap19.table;
        hashMap12.table = entryArray23;
        hashMap7.table = entryArray23;
        system.testclass.HashMap.Entry[] entryArray26 = hashMap7.table;
        system.testclass.HashMap.Entry[] entryArray27 = hashMap7.table;
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        hashMap30.modCount = 0;
        java.lang.Object obj33 = hashMap29.remove((java.lang.Object) hashMap30);
        hashMap29.clear();
        system.testclass.HashMap.Entry[] entryArray35 = hashMap29.table;
        java.lang.Object obj36 = hashMap2.put((java.lang.Object) hashMap7, (java.lang.Object) hashMap29);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 100, 10.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(100);
        hashMap1.modCount = ' ';
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        int int6 = hashMap4.size();
        hashMap4.clear();
        boolean boolean8 = hashMap4.isEmpty();
        hashMap4.clear();
        hashMap4.modCount = (byte) 10;
        system.testclass.HashMap.Entry[] entryArray12 = hashMap4.table;
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = hashMap1.put((java.lang.Object) entryArray12, obj13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.clear();
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) (byte) 0);
        hashMap0.modCount = 'a';
        java.lang.Object obj6 = null;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        system.testclass.HashMap.Entry[] entryArray9 = hashMap7.table;
        system.testclass.HashMap.Entry[] entryArray10 = hashMap7.table;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        hashMap11.modCount = 0;
        system.testclass.HashMap.Entry[] entryArray14 = hashMap11.table;
        java.lang.Object obj15 = hashMap7.remove((java.lang.Object) entryArray14);
        hashMap7.clear();
        java.lang.Object obj17 = hashMap0.put(obj6, (java.lang.Object) hashMap7);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        int int3 = hashMap0.modCount;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        hashMap4.clear();
        java.lang.Object obj6 = hashMap0.get((java.lang.Object) hashMap4);
        hashMap4.clear();
        int int8 = hashMap4.size();
        java.lang.Object obj10 = hashMap4.remove((java.lang.Object) 10.0f);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        hashMap13.modCount = 0;
        java.lang.Object obj16 = hashMap12.remove((java.lang.Object) hashMap13);
        system.testclass.HashMap.Entry[] entryArray17 = hashMap13.table;
        system.testclass.HashMap.Entry[] entryArray18 = hashMap13.table;
        system.testclass.HashMap.Entry[] entryArray19 = hashMap13.table;
        hashMap4.table = entryArray19;
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        hashMap23.modCount = 0;
        java.lang.Object obj26 = hashMap22.remove((java.lang.Object) hashMap23);
        hashMap22.clear();
        hashMap22.clear();
        system.testclass.HashMap.Entry[] entryArray29 = hashMap22.table;
        hashMap22.modCount = (short) 100;
        java.lang.Object obj32 = hashMap4.get((java.lang.Object) (short) 100);
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        hashMap33.clear();
        java.lang.Object obj36 = hashMap33.get((java.lang.Object) (byte) 0);
        boolean boolean37 = hashMap33.isEmpty();
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap((int) (short) 1);
        java.lang.Object obj40 = hashMap33.get((java.lang.Object) (short) 1);
        boolean boolean41 = hashMap33.isEmpty();
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap(0);
        java.lang.Object obj44 = new java.lang.Object();
        java.lang.Object obj45 = hashMap43.remove(obj44);
        java.lang.Object obj47 = hashMap43.get((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap49 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap50 = new system.testclass.HashMap();
        hashMap50.modCount = 0;
        java.lang.Object obj53 = hashMap49.remove((java.lang.Object) hashMap50);
        system.testclass.HashMap.Entry[] entryArray54 = hashMap50.table;
        java.lang.Object obj55 = hashMap43.remove((java.lang.Object) hashMap50);
        java.lang.Object obj57 = hashMap50.remove((java.lang.Object) 100L);
        java.lang.Object obj58 = hashMap4.put((java.lang.Object) hashMap33, (java.lang.Object) 100L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap4", hashMap4.repOK_1());
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(100, 100.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap(0);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object obj5 = hashMap3.remove(obj4);
        java.lang.Object obj7 = hashMap3.get((java.lang.Object) (short) 1);
        boolean boolean8 = hashMap3.isEmpty();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        int int11 = hashMap9.size();
        hashMap9.clear();
        boolean boolean13 = hashMap9.isEmpty();
        hashMap9.clear();
        hashMap9.modCount = (byte) 10;
        system.testclass.HashMap.Entry[] entryArray17 = hashMap9.table;
        java.lang.Object obj18 = hashMap3.get((java.lang.Object) entryArray17);
        java.lang.Object obj19 = hashMap0.get((java.lang.Object) entryArray17);
        system.testclass.HashMap.Entry[] entryArray20 = hashMap0.table;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        int int22 = hashMap21.modCount;
        int int23 = hashMap21.modCount;
        hashMap21.clear();
        java.lang.Class<?> wildcardClass25 = hashMap21.getClass();
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        hashMap28.modCount = 0;
        java.lang.Object obj31 = hashMap27.remove((java.lang.Object) hashMap28);
        system.testclass.HashMap.Entry[] entryArray32 = hashMap28.table;
        java.lang.Object obj33 = hashMap0.put((java.lang.Object) hashMap21, (java.lang.Object) entryArray32);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        hashMap0.clear();
        hashMap0.modCount = (short) 1;
        int int7 = hashMap0.modCount;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap((int) (short) 0);
        java.lang.Object obj10 = hashMap0.remove((java.lang.Object) hashMap9);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        boolean boolean12 = hashMap11.isEmpty();
        int int13 = hashMap11.size();
        hashMap11.clear();
        boolean boolean15 = hashMap11.isEmpty();
        hashMap11.clear();
        hashMap11.modCount = (byte) 10;
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        boolean boolean22 = hashMap21.isEmpty();
        java.lang.Object obj23 = hashMap20.remove((java.lang.Object) hashMap21);
        java.lang.Object obj24 = hashMap9.put((java.lang.Object) (byte) 10, (java.lang.Object) hashMap20);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap9", hashMap9.repOK_1());
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 0, (float) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.clear();
        int int2 = hashMap0.modCount;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        hashMap5.modCount = 0;
        java.lang.Object obj8 = hashMap4.remove((java.lang.Object) hashMap5);
        hashMap4.clear();
        java.lang.Object obj11 = hashMap4.get((java.lang.Object) (-1));
        java.lang.Object obj12 = hashMap0.get(obj11);
        hashMap0.clear();
        int int14 = hashMap0.modCount;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        boolean boolean16 = hashMap15.isEmpty();
        int int17 = hashMap15.size();
        hashMap15.clear();
        boolean boolean19 = hashMap15.isEmpty();
        hashMap15.clear();
        hashMap15.modCount = (byte) 10;
        int int23 = hashMap15.size();
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        boolean boolean25 = hashMap24.isEmpty();
        boolean boolean26 = hashMap24.isEmpty();
        int int27 = hashMap24.modCount;
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        hashMap28.clear();
        java.lang.Object obj30 = hashMap24.get((java.lang.Object) hashMap28);
        hashMap28.clear();
        int int32 = hashMap28.size();
        java.lang.Object obj34 = hashMap28.remove((java.lang.Object) 10.0f);
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        hashMap37.modCount = 0;
        java.lang.Object obj40 = hashMap36.remove((java.lang.Object) hashMap37);
        system.testclass.HashMap.Entry[] entryArray41 = hashMap37.table;
        system.testclass.HashMap.Entry[] entryArray42 = hashMap37.table;
        system.testclass.HashMap.Entry[] entryArray43 = hashMap37.table;
        hashMap28.table = entryArray43;
        int int45 = hashMap28.modCount;
        java.lang.Object obj46 = hashMap0.put((java.lang.Object) int23, (java.lang.Object) int45);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 1);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        int int3 = hashMap2.modCount;
        int int4 = hashMap2.modCount;
        hashMap2.clear();
        java.lang.Object obj7 = hashMap2.remove((java.lang.Object) 10.0f);
        java.lang.Object obj8 = hashMap1.get(obj7);
        int int9 = hashMap1.modCount;
        boolean boolean10 = hashMap1.isEmpty();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        boolean boolean12 = hashMap11.isEmpty();
        int int13 = hashMap11.size();
        java.lang.Object obj15 = hashMap11.get((java.lang.Object) 10);
        int int16 = hashMap11.modCount;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap((int) ' ', (float) 1);
        system.testclass.HashMap.Entry[] entryArray20 = hashMap19.table;
        hashMap11.table = entryArray20;
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        hashMap22.modCount = 0;
        system.testclass.HashMap.Entry[] entryArray25 = hashMap22.table;
        java.lang.Object obj26 = hashMap1.put((java.lang.Object) entryArray20, (java.lang.Object) entryArray25);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.clear();
        int int2 = hashMap0.modCount;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        hashMap5.modCount = 0;
        java.lang.Object obj8 = hashMap4.remove((java.lang.Object) hashMap5);
        hashMap4.clear();
        java.lang.Object obj11 = hashMap4.get((java.lang.Object) (-1));
        java.lang.Object obj12 = hashMap0.get(obj11);
        java.lang.Object obj14 = hashMap0.get((java.lang.Object) '#');
        int int15 = hashMap0.modCount;
        int int16 = hashMap0.size();
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        boolean boolean18 = hashMap17.isEmpty();
        int int19 = hashMap17.size();
        hashMap17.clear();
        boolean boolean21 = hashMap17.isEmpty();
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        java.lang.Object obj23 = hashMap17.remove((java.lang.Object) hashMap22);
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap((int) (byte) 0);
        hashMap25.clear();
        system.testclass.HashMap.Entry[] entryArray27 = hashMap25.table;
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        boolean boolean29 = hashMap28.isEmpty();
        int int30 = hashMap28.size();
        java.lang.Object obj32 = hashMap28.get((java.lang.Object) 10);
        java.lang.Object obj33 = hashMap25.remove((java.lang.Object) hashMap28);
        java.lang.Object obj35 = hashMap25.remove((java.lang.Object) 0.0d);
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        hashMap36.modCount = 0;
        java.lang.Object obj39 = hashMap25.get((java.lang.Object) hashMap36);
        java.lang.Object obj41 = hashMap36.get((java.lang.Object) (-1.0d));
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap();
        hashMap42.clear();
        system.testclass.HashMap.Entry[] entryArray44 = hashMap42.table;
        hashMap36.table = entryArray44;
        hashMap17.table = entryArray44;
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap(1);
        system.testclass.HashMap hashMap49 = new system.testclass.HashMap();
        boolean boolean50 = hashMap49.isEmpty();
        int int51 = hashMap49.size();
        java.lang.Object obj53 = hashMap49.get((java.lang.Object) 10);
        system.testclass.HashMap hashMap54 = new system.testclass.HashMap();
        hashMap54.clear();
        system.testclass.HashMap.Entry[] entryArray56 = hashMap54.table;
        hashMap49.table = entryArray56;
        java.lang.Object obj58 = hashMap48.get((java.lang.Object) hashMap49);
        system.testclass.HashMap hashMap60 = new system.testclass.HashMap(0);
        hashMap60.modCount = (byte) 100;
        system.testclass.HashMap hashMap63 = new system.testclass.HashMap();
        boolean boolean64 = hashMap63.isEmpty();
        int int65 = hashMap63.size();
        hashMap63.clear();
        boolean boolean67 = hashMap63.isEmpty();
        hashMap63.clear();
        hashMap63.modCount = (byte) 10;
        system.testclass.HashMap.Entry[] entryArray71 = hashMap63.table;
        hashMap60.table = entryArray71;
        hashMap49.table = entryArray71;
        system.testclass.HashMap.Entry[] entryArray74 = hashMap49.table;
        java.lang.Object obj75 = hashMap0.put((java.lang.Object) entryArray44, (java.lang.Object) entryArray74);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.clear();
        int int2 = hashMap0.modCount;
        boolean boolean3 = hashMap0.isEmpty();
        int int4 = hashMap0.modCount;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap(0);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object obj8 = hashMap6.remove(obj7);
        java.lang.Object obj10 = hashMap6.get((java.lang.Object) (short) 1);
        hashMap6.clear();
        java.lang.Object obj12 = hashMap0.get((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap((int) (byte) 0);
        hashMap14.clear();
        system.testclass.HashMap.Entry[] entryArray16 = hashMap14.table;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        boolean boolean18 = hashMap17.isEmpty();
        int int19 = hashMap17.size();
        java.lang.Object obj21 = hashMap17.get((java.lang.Object) 10);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        hashMap22.clear();
        system.testclass.HashMap.Entry[] entryArray24 = hashMap22.table;
        hashMap17.table = entryArray24;
        hashMap14.table = entryArray24;
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap(0);
        java.lang.Object obj29 = new java.lang.Object();
        java.lang.Object obj30 = hashMap28.remove(obj29);
        java.lang.Object obj32 = hashMap28.get((java.lang.Object) (short) 1);
        boolean boolean33 = hashMap28.isEmpty();
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        boolean boolean35 = hashMap34.isEmpty();
        int int36 = hashMap34.size();
        hashMap34.clear();
        boolean boolean38 = hashMap34.isEmpty();
        hashMap34.clear();
        hashMap34.modCount = (byte) 10;
        system.testclass.HashMap.Entry[] entryArray42 = hashMap34.table;
        java.lang.Object obj43 = hashMap28.get((java.lang.Object) entryArray42);
        hashMap28.modCount = 100;
        java.lang.Object obj46 = hashMap0.put((java.lang.Object) hashMap14, (java.lang.Object) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 100, 100.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 1, (float) 10L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        hashMap1.clear();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap1.table;
        java.lang.Object obj5 = hashMap1.get((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        hashMap8.modCount = 0;
        java.lang.Object obj11 = hashMap7.remove((java.lang.Object) hashMap8);
        system.testclass.HashMap.Entry[] entryArray12 = hashMap8.table;
        hashMap1.table = entryArray12;
        int int14 = hashMap1.modCount;
        hashMap1.modCount = 2;
        hashMap1.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '#', (float) (byte) 1);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap((int) (byte) 0);
        hashMap4.clear();
        system.testclass.HashMap.Entry[] entryArray6 = hashMap4.table;
        java.lang.Object obj8 = hashMap4.get((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        int int11 = hashMap9.size();
        java.lang.Object obj12 = hashMap4.get((java.lang.Object) hashMap9);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap(1);
        system.testclass.HashMap.Entry[] entryArray15 = hashMap14.table;
        hashMap14.clear();
        system.testclass.HashMap.Entry[] entryArray17 = hashMap14.table;
        java.lang.Object obj18 = hashMap2.put(obj12, (java.lang.Object) entryArray17);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        hashMap1.clear();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap1.table;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        int int6 = hashMap4.size();
        java.lang.Object obj8 = hashMap4.get((java.lang.Object) 10);
        java.lang.Object obj9 = hashMap1.remove((java.lang.Object) hashMap4);
        int int10 = hashMap1.modCount;
        boolean boolean11 = hashMap1.isEmpty();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        boolean boolean13 = hashMap12.isEmpty();
        boolean boolean14 = hashMap12.isEmpty();
        int int15 = hashMap12.modCount;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        hashMap16.clear();
        java.lang.Object obj18 = hashMap12.get((java.lang.Object) hashMap16);
        int int19 = hashMap16.size();
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        int int21 = hashMap20.modCount;
        int int22 = hashMap20.modCount;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        boolean boolean24 = hashMap23.isEmpty();
        int int25 = hashMap23.size();
        java.lang.Object obj27 = hashMap23.get((java.lang.Object) 10);
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        hashMap28.clear();
        system.testclass.HashMap.Entry[] entryArray30 = hashMap28.table;
        hashMap23.table = entryArray30;
        hashMap20.table = entryArray30;
        java.lang.Object obj34 = hashMap20.remove((java.lang.Object) 0L);
        java.lang.Object obj35 = hashMap16.get(obj34);
        int int36 = hashMap16.modCount;
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        hashMap39.modCount = 0;
        java.lang.Object obj42 = hashMap38.remove((java.lang.Object) hashMap39);
        system.testclass.HashMap.Entry[] entryArray43 = hashMap39.table;
        system.testclass.HashMap.Entry[] entryArray44 = hashMap39.table;
        system.testclass.HashMap.Entry[] entryArray45 = hashMap39.table;
        int int46 = hashMap39.modCount;
        java.lang.Object obj47 = hashMap1.put((java.lang.Object) int36, (java.lang.Object) int46);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 1);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        int int3 = hashMap2.modCount;
        int int4 = hashMap2.modCount;
        hashMap2.clear();
        java.lang.Object obj7 = hashMap2.remove((java.lang.Object) 10.0f);
        java.lang.Object obj8 = hashMap1.get(obj7);
        int int9 = hashMap1.modCount;
        boolean boolean10 = hashMap1.isEmpty();
        int int11 = hashMap1.modCount;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        int int13 = hashMap12.modCount;
        system.testclass.HashMap.Entry[] entryArray14 = hashMap12.table;
        system.testclass.HashMap.Entry[] entryArray15 = hashMap12.table;
        system.testclass.HashMap.Entry[] entryArray16 = hashMap12.table;
        system.testclass.HashMap.Entry[] entryArray17 = hashMap12.table;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap((int) (short) 10);
        java.lang.Object obj21 = hashMap19.remove((java.lang.Object) (short) -1);
        boolean boolean22 = hashMap19.isEmpty();
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        hashMap23.clear();
        java.lang.Object obj26 = hashMap23.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        boolean boolean28 = hashMap27.isEmpty();
        boolean boolean29 = hashMap27.isEmpty();
        int int30 = hashMap27.modCount;
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        hashMap31.clear();
        java.lang.Object obj33 = hashMap27.get((java.lang.Object) hashMap31);
        java.lang.Object obj34 = hashMap23.remove((java.lang.Object) hashMap31);
        java.lang.Object obj35 = hashMap19.remove((java.lang.Object) hashMap23);
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        boolean boolean37 = hashMap36.isEmpty();
        boolean boolean38 = hashMap36.isEmpty();
        int int39 = hashMap36.modCount;
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        hashMap40.clear();
        java.lang.Object obj42 = hashMap36.get((java.lang.Object) hashMap40);
        int int43 = hashMap40.size();
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap((int) (byte) 0);
        hashMap45.clear();
        system.testclass.HashMap.Entry[] entryArray47 = hashMap45.table;
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap();
        boolean boolean49 = hashMap48.isEmpty();
        int int50 = hashMap48.size();
        java.lang.Object obj52 = hashMap48.get((java.lang.Object) 10);
        java.lang.Object obj53 = hashMap45.remove((java.lang.Object) hashMap48);
        hashMap48.clear();
        java.lang.Object obj55 = hashMap40.get((java.lang.Object) hashMap48);
        system.testclass.HashMap.Entry[] entryArray56 = hashMap48.table;
        java.lang.Object obj57 = hashMap23.remove((java.lang.Object) hashMap48);
        java.lang.Object obj58 = hashMap1.put((java.lang.Object) hashMap12, obj57);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = hashMap1.remove(obj2);
        java.lang.Object obj5 = hashMap1.get((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        hashMap8.modCount = 0;
        java.lang.Object obj11 = hashMap7.remove((java.lang.Object) hashMap8);
        system.testclass.HashMap.Entry[] entryArray12 = hashMap8.table;
        java.lang.Object obj13 = hashMap1.remove((java.lang.Object) hashMap8);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        hashMap14.clear();
        system.testclass.HashMap.Entry[] entryArray16 = hashMap14.table;
        java.lang.Object obj17 = hashMap1.remove((java.lang.Object) hashMap14);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        int int19 = hashMap18.modCount;
        java.lang.Object obj20 = hashMap1.remove((java.lang.Object) hashMap18);
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        int int22 = hashMap21.modCount;
        int int23 = hashMap21.modCount;
        hashMap21.clear();
        hashMap21.clear();
        hashMap21.modCount = (short) 1;
        int int28 = hashMap21.modCount;
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap((int) (short) 0);
        java.lang.Object obj31 = hashMap21.remove((java.lang.Object) hashMap30);
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap((int) (byte) 0);
        hashMap33.clear();
        system.testclass.HashMap.Entry[] entryArray35 = hashMap33.table;
        java.lang.Object obj37 = hashMap33.get((java.lang.Object) (short) 1);
        system.testclass.HashMap.Entry[] entryArray38 = hashMap33.table;
        system.testclass.HashMap.Entry[] entryArray39 = hashMap33.table;
        java.lang.Object obj40 = hashMap18.put((java.lang.Object) hashMap21, (java.lang.Object) entryArray39);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap18", hashMap18.repOK_1());
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        boolean boolean4 = hashMap0.isEmpty();
        hashMap0.clear();
        hashMap0.modCount = (byte) 10;
        system.testclass.HashMap.Entry[] entryArray8 = hashMap0.table;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        boolean boolean12 = hashMap10.isEmpty();
        int int13 = hashMap10.modCount;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        hashMap14.clear();
        java.lang.Object obj16 = hashMap10.get((java.lang.Object) hashMap14);
        int int17 = hashMap14.size();
        java.lang.Object obj18 = hashMap0.put((java.lang.Object) 0.0d, (java.lang.Object) hashMap14);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        hashMap1.clear();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap1.table;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        int int6 = hashMap4.size();
        java.lang.Object obj8 = hashMap4.get((java.lang.Object) 10);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        hashMap9.clear();
        system.testclass.HashMap.Entry[] entryArray11 = hashMap9.table;
        hashMap4.table = entryArray11;
        hashMap1.table = entryArray11;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        boolean boolean15 = hashMap14.isEmpty();
        boolean boolean16 = hashMap14.isEmpty();
        int int17 = hashMap14.modCount;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        hashMap18.clear();
        java.lang.Object obj20 = hashMap14.get((java.lang.Object) hashMap18);
        hashMap14.modCount = 10;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap((int) (byte) 0);
        hashMap24.clear();
        system.testclass.HashMap.Entry[] entryArray26 = hashMap24.table;
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        boolean boolean28 = hashMap27.isEmpty();
        int int29 = hashMap27.size();
        java.lang.Object obj31 = hashMap27.get((java.lang.Object) 10);
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        hashMap32.clear();
        system.testclass.HashMap.Entry[] entryArray34 = hashMap32.table;
        hashMap27.table = entryArray34;
        hashMap24.table = entryArray34;
        java.lang.Object obj37 = hashMap1.put((java.lang.Object) hashMap14, (java.lang.Object) hashMap24);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 1, (float) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        hashMap0.clear();
        hashMap0.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) ' ', (float) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, 1.0f);
        boolean boolean3 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        java.lang.Object obj8 = hashMap5.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap(0);
        java.lang.Object obj11 = new java.lang.Object();
        java.lang.Object obj12 = hashMap10.remove(obj11);
        java.lang.Object obj14 = hashMap10.get((java.lang.Object) (short) 1);
        boolean boolean15 = hashMap10.isEmpty();
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        boolean boolean17 = hashMap16.isEmpty();
        int int18 = hashMap16.size();
        hashMap16.clear();
        boolean boolean20 = hashMap16.isEmpty();
        hashMap16.clear();
        hashMap16.modCount = (byte) 10;
        system.testclass.HashMap.Entry[] entryArray24 = hashMap16.table;
        java.lang.Object obj25 = hashMap10.get((java.lang.Object) entryArray24);
        java.lang.Object obj26 = hashMap5.get((java.lang.Object) entryArray24);
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap((int) (byte) 0);
        hashMap28.clear();
        system.testclass.HashMap.Entry[] entryArray30 = hashMap28.table;
        java.lang.Object obj32 = hashMap28.get((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        int int34 = hashMap33.modCount;
        int int35 = hashMap33.size();
        java.lang.Object obj36 = hashMap28.get((java.lang.Object) hashMap33);
        java.lang.Object obj37 = hashMap5.remove((java.lang.Object) hashMap33);
        java.lang.Object obj38 = null;
        java.lang.Object obj39 = hashMap5.get(obj38);
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap((int) (byte) 0);
        hashMap41.clear();
        system.testclass.HashMap.Entry[] entryArray43 = hashMap41.table;
        java.lang.Object obj45 = hashMap41.get((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap46 = new system.testclass.HashMap();
        boolean boolean47 = hashMap46.isEmpty();
        int int48 = hashMap46.size();
        java.lang.Object obj50 = hashMap46.get((java.lang.Object) 10);
        system.testclass.HashMap hashMap51 = new system.testclass.HashMap();
        hashMap51.clear();
        system.testclass.HashMap.Entry[] entryArray53 = hashMap51.table;
        hashMap46.table = entryArray53;
        hashMap41.table = entryArray53;
        java.lang.Object obj56 = hashMap5.get((java.lang.Object) entryArray53);
        system.testclass.HashMap hashMap57 = new system.testclass.HashMap();
        int int58 = hashMap57.modCount;
        int int59 = hashMap57.modCount;
        system.testclass.HashMap hashMap60 = new system.testclass.HashMap();
        boolean boolean61 = hashMap60.isEmpty();
        int int62 = hashMap60.size();
        java.lang.Object obj64 = hashMap60.get((java.lang.Object) 10);
        system.testclass.HashMap hashMap65 = new system.testclass.HashMap();
        hashMap65.clear();
        system.testclass.HashMap.Entry[] entryArray67 = hashMap65.table;
        hashMap60.table = entryArray67;
        hashMap57.table = entryArray67;
        java.lang.Object obj71 = hashMap57.remove((java.lang.Object) 0L);
        java.lang.Object obj72 = null;
        java.lang.Object obj73 = hashMap57.get(obj72);
        boolean boolean74 = hashMap57.isEmpty();
        java.lang.Object obj75 = hashMap2.put((java.lang.Object) hashMap5, (java.lang.Object) hashMap57);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }
}

