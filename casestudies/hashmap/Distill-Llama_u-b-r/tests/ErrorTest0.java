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
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray1 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap0.table = entryArray1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) 10L, (java.lang.Object) 100L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry entry1 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray2 = new system.classfixer.classes.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray2 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap0.table = entryArray2;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) false, (java.lang.Object) 0.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) '4', (java.lang.Object) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) 100.0d);
        system.classfixer.classes.HashMap.Entry entry4 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray5 = new system.classfixer.classes.HashMap.Entry[] { entry4 };
        hashMap0.table = entryArray5;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1.0d);
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
        hashMap0.modCount = (byte) 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap0.table;
        int int3 = hashMap0.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray4 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap0.table = entryArray4;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 10);
        int int2 = hashMap1.modCount;
        int int3 = hashMap1.size();
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap0.table;
        hashMap0.modCount = (short) 0;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        boolean boolean6 = hashMap5.isEmpty();
        int int7 = hashMap5.size();
        java.lang.Object obj9 = hashMap0.put((java.lang.Object) hashMap5, (java.lang.Object) 100.0d);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap3.table;
        int int6 = hashMap3.modCount;
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) hashMap3);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap8.table;
        hashMap3.table = entryArray10;
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = hashMap3.put((java.lang.Object) (-1.0f), obj13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap3", hashMap3.repOK_2());
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        int int3 = hashMap0.modCount;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap0.table;
        int int3 = hashMap0.modCount;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        system.classfixer.classes.HashMap.Entry entry2 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray3 = new system.classfixer.classes.HashMap.Entry[] { entry2 };
        hashMap0.table = entryArray3;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) ' ');
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap1.table;
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap3.remove((java.lang.Object) 1.0d);
        int int6 = hashMap3.size();
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap3.table;
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) (short) 10);
        int int10 = hashMap9.modCount;
        int int11 = hashMap9.size();
        java.lang.Object obj12 = hashMap1.put((java.lang.Object) entryArray7, (java.lang.Object) hashMap9);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap3.table;
        int int6 = hashMap3.modCount;
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) hashMap3);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap8.table;
        hashMap8.modCount = (short) 0;
        int int13 = hashMap8.size();
        java.lang.Object obj14 = hashMap0.get((java.lang.Object) hashMap8);
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        boolean boolean16 = hashMap15.repOK();
        boolean boolean17 = hashMap15.isEmpty();
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        boolean boolean19 = hashMap18.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray20 = hashMap18.table;
        int int21 = hashMap18.modCount;
        java.lang.Object obj22 = hashMap15.remove((java.lang.Object) hashMap18);
        boolean boolean23 = hashMap18.isEmpty();
        java.lang.Object obj24 = hashMap8.get((java.lang.Object) hashMap18);
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap();
        java.lang.Object obj27 = hashMap25.remove((java.lang.Object) 1.0d);
        int int28 = hashMap25.size();
        system.classfixer.classes.HashMap.Entry[] entryArray29 = hashMap25.table;
        system.classfixer.classes.HashMap.Entry[] entryArray30 = hashMap25.table;
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap();
        java.lang.Object obj33 = hashMap31.remove((java.lang.Object) 1.0d);
        int int34 = hashMap31.size();
        system.classfixer.classes.HashMap.Entry[] entryArray35 = hashMap31.table;
        int int36 = hashMap31.modCount;
        java.lang.Object obj37 = hashMap18.put((java.lang.Object) hashMap25, (java.lang.Object) int36);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap18", hashMap18.repOK_2());
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap3.table;
        int int6 = hashMap3.modCount;
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) hashMap3);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap8.table;
        hashMap3.table = entryArray10;
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        boolean boolean13 = hashMap12.repOK();
        java.lang.Object obj15 = hashMap12.get((java.lang.Object) 100.0d);
        int int16 = hashMap12.size();
        java.lang.Object obj18 = hashMap3.put((java.lang.Object) hashMap12, (java.lang.Object) (byte) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap3", hashMap3.repOK_2());
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 10);
        int int2 = hashMap1.modCount;
        int int3 = hashMap1.size();
        hashMap1.modCount = 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 10);
        int int2 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.repOK();
        boolean boolean5 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap6.table;
        int int9 = hashMap6.modCount;
        java.lang.Object obj10 = hashMap3.remove((java.lang.Object) hashMap6);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        boolean boolean12 = hashMap11.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap11.table;
        hashMap11.modCount = (short) 0;
        int int16 = hashMap11.size();
        java.lang.Object obj17 = hashMap3.get((java.lang.Object) hashMap11);
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap3.table;
        java.lang.Object obj20 = hashMap1.put((java.lang.Object) hashMap3, (java.lang.Object) 0.0d);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap3.table;
        int int6 = hashMap3.modCount;
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) hashMap3);
        hashMap3.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap3", hashMap3.repOK_2());
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 10);
        boolean boolean2 = hashMap1.repOK();
        int int3 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap6.table;
        hashMap1.table = entryArray7;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(100, (float) 1);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap3.remove((java.lang.Object) 1.0d);
        int int6 = hashMap3.size();
        java.lang.Object obj8 = hashMap3.remove((java.lang.Object) (short) -1);
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        boolean boolean10 = hashMap9.repOK();
        boolean boolean11 = hashMap9.isEmpty();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        boolean boolean13 = hashMap12.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap12.table;
        int int15 = hashMap12.modCount;
        java.lang.Object obj16 = hashMap9.remove((java.lang.Object) hashMap12);
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        boolean boolean18 = hashMap17.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap17.table;
        hashMap12.table = entryArray19;
        hashMap3.table = entryArray19;
        hashMap2.table = entryArray19;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap3.table;
        int int6 = hashMap3.modCount;
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) hashMap3);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap8.table;
        hashMap3.table = entryArray10;
        hashMap3.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap3", hashMap3.repOK_2());
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1.0d);
        int int3 = hashMap0.size();
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap0.table;
        boolean boolean5 = hashMap0.isEmpty();
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1.0d);
        java.lang.Object obj5 = hashMap0.put((java.lang.Object) (byte) 1, (java.lang.Object) 0L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        hashMap2.modCount = 0;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        boolean boolean6 = hashMap5.repOK();
        boolean boolean7 = hashMap5.isEmpty();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap8.table;
        int int11 = hashMap8.modCount;
        java.lang.Object obj12 = hashMap5.remove((java.lang.Object) hashMap8);
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        boolean boolean14 = hashMap13.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap13.table;
        hashMap8.table = entryArray15;
        hashMap8.modCount = 0;
        int int19 = hashMap8.size();
        java.lang.Object obj20 = hashMap2.get((java.lang.Object) int19);
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap();
        boolean boolean22 = hashMap21.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray23 = hashMap21.table;
        int int24 = hashMap21.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray25 = hashMap21.table;
        hashMap2.table = entryArray25;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap0.table;
        hashMap0.modCount = (short) 0;
        int int5 = hashMap0.size();
        int int6 = hashMap0.modCount;
        java.lang.Object obj7 = null;
        java.lang.Object obj9 = hashMap0.put(obj7, (java.lang.Object) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        int int1 = hashMap0.size();
        hashMap0.modCount = (byte) 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap3.remove((java.lang.Object) 1.0d);
        int int6 = hashMap3.size();
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap3.table;
        hashMap2.table = entryArray7;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 1, (float) 100L);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap3.remove((java.lang.Object) 1.0d);
        int int6 = hashMap3.size();
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap3.table;
        int int8 = hashMap3.modCount;
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap9.table;
        int int12 = hashMap9.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap9.table;
        hashMap3.table = entryArray13;
        hashMap2.table = entryArray13;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap2.table;
        java.lang.Object obj5 = hashMap2.remove((java.lang.Object) 10.0d);
        hashMap2.modCount = '4';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap3.table;
        hashMap3.modCount = (short) 0;
        boolean boolean8 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        java.lang.Object obj11 = hashMap9.remove((java.lang.Object) 1.0d);
        int int12 = hashMap9.size();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap9.table;
        int int14 = hashMap9.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap9.table;
        java.lang.Object obj16 = hashMap2.put((java.lang.Object) boolean8, (java.lang.Object) entryArray15);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap0.table;
        hashMap0.modCount = (short) 0;
        int int5 = hashMap0.size();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap0.table;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 10);
        boolean boolean2 = hashMap1.repOK();
        int int3 = hashMap1.size();
        hashMap1.modCount = 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) 100.0d);
        int int4 = hashMap0.modCount;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        hashMap2.modCount = 0;
        hashMap2.modCount = '4';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1.0d);
        int int3 = hashMap0.size();
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap0.table;
        boolean boolean5 = hashMap0.isEmpty();
        int int6 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap7.table;
        java.lang.Object obj10 = hashMap0.remove((java.lang.Object) hashMap7);
        hashMap0.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1.0d);
        int int3 = hashMap0.size();
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap0.table;
        boolean boolean5 = hashMap0.isEmpty();
        int int6 = hashMap0.modCount;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap((int) ' ');
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap3.table;
        hashMap1.table = entryArray4;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap3.table;
        int int6 = hashMap3.modCount;
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) hashMap3);
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap0.table;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1.0d);
        int int3 = hashMap0.size();
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap0.table;
        boolean boolean5 = hashMap0.isEmpty();
        int int6 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap7.table;
        java.lang.Object obj10 = hashMap0.remove((java.lang.Object) hashMap7);
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        boolean boolean13 = hashMap12.repOK();
        boolean boolean14 = hashMap12.isEmpty();
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        boolean boolean16 = hashMap15.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap15.table;
        int int18 = hashMap15.modCount;
        java.lang.Object obj19 = hashMap12.remove((java.lang.Object) hashMap15);
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        boolean boolean21 = hashMap20.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray22 = hashMap20.table;
        hashMap15.table = entryArray22;
        hashMap15.modCount = 0;
        java.lang.Object obj26 = hashMap0.put((java.lang.Object) 100.0f, (java.lang.Object) hashMap15);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap3.table;
        int int6 = hashMap3.modCount;
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) hashMap3);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap8.table;
        hashMap8.modCount = (short) 0;
        int int13 = hashMap8.size();
        java.lang.Object obj14 = hashMap0.get((java.lang.Object) hashMap8);
        hashMap0.modCount = 'a';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap0.table;
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = hashMap0.remove(obj3);
        int int5 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        java.lang.Object obj8 = hashMap6.remove((java.lang.Object) 1.0d);
        int int9 = hashMap6.size();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap6.table;
        boolean boolean11 = hashMap6.isEmpty();
        int int12 = hashMap6.modCount;
        java.lang.Object obj14 = hashMap0.put((java.lang.Object) int12, (java.lang.Object) (-1));
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.isEmpty();
        java.lang.Object obj4 = hashMap0.get((java.lang.Object) (byte) 0);
        java.lang.Object obj5 = null;
        java.lang.Object obj7 = hashMap0.put(obj5, (java.lang.Object) true);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap0.table;
        hashMap0.modCount = (short) 0;
        int int5 = hashMap0.size();
        java.lang.Object obj7 = hashMap0.get((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.repOK();
        boolean boolean10 = hashMap8.isEmpty();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        boolean boolean12 = hashMap11.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap11.table;
        int int14 = hashMap11.modCount;
        java.lang.Object obj15 = hashMap8.remove((java.lang.Object) hashMap11);
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        boolean boolean17 = hashMap16.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap16.table;
        hashMap16.modCount = (short) 0;
        int int21 = hashMap16.size();
        java.lang.Object obj22 = hashMap8.get((java.lang.Object) hashMap16);
        system.classfixer.classes.HashMap.Entry[] entryArray23 = hashMap8.table;
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap();
        boolean boolean25 = hashMap24.repOK();
        java.lang.Object obj27 = hashMap24.get((java.lang.Object) 100.0d);
        int int28 = hashMap24.size();
        java.lang.Object obj29 = hashMap8.remove((java.lang.Object) hashMap24);
        int int30 = hashMap8.size();
        java.lang.Object obj31 = hashMap0.get((java.lang.Object) hashMap8);
        hashMap8.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap8", hashMap8.repOK_2());
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1.0d);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap3.remove((java.lang.Object) 1.0d);
        int int6 = hashMap3.size();
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap3.table;
        hashMap0.table = entryArray7;
        int int9 = hashMap0.size();
        int int10 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        boolean boolean12 = hashMap11.repOK();
        boolean boolean13 = hashMap11.isEmpty();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        boolean boolean15 = hashMap14.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap14.table;
        int int17 = hashMap14.modCount;
        java.lang.Object obj18 = hashMap11.remove((java.lang.Object) hashMap14);
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        boolean boolean20 = hashMap19.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap19.table;
        hashMap19.modCount = (short) 0;
        int int24 = hashMap19.size();
        java.lang.Object obj25 = hashMap11.get((java.lang.Object) hashMap19);
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap();
        boolean boolean27 = hashMap26.repOK();
        boolean boolean28 = hashMap26.isEmpty();
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap();
        boolean boolean30 = hashMap29.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray31 = hashMap29.table;
        int int32 = hashMap29.modCount;
        java.lang.Object obj33 = hashMap26.remove((java.lang.Object) hashMap29);
        boolean boolean34 = hashMap29.isEmpty();
        java.lang.Object obj35 = hashMap19.get((java.lang.Object) hashMap29);
        java.lang.Object obj36 = hashMap0.remove((java.lang.Object) hashMap19);
        system.classfixer.classes.HashMap hashMap39 = new system.classfixer.classes.HashMap((int) '4', 1.0f);
        system.classfixer.classes.HashMap hashMap40 = new system.classfixer.classes.HashMap();
        java.lang.Object obj42 = hashMap40.remove((java.lang.Object) 1.0d);
        int int43 = hashMap40.size();
        java.lang.Object obj45 = hashMap40.remove((java.lang.Object) (short) -1);
        system.classfixer.classes.HashMap hashMap46 = new system.classfixer.classes.HashMap();
        boolean boolean47 = hashMap46.repOK();
        boolean boolean48 = hashMap46.isEmpty();
        system.classfixer.classes.HashMap hashMap49 = new system.classfixer.classes.HashMap();
        boolean boolean50 = hashMap49.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray51 = hashMap49.table;
        int int52 = hashMap49.modCount;
        java.lang.Object obj53 = hashMap46.remove((java.lang.Object) hashMap49);
        system.classfixer.classes.HashMap hashMap54 = new system.classfixer.classes.HashMap();
        boolean boolean55 = hashMap54.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray56 = hashMap54.table;
        hashMap49.table = entryArray56;
        hashMap40.table = entryArray56;
        java.lang.Class<?> wildcardClass59 = entryArray56.getClass();
        java.lang.Object obj60 = hashMap19.put((java.lang.Object) '4', (java.lang.Object) wildcardClass59);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap19", hashMap19.repOK_2());
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap0.table;
        hashMap0.modCount = (short) 0;
        int int5 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        boolean boolean8 = hashMap7.repOK();
        boolean boolean9 = hashMap7.isEmpty();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap10.table;
        int int13 = hashMap10.modCount;
        java.lang.Object obj14 = hashMap7.remove((java.lang.Object) hashMap10);
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        boolean boolean16 = hashMap15.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap15.table;
        hashMap10.table = entryArray17;
        hashMap10.modCount = 0;
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap();
        java.lang.Object obj23 = hashMap21.remove((java.lang.Object) 1.0d);
        int int24 = hashMap21.size();
        system.classfixer.classes.HashMap.Entry[] entryArray25 = hashMap21.table;
        java.lang.Object obj26 = hashMap10.get((java.lang.Object) entryArray25);
        java.lang.Object obj27 = hashMap0.put((java.lang.Object) 100.0f, (java.lang.Object) hashMap10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) '4', 1.0f);
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) 100.0d);
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap0.table;
        int int3 = hashMap0.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap0.table;
        boolean boolean5 = hashMap0.isEmpty();
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap0.table;
        int int3 = hashMap0.modCount;
        boolean boolean4 = hashMap0.isEmpty();
        hashMap0.modCount = '4';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap0.table;
        hashMap0.modCount = (short) 0;
        int int5 = hashMap0.size();
        java.lang.Object obj7 = hashMap0.get((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.repOK();
        boolean boolean10 = hashMap8.isEmpty();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        boolean boolean12 = hashMap11.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap11.table;
        int int14 = hashMap11.modCount;
        java.lang.Object obj15 = hashMap8.remove((java.lang.Object) hashMap11);
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        boolean boolean17 = hashMap16.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap16.table;
        hashMap16.modCount = (short) 0;
        int int21 = hashMap16.size();
        java.lang.Object obj22 = hashMap8.get((java.lang.Object) hashMap16);
        system.classfixer.classes.HashMap.Entry[] entryArray23 = hashMap8.table;
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap();
        boolean boolean25 = hashMap24.repOK();
        java.lang.Object obj27 = hashMap24.get((java.lang.Object) 100.0d);
        int int28 = hashMap24.size();
        java.lang.Object obj29 = hashMap8.remove((java.lang.Object) hashMap24);
        int int30 = hashMap8.size();
        java.lang.Object obj31 = hashMap0.get((java.lang.Object) hashMap8);
        boolean boolean32 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap();
        boolean boolean34 = hashMap33.repOK();
        boolean boolean35 = hashMap33.isEmpty();
        system.classfixer.classes.HashMap hashMap36 = new system.classfixer.classes.HashMap();
        boolean boolean37 = hashMap36.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray38 = hashMap36.table;
        int int39 = hashMap36.modCount;
        java.lang.Object obj40 = hashMap33.remove((java.lang.Object) hashMap36);
        boolean boolean41 = hashMap36.isEmpty();
        boolean boolean42 = hashMap36.repOK();
        java.lang.Object obj43 = hashMap0.get((java.lang.Object) boolean42);
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(0, (float) (short) 10);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap3.table;
        hashMap3.modCount = (short) 0;
        int int8 = hashMap3.size();
        java.lang.Object obj10 = hashMap3.get((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        boolean boolean12 = hashMap11.repOK();
        boolean boolean13 = hashMap11.isEmpty();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        boolean boolean15 = hashMap14.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap14.table;
        int int17 = hashMap14.modCount;
        java.lang.Object obj18 = hashMap11.remove((java.lang.Object) hashMap14);
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        boolean boolean20 = hashMap19.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap19.table;
        hashMap19.modCount = (short) 0;
        int int24 = hashMap19.size();
        java.lang.Object obj25 = hashMap11.get((java.lang.Object) hashMap19);
        system.classfixer.classes.HashMap.Entry[] entryArray26 = hashMap11.table;
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap();
        boolean boolean28 = hashMap27.repOK();
        java.lang.Object obj30 = hashMap27.get((java.lang.Object) 100.0d);
        int int31 = hashMap27.size();
        java.lang.Object obj32 = hashMap11.remove((java.lang.Object) hashMap27);
        int int33 = hashMap11.size();
        java.lang.Object obj34 = hashMap3.get((java.lang.Object) hashMap11);
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap();
        boolean boolean36 = hashMap35.repOK();
        boolean boolean37 = hashMap35.isEmpty();
        system.classfixer.classes.HashMap hashMap38 = new system.classfixer.classes.HashMap();
        boolean boolean39 = hashMap38.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray40 = hashMap38.table;
        int int41 = hashMap38.modCount;
        java.lang.Object obj42 = hashMap35.remove((java.lang.Object) hashMap38);
        system.classfixer.classes.HashMap hashMap43 = new system.classfixer.classes.HashMap();
        boolean boolean44 = hashMap43.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray45 = hashMap43.table;
        hashMap38.table = entryArray45;
        hashMap38.modCount = 0;
        system.classfixer.classes.HashMap hashMap49 = new system.classfixer.classes.HashMap();
        java.lang.Object obj51 = hashMap49.remove((java.lang.Object) 1.0d);
        int int52 = hashMap49.size();
        system.classfixer.classes.HashMap.Entry[] entryArray53 = hashMap49.table;
        java.lang.Object obj54 = hashMap38.get((java.lang.Object) entryArray53);
        hashMap11.table = entryArray53;
        hashMap2.table = entryArray53;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1.0d);
        int int3 = hashMap0.size();
        int int4 = hashMap0.size();
        boolean boolean5 = hashMap0.repOK();
        hashMap0.modCount = (short) 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1.0d);
        int int3 = hashMap0.size();
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap0.table;
        int int5 = hashMap0.size();
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.isEmpty();
        hashMap0.modCount = (short) 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap3.table;
        int int6 = hashMap3.modCount;
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) hashMap3);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap8.table;
        hashMap8.modCount = (short) 0;
        int int13 = hashMap8.size();
        java.lang.Object obj14 = hashMap0.get((java.lang.Object) hashMap8);
        hashMap8.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap8", hashMap8.repOK_2());
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1.0d);
        int int3 = hashMap0.size();
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap0.table;
        int int5 = hashMap0.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        boolean boolean8 = hashMap7.repOK();
        boolean boolean9 = hashMap7.isEmpty();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap10.table;
        int int13 = hashMap10.modCount;
        java.lang.Object obj14 = hashMap7.remove((java.lang.Object) hashMap10);
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap7.table;
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        java.lang.Object obj18 = hashMap16.remove((java.lang.Object) 1.0d);
        int int19 = hashMap16.size();
        java.lang.Object obj21 = hashMap16.remove((java.lang.Object) (short) -1);
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        boolean boolean23 = hashMap22.repOK();
        boolean boolean24 = hashMap22.isEmpty();
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap();
        boolean boolean26 = hashMap25.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray27 = hashMap25.table;
        int int28 = hashMap25.modCount;
        java.lang.Object obj29 = hashMap22.remove((java.lang.Object) hashMap25);
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap();
        boolean boolean31 = hashMap30.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray32 = hashMap30.table;
        hashMap25.table = entryArray32;
        hashMap16.table = entryArray32;
        java.lang.Class<?> wildcardClass35 = entryArray32.getClass();
        java.lang.Object obj36 = hashMap0.put((java.lang.Object) hashMap7, (java.lang.Object) wildcardClass35);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) 100.0d);
        int int4 = hashMap0.modCount;
        int int5 = hashMap0.size();
        int int6 = hashMap0.modCount;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap0.table;
        hashMap0.modCount = (short) 0;
        int int5 = hashMap0.size();
        int int6 = hashMap0.modCount;
        boolean boolean7 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap8.table;
        hashMap8.modCount = (short) 0;
        int int13 = hashMap8.size();
        java.lang.Object obj15 = hashMap8.get((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        boolean boolean17 = hashMap16.repOK();
        boolean boolean18 = hashMap16.isEmpty();
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        boolean boolean20 = hashMap19.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap19.table;
        int int22 = hashMap19.modCount;
        java.lang.Object obj23 = hashMap16.remove((java.lang.Object) hashMap19);
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap();
        boolean boolean25 = hashMap24.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray26 = hashMap24.table;
        hashMap24.modCount = (short) 0;
        int int29 = hashMap24.size();
        java.lang.Object obj30 = hashMap16.get((java.lang.Object) hashMap24);
        system.classfixer.classes.HashMap.Entry[] entryArray31 = hashMap16.table;
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap();
        boolean boolean33 = hashMap32.repOK();
        java.lang.Object obj35 = hashMap32.get((java.lang.Object) 100.0d);
        int int36 = hashMap32.size();
        java.lang.Object obj37 = hashMap16.remove((java.lang.Object) hashMap32);
        int int38 = hashMap16.size();
        java.lang.Object obj39 = hashMap8.get((java.lang.Object) hashMap16);
        boolean boolean40 = hashMap8.repOK();
        system.classfixer.classes.HashMap hashMap41 = new system.classfixer.classes.HashMap();
        boolean boolean42 = hashMap41.repOK();
        boolean boolean43 = hashMap41.isEmpty();
        system.classfixer.classes.HashMap hashMap44 = new system.classfixer.classes.HashMap();
        boolean boolean45 = hashMap44.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray46 = hashMap44.table;
        int int47 = hashMap44.modCount;
        java.lang.Object obj48 = hashMap41.remove((java.lang.Object) hashMap44);
        boolean boolean49 = hashMap44.isEmpty();
        boolean boolean50 = hashMap44.repOK();
        java.lang.Object obj51 = hashMap8.get((java.lang.Object) boolean50);
        java.lang.Object obj52 = new java.lang.Object();
        java.lang.Class<?> wildcardClass53 = obj52.getClass();
        java.lang.Object obj54 = hashMap0.put((java.lang.Object) boolean50, (java.lang.Object) wildcardClass53);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1.0d);
        int int3 = hashMap0.size();
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap0.table;
        boolean boolean5 = hashMap0.isEmpty();
        int int6 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap7.table;
        java.lang.Object obj10 = hashMap0.remove((java.lang.Object) hashMap7);
        hashMap0.modCount = '#';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap0.table;
        hashMap0.modCount = (short) 0;
        int int5 = hashMap0.size();
        java.lang.Object obj7 = hashMap0.get((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (short) 100, (float) 1);
        java.lang.Object obj11 = hashMap0.get((java.lang.Object) hashMap10);
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap(100, (float) 1);
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        boolean boolean16 = hashMap15.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap15.table;
        java.lang.Object obj18 = null;
        java.lang.Object obj19 = hashMap15.remove(obj18);
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        java.lang.Object obj22 = hashMap20.remove((java.lang.Object) 1.0d);
        int int23 = hashMap20.size();
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap20.table;
        system.classfixer.classes.HashMap.Entry[] entryArray25 = hashMap20.table;
        java.lang.Object obj26 = hashMap15.get((java.lang.Object) hashMap20);
        java.lang.Object obj27 = hashMap10.put((java.lang.Object) 1, obj26);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap10", hashMap10.repOK_2());
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap0.table;
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = hashMap0.remove(obj3);
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = hashMap0.put((java.lang.Object) (byte) 1, obj6);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap0.table;
        boolean boolean4 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        java.lang.Object obj7 = hashMap5.remove((java.lang.Object) 1.0d);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        java.lang.Object obj10 = hashMap8.remove((java.lang.Object) 1.0d);
        int int11 = hashMap8.size();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap8.table;
        hashMap5.table = entryArray12;
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        boolean boolean15 = hashMap14.repOK();
        boolean boolean16 = hashMap14.isEmpty();
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        boolean boolean18 = hashMap17.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap17.table;
        int int20 = hashMap17.modCount;
        java.lang.Object obj21 = hashMap14.remove((java.lang.Object) hashMap17);
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        boolean boolean23 = hashMap22.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap22.table;
        hashMap17.table = entryArray24;
        hashMap17.modCount = 0;
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap();
        java.lang.Object obj30 = hashMap28.remove((java.lang.Object) 1.0d);
        int int31 = hashMap28.size();
        system.classfixer.classes.HashMap.Entry[] entryArray32 = hashMap28.table;
        java.lang.Object obj33 = hashMap17.get((java.lang.Object) entryArray32);
        boolean boolean34 = hashMap17.isEmpty();
        int int35 = hashMap17.size();
        java.lang.Object obj36 = hashMap0.put((java.lang.Object) entryArray12, (java.lang.Object) hashMap17);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1.0d);
        int int3 = hashMap0.size();
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap0.table;
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap0.table;
        boolean boolean6 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry entry7 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray8 = new system.classfixer.classes.HashMap.Entry[] { entry7 };
        hashMap0.table = entryArray8;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap0.table;
        hashMap0.modCount = (short) 0;
        int int5 = hashMap0.size();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap0.table;
        int int7 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.repOK();
        boolean boolean10 = hashMap8.isEmpty();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        boolean boolean12 = hashMap11.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap11.table;
        int int14 = hashMap11.modCount;
        java.lang.Object obj15 = hashMap8.remove((java.lang.Object) hashMap11);
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        boolean boolean17 = hashMap16.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap16.table;
        hashMap11.table = entryArray18;
        hashMap11.modCount = 0;
        int int22 = hashMap11.size();
        int int23 = hashMap11.size();
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap11.table;
        hashMap0.table = entryArray24;
        hashMap0.modCount = '#';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap0.table;
        hashMap0.modCount = (short) 0;
        int int5 = hashMap0.size();
        java.lang.Object obj7 = hashMap0.get((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        java.lang.Object obj11 = hashMap9.remove((java.lang.Object) 1.0d);
        int int12 = hashMap9.size();
        int int13 = hashMap9.size();
        boolean boolean14 = hashMap9.repOK();
        int int15 = hashMap9.size();
        java.lang.Object obj16 = hashMap0.put((java.lang.Object) (-1L), (java.lang.Object) hashMap9);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap0.table;
        hashMap0.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap0.table;
        hashMap0.modCount = (short) 0;
        int int5 = hashMap0.size();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) (short) 10);
        int int9 = hashMap8.modCount;
        int int10 = hashMap8.size();
        java.lang.Class<?> wildcardClass11 = hashMap8.getClass();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        boolean boolean13 = hashMap12.isEmpty();
        java.lang.Object obj14 = hashMap0.put((java.lang.Object) hashMap8, (java.lang.Object) boolean13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) ' ');
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap1.table;
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.repOK();
        java.lang.Object obj6 = hashMap3.get((java.lang.Object) 100.0d);
        int int7 = hashMap3.modCount;
        int int8 = hashMap3.modCount;
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        java.lang.Object obj11 = hashMap9.remove((java.lang.Object) 1.0d);
        int int12 = hashMap9.size();
        boolean boolean13 = hashMap9.repOK();
        java.lang.Object obj14 = hashMap3.get((java.lang.Object) hashMap9);
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        boolean boolean16 = hashMap15.repOK();
        java.lang.Object obj18 = hashMap15.get((java.lang.Object) 100.0d);
        int int19 = hashMap15.modCount;
        int int20 = hashMap15.size();
        int int21 = hashMap15.modCount;
        java.lang.Object obj22 = hashMap1.put(obj14, (java.lang.Object) hashMap15);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1.0d);
        int int3 = hashMap0.size();
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap0.table;
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap0.table;
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap0.table;
        hashMap0.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap3.table;
        int int6 = hashMap3.modCount;
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) hashMap3);
        boolean boolean8 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        boolean boolean10 = hashMap9.repOK();
        boolean boolean11 = hashMap9.isEmpty();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        boolean boolean13 = hashMap12.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap12.table;
        int int15 = hashMap12.modCount;
        java.lang.Object obj16 = hashMap9.remove((java.lang.Object) hashMap12);
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        boolean boolean18 = hashMap17.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap17.table;
        hashMap12.table = entryArray19;
        hashMap12.modCount = 0;
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap();
        java.lang.Object obj25 = hashMap23.remove((java.lang.Object) 1.0d);
        int int26 = hashMap23.size();
        system.classfixer.classes.HashMap.Entry[] entryArray27 = hashMap23.table;
        java.lang.Object obj28 = hashMap12.get((java.lang.Object) entryArray27);
        boolean boolean29 = hashMap12.isEmpty();
        java.lang.Object obj30 = hashMap3.remove((java.lang.Object) boolean29);
        hashMap3.modCount = 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap3", hashMap3.repOK_2());
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 1, (float) 100L);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.repOK();
        boolean boolean5 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap6.table;
        int int9 = hashMap6.modCount;
        java.lang.Object obj10 = hashMap3.remove((java.lang.Object) hashMap6);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        boolean boolean12 = hashMap11.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap11.table;
        hashMap11.modCount = (short) 0;
        int int16 = hashMap11.size();
        java.lang.Object obj17 = hashMap3.get((java.lang.Object) hashMap11);
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        boolean boolean19 = hashMap18.repOK();
        boolean boolean20 = hashMap18.isEmpty();
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap();
        boolean boolean22 = hashMap21.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray23 = hashMap21.table;
        int int24 = hashMap21.modCount;
        java.lang.Object obj25 = hashMap18.remove((java.lang.Object) hashMap21);
        boolean boolean26 = hashMap21.isEmpty();
        java.lang.Object obj27 = hashMap11.get((java.lang.Object) hashMap21);
        int int28 = hashMap21.size();
        java.lang.Object obj29 = hashMap2.remove((java.lang.Object) hashMap21);
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap();
        boolean boolean31 = hashMap30.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray32 = hashMap30.table;
        hashMap30.modCount = (short) 0;
        int int35 = hashMap30.size();
        system.classfixer.classes.HashMap.Entry[] entryArray36 = hashMap30.table;
        int int37 = hashMap30.modCount;
        system.classfixer.classes.HashMap hashMap40 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        system.classfixer.classes.HashMap.Entry[] entryArray41 = hashMap40.table;
        java.lang.Class<?> wildcardClass42 = entryArray41.getClass();
        java.lang.Object obj43 = hashMap30.get((java.lang.Object) entryArray41);
        system.classfixer.classes.HashMap hashMap44 = new system.classfixer.classes.HashMap();
        boolean boolean45 = hashMap44.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray46 = hashMap44.table;
        hashMap44.modCount = (short) 0;
        int int49 = hashMap44.size();
        java.lang.Object obj51 = hashMap44.get((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap54 = new system.classfixer.classes.HashMap((int) (short) 100, (float) 1);
        java.lang.Object obj55 = hashMap44.get((java.lang.Object) hashMap54);
        int int56 = hashMap54.modCount;
        java.lang.Object obj57 = hashMap21.put(obj43, (java.lang.Object) hashMap54);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap21", hashMap21.repOK_2());
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1.0d);
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap5.table;
        hashMap0.table = entryArray6;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 1, (float) 100L);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) ' ');
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap4.table;
        int int6 = hashMap4.modCount;
        int int7 = hashMap4.size();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        java.lang.Object obj10 = hashMap8.remove((java.lang.Object) 1.0d);
        int int11 = hashMap8.size();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap8.table;
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap8.table;
        boolean boolean14 = hashMap8.isEmpty();
        java.lang.Object obj15 = hashMap2.put((java.lang.Object) hashMap4, (java.lang.Object) boolean14);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        int int2 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (short) 100, (float) 100L);
        boolean boolean6 = hashMap5.isEmpty();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        java.lang.Object obj9 = hashMap7.remove((java.lang.Object) 1.0d);
        int int10 = hashMap7.size();
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap7.table;
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap7.table;
        boolean boolean13 = hashMap7.isEmpty();
        java.lang.Object obj14 = hashMap1.put((java.lang.Object) hashMap5, (java.lang.Object) hashMap7);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 100, (float) 1);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap3.remove((java.lang.Object) 1.0d);
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        java.lang.Object obj8 = hashMap6.remove((java.lang.Object) 1.0d);
        int int9 = hashMap6.size();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap6.table;
        hashMap3.table = entryArray10;
        int int12 = hashMap3.size();
        java.lang.Object obj13 = hashMap2.get((java.lang.Object) int12);
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 100, (float) 1);
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap2.table;
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj6 = hashMap4.remove((java.lang.Object) 1.0d);
        int int7 = hashMap4.size();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap4.table;
        int int9 = hashMap4.modCount;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap10.table;
        int int13 = hashMap10.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap10.table;
        hashMap4.table = entryArray14;
        boolean boolean16 = hashMap4.isEmpty();
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        boolean boolean18 = hashMap17.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap17.table;
        java.lang.Object obj20 = null;
        java.lang.Object obj21 = hashMap17.remove(obj20);
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        java.lang.Object obj24 = hashMap22.remove((java.lang.Object) 1.0d);
        int int25 = hashMap22.size();
        system.classfixer.classes.HashMap.Entry[] entryArray26 = hashMap22.table;
        system.classfixer.classes.HashMap.Entry[] entryArray27 = hashMap22.table;
        java.lang.Object obj28 = hashMap17.get((java.lang.Object) hashMap22);
        java.lang.Object obj29 = hashMap2.put((java.lang.Object) hashMap4, (java.lang.Object) hashMap17);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) '4', 1.0f);
        boolean boolean6 = hashMap5.repOK();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) ' ');
        boolean boolean9 = hashMap8.repOK();
        boolean boolean10 = hashMap8.isEmpty();
        java.lang.Object obj11 = hashMap0.put((java.lang.Object) hashMap5, (java.lang.Object) hashMap8);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap0.table;
        hashMap0.modCount = (short) 0;
        int int5 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        boolean boolean7 = hashMap6.repOK();
        boolean boolean8 = hashMap6.isEmpty();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap9.table;
        int int12 = hashMap9.modCount;
        java.lang.Object obj13 = hashMap6.remove((java.lang.Object) hashMap9);
        boolean boolean14 = hashMap9.isEmpty();
        boolean boolean15 = hashMap9.repOK();
        int int16 = hashMap9.modCount;
        java.lang.Object obj17 = hashMap0.remove((java.lang.Object) int16);
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap((int) '4');
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        boolean boolean21 = hashMap20.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray22 = hashMap20.table;
        hashMap20.modCount = (short) 0;
        int int25 = hashMap20.size();
        system.classfixer.classes.HashMap.Entry[] entryArray26 = hashMap20.table;
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap();
        boolean boolean28 = hashMap27.repOK();
        boolean boolean29 = hashMap27.isEmpty();
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap();
        boolean boolean31 = hashMap30.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray32 = hashMap30.table;
        int int33 = hashMap30.modCount;
        java.lang.Object obj34 = hashMap27.remove((java.lang.Object) hashMap30);
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap();
        boolean boolean36 = hashMap35.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray37 = hashMap35.table;
        hashMap30.table = entryArray37;
        hashMap20.table = entryArray37;
        java.lang.Object obj40 = hashMap0.put((java.lang.Object) hashMap19, (java.lang.Object) entryArray37);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1.0d);
        int int3 = hashMap0.size();
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap0.table;
        boolean boolean5 = hashMap0.isEmpty();
        int int6 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap7.table;
        java.lang.Object obj10 = hashMap0.remove((java.lang.Object) hashMap7);
        hashMap0.modCount = (short) 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap2.table;
        java.lang.Object obj5 = hashMap2.remove((java.lang.Object) 10.0d);
        hashMap2.modCount = (short) 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(0, (float) (short) 10);
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap0.table;
        hashMap0.modCount = (short) 0;
        int int5 = hashMap0.size();
        java.lang.Object obj7 = hashMap0.get((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (short) 100, (float) 1);
        java.lang.Object obj11 = hashMap0.get((java.lang.Object) hashMap10);
        int int12 = hashMap10.modCount;
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        boolean boolean14 = hashMap13.repOK();
        boolean boolean15 = hashMap13.isEmpty();
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        boolean boolean17 = hashMap16.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap16.table;
        int int19 = hashMap16.modCount;
        java.lang.Object obj20 = hashMap13.remove((java.lang.Object) hashMap16);
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap();
        boolean boolean22 = hashMap21.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray23 = hashMap21.table;
        hashMap16.table = entryArray23;
        hashMap16.modCount = 0;
        int int27 = hashMap16.size();
        int int28 = hashMap16.size();
        system.classfixer.classes.HashMap.Entry[] entryArray29 = hashMap16.table;
        hashMap10.table = entryArray29;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap10", hashMap10.repOK_2());
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(1, (float) 1L);
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) ' ', 10.0f);
        int int3 = hashMap2.size();
        hashMap2.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap2.table;
        hashMap1.table = entryArray3;
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap0.table;
        hashMap0.modCount = (short) 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) ' ');
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap1.table;
        int int3 = hashMap1.modCount;
        int int4 = hashMap1.size();
        hashMap1.modCount = (byte) 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray1 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        boolean boolean3 = hashMap2.repOK();
        boolean boolean4 = hashMap2.isEmpty();
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) boolean4);
        hashMap0.modCount = 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap0.table;
        hashMap0.modCount = (short) 0;
        int int5 = hashMap0.size();
        java.lang.Object obj7 = hashMap0.get((java.lang.Object) 0.0f);
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        int int2 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap3.remove((java.lang.Object) 1.0d);
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        java.lang.Object obj8 = hashMap6.remove((java.lang.Object) 1.0d);
        int int9 = hashMap6.size();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap6.table;
        hashMap3.table = entryArray10;
        int int12 = hashMap3.size();
        int int13 = hashMap3.modCount;
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        boolean boolean15 = hashMap14.repOK();
        boolean boolean16 = hashMap14.isEmpty();
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        boolean boolean18 = hashMap17.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap17.table;
        int int20 = hashMap17.modCount;
        java.lang.Object obj21 = hashMap14.remove((java.lang.Object) hashMap17);
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        boolean boolean23 = hashMap22.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap22.table;
        hashMap22.modCount = (short) 0;
        int int27 = hashMap22.size();
        java.lang.Object obj28 = hashMap14.get((java.lang.Object) hashMap22);
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap();
        boolean boolean30 = hashMap29.repOK();
        boolean boolean31 = hashMap29.isEmpty();
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap();
        boolean boolean33 = hashMap32.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray34 = hashMap32.table;
        int int35 = hashMap32.modCount;
        java.lang.Object obj36 = hashMap29.remove((java.lang.Object) hashMap32);
        boolean boolean37 = hashMap32.isEmpty();
        java.lang.Object obj38 = hashMap22.get((java.lang.Object) hashMap32);
        java.lang.Object obj39 = hashMap3.remove((java.lang.Object) hashMap22);
        system.classfixer.classes.HashMap.Entry[] entryArray40 = hashMap3.table;
        system.classfixer.classes.HashMap hashMap41 = new system.classfixer.classes.HashMap();
        boolean boolean42 = hashMap41.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray43 = hashMap41.table;
        java.lang.Object obj44 = null;
        java.lang.Object obj45 = hashMap41.remove(obj44);
        system.classfixer.classes.HashMap hashMap46 = new system.classfixer.classes.HashMap();
        java.lang.Object obj48 = hashMap46.remove((java.lang.Object) 1.0d);
        int int49 = hashMap46.size();
        system.classfixer.classes.HashMap.Entry[] entryArray50 = hashMap46.table;
        system.classfixer.classes.HashMap.Entry[] entryArray51 = hashMap46.table;
        hashMap41.table = entryArray51;
        boolean boolean53 = hashMap41.repOK();
        java.lang.Object obj54 = hashMap1.put((java.lang.Object) entryArray40, (java.lang.Object) boolean53);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1.0d);
        int int3 = hashMap0.size();
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (short) -1);
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        boolean boolean7 = hashMap6.repOK();
        boolean boolean8 = hashMap6.isEmpty();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap9.table;
        int int12 = hashMap9.modCount;
        java.lang.Object obj13 = hashMap6.remove((java.lang.Object) hashMap9);
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        boolean boolean15 = hashMap14.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap14.table;
        hashMap9.table = entryArray16;
        hashMap0.table = entryArray16;
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap((int) (short) 10);
        int int22 = hashMap21.modCount;
        int int23 = hashMap21.size();
        java.lang.Class<?> wildcardClass24 = hashMap21.getClass();
        java.lang.Object obj25 = hashMap0.put((java.lang.Object) 'a', (java.lang.Object) wildcardClass24);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap2.table;
        java.lang.Object obj5 = hashMap2.remove((java.lang.Object) 10.0d);
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        boolean boolean8 = hashMap7.repOK();
        java.lang.Object obj10 = hashMap7.get((java.lang.Object) 100.0d);
        int int11 = hashMap7.size();
        java.lang.Object obj12 = hashMap2.put((java.lang.Object) '#', (java.lang.Object) int11);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) 100.0d);
        hashMap0.modCount = (byte) 0;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        boolean boolean7 = hashMap6.repOK();
        java.lang.Object obj9 = hashMap6.get((java.lang.Object) 100.0d);
        int int10 = hashMap6.modCount;
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap(100, (float) 1);
        java.lang.Object obj14 = hashMap6.get((java.lang.Object) 1);
        boolean boolean15 = hashMap6.repOK();
        java.lang.Object obj16 = hashMap0.get((java.lang.Object) hashMap6);
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        boolean boolean18 = hashMap17.repOK();
        boolean boolean19 = hashMap17.isEmpty();
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        boolean boolean21 = hashMap20.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray22 = hashMap20.table;
        int int23 = hashMap20.modCount;
        java.lang.Object obj24 = hashMap17.remove((java.lang.Object) hashMap20);
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap();
        boolean boolean26 = hashMap25.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray27 = hashMap25.table;
        hashMap20.table = entryArray27;
        hashMap20.modCount = 0;
        int int31 = hashMap20.size();
        int int32 = hashMap20.size();
        system.classfixer.classes.HashMap.Entry[] entryArray33 = hashMap20.table;
        system.classfixer.classes.HashMap hashMap34 = new system.classfixer.classes.HashMap();
        boolean boolean35 = hashMap34.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray36 = hashMap34.table;
        int int37 = hashMap34.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray38 = hashMap34.table;
        java.lang.Object obj39 = hashMap20.remove((java.lang.Object) hashMap34);
        boolean boolean40 = hashMap34.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray41 = hashMap34.table;
        system.classfixer.classes.HashMap hashMap42 = new system.classfixer.classes.HashMap();
        boolean boolean43 = hashMap42.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray44 = hashMap42.table;
        hashMap42.modCount = (short) 0;
        int int47 = hashMap42.size();
        system.classfixer.classes.HashMap.Entry[] entryArray48 = hashMap42.table;
        int int49 = hashMap42.modCount;
        java.lang.Object obj50 = hashMap6.put((java.lang.Object) entryArray41, (java.lang.Object) hashMap42);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap6", hashMap6.repOK_2());
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(1, (float) 1L);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.repOK();
        java.lang.Object obj6 = hashMap3.get((java.lang.Object) 100.0d);
        int int7 = hashMap3.modCount;
        boolean boolean8 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap9.table;
        hashMap9.modCount = (short) 0;
        int int14 = hashMap9.size();
        java.lang.Object obj16 = hashMap9.get((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        boolean boolean18 = hashMap17.repOK();
        boolean boolean19 = hashMap17.isEmpty();
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        boolean boolean21 = hashMap20.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray22 = hashMap20.table;
        int int23 = hashMap20.modCount;
        java.lang.Object obj24 = hashMap17.remove((java.lang.Object) hashMap20);
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap();
        boolean boolean26 = hashMap25.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray27 = hashMap25.table;
        hashMap25.modCount = (short) 0;
        int int30 = hashMap25.size();
        java.lang.Object obj31 = hashMap17.get((java.lang.Object) hashMap25);
        system.classfixer.classes.HashMap.Entry[] entryArray32 = hashMap17.table;
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap();
        boolean boolean34 = hashMap33.repOK();
        java.lang.Object obj36 = hashMap33.get((java.lang.Object) 100.0d);
        int int37 = hashMap33.size();
        java.lang.Object obj38 = hashMap17.remove((java.lang.Object) hashMap33);
        int int39 = hashMap17.size();
        java.lang.Object obj40 = hashMap9.get((java.lang.Object) hashMap17);
        java.lang.Object obj41 = hashMap2.put((java.lang.Object) boolean8, (java.lang.Object) hashMap17);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) 100.0d);
        int int4 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        boolean boolean6 = hashMap5.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap5.table;
        int int8 = hashMap5.modCount;
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap9.table;
        int int12 = hashMap9.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap9.table;
        boolean boolean14 = hashMap9.isEmpty();
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        java.lang.Object obj17 = hashMap15.remove((java.lang.Object) 1.0d);
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        java.lang.Object obj20 = hashMap18.remove((java.lang.Object) 1.0d);
        int int21 = hashMap18.size();
        system.classfixer.classes.HashMap.Entry[] entryArray22 = hashMap18.table;
        hashMap15.table = entryArray22;
        hashMap9.table = entryArray22;
        hashMap5.table = entryArray22;
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap();
        boolean boolean27 = hashMap26.repOK();
        boolean boolean28 = hashMap26.isEmpty();
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap();
        boolean boolean30 = hashMap29.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray31 = hashMap29.table;
        int int32 = hashMap29.modCount;
        java.lang.Object obj33 = hashMap26.remove((java.lang.Object) hashMap29);
        system.classfixer.classes.HashMap hashMap34 = new system.classfixer.classes.HashMap();
        boolean boolean35 = hashMap34.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray36 = hashMap34.table;
        hashMap29.table = entryArray36;
        hashMap29.modCount = 0;
        int int40 = hashMap29.size();
        int int41 = hashMap29.size();
        system.classfixer.classes.HashMap.Entry[] entryArray42 = hashMap29.table;
        system.classfixer.classes.HashMap hashMap43 = new system.classfixer.classes.HashMap();
        boolean boolean44 = hashMap43.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray45 = hashMap43.table;
        int int46 = hashMap43.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray47 = hashMap43.table;
        java.lang.Object obj48 = hashMap29.remove((java.lang.Object) hashMap43);
        int int49 = hashMap29.modCount;
        java.lang.Object obj50 = hashMap0.put((java.lang.Object) entryArray22, (java.lang.Object) hashMap29);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 1, (float) 100L);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.repOK();
        boolean boolean5 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap6.table;
        int int9 = hashMap6.modCount;
        java.lang.Object obj10 = hashMap3.remove((java.lang.Object) hashMap6);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        boolean boolean12 = hashMap11.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap11.table;
        hashMap11.modCount = (short) 0;
        int int16 = hashMap11.size();
        java.lang.Object obj17 = hashMap3.get((java.lang.Object) hashMap11);
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        boolean boolean19 = hashMap18.repOK();
        boolean boolean20 = hashMap18.isEmpty();
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap();
        boolean boolean22 = hashMap21.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray23 = hashMap21.table;
        int int24 = hashMap21.modCount;
        java.lang.Object obj25 = hashMap18.remove((java.lang.Object) hashMap21);
        boolean boolean26 = hashMap21.isEmpty();
        java.lang.Object obj27 = hashMap11.get((java.lang.Object) hashMap21);
        int int28 = hashMap21.size();
        java.lang.Object obj29 = hashMap2.remove((java.lang.Object) hashMap21);
        int int30 = hashMap2.size();
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap();
        boolean boolean32 = hashMap31.isEmpty();
        int int33 = hashMap31.size();
        system.classfixer.classes.HashMap hashMap34 = new system.classfixer.classes.HashMap();
        boolean boolean35 = hashMap34.repOK();
        boolean boolean36 = hashMap34.isEmpty();
        system.classfixer.classes.HashMap hashMap37 = new system.classfixer.classes.HashMap();
        boolean boolean38 = hashMap37.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray39 = hashMap37.table;
        int int40 = hashMap37.modCount;
        java.lang.Object obj41 = hashMap34.remove((java.lang.Object) hashMap37);
        system.classfixer.classes.HashMap hashMap42 = new system.classfixer.classes.HashMap();
        boolean boolean43 = hashMap42.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray44 = hashMap42.table;
        hashMap37.table = entryArray44;
        hashMap37.modCount = 0;
        int int48 = hashMap37.size();
        int int49 = hashMap37.size();
        system.classfixer.classes.HashMap.Entry[] entryArray50 = hashMap37.table;
        system.classfixer.classes.HashMap hashMap51 = new system.classfixer.classes.HashMap();
        boolean boolean52 = hashMap51.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray53 = hashMap51.table;
        int int54 = hashMap51.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray55 = hashMap51.table;
        java.lang.Object obj56 = hashMap37.remove((java.lang.Object) hashMap51);
        boolean boolean57 = hashMap51.isEmpty();
        java.lang.Object obj58 = hashMap31.remove((java.lang.Object) hashMap51);
        system.classfixer.classes.HashMap.Entry[] entryArray59 = hashMap51.table;
        hashMap2.table = entryArray59;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap3.table;
        int int6 = hashMap3.modCount;
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) hashMap3);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap8.table;
        hashMap3.table = entryArray10;
        hashMap3.modCount = 0;
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        java.lang.Object obj16 = hashMap14.remove((java.lang.Object) 1.0d);
        int int17 = hashMap14.size();
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap14.table;
        java.lang.Object obj19 = hashMap3.get((java.lang.Object) entryArray18);
        boolean boolean20 = hashMap3.isEmpty();
        int int21 = hashMap3.size();
        hashMap3.modCount = (short) 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap3", hashMap3.repOK_2());
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap0.table;
        hashMap0.modCount = (short) 0;
        int int5 = hashMap0.size();
        java.lang.Object obj7 = hashMap0.get((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (short) 100, (float) 1);
        java.lang.Object obj11 = hashMap0.get((java.lang.Object) hashMap10);
        int int12 = hashMap10.modCount;
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        boolean boolean14 = hashMap13.repOK();
        boolean boolean15 = hashMap13.isEmpty();
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        boolean boolean17 = hashMap16.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap16.table;
        int int19 = hashMap16.modCount;
        java.lang.Object obj20 = hashMap13.remove((java.lang.Object) hashMap16);
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap();
        boolean boolean22 = hashMap21.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray23 = hashMap21.table;
        hashMap16.table = entryArray23;
        hashMap16.modCount = 0;
        int int27 = hashMap16.size();
        int int28 = hashMap16.size();
        system.classfixer.classes.HashMap.Entry[] entryArray29 = hashMap16.table;
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap();
        boolean boolean31 = hashMap30.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray32 = hashMap30.table;
        int int33 = hashMap30.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray34 = hashMap30.table;
        java.lang.Object obj35 = hashMap16.remove((java.lang.Object) hashMap30);
        system.classfixer.classes.HashMap.Entry[] entryArray36 = hashMap30.table;
        hashMap10.table = entryArray36;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap10", hashMap10.repOK_2());
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1.0d);
        int int3 = hashMap0.size();
        boolean boolean4 = hashMap0.repOK();
        hashMap0.modCount = (short) 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 0, (float) 10L);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap3.remove((java.lang.Object) 1.0d);
        int int6 = hashMap3.size();
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap3.table;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap8.table;
        hashMap8.modCount = (short) 0;
        int int13 = hashMap8.size();
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap8.table;
        java.lang.Object obj15 = hashMap2.put((java.lang.Object) entryArray7, (java.lang.Object) hashMap8);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap0.table;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap3.table;
        int int6 = hashMap3.modCount;
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) hashMap3);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap8.table;
        hashMap3.table = entryArray10;
        hashMap3.modCount = 0;
        int int14 = hashMap3.size();
        int int15 = hashMap3.size();
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap3.table;
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        boolean boolean18 = hashMap17.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap17.table;
        int int20 = hashMap17.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap17.table;
        java.lang.Object obj22 = hashMap3.remove((java.lang.Object) hashMap17);
        boolean boolean23 = hashMap17.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap17.table;
        hashMap17.modCount = 'a';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap17", hashMap17.repOK_2());
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) '4', 1.0f);
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap2.table;
        hashMap2.modCount = '#';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1.0d);
        int int3 = hashMap0.size();
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (short) -1);
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        boolean boolean7 = hashMap6.repOK();
        boolean boolean8 = hashMap6.isEmpty();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap9.table;
        int int12 = hashMap9.modCount;
        java.lang.Object obj13 = hashMap6.remove((java.lang.Object) hashMap9);
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        boolean boolean15 = hashMap14.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap14.table;
        hashMap9.table = entryArray16;
        hashMap0.table = entryArray16;
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        boolean boolean20 = hashMap19.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap19.table;
        hashMap19.modCount = (short) 0;
        int int24 = hashMap19.size();
        system.classfixer.classes.HashMap.Entry[] entryArray25 = hashMap19.table;
        int int26 = hashMap19.modCount;
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        system.classfixer.classes.HashMap.Entry[] entryArray30 = hashMap29.table;
        java.lang.Class<?> wildcardClass31 = entryArray30.getClass();
        java.lang.Object obj32 = hashMap19.get((java.lang.Object) entryArray30);
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        hashMap35.modCount = 0;
        system.classfixer.classes.HashMap hashMap38 = new system.classfixer.classes.HashMap();
        boolean boolean39 = hashMap38.repOK();
        boolean boolean40 = hashMap38.isEmpty();
        system.classfixer.classes.HashMap hashMap41 = new system.classfixer.classes.HashMap();
        boolean boolean42 = hashMap41.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray43 = hashMap41.table;
        int int44 = hashMap41.modCount;
        java.lang.Object obj45 = hashMap38.remove((java.lang.Object) hashMap41);
        system.classfixer.classes.HashMap hashMap46 = new system.classfixer.classes.HashMap();
        boolean boolean47 = hashMap46.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray48 = hashMap46.table;
        hashMap41.table = entryArray48;
        hashMap41.modCount = 0;
        int int52 = hashMap41.size();
        java.lang.Object obj53 = hashMap35.get((java.lang.Object) int52);
        hashMap35.modCount = (byte) 0;
        java.lang.Object obj56 = hashMap0.put((java.lang.Object) entryArray30, (java.lang.Object) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap0.table;
        hashMap0.modCount = (short) 0;
        int int5 = hashMap0.size();
        java.lang.Object obj7 = hashMap0.get((java.lang.Object) 0.0f);
        int int8 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (short) 10);
        int int11 = hashMap10.modCount;
        int int12 = hashMap10.size();
        boolean boolean13 = hashMap10.repOK();
        java.lang.Class<?> wildcardClass14 = hashMap10.getClass();
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        boolean boolean16 = hashMap15.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap15.table;
        hashMap15.modCount = (short) 0;
        boolean boolean20 = hashMap15.isEmpty();
        java.lang.Object obj21 = hashMap0.put((java.lang.Object) hashMap10, (java.lang.Object) hashMap15);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) ' ');
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) 100.0d);
        int int4 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap(100, (float) 1);
        java.lang.Object obj8 = hashMap0.get((java.lang.Object) 1);
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        java.lang.Object obj11 = hashMap9.remove((java.lang.Object) 1.0d);
        int int12 = hashMap9.size();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap9.table;
        int int14 = hashMap9.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap9.table;
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap9.table;
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        java.lang.Object obj19 = hashMap17.remove((java.lang.Object) 1.0d);
        int int20 = hashMap17.size();
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap17.table;
        system.classfixer.classes.HashMap.Entry[] entryArray22 = hashMap17.table;
        system.classfixer.classes.HashMap.Entry[] entryArray23 = hashMap17.table;
        java.lang.Object obj24 = hashMap0.put((java.lang.Object) entryArray16, (java.lang.Object) hashMap17);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap3.table;
        int int6 = hashMap3.modCount;
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) hashMap3);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap8.table;
        hashMap8.modCount = (short) 0;
        int int13 = hashMap8.size();
        java.lang.Object obj14 = hashMap0.get((java.lang.Object) hashMap8);
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        boolean boolean17 = hashMap16.repOK();
        java.lang.Object obj19 = hashMap16.get((java.lang.Object) 100.0d);
        int int20 = hashMap16.size();
        java.lang.Object obj21 = hashMap0.remove((java.lang.Object) hashMap16);
        system.classfixer.classes.HashMap.Entry[] entryArray22 = hashMap16.table;
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap();
        boolean boolean27 = hashMap26.repOK();
        boolean boolean28 = hashMap26.isEmpty();
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap();
        boolean boolean30 = hashMap29.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray31 = hashMap29.table;
        int int32 = hashMap29.modCount;
        java.lang.Object obj33 = hashMap26.remove((java.lang.Object) hashMap29);
        boolean boolean34 = hashMap29.isEmpty();
        boolean boolean35 = hashMap29.repOK();
        int int36 = hashMap29.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray37 = hashMap29.table;
        int int38 = hashMap29.size();
        java.lang.Object obj39 = hashMap16.put((java.lang.Object) (short) 0, (java.lang.Object) hashMap29);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap16", hashMap16.repOK_2());
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(0, (float) (short) 10);
        hashMap2.modCount = '4';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap3.table;
        int int6 = hashMap3.modCount;
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) hashMap3);
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap0.table;
        hashMap0.modCount = (short) 0;
        hashMap0.modCount = (short) 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) '4');
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1.0d);
        int int3 = hashMap0.size();
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap0.table;
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap0.table;
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap0.table;
        hashMap0.modCount = (byte) 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 100, (float) 1);
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap2.table;
        java.lang.Object obj4 = null;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        java.lang.Object obj7 = hashMap5.remove((java.lang.Object) 1.0d);
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap5.table;
        java.lang.Object obj9 = hashMap2.put(obj4, (java.lang.Object) hashMap5);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap3.table;
        int int6 = hashMap3.modCount;
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) hashMap3);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap8.table;
        hashMap3.table = entryArray10;
        hashMap3.modCount = 0;
        int int14 = hashMap3.size();
        int int15 = hashMap3.size();
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap3.table;
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap3.table;
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        boolean boolean19 = hashMap18.isEmpty();
        int int20 = hashMap18.size();
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap();
        boolean boolean22 = hashMap21.repOK();
        boolean boolean23 = hashMap21.isEmpty();
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap();
        boolean boolean25 = hashMap24.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray26 = hashMap24.table;
        int int27 = hashMap24.modCount;
        java.lang.Object obj28 = hashMap21.remove((java.lang.Object) hashMap24);
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap();
        boolean boolean30 = hashMap29.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray31 = hashMap29.table;
        hashMap24.table = entryArray31;
        hashMap24.modCount = 0;
        int int35 = hashMap24.size();
        int int36 = hashMap24.size();
        system.classfixer.classes.HashMap.Entry[] entryArray37 = hashMap24.table;
        system.classfixer.classes.HashMap hashMap38 = new system.classfixer.classes.HashMap();
        boolean boolean39 = hashMap38.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray40 = hashMap38.table;
        int int41 = hashMap38.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray42 = hashMap38.table;
        java.lang.Object obj43 = hashMap24.remove((java.lang.Object) hashMap38);
        boolean boolean44 = hashMap38.isEmpty();
        java.lang.Object obj45 = hashMap18.remove((java.lang.Object) hashMap38);
        system.classfixer.classes.HashMap.Entry[] entryArray46 = hashMap38.table;
        system.classfixer.classes.HashMap hashMap47 = new system.classfixer.classes.HashMap();
        boolean boolean48 = hashMap47.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray49 = hashMap47.table;
        int int50 = hashMap47.modCount;
        java.lang.Object obj51 = hashMap3.put((java.lang.Object) hashMap38, (java.lang.Object) hashMap47);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap3", hashMap3.repOK_2());
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        int int2 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap3.table;
        hashMap3.modCount = (short) 0;
        int int8 = hashMap3.size();
        java.lang.Object obj10 = hashMap3.get((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        boolean boolean12 = hashMap11.repOK();
        boolean boolean13 = hashMap11.isEmpty();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        boolean boolean15 = hashMap14.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap14.table;
        int int17 = hashMap14.modCount;
        java.lang.Object obj18 = hashMap11.remove((java.lang.Object) hashMap14);
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        boolean boolean20 = hashMap19.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap19.table;
        hashMap19.modCount = (short) 0;
        int int24 = hashMap19.size();
        java.lang.Object obj25 = hashMap11.get((java.lang.Object) hashMap19);
        system.classfixer.classes.HashMap.Entry[] entryArray26 = hashMap11.table;
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap();
        boolean boolean28 = hashMap27.repOK();
        java.lang.Object obj30 = hashMap27.get((java.lang.Object) 100.0d);
        int int31 = hashMap27.size();
        java.lang.Object obj32 = hashMap11.remove((java.lang.Object) hashMap27);
        int int33 = hashMap11.size();
        java.lang.Object obj34 = hashMap3.get((java.lang.Object) hashMap11);
        boolean boolean35 = hashMap3.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray36 = hashMap3.table;
        hashMap1.table = entryArray36;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) '4', 1.0f);
        boolean boolean3 = hashMap2.repOK();
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap0.table;
        hashMap0.modCount = (short) 0;
        int int5 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        boolean boolean7 = hashMap6.repOK();
        boolean boolean8 = hashMap6.isEmpty();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap9.table;
        int int12 = hashMap9.modCount;
        java.lang.Object obj13 = hashMap6.remove((java.lang.Object) hashMap9);
        boolean boolean14 = hashMap9.isEmpty();
        boolean boolean15 = hashMap9.repOK();
        int int16 = hashMap9.modCount;
        java.lang.Object obj17 = hashMap0.remove((java.lang.Object) int16);
        int int18 = hashMap0.size();
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap0.table;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1.0d);
        int int3 = hashMap0.size();
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap0.table;
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap0.table;
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap7.table;
        hashMap7.modCount = (short) 0;
        int int12 = hashMap7.size();
        java.lang.Object obj14 = hashMap7.get((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        boolean boolean16 = hashMap15.repOK();
        boolean boolean17 = hashMap15.isEmpty();
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        boolean boolean19 = hashMap18.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray20 = hashMap18.table;
        int int21 = hashMap18.modCount;
        java.lang.Object obj22 = hashMap15.remove((java.lang.Object) hashMap18);
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap();
        boolean boolean24 = hashMap23.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray25 = hashMap23.table;
        hashMap23.modCount = (short) 0;
        int int28 = hashMap23.size();
        java.lang.Object obj29 = hashMap15.get((java.lang.Object) hashMap23);
        system.classfixer.classes.HashMap.Entry[] entryArray30 = hashMap15.table;
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap();
        boolean boolean32 = hashMap31.repOK();
        java.lang.Object obj34 = hashMap31.get((java.lang.Object) 100.0d);
        int int35 = hashMap31.size();
        java.lang.Object obj36 = hashMap15.remove((java.lang.Object) hashMap31);
        int int37 = hashMap15.size();
        java.lang.Object obj38 = hashMap7.get((java.lang.Object) hashMap15);
        boolean boolean39 = hashMap7.repOK();
        system.classfixer.classes.HashMap hashMap40 = new system.classfixer.classes.HashMap();
        boolean boolean41 = hashMap40.repOK();
        boolean boolean42 = hashMap40.isEmpty();
        system.classfixer.classes.HashMap hashMap43 = new system.classfixer.classes.HashMap();
        boolean boolean44 = hashMap43.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray45 = hashMap43.table;
        int int46 = hashMap43.modCount;
        java.lang.Object obj47 = hashMap40.remove((java.lang.Object) hashMap43);
        boolean boolean48 = hashMap43.isEmpty();
        boolean boolean49 = hashMap43.repOK();
        java.lang.Object obj50 = hashMap7.get((java.lang.Object) boolean49);
        boolean boolean51 = hashMap7.isEmpty();
        system.classfixer.classes.HashMap hashMap52 = new system.classfixer.classes.HashMap();
        boolean boolean53 = hashMap52.repOK();
        boolean boolean54 = hashMap52.isEmpty();
        system.classfixer.classes.HashMap hashMap55 = new system.classfixer.classes.HashMap();
        boolean boolean56 = hashMap55.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray57 = hashMap55.table;
        int int58 = hashMap55.modCount;
        java.lang.Object obj59 = hashMap52.remove((java.lang.Object) hashMap55);
        system.classfixer.classes.HashMap hashMap60 = new system.classfixer.classes.HashMap();
        boolean boolean61 = hashMap60.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray62 = hashMap60.table;
        hashMap60.modCount = (short) 0;
        int int65 = hashMap60.size();
        java.lang.Object obj66 = hashMap52.get((java.lang.Object) hashMap60);
        system.classfixer.classes.HashMap hashMap67 = new system.classfixer.classes.HashMap();
        boolean boolean68 = hashMap67.repOK();
        boolean boolean69 = hashMap67.isEmpty();
        system.classfixer.classes.HashMap hashMap70 = new system.classfixer.classes.HashMap();
        boolean boolean71 = hashMap70.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray72 = hashMap70.table;
        int int73 = hashMap70.modCount;
        java.lang.Object obj74 = hashMap67.remove((java.lang.Object) hashMap70);
        boolean boolean75 = hashMap70.isEmpty();
        java.lang.Object obj76 = hashMap60.get((java.lang.Object) hashMap70);
        java.lang.Class<?> wildcardClass77 = hashMap60.getClass();
        java.lang.Object obj78 = hashMap0.put((java.lang.Object) boolean51, (java.lang.Object) wildcardClass77);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap3.table;
        int int6 = hashMap3.modCount;
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) hashMap3);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap8.table;
        hashMap8.modCount = (short) 0;
        int int13 = hashMap8.size();
        java.lang.Object obj14 = hashMap0.get((java.lang.Object) hashMap8);
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        boolean boolean17 = hashMap16.repOK();
        java.lang.Object obj19 = hashMap16.get((java.lang.Object) 100.0d);
        int int20 = hashMap16.size();
        java.lang.Object obj21 = hashMap0.remove((java.lang.Object) hashMap16);
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 1, (float) '#');
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.repOK();
        boolean boolean5 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap6.table;
        int int9 = hashMap6.modCount;
        java.lang.Object obj10 = hashMap3.remove((java.lang.Object) hashMap6);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        boolean boolean12 = hashMap11.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap11.table;
        hashMap6.table = entryArray13;
        hashMap6.modCount = 0;
        int int17 = hashMap6.size();
        int int18 = hashMap6.size();
        java.lang.Object obj19 = hashMap2.get((java.lang.Object) hashMap6);
        hashMap2.modCount = (short) 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap0.table;
        hashMap0.modCount = (short) 0;
        int int5 = hashMap0.size();
        java.lang.Object obj7 = hashMap0.get((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (short) 100, (float) 1);
        java.lang.Object obj11 = hashMap0.get((java.lang.Object) hashMap10);
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        boolean boolean13 = hashMap12.isEmpty();
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap((int) (byte) 10, (float) 10L);
        java.lang.Object obj17 = hashMap10.put((java.lang.Object) boolean13, (java.lang.Object) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap10", hashMap10.repOK_2());
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.repOK();
        boolean boolean5 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap6.table;
        int int9 = hashMap6.modCount;
        java.lang.Object obj10 = hashMap3.remove((java.lang.Object) hashMap6);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        boolean boolean12 = hashMap11.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap11.table;
        hashMap6.table = entryArray13;
        hashMap6.modCount = 0;
        int int17 = hashMap6.size();
        int int18 = hashMap6.size();
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap6.table;
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        boolean boolean21 = hashMap20.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray22 = hashMap20.table;
        int int23 = hashMap20.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap20.table;
        java.lang.Object obj25 = hashMap6.remove((java.lang.Object) hashMap20);
        boolean boolean26 = hashMap20.isEmpty();
        java.lang.Object obj27 = hashMap0.remove((java.lang.Object) hashMap20);
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 100, (float) 100L);
        int int3 = hashMap2.size();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap6.table;
        hashMap5.table = entryArray7;
        java.lang.Object obj10 = hashMap2.put((java.lang.Object) hashMap5, (java.lang.Object) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) 100.0d);
        hashMap0.modCount = (byte) 0;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        boolean boolean7 = hashMap6.repOK();
        java.lang.Object obj9 = hashMap6.get((java.lang.Object) 100.0d);
        int int10 = hashMap6.modCount;
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap(100, (float) 1);
        java.lang.Object obj14 = hashMap6.get((java.lang.Object) 1);
        boolean boolean15 = hashMap6.repOK();
        java.lang.Object obj16 = hashMap0.get((java.lang.Object) hashMap6);
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        boolean boolean18 = hashMap17.repOK();
        java.lang.Object obj20 = hashMap17.get((java.lang.Object) 100.0d);
        hashMap17.modCount = (byte) 0;
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap();
        boolean boolean24 = hashMap23.repOK();
        java.lang.Object obj26 = hashMap23.get((java.lang.Object) 100.0d);
        int int27 = hashMap23.modCount;
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap(100, (float) 1);
        java.lang.Object obj31 = hashMap23.get((java.lang.Object) 1);
        boolean boolean32 = hashMap23.repOK();
        java.lang.Object obj33 = hashMap17.get((java.lang.Object) hashMap23);
        system.classfixer.classes.HashMap hashMap34 = new system.classfixer.classes.HashMap();
        boolean boolean35 = hashMap34.repOK();
        boolean boolean36 = hashMap34.isEmpty();
        system.classfixer.classes.HashMap hashMap37 = new system.classfixer.classes.HashMap();
        boolean boolean38 = hashMap37.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray39 = hashMap37.table;
        int int40 = hashMap37.modCount;
        java.lang.Object obj41 = hashMap34.remove((java.lang.Object) hashMap37);
        system.classfixer.classes.HashMap hashMap42 = new system.classfixer.classes.HashMap();
        boolean boolean43 = hashMap42.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray44 = hashMap42.table;
        hashMap37.table = entryArray44;
        hashMap37.modCount = 0;
        int int48 = hashMap37.size();
        int int49 = hashMap37.size();
        system.classfixer.classes.HashMap.Entry[] entryArray50 = hashMap37.table;
        system.classfixer.classes.HashMap hashMap51 = new system.classfixer.classes.HashMap();
        boolean boolean52 = hashMap51.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray53 = hashMap51.table;
        int int54 = hashMap51.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray55 = hashMap51.table;
        java.lang.Object obj56 = hashMap37.remove((java.lang.Object) hashMap51);
        java.lang.Object obj57 = hashMap0.put((java.lang.Object) hashMap17, (java.lang.Object) hashMap37);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1.0d);
        int int3 = hashMap0.size();
        int int4 = hashMap0.size();
        boolean boolean5 = hashMap0.isEmpty();
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) 100.0d);
        int int4 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap(100, (float) 1);
        java.lang.Object obj8 = hashMap0.get((java.lang.Object) 1);
        boolean boolean9 = hashMap0.repOK();
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 1, (float) 100L);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.repOK();
        boolean boolean5 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap6.table;
        int int9 = hashMap6.modCount;
        java.lang.Object obj10 = hashMap3.remove((java.lang.Object) hashMap6);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        boolean boolean12 = hashMap11.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap11.table;
        hashMap11.modCount = (short) 0;
        int int16 = hashMap11.size();
        java.lang.Object obj17 = hashMap3.get((java.lang.Object) hashMap11);
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        boolean boolean19 = hashMap18.repOK();
        boolean boolean20 = hashMap18.isEmpty();
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap();
        boolean boolean22 = hashMap21.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray23 = hashMap21.table;
        int int24 = hashMap21.modCount;
        java.lang.Object obj25 = hashMap18.remove((java.lang.Object) hashMap21);
        boolean boolean26 = hashMap21.isEmpty();
        java.lang.Object obj27 = hashMap11.get((java.lang.Object) hashMap21);
        int int28 = hashMap21.size();
        java.lang.Object obj29 = hashMap2.remove((java.lang.Object) hashMap21);
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap();
        boolean boolean31 = hashMap30.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray32 = hashMap30.table;
        java.lang.Object obj33 = null;
        java.lang.Object obj34 = hashMap30.remove(obj33);
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap();
        java.lang.Object obj37 = hashMap35.remove((java.lang.Object) 1.0d);
        int int38 = hashMap35.size();
        system.classfixer.classes.HashMap.Entry[] entryArray39 = hashMap35.table;
        system.classfixer.classes.HashMap.Entry[] entryArray40 = hashMap35.table;
        java.lang.Object obj41 = hashMap30.get((java.lang.Object) hashMap35);
        system.classfixer.classes.HashMap.Entry[] entryArray42 = hashMap35.table;
        hashMap2.table = entryArray42;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) 100.0d);
        hashMap0.modCount = (byte) 0;
        int int6 = hashMap0.size();
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1.0d);
        int int3 = hashMap0.size();
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap0.table;
        boolean boolean5 = hashMap0.isEmpty();
        int int6 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        boolean boolean8 = hashMap7.repOK();
        boolean boolean9 = hashMap7.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap7.table;
        hashMap0.table = entryArray10;
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
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap3.table;
        int int6 = hashMap3.modCount;
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) hashMap3);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap8.table;
        hashMap3.table = entryArray10;
        hashMap3.modCount = 0;
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        java.lang.Object obj16 = hashMap14.remove((java.lang.Object) 1.0d);
        int int17 = hashMap14.size();
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap14.table;
        java.lang.Object obj19 = hashMap3.get((java.lang.Object) entryArray18);
        boolean boolean20 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        int int23 = hashMap22.size();
        java.lang.Object obj24 = hashMap3.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap22);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap3", hashMap3.repOK_2());
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) 100.0d);
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = hashMap0.remove(obj4);
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        java.lang.Object obj8 = hashMap6.remove((java.lang.Object) 1.0d);
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        java.lang.Object obj11 = hashMap9.remove((java.lang.Object) 1.0d);
        int int12 = hashMap9.size();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap9.table;
        hashMap6.table = entryArray13;
        int int15 = hashMap6.size();
        java.lang.Object obj17 = hashMap6.remove((java.lang.Object) '4');
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        boolean boolean19 = hashMap18.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray20 = hashMap18.table;
        java.lang.Object obj21 = null;
        java.lang.Object obj22 = hashMap18.remove(obj21);
        java.lang.Object obj23 = hashMap0.put(obj17, obj21);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap3.table;
        int int6 = hashMap3.modCount;
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) hashMap3);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap8.table;
        hashMap3.table = entryArray10;
        boolean boolean12 = hashMap3.isEmpty();
        hashMap3.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap3", hashMap3.repOK_2());
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap0.table;
        hashMap0.modCount = (short) 0;
        int int5 = hashMap0.size();
        boolean boolean6 = hashMap0.repOK();
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1.0d);
        int int3 = hashMap0.size();
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap0.table;
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap0.table;
        boolean boolean6 = hashMap0.repOK();
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap0.table;
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = hashMap0.remove(obj3);
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        java.lang.Object obj7 = hashMap5.remove((java.lang.Object) 1.0d);
        int int8 = hashMap5.size();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap5.table;
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap5.table;
        hashMap0.table = entryArray10;
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        boolean boolean13 = hashMap12.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap12.table;
        hashMap12.modCount = (short) 0;
        int int17 = hashMap12.size();
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap12.table;
        int int19 = hashMap12.modCount;
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        boolean boolean21 = hashMap20.repOK();
        boolean boolean22 = hashMap20.isEmpty();
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap();
        boolean boolean24 = hashMap23.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray25 = hashMap23.table;
        int int26 = hashMap23.modCount;
        java.lang.Object obj27 = hashMap20.remove((java.lang.Object) hashMap23);
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap();
        boolean boolean29 = hashMap28.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray30 = hashMap28.table;
        hashMap23.table = entryArray30;
        hashMap23.modCount = 0;
        int int34 = hashMap23.size();
        int int35 = hashMap23.size();
        system.classfixer.classes.HashMap.Entry[] entryArray36 = hashMap23.table;
        hashMap12.table = entryArray36;
        int int38 = hashMap12.modCount;
        java.lang.Object obj39 = hashMap0.remove((java.lang.Object) hashMap12);
        hashMap12.modCount = 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap12", hashMap12.repOK_2());
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) 100.0d);
        hashMap0.modCount = (byte) 0;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        boolean boolean7 = hashMap6.repOK();
        java.lang.Object obj9 = hashMap6.get((java.lang.Object) 100.0d);
        int int10 = hashMap6.modCount;
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap(100, (float) 1);
        java.lang.Object obj14 = hashMap6.get((java.lang.Object) 1);
        boolean boolean15 = hashMap6.repOK();
        java.lang.Object obj16 = hashMap0.get((java.lang.Object) hashMap6);
        hashMap6.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap6", hashMap6.repOK_2());
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 100, (float) 1);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap3.remove((java.lang.Object) 1.0d);
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        java.lang.Object obj8 = hashMap6.remove((java.lang.Object) 1.0d);
        int int9 = hashMap6.size();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap6.table;
        hashMap3.table = entryArray10;
        int int12 = hashMap3.size();
        java.lang.Object obj13 = hashMap2.get((java.lang.Object) int12);
        hashMap2.modCount = (short) 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap0.table;
        int int3 = hashMap0.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap0.table;
        boolean boolean5 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        java.lang.Object obj8 = hashMap6.remove((java.lang.Object) 1.0d);
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        java.lang.Object obj11 = hashMap9.remove((java.lang.Object) 1.0d);
        int int12 = hashMap9.size();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap9.table;
        hashMap6.table = entryArray13;
        hashMap0.table = entryArray13;
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        boolean boolean17 = hashMap16.repOK();
        boolean boolean18 = hashMap16.isEmpty();
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        boolean boolean20 = hashMap19.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap19.table;
        int int22 = hashMap19.modCount;
        java.lang.Object obj23 = hashMap16.remove((java.lang.Object) hashMap19);
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap();
        boolean boolean25 = hashMap24.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray26 = hashMap24.table;
        hashMap19.table = entryArray26;
        hashMap19.modCount = 0;
        int int30 = hashMap19.size();
        int int31 = hashMap19.size();
        system.classfixer.classes.HashMap.Entry[] entryArray32 = hashMap19.table;
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap();
        boolean boolean34 = hashMap33.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray35 = hashMap33.table;
        int int36 = hashMap33.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray37 = hashMap33.table;
        java.lang.Object obj38 = hashMap19.remove((java.lang.Object) hashMap33);
        boolean boolean39 = hashMap33.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray40 = hashMap33.table;
        java.lang.Object obj41 = hashMap0.remove((java.lang.Object) hashMap33);
        system.classfixer.classes.HashMap hashMap42 = new system.classfixer.classes.HashMap();
        boolean boolean43 = hashMap42.repOK();
        boolean boolean44 = hashMap42.isEmpty();
        system.classfixer.classes.HashMap hashMap45 = new system.classfixer.classes.HashMap();
        boolean boolean46 = hashMap45.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray47 = hashMap45.table;
        int int48 = hashMap45.modCount;
        java.lang.Object obj49 = hashMap42.remove((java.lang.Object) hashMap45);
        system.classfixer.classes.HashMap hashMap50 = new system.classfixer.classes.HashMap();
        boolean boolean51 = hashMap50.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray52 = hashMap50.table;
        hashMap45.table = entryArray52;
        java.lang.Object obj54 = hashMap33.remove((java.lang.Object) hashMap45);
        hashMap33.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap33", hashMap33.repOK_2());
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap3.table;
        int int6 = hashMap3.modCount;
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) hashMap3);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap8.table;
        hashMap8.modCount = (short) 0;
        int int13 = hashMap8.size();
        java.lang.Object obj14 = hashMap0.get((java.lang.Object) hashMap8);
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        boolean boolean16 = hashMap15.repOK();
        boolean boolean17 = hashMap15.isEmpty();
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        boolean boolean19 = hashMap18.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray20 = hashMap18.table;
        int int21 = hashMap18.modCount;
        java.lang.Object obj22 = hashMap15.remove((java.lang.Object) hashMap18);
        boolean boolean23 = hashMap18.isEmpty();
        java.lang.Object obj24 = hashMap8.get((java.lang.Object) hashMap18);
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap(0, (float) 10);
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap();
        boolean boolean29 = hashMap28.repOK();
        boolean boolean30 = hashMap28.isEmpty();
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap();
        boolean boolean32 = hashMap31.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray33 = hashMap31.table;
        int int34 = hashMap31.modCount;
        java.lang.Object obj35 = hashMap28.remove((java.lang.Object) hashMap31);
        system.classfixer.classes.HashMap hashMap36 = new system.classfixer.classes.HashMap();
        boolean boolean37 = hashMap36.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray38 = hashMap36.table;
        hashMap36.modCount = (short) 0;
        int int41 = hashMap36.size();
        java.lang.Object obj42 = hashMap28.get((java.lang.Object) hashMap36);
        system.classfixer.classes.HashMap.Entry[] entryArray43 = hashMap28.table;
        system.classfixer.classes.HashMap hashMap44 = new system.classfixer.classes.HashMap();
        boolean boolean45 = hashMap44.repOK();
        java.lang.Object obj47 = hashMap44.get((java.lang.Object) 100.0d);
        int int48 = hashMap44.size();
        java.lang.Object obj49 = hashMap28.remove((java.lang.Object) hashMap44);
        java.lang.Object obj50 = hashMap27.remove((java.lang.Object) hashMap44);
        system.classfixer.classes.HashMap hashMap51 = new system.classfixer.classes.HashMap();
        boolean boolean52 = hashMap51.repOK();
        boolean boolean53 = hashMap51.isEmpty();
        system.classfixer.classes.HashMap hashMap54 = new system.classfixer.classes.HashMap();
        boolean boolean55 = hashMap54.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray56 = hashMap54.table;
        int int57 = hashMap54.modCount;
        java.lang.Object obj58 = hashMap51.remove((java.lang.Object) hashMap54);
        system.classfixer.classes.HashMap hashMap59 = new system.classfixer.classes.HashMap();
        boolean boolean60 = hashMap59.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray61 = hashMap59.table;
        hashMap59.modCount = (short) 0;
        int int64 = hashMap59.size();
        java.lang.Object obj65 = hashMap51.get((java.lang.Object) hashMap59);
        system.classfixer.classes.HashMap.Entry[] entryArray66 = hashMap51.table;
        java.lang.Object obj67 = hashMap44.get((java.lang.Object) hashMap51);
        system.classfixer.classes.HashMap hashMap68 = new system.classfixer.classes.HashMap();
        java.lang.Object obj70 = hashMap68.remove((java.lang.Object) 1.0d);
        int int71 = hashMap68.size();
        system.classfixer.classes.HashMap.Entry[] entryArray72 = hashMap68.table;
        system.classfixer.classes.HashMap.Entry[] entryArray73 = hashMap68.table;
        system.classfixer.classes.HashMap.Entry[] entryArray74 = hashMap68.table;
        java.lang.Object obj75 = hashMap8.put(obj67, (java.lang.Object) entryArray74);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap8", hashMap8.repOK_2());
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap3.table;
        int int6 = hashMap3.modCount;
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) hashMap3);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap8.table;
        hashMap3.table = entryArray10;
        hashMap3.modCount = 0;
        int int14 = hashMap3.size();
        int int15 = hashMap3.size();
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap3.table;
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        boolean boolean18 = hashMap17.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap17.table;
        int int20 = hashMap17.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap17.table;
        java.lang.Object obj22 = hashMap3.remove((java.lang.Object) hashMap17);
        hashMap3.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap3", hashMap3.repOK_2());
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(100, (float) 1L);
        int int3 = hashMap2.modCount;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) '4', 1.0f);
        boolean boolean7 = hashMap6.repOK();
        java.lang.Object obj8 = hashMap2.remove((java.lang.Object) boolean7);
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap0.table;
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = hashMap0.remove(obj3);
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        java.lang.Object obj7 = hashMap5.remove((java.lang.Object) 1.0d);
        int int8 = hashMap5.size();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap5.table;
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap5.table;
        java.lang.Object obj11 = hashMap0.get((java.lang.Object) hashMap5);
        hashMap5.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap5", hashMap5.repOK_2());
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap0.table;
        int int3 = hashMap0.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap0.table;
        boolean boolean5 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        java.lang.Object obj8 = hashMap6.remove((java.lang.Object) 1.0d);
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        java.lang.Object obj11 = hashMap9.remove((java.lang.Object) 1.0d);
        int int12 = hashMap9.size();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap9.table;
        hashMap6.table = entryArray13;
        hashMap0.table = entryArray13;
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap((int) ' ');
        boolean boolean18 = hashMap17.repOK();
        boolean boolean19 = hashMap17.isEmpty();
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        java.lang.Object obj22 = hashMap20.remove((java.lang.Object) 1.0d);
        int int23 = hashMap20.size();
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap20.table;
        int int25 = hashMap20.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray26 = hashMap20.table;
        system.classfixer.classes.HashMap.Entry[] entryArray27 = hashMap20.table;
        java.lang.Object obj28 = hashMap0.put((java.lang.Object) hashMap17, (java.lang.Object) hashMap20);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap0.table;
        hashMap0.modCount = (short) 0;
        boolean boolean5 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        java.lang.Object obj8 = hashMap6.remove((java.lang.Object) 1.0d);
        int int9 = hashMap6.size();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap6.table;
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap6.table;
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap6.table;
        java.lang.Object obj13 = hashMap0.remove((java.lang.Object) entryArray12);
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap0.table;
        java.lang.Object obj15 = null;
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap((int) (byte) 100);
        int int18 = hashMap17.size();
        java.lang.Object obj19 = hashMap0.put(obj15, (java.lang.Object) hashMap17);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap3.table;
        int int6 = hashMap3.modCount;
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) hashMap3);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap8.table;
        hashMap3.table = entryArray10;
        hashMap3.modCount = 0;
        int int14 = hashMap3.size();
        int int15 = hashMap3.size();
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap((int) (short) 1, (float) 100L);
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        boolean boolean20 = hashMap19.repOK();
        boolean boolean21 = hashMap19.isEmpty();
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        boolean boolean23 = hashMap22.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap22.table;
        int int25 = hashMap22.modCount;
        java.lang.Object obj26 = hashMap19.remove((java.lang.Object) hashMap22);
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap();
        boolean boolean28 = hashMap27.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray29 = hashMap27.table;
        hashMap27.modCount = (short) 0;
        int int32 = hashMap27.size();
        java.lang.Object obj33 = hashMap19.get((java.lang.Object) hashMap27);
        system.classfixer.classes.HashMap hashMap34 = new system.classfixer.classes.HashMap();
        boolean boolean35 = hashMap34.repOK();
        boolean boolean36 = hashMap34.isEmpty();
        system.classfixer.classes.HashMap hashMap37 = new system.classfixer.classes.HashMap();
        boolean boolean38 = hashMap37.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray39 = hashMap37.table;
        int int40 = hashMap37.modCount;
        java.lang.Object obj41 = hashMap34.remove((java.lang.Object) hashMap37);
        boolean boolean42 = hashMap37.isEmpty();
        java.lang.Object obj43 = hashMap27.get((java.lang.Object) hashMap37);
        int int44 = hashMap37.size();
        java.lang.Object obj45 = hashMap18.remove((java.lang.Object) hashMap37);
        int int46 = hashMap18.size();
        system.classfixer.classes.HashMap hashMap47 = new system.classfixer.classes.HashMap();
        boolean boolean48 = hashMap47.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray49 = hashMap47.table;
        int int50 = hashMap47.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray51 = hashMap47.table;
        system.classfixer.classes.HashMap hashMap52 = new system.classfixer.classes.HashMap();
        boolean boolean53 = hashMap52.repOK();
        java.lang.Object obj55 = hashMap52.get((java.lang.Object) 100.0d);
        hashMap52.modCount = (byte) 0;
        system.classfixer.classes.HashMap.Entry[] entryArray58 = hashMap52.table;
        java.lang.Object obj59 = hashMap47.get((java.lang.Object) entryArray58);
        system.classfixer.classes.HashMap hashMap60 = new system.classfixer.classes.HashMap();
        boolean boolean61 = hashMap60.isEmpty();
        int int62 = hashMap60.size();
        system.classfixer.classes.HashMap hashMap63 = new system.classfixer.classes.HashMap();
        boolean boolean64 = hashMap63.repOK();
        boolean boolean65 = hashMap63.isEmpty();
        system.classfixer.classes.HashMap hashMap66 = new system.classfixer.classes.HashMap();
        boolean boolean67 = hashMap66.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray68 = hashMap66.table;
        int int69 = hashMap66.modCount;
        java.lang.Object obj70 = hashMap63.remove((java.lang.Object) hashMap66);
        system.classfixer.classes.HashMap hashMap71 = new system.classfixer.classes.HashMap();
        boolean boolean72 = hashMap71.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray73 = hashMap71.table;
        hashMap66.table = entryArray73;
        hashMap66.modCount = 0;
        int int77 = hashMap66.size();
        int int78 = hashMap66.size();
        system.classfixer.classes.HashMap.Entry[] entryArray79 = hashMap66.table;
        system.classfixer.classes.HashMap hashMap80 = new system.classfixer.classes.HashMap();
        boolean boolean81 = hashMap80.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray82 = hashMap80.table;
        int int83 = hashMap80.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray84 = hashMap80.table;
        java.lang.Object obj85 = hashMap66.remove((java.lang.Object) hashMap80);
        boolean boolean86 = hashMap80.isEmpty();
        java.lang.Object obj87 = hashMap60.remove((java.lang.Object) hashMap80);
        system.classfixer.classes.HashMap hashMap88 = new system.classfixer.classes.HashMap();
        java.lang.Object obj90 = hashMap88.remove((java.lang.Object) 1.0d);
        int int91 = hashMap88.size();
        system.classfixer.classes.HashMap.Entry[] entryArray92 = hashMap88.table;
        int int93 = hashMap88.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray94 = hashMap88.table;
        java.lang.Object obj95 = hashMap60.remove((java.lang.Object) entryArray94);
        hashMap47.table = entryArray94;
        java.lang.Object obj97 = hashMap3.put((java.lang.Object) hashMap18, (java.lang.Object) hashMap47);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap3", hashMap3.repOK_2());
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap3.table;
        int int6 = hashMap3.modCount;
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) hashMap3);
        boolean boolean8 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        boolean boolean10 = hashMap9.repOK();
        boolean boolean11 = hashMap9.isEmpty();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        boolean boolean13 = hashMap12.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap12.table;
        int int15 = hashMap12.modCount;
        java.lang.Object obj16 = hashMap9.remove((java.lang.Object) hashMap12);
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        boolean boolean18 = hashMap17.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap17.table;
        hashMap12.table = entryArray19;
        hashMap12.modCount = 0;
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap();
        java.lang.Object obj25 = hashMap23.remove((java.lang.Object) 1.0d);
        int int26 = hashMap23.size();
        system.classfixer.classes.HashMap.Entry[] entryArray27 = hashMap23.table;
        java.lang.Object obj28 = hashMap12.get((java.lang.Object) entryArray27);
        boolean boolean29 = hashMap12.isEmpty();
        java.lang.Object obj30 = hashMap3.remove((java.lang.Object) boolean29);
        hashMap3.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap3", hashMap3.repOK_2());
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap0.table;
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = hashMap0.remove(obj3);
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        java.lang.Object obj7 = hashMap5.remove((java.lang.Object) 1.0d);
        int int8 = hashMap5.size();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap5.table;
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap5.table;
        java.lang.Object obj11 = hashMap0.get((java.lang.Object) hashMap5);
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap5.table;
        boolean boolean13 = hashMap5.isEmpty();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        boolean boolean15 = hashMap14.repOK();
        boolean boolean16 = hashMap14.isEmpty();
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        boolean boolean18 = hashMap17.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap17.table;
        int int20 = hashMap17.modCount;
        java.lang.Object obj21 = hashMap14.remove((java.lang.Object) hashMap17);
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        boolean boolean23 = hashMap22.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap22.table;
        hashMap17.table = entryArray24;
        hashMap17.modCount = 0;
        int int28 = hashMap17.size();
        int int29 = hashMap17.size();
        boolean boolean30 = hashMap17.repOK();
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap();
        boolean boolean32 = hashMap31.repOK();
        boolean boolean33 = hashMap31.isEmpty();
        java.lang.Object obj35 = hashMap31.get((java.lang.Object) (byte) 0);
        java.lang.Object obj36 = hashMap5.put((java.lang.Object) boolean30, obj35);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap5", hashMap5.repOK_2());
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 100, (float) 100L);
        int int3 = hashMap2.size();
        hashMap2.modCount = '4';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1.0d);
        int int3 = hashMap0.size();
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (short) -1);
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        boolean boolean7 = hashMap6.repOK();
        boolean boolean8 = hashMap6.isEmpty();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap9.table;
        int int12 = hashMap9.modCount;
        java.lang.Object obj13 = hashMap6.remove((java.lang.Object) hashMap9);
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        boolean boolean15 = hashMap14.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap14.table;
        hashMap9.table = entryArray16;
        hashMap0.table = entryArray16;
        boolean boolean19 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        boolean boolean21 = hashMap20.isEmpty();
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        boolean boolean23 = hashMap22.isEmpty();
        int int24 = hashMap22.size();
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap();
        boolean boolean26 = hashMap25.repOK();
        boolean boolean27 = hashMap25.isEmpty();
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap();
        boolean boolean29 = hashMap28.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray30 = hashMap28.table;
        int int31 = hashMap28.modCount;
        java.lang.Object obj32 = hashMap25.remove((java.lang.Object) hashMap28);
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap();
        boolean boolean34 = hashMap33.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray35 = hashMap33.table;
        hashMap28.table = entryArray35;
        hashMap28.modCount = 0;
        int int39 = hashMap28.size();
        int int40 = hashMap28.size();
        system.classfixer.classes.HashMap.Entry[] entryArray41 = hashMap28.table;
        system.classfixer.classes.HashMap hashMap42 = new system.classfixer.classes.HashMap();
        boolean boolean43 = hashMap42.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray44 = hashMap42.table;
        int int45 = hashMap42.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray46 = hashMap42.table;
        java.lang.Object obj47 = hashMap28.remove((java.lang.Object) hashMap42);
        boolean boolean48 = hashMap42.isEmpty();
        java.lang.Object obj49 = hashMap22.remove((java.lang.Object) hashMap42);
        system.classfixer.classes.HashMap hashMap50 = new system.classfixer.classes.HashMap();
        java.lang.Object obj52 = hashMap50.remove((java.lang.Object) 1.0d);
        int int53 = hashMap50.size();
        system.classfixer.classes.HashMap.Entry[] entryArray54 = hashMap50.table;
        int int55 = hashMap50.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray56 = hashMap50.table;
        java.lang.Object obj57 = hashMap22.remove((java.lang.Object) entryArray56);
        java.lang.Object obj58 = hashMap0.put((java.lang.Object) boolean21, obj57);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 0, (float) 10L);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.repOK();
        boolean boolean5 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap6.table;
        int int9 = hashMap6.modCount;
        java.lang.Object obj10 = hashMap3.remove((java.lang.Object) hashMap6);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        boolean boolean12 = hashMap11.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap11.table;
        hashMap6.table = entryArray13;
        hashMap6.modCount = 0;
        int int17 = hashMap6.size();
        int int18 = hashMap6.size();
        int int19 = hashMap6.size();
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        java.lang.Object obj22 = hashMap20.remove((java.lang.Object) 1.0d);
        int int23 = hashMap20.size();
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap20.table;
        hashMap6.table = entryArray24;
        int int26 = hashMap6.size();
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap();
        boolean boolean28 = hashMap27.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray29 = hashMap27.table;
        int int30 = hashMap27.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray31 = hashMap27.table;
        java.lang.Class<?> wildcardClass32 = hashMap27.getClass();
        java.lang.Object obj33 = hashMap2.put((java.lang.Object) int26, (java.lang.Object) wildcardClass32);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap3.table;
        int int6 = hashMap3.modCount;
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) hashMap3);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap8.table;
        hashMap3.table = entryArray10;
        hashMap3.modCount = 0;
        int int14 = hashMap3.size();
        int int15 = hashMap3.size();
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap3.table;
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        boolean boolean18 = hashMap17.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap17.table;
        int int20 = hashMap17.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap17.table;
        java.lang.Object obj22 = hashMap3.remove((java.lang.Object) hashMap17);
        int int23 = hashMap3.modCount;
        boolean boolean24 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap();
        java.lang.Object obj27 = hashMap25.remove((java.lang.Object) 1.0d);
        java.lang.Object obj28 = hashMap3.get((java.lang.Object) 1.0d);
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap(10, (float) 'a');
        system.classfixer.classes.HashMap hashMap34 = new system.classfixer.classes.HashMap((int) (short) 1, (float) '#');
        java.lang.Object obj35 = hashMap3.put((java.lang.Object) 10, (java.lang.Object) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap3", hashMap3.repOK_2());
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.repOK();
        boolean boolean5 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap6.table;
        int int9 = hashMap6.modCount;
        java.lang.Object obj10 = hashMap3.remove((java.lang.Object) hashMap6);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        boolean boolean12 = hashMap11.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap11.table;
        hashMap6.table = entryArray13;
        hashMap6.modCount = 0;
        int int17 = hashMap6.size();
        int int18 = hashMap6.size();
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap6.table;
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        boolean boolean21 = hashMap20.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray22 = hashMap20.table;
        int int23 = hashMap20.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap20.table;
        java.lang.Object obj25 = hashMap6.remove((java.lang.Object) hashMap20);
        boolean boolean26 = hashMap20.isEmpty();
        java.lang.Object obj27 = hashMap0.remove((java.lang.Object) hashMap20);
        hashMap20.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap20", hashMap20.repOK_2());
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap3.table;
        int int6 = hashMap3.modCount;
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) hashMap3);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap8.table;
        hashMap3.table = entryArray10;
        hashMap3.modCount = 0;
        int int14 = hashMap3.size();
        int int15 = hashMap3.size();
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap3.table;
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        boolean boolean18 = hashMap17.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap17.table;
        int int20 = hashMap17.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap17.table;
        java.lang.Object obj22 = hashMap3.remove((java.lang.Object) hashMap17);
        system.classfixer.classes.HashMap.Entry[] entryArray23 = hashMap17.table;
        int int24 = hashMap17.modCount;
        hashMap17.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap17", hashMap17.repOK_2());
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        int int2 = hashMap1.modCount;
        boolean boolean3 = hashMap1.isEmpty();
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        boolean boolean3 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj6 = hashMap4.remove((java.lang.Object) 1.0d);
        int int7 = hashMap4.size();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap4.table;
        java.lang.Object obj9 = hashMap0.get((java.lang.Object) entryArray8);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap10.table;
        int int13 = hashMap10.modCount;
        boolean boolean14 = hashMap10.isEmpty();
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        boolean boolean16 = hashMap15.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap15.table;
        hashMap10.table = entryArray17;
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        boolean boolean20 = hashMap19.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap19.table;
        hashMap19.modCount = (short) 0;
        int int24 = hashMap19.size();
        boolean boolean25 = hashMap19.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray26 = hashMap19.table;
        java.lang.Object obj27 = hashMap0.put((java.lang.Object) hashMap10, (java.lang.Object) hashMap19);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1.0d);
        int int3 = hashMap0.size();
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap0.table;
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap0.table;
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap0.table;
        int int7 = hashMap0.size();
        hashMap0.modCount = '4';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(0, (float) (byte) 100);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap3.table;
        hashMap2.table = entryArray4;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) '4', 1.0f);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.repOK();
        java.lang.Object obj5 = hashMap2.get((java.lang.Object) boolean4);
        boolean boolean6 = hashMap2.isEmpty();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Object obj9 = hashMap2.remove((java.lang.Object) hashMap8);
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap3.table;
        int int6 = hashMap3.modCount;
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) hashMap3);
        boolean boolean8 = hashMap3.isEmpty();
        boolean boolean9 = hashMap3.repOK();
        int int10 = hashMap3.modCount;
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        boolean boolean12 = hashMap11.isEmpty();
        int int13 = hashMap11.size();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        boolean boolean15 = hashMap14.repOK();
        boolean boolean16 = hashMap14.isEmpty();
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        boolean boolean18 = hashMap17.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap17.table;
        int int20 = hashMap17.modCount;
        java.lang.Object obj21 = hashMap14.remove((java.lang.Object) hashMap17);
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        boolean boolean23 = hashMap22.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap22.table;
        hashMap17.table = entryArray24;
        hashMap17.modCount = 0;
        int int28 = hashMap17.size();
        int int29 = hashMap17.size();
        system.classfixer.classes.HashMap.Entry[] entryArray30 = hashMap17.table;
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap();
        boolean boolean32 = hashMap31.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray33 = hashMap31.table;
        int int34 = hashMap31.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray35 = hashMap31.table;
        java.lang.Object obj36 = hashMap17.remove((java.lang.Object) hashMap31);
        boolean boolean37 = hashMap31.isEmpty();
        java.lang.Object obj38 = hashMap11.remove((java.lang.Object) hashMap31);
        system.classfixer.classes.HashMap hashMap39 = new system.classfixer.classes.HashMap();
        java.lang.Object obj41 = hashMap39.remove((java.lang.Object) 1.0d);
        int int42 = hashMap39.size();
        system.classfixer.classes.HashMap.Entry[] entryArray43 = hashMap39.table;
        int int44 = hashMap39.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray45 = hashMap39.table;
        java.lang.Object obj46 = hashMap11.remove((java.lang.Object) entryArray45);
        system.classfixer.classes.HashMap hashMap47 = new system.classfixer.classes.HashMap();
        boolean boolean48 = hashMap47.repOK();
        boolean boolean49 = hashMap47.isEmpty();
        system.classfixer.classes.HashMap hashMap50 = new system.classfixer.classes.HashMap();
        boolean boolean51 = hashMap50.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray52 = hashMap50.table;
        int int53 = hashMap50.modCount;
        java.lang.Object obj54 = hashMap47.remove((java.lang.Object) hashMap50);
        java.lang.Object obj55 = hashMap3.put((java.lang.Object) hashMap11, (java.lang.Object) hashMap47);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap3", hashMap3.repOK_2());
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        int int2 = hashMap1.size();
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) '4', 1.0f);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.repOK();
        java.lang.Object obj5 = hashMap2.get((java.lang.Object) boolean4);
        hashMap2.modCount = 0;
        hashMap2.modCount = (short) 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap0.table;
        hashMap0.modCount = (short) 0;
        int int5 = hashMap0.size();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap0.table;
        int int7 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap10.table;
        java.lang.Class<?> wildcardClass12 = entryArray11.getClass();
        java.lang.Object obj13 = hashMap0.get((java.lang.Object) entryArray11);
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap16.table;
        hashMap15.table = entryArray17;
        hashMap0.table = entryArray17;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 100, (float) 10);
        hashMap2.modCount = (byte) 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(10, (float) '#');
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap3.remove((java.lang.Object) 1.0d);
        int int6 = hashMap3.size();
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap3.table;
        boolean boolean8 = hashMap3.isEmpty();
        int int9 = hashMap3.modCount;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        boolean boolean11 = hashMap10.repOK();
        boolean boolean12 = hashMap10.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap10.table;
        hashMap3.table = entryArray13;
        hashMap2.table = entryArray13;
        int int16 = hashMap2.modCount;
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        boolean boolean18 = hashMap17.repOK();
        boolean boolean19 = hashMap17.isEmpty();
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        boolean boolean21 = hashMap20.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray22 = hashMap20.table;
        int int23 = hashMap20.modCount;
        java.lang.Object obj24 = hashMap17.remove((java.lang.Object) hashMap20);
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap();
        boolean boolean26 = hashMap25.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray27 = hashMap25.table;
        hashMap20.table = entryArray27;
        hashMap20.modCount = 0;
        int int31 = hashMap20.size();
        int int32 = hashMap20.size();
        system.classfixer.classes.HashMap.Entry[] entryArray33 = hashMap20.table;
        java.lang.Object obj35 = hashMap20.get((java.lang.Object) 10L);
        system.classfixer.classes.HashMap hashMap38 = new system.classfixer.classes.HashMap((int) (byte) 100, (float) 100);
        java.lang.Class<?> wildcardClass39 = hashMap38.getClass();
        java.lang.Object obj40 = hashMap2.put(obj35, (java.lang.Object) wildcardClass39);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1.0d);
        int int3 = hashMap0.size();
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap0.table;
        int int5 = hashMap0.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap0.table;
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.repOK();
        boolean boolean10 = hashMap8.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap8.table;
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) (short) 10, (float) '#');
        java.lang.Object obj15 = hashMap0.put((java.lang.Object) hashMap8, (java.lang.Object) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        hashMap2.modCount = 0;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        boolean boolean6 = hashMap5.repOK();
        boolean boolean7 = hashMap5.isEmpty();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap8.table;
        int int11 = hashMap8.modCount;
        java.lang.Object obj12 = hashMap5.remove((java.lang.Object) hashMap8);
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        boolean boolean14 = hashMap13.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap13.table;
        hashMap8.table = entryArray15;
        hashMap8.modCount = 0;
        int int19 = hashMap8.size();
        java.lang.Object obj20 = hashMap2.get((java.lang.Object) int19);
        hashMap2.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 1, (float) 100L);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.repOK();
        boolean boolean5 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap6.table;
        int int9 = hashMap6.modCount;
        java.lang.Object obj10 = hashMap3.remove((java.lang.Object) hashMap6);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        boolean boolean12 = hashMap11.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap11.table;
        hashMap11.modCount = (short) 0;
        int int16 = hashMap11.size();
        java.lang.Object obj17 = hashMap3.get((java.lang.Object) hashMap11);
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        boolean boolean19 = hashMap18.repOK();
        boolean boolean20 = hashMap18.isEmpty();
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap();
        boolean boolean22 = hashMap21.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray23 = hashMap21.table;
        int int24 = hashMap21.modCount;
        java.lang.Object obj25 = hashMap18.remove((java.lang.Object) hashMap21);
        boolean boolean26 = hashMap21.isEmpty();
        java.lang.Object obj27 = hashMap11.get((java.lang.Object) hashMap21);
        int int28 = hashMap21.size();
        java.lang.Object obj29 = hashMap2.remove((java.lang.Object) hashMap21);
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap();
        java.lang.Object obj32 = hashMap30.remove((java.lang.Object) 1.0d);
        int int33 = hashMap30.size();
        system.classfixer.classes.HashMap.Entry[] entryArray34 = hashMap30.table;
        int int35 = hashMap30.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray36 = hashMap30.table;
        system.classfixer.classes.HashMap.Entry[] entryArray37 = hashMap30.table;
        hashMap2.table = entryArray37;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 1, (float) '#');
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.repOK();
        boolean boolean5 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap6.table;
        int int9 = hashMap6.modCount;
        java.lang.Object obj10 = hashMap3.remove((java.lang.Object) hashMap6);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        boolean boolean12 = hashMap11.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap11.table;
        hashMap6.table = entryArray13;
        hashMap6.modCount = 0;
        int int17 = hashMap6.size();
        int int18 = hashMap6.size();
        java.lang.Object obj19 = hashMap2.get((java.lang.Object) hashMap6);
        system.classfixer.classes.HashMap.Entry[] entryArray20 = hashMap2.table;
        int int21 = hashMap2.modCount;
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(100, (float) 1);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap3.table;
        int int6 = hashMap3.modCount;
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap7.table;
        int int10 = hashMap7.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap7.table;
        boolean boolean12 = hashMap7.isEmpty();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        java.lang.Object obj15 = hashMap13.remove((java.lang.Object) 1.0d);
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        java.lang.Object obj18 = hashMap16.remove((java.lang.Object) 1.0d);
        int int19 = hashMap16.size();
        system.classfixer.classes.HashMap.Entry[] entryArray20 = hashMap16.table;
        hashMap13.table = entryArray20;
        hashMap7.table = entryArray20;
        hashMap3.table = entryArray20;
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap();
        boolean boolean25 = hashMap24.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray26 = hashMap24.table;
        java.lang.Object obj27 = hashMap3.remove((java.lang.Object) entryArray26);
        hashMap2.table = entryArray26;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(0, (float) (short) 10);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap3.table;
        hashMap3.modCount = (short) 0;
        boolean boolean8 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        java.lang.Object obj11 = hashMap9.remove((java.lang.Object) 1.0d);
        int int12 = hashMap9.size();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap9.table;
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap9.table;
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap9.table;
        java.lang.Object obj16 = hashMap3.remove((java.lang.Object) entryArray15);
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap3.table;
        boolean boolean18 = hashMap3.repOK();
        java.lang.Object obj20 = hashMap2.put((java.lang.Object) boolean18, (java.lang.Object) false);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 1, (float) '#');
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.repOK();
        boolean boolean5 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap6.table;
        int int9 = hashMap6.modCount;
        java.lang.Object obj10 = hashMap3.remove((java.lang.Object) hashMap6);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        boolean boolean12 = hashMap11.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap11.table;
        hashMap6.table = entryArray13;
        hashMap6.modCount = 0;
        int int17 = hashMap6.size();
        int int18 = hashMap6.size();
        java.lang.Object obj19 = hashMap2.get((java.lang.Object) hashMap6);
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        boolean boolean21 = hashMap20.repOK();
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        boolean boolean23 = hashMap22.isEmpty();
        int int24 = hashMap22.size();
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap();
        boolean boolean26 = hashMap25.repOK();
        boolean boolean27 = hashMap25.isEmpty();
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap();
        boolean boolean29 = hashMap28.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray30 = hashMap28.table;
        int int31 = hashMap28.modCount;
        java.lang.Object obj32 = hashMap25.remove((java.lang.Object) hashMap28);
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap();
        boolean boolean34 = hashMap33.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray35 = hashMap33.table;
        hashMap28.table = entryArray35;
        hashMap28.modCount = 0;
        int int39 = hashMap28.size();
        int int40 = hashMap28.size();
        system.classfixer.classes.HashMap.Entry[] entryArray41 = hashMap28.table;
        system.classfixer.classes.HashMap hashMap42 = new system.classfixer.classes.HashMap();
        boolean boolean43 = hashMap42.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray44 = hashMap42.table;
        int int45 = hashMap42.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray46 = hashMap42.table;
        java.lang.Object obj47 = hashMap28.remove((java.lang.Object) hashMap42);
        boolean boolean48 = hashMap42.isEmpty();
        java.lang.Object obj49 = hashMap22.remove((java.lang.Object) hashMap42);
        boolean boolean50 = hashMap22.repOK();
        java.lang.Object obj51 = hashMap6.put((java.lang.Object) boolean21, (java.lang.Object) boolean50);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap6", hashMap6.repOK_2());
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) ' ');
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap1.table;
        int int3 = hashMap1.modCount;
        int int4 = hashMap1.size();
        boolean boolean5 = hashMap1.repOK();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap6.table;
        hashMap6.modCount = (short) 0;
        int int11 = hashMap6.size();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        boolean boolean13 = hashMap12.repOK();
        boolean boolean14 = hashMap12.isEmpty();
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        boolean boolean16 = hashMap15.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap15.table;
        int int18 = hashMap15.modCount;
        java.lang.Object obj19 = hashMap12.remove((java.lang.Object) hashMap15);
        boolean boolean20 = hashMap15.isEmpty();
        boolean boolean21 = hashMap15.repOK();
        int int22 = hashMap15.modCount;
        java.lang.Object obj23 = hashMap6.remove((java.lang.Object) int22);
        int int24 = hashMap6.size();
        system.classfixer.classes.HashMap.Entry[] entryArray25 = hashMap6.table;
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap();
        boolean boolean27 = hashMap26.repOK();
        boolean boolean28 = hashMap26.isEmpty();
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap();
        boolean boolean30 = hashMap29.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray31 = hashMap29.table;
        int int32 = hashMap29.modCount;
        java.lang.Object obj33 = hashMap26.remove((java.lang.Object) hashMap29);
        system.classfixer.classes.HashMap hashMap34 = new system.classfixer.classes.HashMap();
        boolean boolean35 = hashMap34.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray36 = hashMap34.table;
        hashMap29.table = entryArray36;
        hashMap29.modCount = 0;
        int int40 = hashMap29.size();
        int int41 = hashMap29.size();
        system.classfixer.classes.HashMap.Entry[] entryArray42 = hashMap29.table;
        system.classfixer.classes.HashMap hashMap43 = new system.classfixer.classes.HashMap();
        boolean boolean44 = hashMap43.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray45 = hashMap43.table;
        int int46 = hashMap43.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray47 = hashMap43.table;
        java.lang.Object obj48 = hashMap29.remove((java.lang.Object) hashMap43);
        system.classfixer.classes.HashMap.Entry[] entryArray49 = hashMap43.table;
        int int50 = hashMap43.modCount;
        java.lang.Object obj51 = hashMap1.put((java.lang.Object) hashMap6, (java.lang.Object) int50);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap0.table;
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = hashMap0.remove(obj3);
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        java.lang.Object obj7 = hashMap5.remove((java.lang.Object) 1.0d);
        int int8 = hashMap5.size();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap5.table;
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap5.table;
        hashMap0.table = entryArray10;
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        boolean boolean13 = hashMap12.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap12.table;
        hashMap12.modCount = (short) 0;
        int int17 = hashMap12.size();
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap12.table;
        int int19 = hashMap12.modCount;
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        boolean boolean21 = hashMap20.repOK();
        boolean boolean22 = hashMap20.isEmpty();
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap();
        boolean boolean24 = hashMap23.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray25 = hashMap23.table;
        int int26 = hashMap23.modCount;
        java.lang.Object obj27 = hashMap20.remove((java.lang.Object) hashMap23);
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap();
        boolean boolean29 = hashMap28.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray30 = hashMap28.table;
        hashMap23.table = entryArray30;
        hashMap23.modCount = 0;
        int int34 = hashMap23.size();
        int int35 = hashMap23.size();
        system.classfixer.classes.HashMap.Entry[] entryArray36 = hashMap23.table;
        hashMap12.table = entryArray36;
        int int38 = hashMap12.modCount;
        java.lang.Object obj39 = hashMap0.remove((java.lang.Object) hashMap12);
        hashMap12.modCount = (short) 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap12", hashMap12.repOK_2());
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap0.table;
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = hashMap0.remove(obj3);
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        java.lang.Object obj7 = hashMap5.remove((java.lang.Object) 1.0d);
        int int8 = hashMap5.size();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap5.table;
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap5.table;
        java.lang.Object obj11 = hashMap0.get((java.lang.Object) hashMap5);
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap5.table;
        hashMap5.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap5", hashMap5.repOK_2());
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap0.table;
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = hashMap0.remove(obj3);
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        java.lang.Object obj7 = hashMap5.remove((java.lang.Object) 1.0d);
        int int8 = hashMap5.size();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap5.table;
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap5.table;
        hashMap0.table = entryArray10;
        hashMap0.modCount = (byte) 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1.0d);
        int int3 = hashMap0.size();
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap0.table;
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap0.table;
        boolean boolean6 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) '4', 1.0f);
        boolean boolean10 = hashMap9.repOK();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        boolean boolean12 = hashMap11.repOK();
        boolean boolean13 = hashMap11.isEmpty();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        boolean boolean15 = hashMap14.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap14.table;
        int int17 = hashMap14.modCount;
        java.lang.Object obj18 = hashMap11.remove((java.lang.Object) hashMap14);
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        boolean boolean20 = hashMap19.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap19.table;
        hashMap14.table = entryArray21;
        hashMap14.modCount = 0;
        int int25 = hashMap14.size();
        int int26 = hashMap14.size();
        system.classfixer.classes.HashMap.Entry[] entryArray27 = hashMap14.table;
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap();
        boolean boolean29 = hashMap28.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray30 = hashMap28.table;
        int int31 = hashMap28.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray32 = hashMap28.table;
        java.lang.Object obj33 = hashMap14.remove((java.lang.Object) hashMap28);
        boolean boolean34 = hashMap28.repOK();
        java.lang.Object obj35 = hashMap0.put((java.lang.Object) hashMap9, (java.lang.Object) hashMap28);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(0, (float) 10);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.repOK();
        boolean boolean5 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap6.table;
        int int9 = hashMap6.modCount;
        java.lang.Object obj10 = hashMap3.remove((java.lang.Object) hashMap6);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        boolean boolean12 = hashMap11.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap11.table;
        hashMap11.modCount = (short) 0;
        int int16 = hashMap11.size();
        java.lang.Object obj17 = hashMap3.get((java.lang.Object) hashMap11);
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap3.table;
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        boolean boolean20 = hashMap19.repOK();
        java.lang.Object obj22 = hashMap19.get((java.lang.Object) 100.0d);
        int int23 = hashMap19.size();
        java.lang.Object obj24 = hashMap3.remove((java.lang.Object) hashMap19);
        java.lang.Object obj25 = hashMap2.remove((java.lang.Object) hashMap19);
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap();
        boolean boolean27 = hashMap26.repOK();
        boolean boolean28 = hashMap26.isEmpty();
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap();
        boolean boolean30 = hashMap29.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray31 = hashMap29.table;
        int int32 = hashMap29.modCount;
        java.lang.Object obj33 = hashMap26.remove((java.lang.Object) hashMap29);
        system.classfixer.classes.HashMap hashMap34 = new system.classfixer.classes.HashMap();
        boolean boolean35 = hashMap34.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray36 = hashMap34.table;
        hashMap34.modCount = (short) 0;
        int int39 = hashMap34.size();
        java.lang.Object obj40 = hashMap26.get((java.lang.Object) hashMap34);
        system.classfixer.classes.HashMap.Entry[] entryArray41 = hashMap26.table;
        java.lang.Object obj42 = hashMap19.get((java.lang.Object) hashMap26);
        hashMap26.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap26", hashMap26.repOK_2());
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap3.table;
        int int6 = hashMap3.modCount;
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) hashMap3);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap8.table;
        hashMap3.table = entryArray10;
        hashMap3.modCount = 0;
        int int14 = hashMap3.size();
        int int15 = hashMap3.size();
        boolean boolean16 = hashMap3.repOK();
        int int17 = hashMap3.size();
        hashMap3.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap3", hashMap3.repOK_2());
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap0.table;
        hashMap0.modCount = (short) 0;
        boolean boolean5 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        java.lang.Object obj8 = hashMap6.remove((java.lang.Object) 1.0d);
        int int9 = hashMap6.size();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap6.table;
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap6.table;
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap6.table;
        java.lang.Object obj13 = hashMap0.remove((java.lang.Object) entryArray12);
        int int14 = hashMap0.modCount;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap3.table;
        int int6 = hashMap3.modCount;
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) hashMap3);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap8.table;
        hashMap8.modCount = (short) 0;
        int int13 = hashMap8.size();
        java.lang.Object obj14 = hashMap0.get((java.lang.Object) hashMap8);
        hashMap8.modCount = 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap8", hashMap8.repOK_2());
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 100, (float) 1L);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap3.table;
        hashMap3.modCount = (short) 0;
        int int8 = hashMap3.size();
        java.lang.Object obj10 = hashMap3.get((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap((int) (short) 100, (float) 1);
        java.lang.Object obj14 = hashMap3.get((java.lang.Object) hashMap13);
        int int15 = hashMap13.modCount;
        java.lang.Object obj16 = hashMap2.get((java.lang.Object) int15);
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        boolean boolean18 = hashMap17.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap17.table;
        int int20 = hashMap17.modCount;
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap((int) (short) 1, (float) 100L);
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap();
        boolean boolean25 = hashMap24.repOK();
        boolean boolean26 = hashMap24.isEmpty();
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap();
        boolean boolean28 = hashMap27.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray29 = hashMap27.table;
        int int30 = hashMap27.modCount;
        java.lang.Object obj31 = hashMap24.remove((java.lang.Object) hashMap27);
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap();
        boolean boolean33 = hashMap32.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray34 = hashMap32.table;
        hashMap32.modCount = (short) 0;
        int int37 = hashMap32.size();
        java.lang.Object obj38 = hashMap24.get((java.lang.Object) hashMap32);
        system.classfixer.classes.HashMap hashMap39 = new system.classfixer.classes.HashMap();
        boolean boolean40 = hashMap39.repOK();
        boolean boolean41 = hashMap39.isEmpty();
        system.classfixer.classes.HashMap hashMap42 = new system.classfixer.classes.HashMap();
        boolean boolean43 = hashMap42.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray44 = hashMap42.table;
        int int45 = hashMap42.modCount;
        java.lang.Object obj46 = hashMap39.remove((java.lang.Object) hashMap42);
        boolean boolean47 = hashMap42.isEmpty();
        java.lang.Object obj48 = hashMap32.get((java.lang.Object) hashMap42);
        int int49 = hashMap42.size();
        java.lang.Object obj50 = hashMap23.remove((java.lang.Object) hashMap42);
        system.classfixer.classes.HashMap.Entry[] entryArray51 = hashMap42.table;
        hashMap17.table = entryArray51;
        hashMap2.table = entryArray51;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap0.table;
        hashMap0.modCount = (short) 0;
        int int5 = hashMap0.size();
        boolean boolean6 = hashMap0.repOK();
        hashMap0.modCount = (short) 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) '4', 1.0f);
        int int3 = hashMap2.modCount;
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap4.table;
        int int7 = hashMap4.modCount;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (short) 1, (float) 100L);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        boolean boolean12 = hashMap11.repOK();
        boolean boolean13 = hashMap11.isEmpty();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        boolean boolean15 = hashMap14.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap14.table;
        int int17 = hashMap14.modCount;
        java.lang.Object obj18 = hashMap11.remove((java.lang.Object) hashMap14);
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        boolean boolean20 = hashMap19.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap19.table;
        hashMap19.modCount = (short) 0;
        int int24 = hashMap19.size();
        java.lang.Object obj25 = hashMap11.get((java.lang.Object) hashMap19);
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap();
        boolean boolean27 = hashMap26.repOK();
        boolean boolean28 = hashMap26.isEmpty();
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap();
        boolean boolean30 = hashMap29.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray31 = hashMap29.table;
        int int32 = hashMap29.modCount;
        java.lang.Object obj33 = hashMap26.remove((java.lang.Object) hashMap29);
        boolean boolean34 = hashMap29.isEmpty();
        java.lang.Object obj35 = hashMap19.get((java.lang.Object) hashMap29);
        int int36 = hashMap29.size();
        java.lang.Object obj37 = hashMap10.remove((java.lang.Object) hashMap29);
        system.classfixer.classes.HashMap.Entry[] entryArray38 = hashMap29.table;
        hashMap4.table = entryArray38;
        hashMap2.table = entryArray38;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.repOK();
        boolean boolean5 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap6.table;
        int int9 = hashMap6.modCount;
        java.lang.Object obj10 = hashMap3.remove((java.lang.Object) hashMap6);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        boolean boolean12 = hashMap11.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap11.table;
        hashMap6.table = entryArray13;
        hashMap6.modCount = 0;
        int int17 = hashMap6.size();
        int int18 = hashMap6.size();
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap6.table;
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        boolean boolean21 = hashMap20.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray22 = hashMap20.table;
        int int23 = hashMap20.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap20.table;
        java.lang.Object obj25 = hashMap6.remove((java.lang.Object) hashMap20);
        boolean boolean26 = hashMap20.isEmpty();
        java.lang.Object obj27 = hashMap0.remove((java.lang.Object) hashMap20);
        int int28 = hashMap20.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray29 = hashMap20.table;
        hashMap20.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap20", hashMap20.repOK_2());
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 100, (float) 100L);
        boolean boolean3 = hashMap2.isEmpty();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (short) 10);
        boolean boolean6 = hashMap5.repOK();
        int int7 = hashMap5.size();
        int int8 = hashMap5.modCount;
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap9.table;
        hashMap9.modCount = (short) 0;
        boolean boolean14 = hashMap9.isEmpty();
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        java.lang.Object obj17 = hashMap15.remove((java.lang.Object) 1.0d);
        int int18 = hashMap15.size();
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap15.table;
        system.classfixer.classes.HashMap.Entry[] entryArray20 = hashMap15.table;
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap15.table;
        java.lang.Object obj22 = hashMap9.remove((java.lang.Object) entryArray21);
        system.classfixer.classes.HashMap.Entry[] entryArray23 = hashMap9.table;
        java.lang.Object obj24 = hashMap5.remove((java.lang.Object) entryArray23);
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap();
        boolean boolean26 = hashMap25.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray27 = hashMap25.table;
        hashMap5.table = entryArray27;
        hashMap2.table = entryArray27;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap2.table;
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap3.table;
        int int6 = hashMap3.modCount;
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) hashMap3);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap8.table;
        hashMap3.table = entryArray10;
        hashMap3.modCount = 0;
        int int14 = hashMap3.size();
        boolean boolean15 = hashMap3.isEmpty();
        hashMap3.modCount = (byte) 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap3", hashMap3.repOK_2());
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap0.table;
        hashMap0.modCount = (short) 0;
        int int5 = hashMap0.size();
        hashMap0.modCount = 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap0.table;
        int int3 = hashMap0.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap0.table;
        boolean boolean5 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        java.lang.Object obj8 = hashMap6.remove((java.lang.Object) 1.0d);
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        java.lang.Object obj11 = hashMap9.remove((java.lang.Object) 1.0d);
        int int12 = hashMap9.size();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap9.table;
        hashMap6.table = entryArray13;
        hashMap0.table = entryArray13;
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        boolean boolean17 = hashMap16.repOK();
        boolean boolean18 = hashMap16.isEmpty();
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        boolean boolean20 = hashMap19.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap19.table;
        int int22 = hashMap19.modCount;
        java.lang.Object obj23 = hashMap16.remove((java.lang.Object) hashMap19);
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap();
        boolean boolean25 = hashMap24.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray26 = hashMap24.table;
        hashMap19.table = entryArray26;
        hashMap19.modCount = 0;
        int int30 = hashMap19.size();
        int int31 = hashMap19.size();
        system.classfixer.classes.HashMap.Entry[] entryArray32 = hashMap19.table;
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap();
        boolean boolean34 = hashMap33.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray35 = hashMap33.table;
        int int36 = hashMap33.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray37 = hashMap33.table;
        java.lang.Object obj38 = hashMap19.remove((java.lang.Object) hashMap33);
        boolean boolean39 = hashMap33.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray40 = hashMap33.table;
        java.lang.Object obj41 = hashMap0.remove((java.lang.Object) hashMap33);
        int int42 = hashMap33.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray43 = hashMap33.table;
        boolean boolean44 = hashMap33.isEmpty();
        system.classfixer.classes.HashMap hashMap45 = new system.classfixer.classes.HashMap();
        boolean boolean46 = hashMap45.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray47 = hashMap45.table;
        hashMap45.modCount = (short) 0;
        int int50 = hashMap45.size();
        java.lang.Object obj52 = hashMap45.get((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap55 = new system.classfixer.classes.HashMap((int) (short) 100, (float) 1);
        java.lang.Object obj56 = hashMap45.get((java.lang.Object) hashMap55);
        system.classfixer.classes.HashMap.Entry[] entryArray57 = hashMap55.table;
        hashMap33.table = entryArray57;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap33", hashMap33.repOK_2());
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1.0d);
        int int3 = hashMap0.size();
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap0.table;
        int int5 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap6.table;
        int int9 = hashMap6.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap6.table;
        hashMap0.table = entryArray10;
        boolean boolean12 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap0.table;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1.0d);
        int int3 = hashMap0.size();
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap0.table;
        int int5 = hashMap0.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap0.table;
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap0.table;
        hashMap0.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap3.table;
        int int6 = hashMap3.modCount;
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) hashMap3);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap8.table;
        hashMap3.table = entryArray10;
        hashMap3.modCount = 0;
        int int14 = hashMap3.size();
        int int15 = hashMap3.size();
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap3.table;
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        boolean boolean18 = hashMap17.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap17.table;
        int int20 = hashMap17.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap17.table;
        java.lang.Object obj22 = hashMap3.remove((java.lang.Object) hashMap17);
        boolean boolean23 = hashMap17.isEmpty();
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap();
        boolean boolean25 = hashMap24.repOK();
        boolean boolean26 = hashMap24.isEmpty();
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap();
        boolean boolean28 = hashMap27.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray29 = hashMap27.table;
        int int30 = hashMap27.modCount;
        java.lang.Object obj31 = hashMap24.remove((java.lang.Object) hashMap27);
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap();
        boolean boolean33 = hashMap32.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray34 = hashMap32.table;
        hashMap32.modCount = (short) 0;
        int int37 = hashMap32.size();
        java.lang.Object obj38 = hashMap24.get((java.lang.Object) hashMap32);
        system.classfixer.classes.HashMap hashMap39 = new system.classfixer.classes.HashMap();
        boolean boolean40 = hashMap39.repOK();
        boolean boolean41 = hashMap39.isEmpty();
        system.classfixer.classes.HashMap hashMap42 = new system.classfixer.classes.HashMap();
        boolean boolean43 = hashMap42.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray44 = hashMap42.table;
        int int45 = hashMap42.modCount;
        java.lang.Object obj46 = hashMap39.remove((java.lang.Object) hashMap42);
        boolean boolean47 = hashMap42.isEmpty();
        java.lang.Object obj48 = hashMap32.get((java.lang.Object) hashMap42);
        system.classfixer.classes.HashMap hashMap49 = new system.classfixer.classes.HashMap();
        boolean boolean50 = hashMap49.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray51 = hashMap49.table;
        hashMap49.modCount = (short) 0;
        int int54 = hashMap49.size();
        system.classfixer.classes.HashMap.Entry[] entryArray55 = hashMap49.table;
        int int56 = hashMap49.modCount;
        system.classfixer.classes.HashMap hashMap57 = new system.classfixer.classes.HashMap();
        boolean boolean58 = hashMap57.repOK();
        boolean boolean59 = hashMap57.isEmpty();
        system.classfixer.classes.HashMap hashMap60 = new system.classfixer.classes.HashMap();
        boolean boolean61 = hashMap60.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray62 = hashMap60.table;
        int int63 = hashMap60.modCount;
        java.lang.Object obj64 = hashMap57.remove((java.lang.Object) hashMap60);
        system.classfixer.classes.HashMap hashMap65 = new system.classfixer.classes.HashMap();
        boolean boolean66 = hashMap65.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray67 = hashMap65.table;
        hashMap60.table = entryArray67;
        hashMap60.modCount = 0;
        int int71 = hashMap60.size();
        int int72 = hashMap60.size();
        system.classfixer.classes.HashMap.Entry[] entryArray73 = hashMap60.table;
        hashMap49.table = entryArray73;
        java.lang.Object obj75 = hashMap17.put((java.lang.Object) hashMap42, (java.lang.Object) hashMap49);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap17", hashMap17.repOK_2());
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 1, (float) 100L);
        boolean boolean3 = hashMap2.isEmpty();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap4.table;
        int int7 = hashMap4.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap4.table;
        java.lang.Object obj9 = hashMap2.get((java.lang.Object) entryArray8);
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap3.table;
        int int6 = hashMap3.modCount;
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) hashMap3);
        boolean boolean8 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        boolean boolean10 = hashMap9.repOK();
        boolean boolean11 = hashMap9.isEmpty();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        boolean boolean13 = hashMap12.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap12.table;
        int int15 = hashMap12.modCount;
        java.lang.Object obj16 = hashMap9.remove((java.lang.Object) hashMap12);
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        boolean boolean18 = hashMap17.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap17.table;
        hashMap12.table = entryArray19;
        hashMap12.modCount = 0;
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap();
        java.lang.Object obj25 = hashMap23.remove((java.lang.Object) 1.0d);
        int int26 = hashMap23.size();
        system.classfixer.classes.HashMap.Entry[] entryArray27 = hashMap23.table;
        java.lang.Object obj28 = hashMap12.get((java.lang.Object) entryArray27);
        boolean boolean29 = hashMap12.isEmpty();
        java.lang.Object obj30 = hashMap3.remove((java.lang.Object) boolean29);
        hashMap3.modCount = (byte) 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap3", hashMap3.repOK_2());
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) 100.0d);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        boolean boolean5 = hashMap4.repOK();
        boolean boolean6 = hashMap4.isEmpty();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap7.table;
        int int10 = hashMap7.modCount;
        java.lang.Object obj11 = hashMap4.remove((java.lang.Object) hashMap7);
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        boolean boolean13 = hashMap12.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap12.table;
        hashMap7.table = entryArray14;
        java.lang.Object obj16 = hashMap0.remove((java.lang.Object) hashMap7);
        boolean boolean17 = hashMap7.repOK();
        hashMap7.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap7", hashMap7.repOK_2());
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap3.table;
        int int6 = hashMap3.modCount;
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) hashMap3);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap8.table;
        hashMap3.table = entryArray10;
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        java.lang.Object obj14 = hashMap12.remove((java.lang.Object) 1.0d);
        int int15 = hashMap12.size();
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap12.table;
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap12.table;
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap12.table;
        hashMap3.table = entryArray18;
        int int20 = hashMap3.size();
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap();
        java.lang.Object obj23 = hashMap21.remove((java.lang.Object) 1.0d);
        int int24 = hashMap21.size();
        system.classfixer.classes.HashMap.Entry[] entryArray25 = hashMap21.table;
        boolean boolean26 = hashMap21.isEmpty();
        int int27 = hashMap21.modCount;
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap();
        java.lang.Object obj30 = hashMap28.remove((java.lang.Object) 1.0d);
        int int31 = hashMap28.size();
        system.classfixer.classes.HashMap.Entry[] entryArray32 = hashMap28.table;
        int int33 = hashMap28.modCount;
        system.classfixer.classes.HashMap hashMap34 = new system.classfixer.classes.HashMap();
        boolean boolean35 = hashMap34.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray36 = hashMap34.table;
        int int37 = hashMap34.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray38 = hashMap34.table;
        hashMap28.table = entryArray38;
        system.classfixer.classes.HashMap.Entry[] entryArray40 = hashMap28.table;
        java.lang.Object obj41 = hashMap21.get((java.lang.Object) hashMap28);
        system.classfixer.classes.HashMap hashMap42 = new system.classfixer.classes.HashMap();
        boolean boolean43 = hashMap42.repOK();
        java.lang.Object obj45 = hashMap42.get((java.lang.Object) 100.0d);
        int int46 = hashMap42.modCount;
        int int47 = hashMap42.size();
        system.classfixer.classes.HashMap hashMap48 = new system.classfixer.classes.HashMap();
        boolean boolean49 = hashMap48.isEmpty();
        int int50 = hashMap48.size();
        system.classfixer.classes.HashMap hashMap51 = new system.classfixer.classes.HashMap();
        boolean boolean52 = hashMap51.repOK();
        boolean boolean53 = hashMap51.isEmpty();
        system.classfixer.classes.HashMap hashMap54 = new system.classfixer.classes.HashMap();
        boolean boolean55 = hashMap54.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray56 = hashMap54.table;
        int int57 = hashMap54.modCount;
        java.lang.Object obj58 = hashMap51.remove((java.lang.Object) hashMap54);
        system.classfixer.classes.HashMap hashMap59 = new system.classfixer.classes.HashMap();
        boolean boolean60 = hashMap59.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray61 = hashMap59.table;
        hashMap54.table = entryArray61;
        hashMap54.modCount = 0;
        int int65 = hashMap54.size();
        int int66 = hashMap54.size();
        system.classfixer.classes.HashMap.Entry[] entryArray67 = hashMap54.table;
        system.classfixer.classes.HashMap hashMap68 = new system.classfixer.classes.HashMap();
        boolean boolean69 = hashMap68.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray70 = hashMap68.table;
        int int71 = hashMap68.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray72 = hashMap68.table;
        java.lang.Object obj73 = hashMap54.remove((java.lang.Object) hashMap68);
        boolean boolean74 = hashMap68.isEmpty();
        java.lang.Object obj75 = hashMap48.remove((java.lang.Object) hashMap68);
        system.classfixer.classes.HashMap.Entry[] entryArray76 = hashMap68.table;
        java.lang.Object obj77 = hashMap42.get((java.lang.Object) hashMap68);
        boolean boolean78 = hashMap68.repOK();
        java.lang.Object obj79 = hashMap3.put((java.lang.Object) hashMap28, (java.lang.Object) boolean78);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap3", hashMap3.repOK_2());
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap3.table;
        int int6 = hashMap3.modCount;
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) hashMap3);
        boolean boolean8 = hashMap3.isEmpty();
        int int9 = hashMap3.modCount;
        hashMap3.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap3", hashMap3.repOK_2());
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1.0d);
        int int3 = hashMap0.size();
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap0.table;
        int int5 = hashMap0.modCount;
        int int6 = hashMap0.modCount;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap0.table;
        hashMap0.modCount = (short) 0;
        int int5 = hashMap0.size();
        java.lang.Object obj7 = hashMap0.get((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (short) 100, (float) 1);
        java.lang.Object obj11 = hashMap0.get((java.lang.Object) hashMap10);
        boolean boolean12 = hashMap0.isEmpty();
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) '4', 1.0f);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        int int5 = hashMap3.size();
        int int6 = hashMap3.modCount;
        java.lang.Object obj7 = hashMap2.get((java.lang.Object) int6);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap8.table;
        int int11 = hashMap8.modCount;
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        boolean boolean13 = hashMap12.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap12.table;
        int int15 = hashMap12.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap12.table;
        boolean boolean17 = hashMap12.isEmpty();
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        java.lang.Object obj20 = hashMap18.remove((java.lang.Object) 1.0d);
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap();
        java.lang.Object obj23 = hashMap21.remove((java.lang.Object) 1.0d);
        int int24 = hashMap21.size();
        system.classfixer.classes.HashMap.Entry[] entryArray25 = hashMap21.table;
        hashMap18.table = entryArray25;
        hashMap12.table = entryArray25;
        hashMap8.table = entryArray25;
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap();
        boolean boolean30 = hashMap29.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray31 = hashMap29.table;
        java.lang.Object obj32 = hashMap8.remove((java.lang.Object) entryArray31);
        java.lang.Object obj33 = hashMap2.get((java.lang.Object) hashMap8);
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 100, (float) 1L);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap3.table;
        hashMap3.modCount = (short) 0;
        int int8 = hashMap3.size();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap3.table;
        int int10 = hashMap3.modCount;
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        boolean boolean12 = hashMap11.repOK();
        boolean boolean13 = hashMap11.isEmpty();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        boolean boolean15 = hashMap14.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap14.table;
        int int17 = hashMap14.modCount;
        java.lang.Object obj18 = hashMap11.remove((java.lang.Object) hashMap14);
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        boolean boolean20 = hashMap19.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap19.table;
        hashMap14.table = entryArray21;
        hashMap14.modCount = 0;
        int int25 = hashMap14.size();
        int int26 = hashMap14.size();
        system.classfixer.classes.HashMap.Entry[] entryArray27 = hashMap14.table;
        hashMap3.table = entryArray27;
        int int29 = hashMap3.modCount;
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap((int) '4', 1.0f);
        system.classfixer.classes.HashMap.Entry[] entryArray33 = hashMap32.table;
        hashMap32.modCount = (short) 0;
        java.lang.Object obj36 = hashMap2.put((java.lang.Object) int29, (java.lang.Object) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap3.table;
        int int6 = hashMap3.modCount;
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) hashMap3);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap8.table;
        hashMap3.table = entryArray10;
        hashMap3.modCount = 0;
        int int14 = hashMap3.size();
        int int15 = hashMap3.size();
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap3.table;
        java.lang.Object obj18 = hashMap3.get((java.lang.Object) 10L);
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap((int) '4', 1.0f);
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        boolean boolean23 = hashMap22.repOK();
        java.lang.Object obj24 = hashMap21.get((java.lang.Object) boolean23);
        boolean boolean25 = hashMap21.isEmpty();
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Object obj28 = hashMap21.remove((java.lang.Object) hashMap27);
        system.classfixer.classes.HashMap.Entry[] entryArray29 = hashMap21.table;
        hashMap3.table = entryArray29;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap3", hashMap3.repOK_2());
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 100, (float) ' ');
        java.lang.Object obj3 = null;
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap4.table;
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = hashMap4.remove(obj7);
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        java.lang.Object obj11 = hashMap9.remove((java.lang.Object) 1.0d);
        int int12 = hashMap9.size();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap9.table;
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap9.table;
        hashMap4.table = entryArray14;
        java.lang.Object obj17 = hashMap4.get((java.lang.Object) 0L);
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        boolean boolean19 = hashMap18.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray20 = hashMap18.table;
        int int21 = hashMap18.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray22 = hashMap18.table;
        boolean boolean23 = hashMap18.isEmpty();
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap();
        java.lang.Object obj26 = hashMap24.remove((java.lang.Object) 1.0d);
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap();
        java.lang.Object obj29 = hashMap27.remove((java.lang.Object) 1.0d);
        int int30 = hashMap27.size();
        system.classfixer.classes.HashMap.Entry[] entryArray31 = hashMap27.table;
        hashMap24.table = entryArray31;
        hashMap18.table = entryArray31;
        system.classfixer.classes.HashMap hashMap34 = new system.classfixer.classes.HashMap();
        boolean boolean35 = hashMap34.repOK();
        boolean boolean36 = hashMap34.isEmpty();
        system.classfixer.classes.HashMap hashMap37 = new system.classfixer.classes.HashMap();
        boolean boolean38 = hashMap37.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray39 = hashMap37.table;
        int int40 = hashMap37.modCount;
        java.lang.Object obj41 = hashMap34.remove((java.lang.Object) hashMap37);
        system.classfixer.classes.HashMap hashMap42 = new system.classfixer.classes.HashMap();
        boolean boolean43 = hashMap42.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray44 = hashMap42.table;
        hashMap37.table = entryArray44;
        hashMap37.modCount = 0;
        int int48 = hashMap37.size();
        int int49 = hashMap37.size();
        system.classfixer.classes.HashMap.Entry[] entryArray50 = hashMap37.table;
        system.classfixer.classes.HashMap hashMap51 = new system.classfixer.classes.HashMap();
        boolean boolean52 = hashMap51.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray53 = hashMap51.table;
        int int54 = hashMap51.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray55 = hashMap51.table;
        java.lang.Object obj56 = hashMap37.remove((java.lang.Object) hashMap51);
        boolean boolean57 = hashMap51.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray58 = hashMap51.table;
        java.lang.Object obj59 = hashMap18.remove((java.lang.Object) hashMap51);
        system.classfixer.classes.HashMap hashMap60 = new system.classfixer.classes.HashMap();
        boolean boolean61 = hashMap60.repOK();
        boolean boolean62 = hashMap60.isEmpty();
        system.classfixer.classes.HashMap hashMap63 = new system.classfixer.classes.HashMap();
        boolean boolean64 = hashMap63.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray65 = hashMap63.table;
        int int66 = hashMap63.modCount;
        java.lang.Object obj67 = hashMap60.remove((java.lang.Object) hashMap63);
        system.classfixer.classes.HashMap hashMap68 = new system.classfixer.classes.HashMap();
        boolean boolean69 = hashMap68.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray70 = hashMap68.table;
        hashMap63.table = entryArray70;
        java.lang.Object obj72 = hashMap51.remove((java.lang.Object) hashMap63);
        java.lang.Object obj73 = hashMap4.remove(obj72);
        java.lang.Object obj74 = hashMap2.put(obj3, obj73);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap0.table;
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = hashMap0.remove(obj3);
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        java.lang.Object obj7 = hashMap5.remove((java.lang.Object) 1.0d);
        int int8 = hashMap5.size();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap5.table;
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap5.table;
        hashMap0.table = entryArray10;
        boolean boolean12 = hashMap0.repOK();
        int int13 = hashMap0.size();
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap3.table;
        int int6 = hashMap3.modCount;
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) hashMap3);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap8.table;
        hashMap8.modCount = (short) 0;
        int int13 = hashMap8.size();
        java.lang.Object obj14 = hashMap0.get((java.lang.Object) hashMap8);
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        boolean boolean17 = hashMap16.repOK();
        java.lang.Object obj19 = hashMap16.get((java.lang.Object) 100.0d);
        int int20 = hashMap16.size();
        java.lang.Object obj21 = hashMap0.remove((java.lang.Object) hashMap16);
        hashMap0.modCount = '4';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap0.table;
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = hashMap0.remove(obj3);
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        java.lang.Object obj7 = hashMap5.remove((java.lang.Object) 1.0d);
        int int8 = hashMap5.size();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap5.table;
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap5.table;
        hashMap0.table = entryArray10;
        boolean boolean12 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        boolean boolean14 = hashMap13.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap13.table;
        int int16 = hashMap13.modCount;
        java.lang.Object obj17 = hashMap0.get((java.lang.Object) hashMap13);
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        java.lang.Object obj20 = hashMap18.remove((java.lang.Object) 1.0d);
        int int21 = hashMap18.size();
        int int22 = hashMap18.size();
        boolean boolean23 = hashMap18.isEmpty();
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap();
        boolean boolean25 = hashMap24.repOK();
        boolean boolean26 = hashMap24.isEmpty();
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap();
        boolean boolean28 = hashMap27.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray29 = hashMap27.table;
        int int30 = hashMap27.modCount;
        java.lang.Object obj31 = hashMap24.remove((java.lang.Object) hashMap27);
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap();
        boolean boolean33 = hashMap32.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray34 = hashMap32.table;
        hashMap27.table = entryArray34;
        hashMap27.modCount = 0;
        int int38 = hashMap27.size();
        int int39 = hashMap27.size();
        system.classfixer.classes.HashMap.Entry[] entryArray40 = hashMap27.table;
        system.classfixer.classes.HashMap hashMap41 = new system.classfixer.classes.HashMap();
        boolean boolean42 = hashMap41.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray43 = hashMap41.table;
        int int44 = hashMap41.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray45 = hashMap41.table;
        java.lang.Object obj46 = hashMap27.remove((java.lang.Object) hashMap41);
        system.classfixer.classes.HashMap hashMap47 = new system.classfixer.classes.HashMap();
        boolean boolean48 = hashMap47.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray49 = hashMap47.table;
        java.lang.Object obj50 = null;
        java.lang.Object obj51 = hashMap47.remove(obj50);
        system.classfixer.classes.HashMap hashMap52 = new system.classfixer.classes.HashMap();
        java.lang.Object obj54 = hashMap52.remove((java.lang.Object) 1.0d);
        int int55 = hashMap52.size();
        system.classfixer.classes.HashMap.Entry[] entryArray56 = hashMap52.table;
        system.classfixer.classes.HashMap.Entry[] entryArray57 = hashMap52.table;
        hashMap47.table = entryArray57;
        boolean boolean59 = hashMap47.repOK();
        java.lang.Object obj60 = hashMap41.remove((java.lang.Object) hashMap47);
        int int61 = hashMap47.modCount;
        java.lang.Object obj62 = hashMap18.remove((java.lang.Object) int61);
        java.lang.Object obj63 = hashMap0.remove((java.lang.Object) hashMap18);
        hashMap0.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap3.table;
        int int6 = hashMap3.modCount;
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) hashMap3);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap8.table;
        hashMap3.table = entryArray10;
        hashMap3.modCount = 0;
        int int14 = hashMap3.size();
        int int15 = hashMap3.size();
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap3.table;
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        boolean boolean18 = hashMap17.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap17.table;
        int int20 = hashMap17.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap17.table;
        java.lang.Object obj22 = hashMap3.remove((java.lang.Object) hashMap17);
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap();
        boolean boolean24 = hashMap23.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray25 = hashMap23.table;
        java.lang.Object obj26 = null;
        java.lang.Object obj27 = hashMap23.remove(obj26);
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap();
        java.lang.Object obj30 = hashMap28.remove((java.lang.Object) 1.0d);
        int int31 = hashMap28.size();
        system.classfixer.classes.HashMap.Entry[] entryArray32 = hashMap28.table;
        system.classfixer.classes.HashMap.Entry[] entryArray33 = hashMap28.table;
        hashMap23.table = entryArray33;
        boolean boolean35 = hashMap23.repOK();
        java.lang.Object obj36 = hashMap17.remove((java.lang.Object) hashMap23);
        int int37 = hashMap17.modCount;
        hashMap17.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap17", hashMap17.repOK_2());
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.repOK();
        boolean boolean5 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap6.table;
        int int9 = hashMap6.modCount;
        java.lang.Object obj10 = hashMap3.remove((java.lang.Object) hashMap6);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        boolean boolean12 = hashMap11.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap11.table;
        hashMap6.table = entryArray13;
        hashMap6.modCount = 0;
        int int17 = hashMap6.size();
        int int18 = hashMap6.size();
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap6.table;
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        boolean boolean21 = hashMap20.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray22 = hashMap20.table;
        int int23 = hashMap20.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap20.table;
        java.lang.Object obj25 = hashMap6.remove((java.lang.Object) hashMap20);
        boolean boolean26 = hashMap20.isEmpty();
        java.lang.Object obj27 = hashMap0.remove((java.lang.Object) hashMap20);
        system.classfixer.classes.HashMap.Entry[] entryArray28 = hashMap20.table;
        boolean boolean29 = hashMap20.repOK();
        hashMap20.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap20", hashMap20.repOK_2());
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 100, (float) 100);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.repOK();
        boolean boolean5 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap6.table;
        int int9 = hashMap6.modCount;
        java.lang.Object obj10 = hashMap3.remove((java.lang.Object) hashMap6);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        boolean boolean12 = hashMap11.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap11.table;
        hashMap6.table = entryArray13;
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        boolean boolean16 = hashMap15.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap15.table;
        java.lang.Object obj18 = null;
        java.lang.Object obj19 = hashMap15.remove(obj18);
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        java.lang.Object obj22 = hashMap20.remove((java.lang.Object) 1.0d);
        int int23 = hashMap20.size();
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap20.table;
        system.classfixer.classes.HashMap.Entry[] entryArray25 = hashMap20.table;
        hashMap15.table = entryArray25;
        boolean boolean27 = hashMap15.isEmpty();
        java.lang.Object obj29 = hashMap15.remove((java.lang.Object) (byte) 10);
        java.lang.Object obj30 = hashMap2.put((java.lang.Object) hashMap6, (java.lang.Object) hashMap15);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) 100.0d);
        hashMap0.modCount = (byte) 0;
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap0.table;
        hashMap0.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) '4', 1.0f);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.repOK();
        java.lang.Object obj5 = hashMap2.get((java.lang.Object) boolean4);
        boolean boolean6 = hashMap2.isEmpty();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Object obj9 = hashMap2.remove((java.lang.Object) hashMap8);
        int int10 = hashMap8.size();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap((int) (short) 10, 100.0f);
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap13.table;
        hashMap8.table = entryArray14;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap8", hashMap8.repOK_2());
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(100);
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        java.lang.Object obj4 = hashMap2.remove((java.lang.Object) 1.0d);
        int int5 = hashMap2.size();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap2.table;
        int int7 = hashMap2.modCount;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap8.table;
        int int11 = hashMap8.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap8.table;
        hashMap2.table = entryArray12;
        boolean boolean14 = hashMap2.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap2.table;
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap(1, (float) 1L);
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap18.table;
        int int20 = hashMap18.size();
        java.lang.Object obj21 = hashMap1.put((java.lang.Object) hashMap2, (java.lang.Object) int20);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap3.table;
        int int6 = hashMap3.modCount;
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) hashMap3);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap8.table;
        hashMap8.modCount = (short) 0;
        int int13 = hashMap8.size();
        java.lang.Object obj14 = hashMap0.get((java.lang.Object) hashMap8);
        hashMap0.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) 100.0d);
        int int4 = hashMap0.modCount;
        int int5 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        int int8 = hashMap6.size();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        boolean boolean10 = hashMap9.repOK();
        boolean boolean11 = hashMap9.isEmpty();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        boolean boolean13 = hashMap12.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap12.table;
        int int15 = hashMap12.modCount;
        java.lang.Object obj16 = hashMap9.remove((java.lang.Object) hashMap12);
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        boolean boolean18 = hashMap17.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap17.table;
        hashMap12.table = entryArray19;
        hashMap12.modCount = 0;
        int int23 = hashMap12.size();
        int int24 = hashMap12.size();
        system.classfixer.classes.HashMap.Entry[] entryArray25 = hashMap12.table;
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap();
        boolean boolean27 = hashMap26.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray28 = hashMap26.table;
        int int29 = hashMap26.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray30 = hashMap26.table;
        java.lang.Object obj31 = hashMap12.remove((java.lang.Object) hashMap26);
        boolean boolean32 = hashMap26.isEmpty();
        java.lang.Object obj33 = hashMap6.remove((java.lang.Object) hashMap26);
        system.classfixer.classes.HashMap.Entry[] entryArray34 = hashMap26.table;
        java.lang.Object obj35 = hashMap0.get((java.lang.Object) hashMap26);
        boolean boolean36 = hashMap26.isEmpty();
        system.classfixer.classes.HashMap hashMap37 = new system.classfixer.classes.HashMap();
        boolean boolean38 = hashMap37.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray39 = hashMap37.table;
        int int40 = hashMap37.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray41 = hashMap37.table;
        system.classfixer.classes.HashMap hashMap42 = new system.classfixer.classes.HashMap();
        boolean boolean43 = hashMap42.repOK();
        java.lang.Object obj45 = hashMap42.get((java.lang.Object) 100.0d);
        hashMap42.modCount = (byte) 0;
        system.classfixer.classes.HashMap.Entry[] entryArray48 = hashMap42.table;
        java.lang.Object obj49 = hashMap37.get((java.lang.Object) entryArray48);
        java.lang.Object obj50 = hashMap26.remove((java.lang.Object) entryArray48);
        hashMap26.modCount = ' ';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap26", hashMap26.repOK_2());
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) 100.0d);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        boolean boolean5 = hashMap4.repOK();
        boolean boolean6 = hashMap4.isEmpty();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap7.table;
        int int10 = hashMap7.modCount;
        java.lang.Object obj11 = hashMap4.remove((java.lang.Object) hashMap7);
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        boolean boolean13 = hashMap12.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap12.table;
        hashMap7.table = entryArray14;
        java.lang.Object obj16 = hashMap0.remove((java.lang.Object) hashMap7);
        hashMap7.modCount = 'a';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap7", hashMap7.repOK_2());
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 1, (float) ' ');
        hashMap2.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap3.table;
        int int6 = hashMap3.modCount;
        java.lang.Object obj7 = hashMap0.remove((java.lang.Object) hashMap3);
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 1.0d);
        int int3 = hashMap0.size();
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap0.table;
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap0.table;
        int int6 = hashMap0.size();
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) 'a', (float) '#');
        hashMap2.modCount = 0;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        boolean boolean6 = hashMap5.repOK();
        boolean boolean7 = hashMap5.isEmpty();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap8.table;
        int int11 = hashMap8.modCount;
        java.lang.Object obj12 = hashMap5.remove((java.lang.Object) hashMap8);
        boolean boolean13 = hashMap8.isEmpty();
        boolean boolean14 = hashMap8.repOK();
        int int15 = hashMap8.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap8.table;
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        java.lang.Object obj19 = hashMap17.remove((java.lang.Object) 1.0d);
        int int20 = hashMap17.size();
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap17.table;
        int int22 = hashMap17.modCount;
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap();
        boolean boolean24 = hashMap23.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray25 = hashMap23.table;
        int int26 = hashMap23.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray27 = hashMap23.table;
        hashMap17.table = entryArray27;
        system.classfixer.classes.HashMap.Entry[] entryArray29 = hashMap17.table;
        hashMap8.table = entryArray29;
        hashMap2.table = entryArray29;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) 100.0d);
        int int4 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        java.lang.Object obj7 = hashMap5.remove((java.lang.Object) 1.0d);
        int int8 = hashMap5.size();
        int int9 = hashMap5.size();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) (byte) 100, (float) 1L);
        boolean boolean13 = hashMap12.isEmpty();
        java.lang.Object obj14 = hashMap0.put((java.lang.Object) hashMap5, (java.lang.Object) hashMap12);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) 100.0d);
        int int4 = hashMap0.modCount;
        int int5 = hashMap0.size();
        int int6 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        java.lang.Object obj9 = hashMap7.remove((java.lang.Object) 1.0d);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        java.lang.Object obj12 = hashMap10.remove((java.lang.Object) 1.0d);
        int int13 = hashMap10.size();
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap10.table;
        hashMap7.table = entryArray14;
        int int16 = hashMap7.size();
        int int17 = hashMap7.modCount;
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        boolean boolean19 = hashMap18.repOK();
        boolean boolean20 = hashMap18.isEmpty();
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap();
        boolean boolean22 = hashMap21.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray23 = hashMap21.table;
        int int24 = hashMap21.modCount;
        java.lang.Object obj25 = hashMap18.remove((java.lang.Object) hashMap21);
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap();
        boolean boolean27 = hashMap26.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray28 = hashMap26.table;
        hashMap26.modCount = (short) 0;
        int int31 = hashMap26.size();
        java.lang.Object obj32 = hashMap18.get((java.lang.Object) hashMap26);
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap();
        boolean boolean34 = hashMap33.repOK();
        boolean boolean35 = hashMap33.isEmpty();
        system.classfixer.classes.HashMap hashMap36 = new system.classfixer.classes.HashMap();
        boolean boolean37 = hashMap36.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray38 = hashMap36.table;
        int int39 = hashMap36.modCount;
        java.lang.Object obj40 = hashMap33.remove((java.lang.Object) hashMap36);
        boolean boolean41 = hashMap36.isEmpty();
        java.lang.Object obj42 = hashMap26.get((java.lang.Object) hashMap36);
        java.lang.Object obj43 = hashMap7.remove((java.lang.Object) hashMap26);
        system.classfixer.classes.HashMap.Entry[] entryArray44 = hashMap7.table;
        hashMap0.table = entryArray44;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap2.table;
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj6 = hashMap4.remove((java.lang.Object) 1.0d);
        int int7 = hashMap4.size();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap4.table;
        int int9 = hashMap4.modCount;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap10.table;
        int int13 = hashMap10.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap10.table;
        hashMap4.table = entryArray14;
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        boolean boolean17 = hashMap16.repOK();
        java.lang.Object obj19 = hashMap16.get((java.lang.Object) 100.0d);
        int int20 = hashMap16.size();
        int int21 = hashMap16.size();
        java.lang.Object obj22 = hashMap2.put((java.lang.Object) entryArray14, (java.lang.Object) int21);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) 100.0d);
        int int4 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap(100, (float) 1);
        java.lang.Object obj8 = hashMap0.get((java.lang.Object) 1);
        boolean boolean9 = hashMap0.repOK();
        hashMap0.modCount = (byte) 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap0.table;
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = hashMap0.remove(obj3);
        int int5 = hashMap0.modCount;
        int int6 = hashMap0.modCount;
        int int7 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap9.table;
        int int12 = hashMap9.modCount;
        java.lang.Object obj13 = hashMap0.put((java.lang.Object) (short) 1, (java.lang.Object) int12);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap0.table;
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = hashMap0.remove(obj3);
        int int5 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        boolean boolean7 = hashMap6.repOK();
        boolean boolean8 = hashMap6.isEmpty();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap9.table;
        int int12 = hashMap9.modCount;
        java.lang.Object obj13 = hashMap6.remove((java.lang.Object) hashMap9);
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        boolean boolean15 = hashMap14.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap14.table;
        hashMap9.table = entryArray16;
        hashMap9.modCount = 0;
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        java.lang.Object obj22 = hashMap20.remove((java.lang.Object) 1.0d);
        int int23 = hashMap20.size();
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap20.table;
        java.lang.Object obj25 = hashMap9.get((java.lang.Object) entryArray24);
        boolean boolean26 = hashMap9.isEmpty();
        int int27 = hashMap9.size();
        java.lang.Object obj28 = hashMap0.get((java.lang.Object) hashMap9);
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap0.table;
        int int3 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap4.table;
        int int7 = hashMap4.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap4.table;
        boolean boolean9 = hashMap4.isEmpty();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        java.lang.Object obj12 = hashMap10.remove((java.lang.Object) 1.0d);
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        java.lang.Object obj15 = hashMap13.remove((java.lang.Object) 1.0d);
        int int16 = hashMap13.size();
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap13.table;
        hashMap10.table = entryArray17;
        hashMap4.table = entryArray17;
        hashMap0.table = entryArray17;
        java.lang.Object obj21 = null;
        java.lang.Object obj22 = hashMap0.get(obj21);
        int int23 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap();
        boolean boolean25 = hashMap24.repOK();
        boolean boolean26 = hashMap24.isEmpty();
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap();
        boolean boolean28 = hashMap27.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray29 = hashMap27.table;
        int int30 = hashMap27.modCount;
        java.lang.Object obj31 = hashMap24.remove((java.lang.Object) hashMap27);
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap();
        boolean boolean33 = hashMap32.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray34 = hashMap32.table;
        hashMap27.table = entryArray34;
        hashMap27.modCount = 0;
        int int38 = hashMap27.size();
        int int39 = hashMap27.size();
        system.classfixer.classes.HashMap.Entry[] entryArray40 = hashMap27.table;
        java.lang.Object obj42 = hashMap27.get((java.lang.Object) 10L);
        int int43 = hashMap27.size();
        system.classfixer.classes.HashMap hashMap44 = new system.classfixer.classes.HashMap();
        boolean boolean45 = hashMap44.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray46 = hashMap44.table;
        java.lang.Object obj47 = null;
        java.lang.Object obj48 = hashMap44.remove(obj47);
        system.classfixer.classes.HashMap hashMap49 = new system.classfixer.classes.HashMap();
        java.lang.Object obj51 = hashMap49.remove((java.lang.Object) 1.0d);
        int int52 = hashMap49.size();
        system.classfixer.classes.HashMap.Entry[] entryArray53 = hashMap49.table;
        system.classfixer.classes.HashMap.Entry[] entryArray54 = hashMap49.table;
        hashMap44.table = entryArray54;
        boolean boolean56 = hashMap44.isEmpty();
        java.lang.Object obj57 = hashMap27.get((java.lang.Object) hashMap44);
        system.classfixer.classes.HashMap hashMap58 = new system.classfixer.classes.HashMap();
        boolean boolean59 = hashMap58.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray60 = hashMap58.table;
        hashMap58.modCount = (short) 0;
        int int63 = hashMap58.size();
        java.lang.Object obj65 = hashMap58.get((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap66 = new system.classfixer.classes.HashMap();
        boolean boolean67 = hashMap66.repOK();
        boolean boolean68 = hashMap66.isEmpty();
        system.classfixer.classes.HashMap hashMap69 = new system.classfixer.classes.HashMap();
        boolean boolean70 = hashMap69.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray71 = hashMap69.table;
        int int72 = hashMap69.modCount;
        java.lang.Object obj73 = hashMap66.remove((java.lang.Object) hashMap69);
        system.classfixer.classes.HashMap hashMap74 = new system.classfixer.classes.HashMap();
        boolean boolean75 = hashMap74.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray76 = hashMap74.table;
        hashMap74.modCount = (short) 0;
        int int79 = hashMap74.size();
        java.lang.Object obj80 = hashMap66.get((java.lang.Object) hashMap74);
        system.classfixer.classes.HashMap.Entry[] entryArray81 = hashMap66.table;
        system.classfixer.classes.HashMap hashMap82 = new system.classfixer.classes.HashMap();
        boolean boolean83 = hashMap82.repOK();
        java.lang.Object obj85 = hashMap82.get((java.lang.Object) 100.0d);
        int int86 = hashMap82.size();
        java.lang.Object obj87 = hashMap66.remove((java.lang.Object) hashMap82);
        int int88 = hashMap66.size();
        java.lang.Object obj89 = hashMap58.get((java.lang.Object) hashMap66);
        boolean boolean90 = hashMap58.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray91 = hashMap58.table;
        system.classfixer.classes.HashMap hashMap94 = new system.classfixer.classes.HashMap((int) ' ', (float) (short) 10);
        java.lang.Object obj95 = hashMap58.get((java.lang.Object) hashMap94);
        java.lang.Object obj96 = hashMap0.put((java.lang.Object) hashMap44, obj95);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap0.table;
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = hashMap0.remove(obj3);
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        java.lang.Object obj7 = hashMap5.remove((java.lang.Object) 1.0d);
        int int8 = hashMap5.size();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap5.table;
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap5.table;
        hashMap0.table = entryArray10;
        boolean boolean12 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        boolean boolean14 = hashMap13.repOK();
        java.lang.Object obj16 = hashMap13.get((java.lang.Object) 100.0d);
        hashMap13.modCount = (byte) 0;
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap13.table;
        hashMap0.table = entryArray19;
        java.lang.Object obj21 = null;
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        boolean boolean23 = hashMap22.repOK();
        boolean boolean24 = hashMap22.isEmpty();
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap();
        boolean boolean26 = hashMap25.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray27 = hashMap25.table;
        int int28 = hashMap25.modCount;
        java.lang.Object obj29 = hashMap22.remove((java.lang.Object) hashMap25);
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap();
        boolean boolean31 = hashMap30.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray32 = hashMap30.table;
        hashMap30.modCount = (short) 0;
        int int35 = hashMap30.size();
        java.lang.Object obj36 = hashMap22.get((java.lang.Object) hashMap30);
        system.classfixer.classes.HashMap hashMap37 = new system.classfixer.classes.HashMap();
        boolean boolean38 = hashMap37.isEmpty();
        int int39 = hashMap37.size();
        boolean boolean40 = hashMap37.isEmpty();
        java.lang.Object obj41 = hashMap30.get((java.lang.Object) hashMap37);
        system.classfixer.classes.HashMap hashMap42 = new system.classfixer.classes.HashMap();
        boolean boolean43 = hashMap42.repOK();
        boolean boolean44 = hashMap42.isEmpty();
        system.classfixer.classes.HashMap hashMap45 = new system.classfixer.classes.HashMap();
        boolean boolean46 = hashMap45.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray47 = hashMap45.table;
        int int48 = hashMap45.modCount;
        java.lang.Object obj49 = hashMap42.remove((java.lang.Object) hashMap45);
        boolean boolean50 = hashMap45.isEmpty();
        system.classfixer.classes.HashMap hashMap51 = new system.classfixer.classes.HashMap();
        boolean boolean52 = hashMap51.repOK();
        boolean boolean53 = hashMap51.isEmpty();
        system.classfixer.classes.HashMap hashMap54 = new system.classfixer.classes.HashMap();
        boolean boolean55 = hashMap54.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray56 = hashMap54.table;
        int int57 = hashMap54.modCount;
        java.lang.Object obj58 = hashMap51.remove((java.lang.Object) hashMap54);
        system.classfixer.classes.HashMap hashMap59 = new system.classfixer.classes.HashMap();
        boolean boolean60 = hashMap59.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray61 = hashMap59.table;
        hashMap54.table = entryArray61;
        hashMap54.modCount = 0;
        system.classfixer.classes.HashMap hashMap65 = new system.classfixer.classes.HashMap();
        java.lang.Object obj67 = hashMap65.remove((java.lang.Object) 1.0d);
        int int68 = hashMap65.size();
        system.classfixer.classes.HashMap.Entry[] entryArray69 = hashMap65.table;
        java.lang.Object obj70 = hashMap54.get((java.lang.Object) entryArray69);
        boolean boolean71 = hashMap54.isEmpty();
        java.lang.Object obj72 = hashMap45.remove((java.lang.Object) boolean71);
        system.classfixer.classes.HashMap hashMap73 = new system.classfixer.classes.HashMap();
        boolean boolean74 = hashMap73.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray75 = hashMap73.table;
        hashMap73.modCount = (short) 0;
        int int78 = hashMap73.size();
        system.classfixer.classes.HashMap.Entry[] entryArray79 = hashMap73.table;
        int int80 = hashMap73.modCount;
        java.lang.Object obj81 = hashMap45.get((java.lang.Object) int80);
        system.classfixer.classes.HashMap.Entry[] entryArray82 = hashMap45.table;
        hashMap37.table = entryArray82;
        java.lang.Object obj84 = hashMap0.put(obj21, (java.lang.Object) entryArray82);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }
}

