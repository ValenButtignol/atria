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
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        boolean boolean3 = hashMap0.isEmpty();
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = hashMap0.remove(obj3);
        java.lang.Object obj7 = hashMap0.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        java.lang.Object obj4 = hashMap0.get((java.lang.Object) 10.0d);
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) ' ', (float) '#');
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.size();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap3.table;
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) (-1), (java.lang.Object) entryArray5);
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) ' ', (float) '#');
        java.lang.Object obj6 = hashMap2.get((java.lang.Object) hashMap5);
        hashMap2.modCount = 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) ' ', (float) '#');
        java.lang.Object obj6 = hashMap2.get((java.lang.Object) hashMap5);
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.modCount = (short) 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray2 = hashMap0.table;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 0, (float) (byte) 100);
        hashMap2.modCount = 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = hashMap0.remove(obj3);
        java.lang.Object obj7 = hashMap0.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        int int8 = hashMap0.size();
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(1);
        int int2 = hashMap1.size();
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        int int5 = hashMap3.size();
        java.lang.Object obj7 = hashMap3.get((java.lang.Object) 100L);
        system.testclass.HashMap.Entry[] entryArray8 = hashMap3.table;
        hashMap1.table = entryArray8;
        hashMap1.modCount = (byte) 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (short) 100);
        hashMap2.modCount = 10;
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
        hashMap0.clear();
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
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        boolean boolean3 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap.Entry[] entryArray7 = new system.testclass.HashMap.Entry[] {};
        hashMap6.table = entryArray7;
        java.lang.Object obj9 = hashMap0.remove((java.lang.Object) hashMap6);
        hashMap6.clear();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray12 = hashMap11.table;
        hashMap6.table = entryArray12;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap6", hashMap6.repOK_1());
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 0, (float) (byte) 100);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray4 = hashMap3.table;
        hashMap2.table = entryArray4;
        hashMap2.modCount = '#';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        hashMap1.modCount = '4';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        java.lang.Object obj4 = hashMap0.get((java.lang.Object) 100L);
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        boolean boolean3 = hashMap0.isEmpty();
        hashMap0.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        int int2 = hashMap1.modCount;
        hashMap1.modCount = (byte) -1;
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
        int int3 = hashMap0.size();
        hashMap0.modCount = 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) ' ', (float) '#');
        java.lang.Object obj6 = hashMap2.get((java.lang.Object) hashMap5);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap((int) '#', (float) 'a');
        java.lang.Object obj11 = hashMap5.put((java.lang.Object) hashMap9, (java.lang.Object) (-1.0f));
        hashMap9.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap9", hashMap9.repOK_1());
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        boolean boolean3 = hashMap2.isEmpty();
        hashMap2.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        int int3 = hashMap0.modCount;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = hashMap0.remove(obj3);
        java.lang.Object obj7 = hashMap0.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap(0, (float) (short) 100);
        java.lang.Object obj12 = hashMap0.put((java.lang.Object) 0, (java.lang.Object) 1.0d);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) ' ', (float) '#');
        java.lang.Object obj4 = hashMap2.get((java.lang.Object) (-1L));
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = hashMap0.remove(obj3);
        int int5 = hashMap0.size();
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) ' ', (float) '#');
        java.lang.Object obj6 = hashMap2.get((java.lang.Object) hashMap5);
        hashMap5.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap5", hashMap5.repOK_1());
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray2 = hashMap0.table;
        int int3 = hashMap0.modCount;
        hashMap0.modCount = (byte) 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = hashMap0.remove(obj3);
        java.lang.Object obj7 = hashMap0.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        int int8 = hashMap0.modCount;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap((int) '#', (float) 'a');
        java.lang.Object obj12 = hashMap0.get((java.lang.Object) '#');
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap.Entry[] entryArray6 = new system.testclass.HashMap.Entry[] {};
        hashMap5.table = entryArray6;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        hashMap8.modCount = 0;
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = hashMap8.remove(obj11);
        boolean boolean13 = hashMap8.isEmpty();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap((int) (byte) 0);
        int int16 = hashMap15.modCount;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap(1);
        int int19 = hashMap18.size();
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        int int21 = hashMap20.modCount;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        int int24 = hashMap23.size();
        system.testclass.HashMap.Entry[] entryArray25 = hashMap23.table;
        java.lang.Object obj26 = hashMap20.put((java.lang.Object) (-1), (java.lang.Object) entryArray25);
        hashMap18.table = entryArray25;
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        int int32 = hashMap31.size();
        system.testclass.HashMap.Entry[] entryArray33 = hashMap31.table;
        hashMap30.table = entryArray33;
        java.lang.Object obj35 = hashMap15.put((java.lang.Object) entryArray25, (java.lang.Object) entryArray33);
        hashMap8.table = entryArray25;
        java.lang.Object obj37 = hashMap2.put((java.lang.Object) entryArray6, (java.lang.Object) entryArray25);
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap((int) ' ', (float) '#');
        java.lang.Object obj44 = hashMap40.get((java.lang.Object) hashMap43);
        java.lang.Object obj46 = hashMap2.put((java.lang.Object) hashMap40, (java.lang.Object) 10.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap.Entry[] entryArray6 = new system.testclass.HashMap.Entry[] {};
        hashMap5.table = entryArray6;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        hashMap8.modCount = 0;
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = hashMap8.remove(obj11);
        boolean boolean13 = hashMap8.isEmpty();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap((int) (byte) 0);
        int int16 = hashMap15.modCount;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap(1);
        int int19 = hashMap18.size();
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        int int21 = hashMap20.modCount;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        int int24 = hashMap23.size();
        system.testclass.HashMap.Entry[] entryArray25 = hashMap23.table;
        java.lang.Object obj26 = hashMap20.put((java.lang.Object) (-1), (java.lang.Object) entryArray25);
        hashMap18.table = entryArray25;
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        int int32 = hashMap31.size();
        system.testclass.HashMap.Entry[] entryArray33 = hashMap31.table;
        hashMap30.table = entryArray33;
        java.lang.Object obj35 = hashMap15.put((java.lang.Object) entryArray25, (java.lang.Object) entryArray33);
        hashMap8.table = entryArray25;
        java.lang.Object obj37 = hashMap2.put((java.lang.Object) entryArray6, (java.lang.Object) entryArray25);
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap((int) ' ', (float) '#');
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap((int) '#', (float) '#');
        int int44 = hashMap43.size();
        java.lang.Object obj45 = hashMap2.put((java.lang.Object) '#', (java.lang.Object) hashMap43);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        system.testclass.HashMap.Entry[] entryArray3 = hashMap2.table;
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.size();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap3.table;
        hashMap2.table = entryArray5;
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        boolean boolean3 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap.Entry[] entryArray7 = new system.testclass.HashMap.Entry[] {};
        hashMap6.table = entryArray7;
        java.lang.Object obj9 = hashMap0.remove((java.lang.Object) hashMap6);
        boolean boolean10 = hashMap6.isEmpty();
        hashMap6.modCount = '#';
        int int13 = hashMap6.modCount;
        int int14 = hashMap6.size();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.size();
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap.Entry[] entryArray20 = new system.testclass.HashMap.Entry[] {};
        hashMap19.table = entryArray20;
        hashMap15.table = entryArray20;
        hashMap6.table = entryArray20;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        boolean boolean25 = hashMap24.isEmpty();
        int int26 = hashMap24.size();
        java.lang.Object obj28 = hashMap24.get((java.lang.Object) 100L);
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        boolean boolean30 = hashMap29.isEmpty();
        int int31 = hashMap29.size();
        boolean boolean32 = hashMap29.isEmpty();
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap.Entry[] entryArray36 = new system.testclass.HashMap.Entry[] {};
        hashMap35.table = entryArray36;
        java.lang.Object obj38 = hashMap29.remove((java.lang.Object) hashMap35);
        boolean boolean39 = hashMap35.isEmpty();
        boolean boolean40 = hashMap35.isEmpty();
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        int int42 = hashMap41.modCount;
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap();
        int int45 = hashMap44.size();
        system.testclass.HashMap.Entry[] entryArray46 = hashMap44.table;
        java.lang.Object obj47 = hashMap41.put((java.lang.Object) (-1), (java.lang.Object) entryArray46);
        hashMap35.table = entryArray46;
        hashMap24.table = entryArray46;
        hashMap6.table = entryArray46;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap6", hashMap6.repOK_1());
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (short) 100);
        boolean boolean3 = hashMap2.isEmpty();
        hashMap2.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        system.testclass.HashMap.Entry[] entryArray3 = hashMap2.table;
        hashMap2.modCount = 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = (short) 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray2 = hashMap0.table;
        int int3 = hashMap0.modCount;
        int int4 = hashMap0.size();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray6 = hashMap5.table;
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) hashMap5);
        hashMap0.modCount = 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(1);
        system.testclass.HashMap.Entry[] entryArray2 = hashMap1.table;
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = hashMap1.get(obj3);
        int int5 = hashMap1.size();
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(1);
        int int2 = hashMap1.size();
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.size();
        system.testclass.HashMap.Entry[] entryArray8 = hashMap6.table;
        java.lang.Object obj9 = hashMap3.put((java.lang.Object) (-1), (java.lang.Object) entryArray8);
        hashMap1.table = entryArray8;
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        boolean boolean3 = hashMap0.isEmpty();
        hashMap0.modCount = 10;
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
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap.Entry[] entryArray7 = new system.testclass.HashMap.Entry[] {};
        hashMap6.table = entryArray7;
        java.lang.Object obj9 = hashMap0.remove((java.lang.Object) hashMap6);
        int int10 = hashMap0.size();
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        java.lang.Object obj4 = hashMap0.get((java.lang.Object) 100L);
        int int5 = hashMap0.modCount;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        int int8 = hashMap6.size();
        java.lang.Object obj10 = hashMap6.get((java.lang.Object) 100L);
        system.testclass.HashMap.Entry[] entryArray11 = hashMap6.table;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        boolean boolean13 = hashMap12.isEmpty();
        int int14 = hashMap12.size();
        boolean boolean15 = hashMap12.isEmpty();
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap.Entry[] entryArray19 = new system.testclass.HashMap.Entry[] {};
        hashMap18.table = entryArray19;
        java.lang.Object obj21 = hashMap12.remove((java.lang.Object) hashMap18);
        boolean boolean22 = hashMap18.isEmpty();
        boolean boolean23 = hashMap18.isEmpty();
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.modCount;
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        int int28 = hashMap27.size();
        system.testclass.HashMap.Entry[] entryArray29 = hashMap27.table;
        java.lang.Object obj30 = hashMap24.put((java.lang.Object) (-1), (java.lang.Object) entryArray29);
        hashMap18.table = entryArray29;
        hashMap6.table = entryArray29;
        hashMap0.table = entryArray29;
        hashMap0.modCount = 'a';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int3 = hashMap2.modCount;
        hashMap2.modCount = (byte) 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        java.lang.Object obj4 = hashMap0.get((java.lang.Object) 100L);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        boolean boolean8 = hashMap7.isEmpty();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        java.lang.Object obj11 = hashMap9.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj13 = hashMap7.put((java.lang.Object) hashMap9, (java.lang.Object) 0.0f);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.size();
        system.testclass.HashMap.Entry[] entryArray16 = hashMap14.table;
        java.lang.Object obj17 = hashMap9.get((java.lang.Object) entryArray16);
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap.Entry[] entryArray21 = new system.testclass.HashMap.Entry[] {};
        hashMap20.table = entryArray21;
        hashMap20.modCount = 35;
        java.lang.Object obj25 = hashMap0.put((java.lang.Object) hashMap9, (java.lang.Object) 35);
        hashMap0.modCount = (byte) 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = hashMap0.remove(obj3);
        java.lang.Object obj7 = hashMap0.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) ' ', (float) '#');
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.size();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap.Entry[] entryArray16 = new system.testclass.HashMap.Entry[] {};
        hashMap15.table = entryArray16;
        hashMap11.table = entryArray16;
        hashMap10.table = entryArray16;
        int int20 = hashMap10.modCount;
        system.testclass.HashMap.Entry[] entryArray21 = hashMap10.table;
        hashMap0.table = entryArray21;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = hashMap0.remove(obj3);
        java.lang.Object obj7 = hashMap0.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        int int8 = hashMap0.modCount;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap((int) '#', (float) 'a');
        java.lang.Object obj12 = hashMap0.get((java.lang.Object) '#');
        int int13 = hashMap0.modCount;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        java.lang.Object obj4 = hashMap0.get((java.lang.Object) 100L);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        boolean boolean8 = hashMap7.isEmpty();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        java.lang.Object obj11 = hashMap9.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj13 = hashMap7.put((java.lang.Object) hashMap9, (java.lang.Object) 0.0f);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.size();
        system.testclass.HashMap.Entry[] entryArray16 = hashMap14.table;
        java.lang.Object obj17 = hashMap9.get((java.lang.Object) entryArray16);
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap.Entry[] entryArray21 = new system.testclass.HashMap.Entry[] {};
        hashMap20.table = entryArray21;
        hashMap20.modCount = 35;
        java.lang.Object obj25 = hashMap0.put((java.lang.Object) hashMap9, (java.lang.Object) 35);
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        java.lang.Object obj4 = hashMap0.get((java.lang.Object) 100L);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.size();
        system.testclass.HashMap.Entry[] entryArray10 = hashMap8.table;
        java.lang.Object obj11 = hashMap5.put((java.lang.Object) (-1), (java.lang.Object) entryArray10);
        java.lang.Object obj12 = hashMap0.remove(obj11);
        hashMap0.modCount = (byte) 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        java.lang.Object obj4 = hashMap0.get((java.lang.Object) 10.0d);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.size();
        system.testclass.HashMap.Entry[] entryArray7 = hashMap5.table;
        hashMap0.table = entryArray7;
        hashMap0.modCount = (short) 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(1);
        system.testclass.HashMap.Entry[] entryArray2 = hashMap1.table;
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) ' ', (float) '#');
        java.lang.Object obj6 = hashMap2.get((java.lang.Object) hashMap5);
        hashMap5.modCount = 35;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap5", hashMap5.repOK_1());
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap.Entry[] entryArray6 = new system.testclass.HashMap.Entry[] {};
        hashMap5.table = entryArray6;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        hashMap8.modCount = 0;
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = hashMap8.remove(obj11);
        boolean boolean13 = hashMap8.isEmpty();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap((int) (byte) 0);
        int int16 = hashMap15.modCount;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap(1);
        int int19 = hashMap18.size();
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        int int21 = hashMap20.modCount;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        int int24 = hashMap23.size();
        system.testclass.HashMap.Entry[] entryArray25 = hashMap23.table;
        java.lang.Object obj26 = hashMap20.put((java.lang.Object) (-1), (java.lang.Object) entryArray25);
        hashMap18.table = entryArray25;
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        int int32 = hashMap31.size();
        system.testclass.HashMap.Entry[] entryArray33 = hashMap31.table;
        hashMap30.table = entryArray33;
        java.lang.Object obj35 = hashMap15.put((java.lang.Object) entryArray25, (java.lang.Object) entryArray33);
        hashMap8.table = entryArray25;
        java.lang.Object obj37 = hashMap2.put((java.lang.Object) entryArray6, (java.lang.Object) entryArray25);
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap((int) (byte) 0);
        int int40 = hashMap39.modCount;
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap(1);
        int int43 = hashMap42.size();
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap();
        int int45 = hashMap44.modCount;
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap();
        int int48 = hashMap47.size();
        system.testclass.HashMap.Entry[] entryArray49 = hashMap47.table;
        java.lang.Object obj50 = hashMap44.put((java.lang.Object) (-1), (java.lang.Object) entryArray49);
        hashMap42.table = entryArray49;
        system.testclass.HashMap hashMap54 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        system.testclass.HashMap hashMap55 = new system.testclass.HashMap();
        int int56 = hashMap55.size();
        system.testclass.HashMap.Entry[] entryArray57 = hashMap55.table;
        hashMap54.table = entryArray57;
        java.lang.Object obj59 = hashMap39.put((java.lang.Object) entryArray49, (java.lang.Object) entryArray57);
        system.testclass.HashMap hashMap60 = new system.testclass.HashMap();
        int int61 = hashMap60.size();
        system.testclass.HashMap.Entry[] entryArray62 = hashMap60.table;
        system.testclass.HashMap hashMap65 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap68 = new system.testclass.HashMap((int) ' ', (float) '#');
        java.lang.Object obj69 = hashMap65.get((java.lang.Object) hashMap68);
        system.testclass.HashMap hashMap72 = new system.testclass.HashMap((int) '#', (float) 'a');
        java.lang.Object obj74 = hashMap68.put((java.lang.Object) hashMap72, (java.lang.Object) (-1.0f));
        system.testclass.HashMap hashMap77 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap.Entry[] entryArray78 = hashMap77.table;
        java.lang.Object obj79 = hashMap68.get((java.lang.Object) entryArray78);
        hashMap60.table = entryArray78;
        java.lang.Object obj81 = hashMap2.put((java.lang.Object) entryArray57, (java.lang.Object) hashMap60);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 100L);
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = hashMap0.remove(obj3);
        java.lang.Object obj7 = hashMap0.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        int int8 = hashMap0.modCount;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap((int) '#', (float) 'a');
        java.lang.Object obj12 = hashMap0.get((java.lang.Object) '#');
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        boolean boolean14 = hashMap13.isEmpty();
        int int15 = hashMap13.size();
        boolean boolean16 = hashMap13.isEmpty();
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap.Entry[] entryArray20 = new system.testclass.HashMap.Entry[] {};
        hashMap19.table = entryArray20;
        java.lang.Object obj22 = hashMap13.remove((java.lang.Object) hashMap19);
        boolean boolean23 = hashMap19.isEmpty();
        java.lang.Object obj24 = hashMap0.get((java.lang.Object) boolean23);
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 0, (float) (byte) 100);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray4 = hashMap3.table;
        hashMap2.table = entryArray4;
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 0, (float) 10);
        hashMap2.modCount = (short) 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) (byte) 10);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        int int5 = hashMap3.size();
        java.lang.Object obj7 = hashMap3.get((java.lang.Object) 100L);
        system.testclass.HashMap.Entry[] entryArray8 = hashMap3.table;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        int int11 = hashMap9.size();
        boolean boolean12 = hashMap9.isEmpty();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap.Entry[] entryArray16 = new system.testclass.HashMap.Entry[] {};
        hashMap15.table = entryArray16;
        java.lang.Object obj18 = hashMap9.remove((java.lang.Object) hashMap15);
        boolean boolean19 = hashMap15.isEmpty();
        boolean boolean20 = hashMap15.isEmpty();
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        int int22 = hashMap21.modCount;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.size();
        system.testclass.HashMap.Entry[] entryArray26 = hashMap24.table;
        java.lang.Object obj27 = hashMap21.put((java.lang.Object) (-1), (java.lang.Object) entryArray26);
        hashMap15.table = entryArray26;
        hashMap3.table = entryArray26;
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap((int) (short) 10);
        int int32 = hashMap31.size();
        java.lang.Object obj33 = hashMap3.remove((java.lang.Object) int32);
        java.lang.Object obj34 = hashMap0.get((java.lang.Object) int32);
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        int int36 = hashMap35.size();
        system.testclass.HashMap.Entry[] entryArray37 = hashMap35.table;
        java.lang.Class<?> wildcardClass38 = hashMap35.getClass();
        java.lang.Object obj39 = hashMap0.get((java.lang.Object) wildcardClass38);
        system.testclass.HashMap.Entry[] entryArray40 = hashMap0.table;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap.Entry[] entryArray6 = new system.testclass.HashMap.Entry[] {};
        hashMap5.table = entryArray6;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        hashMap8.modCount = 0;
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = hashMap8.remove(obj11);
        boolean boolean13 = hashMap8.isEmpty();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap((int) (byte) 0);
        int int16 = hashMap15.modCount;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap(1);
        int int19 = hashMap18.size();
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        int int21 = hashMap20.modCount;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        int int24 = hashMap23.size();
        system.testclass.HashMap.Entry[] entryArray25 = hashMap23.table;
        java.lang.Object obj26 = hashMap20.put((java.lang.Object) (-1), (java.lang.Object) entryArray25);
        hashMap18.table = entryArray25;
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        int int32 = hashMap31.size();
        system.testclass.HashMap.Entry[] entryArray33 = hashMap31.table;
        hashMap30.table = entryArray33;
        java.lang.Object obj35 = hashMap15.put((java.lang.Object) entryArray25, (java.lang.Object) entryArray33);
        hashMap8.table = entryArray25;
        java.lang.Object obj37 = hashMap2.put((java.lang.Object) entryArray6, (java.lang.Object) entryArray25);
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        int int39 = hashMap38.modCount;
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        int int42 = hashMap41.size();
        system.testclass.HashMap.Entry[] entryArray43 = hashMap41.table;
        java.lang.Object obj44 = hashMap38.put((java.lang.Object) (-1), (java.lang.Object) entryArray43);
        system.testclass.HashMap hashMap46 = new system.testclass.HashMap((int) (byte) 1);
        int int47 = hashMap46.size();
        system.testclass.HashMap hashMap49 = new system.testclass.HashMap(1);
        system.testclass.HashMap.Entry[] entryArray50 = hashMap49.table;
        system.testclass.HashMap.Entry[] entryArray51 = hashMap49.table;
        java.lang.Object obj52 = hashMap46.remove((java.lang.Object) hashMap49);
        java.lang.Object obj53 = hashMap2.put((java.lang.Object) entryArray43, (java.lang.Object) hashMap49);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(1);
        system.testclass.HashMap.Entry[] entryArray2 = hashMap1.table;
        hashMap1.modCount = (byte) 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        int int2 = hashMap1.modCount;
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        java.lang.Object obj4 = hashMap0.get((java.lang.Object) 100L);
        int int5 = hashMap0.modCount;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        int int8 = hashMap6.size();
        java.lang.Object obj10 = hashMap6.get((java.lang.Object) 100L);
        system.testclass.HashMap.Entry[] entryArray11 = hashMap6.table;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        boolean boolean13 = hashMap12.isEmpty();
        int int14 = hashMap12.size();
        boolean boolean15 = hashMap12.isEmpty();
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap.Entry[] entryArray19 = new system.testclass.HashMap.Entry[] {};
        hashMap18.table = entryArray19;
        java.lang.Object obj21 = hashMap12.remove((java.lang.Object) hashMap18);
        boolean boolean22 = hashMap18.isEmpty();
        boolean boolean23 = hashMap18.isEmpty();
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.modCount;
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        int int28 = hashMap27.size();
        system.testclass.HashMap.Entry[] entryArray29 = hashMap27.table;
        java.lang.Object obj30 = hashMap24.put((java.lang.Object) (-1), (java.lang.Object) entryArray29);
        hashMap18.table = entryArray29;
        hashMap6.table = entryArray29;
        hashMap0.table = entryArray29;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        hashMap0.modCount = (short) 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray2 = hashMap0.table;
        int int3 = hashMap0.modCount;
        hashMap0.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) ' ', (float) '#');
        java.lang.Object obj6 = hashMap2.get((java.lang.Object) hashMap5);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        int int9 = hashMap7.size();
        boolean boolean10 = hashMap7.isEmpty();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap((int) (short) 10);
        java.lang.Object obj13 = hashMap7.remove((java.lang.Object) hashMap12);
        java.lang.Object obj14 = hashMap5.get((java.lang.Object) hashMap7);
        int int15 = hashMap7.size();
        hashMap7.modCount = '4';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap7", hashMap7.repOK_1());
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        boolean boolean3 = hashMap2.isEmpty();
        int int4 = hashMap2.size();
        java.lang.Object obj6 = hashMap2.get((java.lang.Object) 100L);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        int int9 = hashMap7.size();
        boolean boolean10 = hashMap7.isEmpty();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap.Entry[] entryArray14 = new system.testclass.HashMap.Entry[] {};
        hashMap13.table = entryArray14;
        java.lang.Object obj16 = hashMap7.remove((java.lang.Object) hashMap13);
        boolean boolean17 = hashMap13.isEmpty();
        boolean boolean18 = hashMap13.isEmpty();
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        int int20 = hashMap19.modCount;
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        int int23 = hashMap22.size();
        system.testclass.HashMap.Entry[] entryArray24 = hashMap22.table;
        java.lang.Object obj25 = hashMap19.put((java.lang.Object) (-1), (java.lang.Object) entryArray24);
        hashMap13.table = entryArray24;
        hashMap2.table = entryArray24;
        java.lang.Object obj28 = hashMap1.get((java.lang.Object) hashMap2);
        hashMap1.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = hashMap0.remove(obj3);
        java.lang.Object obj7 = hashMap0.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.size();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap.Entry[] entryArray13 = new system.testclass.HashMap.Entry[] {};
        hashMap12.table = entryArray13;
        hashMap8.table = entryArray13;
        java.lang.Object obj16 = hashMap0.get((java.lang.Object) hashMap8);
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.modCount = 0;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        boolean boolean6 = hashMap5.isEmpty();
        int int7 = hashMap5.size();
        java.lang.Object obj9 = hashMap5.get((java.lang.Object) 100L);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        int int12 = hashMap10.size();
        boolean boolean13 = hashMap10.isEmpty();
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap.Entry[] entryArray17 = new system.testclass.HashMap.Entry[] {};
        hashMap16.table = entryArray17;
        java.lang.Object obj19 = hashMap10.remove((java.lang.Object) hashMap16);
        boolean boolean20 = hashMap16.isEmpty();
        boolean boolean21 = hashMap16.isEmpty();
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        int int23 = hashMap22.modCount;
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        int int26 = hashMap25.size();
        system.testclass.HashMap.Entry[] entryArray27 = hashMap25.table;
        java.lang.Object obj28 = hashMap22.put((java.lang.Object) (-1), (java.lang.Object) entryArray27);
        hashMap16.table = entryArray27;
        hashMap5.table = entryArray27;
        int int31 = hashMap5.modCount;
        java.lang.Object obj32 = hashMap0.get((java.lang.Object) int31);
        hashMap0.modCount = 35;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 0, (float) (byte) 100);
        int int3 = hashMap2.modCount;
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(1);
        system.testclass.HashMap.Entry[] entryArray2 = hashMap1.table;
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = hashMap1.get(obj3);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.size();
        java.lang.Object obj7 = hashMap1.get((java.lang.Object) int6);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        int int10 = hashMap8.size();
        int int11 = hashMap8.size();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        hashMap12.modCount = 0;
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = hashMap12.remove(obj15);
        java.lang.Object obj19 = hashMap12.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        int int21 = hashMap20.size();
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap.Entry[] entryArray25 = new system.testclass.HashMap.Entry[] {};
        hashMap24.table = entryArray25;
        hashMap20.table = entryArray25;
        java.lang.Object obj28 = hashMap12.get((java.lang.Object) hashMap20);
        int int29 = hashMap20.size();
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        hashMap30.modCount = 0;
        java.lang.Object obj33 = null;
        java.lang.Object obj34 = hashMap30.remove(obj33);
        java.lang.Object obj37 = hashMap30.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        int int39 = hashMap38.size();
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap.Entry[] entryArray43 = new system.testclass.HashMap.Entry[] {};
        hashMap42.table = entryArray43;
        hashMap38.table = entryArray43;
        java.lang.Object obj46 = hashMap30.get((java.lang.Object) hashMap38);
        java.lang.Object obj47 = hashMap8.put((java.lang.Object) int29, (java.lang.Object) hashMap38);
        system.testclass.HashMap.Entry[] entryArray48 = hashMap38.table;
        system.testclass.HashMap hashMap49 = new system.testclass.HashMap();
        boolean boolean50 = hashMap49.isEmpty();
        int int51 = hashMap49.size();
        boolean boolean52 = hashMap49.isEmpty();
        system.testclass.HashMap hashMap55 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap.Entry[] entryArray56 = new system.testclass.HashMap.Entry[] {};
        hashMap55.table = entryArray56;
        java.lang.Object obj58 = hashMap49.remove((java.lang.Object) hashMap55);
        boolean boolean59 = hashMap55.isEmpty();
        java.lang.Object obj60 = hashMap1.put((java.lang.Object) hashMap38, (java.lang.Object) boolean59);
        hashMap38.clear();
        system.testclass.HashMap hashMap62 = new system.testclass.HashMap();
        boolean boolean63 = hashMap62.isEmpty();
        int int64 = hashMap62.size();
        java.lang.Object obj66 = hashMap62.get((java.lang.Object) 100L);
        system.testclass.HashMap hashMap67 = new system.testclass.HashMap();
        boolean boolean68 = hashMap67.isEmpty();
        int int69 = hashMap67.size();
        boolean boolean70 = hashMap67.isEmpty();
        system.testclass.HashMap hashMap73 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap.Entry[] entryArray74 = new system.testclass.HashMap.Entry[] {};
        hashMap73.table = entryArray74;
        java.lang.Object obj76 = hashMap67.remove((java.lang.Object) hashMap73);
        boolean boolean77 = hashMap73.isEmpty();
        boolean boolean78 = hashMap73.isEmpty();
        system.testclass.HashMap hashMap79 = new system.testclass.HashMap();
        int int80 = hashMap79.modCount;
        system.testclass.HashMap hashMap82 = new system.testclass.HashMap();
        int int83 = hashMap82.size();
        system.testclass.HashMap.Entry[] entryArray84 = hashMap82.table;
        java.lang.Object obj85 = hashMap79.put((java.lang.Object) (-1), (java.lang.Object) entryArray84);
        hashMap73.table = entryArray84;
        hashMap62.table = entryArray84;
        hashMap38.table = entryArray84;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap38", hashMap38.repOK_1());
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) (byte) 10);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        int int5 = hashMap3.size();
        java.lang.Object obj7 = hashMap3.get((java.lang.Object) 100L);
        system.testclass.HashMap.Entry[] entryArray8 = hashMap3.table;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        int int11 = hashMap9.size();
        boolean boolean12 = hashMap9.isEmpty();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap.Entry[] entryArray16 = new system.testclass.HashMap.Entry[] {};
        hashMap15.table = entryArray16;
        java.lang.Object obj18 = hashMap9.remove((java.lang.Object) hashMap15);
        boolean boolean19 = hashMap15.isEmpty();
        boolean boolean20 = hashMap15.isEmpty();
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        int int22 = hashMap21.modCount;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.size();
        system.testclass.HashMap.Entry[] entryArray26 = hashMap24.table;
        java.lang.Object obj27 = hashMap21.put((java.lang.Object) (-1), (java.lang.Object) entryArray26);
        hashMap15.table = entryArray26;
        hashMap3.table = entryArray26;
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap((int) (short) 10);
        int int32 = hashMap31.size();
        java.lang.Object obj33 = hashMap3.remove((java.lang.Object) int32);
        java.lang.Object obj34 = hashMap0.get((java.lang.Object) int32);
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        int int36 = hashMap35.size();
        system.testclass.HashMap.Entry[] entryArray37 = hashMap35.table;
        java.lang.Class<?> wildcardClass38 = hashMap35.getClass();
        java.lang.Object obj39 = hashMap0.get((java.lang.Object) wildcardClass38);
        int int40 = hashMap0.size();
        hashMap0.modCount = ' ';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        boolean boolean3 = hashMap0.isEmpty();
        int int4 = hashMap0.modCount;
        hashMap0.modCount = '#';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        boolean boolean3 = hashMap0.isEmpty();
        int int4 = hashMap0.modCount;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        java.lang.Object obj4 = hashMap0.get((java.lang.Object) 100L);
        system.testclass.HashMap.Entry[] entryArray5 = hashMap0.table;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        int int8 = hashMap6.size();
        boolean boolean9 = hashMap6.isEmpty();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap.Entry[] entryArray13 = new system.testclass.HashMap.Entry[] {};
        hashMap12.table = entryArray13;
        java.lang.Object obj15 = hashMap6.remove((java.lang.Object) hashMap12);
        boolean boolean16 = hashMap12.isEmpty();
        boolean boolean17 = hashMap12.isEmpty();
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        int int19 = hashMap18.modCount;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        int int22 = hashMap21.size();
        system.testclass.HashMap.Entry[] entryArray23 = hashMap21.table;
        java.lang.Object obj24 = hashMap18.put((java.lang.Object) (-1), (java.lang.Object) entryArray23);
        hashMap12.table = entryArray23;
        hashMap0.table = entryArray23;
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap(1);
        system.testclass.HashMap.Entry[] entryArray29 = hashMap28.table;
        hashMap0.table = entryArray29;
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        boolean boolean32 = hashMap31.isEmpty();
        int int33 = hashMap31.size();
        java.lang.Object obj35 = hashMap31.get((java.lang.Object) 100L);
        system.testclass.HashMap.Entry[] entryArray36 = hashMap31.table;
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        boolean boolean38 = hashMap37.isEmpty();
        int int39 = hashMap37.size();
        boolean boolean40 = hashMap37.isEmpty();
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap.Entry[] entryArray44 = new system.testclass.HashMap.Entry[] {};
        hashMap43.table = entryArray44;
        java.lang.Object obj46 = hashMap37.remove((java.lang.Object) hashMap43);
        boolean boolean47 = hashMap43.isEmpty();
        boolean boolean48 = hashMap43.isEmpty();
        system.testclass.HashMap hashMap49 = new system.testclass.HashMap();
        int int50 = hashMap49.modCount;
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap();
        int int53 = hashMap52.size();
        system.testclass.HashMap.Entry[] entryArray54 = hashMap52.table;
        java.lang.Object obj55 = hashMap49.put((java.lang.Object) (-1), (java.lang.Object) entryArray54);
        hashMap43.table = entryArray54;
        hashMap31.table = entryArray54;
        system.testclass.HashMap.Entry[] entryArray58 = new system.testclass.HashMap.Entry[] {};
        hashMap31.table = entryArray58;
        int int60 = hashMap31.size();
        java.lang.Object obj61 = hashMap0.remove((java.lang.Object) hashMap31);
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap.Entry[] entryArray3 = hashMap2.table;
        int int4 = hashMap2.modCount;
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(1);
        system.testclass.HashMap.Entry[] entryArray2 = hashMap1.table;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap1.table;
        hashMap1.modCount = ' ';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 0, (float) 10);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) (byte) 1);
        java.lang.Object obj8 = hashMap2.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap7);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        int int11 = hashMap9.modCount;
        int int12 = hashMap9.size();
        java.lang.Object obj13 = hashMap2.get((java.lang.Object) hashMap9);
        hashMap9.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap9", hashMap9.repOK_1());
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) 'a');
        boolean boolean2 = hashMap1.isEmpty();
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) (byte) 10);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        int int5 = hashMap3.size();
        java.lang.Object obj7 = hashMap3.get((java.lang.Object) 100L);
        system.testclass.HashMap.Entry[] entryArray8 = hashMap3.table;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        int int11 = hashMap9.size();
        boolean boolean12 = hashMap9.isEmpty();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap.Entry[] entryArray16 = new system.testclass.HashMap.Entry[] {};
        hashMap15.table = entryArray16;
        java.lang.Object obj18 = hashMap9.remove((java.lang.Object) hashMap15);
        boolean boolean19 = hashMap15.isEmpty();
        boolean boolean20 = hashMap15.isEmpty();
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        int int22 = hashMap21.modCount;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.size();
        system.testclass.HashMap.Entry[] entryArray26 = hashMap24.table;
        java.lang.Object obj27 = hashMap21.put((java.lang.Object) (-1), (java.lang.Object) entryArray26);
        hashMap15.table = entryArray26;
        hashMap3.table = entryArray26;
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap((int) (short) 10);
        int int32 = hashMap31.size();
        java.lang.Object obj33 = hashMap3.remove((java.lang.Object) int32);
        java.lang.Object obj34 = hashMap0.get((java.lang.Object) int32);
        hashMap0.modCount = 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        java.lang.Object obj4 = hashMap0.get((java.lang.Object) 100L);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        boolean boolean8 = hashMap7.isEmpty();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        java.lang.Object obj11 = hashMap9.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj13 = hashMap7.put((java.lang.Object) hashMap9, (java.lang.Object) 0.0f);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.size();
        system.testclass.HashMap.Entry[] entryArray16 = hashMap14.table;
        java.lang.Object obj17 = hashMap9.get((java.lang.Object) entryArray16);
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap.Entry[] entryArray21 = new system.testclass.HashMap.Entry[] {};
        hashMap20.table = entryArray21;
        hashMap20.modCount = 35;
        java.lang.Object obj25 = hashMap0.put((java.lang.Object) hashMap9, (java.lang.Object) 35);
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        boolean boolean27 = hashMap26.isEmpty();
        int int28 = hashMap26.size();
        java.lang.Object obj30 = hashMap26.get((java.lang.Object) 100L);
        system.testclass.HashMap.Entry[] entryArray31 = hashMap26.table;
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        boolean boolean33 = hashMap32.isEmpty();
        int int34 = hashMap32.size();
        boolean boolean35 = hashMap32.isEmpty();
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap.Entry[] entryArray39 = new system.testclass.HashMap.Entry[] {};
        hashMap38.table = entryArray39;
        java.lang.Object obj41 = hashMap32.remove((java.lang.Object) hashMap38);
        boolean boolean42 = hashMap38.isEmpty();
        boolean boolean43 = hashMap38.isEmpty();
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap();
        int int45 = hashMap44.modCount;
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap();
        int int48 = hashMap47.size();
        system.testclass.HashMap.Entry[] entryArray49 = hashMap47.table;
        java.lang.Object obj50 = hashMap44.put((java.lang.Object) (-1), (java.lang.Object) entryArray49);
        hashMap38.table = entryArray49;
        hashMap26.table = entryArray49;
        system.testclass.HashMap hashMap54 = new system.testclass.HashMap(1);
        system.testclass.HashMap.Entry[] entryArray55 = hashMap54.table;
        hashMap26.table = entryArray55;
        system.testclass.HashMap hashMap57 = new system.testclass.HashMap();
        boolean boolean58 = hashMap57.isEmpty();
        int int59 = hashMap57.size();
        java.lang.Object obj61 = hashMap57.get((java.lang.Object) 100L);
        system.testclass.HashMap.Entry[] entryArray62 = hashMap57.table;
        system.testclass.HashMap hashMap63 = new system.testclass.HashMap();
        boolean boolean64 = hashMap63.isEmpty();
        int int65 = hashMap63.size();
        boolean boolean66 = hashMap63.isEmpty();
        system.testclass.HashMap hashMap69 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap.Entry[] entryArray70 = new system.testclass.HashMap.Entry[] {};
        hashMap69.table = entryArray70;
        java.lang.Object obj72 = hashMap63.remove((java.lang.Object) hashMap69);
        boolean boolean73 = hashMap69.isEmpty();
        boolean boolean74 = hashMap69.isEmpty();
        system.testclass.HashMap hashMap75 = new system.testclass.HashMap();
        int int76 = hashMap75.modCount;
        system.testclass.HashMap hashMap78 = new system.testclass.HashMap();
        int int79 = hashMap78.size();
        system.testclass.HashMap.Entry[] entryArray80 = hashMap78.table;
        java.lang.Object obj81 = hashMap75.put((java.lang.Object) (-1), (java.lang.Object) entryArray80);
        hashMap69.table = entryArray80;
        hashMap57.table = entryArray80;
        system.testclass.HashMap.Entry[] entryArray84 = new system.testclass.HashMap.Entry[] {};
        hashMap57.table = entryArray84;
        int int86 = hashMap57.size();
        java.lang.Object obj87 = hashMap26.remove((java.lang.Object) hashMap57);
        system.testclass.HashMap.Entry[] entryArray88 = hashMap57.table;
        hashMap0.table = entryArray88;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(1);
        system.testclass.HashMap.Entry[] entryArray2 = hashMap1.table;
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = hashMap1.get(obj3);
        int int5 = hashMap1.size();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        int int8 = hashMap6.size();
        java.lang.Object obj10 = hashMap6.get((java.lang.Object) 100L);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        boolean boolean12 = hashMap11.isEmpty();
        int int13 = hashMap11.size();
        boolean boolean14 = hashMap11.isEmpty();
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap.Entry[] entryArray18 = new system.testclass.HashMap.Entry[] {};
        hashMap17.table = entryArray18;
        java.lang.Object obj20 = hashMap11.remove((java.lang.Object) hashMap17);
        boolean boolean21 = hashMap17.isEmpty();
        boolean boolean22 = hashMap17.isEmpty();
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        int int24 = hashMap23.modCount;
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        int int27 = hashMap26.size();
        system.testclass.HashMap.Entry[] entryArray28 = hashMap26.table;
        java.lang.Object obj29 = hashMap23.put((java.lang.Object) (-1), (java.lang.Object) entryArray28);
        hashMap17.table = entryArray28;
        hashMap6.table = entryArray28;
        hashMap1.table = entryArray28;
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap((int) ' ', (float) '#');
        java.lang.Object obj38 = hashMap36.get((java.lang.Object) (-1L));
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        int int40 = hashMap39.modCount;
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap();
        int int43 = hashMap42.size();
        system.testclass.HashMap.Entry[] entryArray44 = hashMap42.table;
        java.lang.Object obj45 = hashMap39.put((java.lang.Object) (-1), (java.lang.Object) entryArray44);
        java.lang.Object obj46 = hashMap36.get((java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass47 = hashMap36.getClass();
        java.lang.Object obj48 = hashMap1.put((java.lang.Object) 100.0d, (java.lang.Object) wildcardClass47);
        hashMap1.modCount = ' ';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        boolean boolean3 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap.Entry[] entryArray7 = new system.testclass.HashMap.Entry[] {};
        hashMap6.table = entryArray7;
        java.lang.Object obj9 = hashMap0.remove((java.lang.Object) hashMap6);
        boolean boolean10 = hashMap6.isEmpty();
        boolean boolean11 = hashMap6.isEmpty();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        int int13 = hashMap12.modCount;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.size();
        system.testclass.HashMap.Entry[] entryArray17 = hashMap15.table;
        java.lang.Object obj18 = hashMap12.put((java.lang.Object) (-1), (java.lang.Object) entryArray17);
        hashMap6.table = entryArray17;
        hashMap6.modCount = ' ';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap6", hashMap6.repOK_1());
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) ' ', (float) '#');
        java.lang.Object obj6 = hashMap2.get((java.lang.Object) hashMap5);
        int int7 = hashMap5.size();
        system.testclass.HashMap.Entry[] entryArray8 = hashMap5.table;
        system.testclass.HashMap.Entry[] entryArray9 = hashMap5.table;
        hashMap5.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap5", hashMap5.repOK_1());
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 10, (float) 100L);
        system.testclass.HashMap.Entry[] entryArray3 = hashMap2.table;
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap.Entry[] entryArray3 = hashMap2.table;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) (byte) 1);
        int int6 = hashMap5.size();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap(1);
        system.testclass.HashMap.Entry[] entryArray9 = hashMap8.table;
        system.testclass.HashMap.Entry[] entryArray10 = hashMap8.table;
        java.lang.Object obj11 = hashMap5.remove((java.lang.Object) hashMap8);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        int int13 = hashMap12.size();
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap.Entry[] entryArray17 = new system.testclass.HashMap.Entry[] {};
        hashMap16.table = entryArray17;
        hashMap12.table = entryArray17;
        java.lang.Object obj20 = hashMap8.remove((java.lang.Object) hashMap12);
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap.Entry[] entryArray24 = new system.testclass.HashMap.Entry[] {};
        hashMap23.table = entryArray24;
        boolean boolean26 = hashMap23.isEmpty();
        boolean boolean27 = hashMap23.isEmpty();
        hashMap23.clear();
        int int29 = hashMap23.modCount;
        java.lang.Object obj30 = hashMap2.put(obj20, (java.lang.Object) hashMap23);
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap((int) (short) 0, (float) 'a');
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap(35, 10.0f);
        int int37 = hashMap36.size();
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray41 = hashMap40.table;
        hashMap36.table = entryArray41;
        java.lang.Object obj43 = hashMap2.put((java.lang.Object) hashMap33, (java.lang.Object) entryArray41);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        java.lang.Object obj4 = hashMap0.get((java.lang.Object) 100L);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.size();
        system.testclass.HashMap.Entry[] entryArray10 = hashMap8.table;
        java.lang.Object obj11 = hashMap5.put((java.lang.Object) (-1), (java.lang.Object) entryArray10);
        java.lang.Object obj12 = hashMap0.remove(obj11);
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 100, (float) 10);
        hashMap2.modCount = 35;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) ' ');
        int int2 = hashMap1.modCount;
        int int3 = hashMap1.modCount;
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) ' ', (float) '#');
        java.lang.Object obj6 = hashMap2.get((java.lang.Object) hashMap5);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        int int9 = hashMap7.size();
        boolean boolean10 = hashMap7.isEmpty();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap((int) (short) 10);
        java.lang.Object obj13 = hashMap7.remove((java.lang.Object) hashMap12);
        java.lang.Object obj14 = hashMap5.get((java.lang.Object) hashMap7);
        boolean boolean15 = hashMap5.isEmpty();
        hashMap5.modCount = '#';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap5", hashMap5.repOK_1());
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) ' ', (float) '#');
        java.lang.Object obj6 = hashMap2.get((java.lang.Object) hashMap5);
        int int7 = hashMap5.size();
        hashMap5.modCount = '4';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap5", hashMap5.repOK_1());
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        java.lang.Object obj4 = hashMap0.get((java.lang.Object) 10.0d);
        hashMap0.modCount = (byte) 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        hashMap2.modCount = 35;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        int int2 = hashMap1.modCount;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap(1);
        int int5 = hashMap4.size();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.modCount;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.size();
        system.testclass.HashMap.Entry[] entryArray11 = hashMap9.table;
        java.lang.Object obj12 = hashMap6.put((java.lang.Object) (-1), (java.lang.Object) entryArray11);
        hashMap4.table = entryArray11;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        int int18 = hashMap17.size();
        system.testclass.HashMap.Entry[] entryArray19 = hashMap17.table;
        hashMap16.table = entryArray19;
        java.lang.Object obj21 = hashMap1.put((java.lang.Object) entryArray11, (java.lang.Object) entryArray19);
        system.testclass.HashMap.Entry[] entryArray22 = hashMap1.table;
        system.testclass.HashMap.Entry[] entryArray23 = hashMap1.table;
        int int24 = hashMap1.modCount;
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.size();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap3.table;
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) (-1), (java.lang.Object) entryArray5);
        hashMap0.modCount = (short) 0;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 10);
        hashMap1.modCount = (byte) 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) ' ');
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) ' ', (float) '#');
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.size();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap.Entry[] entryArray8 = new system.testclass.HashMap.Entry[] {};
        hashMap7.table = entryArray8;
        hashMap3.table = entryArray8;
        hashMap2.table = entryArray8;
        int int12 = hashMap2.modCount;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        boolean boolean14 = hashMap13.isEmpty();
        int int15 = hashMap13.size();
        java.lang.Object obj17 = hashMap13.get((java.lang.Object) 100L);
        system.testclass.HashMap.Entry[] entryArray18 = hashMap13.table;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        boolean boolean20 = hashMap19.isEmpty();
        int int21 = hashMap19.size();
        boolean boolean22 = hashMap19.isEmpty();
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap.Entry[] entryArray26 = new system.testclass.HashMap.Entry[] {};
        hashMap25.table = entryArray26;
        java.lang.Object obj28 = hashMap19.remove((java.lang.Object) hashMap25);
        boolean boolean29 = hashMap25.isEmpty();
        boolean boolean30 = hashMap25.isEmpty();
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        int int32 = hashMap31.modCount;
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        int int35 = hashMap34.size();
        system.testclass.HashMap.Entry[] entryArray36 = hashMap34.table;
        java.lang.Object obj37 = hashMap31.put((java.lang.Object) (-1), (java.lang.Object) entryArray36);
        hashMap25.table = entryArray36;
        hashMap13.table = entryArray36;
        hashMap2.table = entryArray36;
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        boolean boolean42 = hashMap41.isEmpty();
        int int43 = hashMap41.size();
        hashMap41.modCount = 0;
        system.testclass.HashMap hashMap46 = new system.testclass.HashMap();
        int int47 = hashMap46.size();
        system.testclass.HashMap.Entry[] entryArray48 = hashMap46.table;
        hashMap41.table = entryArray48;
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        java.lang.Object obj53 = hashMap2.put((java.lang.Object) hashMap41, (java.lang.Object) hashMap52);
        hashMap41.modCount = 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap41", hashMap41.repOK_1());
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap.Entry[] entryArray2 = hashMap1.table;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        hashMap3.modCount = 0;
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = hashMap3.remove(obj6);
        int int8 = hashMap3.size();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) (byte) 0);
        int int11 = hashMap10.modCount;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap(1);
        int int14 = hashMap13.size();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        int int19 = hashMap18.size();
        system.testclass.HashMap.Entry[] entryArray20 = hashMap18.table;
        java.lang.Object obj21 = hashMap15.put((java.lang.Object) (-1), (java.lang.Object) entryArray20);
        hashMap13.table = entryArray20;
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        int int27 = hashMap26.size();
        system.testclass.HashMap.Entry[] entryArray28 = hashMap26.table;
        hashMap25.table = entryArray28;
        java.lang.Object obj30 = hashMap10.put((java.lang.Object) entryArray20, (java.lang.Object) entryArray28);
        java.lang.Object obj31 = hashMap1.put((java.lang.Object) int8, obj30);
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        boolean boolean33 = hashMap32.isEmpty();
        int int34 = hashMap32.size();
        int int35 = hashMap32.modCount;
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        boolean boolean37 = hashMap36.isEmpty();
        int int38 = hashMap36.size();
        java.lang.Object obj40 = hashMap36.get((java.lang.Object) 100L);
        system.testclass.HashMap.Entry[] entryArray41 = hashMap36.table;
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap();
        boolean boolean43 = hashMap42.isEmpty();
        int int44 = hashMap42.size();
        boolean boolean45 = hashMap42.isEmpty();
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap.Entry[] entryArray49 = new system.testclass.HashMap.Entry[] {};
        hashMap48.table = entryArray49;
        java.lang.Object obj51 = hashMap42.remove((java.lang.Object) hashMap48);
        boolean boolean52 = hashMap48.isEmpty();
        boolean boolean53 = hashMap48.isEmpty();
        system.testclass.HashMap hashMap54 = new system.testclass.HashMap();
        int int55 = hashMap54.modCount;
        system.testclass.HashMap hashMap57 = new system.testclass.HashMap();
        int int58 = hashMap57.size();
        system.testclass.HashMap.Entry[] entryArray59 = hashMap57.table;
        java.lang.Object obj60 = hashMap54.put((java.lang.Object) (-1), (java.lang.Object) entryArray59);
        hashMap48.table = entryArray59;
        hashMap36.table = entryArray59;
        system.testclass.HashMap.Entry[] entryArray63 = new system.testclass.HashMap.Entry[] {};
        hashMap36.table = entryArray63;
        java.lang.Object obj65 = null;
        java.lang.Object obj66 = hashMap32.put((java.lang.Object) entryArray63, obj65);
        java.lang.Object obj67 = hashMap1.get(obj65);
        java.lang.Object obj70 = hashMap1.put((java.lang.Object) 1.0d, (java.lang.Object) 1);
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) (byte) 10);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        int int5 = hashMap3.size();
        java.lang.Object obj7 = hashMap3.get((java.lang.Object) 100L);
        system.testclass.HashMap.Entry[] entryArray8 = hashMap3.table;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        int int11 = hashMap9.size();
        boolean boolean12 = hashMap9.isEmpty();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap.Entry[] entryArray16 = new system.testclass.HashMap.Entry[] {};
        hashMap15.table = entryArray16;
        java.lang.Object obj18 = hashMap9.remove((java.lang.Object) hashMap15);
        boolean boolean19 = hashMap15.isEmpty();
        boolean boolean20 = hashMap15.isEmpty();
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        int int22 = hashMap21.modCount;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.size();
        system.testclass.HashMap.Entry[] entryArray26 = hashMap24.table;
        java.lang.Object obj27 = hashMap21.put((java.lang.Object) (-1), (java.lang.Object) entryArray26);
        hashMap15.table = entryArray26;
        hashMap3.table = entryArray26;
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap((int) (short) 10);
        int int32 = hashMap31.size();
        java.lang.Object obj33 = hashMap3.remove((java.lang.Object) int32);
        java.lang.Object obj34 = hashMap0.get((java.lang.Object) int32);
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        int int36 = hashMap35.size();
        system.testclass.HashMap.Entry[] entryArray37 = hashMap35.table;
        java.lang.Class<?> wildcardClass38 = hashMap35.getClass();
        java.lang.Object obj39 = hashMap0.get((java.lang.Object) wildcardClass38);
        system.testclass.HashMap.Entry[] entryArray40 = hashMap0.table;
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap46 = new system.testclass.HashMap((int) ' ', (float) '#');
        java.lang.Object obj47 = hashMap43.get((java.lang.Object) hashMap46);
        system.testclass.HashMap hashMap50 = new system.testclass.HashMap((int) '#', (float) 'a');
        java.lang.Object obj52 = hashMap46.put((java.lang.Object) hashMap50, (java.lang.Object) (-1.0f));
        java.lang.Object obj53 = hashMap0.remove((java.lang.Object) (-1.0f));
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        hashMap1.modCount = (byte) 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = hashMap0.remove(obj3);
        java.lang.Object obj7 = hashMap0.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.size();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap.Entry[] entryArray13 = new system.testclass.HashMap.Entry[] {};
        hashMap12.table = entryArray13;
        hashMap8.table = entryArray13;
        java.lang.Object obj16 = hashMap0.get((java.lang.Object) hashMap8);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap(10, (float) 35);
        java.lang.Object obj20 = hashMap0.get((java.lang.Object) 10);
        hashMap0.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) (byte) 10);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        hashMap3.modCount = 0;
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = hashMap3.remove(obj6);
        java.lang.Object obj10 = hashMap3.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.size();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap.Entry[] entryArray16 = new system.testclass.HashMap.Entry[] {};
        hashMap15.table = entryArray16;
        hashMap11.table = entryArray16;
        java.lang.Object obj19 = hashMap3.get((java.lang.Object) hashMap11);
        java.lang.Object obj20 = hashMap0.get((java.lang.Object) hashMap3);
        hashMap3.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap3", hashMap3.repOK_1());
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        java.lang.Object obj4 = hashMap0.get((java.lang.Object) 100L);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        boolean boolean6 = hashMap5.isEmpty();
        int int7 = hashMap5.size();
        boolean boolean8 = hashMap5.isEmpty();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap.Entry[] entryArray12 = new system.testclass.HashMap.Entry[] {};
        hashMap11.table = entryArray12;
        java.lang.Object obj14 = hashMap5.remove((java.lang.Object) hashMap11);
        boolean boolean15 = hashMap11.isEmpty();
        boolean boolean16 = hashMap11.isEmpty();
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        int int18 = hashMap17.modCount;
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        int int21 = hashMap20.size();
        system.testclass.HashMap.Entry[] entryArray22 = hashMap20.table;
        java.lang.Object obj23 = hashMap17.put((java.lang.Object) (-1), (java.lang.Object) entryArray22);
        hashMap11.table = entryArray22;
        hashMap0.table = entryArray22;
        int int26 = hashMap0.modCount;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (short) 100);
        boolean boolean3 = hashMap2.isEmpty();
        hashMap2.modCount = 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) ' ', (float) '#');
        java.lang.Object obj6 = hashMap2.get((java.lang.Object) hashMap5);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap((int) '#', (float) 'a');
        java.lang.Object obj11 = hashMap5.put((java.lang.Object) hashMap9, (java.lang.Object) (-1.0f));
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap.Entry[] entryArray15 = hashMap14.table;
        java.lang.Object obj16 = hashMap5.get((java.lang.Object) entryArray15);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap(1);
        system.testclass.HashMap.Entry[] entryArray19 = hashMap18.table;
        system.testclass.HashMap.Entry[] entryArray20 = hashMap18.table;
        java.lang.Object obj21 = hashMap5.remove((java.lang.Object) entryArray20);
        hashMap5.modCount = (short) 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap5", hashMap5.repOK_1());
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 0, (float) (byte) 100);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap(1);
        system.testclass.HashMap.Entry[] entryArray5 = hashMap4.table;
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = hashMap4.get(obj6);
        int int8 = hashMap4.size();
        system.testclass.HashMap.Entry[] entryArray9 = hashMap4.table;
        java.lang.Object obj10 = hashMap2.remove((java.lang.Object) hashMap4);
        hashMap2.modCount = '4';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(1);
        system.testclass.HashMap.Entry[] entryArray2 = hashMap1.table;
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = hashMap1.get(obj3);
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) (byte) 10);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        int int5 = hashMap3.size();
        java.lang.Object obj7 = hashMap3.get((java.lang.Object) 100L);
        system.testclass.HashMap.Entry[] entryArray8 = hashMap3.table;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        int int11 = hashMap9.size();
        boolean boolean12 = hashMap9.isEmpty();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap.Entry[] entryArray16 = new system.testclass.HashMap.Entry[] {};
        hashMap15.table = entryArray16;
        java.lang.Object obj18 = hashMap9.remove((java.lang.Object) hashMap15);
        boolean boolean19 = hashMap15.isEmpty();
        boolean boolean20 = hashMap15.isEmpty();
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        int int22 = hashMap21.modCount;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.size();
        system.testclass.HashMap.Entry[] entryArray26 = hashMap24.table;
        java.lang.Object obj27 = hashMap21.put((java.lang.Object) (-1), (java.lang.Object) entryArray26);
        hashMap15.table = entryArray26;
        hashMap3.table = entryArray26;
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap((int) (short) 10);
        int int32 = hashMap31.size();
        java.lang.Object obj33 = hashMap3.remove((java.lang.Object) int32);
        java.lang.Object obj34 = hashMap0.get((java.lang.Object) int32);
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        int int36 = hashMap35.size();
        system.testclass.HashMap.Entry[] entryArray37 = hashMap35.table;
        java.lang.Class<?> wildcardClass38 = hashMap35.getClass();
        java.lang.Object obj39 = hashMap0.get((java.lang.Object) wildcardClass38);
        system.testclass.HashMap.Entry[] entryArray40 = hashMap0.table;
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap46 = new system.testclass.HashMap((int) ' ', (float) '#');
        java.lang.Object obj47 = hashMap43.get((java.lang.Object) hashMap46);
        system.testclass.HashMap hashMap50 = new system.testclass.HashMap((int) '#', (float) 'a');
        java.lang.Object obj52 = hashMap46.put((java.lang.Object) hashMap50, (java.lang.Object) (-1.0f));
        java.lang.Object obj53 = hashMap0.remove((java.lang.Object) (-1.0f));
        system.testclass.HashMap hashMap54 = new system.testclass.HashMap();
        java.lang.Object obj56 = hashMap54.remove((java.lang.Object) (byte) 10);
        system.testclass.HashMap.Entry[] entryArray57 = hashMap54.table;
        hashMap0.table = entryArray57;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = hashMap0.remove(obj3);
        java.lang.Object obj7 = hashMap0.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.size();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap.Entry[] entryArray13 = new system.testclass.HashMap.Entry[] {};
        hashMap12.table = entryArray13;
        hashMap8.table = entryArray13;
        java.lang.Object obj16 = hashMap0.get((java.lang.Object) hashMap8);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        boolean boolean18 = hashMap17.isEmpty();
        int int19 = hashMap17.size();
        boolean boolean20 = hashMap17.isEmpty();
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap.Entry[] entryArray24 = new system.testclass.HashMap.Entry[] {};
        hashMap23.table = entryArray24;
        java.lang.Object obj26 = hashMap17.remove((java.lang.Object) hashMap23);
        boolean boolean27 = hashMap23.isEmpty();
        hashMap23.modCount = '#';
        java.lang.Object obj30 = hashMap0.remove((java.lang.Object) '#');
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        boolean boolean3 = hashMap2.isEmpty();
        int int4 = hashMap2.size();
        java.lang.Object obj6 = hashMap2.get((java.lang.Object) 100L);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        int int9 = hashMap7.size();
        boolean boolean10 = hashMap7.isEmpty();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap.Entry[] entryArray14 = new system.testclass.HashMap.Entry[] {};
        hashMap13.table = entryArray14;
        java.lang.Object obj16 = hashMap7.remove((java.lang.Object) hashMap13);
        boolean boolean17 = hashMap13.isEmpty();
        boolean boolean18 = hashMap13.isEmpty();
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        int int20 = hashMap19.modCount;
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        int int23 = hashMap22.size();
        system.testclass.HashMap.Entry[] entryArray24 = hashMap22.table;
        java.lang.Object obj25 = hashMap19.put((java.lang.Object) (-1), (java.lang.Object) entryArray24);
        hashMap13.table = entryArray24;
        hashMap2.table = entryArray24;
        java.lang.Object obj28 = hashMap1.get((java.lang.Object) hashMap2);
        hashMap2.modCount = (short) 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }
}

