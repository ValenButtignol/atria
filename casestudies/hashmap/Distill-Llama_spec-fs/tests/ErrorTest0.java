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
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) true);
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj4 = hashMap0.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap4.table = entryArray5;
        hashMap3.table = entryArray5;
        java.lang.Object obj8 = hashMap0.put((java.lang.Object) 1.0d, (java.lang.Object) hashMap3);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray1 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap0.table = entryArray1;
        int int3 = hashMap0.size();
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.modCount = (byte) 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap0.table;
        java.lang.Object obj5 = hashMap0.put((java.lang.Object) 100L, (java.lang.Object) "");
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.isEmpty();
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        int int2 = hashMap1.modCount;
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = hashMap1.put((java.lang.Object) 100, obj4);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        boolean boolean3 = hashMap2.repOK();
        java.lang.Object obj5 = hashMap2.get((java.lang.Object) 0);
        int int6 = hashMap2.size();
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap2.table;
        java.lang.Object obj8 = hashMap0.put((java.lang.Object) 0L, (java.lang.Object) hashMap2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) true);
        boolean boolean3 = hashMap0.isEmpty();
        hashMap0.modCount = (short) 0;
        boolean boolean6 = hashMap0.isEmpty();
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap2.table = entryArray3;
        hashMap0.table = entryArray3;
        hashMap0.modCount = (byte) 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        int int3 = hashMap2.size();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        int int7 = hashMap6.modCount;
        java.lang.Object obj9 = hashMap2.put((java.lang.Object) hashMap6, (java.lang.Object) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) true);
        boolean boolean3 = hashMap0.isEmpty();
        int int4 = hashMap0.size();
        hashMap0.modCount = 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        boolean boolean3 = hashMap2.repOK();
        java.lang.Object obj4 = hashMap0.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMap2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap5.table = entryArray6;
        hashMap4.table = entryArray6;
        java.lang.Object obj9 = hashMap0.get((java.lang.Object) hashMap4);
        int int10 = hashMap4.modCount;
        hashMap4.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap4", hashMap4.repOK_2());
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) true);
        boolean boolean3 = hashMap0.isEmpty();
        hashMap0.modCount = (short) 0;
        boolean boolean6 = hashMap0.isEmpty();
        boolean boolean7 = hashMap0.repOK();
        int int8 = hashMap0.size();
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) true);
        boolean boolean3 = hashMap0.isEmpty();
        int int4 = hashMap0.modCount;
        hashMap0.modCount = '#';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) 0);
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap(0);
        int int7 = hashMap6.size();
        boolean boolean8 = hashMap6.repOK();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap(0);
        int int11 = hashMap10.modCount;
        boolean boolean12 = hashMap10.repOK();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap(0);
        boolean boolean15 = hashMap14.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap14.table;
        hashMap10.table = entryArray16;
        java.lang.Object obj18 = hashMap0.put((java.lang.Object) boolean8, (java.lang.Object) hashMap10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap5.table = entryArray6;
        hashMap4.table = entryArray6;
        java.lang.Object obj9 = hashMap0.get((java.lang.Object) hashMap4);
        hashMap0.modCount = 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) 0);
        int int4 = hashMap0.size();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap0.table;
        java.lang.Object obj6 = null;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap(0);
        boolean boolean9 = hashMap8.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap8.table;
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap8.table;
        java.lang.Object obj12 = hashMap0.put(obj6, (java.lang.Object) hashMap8);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.isEmpty();
        int int3 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) 'a');
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap(100);
        java.lang.Object obj8 = hashMap0.put((java.lang.Object) hashMap5, (java.lang.Object) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) true);
        boolean boolean3 = hashMap0.isEmpty();
        hashMap0.modCount = (short) 0;
        boolean boolean6 = hashMap0.repOK();
        hashMap0.modCount = '4';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        boolean boolean2 = hashMap1.repOK();
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap5.table = entryArray6;
        hashMap4.table = entryArray6;
        java.lang.Object obj9 = hashMap0.get((java.lang.Object) hashMap4);
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap4.table;
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap4.table;
        hashMap4.modCount = 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap4", hashMap4.repOK_2());
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        int int3 = hashMap2.size();
        int int4 = hashMap2.size();
        hashMap2.modCount = '4';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        int int3 = hashMap2.size();
        hashMap2.modCount = ' ';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 10);
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int2 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        int int6 = hashMap5.size();
        system.classfixer.classes.HashMap.Entry entry7 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray8 = new system.classfixer.classes.HashMap.Entry[] { entry7 };
        hashMap5.table = entryArray8;
        hashMap1.table = entryArray8;
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) true);
        boolean boolean3 = hashMap0.isEmpty();
        hashMap0.modCount = (short) 0;
        boolean boolean6 = hashMap0.isEmpty();
        boolean boolean7 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.repOK();
        java.lang.Object obj11 = hashMap8.get((java.lang.Object) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap8.table;
        java.lang.Object obj13 = hashMap0.get((java.lang.Object) hashMap8);
        hashMap8.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap8", hashMap8.repOK_2());
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 10);
        int int2 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        java.lang.Object obj8 = hashMap1.remove((java.lang.Object) hashMap5);
        hashMap5.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap5", hashMap5.repOK_2());
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(100, (float) 10L);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.repOK();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap5.table = entryArray6;
        hashMap3.table = entryArray6;
        boolean boolean9 = hashMap3.repOK();
        java.lang.Object obj10 = hashMap2.get((java.lang.Object) boolean9);
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap5.table = entryArray6;
        hashMap4.table = entryArray6;
        java.lang.Object obj9 = hashMap0.get((java.lang.Object) hashMap4);
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap4.table;
        boolean boolean11 = hashMap4.repOK();
        hashMap4.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap4", hashMap4.repOK_2());
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        boolean boolean2 = hashMap1.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap1.table;
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap1.table;
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap1.table;
        hashMap1.modCount = '4';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        int int2 = hashMap1.modCount;
        boolean boolean3 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (short) 1);
        boolean boolean6 = hashMap5.isEmpty();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap9.table = entryArray10;
        hashMap8.table = entryArray10;
        hashMap5.table = entryArray10;
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        boolean boolean15 = hashMap14.repOK();
        java.lang.Object obj17 = hashMap14.get((java.lang.Object) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap14.table;
        java.lang.Object obj19 = hashMap1.put((java.lang.Object) entryArray10, (java.lang.Object) hashMap14);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap2.table = entryArray3;
        hashMap1.table = entryArray3;
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        boolean boolean2 = hashMap1.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap1.table;
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap1.table;
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap1.table;
        hashMap1.modCount = (short) 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap0.table;
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap0.table;
        hashMap0.modCount = (byte) 0;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap2.table = entryArray3;
        hashMap0.table = entryArray3;
        hashMap0.modCount = (short) 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) ' ');
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap(0);
        boolean boolean4 = hashMap3.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap3.table;
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap3.table;
        hashMap1.table = entryArray6;
        int int8 = hashMap1.modCount;
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        int int3 = hashMap2.size();
        java.lang.Object obj5 = hashMap2.remove((java.lang.Object) 'a');
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Object obj8 = hashMap2.remove((java.lang.Object) hashMap7);
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap7.table;
        int int10 = hashMap7.modCount;
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        int int14 = hashMap13.size();
        int int15 = hashMap13.size();
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        int int19 = hashMap18.size();
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        boolean boolean21 = hashMap20.repOK();
        boolean boolean22 = hashMap20.isEmpty();
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray26 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap25.table = entryArray26;
        hashMap24.table = entryArray26;
        java.lang.Object obj29 = hashMap20.get((java.lang.Object) hashMap24);
        system.classfixer.classes.HashMap.Entry[] entryArray30 = hashMap24.table;
        hashMap18.table = entryArray30;
        hashMap13.table = entryArray30;
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray34 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap33.table = entryArray34;
        int int36 = hashMap33.size();
        boolean boolean37 = hashMap33.isEmpty();
        system.classfixer.classes.HashMap hashMap38 = new system.classfixer.classes.HashMap();
        boolean boolean39 = hashMap38.repOK();
        java.lang.Object obj41 = hashMap38.get((java.lang.Object) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray42 = hashMap38.table;
        system.classfixer.classes.HashMap hashMap45 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        int int46 = hashMap45.size();
        system.classfixer.classes.HashMap.Entry entry47 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray48 = new system.classfixer.classes.HashMap.Entry[] { entry47 };
        hashMap45.table = entryArray48;
        hashMap38.table = entryArray48;
        hashMap33.table = entryArray48;
        java.lang.Object obj52 = hashMap7.put((java.lang.Object) entryArray30, (java.lang.Object) hashMap33);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap7", hashMap7.repOK_2());
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 1, (float) '#');
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.repOK();
        boolean boolean5 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap8.table = entryArray9;
        hashMap7.table = entryArray9;
        java.lang.Object obj12 = hashMap3.get((java.lang.Object) hashMap7);
        java.lang.Object obj13 = hashMap2.remove((java.lang.Object) hashMap7);
        hashMap2.modCount = '#';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) '4');
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        int int3 = hashMap2.size();
        java.lang.Object obj5 = hashMap2.remove((java.lang.Object) 'a');
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Object obj8 = hashMap2.remove((java.lang.Object) hashMap7);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap(100);
        java.lang.Object obj14 = hashMap11.remove((java.lang.Object) hashMap13);
        int int15 = hashMap11.size();
        boolean boolean16 = hashMap11.isEmpty();
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        int int20 = hashMap19.size();
        int int21 = hashMap19.size();
        boolean boolean22 = hashMap19.repOK();
        java.lang.Object obj23 = hashMap7.put((java.lang.Object) hashMap11, (java.lang.Object) boolean22);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap7", hashMap7.repOK_2());
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) '4');
        int int2 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.repOK();
        java.lang.Object obj6 = hashMap3.get((java.lang.Object) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap3.table;
        hashMap3.modCount = 0;
        java.lang.Object obj10 = hashMap1.remove((java.lang.Object) 0);
        int int11 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap(0);
        boolean boolean14 = hashMap13.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap13.table;
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap13.table;
        int int17 = hashMap13.modCount;
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        boolean boolean19 = hashMap18.repOK();
        java.lang.Object obj20 = hashMap1.put((java.lang.Object) hashMap13, (java.lang.Object) hashMap18);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(0, (float) 10);
        hashMap2.modCount = '#';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        boolean boolean2 = hashMap1.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap1.table;
        boolean boolean4 = hashMap1.isEmpty();
        boolean boolean5 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        int int10 = hashMap9.size();
        system.classfixer.classes.HashMap.Entry entry11 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray12 = new system.classfixer.classes.HashMap.Entry[] { entry11 };
        hashMap9.table = entryArray12;
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = hashMap16.remove(obj17);
        java.lang.Object obj20 = hashMap9.remove(obj19);
        int int21 = hashMap9.size();
        boolean boolean22 = hashMap9.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray23 = hashMap9.table;
        java.lang.Object obj24 = hashMap1.put((java.lang.Object) (short) 1, (java.lang.Object) hashMap9);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap2.table = entryArray3;
        hashMap0.table = entryArray3;
        hashMap0.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap(100);
        java.lang.Object obj5 = hashMap2.remove((java.lang.Object) hashMap4);
        hashMap4.modCount = (byte) 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap4", hashMap4.repOK_2());
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 100);
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        boolean boolean3 = hashMap2.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap2.table;
        java.lang.Object obj5 = hashMap1.get((java.lang.Object) hashMap2);
        hashMap1.modCount = (byte) 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        hashMap1.modCount = 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        int int2 = hashMap1.modCount;
        boolean boolean3 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        boolean boolean5 = hashMap4.repOK();
        java.lang.Object obj7 = hashMap4.get((java.lang.Object) 0);
        boolean boolean8 = hashMap4.repOK();
        java.lang.Object obj10 = hashMap1.put((java.lang.Object) hashMap4, (java.lang.Object) (-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        int int3 = hashMap2.size();
        system.classfixer.classes.HashMap.Entry entry4 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray5 = new system.classfixer.classes.HashMap.Entry[] { entry4 };
        hashMap2.table = entryArray5;
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        java.lang.Object obj12 = hashMap9.remove(obj10);
        java.lang.Object obj13 = hashMap2.remove(obj12);
        int int14 = hashMap2.size();
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        boolean boolean16 = hashMap15.repOK();
        java.lang.Object obj18 = hashMap15.get((java.lang.Object) 0);
        int int19 = hashMap15.size();
        java.lang.Object obj20 = null;
        java.lang.Object obj21 = hashMap15.remove(obj20);
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        boolean boolean23 = hashMap22.repOK();
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray25 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap24.table = entryArray25;
        hashMap22.table = entryArray25;
        hashMap15.table = entryArray25;
        hashMap2.table = entryArray25;
        system.classfixer.classes.HashMap.Entry[] entryArray30 = hashMap2.table;
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 100);
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        boolean boolean3 = hashMap2.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap2.table;
        java.lang.Object obj5 = hashMap1.get((java.lang.Object) hashMap2);
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        hashMap1.modCount = (byte) 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        boolean boolean2 = hashMap1.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap1.table;
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap1.table;
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap1.table;
        int int6 = hashMap1.modCount;
        hashMap1.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) 0);
        int int4 = hashMap0.size();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap8.table = entryArray9;
        hashMap7.table = entryArray9;
        hashMap0.table = entryArray9;
        boolean boolean13 = hashMap0.isEmpty();
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 10);
        int int2 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        java.lang.Object obj8 = hashMap1.remove((java.lang.Object) hashMap5);
        boolean boolean9 = hashMap5.repOK();
        hashMap5.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap5", hashMap5.repOK_2());
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        int int3 = hashMap2.size();
        system.classfixer.classes.HashMap.Entry entry4 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray5 = new system.classfixer.classes.HashMap.Entry[] { entry4 };
        hashMap2.table = entryArray5;
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        boolean boolean2 = hashMap1.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap1.table;
        boolean boolean4 = hashMap1.isEmpty();
        boolean boolean5 = hashMap1.isEmpty();
        hashMap1.modCount = (short) 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) true);
        boolean boolean3 = hashMap0.isEmpty();
        hashMap0.modCount = (short) 0;
        boolean boolean6 = hashMap0.isEmpty();
        boolean boolean7 = hashMap0.isEmpty();
        hashMap0.modCount = 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) '4', (float) (byte) 1);
        boolean boolean3 = hashMap2.repOK();
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        boolean boolean2 = hashMap1.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap1.table;
        boolean boolean4 = hashMap1.isEmpty();
        boolean boolean5 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        boolean boolean7 = hashMap6.repOK();
        java.lang.Object obj9 = hashMap6.get((java.lang.Object) 0);
        int int10 = hashMap6.size();
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap6.table;
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray15 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap14.table = entryArray15;
        hashMap13.table = entryArray15;
        hashMap6.table = entryArray15;
        boolean boolean19 = hashMap6.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray20 = hashMap6.table;
        int int21 = hashMap6.size();
        int int22 = hashMap6.size();
        system.classfixer.classes.HashMap.Entry[] entryArray23 = hashMap6.table;
        java.lang.Object obj25 = hashMap1.put((java.lang.Object) entryArray23, (java.lang.Object) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        int int2 = hashMap1.modCount;
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 100);
        hashMap1.modCount = '4';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) ' ');
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap(0);
        boolean boolean4 = hashMap3.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap3.table;
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap3.table;
        hashMap1.table = entryArray6;
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        boolean boolean11 = hashMap10.repOK();
        boolean boolean12 = hashMap10.isEmpty();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray16 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap15.table = entryArray16;
        hashMap14.table = entryArray16;
        java.lang.Object obj19 = hashMap10.get((java.lang.Object) hashMap14);
        system.classfixer.classes.HashMap.Entry[] entryArray20 = hashMap14.table;
        hashMap9.table = entryArray20;
        boolean boolean22 = hashMap9.repOK();
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap();
        boolean boolean24 = hashMap23.repOK();
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray26 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap25.table = entryArray26;
        hashMap23.table = entryArray26;
        hashMap9.table = entryArray26;
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        boolean boolean33 = hashMap32.repOK();
        boolean boolean34 = hashMap32.repOK();
        java.lang.Object obj35 = hashMap1.put((java.lang.Object) entryArray26, (java.lang.Object) hashMap32);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        int int3 = hashMap2.size();
        java.lang.Object obj5 = hashMap2.remove((java.lang.Object) 'a');
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Object obj8 = hashMap2.remove((java.lang.Object) hashMap7);
        hashMap7.modCount = ' ';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap7", hashMap7.repOK_2());
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 100, (float) 100L);
        boolean boolean3 = hashMap2.isEmpty();
        hashMap2.modCount = (short) 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) 0);
        int int4 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) ' ');
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap6.table;
        hashMap0.table = entryArray7;
        hashMap0.modCount = (short) 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        int int3 = hashMap2.size();
        java.lang.Object obj5 = hashMap2.remove((java.lang.Object) 'a');
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Object obj8 = hashMap2.remove((java.lang.Object) hashMap7);
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        java.lang.Object obj11 = hashMap9.remove((java.lang.Object) true);
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap(0);
        boolean boolean14 = hashMap13.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap13.table;
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap13.table;
        int int17 = hashMap13.modCount;
        java.lang.Object obj18 = hashMap7.put((java.lang.Object) hashMap9, (java.lang.Object) hashMap13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap7", hashMap7.repOK_2());
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap2.table = entryArray3;
        hashMap1.table = entryArray3;
        boolean boolean6 = hashMap1.repOK();
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap5.table = entryArray6;
        hashMap4.table = entryArray6;
        java.lang.Object obj9 = hashMap0.get((java.lang.Object) hashMap4);
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap4.table;
        hashMap4.modCount = 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap4", hashMap4.repOK_2());
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) true);
        boolean boolean3 = hashMap0.isEmpty();
        hashMap0.modCount = (short) 0;
        boolean boolean6 = hashMap0.isEmpty();
        boolean boolean7 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.repOK();
        java.lang.Object obj11 = hashMap8.get((java.lang.Object) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap8.table;
        java.lang.Object obj13 = hashMap0.get((java.lang.Object) hashMap8);
        hashMap0.modCount = (short) 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        int int3 = hashMap2.size();
        java.lang.Object obj5 = hashMap2.get((java.lang.Object) 100);
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        boolean boolean7 = hashMap6.repOK();
        java.lang.Object obj9 = hashMap6.get((java.lang.Object) 0);
        int int10 = hashMap6.size();
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap6.table;
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray15 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap14.table = entryArray15;
        hashMap13.table = entryArray15;
        hashMap6.table = entryArray15;
        boolean boolean19 = hashMap6.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray20 = hashMap6.table;
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap((int) 'a');
        int int23 = hashMap22.modCount;
        java.lang.Object obj24 = hashMap2.put((java.lang.Object) entryArray20, (java.lang.Object) hashMap22);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        int int3 = hashMap2.size();
        system.classfixer.classes.HashMap.Entry entry4 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray5 = new system.classfixer.classes.HashMap.Entry[] { entry4 };
        hashMap2.table = entryArray5;
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        java.lang.Object obj12 = hashMap9.remove(obj10);
        java.lang.Object obj13 = hashMap2.remove(obj12);
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap(0);
        boolean boolean16 = hashMap15.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap15.table;
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap15.table;
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap15.table;
        int int20 = hashMap15.modCount;
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap((int) ' ');
        java.lang.Object obj23 = hashMap2.put((java.lang.Object) hashMap15, (java.lang.Object) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) 0);
        int int4 = hashMap0.size();
        java.lang.Object obj5 = null;
        java.lang.Object obj6 = hashMap0.remove(obj5);
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(100, (float) 10L);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.repOK();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap5.table = entryArray6;
        hashMap3.table = entryArray6;
        boolean boolean9 = hashMap3.repOK();
        java.lang.Object obj10 = hashMap2.get((java.lang.Object) boolean9);
        java.lang.Object obj12 = hashMap2.get((java.lang.Object) 10L);
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        boolean boolean2 = hashMap1.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap1.table;
        boolean boolean4 = hashMap1.isEmpty();
        boolean boolean5 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap(0);
        boolean boolean8 = hashMap7.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap7.table;
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap7.table;
        int int11 = hashMap7.modCount;
        java.lang.Object obj12 = hashMap1.remove((java.lang.Object) hashMap7);
        hashMap1.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 100);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap((int) (byte) 10);
        java.lang.Object obj4 = hashMap1.remove((java.lang.Object) (byte) 10);
        boolean boolean5 = hashMap1.repOK();
        boolean boolean6 = hashMap1.isEmpty();
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) true);
        boolean boolean3 = hashMap0.isEmpty();
        int int4 = hashMap0.modCount;
        hashMap0.modCount = (byte) 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) 0);
        boolean boolean4 = hashMap0.isEmpty();
        java.lang.Object obj5 = null;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        boolean boolean7 = hashMap6.repOK();
        java.lang.Object obj9 = hashMap6.get((java.lang.Object) 0);
        int int10 = hashMap6.size();
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap6.table;
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray15 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap14.table = entryArray15;
        hashMap13.table = entryArray15;
        hashMap6.table = entryArray15;
        boolean boolean19 = hashMap6.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray20 = hashMap6.table;
        int int21 = hashMap6.size();
        system.classfixer.classes.HashMap.Entry[] entryArray22 = hashMap6.table;
        java.lang.Object obj23 = hashMap0.put(obj5, (java.lang.Object) hashMap6);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) 0);
        int int4 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean7 = hashMap6.isEmpty();
        int int8 = hashMap6.modCount;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) ' ');
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap(0);
        boolean boolean13 = hashMap12.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap12.table;
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap12.table;
        hashMap10.table = entryArray15;
        java.lang.Object obj17 = hashMap0.put((java.lang.Object) hashMap6, (java.lang.Object) entryArray15);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        int int3 = hashMap2.size();
        java.lang.Object obj5 = hashMap2.remove((java.lang.Object) 'a');
        boolean boolean6 = hashMap2.isEmpty();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        int int10 = hashMap9.size();
        system.classfixer.classes.HashMap.Entry entry11 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray12 = new system.classfixer.classes.HashMap.Entry[] { entry11 };
        hashMap9.table = entryArray12;
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = hashMap16.remove(obj17);
        java.lang.Object obj20 = hashMap9.remove(obj19);
        int int21 = hashMap9.modCount;
        int int22 = hashMap9.modCount;
        java.lang.Object obj24 = hashMap2.put((java.lang.Object) hashMap9, (java.lang.Object) 100.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap5.table = entryArray6;
        hashMap4.table = entryArray6;
        java.lang.Object obj9 = hashMap0.get((java.lang.Object) hashMap4);
        int int10 = hashMap0.size();
        boolean boolean11 = hashMap0.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        int int16 = hashMap15.size();
        system.classfixer.classes.HashMap.Entry entry17 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray18 = new system.classfixer.classes.HashMap.Entry[] { entry17 };
        hashMap15.table = entryArray18;
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        java.lang.Object obj25 = hashMap22.remove(obj23);
        java.lang.Object obj26 = hashMap15.remove(obj25);
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        int int30 = hashMap29.size();
        java.lang.Object obj32 = hashMap29.remove((java.lang.Object) 'a');
        system.classfixer.classes.HashMap hashMap34 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Object obj35 = hashMap29.remove((java.lang.Object) hashMap34);
        java.lang.Object obj36 = hashMap0.put(obj25, (java.lang.Object) hashMap34);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) true);
        boolean boolean3 = hashMap0.isEmpty();
        hashMap0.modCount = (short) 0;
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap0.table;
        hashMap0.modCount = (byte) 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean2 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        int int6 = hashMap5.size();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        boolean boolean8 = hashMap7.repOK();
        boolean boolean9 = hashMap7.isEmpty();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap12.table = entryArray13;
        hashMap11.table = entryArray13;
        java.lang.Object obj16 = hashMap7.get((java.lang.Object) hashMap11);
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap11.table;
        hashMap5.table = entryArray17;
        java.lang.Class<?> wildcardClass19 = hashMap5.getClass();
        java.lang.Object obj20 = hashMap1.remove((java.lang.Object) hashMap5);
        hashMap5.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap5", hashMap5.repOK_2());
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 1, (float) 100L);
        int int3 = hashMap2.size();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap(0, (float) 10);
        java.lang.Class<?> wildcardClass7 = hashMap6.getClass();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap(100);
        java.lang.Object obj13 = hashMap10.remove((java.lang.Object) hashMap12);
        int int14 = hashMap10.size();
        boolean boolean15 = hashMap10.isEmpty();
        java.lang.Object obj16 = hashMap2.put((java.lang.Object) wildcardClass7, (java.lang.Object) boolean15);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 10);
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) 0);
        int int4 = hashMap0.size();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap8.table = entryArray9;
        hashMap7.table = entryArray9;
        hashMap0.table = entryArray9;
        hashMap0.modCount = 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean2 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap1.table;
        boolean boolean4 = hashMap1.isEmpty();
        java.lang.Object obj5 = null;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        int int9 = hashMap8.size();
        java.lang.Object obj11 = hashMap8.remove((java.lang.Object) 'a');
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Object obj14 = hashMap8.remove((java.lang.Object) hashMap13);
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap13.table;
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap(0);
        boolean boolean18 = hashMap17.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap17.table;
        system.classfixer.classes.HashMap.Entry[] entryArray20 = hashMap17.table;
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap();
        boolean boolean22 = hashMap21.repOK();
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray24 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap23.table = entryArray24;
        hashMap21.table = entryArray24;
        hashMap17.table = entryArray24;
        hashMap13.table = entryArray24;
        java.lang.Object obj29 = hashMap1.put(obj5, (java.lang.Object) hashMap13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap0.table;
        hashMap0.modCount = 0;
        boolean boolean7 = hashMap0.isEmpty();
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 1);
        int int2 = hashMap1.modCount;
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        int int3 = hashMap2.size();
        java.lang.Object obj5 = hashMap2.remove((java.lang.Object) 'a');
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        int int9 = hashMap8.size();
        system.classfixer.classes.HashMap.Entry entry10 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray11 = new system.classfixer.classes.HashMap.Entry[] { entry10 };
        hashMap8.table = entryArray11;
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        boolean boolean14 = hashMap13.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap13.table;
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap13.table;
        hashMap8.table = entryArray16;
        hashMap2.table = entryArray16;
        hashMap2.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        int int3 = hashMap2.size();
        java.lang.Object obj5 = hashMap2.remove((java.lang.Object) 'a');
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Object obj8 = hashMap2.remove((java.lang.Object) hashMap7);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap11.table = entryArray12;
        hashMap10.table = entryArray12;
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap((int) 'a');
        int int17 = hashMap16.modCount;
        boolean boolean18 = hashMap16.isEmpty();
        hashMap16.modCount = 0;
        java.lang.Object obj21 = hashMap2.put((java.lang.Object) entryArray12, (java.lang.Object) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        int int3 = hashMap2.size();
        int int4 = hashMap2.size();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap(0);
        int int7 = hashMap6.modCount;
        boolean boolean8 = hashMap6.repOK();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap(0);
        boolean boolean11 = hashMap10.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap10.table;
        hashMap6.table = entryArray12;
        hashMap6.modCount = 0;
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        int int19 = hashMap18.size();
        java.lang.Object obj21 = hashMap18.remove((java.lang.Object) 'a');
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Object obj24 = hashMap18.remove((java.lang.Object) hashMap23);
        system.classfixer.classes.HashMap.Entry[] entryArray25 = hashMap23.table;
        java.lang.Object obj26 = hashMap2.put((java.lang.Object) hashMap6, (java.lang.Object) hashMap23);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(100, (float) 1L);
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) 0);
        boolean boolean4 = hashMap0.repOK();
        hashMap0.modCount = (byte) 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(100, (float) 10L);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.repOK();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap5.table = entryArray6;
        hashMap3.table = entryArray6;
        boolean boolean9 = hashMap3.repOK();
        java.lang.Object obj10 = hashMap2.get((java.lang.Object) boolean9);
        java.lang.Object obj12 = hashMap2.get((java.lang.Object) 10L);
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        java.lang.Object obj15 = hashMap13.remove((java.lang.Object) true);
        boolean boolean16 = hashMap13.isEmpty();
        hashMap13.modCount = (short) 0;
        boolean boolean19 = hashMap13.isEmpty();
        java.lang.Object obj20 = hashMap2.get((java.lang.Object) boolean19);
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap();
        boolean boolean22 = hashMap21.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray23 = hashMap21.table;
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap21.table;
        java.lang.Object obj25 = hashMap2.get((java.lang.Object) hashMap21);
        hashMap21.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap21", hashMap21.repOK_2());
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap2.table = entryArray3;
        hashMap0.table = entryArray3;
        boolean boolean6 = hashMap0.repOK();
        int int7 = hashMap0.modCount;
        hashMap0.modCount = 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        boolean boolean2 = hashMap1.repOK();
        int int3 = hashMap1.modCount;
        boolean boolean4 = hashMap1.repOK();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        int int8 = hashMap7.size();
        java.lang.Object obj10 = hashMap7.get((java.lang.Object) 100);
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap(0);
        boolean boolean13 = hashMap12.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap12.table;
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap12.table;
        hashMap7.table = entryArray15;
        hashMap1.table = entryArray15;
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        boolean boolean20 = hashMap19.repOK();
        boolean boolean21 = hashMap19.isEmpty();
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray25 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap24.table = entryArray25;
        hashMap23.table = entryArray25;
        java.lang.Object obj28 = hashMap19.get((java.lang.Object) hashMap23);
        int int29 = hashMap19.size();
        boolean boolean30 = hashMap19.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray31 = hashMap19.table;
        boolean boolean32 = hashMap19.repOK();
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap();
        boolean boolean34 = hashMap33.repOK();
        boolean boolean35 = hashMap33.isEmpty();
        system.classfixer.classes.HashMap hashMap37 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap38 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray39 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap38.table = entryArray39;
        hashMap37.table = entryArray39;
        java.lang.Object obj42 = hashMap33.get((java.lang.Object) hashMap37);
        system.classfixer.classes.HashMap.Entry[] entryArray43 = hashMap37.table;
        hashMap19.table = entryArray43;
        system.classfixer.classes.HashMap.Entry[] entryArray45 = hashMap19.table;
        java.lang.Object obj46 = hashMap1.put((java.lang.Object) (byte) 10, (java.lang.Object) entryArray45);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        int int3 = hashMap2.size();
        java.lang.Object obj5 = hashMap2.remove((java.lang.Object) 'a');
        boolean boolean6 = hashMap2.isEmpty();
        hashMap2.modCount = (short) 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        boolean boolean2 = hashMap1.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap1.table;
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap1.table;
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap1.table;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        boolean boolean7 = hashMap6.repOK();
        java.lang.Object obj8 = hashMap1.remove((java.lang.Object) hashMap6);
        hashMap1.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        boolean boolean2 = hashMap1.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap1.table;
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap1.table;
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap1.table;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        boolean boolean7 = hashMap6.repOK();
        java.lang.Object obj8 = hashMap1.remove((java.lang.Object) hashMap6);
        int int9 = hashMap1.modCount;
        int int10 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Class<?> wildcardClass15 = hashMap14.getClass();
        java.lang.Object obj16 = hashMap12.get((java.lang.Object) wildcardClass15);
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        java.lang.Object obj19 = hashMap17.remove((java.lang.Object) true);
        boolean boolean20 = hashMap17.isEmpty();
        hashMap17.modCount = (short) 0;
        boolean boolean23 = hashMap17.isEmpty();
        boolean boolean24 = hashMap17.repOK();
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap();
        boolean boolean26 = hashMap25.repOK();
        java.lang.Object obj28 = hashMap25.get((java.lang.Object) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray29 = hashMap25.table;
        java.lang.Object obj30 = hashMap17.get((java.lang.Object) hashMap25);
        int int31 = hashMap25.size();
        int int32 = hashMap25.size();
        java.lang.Object obj33 = hashMap1.put(obj16, (java.lang.Object) int32);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        int int3 = hashMap2.size();
        java.lang.Object obj5 = hashMap2.remove((java.lang.Object) 'a');
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Object obj8 = hashMap2.remove((java.lang.Object) hashMap7);
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap7.table;
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap(0);
        boolean boolean12 = hashMap11.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap11.table;
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap11.table;
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        boolean boolean16 = hashMap15.repOK();
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray18 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap17.table = entryArray18;
        hashMap15.table = entryArray18;
        hashMap11.table = entryArray18;
        hashMap7.table = entryArray18;
        hashMap7.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap7", hashMap7.repOK_2());
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) '#', (float) ' ');
        boolean boolean3 = hashMap2.isEmpty();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap(10);
        boolean boolean6 = hashMap5.repOK();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        boolean boolean8 = hashMap7.repOK();
        java.lang.Object obj10 = hashMap7.get((java.lang.Object) 0);
        int int11 = hashMap7.size();
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = hashMap7.remove(obj12);
        java.lang.Object obj14 = hashMap2.put((java.lang.Object) boolean6, obj13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 100);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap((int) (byte) 10);
        java.lang.Object obj4 = hashMap1.remove((java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        java.lang.Object obj7 = hashMap5.remove((java.lang.Object) true);
        boolean boolean8 = hashMap5.isEmpty();
        int int9 = hashMap5.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap5.table;
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap(0);
        boolean boolean13 = hashMap12.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap12.table;
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap12.table;
        java.lang.Object obj16 = hashMap1.put((java.lang.Object) hashMap5, (java.lang.Object) entryArray15);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int2 = hashMap1.modCount;
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) '4', (float) (short) 1);
        hashMap2.modCount = '4';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        boolean boolean3 = hashMap2.repOK();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap4.table = entryArray5;
        hashMap2.table = entryArray5;
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap2.table;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) '4');
        int int11 = hashMap10.modCount;
        int int12 = hashMap10.size();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        boolean boolean14 = hashMap13.repOK();
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray16 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap15.table = entryArray16;
        hashMap13.table = entryArray16;
        hashMap10.table = entryArray16;
        boolean boolean20 = hashMap10.repOK();
        java.lang.Object obj21 = hashMap1.put((java.lang.Object) entryArray8, (java.lang.Object) boolean20);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        boolean boolean2 = hashMap1.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap1.table;
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap1.table;
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap1.table;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        boolean boolean7 = hashMap6.repOK();
        java.lang.Object obj8 = hashMap1.remove((java.lang.Object) hashMap6);
        boolean boolean9 = hashMap6.repOK();
        hashMap6.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap6", hashMap6.repOK_2());
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 10);
        int int2 = hashMap1.modCount;
        boolean boolean3 = hashMap1.repOK();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap(0);
        boolean boolean6 = hashMap5.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap5.table;
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap5.table;
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        boolean boolean10 = hashMap9.repOK();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap11.table = entryArray12;
        hashMap9.table = entryArray12;
        hashMap5.table = entryArray12;
        int int16 = hashMap5.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap5.table;
        java.lang.Object obj18 = hashMap1.get((java.lang.Object) hashMap5);
        hashMap5.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap5", hashMap5.repOK_2());
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean2 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean5 = hashMap4.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap4.table;
        boolean boolean7 = hashMap4.repOK();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) (short) 10);
        int int10 = hashMap9.modCount;
        int int11 = hashMap9.modCount;
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        boolean boolean13 = hashMap12.repOK();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray15 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap14.table = entryArray15;
        hashMap12.table = entryArray15;
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap12.table;
        java.lang.Object obj19 = hashMap9.get((java.lang.Object) hashMap12);
        java.lang.Object obj20 = hashMap1.put((java.lang.Object) boolean7, (java.lang.Object) hashMap9);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) '4', (float) (byte) 1);
        boolean boolean3 = hashMap2.repOK();
        boolean boolean4 = hashMap2.isEmpty();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        int int8 = hashMap7.size();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        boolean boolean10 = hashMap9.repOK();
        boolean boolean11 = hashMap9.isEmpty();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray15 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap14.table = entryArray15;
        hashMap13.table = entryArray15;
        java.lang.Object obj18 = hashMap9.get((java.lang.Object) hashMap13);
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap13.table;
        hashMap7.table = entryArray19;
        hashMap2.table = entryArray19;
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        int int8 = hashMap7.size();
        system.classfixer.classes.HashMap.Entry entry9 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray10 = new system.classfixer.classes.HashMap.Entry[] { entry9 };
        hashMap7.table = entryArray10;
        hashMap0.table = entryArray10;
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap(100, (float) 1L);
        java.lang.Object obj17 = hashMap0.put((java.lang.Object) hashMap15, (java.lang.Object) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) true);
        boolean boolean3 = hashMap0.isEmpty();
        hashMap0.modCount = (short) 0;
        boolean boolean6 = hashMap0.repOK();
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) '4');
        int int2 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.repOK();
        java.lang.Object obj6 = hashMap3.get((java.lang.Object) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap3.table;
        hashMap3.modCount = 0;
        java.lang.Object obj10 = hashMap1.remove((java.lang.Object) 0);
        int int11 = hashMap1.size();
        int int12 = hashMap1.size();
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap0.table;
        hashMap0.modCount = 0;
        boolean boolean7 = hashMap0.isEmpty();
        boolean boolean8 = hashMap0.isEmpty();
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        int int3 = hashMap2.size();
        int int4 = hashMap2.size();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        int int8 = hashMap7.size();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        boolean boolean10 = hashMap9.repOK();
        boolean boolean11 = hashMap9.isEmpty();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray15 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap14.table = entryArray15;
        hashMap13.table = entryArray15;
        java.lang.Object obj18 = hashMap9.get((java.lang.Object) hashMap13);
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap13.table;
        hashMap7.table = entryArray19;
        hashMap2.table = entryArray19;
        int int22 = hashMap2.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray23 = hashMap2.table;
        hashMap2.modCount = (byte) 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) 0);
        int int4 = hashMap0.size();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap8.table = entryArray9;
        hashMap7.table = entryArray9;
        hashMap0.table = entryArray9;
        boolean boolean13 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap0.table;
        int int15 = hashMap0.size();
        hashMap0.modCount = '4';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 1);
        boolean boolean2 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap5.table = entryArray6;
        hashMap4.table = entryArray6;
        hashMap1.table = entryArray6;
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap2.table = entryArray3;
        hashMap0.table = entryArray3;
        boolean boolean6 = hashMap0.repOK();
        int int7 = hashMap0.modCount;
        int int8 = hashMap0.modCount;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 10);
        int int2 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        java.lang.Object obj8 = hashMap1.remove((java.lang.Object) hashMap5);
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        java.lang.Object obj11 = hashMap9.remove((java.lang.Object) true);
        boolean boolean12 = hashMap9.isEmpty();
        int int13 = hashMap9.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap9.table;
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap((int) (short) 1, (float) '#');
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        boolean boolean19 = hashMap18.repOK();
        boolean boolean20 = hashMap18.isEmpty();
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray24 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap23.table = entryArray24;
        hashMap22.table = entryArray24;
        java.lang.Object obj27 = hashMap18.get((java.lang.Object) hashMap22);
        java.lang.Object obj28 = hashMap17.remove((java.lang.Object) hashMap22);
        system.classfixer.classes.HashMap.Entry[] entryArray29 = hashMap17.table;
        java.lang.Object obj30 = hashMap1.put((java.lang.Object) hashMap9, (java.lang.Object) hashMap17);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 1);
        hashMap1.modCount = (short) 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) true);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap(1);
        int int5 = hashMap4.modCount;
        java.lang.Object obj6 = hashMap0.remove((java.lang.Object) hashMap4);
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        boolean boolean2 = hashMap1.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap1.table;
        boolean boolean4 = hashMap1.isEmpty();
        boolean boolean5 = hashMap1.isEmpty();
        boolean boolean6 = hashMap1.repOK();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap(0);
        int int9 = hashMap8.size();
        int int10 = hashMap8.modCount;
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        int int14 = hashMap13.size();
        int int15 = hashMap13.size();
        boolean boolean16 = hashMap13.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap13.table;
        java.lang.Object obj18 = hashMap1.put((java.lang.Object) int10, (java.lang.Object) hashMap13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 1);
        hashMap1.modCount = (byte) 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int2 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap3.table;
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap3.table;
        java.lang.Object obj7 = hashMap1.get((java.lang.Object) hashMap3);
        int int8 = hashMap3.size();
        int int9 = hashMap3.modCount;
        int int10 = hashMap3.modCount;
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap(100);
        java.lang.Object obj17 = hashMap14.remove((java.lang.Object) hashMap16);
        java.lang.Class<?> wildcardClass18 = hashMap14.getClass();
        java.lang.Object obj19 = hashMap3.put((java.lang.Object) 10, (java.lang.Object) wildcardClass18);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap3", hashMap3.repOK_2());
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        int int3 = hashMap2.size();
        system.classfixer.classes.HashMap.Entry entry4 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray5 = new system.classfixer.classes.HashMap.Entry[] { entry4 };
        hashMap2.table = entryArray5;
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        java.lang.Object obj12 = hashMap9.remove(obj10);
        java.lang.Object obj13 = hashMap2.remove(obj12);
        boolean boolean14 = hashMap2.repOK();
        hashMap2.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) ' ');
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap1.table;
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        int int3 = hashMap2.modCount;
        int int4 = hashMap2.modCount;
        hashMap2.modCount = 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        int int2 = hashMap1.modCount;
        boolean boolean3 = hashMap1.repOK();
        boolean boolean4 = hashMap1.repOK();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        java.lang.Object obj7 = hashMap5.remove((java.lang.Object) true);
        boolean boolean8 = hashMap5.isEmpty();
        int int9 = hashMap5.size();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap5.table;
        hashMap1.table = entryArray10;
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(100, (float) 10L);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.repOK();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap5.table = entryArray6;
        hashMap3.table = entryArray6;
        boolean boolean9 = hashMap3.repOK();
        java.lang.Object obj10 = hashMap2.get((java.lang.Object) boolean9);
        boolean boolean11 = hashMap2.repOK();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap(100, (float) 1L);
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap((int) (short) 100);
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        boolean boolean18 = hashMap17.repOK();
        java.lang.Object obj20 = hashMap17.get((java.lang.Object) 0);
        int int21 = hashMap17.size();
        system.classfixer.classes.HashMap.Entry[] entryArray22 = hashMap17.table;
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray26 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap25.table = entryArray26;
        hashMap24.table = entryArray26;
        hashMap17.table = entryArray26;
        boolean boolean30 = hashMap17.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray31 = hashMap17.table;
        int int32 = hashMap17.size();
        int int33 = hashMap17.size();
        java.lang.Object obj34 = hashMap16.remove((java.lang.Object) hashMap17);
        java.lang.Object obj35 = hashMap2.put((java.lang.Object) 1L, (java.lang.Object) hashMap17);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(100);
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        boolean boolean3 = hashMap2.repOK();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap4.table = entryArray5;
        hashMap2.table = entryArray5;
        int int8 = hashMap2.modCount;
        java.lang.Class<?> wildcardClass9 = hashMap2.getClass();
        java.lang.Object obj10 = hashMap1.get((java.lang.Object) wildcardClass9);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        boolean boolean12 = hashMap11.repOK();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        boolean boolean14 = hashMap13.repOK();
        boolean boolean15 = hashMap13.isEmpty();
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray19 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap18.table = entryArray19;
        hashMap17.table = entryArray19;
        java.lang.Object obj22 = hashMap13.get((java.lang.Object) hashMap17);
        system.classfixer.classes.HashMap.Entry[] entryArray23 = hashMap17.table;
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap17.table;
        int int25 = hashMap17.size();
        java.lang.Class<?> wildcardClass26 = hashMap17.getClass();
        java.lang.Object obj27 = hashMap11.get((java.lang.Object) wildcardClass26);
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap((int) '4');
        system.classfixer.classes.HashMap.Entry[] entryArray30 = hashMap29.table;
        java.lang.Object obj31 = hashMap1.put(obj27, (java.lang.Object) entryArray30);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 10, (float) 10L);
        int int3 = hashMap2.size();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        boolean boolean5 = hashMap4.repOK();
        boolean boolean6 = hashMap4.isEmpty();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap9.table = entryArray10;
        hashMap8.table = entryArray10;
        java.lang.Object obj13 = hashMap4.get((java.lang.Object) hashMap8);
        int int14 = hashMap4.size();
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap((int) (short) 100, (float) 100L);
        java.lang.Object obj18 = hashMap2.put((java.lang.Object) hashMap4, (java.lang.Object) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        boolean boolean2 = hashMap1.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap1.table;
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap1.table;
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap1.table;
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap2.table = entryArray3;
        hashMap0.table = entryArray3;
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap0.table;
        hashMap0.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap5.table = entryArray6;
        hashMap4.table = entryArray6;
        java.lang.Object obj9 = hashMap0.get((java.lang.Object) hashMap4);
        int int10 = hashMap4.modCount;
        boolean boolean11 = hashMap4.repOK();
        hashMap4.modCount = 0;
        int int14 = hashMap4.modCount;
        hashMap4.modCount = (byte) 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap4", hashMap4.repOK_2());
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        boolean boolean2 = hashMap1.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap1.table;
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap1.table;
        int int5 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap(0);
        boolean boolean8 = hashMap7.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap7.table;
        hashMap1.table = entryArray9;
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        boolean boolean3 = hashMap2.repOK();
        boolean boolean4 = hashMap2.repOK();
        boolean boolean5 = hashMap2.repOK();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        java.lang.Object obj8 = hashMap6.remove((java.lang.Object) true);
        boolean boolean9 = hashMap6.isEmpty();
        hashMap6.modCount = (short) 0;
        boolean boolean12 = hashMap6.isEmpty();
        boolean boolean13 = hashMap6.repOK();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        boolean boolean15 = hashMap14.repOK();
        java.lang.Object obj17 = hashMap14.get((java.lang.Object) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap14.table;
        java.lang.Object obj19 = hashMap6.get((java.lang.Object) hashMap14);
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        boolean boolean21 = hashMap20.repOK();
        java.lang.Object obj23 = hashMap20.get((java.lang.Object) 0);
        int int24 = hashMap20.size();
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap((int) ' ');
        system.classfixer.classes.HashMap.Entry[] entryArray27 = hashMap26.table;
        hashMap20.table = entryArray27;
        java.lang.Object obj29 = hashMap2.put((java.lang.Object) hashMap14, (java.lang.Object) entryArray27);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 100);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap(10, (float) '#');
        java.lang.Object obj5 = hashMap1.remove((java.lang.Object) hashMap4);
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int8 = hashMap7.modCount;
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        boolean boolean10 = hashMap9.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap9.table;
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap9.table;
        java.lang.Object obj13 = hashMap7.get((java.lang.Object) hashMap9);
        java.lang.Object obj14 = hashMap1.get((java.lang.Object) hashMap7);
        hashMap7.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap7", hashMap7.repOK_2());
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) true);
        boolean boolean3 = hashMap0.isEmpty();
        hashMap0.modCount = (short) 0;
        boolean boolean6 = hashMap0.isEmpty();
        boolean boolean7 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.repOK();
        java.lang.Object obj11 = hashMap8.get((java.lang.Object) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap8.table;
        java.lang.Object obj13 = hashMap0.get((java.lang.Object) hashMap8);
        int int14 = hashMap8.size();
        hashMap8.modCount = (byte) 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap8", hashMap8.repOK_2());
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) '4', 1.0f);
        int int3 = hashMap2.size();
        int int4 = hashMap2.modCount;
        hashMap2.modCount = (short) 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int2 = hashMap1.modCount;
        boolean boolean3 = hashMap1.repOK();
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) true);
        boolean boolean3 = hashMap0.isEmpty();
        int int4 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap(0);
        boolean boolean7 = hashMap6.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap6.table;
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap6.table;
        java.lang.Object obj10 = hashMap0.remove((java.lang.Object) entryArray9);
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) (byte) 100);
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap(10, (float) '#');
        java.lang.Object obj16 = hashMap12.remove((java.lang.Object) hashMap15);
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        java.lang.Object obj19 = hashMap17.remove((java.lang.Object) true);
        boolean boolean20 = hashMap17.isEmpty();
        int int21 = hashMap17.size();
        system.classfixer.classes.HashMap.Entry[] entryArray22 = hashMap17.table;
        java.lang.Object obj23 = hashMap0.put((java.lang.Object) hashMap12, (java.lang.Object) hashMap17);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 1);
        boolean boolean2 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap5.table = entryArray6;
        hashMap4.table = entryArray6;
        hashMap1.table = entryArray6;
        boolean boolean10 = hashMap1.repOK();
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) '4', (float) (short) 1);
        hashMap2.modCount = (byte) 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 100);
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        boolean boolean3 = hashMap2.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap2.table;
        java.lang.Object obj5 = hashMap1.get((java.lang.Object) hashMap2);
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 100);
        java.lang.Object obj8 = hashMap1.get((java.lang.Object) hashMap7);
        int int9 = hashMap1.modCount;
        hashMap1.modCount = 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap5.table = entryArray6;
        hashMap4.table = entryArray6;
        java.lang.Object obj9 = hashMap0.get((java.lang.Object) hashMap4);
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap4.table;
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap4.table;
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap4.table;
        hashMap4.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap4", hashMap4.repOK_2());
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) 0);
        int int4 = hashMap0.size();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap8.table = entryArray9;
        hashMap7.table = entryArray9;
        hashMap0.table = entryArray9;
        boolean boolean13 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap0.table;
        int int15 = hashMap0.size();
        int int16 = hashMap0.size();
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap0.table;
        int int18 = hashMap0.size();
        hashMap0.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) '4');
        int int2 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.repOK();
        java.lang.Object obj6 = hashMap3.get((java.lang.Object) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap3.table;
        hashMap3.modCount = 0;
        java.lang.Object obj10 = hashMap1.remove((java.lang.Object) 0);
        int int11 = hashMap1.size();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap1.table;
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 0, (float) 'a');
        hashMap2.modCount = (byte) 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) true);
        boolean boolean3 = hashMap0.isEmpty();
        int int4 = hashMap0.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap0.table;
        hashMap0.modCount = (short) 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap3.remove((java.lang.Object) true);
        boolean boolean6 = hashMap3.isEmpty();
        hashMap3.modCount = (short) 0;
        boolean boolean9 = hashMap3.isEmpty();
        boolean boolean10 = hashMap3.repOK();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        boolean boolean12 = hashMap11.repOK();
        java.lang.Object obj14 = hashMap11.get((java.lang.Object) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap11.table;
        java.lang.Object obj16 = hashMap3.get((java.lang.Object) hashMap11);
        int int17 = hashMap11.size();
        java.lang.Object obj18 = hashMap0.get((java.lang.Object) hashMap11);
        hashMap0.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        int int2 = hashMap1.modCount;
        boolean boolean3 = hashMap1.repOK();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap(0);
        boolean boolean6 = hashMap5.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap5.table;
        hashMap1.table = entryArray7;
        hashMap1.modCount = 0;
        int int11 = hashMap1.modCount;
        hashMap1.modCount = (short) 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) true);
        boolean boolean3 = hashMap0.isEmpty();
        int int4 = hashMap0.size();
        boolean boolean5 = hashMap0.isEmpty();
        boolean boolean6 = hashMap0.repOK();
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) 0);
        boolean boolean4 = hashMap0.repOK();
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        int int3 = hashMap2.size();
        java.lang.Object obj5 = hashMap2.remove((java.lang.Object) 'a');
        int int6 = hashMap2.size();
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) true);
        boolean boolean3 = hashMap0.isEmpty();
        int int4 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        boolean boolean6 = hashMap5.repOK();
        boolean boolean7 = hashMap5.isEmpty();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray11 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap10.table = entryArray11;
        hashMap9.table = entryArray11;
        java.lang.Object obj14 = hashMap5.get((java.lang.Object) hashMap9);
        int int15 = hashMap9.modCount;
        boolean boolean16 = hashMap9.repOK();
        int int17 = hashMap9.modCount;
        java.lang.Class<?> wildcardClass18 = hashMap9.getClass();
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        boolean boolean20 = hashMap19.repOK();
        boolean boolean21 = hashMap19.isEmpty();
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray25 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap24.table = entryArray25;
        hashMap23.table = entryArray25;
        java.lang.Object obj28 = hashMap19.get((java.lang.Object) hashMap23);
        int int29 = hashMap19.size();
        boolean boolean30 = hashMap19.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray31 = hashMap19.table;
        boolean boolean32 = hashMap19.repOK();
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap();
        boolean boolean34 = hashMap33.repOK();
        boolean boolean35 = hashMap33.isEmpty();
        system.classfixer.classes.HashMap hashMap37 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap38 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray39 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap38.table = entryArray39;
        hashMap37.table = entryArray39;
        java.lang.Object obj42 = hashMap33.get((java.lang.Object) hashMap37);
        system.classfixer.classes.HashMap.Entry[] entryArray43 = hashMap37.table;
        hashMap19.table = entryArray43;
        system.classfixer.classes.HashMap.Entry[] entryArray45 = hashMap19.table;
        system.classfixer.classes.HashMap hashMap47 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap48 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray49 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap48.table = entryArray49;
        hashMap47.table = entryArray49;
        hashMap19.table = entryArray49;
        java.lang.Object obj53 = hashMap0.put((java.lang.Object) hashMap9, (java.lang.Object) entryArray49);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean2 = hashMap1.repOK();
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) true);
        boolean boolean3 = hashMap0.isEmpty();
        hashMap0.modCount = (short) 0;
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = hashMap0.remove(obj6);
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap0.table;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 100);
        java.lang.Object obj2 = null;
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.repOK();
        java.lang.Object obj6 = hashMap3.get((java.lang.Object) 0);
        int int7 = hashMap3.size();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap3.table;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap11.table = entryArray12;
        hashMap10.table = entryArray12;
        hashMap3.table = entryArray12;
        boolean boolean16 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap3.table;
        int int18 = hashMap3.size();
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap3.table;
        java.lang.Object obj20 = hashMap1.put(obj2, (java.lang.Object) hashMap3);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        int int2 = hashMap1.modCount;
        hashMap1.modCount = '#';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        boolean boolean2 = hashMap1.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap1.table;
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap1.table;
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap1.table;
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap1.table;
        int int7 = hashMap1.modCount;
        hashMap1.modCount = 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) '4');
        int int2 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.repOK();
        java.lang.Object obj6 = hashMap3.get((java.lang.Object) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap3.table;
        hashMap3.modCount = 0;
        java.lang.Object obj10 = hashMap1.remove((java.lang.Object) 0);
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap((int) '4', (float) (short) 1);
        java.lang.Object obj14 = hashMap1.remove((java.lang.Object) hashMap13);
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.isEmpty();
        int int3 = hashMap0.size();
        boolean boolean4 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap(100);
        java.lang.Object obj11 = hashMap8.remove((java.lang.Object) hashMap10);
        int int12 = hashMap8.size();
        boolean boolean13 = hashMap8.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap8.table;
        hashMap0.table = entryArray14;
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        int int19 = hashMap18.size();
        system.classfixer.classes.HashMap.Entry entry20 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray21 = new system.classfixer.classes.HashMap.Entry[] { entry20 };
        hashMap18.table = entryArray21;
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        java.lang.Object obj28 = hashMap25.remove(obj26);
        java.lang.Object obj29 = hashMap18.remove(obj28);
        int int30 = hashMap18.modCount;
        int int31 = hashMap18.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray32 = hashMap18.table;
        java.lang.Class<?> wildcardClass33 = hashMap18.getClass();
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap(0);
        boolean boolean36 = hashMap35.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray37 = hashMap35.table;
        system.classfixer.classes.HashMap.Entry[] entryArray38 = hashMap35.table;
        system.classfixer.classes.HashMap hashMap39 = new system.classfixer.classes.HashMap();
        boolean boolean40 = hashMap39.repOK();
        system.classfixer.classes.HashMap hashMap41 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray42 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap41.table = entryArray42;
        hashMap39.table = entryArray42;
        hashMap35.table = entryArray42;
        int int46 = hashMap35.modCount;
        java.lang.Object obj47 = hashMap0.put((java.lang.Object) wildcardClass33, (java.lang.Object) int46);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) '4');
        int int2 = hashMap1.modCount;
        int int3 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        boolean boolean5 = hashMap4.repOK();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray7 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap6.table = entryArray7;
        hashMap4.table = entryArray7;
        hashMap1.table = entryArray7;
        boolean boolean11 = hashMap1.repOK();
        hashMap1.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 10);
        int int2 = hashMap1.modCount;
        boolean boolean3 = hashMap1.repOK();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap(0);
        boolean boolean6 = hashMap5.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap5.table;
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap5.table;
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        boolean boolean10 = hashMap9.repOK();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap11.table = entryArray12;
        hashMap9.table = entryArray12;
        hashMap5.table = entryArray12;
        int int16 = hashMap5.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap5.table;
        java.lang.Object obj18 = hashMap1.get((java.lang.Object) hashMap5);
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap(0, (float) 10);
        int int22 = hashMap21.size();
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap((int) '4');
        system.classfixer.classes.HashMap.Entry[] entryArray25 = hashMap24.table;
        hashMap21.table = entryArray25;
        hashMap1.table = entryArray25;
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap((int) (byte) 100);
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap(10, (float) '#');
        java.lang.Object obj33 = hashMap29.remove((java.lang.Object) hashMap32);
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int36 = hashMap35.modCount;
        system.classfixer.classes.HashMap hashMap37 = new system.classfixer.classes.HashMap();
        boolean boolean38 = hashMap37.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray39 = hashMap37.table;
        system.classfixer.classes.HashMap.Entry[] entryArray40 = hashMap37.table;
        java.lang.Object obj41 = hashMap35.get((java.lang.Object) hashMap37);
        java.lang.Object obj42 = hashMap29.get((java.lang.Object) hashMap35);
        system.classfixer.classes.HashMap hashMap43 = new system.classfixer.classes.HashMap();
        boolean boolean44 = hashMap43.repOK();
        boolean boolean45 = hashMap43.isEmpty();
        system.classfixer.classes.HashMap hashMap46 = new system.classfixer.classes.HashMap();
        java.lang.Object obj48 = hashMap46.remove((java.lang.Object) true);
        boolean boolean49 = hashMap46.isEmpty();
        hashMap46.modCount = (short) 0;
        boolean boolean52 = hashMap46.isEmpty();
        boolean boolean53 = hashMap46.repOK();
        system.classfixer.classes.HashMap hashMap54 = new system.classfixer.classes.HashMap();
        boolean boolean55 = hashMap54.repOK();
        java.lang.Object obj57 = hashMap54.get((java.lang.Object) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray58 = hashMap54.table;
        java.lang.Object obj59 = hashMap46.get((java.lang.Object) hashMap54);
        int int60 = hashMap54.size();
        java.lang.Object obj61 = hashMap43.get((java.lang.Object) hashMap54);
        int int62 = hashMap54.modCount;
        system.classfixer.classes.HashMap hashMap63 = new system.classfixer.classes.HashMap();
        java.lang.Object obj65 = hashMap63.remove((java.lang.Object) true);
        int int66 = hashMap63.modCount;
        java.lang.Class<?> wildcardClass67 = hashMap63.getClass();
        java.lang.Object obj68 = hashMap54.get((java.lang.Object) hashMap63);
        java.lang.Object obj69 = hashMap1.put(obj42, (java.lang.Object) hashMap63);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) '4', (float) (byte) 1);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.repOK();
        boolean boolean5 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap8.table = entryArray9;
        hashMap7.table = entryArray9;
        java.lang.Object obj12 = hashMap3.get((java.lang.Object) hashMap7);
        int int13 = hashMap7.modCount;
        boolean boolean14 = hashMap7.repOK();
        java.lang.Class<?> wildcardClass15 = hashMap7.getClass();
        java.lang.Object obj16 = null;
        java.lang.Object obj17 = hashMap2.put((java.lang.Object) hashMap7, obj16);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(1);
        int int2 = hashMap1.modCount;
        hashMap1.modCount = 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int2 = hashMap1.modCount;
        hashMap1.modCount = ' ';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap0.table;
        hashMap0.modCount = 0;
        boolean boolean7 = hashMap0.isEmpty();
        hashMap0.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int2 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap3.table;
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap3.table;
        java.lang.Object obj7 = hashMap1.get((java.lang.Object) hashMap3);
        boolean boolean8 = hashMap1.isEmpty();
        boolean boolean9 = hashMap1.repOK();
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) true);
        int int3 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        boolean boolean5 = hashMap4.repOK();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        boolean boolean7 = hashMap6.repOK();
        boolean boolean8 = hashMap6.isEmpty();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap11.table = entryArray12;
        hashMap10.table = entryArray12;
        java.lang.Object obj15 = hashMap6.get((java.lang.Object) hashMap10);
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap10.table;
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap10.table;
        int int18 = hashMap10.size();
        java.lang.Class<?> wildcardClass19 = hashMap10.getClass();
        java.lang.Object obj20 = hashMap4.get((java.lang.Object) wildcardClass19);
        boolean boolean21 = hashMap4.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray22 = hashMap4.table;
        java.lang.Object obj23 = hashMap0.get((java.lang.Object) hashMap4);
        int int24 = hashMap4.modCount;
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap(100, (float) 10L);
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap();
        boolean boolean29 = hashMap28.repOK();
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray31 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap30.table = entryArray31;
        hashMap28.table = entryArray31;
        boolean boolean34 = hashMap28.repOK();
        java.lang.Object obj35 = hashMap27.get((java.lang.Object) boolean34);
        java.lang.Object obj37 = hashMap27.get((java.lang.Object) 10L);
        system.classfixer.classes.HashMap hashMap38 = new system.classfixer.classes.HashMap();
        java.lang.Object obj40 = hashMap38.remove((java.lang.Object) true);
        boolean boolean41 = hashMap38.isEmpty();
        hashMap38.modCount = (short) 0;
        boolean boolean44 = hashMap38.isEmpty();
        java.lang.Object obj45 = hashMap27.get((java.lang.Object) boolean44);
        system.classfixer.classes.HashMap hashMap46 = new system.classfixer.classes.HashMap();
        boolean boolean47 = hashMap46.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray48 = hashMap46.table;
        system.classfixer.classes.HashMap.Entry[] entryArray49 = hashMap46.table;
        java.lang.Object obj50 = hashMap27.get((java.lang.Object) hashMap46);
        system.classfixer.classes.HashMap.Entry[] entryArray51 = hashMap46.table;
        java.lang.Object obj52 = hashMap4.get((java.lang.Object) hashMap46);
        system.classfixer.classes.HashMap hashMap55 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        int int56 = hashMap55.size();
        system.classfixer.classes.HashMap.Entry entry57 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray58 = new system.classfixer.classes.HashMap.Entry[] { entry57 };
        hashMap55.table = entryArray58;
        system.classfixer.classes.HashMap hashMap62 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        java.lang.Object obj63 = new java.lang.Object();
        java.lang.Class<?> wildcardClass64 = obj63.getClass();
        java.lang.Object obj65 = hashMap62.remove(obj63);
        java.lang.Object obj66 = hashMap55.remove(obj65);
        int int67 = hashMap55.modCount;
        system.classfixer.classes.HashMap hashMap69 = new system.classfixer.classes.HashMap((int) ' ');
        system.classfixer.classes.HashMap hashMap71 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int72 = hashMap71.modCount;
        system.classfixer.classes.HashMap hashMap75 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        int int76 = hashMap75.size();
        system.classfixer.classes.HashMap.Entry entry77 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray78 = new system.classfixer.classes.HashMap.Entry[] { entry77 };
        hashMap75.table = entryArray78;
        hashMap71.table = entryArray78;
        hashMap69.table = entryArray78;
        hashMap55.table = entryArray78;
        system.classfixer.classes.HashMap hashMap83 = new system.classfixer.classes.HashMap();
        boolean boolean84 = hashMap83.repOK();
        boolean boolean85 = hashMap83.isEmpty();
        system.classfixer.classes.HashMap hashMap87 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap88 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray89 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap88.table = entryArray89;
        hashMap87.table = entryArray89;
        java.lang.Object obj92 = hashMap83.get((java.lang.Object) hashMap87);
        int int93 = hashMap87.modCount;
        boolean boolean94 = hashMap87.repOK();
        int int95 = hashMap87.modCount;
        java.lang.Class<?> wildcardClass96 = hashMap87.getClass();
        java.lang.Object obj97 = hashMap46.put((java.lang.Object) hashMap55, (java.lang.Object) wildcardClass96);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap46", hashMap46.repOK_2());
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) true);
        boolean boolean3 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int6 = hashMap5.modCount;
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        boolean boolean8 = hashMap7.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap7.table;
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap7.table;
        java.lang.Object obj11 = hashMap5.get((java.lang.Object) hashMap7);
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap5);
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) (short) 100);
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        boolean boolean16 = hashMap15.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap15.table;
        java.lang.Object obj18 = hashMap14.get((java.lang.Object) hashMap15);
        java.lang.Class<?> wildcardClass19 = hashMap14.getClass();
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        boolean boolean21 = hashMap20.repOK();
        java.lang.Object obj23 = hashMap20.get((java.lang.Object) 0);
        int int24 = hashMap20.size();
        system.classfixer.classes.HashMap.Entry[] entryArray25 = hashMap20.table;
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap();
        boolean boolean27 = hashMap26.repOK();
        java.lang.Object obj29 = hashMap26.get((java.lang.Object) 0);
        int int30 = hashMap26.size();
        system.classfixer.classes.HashMap.Entry[] entryArray31 = hashMap26.table;
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap34 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray35 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap34.table = entryArray35;
        hashMap33.table = entryArray35;
        hashMap26.table = entryArray35;
        boolean boolean39 = hashMap26.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray40 = hashMap26.table;
        hashMap20.table = entryArray40;
        system.classfixer.classes.HashMap hashMap42 = new system.classfixer.classes.HashMap();
        boolean boolean43 = hashMap42.repOK();
        java.lang.Object obj45 = hashMap42.get((java.lang.Object) 0);
        int int46 = hashMap42.size();
        system.classfixer.classes.HashMap.Entry[] entryArray47 = hashMap42.table;
        system.classfixer.classes.HashMap hashMap49 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap50 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray51 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap50.table = entryArray51;
        hashMap49.table = entryArray51;
        hashMap42.table = entryArray51;
        hashMap20.table = entryArray51;
        java.lang.Object obj56 = hashMap0.put((java.lang.Object) wildcardClass19, (java.lang.Object) entryArray51);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap((int) 'a');
        int int4 = hashMap3.modCount;
        boolean boolean5 = hashMap3.isEmpty();
        hashMap3.modCount = 0;
        java.lang.Object obj8 = hashMap1.get((java.lang.Object) 0);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap(0);
        int int11 = hashMap10.modCount;
        boolean boolean12 = hashMap10.repOK();
        java.lang.Class<?> wildcardClass13 = hashMap10.getClass();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        boolean boolean15 = hashMap14.repOK();
        java.lang.Object obj17 = hashMap14.get((java.lang.Object) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap14.table;
        hashMap14.modCount = 0;
        int int21 = hashMap14.modCount;
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        java.lang.Object obj24 = hashMap22.remove((java.lang.Object) true);
        boolean boolean25 = hashMap22.isEmpty();
        hashMap22.modCount = (short) 0;
        boolean boolean28 = hashMap22.isEmpty();
        boolean boolean29 = hashMap22.repOK();
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap((int) (short) 1, (float) '#');
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap();
        boolean boolean34 = hashMap33.repOK();
        boolean boolean35 = hashMap33.isEmpty();
        system.classfixer.classes.HashMap hashMap37 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap38 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray39 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap38.table = entryArray39;
        hashMap37.table = entryArray39;
        java.lang.Object obj42 = hashMap33.get((java.lang.Object) hashMap37);
        java.lang.Object obj43 = hashMap32.remove((java.lang.Object) hashMap37);
        java.lang.Object obj44 = hashMap22.remove((java.lang.Object) hashMap37);
        java.lang.Object obj45 = hashMap14.remove((java.lang.Object) hashMap37);
        boolean boolean46 = hashMap37.repOK();
        java.lang.Object obj47 = hashMap1.put((java.lang.Object) hashMap10, (java.lang.Object) hashMap37);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }
}

