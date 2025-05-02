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
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        java.lang.Object obj4 = hashMap1.put((java.lang.Object) '4', (java.lang.Object) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
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
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        int int3 = hashMap0.size();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        hashMap5.modCount = 0;
        java.lang.Object obj8 = hashMap0.put((java.lang.Object) '#', (java.lang.Object) 0);
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
        hashMap0.clear();
        hashMap0.clear();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap.Entry[] entryArray8 = hashMap7.table;
        hashMap0.table = entryArray8;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        system.testclass.HashMap.Entry[] entryArray6 = hashMap3.table;
        boolean boolean7 = hashMap3.isEmpty();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap.Entry[] entryArray11 = hashMap10.table;
        java.lang.Object obj12 = hashMap3.get((java.lang.Object) entryArray11);
        hashMap0.table = entryArray11;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        int int5 = hashMap3.size();
        hashMap3.clear();
        java.lang.Object obj7 = hashMap2.remove((java.lang.Object) hashMap3);
        hashMap3.clear();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int12 = hashMap11.modCount;
        system.testclass.HashMap.Entry[] entryArray13 = hashMap11.table;
        hashMap3.table = entryArray13;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap3", hashMap3.repOK_1());
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        hashMap0.clear();
        java.lang.Object obj6 = hashMap0.remove((java.lang.Object) 0.0d);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap(0);
        system.testclass.HashMap.Entry[] entryArray9 = hashMap8.table;
        hashMap0.table = entryArray9;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = hashMap0.remove(obj4);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap.Entry[] entryArray9 = hashMap8.table;
        hashMap0.table = entryArray9;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        system.testclass.HashMap.Entry[] entryArray7 = hashMap4.table;
        boolean boolean8 = hashMap4.isEmpty();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap.Entry[] entryArray12 = hashMap11.table;
        java.lang.Object obj13 = hashMap4.get((java.lang.Object) entryArray12);
        hashMap0.table = entryArray12;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        hashMap0.clear();
        java.lang.Object obj6 = hashMap0.remove((java.lang.Object) 0.0d);
        boolean boolean7 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        int int10 = hashMap8.size();
        hashMap8.clear();
        java.lang.Object obj12 = hashMap0.get((java.lang.Object) hashMap8);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int16 = hashMap15.modCount;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap(0, (float) (short) 100);
        java.lang.Object obj20 = hashMap0.put((java.lang.Object) int16, (java.lang.Object) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap(0);
        system.testclass.HashMap.Entry[] entryArray4 = hashMap3.table;
        hashMap0.table = entryArray4;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        java.lang.Object obj4 = hashMap2.get((java.lang.Object) '#');
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        system.testclass.HashMap.Entry[] entryArray8 = hashMap5.table;
        hashMap2.table = entryArray8;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        hashMap3.clear();
        int int7 = hashMap3.modCount;
        system.testclass.HashMap.Entry[] entryArray8 = hashMap3.table;
        hashMap2.table = entryArray8;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        hashMap0.modCount = 'a';
        int int6 = hashMap0.modCount;
        hashMap0.clear();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.modCount;
        int int10 = hashMap8.modCount;
        system.testclass.HashMap.Entry[] entryArray11 = hashMap8.table;
        boolean boolean12 = hashMap8.isEmpty();
        int int13 = hashMap8.modCount;
        int int14 = hashMap8.modCount;
        system.testclass.HashMap.Entry[] entryArray15 = hashMap8.table;
        java.lang.Object obj16 = hashMap0.remove((java.lang.Object) hashMap8);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int20 = hashMap19.modCount;
        system.testclass.HashMap.Entry entry21 = null;
        system.testclass.HashMap.Entry[] entryArray22 = new system.testclass.HashMap.Entry[] { entry21 };
        hashMap19.table = entryArray22;
        hashMap0.table = entryArray22;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        hashMap0.modCount = 'a';
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap((int) (short) 0, (float) (byte) 100);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap.Entry[] entryArray12 = hashMap11.table;
        hashMap8.table = entryArray12;
        hashMap0.table = entryArray12;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        int int3 = hashMap0.size();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) (short) 0, (float) (byte) 100);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap.Entry[] entryArray10 = hashMap9.table;
        hashMap6.table = entryArray10;
        hashMap0.table = entryArray10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        int int6 = hashMap4.size();
        hashMap4.clear();
        int int8 = hashMap4.modCount;
        java.lang.Object obj9 = hashMap0.get((java.lang.Object) hashMap4);
        system.testclass.HashMap.Entry[] entryArray10 = hashMap0.table;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        boolean boolean13 = hashMap12.isEmpty();
        int int14 = hashMap12.size();
        int int15 = hashMap12.size();
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap(0);
        system.testclass.HashMap.Entry[] entryArray18 = hashMap17.table;
        java.lang.Object obj19 = hashMap12.remove((java.lang.Object) hashMap17);
        java.lang.Object obj20 = hashMap0.put((java.lang.Object) ' ', obj19);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        int int3 = hashMap0.size();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) (byte) 0);
        java.lang.Class<?> wildcardClass7 = hashMap6.getClass();
        java.lang.Object obj8 = hashMap0.put((java.lang.Object) 100, (java.lang.Object) hashMap6);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        boolean boolean4 = hashMap0.isEmpty();
        int int5 = hashMap0.modCount;
        int int6 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray7 = hashMap0.table;
        boolean boolean8 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap((int) (short) 0, (float) (byte) 100);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap.Entry[] entryArray15 = hashMap14.table;
        hashMap11.table = entryArray15;
        hashMap0.table = entryArray15;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = (short) 1;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int6 = hashMap5.modCount;
        system.testclass.HashMap.Entry entry7 = null;
        system.testclass.HashMap.Entry[] entryArray8 = new system.testclass.HashMap.Entry[] { entry7 };
        hashMap5.table = entryArray8;
        hashMap0.table = entryArray8;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int7 = hashMap6.modCount;
        system.testclass.HashMap.Entry entry8 = null;
        system.testclass.HashMap.Entry[] entryArray9 = new system.testclass.HashMap.Entry[] { entry8 };
        hashMap6.table = entryArray9;
        hashMap0.table = entryArray9;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(97, 10.0f);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap(0, (float) (short) 100);
        hashMap6.clear();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int11 = hashMap10.modCount;
        java.lang.Class<?> wildcardClass12 = hashMap10.getClass();
        java.lang.Object obj13 = hashMap6.remove((java.lang.Object) wildcardClass12);
        java.lang.Object obj14 = hashMap2.put((java.lang.Object) (-1.0f), obj13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        hashMap3.clear();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        int int9 = hashMap7.size();
        hashMap7.clear();
        int int11 = hashMap7.modCount;
        java.lang.Object obj12 = hashMap3.get((java.lang.Object) hashMap7);
        system.testclass.HashMap.Entry[] entryArray13 = hashMap3.table;
        java.lang.Object obj14 = hashMap2.get((java.lang.Object) hashMap3);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap((int) (byte) 0);
        java.lang.Class<?> wildcardClass19 = hashMap18.getClass();
        java.lang.Object obj20 = hashMap16.get((java.lang.Object) hashMap18);
        hashMap16.clear();
        system.testclass.HashMap.Entry[] entryArray22 = hashMap16.table;
        hashMap2.table = entryArray22;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        system.testclass.HashMap.Entry[] entryArray2 = hashMap1.table;
        boolean boolean3 = hashMap1.isEmpty();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        boolean boolean6 = hashMap5.isEmpty();
        int int7 = hashMap5.size();
        hashMap5.clear();
        hashMap5.modCount = 'a';
        int int11 = hashMap5.modCount;
        hashMap5.clear();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        system.testclass.HashMap.Entry[] entryArray16 = hashMap13.table;
        boolean boolean17 = hashMap13.isEmpty();
        int int18 = hashMap13.modCount;
        int int19 = hashMap13.modCount;
        system.testclass.HashMap.Entry[] entryArray20 = hashMap13.table;
        java.lang.Object obj21 = hashMap5.remove((java.lang.Object) hashMap13);
        java.lang.Object obj22 = hashMap1.put((java.lang.Object) 'a', obj21);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        int int4 = hashMap0.modCount;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap(0, (float) (short) 100);
        hashMap7.clear();
        java.lang.Object obj9 = hashMap0.remove((java.lang.Object) hashMap7);
        system.testclass.HashMap.Entry[] entryArray10 = hashMap0.table;
        int int11 = hashMap0.modCount;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        boolean boolean16 = hashMap15.isEmpty();
        int int17 = hashMap15.size();
        hashMap15.clear();
        java.lang.Object obj19 = hashMap14.remove((java.lang.Object) hashMap15);
        int int20 = hashMap14.size();
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int24 = hashMap23.modCount;
        system.testclass.HashMap.Entry[] entryArray25 = hashMap23.table;
        hashMap14.table = entryArray25;
        java.lang.Object obj28 = hashMap0.put((java.lang.Object) hashMap14, (java.lang.Object) 97);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        boolean boolean4 = hashMap0.isEmpty();
        int int5 = hashMap0.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int9 = hashMap8.modCount;
        system.testclass.HashMap.Entry entry10 = null;
        system.testclass.HashMap.Entry[] entryArray11 = new system.testclass.HashMap.Entry[] { entry10 };
        hashMap8.table = entryArray11;
        hashMap0.table = entryArray11;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        int int2 = hashMap1.modCount;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        int int5 = hashMap3.size();
        system.testclass.HashMap.Entry[] entryArray6 = hashMap3.table;
        java.lang.Object obj7 = hashMap1.remove((java.lang.Object) entryArray6);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.modCount;
        int int10 = hashMap8.modCount;
        system.testclass.HashMap.Entry[] entryArray11 = hashMap8.table;
        hashMap8.clear();
        boolean boolean13 = hashMap8.isEmpty();
        int int14 = hashMap8.size();
        java.lang.Object obj16 = hashMap1.put((java.lang.Object) hashMap8, (java.lang.Object) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(97);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap((int) (byte) 0);
        int int4 = hashMap3.modCount;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        boolean boolean6 = hashMap5.isEmpty();
        int int7 = hashMap5.size();
        system.testclass.HashMap.Entry[] entryArray8 = hashMap5.table;
        java.lang.Object obj9 = hashMap3.remove((java.lang.Object) entryArray8);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        int int12 = hashMap10.size();
        int int13 = hashMap10.size();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.modCount;
        int int16 = hashMap14.modCount;
        system.testclass.HashMap.Entry[] entryArray17 = hashMap14.table;
        hashMap14.clear();
        java.lang.Object obj20 = hashMap14.remove((java.lang.Object) 0.0d);
        java.lang.Object obj22 = hashMap14.remove((java.lang.Object) (short) 0);
        int int23 = hashMap14.size();
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap((int) (byte) 0);
        int int26 = hashMap25.modCount;
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        boolean boolean28 = hashMap27.isEmpty();
        int int29 = hashMap27.size();
        system.testclass.HashMap.Entry[] entryArray30 = hashMap27.table;
        java.lang.Object obj31 = hashMap25.remove((java.lang.Object) entryArray30);
        hashMap14.table = entryArray30;
        java.lang.Object obj33 = hashMap10.get((java.lang.Object) hashMap14);
        java.lang.Object obj34 = hashMap1.put((java.lang.Object) hashMap3, obj33);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(1);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        int int3 = hashMap2.modCount;
        int int4 = hashMap2.modCount;
        hashMap2.clear();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        int int8 = hashMap6.size();
        hashMap6.clear();
        int int10 = hashMap6.modCount;
        java.lang.Object obj11 = hashMap2.get((java.lang.Object) hashMap6);
        system.testclass.HashMap.Entry[] entryArray12 = hashMap2.table;
        hashMap1.table = entryArray12;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int3 = hashMap2.modCount;
        system.testclass.HashMap.Entry entry4 = null;
        system.testclass.HashMap.Entry[] entryArray5 = new system.testclass.HashMap.Entry[] { entry4 };
        hashMap2.table = entryArray5;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        int int9 = hashMap7.modCount;
        hashMap7.clear();
        hashMap7.clear();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap((int) (byte) 0);
        int int14 = hashMap13.modCount;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        boolean boolean16 = hashMap15.isEmpty();
        int int17 = hashMap15.size();
        system.testclass.HashMap.Entry[] entryArray18 = hashMap15.table;
        java.lang.Object obj19 = hashMap13.remove((java.lang.Object) entryArray18);
        java.lang.Object obj20 = hashMap7.remove((java.lang.Object) entryArray18);
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        int int22 = hashMap21.modCount;
        int int23 = hashMap21.modCount;
        system.testclass.HashMap.Entry[] entryArray24 = hashMap21.table;
        java.lang.Object obj25 = hashMap7.remove((java.lang.Object) entryArray24);
        hashMap2.table = entryArray24;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 0, (float) 1L);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int6 = hashMap5.modCount;
        hashMap5.modCount = 97;
        hashMap5.clear();
        java.lang.Object obj11 = hashMap5.remove((java.lang.Object) "hi!");
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap((int) (short) 10);
        hashMap13.modCount = 10;
        java.lang.Object obj16 = hashMap2.put(obj11, (java.lang.Object) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        int int3 = hashMap0.size();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap(0);
        system.testclass.HashMap.Entry[] entryArray6 = hashMap5.table;
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) hashMap5);
        hashMap0.modCount = (byte) 0;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.modCount;
        int int12 = hashMap10.modCount;
        system.testclass.HashMap.Entry[] entryArray13 = hashMap10.table;
        boolean boolean14 = hashMap10.isEmpty();
        int int15 = hashMap10.modCount;
        int int16 = hashMap10.modCount;
        system.testclass.HashMap.Entry[] entryArray17 = hashMap10.table;
        boolean boolean18 = hashMap10.isEmpty();
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        boolean boolean20 = hashMap19.isEmpty();
        int int21 = hashMap19.size();
        hashMap19.clear();
        int int23 = hashMap19.modCount;
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap((int) (byte) 0);
        java.lang.Class<?> wildcardClass28 = hashMap27.getClass();
        java.lang.Object obj29 = hashMap25.get((java.lang.Object) hashMap27);
        hashMap25.clear();
        system.testclass.HashMap.Entry[] entryArray31 = hashMap25.table;
        java.lang.Object obj32 = hashMap10.put((java.lang.Object) hashMap19, (java.lang.Object) entryArray31);
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        int int34 = hashMap33.modCount;
        int int35 = hashMap33.modCount;
        system.testclass.HashMap.Entry[] entryArray36 = hashMap33.table;
        boolean boolean37 = hashMap33.isEmpty();
        int int38 = hashMap33.modCount;
        int int39 = hashMap33.modCount;
        system.testclass.HashMap.Entry[] entryArray40 = hashMap33.table;
        boolean boolean41 = hashMap33.isEmpty();
        java.lang.Object obj42 = hashMap0.put(obj32, (java.lang.Object) hashMap33);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap.Entry[] entryArray3 = new system.testclass.HashMap.Entry[] {};
        hashMap2.table = entryArray3;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        int int6 = hashMap4.size();
        hashMap4.clear();
        int int8 = hashMap4.modCount;
        java.lang.Object obj9 = hashMap0.get((java.lang.Object) hashMap4);
        system.testclass.HashMap.Entry[] entryArray10 = hashMap0.table;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        int int13 = hashMap11.modCount;
        hashMap11.modCount = '#';
        int int16 = hashMap11.size();
        java.lang.Object obj18 = hashMap0.put((java.lang.Object) hashMap11, (java.lang.Object) 1L);
        int int19 = hashMap0.modCount;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        int int5 = hashMap3.size();
        hashMap3.clear();
        java.lang.Object obj7 = hashMap2.remove((java.lang.Object) hashMap3);
        int int8 = hashMap2.size();
        system.testclass.HashMap.Entry[] entryArray9 = hashMap2.table;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap((int) (byte) 0);
        int int12 = hashMap11.modCount;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        hashMap13.modCount = 0;
        hashMap13.clear();
        java.lang.Object obj17 = hashMap11.get((java.lang.Object) hashMap13);
        system.testclass.HashMap.Entry[] entryArray18 = hashMap11.table;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap((int) '4', (float) 10L);
        java.lang.Object obj22 = hashMap2.put((java.lang.Object) entryArray18, (java.lang.Object) 10L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap((int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = hashMap3.getClass();
        java.lang.Object obj5 = hashMap1.get((java.lang.Object) hashMap3);
        hashMap1.clear();
        int int7 = hashMap1.size();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        int int10 = hashMap8.size();
        int int11 = hashMap8.size();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        int int13 = hashMap12.modCount;
        int int14 = hashMap12.modCount;
        system.testclass.HashMap.Entry[] entryArray15 = hashMap12.table;
        hashMap12.clear();
        java.lang.Object obj18 = hashMap12.remove((java.lang.Object) 0.0d);
        java.lang.Object obj20 = hashMap12.remove((java.lang.Object) (short) 0);
        int int21 = hashMap12.size();
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap((int) (byte) 0);
        int int24 = hashMap23.modCount;
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        boolean boolean26 = hashMap25.isEmpty();
        int int27 = hashMap25.size();
        system.testclass.HashMap.Entry[] entryArray28 = hashMap25.table;
        java.lang.Object obj29 = hashMap23.remove((java.lang.Object) entryArray28);
        hashMap12.table = entryArray28;
        java.lang.Object obj31 = hashMap8.get((java.lang.Object) hashMap12);
        java.lang.Class<?> wildcardClass32 = hashMap12.getClass();
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int36 = hashMap35.modCount;
        java.lang.Object obj37 = hashMap1.put((java.lang.Object) hashMap12, (java.lang.Object) int36);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap.Entry[] entryArray3 = hashMap2.table;
        java.lang.Object obj5 = hashMap2.get((java.lang.Object) (short) 1);
        hashMap2.modCount = ' ';
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        int int10 = hashMap8.size();
        int int11 = hashMap8.size();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        int int13 = hashMap12.modCount;
        int int14 = hashMap12.modCount;
        system.testclass.HashMap.Entry[] entryArray15 = hashMap12.table;
        hashMap12.clear();
        java.lang.Object obj18 = hashMap12.remove((java.lang.Object) 0.0d);
        java.lang.Object obj20 = hashMap12.remove((java.lang.Object) (short) 0);
        int int21 = hashMap12.size();
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap((int) (byte) 0);
        int int24 = hashMap23.modCount;
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        boolean boolean26 = hashMap25.isEmpty();
        int int27 = hashMap25.size();
        system.testclass.HashMap.Entry[] entryArray28 = hashMap25.table;
        java.lang.Object obj29 = hashMap23.remove((java.lang.Object) entryArray28);
        hashMap12.table = entryArray28;
        java.lang.Object obj31 = hashMap8.get((java.lang.Object) hashMap12);
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap((int) (byte) 10, (float) (short) 1);
        java.lang.Object obj35 = hashMap12.remove((java.lang.Object) (byte) 10);
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        boolean boolean37 = hashMap36.isEmpty();
        int int38 = hashMap36.size();
        int int39 = hashMap36.size();
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap(0);
        system.testclass.HashMap.Entry[] entryArray42 = hashMap41.table;
        java.lang.Object obj43 = hashMap36.remove((java.lang.Object) hashMap41);
        hashMap36.modCount = (byte) 0;
        java.lang.Object obj46 = hashMap2.put((java.lang.Object) (byte) 10, (java.lang.Object) hashMap36);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int3 = hashMap2.modCount;
        hashMap2.modCount = 97;
        hashMap2.clear();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int10 = hashMap9.modCount;
        hashMap9.modCount = 97;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        boolean boolean14 = hashMap13.isEmpty();
        int int15 = hashMap13.size();
        system.testclass.HashMap.Entry[] entryArray16 = hashMap13.table;
        java.lang.Object obj17 = hashMap9.get((java.lang.Object) entryArray16);
        hashMap2.table = entryArray16;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        hashMap0.clear();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) (byte) 0);
        int int7 = hashMap6.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        int int10 = hashMap8.size();
        system.testclass.HashMap.Entry[] entryArray11 = hashMap8.table;
        java.lang.Object obj12 = hashMap6.remove((java.lang.Object) entryArray11);
        java.lang.Object obj13 = hashMap0.remove((java.lang.Object) entryArray11);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        boolean boolean18 = hashMap17.isEmpty();
        int int19 = hashMap17.size();
        hashMap17.clear();
        java.lang.Object obj21 = hashMap16.remove((java.lang.Object) hashMap17);
        int int22 = hashMap16.size();
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int26 = hashMap25.modCount;
        system.testclass.HashMap.Entry[] entryArray27 = hashMap25.table;
        hashMap16.table = entryArray27;
        hashMap0.table = entryArray27;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        int int2 = hashMap1.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap1.table;
        hashMap1.modCount = 100;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap((int) (short) 0, (float) (byte) 100);
        java.lang.Object obj10 = hashMap1.put((java.lang.Object) (byte) 100, (java.lang.Object) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (short) 100);
        hashMap2.clear();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int7 = hashMap6.modCount;
        java.lang.Class<?> wildcardClass8 = hashMap6.getClass();
        java.lang.Object obj9 = hashMap2.remove((java.lang.Object) wildcardClass8);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int13 = hashMap12.modCount;
        hashMap12.modCount = 97;
        hashMap12.clear();
        java.lang.Object obj18 = hashMap12.remove((java.lang.Object) "hi!");
        boolean boolean19 = hashMap12.isEmpty();
        java.lang.Object obj21 = hashMap12.get((java.lang.Object) 100L);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        boolean boolean23 = hashMap22.isEmpty();
        int int24 = hashMap22.size();
        system.testclass.HashMap.Entry[] entryArray25 = hashMap22.table;
        int int26 = hashMap22.modCount;
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap((int) (byte) 0);
        int int29 = hashMap28.modCount;
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        boolean boolean31 = hashMap30.isEmpty();
        int int32 = hashMap30.size();
        system.testclass.HashMap.Entry[] entryArray33 = hashMap30.table;
        java.lang.Object obj34 = hashMap28.remove((java.lang.Object) entryArray33);
        hashMap22.table = entryArray33;
        java.lang.Object obj36 = hashMap2.put((java.lang.Object) 100L, (java.lang.Object) entryArray33);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        int int3 = hashMap0.size();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap(0);
        system.testclass.HashMap.Entry[] entryArray6 = hashMap5.table;
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) hashMap5);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap(0, (float) (short) 100);
        hashMap10.clear();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        int int13 = hashMap12.modCount;
        int int14 = hashMap12.modCount;
        system.testclass.HashMap.Entry[] entryArray15 = hashMap12.table;
        boolean boolean16 = hashMap12.isEmpty();
        int int17 = hashMap12.modCount;
        int int18 = hashMap12.modCount;
        system.testclass.HashMap.Entry[] entryArray19 = hashMap12.table;
        java.lang.Object obj20 = hashMap0.put((java.lang.Object) hashMap10, (java.lang.Object) hashMap12);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        int int4 = hashMap0.modCount;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap(0, (float) (short) 100);
        hashMap7.clear();
        java.lang.Object obj9 = hashMap0.remove((java.lang.Object) hashMap7);
        system.testclass.HashMap.Entry[] entryArray10 = hashMap0.table;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        int int13 = hashMap11.modCount;
        hashMap11.clear();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        boolean boolean16 = hashMap15.isEmpty();
        int int17 = hashMap15.size();
        hashMap15.clear();
        int int19 = hashMap15.modCount;
        java.lang.Object obj20 = hashMap11.get((java.lang.Object) hashMap15);
        system.testclass.HashMap.Entry[] entryArray21 = hashMap11.table;
        hashMap0.table = entryArray21;
        java.lang.Object obj24 = hashMap0.remove((java.lang.Object) 1);
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap((int) (byte) 1);
        hashMap26.clear();
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        boolean boolean29 = hashMap28.isEmpty();
        int int30 = hashMap28.size();
        int int31 = hashMap28.size();
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap(0);
        system.testclass.HashMap.Entry[] entryArray34 = hashMap33.table;
        java.lang.Object obj35 = hashMap28.remove((java.lang.Object) hashMap33);
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap.Entry[] entryArray39 = hashMap38.table;
        hashMap38.clear();
        java.lang.Object obj41 = hashMap28.get((java.lang.Object) hashMap38);
        java.lang.Object obj42 = hashMap26.get(obj41);
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap hashMap46 = new system.testclass.HashMap((int) (byte) 0);
        java.lang.Class<?> wildcardClass47 = hashMap46.getClass();
        java.lang.Object obj48 = hashMap44.get((java.lang.Object) hashMap46);
        hashMap44.clear();
        system.testclass.HashMap.Entry[] entryArray50 = hashMap44.table;
        java.lang.Object obj51 = hashMap0.put(obj42, (java.lang.Object) entryArray50);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        int int3 = hashMap0.size();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap(0);
        system.testclass.HashMap.Entry[] entryArray6 = hashMap5.table;
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) hashMap5);
        hashMap0.modCount = (byte) 0;
        system.testclass.HashMap.Entry[] entryArray10 = new system.testclass.HashMap.Entry[] {};
        hashMap0.table = entryArray10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) ' ', (float) 1);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        int int5 = hashMap3.size();
        system.testclass.HashMap.Entry[] entryArray6 = hashMap3.table;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        hashMap7.modCount = 0;
        hashMap7.clear();
        java.lang.Object obj11 = hashMap3.remove((java.lang.Object) hashMap7);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        boolean boolean16 = hashMap15.isEmpty();
        int int17 = hashMap15.size();
        hashMap15.clear();
        java.lang.Object obj19 = hashMap14.remove((java.lang.Object) hashMap15);
        java.lang.Object obj21 = hashMap14.get((java.lang.Object) true);
        system.testclass.HashMap.Entry[] entryArray22 = hashMap14.table;
        int int23 = hashMap14.modCount;
        java.lang.Object obj24 = hashMap2.put((java.lang.Object) hashMap3, (java.lang.Object) int23);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(10);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int5 = hashMap4.modCount;
        system.testclass.HashMap.Entry entry6 = null;
        system.testclass.HashMap.Entry[] entryArray7 = new system.testclass.HashMap.Entry[] { entry6 };
        hashMap4.table = entryArray7;
        hashMap1.table = entryArray7;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 10);
        boolean boolean2 = hashMap1.isEmpty();
        int int3 = hashMap1.size();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        system.testclass.HashMap.Entry[] entryArray7 = hashMap4.table;
        hashMap4.clear();
        java.lang.Object obj10 = hashMap4.remove((java.lang.Object) 0.0d);
        boolean boolean11 = hashMap4.isEmpty();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        boolean boolean13 = hashMap12.isEmpty();
        int int14 = hashMap12.size();
        hashMap12.clear();
        java.lang.Object obj16 = hashMap4.get((java.lang.Object) hashMap12);
        boolean boolean17 = hashMap12.isEmpty();
        int int18 = hashMap12.modCount;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        int int20 = hashMap19.modCount;
        int int21 = hashMap19.modCount;
        system.testclass.HashMap.Entry[] entryArray22 = hashMap19.table;
        hashMap19.clear();
        java.lang.Object obj25 = hashMap19.remove((java.lang.Object) 0.0d);
        java.lang.Object obj27 = hashMap19.remove((java.lang.Object) (short) 0);
        int int28 = hashMap19.size();
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap((int) (byte) 0);
        int int31 = hashMap30.modCount;
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        boolean boolean33 = hashMap32.isEmpty();
        int int34 = hashMap32.size();
        system.testclass.HashMap.Entry[] entryArray35 = hashMap32.table;
        java.lang.Object obj36 = hashMap30.remove((java.lang.Object) entryArray35);
        hashMap19.table = entryArray35;
        hashMap12.table = entryArray35;
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        boolean boolean40 = hashMap39.isEmpty();
        int int41 = hashMap39.size();
        hashMap39.clear();
        hashMap39.modCount = 'a';
        java.lang.Object obj45 = hashMap1.put((java.lang.Object) hashMap12, (java.lang.Object) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(97);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        int int3 = hashMap2.modCount;
        int int4 = hashMap2.modCount;
        system.testclass.HashMap.Entry[] entryArray5 = hashMap2.table;
        boolean boolean6 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap.Entry[] entryArray10 = hashMap9.table;
        java.lang.Object obj11 = hashMap2.get((java.lang.Object) entryArray10);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        int int13 = hashMap12.modCount;
        int int14 = hashMap12.modCount;
        system.testclass.HashMap.Entry[] entryArray15 = hashMap12.table;
        boolean boolean16 = hashMap12.isEmpty();
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap.Entry[] entryArray20 = hashMap19.table;
        java.lang.Object obj21 = hashMap12.get((java.lang.Object) entryArray20);
        hashMap12.modCount = 1;
        java.lang.Object obj24 = hashMap1.put(obj11, (java.lang.Object) hashMap12);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 10, (float) (short) 1);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        system.testclass.HashMap.Entry[] entryArray6 = hashMap3.table;
        hashMap3.clear();
        java.lang.Object obj9 = hashMap3.remove((java.lang.Object) 0.0d);
        hashMap3.clear();
        system.testclass.HashMap.Entry[] entryArray11 = hashMap3.table;
        hashMap3.clear();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        boolean boolean14 = hashMap13.isEmpty();
        int int15 = hashMap13.size();
        system.testclass.HashMap.Entry[] entryArray16 = hashMap13.table;
        hashMap13.modCount = (short) 1;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        boolean boolean20 = hashMap19.isEmpty();
        int int21 = hashMap19.size();
        system.testclass.HashMap.Entry[] entryArray22 = hashMap19.table;
        hashMap13.table = entryArray22;
        hashMap13.clear();
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap((int) (byte) 1);
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap.Entry[] entryArray30 = hashMap29.table;
        java.lang.Object obj32 = hashMap29.get((java.lang.Object) (short) 1);
        hashMap29.modCount = ' ';
        int int35 = hashMap29.modCount;
        java.lang.Object obj36 = hashMap26.remove((java.lang.Object) hashMap29);
        java.lang.Object obj37 = hashMap13.remove((java.lang.Object) hashMap26);
        java.lang.Object obj38 = hashMap2.put((java.lang.Object) hashMap3, (java.lang.Object) hashMap26);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        hashMap3.clear();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        int int9 = hashMap7.size();
        hashMap7.clear();
        int int11 = hashMap7.modCount;
        java.lang.Object obj12 = hashMap3.get((java.lang.Object) hashMap7);
        system.testclass.HashMap.Entry[] entryArray13 = hashMap3.table;
        java.lang.Object obj14 = hashMap2.get((java.lang.Object) hashMap3);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap((int) (byte) 10, (float) 100L);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap((int) 'a');
        int int20 = hashMap19.size();
        hashMap19.modCount = 35;
        java.lang.Object obj23 = hashMap2.put((java.lang.Object) (byte) 10, (java.lang.Object) 35);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        hashMap0.clear();
        java.lang.Object obj6 = hashMap0.remove((java.lang.Object) 0.0d);
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) (short) 0);
        int int9 = hashMap0.size();
        int int10 = hashMap0.size();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        boolean boolean16 = hashMap15.isEmpty();
        int int17 = hashMap15.size();
        hashMap15.clear();
        java.lang.Object obj19 = hashMap14.remove((java.lang.Object) hashMap15);
        int int20 = hashMap14.size();
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int24 = hashMap23.modCount;
        system.testclass.HashMap.Entry[] entryArray25 = hashMap23.table;
        hashMap14.table = entryArray25;
        int int27 = hashMap14.size();
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap((int) (byte) 0);
        int int30 = hashMap29.modCount;
        system.testclass.HashMap.Entry[] entryArray31 = hashMap29.table;
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        int int33 = hashMap32.modCount;
        int int34 = hashMap32.modCount;
        system.testclass.HashMap.Entry[] entryArray35 = hashMap32.table;
        hashMap32.clear();
        java.lang.Object obj38 = hashMap32.remove((java.lang.Object) 0.0d);
        java.lang.Object obj39 = hashMap14.put((java.lang.Object) entryArray31, (java.lang.Object) hashMap32);
        java.lang.Object obj40 = hashMap0.put((java.lang.Object) "hi!", (java.lang.Object) hashMap32);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        boolean boolean4 = hashMap0.isEmpty();
        int int5 = hashMap0.modCount;
        int int6 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray7 = hashMap0.table;
        boolean boolean8 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        int int11 = hashMap9.size();
        hashMap9.clear();
        int int13 = hashMap9.modCount;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap((int) (byte) 0);
        java.lang.Class<?> wildcardClass18 = hashMap17.getClass();
        java.lang.Object obj19 = hashMap15.get((java.lang.Object) hashMap17);
        hashMap15.clear();
        system.testclass.HashMap.Entry[] entryArray21 = hashMap15.table;
        java.lang.Object obj22 = hashMap0.put((java.lang.Object) hashMap9, (java.lang.Object) entryArray21);
        system.testclass.HashMap.Entry[] entryArray23 = hashMap0.table;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 1);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        int int3 = hashMap2.modCount;
        int int4 = hashMap2.modCount;
        system.testclass.HashMap.Entry[] entryArray5 = hashMap2.table;
        boolean boolean6 = hashMap2.isEmpty();
        int int7 = hashMap2.modCount;
        int int8 = hashMap2.modCount;
        system.testclass.HashMap.Entry[] entryArray9 = hashMap2.table;
        boolean boolean10 = hashMap2.isEmpty();
        boolean boolean11 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        boolean boolean13 = hashMap12.isEmpty();
        int int14 = hashMap12.size();
        int int15 = hashMap12.size();
        java.lang.Object obj16 = hashMap1.put((java.lang.Object) hashMap2, (java.lang.Object) int15);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        boolean boolean4 = hashMap0.isEmpty();
        int int5 = hashMap0.modCount;
        int int6 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray7 = hashMap0.table;
        boolean boolean8 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        int int11 = hashMap9.size();
        hashMap9.clear();
        int int13 = hashMap9.modCount;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap((int) (byte) 0);
        java.lang.Class<?> wildcardClass18 = hashMap17.getClass();
        java.lang.Object obj19 = hashMap15.get((java.lang.Object) hashMap17);
        hashMap15.clear();
        system.testclass.HashMap.Entry[] entryArray21 = hashMap15.table;
        java.lang.Object obj22 = hashMap0.put((java.lang.Object) hashMap9, (java.lang.Object) entryArray21);
        boolean boolean23 = hashMap9.isEmpty();
        system.testclass.HashMap.Entry[] entryArray24 = hashMap9.table;
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        boolean boolean29 = hashMap28.isEmpty();
        int int30 = hashMap28.size();
        hashMap28.clear();
        java.lang.Object obj32 = hashMap27.remove((java.lang.Object) hashMap28);
        int int33 = hashMap27.size();
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int37 = hashMap36.modCount;
        system.testclass.HashMap.Entry[] entryArray38 = hashMap36.table;
        hashMap27.table = entryArray38;
        hashMap9.table = entryArray38;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap9", hashMap9.repOK_1());
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        int int6 = hashMap4.size();
        hashMap4.clear();
        java.lang.Object obj8 = hashMap3.remove((java.lang.Object) hashMap4);
        java.lang.Object obj10 = hashMap3.get((java.lang.Object) true);
        system.testclass.HashMap.Entry[] entryArray11 = hashMap3.table;
        hashMap0.table = entryArray11;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int3 = hashMap2.modCount;
        system.testclass.HashMap.Entry[] entryArray4 = hashMap2.table;
        hashMap2.modCount = (byte) -1;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) (byte) 0);
        java.lang.Class<?> wildcardClass11 = hashMap10.getClass();
        java.lang.Object obj12 = hashMap8.get((java.lang.Object) hashMap10);
        java.lang.Object obj13 = hashMap2.get(obj12);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.modCount;
        int int16 = hashMap14.modCount;
        system.testclass.HashMap.Entry[] entryArray17 = hashMap14.table;
        boolean boolean18 = hashMap14.isEmpty();
        int int19 = hashMap14.modCount;
        int int20 = hashMap14.modCount;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        boolean boolean22 = hashMap21.isEmpty();
        int int23 = hashMap21.size();
        hashMap21.clear();
        hashMap21.clear();
        java.lang.Class<?> wildcardClass26 = hashMap21.getClass();
        java.lang.Object obj27 = hashMap14.remove((java.lang.Object) wildcardClass26);
        java.lang.Object obj29 = hashMap2.put((java.lang.Object) hashMap14, (java.lang.Object) 100L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 10);
        hashMap1.modCount = 97;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) '4', (float) 10L);
        java.lang.Class<?> wildcardClass7 = hashMap6.getClass();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap((int) (byte) 0);
        java.lang.Class<?> wildcardClass12 = hashMap11.getClass();
        java.lang.Object obj13 = hashMap9.get((java.lang.Object) hashMap11);
        hashMap9.clear();
        int int15 = hashMap9.size();
        java.lang.Object obj16 = hashMap1.put((java.lang.Object) wildcardClass7, (java.lang.Object) int15);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        int int3 = hashMap0.size();
        hashMap0.modCount = '#';
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap(0, (float) 10L);
        hashMap8.clear();
        hashMap8.clear();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        java.lang.Object obj15 = hashMap13.get((java.lang.Object) '#');
        java.lang.Object obj16 = hashMap0.put((java.lang.Object) hashMap8, (java.lang.Object) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        hashMap0.clear();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) (byte) 0);
        int int7 = hashMap6.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        int int10 = hashMap8.size();
        system.testclass.HashMap.Entry[] entryArray11 = hashMap8.table;
        java.lang.Object obj12 = hashMap6.remove((java.lang.Object) entryArray11);
        java.lang.Object obj13 = hashMap0.remove((java.lang.Object) entryArray11);
        system.testclass.HashMap.Entry[] entryArray14 = hashMap0.table;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        boolean boolean16 = hashMap15.isEmpty();
        int int17 = hashMap15.size();
        hashMap15.clear();
        int int19 = hashMap15.modCount;
        system.testclass.HashMap.Entry[] entryArray20 = hashMap15.table;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        boolean boolean25 = hashMap24.isEmpty();
        int int26 = hashMap24.size();
        hashMap24.clear();
        java.lang.Object obj28 = hashMap23.remove((java.lang.Object) hashMap24);
        boolean boolean29 = hashMap24.isEmpty();
        java.lang.Object obj30 = hashMap0.put((java.lang.Object) hashMap15, (java.lang.Object) hashMap24);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        int int5 = hashMap3.size();
        hashMap3.clear();
        hashMap3.modCount = 'a';
        hashMap3.clear();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        int int12 = hashMap10.size();
        hashMap10.clear();
        int int14 = hashMap10.modCount;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap(0, (float) (short) 100);
        hashMap17.clear();
        java.lang.Object obj19 = hashMap10.remove((java.lang.Object) hashMap17);
        system.testclass.HashMap.Entry[] entryArray20 = hashMap10.table;
        int int21 = hashMap10.modCount;
        int int22 = hashMap10.size();
        system.testclass.HashMap.Entry[] entryArray23 = hashMap10.table;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.modCount;
        int int26 = hashMap24.modCount;
        hashMap24.clear();
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        boolean boolean29 = hashMap28.isEmpty();
        int int30 = hashMap28.size();
        hashMap28.clear();
        int int32 = hashMap28.modCount;
        java.lang.Object obj33 = hashMap24.get((java.lang.Object) hashMap28);
        system.testclass.HashMap.Entry[] entryArray34 = hashMap24.table;
        hashMap10.table = entryArray34;
        java.lang.Object obj36 = hashMap2.put((java.lang.Object) hashMap3, (java.lang.Object) hashMap10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(1, (float) 52);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        int int8 = hashMap6.size();
        hashMap6.clear();
        java.lang.Object obj10 = hashMap5.remove((java.lang.Object) hashMap6);
        int int11 = hashMap5.size();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int15 = hashMap14.modCount;
        system.testclass.HashMap.Entry[] entryArray16 = hashMap14.table;
        hashMap5.table = entryArray16;
        int int18 = hashMap5.size();
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap((int) (byte) 0);
        int int21 = hashMap20.modCount;
        system.testclass.HashMap.Entry[] entryArray22 = hashMap20.table;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        int int24 = hashMap23.modCount;
        int int25 = hashMap23.modCount;
        system.testclass.HashMap.Entry[] entryArray26 = hashMap23.table;
        hashMap23.clear();
        java.lang.Object obj29 = hashMap23.remove((java.lang.Object) 0.0d);
        java.lang.Object obj30 = hashMap5.put((java.lang.Object) entryArray22, (java.lang.Object) hashMap23);
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        int int32 = hashMap31.modCount;
        int int33 = hashMap31.modCount;
        system.testclass.HashMap.Entry[] entryArray34 = hashMap31.table;
        hashMap31.clear();
        java.lang.Object obj37 = hashMap31.remove((java.lang.Object) 0.0d);
        java.lang.Object obj39 = hashMap31.remove((java.lang.Object) (short) 0);
        int int40 = hashMap31.size();
        int int41 = hashMap31.modCount;
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap((int) (byte) 0);
        int int44 = hashMap43.modCount;
        system.testclass.HashMap.Entry[] entryArray45 = hashMap43.table;
        java.lang.Object obj46 = hashMap31.remove((java.lang.Object) hashMap43);
        java.lang.Object obj47 = hashMap2.put((java.lang.Object) hashMap23, obj46);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        int int5 = hashMap3.size();
        hashMap3.clear();
        java.lang.Object obj7 = hashMap2.remove((java.lang.Object) hashMap3);
        java.lang.Object obj9 = hashMap2.get((java.lang.Object) true);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap(52, (float) (short) 10);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        system.testclass.HashMap.Entry[] entryArray16 = hashMap13.table;
        hashMap13.clear();
        java.lang.Object obj19 = hashMap13.remove((java.lang.Object) 0.0d);
        java.lang.Object obj21 = hashMap13.remove((java.lang.Object) (short) 0);
        int int22 = hashMap13.size();
        int int23 = hashMap13.modCount;
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap((int) (byte) 0);
        int int26 = hashMap25.modCount;
        system.testclass.HashMap.Entry[] entryArray27 = hashMap25.table;
        java.lang.Object obj28 = hashMap13.remove((java.lang.Object) hashMap25);
        hashMap13.modCount = 10;
        java.lang.Object obj31 = hashMap2.put((java.lang.Object) hashMap12, (java.lang.Object) hashMap13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        system.testclass.HashMap.Entry[] entryArray2 = hashMap1.table;
        boolean boolean3 = hashMap1.isEmpty();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        int int11 = hashMap9.size();
        hashMap9.clear();
        java.lang.Object obj13 = hashMap8.remove((java.lang.Object) hashMap9);
        hashMap9.clear();
        java.lang.Object obj15 = hashMap5.get((java.lang.Object) hashMap9);
        system.testclass.HashMap.Entry[] entryArray16 = hashMap9.table;
        hashMap1.table = entryArray16;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        hashMap2.clear();
        hashMap2.clear();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        boolean boolean6 = hashMap5.isEmpty();
        int int7 = hashMap5.size();
        hashMap5.clear();
        int int9 = hashMap5.modCount;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap(0, (float) (short) 100);
        hashMap12.clear();
        java.lang.Object obj14 = hashMap5.remove((java.lang.Object) hashMap12);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        boolean boolean19 = hashMap18.isEmpty();
        int int20 = hashMap18.size();
        hashMap18.clear();
        java.lang.Object obj22 = hashMap17.remove((java.lang.Object) hashMap18);
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap((int) '4', (float) 10L);
        java.lang.Class<?> wildcardClass26 = hashMap25.getClass();
        java.lang.Object obj27 = hashMap18.remove((java.lang.Object) wildcardClass26);
        java.lang.Object obj28 = hashMap2.put((java.lang.Object) hashMap12, obj27);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        hashMap0.clear();
        java.lang.Object obj6 = hashMap0.remove((java.lang.Object) 0.0d);
        int int7 = hashMap0.size();
        hashMap0.clear();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        int int11 = hashMap9.modCount;
        hashMap9.clear();
        hashMap9.clear();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.modCount;
        int int16 = hashMap14.modCount;
        system.testclass.HashMap.Entry[] entryArray17 = hashMap14.table;
        boolean boolean18 = hashMap14.isEmpty();
        int int19 = hashMap14.modCount;
        int int20 = hashMap14.modCount;
        system.testclass.HashMap.Entry[] entryArray21 = hashMap14.table;
        hashMap9.table = entryArray21;
        int int23 = hashMap9.size();
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap(1);
        int int26 = hashMap25.modCount;
        int int27 = hashMap25.modCount;
        java.lang.Object obj28 = hashMap0.put((java.lang.Object) hashMap9, (java.lang.Object) hashMap25);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        int int3 = hashMap2.modCount;
        int int4 = hashMap2.modCount;
        system.testclass.HashMap.Entry[] entryArray5 = hashMap2.table;
        hashMap2.clear();
        java.lang.Object obj8 = hashMap2.remove((java.lang.Object) 0.0d);
        boolean boolean9 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        int int12 = hashMap10.size();
        hashMap10.clear();
        java.lang.Object obj14 = hashMap2.get((java.lang.Object) hashMap10);
        boolean boolean15 = hashMap10.isEmpty();
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        boolean boolean17 = hashMap16.isEmpty();
        int int18 = hashMap16.size();
        system.testclass.HashMap.Entry[] entryArray19 = hashMap16.table;
        hashMap10.table = entryArray19;
        hashMap1.table = entryArray19;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 100, (float) 98);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        system.testclass.HashMap.Entry[] entryArray6 = hashMap3.table;
        boolean boolean7 = hashMap3.isEmpty();
        int int8 = hashMap3.modCount;
        int int9 = hashMap3.modCount;
        system.testclass.HashMap.Entry[] entryArray10 = hashMap3.table;
        boolean boolean11 = hashMap3.isEmpty();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        int int13 = hashMap12.modCount;
        int int14 = hashMap12.modCount;
        int int15 = hashMap12.size();
        java.lang.Object obj16 = null;
        java.lang.Object obj17 = hashMap12.get(obj16);
        hashMap12.clear();
        java.lang.Object obj19 = hashMap3.get((java.lang.Object) hashMap12);
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap((int) (byte) 1);
        boolean boolean22 = hashMap21.isEmpty();
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.modCount;
        int int26 = hashMap24.modCount;
        system.testclass.HashMap.Entry[] entryArray27 = hashMap24.table;
        hashMap24.clear();
        java.lang.Object obj30 = hashMap24.remove((java.lang.Object) 0.0d);
        boolean boolean31 = hashMap24.isEmpty();
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        boolean boolean33 = hashMap32.isEmpty();
        int int34 = hashMap32.size();
        hashMap32.clear();
        java.lang.Object obj36 = hashMap24.get((java.lang.Object) hashMap32);
        boolean boolean37 = hashMap32.isEmpty();
        int int38 = hashMap32.modCount;
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        int int40 = hashMap39.modCount;
        int int41 = hashMap39.modCount;
        system.testclass.HashMap.Entry[] entryArray42 = hashMap39.table;
        hashMap39.clear();
        java.lang.Object obj45 = hashMap39.remove((java.lang.Object) 0.0d);
        java.lang.Object obj47 = hashMap39.remove((java.lang.Object) (short) 0);
        int int48 = hashMap39.size();
        system.testclass.HashMap hashMap50 = new system.testclass.HashMap((int) (byte) 0);
        int int51 = hashMap50.modCount;
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap();
        boolean boolean53 = hashMap52.isEmpty();
        int int54 = hashMap52.size();
        system.testclass.HashMap.Entry[] entryArray55 = hashMap52.table;
        java.lang.Object obj56 = hashMap50.remove((java.lang.Object) entryArray55);
        hashMap39.table = entryArray55;
        hashMap32.table = entryArray55;
        java.lang.Object obj59 = hashMap21.put((java.lang.Object) 100.0d, (java.lang.Object) entryArray55);
        hashMap3.table = entryArray55;
        hashMap2.table = entryArray55;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(97, (float) 100L);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.modCount;
        int int8 = hashMap6.modCount;
        hashMap6.clear();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        int int12 = hashMap10.size();
        hashMap10.clear();
        int int14 = hashMap10.modCount;
        java.lang.Object obj15 = hashMap6.get((java.lang.Object) hashMap10);
        system.testclass.HashMap.Entry[] entryArray16 = hashMap6.table;
        java.lang.Object obj17 = hashMap5.get((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        int int19 = hashMap18.modCount;
        int int20 = hashMap18.modCount;
        system.testclass.HashMap.Entry[] entryArray21 = hashMap18.table;
        hashMap18.clear();
        java.lang.Object obj24 = hashMap18.remove((java.lang.Object) 0.0d);
        java.lang.Object obj26 = hashMap18.remove((java.lang.Object) (short) 0);
        int int27 = hashMap18.size();
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap((int) (byte) 0);
        int int30 = hashMap29.modCount;
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        boolean boolean32 = hashMap31.isEmpty();
        int int33 = hashMap31.size();
        system.testclass.HashMap.Entry[] entryArray34 = hashMap31.table;
        java.lang.Object obj35 = hashMap29.remove((java.lang.Object) entryArray34);
        hashMap18.table = entryArray34;
        hashMap6.table = entryArray34;
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        int int39 = hashMap38.modCount;
        int int40 = hashMap38.modCount;
        system.testclass.HashMap.Entry[] entryArray41 = hashMap38.table;
        boolean boolean42 = hashMap38.isEmpty();
        int int43 = hashMap38.modCount;
        int int44 = hashMap38.modCount;
        system.testclass.HashMap.Entry[] entryArray45 = hashMap38.table;
        boolean boolean46 = hashMap38.isEmpty();
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap();
        int int48 = hashMap47.modCount;
        int int49 = hashMap47.modCount;
        int int50 = hashMap47.size();
        java.lang.Object obj51 = null;
        java.lang.Object obj52 = hashMap47.get(obj51);
        hashMap47.clear();
        java.lang.Object obj54 = hashMap38.get((java.lang.Object) hashMap47);
        java.lang.Object obj55 = hashMap2.put((java.lang.Object) entryArray34, (java.lang.Object) hashMap38);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        hashMap0.clear();
        hashMap0.modCount = 97;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap(100, 100.0f);
        system.testclass.HashMap.Entry[] entryArray10 = hashMap9.table;
        hashMap0.table = entryArray10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        hashMap0.clear();
        boolean boolean5 = hashMap0.isEmpty();
        int int6 = hashMap0.size();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        int int9 = hashMap7.modCount;
        system.testclass.HashMap.Entry[] entryArray10 = hashMap7.table;
        hashMap7.clear();
        java.lang.Object obj13 = hashMap7.remove((java.lang.Object) 0.0d);
        system.testclass.HashMap.Entry[] entryArray14 = hashMap7.table;
        java.lang.Object obj15 = hashMap0.get((java.lang.Object) entryArray14);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        int int17 = hashMap16.modCount;
        int int18 = hashMap16.modCount;
        system.testclass.HashMap.Entry[] entryArray19 = hashMap16.table;
        hashMap16.clear();
        java.lang.Object obj22 = hashMap16.remove((java.lang.Object) 0.0d);
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        int int24 = hashMap23.modCount;
        int int25 = hashMap23.modCount;
        system.testclass.HashMap.Entry[] entryArray26 = hashMap23.table;
        hashMap23.clear();
        java.lang.Object obj29 = hashMap23.remove((java.lang.Object) 0.0d);
        java.lang.Object obj31 = hashMap23.remove((java.lang.Object) (short) 0);
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        int int33 = hashMap32.modCount;
        int int34 = hashMap32.modCount;
        hashMap32.clear();
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        boolean boolean37 = hashMap36.isEmpty();
        int int38 = hashMap36.size();
        hashMap36.clear();
        int int40 = hashMap36.modCount;
        java.lang.Object obj41 = hashMap32.get((java.lang.Object) hashMap36);
        system.testclass.HashMap.Entry[] entryArray42 = hashMap32.table;
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap();
        int int44 = hashMap43.modCount;
        int int45 = hashMap43.modCount;
        hashMap43.modCount = '#';
        int int48 = hashMap43.size();
        java.lang.Object obj50 = hashMap32.put((java.lang.Object) hashMap43, (java.lang.Object) 1L);
        hashMap32.modCount = (short) 10;
        java.lang.Object obj53 = hashMap23.get((java.lang.Object) hashMap32);
        java.lang.Object obj54 = hashMap16.get(obj53);
        system.testclass.HashMap hashMap55 = new system.testclass.HashMap();
        int int56 = hashMap55.modCount;
        int int57 = hashMap55.modCount;
        system.testclass.HashMap.Entry[] entryArray58 = hashMap55.table;
        boolean boolean59 = hashMap55.isEmpty();
        int int60 = hashMap55.modCount;
        system.testclass.HashMap hashMap61 = new system.testclass.HashMap();
        int int62 = hashMap61.modCount;
        int int63 = hashMap61.modCount;
        system.testclass.HashMap.Entry[] entryArray64 = hashMap61.table;
        boolean boolean65 = hashMap61.isEmpty();
        int int66 = hashMap61.modCount;
        int int67 = hashMap61.modCount;
        system.testclass.HashMap.Entry[] entryArray68 = hashMap61.table;
        boolean boolean69 = hashMap61.isEmpty();
        java.lang.Object obj70 = hashMap55.remove((java.lang.Object) boolean69);
        system.testclass.HashMap hashMap71 = new system.testclass.HashMap();
        boolean boolean72 = hashMap71.isEmpty();
        int int73 = hashMap71.size();
        system.testclass.HashMap.Entry[] entryArray74 = hashMap71.table;
        system.testclass.HashMap.Entry[] entryArray75 = hashMap71.table;
        boolean boolean76 = hashMap71.isEmpty();
        java.lang.Object obj77 = hashMap55.remove((java.lang.Object) hashMap71);
        java.lang.Object obj78 = hashMap0.put(obj53, (java.lang.Object) hashMap71);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        hashMap0.clear();
        java.lang.Object obj6 = hashMap0.remove((java.lang.Object) 0.0d);
        boolean boolean7 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        int int13 = hashMap11.modCount;
        hashMap11.clear();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        boolean boolean16 = hashMap15.isEmpty();
        int int17 = hashMap15.size();
        hashMap15.clear();
        int int19 = hashMap15.modCount;
        java.lang.Object obj20 = hashMap11.get((java.lang.Object) hashMap15);
        system.testclass.HashMap.Entry[] entryArray21 = hashMap11.table;
        java.lang.Object obj22 = hashMap10.get((java.lang.Object) hashMap11);
        boolean boolean23 = hashMap11.isEmpty();
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        boolean boolean25 = hashMap24.isEmpty();
        int int26 = hashMap24.size();
        int int27 = hashMap24.size();
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap(0);
        system.testclass.HashMap.Entry[] entryArray30 = hashMap29.table;
        java.lang.Object obj31 = hashMap24.remove((java.lang.Object) hashMap29);
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap.Entry[] entryArray35 = hashMap34.table;
        hashMap34.clear();
        java.lang.Object obj37 = hashMap24.get((java.lang.Object) hashMap34);
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap((int) (byte) 0);
        int int41 = hashMap40.modCount;
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap();
        boolean boolean43 = hashMap42.isEmpty();
        int int44 = hashMap42.size();
        system.testclass.HashMap.Entry[] entryArray45 = hashMap42.table;
        java.lang.Object obj46 = hashMap40.remove((java.lang.Object) entryArray45);
        java.lang.Object obj47 = hashMap24.put((java.lang.Object) 1.0d, (java.lang.Object) hashMap40);
        boolean boolean48 = hashMap40.isEmpty();
        java.lang.Object obj49 = hashMap0.put((java.lang.Object) hashMap11, (java.lang.Object) hashMap40);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        boolean boolean4 = hashMap0.isEmpty();
        int int5 = hashMap0.modCount;
        int int6 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray7 = hashMap0.table;
        boolean boolean8 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        int int11 = hashMap9.modCount;
        int int12 = hashMap9.size();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = hashMap9.get(obj13);
        hashMap9.clear();
        java.lang.Object obj16 = hashMap0.get((java.lang.Object) hashMap9);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap((int) (byte) 1);
        boolean boolean19 = hashMap18.isEmpty();
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        int int22 = hashMap21.modCount;
        int int23 = hashMap21.modCount;
        system.testclass.HashMap.Entry[] entryArray24 = hashMap21.table;
        hashMap21.clear();
        java.lang.Object obj27 = hashMap21.remove((java.lang.Object) 0.0d);
        boolean boolean28 = hashMap21.isEmpty();
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        boolean boolean30 = hashMap29.isEmpty();
        int int31 = hashMap29.size();
        hashMap29.clear();
        java.lang.Object obj33 = hashMap21.get((java.lang.Object) hashMap29);
        boolean boolean34 = hashMap29.isEmpty();
        int int35 = hashMap29.modCount;
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        int int37 = hashMap36.modCount;
        int int38 = hashMap36.modCount;
        system.testclass.HashMap.Entry[] entryArray39 = hashMap36.table;
        hashMap36.clear();
        java.lang.Object obj42 = hashMap36.remove((java.lang.Object) 0.0d);
        java.lang.Object obj44 = hashMap36.remove((java.lang.Object) (short) 0);
        int int45 = hashMap36.size();
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap((int) (byte) 0);
        int int48 = hashMap47.modCount;
        system.testclass.HashMap hashMap49 = new system.testclass.HashMap();
        boolean boolean50 = hashMap49.isEmpty();
        int int51 = hashMap49.size();
        system.testclass.HashMap.Entry[] entryArray52 = hashMap49.table;
        java.lang.Object obj53 = hashMap47.remove((java.lang.Object) entryArray52);
        hashMap36.table = entryArray52;
        hashMap29.table = entryArray52;
        java.lang.Object obj56 = hashMap18.put((java.lang.Object) 100.0d, (java.lang.Object) entryArray52);
        hashMap0.table = entryArray52;
        system.testclass.HashMap hashMap58 = new system.testclass.HashMap();
        int int59 = hashMap58.modCount;
        int int60 = hashMap58.modCount;
        system.testclass.HashMap.Entry[] entryArray61 = hashMap58.table;
        hashMap58.clear();
        boolean boolean63 = hashMap58.isEmpty();
        int int64 = hashMap58.size();
        system.testclass.HashMap hashMap65 = new system.testclass.HashMap();
        int int66 = hashMap65.modCount;
        int int67 = hashMap65.modCount;
        system.testclass.HashMap.Entry[] entryArray68 = hashMap65.table;
        hashMap65.clear();
        java.lang.Object obj71 = hashMap65.remove((java.lang.Object) 0.0d);
        system.testclass.HashMap.Entry[] entryArray72 = hashMap65.table;
        java.lang.Object obj73 = hashMap58.get((java.lang.Object) entryArray72);
        boolean boolean74 = hashMap58.isEmpty();
        system.testclass.HashMap hashMap76 = new system.testclass.HashMap((int) 'a');
        int int77 = hashMap76.size();
        hashMap76.modCount = 35;
        java.lang.Object obj80 = hashMap0.put((java.lang.Object) hashMap58, (java.lang.Object) hashMap76);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        boolean boolean4 = hashMap0.isEmpty();
        int int5 = hashMap0.modCount;
        int int6 = hashMap0.modCount;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        int int9 = hashMap7.size();
        hashMap7.clear();
        hashMap7.clear();
        java.lang.Class<?> wildcardClass12 = hashMap7.getClass();
        java.lang.Object obj13 = hashMap0.remove((java.lang.Object) wildcardClass12);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.modCount;
        int int16 = hashMap14.modCount;
        system.testclass.HashMap.Entry[] entryArray17 = hashMap14.table;
        hashMap14.clear();
        java.lang.Object obj20 = hashMap14.remove((java.lang.Object) 0.0d);
        java.lang.Object obj22 = hashMap14.remove((java.lang.Object) (short) 0);
        int int23 = hashMap14.size();
        int int24 = hashMap14.modCount;
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap((int) (byte) 0);
        int int27 = hashMap26.modCount;
        system.testclass.HashMap.Entry[] entryArray28 = hashMap26.table;
        java.lang.Object obj29 = hashMap14.remove((java.lang.Object) hashMap26);
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        int int31 = hashMap30.modCount;
        int int32 = hashMap30.modCount;
        hashMap30.modCount = '#';
        int int35 = hashMap30.size();
        hashMap30.modCount = (short) 100;
        java.lang.Object obj38 = hashMap0.put(obj29, (java.lang.Object) hashMap30);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(100);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        int int3 = hashMap2.modCount;
        int int4 = hashMap2.modCount;
        system.testclass.HashMap.Entry[] entryArray5 = hashMap2.table;
        hashMap2.clear();
        java.lang.Object obj8 = hashMap2.remove((java.lang.Object) 0.0d);
        java.lang.Object obj10 = hashMap2.remove((java.lang.Object) (short) 0);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        int int13 = hashMap11.modCount;
        hashMap11.clear();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        boolean boolean16 = hashMap15.isEmpty();
        int int17 = hashMap15.size();
        hashMap15.clear();
        int int19 = hashMap15.modCount;
        java.lang.Object obj20 = hashMap11.get((java.lang.Object) hashMap15);
        system.testclass.HashMap.Entry[] entryArray21 = hashMap11.table;
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        int int23 = hashMap22.modCount;
        int int24 = hashMap22.modCount;
        hashMap22.modCount = '#';
        int int27 = hashMap22.size();
        java.lang.Object obj29 = hashMap11.put((java.lang.Object) hashMap22, (java.lang.Object) 1L);
        hashMap11.modCount = (short) 10;
        java.lang.Object obj32 = hashMap2.get((java.lang.Object) hashMap11);
        system.testclass.HashMap.Entry[] entryArray33 = hashMap11.table;
        hashMap1.table = entryArray33;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 100);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        int int5 = hashMap3.size();
        system.testclass.HashMap.Entry[] entryArray6 = hashMap3.table;
        hashMap3.modCount = (short) 1;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        int int11 = hashMap9.size();
        system.testclass.HashMap.Entry[] entryArray12 = hashMap9.table;
        hashMap3.table = entryArray12;
        int int14 = hashMap3.modCount;
        hashMap3.modCount = 97;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        boolean boolean18 = hashMap17.isEmpty();
        int int19 = hashMap17.size();
        system.testclass.HashMap.Entry[] entryArray20 = hashMap17.table;
        hashMap17.modCount = (short) 1;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        boolean boolean24 = hashMap23.isEmpty();
        int int25 = hashMap23.size();
        system.testclass.HashMap.Entry[] entryArray26 = hashMap23.table;
        hashMap17.table = entryArray26;
        java.lang.Object obj28 = hashMap3.get((java.lang.Object) hashMap17);
        system.testclass.HashMap.Entry[] entryArray29 = hashMap3.table;
        hashMap2.table = entryArray29;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        hashMap0.clear();
        java.lang.Object obj6 = hashMap0.remove((java.lang.Object) 0.0d);
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) (short) 0);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        int int11 = hashMap9.modCount;
        hashMap9.clear();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        boolean boolean14 = hashMap13.isEmpty();
        int int15 = hashMap13.size();
        hashMap13.clear();
        int int17 = hashMap13.modCount;
        java.lang.Object obj18 = hashMap9.get((java.lang.Object) hashMap13);
        system.testclass.HashMap.Entry[] entryArray19 = hashMap9.table;
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        int int21 = hashMap20.modCount;
        int int22 = hashMap20.modCount;
        hashMap20.modCount = '#';
        int int25 = hashMap20.size();
        java.lang.Object obj27 = hashMap9.put((java.lang.Object) hashMap20, (java.lang.Object) 1L);
        hashMap9.modCount = (short) 10;
        java.lang.Object obj30 = hashMap0.get((java.lang.Object) hashMap9);
        system.testclass.HashMap.Entry[] entryArray31 = hashMap9.table;
        int int32 = hashMap9.size();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap9", hashMap9.repOK_1());
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) ' ', (float) (byte) 1);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        int int10 = hashMap8.size();
        hashMap8.clear();
        java.lang.Object obj12 = hashMap7.remove((java.lang.Object) hashMap8);
        hashMap8.clear();
        java.lang.Object obj14 = hashMap4.get((java.lang.Object) hashMap8);
        system.testclass.HashMap.Entry[] entryArray15 = hashMap8.table;
        hashMap2.table = entryArray15;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        hashMap0.modCount = 'a';
        int int6 = hashMap0.modCount;
        hashMap0.clear();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.modCount;
        int int10 = hashMap8.modCount;
        system.testclass.HashMap.Entry[] entryArray11 = hashMap8.table;
        boolean boolean12 = hashMap8.isEmpty();
        int int13 = hashMap8.modCount;
        int int14 = hashMap8.modCount;
        system.testclass.HashMap.Entry[] entryArray15 = hashMap8.table;
        java.lang.Object obj16 = hashMap0.remove((java.lang.Object) hashMap8);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        boolean boolean18 = hashMap17.isEmpty();
        int int19 = hashMap17.size();
        system.testclass.HashMap.Entry[] entryArray20 = hashMap17.table;
        hashMap17.modCount = (short) 1;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        boolean boolean24 = hashMap23.isEmpty();
        int int25 = hashMap23.size();
        system.testclass.HashMap.Entry[] entryArray26 = hashMap23.table;
        hashMap17.table = entryArray26;
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        boolean boolean32 = hashMap31.isEmpty();
        int int33 = hashMap31.size();
        hashMap31.clear();
        java.lang.Object obj35 = hashMap30.remove((java.lang.Object) hashMap31);
        int int36 = hashMap30.size();
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int40 = hashMap39.modCount;
        system.testclass.HashMap.Entry[] entryArray41 = hashMap39.table;
        hashMap30.table = entryArray41;
        int int43 = hashMap30.size();
        java.lang.Object obj44 = hashMap8.put((java.lang.Object) hashMap17, (java.lang.Object) int43);
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap((int) (short) 0, (float) (byte) 100);
        system.testclass.HashMap hashMap50 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap.Entry[] entryArray51 = hashMap50.table;
        hashMap47.table = entryArray51;
        hashMap17.table = entryArray51;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap17", hashMap17.repOK_1());
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (short) 100);
        hashMap2.clear();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int7 = hashMap6.modCount;
        java.lang.Class<?> wildcardClass8 = hashMap6.getClass();
        java.lang.Object obj9 = hashMap2.remove((java.lang.Object) wildcardClass8);
        system.testclass.HashMap.Entry[] entryArray10 = hashMap2.table;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        boolean boolean12 = hashMap11.isEmpty();
        int int13 = hashMap11.size();
        system.testclass.HashMap.Entry[] entryArray14 = hashMap11.table;
        int int15 = hashMap11.modCount;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap((int) (byte) 0);
        int int18 = hashMap17.modCount;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        boolean boolean20 = hashMap19.isEmpty();
        int int21 = hashMap19.size();
        system.testclass.HashMap.Entry[] entryArray22 = hashMap19.table;
        java.lang.Object obj23 = hashMap17.remove((java.lang.Object) entryArray22);
        hashMap11.table = entryArray22;
        java.lang.Class<?> wildcardClass25 = hashMap11.getClass();
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap((int) (short) 0, (float) 1L);
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        boolean boolean30 = hashMap29.isEmpty();
        int int31 = hashMap29.size();
        hashMap29.clear();
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap.Entry[] entryArray36 = hashMap35.table;
        java.lang.Object obj38 = hashMap35.get((java.lang.Object) (short) 1);
        hashMap35.modCount = ' ';
        int int41 = hashMap35.modCount;
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        boolean boolean46 = hashMap45.isEmpty();
        int int47 = hashMap45.size();
        hashMap45.clear();
        java.lang.Object obj49 = hashMap44.remove((java.lang.Object) hashMap45);
        int int50 = hashMap44.size();
        system.testclass.HashMap.Entry[] entryArray51 = hashMap44.table;
        hashMap35.table = entryArray51;
        system.testclass.HashMap hashMap53 = new system.testclass.HashMap();
        boolean boolean54 = hashMap53.isEmpty();
        java.lang.Object obj55 = hashMap29.put((java.lang.Object) hashMap35, (java.lang.Object) hashMap53);
        system.testclass.HashMap hashMap56 = new system.testclass.HashMap();
        boolean boolean57 = hashMap56.isEmpty();
        int int58 = hashMap56.size();
        hashMap56.clear();
        int int60 = hashMap56.modCount;
        system.testclass.HashMap hashMap63 = new system.testclass.HashMap(0, (float) (short) 100);
        hashMap63.clear();
        java.lang.Object obj65 = hashMap56.remove((java.lang.Object) hashMap63);
        system.testclass.HashMap.Entry[] entryArray66 = hashMap56.table;
        java.lang.Object obj67 = hashMap35.get((java.lang.Object) entryArray66);
        java.lang.Object obj68 = hashMap28.get((java.lang.Object) entryArray66);
        int int69 = hashMap28.modCount;
        java.lang.Object obj70 = hashMap2.put((java.lang.Object) wildcardClass25, (java.lang.Object) hashMap28);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int3 = hashMap2.modCount;
        hashMap2.modCount = 97;
        hashMap2.clear();
        java.lang.Object obj8 = hashMap2.remove((java.lang.Object) "hi!");
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) (byte) 0);
        int int11 = hashMap10.modCount;
        system.testclass.HashMap.Entry[] entryArray12 = hashMap10.table;
        hashMap10.modCount = 100;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        int int17 = hashMap15.modCount;
        hashMap15.clear();
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        boolean boolean20 = hashMap19.isEmpty();
        int int21 = hashMap19.size();
        hashMap19.clear();
        int int23 = hashMap19.modCount;
        java.lang.Object obj24 = hashMap15.get((java.lang.Object) hashMap19);
        system.testclass.HashMap.Entry[] entryArray25 = hashMap15.table;
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        int int27 = hashMap26.modCount;
        int int28 = hashMap26.modCount;
        hashMap26.modCount = '#';
        int int31 = hashMap26.size();
        java.lang.Object obj33 = hashMap15.put((java.lang.Object) hashMap26, (java.lang.Object) 1L);
        java.lang.Object obj34 = hashMap2.put((java.lang.Object) hashMap10, (java.lang.Object) hashMap26);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        hashMap0.clear();
        java.lang.Object obj6 = hashMap0.remove((java.lang.Object) 0.0d);
        boolean boolean7 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        int int10 = hashMap8.size();
        hashMap8.clear();
        java.lang.Object obj12 = hashMap0.get((java.lang.Object) hashMap8);
        boolean boolean13 = hashMap8.isEmpty();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        boolean boolean15 = hashMap14.isEmpty();
        int int16 = hashMap14.size();
        system.testclass.HashMap.Entry[] entryArray17 = hashMap14.table;
        hashMap8.table = entryArray17;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        boolean boolean23 = hashMap22.isEmpty();
        int int24 = hashMap22.size();
        hashMap22.clear();
        java.lang.Object obj26 = hashMap21.remove((java.lang.Object) hashMap22);
        int int27 = hashMap21.size();
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int31 = hashMap30.modCount;
        system.testclass.HashMap.Entry[] entryArray32 = hashMap30.table;
        hashMap21.table = entryArray32;
        hashMap8.table = entryArray32;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap8", hashMap8.repOK_1());
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        hashMap0.clear();
        java.lang.Object obj6 = hashMap0.remove((java.lang.Object) 0.0d);
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) (short) 0);
        int int9 = hashMap0.size();
        int int10 = hashMap0.size();
        hashMap0.modCount = 0;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap(100, 100.0f);
        system.testclass.HashMap.Entry[] entryArray16 = hashMap15.table;
        java.lang.Object obj17 = hashMap0.get((java.lang.Object) hashMap15);
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        boolean boolean22 = hashMap21.isEmpty();
        int int23 = hashMap21.size();
        hashMap21.clear();
        java.lang.Object obj25 = hashMap20.remove((java.lang.Object) hashMap21);
        int int26 = hashMap20.size();
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int30 = hashMap29.modCount;
        system.testclass.HashMap.Entry[] entryArray31 = hashMap29.table;
        hashMap20.table = entryArray31;
        java.lang.Object obj33 = hashMap0.get((java.lang.Object) hashMap20);
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        int int37 = hashMap36.modCount;
        int int38 = hashMap36.modCount;
        system.testclass.HashMap.Entry[] entryArray39 = hashMap36.table;
        hashMap36.clear();
        java.lang.Object obj42 = hashMap36.remove((java.lang.Object) 0.0d);
        java.lang.Object obj44 = hashMap36.remove((java.lang.Object) (short) 0);
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        int int46 = hashMap45.modCount;
        int int47 = hashMap45.modCount;
        hashMap45.clear();
        system.testclass.HashMap hashMap49 = new system.testclass.HashMap();
        boolean boolean50 = hashMap49.isEmpty();
        int int51 = hashMap49.size();
        hashMap49.clear();
        int int53 = hashMap49.modCount;
        java.lang.Object obj54 = hashMap45.get((java.lang.Object) hashMap49);
        system.testclass.HashMap.Entry[] entryArray55 = hashMap45.table;
        system.testclass.HashMap hashMap56 = new system.testclass.HashMap();
        int int57 = hashMap56.modCount;
        int int58 = hashMap56.modCount;
        hashMap56.modCount = '#';
        int int61 = hashMap56.size();
        java.lang.Object obj63 = hashMap45.put((java.lang.Object) hashMap56, (java.lang.Object) 1L);
        hashMap45.modCount = (short) 10;
        java.lang.Object obj66 = hashMap36.get((java.lang.Object) hashMap45);
        boolean boolean67 = hashMap45.isEmpty();
        java.lang.Object obj68 = hashMap0.put((java.lang.Object) (short) 10, (java.lang.Object) hashMap45);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(100, (float) 'a');
        system.testclass.HashMap.Entry[] entryArray3 = hashMap2.table;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int7 = hashMap6.modCount;
        system.testclass.HashMap.Entry entry8 = null;
        system.testclass.HashMap.Entry[] entryArray9 = new system.testclass.HashMap.Entry[] { entry8 };
        hashMap6.table = entryArray9;
        java.lang.Class<?> wildcardClass11 = hashMap6.getClass();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        boolean boolean13 = hashMap12.isEmpty();
        hashMap12.modCount = 0;
        java.lang.Object obj16 = hashMap2.put((java.lang.Object) wildcardClass11, (java.lang.Object) hashMap12);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        hashMap2.modCount = 98;
        int int5 = hashMap2.modCount;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.modCount;
        int int8 = hashMap6.modCount;
        system.testclass.HashMap.Entry[] entryArray9 = hashMap6.table;
        hashMap6.clear();
        java.lang.Object obj12 = hashMap6.remove((java.lang.Object) 0.0d);
        boolean boolean13 = hashMap6.isEmpty();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        boolean boolean15 = hashMap14.isEmpty();
        int int16 = hashMap14.size();
        hashMap14.clear();
        java.lang.Object obj18 = hashMap6.get((java.lang.Object) hashMap14);
        boolean boolean19 = hashMap14.isEmpty();
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        boolean boolean21 = hashMap20.isEmpty();
        int int22 = hashMap20.size();
        system.testclass.HashMap.Entry[] entryArray23 = hashMap20.table;
        hashMap14.table = entryArray23;
        hashMap2.table = entryArray23;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int3 = hashMap2.modCount;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        hashMap4.modCount = 0;
        boolean boolean7 = hashMap4.isEmpty();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        int int10 = hashMap8.size();
        hashMap8.clear();
        int int12 = hashMap8.modCount;
        system.testclass.HashMap.Entry[] entryArray13 = hashMap8.table;
        hashMap4.table = entryArray13;
        hashMap2.table = entryArray13;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        int int5 = hashMap3.size();
        hashMap3.clear();
        java.lang.Object obj7 = hashMap2.remove((java.lang.Object) hashMap3);
        int int8 = hashMap2.size();
        system.testclass.HashMap.Entry[] entryArray9 = hashMap2.table;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        int int12 = hashMap10.size();
        hashMap10.clear();
        hashMap10.modCount = 'a';
        int int16 = hashMap10.modCount;
        hashMap10.clear();
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        int int19 = hashMap18.modCount;
        int int20 = hashMap18.modCount;
        system.testclass.HashMap.Entry[] entryArray21 = hashMap18.table;
        boolean boolean22 = hashMap18.isEmpty();
        int int23 = hashMap18.modCount;
        int int24 = hashMap18.modCount;
        system.testclass.HashMap.Entry[] entryArray25 = hashMap18.table;
        java.lang.Object obj26 = hashMap10.remove((java.lang.Object) hashMap18);
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        boolean boolean28 = hashMap27.isEmpty();
        int int29 = hashMap27.size();
        system.testclass.HashMap.Entry[] entryArray30 = hashMap27.table;
        hashMap27.modCount = (short) 1;
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        boolean boolean34 = hashMap33.isEmpty();
        int int35 = hashMap33.size();
        system.testclass.HashMap.Entry[] entryArray36 = hashMap33.table;
        hashMap27.table = entryArray36;
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        boolean boolean42 = hashMap41.isEmpty();
        int int43 = hashMap41.size();
        hashMap41.clear();
        java.lang.Object obj45 = hashMap40.remove((java.lang.Object) hashMap41);
        int int46 = hashMap40.size();
        system.testclass.HashMap hashMap49 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int50 = hashMap49.modCount;
        system.testclass.HashMap.Entry[] entryArray51 = hashMap49.table;
        hashMap40.table = entryArray51;
        int int53 = hashMap40.size();
        java.lang.Object obj54 = hashMap18.put((java.lang.Object) hashMap27, (java.lang.Object) int53);
        system.testclass.HashMap hashMap55 = new system.testclass.HashMap();
        boolean boolean56 = hashMap55.isEmpty();
        int int57 = hashMap55.size();
        hashMap55.clear();
        int int59 = hashMap55.modCount;
        system.testclass.HashMap hashMap62 = new system.testclass.HashMap(0, (float) (short) 100);
        hashMap62.clear();
        java.lang.Object obj64 = hashMap55.remove((java.lang.Object) hashMap62);
        system.testclass.HashMap.Entry[] entryArray65 = hashMap55.table;
        system.testclass.HashMap hashMap66 = new system.testclass.HashMap();
        int int67 = hashMap66.modCount;
        int int68 = hashMap66.modCount;
        hashMap66.clear();
        system.testclass.HashMap hashMap70 = new system.testclass.HashMap();
        boolean boolean71 = hashMap70.isEmpty();
        int int72 = hashMap70.size();
        hashMap70.clear();
        int int74 = hashMap70.modCount;
        java.lang.Object obj75 = hashMap66.get((java.lang.Object) hashMap70);
        system.testclass.HashMap.Entry[] entryArray76 = hashMap66.table;
        hashMap55.table = entryArray76;
        hashMap27.table = entryArray76;
        hashMap2.table = entryArray76;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        hashMap0.clear();
        java.lang.Object obj6 = hashMap0.remove((java.lang.Object) 0.0d);
        boolean boolean7 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int11 = hashMap10.modCount;
        hashMap10.modCount = 97;
        hashMap10.clear();
        java.lang.Object obj16 = hashMap10.remove((java.lang.Object) "hi!");
        boolean boolean17 = hashMap10.isEmpty();
        java.lang.Object obj19 = hashMap10.get((java.lang.Object) 100L);
        java.lang.Object obj20 = hashMap0.remove(obj19);
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap((int) (byte) 100, (float) 100L);
        int int24 = hashMap23.modCount;
        hashMap23.modCount = '4';
        int int27 = hashMap23.size();
        hashMap23.clear();
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap((int) (byte) 0);
        int int31 = hashMap30.modCount;
        system.testclass.HashMap.Entry[] entryArray32 = hashMap30.table;
        hashMap30.modCount = 100;
        java.lang.Object obj35 = hashMap0.put((java.lang.Object) hashMap23, (java.lang.Object) hashMap30);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        int int2 = hashMap1.modCount;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        int int5 = hashMap3.size();
        system.testclass.HashMap.Entry[] entryArray6 = hashMap3.table;
        java.lang.Object obj7 = hashMap1.remove((java.lang.Object) entryArray6);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        int int10 = hashMap8.size();
        hashMap8.clear();
        int int12 = hashMap8.modCount;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap(0, (float) (short) 100);
        hashMap15.clear();
        java.lang.Object obj17 = hashMap8.remove((java.lang.Object) hashMap15);
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap((int) (byte) 100, (float) 100L);
        int int21 = hashMap20.modCount;
        hashMap20.modCount = '4';
        system.testclass.HashMap.Entry[] entryArray24 = hashMap20.table;
        java.lang.Object obj25 = hashMap1.put((java.lang.Object) hashMap8, (java.lang.Object) hashMap20);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        int int5 = hashMap3.size();
        hashMap3.clear();
        java.lang.Object obj7 = hashMap2.remove((java.lang.Object) hashMap3);
        java.lang.Object obj9 = hashMap2.get((java.lang.Object) true);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        int int12 = hashMap10.size();
        system.testclass.HashMap.Entry[] entryArray13 = hashMap10.table;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        boolean boolean15 = hashMap14.isEmpty();
        int int16 = hashMap14.size();
        system.testclass.HashMap.Entry[] entryArray17 = hashMap14.table;
        system.testclass.HashMap.Entry[] entryArray18 = hashMap14.table;
        hashMap10.table = entryArray18;
        hashMap2.table = entryArray18;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        hashMap0.clear();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) (byte) 0);
        int int7 = hashMap6.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        int int10 = hashMap8.size();
        system.testclass.HashMap.Entry[] entryArray11 = hashMap8.table;
        java.lang.Object obj12 = hashMap6.remove((java.lang.Object) entryArray11);
        java.lang.Object obj13 = hashMap0.remove((java.lang.Object) entryArray11);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.modCount;
        int int16 = hashMap14.modCount;
        system.testclass.HashMap.Entry[] entryArray17 = hashMap14.table;
        java.lang.Object obj18 = hashMap0.remove((java.lang.Object) entryArray17);
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        boolean boolean23 = hashMap22.isEmpty();
        int int24 = hashMap22.size();
        hashMap22.clear();
        java.lang.Object obj26 = hashMap21.remove((java.lang.Object) hashMap22);
        java.lang.Object obj28 = hashMap21.get((java.lang.Object) true);
        system.testclass.HashMap.Entry[] entryArray29 = hashMap21.table;
        hashMap0.table = entryArray29;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (short) 100);
        hashMap2.clear();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        int int6 = hashMap4.size();
        hashMap4.clear();
        system.testclass.HashMap.Entry[] entryArray8 = hashMap4.table;
        hashMap2.table = entryArray8;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        boolean boolean4 = hashMap0.isEmpty();
        int int5 = hashMap0.modCount;
        int int6 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray7 = hashMap0.table;
        boolean boolean8 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        int int11 = hashMap9.size();
        hashMap9.clear();
        int int13 = hashMap9.modCount;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap((int) (byte) 0);
        java.lang.Class<?> wildcardClass18 = hashMap17.getClass();
        java.lang.Object obj19 = hashMap15.get((java.lang.Object) hashMap17);
        hashMap15.clear();
        system.testclass.HashMap.Entry[] entryArray21 = hashMap15.table;
        java.lang.Object obj22 = hashMap0.put((java.lang.Object) hashMap9, (java.lang.Object) entryArray21);
        boolean boolean23 = hashMap0.isEmpty();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap((int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = hashMap3.getClass();
        java.lang.Object obj5 = hashMap1.get((java.lang.Object) hashMap3);
        hashMap1.clear();
        int int7 = hashMap1.size();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap(10, (float) (short) 100);
        int int11 = hashMap10.size();
        int int12 = hashMap10.size();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        system.testclass.HashMap.Entry[] entryArray16 = hashMap13.table;
        hashMap13.clear();
        java.lang.Object obj19 = hashMap13.remove((java.lang.Object) 0.0d);
        java.lang.Object obj21 = hashMap13.remove((java.lang.Object) (short) 0);
        boolean boolean22 = hashMap13.isEmpty();
        hashMap13.modCount = '#';
        int int25 = hashMap13.modCount;
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap(98);
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap(1, (float) '4');
        system.testclass.HashMap.Entry[] entryArray31 = hashMap30.table;
        java.lang.Object obj32 = hashMap13.put((java.lang.Object) hashMap27, (java.lang.Object) entryArray31);
        java.lang.Object obj33 = hashMap1.put((java.lang.Object) hashMap10, (java.lang.Object) hashMap13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '#', (float) 10L);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap.Entry[] entryArray6 = hashMap5.table;
        java.lang.Object obj8 = hashMap5.get((java.lang.Object) (short) 1);
        system.testclass.HashMap.Entry[] entryArray9 = hashMap5.table;
        hashMap2.table = entryArray9;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        int int3 = hashMap0.size();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap(0);
        system.testclass.HashMap.Entry[] entryArray6 = hashMap5.table;
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) hashMap5);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap.Entry[] entryArray11 = hashMap10.table;
        hashMap10.clear();
        java.lang.Object obj13 = hashMap0.get((java.lang.Object) hashMap10);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.modCount;
        int int16 = hashMap14.modCount;
        system.testclass.HashMap.Entry[] entryArray17 = hashMap14.table;
        boolean boolean18 = hashMap14.isEmpty();
        int int19 = hashMap14.modCount;
        int int20 = hashMap14.modCount;
        system.testclass.HashMap.Entry[] entryArray21 = hashMap14.table;
        boolean boolean22 = hashMap14.isEmpty();
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        boolean boolean24 = hashMap23.isEmpty();
        int int25 = hashMap23.size();
        hashMap23.clear();
        int int27 = hashMap23.modCount;
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap((int) (byte) 0);
        java.lang.Class<?> wildcardClass32 = hashMap31.getClass();
        java.lang.Object obj33 = hashMap29.get((java.lang.Object) hashMap31);
        hashMap29.clear();
        system.testclass.HashMap.Entry[] entryArray35 = hashMap29.table;
        java.lang.Object obj36 = hashMap14.put((java.lang.Object) hashMap23, (java.lang.Object) entryArray35);
        boolean boolean37 = hashMap23.isEmpty();
        system.testclass.HashMap.Entry[] entryArray38 = hashMap23.table;
        hashMap10.table = entryArray38;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap10", hashMap10.repOK_1());
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap.Entry[] entryArray7 = hashMap6.table;
        java.lang.Object obj9 = hashMap6.get((java.lang.Object) (short) 1);
        hashMap6.modCount = ' ';
        int int12 = hashMap6.modCount;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        boolean boolean17 = hashMap16.isEmpty();
        int int18 = hashMap16.size();
        hashMap16.clear();
        java.lang.Object obj20 = hashMap15.remove((java.lang.Object) hashMap16);
        int int21 = hashMap15.size();
        system.testclass.HashMap.Entry[] entryArray22 = hashMap15.table;
        hashMap6.table = entryArray22;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        boolean boolean25 = hashMap24.isEmpty();
        java.lang.Object obj26 = hashMap0.put((java.lang.Object) hashMap6, (java.lang.Object) hashMap24);
        boolean boolean27 = hashMap0.isEmpty();
        system.testclass.HashMap.Entry[] entryArray28 = hashMap0.table;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(52);
        hashMap1.modCount = 'a';
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        system.testclass.HashMap.Entry[] entryArray7 = hashMap4.table;
        hashMap4.clear();
        java.lang.Object obj10 = hashMap4.remove((java.lang.Object) 0.0d);
        java.lang.Object obj12 = hashMap4.remove((java.lang.Object) (short) 0);
        boolean boolean13 = hashMap4.isEmpty();
        hashMap4.modCount = '#';
        int int16 = hashMap4.modCount;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap(98);
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap(1, (float) '4');
        system.testclass.HashMap.Entry[] entryArray22 = hashMap21.table;
        java.lang.Object obj23 = hashMap4.put((java.lang.Object) hashMap18, (java.lang.Object) entryArray22);
        hashMap1.table = entryArray22;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        hashMap2.modCount = 98;
        int int5 = hashMap2.modCount;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.modCount;
        int int8 = hashMap6.modCount;
        system.testclass.HashMap.Entry[] entryArray9 = hashMap6.table;
        hashMap6.clear();
        java.lang.Object obj12 = hashMap6.remove((java.lang.Object) 0.0d);
        boolean boolean13 = hashMap6.isEmpty();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        boolean boolean15 = hashMap14.isEmpty();
        int int16 = hashMap14.size();
        hashMap14.clear();
        java.lang.Object obj18 = hashMap6.get((java.lang.Object) hashMap14);
        boolean boolean19 = hashMap14.isEmpty();
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        boolean boolean21 = hashMap20.isEmpty();
        int int22 = hashMap20.size();
        system.testclass.HashMap.Entry[] entryArray23 = hashMap20.table;
        hashMap14.table = entryArray23;
        int int25 = hashMap14.size();
        system.testclass.HashMap.Entry[] entryArray26 = hashMap14.table;
        java.lang.Object obj27 = null;
        java.lang.Object obj28 = hashMap2.put((java.lang.Object) entryArray26, obj27);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        int int3 = hashMap0.size();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        system.testclass.HashMap.Entry[] entryArray7 = hashMap4.table;
        hashMap4.clear();
        java.lang.Object obj10 = hashMap4.remove((java.lang.Object) 0.0d);
        java.lang.Object obj12 = hashMap4.remove((java.lang.Object) (short) 0);
        int int13 = hashMap4.size();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap((int) (byte) 0);
        int int16 = hashMap15.modCount;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        boolean boolean18 = hashMap17.isEmpty();
        int int19 = hashMap17.size();
        system.testclass.HashMap.Entry[] entryArray20 = hashMap17.table;
        java.lang.Object obj21 = hashMap15.remove((java.lang.Object) entryArray20);
        hashMap4.table = entryArray20;
        java.lang.Object obj23 = hashMap0.get((java.lang.Object) hashMap4);
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        int int27 = hashMap26.modCount;
        int int28 = hashMap26.modCount;
        system.testclass.HashMap.Entry[] entryArray29 = hashMap26.table;
        boolean boolean30 = hashMap26.isEmpty();
        int int31 = hashMap26.modCount;
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        int int33 = hashMap32.modCount;
        int int34 = hashMap32.modCount;
        system.testclass.HashMap.Entry[] entryArray35 = hashMap32.table;
        boolean boolean36 = hashMap32.isEmpty();
        int int37 = hashMap32.modCount;
        int int38 = hashMap32.modCount;
        system.testclass.HashMap.Entry[] entryArray39 = hashMap32.table;
        boolean boolean40 = hashMap32.isEmpty();
        java.lang.Object obj41 = hashMap26.remove((java.lang.Object) boolean40);
        hashMap26.modCount = 98;
        java.lang.Object obj44 = hashMap4.put((java.lang.Object) hashMap25, (java.lang.Object) 98);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap4", hashMap4.repOK_1());
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(1);
        int int2 = hashMap1.modCount;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        system.testclass.HashMap.Entry[] entryArray6 = hashMap3.table;
        hashMap3.clear();
        java.lang.Object obj9 = hashMap3.remove((java.lang.Object) 0.0d);
        boolean boolean10 = hashMap3.isEmpty();
        system.testclass.HashMap.Entry[] entryArray11 = hashMap3.table;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        int int13 = hashMap12.modCount;
        int int14 = hashMap12.modCount;
        hashMap12.clear();
        int int16 = hashMap12.modCount;
        java.lang.Object obj17 = hashMap1.put((java.lang.Object) hashMap3, (java.lang.Object) hashMap12);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int3 = hashMap2.modCount;
        system.testclass.HashMap.Entry[] entryArray4 = hashMap2.table;
        hashMap2.modCount = (byte) -1;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) (byte) 0);
        java.lang.Class<?> wildcardClass11 = hashMap10.getClass();
        java.lang.Object obj12 = hashMap8.get((java.lang.Object) hashMap10);
        java.lang.Object obj13 = hashMap2.get(obj12);
        int int14 = hashMap2.modCount;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        int int17 = hashMap15.modCount;
        system.testclass.HashMap.Entry[] entryArray18 = hashMap15.table;
        int int19 = hashMap15.size();
        system.testclass.HashMap.Entry[] entryArray20 = hashMap15.table;
        hashMap2.table = entryArray20;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        int int5 = hashMap3.size();
        system.testclass.HashMap.Entry[] entryArray6 = hashMap3.table;
        hashMap3.modCount = (short) 1;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        int int11 = hashMap9.size();
        system.testclass.HashMap.Entry[] entryArray12 = hashMap9.table;
        hashMap3.table = entryArray12;
        int int14 = hashMap3.modCount;
        hashMap3.modCount = 97;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        boolean boolean18 = hashMap17.isEmpty();
        int int19 = hashMap17.size();
        system.testclass.HashMap.Entry[] entryArray20 = hashMap17.table;
        hashMap17.modCount = (short) 1;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        boolean boolean24 = hashMap23.isEmpty();
        int int25 = hashMap23.size();
        system.testclass.HashMap.Entry[] entryArray26 = hashMap23.table;
        hashMap17.table = entryArray26;
        java.lang.Object obj28 = hashMap3.get((java.lang.Object) hashMap17);
        system.testclass.HashMap.Entry[] entryArray29 = hashMap3.table;
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        int int31 = hashMap30.modCount;
        int int32 = hashMap30.modCount;
        hashMap30.clear();
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        boolean boolean35 = hashMap34.isEmpty();
        int int36 = hashMap34.size();
        hashMap34.clear();
        int int38 = hashMap34.modCount;
        java.lang.Object obj39 = hashMap30.get((java.lang.Object) hashMap34);
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        int int41 = hashMap40.modCount;
        int int42 = hashMap40.modCount;
        system.testclass.HashMap.Entry[] entryArray43 = hashMap40.table;
        hashMap40.clear();
        java.lang.Object obj46 = hashMap40.remove((java.lang.Object) 0.0d);
        system.testclass.HashMap.Entry[] entryArray47 = hashMap40.table;
        hashMap34.table = entryArray47;
        hashMap3.table = entryArray47;
        hashMap2.table = entryArray47;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(10, (float) (short) 100);
        int int3 = hashMap2.size();
        system.testclass.HashMap.Entry[] entryArray4 = hashMap2.table;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        boolean boolean6 = hashMap5.isEmpty();
        int int7 = hashMap5.size();
        hashMap5.clear();
        hashMap5.modCount = 'a';
        int int11 = hashMap5.modCount;
        hashMap5.clear();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        system.testclass.HashMap.Entry[] entryArray16 = hashMap13.table;
        boolean boolean17 = hashMap13.isEmpty();
        int int18 = hashMap13.modCount;
        int int19 = hashMap13.modCount;
        system.testclass.HashMap.Entry[] entryArray20 = hashMap13.table;
        java.lang.Object obj21 = hashMap5.remove((java.lang.Object) hashMap13);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        int int23 = hashMap22.modCount;
        int int24 = hashMap22.modCount;
        system.testclass.HashMap.Entry[] entryArray25 = hashMap22.table;
        boolean boolean26 = hashMap22.isEmpty();
        int int27 = hashMap22.modCount;
        int int28 = hashMap22.modCount;
        system.testclass.HashMap.Entry[] entryArray29 = hashMap22.table;
        hashMap22.modCount = 0;
        int int32 = hashMap22.modCount;
        hashMap22.clear();
        java.lang.Object obj34 = hashMap13.get((java.lang.Object) hashMap22);
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        boolean boolean36 = hashMap35.isEmpty();
        int int37 = hashMap35.size();
        system.testclass.HashMap.Entry[] entryArray38 = hashMap35.table;
        hashMap35.modCount = (short) 1;
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        boolean boolean42 = hashMap41.isEmpty();
        int int43 = hashMap41.size();
        system.testclass.HashMap.Entry[] entryArray44 = hashMap41.table;
        hashMap35.table = entryArray44;
        int int46 = hashMap35.modCount;
        int int47 = hashMap35.modCount;
        int int48 = hashMap35.size();
        system.testclass.HashMap.Entry[] entryArray49 = hashMap35.table;
        java.lang.Object obj50 = hashMap2.put((java.lang.Object) hashMap22, (java.lang.Object) entryArray49);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        hashMap0.modCount = (short) 1;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        int int8 = hashMap6.size();
        system.testclass.HashMap.Entry[] entryArray9 = hashMap6.table;
        hashMap0.table = entryArray9;
        hashMap0.clear();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap((int) (byte) 1);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap.Entry[] entryArray17 = hashMap16.table;
        java.lang.Object obj19 = hashMap16.get((java.lang.Object) (short) 1);
        hashMap16.modCount = ' ';
        int int22 = hashMap16.modCount;
        java.lang.Object obj23 = hashMap13.remove((java.lang.Object) hashMap16);
        java.lang.Object obj24 = hashMap0.remove((java.lang.Object) hashMap13);
        boolean boolean25 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        boolean boolean27 = hashMap26.isEmpty();
        int int28 = hashMap26.size();
        hashMap26.clear();
        int int30 = hashMap26.modCount;
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap(0, (float) (short) 100);
        hashMap33.clear();
        java.lang.Object obj35 = hashMap26.remove((java.lang.Object) hashMap33);
        system.testclass.HashMap.Entry[] entryArray36 = hashMap26.table;
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        int int38 = hashMap37.modCount;
        int int39 = hashMap37.modCount;
        hashMap37.clear();
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        boolean boolean42 = hashMap41.isEmpty();
        int int43 = hashMap41.size();
        hashMap41.clear();
        int int45 = hashMap41.modCount;
        java.lang.Object obj46 = hashMap37.get((java.lang.Object) hashMap41);
        system.testclass.HashMap.Entry[] entryArray47 = hashMap37.table;
        hashMap26.table = entryArray47;
        hashMap0.table = entryArray47;
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap53 = new system.testclass.HashMap();
        boolean boolean54 = hashMap53.isEmpty();
        int int55 = hashMap53.size();
        hashMap53.clear();
        java.lang.Object obj57 = hashMap52.remove((java.lang.Object) hashMap53);
        int int58 = hashMap52.modCount;
        system.testclass.HashMap hashMap59 = new system.testclass.HashMap();
        int int60 = hashMap59.modCount;
        int int61 = hashMap59.modCount;
        system.testclass.HashMap.Entry[] entryArray62 = hashMap59.table;
        boolean boolean63 = hashMap59.isEmpty();
        int int64 = hashMap59.modCount;
        int int65 = hashMap59.modCount;
        system.testclass.HashMap.Entry[] entryArray66 = hashMap59.table;
        boolean boolean67 = hashMap59.isEmpty();
        system.testclass.HashMap hashMap68 = new system.testclass.HashMap();
        int int69 = hashMap68.modCount;
        int int70 = hashMap68.modCount;
        int int71 = hashMap68.size();
        java.lang.Object obj72 = null;
        java.lang.Object obj73 = hashMap68.get(obj72);
        hashMap68.clear();
        java.lang.Object obj75 = hashMap59.get((java.lang.Object) hashMap68);
        hashMap59.clear();
        system.testclass.HashMap.Entry[] entryArray77 = hashMap59.table;
        java.lang.Object obj78 = hashMap0.put((java.lang.Object) hashMap52, (java.lang.Object) entryArray77);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(97);
        int int2 = hashMap1.size();
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        system.testclass.HashMap.Entry[] entryArray6 = hashMap3.table;
        hashMap3.clear();
        java.lang.Object obj9 = hashMap3.remove((java.lang.Object) 0.0d);
        java.lang.Object obj11 = hashMap3.remove((java.lang.Object) (short) 0);
        int int12 = hashMap3.size();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap((int) (byte) 0);
        int int15 = hashMap14.modCount;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        boolean boolean17 = hashMap16.isEmpty();
        int int18 = hashMap16.size();
        system.testclass.HashMap.Entry[] entryArray19 = hashMap16.table;
        java.lang.Object obj20 = hashMap14.remove((java.lang.Object) entryArray19);
        hashMap3.table = entryArray19;
        hashMap1.table = entryArray19;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(1, (float) '4');
        hashMap2.clear();
        boolean boolean4 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) (short) 1);
        java.lang.Object obj7 = hashMap2.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) (short) 0, (float) 1L);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        int int13 = hashMap11.modCount;
        system.testclass.HashMap.Entry[] entryArray14 = hashMap11.table;
        hashMap11.clear();
        java.lang.Object obj17 = hashMap11.remove((java.lang.Object) 0.0d);
        hashMap11.clear();
        system.testclass.HashMap.Entry[] entryArray19 = hashMap11.table;
        hashMap11.clear();
        java.lang.Object obj22 = hashMap11.get((java.lang.Object) (-1.0f));
        java.lang.Object obj23 = hashMap2.put((java.lang.Object) 1L, (java.lang.Object) hashMap11);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        hashMap0.modCount = '#';
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap(100, (float) 'a');
        system.testclass.HashMap.Entry[] entryArray9 = hashMap8.table;
        hashMap0.table = entryArray9;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        boolean boolean4 = hashMap0.isEmpty();
        int int5 = hashMap0.modCount;
        int int6 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray7 = hashMap0.table;
        hashMap0.modCount = 0;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.modCount;
        int int12 = hashMap10.modCount;
        system.testclass.HashMap.Entry[] entryArray13 = hashMap10.table;
        boolean boolean14 = hashMap10.isEmpty();
        int int15 = hashMap10.modCount;
        int int16 = hashMap10.modCount;
        system.testclass.HashMap.Entry[] entryArray17 = hashMap10.table;
        boolean boolean18 = hashMap10.isEmpty();
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        int int20 = hashMap19.modCount;
        int int21 = hashMap19.modCount;
        int int22 = hashMap19.size();
        java.lang.Object obj23 = null;
        java.lang.Object obj24 = hashMap19.get(obj23);
        hashMap19.clear();
        java.lang.Object obj26 = hashMap10.get((java.lang.Object) hashMap19);
        hashMap10.clear();
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        int int32 = hashMap31.modCount;
        int int33 = hashMap31.modCount;
        hashMap31.clear();
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        boolean boolean36 = hashMap35.isEmpty();
        int int37 = hashMap35.size();
        hashMap35.clear();
        int int39 = hashMap35.modCount;
        java.lang.Object obj40 = hashMap31.get((java.lang.Object) hashMap35);
        system.testclass.HashMap.Entry[] entryArray41 = hashMap31.table;
        java.lang.Object obj42 = hashMap30.get((java.lang.Object) hashMap31);
        boolean boolean43 = hashMap31.isEmpty();
        java.lang.Object obj44 = hashMap0.put((java.lang.Object) hashMap10, (java.lang.Object) boolean43);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 1);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap.Entry[] entryArray5 = hashMap4.table;
        java.lang.Object obj7 = hashMap4.get((java.lang.Object) (short) 1);
        hashMap4.modCount = ' ';
        int int10 = hashMap4.modCount;
        java.lang.Object obj11 = hashMap1.remove((java.lang.Object) hashMap4);
        int int12 = hashMap4.size();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap(10, (float) (short) 100);
        int int16 = hashMap15.size();
        system.testclass.HashMap.Entry[] entryArray17 = hashMap15.table;
        hashMap4.table = entryArray17;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap4", hashMap4.repOK_1());
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) '4');
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap(10, (float) (short) 100);
        int int5 = hashMap4.size();
        system.testclass.HashMap.Entry[] entryArray6 = hashMap4.table;
        java.lang.Object obj8 = hashMap4.remove((java.lang.Object) 0L);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        hashMap9.modCount = (short) 1;
        system.testclass.HashMap.Entry[] entryArray12 = hashMap9.table;
        java.lang.Object obj13 = hashMap4.remove((java.lang.Object) hashMap9);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.modCount;
        int int16 = hashMap14.modCount;
        system.testclass.HashMap.Entry[] entryArray17 = hashMap14.table;
        boolean boolean18 = hashMap14.isEmpty();
        int int19 = hashMap14.modCount;
        int int20 = hashMap14.modCount;
        system.testclass.HashMap.Entry[] entryArray21 = hashMap14.table;
        hashMap14.modCount = 0;
        java.lang.Object obj24 = hashMap1.put(obj13, (java.lang.Object) hashMap14);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap((int) (byte) 10, (float) (short) 1);
        java.lang.Object obj5 = hashMap1.get((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.modCount;
        int int8 = hashMap6.modCount;
        boolean boolean9 = hashMap6.isEmpty();
        boolean boolean10 = hashMap6.isEmpty();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap(10, (float) (short) 100);
        int int14 = hashMap13.size();
        system.testclass.HashMap.Entry[] entryArray15 = hashMap13.table;
        boolean boolean16 = hashMap13.isEmpty();
        java.lang.Object obj17 = hashMap1.put((java.lang.Object) hashMap6, (java.lang.Object) boolean16);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        int int4 = hashMap0.modCount;
        hashMap0.clear();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap(0);
        system.testclass.HashMap.Entry[] entryArray8 = hashMap7.table;
        java.lang.Class<?> wildcardClass9 = entryArray8.getClass();
        java.lang.Object obj10 = hashMap0.get((java.lang.Object) wildcardClass9);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        boolean boolean12 = hashMap11.isEmpty();
        int int13 = hashMap11.size();
        system.testclass.HashMap.Entry[] entryArray14 = hashMap11.table;
        hashMap11.modCount = (short) 1;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        boolean boolean18 = hashMap17.isEmpty();
        int int19 = hashMap17.size();
        system.testclass.HashMap.Entry[] entryArray20 = hashMap17.table;
        hashMap11.table = entryArray20;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap((int) (byte) 0);
        int int24 = hashMap23.modCount;
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        boolean boolean26 = hashMap25.isEmpty();
        int int27 = hashMap25.size();
        system.testclass.HashMap.Entry[] entryArray28 = hashMap25.table;
        java.lang.Object obj29 = hashMap23.remove((java.lang.Object) entryArray28);
        java.lang.Object obj30 = hashMap0.put((java.lang.Object) hashMap11, (java.lang.Object) hashMap23);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        hashMap0.modCount = (short) 1;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        int int8 = hashMap6.size();
        system.testclass.HashMap.Entry[] entryArray9 = hashMap6.table;
        hashMap0.table = entryArray9;
        hashMap0.clear();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap((int) (byte) 1);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap.Entry[] entryArray17 = hashMap16.table;
        java.lang.Object obj19 = hashMap16.get((java.lang.Object) (short) 1);
        hashMap16.modCount = ' ';
        int int22 = hashMap16.modCount;
        java.lang.Object obj23 = hashMap13.remove((java.lang.Object) hashMap16);
        java.lang.Object obj24 = hashMap0.remove((java.lang.Object) hashMap13);
        boolean boolean25 = hashMap0.isEmpty();
        hashMap0.modCount = (short) 10;
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        int int29 = hashMap28.modCount;
        int int30 = hashMap28.modCount;
        hashMap28.clear();
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        boolean boolean33 = hashMap32.isEmpty();
        int int34 = hashMap32.size();
        hashMap32.clear();
        int int36 = hashMap32.modCount;
        java.lang.Object obj37 = hashMap28.get((java.lang.Object) hashMap32);
        system.testclass.HashMap.Entry[] entryArray38 = hashMap28.table;
        hashMap0.table = entryArray38;
        boolean boolean40 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int44 = hashMap43.modCount;
        hashMap43.modCount = 97;
        hashMap43.clear();
        java.lang.Object obj49 = hashMap43.remove((java.lang.Object) "hi!");
        boolean boolean50 = hashMap43.isEmpty();
        java.lang.Object obj52 = hashMap43.get((java.lang.Object) 100L);
        system.testclass.HashMap hashMap55 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int56 = hashMap55.modCount;
        hashMap55.modCount = 97;
        hashMap55.clear();
        java.lang.Object obj60 = hashMap0.put((java.lang.Object) hashMap43, (java.lang.Object) hashMap55);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        hashMap0.clear();
        java.lang.Object obj6 = hashMap0.remove((java.lang.Object) 0.0d);
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) (short) 0);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        int int11 = hashMap9.modCount;
        int int12 = hashMap9.size();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = hashMap9.get(obj13);
        hashMap9.clear();
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        int int17 = hashMap16.modCount;
        int int18 = hashMap16.modCount;
        system.testclass.HashMap.Entry[] entryArray19 = hashMap16.table;
        hashMap16.clear();
        boolean boolean21 = hashMap16.isEmpty();
        int int22 = hashMap16.size();
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        int int24 = hashMap23.modCount;
        int int25 = hashMap23.modCount;
        system.testclass.HashMap.Entry[] entryArray26 = hashMap23.table;
        hashMap23.clear();
        java.lang.Object obj29 = hashMap23.remove((java.lang.Object) 0.0d);
        system.testclass.HashMap.Entry[] entryArray30 = hashMap23.table;
        java.lang.Object obj31 = hashMap16.get((java.lang.Object) entryArray30);
        java.lang.Object obj32 = hashMap9.get(obj31);
        boolean boolean33 = hashMap9.isEmpty();
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap.Entry[] entryArray37 = hashMap36.table;
        int int38 = hashMap36.modCount;
        int int39 = hashMap36.size();
        int int40 = hashMap36.size();
        java.lang.Object obj41 = hashMap0.put((java.lang.Object) boolean33, (java.lang.Object) int40);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap.Entry[] entryArray7 = hashMap6.table;
        java.lang.Object obj9 = hashMap6.get((java.lang.Object) (short) 1);
        hashMap6.modCount = ' ';
        int int12 = hashMap6.modCount;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        boolean boolean17 = hashMap16.isEmpty();
        int int18 = hashMap16.size();
        hashMap16.clear();
        java.lang.Object obj20 = hashMap15.remove((java.lang.Object) hashMap16);
        int int21 = hashMap15.size();
        system.testclass.HashMap.Entry[] entryArray22 = hashMap15.table;
        hashMap6.table = entryArray22;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        boolean boolean25 = hashMap24.isEmpty();
        java.lang.Object obj26 = hashMap0.put((java.lang.Object) hashMap6, (java.lang.Object) hashMap24);
        boolean boolean27 = hashMap0.isEmpty();
        int int28 = hashMap0.modCount;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        hashMap0.clear();
        java.lang.Object obj6 = hashMap0.remove((java.lang.Object) 0.0d);
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) (short) 0);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        int int11 = hashMap9.modCount;
        hashMap9.clear();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        boolean boolean14 = hashMap13.isEmpty();
        int int15 = hashMap13.size();
        hashMap13.clear();
        int int17 = hashMap13.modCount;
        java.lang.Object obj18 = hashMap9.get((java.lang.Object) hashMap13);
        system.testclass.HashMap.Entry[] entryArray19 = hashMap9.table;
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        int int21 = hashMap20.modCount;
        int int22 = hashMap20.modCount;
        hashMap20.modCount = '#';
        int int25 = hashMap20.size();
        java.lang.Object obj27 = hashMap9.put((java.lang.Object) hashMap20, (java.lang.Object) 1L);
        hashMap9.modCount = (short) 10;
        java.lang.Object obj30 = hashMap0.get((java.lang.Object) hashMap9);
        boolean boolean31 = hashMap9.isEmpty();
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        hashMap32.modCount = (short) 1;
        system.testclass.HashMap.Entry[] entryArray35 = hashMap32.table;
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        int int37 = hashMap36.modCount;
        int int38 = hashMap36.modCount;
        hashMap36.clear();
        hashMap36.clear();
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap((int) (byte) 0);
        int int43 = hashMap42.modCount;
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap();
        boolean boolean45 = hashMap44.isEmpty();
        int int46 = hashMap44.size();
        system.testclass.HashMap.Entry[] entryArray47 = hashMap44.table;
        java.lang.Object obj48 = hashMap42.remove((java.lang.Object) entryArray47);
        java.lang.Object obj49 = hashMap36.remove((java.lang.Object) entryArray47);
        system.testclass.HashMap.Entry[] entryArray50 = hashMap36.table;
        java.lang.Class<?> wildcardClass51 = hashMap36.getClass();
        java.lang.Object obj52 = hashMap9.put((java.lang.Object) hashMap32, (java.lang.Object) hashMap36);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap9", hashMap9.repOK_1());
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        boolean boolean4 = hashMap0.isEmpty();
        int int5 = hashMap0.modCount;
        int int6 = hashMap0.modCount;
        hashMap0.modCount = (byte) 0;
        int int9 = hashMap0.size();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        boolean boolean14 = hashMap13.isEmpty();
        int int15 = hashMap13.size();
        hashMap13.clear();
        java.lang.Object obj17 = hashMap12.remove((java.lang.Object) hashMap13);
        java.lang.Object obj19 = hashMap12.get((java.lang.Object) true);
        system.testclass.HashMap.Entry[] entryArray20 = hashMap12.table;
        java.lang.Object obj21 = hashMap0.get((java.lang.Object) hashMap12);
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        boolean boolean26 = hashMap25.isEmpty();
        int int27 = hashMap25.size();
        hashMap25.clear();
        java.lang.Object obj29 = hashMap24.remove((java.lang.Object) hashMap25);
        int int30 = hashMap24.size();
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int34 = hashMap33.modCount;
        system.testclass.HashMap.Entry[] entryArray35 = hashMap33.table;
        hashMap24.table = entryArray35;
        int int37 = hashMap24.size();
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap((int) (byte) 0);
        int int40 = hashMap39.modCount;
        system.testclass.HashMap.Entry[] entryArray41 = hashMap39.table;
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap();
        int int43 = hashMap42.modCount;
        int int44 = hashMap42.modCount;
        system.testclass.HashMap.Entry[] entryArray45 = hashMap42.table;
        hashMap42.clear();
        java.lang.Object obj48 = hashMap42.remove((java.lang.Object) 0.0d);
        java.lang.Object obj49 = hashMap24.put((java.lang.Object) entryArray41, (java.lang.Object) hashMap42);
        hashMap0.table = entryArray41;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        hashMap0.clear();
        java.lang.Object obj6 = hashMap0.remove((java.lang.Object) 0.0d);
        int int7 = hashMap0.size();
        hashMap0.clear();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int12 = hashMap11.modCount;
        system.testclass.HashMap.Entry[] entryArray13 = hashMap11.table;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.modCount;
        int int16 = hashMap14.modCount;
        system.testclass.HashMap.Entry[] entryArray17 = hashMap14.table;
        boolean boolean18 = hashMap14.isEmpty();
        int int19 = hashMap14.modCount;
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        int int21 = hashMap20.modCount;
        int int22 = hashMap20.modCount;
        system.testclass.HashMap.Entry[] entryArray23 = hashMap20.table;
        boolean boolean24 = hashMap20.isEmpty();
        int int25 = hashMap20.modCount;
        int int26 = hashMap20.modCount;
        system.testclass.HashMap.Entry[] entryArray27 = hashMap20.table;
        boolean boolean28 = hashMap20.isEmpty();
        java.lang.Object obj29 = hashMap14.remove((java.lang.Object) boolean28);
        int int30 = hashMap14.size();
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap(0, (float) (short) 100);
        hashMap33.clear();
        java.lang.Object obj35 = hashMap11.put((java.lang.Object) hashMap14, (java.lang.Object) hashMap33);
        boolean boolean36 = hashMap11.isEmpty();
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        int int38 = hashMap37.modCount;
        int int39 = hashMap37.modCount;
        system.testclass.HashMap.Entry[] entryArray40 = hashMap37.table;
        hashMap37.clear();
        java.lang.Object obj43 = hashMap37.remove((java.lang.Object) 0.0d);
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap();
        int int45 = hashMap44.modCount;
        int int46 = hashMap44.modCount;
        system.testclass.HashMap.Entry[] entryArray47 = hashMap44.table;
        hashMap44.clear();
        java.lang.Object obj50 = hashMap44.remove((java.lang.Object) 0.0d);
        java.lang.Object obj52 = hashMap44.remove((java.lang.Object) (short) 0);
        system.testclass.HashMap hashMap53 = new system.testclass.HashMap();
        int int54 = hashMap53.modCount;
        int int55 = hashMap53.modCount;
        hashMap53.clear();
        system.testclass.HashMap hashMap57 = new system.testclass.HashMap();
        boolean boolean58 = hashMap57.isEmpty();
        int int59 = hashMap57.size();
        hashMap57.clear();
        int int61 = hashMap57.modCount;
        java.lang.Object obj62 = hashMap53.get((java.lang.Object) hashMap57);
        system.testclass.HashMap.Entry[] entryArray63 = hashMap53.table;
        system.testclass.HashMap hashMap64 = new system.testclass.HashMap();
        int int65 = hashMap64.modCount;
        int int66 = hashMap64.modCount;
        hashMap64.modCount = '#';
        int int69 = hashMap64.size();
        java.lang.Object obj71 = hashMap53.put((java.lang.Object) hashMap64, (java.lang.Object) 1L);
        hashMap53.modCount = (short) 10;
        java.lang.Object obj74 = hashMap44.get((java.lang.Object) hashMap53);
        java.lang.Object obj75 = hashMap37.get(obj74);
        java.lang.Object obj76 = hashMap0.put((java.lang.Object) boolean36, obj75);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 100, (float) 100L);
        int int3 = hashMap2.modCount;
        hashMap2.modCount = '4';
        int int6 = hashMap2.modCount;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap((int) (short) 0, (float) 1L);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        int int12 = hashMap10.size();
        hashMap10.clear();
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap.Entry[] entryArray17 = hashMap16.table;
        java.lang.Object obj19 = hashMap16.get((java.lang.Object) (short) 1);
        hashMap16.modCount = ' ';
        int int22 = hashMap16.modCount;
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        boolean boolean27 = hashMap26.isEmpty();
        int int28 = hashMap26.size();
        hashMap26.clear();
        java.lang.Object obj30 = hashMap25.remove((java.lang.Object) hashMap26);
        int int31 = hashMap25.size();
        system.testclass.HashMap.Entry[] entryArray32 = hashMap25.table;
        hashMap16.table = entryArray32;
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        boolean boolean35 = hashMap34.isEmpty();
        java.lang.Object obj36 = hashMap10.put((java.lang.Object) hashMap16, (java.lang.Object) hashMap34);
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        boolean boolean38 = hashMap37.isEmpty();
        int int39 = hashMap37.size();
        hashMap37.clear();
        int int41 = hashMap37.modCount;
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap(0, (float) (short) 100);
        hashMap44.clear();
        java.lang.Object obj46 = hashMap37.remove((java.lang.Object) hashMap44);
        system.testclass.HashMap.Entry[] entryArray47 = hashMap37.table;
        java.lang.Object obj48 = hashMap16.get((java.lang.Object) entryArray47);
        java.lang.Object obj49 = hashMap9.get((java.lang.Object) entryArray47);
        hashMap2.table = entryArray47;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        hashMap0.clear();
        java.lang.Object obj6 = hashMap0.remove((java.lang.Object) 0.0d);
        hashMap0.clear();
        system.testclass.HashMap.Entry[] entryArray8 = hashMap0.table;
        hashMap0.clear();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        boolean boolean14 = hashMap13.isEmpty();
        int int15 = hashMap13.size();
        hashMap13.clear();
        java.lang.Object obj17 = hashMap12.remove((java.lang.Object) hashMap13);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        int int19 = hashMap18.modCount;
        int int20 = hashMap18.modCount;
        hashMap18.clear();
        int int22 = hashMap18.modCount;
        system.testclass.HashMap.Entry[] entryArray23 = hashMap18.table;
        hashMap18.modCount = '#';
        java.lang.Object obj26 = hashMap12.get((java.lang.Object) '#');
        boolean boolean27 = hashMap12.isEmpty();
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        boolean boolean29 = hashMap28.isEmpty();
        int int30 = hashMap28.size();
        system.testclass.HashMap.Entry[] entryArray31 = hashMap28.table;
        hashMap28.modCount = (short) 1;
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        boolean boolean35 = hashMap34.isEmpty();
        int int36 = hashMap34.size();
        system.testclass.HashMap.Entry[] entryArray37 = hashMap34.table;
        hashMap28.table = entryArray37;
        hashMap28.clear();
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap((int) (byte) 1);
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap.Entry[] entryArray45 = hashMap44.table;
        java.lang.Object obj47 = hashMap44.get((java.lang.Object) (short) 1);
        hashMap44.modCount = ' ';
        int int50 = hashMap44.modCount;
        java.lang.Object obj51 = hashMap41.remove((java.lang.Object) hashMap44);
        java.lang.Object obj52 = hashMap28.remove((java.lang.Object) hashMap41);
        hashMap41.modCount = 32;
        system.testclass.HashMap hashMap57 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap58 = new system.testclass.HashMap();
        boolean boolean59 = hashMap58.isEmpty();
        int int60 = hashMap58.size();
        hashMap58.clear();
        java.lang.Object obj62 = hashMap57.remove((java.lang.Object) hashMap58);
        int int63 = hashMap57.size();
        system.testclass.HashMap hashMap66 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int67 = hashMap66.modCount;
        system.testclass.HashMap.Entry[] entryArray68 = hashMap66.table;
        hashMap57.table = entryArray68;
        hashMap41.table = entryArray68;
        hashMap12.table = entryArray68;
        hashMap0.table = entryArray68;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        int int4 = hashMap0.modCount;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap(0, (float) (short) 100);
        hashMap7.clear();
        java.lang.Object obj9 = hashMap0.remove((java.lang.Object) hashMap7);
        boolean boolean10 = hashMap7.isEmpty();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        hashMap12.modCount = 0;
        boolean boolean15 = hashMap12.isEmpty();
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap(100, 100.0f);
        java.lang.Object obj19 = hashMap12.get((java.lang.Object) hashMap18);
        java.lang.Object obj20 = hashMap7.put((java.lang.Object) (-1L), (java.lang.Object) hashMap12);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap7", hashMap7.repOK_1());
    }
}

