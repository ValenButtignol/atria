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
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray1 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap0.table = entryArray1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        system.classfixer.classes.HashMap.Entry entry2 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray3 = new system.classfixer.classes.HashMap.Entry[] { entry2 };
        hashMap0.table = entryArray3;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj4 = hashMap0.put(obj2, (java.lang.Object) 100);
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        java.lang.Object obj8 = hashMap0.put((java.lang.Object) '#', (java.lang.Object) hashMap7);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj4 = hashMap0.put(obj2, (java.lang.Object) 100);
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap0.table;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        system.classfixer.classes.HashMap.Entry[] entryArray2 = null;
        hashMap1.table = entryArray2;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        int int3 = hashMap0.size();
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = hashMap0.remove(obj4);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Object obj9 = hashMap0.put((java.lang.Object) ' ', (java.lang.Object) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray5 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap4.table = entryArray5;
        hashMap0.table = entryArray5;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap(0);
        boolean boolean5 = hashMap4.isEmpty();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray8 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap7.table = entryArray8;
        hashMap4.table = entryArray8;
        hashMap0.table = entryArray8;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) '4', (float) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 0.0f);
        boolean boolean3 = hashMap0.isEmpty();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object obj5 = null;
        java.lang.Object obj6 = hashMap0.put(obj4, obj5);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        int int3 = hashMap0.size();
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = hashMap0.remove(obj4);
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.repOK();
        hashMap8.clear();
        int int11 = hashMap8.size();
        int int12 = hashMap8.size();
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = hashMap8.get((java.lang.Object) wildcardClass14);
        java.lang.Object obj16 = hashMap0.put((java.lang.Object) wildcardClass7, (java.lang.Object) wildcardClass14);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(100, (float) 1);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean5 = hashMap4.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap4.table;
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap4.table;
        int int8 = hashMap4.modCount;
        java.lang.Object obj10 = hashMap2.put((java.lang.Object) hashMap4, (java.lang.Object) (-1.0d));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.repOK();
        hashMap3.clear();
        int int6 = hashMap3.size();
        java.lang.Object obj8 = hashMap1.put((java.lang.Object) int6, (java.lang.Object) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        int int3 = hashMap0.size();
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = hashMap0.remove(obj4);
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap(0);
        int int8 = hashMap7.modCount;
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        java.lang.Object obj10 = hashMap0.put((java.lang.Object) hashMap7, (java.lang.Object) hashMap9);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(100, (float) 10L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        int int3 = hashMap0.size();
        int int4 = hashMap0.size();
        int int5 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean8 = hashMap7.isEmpty();
        boolean boolean9 = hashMap7.repOK();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap(0);
        boolean boolean12 = hashMap11.isEmpty();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray15 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap14.table = entryArray15;
        hashMap11.table = entryArray15;
        int int18 = hashMap11.size();
        java.lang.Object obj19 = hashMap0.put((java.lang.Object) boolean9, (java.lang.Object) int18);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        boolean boolean2 = hashMap1.repOK();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.repOK();
        hashMap3.clear();
        int int6 = hashMap3.size();
        int int7 = hashMap3.size();
        int int8 = hashMap3.size();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap3.table;
        hashMap1.table = entryArray9;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj3 = hashMap0.put(obj1, obj2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 1, (float) 100L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 10, (float) 101);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap4.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap4.table;
        boolean boolean7 = hashMap4.isEmpty();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) 'a');
        boolean boolean10 = hashMap9.isEmpty();
        boolean boolean11 = hashMap9.isEmpty();
        java.lang.Object obj12 = hashMap0.put((java.lang.Object) boolean7, (java.lang.Object) hashMap9);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean2 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap3.remove((java.lang.Object) 0.0f);
        java.lang.Object obj6 = hashMap1.get((java.lang.Object) hashMap3);
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap3.table;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.repOK();
        hashMap8.clear();
        int int11 = hashMap8.size();
        int int12 = hashMap8.size();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        java.lang.Object obj15 = hashMap13.remove((java.lang.Object) 0.0f);
        hashMap13.modCount = (byte) 100;
        java.lang.Object obj18 = hashMap8.get((java.lang.Object) (byte) 100);
        java.lang.Object obj20 = hashMap8.get((java.lang.Object) 0L);
        java.lang.Object obj21 = hashMap3.remove((java.lang.Object) hashMap8);
        boolean boolean22 = hashMap8.repOK();
        boolean boolean23 = hashMap8.repOK();
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean26 = hashMap25.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray27 = hashMap25.table;
        system.classfixer.classes.HashMap.Entry[] entryArray28 = hashMap25.table;
        hashMap8.table = entryArray28;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap8", hashMap8.repOK_2());
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        hashMap0.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray4 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap0.table = entryArray4;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj4 = hashMap0.put(obj2, (java.lang.Object) 100);
        int int5 = hashMap0.modCount;
        boolean boolean6 = hashMap0.isEmpty();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(1, (float) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean2 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap3.remove((java.lang.Object) 0.0f);
        java.lang.Object obj6 = hashMap1.get((java.lang.Object) hashMap3);
        int int7 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap9.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray11 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap9.table = entryArray11;
        int int13 = hashMap9.size();
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean16 = hashMap15.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap15.table;
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap15.table;
        java.lang.Object obj19 = hashMap1.put((java.lang.Object) int13, (java.lang.Object) entryArray18);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 0.0f);
        hashMap0.modCount = (byte) 100;
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap0.table;
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap8.clear();
        int int10 = hashMap8.size();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean13 = hashMap12.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap12.table;
        java.lang.Object obj15 = hashMap8.get((java.lang.Object) entryArray14);
        hashMap0.table = entryArray14;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(100, (float) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        int int2 = hashMap1.size();
        hashMap1.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(100);
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        java.lang.Object obj4 = hashMap2.remove((java.lang.Object) 0.0f);
        hashMap2.modCount = (byte) 100;
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap2.table;
        hashMap1.table = entryArray7;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean2 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap1.table;
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap1.table;
        boolean boolean5 = hashMap1.isEmpty();
        hashMap1.clear();
        boolean boolean7 = hashMap1.repOK();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean11 = hashMap10.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap10.table;
        java.lang.Object obj13 = hashMap1.put((java.lang.Object) "", (java.lang.Object) hashMap10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj4 = hashMap0.put(obj2, (java.lang.Object) 100);
        int int5 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        boolean boolean7 = hashMap6.repOK();
        hashMap6.clear();
        int int9 = hashMap6.size();
        int int10 = hashMap6.size();
        int int11 = hashMap6.size();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap6.table;
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap6.table;
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = hashMap0.put((java.lang.Object) entryArray13, obj14);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 1, (float) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(10, (float) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 0.0f);
        boolean boolean3 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap5.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap5.table;
        hashMap0.table = entryArray7;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean2 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap1.table;
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap1.table;
        int int5 = hashMap1.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap1.table;
        int int7 = hashMap1.modCount;
        hashMap1.modCount = (byte) 0;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        boolean boolean11 = hashMap10.repOK();
        hashMap10.clear();
        int int13 = hashMap10.size();
        int int14 = hashMap10.size();
        java.lang.Object obj16 = hashMap10.get((java.lang.Object) (byte) 100);
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        java.lang.Object obj19 = hashMap17.remove((java.lang.Object) 0.0f);
        hashMap17.modCount = (byte) 100;
        system.classfixer.classes.HashMap.Entry[] entryArray22 = hashMap17.table;
        hashMap10.table = entryArray22;
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap();
        boolean boolean25 = hashMap24.repOK();
        hashMap24.clear();
        int int27 = hashMap24.size();
        int int28 = hashMap24.size();
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap();
        java.lang.Object obj31 = hashMap29.remove((java.lang.Object) 0.0f);
        hashMap29.modCount = (byte) 100;
        java.lang.Object obj34 = hashMap24.get((java.lang.Object) (byte) 100);
        java.lang.Object obj36 = hashMap24.get((java.lang.Object) 0L);
        java.lang.Object obj37 = hashMap10.remove(obj36);
        java.lang.Object obj38 = hashMap1.get((java.lang.Object) hashMap10);
        system.classfixer.classes.HashMap hashMap40 = new system.classfixer.classes.HashMap((int) 'a');
        boolean boolean41 = hashMap40.repOK();
        hashMap40.clear();
        system.classfixer.classes.HashMap hashMap43 = new system.classfixer.classes.HashMap();
        hashMap43.clear();
        hashMap43.clear();
        java.lang.Object obj46 = hashMap10.put((java.lang.Object) hashMap40, (java.lang.Object) hashMap43);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap10", hashMap10.repOK_2());
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray2 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap1.table = entryArray2;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean6 = hashMap5.isEmpty();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        java.lang.Object obj9 = hashMap7.remove((java.lang.Object) 0.0f);
        java.lang.Object obj10 = hashMap5.get((java.lang.Object) hashMap7);
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap7.table;
        hashMap1.table = entryArray11;
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap1.table;
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap(0);
        int int16 = hashMap15.size();
        hashMap15.clear();
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        java.lang.Object obj20 = hashMap18.remove((java.lang.Object) 0.0f);
        hashMap18.modCount = (byte) 100;
        system.classfixer.classes.HashMap.Entry[] entryArray23 = hashMap18.table;
        java.lang.Object obj24 = hashMap1.put((java.lang.Object) hashMap15, (java.lang.Object) entryArray23);
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean27 = hashMap26.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray28 = hashMap26.table;
        system.classfixer.classes.HashMap.Entry[] entryArray29 = hashMap26.table;
        int int30 = hashMap26.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray31 = hashMap26.table;
        int int32 = hashMap26.modCount;
        hashMap26.modCount = (byte) 0;
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap();
        boolean boolean36 = hashMap35.repOK();
        hashMap35.clear();
        int int38 = hashMap35.size();
        int int39 = hashMap35.size();
        java.lang.Object obj41 = hashMap35.get((java.lang.Object) (byte) 100);
        system.classfixer.classes.HashMap hashMap42 = new system.classfixer.classes.HashMap();
        java.lang.Object obj44 = hashMap42.remove((java.lang.Object) 0.0f);
        hashMap42.modCount = (byte) 100;
        system.classfixer.classes.HashMap.Entry[] entryArray47 = hashMap42.table;
        hashMap35.table = entryArray47;
        system.classfixer.classes.HashMap hashMap49 = new system.classfixer.classes.HashMap();
        boolean boolean50 = hashMap49.repOK();
        hashMap49.clear();
        int int52 = hashMap49.size();
        int int53 = hashMap49.size();
        system.classfixer.classes.HashMap hashMap54 = new system.classfixer.classes.HashMap();
        java.lang.Object obj56 = hashMap54.remove((java.lang.Object) 0.0f);
        hashMap54.modCount = (byte) 100;
        java.lang.Object obj59 = hashMap49.get((java.lang.Object) (byte) 100);
        java.lang.Object obj61 = hashMap49.get((java.lang.Object) 0L);
        java.lang.Object obj62 = hashMap35.remove(obj61);
        java.lang.Object obj63 = hashMap26.get((java.lang.Object) hashMap35);
        java.lang.Object obj64 = hashMap1.get((java.lang.Object) hashMap35);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(0, (float) 100L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean2 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap1.table;
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap1.table;
        boolean boolean5 = hashMap1.isEmpty();
        hashMap1.clear();
        boolean boolean7 = hashMap1.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = null;
        hashMap1.table = entryArray8;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(100);
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        boolean boolean3 = hashMap2.repOK();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object obj6 = hashMap2.put(obj4, (java.lang.Object) 100);
        hashMap2.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap2.table;
        hashMap1.table = entryArray8;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(0, (float) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj4 = hashMap0.put(obj2, (java.lang.Object) 100);
        boolean boolean5 = hashMap0.isEmpty();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray2 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap1.table = entryArray2;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean6 = hashMap5.isEmpty();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        java.lang.Object obj9 = hashMap7.remove((java.lang.Object) 0.0f);
        java.lang.Object obj10 = hashMap5.get((java.lang.Object) hashMap7);
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap7.table;
        hashMap1.table = entryArray11;
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        boolean boolean14 = hashMap13.repOK();
        hashMap13.clear();
        int int16 = hashMap13.size();
        int int17 = hashMap13.size();
        java.lang.Object obj19 = hashMap13.get((java.lang.Object) (byte) 100);
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        java.lang.Object obj22 = hashMap20.remove((java.lang.Object) 0.0f);
        hashMap20.modCount = (byte) 100;
        system.classfixer.classes.HashMap.Entry[] entryArray25 = hashMap20.table;
        hashMap13.table = entryArray25;
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap();
        boolean boolean28 = hashMap27.repOK();
        hashMap27.clear();
        int int30 = hashMap27.size();
        int int31 = hashMap27.size();
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap();
        java.lang.Object obj34 = hashMap32.remove((java.lang.Object) 0.0f);
        hashMap32.modCount = (byte) 100;
        java.lang.Object obj37 = hashMap27.get((java.lang.Object) (byte) 100);
        java.lang.Object obj39 = hashMap27.get((java.lang.Object) 0L);
        java.lang.Object obj40 = hashMap13.remove(obj39);
        java.lang.Object obj42 = hashMap13.remove((java.lang.Object) (-1.0d));
        system.classfixer.classes.HashMap hashMap44 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap44.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray46 = hashMap44.table;
        int int47 = hashMap44.modCount;
        system.classfixer.classes.HashMap hashMap49 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray50 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap49.table = entryArray50;
        system.classfixer.classes.HashMap hashMap53 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean54 = hashMap53.isEmpty();
        system.classfixer.classes.HashMap hashMap55 = new system.classfixer.classes.HashMap();
        java.lang.Object obj57 = hashMap55.remove((java.lang.Object) 0.0f);
        java.lang.Object obj58 = hashMap53.get((java.lang.Object) hashMap55);
        system.classfixer.classes.HashMap.Entry[] entryArray59 = hashMap55.table;
        hashMap49.table = entryArray59;
        system.classfixer.classes.HashMap.Entry[] entryArray61 = hashMap49.table;
        java.lang.Object obj62 = hashMap44.remove((java.lang.Object) entryArray61);
        int int63 = hashMap44.size();
        java.lang.Object obj64 = hashMap1.put((java.lang.Object) (-1.0d), (java.lang.Object) int63);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        hashMap0.clear();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap5.clear();
        int int7 = hashMap5.size();
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) hashMap5);
        java.lang.Object obj10 = hashMap5.get((java.lang.Object) 100.0f);
        hashMap5.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = null;
        hashMap5.table = entryArray12;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap5", hashMap5.repOK_2());
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 0.0f);
        hashMap0.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(100, (float) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(100, (float) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        int int3 = hashMap1.size();
        int int4 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) ' ');
        int int7 = hashMap6.modCount;
        java.lang.Object obj8 = hashMap1.remove((java.lang.Object) hashMap6);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap(101);
        java.lang.Object obj12 = hashMap1.put((java.lang.Object) 101, (java.lang.Object) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        hashMap0.clear();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap5.clear();
        int int7 = hashMap5.size();
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) hashMap5);
        java.lang.Object obj10 = hashMap5.get((java.lang.Object) 100.0f);
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) 'a');
        boolean boolean13 = hashMap12.repOK();
        hashMap12.modCount = 0;
        java.lang.Object obj17 = hashMap5.put((java.lang.Object) 0, (java.lang.Object) 10L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap5", hashMap5.repOK_2());
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap1.table = entryArray3;
        hashMap1.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap1.table;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        boolean boolean7 = hashMap6.repOK();
        boolean boolean8 = hashMap6.isEmpty();
        java.lang.Object obj9 = hashMap1.put((java.lang.Object) (short) 10, (java.lang.Object) hashMap6);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean2 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap3.remove((java.lang.Object) 0.0f);
        java.lang.Object obj6 = hashMap1.get((java.lang.Object) hashMap3);
        int int7 = hashMap1.modCount;
        boolean boolean8 = hashMap1.repOK();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean11 = hashMap10.isEmpty();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        java.lang.Object obj14 = hashMap12.remove((java.lang.Object) 0.0f);
        java.lang.Object obj15 = hashMap10.get((java.lang.Object) hashMap12);
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap17.clear();
        int int19 = hashMap17.size();
        int int20 = hashMap17.size();
        java.lang.Object obj21 = hashMap1.put((java.lang.Object) hashMap10, (java.lang.Object) int20);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        boolean boolean2 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray5 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap4.table = entryArray5;
        hashMap1.table = entryArray5;
        system.classfixer.classes.HashMap.Entry[] entryArray8 = null;
        hashMap1.table = entryArray8;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(101, (float) 100L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) 'a', 10.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        int int2 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.repOK();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object obj7 = hashMap3.put(obj5, (java.lang.Object) 100);
        hashMap3.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap3.table;
        hashMap1.table = entryArray9;
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        java.lang.Object obj13 = hashMap11.remove((java.lang.Object) 0.0f);
        hashMap11.modCount = (byte) 100;
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap11.table;
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap11.table;
        boolean boolean18 = hashMap11.repOK();
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap(0);
        int int21 = hashMap20.size();
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        boolean boolean23 = hashMap22.repOK();
        java.lang.Object obj24 = new java.lang.Object();
        java.lang.Object obj26 = hashMap22.put(obj24, (java.lang.Object) 100);
        hashMap22.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray28 = hashMap22.table;
        hashMap20.table = entryArray28;
        java.lang.Object obj30 = hashMap1.put((java.lang.Object) boolean18, (java.lang.Object) entryArray28);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) hashMap4);
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray8 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap7.table = entryArray8;
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean12 = hashMap11.isEmpty();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        java.lang.Object obj15 = hashMap13.remove((java.lang.Object) 0.0f);
        java.lang.Object obj16 = hashMap11.get((java.lang.Object) hashMap13);
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap13.table;
        hashMap7.table = entryArray17;
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap7.table;
        hashMap4.table = entryArray19;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap4", hashMap4.repOK_2());
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(100, (float) 1);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.repOK();
        hashMap3.clear();
        int int6 = hashMap3.size();
        int int7 = hashMap3.size();
        java.lang.Object obj9 = hashMap3.get((java.lang.Object) (byte) 100);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean12 = hashMap11.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap11.table;
        java.lang.Object obj14 = hashMap3.get((java.lang.Object) entryArray13);
        hashMap2.table = entryArray13;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) hashMap4);
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        boolean boolean7 = hashMap6.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap6.table;
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = hashMap4.put((java.lang.Object) hashMap6, obj9);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap4", hashMap4.repOK_2());
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        int int2 = hashMap1.size();
        hashMap1.clear();
        hashMap1.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        boolean boolean2 = hashMap1.repOK();
        hashMap1.modCount = 0;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean9 = hashMap8.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap8.table;
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap8.table;
        int int12 = hashMap8.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap8.table;
        int int14 = hashMap8.modCount;
        java.lang.Object obj15 = hashMap1.put((java.lang.Object) 0, (java.lang.Object) hashMap8);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) '4');
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap((int) 'a');
        boolean boolean4 = hashMap3.repOK();
        hashMap3.modCount = 0;
        boolean boolean7 = hashMap3.repOK();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.repOK();
        hashMap8.clear();
        hashMap8.clear();
        boolean boolean12 = hashMap8.repOK();
        int int13 = hashMap8.size();
        java.lang.Object obj14 = hashMap3.get((java.lang.Object) hashMap8);
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap8.table;
        hashMap1.table = entryArray15;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) '#', (float) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 0.0f);
        boolean boolean3 = hashMap0.isEmpty();
        java.lang.Object obj5 = hashMap0.get((java.lang.Object) (byte) 100);
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        boolean boolean7 = hashMap6.repOK();
        hashMap6.clear();
        int int9 = hashMap6.size();
        int int10 = hashMap6.size();
        java.lang.Object obj12 = hashMap6.get((java.lang.Object) (byte) 100);
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean15 = hashMap14.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap14.table;
        java.lang.Object obj17 = hashMap6.get((java.lang.Object) entryArray16);
        hashMap0.table = entryArray16;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        int int3 = hashMap0.size();
        int int4 = hashMap0.size();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Class<?> wildcardClass6 = obj5.getClass();
        java.lang.Object obj7 = hashMap0.get((java.lang.Object) wildcardClass6);
        int int8 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        boolean boolean10 = hashMap9.repOK();
        hashMap9.clear();
        int int12 = hashMap9.size();
        int int13 = hashMap9.size();
        int int14 = hashMap9.modCount;
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap(0);
        java.lang.Object obj18 = hashMap16.remove((java.lang.Object) '#');
        java.lang.Object obj19 = hashMap0.put((java.lang.Object) int14, (java.lang.Object) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap(0);
        int int5 = hashMap4.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap4.table;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) ' ');
        java.lang.Object obj9 = hashMap4.remove((java.lang.Object) hashMap8);
        java.lang.Object obj10 = hashMap0.get((java.lang.Object) hashMap4);
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap(0);
        java.lang.Object obj14 = hashMap12.remove((java.lang.Object) '#');
        hashMap12.modCount = (byte) 0;
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap(0);
        boolean boolean19 = hashMap18.isEmpty();
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray22 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap21.table = entryArray22;
        hashMap18.table = entryArray22;
        hashMap18.clear();
        java.lang.Object obj26 = hashMap12.remove((java.lang.Object) hashMap18);
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean29 = hashMap28.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray30 = hashMap28.table;
        system.classfixer.classes.HashMap.Entry[] entryArray31 = hashMap28.table;
        boolean boolean32 = hashMap28.isEmpty();
        system.classfixer.classes.HashMap hashMap34 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray35 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap34.table = entryArray35;
        system.classfixer.classes.HashMap hashMap38 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean39 = hashMap38.isEmpty();
        system.classfixer.classes.HashMap hashMap40 = new system.classfixer.classes.HashMap();
        java.lang.Object obj42 = hashMap40.remove((java.lang.Object) 0.0f);
        java.lang.Object obj43 = hashMap38.get((java.lang.Object) hashMap40);
        system.classfixer.classes.HashMap.Entry[] entryArray44 = hashMap40.table;
        hashMap34.table = entryArray44;
        system.classfixer.classes.HashMap.Entry[] entryArray46 = hashMap34.table;
        hashMap28.table = entryArray46;
        java.lang.Object obj48 = hashMap4.put((java.lang.Object) hashMap12, (java.lang.Object) entryArray46);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap4", hashMap4.repOK_2());
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(2, (float) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(100);
        int int2 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean5 = hashMap4.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap4.table;
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap4.table;
        int int8 = hashMap4.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap4.table;
        hashMap1.table = entryArray9;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj4 = hashMap0.put(obj2, (java.lang.Object) 100);
        int int5 = hashMap0.modCount;
        boolean boolean6 = hashMap0.repOK();
        int int7 = hashMap0.modCount;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        int int3 = hashMap0.size();
        int int4 = hashMap0.size();
        int int5 = hashMap0.size();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap(0);
        int int9 = hashMap8.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap8.table;
        java.lang.Object obj11 = hashMap0.get((java.lang.Object) entryArray10);
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap0.table;
        int int13 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean16 = hashMap15.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap15.table;
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap15.table;
        int int19 = hashMap15.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray20 = hashMap15.table;
        int int21 = hashMap15.modCount;
        hashMap15.modCount = (byte) 0;
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap();
        boolean boolean25 = hashMap24.repOK();
        hashMap24.clear();
        int int27 = hashMap24.size();
        int int28 = hashMap24.size();
        java.lang.Object obj30 = hashMap24.get((java.lang.Object) (byte) 100);
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap();
        java.lang.Object obj33 = hashMap31.remove((java.lang.Object) 0.0f);
        hashMap31.modCount = (byte) 100;
        system.classfixer.classes.HashMap.Entry[] entryArray36 = hashMap31.table;
        hashMap24.table = entryArray36;
        system.classfixer.classes.HashMap hashMap38 = new system.classfixer.classes.HashMap();
        boolean boolean39 = hashMap38.repOK();
        hashMap38.clear();
        int int41 = hashMap38.size();
        int int42 = hashMap38.size();
        system.classfixer.classes.HashMap hashMap43 = new system.classfixer.classes.HashMap();
        java.lang.Object obj45 = hashMap43.remove((java.lang.Object) 0.0f);
        hashMap43.modCount = (byte) 100;
        java.lang.Object obj48 = hashMap38.get((java.lang.Object) (byte) 100);
        java.lang.Object obj50 = hashMap38.get((java.lang.Object) 0L);
        java.lang.Object obj51 = hashMap24.remove(obj50);
        java.lang.Object obj52 = hashMap15.get((java.lang.Object) hashMap24);
        system.classfixer.classes.HashMap hashMap54 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap54.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray56 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap54.table = entryArray56;
        hashMap15.table = entryArray56;
        hashMap15.clear();
        system.classfixer.classes.HashMap hashMap61 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap61.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray63 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap61.table = entryArray63;
        hashMap15.table = entryArray63;
        hashMap0.table = entryArray63;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 0.0f);
        boolean boolean3 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap(0);
        boolean boolean6 = hashMap5.isEmpty();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        boolean boolean8 = hashMap7.repOK();
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object obj11 = hashMap7.put(obj9, (java.lang.Object) 100);
        java.lang.Object obj12 = hashMap5.remove(obj9);
        java.lang.Object obj14 = hashMap0.put(obj9, (java.lang.Object) 2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean2 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap3.remove((java.lang.Object) 0.0f);
        java.lang.Object obj6 = hashMap1.get((java.lang.Object) hashMap3);
        int int7 = hashMap1.modCount;
        java.lang.Object obj8 = null;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap(0);
        hashMap10.clear();
        java.lang.Object obj12 = hashMap1.put(obj8, (java.lang.Object) hashMap10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) ' ', (float) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        boolean boolean2 = hashMap1.repOK();
        hashMap1.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap1.table;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap6.clear();
        int int8 = hashMap6.size();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap10.clear();
        int int12 = hashMap10.size();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        java.lang.Object obj15 = hashMap13.remove((java.lang.Object) 0.0f);
        hashMap13.modCount = (byte) 100;
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap13.table;
        hashMap10.table = entryArray18;
        java.lang.Object obj20 = hashMap1.put((java.lang.Object) int8, (java.lang.Object) hashMap10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 100, (float) 100L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray2 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap1.table = entryArray2;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean6 = hashMap5.isEmpty();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        java.lang.Object obj9 = hashMap7.remove((java.lang.Object) 0.0f);
        java.lang.Object obj10 = hashMap5.get((java.lang.Object) hashMap7);
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap7.table;
        hashMap1.table = entryArray11;
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap1.table;
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap(0);
        int int16 = hashMap15.size();
        hashMap15.clear();
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        java.lang.Object obj20 = hashMap18.remove((java.lang.Object) 0.0f);
        hashMap18.modCount = (byte) 100;
        system.classfixer.classes.HashMap.Entry[] entryArray23 = hashMap18.table;
        java.lang.Object obj24 = hashMap1.put((java.lang.Object) hashMap15, (java.lang.Object) entryArray23);
        int int25 = hashMap1.size();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        int int3 = hashMap0.size();
        int int4 = hashMap0.size();
        int int5 = hashMap0.size();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap0.table;
        hashMap0.modCount = (byte) 1;
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        boolean boolean10 = hashMap9.repOK();
        hashMap9.clear();
        int int12 = hashMap9.size();
        int int13 = hashMap9.size();
        int int14 = hashMap9.modCount;
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap(0);
        int int17 = hashMap16.modCount;
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap19.clear();
        java.lang.Object obj21 = hashMap16.remove((java.lang.Object) hashMap19);
        hashMap16.modCount = 102;
        java.lang.Object obj24 = hashMap0.put((java.lang.Object) int14, (java.lang.Object) 102);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        int int2 = hashMap1.modCount;
        java.lang.Object obj5 = hashMap1.put((java.lang.Object) 1.0f, (java.lang.Object) (byte) 100);
        int int6 = hashMap1.size();
        int int7 = hashMap1.modCount;
        hashMap1.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean2 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap3.remove((java.lang.Object) 0.0f);
        java.lang.Object obj6 = hashMap1.get((java.lang.Object) hashMap3);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean9 = hashMap8.isEmpty();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        java.lang.Object obj12 = hashMap10.remove((java.lang.Object) 0.0f);
        java.lang.Object obj13 = hashMap8.get((java.lang.Object) hashMap10);
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap10.table;
        java.lang.Class<?> wildcardClass15 = entryArray14.getClass();
        java.lang.Object obj16 = hashMap3.get((java.lang.Object) entryArray14);
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap(0);
        int int19 = hashMap18.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray20 = hashMap18.table;
        int int21 = hashMap18.size();
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap(0, (float) (short) 1);
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap(0);
        int int27 = hashMap26.modCount;
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap29.clear();
        java.lang.Object obj31 = hashMap26.remove((java.lang.Object) hashMap29);
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean34 = hashMap33.isEmpty();
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap();
        java.lang.Object obj37 = hashMap35.remove((java.lang.Object) 0.0f);
        java.lang.Object obj38 = hashMap33.get((java.lang.Object) hashMap35);
        int int39 = hashMap33.modCount;
        boolean boolean40 = hashMap33.repOK();
        hashMap33.clear();
        system.classfixer.classes.HashMap hashMap42 = new system.classfixer.classes.HashMap();
        java.lang.Class<?> wildcardClass43 = hashMap42.getClass();
        java.lang.Object obj44 = hashMap29.put((java.lang.Object) hashMap33, (java.lang.Object) hashMap42);
        system.classfixer.classes.HashMap hashMap46 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray47 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap46.table = entryArray47;
        system.classfixer.classes.HashMap hashMap50 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean51 = hashMap50.isEmpty();
        system.classfixer.classes.HashMap hashMap52 = new system.classfixer.classes.HashMap();
        java.lang.Object obj54 = hashMap52.remove((java.lang.Object) 0.0f);
        java.lang.Object obj55 = hashMap50.get((java.lang.Object) hashMap52);
        system.classfixer.classes.HashMap.Entry[] entryArray56 = hashMap52.table;
        hashMap46.table = entryArray56;
        system.classfixer.classes.HashMap.Entry[] entryArray58 = hashMap46.table;
        java.lang.Object obj59 = hashMap33.remove((java.lang.Object) entryArray58);
        hashMap24.table = entryArray58;
        java.lang.Object obj61 = hashMap3.put((java.lang.Object) hashMap18, (java.lang.Object) hashMap24);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap3", hashMap3.repOK_2());
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 100, (float) 32);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        hashMap0.clear();
        hashMap0.modCount = ' ';
        int int6 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean9 = hashMap8.isEmpty();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        java.lang.Object obj12 = hashMap10.remove((java.lang.Object) 0.0f);
        java.lang.Object obj13 = hashMap8.get((java.lang.Object) hashMap10);
        int int14 = hashMap8.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray15 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap8.table = entryArray15;
        hashMap0.table = entryArray15;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) ' ', 10.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        boolean boolean2 = hashMap1.repOK();
        hashMap1.clear();
        boolean boolean4 = hashMap1.repOK();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        boolean boolean6 = hashMap5.repOK();
        hashMap5.clear();
        int int8 = hashMap5.size();
        int int9 = hashMap5.size();
        int int10 = hashMap5.size();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) ' ');
        boolean boolean13 = hashMap12.isEmpty();
        hashMap12.modCount = 1;
        hashMap12.modCount = '4';
        java.lang.Object obj18 = hashMap5.remove((java.lang.Object) hashMap12);
        boolean boolean19 = hashMap12.isEmpty();
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap21.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray23 = hashMap21.table;
        int int24 = hashMap21.modCount;
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray27 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap26.table = entryArray27;
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean31 = hashMap30.isEmpty();
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap();
        java.lang.Object obj34 = hashMap32.remove((java.lang.Object) 0.0f);
        java.lang.Object obj35 = hashMap30.get((java.lang.Object) hashMap32);
        system.classfixer.classes.HashMap.Entry[] entryArray36 = hashMap32.table;
        hashMap26.table = entryArray36;
        system.classfixer.classes.HashMap.Entry[] entryArray38 = hashMap26.table;
        java.lang.Object obj39 = hashMap21.remove((java.lang.Object) entryArray38);
        java.lang.Object obj40 = hashMap12.remove((java.lang.Object) entryArray38);
        hashMap1.table = entryArray38;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(100, (float) 1);
        int int3 = hashMap2.size();
        java.lang.Object obj5 = hashMap2.remove((java.lang.Object) (-1L));
        int int6 = hashMap2.size();
        boolean boolean7 = hashMap2.isEmpty();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap(10, 1.0f);
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) ' ');
        boolean boolean13 = hashMap12.isEmpty();
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap(0);
        int int16 = hashMap15.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap15.table;
        java.lang.Class<?> wildcardClass18 = entryArray17.getClass();
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        boolean boolean20 = hashMap19.repOK();
        hashMap19.clear();
        int int22 = hashMap19.size();
        int int23 = hashMap19.size();
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap();
        java.lang.Object obj26 = hashMap24.remove((java.lang.Object) 0.0f);
        hashMap24.modCount = (byte) 100;
        java.lang.Object obj29 = hashMap19.get((java.lang.Object) (byte) 100);
        java.lang.Object obj31 = hashMap19.get((java.lang.Object) 0L);
        java.lang.Object obj32 = hashMap12.put((java.lang.Object) wildcardClass18, (java.lang.Object) 0L);
        int int33 = hashMap12.modCount;
        java.lang.Object obj34 = hashMap10.get((java.lang.Object) hashMap12);
        system.classfixer.classes.HashMap hashMap36 = new system.classfixer.classes.HashMap((int) (short) 1);
        java.lang.Object obj37 = hashMap2.put(obj34, (java.lang.Object) hashMap36);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) ' ');
        boolean boolean2 = hashMap1.isEmpty();
        hashMap1.modCount = 1;
        hashMap1.clear();
        boolean boolean6 = hashMap1.repOK();
        hashMap1.clear();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        java.lang.Object obj10 = hashMap8.remove((java.lang.Object) 0.0f);
        hashMap8.modCount = (byte) 100;
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap8.table;
        hashMap1.table = entryArray13;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 100, (float) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        int int2 = hashMap1.modCount;
        java.lang.Object obj5 = hashMap1.put((java.lang.Object) 1.0f, (java.lang.Object) (byte) 100);
        int int6 = hashMap1.size();
        int int7 = hashMap1.modCount;
        hashMap1.modCount = (short) 1;
        java.lang.Object obj10 = null;
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean13 = hashMap12.isEmpty();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        java.lang.Object obj16 = hashMap14.remove((java.lang.Object) 0.0f);
        java.lang.Object obj17 = hashMap12.get((java.lang.Object) hashMap14);
        int int18 = hashMap12.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray19 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap12.table = entryArray19;
        java.lang.Class<?> wildcardClass21 = entryArray19.getClass();
        java.lang.Object obj22 = hashMap1.put(obj10, (java.lang.Object) entryArray19);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        boolean boolean5 = hashMap4.repOK();
        hashMap4.clear();
        int int7 = hashMap4.size();
        int int8 = hashMap4.size();
        int int9 = hashMap4.size();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap4.table;
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap4.table;
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap(0);
        boolean boolean14 = hashMap13.isEmpty();
        boolean boolean15 = hashMap13.repOK();
        boolean boolean16 = hashMap13.repOK();
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray19 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap18.table = entryArray19;
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean23 = hashMap22.isEmpty();
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap();
        java.lang.Object obj26 = hashMap24.remove((java.lang.Object) 0.0f);
        java.lang.Object obj27 = hashMap22.get((java.lang.Object) hashMap24);
        system.classfixer.classes.HashMap.Entry[] entryArray28 = hashMap24.table;
        hashMap18.table = entryArray28;
        system.classfixer.classes.HashMap.Entry[] entryArray30 = hashMap18.table;
        hashMap13.table = entryArray30;
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap(0);
        int int34 = hashMap33.modCount;
        java.lang.Object obj37 = hashMap33.put((java.lang.Object) 1.0f, (java.lang.Object) (byte) 100);
        int int38 = hashMap33.size();
        hashMap33.clear();
        hashMap33.clear();
        java.lang.Object obj41 = hashMap13.get((java.lang.Object) hashMap33);
        java.lang.Object obj42 = hashMap4.get((java.lang.Object) hashMap33);
        boolean boolean43 = hashMap33.repOK();
        java.lang.Object obj44 = hashMap0.put((java.lang.Object) (short) 1, (java.lang.Object) hashMap33);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        int int3 = hashMap0.size();
        int int4 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        java.lang.Object obj7 = hashMap5.remove((java.lang.Object) 0.0f);
        hashMap5.modCount = (byte) 100;
        java.lang.Object obj10 = hashMap0.get((java.lang.Object) (byte) 100);
        int int11 = hashMap0.modCount;
        hashMap0.clear();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        boolean boolean14 = hashMap13.repOK();
        hashMap13.clear();
        int int16 = hashMap13.size();
        java.lang.Object obj17 = null;
        java.lang.Object obj18 = hashMap13.remove(obj17);
        boolean boolean19 = hashMap13.repOK();
        hashMap13.modCount = (byte) 100;
        hashMap13.clear();
        int int23 = hashMap13.size();
        boolean boolean24 = hashMap13.repOK();
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray27 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap26.table = entryArray27;
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean31 = hashMap30.isEmpty();
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap();
        java.lang.Object obj34 = hashMap32.remove((java.lang.Object) 0.0f);
        java.lang.Object obj35 = hashMap30.get((java.lang.Object) hashMap32);
        system.classfixer.classes.HashMap.Entry[] entryArray36 = hashMap32.table;
        hashMap26.table = entryArray36;
        system.classfixer.classes.HashMap hashMap39 = new system.classfixer.classes.HashMap(0);
        boolean boolean40 = hashMap39.isEmpty();
        boolean boolean41 = hashMap39.repOK();
        boolean boolean42 = hashMap39.repOK();
        system.classfixer.classes.HashMap hashMap44 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap44.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray46 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap44.table = entryArray46;
        hashMap39.table = entryArray46;
        boolean boolean49 = hashMap39.repOK();
        system.classfixer.classes.HashMap hashMap51 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean52 = hashMap51.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray53 = hashMap51.table;
        boolean boolean54 = hashMap51.repOK();
        java.lang.Object obj55 = hashMap26.put((java.lang.Object) hashMap39, (java.lang.Object) hashMap51);
        java.lang.Object obj56 = hashMap0.put((java.lang.Object) boolean24, (java.lang.Object) hashMap26);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        int int3 = hashMap0.size();
        int int4 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        java.lang.Object obj7 = hashMap5.remove((java.lang.Object) 0.0f);
        hashMap5.modCount = (byte) 100;
        java.lang.Object obj10 = hashMap0.get((java.lang.Object) (byte) 100);
        int int11 = hashMap0.modCount;
        boolean boolean12 = hashMap0.isEmpty();
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        boolean boolean16 = hashMap15.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap15.table;
        java.lang.Object obj18 = hashMap0.put((java.lang.Object) wildcardClass14, (java.lang.Object) hashMap15);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean2 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap3.remove((java.lang.Object) 0.0f);
        java.lang.Object obj6 = hashMap1.get((java.lang.Object) hashMap3);
        int int7 = hashMap1.modCount;
        int int8 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        java.lang.Object obj11 = hashMap9.remove((java.lang.Object) 0.0f);
        hashMap9.modCount = (byte) 100;
        hashMap9.clear();
        hashMap9.modCount = 0;
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap9.table;
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap19.clear();
        java.lang.Object obj21 = hashMap1.put((java.lang.Object) entryArray17, (java.lang.Object) hashMap19);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(10, (float) 101);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 10, (float) 2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) hashMap4);
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        boolean boolean7 = hashMap6.repOK();
        hashMap6.clear();
        int int9 = hashMap6.size();
        int int10 = hashMap6.size();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        java.lang.Object obj13 = hashMap11.remove((java.lang.Object) 0.0f);
        hashMap11.modCount = (byte) 100;
        java.lang.Object obj16 = hashMap6.get((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass17 = hashMap6.getClass();
        java.lang.Object obj18 = hashMap0.get((java.lang.Object) hashMap6);
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap(0);
        int int21 = hashMap20.modCount;
        java.lang.Object obj24 = hashMap20.put((java.lang.Object) 1.0f, (java.lang.Object) (byte) 100);
        int int25 = hashMap20.size();
        int int26 = hashMap20.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray27 = hashMap20.table;
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap(0);
        int int30 = hashMap29.modCount;
        java.lang.Object obj33 = hashMap29.put((java.lang.Object) 1.0f, (java.lang.Object) (byte) 100);
        int int34 = hashMap29.size();
        int int35 = hashMap29.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray36 = hashMap29.table;
        hashMap20.table = entryArray36;
        hashMap0.table = entryArray36;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        boolean boolean2 = hashMap1.isEmpty();
        boolean boolean3 = hashMap1.repOK();
        boolean boolean4 = hashMap1.repOK();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray7 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap6.table = entryArray7;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean11 = hashMap10.isEmpty();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        java.lang.Object obj14 = hashMap12.remove((java.lang.Object) 0.0f);
        java.lang.Object obj15 = hashMap10.get((java.lang.Object) hashMap12);
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap12.table;
        hashMap6.table = entryArray16;
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap6.table;
        hashMap1.table = entryArray18;
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap(0);
        int int22 = hashMap21.modCount;
        java.lang.Object obj25 = hashMap21.put((java.lang.Object) 1.0f, (java.lang.Object) (byte) 100);
        int int26 = hashMap21.size();
        hashMap21.clear();
        hashMap21.clear();
        java.lang.Object obj29 = hashMap1.get((java.lang.Object) hashMap21);
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap(0);
        boolean boolean32 = hashMap31.isEmpty();
        int int33 = hashMap31.modCount;
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap35.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray37 = hashMap35.table;
        boolean boolean38 = hashMap35.isEmpty();
        system.classfixer.classes.HashMap hashMap40 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean41 = hashMap40.isEmpty();
        system.classfixer.classes.HashMap hashMap42 = new system.classfixer.classes.HashMap();
        java.lang.Object obj44 = hashMap42.remove((java.lang.Object) 0.0f);
        java.lang.Object obj45 = hashMap40.get((java.lang.Object) hashMap42);
        system.classfixer.classes.HashMap.Entry[] entryArray46 = hashMap42.table;
        hashMap35.table = entryArray46;
        hashMap31.table = entryArray46;
        int int49 = hashMap31.modCount;
        system.classfixer.classes.HashMap hashMap50 = new system.classfixer.classes.HashMap();
        boolean boolean51 = hashMap50.repOK();
        hashMap50.clear();
        int int53 = hashMap50.size();
        int int54 = hashMap50.size();
        int int55 = hashMap50.size();
        system.classfixer.classes.HashMap hashMap57 = new system.classfixer.classes.HashMap((int) ' ');
        boolean boolean58 = hashMap57.isEmpty();
        hashMap57.modCount = 1;
        hashMap57.modCount = '4';
        java.lang.Object obj63 = hashMap50.remove((java.lang.Object) hashMap57);
        boolean boolean64 = hashMap57.isEmpty();
        java.lang.Object obj65 = hashMap1.put((java.lang.Object) int49, (java.lang.Object) boolean64);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) ' ');
        int int2 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.repOK();
        hashMap3.clear();
        hashMap3.clear();
        hashMap3.modCount = ' ';
        java.lang.Object obj10 = hashMap3.get((java.lang.Object) 100.0f);
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap((int) '4', 1.0f);
        java.lang.Object obj14 = hashMap1.put((java.lang.Object) 100.0f, (java.lang.Object) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) 'a', (float) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        boolean boolean2 = hashMap1.repOK();
        hashMap1.clear();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray6 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap5.table = entryArray6;
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean10 = hashMap9.isEmpty();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        java.lang.Object obj13 = hashMap11.remove((java.lang.Object) 0.0f);
        java.lang.Object obj14 = hashMap9.get((java.lang.Object) hashMap11);
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap11.table;
        hashMap5.table = entryArray15;
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap5.table;
        hashMap1.table = entryArray17;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj4 = hashMap0.put(obj2, (java.lang.Object) 100);
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean7 = hashMap6.isEmpty();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        java.lang.Object obj10 = hashMap8.remove((java.lang.Object) 0.0f);
        java.lang.Object obj11 = hashMap6.get((java.lang.Object) hashMap8);
        int int12 = hashMap6.modCount;
        int int13 = hashMap6.modCount;
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        boolean boolean15 = hashMap14.repOK();
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Object obj18 = hashMap14.put(obj16, (java.lang.Object) 100);
        java.lang.Object obj19 = hashMap6.get((java.lang.Object) 100);
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap(0);
        int int22 = hashMap21.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray23 = hashMap21.table;
        hashMap6.table = entryArray23;
        hashMap0.table = entryArray23;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(101, (float) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(102, 100.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        int int3 = hashMap0.size();
        int int4 = hashMap0.size();
        java.lang.Object obj6 = hashMap0.get((java.lang.Object) (byte) 100);
        boolean boolean7 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        java.lang.Object obj10 = hashMap8.remove((java.lang.Object) 0.0f);
        hashMap8.modCount = (byte) 100;
        hashMap8.clear();
        hashMap8.modCount = 0;
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap((int) 'a');
        boolean boolean18 = hashMap17.repOK();
        hashMap17.clear();
        java.lang.Object obj20 = hashMap8.get((java.lang.Object) hashMap17);
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean23 = hashMap22.isEmpty();
        hashMap22.modCount = ' ';
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap(0);
        boolean boolean28 = hashMap27.isEmpty();
        int int29 = hashMap27.modCount;
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap31.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray33 = hashMap31.table;
        boolean boolean34 = hashMap31.isEmpty();
        system.classfixer.classes.HashMap hashMap36 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean37 = hashMap36.isEmpty();
        system.classfixer.classes.HashMap hashMap38 = new system.classfixer.classes.HashMap();
        java.lang.Object obj40 = hashMap38.remove((java.lang.Object) 0.0f);
        java.lang.Object obj41 = hashMap36.get((java.lang.Object) hashMap38);
        system.classfixer.classes.HashMap.Entry[] entryArray42 = hashMap38.table;
        hashMap31.table = entryArray42;
        hashMap27.table = entryArray42;
        hashMap22.table = entryArray42;
        hashMap22.modCount = 0;
        java.lang.Object obj48 = hashMap0.put((java.lang.Object) hashMap8, (java.lang.Object) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(10, (float) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(32);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean4 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        java.lang.Object obj7 = hashMap5.remove((java.lang.Object) 0.0f);
        java.lang.Object obj8 = hashMap3.get((java.lang.Object) hashMap5);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean11 = hashMap10.isEmpty();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        java.lang.Object obj14 = hashMap12.remove((java.lang.Object) 0.0f);
        java.lang.Object obj15 = hashMap10.get((java.lang.Object) hashMap12);
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap12.table;
        java.lang.Class<?> wildcardClass17 = entryArray16.getClass();
        java.lang.Object obj18 = hashMap5.get((java.lang.Object) entryArray16);
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        boolean boolean20 = hashMap19.repOK();
        hashMap19.clear();
        int int22 = hashMap19.size();
        boolean boolean23 = hashMap19.repOK();
        hashMap19.clear();
        java.lang.Object obj25 = hashMap1.put(obj18, (java.lang.Object) hashMap19);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        boolean boolean2 = hashMap1.repOK();
        hashMap1.modCount = 0;
        boolean boolean5 = hashMap1.repOK();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        boolean boolean7 = hashMap6.repOK();
        hashMap6.clear();
        hashMap6.clear();
        boolean boolean10 = hashMap6.repOK();
        int int11 = hashMap6.size();
        java.lang.Object obj12 = hashMap1.get((java.lang.Object) hashMap6);
        hashMap6.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap6", hashMap6.repOK_2());
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray2 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap1.table = entryArray2;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray6 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap5.table = entryArray6;
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean10 = hashMap9.isEmpty();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        java.lang.Object obj13 = hashMap11.remove((java.lang.Object) 0.0f);
        java.lang.Object obj14 = hashMap9.get((java.lang.Object) hashMap11);
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap11.table;
        hashMap5.table = entryArray15;
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap5.table;
        hashMap1.table = entryArray17;
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap((int) ' ');
        int int21 = hashMap20.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray22 = hashMap20.table;
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap();
        java.lang.Object obj25 = hashMap23.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Object obj28 = hashMap23.remove((java.lang.Object) hashMap27);
        java.lang.Object obj29 = hashMap20.get(obj28);
        java.lang.Object obj30 = hashMap1.get((java.lang.Object) hashMap20);
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap();
        boolean boolean32 = hashMap31.repOK();
        boolean boolean33 = hashMap31.isEmpty();
        int int34 = hashMap31.size();
        boolean boolean35 = hashMap31.isEmpty();
        system.classfixer.classes.HashMap hashMap37 = new system.classfixer.classes.HashMap(0);
        boolean boolean38 = hashMap37.isEmpty();
        boolean boolean39 = hashMap37.repOK();
        boolean boolean40 = hashMap37.repOK();
        system.classfixer.classes.HashMap hashMap42 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap42.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray44 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap42.table = entryArray44;
        hashMap37.table = entryArray44;
        java.lang.Object obj47 = hashMap1.put((java.lang.Object) boolean35, (java.lang.Object) entryArray44);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 0.0f);
        boolean boolean3 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean6 = hashMap5.isEmpty();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        java.lang.Object obj9 = hashMap7.remove((java.lang.Object) 0.0f);
        java.lang.Object obj10 = hashMap5.get((java.lang.Object) hashMap7);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        java.lang.Object obj13 = hashMap11.remove((java.lang.Object) 0.0f);
        hashMap11.modCount = (byte) 100;
        hashMap11.clear();
        java.lang.Object obj17 = hashMap5.get((java.lang.Object) hashMap11);
        hashMap11.clear();
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray21 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap20.table = entryArray21;
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean25 = hashMap24.isEmpty();
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap();
        java.lang.Object obj28 = hashMap26.remove((java.lang.Object) 0.0f);
        java.lang.Object obj29 = hashMap24.get((java.lang.Object) hashMap26);
        system.classfixer.classes.HashMap.Entry[] entryArray30 = hashMap26.table;
        hashMap20.table = entryArray30;
        java.lang.Object obj32 = hashMap11.remove((java.lang.Object) hashMap20);
        hashMap11.modCount = 1;
        java.lang.Object obj35 = hashMap0.remove((java.lang.Object) hashMap11);
        hashMap11.modCount = 0;
        system.classfixer.classes.HashMap hashMap39 = new system.classfixer.classes.HashMap(0);
        int int40 = hashMap39.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray41 = hashMap39.table;
        system.classfixer.classes.HashMap hashMap43 = new system.classfixer.classes.HashMap((int) ' ');
        java.lang.Object obj44 = hashMap39.remove((java.lang.Object) hashMap43);
        system.classfixer.classes.HashMap hashMap46 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean47 = hashMap46.isEmpty();
        system.classfixer.classes.HashMap hashMap48 = new system.classfixer.classes.HashMap();
        java.lang.Object obj50 = hashMap48.remove((java.lang.Object) 0.0f);
        java.lang.Object obj51 = hashMap46.get((java.lang.Object) hashMap48);
        system.classfixer.classes.HashMap hashMap52 = new system.classfixer.classes.HashMap();
        java.lang.Object obj54 = hashMap52.remove((java.lang.Object) 0.0f);
        hashMap52.modCount = (byte) 100;
        hashMap52.clear();
        java.lang.Object obj58 = hashMap46.get((java.lang.Object) hashMap52);
        hashMap52.clear();
        int int60 = hashMap52.size();
        java.lang.Object obj61 = hashMap11.put(obj44, (java.lang.Object) int60);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap11", hashMap11.repOK_2());
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean2 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap3.remove((java.lang.Object) 0.0f);
        java.lang.Object obj6 = hashMap1.get((java.lang.Object) hashMap3);
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap3.table;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.repOK();
        hashMap8.clear();
        int int11 = hashMap8.size();
        int int12 = hashMap8.size();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        java.lang.Object obj15 = hashMap13.remove((java.lang.Object) 0.0f);
        hashMap13.modCount = (byte) 100;
        java.lang.Object obj18 = hashMap8.get((java.lang.Object) (byte) 100);
        java.lang.Object obj20 = hashMap8.get((java.lang.Object) 0L);
        java.lang.Object obj21 = hashMap3.remove((java.lang.Object) hashMap8);
        boolean boolean22 = hashMap8.repOK();
        boolean boolean23 = hashMap8.isEmpty();
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap25.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray27 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap25.table = entryArray27;
        hashMap8.table = entryArray27;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap8", hashMap8.repOK_2());
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap.Entry[] entryArray3 = null;
        hashMap0.table = entryArray3;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean2 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap3.remove((java.lang.Object) 0.0f);
        java.lang.Object obj6 = hashMap1.get((java.lang.Object) hashMap3);
        int int7 = hashMap1.modCount;
        int int8 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        boolean boolean10 = hashMap9.repOK();
        java.lang.Object obj11 = new java.lang.Object();
        java.lang.Object obj13 = hashMap9.put(obj11, (java.lang.Object) 100);
        java.lang.Object obj14 = hashMap1.get((java.lang.Object) 100);
        hashMap1.modCount = '4';
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap(0, (float) (short) 1);
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        boolean boolean21 = hashMap20.repOK();
        hashMap20.clear();
        int int23 = hashMap20.size();
        int int24 = hashMap20.size();
        java.lang.Object obj25 = new java.lang.Object();
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        java.lang.Object obj27 = hashMap20.get((java.lang.Object) wildcardClass26);
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap(0);
        int int30 = hashMap29.size();
        hashMap29.clear();
        hashMap29.modCount = (byte) 100;
        java.lang.Object obj34 = hashMap19.put((java.lang.Object) hashMap20, (java.lang.Object) hashMap29);
        system.classfixer.classes.HashMap hashMap36 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean37 = hashMap36.isEmpty();
        system.classfixer.classes.HashMap hashMap38 = new system.classfixer.classes.HashMap();
        java.lang.Object obj40 = hashMap38.remove((java.lang.Object) 0.0f);
        java.lang.Object obj41 = hashMap36.get((java.lang.Object) hashMap38);
        system.classfixer.classes.HashMap hashMap43 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean44 = hashMap43.isEmpty();
        system.classfixer.classes.HashMap hashMap45 = new system.classfixer.classes.HashMap();
        java.lang.Object obj47 = hashMap45.remove((java.lang.Object) 0.0f);
        java.lang.Object obj48 = hashMap43.get((java.lang.Object) hashMap45);
        system.classfixer.classes.HashMap.Entry[] entryArray49 = hashMap45.table;
        java.lang.Class<?> wildcardClass50 = entryArray49.getClass();
        java.lang.Object obj51 = hashMap38.get((java.lang.Object) entryArray49);
        int int52 = hashMap38.size();
        boolean boolean53 = hashMap38.repOK();
        java.lang.Object obj54 = hashMap1.put((java.lang.Object) hashMap29, (java.lang.Object) hashMap38);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        int int3 = hashMap1.size();
        int int4 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) ' ');
        int int7 = hashMap6.modCount;
        java.lang.Object obj8 = hashMap1.remove((java.lang.Object) hashMap6);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean11 = hashMap10.isEmpty();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        java.lang.Object obj14 = hashMap12.remove((java.lang.Object) 0.0f);
        java.lang.Object obj15 = hashMap10.get((java.lang.Object) hashMap12);
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        java.lang.Object obj18 = hashMap16.remove((java.lang.Object) 0.0f);
        hashMap16.modCount = (byte) 100;
        hashMap16.clear();
        java.lang.Object obj22 = hashMap10.get((java.lang.Object) hashMap16);
        hashMap16.clear();
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray26 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap25.table = entryArray26;
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean30 = hashMap29.isEmpty();
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap();
        java.lang.Object obj33 = hashMap31.remove((java.lang.Object) 0.0f);
        java.lang.Object obj34 = hashMap29.get((java.lang.Object) hashMap31);
        system.classfixer.classes.HashMap.Entry[] entryArray35 = hashMap31.table;
        hashMap25.table = entryArray35;
        java.lang.Object obj37 = hashMap16.remove((java.lang.Object) hashMap25);
        java.lang.Object obj38 = hashMap6.remove(obj37);
        system.classfixer.classes.HashMap hashMap40 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap40.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray42 = hashMap40.table;
        int int43 = hashMap40.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray44 = hashMap40.table;
        hashMap6.table = entryArray44;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap6", hashMap6.repOK_2());
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        boolean boolean2 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.repOK();
        hashMap3.clear();
        int int6 = hashMap3.size();
        int int7 = hashMap3.size();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        java.lang.Object obj10 = hashMap8.remove((java.lang.Object) 0.0f);
        hashMap8.modCount = (byte) 100;
        java.lang.Object obj13 = hashMap3.get((java.lang.Object) (byte) 100);
        int int14 = hashMap3.modCount;
        java.lang.Object obj15 = hashMap1.get((java.lang.Object) hashMap3);
        int int16 = hashMap3.modCount;
        hashMap3.modCount = '4';
        system.classfixer.classes.HashMap.Entry[] entryArray19 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap3.table = entryArray19;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap3", hashMap3.repOK_2());
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        hashMap0.clear();
        hashMap0.modCount = ' ';
        java.lang.Object obj7 = hashMap0.get((java.lang.Object) 100.0f);
        int int8 = hashMap0.size();
        hashMap0.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) '#', (float) 10L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj4 = hashMap0.put(obj2, (java.lang.Object) 100);
        hashMap0.clear();
        java.lang.Object obj7 = hashMap0.get((java.lang.Object) 1L);
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap9.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap9.table;
        int int12 = hashMap9.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap9.table;
        hashMap0.table = entryArray13;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean2 = hashMap1.isEmpty();
        hashMap1.modCount = ' ';
        int int5 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean8 = hashMap7.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap7.table;
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap7.table;
        int int11 = hashMap7.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap7.table;
        int int13 = hashMap7.modCount;
        hashMap7.modCount = (short) 1;
        int int16 = hashMap7.modCount;
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean19 = hashMap18.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray20 = hashMap18.table;
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap18.table;
        int int22 = hashMap18.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray23 = hashMap18.table;
        int int24 = hashMap18.modCount;
        hashMap18.modCount = (byte) 0;
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap();
        boolean boolean28 = hashMap27.repOK();
        hashMap27.clear();
        int int30 = hashMap27.size();
        int int31 = hashMap27.size();
        java.lang.Object obj33 = hashMap27.get((java.lang.Object) (byte) 100);
        system.classfixer.classes.HashMap hashMap34 = new system.classfixer.classes.HashMap();
        java.lang.Object obj36 = hashMap34.remove((java.lang.Object) 0.0f);
        hashMap34.modCount = (byte) 100;
        system.classfixer.classes.HashMap.Entry[] entryArray39 = hashMap34.table;
        hashMap27.table = entryArray39;
        system.classfixer.classes.HashMap hashMap41 = new system.classfixer.classes.HashMap();
        boolean boolean42 = hashMap41.repOK();
        hashMap41.clear();
        int int44 = hashMap41.size();
        int int45 = hashMap41.size();
        system.classfixer.classes.HashMap hashMap46 = new system.classfixer.classes.HashMap();
        java.lang.Object obj48 = hashMap46.remove((java.lang.Object) 0.0f);
        hashMap46.modCount = (byte) 100;
        java.lang.Object obj51 = hashMap41.get((java.lang.Object) (byte) 100);
        java.lang.Object obj53 = hashMap41.get((java.lang.Object) 0L);
        java.lang.Object obj54 = hashMap27.remove(obj53);
        java.lang.Object obj55 = hashMap18.get((java.lang.Object) hashMap27);
        system.classfixer.classes.HashMap hashMap57 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap57.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray59 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap57.table = entryArray59;
        hashMap18.table = entryArray59;
        java.lang.Object obj62 = hashMap1.put((java.lang.Object) int16, (java.lang.Object) hashMap18);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(102, (float) (short) 1);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.repOK();
        boolean boolean5 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap3.table;
        hashMap2.table = entryArray6;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean2 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap3.remove((java.lang.Object) 0.0f);
        java.lang.Object obj6 = hashMap1.get((java.lang.Object) hashMap3);
        int int7 = hashMap1.modCount;
        int int8 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        boolean boolean10 = hashMap9.repOK();
        java.lang.Object obj11 = new java.lang.Object();
        java.lang.Object obj13 = hashMap9.put(obj11, (java.lang.Object) 100);
        java.lang.Object obj14 = hashMap1.get((java.lang.Object) 100);
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap(0);
        int int17 = hashMap16.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap16.table;
        hashMap1.table = entryArray18;
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        boolean boolean21 = hashMap20.repOK();
        hashMap20.clear();
        int int23 = hashMap20.size();
        int int24 = hashMap20.size();
        java.lang.Object obj26 = hashMap20.get((java.lang.Object) (byte) 100);
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap();
        java.lang.Object obj29 = hashMap27.remove((java.lang.Object) 0.0f);
        hashMap27.modCount = (byte) 100;
        system.classfixer.classes.HashMap.Entry[] entryArray32 = hashMap27.table;
        hashMap20.table = entryArray32;
        system.classfixer.classes.HashMap hashMap34 = new system.classfixer.classes.HashMap();
        boolean boolean35 = hashMap34.repOK();
        hashMap34.clear();
        int int37 = hashMap34.size();
        int int38 = hashMap34.size();
        system.classfixer.classes.HashMap hashMap39 = new system.classfixer.classes.HashMap();
        java.lang.Object obj41 = hashMap39.remove((java.lang.Object) 0.0f);
        hashMap39.modCount = (byte) 100;
        java.lang.Object obj44 = hashMap34.get((java.lang.Object) (byte) 100);
        java.lang.Object obj46 = hashMap34.get((java.lang.Object) 0L);
        java.lang.Object obj47 = hashMap20.remove(obj46);
        java.lang.Object obj49 = hashMap20.remove((java.lang.Object) (-1.0d));
        system.classfixer.classes.HashMap hashMap51 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean52 = hashMap51.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray53 = hashMap51.table;
        system.classfixer.classes.HashMap.Entry[] entryArray54 = hashMap51.table;
        int int55 = hashMap51.size();
        java.lang.Object obj56 = hashMap1.put((java.lang.Object) hashMap20, (java.lang.Object) int55);
        int int57 = hashMap1.modCount;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        boolean boolean3 = hashMap2.repOK();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object obj6 = hashMap2.put(obj4, (java.lang.Object) 100);
        hashMap2.clear();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.repOK();
        hashMap8.clear();
        int int11 = hashMap8.size();
        int int12 = hashMap8.size();
        java.lang.Object obj14 = hashMap8.get((java.lang.Object) (byte) 100);
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        java.lang.Object obj17 = hashMap15.remove((java.lang.Object) 0.0f);
        hashMap15.modCount = (byte) 100;
        system.classfixer.classes.HashMap.Entry[] entryArray20 = hashMap15.table;
        hashMap8.table = entryArray20;
        java.lang.Object obj22 = hashMap1.put((java.lang.Object) hashMap2, (java.lang.Object) hashMap8);
        int int23 = hashMap2.modCount;
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray26 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap25.table = entryArray26;
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean30 = hashMap29.isEmpty();
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap();
        java.lang.Object obj33 = hashMap31.remove((java.lang.Object) 0.0f);
        java.lang.Object obj34 = hashMap29.get((java.lang.Object) hashMap31);
        system.classfixer.classes.HashMap.Entry[] entryArray35 = hashMap31.table;
        hashMap25.table = entryArray35;
        boolean boolean37 = hashMap25.isEmpty();
        int int38 = hashMap25.modCount;
        system.classfixer.classes.HashMap hashMap41 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        hashMap41.clear();
        boolean boolean43 = hashMap41.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray44 = hashMap41.table;
        java.lang.Object obj45 = hashMap2.put((java.lang.Object) hashMap25, (java.lang.Object) hashMap41);
        boolean boolean46 = hashMap2.repOK();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 0, (float) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        boolean boolean2 = hashMap1.repOK();
        hashMap1.modCount = 0;
        boolean boolean5 = hashMap1.repOK();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        boolean boolean7 = hashMap6.repOK();
        hashMap6.clear();
        int int9 = hashMap6.size();
        int int10 = hashMap6.size();
        int int11 = hashMap6.size();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap6.table;
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap(0);
        int int15 = hashMap14.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap14.table;
        java.lang.Object obj17 = hashMap6.get((java.lang.Object) entryArray16);
        boolean boolean18 = hashMap6.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap6.table;
        hashMap1.table = entryArray19;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        int int2 = hashMap1.size();
        hashMap1.clear();
        hashMap1.modCount = (byte) 100;
        boolean boolean6 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) (byte) 100);
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        boolean boolean10 = hashMap9.repOK();
        hashMap9.clear();
        int int12 = hashMap9.size();
        int int13 = hashMap9.size();
        java.lang.Object obj15 = hashMap9.get((java.lang.Object) (byte) 100);
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        java.lang.Object obj18 = hashMap16.remove((java.lang.Object) 0.0f);
        hashMap16.modCount = (byte) 100;
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap16.table;
        hashMap9.table = entryArray21;
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap();
        boolean boolean24 = hashMap23.repOK();
        hashMap23.clear();
        int int26 = hashMap23.size();
        int int27 = hashMap23.size();
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap();
        java.lang.Object obj30 = hashMap28.remove((java.lang.Object) 0.0f);
        hashMap28.modCount = (byte) 100;
        java.lang.Object obj33 = hashMap23.get((java.lang.Object) (byte) 100);
        java.lang.Object obj35 = hashMap23.get((java.lang.Object) 0L);
        java.lang.Object obj36 = hashMap9.remove(obj35);
        java.lang.Object obj38 = hashMap9.remove((java.lang.Object) (-1.0d));
        java.lang.Object obj39 = hashMap1.put((java.lang.Object) (byte) 100, (java.lang.Object) (-1.0d));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) hashMap4);
        hashMap4.clear();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.repOK();
        hashMap8.clear();
        int int11 = hashMap8.size();
        int int12 = hashMap8.size();
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = hashMap8.get((java.lang.Object) wildcardClass14);
        int int16 = hashMap8.modCount;
        java.lang.Object obj17 = hashMap4.put((java.lang.Object) 102, (java.lang.Object) int16);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap4", hashMap4.repOK_2());
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean2 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap3.remove((java.lang.Object) 0.0f);
        java.lang.Object obj6 = hashMap1.get((java.lang.Object) hashMap3);
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap3.table;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.repOK();
        hashMap8.clear();
        int int11 = hashMap8.size();
        int int12 = hashMap8.size();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        java.lang.Object obj15 = hashMap13.remove((java.lang.Object) 0.0f);
        hashMap13.modCount = (byte) 100;
        java.lang.Object obj18 = hashMap8.get((java.lang.Object) (byte) 100);
        java.lang.Object obj20 = hashMap8.get((java.lang.Object) 0L);
        java.lang.Object obj21 = hashMap3.remove((java.lang.Object) hashMap8);
        boolean boolean22 = hashMap8.repOK();
        boolean boolean23 = hashMap8.repOK();
        boolean boolean24 = hashMap8.repOK();
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap();
        hashMap25.clear();
        hashMap25.clear();
        java.lang.Object obj28 = hashMap8.remove((java.lang.Object) hashMap25);
        hashMap8.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap8", hashMap8.repOK_2());
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) ' ', (float) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        int int3 = hashMap1.size();
        int int4 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) 'a');
        boolean boolean7 = hashMap6.isEmpty();
        boolean boolean8 = hashMap6.isEmpty();
        hashMap6.clear();
        java.lang.Object obj10 = hashMap1.get((java.lang.Object) hashMap6);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        boolean boolean12 = hashMap11.repOK();
        hashMap11.clear();
        int int14 = hashMap11.size();
        int int15 = hashMap11.size();
        java.lang.Object obj17 = hashMap11.get((java.lang.Object) (byte) 100);
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        java.lang.Object obj20 = hashMap18.remove((java.lang.Object) 0.0f);
        hashMap18.modCount = (byte) 100;
        system.classfixer.classes.HashMap.Entry[] entryArray23 = hashMap18.table;
        hashMap11.table = entryArray23;
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap();
        boolean boolean26 = hashMap25.repOK();
        hashMap25.clear();
        int int28 = hashMap25.size();
        int int29 = hashMap25.size();
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap();
        java.lang.Object obj32 = hashMap30.remove((java.lang.Object) 0.0f);
        hashMap30.modCount = (byte) 100;
        java.lang.Object obj35 = hashMap25.get((java.lang.Object) (byte) 100);
        java.lang.Object obj37 = hashMap25.get((java.lang.Object) 0L);
        java.lang.Object obj38 = hashMap11.remove(obj37);
        boolean boolean39 = hashMap11.repOK();
        system.classfixer.classes.HashMap hashMap40 = new system.classfixer.classes.HashMap();
        java.lang.Object obj42 = hashMap40.remove((java.lang.Object) 0.0f);
        hashMap40.modCount = (byte) 100;
        system.classfixer.classes.HashMap.Entry[] entryArray45 = hashMap40.table;
        hashMap40.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray47 = hashMap40.table;
        boolean boolean48 = hashMap40.isEmpty();
        java.lang.Object obj49 = hashMap1.put((java.lang.Object) hashMap11, (java.lang.Object) boolean48);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(100, (float) 1);
        int int3 = hashMap2.size();
        java.lang.Object obj5 = hashMap2.remove((java.lang.Object) (-1L));
        int int6 = hashMap2.size();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        java.lang.Object obj9 = hashMap7.remove((java.lang.Object) 0.0f);
        boolean boolean10 = hashMap7.isEmpty();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean13 = hashMap12.isEmpty();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        java.lang.Object obj16 = hashMap14.remove((java.lang.Object) 0.0f);
        java.lang.Object obj17 = hashMap12.get((java.lang.Object) hashMap14);
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        java.lang.Object obj20 = hashMap18.remove((java.lang.Object) 0.0f);
        hashMap18.modCount = (byte) 100;
        hashMap18.clear();
        java.lang.Object obj24 = hashMap12.get((java.lang.Object) hashMap18);
        hashMap18.clear();
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray28 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap27.table = entryArray28;
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean32 = hashMap31.isEmpty();
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap();
        java.lang.Object obj35 = hashMap33.remove((java.lang.Object) 0.0f);
        java.lang.Object obj36 = hashMap31.get((java.lang.Object) hashMap33);
        system.classfixer.classes.HashMap.Entry[] entryArray37 = hashMap33.table;
        hashMap27.table = entryArray37;
        java.lang.Object obj39 = hashMap18.remove((java.lang.Object) hashMap27);
        hashMap18.modCount = 1;
        java.lang.Object obj42 = hashMap7.remove((java.lang.Object) hashMap18);
        boolean boolean43 = hashMap7.repOK();
        system.classfixer.classes.HashMap hashMap45 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean46 = hashMap45.isEmpty();
        system.classfixer.classes.HashMap hashMap47 = new system.classfixer.classes.HashMap();
        java.lang.Object obj49 = hashMap47.remove((java.lang.Object) 0.0f);
        java.lang.Object obj50 = hashMap45.get((java.lang.Object) hashMap47);
        system.classfixer.classes.HashMap.Entry[] entryArray51 = hashMap47.table;
        system.classfixer.classes.HashMap hashMap52 = new system.classfixer.classes.HashMap();
        boolean boolean53 = hashMap52.repOK();
        hashMap52.clear();
        int int55 = hashMap52.size();
        int int56 = hashMap52.size();
        system.classfixer.classes.HashMap hashMap57 = new system.classfixer.classes.HashMap();
        java.lang.Object obj59 = hashMap57.remove((java.lang.Object) 0.0f);
        hashMap57.modCount = (byte) 100;
        java.lang.Object obj62 = hashMap52.get((java.lang.Object) (byte) 100);
        java.lang.Object obj64 = hashMap52.get((java.lang.Object) 0L);
        java.lang.Object obj65 = hashMap47.remove((java.lang.Object) hashMap52);
        system.classfixer.classes.HashMap hashMap67 = new system.classfixer.classes.HashMap((int) ' ');
        int int68 = hashMap67.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray69 = hashMap67.table;
        hashMap47.table = entryArray69;
        hashMap7.table = entryArray69;
        java.lang.Object obj72 = null;
        java.lang.Object obj73 = hashMap2.put((java.lang.Object) entryArray69, obj72);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 100, (float) 35);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(0, (float) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        boolean boolean2 = hashMap1.isEmpty();
        boolean boolean3 = hashMap1.repOK();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        boolean boolean5 = hashMap4.repOK();
        hashMap4.clear();
        int int7 = hashMap4.size();
        int int8 = hashMap4.size();
        int int9 = hashMap4.size();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap((int) ' ');
        boolean boolean12 = hashMap11.isEmpty();
        hashMap11.modCount = 1;
        hashMap11.modCount = '4';
        java.lang.Object obj17 = hashMap4.remove((java.lang.Object) hashMap11);
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap4.table;
        java.lang.Object obj19 = hashMap1.remove((java.lang.Object) hashMap4);
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean22 = hashMap21.isEmpty();
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap();
        java.lang.Object obj25 = hashMap23.remove((java.lang.Object) 0.0f);
        java.lang.Object obj26 = hashMap21.get((java.lang.Object) hashMap23);
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean29 = hashMap28.isEmpty();
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap();
        java.lang.Object obj32 = hashMap30.remove((java.lang.Object) 0.0f);
        java.lang.Object obj33 = hashMap28.get((java.lang.Object) hashMap30);
        system.classfixer.classes.HashMap.Entry[] entryArray34 = hashMap30.table;
        java.lang.Class<?> wildcardClass35 = entryArray34.getClass();
        java.lang.Object obj36 = hashMap23.get((java.lang.Object) entryArray34);
        int int37 = hashMap23.size();
        boolean boolean38 = hashMap23.repOK();
        system.classfixer.classes.HashMap hashMap39 = new system.classfixer.classes.HashMap();
        boolean boolean40 = hashMap39.repOK();
        hashMap39.clear();
        int int42 = hashMap39.size();
        int int43 = hashMap39.size();
        int int44 = hashMap39.size();
        system.classfixer.classes.HashMap hashMap46 = new system.classfixer.classes.HashMap((int) ' ');
        boolean boolean47 = hashMap46.isEmpty();
        hashMap46.modCount = 1;
        hashMap46.modCount = '4';
        java.lang.Object obj52 = hashMap39.remove((java.lang.Object) hashMap46);
        boolean boolean53 = hashMap39.isEmpty();
        hashMap39.modCount = 35;
        system.classfixer.classes.HashMap.Entry[] entryArray56 = hashMap39.table;
        java.lang.Object obj57 = hashMap4.put((java.lang.Object) boolean38, (java.lang.Object) entryArray56);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap4", hashMap4.repOK_2());
    }
}

