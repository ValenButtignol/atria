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
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        java.lang.Object obj4 = hashMap1.put((java.lang.Object) 10.0f, (java.lang.Object) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '#', (float) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        java.lang.Object obj3 = hashMap0.remove((java.lang.Object) (short) 100);
        int int4 = hashMap0.modCount;
        int int5 = hashMap0.modCount;
        int int6 = hashMap0.modCount;
        java.lang.Object obj9 = hashMap0.put((java.lang.Object) (byte) 10, (java.lang.Object) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        int int3 = hashMap2.modCount;
        int int4 = hashMap2.modCount;
        int int5 = hashMap2.size();
        system.testclass.HashMap.Entry[] entryArray6 = new system.testclass.HashMap.Entry[] {};
        hashMap2.table = entryArray6;
        java.lang.Class<?> wildcardClass8 = entryArray6.getClass();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        int int11 = hashMap9.modCount;
        int int12 = hashMap9.size();
        system.testclass.HashMap.Entry[] entryArray13 = new system.testclass.HashMap.Entry[] {};
        hashMap9.table = entryArray13;
        hashMap9.modCount = ' ';
        java.lang.Object obj17 = hashMap0.put((java.lang.Object) entryArray6, (java.lang.Object) hashMap9);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        int int3 = hashMap2.modCount;
        int int4 = hashMap2.modCount;
        int int5 = hashMap2.size();
        java.lang.Object obj6 = hashMap1.remove((java.lang.Object) hashMap2);
        boolean boolean7 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.size();
        java.lang.Class<?> wildcardClass10 = hashMap8.getClass();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        boolean boolean12 = hashMap11.isEmpty();
        int int13 = hashMap11.size();
        hashMap11.modCount = '4';
        boolean boolean16 = hashMap11.isEmpty();
        int int17 = hashMap11.size();
        java.lang.Object obj18 = hashMap2.put((java.lang.Object) hashMap8, (java.lang.Object) hashMap11);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        java.lang.Object obj3 = hashMap0.remove((java.lang.Object) (short) 100);
        int int4 = hashMap0.modCount;
        int int5 = hashMap0.modCount;
        int int6 = hashMap0.modCount;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        int int9 = hashMap7.size();
        hashMap7.clear();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap(0);
        java.lang.Object obj13 = hashMap7.get((java.lang.Object) hashMap12);
        java.lang.Object obj15 = hashMap12.get((java.lang.Object) "");
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        boolean boolean17 = hashMap16.isEmpty();
        int int18 = hashMap16.size();
        hashMap16.clear();
        system.testclass.HashMap.Entry[] entryArray20 = hashMap16.table;
        hashMap12.table = entryArray20;
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        boolean boolean23 = hashMap22.isEmpty();
        java.lang.Object obj25 = hashMap22.remove((java.lang.Object) (short) 100);
        int int26 = hashMap22.modCount;
        int int27 = hashMap22.modCount;
        int int28 = hashMap22.modCount;
        java.lang.Object obj29 = hashMap0.put((java.lang.Object) entryArray20, (java.lang.Object) hashMap22);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        hashMap0.modCount = 0;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        boolean boolean6 = hashMap5.isEmpty();
        int int7 = hashMap5.size();
        hashMap5.clear();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap(0);
        java.lang.Object obj11 = hashMap5.get((java.lang.Object) hashMap10);
        system.testclass.HashMap.Entry[] entryArray12 = new system.testclass.HashMap.Entry[] {};
        hashMap10.table = entryArray12;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        boolean boolean15 = hashMap14.isEmpty();
        int int16 = hashMap14.size();
        java.lang.Object obj17 = hashMap0.put((java.lang.Object) hashMap10, (java.lang.Object) hashMap14);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.clear();
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = hashMap0.remove(obj2);
        int int4 = hashMap0.size();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        boolean boolean6 = hashMap5.isEmpty();
        int int7 = hashMap5.size();
        hashMap5.modCount = '4';
        boolean boolean10 = hashMap5.isEmpty();
        int int11 = hashMap5.size();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        boolean boolean13 = hashMap12.isEmpty();
        int int14 = hashMap12.size();
        hashMap12.clear();
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap(0);
        java.lang.Object obj18 = hashMap12.get((java.lang.Object) hashMap17);
        system.testclass.HashMap.Entry[] entryArray19 = new system.testclass.HashMap.Entry[] {};
        hashMap17.table = entryArray19;
        hashMap5.table = entryArray19;
        java.lang.Class<?> wildcardClass22 = hashMap5.getClass();
        java.lang.Object obj24 = hashMap0.put((java.lang.Object) hashMap5, (java.lang.Object) (-1.0d));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 100, (float) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 100, (float) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        java.lang.Object obj3 = hashMap1.remove((java.lang.Object) (-1.0f));
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.modCount;
        int int8 = hashMap6.modCount;
        int int9 = hashMap6.size();
        hashMap6.clear();
        hashMap6.modCount = (short) 1;
        java.lang.Object obj13 = hashMap1.put((java.lang.Object) hashMap4, (java.lang.Object) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 100, (float) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 100);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        java.lang.Object obj3 = hashMap1.get((java.lang.Object) hashMap2);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        boolean boolean6 = hashMap5.isEmpty();
        int int7 = hashMap5.size();
        hashMap5.clear();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap(0);
        java.lang.Object obj11 = hashMap5.get((java.lang.Object) hashMap10);
        java.lang.Object obj13 = hashMap10.get((java.lang.Object) "");
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        boolean boolean15 = hashMap14.isEmpty();
        int int16 = hashMap14.size();
        hashMap14.clear();
        system.testclass.HashMap.Entry[] entryArray18 = hashMap14.table;
        hashMap10.table = entryArray18;
        hashMap10.clear();
        java.lang.Object obj21 = hashMap1.put((java.lang.Object) 100.0d, (java.lang.Object) hashMap10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        java.lang.Object obj3 = hashMap0.remove((java.lang.Object) (short) 100);
        int int4 = hashMap0.modCount;
        int int5 = hashMap0.modCount;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        java.lang.Object obj9 = hashMap6.remove((java.lang.Object) (short) 100);
        int int10 = hashMap6.modCount;
        int int11 = hashMap6.modCount;
        java.lang.Object obj13 = hashMap0.put((java.lang.Object) hashMap6, (java.lang.Object) 1.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        java.lang.Object obj3 = hashMap1.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = hashMap1.remove((java.lang.Object) 0.0d);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        int int8 = hashMap6.size();
        hashMap6.clear();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap(0);
        java.lang.Object obj12 = hashMap6.get((java.lang.Object) hashMap11);
        hashMap6.clear();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.modCount;
        int int16 = hashMap14.modCount;
        boolean boolean17 = hashMap14.isEmpty();
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        boolean boolean19 = hashMap18.isEmpty();
        int int20 = hashMap18.size();
        hashMap18.modCount = '4';
        boolean boolean23 = hashMap18.isEmpty();
        int int24 = hashMap18.size();
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        boolean boolean26 = hashMap25.isEmpty();
        int int27 = hashMap25.size();
        hashMap25.clear();
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap(0);
        java.lang.Object obj31 = hashMap25.get((java.lang.Object) hashMap30);
        system.testclass.HashMap.Entry[] entryArray32 = new system.testclass.HashMap.Entry[] {};
        hashMap30.table = entryArray32;
        hashMap18.table = entryArray32;
        hashMap14.table = entryArray32;
        java.lang.Class<?> wildcardClass36 = hashMap14.getClass();
        java.lang.Object obj37 = hashMap1.put((java.lang.Object) hashMap6, (java.lang.Object) hashMap14);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '#', (float) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 1, (float) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        hashMap0.modCount = 0;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        boolean boolean6 = hashMap5.isEmpty();
        int int7 = hashMap5.size();
        hashMap5.clear();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap(0);
        java.lang.Object obj11 = hashMap5.get((java.lang.Object) hashMap10);
        java.lang.Object obj13 = hashMap10.get((java.lang.Object) "");
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        boolean boolean15 = hashMap14.isEmpty();
        int int16 = hashMap14.size();
        hashMap14.clear();
        system.testclass.HashMap.Entry[] entryArray18 = hashMap14.table;
        hashMap10.table = entryArray18;
        hashMap0.table = entryArray18;
        hashMap0.modCount = (byte) 1;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        int int24 = hashMap23.modCount;
        int int25 = hashMap23.modCount;
        hashMap23.clear();
        int int27 = hashMap23.modCount;
        int int28 = hashMap23.modCount;
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        boolean boolean30 = hashMap29.isEmpty();
        int int31 = hashMap29.size();
        hashMap29.modCount = '4';
        boolean boolean34 = hashMap29.isEmpty();
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        hashMap35.clear();
        java.lang.Object obj37 = null;
        java.lang.Object obj38 = hashMap35.remove(obj37);
        system.testclass.HashMap.Entry[] entryArray39 = new system.testclass.HashMap.Entry[] {};
        hashMap35.table = entryArray39;
        java.lang.Object obj41 = hashMap29.get((java.lang.Object) hashMap35);
        boolean boolean42 = hashMap35.isEmpty();
        java.lang.Object obj43 = hashMap23.remove((java.lang.Object) hashMap35);
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap(0);
        boolean boolean46 = hashMap45.isEmpty();
        java.lang.Object obj47 = hashMap0.put(obj43, (java.lang.Object) hashMap45);
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
        hashMap0.clear();
        int int4 = hashMap0.modCount;
        int int5 = hashMap0.modCount;
        java.lang.Object obj6 = new java.lang.Object();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        java.lang.Object obj9 = hashMap0.put(obj6, (java.lang.Object) boolean8);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        int int3 = hashMap0.size();
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) false, (java.lang.Object) true);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap(0);
        java.lang.Object obj6 = hashMap0.get((java.lang.Object) hashMap5);
        java.lang.Object obj8 = hashMap5.remove((java.lang.Object) (byte) 10);
        int int9 = hashMap5.modCount;
        boolean boolean10 = hashMap5.isEmpty();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        hashMap11.modCount = 0;
        hashMap11.modCount = 0;
        int int16 = hashMap11.modCount;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap(0);
        java.lang.Object obj19 = hashMap11.get((java.lang.Object) hashMap18);
        hashMap11.clear();
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        int int22 = hashMap21.modCount;
        int int23 = hashMap21.modCount;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.modCount;
        int int26 = hashMap24.modCount;
        int int27 = hashMap24.size();
        system.testclass.HashMap.Entry[] entryArray28 = new system.testclass.HashMap.Entry[] {};
        hashMap24.table = entryArray28;
        hashMap21.table = entryArray28;
        java.lang.Object obj31 = hashMap5.put((java.lang.Object) hashMap11, (java.lang.Object) hashMap21);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap5", hashMap5.repOK_1());
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap(0);
        java.lang.Object obj6 = hashMap0.get((java.lang.Object) hashMap5);
        java.lang.Object obj8 = hashMap5.remove((java.lang.Object) (byte) 10);
        hashMap5.clear();
        int int10 = hashMap5.modCount;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        int int13 = hashMap11.modCount;
        int int14 = hashMap11.size();
        system.testclass.HashMap.Entry[] entryArray15 = new system.testclass.HashMap.Entry[] {};
        hashMap11.table = entryArray15;
        system.testclass.HashMap.Entry[] entryArray17 = new system.testclass.HashMap.Entry[] {};
        hashMap11.table = entryArray17;
        java.lang.Object obj19 = hashMap5.remove((java.lang.Object) entryArray17);
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        boolean boolean21 = hashMap20.isEmpty();
        int int22 = hashMap20.size();
        hashMap20.modCount = '4';
        boolean boolean25 = hashMap20.isEmpty();
        int int26 = hashMap20.size();
        hashMap20.modCount = (byte) 100;
        java.lang.Object obj30 = hashMap20.remove((java.lang.Object) 10);
        java.lang.Object obj31 = hashMap5.get((java.lang.Object) hashMap20);
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        int int35 = hashMap34.modCount;
        int int36 = hashMap34.modCount;
        int int37 = hashMap34.size();
        system.testclass.HashMap.Entry[] entryArray38 = new system.testclass.HashMap.Entry[] {};
        hashMap34.table = entryArray38;
        system.testclass.HashMap.Entry[] entryArray40 = new system.testclass.HashMap.Entry[] {};
        hashMap34.table = entryArray40;
        system.testclass.HashMap.Entry[] entryArray42 = hashMap34.table;
        hashMap33.table = entryArray42;
        java.lang.Object obj44 = hashMap20.remove((java.lang.Object) entryArray42);
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        boolean boolean46 = hashMap45.isEmpty();
        int int47 = hashMap45.size();
        hashMap45.clear();
        system.testclass.HashMap.Entry[] entryArray49 = hashMap45.table;
        int int50 = hashMap45.size();
        int int51 = hashMap45.modCount;
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap();
        int int53 = hashMap52.modCount;
        int int54 = hashMap52.modCount;
        boolean boolean55 = hashMap52.isEmpty();
        system.testclass.HashMap hashMap56 = new system.testclass.HashMap();
        boolean boolean57 = hashMap56.isEmpty();
        int int58 = hashMap56.size();
        hashMap56.modCount = '4';
        boolean boolean61 = hashMap56.isEmpty();
        int int62 = hashMap56.size();
        system.testclass.HashMap hashMap63 = new system.testclass.HashMap();
        boolean boolean64 = hashMap63.isEmpty();
        int int65 = hashMap63.size();
        hashMap63.clear();
        system.testclass.HashMap hashMap68 = new system.testclass.HashMap(0);
        java.lang.Object obj69 = hashMap63.get((java.lang.Object) hashMap68);
        system.testclass.HashMap.Entry[] entryArray70 = new system.testclass.HashMap.Entry[] {};
        hashMap68.table = entryArray70;
        hashMap56.table = entryArray70;
        hashMap52.table = entryArray70;
        java.lang.Object obj74 = hashMap20.put((java.lang.Object) hashMap45, (java.lang.Object) entryArray70);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap20", hashMap20.repOK_1());
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 0);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap(0);
        java.lang.Object obj5 = hashMap3.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj7 = hashMap3.remove((java.lang.Object) 0.0d);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap(0);
        hashMap9.modCount = (byte) 10;
        java.lang.Object obj12 = hashMap1.put(obj7, (java.lang.Object) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        hashMap2.clear();
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = hashMap2.remove(obj4);
        system.testclass.HashMap.Entry[] entryArray6 = new system.testclass.HashMap.Entry[] {};
        hashMap2.table = entryArray6;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.modCount;
        int int10 = hashMap8.modCount;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        int int13 = hashMap11.modCount;
        int int14 = hashMap11.size();
        system.testclass.HashMap.Entry[] entryArray15 = new system.testclass.HashMap.Entry[] {};
        hashMap11.table = entryArray15;
        hashMap8.table = entryArray15;
        int int18 = hashMap8.size();
        java.lang.Object obj19 = hashMap1.put((java.lang.Object) entryArray6, (java.lang.Object) hashMap8);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        hashMap0.modCount = 0;
        int int5 = hashMap0.modCount;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap(0);
        java.lang.Object obj8 = hashMap0.get((java.lang.Object) hashMap7);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap(0);
        boolean boolean11 = hashMap10.isEmpty();
        hashMap10.modCount = (byte) -1;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        hashMap14.modCount = 0;
        hashMap14.modCount = 0;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        boolean boolean20 = hashMap19.isEmpty();
        int int21 = hashMap19.size();
        hashMap19.clear();
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap(0);
        java.lang.Object obj25 = hashMap19.get((java.lang.Object) hashMap24);
        java.lang.Object obj27 = hashMap24.get((java.lang.Object) "");
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        boolean boolean29 = hashMap28.isEmpty();
        int int30 = hashMap28.size();
        hashMap28.clear();
        system.testclass.HashMap.Entry[] entryArray32 = hashMap28.table;
        hashMap24.table = entryArray32;
        hashMap14.table = entryArray32;
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        int int36 = hashMap35.modCount;
        int int37 = hashMap35.modCount;
        int int38 = hashMap35.size();
        system.testclass.HashMap.Entry[] entryArray39 = new system.testclass.HashMap.Entry[] {};
        hashMap35.table = entryArray39;
        system.testclass.HashMap.Entry[] entryArray41 = new system.testclass.HashMap.Entry[] {};
        hashMap35.table = entryArray41;
        int int43 = hashMap35.modCount;
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap();
        boolean boolean45 = hashMap44.isEmpty();
        int int46 = hashMap44.size();
        hashMap44.clear();
        system.testclass.HashMap hashMap49 = new system.testclass.HashMap(0);
        java.lang.Object obj50 = hashMap44.get((java.lang.Object) hashMap49);
        java.lang.Object obj52 = hashMap49.get((java.lang.Object) "");
        hashMap49.clear();
        system.testclass.HashMap hashMap54 = new system.testclass.HashMap();
        boolean boolean55 = hashMap54.isEmpty();
        int int56 = hashMap54.size();
        hashMap54.modCount = '4';
        boolean boolean59 = hashMap54.isEmpty();
        system.testclass.HashMap hashMap60 = new system.testclass.HashMap();
        hashMap60.clear();
        java.lang.Object obj62 = null;
        java.lang.Object obj63 = hashMap60.remove(obj62);
        system.testclass.HashMap.Entry[] entryArray64 = new system.testclass.HashMap.Entry[] {};
        hashMap60.table = entryArray64;
        java.lang.Object obj66 = hashMap54.get((java.lang.Object) hashMap60);
        system.testclass.HashMap hashMap67 = new system.testclass.HashMap();
        int int68 = hashMap67.modCount;
        int int69 = hashMap67.modCount;
        int int70 = hashMap67.size();
        system.testclass.HashMap.Entry[] entryArray71 = new system.testclass.HashMap.Entry[] {};
        hashMap67.table = entryArray71;
        hashMap60.table = entryArray71;
        hashMap49.table = entryArray71;
        hashMap35.table = entryArray71;
        java.lang.Object obj76 = hashMap14.get((java.lang.Object) hashMap35);
        java.lang.Object obj77 = hashMap7.put((java.lang.Object) hashMap10, (java.lang.Object) hashMap35);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap7", hashMap7.repOK_1());
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(10, (float) 10);
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
        int int4 = hashMap0.size();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        int int8 = hashMap5.size();
        system.testclass.HashMap.Entry[] entryArray9 = new system.testclass.HashMap.Entry[] {};
        hashMap5.table = entryArray9;
        java.lang.Object obj11 = hashMap0.get((java.lang.Object) hashMap5);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        boolean boolean13 = hashMap12.isEmpty();
        int int14 = hashMap12.size();
        hashMap12.clear();
        system.testclass.HashMap.Entry[] entryArray16 = hashMap12.table;
        hashMap0.table = entryArray16;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        boolean boolean19 = hashMap18.isEmpty();
        int int20 = hashMap18.size();
        hashMap18.modCount = '4';
        boolean boolean23 = hashMap18.isEmpty();
        hashMap18.modCount = (byte) 10;
        java.lang.Object obj26 = null;
        java.lang.Object obj27 = hashMap0.put((java.lang.Object) (byte) 10, obj26);
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
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        int int9 = hashMap7.modCount;
        int int10 = hashMap7.size();
        system.testclass.HashMap.Entry[] entryArray11 = new system.testclass.HashMap.Entry[] {};
        hashMap7.table = entryArray11;
        hashMap4.table = entryArray11;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.modCount;
        int int16 = hashMap14.modCount;
        int int17 = hashMap14.size();
        system.testclass.HashMap.Entry[] entryArray18 = new system.testclass.HashMap.Entry[] {};
        hashMap14.table = entryArray18;
        java.lang.Object obj20 = hashMap0.put((java.lang.Object) hashMap4, (java.lang.Object) hashMap14);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap(0);
        java.lang.Object obj6 = hashMap0.get((java.lang.Object) hashMap5);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.modCount;
        int int10 = hashMap8.modCount;
        boolean boolean11 = hashMap8.isEmpty();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        boolean boolean13 = hashMap12.isEmpty();
        int int14 = hashMap12.size();
        hashMap12.modCount = '4';
        boolean boolean17 = hashMap12.isEmpty();
        int int18 = hashMap12.size();
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        boolean boolean20 = hashMap19.isEmpty();
        int int21 = hashMap19.size();
        hashMap19.clear();
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap(0);
        java.lang.Object obj25 = hashMap19.get((java.lang.Object) hashMap24);
        system.testclass.HashMap.Entry[] entryArray26 = new system.testclass.HashMap.Entry[] {};
        hashMap24.table = entryArray26;
        hashMap12.table = entryArray26;
        hashMap8.table = entryArray26;
        hashMap8.modCount = (byte) 1;
        java.lang.Object obj32 = hashMap5.put((java.lang.Object) (byte) 10, (java.lang.Object) hashMap8);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap5", hashMap5.repOK_1());
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.clear();
        hashMap0.clear();
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        boolean boolean6 = hashMap3.isEmpty();
        hashMap3.modCount = '#';
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        int int11 = hashMap9.size();
        hashMap9.modCount = '4';
        boolean boolean14 = hashMap9.isEmpty();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        hashMap15.clear();
        java.lang.Object obj17 = null;
        java.lang.Object obj18 = hashMap15.remove(obj17);
        system.testclass.HashMap.Entry[] entryArray19 = new system.testclass.HashMap.Entry[] {};
        hashMap15.table = entryArray19;
        java.lang.Object obj21 = hashMap9.get((java.lang.Object) hashMap15);
        hashMap15.modCount = ' ';
        java.lang.Object obj24 = hashMap0.put((java.lang.Object) '#', (java.lang.Object) hashMap15);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        java.lang.Object obj3 = hashMap0.remove((java.lang.Object) (short) 100);
        int int4 = hashMap0.modCount;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        hashMap6.modCount = 0;
        hashMap6.modCount = 0;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        boolean boolean12 = hashMap11.isEmpty();
        int int13 = hashMap11.size();
        hashMap11.clear();
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap(0);
        java.lang.Object obj17 = hashMap11.get((java.lang.Object) hashMap16);
        java.lang.Object obj19 = hashMap16.get((java.lang.Object) "");
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        boolean boolean21 = hashMap20.isEmpty();
        int int22 = hashMap20.size();
        hashMap20.clear();
        system.testclass.HashMap.Entry[] entryArray24 = hashMap20.table;
        hashMap16.table = entryArray24;
        hashMap6.table = entryArray24;
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        int int28 = hashMap27.modCount;
        int int29 = hashMap27.modCount;
        int int30 = hashMap27.size();
        system.testclass.HashMap.Entry[] entryArray31 = new system.testclass.HashMap.Entry[] {};
        hashMap27.table = entryArray31;
        system.testclass.HashMap.Entry[] entryArray33 = new system.testclass.HashMap.Entry[] {};
        hashMap27.table = entryArray33;
        int int35 = hashMap27.modCount;
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        boolean boolean37 = hashMap36.isEmpty();
        int int38 = hashMap36.size();
        hashMap36.clear();
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap(0);
        java.lang.Object obj42 = hashMap36.get((java.lang.Object) hashMap41);
        java.lang.Object obj44 = hashMap41.get((java.lang.Object) "");
        hashMap41.clear();
        system.testclass.HashMap hashMap46 = new system.testclass.HashMap();
        boolean boolean47 = hashMap46.isEmpty();
        int int48 = hashMap46.size();
        hashMap46.modCount = '4';
        boolean boolean51 = hashMap46.isEmpty();
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap();
        hashMap52.clear();
        java.lang.Object obj54 = null;
        java.lang.Object obj55 = hashMap52.remove(obj54);
        system.testclass.HashMap.Entry[] entryArray56 = new system.testclass.HashMap.Entry[] {};
        hashMap52.table = entryArray56;
        java.lang.Object obj58 = hashMap46.get((java.lang.Object) hashMap52);
        system.testclass.HashMap hashMap59 = new system.testclass.HashMap();
        int int60 = hashMap59.modCount;
        int int61 = hashMap59.modCount;
        int int62 = hashMap59.size();
        system.testclass.HashMap.Entry[] entryArray63 = new system.testclass.HashMap.Entry[] {};
        hashMap59.table = entryArray63;
        hashMap52.table = entryArray63;
        hashMap41.table = entryArray63;
        hashMap27.table = entryArray63;
        java.lang.Object obj68 = hashMap6.get((java.lang.Object) hashMap27);
        int int69 = hashMap27.size();
        java.lang.Object obj70 = hashMap0.put((java.lang.Object) hashMap5, (java.lang.Object) hashMap27);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 10, 10.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(10, (float) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        int int4 = hashMap0.modCount;
        int int5 = hashMap0.modCount;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        int int8 = hashMap6.size();
        hashMap6.modCount = '4';
        boolean boolean11 = hashMap6.isEmpty();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        hashMap12.clear();
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = hashMap12.remove(obj14);
        system.testclass.HashMap.Entry[] entryArray16 = new system.testclass.HashMap.Entry[] {};
        hashMap12.table = entryArray16;
        java.lang.Object obj18 = hashMap6.get((java.lang.Object) hashMap12);
        boolean boolean19 = hashMap12.isEmpty();
        java.lang.Object obj20 = hashMap0.remove((java.lang.Object) hashMap12);
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        int int22 = hashMap21.modCount;
        int int23 = hashMap21.modCount;
        int int24 = hashMap21.modCount;
        hashMap21.modCount = 'a';
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        int int28 = hashMap27.modCount;
        int int29 = hashMap27.modCount;
        boolean boolean30 = hashMap27.isEmpty();
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        boolean boolean32 = hashMap31.isEmpty();
        int int33 = hashMap31.size();
        hashMap31.modCount = '4';
        boolean boolean36 = hashMap31.isEmpty();
        int int37 = hashMap31.size();
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        boolean boolean39 = hashMap38.isEmpty();
        int int40 = hashMap38.size();
        hashMap38.clear();
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap(0);
        java.lang.Object obj44 = hashMap38.get((java.lang.Object) hashMap43);
        system.testclass.HashMap.Entry[] entryArray45 = new system.testclass.HashMap.Entry[] {};
        hashMap43.table = entryArray45;
        hashMap31.table = entryArray45;
        hashMap27.table = entryArray45;
        hashMap21.table = entryArray45;
        java.lang.Object obj50 = null;
        java.lang.Object obj51 = hashMap0.put((java.lang.Object) hashMap21, obj50);
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
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap(0);
        java.lang.Object obj6 = hashMap0.get((java.lang.Object) hashMap5);
        java.lang.Object obj8 = hashMap5.get((java.lang.Object) "");
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        int int11 = hashMap9.size();
        hashMap9.clear();
        system.testclass.HashMap.Entry[] entryArray13 = hashMap9.table;
        hashMap5.table = entryArray13;
        hashMap5.clear();
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        boolean boolean17 = hashMap16.isEmpty();
        int int18 = hashMap16.size();
        hashMap16.clear();
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap(0);
        java.lang.Object obj22 = hashMap16.get((java.lang.Object) hashMap21);
        system.testclass.HashMap.Entry[] entryArray23 = hashMap21.table;
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap(0);
        java.lang.Object obj27 = hashMap25.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj29 = hashMap25.remove((java.lang.Object) 0.0d);
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        hashMap30.clear();
        java.lang.Object obj32 = null;
        java.lang.Object obj33 = hashMap30.remove(obj32);
        java.lang.Object obj34 = hashMap25.remove((java.lang.Object) hashMap30);
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        boolean boolean36 = hashMap35.isEmpty();
        int int37 = hashMap35.size();
        hashMap35.clear();
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap(0);
        java.lang.Object obj41 = hashMap35.get((java.lang.Object) hashMap40);
        java.lang.Object obj43 = hashMap40.remove((java.lang.Object) (byte) 10);
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap();
        int int45 = hashMap44.size();
        java.lang.Object obj46 = hashMap40.get((java.lang.Object) hashMap44);
        java.lang.Object obj47 = hashMap25.remove((java.lang.Object) hashMap44);
        java.lang.Object obj48 = hashMap5.put((java.lang.Object) hashMap21, (java.lang.Object) hashMap25);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap5", hashMap5.repOK_1());
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap();
        int int2 = hashMap1.modCount;
        int int3 = hashMap1.modCount;
        int int4 = hashMap1.size();
        hashMap1.clear();
        hashMap1.modCount = (short) 1;
        java.lang.Object obj8 = hashMap0.get((java.lang.Object) hashMap1);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        int int11 = hashMap9.size();
        hashMap9.clear();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap(0);
        java.lang.Object obj15 = hashMap9.get((java.lang.Object) hashMap14);
        java.lang.Object obj17 = hashMap14.remove((java.lang.Object) (byte) 10);
        hashMap14.clear();
        int int19 = hashMap14.modCount;
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        int int21 = hashMap20.modCount;
        int int22 = hashMap20.modCount;
        int int23 = hashMap20.size();
        system.testclass.HashMap.Entry[] entryArray24 = new system.testclass.HashMap.Entry[] {};
        hashMap20.table = entryArray24;
        system.testclass.HashMap.Entry[] entryArray26 = new system.testclass.HashMap.Entry[] {};
        hashMap20.table = entryArray26;
        java.lang.Object obj28 = hashMap14.remove((java.lang.Object) entryArray26);
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        boolean boolean30 = hashMap29.isEmpty();
        int int31 = hashMap29.size();
        hashMap29.modCount = '4';
        boolean boolean34 = hashMap29.isEmpty();
        int int35 = hashMap29.size();
        hashMap29.modCount = (byte) 100;
        java.lang.Object obj39 = hashMap29.remove((java.lang.Object) 10);
        java.lang.Object obj40 = hashMap14.get((java.lang.Object) hashMap29);
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        boolean boolean42 = hashMap41.isEmpty();
        boolean boolean43 = hashMap41.isEmpty();
        boolean boolean44 = hashMap41.isEmpty();
        java.lang.Object obj45 = hashMap14.remove((java.lang.Object) hashMap41);
        system.testclass.HashMap hashMap46 = new system.testclass.HashMap();
        boolean boolean47 = hashMap46.isEmpty();
        boolean boolean48 = hashMap46.isEmpty();
        java.lang.Object obj49 = hashMap1.put((java.lang.Object) hashMap41, (java.lang.Object) hashMap46);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        int int7 = hashMap4.modCount;
        hashMap4.modCount = 'a';
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.modCount;
        int int12 = hashMap10.modCount;
        boolean boolean13 = hashMap10.isEmpty();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        boolean boolean15 = hashMap14.isEmpty();
        int int16 = hashMap14.size();
        hashMap14.modCount = '4';
        boolean boolean19 = hashMap14.isEmpty();
        int int20 = hashMap14.size();
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        boolean boolean22 = hashMap21.isEmpty();
        int int23 = hashMap21.size();
        hashMap21.clear();
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap(0);
        java.lang.Object obj27 = hashMap21.get((java.lang.Object) hashMap26);
        system.testclass.HashMap.Entry[] entryArray28 = new system.testclass.HashMap.Entry[] {};
        hashMap26.table = entryArray28;
        hashMap14.table = entryArray28;
        hashMap10.table = entryArray28;
        hashMap4.table = entryArray28;
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        boolean boolean34 = hashMap33.isEmpty();
        boolean boolean35 = hashMap33.isEmpty();
        java.lang.Object obj36 = hashMap0.put((java.lang.Object) hashMap4, (java.lang.Object) boolean35);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 0, (float) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        hashMap0.modCount = 0;
        int int5 = hashMap0.modCount;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap(0);
        java.lang.Object obj8 = hashMap0.get((java.lang.Object) hashMap7);
        boolean boolean9 = hashMap7.isEmpty();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        int int12 = hashMap10.size();
        hashMap10.clear();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap(0);
        java.lang.Object obj16 = hashMap10.get((java.lang.Object) hashMap15);
        java.lang.Object obj18 = hashMap15.get((java.lang.Object) "");
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        hashMap19.clear();
        system.testclass.HashMap.Entry[] entryArray21 = hashMap19.table;
        java.lang.Object obj22 = hashMap15.get((java.lang.Object) entryArray21);
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap(100);
        int int25 = hashMap24.size();
        java.lang.Object obj26 = hashMap7.put(obj22, (java.lang.Object) hashMap24);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap7", hashMap7.repOK_1());
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(100, (float) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(100, (float) 32);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 100);
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
        hashMap0.clear();
        system.testclass.HashMap.Entry[] entryArray4 = hashMap0.table;
        int int5 = hashMap0.size();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.modCount;
        int int8 = hashMap6.modCount;
        hashMap6.clear();
        int int10 = hashMap6.size();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap(0);
        boolean boolean13 = hashMap12.isEmpty();
        hashMap12.modCount = (byte) -1;
        java.lang.Object obj16 = hashMap6.get((java.lang.Object) hashMap12);
        java.lang.Object obj17 = hashMap0.remove(obj16);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap(0);
        hashMap19.modCount = (byte) 10;
        system.testclass.HashMap.Entry[] entryArray22 = hashMap19.table;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        int int24 = hashMap23.modCount;
        int int25 = hashMap23.modCount;
        int int26 = hashMap23.size();
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        boolean boolean28 = hashMap27.isEmpty();
        int int29 = hashMap27.size();
        hashMap27.clear();
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap(0);
        java.lang.Object obj33 = hashMap27.get((java.lang.Object) hashMap32);
        java.lang.Object obj35 = hashMap32.remove((java.lang.Object) (byte) 10);
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        int int37 = hashMap36.size();
        java.lang.Object obj38 = hashMap32.get((java.lang.Object) hashMap36);
        system.testclass.HashMap.Entry[] entryArray39 = hashMap36.table;
        hashMap23.table = entryArray39;
        java.lang.Object obj41 = hashMap0.put((java.lang.Object) hashMap19, (java.lang.Object) hashMap23);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap();
        int int2 = hashMap1.modCount;
        int int3 = hashMap1.modCount;
        int int4 = hashMap1.size();
        hashMap1.clear();
        hashMap1.modCount = (short) 1;
        java.lang.Object obj8 = hashMap0.get((java.lang.Object) hashMap1);
        system.testclass.HashMap.Entry[] entryArray9 = hashMap1.table;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap((int) (byte) 100);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        java.lang.Object obj13 = hashMap11.get((java.lang.Object) hashMap12);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        boolean boolean15 = hashMap14.isEmpty();
        boolean boolean16 = hashMap14.isEmpty();
        int int17 = hashMap14.size();
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap(0);
        java.lang.Object obj21 = hashMap19.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj23 = hashMap19.remove((java.lang.Object) 0.0d);
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        hashMap24.clear();
        java.lang.Object obj26 = null;
        java.lang.Object obj27 = hashMap24.remove(obj26);
        system.testclass.HashMap.Entry[] entryArray28 = new system.testclass.HashMap.Entry[] {};
        hashMap24.table = entryArray28;
        hashMap19.table = entryArray28;
        java.lang.Object obj31 = hashMap14.remove((java.lang.Object) hashMap19);
        java.lang.Object obj32 = hashMap1.put((java.lang.Object) hashMap11, obj31);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        java.lang.Object obj3 = hashMap1.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = hashMap1.remove((java.lang.Object) 0.0d);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        hashMap6.clear();
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = hashMap6.remove(obj8);
        java.lang.Object obj10 = hashMap1.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        boolean boolean13 = hashMap12.isEmpty();
        int int14 = hashMap12.size();
        hashMap12.clear();
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap(0);
        java.lang.Object obj18 = hashMap12.get((java.lang.Object) hashMap17);
        java.lang.Object obj20 = hashMap17.get((java.lang.Object) "");
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        boolean boolean22 = hashMap21.isEmpty();
        int int23 = hashMap21.size();
        hashMap21.clear();
        system.testclass.HashMap.Entry[] entryArray25 = hashMap21.table;
        hashMap17.table = entryArray25;
        hashMap17.clear();
        hashMap17.modCount = (byte) 10;
        java.lang.Object obj30 = hashMap6.put((java.lang.Object) 10.0d, (java.lang.Object) hashMap17);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap6", hashMap6.repOK_1());
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.modCount = '4';
        boolean boolean5 = hashMap0.isEmpty();
        int int6 = hashMap0.size();
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) true);
        hashMap0.modCount = '4';
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        int int13 = hashMap11.modCount;
        hashMap11.clear();
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = hashMap0.put((java.lang.Object) hashMap11, obj15);
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
        hashMap0.clear();
        int int4 = hashMap0.size();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap(0);
        boolean boolean7 = hashMap6.isEmpty();
        hashMap6.modCount = (byte) -1;
        java.lang.Object obj10 = hashMap0.get((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        boolean boolean12 = hashMap11.isEmpty();
        int int13 = hashMap11.size();
        hashMap11.clear();
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap(0);
        java.lang.Object obj17 = hashMap11.get((java.lang.Object) hashMap16);
        java.lang.Object obj19 = hashMap16.remove((java.lang.Object) (byte) 10);
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        int int21 = hashMap20.size();
        java.lang.Object obj22 = hashMap16.get((java.lang.Object) hashMap20);
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap((int) (byte) 100);
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        java.lang.Object obj26 = hashMap24.get((java.lang.Object) hashMap25);
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap(0);
        java.lang.Object obj30 = hashMap28.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj32 = hashMap28.remove((java.lang.Object) 0.0d);
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        hashMap33.clear();
        java.lang.Object obj35 = null;
        java.lang.Object obj36 = hashMap33.remove(obj35);
        system.testclass.HashMap.Entry[] entryArray37 = new system.testclass.HashMap.Entry[] {};
        hashMap33.table = entryArray37;
        hashMap28.table = entryArray37;
        java.lang.Object obj40 = hashMap24.remove((java.lang.Object) entryArray37);
        java.lang.Object obj41 = hashMap6.put(obj22, (java.lang.Object) entryArray37);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap6", hashMap6.repOK_1());
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        java.lang.Object obj3 = hashMap0.remove((java.lang.Object) (short) 100);
        int int4 = hashMap0.modCount;
        int int5 = hashMap0.modCount;
        boolean boolean6 = hashMap0.isEmpty();
        int int7 = hashMap0.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.modCount;
        int int10 = hashMap8.modCount;
        int int11 = hashMap8.size();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        boolean boolean13 = hashMap12.isEmpty();
        int int14 = hashMap12.size();
        hashMap12.clear();
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap(0);
        java.lang.Object obj18 = hashMap12.get((java.lang.Object) hashMap17);
        java.lang.Object obj20 = hashMap17.remove((java.lang.Object) (byte) 10);
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        int int22 = hashMap21.size();
        java.lang.Object obj23 = hashMap17.get((java.lang.Object) hashMap21);
        system.testclass.HashMap.Entry[] entryArray24 = hashMap21.table;
        hashMap8.table = entryArray24;
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        hashMap26.clear();
        java.lang.Object obj28 = null;
        java.lang.Object obj29 = hashMap26.remove(obj28);
        int int30 = hashMap26.size();
        int int31 = hashMap26.size();
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        int int33 = hashMap32.modCount;
        int int34 = hashMap32.modCount;
        boolean boolean35 = hashMap32.isEmpty();
        hashMap32.modCount = '#';
        java.lang.Object obj38 = hashMap26.get((java.lang.Object) hashMap32);
        java.lang.Object obj39 = hashMap0.put((java.lang.Object) entryArray24, obj38);
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
        hashMap0.modCount = '4';
        boolean boolean5 = hashMap0.isEmpty();
        int int6 = hashMap0.size();
        hashMap0.modCount = (byte) 100;
        hashMap0.clear();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.modCount;
        int int12 = hashMap10.modCount;
        boolean boolean13 = hashMap10.isEmpty();
        boolean boolean14 = hashMap10.isEmpty();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        boolean boolean16 = hashMap15.isEmpty();
        java.lang.Object obj18 = hashMap15.remove((java.lang.Object) (short) 100);
        int int19 = hashMap15.modCount;
        hashMap15.modCount = 100;
        boolean boolean22 = hashMap15.isEmpty();
        java.lang.Object obj23 = hashMap0.put((java.lang.Object) hashMap10, (java.lang.Object) boolean22);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.modCount = '4';
        boolean boolean5 = hashMap0.isEmpty();
        int int6 = hashMap0.size();
        hashMap0.modCount = (byte) 100;
        hashMap0.clear();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap(0);
        java.lang.Object obj13 = hashMap11.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj15 = hashMap11.remove((java.lang.Object) 0.0d);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        hashMap16.clear();
        java.lang.Object obj18 = null;
        java.lang.Object obj19 = hashMap16.remove(obj18);
        java.lang.Object obj20 = hashMap11.remove((java.lang.Object) hashMap16);
        hashMap16.clear();
        system.testclass.HashMap.Entry[] entryArray22 = hashMap16.table;
        java.lang.Object obj24 = hashMap0.put((java.lang.Object) entryArray22, (java.lang.Object) 10.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap(0);
        java.lang.Object obj6 = hashMap0.get((java.lang.Object) hashMap5);
        java.lang.Object obj8 = hashMap5.remove((java.lang.Object) (byte) 10);
        hashMap5.clear();
        int int10 = hashMap5.modCount;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        int int13 = hashMap11.modCount;
        int int14 = hashMap11.size();
        system.testclass.HashMap.Entry[] entryArray15 = new system.testclass.HashMap.Entry[] {};
        hashMap11.table = entryArray15;
        system.testclass.HashMap.Entry[] entryArray17 = new system.testclass.HashMap.Entry[] {};
        hashMap11.table = entryArray17;
        java.lang.Object obj19 = hashMap5.remove((java.lang.Object) entryArray17);
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        boolean boolean21 = hashMap20.isEmpty();
        int int22 = hashMap20.size();
        hashMap20.modCount = '4';
        boolean boolean25 = hashMap20.isEmpty();
        int int26 = hashMap20.size();
        hashMap20.modCount = (byte) 100;
        java.lang.Object obj30 = hashMap20.remove((java.lang.Object) 10);
        java.lang.Object obj31 = hashMap5.get((java.lang.Object) hashMap20);
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        boolean boolean34 = hashMap33.isEmpty();
        int int35 = hashMap33.size();
        hashMap33.clear();
        system.testclass.HashMap.Entry[] entryArray37 = hashMap33.table;
        java.lang.Class<?> wildcardClass38 = entryArray37.getClass();
        java.lang.Object obj39 = hashMap20.put((java.lang.Object) (-1.0d), (java.lang.Object) wildcardClass38);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap20", hashMap20.repOK_1());
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.modCount = '4';
        boolean boolean5 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap(0);
        java.lang.Object obj9 = hashMap7.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj11 = hashMap7.remove((java.lang.Object) 0.0d);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        hashMap12.clear();
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = hashMap12.remove(obj14);
        system.testclass.HashMap.Entry[] entryArray16 = new system.testclass.HashMap.Entry[] {};
        hashMap12.table = entryArray16;
        hashMap7.table = entryArray16;
        int int19 = hashMap7.size();
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        boolean boolean21 = hashMap20.isEmpty();
        java.lang.Object obj23 = hashMap20.remove((java.lang.Object) (short) 100);
        int int24 = hashMap20.modCount;
        int int25 = hashMap20.modCount;
        boolean boolean26 = hashMap20.isEmpty();
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        boolean boolean28 = hashMap27.isEmpty();
        int int29 = hashMap27.size();
        hashMap27.clear();
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap(0);
        java.lang.Object obj33 = hashMap27.get((java.lang.Object) hashMap32);
        java.lang.Object obj35 = hashMap32.get((java.lang.Object) "");
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        hashMap36.clear();
        system.testclass.HashMap.Entry[] entryArray38 = hashMap36.table;
        java.lang.Object obj39 = hashMap32.get((java.lang.Object) entryArray38);
        java.lang.Object obj40 = hashMap20.remove((java.lang.Object) hashMap32);
        java.lang.Object obj41 = hashMap0.put((java.lang.Object) hashMap7, (java.lang.Object) hashMap32);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.clear();
        system.testclass.HashMap.Entry[] entryArray2 = hashMap0.table;
        hashMap0.modCount = ' ';
        int int5 = hashMap0.size();
        int int6 = hashMap0.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap(0);
        java.lang.Object obj10 = hashMap8.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj12 = hashMap8.remove((java.lang.Object) 0.0d);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        hashMap13.clear();
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = hashMap13.remove(obj15);
        java.lang.Object obj17 = hashMap8.remove((java.lang.Object) hashMap13);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        boolean boolean19 = hashMap18.isEmpty();
        int int20 = hashMap18.size();
        hashMap18.clear();
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap(0);
        java.lang.Object obj24 = hashMap18.get((java.lang.Object) hashMap23);
        java.lang.Object obj26 = hashMap23.remove((java.lang.Object) (byte) 10);
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        int int28 = hashMap27.size();
        java.lang.Object obj29 = hashMap23.get((java.lang.Object) hashMap27);
        java.lang.Object obj30 = hashMap8.remove((java.lang.Object) hashMap27);
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        boolean boolean32 = hashMap31.isEmpty();
        int int33 = hashMap31.size();
        hashMap31.clear();
        system.testclass.HashMap.Entry[] entryArray35 = hashMap31.table;
        int int36 = hashMap31.size();
        int int37 = hashMap31.size();
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap((int) (byte) 100);
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        java.lang.Object obj41 = hashMap39.get((java.lang.Object) hashMap40);
        java.lang.Class<?> wildcardClass42 = hashMap39.getClass();
        java.lang.Object obj43 = hashMap31.get((java.lang.Object) wildcardClass42);
        java.lang.Object obj44 = hashMap0.put((java.lang.Object) hashMap8, (java.lang.Object) wildcardClass42);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 100, 10.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '#', (float) 10L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        system.testclass.HashMap.Entry[] entryArray4 = hashMap0.table;
        int int5 = hashMap0.size();
        int int6 = hashMap0.size();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap((int) (byte) 100);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        java.lang.Object obj10 = hashMap8.get((java.lang.Object) hashMap9);
        java.lang.Class<?> wildcardClass11 = hashMap8.getClass();
        java.lang.Object obj12 = hashMap0.get((java.lang.Object) wildcardClass11);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap(0);
        java.lang.Object obj16 = hashMap14.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj18 = hashMap14.remove((java.lang.Object) 0.0d);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        hashMap19.clear();
        java.lang.Object obj21 = null;
        java.lang.Object obj22 = hashMap19.remove(obj21);
        system.testclass.HashMap.Entry[] entryArray23 = new system.testclass.HashMap.Entry[] {};
        hashMap19.table = entryArray23;
        hashMap14.table = entryArray23;
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        hashMap26.modCount = 0;
        hashMap26.modCount = 0;
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        boolean boolean32 = hashMap31.isEmpty();
        int int33 = hashMap31.size();
        hashMap31.clear();
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap(0);
        java.lang.Object obj37 = hashMap31.get((java.lang.Object) hashMap36);
        java.lang.Object obj39 = hashMap36.get((java.lang.Object) "");
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        boolean boolean41 = hashMap40.isEmpty();
        int int42 = hashMap40.size();
        hashMap40.clear();
        system.testclass.HashMap.Entry[] entryArray44 = hashMap40.table;
        hashMap36.table = entryArray44;
        hashMap26.table = entryArray44;
        java.lang.Object obj47 = hashMap0.put((java.lang.Object) entryArray23, (java.lang.Object) entryArray44);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 100, (float) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 100, (float) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 32);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(10, (float) 10L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 10, (float) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        int int4 = hashMap0.size();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap(0);
        boolean boolean7 = hashMap6.isEmpty();
        hashMap6.modCount = (byte) -1;
        java.lang.Object obj10 = hashMap0.get((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap((int) (byte) 100);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        java.lang.Object obj14 = hashMap12.get((java.lang.Object) hashMap13);
        java.lang.Object obj15 = hashMap0.get((java.lang.Object) hashMap13);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        boolean boolean17 = hashMap16.isEmpty();
        boolean boolean18 = hashMap16.isEmpty();
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        boolean boolean20 = hashMap19.isEmpty();
        int int21 = hashMap19.size();
        hashMap19.clear();
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap(0);
        java.lang.Object obj25 = hashMap19.get((java.lang.Object) hashMap24);
        java.lang.Object obj27 = hashMap24.get((java.lang.Object) "");
        java.lang.Object obj28 = hashMap16.get((java.lang.Object) "");
        int int29 = hashMap16.modCount;
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        int int31 = hashMap30.modCount;
        int int32 = hashMap30.modCount;
        int int33 = hashMap30.modCount;
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        hashMap34.modCount = 0;
        hashMap34.modCount = 0;
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        boolean boolean40 = hashMap39.isEmpty();
        int int41 = hashMap39.size();
        hashMap39.clear();
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap(0);
        java.lang.Object obj45 = hashMap39.get((java.lang.Object) hashMap44);
        java.lang.Object obj47 = hashMap44.get((java.lang.Object) "");
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap();
        boolean boolean49 = hashMap48.isEmpty();
        int int50 = hashMap48.size();
        hashMap48.clear();
        system.testclass.HashMap.Entry[] entryArray52 = hashMap48.table;
        hashMap44.table = entryArray52;
        hashMap34.table = entryArray52;
        java.lang.Object obj55 = hashMap30.remove((java.lang.Object) entryArray52);
        java.lang.Object obj56 = hashMap0.put((java.lang.Object) hashMap16, (java.lang.Object) entryArray52);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.modCount = '4';
        boolean boolean5 = hashMap0.isEmpty();
        int int6 = hashMap0.size();
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) true);
        hashMap0.modCount = 0;
        hashMap0.modCount = (-1);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        hashMap13.clear();
        int int17 = hashMap13.modCount;
        int int18 = hashMap13.modCount;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        int int20 = hashMap19.modCount;
        int int21 = hashMap19.modCount;
        hashMap19.clear();
        hashMap19.modCount = (byte) -1;
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        int int26 = hashMap25.modCount;
        int int27 = hashMap25.modCount;
        int int28 = hashMap25.size();
        java.lang.Object obj29 = hashMap19.get((java.lang.Object) int28);
        java.lang.Object obj30 = hashMap0.put((java.lang.Object) hashMap13, (java.lang.Object) int28);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) ' ', (float) '4');
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
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap(0);
        java.lang.Object obj6 = hashMap0.get((java.lang.Object) hashMap5);
        java.lang.Object obj8 = hashMap5.remove((java.lang.Object) (byte) 10);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.size();
        java.lang.Object obj11 = hashMap5.get((java.lang.Object) hashMap9);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        boolean boolean13 = hashMap12.isEmpty();
        boolean boolean14 = hashMap12.isEmpty();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        boolean boolean16 = hashMap15.isEmpty();
        int int17 = hashMap15.size();
        hashMap15.clear();
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap(0);
        java.lang.Object obj21 = hashMap15.get((java.lang.Object) hashMap20);
        java.lang.Object obj23 = hashMap20.get((java.lang.Object) "");
        java.lang.Object obj24 = hashMap12.get((java.lang.Object) "");
        int int25 = hashMap12.modCount;
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        boolean boolean27 = hashMap26.isEmpty();
        java.lang.Object obj29 = hashMap26.remove((java.lang.Object) (short) 100);
        int int30 = hashMap26.size();
        boolean boolean31 = hashMap26.isEmpty();
        java.lang.Object obj32 = hashMap5.put((java.lang.Object) hashMap12, (java.lang.Object) hashMap26);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap5", hashMap5.repOK_1());
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(2, (float) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 0, (float) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.modCount = '4';
        boolean boolean5 = hashMap0.isEmpty();
        hashMap0.modCount = (byte) 10;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.modCount;
        int int10 = hashMap8.modCount;
        int int11 = hashMap8.size();
        system.testclass.HashMap.Entry[] entryArray12 = new system.testclass.HashMap.Entry[] {};
        hashMap8.table = entryArray12;
        system.testclass.HashMap.Entry[] entryArray14 = new system.testclass.HashMap.Entry[] {};
        hashMap8.table = entryArray14;
        java.lang.Object obj16 = hashMap0.remove((java.lang.Object) hashMap8);
        system.testclass.HashMap.Entry entry17 = null;
        system.testclass.HashMap.Entry[] entryArray18 = new system.testclass.HashMap.Entry[] { entry17 };
        hashMap0.table = entryArray18;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap((int) (short) 0);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        int int23 = hashMap22.modCount;
        int int24 = hashMap22.modCount;
        hashMap22.clear();
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        hashMap26.clear();
        system.testclass.HashMap.Entry[] entryArray28 = hashMap26.table;
        hashMap22.table = entryArray28;
        hashMap21.table = entryArray28;
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        boolean boolean32 = hashMap31.isEmpty();
        java.lang.Object obj34 = hashMap31.remove((java.lang.Object) (short) 100);
        int int35 = hashMap31.size();
        boolean boolean36 = hashMap31.isEmpty();
        java.lang.Object obj37 = hashMap0.put((java.lang.Object) entryArray28, (java.lang.Object) hashMap31);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 100, (float) '4');
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
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap(0);
        java.lang.Object obj6 = hashMap0.get((java.lang.Object) hashMap5);
        java.lang.Object obj8 = hashMap5.remove((java.lang.Object) (byte) 10);
        hashMap5.clear();
        hashMap5.modCount = 100;
        hashMap5.clear();
        system.testclass.HashMap.Entry[] entryArray13 = hashMap5.table;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap(0);
        java.lang.Object obj17 = hashMap15.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj18 = hashMap5.remove(obj17);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        boolean boolean20 = hashMap19.isEmpty();
        int int21 = hashMap19.size();
        hashMap19.modCount = '4';
        boolean boolean24 = hashMap19.isEmpty();
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        hashMap25.clear();
        java.lang.Object obj27 = null;
        java.lang.Object obj28 = hashMap25.remove(obj27);
        system.testclass.HashMap.Entry[] entryArray29 = new system.testclass.HashMap.Entry[] {};
        hashMap25.table = entryArray29;
        java.lang.Object obj31 = hashMap19.get((java.lang.Object) hashMap25);
        boolean boolean32 = hashMap25.isEmpty();
        int int33 = hashMap25.modCount;
        boolean boolean34 = hashMap25.isEmpty();
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap(0, (float) (byte) 1);
        java.lang.Object obj38 = hashMap5.put((java.lang.Object) boolean34, (java.lang.Object) hashMap37);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap5", hashMap5.repOK_1());
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        hashMap0.modCount = (byte) 100;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.size();
        hashMap6.modCount = (byte) 10;
        hashMap6.modCount = (byte) 0;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.modCount;
        int int16 = hashMap14.modCount;
        int int17 = hashMap14.size();
        java.lang.Object obj18 = hashMap13.remove((java.lang.Object) hashMap14);
        java.lang.Object obj19 = hashMap0.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        java.lang.Object obj3 = hashMap1.remove((java.lang.Object) (-1.0f));
        hashMap1.clear();
        int int5 = hashMap1.modCount;
        hashMap1.clear();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        int int10 = hashMap8.size();
        hashMap8.clear();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap(0);
        java.lang.Object obj14 = hashMap8.get((java.lang.Object) hashMap13);
        system.testclass.HashMap.Entry[] entryArray15 = new system.testclass.HashMap.Entry[] {};
        hashMap13.table = entryArray15;
        java.lang.Object obj17 = hashMap1.put((java.lang.Object) (-1), (java.lang.Object) hashMap13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        int int3 = hashMap2.modCount;
        int int4 = hashMap2.modCount;
        int int5 = hashMap2.size();
        java.lang.Object obj6 = hashMap1.remove((java.lang.Object) hashMap2);
        boolean boolean7 = hashMap2.isEmpty();
        boolean boolean8 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap(0);
        java.lang.Object obj12 = hashMap10.remove((java.lang.Object) (-1.0f));
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        boolean boolean14 = hashMap13.isEmpty();
        java.lang.Object obj16 = hashMap13.remove((java.lang.Object) (short) 100);
        int int17 = hashMap13.modCount;
        hashMap13.modCount = 100;
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        int int21 = hashMap20.modCount;
        int int22 = hashMap20.modCount;
        boolean boolean23 = hashMap20.isEmpty();
        hashMap20.clear();
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        int int26 = hashMap25.modCount;
        int int27 = hashMap25.modCount;
        int int28 = hashMap25.size();
        system.testclass.HashMap.Entry[] entryArray29 = new system.testclass.HashMap.Entry[] {};
        hashMap25.table = entryArray29;
        system.testclass.HashMap.Entry[] entryArray31 = new system.testclass.HashMap.Entry[] {};
        hashMap25.table = entryArray31;
        system.testclass.HashMap.Entry[] entryArray33 = hashMap25.table;
        hashMap20.table = entryArray33;
        hashMap13.table = entryArray33;
        java.lang.Object obj36 = hashMap2.put(obj12, (java.lang.Object) entryArray33);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        hashMap4.clear();
        system.testclass.HashMap.Entry[] entryArray6 = hashMap4.table;
        hashMap0.table = entryArray6;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.modCount;
        int int10 = hashMap8.modCount;
        int int11 = hashMap8.size();
        java.lang.Class<?> wildcardClass12 = hashMap8.getClass();
        java.lang.Object obj13 = hashMap0.get((java.lang.Object) wildcardClass12);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap((int) (short) 1);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap((int) '4');
        int int18 = hashMap17.size();
        java.lang.Object obj19 = hashMap0.put((java.lang.Object) (short) 1, (java.lang.Object) hashMap17);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(1, (float) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        int int3 = hashMap0.size();
        hashMap0.clear();
        boolean boolean5 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.modCount;
        int int8 = hashMap6.modCount;
        int int9 = hashMap6.size();
        hashMap6.clear();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        boolean boolean12 = hashMap11.isEmpty();
        boolean boolean13 = hashMap11.isEmpty();
        boolean boolean14 = hashMap11.isEmpty();
        java.lang.Object obj15 = hashMap0.put((java.lang.Object) hashMap6, (java.lang.Object) hashMap11);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.modCount = '4';
        boolean boolean5 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        hashMap6.clear();
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = hashMap6.remove(obj8);
        system.testclass.HashMap.Entry[] entryArray10 = new system.testclass.HashMap.Entry[] {};
        hashMap6.table = entryArray10;
        java.lang.Object obj12 = hashMap0.get((java.lang.Object) hashMap6);
        hashMap0.clear();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.modCount;
        int int16 = hashMap14.modCount;
        boolean boolean17 = hashMap14.isEmpty();
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        boolean boolean19 = hashMap18.isEmpty();
        int int20 = hashMap18.size();
        hashMap18.modCount = '4';
        boolean boolean23 = hashMap18.isEmpty();
        int int24 = hashMap18.size();
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        boolean boolean26 = hashMap25.isEmpty();
        int int27 = hashMap25.size();
        hashMap25.clear();
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap(0);
        java.lang.Object obj31 = hashMap25.get((java.lang.Object) hashMap30);
        system.testclass.HashMap.Entry[] entryArray32 = new system.testclass.HashMap.Entry[] {};
        hashMap30.table = entryArray32;
        hashMap18.table = entryArray32;
        hashMap14.table = entryArray32;
        hashMap14.modCount = (byte) 0;
        system.testclass.HashMap.Entry[] entryArray38 = hashMap14.table;
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        int int40 = hashMap39.modCount;
        int int41 = hashMap39.modCount;
        boolean boolean42 = hashMap39.isEmpty();
        java.lang.Object obj43 = hashMap0.put((java.lang.Object) hashMap14, (java.lang.Object) boolean42);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 100L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        int int3 = hashMap2.modCount;
        int int4 = hashMap2.modCount;
        int int5 = hashMap2.size();
        java.lang.Object obj6 = hashMap1.remove((java.lang.Object) hashMap2);
        boolean boolean7 = hashMap2.isEmpty();
        boolean boolean8 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        int int11 = hashMap9.size();
        hashMap9.clear();
        system.testclass.HashMap.Entry[] entryArray13 = hashMap9.table;
        int int14 = hashMap9.size();
        java.lang.Object obj15 = hashMap2.get((java.lang.Object) int14);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        boolean boolean17 = hashMap16.isEmpty();
        java.lang.Object obj19 = hashMap16.remove((java.lang.Object) (short) 100);
        int int20 = hashMap16.size();
        hashMap16.clear();
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        boolean boolean23 = hashMap22.isEmpty();
        int int24 = hashMap22.size();
        hashMap22.modCount = '4';
        boolean boolean27 = hashMap22.isEmpty();
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        hashMap28.clear();
        java.lang.Object obj30 = null;
        java.lang.Object obj31 = hashMap28.remove(obj30);
        system.testclass.HashMap.Entry[] entryArray32 = new system.testclass.HashMap.Entry[] {};
        hashMap28.table = entryArray32;
        java.lang.Object obj34 = hashMap22.get((java.lang.Object) hashMap28);
        java.lang.Object obj35 = hashMap2.put((java.lang.Object) hashMap16, obj34);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        hashMap2.clear();
        system.testclass.HashMap.Entry[] entryArray4 = hashMap2.table;
        int int5 = hashMap2.size();
        hashMap2.modCount = (byte) 10;
        hashMap2.modCount = 52;
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = hashMap1.put((java.lang.Object) 52, obj10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 1);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        boolean boolean3 = hashMap2.isEmpty();
        java.lang.Object obj5 = hashMap2.remove((java.lang.Object) (short) 100);
        int int6 = hashMap2.modCount;
        hashMap2.modCount = 100;
        hashMap2.clear();
        int int10 = hashMap2.modCount;
        boolean boolean11 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        boolean boolean13 = hashMap12.isEmpty();
        int int14 = hashMap12.size();
        hashMap12.clear();
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap(0);
        java.lang.Object obj18 = hashMap12.get((java.lang.Object) hashMap17);
        java.lang.Object obj20 = hashMap17.remove((java.lang.Object) (byte) 10);
        hashMap17.clear();
        int int22 = hashMap17.modCount;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        hashMap23.clear();
        java.lang.Object obj25 = null;
        java.lang.Object obj26 = hashMap23.remove(obj25);
        system.testclass.HashMap.Entry[] entryArray27 = new system.testclass.HashMap.Entry[] {};
        hashMap23.table = entryArray27;
        hashMap17.table = entryArray27;
        boolean boolean30 = hashMap17.isEmpty();
        java.lang.Object obj31 = hashMap1.put((java.lang.Object) hashMap2, (java.lang.Object) hashMap17);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        int int3 = hashMap2.modCount;
        int int4 = hashMap2.modCount;
        int int5 = hashMap2.size();
        java.lang.Object obj6 = hashMap1.remove((java.lang.Object) hashMap2);
        boolean boolean7 = hashMap2.isEmpty();
        hashMap2.clear();
        java.lang.Object obj9 = null;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        int int12 = hashMap10.size();
        hashMap10.modCount = '4';
        boolean boolean15 = hashMap10.isEmpty();
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        hashMap16.clear();
        java.lang.Object obj18 = null;
        java.lang.Object obj19 = hashMap16.remove(obj18);
        system.testclass.HashMap.Entry[] entryArray20 = new system.testclass.HashMap.Entry[] {};
        hashMap16.table = entryArray20;
        java.lang.Object obj22 = hashMap10.get((java.lang.Object) hashMap16);
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap((int) (short) 0);
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        int int26 = hashMap25.modCount;
        int int27 = hashMap25.modCount;
        hashMap25.clear();
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        hashMap29.clear();
        system.testclass.HashMap.Entry[] entryArray31 = hashMap29.table;
        hashMap25.table = entryArray31;
        hashMap24.table = entryArray31;
        hashMap10.table = entryArray31;
        java.lang.Object obj35 = hashMap2.put(obj9, (java.lang.Object) hashMap10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) 'a', (float) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        hashMap0.clear();
        boolean boolean3 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        hashMap4.clear();
        hashMap4.clear();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        int int9 = hashMap7.size();
        hashMap7.clear();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap(0);
        java.lang.Object obj13 = hashMap7.get((java.lang.Object) hashMap12);
        java.lang.Object obj15 = hashMap12.remove((java.lang.Object) (byte) 10);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        int int17 = hashMap16.size();
        java.lang.Object obj18 = hashMap12.get((java.lang.Object) hashMap16);
        hashMap12.modCount = 0;
        boolean boolean21 = hashMap12.isEmpty();
        hashMap12.clear();
        system.testclass.HashMap.Entry[] entryArray23 = hashMap12.table;
        hashMap4.table = entryArray23;
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        boolean boolean26 = hashMap25.isEmpty();
        int int27 = hashMap25.size();
        hashMap25.clear();
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap(0);
        java.lang.Object obj31 = hashMap25.get((java.lang.Object) hashMap30);
        java.lang.Object obj33 = hashMap30.remove((java.lang.Object) (byte) 10);
        hashMap30.clear();
        int int35 = hashMap30.modCount;
        boolean boolean36 = hashMap30.isEmpty();
        java.lang.Object obj37 = hashMap0.put((java.lang.Object) hashMap4, (java.lang.Object) hashMap30);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 1, (float) 32);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 0, (float) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.clear();
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = hashMap0.remove(obj2);
        int int4 = hashMap0.size();
        int int5 = hashMap0.size();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.modCount;
        int int8 = hashMap6.modCount;
        boolean boolean9 = hashMap6.isEmpty();
        hashMap6.modCount = '#';
        java.lang.Object obj12 = hashMap0.get((java.lang.Object) hashMap6);
        int int13 = hashMap0.size();
        system.testclass.HashMap.Entry entry14 = null;
        system.testclass.HashMap.Entry[] entryArray15 = new system.testclass.HashMap.Entry[] { entry14 };
        hashMap0.table = entryArray15;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        boolean boolean18 = hashMap17.isEmpty();
        java.lang.Object obj20 = hashMap17.remove((java.lang.Object) (short) 100);
        int int21 = hashMap17.modCount;
        int int22 = hashMap17.modCount;
        boolean boolean23 = hashMap17.isEmpty();
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        boolean boolean25 = hashMap24.isEmpty();
        int int26 = hashMap24.size();
        hashMap24.clear();
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap(0);
        java.lang.Object obj30 = hashMap24.get((java.lang.Object) hashMap29);
        java.lang.Object obj32 = hashMap29.get((java.lang.Object) "");
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        hashMap33.clear();
        system.testclass.HashMap.Entry[] entryArray35 = hashMap33.table;
        java.lang.Object obj36 = hashMap29.get((java.lang.Object) entryArray35);
        java.lang.Object obj37 = hashMap17.remove((java.lang.Object) hashMap29);
        system.testclass.HashMap.Entry[] entryArray38 = hashMap29.table;
        java.lang.Object obj39 = null;
        java.lang.Object obj40 = hashMap0.put((java.lang.Object) entryArray38, obj39);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 1);
        java.lang.Object obj2 = null;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        boolean boolean6 = hashMap3.isEmpty();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        int int9 = hashMap7.size();
        hashMap7.modCount = '4';
        boolean boolean12 = hashMap7.isEmpty();
        int int13 = hashMap7.size();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        boolean boolean15 = hashMap14.isEmpty();
        int int16 = hashMap14.size();
        hashMap14.clear();
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap(0);
        java.lang.Object obj20 = hashMap14.get((java.lang.Object) hashMap19);
        system.testclass.HashMap.Entry[] entryArray21 = new system.testclass.HashMap.Entry[] {};
        hashMap19.table = entryArray21;
        hashMap7.table = entryArray21;
        hashMap3.table = entryArray21;
        hashMap3.modCount = (byte) 0;
        system.testclass.HashMap.Entry[] entryArray27 = hashMap3.table;
        java.lang.Object obj28 = hashMap1.put(obj2, (java.lang.Object) entryArray27);
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
        boolean boolean4 = hashMap0.isEmpty();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap0.table;
        hashMap0.modCount = 0;
        int int8 = hashMap0.modCount;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        java.lang.Object obj12 = hashMap9.remove((java.lang.Object) (short) 100);
        int int13 = hashMap9.modCount;
        hashMap9.modCount = 100;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        hashMap16.clear();
        system.testclass.HashMap.Entry[] entryArray18 = hashMap16.table;
        hashMap9.table = entryArray18;
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        boolean boolean21 = hashMap20.isEmpty();
        boolean boolean22 = hashMap20.isEmpty();
        boolean boolean23 = hashMap20.isEmpty();
        system.testclass.HashMap.Entry[] entryArray24 = hashMap20.table;
        hashMap9.table = entryArray24;
        hashMap0.table = entryArray24;
        system.testclass.HashMap.Entry[] entryArray27 = hashMap0.table;
        java.lang.Object obj29 = null;
        java.lang.Object obj30 = hashMap0.put((java.lang.Object) (byte) 0, obj29);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.clear();
        int int2 = hashMap0.size();
        hashMap0.clear();
        int int4 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap0.table;
        int int6 = hashMap0.modCount;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        int int9 = hashMap7.size();
        hashMap7.clear();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap(0);
        java.lang.Object obj13 = hashMap7.get((java.lang.Object) hashMap12);
        java.lang.Object obj15 = hashMap12.get((java.lang.Object) "");
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        boolean boolean17 = hashMap16.isEmpty();
        int int18 = hashMap16.size();
        hashMap16.clear();
        system.testclass.HashMap.Entry[] entryArray20 = hashMap16.table;
        hashMap12.table = entryArray20;
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        boolean boolean23 = hashMap22.isEmpty();
        int int24 = hashMap22.size();
        hashMap22.clear();
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap(0);
        java.lang.Object obj28 = hashMap22.get((java.lang.Object) hashMap27);
        java.lang.Object obj30 = hashMap27.remove((java.lang.Object) (byte) 10);
        int int31 = hashMap27.modCount;
        boolean boolean32 = hashMap27.isEmpty();
        java.lang.Object obj33 = hashMap12.get((java.lang.Object) boolean32);
        system.testclass.HashMap.Entry[] entryArray34 = hashMap12.table;
        boolean boolean35 = hashMap12.isEmpty();
        java.lang.Object obj36 = hashMap0.remove((java.lang.Object) boolean35);
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        boolean boolean38 = hashMap37.isEmpty();
        int int39 = hashMap37.size();
        hashMap37.clear();
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap(0);
        java.lang.Object obj43 = hashMap37.get((java.lang.Object) hashMap42);
        java.lang.Object obj45 = hashMap42.get((java.lang.Object) "");
        system.testclass.HashMap hashMap46 = new system.testclass.HashMap();
        boolean boolean47 = hashMap46.isEmpty();
        int int48 = hashMap46.size();
        hashMap46.clear();
        system.testclass.HashMap.Entry[] entryArray50 = hashMap46.table;
        hashMap42.table = entryArray50;
        hashMap42.clear();
        int int53 = hashMap42.size();
        system.testclass.HashMap hashMap54 = new system.testclass.HashMap();
        boolean boolean55 = hashMap54.isEmpty();
        int int56 = hashMap54.size();
        hashMap54.clear();
        system.testclass.HashMap hashMap59 = new system.testclass.HashMap(0);
        java.lang.Object obj60 = hashMap54.get((java.lang.Object) hashMap59);
        java.lang.Object obj62 = hashMap59.remove((java.lang.Object) (byte) 10);
        hashMap59.clear();
        int int64 = hashMap59.modCount;
        system.testclass.HashMap hashMap65 = new system.testclass.HashMap();
        hashMap65.clear();
        java.lang.Object obj67 = null;
        java.lang.Object obj68 = hashMap65.remove(obj67);
        system.testclass.HashMap.Entry[] entryArray69 = new system.testclass.HashMap.Entry[] {};
        hashMap65.table = entryArray69;
        hashMap59.table = entryArray69;
        int int72 = hashMap59.modCount;
        java.lang.Object obj73 = hashMap0.put((java.lang.Object) hashMap42, (java.lang.Object) int72);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        hashMap3.modCount = 0;
        hashMap3.modCount = 0;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        int int10 = hashMap8.size();
        hashMap8.clear();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap(0);
        java.lang.Object obj14 = hashMap8.get((java.lang.Object) hashMap13);
        java.lang.Object obj16 = hashMap13.get((java.lang.Object) "");
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        boolean boolean18 = hashMap17.isEmpty();
        int int19 = hashMap17.size();
        hashMap17.clear();
        system.testclass.HashMap.Entry[] entryArray21 = hashMap17.table;
        hashMap13.table = entryArray21;
        hashMap3.table = entryArray21;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.modCount;
        int int26 = hashMap24.modCount;
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        int int28 = hashMap27.modCount;
        int int29 = hashMap27.modCount;
        int int30 = hashMap27.size();
        system.testclass.HashMap.Entry[] entryArray31 = new system.testclass.HashMap.Entry[] {};
        hashMap27.table = entryArray31;
        hashMap24.table = entryArray31;
        hashMap24.modCount = (short) 100;
        system.testclass.HashMap.Entry[] entryArray36 = hashMap24.table;
        java.lang.Class<?> wildcardClass37 = hashMap24.getClass();
        java.lang.Object obj38 = hashMap0.put((java.lang.Object) entryArray21, (java.lang.Object) wildcardClass37);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 100, (float) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        boolean boolean4 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        boolean boolean6 = hashMap5.isEmpty();
        int int7 = hashMap5.size();
        hashMap5.modCount = '4';
        boolean boolean10 = hashMap5.isEmpty();
        hashMap5.modCount = (byte) 10;
        java.lang.Object obj14 = hashMap0.put((java.lang.Object) (byte) 10, (java.lang.Object) true);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.clear();
        hashMap0.clear();
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        hashMap3.clear();
        java.lang.Object obj5 = null;
        java.lang.Object obj6 = hashMap3.remove(obj5);
        system.testclass.HashMap.Entry[] entryArray7 = new system.testclass.HashMap.Entry[] {};
        hashMap3.table = entryArray7;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        int int11 = hashMap9.size();
        hashMap9.clear();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap(0);
        java.lang.Object obj15 = hashMap9.get((java.lang.Object) hashMap14);
        java.lang.Object obj17 = hashMap14.get((java.lang.Object) "");
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        boolean boolean19 = hashMap18.isEmpty();
        int int20 = hashMap18.size();
        hashMap18.clear();
        system.testclass.HashMap.Entry[] entryArray22 = hashMap18.table;
        hashMap14.table = entryArray22;
        hashMap3.table = entryArray22;
        boolean boolean25 = hashMap3.isEmpty();
        java.lang.Object obj27 = hashMap3.remove((java.lang.Object) 1L);
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        hashMap28.clear();
        java.lang.Object obj30 = null;
        java.lang.Object obj31 = hashMap28.remove(obj30);
        system.testclass.HashMap.Entry[] entryArray32 = new system.testclass.HashMap.Entry[] {};
        hashMap28.table = entryArray32;
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        boolean boolean35 = hashMap34.isEmpty();
        int int36 = hashMap34.size();
        hashMap34.clear();
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap(0);
        java.lang.Object obj40 = hashMap34.get((java.lang.Object) hashMap39);
        java.lang.Object obj42 = hashMap39.get((java.lang.Object) "");
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap();
        boolean boolean44 = hashMap43.isEmpty();
        int int45 = hashMap43.size();
        hashMap43.clear();
        system.testclass.HashMap.Entry[] entryArray47 = hashMap43.table;
        hashMap39.table = entryArray47;
        hashMap28.table = entryArray47;
        hashMap28.clear();
        int int51 = hashMap28.size();
        java.lang.Object obj52 = hashMap0.put(obj27, (java.lang.Object) hashMap28);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 0, (float) 101);
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
        hashMap0.clear();
        boolean boolean4 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        int int8 = hashMap5.modCount;
        boolean boolean9 = hashMap5.isEmpty();
        system.testclass.HashMap.Entry[] entryArray10 = hashMap5.table;
        hashMap5.modCount = 0;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        boolean boolean14 = hashMap13.isEmpty();
        int int15 = hashMap13.size();
        hashMap13.clear();
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap(0);
        java.lang.Object obj19 = hashMap13.get((java.lang.Object) hashMap18);
        java.lang.Object obj21 = hashMap18.remove((java.lang.Object) (byte) 10);
        hashMap18.clear();
        hashMap18.modCount = 100;
        hashMap18.clear();
        system.testclass.HashMap.Entry[] entryArray26 = hashMap18.table;
        hashMap5.table = entryArray26;
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        hashMap28.clear();
        java.lang.Object obj30 = null;
        java.lang.Object obj31 = hashMap28.remove(obj30);
        int int32 = hashMap28.size();
        int int33 = hashMap28.size();
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        int int35 = hashMap34.modCount;
        int int36 = hashMap34.modCount;
        boolean boolean37 = hashMap34.isEmpty();
        hashMap34.modCount = '#';
        java.lang.Object obj40 = hashMap28.get((java.lang.Object) hashMap34);
        hashMap34.modCount = (byte) 10;
        java.lang.Class<?> wildcardClass43 = hashMap34.getClass();
        java.lang.Object obj44 = hashMap0.put((java.lang.Object) entryArray26, (java.lang.Object) hashMap34);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap(0);
        java.lang.Object obj6 = hashMap0.get((java.lang.Object) hashMap5);
        java.lang.Object obj8 = hashMap5.remove((java.lang.Object) (byte) 10);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.size();
        java.lang.Object obj11 = hashMap5.get((java.lang.Object) hashMap9);
        hashMap5.modCount = 0;
        boolean boolean14 = hashMap5.isEmpty();
        hashMap5.clear();
        system.testclass.HashMap.Entry[] entryArray16 = hashMap5.table;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap(10);
        java.lang.Object obj19 = hashMap5.remove((java.lang.Object) hashMap18);
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        boolean boolean21 = hashMap20.isEmpty();
        int int22 = hashMap20.size();
        hashMap20.clear();
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap(0);
        java.lang.Object obj26 = hashMap20.get((java.lang.Object) hashMap25);
        java.lang.Object obj28 = hashMap25.remove((java.lang.Object) (byte) 10);
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        int int30 = hashMap29.modCount;
        int int31 = hashMap29.modCount;
        hashMap29.clear();
        int int33 = hashMap29.modCount;
        java.lang.Object obj34 = hashMap25.remove((java.lang.Object) int33);
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        hashMap35.modCount = 0;
        hashMap35.modCount = 0;
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        boolean boolean41 = hashMap40.isEmpty();
        int int42 = hashMap40.size();
        hashMap40.clear();
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap(0);
        java.lang.Object obj46 = hashMap40.get((java.lang.Object) hashMap45);
        java.lang.Object obj48 = hashMap45.get((java.lang.Object) "");
        system.testclass.HashMap hashMap49 = new system.testclass.HashMap();
        boolean boolean50 = hashMap49.isEmpty();
        int int51 = hashMap49.size();
        hashMap49.clear();
        system.testclass.HashMap.Entry[] entryArray53 = hashMap49.table;
        hashMap45.table = entryArray53;
        hashMap35.table = entryArray53;
        java.lang.Object obj56 = hashMap25.remove((java.lang.Object) entryArray53);
        system.testclass.HashMap hashMap58 = new system.testclass.HashMap(0);
        java.lang.Object obj60 = hashMap58.remove((java.lang.Object) (-1.0f));
        hashMap58.clear();
        hashMap58.clear();
        java.lang.Object obj63 = hashMap18.put((java.lang.Object) entryArray53, (java.lang.Object) hashMap58);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap18", hashMap18.repOK_1());
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        java.lang.Object obj3 = hashMap1.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj5 = hashMap1.remove((java.lang.Object) 0.0d);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        hashMap6.clear();
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = hashMap6.remove(obj8);
        java.lang.Object obj10 = hashMap1.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        boolean boolean12 = hashMap11.isEmpty();
        int int13 = hashMap11.size();
        hashMap11.clear();
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap(0);
        java.lang.Object obj17 = hashMap11.get((java.lang.Object) hashMap16);
        java.lang.Object obj19 = hashMap16.remove((java.lang.Object) (byte) 10);
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        int int21 = hashMap20.size();
        java.lang.Object obj22 = hashMap16.get((java.lang.Object) hashMap20);
        java.lang.Object obj23 = hashMap1.remove((java.lang.Object) hashMap20);
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        hashMap24.clear();
        system.testclass.HashMap.Entry[] entryArray26 = hashMap24.table;
        hashMap24.modCount = ' ';
        system.testclass.HashMap.Entry[] entryArray29 = hashMap24.table;
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        boolean boolean31 = hashMap30.isEmpty();
        int int32 = hashMap30.size();
        hashMap30.clear();
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap(0);
        java.lang.Object obj36 = hashMap30.get((java.lang.Object) hashMap35);
        java.lang.Object obj38 = hashMap35.get((java.lang.Object) "");
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        boolean boolean40 = hashMap39.isEmpty();
        int int41 = hashMap39.size();
        hashMap39.clear();
        system.testclass.HashMap.Entry[] entryArray43 = hashMap39.table;
        hashMap35.table = entryArray43;
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        boolean boolean46 = hashMap45.isEmpty();
        int int47 = hashMap45.size();
        hashMap45.clear();
        system.testclass.HashMap hashMap50 = new system.testclass.HashMap(0);
        java.lang.Object obj51 = hashMap45.get((java.lang.Object) hashMap50);
        java.lang.Object obj53 = hashMap50.remove((java.lang.Object) (byte) 10);
        int int54 = hashMap50.modCount;
        boolean boolean55 = hashMap50.isEmpty();
        java.lang.Object obj56 = hashMap35.get((java.lang.Object) boolean55);
        system.testclass.HashMap hashMap57 = new system.testclass.HashMap();
        hashMap57.modCount = 0;
        hashMap57.modCount = 0;
        int int62 = hashMap57.modCount;
        system.testclass.HashMap hashMap64 = new system.testclass.HashMap(0);
        java.lang.Object obj65 = hashMap57.get((java.lang.Object) hashMap64);
        java.lang.Object obj66 = hashMap35.remove((java.lang.Object) hashMap57);
        int int67 = hashMap57.size();
        int int68 = hashMap57.modCount;
        java.lang.Object obj69 = hashMap20.put((java.lang.Object) hashMap24, (java.lang.Object) int68);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap20", hashMap20.repOK_1());
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.clear();
        system.testclass.HashMap.Entry[] entryArray2 = hashMap0.table;
        hashMap0.modCount = ' ';
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        boolean boolean6 = hashMap5.isEmpty();
        int int7 = hashMap5.size();
        hashMap5.clear();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap(0);
        java.lang.Object obj11 = hashMap5.get((java.lang.Object) hashMap10);
        java.lang.Object obj13 = hashMap10.get((java.lang.Object) "");
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        boolean boolean15 = hashMap14.isEmpty();
        int int16 = hashMap14.size();
        hashMap14.clear();
        system.testclass.HashMap.Entry[] entryArray18 = hashMap14.table;
        hashMap10.table = entryArray18;
        hashMap10.clear();
        boolean boolean21 = hashMap10.isEmpty();
        system.testclass.HashMap.Entry[] entryArray22 = hashMap10.table;
        boolean boolean23 = hashMap10.isEmpty();
        hashMap10.clear();
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        int int26 = hashMap25.modCount;
        int int27 = hashMap25.modCount;
        hashMap25.clear();
        int int29 = hashMap25.size();
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap(0);
        boolean boolean32 = hashMap31.isEmpty();
        hashMap31.modCount = (byte) -1;
        java.lang.Object obj35 = hashMap25.get((java.lang.Object) hashMap31);
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        int int37 = hashMap36.modCount;
        int int38 = hashMap36.modCount;
        int int39 = hashMap36.size();
        system.testclass.HashMap.Entry[] entryArray40 = new system.testclass.HashMap.Entry[] {};
        hashMap36.table = entryArray40;
        hashMap25.table = entryArray40;
        int int43 = hashMap25.size();
        java.lang.Object obj44 = hashMap0.put((java.lang.Object) hashMap10, (java.lang.Object) int43);
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
        boolean boolean3 = hashMap0.isEmpty();
        hashMap0.clear();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap0.table;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        int int8 = hashMap6.size();
        hashMap6.modCount = '4';
        boolean boolean11 = hashMap6.isEmpty();
        int int12 = hashMap6.size();
        java.lang.Object obj14 = hashMap6.remove((java.lang.Object) true);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        int int17 = hashMap15.modCount;
        int int18 = hashMap15.size();
        system.testclass.HashMap.Entry[] entryArray19 = new system.testclass.HashMap.Entry[] {};
        hashMap15.table = entryArray19;
        system.testclass.HashMap.Entry[] entryArray21 = new system.testclass.HashMap.Entry[] {};
        hashMap15.table = entryArray21;
        int int23 = hashMap15.modCount;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        boolean boolean25 = hashMap24.isEmpty();
        int int26 = hashMap24.size();
        hashMap24.clear();
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap(0);
        java.lang.Object obj30 = hashMap24.get((java.lang.Object) hashMap29);
        java.lang.Object obj32 = hashMap29.get((java.lang.Object) "");
        hashMap29.clear();
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        boolean boolean35 = hashMap34.isEmpty();
        int int36 = hashMap34.size();
        hashMap34.modCount = '4';
        boolean boolean39 = hashMap34.isEmpty();
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        hashMap40.clear();
        java.lang.Object obj42 = null;
        java.lang.Object obj43 = hashMap40.remove(obj42);
        system.testclass.HashMap.Entry[] entryArray44 = new system.testclass.HashMap.Entry[] {};
        hashMap40.table = entryArray44;
        java.lang.Object obj46 = hashMap34.get((java.lang.Object) hashMap40);
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap();
        int int48 = hashMap47.modCount;
        int int49 = hashMap47.modCount;
        int int50 = hashMap47.size();
        system.testclass.HashMap.Entry[] entryArray51 = new system.testclass.HashMap.Entry[] {};
        hashMap47.table = entryArray51;
        hashMap40.table = entryArray51;
        hashMap29.table = entryArray51;
        hashMap15.table = entryArray51;
        hashMap6.table = entryArray51;
        java.lang.Object obj58 = hashMap0.put((java.lang.Object) entryArray51, (java.lang.Object) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.clear();
        system.testclass.HashMap.Entry[] entryArray2 = hashMap0.table;
        int int3 = hashMap0.size();
        hashMap0.modCount = (byte) 10;
        system.testclass.HashMap.Entry[] entryArray6 = hashMap0.table;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        int int9 = hashMap7.modCount;
        hashMap7.clear();
        int int11 = hashMap7.size();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        int int13 = hashMap12.modCount;
        int int14 = hashMap12.modCount;
        int int15 = hashMap12.size();
        system.testclass.HashMap.Entry[] entryArray16 = new system.testclass.HashMap.Entry[] {};
        hashMap12.table = entryArray16;
        java.lang.Object obj18 = hashMap7.get((java.lang.Object) hashMap12);
        system.testclass.HashMap.Entry[] entryArray19 = hashMap7.table;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap(0);
        java.lang.Object obj23 = hashMap21.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj25 = hashMap21.remove((java.lang.Object) 0.0d);
        hashMap21.modCount = 'a';
        hashMap21.modCount = (byte) 0;
        java.lang.Object obj30 = hashMap0.put((java.lang.Object) hashMap7, (java.lang.Object) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap(0);
        java.lang.Object obj6 = hashMap0.get((java.lang.Object) hashMap5);
        java.lang.Object obj8 = hashMap5.get((java.lang.Object) "");
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        int int11 = hashMap9.size();
        hashMap9.clear();
        system.testclass.HashMap.Entry[] entryArray13 = hashMap9.table;
        hashMap5.table = entryArray13;
        hashMap5.clear();
        boolean boolean16 = hashMap5.isEmpty();
        hashMap5.modCount = 32;
        int int19 = hashMap5.modCount;
        int int20 = hashMap5.modCount;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        boolean boolean22 = hashMap21.isEmpty();
        int int23 = hashMap21.size();
        hashMap21.clear();
        system.testclass.HashMap.Entry[] entryArray25 = hashMap21.table;
        int int26 = hashMap21.size();
        int int27 = hashMap21.size();
        boolean boolean28 = hashMap21.isEmpty();
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        hashMap29.modCount = 0;
        hashMap29.modCount = 0;
        int int34 = hashMap29.modCount;
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap(0);
        java.lang.Object obj37 = hashMap29.get((java.lang.Object) hashMap36);
        hashMap29.clear();
        java.lang.Class<?> wildcardClass39 = hashMap29.getClass();
        java.lang.Object obj40 = hashMap5.put((java.lang.Object) boolean28, (java.lang.Object) wildcardClass39);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap5", hashMap5.repOK_1());
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        java.lang.Object obj3 = hashMap0.remove((java.lang.Object) (short) 100);
        int int4 = hashMap0.size();
        boolean boolean5 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.modCount;
        int int8 = hashMap6.modCount;
        boolean boolean9 = hashMap6.isEmpty();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        int int12 = hashMap10.size();
        hashMap10.modCount = '4';
        boolean boolean15 = hashMap10.isEmpty();
        int int16 = hashMap10.size();
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        boolean boolean18 = hashMap17.isEmpty();
        int int19 = hashMap17.size();
        hashMap17.clear();
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap(0);
        java.lang.Object obj23 = hashMap17.get((java.lang.Object) hashMap22);
        system.testclass.HashMap.Entry[] entryArray24 = new system.testclass.HashMap.Entry[] {};
        hashMap22.table = entryArray24;
        hashMap10.table = entryArray24;
        hashMap6.table = entryArray24;
        hashMap6.modCount = (byte) 1;
        int int30 = hashMap6.size();
        java.lang.Object obj31 = hashMap0.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        hashMap32.clear();
        java.lang.Object obj34 = null;
        java.lang.Object obj35 = hashMap32.remove(obj34);
        int int36 = hashMap32.size();
        int int37 = hashMap32.size();
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        int int39 = hashMap38.modCount;
        int int40 = hashMap38.modCount;
        boolean boolean41 = hashMap38.isEmpty();
        hashMap38.modCount = '#';
        java.lang.Object obj44 = hashMap32.get((java.lang.Object) hashMap38);
        int int45 = hashMap32.size();
        hashMap32.clear();
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap();
        boolean boolean48 = hashMap47.isEmpty();
        int int49 = hashMap47.size();
        hashMap47.clear();
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap(0);
        java.lang.Object obj53 = hashMap47.get((java.lang.Object) hashMap52);
        java.lang.Object obj55 = hashMap52.remove((java.lang.Object) (byte) 10);
        system.testclass.HashMap hashMap56 = new system.testclass.HashMap();
        int int57 = hashMap56.size();
        java.lang.Object obj58 = hashMap52.get((java.lang.Object) hashMap56);
        system.testclass.HashMap hashMap60 = new system.testclass.HashMap((int) (byte) 100);
        system.testclass.HashMap hashMap61 = new system.testclass.HashMap();
        java.lang.Object obj62 = hashMap60.get((java.lang.Object) hashMap61);
        system.testclass.HashMap hashMap64 = new system.testclass.HashMap(0);
        java.lang.Object obj66 = hashMap64.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj68 = hashMap64.remove((java.lang.Object) 0.0d);
        system.testclass.HashMap hashMap69 = new system.testclass.HashMap();
        hashMap69.clear();
        java.lang.Object obj71 = null;
        java.lang.Object obj72 = hashMap69.remove(obj71);
        system.testclass.HashMap.Entry[] entryArray73 = new system.testclass.HashMap.Entry[] {};
        hashMap69.table = entryArray73;
        hashMap64.table = entryArray73;
        java.lang.Object obj76 = hashMap60.remove((java.lang.Object) entryArray73);
        java.lang.Object obj77 = hashMap52.remove((java.lang.Object) entryArray73);
        java.lang.Object obj78 = hashMap0.put((java.lang.Object) hashMap32, obj77);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        system.testclass.HashMap.Entry[] entryArray4 = hashMap0.table;
        int int5 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray6 = hashMap0.table;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        int int9 = hashMap7.size();
        hashMap7.clear();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap(0);
        java.lang.Object obj13 = hashMap7.get((java.lang.Object) hashMap12);
        java.lang.Object obj14 = hashMap0.get(obj13);
        int int15 = hashMap0.modCount;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        hashMap16.modCount = 0;
        hashMap16.modCount = 0;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        boolean boolean22 = hashMap21.isEmpty();
        int int23 = hashMap21.size();
        hashMap21.clear();
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap(0);
        java.lang.Object obj27 = hashMap21.get((java.lang.Object) hashMap26);
        java.lang.Object obj29 = hashMap26.get((java.lang.Object) "");
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        boolean boolean31 = hashMap30.isEmpty();
        int int32 = hashMap30.size();
        hashMap30.clear();
        system.testclass.HashMap.Entry[] entryArray34 = hashMap30.table;
        hashMap26.table = entryArray34;
        hashMap16.table = entryArray34;
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        boolean boolean38 = hashMap37.isEmpty();
        int int39 = hashMap37.size();
        hashMap37.modCount = '4';
        boolean boolean42 = hashMap37.isEmpty();
        int int43 = hashMap37.size();
        java.lang.Object obj45 = hashMap37.remove((java.lang.Object) true);
        system.testclass.HashMap hashMap46 = new system.testclass.HashMap();
        int int47 = hashMap46.modCount;
        int int48 = hashMap46.modCount;
        int int49 = hashMap46.size();
        system.testclass.HashMap.Entry[] entryArray50 = new system.testclass.HashMap.Entry[] {};
        hashMap46.table = entryArray50;
        system.testclass.HashMap.Entry[] entryArray52 = new system.testclass.HashMap.Entry[] {};
        hashMap46.table = entryArray52;
        int int54 = hashMap46.modCount;
        system.testclass.HashMap hashMap55 = new system.testclass.HashMap();
        boolean boolean56 = hashMap55.isEmpty();
        int int57 = hashMap55.size();
        hashMap55.clear();
        system.testclass.HashMap hashMap60 = new system.testclass.HashMap(0);
        java.lang.Object obj61 = hashMap55.get((java.lang.Object) hashMap60);
        java.lang.Object obj63 = hashMap60.get((java.lang.Object) "");
        hashMap60.clear();
        system.testclass.HashMap hashMap65 = new system.testclass.HashMap();
        boolean boolean66 = hashMap65.isEmpty();
        int int67 = hashMap65.size();
        hashMap65.modCount = '4';
        boolean boolean70 = hashMap65.isEmpty();
        system.testclass.HashMap hashMap71 = new system.testclass.HashMap();
        hashMap71.clear();
        java.lang.Object obj73 = null;
        java.lang.Object obj74 = hashMap71.remove(obj73);
        system.testclass.HashMap.Entry[] entryArray75 = new system.testclass.HashMap.Entry[] {};
        hashMap71.table = entryArray75;
        java.lang.Object obj77 = hashMap65.get((java.lang.Object) hashMap71);
        system.testclass.HashMap hashMap78 = new system.testclass.HashMap();
        int int79 = hashMap78.modCount;
        int int80 = hashMap78.modCount;
        int int81 = hashMap78.size();
        system.testclass.HashMap.Entry[] entryArray82 = new system.testclass.HashMap.Entry[] {};
        hashMap78.table = entryArray82;
        hashMap71.table = entryArray82;
        hashMap60.table = entryArray82;
        hashMap46.table = entryArray82;
        hashMap37.table = entryArray82;
        java.lang.Class<?> wildcardClass88 = hashMap37.getClass();
        java.lang.Object obj89 = hashMap0.put((java.lang.Object) entryArray34, (java.lang.Object) wildcardClass88);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.clear();
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = hashMap0.remove(obj2);
        int int4 = hashMap0.modCount;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.size();
        hashMap5.modCount = (short) 10;
        boolean boolean9 = hashMap5.isEmpty();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        java.lang.Object obj13 = hashMap10.remove((java.lang.Object) (short) 100);
        int int14 = hashMap10.modCount;
        int int15 = hashMap10.modCount;
        boolean boolean16 = hashMap10.isEmpty();
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        boolean boolean18 = hashMap17.isEmpty();
        int int19 = hashMap17.size();
        hashMap17.clear();
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap(0);
        java.lang.Object obj23 = hashMap17.get((java.lang.Object) hashMap22);
        java.lang.Object obj25 = hashMap22.get((java.lang.Object) "");
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        hashMap26.clear();
        system.testclass.HashMap.Entry[] entryArray28 = hashMap26.table;
        java.lang.Object obj29 = hashMap22.get((java.lang.Object) entryArray28);
        java.lang.Object obj30 = hashMap10.remove((java.lang.Object) hashMap22);
        java.lang.Object obj31 = hashMap0.put((java.lang.Object) boolean9, (java.lang.Object) hashMap22);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }
}

