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
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj4 = hashMap1.put((java.lang.Object) 100, (java.lang.Object) hashMap3);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 0.0f);
        boolean boolean3 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry entry4 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray5 = new system.classfixer.classes.HashMap.Entry[] { entry4 };
        hashMap0.table = entryArray5;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray1 = null;
        hashMap0.table = entryArray1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        int int3 = hashMap1.size();
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = hashMap1.remove(obj4);
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        hashMap7.clear();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap10.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap10.table = entryArray12;
        java.lang.Object obj14 = hashMap7.get((java.lang.Object) entryArray12);
        int int15 = hashMap7.size();
        java.lang.Object obj16 = hashMap1.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap7);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        hashMap3.clear();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap6.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap6.table = entryArray8;
        java.lang.Object obj10 = hashMap3.get((java.lang.Object) entryArray8);
        hashMap0.table = entryArray8;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        int int3 = hashMap1.size();
        hashMap1.clear();
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = hashMap1.put((java.lang.Object) 0L, obj6);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap3.remove((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass6 = hashMap3.getClass();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) 'a');
        hashMap8.modCount = (byte) 100;
        java.lang.Object obj11 = hashMap0.put((java.lang.Object) wildcardClass6, (java.lang.Object) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        int int3 = hashMap1.size();
        int int4 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray9 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap8.table = entryArray9;
        hashMap6.table = entryArray9;
        hashMap6.clear();
        java.lang.Object obj14 = hashMap1.put((java.lang.Object) hashMap6, (java.lang.Object) (-1.0d));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        hashMap0.modCount = (short) 0;
        hashMap0.clear();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap(0);
        int int8 = hashMap7.size();
        hashMap7.clear();
        hashMap7.clear();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        boolean boolean12 = hashMap11.repOK();
        hashMap11.clear();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        java.lang.Object obj16 = hashMap14.remove((java.lang.Object) 0.0f);
        boolean boolean17 = hashMap14.isEmpty();
        int int18 = hashMap14.size();
        java.lang.Object obj19 = hashMap11.get((java.lang.Object) int18);
        java.lang.Object obj20 = hashMap0.put((java.lang.Object) hashMap7, (java.lang.Object) hashMap11);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) ' ');
        hashMap1.modCount = 0;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap5.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap5.table;
        java.lang.Object obj9 = hashMap5.get((java.lang.Object) 0L);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        java.lang.Object obj12 = hashMap10.remove((java.lang.Object) 0.0f);
        java.lang.Object obj14 = hashMap10.remove((java.lang.Object) 1.0d);
        boolean boolean15 = hashMap10.isEmpty();
        java.lang.Object obj16 = hashMap1.put(obj9, (java.lang.Object) boolean15);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(100, (float) 10L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        hashMap2.clear();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap7.clear();
        hashMap7.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap7.table;
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap7.table;
        hashMap5.table = entryArray11;
        java.lang.Object obj14 = hashMap2.put((java.lang.Object) hashMap5, (java.lang.Object) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        int int3 = hashMap1.size();
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = hashMap1.remove(obj4);
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap1.table;
        boolean boolean7 = hashMap1.repOK();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        java.lang.Object obj10 = hashMap8.get((java.lang.Object) 100L);
        java.lang.Object obj11 = hashMap1.get((java.lang.Object) 100L);
        boolean boolean12 = hashMap1.repOK();
        java.lang.Object obj13 = null;
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap(100);
        java.lang.Object obj16 = hashMap1.put(obj13, (java.lang.Object) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 1, (float) 100L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(10, (float) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) ' ', 10.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        hashMap2.clear();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        hashMap4.clear();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap7.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap7.table = entryArray9;
        java.lang.Object obj11 = hashMap4.get((java.lang.Object) entryArray9);
        int int12 = hashMap4.size();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap14.table;
        java.lang.Object obj16 = null;
        java.lang.Object obj17 = hashMap14.get(obj16);
        java.lang.Object obj18 = hashMap2.put((java.lang.Object) int12, (java.lang.Object) hashMap14);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) ' ');
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap3.table;
        hashMap1.table = entryArray4;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 0.0f);
        java.lang.Object obj4 = hashMap0.remove((java.lang.Object) 1.0d);
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap8.clear();
        hashMap8.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap8.table;
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap8.table;
        hashMap6.table = entryArray12;
        hashMap0.table = entryArray12;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 1, (float) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        int int3 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        boolean boolean5 = hashMap4.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap4.table;
        hashMap1.table = entryArray6;
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap9.clear();
        int int11 = hashMap9.size();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        boolean boolean13 = hashMap12.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap12.table;
        hashMap9.table = entryArray14;
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap(0);
        int int18 = hashMap17.size();
        hashMap17.clear();
        boolean boolean20 = hashMap17.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap17.table;
        java.lang.Object obj22 = hashMap1.put((java.lang.Object) hashMap9, (java.lang.Object) entryArray21);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        hashMap4.clear();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap7.clear();
        int int9 = hashMap7.size();
        int int10 = hashMap7.size();
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap7.table;
        hashMap4.table = entryArray11;
        hashMap0.table = entryArray11;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(0, (float) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 0.0f);
        hashMap0.modCount = ' ';
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap6.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap6.table = entryArray8;
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap6.table;
        hashMap0.table = entryArray10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        int int3 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        boolean boolean5 = hashMap4.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap4.table;
        hashMap1.table = entryArray6;
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap1.table;
        int int9 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        boolean boolean11 = hashMap10.repOK();
        hashMap10.clear();
        hashMap10.clear();
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap15.clear();
        int int17 = hashMap15.size();
        int int18 = hashMap15.size();
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap15.table;
        int int20 = hashMap15.modCount;
        int int21 = hashMap15.size();
        java.lang.Object obj22 = hashMap1.put((java.lang.Object) hashMap10, (java.lang.Object) hashMap15);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        int int3 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        boolean boolean5 = hashMap4.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap4.table;
        hashMap1.table = entryArray6;
        boolean boolean8 = hashMap1.repOK();
        java.lang.Object obj10 = hashMap1.get((java.lang.Object) (short) 0);
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        hashMap13.clear();
        int int15 = hashMap13.modCount;
        boolean boolean16 = hashMap13.isEmpty();
        java.lang.Object obj17 = hashMap1.remove((java.lang.Object) boolean16);
        boolean boolean18 = hashMap1.repOK();
        java.lang.Object obj19 = null;
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap(0);
        int int22 = hashMap21.size();
        system.classfixer.classes.HashMap.Entry[] entryArray23 = hashMap21.table;
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap();
        boolean boolean25 = hashMap24.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray26 = hashMap24.table;
        java.lang.Object obj27 = hashMap21.get((java.lang.Object) entryArray26);
        java.lang.Object obj28 = hashMap1.put(obj19, obj27);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        hashMap1.clear();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap5.clear();
        int int7 = hashMap5.size();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap8.table;
        hashMap5.table = entryArray10;
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap13.table;
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = hashMap13.get(obj15);
        int int17 = hashMap13.modCount;
        java.lang.Object obj18 = hashMap1.put((java.lang.Object) entryArray10, (java.lang.Object) int17);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        hashMap0.clear();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap3.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap3.table = entryArray5;
        java.lang.Object obj7 = hashMap0.get((java.lang.Object) entryArray5);
        int int8 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        boolean boolean10 = hashMap9.repOK();
        hashMap9.clear();
        hashMap9.clear();
        boolean boolean13 = hashMap9.repOK();
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = hashMap0.put((java.lang.Object) boolean13, obj14);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        int int2 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap4.clear();
        int int6 = hashMap4.size();
        int int7 = hashMap4.size();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap4.table;
        int int9 = hashMap4.modCount;
        int int10 = hashMap4.size();
        java.lang.Object obj12 = hashMap1.put((java.lang.Object) hashMap4, (java.lang.Object) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        hashMap0.modCount = (short) 0;
        hashMap0.clear();
        boolean boolean6 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        boolean boolean8 = hashMap7.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap7.table;
        java.lang.Object obj10 = hashMap0.get((java.lang.Object) entryArray9);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        java.lang.Object obj13 = hashMap11.remove((java.lang.Object) 0.0f);
        boolean boolean14 = hashMap11.isEmpty();
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap(0);
        int int17 = hashMap16.size();
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap16.table;
        java.lang.Object obj19 = hashMap11.get((java.lang.Object) entryArray18);
        hashMap0.table = entryArray18;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        hashMap1.clear();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap5.table;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) ' ');
        int int9 = hashMap8.size();
        boolean boolean10 = hashMap8.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap8.table;
        java.lang.Object obj12 = hashMap1.put((java.lang.Object) hashMap5, (java.lang.Object) hashMap8);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        int int3 = hashMap1.size();
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = hashMap1.remove(obj4);
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap1.table;
        hashMap1.clear();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        boolean boolean10 = hashMap9.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap9.table;
        java.lang.Object obj12 = hashMap1.put((java.lang.Object) (short) 100, (java.lang.Object) entryArray11);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap3.remove((java.lang.Object) 0.0f);
        boolean boolean6 = hashMap3.isEmpty();
        int int7 = hashMap3.size();
        java.lang.Object obj8 = hashMap0.get((java.lang.Object) int7);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap10.clear();
        int int12 = hashMap10.size();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        boolean boolean14 = hashMap13.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap13.table;
        hashMap10.table = entryArray15;
        boolean boolean17 = hashMap10.isEmpty();
        int int18 = hashMap10.modCount;
        int int19 = hashMap10.modCount;
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        hashMap20.clear();
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap23.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray25 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap23.table = entryArray25;
        java.lang.Object obj27 = hashMap20.get((java.lang.Object) entryArray25);
        java.lang.Object obj28 = hashMap10.remove((java.lang.Object) entryArray25);
        java.lang.Object obj30 = hashMap0.put((java.lang.Object) entryArray25, (java.lang.Object) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        int int3 = hashMap1.size();
        boolean boolean4 = hashMap1.isEmpty();
        hashMap1.modCount = '#';
        hashMap1.clear();
        java.lang.Object obj8 = null;
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        boolean boolean10 = hashMap9.repOK();
        hashMap9.clear();
        hashMap9.clear();
        java.lang.Object obj13 = hashMap1.put(obj8, (java.lang.Object) hashMap9);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) ' ');
        hashMap4.clear();
        hashMap4.modCount = (byte) 0;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.repOK();
        boolean boolean10 = hashMap8.isEmpty();
        hashMap8.modCount = (byte) 0;
        java.lang.Object obj13 = hashMap0.put((java.lang.Object) (byte) 0, (java.lang.Object) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) '4');
        boolean boolean2 = hashMap1.repOK();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap4.clear();
        int int6 = hashMap4.size();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        boolean boolean8 = hashMap7.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap7.table;
        hashMap4.table = entryArray9;
        hashMap1.table = entryArray9;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(0, 100.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(10, (float) 10L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap3.remove((java.lang.Object) 0.0f);
        boolean boolean6 = hashMap3.isEmpty();
        int int7 = hashMap3.size();
        java.lang.Object obj8 = hashMap0.get((java.lang.Object) int7);
        hashMap0.clear();
        hashMap0.clear();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        boolean boolean12 = hashMap11.repOK();
        hashMap11.clear();
        hashMap11.modCount = (short) 0;
        hashMap11.clear();
        boolean boolean17 = hashMap11.isEmpty();
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap19.clear();
        int int21 = hashMap19.size();
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = hashMap19.remove(obj22);
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap19.table;
        boolean boolean25 = hashMap19.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray26 = hashMap19.table;
        java.lang.Object obj27 = hashMap0.put((java.lang.Object) hashMap11, (java.lang.Object) hashMap19);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        int int3 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        boolean boolean5 = hashMap4.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap4.table;
        hashMap1.table = entryArray6;
        boolean boolean8 = hashMap1.isEmpty();
        int int9 = hashMap1.modCount;
        int int10 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) ' ');
        boolean boolean13 = hashMap12.isEmpty();
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap15.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap15.table;
        java.lang.Object obj19 = hashMap15.get((java.lang.Object) 0L);
        boolean boolean20 = hashMap15.isEmpty();
        hashMap15.modCount = (byte) 10;
        java.lang.Object obj23 = hashMap1.put((java.lang.Object) hashMap12, (java.lang.Object) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        int int3 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        boolean boolean5 = hashMap4.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap4.table;
        hashMap1.table = entryArray6;
        boolean boolean8 = hashMap1.repOK();
        java.lang.Object obj10 = hashMap1.get((java.lang.Object) (short) 0);
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap12.clear();
        int int14 = hashMap12.size();
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = hashMap12.remove(obj15);
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap12.table;
        hashMap1.table = entryArray17;
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        boolean boolean20 = hashMap19.repOK();
        int int21 = hashMap19.modCount;
        int int22 = hashMap19.modCount;
        java.lang.Object obj23 = hashMap1.get((java.lang.Object) int22);
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap(0);
        int int26 = hashMap25.size();
        hashMap25.clear();
        boolean boolean28 = hashMap25.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray29 = hashMap25.table;
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap(0);
        int int32 = hashMap31.size();
        system.classfixer.classes.HashMap.Entry[] entryArray33 = hashMap31.table;
        system.classfixer.classes.HashMap hashMap34 = new system.classfixer.classes.HashMap();
        boolean boolean35 = hashMap34.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray36 = hashMap34.table;
        java.lang.Object obj37 = hashMap31.get((java.lang.Object) entryArray36);
        system.classfixer.classes.HashMap hashMap39 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap39.clear();
        int int41 = hashMap39.size();
        system.classfixer.classes.HashMap hashMap42 = new system.classfixer.classes.HashMap();
        boolean boolean43 = hashMap42.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray44 = hashMap42.table;
        hashMap39.table = entryArray44;
        boolean boolean46 = hashMap39.repOK();
        java.lang.Object obj47 = hashMap31.get((java.lang.Object) boolean46);
        java.lang.Object obj48 = hashMap1.put((java.lang.Object) entryArray29, (java.lang.Object) hashMap31);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(32, (float) 10L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap4.clear();
        hashMap4.clear();
        java.lang.Object obj7 = hashMap0.get((java.lang.Object) hashMap4);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.repOK();
        hashMap8.clear();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        boolean boolean12 = hashMap11.repOK();
        hashMap11.clear();
        hashMap11.modCount = (short) 0;
        hashMap11.clear();
        boolean boolean17 = hashMap11.repOK();
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        boolean boolean19 = hashMap18.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray20 = hashMap18.table;
        java.lang.Object obj21 = hashMap11.get((java.lang.Object) entryArray20);
        hashMap8.table = entryArray20;
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap();
        boolean boolean24 = hashMap23.repOK();
        hashMap23.clear();
        hashMap23.clear();
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap28.clear();
        int int30 = hashMap28.size();
        int int31 = hashMap28.size();
        system.classfixer.classes.HashMap.Entry[] entryArray32 = hashMap28.table;
        int int33 = hashMap28.modCount;
        int int34 = hashMap28.size();
        int int35 = hashMap28.size();
        hashMap28.clear();
        java.lang.Object obj37 = hashMap23.remove((java.lang.Object) hashMap28);
        java.lang.Object obj38 = hashMap0.put((java.lang.Object) entryArray20, obj37);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(32, (float) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 0.0f);
        boolean boolean3 = hashMap0.isEmpty();
        boolean boolean4 = hashMap0.isEmpty();
        boolean boolean5 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap7.table;
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap7.table;
        hashMap0.table = entryArray9;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(32, (float) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        int int2 = hashMap0.modCount;
        hashMap0.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 100, (float) 1);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray7 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap6.table = entryArray7;
        hashMap4.table = entryArray7;
        hashMap4.clear();
        hashMap4.clear();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap13.clear();
        int int15 = hashMap13.size();
        java.lang.Object obj16 = null;
        java.lang.Object obj17 = hashMap13.remove(obj16);
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap13.table;
        hashMap13.clear();
        int int20 = hashMap13.size();
        boolean boolean21 = hashMap13.repOK();
        java.lang.Object obj22 = hashMap2.put((java.lang.Object) hashMap4, (java.lang.Object) hashMap13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        int int2 = hashMap1.size();
        hashMap1.clear();
        boolean boolean4 = hashMap1.repOK();
        hashMap1.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        hashMap1.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap1.table;
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap1.table;
        int int6 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap8.clear();
        hashMap8.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap8.table;
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap8.table;
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        boolean boolean14 = hashMap13.repOK();
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        hashMap15.clear();
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap18.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray20 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap18.table = entryArray20;
        java.lang.Object obj22 = hashMap15.get((java.lang.Object) entryArray20);
        int int23 = hashMap15.size();
        java.lang.Object obj24 = hashMap13.remove((java.lang.Object) hashMap15);
        int int25 = hashMap13.size();
        java.lang.Object obj26 = hashMap1.put((java.lang.Object) hashMap8, (java.lang.Object) hashMap13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 100);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap3.table;
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap3.table;
        hashMap1.table = entryArray5;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) ' ');
        int int2 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap4.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap4.table = entryArray6;
        int int8 = hashMap4.modCount;
        java.lang.Object obj9 = hashMap1.get((java.lang.Object) int8);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap((int) (short) 0);
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray14 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap13.table = entryArray14;
        java.lang.Object obj16 = hashMap11.get((java.lang.Object) hashMap13);
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap18.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray20 = hashMap18.table;
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap((int) ' ');
        java.lang.Object obj23 = hashMap18.get((java.lang.Object) hashMap22);
        int int24 = hashMap22.size();
        boolean boolean25 = hashMap22.repOK();
        java.lang.Object obj26 = hashMap1.put((java.lang.Object) hashMap11, (java.lang.Object) boolean25);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        int int3 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        boolean boolean5 = hashMap4.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap4.table;
        hashMap1.table = entryArray6;
        boolean boolean8 = hashMap1.isEmpty();
        int int9 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) (short) 1, (float) 1L);
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap12.table;
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        boolean boolean15 = hashMap14.repOK();
        int int16 = hashMap14.modCount;
        int int17 = hashMap14.modCount;
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap19.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray21 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap19.table = entryArray21;
        java.lang.Object obj23 = hashMap14.get((java.lang.Object) hashMap19);
        java.lang.Class<?> wildcardClass24 = hashMap19.getClass();
        java.lang.Object obj25 = hashMap1.put((java.lang.Object) hashMap12, (java.lang.Object) hashMap19);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap4.clear();
        hashMap4.clear();
        java.lang.Object obj7 = hashMap0.get((java.lang.Object) hashMap4);
        system.classfixer.classes.HashMap.Entry[] entryArray8 = null;
        hashMap0.table = entryArray8;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 1, (float) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(100, (float) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 10, (float) 100L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 100, (float) 10L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(100);
        int int2 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap4.clear();
        int int6 = hashMap4.size();
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = hashMap4.remove(obj7);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) ' ');
        hashMap10.modCount = 0;
        java.lang.Object obj13 = hashMap1.put(obj7, (java.lang.Object) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        int int3 = hashMap0.size();
        int int4 = hashMap0.size();
        int int5 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        boolean boolean7 = hashMap6.repOK();
        hashMap6.clear();
        hashMap6.clear();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap11.clear();
        int int13 = hashMap11.size();
        int int14 = hashMap11.size();
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap11.table;
        int int16 = hashMap11.modCount;
        int int17 = hashMap11.size();
        int int18 = hashMap11.size();
        hashMap11.clear();
        java.lang.Object obj20 = hashMap6.remove((java.lang.Object) hashMap11);
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap22.clear();
        int int24 = hashMap22.size();
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap();
        boolean boolean26 = hashMap25.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray27 = hashMap25.table;
        hashMap22.table = entryArray27;
        boolean boolean29 = hashMap22.repOK();
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap31.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray33 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap31.table = entryArray33;
        hashMap22.table = entryArray33;
        int int36 = hashMap22.modCount;
        java.lang.Object obj37 = hashMap0.put((java.lang.Object) hashMap11, (java.lang.Object) hashMap22);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        int int3 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        boolean boolean5 = hashMap4.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap4.table;
        hashMap1.table = entryArray6;
        boolean boolean8 = hashMap1.repOK();
        java.lang.Object obj10 = hashMap1.get((java.lang.Object) (short) 0);
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap12.clear();
        int int14 = hashMap12.size();
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = hashMap12.remove(obj15);
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap12.table;
        hashMap1.table = entryArray17;
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        boolean boolean20 = hashMap19.repOK();
        int int21 = hashMap19.modCount;
        int int22 = hashMap19.modCount;
        java.lang.Object obj23 = hashMap1.get((java.lang.Object) int22);
        hashMap1.modCount = 1;
        hashMap1.modCount = 0;
        system.classfixer.classes.HashMap.Entry[] entryArray28 = null;
        hashMap1.table = entryArray28;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) 'a', (float) (short) 1);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap4.clear();
        int int6 = hashMap4.size();
        int int7 = hashMap4.size();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap4.table;
        hashMap2.table = entryArray8;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 0.0f);
        boolean boolean3 = hashMap0.isEmpty();
        boolean boolean4 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap6.clear();
        int int8 = hashMap6.size();
        hashMap6.clear();
        boolean boolean10 = hashMap6.repOK();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap12.clear();
        hashMap12.clear();
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap(0);
        int int17 = hashMap16.size();
        hashMap16.clear();
        boolean boolean19 = hashMap16.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray20 = hashMap16.table;
        hashMap12.table = entryArray20;
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap23.clear();
        int int25 = hashMap23.size();
        boolean boolean26 = hashMap23.isEmpty();
        hashMap23.modCount = '#';
        system.classfixer.classes.HashMap.Entry[] entryArray29 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap23.table = entryArray29;
        hashMap12.table = entryArray29;
        hashMap6.table = entryArray29;
        hashMap0.table = entryArray29;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        hashMap0.clear();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap3.clear();
        int int5 = hashMap3.size();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        boolean boolean7 = hashMap6.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap6.table;
        hashMap3.table = entryArray8;
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap3.table;
        hashMap0.table = entryArray10;
        int int12 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap14.clear();
        hashMap14.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap14.table;
        int int18 = hashMap14.size();
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        boolean boolean20 = hashMap19.repOK();
        int int21 = hashMap19.modCount;
        int int22 = hashMap19.modCount;
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap24.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray26 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap24.table = entryArray26;
        java.lang.Object obj28 = hashMap19.get((java.lang.Object) hashMap24);
        system.classfixer.classes.HashMap.Entry[] entryArray29 = hashMap24.table;
        java.lang.Object obj30 = hashMap0.put((java.lang.Object) int18, (java.lang.Object) hashMap24);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        int int3 = hashMap0.size();
        hashMap0.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 0, (float) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap3.remove((java.lang.Object) 0.0f);
        boolean boolean6 = hashMap3.isEmpty();
        int int7 = hashMap3.size();
        java.lang.Object obj8 = hashMap0.get((java.lang.Object) int7);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        hashMap11.clear();
        int int13 = hashMap11.modCount;
        int int14 = hashMap11.modCount;
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap16.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap16.table;
        hashMap11.table = entryArray18;
        hashMap0.table = entryArray18;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        hashMap2.clear();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap5.clear();
        int int7 = hashMap5.size();
        int int8 = hashMap5.size();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap5.table;
        hashMap2.table = entryArray9;
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        boolean boolean12 = hashMap11.repOK();
        hashMap11.clear();
        hashMap11.clear();
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap16.clear();
        int int18 = hashMap16.size();
        java.lang.Object obj19 = null;
        java.lang.Object obj20 = hashMap16.remove(obj19);
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap16.table;
        java.lang.Object obj22 = hashMap2.put((java.lang.Object) hashMap11, (java.lang.Object) entryArray21);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 100, (float) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) 'a', (float) 52);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        int int3 = hashMap1.size();
        int int4 = hashMap1.size();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap1.table;
        int int6 = hashMap1.modCount;
        int int7 = hashMap1.size();
        boolean boolean8 = hashMap1.repOK();
        java.lang.Object obj9 = null;
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) '4', (float) (byte) 1);
        java.lang.Object obj13 = hashMap1.put(obj9, (java.lang.Object) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 100);
        boolean boolean2 = hashMap1.repOK();
        hashMap1.modCount = 10;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap6.table;
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = hashMap6.get(obj8);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap11.clear();
        hashMap11.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap11.table;
        java.lang.Object obj15 = hashMap6.remove((java.lang.Object) entryArray14);
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap17.clear();
        int int19 = hashMap17.size();
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        boolean boolean21 = hashMap20.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray22 = hashMap20.table;
        hashMap17.table = entryArray22;
        boolean boolean24 = hashMap17.repOK();
        java.lang.Object obj26 = hashMap17.get((java.lang.Object) (short) 0);
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap28.clear();
        int int30 = hashMap28.size();
        java.lang.Object obj31 = null;
        java.lang.Object obj32 = hashMap28.remove(obj31);
        system.classfixer.classes.HashMap.Entry[] entryArray33 = hashMap28.table;
        hashMap17.table = entryArray33;
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap();
        boolean boolean36 = hashMap35.repOK();
        int int37 = hashMap35.modCount;
        int int38 = hashMap35.modCount;
        java.lang.Object obj39 = hashMap17.get((java.lang.Object) int38);
        system.classfixer.classes.HashMap hashMap41 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap41.clear();
        hashMap41.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray44 = hashMap41.table;
        hashMap17.table = entryArray44;
        java.lang.Object obj46 = hashMap1.put((java.lang.Object) hashMap6, (java.lang.Object) entryArray44);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.repOK();
        int int3 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        hashMap6.clear();
        hashMap6.clear();
        boolean boolean9 = hashMap6.repOK();
        boolean boolean10 = hashMap6.isEmpty();
        java.lang.Object obj11 = hashMap0.get((java.lang.Object) hashMap6);
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap((int) 'a');
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        boolean boolean15 = hashMap14.repOK();
        hashMap14.clear();
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        java.lang.Object obj19 = hashMap17.remove((java.lang.Object) 0.0f);
        boolean boolean20 = hashMap17.isEmpty();
        int int21 = hashMap17.size();
        java.lang.Object obj22 = hashMap14.get((java.lang.Object) int21);
        hashMap14.clear();
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap(2);
        java.lang.Object obj26 = hashMap14.remove((java.lang.Object) 2);
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap();
        java.lang.Object obj29 = hashMap27.remove((java.lang.Object) 0.0f);
        boolean boolean30 = hashMap27.isEmpty();
        int int31 = hashMap27.size();
        java.lang.Object obj32 = hashMap14.get((java.lang.Object) hashMap27);
        java.lang.Object obj33 = hashMap0.put((java.lang.Object) 'a', (java.lang.Object) hashMap14);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(100, (float) 1);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap4.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap4.table;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) ' ');
        java.lang.Object obj9 = hashMap4.get((java.lang.Object) hashMap8);
        int int10 = hashMap8.size();
        java.lang.Object obj11 = hashMap2.get((java.lang.Object) int10);
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap2.table;
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap14.clear();
        int int16 = hashMap14.size();
        boolean boolean17 = hashMap14.isEmpty();
        hashMap14.modCount = '#';
        system.classfixer.classes.HashMap.Entry[] entryArray20 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap14.table = entryArray20;
        hashMap2.table = entryArray20;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(0, (float) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        hashMap2.clear();
        int int4 = hashMap2.modCount;
        int int5 = hashMap2.modCount;
        boolean boolean6 = hashMap2.repOK();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap8.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap8.table;
        hashMap2.table = entryArray10;
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap((int) ' ');
        hashMap13.modCount = 0;
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap13.table;
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap18.clear();
        int int20 = hashMap18.size();
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap();
        boolean boolean22 = hashMap21.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray23 = hashMap21.table;
        hashMap18.table = entryArray23;
        int int25 = hashMap18.modCount;
        java.lang.Object obj26 = hashMap2.put((java.lang.Object) hashMap13, (java.lang.Object) hashMap18);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        int int3 = hashMap1.size();
        int int4 = hashMap1.size();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap1.table;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        boolean boolean7 = hashMap6.repOK();
        boolean boolean8 = hashMap6.repOK();
        hashMap6.modCount = 2;
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap12.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray14 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap12.table = entryArray14;
        java.lang.Object obj16 = hashMap6.get((java.lang.Object) entryArray14);
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        hashMap17.clear();
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap20.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray22 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap20.table = entryArray22;
        java.lang.Object obj24 = hashMap17.get((java.lang.Object) entryArray22);
        int int25 = hashMap17.size();
        java.lang.Object obj26 = hashMap1.put(obj16, (java.lang.Object) hashMap17);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        int int3 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        boolean boolean5 = hashMap4.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap4.table;
        hashMap1.table = entryArray6;
        boolean boolean8 = hashMap1.repOK();
        java.lang.Object obj10 = hashMap1.get((java.lang.Object) (short) 0);
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap12.clear();
        int int14 = hashMap12.size();
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = hashMap12.remove(obj15);
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap12.table;
        hashMap1.table = entryArray17;
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        boolean boolean20 = hashMap19.repOK();
        int int21 = hashMap19.modCount;
        int int22 = hashMap19.modCount;
        java.lang.Object obj23 = hashMap1.get((java.lang.Object) int22);
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap25.clear();
        hashMap25.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray28 = hashMap25.table;
        hashMap1.table = entryArray28;
        int int30 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        hashMap33.clear();
        int int35 = hashMap33.modCount;
        int int36 = hashMap33.modCount;
        system.classfixer.classes.HashMap hashMap38 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap38.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray40 = hashMap38.table;
        hashMap33.table = entryArray40;
        system.classfixer.classes.HashMap hashMap42 = new system.classfixer.classes.HashMap();
        java.lang.Object obj44 = hashMap42.remove((java.lang.Object) 0.0f);
        hashMap42.modCount = ' ';
        hashMap42.modCount = 0;
        java.lang.Object obj49 = hashMap1.put((java.lang.Object) entryArray40, (java.lang.Object) hashMap42);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) ' ', (float) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.repOK();
        int int3 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        hashMap6.clear();
        hashMap6.clear();
        boolean boolean9 = hashMap6.repOK();
        boolean boolean10 = hashMap6.isEmpty();
        java.lang.Object obj11 = hashMap0.get((java.lang.Object) hashMap6);
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        java.lang.Object obj14 = hashMap12.remove((java.lang.Object) 0.0f);
        boolean boolean15 = hashMap12.isEmpty();
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap(0);
        int int18 = hashMap17.size();
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap17.table;
        java.lang.Object obj20 = hashMap12.get((java.lang.Object) entryArray19);
        hashMap0.table = entryArray19;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        int int2 = hashMap1.size();
        hashMap1.clear();
        boolean boolean4 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap1.table;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        boolean boolean7 = hashMap6.repOK();
        boolean boolean8 = hashMap6.repOK();
        int int9 = hashMap6.modCount;
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        hashMap12.clear();
        hashMap12.clear();
        boolean boolean15 = hashMap12.repOK();
        boolean boolean16 = hashMap12.isEmpty();
        java.lang.Object obj17 = hashMap6.get((java.lang.Object) hashMap12);
        int int18 = hashMap12.modCount;
        int int19 = hashMap12.modCount;
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap(0);
        int int22 = hashMap21.size();
        hashMap21.clear();
        boolean boolean24 = hashMap21.isEmpty();
        hashMap21.modCount = (byte) 1;
        hashMap21.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray28 = hashMap21.table;
        boolean boolean29 = hashMap21.repOK();
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap(0);
        int int32 = hashMap31.modCount;
        java.lang.Object obj33 = hashMap21.get((java.lang.Object) hashMap31);
        java.lang.Object obj34 = hashMap1.put((java.lang.Object) int19, (java.lang.Object) hashMap31);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 100);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap(0);
        int int4 = hashMap3.size();
        hashMap3.clear();
        boolean boolean6 = hashMap3.isEmpty();
        hashMap3.modCount = (byte) 1;
        hashMap3.clear();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap11.clear();
        int int13 = hashMap11.size();
        int int14 = hashMap11.size();
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap11.table;
        int int16 = hashMap11.modCount;
        int int17 = hashMap11.size();
        int int18 = hashMap11.size();
        hashMap11.clear();
        java.lang.Object obj20 = hashMap3.get((java.lang.Object) hashMap11);
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap22.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap22.table;
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap((int) ' ');
        java.lang.Object obj27 = hashMap22.get((java.lang.Object) hashMap26);
        int int28 = hashMap26.size();
        hashMap26.modCount = '4';
        java.lang.Object obj31 = hashMap1.put(obj20, (java.lang.Object) hashMap26);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        int int2 = hashMap1.size();
        hashMap1.clear();
        boolean boolean4 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap1.table;
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap7.clear();
        int int9 = hashMap7.size();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        boolean boolean11 = hashMap10.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap10.table;
        hashMap7.table = entryArray12;
        int int14 = hashMap7.modCount;
        java.lang.Object obj16 = hashMap7.remove((java.lang.Object) false);
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap((int) ' ');
        int int19 = hashMap18.size();
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap21.clear();
        int int23 = hashMap21.size();
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap();
        boolean boolean25 = hashMap24.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray26 = hashMap24.table;
        hashMap21.table = entryArray26;
        boolean boolean28 = hashMap21.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray29 = hashMap21.table;
        java.lang.Object obj30 = hashMap18.get((java.lang.Object) hashMap21);
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap(0);
        int int33 = hashMap32.size();
        system.classfixer.classes.HashMap.Entry[] entryArray34 = hashMap32.table;
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap();
        boolean boolean36 = hashMap35.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray37 = hashMap35.table;
        java.lang.Object obj38 = hashMap32.get((java.lang.Object) entryArray37);
        hashMap21.table = entryArray37;
        java.lang.Object obj40 = hashMap1.put((java.lang.Object) false, (java.lang.Object) entryArray37);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap3.remove((java.lang.Object) 0.0f);
        boolean boolean6 = hashMap3.isEmpty();
        int int7 = hashMap3.size();
        java.lang.Object obj8 = hashMap0.get((java.lang.Object) int7);
        hashMap0.clear();
        java.lang.Object obj10 = null;
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap12.clear();
        hashMap12.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap12.table;
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        boolean boolean17 = hashMap16.repOK();
        boolean boolean18 = hashMap16.isEmpty();
        java.lang.Object obj19 = hashMap12.remove((java.lang.Object) boolean18);
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray22 = hashMap21.table;
        java.lang.Object obj23 = null;
        java.lang.Object obj24 = hashMap21.get(obj23);
        int int25 = hashMap21.modCount;
        java.lang.Object obj26 = hashMap12.get((java.lang.Object) hashMap21);
        java.lang.Object obj27 = hashMap0.put(obj10, obj26);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        int int3 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        boolean boolean5 = hashMap4.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap4.table;
        hashMap1.table = entryArray6;
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap1.table;
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        hashMap11.clear();
        int int13 = hashMap11.modCount;
        int int14 = hashMap11.modCount;
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap16.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap16.table;
        hashMap11.table = entryArray18;
        java.lang.Object obj20 = hashMap1.remove((java.lang.Object) entryArray18);
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap();
        java.lang.Object obj23 = hashMap21.remove((java.lang.Object) 0.0f);
        boolean boolean24 = hashMap21.isEmpty();
        int int25 = hashMap21.size();
        system.classfixer.classes.HashMap.Entry[] entryArray26 = hashMap21.table;
        int int27 = hashMap21.size();
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap29.clear();
        int int31 = hashMap29.size();
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap();
        boolean boolean33 = hashMap32.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray34 = hashMap32.table;
        hashMap29.table = entryArray34;
        boolean boolean36 = hashMap29.repOK();
        java.lang.Object obj38 = hashMap29.get((java.lang.Object) (short) 0);
        system.classfixer.classes.HashMap hashMap40 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap40.clear();
        int int42 = hashMap40.size();
        java.lang.Object obj43 = null;
        java.lang.Object obj44 = hashMap40.remove(obj43);
        system.classfixer.classes.HashMap.Entry[] entryArray45 = hashMap40.table;
        hashMap29.table = entryArray45;
        system.classfixer.classes.HashMap hashMap47 = new system.classfixer.classes.HashMap();
        boolean boolean48 = hashMap47.repOK();
        int int49 = hashMap47.modCount;
        int int50 = hashMap47.modCount;
        java.lang.Object obj51 = hashMap29.get((java.lang.Object) int50);
        java.lang.Object obj52 = hashMap1.put((java.lang.Object) hashMap21, (java.lang.Object) int50);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(0, (float) 97);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 0.0f);
        java.lang.Object obj4 = hashMap0.remove((java.lang.Object) 1.0d);
        boolean boolean5 = hashMap0.isEmpty();
        boolean boolean6 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        hashMap9.clear();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        hashMap13.clear();
        int int15 = hashMap13.modCount;
        int int16 = hashMap13.modCount;
        boolean boolean17 = hashMap13.repOK();
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap19.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap19.table;
        hashMap13.table = entryArray21;
        hashMap9.table = entryArray21;
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap25.clear();
        int int27 = hashMap25.size();
        hashMap25.clear();
        boolean boolean29 = hashMap25.repOK();
        java.lang.Object obj30 = hashMap0.put((java.lang.Object) hashMap9, (java.lang.Object) boolean29);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) ' ');
        boolean boolean2 = hashMap1.isEmpty();
        int int3 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        hashMap6.clear();
        int int8 = hashMap6.modCount;
        boolean boolean9 = hashMap6.repOK();
        int int10 = hashMap6.size();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap(0);
        int int13 = hashMap12.size();
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap12.table;
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        boolean boolean16 = hashMap15.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap15.table;
        java.lang.Object obj18 = hashMap12.get((java.lang.Object) entryArray17);
        hashMap6.table = entryArray17;
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap21.clear();
        hashMap21.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap21.table;
        system.classfixer.classes.HashMap.Entry[] entryArray25 = hashMap21.table;
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap();
        boolean boolean27 = hashMap26.repOK();
        boolean boolean28 = hashMap26.isEmpty();
        hashMap26.modCount = (byte) 0;
        java.lang.Object obj31 = hashMap21.remove((java.lang.Object) (byte) 0);
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap((int) ' ');
        boolean boolean34 = hashMap33.isEmpty();
        java.lang.Object obj35 = hashMap21.get((java.lang.Object) boolean34);
        java.lang.Object obj36 = hashMap1.put((java.lang.Object) hashMap6, obj35);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 1);
        hashMap1.clear();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap3.remove((java.lang.Object) 0.0f);
        hashMap3.modCount = ' ';
        int int8 = hashMap3.size();
        boolean boolean9 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        boolean boolean11 = hashMap10.repOK();
        hashMap10.clear();
        java.lang.Object obj13 = hashMap1.put((java.lang.Object) boolean9, (java.lang.Object) hashMap10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        int int3 = hashMap1.size();
        int int4 = hashMap1.size();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap1.table;
        int int6 = hashMap1.modCount;
        int int7 = hashMap1.size();
        int int8 = hashMap1.size();
        hashMap1.clear();
        hashMap1.clear();
        int int11 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        boolean boolean13 = hashMap12.repOK();
        hashMap12.clear();
        hashMap12.clear();
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap(0);
        int int18 = hashMap17.size();
        hashMap17.clear();
        boolean boolean20 = hashMap17.isEmpty();
        hashMap17.modCount = (byte) 1;
        java.lang.Object obj23 = hashMap12.remove((java.lang.Object) (byte) 1);
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap(0);
        int int26 = hashMap25.size();
        hashMap25.clear();
        int int28 = hashMap25.size();
        java.lang.Class<?> wildcardClass29 = hashMap25.getClass();
        java.lang.Object obj30 = hashMap1.put((java.lang.Object) hashMap12, (java.lang.Object) hashMap25);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 10, (float) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) ' ');
        int int2 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap4.clear();
        int int6 = hashMap4.size();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        boolean boolean8 = hashMap7.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap7.table;
        hashMap4.table = entryArray9;
        boolean boolean11 = hashMap4.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap4.table;
        java.lang.Object obj13 = hashMap1.get((java.lang.Object) hashMap4);
        int int14 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap16.clear();
        int int18 = hashMap16.size();
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        boolean boolean20 = hashMap19.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap19.table;
        hashMap16.table = entryArray21;
        boolean boolean23 = hashMap16.repOK();
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap25.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray27 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap25.table = entryArray27;
        hashMap16.table = entryArray27;
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap();
        boolean boolean31 = hashMap30.repOK();
        int int32 = hashMap30.modCount;
        system.classfixer.classes.HashMap hashMap34 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap34.clear();
        int int36 = hashMap34.size();
        int int37 = hashMap34.size();
        system.classfixer.classes.HashMap.Entry[] entryArray38 = hashMap34.table;
        system.classfixer.classes.HashMap hashMap40 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap40.clear();
        int int42 = hashMap40.size();
        system.classfixer.classes.HashMap hashMap43 = new system.classfixer.classes.HashMap();
        boolean boolean44 = hashMap43.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray45 = hashMap43.table;
        hashMap40.table = entryArray45;
        hashMap34.table = entryArray45;
        hashMap30.table = entryArray45;
        hashMap16.table = entryArray45;
        hashMap1.table = entryArray45;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        hashMap2.clear();
        int int4 = hashMap2.modCount;
        int int5 = hashMap2.modCount;
        int int6 = hashMap2.modCount;
        boolean boolean7 = hashMap2.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap2.table;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray13 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap12.table = entryArray13;
        hashMap10.table = entryArray13;
        hashMap2.table = entryArray13;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        hashMap2.clear();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap5.clear();
        hashMap5.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap5.table;
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        boolean boolean10 = hashMap9.repOK();
        boolean boolean11 = hashMap9.isEmpty();
        java.lang.Object obj12 = hashMap5.remove((java.lang.Object) boolean11);
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        hashMap13.clear();
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap16.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray18 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap16.table = entryArray18;
        java.lang.Object obj20 = hashMap13.get((java.lang.Object) entryArray18);
        hashMap13.modCount = (byte) 10;
        hashMap13.modCount = (byte) 10;
        java.lang.Object obj25 = hashMap2.put((java.lang.Object) hashMap5, (java.lang.Object) hashMap13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        hashMap2.clear();
        int int4 = hashMap2.modCount;
        boolean boolean5 = hashMap2.isEmpty();
        int int6 = hashMap2.modCount;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap8.clear();
        hashMap8.clear();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap(0);
        int int13 = hashMap12.size();
        hashMap12.clear();
        boolean boolean15 = hashMap12.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap12.table;
        hashMap8.table = entryArray16;
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap19.clear();
        int int21 = hashMap19.size();
        boolean boolean22 = hashMap19.isEmpty();
        hashMap19.modCount = '#';
        system.classfixer.classes.HashMap.Entry[] entryArray25 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap19.table = entryArray25;
        hashMap8.table = entryArray25;
        hashMap2.table = entryArray25;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        hashMap2.clear();
        int int4 = hashMap2.modCount;
        boolean boolean5 = hashMap2.isEmpty();
        int int6 = hashMap2.modCount;
        hashMap2.modCount = (byte) 0;
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        boolean boolean10 = hashMap9.repOK();
        int int11 = hashMap9.modCount;
        int int12 = hashMap9.modCount;
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap14.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray16 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap14.table = entryArray16;
        java.lang.Object obj18 = hashMap9.get((java.lang.Object) hashMap14);
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap14.table;
        hashMap2.table = entryArray19;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(97, 10.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        int int3 = hashMap1.size();
        int int4 = hashMap1.size();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap1.table;
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap(0);
        int int8 = hashMap7.size();
        hashMap7.clear();
        hashMap7.clear();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        boolean boolean12 = hashMap11.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap11.table;
        java.lang.Object obj14 = hashMap7.get((java.lang.Object) entryArray13);
        int int15 = hashMap7.size();
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap((int) ' ');
        java.lang.Object obj19 = hashMap17.get((java.lang.Object) (short) 1);
        java.lang.Class<?> wildcardClass20 = hashMap17.getClass();
        java.lang.Object obj21 = hashMap1.put((java.lang.Object) int15, (java.lang.Object) wildcardClass20);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        int int2 = hashMap1.size();
        hashMap1.clear();
        boolean boolean4 = hashMap1.isEmpty();
        hashMap1.modCount = (byte) 1;
        hashMap1.clear();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap9.clear();
        int int11 = hashMap9.size();
        int int12 = hashMap9.size();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap9.table;
        int int14 = hashMap9.modCount;
        int int15 = hashMap9.size();
        int int16 = hashMap9.size();
        hashMap9.clear();
        java.lang.Object obj18 = hashMap1.get((java.lang.Object) hashMap9);
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap1.table;
        int int20 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap22.clear();
        int int24 = hashMap22.size();
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap();
        boolean boolean26 = hashMap25.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray27 = hashMap25.table;
        hashMap22.table = entryArray27;
        boolean boolean29 = hashMap22.repOK();
        boolean boolean30 = hashMap22.isEmpty();
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap32.clear();
        hashMap32.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray35 = hashMap32.table;
        hashMap22.table = entryArray35;
        system.classfixer.classes.HashMap hashMap38 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap38.clear();
        int int40 = hashMap38.size();
        int int41 = hashMap38.size();
        system.classfixer.classes.HashMap.Entry[] entryArray42 = hashMap38.table;
        system.classfixer.classes.HashMap.Entry[] entryArray43 = hashMap38.table;
        java.lang.Object obj44 = hashMap1.put((java.lang.Object) hashMap22, (java.lang.Object) entryArray43);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap1.table;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) ' ');
        java.lang.Object obj6 = hashMap1.get((java.lang.Object) hashMap5);
        int int7 = hashMap5.size();
        hashMap5.modCount = '4';
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap11.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap11.table;
        boolean boolean14 = hashMap11.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap11.table;
        java.lang.Object obj16 = hashMap5.get((java.lang.Object) entryArray15);
        boolean boolean17 = hashMap5.isEmpty();
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap19.clear();
        int int21 = hashMap19.size();
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        boolean boolean23 = hashMap22.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap22.table;
        hashMap19.table = entryArray24;
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        hashMap28.clear();
        int int30 = hashMap28.modCount;
        int int31 = hashMap28.modCount;
        boolean boolean32 = hashMap28.repOK();
        system.classfixer.classes.HashMap hashMap34 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap34.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray36 = hashMap34.table;
        hashMap28.table = entryArray36;
        system.classfixer.classes.HashMap hashMap38 = new system.classfixer.classes.HashMap();
        boolean boolean39 = hashMap38.repOK();
        hashMap38.clear();
        hashMap38.clear();
        boolean boolean42 = hashMap38.repOK();
        int int43 = hashMap38.modCount;
        java.lang.Object obj44 = hashMap28.remove((java.lang.Object) int43);
        java.lang.Object obj45 = hashMap19.remove((java.lang.Object) hashMap28);
        java.lang.Object obj47 = hashMap5.put((java.lang.Object) hashMap19, (java.lang.Object) 100L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap5", hashMap5.repOK_2());
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        hashMap0.clear();
        boolean boolean4 = hashMap0.repOK();
        int int5 = hashMap0.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap(0);
        int int9 = hashMap8.size();
        hashMap8.clear();
        boolean boolean11 = hashMap8.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap8.table;
        hashMap0.table = entryArray12;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        int int2 = hashMap1.size();
        hashMap1.clear();
        hashMap1.clear();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        boolean boolean6 = hashMap5.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap5.table;
        java.lang.Object obj8 = hashMap1.get((java.lang.Object) entryArray7);
        int int9 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        hashMap12.clear();
        int int14 = hashMap12.modCount;
        boolean boolean15 = hashMap12.repOK();
        int int16 = hashMap12.size();
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap(0);
        int int19 = hashMap18.size();
        system.classfixer.classes.HashMap.Entry[] entryArray20 = hashMap18.table;
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap();
        boolean boolean22 = hashMap21.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray23 = hashMap21.table;
        java.lang.Object obj24 = hashMap18.get((java.lang.Object) entryArray23);
        hashMap12.table = entryArray23;
        hashMap1.table = entryArray23;
        int int27 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap29.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray31 = hashMap29.table;
        java.lang.Object obj33 = hashMap29.get((java.lang.Object) 0L);
        boolean boolean34 = hashMap29.isEmpty();
        hashMap29.modCount = (byte) 10;
        system.classfixer.classes.HashMap hashMap38 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap38.clear();
        int int40 = hashMap38.size();
        boolean boolean41 = hashMap38.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray42 = hashMap38.table;
        boolean boolean43 = hashMap38.isEmpty();
        java.lang.Object obj44 = hashMap1.put((java.lang.Object) hashMap29, (java.lang.Object) hashMap38);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        int int2 = hashMap1.size();
        hashMap1.clear();
        boolean boolean4 = hashMap1.isEmpty();
        hashMap1.modCount = (byte) 1;
        hashMap1.clear();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap9.clear();
        int int11 = hashMap9.size();
        int int12 = hashMap9.size();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap9.table;
        int int14 = hashMap9.modCount;
        int int15 = hashMap9.size();
        int int16 = hashMap9.size();
        hashMap9.clear();
        java.lang.Object obj18 = hashMap1.get((java.lang.Object) hashMap9);
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap1.table;
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap((int) (short) 1, (float) 1L);
        java.lang.Object obj23 = hashMap1.get((java.lang.Object) hashMap22);
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap25.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray27 = hashMap25.table;
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap((int) ' ');
        java.lang.Object obj30 = hashMap25.get((java.lang.Object) hashMap29);
        boolean boolean31 = hashMap25.isEmpty();
        boolean boolean32 = hashMap25.repOK();
        system.classfixer.classes.HashMap hashMap34 = new system.classfixer.classes.HashMap(0);
        int int35 = hashMap34.size();
        hashMap34.clear();
        boolean boolean37 = hashMap34.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray38 = hashMap34.table;
        system.classfixer.classes.HashMap.Entry[] entryArray39 = hashMap34.table;
        hashMap34.modCount = 1;
        java.lang.Object obj42 = hashMap22.put((java.lang.Object) boolean32, (java.lang.Object) hashMap34);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap22", hashMap22.repOK_2());
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(0, (float) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 0.0f);
        boolean boolean3 = hashMap0.isEmpty();
        int int4 = hashMap0.size();
        hashMap0.clear();
        int int6 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        hashMap9.clear();
        int int11 = hashMap9.modCount;
        int int12 = hashMap9.modCount;
        int int13 = hashMap9.modCount;
        boolean boolean14 = hashMap9.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap9.table;
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap17.clear();
        int int19 = hashMap17.size();
        int int20 = hashMap17.size();
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap17.table;
        int int22 = hashMap17.modCount;
        int int23 = hashMap17.size();
        int int24 = hashMap17.size();
        hashMap17.clear();
        java.lang.Object obj26 = hashMap0.put((java.lang.Object) hashMap9, (java.lang.Object) hashMap17);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 0, (float) 52);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(100, (float) 1);
        boolean boolean3 = hashMap2.repOK();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap5.clear();
        int int7 = hashMap5.size();
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = hashMap5.remove(obj8);
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap5.table;
        hashMap5.clear();
        int int12 = hashMap5.size();
        boolean boolean13 = hashMap5.repOK();
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        hashMap16.clear();
        int int18 = hashMap16.modCount;
        int int19 = hashMap16.modCount;
        boolean boolean20 = hashMap16.isEmpty();
        java.lang.Object obj21 = hashMap2.put((java.lang.Object) hashMap5, (java.lang.Object) boolean20);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(100);
        hashMap1.modCount = '#';
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap5.clear();
        int int7 = hashMap5.size();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap8.table;
        hashMap5.table = entryArray10;
        boolean boolean12 = hashMap5.repOK();
        java.lang.Object obj14 = hashMap5.get((java.lang.Object) (short) 0);
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap16.clear();
        int int18 = hashMap16.size();
        java.lang.Object obj19 = null;
        java.lang.Object obj20 = hashMap16.remove(obj19);
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap16.table;
        hashMap5.table = entryArray21;
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap();
        boolean boolean24 = hashMap23.repOK();
        int int25 = hashMap23.modCount;
        int int26 = hashMap23.modCount;
        java.lang.Object obj27 = hashMap5.get((java.lang.Object) int26);
        hashMap5.modCount = 1;
        int int30 = hashMap5.modCount;
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap34 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap34.clear();
        hashMap34.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray37 = hashMap34.table;
        system.classfixer.classes.HashMap.Entry[] entryArray38 = hashMap34.table;
        hashMap32.table = entryArray38;
        java.lang.Object obj40 = hashMap5.get((java.lang.Object) entryArray38);
        hashMap1.table = entryArray38;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(100, (float) 1);
        boolean boolean3 = hashMap2.repOK();
        hashMap2.modCount = 0;
        int int6 = hashMap2.size();
        hashMap2.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(1, (float) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(32);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap3.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap3.table = entryArray5;
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap3.table;
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap9.clear();
        hashMap9.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap9.table;
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap9.table;
        hashMap3.table = entryArray13;
        hashMap1.table = entryArray13;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(10, (float) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(0, 10.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        int int3 = hashMap1.size();
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = hashMap1.remove(obj4);
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap1.table;
        boolean boolean7 = hashMap1.repOK();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        java.lang.Object obj10 = hashMap8.get((java.lang.Object) 100L);
        java.lang.Object obj11 = hashMap1.get((java.lang.Object) 100L);
        boolean boolean12 = hashMap1.repOK();
        int int13 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        hashMap14.clear();
        boolean boolean16 = hashMap14.repOK();
        hashMap14.modCount = 52;
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap((int) ' ');
        int int21 = hashMap20.size();
        boolean boolean22 = hashMap20.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray23 = hashMap20.table;
        hashMap20.clear();
        java.lang.Object obj25 = hashMap1.put((java.lang.Object) 52, (java.lang.Object) hashMap20);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        int int3 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        boolean boolean5 = hashMap4.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap4.table;
        hashMap1.table = entryArray6;
        boolean boolean8 = hashMap1.repOK();
        java.lang.Object obj10 = hashMap1.get((java.lang.Object) (short) 0);
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap12.clear();
        int int14 = hashMap12.size();
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = hashMap12.remove(obj15);
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap12.table;
        hashMap1.table = entryArray17;
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        boolean boolean20 = hashMap19.repOK();
        int int21 = hashMap19.modCount;
        int int22 = hashMap19.modCount;
        java.lang.Object obj23 = hashMap1.get((java.lang.Object) int22);
        hashMap1.modCount = 1;
        java.lang.Object obj26 = null;
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap28.clear();
        int int30 = hashMap28.size();
        java.lang.Object obj31 = null;
        java.lang.Object obj32 = hashMap28.remove(obj31);
        system.classfixer.classes.HashMap.Entry[] entryArray33 = hashMap28.table;
        int int34 = hashMap28.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray35 = hashMap28.table;
        java.lang.Object obj36 = hashMap1.put(obj26, (java.lang.Object) hashMap28);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        hashMap0.clear();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap3.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap3.table = entryArray5;
        java.lang.Object obj7 = hashMap0.get((java.lang.Object) entryArray5);
        hashMap0.modCount = (byte) 10;
        int int10 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap12.clear();
        hashMap12.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap12.table;
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap12.table;
        hashMap0.table = entryArray16;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        hashMap0.clear();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap3.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap3.table = entryArray5;
        java.lang.Object obj7 = hashMap0.get((java.lang.Object) entryArray5);
        hashMap0.modCount = (byte) 10;
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        hashMap12.clear();
        int int14 = hashMap12.modCount;
        boolean boolean15 = hashMap12.isEmpty();
        int int16 = hashMap12.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap12.table;
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap19.clear();
        int int21 = hashMap19.size();
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        boolean boolean23 = hashMap22.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap22.table;
        hashMap19.table = entryArray24;
        boolean boolean26 = hashMap19.repOK();
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap28.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray30 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap28.table = entryArray30;
        hashMap19.table = entryArray30;
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap();
        boolean boolean34 = hashMap33.repOK();
        int int35 = hashMap33.modCount;
        system.classfixer.classes.HashMap hashMap37 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap37.clear();
        int int39 = hashMap37.size();
        int int40 = hashMap37.size();
        system.classfixer.classes.HashMap.Entry[] entryArray41 = hashMap37.table;
        system.classfixer.classes.HashMap hashMap43 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap43.clear();
        int int45 = hashMap43.size();
        system.classfixer.classes.HashMap hashMap46 = new system.classfixer.classes.HashMap();
        boolean boolean47 = hashMap46.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray48 = hashMap46.table;
        hashMap43.table = entryArray48;
        hashMap37.table = entryArray48;
        hashMap33.table = entryArray48;
        hashMap19.table = entryArray48;
        hashMap12.table = entryArray48;
        system.classfixer.classes.HashMap hashMap54 = new system.classfixer.classes.HashMap();
        boolean boolean55 = hashMap54.repOK();
        hashMap54.clear();
        hashMap54.modCount = (short) 0;
        hashMap54.clear();
        boolean boolean60 = hashMap54.repOK();
        system.classfixer.classes.HashMap hashMap61 = new system.classfixer.classes.HashMap();
        boolean boolean62 = hashMap61.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray63 = hashMap61.table;
        java.lang.Object obj64 = hashMap54.get((java.lang.Object) entryArray63);
        java.lang.Object obj65 = hashMap0.put((java.lang.Object) hashMap12, (java.lang.Object) hashMap54);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        int int2 = hashMap1.size();
        hashMap1.clear();
        boolean boolean4 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap1.table;
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap1.table;
        hashMap1.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) ' ', (float) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        int int3 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        boolean boolean5 = hashMap4.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap4.table;
        hashMap1.table = entryArray6;
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap1.table;
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        hashMap11.clear();
        int int13 = hashMap11.modCount;
        int int14 = hashMap11.modCount;
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap16.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap16.table;
        hashMap11.table = entryArray18;
        java.lang.Object obj20 = hashMap1.remove((java.lang.Object) entryArray18);
        int int21 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap23.clear();
        int int25 = hashMap23.size();
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap();
        boolean boolean27 = hashMap26.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray28 = hashMap26.table;
        hashMap23.table = entryArray28;
        system.classfixer.classes.HashMap.Entry[] entryArray30 = hashMap23.table;
        hashMap23.clear();
        int int32 = hashMap23.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray33 = hashMap23.table;
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap(0);
        int int36 = hashMap35.size();
        hashMap35.clear();
        boolean boolean38 = hashMap35.isEmpty();
        hashMap35.modCount = (byte) 1;
        hashMap35.clear();
        hashMap35.clear();
        java.lang.Class<?> wildcardClass43 = hashMap35.getClass();
        java.lang.Object obj44 = hashMap1.put((java.lang.Object) hashMap23, (java.lang.Object) wildcardClass43);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        int int3 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        boolean boolean5 = hashMap4.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap4.table;
        hashMap1.table = entryArray6;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        hashMap10.clear();
        int int12 = hashMap10.modCount;
        int int13 = hashMap10.modCount;
        boolean boolean14 = hashMap10.repOK();
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap16.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap16.table;
        hashMap10.table = entryArray18;
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        boolean boolean21 = hashMap20.repOK();
        hashMap20.clear();
        hashMap20.clear();
        boolean boolean24 = hashMap20.repOK();
        int int25 = hashMap20.modCount;
        java.lang.Object obj26 = hashMap10.remove((java.lang.Object) int25);
        java.lang.Object obj27 = hashMap1.remove((java.lang.Object) hashMap10);
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap29.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray31 = hashMap29.table;
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap((int) ' ');
        java.lang.Object obj34 = hashMap29.get((java.lang.Object) hashMap33);
        int int35 = hashMap33.size();
        hashMap33.modCount = '4';
        java.lang.Object obj39 = hashMap1.put((java.lang.Object) '4', (java.lang.Object) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) ' ');
        hashMap1.modCount = 0;
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap1.table;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap6.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap6.table;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) ' ');
        java.lang.Object obj11 = hashMap6.get((java.lang.Object) hashMap10);
        int int12 = hashMap10.size();
        hashMap10.modCount = '4';
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap16.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap16.table;
        boolean boolean19 = hashMap16.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray20 = hashMap16.table;
        java.lang.Object obj21 = hashMap10.get((java.lang.Object) entryArray20);
        hashMap1.table = entryArray20;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }
}

