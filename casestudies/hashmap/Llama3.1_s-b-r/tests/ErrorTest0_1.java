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
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) ' ', (float) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 10);
        hashMap1.clear();
        system.testclass.HashMap.Entry[] entryArray3 = new system.testclass.HashMap.Entry[] {};
        hashMap1.table = entryArray3;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap((int) (byte) 0);
        hashMap3.clear();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap3.table;
        hashMap1.table = entryArray5;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        boolean boolean4 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        hashMap5.clear();
        system.testclass.HashMap.Entry[] entryArray7 = hashMap5.table;
        hashMap0.table = entryArray7;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) (byte) 0);
        hashMap10.clear();
        system.testclass.HashMap.Entry[] entryArray12 = hashMap10.table;
        hashMap0.table = entryArray12;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        hashMap1.clear();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap1.table;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        int int6 = hashMap4.size();
        java.lang.Object obj8 = hashMap4.get((java.lang.Object) 10);
        java.lang.Object obj9 = hashMap1.remove((java.lang.Object) hashMap4);
        java.lang.Object obj11 = hashMap1.remove((java.lang.Object) 0.0d);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        hashMap12.modCount = 0;
        java.lang.Object obj15 = hashMap1.get((java.lang.Object) hashMap12);
        java.lang.Object obj17 = hashMap12.get((java.lang.Object) (-1.0d));
        int int18 = hashMap12.modCount;
        system.testclass.HashMap.Entry[] entryArray19 = new system.testclass.HashMap.Entry[] {};
        hashMap12.table = entryArray19;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap12", hashMap12.repOK_1());
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        hashMap1.clear();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap1.table;
        boolean boolean4 = hashMap1.isEmpty();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        boolean boolean6 = hashMap5.isEmpty();
        boolean boolean7 = hashMap5.isEmpty();
        int int8 = hashMap5.modCount;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        hashMap9.clear();
        java.lang.Object obj11 = hashMap5.get((java.lang.Object) hashMap9);
        hashMap9.clear();
        int int13 = hashMap9.size();
        java.lang.Object obj15 = hashMap1.put((java.lang.Object) int13, (java.lang.Object) 97);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.clear();
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) (byte) 0);
        hashMap0.modCount = 'a';
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        int int9 = hashMap7.modCount;
        java.lang.Object obj10 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap7);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 0, (float) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        hashMap1.clear();
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        hashMap5.clear();
        system.testclass.HashMap.Entry[] entryArray7 = hashMap5.table;
        java.lang.Object obj8 = hashMap1.put((java.lang.Object) int4, (java.lang.Object) hashMap5);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) '#');
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        hashMap4.modCount = 0;
        java.lang.Object obj7 = hashMap3.remove((java.lang.Object) hashMap4);
        system.testclass.HashMap.Entry[] entryArray8 = hashMap4.table;
        hashMap1.table = entryArray8;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(97, 10.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap(0);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object obj5 = hashMap3.remove(obj4);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        hashMap6.clear();
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = hashMap6.remove(obj8);
        java.lang.Object obj10 = hashMap0.put(obj5, (java.lang.Object) hashMap6);
        hashMap6.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap6", hashMap6.repOK_1());
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '#', (float) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.clear();
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) (byte) 0);
        boolean boolean4 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) '#');
        system.testclass.HashMap.Entry[] entryArray7 = hashMap6.table;
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) entryArray7);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) (byte) 0);
        hashMap10.clear();
        system.testclass.HashMap.Entry[] entryArray12 = hashMap10.table;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        boolean boolean14 = hashMap13.isEmpty();
        int int15 = hashMap13.size();
        java.lang.Object obj17 = hashMap13.get((java.lang.Object) 10);
        java.lang.Object obj18 = hashMap10.remove((java.lang.Object) hashMap13);
        java.lang.Object obj20 = hashMap10.remove((java.lang.Object) 0.0d);
        java.lang.Object obj22 = hashMap0.put((java.lang.Object) 0.0d, (java.lang.Object) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 0, (float) 10L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        int int3 = hashMap0.modCount;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        hashMap4.clear();
        java.lang.Object obj6 = hashMap0.get((java.lang.Object) hashMap4);
        hashMap4.clear();
        int int8 = hashMap4.size();
        int int9 = hashMap4.size();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        boolean boolean12 = hashMap10.isEmpty();
        int int13 = hashMap10.modCount;
        int int14 = hashMap10.size();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        hashMap15.clear();
        java.lang.Object obj18 = hashMap15.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        boolean boolean20 = hashMap19.isEmpty();
        boolean boolean21 = hashMap19.isEmpty();
        int int22 = hashMap19.modCount;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        hashMap23.clear();
        java.lang.Object obj25 = hashMap19.get((java.lang.Object) hashMap23);
        java.lang.Object obj26 = hashMap15.remove((java.lang.Object) hashMap23);
        java.lang.Object obj27 = hashMap10.get(obj26);
        java.lang.Class<?> wildcardClass28 = hashMap10.getClass();
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap(1);
        java.lang.Class<?> wildcardClass31 = hashMap30.getClass();
        java.lang.Object obj32 = hashMap4.put((java.lang.Object) wildcardClass28, (java.lang.Object) wildcardClass31);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap4", hashMap4.repOK_1());
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 100, (float) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        int int3 = hashMap0.modCount;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        hashMap4.clear();
        java.lang.Object obj6 = hashMap0.get((java.lang.Object) hashMap4);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        int int9 = hashMap7.size();
        java.lang.Object obj11 = hashMap7.get((java.lang.Object) 10);
        hashMap7.clear();
        java.lang.Class<?> wildcardClass13 = hashMap7.getClass();
        java.lang.Object obj14 = hashMap4.remove((java.lang.Object) hashMap7);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap((int) (byte) 0);
        hashMap17.clear();
        system.testclass.HashMap.Entry[] entryArray19 = hashMap17.table;
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        boolean boolean21 = hashMap20.isEmpty();
        int int22 = hashMap20.size();
        java.lang.Object obj24 = hashMap20.get((java.lang.Object) 10);
        java.lang.Object obj25 = hashMap17.remove((java.lang.Object) hashMap20);
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap((int) (short) 10);
        hashMap27.clear();
        java.lang.Object obj29 = hashMap20.remove((java.lang.Object) hashMap27);
        java.lang.Object obj30 = hashMap4.put((java.lang.Object) 100.0f, obj29);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap4", hashMap4.repOK_1());
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray2 = hashMap0.table;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        hashMap3.clear();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) '#');
        system.testclass.HashMap.Entry[] entryArray7 = hashMap6.table;
        java.lang.Object obj8 = hashMap0.put((java.lang.Object) hashMap3, (java.lang.Object) hashMap6);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, 100.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        hashMap0.clear();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap0.table;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) (byte) 0);
        hashMap7.clear();
        system.testclass.HashMap.Entry[] entryArray9 = hashMap7.table;
        hashMap0.table = entryArray9;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', 100.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        hashMap1.clear();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        boolean boolean6 = hashMap4.isEmpty();
        int int7 = hashMap4.modCount;
        int int8 = hashMap4.size();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        hashMap9.clear();
        java.lang.Object obj12 = hashMap9.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        boolean boolean14 = hashMap13.isEmpty();
        boolean boolean15 = hashMap13.isEmpty();
        int int16 = hashMap13.modCount;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        hashMap17.clear();
        java.lang.Object obj19 = hashMap13.get((java.lang.Object) hashMap17);
        java.lang.Object obj20 = hashMap9.remove((java.lang.Object) hashMap17);
        java.lang.Object obj21 = hashMap4.get(obj20);
        java.lang.Class<?> wildcardClass22 = hashMap4.getClass();
        java.lang.Object obj23 = hashMap1.put((java.lang.Object) 100L, (java.lang.Object) wildcardClass22);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.clear();
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        boolean boolean6 = hashMap4.isEmpty();
        int int7 = hashMap4.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        hashMap8.clear();
        java.lang.Object obj10 = hashMap4.get((java.lang.Object) hashMap8);
        java.lang.Object obj11 = hashMap0.remove((java.lang.Object) hashMap8);
        hashMap0.modCount = 100;
        system.testclass.HashMap.Entry[] entryArray14 = null;
        hashMap0.table = entryArray14;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) '#');
        system.testclass.HashMap.Entry[] entryArray2 = hashMap1.table;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) (byte) 0);
        hashMap5.clear();
        system.testclass.HashMap.Entry[] entryArray7 = hashMap5.table;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        int int10 = hashMap8.size();
        java.lang.Object obj12 = hashMap8.get((java.lang.Object) 10);
        java.lang.Object obj13 = hashMap5.remove((java.lang.Object) hashMap8);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap((int) (short) 10);
        hashMap15.clear();
        java.lang.Object obj17 = hashMap8.remove((java.lang.Object) hashMap15);
        java.lang.Object obj18 = hashMap1.put((java.lang.Object) 'a', obj17);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 0, (float) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 100, (float) 100L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        hashMap1.clear();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap1.table;
        system.testclass.HashMap.Entry[] entryArray4 = hashMap1.table;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        boolean boolean6 = hashMap5.isEmpty();
        int int7 = hashMap5.size();
        hashMap5.clear();
        boolean boolean9 = hashMap5.isEmpty();
        hashMap5.clear();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap((int) (byte) 0);
        hashMap12.clear();
        system.testclass.HashMap.Entry[] entryArray14 = hashMap12.table;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap((int) (byte) 0);
        hashMap16.clear();
        hashMap16.modCount = (byte) 100;
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        int int21 = hashMap20.modCount;
        system.testclass.HashMap.Entry[] entryArray22 = hashMap20.table;
        system.testclass.HashMap.Entry[] entryArray23 = hashMap20.table;
        hashMap16.table = entryArray23;
        hashMap12.table = entryArray23;
        hashMap5.table = entryArray23;
        java.lang.Object obj28 = hashMap1.put((java.lang.Object) hashMap5, (java.lang.Object) 97);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(100, 100.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        hashMap1.clear();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap((int) (byte) 0);
        hashMap4.clear();
        system.testclass.HashMap.Entry[] entryArray6 = hashMap4.table;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap((int) (byte) 0);
        hashMap8.clear();
        hashMap8.modCount = (byte) 100;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        int int13 = hashMap12.modCount;
        system.testclass.HashMap.Entry[] entryArray14 = hashMap12.table;
        system.testclass.HashMap.Entry[] entryArray15 = hashMap12.table;
        hashMap8.table = entryArray15;
        hashMap4.table = entryArray15;
        java.lang.Object obj18 = hashMap1.remove((java.lang.Object) hashMap4);
        java.lang.Object obj21 = hashMap4.put((java.lang.Object) (short) 1, (java.lang.Object) 0L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap4", hashMap4.repOK_1());
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        hashMap1.clear();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap1.table;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) (byte) 0);
        hashMap5.clear();
        hashMap5.modCount = (byte) 100;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        system.testclass.HashMap.Entry[] entryArray11 = hashMap9.table;
        system.testclass.HashMap.Entry[] entryArray12 = hashMap9.table;
        hashMap5.table = entryArray12;
        hashMap1.table = entryArray12;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        boolean boolean17 = hashMap16.isEmpty();
        boolean boolean18 = hashMap16.isEmpty();
        int int19 = hashMap16.modCount;
        int int20 = hashMap16.size();
        java.lang.Object obj21 = hashMap1.put((java.lang.Object) true, (java.lang.Object) int20);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) '#');
        system.testclass.HashMap.Entry[] entryArray2 = hashMap1.table;
        boolean boolean3 = hashMap1.isEmpty();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        int int6 = hashMap4.size();
        hashMap4.clear();
        boolean boolean8 = hashMap4.isEmpty();
        hashMap4.clear();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap((int) (byte) 0);
        hashMap11.clear();
        system.testclass.HashMap.Entry[] entryArray13 = hashMap11.table;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap((int) (byte) 0);
        hashMap15.clear();
        hashMap15.modCount = (byte) 100;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        int int20 = hashMap19.modCount;
        system.testclass.HashMap.Entry[] entryArray21 = hashMap19.table;
        system.testclass.HashMap.Entry[] entryArray22 = hashMap19.table;
        hashMap15.table = entryArray22;
        hashMap11.table = entryArray22;
        hashMap4.table = entryArray22;
        hashMap1.table = entryArray22;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        hashMap1.clear();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap1.table;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        int int6 = hashMap4.size();
        java.lang.Object obj8 = hashMap4.get((java.lang.Object) 10);
        java.lang.Object obj9 = hashMap1.remove((java.lang.Object) hashMap4);
        java.lang.Object obj11 = hashMap1.remove((java.lang.Object) 0.0d);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        hashMap12.modCount = 0;
        java.lang.Object obj15 = hashMap1.get((java.lang.Object) hashMap12);
        java.lang.Object obj17 = hashMap12.get((java.lang.Object) (-1.0d));
        int int18 = hashMap12.modCount;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        hashMap19.clear();
        system.testclass.HashMap.Entry[] entryArray21 = hashMap19.table;
        hashMap12.table = entryArray21;
        system.testclass.HashMap.Entry[] entryArray23 = hashMap12.table;
        hashMap12.modCount = '#';
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap((int) (byte) 0);
        hashMap27.clear();
        system.testclass.HashMap.Entry[] entryArray29 = hashMap27.table;
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        boolean boolean31 = hashMap30.isEmpty();
        int int32 = hashMap30.size();
        java.lang.Object obj34 = hashMap30.get((java.lang.Object) 10);
        java.lang.Object obj35 = hashMap27.remove((java.lang.Object) hashMap30);
        java.lang.Object obj37 = hashMap27.remove((java.lang.Object) 0.0d);
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        boolean boolean39 = hashMap38.isEmpty();
        int int40 = hashMap38.size();
        hashMap38.clear();
        hashMap38.clear();
        hashMap38.modCount = (byte) 10;
        hashMap38.clear();
        java.lang.Object obj46 = hashMap12.put((java.lang.Object) hashMap27, (java.lang.Object) hashMap38);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap12", hashMap12.repOK_1());
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 10, (float) (byte) 100);
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
        boolean boolean3 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) (byte) 0);
        hashMap5.clear();
        system.testclass.HashMap.Entry[] entryArray7 = hashMap5.table;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        int int10 = hashMap8.size();
        java.lang.Object obj12 = hashMap8.get((java.lang.Object) 10);
        java.lang.Object obj13 = hashMap5.remove((java.lang.Object) hashMap8);
        java.lang.Object obj15 = hashMap5.remove((java.lang.Object) 0.0d);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        hashMap16.modCount = 0;
        java.lang.Object obj19 = hashMap5.get((java.lang.Object) hashMap16);
        java.lang.Object obj21 = hashMap16.get((java.lang.Object) (-1.0d));
        int int22 = hashMap16.modCount;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        hashMap23.clear();
        int int25 = hashMap23.modCount;
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap((int) '#');
        system.testclass.HashMap.Entry[] entryArray28 = hashMap27.table;
        hashMap23.table = entryArray28;
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap((int) (byte) 0);
        hashMap31.clear();
        system.testclass.HashMap.Entry[] entryArray33 = hashMap31.table;
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        boolean boolean35 = hashMap34.isEmpty();
        int int36 = hashMap34.size();
        java.lang.Object obj38 = hashMap34.get((java.lang.Object) 10);
        java.lang.Object obj39 = hashMap31.remove((java.lang.Object) hashMap34);
        java.lang.Object obj41 = hashMap31.remove((java.lang.Object) 0.0d);
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap();
        hashMap42.modCount = 0;
        java.lang.Object obj45 = hashMap31.get((java.lang.Object) hashMap42);
        java.lang.Object obj46 = hashMap23.remove((java.lang.Object) hashMap42);
        java.lang.Object obj47 = hashMap0.put((java.lang.Object) hashMap16, obj46);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray2 = hashMap0.table;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        boolean boolean6 = hashMap5.isEmpty();
        int int7 = hashMap5.size();
        hashMap5.clear();
        hashMap5.clear();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap((int) (byte) 0);
        hashMap11.clear();
        system.testclass.HashMap.Entry[] entryArray13 = hashMap11.table;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        boolean boolean15 = hashMap14.isEmpty();
        int int16 = hashMap14.size();
        java.lang.Object obj18 = hashMap14.get((java.lang.Object) 10);
        java.lang.Object obj19 = hashMap11.remove((java.lang.Object) hashMap14);
        java.lang.Object obj21 = hashMap11.remove((java.lang.Object) 0.0d);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        hashMap22.modCount = 0;
        java.lang.Object obj25 = hashMap11.get((java.lang.Object) hashMap22);
        java.lang.Object obj27 = hashMap22.get((java.lang.Object) (-1.0d));
        int int28 = hashMap22.modCount;
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        hashMap29.clear();
        system.testclass.HashMap.Entry[] entryArray31 = hashMap29.table;
        hashMap22.table = entryArray31;
        hashMap5.table = entryArray31;
        java.lang.Object obj34 = hashMap0.put((java.lang.Object) ' ', (java.lang.Object) entryArray31);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        int int3 = hashMap0.modCount;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        hashMap4.clear();
        java.lang.Object obj6 = hashMap0.get((java.lang.Object) hashMap4);
        boolean boolean7 = hashMap4.isEmpty();
        system.testclass.HashMap.Entry[] entryArray8 = null;
        hashMap4.table = entryArray8;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap4", hashMap4.repOK_1());
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(2, (float) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        hashMap0.clear();
        hashMap0.modCount = (byte) 10;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        system.testclass.HashMap.Entry[] entryArray9 = hashMap7.table;
        hashMap0.table = entryArray9;
        hashMap0.clear();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        boolean boolean13 = hashMap12.isEmpty();
        int int14 = hashMap12.size();
        hashMap12.clear();
        boolean boolean16 = hashMap12.isEmpty();
        hashMap12.clear();
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap((int) (byte) 0);
        hashMap19.clear();
        system.testclass.HashMap.Entry[] entryArray21 = hashMap19.table;
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        boolean boolean23 = hashMap22.isEmpty();
        int int24 = hashMap22.size();
        java.lang.Object obj26 = hashMap22.get((java.lang.Object) 10);
        java.lang.Object obj27 = hashMap19.remove((java.lang.Object) hashMap22);
        java.lang.Object obj28 = hashMap12.remove((java.lang.Object) hashMap19);
        java.lang.Object obj29 = null;
        java.lang.Object obj30 = hashMap0.put(obj28, obj29);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) ' ', (float) 100L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 0);
        boolean boolean2 = hashMap1.isEmpty();
        java.lang.Object obj3 = new java.lang.Object();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        boolean boolean6 = hashMap4.isEmpty();
        int int7 = hashMap4.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        hashMap8.clear();
        java.lang.Object obj10 = hashMap4.get((java.lang.Object) hashMap8);
        hashMap8.clear();
        int int12 = hashMap8.size();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap((int) (byte) 0);
        hashMap14.clear();
        system.testclass.HashMap.Entry[] entryArray16 = hashMap14.table;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        boolean boolean18 = hashMap17.isEmpty();
        int int19 = hashMap17.size();
        java.lang.Object obj21 = hashMap17.get((java.lang.Object) 10);
        java.lang.Object obj22 = hashMap14.remove((java.lang.Object) hashMap17);
        java.lang.Object obj24 = hashMap14.remove((java.lang.Object) 0.0d);
        java.lang.Object obj25 = hashMap8.get((java.lang.Object) hashMap14);
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap((int) (byte) 0);
        int int28 = hashMap27.size();
        java.lang.Class<?> wildcardClass29 = hashMap27.getClass();
        java.lang.Object obj30 = hashMap14.remove((java.lang.Object) wildcardClass29);
        java.lang.Object obj31 = hashMap1.put(obj3, (java.lang.Object) wildcardClass29);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        boolean boolean3 = hashMap2.isEmpty();
        int int4 = hashMap2.size();
        hashMap2.clear();
        hashMap2.clear();
        system.testclass.HashMap.Entry[] entryArray7 = hashMap2.table;
        hashMap0.table = entryArray7;
        boolean boolean9 = hashMap0.isEmpty();
        int int10 = hashMap0.size();
        int int11 = hashMap0.size();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap((int) (short) 10);
        hashMap13.clear();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        boolean boolean16 = hashMap15.isEmpty();
        int int17 = hashMap15.size();
        hashMap15.clear();
        hashMap15.clear();
        system.testclass.HashMap.Entry[] entryArray20 = hashMap15.table;
        hashMap13.table = entryArray20;
        java.lang.Object obj22 = hashMap0.get((java.lang.Object) hashMap13);
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        int int24 = hashMap23.modCount;
        system.testclass.HashMap.Entry[] entryArray25 = hashMap23.table;
        system.testclass.HashMap.Entry[] entryArray26 = hashMap23.table;
        int int27 = hashMap23.modCount;
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap((int) (byte) 0);
        hashMap29.clear();
        system.testclass.HashMap.Entry[] entryArray31 = hashMap29.table;
        boolean boolean32 = hashMap29.isEmpty();
        java.lang.Object obj33 = hashMap0.put((java.lang.Object) int27, (java.lang.Object) boolean32);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 10, 10.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        boolean boolean4 = hashMap0.isEmpty();
        hashMap0.clear();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        hashMap6.clear();
        java.lang.Object obj9 = hashMap6.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        boolean boolean12 = hashMap10.isEmpty();
        int int13 = hashMap10.modCount;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        hashMap14.clear();
        java.lang.Object obj16 = hashMap10.get((java.lang.Object) hashMap14);
        java.lang.Object obj17 = hashMap6.remove((java.lang.Object) hashMap14);
        system.testclass.HashMap.Entry[] entryArray18 = hashMap6.table;
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap((int) (byte) 0);
        hashMap20.clear();
        system.testclass.HashMap.Entry[] entryArray22 = hashMap20.table;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        boolean boolean24 = hashMap23.isEmpty();
        int int25 = hashMap23.size();
        java.lang.Object obj27 = hashMap23.get((java.lang.Object) 10);
        java.lang.Object obj28 = hashMap20.remove((java.lang.Object) hashMap23);
        java.lang.Object obj30 = hashMap20.remove((java.lang.Object) 0.0d);
        java.lang.Object obj31 = hashMap0.put((java.lang.Object) entryArray18, (java.lang.Object) 0.0d);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 0, (float) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '#', (float) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        boolean boolean6 = hashMap4.isEmpty();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        hashMap7.clear();
        int int9 = hashMap7.modCount;
        java.lang.Object obj10 = hashMap0.put((java.lang.Object) hashMap4, (java.lang.Object) int9);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        int int3 = hashMap0.modCount;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        hashMap4.clear();
        java.lang.Object obj6 = hashMap0.get((java.lang.Object) hashMap4);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        hashMap9.modCount = 0;
        java.lang.Object obj12 = hashMap8.remove((java.lang.Object) hashMap9);
        hashMap8.clear();
        int int14 = hashMap8.size();
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = hashMap0.put((java.lang.Object) hashMap8, obj15);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        hashMap1.clear();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap1.table;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        int int6 = hashMap4.size();
        java.lang.Object obj8 = hashMap4.get((java.lang.Object) 10);
        java.lang.Object obj9 = hashMap1.remove((java.lang.Object) hashMap4);
        java.lang.Object obj11 = hashMap1.remove((java.lang.Object) 0.0d);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        hashMap12.modCount = 0;
        java.lang.Object obj15 = hashMap1.get((java.lang.Object) hashMap12);
        system.testclass.HashMap.Entry[] entryArray16 = hashMap12.table;
        boolean boolean17 = hashMap12.isEmpty();
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        hashMap21.modCount = 0;
        java.lang.Object obj24 = hashMap20.remove((java.lang.Object) hashMap21);
        system.testclass.HashMap.Entry[] entryArray25 = hashMap21.table;
        java.lang.Object obj26 = hashMap12.put((java.lang.Object) 0.0f, (java.lang.Object) entryArray25);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap12", hashMap12.repOK_1());
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 1);
        hashMap1.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        int int3 = hashMap0.modCount;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        hashMap4.clear();
        java.lang.Object obj6 = hashMap0.get((java.lang.Object) hashMap4);
        int int7 = hashMap4.size();
        int int8 = hashMap4.size();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        system.testclass.HashMap.Entry[] entryArray11 = hashMap9.table;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        hashMap14.modCount = 0;
        java.lang.Object obj17 = hashMap13.remove((java.lang.Object) hashMap14);
        int int18 = hashMap13.modCount;
        int int19 = hashMap13.modCount;
        int int20 = hashMap13.modCount;
        java.lang.Object obj21 = hashMap4.put((java.lang.Object) entryArray11, (java.lang.Object) hashMap13);
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap((int) (short) 10);
        hashMap23.clear();
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        boolean boolean26 = hashMap25.isEmpty();
        int int27 = hashMap25.size();
        hashMap25.clear();
        hashMap25.clear();
        system.testclass.HashMap.Entry[] entryArray30 = hashMap25.table;
        hashMap23.table = entryArray30;
        java.lang.Object obj32 = null;
        java.lang.Object obj33 = hashMap13.put((java.lang.Object) entryArray30, obj32);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap13", hashMap13.repOK_1());
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        boolean boolean3 = hashMap2.isEmpty();
        int int4 = hashMap2.size();
        hashMap2.clear();
        hashMap2.clear();
        system.testclass.HashMap.Entry[] entryArray7 = hashMap2.table;
        hashMap0.table = entryArray7;
        boolean boolean9 = hashMap0.isEmpty();
        int int10 = hashMap0.size();
        int int11 = hashMap0.size();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap((int) (short) 10);
        hashMap13.clear();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        boolean boolean16 = hashMap15.isEmpty();
        int int17 = hashMap15.size();
        hashMap15.clear();
        hashMap15.clear();
        system.testclass.HashMap.Entry[] entryArray20 = hashMap15.table;
        hashMap13.table = entryArray20;
        java.lang.Object obj22 = hashMap0.get((java.lang.Object) hashMap13);
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        boolean boolean24 = hashMap23.isEmpty();
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        boolean boolean26 = hashMap25.isEmpty();
        int int27 = hashMap25.size();
        hashMap25.clear();
        hashMap25.clear();
        system.testclass.HashMap.Entry[] entryArray30 = hashMap25.table;
        hashMap23.table = entryArray30;
        boolean boolean32 = hashMap23.isEmpty();
        hashMap23.modCount = 2;
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        boolean boolean36 = hashMap35.isEmpty();
        int int37 = hashMap35.size();
        hashMap35.clear();
        boolean boolean39 = hashMap35.isEmpty();
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        hashMap40.clear();
        system.testclass.HashMap.Entry[] entryArray42 = hashMap40.table;
        hashMap35.table = entryArray42;
        java.lang.Object obj44 = hashMap23.remove((java.lang.Object) hashMap35);
        java.lang.Object obj45 = hashMap0.get((java.lang.Object) hashMap23);
        system.testclass.HashMap hashMap46 = new system.testclass.HashMap();
        boolean boolean47 = hashMap46.isEmpty();
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap();
        boolean boolean49 = hashMap48.isEmpty();
        int int50 = hashMap48.size();
        hashMap48.clear();
        hashMap48.clear();
        system.testclass.HashMap.Entry[] entryArray53 = hashMap48.table;
        hashMap46.table = entryArray53;
        boolean boolean55 = hashMap46.isEmpty();
        int int56 = hashMap46.size();
        int int57 = hashMap46.size();
        system.testclass.HashMap hashMap59 = new system.testclass.HashMap((int) (short) 0);
        java.lang.Object obj60 = hashMap0.put((java.lang.Object) int57, (java.lang.Object) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        hashMap1.clear();
        hashMap1.modCount = (byte) 100;
        system.testclass.HashMap.Entry[] entryArray5 = hashMap1.table;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        int int8 = hashMap6.size();
        java.lang.Object obj10 = hashMap6.get((java.lang.Object) 10);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        hashMap11.clear();
        system.testclass.HashMap.Entry[] entryArray13 = hashMap11.table;
        hashMap6.table = entryArray13;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        system.testclass.HashMap.Entry[] entryArray17 = hashMap15.table;
        system.testclass.HashMap.Entry[] entryArray18 = hashMap15.table;
        hashMap6.table = entryArray18;
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        hashMap20.clear();
        java.lang.Object obj23 = hashMap20.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        boolean boolean25 = hashMap24.isEmpty();
        boolean boolean26 = hashMap24.isEmpty();
        int int27 = hashMap24.modCount;
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        hashMap28.clear();
        java.lang.Object obj30 = hashMap24.get((java.lang.Object) hashMap28);
        java.lang.Object obj31 = hashMap20.remove((java.lang.Object) hashMap28);
        int int32 = hashMap20.modCount;
        java.lang.Object obj33 = hashMap6.remove((java.lang.Object) hashMap20);
        java.lang.Object obj34 = hashMap1.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        boolean boolean36 = hashMap35.isEmpty();
        boolean boolean37 = hashMap35.isEmpty();
        int int38 = hashMap35.modCount;
        int int39 = hashMap35.size();
        int int40 = hashMap35.size();
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        int int42 = hashMap41.modCount;
        int int43 = hashMap41.modCount;
        hashMap41.clear();
        system.testclass.HashMap hashMap46 = new system.testclass.HashMap((int) (short) 1);
        boolean boolean47 = hashMap46.isEmpty();
        java.lang.Object obj49 = hashMap41.put((java.lang.Object) hashMap46, (java.lang.Object) 10L);
        system.testclass.HashMap hashMap50 = new system.testclass.HashMap();
        int int51 = hashMap50.modCount;
        system.testclass.HashMap.Entry[] entryArray52 = hashMap50.table;
        system.testclass.HashMap.Entry[] entryArray53 = hashMap50.table;
        hashMap41.table = entryArray53;
        system.testclass.HashMap.Entry[] entryArray55 = hashMap41.table;
        java.lang.Object obj56 = hashMap6.put((java.lang.Object) hashMap35, (java.lang.Object) hashMap41);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap6", hashMap6.repOK_1());
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 100L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) '#');
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        int int3 = hashMap2.modCount;
        int int4 = hashMap2.modCount;
        hashMap2.clear();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) (short) 1);
        boolean boolean8 = hashMap7.isEmpty();
        java.lang.Object obj10 = hashMap2.put((java.lang.Object) hashMap7, (java.lang.Object) 10L);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        system.testclass.HashMap.Entry[] entryArray13 = hashMap11.table;
        system.testclass.HashMap.Entry[] entryArray14 = hashMap11.table;
        hashMap2.table = entryArray14;
        system.testclass.HashMap.Entry[] entryArray16 = hashMap2.table;
        hashMap1.table = entryArray16;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        hashMap1.clear();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap1.table;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        int int6 = hashMap4.size();
        java.lang.Object obj8 = hashMap4.get((java.lang.Object) 10);
        java.lang.Object obj9 = hashMap1.remove((java.lang.Object) hashMap4);
        java.lang.Object obj11 = hashMap1.remove((java.lang.Object) 0.0d);
        boolean boolean12 = hashMap1.isEmpty();
        java.lang.Object obj14 = hashMap1.get((java.lang.Object) (byte) -1);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap((int) 'a');
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        boolean boolean18 = hashMap17.isEmpty();
        boolean boolean19 = hashMap17.isEmpty();
        int int20 = hashMap17.size();
        java.lang.Object obj21 = hashMap1.put((java.lang.Object) 'a', (java.lang.Object) int20);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        hashMap2.modCount = 0;
        java.lang.Object obj5 = hashMap1.remove((java.lang.Object) hashMap2);
        system.testclass.HashMap.Entry[] entryArray6 = hashMap2.table;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        int int9 = hashMap7.size();
        hashMap7.clear();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        boolean boolean12 = hashMap11.isEmpty();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap(0);
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Object obj16 = hashMap14.remove(obj15);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        hashMap17.clear();
        java.lang.Object obj19 = null;
        java.lang.Object obj20 = hashMap17.remove(obj19);
        java.lang.Object obj21 = hashMap11.put(obj16, (java.lang.Object) hashMap17);
        java.lang.Object obj22 = hashMap2.put((java.lang.Object) hashMap7, obj16);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray2 = hashMap0.table;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        int int4 = hashMap0.modCount;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap(10);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        int int9 = hashMap7.size();
        java.lang.Object obj11 = hashMap7.get((java.lang.Object) 10);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        hashMap12.clear();
        system.testclass.HashMap.Entry[] entryArray14 = hashMap12.table;
        hashMap7.table = entryArray14;
        java.lang.Object obj16 = hashMap0.put((java.lang.Object) 10, (java.lang.Object) entryArray14);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 1, (float) (short) 10);
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
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap(0);
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object obj6 = hashMap4.remove(obj5);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        int int9 = hashMap7.modCount;
        hashMap7.clear();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap((int) (short) 1);
        boolean boolean13 = hashMap12.isEmpty();
        java.lang.Object obj15 = hashMap7.put((java.lang.Object) hashMap12, (java.lang.Object) 10L);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        int int17 = hashMap16.modCount;
        system.testclass.HashMap.Entry[] entryArray18 = hashMap16.table;
        system.testclass.HashMap.Entry[] entryArray19 = hashMap16.table;
        hashMap7.table = entryArray19;
        java.lang.Object obj21 = hashMap0.put((java.lang.Object) hashMap4, (java.lang.Object) hashMap7);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        int int3 = hashMap0.modCount;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) (short) 100);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        boolean boolean8 = hashMap6.isEmpty();
        int int9 = hashMap6.modCount;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        hashMap10.clear();
        java.lang.Object obj12 = hashMap6.get((java.lang.Object) hashMap10);
        int int13 = hashMap10.size();
        java.lang.Object obj14 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '#', (float) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.clear();
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        boolean boolean6 = hashMap4.isEmpty();
        int int7 = hashMap4.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        hashMap8.clear();
        java.lang.Object obj10 = hashMap4.get((java.lang.Object) hashMap8);
        java.lang.Object obj11 = hashMap0.remove((java.lang.Object) hashMap8);
        boolean boolean12 = hashMap8.isEmpty();
        int int13 = hashMap8.modCount;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap((int) (short) 0);
        boolean boolean16 = hashMap15.isEmpty();
        hashMap15.clear();
        system.testclass.HashMap.Entry[] entryArray18 = hashMap15.table;
        hashMap8.table = entryArray18;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap8", hashMap8.repOK_1());
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        hashMap2.modCount = 0;
        java.lang.Object obj5 = hashMap1.remove((java.lang.Object) hashMap2);
        hashMap1.clear();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        int int9 = hashMap7.size();
        hashMap7.clear();
        boolean boolean11 = hashMap7.isEmpty();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        hashMap12.clear();
        system.testclass.HashMap.Entry[] entryArray14 = hashMap12.table;
        hashMap7.table = entryArray14;
        hashMap1.table = entryArray14;
        boolean boolean17 = hashMap1.isEmpty();
        int int18 = hashMap1.modCount;
        hashMap1.modCount = 0;
        hashMap1.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        hashMap1.clear();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap1.table;
        java.lang.Object obj5 = hashMap1.get((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) (byte) 0);
        hashMap7.clear();
        hashMap7.modCount = (byte) 100;
        java.lang.Object obj11 = hashMap1.get((java.lang.Object) hashMap7);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        boolean boolean13 = hashMap12.isEmpty();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        boolean boolean15 = hashMap14.isEmpty();
        int int16 = hashMap14.size();
        hashMap14.clear();
        hashMap14.clear();
        system.testclass.HashMap.Entry[] entryArray19 = hashMap14.table;
        hashMap12.table = entryArray19;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        boolean boolean22 = hashMap21.isEmpty();
        int int23 = hashMap21.size();
        hashMap21.clear();
        hashMap21.clear();
        hashMap21.modCount = (byte) 10;
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        int int29 = hashMap28.modCount;
        system.testclass.HashMap.Entry[] entryArray30 = hashMap28.table;
        hashMap21.table = entryArray30;
        java.lang.Object obj32 = hashMap7.put((java.lang.Object) hashMap12, (java.lang.Object) hashMap21);
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap((int) '#', (float) 1L);
        java.lang.Object obj36 = null;
        java.lang.Object obj37 = hashMap7.put((java.lang.Object) '#', obj36);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap7", hashMap7.repOK_1());
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(100, 1.0f);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        hashMap3.clear();
        java.lang.Object obj6 = hashMap3.get((java.lang.Object) (byte) 0);
        boolean boolean7 = hashMap3.isEmpty();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap((int) '#');
        system.testclass.HashMap.Entry[] entryArray10 = hashMap9.table;
        java.lang.Object obj11 = hashMap3.remove((java.lang.Object) entryArray10);
        hashMap2.table = entryArray10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 10);
        hashMap1.clear();
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        int int5 = hashMap3.size();
        hashMap3.clear();
        hashMap3.clear();
        system.testclass.HashMap.Entry[] entryArray8 = hashMap3.table;
        hashMap1.table = entryArray8;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap((int) (byte) 0);
        hashMap11.clear();
        system.testclass.HashMap.Entry[] entryArray13 = hashMap11.table;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        boolean boolean15 = hashMap14.isEmpty();
        int int16 = hashMap14.size();
        java.lang.Object obj18 = hashMap14.get((java.lang.Object) 10);
        java.lang.Object obj19 = hashMap11.remove((java.lang.Object) hashMap14);
        java.lang.Object obj21 = hashMap11.remove((java.lang.Object) 0.0d);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        hashMap22.modCount = 0;
        java.lang.Object obj25 = hashMap11.get((java.lang.Object) hashMap22);
        java.lang.Object obj27 = hashMap22.get((java.lang.Object) (-1.0d));
        int int28 = hashMap22.modCount;
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        hashMap29.clear();
        system.testclass.HashMap.Entry[] entryArray31 = hashMap29.table;
        hashMap22.table = entryArray31;
        hashMap1.table = entryArray31;
        hashMap1.clear();
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        boolean boolean36 = hashMap35.isEmpty();
        boolean boolean37 = hashMap35.isEmpty();
        int int38 = hashMap35.modCount;
        int int39 = hashMap35.size();
        java.lang.Object obj41 = hashMap35.get((java.lang.Object) 10L);
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap((int) '4');
        java.lang.Object obj44 = hashMap1.put((java.lang.Object) 10L, (java.lang.Object) hashMap43);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) ' ', (float) 2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray2 = hashMap0.table;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (byte) 1);
        hashMap0.clear();
        hashMap0.clear();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        int int11 = hashMap9.modCount;
        hashMap9.clear();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap((int) (short) 1);
        boolean boolean15 = hashMap14.isEmpty();
        java.lang.Object obj17 = hashMap9.put((java.lang.Object) hashMap14, (java.lang.Object) 10L);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        int int19 = hashMap18.modCount;
        system.testclass.HashMap.Entry[] entryArray20 = hashMap18.table;
        system.testclass.HashMap.Entry[] entryArray21 = hashMap18.table;
        hashMap9.table = entryArray21;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        int int24 = hashMap23.modCount;
        system.testclass.HashMap.Entry[] entryArray25 = hashMap23.table;
        java.lang.Object obj26 = hashMap9.remove((java.lang.Object) hashMap23);
        boolean boolean27 = hashMap23.isEmpty();
        java.lang.Object obj28 = hashMap0.put((java.lang.Object) 97, (java.lang.Object) boolean27);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(100, (float) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        int int3 = hashMap0.modCount;
        int int4 = hashMap0.size();
        int int5 = hashMap0.size();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) (byte) 0);
        hashMap7.clear();
        system.testclass.HashMap.Entry[] entryArray9 = hashMap7.table;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        int int12 = hashMap10.size();
        java.lang.Object obj14 = hashMap10.get((java.lang.Object) 10);
        java.lang.Object obj15 = hashMap7.remove((java.lang.Object) hashMap10);
        java.lang.Object obj17 = hashMap7.remove((java.lang.Object) 0.0d);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        hashMap18.modCount = 0;
        java.lang.Object obj21 = hashMap7.get((java.lang.Object) hashMap18);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        boolean boolean23 = hashMap22.isEmpty();
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap(0);
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Object obj27 = hashMap25.remove(obj26);
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        hashMap28.clear();
        java.lang.Object obj30 = null;
        java.lang.Object obj31 = hashMap28.remove(obj30);
        java.lang.Object obj32 = hashMap22.put(obj27, (java.lang.Object) hashMap28);
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap((int) (byte) 0);
        hashMap34.clear();
        hashMap34.modCount = (byte) 100;
        system.testclass.HashMap.Entry[] entryArray38 = hashMap34.table;
        java.lang.Object obj39 = hashMap7.put((java.lang.Object) hashMap22, (java.lang.Object) entryArray38);
        hashMap0.table = entryArray38;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        boolean boolean3 = hashMap2.isEmpty();
        boolean boolean4 = hashMap2.isEmpty();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap2.table;
        int int6 = hashMap2.size();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap((int) (byte) 0);
        hashMap8.clear();
        system.testclass.HashMap.Entry[] entryArray10 = hashMap8.table;
        java.lang.Object obj12 = hashMap8.get((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap((int) (byte) 0);
        hashMap14.clear();
        hashMap14.modCount = (byte) 100;
        java.lang.Object obj18 = hashMap8.get((java.lang.Object) hashMap14);
        int int19 = hashMap14.modCount;
        java.lang.Object obj20 = hashMap0.put((java.lang.Object) hashMap2, (java.lang.Object) int19);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(100, (float) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.size();
        int int3 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray4 = hashMap0.table;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) ' ');
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        hashMap7.clear();
        java.lang.Object obj10 = hashMap7.get((java.lang.Object) (byte) 0);
        boolean boolean11 = hashMap7.isEmpty();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap((int) '#');
        system.testclass.HashMap.Entry[] entryArray14 = hashMap13.table;
        java.lang.Object obj15 = hashMap7.remove((java.lang.Object) entryArray14);
        java.lang.Object obj16 = hashMap6.remove((java.lang.Object) entryArray14);
        system.testclass.HashMap.Entry[] entryArray17 = hashMap6.table;
        java.lang.Object obj18 = hashMap0.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        hashMap21.modCount = 0;
        java.lang.Object obj24 = hashMap20.remove((java.lang.Object) hashMap21);
        hashMap20.clear();
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        boolean boolean27 = hashMap26.isEmpty();
        int int28 = hashMap26.size();
        hashMap26.clear();
        boolean boolean30 = hashMap26.isEmpty();
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        hashMap31.clear();
        system.testclass.HashMap.Entry[] entryArray33 = hashMap31.table;
        hashMap26.table = entryArray33;
        hashMap20.table = entryArray33;
        system.testclass.HashMap.Entry[] entryArray36 = hashMap20.table;
        hashMap6.table = entryArray36;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap6", hashMap6.repOK_1());
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 0, (float) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 100);
        int int2 = hashMap1.modCount;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap((int) '#');
        system.testclass.HashMap.Entry[] entryArray5 = hashMap4.table;
        java.lang.Object obj7 = hashMap4.remove((java.lang.Object) true);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        hashMap8.clear();
        java.lang.Object obj11 = hashMap8.get((java.lang.Object) (byte) 0);
        boolean boolean12 = hashMap8.isEmpty();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap((int) '#');
        system.testclass.HashMap.Entry[] entryArray15 = hashMap14.table;
        java.lang.Object obj16 = hashMap8.remove((java.lang.Object) entryArray15);
        int int17 = hashMap8.modCount;
        java.lang.Object obj18 = hashMap1.put((java.lang.Object) hashMap4, (java.lang.Object) int17);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 0, (float) 10L);
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
        hashMap0.clear();
        hashMap0.clear();
        hashMap0.modCount = (byte) 10;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap((int) (byte) 0);
        hashMap8.clear();
        system.testclass.HashMap.Entry[] entryArray10 = hashMap8.table;
        java.lang.Object obj12 = hashMap8.get((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap((int) (byte) 0);
        hashMap14.clear();
        hashMap14.modCount = (byte) 100;
        java.lang.Object obj18 = hashMap8.get((java.lang.Object) hashMap14);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        boolean boolean20 = hashMap19.isEmpty();
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        boolean boolean22 = hashMap21.isEmpty();
        int int23 = hashMap21.size();
        hashMap21.clear();
        hashMap21.clear();
        system.testclass.HashMap.Entry[] entryArray26 = hashMap21.table;
        hashMap19.table = entryArray26;
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        boolean boolean29 = hashMap28.isEmpty();
        int int30 = hashMap28.size();
        hashMap28.clear();
        hashMap28.clear();
        hashMap28.modCount = (byte) 10;
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        int int36 = hashMap35.modCount;
        system.testclass.HashMap.Entry[] entryArray37 = hashMap35.table;
        hashMap28.table = entryArray37;
        java.lang.Object obj39 = hashMap14.put((java.lang.Object) hashMap19, (java.lang.Object) hashMap28);
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap((int) (byte) 0);
        hashMap41.clear();
        system.testclass.HashMap.Entry[] entryArray43 = hashMap41.table;
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap();
        boolean boolean45 = hashMap44.isEmpty();
        int int46 = hashMap44.size();
        java.lang.Object obj48 = hashMap44.get((java.lang.Object) 10);
        java.lang.Object obj49 = hashMap41.remove((java.lang.Object) hashMap44);
        java.lang.Object obj51 = hashMap41.remove((java.lang.Object) 0.0d);
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap();
        hashMap52.modCount = 0;
        java.lang.Object obj55 = hashMap41.get((java.lang.Object) hashMap52);
        java.lang.Object obj57 = hashMap52.get((java.lang.Object) (-1.0d));
        java.lang.Object obj58 = hashMap28.remove((java.lang.Object) (-1.0d));
        int int59 = hashMap28.size();
        system.testclass.HashMap hashMap60 = new system.testclass.HashMap();
        boolean boolean61 = hashMap60.isEmpty();
        boolean boolean62 = hashMap60.isEmpty();
        int int63 = hashMap60.modCount;
        int int64 = hashMap60.size();
        java.lang.Object obj66 = hashMap60.get((java.lang.Object) 10L);
        system.testclass.HashMap.Entry[] entryArray67 = hashMap60.table;
        java.lang.Object obj68 = hashMap0.put((java.lang.Object) hashMap28, (java.lang.Object) entryArray67);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        hashMap3.modCount = 0;
        java.lang.Object obj6 = hashMap2.remove((java.lang.Object) hashMap3);
        int int7 = hashMap2.modCount;
        int int8 = hashMap2.modCount;
        int int9 = hashMap2.modCount;
        int int10 = hashMap2.modCount;
        java.lang.Object obj12 = hashMap0.put((java.lang.Object) int10, (java.lang.Object) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.clear();
        system.testclass.HashMap.Entry[] entryArray2 = hashMap0.table;
        int int3 = hashMap0.modCount;
        boolean boolean4 = hashMap0.isEmpty();
        int int5 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray6 = null;
        hashMap0.table = entryArray6;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap((int) (byte) 0);
        hashMap4.clear();
        hashMap4.modCount = (byte) 100;
        int int8 = hashMap4.modCount;
        int int9 = hashMap4.modCount;
        system.testclass.HashMap.Entry[] entryArray10 = hashMap4.table;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap((int) (short) 0);
        java.lang.Object obj13 = hashMap0.put((java.lang.Object) entryArray10, (java.lang.Object) (short) 0);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap((int) (short) 0);
        boolean boolean16 = hashMap15.isEmpty();
        hashMap15.clear();
        system.testclass.HashMap.Entry[] entryArray18 = hashMap15.table;
        java.lang.Class<?> wildcardClass19 = hashMap15.getClass();
        java.lang.Object obj20 = hashMap0.get((java.lang.Object) wildcardClass19);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 10, 100.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        int int3 = hashMap0.modCount;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        hashMap4.clear();
        java.lang.Object obj6 = hashMap0.get((java.lang.Object) hashMap4);
        int int7 = hashMap4.size();
        int int8 = hashMap4.size();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) (byte) 1);
        int int11 = hashMap10.size();
        system.testclass.HashMap.Entry[] entryArray12 = hashMap10.table;
        hashMap4.table = entryArray12;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap4", hashMap4.repOK_1());
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        boolean boolean3 = hashMap2.isEmpty();
        int int4 = hashMap2.size();
        hashMap2.clear();
        hashMap2.clear();
        system.testclass.HashMap.Entry[] entryArray7 = hashMap2.table;
        hashMap0.table = entryArray7;
        boolean boolean9 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        boolean boolean12 = hashMap10.isEmpty();
        int int13 = hashMap10.modCount;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        hashMap14.clear();
        java.lang.Object obj16 = hashMap10.get((java.lang.Object) hashMap14);
        hashMap14.clear();
        hashMap14.modCount = (short) 1;
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        boolean boolean21 = hashMap20.isEmpty();
        boolean boolean22 = hashMap20.isEmpty();
        int int23 = hashMap20.modCount;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        hashMap24.clear();
        java.lang.Object obj26 = hashMap20.get((java.lang.Object) hashMap24);
        hashMap24.clear();
        int int28 = hashMap24.size();
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap((int) (byte) 0);
        hashMap30.clear();
        system.testclass.HashMap.Entry[] entryArray32 = hashMap30.table;
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        boolean boolean34 = hashMap33.isEmpty();
        int int35 = hashMap33.size();
        java.lang.Object obj37 = hashMap33.get((java.lang.Object) 10);
        java.lang.Object obj38 = hashMap30.remove((java.lang.Object) hashMap33);
        java.lang.Object obj40 = hashMap30.remove((java.lang.Object) 0.0d);
        java.lang.Object obj41 = hashMap24.get((java.lang.Object) hashMap30);
        int int42 = hashMap24.size();
        int int43 = hashMap24.size();
        java.lang.Object obj45 = hashMap14.put((java.lang.Object) hashMap24, (java.lang.Object) 100L);
        java.lang.Object obj46 = hashMap0.get((java.lang.Object) hashMap24);
        int int47 = hashMap0.modCount;
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap();
        hashMap48.clear();
        java.lang.Object obj51 = hashMap48.get((java.lang.Object) (byte) 0);
        boolean boolean52 = hashMap48.isEmpty();
        system.testclass.HashMap hashMap54 = new system.testclass.HashMap((int) (byte) 0);
        hashMap54.clear();
        hashMap54.modCount = (byte) 100;
        int int58 = hashMap54.modCount;
        system.testclass.HashMap hashMap60 = new system.testclass.HashMap((int) (byte) 0);
        hashMap60.clear();
        hashMap60.modCount = (byte) 100;
        system.testclass.HashMap.Entry[] entryArray64 = hashMap60.table;
        hashMap54.table = entryArray64;
        int int66 = hashMap54.size();
        hashMap54.clear();
        java.lang.Object obj68 = hashMap0.put((java.lang.Object) hashMap48, (java.lang.Object) hashMap54);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.clear();
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = hashMap0.remove(obj2);
        int int4 = hashMap0.size();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        hashMap5.modCount = 0;
        boolean boolean8 = hashMap5.isEmpty();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        int int11 = hashMap9.size();
        hashMap9.clear();
        java.lang.Object obj13 = hashMap0.put((java.lang.Object) boolean8, (java.lang.Object) hashMap9);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 10, (float) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        hashMap0.clear();
        hashMap0.modCount = (byte) 0;
        hashMap0.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) (short) 1);
        boolean boolean6 = hashMap5.isEmpty();
        java.lang.Object obj8 = hashMap0.put((java.lang.Object) hashMap5, (java.lang.Object) 10L);
        hashMap0.modCount = 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) 'a');
        boolean boolean2 = hashMap1.isEmpty();
        int int3 = hashMap1.modCount;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        hashMap4.clear();
        java.lang.Object obj7 = hashMap4.get((java.lang.Object) (byte) 0);
        hashMap4.modCount = 'a';
        int int10 = hashMap4.modCount;
        boolean boolean11 = hashMap4.isEmpty();
        system.testclass.HashMap.Entry[] entryArray12 = hashMap4.table;
        hashMap1.table = entryArray12;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        int int2 = hashMap1.size();
        hashMap1.clear();
        hashMap1.modCount = 97;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) (byte) 0);
        hashMap7.clear();
        system.testclass.HashMap.Entry[] entryArray9 = hashMap7.table;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        int int12 = hashMap10.size();
        java.lang.Object obj14 = hashMap10.get((java.lang.Object) 10);
        java.lang.Object obj15 = hashMap7.remove((java.lang.Object) hashMap10);
        java.lang.Object obj17 = hashMap7.remove((java.lang.Object) 0.0d);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        hashMap18.modCount = 0;
        java.lang.Object obj21 = hashMap7.get((java.lang.Object) hashMap18);
        java.lang.Object obj23 = hashMap18.get((java.lang.Object) (-1.0d));
        int int24 = hashMap18.modCount;
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        hashMap25.clear();
        system.testclass.HashMap.Entry[] entryArray27 = hashMap25.table;
        hashMap18.table = entryArray27;
        system.testclass.HashMap.Entry[] entryArray29 = hashMap18.table;
        hashMap18.modCount = '#';
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        hashMap34.modCount = 0;
        java.lang.Object obj37 = hashMap33.remove((java.lang.Object) hashMap34);
        system.testclass.HashMap.Entry[] entryArray38 = hashMap34.table;
        java.lang.Object obj39 = hashMap18.get((java.lang.Object) entryArray38);
        boolean boolean40 = hashMap18.isEmpty();
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        hashMap41.clear();
        java.lang.Object obj44 = hashMap41.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        boolean boolean46 = hashMap45.isEmpty();
        boolean boolean47 = hashMap45.isEmpty();
        int int48 = hashMap45.modCount;
        system.testclass.HashMap hashMap49 = new system.testclass.HashMap();
        hashMap49.clear();
        java.lang.Object obj51 = hashMap45.get((java.lang.Object) hashMap49);
        java.lang.Object obj52 = hashMap41.remove((java.lang.Object) hashMap49);
        system.testclass.HashMap.Entry[] entryArray53 = hashMap41.table;
        java.lang.Object obj54 = hashMap18.remove((java.lang.Object) hashMap41);
        system.testclass.HashMap hashMap55 = new system.testclass.HashMap();
        hashMap55.clear();
        java.lang.Object obj58 = hashMap55.get((java.lang.Object) (byte) 0);
        boolean boolean59 = hashMap55.isEmpty();
        system.testclass.HashMap hashMap61 = new system.testclass.HashMap((int) '#');
        system.testclass.HashMap.Entry[] entryArray62 = hashMap61.table;
        java.lang.Object obj63 = hashMap55.remove((java.lang.Object) entryArray62);
        java.lang.Object obj64 = hashMap41.get((java.lang.Object) entryArray62);
        java.lang.Object obj65 = null;
        java.lang.Object obj66 = hashMap1.put((java.lang.Object) hashMap41, obj65);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 10, (float) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) ' ', (float) 1);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        int int5 = hashMap3.size();
        hashMap3.modCount = 10;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap((int) (byte) 0);
        hashMap9.clear();
        system.testclass.HashMap.Entry[] entryArray11 = hashMap9.table;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        boolean boolean13 = hashMap12.isEmpty();
        int int14 = hashMap12.size();
        java.lang.Object obj16 = hashMap12.get((java.lang.Object) 10);
        java.lang.Object obj17 = hashMap9.remove((java.lang.Object) hashMap12);
        java.lang.Object obj19 = hashMap9.remove((java.lang.Object) 0.0d);
        boolean boolean20 = hashMap9.isEmpty();
        java.lang.Object obj22 = hashMap9.get((java.lang.Object) (byte) -1);
        hashMap9.modCount = (short) 100;
        system.testclass.HashMap.Entry[] entryArray25 = hashMap9.table;
        java.lang.Object obj26 = hashMap2.put((java.lang.Object) 10, (java.lang.Object) entryArray25);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(97);
        boolean boolean2 = hashMap1.isEmpty();
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        hashMap3.clear();
        java.lang.Object obj6 = hashMap3.get((java.lang.Object) (byte) 0);
        boolean boolean7 = hashMap3.isEmpty();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap((int) '#');
        system.testclass.HashMap.Entry[] entryArray10 = hashMap9.table;
        java.lang.Object obj11 = hashMap3.remove((java.lang.Object) entryArray10);
        int int12 = hashMap3.modCount;
        hashMap3.modCount = (byte) 100;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        int int17 = hashMap15.modCount;
        hashMap15.clear();
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap((int) (short) 1);
        boolean boolean21 = hashMap20.isEmpty();
        java.lang.Object obj23 = hashMap15.put((java.lang.Object) hashMap20, (java.lang.Object) 10L);
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.modCount;
        system.testclass.HashMap.Entry[] entryArray26 = hashMap24.table;
        system.testclass.HashMap.Entry[] entryArray27 = hashMap24.table;
        hashMap15.table = entryArray27;
        system.testclass.HashMap.Entry[] entryArray29 = hashMap15.table;
        java.lang.Object obj30 = hashMap1.put((java.lang.Object) (byte) 100, (java.lang.Object) entryArray29);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) (short) 1);
        boolean boolean6 = hashMap5.isEmpty();
        java.lang.Object obj8 = hashMap0.put((java.lang.Object) hashMap5, (java.lang.Object) 10L);
        system.testclass.HashMap.Entry[] entryArray9 = hashMap0.table;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 10, (float) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        hashMap1.clear();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap1.table;
        java.lang.Object obj5 = hashMap1.get((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) (byte) 0);
        hashMap7.clear();
        hashMap7.modCount = (byte) 100;
        java.lang.Object obj11 = hashMap1.get((java.lang.Object) hashMap7);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        boolean boolean13 = hashMap12.isEmpty();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        boolean boolean15 = hashMap14.isEmpty();
        int int16 = hashMap14.size();
        hashMap14.clear();
        hashMap14.clear();
        system.testclass.HashMap.Entry[] entryArray19 = hashMap14.table;
        hashMap12.table = entryArray19;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        boolean boolean22 = hashMap21.isEmpty();
        int int23 = hashMap21.size();
        hashMap21.clear();
        hashMap21.clear();
        hashMap21.modCount = (byte) 10;
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        int int29 = hashMap28.modCount;
        system.testclass.HashMap.Entry[] entryArray30 = hashMap28.table;
        hashMap21.table = entryArray30;
        java.lang.Object obj32 = hashMap7.put((java.lang.Object) hashMap12, (java.lang.Object) hashMap21);
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        hashMap33.clear();
        int int35 = hashMap33.modCount;
        int int36 = hashMap33.modCount;
        int int37 = hashMap33.size();
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        boolean boolean39 = hashMap38.isEmpty();
        boolean boolean40 = hashMap38.isEmpty();
        int int41 = hashMap38.modCount;
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap();
        hashMap42.clear();
        java.lang.Object obj44 = hashMap38.get((java.lang.Object) hashMap42);
        int int45 = hashMap42.size();
        int int46 = hashMap42.size();
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap();
        int int48 = hashMap47.modCount;
        system.testclass.HashMap.Entry[] entryArray49 = hashMap47.table;
        system.testclass.HashMap hashMap51 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap();
        hashMap52.modCount = 0;
        java.lang.Object obj55 = hashMap51.remove((java.lang.Object) hashMap52);
        int int56 = hashMap51.modCount;
        int int57 = hashMap51.modCount;
        int int58 = hashMap51.modCount;
        java.lang.Object obj59 = hashMap42.put((java.lang.Object) entryArray49, (java.lang.Object) hashMap51);
        java.lang.Object obj60 = hashMap21.put((java.lang.Object) int37, (java.lang.Object) entryArray49);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap21", hashMap21.repOK_1());
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) '#');
        system.testclass.HashMap.Entry[] entryArray2 = hashMap1.table;
        hashMap1.clear();
        boolean boolean4 = hashMap1.isEmpty();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) (byte) 0);
        hashMap6.clear();
        hashMap6.modCount = (byte) 100;
        int int10 = hashMap6.modCount;
        int int11 = hashMap6.modCount;
        system.testclass.HashMap.Entry[] entryArray12 = hashMap6.table;
        hashMap1.table = entryArray12;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.size();
        hashMap0.clear();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        boolean boolean6 = hashMap4.isEmpty();
        boolean boolean7 = hashMap4.isEmpty();
        java.lang.Class<?> wildcardClass8 = hashMap4.getClass();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        system.testclass.HashMap.Entry[] entryArray11 = hashMap9.table;
        system.testclass.HashMap.Entry[] entryArray12 = hashMap9.table;
        java.lang.Object obj14 = hashMap9.remove((java.lang.Object) (byte) 1);
        hashMap9.clear();
        java.lang.Object obj16 = hashMap0.put((java.lang.Object) hashMap4, (java.lang.Object) hashMap9);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) '#');
        system.testclass.HashMap.Entry[] entryArray2 = hashMap1.table;
        hashMap1.clear();
        system.testclass.HashMap.Entry[] entryArray4 = hashMap1.table;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) (byte) 0);
        hashMap6.clear();
        system.testclass.HashMap.Entry[] entryArray8 = hashMap6.table;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        int int11 = hashMap9.size();
        java.lang.Object obj13 = hashMap9.get((java.lang.Object) 10);
        java.lang.Object obj14 = hashMap6.remove((java.lang.Object) hashMap9);
        java.lang.Object obj16 = hashMap6.remove((java.lang.Object) 0.0d);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        hashMap17.modCount = 0;
        java.lang.Object obj20 = hashMap6.get((java.lang.Object) hashMap17);
        java.lang.Object obj22 = hashMap17.get((java.lang.Object) (-1.0d));
        int int23 = hashMap17.modCount;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        hashMap24.clear();
        system.testclass.HashMap.Entry[] entryArray26 = hashMap24.table;
        hashMap17.table = entryArray26;
        system.testclass.HashMap.Entry[] entryArray28 = hashMap17.table;
        hashMap17.modCount = '#';
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        hashMap33.modCount = 0;
        java.lang.Object obj36 = hashMap32.remove((java.lang.Object) hashMap33);
        system.testclass.HashMap.Entry[] entryArray37 = hashMap33.table;
        java.lang.Object obj38 = hashMap17.get((java.lang.Object) entryArray37);
        boolean boolean39 = hashMap17.isEmpty();
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        hashMap40.clear();
        java.lang.Object obj43 = hashMap40.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap();
        boolean boolean45 = hashMap44.isEmpty();
        boolean boolean46 = hashMap44.isEmpty();
        int int47 = hashMap44.modCount;
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap();
        hashMap48.clear();
        java.lang.Object obj50 = hashMap44.get((java.lang.Object) hashMap48);
        java.lang.Object obj51 = hashMap40.remove((java.lang.Object) hashMap48);
        system.testclass.HashMap.Entry[] entryArray52 = hashMap40.table;
        java.lang.Object obj53 = hashMap17.remove((java.lang.Object) hashMap40);
        system.testclass.HashMap hashMap54 = new system.testclass.HashMap();
        hashMap54.clear();
        java.lang.Object obj57 = hashMap54.get((java.lang.Object) (byte) 0);
        boolean boolean58 = hashMap54.isEmpty();
        system.testclass.HashMap hashMap60 = new system.testclass.HashMap((int) '#');
        system.testclass.HashMap.Entry[] entryArray61 = hashMap60.table;
        java.lang.Object obj62 = hashMap54.remove((java.lang.Object) entryArray61);
        java.lang.Object obj63 = hashMap40.get((java.lang.Object) entryArray61);
        system.testclass.HashMap hashMap64 = new system.testclass.HashMap();
        boolean boolean65 = hashMap64.isEmpty();
        int int66 = hashMap64.size();
        hashMap64.clear();
        hashMap64.clear();
        hashMap64.modCount = (byte) 10;
        system.testclass.HashMap hashMap71 = new system.testclass.HashMap();
        int int72 = hashMap71.modCount;
        system.testclass.HashMap.Entry[] entryArray73 = hashMap71.table;
        hashMap64.table = entryArray73;
        hashMap64.modCount = (byte) 1;
        java.lang.Class<?> wildcardClass77 = hashMap64.getClass();
        java.lang.Object obj78 = hashMap1.put((java.lang.Object) entryArray61, (java.lang.Object) hashMap64);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        hashMap1.clear();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap1.table;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        int int6 = hashMap4.size();
        java.lang.Object obj8 = hashMap4.get((java.lang.Object) 10);
        java.lang.Object obj9 = hashMap1.remove((java.lang.Object) hashMap4);
        int int10 = hashMap1.modCount;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        boolean boolean12 = hashMap11.isEmpty();
        int int13 = hashMap11.size();
        hashMap11.clear();
        boolean boolean15 = hashMap11.isEmpty();
        hashMap11.clear();
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap((int) (byte) 0);
        hashMap18.clear();
        system.testclass.HashMap.Entry[] entryArray20 = hashMap18.table;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        boolean boolean22 = hashMap21.isEmpty();
        int int23 = hashMap21.size();
        java.lang.Object obj25 = hashMap21.get((java.lang.Object) 10);
        java.lang.Object obj26 = hashMap18.remove((java.lang.Object) hashMap21);
        java.lang.Object obj27 = hashMap11.remove((java.lang.Object) hashMap18);
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        boolean boolean29 = hashMap28.isEmpty();
        int int30 = hashMap28.size();
        hashMap28.clear();
        boolean boolean32 = hashMap28.isEmpty();
        hashMap28.clear();
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap((int) (byte) 0);
        hashMap35.clear();
        system.testclass.HashMap.Entry[] entryArray37 = hashMap35.table;
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap((int) (byte) 0);
        hashMap39.clear();
        hashMap39.modCount = (byte) 100;
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap();
        int int44 = hashMap43.modCount;
        system.testclass.HashMap.Entry[] entryArray45 = hashMap43.table;
        system.testclass.HashMap.Entry[] entryArray46 = hashMap43.table;
        hashMap39.table = entryArray46;
        hashMap35.table = entryArray46;
        hashMap28.table = entryArray46;
        java.lang.Object obj51 = hashMap28.get((java.lang.Object) (short) 100);
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap();
        boolean boolean53 = hashMap52.isEmpty();
        boolean boolean54 = hashMap52.isEmpty();
        int int55 = hashMap52.modCount;
        int int56 = hashMap52.size();
        java.lang.Object obj58 = hashMap52.get((java.lang.Object) 10L);
        java.lang.Object obj59 = hashMap28.remove((java.lang.Object) hashMap52);
        java.lang.Object obj60 = hashMap11.get((java.lang.Object) hashMap52);
        system.testclass.HashMap hashMap61 = new system.testclass.HashMap();
        boolean boolean62 = hashMap61.isEmpty();
        int int63 = hashMap61.size();
        java.lang.Object obj65 = hashMap61.get((java.lang.Object) 10);
        java.lang.Object obj66 = hashMap1.put(obj60, (java.lang.Object) hashMap61);
        system.testclass.HashMap hashMap68 = new system.testclass.HashMap();
        boolean boolean69 = hashMap68.isEmpty();
        system.testclass.HashMap hashMap71 = new system.testclass.HashMap(0);
        java.lang.Object obj72 = new java.lang.Object();
        java.lang.Object obj73 = hashMap71.remove(obj72);
        system.testclass.HashMap hashMap74 = new system.testclass.HashMap();
        hashMap74.clear();
        java.lang.Object obj76 = null;
        java.lang.Object obj77 = hashMap74.remove(obj76);
        java.lang.Object obj78 = hashMap68.put(obj73, (java.lang.Object) hashMap74);
        int int79 = hashMap68.modCount;
        boolean boolean80 = hashMap68.isEmpty();
        int int81 = hashMap68.size();
        java.lang.Object obj82 = hashMap61.put((java.lang.Object) 100.0f, (java.lang.Object) int81);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap61", hashMap61.repOK_1());
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        boolean boolean4 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        hashMap5.clear();
        system.testclass.HashMap.Entry[] entryArray7 = hashMap5.table;
        hashMap0.table = entryArray7;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        int int11 = hashMap9.size();
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) int11);
        hashMap0.modCount = 'a';
        hashMap0.modCount = '#';
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        boolean boolean18 = hashMap17.isEmpty();
        int int19 = hashMap17.size();
        hashMap17.clear();
        boolean boolean21 = hashMap17.isEmpty();
        hashMap17.clear();
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap((int) (byte) 0);
        hashMap24.clear();
        system.testclass.HashMap.Entry[] entryArray26 = hashMap24.table;
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap((int) (byte) 0);
        hashMap28.clear();
        hashMap28.modCount = (byte) 100;
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        int int33 = hashMap32.modCount;
        system.testclass.HashMap.Entry[] entryArray34 = hashMap32.table;
        system.testclass.HashMap.Entry[] entryArray35 = hashMap32.table;
        hashMap28.table = entryArray35;
        hashMap24.table = entryArray35;
        hashMap17.table = entryArray35;
        java.lang.Object obj40 = hashMap17.get((java.lang.Object) (short) 100);
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        boolean boolean42 = hashMap41.isEmpty();
        boolean boolean43 = hashMap41.isEmpty();
        int int44 = hashMap41.modCount;
        int int45 = hashMap41.size();
        java.lang.Object obj47 = hashMap41.get((java.lang.Object) 10L);
        java.lang.Object obj48 = hashMap17.remove((java.lang.Object) hashMap41);
        int int49 = hashMap17.size();
        system.testclass.HashMap hashMap50 = new system.testclass.HashMap();
        boolean boolean51 = hashMap50.isEmpty();
        boolean boolean52 = hashMap50.isEmpty();
        int int53 = hashMap50.modCount;
        system.testclass.HashMap hashMap54 = new system.testclass.HashMap();
        hashMap54.clear();
        java.lang.Object obj56 = hashMap50.get((java.lang.Object) hashMap54);
        int int57 = hashMap54.size();
        int int58 = hashMap54.modCount;
        hashMap54.clear();
        java.lang.Object obj60 = hashMap0.put((java.lang.Object) hashMap17, (java.lang.Object) hashMap54);
        int int61 = hashMap0.modCount;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 1, (float) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.clear();
        system.testclass.HashMap.Entry[] entryArray2 = hashMap0.table;
        int int3 = hashMap0.modCount;
        boolean boolean4 = hashMap0.isEmpty();
        int int5 = hashMap0.size();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        int int8 = hashMap6.size();
        hashMap6.clear();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        hashMap12.modCount = 0;
        java.lang.Object obj15 = hashMap11.remove((java.lang.Object) hashMap12);
        int int16 = hashMap11.modCount;
        int int17 = hashMap11.modCount;
        int int18 = hashMap11.modCount;
        java.lang.Object obj19 = hashMap6.get((java.lang.Object) hashMap11);
        boolean boolean20 = hashMap6.isEmpty();
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        hashMap21.clear();
        java.lang.Object obj24 = hashMap21.get((java.lang.Object) (byte) 0);
        boolean boolean25 = hashMap21.isEmpty();
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap((int) '#');
        system.testclass.HashMap.Entry[] entryArray28 = hashMap27.table;
        java.lang.Object obj29 = hashMap21.remove((java.lang.Object) entryArray28);
        int int30 = hashMap21.modCount;
        int int31 = hashMap21.modCount;
        hashMap21.modCount = (short) 0;
        java.lang.Object obj34 = hashMap0.put((java.lang.Object) hashMap6, (java.lang.Object) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '#', (float) (byte) 1);
        hashMap2.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        hashMap1.clear();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap1.table;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        int int6 = hashMap4.size();
        java.lang.Object obj8 = hashMap4.get((java.lang.Object) 10);
        java.lang.Object obj9 = hashMap1.remove((java.lang.Object) hashMap4);
        java.lang.Object obj11 = hashMap1.remove((java.lang.Object) 0.0d);
        boolean boolean12 = hashMap1.isEmpty();
        java.lang.Object obj14 = hashMap1.get((java.lang.Object) (byte) -1);
        hashMap1.modCount = (short) 100;
        int int17 = hashMap1.size();
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap((int) (byte) 0);
        hashMap20.clear();
        system.testclass.HashMap.Entry[] entryArray22 = hashMap20.table;
        java.lang.Object obj24 = hashMap20.get((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap((int) (byte) 0);
        hashMap26.clear();
        hashMap26.modCount = (byte) 100;
        java.lang.Object obj30 = hashMap20.get((java.lang.Object) hashMap26);
        int int31 = hashMap26.modCount;
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        int int33 = hashMap32.modCount;
        int int34 = hashMap32.modCount;
        hashMap32.clear();
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap((int) (short) 1);
        boolean boolean38 = hashMap37.isEmpty();
        java.lang.Object obj40 = hashMap32.put((java.lang.Object) hashMap37, (java.lang.Object) 10L);
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        int int42 = hashMap41.modCount;
        system.testclass.HashMap.Entry[] entryArray43 = hashMap41.table;
        system.testclass.HashMap.Entry[] entryArray44 = hashMap41.table;
        hashMap32.table = entryArray44;
        system.testclass.HashMap.Entry[] entryArray46 = hashMap32.table;
        hashMap26.table = entryArray46;
        java.lang.Object obj48 = hashMap1.put((java.lang.Object) hashMap18, (java.lang.Object) entryArray46);
        boolean boolean49 = hashMap1.isEmpty();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(2, (float) (byte) 1);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        int int6 = hashMap4.size();
        java.lang.Object obj8 = hashMap4.get((java.lang.Object) 10);
        java.lang.Object obj9 = hashMap3.get(obj8);
        system.testclass.HashMap.Entry[] entryArray10 = hashMap3.table;
        int int11 = hashMap3.size();
        boolean boolean12 = hashMap3.isEmpty();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap((int) (byte) 0);
        int int15 = hashMap14.size();
        hashMap14.modCount = (short) 100;
        boolean boolean18 = hashMap14.isEmpty();
        system.testclass.HashMap.Entry[] entryArray19 = hashMap14.table;
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        int int21 = hashMap20.modCount;
        system.testclass.HashMap.Entry[] entryArray22 = hashMap20.table;
        system.testclass.HashMap.Entry[] entryArray23 = hashMap20.table;
        hashMap14.table = entryArray23;
        java.lang.Object obj25 = hashMap2.put((java.lang.Object) hashMap3, (java.lang.Object) hashMap14);
        int int26 = hashMap2.modCount;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) '#');
        system.testclass.HashMap.Entry[] entryArray2 = hashMap1.table;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        hashMap3.clear();
        java.lang.Object obj6 = hashMap3.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        boolean boolean9 = hashMap7.isEmpty();
        int int10 = hashMap7.modCount;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        hashMap11.clear();
        java.lang.Object obj13 = hashMap7.get((java.lang.Object) hashMap11);
        java.lang.Object obj14 = hashMap3.remove((java.lang.Object) hashMap11);
        system.testclass.HashMap.Entry[] entryArray15 = hashMap3.table;
        hashMap1.table = entryArray15;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 10, (float) 100L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(1, 10.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        hashMap1.clear();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap1.table;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        int int6 = hashMap4.size();
        java.lang.Object obj8 = hashMap4.get((java.lang.Object) 10);
        java.lang.Object obj9 = hashMap1.remove((java.lang.Object) hashMap4);
        java.lang.Object obj11 = hashMap1.remove((java.lang.Object) 0.0d);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        hashMap12.modCount = 0;
        java.lang.Object obj15 = hashMap1.get((java.lang.Object) hashMap12);
        java.lang.Object obj17 = hashMap12.get((java.lang.Object) (-1.0d));
        int int18 = hashMap12.modCount;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        hashMap19.clear();
        system.testclass.HashMap.Entry[] entryArray21 = hashMap19.table;
        hashMap12.table = entryArray21;
        java.lang.Object obj24 = hashMap12.get((java.lang.Object) (short) 1);
        boolean boolean25 = hashMap12.isEmpty();
        hashMap12.modCount = (short) 1;
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap((int) (byte) 0);
        hashMap29.clear();
        system.testclass.HashMap.Entry[] entryArray31 = hashMap29.table;
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        boolean boolean33 = hashMap32.isEmpty();
        int int34 = hashMap32.size();
        java.lang.Object obj36 = hashMap32.get((java.lang.Object) 10);
        java.lang.Object obj37 = hashMap29.remove((java.lang.Object) hashMap32);
        java.lang.Object obj39 = hashMap29.remove((java.lang.Object) 0.0d);
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        hashMap40.modCount = 0;
        java.lang.Object obj43 = hashMap29.get((java.lang.Object) hashMap40);
        system.testclass.HashMap.Entry[] entryArray44 = hashMap40.table;
        hashMap12.table = entryArray44;
        system.testclass.HashMap hashMap46 = new system.testclass.HashMap();
        boolean boolean47 = hashMap46.isEmpty();
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap();
        boolean boolean49 = hashMap48.isEmpty();
        int int50 = hashMap48.size();
        hashMap48.clear();
        hashMap48.clear();
        system.testclass.HashMap.Entry[] entryArray53 = hashMap48.table;
        hashMap46.table = entryArray53;
        boolean boolean55 = hashMap46.isEmpty();
        int int56 = hashMap46.size();
        int int57 = hashMap46.size();
        system.testclass.HashMap hashMap59 = new system.testclass.HashMap((int) (byte) 0);
        hashMap59.clear();
        system.testclass.HashMap.Entry[] entryArray61 = hashMap59.table;
        system.testclass.HashMap hashMap62 = new system.testclass.HashMap();
        boolean boolean63 = hashMap62.isEmpty();
        int int64 = hashMap62.size();
        java.lang.Object obj66 = hashMap62.get((java.lang.Object) 10);
        java.lang.Object obj67 = hashMap59.remove((java.lang.Object) hashMap62);
        java.lang.Object obj69 = hashMap59.remove((java.lang.Object) 0.0d);
        system.testclass.HashMap hashMap70 = new system.testclass.HashMap();
        hashMap70.modCount = 0;
        java.lang.Object obj73 = hashMap59.get((java.lang.Object) hashMap70);
        java.lang.Object obj75 = hashMap70.get((java.lang.Object) (-1.0d));
        hashMap70.clear();
        java.lang.Object obj77 = hashMap12.put((java.lang.Object) int57, (java.lang.Object) hashMap70);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap12", hashMap12.repOK_1());
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        hashMap1.clear();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap1.table;
        hashMap1.modCount = '#';
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        int int8 = hashMap6.size();
        hashMap6.modCount = 10;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        boolean boolean12 = hashMap11.isEmpty();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap(0);
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Object obj16 = hashMap14.remove(obj15);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        hashMap17.clear();
        java.lang.Object obj19 = null;
        java.lang.Object obj20 = hashMap17.remove(obj19);
        java.lang.Object obj21 = hashMap11.put(obj16, (java.lang.Object) hashMap17);
        int int22 = hashMap11.modCount;
        boolean boolean23 = hashMap11.isEmpty();
        int int24 = hashMap11.size();
        java.lang.Object obj25 = hashMap1.put((java.lang.Object) 10, (java.lang.Object) int24);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.clear();
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        boolean boolean6 = hashMap4.isEmpty();
        int int7 = hashMap4.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        hashMap8.clear();
        java.lang.Object obj10 = hashMap4.get((java.lang.Object) hashMap8);
        java.lang.Object obj11 = hashMap0.remove((java.lang.Object) hashMap8);
        int int12 = hashMap8.size();
        int int13 = hashMap8.size();
        int int14 = hashMap8.modCount;
        hashMap8.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap8", hashMap8.repOK_1());
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 0);
        boolean boolean2 = hashMap1.isEmpty();
        hashMap1.clear();
        system.testclass.HashMap.Entry[] entryArray4 = hashMap1.table;
        int int5 = hashMap1.modCount;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        int int8 = hashMap6.size();
        hashMap6.clear();
        boolean boolean10 = hashMap6.isEmpty();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        hashMap11.clear();
        system.testclass.HashMap.Entry[] entryArray13 = hashMap11.table;
        hashMap6.table = entryArray13;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        int int17 = hashMap15.size();
        java.lang.Object obj18 = hashMap6.remove((java.lang.Object) int17);
        hashMap6.modCount = 'a';
        hashMap6.modCount = 2;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        boolean boolean24 = hashMap23.isEmpty();
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        boolean boolean26 = hashMap25.isEmpty();
        int int27 = hashMap25.size();
        hashMap25.clear();
        hashMap25.clear();
        system.testclass.HashMap.Entry[] entryArray30 = hashMap25.table;
        hashMap23.table = entryArray30;
        boolean boolean32 = hashMap23.isEmpty();
        int int33 = hashMap23.size();
        java.lang.Object obj34 = hashMap1.put((java.lang.Object) 2, (java.lang.Object) hashMap23);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap(0);
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Object obj5 = hashMap3.remove(obj4);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        hashMap6.clear();
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = hashMap6.remove(obj8);
        java.lang.Object obj10 = hashMap0.put(obj5, (java.lang.Object) hashMap6);
        hashMap6.modCount = (byte) 1;
        boolean boolean13 = hashMap6.isEmpty();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap((int) (byte) 0);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        hashMap16.modCount = 0;
        java.lang.Object obj19 = hashMap15.remove((java.lang.Object) hashMap16);
        system.testclass.HashMap.Entry[] entryArray20 = hashMap15.table;
        hashMap6.table = entryArray20;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap6", hashMap6.repOK_1());
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 0, (float) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }
}

