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
        hashMap0.clear();
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = hashMap0.remove(obj4);
        java.lang.Object obj8 = hashMap0.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
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
        hashMap0.clear();
        system.testclass.HashMap.Entry[] entryArray4 = new system.testclass.HashMap.Entry[] {};
        hashMap0.table = entryArray4;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        hashMap0.clear();
        system.testclass.HashMap.Entry[] entryArray5 = new system.testclass.HashMap.Entry[] {};
        hashMap0.table = entryArray5;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int3 = hashMap2.size();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        system.testclass.HashMap.Entry[] entryArray7 = hashMap4.table;
        hashMap2.table = entryArray7;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        java.lang.Object obj5 = hashMap0.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        java.lang.Object obj11 = hashMap6.get((java.lang.Object) hashMap9);
        system.testclass.HashMap.Entry[] entryArray12 = new system.testclass.HashMap.Entry[] {};
        hashMap6.table = entryArray12;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap6", hashMap6.repOK_1());
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        system.testclass.HashMap.Entry[] entryArray3 = new system.testclass.HashMap.Entry[] {};
        hashMap2.table = entryArray3;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        hashMap0.clear();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        int int6 = hashMap4.size();
        hashMap4.clear();
        java.lang.Object obj9 = hashMap4.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        java.lang.Object obj12 = hashMap4.remove((java.lang.Object) hashMap10);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        system.testclass.HashMap.Entry[] entryArray16 = hashMap13.table;
        system.testclass.HashMap.Entry[] entryArray17 = hashMap13.table;
        hashMap10.table = entryArray17;
        int int19 = hashMap10.size();
        java.lang.Object obj21 = hashMap0.put((java.lang.Object) int19, (java.lang.Object) 2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        hashMap3.clear();
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = hashMap3.remove(obj7);
        java.lang.Object obj9 = hashMap2.remove((java.lang.Object) hashMap3);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.modCount;
        int int12 = hashMap10.modCount;
        hashMap10.clear();
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = hashMap10.remove(obj14);
        hashMap10.clear();
        hashMap10.modCount = 0;
        system.testclass.HashMap.Entry[] entryArray19 = hashMap10.table;
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        int int21 = hashMap20.modCount;
        int int22 = hashMap20.modCount;
        hashMap20.clear();
        java.lang.Object obj24 = null;
        java.lang.Object obj25 = hashMap20.remove(obj24);
        hashMap20.clear();
        hashMap20.modCount = 0;
        java.lang.Object obj29 = hashMap3.put((java.lang.Object) hashMap10, (java.lang.Object) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap3", hashMap3.repOK_1());
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = hashMap0.remove(obj4);
        hashMap0.clear();
        int int7 = hashMap0.size();
        int int8 = hashMap0.modCount;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int12 = hashMap11.size();
        java.lang.Object obj14 = hashMap0.put((java.lang.Object) hashMap11, (java.lang.Object) 0.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        system.testclass.HashMap.Entry[] entryArray4 = hashMap0.table;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        boolean boolean6 = hashMap5.isEmpty();
        hashMap5.clear();
        java.lang.Class<?> wildcardClass8 = hashMap5.getClass();
        java.lang.Object obj10 = hashMap0.put((java.lang.Object) hashMap5, (java.lang.Object) 100.0f);
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
        hashMap0.clear();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        hashMap4.clear();
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = hashMap4.remove(obj8);
        hashMap4.clear();
        int int11 = hashMap4.size();
        int int12 = hashMap4.modCount;
        boolean boolean13 = hashMap4.isEmpty();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        hashMap14.modCount = 0;
        hashMap14.clear();
        int int18 = hashMap14.modCount;
        java.lang.Object obj19 = hashMap0.put((java.lang.Object) hashMap4, (java.lang.Object) hashMap14);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 10);
        int int2 = hashMap1.modCount;
        int int3 = hashMap1.size();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        int int6 = hashMap4.size();
        hashMap4.clear();
        java.lang.Object obj9 = hashMap4.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        java.lang.Object obj12 = hashMap4.remove((java.lang.Object) hashMap10);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        system.testclass.HashMap.Entry[] entryArray16 = hashMap13.table;
        system.testclass.HashMap.Entry[] entryArray17 = hashMap13.table;
        hashMap10.table = entryArray17;
        int int19 = hashMap10.size();
        hashMap10.clear();
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap((int) (short) 0, (float) (byte) 100);
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        boolean boolean25 = hashMap24.isEmpty();
        int int26 = hashMap24.size();
        java.lang.Object obj28 = hashMap24.remove((java.lang.Object) (short) 0);
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        int int30 = hashMap29.modCount;
        int int31 = hashMap29.modCount;
        system.testclass.HashMap.Entry[] entryArray32 = hashMap29.table;
        system.testclass.HashMap.Entry[] entryArray33 = hashMap29.table;
        hashMap24.table = entryArray33;
        hashMap23.table = entryArray33;
        java.lang.Object obj36 = hashMap1.put((java.lang.Object) hashMap10, (java.lang.Object) entryArray33);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        int int3 = hashMap0.modCount;
        int int4 = hashMap0.modCount;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        system.testclass.HashMap.Entry[] entryArray8 = hashMap5.table;
        system.testclass.HashMap.Entry[] entryArray9 = hashMap5.table;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        java.lang.Object obj17 = hashMap13.remove((java.lang.Object) 0.0d);
        java.lang.Object obj18 = hashMap12.get(obj17);
        hashMap12.modCount = '#';
        int int21 = hashMap12.modCount;
        java.lang.Object obj22 = hashMap0.put((java.lang.Object) hashMap5, (java.lang.Object) hashMap12);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        hashMap0.clear();
        int int3 = hashMap0.modCount;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) (byte) 10, (float) 100L);
        java.lang.Object obj8 = hashMap0.put((java.lang.Object) 100L, (java.lang.Object) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.modCount;
        int int8 = hashMap6.modCount;
        hashMap6.clear();
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = hashMap6.remove(obj10);
        java.lang.Object obj12 = hashMap5.remove((java.lang.Object) hashMap6);
        java.lang.Object obj14 = hashMap6.get((java.lang.Object) (short) 10);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        int int17 = hashMap15.modCount;
        int int18 = hashMap15.modCount;
        system.testclass.HashMap.Entry[] entryArray19 = hashMap15.table;
        java.lang.Object obj20 = hashMap6.remove((java.lang.Object) hashMap15);
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap(0, (float) (short) 10);
        system.testclass.HashMap.Entry[] entryArray24 = hashMap23.table;
        java.lang.Class<?> wildcardClass25 = hashMap23.getClass();
        java.lang.Object obj26 = hashMap2.put((java.lang.Object) hashMap15, (java.lang.Object) hashMap23);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        int int5 = hashMap3.size();
        hashMap3.clear();
        int int7 = hashMap3.size();
        java.lang.Class<?> wildcardClass8 = hashMap3.getClass();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) (short) 10);
        int int11 = hashMap10.modCount;
        int int12 = hashMap10.size();
        java.lang.Object obj13 = hashMap2.put((java.lang.Object) hashMap3, (java.lang.Object) hashMap10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = hashMap0.remove(obj4);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.modCount;
        int int8 = hashMap6.modCount;
        hashMap6.clear();
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = hashMap6.remove(obj10);
        hashMap6.clear();
        hashMap6.modCount = 0;
        system.testclass.HashMap.Entry[] entryArray15 = hashMap6.table;
        hashMap0.table = entryArray15;
        boolean boolean17 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap(0, (float) (short) 10);
        system.testclass.HashMap.Entry[] entryArray21 = hashMap20.table;
        hashMap0.table = entryArray21;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = hashMap0.remove(obj4);
        hashMap0.clear();
        hashMap0.modCount = 0;
        hashMap0.clear();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.modCount;
        int int12 = hashMap10.modCount;
        java.lang.Object obj13 = hashMap0.remove((java.lang.Object) hashMap10);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.modCount;
        int int16 = hashMap14.modCount;
        hashMap14.clear();
        java.lang.Object obj18 = hashMap10.remove((java.lang.Object) hashMap14);
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Class<?> wildcardClass22 = hashMap21.getClass();
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        int int24 = hashMap23.modCount;
        int int25 = hashMap23.modCount;
        int int26 = hashMap23.size();
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        int int28 = hashMap27.modCount;
        int int29 = hashMap27.modCount;
        system.testclass.HashMap.Entry[] entryArray30 = hashMap27.table;
        boolean boolean31 = hashMap27.isEmpty();
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        int int33 = hashMap32.modCount;
        int int34 = hashMap32.modCount;
        system.testclass.HashMap.Entry[] entryArray35 = hashMap32.table;
        java.lang.Object obj36 = hashMap27.get((java.lang.Object) entryArray35);
        hashMap23.table = entryArray35;
        java.lang.Object obj38 = hashMap14.put((java.lang.Object) hashMap21, (java.lang.Object) entryArray35);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap14", hashMap14.repOK_1());
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        java.lang.Object obj4 = hashMap0.remove((java.lang.Object) (short) 0);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        system.testclass.HashMap.Entry[] entryArray8 = hashMap5.table;
        system.testclass.HashMap.Entry[] entryArray9 = hashMap5.table;
        hashMap0.table = entryArray9;
        hashMap0.clear();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        int int17 = hashMap15.modCount;
        hashMap15.clear();
        java.lang.Object obj19 = null;
        java.lang.Object obj20 = hashMap15.remove(obj19);
        java.lang.Object obj21 = hashMap14.remove((java.lang.Object) hashMap15);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        boolean boolean23 = hashMap22.isEmpty();
        hashMap22.clear();
        java.lang.Object obj25 = hashMap0.put((java.lang.Object) hashMap14, (java.lang.Object) hashMap22);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 10);
        hashMap1.modCount = '#';
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        system.testclass.HashMap.Entry[] entryArray7 = hashMap4.table;
        boolean boolean8 = hashMap4.isEmpty();
        java.lang.Object obj10 = hashMap1.put((java.lang.Object) boolean8, (java.lang.Object) 10.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        hashMap3.clear();
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = hashMap3.remove(obj7);
        java.lang.Object obj9 = hashMap2.remove((java.lang.Object) hashMap3);
        hashMap3.clear();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int14 = hashMap13.size();
        java.lang.Object obj16 = hashMap3.put((java.lang.Object) int14, (java.lang.Object) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap3", hashMap3.repOK_1());
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '#', (float) 'a');
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) '4', (float) (byte) 10);
        java.lang.Object obj6 = hashMap2.get((java.lang.Object) '4');
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap((int) (short) 0, (float) (byte) 100);
        java.lang.Object obj10 = hashMap2.get((java.lang.Object) (short) 0);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        boolean boolean12 = hashMap11.isEmpty();
        int int13 = hashMap11.size();
        java.lang.Object obj15 = hashMap11.get((java.lang.Object) (short) -1);
        int int16 = hashMap11.modCount;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        boolean boolean18 = hashMap17.isEmpty();
        int int19 = hashMap17.size();
        hashMap17.clear();
        java.lang.Object obj22 = hashMap17.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        boolean boolean24 = hashMap23.isEmpty();
        java.lang.Object obj25 = hashMap17.remove((java.lang.Object) hashMap23);
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        int int27 = hashMap26.modCount;
        int int28 = hashMap26.modCount;
        system.testclass.HashMap.Entry[] entryArray29 = hashMap26.table;
        system.testclass.HashMap.Entry[] entryArray30 = hashMap26.table;
        hashMap23.table = entryArray30;
        hashMap11.table = entryArray30;
        hashMap2.table = entryArray30;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        hashMap3.clear();
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = hashMap3.remove(obj7);
        java.lang.Object obj9 = hashMap2.remove((java.lang.Object) hashMap3);
        hashMap2.clear();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        boolean boolean12 = hashMap11.isEmpty();
        int int13 = hashMap11.size();
        java.lang.Object obj15 = hashMap11.remove((java.lang.Object) (short) 0);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        int int17 = hashMap16.modCount;
        int int18 = hashMap16.modCount;
        system.testclass.HashMap.Entry[] entryArray19 = hashMap16.table;
        system.testclass.HashMap.Entry[] entryArray20 = hashMap16.table;
        hashMap11.table = entryArray20;
        hashMap11.clear();
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        boolean boolean24 = hashMap23.isEmpty();
        java.lang.Class<?> wildcardClass25 = hashMap23.getClass();
        java.lang.Object obj26 = hashMap2.put((java.lang.Object) hashMap11, (java.lang.Object) wildcardClass25);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int3 = hashMap2.size();
        hashMap2.modCount = (short) 1;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.modCount;
        int int8 = hashMap6.modCount;
        hashMap6.clear();
        hashMap6.clear();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        boolean boolean12 = hashMap11.isEmpty();
        java.lang.Object obj13 = hashMap2.put((java.lang.Object) hashMap6, (java.lang.Object) hashMap11);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        hashMap0.clear();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) (short) 10);
        boolean boolean7 = hashMap6.isEmpty();
        java.lang.Object obj9 = hashMap6.get((java.lang.Object) 100L);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.modCount;
        int int12 = hashMap10.modCount;
        hashMap10.clear();
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = hashMap10.remove(obj14);
        hashMap10.clear();
        hashMap10.modCount = 0;
        hashMap10.clear();
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        int int21 = hashMap20.modCount;
        int int22 = hashMap20.modCount;
        java.lang.Object obj23 = hashMap10.remove((java.lang.Object) hashMap20);
        java.lang.Object obj24 = hashMap0.put((java.lang.Object) hashMap6, obj23);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        hashMap0.clear();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        hashMap4.clear();
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = hashMap4.remove(obj8);
        hashMap4.clear();
        hashMap4.modCount = 0;
        system.testclass.HashMap.Entry[] entryArray13 = hashMap4.table;
        int int14 = hashMap4.size();
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = hashMap4.remove(obj15);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        int int18 = hashMap17.modCount;
        int int19 = hashMap17.modCount;
        system.testclass.HashMap.Entry[] entryArray20 = hashMap17.table;
        boolean boolean21 = hashMap17.isEmpty();
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        int int23 = hashMap22.modCount;
        int int24 = hashMap22.modCount;
        hashMap22.clear();
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        int int27 = hashMap26.modCount;
        int int28 = hashMap26.modCount;
        int int29 = hashMap26.size();
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        int int31 = hashMap30.modCount;
        int int32 = hashMap30.modCount;
        system.testclass.HashMap.Entry[] entryArray33 = hashMap30.table;
        boolean boolean34 = hashMap30.isEmpty();
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        int int36 = hashMap35.modCount;
        int int37 = hashMap35.modCount;
        system.testclass.HashMap.Entry[] entryArray38 = hashMap35.table;
        java.lang.Object obj39 = hashMap30.get((java.lang.Object) entryArray38);
        hashMap26.table = entryArray38;
        java.lang.Object obj41 = hashMap22.get((java.lang.Object) entryArray38);
        java.lang.Object obj42 = hashMap17.remove((java.lang.Object) entryArray38);
        java.lang.Object obj43 = hashMap0.put(obj16, (java.lang.Object) entryArray38);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        java.lang.Object obj5 = hashMap0.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        int int11 = hashMap9.modCount;
        hashMap9.clear();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = hashMap9.remove(obj13);
        hashMap9.clear();
        int int16 = hashMap9.size();
        java.lang.Object obj17 = hashMap6.get((java.lang.Object) int16);
        hashMap6.modCount = (byte) -1;
        hashMap6.clear();
        hashMap6.modCount = 10;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        int int24 = hashMap23.modCount;
        int int25 = hashMap23.modCount;
        hashMap23.clear();
        java.lang.Object obj27 = null;
        java.lang.Object obj28 = hashMap23.remove(obj27);
        hashMap23.clear();
        hashMap23.modCount = 0;
        hashMap23.modCount = 10;
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        boolean boolean35 = hashMap34.isEmpty();
        int int36 = hashMap34.size();
        hashMap34.clear();
        java.lang.Object obj39 = hashMap34.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        boolean boolean41 = hashMap40.isEmpty();
        java.lang.Object obj42 = hashMap34.remove((java.lang.Object) hashMap40);
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap();
        int int44 = hashMap43.modCount;
        int int45 = hashMap43.modCount;
        system.testclass.HashMap.Entry[] entryArray46 = hashMap43.table;
        system.testclass.HashMap.Entry[] entryArray47 = hashMap43.table;
        hashMap40.table = entryArray47;
        hashMap23.table = entryArray47;
        system.testclass.HashMap hashMap50 = new system.testclass.HashMap();
        boolean boolean51 = hashMap50.isEmpty();
        int int52 = hashMap50.size();
        java.lang.Object obj54 = hashMap50.get((java.lang.Object) (short) -1);
        int int55 = hashMap50.modCount;
        system.testclass.HashMap hashMap56 = new system.testclass.HashMap();
        boolean boolean57 = hashMap56.isEmpty();
        int int58 = hashMap56.size();
        hashMap56.clear();
        java.lang.Object obj61 = hashMap56.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap62 = new system.testclass.HashMap();
        boolean boolean63 = hashMap62.isEmpty();
        java.lang.Object obj64 = hashMap56.remove((java.lang.Object) hashMap62);
        system.testclass.HashMap hashMap65 = new system.testclass.HashMap();
        int int66 = hashMap65.modCount;
        int int67 = hashMap65.modCount;
        system.testclass.HashMap.Entry[] entryArray68 = hashMap65.table;
        system.testclass.HashMap.Entry[] entryArray69 = hashMap65.table;
        hashMap62.table = entryArray69;
        hashMap50.table = entryArray69;
        int int72 = hashMap50.modCount;
        system.testclass.HashMap hashMap73 = new system.testclass.HashMap();
        boolean boolean74 = hashMap73.isEmpty();
        int int75 = hashMap73.size();
        java.lang.Object obj77 = hashMap73.get((java.lang.Object) (short) -1);
        int int78 = hashMap73.modCount;
        system.testclass.HashMap hashMap79 = new system.testclass.HashMap();
        boolean boolean80 = hashMap79.isEmpty();
        int int81 = hashMap79.size();
        hashMap79.clear();
        java.lang.Object obj84 = hashMap79.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap85 = new system.testclass.HashMap();
        boolean boolean86 = hashMap85.isEmpty();
        java.lang.Object obj87 = hashMap79.remove((java.lang.Object) hashMap85);
        system.testclass.HashMap hashMap88 = new system.testclass.HashMap();
        int int89 = hashMap88.modCount;
        int int90 = hashMap88.modCount;
        system.testclass.HashMap.Entry[] entryArray91 = hashMap88.table;
        system.testclass.HashMap.Entry[] entryArray92 = hashMap88.table;
        hashMap85.table = entryArray92;
        hashMap73.table = entryArray92;
        hashMap50.table = entryArray92;
        java.lang.Object obj96 = hashMap6.put((java.lang.Object) hashMap23, (java.lang.Object) entryArray92);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap6", hashMap6.repOK_1());
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        java.lang.Object obj4 = hashMap0.get((java.lang.Object) (short) -1);
        int int5 = hashMap0.modCount;
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) 10L);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        int int13 = hashMap11.modCount;
        hashMap11.clear();
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = hashMap11.remove(obj15);
        java.lang.Object obj17 = hashMap10.remove((java.lang.Object) hashMap11);
        hashMap10.clear();
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        boolean boolean20 = hashMap19.isEmpty();
        int int21 = hashMap19.size();
        hashMap19.clear();
        java.lang.Object obj24 = hashMap19.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        boolean boolean26 = hashMap25.isEmpty();
        java.lang.Object obj27 = hashMap19.remove((java.lang.Object) hashMap25);
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        int int29 = hashMap28.modCount;
        int int30 = hashMap28.modCount;
        hashMap28.clear();
        java.lang.Object obj32 = null;
        java.lang.Object obj33 = hashMap28.remove(obj32);
        hashMap28.clear();
        int int35 = hashMap28.size();
        java.lang.Object obj36 = hashMap25.get((java.lang.Object) int35);
        hashMap25.modCount = (byte) -1;
        hashMap25.clear();
        java.lang.Object obj40 = hashMap0.put((java.lang.Object) hashMap10, (java.lang.Object) hashMap25);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        int int3 = hashMap0.size();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        hashMap4.modCount = 0;
        hashMap4.clear();
        int int8 = hashMap4.size();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        int int11 = hashMap9.size();
        java.lang.Object obj13 = hashMap9.get((java.lang.Object) (short) -1);
        boolean boolean14 = hashMap9.isEmpty();
        hashMap9.modCount = (byte) 1;
        java.lang.Object obj17 = hashMap0.put((java.lang.Object) int8, (java.lang.Object) hashMap9);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '#', (float) '4');
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.modCount;
        int int8 = hashMap6.modCount;
        hashMap6.clear();
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = hashMap6.remove(obj10);
        java.lang.Object obj12 = hashMap5.remove((java.lang.Object) hashMap6);
        java.lang.Object obj13 = hashMap2.remove(obj12);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        boolean boolean15 = hashMap14.isEmpty();
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        int int17 = hashMap16.modCount;
        int int18 = hashMap16.modCount;
        hashMap16.clear();
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        int int21 = hashMap20.modCount;
        int int22 = hashMap20.modCount;
        int int23 = hashMap20.size();
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.modCount;
        int int26 = hashMap24.modCount;
        system.testclass.HashMap.Entry[] entryArray27 = hashMap24.table;
        boolean boolean28 = hashMap24.isEmpty();
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        int int30 = hashMap29.modCount;
        int int31 = hashMap29.modCount;
        system.testclass.HashMap.Entry[] entryArray32 = hashMap29.table;
        java.lang.Object obj33 = hashMap24.get((java.lang.Object) entryArray32);
        hashMap20.table = entryArray32;
        java.lang.Object obj35 = hashMap16.get((java.lang.Object) entryArray32);
        hashMap14.table = entryArray32;
        hashMap2.table = entryArray32;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = hashMap0.remove(obj4);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.modCount;
        int int8 = hashMap6.modCount;
        hashMap6.clear();
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = hashMap6.remove(obj10);
        hashMap6.clear();
        hashMap6.modCount = 0;
        system.testclass.HashMap.Entry[] entryArray15 = hashMap6.table;
        hashMap0.table = entryArray15;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap((int) (short) 0, (float) (byte) 100);
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        boolean boolean21 = hashMap20.isEmpty();
        int int22 = hashMap20.size();
        java.lang.Object obj24 = hashMap20.remove((java.lang.Object) (short) 0);
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        int int26 = hashMap25.modCount;
        int int27 = hashMap25.modCount;
        system.testclass.HashMap.Entry[] entryArray28 = hashMap25.table;
        system.testclass.HashMap.Entry[] entryArray29 = hashMap25.table;
        hashMap20.table = entryArray29;
        hashMap19.table = entryArray29;
        java.lang.Object obj33 = hashMap19.remove((java.lang.Object) (short) 100);
        java.lang.Object obj34 = null;
        java.lang.Object obj35 = hashMap0.put(obj33, obj34);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        boolean boolean3 = hashMap2.isEmpty();
        int int4 = hashMap2.size();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) (short) 10);
        boolean boolean7 = hashMap6.isEmpty();
        java.lang.Object obj9 = hashMap6.get((java.lang.Object) 100L);
        system.testclass.HashMap.Entry[] entryArray10 = hashMap6.table;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        int int13 = hashMap11.modCount;
        hashMap11.clear();
        hashMap11.clear();
        boolean boolean16 = hashMap11.isEmpty();
        hashMap11.clear();
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        int int19 = hashMap18.modCount;
        int int20 = hashMap18.modCount;
        hashMap18.clear();
        java.lang.Object obj23 = hashMap18.remove((java.lang.Object) (short) -1);
        java.lang.Object obj24 = hashMap11.remove((java.lang.Object) hashMap18);
        java.lang.Object obj25 = hashMap2.put((java.lang.Object) hashMap6, (java.lang.Object) hashMap11);
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
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (short) -1);
        hashMap0.modCount = (byte) 10;
        hashMap0.modCount = (byte) 0;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        java.lang.Object obj17 = hashMap13.remove((java.lang.Object) 0.0d);
        java.lang.Object obj18 = hashMap12.get(obj17);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        int int20 = hashMap19.modCount;
        int int21 = hashMap19.modCount;
        hashMap19.clear();
        java.lang.Object obj23 = hashMap12.remove((java.lang.Object) hashMap19);
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap((int) (short) 0, (float) (byte) 100);
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        boolean boolean28 = hashMap27.isEmpty();
        int int29 = hashMap27.size();
        java.lang.Object obj31 = hashMap27.remove((java.lang.Object) (short) 0);
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        int int33 = hashMap32.modCount;
        int int34 = hashMap32.modCount;
        system.testclass.HashMap.Entry[] entryArray35 = hashMap32.table;
        system.testclass.HashMap.Entry[] entryArray36 = hashMap32.table;
        hashMap27.table = entryArray36;
        hashMap26.table = entryArray36;
        java.lang.Object obj39 = hashMap0.put((java.lang.Object) hashMap19, (java.lang.Object) hashMap26);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        java.lang.Object obj5 = hashMap0.get((java.lang.Object) (byte) 0);
        hashMap0.modCount = 'a';
        hashMap0.modCount = (-1);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        int int12 = hashMap10.size();
        hashMap10.clear();
        java.lang.Object obj15 = hashMap10.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        boolean boolean17 = hashMap16.isEmpty();
        java.lang.Object obj18 = hashMap10.remove((java.lang.Object) hashMap16);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        int int20 = hashMap19.modCount;
        int int21 = hashMap19.modCount;
        system.testclass.HashMap.Entry[] entryArray22 = hashMap19.table;
        system.testclass.HashMap.Entry[] entryArray23 = hashMap19.table;
        hashMap16.table = entryArray23;
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap((int) (byte) 10, (float) 100L);
        java.lang.Object obj28 = hashMap0.put((java.lang.Object) hashMap16, (java.lang.Object) hashMap27);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        hashMap3.clear();
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = hashMap3.remove(obj7);
        java.lang.Object obj9 = hashMap2.remove((java.lang.Object) hashMap3);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap((int) (short) 10, (float) 1);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        hashMap13.clear();
        java.lang.Object obj17 = null;
        java.lang.Object obj18 = hashMap13.remove(obj17);
        hashMap13.clear();
        system.testclass.HashMap.Entry[] entryArray20 = hashMap13.table;
        java.lang.Object obj21 = hashMap3.put((java.lang.Object) (short) 10, (java.lang.Object) hashMap13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap3", hashMap3.repOK_1());
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        boolean boolean3 = hashMap2.isEmpty();
        int int4 = hashMap2.size();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) (short) 0, (float) (byte) 100);
        int int8 = hashMap7.size();
        system.testclass.HashMap.Entry[] entryArray9 = hashMap7.table;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.modCount;
        int int12 = hashMap10.modCount;
        hashMap10.clear();
        hashMap10.clear();
        boolean boolean15 = hashMap10.isEmpty();
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        boolean boolean17 = hashMap16.isEmpty();
        int int18 = hashMap16.size();
        hashMap16.clear();
        java.lang.Object obj21 = hashMap16.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        boolean boolean23 = hashMap22.isEmpty();
        java.lang.Object obj24 = hashMap16.remove((java.lang.Object) hashMap22);
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        int int26 = hashMap25.modCount;
        int int27 = hashMap25.modCount;
        system.testclass.HashMap.Entry[] entryArray28 = hashMap25.table;
        system.testclass.HashMap.Entry[] entryArray29 = hashMap25.table;
        hashMap22.table = entryArray29;
        hashMap10.table = entryArray29;
        int int32 = hashMap10.size();
        java.lang.Object obj33 = hashMap2.put((java.lang.Object) hashMap7, (java.lang.Object) int32);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 0, (float) (byte) 100);
        int int3 = hashMap2.size();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        int int6 = hashMap4.size();
        hashMap4.clear();
        java.lang.Object obj9 = hashMap4.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        java.lang.Object obj12 = hashMap4.remove((java.lang.Object) hashMap10);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        hashMap13.clear();
        java.lang.Object obj17 = null;
        java.lang.Object obj18 = hashMap13.remove(obj17);
        hashMap13.clear();
        int int20 = hashMap13.size();
        java.lang.Object obj21 = hashMap10.get((java.lang.Object) int20);
        hashMap10.modCount = (byte) -1;
        hashMap10.clear();
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap.Entry[] entryArray28 = hashMap27.table;
        java.lang.Object obj29 = hashMap2.put((java.lang.Object) hashMap10, (java.lang.Object) entryArray28);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        hashMap3.clear();
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = hashMap3.remove(obj7);
        java.lang.Object obj9 = hashMap2.remove((java.lang.Object) hashMap3);
        java.lang.Object obj11 = hashMap3.get((java.lang.Object) (short) 10);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        int int13 = hashMap12.modCount;
        int int14 = hashMap12.modCount;
        int int15 = hashMap12.modCount;
        system.testclass.HashMap.Entry[] entryArray16 = hashMap12.table;
        java.lang.Object obj17 = hashMap3.remove((java.lang.Object) hashMap12);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        boolean boolean20 = hashMap19.isEmpty();
        java.lang.Object obj21 = hashMap3.put((java.lang.Object) 10L, (java.lang.Object) hashMap19);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap3", hashMap3.repOK_1());
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        boolean boolean4 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        system.testclass.HashMap.Entry[] entryArray8 = hashMap5.table;
        java.lang.Object obj9 = hashMap0.get((java.lang.Object) entryArray8);
        hashMap0.modCount = 2;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap((int) '#', (float) '4');
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        int int19 = hashMap18.modCount;
        int int20 = hashMap18.modCount;
        hashMap18.clear();
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = hashMap18.remove(obj22);
        java.lang.Object obj24 = hashMap17.remove((java.lang.Object) hashMap18);
        java.lang.Object obj25 = hashMap14.remove(obj24);
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        int int30 = hashMap29.modCount;
        int int31 = hashMap29.modCount;
        hashMap29.clear();
        java.lang.Object obj33 = null;
        java.lang.Object obj34 = hashMap29.remove(obj33);
        java.lang.Object obj35 = hashMap28.remove((java.lang.Object) hashMap29);
        java.lang.Object obj37 = hashMap29.get((java.lang.Object) (short) 10);
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        int int39 = hashMap38.modCount;
        int int40 = hashMap38.modCount;
        int int41 = hashMap38.modCount;
        system.testclass.HashMap.Entry[] entryArray42 = hashMap38.table;
        java.lang.Object obj43 = hashMap29.remove((java.lang.Object) hashMap38);
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap();
        boolean boolean45 = hashMap44.isEmpty();
        int int46 = hashMap44.size();
        hashMap44.clear();
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap();
        int int49 = hashMap48.modCount;
        int int50 = hashMap48.modCount;
        hashMap48.clear();
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap();
        int int53 = hashMap52.modCount;
        int int54 = hashMap52.modCount;
        int int55 = hashMap52.size();
        system.testclass.HashMap hashMap56 = new system.testclass.HashMap();
        int int57 = hashMap56.modCount;
        int int58 = hashMap56.modCount;
        system.testclass.HashMap.Entry[] entryArray59 = hashMap56.table;
        boolean boolean60 = hashMap56.isEmpty();
        system.testclass.HashMap hashMap61 = new system.testclass.HashMap();
        int int62 = hashMap61.modCount;
        int int63 = hashMap61.modCount;
        system.testclass.HashMap.Entry[] entryArray64 = hashMap61.table;
        java.lang.Object obj65 = hashMap56.get((java.lang.Object) entryArray64);
        hashMap52.table = entryArray64;
        java.lang.Object obj67 = hashMap48.get((java.lang.Object) entryArray64);
        hashMap44.table = entryArray64;
        java.lang.Object obj69 = hashMap29.remove((java.lang.Object) hashMap44);
        java.lang.Object obj70 = hashMap0.put(obj24, obj69);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        java.lang.Object obj5 = hashMap0.get((java.lang.Object) (byte) 0);
        hashMap0.modCount = 'a';
        int int8 = hashMap0.modCount;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        int int13 = hashMap12.modCount;
        int int14 = hashMap12.modCount;
        java.lang.Object obj16 = hashMap12.remove((java.lang.Object) 0.0d);
        java.lang.Object obj17 = hashMap11.get(obj16);
        hashMap11.modCount = '#';
        int int20 = hashMap11.modCount;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int24 = hashMap23.size();
        hashMap23.modCount = (short) 1;
        system.testclass.HashMap.Entry[] entryArray27 = hashMap23.table;
        hashMap11.table = entryArray27;
        hashMap0.table = entryArray27;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        java.lang.Object obj5 = hashMap0.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        int int11 = hashMap9.modCount;
        hashMap9.clear();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = hashMap9.remove(obj13);
        hashMap9.clear();
        int int16 = hashMap9.size();
        java.lang.Object obj17 = hashMap6.get((java.lang.Object) int16);
        hashMap6.modCount = (byte) -1;
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        int int21 = hashMap20.modCount;
        int int22 = hashMap20.modCount;
        system.testclass.HashMap.Entry[] entryArray23 = hashMap20.table;
        boolean boolean24 = hashMap20.isEmpty();
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        int int26 = hashMap25.modCount;
        int int27 = hashMap25.modCount;
        system.testclass.HashMap.Entry[] entryArray28 = hashMap25.table;
        java.lang.Object obj29 = hashMap20.get((java.lang.Object) entryArray28);
        hashMap20.clear();
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap((int) '#', (float) 'a');
        java.lang.Object obj34 = hashMap6.put((java.lang.Object) hashMap20, (java.lang.Object) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap6", hashMap6.repOK_1());
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        hashMap0.clear();
        int int4 = hashMap0.size();
        hashMap0.modCount = (byte) 1;
        system.testclass.HashMap.Entry[] entryArray7 = hashMap0.table;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        int int13 = hashMap11.modCount;
        java.lang.Object obj15 = hashMap11.remove((java.lang.Object) 0.0d);
        java.lang.Object obj16 = hashMap10.get(obj15);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        int int18 = hashMap17.modCount;
        int int19 = hashMap17.modCount;
        hashMap17.clear();
        java.lang.Object obj21 = hashMap10.remove((java.lang.Object) hashMap17);
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap((int) (short) 10);
        hashMap23.modCount = '#';
        java.lang.Object obj26 = hashMap0.put((java.lang.Object) hashMap17, (java.lang.Object) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 10);
        boolean boolean2 = hashMap1.isEmpty();
        java.lang.Object obj4 = hashMap1.get((java.lang.Object) 100L);
        int int5 = hashMap1.modCount;
        java.lang.Object obj6 = null;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        java.lang.Class<?> wildcardClass10 = hashMap9.getClass();
        java.lang.Object obj11 = hashMap1.put(obj6, (java.lang.Object) wildcardClass10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        hashMap0.clear();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap(10, (float) ' ');
        boolean boolean6 = hashMap5.isEmpty();
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) hashMap5);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        int int11 = hashMap9.size();
        hashMap9.clear();
        java.lang.Object obj14 = hashMap9.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        boolean boolean16 = hashMap15.isEmpty();
        java.lang.Object obj17 = hashMap9.remove((java.lang.Object) hashMap15);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        boolean boolean19 = hashMap18.isEmpty();
        java.lang.Object obj20 = hashMap15.get((java.lang.Object) hashMap18);
        int int21 = hashMap15.size();
        system.testclass.HashMap.Entry[] entryArray22 = hashMap15.table;
        java.lang.Object obj23 = hashMap5.put((java.lang.Object) true, (java.lang.Object) hashMap15);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap5", hashMap5.repOK_1());
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        int int3 = hashMap0.size();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        system.testclass.HashMap.Entry[] entryArray7 = hashMap4.table;
        boolean boolean8 = hashMap4.isEmpty();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        int int11 = hashMap9.modCount;
        system.testclass.HashMap.Entry[] entryArray12 = hashMap9.table;
        java.lang.Object obj13 = hashMap4.get((java.lang.Object) entryArray12);
        hashMap0.table = entryArray12;
        java.lang.Object obj15 = null;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap((int) (short) 0, (float) (byte) 100);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        boolean boolean20 = hashMap19.isEmpty();
        int int21 = hashMap19.size();
        java.lang.Object obj23 = hashMap19.remove((java.lang.Object) (short) 0);
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.modCount;
        int int26 = hashMap24.modCount;
        system.testclass.HashMap.Entry[] entryArray27 = hashMap24.table;
        system.testclass.HashMap.Entry[] entryArray28 = hashMap24.table;
        hashMap19.table = entryArray28;
        hashMap18.table = entryArray28;
        java.lang.Object obj32 = hashMap18.remove((java.lang.Object) (short) 100);
        java.lang.Object obj33 = hashMap0.put(obj15, (java.lang.Object) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        java.lang.Object obj5 = hashMap0.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        int int11 = hashMap9.modCount;
        system.testclass.HashMap.Entry[] entryArray12 = hashMap9.table;
        system.testclass.HashMap.Entry[] entryArray13 = hashMap9.table;
        hashMap6.table = entryArray13;
        int int15 = hashMap6.size();
        hashMap6.clear();
        boolean boolean17 = hashMap6.isEmpty();
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap(10, (float) ' ');
        boolean boolean21 = hashMap20.isEmpty();
        boolean boolean22 = hashMap20.isEmpty();
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap((int) ' ', (float) '#');
        int int26 = hashMap25.size();
        java.lang.Object obj27 = hashMap6.put((java.lang.Object) hashMap20, (java.lang.Object) int26);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap6", hashMap6.repOK_1());
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 10);
        boolean boolean2 = hashMap1.isEmpty();
        java.lang.Object obj4 = hashMap1.get((java.lang.Object) 100L);
        int int5 = hashMap1.modCount;
        int int6 = hashMap1.modCount;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        int int9 = hashMap7.size();
        hashMap7.clear();
        java.lang.Object obj12 = hashMap7.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        hashMap13.clear();
        java.lang.Object obj17 = null;
        java.lang.Object obj18 = hashMap13.remove(obj17);
        hashMap13.clear();
        hashMap13.modCount = 0;
        hashMap13.clear();
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        int int24 = hashMap23.modCount;
        int int25 = hashMap23.modCount;
        java.lang.Object obj26 = hashMap13.remove((java.lang.Object) hashMap23);
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        int int28 = hashMap27.modCount;
        int int29 = hashMap27.modCount;
        hashMap27.clear();
        java.lang.Object obj31 = hashMap23.remove((java.lang.Object) hashMap27);
        java.lang.Object obj32 = hashMap7.remove(obj31);
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap(0, (float) (byte) 1);
        java.lang.Object obj36 = hashMap7.remove((java.lang.Object) 0);
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap((int) '#', (float) 'a');
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap((int) '4', (float) (byte) 10);
        java.lang.Object obj43 = hashMap39.get((java.lang.Object) '4');
        system.testclass.HashMap hashMap46 = new system.testclass.HashMap((int) (short) 0, (float) (byte) 100);
        java.lang.Object obj47 = hashMap39.get((java.lang.Object) (short) 0);
        boolean boolean48 = hashMap39.isEmpty();
        system.testclass.HashMap hashMap50 = new system.testclass.HashMap((int) (short) 10);
        int int51 = hashMap50.modCount;
        int int52 = hashMap50.size();
        java.lang.Object obj53 = hashMap39.remove((java.lang.Object) int52);
        int int54 = hashMap39.modCount;
        java.lang.Object obj55 = hashMap1.put((java.lang.Object) hashMap7, (java.lang.Object) int54);
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
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) ' ', (float) '#');
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) ' ');
        int int8 = hashMap0.size();
        int int9 = hashMap0.size();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        int int12 = hashMap10.size();
        java.lang.Object obj14 = hashMap10.get((java.lang.Object) (short) -1);
        int int15 = hashMap10.modCount;
        java.lang.Object obj17 = hashMap10.remove((java.lang.Object) 10L);
        boolean boolean18 = hashMap10.isEmpty();
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        int int23 = hashMap22.modCount;
        int int24 = hashMap22.modCount;
        java.lang.Object obj26 = hashMap22.remove((java.lang.Object) 0.0d);
        java.lang.Object obj27 = hashMap21.get(obj26);
        java.lang.Object obj28 = hashMap0.put((java.lang.Object) boolean18, obj26);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(100);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        hashMap2.clear();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        int int6 = hashMap4.size();
        java.lang.Object obj8 = hashMap4.get((java.lang.Object) (short) -1);
        int int9 = hashMap4.modCount;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        int int12 = hashMap10.size();
        hashMap10.clear();
        java.lang.Object obj15 = hashMap10.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        boolean boolean17 = hashMap16.isEmpty();
        java.lang.Object obj18 = hashMap10.remove((java.lang.Object) hashMap16);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        int int20 = hashMap19.modCount;
        int int21 = hashMap19.modCount;
        system.testclass.HashMap.Entry[] entryArray22 = hashMap19.table;
        system.testclass.HashMap.Entry[] entryArray23 = hashMap19.table;
        hashMap16.table = entryArray23;
        hashMap4.table = entryArray23;
        hashMap2.table = entryArray23;
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap((int) (byte) 100, (float) '4');
        java.lang.Object obj30 = hashMap1.put((java.lang.Object) entryArray23, (java.lang.Object) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        java.lang.Object obj4 = hashMap0.get((java.lang.Object) (short) -1);
        int int5 = hashMap0.modCount;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        int int8 = hashMap6.size();
        hashMap6.clear();
        java.lang.Object obj11 = hashMap6.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        boolean boolean13 = hashMap12.isEmpty();
        java.lang.Object obj14 = hashMap6.remove((java.lang.Object) hashMap12);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        int int17 = hashMap15.modCount;
        system.testclass.HashMap.Entry[] entryArray18 = hashMap15.table;
        system.testclass.HashMap.Entry[] entryArray19 = hashMap15.table;
        hashMap12.table = entryArray19;
        hashMap0.table = entryArray19;
        int int22 = hashMap0.size();
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        int int24 = hashMap23.modCount;
        int int25 = hashMap23.modCount;
        hashMap23.clear();
        java.lang.Object obj27 = null;
        java.lang.Object obj28 = hashMap23.remove(obj27);
        hashMap23.clear();
        hashMap23.modCount = 0;
        hashMap23.clear();
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        int int34 = hashMap33.modCount;
        int int35 = hashMap33.modCount;
        java.lang.Object obj36 = hashMap23.remove((java.lang.Object) hashMap33);
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        int int38 = hashMap37.modCount;
        int int39 = hashMap37.modCount;
        hashMap37.clear();
        java.lang.Object obj41 = hashMap33.remove((java.lang.Object) hashMap37);
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        int int46 = hashMap45.modCount;
        int int47 = hashMap45.modCount;
        java.lang.Object obj49 = hashMap45.remove((java.lang.Object) 0.0d);
        java.lang.Object obj50 = hashMap44.get(obj49);
        hashMap44.modCount = '#';
        int int53 = hashMap44.modCount;
        system.testclass.HashMap hashMap56 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int57 = hashMap56.size();
        hashMap56.modCount = (short) 1;
        system.testclass.HashMap.Entry[] entryArray60 = hashMap56.table;
        hashMap44.table = entryArray60;
        java.lang.Object obj62 = hashMap0.put((java.lang.Object) hashMap33, (java.lang.Object) entryArray60);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        int int5 = hashMap3.size();
        hashMap3.clear();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        int int9 = hashMap7.modCount;
        hashMap7.clear();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        int int13 = hashMap11.modCount;
        int int14 = hashMap11.size();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        int int17 = hashMap15.modCount;
        system.testclass.HashMap.Entry[] entryArray18 = hashMap15.table;
        boolean boolean19 = hashMap15.isEmpty();
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        int int21 = hashMap20.modCount;
        int int22 = hashMap20.modCount;
        system.testclass.HashMap.Entry[] entryArray23 = hashMap20.table;
        java.lang.Object obj24 = hashMap15.get((java.lang.Object) entryArray23);
        hashMap11.table = entryArray23;
        java.lang.Object obj26 = hashMap7.get((java.lang.Object) entryArray23);
        hashMap3.table = entryArray23;
        java.lang.Object obj28 = hashMap2.get((java.lang.Object) hashMap3);
        boolean boolean29 = hashMap3.isEmpty();
        java.lang.Object obj31 = hashMap3.get((java.lang.Object) 1.0d);
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        int int36 = hashMap35.modCount;
        int int37 = hashMap35.modCount;
        hashMap35.clear();
        java.lang.Object obj39 = null;
        java.lang.Object obj40 = hashMap35.remove(obj39);
        hashMap35.clear();
        hashMap35.modCount = 0;
        hashMap35.clear();
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        int int46 = hashMap45.modCount;
        int int47 = hashMap45.modCount;
        java.lang.Object obj48 = hashMap35.remove((java.lang.Object) hashMap45);
        java.lang.Object obj49 = hashMap34.remove((java.lang.Object) hashMap35);
        java.lang.Object obj50 = null;
        java.lang.Object obj51 = hashMap35.get(obj50);
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap();
        int int53 = hashMap52.modCount;
        int int54 = hashMap52.modCount;
        hashMap52.clear();
        java.lang.Object obj56 = null;
        java.lang.Object obj57 = hashMap52.remove(obj56);
        system.testclass.HashMap hashMap58 = new system.testclass.HashMap();
        int int59 = hashMap58.modCount;
        int int60 = hashMap58.modCount;
        hashMap58.clear();
        java.lang.Object obj62 = null;
        java.lang.Object obj63 = hashMap58.remove(obj62);
        hashMap58.clear();
        hashMap58.modCount = 0;
        system.testclass.HashMap.Entry[] entryArray67 = hashMap58.table;
        hashMap52.table = entryArray67;
        system.testclass.HashMap.Entry[] entryArray69 = hashMap52.table;
        java.lang.Object obj70 = hashMap3.put((java.lang.Object) hashMap35, (java.lang.Object) entryArray69);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap3", hashMap3.repOK_1());
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 10);
        boolean boolean2 = hashMap1.isEmpty();
        java.lang.Object obj4 = hashMap1.get((java.lang.Object) 100L);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        boolean boolean6 = hashMap5.isEmpty();
        int int7 = hashMap5.size();
        java.lang.Object obj9 = hashMap5.get((java.lang.Object) (short) -1);
        boolean boolean10 = hashMap5.isEmpty();
        int int11 = hashMap5.modCount;
        java.lang.Object obj12 = hashMap1.get((java.lang.Object) hashMap5);
        hashMap5.clear();
        int int14 = hashMap5.modCount;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap(0, (float) (short) 100);
        boolean boolean18 = hashMap17.isEmpty();
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        boolean boolean20 = hashMap19.isEmpty();
        int int21 = hashMap19.size();
        java.lang.Object obj22 = hashMap5.put((java.lang.Object) hashMap17, (java.lang.Object) hashMap19);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap5", hashMap5.repOK_1());
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = hashMap0.remove(obj4);
        hashMap0.clear();
        hashMap0.modCount = 0;
        hashMap0.modCount = 10;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        boolean boolean12 = hashMap11.isEmpty();
        int int13 = hashMap11.size();
        hashMap11.clear();
        java.lang.Object obj16 = hashMap11.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        boolean boolean18 = hashMap17.isEmpty();
        java.lang.Object obj19 = hashMap11.remove((java.lang.Object) hashMap17);
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        int int21 = hashMap20.modCount;
        int int22 = hashMap20.modCount;
        system.testclass.HashMap.Entry[] entryArray23 = hashMap20.table;
        system.testclass.HashMap.Entry[] entryArray24 = hashMap20.table;
        hashMap17.table = entryArray24;
        hashMap0.table = entryArray24;
        boolean boolean27 = hashMap0.isEmpty();
        hashMap0.clear();
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap(35, (float) (short) 100);
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap((int) (short) 10);
        boolean boolean34 = hashMap33.isEmpty();
        java.lang.Object obj36 = hashMap33.get((java.lang.Object) 100L);
        int int37 = hashMap33.modCount;
        hashMap33.clear();
        system.testclass.HashMap.Entry[] entryArray39 = hashMap33.table;
        java.lang.Object obj40 = hashMap0.put((java.lang.Object) 35, (java.lang.Object) hashMap33);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        hashMap3.clear();
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = hashMap3.remove(obj7);
        hashMap3.clear();
        hashMap3.modCount = 0;
        hashMap3.clear();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        java.lang.Object obj16 = hashMap3.remove((java.lang.Object) hashMap13);
        java.lang.Object obj17 = hashMap2.remove((java.lang.Object) hashMap3);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        int int20 = hashMap19.modCount;
        int int21 = hashMap19.modCount;
        hashMap19.clear();
        java.lang.Object obj23 = null;
        java.lang.Object obj24 = hashMap19.remove(obj23);
        hashMap19.clear();
        hashMap19.modCount = 0;
        hashMap19.clear();
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        int int30 = hashMap29.modCount;
        int int31 = hashMap29.modCount;
        java.lang.Object obj32 = hashMap19.remove((java.lang.Object) hashMap29);
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        int int34 = hashMap33.modCount;
        int int35 = hashMap33.modCount;
        hashMap33.clear();
        java.lang.Object obj37 = hashMap29.remove((java.lang.Object) hashMap33);
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        hashMap38.modCount = 0;
        java.lang.Object obj41 = hashMap33.remove((java.lang.Object) 0);
        java.lang.Object obj42 = hashMap2.put((java.lang.Object) true, obj41);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 10);
        boolean boolean2 = hashMap1.isEmpty();
        java.lang.Object obj4 = hashMap1.get((java.lang.Object) 100L);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        hashMap5.clear();
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = hashMap5.remove(obj9);
        java.lang.Object obj11 = hashMap1.get(obj10);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap((int) '#', (float) 'a');
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap((int) '4', (float) (byte) 10);
        java.lang.Object obj18 = hashMap14.get((java.lang.Object) '4');
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap((int) (short) 0, (float) (byte) 100);
        java.lang.Object obj22 = hashMap14.get((java.lang.Object) (short) 0);
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        int int24 = hashMap23.modCount;
        int int25 = hashMap23.modCount;
        system.testclass.HashMap.Entry[] entryArray26 = hashMap23.table;
        boolean boolean27 = hashMap23.isEmpty();
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        int int29 = hashMap28.modCount;
        int int30 = hashMap28.modCount;
        system.testclass.HashMap.Entry[] entryArray31 = hashMap28.table;
        java.lang.Object obj32 = hashMap23.get((java.lang.Object) entryArray31);
        hashMap23.clear();
        java.lang.Object obj34 = hashMap1.put((java.lang.Object) (short) 0, (java.lang.Object) hashMap23);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 0, (float) (byte) 100);
        int int3 = hashMap2.size();
        system.testclass.HashMap.Entry[] entryArray4 = hashMap2.table;
        boolean boolean5 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap(0, 100.0f);
        hashMap8.modCount = (byte) 10;
        java.lang.Object obj11 = hashMap2.remove((java.lang.Object) (byte) 10);
        hashMap2.modCount = 0;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        boolean boolean15 = hashMap14.isEmpty();
        int int16 = hashMap14.size();
        hashMap14.clear();
        java.lang.Object obj19 = hashMap2.put((java.lang.Object) hashMap14, (java.lang.Object) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, 100.0f);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) (short) 0, (float) (byte) 100);
        int int8 = hashMap7.size();
        system.testclass.HashMap.Entry[] entryArray9 = hashMap7.table;
        java.lang.Class<?> wildcardClass10 = entryArray9.getClass();
        java.lang.Object obj11 = hashMap2.put((java.lang.Object) int4, (java.lang.Object) wildcardClass10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.modCount;
        int int8 = hashMap6.modCount;
        java.lang.Object obj10 = hashMap6.remove((java.lang.Object) 0.0d);
        java.lang.Object obj11 = hashMap5.get(obj10);
        hashMap5.modCount = '#';
        int int14 = hashMap5.modCount;
        boolean boolean15 = hashMap5.isEmpty();
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        int int17 = hashMap16.modCount;
        int int18 = hashMap16.modCount;
        hashMap16.clear();
        hashMap16.clear();
        boolean boolean21 = hashMap16.isEmpty();
        hashMap16.clear();
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        int int24 = hashMap23.modCount;
        int int25 = hashMap23.modCount;
        hashMap23.clear();
        java.lang.Object obj28 = hashMap23.remove((java.lang.Object) (short) -1);
        java.lang.Object obj29 = hashMap16.remove((java.lang.Object) hashMap23);
        java.lang.Object obj30 = hashMap0.put((java.lang.Object) hashMap5, obj29);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap(0, (float) 10L);
        hashMap4.modCount = (byte) 100;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap((int) (short) 10);
        boolean boolean9 = hashMap8.isEmpty();
        java.lang.Object obj11 = hashMap8.get((java.lang.Object) 100L);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        int int13 = hashMap12.modCount;
        int int14 = hashMap12.modCount;
        hashMap12.clear();
        java.lang.Object obj16 = null;
        java.lang.Object obj17 = hashMap12.remove(obj16);
        java.lang.Object obj18 = hashMap8.get(obj17);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        int int20 = hashMap19.modCount;
        int int21 = hashMap19.modCount;
        int int22 = hashMap19.size();
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        int int24 = hashMap23.modCount;
        int int25 = hashMap23.modCount;
        system.testclass.HashMap.Entry[] entryArray26 = hashMap23.table;
        boolean boolean27 = hashMap23.isEmpty();
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        int int29 = hashMap28.modCount;
        int int30 = hashMap28.modCount;
        system.testclass.HashMap.Entry[] entryArray31 = hashMap28.table;
        java.lang.Object obj32 = hashMap23.get((java.lang.Object) entryArray31);
        hashMap19.table = entryArray31;
        hashMap8.table = entryArray31;
        java.lang.Object obj35 = hashMap0.put((java.lang.Object) (byte) 100, (java.lang.Object) entryArray31);
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
        int int3 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray4 = hashMap0.table;
        int int5 = hashMap0.size();
        int int6 = hashMap0.size();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap(2);
        int int9 = hashMap8.size();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        int int12 = hashMap10.size();
        hashMap10.clear();
        java.lang.Object obj15 = hashMap10.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        boolean boolean17 = hashMap16.isEmpty();
        java.lang.Object obj18 = hashMap10.remove((java.lang.Object) hashMap16);
        int int19 = hashMap16.size();
        java.lang.Object obj20 = hashMap0.put((java.lang.Object) hashMap8, (java.lang.Object) int19);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        boolean boolean3 = hashMap2.isEmpty();
        int int4 = hashMap2.size();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap(0, 100.0f);
        int int8 = hashMap7.size();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) (short) 10);
        boolean boolean11 = hashMap10.isEmpty();
        java.lang.Object obj13 = hashMap10.get((java.lang.Object) 100L);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        boolean boolean15 = hashMap14.isEmpty();
        int int16 = hashMap14.size();
        java.lang.Object obj18 = hashMap14.get((java.lang.Object) (short) -1);
        boolean boolean19 = hashMap14.isEmpty();
        int int20 = hashMap14.modCount;
        java.lang.Object obj21 = hashMap10.get((java.lang.Object) hashMap14);
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        int int26 = hashMap25.modCount;
        int int27 = hashMap25.modCount;
        hashMap25.clear();
        java.lang.Object obj29 = null;
        java.lang.Object obj30 = hashMap25.remove(obj29);
        java.lang.Object obj31 = hashMap24.remove((java.lang.Object) hashMap25);
        java.lang.Object obj33 = hashMap25.get((java.lang.Object) (short) 10);
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        int int35 = hashMap34.modCount;
        int int36 = hashMap34.modCount;
        int int37 = hashMap34.modCount;
        system.testclass.HashMap.Entry[] entryArray38 = hashMap34.table;
        java.lang.Object obj39 = hashMap25.remove((java.lang.Object) hashMap34);
        hashMap25.modCount = (short) 1;
        java.lang.Object obj42 = hashMap10.get((java.lang.Object) hashMap25);
        system.testclass.HashMap.Entry[] entryArray43 = hashMap25.table;
        hashMap7.table = entryArray43;
        hashMap2.table = entryArray43;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int3 = hashMap2.size();
        hashMap2.modCount = (short) 1;
        boolean boolean6 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        int int9 = hashMap7.modCount;
        system.testclass.HashMap.Entry[] entryArray10 = hashMap7.table;
        boolean boolean11 = hashMap7.isEmpty();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        int int13 = hashMap12.modCount;
        int int14 = hashMap12.modCount;
        hashMap12.clear();
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        int int17 = hashMap16.modCount;
        int int18 = hashMap16.modCount;
        int int19 = hashMap16.size();
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        int int21 = hashMap20.modCount;
        int int22 = hashMap20.modCount;
        system.testclass.HashMap.Entry[] entryArray23 = hashMap20.table;
        boolean boolean24 = hashMap20.isEmpty();
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        int int26 = hashMap25.modCount;
        int int27 = hashMap25.modCount;
        system.testclass.HashMap.Entry[] entryArray28 = hashMap25.table;
        java.lang.Object obj29 = hashMap20.get((java.lang.Object) entryArray28);
        hashMap16.table = entryArray28;
        java.lang.Object obj31 = hashMap12.get((java.lang.Object) entryArray28);
        java.lang.Object obj32 = hashMap7.remove((java.lang.Object) entryArray28);
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap((int) '#', (float) 'a');
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap((int) '4', (float) (byte) 10);
        java.lang.Object obj39 = hashMap35.get((java.lang.Object) '4');
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap((int) (short) 0, (float) (byte) 100);
        java.lang.Object obj43 = hashMap35.get((java.lang.Object) (short) 0);
        boolean boolean44 = hashMap35.isEmpty();
        system.testclass.HashMap hashMap46 = new system.testclass.HashMap((int) (short) 10);
        int int47 = hashMap46.modCount;
        int int48 = hashMap46.size();
        java.lang.Object obj49 = hashMap35.remove((java.lang.Object) int48);
        java.lang.Object obj50 = hashMap2.put(obj32, obj49);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) (byte) 10);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        hashMap3.clear();
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = hashMap3.remove(obj7);
        hashMap3.clear();
        hashMap3.modCount = 0;
        hashMap3.clear();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        java.lang.Object obj16 = hashMap3.remove((java.lang.Object) hashMap13);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        int int18 = hashMap17.modCount;
        int int19 = hashMap17.modCount;
        hashMap17.clear();
        java.lang.Object obj21 = hashMap13.remove((java.lang.Object) hashMap17);
        system.testclass.HashMap.Entry[] entryArray22 = hashMap13.table;
        hashMap2.table = entryArray22;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) '4');
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap((int) (byte) 1, (float) (short) 10);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        java.lang.Object obj9 = hashMap5.remove((java.lang.Object) 0.0d);
        java.lang.Object obj10 = hashMap1.put((java.lang.Object) (short) 10, (java.lang.Object) hashMap5);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 100, (float) '4');
        boolean boolean3 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) (short) 10);
        boolean boolean7 = hashMap6.isEmpty();
        java.lang.Object obj9 = hashMap6.get((java.lang.Object) 100L);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        int int12 = hashMap10.size();
        java.lang.Object obj14 = hashMap10.get((java.lang.Object) (short) -1);
        boolean boolean15 = hashMap10.isEmpty();
        int int16 = hashMap10.modCount;
        java.lang.Object obj17 = hashMap6.get((java.lang.Object) hashMap10);
        hashMap10.clear();
        int int19 = hashMap10.modCount;
        boolean boolean20 = hashMap10.isEmpty();
        java.lang.Object obj21 = hashMap2.put((java.lang.Object) 10, (java.lang.Object) boolean20);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) ' ', (float) '#');
        int int3 = hashMap2.size();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) (short) 10);
        boolean boolean6 = hashMap5.isEmpty();
        java.lang.Object obj8 = hashMap5.get((java.lang.Object) 100L);
        system.testclass.HashMap.Entry[] entryArray9 = hashMap5.table;
        hashMap2.table = entryArray9;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int3 = hashMap2.size();
        hashMap2.modCount = (short) 1;
        system.testclass.HashMap.Entry[] entryArray6 = hashMap2.table;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        hashMap13.clear();
        java.lang.Object obj17 = null;
        java.lang.Object obj18 = hashMap13.remove(obj17);
        java.lang.Object obj19 = hashMap12.remove((java.lang.Object) hashMap13);
        java.lang.Object obj21 = hashMap13.get((java.lang.Object) (short) 10);
        java.lang.Object obj22 = hashMap9.get((java.lang.Object) (short) 10);
        java.lang.Object obj23 = hashMap2.remove(obj22);
        int int24 = hashMap2.modCount;
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        boolean boolean26 = hashMap25.isEmpty();
        int int27 = hashMap25.size();
        hashMap25.clear();
        java.lang.Object obj30 = hashMap25.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        boolean boolean32 = hashMap31.isEmpty();
        java.lang.Object obj33 = hashMap25.remove((java.lang.Object) hashMap31);
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        int int35 = hashMap34.modCount;
        int int36 = hashMap34.modCount;
        system.testclass.HashMap.Entry[] entryArray37 = hashMap34.table;
        system.testclass.HashMap.Entry[] entryArray38 = hashMap34.table;
        hashMap31.table = entryArray38;
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        int int41 = hashMap40.modCount;
        int int42 = hashMap40.modCount;
        system.testclass.HashMap.Entry[] entryArray43 = hashMap40.table;
        system.testclass.HashMap hashMap46 = new system.testclass.HashMap((int) ' ', (float) '#');
        java.lang.Object obj47 = hashMap40.remove((java.lang.Object) ' ');
        int int48 = hashMap40.size();
        java.lang.Object obj49 = hashMap2.put((java.lang.Object) entryArray38, (java.lang.Object) hashMap40);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '#', (float) '4');
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        int int7 = hashMap4.size();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.modCount;
        int int10 = hashMap8.modCount;
        system.testclass.HashMap.Entry[] entryArray11 = hashMap8.table;
        boolean boolean12 = hashMap8.isEmpty();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        system.testclass.HashMap.Entry[] entryArray16 = hashMap13.table;
        java.lang.Object obj17 = hashMap8.get((java.lang.Object) entryArray16);
        hashMap4.table = entryArray16;
        hashMap3.table = entryArray16;
        hashMap2.table = entryArray16;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        java.lang.Object obj5 = hashMap0.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        int int11 = hashMap9.modCount;
        hashMap9.clear();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = hashMap9.remove(obj13);
        hashMap9.clear();
        int int16 = hashMap9.size();
        java.lang.Object obj17 = hashMap6.get((java.lang.Object) int16);
        hashMap6.modCount = (byte) -1;
        hashMap6.clear();
        hashMap6.modCount = 10;
        hashMap6.clear();
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap((int) '#', (float) 'a');
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap((int) '4', (float) (byte) 10);
        java.lang.Object obj30 = hashMap26.get((java.lang.Object) '4');
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap((int) (short) 0, (float) (byte) 100);
        java.lang.Object obj34 = hashMap26.get((java.lang.Object) (short) 0);
        java.lang.Object obj35 = hashMap6.remove((java.lang.Object) (short) 0);
        java.lang.Object obj38 = hashMap6.put((java.lang.Object) 2, (java.lang.Object) true);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap6", hashMap6.repOK_1());
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        hashMap0.clear();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap(10, (float) ' ');
        boolean boolean6 = hashMap5.isEmpty();
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) hashMap5);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        hashMap10.clear();
        system.testclass.HashMap.Entry[] entryArray12 = hashMap10.table;
        hashMap5.table = entryArray12;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap5", hashMap5.repOK_1());
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 10, (float) 1);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap((int) (short) 10);
        boolean boolean5 = hashMap4.isEmpty();
        java.lang.Object obj7 = hashMap4.get((java.lang.Object) 100L);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.modCount;
        int int10 = hashMap8.modCount;
        hashMap8.clear();
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = hashMap8.remove(obj12);
        java.lang.Object obj14 = hashMap4.get(obj13);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        int int17 = hashMap15.modCount;
        int int18 = hashMap15.size();
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        int int20 = hashMap19.modCount;
        int int21 = hashMap19.modCount;
        system.testclass.HashMap.Entry[] entryArray22 = hashMap19.table;
        boolean boolean23 = hashMap19.isEmpty();
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.modCount;
        int int26 = hashMap24.modCount;
        system.testclass.HashMap.Entry[] entryArray27 = hashMap24.table;
        java.lang.Object obj28 = hashMap19.get((java.lang.Object) entryArray27);
        hashMap15.table = entryArray27;
        hashMap4.table = entryArray27;
        java.lang.Object obj31 = hashMap2.remove((java.lang.Object) entryArray27);
        int int32 = hashMap2.modCount;
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int36 = hashMap35.size();
        hashMap35.modCount = (short) 1;
        int int39 = hashMap35.size();
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        int int41 = hashMap40.modCount;
        int int42 = hashMap40.modCount;
        system.testclass.HashMap.Entry[] entryArray43 = hashMap40.table;
        boolean boolean44 = hashMap40.isEmpty();
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        int int46 = hashMap45.modCount;
        int int47 = hashMap45.modCount;
        hashMap45.clear();
        system.testclass.HashMap hashMap49 = new system.testclass.HashMap();
        int int50 = hashMap49.modCount;
        int int51 = hashMap49.modCount;
        int int52 = hashMap49.size();
        system.testclass.HashMap hashMap53 = new system.testclass.HashMap();
        int int54 = hashMap53.modCount;
        int int55 = hashMap53.modCount;
        system.testclass.HashMap.Entry[] entryArray56 = hashMap53.table;
        boolean boolean57 = hashMap53.isEmpty();
        system.testclass.HashMap hashMap58 = new system.testclass.HashMap();
        int int59 = hashMap58.modCount;
        int int60 = hashMap58.modCount;
        system.testclass.HashMap.Entry[] entryArray61 = hashMap58.table;
        java.lang.Object obj62 = hashMap53.get((java.lang.Object) entryArray61);
        hashMap49.table = entryArray61;
        java.lang.Object obj64 = hashMap45.get((java.lang.Object) entryArray61);
        java.lang.Object obj65 = hashMap40.remove((java.lang.Object) entryArray61);
        system.testclass.HashMap hashMap66 = new system.testclass.HashMap();
        int int67 = hashMap66.modCount;
        int int68 = hashMap66.modCount;
        int int69 = hashMap66.modCount;
        system.testclass.HashMap.Entry[] entryArray70 = hashMap66.table;
        hashMap40.table = entryArray70;
        system.testclass.HashMap hashMap72 = new system.testclass.HashMap();
        boolean boolean73 = hashMap72.isEmpty();
        int int74 = hashMap72.size();
        java.lang.Object obj76 = hashMap72.get((java.lang.Object) (short) -1);
        int int77 = hashMap72.modCount;
        system.testclass.HashMap hashMap78 = new system.testclass.HashMap();
        boolean boolean79 = hashMap78.isEmpty();
        int int80 = hashMap78.size();
        hashMap78.clear();
        java.lang.Object obj83 = hashMap78.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap84 = new system.testclass.HashMap();
        boolean boolean85 = hashMap84.isEmpty();
        java.lang.Object obj86 = hashMap78.remove((java.lang.Object) hashMap84);
        system.testclass.HashMap hashMap87 = new system.testclass.HashMap();
        int int88 = hashMap87.modCount;
        int int89 = hashMap87.modCount;
        system.testclass.HashMap.Entry[] entryArray90 = hashMap87.table;
        system.testclass.HashMap.Entry[] entryArray91 = hashMap87.table;
        hashMap84.table = entryArray91;
        hashMap72.table = entryArray91;
        hashMap40.table = entryArray91;
        java.lang.Object obj95 = hashMap2.put((java.lang.Object) int39, (java.lang.Object) hashMap40);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '#', (float) 'a');
        int int3 = hashMap2.size();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        int int6 = hashMap4.size();
        hashMap4.clear();
        java.lang.Object obj9 = hashMap4.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        java.lang.Object obj12 = hashMap4.remove((java.lang.Object) hashMap10);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        boolean boolean14 = hashMap13.isEmpty();
        java.lang.Object obj15 = hashMap10.get((java.lang.Object) hashMap13);
        int int16 = hashMap10.size();
        system.testclass.HashMap.Entry[] entryArray17 = hashMap10.table;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        int int19 = hashMap18.modCount;
        int int20 = hashMap18.modCount;
        int int21 = hashMap18.size();
        hashMap18.modCount = (-1);
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        boolean boolean25 = hashMap24.isEmpty();
        int int26 = hashMap24.size();
        hashMap24.clear();
        int int28 = hashMap24.size();
        java.lang.Class<?> wildcardClass29 = hashMap24.getClass();
        java.lang.Object obj30 = hashMap18.get((java.lang.Object) hashMap24);
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap(97);
        java.lang.Object obj33 = hashMap18.get((java.lang.Object) 97);
        java.lang.Object obj34 = hashMap2.put((java.lang.Object) hashMap10, (java.lang.Object) 97);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        java.lang.Object obj5 = hashMap0.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        int int11 = hashMap9.modCount;
        system.testclass.HashMap.Entry[] entryArray12 = hashMap9.table;
        system.testclass.HashMap.Entry[] entryArray13 = hashMap9.table;
        hashMap6.table = entryArray13;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap((int) (short) 10);
        boolean boolean17 = hashMap16.isEmpty();
        java.lang.Object obj18 = hashMap6.remove((java.lang.Object) boolean17);
        hashMap6.clear();
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap((int) (short) 10);
        boolean boolean22 = hashMap21.isEmpty();
        java.lang.Object obj24 = hashMap21.get((java.lang.Object) 100L);
        int int25 = hashMap21.modCount;
        hashMap21.clear();
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        boolean boolean28 = hashMap27.isEmpty();
        int int29 = hashMap27.size();
        hashMap27.clear();
        java.lang.Object obj32 = hashMap27.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        boolean boolean34 = hashMap33.isEmpty();
        java.lang.Object obj35 = hashMap27.remove((java.lang.Object) hashMap33);
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        int int37 = hashMap36.modCount;
        int int38 = hashMap36.modCount;
        system.testclass.HashMap.Entry[] entryArray39 = hashMap36.table;
        system.testclass.HashMap.Entry[] entryArray40 = hashMap36.table;
        hashMap33.table = entryArray40;
        java.lang.Object obj42 = hashMap6.put((java.lang.Object) hashMap21, (java.lang.Object) hashMap33);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap6", hashMap6.repOK_1());
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 1, (float) (short) 10);
        int int3 = hashMap2.modCount;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) (short) 10);
        boolean boolean6 = hashMap5.isEmpty();
        java.lang.Object obj8 = hashMap5.get((java.lang.Object) 100L);
        java.lang.Object obj10 = hashMap5.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = hashMap2.put((java.lang.Object) hashMap5, obj11);
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
        hashMap0.clear();
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = hashMap0.remove(obj4);
        hashMap0.clear();
        hashMap0.modCount = 0;
        system.testclass.HashMap.Entry[] entryArray9 = hashMap0.table;
        hashMap0.clear();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        hashMap11.clear();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        hashMap13.modCount = 0;
        int int16 = hashMap13.modCount;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        int int18 = hashMap17.modCount;
        int int19 = hashMap17.modCount;
        system.testclass.HashMap.Entry[] entryArray20 = hashMap17.table;
        hashMap13.table = entryArray20;
        java.lang.Object obj22 = hashMap11.get((java.lang.Object) hashMap13);
        java.lang.Object obj23 = hashMap0.remove((java.lang.Object) hashMap11);
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        boolean boolean25 = hashMap24.isEmpty();
        int int26 = hashMap24.size();
        java.lang.Object obj28 = hashMap24.get((java.lang.Object) (short) -1);
        hashMap24.modCount = (-1);
        hashMap24.clear();
        system.testclass.HashMap.Entry[] entryArray32 = hashMap24.table;
        java.lang.Object obj33 = null;
        java.lang.Object obj34 = hashMap11.put((java.lang.Object) hashMap24, obj33);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap11", hashMap11.repOK_1());
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = hashMap0.remove(obj4);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.modCount;
        int int8 = hashMap6.modCount;
        hashMap6.clear();
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = hashMap6.remove(obj10);
        hashMap6.clear();
        hashMap6.modCount = 0;
        system.testclass.HashMap.Entry[] entryArray15 = hashMap6.table;
        hashMap0.table = entryArray15;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        boolean boolean21 = hashMap20.isEmpty();
        int int22 = hashMap20.size();
        hashMap20.clear();
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.modCount;
        int int26 = hashMap24.modCount;
        hashMap24.clear();
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        int int29 = hashMap28.modCount;
        int int30 = hashMap28.modCount;
        int int31 = hashMap28.size();
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        int int33 = hashMap32.modCount;
        int int34 = hashMap32.modCount;
        system.testclass.HashMap.Entry[] entryArray35 = hashMap32.table;
        boolean boolean36 = hashMap32.isEmpty();
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        int int38 = hashMap37.modCount;
        int int39 = hashMap37.modCount;
        system.testclass.HashMap.Entry[] entryArray40 = hashMap37.table;
        java.lang.Object obj41 = hashMap32.get((java.lang.Object) entryArray40);
        hashMap28.table = entryArray40;
        java.lang.Object obj43 = hashMap24.get((java.lang.Object) entryArray40);
        hashMap20.table = entryArray40;
        java.lang.Object obj45 = hashMap19.get((java.lang.Object) hashMap20);
        boolean boolean46 = hashMap20.isEmpty();
        java.lang.Object obj48 = hashMap20.get((java.lang.Object) 1.0d);
        system.testclass.HashMap hashMap50 = new system.testclass.HashMap((int) (short) 10);
        boolean boolean51 = hashMap50.isEmpty();
        java.lang.Object obj53 = hashMap50.get((java.lang.Object) 100L);
        int int54 = hashMap50.modCount;
        hashMap50.clear();
        system.testclass.HashMap.Entry[] entryArray56 = hashMap50.table;
        java.lang.Object obj57 = hashMap0.put(obj48, (java.lang.Object) entryArray56);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        hashMap0.clear();
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) 'a');
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) (short) 10);
        boolean boolean8 = hashMap7.isEmpty();
        java.lang.Object obj10 = hashMap7.get((java.lang.Object) 100L);
        java.lang.Object obj12 = hashMap7.remove((java.lang.Object) (byte) -1);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        hashMap13.clear();
        java.lang.Object obj17 = null;
        java.lang.Object obj18 = hashMap13.remove(obj17);
        hashMap13.clear();
        hashMap13.modCount = 0;
        system.testclass.HashMap.Entry[] entryArray22 = hashMap13.table;
        int int23 = hashMap13.size();
        system.testclass.HashMap.Entry[] entryArray24 = hashMap13.table;
        java.lang.Object obj25 = hashMap0.put(obj12, (java.lang.Object) entryArray24);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        int int3 = hashMap0.size();
        hashMap0.modCount = (-1);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap(0, (float) (short) 10);
        system.testclass.HashMap.Entry[] entryArray9 = hashMap8.table;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.modCount;
        int int12 = hashMap10.modCount;
        hashMap10.clear();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.modCount;
        int int16 = hashMap14.modCount;
        int int17 = hashMap14.size();
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        int int19 = hashMap18.modCount;
        int int20 = hashMap18.modCount;
        system.testclass.HashMap.Entry[] entryArray21 = hashMap18.table;
        boolean boolean22 = hashMap18.isEmpty();
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        int int24 = hashMap23.modCount;
        int int25 = hashMap23.modCount;
        system.testclass.HashMap.Entry[] entryArray26 = hashMap23.table;
        java.lang.Object obj27 = hashMap18.get((java.lang.Object) entryArray26);
        hashMap14.table = entryArray26;
        java.lang.Object obj29 = hashMap10.get((java.lang.Object) entryArray26);
        java.lang.Object obj30 = hashMap0.put((java.lang.Object) hashMap8, obj29);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        int int3 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray4 = hashMap0.table;
        int int5 = hashMap0.modCount;
        hashMap0.modCount = (short) 0;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.modCount;
        int int10 = hashMap8.modCount;
        hashMap8.clear();
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = hashMap8.remove(obj12);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.modCount;
        int int16 = hashMap14.modCount;
        hashMap14.clear();
        java.lang.Object obj18 = null;
        java.lang.Object obj19 = hashMap14.remove(obj18);
        hashMap14.clear();
        hashMap14.modCount = 0;
        system.testclass.HashMap.Entry[] entryArray23 = hashMap14.table;
        hashMap8.table = entryArray23;
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        int int26 = hashMap25.modCount;
        int int27 = hashMap25.modCount;
        int int28 = hashMap25.size();
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        int int30 = hashMap29.modCount;
        int int31 = hashMap29.modCount;
        system.testclass.HashMap.Entry[] entryArray32 = hashMap29.table;
        boolean boolean33 = hashMap29.isEmpty();
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        int int35 = hashMap34.modCount;
        int int36 = hashMap34.modCount;
        system.testclass.HashMap.Entry[] entryArray37 = hashMap34.table;
        java.lang.Object obj38 = hashMap29.get((java.lang.Object) entryArray37);
        hashMap25.table = entryArray37;
        java.lang.Object obj40 = hashMap0.put((java.lang.Object) entryArray23, (java.lang.Object) hashMap25);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        int int3 = hashMap0.size();
        hashMap0.modCount = 10;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        hashMap7.clear();
        boolean boolean10 = hashMap7.isEmpty();
        java.lang.Object obj11 = hashMap0.put((java.lang.Object) 10.0d, (java.lang.Object) hashMap7);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 10, (float) 1);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        hashMap3.clear();
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = hashMap3.remove(obj7);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        int int13 = hashMap12.modCount;
        int int14 = hashMap12.modCount;
        java.lang.Object obj16 = hashMap12.remove((java.lang.Object) 0.0d);
        java.lang.Object obj17 = hashMap11.get(obj16);
        hashMap11.modCount = '#';
        int int20 = hashMap11.modCount;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int24 = hashMap23.size();
        hashMap23.modCount = (short) 1;
        system.testclass.HashMap.Entry[] entryArray27 = hashMap23.table;
        hashMap11.table = entryArray27;
        java.lang.Object obj29 = hashMap3.remove((java.lang.Object) entryArray27);
        hashMap2.table = entryArray27;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        hashMap0.clear();
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) 'a');
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        int int13 = hashMap12.modCount;
        int int14 = hashMap12.modCount;
        hashMap12.clear();
        java.lang.Object obj16 = null;
        java.lang.Object obj17 = hashMap12.remove(obj16);
        java.lang.Object obj18 = hashMap11.remove((java.lang.Object) hashMap12);
        java.lang.Object obj20 = hashMap12.get((java.lang.Object) (short) 10);
        java.lang.Object obj21 = hashMap8.get((java.lang.Object) (short) 10);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        boolean boolean23 = hashMap22.isEmpty();
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.modCount;
        int int26 = hashMap24.modCount;
        hashMap24.clear();
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        int int29 = hashMap28.modCount;
        int int30 = hashMap28.modCount;
        int int31 = hashMap28.size();
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        int int33 = hashMap32.modCount;
        int int34 = hashMap32.modCount;
        system.testclass.HashMap.Entry[] entryArray35 = hashMap32.table;
        boolean boolean36 = hashMap32.isEmpty();
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        int int38 = hashMap37.modCount;
        int int39 = hashMap37.modCount;
        system.testclass.HashMap.Entry[] entryArray40 = hashMap37.table;
        java.lang.Object obj41 = hashMap32.get((java.lang.Object) entryArray40);
        hashMap28.table = entryArray40;
        java.lang.Object obj43 = hashMap24.get((java.lang.Object) entryArray40);
        hashMap22.table = entryArray40;
        java.lang.Object obj45 = hashMap8.remove((java.lang.Object) entryArray40);
        java.lang.Object obj46 = null;
        java.lang.Object obj47 = hashMap0.put((java.lang.Object) hashMap8, obj46);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 10);
        boolean boolean2 = hashMap1.isEmpty();
        java.lang.Object obj4 = hashMap1.get((java.lang.Object) 100L);
        boolean boolean5 = hashMap1.isEmpty();
        java.lang.Object obj6 = null;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        int int9 = hashMap7.modCount;
        hashMap7.clear();
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = hashMap7.remove(obj11);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        hashMap13.clear();
        java.lang.Object obj17 = null;
        java.lang.Object obj18 = hashMap13.remove(obj17);
        hashMap13.clear();
        hashMap13.modCount = 0;
        system.testclass.HashMap.Entry[] entryArray22 = hashMap13.table;
        hashMap7.table = entryArray22;
        boolean boolean24 = hashMap7.isEmpty();
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        hashMap25.clear();
        java.lang.Object obj27 = hashMap7.remove((java.lang.Object) hashMap25);
        java.lang.Object obj28 = hashMap1.put(obj6, (java.lang.Object) hashMap7);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        int int3 = hashMap2.modCount;
        int int4 = hashMap2.modCount;
        hashMap2.clear();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.modCount;
        int int8 = hashMap6.modCount;
        int int9 = hashMap6.size();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.modCount;
        int int12 = hashMap10.modCount;
        system.testclass.HashMap.Entry[] entryArray13 = hashMap10.table;
        boolean boolean14 = hashMap10.isEmpty();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        int int17 = hashMap15.modCount;
        system.testclass.HashMap.Entry[] entryArray18 = hashMap15.table;
        java.lang.Object obj19 = hashMap10.get((java.lang.Object) entryArray18);
        hashMap6.table = entryArray18;
        java.lang.Object obj21 = hashMap2.get((java.lang.Object) entryArray18);
        hashMap0.table = entryArray18;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        int int24 = hashMap23.modCount;
        int int25 = hashMap23.modCount;
        hashMap23.clear();
        hashMap23.clear();
        boolean boolean28 = hashMap23.isEmpty();
        java.lang.Object obj29 = hashMap0.remove((java.lang.Object) boolean28);
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap(0, 100.0f);
        hashMap32.modCount = (byte) 10;
        java.lang.Object obj35 = hashMap0.remove((java.lang.Object) (byte) 10);
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap((int) '4', (float) 10L);
        boolean boolean39 = hashMap38.isEmpty();
        int int40 = hashMap38.size();
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        int int42 = hashMap41.modCount;
        int int43 = hashMap41.modCount;
        hashMap41.clear();
        java.lang.Object obj46 = hashMap41.remove((java.lang.Object) (short) -1);
        hashMap41.modCount = (byte) 10;
        hashMap41.modCount = (byte) 0;
        java.lang.Object obj51 = hashMap38.remove((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap();
        boolean boolean53 = hashMap52.isEmpty();
        int int54 = hashMap52.size();
        hashMap52.clear();
        int int56 = hashMap52.modCount;
        java.lang.Object obj57 = hashMap0.put(obj51, (java.lang.Object) hashMap52);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(2, 10.0f);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap((int) (short) 10);
        boolean boolean5 = hashMap4.isEmpty();
        java.lang.Object obj7 = hashMap4.get((java.lang.Object) 100L);
        int int8 = hashMap4.modCount;
        hashMap4.clear();
        system.testclass.HashMap.Entry[] entryArray10 = hashMap4.table;
        java.lang.Object obj11 = hashMap2.get((java.lang.Object) hashMap4);
        system.testclass.HashMap.Entry[] entryArray12 = hashMap2.table;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap((int) (byte) 10, (float) 100L);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap(0, 100.0f);
        int int19 = hashMap18.size();
        java.lang.Object obj20 = hashMap2.put((java.lang.Object) 100L, (java.lang.Object) int19);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        java.lang.Object obj5 = hashMap0.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        int int11 = hashMap9.modCount;
        hashMap9.clear();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = hashMap9.remove(obj13);
        hashMap9.clear();
        int int16 = hashMap9.size();
        java.lang.Object obj17 = hashMap6.get((java.lang.Object) int16);
        hashMap6.modCount = (byte) -1;
        hashMap6.clear();
        int int21 = hashMap6.size();
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        int int23 = hashMap22.modCount;
        int int24 = hashMap22.modCount;
        system.testclass.HashMap.Entry[] entryArray25 = hashMap22.table;
        hashMap6.table = entryArray25;
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        int int28 = hashMap27.modCount;
        int int29 = hashMap27.modCount;
        hashMap27.clear();
        java.lang.Object obj31 = null;
        java.lang.Object obj32 = hashMap27.remove(obj31);
        hashMap27.clear();
        int int34 = hashMap27.size();
        int int35 = hashMap27.modCount;
        boolean boolean36 = hashMap27.isEmpty();
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap(0, (float) 10L);
        hashMap39.modCount = (byte) 100;
        java.lang.Object obj42 = hashMap6.put((java.lang.Object) hashMap27, (java.lang.Object) hashMap39);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap6", hashMap6.repOK_1());
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(10, (float) ' ');
        boolean boolean3 = hashMap2.isEmpty();
        int int4 = hashMap2.modCount;
        int int5 = hashMap2.modCount;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.modCount;
        int int8 = hashMap6.modCount;
        system.testclass.HashMap.Entry[] entryArray9 = hashMap6.table;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap((int) ' ', (float) '#');
        java.lang.Object obj13 = hashMap6.remove((java.lang.Object) ' ');
        int int14 = hashMap6.size();
        int int15 = hashMap6.size();
        system.testclass.HashMap.Entry[] entryArray16 = hashMap6.table;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap(0, (float) (short) 10);
        system.testclass.HashMap.Entry[] entryArray20 = hashMap19.table;
        java.lang.Object obj21 = hashMap6.remove((java.lang.Object) entryArray20);
        hashMap2.table = entryArray20;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        java.lang.Object obj5 = hashMap0.get((java.lang.Object) 100);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        int int8 = hashMap6.size();
        hashMap6.clear();
        java.lang.Object obj11 = hashMap6.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        boolean boolean13 = hashMap12.isEmpty();
        java.lang.Object obj14 = hashMap6.remove((java.lang.Object) hashMap12);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        boolean boolean16 = hashMap15.isEmpty();
        java.lang.Object obj17 = hashMap12.get((java.lang.Object) hashMap15);
        hashMap15.modCount = 2;
        java.lang.Object obj20 = hashMap0.remove((java.lang.Object) hashMap15);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap(100);
        java.lang.Class<?> wildcardClass23 = hashMap22.getClass();
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap((int) ' ', (float) '#');
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap((int) (short) 10);
        int int29 = hashMap28.modCount;
        hashMap28.clear();
        java.lang.Object obj31 = hashMap26.get((java.lang.Object) hashMap28);
        java.lang.Object obj32 = hashMap0.put((java.lang.Object) hashMap22, (java.lang.Object) hashMap26);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 100L);
        int int3 = hashMap2.modCount;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        int int7 = hashMap4.size();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.modCount;
        int int10 = hashMap8.modCount;
        system.testclass.HashMap.Entry[] entryArray11 = hashMap8.table;
        boolean boolean12 = hashMap8.isEmpty();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        system.testclass.HashMap.Entry[] entryArray16 = hashMap13.table;
        java.lang.Object obj17 = hashMap8.get((java.lang.Object) entryArray16);
        hashMap4.table = entryArray16;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap(10, (float) ' ');
        boolean boolean22 = hashMap21.isEmpty();
        java.lang.Object obj23 = hashMap4.get((java.lang.Object) boolean22);
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        boolean boolean25 = hashMap24.isEmpty();
        int int26 = hashMap24.size();
        hashMap24.clear();
        java.lang.Object obj29 = hashMap24.get((java.lang.Object) (byte) 0);
        hashMap24.modCount = 'a';
        hashMap24.clear();
        int int33 = hashMap24.modCount;
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int37 = hashMap36.size();
        hashMap36.modCount = (short) 1;
        int int40 = hashMap36.size();
        java.lang.Object obj41 = hashMap24.get((java.lang.Object) hashMap36);
        java.lang.Object obj42 = hashMap2.put((java.lang.Object) boolean22, obj41);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 100);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap((int) (short) 0, (float) (byte) 100);
        int int5 = hashMap4.size();
        system.testclass.HashMap.Entry[] entryArray6 = hashMap4.table;
        boolean boolean7 = hashMap4.isEmpty();
        system.testclass.HashMap.Entry[] entryArray8 = hashMap4.table;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) (short) 10);
        boolean boolean11 = hashMap10.isEmpty();
        java.lang.Object obj13 = hashMap10.get((java.lang.Object) 100L);
        int int14 = hashMap10.modCount;
        hashMap10.clear();
        system.testclass.HashMap.Entry[] entryArray16 = hashMap10.table;
        hashMap4.table = entryArray16;
        hashMap1.table = entryArray16;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        int int3 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray4 = hashMap0.table;
        int int5 = hashMap0.size();
        hashMap0.clear();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        int int9 = hashMap7.modCount;
        hashMap7.clear();
        hashMap7.clear();
        boolean boolean12 = hashMap7.isEmpty();
        hashMap7.clear();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.modCount;
        int int16 = hashMap14.modCount;
        hashMap14.clear();
        java.lang.Object obj19 = hashMap14.remove((java.lang.Object) (short) -1);
        java.lang.Object obj20 = hashMap7.remove((java.lang.Object) hashMap14);
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        hashMap21.modCount = 0;
        int int24 = hashMap21.modCount;
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        int int26 = hashMap25.modCount;
        int int27 = hashMap25.modCount;
        system.testclass.HashMap.Entry[] entryArray28 = hashMap25.table;
        hashMap21.table = entryArray28;
        java.lang.Class<?> wildcardClass30 = entryArray28.getClass();
        java.lang.Object obj31 = hashMap0.put(obj20, (java.lang.Object) wildcardClass30);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = hashMap0.remove(obj4);
        hashMap0.clear();
        hashMap0.modCount = 0;
        system.testclass.HashMap.Entry[] entryArray9 = hashMap0.table;
        int int10 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray11 = hashMap0.table;
        hashMap0.modCount = 10;
        hashMap0.modCount = (short) 100;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        boolean boolean17 = hashMap16.isEmpty();
        int int18 = hashMap16.size();
        hashMap16.clear();
        java.lang.Object obj21 = hashMap16.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        int int23 = hashMap22.modCount;
        int int24 = hashMap22.modCount;
        hashMap22.clear();
        java.lang.Object obj26 = null;
        java.lang.Object obj27 = hashMap22.remove(obj26);
        hashMap22.clear();
        hashMap22.modCount = 0;
        hashMap22.clear();
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        int int33 = hashMap32.modCount;
        int int34 = hashMap32.modCount;
        java.lang.Object obj35 = hashMap22.remove((java.lang.Object) hashMap32);
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        int int37 = hashMap36.modCount;
        int int38 = hashMap36.modCount;
        hashMap36.clear();
        java.lang.Object obj40 = hashMap32.remove((java.lang.Object) hashMap36);
        java.lang.Object obj41 = hashMap16.remove(obj40);
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap(0, (float) (byte) 1);
        java.lang.Object obj45 = hashMap16.remove((java.lang.Object) 0);
        system.testclass.HashMap hashMap46 = new system.testclass.HashMap();
        int int47 = hashMap46.modCount;
        int int48 = hashMap46.modCount;
        hashMap46.clear();
        java.lang.Object obj50 = null;
        java.lang.Object obj51 = hashMap46.remove(obj50);
        hashMap46.clear();
        int int53 = hashMap46.size();
        int int54 = hashMap46.modCount;
        system.testclass.HashMap hashMap55 = new system.testclass.HashMap();
        int int56 = hashMap55.modCount;
        int int57 = hashMap55.modCount;
        system.testclass.HashMap.Entry[] entryArray58 = hashMap55.table;
        system.testclass.HashMap hashMap61 = new system.testclass.HashMap((int) ' ', (float) '#');
        java.lang.Object obj62 = hashMap55.remove((java.lang.Object) ' ');
        java.lang.Object obj63 = hashMap46.get(obj62);
        java.lang.Object obj64 = hashMap16.remove(obj63);
        system.testclass.HashMap hashMap65 = new system.testclass.HashMap();
        boolean boolean66 = hashMap65.isEmpty();
        int int67 = hashMap65.size();
        java.lang.Object obj69 = hashMap65.get((java.lang.Object) (short) -1);
        boolean boolean70 = hashMap65.isEmpty();
        int int71 = hashMap65.modCount;
        java.lang.Object obj72 = hashMap0.put(obj64, (java.lang.Object) int71);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 10);
        boolean boolean2 = hashMap1.isEmpty();
        java.lang.Object obj4 = hashMap1.get((java.lang.Object) 100L);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        boolean boolean6 = hashMap5.isEmpty();
        int int7 = hashMap5.size();
        java.lang.Object obj9 = hashMap5.get((java.lang.Object) (short) -1);
        boolean boolean10 = hashMap5.isEmpty();
        int int11 = hashMap5.modCount;
        java.lang.Object obj12 = hashMap1.get((java.lang.Object) hashMap5);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        int int17 = hashMap16.modCount;
        int int18 = hashMap16.modCount;
        hashMap16.clear();
        java.lang.Object obj20 = null;
        java.lang.Object obj21 = hashMap16.remove(obj20);
        java.lang.Object obj22 = hashMap15.remove((java.lang.Object) hashMap16);
        java.lang.Object obj24 = hashMap16.get((java.lang.Object) (short) 10);
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        int int26 = hashMap25.modCount;
        int int27 = hashMap25.modCount;
        int int28 = hashMap25.modCount;
        system.testclass.HashMap.Entry[] entryArray29 = hashMap25.table;
        java.lang.Object obj30 = hashMap16.remove((java.lang.Object) hashMap25);
        hashMap16.modCount = (short) 1;
        java.lang.Object obj33 = hashMap1.get((java.lang.Object) hashMap16);
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        hashMap34.clear();
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        boolean boolean37 = hashMap36.isEmpty();
        int int38 = hashMap36.size();
        java.lang.Object obj40 = hashMap36.get((java.lang.Object) (short) -1);
        int int41 = hashMap36.modCount;
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap();
        boolean boolean43 = hashMap42.isEmpty();
        int int44 = hashMap42.size();
        hashMap42.clear();
        java.lang.Object obj47 = hashMap42.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap();
        boolean boolean49 = hashMap48.isEmpty();
        java.lang.Object obj50 = hashMap42.remove((java.lang.Object) hashMap48);
        system.testclass.HashMap hashMap51 = new system.testclass.HashMap();
        int int52 = hashMap51.modCount;
        int int53 = hashMap51.modCount;
        system.testclass.HashMap.Entry[] entryArray54 = hashMap51.table;
        system.testclass.HashMap.Entry[] entryArray55 = hashMap51.table;
        hashMap48.table = entryArray55;
        hashMap36.table = entryArray55;
        hashMap34.table = entryArray55;
        hashMap16.table = entryArray55;
        system.testclass.HashMap hashMap60 = new system.testclass.HashMap();
        boolean boolean61 = hashMap60.isEmpty();
        int int62 = hashMap60.size();
        hashMap60.clear();
        java.lang.Object obj65 = hashMap60.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap66 = new system.testclass.HashMap();
        boolean boolean67 = hashMap66.isEmpty();
        java.lang.Object obj68 = hashMap60.remove((java.lang.Object) hashMap66);
        system.testclass.HashMap hashMap69 = new system.testclass.HashMap();
        int int70 = hashMap69.modCount;
        int int71 = hashMap69.modCount;
        system.testclass.HashMap.Entry[] entryArray72 = hashMap69.table;
        system.testclass.HashMap.Entry[] entryArray73 = hashMap69.table;
        hashMap66.table = entryArray73;
        int int75 = hashMap66.size();
        hashMap66.clear();
        boolean boolean77 = hashMap66.isEmpty();
        java.lang.Object obj78 = hashMap16.remove((java.lang.Object) boolean77);
        system.testclass.HashMap hashMap80 = new system.testclass.HashMap();
        boolean boolean81 = hashMap80.isEmpty();
        int int82 = hashMap80.size();
        hashMap80.clear();
        java.lang.Object obj85 = hashMap80.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap86 = new system.testclass.HashMap();
        boolean boolean87 = hashMap86.isEmpty();
        java.lang.Object obj88 = hashMap80.remove((java.lang.Object) hashMap86);
        system.testclass.HashMap hashMap89 = new system.testclass.HashMap();
        boolean boolean90 = hashMap89.isEmpty();
        java.lang.Object obj91 = hashMap86.get((java.lang.Object) hashMap89);
        int int92 = hashMap86.size();
        system.testclass.HashMap.Entry[] entryArray93 = hashMap86.table;
        java.lang.Object obj94 = hashMap16.put((java.lang.Object) (byte) 10, (java.lang.Object) entryArray93);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap16", hashMap16.repOK_1());
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(98);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        int int3 = hashMap2.modCount;
        int int4 = hashMap2.modCount;
        hashMap2.clear();
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = hashMap2.remove(obj6);
        hashMap2.clear();
        hashMap2.modCount = 0;
        hashMap2.modCount = 10;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        boolean boolean14 = hashMap13.isEmpty();
        int int15 = hashMap13.size();
        hashMap13.clear();
        java.lang.Object obj18 = hashMap13.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        boolean boolean20 = hashMap19.isEmpty();
        java.lang.Object obj21 = hashMap13.remove((java.lang.Object) hashMap19);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        int int23 = hashMap22.modCount;
        int int24 = hashMap22.modCount;
        system.testclass.HashMap.Entry[] entryArray25 = hashMap22.table;
        system.testclass.HashMap.Entry[] entryArray26 = hashMap22.table;
        hashMap19.table = entryArray26;
        hashMap2.table = entryArray26;
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        boolean boolean30 = hashMap29.isEmpty();
        int int31 = hashMap29.size();
        java.lang.Object obj33 = hashMap29.get((java.lang.Object) (short) -1);
        hashMap29.modCount = (-1);
        java.lang.Object obj36 = hashMap1.put((java.lang.Object) entryArray26, (java.lang.Object) hashMap29);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        int int3 = hashMap2.modCount;
        int int4 = hashMap2.modCount;
        hashMap2.clear();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.modCount;
        int int8 = hashMap6.modCount;
        int int9 = hashMap6.size();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.modCount;
        int int12 = hashMap10.modCount;
        system.testclass.HashMap.Entry[] entryArray13 = hashMap10.table;
        boolean boolean14 = hashMap10.isEmpty();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        int int17 = hashMap15.modCount;
        system.testclass.HashMap.Entry[] entryArray18 = hashMap15.table;
        java.lang.Object obj19 = hashMap10.get((java.lang.Object) entryArray18);
        hashMap6.table = entryArray18;
        java.lang.Object obj21 = hashMap2.get((java.lang.Object) entryArray18);
        hashMap0.table = entryArray18;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        int int24 = hashMap23.modCount;
        int int25 = hashMap23.modCount;
        hashMap23.clear();
        java.lang.Object obj27 = null;
        java.lang.Object obj28 = hashMap23.remove(obj27);
        hashMap23.clear();
        hashMap23.modCount = 0;
        hashMap23.clear();
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        int int34 = hashMap33.modCount;
        int int35 = hashMap33.modCount;
        java.lang.Object obj36 = hashMap23.remove((java.lang.Object) hashMap33);
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        int int38 = hashMap37.modCount;
        int int39 = hashMap37.modCount;
        hashMap37.clear();
        java.lang.Object obj41 = hashMap33.remove((java.lang.Object) hashMap37);
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        int int46 = hashMap45.modCount;
        int int47 = hashMap45.modCount;
        hashMap45.clear();
        java.lang.Object obj49 = null;
        java.lang.Object obj50 = hashMap45.remove(obj49);
        java.lang.Object obj51 = hashMap44.remove((java.lang.Object) hashMap45);
        java.lang.Object obj53 = hashMap45.get((java.lang.Object) (short) 10);
        system.testclass.HashMap hashMap54 = new system.testclass.HashMap();
        int int55 = hashMap54.modCount;
        int int56 = hashMap54.modCount;
        int int57 = hashMap54.modCount;
        system.testclass.HashMap.Entry[] entryArray58 = hashMap54.table;
        java.lang.Object obj59 = hashMap45.remove((java.lang.Object) hashMap54);
        system.testclass.HashMap hashMap60 = new system.testclass.HashMap();
        boolean boolean61 = hashMap60.isEmpty();
        int int62 = hashMap60.size();
        hashMap60.clear();
        system.testclass.HashMap hashMap64 = new system.testclass.HashMap();
        int int65 = hashMap64.modCount;
        int int66 = hashMap64.modCount;
        hashMap64.clear();
        system.testclass.HashMap hashMap68 = new system.testclass.HashMap();
        int int69 = hashMap68.modCount;
        int int70 = hashMap68.modCount;
        int int71 = hashMap68.size();
        system.testclass.HashMap hashMap72 = new system.testclass.HashMap();
        int int73 = hashMap72.modCount;
        int int74 = hashMap72.modCount;
        system.testclass.HashMap.Entry[] entryArray75 = hashMap72.table;
        boolean boolean76 = hashMap72.isEmpty();
        system.testclass.HashMap hashMap77 = new system.testclass.HashMap();
        int int78 = hashMap77.modCount;
        int int79 = hashMap77.modCount;
        system.testclass.HashMap.Entry[] entryArray80 = hashMap77.table;
        java.lang.Object obj81 = hashMap72.get((java.lang.Object) entryArray80);
        hashMap68.table = entryArray80;
        java.lang.Object obj83 = hashMap64.get((java.lang.Object) entryArray80);
        hashMap60.table = entryArray80;
        java.lang.Object obj85 = hashMap45.remove((java.lang.Object) hashMap60);
        java.lang.Object obj86 = hashMap0.put((java.lang.Object) hashMap33, (java.lang.Object) hashMap45);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        java.lang.Object obj4 = hashMap0.get((java.lang.Object) (short) -1);
        int int5 = hashMap0.modCount;
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) 10L);
        int int8 = hashMap0.size();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        int int11 = hashMap9.size();
        hashMap9.clear();
        java.lang.Object obj14 = hashMap9.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        boolean boolean16 = hashMap15.isEmpty();
        java.lang.Object obj17 = hashMap9.remove((java.lang.Object) hashMap15);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        boolean boolean19 = hashMap18.isEmpty();
        java.lang.Object obj20 = hashMap15.get((java.lang.Object) hashMap18);
        java.lang.Object obj21 = hashMap0.get(obj20);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        boolean boolean23 = hashMap22.isEmpty();
        int int24 = hashMap22.size();
        hashMap22.clear();
        int int26 = hashMap22.size();
        system.testclass.HashMap.Entry[] entryArray27 = hashMap22.table;
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        int int29 = hashMap28.modCount;
        int int30 = hashMap28.modCount;
        java.lang.Object obj32 = hashMap28.remove((java.lang.Object) 0.0d);
        hashMap28.clear();
        java.lang.Object obj34 = hashMap0.put((java.lang.Object) entryArray27, (java.lang.Object) hashMap28);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        hashMap3.clear();
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = hashMap3.remove(obj7);
        java.lang.Object obj9 = hashMap2.remove((java.lang.Object) hashMap3);
        java.lang.Object obj11 = hashMap3.get((java.lang.Object) (short) 10);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        int int13 = hashMap12.modCount;
        int int14 = hashMap12.modCount;
        int int15 = hashMap12.modCount;
        system.testclass.HashMap.Entry[] entryArray16 = hashMap12.table;
        java.lang.Object obj17 = hashMap3.remove((java.lang.Object) hashMap12);
        hashMap3.modCount = (short) 1;
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        boolean boolean21 = hashMap20.isEmpty();
        int int22 = hashMap20.size();
        hashMap20.clear();
        int int24 = hashMap20.modCount;
        int int25 = hashMap20.modCount;
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        int int30 = hashMap29.modCount;
        int int31 = hashMap29.modCount;
        hashMap29.clear();
        java.lang.Object obj33 = null;
        java.lang.Object obj34 = hashMap29.remove(obj33);
        java.lang.Object obj35 = hashMap28.remove((java.lang.Object) hashMap29);
        java.lang.Object obj37 = hashMap29.get((java.lang.Object) (short) 10);
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        int int39 = hashMap38.modCount;
        int int40 = hashMap38.modCount;
        int int41 = hashMap38.modCount;
        system.testclass.HashMap.Entry[] entryArray42 = hashMap38.table;
        java.lang.Object obj43 = hashMap29.remove((java.lang.Object) hashMap38);
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap();
        boolean boolean45 = hashMap44.isEmpty();
        int int46 = hashMap44.size();
        hashMap44.clear();
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap();
        int int49 = hashMap48.modCount;
        int int50 = hashMap48.modCount;
        hashMap48.clear();
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap();
        int int53 = hashMap52.modCount;
        int int54 = hashMap52.modCount;
        int int55 = hashMap52.size();
        system.testclass.HashMap hashMap56 = new system.testclass.HashMap();
        int int57 = hashMap56.modCount;
        int int58 = hashMap56.modCount;
        system.testclass.HashMap.Entry[] entryArray59 = hashMap56.table;
        boolean boolean60 = hashMap56.isEmpty();
        system.testclass.HashMap hashMap61 = new system.testclass.HashMap();
        int int62 = hashMap61.modCount;
        int int63 = hashMap61.modCount;
        system.testclass.HashMap.Entry[] entryArray64 = hashMap61.table;
        java.lang.Object obj65 = hashMap56.get((java.lang.Object) entryArray64);
        hashMap52.table = entryArray64;
        java.lang.Object obj67 = hashMap48.get((java.lang.Object) entryArray64);
        hashMap44.table = entryArray64;
        java.lang.Object obj69 = hashMap29.remove((java.lang.Object) hashMap44);
        java.lang.Object obj70 = hashMap3.put((java.lang.Object) hashMap20, obj69);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap3", hashMap3.repOK_1());
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        hashMap0.clear();
        hashMap0.clear();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        int int9 = hashMap7.size();
        hashMap7.clear();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        int int13 = hashMap11.modCount;
        hashMap11.clear();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        int int17 = hashMap15.modCount;
        int int18 = hashMap15.size();
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        int int20 = hashMap19.modCount;
        int int21 = hashMap19.modCount;
        system.testclass.HashMap.Entry[] entryArray22 = hashMap19.table;
        boolean boolean23 = hashMap19.isEmpty();
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.modCount;
        int int26 = hashMap24.modCount;
        system.testclass.HashMap.Entry[] entryArray27 = hashMap24.table;
        java.lang.Object obj28 = hashMap19.get((java.lang.Object) entryArray27);
        hashMap15.table = entryArray27;
        java.lang.Object obj30 = hashMap11.get((java.lang.Object) entryArray27);
        hashMap7.table = entryArray27;
        java.lang.Object obj32 = hashMap6.get((java.lang.Object) hashMap7);
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap((int) (short) 0, (float) (byte) 100);
        int int36 = hashMap35.size();
        system.testclass.HashMap.Entry[] entryArray37 = hashMap35.table;
        boolean boolean38 = hashMap35.isEmpty();
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        hashMap39.clear();
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        hashMap41.modCount = 0;
        int int44 = hashMap41.modCount;
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        int int46 = hashMap45.modCount;
        int int47 = hashMap45.modCount;
        system.testclass.HashMap.Entry[] entryArray48 = hashMap45.table;
        hashMap41.table = entryArray48;
        java.lang.Object obj50 = hashMap39.get((java.lang.Object) hashMap41);
        java.lang.Object obj51 = hashMap35.get(obj50);
        int int52 = hashMap35.modCount;
        system.testclass.HashMap hashMap54 = new system.testclass.HashMap(100);
        system.testclass.HashMap hashMap55 = new system.testclass.HashMap();
        boolean boolean56 = hashMap55.isEmpty();
        int int57 = hashMap55.size();
        hashMap55.clear();
        system.testclass.HashMap hashMap59 = new system.testclass.HashMap();
        int int60 = hashMap59.modCount;
        int int61 = hashMap59.modCount;
        hashMap59.clear();
        system.testclass.HashMap hashMap63 = new system.testclass.HashMap();
        int int64 = hashMap63.modCount;
        int int65 = hashMap63.modCount;
        int int66 = hashMap63.size();
        system.testclass.HashMap hashMap67 = new system.testclass.HashMap();
        int int68 = hashMap67.modCount;
        int int69 = hashMap67.modCount;
        system.testclass.HashMap.Entry[] entryArray70 = hashMap67.table;
        boolean boolean71 = hashMap67.isEmpty();
        system.testclass.HashMap hashMap72 = new system.testclass.HashMap();
        int int73 = hashMap72.modCount;
        int int74 = hashMap72.modCount;
        system.testclass.HashMap.Entry[] entryArray75 = hashMap72.table;
        java.lang.Object obj76 = hashMap67.get((java.lang.Object) entryArray75);
        hashMap63.table = entryArray75;
        java.lang.Object obj78 = hashMap59.get((java.lang.Object) entryArray75);
        hashMap55.table = entryArray75;
        java.lang.Object obj80 = hashMap54.get((java.lang.Object) hashMap55);
        java.lang.Object obj81 = hashMap35.get((java.lang.Object) hashMap54);
        java.lang.Object obj82 = hashMap0.put((java.lang.Object) hashMap7, (java.lang.Object) hashMap54);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) ' ', (float) '#');
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        system.testclass.HashMap.Entry[] entryArray6 = hashMap3.table;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        int int9 = hashMap7.modCount;
        system.testclass.HashMap.Entry[] entryArray10 = hashMap7.table;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap((int) ' ', (float) '#');
        java.lang.Object obj14 = hashMap7.remove((java.lang.Object) ' ');
        system.testclass.HashMap.Entry[] entryArray15 = hashMap7.table;
        system.testclass.HashMap.Entry[] entryArray16 = hashMap7.table;
        java.lang.Object obj17 = hashMap2.put((java.lang.Object) hashMap3, (java.lang.Object) hashMap7);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        java.lang.Object obj5 = hashMap0.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        int int11 = hashMap9.modCount;
        hashMap9.clear();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = hashMap9.remove(obj13);
        hashMap9.clear();
        int int16 = hashMap9.size();
        java.lang.Object obj17 = hashMap6.get((java.lang.Object) int16);
        hashMap6.modCount = (byte) -1;
        hashMap6.clear();
        hashMap6.modCount = 10;
        hashMap6.clear();
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.modCount;
        int int26 = hashMap24.modCount;
        hashMap24.clear();
        java.lang.Object obj29 = hashMap24.remove((java.lang.Object) (short) -1);
        hashMap24.modCount = (byte) 10;
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        int int33 = hashMap32.modCount;
        int int34 = hashMap32.modCount;
        hashMap32.clear();
        java.lang.Object obj36 = null;
        java.lang.Object obj37 = hashMap32.remove(obj36);
        hashMap32.clear();
        hashMap32.modCount = 0;
        hashMap32.modCount = 10;
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap();
        boolean boolean44 = hashMap43.isEmpty();
        int int45 = hashMap43.size();
        hashMap43.clear();
        java.lang.Object obj48 = hashMap43.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap49 = new system.testclass.HashMap();
        boolean boolean50 = hashMap49.isEmpty();
        java.lang.Object obj51 = hashMap43.remove((java.lang.Object) hashMap49);
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap();
        int int53 = hashMap52.modCount;
        int int54 = hashMap52.modCount;
        system.testclass.HashMap.Entry[] entryArray55 = hashMap52.table;
        system.testclass.HashMap.Entry[] entryArray56 = hashMap52.table;
        hashMap49.table = entryArray56;
        hashMap32.table = entryArray56;
        java.lang.Object obj59 = hashMap6.put((java.lang.Object) hashMap24, (java.lang.Object) hashMap32);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap6", hashMap6.repOK_1());
    }
}

