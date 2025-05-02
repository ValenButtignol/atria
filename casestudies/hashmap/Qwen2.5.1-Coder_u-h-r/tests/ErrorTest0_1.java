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
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        hashMap0.modCount = 'a';
        int int6 = hashMap0.modCount;
        hashMap0.clear();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        int int10 = hashMap8.size();
        hashMap8.modCount = 10;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap((int) (byte) 0);
        java.lang.Object obj15 = hashMap0.put((java.lang.Object) 10, (java.lang.Object) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        int int4 = hashMap0.size();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap.Entry[] entryArray8 = hashMap7.table;
        java.lang.Class<?> wildcardClass9 = entryArray8.getClass();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.modCount;
        int int12 = hashMap10.modCount;
        system.testclass.HashMap.Entry[] entryArray13 = hashMap10.table;
        java.lang.Object obj14 = hashMap0.put((java.lang.Object) wildcardClass9, (java.lang.Object) entryArray13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 100, (float) 100L);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        hashMap3.modCount = 0;
        int int6 = hashMap3.size();
        java.lang.Object obj8 = hashMap2.put((java.lang.Object) int6, (java.lang.Object) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (short) 100);
        hashMap2.clear();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int7 = hashMap6.modCount;
        java.lang.Class<?> wildcardClass8 = hashMap6.getClass();
        java.lang.Object obj9 = hashMap2.remove((java.lang.Object) wildcardClass8);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.modCount;
        int int12 = hashMap10.modCount;
        system.testclass.HashMap.Entry[] entryArray13 = hashMap10.table;
        boolean boolean14 = hashMap10.isEmpty();
        int int15 = hashMap10.modCount;
        int int16 = hashMap10.modCount;
        java.lang.Class<?> wildcardClass17 = hashMap10.getClass();
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        boolean boolean19 = hashMap18.isEmpty();
        int int20 = hashMap18.size();
        system.testclass.HashMap.Entry[] entryArray21 = hashMap18.table;
        java.lang.Object obj22 = hashMap2.put((java.lang.Object) wildcardClass17, (java.lang.Object) entryArray21);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        int int4 = hashMap0.size();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        hashMap5.clear();
        int int9 = hashMap5.modCount;
        system.testclass.HashMap.Entry[] entryArray10 = hashMap5.table;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap((int) (byte) 0);
        java.lang.Object obj13 = hashMap0.put((java.lang.Object) hashMap5, (java.lang.Object) hashMap12);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap.Entry[] entryArray3 = hashMap2.table;
        java.lang.Object obj5 = hashMap2.get((java.lang.Object) (short) 1);
        hashMap2.modCount = ' ';
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        boolean boolean12 = hashMap11.isEmpty();
        int int13 = hashMap11.size();
        hashMap11.clear();
        java.lang.Object obj15 = hashMap10.remove((java.lang.Object) hashMap11);
        int int16 = hashMap10.modCount;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap((int) (byte) 1);
        java.lang.Object obj19 = hashMap2.put((java.lang.Object) hashMap10, (java.lang.Object) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
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
        int int10 = hashMap4.modCount;
        int int11 = hashMap4.modCount;
        system.testclass.HashMap.Entry entry12 = null;
        system.testclass.HashMap.Entry[] entryArray13 = new system.testclass.HashMap.Entry[] { entry12 };
        hashMap4.table = entryArray13;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap4", hashMap4.repOK_1());
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (short) 100);
        hashMap2.clear();
        int int4 = hashMap2.size();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) (byte) 0);
        java.lang.Class<?> wildcardClass11 = hashMap10.getClass();
        java.lang.Object obj12 = hashMap8.get((java.lang.Object) hashMap10);
        hashMap8.clear();
        system.testclass.HashMap.Entry[] entryArray14 = hashMap8.table;
        java.lang.Object obj15 = hashMap2.put((java.lang.Object) 0, (java.lang.Object) hashMap8);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        hashMap0.clear();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        system.testclass.HashMap.Entry[] entryArray7 = hashMap4.table;
        boolean boolean8 = hashMap4.isEmpty();
        int int9 = hashMap4.modCount;
        int int10 = hashMap4.modCount;
        int int11 = hashMap4.modCount;
        java.lang.Object obj13 = hashMap0.put((java.lang.Object) int11, (java.lang.Object) 10.0f);
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
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        boolean boolean4 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap.Entry[] entryArray8 = hashMap7.table;
        java.lang.Object obj9 = hashMap0.get((java.lang.Object) entryArray8);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap(97, 10.0f);
        java.lang.Object obj14 = hashMap0.put((java.lang.Object) 100L, (java.lang.Object) hashMap13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        int int3 = hashMap0.size();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        java.lang.Object obj7 = hashMap4.get((java.lang.Object) 10.0d);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray11 = hashMap10.table;
        int int12 = hashMap10.size();
        java.lang.Object obj13 = hashMap0.put((java.lang.Object) hashMap4, (java.lang.Object) hashMap10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        int int3 = hashMap0.size();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap(0);
        system.testclass.HashMap.Entry[] entryArray6 = hashMap5.table;
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) hashMap5);
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = hashMap5.get(obj8);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        hashMap11.modCount = 0;
        hashMap11.clear();
        java.lang.Object obj15 = hashMap5.put((java.lang.Object) '4', (java.lang.Object) hashMap11);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap5", hashMap5.repOK_1());
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        hashMap0.clear();
        java.lang.Object obj6 = hashMap0.remove((java.lang.Object) 0.0d);
        boolean boolean7 = hashMap0.isEmpty();
        int int8 = hashMap0.size();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        hashMap9.modCount = 0;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        int int13 = hashMap12.modCount;
        int int14 = hashMap12.modCount;
        system.testclass.HashMap.Entry[] entryArray15 = hashMap12.table;
        hashMap12.clear();
        boolean boolean17 = hashMap12.isEmpty();
        java.lang.Object obj18 = hashMap9.get((java.lang.Object) boolean17);
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap.Entry[] entryArray22 = hashMap21.table;
        hashMap21.clear();
        java.lang.Object obj24 = hashMap0.put((java.lang.Object) hashMap9, (java.lang.Object) hashMap21);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 100);
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
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        int int17 = hashMap15.modCount;
        system.testclass.HashMap.Entry[] entryArray18 = hashMap15.table;
        hashMap15.clear();
        java.lang.Object obj21 = hashMap15.remove((java.lang.Object) 0.0d);
        java.lang.Object obj23 = hashMap15.remove((java.lang.Object) (short) 0);
        int int24 = hashMap15.size();
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap((int) (byte) 0);
        int int27 = hashMap26.modCount;
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        boolean boolean29 = hashMap28.isEmpty();
        int int30 = hashMap28.size();
        system.testclass.HashMap.Entry[] entryArray31 = hashMap28.table;
        java.lang.Object obj32 = hashMap26.remove((java.lang.Object) entryArray31);
        hashMap15.table = entryArray31;
        hashMap2.table = entryArray31;
        hashMap1.table = entryArray31;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int3 = hashMap2.modCount;
        system.testclass.HashMap.Entry[] entryArray4 = hashMap2.table;
        hashMap2.modCount = (short) -1;
        java.lang.Object obj9 = hashMap2.put((java.lang.Object) 1.0f, (java.lang.Object) 100.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        int int5 = hashMap3.size();
        hashMap3.clear();
        java.lang.Object obj7 = hashMap2.remove((java.lang.Object) hashMap3);
        java.lang.Object obj9 = hashMap2.get((java.lang.Object) 0L);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        int int12 = hashMap10.size();
        system.testclass.HashMap.Entry[] entryArray13 = hashMap10.table;
        hashMap10.modCount = (short) 1;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        int int17 = hashMap16.modCount;
        int int18 = hashMap16.modCount;
        hashMap16.clear();
        java.lang.Object obj20 = null;
        java.lang.Object obj21 = hashMap16.remove(obj20);
        java.lang.Object obj22 = hashMap2.put((java.lang.Object) hashMap10, (java.lang.Object) hashMap16);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        hashMap0.clear();
        java.lang.Object obj6 = hashMap0.remove((java.lang.Object) 0.0d);
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) (short) 0);
        int int9 = hashMap0.size();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap((int) (byte) 0);
        int int12 = hashMap11.modCount;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        boolean boolean14 = hashMap13.isEmpty();
        int int15 = hashMap13.size();
        system.testclass.HashMap.Entry[] entryArray16 = hashMap13.table;
        java.lang.Object obj17 = hashMap11.remove((java.lang.Object) entryArray16);
        hashMap0.table = entryArray16;
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap((int) (short) 10);
        hashMap22.modCount = 97;
        java.lang.Object obj25 = hashMap0.put((java.lang.Object) 0, (java.lang.Object) 97);
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
        int int3 = hashMap0.size();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap(0);
        system.testclass.HashMap.Entry[] entryArray6 = hashMap5.table;
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) hashMap5);
        java.lang.Object obj9 = hashMap0.get((java.lang.Object) (-1L));
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.modCount;
        int int12 = hashMap10.modCount;
        system.testclass.HashMap.Entry[] entryArray13 = hashMap10.table;
        boolean boolean14 = hashMap10.isEmpty();
        int int15 = hashMap10.modCount;
        int int16 = hashMap10.modCount;
        system.testclass.HashMap.Entry[] entryArray17 = hashMap10.table;
        hashMap0.table = entryArray17;
        int int19 = hashMap0.modCount;
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        java.lang.Object obj24 = hashMap22.get((java.lang.Object) '#');
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        int int26 = hashMap25.modCount;
        int int27 = hashMap25.modCount;
        system.testclass.HashMap.Entry[] entryArray28 = hashMap25.table;
        hashMap22.table = entryArray28;
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap((int) 'a');
        java.lang.Object obj32 = hashMap0.put((java.lang.Object) hashMap22, (java.lang.Object) hashMap31);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) ' ', (float) 1);
        hashMap2.clear();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        int int6 = hashMap4.size();
        int int7 = hashMap4.size();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap(0);
        system.testclass.HashMap.Entry[] entryArray10 = hashMap9.table;
        java.lang.Object obj11 = hashMap4.remove((java.lang.Object) hashMap9);
        java.lang.Object obj13 = hashMap4.get((java.lang.Object) (-1L));
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.modCount;
        int int16 = hashMap14.modCount;
        system.testclass.HashMap.Entry[] entryArray17 = hashMap14.table;
        boolean boolean18 = hashMap14.isEmpty();
        int int19 = hashMap14.modCount;
        int int20 = hashMap14.modCount;
        system.testclass.HashMap.Entry[] entryArray21 = hashMap14.table;
        hashMap4.table = entryArray21;
        int int23 = hashMap4.modCount;
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap((int) (byte) 0);
        int int26 = hashMap25.modCount;
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        boolean boolean28 = hashMap27.isEmpty();
        int int29 = hashMap27.size();
        system.testclass.HashMap.Entry[] entryArray30 = hashMap27.table;
        java.lang.Object obj31 = hashMap25.remove((java.lang.Object) entryArray30);
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        boolean boolean33 = hashMap32.isEmpty();
        int int34 = hashMap32.size();
        system.testclass.HashMap.Entry[] entryArray35 = hashMap32.table;
        hashMap25.table = entryArray35;
        java.lang.Object obj37 = hashMap4.remove((java.lang.Object) entryArray35);
        hashMap2.table = entryArray35;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
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
        boolean boolean11 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int15 = hashMap14.modCount;
        java.lang.Object obj16 = null;
        java.lang.Object obj17 = hashMap0.put((java.lang.Object) hashMap14, obj16);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int3 = hashMap2.modCount;
        hashMap2.modCount = 97;
        hashMap2.clear();
        hashMap2.clear();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.modCount;
        int int10 = hashMap8.modCount;
        system.testclass.HashMap.Entry[] entryArray11 = hashMap8.table;
        hashMap8.clear();
        java.lang.Object obj14 = hashMap8.remove((java.lang.Object) 0.0d);
        system.testclass.HashMap.Entry[] entryArray15 = hashMap8.table;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        java.lang.Class<?> wildcardClass19 = hashMap18.getClass();
        java.lang.Object obj20 = hashMap2.put((java.lang.Object) hashMap8, (java.lang.Object) wildcardClass19);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(1);
        hashMap1.clear();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        boolean boolean6 = hashMap5.isEmpty();
        int int7 = hashMap5.size();
        int int8 = hashMap5.size();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap(0);
        system.testclass.HashMap.Entry[] entryArray11 = hashMap10.table;
        java.lang.Object obj12 = hashMap5.remove((java.lang.Object) hashMap10);
        java.lang.Object obj14 = hashMap5.get((java.lang.Object) (-1L));
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        int int17 = hashMap15.modCount;
        system.testclass.HashMap.Entry[] entryArray18 = hashMap15.table;
        boolean boolean19 = hashMap15.isEmpty();
        int int20 = hashMap15.modCount;
        int int21 = hashMap15.modCount;
        system.testclass.HashMap.Entry[] entryArray22 = hashMap15.table;
        hashMap5.table = entryArray22;
        java.lang.Object obj24 = hashMap1.put((java.lang.Object) hashMap4, (java.lang.Object) hashMap5);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int3 = hashMap2.modCount;
        hashMap2.modCount = 97;
        hashMap2.clear();
        java.lang.Object obj8 = hashMap2.remove((java.lang.Object) "hi!");
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap.Entry[] entryArray12 = hashMap11.table;
        java.lang.Object obj14 = hashMap11.get((java.lang.Object) (short) 1);
        hashMap11.modCount = ' ';
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap((int) (short) 10);
        boolean boolean19 = hashMap18.isEmpty();
        hashMap18.modCount = (byte) 100;
        java.lang.Object obj22 = hashMap2.put((java.lang.Object) hashMap11, (java.lang.Object) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        hashMap0.clear();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int8 = hashMap7.modCount;
        system.testclass.HashMap.Entry[] entryArray9 = hashMap7.table;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap((int) (byte) 0);
        int int12 = hashMap11.modCount;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        boolean boolean14 = hashMap13.isEmpty();
        int int15 = hashMap13.size();
        system.testclass.HashMap.Entry[] entryArray16 = hashMap13.table;
        java.lang.Object obj17 = hashMap11.remove((java.lang.Object) entryArray16);
        int int18 = hashMap11.size();
        java.lang.Object obj19 = hashMap0.put((java.lang.Object) entryArray9, (java.lang.Object) hashMap11);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        int int4 = hashMap0.modCount;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap(0);
        system.testclass.HashMap.Entry[] entryArray7 = hashMap6.table;
        boolean boolean8 = hashMap6.isEmpty();
        system.testclass.HashMap.Entry[] entryArray9 = hashMap6.table;
        hashMap0.table = entryArray9;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap.Entry[] entryArray3 = hashMap2.table;
        int int4 = hashMap2.size();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) '#');
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int10 = hashMap9.modCount;
        system.testclass.HashMap.Entry[] entryArray11 = hashMap9.table;
        java.lang.Object obj12 = hashMap2.put((java.lang.Object) hashMap6, (java.lang.Object) entryArray11);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
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
        int int10 = hashMap4.modCount;
        int int11 = hashMap4.modCount;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        int int13 = hashMap12.modCount;
        int int14 = hashMap12.modCount;
        system.testclass.HashMap.Entry[] entryArray15 = hashMap12.table;
        hashMap12.clear();
        java.lang.Object obj18 = hashMap12.remove((java.lang.Object) 0.0d);
        int int19 = hashMap12.size();
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        hashMap20.modCount = 0;
        hashMap20.clear();
        java.lang.Object obj24 = hashMap12.get((java.lang.Object) hashMap20);
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap(0, (float) (short) 100);
        hashMap27.clear();
        hashMap27.modCount = (byte) -1;
        system.testclass.HashMap.Entry[] entryArray31 = hashMap27.table;
        java.lang.Object obj32 = hashMap4.put(obj24, (java.lang.Object) entryArray31);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap4", hashMap4.repOK_1());
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int3 = hashMap2.modCount;
        system.testclass.HashMap.Entry[] entryArray4 = hashMap2.table;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        int int10 = hashMap8.size();
        hashMap8.clear();
        java.lang.Object obj12 = hashMap7.remove((java.lang.Object) hashMap8);
        hashMap8.clear();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        boolean boolean15 = hashMap14.isEmpty();
        int int16 = hashMap14.size();
        int int17 = hashMap14.size();
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap(0);
        system.testclass.HashMap.Entry[] entryArray20 = hashMap19.table;
        java.lang.Object obj21 = hashMap14.remove((java.lang.Object) hashMap19);
        java.lang.Object obj23 = hashMap14.get((java.lang.Object) (-1L));
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.modCount;
        int int26 = hashMap24.modCount;
        system.testclass.HashMap.Entry[] entryArray27 = hashMap24.table;
        boolean boolean28 = hashMap24.isEmpty();
        int int29 = hashMap24.modCount;
        int int30 = hashMap24.modCount;
        system.testclass.HashMap.Entry[] entryArray31 = hashMap24.table;
        hashMap14.table = entryArray31;
        java.lang.Object obj33 = hashMap2.put((java.lang.Object) hashMap8, (java.lang.Object) entryArray31);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        hashMap0.clear();
        java.lang.Object obj6 = hashMap0.remove((java.lang.Object) 0.0d);
        int int7 = hashMap0.size();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        int int10 = hashMap8.size();
        int int11 = hashMap8.size();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap(0);
        system.testclass.HashMap.Entry[] entryArray14 = hashMap13.table;
        java.lang.Object obj15 = hashMap8.remove((java.lang.Object) hashMap13);
        java.lang.Object obj17 = hashMap8.get((java.lang.Object) (-1L));
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        int int19 = hashMap18.modCount;
        int int20 = hashMap18.modCount;
        system.testclass.HashMap.Entry[] entryArray21 = hashMap18.table;
        boolean boolean22 = hashMap18.isEmpty();
        int int23 = hashMap18.modCount;
        int int24 = hashMap18.modCount;
        system.testclass.HashMap.Entry[] entryArray25 = hashMap18.table;
        hashMap8.table = entryArray25;
        int int27 = hashMap8.modCount;
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap((int) (byte) 0);
        int int30 = hashMap29.modCount;
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        boolean boolean32 = hashMap31.isEmpty();
        int int33 = hashMap31.size();
        system.testclass.HashMap.Entry[] entryArray34 = hashMap31.table;
        java.lang.Object obj35 = hashMap29.remove((java.lang.Object) entryArray34);
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        boolean boolean37 = hashMap36.isEmpty();
        int int38 = hashMap36.size();
        system.testclass.HashMap.Entry[] entryArray39 = hashMap36.table;
        hashMap29.table = entryArray39;
        java.lang.Object obj41 = hashMap8.remove((java.lang.Object) entryArray39);
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap((int) (byte) 1);
        java.lang.Object obj44 = hashMap0.put(obj41, (java.lang.Object) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) 10.0d);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int7 = hashMap6.modCount;
        system.testclass.HashMap.Entry[] entryArray8 = hashMap6.table;
        java.lang.Object obj9 = hashMap0.get((java.lang.Object) entryArray8);
        int int10 = hashMap0.size();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int14 = hashMap13.modCount;
        system.testclass.HashMap.Entry entry15 = null;
        system.testclass.HashMap.Entry[] entryArray16 = new system.testclass.HashMap.Entry[] { entry15 };
        hashMap13.table = entryArray16;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap(0);
        system.testclass.HashMap.Entry[] entryArray20 = hashMap19.table;
        hashMap13.table = entryArray20;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap(97, 10.0f);
        int int25 = hashMap24.size();
        java.lang.Object obj26 = hashMap0.put((java.lang.Object) hashMap13, (java.lang.Object) hashMap24);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        int int3 = hashMap0.size();
        hashMap0.modCount = (short) 100;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap.Entry[] entryArray9 = hashMap8.table;
        hashMap8.clear();
        system.testclass.HashMap.Entry[] entryArray11 = hashMap8.table;
        hashMap0.table = entryArray11;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        system.testclass.HashMap.Entry[] entryArray6 = hashMap3.table;
        hashMap3.clear();
        java.lang.Object obj9 = hashMap3.remove((java.lang.Object) 0.0d);
        boolean boolean10 = hashMap3.isEmpty();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        boolean boolean12 = hashMap11.isEmpty();
        int int13 = hashMap11.size();
        hashMap11.clear();
        java.lang.Object obj15 = hashMap3.get((java.lang.Object) hashMap11);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        boolean boolean17 = hashMap16.isEmpty();
        int int18 = hashMap16.size();
        hashMap16.clear();
        hashMap16.modCount = 'a';
        int int22 = hashMap16.modCount;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        int int24 = hashMap23.modCount;
        int int25 = hashMap23.modCount;
        system.testclass.HashMap.Entry[] entryArray26 = hashMap23.table;
        hashMap23.clear();
        java.lang.Object obj29 = hashMap23.remove((java.lang.Object) 0.0d);
        boolean boolean30 = hashMap23.isEmpty();
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        boolean boolean32 = hashMap31.isEmpty();
        int int33 = hashMap31.size();
        hashMap31.clear();
        java.lang.Object obj35 = hashMap23.get((java.lang.Object) hashMap31);
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
        hashMap23.table = entryArray52;
        hashMap16.table = entryArray52;
        hashMap11.table = entryArray52;
        int int58 = hashMap11.size();
        system.testclass.HashMap hashMap61 = new system.testclass.HashMap(0, (float) (short) 100);
        int int62 = hashMap61.modCount;
        hashMap61.modCount = 100;
        java.lang.Object obj65 = hashMap2.put((java.lang.Object) hashMap11, (java.lang.Object) hashMap61);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        boolean boolean4 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap.Entry[] entryArray8 = hashMap7.table;
        java.lang.Object obj9 = hashMap0.get((java.lang.Object) entryArray8);
        int int10 = hashMap0.modCount;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap(0);
        system.testclass.HashMap.Entry[] entryArray13 = hashMap12.table;
        boolean boolean14 = hashMap12.isEmpty();
        system.testclass.HashMap.Entry[] entryArray15 = hashMap12.table;
        hashMap12.modCount = (byte) 1;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        int int19 = hashMap18.modCount;
        int int20 = hashMap18.modCount;
        hashMap18.clear();
        int int22 = hashMap18.modCount;
        system.testclass.HashMap.Entry[] entryArray23 = hashMap18.table;
        hashMap18.modCount = '#';
        java.lang.Object obj26 = hashMap0.put((java.lang.Object) hashMap12, (java.lang.Object) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        java.lang.Object obj2 = null;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        int int5 = hashMap3.size();
        hashMap3.clear();
        hashMap3.modCount = 'a';
        int int9 = hashMap3.modCount;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.modCount;
        int int12 = hashMap10.modCount;
        system.testclass.HashMap.Entry[] entryArray13 = hashMap10.table;
        hashMap10.clear();
        java.lang.Object obj16 = hashMap10.remove((java.lang.Object) 0.0d);
        boolean boolean17 = hashMap10.isEmpty();
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        boolean boolean19 = hashMap18.isEmpty();
        int int20 = hashMap18.size();
        hashMap18.clear();
        java.lang.Object obj22 = hashMap10.get((java.lang.Object) hashMap18);
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        int int24 = hashMap23.modCount;
        int int25 = hashMap23.modCount;
        system.testclass.HashMap.Entry[] entryArray26 = hashMap23.table;
        hashMap23.clear();
        java.lang.Object obj29 = hashMap23.remove((java.lang.Object) 0.0d);
        java.lang.Object obj31 = hashMap23.remove((java.lang.Object) (short) 0);
        int int32 = hashMap23.size();
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap((int) (byte) 0);
        int int35 = hashMap34.modCount;
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        boolean boolean37 = hashMap36.isEmpty();
        int int38 = hashMap36.size();
        system.testclass.HashMap.Entry[] entryArray39 = hashMap36.table;
        java.lang.Object obj40 = hashMap34.remove((java.lang.Object) entryArray39);
        hashMap23.table = entryArray39;
        hashMap10.table = entryArray39;
        hashMap3.table = entryArray39;
        java.lang.Object obj44 = hashMap0.put(obj2, (java.lang.Object) hashMap3);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
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
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        system.testclass.HashMap.Entry[] entryArray16 = hashMap13.table;
        hashMap13.clear();
        java.lang.Object obj19 = hashMap13.remove((java.lang.Object) 0.0d);
        java.lang.Object obj21 = hashMap13.remove((java.lang.Object) (short) 0);
        int int22 = hashMap13.size();
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap((int) (byte) 0);
        int int25 = hashMap24.modCount;
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        boolean boolean27 = hashMap26.isEmpty();
        int int28 = hashMap26.size();
        system.testclass.HashMap.Entry[] entryArray29 = hashMap26.table;
        java.lang.Object obj30 = hashMap24.remove((java.lang.Object) entryArray29);
        hashMap13.table = entryArray29;
        hashMap0.table = entryArray29;
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        int int34 = hashMap33.modCount;
        int int35 = hashMap33.modCount;
        hashMap33.clear();
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        boolean boolean38 = hashMap37.isEmpty();
        int int39 = hashMap37.size();
        hashMap37.clear();
        int int41 = hashMap37.modCount;
        java.lang.Object obj42 = hashMap33.get((java.lang.Object) hashMap37);
        int int43 = hashMap37.modCount;
        boolean boolean44 = hashMap37.isEmpty();
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        int int46 = hashMap45.modCount;
        int int47 = hashMap45.modCount;
        system.testclass.HashMap.Entry[] entryArray48 = hashMap45.table;
        hashMap45.clear();
        java.lang.Object obj51 = hashMap45.remove((java.lang.Object) 0.0d);
        java.lang.Object obj53 = hashMap45.remove((java.lang.Object) (short) 0);
        boolean boolean54 = hashMap45.isEmpty();
        hashMap45.clear();
        java.lang.Object obj56 = hashMap0.put((java.lang.Object) hashMap37, (java.lang.Object) hashMap45);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        int int5 = hashMap3.size();
        hashMap3.clear();
        java.lang.Object obj7 = hashMap2.remove((java.lang.Object) hashMap3);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.modCount;
        int int10 = hashMap8.modCount;
        hashMap8.clear();
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = hashMap8.remove(obj12);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        boolean boolean15 = hashMap14.isEmpty();
        int int16 = hashMap14.size();
        system.testclass.HashMap.Entry[] entryArray17 = hashMap14.table;
        system.testclass.HashMap.Entry[] entryArray18 = hashMap14.table;
        java.lang.Object obj19 = hashMap3.put(obj13, (java.lang.Object) hashMap14);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap3", hashMap3.repOK_1());
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
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
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap((int) (byte) 0);
        int int15 = hashMap14.modCount;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        boolean boolean20 = hashMap19.isEmpty();
        int int21 = hashMap19.size();
        hashMap19.clear();
        java.lang.Object obj23 = hashMap18.remove((java.lang.Object) hashMap19);
        java.lang.Object obj24 = hashMap8.put((java.lang.Object) int15, (java.lang.Object) hashMap19);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap8", hashMap8.repOK_1());
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        java.lang.Object obj4 = hashMap2.get((java.lang.Object) '#');
        int int5 = hashMap2.size();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) (short) 10);
        boolean boolean8 = hashMap7.isEmpty();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        boolean boolean13 = hashMap12.isEmpty();
        int int14 = hashMap12.size();
        hashMap12.clear();
        java.lang.Object obj16 = hashMap11.remove((java.lang.Object) hashMap12);
        java.lang.Object obj17 = hashMap7.get((java.lang.Object) hashMap11);
        java.lang.Object obj19 = hashMap2.put((java.lang.Object) hashMap7, (java.lang.Object) 0.0d);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        hashMap0.modCount = 'a';
        int int6 = hashMap0.modCount;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        int int9 = hashMap7.modCount;
        system.testclass.HashMap.Entry[] entryArray10 = hashMap7.table;
        hashMap7.clear();
        java.lang.Object obj13 = hashMap7.remove((java.lang.Object) 0.0d);
        boolean boolean14 = hashMap7.isEmpty();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        boolean boolean16 = hashMap15.isEmpty();
        int int17 = hashMap15.size();
        hashMap15.clear();
        java.lang.Object obj19 = hashMap7.get((java.lang.Object) hashMap15);
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        int int21 = hashMap20.modCount;
        int int22 = hashMap20.modCount;
        system.testclass.HashMap.Entry[] entryArray23 = hashMap20.table;
        hashMap20.clear();
        java.lang.Object obj26 = hashMap20.remove((java.lang.Object) 0.0d);
        java.lang.Object obj28 = hashMap20.remove((java.lang.Object) (short) 0);
        int int29 = hashMap20.size();
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap((int) (byte) 0);
        int int32 = hashMap31.modCount;
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        boolean boolean34 = hashMap33.isEmpty();
        int int35 = hashMap33.size();
        system.testclass.HashMap.Entry[] entryArray36 = hashMap33.table;
        java.lang.Object obj37 = hashMap31.remove((java.lang.Object) entryArray36);
        hashMap20.table = entryArray36;
        hashMap7.table = entryArray36;
        hashMap0.table = entryArray36;
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        int int42 = hashMap41.modCount;
        int int43 = hashMap41.modCount;
        hashMap41.clear();
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        boolean boolean46 = hashMap45.isEmpty();
        int int47 = hashMap45.size();
        hashMap45.clear();
        int int49 = hashMap45.modCount;
        java.lang.Object obj50 = hashMap41.get((java.lang.Object) hashMap45);
        system.testclass.HashMap.Entry[] entryArray51 = hashMap41.table;
        system.testclass.HashMap hashMap53 = new system.testclass.HashMap((int) (short) 1);
        hashMap53.clear();
        java.lang.Object obj55 = hashMap0.put((java.lang.Object) entryArray51, (java.lang.Object) hashMap53);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        int int3 = hashMap2.modCount;
        int int4 = hashMap2.modCount;
        system.testclass.HashMap.Entry[] entryArray5 = hashMap2.table;
        hashMap2.clear();
        java.lang.Object obj8 = hashMap2.remove((java.lang.Object) 0.0d);
        system.testclass.HashMap.Entry[] entryArray9 = hashMap2.table;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.modCount;
        int int12 = hashMap10.modCount;
        system.testclass.HashMap.Entry[] entryArray13 = hashMap10.table;
        hashMap10.clear();
        java.lang.Object obj16 = hashMap10.remove((java.lang.Object) 0.0d);
        int int17 = hashMap10.size();
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        hashMap18.modCount = 0;
        hashMap18.clear();
        java.lang.Object obj22 = hashMap10.get((java.lang.Object) hashMap18);
        java.lang.Object obj23 = hashMap1.put((java.lang.Object) hashMap2, obj22);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 0, (float) 10);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap(97);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) (byte) 10, (float) (short) 1);
        hashMap7.modCount = 0;
        hashMap7.modCount = 10;
        java.lang.Object obj12 = hashMap2.put((java.lang.Object) 97, (java.lang.Object) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
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
        system.testclass.HashMap.Entry[] entryArray14 = hashMap8.table;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        int int17 = hashMap15.modCount;
        system.testclass.HashMap.Entry[] entryArray18 = hashMap15.table;
        hashMap15.clear();
        java.lang.Object obj21 = hashMap15.remove((java.lang.Object) 0.0d);
        system.testclass.HashMap.Entry[] entryArray22 = hashMap15.table;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        int int24 = hashMap23.modCount;
        int int25 = hashMap23.modCount;
        system.testclass.HashMap.Entry[] entryArray26 = hashMap23.table;
        boolean boolean27 = hashMap23.isEmpty();
        int int28 = hashMap23.modCount;
        int int29 = hashMap23.modCount;
        system.testclass.HashMap.Entry[] entryArray30 = hashMap23.table;
        java.lang.Class<?> wildcardClass31 = hashMap23.getClass();
        java.lang.Object obj32 = hashMap8.put((java.lang.Object) entryArray22, (java.lang.Object) hashMap23);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap8", hashMap8.repOK_1());
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        int int2 = hashMap1.modCount;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        int int5 = hashMap3.size();
        system.testclass.HashMap.Entry[] entryArray6 = hashMap3.table;
        java.lang.Object obj7 = hashMap1.remove((java.lang.Object) entryArray6);
        boolean boolean8 = hashMap1.isEmpty();
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
        int int19 = hashMap13.modCount;
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        int int21 = hashMap20.modCount;
        int int22 = hashMap20.modCount;
        system.testclass.HashMap.Entry[] entryArray23 = hashMap20.table;
        boolean boolean24 = hashMap20.isEmpty();
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap.Entry[] entryArray28 = hashMap27.table;
        java.lang.Object obj29 = hashMap20.get((java.lang.Object) entryArray28);
        java.lang.Object obj30 = hashMap1.put((java.lang.Object) hashMap13, obj29);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) '#');
        boolean boolean2 = hashMap1.isEmpty();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap(10, (float) 97);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int9 = hashMap8.modCount;
        system.testclass.HashMap.Entry entry10 = null;
        system.testclass.HashMap.Entry[] entryArray11 = new system.testclass.HashMap.Entry[] { entry10 };
        hashMap8.table = entryArray11;
        hashMap8.clear();
        java.lang.Object obj14 = hashMap5.get((java.lang.Object) hashMap8);
        hashMap8.clear();
        hashMap8.modCount = (short) 0;
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int21 = hashMap20.modCount;
        boolean boolean22 = hashMap20.isEmpty();
        java.lang.Object obj24 = hashMap20.get((java.lang.Object) (byte) -1);
        java.lang.Object obj25 = hashMap1.put((java.lang.Object) (short) 0, obj24);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        hashMap0.clear();
        java.lang.Object obj6 = hashMap0.remove((java.lang.Object) 0.0d);
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) (short) 0);
        int int9 = hashMap0.size();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap((int) (byte) 0);
        int int12 = hashMap11.modCount;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        boolean boolean14 = hashMap13.isEmpty();
        int int15 = hashMap13.size();
        system.testclass.HashMap.Entry[] entryArray16 = hashMap13.table;
        java.lang.Object obj17 = hashMap11.remove((java.lang.Object) entryArray16);
        hashMap0.table = entryArray16;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        int int20 = hashMap19.modCount;
        int int21 = hashMap19.modCount;
        system.testclass.HashMap.Entry[] entryArray22 = hashMap19.table;
        boolean boolean23 = hashMap19.isEmpty();
        int int24 = hashMap19.modCount;
        int int25 = hashMap19.modCount;
        java.lang.Class<?> wildcardClass26 = hashMap19.getClass();
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap(97, 10.0f);
        java.lang.Object obj30 = hashMap0.put((java.lang.Object) hashMap19, (java.lang.Object) 97);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        int int3 = hashMap0.size();
        int int4 = hashMap0.size();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) (short) 10);
        hashMap6.modCount = 97;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        java.lang.Object obj12 = hashMap9.get((java.lang.Object) 10.0d);
        java.lang.Object obj13 = hashMap6.remove(obj12);
        int int14 = hashMap6.modCount;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap(0, (float) (short) 100);
        int int18 = hashMap17.modCount;
        system.testclass.HashMap.Entry[] entryArray19 = hashMap17.table;
        java.lang.Object obj20 = hashMap0.put((java.lang.Object) int14, (java.lang.Object) hashMap17);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        boolean boolean4 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap.Entry[] entryArray8 = hashMap7.table;
        java.lang.Object obj9 = hashMap0.get((java.lang.Object) entryArray8);
        int int10 = hashMap0.modCount;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        boolean boolean15 = hashMap14.isEmpty();
        int int16 = hashMap14.size();
        hashMap14.clear();
        java.lang.Object obj18 = hashMap13.remove((java.lang.Object) hashMap14);
        int int19 = hashMap13.modCount;
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        boolean boolean21 = hashMap20.isEmpty();
        int int22 = hashMap20.size();
        int int23 = hashMap20.size();
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap(0);
        system.testclass.HashMap.Entry[] entryArray26 = hashMap25.table;
        java.lang.Object obj27 = hashMap20.remove((java.lang.Object) hashMap25);
        java.lang.Object obj29 = hashMap20.get((java.lang.Object) (-1L));
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        int int31 = hashMap30.modCount;
        int int32 = hashMap30.modCount;
        system.testclass.HashMap.Entry[] entryArray33 = hashMap30.table;
        boolean boolean34 = hashMap30.isEmpty();
        int int35 = hashMap30.modCount;
        int int36 = hashMap30.modCount;
        system.testclass.HashMap.Entry[] entryArray37 = hashMap30.table;
        hashMap20.table = entryArray37;
        int int39 = hashMap20.modCount;
        java.lang.Object obj40 = hashMap13.remove((java.lang.Object) int39);
        hashMap13.clear();
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap((int) (byte) 10, (float) (short) 1);
        hashMap44.modCount = 0;
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap();
        int int48 = hashMap47.modCount;
        int int49 = hashMap47.modCount;
        int int50 = hashMap47.size();
        hashMap47.modCount = (short) 100;
        system.testclass.HashMap hashMap55 = new system.testclass.HashMap((int) (byte) 10, (float) (short) 1);
        boolean boolean56 = hashMap55.isEmpty();
        system.testclass.HashMap hashMap57 = new system.testclass.HashMap();
        int int58 = hashMap57.modCount;
        int int59 = hashMap57.modCount;
        system.testclass.HashMap.Entry[] entryArray60 = hashMap57.table;
        boolean boolean61 = hashMap57.isEmpty();
        int int62 = hashMap57.modCount;
        int int63 = hashMap57.modCount;
        system.testclass.HashMap.Entry[] entryArray64 = hashMap57.table;
        hashMap55.table = entryArray64;
        hashMap47.table = entryArray64;
        hashMap47.modCount = (short) 1;
        system.testclass.HashMap.Entry[] entryArray69 = hashMap47.table;
        hashMap44.table = entryArray69;
        java.lang.Object obj71 = hashMap0.put((java.lang.Object) hashMap13, (java.lang.Object) entryArray69);
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
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        hashMap0.clear();
        java.lang.Object obj6 = hashMap0.remove((java.lang.Object) 0.0d);
        boolean boolean7 = hashMap0.isEmpty();
        int int8 = hashMap0.size();
        int int9 = hashMap0.size();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap(0, 100.0f);
        hashMap12.modCount = (short) -1;
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
        int int25 = hashMap19.modCount;
        hashMap19.clear();
        int int27 = hashMap19.modCount;
        java.lang.Object obj28 = hashMap0.put((java.lang.Object) (short) -1, (java.lang.Object) hashMap19);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        hashMap0.modCount = 'a';
        int int6 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray7 = hashMap0.table;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap(0, (float) (short) 100);
        int int11 = hashMap10.modCount;
        hashMap10.clear();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        system.testclass.HashMap.Entry[] entryArray16 = hashMap13.table;
        boolean boolean17 = hashMap13.isEmpty();
        system.testclass.HashMap.Entry[] entryArray18 = hashMap13.table;
        hashMap13.clear();
        int int20 = hashMap13.size();
        java.lang.Object obj21 = hashMap0.put((java.lang.Object) hashMap10, (java.lang.Object) int20);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        hashMap0.clear();
        java.lang.Object obj6 = hashMap0.remove((java.lang.Object) 0.0d);
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) (short) 0);
        int int9 = hashMap0.size();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap((int) (byte) 0);
        int int12 = hashMap11.modCount;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        boolean boolean14 = hashMap13.isEmpty();
        int int15 = hashMap13.size();
        system.testclass.HashMap.Entry[] entryArray16 = hashMap13.table;
        java.lang.Object obj17 = hashMap11.remove((java.lang.Object) entryArray16);
        hashMap0.table = entryArray16;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int22 = hashMap21.modCount;
        system.testclass.HashMap.Entry entry23 = null;
        system.testclass.HashMap.Entry[] entryArray24 = new system.testclass.HashMap.Entry[] { entry23 };
        hashMap21.table = entryArray24;
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int29 = hashMap28.size();
        java.lang.Object obj30 = hashMap0.put((java.lang.Object) hashMap21, (java.lang.Object) int29);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) ' ', (float) 1);
        hashMap2.clear();
        java.lang.Object obj4 = null;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        system.testclass.HashMap.Entry[] entryArray8 = hashMap5.table;
        hashMap5.clear();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.modCount;
        int int12 = hashMap10.modCount;
        hashMap10.clear();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        boolean boolean15 = hashMap14.isEmpty();
        int int16 = hashMap14.size();
        hashMap14.clear();
        int int18 = hashMap14.modCount;
        java.lang.Object obj19 = hashMap10.get((java.lang.Object) hashMap14);
        int int20 = hashMap14.modCount;
        int int21 = hashMap14.modCount;
        java.lang.Object obj22 = hashMap5.remove((java.lang.Object) int21);
        java.lang.Object obj23 = hashMap2.put(obj4, (java.lang.Object) int21);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) 10.0d);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) (byte) 10, (float) ' ');
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        int int12 = hashMap10.size();
        hashMap10.clear();
        java.lang.Object obj14 = hashMap9.remove((java.lang.Object) hashMap10);
        java.lang.Object obj16 = hashMap9.get((java.lang.Object) true);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap(0, (float) (short) 100);
        hashMap19.clear();
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int24 = hashMap23.modCount;
        java.lang.Class<?> wildcardClass25 = hashMap23.getClass();
        java.lang.Object obj26 = hashMap19.remove((java.lang.Object) wildcardClass25);
        java.lang.Object obj27 = hashMap9.remove((java.lang.Object) hashMap19);
        java.lang.Object obj28 = hashMap0.put((java.lang.Object) (byte) 10, obj27);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 100, 10.0f);
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
        hashMap2.table = entryArray19;
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
        boolean boolean4 = hashMap0.isEmpty();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap0.table;
        hashMap0.clear();
        system.testclass.HashMap.Entry[] entryArray7 = hashMap0.table;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap.Entry[] entryArray11 = hashMap10.table;
        hashMap10.clear();
        system.testclass.HashMap.Entry[] entryArray13 = hashMap10.table;
        hashMap10.modCount = (short) 1;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        boolean boolean17 = hashMap16.isEmpty();
        hashMap16.modCount = ' ';
        boolean boolean20 = hashMap16.isEmpty();
        java.lang.Object obj22 = hashMap16.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj23 = hashMap0.put((java.lang.Object) (short) 1, obj22);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        hashMap0.clear();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        java.lang.Object obj8 = hashMap5.get((java.lang.Object) 10.0d);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int12 = hashMap11.modCount;
        system.testclass.HashMap.Entry[] entryArray13 = hashMap11.table;
        java.lang.Object obj14 = hashMap5.get((java.lang.Object) entryArray13);
        java.lang.Object obj15 = hashMap0.get(obj14);
        int int16 = hashMap0.size();
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        boolean boolean18 = hashMap17.isEmpty();
        int int19 = hashMap17.size();
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap((int) (byte) 10, (float) (short) 1);
        hashMap22.modCount = 0;
        system.testclass.HashMap.Entry[] entryArray25 = hashMap22.table;
        hashMap17.table = entryArray25;
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        int int28 = hashMap27.modCount;
        int int29 = hashMap27.modCount;
        system.testclass.HashMap.Entry[] entryArray30 = hashMap27.table;
        hashMap27.clear();
        java.lang.Object obj33 = hashMap27.remove((java.lang.Object) 0.0d);
        boolean boolean34 = hashMap27.isEmpty();
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        boolean boolean36 = hashMap35.isEmpty();
        int int37 = hashMap35.size();
        hashMap35.clear();
        java.lang.Object obj39 = hashMap27.get((java.lang.Object) hashMap35);
        boolean boolean40 = hashMap35.isEmpty();
        system.testclass.HashMap.Entry[] entryArray41 = hashMap35.table;
        java.lang.Object obj42 = hashMap0.put((java.lang.Object) entryArray25, (java.lang.Object) hashMap35);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int3 = hashMap2.modCount;
        hashMap2.modCount = 97;
        hashMap2.clear();
        hashMap2.clear();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap((int) (byte) 0);
        java.lang.Class<?> wildcardClass12 = hashMap11.getClass();
        java.lang.Object obj13 = hashMap9.get((java.lang.Object) hashMap11);
        hashMap9.clear();
        system.testclass.HashMap.Entry[] entryArray15 = hashMap9.table;
        hashMap2.table = entryArray15;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int3 = hashMap2.modCount;
        int int4 = hashMap2.size();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        system.testclass.HashMap.Entry[] entryArray8 = hashMap5.table;
        hashMap5.clear();
        java.lang.Object obj11 = hashMap5.remove((java.lang.Object) 0.0d);
        boolean boolean12 = hashMap5.isEmpty();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        boolean boolean14 = hashMap13.isEmpty();
        int int15 = hashMap13.size();
        hashMap13.clear();
        java.lang.Object obj17 = hashMap5.get((java.lang.Object) hashMap13);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        boolean boolean19 = hashMap18.isEmpty();
        int int20 = hashMap18.size();
        hashMap18.clear();
        hashMap18.modCount = 'a';
        int int24 = hashMap18.modCount;
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        int int26 = hashMap25.modCount;
        int int27 = hashMap25.modCount;
        system.testclass.HashMap.Entry[] entryArray28 = hashMap25.table;
        hashMap25.clear();
        java.lang.Object obj31 = hashMap25.remove((java.lang.Object) 0.0d);
        boolean boolean32 = hashMap25.isEmpty();
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        boolean boolean34 = hashMap33.isEmpty();
        int int35 = hashMap33.size();
        hashMap33.clear();
        java.lang.Object obj37 = hashMap25.get((java.lang.Object) hashMap33);
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        int int39 = hashMap38.modCount;
        int int40 = hashMap38.modCount;
        system.testclass.HashMap.Entry[] entryArray41 = hashMap38.table;
        hashMap38.clear();
        java.lang.Object obj44 = hashMap38.remove((java.lang.Object) 0.0d);
        java.lang.Object obj46 = hashMap38.remove((java.lang.Object) (short) 0);
        int int47 = hashMap38.size();
        system.testclass.HashMap hashMap49 = new system.testclass.HashMap((int) (byte) 0);
        int int50 = hashMap49.modCount;
        system.testclass.HashMap hashMap51 = new system.testclass.HashMap();
        boolean boolean52 = hashMap51.isEmpty();
        int int53 = hashMap51.size();
        system.testclass.HashMap.Entry[] entryArray54 = hashMap51.table;
        java.lang.Object obj55 = hashMap49.remove((java.lang.Object) entryArray54);
        hashMap38.table = entryArray54;
        hashMap25.table = entryArray54;
        hashMap18.table = entryArray54;
        hashMap13.table = entryArray54;
        int int60 = hashMap13.size();
        system.testclass.HashMap hashMap63 = new system.testclass.HashMap(0, (float) (short) 100);
        hashMap63.clear();
        hashMap63.modCount = (byte) -1;
        system.testclass.HashMap.Entry[] entryArray67 = hashMap63.table;
        hashMap63.clear();
        java.lang.Object obj69 = hashMap2.put((java.lang.Object) hashMap13, (java.lang.Object) hashMap63);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
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
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap((int) (byte) 0);
        java.lang.Object obj19 = hashMap0.remove((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        int int21 = hashMap20.modCount;
        int int22 = hashMap20.modCount;
        system.testclass.HashMap.Entry[] entryArray23 = hashMap20.table;
        boolean boolean24 = hashMap20.isEmpty();
        int int25 = hashMap20.modCount;
        int int26 = hashMap20.modCount;
        int int27 = hashMap20.modCount;
        hashMap20.clear();
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        int int30 = hashMap29.modCount;
        int int31 = hashMap29.modCount;
        system.testclass.HashMap.Entry[] entryArray32 = hashMap29.table;
        int int33 = hashMap29.size();
        boolean boolean34 = hashMap29.isEmpty();
        java.lang.Object obj35 = hashMap0.put((java.lang.Object) hashMap20, (java.lang.Object) hashMap29);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 100);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        int int3 = hashMap2.modCount;
        int int4 = hashMap2.modCount;
        system.testclass.HashMap.Entry[] entryArray5 = hashMap2.table;
        boolean boolean6 = hashMap2.isEmpty();
        int int7 = hashMap2.modCount;
        int int8 = hashMap2.modCount;
        system.testclass.HashMap.Entry[] entryArray9 = hashMap2.table;
        hashMap1.table = entryArray9;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (byte) 100);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap((int) '#');
        boolean boolean5 = hashMap4.isEmpty();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.modCount;
        int int8 = hashMap6.modCount;
        system.testclass.HashMap.Entry[] entryArray9 = hashMap6.table;
        hashMap6.clear();
        boolean boolean11 = hashMap6.isEmpty();
        int int12 = hashMap6.modCount;
        hashMap6.modCount = 10;
        java.lang.Object obj15 = hashMap2.put((java.lang.Object) hashMap4, (java.lang.Object) hashMap6);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) ' ', (float) 1);
        hashMap2.clear();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        int int7 = hashMap4.size();
        hashMap4.modCount = (short) 100;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap((int) (byte) 10, (float) (short) 1);
        boolean boolean13 = hashMap12.isEmpty();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.modCount;
        int int16 = hashMap14.modCount;
        system.testclass.HashMap.Entry[] entryArray17 = hashMap14.table;
        boolean boolean18 = hashMap14.isEmpty();
        int int19 = hashMap14.modCount;
        int int20 = hashMap14.modCount;
        system.testclass.HashMap.Entry[] entryArray21 = hashMap14.table;
        hashMap12.table = entryArray21;
        hashMap4.table = entryArray21;
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap(10, (float) 97);
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int30 = hashMap29.modCount;
        system.testclass.HashMap.Entry entry31 = null;
        system.testclass.HashMap.Entry[] entryArray32 = new system.testclass.HashMap.Entry[] { entry31 };
        hashMap29.table = entryArray32;
        hashMap29.clear();
        java.lang.Object obj35 = hashMap26.get((java.lang.Object) hashMap29);
        boolean boolean36 = hashMap29.isEmpty();
        java.lang.Object obj37 = hashMap2.put((java.lang.Object) entryArray21, (java.lang.Object) boolean36);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        java.lang.Object obj4 = hashMap2.get((java.lang.Object) '#');
        system.testclass.HashMap.Entry[] entryArray5 = hashMap2.table;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        int int9 = hashMap7.modCount;
        hashMap7.clear();
        int int11 = hashMap7.modCount;
        system.testclass.HashMap.Entry[] entryArray12 = hashMap7.table;
        hashMap6.table = entryArray12;
        int int14 = hashMap6.modCount;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap.Entry[] entryArray18 = hashMap17.table;
        system.testclass.HashMap.Entry[] entryArray19 = hashMap17.table;
        java.lang.Object obj20 = hashMap2.put((java.lang.Object) int14, (java.lang.Object) hashMap17);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 10);
        boolean boolean2 = hashMap1.isEmpty();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        int int8 = hashMap6.size();
        hashMap6.clear();
        java.lang.Object obj10 = hashMap5.remove((java.lang.Object) hashMap6);
        java.lang.Object obj11 = hashMap1.get((java.lang.Object) hashMap5);
        int int12 = hashMap5.size();
        hashMap5.clear();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        boolean boolean15 = hashMap14.isEmpty();
        int int16 = hashMap14.size();
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap((int) (byte) 10, (float) (short) 1);
        hashMap19.modCount = 0;
        system.testclass.HashMap.Entry[] entryArray22 = hashMap19.table;
        hashMap14.table = entryArray22;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        boolean boolean25 = hashMap24.isEmpty();
        int int26 = hashMap24.size();
        int int27 = hashMap24.size();
        int int28 = hashMap24.size();
        java.lang.Object obj29 = hashMap5.put((java.lang.Object) entryArray22, (java.lang.Object) hashMap24);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap5", hashMap5.repOK_1());
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        int int3 = hashMap0.size();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap(0);
        system.testclass.HashMap.Entry[] entryArray6 = hashMap5.table;
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) hashMap5);
        java.lang.Object obj9 = hashMap0.get((java.lang.Object) (-1L));
        int int10 = hashMap0.size();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap(0, (float) (short) 100);
        hashMap13.clear();
        hashMap13.modCount = (byte) -1;
        system.testclass.HashMap.Entry[] entryArray17 = hashMap13.table;
        hashMap13.clear();
        java.lang.Object obj19 = hashMap0.get((java.lang.Object) hashMap13);
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap((int) (short) 10);
        hashMap21.modCount = 97;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.modCount;
        java.lang.Object obj27 = hashMap24.get((java.lang.Object) 10.0d);
        java.lang.Object obj28 = hashMap21.remove(obj27);
        int int29 = hashMap21.modCount;
        int int30 = hashMap21.modCount;
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap((int) (byte) 0);
        int int33 = hashMap32.modCount;
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        boolean boolean35 = hashMap34.isEmpty();
        int int36 = hashMap34.size();
        system.testclass.HashMap.Entry[] entryArray37 = hashMap34.table;
        java.lang.Object obj38 = hashMap32.remove((java.lang.Object) entryArray37);
        hashMap21.table = entryArray37;
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        int int41 = hashMap40.modCount;
        int int42 = hashMap40.modCount;
        system.testclass.HashMap.Entry[] entryArray43 = hashMap40.table;
        hashMap40.clear();
        java.lang.Object obj46 = hashMap40.remove((java.lang.Object) 0.0d);
        boolean boolean47 = hashMap40.isEmpty();
        system.testclass.HashMap hashMap50 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap.Entry[] entryArray51 = hashMap50.table;
        int int52 = hashMap50.modCount;
        system.testclass.HashMap.Entry[] entryArray53 = hashMap50.table;
        java.lang.Object obj54 = hashMap40.remove((java.lang.Object) entryArray53);
        system.testclass.HashMap hashMap55 = new system.testclass.HashMap();
        int int56 = hashMap55.modCount;
        int int57 = hashMap55.modCount;
        hashMap55.clear();
        java.lang.Object obj59 = null;
        java.lang.Object obj60 = hashMap55.remove(obj59);
        java.lang.Object obj61 = hashMap40.get((java.lang.Object) hashMap55);
        java.lang.Object obj62 = hashMap0.put((java.lang.Object) entryArray37, (java.lang.Object) hashMap55);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        int int4 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray5 = hashMap0.table;
        hashMap0.modCount = '#';
        hashMap0.modCount = (short) -1;
        int int10 = hashMap0.modCount;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        boolean boolean15 = hashMap14.isEmpty();
        int int16 = hashMap14.size();
        hashMap14.clear();
        java.lang.Object obj18 = hashMap13.remove((java.lang.Object) hashMap14);
        java.lang.Object obj20 = hashMap13.get((java.lang.Object) true);
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap(0, (float) (short) 100);
        hashMap23.clear();
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int28 = hashMap27.modCount;
        java.lang.Class<?> wildcardClass29 = hashMap27.getClass();
        java.lang.Object obj30 = hashMap23.remove((java.lang.Object) wildcardClass29);
        java.lang.Object obj31 = hashMap13.remove((java.lang.Object) hashMap23);
        java.lang.Object obj32 = hashMap0.get(obj31);
        int int33 = hashMap0.size();
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap(0, (float) (short) 100);
        hashMap36.clear();
        int int38 = hashMap36.size();
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        int int40 = hashMap39.modCount;
        int int41 = hashMap39.modCount;
        system.testclass.HashMap.Entry[] entryArray42 = hashMap39.table;
        hashMap39.clear();
        java.lang.Object obj45 = hashMap39.remove((java.lang.Object) 0.0d);
        boolean boolean46 = hashMap39.isEmpty();
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap();
        boolean boolean48 = hashMap47.isEmpty();
        int int49 = hashMap47.size();
        hashMap47.clear();
        java.lang.Object obj51 = hashMap39.get((java.lang.Object) hashMap47);
        int int52 = hashMap39.size();
        java.lang.Object obj53 = hashMap36.remove((java.lang.Object) hashMap39);
        java.lang.Object obj54 = hashMap0.remove((java.lang.Object) hashMap36);
        system.testclass.HashMap hashMap55 = new system.testclass.HashMap();
        int int56 = hashMap55.modCount;
        java.lang.Object obj58 = hashMap55.get((java.lang.Object) 10.0d);
        system.testclass.HashMap hashMap61 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int62 = hashMap61.modCount;
        system.testclass.HashMap.Entry[] entryArray63 = hashMap61.table;
        java.lang.Object obj64 = hashMap55.get((java.lang.Object) entryArray63);
        system.testclass.HashMap hashMap65 = new system.testclass.HashMap();
        int int66 = hashMap65.modCount;
        int int67 = hashMap65.modCount;
        int int68 = hashMap65.size();
        hashMap65.modCount = (short) 100;
        system.testclass.HashMap hashMap73 = new system.testclass.HashMap((int) (byte) 10, (float) (short) 1);
        boolean boolean74 = hashMap73.isEmpty();
        system.testclass.HashMap hashMap75 = new system.testclass.HashMap();
        int int76 = hashMap75.modCount;
        int int77 = hashMap75.modCount;
        system.testclass.HashMap.Entry[] entryArray78 = hashMap75.table;
        boolean boolean79 = hashMap75.isEmpty();
        int int80 = hashMap75.modCount;
        int int81 = hashMap75.modCount;
        system.testclass.HashMap.Entry[] entryArray82 = hashMap75.table;
        hashMap73.table = entryArray82;
        hashMap65.table = entryArray82;
        hashMap65.modCount = (short) 1;
        java.lang.Object obj87 = hashMap0.put((java.lang.Object) hashMap55, (java.lang.Object) hashMap65);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        int int4 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray5 = hashMap0.table;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap(0);
        system.testclass.HashMap.Entry[] entryArray8 = hashMap7.table;
        hashMap0.table = entryArray8;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) 'a');
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap((int) (byte) 10, (float) (short) 1);
        hashMap4.modCount = 0;
        system.testclass.HashMap.Entry[] entryArray7 = hashMap4.table;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        java.lang.Object obj12 = hashMap10.get((java.lang.Object) '#');
        system.testclass.HashMap.Entry[] entryArray13 = hashMap10.table;
        java.lang.Object obj14 = hashMap1.put((java.lang.Object) entryArray7, (java.lang.Object) hashMap10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 1);
        boolean boolean2 = hashMap1.isEmpty();
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        system.testclass.HashMap.Entry[] entryArray6 = hashMap3.table;
        hashMap3.clear();
        system.testclass.HashMap.Entry[] entryArray8 = hashMap3.table;
        java.lang.Object obj10 = hashMap1.put((java.lang.Object) entryArray8, (java.lang.Object) 0L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
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
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        boolean boolean4 = hashMap0.isEmpty();
        int int5 = hashMap0.modCount;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) (byte) 0);
        int int8 = hashMap7.modCount;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        int int11 = hashMap9.modCount;
        system.testclass.HashMap.Entry[] entryArray12 = hashMap9.table;
        boolean boolean13 = hashMap9.isEmpty();
        system.testclass.HashMap.Entry[] entryArray14 = hashMap9.table;
        java.lang.Object obj15 = hashMap0.put((java.lang.Object) hashMap7, (java.lang.Object) entryArray14);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int3 = hashMap2.modCount;
        boolean boolean4 = hashMap2.isEmpty();
        java.lang.Object obj6 = hashMap2.get((java.lang.Object) (byte) -1);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap((int) (byte) 100, (float) (byte) 1);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.modCount;
        int int12 = hashMap10.modCount;
        hashMap10.clear();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        boolean boolean15 = hashMap14.isEmpty();
        int int16 = hashMap14.size();
        hashMap14.clear();
        int int18 = hashMap14.modCount;
        java.lang.Object obj19 = hashMap10.get((java.lang.Object) hashMap14);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int23 = hashMap22.modCount;
        hashMap22.modCount = 97;
        hashMap22.modCount = (-1);
        int int28 = hashMap22.modCount;
        java.lang.Object obj29 = null;
        java.lang.Object obj30 = hashMap22.remove(obj29);
        int int31 = hashMap22.size();
        java.lang.Object obj32 = hashMap10.get((java.lang.Object) hashMap22);
        java.lang.Object obj33 = hashMap2.put((java.lang.Object) (byte) 100, (java.lang.Object) hashMap10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        int int3 = hashMap2.modCount;
        int int4 = hashMap2.modCount;
        hashMap2.clear();
        int int6 = hashMap2.modCount;
        system.testclass.HashMap.Entry[] entryArray7 = hashMap2.table;
        hashMap0.table = entryArray7;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        int int11 = hashMap9.size();
        int int12 = hashMap9.size();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap(0);
        system.testclass.HashMap.Entry[] entryArray15 = hashMap14.table;
        java.lang.Object obj16 = hashMap9.remove((java.lang.Object) hashMap14);
        java.lang.Object obj18 = hashMap9.get((java.lang.Object) (-1L));
        java.lang.Object obj19 = null;
        java.lang.Object obj20 = hashMap0.put((java.lang.Object) hashMap9, obj19);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(97, 10.0f);
        int int3 = hashMap2.size();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) (byte) 10, (float) (short) 1);
        hashMap6.modCount = 0;
        hashMap6.modCount = 10;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        int int13 = hashMap11.modCount;
        system.testclass.HashMap.Entry[] entryArray14 = hashMap11.table;
        boolean boolean15 = hashMap11.isEmpty();
        int int16 = hashMap11.modCount;
        int int17 = hashMap11.modCount;
        system.testclass.HashMap.Entry[] entryArray18 = hashMap11.table;
        java.lang.Object obj19 = hashMap6.get((java.lang.Object) hashMap11);
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        int int21 = hashMap20.modCount;
        int int22 = hashMap20.modCount;
        system.testclass.HashMap.Entry[] entryArray23 = hashMap20.table;
        hashMap20.clear();
        boolean boolean25 = hashMap20.isEmpty();
        int int26 = hashMap20.modCount;
        hashMap20.modCount = 10;
        hashMap20.modCount = (short) -1;
        java.lang.Object obj31 = hashMap2.put(obj19, (java.lang.Object) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        int int3 = hashMap0.size();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap(0);
        system.testclass.HashMap.Entry[] entryArray6 = hashMap5.table;
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) hashMap5);
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = hashMap5.get(obj8);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap((int) (byte) 1);
        hashMap11.clear();
        java.lang.Object obj13 = hashMap5.remove((java.lang.Object) hashMap11);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap(0, (float) (short) 100);
        int int17 = hashMap16.modCount;
        hashMap16.modCount = 100;
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        int int21 = hashMap20.modCount;
        int int22 = hashMap20.modCount;
        system.testclass.HashMap.Entry[] entryArray23 = hashMap20.table;
        boolean boolean24 = hashMap20.isEmpty();
        int int25 = hashMap20.modCount;
        int int26 = hashMap20.modCount;
        system.testclass.HashMap.Entry[] entryArray27 = hashMap20.table;
        java.lang.Class<?> wildcardClass28 = hashMap20.getClass();
        java.lang.Object obj29 = hashMap11.put((java.lang.Object) hashMap16, (java.lang.Object) wildcardClass28);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap11", hashMap11.repOK_1());
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int3 = hashMap2.modCount;
        hashMap2.modCount = 97;
        java.lang.Object obj7 = hashMap2.remove((java.lang.Object) (short) -1);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray9 = hashMap8.table;
        int int10 = hashMap8.modCount;
        java.lang.Object obj11 = hashMap2.remove((java.lang.Object) hashMap8);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap(0, (float) (byte) 1);
        system.testclass.HashMap.Entry[] entryArray15 = hashMap14.table;
        hashMap2.table = entryArray15;
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
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) (short) 0);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        int int11 = hashMap9.modCount;
        system.testclass.HashMap.Entry[] entryArray12 = hashMap9.table;
        hashMap9.clear();
        java.lang.Object obj15 = hashMap9.remove((java.lang.Object) 0.0d);
        boolean boolean16 = hashMap9.isEmpty();
        int int17 = hashMap9.size();
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap((int) (byte) 0);
        int int20 = hashMap19.modCount;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        boolean boolean22 = hashMap21.isEmpty();
        int int23 = hashMap21.size();
        system.testclass.HashMap.Entry[] entryArray24 = hashMap21.table;
        java.lang.Object obj25 = hashMap19.remove((java.lang.Object) entryArray24);
        java.lang.Object obj26 = hashMap9.remove((java.lang.Object) entryArray24);
        hashMap0.table = entryArray24;
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        boolean boolean29 = hashMap28.isEmpty();
        int int30 = hashMap28.size();
        hashMap28.clear();
        hashMap28.modCount = 'a';
        hashMap28.modCount = (short) 100;
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray37 = hashMap36.table;
        hashMap36.clear();
        boolean boolean39 = hashMap36.isEmpty();
        java.lang.Object obj40 = hashMap0.put((java.lang.Object) hashMap28, (java.lang.Object) boolean39);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 10, (float) (short) 1);
        boolean boolean3 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        system.testclass.HashMap.Entry[] entryArray7 = hashMap4.table;
        boolean boolean8 = hashMap4.isEmpty();
        int int9 = hashMap4.modCount;
        int int10 = hashMap4.modCount;
        system.testclass.HashMap.Entry[] entryArray11 = hashMap4.table;
        hashMap2.table = entryArray11;
        int int13 = hashMap2.size();
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int17 = hashMap16.modCount;
        system.testclass.HashMap.Entry entry18 = null;
        system.testclass.HashMap.Entry[] entryArray19 = new system.testclass.HashMap.Entry[] { entry18 };
        hashMap16.table = entryArray19;
        hashMap16.clear();
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = hashMap2.put((java.lang.Object) hashMap16, obj22);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int7 = hashMap6.modCount;
        system.testclass.HashMap.Entry[] entryArray8 = hashMap6.table;
        int int9 = hashMap6.size();
        int int10 = hashMap6.size();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap.Entry[] entryArray14 = hashMap13.table;
        hashMap13.clear();
        java.lang.Object obj16 = hashMap0.put((java.lang.Object) hashMap6, (java.lang.Object) hashMap13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 10);
        boolean boolean2 = hashMap1.isEmpty();
        hashMap1.modCount = (short) 100;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap.Entry[] entryArray8 = hashMap7.table;
        system.testclass.HashMap.Entry[] entryArray9 = hashMap7.table;
        hashMap1.table = entryArray9;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        hashMap0.modCount = 'a';
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        int int11 = hashMap9.size();
        hashMap9.clear();
        java.lang.Object obj13 = hashMap8.remove((java.lang.Object) hashMap9);
        hashMap9.clear();
        java.lang.Class<?> wildcardClass15 = hashMap9.getClass();
        java.lang.Object obj16 = hashMap0.remove((java.lang.Object) hashMap9);
        hashMap0.clear();
        system.testclass.HashMap.Entry[] entryArray18 = hashMap0.table;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap(0, (float) (short) 100);
        int int22 = hashMap21.modCount;
        system.testclass.HashMap.Entry[] entryArray23 = hashMap21.table;
        hashMap0.table = entryArray23;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        hashMap0.clear();
        boolean boolean5 = hashMap0.isEmpty();
        int int6 = hashMap0.size();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap(100);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap(1);
        hashMap10.clear();
        hashMap10.modCount = 10;
        java.lang.Object obj14 = hashMap0.put((java.lang.Object) 100, (java.lang.Object) hashMap10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
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
        int int10 = hashMap4.modCount;
        hashMap4.clear();
        java.lang.Object obj13 = hashMap4.remove((java.lang.Object) 1.0f);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap(100, (float) '#');
        system.testclass.HashMap.Entry[] entryArray17 = hashMap16.table;
        hashMap4.table = entryArray17;
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap((int) (short) 10);
        boolean boolean21 = hashMap20.isEmpty();
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        boolean boolean26 = hashMap25.isEmpty();
        int int27 = hashMap25.size();
        hashMap25.clear();
        java.lang.Object obj29 = hashMap24.remove((java.lang.Object) hashMap25);
        java.lang.Object obj30 = hashMap20.get((java.lang.Object) hashMap24);
        int int31 = hashMap24.size();
        hashMap24.clear();
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        int int34 = hashMap33.modCount;
        int int35 = hashMap33.modCount;
        system.testclass.HashMap.Entry[] entryArray36 = hashMap33.table;
        boolean boolean37 = hashMap33.isEmpty();
        int int38 = hashMap33.modCount;
        int int39 = hashMap33.modCount;
        int int40 = hashMap33.modCount;
        java.lang.Object obj41 = hashMap4.put((java.lang.Object) hashMap24, (java.lang.Object) int40);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap4", hashMap4.repOK_1());
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        hashMap0.clear();
        java.lang.Object obj6 = hashMap0.remove((java.lang.Object) 0.0d);
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) (short) 0);
        boolean boolean9 = hashMap0.isEmpty();
        java.lang.Object obj10 = null;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        int int13 = hashMap11.modCount;
        system.testclass.HashMap.Entry[] entryArray14 = hashMap11.table;
        hashMap11.clear();
        java.lang.Object obj17 = hashMap11.remove((java.lang.Object) 0.0d);
        java.lang.Object obj19 = hashMap11.remove((java.lang.Object) (short) 0);
        int int20 = hashMap11.size();
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap((int) (byte) 0);
        int int23 = hashMap22.modCount;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        boolean boolean25 = hashMap24.isEmpty();
        int int26 = hashMap24.size();
        system.testclass.HashMap.Entry[] entryArray27 = hashMap24.table;
        java.lang.Object obj28 = hashMap22.remove((java.lang.Object) entryArray27);
        hashMap11.table = entryArray27;
        java.lang.Object obj30 = hashMap0.put(obj10, (java.lang.Object) hashMap11);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 100L);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        hashMap3.clear();
        int int7 = hashMap3.modCount;
        system.testclass.HashMap.Entry[] entryArray8 = hashMap3.table;
        java.lang.Object obj10 = hashMap2.put((java.lang.Object) hashMap3, (java.lang.Object) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
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
        hashMap0.modCount = '4';
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        boolean boolean16 = hashMap15.isEmpty();
        int int17 = hashMap15.size();
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap((int) (byte) 10, (float) (short) 1);
        hashMap20.modCount = 0;
        system.testclass.HashMap.Entry[] entryArray23 = hashMap20.table;
        hashMap15.table = entryArray23;
        hashMap0.table = entryArray23;
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        int int27 = hashMap26.modCount;
        int int28 = hashMap26.modCount;
        system.testclass.HashMap.Entry[] entryArray29 = hashMap26.table;
        hashMap26.clear();
        java.lang.Object obj32 = hashMap26.remove((java.lang.Object) 0.0d);
        int int33 = hashMap26.size();
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        hashMap34.modCount = 0;
        hashMap34.clear();
        java.lang.Object obj38 = hashMap26.get((java.lang.Object) hashMap34);
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap((int) (short) 10);
        boolean boolean41 = hashMap40.isEmpty();
        hashMap40.modCount = (byte) 100;
        java.lang.Object obj44 = hashMap0.put((java.lang.Object) hashMap34, (java.lang.Object) hashMap40);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap.Entry[] entryArray3 = hashMap2.table;
        int int4 = hashMap2.modCount;
        boolean boolean5 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap(0, (float) (short) 100);
        hashMap8.clear();
        hashMap8.modCount = (byte) -1;
        system.testclass.HashMap.Entry[] entryArray12 = hashMap8.table;
        java.lang.Object obj14 = hashMap8.get((java.lang.Object) (-1L));
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int18 = hashMap17.modCount;
        boolean boolean19 = hashMap17.isEmpty();
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        boolean boolean24 = hashMap23.isEmpty();
        int int25 = hashMap23.size();
        hashMap23.clear();
        java.lang.Object obj27 = hashMap22.remove((java.lang.Object) hashMap23);
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        int int29 = hashMap28.modCount;
        int int30 = hashMap28.modCount;
        system.testclass.HashMap.Entry[] entryArray31 = hashMap28.table;
        boolean boolean32 = hashMap28.isEmpty();
        system.testclass.HashMap.Entry[] entryArray33 = hashMap28.table;
        hashMap28.clear();
        java.lang.Object obj35 = hashMap23.remove((java.lang.Object) hashMap28);
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        boolean boolean37 = hashMap36.isEmpty();
        int int38 = hashMap36.size();
        system.testclass.HashMap.Entry[] entryArray39 = hashMap36.table;
        hashMap28.table = entryArray39;
        java.lang.Object obj41 = hashMap17.remove((java.lang.Object) hashMap28);
        java.lang.Object obj42 = hashMap2.put(obj14, obj41);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
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
        hashMap8.clear();
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int18 = hashMap17.modCount;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        int int20 = hashMap19.modCount;
        int int21 = hashMap19.modCount;
        system.testclass.HashMap.Entry[] entryArray22 = hashMap19.table;
        boolean boolean23 = hashMap19.isEmpty();
        system.testclass.HashMap.Entry[] entryArray24 = hashMap19.table;
        hashMap19.clear();
        java.lang.Object obj26 = hashMap8.put((java.lang.Object) hashMap17, (java.lang.Object) hashMap19);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap8", hashMap8.repOK_1());
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 1, (float) 98);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap.Entry[] entryArray6 = hashMap5.table;
        java.lang.Object obj8 = hashMap5.get((java.lang.Object) (short) 1);
        hashMap5.modCount = ' ';
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
        int int21 = hashMap15.modCount;
        hashMap15.clear();
        java.lang.Object obj24 = hashMap15.remove((java.lang.Object) 1.0f);
        java.lang.Object obj25 = hashMap5.remove((java.lang.Object) hashMap15);
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap(100);
        java.lang.Object obj28 = hashMap2.put(obj25, (java.lang.Object) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        system.testclass.HashMap.Entry[] entryArray2 = hashMap1.table;
        boolean boolean3 = hashMap1.isEmpty();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap(100, (float) '#');
        system.testclass.HashMap.Entry[] entryArray7 = hashMap6.table;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap.Entry[] entryArray11 = hashMap10.table;
        java.lang.Object obj13 = hashMap10.get((java.lang.Object) (short) 1);
        hashMap10.modCount = ' ';
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        int int17 = hashMap16.modCount;
        int int18 = hashMap16.modCount;
        system.testclass.HashMap.Entry[] entryArray19 = hashMap16.table;
        hashMap16.clear();
        java.lang.Object obj22 = hashMap16.remove((java.lang.Object) 0.0d);
        system.testclass.HashMap.Entry[] entryArray23 = hashMap16.table;
        int int24 = hashMap16.modCount;
        hashMap16.clear();
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap.Entry[] entryArray29 = hashMap28.table;
        hashMap28.clear();
        java.lang.Object obj31 = hashMap16.remove((java.lang.Object) hashMap28);
        system.testclass.HashMap.Entry[] entryArray32 = hashMap16.table;
        java.lang.Object obj33 = hashMap10.remove((java.lang.Object) hashMap16);
        boolean boolean34 = hashMap10.isEmpty();
        java.lang.Object obj35 = hashMap1.put((java.lang.Object) hashMap6, (java.lang.Object) hashMap10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        int int3 = hashMap2.modCount;
        boolean boolean4 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        hashMap5.clear();
        int int9 = hashMap5.modCount;
        system.testclass.HashMap.Entry[] entryArray10 = hashMap5.table;
        hashMap5.modCount = '#';
        hashMap5.modCount = (short) -1;
        int int15 = hashMap5.modCount;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        boolean boolean20 = hashMap19.isEmpty();
        int int21 = hashMap19.size();
        hashMap19.clear();
        java.lang.Object obj23 = hashMap18.remove((java.lang.Object) hashMap19);
        java.lang.Object obj25 = hashMap18.get((java.lang.Object) true);
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap(0, (float) (short) 100);
        hashMap28.clear();
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int33 = hashMap32.modCount;
        java.lang.Class<?> wildcardClass34 = hashMap32.getClass();
        java.lang.Object obj35 = hashMap28.remove((java.lang.Object) wildcardClass34);
        java.lang.Object obj36 = hashMap18.remove((java.lang.Object) hashMap28);
        java.lang.Object obj37 = hashMap5.get(obj36);
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        int int39 = hashMap38.modCount;
        int int40 = hashMap38.modCount;
        hashMap38.clear();
        int int42 = hashMap38.modCount;
        system.testclass.HashMap.Entry[] entryArray43 = hashMap38.table;
        hashMap38.modCount = '#';
        hashMap38.modCount = (short) -1;
        int int48 = hashMap38.modCount;
        system.testclass.HashMap hashMap51 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap();
        boolean boolean53 = hashMap52.isEmpty();
        int int54 = hashMap52.size();
        hashMap52.clear();
        java.lang.Object obj56 = hashMap51.remove((java.lang.Object) hashMap52);
        java.lang.Object obj58 = hashMap51.get((java.lang.Object) true);
        system.testclass.HashMap hashMap61 = new system.testclass.HashMap(0, (float) (short) 100);
        hashMap61.clear();
        system.testclass.HashMap hashMap65 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int66 = hashMap65.modCount;
        java.lang.Class<?> wildcardClass67 = hashMap65.getClass();
        java.lang.Object obj68 = hashMap61.remove((java.lang.Object) wildcardClass67);
        java.lang.Object obj69 = hashMap51.remove((java.lang.Object) hashMap61);
        java.lang.Object obj70 = hashMap38.get(obj69);
        int int71 = hashMap38.size();
        system.testclass.HashMap hashMap74 = new system.testclass.HashMap(0, (float) (short) 100);
        hashMap74.clear();
        int int76 = hashMap74.size();
        system.testclass.HashMap hashMap77 = new system.testclass.HashMap();
        int int78 = hashMap77.modCount;
        int int79 = hashMap77.modCount;
        system.testclass.HashMap.Entry[] entryArray80 = hashMap77.table;
        hashMap77.clear();
        java.lang.Object obj83 = hashMap77.remove((java.lang.Object) 0.0d);
        boolean boolean84 = hashMap77.isEmpty();
        system.testclass.HashMap hashMap85 = new system.testclass.HashMap();
        boolean boolean86 = hashMap85.isEmpty();
        int int87 = hashMap85.size();
        hashMap85.clear();
        java.lang.Object obj89 = hashMap77.get((java.lang.Object) hashMap85);
        int int90 = hashMap77.size();
        java.lang.Object obj91 = hashMap74.remove((java.lang.Object) hashMap77);
        java.lang.Object obj92 = hashMap38.remove((java.lang.Object) hashMap74);
        java.lang.Object obj93 = hashMap2.put(obj37, (java.lang.Object) hashMap74);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        hashMap0.clear();
        int int5 = hashMap0.size();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.modCount;
        int int8 = hashMap6.modCount;
        int int9 = hashMap6.size();
        hashMap6.modCount = (short) 100;
        java.lang.Object obj12 = hashMap0.get((java.lang.Object) (short) 100);
        system.testclass.HashMap.Entry[] entryArray13 = hashMap0.table;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int17 = hashMap16.modCount;
        hashMap16.modCount = 97;
        java.lang.Object obj21 = hashMap16.remove((java.lang.Object) (short) -1);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray23 = hashMap22.table;
        int int24 = hashMap22.modCount;
        java.lang.Object obj25 = hashMap16.remove((java.lang.Object) hashMap22);
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        int int27 = hashMap26.modCount;
        int int28 = hashMap26.modCount;
        system.testclass.HashMap.Entry[] entryArray29 = hashMap26.table;
        hashMap26.clear();
        java.lang.Object obj32 = hashMap26.remove((java.lang.Object) 0.0d);
        boolean boolean33 = hashMap26.isEmpty();
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap.Entry[] entryArray37 = hashMap36.table;
        int int38 = hashMap36.modCount;
        system.testclass.HashMap.Entry[] entryArray39 = hashMap36.table;
        java.lang.Object obj40 = hashMap26.remove((java.lang.Object) entryArray39);
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        int int42 = hashMap41.modCount;
        int int43 = hashMap41.modCount;
        hashMap41.clear();
        java.lang.Object obj45 = null;
        java.lang.Object obj46 = hashMap41.remove(obj45);
        java.lang.Object obj47 = hashMap26.get((java.lang.Object) hashMap41);
        java.lang.Object obj48 = hashMap0.put(obj25, obj47);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap.Entry[] entryArray3 = hashMap2.table;
        java.lang.Object obj5 = hashMap2.get((java.lang.Object) (short) 1);
        hashMap2.modCount = ' ';
        boolean boolean8 = hashMap2.isEmpty();
        boolean boolean9 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap((int) (byte) 10, (float) (short) 1);
        hashMap12.modCount = 0;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        int int17 = hashMap15.modCount;
        int int18 = hashMap15.size();
        hashMap15.modCount = (short) 100;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap((int) (byte) 10, (float) (short) 1);
        boolean boolean24 = hashMap23.isEmpty();
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        int int26 = hashMap25.modCount;
        int int27 = hashMap25.modCount;
        system.testclass.HashMap.Entry[] entryArray28 = hashMap25.table;
        boolean boolean29 = hashMap25.isEmpty();
        int int30 = hashMap25.modCount;
        int int31 = hashMap25.modCount;
        system.testclass.HashMap.Entry[] entryArray32 = hashMap25.table;
        hashMap23.table = entryArray32;
        hashMap15.table = entryArray32;
        hashMap15.modCount = (short) 1;
        system.testclass.HashMap.Entry[] entryArray37 = hashMap15.table;
        hashMap12.table = entryArray37;
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap(97);
        java.lang.Class<?> wildcardClass41 = hashMap40.getClass();
        java.lang.Object obj42 = hashMap2.put((java.lang.Object) hashMap12, (java.lang.Object) wildcardClass41);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        hashMap0.clear();
        java.lang.Object obj6 = hashMap0.remove((java.lang.Object) 0.0d);
        int int7 = hashMap0.size();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        hashMap8.modCount = 0;
        hashMap8.clear();
        java.lang.Object obj12 = hashMap0.get((java.lang.Object) hashMap8);
        java.lang.Object obj14 = hashMap0.get((java.lang.Object) (short) -1);
        boolean boolean15 = hashMap0.isEmpty();
        system.testclass.HashMap.Entry[] entryArray16 = hashMap0.table;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap.Entry[] entryArray20 = hashMap19.table;
        int int21 = hashMap19.modCount;
        system.testclass.HashMap.Entry[] entryArray22 = hashMap19.table;
        hashMap0.table = entryArray22;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 1);
        hashMap1.clear();
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        system.testclass.HashMap.Entry[] entryArray6 = hashMap3.table;
        hashMap3.clear();
        java.lang.Object obj9 = hashMap3.remove((java.lang.Object) 0.0d);
        java.lang.Object obj11 = hashMap3.remove((java.lang.Object) (short) 0);
        boolean boolean12 = hashMap3.isEmpty();
        hashMap3.modCount = 'a';
        system.testclass.HashMap.Entry[] entryArray15 = hashMap3.table;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        int int17 = hashMap16.modCount;
        int int18 = hashMap16.modCount;
        system.testclass.HashMap.Entry[] entryArray19 = hashMap16.table;
        boolean boolean20 = hashMap16.isEmpty();
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap.Entry[] entryArray24 = hashMap23.table;
        java.lang.Object obj25 = hashMap16.get((java.lang.Object) entryArray24);
        java.lang.Object obj26 = hashMap1.put((java.lang.Object) hashMap3, obj25);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
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
        int int15 = hashMap14.modCount;
        int int16 = hashMap14.modCount;
        system.testclass.HashMap.Entry[] entryArray17 = hashMap14.table;
        int int18 = hashMap14.size();
        java.lang.Object obj19 = hashMap8.remove((java.lang.Object) hashMap14);
        boolean boolean20 = hashMap8.isEmpty();
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap(10, (float) 97);
        java.lang.Class<?> wildcardClass24 = hashMap23.getClass();
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        int int26 = hashMap25.modCount;
        int int27 = hashMap25.modCount;
        system.testclass.HashMap.Entry[] entryArray28 = hashMap25.table;
        hashMap25.clear();
        java.lang.Object obj31 = hashMap25.remove((java.lang.Object) 0.0d);
        system.testclass.HashMap.Entry[] entryArray32 = hashMap25.table;
        int int33 = hashMap25.modCount;
        hashMap25.clear();
        java.lang.Object obj35 = hashMap8.put((java.lang.Object) wildcardClass24, (java.lang.Object) hashMap25);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap8", hashMap8.repOK_1());
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
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
        hashMap7.modCount = 'a';
        int int13 = hashMap7.modCount;
        hashMap7.clear();
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap(0, 100.0f);
        hashMap17.modCount = (short) -1;
        hashMap17.modCount = 'a';
        boolean boolean22 = hashMap17.isEmpty();
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap(1);
        hashMap24.clear();
        system.testclass.HashMap.Entry[] entryArray26 = hashMap24.table;
        hashMap17.table = entryArray26;
        java.lang.Object obj28 = hashMap0.put((java.lang.Object) hashMap7, (java.lang.Object) entryArray26);
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
        hashMap0.clear();
        java.lang.Object obj6 = hashMap0.remove((java.lang.Object) 0.0d);
        system.testclass.HashMap.Entry[] entryArray7 = hashMap0.table;
        int int8 = hashMap0.modCount;
        hashMap0.clear();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap.Entry[] entryArray13 = hashMap12.table;
        hashMap12.clear();
        java.lang.Object obj15 = hashMap0.remove((java.lang.Object) hashMap12);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        int int18 = hashMap17.modCount;
        int int19 = hashMap17.modCount;
        system.testclass.HashMap.Entry[] entryArray20 = hashMap17.table;
        boolean boolean21 = hashMap17.isEmpty();
        java.lang.Object obj22 = hashMap0.put((java.lang.Object) 10.0f, (java.lang.Object) hashMap17);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(97, 10.0f);
        int int3 = hashMap2.size();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int7 = hashMap6.modCount;
        system.testclass.HashMap.Entry[] entryArray8 = hashMap6.table;
        hashMap2.table = entryArray8;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (short) 100);
        hashMap2.clear();
        hashMap2.modCount = (byte) -1;
        int int6 = hashMap2.modCount;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap(0, (float) (short) 100);
        int int10 = hashMap9.modCount;
        hashMap9.modCount = 100;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap(0, 100.0f);
        hashMap15.modCount = (short) -1;
        hashMap15.clear();
        java.lang.Object obj19 = hashMap2.put((java.lang.Object) 100, (java.lang.Object) hashMap15);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }
}

