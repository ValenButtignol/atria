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
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.size();
        java.lang.Object obj4 = hashMap0.put((java.lang.Object) (byte) 100, (java.lang.Object) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap.Entry[] entryArray3 = new system.testclass.HashMap.Entry[] {};
        hashMap2.table = entryArray3;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
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
        hashMap0.modCount = '4';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        hashMap0.modCount = 'a';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) 1.0f);
        hashMap0.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 10);
        system.testclass.HashMap.Entry entry2 = null;
        system.testclass.HashMap.Entry[] entryArray3 = new system.testclass.HashMap.Entry[] { entry2 };
        hashMap1.table = entryArray3;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(10);
        java.lang.Object obj3 = hashMap1.remove((java.lang.Object) (short) 0);
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        hashMap2.modCount = 0;
        java.lang.Object obj5 = hashMap0.get((java.lang.Object) hashMap2);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.size();
        system.testclass.HashMap.Entry[] entryArray11 = hashMap9.table;
        java.lang.Object obj12 = hashMap8.remove((java.lang.Object) entryArray11);
        java.lang.Object obj13 = hashMap2.get((java.lang.Object) hashMap8);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        hashMap14.modCount = 0;
        java.lang.Object obj17 = null;
        java.lang.Object obj18 = hashMap14.remove(obj17);
        system.testclass.HashMap.Entry[] entryArray19 = hashMap14.table;
        hashMap8.table = entryArray19;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap8", hashMap8.repOK_1());
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (short) 100);
        hashMap2.modCount = '#';
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
        java.lang.Object obj6 = hashMap0.get((java.lang.Object) 10);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap(10);
        java.lang.Object obj10 = hashMap0.put((java.lang.Object) "", (java.lang.Object) hashMap9);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(10);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        int int3 = hashMap2.size();
        system.testclass.HashMap.Entry[] entryArray4 = hashMap2.table;
        hashMap1.table = entryArray4;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap(10);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.size();
        system.testclass.HashMap.Entry[] entryArray10 = hashMap8.table;
        hashMap7.table = entryArray10;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap((int) ' ', (float) '#');
        java.lang.Object obj15 = hashMap1.put((java.lang.Object) entryArray10, (java.lang.Object) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        hashMap2.modCount = 0;
        java.lang.Object obj5 = null;
        java.lang.Object obj6 = hashMap2.remove(obj5);
        system.testclass.HashMap.Entry[] entryArray7 = hashMap2.table;
        hashMap0.table = entryArray7;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        hashMap2.modCount = 0;
        java.lang.Object obj5 = hashMap0.get((java.lang.Object) hashMap2);
        int int6 = hashMap0.modCount;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        int int9 = hashMap7.modCount;
        java.lang.Class<?> wildcardClass10 = hashMap7.getClass();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int14 = hashMap13.modCount;
        java.lang.Object obj15 = hashMap0.put((java.lang.Object) hashMap7, (java.lang.Object) hashMap13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap();
        hashMap1.modCount = 0;
        java.lang.Object obj4 = hashMap0.remove((java.lang.Object) hashMap1);
        java.lang.Object obj6 = hashMap1.remove((java.lang.Object) (short) 100);
        hashMap1.modCount = (byte) 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray2 = hashMap0.table;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        hashMap4.modCount = 0;
        java.lang.Object obj7 = hashMap3.remove((java.lang.Object) hashMap4);
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) hashMap3);
        boolean boolean9 = hashMap3.isEmpty();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.size();
        system.testclass.HashMap.Entry[] entryArray12 = hashMap10.table;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        hashMap14.modCount = 0;
        java.lang.Object obj17 = hashMap13.remove((java.lang.Object) hashMap14);
        java.lang.Object obj18 = hashMap10.remove((java.lang.Object) hashMap13);
        java.lang.Object obj20 = hashMap3.put(obj18, (java.lang.Object) false);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap3", hashMap3.repOK_1());
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray2 = hashMap0.table;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        hashMap4.modCount = 0;
        java.lang.Object obj7 = hashMap3.remove((java.lang.Object) hashMap4);
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) hashMap3);
        boolean boolean9 = hashMap3.isEmpty();
        hashMap3.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap3", hashMap3.repOK_1());
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        hashMap2.modCount = (byte) 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        hashMap2.modCount = 0;
        java.lang.Object obj5 = hashMap0.get((java.lang.Object) hashMap2);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.size();
        system.testclass.HashMap.Entry[] entryArray11 = hashMap9.table;
        java.lang.Object obj12 = hashMap8.remove((java.lang.Object) entryArray11);
        java.lang.Object obj13 = hashMap2.get((java.lang.Object) hashMap8);
        system.testclass.HashMap.Entry[] entryArray14 = hashMap8.table;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.size();
        int int17 = hashMap15.size();
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        int int19 = hashMap18.size();
        system.testclass.HashMap.Entry[] entryArray20 = hashMap18.table;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        hashMap22.modCount = 0;
        java.lang.Object obj25 = hashMap21.remove((java.lang.Object) hashMap22);
        java.lang.Object obj26 = hashMap18.remove((java.lang.Object) hashMap21);
        java.lang.Object obj27 = hashMap8.put((java.lang.Object) int17, obj26);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap8", hashMap8.repOK_1());
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray2 = hashMap0.table;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray2 = hashMap0.table;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        hashMap4.modCount = 0;
        java.lang.Object obj7 = hashMap3.remove((java.lang.Object) hashMap4);
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) hashMap3);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        hashMap11.modCount = 0;
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = hashMap11.remove(obj14);
        system.testclass.HashMap.Entry[] entryArray16 = hashMap11.table;
        hashMap9.table = entryArray16;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        int int19 = hashMap18.size();
        system.testclass.HashMap.Entry[] entryArray20 = hashMap18.table;
        hashMap9.table = entryArray20;
        hashMap3.table = entryArray20;
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap(0, (float) (short) 10);
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap(0, (float) (short) 100);
        int int29 = hashMap28.modCount;
        system.testclass.HashMap.Entry[] entryArray30 = hashMap28.table;
        java.lang.Object obj31 = hashMap25.remove((java.lang.Object) entryArray30);
        java.lang.Object obj32 = hashMap3.get(obj31);
        hashMap3.modCount = 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap3", hashMap3.repOK_1());
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '#', (float) 'a');
        hashMap2.modCount = (short) 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        hashMap2.modCount = 0;
        java.lang.Object obj5 = hashMap0.get((java.lang.Object) hashMap2);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.size();
        system.testclass.HashMap.Entry[] entryArray11 = hashMap9.table;
        java.lang.Object obj12 = hashMap8.remove((java.lang.Object) entryArray11);
        java.lang.Object obj13 = hashMap2.get((java.lang.Object) hashMap8);
        system.testclass.HashMap.Entry[] entryArray14 = hashMap8.table;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.size();
        system.testclass.HashMap.Entry[] entryArray17 = hashMap15.table;
        hashMap8.table = entryArray17;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap8", hashMap8.repOK_1());
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        hashMap2.modCount = (byte) 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray2 = hashMap0.table;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        hashMap4.modCount = 0;
        java.lang.Object obj7 = hashMap3.remove((java.lang.Object) hashMap4);
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) hashMap3);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        hashMap11.modCount = 0;
        java.lang.Object obj14 = hashMap9.get((java.lang.Object) hashMap11);
        java.lang.Object obj15 = hashMap3.get((java.lang.Object) hashMap11);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        int int17 = hashMap16.modCount;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        hashMap18.modCount = 0;
        java.lang.Object obj21 = hashMap16.get((java.lang.Object) hashMap18);
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        int int26 = hashMap25.size();
        system.testclass.HashMap.Entry[] entryArray27 = hashMap25.table;
        java.lang.Object obj28 = hashMap24.remove((java.lang.Object) entryArray27);
        java.lang.Object obj29 = hashMap18.get((java.lang.Object) hashMap24);
        system.testclass.HashMap.Entry[] entryArray30 = hashMap24.table;
        hashMap3.table = entryArray30;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap3", hashMap3.repOK_1());
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 100);
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray2 = hashMap0.table;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        hashMap4.modCount = 0;
        java.lang.Object obj7 = hashMap3.remove((java.lang.Object) hashMap4);
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) hashMap3);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        hashMap11.modCount = 0;
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = hashMap11.remove(obj14);
        system.testclass.HashMap.Entry[] entryArray16 = hashMap11.table;
        hashMap9.table = entryArray16;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        int int19 = hashMap18.size();
        system.testclass.HashMap.Entry[] entryArray20 = hashMap18.table;
        hashMap9.table = entryArray20;
        hashMap3.table = entryArray20;
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap(0, (float) (short) 10);
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap(0, (float) (short) 100);
        int int29 = hashMap28.modCount;
        system.testclass.HashMap.Entry[] entryArray30 = hashMap28.table;
        java.lang.Object obj31 = hashMap25.remove((java.lang.Object) entryArray30);
        java.lang.Object obj32 = hashMap3.get(obj31);
        system.testclass.HashMap.Entry[] entryArray33 = new system.testclass.HashMap.Entry[] {};
        hashMap3.table = entryArray33;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap3", hashMap3.repOK_1());
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.size();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap3.table;
        java.lang.Object obj6 = hashMap2.remove((java.lang.Object) entryArray5);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        int int9 = hashMap7.modCount;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.size();
        system.testclass.HashMap.Entry[] entryArray12 = hashMap10.table;
        hashMap10.modCount = 0;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        hashMap17.modCount = 0;
        java.lang.Object obj20 = null;
        java.lang.Object obj21 = hashMap17.remove(obj20);
        system.testclass.HashMap.Entry[] entryArray22 = hashMap17.table;
        hashMap15.table = entryArray22;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.size();
        system.testclass.HashMap.Entry[] entryArray26 = hashMap24.table;
        hashMap15.table = entryArray26;
        java.lang.Object obj28 = hashMap10.get((java.lang.Object) entryArray26);
        hashMap7.table = entryArray26;
        hashMap2.table = entryArray26;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        hashMap0.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = hashMap0.remove(obj3);
        java.lang.Object obj6 = hashMap0.get((java.lang.Object) 10);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        hashMap9.modCount = 0;
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = hashMap9.remove(obj12);
        system.testclass.HashMap.Entry[] entryArray14 = hashMap9.table;
        hashMap7.table = entryArray14;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        int int17 = hashMap16.size();
        system.testclass.HashMap.Entry[] entryArray18 = hashMap16.table;
        hashMap7.table = entryArray18;
        java.lang.Object obj20 = hashMap0.remove((java.lang.Object) entryArray18);
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap();
        hashMap1.modCount = 0;
        java.lang.Object obj4 = hashMap0.remove((java.lang.Object) hashMap1);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap(0, (float) (short) 10);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap(0, (float) (short) 100);
        int int11 = hashMap10.modCount;
        system.testclass.HashMap.Entry[] entryArray12 = hashMap10.table;
        java.lang.Object obj13 = hashMap7.remove((java.lang.Object) entryArray12);
        hashMap0.table = entryArray12;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(10);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        int int3 = hashMap2.size();
        system.testclass.HashMap.Entry[] entryArray4 = hashMap2.table;
        hashMap1.table = entryArray4;
        hashMap1.modCount = 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = hashMap0.remove(obj3);
        hashMap0.modCount = ' ';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray2 = hashMap0.table;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        hashMap4.modCount = 0;
        java.lang.Object obj7 = hashMap3.remove((java.lang.Object) hashMap4);
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) hashMap3);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        hashMap11.modCount = 0;
        java.lang.Object obj14 = hashMap9.get((java.lang.Object) hashMap11);
        java.lang.Object obj15 = hashMap3.get((java.lang.Object) hashMap11);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        int int18 = hashMap17.modCount;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        hashMap19.modCount = 0;
        java.lang.Object obj22 = hashMap17.get((java.lang.Object) hashMap19);
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        int int27 = hashMap26.size();
        system.testclass.HashMap.Entry[] entryArray28 = hashMap26.table;
        java.lang.Object obj29 = hashMap25.remove((java.lang.Object) entryArray28);
        java.lang.Object obj30 = hashMap19.get((java.lang.Object) hashMap25);
        java.lang.Object obj31 = hashMap3.put((java.lang.Object) ' ', (java.lang.Object) hashMap19);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap3", hashMap3.repOK_1());
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.size();
        hashMap0.modCount = (short) 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(10);
        int int2 = hashMap1.size();
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        hashMap5.modCount = 0;
        java.lang.Object obj8 = hashMap3.get((java.lang.Object) hashMap5);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        int int13 = hashMap12.size();
        system.testclass.HashMap.Entry[] entryArray14 = hashMap12.table;
        java.lang.Object obj15 = hashMap11.remove((java.lang.Object) entryArray14);
        java.lang.Object obj16 = hashMap5.get((java.lang.Object) hashMap11);
        system.testclass.HashMap.Entry[] entryArray17 = hashMap11.table;
        hashMap1.table = entryArray17;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.size();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap3.table;
        java.lang.Object obj6 = hashMap2.remove((java.lang.Object) entryArray5);
        hashMap2.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(10);
        int int2 = hashMap1.size();
        int int3 = hashMap1.modCount;
        int int4 = hashMap1.modCount;
        hashMap1.modCount = (short) 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray2 = hashMap0.table;
        hashMap0.modCount = 0;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        hashMap7.modCount = 0;
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = hashMap7.remove(obj10);
        system.testclass.HashMap.Entry[] entryArray12 = hashMap7.table;
        hashMap5.table = entryArray12;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.size();
        system.testclass.HashMap.Entry[] entryArray16 = hashMap14.table;
        hashMap5.table = entryArray16;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        hashMap18.modCount = 0;
        java.lang.Object obj21 = null;
        java.lang.Object obj22 = hashMap18.remove(obj21);
        java.lang.Object obj24 = hashMap18.get((java.lang.Object) 10);
        system.testclass.HashMap.Entry[] entryArray25 = hashMap18.table;
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap(10);
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        int int29 = hashMap28.size();
        system.testclass.HashMap.Entry[] entryArray30 = hashMap28.table;
        hashMap27.table = entryArray30;
        hashMap18.table = entryArray30;
        java.lang.Object obj33 = hashMap0.put((java.lang.Object) entryArray16, (java.lang.Object) entryArray30);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        hashMap2.modCount = 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(10);
        java.lang.Object obj3 = hashMap1.remove((java.lang.Object) (short) 0);
        int int4 = hashMap1.size();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap1.table;
        hashMap1.modCount = (byte) 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(10);
        int int2 = hashMap1.modCount;
        hashMap1.modCount = (byte) 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        hashMap2.modCount = 0;
        java.lang.Object obj5 = hashMap0.get((java.lang.Object) hashMap2);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.size();
        system.testclass.HashMap.Entry[] entryArray11 = hashMap9.table;
        java.lang.Object obj12 = hashMap8.remove((java.lang.Object) entryArray11);
        java.lang.Object obj13 = hashMap2.get((java.lang.Object) hashMap8);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap(0, (float) (short) 10);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap(0, (float) (short) 100);
        int int20 = hashMap19.modCount;
        system.testclass.HashMap.Entry[] entryArray21 = hashMap19.table;
        java.lang.Object obj22 = hashMap16.remove((java.lang.Object) entryArray21);
        system.testclass.HashMap.Entry[] entryArray23 = hashMap16.table;
        hashMap2.table = entryArray23;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray2 = hashMap0.table;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        hashMap4.modCount = 0;
        java.lang.Object obj7 = hashMap3.remove((java.lang.Object) hashMap4);
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) hashMap3);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        hashMap11.modCount = 0;
        java.lang.Object obj14 = hashMap9.get((java.lang.Object) hashMap11);
        java.lang.Object obj15 = hashMap3.get((java.lang.Object) hashMap11);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        boolean boolean17 = hashMap16.isEmpty();
        java.lang.Object obj19 = hashMap16.remove((java.lang.Object) 'a');
        boolean boolean20 = hashMap16.isEmpty();
        java.lang.Object obj22 = hashMap3.put((java.lang.Object) hashMap16, (java.lang.Object) 100L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap3", hashMap3.repOK_1());
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (short) 10);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        hashMap3.modCount = 0;
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = hashMap3.remove(obj6);
        java.lang.Object obj9 = hashMap3.get((java.lang.Object) 10);
        system.testclass.HashMap.Entry[] entryArray10 = hashMap3.table;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        hashMap11.modCount = 0;
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = hashMap11.remove(obj14);
        java.lang.Object obj17 = hashMap11.get((java.lang.Object) 10);
        system.testclass.HashMap.Entry[] entryArray18 = hashMap11.table;
        java.lang.Object obj19 = hashMap3.remove((java.lang.Object) entryArray18);
        hashMap2.table = entryArray18;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = hashMap0.remove(obj3);
        java.lang.Object obj6 = hashMap0.get((java.lang.Object) 10);
        int int7 = hashMap0.modCount;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10);
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (short) 100);
        boolean boolean3 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        int int7 = hashMap6.modCount;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap(10);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.size();
        system.testclass.HashMap.Entry[] entryArray12 = hashMap10.table;
        hashMap9.table = entryArray12;
        java.lang.Object obj14 = hashMap2.put((java.lang.Object) int7, (java.lang.Object) hashMap9);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) ' ', (float) '#');
        int int3 = hashMap2.modCount;
        java.lang.Object obj5 = hashMap2.get((java.lang.Object) ' ');
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        hashMap7.modCount = 0;
        java.lang.Object obj10 = hashMap6.remove((java.lang.Object) hashMap7);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap(10);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.size();
        system.testclass.HashMap.Entry[] entryArray15 = hashMap13.table;
        hashMap12.table = entryArray15;
        java.lang.Class<?> wildcardClass17 = hashMap12.getClass();
        java.lang.Object obj18 = hashMap7.remove((java.lang.Object) hashMap12);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        int int20 = hashMap19.modCount;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        hashMap21.modCount = 0;
        java.lang.Object obj24 = hashMap19.get((java.lang.Object) hashMap21);
        int int25 = hashMap19.modCount;
        java.lang.Object obj26 = hashMap2.put((java.lang.Object) hashMap7, (java.lang.Object) hashMap19);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        hashMap2.modCount = 0;
        java.lang.Object obj5 = hashMap0.get((java.lang.Object) hashMap2);
        int int6 = hashMap2.size();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap((int) (byte) 10);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        hashMap9.modCount = 0;
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = hashMap9.remove(obj12);
        system.testclass.HashMap.Entry[] entryArray14 = hashMap9.table;
        hashMap8.table = entryArray14;
        hashMap2.table = entryArray14;
        hashMap2.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap();
        hashMap1.modCount = 0;
        java.lang.Object obj4 = hashMap0.remove((java.lang.Object) hashMap1);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        hashMap7.modCount = 0;
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = hashMap7.remove(obj10);
        system.testclass.HashMap.Entry[] entryArray12 = hashMap7.table;
        hashMap5.table = entryArray12;
        hashMap0.table = entryArray12;
        int int15 = hashMap0.modCount;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = hashMap0.remove(obj3);
        java.lang.Object obj6 = hashMap0.get((java.lang.Object) 10);
        system.testclass.HashMap.Entry[] entryArray7 = hashMap0.table;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        hashMap2.modCount = 0;
        java.lang.Object obj5 = hashMap0.get((java.lang.Object) hashMap2);
        int int6 = hashMap2.size();
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray2 = hashMap0.table;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        hashMap4.modCount = 0;
        java.lang.Object obj7 = hashMap3.remove((java.lang.Object) hashMap4);
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) hashMap3);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        hashMap11.modCount = 0;
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = hashMap11.remove(obj14);
        system.testclass.HashMap.Entry[] entryArray16 = hashMap11.table;
        hashMap9.table = entryArray16;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        int int19 = hashMap18.size();
        system.testclass.HashMap.Entry[] entryArray20 = hashMap18.table;
        hashMap9.table = entryArray20;
        hashMap3.table = entryArray20;
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap(0, (float) (short) 10);
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap(0, (float) (short) 100);
        int int29 = hashMap28.modCount;
        system.testclass.HashMap.Entry[] entryArray30 = hashMap28.table;
        java.lang.Object obj31 = hashMap25.remove((java.lang.Object) entryArray30);
        java.lang.Object obj32 = hashMap3.get(obj31);
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        hashMap35.modCount = 0;
        java.lang.Object obj38 = hashMap34.remove((java.lang.Object) hashMap35);
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        int int40 = hashMap39.size();
        system.testclass.HashMap.Entry[] entryArray41 = hashMap39.table;
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap();
        hashMap43.modCount = 0;
        java.lang.Object obj46 = hashMap42.remove((java.lang.Object) hashMap43);
        java.lang.Object obj47 = hashMap39.remove((java.lang.Object) hashMap42);
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap();
        int int49 = hashMap48.modCount;
        system.testclass.HashMap hashMap50 = new system.testclass.HashMap();
        hashMap50.modCount = 0;
        java.lang.Object obj53 = hashMap48.get((java.lang.Object) hashMap50);
        java.lang.Object obj54 = hashMap42.get((java.lang.Object) hashMap50);
        java.lang.Object obj55 = hashMap35.remove((java.lang.Object) hashMap50);
        system.testclass.HashMap hashMap57 = new system.testclass.HashMap((int) (byte) 10);
        system.testclass.HashMap.Entry[] entryArray58 = hashMap57.table;
        java.lang.Object obj59 = hashMap35.remove((java.lang.Object) hashMap57);
        java.lang.Object obj60 = hashMap3.put((java.lang.Object) true, obj59);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap3", hashMap3.repOK_1());
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap();
        hashMap1.modCount = 0;
        java.lang.Object obj4 = hashMap0.remove((java.lang.Object) hashMap1);
        java.lang.Object obj6 = hashMap1.remove((java.lang.Object) (short) 100);
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.size();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap3.table;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        hashMap7.modCount = 0;
        java.lang.Object obj10 = hashMap6.remove((java.lang.Object) hashMap7);
        java.lang.Object obj11 = hashMap3.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        int int13 = hashMap12.modCount;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        hashMap14.modCount = 0;
        java.lang.Object obj17 = null;
        java.lang.Object obj18 = hashMap14.remove(obj17);
        system.testclass.HashMap.Entry[] entryArray19 = hashMap14.table;
        hashMap12.table = entryArray19;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        int int22 = hashMap21.size();
        system.testclass.HashMap.Entry[] entryArray23 = hashMap21.table;
        hashMap12.table = entryArray23;
        hashMap6.table = entryArray23;
        java.lang.Object obj26 = hashMap2.get((java.lang.Object) entryArray23);
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray2 = hashMap0.table;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        hashMap4.modCount = 0;
        java.lang.Object obj7 = hashMap3.remove((java.lang.Object) hashMap4);
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) hashMap3);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        hashMap11.modCount = 0;
        java.lang.Object obj14 = hashMap9.get((java.lang.Object) hashMap11);
        java.lang.Object obj15 = hashMap3.get((java.lang.Object) hashMap11);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap(0, (float) (short) 100);
        int int20 = hashMap19.modCount;
        system.testclass.HashMap.Entry[] entryArray21 = hashMap19.table;
        java.lang.Object obj22 = hashMap11.put((java.lang.Object) (-1L), (java.lang.Object) entryArray21);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap11", hashMap11.repOK_1());
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (short) 10);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap(0, (float) (short) 100);
        int int6 = hashMap5.modCount;
        system.testclass.HashMap.Entry[] entryArray7 = hashMap5.table;
        java.lang.Object obj8 = hashMap2.remove((java.lang.Object) entryArray7);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        hashMap13.modCount = 0;
        java.lang.Object obj16 = hashMap12.remove((java.lang.Object) hashMap13);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        int int18 = hashMap17.modCount;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        hashMap19.modCount = 0;
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = hashMap19.remove(obj22);
        system.testclass.HashMap.Entry[] entryArray24 = hashMap19.table;
        hashMap17.table = entryArray24;
        hashMap12.table = entryArray24;
        java.lang.Object obj27 = hashMap11.remove((java.lang.Object) hashMap12);
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap(10);
        int int30 = hashMap29.size();
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        int int32 = hashMap31.modCount;
        int int33 = hashMap31.modCount;
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        int int35 = hashMap34.size();
        system.testclass.HashMap.Entry[] entryArray36 = hashMap34.table;
        hashMap34.modCount = 0;
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        int int40 = hashMap39.modCount;
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        hashMap41.modCount = 0;
        java.lang.Object obj44 = null;
        java.lang.Object obj45 = hashMap41.remove(obj44);
        system.testclass.HashMap.Entry[] entryArray46 = hashMap41.table;
        hashMap39.table = entryArray46;
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap();
        int int49 = hashMap48.size();
        system.testclass.HashMap.Entry[] entryArray50 = hashMap48.table;
        hashMap39.table = entryArray50;
        java.lang.Object obj52 = hashMap34.get((java.lang.Object) entryArray50);
        hashMap31.table = entryArray50;
        hashMap29.table = entryArray50;
        java.lang.Class<?> wildcardClass55 = entryArray50.getClass();
        java.lang.Object obj56 = hashMap2.put((java.lang.Object) hashMap11, (java.lang.Object) entryArray50);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray2 = hashMap0.table;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        hashMap4.modCount = 0;
        java.lang.Object obj7 = hashMap3.remove((java.lang.Object) hashMap4);
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) hashMap3);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        hashMap11.modCount = 0;
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = hashMap11.remove(obj14);
        system.testclass.HashMap.Entry[] entryArray16 = hashMap11.table;
        hashMap9.table = entryArray16;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        int int19 = hashMap18.size();
        system.testclass.HashMap.Entry[] entryArray20 = hashMap18.table;
        hashMap9.table = entryArray20;
        hashMap3.table = entryArray20;
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap(0, (float) (short) 10);
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap(0, (float) (short) 100);
        int int29 = hashMap28.modCount;
        system.testclass.HashMap.Entry[] entryArray30 = hashMap28.table;
        java.lang.Object obj31 = hashMap25.remove((java.lang.Object) entryArray30);
        java.lang.Object obj32 = hashMap3.get(obj31);
        hashMap3.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap3", hashMap3.repOK_1());
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 100, (float) '#');
        boolean boolean3 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        java.lang.Object obj6 = hashMap2.get((java.lang.Object) int5);
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '#', (float) (short) 100);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        java.lang.Object obj4 = hashMap2.remove((java.lang.Object) hashMap3);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap(10);
        java.lang.Object obj8 = hashMap6.remove((java.lang.Object) (short) 0);
        int int9 = hashMap6.size();
        system.testclass.HashMap.Entry[] entryArray10 = hashMap6.table;
        hashMap2.table = entryArray10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        hashMap5.modCount = 0;
        java.lang.Object obj8 = hashMap3.get((java.lang.Object) hashMap5);
        int int9 = hashMap5.size();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap((int) (byte) 10);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        hashMap12.modCount = 0;
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = hashMap12.remove(obj15);
        system.testclass.HashMap.Entry[] entryArray17 = hashMap12.table;
        hashMap11.table = entryArray17;
        hashMap5.table = entryArray17;
        hashMap2.table = entryArray17;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.size();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap3.table;
        java.lang.Object obj6 = hashMap2.remove((java.lang.Object) entryArray5);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap((int) '#', (float) (short) 100);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap(10);
        int int12 = hashMap11.size();
        int int13 = hashMap11.size();
        java.lang.Object obj14 = hashMap2.put((java.lang.Object) hashMap9, (java.lang.Object) hashMap11);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        java.lang.Object obj3 = hashMap0.remove((java.lang.Object) 'a');
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.size();
        system.testclass.HashMap.Entry[] entryArray7 = hashMap5.table;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        hashMap9.modCount = 0;
        java.lang.Object obj12 = hashMap8.remove((java.lang.Object) hashMap9);
        java.lang.Object obj13 = hashMap5.remove((java.lang.Object) hashMap8);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.modCount;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        hashMap16.modCount = 0;
        java.lang.Object obj19 = hashMap14.get((java.lang.Object) hashMap16);
        java.lang.Object obj20 = hashMap8.get((java.lang.Object) hashMap16);
        java.lang.Object obj21 = hashMap0.put((java.lang.Object) 100.0d, obj20);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray2 = hashMap0.table;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        hashMap4.modCount = 0;
        java.lang.Object obj7 = hashMap3.remove((java.lang.Object) hashMap4);
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) hashMap3);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        hashMap11.modCount = 0;
        java.lang.Object obj14 = hashMap9.get((java.lang.Object) hashMap11);
        java.lang.Object obj15 = hashMap3.get((java.lang.Object) hashMap11);
        int int16 = hashMap11.size();
        hashMap11.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap11", hashMap11.repOK_1());
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (short) 100);
        int int3 = hashMap2.modCount;
        system.testclass.HashMap.Entry[] entryArray4 = hashMap2.table;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        hashMap6.modCount = 0;
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = hashMap6.remove(obj9);
        java.lang.Object obj12 = hashMap6.get((java.lang.Object) 10);
        system.testclass.HashMap.Entry[] entryArray13 = hashMap6.table;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        hashMap14.modCount = 0;
        java.lang.Object obj17 = null;
        java.lang.Object obj18 = hashMap14.remove(obj17);
        java.lang.Object obj20 = hashMap14.get((java.lang.Object) 10);
        system.testclass.HashMap.Entry[] entryArray21 = hashMap14.table;
        java.lang.Object obj22 = hashMap6.remove((java.lang.Object) entryArray21);
        java.lang.Object obj23 = hashMap2.put((java.lang.Object) false, (java.lang.Object) entryArray21);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap();
        hashMap1.modCount = 0;
        java.lang.Object obj4 = hashMap0.remove((java.lang.Object) hashMap1);
        int int5 = hashMap1.size();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) (byte) 10);
        system.testclass.HashMap.Entry[] entryArray8 = hashMap7.table;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap((int) (byte) 100, (float) '#');
        int int12 = hashMap11.size();
        java.lang.Object obj13 = hashMap7.remove((java.lang.Object) int12);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap(0, (float) 1);
        java.lang.Object obj17 = hashMap1.put((java.lang.Object) hashMap7, (java.lang.Object) hashMap16);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 1);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap((int) (byte) 10);
        system.testclass.HashMap.Entry[] entryArray5 = hashMap4.table;
        hashMap2.table = entryArray5;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 100, (float) (byte) 100);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        hashMap3.modCount = 0;
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = hashMap3.remove(obj6);
        java.lang.Object obj9 = hashMap3.get((java.lang.Object) 10);
        system.testclass.HashMap.Entry[] entryArray10 = hashMap3.table;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.size();
        system.testclass.HashMap.Entry[] entryArray13 = hashMap11.table;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        hashMap15.modCount = 0;
        java.lang.Object obj18 = hashMap14.remove((java.lang.Object) hashMap15);
        java.lang.Object obj19 = hashMap11.remove((java.lang.Object) hashMap14);
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        int int21 = hashMap20.modCount;
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        hashMap22.modCount = 0;
        java.lang.Object obj25 = hashMap20.get((java.lang.Object) hashMap22);
        java.lang.Object obj26 = hashMap14.get((java.lang.Object) hashMap22);
        java.lang.Object obj27 = hashMap3.get(obj26);
        java.lang.Object obj28 = hashMap2.get(obj27);
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        int int30 = hashMap29.size();
        system.testclass.HashMap.Entry[] entryArray31 = hashMap29.table;
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        hashMap33.modCount = 0;
        java.lang.Object obj36 = hashMap32.remove((java.lang.Object) hashMap33);
        java.lang.Object obj37 = hashMap29.remove((java.lang.Object) hashMap32);
        boolean boolean38 = hashMap32.isEmpty();
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        hashMap39.modCount = 0;
        java.lang.Object obj42 = null;
        java.lang.Object obj43 = hashMap39.remove(obj42);
        java.lang.Object obj45 = hashMap39.get((java.lang.Object) 10);
        system.testclass.HashMap.Entry[] entryArray46 = hashMap39.table;
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap(10);
        system.testclass.HashMap hashMap49 = new system.testclass.HashMap();
        int int50 = hashMap49.size();
        system.testclass.HashMap.Entry[] entryArray51 = hashMap49.table;
        hashMap48.table = entryArray51;
        hashMap39.table = entryArray51;
        hashMap32.table = entryArray51;
        hashMap2.table = entryArray51;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (short) 10);
        hashMap2.modCount = (byte) 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '#', (float) (short) 100);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        java.lang.Object obj4 = hashMap2.remove((java.lang.Object) hashMap3);
        hashMap3.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap3", hashMap3.repOK_1());
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        boolean boolean3 = hashMap0.isEmpty();
        hashMap0.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(10);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap((int) (byte) 100, (float) '#');
        boolean boolean5 = hashMap4.isEmpty();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.modCount;
        java.lang.Object obj8 = hashMap4.get((java.lang.Object) int7);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap(10);
        java.lang.Object obj12 = hashMap10.remove((java.lang.Object) (short) 0);
        system.testclass.HashMap.Entry[] entryArray13 = hashMap10.table;
        java.lang.Object obj14 = hashMap1.put((java.lang.Object) int7, (java.lang.Object) entryArray13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) 'a', (float) (byte) 100);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.modCount;
        int int8 = hashMap6.modCount;
        system.testclass.HashMap.Entry[] entryArray9 = hashMap6.table;
        java.lang.Object obj10 = hashMap5.remove((java.lang.Object) entryArray9);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        hashMap12.modCount = 0;
        java.lang.Object obj15 = hashMap11.remove((java.lang.Object) hashMap12);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap(0, (float) (short) 100);
        boolean boolean19 = hashMap18.isEmpty();
        int int20 = hashMap18.size();
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap(10);
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        int int24 = hashMap23.size();
        system.testclass.HashMap.Entry[] entryArray25 = hashMap23.table;
        hashMap22.table = entryArray25;
        java.lang.Object obj27 = hashMap18.remove((java.lang.Object) entryArray25);
        hashMap11.table = entryArray25;
        java.lang.Object obj29 = hashMap2.put((java.lang.Object) entryArray9, (java.lang.Object) hashMap11);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (short) 10);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) ' ', (float) '#');
        int int6 = hashMap5.modCount;
        java.lang.Object obj8 = hashMap5.get((java.lang.Object) ' ');
        java.lang.Object obj9 = hashMap2.get((java.lang.Object) ' ');
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        system.testclass.HashMap.Entry[] entryArray16 = hashMap13.table;
        java.lang.Object obj17 = hashMap12.remove((java.lang.Object) entryArray16);
        hashMap2.table = entryArray16;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(10);
        int int2 = hashMap1.size();
        int int3 = hashMap1.size();
        boolean boolean4 = hashMap1.isEmpty();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        hashMap5.modCount = 0;
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = hashMap5.remove(obj8);
        system.testclass.HashMap.Entry[] entryArray10 = hashMap5.table;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        hashMap12.modCount = 0;
        java.lang.Object obj15 = hashMap11.remove((java.lang.Object) hashMap12);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap(0, (float) (short) 100);
        boolean boolean19 = hashMap18.isEmpty();
        int int20 = hashMap18.size();
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap(10);
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        int int24 = hashMap23.size();
        system.testclass.HashMap.Entry[] entryArray25 = hashMap23.table;
        hashMap22.table = entryArray25;
        java.lang.Object obj27 = hashMap18.remove((java.lang.Object) entryArray25);
        hashMap11.table = entryArray25;
        java.lang.Object obj29 = hashMap1.put((java.lang.Object) entryArray10, (java.lang.Object) hashMap11);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(10);
        int int2 = hashMap1.size();
        int int3 = hashMap1.modCount;
        int int4 = hashMap1.modCount;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) ' ', (float) '#');
        int int8 = hashMap7.modCount;
        java.lang.Object obj10 = hashMap7.get((java.lang.Object) ' ');
        boolean boolean11 = hashMap7.isEmpty();
        boolean boolean12 = hashMap7.isEmpty();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        hashMap13.modCount = 0;
        java.lang.Object obj16 = null;
        java.lang.Object obj17 = hashMap13.remove(obj16);
        java.lang.Object obj19 = hashMap13.get((java.lang.Object) 10);
        system.testclass.HashMap.Entry[] entryArray20 = hashMap13.table;
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap(10);
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        int int24 = hashMap23.size();
        system.testclass.HashMap.Entry[] entryArray25 = hashMap23.table;
        hashMap22.table = entryArray25;
        hashMap13.table = entryArray25;
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap((int) (byte) 10);
        system.testclass.HashMap.Entry[] entryArray30 = hashMap29.table;
        hashMap13.table = entryArray30;
        java.lang.Object obj32 = hashMap1.put((java.lang.Object) boolean12, (java.lang.Object) entryArray30);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 1, (float) 100L);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap(10);
        int int5 = hashMap4.modCount;
        system.testclass.HashMap.Entry[] entryArray6 = hashMap4.table;
        hashMap2.table = entryArray6;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = hashMap0.remove(obj3);
        java.lang.Object obj6 = hashMap0.get((java.lang.Object) 10);
        system.testclass.HashMap.Entry[] entryArray7 = hashMap0.table;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap(10);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.size();
        system.testclass.HashMap.Entry[] entryArray12 = hashMap10.table;
        hashMap9.table = entryArray12;
        hashMap0.table = entryArray12;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap();
        hashMap1.modCount = 0;
        java.lang.Object obj4 = hashMap0.remove((java.lang.Object) hashMap1);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.size();
        system.testclass.HashMap.Entry[] entryArray7 = hashMap5.table;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        hashMap9.modCount = 0;
        java.lang.Object obj12 = hashMap8.remove((java.lang.Object) hashMap9);
        java.lang.Object obj13 = hashMap5.remove((java.lang.Object) hashMap8);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.modCount;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        hashMap16.modCount = 0;
        java.lang.Object obj19 = hashMap14.get((java.lang.Object) hashMap16);
        java.lang.Object obj20 = hashMap8.get((java.lang.Object) hashMap16);
        java.lang.Object obj21 = hashMap1.remove((java.lang.Object) hashMap16);
        system.testclass.HashMap.Entry[] entryArray22 = hashMap16.table;
        system.testclass.HashMap.Entry[] entryArray23 = hashMap16.table;
        hashMap16.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap16", hashMap16.repOK_1());
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.size();
        int int2 = hashMap0.modCount;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.size();
        system.testclass.HashMap.Entry[] entryArray7 = hashMap5.table;
        hashMap5.modCount = 0;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.modCount;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        hashMap12.modCount = 0;
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = hashMap12.remove(obj15);
        system.testclass.HashMap.Entry[] entryArray17 = hashMap12.table;
        hashMap10.table = entryArray17;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        int int20 = hashMap19.size();
        system.testclass.HashMap.Entry[] entryArray21 = hashMap19.table;
        hashMap10.table = entryArray21;
        java.lang.Object obj23 = hashMap5.get((java.lang.Object) entryArray21);
        java.lang.Object obj24 = hashMap3.get(obj23);
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap(0, (float) (short) 10);
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap(0, (float) (short) 100);
        int int31 = hashMap30.modCount;
        system.testclass.HashMap.Entry[] entryArray32 = hashMap30.table;
        java.lang.Object obj33 = hashMap27.remove((java.lang.Object) entryArray32);
        system.testclass.HashMap.Entry[] entryArray34 = hashMap27.table;
        java.lang.Object obj35 = hashMap0.put(obj24, (java.lang.Object) hashMap27);
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
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        int int7 = hashMap6.modCount;
        java.lang.Object obj8 = hashMap0.get((java.lang.Object) int7);
        hashMap0.modCount = '#';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap();
        hashMap1.modCount = 0;
        java.lang.Object obj4 = hashMap0.remove((java.lang.Object) hashMap1);
        int int5 = hashMap1.size();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        hashMap7.modCount = 0;
        java.lang.Object obj10 = hashMap6.remove((java.lang.Object) hashMap7);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        hashMap13.modCount = 0;
        java.lang.Object obj16 = null;
        java.lang.Object obj17 = hashMap13.remove(obj16);
        system.testclass.HashMap.Entry[] entryArray18 = hashMap13.table;
        hashMap11.table = entryArray18;
        hashMap6.table = entryArray18;
        int int21 = hashMap6.modCount;
        int int22 = hashMap6.size();
        int int23 = hashMap6.modCount;
        java.lang.Class<?> wildcardClass24 = hashMap6.getClass();
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        int int26 = hashMap25.modCount;
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        hashMap27.modCount = 0;
        java.lang.Object obj30 = hashMap25.get((java.lang.Object) hashMap27);
        java.lang.Object obj31 = hashMap1.put((java.lang.Object) wildcardClass24, (java.lang.Object) hashMap27);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        hashMap2.modCount = 0;
        java.lang.Object obj5 = hashMap0.get((java.lang.Object) hashMap2);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.size();
        system.testclass.HashMap.Entry[] entryArray11 = hashMap9.table;
        java.lang.Object obj12 = hashMap8.remove((java.lang.Object) entryArray11);
        java.lang.Object obj13 = hashMap2.get((java.lang.Object) hashMap8);
        system.testclass.HashMap.Entry[] entryArray14 = hashMap2.table;
        system.testclass.HashMap.Entry[] entryArray15 = hashMap2.table;
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray2 = hashMap0.table;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        hashMap4.modCount = 0;
        java.lang.Object obj7 = hashMap3.remove((java.lang.Object) hashMap4);
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) hashMap3);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        hashMap11.modCount = 0;
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = hashMap11.remove(obj14);
        system.testclass.HashMap.Entry[] entryArray16 = hashMap11.table;
        hashMap9.table = entryArray16;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        int int19 = hashMap18.size();
        system.testclass.HashMap.Entry[] entryArray20 = hashMap18.table;
        hashMap9.table = entryArray20;
        hashMap3.table = entryArray20;
        int int23 = hashMap3.modCount;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.size();
        system.testclass.HashMap.Entry[] entryArray26 = hashMap24.table;
        hashMap24.modCount = 0;
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        int int30 = hashMap29.modCount;
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        hashMap31.modCount = 0;
        java.lang.Object obj34 = null;
        java.lang.Object obj35 = hashMap31.remove(obj34);
        system.testclass.HashMap.Entry[] entryArray36 = hashMap31.table;
        hashMap29.table = entryArray36;
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        int int39 = hashMap38.size();
        system.testclass.HashMap.Entry[] entryArray40 = hashMap38.table;
        hashMap29.table = entryArray40;
        java.lang.Object obj42 = hashMap24.get((java.lang.Object) entryArray40);
        boolean boolean43 = hashMap24.isEmpty();
        java.lang.Class<?> wildcardClass44 = hashMap24.getClass();
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap(0, (float) (short) 100);
        boolean boolean48 = hashMap47.isEmpty();
        int int49 = hashMap47.size();
        java.lang.Object obj50 = hashMap3.put((java.lang.Object) wildcardClass44, (java.lang.Object) int49);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap3", hashMap3.repOK_1());
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) 'a', (float) 1);
        hashMap2.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(10);
        java.lang.Object obj3 = hashMap1.remove((java.lang.Object) (short) 0);
        system.testclass.HashMap.Entry[] entryArray4 = hashMap1.table;
        hashMap1.modCount = (byte) 0;
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap();
        hashMap1.modCount = 0;
        java.lang.Object obj4 = hashMap0.remove((java.lang.Object) hashMap1);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.size();
        system.testclass.HashMap.Entry[] entryArray7 = hashMap5.table;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        hashMap9.modCount = 0;
        java.lang.Object obj12 = hashMap8.remove((java.lang.Object) hashMap9);
        java.lang.Object obj13 = hashMap5.remove((java.lang.Object) hashMap8);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.modCount;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        hashMap16.modCount = 0;
        java.lang.Object obj19 = hashMap14.get((java.lang.Object) hashMap16);
        java.lang.Object obj20 = hashMap8.get((java.lang.Object) hashMap16);
        java.lang.Object obj21 = hashMap1.remove((java.lang.Object) hashMap16);
        system.testclass.HashMap.Entry[] entryArray22 = hashMap16.table;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        hashMap23.modCount = 0;
        java.lang.Object obj26 = null;
        java.lang.Object obj27 = hashMap23.remove(obj26);
        java.lang.Object obj29 = hashMap23.get((java.lang.Object) 10);
        system.testclass.HashMap.Entry[] entryArray30 = hashMap23.table;
        java.lang.Object obj31 = hashMap16.get((java.lang.Object) entryArray30);
        hashMap16.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap16", hashMap16.repOK_1());
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap();
        hashMap1.modCount = 0;
        java.lang.Object obj4 = hashMap0.remove((java.lang.Object) hashMap1);
        hashMap1.modCount = (short) 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (short) 100);
        boolean boolean3 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.size();
        int int6 = hashMap4.modCount;
        boolean boolean7 = hashMap4.isEmpty();
        java.lang.Object obj8 = hashMap2.remove((java.lang.Object) hashMap4);
        int int9 = hashMap2.modCount;
        hashMap2.modCount = '4';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (short) 100);
        boolean boolean3 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.size();
        int int6 = hashMap4.modCount;
        boolean boolean7 = hashMap4.isEmpty();
        java.lang.Object obj8 = hashMap2.remove((java.lang.Object) hashMap4);
        hashMap2.modCount = ' ';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = hashMap0.remove(obj3);
        system.testclass.HashMap.Entry[] entryArray5 = hashMap0.table;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '#', (float) 'a');
        int int3 = hashMap2.modCount;
        system.testclass.HashMap.Entry[] entryArray4 = hashMap2.table;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap(10);
        int int7 = hashMap6.size();
        int int8 = hashMap6.modCount;
        int int9 = hashMap6.modCount;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap((int) ' ', (float) '#');
        int int13 = hashMap12.modCount;
        java.lang.Object obj15 = hashMap12.get((java.lang.Object) ' ');
        boolean boolean16 = hashMap12.isEmpty();
        java.lang.Object obj17 = hashMap2.put((java.lang.Object) int9, (java.lang.Object) hashMap12);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        hashMap2.modCount = 0;
        java.lang.Object obj5 = hashMap0.get((java.lang.Object) hashMap2);
        int int6 = hashMap2.size();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap((int) (byte) 10);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        hashMap9.modCount = 0;
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = hashMap9.remove(obj12);
        system.testclass.HashMap.Entry[] entryArray14 = hashMap9.table;
        hashMap8.table = entryArray14;
        hashMap2.table = entryArray14;
        system.testclass.HashMap.Entry[] entryArray17 = hashMap2.table;
        hashMap2.modCount = 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) ' ', (float) '#');
        int int3 = hashMap2.modCount;
        java.lang.Object obj5 = hashMap2.get((java.lang.Object) ' ');
        hashMap2.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap();
        hashMap1.modCount = 0;
        java.lang.Object obj4 = hashMap0.remove((java.lang.Object) hashMap1);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.size();
        system.testclass.HashMap.Entry[] entryArray7 = hashMap5.table;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        hashMap9.modCount = 0;
        java.lang.Object obj12 = hashMap8.remove((java.lang.Object) hashMap9);
        java.lang.Object obj13 = hashMap5.remove((java.lang.Object) hashMap8);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.modCount;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        hashMap16.modCount = 0;
        java.lang.Object obj19 = hashMap14.get((java.lang.Object) hashMap16);
        java.lang.Object obj20 = hashMap8.get((java.lang.Object) hashMap16);
        java.lang.Object obj21 = hashMap1.remove((java.lang.Object) hashMap16);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        boolean boolean23 = hashMap22.isEmpty();
        java.lang.Object obj25 = hashMap22.get((java.lang.Object) 1.0f);
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        int int27 = hashMap26.size();
        system.testclass.HashMap.Entry[] entryArray28 = hashMap26.table;
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        hashMap30.modCount = 0;
        java.lang.Object obj33 = hashMap29.remove((java.lang.Object) hashMap30);
        java.lang.Object obj34 = hashMap26.remove((java.lang.Object) hashMap29);
        java.lang.Class<?> wildcardClass35 = hashMap26.getClass();
        java.lang.Object obj36 = hashMap22.remove((java.lang.Object) wildcardClass35);
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap(10);
        int int39 = hashMap38.size();
        int int40 = hashMap38.modCount;
        int int41 = hashMap38.modCount;
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap();
        hashMap43.modCount = 0;
        java.lang.Object obj46 = hashMap42.remove((java.lang.Object) hashMap43);
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap();
        int int48 = hashMap47.modCount;
        system.testclass.HashMap hashMap49 = new system.testclass.HashMap();
        hashMap49.modCount = 0;
        java.lang.Object obj52 = null;
        java.lang.Object obj53 = hashMap49.remove(obj52);
        system.testclass.HashMap.Entry[] entryArray54 = hashMap49.table;
        hashMap47.table = entryArray54;
        hashMap42.table = entryArray54;
        java.lang.Object obj57 = hashMap38.remove((java.lang.Object) hashMap42);
        java.lang.Object obj58 = hashMap1.put((java.lang.Object) wildcardClass35, (java.lang.Object) hashMap38);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (short) 100);
        boolean boolean3 = hashMap2.isEmpty();
        int int4 = hashMap2.size();
        int int5 = hashMap2.size();
        hashMap2.modCount = (byte) -1;
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
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.size();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap3.table;
        hashMap3.modCount = 0;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.modCount;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        hashMap10.modCount = 0;
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = hashMap10.remove(obj13);
        system.testclass.HashMap.Entry[] entryArray15 = hashMap10.table;
        hashMap8.table = entryArray15;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        int int18 = hashMap17.size();
        system.testclass.HashMap.Entry[] entryArray19 = hashMap17.table;
        hashMap8.table = entryArray19;
        java.lang.Object obj21 = hashMap3.get((java.lang.Object) entryArray19);
        hashMap0.table = entryArray19;
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap((int) (byte) 100, (float) '#');
        java.lang.Object obj26 = hashMap0.get((java.lang.Object) hashMap25);
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (short) 100);
        int int3 = hashMap2.modCount;
        system.testclass.HashMap.Entry[] entryArray4 = hashMap2.table;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.size();
        system.testclass.HashMap.Entry[] entryArray7 = hashMap5.table;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        hashMap9.modCount = 0;
        java.lang.Object obj12 = hashMap8.remove((java.lang.Object) hashMap9);
        java.lang.Object obj13 = hashMap5.remove((java.lang.Object) hashMap8);
        boolean boolean14 = hashMap8.isEmpty();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        hashMap15.modCount = 0;
        java.lang.Object obj18 = null;
        java.lang.Object obj19 = hashMap15.remove(obj18);
        java.lang.Object obj21 = hashMap15.get((java.lang.Object) 10);
        system.testclass.HashMap.Entry[] entryArray22 = hashMap15.table;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap(10);
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        int int26 = hashMap25.size();
        system.testclass.HashMap.Entry[] entryArray27 = hashMap25.table;
        hashMap24.table = entryArray27;
        hashMap15.table = entryArray27;
        hashMap8.table = entryArray27;
        hashMap2.table = entryArray27;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) ' ', (float) '#');
        int int3 = hashMap2.modCount;
        java.lang.Object obj5 = hashMap2.get((java.lang.Object) ' ');
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.size();
        system.testclass.HashMap.Entry[] entryArray8 = hashMap6.table;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        hashMap10.modCount = 0;
        java.lang.Object obj13 = hashMap9.remove((java.lang.Object) hashMap10);
        java.lang.Object obj14 = hashMap6.remove((java.lang.Object) hashMap9);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        hashMap17.modCount = 0;
        java.lang.Object obj20 = null;
        java.lang.Object obj21 = hashMap17.remove(obj20);
        system.testclass.HashMap.Entry[] entryArray22 = hashMap17.table;
        hashMap15.table = entryArray22;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.size();
        system.testclass.HashMap.Entry[] entryArray26 = hashMap24.table;
        hashMap15.table = entryArray26;
        hashMap9.table = entryArray26;
        system.testclass.HashMap.Entry[] entryArray29 = hashMap9.table;
        java.lang.Object obj30 = hashMap2.get((java.lang.Object) hashMap9);
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        int int32 = hashMap31.modCount;
        int int33 = hashMap31.modCount;
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        int int35 = hashMap34.size();
        system.testclass.HashMap.Entry[] entryArray36 = hashMap34.table;
        hashMap34.modCount = 0;
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        int int40 = hashMap39.modCount;
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        hashMap41.modCount = 0;
        java.lang.Object obj44 = null;
        java.lang.Object obj45 = hashMap41.remove(obj44);
        system.testclass.HashMap.Entry[] entryArray46 = hashMap41.table;
        hashMap39.table = entryArray46;
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap();
        int int49 = hashMap48.size();
        system.testclass.HashMap.Entry[] entryArray50 = hashMap48.table;
        hashMap39.table = entryArray50;
        java.lang.Object obj52 = hashMap34.get((java.lang.Object) entryArray50);
        hashMap31.table = entryArray50;
        hashMap2.table = entryArray50;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap();
        hashMap1.modCount = 0;
        java.lang.Object obj4 = hashMap0.remove((java.lang.Object) hashMap1);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.size();
        system.testclass.HashMap.Entry[] entryArray7 = hashMap5.table;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        hashMap9.modCount = 0;
        java.lang.Object obj12 = hashMap8.remove((java.lang.Object) hashMap9);
        java.lang.Object obj13 = hashMap5.remove((java.lang.Object) hashMap8);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.modCount;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        hashMap16.modCount = 0;
        java.lang.Object obj19 = hashMap14.get((java.lang.Object) hashMap16);
        java.lang.Object obj20 = hashMap8.get((java.lang.Object) hashMap16);
        java.lang.Object obj21 = hashMap1.remove((java.lang.Object) hashMap16);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        hashMap23.modCount = 0;
        java.lang.Object obj26 = hashMap22.remove((java.lang.Object) hashMap23);
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap(10);
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        int int30 = hashMap29.size();
        system.testclass.HashMap.Entry[] entryArray31 = hashMap29.table;
        hashMap28.table = entryArray31;
        java.lang.Class<?> wildcardClass33 = hashMap28.getClass();
        java.lang.Object obj34 = hashMap23.remove((java.lang.Object) hashMap28);
        system.testclass.HashMap.Entry[] entryArray35 = hashMap23.table;
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap(0, (float) (short) 10);
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap(0, (float) (short) 100);
        int int42 = hashMap41.modCount;
        system.testclass.HashMap.Entry[] entryArray43 = hashMap41.table;
        java.lang.Object obj44 = hashMap38.remove((java.lang.Object) entryArray43);
        java.lang.Object obj45 = hashMap16.put((java.lang.Object) hashMap23, obj44);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap16", hashMap16.repOK_1());
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) ' ', (float) '#');
        int int3 = hashMap2.modCount;
        java.lang.Object obj5 = hashMap2.get((java.lang.Object) ' ');
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.size();
        system.testclass.HashMap.Entry[] entryArray8 = hashMap6.table;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        hashMap10.modCount = 0;
        java.lang.Object obj13 = hashMap9.remove((java.lang.Object) hashMap10);
        java.lang.Object obj14 = hashMap6.remove((java.lang.Object) hashMap9);
        java.lang.Class<?> wildcardClass15 = hashMap6.getClass();
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        hashMap20.modCount = 0;
        java.lang.Object obj23 = hashMap19.remove((java.lang.Object) hashMap20);
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.modCount;
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        hashMap26.modCount = 0;
        java.lang.Object obj29 = null;
        java.lang.Object obj30 = hashMap26.remove(obj29);
        system.testclass.HashMap.Entry[] entryArray31 = hashMap26.table;
        hashMap24.table = entryArray31;
        hashMap19.table = entryArray31;
        java.lang.Object obj34 = hashMap18.remove((java.lang.Object) hashMap19);
        java.lang.Object obj35 = hashMap2.put((java.lang.Object) wildcardClass15, (java.lang.Object) hashMap19);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap();
        hashMap1.modCount = 0;
        java.lang.Object obj4 = hashMap0.remove((java.lang.Object) hashMap1);
        int int5 = hashMap1.modCount;
        int int6 = hashMap1.modCount;
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (short) 10);
        int int3 = hashMap2.size();
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) 'a', (float) (byte) 1);
        int int3 = hashMap2.modCount;
        int int4 = hashMap2.modCount;
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '#', (float) 'a');
        int int3 = hashMap2.modCount;
        system.testclass.HashMap.Entry[] entryArray4 = hashMap2.table;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) (short) 100);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.size();
        system.testclass.HashMap.Entry[] entryArray9 = hashMap7.table;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        hashMap11.modCount = 0;
        java.lang.Object obj14 = hashMap10.remove((java.lang.Object) hashMap11);
        java.lang.Object obj15 = hashMap7.remove((java.lang.Object) hashMap10);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        int int17 = hashMap16.modCount;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        hashMap18.modCount = 0;
        java.lang.Object obj21 = null;
        java.lang.Object obj22 = hashMap18.remove(obj21);
        system.testclass.HashMap.Entry[] entryArray23 = hashMap18.table;
        hashMap16.table = entryArray23;
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        int int26 = hashMap25.size();
        system.testclass.HashMap.Entry[] entryArray27 = hashMap25.table;
        hashMap16.table = entryArray27;
        hashMap10.table = entryArray27;
        int int30 = hashMap10.modCount;
        java.lang.Object obj31 = hashMap2.put((java.lang.Object) hashMap6, (java.lang.Object) hashMap10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray2 = hashMap0.table;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        hashMap4.modCount = 0;
        java.lang.Object obj7 = hashMap3.remove((java.lang.Object) hashMap4);
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) hashMap3);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        hashMap11.modCount = 0;
        java.lang.Object obj14 = hashMap9.get((java.lang.Object) hashMap11);
        java.lang.Object obj15 = hashMap3.get((java.lang.Object) hashMap11);
        int int16 = hashMap11.size();
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        hashMap17.modCount = 0;
        java.lang.Object obj20 = null;
        java.lang.Object obj21 = hashMap17.remove(obj20);
        java.lang.Object obj23 = hashMap17.get((java.lang.Object) 10);
        system.testclass.HashMap.Entry[] entryArray24 = hashMap17.table;
        hashMap11.table = entryArray24;
        java.lang.Object obj26 = null;
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap((int) (byte) 10);
        system.testclass.HashMap.Entry[] entryArray29 = hashMap28.table;
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        int int31 = hashMap30.size();
        system.testclass.HashMap.Entry[] entryArray32 = hashMap30.table;
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        hashMap34.modCount = 0;
        java.lang.Object obj37 = hashMap33.remove((java.lang.Object) hashMap34);
        java.lang.Object obj38 = hashMap30.remove((java.lang.Object) hashMap33);
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        int int40 = hashMap39.modCount;
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        hashMap41.modCount = 0;
        java.lang.Object obj44 = null;
        java.lang.Object obj45 = hashMap41.remove(obj44);
        system.testclass.HashMap.Entry[] entryArray46 = hashMap41.table;
        hashMap39.table = entryArray46;
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap();
        int int49 = hashMap48.size();
        system.testclass.HashMap.Entry[] entryArray50 = hashMap48.table;
        hashMap39.table = entryArray50;
        hashMap33.table = entryArray50;
        hashMap28.table = entryArray50;
        java.lang.Object obj54 = hashMap11.put(obj26, (java.lang.Object) hashMap28);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap11", hashMap11.repOK_1());
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.size();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap3.table;
        hashMap3.modCount = 0;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.modCount;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        hashMap10.modCount = 0;
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = hashMap10.remove(obj13);
        system.testclass.HashMap.Entry[] entryArray15 = hashMap10.table;
        hashMap8.table = entryArray15;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        int int18 = hashMap17.size();
        system.testclass.HashMap.Entry[] entryArray19 = hashMap17.table;
        hashMap8.table = entryArray19;
        java.lang.Object obj21 = hashMap3.get((java.lang.Object) entryArray19);
        hashMap0.table = entryArray19;
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap((int) (byte) 100, (float) '#');
        java.lang.Object obj26 = hashMap0.get((java.lang.Object) hashMap25);
        hashMap25.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap25", hashMap25.repOK_1());
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray2 = hashMap0.table;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        hashMap4.modCount = 0;
        java.lang.Object obj7 = hashMap3.remove((java.lang.Object) hashMap4);
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) hashMap3);
        boolean boolean9 = hashMap3.isEmpty();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        hashMap11.modCount = 0;
        java.lang.Object obj14 = hashMap10.remove((java.lang.Object) hashMap11);
        java.lang.Object obj16 = hashMap11.remove((java.lang.Object) (short) 100);
        java.lang.Object obj17 = hashMap3.remove((java.lang.Object) (short) 100);
        boolean boolean18 = hashMap3.isEmpty();
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        hashMap20.modCount = 0;
        java.lang.Object obj23 = hashMap19.remove((java.lang.Object) hashMap20);
        java.lang.Object obj25 = hashMap20.remove((java.lang.Object) (short) 100);
        int int26 = hashMap20.size();
        java.lang.Class<?> wildcardClass27 = hashMap20.getClass();
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        hashMap29.modCount = 0;
        java.lang.Object obj32 = hashMap28.remove((java.lang.Object) hashMap29);
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        int int34 = hashMap33.modCount;
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        hashMap35.modCount = 0;
        java.lang.Object obj38 = null;
        java.lang.Object obj39 = hashMap35.remove(obj38);
        system.testclass.HashMap.Entry[] entryArray40 = hashMap35.table;
        hashMap33.table = entryArray40;
        hashMap28.table = entryArray40;
        int int43 = hashMap28.modCount;
        int int44 = hashMap28.modCount;
        java.lang.Object obj45 = hashMap3.put((java.lang.Object) hashMap20, (java.lang.Object) hashMap28);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap3", hashMap3.repOK_1());
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(10);
        java.lang.Object obj3 = hashMap1.remove((java.lang.Object) (short) 0);
        int int4 = hashMap1.modCount;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap(10);
        int int7 = hashMap6.size();
        boolean boolean8 = hashMap6.isEmpty();
        java.lang.Object obj9 = hashMap1.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        hashMap11.modCount = 0;
        java.lang.Object obj14 = hashMap10.remove((java.lang.Object) hashMap11);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        hashMap17.modCount = 0;
        java.lang.Object obj20 = null;
        java.lang.Object obj21 = hashMap17.remove(obj20);
        system.testclass.HashMap.Entry[] entryArray22 = hashMap17.table;
        hashMap15.table = entryArray22;
        hashMap10.table = entryArray22;
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        hashMap26.modCount = 0;
        java.lang.Object obj29 = hashMap25.remove((java.lang.Object) hashMap26);
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        int int31 = hashMap30.size();
        system.testclass.HashMap.Entry[] entryArray32 = hashMap30.table;
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        hashMap34.modCount = 0;
        java.lang.Object obj37 = hashMap33.remove((java.lang.Object) hashMap34);
        java.lang.Object obj38 = hashMap30.remove((java.lang.Object) hashMap33);
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        int int40 = hashMap39.modCount;
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        hashMap41.modCount = 0;
        java.lang.Object obj44 = hashMap39.get((java.lang.Object) hashMap41);
        java.lang.Object obj45 = hashMap33.get((java.lang.Object) hashMap41);
        java.lang.Object obj46 = hashMap26.remove((java.lang.Object) hashMap41);
        system.testclass.HashMap.Entry[] entryArray47 = hashMap41.table;
        boolean boolean48 = hashMap41.isEmpty();
        java.lang.Object obj49 = hashMap6.put((java.lang.Object) hashMap10, (java.lang.Object) hashMap41);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap6", hashMap6.repOK_1());
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        hashMap2.modCount = 0;
        java.lang.Object obj5 = hashMap0.get((java.lang.Object) hashMap2);
        int int6 = hashMap2.size();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap((int) (byte) 10);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        hashMap9.modCount = 0;
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = hashMap9.remove(obj12);
        system.testclass.HashMap.Entry[] entryArray14 = hashMap9.table;
        hashMap8.table = entryArray14;
        hashMap2.table = entryArray14;
        boolean boolean17 = hashMap2.isEmpty();
        hashMap2.modCount = 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) ' ', (float) '#');
        int int6 = hashMap5.size();
        java.lang.Object obj7 = hashMap2.remove((java.lang.Object) hashMap5);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.modCount;
        int int10 = hashMap8.modCount;
        java.lang.Class<?> wildcardClass11 = hashMap8.getClass();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.size();
        system.testclass.HashMap.Entry[] entryArray17 = hashMap15.table;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        hashMap19.modCount = 0;
        java.lang.Object obj22 = hashMap18.remove((java.lang.Object) hashMap19);
        java.lang.Object obj23 = hashMap15.remove((java.lang.Object) hashMap18);
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.modCount;
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        hashMap26.modCount = 0;
        java.lang.Object obj29 = null;
        java.lang.Object obj30 = hashMap26.remove(obj29);
        system.testclass.HashMap.Entry[] entryArray31 = hashMap26.table;
        hashMap24.table = entryArray31;
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        int int34 = hashMap33.size();
        system.testclass.HashMap.Entry[] entryArray35 = hashMap33.table;
        hashMap24.table = entryArray35;
        hashMap18.table = entryArray35;
        java.lang.Object obj38 = hashMap14.get((java.lang.Object) entryArray35);
        java.lang.Object obj39 = hashMap5.put((java.lang.Object) wildcardClass11, (java.lang.Object) entryArray35);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap5", hashMap5.repOK_1());
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray2 = hashMap0.table;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        hashMap4.modCount = 0;
        java.lang.Object obj7 = hashMap3.remove((java.lang.Object) hashMap4);
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) hashMap3);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        hashMap11.modCount = 0;
        java.lang.Object obj14 = hashMap9.get((java.lang.Object) hashMap11);
        java.lang.Object obj15 = hashMap3.get((java.lang.Object) hashMap11);
        int int16 = hashMap11.size();
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        hashMap17.modCount = 0;
        java.lang.Object obj20 = null;
        java.lang.Object obj21 = hashMap17.remove(obj20);
        java.lang.Object obj23 = hashMap17.get((java.lang.Object) 10);
        system.testclass.HashMap.Entry[] entryArray24 = hashMap17.table;
        hashMap11.table = entryArray24;
        hashMap11.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap11", hashMap11.repOK_1());
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(10);
        int int2 = hashMap1.size();
        int int3 = hashMap1.modCount;
        int int4 = hashMap1.modCount;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        hashMap6.modCount = 0;
        java.lang.Object obj9 = hashMap5.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.modCount;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        hashMap12.modCount = 0;
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = hashMap12.remove(obj15);
        system.testclass.HashMap.Entry[] entryArray17 = hashMap12.table;
        hashMap10.table = entryArray17;
        hashMap5.table = entryArray17;
        java.lang.Object obj20 = hashMap1.remove((java.lang.Object) hashMap5);
        hashMap1.modCount = (byte) 0;
        system.testclass.HashMap.Entry[] entryArray23 = hashMap1.table;
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) 1.0f);
        hashMap0.modCount = ' ';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (short) 10);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) ' ', (float) '#');
        int int6 = hashMap5.modCount;
        java.lang.Object obj8 = hashMap5.get((java.lang.Object) ' ');
        java.lang.Object obj9 = hashMap2.get((java.lang.Object) ' ');
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        int int13 = hashMap12.size();
        system.testclass.HashMap.Entry[] entryArray14 = hashMap12.table;
        hashMap12.modCount = 0;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        int int18 = hashMap17.modCount;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        hashMap19.modCount = 0;
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = hashMap19.remove(obj22);
        system.testclass.HashMap.Entry[] entryArray24 = hashMap19.table;
        hashMap17.table = entryArray24;
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        int int27 = hashMap26.size();
        system.testclass.HashMap.Entry[] entryArray28 = hashMap26.table;
        hashMap17.table = entryArray28;
        java.lang.Object obj30 = hashMap12.get((java.lang.Object) entryArray28);
        java.lang.Object obj31 = hashMap10.get(obj30);
        java.lang.Object obj32 = hashMap2.remove((java.lang.Object) hashMap10);
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap(0, (float) 1);
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        int int37 = hashMap36.modCount;
        int int38 = hashMap36.modCount;
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        int int40 = hashMap39.size();
        system.testclass.HashMap.Entry[] entryArray41 = hashMap39.table;
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap();
        hashMap43.modCount = 0;
        java.lang.Object obj46 = hashMap42.remove((java.lang.Object) hashMap43);
        java.lang.Object obj47 = hashMap39.remove((java.lang.Object) hashMap42);
        java.lang.Object obj48 = hashMap36.get((java.lang.Object) hashMap39);
        java.lang.Object obj49 = hashMap10.put((java.lang.Object) 1, obj48);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap10", hashMap10.repOK_1());
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (short) 10);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) ' ', (float) '#');
        int int6 = hashMap5.modCount;
        java.lang.Object obj8 = hashMap5.get((java.lang.Object) ' ');
        java.lang.Object obj9 = hashMap2.get((java.lang.Object) ' ');
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        int int13 = hashMap12.size();
        system.testclass.HashMap.Entry[] entryArray14 = hashMap12.table;
        hashMap12.modCount = 0;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        int int18 = hashMap17.modCount;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        hashMap19.modCount = 0;
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = hashMap19.remove(obj22);
        system.testclass.HashMap.Entry[] entryArray24 = hashMap19.table;
        hashMap17.table = entryArray24;
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        int int27 = hashMap26.size();
        system.testclass.HashMap.Entry[] entryArray28 = hashMap26.table;
        hashMap17.table = entryArray28;
        java.lang.Object obj30 = hashMap12.get((java.lang.Object) entryArray28);
        java.lang.Object obj31 = hashMap10.get(obj30);
        java.lang.Object obj32 = hashMap2.remove((java.lang.Object) hashMap10);
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        hashMap34.modCount = 0;
        java.lang.Object obj37 = hashMap33.remove((java.lang.Object) hashMap34);
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap(10);
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        int int41 = hashMap40.size();
        system.testclass.HashMap.Entry[] entryArray42 = hashMap40.table;
        hashMap39.table = entryArray42;
        java.lang.Class<?> wildcardClass44 = hashMap39.getClass();
        java.lang.Object obj45 = hashMap34.remove((java.lang.Object) hashMap39);
        system.testclass.HashMap.Entry[] entryArray46 = hashMap34.table;
        system.testclass.HashMap hashMap49 = new system.testclass.HashMap((int) 'a', (float) (byte) 1);
        int int50 = hashMap49.modCount;
        java.lang.Object obj51 = hashMap2.put((java.lang.Object) entryArray46, (java.lang.Object) hashMap49);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        int int3 = hashMap2.size();
        system.testclass.HashMap.Entry[] entryArray4 = hashMap2.table;
        hashMap2.modCount = 0;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        hashMap9.modCount = 0;
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = hashMap9.remove(obj12);
        system.testclass.HashMap.Entry[] entryArray14 = hashMap9.table;
        hashMap7.table = entryArray14;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        int int17 = hashMap16.size();
        system.testclass.HashMap.Entry[] entryArray18 = hashMap16.table;
        hashMap7.table = entryArray18;
        java.lang.Object obj20 = hashMap2.get((java.lang.Object) entryArray18);
        java.lang.Object obj21 = hashMap0.get(obj20);
        hashMap0.modCount = 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 100);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        hashMap2.modCount = 0;
        java.lang.Object obj5 = null;
        java.lang.Object obj6 = hashMap2.remove(obj5);
        java.lang.Object obj8 = hashMap2.get((java.lang.Object) 10);
        java.lang.Object obj9 = hashMap1.remove(obj8);
        hashMap1.modCount = (byte) 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        hashMap2.modCount = 0;
        java.lang.Object obj5 = hashMap0.get((java.lang.Object) hashMap2);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.size();
        system.testclass.HashMap.Entry[] entryArray11 = hashMap9.table;
        java.lang.Object obj12 = hashMap8.remove((java.lang.Object) entryArray11);
        java.lang.Object obj13 = hashMap2.get((java.lang.Object) hashMap8);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = hashMap8.remove(obj14);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap((int) (byte) 10);
        system.testclass.HashMap.Entry[] entryArray18 = hashMap17.table;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        int int20 = hashMap19.size();
        system.testclass.HashMap.Entry[] entryArray21 = hashMap19.table;
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        hashMap23.modCount = 0;
        java.lang.Object obj26 = hashMap22.remove((java.lang.Object) hashMap23);
        java.lang.Object obj27 = hashMap19.remove((java.lang.Object) hashMap22);
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap((int) ' ', (float) '#');
        int int31 = hashMap30.modCount;
        java.lang.Object obj33 = hashMap30.get((java.lang.Object) ' ');
        java.lang.Object obj34 = hashMap22.remove(obj33);
        system.testclass.HashMap.Entry[] entryArray35 = hashMap22.table;
        java.lang.Object obj36 = hashMap8.put((java.lang.Object) hashMap17, (java.lang.Object) entryArray35);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap8", hashMap8.repOK_1());
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) ' ', (float) '#');
        int int3 = hashMap2.modCount;
        java.lang.Object obj5 = hashMap2.get((java.lang.Object) ' ');
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.size();
        system.testclass.HashMap.Entry[] entryArray8 = hashMap6.table;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        hashMap10.modCount = 0;
        java.lang.Object obj13 = hashMap9.remove((java.lang.Object) hashMap10);
        java.lang.Object obj14 = hashMap6.remove((java.lang.Object) hashMap9);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        hashMap17.modCount = 0;
        java.lang.Object obj20 = null;
        java.lang.Object obj21 = hashMap17.remove(obj20);
        system.testclass.HashMap.Entry[] entryArray22 = hashMap17.table;
        hashMap15.table = entryArray22;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.size();
        system.testclass.HashMap.Entry[] entryArray26 = hashMap24.table;
        hashMap15.table = entryArray26;
        hashMap9.table = entryArray26;
        system.testclass.HashMap.Entry[] entryArray29 = hashMap9.table;
        java.lang.Object obj30 = hashMap2.get((java.lang.Object) hashMap9);
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 100);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap((int) (byte) 10);
        java.lang.Class<?> wildcardClass5 = hashMap4.getClass();
        java.lang.Object obj6 = hashMap2.get((java.lang.Object) wildcardClass5);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap((int) ' ');
        java.lang.Object obj10 = hashMap8.remove((java.lang.Object) 0);
        java.lang.Object obj11 = hashMap0.put((java.lang.Object) wildcardClass5, (java.lang.Object) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap();
        hashMap1.modCount = 0;
        java.lang.Object obj4 = hashMap0.remove((java.lang.Object) hashMap1);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        hashMap7.modCount = 0;
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = hashMap7.remove(obj10);
        system.testclass.HashMap.Entry[] entryArray12 = hashMap7.table;
        hashMap5.table = entryArray12;
        hashMap0.table = entryArray12;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        int int3 = hashMap0.size();
        int int4 = hashMap0.size();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        hashMap6.modCount = 0;
        java.lang.Object obj9 = hashMap5.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.size();
        system.testclass.HashMap.Entry[] entryArray12 = hashMap10.table;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        hashMap14.modCount = 0;
        java.lang.Object obj17 = hashMap13.remove((java.lang.Object) hashMap14);
        java.lang.Object obj18 = hashMap10.remove((java.lang.Object) hashMap13);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        int int20 = hashMap19.modCount;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        hashMap21.modCount = 0;
        java.lang.Object obj24 = hashMap19.get((java.lang.Object) hashMap21);
        java.lang.Object obj25 = hashMap13.get((java.lang.Object) hashMap21);
        java.lang.Object obj26 = hashMap6.remove((java.lang.Object) hashMap21);
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap((int) (byte) 10);
        system.testclass.HashMap.Entry[] entryArray29 = hashMap28.table;
        java.lang.Object obj30 = hashMap6.remove((java.lang.Object) hashMap28);
        boolean boolean31 = hashMap28.isEmpty();
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        int int36 = hashMap35.size();
        system.testclass.HashMap.Entry[] entryArray37 = hashMap35.table;
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        hashMap39.modCount = 0;
        java.lang.Object obj42 = hashMap38.remove((java.lang.Object) hashMap39);
        java.lang.Object obj43 = hashMap35.remove((java.lang.Object) hashMap38);
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap();
        int int45 = hashMap44.modCount;
        system.testclass.HashMap hashMap46 = new system.testclass.HashMap();
        hashMap46.modCount = 0;
        java.lang.Object obj49 = null;
        java.lang.Object obj50 = hashMap46.remove(obj49);
        system.testclass.HashMap.Entry[] entryArray51 = hashMap46.table;
        hashMap44.table = entryArray51;
        system.testclass.HashMap hashMap53 = new system.testclass.HashMap();
        int int54 = hashMap53.size();
        system.testclass.HashMap.Entry[] entryArray55 = hashMap53.table;
        hashMap44.table = entryArray55;
        hashMap38.table = entryArray55;
        java.lang.Object obj58 = hashMap34.get((java.lang.Object) entryArray55);
        system.testclass.HashMap hashMap59 = new system.testclass.HashMap();
        int int60 = hashMap59.size();
        system.testclass.HashMap.Entry[] entryArray61 = hashMap59.table;
        system.testclass.HashMap hashMap62 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap63 = new system.testclass.HashMap();
        hashMap63.modCount = 0;
        java.lang.Object obj66 = hashMap62.remove((java.lang.Object) hashMap63);
        java.lang.Object obj67 = hashMap59.remove((java.lang.Object) hashMap62);
        system.testclass.HashMap hashMap68 = new system.testclass.HashMap();
        int int69 = hashMap68.modCount;
        system.testclass.HashMap hashMap70 = new system.testclass.HashMap();
        hashMap70.modCount = 0;
        java.lang.Object obj73 = null;
        java.lang.Object obj74 = hashMap70.remove(obj73);
        system.testclass.HashMap.Entry[] entryArray75 = hashMap70.table;
        hashMap68.table = entryArray75;
        system.testclass.HashMap hashMap77 = new system.testclass.HashMap();
        int int78 = hashMap77.size();
        system.testclass.HashMap.Entry[] entryArray79 = hashMap77.table;
        hashMap68.table = entryArray79;
        hashMap62.table = entryArray79;
        system.testclass.HashMap.Entry[] entryArray82 = hashMap62.table;
        java.lang.Object obj83 = hashMap34.remove((java.lang.Object) hashMap62);
        int int84 = hashMap34.size();
        java.lang.Class<?> wildcardClass85 = hashMap34.getClass();
        java.lang.Object obj86 = hashMap0.put((java.lang.Object) boolean31, (java.lang.Object) hashMap34);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        hashMap2.modCount = 0;
        java.lang.Object obj5 = hashMap0.get((java.lang.Object) hashMap2);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.size();
        system.testclass.HashMap.Entry[] entryArray11 = hashMap9.table;
        java.lang.Object obj12 = hashMap8.remove((java.lang.Object) entryArray11);
        java.lang.Object obj13 = hashMap2.get((java.lang.Object) hashMap8);
        system.testclass.HashMap.Entry[] entryArray14 = hashMap8.table;
        hashMap8.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap8", hashMap8.repOK_1());
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = hashMap0.remove(obj3);
        boolean boolean5 = hashMap0.isEmpty();
        hashMap0.modCount = 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (short) 10);
        int int3 = hashMap2.modCount;
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(10);
        java.lang.Object obj3 = hashMap1.remove((java.lang.Object) (short) 0);
        system.testclass.HashMap.Entry[] entryArray4 = hashMap1.table;
        hashMap1.modCount = (byte) 0;
        hashMap1.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        hashMap0.modCount = (short) 0;
        hashMap0.modCount = '4';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) ' ', (float) '#');
        int int3 = hashMap2.modCount;
        java.lang.Object obj5 = hashMap2.get((java.lang.Object) ' ');
        boolean boolean6 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        hashMap7.modCount = 0;
        hashMap7.modCount = (short) 0;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap(10);
        int int14 = hashMap13.size();
        int int15 = hashMap13.modCount;
        java.lang.Object obj16 = hashMap2.put((java.lang.Object) (short) 0, (java.lang.Object) hashMap13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        hashMap2.modCount = 0;
        java.lang.Object obj5 = hashMap0.get((java.lang.Object) hashMap2);
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray2 = hashMap0.table;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) '#', (float) 'a');
        int int6 = hashMap5.modCount;
        system.testclass.HashMap.Entry[] entryArray7 = hashMap5.table;
        hashMap0.table = entryArray7;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.size();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap3.table;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        hashMap7.modCount = 0;
        java.lang.Object obj10 = hashMap6.remove((java.lang.Object) hashMap7);
        java.lang.Object obj11 = hashMap3.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        int int13 = hashMap12.modCount;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        hashMap14.modCount = 0;
        java.lang.Object obj17 = null;
        java.lang.Object obj18 = hashMap14.remove(obj17);
        system.testclass.HashMap.Entry[] entryArray19 = hashMap14.table;
        hashMap12.table = entryArray19;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        int int22 = hashMap21.size();
        system.testclass.HashMap.Entry[] entryArray23 = hashMap21.table;
        hashMap12.table = entryArray23;
        hashMap6.table = entryArray23;
        java.lang.Object obj26 = hashMap2.get((java.lang.Object) entryArray23);
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        int int28 = hashMap27.size();
        system.testclass.HashMap.Entry[] entryArray29 = hashMap27.table;
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        hashMap31.modCount = 0;
        java.lang.Object obj34 = hashMap30.remove((java.lang.Object) hashMap31);
        java.lang.Object obj35 = hashMap27.remove((java.lang.Object) hashMap30);
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        int int37 = hashMap36.modCount;
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        hashMap38.modCount = 0;
        java.lang.Object obj41 = null;
        java.lang.Object obj42 = hashMap38.remove(obj41);
        system.testclass.HashMap.Entry[] entryArray43 = hashMap38.table;
        hashMap36.table = entryArray43;
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        int int46 = hashMap45.size();
        system.testclass.HashMap.Entry[] entryArray47 = hashMap45.table;
        hashMap36.table = entryArray47;
        hashMap30.table = entryArray47;
        system.testclass.HashMap.Entry[] entryArray50 = hashMap30.table;
        java.lang.Object obj51 = hashMap2.remove((java.lang.Object) hashMap30);
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap();
        int int53 = hashMap52.size();
        system.testclass.HashMap.Entry[] entryArray54 = hashMap52.table;
        system.testclass.HashMap.Entry[] entryArray55 = hashMap52.table;
        hashMap2.table = entryArray55;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        int int3 = hashMap0.size();
        int int4 = hashMap0.size();
        hashMap0.modCount = 10;
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
        int int4 = hashMap3.size();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap3.table;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        hashMap7.modCount = 0;
        java.lang.Object obj10 = hashMap6.remove((java.lang.Object) hashMap7);
        java.lang.Object obj11 = hashMap3.remove((java.lang.Object) hashMap6);
        java.lang.Object obj12 = hashMap0.get((java.lang.Object) hashMap3);
        boolean boolean13 = hashMap3.isEmpty();
        hashMap3.modCount = (byte) 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap3", hashMap3.repOK_1());
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap();
        hashMap1.modCount = 0;
        java.lang.Object obj4 = hashMap0.remove((java.lang.Object) hashMap1);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        hashMap7.modCount = 0;
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = hashMap7.remove(obj10);
        system.testclass.HashMap.Entry[] entryArray12 = hashMap7.table;
        hashMap5.table = entryArray12;
        hashMap0.table = entryArray12;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap((int) (byte) 100);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap((int) (byte) 10);
        java.lang.Class<?> wildcardClass19 = hashMap18.getClass();
        java.lang.Object obj20 = hashMap16.get((java.lang.Object) wildcardClass19);
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        int int22 = hashMap21.modCount;
        int int23 = hashMap21.modCount;
        system.testclass.HashMap.Entry[] entryArray24 = hashMap21.table;
        boolean boolean25 = hashMap21.isEmpty();
        java.lang.Object obj26 = hashMap0.put((java.lang.Object) hashMap16, (java.lang.Object) hashMap21);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 100, 100.0f);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.size();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap3.table;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        hashMap7.modCount = 0;
        java.lang.Object obj10 = hashMap6.remove((java.lang.Object) hashMap7);
        java.lang.Object obj11 = hashMap3.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        int int13 = hashMap12.modCount;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        hashMap14.modCount = 0;
        java.lang.Object obj17 = null;
        java.lang.Object obj18 = hashMap14.remove(obj17);
        system.testclass.HashMap.Entry[] entryArray19 = hashMap14.table;
        hashMap12.table = entryArray19;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        int int22 = hashMap21.size();
        system.testclass.HashMap.Entry[] entryArray23 = hashMap21.table;
        hashMap12.table = entryArray23;
        hashMap6.table = entryArray23;
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap(0, (float) (short) 10);
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap(0, (float) (short) 100);
        int int32 = hashMap31.modCount;
        system.testclass.HashMap.Entry[] entryArray33 = hashMap31.table;
        java.lang.Object obj34 = hashMap28.remove((java.lang.Object) entryArray33);
        java.lang.Object obj35 = hashMap6.get(obj34);
        system.testclass.HashMap.Entry[] entryArray36 = hashMap6.table;
        hashMap2.table = entryArray36;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray2 = hashMap0.table;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        hashMap4.modCount = 0;
        java.lang.Object obj7 = hashMap3.remove((java.lang.Object) hashMap4);
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) hashMap3);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        hashMap11.modCount = 0;
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = hashMap11.remove(obj14);
        system.testclass.HashMap.Entry[] entryArray16 = hashMap11.table;
        hashMap9.table = entryArray16;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        int int19 = hashMap18.size();
        system.testclass.HashMap.Entry[] entryArray20 = hashMap18.table;
        hashMap9.table = entryArray20;
        hashMap3.table = entryArray20;
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap(10);
        int int26 = hashMap25.size();
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        int int28 = hashMap27.modCount;
        int int29 = hashMap27.modCount;
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        int int31 = hashMap30.size();
        system.testclass.HashMap.Entry[] entryArray32 = hashMap30.table;
        hashMap30.modCount = 0;
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        int int36 = hashMap35.modCount;
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        hashMap37.modCount = 0;
        java.lang.Object obj40 = null;
        java.lang.Object obj41 = hashMap37.remove(obj40);
        system.testclass.HashMap.Entry[] entryArray42 = hashMap37.table;
        hashMap35.table = entryArray42;
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap();
        int int45 = hashMap44.size();
        system.testclass.HashMap.Entry[] entryArray46 = hashMap44.table;
        hashMap35.table = entryArray46;
        java.lang.Object obj48 = hashMap30.get((java.lang.Object) entryArray46);
        hashMap27.table = entryArray46;
        hashMap25.table = entryArray46;
        java.lang.Object obj51 = hashMap3.put((java.lang.Object) (byte) 10, (java.lang.Object) entryArray46);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap3", hashMap3.repOK_1());
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) ' ', (float) '#');
        int int3 = hashMap2.modCount;
        hashMap2.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        system.testclass.HashMap.Entry[] entryArray6 = hashMap3.table;
        hashMap2.table = entryArray6;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(10);
        hashMap1.modCount = (byte) 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) ' ', (float) '#');
        int int3 = hashMap2.modCount;
        java.lang.Object obj5 = hashMap2.get((java.lang.Object) ' ');
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.size();
        system.testclass.HashMap.Entry[] entryArray8 = hashMap6.table;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        hashMap10.modCount = 0;
        java.lang.Object obj13 = hashMap9.remove((java.lang.Object) hashMap10);
        java.lang.Object obj14 = hashMap6.remove((java.lang.Object) hashMap9);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        hashMap17.modCount = 0;
        java.lang.Object obj20 = null;
        java.lang.Object obj21 = hashMap17.remove(obj20);
        system.testclass.HashMap.Entry[] entryArray22 = hashMap17.table;
        hashMap15.table = entryArray22;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.size();
        system.testclass.HashMap.Entry[] entryArray26 = hashMap24.table;
        hashMap15.table = entryArray26;
        hashMap9.table = entryArray26;
        system.testclass.HashMap.Entry[] entryArray29 = hashMap9.table;
        java.lang.Object obj30 = hashMap2.get((java.lang.Object) hashMap9);
        int int31 = hashMap9.size();
        hashMap9.modCount = (byte) 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap9", hashMap9.repOK_1());
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(10);
        int int2 = hashMap1.size();
        int int3 = hashMap1.modCount;
        int int4 = hashMap1.modCount;
        system.testclass.HashMap.Entry[] entryArray5 = hashMap1.table;
        int int6 = hashMap1.size();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap((int) (byte) 100);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        hashMap9.modCount = 0;
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = hashMap9.remove(obj12);
        java.lang.Object obj15 = hashMap9.get((java.lang.Object) 10);
        java.lang.Object obj16 = hashMap8.remove(obj15);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap(10);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        int int20 = hashMap19.size();
        system.testclass.HashMap.Entry[] entryArray21 = hashMap19.table;
        hashMap18.table = entryArray21;
        java.lang.Object obj23 = hashMap1.put((java.lang.Object) hashMap8, (java.lang.Object) entryArray21);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) ' ', (float) (byte) 100);
        hashMap2.modCount = (short) 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) ' ', (float) '#');
        int int6 = hashMap5.size();
        java.lang.Object obj7 = hashMap2.remove((java.lang.Object) hashMap5);
        int int8 = hashMap5.modCount;
        hashMap5.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap5", hashMap5.repOK_1());
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap();
        hashMap1.modCount = 0;
        java.lang.Object obj4 = hashMap0.remove((java.lang.Object) hashMap1);
        int int5 = hashMap0.modCount;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) 'a', (float) (byte) 1);
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 10);
        system.testclass.HashMap.Entry[] entryArray2 = hashMap1.table;
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        boolean boolean3 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.size();
        system.testclass.HashMap.Entry[] entryArray6 = hashMap4.table;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        hashMap8.modCount = 0;
        java.lang.Object obj11 = hashMap7.remove((java.lang.Object) hashMap8);
        java.lang.Object obj12 = hashMap4.remove((java.lang.Object) hashMap7);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        hashMap15.modCount = 0;
        java.lang.Object obj18 = null;
        java.lang.Object obj19 = hashMap15.remove(obj18);
        system.testclass.HashMap.Entry[] entryArray20 = hashMap15.table;
        hashMap13.table = entryArray20;
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        int int23 = hashMap22.size();
        system.testclass.HashMap.Entry[] entryArray24 = hashMap22.table;
        hashMap13.table = entryArray24;
        hashMap7.table = entryArray24;
        int int27 = hashMap7.modCount;
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap((int) (byte) 10);
        system.testclass.HashMap.Entry[] entryArray30 = hashMap29.table;
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        int int32 = hashMap31.size();
        system.testclass.HashMap.Entry[] entryArray33 = hashMap31.table;
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        hashMap35.modCount = 0;
        java.lang.Object obj38 = hashMap34.remove((java.lang.Object) hashMap35);
        java.lang.Object obj39 = hashMap31.remove((java.lang.Object) hashMap34);
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        int int41 = hashMap40.modCount;
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap();
        hashMap42.modCount = 0;
        java.lang.Object obj45 = null;
        java.lang.Object obj46 = hashMap42.remove(obj45);
        system.testclass.HashMap.Entry[] entryArray47 = hashMap42.table;
        hashMap40.table = entryArray47;
        system.testclass.HashMap hashMap49 = new system.testclass.HashMap();
        int int50 = hashMap49.size();
        system.testclass.HashMap.Entry[] entryArray51 = hashMap49.table;
        hashMap40.table = entryArray51;
        hashMap34.table = entryArray51;
        hashMap29.table = entryArray51;
        java.lang.Object obj55 = hashMap7.remove((java.lang.Object) entryArray51);
        system.testclass.HashMap hashMap56 = new system.testclass.HashMap();
        int int57 = hashMap56.modCount;
        system.testclass.HashMap hashMap58 = new system.testclass.HashMap();
        hashMap58.modCount = 0;
        java.lang.Object obj61 = hashMap56.get((java.lang.Object) hashMap58);
        system.testclass.HashMap hashMap64 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap65 = new system.testclass.HashMap();
        int int66 = hashMap65.size();
        system.testclass.HashMap.Entry[] entryArray67 = hashMap65.table;
        java.lang.Object obj68 = hashMap64.remove((java.lang.Object) entryArray67);
        java.lang.Object obj69 = hashMap58.get((java.lang.Object) hashMap64);
        system.testclass.HashMap.Entry[] entryArray70 = hashMap58.table;
        system.testclass.HashMap.Entry[] entryArray71 = hashMap58.table;
        java.lang.Object obj72 = hashMap0.put((java.lang.Object) entryArray51, (java.lang.Object) hashMap58);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int3 = hashMap2.size();
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(100);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        hashMap2.modCount = 0;
        java.lang.Object obj5 = null;
        java.lang.Object obj6 = hashMap2.remove(obj5);
        java.lang.Object obj8 = hashMap2.get((java.lang.Object) 10);
        system.testclass.HashMap.Entry[] entryArray9 = hashMap2.table;
        java.lang.Object obj10 = hashMap1.remove((java.lang.Object) entryArray9);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        hashMap11.modCount = 0;
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = hashMap11.remove(obj14);
        system.testclass.HashMap.Entry[] entryArray16 = hashMap11.table;
        java.lang.Object obj17 = hashMap1.remove((java.lang.Object) hashMap11);
        hashMap11.modCount = (byte) 0;
        hashMap11.modCount = (short) 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap11", hashMap11.repOK_1());
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap();
        hashMap1.modCount = 0;
        java.lang.Object obj4 = hashMap0.remove((java.lang.Object) hashMap1);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.size();
        system.testclass.HashMap.Entry[] entryArray7 = hashMap5.table;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        hashMap9.modCount = 0;
        java.lang.Object obj12 = hashMap8.remove((java.lang.Object) hashMap9);
        java.lang.Object obj13 = hashMap5.remove((java.lang.Object) hashMap8);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.modCount;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        hashMap16.modCount = 0;
        java.lang.Object obj19 = hashMap14.get((java.lang.Object) hashMap16);
        java.lang.Object obj20 = hashMap8.get((java.lang.Object) hashMap16);
        java.lang.Object obj21 = hashMap1.remove((java.lang.Object) hashMap16);
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap((int) (byte) 10);
        system.testclass.HashMap.Entry[] entryArray24 = hashMap23.table;
        java.lang.Object obj25 = hashMap1.remove((java.lang.Object) hashMap23);
        boolean boolean26 = hashMap23.isEmpty();
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap(0, (float) (short) 10);
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap(0, (float) (short) 100);
        int int33 = hashMap32.modCount;
        system.testclass.HashMap.Entry[] entryArray34 = hashMap32.table;
        java.lang.Object obj35 = hashMap29.remove((java.lang.Object) entryArray34);
        system.testclass.HashMap.Entry[] entryArray36 = hashMap29.table;
        hashMap23.table = entryArray36;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap23", hashMap23.repOK_1());
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        hashMap2.modCount = 0;
        java.lang.Object obj5 = hashMap0.get((java.lang.Object) hashMap2);
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) (byte) 10);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap((int) (byte) 10);
        system.testclass.HashMap.Entry[] entryArray10 = hashMap9.table;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        int int13 = hashMap11.modCount;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.size();
        system.testclass.HashMap.Entry[] entryArray16 = hashMap14.table;
        hashMap14.modCount = 0;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        int int20 = hashMap19.modCount;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        hashMap21.modCount = 0;
        java.lang.Object obj24 = null;
        java.lang.Object obj25 = hashMap21.remove(obj24);
        system.testclass.HashMap.Entry[] entryArray26 = hashMap21.table;
        hashMap19.table = entryArray26;
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        int int29 = hashMap28.size();
        system.testclass.HashMap.Entry[] entryArray30 = hashMap28.table;
        hashMap19.table = entryArray30;
        java.lang.Object obj32 = hashMap14.get((java.lang.Object) entryArray30);
        hashMap11.table = entryArray30;
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap((int) (byte) 100, (float) '#');
        java.lang.Object obj37 = hashMap11.get((java.lang.Object) hashMap36);
        java.lang.Object obj38 = null;
        java.lang.Object obj39 = hashMap11.remove(obj38);
        system.testclass.HashMap.Entry[] entryArray40 = hashMap11.table;
        hashMap9.table = entryArray40;
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap(10);
        java.lang.Object obj45 = hashMap43.remove((java.lang.Object) (short) 0);
        int int46 = hashMap43.modCount;
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap();
        hashMap48.modCount = 0;
        java.lang.Object obj51 = hashMap47.remove((java.lang.Object) hashMap48);
        system.testclass.HashMap hashMap53 = new system.testclass.HashMap(10);
        system.testclass.HashMap hashMap54 = new system.testclass.HashMap();
        int int55 = hashMap54.size();
        system.testclass.HashMap.Entry[] entryArray56 = hashMap54.table;
        hashMap53.table = entryArray56;
        java.lang.Class<?> wildcardClass58 = hashMap53.getClass();
        java.lang.Object obj59 = hashMap48.remove((java.lang.Object) hashMap53);
        system.testclass.HashMap.Entry[] entryArray60 = hashMap48.table;
        hashMap43.table = entryArray60;
        int int62 = hashMap43.size();
        java.lang.Object obj63 = hashMap0.put((java.lang.Object) entryArray40, (java.lang.Object) int62);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap();
        hashMap1.modCount = 0;
        java.lang.Object obj4 = hashMap0.remove((java.lang.Object) hashMap1);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.size();
        system.testclass.HashMap.Entry[] entryArray7 = hashMap5.table;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        hashMap9.modCount = 0;
        java.lang.Object obj12 = hashMap8.remove((java.lang.Object) hashMap9);
        java.lang.Object obj13 = hashMap5.remove((java.lang.Object) hashMap8);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.modCount;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        hashMap16.modCount = 0;
        java.lang.Object obj19 = hashMap14.get((java.lang.Object) hashMap16);
        java.lang.Object obj20 = hashMap8.get((java.lang.Object) hashMap16);
        java.lang.Object obj21 = hashMap1.remove((java.lang.Object) hashMap16);
        system.testclass.HashMap.Entry[] entryArray22 = hashMap16.table;
        boolean boolean23 = hashMap16.isEmpty();
        hashMap16.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap16", hashMap16.repOK_1());
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (short) 100);
        boolean boolean3 = hashMap2.isEmpty();
        int int4 = hashMap2.size();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap(10);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.size();
        system.testclass.HashMap.Entry[] entryArray9 = hashMap7.table;
        hashMap6.table = entryArray9;
        java.lang.Object obj11 = hashMap2.remove((java.lang.Object) entryArray9);
        int int12 = hashMap2.modCount;
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 10);
        system.testclass.HashMap.Entry[] entryArray2 = hashMap1.table;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.size();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap3.table;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        hashMap7.modCount = 0;
        java.lang.Object obj10 = hashMap6.remove((java.lang.Object) hashMap7);
        java.lang.Object obj11 = hashMap3.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        int int13 = hashMap12.modCount;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        hashMap14.modCount = 0;
        java.lang.Object obj17 = null;
        java.lang.Object obj18 = hashMap14.remove(obj17);
        system.testclass.HashMap.Entry[] entryArray19 = hashMap14.table;
        hashMap12.table = entryArray19;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        int int22 = hashMap21.size();
        system.testclass.HashMap.Entry[] entryArray23 = hashMap21.table;
        hashMap12.table = entryArray23;
        hashMap6.table = entryArray23;
        hashMap1.table = entryArray23;
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap(10);
        java.lang.Object obj30 = hashMap28.remove((java.lang.Object) (short) 0);
        int int31 = hashMap28.modCount;
        system.testclass.HashMap.Entry[] entryArray32 = hashMap28.table;
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        int int37 = hashMap36.size();
        system.testclass.HashMap.Entry[] entryArray38 = hashMap36.table;
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        hashMap40.modCount = 0;
        java.lang.Object obj43 = hashMap39.remove((java.lang.Object) hashMap40);
        java.lang.Object obj44 = hashMap36.remove((java.lang.Object) hashMap39);
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        int int46 = hashMap45.modCount;
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap();
        hashMap47.modCount = 0;
        java.lang.Object obj50 = null;
        java.lang.Object obj51 = hashMap47.remove(obj50);
        system.testclass.HashMap.Entry[] entryArray52 = hashMap47.table;
        hashMap45.table = entryArray52;
        system.testclass.HashMap hashMap54 = new system.testclass.HashMap();
        int int55 = hashMap54.size();
        system.testclass.HashMap.Entry[] entryArray56 = hashMap54.table;
        hashMap45.table = entryArray56;
        hashMap39.table = entryArray56;
        java.lang.Object obj59 = hashMap35.get((java.lang.Object) entryArray56);
        system.testclass.HashMap hashMap60 = new system.testclass.HashMap();
        int int61 = hashMap60.size();
        system.testclass.HashMap.Entry[] entryArray62 = hashMap60.table;
        system.testclass.HashMap hashMap63 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap64 = new system.testclass.HashMap();
        hashMap64.modCount = 0;
        java.lang.Object obj67 = hashMap63.remove((java.lang.Object) hashMap64);
        java.lang.Object obj68 = hashMap60.remove((java.lang.Object) hashMap63);
        system.testclass.HashMap hashMap69 = new system.testclass.HashMap();
        int int70 = hashMap69.modCount;
        system.testclass.HashMap hashMap71 = new system.testclass.HashMap();
        hashMap71.modCount = 0;
        java.lang.Object obj74 = null;
        java.lang.Object obj75 = hashMap71.remove(obj74);
        system.testclass.HashMap.Entry[] entryArray76 = hashMap71.table;
        hashMap69.table = entryArray76;
        system.testclass.HashMap hashMap78 = new system.testclass.HashMap();
        int int79 = hashMap78.size();
        system.testclass.HashMap.Entry[] entryArray80 = hashMap78.table;
        hashMap69.table = entryArray80;
        hashMap63.table = entryArray80;
        system.testclass.HashMap.Entry[] entryArray83 = hashMap63.table;
        java.lang.Object obj84 = hashMap35.remove((java.lang.Object) hashMap63);
        java.lang.Object obj85 = hashMap1.put((java.lang.Object) hashMap28, obj84);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(100);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        hashMap2.modCount = 0;
        java.lang.Object obj5 = null;
        java.lang.Object obj6 = hashMap2.remove(obj5);
        java.lang.Object obj8 = hashMap2.get((java.lang.Object) 10);
        system.testclass.HashMap.Entry[] entryArray9 = hashMap2.table;
        java.lang.Object obj10 = hashMap1.remove((java.lang.Object) entryArray9);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        hashMap11.modCount = 0;
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = hashMap11.remove(obj14);
        system.testclass.HashMap.Entry[] entryArray16 = hashMap11.table;
        java.lang.Object obj17 = hashMap1.remove((java.lang.Object) hashMap11);
        hashMap11.modCount = (byte) 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap11", hashMap11.repOK_1());
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(100);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap((int) (byte) 10);
        system.testclass.HashMap.Entry[] entryArray4 = hashMap3.table;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.size();
        system.testclass.HashMap.Entry[] entryArray10 = hashMap8.table;
        hashMap8.modCount = 0;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        hashMap15.modCount = 0;
        java.lang.Object obj18 = null;
        java.lang.Object obj19 = hashMap15.remove(obj18);
        system.testclass.HashMap.Entry[] entryArray20 = hashMap15.table;
        hashMap13.table = entryArray20;
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        int int23 = hashMap22.size();
        system.testclass.HashMap.Entry[] entryArray24 = hashMap22.table;
        hashMap13.table = entryArray24;
        java.lang.Object obj26 = hashMap8.get((java.lang.Object) entryArray24);
        hashMap5.table = entryArray24;
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap((int) (byte) 100, (float) '#');
        java.lang.Object obj31 = hashMap5.get((java.lang.Object) hashMap30);
        java.lang.Object obj32 = null;
        java.lang.Object obj33 = hashMap5.remove(obj32);
        system.testclass.HashMap.Entry[] entryArray34 = hashMap5.table;
        hashMap3.table = entryArray34;
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap(100);
        java.lang.Object obj38 = hashMap1.put((java.lang.Object) entryArray34, (java.lang.Object) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray2 = hashMap0.table;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        hashMap4.modCount = 0;
        java.lang.Object obj7 = hashMap3.remove((java.lang.Object) hashMap4);
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) hashMap3);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        hashMap11.modCount = 0;
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = hashMap11.remove(obj14);
        system.testclass.HashMap.Entry[] entryArray16 = hashMap11.table;
        hashMap9.table = entryArray16;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        int int19 = hashMap18.size();
        system.testclass.HashMap.Entry[] entryArray20 = hashMap18.table;
        hashMap9.table = entryArray20;
        hashMap3.table = entryArray20;
        system.testclass.HashMap.Entry[] entryArray23 = hashMap3.table;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        hashMap24.modCount = 0;
        hashMap24.modCount = (short) 0;
        java.lang.Object obj29 = hashMap3.remove((java.lang.Object) hashMap24);
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap(0, (float) 1);
        system.testclass.HashMap.Entry[] entryArray33 = hashMap32.table;
        hashMap24.table = entryArray33;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap24", hashMap24.repOK_1());
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int3 = hashMap2.size();
        hashMap2.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap();
        hashMap1.modCount = 0;
        java.lang.Object obj4 = hashMap0.remove((java.lang.Object) hashMap1);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        hashMap7.modCount = 0;
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = hashMap7.remove(obj10);
        system.testclass.HashMap.Entry[] entryArray12 = hashMap7.table;
        hashMap5.table = entryArray12;
        hashMap0.table = entryArray12;
        int int15 = hashMap0.modCount;
        int int16 = hashMap0.modCount;
        int int17 = hashMap0.size();
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        int int19 = hashMap18.size();
        system.testclass.HashMap.Entry[] entryArray20 = hashMap18.table;
        system.testclass.HashMap.Entry[] entryArray21 = hashMap18.table;
        hashMap0.table = entryArray21;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) ' ', (float) '#');
        int int6 = hashMap5.size();
        java.lang.Object obj7 = hashMap2.remove((java.lang.Object) hashMap5);
        int int8 = hashMap5.modCount;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap(10);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.size();
        system.testclass.HashMap.Entry[] entryArray13 = hashMap11.table;
        hashMap10.table = entryArray13;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap(0, (float) (short) 100);
        boolean boolean18 = hashMap17.isEmpty();
        int int19 = hashMap17.size();
        int int20 = hashMap17.size();
        java.lang.Object obj21 = hashMap5.put((java.lang.Object) entryArray13, (java.lang.Object) int20);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap5", hashMap5.repOK_1());
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) ' ', (float) '#');
        int int8 = hashMap7.size();
        java.lang.Object obj9 = hashMap4.remove((java.lang.Object) hashMap7);
        system.testclass.HashMap.Entry[] entryArray10 = hashMap4.table;
        hashMap0.table = entryArray10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap();
        hashMap1.modCount = 0;
        java.lang.Object obj4 = hashMap0.remove((java.lang.Object) hashMap1);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        hashMap7.modCount = 0;
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = hashMap7.remove(obj10);
        system.testclass.HashMap.Entry[] entryArray12 = hashMap7.table;
        hashMap5.table = entryArray12;
        hashMap0.table = entryArray12;
        int int15 = hashMap0.modCount;
        int int16 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray17 = hashMap0.table;
        hashMap0.modCount = 'a';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) ' ', (float) '#');
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap(0, (float) 1);
        system.testclass.HashMap.Entry[] entryArray6 = hashMap5.table;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap(0, (float) (short) 100);
        boolean boolean10 = hashMap9.isEmpty();
        int int11 = hashMap9.size();
        java.lang.Object obj12 = hashMap2.put((java.lang.Object) hashMap5, (java.lang.Object) int11);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(1, (float) (byte) 1);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.size();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap3.table;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        hashMap7.modCount = 0;
        java.lang.Object obj10 = hashMap6.remove((java.lang.Object) hashMap7);
        java.lang.Object obj11 = hashMap3.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap((int) ' ', (float) '#');
        int int15 = hashMap14.modCount;
        java.lang.Object obj17 = hashMap14.get((java.lang.Object) ' ');
        java.lang.Object obj18 = hashMap6.remove(obj17);
        hashMap6.modCount = 0;
        int int21 = hashMap6.size();
        int int22 = hashMap6.modCount;
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap(1, (float) 10L);
        java.lang.Object obj26 = hashMap2.put((java.lang.Object) hashMap6, (java.lang.Object) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.size();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap3.table;
        java.lang.Object obj6 = hashMap2.remove((java.lang.Object) entryArray5);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.size();
        system.testclass.HashMap.Entry[] entryArray9 = hashMap7.table;
        system.testclass.HashMap.Entry[] entryArray10 = hashMap7.table;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.size();
        system.testclass.HashMap.Entry[] entryArray13 = hashMap11.table;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        hashMap15.modCount = 0;
        java.lang.Object obj18 = hashMap14.remove((java.lang.Object) hashMap15);
        java.lang.Object obj19 = hashMap11.remove((java.lang.Object) hashMap14);
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        int int21 = hashMap20.modCount;
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        hashMap22.modCount = 0;
        java.lang.Object obj25 = null;
        java.lang.Object obj26 = hashMap22.remove(obj25);
        system.testclass.HashMap.Entry[] entryArray27 = hashMap22.table;
        hashMap20.table = entryArray27;
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        int int30 = hashMap29.size();
        system.testclass.HashMap.Entry[] entryArray31 = hashMap29.table;
        hashMap20.table = entryArray31;
        hashMap14.table = entryArray31;
        int int34 = hashMap14.modCount;
        boolean boolean35 = hashMap14.isEmpty();
        int int36 = hashMap14.modCount;
        java.lang.Object obj37 = hashMap2.put((java.lang.Object) hashMap7, (java.lang.Object) int36);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray2 = hashMap0.table;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        hashMap4.modCount = 0;
        java.lang.Object obj7 = hashMap3.remove((java.lang.Object) hashMap4);
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) hashMap3);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        hashMap11.modCount = 0;
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = hashMap11.remove(obj14);
        system.testclass.HashMap.Entry[] entryArray16 = hashMap11.table;
        hashMap9.table = entryArray16;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        int int19 = hashMap18.size();
        system.testclass.HashMap.Entry[] entryArray20 = hashMap18.table;
        hashMap9.table = entryArray20;
        hashMap3.table = entryArray20;
        int int23 = hashMap3.modCount;
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap((int) (byte) 10);
        system.testclass.HashMap.Entry[] entryArray26 = hashMap25.table;
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        int int28 = hashMap27.size();
        system.testclass.HashMap.Entry[] entryArray29 = hashMap27.table;
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        hashMap31.modCount = 0;
        java.lang.Object obj34 = hashMap30.remove((java.lang.Object) hashMap31);
        java.lang.Object obj35 = hashMap27.remove((java.lang.Object) hashMap30);
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        int int37 = hashMap36.modCount;
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        hashMap38.modCount = 0;
        java.lang.Object obj41 = null;
        java.lang.Object obj42 = hashMap38.remove(obj41);
        system.testclass.HashMap.Entry[] entryArray43 = hashMap38.table;
        hashMap36.table = entryArray43;
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        int int46 = hashMap45.size();
        system.testclass.HashMap.Entry[] entryArray47 = hashMap45.table;
        hashMap36.table = entryArray47;
        hashMap30.table = entryArray47;
        hashMap25.table = entryArray47;
        java.lang.Object obj51 = hashMap3.remove((java.lang.Object) entryArray47);
        boolean boolean52 = hashMap3.isEmpty();
        boolean boolean53 = hashMap3.isEmpty();
        hashMap3.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap3", hashMap3.repOK_1());
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray2 = hashMap0.table;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        hashMap4.modCount = 0;
        java.lang.Object obj7 = hashMap3.remove((java.lang.Object) hashMap4);
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) hashMap3);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        hashMap11.modCount = 0;
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = hashMap11.remove(obj14);
        system.testclass.HashMap.Entry[] entryArray16 = hashMap11.table;
        hashMap9.table = entryArray16;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        int int19 = hashMap18.size();
        system.testclass.HashMap.Entry[] entryArray20 = hashMap18.table;
        hashMap9.table = entryArray20;
        hashMap3.table = entryArray20;
        int int23 = hashMap3.modCount;
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap((int) (byte) 10);
        system.testclass.HashMap.Entry[] entryArray26 = hashMap25.table;
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        int int28 = hashMap27.size();
        system.testclass.HashMap.Entry[] entryArray29 = hashMap27.table;
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        hashMap31.modCount = 0;
        java.lang.Object obj34 = hashMap30.remove((java.lang.Object) hashMap31);
        java.lang.Object obj35 = hashMap27.remove((java.lang.Object) hashMap30);
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        int int37 = hashMap36.modCount;
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        hashMap38.modCount = 0;
        java.lang.Object obj41 = null;
        java.lang.Object obj42 = hashMap38.remove(obj41);
        system.testclass.HashMap.Entry[] entryArray43 = hashMap38.table;
        hashMap36.table = entryArray43;
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        int int46 = hashMap45.size();
        system.testclass.HashMap.Entry[] entryArray47 = hashMap45.table;
        hashMap36.table = entryArray47;
        hashMap30.table = entryArray47;
        hashMap25.table = entryArray47;
        java.lang.Object obj51 = hashMap3.remove((java.lang.Object) entryArray47);
        system.testclass.HashMap hashMap53 = new system.testclass.HashMap((int) (byte) 100);
        system.testclass.HashMap hashMap54 = new system.testclass.HashMap();
        hashMap54.modCount = 0;
        java.lang.Object obj57 = null;
        java.lang.Object obj58 = hashMap54.remove(obj57);
        java.lang.Object obj60 = hashMap54.get((java.lang.Object) 10);
        java.lang.Object obj61 = hashMap53.remove(obj60);
        system.testclass.HashMap hashMap64 = new system.testclass.HashMap(0, (float) (short) 10);
        system.testclass.HashMap hashMap67 = new system.testclass.HashMap(0, (float) (short) 100);
        int int68 = hashMap67.modCount;
        system.testclass.HashMap.Entry[] entryArray69 = hashMap67.table;
        java.lang.Object obj70 = hashMap64.remove((java.lang.Object) entryArray69);
        system.testclass.HashMap.Entry[] entryArray71 = hashMap64.table;
        java.lang.Object obj72 = hashMap53.get((java.lang.Object) entryArray71);
        hashMap3.table = entryArray71;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap3", hashMap3.repOK_1());
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 10, (float) (byte) 10);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        hashMap5.modCount = 0;
        java.lang.Object obj8 = hashMap3.get((java.lang.Object) hashMap5);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        int int13 = hashMap12.size();
        system.testclass.HashMap.Entry[] entryArray14 = hashMap12.table;
        java.lang.Object obj15 = hashMap11.remove((java.lang.Object) entryArray14);
        java.lang.Object obj16 = hashMap5.get((java.lang.Object) hashMap11);
        system.testclass.HashMap.Entry[] entryArray17 = hashMap11.table;
        hashMap2.table = entryArray17;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 1);
        system.testclass.HashMap.Entry[] entryArray3 = hashMap2.table;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        hashMap4.modCount = 0;
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = hashMap4.remove(obj7);
        java.lang.Object obj10 = hashMap4.get((java.lang.Object) 10);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        int int13 = hashMap11.modCount;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.size();
        system.testclass.HashMap.Entry[] entryArray16 = hashMap14.table;
        hashMap14.modCount = 0;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        int int20 = hashMap19.modCount;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        hashMap21.modCount = 0;
        java.lang.Object obj24 = null;
        java.lang.Object obj25 = hashMap21.remove(obj24);
        system.testclass.HashMap.Entry[] entryArray26 = hashMap21.table;
        hashMap19.table = entryArray26;
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        int int29 = hashMap28.size();
        system.testclass.HashMap.Entry[] entryArray30 = hashMap28.table;
        hashMap19.table = entryArray30;
        java.lang.Object obj32 = hashMap14.get((java.lang.Object) entryArray30);
        hashMap11.table = entryArray30;
        hashMap4.table = entryArray30;
        hashMap2.table = entryArray30;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap();
        hashMap1.modCount = 0;
        java.lang.Object obj4 = hashMap0.remove((java.lang.Object) hashMap1);
        java.lang.Object obj6 = hashMap1.remove((java.lang.Object) (short) 100);
        boolean boolean7 = hashMap1.isEmpty();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap(0, (float) 1);
        system.testclass.HashMap.Entry[] entryArray11 = hashMap10.table;
        hashMap1.table = entryArray11;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) ' ', (float) '#');
        int int6 = hashMap5.size();
        java.lang.Object obj7 = hashMap2.remove((java.lang.Object) hashMap5);
        int int8 = hashMap2.size();
        int int9 = hashMap2.size();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.modCount;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        hashMap12.modCount = 0;
        java.lang.Object obj15 = hashMap10.get((java.lang.Object) hashMap12);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        int int20 = hashMap19.size();
        system.testclass.HashMap.Entry[] entryArray21 = hashMap19.table;
        java.lang.Object obj22 = hashMap18.remove((java.lang.Object) entryArray21);
        java.lang.Object obj23 = hashMap12.get((java.lang.Object) hashMap18);
        system.testclass.HashMap.Entry[] entryArray24 = hashMap12.table;
        system.testclass.HashMap.Entry[] entryArray25 = hashMap12.table;
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        int int27 = hashMap26.size();
        system.testclass.HashMap.Entry[] entryArray28 = hashMap26.table;
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        hashMap30.modCount = 0;
        java.lang.Object obj33 = hashMap29.remove((java.lang.Object) hashMap30);
        java.lang.Object obj34 = hashMap26.remove((java.lang.Object) hashMap29);
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        int int36 = hashMap35.modCount;
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        hashMap37.modCount = 0;
        java.lang.Object obj40 = hashMap35.get((java.lang.Object) hashMap37);
        java.lang.Object obj41 = hashMap29.get((java.lang.Object) hashMap37);
        int int42 = hashMap37.size();
        int int43 = hashMap37.size();
        java.lang.Object obj44 = hashMap2.put((java.lang.Object) entryArray25, (java.lang.Object) hashMap37);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (short) 10);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap(0, (float) (short) 100);
        int int6 = hashMap5.modCount;
        system.testclass.HashMap.Entry[] entryArray7 = hashMap5.table;
        java.lang.Object obj8 = hashMap2.remove((java.lang.Object) entryArray7);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        system.testclass.HashMap.Entry[] entryArray11 = hashMap9.table;
        hashMap2.table = entryArray11;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) ' ', (float) '#');
        int int3 = hashMap2.modCount;
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) ' ', (float) (byte) 100);
        boolean boolean3 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        hashMap6.modCount = 0;
        java.lang.Object obj9 = hashMap4.get((java.lang.Object) hashMap6);
        java.lang.Object obj10 = hashMap2.get((java.lang.Object) hashMap4);
        system.testclass.HashMap.Entry[] entryArray11 = hashMap4.table;
        hashMap4.modCount = (byte) 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap4", hashMap4.repOK_1());
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(1, 1.0f);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap((int) (byte) 100);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        hashMap5.modCount = 0;
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = hashMap5.remove(obj8);
        java.lang.Object obj11 = hashMap5.get((java.lang.Object) 10);
        java.lang.Object obj12 = hashMap4.remove(obj11);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap(0, (float) (short) 10);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap(0, (float) (short) 100);
        int int19 = hashMap18.modCount;
        system.testclass.HashMap.Entry[] entryArray20 = hashMap18.table;
        java.lang.Object obj21 = hashMap15.remove((java.lang.Object) entryArray20);
        system.testclass.HashMap.Entry[] entryArray22 = hashMap15.table;
        java.lang.Object obj23 = hashMap4.get((java.lang.Object) entryArray22);
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap(10);
        int int26 = hashMap25.size();
        int int27 = hashMap25.modCount;
        int int28 = hashMap25.modCount;
        system.testclass.HashMap.Entry[] entryArray29 = hashMap25.table;
        java.lang.Object obj30 = hashMap2.put((java.lang.Object) hashMap4, (java.lang.Object) hashMap25);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.size();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap3.table;
        java.lang.Object obj6 = hashMap2.remove((java.lang.Object) entryArray5);
        int int7 = hashMap2.size();
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray2 = hashMap0.table;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        hashMap4.modCount = 0;
        java.lang.Object obj7 = hashMap3.remove((java.lang.Object) hashMap4);
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) hashMap3);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        hashMap11.modCount = 0;
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = hashMap11.remove(obj14);
        system.testclass.HashMap.Entry[] entryArray16 = hashMap11.table;
        hashMap9.table = entryArray16;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        int int19 = hashMap18.size();
        system.testclass.HashMap.Entry[] entryArray20 = hashMap18.table;
        hashMap9.table = entryArray20;
        hashMap3.table = entryArray20;
        system.testclass.HashMap.Entry[] entryArray23 = hashMap3.table;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        hashMap24.modCount = 0;
        hashMap24.modCount = (short) 0;
        java.lang.Object obj29 = hashMap3.remove((java.lang.Object) hashMap24);
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap((int) (byte) 100);
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap((int) (byte) 10);
        java.lang.Class<?> wildcardClass34 = hashMap33.getClass();
        java.lang.Object obj35 = hashMap31.get((java.lang.Object) wildcardClass34);
        java.lang.Object obj36 = hashMap3.remove((java.lang.Object) hashMap31);
        hashMap31.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap31", hashMap31.repOK_1());
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = hashMap0.remove(obj3);
        java.lang.Object obj6 = hashMap0.get((java.lang.Object) 10);
        system.testclass.HashMap.Entry[] entryArray7 = hashMap0.table;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        hashMap8.modCount = 0;
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = hashMap8.remove(obj11);
        java.lang.Object obj14 = hashMap8.get((java.lang.Object) 10);
        system.testclass.HashMap.Entry[] entryArray15 = hashMap8.table;
        java.lang.Object obj16 = hashMap0.remove((java.lang.Object) entryArray15);
        boolean boolean17 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        hashMap18.modCount = 0;
        java.lang.Object obj21 = null;
        java.lang.Object obj22 = hashMap18.remove(obj21);
        system.testclass.HashMap.Entry[] entryArray23 = hashMap18.table;
        java.lang.Object obj24 = hashMap0.get((java.lang.Object) entryArray23);
        hashMap0.modCount = (byte) 1;
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
        hashMap0.modCount = 0;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.size();
        system.testclass.HashMap.Entry[] entryArray7 = hashMap5.table;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        hashMap9.modCount = 0;
        java.lang.Object obj12 = hashMap8.remove((java.lang.Object) hashMap9);
        java.lang.Object obj13 = hashMap5.remove((java.lang.Object) hashMap8);
        boolean boolean14 = hashMap8.isEmpty();
        int int15 = hashMap8.size();
        int int16 = hashMap8.modCount;
        java.lang.Object obj17 = hashMap0.remove((java.lang.Object) int16);
        hashMap0.modCount = (short) 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        hashMap2.modCount = 0;
        java.lang.Object obj5 = hashMap0.get((java.lang.Object) hashMap2);
        int int6 = hashMap0.size();
        hashMap0.modCount = 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(100, (float) 10);
        system.testclass.HashMap.Entry[] entryArray3 = hashMap2.table;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        hashMap5.modCount = 0;
        java.lang.Object obj8 = hashMap4.remove((java.lang.Object) hashMap5);
        int int9 = hashMap5.modCount;
        system.testclass.HashMap.Entry[] entryArray10 = hashMap5.table;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.size();
        system.testclass.HashMap.Entry[] entryArray13 = hashMap11.table;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        hashMap15.modCount = 0;
        java.lang.Object obj18 = hashMap14.remove((java.lang.Object) hashMap15);
        java.lang.Object obj19 = hashMap11.remove((java.lang.Object) hashMap14);
        java.lang.Object obj20 = hashMap2.put((java.lang.Object) entryArray10, (java.lang.Object) hashMap14);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (short) 10);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap(0, (float) (short) 100);
        int int6 = hashMap5.modCount;
        system.testclass.HashMap.Entry[] entryArray7 = hashMap5.table;
        java.lang.Object obj8 = hashMap2.remove((java.lang.Object) entryArray7);
        system.testclass.HashMap.Entry[] entryArray9 = hashMap2.table;
        int int10 = hashMap2.modCount;
        hashMap2.modCount = (byte) 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        int int3 = hashMap2.modCount;
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 100);
        hashMap1.modCount = (byte) 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 1, (float) ' ');
        int int3 = hashMap2.size();
        boolean boolean4 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.size();
        system.testclass.HashMap.Entry[] entryArray7 = hashMap5.table;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        hashMap9.modCount = 0;
        java.lang.Object obj12 = hashMap8.remove((java.lang.Object) hashMap9);
        java.lang.Object obj13 = hashMap5.remove((java.lang.Object) hashMap8);
        boolean boolean14 = hashMap8.isEmpty();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        hashMap16.modCount = 0;
        java.lang.Object obj19 = hashMap15.remove((java.lang.Object) hashMap16);
        java.lang.Object obj21 = hashMap16.remove((java.lang.Object) (short) 100);
        java.lang.Object obj22 = hashMap8.remove((java.lang.Object) (short) 100);
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap((int) ' ', (float) '#');
        int int26 = hashMap25.modCount;
        java.lang.Object obj28 = hashMap25.get((java.lang.Object) ' ');
        java.lang.Object obj29 = hashMap8.remove((java.lang.Object) ' ');
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        hashMap30.modCount = 0;
        java.lang.Object obj33 = null;
        java.lang.Object obj34 = hashMap30.remove(obj33);
        java.lang.Object obj36 = hashMap30.get((java.lang.Object) 10);
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        hashMap38.modCount = 0;
        java.lang.Object obj41 = hashMap37.remove((java.lang.Object) hashMap38);
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap();
        int int43 = hashMap42.size();
        system.testclass.HashMap.Entry[] entryArray44 = hashMap42.table;
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap46 = new system.testclass.HashMap();
        hashMap46.modCount = 0;
        java.lang.Object obj49 = hashMap45.remove((java.lang.Object) hashMap46);
        java.lang.Object obj50 = hashMap42.remove((java.lang.Object) hashMap45);
        system.testclass.HashMap hashMap51 = new system.testclass.HashMap();
        int int52 = hashMap51.modCount;
        system.testclass.HashMap hashMap53 = new system.testclass.HashMap();
        hashMap53.modCount = 0;
        java.lang.Object obj56 = hashMap51.get((java.lang.Object) hashMap53);
        java.lang.Object obj57 = hashMap45.get((java.lang.Object) hashMap53);
        java.lang.Object obj58 = hashMap38.remove((java.lang.Object) hashMap53);
        system.testclass.HashMap.Entry[] entryArray59 = hashMap53.table;
        hashMap30.table = entryArray59;
        java.lang.Object obj61 = hashMap2.put((java.lang.Object) ' ', (java.lang.Object) hashMap30);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(10);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        int int3 = hashMap2.size();
        system.testclass.HashMap.Entry[] entryArray4 = hashMap2.table;
        hashMap1.table = entryArray4;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap(10);
        java.lang.Object obj9 = hashMap7.remove((java.lang.Object) (short) 0);
        int int10 = hashMap7.modCount;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap(10);
        int int13 = hashMap12.size();
        boolean boolean14 = hashMap12.isEmpty();
        java.lang.Object obj15 = hashMap7.remove((java.lang.Object) hashMap12);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap(10);
        int int18 = hashMap17.size();
        boolean boolean19 = hashMap17.isEmpty();
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        int int21 = hashMap20.size();
        system.testclass.HashMap.Entry[] entryArray22 = hashMap20.table;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        hashMap24.modCount = 0;
        java.lang.Object obj27 = hashMap23.remove((java.lang.Object) hashMap24);
        java.lang.Object obj28 = hashMap20.remove((java.lang.Object) hashMap23);
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        int int30 = hashMap29.modCount;
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        hashMap31.modCount = 0;
        java.lang.Object obj34 = hashMap29.get((java.lang.Object) hashMap31);
        java.lang.Object obj35 = hashMap23.get((java.lang.Object) hashMap31);
        int int36 = hashMap31.size();
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        hashMap37.modCount = 0;
        java.lang.Object obj40 = null;
        java.lang.Object obj41 = hashMap37.remove(obj40);
        java.lang.Object obj43 = hashMap37.get((java.lang.Object) 10);
        system.testclass.HashMap.Entry[] entryArray44 = hashMap37.table;
        hashMap31.table = entryArray44;
        hashMap17.table = entryArray44;
        java.lang.Object obj47 = hashMap1.put((java.lang.Object) hashMap7, (java.lang.Object) entryArray44);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 100);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        hashMap2.modCount = 0;
        java.lang.Object obj5 = null;
        java.lang.Object obj6 = hashMap2.remove(obj5);
        java.lang.Object obj8 = hashMap2.get((java.lang.Object) 10);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        hashMap9.modCount = 0;
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = hashMap9.remove(obj12);
        system.testclass.HashMap.Entry[] entryArray14 = hashMap9.table;
        hashMap2.table = entryArray14;
        java.lang.Object obj16 = hashMap1.get((java.lang.Object) hashMap2);
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) ' ', (float) '#');
        int int6 = hashMap5.size();
        java.lang.Object obj7 = hashMap2.remove((java.lang.Object) hashMap5);
        int int8 = hashMap5.modCount;
        boolean boolean9 = hashMap5.isEmpty();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap(0, (float) (short) 100);
        boolean boolean13 = hashMap12.isEmpty();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.size();
        int int16 = hashMap14.modCount;
        boolean boolean17 = hashMap14.isEmpty();
        java.lang.Object obj18 = hashMap12.remove((java.lang.Object) hashMap14);
        java.lang.Object obj19 = hashMap5.remove(obj18);
        hashMap5.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap5", hashMap5.repOK_1());
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (short) 10);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) ' ', (float) '#');
        int int6 = hashMap5.modCount;
        java.lang.Object obj8 = hashMap5.get((java.lang.Object) ' ');
        java.lang.Object obj9 = hashMap2.get((java.lang.Object) ' ');
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        int int13 = hashMap12.size();
        system.testclass.HashMap.Entry[] entryArray14 = hashMap12.table;
        hashMap12.modCount = 0;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        int int18 = hashMap17.modCount;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        hashMap19.modCount = 0;
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = hashMap19.remove(obj22);
        system.testclass.HashMap.Entry[] entryArray24 = hashMap19.table;
        hashMap17.table = entryArray24;
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        int int27 = hashMap26.size();
        system.testclass.HashMap.Entry[] entryArray28 = hashMap26.table;
        hashMap17.table = entryArray28;
        java.lang.Object obj30 = hashMap12.get((java.lang.Object) entryArray28);
        java.lang.Object obj31 = hashMap10.get(obj30);
        java.lang.Object obj32 = hashMap2.remove((java.lang.Object) hashMap10);
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (short) 10);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap(0, (float) (short) 100);
        int int6 = hashMap5.modCount;
        system.testclass.HashMap.Entry[] entryArray7 = hashMap5.table;
        java.lang.Object obj8 = hashMap2.remove((java.lang.Object) entryArray7);
        hashMap2.modCount = (byte) 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = hashMap0.remove(obj3);
        java.lang.Object obj6 = hashMap0.get((java.lang.Object) 10);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        hashMap7.modCount = 0;
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = hashMap7.remove(obj10);
        system.testclass.HashMap.Entry[] entryArray12 = hashMap7.table;
        hashMap0.table = entryArray12;
        hashMap0.modCount = '#';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 10, (float) (byte) 1);
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 100, (float) '#');
        int int3 = hashMap2.size();
        java.lang.Object obj5 = hashMap2.get((java.lang.Object) 1);
        hashMap2.modCount = '#';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        hashMap2.modCount = 0;
        java.lang.Object obj5 = hashMap0.get((java.lang.Object) hashMap2);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.size();
        system.testclass.HashMap.Entry[] entryArray11 = hashMap9.table;
        java.lang.Object obj12 = hashMap8.remove((java.lang.Object) entryArray11);
        java.lang.Object obj13 = hashMap2.get((java.lang.Object) hashMap8);
        system.testclass.HashMap.Entry[] entryArray14 = hashMap8.table;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap((int) 'a');
        java.lang.Object obj17 = null;
        java.lang.Object obj18 = hashMap8.put((java.lang.Object) 'a', obj17);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap8", hashMap8.repOK_1());
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) ' ', (float) '#');
        int int6 = hashMap5.size();
        java.lang.Object obj7 = hashMap2.remove((java.lang.Object) hashMap5);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        hashMap9.modCount = 0;
        java.lang.Object obj12 = hashMap8.remove((java.lang.Object) hashMap9);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap(10);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.size();
        system.testclass.HashMap.Entry[] entryArray17 = hashMap15.table;
        hashMap14.table = entryArray17;
        java.lang.Class<?> wildcardClass19 = hashMap14.getClass();
        java.lang.Object obj20 = hashMap9.remove((java.lang.Object) hashMap14);
        system.testclass.HashMap.Entry[] entryArray21 = hashMap9.table;
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = hashMap5.put((java.lang.Object) hashMap9, obj22);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap5", hashMap5.repOK_1());
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        int int7 = hashMap6.modCount;
        java.lang.Object obj8 = hashMap0.get((java.lang.Object) int7);
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.size();
        int int2 = hashMap0.size();
        int int3 = hashMap0.modCount;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        hashMap6.modCount = 0;
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = hashMap6.remove(obj9);
        system.testclass.HashMap.Entry[] entryArray11 = hashMap6.table;
        hashMap4.table = entryArray11;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.size();
        system.testclass.HashMap.Entry[] entryArray15 = hashMap13.table;
        hashMap4.table = entryArray15;
        hashMap0.table = entryArray15;
        java.lang.Object obj18 = null;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap(0, (float) 10);
        java.lang.Object obj22 = hashMap0.put(obj18, (java.lang.Object) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.size();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap3.table;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        hashMap7.modCount = 0;
        java.lang.Object obj10 = hashMap6.remove((java.lang.Object) hashMap7);
        java.lang.Object obj11 = hashMap3.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        int int13 = hashMap12.modCount;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        hashMap14.modCount = 0;
        java.lang.Object obj17 = null;
        java.lang.Object obj18 = hashMap14.remove(obj17);
        system.testclass.HashMap.Entry[] entryArray19 = hashMap14.table;
        hashMap12.table = entryArray19;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        int int22 = hashMap21.size();
        system.testclass.HashMap.Entry[] entryArray23 = hashMap21.table;
        hashMap12.table = entryArray23;
        hashMap6.table = entryArray23;
        java.lang.Object obj26 = hashMap2.get((java.lang.Object) entryArray23);
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        int int28 = hashMap27.size();
        system.testclass.HashMap.Entry[] entryArray29 = hashMap27.table;
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        hashMap31.modCount = 0;
        java.lang.Object obj34 = hashMap30.remove((java.lang.Object) hashMap31);
        java.lang.Object obj35 = hashMap27.remove((java.lang.Object) hashMap30);
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        int int37 = hashMap36.modCount;
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        hashMap38.modCount = 0;
        java.lang.Object obj41 = null;
        java.lang.Object obj42 = hashMap38.remove(obj41);
        system.testclass.HashMap.Entry[] entryArray43 = hashMap38.table;
        hashMap36.table = entryArray43;
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        int int46 = hashMap45.size();
        system.testclass.HashMap.Entry[] entryArray47 = hashMap45.table;
        hashMap36.table = entryArray47;
        hashMap30.table = entryArray47;
        system.testclass.HashMap.Entry[] entryArray50 = hashMap30.table;
        java.lang.Object obj51 = hashMap2.remove((java.lang.Object) hashMap30);
        int int52 = hashMap2.size();
        system.testclass.HashMap hashMap55 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap hashMap57 = new system.testclass.HashMap((int) (byte) 10);
        system.testclass.HashMap.Entry[] entryArray58 = hashMap57.table;
        java.lang.Object obj59 = hashMap55.remove((java.lang.Object) hashMap57);
        system.testclass.HashMap hashMap60 = new system.testclass.HashMap();
        boolean boolean61 = hashMap60.isEmpty();
        java.lang.Object obj62 = hashMap2.put(obj59, (java.lang.Object) boolean61);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 100, (float) '#');
        int int3 = hashMap2.size();
        java.lang.Object obj5 = hashMap2.get((java.lang.Object) 1);
        hashMap2.modCount = 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) 'a', (float) (byte) 1);
        int int3 = hashMap2.modCount;
        int int4 = hashMap2.modCount;
        int int5 = hashMap2.modCount;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        hashMap6.modCount = 0;
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = hashMap6.remove(obj9);
        java.lang.Object obj12 = hashMap6.get((java.lang.Object) 10);
        int int13 = hashMap6.modCount;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap(0, (float) (short) 10);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap(0, (float) (short) 100);
        int int20 = hashMap19.modCount;
        system.testclass.HashMap.Entry[] entryArray21 = hashMap19.table;
        java.lang.Object obj22 = hashMap16.remove((java.lang.Object) entryArray21);
        java.lang.Object obj23 = hashMap6.remove((java.lang.Object) hashMap16);
        java.lang.Object obj24 = hashMap2.get((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        hashMap26.modCount = 0;
        java.lang.Object obj29 = hashMap25.remove((java.lang.Object) hashMap26);
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        int int31 = hashMap30.size();
        system.testclass.HashMap.Entry[] entryArray32 = hashMap30.table;
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        hashMap34.modCount = 0;
        java.lang.Object obj37 = hashMap33.remove((java.lang.Object) hashMap34);
        java.lang.Object obj38 = hashMap30.remove((java.lang.Object) hashMap33);
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        int int40 = hashMap39.modCount;
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        hashMap41.modCount = 0;
        java.lang.Object obj44 = hashMap39.get((java.lang.Object) hashMap41);
        java.lang.Object obj45 = hashMap33.get((java.lang.Object) hashMap41);
        java.lang.Object obj46 = hashMap26.remove((java.lang.Object) hashMap41);
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap((int) (byte) 10);
        system.testclass.HashMap.Entry[] entryArray49 = hashMap48.table;
        java.lang.Object obj50 = hashMap26.remove((java.lang.Object) hashMap48);
        boolean boolean51 = hashMap48.isEmpty();
        system.testclass.HashMap hashMap53 = new system.testclass.HashMap(10);
        java.lang.Object obj55 = hashMap53.remove((java.lang.Object) (short) 0);
        int int56 = hashMap53.modCount;
        system.testclass.HashMap hashMap57 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap58 = new system.testclass.HashMap();
        hashMap58.modCount = 0;
        java.lang.Object obj61 = hashMap57.remove((java.lang.Object) hashMap58);
        system.testclass.HashMap hashMap63 = new system.testclass.HashMap(10);
        system.testclass.HashMap hashMap64 = new system.testclass.HashMap();
        int int65 = hashMap64.size();
        system.testclass.HashMap.Entry[] entryArray66 = hashMap64.table;
        hashMap63.table = entryArray66;
        java.lang.Class<?> wildcardClass68 = hashMap63.getClass();
        java.lang.Object obj69 = hashMap58.remove((java.lang.Object) hashMap63);
        system.testclass.HashMap.Entry[] entryArray70 = hashMap58.table;
        hashMap53.table = entryArray70;
        int int72 = hashMap53.size();
        java.lang.Class<?> wildcardClass73 = hashMap53.getClass();
        java.lang.Object obj74 = hashMap2.put((java.lang.Object) hashMap48, (java.lang.Object) hashMap53);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        hashMap2.modCount = 0;
        java.lang.Object obj5 = hashMap0.get((java.lang.Object) hashMap2);
        int int6 = hashMap2.modCount;
        system.testclass.HashMap.Entry[] entryArray7 = hashMap2.table;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        hashMap9.modCount = 0;
        java.lang.Object obj12 = hashMap8.remove((java.lang.Object) hashMap9);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap(10);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.size();
        system.testclass.HashMap.Entry[] entryArray17 = hashMap15.table;
        hashMap14.table = entryArray17;
        java.lang.Class<?> wildcardClass19 = hashMap14.getClass();
        java.lang.Object obj20 = hashMap9.remove((java.lang.Object) hashMap14);
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap((int) (byte) 10, 100.0f);
        java.lang.Object obj24 = hashMap2.put(obj20, (java.lang.Object) 100.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '#', (float) 'a');
        hashMap2.modCount = 'a';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(100);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        hashMap2.modCount = 0;
        java.lang.Object obj5 = null;
        java.lang.Object obj6 = hashMap2.remove(obj5);
        java.lang.Object obj8 = hashMap2.get((java.lang.Object) 10);
        system.testclass.HashMap.Entry[] entryArray9 = hashMap2.table;
        java.lang.Object obj10 = hashMap1.remove((java.lang.Object) entryArray9);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        hashMap11.modCount = 0;
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = hashMap11.remove(obj14);
        system.testclass.HashMap.Entry[] entryArray16 = hashMap11.table;
        java.lang.Object obj17 = hashMap1.remove((java.lang.Object) hashMap11);
        int int18 = hashMap11.modCount;
        int int19 = hashMap11.size();
        int int20 = hashMap11.size();
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        int int22 = hashMap21.size();
        system.testclass.HashMap.Entry[] entryArray23 = hashMap21.table;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        hashMap25.modCount = 0;
        java.lang.Object obj28 = hashMap24.remove((java.lang.Object) hashMap25);
        java.lang.Object obj29 = hashMap21.remove((java.lang.Object) hashMap24);
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        int int31 = hashMap30.modCount;
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        hashMap32.modCount = 0;
        java.lang.Object obj35 = hashMap30.get((java.lang.Object) hashMap32);
        java.lang.Object obj36 = hashMap24.get((java.lang.Object) hashMap32);
        boolean boolean37 = hashMap24.isEmpty();
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap((int) ' ', (float) '#');
        int int41 = hashMap40.modCount;
        java.lang.Object obj42 = hashMap11.put((java.lang.Object) hashMap24, (java.lang.Object) int41);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap11", hashMap11.repOK_1());
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        java.lang.Object obj3 = hashMap0.remove((java.lang.Object) 'a');
        boolean boolean4 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) ' ', (float) '#');
        int int8 = hashMap7.modCount;
        system.testclass.HashMap.Entry[] entryArray9 = hashMap7.table;
        hashMap0.table = entryArray9;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(10);
        java.lang.Object obj3 = hashMap1.remove((java.lang.Object) (short) 0);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap(10);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.size();
        system.testclass.HashMap.Entry[] entryArray8 = hashMap6.table;
        hashMap5.table = entryArray8;
        java.lang.Class<?> wildcardClass10 = hashMap5.getClass();
        java.lang.Object obj11 = hashMap1.get((java.lang.Object) wildcardClass10);
        java.lang.Object obj13 = hashMap1.remove((java.lang.Object) (-1.0f));
        hashMap1.modCount = (byte) 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap(0, (float) (short) 10);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap(0, (float) (short) 100);
        int int8 = hashMap7.modCount;
        system.testclass.HashMap.Entry[] entryArray9 = hashMap7.table;
        java.lang.Object obj10 = hashMap4.remove((java.lang.Object) entryArray9);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        int int13 = hashMap11.modCount;
        system.testclass.HashMap.Entry[] entryArray14 = hashMap11.table;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        int int18 = hashMap17.modCount;
        java.lang.Object obj19 = hashMap11.get((java.lang.Object) int18);
        int int20 = hashMap11.size();
        java.lang.Object obj21 = hashMap4.remove((java.lang.Object) hashMap11);
        java.lang.Object obj22 = hashMap0.remove((java.lang.Object) hashMap4);
        int int23 = hashMap0.modCount;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.size();
        system.testclass.HashMap.Entry[] entryArray26 = hashMap24.table;
        hashMap24.modCount = 0;
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        int int30 = hashMap29.modCount;
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        hashMap31.modCount = 0;
        java.lang.Object obj34 = null;
        java.lang.Object obj35 = hashMap31.remove(obj34);
        system.testclass.HashMap.Entry[] entryArray36 = hashMap31.table;
        hashMap29.table = entryArray36;
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        int int39 = hashMap38.size();
        system.testclass.HashMap.Entry[] entryArray40 = hashMap38.table;
        hashMap29.table = entryArray40;
        java.lang.Object obj42 = hashMap24.get((java.lang.Object) entryArray40);
        boolean boolean43 = hashMap24.isEmpty();
        java.lang.Class<?> wildcardClass44 = hashMap24.getClass();
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        int int46 = hashMap45.size();
        system.testclass.HashMap.Entry[] entryArray47 = hashMap45.table;
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap49 = new system.testclass.HashMap();
        hashMap49.modCount = 0;
        java.lang.Object obj52 = hashMap48.remove((java.lang.Object) hashMap49);
        java.lang.Object obj53 = hashMap45.remove((java.lang.Object) hashMap48);
        system.testclass.HashMap hashMap54 = new system.testclass.HashMap();
        int int55 = hashMap54.modCount;
        system.testclass.HashMap hashMap56 = new system.testclass.HashMap();
        hashMap56.modCount = 0;
        java.lang.Object obj59 = null;
        java.lang.Object obj60 = hashMap56.remove(obj59);
        system.testclass.HashMap.Entry[] entryArray61 = hashMap56.table;
        hashMap54.table = entryArray61;
        system.testclass.HashMap hashMap63 = new system.testclass.HashMap();
        int int64 = hashMap63.size();
        system.testclass.HashMap.Entry[] entryArray65 = hashMap63.table;
        hashMap54.table = entryArray65;
        hashMap48.table = entryArray65;
        system.testclass.HashMap.Entry[] entryArray68 = hashMap48.table;
        system.testclass.HashMap hashMap69 = new system.testclass.HashMap();
        hashMap69.modCount = 0;
        hashMap69.modCount = (short) 0;
        java.lang.Object obj74 = hashMap48.remove((java.lang.Object) hashMap69);
        java.lang.Object obj75 = hashMap0.put((java.lang.Object) hashMap24, (java.lang.Object) hashMap48);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(1, (float) 10L);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.size();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap3.table;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        hashMap7.modCount = 0;
        java.lang.Object obj10 = hashMap6.remove((java.lang.Object) hashMap7);
        java.lang.Object obj11 = hashMap3.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        int int13 = hashMap12.modCount;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        hashMap14.modCount = 0;
        java.lang.Object obj17 = null;
        java.lang.Object obj18 = hashMap14.remove(obj17);
        system.testclass.HashMap.Entry[] entryArray19 = hashMap14.table;
        hashMap12.table = entryArray19;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        int int22 = hashMap21.size();
        system.testclass.HashMap.Entry[] entryArray23 = hashMap21.table;
        hashMap12.table = entryArray23;
        hashMap6.table = entryArray23;
        hashMap2.table = entryArray23;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(100, (float) (short) 1);
        int int3 = hashMap2.size();
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 100, (float) '#');
        boolean boolean3 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        java.lang.Object obj6 = hashMap2.get((java.lang.Object) int5);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.size();
        system.testclass.HashMap.Entry[] entryArray9 = hashMap7.table;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        hashMap11.modCount = 0;
        java.lang.Object obj14 = hashMap10.remove((java.lang.Object) hashMap11);
        java.lang.Object obj15 = hashMap7.remove((java.lang.Object) hashMap10);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        int int17 = hashMap16.modCount;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        hashMap18.modCount = 0;
        java.lang.Object obj21 = hashMap16.get((java.lang.Object) hashMap18);
        java.lang.Object obj22 = hashMap10.get((java.lang.Object) hashMap18);
        int int23 = hashMap18.size();
        int int24 = hashMap18.size();
        java.lang.Object obj25 = hashMap2.remove((java.lang.Object) hashMap18);
        hashMap18.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap18", hashMap18.repOK_1());
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '#', (float) (short) 100);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        java.lang.Object obj4 = hashMap2.remove((java.lang.Object) hashMap3);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        hashMap5.modCount = 0;
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = hashMap5.remove(obj8);
        java.lang.Object obj11 = hashMap5.get((java.lang.Object) 10);
        int int12 = hashMap5.modCount;
        java.lang.Object obj13 = hashMap3.get((java.lang.Object) hashMap5);
        hashMap5.modCount = (short) 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap5", hashMap5.repOK_1());
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '#', (float) 'a');
        int int3 = hashMap2.modCount;
        system.testclass.HashMap.Entry[] entryArray4 = hashMap2.table;
        system.testclass.HashMap.Entry[] entryArray5 = hashMap2.table;
        int int6 = hashMap2.size();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        hashMap8.modCount = 0;
        java.lang.Object obj11 = hashMap7.remove((java.lang.Object) hashMap8);
        java.lang.Object obj13 = hashMap7.remove((java.lang.Object) 100.0f);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap(100);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        hashMap16.modCount = 0;
        java.lang.Object obj19 = null;
        java.lang.Object obj20 = hashMap16.remove(obj19);
        java.lang.Object obj22 = hashMap16.get((java.lang.Object) 10);
        system.testclass.HashMap.Entry[] entryArray23 = hashMap16.table;
        java.lang.Object obj24 = hashMap15.remove((java.lang.Object) entryArray23);
        java.lang.Object obj25 = hashMap2.put((java.lang.Object) hashMap7, obj24);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 1, (float) ' ');
        int int3 = hashMap2.size();
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 100);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap(10);
        java.lang.Object obj5 = hashMap3.remove((java.lang.Object) (short) 0);
        int int6 = hashMap3.size();
        system.testclass.HashMap.Entry[] entryArray7 = hashMap3.table;
        java.lang.Object obj8 = hashMap1.get((java.lang.Object) hashMap3);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap((int) (byte) 100, (float) '#');
        java.lang.Class<?> wildcardClass12 = hashMap11.getClass();
        java.lang.Object obj13 = hashMap1.remove((java.lang.Object) hashMap11);
        hashMap1.modCount = '#';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(10);
        java.lang.Object obj3 = hashMap1.remove((java.lang.Object) (short) 0);
        system.testclass.HashMap.Entry[] entryArray4 = hashMap1.table;
        java.lang.Object obj5 = null;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        hashMap7.modCount = 0;
        java.lang.Object obj10 = hashMap6.remove((java.lang.Object) hashMap7);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap(10);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.size();
        system.testclass.HashMap.Entry[] entryArray15 = hashMap13.table;
        hashMap12.table = entryArray15;
        java.lang.Class<?> wildcardClass17 = hashMap12.getClass();
        java.lang.Object obj18 = hashMap7.remove((java.lang.Object) hashMap12);
        java.lang.Object obj19 = hashMap1.put(obj5, (java.lang.Object) hashMap7);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 100);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap(0, (float) (short) 100);
        boolean boolean5 = hashMap4.isEmpty();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.size();
        int int8 = hashMap6.modCount;
        boolean boolean9 = hashMap6.isEmpty();
        java.lang.Object obj10 = hashMap4.remove((java.lang.Object) hashMap6);
        java.lang.Object obj11 = hashMap1.get(obj10);
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(10);
        int int2 = hashMap1.size();
        boolean boolean3 = hashMap1.isEmpty();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.size();
        system.testclass.HashMap.Entry[] entryArray6 = hashMap4.table;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        hashMap8.modCount = 0;
        java.lang.Object obj11 = hashMap7.remove((java.lang.Object) hashMap8);
        java.lang.Object obj12 = hashMap4.remove((java.lang.Object) hashMap7);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        hashMap15.modCount = 0;
        java.lang.Object obj18 = hashMap13.get((java.lang.Object) hashMap15);
        java.lang.Object obj19 = hashMap7.get((java.lang.Object) hashMap15);
        int int20 = hashMap15.size();
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        hashMap21.modCount = 0;
        java.lang.Object obj24 = null;
        java.lang.Object obj25 = hashMap21.remove(obj24);
        java.lang.Object obj27 = hashMap21.get((java.lang.Object) 10);
        system.testclass.HashMap.Entry[] entryArray28 = hashMap21.table;
        hashMap15.table = entryArray28;
        hashMap1.table = entryArray28;
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        hashMap31.modCount = 0;
        java.lang.Object obj34 = null;
        java.lang.Object obj35 = hashMap31.remove(obj34);
        java.lang.Object obj37 = hashMap31.get((java.lang.Object) 10);
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        hashMap38.modCount = 0;
        java.lang.Object obj41 = null;
        java.lang.Object obj42 = hashMap38.remove(obj41);
        system.testclass.HashMap.Entry[] entryArray43 = hashMap38.table;
        hashMap31.table = entryArray43;
        hashMap1.table = entryArray43;
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap((int) '#');
        system.testclass.HashMap hashMap50 = new system.testclass.HashMap((int) '4', (float) (byte) 1);
        int int51 = hashMap50.size();
        java.lang.Class<?> wildcardClass52 = hashMap50.getClass();
        java.lang.Object obj53 = hashMap47.remove((java.lang.Object) hashMap50);
        system.testclass.HashMap hashMap55 = new system.testclass.HashMap(10);
        int int56 = hashMap55.size();
        int int57 = hashMap55.size();
        java.lang.Object obj58 = hashMap1.put(obj53, (java.lang.Object) hashMap55);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.size();
        int int2 = hashMap0.size();
        int int3 = hashMap0.modCount;
        int int4 = hashMap0.size();
        hashMap0.modCount = (byte) 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(100);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        hashMap2.modCount = 0;
        java.lang.Object obj5 = null;
        java.lang.Object obj6 = hashMap2.remove(obj5);
        java.lang.Object obj8 = hashMap2.get((java.lang.Object) 10);
        system.testclass.HashMap.Entry[] entryArray9 = hashMap2.table;
        java.lang.Object obj10 = hashMap1.remove((java.lang.Object) entryArray9);
        boolean boolean11 = hashMap1.isEmpty();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        int int17 = hashMap15.modCount;
        system.testclass.HashMap.Entry[] entryArray18 = hashMap15.table;
        java.lang.Object obj19 = hashMap14.remove((java.lang.Object) entryArray18);
        hashMap1.table = entryArray18;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) ' ', (float) '#');
        int int3 = hashMap2.modCount;
        java.lang.Object obj5 = hashMap2.get((java.lang.Object) ' ');
        boolean boolean6 = hashMap2.isEmpty();
        boolean boolean7 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap(10);
        int int10 = hashMap9.size();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        int int13 = hashMap11.modCount;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.size();
        system.testclass.HashMap.Entry[] entryArray16 = hashMap14.table;
        hashMap14.modCount = 0;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        int int20 = hashMap19.modCount;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        hashMap21.modCount = 0;
        java.lang.Object obj24 = null;
        java.lang.Object obj25 = hashMap21.remove(obj24);
        system.testclass.HashMap.Entry[] entryArray26 = hashMap21.table;
        hashMap19.table = entryArray26;
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        int int29 = hashMap28.size();
        system.testclass.HashMap.Entry[] entryArray30 = hashMap28.table;
        hashMap19.table = entryArray30;
        java.lang.Object obj32 = hashMap14.get((java.lang.Object) entryArray30);
        hashMap11.table = entryArray30;
        hashMap9.table = entryArray30;
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap((int) ' ', (float) (byte) 100);
        boolean boolean38 = hashMap37.isEmpty();
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        int int40 = hashMap39.modCount;
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        hashMap41.modCount = 0;
        java.lang.Object obj44 = hashMap39.get((java.lang.Object) hashMap41);
        java.lang.Object obj45 = hashMap37.get((java.lang.Object) hashMap39);
        system.testclass.HashMap hashMap46 = new system.testclass.HashMap();
        int int47 = hashMap46.size();
        system.testclass.HashMap.Entry[] entryArray48 = hashMap46.table;
        hashMap46.modCount = 0;
        system.testclass.HashMap hashMap51 = new system.testclass.HashMap();
        int int52 = hashMap51.modCount;
        system.testclass.HashMap hashMap53 = new system.testclass.HashMap();
        hashMap53.modCount = 0;
        java.lang.Object obj56 = null;
        java.lang.Object obj57 = hashMap53.remove(obj56);
        system.testclass.HashMap.Entry[] entryArray58 = hashMap53.table;
        hashMap51.table = entryArray58;
        system.testclass.HashMap hashMap60 = new system.testclass.HashMap();
        int int61 = hashMap60.size();
        system.testclass.HashMap.Entry[] entryArray62 = hashMap60.table;
        hashMap51.table = entryArray62;
        java.lang.Object obj64 = hashMap46.get((java.lang.Object) entryArray62);
        hashMap39.table = entryArray62;
        hashMap9.table = entryArray62;
        hashMap2.table = entryArray62;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap();
        hashMap1.modCount = 0;
        java.lang.Object obj4 = hashMap0.remove((java.lang.Object) hashMap1);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.size();
        system.testclass.HashMap.Entry[] entryArray7 = hashMap5.table;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        hashMap9.modCount = 0;
        java.lang.Object obj12 = hashMap8.remove((java.lang.Object) hashMap9);
        java.lang.Object obj13 = hashMap5.remove((java.lang.Object) hashMap8);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.modCount;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        hashMap16.modCount = 0;
        java.lang.Object obj19 = hashMap14.get((java.lang.Object) hashMap16);
        java.lang.Object obj20 = hashMap8.get((java.lang.Object) hashMap16);
        java.lang.Object obj21 = hashMap1.remove((java.lang.Object) hashMap16);
        system.testclass.HashMap.Entry[] entryArray22 = hashMap16.table;
        system.testclass.HashMap.Entry[] entryArray23 = hashMap16.table;
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap(0, (float) (short) 100);
        boolean boolean27 = hashMap26.isEmpty();
        int int28 = hashMap26.size();
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        int int30 = hashMap29.size();
        system.testclass.HashMap.Entry[] entryArray31 = hashMap29.table;
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        hashMap33.modCount = 0;
        java.lang.Object obj36 = hashMap32.remove((java.lang.Object) hashMap33);
        java.lang.Object obj37 = hashMap29.remove((java.lang.Object) hashMap32);
        java.lang.Object obj38 = hashMap26.get(obj37);
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap((int) '#', (float) (short) 100);
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap();
        java.lang.Object obj43 = hashMap41.remove((java.lang.Object) hashMap42);
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap();
        hashMap44.modCount = 0;
        java.lang.Object obj47 = null;
        java.lang.Object obj48 = hashMap44.remove(obj47);
        java.lang.Object obj50 = hashMap44.get((java.lang.Object) 10);
        int int51 = hashMap44.modCount;
        java.lang.Object obj52 = hashMap42.get((java.lang.Object) hashMap44);
        system.testclass.HashMap hashMap53 = new system.testclass.HashMap();
        int int54 = hashMap53.size();
        system.testclass.HashMap.Entry[] entryArray55 = hashMap53.table;
        system.testclass.HashMap hashMap56 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap57 = new system.testclass.HashMap();
        hashMap57.modCount = 0;
        java.lang.Object obj60 = hashMap56.remove((java.lang.Object) hashMap57);
        java.lang.Object obj61 = hashMap53.remove((java.lang.Object) hashMap56);
        system.testclass.HashMap hashMap64 = new system.testclass.HashMap((int) ' ', (float) '#');
        int int65 = hashMap64.modCount;
        java.lang.Object obj67 = hashMap64.get((java.lang.Object) ' ');
        java.lang.Object obj68 = hashMap56.remove(obj67);
        system.testclass.HashMap.Entry[] entryArray69 = hashMap56.table;
        hashMap44.table = entryArray69;
        java.lang.Object obj71 = hashMap16.put(obj37, (java.lang.Object) hashMap44);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap16", hashMap16.repOK_1());
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 10, (float) 100L);
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = hashMap0.remove(obj3);
        java.lang.Object obj6 = hashMap0.get((java.lang.Object) 10);
        boolean boolean7 = hashMap0.isEmpty();
        int int8 = hashMap0.size();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        hashMap9.modCount = 0;
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = hashMap9.remove(obj12);
        system.testclass.HashMap.Entry[] entryArray14 = hashMap9.table;
        hashMap0.table = entryArray14;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap((int) '#');
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap((int) '4', (float) (byte) 1);
        int int23 = hashMap22.size();
        java.lang.Class<?> wildcardClass24 = hashMap22.getClass();
        java.lang.Object obj25 = hashMap19.remove((java.lang.Object) hashMap22);
        java.lang.Object obj26 = hashMap0.put((java.lang.Object) (short) 10, obj25);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        hashMap2.modCount = 'a';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) 1.0f);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.size();
        system.testclass.HashMap.Entry[] entryArray6 = hashMap4.table;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        hashMap8.modCount = 0;
        java.lang.Object obj11 = hashMap7.remove((java.lang.Object) hashMap8);
        java.lang.Object obj12 = hashMap4.remove((java.lang.Object) hashMap7);
        java.lang.Class<?> wildcardClass13 = hashMap4.getClass();
        java.lang.Object obj14 = hashMap0.remove((java.lang.Object) wildcardClass13);
        int int15 = hashMap0.modCount;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap(10);
        int int18 = hashMap17.size();
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap((int) ' ', (float) (byte) 100);
        boolean boolean22 = hashMap21.isEmpty();
        int int23 = hashMap21.modCount;
        java.lang.Object obj24 = hashMap17.remove((java.lang.Object) hashMap21);
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap(10);
        int int27 = hashMap26.size();
        boolean boolean28 = hashMap26.isEmpty();
        java.lang.Object obj29 = hashMap0.put((java.lang.Object) hashMap17, (java.lang.Object) boolean28);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap();
        hashMap1.modCount = 0;
        java.lang.Object obj4 = hashMap0.remove((java.lang.Object) hashMap1);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        hashMap7.modCount = 0;
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = hashMap7.remove(obj10);
        system.testclass.HashMap.Entry[] entryArray12 = hashMap7.table;
        hashMap5.table = entryArray12;
        hashMap0.table = entryArray12;
        hashMap0.modCount = (byte) 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray2 = hashMap0.table;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        hashMap4.modCount = 0;
        java.lang.Object obj7 = hashMap3.remove((java.lang.Object) hashMap4);
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) hashMap3);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        hashMap11.modCount = 0;
        java.lang.Object obj14 = hashMap9.get((java.lang.Object) hashMap11);
        java.lang.Object obj15 = hashMap3.get((java.lang.Object) hashMap11);
        int int16 = hashMap11.size();
        int int17 = hashMap11.size();
        hashMap11.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap11", hashMap11.repOK_1());
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(1, (float) (byte) 1);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        hashMap4.modCount = 0;
        java.lang.Object obj7 = hashMap3.remove((java.lang.Object) hashMap4);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.size();
        system.testclass.HashMap.Entry[] entryArray10 = hashMap8.table;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        hashMap12.modCount = 0;
        java.lang.Object obj15 = hashMap11.remove((java.lang.Object) hashMap12);
        java.lang.Object obj16 = hashMap8.remove((java.lang.Object) hashMap11);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        int int18 = hashMap17.modCount;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        hashMap19.modCount = 0;
        java.lang.Object obj22 = hashMap17.get((java.lang.Object) hashMap19);
        java.lang.Object obj23 = hashMap11.get((java.lang.Object) hashMap19);
        java.lang.Object obj24 = hashMap4.remove((java.lang.Object) hashMap19);
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Class<?> wildcardClass28 = hashMap27.getClass();
        java.lang.Object obj29 = hashMap2.put((java.lang.Object) hashMap19, (java.lang.Object) wildcardClass28);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = hashMap0.remove(obj3);
        java.lang.Object obj6 = hashMap0.get((java.lang.Object) 10);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        hashMap7.modCount = 0;
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = hashMap7.remove(obj10);
        system.testclass.HashMap.Entry[] entryArray12 = hashMap7.table;
        hashMap0.table = entryArray12;
        hashMap0.modCount = (short) 0;
        hashMap0.modCount = (byte) 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(10);
        java.lang.Object obj3 = hashMap1.remove((java.lang.Object) (short) 0);
        int int4 = hashMap1.size();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap1.table;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap(0, (float) 1);
        system.testclass.HashMap.Entry[] entryArray9 = hashMap8.table;
        hashMap1.table = entryArray9;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) 'a', (float) (byte) 1);
        int int3 = hashMap2.modCount;
        int int4 = hashMap2.modCount;
        int int5 = hashMap2.modCount;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        hashMap6.modCount = 0;
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = hashMap6.remove(obj9);
        java.lang.Object obj12 = hashMap6.get((java.lang.Object) 10);
        int int13 = hashMap6.modCount;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap(0, (float) (short) 10);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap(0, (float) (short) 100);
        int int20 = hashMap19.modCount;
        system.testclass.HashMap.Entry[] entryArray21 = hashMap19.table;
        java.lang.Object obj22 = hashMap16.remove((java.lang.Object) entryArray21);
        java.lang.Object obj23 = hashMap6.remove((java.lang.Object) hashMap16);
        java.lang.Object obj24 = hashMap2.get((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        int int26 = hashMap25.modCount;
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        hashMap27.modCount = 0;
        java.lang.Object obj30 = null;
        java.lang.Object obj31 = hashMap27.remove(obj30);
        system.testclass.HashMap.Entry[] entryArray32 = hashMap27.table;
        hashMap25.table = entryArray32;
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        int int35 = hashMap34.size();
        system.testclass.HashMap.Entry[] entryArray36 = hashMap34.table;
        hashMap25.table = entryArray36;
        hashMap2.table = entryArray36;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        boolean boolean3 = hashMap0.isEmpty();
        int int4 = hashMap0.modCount;
        hashMap0.modCount = 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (short) 100);
        boolean boolean3 = hashMap2.isEmpty();
        int int4 = hashMap2.size();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap(10);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.size();
        system.testclass.HashMap.Entry[] entryArray9 = hashMap7.table;
        hashMap6.table = entryArray9;
        java.lang.Object obj11 = hashMap2.remove((java.lang.Object) entryArray9);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap(0, (float) (short) 10);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap((int) ' ', (float) '#');
        int int18 = hashMap17.modCount;
        java.lang.Object obj20 = hashMap17.get((java.lang.Object) ' ');
        java.lang.Object obj21 = hashMap14.get((java.lang.Object) ' ');
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        boolean boolean23 = hashMap22.isEmpty();
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.size();
        system.testclass.HashMap.Entry[] entryArray26 = hashMap24.table;
        hashMap24.modCount = 0;
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        int int30 = hashMap29.modCount;
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        hashMap31.modCount = 0;
        java.lang.Object obj34 = null;
        java.lang.Object obj35 = hashMap31.remove(obj34);
        system.testclass.HashMap.Entry[] entryArray36 = hashMap31.table;
        hashMap29.table = entryArray36;
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        int int39 = hashMap38.size();
        system.testclass.HashMap.Entry[] entryArray40 = hashMap38.table;
        hashMap29.table = entryArray40;
        java.lang.Object obj42 = hashMap24.get((java.lang.Object) entryArray40);
        java.lang.Object obj43 = hashMap22.get(obj42);
        java.lang.Object obj44 = hashMap14.remove((java.lang.Object) hashMap22);
        java.lang.Object obj45 = hashMap2.remove((java.lang.Object) hashMap14);
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap(10);
        java.lang.Object obj49 = hashMap47.remove((java.lang.Object) (short) 0);
        int int50 = hashMap47.modCount;
        system.testclass.HashMap.Entry[] entryArray51 = hashMap47.table;
        hashMap2.table = entryArray51;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray2 = hashMap0.table;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        hashMap4.modCount = 0;
        java.lang.Object obj7 = hashMap3.remove((java.lang.Object) hashMap4);
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) hashMap3);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        hashMap11.modCount = 0;
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = hashMap11.remove(obj14);
        system.testclass.HashMap.Entry[] entryArray16 = hashMap11.table;
        hashMap9.table = entryArray16;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        int int19 = hashMap18.size();
        system.testclass.HashMap.Entry[] entryArray20 = hashMap18.table;
        hashMap9.table = entryArray20;
        hashMap3.table = entryArray20;
        system.testclass.HashMap.Entry[] entryArray23 = hashMap3.table;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        hashMap24.modCount = 0;
        hashMap24.modCount = (short) 0;
        java.lang.Object obj29 = hashMap3.remove((java.lang.Object) hashMap24);
        hashMap24.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap24", hashMap24.repOK_1());
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray2 = hashMap0.table;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        hashMap4.modCount = 0;
        java.lang.Object obj7 = hashMap3.remove((java.lang.Object) hashMap4);
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) hashMap3);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        hashMap11.modCount = 0;
        java.lang.Object obj14 = hashMap9.get((java.lang.Object) hashMap11);
        java.lang.Object obj15 = hashMap3.get((java.lang.Object) hashMap11);
        int int16 = hashMap3.size();
        hashMap3.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap3", hashMap3.repOK_1());
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        hashMap5.modCount = 0;
        java.lang.Object obj8 = hashMap3.get((java.lang.Object) hashMap5);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        int int13 = hashMap12.size();
        system.testclass.HashMap.Entry[] entryArray14 = hashMap12.table;
        java.lang.Object obj15 = hashMap11.remove((java.lang.Object) entryArray14);
        java.lang.Object obj16 = hashMap5.get((java.lang.Object) hashMap11);
        system.testclass.HashMap.Entry[] entryArray17 = hashMap11.table;
        hashMap0.table = entryArray17;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 100, (float) '#');
        boolean boolean3 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.size();
        int int6 = hashMap4.modCount;
        system.testclass.HashMap.Entry[] entryArray7 = hashMap4.table;
        hashMap2.table = entryArray7;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = hashMap0.remove(obj3);
        java.lang.Object obj6 = hashMap0.get((java.lang.Object) 10);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        hashMap7.modCount = 0;
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = hashMap7.remove(obj10);
        system.testclass.HashMap.Entry[] entryArray12 = hashMap7.table;
        hashMap0.table = entryArray12;
        hashMap0.modCount = (short) 0;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.size();
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        hashMap0.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = hashMap0.remove(obj3);
        java.lang.Object obj6 = hashMap0.get((java.lang.Object) 10);
        int int7 = hashMap0.modCount;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap(10);
        int int10 = hashMap9.size();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        int int13 = hashMap11.modCount;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.size();
        system.testclass.HashMap.Entry[] entryArray16 = hashMap14.table;
        hashMap14.modCount = 0;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        int int20 = hashMap19.modCount;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        hashMap21.modCount = 0;
        java.lang.Object obj24 = null;
        java.lang.Object obj25 = hashMap21.remove(obj24);
        system.testclass.HashMap.Entry[] entryArray26 = hashMap21.table;
        hashMap19.table = entryArray26;
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        int int29 = hashMap28.size();
        system.testclass.HashMap.Entry[] entryArray30 = hashMap28.table;
        hashMap19.table = entryArray30;
        java.lang.Object obj32 = hashMap14.get((java.lang.Object) entryArray30);
        hashMap11.table = entryArray30;
        hashMap9.table = entryArray30;
        java.lang.Object obj36 = hashMap0.put((java.lang.Object) hashMap9, (java.lang.Object) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap.Entry[] entryArray2 = hashMap1.table;
        boolean boolean3 = hashMap1.isEmpty();
        hashMap1.modCount = (short) 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap(0, (float) (short) 10);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap(0, (float) (short) 100);
        int int8 = hashMap7.modCount;
        system.testclass.HashMap.Entry[] entryArray9 = hashMap7.table;
        java.lang.Object obj10 = hashMap4.remove((java.lang.Object) entryArray9);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        int int13 = hashMap11.modCount;
        system.testclass.HashMap.Entry[] entryArray14 = hashMap11.table;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        int int18 = hashMap17.modCount;
        java.lang.Object obj19 = hashMap11.get((java.lang.Object) int18);
        int int20 = hashMap11.size();
        java.lang.Object obj21 = hashMap4.remove((java.lang.Object) hashMap11);
        java.lang.Object obj22 = hashMap0.remove((java.lang.Object) hashMap4);
        int int23 = hashMap0.modCount;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.modCount;
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        hashMap26.modCount = 0;
        java.lang.Object obj29 = hashMap24.get((java.lang.Object) hashMap26);
        int int30 = hashMap26.size();
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap((int) (byte) 10);
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        hashMap33.modCount = 0;
        java.lang.Object obj36 = null;
        java.lang.Object obj37 = hashMap33.remove(obj36);
        system.testclass.HashMap.Entry[] entryArray38 = hashMap33.table;
        hashMap32.table = entryArray38;
        hashMap26.table = entryArray38;
        system.testclass.HashMap.Entry[] entryArray41 = hashMap26.table;
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap(10);
        java.lang.Object obj45 = hashMap43.remove((java.lang.Object) (short) 0);
        system.testclass.HashMap.Entry[] entryArray46 = hashMap43.table;
        java.lang.Class<?> wildcardClass47 = entryArray46.getClass();
        java.lang.Object obj48 = hashMap0.put((java.lang.Object) entryArray41, (java.lang.Object) wildcardClass47);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (short) 10);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) ' ', (float) '#');
        int int6 = hashMap5.modCount;
        java.lang.Object obj8 = hashMap5.get((java.lang.Object) ' ');
        java.lang.Object obj9 = hashMap2.get((java.lang.Object) ' ');
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        int int13 = hashMap12.size();
        system.testclass.HashMap.Entry[] entryArray14 = hashMap12.table;
        hashMap12.modCount = 0;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        int int18 = hashMap17.modCount;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        hashMap19.modCount = 0;
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = hashMap19.remove(obj22);
        system.testclass.HashMap.Entry[] entryArray24 = hashMap19.table;
        hashMap17.table = entryArray24;
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        int int27 = hashMap26.size();
        system.testclass.HashMap.Entry[] entryArray28 = hashMap26.table;
        hashMap17.table = entryArray28;
        java.lang.Object obj30 = hashMap12.get((java.lang.Object) entryArray28);
        java.lang.Object obj31 = hashMap10.get(obj30);
        java.lang.Object obj32 = hashMap2.remove((java.lang.Object) hashMap10);
        hashMap10.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap10", hashMap10.repOK_1());
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray2 = hashMap0.table;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        hashMap4.modCount = 0;
        java.lang.Object obj7 = hashMap3.remove((java.lang.Object) hashMap4);
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) hashMap3);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        hashMap11.modCount = 0;
        java.lang.Object obj14 = hashMap9.get((java.lang.Object) hashMap11);
        java.lang.Object obj15 = hashMap3.get((java.lang.Object) hashMap11);
        boolean boolean16 = hashMap3.isEmpty();
        hashMap3.modCount = (short) 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap3", hashMap3.repOK_1());
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.size();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap3.table;
        java.lang.Object obj6 = hashMap2.remove((java.lang.Object) entryArray5);
        int int7 = hashMap2.size();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.modCount;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        hashMap10.modCount = 0;
        java.lang.Object obj13 = hashMap8.get((java.lang.Object) hashMap10);
        int int14 = hashMap10.size();
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap(100);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        hashMap17.modCount = 0;
        java.lang.Object obj20 = null;
        java.lang.Object obj21 = hashMap17.remove(obj20);
        java.lang.Object obj23 = hashMap17.get((java.lang.Object) 10);
        system.testclass.HashMap.Entry[] entryArray24 = hashMap17.table;
        java.lang.Object obj25 = hashMap16.remove((java.lang.Object) entryArray24);
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        hashMap26.modCount = 0;
        java.lang.Object obj29 = null;
        java.lang.Object obj30 = hashMap26.remove(obj29);
        system.testclass.HashMap.Entry[] entryArray31 = hashMap26.table;
        java.lang.Object obj32 = hashMap16.remove((java.lang.Object) hashMap26);
        hashMap26.modCount = (byte) 0;
        system.testclass.HashMap.Entry[] entryArray35 = hashMap26.table;
        java.lang.Object obj36 = hashMap2.put((java.lang.Object) hashMap10, (java.lang.Object) entryArray35);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = hashMap0.remove(obj3);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) ' ', (float) (byte) 100);
        boolean boolean8 = hashMap7.isEmpty();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        hashMap11.modCount = 0;
        java.lang.Object obj14 = hashMap9.get((java.lang.Object) hashMap11);
        java.lang.Object obj15 = hashMap7.get((java.lang.Object) hashMap9);
        system.testclass.HashMap.Entry[] entryArray16 = hashMap9.table;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap((int) (short) 1, (float) '#');
        java.lang.Object obj20 = hashMap0.put((java.lang.Object) entryArray16, (java.lang.Object) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '#', (float) 'a');
        int int3 = hashMap2.modCount;
        system.testclass.HashMap.Entry[] entryArray4 = hashMap2.table;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.size();
        system.testclass.HashMap.Entry[] entryArray7 = hashMap5.table;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        hashMap9.modCount = 0;
        java.lang.Object obj12 = hashMap8.remove((java.lang.Object) hashMap9);
        java.lang.Object obj13 = hashMap5.remove((java.lang.Object) hashMap8);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap(0, (float) (short) 100);
        boolean boolean17 = hashMap16.isEmpty();
        int int18 = hashMap16.size();
        int int19 = hashMap16.size();
        system.testclass.HashMap.Entry[] entryArray20 = hashMap16.table;
        java.lang.Object obj21 = hashMap5.get((java.lang.Object) hashMap16);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        int int23 = hashMap22.size();
        system.testclass.HashMap.Entry[] entryArray24 = hashMap22.table;
        system.testclass.HashMap.Entry[] entryArray25 = hashMap22.table;
        system.testclass.HashMap.Entry[] entryArray26 = hashMap22.table;
        java.lang.Object obj27 = hashMap2.put((java.lang.Object) hashMap16, (java.lang.Object) hashMap22);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray2 = hashMap0.table;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        hashMap4.modCount = 0;
        java.lang.Object obj7 = hashMap3.remove((java.lang.Object) hashMap4);
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) hashMap3);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.size();
        system.testclass.HashMap.Entry[] entryArray11 = hashMap9.table;
        hashMap9.modCount = 0;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.modCount;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        hashMap16.modCount = 0;
        java.lang.Object obj19 = null;
        java.lang.Object obj20 = hashMap16.remove(obj19);
        system.testclass.HashMap.Entry[] entryArray21 = hashMap16.table;
        hashMap14.table = entryArray21;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        int int24 = hashMap23.size();
        system.testclass.HashMap.Entry[] entryArray25 = hashMap23.table;
        hashMap14.table = entryArray25;
        java.lang.Object obj27 = hashMap9.get((java.lang.Object) entryArray25);
        boolean boolean28 = hashMap9.isEmpty();
        java.lang.Class<?> wildcardClass29 = hashMap9.getClass();
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap((int) ' ', (float) (byte) 100);
        boolean boolean33 = hashMap32.isEmpty();
        int int34 = hashMap32.modCount;
        java.lang.Object obj35 = hashMap3.put((java.lang.Object) hashMap9, (java.lang.Object) int34);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap3", hashMap3.repOK_1());
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        system.testclass.HashMap.Entry[] entryArray6 = hashMap3.table;
        java.lang.Class<?> wildcardClass7 = entryArray6.getClass();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.size();
        system.testclass.HashMap.Entry[] entryArray10 = hashMap8.table;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        hashMap12.modCount = 0;
        java.lang.Object obj15 = hashMap11.remove((java.lang.Object) hashMap12);
        java.lang.Object obj16 = hashMap8.remove((java.lang.Object) hashMap11);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        int int18 = hashMap17.modCount;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        hashMap19.modCount = 0;
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = hashMap19.remove(obj22);
        system.testclass.HashMap.Entry[] entryArray24 = hashMap19.table;
        hashMap17.table = entryArray24;
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        int int27 = hashMap26.size();
        system.testclass.HashMap.Entry[] entryArray28 = hashMap26.table;
        hashMap17.table = entryArray28;
        hashMap11.table = entryArray28;
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap(0, (float) (short) 10);
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap(0, (float) (short) 100);
        int int37 = hashMap36.modCount;
        system.testclass.HashMap.Entry[] entryArray38 = hashMap36.table;
        java.lang.Object obj39 = hashMap33.remove((java.lang.Object) entryArray38);
        java.lang.Object obj40 = hashMap11.get(obj39);
        system.testclass.HashMap.Entry[] entryArray41 = hashMap11.table;
        java.lang.Object obj42 = hashMap2.put((java.lang.Object) entryArray6, (java.lang.Object) hashMap11);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray2 = hashMap0.table;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        hashMap4.modCount = 0;
        java.lang.Object obj7 = hashMap3.remove((java.lang.Object) hashMap4);
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) hashMap3);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        hashMap11.modCount = 0;
        java.lang.Object obj14 = hashMap9.get((java.lang.Object) hashMap11);
        java.lang.Object obj15 = hashMap3.get((java.lang.Object) hashMap11);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap((int) '#', (float) 'a');
        int int19 = hashMap18.modCount;
        system.testclass.HashMap.Entry[] entryArray20 = hashMap18.table;
        hashMap3.table = entryArray20;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap3", hashMap3.repOK_1());
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 10);
        system.testclass.HashMap.Entry[] entryArray2 = hashMap1.table;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) (byte) 100, (float) '#');
        int int6 = hashMap5.size();
        java.lang.Object obj7 = hashMap1.remove((java.lang.Object) int6);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap(10, (float) (short) 10);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.size();
        int int13 = hashMap11.modCount;
        boolean boolean14 = hashMap11.isEmpty();
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap((int) '4', 10.0f);
        java.lang.Object obj18 = hashMap11.remove((java.lang.Object) 10.0f);
        java.lang.Object obj19 = hashMap1.put((java.lang.Object) 10, obj18);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int3 = hashMap2.size();
        hashMap2.modCount = 'a';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 100, (float) (byte) 100);
        int int3 = hashMap2.modCount;
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(10);
        java.lang.Object obj3 = hashMap1.remove((java.lang.Object) (short) 0);
        int int4 = hashMap1.modCount;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap(10);
        int int7 = hashMap6.size();
        boolean boolean8 = hashMap6.isEmpty();
        java.lang.Object obj9 = hashMap1.remove((java.lang.Object) hashMap6);
        hashMap6.modCount = 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap6", hashMap6.repOK_1());
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) ' ', (float) (short) 10);
        hashMap2.modCount = ' ';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) ' ');
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap((int) (byte) 100, (float) '#');
        boolean boolean5 = hashMap4.isEmpty();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.modCount;
        java.lang.Object obj8 = hashMap4.get((java.lang.Object) int7);
        system.testclass.HashMap.Entry[] entryArray9 = hashMap4.table;
        hashMap1.table = entryArray9;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        boolean boolean3 = hashMap0.isEmpty();
        int int4 = hashMap0.modCount;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) ' ', (float) (byte) 100);
        boolean boolean6 = hashMap5.isEmpty();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        hashMap9.modCount = 0;
        java.lang.Object obj12 = hashMap7.get((java.lang.Object) hashMap9);
        java.lang.Object obj13 = hashMap5.get((java.lang.Object) hashMap7);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.size();
        system.testclass.HashMap.Entry[] entryArray16 = hashMap14.table;
        hashMap14.modCount = 0;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        int int20 = hashMap19.modCount;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        hashMap21.modCount = 0;
        java.lang.Object obj24 = null;
        java.lang.Object obj25 = hashMap21.remove(obj24);
        system.testclass.HashMap.Entry[] entryArray26 = hashMap21.table;
        hashMap19.table = entryArray26;
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        int int29 = hashMap28.size();
        system.testclass.HashMap.Entry[] entryArray30 = hashMap28.table;
        hashMap19.table = entryArray30;
        java.lang.Object obj32 = hashMap14.get((java.lang.Object) entryArray30);
        hashMap7.table = entryArray30;
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap(100);
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        hashMap36.modCount = 0;
        java.lang.Object obj39 = null;
        java.lang.Object obj40 = hashMap36.remove(obj39);
        java.lang.Object obj42 = hashMap36.get((java.lang.Object) 10);
        system.testclass.HashMap.Entry[] entryArray43 = hashMap36.table;
        java.lang.Object obj44 = hashMap35.remove((java.lang.Object) entryArray43);
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        hashMap45.modCount = 0;
        java.lang.Object obj48 = null;
        java.lang.Object obj49 = hashMap45.remove(obj48);
        system.testclass.HashMap.Entry[] entryArray50 = hashMap45.table;
        java.lang.Object obj51 = hashMap35.remove((java.lang.Object) hashMap45);
        int int52 = hashMap45.modCount;
        java.lang.Object obj53 = hashMap0.put((java.lang.Object) entryArray30, (java.lang.Object) hashMap45);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 100);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        hashMap2.modCount = 0;
        java.lang.Object obj5 = null;
        java.lang.Object obj6 = hashMap2.remove(obj5);
        java.lang.Object obj8 = hashMap2.get((java.lang.Object) 10);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        hashMap9.modCount = 0;
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = hashMap9.remove(obj12);
        system.testclass.HashMap.Entry[] entryArray14 = hashMap9.table;
        hashMap2.table = entryArray14;
        java.lang.Object obj16 = hashMap1.get((java.lang.Object) hashMap2);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap(10);
        java.lang.Object obj20 = hashMap18.remove((java.lang.Object) (short) 0);
        system.testclass.HashMap.Entry[] entryArray21 = hashMap18.table;
        hashMap2.table = entryArray21;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        int int24 = hashMap23.size();
        system.testclass.HashMap.Entry[] entryArray25 = hashMap23.table;
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        hashMap27.modCount = 0;
        java.lang.Object obj30 = hashMap26.remove((java.lang.Object) hashMap27);
        java.lang.Object obj31 = hashMap23.remove((java.lang.Object) hashMap26);
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        int int33 = hashMap32.modCount;
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        hashMap34.modCount = 0;
        java.lang.Object obj37 = null;
        java.lang.Object obj38 = hashMap34.remove(obj37);
        system.testclass.HashMap.Entry[] entryArray39 = hashMap34.table;
        hashMap32.table = entryArray39;
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        int int42 = hashMap41.size();
        system.testclass.HashMap.Entry[] entryArray43 = hashMap41.table;
        hashMap32.table = entryArray43;
        hashMap26.table = entryArray43;
        system.testclass.HashMap.Entry[] entryArray46 = hashMap26.table;
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap();
        hashMap48.modCount = 0;
        java.lang.Object obj51 = hashMap47.remove((java.lang.Object) hashMap48);
        int int52 = hashMap48.modCount;
        int int53 = hashMap48.modCount;
        java.lang.Object obj54 = hashMap26.get((java.lang.Object) int53);
        system.testclass.HashMap hashMap56 = new system.testclass.HashMap(100);
        system.testclass.HashMap hashMap57 = new system.testclass.HashMap();
        hashMap57.modCount = 0;
        java.lang.Object obj60 = null;
        java.lang.Object obj61 = hashMap57.remove(obj60);
        java.lang.Object obj63 = hashMap57.get((java.lang.Object) 10);
        system.testclass.HashMap.Entry[] entryArray64 = hashMap57.table;
        java.lang.Object obj65 = hashMap56.remove((java.lang.Object) entryArray64);
        int int66 = hashMap56.modCount;
        java.lang.Object obj67 = hashMap2.put(obj54, (java.lang.Object) int66);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 1);
        system.testclass.HashMap.Entry[] entryArray3 = hashMap2.table;
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray2 = hashMap0.table;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        hashMap4.modCount = 0;
        java.lang.Object obj7 = hashMap3.remove((java.lang.Object) hashMap4);
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) hashMap3);
        hashMap3.modCount = 0;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap((int) ' ');
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.size();
        system.testclass.HashMap.Entry[] entryArray15 = hashMap13.table;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        hashMap17.modCount = 0;
        java.lang.Object obj20 = hashMap16.remove((java.lang.Object) hashMap17);
        java.lang.Object obj21 = hashMap13.remove((java.lang.Object) hashMap16);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        int int23 = hashMap22.modCount;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        hashMap24.modCount = 0;
        java.lang.Object obj27 = null;
        java.lang.Object obj28 = hashMap24.remove(obj27);
        system.testclass.HashMap.Entry[] entryArray29 = hashMap24.table;
        hashMap22.table = entryArray29;
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        int int32 = hashMap31.size();
        system.testclass.HashMap.Entry[] entryArray33 = hashMap31.table;
        hashMap22.table = entryArray33;
        hashMap16.table = entryArray33;
        system.testclass.HashMap.Entry[] entryArray36 = hashMap16.table;
        java.lang.Class<?> wildcardClass37 = entryArray36.getClass();
        java.lang.Object obj38 = hashMap3.put((java.lang.Object) hashMap12, (java.lang.Object) wildcardClass37);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap3", hashMap3.repOK_1());
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (short) 100);
        boolean boolean3 = hashMap2.isEmpty();
        int int4 = hashMap2.size();
        int int5 = hashMap2.size();
        boolean boolean6 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        int int9 = hashMap7.size();
        int int10 = hashMap7.size();
        int int11 = hashMap7.size();
        java.lang.Object obj12 = hashMap2.get((java.lang.Object) hashMap7);
        hashMap7.modCount = '4';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap7", hashMap7.repOK_1());
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(10);
        java.lang.Object obj3 = hashMap1.remove((java.lang.Object) (short) 0);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap(0, (float) (short) 10);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap((int) ' ', (float) '#');
        int int10 = hashMap9.modCount;
        java.lang.Object obj12 = hashMap9.get((java.lang.Object) ' ');
        java.lang.Object obj13 = hashMap6.get((java.lang.Object) ' ');
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        boolean boolean15 = hashMap14.isEmpty();
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        int int17 = hashMap16.size();
        system.testclass.HashMap.Entry[] entryArray18 = hashMap16.table;
        hashMap16.modCount = 0;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        int int22 = hashMap21.modCount;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        hashMap23.modCount = 0;
        java.lang.Object obj26 = null;
        java.lang.Object obj27 = hashMap23.remove(obj26);
        system.testclass.HashMap.Entry[] entryArray28 = hashMap23.table;
        hashMap21.table = entryArray28;
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        int int31 = hashMap30.size();
        system.testclass.HashMap.Entry[] entryArray32 = hashMap30.table;
        hashMap21.table = entryArray32;
        java.lang.Object obj34 = hashMap16.get((java.lang.Object) entryArray32);
        java.lang.Object obj35 = hashMap14.get(obj34);
        java.lang.Object obj36 = hashMap6.remove((java.lang.Object) hashMap14);
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap(0, (float) (short) 100);
        boolean boolean40 = hashMap39.isEmpty();
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        int int42 = hashMap41.size();
        int int43 = hashMap41.modCount;
        boolean boolean44 = hashMap41.isEmpty();
        java.lang.Object obj45 = hashMap39.remove((java.lang.Object) hashMap41);
        java.lang.Object obj47 = hashMap41.get((java.lang.Object) 100L);
        java.lang.Object obj48 = hashMap1.put((java.lang.Object) hashMap6, obj47);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap();
        hashMap1.modCount = 0;
        java.lang.Object obj4 = hashMap0.remove((java.lang.Object) hashMap1);
        java.lang.Object obj6 = hashMap1.remove((java.lang.Object) (short) 100);
        int int7 = hashMap1.size();
        int int8 = hashMap1.modCount;
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }
}

