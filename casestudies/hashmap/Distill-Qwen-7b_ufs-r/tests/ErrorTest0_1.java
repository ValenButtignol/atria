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
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray1 = hashMap0.table;
        java.lang.Object obj4 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
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
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) ' ', (float) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) 100L);
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        hashMap3.modCount = 0;
        int int6 = hashMap3.modCount;
        int int7 = hashMap3.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray9 = new system.testclass.HashMap.Entry[] {};
        hashMap8.table = entryArray9;
        hashMap3.table = entryArray9;
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap3);
        hashMap0.modCount = (byte) 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        hashMap3.modCount = 0;
        int int6 = hashMap3.modCount;
        int int7 = hashMap3.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray9 = new system.testclass.HashMap.Entry[] {};
        hashMap8.table = entryArray9;
        hashMap3.table = entryArray9;
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap3);
        hashMap0.modCount = 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        int int2 = hashMap1.size();
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        boolean boolean6 = hashMap3.isEmpty();
        system.testclass.HashMap.Entry[] entryArray7 = hashMap3.table;
        hashMap1.table = entryArray7;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap2.table;
        java.lang.Object obj4 = hashMap1.remove((java.lang.Object) hashMap2);
        boolean boolean5 = hashMap2.isEmpty();
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '#', (float) 'a');
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
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = hashMap0.remove(obj3);
        hashMap0.modCount = '#';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap2.table;
        java.lang.Object obj4 = hashMap1.remove((java.lang.Object) hashMap2);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        boolean boolean6 = hashMap5.isEmpty();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        int int9 = hashMap7.modCount;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        hashMap10.modCount = 0;
        int int13 = hashMap10.modCount;
        int int14 = hashMap10.modCount;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray16 = new system.testclass.HashMap.Entry[] {};
        hashMap15.table = entryArray16;
        hashMap10.table = entryArray16;
        java.lang.Object obj19 = hashMap7.remove((java.lang.Object) hashMap10);
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        boolean boolean21 = hashMap20.isEmpty();
        boolean boolean22 = hashMap20.isEmpty();
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray25 = hashMap24.table;
        hashMap20.table = entryArray25;
        hashMap10.table = entryArray25;
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        hashMap28.modCount = 0;
        int int31 = hashMap28.modCount;
        int int32 = hashMap28.modCount;
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray34 = new system.testclass.HashMap.Entry[] {};
        hashMap33.table = entryArray34;
        hashMap28.table = entryArray34;
        hashMap10.table = entryArray34;
        int int38 = hashMap10.modCount;
        java.lang.Object obj39 = hashMap1.put((java.lang.Object) boolean6, (java.lang.Object) hashMap10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray1 = hashMap0.table;
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) (byte) 10);
        hashMap0.clear();
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
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        hashMap3.modCount = 0;
        int int6 = hashMap3.modCount;
        int int7 = hashMap3.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray9 = new system.testclass.HashMap.Entry[] {};
        hashMap8.table = entryArray9;
        hashMap3.table = entryArray9;
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap3);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        boolean boolean14 = hashMap13.isEmpty();
        boolean boolean15 = hashMap13.isEmpty();
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray18 = hashMap17.table;
        hashMap13.table = entryArray18;
        hashMap3.table = entryArray18;
        hashMap3.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap3", hashMap3.repOK_1());
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        int int7 = hashMap4.modCount;
        int int8 = hashMap4.size();
        java.lang.Object obj9 = hashMap0.put((java.lang.Object) (-1.0f), (java.lang.Object) hashMap4);
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
        boolean boolean3 = hashMap0.isEmpty();
        hashMap0.modCount = (byte) 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray5 = hashMap4.table;
        hashMap0.table = entryArray5;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        hashMap7.modCount = 0;
        int int10 = hashMap7.modCount;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        int int13 = hashMap11.modCount;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        hashMap14.modCount = 0;
        int int17 = hashMap14.modCount;
        int int18 = hashMap14.modCount;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray20 = new system.testclass.HashMap.Entry[] {};
        hashMap19.table = entryArray20;
        hashMap14.table = entryArray20;
        java.lang.Object obj23 = hashMap11.remove((java.lang.Object) hashMap14);
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        boolean boolean25 = hashMap24.isEmpty();
        boolean boolean26 = hashMap24.isEmpty();
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray29 = hashMap28.table;
        hashMap24.table = entryArray29;
        hashMap14.table = entryArray29;
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        int int33 = hashMap32.modCount;
        int int34 = hashMap32.modCount;
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        hashMap35.modCount = 0;
        int int38 = hashMap35.modCount;
        int int39 = hashMap35.modCount;
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray41 = new system.testclass.HashMap.Entry[] {};
        hashMap40.table = entryArray41;
        hashMap35.table = entryArray41;
        java.lang.Object obj44 = hashMap32.remove((java.lang.Object) hashMap35);
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        boolean boolean46 = hashMap45.isEmpty();
        boolean boolean47 = hashMap45.isEmpty();
        system.testclass.HashMap hashMap49 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray50 = hashMap49.table;
        hashMap45.table = entryArray50;
        hashMap35.table = entryArray50;
        hashMap14.table = entryArray50;
        hashMap7.table = entryArray50;
        java.lang.Object obj56 = hashMap0.put((java.lang.Object) hashMap7, (java.lang.Object) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        int int3 = hashMap0.modCount;
        int int4 = hashMap0.size();
        hashMap0.clear();
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
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        hashMap3.modCount = 0;
        int int6 = hashMap3.modCount;
        int int7 = hashMap3.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray9 = new system.testclass.HashMap.Entry[] {};
        hashMap8.table = entryArray9;
        hashMap3.table = entryArray9;
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap3);
        int int13 = hashMap0.modCount;
        hashMap0.modCount = 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap2.table;
        java.lang.Object obj4 = hashMap1.remove((java.lang.Object) hashMap2);
        hashMap1.modCount = (byte) 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray1 = new system.testclass.HashMap.Entry[] {};
        hashMap0.table = entryArray1;
        hashMap0.modCount = (byte) 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 100, (float) (byte) 100);
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
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        hashMap3.modCount = 0;
        int int6 = hashMap3.modCount;
        int int7 = hashMap3.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray9 = new system.testclass.HashMap.Entry[] {};
        hashMap8.table = entryArray9;
        hashMap3.table = entryArray9;
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap3);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        boolean boolean14 = hashMap13.isEmpty();
        boolean boolean15 = hashMap13.isEmpty();
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray18 = hashMap17.table;
        hashMap13.table = entryArray18;
        hashMap3.table = entryArray18;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        int int22 = hashMap21.modCount;
        int int23 = hashMap21.modCount;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        hashMap24.modCount = 0;
        int int27 = hashMap24.modCount;
        int int28 = hashMap24.modCount;
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray30 = new system.testclass.HashMap.Entry[] {};
        hashMap29.table = entryArray30;
        hashMap24.table = entryArray30;
        java.lang.Object obj33 = hashMap21.remove((java.lang.Object) hashMap24);
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        boolean boolean35 = hashMap34.isEmpty();
        boolean boolean36 = hashMap34.isEmpty();
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray39 = hashMap38.table;
        hashMap34.table = entryArray39;
        hashMap24.table = entryArray39;
        hashMap3.table = entryArray39;
        hashMap3.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap3", hashMap3.repOK_1());
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        int int3 = hashMap0.modCount;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) 100L);
        java.lang.Object obj5 = hashMap0.get((java.lang.Object) 10);
        hashMap0.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(1);
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        int int2 = hashMap1.size();
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        hashMap3.modCount = 0;
        int int6 = hashMap3.modCount;
        int int7 = hashMap3.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray9 = new system.testclass.HashMap.Entry[] {};
        hashMap8.table = entryArray9;
        hashMap3.table = entryArray9;
        java.lang.Object obj12 = hashMap1.get((java.lang.Object) hashMap3);
        hashMap3.modCount = (byte) 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap3", hashMap3.repOK_1());
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 100, (float) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 10);
        hashMap1.modCount = ' ';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 100, (float) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        int int2 = hashMap1.modCount;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        hashMap7.modCount = 0;
        int int10 = hashMap7.modCount;
        int int11 = hashMap7.modCount;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray13 = new system.testclass.HashMap.Entry[] {};
        hashMap12.table = entryArray13;
        hashMap7.table = entryArray13;
        java.lang.Object obj16 = hashMap4.remove((java.lang.Object) hashMap7);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        boolean boolean18 = hashMap17.isEmpty();
        boolean boolean19 = hashMap17.isEmpty();
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray22 = hashMap21.table;
        hashMap17.table = entryArray22;
        hashMap7.table = entryArray22;
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        hashMap25.modCount = 0;
        int int28 = hashMap25.modCount;
        int int29 = hashMap25.modCount;
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray31 = new system.testclass.HashMap.Entry[] {};
        hashMap30.table = entryArray31;
        hashMap25.table = entryArray31;
        hashMap7.table = entryArray31;
        java.lang.Object obj35 = hashMap1.put((java.lang.Object) hashMap3, (java.lang.Object) entryArray31);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        hashMap0.modCount = (short) 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray5 = hashMap4.table;
        hashMap0.table = entryArray5;
        hashMap0.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        hashMap3.modCount = 0;
        int int6 = hashMap3.modCount;
        int int7 = hashMap3.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray9 = new system.testclass.HashMap.Entry[] {};
        hashMap8.table = entryArray9;
        hashMap3.table = entryArray9;
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap3);
        int int13 = hashMap0.modCount;
        int int14 = hashMap0.size();
        boolean boolean15 = hashMap0.isEmpty();
        hashMap0.modCount = (short) 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray2 = hashMap1.table;
        boolean boolean3 = hashMap1.isEmpty();
        system.testclass.HashMap.Entry[] entryArray4 = hashMap1.table;
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray2 = hashMap1.table;
        hashMap1.modCount = 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        int int3 = hashMap0.modCount;
        int int4 = hashMap0.modCount;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray6 = new system.testclass.HashMap.Entry[] {};
        hashMap5.table = entryArray6;
        hashMap0.table = entryArray6;
        hashMap0.modCount = 0;
        system.testclass.HashMap.Entry[] entryArray11 = hashMap0.table;
        boolean boolean12 = hashMap0.isEmpty();
        hashMap0.modCount = (byte) 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        hashMap3.modCount = 0;
        int int6 = hashMap3.modCount;
        int int7 = hashMap3.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray9 = new system.testclass.HashMap.Entry[] {};
        hashMap8.table = entryArray9;
        hashMap3.table = entryArray9;
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap3);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        hashMap13.modCount = 0;
        int int16 = hashMap13.modCount;
        int int17 = hashMap13.modCount;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray19 = new system.testclass.HashMap.Entry[] {};
        hashMap18.table = entryArray19;
        hashMap13.table = entryArray19;
        hashMap0.table = entryArray19;
        hashMap0.modCount = (byte) 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '#', (float) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        hashMap3.modCount = 0;
        int int6 = hashMap3.modCount;
        int int7 = hashMap3.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray9 = new system.testclass.HashMap.Entry[] {};
        hashMap8.table = entryArray9;
        hashMap3.table = entryArray9;
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap3);
        int int13 = hashMap0.modCount;
        int int14 = hashMap0.size();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        int int17 = hashMap15.modCount;
        boolean boolean18 = hashMap15.isEmpty();
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray20 = hashMap19.table;
        hashMap15.table = entryArray20;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray25 = hashMap24.table;
        java.lang.Object obj26 = hashMap23.remove((java.lang.Object) hashMap24);
        boolean boolean27 = hashMap24.isEmpty();
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        int int29 = hashMap28.modCount;
        int int30 = hashMap28.modCount;
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        hashMap31.modCount = 0;
        int int34 = hashMap31.modCount;
        int int35 = hashMap31.modCount;
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray37 = new system.testclass.HashMap.Entry[] {};
        hashMap36.table = entryArray37;
        hashMap31.table = entryArray37;
        java.lang.Object obj40 = hashMap28.remove((java.lang.Object) hashMap31);
        java.lang.Object obj41 = hashMap24.get((java.lang.Object) hashMap28);
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap();
        hashMap42.modCount = 0;
        int int45 = hashMap42.modCount;
        int int46 = hashMap42.modCount;
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray48 = new system.testclass.HashMap.Entry[] {};
        hashMap47.table = entryArray48;
        hashMap42.table = entryArray48;
        hashMap28.table = entryArray48;
        java.lang.Object obj52 = hashMap0.put((java.lang.Object) entryArray20, (java.lang.Object) entryArray48);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        hashMap3.modCount = 0;
        int int6 = hashMap3.modCount;
        int int7 = hashMap3.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray9 = new system.testclass.HashMap.Entry[] {};
        hashMap8.table = entryArray9;
        hashMap3.table = entryArray9;
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap3);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        boolean boolean14 = hashMap13.isEmpty();
        boolean boolean15 = hashMap13.isEmpty();
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray18 = hashMap17.table;
        hashMap13.table = entryArray18;
        hashMap3.table = entryArray18;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        hashMap21.modCount = 0;
        int int24 = hashMap21.modCount;
        int int25 = hashMap21.modCount;
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray27 = new system.testclass.HashMap.Entry[] {};
        hashMap26.table = entryArray27;
        hashMap21.table = entryArray27;
        hashMap3.table = entryArray27;
        int int31 = hashMap3.modCount;
        hashMap3.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap3", hashMap3.repOK_1());
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray1 = new system.testclass.HashMap.Entry[] {};
        hashMap0.table = entryArray1;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        hashMap0.modCount = (byte) 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray2 = hashMap1.table;
        boolean boolean3 = hashMap1.isEmpty();
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        int int3 = hashMap0.size();
        int int4 = hashMap0.modCount;
        java.lang.Object obj6 = hashMap0.remove((java.lang.Object) (byte) 100);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        int int9 = hashMap7.modCount;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        hashMap10.modCount = 0;
        int int13 = hashMap10.modCount;
        int int14 = hashMap10.modCount;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray16 = new system.testclass.HashMap.Entry[] {};
        hashMap15.table = entryArray16;
        hashMap10.table = entryArray16;
        java.lang.Object obj19 = hashMap7.remove((java.lang.Object) hashMap10);
        int int20 = hashMap10.size();
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        int int22 = hashMap21.modCount;
        int int23 = hashMap21.modCount;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        hashMap24.modCount = 0;
        int int27 = hashMap24.modCount;
        int int28 = hashMap24.modCount;
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray30 = new system.testclass.HashMap.Entry[] {};
        hashMap29.table = entryArray30;
        hashMap24.table = entryArray30;
        java.lang.Object obj33 = hashMap21.remove((java.lang.Object) hashMap24);
        int int34 = hashMap24.size();
        java.lang.Object obj35 = hashMap0.put((java.lang.Object) int20, (java.lang.Object) int34);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        boolean boolean3 = hashMap0.isEmpty();
        system.testclass.HashMap.Entry[] entryArray4 = hashMap0.table;
        int int5 = hashMap0.size();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        boolean boolean8 = hashMap6.isEmpty();
        system.testclass.HashMap.Entry[] entryArray9 = hashMap6.table;
        hashMap0.table = entryArray9;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        java.lang.Object obj16 = hashMap13.get((java.lang.Object) 100L);
        int int17 = hashMap13.modCount;
        java.lang.Class<?> wildcardClass18 = hashMap13.getClass();
        java.lang.Object obj19 = hashMap12.get((java.lang.Object) hashMap13);
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap((int) (byte) 0);
        boolean boolean22 = hashMap21.isEmpty();
        java.lang.Object obj23 = hashMap0.put((java.lang.Object) hashMap12, (java.lang.Object) hashMap21);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        boolean boolean3 = hashMap0.isEmpty();
        system.testclass.HashMap.Entry[] entryArray4 = hashMap0.table;
        hashMap0.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        hashMap6.modCount = 0;
        int int9 = hashMap6.modCount;
        int int10 = hashMap6.modCount;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray12 = new system.testclass.HashMap.Entry[] {};
        hashMap11.table = entryArray12;
        hashMap6.table = entryArray12;
        java.lang.Object obj15 = hashMap3.remove((java.lang.Object) hashMap6);
        int int16 = hashMap3.modCount;
        java.lang.Object obj17 = hashMap0.get((java.lang.Object) int16);
        hashMap0.clear();
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
        boolean boolean3 = hashMap0.isEmpty();
        int int4 = hashMap0.size();
        int int5 = hashMap0.size();
        hashMap0.clear();
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
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        hashMap3.modCount = 0;
        int int6 = hashMap3.modCount;
        int int7 = hashMap3.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray9 = new system.testclass.HashMap.Entry[] {};
        hashMap8.table = entryArray9;
        hashMap3.table = entryArray9;
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap3);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        boolean boolean14 = hashMap13.isEmpty();
        boolean boolean15 = hashMap13.isEmpty();
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray18 = hashMap17.table;
        hashMap13.table = entryArray18;
        hashMap3.table = entryArray18;
        int int21 = hashMap3.size();
        hashMap3.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap3", hashMap3.repOK_1());
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        boolean boolean3 = hashMap0.isEmpty();
        int int4 = hashMap0.size();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        hashMap6.modCount = 0;
        int int9 = hashMap6.modCount;
        int int10 = hashMap6.size();
        java.lang.Object obj11 = hashMap0.put((java.lang.Object) (short) 1, (java.lang.Object) int10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        int int3 = hashMap2.modCount;
        java.lang.Object obj5 = hashMap2.get((java.lang.Object) 100L);
        int int6 = hashMap2.modCount;
        java.lang.Class<?> wildcardClass7 = hashMap2.getClass();
        java.lang.Object obj8 = hashMap1.get((java.lang.Object) hashMap2);
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        int int3 = hashMap0.modCount;
        int int4 = hashMap0.modCount;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) '4');
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        hashMap2.modCount = 0;
        int int5 = hashMap2.modCount;
        int int6 = hashMap2.size();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        int int9 = hashMap7.modCount;
        boolean boolean10 = hashMap7.isEmpty();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray12 = hashMap11.table;
        hashMap7.table = entryArray12;
        int int14 = hashMap7.modCount;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        int int17 = hashMap15.modCount;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        hashMap18.modCount = 0;
        int int21 = hashMap18.modCount;
        int int22 = hashMap18.modCount;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray24 = new system.testclass.HashMap.Entry[] {};
        hashMap23.table = entryArray24;
        hashMap18.table = entryArray24;
        java.lang.Object obj27 = hashMap15.remove((java.lang.Object) hashMap18);
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        boolean boolean29 = hashMap28.isEmpty();
        boolean boolean30 = hashMap28.isEmpty();
        system.testclass.HashMap.Entry[] entryArray31 = hashMap28.table;
        java.lang.Object obj32 = hashMap15.remove((java.lang.Object) entryArray31);
        java.lang.Object obj33 = hashMap7.get((java.lang.Object) hashMap15);
        java.lang.Object obj34 = hashMap1.put((java.lang.Object) hashMap2, (java.lang.Object) hashMap15);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        java.lang.Object obj4 = hashMap0.get((java.lang.Object) 10);
        boolean boolean5 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap(0);
        int int8 = hashMap7.size();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        hashMap9.modCount = 0;
        int int12 = hashMap9.modCount;
        int int13 = hashMap9.modCount;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray15 = new system.testclass.HashMap.Entry[] {};
        hashMap14.table = entryArray15;
        hashMap9.table = entryArray15;
        java.lang.Object obj18 = hashMap7.get((java.lang.Object) hashMap9);
        java.lang.Object obj20 = hashMap7.get((java.lang.Object) false);
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        int int22 = hashMap21.modCount;
        int int23 = hashMap21.modCount;
        java.lang.Object obj24 = null;
        java.lang.Object obj25 = hashMap21.remove(obj24);
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        int int27 = hashMap26.modCount;
        int int28 = hashMap26.modCount;
        int int29 = hashMap26.modCount;
        int int30 = hashMap26.size();
        system.testclass.HashMap.Entry[] entryArray31 = hashMap26.table;
        hashMap21.table = entryArray31;
        java.lang.Object obj33 = hashMap0.put((java.lang.Object) hashMap7, (java.lang.Object) entryArray31);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) 'a', (float) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray5 = hashMap4.table;
        hashMap0.table = entryArray5;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        boolean boolean3 = hashMap0.isEmpty();
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 1, (float) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(1);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        hashMap4.modCount = 0;
        int int7 = hashMap4.modCount;
        int int8 = hashMap4.modCount;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray10 = new system.testclass.HashMap.Entry[] {};
        hashMap9.table = entryArray10;
        hashMap4.table = entryArray10;
        java.lang.Object obj13 = hashMap1.put((java.lang.Object) hashMap3, (java.lang.Object) entryArray10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 10, (float) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) '#');
        hashMap1.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(100, (float) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        int int3 = hashMap0.size();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap4.table;
        hashMap0.table = entryArray5;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        hashMap8.modCount = 0;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        hashMap11.modCount = 0;
        int int14 = hashMap11.modCount;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        int int17 = hashMap15.modCount;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        hashMap18.modCount = 0;
        int int21 = hashMap18.modCount;
        int int22 = hashMap18.modCount;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray24 = new system.testclass.HashMap.Entry[] {};
        hashMap23.table = entryArray24;
        hashMap18.table = entryArray24;
        java.lang.Object obj27 = hashMap15.remove((java.lang.Object) hashMap18);
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        boolean boolean29 = hashMap28.isEmpty();
        boolean boolean30 = hashMap28.isEmpty();
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray33 = hashMap32.table;
        hashMap28.table = entryArray33;
        hashMap18.table = entryArray33;
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        int int37 = hashMap36.modCount;
        int int38 = hashMap36.modCount;
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        hashMap39.modCount = 0;
        int int42 = hashMap39.modCount;
        int int43 = hashMap39.modCount;
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray45 = new system.testclass.HashMap.Entry[] {};
        hashMap44.table = entryArray45;
        hashMap39.table = entryArray45;
        java.lang.Object obj48 = hashMap36.remove((java.lang.Object) hashMap39);
        system.testclass.HashMap hashMap49 = new system.testclass.HashMap();
        boolean boolean50 = hashMap49.isEmpty();
        boolean boolean51 = hashMap49.isEmpty();
        system.testclass.HashMap hashMap53 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray54 = hashMap53.table;
        hashMap49.table = entryArray54;
        hashMap39.table = entryArray54;
        hashMap18.table = entryArray54;
        hashMap11.table = entryArray54;
        hashMap8.table = entryArray54;
        java.lang.Object obj60 = hashMap0.put((java.lang.Object) false, (java.lang.Object) entryArray54);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        int int3 = hashMap0.modCount;
        int int4 = hashMap0.size();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray6 = hashMap5.table;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        int int9 = hashMap7.modCount;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        hashMap10.modCount = 0;
        int int13 = hashMap10.modCount;
        int int14 = hashMap10.modCount;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray16 = new system.testclass.HashMap.Entry[] {};
        hashMap15.table = entryArray16;
        hashMap10.table = entryArray16;
        java.lang.Object obj19 = hashMap7.remove((java.lang.Object) hashMap10);
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        boolean boolean21 = hashMap20.isEmpty();
        boolean boolean22 = hashMap20.isEmpty();
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray25 = hashMap24.table;
        hashMap20.table = entryArray25;
        hashMap10.table = entryArray25;
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        int int29 = hashMap28.modCount;
        int int30 = hashMap28.modCount;
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        hashMap31.modCount = 0;
        int int34 = hashMap31.modCount;
        int int35 = hashMap31.modCount;
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray37 = new system.testclass.HashMap.Entry[] {};
        hashMap36.table = entryArray37;
        hashMap31.table = entryArray37;
        java.lang.Object obj40 = hashMap28.remove((java.lang.Object) hashMap31);
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        boolean boolean42 = hashMap41.isEmpty();
        boolean boolean43 = hashMap41.isEmpty();
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray46 = hashMap45.table;
        hashMap41.table = entryArray46;
        hashMap31.table = entryArray46;
        hashMap10.table = entryArray46;
        hashMap5.table = entryArray46;
        java.lang.Object obj52 = hashMap0.put((java.lang.Object) hashMap5, (java.lang.Object) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray2 = hashMap1.table;
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) 'a', (float) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        boolean boolean7 = hashMap4.isEmpty();
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) hashMap4);
        hashMap0.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap2.table;
        java.lang.Object obj4 = hashMap1.remove((java.lang.Object) hashMap2);
        int int5 = hashMap1.modCount;
        int int6 = hashMap1.size();
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap2.table;
        java.lang.Object obj4 = hashMap1.remove((java.lang.Object) hashMap2);
        boolean boolean5 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        boolean boolean9 = hashMap7.isEmpty();
        system.testclass.HashMap.Entry[] entryArray10 = hashMap7.table;
        hashMap6.table = entryArray10;
        java.lang.Object obj12 = hashMap2.remove((java.lang.Object) hashMap6);
        int int13 = hashMap6.modCount;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.modCount;
        int int16 = hashMap14.modCount;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        hashMap17.modCount = 0;
        int int20 = hashMap17.modCount;
        int int21 = hashMap17.modCount;
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray23 = new system.testclass.HashMap.Entry[] {};
        hashMap22.table = entryArray23;
        hashMap17.table = entryArray23;
        java.lang.Object obj26 = hashMap14.remove((java.lang.Object) hashMap17);
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        boolean boolean28 = hashMap27.isEmpty();
        boolean boolean29 = hashMap27.isEmpty();
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray32 = hashMap31.table;
        hashMap27.table = entryArray32;
        hashMap17.table = entryArray32;
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        int int36 = hashMap35.modCount;
        int int37 = hashMap35.modCount;
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        hashMap38.modCount = 0;
        int int41 = hashMap38.modCount;
        int int42 = hashMap38.modCount;
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray44 = new system.testclass.HashMap.Entry[] {};
        hashMap43.table = entryArray44;
        hashMap38.table = entryArray44;
        java.lang.Object obj47 = hashMap35.remove((java.lang.Object) hashMap38);
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap();
        boolean boolean49 = hashMap48.isEmpty();
        boolean boolean50 = hashMap48.isEmpty();
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray53 = hashMap52.table;
        hashMap48.table = entryArray53;
        hashMap38.table = entryArray53;
        hashMap17.table = entryArray53;
        system.testclass.HashMap.Entry[] entryArray57 = hashMap17.table;
        java.lang.Object obj58 = hashMap6.get((java.lang.Object) hashMap17);
        hashMap6.modCount = (byte) 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap6", hashMap6.repOK_1());
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 10, (float) (byte) 10);
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
        hashMap3.modCount = 0;
        int int6 = hashMap3.modCount;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        int int9 = hashMap7.modCount;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        hashMap10.modCount = 0;
        int int13 = hashMap10.modCount;
        int int14 = hashMap10.modCount;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray16 = new system.testclass.HashMap.Entry[] {};
        hashMap15.table = entryArray16;
        hashMap10.table = entryArray16;
        java.lang.Object obj19 = hashMap7.remove((java.lang.Object) hashMap10);
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        boolean boolean21 = hashMap20.isEmpty();
        boolean boolean22 = hashMap20.isEmpty();
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray25 = hashMap24.table;
        hashMap20.table = entryArray25;
        hashMap10.table = entryArray25;
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        int int29 = hashMap28.modCount;
        int int30 = hashMap28.modCount;
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        hashMap31.modCount = 0;
        int int34 = hashMap31.modCount;
        int int35 = hashMap31.modCount;
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray37 = new system.testclass.HashMap.Entry[] {};
        hashMap36.table = entryArray37;
        hashMap31.table = entryArray37;
        java.lang.Object obj40 = hashMap28.remove((java.lang.Object) hashMap31);
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        boolean boolean42 = hashMap41.isEmpty();
        boolean boolean43 = hashMap41.isEmpty();
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray46 = hashMap45.table;
        hashMap41.table = entryArray46;
        hashMap31.table = entryArray46;
        hashMap10.table = entryArray46;
        hashMap3.table = entryArray46;
        hashMap0.table = entryArray46;
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap();
        int int53 = hashMap52.modCount;
        int int54 = hashMap52.modCount;
        int int55 = hashMap52.modCount;
        int int56 = hashMap52.size();
        boolean boolean57 = hashMap52.isEmpty();
        java.lang.Object obj58 = null;
        java.lang.Object obj59 = hashMap0.put((java.lang.Object) hashMap52, obj58);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        hashMap6.modCount = 0;
        int int9 = hashMap6.modCount;
        int int10 = hashMap6.modCount;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray12 = new system.testclass.HashMap.Entry[] {};
        hashMap11.table = entryArray12;
        hashMap6.table = entryArray12;
        java.lang.Object obj15 = hashMap3.remove((java.lang.Object) hashMap6);
        int int16 = hashMap3.modCount;
        java.lang.Object obj17 = hashMap0.get((java.lang.Object) int16);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        boolean boolean19 = hashMap18.isEmpty();
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        int int21 = hashMap20.modCount;
        java.lang.Object obj23 = hashMap20.get((java.lang.Object) 100L);
        system.testclass.HashMap.Entry[] entryArray24 = hashMap20.table;
        hashMap18.table = entryArray24;
        java.lang.Object obj26 = hashMap0.get((java.lang.Object) entryArray24);
        hashMap0.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap2.table;
        java.lang.Object obj4 = hashMap1.remove((java.lang.Object) hashMap2);
        int int5 = hashMap1.modCount;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        boolean boolean8 = hashMap6.isEmpty();
        int int9 = hashMap6.size();
        int int10 = hashMap6.modCount;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap(100);
        java.lang.Object obj13 = hashMap6.remove((java.lang.Object) 100);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray16 = hashMap15.table;
        boolean boolean17 = hashMap15.isEmpty();
        system.testclass.HashMap.Entry[] entryArray18 = hashMap15.table;
        java.lang.Object obj19 = hashMap1.put((java.lang.Object) 100, (java.lang.Object) entryArray18);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 1, (float) 100L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap();
        boolean boolean2 = hashMap1.isEmpty();
        boolean boolean3 = hashMap1.isEmpty();
        system.testclass.HashMap.Entry[] entryArray4 = hashMap1.table;
        hashMap0.table = entryArray4;
        int int6 = hashMap0.modCount;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        int int9 = hashMap7.modCount;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        hashMap10.modCount = 0;
        int int13 = hashMap10.modCount;
        int int14 = hashMap10.modCount;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray16 = new system.testclass.HashMap.Entry[] {};
        hashMap15.table = entryArray16;
        hashMap10.table = entryArray16;
        java.lang.Object obj19 = hashMap7.remove((java.lang.Object) hashMap10);
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        boolean boolean21 = hashMap20.isEmpty();
        boolean boolean22 = hashMap20.isEmpty();
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray25 = hashMap24.table;
        hashMap20.table = entryArray25;
        hashMap10.table = entryArray25;
        java.lang.Object obj29 = hashMap10.get((java.lang.Object) 0.0f);
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        hashMap30.modCount = 0;
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        hashMap33.modCount = 0;
        int int36 = hashMap33.modCount;
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        int int38 = hashMap37.modCount;
        int int39 = hashMap37.modCount;
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        hashMap40.modCount = 0;
        int int43 = hashMap40.modCount;
        int int44 = hashMap40.modCount;
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray46 = new system.testclass.HashMap.Entry[] {};
        hashMap45.table = entryArray46;
        hashMap40.table = entryArray46;
        java.lang.Object obj49 = hashMap37.remove((java.lang.Object) hashMap40);
        system.testclass.HashMap hashMap50 = new system.testclass.HashMap();
        boolean boolean51 = hashMap50.isEmpty();
        boolean boolean52 = hashMap50.isEmpty();
        system.testclass.HashMap hashMap54 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray55 = hashMap54.table;
        hashMap50.table = entryArray55;
        hashMap40.table = entryArray55;
        system.testclass.HashMap hashMap58 = new system.testclass.HashMap();
        int int59 = hashMap58.modCount;
        int int60 = hashMap58.modCount;
        system.testclass.HashMap hashMap61 = new system.testclass.HashMap();
        hashMap61.modCount = 0;
        int int64 = hashMap61.modCount;
        int int65 = hashMap61.modCount;
        system.testclass.HashMap hashMap66 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray67 = new system.testclass.HashMap.Entry[] {};
        hashMap66.table = entryArray67;
        hashMap61.table = entryArray67;
        java.lang.Object obj70 = hashMap58.remove((java.lang.Object) hashMap61);
        system.testclass.HashMap hashMap71 = new system.testclass.HashMap();
        boolean boolean72 = hashMap71.isEmpty();
        boolean boolean73 = hashMap71.isEmpty();
        system.testclass.HashMap hashMap75 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray76 = hashMap75.table;
        hashMap71.table = entryArray76;
        hashMap61.table = entryArray76;
        hashMap40.table = entryArray76;
        hashMap33.table = entryArray76;
        hashMap30.table = entryArray76;
        java.lang.Object obj82 = hashMap0.put((java.lang.Object) 0.0f, (java.lang.Object) entryArray76);
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
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        hashMap3.modCount = 0;
        int int6 = hashMap3.modCount;
        int int7 = hashMap3.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray9 = new system.testclass.HashMap.Entry[] {};
        hashMap8.table = entryArray9;
        hashMap3.table = entryArray9;
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap3);
        int int13 = hashMap0.modCount;
        int int14 = hashMap0.size();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        int int17 = hashMap15.modCount;
        boolean boolean18 = hashMap15.isEmpty();
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray20 = hashMap19.table;
        hashMap15.table = entryArray20;
        hashMap0.table = entryArray20;
        java.lang.Object obj24 = hashMap0.remove((java.lang.Object) (byte) 10);
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        hashMap6.modCount = 0;
        int int9 = hashMap6.modCount;
        int int10 = hashMap6.modCount;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray12 = new system.testclass.HashMap.Entry[] {};
        hashMap11.table = entryArray12;
        hashMap6.table = entryArray12;
        java.lang.Object obj15 = hashMap3.remove((java.lang.Object) hashMap6);
        int int16 = hashMap3.modCount;
        java.lang.Object obj17 = hashMap0.get((java.lang.Object) int16);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        boolean boolean19 = hashMap18.isEmpty();
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        int int21 = hashMap20.modCount;
        java.lang.Object obj23 = hashMap20.get((java.lang.Object) 100L);
        system.testclass.HashMap.Entry[] entryArray24 = hashMap20.table;
        hashMap18.table = entryArray24;
        java.lang.Object obj26 = hashMap0.get((java.lang.Object) entryArray24);
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        boolean boolean28 = hashMap27.isEmpty();
        boolean boolean29 = hashMap27.isEmpty();
        system.testclass.HashMap.Entry[] entryArray30 = hashMap27.table;
        java.lang.Object obj31 = hashMap0.remove((java.lang.Object) entryArray30);
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        boolean boolean33 = hashMap32.isEmpty();
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap(0);
        java.lang.Object obj36 = hashMap32.get((java.lang.Object) hashMap35);
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        boolean boolean38 = hashMap37.isEmpty();
        boolean boolean39 = hashMap37.isEmpty();
        int int40 = hashMap37.size();
        int int41 = hashMap37.modCount;
        system.testclass.HashMap.Entry[] entryArray42 = hashMap37.table;
        java.lang.Object obj43 = hashMap0.put(obj36, (java.lang.Object) hashMap37);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 100);
        int int2 = hashMap1.size();
        int int3 = hashMap1.size();
        hashMap1.modCount = '#';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 1);
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) '4');
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) 100L);
        int int4 = hashMap0.modCount;
        boolean boolean5 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.modCount;
        java.lang.Object obj9 = hashMap6.get((java.lang.Object) 100L);
        int int10 = hashMap6.modCount;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap(0);
        int int13 = hashMap12.size();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        hashMap14.modCount = 0;
        int int17 = hashMap14.modCount;
        int int18 = hashMap14.modCount;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray20 = new system.testclass.HashMap.Entry[] {};
        hashMap19.table = entryArray20;
        hashMap14.table = entryArray20;
        java.lang.Object obj23 = hashMap12.get((java.lang.Object) hashMap14);
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.modCount;
        int int26 = hashMap24.modCount;
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        hashMap27.modCount = 0;
        int int30 = hashMap27.modCount;
        int int31 = hashMap27.modCount;
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray33 = new system.testclass.HashMap.Entry[] {};
        hashMap32.table = entryArray33;
        hashMap27.table = entryArray33;
        java.lang.Object obj36 = hashMap24.remove((java.lang.Object) hashMap27);
        int int37 = hashMap24.modCount;
        int int38 = hashMap24.size();
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        int int40 = hashMap39.modCount;
        int int41 = hashMap39.modCount;
        boolean boolean42 = hashMap39.isEmpty();
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray44 = hashMap43.table;
        hashMap39.table = entryArray44;
        hashMap24.table = entryArray44;
        java.lang.Object obj47 = hashMap12.remove((java.lang.Object) entryArray44);
        java.lang.Object obj48 = hashMap0.put((java.lang.Object) int10, (java.lang.Object) entryArray44);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        int int2 = hashMap1.size();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap1.table;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        hashMap7.modCount = 0;
        int int10 = hashMap7.modCount;
        int int11 = hashMap7.modCount;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray13 = new system.testclass.HashMap.Entry[] {};
        hashMap12.table = entryArray13;
        hashMap7.table = entryArray13;
        java.lang.Object obj16 = hashMap4.remove((java.lang.Object) hashMap7);
        int int17 = hashMap7.modCount;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        int int19 = hashMap18.modCount;
        int int20 = hashMap18.modCount;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        hashMap21.modCount = 0;
        int int24 = hashMap21.modCount;
        int int25 = hashMap21.modCount;
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray27 = new system.testclass.HashMap.Entry[] {};
        hashMap26.table = entryArray27;
        hashMap21.table = entryArray27;
        java.lang.Object obj30 = hashMap18.remove((java.lang.Object) hashMap21);
        int int31 = hashMap18.modCount;
        int int32 = hashMap18.size();
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        int int34 = hashMap33.modCount;
        int int35 = hashMap33.modCount;
        boolean boolean36 = hashMap33.isEmpty();
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray38 = hashMap37.table;
        hashMap33.table = entryArray38;
        hashMap18.table = entryArray38;
        boolean boolean41 = hashMap18.isEmpty();
        java.lang.Object obj42 = hashMap1.put((java.lang.Object) hashMap7, (java.lang.Object) hashMap18);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 100);
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        hashMap6.modCount = 0;
        int int9 = hashMap6.modCount;
        int int10 = hashMap6.modCount;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray12 = new system.testclass.HashMap.Entry[] {};
        hashMap11.table = entryArray12;
        hashMap6.table = entryArray12;
        java.lang.Object obj15 = hashMap3.remove((java.lang.Object) hashMap6);
        int int16 = hashMap3.modCount;
        java.lang.Object obj17 = hashMap0.get((java.lang.Object) int16);
        int int18 = hashMap0.modCount;
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap(0);
        int int21 = hashMap20.size();
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        hashMap22.modCount = 0;
        int int25 = hashMap22.modCount;
        int int26 = hashMap22.modCount;
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray28 = new system.testclass.HashMap.Entry[] {};
        hashMap27.table = entryArray28;
        hashMap22.table = entryArray28;
        java.lang.Object obj31 = hashMap20.get((java.lang.Object) hashMap22);
        system.testclass.HashMap.Entry[] entryArray32 = hashMap20.table;
        hashMap0.table = entryArray32;
        hashMap0.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        int int3 = hashMap0.modCount;
        int int4 = hashMap0.modCount;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        int int8 = hashMap5.modCount;
        int int9 = hashMap5.size();
        java.lang.Object obj10 = hashMap0.get((java.lang.Object) int9);
        int int11 = hashMap0.modCount;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        hashMap3.modCount = 0;
        int int6 = hashMap3.modCount;
        int int7 = hashMap3.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray9 = new system.testclass.HashMap.Entry[] {};
        hashMap8.table = entryArray9;
        hashMap3.table = entryArray9;
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap3);
        int int13 = hashMap0.modCount;
        int int14 = hashMap0.size();
        boolean boolean15 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray17 = new system.testclass.HashMap.Entry[] {};
        hashMap16.table = entryArray17;
        system.testclass.HashMap.Entry[] entryArray19 = hashMap16.table;
        java.lang.Object obj20 = hashMap0.remove((java.lang.Object) entryArray19);
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        int int22 = hashMap21.modCount;
        int int23 = hashMap21.modCount;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.modCount;
        int int26 = hashMap24.modCount;
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        hashMap27.modCount = 0;
        int int30 = hashMap27.modCount;
        int int31 = hashMap27.modCount;
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray33 = new system.testclass.HashMap.Entry[] {};
        hashMap32.table = entryArray33;
        hashMap27.table = entryArray33;
        java.lang.Object obj36 = hashMap24.remove((java.lang.Object) hashMap27);
        int int37 = hashMap24.modCount;
        java.lang.Object obj38 = hashMap21.get((java.lang.Object) int37);
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        boolean boolean40 = hashMap39.isEmpty();
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        int int42 = hashMap41.modCount;
        java.lang.Object obj44 = hashMap41.get((java.lang.Object) 100L);
        system.testclass.HashMap.Entry[] entryArray45 = hashMap41.table;
        hashMap39.table = entryArray45;
        java.lang.Object obj47 = hashMap21.get((java.lang.Object) entryArray45);
        java.lang.Object obj48 = hashMap0.remove((java.lang.Object) hashMap21);
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 10, (float) (byte) 1);
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
        boolean boolean3 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap4.table;
        hashMap0.table = entryArray5;
        hashMap0.modCount = 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(10, (float) 10L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap2.table;
        java.lang.Object obj4 = hashMap1.remove((java.lang.Object) hashMap2);
        boolean boolean5 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.modCount;
        int int8 = hashMap6.modCount;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        hashMap9.modCount = 0;
        int int12 = hashMap9.modCount;
        int int13 = hashMap9.modCount;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray15 = new system.testclass.HashMap.Entry[] {};
        hashMap14.table = entryArray15;
        hashMap9.table = entryArray15;
        java.lang.Object obj18 = hashMap6.remove((java.lang.Object) hashMap9);
        java.lang.Object obj19 = hashMap2.get((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        hashMap20.modCount = 0;
        int int23 = hashMap20.modCount;
        int int24 = hashMap20.modCount;
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray26 = new system.testclass.HashMap.Entry[] {};
        hashMap25.table = entryArray26;
        hashMap20.table = entryArray26;
        hashMap6.table = entryArray26;
        hashMap6.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap6", hashMap6.repOK_1());
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        int int3 = hashMap0.size();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap4.table;
        hashMap0.table = entryArray5;
        boolean boolean7 = hashMap0.isEmpty();
        hashMap0.modCount = '4';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        hashMap3.modCount = 0;
        int int6 = hashMap3.modCount;
        int int7 = hashMap3.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray9 = new system.testclass.HashMap.Entry[] {};
        hashMap8.table = entryArray9;
        hashMap3.table = entryArray9;
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap3);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        boolean boolean14 = hashMap13.isEmpty();
        boolean boolean15 = hashMap13.isEmpty();
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray18 = hashMap17.table;
        hashMap13.table = entryArray18;
        hashMap3.table = entryArray18;
        int int21 = hashMap3.size();
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        int int23 = hashMap22.modCount;
        java.lang.Object obj25 = hashMap22.get((java.lang.Object) 100L);
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        int int27 = hashMap26.modCount;
        int int28 = hashMap26.modCount;
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        int int30 = hashMap29.modCount;
        int int31 = hashMap29.modCount;
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        hashMap32.modCount = 0;
        int int35 = hashMap32.modCount;
        int int36 = hashMap32.modCount;
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray38 = new system.testclass.HashMap.Entry[] {};
        hashMap37.table = entryArray38;
        hashMap32.table = entryArray38;
        java.lang.Object obj41 = hashMap29.remove((java.lang.Object) hashMap32);
        int int42 = hashMap29.modCount;
        java.lang.Object obj43 = hashMap26.get((java.lang.Object) int42);
        int int44 = hashMap26.modCount;
        system.testclass.HashMap hashMap46 = new system.testclass.HashMap(0);
        int int47 = hashMap46.size();
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap();
        hashMap48.modCount = 0;
        int int51 = hashMap48.modCount;
        int int52 = hashMap48.modCount;
        system.testclass.HashMap hashMap53 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray54 = new system.testclass.HashMap.Entry[] {};
        hashMap53.table = entryArray54;
        hashMap48.table = entryArray54;
        java.lang.Object obj57 = hashMap46.get((java.lang.Object) hashMap48);
        system.testclass.HashMap.Entry[] entryArray58 = hashMap46.table;
        hashMap26.table = entryArray58;
        java.lang.Object obj60 = hashMap22.get((java.lang.Object) entryArray58);
        system.testclass.HashMap hashMap61 = new system.testclass.HashMap();
        int int62 = hashMap61.modCount;
        int int63 = hashMap61.modCount;
        system.testclass.HashMap hashMap65 = new system.testclass.HashMap(0);
        int int66 = hashMap65.size();
        system.testclass.HashMap.Entry[] entryArray67 = hashMap65.table;
        hashMap61.table = entryArray67;
        java.lang.Object obj69 = hashMap3.put(obj60, (java.lang.Object) entryArray67);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap3", hashMap3.repOK_1());
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', 10.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) ' ', (float) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
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
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        int int3 = hashMap0.modCount;
        int int4 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap0.table;
        boolean boolean6 = hashMap0.isEmpty();
        hashMap0.modCount = 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap2.table;
        java.lang.Object obj4 = hashMap1.remove((java.lang.Object) hashMap2);
        boolean boolean5 = hashMap2.isEmpty();
        hashMap2.modCount = (byte) 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) 100L);
        int int4 = hashMap0.modCount;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 0, (float) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        java.lang.Object obj4 = hashMap0.get((java.lang.Object) 10);
        boolean boolean5 = hashMap0.isEmpty();
        hashMap0.modCount = '#';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap2.table;
        java.lang.Object obj4 = hashMap1.remove((java.lang.Object) hashMap2);
        boolean boolean5 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        boolean boolean9 = hashMap7.isEmpty();
        system.testclass.HashMap.Entry[] entryArray10 = hashMap7.table;
        hashMap6.table = entryArray10;
        java.lang.Object obj12 = hashMap2.remove((java.lang.Object) hashMap6);
        hashMap6.modCount = (short) 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap6", hashMap6.repOK_1());
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        int int3 = hashMap0.modCount;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        hashMap7.modCount = 0;
        int int10 = hashMap7.modCount;
        int int11 = hashMap7.modCount;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray13 = new system.testclass.HashMap.Entry[] {};
        hashMap12.table = entryArray13;
        hashMap7.table = entryArray13;
        java.lang.Object obj16 = hashMap4.remove((java.lang.Object) hashMap7);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        boolean boolean18 = hashMap17.isEmpty();
        boolean boolean19 = hashMap17.isEmpty();
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray22 = hashMap21.table;
        hashMap17.table = entryArray22;
        hashMap7.table = entryArray22;
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        hashMap25.modCount = 0;
        int int28 = hashMap25.modCount;
        int int29 = hashMap25.modCount;
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray31 = new system.testclass.HashMap.Entry[] {};
        hashMap30.table = entryArray31;
        hashMap25.table = entryArray31;
        hashMap7.table = entryArray31;
        hashMap0.table = entryArray31;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap();
        int int2 = hashMap1.modCount;
        int int3 = hashMap1.modCount;
        boolean boolean4 = hashMap1.isEmpty();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap1.table;
        hashMap0.table = entryArray5;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap(10);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        int int11 = hashMap9.modCount;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        hashMap12.modCount = 0;
        int int15 = hashMap12.modCount;
        int int16 = hashMap12.modCount;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray18 = new system.testclass.HashMap.Entry[] {};
        hashMap17.table = entryArray18;
        hashMap12.table = entryArray18;
        java.lang.Object obj21 = hashMap9.remove((java.lang.Object) hashMap12);
        int int22 = hashMap9.modCount;
        int int23 = hashMap9.size();
        boolean boolean24 = hashMap9.isEmpty();
        boolean boolean25 = hashMap9.isEmpty();
        system.testclass.HashMap.Entry[] entryArray26 = hashMap9.table;
        java.lang.Object obj27 = hashMap0.put((java.lang.Object) 10, (java.lang.Object) entryArray26);
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
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        hashMap3.modCount = 0;
        int int6 = hashMap3.modCount;
        int int7 = hashMap3.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray9 = new system.testclass.HashMap.Entry[] {};
        hashMap8.table = entryArray9;
        hashMap3.table = entryArray9;
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap3);
        int int13 = hashMap0.modCount;
        int int14 = hashMap0.size();
        boolean boolean15 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray17 = new system.testclass.HashMap.Entry[] {};
        hashMap16.table = entryArray17;
        system.testclass.HashMap.Entry[] entryArray19 = hashMap16.table;
        java.lang.Object obj20 = hashMap0.remove((java.lang.Object) entryArray19);
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        int int22 = hashMap21.modCount;
        int int23 = hashMap21.modCount;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.modCount;
        int int26 = hashMap24.modCount;
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        hashMap27.modCount = 0;
        int int30 = hashMap27.modCount;
        int int31 = hashMap27.modCount;
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray33 = new system.testclass.HashMap.Entry[] {};
        hashMap32.table = entryArray33;
        hashMap27.table = entryArray33;
        java.lang.Object obj36 = hashMap24.remove((java.lang.Object) hashMap27);
        int int37 = hashMap24.modCount;
        java.lang.Object obj38 = hashMap21.get((java.lang.Object) int37);
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        boolean boolean40 = hashMap39.isEmpty();
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        int int42 = hashMap41.modCount;
        java.lang.Object obj44 = hashMap41.get((java.lang.Object) 100L);
        system.testclass.HashMap.Entry[] entryArray45 = hashMap41.table;
        hashMap39.table = entryArray45;
        java.lang.Object obj47 = hashMap21.get((java.lang.Object) entryArray45);
        java.lang.Object obj48 = hashMap0.remove((java.lang.Object) hashMap21);
        hashMap21.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap21", hashMap21.repOK_1());
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        int int3 = hashMap0.modCount;
        int int4 = hashMap0.modCount;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray6 = new system.testclass.HashMap.Entry[] {};
        hashMap5.table = entryArray6;
        hashMap0.table = entryArray6;
        system.testclass.HashMap.Entry[] entryArray9 = hashMap0.table;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap2.table;
        java.lang.Object obj4 = hashMap1.remove((java.lang.Object) hashMap2);
        boolean boolean5 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        boolean boolean9 = hashMap7.isEmpty();
        system.testclass.HashMap.Entry[] entryArray10 = hashMap7.table;
        hashMap6.table = entryArray10;
        java.lang.Object obj12 = hashMap2.remove((java.lang.Object) hashMap6);
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap2.table;
        java.lang.Object obj4 = hashMap1.remove((java.lang.Object) hashMap2);
        system.testclass.HashMap.Entry[] entryArray5 = new system.testclass.HashMap.Entry[] {};
        hashMap1.table = entryArray5;
        hashMap1.modCount = (byte) 0;
        hashMap1.modCount = '4';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        int int3 = hashMap0.size();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        boolean boolean6 = hashMap4.isEmpty();
        system.testclass.HashMap.Entry[] entryArray7 = hashMap4.table;
        hashMap0.table = entryArray7;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        java.lang.Object obj4 = hashMap0.get((java.lang.Object) 10);
        java.lang.Object obj6 = hashMap0.remove((java.lang.Object) 'a');
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        int int3 = hashMap0.modCount;
        int int4 = hashMap0.modCount;
        java.lang.Object obj6 = hashMap0.remove((java.lang.Object) (short) 10);
        int int7 = hashMap0.modCount;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray10 = hashMap9.table;
        boolean boolean11 = hashMap9.isEmpty();
        system.testclass.HashMap.Entry[] entryArray12 = hashMap9.table;
        hashMap0.table = entryArray12;
        java.lang.Object obj14 = null;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        int int17 = hashMap15.modCount;
        boolean boolean18 = hashMap15.isEmpty();
        int int19 = hashMap15.size();
        int int20 = hashMap15.size();
        java.lang.Object obj21 = hashMap0.put(obj14, (java.lang.Object) hashMap15);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap(0);
        java.lang.Object obj4 = hashMap0.get((java.lang.Object) hashMap3);
        hashMap3.modCount = ' ';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap3", hashMap3.repOK_1());
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray1 = hashMap0.table;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray1 = hashMap0.table;
        hashMap0.modCount = (short) 0;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        java.lang.Object obj7 = hashMap4.get((java.lang.Object) 100L);
        java.lang.Object obj9 = hashMap4.get((java.lang.Object) 10);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap((int) (byte) 0);
        boolean boolean12 = hashMap11.isEmpty();
        system.testclass.HashMap.Entry[] entryArray13 = hashMap11.table;
        java.lang.Object obj14 = hashMap0.put((java.lang.Object) hashMap4, (java.lang.Object) entryArray13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(100, (float) 1L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(1, (float) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        hashMap3.modCount = 0;
        int int6 = hashMap3.modCount;
        int int7 = hashMap3.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray9 = new system.testclass.HashMap.Entry[] {};
        hashMap8.table = entryArray9;
        hashMap3.table = entryArray9;
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap3);
        int int13 = hashMap0.modCount;
        int int14 = hashMap0.size();
        boolean boolean15 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray17 = new system.testclass.HashMap.Entry[] {};
        hashMap16.table = entryArray17;
        system.testclass.HashMap.Entry[] entryArray19 = hashMap16.table;
        java.lang.Object obj20 = hashMap0.remove((java.lang.Object) entryArray19);
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        int int22 = hashMap21.modCount;
        int int23 = hashMap21.modCount;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.modCount;
        int int26 = hashMap24.modCount;
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        hashMap27.modCount = 0;
        int int30 = hashMap27.modCount;
        int int31 = hashMap27.modCount;
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray33 = new system.testclass.HashMap.Entry[] {};
        hashMap32.table = entryArray33;
        hashMap27.table = entryArray33;
        java.lang.Object obj36 = hashMap24.remove((java.lang.Object) hashMap27);
        int int37 = hashMap24.modCount;
        java.lang.Object obj38 = hashMap21.get((java.lang.Object) int37);
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        boolean boolean40 = hashMap39.isEmpty();
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        int int42 = hashMap41.modCount;
        java.lang.Object obj44 = hashMap41.get((java.lang.Object) 100L);
        system.testclass.HashMap.Entry[] entryArray45 = hashMap41.table;
        hashMap39.table = entryArray45;
        java.lang.Object obj47 = hashMap21.get((java.lang.Object) entryArray45);
        java.lang.Object obj48 = hashMap0.remove((java.lang.Object) hashMap21);
        hashMap21.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap21", hashMap21.repOK_1());
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap2.table;
        java.lang.Object obj4 = hashMap1.remove((java.lang.Object) hashMap2);
        boolean boolean5 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        boolean boolean9 = hashMap7.isEmpty();
        system.testclass.HashMap.Entry[] entryArray10 = hashMap7.table;
        hashMap6.table = entryArray10;
        java.lang.Object obj12 = hashMap2.remove((java.lang.Object) hashMap6);
        int int13 = hashMap6.modCount;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.modCount;
        int int16 = hashMap14.modCount;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        hashMap17.modCount = 0;
        int int20 = hashMap17.modCount;
        int int21 = hashMap17.modCount;
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray23 = new system.testclass.HashMap.Entry[] {};
        hashMap22.table = entryArray23;
        hashMap17.table = entryArray23;
        java.lang.Object obj26 = hashMap14.remove((java.lang.Object) hashMap17);
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        boolean boolean28 = hashMap27.isEmpty();
        boolean boolean29 = hashMap27.isEmpty();
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray32 = hashMap31.table;
        hashMap27.table = entryArray32;
        hashMap17.table = entryArray32;
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        int int36 = hashMap35.modCount;
        int int37 = hashMap35.modCount;
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        hashMap38.modCount = 0;
        int int41 = hashMap38.modCount;
        int int42 = hashMap38.modCount;
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray44 = new system.testclass.HashMap.Entry[] {};
        hashMap43.table = entryArray44;
        hashMap38.table = entryArray44;
        java.lang.Object obj47 = hashMap35.remove((java.lang.Object) hashMap38);
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap();
        boolean boolean49 = hashMap48.isEmpty();
        boolean boolean50 = hashMap48.isEmpty();
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray53 = hashMap52.table;
        hashMap48.table = entryArray53;
        hashMap38.table = entryArray53;
        hashMap17.table = entryArray53;
        system.testclass.HashMap.Entry[] entryArray57 = hashMap17.table;
        java.lang.Object obj58 = hashMap6.get((java.lang.Object) hashMap17);
        hashMap17.modCount = 'a';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap17", hashMap17.repOK_1());
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        hashMap3.modCount = 0;
        int int6 = hashMap3.modCount;
        int int7 = hashMap3.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray9 = new system.testclass.HashMap.Entry[] {};
        hashMap8.table = entryArray9;
        hashMap3.table = entryArray9;
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap3);
        int int13 = hashMap0.modCount;
        int int14 = hashMap0.size();
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) 100L);
        int int4 = hashMap0.modCount;
        boolean boolean5 = hashMap0.isEmpty();
        int int6 = hashMap0.modCount;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        boolean boolean9 = hashMap7.isEmpty();
        int int10 = hashMap7.size();
        boolean boolean11 = hashMap7.isEmpty();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        int int13 = hashMap12.modCount;
        int int14 = hashMap12.modCount;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        hashMap15.modCount = 0;
        int int18 = hashMap15.modCount;
        int int19 = hashMap15.modCount;
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray21 = new system.testclass.HashMap.Entry[] {};
        hashMap20.table = entryArray21;
        hashMap15.table = entryArray21;
        java.lang.Object obj24 = hashMap12.remove((java.lang.Object) hashMap15);
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        boolean boolean26 = hashMap25.isEmpty();
        boolean boolean27 = hashMap25.isEmpty();
        system.testclass.HashMap.Entry[] entryArray28 = hashMap25.table;
        java.lang.Object obj29 = hashMap12.remove((java.lang.Object) entryArray28);
        system.testclass.HashMap.Entry[] entryArray30 = hashMap12.table;
        java.lang.Object obj31 = hashMap0.put((java.lang.Object) boolean11, (java.lang.Object) entryArray30);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        hashMap3.modCount = 0;
        int int6 = hashMap3.modCount;
        int int7 = hashMap3.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray9 = new system.testclass.HashMap.Entry[] {};
        hashMap8.table = entryArray9;
        hashMap3.table = entryArray9;
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap3);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        boolean boolean14 = hashMap13.isEmpty();
        boolean boolean15 = hashMap13.isEmpty();
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray18 = hashMap17.table;
        hashMap13.table = entryArray18;
        hashMap3.table = entryArray18;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        int int22 = hashMap21.modCount;
        int int23 = hashMap21.modCount;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        hashMap24.modCount = 0;
        int int27 = hashMap24.modCount;
        int int28 = hashMap24.modCount;
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray30 = new system.testclass.HashMap.Entry[] {};
        hashMap29.table = entryArray30;
        hashMap24.table = entryArray30;
        java.lang.Object obj33 = hashMap21.remove((java.lang.Object) hashMap24);
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        boolean boolean35 = hashMap34.isEmpty();
        boolean boolean36 = hashMap34.isEmpty();
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray39 = hashMap38.table;
        hashMap34.table = entryArray39;
        hashMap24.table = entryArray39;
        hashMap3.table = entryArray39;
        boolean boolean43 = hashMap3.isEmpty();
        boolean boolean44 = hashMap3.isEmpty();
        boolean boolean45 = hashMap3.isEmpty();
        hashMap3.modCount = (byte) 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap3", hashMap3.repOK_1());
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 100, (float) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap((int) (byte) 100);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        boolean boolean8 = hashMap5.isEmpty();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray10 = hashMap9.table;
        hashMap5.table = entryArray10;
        java.lang.Class<?> wildcardClass12 = hashMap5.getClass();
        java.lang.Object obj13 = hashMap0.put((java.lang.Object) (byte) 100, (java.lang.Object) wildcardClass12);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray1 = hashMap0.table;
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        int int3 = hashMap2.modCount;
        int int4 = hashMap2.modCount;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        hashMap5.modCount = 0;
        int int8 = hashMap5.modCount;
        int int9 = hashMap5.modCount;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray11 = new system.testclass.HashMap.Entry[] {};
        hashMap10.table = entryArray11;
        hashMap5.table = entryArray11;
        java.lang.Object obj14 = hashMap2.remove((java.lang.Object) hashMap5);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        boolean boolean16 = hashMap15.isEmpty();
        boolean boolean17 = hashMap15.isEmpty();
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray20 = hashMap19.table;
        hashMap15.table = entryArray20;
        hashMap5.table = entryArray20;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        int int24 = hashMap23.modCount;
        int int25 = hashMap23.modCount;
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        hashMap26.modCount = 0;
        int int29 = hashMap26.modCount;
        int int30 = hashMap26.modCount;
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray32 = new system.testclass.HashMap.Entry[] {};
        hashMap31.table = entryArray32;
        hashMap26.table = entryArray32;
        java.lang.Object obj35 = hashMap23.remove((java.lang.Object) hashMap26);
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        boolean boolean37 = hashMap36.isEmpty();
        boolean boolean38 = hashMap36.isEmpty();
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray41 = hashMap40.table;
        hashMap36.table = entryArray41;
        hashMap26.table = entryArray41;
        hashMap5.table = entryArray41;
        hashMap0.table = entryArray41;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) 100L);
        int int4 = hashMap0.modCount;
        boolean boolean5 = hashMap0.isEmpty();
        boolean boolean6 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        boolean boolean10 = hashMap8.isEmpty();
        system.testclass.HashMap.Entry[] entryArray11 = hashMap8.table;
        hashMap7.table = entryArray11;
        int int13 = hashMap7.modCount;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap(1);
        java.lang.Class<?> wildcardClass16 = hashMap15.getClass();
        java.lang.Object obj17 = hashMap0.put((java.lang.Object) hashMap7, (java.lang.Object) hashMap15);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        java.lang.Object obj3 = hashMap0.remove((java.lang.Object) (byte) -1);
        hashMap0.modCount = 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = hashMap0.remove(obj3);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        int int8 = hashMap5.modCount;
        int int9 = hashMap5.size();
        system.testclass.HashMap.Entry[] entryArray10 = hashMap5.table;
        hashMap0.table = entryArray10;
        boolean boolean12 = hashMap0.isEmpty();
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        int int3 = hashMap0.size();
        int int4 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray5 = hashMap0.table;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.modCount;
        int int8 = hashMap6.modCount;
        system.testclass.HashMap.Entry[] entryArray9 = hashMap6.table;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.modCount;
        int int12 = hashMap10.modCount;
        boolean boolean13 = hashMap10.isEmpty();
        java.lang.Object obj14 = hashMap6.remove((java.lang.Object) hashMap10);
        java.lang.Class<?> wildcardClass15 = hashMap10.getClass();
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        hashMap16.modCount = 0;
        int int19 = hashMap16.modCount;
        java.lang.Object obj20 = hashMap0.put((java.lang.Object) wildcardClass15, (java.lang.Object) hashMap16);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 1, (float) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap2.table;
        java.lang.Object obj4 = hashMap1.remove((java.lang.Object) hashMap2);
        boolean boolean5 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        boolean boolean9 = hashMap7.isEmpty();
        system.testclass.HashMap.Entry[] entryArray10 = hashMap7.table;
        hashMap6.table = entryArray10;
        java.lang.Object obj12 = hashMap2.remove((java.lang.Object) hashMap6);
        int int13 = hashMap6.modCount;
        hashMap6.modCount = 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap6", hashMap6.repOK_1());
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        int int2 = hashMap1.size();
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        hashMap3.modCount = 0;
        int int6 = hashMap3.modCount;
        int int7 = hashMap3.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray9 = new system.testclass.HashMap.Entry[] {};
        hashMap8.table = entryArray9;
        hashMap3.table = entryArray9;
        java.lang.Object obj12 = hashMap1.get((java.lang.Object) hashMap3);
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 10);
        hashMap1.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap2.table;
        java.lang.Object obj4 = hashMap1.remove((java.lang.Object) hashMap2);
        boolean boolean5 = hashMap2.isEmpty();
        hashMap2.modCount = '4';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = hashMap0.remove(obj3);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        int int8 = hashMap5.modCount;
        int int9 = hashMap5.size();
        system.testclass.HashMap.Entry[] entryArray10 = hashMap5.table;
        hashMap0.table = entryArray10;
        java.lang.Object obj14 = hashMap0.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1.0d));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, 10.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        int int3 = hashMap0.size();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap4.table;
        hashMap0.table = entryArray5;
        int int7 = hashMap0.modCount;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        hashMap3.modCount = 0;
        int int6 = hashMap3.modCount;
        int int7 = hashMap3.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray9 = new system.testclass.HashMap.Entry[] {};
        hashMap8.table = entryArray9;
        hashMap3.table = entryArray9;
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap3);
        int int13 = hashMap3.size();
        hashMap3.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap3", hashMap3.repOK_1());
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        hashMap3.modCount = 0;
        int int6 = hashMap3.modCount;
        int int7 = hashMap3.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray9 = new system.testclass.HashMap.Entry[] {};
        hashMap8.table = entryArray9;
        hashMap3.table = entryArray9;
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap3);
        hashMap0.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        int int3 = hashMap0.modCount;
        int int4 = hashMap0.modCount;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray6 = new system.testclass.HashMap.Entry[] {};
        hashMap5.table = entryArray6;
        hashMap0.table = entryArray6;
        system.testclass.HashMap.Entry[] entryArray9 = hashMap0.table;
        hashMap0.modCount = (byte) 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 1);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        int int3 = hashMap2.modCount;
        int int4 = hashMap2.modCount;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        hashMap5.modCount = 0;
        int int8 = hashMap5.modCount;
        int int9 = hashMap5.modCount;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray11 = new system.testclass.HashMap.Entry[] {};
        hashMap10.table = entryArray11;
        hashMap5.table = entryArray11;
        java.lang.Object obj14 = hashMap2.remove((java.lang.Object) hashMap5);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        boolean boolean16 = hashMap15.isEmpty();
        boolean boolean17 = hashMap15.isEmpty();
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray20 = hashMap19.table;
        hashMap15.table = entryArray20;
        hashMap5.table = entryArray20;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        hashMap23.modCount = 0;
        int int26 = hashMap23.modCount;
        int int27 = hashMap23.size();
        java.lang.Object obj28 = hashMap1.put((java.lang.Object) hashMap5, (java.lang.Object) hashMap23);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        hashMap3.modCount = 0;
        int int6 = hashMap3.modCount;
        int int7 = hashMap3.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray9 = new system.testclass.HashMap.Entry[] {};
        hashMap8.table = entryArray9;
        hashMap3.table = entryArray9;
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap3);
        int int13 = hashMap3.modCount;
        hashMap3.modCount = (byte) 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap3", hashMap3.repOK_1());
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        int int3 = hashMap0.size();
        int int4 = hashMap0.modCount;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap(100);
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) 100);
        system.testclass.HashMap.Entry[] entryArray8 = hashMap0.table;
        int int9 = hashMap0.size();
        hashMap0.modCount = (byte) 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        boolean boolean3 = hashMap0.isEmpty();
        system.testclass.HashMap.Entry[] entryArray4 = hashMap0.table;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray6 = new system.testclass.HashMap.Entry[] {};
        hashMap5.table = entryArray6;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.modCount;
        int int10 = hashMap8.modCount;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        int int13 = hashMap11.modCount;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        hashMap14.modCount = 0;
        int int17 = hashMap14.modCount;
        int int18 = hashMap14.modCount;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray20 = new system.testclass.HashMap.Entry[] {};
        hashMap19.table = entryArray20;
        hashMap14.table = entryArray20;
        java.lang.Object obj23 = hashMap11.remove((java.lang.Object) hashMap14);
        int int24 = hashMap11.modCount;
        java.lang.Object obj25 = hashMap8.get((java.lang.Object) int24);
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        boolean boolean27 = hashMap26.isEmpty();
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        int int29 = hashMap28.modCount;
        java.lang.Object obj31 = hashMap28.get((java.lang.Object) 100L);
        system.testclass.HashMap.Entry[] entryArray32 = hashMap28.table;
        hashMap26.table = entryArray32;
        java.lang.Object obj34 = hashMap8.get((java.lang.Object) entryArray32);
        hashMap5.table = entryArray32;
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        int int37 = hashMap36.modCount;
        int int38 = hashMap36.modCount;
        java.lang.Object obj40 = hashMap36.get((java.lang.Object) 10);
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        int int42 = hashMap41.modCount;
        int int43 = hashMap41.modCount;
        boolean boolean44 = hashMap41.isEmpty();
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray46 = hashMap45.table;
        hashMap41.table = entryArray46;
        java.lang.Object obj48 = hashMap36.get((java.lang.Object) hashMap41);
        java.lang.Object obj49 = hashMap0.put((java.lang.Object) hashMap5, (java.lang.Object) hashMap36);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        int int3 = hashMap0.modCount;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        hashMap7.modCount = 0;
        int int10 = hashMap7.modCount;
        int int11 = hashMap7.modCount;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray13 = new system.testclass.HashMap.Entry[] {};
        hashMap12.table = entryArray13;
        hashMap7.table = entryArray13;
        java.lang.Object obj16 = hashMap4.remove((java.lang.Object) hashMap7);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        boolean boolean18 = hashMap17.isEmpty();
        boolean boolean19 = hashMap17.isEmpty();
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray22 = hashMap21.table;
        hashMap17.table = entryArray22;
        hashMap7.table = entryArray22;
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        hashMap25.modCount = 0;
        int int28 = hashMap25.modCount;
        int int29 = hashMap25.modCount;
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray31 = new system.testclass.HashMap.Entry[] {};
        hashMap30.table = entryArray31;
        hashMap25.table = entryArray31;
        hashMap7.table = entryArray31;
        hashMap0.table = entryArray31;
        system.testclass.HashMap.Entry[] entryArray36 = hashMap0.table;
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        int int38 = hashMap37.modCount;
        int int39 = hashMap37.modCount;
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        int int41 = hashMap40.modCount;
        int int42 = hashMap40.modCount;
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap();
        hashMap43.modCount = 0;
        int int46 = hashMap43.modCount;
        int int47 = hashMap43.modCount;
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray49 = new system.testclass.HashMap.Entry[] {};
        hashMap48.table = entryArray49;
        hashMap43.table = entryArray49;
        java.lang.Object obj52 = hashMap40.remove((java.lang.Object) hashMap43);
        int int53 = hashMap40.modCount;
        java.lang.Object obj54 = hashMap37.get((java.lang.Object) int53);
        int int55 = hashMap37.modCount;
        system.testclass.HashMap hashMap57 = new system.testclass.HashMap(0);
        int int58 = hashMap57.size();
        system.testclass.HashMap hashMap59 = new system.testclass.HashMap();
        hashMap59.modCount = 0;
        int int62 = hashMap59.modCount;
        int int63 = hashMap59.modCount;
        system.testclass.HashMap hashMap64 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray65 = new system.testclass.HashMap.Entry[] {};
        hashMap64.table = entryArray65;
        hashMap59.table = entryArray65;
        java.lang.Object obj68 = hashMap57.get((java.lang.Object) hashMap59);
        system.testclass.HashMap.Entry[] entryArray69 = hashMap57.table;
        hashMap37.table = entryArray69;
        hashMap0.table = entryArray69;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 1, (float) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        hashMap2.modCount = 0;
        int int5 = hashMap2.modCount;
        int int6 = hashMap2.modCount;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        int int9 = hashMap7.modCount;
        int int10 = hashMap7.modCount;
        int int11 = hashMap7.size();
        java.lang.Object obj12 = hashMap2.get((java.lang.Object) int11);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        hashMap16.modCount = 0;
        int int19 = hashMap16.modCount;
        int int20 = hashMap16.modCount;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray22 = new system.testclass.HashMap.Entry[] {};
        hashMap21.table = entryArray22;
        hashMap16.table = entryArray22;
        java.lang.Object obj25 = hashMap13.remove((java.lang.Object) hashMap16);
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        boolean boolean27 = hashMap26.isEmpty();
        boolean boolean28 = hashMap26.isEmpty();
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray31 = hashMap30.table;
        hashMap26.table = entryArray31;
        hashMap16.table = entryArray31;
        int int34 = hashMap16.size();
        system.testclass.HashMap.Entry[] entryArray35 = hashMap16.table;
        java.lang.Object obj36 = hashMap2.get((java.lang.Object) hashMap16);
        int int37 = hashMap2.modCount;
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        hashMap38.modCount = 0;
        boolean boolean41 = hashMap38.isEmpty();
        int int42 = hashMap38.modCount;
        boolean boolean43 = hashMap38.isEmpty();
        java.lang.Object obj44 = hashMap1.put((java.lang.Object) hashMap2, (java.lang.Object) hashMap38);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        hashMap6.modCount = 0;
        int int9 = hashMap6.modCount;
        int int10 = hashMap6.modCount;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray12 = new system.testclass.HashMap.Entry[] {};
        hashMap11.table = entryArray12;
        hashMap6.table = entryArray12;
        java.lang.Object obj15 = hashMap3.remove((java.lang.Object) hashMap6);
        int int16 = hashMap3.modCount;
        java.lang.Object obj17 = hashMap0.get((java.lang.Object) int16);
        int int18 = hashMap0.modCount;
        int int19 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray20 = hashMap0.table;
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        int int24 = hashMap23.modCount;
        java.lang.Object obj26 = hashMap23.get((java.lang.Object) 100L);
        int int27 = hashMap23.modCount;
        java.lang.Class<?> wildcardClass28 = hashMap23.getClass();
        java.lang.Object obj29 = hashMap22.get((java.lang.Object) hashMap23);
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        hashMap30.modCount = 0;
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        hashMap33.modCount = 0;
        int int36 = hashMap33.modCount;
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        int int38 = hashMap37.modCount;
        int int39 = hashMap37.modCount;
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        hashMap40.modCount = 0;
        int int43 = hashMap40.modCount;
        int int44 = hashMap40.modCount;
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray46 = new system.testclass.HashMap.Entry[] {};
        hashMap45.table = entryArray46;
        hashMap40.table = entryArray46;
        java.lang.Object obj49 = hashMap37.remove((java.lang.Object) hashMap40);
        system.testclass.HashMap hashMap50 = new system.testclass.HashMap();
        boolean boolean51 = hashMap50.isEmpty();
        boolean boolean52 = hashMap50.isEmpty();
        system.testclass.HashMap hashMap54 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray55 = hashMap54.table;
        hashMap50.table = entryArray55;
        hashMap40.table = entryArray55;
        system.testclass.HashMap hashMap58 = new system.testclass.HashMap();
        int int59 = hashMap58.modCount;
        int int60 = hashMap58.modCount;
        system.testclass.HashMap hashMap61 = new system.testclass.HashMap();
        hashMap61.modCount = 0;
        int int64 = hashMap61.modCount;
        int int65 = hashMap61.modCount;
        system.testclass.HashMap hashMap66 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray67 = new system.testclass.HashMap.Entry[] {};
        hashMap66.table = entryArray67;
        hashMap61.table = entryArray67;
        java.lang.Object obj70 = hashMap58.remove((java.lang.Object) hashMap61);
        system.testclass.HashMap hashMap71 = new system.testclass.HashMap();
        boolean boolean72 = hashMap71.isEmpty();
        boolean boolean73 = hashMap71.isEmpty();
        system.testclass.HashMap hashMap75 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray76 = hashMap75.table;
        hashMap71.table = entryArray76;
        hashMap61.table = entryArray76;
        hashMap40.table = entryArray76;
        hashMap33.table = entryArray76;
        hashMap30.table = entryArray76;
        int int82 = hashMap30.size();
        java.lang.Object obj83 = hashMap0.put((java.lang.Object) hashMap23, (java.lang.Object) int82);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray2 = hashMap1.table;
        int int3 = hashMap1.modCount;
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 1, (float) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(1, 1.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        hashMap3.modCount = 0;
        int int6 = hashMap3.modCount;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        int int9 = hashMap7.modCount;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        hashMap10.modCount = 0;
        int int13 = hashMap10.modCount;
        int int14 = hashMap10.modCount;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray16 = new system.testclass.HashMap.Entry[] {};
        hashMap15.table = entryArray16;
        hashMap10.table = entryArray16;
        java.lang.Object obj19 = hashMap7.remove((java.lang.Object) hashMap10);
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        boolean boolean21 = hashMap20.isEmpty();
        boolean boolean22 = hashMap20.isEmpty();
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray25 = hashMap24.table;
        hashMap20.table = entryArray25;
        hashMap10.table = entryArray25;
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        int int29 = hashMap28.modCount;
        int int30 = hashMap28.modCount;
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        hashMap31.modCount = 0;
        int int34 = hashMap31.modCount;
        int int35 = hashMap31.modCount;
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray37 = new system.testclass.HashMap.Entry[] {};
        hashMap36.table = entryArray37;
        hashMap31.table = entryArray37;
        java.lang.Object obj40 = hashMap28.remove((java.lang.Object) hashMap31);
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        boolean boolean42 = hashMap41.isEmpty();
        boolean boolean43 = hashMap41.isEmpty();
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray46 = hashMap45.table;
        hashMap41.table = entryArray46;
        hashMap31.table = entryArray46;
        hashMap10.table = entryArray46;
        hashMap3.table = entryArray46;
        hashMap0.table = entryArray46;
        int int52 = hashMap0.modCount;
        hashMap0.modCount = (short) 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        int int3 = hashMap2.modCount;
        java.lang.Object obj5 = hashMap2.get((java.lang.Object) 100L);
        int int6 = hashMap2.modCount;
        java.lang.Class<?> wildcardClass7 = hashMap2.getClass();
        java.lang.Object obj8 = hashMap1.get((java.lang.Object) hashMap2);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        java.lang.Object obj11 = hashMap2.remove((java.lang.Object) hashMap9);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray15 = hashMap14.table;
        java.lang.Object obj16 = hashMap13.remove((java.lang.Object) hashMap14);
        int int17 = hashMap13.modCount;
        java.lang.Class<?> wildcardClass18 = hashMap13.getClass();
        java.lang.Object obj20 = hashMap2.put((java.lang.Object) hashMap13, (java.lang.Object) 10L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        int int3 = hashMap0.size();
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        int int3 = hashMap0.modCount;
        int int4 = hashMap0.modCount;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray6 = new system.testclass.HashMap.Entry[] {};
        hashMap5.table = entryArray6;
        hashMap0.table = entryArray6;
        hashMap0.modCount = 0;
        system.testclass.HashMap.Entry[] entryArray11 = hashMap0.table;
        boolean boolean12 = hashMap0.isEmpty();
        system.testclass.HashMap.Entry[] entryArray13 = hashMap0.table;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        int int17 = hashMap15.modCount;
        boolean boolean18 = hashMap15.isEmpty();
        system.testclass.HashMap.Entry[] entryArray19 = hashMap15.table;
        hashMap14.table = entryArray19;
        hashMap0.table = entryArray19;
        system.testclass.HashMap.Entry[] entryArray22 = hashMap0.table;
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap(0);
        int int26 = hashMap25.size();
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        hashMap27.modCount = 0;
        int int30 = hashMap27.modCount;
        int int31 = hashMap27.modCount;
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray33 = new system.testclass.HashMap.Entry[] {};
        hashMap32.table = entryArray33;
        hashMap27.table = entryArray33;
        java.lang.Object obj36 = hashMap25.get((java.lang.Object) hashMap27);
        system.testclass.HashMap.Entry[] entryArray37 = hashMap25.table;
        java.lang.Object obj38 = hashMap0.put((java.lang.Object) 1, (java.lang.Object) entryArray37);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        java.lang.Object obj4 = hashMap0.get((java.lang.Object) 10);
        boolean boolean5 = hashMap0.isEmpty();
        int int6 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray7 = hashMap0.table;
        boolean boolean8 = hashMap0.isEmpty();
        hashMap0.modCount = 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(1, (float) 100L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 1L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        boolean boolean3 = hashMap0.isEmpty();
        hashMap0.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) '#');
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap();
        int int2 = hashMap1.modCount;
        int int3 = hashMap1.modCount;
        boolean boolean4 = hashMap1.isEmpty();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap1.table;
        hashMap0.table = entryArray5;
        boolean boolean7 = hashMap0.isEmpty();
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        int int2 = hashMap1.size();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap1.table;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        hashMap7.modCount = 0;
        int int10 = hashMap7.modCount;
        int int11 = hashMap7.modCount;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray13 = new system.testclass.HashMap.Entry[] {};
        hashMap12.table = entryArray13;
        hashMap7.table = entryArray13;
        java.lang.Object obj16 = hashMap4.remove((java.lang.Object) hashMap7);
        int int17 = hashMap7.modCount;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap(0);
        int int20 = hashMap19.size();
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        hashMap21.modCount = 0;
        int int24 = hashMap21.modCount;
        int int25 = hashMap21.modCount;
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray27 = new system.testclass.HashMap.Entry[] {};
        hashMap26.table = entryArray27;
        hashMap21.table = entryArray27;
        java.lang.Object obj30 = hashMap19.get((java.lang.Object) hashMap21);
        java.lang.Object obj31 = hashMap1.put((java.lang.Object) hashMap7, (java.lang.Object) hashMap19);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 0, (float) 100L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        int int3 = hashMap0.size();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        boolean boolean6 = hashMap4.isEmpty();
        system.testclass.HashMap.Entry[] entryArray7 = hashMap4.table;
        hashMap0.table = entryArray7;
        int int9 = hashMap0.modCount;
        hashMap0.modCount = 'a';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        hashMap3.modCount = 0;
        int int6 = hashMap3.modCount;
        int int7 = hashMap3.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray9 = new system.testclass.HashMap.Entry[] {};
        hashMap8.table = entryArray9;
        hashMap3.table = entryArray9;
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap3);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        boolean boolean14 = hashMap13.isEmpty();
        boolean boolean15 = hashMap13.isEmpty();
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray18 = hashMap17.table;
        hashMap13.table = entryArray18;
        hashMap3.table = entryArray18;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        int int22 = hashMap21.modCount;
        int int23 = hashMap21.modCount;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        hashMap24.modCount = 0;
        int int27 = hashMap24.modCount;
        int int28 = hashMap24.modCount;
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray30 = new system.testclass.HashMap.Entry[] {};
        hashMap29.table = entryArray30;
        hashMap24.table = entryArray30;
        java.lang.Object obj33 = hashMap21.remove((java.lang.Object) hashMap24);
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        boolean boolean35 = hashMap34.isEmpty();
        boolean boolean36 = hashMap34.isEmpty();
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray39 = hashMap38.table;
        hashMap34.table = entryArray39;
        hashMap24.table = entryArray39;
        hashMap3.table = entryArray39;
        boolean boolean43 = hashMap3.isEmpty();
        boolean boolean44 = hashMap3.isEmpty();
        boolean boolean45 = hashMap3.isEmpty();
        int int46 = hashMap3.modCount;
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap(10);
        system.testclass.HashMap hashMap49 = new system.testclass.HashMap();
        int int50 = hashMap49.modCount;
        int int51 = hashMap49.modCount;
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap();
        int int53 = hashMap52.modCount;
        int int54 = hashMap52.modCount;
        system.testclass.HashMap hashMap55 = new system.testclass.HashMap();
        hashMap55.modCount = 0;
        int int58 = hashMap55.modCount;
        int int59 = hashMap55.modCount;
        system.testclass.HashMap hashMap60 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray61 = new system.testclass.HashMap.Entry[] {};
        hashMap60.table = entryArray61;
        hashMap55.table = entryArray61;
        java.lang.Object obj64 = hashMap52.remove((java.lang.Object) hashMap55);
        int int65 = hashMap52.modCount;
        java.lang.Object obj66 = hashMap49.get((java.lang.Object) int65);
        int int67 = hashMap49.modCount;
        int int68 = hashMap49.size();
        system.testclass.HashMap.Entry[] entryArray69 = hashMap49.table;
        java.lang.Object obj70 = hashMap3.put((java.lang.Object) hashMap48, (java.lang.Object) hashMap49);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap3", hashMap3.repOK_1());
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) 'a', (float) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 0, 1.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 10, (float) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) ' ', (float) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) 100L);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray5 = new system.testclass.HashMap.Entry[] {};
        hashMap4.table = entryArray5;
        int int7 = hashMap4.size();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.modCount;
        int int10 = hashMap8.modCount;
        java.lang.Object obj12 = hashMap8.get((java.lang.Object) 10);
        boolean boolean13 = hashMap8.isEmpty();
        int int14 = hashMap8.size();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray16 = new system.testclass.HashMap.Entry[] {};
        hashMap15.table = entryArray16;
        java.lang.Object obj18 = hashMap8.remove((java.lang.Object) entryArray16);
        hashMap4.table = entryArray16;
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        int int21 = hashMap20.modCount;
        int int22 = hashMap20.modCount;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        hashMap23.modCount = 0;
        int int26 = hashMap23.modCount;
        int int27 = hashMap23.modCount;
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray29 = new system.testclass.HashMap.Entry[] {};
        hashMap28.table = entryArray29;
        hashMap23.table = entryArray29;
        java.lang.Object obj32 = hashMap20.remove((java.lang.Object) hashMap23);
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray34 = hashMap33.table;
        java.lang.Object obj35 = hashMap20.get((java.lang.Object) entryArray34);
        java.lang.Object obj36 = hashMap0.put((java.lang.Object) hashMap4, (java.lang.Object) hashMap20);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        int int2 = hashMap1.size();
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        hashMap3.modCount = 0;
        int int6 = hashMap3.modCount;
        int int7 = hashMap3.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray9 = new system.testclass.HashMap.Entry[] {};
        hashMap8.table = entryArray9;
        hashMap3.table = entryArray9;
        java.lang.Object obj12 = hashMap1.get((java.lang.Object) hashMap3);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        hashMap16.modCount = 0;
        int int19 = hashMap16.modCount;
        int int20 = hashMap16.modCount;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray22 = new system.testclass.HashMap.Entry[] {};
        hashMap21.table = entryArray22;
        hashMap16.table = entryArray22;
        java.lang.Object obj25 = hashMap13.remove((java.lang.Object) hashMap16);
        int int26 = hashMap13.modCount;
        int int27 = hashMap13.size();
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        int int29 = hashMap28.modCount;
        int int30 = hashMap28.modCount;
        boolean boolean31 = hashMap28.isEmpty();
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray33 = hashMap32.table;
        hashMap28.table = entryArray33;
        hashMap13.table = entryArray33;
        java.lang.Object obj36 = hashMap1.remove((java.lang.Object) entryArray33);
        int int37 = hashMap1.modCount;
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        int int3 = hashMap0.modCount;
        int int4 = hashMap0.modCount;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray6 = new system.testclass.HashMap.Entry[] {};
        hashMap5.table = entryArray6;
        hashMap0.table = entryArray6;
        system.testclass.HashMap.Entry[] entryArray9 = hashMap0.table;
        hashMap0.modCount = (byte) 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 10, (float) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap2.table;
        java.lang.Object obj4 = hashMap1.remove((java.lang.Object) hashMap2);
        boolean boolean5 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        boolean boolean9 = hashMap7.isEmpty();
        system.testclass.HashMap.Entry[] entryArray10 = hashMap7.table;
        hashMap6.table = entryArray10;
        java.lang.Object obj12 = hashMap2.remove((java.lang.Object) hashMap6);
        int int13 = hashMap6.modCount;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.modCount;
        int int16 = hashMap14.modCount;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        hashMap17.modCount = 0;
        int int20 = hashMap17.modCount;
        int int21 = hashMap17.modCount;
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray23 = new system.testclass.HashMap.Entry[] {};
        hashMap22.table = entryArray23;
        hashMap17.table = entryArray23;
        java.lang.Object obj26 = hashMap14.remove((java.lang.Object) hashMap17);
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        boolean boolean28 = hashMap27.isEmpty();
        boolean boolean29 = hashMap27.isEmpty();
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray32 = hashMap31.table;
        hashMap27.table = entryArray32;
        hashMap17.table = entryArray32;
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        int int36 = hashMap35.modCount;
        int int37 = hashMap35.modCount;
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        hashMap38.modCount = 0;
        int int41 = hashMap38.modCount;
        int int42 = hashMap38.modCount;
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray44 = new system.testclass.HashMap.Entry[] {};
        hashMap43.table = entryArray44;
        hashMap38.table = entryArray44;
        java.lang.Object obj47 = hashMap35.remove((java.lang.Object) hashMap38);
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap();
        boolean boolean49 = hashMap48.isEmpty();
        boolean boolean50 = hashMap48.isEmpty();
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray53 = hashMap52.table;
        hashMap48.table = entryArray53;
        hashMap38.table = entryArray53;
        hashMap17.table = entryArray53;
        system.testclass.HashMap.Entry[] entryArray57 = hashMap17.table;
        java.lang.Object obj58 = hashMap6.get((java.lang.Object) hashMap17);
        system.testclass.HashMap.Entry[] entryArray59 = hashMap6.table;
        hashMap6.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap6", hashMap6.repOK_1());
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        hashMap3.modCount = 0;
        int int6 = hashMap3.modCount;
        int int7 = hashMap3.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray9 = new system.testclass.HashMap.Entry[] {};
        hashMap8.table = entryArray9;
        hashMap3.table = entryArray9;
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap3);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        boolean boolean14 = hashMap13.isEmpty();
        boolean boolean15 = hashMap13.isEmpty();
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray18 = hashMap17.table;
        hashMap13.table = entryArray18;
        hashMap3.table = entryArray18;
        java.lang.Object obj22 = hashMap3.get((java.lang.Object) 0.0f);
        hashMap3.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap3", hashMap3.repOK_1());
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        int int3 = hashMap0.modCount;
        int int4 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap0.table;
        int int6 = hashMap0.modCount;
        int int7 = hashMap0.size();
        hashMap0.modCount = (byte) 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        java.lang.Object obj4 = hashMap0.get((java.lang.Object) 10);
        java.lang.Object obj6 = hashMap0.remove((java.lang.Object) 'a');
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        hashMap7.modCount = 0;
        int int10 = hashMap7.modCount;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        int int13 = hashMap11.modCount;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        hashMap14.modCount = 0;
        int int17 = hashMap14.modCount;
        int int18 = hashMap14.modCount;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray20 = new system.testclass.HashMap.Entry[] {};
        hashMap19.table = entryArray20;
        hashMap14.table = entryArray20;
        java.lang.Object obj23 = hashMap11.remove((java.lang.Object) hashMap14);
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        boolean boolean25 = hashMap24.isEmpty();
        boolean boolean26 = hashMap24.isEmpty();
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray29 = hashMap28.table;
        hashMap24.table = entryArray29;
        hashMap14.table = entryArray29;
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        hashMap32.modCount = 0;
        int int35 = hashMap32.modCount;
        int int36 = hashMap32.modCount;
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray38 = new system.testclass.HashMap.Entry[] {};
        hashMap37.table = entryArray38;
        hashMap32.table = entryArray38;
        hashMap14.table = entryArray38;
        hashMap7.table = entryArray38;
        system.testclass.HashMap.Entry[] entryArray43 = hashMap7.table;
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap();
        int int45 = hashMap44.modCount;
        int int46 = hashMap44.modCount;
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap();
        int int48 = hashMap47.modCount;
        int int49 = hashMap47.modCount;
        system.testclass.HashMap hashMap50 = new system.testclass.HashMap();
        hashMap50.modCount = 0;
        int int53 = hashMap50.modCount;
        int int54 = hashMap50.modCount;
        system.testclass.HashMap hashMap55 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray56 = new system.testclass.HashMap.Entry[] {};
        hashMap55.table = entryArray56;
        hashMap50.table = entryArray56;
        java.lang.Object obj59 = hashMap47.remove((java.lang.Object) hashMap50);
        int int60 = hashMap47.modCount;
        java.lang.Object obj61 = hashMap44.get((java.lang.Object) int60);
        int int62 = hashMap44.modCount;
        system.testclass.HashMap hashMap64 = new system.testclass.HashMap(0);
        int int65 = hashMap64.size();
        system.testclass.HashMap hashMap66 = new system.testclass.HashMap();
        hashMap66.modCount = 0;
        int int69 = hashMap66.modCount;
        int int70 = hashMap66.modCount;
        system.testclass.HashMap hashMap71 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray72 = new system.testclass.HashMap.Entry[] {};
        hashMap71.table = entryArray72;
        hashMap66.table = entryArray72;
        java.lang.Object obj75 = hashMap64.get((java.lang.Object) hashMap66);
        system.testclass.HashMap.Entry[] entryArray76 = hashMap64.table;
        hashMap44.table = entryArray76;
        hashMap7.table = entryArray76;
        hashMap0.table = entryArray76;
        hashMap0.modCount = (short) 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 0, 1.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray1 = hashMap0.table;
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) (byte) 10);
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) 10L);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.modCount;
        int int8 = hashMap6.modCount;
        boolean boolean9 = hashMap6.isEmpty();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray11 = hashMap10.table;
        hashMap6.table = entryArray11;
        system.testclass.HashMap.Entry[] entryArray13 = hashMap6.table;
        hashMap0.table = entryArray13;
        hashMap0.modCount = 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        boolean boolean2 = hashMap1.isEmpty();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray6 = hashMap5.table;
        java.lang.Object obj7 = hashMap4.remove((java.lang.Object) hashMap5);
        int int8 = hashMap4.modCount;
        int int9 = hashMap4.size();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap((int) '4');
        java.lang.Object obj12 = hashMap1.put((java.lang.Object) int9, (java.lang.Object) hashMap11);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray1 = new system.testclass.HashMap.Entry[] {};
        hashMap0.table = entryArray1;
        int int3 = hashMap0.size();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        java.lang.Object obj8 = hashMap4.get((java.lang.Object) 10);
        boolean boolean9 = hashMap4.isEmpty();
        int int10 = hashMap4.size();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray12 = new system.testclass.HashMap.Entry[] {};
        hashMap11.table = entryArray12;
        java.lang.Object obj14 = hashMap4.remove((java.lang.Object) entryArray12);
        hashMap0.table = entryArray12;
        hashMap0.modCount = (byte) 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        boolean boolean3 = hashMap0.isEmpty();
        system.testclass.HashMap.Entry[] entryArray4 = hashMap0.table;
        int int5 = hashMap0.size();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        boolean boolean8 = hashMap6.isEmpty();
        system.testclass.HashMap.Entry[] entryArray9 = hashMap6.table;
        hashMap0.table = entryArray9;
        int int11 = hashMap0.modCount;
        int int12 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray13 = hashMap0.table;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 1, (float) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 100, 1.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) 'a', (float) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 0, (float) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        int int2 = hashMap1.size();
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        hashMap3.modCount = 0;
        int int6 = hashMap3.modCount;
        int int7 = hashMap3.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray9 = new system.testclass.HashMap.Entry[] {};
        hashMap8.table = entryArray9;
        hashMap3.table = entryArray9;
        java.lang.Object obj12 = hashMap1.get((java.lang.Object) hashMap3);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        boolean boolean16 = hashMap13.isEmpty();
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray18 = hashMap17.table;
        hashMap13.table = entryArray18;
        hashMap1.table = entryArray18;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        boolean boolean3 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap4.table;
        hashMap0.table = entryArray5;
        int int7 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray8 = hashMap0.table;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        java.lang.Object obj4 = hashMap0.get((java.lang.Object) 10);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        boolean boolean8 = hashMap5.isEmpty();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray10 = hashMap9.table;
        hashMap5.table = entryArray10;
        java.lang.Object obj12 = hashMap0.get((java.lang.Object) hashMap5);
        boolean boolean13 = hashMap0.isEmpty();
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        hashMap3.modCount = 0;
        int int6 = hashMap3.modCount;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        int int9 = hashMap7.modCount;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        hashMap10.modCount = 0;
        int int13 = hashMap10.modCount;
        int int14 = hashMap10.modCount;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray16 = new system.testclass.HashMap.Entry[] {};
        hashMap15.table = entryArray16;
        hashMap10.table = entryArray16;
        java.lang.Object obj19 = hashMap7.remove((java.lang.Object) hashMap10);
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        boolean boolean21 = hashMap20.isEmpty();
        boolean boolean22 = hashMap20.isEmpty();
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray25 = hashMap24.table;
        hashMap20.table = entryArray25;
        hashMap10.table = entryArray25;
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        int int29 = hashMap28.modCount;
        int int30 = hashMap28.modCount;
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        hashMap31.modCount = 0;
        int int34 = hashMap31.modCount;
        int int35 = hashMap31.modCount;
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray37 = new system.testclass.HashMap.Entry[] {};
        hashMap36.table = entryArray37;
        hashMap31.table = entryArray37;
        java.lang.Object obj40 = hashMap28.remove((java.lang.Object) hashMap31);
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        boolean boolean42 = hashMap41.isEmpty();
        boolean boolean43 = hashMap41.isEmpty();
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray46 = hashMap45.table;
        hashMap41.table = entryArray46;
        hashMap31.table = entryArray46;
        hashMap10.table = entryArray46;
        hashMap3.table = entryArray46;
        hashMap0.table = entryArray46;
        int int52 = hashMap0.size();
        system.testclass.HashMap hashMap54 = new system.testclass.HashMap((int) ' ');
        java.lang.Object obj55 = hashMap0.remove((java.lang.Object) ' ');
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        int int3 = hashMap0.modCount;
        int int4 = hashMap0.size();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        hashMap8.modCount = 0;
        int int11 = hashMap8.modCount;
        int int12 = hashMap8.modCount;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray14 = new system.testclass.HashMap.Entry[] {};
        hashMap13.table = entryArray14;
        hashMap8.table = entryArray14;
        java.lang.Object obj17 = hashMap5.remove((java.lang.Object) hashMap8);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        boolean boolean19 = hashMap18.isEmpty();
        boolean boolean20 = hashMap18.isEmpty();
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray23 = hashMap22.table;
        hashMap18.table = entryArray23;
        hashMap8.table = entryArray23;
        java.lang.Object obj26 = hashMap0.get((java.lang.Object) entryArray23);
        boolean boolean27 = hashMap0.isEmpty();
        hashMap0.modCount = (byte) 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        int int3 = hashMap0.modCount;
        int int4 = hashMap0.size();
        hashMap0.modCount = '#';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 0, (float) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        int int3 = hashMap0.modCount;
        int int4 = hashMap0.modCount;
        java.lang.Object obj6 = hashMap0.remove((java.lang.Object) (short) 10);
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        boolean boolean4 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        hashMap5.modCount = 0;
        int int8 = hashMap5.modCount;
        int int9 = hashMap5.modCount;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.modCount;
        int int12 = hashMap10.modCount;
        int int13 = hashMap10.modCount;
        int int14 = hashMap10.size();
        java.lang.Object obj15 = hashMap5.get((java.lang.Object) int14);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        int int17 = hashMap16.modCount;
        int int18 = hashMap16.modCount;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        hashMap19.modCount = 0;
        int int22 = hashMap19.modCount;
        int int23 = hashMap19.modCount;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray25 = new system.testclass.HashMap.Entry[] {};
        hashMap24.table = entryArray25;
        hashMap19.table = entryArray25;
        java.lang.Object obj28 = hashMap16.remove((java.lang.Object) hashMap19);
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        boolean boolean30 = hashMap29.isEmpty();
        boolean boolean31 = hashMap29.isEmpty();
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray34 = hashMap33.table;
        hashMap29.table = entryArray34;
        hashMap19.table = entryArray34;
        int int37 = hashMap19.size();
        system.testclass.HashMap.Entry[] entryArray38 = hashMap19.table;
        java.lang.Object obj39 = hashMap5.get((java.lang.Object) hashMap19);
        int int40 = hashMap5.modCount;
        java.lang.Object obj41 = null;
        java.lang.Object obj42 = hashMap0.put((java.lang.Object) hashMap5, obj41);
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
        java.lang.Object obj4 = hashMap0.get((java.lang.Object) 10);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        boolean boolean8 = hashMap5.isEmpty();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray10 = hashMap9.table;
        hashMap5.table = entryArray10;
        java.lang.Object obj12 = hashMap0.get((java.lang.Object) hashMap5);
        boolean boolean13 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.modCount;
        int int16 = hashMap14.modCount;
        boolean boolean17 = hashMap14.isEmpty();
        int int18 = hashMap14.size();
        int int19 = hashMap14.size();
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray22 = hashMap21.table;
        boolean boolean23 = hashMap21.isEmpty();
        java.lang.Object obj24 = hashMap0.put((java.lang.Object) hashMap14, (java.lang.Object) hashMap21);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap();
        boolean boolean2 = hashMap1.isEmpty();
        boolean boolean3 = hashMap1.isEmpty();
        system.testclass.HashMap.Entry[] entryArray4 = hashMap1.table;
        hashMap0.table = entryArray4;
        int int6 = hashMap0.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap(0);
        int int9 = hashMap8.size();
        java.lang.Object obj10 = hashMap0.remove((java.lang.Object) hashMap8);
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        hashMap3.modCount = 0;
        int int6 = hashMap3.modCount;
        int int7 = hashMap3.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray9 = new system.testclass.HashMap.Entry[] {};
        hashMap8.table = entryArray9;
        hashMap3.table = entryArray9;
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap3);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray14 = hashMap13.table;
        java.lang.Object obj15 = hashMap0.get((java.lang.Object) entryArray14);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray19 = hashMap18.table;
        java.lang.Object obj20 = hashMap17.remove((java.lang.Object) hashMap18);
        int int21 = hashMap17.modCount;
        int int22 = hashMap17.size();
        int int23 = hashMap17.modCount;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.modCount;
        int int26 = hashMap24.modCount;
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        hashMap27.modCount = 0;
        int int30 = hashMap27.modCount;
        int int31 = hashMap27.modCount;
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray33 = new system.testclass.HashMap.Entry[] {};
        hashMap32.table = entryArray33;
        hashMap27.table = entryArray33;
        java.lang.Object obj36 = hashMap24.remove((java.lang.Object) hashMap27);
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        boolean boolean38 = hashMap37.isEmpty();
        boolean boolean39 = hashMap37.isEmpty();
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray42 = hashMap41.table;
        hashMap37.table = entryArray42;
        hashMap27.table = entryArray42;
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        int int46 = hashMap45.modCount;
        int int47 = hashMap45.modCount;
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap();
        hashMap48.modCount = 0;
        int int51 = hashMap48.modCount;
        int int52 = hashMap48.modCount;
        system.testclass.HashMap hashMap53 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray54 = new system.testclass.HashMap.Entry[] {};
        hashMap53.table = entryArray54;
        hashMap48.table = entryArray54;
        java.lang.Object obj57 = hashMap45.remove((java.lang.Object) hashMap48);
        system.testclass.HashMap hashMap58 = new system.testclass.HashMap();
        boolean boolean59 = hashMap58.isEmpty();
        boolean boolean60 = hashMap58.isEmpty();
        system.testclass.HashMap hashMap62 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray63 = hashMap62.table;
        hashMap58.table = entryArray63;
        hashMap48.table = entryArray63;
        hashMap27.table = entryArray63;
        boolean boolean67 = hashMap27.isEmpty();
        boolean boolean68 = hashMap27.isEmpty();
        java.lang.Object obj69 = hashMap17.remove((java.lang.Object) hashMap27);
        system.testclass.HashMap hashMap70 = new system.testclass.HashMap();
        int int71 = hashMap70.modCount;
        int int72 = hashMap70.modCount;
        system.testclass.HashMap hashMap73 = new system.testclass.HashMap();
        hashMap73.modCount = 0;
        int int76 = hashMap73.modCount;
        int int77 = hashMap73.modCount;
        system.testclass.HashMap hashMap78 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray79 = new system.testclass.HashMap.Entry[] {};
        hashMap78.table = entryArray79;
        hashMap73.table = entryArray79;
        java.lang.Object obj82 = hashMap70.remove((java.lang.Object) hashMap73);
        system.testclass.HashMap hashMap83 = new system.testclass.HashMap();
        hashMap83.modCount = 0;
        int int86 = hashMap83.modCount;
        int int87 = hashMap83.modCount;
        system.testclass.HashMap hashMap88 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray89 = new system.testclass.HashMap.Entry[] {};
        hashMap88.table = entryArray89;
        hashMap83.table = entryArray89;
        hashMap70.table = entryArray89;
        int int93 = hashMap70.size();
        system.testclass.HashMap.Entry[] entryArray94 = hashMap70.table;
        java.lang.Object obj95 = hashMap0.put((java.lang.Object) hashMap27, (java.lang.Object) hashMap70);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) 100L);
        int int4 = hashMap0.modCount;
        int int5 = hashMap0.modCount;
        int int6 = hashMap0.size();
        int int7 = hashMap0.size();
        hashMap0.modCount = ' ';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) ' ', (float) 10L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) 'a');
        system.testclass.HashMap.Entry[] entryArray2 = hashMap1.table;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        hashMap3.modCount = 0;
        int int6 = hashMap3.modCount;
        hashMap3.modCount = (short) 0;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        int int11 = hashMap9.modCount;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        hashMap12.modCount = 0;
        int int15 = hashMap12.modCount;
        int int16 = hashMap12.modCount;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray18 = new system.testclass.HashMap.Entry[] {};
        hashMap17.table = entryArray18;
        hashMap12.table = entryArray18;
        java.lang.Object obj21 = hashMap9.remove((java.lang.Object) hashMap12);
        int int22 = hashMap12.modCount;
        java.lang.Object obj23 = hashMap1.put((java.lang.Object) hashMap3, (java.lang.Object) int22);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 100, (float) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        hashMap3.modCount = 0;
        int int6 = hashMap3.modCount;
        int int7 = hashMap3.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray9 = new system.testclass.HashMap.Entry[] {};
        hashMap8.table = entryArray9;
        hashMap3.table = entryArray9;
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap3);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        boolean boolean14 = hashMap13.isEmpty();
        boolean boolean15 = hashMap13.isEmpty();
        system.testclass.HashMap.Entry[] entryArray16 = hashMap13.table;
        java.lang.Object obj17 = hashMap0.remove((java.lang.Object) entryArray16);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        int int19 = hashMap18.modCount;
        int int20 = hashMap18.modCount;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        hashMap21.modCount = 0;
        int int24 = hashMap21.modCount;
        int int25 = hashMap21.modCount;
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray27 = new system.testclass.HashMap.Entry[] {};
        hashMap26.table = entryArray27;
        hashMap21.table = entryArray27;
        java.lang.Object obj30 = hashMap18.remove((java.lang.Object) hashMap21);
        int int31 = hashMap18.modCount;
        int int32 = hashMap18.size();
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        int int34 = hashMap33.modCount;
        int int35 = hashMap33.modCount;
        boolean boolean36 = hashMap33.isEmpty();
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray38 = hashMap37.table;
        hashMap33.table = entryArray38;
        hashMap18.table = entryArray38;
        hashMap0.table = entryArray38;
        boolean boolean42 = hashMap0.isEmpty();
        boolean boolean43 = hashMap0.isEmpty();
        hashMap0.modCount = 'a';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        java.lang.Object obj3 = hashMap0.remove((java.lang.Object) (byte) -1);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        java.lang.Object obj8 = hashMap4.get((java.lang.Object) 10);
        java.lang.Object obj10 = hashMap4.remove((java.lang.Object) 'a');
        int int11 = hashMap4.size();
        java.lang.Object obj13 = hashMap4.get((java.lang.Object) (byte) 100);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.modCount;
        int int16 = hashMap14.modCount;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        hashMap17.modCount = 0;
        int int20 = hashMap17.modCount;
        int int21 = hashMap17.modCount;
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray23 = new system.testclass.HashMap.Entry[] {};
        hashMap22.table = entryArray23;
        hashMap17.table = entryArray23;
        java.lang.Object obj26 = hashMap14.remove((java.lang.Object) hashMap17);
        int int27 = hashMap17.size();
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        int int29 = hashMap28.modCount;
        int int30 = hashMap28.modCount;
        java.lang.Object obj32 = hashMap28.get((java.lang.Object) 10);
        boolean boolean33 = hashMap28.isEmpty();
        int int34 = hashMap28.size();
        int int35 = hashMap28.size();
        system.testclass.HashMap.Entry[] entryArray36 = hashMap28.table;
        hashMap17.table = entryArray36;
        java.lang.Object obj38 = hashMap0.put((java.lang.Object) hashMap4, (java.lang.Object) hashMap17);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) ' ', (float) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 10, (float) 100L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) 'a', (float) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        hashMap3.modCount = 0;
        int int6 = hashMap3.modCount;
        int int7 = hashMap3.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray9 = new system.testclass.HashMap.Entry[] {};
        hashMap8.table = entryArray9;
        hashMap3.table = entryArray9;
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap3);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        boolean boolean14 = hashMap13.isEmpty();
        boolean boolean15 = hashMap13.isEmpty();
        system.testclass.HashMap.Entry[] entryArray16 = hashMap13.table;
        java.lang.Object obj17 = hashMap0.remove((java.lang.Object) entryArray16);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        int int19 = hashMap18.modCount;
        int int20 = hashMap18.modCount;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        hashMap21.modCount = 0;
        int int24 = hashMap21.modCount;
        int int25 = hashMap21.modCount;
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray27 = new system.testclass.HashMap.Entry[] {};
        hashMap26.table = entryArray27;
        hashMap21.table = entryArray27;
        java.lang.Object obj30 = hashMap18.remove((java.lang.Object) hashMap21);
        int int31 = hashMap18.modCount;
        int int32 = hashMap18.size();
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        int int34 = hashMap33.modCount;
        int int35 = hashMap33.modCount;
        boolean boolean36 = hashMap33.isEmpty();
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray38 = hashMap37.table;
        hashMap33.table = entryArray38;
        hashMap18.table = entryArray38;
        hashMap0.table = entryArray38;
        int int42 = hashMap0.modCount;
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap();
        int int44 = hashMap43.modCount;
        int int45 = hashMap43.modCount;
        boolean boolean46 = hashMap43.isEmpty();
        system.testclass.HashMap.Entry[] entryArray47 = hashMap43.table;
        int int48 = hashMap43.size();
        system.testclass.HashMap hashMap49 = new system.testclass.HashMap();
        boolean boolean50 = hashMap49.isEmpty();
        boolean boolean51 = hashMap49.isEmpty();
        system.testclass.HashMap.Entry[] entryArray52 = hashMap49.table;
        hashMap43.table = entryArray52;
        system.testclass.HashMap hashMap54 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap55 = new system.testclass.HashMap();
        boolean boolean56 = hashMap55.isEmpty();
        boolean boolean57 = hashMap55.isEmpty();
        system.testclass.HashMap.Entry[] entryArray58 = hashMap55.table;
        hashMap54.table = entryArray58;
        java.lang.Object obj60 = hashMap0.put((java.lang.Object) entryArray52, (java.lang.Object) hashMap54);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        int int3 = hashMap0.modCount;
        int int4 = hashMap0.size();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        int int8 = hashMap5.modCount;
        int int9 = hashMap5.size();
        system.testclass.HashMap.Entry[] entryArray10 = hashMap5.table;
        int int11 = hashMap5.modCount;
        int int12 = hashMap5.size();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        boolean boolean14 = hashMap13.isEmpty();
        boolean boolean15 = hashMap13.isEmpty();
        int int16 = hashMap13.size();
        int int17 = hashMap13.modCount;
        system.testclass.HashMap.Entry[] entryArray18 = hashMap13.table;
        java.lang.Object obj19 = hashMap0.put((java.lang.Object) int12, (java.lang.Object) hashMap13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 100);
        int int2 = hashMap1.size();
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        boolean boolean6 = hashMap3.isEmpty();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray8 = hashMap7.table;
        hashMap3.table = entryArray8;
        hashMap1.table = entryArray8;
        hashMap1.modCount = ' ';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        hashMap3.modCount = 0;
        int int6 = hashMap3.modCount;
        int int7 = hashMap3.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray9 = new system.testclass.HashMap.Entry[] {};
        hashMap8.table = entryArray9;
        hashMap3.table = entryArray9;
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap3);
        int int13 = hashMap0.modCount;
        int int14 = hashMap0.size();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        int int17 = hashMap15.modCount;
        boolean boolean18 = hashMap15.isEmpty();
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray20 = hashMap19.table;
        hashMap15.table = entryArray20;
        hashMap0.table = entryArray20;
        boolean boolean23 = hashMap0.isEmpty();
        java.lang.Object obj24 = null;
        java.lang.Object obj25 = hashMap0.get(obj24);
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        boolean boolean2 = hashMap1.isEmpty();
        int int3 = hashMap1.modCount;
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 0, (float) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(1, (float) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        hashMap3.modCount = 0;
        int int6 = hashMap3.modCount;
        int int7 = hashMap3.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray9 = new system.testclass.HashMap.Entry[] {};
        hashMap8.table = entryArray9;
        hashMap3.table = entryArray9;
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap3);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        boolean boolean14 = hashMap13.isEmpty();
        boolean boolean15 = hashMap13.isEmpty();
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray18 = hashMap17.table;
        hashMap13.table = entryArray18;
        hashMap3.table = entryArray18;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        hashMap21.modCount = 0;
        int int24 = hashMap21.modCount;
        int int25 = hashMap21.modCount;
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray27 = new system.testclass.HashMap.Entry[] {};
        hashMap26.table = entryArray27;
        hashMap21.table = entryArray27;
        hashMap3.table = entryArray27;
        hashMap3.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap3", hashMap3.repOK_1());
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        java.lang.Object obj4 = hashMap0.get((java.lang.Object) 10);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        boolean boolean8 = hashMap5.isEmpty();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray10 = hashMap9.table;
        hashMap5.table = entryArray10;
        java.lang.Object obj12 = hashMap0.get((java.lang.Object) hashMap5);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray16 = hashMap15.table;
        java.lang.Object obj17 = hashMap14.remove((java.lang.Object) hashMap15);
        boolean boolean18 = hashMap15.isEmpty();
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        boolean boolean21 = hashMap20.isEmpty();
        boolean boolean22 = hashMap20.isEmpty();
        system.testclass.HashMap.Entry[] entryArray23 = hashMap20.table;
        hashMap19.table = entryArray23;
        java.lang.Object obj25 = hashMap15.remove((java.lang.Object) hashMap19);
        int int26 = hashMap19.modCount;
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        int int28 = hashMap27.modCount;
        int int29 = hashMap27.modCount;
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        hashMap30.modCount = 0;
        int int33 = hashMap30.modCount;
        int int34 = hashMap30.modCount;
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray36 = new system.testclass.HashMap.Entry[] {};
        hashMap35.table = entryArray36;
        hashMap30.table = entryArray36;
        java.lang.Object obj39 = hashMap27.remove((java.lang.Object) hashMap30);
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        boolean boolean41 = hashMap40.isEmpty();
        boolean boolean42 = hashMap40.isEmpty();
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray45 = hashMap44.table;
        hashMap40.table = entryArray45;
        hashMap30.table = entryArray45;
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap();
        int int49 = hashMap48.modCount;
        int int50 = hashMap48.modCount;
        system.testclass.HashMap hashMap51 = new system.testclass.HashMap();
        hashMap51.modCount = 0;
        int int54 = hashMap51.modCount;
        int int55 = hashMap51.modCount;
        system.testclass.HashMap hashMap56 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray57 = new system.testclass.HashMap.Entry[] {};
        hashMap56.table = entryArray57;
        hashMap51.table = entryArray57;
        java.lang.Object obj60 = hashMap48.remove((java.lang.Object) hashMap51);
        system.testclass.HashMap hashMap61 = new system.testclass.HashMap();
        boolean boolean62 = hashMap61.isEmpty();
        boolean boolean63 = hashMap61.isEmpty();
        system.testclass.HashMap hashMap65 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray66 = hashMap65.table;
        hashMap61.table = entryArray66;
        hashMap51.table = entryArray66;
        hashMap30.table = entryArray66;
        system.testclass.HashMap.Entry[] entryArray70 = hashMap30.table;
        java.lang.Object obj71 = hashMap19.get((java.lang.Object) hashMap30);
        boolean boolean72 = hashMap30.isEmpty();
        system.testclass.HashMap hashMap73 = new system.testclass.HashMap();
        int int74 = hashMap73.modCount;
        int int75 = hashMap73.modCount;
        boolean boolean76 = hashMap73.isEmpty();
        system.testclass.HashMap.Entry[] entryArray77 = hashMap73.table;
        int int78 = hashMap73.size();
        system.testclass.HashMap hashMap79 = new system.testclass.HashMap();
        boolean boolean80 = hashMap79.isEmpty();
        boolean boolean81 = hashMap79.isEmpty();
        system.testclass.HashMap.Entry[] entryArray82 = hashMap79.table;
        hashMap73.table = entryArray82;
        java.lang.Object obj84 = hashMap30.get((java.lang.Object) entryArray82);
        java.lang.Class<?> wildcardClass85 = hashMap30.getClass();
        system.testclass.HashMap hashMap87 = new system.testclass.HashMap((int) (byte) 1);
        java.lang.Object obj88 = hashMap5.put((java.lang.Object) hashMap30, (java.lang.Object) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap5", hashMap5.repOK_1());
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        hashMap3.modCount = 0;
        int int6 = hashMap3.modCount;
        int int7 = hashMap3.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray9 = new system.testclass.HashMap.Entry[] {};
        hashMap8.table = entryArray9;
        hashMap3.table = entryArray9;
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap3);
        int int13 = hashMap0.modCount;
        int int14 = hashMap0.size();
        int int15 = hashMap0.modCount;
        hashMap0.modCount = '4';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        hashMap3.modCount = 0;
        int int6 = hashMap3.modCount;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        int int9 = hashMap7.modCount;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        hashMap10.modCount = 0;
        int int13 = hashMap10.modCount;
        int int14 = hashMap10.modCount;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray16 = new system.testclass.HashMap.Entry[] {};
        hashMap15.table = entryArray16;
        hashMap10.table = entryArray16;
        java.lang.Object obj19 = hashMap7.remove((java.lang.Object) hashMap10);
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        boolean boolean21 = hashMap20.isEmpty();
        boolean boolean22 = hashMap20.isEmpty();
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray25 = hashMap24.table;
        hashMap20.table = entryArray25;
        hashMap10.table = entryArray25;
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        int int29 = hashMap28.modCount;
        int int30 = hashMap28.modCount;
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        hashMap31.modCount = 0;
        int int34 = hashMap31.modCount;
        int int35 = hashMap31.modCount;
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray37 = new system.testclass.HashMap.Entry[] {};
        hashMap36.table = entryArray37;
        hashMap31.table = entryArray37;
        java.lang.Object obj40 = hashMap28.remove((java.lang.Object) hashMap31);
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        boolean boolean42 = hashMap41.isEmpty();
        boolean boolean43 = hashMap41.isEmpty();
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray46 = hashMap45.table;
        hashMap41.table = entryArray46;
        hashMap31.table = entryArray46;
        hashMap10.table = entryArray46;
        hashMap3.table = entryArray46;
        hashMap0.table = entryArray46;
        java.lang.Object obj52 = null;
        system.testclass.HashMap hashMap53 = new system.testclass.HashMap();
        int int54 = hashMap53.modCount;
        int int55 = hashMap53.modCount;
        boolean boolean56 = hashMap53.isEmpty();
        system.testclass.HashMap.Entry[] entryArray57 = hashMap53.table;
        boolean boolean58 = hashMap53.isEmpty();
        int int59 = hashMap53.modCount;
        java.lang.Object obj60 = hashMap0.put(obj52, (java.lang.Object) int59);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        int int3 = hashMap0.modCount;
        int int4 = hashMap0.modCount;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        int int8 = hashMap5.modCount;
        int int9 = hashMap5.size();
        java.lang.Object obj10 = hashMap0.get((java.lang.Object) int9);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        int int13 = hashMap11.modCount;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        hashMap14.modCount = 0;
        int int17 = hashMap14.modCount;
        int int18 = hashMap14.modCount;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray20 = new system.testclass.HashMap.Entry[] {};
        hashMap19.table = entryArray20;
        hashMap14.table = entryArray20;
        java.lang.Object obj23 = hashMap11.remove((java.lang.Object) hashMap14);
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        boolean boolean25 = hashMap24.isEmpty();
        boolean boolean26 = hashMap24.isEmpty();
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray29 = hashMap28.table;
        hashMap24.table = entryArray29;
        hashMap14.table = entryArray29;
        int int32 = hashMap14.size();
        system.testclass.HashMap.Entry[] entryArray33 = hashMap14.table;
        java.lang.Object obj34 = hashMap0.get((java.lang.Object) hashMap14);
        hashMap14.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap14", hashMap14.repOK_1());
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        int int3 = hashMap0.size();
        int int4 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray5 = hashMap0.table;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.modCount;
        int int8 = hashMap6.modCount;
        java.lang.Object obj10 = hashMap6.get((java.lang.Object) 10);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        int int13 = hashMap11.modCount;
        boolean boolean14 = hashMap11.isEmpty();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray16 = hashMap15.table;
        hashMap11.table = entryArray16;
        java.lang.Object obj18 = hashMap6.get((java.lang.Object) hashMap11);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        int int20 = hashMap19.modCount;
        int int21 = hashMap19.modCount;
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        hashMap22.modCount = 0;
        int int25 = hashMap22.modCount;
        int int26 = hashMap22.modCount;
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray28 = new system.testclass.HashMap.Entry[] {};
        hashMap27.table = entryArray28;
        hashMap22.table = entryArray28;
        java.lang.Object obj31 = hashMap19.remove((java.lang.Object) hashMap22);
        java.lang.Object obj32 = hashMap0.put(obj18, (java.lang.Object) hashMap22);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        int int3 = hashMap0.modCount;
        int int4 = hashMap0.modCount;
        java.lang.Object obj6 = hashMap0.remove((java.lang.Object) (short) 10);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray10 = hashMap9.table;
        java.lang.Object obj11 = hashMap8.remove((java.lang.Object) hashMap9);
        boolean boolean12 = hashMap9.isEmpty();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        boolean boolean15 = hashMap14.isEmpty();
        boolean boolean16 = hashMap14.isEmpty();
        system.testclass.HashMap.Entry[] entryArray17 = hashMap14.table;
        hashMap13.table = entryArray17;
        java.lang.Object obj19 = hashMap9.remove((java.lang.Object) hashMap13);
        java.lang.Object obj20 = hashMap0.get((java.lang.Object) hashMap9);
        int int21 = hashMap9.modCount;
        hashMap9.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap9", hashMap9.repOK_1());
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        int int3 = hashMap0.modCount;
        int int4 = hashMap0.modCount;
        java.lang.Object obj6 = hashMap0.remove((java.lang.Object) (short) 10);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray10 = hashMap9.table;
        java.lang.Object obj11 = hashMap8.remove((java.lang.Object) hashMap9);
        boolean boolean12 = hashMap9.isEmpty();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        boolean boolean15 = hashMap14.isEmpty();
        boolean boolean16 = hashMap14.isEmpty();
        system.testclass.HashMap.Entry[] entryArray17 = hashMap14.table;
        hashMap13.table = entryArray17;
        java.lang.Object obj19 = hashMap9.remove((java.lang.Object) hashMap13);
        java.lang.Object obj20 = hashMap0.get((java.lang.Object) hashMap9);
        int int21 = hashMap9.modCount;
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        int int23 = hashMap22.modCount;
        int int24 = hashMap22.modCount;
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        hashMap25.modCount = 0;
        int int28 = hashMap25.modCount;
        int int29 = hashMap25.modCount;
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray31 = new system.testclass.HashMap.Entry[] {};
        hashMap30.table = entryArray31;
        hashMap25.table = entryArray31;
        java.lang.Object obj34 = hashMap22.remove((java.lang.Object) hashMap25);
        int int35 = hashMap22.modCount;
        int int36 = hashMap22.size();
        boolean boolean37 = hashMap22.isEmpty();
        boolean boolean38 = hashMap22.isEmpty();
        boolean boolean39 = hashMap22.isEmpty();
        int int40 = hashMap22.size();
        java.lang.Object obj41 = hashMap9.remove((java.lang.Object) int40);
        hashMap9.modCount = (byte) 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap9", hashMap9.repOK_1());
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(10, (float) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        int int2 = hashMap1.size();
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        hashMap3.modCount = 0;
        int int6 = hashMap3.modCount;
        int int7 = hashMap3.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray9 = new system.testclass.HashMap.Entry[] {};
        hashMap8.table = entryArray9;
        hashMap3.table = entryArray9;
        java.lang.Object obj12 = hashMap1.get((java.lang.Object) hashMap3);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        hashMap16.modCount = 0;
        int int19 = hashMap16.modCount;
        int int20 = hashMap16.modCount;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray22 = new system.testclass.HashMap.Entry[] {};
        hashMap21.table = entryArray22;
        hashMap16.table = entryArray22;
        java.lang.Object obj25 = hashMap13.remove((java.lang.Object) hashMap16);
        int int26 = hashMap13.modCount;
        int int27 = hashMap13.size();
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        int int29 = hashMap28.modCount;
        int int30 = hashMap28.modCount;
        boolean boolean31 = hashMap28.isEmpty();
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray33 = hashMap32.table;
        hashMap28.table = entryArray33;
        hashMap13.table = entryArray33;
        java.lang.Object obj36 = hashMap1.remove((java.lang.Object) entryArray33);
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        int int38 = hashMap37.modCount;
        int int39 = hashMap37.modCount;
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        int int41 = hashMap40.modCount;
        int int42 = hashMap40.modCount;
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap();
        hashMap43.modCount = 0;
        int int46 = hashMap43.modCount;
        int int47 = hashMap43.modCount;
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray49 = new system.testclass.HashMap.Entry[] {};
        hashMap48.table = entryArray49;
        hashMap43.table = entryArray49;
        java.lang.Object obj52 = hashMap40.remove((java.lang.Object) hashMap43);
        int int53 = hashMap40.modCount;
        java.lang.Object obj54 = hashMap37.get((java.lang.Object) int53);
        int int55 = hashMap37.modCount;
        int int56 = hashMap37.size();
        hashMap37.modCount = (byte) 0;
        int int59 = hashMap37.size();
        system.testclass.HashMap hashMap60 = new system.testclass.HashMap();
        boolean boolean61 = hashMap60.isEmpty();
        boolean boolean62 = hashMap60.isEmpty();
        java.lang.Object obj63 = hashMap1.put((java.lang.Object) hashMap37, (java.lang.Object) boolean62);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        hashMap3.modCount = 0;
        int int6 = hashMap3.modCount;
        int int7 = hashMap3.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray9 = new system.testclass.HashMap.Entry[] {};
        hashMap8.table = entryArray9;
        hashMap3.table = entryArray9;
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap3);
        int int13 = hashMap0.modCount;
        int int14 = hashMap0.size();
        boolean boolean15 = hashMap0.isEmpty();
        system.testclass.HashMap.Entry[] entryArray16 = hashMap0.table;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        int int3 = hashMap0.modCount;
        int int4 = hashMap0.modCount;
        java.lang.Object obj6 = hashMap0.remove((java.lang.Object) (short) 10);
        int int7 = hashMap0.modCount;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray10 = hashMap9.table;
        boolean boolean11 = hashMap9.isEmpty();
        system.testclass.HashMap.Entry[] entryArray12 = hashMap9.table;
        hashMap0.table = entryArray12;
        system.testclass.HashMap.Entry[] entryArray14 = hashMap0.table;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        int int17 = hashMap16.modCount;
        int int18 = hashMap16.modCount;
        java.lang.Object obj20 = hashMap16.get((java.lang.Object) 10);
        boolean boolean21 = hashMap16.isEmpty();
        int int22 = hashMap16.size();
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray24 = new system.testclass.HashMap.Entry[] {};
        hashMap23.table = entryArray24;
        java.lang.Object obj26 = hashMap16.remove((java.lang.Object) entryArray24);
        java.lang.Object obj27 = hashMap0.put((java.lang.Object) 0L, (java.lang.Object) hashMap16);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 1);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        boolean boolean3 = hashMap2.isEmpty();
        boolean boolean4 = hashMap2.isEmpty();
        int int5 = hashMap2.size();
        system.testclass.HashMap.Entry[] entryArray6 = hashMap2.table;
        hashMap1.table = entryArray6;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        boolean boolean7 = hashMap4.isEmpty();
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) hashMap4);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        hashMap9.modCount = 0;
        int int12 = hashMap9.modCount;
        int int13 = hashMap9.modCount;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray15 = new system.testclass.HashMap.Entry[] {};
        hashMap14.table = entryArray15;
        hashMap9.table = entryArray15;
        system.testclass.HashMap.Entry[] entryArray18 = hashMap9.table;
        java.lang.Object obj19 = hashMap4.remove((java.lang.Object) hashMap9);
        hashMap4.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap4", hashMap4.repOK_1());
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        int int3 = hashMap0.modCount;
        int int4 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap0.table;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) (byte) 1);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        boolean boolean11 = hashMap9.isEmpty();
        system.testclass.HashMap.Entry[] entryArray12 = hashMap9.table;
        hashMap8.table = entryArray12;
        java.lang.Object obj14 = hashMap7.get((java.lang.Object) hashMap8);
        java.lang.Object obj15 = hashMap0.remove(obj14);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray19 = hashMap18.table;
        java.lang.Object obj20 = hashMap17.remove((java.lang.Object) hashMap18);
        boolean boolean21 = hashMap18.isEmpty();
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        boolean boolean24 = hashMap23.isEmpty();
        boolean boolean25 = hashMap23.isEmpty();
        system.testclass.HashMap.Entry[] entryArray26 = hashMap23.table;
        hashMap22.table = entryArray26;
        java.lang.Object obj28 = hashMap18.remove((java.lang.Object) hashMap22);
        int int29 = hashMap22.modCount;
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        int int31 = hashMap30.modCount;
        int int32 = hashMap30.modCount;
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        hashMap33.modCount = 0;
        int int36 = hashMap33.modCount;
        int int37 = hashMap33.modCount;
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray39 = new system.testclass.HashMap.Entry[] {};
        hashMap38.table = entryArray39;
        hashMap33.table = entryArray39;
        java.lang.Object obj42 = hashMap30.remove((java.lang.Object) hashMap33);
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap();
        boolean boolean44 = hashMap43.isEmpty();
        boolean boolean45 = hashMap43.isEmpty();
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray48 = hashMap47.table;
        hashMap43.table = entryArray48;
        hashMap33.table = entryArray48;
        system.testclass.HashMap hashMap51 = new system.testclass.HashMap();
        int int52 = hashMap51.modCount;
        int int53 = hashMap51.modCount;
        system.testclass.HashMap hashMap54 = new system.testclass.HashMap();
        hashMap54.modCount = 0;
        int int57 = hashMap54.modCount;
        int int58 = hashMap54.modCount;
        system.testclass.HashMap hashMap59 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray60 = new system.testclass.HashMap.Entry[] {};
        hashMap59.table = entryArray60;
        hashMap54.table = entryArray60;
        java.lang.Object obj63 = hashMap51.remove((java.lang.Object) hashMap54);
        system.testclass.HashMap hashMap64 = new system.testclass.HashMap();
        boolean boolean65 = hashMap64.isEmpty();
        boolean boolean66 = hashMap64.isEmpty();
        system.testclass.HashMap hashMap68 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray69 = hashMap68.table;
        hashMap64.table = entryArray69;
        hashMap54.table = entryArray69;
        hashMap33.table = entryArray69;
        system.testclass.HashMap.Entry[] entryArray73 = hashMap33.table;
        java.lang.Object obj74 = hashMap22.get((java.lang.Object) hashMap33);
        boolean boolean75 = hashMap33.isEmpty();
        system.testclass.HashMap hashMap76 = new system.testclass.HashMap();
        int int77 = hashMap76.modCount;
        int int78 = hashMap76.modCount;
        boolean boolean79 = hashMap76.isEmpty();
        system.testclass.HashMap.Entry[] entryArray80 = hashMap76.table;
        int int81 = hashMap76.size();
        system.testclass.HashMap hashMap82 = new system.testclass.HashMap();
        boolean boolean83 = hashMap82.isEmpty();
        boolean boolean84 = hashMap82.isEmpty();
        system.testclass.HashMap.Entry[] entryArray85 = hashMap82.table;
        hashMap76.table = entryArray85;
        java.lang.Object obj87 = hashMap33.get((java.lang.Object) entryArray85);
        java.lang.Object obj88 = hashMap0.get((java.lang.Object) hashMap33);
        system.testclass.HashMap hashMap89 = new system.testclass.HashMap();
        int int90 = hashMap89.modCount;
        int int91 = hashMap89.modCount;
        int int92 = hashMap89.modCount;
        java.lang.Class<?> wildcardClass93 = hashMap89.getClass();
        java.lang.Object obj94 = new java.lang.Object();
        java.lang.Object obj95 = hashMap0.put((java.lang.Object) hashMap89, obj94);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        java.lang.Object obj4 = hashMap0.get((java.lang.Object) 10);
        java.lang.Object obj6 = hashMap0.remove((java.lang.Object) 'a');
        int int7 = hashMap0.size();
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap2.table;
        java.lang.Object obj4 = hashMap1.remove((java.lang.Object) hashMap2);
        boolean boolean5 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.modCount;
        int int8 = hashMap6.modCount;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        hashMap9.modCount = 0;
        int int12 = hashMap9.modCount;
        int int13 = hashMap9.modCount;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray15 = new system.testclass.HashMap.Entry[] {};
        hashMap14.table = entryArray15;
        hashMap9.table = entryArray15;
        java.lang.Object obj18 = hashMap6.remove((java.lang.Object) hashMap9);
        java.lang.Object obj19 = hashMap2.get((java.lang.Object) hashMap6);
        boolean boolean20 = hashMap2.isEmpty();
        int int21 = hashMap2.modCount;
        hashMap2.modCount = (byte) 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap2.table;
        java.lang.Object obj4 = hashMap1.remove((java.lang.Object) hashMap2);
        boolean boolean5 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        boolean boolean9 = hashMap7.isEmpty();
        system.testclass.HashMap.Entry[] entryArray10 = hashMap7.table;
        hashMap6.table = entryArray10;
        java.lang.Object obj12 = hashMap2.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        boolean boolean14 = hashMap13.isEmpty();
        boolean boolean15 = hashMap13.isEmpty();
        int int16 = hashMap13.size();
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray18 = hashMap17.table;
        hashMap13.table = entryArray18;
        hashMap6.table = entryArray18;
        hashMap6.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap6", hashMap6.repOK_1());
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        int int3 = hashMap0.modCount;
        int int4 = hashMap0.size();
        boolean boolean5 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.modCount;
        int int8 = hashMap6.modCount;
        int int9 = hashMap6.modCount;
        int int10 = hashMap6.size();
        boolean boolean11 = hashMap6.isEmpty();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        boolean boolean16 = hashMap13.isEmpty();
        system.testclass.HashMap.Entry[] entryArray17 = hashMap13.table;
        hashMap12.table = entryArray17;
        boolean boolean19 = hashMap12.isEmpty();
        java.lang.Object obj20 = hashMap0.put((java.lang.Object) hashMap6, (java.lang.Object) boolean19);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        int int3 = hashMap0.modCount;
        int int4 = hashMap0.modCount;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray6 = new system.testclass.HashMap.Entry[] {};
        hashMap5.table = entryArray6;
        hashMap0.table = entryArray6;
        hashMap0.modCount = 0;
        system.testclass.HashMap.Entry[] entryArray11 = hashMap0.table;
        boolean boolean12 = hashMap0.isEmpty();
        system.testclass.HashMap.Entry[] entryArray13 = hashMap0.table;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        int int17 = hashMap15.modCount;
        boolean boolean18 = hashMap15.isEmpty();
        system.testclass.HashMap.Entry[] entryArray19 = hashMap15.table;
        hashMap14.table = entryArray19;
        hashMap0.table = entryArray19;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        boolean boolean2 = hashMap1.isEmpty();
        boolean boolean3 = hashMap1.isEmpty();
        int int4 = hashMap1.modCount;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        java.lang.Object obj8 = hashMap5.get((java.lang.Object) 100L);
        int int9 = hashMap5.modCount;
        int int10 = hashMap5.modCount;
        int int11 = hashMap5.size();
        int int12 = hashMap5.size();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        hashMap16.modCount = 0;
        int int19 = hashMap16.modCount;
        int int20 = hashMap16.modCount;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray22 = new system.testclass.HashMap.Entry[] {};
        hashMap21.table = entryArray22;
        hashMap16.table = entryArray22;
        java.lang.Object obj25 = hashMap13.remove((java.lang.Object) hashMap16);
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray27 = hashMap26.table;
        java.lang.Object obj28 = hashMap13.get((java.lang.Object) entryArray27);
        java.lang.Object obj29 = hashMap1.put((java.lang.Object) hashMap5, (java.lang.Object) entryArray27);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) 100L);
        int int4 = hashMap0.modCount;
        int int5 = hashMap0.modCount;
        int int6 = hashMap0.size();
        int int7 = hashMap0.size();
        hashMap0.modCount = (byte) 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) 100L);
        int int4 = hashMap0.modCount;
        hashMap0.modCount = 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        java.lang.Object obj4 = hashMap0.get((java.lang.Object) 10);
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        java.lang.Object obj4 = hashMap0.get((java.lang.Object) 10);
        boolean boolean5 = hashMap0.isEmpty();
        int int6 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray7 = hashMap0.table;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 0, (float) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        int int3 = hashMap0.size();
        int int4 = hashMap0.modCount;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap(100);
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) 100);
        system.testclass.HashMap.Entry[] entryArray8 = hashMap0.table;
        int int9 = hashMap0.size();
        hashMap0.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        java.lang.Object obj4 = hashMap0.get((java.lang.Object) 10);
        boolean boolean5 = hashMap0.isEmpty();
        int int6 = hashMap0.size();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray8 = new system.testclass.HashMap.Entry[] {};
        hashMap7.table = entryArray8;
        java.lang.Object obj10 = hashMap0.remove((java.lang.Object) entryArray8);
        system.testclass.HashMap.Entry[] entryArray11 = hashMap0.table;
        int int12 = hashMap0.size();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        java.lang.Object obj16 = hashMap13.get((java.lang.Object) 100L);
        int int17 = hashMap13.modCount;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        hashMap18.modCount = 0;
        int int21 = hashMap18.modCount;
        int int22 = hashMap18.modCount;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray24 = new system.testclass.HashMap.Entry[] {};
        hashMap23.table = entryArray24;
        hashMap18.table = entryArray24;
        hashMap18.modCount = 0;
        int int29 = hashMap18.modCount;
        java.lang.Object obj30 = hashMap0.put((java.lang.Object) int17, (java.lang.Object) int29);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        int int3 = hashMap0.modCount;
        int int4 = hashMap0.modCount;
        java.lang.Object obj6 = hashMap0.remove((java.lang.Object) (short) 10);
        int int7 = hashMap0.modCount;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray11 = hashMap10.table;
        java.lang.Object obj12 = hashMap9.remove((java.lang.Object) hashMap10);
        boolean boolean13 = hashMap10.isEmpty();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.modCount;
        int int16 = hashMap14.modCount;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        hashMap17.modCount = 0;
        int int20 = hashMap17.modCount;
        int int21 = hashMap17.modCount;
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray23 = new system.testclass.HashMap.Entry[] {};
        hashMap22.table = entryArray23;
        hashMap17.table = entryArray23;
        java.lang.Object obj26 = hashMap14.remove((java.lang.Object) hashMap17);
        java.lang.Object obj27 = hashMap10.get((java.lang.Object) hashMap14);
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        hashMap28.modCount = 0;
        int int31 = hashMap28.modCount;
        int int32 = hashMap28.modCount;
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray34 = new system.testclass.HashMap.Entry[] {};
        hashMap33.table = entryArray34;
        hashMap28.table = entryArray34;
        hashMap14.table = entryArray34;
        boolean boolean38 = hashMap14.isEmpty();
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray42 = hashMap41.table;
        java.lang.Object obj43 = hashMap40.remove((java.lang.Object) hashMap41);
        system.testclass.HashMap.Entry[] entryArray44 = new system.testclass.HashMap.Entry[] {};
        hashMap40.table = entryArray44;
        java.lang.Object obj46 = hashMap0.put((java.lang.Object) boolean38, (java.lang.Object) hashMap40);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        int int3 = hashMap0.modCount;
        int int4 = hashMap0.size();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        hashMap8.modCount = 0;
        int int11 = hashMap8.modCount;
        int int12 = hashMap8.modCount;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray14 = new system.testclass.HashMap.Entry[] {};
        hashMap13.table = entryArray14;
        hashMap8.table = entryArray14;
        java.lang.Object obj17 = hashMap5.remove((java.lang.Object) hashMap8);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        boolean boolean19 = hashMap18.isEmpty();
        boolean boolean20 = hashMap18.isEmpty();
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray23 = hashMap22.table;
        hashMap18.table = entryArray23;
        hashMap8.table = entryArray23;
        java.lang.Object obj26 = hashMap0.get((java.lang.Object) entryArray23);
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray30 = hashMap29.table;
        java.lang.Object obj31 = hashMap28.remove((java.lang.Object) hashMap29);
        system.testclass.HashMap.Entry[] entryArray32 = new system.testclass.HashMap.Entry[] {};
        hashMap28.table = entryArray32;
        hashMap28.modCount = (byte) 0;
        java.lang.Object obj36 = hashMap0.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        int int38 = hashMap37.modCount;
        java.lang.Object obj40 = hashMap37.get((java.lang.Object) 100L);
        java.lang.Object obj42 = hashMap37.get((java.lang.Object) 10);
        system.testclass.HashMap.Entry[] entryArray43 = hashMap37.table;
        hashMap0.table = entryArray43;
        hashMap0.modCount = 0;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        int int3 = hashMap0.modCount;
        int int4 = hashMap0.size();
        boolean boolean5 = hashMap0.isEmpty();
        hashMap0.modCount = (short) 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        boolean boolean3 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap4.table;
        hashMap0.table = entryArray5;
        int int7 = hashMap0.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.modCount;
        int int10 = hashMap8.modCount;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        hashMap11.modCount = 0;
        int int14 = hashMap11.modCount;
        int int15 = hashMap11.modCount;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray17 = new system.testclass.HashMap.Entry[] {};
        hashMap16.table = entryArray17;
        hashMap11.table = entryArray17;
        java.lang.Object obj20 = hashMap8.remove((java.lang.Object) hashMap11);
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        boolean boolean22 = hashMap21.isEmpty();
        boolean boolean23 = hashMap21.isEmpty();
        system.testclass.HashMap.Entry[] entryArray24 = hashMap21.table;
        java.lang.Object obj25 = hashMap8.remove((java.lang.Object) entryArray24);
        java.lang.Object obj26 = hashMap0.get((java.lang.Object) hashMap8);
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        hashMap27.modCount = 0;
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        hashMap30.modCount = 0;
        int int33 = hashMap30.modCount;
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        int int35 = hashMap34.modCount;
        int int36 = hashMap34.modCount;
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        hashMap37.modCount = 0;
        int int40 = hashMap37.modCount;
        int int41 = hashMap37.modCount;
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray43 = new system.testclass.HashMap.Entry[] {};
        hashMap42.table = entryArray43;
        hashMap37.table = entryArray43;
        java.lang.Object obj46 = hashMap34.remove((java.lang.Object) hashMap37);
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap();
        boolean boolean48 = hashMap47.isEmpty();
        boolean boolean49 = hashMap47.isEmpty();
        system.testclass.HashMap hashMap51 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray52 = hashMap51.table;
        hashMap47.table = entryArray52;
        hashMap37.table = entryArray52;
        system.testclass.HashMap hashMap55 = new system.testclass.HashMap();
        int int56 = hashMap55.modCount;
        int int57 = hashMap55.modCount;
        system.testclass.HashMap hashMap58 = new system.testclass.HashMap();
        hashMap58.modCount = 0;
        int int61 = hashMap58.modCount;
        int int62 = hashMap58.modCount;
        system.testclass.HashMap hashMap63 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray64 = new system.testclass.HashMap.Entry[] {};
        hashMap63.table = entryArray64;
        hashMap58.table = entryArray64;
        java.lang.Object obj67 = hashMap55.remove((java.lang.Object) hashMap58);
        system.testclass.HashMap hashMap68 = new system.testclass.HashMap();
        boolean boolean69 = hashMap68.isEmpty();
        boolean boolean70 = hashMap68.isEmpty();
        system.testclass.HashMap hashMap72 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray73 = hashMap72.table;
        hashMap68.table = entryArray73;
        hashMap58.table = entryArray73;
        hashMap37.table = entryArray73;
        hashMap30.table = entryArray73;
        hashMap27.table = entryArray73;
        int int79 = hashMap27.size();
        system.testclass.HashMap.Entry[] entryArray80 = hashMap27.table;
        boolean boolean81 = hashMap27.isEmpty();
        system.testclass.HashMap hashMap82 = new system.testclass.HashMap();
        int int83 = hashMap82.modCount;
        int int84 = hashMap82.modCount;
        boolean boolean85 = hashMap82.isEmpty();
        system.testclass.HashMap hashMap86 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray87 = hashMap86.table;
        hashMap82.table = entryArray87;
        system.testclass.HashMap.Entry[] entryArray89 = hashMap82.table;
        hashMap27.table = entryArray89;
        boolean boolean91 = hashMap27.isEmpty();
        java.lang.Class<?> wildcardClass92 = hashMap27.getClass();
        java.lang.Object obj94 = hashMap0.put((java.lang.Object) hashMap27, (java.lang.Object) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) 100L);
        int int4 = hashMap0.modCount;
        boolean boolean5 = hashMap0.isEmpty();
        boolean boolean6 = hashMap0.isEmpty();
        int int7 = hashMap0.size();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap(0);
        int int10 = hashMap9.size();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        hashMap11.modCount = 0;
        int int14 = hashMap11.modCount;
        int int15 = hashMap11.modCount;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray17 = new system.testclass.HashMap.Entry[] {};
        hashMap16.table = entryArray17;
        hashMap11.table = entryArray17;
        java.lang.Object obj20 = hashMap9.get((java.lang.Object) hashMap11);
        java.lang.Object obj22 = hashMap9.get((java.lang.Object) false);
        system.testclass.HashMap.Entry[] entryArray23 = hashMap9.table;
        hashMap0.table = entryArray23;
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        int int26 = hashMap25.modCount;
        int int27 = hashMap25.modCount;
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        hashMap28.modCount = 0;
        int int31 = hashMap28.modCount;
        int int32 = hashMap28.modCount;
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray34 = new system.testclass.HashMap.Entry[] {};
        hashMap33.table = entryArray34;
        hashMap28.table = entryArray34;
        java.lang.Object obj37 = hashMap25.remove((java.lang.Object) hashMap28);
        int int38 = hashMap25.modCount;
        int int39 = hashMap25.size();
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        int int41 = hashMap40.modCount;
        int int42 = hashMap40.modCount;
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap();
        hashMap43.modCount = 0;
        int int46 = hashMap43.modCount;
        int int47 = hashMap43.modCount;
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray49 = new system.testclass.HashMap.Entry[] {};
        hashMap48.table = entryArray49;
        hashMap43.table = entryArray49;
        java.lang.Object obj52 = hashMap40.remove((java.lang.Object) hashMap43);
        system.testclass.HashMap hashMap53 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray54 = hashMap53.table;
        java.lang.Object obj55 = hashMap40.get((java.lang.Object) entryArray54);
        java.lang.Object obj56 = hashMap0.put((java.lang.Object) int39, (java.lang.Object) hashMap40);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) '#');
        int int2 = hashMap1.modCount;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap(0);
        int int5 = hashMap4.size();
        int int6 = hashMap4.size();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        int int9 = hashMap7.modCount;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        hashMap10.modCount = 0;
        int int13 = hashMap10.modCount;
        int int14 = hashMap10.modCount;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray16 = new system.testclass.HashMap.Entry[] {};
        hashMap15.table = entryArray16;
        hashMap10.table = entryArray16;
        java.lang.Object obj19 = hashMap7.remove((java.lang.Object) hashMap10);
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        boolean boolean21 = hashMap20.isEmpty();
        boolean boolean22 = hashMap20.isEmpty();
        system.testclass.HashMap.Entry[] entryArray23 = hashMap20.table;
        java.lang.Object obj24 = hashMap7.remove((java.lang.Object) entryArray23);
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        int int26 = hashMap25.modCount;
        int int27 = hashMap25.modCount;
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        hashMap28.modCount = 0;
        int int31 = hashMap28.modCount;
        int int32 = hashMap28.modCount;
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray34 = new system.testclass.HashMap.Entry[] {};
        hashMap33.table = entryArray34;
        hashMap28.table = entryArray34;
        java.lang.Object obj37 = hashMap25.remove((java.lang.Object) hashMap28);
        int int38 = hashMap25.modCount;
        int int39 = hashMap25.size();
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        int int41 = hashMap40.modCount;
        int int42 = hashMap40.modCount;
        boolean boolean43 = hashMap40.isEmpty();
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray45 = hashMap44.table;
        hashMap40.table = entryArray45;
        hashMap25.table = entryArray45;
        hashMap7.table = entryArray45;
        boolean boolean49 = hashMap7.isEmpty();
        boolean boolean50 = hashMap7.isEmpty();
        system.testclass.HashMap hashMap51 = new system.testclass.HashMap();
        int int52 = hashMap51.modCount;
        int int53 = hashMap51.modCount;
        system.testclass.HashMap.Entry[] entryArray54 = hashMap51.table;
        system.testclass.HashMap hashMap55 = new system.testclass.HashMap();
        int int56 = hashMap55.modCount;
        int int57 = hashMap55.modCount;
        boolean boolean58 = hashMap55.isEmpty();
        java.lang.Object obj59 = hashMap51.remove((java.lang.Object) hashMap55);
        system.testclass.HashMap hashMap60 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray61 = hashMap60.table;
        system.testclass.HashMap hashMap62 = new system.testclass.HashMap();
        int int63 = hashMap62.modCount;
        int int64 = hashMap62.modCount;
        java.lang.Object obj65 = null;
        java.lang.Object obj66 = hashMap62.remove(obj65);
        system.testclass.HashMap hashMap67 = new system.testclass.HashMap();
        int int68 = hashMap67.modCount;
        int int69 = hashMap67.modCount;
        int int70 = hashMap67.modCount;
        int int71 = hashMap67.size();
        system.testclass.HashMap.Entry[] entryArray72 = hashMap67.table;
        hashMap62.table = entryArray72;
        hashMap60.table = entryArray72;
        hashMap55.table = entryArray72;
        system.testclass.HashMap.Entry[] entryArray76 = hashMap55.table;
        java.lang.Object obj77 = hashMap7.remove((java.lang.Object) entryArray76);
        java.lang.Object obj78 = hashMap1.put((java.lang.Object) hashMap4, (java.lang.Object) hashMap7);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap();
        boolean boolean2 = hashMap1.isEmpty();
        boolean boolean3 = hashMap1.isEmpty();
        system.testclass.HashMap.Entry[] entryArray4 = hashMap1.table;
        hashMap0.table = entryArray4;
        int int6 = hashMap0.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap(0);
        int int9 = hashMap8.size();
        java.lang.Object obj10 = hashMap0.remove((java.lang.Object) hashMap8);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        int int13 = hashMap11.modCount;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        hashMap14.modCount = 0;
        int int17 = hashMap14.modCount;
        int int18 = hashMap14.modCount;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray20 = new system.testclass.HashMap.Entry[] {};
        hashMap19.table = entryArray20;
        hashMap14.table = entryArray20;
        java.lang.Object obj23 = hashMap11.remove((java.lang.Object) hashMap14);
        int int24 = hashMap11.modCount;
        int int25 = hashMap11.size();
        boolean boolean26 = hashMap11.isEmpty();
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray28 = new system.testclass.HashMap.Entry[] {};
        hashMap27.table = entryArray28;
        system.testclass.HashMap.Entry[] entryArray30 = hashMap27.table;
        java.lang.Object obj31 = hashMap11.remove((java.lang.Object) entryArray30);
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        int int33 = hashMap32.modCount;
        int int34 = hashMap32.modCount;
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        int int36 = hashMap35.modCount;
        int int37 = hashMap35.modCount;
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        hashMap38.modCount = 0;
        int int41 = hashMap38.modCount;
        int int42 = hashMap38.modCount;
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray44 = new system.testclass.HashMap.Entry[] {};
        hashMap43.table = entryArray44;
        hashMap38.table = entryArray44;
        java.lang.Object obj47 = hashMap35.remove((java.lang.Object) hashMap38);
        int int48 = hashMap35.modCount;
        java.lang.Object obj49 = hashMap32.get((java.lang.Object) int48);
        system.testclass.HashMap hashMap50 = new system.testclass.HashMap();
        boolean boolean51 = hashMap50.isEmpty();
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap();
        int int53 = hashMap52.modCount;
        java.lang.Object obj55 = hashMap52.get((java.lang.Object) 100L);
        system.testclass.HashMap.Entry[] entryArray56 = hashMap52.table;
        hashMap50.table = entryArray56;
        java.lang.Object obj58 = hashMap32.get((java.lang.Object) entryArray56);
        java.lang.Object obj59 = hashMap11.remove((java.lang.Object) hashMap32);
        system.testclass.HashMap hashMap60 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray61 = hashMap60.table;
        system.testclass.HashMap hashMap62 = new system.testclass.HashMap();
        int int63 = hashMap62.modCount;
        int int64 = hashMap62.modCount;
        java.lang.Object obj65 = null;
        java.lang.Object obj66 = hashMap62.remove(obj65);
        system.testclass.HashMap hashMap67 = new system.testclass.HashMap();
        int int68 = hashMap67.modCount;
        int int69 = hashMap67.modCount;
        int int70 = hashMap67.modCount;
        int int71 = hashMap67.size();
        system.testclass.HashMap.Entry[] entryArray72 = hashMap67.table;
        hashMap62.table = entryArray72;
        hashMap60.table = entryArray72;
        java.lang.Object obj75 = hashMap32.get((java.lang.Object) entryArray72);
        hashMap8.table = entryArray72;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap8", hashMap8.repOK_1());
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) ' ', (float) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        int int2 = hashMap1.size();
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        hashMap3.modCount = 0;
        int int6 = hashMap3.modCount;
        int int7 = hashMap3.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray9 = new system.testclass.HashMap.Entry[] {};
        hashMap8.table = entryArray9;
        hashMap3.table = entryArray9;
        java.lang.Object obj12 = hashMap1.get((java.lang.Object) hashMap3);
        java.lang.Object obj14 = hashMap1.get((java.lang.Object) false);
        system.testclass.HashMap.Entry[] entryArray15 = hashMap1.table;
        int int16 = hashMap1.modCount;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        int int18 = hashMap17.modCount;
        int int19 = hashMap17.modCount;
        boolean boolean20 = hashMap17.isEmpty();
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray22 = hashMap21.table;
        hashMap17.table = entryArray22;
        int int24 = hashMap17.modCount;
        system.testclass.HashMap.Entry[] entryArray25 = hashMap17.table;
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        int int27 = hashMap26.modCount;
        int int28 = hashMap26.modCount;
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        hashMap29.modCount = 0;
        int int32 = hashMap29.modCount;
        int int33 = hashMap29.modCount;
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray35 = new system.testclass.HashMap.Entry[] {};
        hashMap34.table = entryArray35;
        hashMap29.table = entryArray35;
        java.lang.Object obj38 = hashMap26.remove((java.lang.Object) hashMap29);
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        boolean boolean40 = hashMap39.isEmpty();
        boolean boolean41 = hashMap39.isEmpty();
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray44 = hashMap43.table;
        hashMap39.table = entryArray44;
        hashMap29.table = entryArray44;
        int int47 = hashMap29.size();
        system.testclass.HashMap.Entry[] entryArray48 = hashMap29.table;
        java.lang.Object obj49 = hashMap1.put((java.lang.Object) hashMap17, (java.lang.Object) hashMap29);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        hashMap6.modCount = 0;
        int int9 = hashMap6.modCount;
        int int10 = hashMap6.modCount;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray12 = new system.testclass.HashMap.Entry[] {};
        hashMap11.table = entryArray12;
        hashMap6.table = entryArray12;
        java.lang.Object obj15 = hashMap3.remove((java.lang.Object) hashMap6);
        int int16 = hashMap3.modCount;
        java.lang.Object obj17 = hashMap0.get((java.lang.Object) int16);
        int int18 = hashMap0.modCount;
        int int19 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray20 = hashMap0.table;
        int int21 = hashMap0.size();
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray25 = hashMap24.table;
        java.lang.Object obj26 = hashMap23.remove((java.lang.Object) hashMap24);
        boolean boolean27 = hashMap24.isEmpty();
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        boolean boolean30 = hashMap29.isEmpty();
        boolean boolean31 = hashMap29.isEmpty();
        system.testclass.HashMap.Entry[] entryArray32 = hashMap29.table;
        hashMap28.table = entryArray32;
        java.lang.Object obj34 = hashMap24.remove((java.lang.Object) hashMap28);
        int int35 = hashMap24.size();
        int int36 = hashMap24.modCount;
        system.testclass.HashMap.Entry[] entryArray37 = hashMap24.table;
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        hashMap38.modCount = 0;
        int int41 = hashMap38.modCount;
        int int42 = hashMap38.modCount;
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray44 = new system.testclass.HashMap.Entry[] {};
        hashMap43.table = entryArray44;
        hashMap38.table = entryArray44;
        hashMap38.modCount = 0;
        java.lang.Class<?> wildcardClass49 = hashMap38.getClass();
        java.lang.Object obj50 = hashMap0.put((java.lang.Object) hashMap24, (java.lang.Object) hashMap38);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        int int3 = hashMap2.modCount;
        java.lang.Object obj5 = hashMap2.get((java.lang.Object) 100L);
        java.lang.Object obj6 = hashMap0.remove((java.lang.Object) 100L);
        hashMap0.modCount = 'a';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray2 = hashMap1.table;
        boolean boolean3 = hashMap1.isEmpty();
        int int4 = hashMap1.modCount;
        int int5 = hashMap1.modCount;
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        boolean boolean7 = hashMap4.isEmpty();
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) hashMap4);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray10 = hashMap9.table;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        int int13 = hashMap11.modCount;
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = hashMap11.remove(obj14);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        int int17 = hashMap16.modCount;
        int int18 = hashMap16.modCount;
        int int19 = hashMap16.modCount;
        int int20 = hashMap16.size();
        system.testclass.HashMap.Entry[] entryArray21 = hashMap16.table;
        hashMap11.table = entryArray21;
        hashMap9.table = entryArray21;
        hashMap4.table = entryArray21;
        system.testclass.HashMap.Entry[] entryArray25 = hashMap4.table;
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray29 = hashMap28.table;
        java.lang.Object obj30 = hashMap27.remove((java.lang.Object) hashMap28);
        boolean boolean31 = hashMap28.isEmpty();
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        int int33 = hashMap32.modCount;
        int int34 = hashMap32.modCount;
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        hashMap35.modCount = 0;
        int int38 = hashMap35.modCount;
        int int39 = hashMap35.modCount;
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray41 = new system.testclass.HashMap.Entry[] {};
        hashMap40.table = entryArray41;
        hashMap35.table = entryArray41;
        java.lang.Object obj44 = hashMap32.remove((java.lang.Object) hashMap35);
        java.lang.Object obj45 = hashMap28.get((java.lang.Object) hashMap32);
        boolean boolean46 = hashMap28.isEmpty();
        int int47 = hashMap28.modCount;
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap();
        int int49 = hashMap48.modCount;
        int int50 = hashMap48.modCount;
        system.testclass.HashMap hashMap51 = new system.testclass.HashMap();
        int int52 = hashMap51.modCount;
        int int53 = hashMap51.modCount;
        system.testclass.HashMap hashMap54 = new system.testclass.HashMap();
        hashMap54.modCount = 0;
        int int57 = hashMap54.modCount;
        int int58 = hashMap54.modCount;
        system.testclass.HashMap hashMap59 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray60 = new system.testclass.HashMap.Entry[] {};
        hashMap59.table = entryArray60;
        hashMap54.table = entryArray60;
        java.lang.Object obj63 = hashMap51.remove((java.lang.Object) hashMap54);
        int int64 = hashMap51.modCount;
        java.lang.Object obj65 = hashMap48.get((java.lang.Object) int64);
        system.testclass.HashMap.Entry[] entryArray66 = hashMap48.table;
        java.lang.Object obj67 = hashMap28.get((java.lang.Object) entryArray66);
        hashMap4.table = entryArray66;
        boolean boolean69 = hashMap4.isEmpty();
        hashMap4.modCount = (short) 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap4", hashMap4.repOK_1());
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) '#');
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        int int3 = hashMap2.modCount;
        int int4 = hashMap2.modCount;
        system.testclass.HashMap.Entry[] entryArray5 = hashMap2.table;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.modCount;
        int int8 = hashMap6.modCount;
        boolean boolean9 = hashMap6.isEmpty();
        java.lang.Object obj10 = hashMap2.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap.Entry[] entryArray11 = hashMap6.table;
        hashMap1.table = entryArray11;
        hashMap1.modCount = ' ';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        int int2 = hashMap1.size();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap1.table;
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 10);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap4.table;
        java.lang.Object obj6 = hashMap3.remove((java.lang.Object) hashMap4);
        boolean boolean7 = hashMap4.isEmpty();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        boolean boolean11 = hashMap9.isEmpty();
        system.testclass.HashMap.Entry[] entryArray12 = hashMap9.table;
        hashMap8.table = entryArray12;
        java.lang.Object obj14 = hashMap4.remove((java.lang.Object) hashMap8);
        int int15 = hashMap4.size();
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        int int17 = hashMap16.modCount;
        int int18 = hashMap16.modCount;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        hashMap19.modCount = 0;
        int int22 = hashMap19.modCount;
        int int23 = hashMap19.modCount;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray25 = new system.testclass.HashMap.Entry[] {};
        hashMap24.table = entryArray25;
        hashMap19.table = entryArray25;
        java.lang.Object obj28 = hashMap16.remove((java.lang.Object) hashMap19);
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        boolean boolean30 = hashMap29.isEmpty();
        boolean boolean31 = hashMap29.isEmpty();
        system.testclass.HashMap.Entry[] entryArray32 = hashMap29.table;
        java.lang.Object obj33 = hashMap16.remove((java.lang.Object) entryArray32);
        hashMap4.table = entryArray32;
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        int int36 = hashMap35.modCount;
        int int37 = hashMap35.modCount;
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        hashMap38.modCount = 0;
        int int41 = hashMap38.modCount;
        int int42 = hashMap38.modCount;
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray44 = new system.testclass.HashMap.Entry[] {};
        hashMap43.table = entryArray44;
        hashMap38.table = entryArray44;
        java.lang.Object obj47 = hashMap35.remove((java.lang.Object) hashMap38);
        int int48 = hashMap35.modCount;
        int int49 = hashMap35.size();
        system.testclass.HashMap hashMap50 = new system.testclass.HashMap();
        int int51 = hashMap50.modCount;
        int int52 = hashMap50.modCount;
        boolean boolean53 = hashMap50.isEmpty();
        system.testclass.HashMap hashMap54 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray55 = hashMap54.table;
        hashMap50.table = entryArray55;
        hashMap35.table = entryArray55;
        boolean boolean58 = hashMap35.isEmpty();
        system.testclass.HashMap.Entry[] entryArray59 = hashMap35.table;
        hashMap4.table = entryArray59;
        java.lang.Class<?> wildcardClass61 = entryArray59.getClass();
        system.testclass.HashMap hashMap62 = new system.testclass.HashMap();
        int int63 = hashMap62.modCount;
        int int64 = hashMap62.modCount;
        system.testclass.HashMap hashMap65 = new system.testclass.HashMap();
        hashMap65.modCount = 0;
        int int68 = hashMap65.modCount;
        int int69 = hashMap65.modCount;
        system.testclass.HashMap hashMap70 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray71 = new system.testclass.HashMap.Entry[] {};
        hashMap70.table = entryArray71;
        hashMap65.table = entryArray71;
        java.lang.Object obj74 = hashMap62.remove((java.lang.Object) hashMap65);
        system.testclass.HashMap hashMap75 = new system.testclass.HashMap();
        boolean boolean76 = hashMap75.isEmpty();
        boolean boolean77 = hashMap75.isEmpty();
        system.testclass.HashMap hashMap79 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray80 = hashMap79.table;
        hashMap75.table = entryArray80;
        hashMap65.table = entryArray80;
        java.lang.Object obj83 = hashMap1.put((java.lang.Object) entryArray59, (java.lang.Object) entryArray80);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap2.table;
        java.lang.Object obj4 = hashMap1.remove((java.lang.Object) hashMap2);
        boolean boolean5 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        boolean boolean9 = hashMap7.isEmpty();
        system.testclass.HashMap.Entry[] entryArray10 = hashMap7.table;
        hashMap6.table = entryArray10;
        java.lang.Object obj12 = hashMap2.remove((java.lang.Object) hashMap6);
        int int13 = hashMap6.modCount;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.modCount;
        int int16 = hashMap14.modCount;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        hashMap17.modCount = 0;
        int int20 = hashMap17.modCount;
        int int21 = hashMap17.modCount;
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray23 = new system.testclass.HashMap.Entry[] {};
        hashMap22.table = entryArray23;
        hashMap17.table = entryArray23;
        java.lang.Object obj26 = hashMap14.remove((java.lang.Object) hashMap17);
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        boolean boolean28 = hashMap27.isEmpty();
        boolean boolean29 = hashMap27.isEmpty();
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray32 = hashMap31.table;
        hashMap27.table = entryArray32;
        hashMap17.table = entryArray32;
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        int int36 = hashMap35.modCount;
        int int37 = hashMap35.modCount;
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        hashMap38.modCount = 0;
        int int41 = hashMap38.modCount;
        int int42 = hashMap38.modCount;
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray44 = new system.testclass.HashMap.Entry[] {};
        hashMap43.table = entryArray44;
        hashMap38.table = entryArray44;
        java.lang.Object obj47 = hashMap35.remove((java.lang.Object) hashMap38);
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap();
        boolean boolean49 = hashMap48.isEmpty();
        boolean boolean50 = hashMap48.isEmpty();
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray53 = hashMap52.table;
        hashMap48.table = entryArray53;
        hashMap38.table = entryArray53;
        hashMap17.table = entryArray53;
        system.testclass.HashMap.Entry[] entryArray57 = hashMap17.table;
        java.lang.Object obj58 = hashMap6.get((java.lang.Object) hashMap17);
        system.testclass.HashMap hashMap60 = new system.testclass.HashMap(0);
        java.lang.Object obj62 = hashMap60.get((java.lang.Object) 100.0f);
        java.lang.Object obj63 = hashMap17.remove(obj62);
        hashMap17.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap17", hashMap17.repOK_1());
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        hashMap3.modCount = 0;
        int int6 = hashMap3.modCount;
        int int7 = hashMap3.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray9 = new system.testclass.HashMap.Entry[] {};
        hashMap8.table = entryArray9;
        hashMap3.table = entryArray9;
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap3);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        boolean boolean14 = hashMap13.isEmpty();
        boolean boolean15 = hashMap13.isEmpty();
        system.testclass.HashMap.Entry[] entryArray16 = hashMap13.table;
        java.lang.Object obj17 = hashMap0.remove((java.lang.Object) entryArray16);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        int int19 = hashMap18.modCount;
        int int20 = hashMap18.modCount;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        hashMap21.modCount = 0;
        int int24 = hashMap21.modCount;
        int int25 = hashMap21.modCount;
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray27 = new system.testclass.HashMap.Entry[] {};
        hashMap26.table = entryArray27;
        hashMap21.table = entryArray27;
        java.lang.Object obj30 = hashMap18.remove((java.lang.Object) hashMap21);
        int int31 = hashMap18.modCount;
        int int32 = hashMap18.size();
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        int int34 = hashMap33.modCount;
        int int35 = hashMap33.modCount;
        boolean boolean36 = hashMap33.isEmpty();
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray38 = hashMap37.table;
        hashMap33.table = entryArray38;
        hashMap18.table = entryArray38;
        hashMap0.table = entryArray38;
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray43 = hashMap42.table;
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap();
        boolean boolean45 = hashMap44.isEmpty();
        boolean boolean46 = hashMap44.isEmpty();
        int int47 = hashMap44.size();
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap();
        boolean boolean49 = hashMap48.isEmpty();
        boolean boolean50 = hashMap48.isEmpty();
        system.testclass.HashMap.Entry[] entryArray51 = hashMap48.table;
        hashMap44.table = entryArray51;
        hashMap42.table = entryArray51;
        system.testclass.HashMap hashMap54 = new system.testclass.HashMap();
        int int55 = hashMap54.modCount;
        int int56 = hashMap54.modCount;
        boolean boolean57 = hashMap54.isEmpty();
        system.testclass.HashMap.Entry[] entryArray58 = hashMap54.table;
        boolean boolean59 = hashMap54.isEmpty();
        java.lang.Object obj60 = hashMap0.put((java.lang.Object) hashMap42, (java.lang.Object) boolean59);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 1);
        int int2 = hashMap1.modCount;
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) 100L);
        system.testclass.HashMap.Entry[] entryArray4 = hashMap0.table;
        int int5 = hashMap0.modCount;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.modCount;
        int int8 = hashMap6.modCount;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        int int11 = hashMap9.modCount;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        hashMap12.modCount = 0;
        int int15 = hashMap12.modCount;
        int int16 = hashMap12.modCount;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray18 = new system.testclass.HashMap.Entry[] {};
        hashMap17.table = entryArray18;
        hashMap12.table = entryArray18;
        java.lang.Object obj21 = hashMap9.remove((java.lang.Object) hashMap12);
        int int22 = hashMap9.modCount;
        java.lang.Object obj23 = hashMap6.get((java.lang.Object) int22);
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        boolean boolean25 = hashMap24.isEmpty();
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        int int27 = hashMap26.modCount;
        java.lang.Object obj29 = hashMap26.get((java.lang.Object) 100L);
        system.testclass.HashMap.Entry[] entryArray30 = hashMap26.table;
        hashMap24.table = entryArray30;
        java.lang.Object obj32 = hashMap6.get((java.lang.Object) entryArray30);
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray36 = hashMap35.table;
        java.lang.Object obj37 = hashMap34.remove((java.lang.Object) hashMap35);
        boolean boolean38 = hashMap35.isEmpty();
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        int int40 = hashMap39.modCount;
        int int41 = hashMap39.modCount;
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap();
        hashMap42.modCount = 0;
        int int45 = hashMap42.modCount;
        int int46 = hashMap42.modCount;
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray48 = new system.testclass.HashMap.Entry[] {};
        hashMap47.table = entryArray48;
        hashMap42.table = entryArray48;
        java.lang.Object obj51 = hashMap39.remove((java.lang.Object) hashMap42);
        java.lang.Object obj52 = hashMap35.get((java.lang.Object) hashMap39);
        system.testclass.HashMap hashMap54 = new system.testclass.HashMap((int) '#');
        system.testclass.HashMap hashMap55 = new system.testclass.HashMap();
        int int56 = hashMap55.modCount;
        int int57 = hashMap55.modCount;
        system.testclass.HashMap.Entry[] entryArray58 = hashMap55.table;
        system.testclass.HashMap hashMap59 = new system.testclass.HashMap();
        int int60 = hashMap59.modCount;
        int int61 = hashMap59.modCount;
        boolean boolean62 = hashMap59.isEmpty();
        java.lang.Object obj63 = hashMap55.remove((java.lang.Object) hashMap59);
        system.testclass.HashMap.Entry[] entryArray64 = hashMap59.table;
        hashMap54.table = entryArray64;
        hashMap35.table = entryArray64;
        java.lang.Object obj67 = hashMap0.put((java.lang.Object) hashMap6, (java.lang.Object) entryArray64);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap2.table;
        java.lang.Object obj4 = hashMap1.remove((java.lang.Object) hashMap2);
        boolean boolean5 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        boolean boolean9 = hashMap7.isEmpty();
        system.testclass.HashMap.Entry[] entryArray10 = hashMap7.table;
        hashMap6.table = entryArray10;
        java.lang.Object obj12 = hashMap2.remove((java.lang.Object) hashMap6);
        int int13 = hashMap6.modCount;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.modCount;
        int int16 = hashMap14.modCount;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        hashMap17.modCount = 0;
        int int20 = hashMap17.modCount;
        int int21 = hashMap17.modCount;
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray23 = new system.testclass.HashMap.Entry[] {};
        hashMap22.table = entryArray23;
        hashMap17.table = entryArray23;
        java.lang.Object obj26 = hashMap14.remove((java.lang.Object) hashMap17);
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        boolean boolean28 = hashMap27.isEmpty();
        boolean boolean29 = hashMap27.isEmpty();
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray32 = hashMap31.table;
        hashMap27.table = entryArray32;
        hashMap17.table = entryArray32;
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        int int36 = hashMap35.modCount;
        int int37 = hashMap35.modCount;
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        hashMap38.modCount = 0;
        int int41 = hashMap38.modCount;
        int int42 = hashMap38.modCount;
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray44 = new system.testclass.HashMap.Entry[] {};
        hashMap43.table = entryArray44;
        hashMap38.table = entryArray44;
        java.lang.Object obj47 = hashMap35.remove((java.lang.Object) hashMap38);
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap();
        boolean boolean49 = hashMap48.isEmpty();
        boolean boolean50 = hashMap48.isEmpty();
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray53 = hashMap52.table;
        hashMap48.table = entryArray53;
        hashMap38.table = entryArray53;
        hashMap17.table = entryArray53;
        system.testclass.HashMap.Entry[] entryArray57 = hashMap17.table;
        java.lang.Object obj58 = hashMap6.get((java.lang.Object) hashMap17);
        hashMap17.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap17", hashMap17.repOK_1());
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        int int3 = hashMap0.modCount;
        int int4 = hashMap0.size();
        boolean boolean5 = hashMap0.isEmpty();
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 1);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        hashMap2.modCount = 0;
        int int5 = hashMap2.modCount;
        int int6 = hashMap2.size();
        java.lang.Object obj7 = hashMap1.get((java.lang.Object) hashMap2);
        int int8 = hashMap2.size();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        int int11 = hashMap9.modCount;
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = hashMap9.remove(obj12);
        boolean boolean14 = hashMap9.isEmpty();
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap((int) (short) 100);
        int int17 = hashMap16.size();
        java.lang.Object obj18 = hashMap2.put((java.lang.Object) hashMap9, (java.lang.Object) int17);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }
}

