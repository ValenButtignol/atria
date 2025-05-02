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
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = hashMap0.remove(obj3);
        java.lang.Object obj7 = hashMap0.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.modCount = '4';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (short) 100);
        hashMap2.modCount = ' ';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap(0);
        java.lang.Object obj5 = hashMap2.get((java.lang.Object) hashMap4);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        java.lang.Object obj9 = hashMap2.put((java.lang.Object) hashMap6, (java.lang.Object) '4');
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
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        hashMap0.modCount = 'a';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        hashMap0.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap(0);
        java.lang.Object obj5 = hashMap2.get((java.lang.Object) hashMap4);
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '#', (float) 'a');
        hashMap2.modCount = '#';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray3 = hashMap2.table;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray10 = hashMap9.table;
        java.lang.Object obj11 = hashMap5.remove((java.lang.Object) entryArray10);
        java.lang.Object obj12 = hashMap2.put((java.lang.Object) 10, obj11);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap(0);
        java.lang.Object obj5 = hashMap2.get((java.lang.Object) hashMap4);
        int int6 = hashMap2.modCount;
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        boolean boolean3 = hashMap2.isEmpty();
        hashMap2.modCount = 0;
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = hashMap0.remove(obj3);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.size();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap(0);
        java.lang.Object obj12 = hashMap9.get((java.lang.Object) hashMap11);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray18 = hashMap17.table;
        hashMap13.table = entryArray18;
        hashMap9.table = entryArray18;
        hashMap5.table = entryArray18;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap(0);
        java.lang.Object obj24 = hashMap0.put((java.lang.Object) entryArray18, (java.lang.Object) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (short) 100);
        int int3 = hashMap2.modCount;
        hashMap2.modCount = (byte) 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (short) 100);
        int int3 = hashMap2.modCount;
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.size();
        int int2 = hashMap0.modCount;
        int int3 = hashMap0.modCount;
        hashMap0.modCount = (byte) 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray2 = hashMap0.table;
        system.testclass.HashMap.Entry[] entryArray3 = new system.testclass.HashMap.Entry[] {};
        hashMap0.table = entryArray3;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        boolean boolean3 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int7 = hashMap6.modCount;
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) int7);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        hashMap9.modCount = 0;
        boolean boolean12 = hashMap9.isEmpty();
        int int13 = hashMap9.size();
        java.lang.Object obj14 = hashMap0.get((java.lang.Object) hashMap9);
        hashMap0.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        hashMap1.modCount = 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        int int4 = hashMap0.size();
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray2 = hashMap0.table;
        system.testclass.HashMap.Entry[] entryArray3 = new system.testclass.HashMap.Entry[] {};
        hashMap0.table = entryArray3;
        int int5 = hashMap0.size();
        hashMap0.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        hashMap1.modCount = 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = hashMap1.remove(obj2);
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap(0);
        java.lang.Object obj5 = hashMap2.get((java.lang.Object) hashMap4);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.modCount;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray11 = hashMap10.table;
        hashMap6.table = entryArray11;
        java.lang.Object obj13 = hashMap4.get((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap(0);
        java.lang.Object obj19 = hashMap16.get((java.lang.Object) hashMap18);
        int int20 = hashMap18.size();
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        boolean boolean22 = hashMap21.isEmpty();
        int int23 = hashMap21.size();
        boolean boolean24 = hashMap21.isEmpty();
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int28 = hashMap27.modCount;
        java.lang.Object obj29 = hashMap21.remove((java.lang.Object) int28);
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        hashMap30.modCount = 0;
        boolean boolean33 = hashMap30.isEmpty();
        int int34 = hashMap30.size();
        java.lang.Object obj35 = hashMap21.get((java.lang.Object) hashMap30);
        java.lang.Object obj36 = hashMap18.remove(obj35);
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int40 = hashMap39.modCount;
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap();
        int int45 = hashMap44.modCount;
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray49 = hashMap48.table;
        hashMap44.table = entryArray49;
        java.lang.Object obj51 = hashMap43.remove((java.lang.Object) entryArray49);
        hashMap39.table = entryArray49;
        system.testclass.HashMap hashMap53 = new system.testclass.HashMap();
        boolean boolean54 = hashMap53.isEmpty();
        int int55 = hashMap53.size();
        java.lang.Object obj56 = hashMap39.remove((java.lang.Object) int55);
        java.lang.Object obj57 = hashMap6.put(obj36, (java.lang.Object) int55);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap6", hashMap6.repOK_1());
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        boolean boolean3 = hashMap2.isEmpty();
        hashMap2.modCount = 0;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int9 = hashMap8.modCount;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray18 = hashMap17.table;
        hashMap13.table = entryArray18;
        java.lang.Object obj20 = hashMap12.remove((java.lang.Object) entryArray18);
        hashMap8.table = entryArray18;
        hashMap2.table = entryArray18;
        hashMap2.modCount = ' ';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        int int2 = hashMap1.size();
        java.lang.Object obj4 = hashMap1.get((java.lang.Object) 100L);
        int int5 = hashMap1.modCount;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        int int8 = hashMap6.size();
        boolean boolean9 = hashMap6.isEmpty();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int13 = hashMap12.modCount;
        java.lang.Object obj14 = hashMap6.remove((java.lang.Object) int13);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        hashMap15.modCount = 0;
        boolean boolean18 = hashMap15.isEmpty();
        int int19 = hashMap15.size();
        java.lang.Object obj20 = hashMap6.get((java.lang.Object) hashMap15);
        int int21 = hashMap6.modCount;
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        boolean boolean23 = hashMap22.isEmpty();
        int int24 = hashMap22.size();
        boolean boolean25 = hashMap22.isEmpty();
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int29 = hashMap28.modCount;
        java.lang.Object obj30 = hashMap22.remove((java.lang.Object) int29);
        int int31 = hashMap22.modCount;
        system.testclass.HashMap.Entry[] entryArray32 = hashMap22.table;
        java.lang.Object obj33 = hashMap1.put((java.lang.Object) int21, (java.lang.Object) entryArray32);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        int int2 = hashMap1.size();
        hashMap1.modCount = (short) 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        boolean boolean6 = hashMap5.isEmpty();
        int int7 = hashMap5.size();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        java.lang.Class<?> wildcardClass9 = hashMap8.getClass();
        java.lang.Object obj10 = hashMap5.get((java.lang.Object) hashMap8);
        int int11 = hashMap5.size();
        java.lang.Object obj12 = hashMap0.put((java.lang.Object) 10L, (java.lang.Object) int11);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        boolean boolean3 = hashMap2.isEmpty();
        hashMap2.modCount = 0;
        hashMap2.modCount = (short) 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap(0);
        java.lang.Object obj5 = hashMap2.get((java.lang.Object) hashMap4);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.modCount;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray11 = hashMap10.table;
        hashMap6.table = entryArray11;
        hashMap2.table = entryArray11;
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap(0);
        java.lang.Object obj5 = hashMap2.get((java.lang.Object) hashMap4);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.modCount;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray11 = hashMap10.table;
        hashMap6.table = entryArray11;
        java.lang.Object obj13 = hashMap4.get((java.lang.Object) hashMap6);
        hashMap4.modCount = 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap4", hashMap4.repOK_1());
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        hashMap0.modCount = ' ';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        int int2 = hashMap1.size();
        java.lang.Object obj4 = hashMap1.get((java.lang.Object) 100L);
        int int5 = hashMap1.modCount;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        int int8 = hashMap6.size();
        boolean boolean9 = hashMap6.isEmpty();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int13 = hashMap12.modCount;
        java.lang.Object obj14 = hashMap6.remove((java.lang.Object) int13);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        hashMap15.modCount = 0;
        boolean boolean18 = hashMap15.isEmpty();
        int int19 = hashMap15.size();
        java.lang.Object obj20 = hashMap6.get((java.lang.Object) hashMap15);
        java.lang.Object obj21 = hashMap1.get((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        boolean boolean23 = hashMap22.isEmpty();
        int int24 = hashMap22.size();
        system.testclass.HashMap.Entry[] entryArray25 = hashMap22.table;
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int29 = hashMap28.modCount;
        boolean boolean30 = hashMap28.isEmpty();
        java.lang.Object obj31 = hashMap1.put((java.lang.Object) entryArray25, (java.lang.Object) boolean30);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = hashMap0.remove(obj3);
        hashMap0.modCount = 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int6 = hashMap5.modCount;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.modCount;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray15 = hashMap14.table;
        hashMap10.table = entryArray15;
        java.lang.Object obj17 = hashMap9.remove((java.lang.Object) entryArray15);
        hashMap5.table = entryArray15;
        java.lang.Object obj19 = hashMap0.remove((java.lang.Object) hashMap5);
        hashMap0.modCount = (short) 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap(0);
        java.lang.Object obj5 = hashMap2.get((java.lang.Object) hashMap4);
        boolean boolean6 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj11 = hashMap2.put((java.lang.Object) "", (java.lang.Object) hashMap10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        boolean boolean3 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int7 = hashMap6.modCount;
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) int7);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        hashMap9.modCount = 0;
        boolean boolean12 = hashMap9.isEmpty();
        int int13 = hashMap9.size();
        java.lang.Object obj14 = hashMap0.get((java.lang.Object) hashMap9);
        java.lang.Object obj16 = hashMap0.get((java.lang.Object) (byte) 10);
        int int17 = hashMap0.size();
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        hashMap1.modCount = (byte) 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '#', (float) 'a');
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray6 = hashMap5.table;
        hashMap2.table = entryArray6;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap(0);
        java.lang.Object obj13 = hashMap10.get((java.lang.Object) hashMap12);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.modCount;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray19 = hashMap18.table;
        hashMap14.table = entryArray19;
        java.lang.Object obj21 = hashMap12.get((java.lang.Object) hashMap14);
        java.lang.Object obj22 = hashMap2.get(obj21);
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap(0);
        java.lang.Object obj28 = hashMap25.get((java.lang.Object) hashMap27);
        boolean boolean29 = hashMap25.isEmpty();
        java.lang.Object obj31 = hashMap2.put((java.lang.Object) boolean29, (java.lang.Object) (-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '#', (float) 'a');
        boolean boolean3 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap(0);
        int int6 = hashMap5.size();
        java.lang.Object obj8 = hashMap5.remove((java.lang.Object) (byte) 100);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        java.lang.Object obj11 = hashMap5.remove((java.lang.Object) hashMap9);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        int int13 = hashMap12.size();
        system.testclass.HashMap.Entry[] entryArray14 = hashMap12.table;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        boolean boolean16 = hashMap15.isEmpty();
        java.lang.Object obj17 = hashMap12.remove((java.lang.Object) hashMap15);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        int int19 = hashMap18.modCount;
        int int20 = hashMap18.modCount;
        system.testclass.HashMap.Entry[] entryArray21 = hashMap18.table;
        hashMap12.table = entryArray21;
        hashMap5.table = entryArray21;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.modCount;
        int int26 = hashMap24.modCount;
        system.testclass.HashMap.Entry[] entryArray27 = hashMap24.table;
        java.lang.Object obj28 = hashMap2.put((java.lang.Object) hashMap5, (java.lang.Object) hashMap24);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        boolean boolean3 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int7 = hashMap6.modCount;
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) int7);
        hashMap0.clear();
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
        boolean boolean3 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int7 = hashMap6.modCount;
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) int7);
        int int9 = hashMap0.modCount;
        int int10 = hashMap0.size();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Object obj15 = hashMap13.remove(obj14);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap(0);
        java.lang.Object obj21 = hashMap18.get((java.lang.Object) hashMap20);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        int int23 = hashMap22.modCount;
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray27 = hashMap26.table;
        hashMap22.table = entryArray27;
        java.lang.Object obj29 = hashMap20.get((java.lang.Object) hashMap22);
        java.lang.Object obj30 = hashMap0.put((java.lang.Object) hashMap13, (java.lang.Object) hashMap22);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        boolean boolean3 = hashMap0.isEmpty();
        java.lang.Object obj5 = hashMap0.get((java.lang.Object) 0L);
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        boolean boolean2 = hashMap1.isEmpty();
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        int int2 = hashMap1.size();
        java.lang.Object obj4 = hashMap1.get((java.lang.Object) 100L);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.size();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap(0);
        java.lang.Object obj12 = hashMap9.get((java.lang.Object) hashMap11);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray18 = hashMap17.table;
        hashMap13.table = entryArray18;
        hashMap9.table = entryArray18;
        hashMap5.table = entryArray18;
        boolean boolean22 = hashMap5.isEmpty();
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        hashMap23.modCount = 0;
        boolean boolean26 = hashMap23.isEmpty();
        int int27 = hashMap23.size();
        system.testclass.HashMap.Entry[] entryArray28 = hashMap23.table;
        java.lang.Class<?> wildcardClass29 = hashMap23.getClass();
        java.lang.Object obj30 = hashMap1.put((java.lang.Object) hashMap5, (java.lang.Object) wildcardClass29);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.size();
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        boolean boolean3 = hashMap2.isEmpty();
        int int4 = hashMap2.size();
        boolean boolean5 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int9 = hashMap8.modCount;
        java.lang.Object obj10 = hashMap2.remove((java.lang.Object) int9);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        hashMap11.modCount = 0;
        boolean boolean14 = hashMap11.isEmpty();
        int int15 = hashMap11.size();
        java.lang.Object obj16 = hashMap2.get((java.lang.Object) hashMap11);
        boolean boolean17 = hashMap11.isEmpty();
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        boolean boolean19 = hashMap18.isEmpty();
        int int20 = hashMap18.size();
        boolean boolean21 = hashMap18.isEmpty();
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int25 = hashMap24.modCount;
        java.lang.Object obj26 = hashMap18.remove((java.lang.Object) int25);
        int int27 = hashMap18.modCount;
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        int int29 = hashMap28.size();
        system.testclass.HashMap.Entry[] entryArray30 = hashMap28.table;
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        boolean boolean32 = hashMap31.isEmpty();
        java.lang.Object obj33 = hashMap28.remove((java.lang.Object) hashMap31);
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        int int35 = hashMap34.modCount;
        int int36 = hashMap34.modCount;
        system.testclass.HashMap.Entry[] entryArray37 = hashMap34.table;
        hashMap28.table = entryArray37;
        java.lang.Object obj39 = hashMap18.get((java.lang.Object) hashMap28);
        java.lang.Object obj40 = hashMap0.put((java.lang.Object) hashMap11, obj39);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        boolean boolean3 = hashMap2.isEmpty();
        boolean boolean4 = hashMap2.isEmpty();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap2.table;
        system.testclass.HashMap.Entry[] entryArray6 = hashMap2.table;
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        int int2 = hashMap1.size();
        java.lang.Object obj4 = hashMap1.remove((java.lang.Object) (byte) 100);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        boolean boolean6 = hashMap5.isEmpty();
        java.lang.Object obj7 = hashMap1.remove((java.lang.Object) hashMap5);
        hashMap5.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap5", hashMap5.repOK_1());
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 100);
        system.testclass.HashMap.Entry[] entryArray2 = hashMap1.table;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.size();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap(0);
        java.lang.Object obj10 = hashMap7.get((java.lang.Object) hashMap9);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray16 = hashMap15.table;
        hashMap11.table = entryArray16;
        hashMap7.table = entryArray16;
        hashMap3.table = entryArray16;
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        int int21 = hashMap20.size();
        system.testclass.HashMap.Entry[] entryArray22 = hashMap20.table;
        system.testclass.HashMap.Entry[] entryArray23 = new system.testclass.HashMap.Entry[] {};
        hashMap20.table = entryArray23;
        int int25 = hashMap20.size();
        java.lang.Object obj26 = hashMap1.put((java.lang.Object) entryArray16, (java.lang.Object) hashMap20);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        boolean boolean3 = hashMap2.isEmpty();
        boolean boolean4 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        hashMap5.modCount = 0;
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = hashMap5.remove(obj8);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.modCount;
        int int12 = hashMap10.modCount;
        system.testclass.HashMap.Entry[] entryArray13 = hashMap10.table;
        hashMap5.table = entryArray13;
        java.lang.Object obj16 = hashMap2.put((java.lang.Object) hashMap5, (java.lang.Object) 100L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        int int2 = hashMap1.size();
        java.lang.Object obj4 = hashMap1.remove((java.lang.Object) (byte) 100);
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        hashMap0.modCount = (byte) -1;
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
        int int3 = hashMap0.size();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        int int6 = hashMap4.size();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        java.lang.Class<?> wildcardClass8 = hashMap7.getClass();
        java.lang.Object obj9 = hashMap4.get((java.lang.Object) hashMap7);
        java.lang.Class<?> wildcardClass10 = hashMap4.getClass();
        java.lang.Object obj11 = hashMap0.remove((java.lang.Object) hashMap4);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        boolean boolean13 = hashMap12.isEmpty();
        int int14 = hashMap12.size();
        boolean boolean15 = hashMap12.isEmpty();
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int19 = hashMap18.modCount;
        java.lang.Object obj20 = hashMap12.remove((java.lang.Object) int19);
        int int21 = hashMap12.modCount;
        system.testclass.HashMap.Entry[] entryArray22 = hashMap12.table;
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap(0);
        java.lang.Object obj28 = hashMap25.get((java.lang.Object) hashMap27);
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        int int32 = hashMap31.modCount;
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        int int34 = hashMap33.size();
        system.testclass.HashMap.Entry[] entryArray35 = hashMap33.table;
        system.testclass.HashMap.Entry[] entryArray36 = new system.testclass.HashMap.Entry[] {};
        hashMap33.table = entryArray36;
        hashMap31.table = entryArray36;
        hashMap25.table = entryArray36;
        java.lang.Object obj40 = hashMap4.put((java.lang.Object) entryArray22, (java.lang.Object) hashMap25);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap4", hashMap4.repOK_1());
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        int int2 = hashMap1.size();
        java.lang.Object obj4 = hashMap1.get((java.lang.Object) 100L);
        int int5 = hashMap1.modCount;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        int int8 = hashMap6.size();
        boolean boolean9 = hashMap6.isEmpty();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int13 = hashMap12.modCount;
        java.lang.Object obj14 = hashMap6.remove((java.lang.Object) int13);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        hashMap15.modCount = 0;
        boolean boolean18 = hashMap15.isEmpty();
        int int19 = hashMap15.size();
        java.lang.Object obj20 = hashMap6.get((java.lang.Object) hashMap15);
        java.lang.Object obj21 = hashMap1.get((java.lang.Object) hashMap6);
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        boolean boolean3 = hashMap2.isEmpty();
        boolean boolean4 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.size();
        system.testclass.HashMap.Entry[] entryArray7 = hashMap5.table;
        system.testclass.HashMap.Entry[] entryArray8 = new system.testclass.HashMap.Entry[] {};
        hashMap5.table = entryArray8;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap(0, (float) 10);
        java.lang.Object obj13 = hashMap2.put((java.lang.Object) entryArray8, (java.lang.Object) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        java.lang.Class<?> wildcardClass4 = hashMap3.getClass();
        java.lang.Object obj5 = hashMap0.get((java.lang.Object) hashMap3);
        int int6 = hashMap0.size();
        int int7 = hashMap0.modCount;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int11 = hashMap10.modCount;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray20 = hashMap19.table;
        hashMap15.table = entryArray20;
        java.lang.Object obj22 = hashMap14.remove((java.lang.Object) entryArray20);
        hashMap10.table = entryArray20;
        java.lang.Object obj24 = hashMap0.get((java.lang.Object) hashMap10);
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '#', (float) 'a');
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray6 = hashMap5.table;
        hashMap2.table = entryArray6;
        hashMap2.modCount = (byte) 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int3 = hashMap2.modCount;
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        hashMap0.modCount = (short) 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        int int3 = hashMap2.modCount;
        system.testclass.HashMap.Entry[] entryArray4 = hashMap2.table;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        system.testclass.HashMap.Entry[] entryArray8 = hashMap5.table;
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = hashMap2.put((java.lang.Object) hashMap5, obj9);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap((int) '4', (float) 10L);
        boolean boolean9 = hashMap8.isEmpty();
        boolean boolean10 = hashMap8.isEmpty();
        system.testclass.HashMap.Entry[] entryArray11 = hashMap8.table;
        system.testclass.HashMap.Entry[] entryArray12 = hashMap8.table;
        java.lang.Object obj13 = hashMap2.put((java.lang.Object) '4', (java.lang.Object) entryArray12);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) 'a', (float) (byte) 1);
        hashMap2.modCount = (short) 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        boolean boolean2 = hashMap1.isEmpty();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) 'a', (float) (byte) 1);
        java.lang.Object obj6 = hashMap1.remove((java.lang.Object) hashMap5);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray10 = hashMap9.table;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray16 = hashMap15.table;
        java.lang.Object obj17 = hashMap11.remove((java.lang.Object) entryArray16);
        hashMap9.table = entryArray16;
        hashMap1.table = entryArray16;
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        int int2 = hashMap1.size();
        java.lang.Object obj4 = hashMap1.get((java.lang.Object) 100L);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        hashMap5.modCount = 0;
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = hashMap5.remove(obj8);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.modCount;
        int int12 = hashMap10.modCount;
        system.testclass.HashMap.Entry[] entryArray13 = hashMap10.table;
        hashMap5.table = entryArray13;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap(0);
        int int17 = hashMap16.size();
        java.lang.Object obj19 = hashMap16.get((java.lang.Object) 100L);
        int int20 = hashMap16.modCount;
        int int21 = hashMap16.modCount;
        java.lang.Object obj22 = hashMap1.put((java.lang.Object) hashMap5, (java.lang.Object) int21);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.size();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int5 = hashMap4.modCount;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.modCount;
        int int10 = hashMap8.modCount;
        system.testclass.HashMap.Entry[] entryArray11 = hashMap8.table;
        java.lang.Object obj12 = hashMap6.get((java.lang.Object) entryArray11);
        hashMap4.table = entryArray11;
        hashMap0.table = entryArray11;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap((int) '#', (float) 'a');
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray21 = hashMap20.table;
        hashMap17.table = entryArray21;
        java.lang.Object obj23 = hashMap0.get((java.lang.Object) hashMap17);
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap((int) (short) 10, (float) 1);
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap(0);
        java.lang.Object obj32 = hashMap29.get((java.lang.Object) hashMap31);
        boolean boolean33 = hashMap29.isEmpty();
        java.lang.Object obj34 = hashMap26.remove((java.lang.Object) hashMap29);
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap((int) '4', (float) 10L);
        boolean boolean38 = hashMap37.isEmpty();
        system.testclass.HashMap.Entry[] entryArray39 = hashMap37.table;
        java.lang.Object obj40 = hashMap0.put((java.lang.Object) hashMap29, (java.lang.Object) entryArray39);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap.Entry[] entryArray3 = new system.testclass.HashMap.Entry[] {};
        hashMap2.table = entryArray3;
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        int int2 = hashMap1.size();
        java.lang.Object obj4 = hashMap1.remove((java.lang.Object) (byte) 100);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        boolean boolean6 = hashMap5.isEmpty();
        java.lang.Object obj7 = hashMap1.remove((java.lang.Object) hashMap5);
        boolean boolean8 = hashMap1.isEmpty();
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.size();
        int int2 = hashMap0.modCount;
        int int3 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray4 = hashMap0.table;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray8 = hashMap7.table;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray14 = hashMap13.table;
        java.lang.Object obj15 = hashMap9.remove((java.lang.Object) entryArray14);
        hashMap7.table = entryArray14;
        java.lang.Object obj17 = hashMap0.get((java.lang.Object) hashMap7);
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap(0);
        java.lang.Object obj23 = hashMap20.get((java.lang.Object) hashMap22);
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.modCount;
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray29 = hashMap28.table;
        hashMap24.table = entryArray29;
        hashMap20.table = entryArray29;
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap(0);
        int int34 = hashMap33.size();
        java.lang.Object obj36 = hashMap33.remove((java.lang.Object) (byte) 100);
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        boolean boolean38 = hashMap37.isEmpty();
        java.lang.Object obj39 = hashMap33.remove((java.lang.Object) hashMap37);
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap((int) (short) 100);
        java.lang.Object obj42 = hashMap37.remove((java.lang.Object) hashMap41);
        java.lang.Object obj43 = hashMap0.put((java.lang.Object) entryArray29, (java.lang.Object) hashMap37);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        boolean boolean4 = hashMap0.isEmpty();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap0.table;
        hashMap0.modCount = '#';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 100);
        system.testclass.HashMap.Entry[] entryArray2 = hashMap1.table;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap(0);
        java.lang.Object obj8 = hashMap5.get((java.lang.Object) hashMap7);
        int int9 = hashMap7.size();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        int int12 = hashMap10.size();
        boolean boolean13 = hashMap10.isEmpty();
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int17 = hashMap16.modCount;
        java.lang.Object obj18 = hashMap10.remove((java.lang.Object) int17);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        hashMap19.modCount = 0;
        boolean boolean22 = hashMap19.isEmpty();
        int int23 = hashMap19.size();
        java.lang.Object obj24 = hashMap10.get((java.lang.Object) hashMap19);
        java.lang.Object obj25 = hashMap7.remove(obj24);
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        int int27 = hashMap26.modCount;
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray31 = hashMap30.table;
        java.lang.Object obj32 = hashMap26.remove((java.lang.Object) entryArray31);
        java.lang.Class<?> wildcardClass33 = hashMap26.getClass();
        java.lang.Object obj34 = hashMap7.remove((java.lang.Object) hashMap26);
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        int int36 = hashMap35.size();
        int int37 = hashMap35.modCount;
        int int38 = hashMap35.modCount;
        java.lang.Object obj39 = hashMap1.put((java.lang.Object) hashMap26, (java.lang.Object) int38);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap(0);
        int int4 = hashMap3.size();
        java.lang.Object obj6 = hashMap3.get((java.lang.Object) 100L);
        int int7 = hashMap3.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        int int10 = hashMap8.size();
        boolean boolean11 = hashMap8.isEmpty();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int15 = hashMap14.modCount;
        java.lang.Object obj16 = hashMap8.remove((java.lang.Object) int15);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        hashMap17.modCount = 0;
        boolean boolean20 = hashMap17.isEmpty();
        int int21 = hashMap17.size();
        java.lang.Object obj22 = hashMap8.get((java.lang.Object) hashMap17);
        java.lang.Object obj23 = hashMap3.get((java.lang.Object) hashMap8);
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.size();
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap(0);
        java.lang.Object obj31 = hashMap28.get((java.lang.Object) hashMap30);
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        int int33 = hashMap32.modCount;
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray37 = hashMap36.table;
        hashMap32.table = entryArray37;
        hashMap28.table = entryArray37;
        hashMap24.table = entryArray37;
        boolean boolean41 = hashMap24.isEmpty();
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap();
        int int43 = hashMap42.modCount;
        system.testclass.HashMap hashMap46 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray47 = hashMap46.table;
        hashMap42.table = entryArray47;
        hashMap24.table = entryArray47;
        java.lang.Object obj50 = hashMap0.put(obj23, (java.lang.Object) hashMap24);
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
        boolean boolean3 = hashMap0.isEmpty();
        int int4 = hashMap0.modCount;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        boolean boolean6 = hashMap5.isEmpty();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        int int9 = hashMap7.modCount;
        system.testclass.HashMap.Entry[] entryArray10 = hashMap7.table;
        java.lang.Object obj11 = hashMap5.get((java.lang.Object) entryArray10);
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap5);
        int int13 = hashMap5.modCount;
        hashMap5.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap5", hashMap5.repOK_1());
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        int int2 = hashMap1.size();
        java.lang.Object obj4 = hashMap1.get((java.lang.Object) 100L);
        int int5 = hashMap1.modCount;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        int int8 = hashMap6.size();
        boolean boolean9 = hashMap6.isEmpty();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int13 = hashMap12.modCount;
        java.lang.Object obj14 = hashMap6.remove((java.lang.Object) int13);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        hashMap15.modCount = 0;
        boolean boolean18 = hashMap15.isEmpty();
        int int19 = hashMap15.size();
        java.lang.Object obj20 = hashMap6.get((java.lang.Object) hashMap15);
        java.lang.Object obj21 = hashMap1.get((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap(100);
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.modCount;
        int int26 = hashMap24.modCount;
        int int27 = hashMap24.size();
        java.lang.Object obj28 = hashMap1.put((java.lang.Object) 100, (java.lang.Object) hashMap24);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object obj4 = hashMap2.remove(obj3);
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (short) 100);
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray8 = hashMap7.table;
        java.lang.Object obj9 = hashMap3.remove((java.lang.Object) entryArray8);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        int int12 = hashMap10.size();
        boolean boolean13 = hashMap10.isEmpty();
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int17 = hashMap16.modCount;
        java.lang.Object obj18 = hashMap10.remove((java.lang.Object) int17);
        int int19 = hashMap10.modCount;
        system.testclass.HashMap.Entry[] entryArray20 = hashMap10.table;
        java.lang.Object obj21 = hashMap3.get((java.lang.Object) hashMap10);
        hashMap3.modCount = (short) 0;
        java.lang.Object obj24 = hashMap0.remove((java.lang.Object) hashMap3);
        hashMap3.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap3", hashMap3.repOK_1());
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(1);
        hashMap1.modCount = 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        boolean boolean3 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int7 = hashMap6.modCount;
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) int7);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        hashMap9.modCount = 0;
        boolean boolean12 = hashMap9.isEmpty();
        int int13 = hashMap9.size();
        java.lang.Object obj14 = hashMap0.get((java.lang.Object) hashMap9);
        java.lang.Object obj16 = hashMap0.get((java.lang.Object) (byte) 10);
        hashMap0.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        int int3 = hashMap2.size();
        int int4 = hashMap2.size();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) '4', (float) 10L);
        boolean boolean8 = hashMap7.isEmpty();
        boolean boolean9 = hashMap7.isEmpty();
        system.testclass.HashMap.Entry[] entryArray10 = hashMap7.table;
        java.lang.Class<?> wildcardClass11 = hashMap7.getClass();
        java.lang.Object obj12 = hashMap1.put((java.lang.Object) hashMap2, (java.lang.Object) wildcardClass11);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        boolean boolean3 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int7 = hashMap6.modCount;
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) int7);
        int int9 = hashMap0.modCount;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.size();
        system.testclass.HashMap.Entry[] entryArray12 = hashMap10.table;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        boolean boolean14 = hashMap13.isEmpty();
        java.lang.Object obj15 = hashMap10.remove((java.lang.Object) hashMap13);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        int int17 = hashMap16.modCount;
        int int18 = hashMap16.modCount;
        system.testclass.HashMap.Entry[] entryArray19 = hashMap16.table;
        hashMap10.table = entryArray19;
        java.lang.Object obj21 = hashMap0.get((java.lang.Object) hashMap10);
        int int22 = hashMap0.size();
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap((int) (short) 0);
        int int25 = hashMap24.size();
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj29 = new java.lang.Object();
        java.lang.Object obj30 = hashMap28.remove(obj29);
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap(0);
        java.lang.Object obj36 = hashMap33.get((java.lang.Object) hashMap35);
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        int int38 = hashMap37.modCount;
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray42 = hashMap41.table;
        hashMap37.table = entryArray42;
        hashMap33.table = entryArray42;
        hashMap28.table = entryArray42;
        java.lang.Object obj46 = hashMap0.put((java.lang.Object) hashMap24, (java.lang.Object) hashMap28);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap(0);
        java.lang.Object obj5 = hashMap2.get((java.lang.Object) hashMap4);
        int int6 = hashMap2.modCount;
        int int7 = hashMap2.modCount;
        boolean boolean8 = hashMap2.isEmpty();
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int3 = hashMap2.modCount;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray12 = hashMap11.table;
        hashMap7.table = entryArray12;
        java.lang.Object obj14 = hashMap6.remove((java.lang.Object) entryArray12);
        hashMap2.table = entryArray12;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        boolean boolean17 = hashMap16.isEmpty();
        int int18 = hashMap16.size();
        java.lang.Object obj19 = hashMap2.remove((java.lang.Object) int18);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap((int) '4', (float) 10L);
        boolean boolean23 = hashMap22.isEmpty();
        system.testclass.HashMap.Entry[] entryArray24 = hashMap22.table;
        hashMap2.table = entryArray24;
        system.testclass.HashMap.Entry[] entryArray26 = hashMap2.table;
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        int int28 = hashMap27.modCount;
        int int29 = hashMap27.modCount;
        int int30 = hashMap27.size();
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        boolean boolean32 = hashMap31.isEmpty();
        int int33 = hashMap31.size();
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        java.lang.Class<?> wildcardClass35 = hashMap34.getClass();
        java.lang.Object obj36 = hashMap31.get((java.lang.Object) hashMap34);
        java.lang.Class<?> wildcardClass37 = hashMap31.getClass();
        java.lang.Object obj38 = hashMap27.remove((java.lang.Object) hashMap31);
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap(0);
        int int41 = hashMap40.size();
        java.lang.Object obj42 = hashMap2.put(obj38, (java.lang.Object) hashMap40);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.size();
        int int2 = hashMap0.modCount;
        int int3 = hashMap0.modCount;
        hashMap0.modCount = 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap(0);
        java.lang.Object obj5 = hashMap2.get((java.lang.Object) hashMap4);
        int int6 = hashMap4.size();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        int int9 = hashMap7.size();
        boolean boolean10 = hashMap7.isEmpty();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int14 = hashMap13.modCount;
        java.lang.Object obj15 = hashMap7.remove((java.lang.Object) int14);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        hashMap16.modCount = 0;
        boolean boolean19 = hashMap16.isEmpty();
        int int20 = hashMap16.size();
        java.lang.Object obj21 = hashMap7.get((java.lang.Object) hashMap16);
        java.lang.Object obj22 = hashMap4.remove(obj21);
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        boolean boolean24 = hashMap23.isEmpty();
        int int25 = hashMap23.size();
        boolean boolean26 = hashMap23.isEmpty();
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int30 = hashMap29.modCount;
        java.lang.Object obj31 = hashMap23.remove((java.lang.Object) int30);
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        hashMap32.modCount = 0;
        boolean boolean35 = hashMap32.isEmpty();
        int int36 = hashMap32.size();
        java.lang.Object obj37 = hashMap23.get((java.lang.Object) hashMap32);
        int int38 = hashMap23.size();
        java.lang.Object obj39 = hashMap4.remove((java.lang.Object) hashMap23);
        hashMap4.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap4", hashMap4.repOK_1());
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap(0);
        java.lang.Object obj5 = hashMap2.get((java.lang.Object) hashMap4);
        int int6 = hashMap4.size();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        int int9 = hashMap7.size();
        boolean boolean10 = hashMap7.isEmpty();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int14 = hashMap13.modCount;
        java.lang.Object obj15 = hashMap7.remove((java.lang.Object) int14);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        hashMap16.modCount = 0;
        boolean boolean19 = hashMap16.isEmpty();
        int int20 = hashMap16.size();
        java.lang.Object obj21 = hashMap7.get((java.lang.Object) hashMap16);
        java.lang.Object obj22 = hashMap4.remove(obj21);
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        boolean boolean24 = hashMap23.isEmpty();
        int int25 = hashMap23.size();
        boolean boolean26 = hashMap23.isEmpty();
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int30 = hashMap29.modCount;
        java.lang.Object obj31 = hashMap23.remove((java.lang.Object) int30);
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        hashMap32.modCount = 0;
        boolean boolean35 = hashMap32.isEmpty();
        int int36 = hashMap32.size();
        java.lang.Object obj37 = hashMap23.get((java.lang.Object) hashMap32);
        int int38 = hashMap23.size();
        java.lang.Object obj39 = hashMap4.remove((java.lang.Object) hashMap23);
        system.testclass.HashMap.Entry[] entryArray40 = hashMap23.table;
        hashMap23.modCount = (byte) 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap23", hashMap23.repOK_1());
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        boolean boolean3 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int7 = hashMap6.modCount;
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) int7);
        int int9 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray10 = hashMap0.table;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.size();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int5 = hashMap4.modCount;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.modCount;
        int int10 = hashMap8.modCount;
        system.testclass.HashMap.Entry[] entryArray11 = hashMap8.table;
        java.lang.Object obj12 = hashMap6.get((java.lang.Object) entryArray11);
        hashMap4.table = entryArray11;
        hashMap0.table = entryArray11;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.size();
        system.testclass.HashMap.Entry[] entryArray17 = hashMap15.table;
        hashMap15.modCount = 0;
        int int20 = hashMap15.size();
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        java.lang.Object obj23 = hashMap21.get((java.lang.Object) 0.0f);
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray27 = hashMap26.table;
        hashMap21.table = entryArray27;
        hashMap15.table = entryArray27;
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap(0);
        boolean boolean32 = hashMap31.isEmpty();
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap((int) 'a', (float) (byte) 1);
        java.lang.Object obj36 = hashMap31.remove((java.lang.Object) hashMap35);
        java.lang.Object obj37 = hashMap0.put((java.lang.Object) hashMap15, obj36);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        boolean boolean3 = hashMap0.isEmpty();
        hashMap0.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int3 = hashMap2.modCount;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray12 = hashMap11.table;
        hashMap7.table = entryArray12;
        java.lang.Object obj14 = hashMap6.remove((java.lang.Object) entryArray12);
        hashMap2.table = entryArray12;
        hashMap2.modCount = '#';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 10, (float) (byte) 10);
        hashMap2.modCount = 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '#', (float) 'a');
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap(0);
        java.lang.Object obj5 = hashMap2.get((java.lang.Object) hashMap4);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap((int) (byte) 100, (float) '#');
        system.testclass.HashMap.Entry[] entryArray9 = hashMap8.table;
        java.lang.Object obj10 = hashMap4.get((java.lang.Object) hashMap8);
        int int11 = hashMap8.modCount;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int15 = hashMap14.modCount;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        int int20 = hashMap19.modCount;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray24 = hashMap23.table;
        hashMap19.table = entryArray24;
        java.lang.Object obj26 = hashMap18.remove((java.lang.Object) entryArray24);
        hashMap14.table = entryArray24;
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        boolean boolean29 = hashMap28.isEmpty();
        int int30 = hashMap28.size();
        java.lang.Object obj31 = hashMap14.remove((java.lang.Object) int30);
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap((int) '4', (float) 10L);
        boolean boolean35 = hashMap34.isEmpty();
        hashMap34.modCount = 0;
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int41 = hashMap40.modCount;
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        int int46 = hashMap45.modCount;
        system.testclass.HashMap hashMap49 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray50 = hashMap49.table;
        hashMap45.table = entryArray50;
        java.lang.Object obj52 = hashMap44.remove((java.lang.Object) entryArray50);
        hashMap40.table = entryArray50;
        hashMap34.table = entryArray50;
        hashMap14.table = entryArray50;
        system.testclass.HashMap hashMap57 = new system.testclass.HashMap(0);
        int int58 = hashMap57.size();
        int int59 = hashMap57.size();
        int int60 = hashMap57.size();
        java.lang.Object obj61 = hashMap14.get((java.lang.Object) hashMap57);
        system.testclass.HashMap hashMap64 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int65 = hashMap64.modCount;
        system.testclass.HashMap hashMap68 = new system.testclass.HashMap((int) '4', (float) 10L);
        boolean boolean69 = hashMap68.isEmpty();
        hashMap68.modCount = 0;
        system.testclass.HashMap hashMap74 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int75 = hashMap74.modCount;
        system.testclass.HashMap hashMap78 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap79 = new system.testclass.HashMap();
        int int80 = hashMap79.modCount;
        system.testclass.HashMap hashMap83 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray84 = hashMap83.table;
        hashMap79.table = entryArray84;
        java.lang.Object obj86 = hashMap78.remove((java.lang.Object) entryArray84);
        hashMap74.table = entryArray84;
        hashMap68.table = entryArray84;
        hashMap64.table = entryArray84;
        system.testclass.HashMap hashMap90 = new system.testclass.HashMap();
        boolean boolean91 = hashMap90.isEmpty();
        int int92 = hashMap90.size();
        boolean boolean93 = hashMap90.isEmpty();
        java.lang.Object obj94 = hashMap64.remove((java.lang.Object) hashMap90);
        java.lang.Object obj95 = hashMap8.put(obj61, (java.lang.Object) hashMap64);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap8", hashMap8.repOK_1());
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 100, (float) (byte) 100);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        int int5 = hashMap3.size();
        boolean boolean6 = hashMap3.isEmpty();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int10 = hashMap9.modCount;
        java.lang.Object obj11 = hashMap3.remove((java.lang.Object) int10);
        int int12 = hashMap3.modCount;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap((int) '#');
        java.lang.Object obj15 = hashMap2.put((java.lang.Object) int12, (java.lang.Object) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.size();
        int int2 = hashMap0.modCount;
        int int3 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray4 = hashMap0.table;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray3 = hashMap2.table;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray9 = hashMap8.table;
        java.lang.Object obj10 = hashMap4.remove((java.lang.Object) entryArray9);
        hashMap2.table = entryArray9;
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 100, (float) '#');
        boolean boolean3 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int7 = hashMap6.modCount;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray16 = hashMap15.table;
        hashMap11.table = entryArray16;
        java.lang.Object obj18 = hashMap10.remove((java.lang.Object) entryArray16);
        hashMap6.table = entryArray16;
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        boolean boolean21 = hashMap20.isEmpty();
        int int22 = hashMap20.size();
        java.lang.Object obj23 = hashMap6.remove((java.lang.Object) int22);
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap((int) '4', (float) 10L);
        boolean boolean27 = hashMap26.isEmpty();
        hashMap26.modCount = 0;
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int33 = hashMap32.modCount;
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        int int38 = hashMap37.modCount;
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray42 = hashMap41.table;
        hashMap37.table = entryArray42;
        java.lang.Object obj44 = hashMap36.remove((java.lang.Object) entryArray42);
        hashMap32.table = entryArray42;
        hashMap26.table = entryArray42;
        hashMap6.table = entryArray42;
        system.testclass.HashMap hashMap49 = new system.testclass.HashMap(0);
        int int50 = hashMap49.size();
        int int51 = hashMap49.size();
        int int52 = hashMap49.size();
        java.lang.Object obj53 = hashMap6.get((java.lang.Object) hashMap49);
        system.testclass.HashMap hashMap55 = new system.testclass.HashMap(0);
        boolean boolean56 = hashMap55.isEmpty();
        java.lang.Object obj57 = hashMap2.put((java.lang.Object) hashMap6, (java.lang.Object) hashMap55);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap(0);
        java.lang.Object obj5 = hashMap2.get((java.lang.Object) hashMap4);
        boolean boolean6 = hashMap2.isEmpty();
        java.lang.Object obj7 = null;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) '4', (float) 10L);
        boolean boolean11 = hashMap10.isEmpty();
        hashMap10.modCount = 0;
        boolean boolean14 = hashMap10.isEmpty();
        java.lang.Object obj15 = hashMap2.put(obj7, (java.lang.Object) boolean14);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 10, (float) 1);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap(0);
        java.lang.Object obj8 = hashMap5.get((java.lang.Object) hashMap7);
        boolean boolean9 = hashMap5.isEmpty();
        java.lang.Object obj10 = hashMap2.remove((java.lang.Object) hashMap5);
        hashMap5.modCount = (short) 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap5", hashMap5.repOK_1());
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = hashMap1.remove(obj2);
        int int4 = hashMap1.modCount;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        boolean boolean6 = hashMap5.isEmpty();
        int int7 = hashMap5.size();
        boolean boolean8 = hashMap5.isEmpty();
        system.testclass.HashMap.Entry[] entryArray9 = hashMap5.table;
        hashMap1.table = entryArray9;
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(10, (float) 10L);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.size();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap3.table;
        system.testclass.HashMap.Entry[] entryArray6 = new system.testclass.HashMap.Entry[] {};
        hashMap3.table = entryArray6;
        java.lang.Class<?> wildcardClass8 = hashMap3.getClass();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        int int11 = hashMap9.size();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        java.lang.Class<?> wildcardClass13 = hashMap12.getClass();
        java.lang.Object obj14 = hashMap9.get((java.lang.Object) hashMap12);
        java.lang.Class<?> wildcardClass15 = hashMap9.getClass();
        java.lang.Object obj16 = hashMap2.put((java.lang.Object) hashMap3, (java.lang.Object) hashMap9);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) '#');
        boolean boolean2 = hashMap1.isEmpty();
        java.lang.Object obj3 = null;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap(0);
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object obj7 = hashMap5.remove(obj6);
        java.lang.Object obj8 = hashMap1.put(obj3, obj6);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        boolean boolean3 = hashMap0.isEmpty();
        int int4 = hashMap0.modCount;
        hashMap0.modCount = 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap(0);
        java.lang.Object obj5 = hashMap2.get((java.lang.Object) hashMap4);
        system.testclass.HashMap.Entry[] entryArray6 = hashMap2.table;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        int int10 = hashMap9.modCount;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.size();
        system.testclass.HashMap.Entry[] entryArray13 = hashMap11.table;
        system.testclass.HashMap.Entry[] entryArray14 = new system.testclass.HashMap.Entry[] {};
        hashMap11.table = entryArray14;
        hashMap9.table = entryArray14;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap(0);
        java.lang.Object obj22 = hashMap19.get((java.lang.Object) hashMap21);
        int int23 = hashMap21.size();
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        boolean boolean25 = hashMap24.isEmpty();
        int int26 = hashMap24.size();
        boolean boolean27 = hashMap24.isEmpty();
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int31 = hashMap30.modCount;
        java.lang.Object obj32 = hashMap24.remove((java.lang.Object) int31);
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        hashMap33.modCount = 0;
        boolean boolean36 = hashMap33.isEmpty();
        int int37 = hashMap33.size();
        java.lang.Object obj38 = hashMap24.get((java.lang.Object) hashMap33);
        java.lang.Object obj39 = hashMap21.remove(obj38);
        int int40 = hashMap21.modCount;
        java.lang.Object obj41 = hashMap2.put((java.lang.Object) entryArray14, (java.lang.Object) int40);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        int int2 = hashMap1.size();
        java.lang.Object obj4 = hashMap1.get((java.lang.Object) 100L);
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) '#');
        boolean boolean2 = hashMap1.isEmpty();
        hashMap1.modCount = ' ';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        boolean boolean3 = hashMap0.isEmpty();
        int int4 = hashMap0.modCount;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        boolean boolean6 = hashMap5.isEmpty();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        int int9 = hashMap7.modCount;
        system.testclass.HashMap.Entry[] entryArray10 = hashMap7.table;
        java.lang.Object obj11 = hashMap5.get((java.lang.Object) entryArray10);
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap5);
        system.testclass.HashMap.Entry[] entryArray13 = hashMap5.table;
        hashMap5.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap5", hashMap5.repOK_1());
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = hashMap1.remove(obj2);
        int int4 = hashMap1.modCount;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        boolean boolean6 = hashMap5.isEmpty();
        int int7 = hashMap5.size();
        boolean boolean8 = hashMap5.isEmpty();
        system.testclass.HashMap.Entry[] entryArray9 = hashMap5.table;
        hashMap1.table = entryArray9;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap(0);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Object obj15 = hashMap13.remove(obj14);
        int int16 = hashMap13.modCount;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        boolean boolean18 = hashMap17.isEmpty();
        int int19 = hashMap17.size();
        boolean boolean20 = hashMap17.isEmpty();
        system.testclass.HashMap.Entry[] entryArray21 = hashMap17.table;
        hashMap13.table = entryArray21;
        java.lang.Class<?> wildcardClass23 = hashMap13.getClass();
        java.lang.Object obj24 = hashMap1.put((java.lang.Object) "hi!", (java.lang.Object) hashMap13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap(0);
        java.lang.Object obj5 = hashMap2.get((java.lang.Object) hashMap4);
        system.testclass.HashMap.Entry[] entryArray6 = hashMap2.table;
        boolean boolean7 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap(0);
        int int10 = hashMap9.size();
        java.lang.Object obj12 = hashMap9.get((java.lang.Object) 100L);
        int int13 = hashMap9.size();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.modCount;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray19 = hashMap18.table;
        java.lang.Object obj20 = hashMap14.remove((java.lang.Object) entryArray19);
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap(0);
        java.lang.Object obj26 = hashMap23.get((java.lang.Object) hashMap25);
        int int27 = hashMap23.modCount;
        java.lang.Object obj28 = hashMap14.remove((java.lang.Object) int27);
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Object obj33 = hashMap31.remove(obj32);
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap(0);
        java.lang.Object obj39 = hashMap36.get((java.lang.Object) hashMap38);
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        int int41 = hashMap40.modCount;
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray45 = hashMap44.table;
        hashMap40.table = entryArray45;
        hashMap36.table = entryArray45;
        hashMap31.table = entryArray45;
        java.lang.Object obj49 = hashMap14.get((java.lang.Object) entryArray45);
        system.testclass.HashMap hashMap50 = new system.testclass.HashMap();
        java.lang.Object obj52 = hashMap50.get((java.lang.Object) 0.0f);
        system.testclass.HashMap hashMap55 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray56 = hashMap55.table;
        hashMap50.table = entryArray56;
        hashMap14.table = entryArray56;
        java.lang.Object obj59 = hashMap9.remove((java.lang.Object) hashMap14);
        system.testclass.HashMap hashMap61 = new system.testclass.HashMap(0);
        java.lang.Object obj62 = new java.lang.Object();
        java.lang.Object obj63 = hashMap61.remove(obj62);
        int int64 = hashMap61.modCount;
        system.testclass.HashMap hashMap65 = new system.testclass.HashMap();
        boolean boolean66 = hashMap65.isEmpty();
        int int67 = hashMap65.size();
        boolean boolean68 = hashMap65.isEmpty();
        system.testclass.HashMap.Entry[] entryArray69 = hashMap65.table;
        hashMap61.table = entryArray69;
        java.lang.Class<?> wildcardClass71 = hashMap61.getClass();
        java.lang.Object obj72 = hashMap2.put((java.lang.Object) hashMap9, (java.lang.Object) wildcardClass71);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        int int3 = hashMap2.modCount;
        int int4 = hashMap2.modCount;
        system.testclass.HashMap.Entry[] entryArray5 = hashMap2.table;
        java.lang.Object obj6 = hashMap0.get((java.lang.Object) entryArray5);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int10 = hashMap9.modCount;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.modCount;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray19 = hashMap18.table;
        hashMap14.table = entryArray19;
        java.lang.Object obj21 = hashMap13.remove((java.lang.Object) entryArray19);
        hashMap9.table = entryArray19;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        boolean boolean24 = hashMap23.isEmpty();
        int int25 = hashMap23.size();
        java.lang.Object obj26 = hashMap9.remove((java.lang.Object) int25);
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap((int) '4', (float) 10L);
        boolean boolean30 = hashMap29.isEmpty();
        hashMap29.modCount = 0;
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int36 = hashMap35.modCount;
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        int int41 = hashMap40.modCount;
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray45 = hashMap44.table;
        hashMap40.table = entryArray45;
        java.lang.Object obj47 = hashMap39.remove((java.lang.Object) entryArray45);
        hashMap35.table = entryArray45;
        hashMap29.table = entryArray45;
        hashMap9.table = entryArray45;
        java.lang.Object obj52 = hashMap0.put((java.lang.Object) entryArray45, (java.lang.Object) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        boolean boolean3 = hashMap2.isEmpty();
        hashMap2.modCount = 0;
        boolean boolean6 = hashMap2.isEmpty();
        system.testclass.HashMap.Entry[] entryArray7 = hashMap2.table;
        int int8 = hashMap2.modCount;
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray2 = hashMap0.table;
        system.testclass.HashMap.Entry[] entryArray3 = new system.testclass.HashMap.Entry[] {};
        hashMap0.table = entryArray3;
        int int5 = hashMap0.size();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.modCount;
        int int10 = hashMap8.modCount;
        system.testclass.HashMap.Entry[] entryArray11 = hashMap8.table;
        java.lang.Object obj12 = hashMap6.get((java.lang.Object) entryArray11);
        hashMap0.table = entryArray11;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap((int) (byte) 1);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        boolean boolean17 = hashMap16.isEmpty();
        int int18 = hashMap16.size();
        system.testclass.HashMap.Entry[] entryArray19 = hashMap16.table;
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap(0);
        java.lang.Object obj25 = hashMap22.get((java.lang.Object) hashMap24);
        int int26 = hashMap22.modCount;
        int int27 = hashMap22.modCount;
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap(0);
        boolean boolean30 = hashMap29.isEmpty();
        system.testclass.HashMap.Entry[] entryArray31 = hashMap29.table;
        java.lang.Object obj32 = hashMap22.get((java.lang.Object) hashMap29);
        java.lang.Object obj33 = hashMap16.remove((java.lang.Object) hashMap22);
        java.lang.Object obj34 = hashMap0.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMap22);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        int int2 = hashMap1.size();
        java.lang.Object obj4 = hashMap1.remove((java.lang.Object) (byte) 100);
        boolean boolean5 = hashMap1.isEmpty();
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        int int2 = hashMap1.size();
        java.lang.Object obj4 = hashMap1.get((java.lang.Object) 100L);
        int int5 = hashMap1.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap(100, (float) 1L);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap.Entry[] entryArray11 = hashMap10.table;
        java.lang.Object obj12 = hashMap1.put((java.lang.Object) 100, (java.lang.Object) hashMap10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.size();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int5 = hashMap4.modCount;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.modCount;
        int int10 = hashMap8.modCount;
        system.testclass.HashMap.Entry[] entryArray11 = hashMap8.table;
        java.lang.Object obj12 = hashMap6.get((java.lang.Object) entryArray11);
        hashMap4.table = entryArray11;
        hashMap0.table = entryArray11;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap((int) '#', (float) 'a');
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray21 = hashMap20.table;
        hashMap17.table = entryArray21;
        java.lang.Object obj23 = hashMap0.get((java.lang.Object) hashMap17);
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray2 = hashMap0.table;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        int int4 = hashMap0.size();
        hashMap0.modCount = 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) ' ', (float) (byte) 100);
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        boolean boolean3 = hashMap0.isEmpty();
        int int4 = hashMap0.size();
        int int5 = hashMap0.size();
        hashMap0.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray5 = hashMap4.table;
        java.lang.Object obj6 = hashMap0.remove((java.lang.Object) entryArray5);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap(0);
        java.lang.Object obj12 = hashMap9.get((java.lang.Object) hashMap11);
        int int13 = hashMap9.modCount;
        java.lang.Object obj14 = hashMap0.remove((java.lang.Object) int13);
        hashMap0.modCount = '4';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int3 = hashMap2.modCount;
        boolean boolean4 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) '#', (float) (short) 100);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        int int10 = hashMap8.size();
        boolean boolean11 = hashMap8.isEmpty();
        system.testclass.HashMap.Entry[] entryArray12 = hashMap8.table;
        java.lang.Object obj13 = hashMap2.put((java.lang.Object) hashMap7, (java.lang.Object) hashMap8);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        boolean boolean3 = hashMap2.isEmpty();
        hashMap2.modCount = 0;
        boolean boolean6 = hashMap2.isEmpty();
        int int7 = hashMap2.size();
        hashMap2.modCount = 'a';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        hashMap2.modCount = (byte) 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        java.lang.Class<?> wildcardClass4 = hashMap3.getClass();
        java.lang.Object obj5 = hashMap0.get((java.lang.Object) hashMap3);
        int int6 = hashMap0.size();
        int int7 = hashMap0.modCount;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int11 = hashMap10.modCount;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray20 = hashMap19.table;
        hashMap15.table = entryArray20;
        java.lang.Object obj22 = hashMap14.remove((java.lang.Object) entryArray20);
        hashMap10.table = entryArray20;
        java.lang.Object obj24 = hashMap0.get((java.lang.Object) hashMap10);
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        hashMap25.modCount = 0;
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int31 = hashMap30.modCount;
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        int int36 = hashMap35.modCount;
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray40 = hashMap39.table;
        hashMap35.table = entryArray40;
        java.lang.Object obj42 = hashMap34.remove((java.lang.Object) entryArray40);
        hashMap30.table = entryArray40;
        java.lang.Object obj44 = hashMap25.remove((java.lang.Object) hashMap30);
        java.lang.Object obj45 = null;
        java.lang.Object obj46 = hashMap0.put((java.lang.Object) hashMap25, obj45);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        int int2 = hashMap1.size();
        java.lang.Object obj4 = hashMap1.remove((java.lang.Object) (byte) 100);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        boolean boolean6 = hashMap5.isEmpty();
        java.lang.Object obj7 = hashMap1.remove((java.lang.Object) hashMap5);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        int int11 = hashMap10.modCount;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        int int13 = hashMap12.size();
        system.testclass.HashMap.Entry[] entryArray14 = hashMap12.table;
        system.testclass.HashMap.Entry[] entryArray15 = new system.testclass.HashMap.Entry[] {};
        hashMap12.table = entryArray15;
        hashMap10.table = entryArray15;
        java.lang.Object obj18 = hashMap1.get((java.lang.Object) hashMap10);
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray2 = hashMap0.table;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        int int5 = hashMap3.size();
        boolean boolean6 = hashMap3.isEmpty();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int10 = hashMap9.modCount;
        java.lang.Object obj11 = hashMap3.remove((java.lang.Object) int10);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        hashMap12.modCount = 0;
        boolean boolean15 = hashMap12.isEmpty();
        int int16 = hashMap12.size();
        java.lang.Object obj17 = hashMap3.get((java.lang.Object) hashMap12);
        boolean boolean18 = hashMap12.isEmpty();
        int int19 = hashMap12.modCount;
        java.lang.Object obj20 = hashMap0.remove((java.lang.Object) hashMap12);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap((int) '#');
        boolean boolean23 = hashMap22.isEmpty();
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap((int) '4', (float) 10L);
        boolean boolean27 = hashMap26.isEmpty();
        hashMap26.modCount = 0;
        boolean boolean30 = hashMap26.isEmpty();
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        boolean boolean32 = hashMap31.isEmpty();
        int int33 = hashMap31.size();
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        java.lang.Class<?> wildcardClass35 = hashMap34.getClass();
        java.lang.Object obj36 = hashMap31.get((java.lang.Object) hashMap34);
        int int37 = hashMap31.size();
        int int38 = hashMap31.modCount;
        java.lang.Object obj39 = hashMap26.get((java.lang.Object) int38);
        int int40 = hashMap26.modCount;
        java.lang.Object obj41 = hashMap0.put((java.lang.Object) boolean23, (java.lang.Object) int40);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray5 = hashMap4.table;
        java.lang.Object obj6 = hashMap0.remove((java.lang.Object) entryArray5);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        int int9 = hashMap7.size();
        boolean boolean10 = hashMap7.isEmpty();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int14 = hashMap13.modCount;
        java.lang.Object obj15 = hashMap7.remove((java.lang.Object) int14);
        int int16 = hashMap7.modCount;
        system.testclass.HashMap.Entry[] entryArray17 = hashMap7.table;
        java.lang.Object obj18 = hashMap0.get((java.lang.Object) hashMap7);
        hashMap0.modCount = (byte) 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        boolean boolean3 = hashMap0.isEmpty();
        int int4 = hashMap0.size();
        int int5 = hashMap0.size();
        hashMap0.modCount = (byte) 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        int int2 = hashMap1.size();
        java.lang.Object obj4 = hashMap1.remove((java.lang.Object) (byte) 100);
        hashMap1.modCount = 0;
        int int7 = hashMap1.size();
        hashMap1.modCount = (byte) 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int6 = hashMap5.modCount;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.modCount;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray15 = hashMap14.table;
        hashMap10.table = entryArray15;
        java.lang.Object obj17 = hashMap9.remove((java.lang.Object) entryArray15);
        hashMap5.table = entryArray15;
        java.lang.Object obj19 = hashMap0.remove((java.lang.Object) hashMap5);
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        hashMap20.modCount = 0;
        boolean boolean23 = hashMap20.isEmpty();
        int int24 = hashMap20.size();
        system.testclass.HashMap.Entry[] entryArray25 = hashMap20.table;
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        int int27 = hashMap26.size();
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap(0);
        java.lang.Object obj33 = hashMap30.get((java.lang.Object) hashMap32);
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        int int35 = hashMap34.modCount;
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray39 = hashMap38.table;
        hashMap34.table = entryArray39;
        hashMap30.table = entryArray39;
        hashMap26.table = entryArray39;
        boolean boolean43 = hashMap26.isEmpty();
        java.lang.Object obj44 = hashMap0.put((java.lang.Object) hashMap20, (java.lang.Object) hashMap26);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.size();
        int int2 = hashMap0.modCount;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.size();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int8 = hashMap7.modCount;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        int int13 = hashMap11.modCount;
        system.testclass.HashMap.Entry[] entryArray14 = hashMap11.table;
        java.lang.Object obj15 = hashMap9.get((java.lang.Object) entryArray14);
        hashMap7.table = entryArray14;
        hashMap3.table = entryArray14;
        java.lang.Object obj18 = hashMap0.get((java.lang.Object) hashMap3);
        int int19 = hashMap0.size();
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 1);
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap(0);
        java.lang.Object obj5 = hashMap2.get((java.lang.Object) hashMap4);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap(0);
        java.lang.Object obj11 = hashMap8.get((java.lang.Object) hashMap10);
        int int12 = hashMap10.size();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        boolean boolean14 = hashMap13.isEmpty();
        int int15 = hashMap13.size();
        boolean boolean16 = hashMap13.isEmpty();
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int20 = hashMap19.modCount;
        java.lang.Object obj21 = hashMap13.remove((java.lang.Object) int20);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        hashMap22.modCount = 0;
        boolean boolean25 = hashMap22.isEmpty();
        int int26 = hashMap22.size();
        java.lang.Object obj27 = hashMap13.get((java.lang.Object) hashMap22);
        java.lang.Object obj28 = hashMap10.remove(obj27);
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        boolean boolean30 = hashMap29.isEmpty();
        int int31 = hashMap29.size();
        boolean boolean32 = hashMap29.isEmpty();
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int36 = hashMap35.modCount;
        java.lang.Object obj37 = hashMap29.remove((java.lang.Object) int36);
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        hashMap38.modCount = 0;
        boolean boolean41 = hashMap38.isEmpty();
        int int42 = hashMap38.size();
        java.lang.Object obj43 = hashMap29.get((java.lang.Object) hashMap38);
        int int44 = hashMap29.size();
        java.lang.Object obj45 = hashMap10.remove((java.lang.Object) hashMap29);
        system.testclass.HashMap.Entry[] entryArray46 = hashMap29.table;
        java.lang.Object obj47 = hashMap4.get((java.lang.Object) hashMap29);
        hashMap29.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap29", hashMap29.repOK_1());
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 1, (float) ' ');
        int int3 = hashMap2.modCount;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray10 = hashMap9.table;
        java.lang.Object obj11 = hashMap5.remove((java.lang.Object) entryArray10);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap(0);
        java.lang.Object obj17 = hashMap14.get((java.lang.Object) hashMap16);
        int int18 = hashMap14.modCount;
        java.lang.Object obj19 = hashMap5.remove((java.lang.Object) int18);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Object obj24 = hashMap22.remove(obj23);
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap(0);
        java.lang.Object obj30 = hashMap27.get((java.lang.Object) hashMap29);
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        int int32 = hashMap31.modCount;
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray36 = hashMap35.table;
        hashMap31.table = entryArray36;
        hashMap27.table = entryArray36;
        hashMap22.table = entryArray36;
        java.lang.Object obj40 = hashMap5.get((java.lang.Object) entryArray36);
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        java.lang.Object obj43 = hashMap41.get((java.lang.Object) 0.0f);
        system.testclass.HashMap hashMap46 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray47 = hashMap46.table;
        hashMap41.table = entryArray47;
        hashMap5.table = entryArray47;
        int int50 = hashMap5.size();
        system.testclass.HashMap hashMap53 = new system.testclass.HashMap((int) '4', (float) 10L);
        boolean boolean54 = hashMap53.isEmpty();
        hashMap53.modCount = 0;
        system.testclass.HashMap hashMap59 = new system.testclass.HashMap((int) '4', (float) 10L);
        boolean boolean60 = hashMap59.isEmpty();
        hashMap59.modCount = 0;
        system.testclass.HashMap hashMap65 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray66 = hashMap65.table;
        system.testclass.HashMap hashMap67 = new system.testclass.HashMap();
        int int68 = hashMap67.modCount;
        system.testclass.HashMap hashMap71 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray72 = hashMap71.table;
        java.lang.Object obj73 = hashMap67.remove((java.lang.Object) entryArray72);
        hashMap65.table = entryArray72;
        hashMap59.table = entryArray72;
        java.lang.Object obj76 = hashMap53.remove((java.lang.Object) hashMap59);
        system.testclass.HashMap.Entry[] entryArray77 = hashMap53.table;
        java.lang.Object obj78 = hashMap5.get((java.lang.Object) entryArray77);
        java.lang.Object obj79 = hashMap2.put((java.lang.Object) (-1.0f), (java.lang.Object) hashMap5);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        java.lang.Object obj2 = hashMap0.get((java.lang.Object) 0.0f);
        java.lang.Object obj4 = hashMap0.get((java.lang.Object) 100);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap(0);
        int int7 = hashMap6.size();
        java.lang.Object obj9 = hashMap6.get((java.lang.Object) 100L);
        int int10 = hashMap6.size();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.size();
        system.testclass.HashMap.Entry[] entryArray13 = hashMap11.table;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        boolean boolean15 = hashMap14.isEmpty();
        java.lang.Object obj16 = hashMap11.remove((java.lang.Object) hashMap14);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        int int18 = hashMap17.modCount;
        int int19 = hashMap17.modCount;
        system.testclass.HashMap.Entry[] entryArray20 = hashMap17.table;
        hashMap11.table = entryArray20;
        hashMap6.table = entryArray20;
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int26 = hashMap25.modCount;
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        boolean boolean28 = hashMap27.isEmpty();
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        int int30 = hashMap29.modCount;
        int int31 = hashMap29.modCount;
        system.testclass.HashMap.Entry[] entryArray32 = hashMap29.table;
        java.lang.Object obj33 = hashMap27.get((java.lang.Object) entryArray32);
        hashMap25.table = entryArray32;
        hashMap6.table = entryArray32;
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap(0);
        java.lang.Object obj41 = hashMap38.get((java.lang.Object) hashMap40);
        int int42 = hashMap40.size();
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap();
        boolean boolean44 = hashMap43.isEmpty();
        int int45 = hashMap43.size();
        boolean boolean46 = hashMap43.isEmpty();
        system.testclass.HashMap hashMap49 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int50 = hashMap49.modCount;
        java.lang.Object obj51 = hashMap43.remove((java.lang.Object) int50);
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap();
        hashMap52.modCount = 0;
        boolean boolean55 = hashMap52.isEmpty();
        int int56 = hashMap52.size();
        java.lang.Object obj57 = hashMap43.get((java.lang.Object) hashMap52);
        java.lang.Object obj58 = hashMap40.remove(obj57);
        int int59 = hashMap40.modCount;
        java.lang.Object obj60 = hashMap0.put((java.lang.Object) entryArray32, (java.lang.Object) int59);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) (byte) 100);
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        int int2 = hashMap1.size();
        java.lang.Object obj4 = hashMap1.get((java.lang.Object) 100L);
        int int5 = hashMap1.size();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.modCount;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray11 = hashMap10.table;
        java.lang.Object obj12 = hashMap6.remove((java.lang.Object) entryArray11);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap(0);
        java.lang.Object obj18 = hashMap15.get((java.lang.Object) hashMap17);
        int int19 = hashMap15.modCount;
        java.lang.Object obj20 = hashMap6.remove((java.lang.Object) int19);
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj24 = new java.lang.Object();
        java.lang.Object obj25 = hashMap23.remove(obj24);
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap(0);
        java.lang.Object obj31 = hashMap28.get((java.lang.Object) hashMap30);
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        int int33 = hashMap32.modCount;
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray37 = hashMap36.table;
        hashMap32.table = entryArray37;
        hashMap28.table = entryArray37;
        hashMap23.table = entryArray37;
        java.lang.Object obj41 = hashMap6.get((java.lang.Object) entryArray37);
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap();
        java.lang.Object obj44 = hashMap42.get((java.lang.Object) 0.0f);
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray48 = hashMap47.table;
        hashMap42.table = entryArray48;
        hashMap6.table = entryArray48;
        java.lang.Object obj51 = hashMap1.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap54 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap56 = new system.testclass.HashMap(0);
        java.lang.Object obj57 = hashMap54.get((java.lang.Object) hashMap56);
        system.testclass.HashMap.Entry[] entryArray58 = hashMap54.table;
        hashMap6.table = entryArray58;
        system.testclass.HashMap hashMap60 = new system.testclass.HashMap();
        java.lang.Object obj62 = hashMap60.get((java.lang.Object) 0.0f);
        system.testclass.HashMap hashMap65 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray66 = hashMap65.table;
        hashMap60.table = entryArray66;
        system.testclass.HashMap hashMap68 = new system.testclass.HashMap();
        boolean boolean69 = hashMap68.isEmpty();
        int int70 = hashMap68.size();
        boolean boolean71 = hashMap68.isEmpty();
        int int72 = hashMap68.modCount;
        system.testclass.HashMap hashMap73 = new system.testclass.HashMap();
        boolean boolean74 = hashMap73.isEmpty();
        system.testclass.HashMap hashMap75 = new system.testclass.HashMap();
        int int76 = hashMap75.modCount;
        int int77 = hashMap75.modCount;
        system.testclass.HashMap.Entry[] entryArray78 = hashMap75.table;
        java.lang.Object obj79 = hashMap73.get((java.lang.Object) entryArray78);
        java.lang.Object obj80 = hashMap68.remove((java.lang.Object) hashMap73);
        system.testclass.HashMap.Entry[] entryArray81 = hashMap73.table;
        java.lang.Class<?> wildcardClass82 = hashMap73.getClass();
        java.lang.Object obj83 = hashMap6.put((java.lang.Object) hashMap60, (java.lang.Object) wildcardClass82);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap6", hashMap6.repOK_1());
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray8 = hashMap7.table;
        java.lang.Object obj9 = hashMap3.remove((java.lang.Object) entryArray8);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        int int12 = hashMap10.size();
        boolean boolean13 = hashMap10.isEmpty();
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int17 = hashMap16.modCount;
        java.lang.Object obj18 = hashMap10.remove((java.lang.Object) int17);
        int int19 = hashMap10.modCount;
        system.testclass.HashMap.Entry[] entryArray20 = hashMap10.table;
        java.lang.Object obj21 = hashMap3.get((java.lang.Object) hashMap10);
        hashMap3.modCount = (short) 0;
        java.lang.Object obj24 = hashMap0.remove((java.lang.Object) hashMap3);
        int int25 = hashMap0.size();
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap(0);
        java.lang.Object obj7 = hashMap4.get((java.lang.Object) hashMap6);
        int int8 = hashMap6.size();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        int int11 = hashMap9.size();
        boolean boolean12 = hashMap9.isEmpty();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int16 = hashMap15.modCount;
        java.lang.Object obj17 = hashMap9.remove((java.lang.Object) int16);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        hashMap18.modCount = 0;
        boolean boolean21 = hashMap18.isEmpty();
        int int22 = hashMap18.size();
        java.lang.Object obj23 = hashMap9.get((java.lang.Object) hashMap18);
        java.lang.Object obj24 = hashMap6.remove(obj23);
        java.lang.Object obj25 = hashMap0.remove((java.lang.Object) hashMap6);
        hashMap6.modCount = ' ';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap6", hashMap6.repOK_1());
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray5 = hashMap4.table;
        java.lang.Object obj6 = hashMap0.remove((java.lang.Object) entryArray5);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap(0);
        java.lang.Object obj12 = hashMap9.get((java.lang.Object) hashMap11);
        int int13 = hashMap9.modCount;
        java.lang.Object obj14 = hashMap0.remove((java.lang.Object) int13);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Object obj19 = hashMap17.remove(obj18);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap(0);
        java.lang.Object obj25 = hashMap22.get((java.lang.Object) hashMap24);
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        int int27 = hashMap26.modCount;
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray31 = hashMap30.table;
        hashMap26.table = entryArray31;
        hashMap22.table = entryArray31;
        hashMap17.table = entryArray31;
        java.lang.Object obj35 = hashMap0.get((java.lang.Object) entryArray31);
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        java.lang.Object obj38 = hashMap36.get((java.lang.Object) 0.0f);
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray42 = hashMap41.table;
        hashMap36.table = entryArray42;
        hashMap0.table = entryArray42;
        int int45 = hashMap0.size();
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap((int) '#', (float) (short) 100);
        system.testclass.HashMap hashMap49 = new system.testclass.HashMap();
        int int50 = hashMap49.modCount;
        system.testclass.HashMap hashMap53 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray54 = hashMap53.table;
        java.lang.Object obj55 = hashMap49.remove((java.lang.Object) entryArray54);
        system.testclass.HashMap hashMap58 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap60 = new system.testclass.HashMap(0);
        java.lang.Object obj61 = hashMap58.get((java.lang.Object) hashMap60);
        int int62 = hashMap58.modCount;
        java.lang.Object obj63 = hashMap49.remove((java.lang.Object) int62);
        system.testclass.HashMap hashMap66 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj67 = new java.lang.Object();
        java.lang.Object obj68 = hashMap66.remove(obj67);
        system.testclass.HashMap hashMap71 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap73 = new system.testclass.HashMap(0);
        java.lang.Object obj74 = hashMap71.get((java.lang.Object) hashMap73);
        system.testclass.HashMap hashMap75 = new system.testclass.HashMap();
        int int76 = hashMap75.modCount;
        system.testclass.HashMap hashMap79 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray80 = hashMap79.table;
        hashMap75.table = entryArray80;
        hashMap71.table = entryArray80;
        hashMap66.table = entryArray80;
        java.lang.Object obj84 = hashMap49.get((java.lang.Object) entryArray80);
        java.lang.Object obj85 = hashMap0.put((java.lang.Object) '#', obj84);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        boolean boolean2 = hashMap1.isEmpty();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) 'a', (float) (byte) 1);
        java.lang.Object obj6 = hashMap1.remove((java.lang.Object) hashMap5);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray10 = hashMap9.table;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray16 = hashMap15.table;
        java.lang.Object obj17 = hashMap11.remove((java.lang.Object) entryArray16);
        hashMap9.table = entryArray16;
        hashMap1.table = entryArray16;
        int int20 = hashMap1.modCount;
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray5 = hashMap4.table;
        java.lang.Object obj6 = hashMap0.remove((java.lang.Object) entryArray5);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap(0);
        java.lang.Object obj12 = hashMap9.get((java.lang.Object) hashMap11);
        int int13 = hashMap9.modCount;
        java.lang.Object obj14 = hashMap0.remove((java.lang.Object) int13);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj18 = new java.lang.Object();
        java.lang.Object obj19 = hashMap17.remove(obj18);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap(0);
        java.lang.Object obj25 = hashMap22.get((java.lang.Object) hashMap24);
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        int int27 = hashMap26.modCount;
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray31 = hashMap30.table;
        hashMap26.table = entryArray31;
        hashMap22.table = entryArray31;
        hashMap17.table = entryArray31;
        java.lang.Object obj35 = hashMap0.get((java.lang.Object) entryArray31);
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        java.lang.Object obj38 = hashMap36.get((java.lang.Object) 0.0f);
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray42 = hashMap41.table;
        hashMap36.table = entryArray42;
        hashMap0.table = entryArray42;
        int int45 = hashMap0.size();
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap((int) '4', (float) 10L);
        boolean boolean49 = hashMap48.isEmpty();
        hashMap48.modCount = 0;
        system.testclass.HashMap hashMap54 = new system.testclass.HashMap((int) '4', (float) 10L);
        boolean boolean55 = hashMap54.isEmpty();
        hashMap54.modCount = 0;
        system.testclass.HashMap hashMap60 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray61 = hashMap60.table;
        system.testclass.HashMap hashMap62 = new system.testclass.HashMap();
        int int63 = hashMap62.modCount;
        system.testclass.HashMap hashMap66 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray67 = hashMap66.table;
        java.lang.Object obj68 = hashMap62.remove((java.lang.Object) entryArray67);
        hashMap60.table = entryArray67;
        hashMap54.table = entryArray67;
        java.lang.Object obj71 = hashMap48.remove((java.lang.Object) hashMap54);
        system.testclass.HashMap.Entry[] entryArray72 = hashMap48.table;
        java.lang.Object obj73 = hashMap0.get((java.lang.Object) entryArray72);
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap(0);
        java.lang.Object obj9 = hashMap6.get((java.lang.Object) hashMap8);
        int int10 = hashMap6.modCount;
        int int11 = hashMap6.modCount;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap(0);
        boolean boolean14 = hashMap13.isEmpty();
        system.testclass.HashMap.Entry[] entryArray15 = hashMap13.table;
        java.lang.Object obj16 = hashMap6.get((java.lang.Object) hashMap13);
        java.lang.Object obj17 = hashMap0.remove((java.lang.Object) hashMap6);
        hashMap6.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap6", hashMap6.repOK_1());
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        java.lang.Class<?> wildcardClass4 = hashMap3.getClass();
        java.lang.Object obj5 = hashMap0.get((java.lang.Object) hashMap3);
        int int6 = hashMap0.size();
        int int7 = hashMap0.modCount;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int11 = hashMap10.modCount;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray20 = hashMap19.table;
        hashMap15.table = entryArray20;
        java.lang.Object obj22 = hashMap14.remove((java.lang.Object) entryArray20);
        hashMap10.table = entryArray20;
        java.lang.Object obj24 = hashMap0.get((java.lang.Object) hashMap10);
        boolean boolean25 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        hashMap26.modCount = 0;
        java.lang.Object obj29 = null;
        java.lang.Object obj30 = hashMap26.remove(obj29);
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        int int32 = hashMap31.modCount;
        int int33 = hashMap31.modCount;
        system.testclass.HashMap.Entry[] entryArray34 = hashMap31.table;
        hashMap26.table = entryArray34;
        java.lang.Object obj36 = hashMap0.remove((java.lang.Object) hashMap26);
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap(0, (float) (short) 100);
        java.lang.Object obj41 = hashMap39.get((java.lang.Object) ' ');
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap();
        hashMap42.modCount = 0;
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        int int46 = hashMap45.modCount;
        system.testclass.HashMap hashMap49 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray50 = hashMap49.table;
        java.lang.Object obj51 = hashMap45.remove((java.lang.Object) entryArray50);
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap();
        boolean boolean53 = hashMap52.isEmpty();
        int int54 = hashMap52.size();
        boolean boolean55 = hashMap52.isEmpty();
        system.testclass.HashMap hashMap58 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int59 = hashMap58.modCount;
        java.lang.Object obj60 = hashMap52.remove((java.lang.Object) int59);
        int int61 = hashMap52.modCount;
        system.testclass.HashMap.Entry[] entryArray62 = hashMap52.table;
        java.lang.Object obj63 = hashMap45.get((java.lang.Object) hashMap52);
        hashMap45.modCount = (short) 0;
        java.lang.Object obj66 = hashMap42.remove((java.lang.Object) hashMap45);
        int int67 = hashMap42.size();
        java.lang.Object obj68 = hashMap26.put(obj41, (java.lang.Object) hashMap42);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap26", hashMap26.repOK_1());
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object obj4 = hashMap2.remove(obj3);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray8 = hashMap7.table;
        hashMap2.table = entryArray8;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap(0);
        int int12 = hashMap11.size();
        java.lang.Object obj14 = hashMap11.get((java.lang.Object) 100L);
        int int15 = hashMap11.modCount;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        boolean boolean17 = hashMap16.isEmpty();
        int int18 = hashMap16.size();
        boolean boolean19 = hashMap16.isEmpty();
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int23 = hashMap22.modCount;
        java.lang.Object obj24 = hashMap16.remove((java.lang.Object) int23);
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        hashMap25.modCount = 0;
        boolean boolean28 = hashMap25.isEmpty();
        int int29 = hashMap25.size();
        java.lang.Object obj30 = hashMap16.get((java.lang.Object) hashMap25);
        java.lang.Object obj31 = hashMap11.get((java.lang.Object) hashMap16);
        java.lang.Class<?> wildcardClass32 = hashMap11.getClass();
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj36 = new java.lang.Object();
        java.lang.Object obj37 = hashMap35.remove(obj36);
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray41 = hashMap40.table;
        hashMap35.table = entryArray41;
        java.lang.Object obj43 = hashMap2.put((java.lang.Object) hashMap11, (java.lang.Object) entryArray41);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int3 = hashMap2.modCount;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray12 = hashMap11.table;
        hashMap7.table = entryArray12;
        java.lang.Object obj14 = hashMap6.remove((java.lang.Object) entryArray12);
        hashMap2.table = entryArray12;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        boolean boolean17 = hashMap16.isEmpty();
        int int18 = hashMap16.size();
        java.lang.Object obj19 = hashMap2.remove((java.lang.Object) int18);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap((int) '4', (float) 10L);
        boolean boolean23 = hashMap22.isEmpty();
        system.testclass.HashMap.Entry[] entryArray24 = hashMap22.table;
        hashMap2.table = entryArray24;
        hashMap2.modCount = 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray5 = hashMap4.table;
        java.lang.Object obj6 = hashMap0.remove((java.lang.Object) entryArray5);
        boolean boolean7 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.size();
        system.testclass.HashMap.Entry[] entryArray10 = hashMap8.table;
        system.testclass.HashMap.Entry[] entryArray11 = new system.testclass.HashMap.Entry[] {};
        hashMap8.table = entryArray11;
        int int13 = hashMap8.size();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        boolean boolean15 = hashMap14.isEmpty();
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        int int17 = hashMap16.modCount;
        int int18 = hashMap16.modCount;
        system.testclass.HashMap.Entry[] entryArray19 = hashMap16.table;
        java.lang.Object obj20 = hashMap14.get((java.lang.Object) entryArray19);
        hashMap8.table = entryArray19;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap(0);
        java.lang.Object obj27 = hashMap24.get((java.lang.Object) hashMap26);
        int int28 = hashMap24.modCount;
        int int29 = hashMap24.modCount;
        java.lang.Object obj30 = hashMap0.put((java.lang.Object) entryArray19, (java.lang.Object) hashMap24);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        boolean boolean3 = hashMap2.isEmpty();
        system.testclass.HashMap.Entry[] entryArray4 = hashMap2.table;
        hashMap2.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap(0);
        java.lang.Object obj5 = hashMap2.get((java.lang.Object) hashMap4);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.modCount;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray11 = hashMap10.table;
        hashMap6.table = entryArray11;
        java.lang.Object obj13 = hashMap4.get((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int17 = hashMap16.modCount;
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap((int) '4', (float) 10L);
        boolean boolean21 = hashMap20.isEmpty();
        hashMap20.modCount = 0;
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int27 = hashMap26.modCount;
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        int int32 = hashMap31.modCount;
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray36 = hashMap35.table;
        hashMap31.table = entryArray36;
        java.lang.Object obj38 = hashMap30.remove((java.lang.Object) entryArray36);
        hashMap26.table = entryArray36;
        hashMap20.table = entryArray36;
        hashMap16.table = entryArray36;
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap();
        boolean boolean43 = hashMap42.isEmpty();
        int int44 = hashMap42.size();
        boolean boolean45 = hashMap42.isEmpty();
        java.lang.Object obj46 = hashMap16.remove((java.lang.Object) hashMap42);
        int int47 = hashMap16.size();
        java.lang.Object obj48 = hashMap4.get((java.lang.Object) hashMap16);
        hashMap4.modCount = 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap4", hashMap4.repOK_1());
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int6 = hashMap5.modCount;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.modCount;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray15 = hashMap14.table;
        hashMap10.table = entryArray15;
        java.lang.Object obj17 = hashMap9.remove((java.lang.Object) entryArray15);
        hashMap5.table = entryArray15;
        java.lang.Object obj19 = hashMap0.remove((java.lang.Object) hashMap5);
        int int20 = hashMap5.modCount;
        hashMap5.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap5", hashMap5.repOK_1());
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap(0);
        java.lang.Object obj5 = hashMap2.get((java.lang.Object) hashMap4);
        int int6 = hashMap2.modCount;
        int int7 = hashMap2.modCount;
        boolean boolean8 = hashMap2.isEmpty();
        boolean boolean9 = hashMap2.isEmpty();
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray2 = hashMap0.table;
        hashMap0.modCount = 0;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap(0);
        int int7 = hashMap6.size();
        java.lang.Object obj9 = hashMap6.remove((java.lang.Object) (byte) 100);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        java.lang.Object obj12 = hashMap6.remove((java.lang.Object) hashMap10);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.size();
        system.testclass.HashMap.Entry[] entryArray15 = hashMap13.table;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        boolean boolean17 = hashMap16.isEmpty();
        java.lang.Object obj18 = hashMap13.remove((java.lang.Object) hashMap16);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        int int20 = hashMap19.modCount;
        int int21 = hashMap19.modCount;
        system.testclass.HashMap.Entry[] entryArray22 = hashMap19.table;
        hashMap13.table = entryArray22;
        hashMap6.table = entryArray22;
        hashMap0.table = entryArray22;
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap((int) '4', (float) 10L);
        boolean boolean29 = hashMap28.isEmpty();
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap(0);
        java.lang.Object obj35 = hashMap32.get((java.lang.Object) hashMap34);
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap(0);
        java.lang.Object obj41 = hashMap38.get((java.lang.Object) hashMap40);
        int int42 = hashMap40.size();
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap();
        boolean boolean44 = hashMap43.isEmpty();
        int int45 = hashMap43.size();
        boolean boolean46 = hashMap43.isEmpty();
        system.testclass.HashMap hashMap49 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int50 = hashMap49.modCount;
        java.lang.Object obj51 = hashMap43.remove((java.lang.Object) int50);
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap();
        hashMap52.modCount = 0;
        boolean boolean55 = hashMap52.isEmpty();
        int int56 = hashMap52.size();
        java.lang.Object obj57 = hashMap43.get((java.lang.Object) hashMap52);
        java.lang.Object obj58 = hashMap40.remove(obj57);
        system.testclass.HashMap hashMap59 = new system.testclass.HashMap();
        boolean boolean60 = hashMap59.isEmpty();
        int int61 = hashMap59.size();
        boolean boolean62 = hashMap59.isEmpty();
        system.testclass.HashMap hashMap65 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int66 = hashMap65.modCount;
        java.lang.Object obj67 = hashMap59.remove((java.lang.Object) int66);
        system.testclass.HashMap hashMap68 = new system.testclass.HashMap();
        hashMap68.modCount = 0;
        boolean boolean71 = hashMap68.isEmpty();
        int int72 = hashMap68.size();
        java.lang.Object obj73 = hashMap59.get((java.lang.Object) hashMap68);
        int int74 = hashMap59.size();
        java.lang.Object obj75 = hashMap40.remove((java.lang.Object) hashMap59);
        system.testclass.HashMap.Entry[] entryArray76 = hashMap59.table;
        java.lang.Object obj77 = hashMap34.get((java.lang.Object) hashMap59);
        hashMap59.modCount = (byte) 0;
        system.testclass.HashMap hashMap82 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap84 = new system.testclass.HashMap(0);
        java.lang.Object obj85 = hashMap82.get((java.lang.Object) hashMap84);
        system.testclass.HashMap hashMap86 = new system.testclass.HashMap();
        int int87 = hashMap86.modCount;
        system.testclass.HashMap hashMap90 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray91 = hashMap90.table;
        hashMap86.table = entryArray91;
        java.lang.Object obj93 = hashMap84.get((java.lang.Object) hashMap86);
        java.lang.Object obj94 = hashMap59.get(obj93);
        java.lang.Object obj95 = hashMap0.put((java.lang.Object) hashMap28, (java.lang.Object) hashMap59);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap.Entry[] entryArray3 = new system.testclass.HashMap.Entry[] {};
        hashMap2.table = entryArray3;
        hashMap2.modCount = 'a';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.size();
        int int2 = hashMap0.modCount;
        int int3 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray4 = hashMap0.table;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray8 = hashMap7.table;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray14 = hashMap13.table;
        java.lang.Object obj15 = hashMap9.remove((java.lang.Object) entryArray14);
        hashMap7.table = entryArray14;
        java.lang.Object obj17 = hashMap0.get((java.lang.Object) hashMap7);
        int int18 = hashMap7.modCount;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        boolean boolean20 = hashMap19.isEmpty();
        int int21 = hashMap19.size();
        boolean boolean22 = hashMap19.isEmpty();
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int26 = hashMap25.modCount;
        java.lang.Object obj27 = hashMap19.remove((java.lang.Object) int26);
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        hashMap28.modCount = 0;
        boolean boolean31 = hashMap28.isEmpty();
        int int32 = hashMap28.size();
        java.lang.Object obj33 = hashMap19.get((java.lang.Object) hashMap28);
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj37 = new java.lang.Object();
        java.lang.Object obj38 = hashMap36.remove(obj37);
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap(0);
        int int41 = hashMap40.size();
        java.lang.Object obj43 = hashMap40.get((java.lang.Object) 100L);
        int int44 = hashMap40.size();
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        int int46 = hashMap45.size();
        system.testclass.HashMap.Entry[] entryArray47 = hashMap45.table;
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap();
        boolean boolean49 = hashMap48.isEmpty();
        java.lang.Object obj50 = hashMap45.remove((java.lang.Object) hashMap48);
        system.testclass.HashMap hashMap51 = new system.testclass.HashMap();
        int int52 = hashMap51.modCount;
        int int53 = hashMap51.modCount;
        system.testclass.HashMap.Entry[] entryArray54 = hashMap51.table;
        hashMap45.table = entryArray54;
        hashMap40.table = entryArray54;
        hashMap36.table = entryArray54;
        java.lang.Object obj58 = hashMap7.put(obj33, (java.lang.Object) entryArray54);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap7", hashMap7.repOK_1());
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        java.lang.Class<?> wildcardClass4 = hashMap3.getClass();
        java.lang.Object obj5 = hashMap0.get((java.lang.Object) hashMap3);
        int int6 = hashMap0.size();
        int int7 = hashMap0.modCount;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int11 = hashMap10.modCount;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray20 = hashMap19.table;
        hashMap15.table = entryArray20;
        java.lang.Object obj22 = hashMap14.remove((java.lang.Object) entryArray20);
        hashMap10.table = entryArray20;
        java.lang.Object obj24 = hashMap0.get((java.lang.Object) hashMap10);
        boolean boolean25 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj30 = new java.lang.Object();
        java.lang.Object obj31 = hashMap29.remove(obj30);
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap(0);
        int int34 = hashMap33.size();
        java.lang.Object obj36 = hashMap33.get((java.lang.Object) 100L);
        int int37 = hashMap33.size();
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        int int39 = hashMap38.size();
        system.testclass.HashMap.Entry[] entryArray40 = hashMap38.table;
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        boolean boolean42 = hashMap41.isEmpty();
        java.lang.Object obj43 = hashMap38.remove((java.lang.Object) hashMap41);
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap();
        int int45 = hashMap44.modCount;
        int int46 = hashMap44.modCount;
        system.testclass.HashMap.Entry[] entryArray47 = hashMap44.table;
        hashMap38.table = entryArray47;
        hashMap33.table = entryArray47;
        hashMap29.table = entryArray47;
        java.lang.Object obj51 = hashMap0.put((java.lang.Object) (-1.0f), (java.lang.Object) hashMap29);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        int int3 = hashMap0.size();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        int int6 = hashMap4.size();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        java.lang.Class<?> wildcardClass8 = hashMap7.getClass();
        java.lang.Object obj9 = hashMap4.get((java.lang.Object) hashMap7);
        java.lang.Class<?> wildcardClass10 = hashMap4.getClass();
        java.lang.Object obj11 = hashMap0.remove((java.lang.Object) hashMap4);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        java.lang.Class<?> wildcardClass13 = hashMap12.getClass();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        boolean boolean15 = hashMap14.isEmpty();
        int int16 = hashMap14.size();
        boolean boolean17 = hashMap14.isEmpty();
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int21 = hashMap20.modCount;
        java.lang.Object obj22 = hashMap14.remove((java.lang.Object) int21);
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        hashMap23.modCount = 0;
        boolean boolean26 = hashMap23.isEmpty();
        int int27 = hashMap23.size();
        java.lang.Object obj28 = hashMap14.get((java.lang.Object) hashMap23);
        java.lang.Object obj30 = hashMap14.get((java.lang.Object) (byte) 10);
        int int31 = hashMap14.size();
        java.lang.Object obj32 = hashMap0.put((java.lang.Object) wildcardClass13, (java.lang.Object) int31);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 10);
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap(0);
        java.lang.Object obj5 = hashMap2.get((java.lang.Object) hashMap4);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap(0);
        java.lang.Object obj11 = hashMap8.get((java.lang.Object) hashMap10);
        int int12 = hashMap10.size();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        boolean boolean14 = hashMap13.isEmpty();
        int int15 = hashMap13.size();
        boolean boolean16 = hashMap13.isEmpty();
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int20 = hashMap19.modCount;
        java.lang.Object obj21 = hashMap13.remove((java.lang.Object) int20);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        hashMap22.modCount = 0;
        boolean boolean25 = hashMap22.isEmpty();
        int int26 = hashMap22.size();
        java.lang.Object obj27 = hashMap13.get((java.lang.Object) hashMap22);
        java.lang.Object obj28 = hashMap10.remove(obj27);
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        boolean boolean30 = hashMap29.isEmpty();
        int int31 = hashMap29.size();
        boolean boolean32 = hashMap29.isEmpty();
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int36 = hashMap35.modCount;
        java.lang.Object obj37 = hashMap29.remove((java.lang.Object) int36);
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        hashMap38.modCount = 0;
        boolean boolean41 = hashMap38.isEmpty();
        int int42 = hashMap38.size();
        java.lang.Object obj43 = hashMap29.get((java.lang.Object) hashMap38);
        int int44 = hashMap29.size();
        java.lang.Object obj45 = hashMap10.remove((java.lang.Object) hashMap29);
        system.testclass.HashMap.Entry[] entryArray46 = hashMap29.table;
        java.lang.Object obj47 = hashMap4.get((java.lang.Object) hashMap29);
        hashMap29.modCount = (byte) 0;
        int int50 = hashMap29.modCount;
        system.testclass.HashMap hashMap51 = new system.testclass.HashMap();
        boolean boolean52 = hashMap51.isEmpty();
        int int53 = hashMap51.size();
        boolean boolean54 = hashMap51.isEmpty();
        system.testclass.HashMap hashMap57 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int58 = hashMap57.modCount;
        java.lang.Object obj59 = hashMap51.remove((java.lang.Object) int58);
        int int60 = hashMap51.modCount;
        boolean boolean61 = hashMap51.isEmpty();
        system.testclass.HashMap.Entry[] entryArray62 = hashMap51.table;
        hashMap29.table = entryArray62;
        hashMap29.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap29", hashMap29.repOK_1());
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray5 = hashMap4.table;
        java.lang.Object obj6 = hashMap0.remove((java.lang.Object) entryArray5);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        int int9 = hashMap7.size();
        boolean boolean10 = hashMap7.isEmpty();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int14 = hashMap13.modCount;
        java.lang.Object obj15 = hashMap7.remove((java.lang.Object) int14);
        int int16 = hashMap7.modCount;
        system.testclass.HashMap.Entry[] entryArray17 = hashMap7.table;
        java.lang.Object obj18 = hashMap0.get((java.lang.Object) hashMap7);
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap(0, (float) (short) 100);
        java.lang.Object obj23 = hashMap21.get((java.lang.Object) ' ');
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap(0);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Object obj27 = hashMap25.remove(obj26);
        boolean boolean28 = hashMap25.isEmpty();
        java.lang.Object obj29 = hashMap0.put(obj23, (java.lang.Object) hashMap25);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        boolean boolean3 = hashMap2.isEmpty();
        system.testclass.HashMap.Entry[] entryArray4 = hashMap2.table;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) (byte) 100, (float) '#');
        int int8 = hashMap7.size();
        int int9 = hashMap7.size();
        java.lang.Object obj11 = hashMap2.put((java.lang.Object) hashMap7, (java.lang.Object) 0.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap(0);
        java.lang.Object obj7 = hashMap4.get((java.lang.Object) hashMap6);
        int int8 = hashMap6.size();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        int int11 = hashMap9.size();
        boolean boolean12 = hashMap9.isEmpty();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int16 = hashMap15.modCount;
        java.lang.Object obj17 = hashMap9.remove((java.lang.Object) int16);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        hashMap18.modCount = 0;
        boolean boolean21 = hashMap18.isEmpty();
        int int22 = hashMap18.size();
        java.lang.Object obj23 = hashMap9.get((java.lang.Object) hashMap18);
        java.lang.Object obj24 = hashMap6.remove(obj23);
        java.lang.Object obj25 = hashMap0.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap((int) '4', (float) (byte) 100);
        java.lang.Object obj29 = hashMap6.remove((java.lang.Object) (byte) 100);
        hashMap6.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap6", hashMap6.repOK_1());
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '#', (float) 'a');
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray6 = hashMap5.table;
        hashMap2.table = entryArray6;
        int int8 = hashMap2.modCount;
        int int9 = hashMap2.size();
        hashMap2.modCount = (byte) 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        java.lang.Object obj2 = hashMap0.get((java.lang.Object) 0.0f);
        java.lang.Object obj4 = hashMap0.get((java.lang.Object) 100);
        boolean boolean5 = hashMap0.isEmpty();
        system.testclass.HashMap.Entry[] entryArray6 = hashMap0.table;
        int int7 = hashMap0.modCount;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap(1, (float) (byte) 1);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.size();
        system.testclass.HashMap.Entry[] entryArray13 = hashMap11.table;
        hashMap11.modCount = 0;
        int int16 = hashMap11.size();
        java.lang.Object obj17 = hashMap0.put((java.lang.Object) 1, (java.lang.Object) hashMap11);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        int int2 = hashMap1.size();
        java.lang.Object obj4 = hashMap1.get((java.lang.Object) 100L);
        int int5 = hashMap1.size();
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray5 = hashMap4.table;
        java.lang.Object obj6 = hashMap0.remove((java.lang.Object) entryArray5);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        int int9 = hashMap7.size();
        boolean boolean10 = hashMap7.isEmpty();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int14 = hashMap13.modCount;
        java.lang.Object obj15 = hashMap7.remove((java.lang.Object) int14);
        int int16 = hashMap7.modCount;
        system.testclass.HashMap.Entry[] entryArray17 = hashMap7.table;
        java.lang.Object obj18 = hashMap0.get((java.lang.Object) hashMap7);
        hashMap0.modCount = ' ';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        int int3 = hashMap0.size();
        hashMap0.modCount = 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap(0);
        java.lang.Object obj9 = hashMap6.get((java.lang.Object) hashMap8);
        int int10 = hashMap6.modCount;
        int int11 = hashMap6.modCount;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap(0);
        boolean boolean14 = hashMap13.isEmpty();
        system.testclass.HashMap.Entry[] entryArray15 = hashMap13.table;
        java.lang.Object obj16 = hashMap6.get((java.lang.Object) hashMap13);
        java.lang.Object obj17 = hashMap0.remove((java.lang.Object) hashMap6);
        int int18 = hashMap6.size();
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap(10);
        boolean boolean21 = hashMap20.isEmpty();
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap((int) (short) 1);
        java.lang.Object obj24 = hashMap6.put((java.lang.Object) boolean21, (java.lang.Object) hashMap23);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap6", hashMap6.repOK_1());
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 1);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        int int3 = hashMap2.modCount;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray7 = hashMap6.table;
        java.lang.Object obj8 = hashMap2.remove((java.lang.Object) entryArray7);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap(0);
        java.lang.Object obj14 = hashMap11.get((java.lang.Object) hashMap13);
        int int15 = hashMap11.modCount;
        java.lang.Object obj16 = hashMap2.remove((java.lang.Object) int15);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj20 = new java.lang.Object();
        java.lang.Object obj21 = hashMap19.remove(obj20);
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap(0);
        java.lang.Object obj27 = hashMap24.get((java.lang.Object) hashMap26);
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        int int29 = hashMap28.modCount;
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray33 = hashMap32.table;
        hashMap28.table = entryArray33;
        hashMap24.table = entryArray33;
        hashMap19.table = entryArray33;
        java.lang.Object obj37 = hashMap2.get((java.lang.Object) entryArray33);
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        java.lang.Object obj40 = hashMap38.get((java.lang.Object) 0.0f);
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray44 = hashMap43.table;
        hashMap38.table = entryArray44;
        hashMap2.table = entryArray44;
        java.lang.Object obj47 = hashMap1.remove((java.lang.Object) entryArray44);
        hashMap1.modCount = 0;
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (byte) 10);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap(0, (float) 1);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap((int) (byte) 0, (float) 100L);
        java.lang.Object obj9 = hashMap2.put((java.lang.Object) 0, (java.lang.Object) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (short) 100);
        int int3 = hashMap2.modCount;
        boolean boolean4 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        java.lang.Object obj7 = hashMap5.get((java.lang.Object) 0.0f);
        java.lang.Object obj9 = hashMap5.get((java.lang.Object) 100);
        boolean boolean10 = hashMap5.isEmpty();
        system.testclass.HashMap.Entry[] entryArray11 = hashMap5.table;
        java.lang.Object obj12 = hashMap2.remove((java.lang.Object) hashMap5);
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray5 = hashMap4.table;
        java.lang.Object obj6 = hashMap0.remove((java.lang.Object) entryArray5);
        boolean boolean7 = hashMap0.isEmpty();
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray2 = hashMap0.table;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        int int5 = hashMap3.size();
        boolean boolean6 = hashMap3.isEmpty();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int10 = hashMap9.modCount;
        java.lang.Object obj11 = hashMap3.remove((java.lang.Object) int10);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        hashMap12.modCount = 0;
        boolean boolean15 = hashMap12.isEmpty();
        int int16 = hashMap12.size();
        java.lang.Object obj17 = hashMap3.get((java.lang.Object) hashMap12);
        boolean boolean18 = hashMap12.isEmpty();
        int int19 = hashMap12.modCount;
        java.lang.Object obj20 = hashMap0.remove((java.lang.Object) hashMap12);
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap(0);
        java.lang.Object obj26 = hashMap23.get((java.lang.Object) hashMap25);
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        int int28 = hashMap27.modCount;
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray32 = hashMap31.table;
        hashMap27.table = entryArray32;
        hashMap23.table = entryArray32;
        system.testclass.HashMap.Entry[] entryArray35 = hashMap23.table;
        system.testclass.HashMap.Entry[] entryArray36 = hashMap23.table;
        hashMap0.table = entryArray36;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        java.lang.Object obj2 = hashMap0.get((java.lang.Object) 0.0f);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray6 = hashMap5.table;
        hashMap0.table = entryArray6;
        hashMap0.modCount = (byte) 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        boolean boolean3 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int7 = hashMap6.modCount;
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) int7);
        int int9 = hashMap0.modCount;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.size();
        system.testclass.HashMap.Entry[] entryArray12 = hashMap10.table;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        boolean boolean14 = hashMap13.isEmpty();
        java.lang.Object obj15 = hashMap10.remove((java.lang.Object) hashMap13);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        int int17 = hashMap16.modCount;
        int int18 = hashMap16.modCount;
        system.testclass.HashMap.Entry[] entryArray19 = hashMap16.table;
        hashMap10.table = entryArray19;
        java.lang.Object obj21 = hashMap0.get((java.lang.Object) hashMap10);
        int int22 = hashMap10.size();
        hashMap10.modCount = '#';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap10", hashMap10.repOK_1());
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int3 = hashMap2.modCount;
        boolean boolean4 = hashMap2.isEmpty();
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) (byte) 100);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.size();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap3.table;
        system.testclass.HashMap.Entry[] entryArray6 = hashMap3.table;
        int int7 = hashMap3.size();
        java.lang.Object obj8 = hashMap2.remove((java.lang.Object) int7);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap((int) (byte) 10, (float) (byte) 10);
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = hashMap2.put((java.lang.Object) (byte) 10, obj12);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray8 = hashMap7.table;
        java.lang.Object obj9 = hashMap3.remove((java.lang.Object) entryArray8);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        int int12 = hashMap10.size();
        boolean boolean13 = hashMap10.isEmpty();
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int17 = hashMap16.modCount;
        java.lang.Object obj18 = hashMap10.remove((java.lang.Object) int17);
        int int19 = hashMap10.modCount;
        system.testclass.HashMap.Entry[] entryArray20 = hashMap10.table;
        java.lang.Object obj21 = hashMap3.get((java.lang.Object) hashMap10);
        hashMap3.modCount = (short) 0;
        java.lang.Object obj24 = hashMap0.remove((java.lang.Object) hashMap3);
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        int int26 = hashMap25.size();
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap(0);
        java.lang.Object obj32 = hashMap29.get((java.lang.Object) hashMap31);
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        int int34 = hashMap33.modCount;
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray38 = hashMap37.table;
        hashMap33.table = entryArray38;
        hashMap29.table = entryArray38;
        hashMap25.table = entryArray38;
        boolean boolean42 = hashMap25.isEmpty();
        int int43 = hashMap25.size();
        java.lang.Object obj44 = null;
        java.lang.Object obj45 = hashMap3.put((java.lang.Object) hashMap25, obj44);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap3", hashMap3.repOK_1());
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object obj4 = hashMap2.remove(obj3);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap(0);
        java.lang.Object obj10 = hashMap7.get((java.lang.Object) hashMap9);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray16 = hashMap15.table;
        hashMap11.table = entryArray16;
        hashMap7.table = entryArray16;
        hashMap2.table = entryArray16;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap(0);
        boolean boolean22 = hashMap21.isEmpty();
        system.testclass.HashMap.Entry[] entryArray23 = hashMap21.table;
        hashMap2.table = entryArray23;
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray8 = hashMap7.table;
        java.lang.Object obj9 = hashMap3.remove((java.lang.Object) entryArray8);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        int int12 = hashMap10.size();
        boolean boolean13 = hashMap10.isEmpty();
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int17 = hashMap16.modCount;
        java.lang.Object obj18 = hashMap10.remove((java.lang.Object) int17);
        int int19 = hashMap10.modCount;
        system.testclass.HashMap.Entry[] entryArray20 = hashMap10.table;
        java.lang.Object obj21 = hashMap3.get((java.lang.Object) hashMap10);
        hashMap3.modCount = (short) 0;
        java.lang.Object obj24 = hashMap0.remove((java.lang.Object) hashMap3);
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap(0);
        boolean boolean27 = hashMap26.isEmpty();
        system.testclass.HashMap.Entry[] entryArray28 = hashMap26.table;
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap(0);
        int int31 = hashMap30.size();
        java.lang.Object obj33 = hashMap30.get((java.lang.Object) 100L);
        int int34 = hashMap30.size();
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        int int36 = hashMap35.modCount;
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray40 = hashMap39.table;
        java.lang.Object obj41 = hashMap35.remove((java.lang.Object) entryArray40);
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap46 = new system.testclass.HashMap(0);
        java.lang.Object obj47 = hashMap44.get((java.lang.Object) hashMap46);
        int int48 = hashMap44.modCount;
        java.lang.Object obj49 = hashMap35.remove((java.lang.Object) int48);
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj53 = new java.lang.Object();
        java.lang.Object obj54 = hashMap52.remove(obj53);
        system.testclass.HashMap hashMap57 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap59 = new system.testclass.HashMap(0);
        java.lang.Object obj60 = hashMap57.get((java.lang.Object) hashMap59);
        system.testclass.HashMap hashMap61 = new system.testclass.HashMap();
        int int62 = hashMap61.modCount;
        system.testclass.HashMap hashMap65 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray66 = hashMap65.table;
        hashMap61.table = entryArray66;
        hashMap57.table = entryArray66;
        hashMap52.table = entryArray66;
        java.lang.Object obj70 = hashMap35.get((java.lang.Object) entryArray66);
        system.testclass.HashMap hashMap71 = new system.testclass.HashMap();
        java.lang.Object obj73 = hashMap71.get((java.lang.Object) 0.0f);
        system.testclass.HashMap hashMap76 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray77 = hashMap76.table;
        hashMap71.table = entryArray77;
        hashMap35.table = entryArray77;
        java.lang.Object obj80 = hashMap30.remove((java.lang.Object) hashMap35);
        system.testclass.HashMap hashMap83 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        int int84 = hashMap83.modCount;
        system.testclass.HashMap hashMap85 = new system.testclass.HashMap();
        int int86 = hashMap85.size();
        system.testclass.HashMap.Entry[] entryArray87 = hashMap85.table;
        system.testclass.HashMap.Entry[] entryArray88 = new system.testclass.HashMap.Entry[] {};
        hashMap85.table = entryArray88;
        hashMap83.table = entryArray88;
        hashMap35.table = entryArray88;
        java.lang.Object obj92 = hashMap3.put((java.lang.Object) entryArray28, (java.lang.Object) hashMap35);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap3", hashMap3.repOK_1());
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap.Entry[] entryArray3 = hashMap2.table;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap.Entry[] entryArray6 = hashMap5.table;
        java.lang.Object obj7 = hashMap2.remove((java.lang.Object) hashMap5);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        hashMap8.modCount = 0;
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = hashMap8.remove(obj11);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        system.testclass.HashMap.Entry[] entryArray16 = hashMap13.table;
        hashMap8.table = entryArray16;
        int int18 = hashMap8.size();
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        int int20 = hashMap19.modCount;
        int int21 = hashMap19.modCount;
        system.testclass.HashMap.Entry[] entryArray22 = hashMap19.table;
        hashMap8.table = entryArray22;
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap((int) (byte) 10, (float) (byte) 10);
        java.lang.Object obj27 = hashMap2.put((java.lang.Object) entryArray22, (java.lang.Object) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap(0);
        java.lang.Object obj5 = hashMap2.get((java.lang.Object) hashMap4);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap(0);
        java.lang.Object obj11 = hashMap8.get((java.lang.Object) hashMap10);
        int int12 = hashMap10.size();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        boolean boolean14 = hashMap13.isEmpty();
        int int15 = hashMap13.size();
        boolean boolean16 = hashMap13.isEmpty();
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int20 = hashMap19.modCount;
        java.lang.Object obj21 = hashMap13.remove((java.lang.Object) int20);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        hashMap22.modCount = 0;
        boolean boolean25 = hashMap22.isEmpty();
        int int26 = hashMap22.size();
        java.lang.Object obj27 = hashMap13.get((java.lang.Object) hashMap22);
        java.lang.Object obj28 = hashMap10.remove(obj27);
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        boolean boolean30 = hashMap29.isEmpty();
        int int31 = hashMap29.size();
        boolean boolean32 = hashMap29.isEmpty();
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int36 = hashMap35.modCount;
        java.lang.Object obj37 = hashMap29.remove((java.lang.Object) int36);
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        hashMap38.modCount = 0;
        boolean boolean41 = hashMap38.isEmpty();
        int int42 = hashMap38.size();
        java.lang.Object obj43 = hashMap29.get((java.lang.Object) hashMap38);
        int int44 = hashMap29.size();
        java.lang.Object obj45 = hashMap10.remove((java.lang.Object) hashMap29);
        system.testclass.HashMap.Entry[] entryArray46 = hashMap29.table;
        java.lang.Object obj47 = hashMap4.get((java.lang.Object) hashMap29);
        hashMap29.modCount = (byte) 0;
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap54 = new system.testclass.HashMap(0);
        java.lang.Object obj55 = hashMap52.get((java.lang.Object) hashMap54);
        system.testclass.HashMap hashMap56 = new system.testclass.HashMap();
        int int57 = hashMap56.modCount;
        system.testclass.HashMap hashMap60 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray61 = hashMap60.table;
        hashMap56.table = entryArray61;
        java.lang.Object obj63 = hashMap54.get((java.lang.Object) hashMap56);
        java.lang.Object obj64 = hashMap29.get(obj63);
        system.testclass.HashMap hashMap66 = new system.testclass.HashMap(0);
        java.lang.Object obj67 = new java.lang.Object();
        java.lang.Object obj68 = hashMap66.remove(obj67);
        boolean boolean69 = hashMap66.isEmpty();
        boolean boolean70 = hashMap66.isEmpty();
        system.testclass.HashMap hashMap73 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int74 = hashMap73.modCount;
        system.testclass.HashMap hashMap77 = new system.testclass.HashMap((int) '4', (float) 10L);
        boolean boolean78 = hashMap77.isEmpty();
        hashMap77.modCount = 0;
        system.testclass.HashMap hashMap83 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int84 = hashMap83.modCount;
        system.testclass.HashMap hashMap87 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap88 = new system.testclass.HashMap();
        int int89 = hashMap88.modCount;
        system.testclass.HashMap hashMap92 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray93 = hashMap92.table;
        hashMap88.table = entryArray93;
        java.lang.Object obj95 = hashMap87.remove((java.lang.Object) entryArray93);
        hashMap83.table = entryArray93;
        hashMap77.table = entryArray93;
        hashMap73.table = entryArray93;
        java.lang.Object obj99 = hashMap29.put((java.lang.Object) boolean70, (java.lang.Object) entryArray93);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap29", hashMap29.repOK_1());
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int6 = hashMap5.modCount;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.modCount;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray15 = hashMap14.table;
        hashMap10.table = entryArray15;
        java.lang.Object obj17 = hashMap9.remove((java.lang.Object) entryArray15);
        hashMap5.table = entryArray15;
        java.lang.Object obj19 = hashMap0.remove((java.lang.Object) hashMap5);
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        boolean boolean21 = hashMap20.isEmpty();
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        int int23 = hashMap22.modCount;
        int int24 = hashMap22.modCount;
        system.testclass.HashMap.Entry[] entryArray25 = hashMap22.table;
        java.lang.Object obj26 = hashMap20.get((java.lang.Object) entryArray25);
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        boolean boolean28 = hashMap27.isEmpty();
        int int29 = hashMap27.size();
        system.testclass.HashMap.Entry[] entryArray30 = hashMap27.table;
        boolean boolean31 = hashMap27.isEmpty();
        system.testclass.HashMap.Entry[] entryArray32 = hashMap27.table;
        java.lang.Object obj33 = hashMap0.put(obj26, (java.lang.Object) entryArray32);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray5 = hashMap4.table;
        java.lang.Object obj6 = hashMap0.remove((java.lang.Object) entryArray5);
        system.testclass.HashMap.Entry[] entryArray7 = hashMap0.table;
        hashMap0.modCount = ' ';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.size();
        int int2 = hashMap0.modCount;
        boolean boolean3 = hashMap0.isEmpty();
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        java.lang.Class<?> wildcardClass4 = hashMap3.getClass();
        java.lang.Object obj5 = hashMap0.get((java.lang.Object) hashMap3);
        int int6 = hashMap0.size();
        int int7 = hashMap0.modCount;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        java.lang.Object obj2 = hashMap0.get((java.lang.Object) 0.0f);
        java.lang.Object obj4 = hashMap0.get((java.lang.Object) 100);
        boolean boolean5 = hashMap0.isEmpty();
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 1);
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        int int4 = hashMap0.size();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap(0);
        java.lang.Object obj10 = hashMap7.get((java.lang.Object) hashMap9);
        int int11 = hashMap9.size();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        boolean boolean13 = hashMap12.isEmpty();
        int int14 = hashMap12.size();
        boolean boolean15 = hashMap12.isEmpty();
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int19 = hashMap18.modCount;
        java.lang.Object obj20 = hashMap12.remove((java.lang.Object) int19);
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        hashMap21.modCount = 0;
        boolean boolean24 = hashMap21.isEmpty();
        int int25 = hashMap21.size();
        java.lang.Object obj26 = hashMap12.get((java.lang.Object) hashMap21);
        java.lang.Object obj27 = hashMap9.remove(obj26);
        java.lang.Object obj28 = null;
        java.lang.Object obj29 = hashMap0.put((java.lang.Object) hashMap9, obj28);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        boolean boolean3 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int7 = hashMap6.modCount;
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) int7);
        int int9 = hashMap0.modCount;
        int int10 = hashMap0.size();
        java.lang.Object obj11 = null;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        boolean boolean13 = hashMap12.isEmpty();
        int int14 = hashMap12.size();
        boolean boolean15 = hashMap12.isEmpty();
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int19 = hashMap18.modCount;
        java.lang.Object obj20 = hashMap12.remove((java.lang.Object) int19);
        int int21 = hashMap12.modCount;
        boolean boolean22 = hashMap12.isEmpty();
        java.lang.Object obj23 = hashMap0.put(obj11, (java.lang.Object) boolean22);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        boolean boolean3 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int7 = hashMap6.modCount;
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) int7);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        hashMap9.modCount = 0;
        boolean boolean12 = hashMap9.isEmpty();
        int int13 = hashMap9.size();
        java.lang.Object obj14 = hashMap0.get((java.lang.Object) hashMap9);
        int int15 = hashMap0.size();
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        int int17 = hashMap16.size();
        system.testclass.HashMap.Entry[] entryArray18 = hashMap16.table;
        system.testclass.HashMap.Entry[] entryArray19 = new system.testclass.HashMap.Entry[] {};
        hashMap16.table = entryArray19;
        java.lang.Object obj21 = hashMap0.remove((java.lang.Object) hashMap16);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        int int23 = hashMap22.size();
        system.testclass.HashMap.Entry[] entryArray24 = hashMap22.table;
        hashMap0.table = entryArray24;
        int int26 = hashMap0.modCount;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        boolean boolean3 = hashMap2.isEmpty();
        system.testclass.HashMap.Entry[] entryArray4 = hashMap2.table;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap(0);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object obj8 = hashMap6.remove(obj7);
        java.lang.Object obj9 = hashMap2.remove((java.lang.Object) hashMap6);
        int int10 = hashMap2.modCount;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.size();
        int int13 = hashMap11.size();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap(0);
        boolean boolean16 = hashMap15.isEmpty();
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap((int) 'a', (float) (byte) 1);
        java.lang.Object obj20 = hashMap15.remove((java.lang.Object) hashMap19);
        java.lang.Object obj21 = hashMap2.put((java.lang.Object) hashMap11, (java.lang.Object) hashMap19);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        boolean boolean3 = hashMap0.isEmpty();
        int int4 = hashMap0.modCount;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        boolean boolean6 = hashMap5.isEmpty();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        int int9 = hashMap7.modCount;
        system.testclass.HashMap.Entry[] entryArray10 = hashMap7.table;
        java.lang.Object obj11 = hashMap5.get((java.lang.Object) entryArray10);
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap5);
        hashMap5.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap5", hashMap5.repOK_1());
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        boolean boolean3 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int7 = hashMap6.modCount;
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) int7);
        int int9 = hashMap0.modCount;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.size();
        system.testclass.HashMap.Entry[] entryArray12 = hashMap10.table;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        boolean boolean14 = hashMap13.isEmpty();
        java.lang.Object obj15 = hashMap10.remove((java.lang.Object) hashMap13);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        int int17 = hashMap16.modCount;
        int int18 = hashMap16.modCount;
        system.testclass.HashMap.Entry[] entryArray19 = hashMap16.table;
        hashMap10.table = entryArray19;
        java.lang.Object obj21 = hashMap0.get((java.lang.Object) hashMap10);
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap(0);
        java.lang.Object obj27 = hashMap24.get((java.lang.Object) hashMap26);
        int int28 = hashMap24.modCount;
        int int29 = hashMap24.modCount;
        boolean boolean30 = hashMap24.isEmpty();
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int34 = hashMap33.modCount;
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        boolean boolean36 = hashMap35.isEmpty();
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        int int38 = hashMap37.modCount;
        int int39 = hashMap37.modCount;
        system.testclass.HashMap.Entry[] entryArray40 = hashMap37.table;
        java.lang.Object obj41 = hashMap35.get((java.lang.Object) entryArray40);
        hashMap33.table = entryArray40;
        java.lang.Object obj43 = hashMap0.put((java.lang.Object) hashMap24, (java.lang.Object) entryArray40);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap(0);
        java.lang.Object obj5 = hashMap2.get((java.lang.Object) hashMap4);
        int int6 = hashMap4.size();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        int int9 = hashMap7.size();
        boolean boolean10 = hashMap7.isEmpty();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int14 = hashMap13.modCount;
        java.lang.Object obj15 = hashMap7.remove((java.lang.Object) int14);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        hashMap16.modCount = 0;
        boolean boolean19 = hashMap16.isEmpty();
        int int20 = hashMap16.size();
        java.lang.Object obj21 = hashMap7.get((java.lang.Object) hashMap16);
        java.lang.Object obj22 = hashMap4.remove(obj21);
        int int23 = hashMap4.modCount;
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap((int) (byte) 1);
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        hashMap26.modCount = 0;
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        int int30 = hashMap29.modCount;
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray34 = hashMap33.table;
        java.lang.Object obj35 = hashMap29.remove((java.lang.Object) entryArray34);
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        boolean boolean37 = hashMap36.isEmpty();
        int int38 = hashMap36.size();
        boolean boolean39 = hashMap36.isEmpty();
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int43 = hashMap42.modCount;
        java.lang.Object obj44 = hashMap36.remove((java.lang.Object) int43);
        int int45 = hashMap36.modCount;
        system.testclass.HashMap.Entry[] entryArray46 = hashMap36.table;
        java.lang.Object obj47 = hashMap29.get((java.lang.Object) hashMap36);
        hashMap29.modCount = (short) 0;
        java.lang.Object obj50 = hashMap26.remove((java.lang.Object) hashMap29);
        int int51 = hashMap26.size();
        java.lang.Object obj52 = hashMap25.remove((java.lang.Object) int51);
        system.testclass.HashMap hashMap53 = new system.testclass.HashMap();
        int int54 = hashMap53.size();
        system.testclass.HashMap hashMap57 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int58 = hashMap57.modCount;
        system.testclass.HashMap hashMap59 = new system.testclass.HashMap();
        boolean boolean60 = hashMap59.isEmpty();
        system.testclass.HashMap hashMap61 = new system.testclass.HashMap();
        int int62 = hashMap61.modCount;
        int int63 = hashMap61.modCount;
        system.testclass.HashMap.Entry[] entryArray64 = hashMap61.table;
        java.lang.Object obj65 = hashMap59.get((java.lang.Object) entryArray64);
        hashMap57.table = entryArray64;
        hashMap53.table = entryArray64;
        system.testclass.HashMap hashMap70 = new system.testclass.HashMap((int) '#', (float) 'a');
        system.testclass.HashMap hashMap73 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray74 = hashMap73.table;
        hashMap70.table = entryArray74;
        java.lang.Object obj76 = hashMap53.get((java.lang.Object) hashMap70);
        system.testclass.HashMap.Entry[] entryArray77 = hashMap53.table;
        java.lang.Object obj78 = hashMap4.put((java.lang.Object) hashMap25, (java.lang.Object) entryArray77);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap4", hashMap4.repOK_1());
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        boolean boolean3 = hashMap2.isEmpty();
        hashMap2.modCount = 0;
        boolean boolean6 = hashMap2.isEmpty();
        system.testclass.HashMap.Entry[] entryArray7 = hashMap2.table;
        system.testclass.HashMap.Entry[] entryArray8 = hashMap2.table;
        hashMap2.modCount = 'a';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap(0);
        java.lang.Object obj5 = hashMap2.get((java.lang.Object) hashMap4);
        int int6 = hashMap4.size();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        int int9 = hashMap7.size();
        boolean boolean10 = hashMap7.isEmpty();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int14 = hashMap13.modCount;
        java.lang.Object obj15 = hashMap7.remove((java.lang.Object) int14);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        hashMap16.modCount = 0;
        boolean boolean19 = hashMap16.isEmpty();
        int int20 = hashMap16.size();
        java.lang.Object obj21 = hashMap7.get((java.lang.Object) hashMap16);
        java.lang.Object obj22 = hashMap4.remove(obj21);
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        boolean boolean24 = hashMap23.isEmpty();
        int int25 = hashMap23.size();
        boolean boolean26 = hashMap23.isEmpty();
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int30 = hashMap29.modCount;
        java.lang.Object obj31 = hashMap23.remove((java.lang.Object) int30);
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        hashMap32.modCount = 0;
        boolean boolean35 = hashMap32.isEmpty();
        int int36 = hashMap32.size();
        java.lang.Object obj37 = hashMap23.get((java.lang.Object) hashMap32);
        int int38 = hashMap23.size();
        java.lang.Object obj39 = hashMap4.remove((java.lang.Object) hashMap23);
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        int int41 = hashMap40.size();
        system.testclass.HashMap.Entry[] entryArray42 = hashMap40.table;
        system.testclass.HashMap.Entry[] entryArray43 = new system.testclass.HashMap.Entry[] {};
        hashMap40.table = entryArray43;
        java.lang.Class<?> wildcardClass45 = hashMap40.getClass();
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap((int) 'a', (float) 1);
        java.lang.Object obj49 = hashMap4.put((java.lang.Object) hashMap40, (java.lang.Object) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap4", hashMap4.repOK_1());
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray2 = hashMap0.table;
        system.testclass.HashMap.Entry[] entryArray3 = new system.testclass.HashMap.Entry[] {};
        hashMap0.table = entryArray3;
        int int5 = hashMap0.size();
        int int6 = hashMap0.modCount;
        int int7 = hashMap0.modCount;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray5 = hashMap4.table;
        java.lang.Object obj6 = hashMap0.remove((java.lang.Object) entryArray5);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        int int9 = hashMap7.size();
        boolean boolean10 = hashMap7.isEmpty();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int14 = hashMap13.modCount;
        java.lang.Object obj15 = hashMap7.remove((java.lang.Object) int14);
        int int16 = hashMap7.modCount;
        system.testclass.HashMap.Entry[] entryArray17 = hashMap7.table;
        java.lang.Object obj18 = hashMap0.get((java.lang.Object) hashMap7);
        hashMap0.modCount = (short) 0;
        hashMap0.modCount = (byte) 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.size();
        int int2 = hashMap0.modCount;
        int int3 = hashMap0.modCount;
        int int4 = hashMap0.size();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) '4', (float) 10L);
        boolean boolean8 = hashMap7.isEmpty();
        hashMap7.modCount = 0;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray14 = hashMap13.table;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray20 = hashMap19.table;
        java.lang.Object obj21 = hashMap15.remove((java.lang.Object) entryArray20);
        hashMap13.table = entryArray20;
        hashMap7.table = entryArray20;
        java.lang.Object obj24 = hashMap0.get((java.lang.Object) entryArray20);
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (short) 100);
        int int3 = hashMap2.modCount;
        hashMap2.modCount = (byte) 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        boolean boolean3 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int7 = hashMap6.modCount;
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) int7);
        int int9 = hashMap0.modCount;
        hashMap0.modCount = 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        int int3 = hashMap0.size();
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(1, (float) (byte) 1);
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        boolean boolean3 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int7 = hashMap6.modCount;
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) int7);
        int int9 = hashMap0.modCount;
        int int10 = hashMap0.size();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap(0);
        int int13 = hashMap12.size();
        java.lang.Object obj15 = hashMap12.get((java.lang.Object) 100L);
        int int16 = hashMap12.size();
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        int int18 = hashMap17.size();
        system.testclass.HashMap.Entry[] entryArray19 = hashMap17.table;
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        boolean boolean21 = hashMap20.isEmpty();
        java.lang.Object obj22 = hashMap17.remove((java.lang.Object) hashMap20);
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        int int24 = hashMap23.modCount;
        int int25 = hashMap23.modCount;
        system.testclass.HashMap.Entry[] entryArray26 = hashMap23.table;
        hashMap17.table = entryArray26;
        hashMap12.table = entryArray26;
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        int int30 = hashMap29.modCount;
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray34 = hashMap33.table;
        java.lang.Object obj35 = hashMap29.remove((java.lang.Object) entryArray34);
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap(0);
        java.lang.Object obj41 = hashMap38.get((java.lang.Object) hashMap40);
        int int42 = hashMap38.modCount;
        java.lang.Object obj43 = hashMap29.remove((java.lang.Object) int42);
        system.testclass.HashMap hashMap46 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj47 = new java.lang.Object();
        java.lang.Object obj48 = hashMap46.remove(obj47);
        system.testclass.HashMap hashMap51 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap53 = new system.testclass.HashMap(0);
        java.lang.Object obj54 = hashMap51.get((java.lang.Object) hashMap53);
        system.testclass.HashMap hashMap55 = new system.testclass.HashMap();
        int int56 = hashMap55.modCount;
        system.testclass.HashMap hashMap59 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray60 = hashMap59.table;
        hashMap55.table = entryArray60;
        hashMap51.table = entryArray60;
        hashMap46.table = entryArray60;
        java.lang.Object obj64 = hashMap29.get((java.lang.Object) entryArray60);
        hashMap12.table = entryArray60;
        java.lang.Object obj66 = hashMap0.get((java.lang.Object) hashMap12);
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 100, (float) 1);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        hashMap3.modCount = 0;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int9 = hashMap8.modCount;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray18 = hashMap17.table;
        hashMap13.table = entryArray18;
        java.lang.Object obj20 = hashMap12.remove((java.lang.Object) entryArray18);
        hashMap8.table = entryArray18;
        java.lang.Object obj22 = hashMap3.remove((java.lang.Object) hashMap8);
        system.testclass.HashMap.Entry[] entryArray23 = hashMap3.table;
        hashMap2.table = entryArray23;
        hashMap2.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int5 = hashMap4.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray14 = hashMap13.table;
        hashMap9.table = entryArray14;
        java.lang.Object obj16 = hashMap8.remove((java.lang.Object) entryArray14);
        hashMap4.table = entryArray14;
        int int18 = hashMap4.modCount;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        int int20 = hashMap19.modCount;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray24 = hashMap23.table;
        java.lang.Object obj25 = hashMap19.remove((java.lang.Object) entryArray24);
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap(0);
        java.lang.Object obj31 = hashMap28.get((java.lang.Object) hashMap30);
        int int32 = hashMap28.modCount;
        java.lang.Object obj33 = hashMap19.remove((java.lang.Object) int32);
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj37 = new java.lang.Object();
        java.lang.Object obj38 = hashMap36.remove(obj37);
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap(0);
        java.lang.Object obj44 = hashMap41.get((java.lang.Object) hashMap43);
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        int int46 = hashMap45.modCount;
        system.testclass.HashMap hashMap49 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray50 = hashMap49.table;
        hashMap45.table = entryArray50;
        hashMap41.table = entryArray50;
        hashMap36.table = entryArray50;
        java.lang.Object obj54 = hashMap19.get((java.lang.Object) entryArray50);
        system.testclass.HashMap hashMap55 = new system.testclass.HashMap();
        java.lang.Object obj57 = hashMap55.get((java.lang.Object) 0.0f);
        system.testclass.HashMap hashMap60 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray61 = hashMap60.table;
        hashMap55.table = entryArray61;
        hashMap19.table = entryArray61;
        boolean boolean64 = hashMap19.isEmpty();
        java.lang.Object obj65 = hashMap1.put((java.lang.Object) int18, (java.lang.Object) boolean64);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) ' ');
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap(0);
        java.lang.Object obj7 = hashMap4.get((java.lang.Object) hashMap6);
        int int8 = hashMap6.size();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        int int11 = hashMap9.size();
        boolean boolean12 = hashMap9.isEmpty();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int16 = hashMap15.modCount;
        java.lang.Object obj17 = hashMap9.remove((java.lang.Object) int16);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        hashMap18.modCount = 0;
        boolean boolean21 = hashMap18.isEmpty();
        int int22 = hashMap18.size();
        java.lang.Object obj23 = hashMap9.get((java.lang.Object) hashMap18);
        java.lang.Object obj24 = hashMap6.remove(obj23);
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        int int26 = hashMap25.modCount;
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray30 = hashMap29.table;
        java.lang.Object obj31 = hashMap25.remove((java.lang.Object) entryArray30);
        java.lang.Class<?> wildcardClass32 = hashMap25.getClass();
        java.lang.Object obj33 = hashMap6.remove((java.lang.Object) hashMap25);
        java.lang.Object obj34 = hashMap1.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap((int) '#', (float) 'a');
        system.testclass.HashMap.Entry[] entryArray38 = hashMap37.table;
        hashMap6.table = entryArray38;
        hashMap6.modCount = (short) 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap6", hashMap6.repOK_1());
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        int int2 = hashMap1.size();
        int int3 = hashMap1.size();
        int int4 = hashMap1.size();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        hashMap5.modCount = 0;
        boolean boolean8 = hashMap5.isEmpty();
        int int9 = hashMap5.size();
        system.testclass.HashMap.Entry[] entryArray10 = hashMap5.table;
        java.lang.Class<?> wildcardClass11 = hashMap5.getClass();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        int int13 = hashMap12.modCount;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray17 = hashMap16.table;
        java.lang.Object obj18 = hashMap12.remove((java.lang.Object) entryArray17);
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap(0);
        java.lang.Object obj24 = hashMap21.get((java.lang.Object) hashMap23);
        int int25 = hashMap21.modCount;
        java.lang.Object obj26 = hashMap12.remove((java.lang.Object) int25);
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj30 = new java.lang.Object();
        java.lang.Object obj31 = hashMap29.remove(obj30);
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap(0);
        java.lang.Object obj37 = hashMap34.get((java.lang.Object) hashMap36);
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        int int39 = hashMap38.modCount;
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray43 = hashMap42.table;
        hashMap38.table = entryArray43;
        hashMap34.table = entryArray43;
        hashMap29.table = entryArray43;
        java.lang.Object obj47 = hashMap12.get((java.lang.Object) entryArray43);
        java.lang.Class<?> wildcardClass48 = entryArray43.getClass();
        java.lang.Object obj49 = hashMap1.put((java.lang.Object) wildcardClass11, (java.lang.Object) wildcardClass48);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.size();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int5 = hashMap4.modCount;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.modCount;
        int int10 = hashMap8.modCount;
        system.testclass.HashMap.Entry[] entryArray11 = hashMap8.table;
        java.lang.Object obj12 = hashMap6.get((java.lang.Object) entryArray11);
        hashMap4.table = entryArray11;
        hashMap0.table = entryArray11;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap((int) '#', (float) 'a');
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray21 = hashMap20.table;
        hashMap17.table = entryArray21;
        java.lang.Object obj23 = hashMap0.get((java.lang.Object) hashMap17);
        hashMap17.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap17", hashMap17.repOK_1());
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray2 = hashMap0.table;
        system.testclass.HashMap.Entry[] entryArray3 = new system.testclass.HashMap.Entry[] {};
        hashMap0.table = entryArray3;
        int int5 = hashMap0.size();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.modCount;
        int int10 = hashMap8.modCount;
        system.testclass.HashMap.Entry[] entryArray11 = hashMap8.table;
        java.lang.Object obj12 = hashMap6.get((java.lang.Object) entryArray11);
        hashMap0.table = entryArray11;
        hashMap0.modCount = (short) 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap(0);
        java.lang.Object obj5 = hashMap2.get((java.lang.Object) hashMap4);
        int int6 = hashMap4.size();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.size();
        system.testclass.HashMap.Entry[] entryArray9 = hashMap7.table;
        hashMap7.modCount = 0;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap(0);
        int int14 = hashMap13.size();
        java.lang.Object obj16 = hashMap13.remove((java.lang.Object) (byte) 100);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        boolean boolean18 = hashMap17.isEmpty();
        java.lang.Object obj19 = hashMap13.remove((java.lang.Object) hashMap17);
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        int int21 = hashMap20.size();
        system.testclass.HashMap.Entry[] entryArray22 = hashMap20.table;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        boolean boolean24 = hashMap23.isEmpty();
        java.lang.Object obj25 = hashMap20.remove((java.lang.Object) hashMap23);
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        int int27 = hashMap26.modCount;
        int int28 = hashMap26.modCount;
        system.testclass.HashMap.Entry[] entryArray29 = hashMap26.table;
        hashMap20.table = entryArray29;
        hashMap13.table = entryArray29;
        hashMap7.table = entryArray29;
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap.Entry[] entryArray36 = new system.testclass.HashMap.Entry[] {};
        hashMap35.table = entryArray36;
        hashMap7.table = entryArray36;
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        int int40 = hashMap39.size();
        system.testclass.HashMap.Entry[] entryArray41 = hashMap39.table;
        hashMap39.modCount = 0;
        int int44 = hashMap39.size();
        java.lang.Object obj45 = hashMap4.put((java.lang.Object) entryArray36, (java.lang.Object) int44);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap4", hashMap4.repOK_1());
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        boolean boolean3 = hashMap2.isEmpty();
        system.testclass.HashMap.Entry[] entryArray4 = hashMap2.table;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap(0);
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object obj8 = hashMap6.remove(obj7);
        java.lang.Object obj9 = hashMap2.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap(0);
        int int12 = hashMap11.size();
        java.lang.Object obj14 = hashMap11.get((java.lang.Object) 100L);
        int int15 = hashMap11.modCount;
        boolean boolean16 = hashMap11.isEmpty();
        system.testclass.HashMap.Entry[] entryArray17 = hashMap11.table;
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap(0);
        java.lang.Object obj23 = hashMap20.get((java.lang.Object) hashMap22);
        java.lang.Object obj24 = hashMap6.put((java.lang.Object) entryArray17, (java.lang.Object) hashMap22);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap6", hashMap6.repOK_1());
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap(0);
        java.lang.Object obj5 = hashMap2.get((java.lang.Object) hashMap4);
        int int6 = hashMap4.size();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        int int9 = hashMap7.size();
        boolean boolean10 = hashMap7.isEmpty();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int14 = hashMap13.modCount;
        java.lang.Object obj15 = hashMap7.remove((java.lang.Object) int14);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        hashMap16.modCount = 0;
        boolean boolean19 = hashMap16.isEmpty();
        int int20 = hashMap16.size();
        java.lang.Object obj21 = hashMap7.get((java.lang.Object) hashMap16);
        java.lang.Object obj22 = hashMap4.remove(obj21);
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        boolean boolean24 = hashMap23.isEmpty();
        int int25 = hashMap23.size();
        boolean boolean26 = hashMap23.isEmpty();
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int30 = hashMap29.modCount;
        java.lang.Object obj31 = hashMap23.remove((java.lang.Object) int30);
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        hashMap32.modCount = 0;
        boolean boolean35 = hashMap32.isEmpty();
        int int36 = hashMap32.size();
        java.lang.Object obj37 = hashMap23.get((java.lang.Object) hashMap32);
        int int38 = hashMap23.size();
        java.lang.Object obj39 = hashMap4.remove((java.lang.Object) hashMap23);
        hashMap23.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap23", hashMap23.repOK_1());
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        boolean boolean2 = hashMap1.isEmpty();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) 'a', (float) (byte) 1);
        java.lang.Object obj6 = hashMap1.remove((java.lang.Object) hashMap5);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray10 = hashMap9.table;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray16 = hashMap15.table;
        java.lang.Object obj17 = hashMap11.remove((java.lang.Object) entryArray16);
        hashMap9.table = entryArray16;
        hashMap1.table = entryArray16;
        int int20 = hashMap1.modCount;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        int int22 = hashMap21.modCount;
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray26 = hashMap25.table;
        java.lang.Object obj27 = hashMap21.remove((java.lang.Object) entryArray26);
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap(0);
        java.lang.Object obj33 = hashMap30.get((java.lang.Object) hashMap32);
        int int34 = hashMap30.modCount;
        java.lang.Object obj35 = hashMap21.remove((java.lang.Object) int34);
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj39 = new java.lang.Object();
        java.lang.Object obj40 = hashMap38.remove(obj39);
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap(0);
        java.lang.Object obj46 = hashMap43.get((java.lang.Object) hashMap45);
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap();
        int int48 = hashMap47.modCount;
        system.testclass.HashMap hashMap51 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray52 = hashMap51.table;
        hashMap47.table = entryArray52;
        hashMap43.table = entryArray52;
        hashMap38.table = entryArray52;
        java.lang.Object obj56 = hashMap21.get((java.lang.Object) entryArray52);
        system.testclass.HashMap.Entry[] entryArray57 = hashMap21.table;
        hashMap1.table = entryArray57;
        system.testclass.HashMap hashMap61 = new system.testclass.HashMap((int) '4', (float) 10L);
        boolean boolean62 = hashMap61.isEmpty();
        boolean boolean63 = hashMap61.isEmpty();
        system.testclass.HashMap.Entry[] entryArray64 = hashMap61.table;
        system.testclass.HashMap.Entry[] entryArray65 = hashMap61.table;
        system.testclass.HashMap hashMap66 = new system.testclass.HashMap();
        boolean boolean67 = hashMap66.isEmpty();
        int int68 = hashMap66.size();
        system.testclass.HashMap hashMap69 = new system.testclass.HashMap();
        java.lang.Class<?> wildcardClass70 = hashMap69.getClass();
        java.lang.Object obj71 = hashMap66.get((java.lang.Object) hashMap69);
        java.lang.Class<?> wildcardClass72 = hashMap66.getClass();
        java.lang.Object obj73 = hashMap1.put((java.lang.Object) hashMap61, (java.lang.Object) hashMap66);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        boolean boolean3 = hashMap0.isEmpty();
        int int4 = hashMap0.size();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap(0);
        int int7 = hashMap6.size();
        java.lang.Object obj9 = hashMap6.get((java.lang.Object) 100L);
        int int10 = hashMap6.size();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray16 = hashMap15.table;
        java.lang.Object obj17 = hashMap11.remove((java.lang.Object) entryArray16);
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap(0);
        java.lang.Object obj23 = hashMap20.get((java.lang.Object) hashMap22);
        int int24 = hashMap20.modCount;
        java.lang.Object obj25 = hashMap11.remove((java.lang.Object) int24);
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj29 = new java.lang.Object();
        java.lang.Object obj30 = hashMap28.remove(obj29);
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap(0);
        java.lang.Object obj36 = hashMap33.get((java.lang.Object) hashMap35);
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        int int38 = hashMap37.modCount;
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray42 = hashMap41.table;
        hashMap37.table = entryArray42;
        hashMap33.table = entryArray42;
        hashMap28.table = entryArray42;
        java.lang.Object obj46 = hashMap11.get((java.lang.Object) entryArray42);
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap();
        java.lang.Object obj49 = hashMap47.get((java.lang.Object) 0.0f);
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray53 = hashMap52.table;
        hashMap47.table = entryArray53;
        hashMap11.table = entryArray53;
        java.lang.Object obj56 = hashMap6.remove((java.lang.Object) hashMap11);
        system.testclass.HashMap hashMap59 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray60 = hashMap59.table;
        java.lang.Object obj61 = hashMap11.get((java.lang.Object) hashMap59);
        system.testclass.HashMap hashMap62 = new system.testclass.HashMap();
        int int63 = hashMap62.modCount;
        system.testclass.HashMap hashMap66 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray67 = hashMap66.table;
        java.lang.Object obj68 = hashMap62.remove((java.lang.Object) entryArray67);
        system.testclass.HashMap hashMap71 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap73 = new system.testclass.HashMap(0);
        java.lang.Object obj74 = hashMap71.get((java.lang.Object) hashMap73);
        int int75 = hashMap71.modCount;
        java.lang.Object obj76 = hashMap62.remove((java.lang.Object) int75);
        system.testclass.HashMap hashMap79 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj80 = new java.lang.Object();
        java.lang.Object obj81 = hashMap79.remove(obj80);
        system.testclass.HashMap hashMap84 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap86 = new system.testclass.HashMap(0);
        java.lang.Object obj87 = hashMap84.get((java.lang.Object) hashMap86);
        system.testclass.HashMap hashMap88 = new system.testclass.HashMap();
        int int89 = hashMap88.modCount;
        system.testclass.HashMap hashMap92 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray93 = hashMap92.table;
        hashMap88.table = entryArray93;
        hashMap84.table = entryArray93;
        hashMap79.table = entryArray93;
        java.lang.Object obj97 = hashMap62.get((java.lang.Object) entryArray93);
        system.testclass.HashMap.Entry[] entryArray98 = hashMap62.table;
        java.lang.Object obj99 = hashMap0.put((java.lang.Object) hashMap11, (java.lang.Object) entryArray98);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        boolean boolean3 = hashMap2.isEmpty();
        hashMap2.modCount = 0;
        boolean boolean6 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        int int9 = hashMap7.size();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        java.lang.Class<?> wildcardClass11 = hashMap10.getClass();
        java.lang.Object obj12 = hashMap7.get((java.lang.Object) hashMap10);
        int int13 = hashMap7.size();
        int int14 = hashMap7.modCount;
        java.lang.Object obj15 = hashMap2.get((java.lang.Object) int14);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        int int17 = hashMap16.size();
        system.testclass.HashMap.Entry[] entryArray18 = hashMap16.table;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap((int) '4', (float) 10L);
        boolean boolean22 = hashMap21.isEmpty();
        hashMap21.modCount = 0;
        boolean boolean25 = hashMap21.isEmpty();
        int int26 = hashMap21.size();
        java.lang.Object obj27 = hashMap2.put((java.lang.Object) hashMap16, (java.lang.Object) hashMap21);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '#', (float) 'a');
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray6 = hashMap5.table;
        hashMap2.table = entryArray6;
        int int8 = hashMap2.modCount;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        int int11 = hashMap9.size();
        boolean boolean12 = hashMap9.isEmpty();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int16 = hashMap15.modCount;
        java.lang.Object obj17 = hashMap9.remove((java.lang.Object) int16);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        hashMap18.modCount = 0;
        boolean boolean21 = hashMap18.isEmpty();
        int int22 = hashMap18.size();
        java.lang.Object obj23 = hashMap9.get((java.lang.Object) hashMap18);
        int int24 = hashMap9.size();
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        int int26 = hashMap25.size();
        system.testclass.HashMap.Entry[] entryArray27 = hashMap25.table;
        system.testclass.HashMap.Entry[] entryArray28 = new system.testclass.HashMap.Entry[] {};
        hashMap25.table = entryArray28;
        java.lang.Object obj30 = hashMap9.remove((java.lang.Object) hashMap25);
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        int int32 = hashMap31.size();
        system.testclass.HashMap.Entry[] entryArray33 = hashMap31.table;
        hashMap9.table = entryArray33;
        java.lang.Class<?> wildcardClass35 = entryArray33.getClass();
        java.lang.Object obj36 = hashMap2.remove((java.lang.Object) entryArray33);
        hashMap2.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int6 = hashMap5.modCount;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.modCount;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray15 = hashMap14.table;
        hashMap10.table = entryArray15;
        java.lang.Object obj17 = hashMap9.remove((java.lang.Object) entryArray15);
        hashMap5.table = entryArray15;
        java.lang.Object obj19 = hashMap0.remove((java.lang.Object) hashMap5);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap(1, (float) 100L);
        java.lang.Object obj23 = hashMap0.remove((java.lang.Object) hashMap22);
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        boolean boolean25 = hashMap24.isEmpty();
        int int26 = hashMap24.size();
        boolean boolean27 = hashMap24.isEmpty();
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int31 = hashMap30.modCount;
        java.lang.Object obj32 = hashMap24.remove((java.lang.Object) int31);
        int int33 = hashMap24.modCount;
        system.testclass.HashMap.Entry[] entryArray34 = hashMap24.table;
        boolean boolean35 = hashMap24.isEmpty();
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        int int37 = hashMap36.size();
        system.testclass.HashMap.Entry[] entryArray38 = hashMap36.table;
        system.testclass.HashMap.Entry[] entryArray39 = new system.testclass.HashMap.Entry[] {};
        hashMap36.table = entryArray39;
        int int41 = hashMap36.size();
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap();
        boolean boolean43 = hashMap42.isEmpty();
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap();
        int int45 = hashMap44.modCount;
        int int46 = hashMap44.modCount;
        system.testclass.HashMap.Entry[] entryArray47 = hashMap44.table;
        java.lang.Object obj48 = hashMap42.get((java.lang.Object) entryArray47);
        hashMap36.table = entryArray47;
        java.lang.Object obj50 = hashMap0.put((java.lang.Object) hashMap24, (java.lang.Object) hashMap36);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        boolean boolean3 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int7 = hashMap6.modCount;
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) int7);
        int int9 = hashMap0.modCount;
        int int10 = hashMap0.size();
        hashMap0.modCount = 'a';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int3 = hashMap2.modCount;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray12 = hashMap11.table;
        hashMap7.table = entryArray12;
        java.lang.Object obj14 = hashMap6.remove((java.lang.Object) entryArray12);
        hashMap2.table = entryArray12;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        boolean boolean17 = hashMap16.isEmpty();
        int int18 = hashMap16.size();
        java.lang.Object obj19 = hashMap2.remove((java.lang.Object) int18);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap((int) '4', (float) 10L);
        boolean boolean23 = hashMap22.isEmpty();
        hashMap22.modCount = 0;
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int29 = hashMap28.modCount;
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        int int34 = hashMap33.modCount;
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray38 = hashMap37.table;
        hashMap33.table = entryArray38;
        java.lang.Object obj40 = hashMap32.remove((java.lang.Object) entryArray38);
        hashMap28.table = entryArray38;
        hashMap22.table = entryArray38;
        hashMap2.table = entryArray38;
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap(0);
        int int46 = hashMap45.size();
        int int47 = hashMap45.size();
        int int48 = hashMap45.size();
        java.lang.Object obj49 = hashMap2.get((java.lang.Object) hashMap45);
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        boolean boolean3 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int7 = hashMap6.modCount;
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) int7);
        int int9 = hashMap0.modCount;
        boolean boolean10 = hashMap0.isEmpty();
        system.testclass.HashMap.Entry[] entryArray11 = hashMap0.table;
        hashMap0.modCount = (short) 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray2 = hashMap0.table;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) hashMap3);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.modCount;
        int int8 = hashMap6.modCount;
        system.testclass.HashMap.Entry[] entryArray9 = hashMap6.table;
        hashMap0.table = entryArray9;
        hashMap0.modCount = ' ';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) 'a', (float) (byte) 1);
        int int3 = hashMap2.size();
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (short) 100);
        java.lang.Object obj4 = hashMap2.get((java.lang.Object) ' ');
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) '4', 10.0f);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        hashMap8.modCount = 0;
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = hashMap8.remove(obj11);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        system.testclass.HashMap.Entry[] entryArray16 = hashMap13.table;
        hashMap8.table = entryArray16;
        java.lang.Object obj18 = hashMap2.put((java.lang.Object) hashMap7, (java.lang.Object) entryArray16);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) 'a', (float) (byte) 1);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) '4', (float) 10L);
        boolean boolean6 = hashMap5.isEmpty();
        hashMap5.modCount = 0;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int12 = hashMap11.modCount;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        int int17 = hashMap16.modCount;
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray21 = hashMap20.table;
        hashMap16.table = entryArray21;
        java.lang.Object obj23 = hashMap15.remove((java.lang.Object) entryArray21);
        hashMap11.table = entryArray21;
        hashMap5.table = entryArray21;
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        int int27 = hashMap26.size();
        system.testclass.HashMap.Entry[] entryArray28 = hashMap26.table;
        java.lang.Object obj29 = hashMap5.get((java.lang.Object) hashMap26);
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap((int) '4', (float) 10L);
        boolean boolean33 = hashMap32.isEmpty();
        hashMap32.modCount = 0;
        boolean boolean36 = hashMap32.isEmpty();
        system.testclass.HashMap.Entry[] entryArray37 = hashMap32.table;
        int int38 = hashMap32.modCount;
        java.lang.Object obj39 = hashMap2.put(obj29, (java.lang.Object) int38);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        boolean boolean3 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int7 = hashMap6.modCount;
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) int7);
        int int9 = hashMap0.modCount;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.size();
        system.testclass.HashMap.Entry[] entryArray12 = hashMap10.table;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        boolean boolean14 = hashMap13.isEmpty();
        java.lang.Object obj15 = hashMap10.remove((java.lang.Object) hashMap13);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        int int17 = hashMap16.modCount;
        int int18 = hashMap16.modCount;
        system.testclass.HashMap.Entry[] entryArray19 = hashMap16.table;
        hashMap10.table = entryArray19;
        java.lang.Object obj21 = hashMap0.get((java.lang.Object) hashMap10);
        int int22 = hashMap0.size();
        java.lang.Object obj24 = hashMap0.get((java.lang.Object) (-1L));
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap(0);
        java.lang.Object obj5 = hashMap2.get((java.lang.Object) hashMap4);
        int int6 = hashMap4.size();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        int int9 = hashMap7.size();
        boolean boolean10 = hashMap7.isEmpty();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int14 = hashMap13.modCount;
        java.lang.Object obj15 = hashMap7.remove((java.lang.Object) int14);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        hashMap16.modCount = 0;
        boolean boolean19 = hashMap16.isEmpty();
        int int20 = hashMap16.size();
        java.lang.Object obj21 = hashMap7.get((java.lang.Object) hashMap16);
        java.lang.Object obj22 = hashMap4.remove(obj21);
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        boolean boolean24 = hashMap23.isEmpty();
        int int25 = hashMap23.size();
        boolean boolean26 = hashMap23.isEmpty();
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int30 = hashMap29.modCount;
        java.lang.Object obj31 = hashMap23.remove((java.lang.Object) int30);
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        hashMap32.modCount = 0;
        boolean boolean35 = hashMap32.isEmpty();
        int int36 = hashMap32.size();
        java.lang.Object obj37 = hashMap23.get((java.lang.Object) hashMap32);
        int int38 = hashMap23.size();
        java.lang.Object obj39 = hashMap4.remove((java.lang.Object) hashMap23);
        system.testclass.HashMap.Entry[] entryArray40 = hashMap23.table;
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap(0);
        java.lang.Object obj46 = hashMap43.get((java.lang.Object) hashMap45);
        int int47 = hashMap43.modCount;
        int int48 = hashMap43.modCount;
        java.lang.Class<?> wildcardClass49 = hashMap43.getClass();
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap((int) '4', (float) 10L);
        boolean boolean53 = hashMap52.isEmpty();
        hashMap52.modCount = 0;
        boolean boolean56 = hashMap52.isEmpty();
        system.testclass.HashMap.Entry[] entryArray57 = hashMap52.table;
        system.testclass.HashMap.Entry[] entryArray58 = hashMap52.table;
        java.lang.Object obj59 = hashMap23.put((java.lang.Object) wildcardClass49, (java.lang.Object) entryArray58);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap23", hashMap23.repOK_1());
    }
}

