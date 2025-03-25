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
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap4.table = entryArray5;
        hashMap0.table = entryArray5;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) hashMap4, (java.lang.Object) 0.0f);
        java.lang.Object obj9 = hashMap0.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap.Entry[] entryArray4 = null;
        hashMap0.table = entryArray4;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) hashMap4, (java.lang.Object) 0.0f);
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) hashMap4, (java.lang.Object) 0.0f);
        hashMap4.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap4", hashMap4.repOK_2());
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap.Entry entry4 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray5 = new system.classfixer.classes.HashMap.Entry[] { entry4 };
        hashMap0.table = entryArray5;
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap7.table = entryArray8;
        hashMap0.table = entryArray8;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap1.table;
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap.Entry entry4 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray5 = new system.classfixer.classes.HashMap.Entry[] { entry4 };
        hashMap0.table = entryArray5;
        int int7 = hashMap0.modCount;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap.Entry entry4 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray5 = new system.classfixer.classes.HashMap.Entry[] { entry4 };
        hashMap0.table = entryArray5;
        int int7 = hashMap0.modCount;
        boolean boolean8 = hashMap0.repOK();
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj3 = hashMap0.remove((java.lang.Object) (byte) 0);
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap.Entry entry4 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray5 = new system.classfixer.classes.HashMap.Entry[] { entry4 };
        hashMap0.table = entryArray5;
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = hashMap0.remove(obj7);
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        java.lang.Object obj12 = hashMap9.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        java.lang.Object obj15 = hashMap9.put((java.lang.Object) hashMap13, (java.lang.Object) 0.0f);
        boolean boolean16 = hashMap13.isEmpty();
        int int17 = hashMap13.modCount;
        int int18 = hashMap13.modCount;
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray20 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap19.table = entryArray20;
        hashMap13.table = entryArray20;
        hashMap0.table = entryArray20;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap.Entry entry4 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray5 = new system.classfixer.classes.HashMap.Entry[] { entry4 };
        hashMap0.table = entryArray5;
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = hashMap0.remove(obj7);
        hashMap0.modCount = 0;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        int int2 = hashMap0.size();
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) hashMap4, (java.lang.Object) 0.0f);
        boolean boolean7 = hashMap4.isEmpty();
        hashMap4.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap4", hashMap4.repOK_2());
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap2.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap2.table;
        java.lang.Object obj7 = hashMap0.put((java.lang.Object) true, (java.lang.Object) hashMap2);
        boolean boolean8 = hashMap2.isEmpty();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap10.table;
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap(10, (float) '#');
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap14.table;
        java.lang.Object obj16 = hashMap2.put((java.lang.Object) entryArray11, (java.lang.Object) entryArray15);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.modCount = 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 100);
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap1.table;
        boolean boolean3 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = null;
        hashMap4.table = entryArray5;
        java.lang.Object obj7 = hashMap1.remove((java.lang.Object) entryArray5);
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap1.table;
        java.lang.Object obj10 = hashMap1.get((java.lang.Object) 100.0f);
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap.Entry entry4 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray5 = new system.classfixer.classes.HashMap.Entry[] { entry4 };
        hashMap0.table = entryArray5;
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) '#');
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj3 = hashMap0.remove((java.lang.Object) (byte) 0);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        boolean boolean5 = hashMap4.repOK();
        boolean boolean6 = hashMap4.isEmpty();
        java.lang.Object obj7 = hashMap0.get((java.lang.Object) boolean6);
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int2 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray4 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap3.table = entryArray4;
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap3.table;
        java.lang.Class<?> wildcardClass7 = hashMap3.getClass();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap9.table;
        java.lang.Object obj11 = hashMap1.put((java.lang.Object) hashMap3, (java.lang.Object) entryArray10);
        boolean boolean12 = hashMap1.repOK();
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap(100, (float) 1);
        int int16 = hashMap15.modCount;
        java.lang.Object obj18 = hashMap1.put((java.lang.Object) int16, (java.lang.Object) 100.0d);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap2.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap2.table;
        java.lang.Object obj7 = hashMap0.put((java.lang.Object) true, (java.lang.Object) hashMap2);
        boolean boolean8 = hashMap2.isEmpty();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap9.table = entryArray10;
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap9.table;
        hashMap2.table = entryArray12;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) hashMap4, (java.lang.Object) 0.0f);
        boolean boolean7 = hashMap4.isEmpty();
        int int8 = hashMap4.modCount;
        int int9 = hashMap4.size();
        boolean boolean10 = hashMap4.repOK();
        hashMap4.modCount = 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap4", hashMap4.repOK_2());
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) hashMap4, (java.lang.Object) 0.0f);
        boolean boolean7 = hashMap4.isEmpty();
        int int8 = hashMap4.modCount;
        int int9 = hashMap4.modCount;
        hashMap4.modCount = (byte) 0;
        hashMap4.modCount = '4';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap4", hashMap4.repOK_2());
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) hashMap4, (java.lang.Object) 0.0f);
        int int7 = hashMap4.modCount;
        hashMap4.modCount = ' ';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap4", hashMap4.repOK_2());
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap.Entry entry4 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray5 = new system.classfixer.classes.HashMap.Entry[] { entry4 };
        hashMap0.table = entryArray5;
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = hashMap0.remove(obj7);
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) '4', (float) (byte) 1);
        hashMap2.modCount = 0;
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) '4');
        boolean boolean2 = hashMap1.repOK();
        boolean boolean3 = hashMap1.isEmpty();
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) '4');
        boolean boolean2 = hashMap1.repOK();
        boolean boolean3 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        java.lang.Object obj9 = hashMap6.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap6.table;
        java.lang.Object obj11 = hashMap4.put((java.lang.Object) true, (java.lang.Object) hashMap6);
        boolean boolean12 = hashMap6.isEmpty();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        java.lang.Object obj16 = hashMap13.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap.Entry entry17 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray18 = new system.classfixer.classes.HashMap.Entry[] { entry17 };
        hashMap13.table = entryArray18;
        java.lang.Object obj21 = hashMap13.remove((java.lang.Object) '#');
        system.classfixer.classes.HashMap.Entry[] entryArray22 = hashMap13.table;
        java.lang.Object obj23 = hashMap1.put((java.lang.Object) boolean12, (java.lang.Object) entryArray22);
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 100);
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap1.table;
        boolean boolean3 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = null;
        hashMap4.table = entryArray5;
        java.lang.Object obj7 = hashMap1.remove((java.lang.Object) entryArray5);
        int int8 = hashMap1.size();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap1.table;
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(10, (float) '#');
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap2.table;
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(10, (float) '#');
        java.lang.Object obj3 = null;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (byte) 100);
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        java.lang.Object obj9 = hashMap6.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        java.lang.Object obj12 = hashMap6.put((java.lang.Object) hashMap10, (java.lang.Object) 0.0f);
        int int13 = hashMap10.modCount;
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Object obj16 = hashMap5.put((java.lang.Object) hashMap10, (java.lang.Object) 'a');
        java.lang.Object obj17 = hashMap2.put(obj3, (java.lang.Object) hashMap10);
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray20 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap19.table = entryArray20;
        hashMap18.table = entryArray20;
        hashMap2.table = entryArray20;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.isEmpty();
        hashMap0.modCount = (short) 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int2 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray4 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap3.table = entryArray4;
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap3.table;
        java.lang.Class<?> wildcardClass7 = hashMap3.getClass();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap9.table;
        java.lang.Object obj11 = hashMap1.put((java.lang.Object) hashMap3, (java.lang.Object) entryArray10);
        boolean boolean12 = hashMap1.repOK();
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap1.table;
        boolean boolean3 = hashMap1.isEmpty();
        boolean boolean4 = hashMap1.repOK();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap5.table = entryArray6;
        int int8 = hashMap5.size();
        java.lang.Object obj9 = hashMap1.remove((java.lang.Object) int8);
        hashMap1.modCount = (short) 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 100);
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap2.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        java.lang.Object obj8 = hashMap2.put((java.lang.Object) hashMap6, (java.lang.Object) 0.0f);
        int int9 = hashMap6.modCount;
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Object obj12 = hashMap1.put((java.lang.Object) hashMap6, (java.lang.Object) 'a');
        hashMap6.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap6", hashMap6.repOK_2());
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) hashMap4, (java.lang.Object) 0.0f);
        int int7 = hashMap4.modCount;
        int int8 = hashMap4.modCount;
        int int9 = hashMap4.modCount;
        hashMap4.modCount = 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap4", hashMap4.repOK_2());
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap1.table;
        boolean boolean3 = hashMap1.isEmpty();
        boolean boolean4 = hashMap1.repOK();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap5.table = entryArray6;
        int int8 = hashMap5.size();
        java.lang.Object obj9 = hashMap1.remove((java.lang.Object) int8);
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) ' ', 10.0f);
        boolean boolean3 = hashMap2.isEmpty();
        hashMap2.modCount = 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        boolean boolean6 = hashMap5.repOK();
        java.lang.Object obj8 = hashMap5.remove((java.lang.Object) (byte) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap5.table;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap11.table = entryArray12;
        hashMap10.table = entryArray12;
        hashMap10.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap10.table;
        java.lang.Object obj17 = hashMap5.get((java.lang.Object) entryArray16);
        hashMap0.table = entryArray16;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(100);
        hashMap1.modCount = 'a';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 1);
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) hashMap4, (java.lang.Object) 0.0f);
        boolean boolean7 = hashMap4.isEmpty();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap9.table;
        boolean boolean11 = hashMap9.isEmpty();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = null;
        hashMap12.table = entryArray13;
        java.lang.Object obj15 = hashMap9.remove((java.lang.Object) entryArray13);
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap9.table;
        hashMap4.table = entryArray16;
        int int18 = hashMap4.modCount;
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        java.lang.Object obj22 = hashMap19.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        int int23 = hashMap19.modCount;
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap();
        boolean boolean25 = hashMap24.repOK();
        java.lang.Object obj27 = hashMap24.remove((java.lang.Object) (byte) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray28 = hashMap24.table;
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray31 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap30.table = entryArray31;
        hashMap29.table = entryArray31;
        hashMap29.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray35 = hashMap29.table;
        java.lang.Object obj36 = hashMap24.get((java.lang.Object) entryArray35);
        java.lang.Object obj37 = hashMap4.put((java.lang.Object) hashMap19, (java.lang.Object) entryArray35);
        system.classfixer.classes.HashMap hashMap39 = new system.classfixer.classes.HashMap();
        java.lang.Object obj42 = hashMap39.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap.Entry entry43 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray44 = new system.classfixer.classes.HashMap.Entry[] { entry43 };
        hashMap39.table = entryArray44;
        int int46 = hashMap39.modCount;
        boolean boolean47 = hashMap39.repOK();
        java.lang.Class<?> wildcardClass48 = hashMap39.getClass();
        java.lang.Object obj49 = hashMap4.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap39);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap4", hashMap4.repOK_2());
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.isEmpty();
        int int3 = hashMap0.size();
        hashMap0.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap1.table;
        boolean boolean3 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = null;
        hashMap4.table = entryArray5;
        java.lang.Object obj7 = hashMap1.remove((java.lang.Object) entryArray5);
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 10, (float) 10L);
        hashMap2.modCount = 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        int int4 = hashMap0.modCount;
        int int5 = hashMap0.size();
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        hashMap1.modCount = (short) 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj3 = hashMap0.remove((java.lang.Object) (byte) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray7 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap6.table = entryArray7;
        hashMap5.table = entryArray7;
        hashMap5.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap5.table;
        java.lang.Object obj12 = hashMap0.get((java.lang.Object) entryArray11);
        boolean boolean13 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray16 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap15.table = entryArray16;
        hashMap14.table = entryArray16;
        java.lang.Object obj19 = hashMap0.remove((java.lang.Object) hashMap14);
        hashMap0.modCount = '4';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) hashMap4, (java.lang.Object) 0.0f);
        boolean boolean7 = hashMap4.isEmpty();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap9.table;
        boolean boolean11 = hashMap9.isEmpty();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = null;
        hashMap12.table = entryArray13;
        java.lang.Object obj15 = hashMap9.remove((java.lang.Object) entryArray13);
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap9.table;
        hashMap4.table = entryArray16;
        int int18 = hashMap4.modCount;
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        java.lang.Object obj22 = hashMap19.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        int int23 = hashMap19.modCount;
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap();
        boolean boolean25 = hashMap24.repOK();
        java.lang.Object obj27 = hashMap24.remove((java.lang.Object) (byte) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray28 = hashMap24.table;
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray31 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap30.table = entryArray31;
        hashMap29.table = entryArray31;
        hashMap29.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray35 = hashMap29.table;
        java.lang.Object obj36 = hashMap24.get((java.lang.Object) entryArray35);
        java.lang.Object obj37 = hashMap4.put((java.lang.Object) hashMap19, (java.lang.Object) entryArray35);
        system.classfixer.classes.HashMap hashMap38 = new system.classfixer.classes.HashMap();
        java.lang.Object obj41 = hashMap38.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap44 = new system.classfixer.classes.HashMap(10, (float) '#');
        java.lang.Object obj45 = hashMap38.remove((java.lang.Object) hashMap44);
        system.classfixer.classes.HashMap.Entry[] entryArray46 = hashMap44.table;
        boolean boolean47 = hashMap44.isEmpty();
        system.classfixer.classes.HashMap hashMap48 = new system.classfixer.classes.HashMap();
        java.lang.Object obj51 = hashMap48.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap52 = new system.classfixer.classes.HashMap();
        java.lang.Object obj54 = hashMap48.put((java.lang.Object) hashMap52, (java.lang.Object) 0.0f);
        boolean boolean55 = hashMap52.isEmpty();
        system.classfixer.classes.HashMap hashMap57 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray58 = hashMap57.table;
        boolean boolean59 = hashMap57.isEmpty();
        system.classfixer.classes.HashMap hashMap60 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray61 = null;
        hashMap60.table = entryArray61;
        java.lang.Object obj63 = hashMap57.remove((java.lang.Object) entryArray61);
        system.classfixer.classes.HashMap.Entry[] entryArray64 = hashMap57.table;
        hashMap52.table = entryArray64;
        int int66 = hashMap52.modCount;
        system.classfixer.classes.HashMap hashMap67 = new system.classfixer.classes.HashMap();
        java.lang.Object obj70 = hashMap67.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        int int71 = hashMap67.modCount;
        system.classfixer.classes.HashMap hashMap72 = new system.classfixer.classes.HashMap();
        boolean boolean73 = hashMap72.repOK();
        java.lang.Object obj75 = hashMap72.remove((java.lang.Object) (byte) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray76 = hashMap72.table;
        system.classfixer.classes.HashMap hashMap77 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap78 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray79 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap78.table = entryArray79;
        hashMap77.table = entryArray79;
        hashMap77.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray83 = hashMap77.table;
        java.lang.Object obj84 = hashMap72.get((java.lang.Object) entryArray83);
        java.lang.Object obj85 = hashMap52.put((java.lang.Object) hashMap67, (java.lang.Object) entryArray83);
        hashMap44.table = entryArray83;
        hashMap4.table = entryArray83;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap4", hashMap4.repOK_2());
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap(10, (float) '#');
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int8 = hashMap7.size();
        java.lang.Object obj9 = hashMap0.put((java.lang.Object) '#', (java.lang.Object) hashMap7);
        hashMap7.modCount = 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap7", hashMap7.repOK_2());
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap1.table;
        boolean boolean3 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = null;
        hashMap4.table = entryArray5;
        java.lang.Object obj7 = hashMap1.remove((java.lang.Object) entryArray5);
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap1.table;
        java.lang.Object obj10 = hashMap1.get((java.lang.Object) 100.0f);
        int int11 = hashMap1.modCount;
        boolean boolean12 = hashMap1.isEmpty();
        hashMap1.modCount = (short) 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(0, (float) 10);
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean2 = hashMap1.isEmpty();
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap.Entry entry4 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray5 = new system.classfixer.classes.HashMap.Entry[] { entry4 };
        hashMap0.table = entryArray5;
        java.lang.Object obj7 = null;
        java.lang.Object obj8 = hashMap0.remove(obj7);
        int int9 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap11.table;
        boolean boolean13 = hashMap11.isEmpty();
        boolean boolean14 = hashMap11.repOK();
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray16 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap15.table = entryArray16;
        int int18 = hashMap15.size();
        java.lang.Object obj19 = hashMap11.remove((java.lang.Object) int18);
        java.lang.Class<?> wildcardClass20 = hashMap11.getClass();
        java.lang.Object obj21 = hashMap0.remove((java.lang.Object) wildcardClass20);
        int int22 = hashMap0.modCount;
        int int23 = hashMap0.size();
        hashMap0.modCount = 'a';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        int int2 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj6 = hashMap3.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap.Entry entry7 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray8 = new system.classfixer.classes.HashMap.Entry[] { entry7 };
        hashMap3.table = entryArray8;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        java.lang.Object obj15 = hashMap12.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap12.table;
        java.lang.Object obj17 = hashMap10.put((java.lang.Object) true, (java.lang.Object) hashMap12);
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap12.table;
        hashMap3.table = entryArray18;
        hashMap0.table = entryArray18;
        hashMap0.modCount = '#';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap2.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap2.table;
        java.lang.Object obj7 = hashMap0.put((java.lang.Object) true, (java.lang.Object) hashMap2);
        int int8 = hashMap2.modCount;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap10.table;
        boolean boolean12 = hashMap10.isEmpty();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray14 = null;
        hashMap13.table = entryArray14;
        java.lang.Object obj16 = hashMap10.remove((java.lang.Object) entryArray14);
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap10.table;
        java.lang.Object obj18 = hashMap2.get((java.lang.Object) hashMap10);
        hashMap10.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap10", hashMap10.repOK_2());
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray1 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap0.table = entryArray1;
        int int3 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        boolean boolean5 = hashMap4.repOK();
        java.lang.Object obj7 = hashMap4.remove((java.lang.Object) (byte) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap4.table;
        hashMap0.table = entryArray8;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        boolean boolean11 = hashMap10.repOK();
        java.lang.Object obj13 = hashMap10.remove((java.lang.Object) (byte) 0);
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray16 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap15.table = entryArray16;
        hashMap14.table = entryArray16;
        hashMap14.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray20 = hashMap14.table;
        java.lang.Object obj21 = hashMap10.remove((java.lang.Object) entryArray20);
        java.lang.Object obj22 = null;
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap((int) '4');
        boolean boolean25 = hashMap24.repOK();
        boolean boolean26 = hashMap24.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray27 = hashMap24.table;
        java.lang.Object obj28 = hashMap10.put(obj22, (java.lang.Object) entryArray27);
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap();
        java.lang.Object obj32 = hashMap29.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap.Entry entry33 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray34 = new system.classfixer.classes.HashMap.Entry[] { entry33 };
        hashMap29.table = entryArray34;
        java.lang.Object obj37 = hashMap29.remove((java.lang.Object) '#');
        system.classfixer.classes.HashMap.Entry[] entryArray38 = hashMap29.table;
        java.lang.Object obj39 = hashMap0.put(obj22, (java.lang.Object) hashMap29);
        system.classfixer.classes.HashMap hashMap41 = new system.classfixer.classes.HashMap((int) (byte) 100);
        system.classfixer.classes.HashMap hashMap42 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap43 = new system.classfixer.classes.HashMap();
        java.lang.Object obj46 = hashMap43.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap.Entry entry47 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray48 = new system.classfixer.classes.HashMap.Entry[] { entry47 };
        hashMap43.table = entryArray48;
        int int50 = hashMap43.modCount;
        boolean boolean51 = hashMap43.repOK();
        java.lang.Object obj52 = hashMap42.remove((java.lang.Object) boolean51);
        java.lang.Object obj53 = hashMap41.remove((java.lang.Object) hashMap42);
        system.classfixer.classes.HashMap hashMap55 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray56 = hashMap55.table;
        boolean boolean57 = hashMap55.isEmpty();
        system.classfixer.classes.HashMap hashMap58 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray59 = null;
        hashMap58.table = entryArray59;
        java.lang.Object obj61 = hashMap55.remove((java.lang.Object) entryArray59);
        int int62 = hashMap55.size();
        java.lang.Object obj63 = hashMap41.get((java.lang.Object) hashMap55);
        java.lang.Object obj65 = hashMap29.put(obj63, (java.lang.Object) 10.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap29", hashMap29.repOK_2());
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap.Entry entry4 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray5 = new system.classfixer.classes.HashMap.Entry[] { entry4 };
        hashMap0.table = entryArray5;
        int int7 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        java.lang.Object obj13 = hashMap10.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap10.table;
        java.lang.Object obj15 = hashMap8.put((java.lang.Object) true, (java.lang.Object) hashMap10);
        int int16 = hashMap10.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap10.table;
        int int18 = hashMap10.size();
        java.lang.Object obj19 = hashMap0.remove((java.lang.Object) hashMap10);
        hashMap10.modCount = (byte) 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap10", hashMap10.repOK_2());
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap1.table;
        hashMap1.modCount = (short) 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj3 = hashMap0.remove((java.lang.Object) (byte) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray7 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap6.table = entryArray7;
        hashMap5.table = entryArray7;
        hashMap5.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap5.table;
        java.lang.Object obj12 = hashMap0.get((java.lang.Object) entryArray11);
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 100);
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj6 = hashMap3.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap.Entry entry7 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray8 = new system.classfixer.classes.HashMap.Entry[] { entry7 };
        hashMap3.table = entryArray8;
        int int10 = hashMap3.modCount;
        boolean boolean11 = hashMap3.repOK();
        java.lang.Object obj12 = hashMap2.remove((java.lang.Object) boolean11);
        java.lang.Object obj13 = hashMap1.remove((java.lang.Object) hashMap2);
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap15.table;
        boolean boolean17 = hashMap15.isEmpty();
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray19 = null;
        hashMap18.table = entryArray19;
        java.lang.Object obj21 = hashMap15.remove((java.lang.Object) entryArray19);
        int int22 = hashMap15.size();
        java.lang.Object obj23 = hashMap1.get((java.lang.Object) hashMap15);
        int int24 = hashMap15.modCount;
        hashMap15.modCount = (byte) 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap15", hashMap15.repOK_2());
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) hashMap4, (java.lang.Object) 0.0f);
        int int7 = hashMap4.modCount;
        int int8 = hashMap4.modCount;
        int int9 = hashMap4.modCount;
        int int10 = hashMap4.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap4.table;
        hashMap4.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap4", hashMap4.repOK_2());
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 1);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap3.table;
        boolean boolean5 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray7 = null;
        hashMap6.table = entryArray7;
        java.lang.Object obj9 = hashMap3.remove((java.lang.Object) entryArray7);
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap3.table;
        java.lang.Object obj11 = hashMap1.get((java.lang.Object) entryArray10);
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap13.table;
        boolean boolean15 = hashMap13.isEmpty();
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray17 = null;
        hashMap16.table = entryArray17;
        java.lang.Object obj19 = hashMap13.remove((java.lang.Object) entryArray17);
        system.classfixer.classes.HashMap.Entry[] entryArray20 = hashMap13.table;
        java.lang.Object obj22 = hashMap13.get((java.lang.Object) 100.0f);
        int int23 = hashMap13.modCount;
        boolean boolean24 = hashMap13.isEmpty();
        java.lang.Object obj25 = hashMap1.remove((java.lang.Object) hashMap13);
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) hashMap4, (java.lang.Object) 0.0f);
        hashMap0.modCount = (byte) 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) ' ', 10.0f);
        boolean boolean3 = hashMap2.isEmpty();
        boolean boolean4 = hashMap2.isEmpty();
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(10, (float) '#');
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap2.table;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap(0, (float) 10);
        java.lang.Object obj7 = hashMap2.get((java.lang.Object) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap2.table;
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        boolean boolean3 = hashMap2.repOK();
        java.lang.Object obj5 = hashMap2.remove((java.lang.Object) (byte) 0);
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap7.table = entryArray8;
        hashMap6.table = entryArray8;
        hashMap6.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap6.table;
        java.lang.Object obj13 = hashMap2.remove((java.lang.Object) entryArray12);
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap15.table;
        boolean boolean17 = hashMap15.isEmpty();
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray19 = null;
        hashMap18.table = entryArray19;
        java.lang.Object obj21 = hashMap15.remove((java.lang.Object) entryArray19);
        system.classfixer.classes.HashMap.Entry[] entryArray22 = hashMap15.table;
        java.lang.Object obj23 = hashMap1.put((java.lang.Object) entryArray12, (java.lang.Object) entryArray22);
        int int24 = hashMap1.size();
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 100);
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj6 = hashMap3.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap.Entry entry7 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray8 = new system.classfixer.classes.HashMap.Entry[] { entry7 };
        hashMap3.table = entryArray8;
        int int10 = hashMap3.modCount;
        boolean boolean11 = hashMap3.repOK();
        java.lang.Object obj12 = hashMap2.remove((java.lang.Object) boolean11);
        java.lang.Object obj13 = hashMap1.remove((java.lang.Object) hashMap2);
        boolean boolean14 = hashMap2.isEmpty();
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        int int2 = hashMap0.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap5.table = entryArray6;
        hashMap4.table = entryArray6;
        hashMap4.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap4.table;
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        java.lang.Object obj14 = hashMap11.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap.Entry entry15 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray16 = new system.classfixer.classes.HashMap.Entry[] { entry15 };
        hashMap11.table = entryArray16;
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        java.lang.Object obj23 = hashMap20.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap20.table;
        java.lang.Object obj25 = hashMap18.put((java.lang.Object) true, (java.lang.Object) hashMap20);
        system.classfixer.classes.HashMap.Entry[] entryArray26 = hashMap20.table;
        hashMap11.table = entryArray26;
        int int28 = hashMap11.modCount;
        java.lang.Object obj29 = hashMap0.put((java.lang.Object) hashMap4, (java.lang.Object) hashMap11);
        boolean boolean30 = hashMap4.isEmpty();
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray33 = hashMap32.table;
        boolean boolean34 = hashMap32.isEmpty();
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray36 = null;
        hashMap35.table = entryArray36;
        java.lang.Object obj38 = hashMap32.remove((java.lang.Object) entryArray36);
        system.classfixer.classes.HashMap.Entry[] entryArray39 = hashMap32.table;
        hashMap4.table = entryArray39;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap4", hashMap4.repOK_2());
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) hashMap4, (java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        java.lang.Object obj10 = hashMap7.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap.Entry entry11 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray12 = new system.classfixer.classes.HashMap.Entry[] { entry11 };
        hashMap7.table = entryArray12;
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        java.lang.Object obj19 = hashMap16.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap.Entry[] entryArray20 = hashMap16.table;
        java.lang.Object obj21 = hashMap14.put((java.lang.Object) true, (java.lang.Object) hashMap16);
        system.classfixer.classes.HashMap.Entry[] entryArray22 = hashMap16.table;
        hashMap7.table = entryArray22;
        hashMap4.table = entryArray22;
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap((int) (byte) 100);
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap();
        java.lang.Object obj31 = hashMap28.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap.Entry entry32 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray33 = new system.classfixer.classes.HashMap.Entry[] { entry32 };
        hashMap28.table = entryArray33;
        int int35 = hashMap28.modCount;
        boolean boolean36 = hashMap28.repOK();
        java.lang.Object obj37 = hashMap27.remove((java.lang.Object) boolean36);
        java.lang.Object obj38 = hashMap26.remove((java.lang.Object) hashMap27);
        system.classfixer.classes.HashMap.Entry[] entryArray39 = hashMap26.table;
        java.lang.Object obj40 = hashMap4.remove((java.lang.Object) hashMap26);
        hashMap4.modCount = (short) 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap4", hashMap4.repOK_2());
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) hashMap4, (java.lang.Object) 0.0f);
        boolean boolean7 = hashMap4.isEmpty();
        int int8 = hashMap4.modCount;
        int int9 = hashMap4.size();
        boolean boolean10 = hashMap4.repOK();
        hashMap4.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap4", hashMap4.repOK_2());
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        int int4 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        java.lang.Object obj8 = hashMap5.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        java.lang.Object obj11 = hashMap5.put((java.lang.Object) hashMap9, (java.lang.Object) 0.0f);
        boolean boolean12 = hashMap9.isEmpty();
        int int13 = hashMap9.modCount;
        int int14 = hashMap9.modCount;
        boolean boolean15 = hashMap9.isEmpty();
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap(100, (float) 1);
        int int19 = hashMap18.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray20 = hashMap18.table;
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap18.table;
        java.lang.Object obj22 = hashMap0.put((java.lang.Object) hashMap9, (java.lang.Object) hashMap18);
        boolean boolean23 = hashMap18.repOK();
        hashMap18.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap18", hashMap18.repOK_2());
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap.Entry entry4 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray5 = new system.classfixer.classes.HashMap.Entry[] { entry4 };
        hashMap0.table = entryArray5;
        int int7 = hashMap0.modCount;
        boolean boolean8 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        boolean boolean10 = hashMap9.repOK();
        java.lang.Object obj12 = hashMap9.remove((java.lang.Object) (byte) 0);
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        java.lang.Object obj16 = hashMap13.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap.Entry entry17 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray18 = new system.classfixer.classes.HashMap.Entry[] { entry17 };
        hashMap13.table = entryArray18;
        java.lang.Object obj20 = hashMap9.remove((java.lang.Object) entryArray18);
        java.lang.Object obj21 = hashMap0.remove((java.lang.Object) hashMap9);
        hashMap9.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap9", hashMap9.repOK_2());
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        int int2 = hashMap0.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap5.table = entryArray6;
        hashMap4.table = entryArray6;
        hashMap4.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap4.table;
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        java.lang.Object obj14 = hashMap11.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap.Entry entry15 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray16 = new system.classfixer.classes.HashMap.Entry[] { entry15 };
        hashMap11.table = entryArray16;
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        java.lang.Object obj23 = hashMap20.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap20.table;
        java.lang.Object obj25 = hashMap18.put((java.lang.Object) true, (java.lang.Object) hashMap20);
        system.classfixer.classes.HashMap.Entry[] entryArray26 = hashMap20.table;
        hashMap11.table = entryArray26;
        int int28 = hashMap11.modCount;
        java.lang.Object obj29 = hashMap0.put((java.lang.Object) hashMap4, (java.lang.Object) hashMap11);
        hashMap0.modCount = (byte) 0;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) hashMap4, (java.lang.Object) 0.0f);
        boolean boolean7 = hashMap4.isEmpty();
        int int8 = hashMap4.modCount;
        int int9 = hashMap4.size();
        boolean boolean10 = hashMap4.repOK();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap(100, (float) 10L);
        int int14 = hashMap13.size();
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        java.lang.Object obj18 = hashMap15.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        java.lang.Object obj21 = hashMap15.put((java.lang.Object) hashMap19, (java.lang.Object) 0.0f);
        boolean boolean22 = hashMap19.isEmpty();
        int int23 = hashMap19.modCount;
        int int24 = hashMap19.modCount;
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap();
        boolean boolean26 = hashMap25.repOK();
        java.lang.Object obj28 = hashMap25.remove((java.lang.Object) (byte) 0);
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray31 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap30.table = entryArray31;
        hashMap29.table = entryArray31;
        hashMap29.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray35 = hashMap29.table;
        java.lang.Object obj36 = hashMap25.remove((java.lang.Object) entryArray35);
        hashMap19.table = entryArray35;
        hashMap13.table = entryArray35;
        hashMap13.modCount = (short) -1;
        system.classfixer.classes.HashMap hashMap43 = new system.classfixer.classes.HashMap(100, (float) 1);
        int int44 = hashMap43.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray45 = hashMap43.table;
        boolean boolean46 = hashMap43.repOK();
        java.lang.Object obj47 = hashMap4.put((java.lang.Object) hashMap13, (java.lang.Object) hashMap43);
        hashMap4.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap4", hashMap4.repOK_2());
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int2 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray4 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap3.table = entryArray4;
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap3.table;
        java.lang.Class<?> wildcardClass7 = hashMap3.getClass();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap9.table;
        java.lang.Object obj11 = hashMap1.put((java.lang.Object) hashMap3, (java.lang.Object) entryArray10);
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap((int) (short) 100, (float) 100L);
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap17.table;
        java.lang.Object obj20 = hashMap14.put((java.lang.Object) entryArray18, (java.lang.Object) 1.0d);
        java.lang.Object obj21 = hashMap1.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap14);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean2 = hashMap1.isEmpty();
        boolean boolean3 = hashMap1.repOK();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) '4');
        boolean boolean6 = hashMap5.repOK();
        boolean boolean7 = hashMap5.isEmpty();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        java.lang.Object obj13 = hashMap10.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap10.table;
        java.lang.Object obj15 = hashMap8.put((java.lang.Object) true, (java.lang.Object) hashMap10);
        boolean boolean16 = hashMap10.isEmpty();
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        java.lang.Object obj20 = hashMap17.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap.Entry entry21 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray22 = new system.classfixer.classes.HashMap.Entry[] { entry21 };
        hashMap17.table = entryArray22;
        java.lang.Object obj25 = hashMap17.remove((java.lang.Object) '#');
        system.classfixer.classes.HashMap.Entry[] entryArray26 = hashMap17.table;
        java.lang.Object obj27 = hashMap5.put((java.lang.Object) boolean16, (java.lang.Object) entryArray26);
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray30 = hashMap29.table;
        java.lang.Object obj31 = hashMap1.put(obj27, (java.lang.Object) hashMap29);
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap2.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap2.table;
        java.lang.Object obj7 = hashMap0.put((java.lang.Object) true, (java.lang.Object) hashMap2);
        int int8 = hashMap2.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap2.table;
        hashMap2.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap.Entry entry4 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray5 = new system.classfixer.classes.HashMap.Entry[] { entry4 };
        hashMap0.table = entryArray5;
        int int7 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap8.table = entryArray9;
        int int11 = hashMap8.size();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        boolean boolean13 = hashMap12.repOK();
        java.lang.Object obj15 = hashMap12.remove((java.lang.Object) (byte) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap12.table;
        hashMap8.table = entryArray16;
        java.lang.Object obj18 = hashMap0.remove((java.lang.Object) entryArray16);
        java.lang.Object obj19 = null;
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        java.lang.Object obj25 = hashMap22.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap.Entry[] entryArray26 = hashMap22.table;
        java.lang.Object obj27 = hashMap20.put((java.lang.Object) true, (java.lang.Object) hashMap22);
        int int28 = hashMap22.modCount;
        boolean boolean29 = hashMap22.repOK();
        boolean boolean30 = hashMap22.isEmpty();
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap((int) (byte) 0);
        java.lang.Object obj33 = null;
        java.lang.Object obj34 = hashMap32.remove(obj33);
        boolean boolean35 = hashMap32.isEmpty();
        java.lang.Object obj36 = hashMap22.get((java.lang.Object) hashMap32);
        java.lang.Object obj37 = hashMap0.put(obj19, obj36);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        int int4 = hashMap0.modCount;
        hashMap0.modCount = '4';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap.Entry entry4 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray5 = new system.classfixer.classes.HashMap.Entry[] { entry4 };
        hashMap0.table = entryArray5;
        int int7 = hashMap0.modCount;
        boolean boolean8 = hashMap0.repOK();
        int int9 = hashMap0.modCount;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        int int2 = hashMap0.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap5.table = entryArray6;
        hashMap4.table = entryArray6;
        hashMap4.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap4.table;
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        java.lang.Object obj14 = hashMap11.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap.Entry entry15 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray16 = new system.classfixer.classes.HashMap.Entry[] { entry15 };
        hashMap11.table = entryArray16;
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        java.lang.Object obj23 = hashMap20.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap20.table;
        java.lang.Object obj25 = hashMap18.put((java.lang.Object) true, (java.lang.Object) hashMap20);
        system.classfixer.classes.HashMap.Entry[] entryArray26 = hashMap20.table;
        hashMap11.table = entryArray26;
        int int28 = hashMap11.modCount;
        java.lang.Object obj29 = hashMap0.put((java.lang.Object) hashMap4, (java.lang.Object) hashMap11);
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        int int2 = hashMap0.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (short) 100);
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = hashMap0.put((java.lang.Object) (short) 100, obj6);
        boolean boolean8 = hashMap0.repOK();
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray1 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap0.table = entryArray1;
        int int3 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        boolean boolean5 = hashMap4.repOK();
        java.lang.Object obj7 = hashMap4.remove((java.lang.Object) (byte) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap4.table;
        hashMap0.table = entryArray8;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap2.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap2.table;
        java.lang.Object obj7 = hashMap0.put((java.lang.Object) true, (java.lang.Object) hashMap2);
        int int8 = hashMap2.modCount;
        boolean boolean9 = hashMap2.repOK();
        boolean boolean10 = hashMap2.isEmpty();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) (byte) 0);
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = hashMap12.remove(obj13);
        boolean boolean15 = hashMap12.isEmpty();
        java.lang.Object obj16 = hashMap2.get((java.lang.Object) hashMap12);
        hashMap12.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap12", hashMap12.repOK_2());
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) hashMap4, (java.lang.Object) 0.0f);
        boolean boolean7 = hashMap4.isEmpty();
        int int8 = hashMap4.modCount;
        int int9 = hashMap4.size();
        boolean boolean10 = hashMap4.repOK();
        hashMap4.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap4", hashMap4.repOK_2());
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap2.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap2.table;
        java.lang.Object obj7 = hashMap0.put((java.lang.Object) true, (java.lang.Object) hashMap2);
        int int8 = hashMap2.modCount;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap10.table;
        boolean boolean12 = hashMap10.isEmpty();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray14 = null;
        hashMap13.table = entryArray14;
        java.lang.Object obj16 = hashMap10.remove((java.lang.Object) entryArray14);
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap10.table;
        java.lang.Object obj18 = hashMap2.get((java.lang.Object) hashMap10);
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int21 = hashMap20.size();
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray23 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap22.table = entryArray23;
        system.classfixer.classes.HashMap.Entry[] entryArray25 = hashMap22.table;
        java.lang.Class<?> wildcardClass26 = hashMap22.getClass();
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray29 = hashMap28.table;
        java.lang.Object obj30 = hashMap20.put((java.lang.Object) hashMap22, (java.lang.Object) entryArray29);
        hashMap2.table = entryArray29;
        system.classfixer.classes.HashMap.Entry[] entryArray32 = hashMap2.table;
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray34 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap33.table = entryArray34;
        int int36 = hashMap33.size();
        system.classfixer.classes.HashMap hashMap37 = new system.classfixer.classes.HashMap();
        boolean boolean38 = hashMap37.repOK();
        java.lang.Object obj40 = hashMap37.remove((java.lang.Object) (byte) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray41 = hashMap37.table;
        hashMap33.table = entryArray41;
        system.classfixer.classes.HashMap hashMap43 = new system.classfixer.classes.HashMap();
        java.lang.Object obj46 = hashMap43.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap47 = new system.classfixer.classes.HashMap();
        java.lang.Object obj49 = hashMap43.put((java.lang.Object) hashMap47, (java.lang.Object) 0.0f);
        boolean boolean50 = hashMap47.isEmpty();
        int int51 = hashMap47.modCount;
        int int52 = hashMap47.modCount;
        system.classfixer.classes.HashMap hashMap53 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray54 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap53.table = entryArray54;
        hashMap47.table = entryArray54;
        java.lang.Object obj57 = hashMap33.get((java.lang.Object) hashMap47);
        system.classfixer.classes.HashMap hashMap58 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap60 = new system.classfixer.classes.HashMap();
        java.lang.Object obj63 = hashMap60.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap.Entry[] entryArray64 = hashMap60.table;
        java.lang.Object obj65 = hashMap58.put((java.lang.Object) true, (java.lang.Object) hashMap60);
        int int66 = hashMap60.modCount;
        boolean boolean67 = hashMap60.repOK();
        boolean boolean68 = hashMap60.isEmpty();
        system.classfixer.classes.HashMap hashMap70 = new system.classfixer.classes.HashMap((int) (byte) 0);
        java.lang.Object obj71 = null;
        java.lang.Object obj72 = hashMap70.remove(obj71);
        boolean boolean73 = hashMap70.isEmpty();
        java.lang.Object obj74 = hashMap60.get((java.lang.Object) hashMap70);
        system.classfixer.classes.HashMap.Entry[] entryArray75 = hashMap70.table;
        java.lang.Object obj76 = hashMap2.put((java.lang.Object) hashMap33, (java.lang.Object) entryArray75);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        int int2 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray4 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap3.table = entryArray4;
        int int6 = hashMap3.size();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        boolean boolean8 = hashMap7.repOK();
        java.lang.Object obj10 = hashMap7.remove((java.lang.Object) (byte) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap7.table;
        hashMap3.table = entryArray11;
        java.lang.Object obj13 = hashMap0.remove((java.lang.Object) entryArray11);
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        java.lang.Object obj18 = hashMap15.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap.Entry entry19 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray20 = new system.classfixer.classes.HashMap.Entry[] { entry19 };
        hashMap15.table = entryArray20;
        java.lang.Object obj22 = hashMap0.remove((java.lang.Object) entryArray20);
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap(10, (float) '#');
        java.lang.Object obj26 = null;
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap((int) (byte) 100);
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap();
        java.lang.Object obj32 = hashMap29.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap();
        java.lang.Object obj35 = hashMap29.put((java.lang.Object) hashMap33, (java.lang.Object) 0.0f);
        int int36 = hashMap33.modCount;
        system.classfixer.classes.HashMap hashMap38 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Object obj39 = hashMap28.put((java.lang.Object) hashMap33, (java.lang.Object) 'a');
        java.lang.Object obj40 = hashMap25.put(obj26, (java.lang.Object) hashMap33);
        java.lang.Object obj41 = hashMap0.remove(obj40);
        hashMap0.modCount = '4';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 100, (float) 100L);
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) '4', 1.0f);
        int int6 = hashMap5.size();
        java.lang.Object obj7 = hashMap2.get((java.lang.Object) int6);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.repOK();
        java.lang.Object obj11 = hashMap8.remove((java.lang.Object) (byte) 0);
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        java.lang.Object obj15 = hashMap12.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap.Entry entry16 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray17 = new system.classfixer.classes.HashMap.Entry[] { entry16 };
        hashMap12.table = entryArray17;
        java.lang.Object obj19 = hashMap8.remove((java.lang.Object) entryArray17);
        hashMap2.table = entryArray17;
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        int int4 = hashMap0.modCount;
        int int5 = hashMap0.size();
        int int6 = hashMap0.modCount;
        java.lang.Object obj8 = hashMap0.get((java.lang.Object) 10);
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        int int4 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        java.lang.Object obj8 = hashMap5.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        java.lang.Object obj11 = hashMap5.put((java.lang.Object) hashMap9, (java.lang.Object) 0.0f);
        boolean boolean12 = hashMap9.isEmpty();
        int int13 = hashMap9.modCount;
        int int14 = hashMap9.modCount;
        boolean boolean15 = hashMap9.isEmpty();
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap(100, (float) 1);
        int int19 = hashMap18.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray20 = hashMap18.table;
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap18.table;
        java.lang.Object obj22 = hashMap0.put((java.lang.Object) hashMap9, (java.lang.Object) hashMap18);
        hashMap18.modCount = 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap18", hashMap18.repOK_2());
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj3 = hashMap0.remove((java.lang.Object) (byte) 0);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        boolean boolean5 = hashMap4.repOK();
        boolean boolean6 = hashMap4.isEmpty();
        java.lang.Object obj7 = hashMap0.get((java.lang.Object) boolean6);
        hashMap0.modCount = 0;
        int int10 = hashMap0.size();
        hashMap0.modCount = (byte) 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.isEmpty();
        hashMap0.modCount = (byte) 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) hashMap4, (java.lang.Object) 0.0f);
        int int7 = hashMap4.modCount;
        int int8 = hashMap4.modCount;
        int int9 = hashMap4.modCount;
        int int10 = hashMap4.modCount;
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        java.lang.Object obj14 = hashMap11.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        java.lang.Object obj17 = hashMap11.put((java.lang.Object) hashMap15, (java.lang.Object) 0.0f);
        boolean boolean18 = hashMap15.isEmpty();
        boolean boolean19 = hashMap15.repOK();
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        java.lang.Object obj25 = hashMap22.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap(10, (float) '#');
        java.lang.Object obj29 = hashMap22.remove((java.lang.Object) hashMap28);
        system.classfixer.classes.HashMap.Entry[] entryArray30 = hashMap28.table;
        hashMap21.table = entryArray30;
        hashMap15.table = entryArray30;
        hashMap4.table = entryArray30;
        hashMap4.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap4", hashMap4.repOK_2());
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 100);
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj6 = hashMap3.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap.Entry entry7 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray8 = new system.classfixer.classes.HashMap.Entry[] { entry7 };
        hashMap3.table = entryArray8;
        int int10 = hashMap3.modCount;
        boolean boolean11 = hashMap3.repOK();
        java.lang.Object obj12 = hashMap2.remove((java.lang.Object) boolean11);
        java.lang.Object obj13 = hashMap1.remove((java.lang.Object) hashMap2);
        boolean boolean14 = hashMap2.isEmpty();
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        boolean boolean18 = hashMap17.repOK();
        java.lang.Object obj20 = hashMap17.remove((java.lang.Object) (byte) 0);
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray23 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap22.table = entryArray23;
        hashMap21.table = entryArray23;
        hashMap21.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray27 = hashMap21.table;
        java.lang.Object obj28 = hashMap17.remove((java.lang.Object) entryArray27);
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray31 = hashMap30.table;
        boolean boolean32 = hashMap30.isEmpty();
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray34 = null;
        hashMap33.table = entryArray34;
        java.lang.Object obj36 = hashMap30.remove((java.lang.Object) entryArray34);
        system.classfixer.classes.HashMap.Entry[] entryArray37 = hashMap30.table;
        java.lang.Object obj38 = hashMap16.put((java.lang.Object) entryArray27, (java.lang.Object) entryArray37);
        boolean boolean39 = hashMap16.isEmpty();
        java.lang.Object obj40 = hashMap2.get((java.lang.Object) boolean39);
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) '#', (float) (byte) 10);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        boolean boolean6 = hashMap5.repOK();
        java.lang.Object obj8 = hashMap5.remove((java.lang.Object) (byte) 0);
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray11 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap10.table = entryArray11;
        hashMap9.table = entryArray11;
        hashMap9.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap9.table;
        java.lang.Object obj16 = hashMap5.remove((java.lang.Object) entryArray15);
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap18.table;
        boolean boolean20 = hashMap18.isEmpty();
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray22 = null;
        hashMap21.table = entryArray22;
        java.lang.Object obj24 = hashMap18.remove((java.lang.Object) entryArray22);
        system.classfixer.classes.HashMap.Entry[] entryArray25 = hashMap18.table;
        java.lang.Object obj26 = hashMap4.put((java.lang.Object) entryArray15, (java.lang.Object) entryArray25);
        boolean boolean27 = hashMap4.isEmpty();
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap(10, (float) '#');
        system.classfixer.classes.HashMap.Entry[] entryArray31 = hashMap30.table;
        system.classfixer.classes.HashMap hashMap34 = new system.classfixer.classes.HashMap(0, (float) 10);
        java.lang.Object obj35 = hashMap30.get((java.lang.Object) 10);
        system.classfixer.classes.HashMap hashMap36 = new system.classfixer.classes.HashMap();
        java.lang.Object obj39 = hashMap36.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap40 = new system.classfixer.classes.HashMap();
        java.lang.Object obj42 = hashMap36.put((java.lang.Object) hashMap40, (java.lang.Object) 0.0f);
        boolean boolean43 = hashMap40.isEmpty();
        int int44 = hashMap40.modCount;
        int int45 = hashMap40.modCount;
        system.classfixer.classes.HashMap hashMap46 = new system.classfixer.classes.HashMap();
        boolean boolean47 = hashMap46.repOK();
        java.lang.Object obj49 = hashMap46.remove((java.lang.Object) (byte) 0);
        system.classfixer.classes.HashMap hashMap50 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap51 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray52 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap51.table = entryArray52;
        hashMap50.table = entryArray52;
        hashMap50.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray56 = hashMap50.table;
        java.lang.Object obj57 = hashMap46.remove((java.lang.Object) entryArray56);
        hashMap40.table = entryArray56;
        int int59 = hashMap40.modCount;
        java.lang.Object obj60 = hashMap30.get((java.lang.Object) hashMap40);
        java.lang.Object obj61 = hashMap4.remove((java.lang.Object) hashMap30);
        system.classfixer.classes.HashMap hashMap64 = new system.classfixer.classes.HashMap(100, (float) 10L);
        int int65 = hashMap64.size();
        system.classfixer.classes.HashMap hashMap66 = new system.classfixer.classes.HashMap();
        java.lang.Object obj69 = hashMap66.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap70 = new system.classfixer.classes.HashMap();
        java.lang.Object obj72 = hashMap66.put((java.lang.Object) hashMap70, (java.lang.Object) 0.0f);
        boolean boolean73 = hashMap70.isEmpty();
        int int74 = hashMap70.modCount;
        int int75 = hashMap70.modCount;
        system.classfixer.classes.HashMap hashMap76 = new system.classfixer.classes.HashMap();
        boolean boolean77 = hashMap76.repOK();
        java.lang.Object obj79 = hashMap76.remove((java.lang.Object) (byte) 0);
        system.classfixer.classes.HashMap hashMap80 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap81 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray82 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap81.table = entryArray82;
        hashMap80.table = entryArray82;
        hashMap80.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray86 = hashMap80.table;
        java.lang.Object obj87 = hashMap76.remove((java.lang.Object) entryArray86);
        hashMap70.table = entryArray86;
        hashMap64.table = entryArray86;
        hashMap64.modCount = (short) -1;
        java.lang.Object obj92 = hashMap2.put((java.lang.Object) hashMap30, (java.lang.Object) (short) -1);
        hashMap2.modCount = (byte) 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 100);
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap2.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        java.lang.Object obj8 = hashMap2.put((java.lang.Object) hashMap6, (java.lang.Object) 0.0f);
        int int9 = hashMap6.modCount;
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Object obj12 = hashMap1.put((java.lang.Object) hashMap6, (java.lang.Object) 'a');
        boolean boolean13 = hashMap1.isEmpty();
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = hashMap1.get(obj14);
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap1.table;
        hashMap1.modCount = 0;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        int int4 = hashMap0.modCount;
        int int5 = hashMap0.size();
        int int6 = hashMap0.modCount;
        java.lang.Object obj8 = hashMap0.get((java.lang.Object) 10);
        int int9 = hashMap0.size();
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) hashMap4, (java.lang.Object) 0.0f);
        boolean boolean7 = hashMap4.isEmpty();
        int int8 = hashMap4.modCount;
        int int9 = hashMap4.modCount;
        hashMap4.modCount = (byte) 0;
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap4.table;
        hashMap4.modCount = (byte) 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap4", hashMap4.repOK_2());
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap2.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap(10, (float) '#');
        java.lang.Object obj9 = hashMap2.remove((java.lang.Object) hashMap8);
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap8.table;
        hashMap1.table = entryArray10;
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap13.table;
        boolean boolean15 = hashMap13.isEmpty();
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray17 = null;
        hashMap16.table = entryArray17;
        java.lang.Object obj19 = hashMap13.remove((java.lang.Object) entryArray17);
        system.classfixer.classes.HashMap.Entry[] entryArray20 = hashMap13.table;
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap();
        java.lang.Object obj24 = hashMap21.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap.Entry entry25 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray26 = new system.classfixer.classes.HashMap.Entry[] { entry25 };
        hashMap21.table = entryArray26;
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap();
        java.lang.Object obj33 = hashMap30.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap.Entry[] entryArray34 = hashMap30.table;
        java.lang.Object obj35 = hashMap28.put((java.lang.Object) true, (java.lang.Object) hashMap30);
        system.classfixer.classes.HashMap.Entry[] entryArray36 = hashMap30.table;
        hashMap21.table = entryArray36;
        hashMap13.table = entryArray36;
        system.classfixer.classes.HashMap hashMap41 = new system.classfixer.classes.HashMap((int) ' ', 10.0f);
        system.classfixer.classes.HashMap hashMap43 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int44 = hashMap43.size();
        system.classfixer.classes.HashMap hashMap45 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray46 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap45.table = entryArray46;
        system.classfixer.classes.HashMap.Entry[] entryArray48 = hashMap45.table;
        java.lang.Class<?> wildcardClass49 = hashMap45.getClass();
        system.classfixer.classes.HashMap hashMap51 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray52 = hashMap51.table;
        java.lang.Object obj53 = hashMap43.put((java.lang.Object) hashMap45, (java.lang.Object) entryArray52);
        java.lang.Object obj54 = hashMap41.get((java.lang.Object) hashMap43);
        java.lang.Object obj55 = hashMap1.put((java.lang.Object) entryArray36, (java.lang.Object) hashMap43);
        hashMap1.modCount = (short) 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap2.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap2.table;
        java.lang.Object obj7 = hashMap0.put((java.lang.Object) true, (java.lang.Object) hashMap2);
        int int8 = hashMap2.modCount;
        boolean boolean9 = hashMap2.repOK();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        boolean boolean11 = hashMap10.repOK();
        java.lang.Object obj13 = hashMap10.remove((java.lang.Object) (byte) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap10.table;
        hashMap2.table = entryArray14;
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap();
        java.lang.Object obj4 = hashMap1.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap.Entry entry5 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray6 = new system.classfixer.classes.HashMap.Entry[] { entry5 };
        hashMap1.table = entryArray6;
        int int8 = hashMap1.modCount;
        boolean boolean9 = hashMap1.repOK();
        java.lang.Object obj10 = hashMap0.remove((java.lang.Object) boolean9);
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray1 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap0.table = entryArray1;
        int int3 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        boolean boolean5 = hashMap4.repOK();
        java.lang.Object obj7 = hashMap4.remove((java.lang.Object) (byte) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap4.table;
        hashMap0.table = entryArray8;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        java.lang.Object obj13 = hashMap10.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        java.lang.Object obj16 = hashMap10.put((java.lang.Object) hashMap14, (java.lang.Object) 0.0f);
        boolean boolean17 = hashMap14.isEmpty();
        int int18 = hashMap14.modCount;
        int int19 = hashMap14.modCount;
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray21 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap20.table = entryArray21;
        hashMap14.table = entryArray21;
        java.lang.Object obj24 = hashMap0.get((java.lang.Object) hashMap14);
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap();
        java.lang.Object obj30 = hashMap27.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap.Entry[] entryArray31 = hashMap27.table;
        java.lang.Object obj32 = hashMap25.put((java.lang.Object) true, (java.lang.Object) hashMap27);
        int int33 = hashMap27.modCount;
        boolean boolean34 = hashMap27.repOK();
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap();
        boolean boolean36 = hashMap35.repOK();
        java.lang.Object obj38 = hashMap35.remove((java.lang.Object) (byte) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray39 = hashMap35.table;
        hashMap27.table = entryArray39;
        hashMap0.table = entryArray39;
        system.classfixer.classes.HashMap hashMap43 = new system.classfixer.classes.HashMap((int) '4');
        boolean boolean44 = hashMap43.repOK();
        boolean boolean45 = hashMap43.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray46 = hashMap43.table;
        hashMap0.table = entryArray46;
        int int48 = hashMap0.modCount;
        hashMap0.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) ' ', 10.0f);
        boolean boolean3 = hashMap2.isEmpty();
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 10);
        hashMap1.modCount = (byte) 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        int int2 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray4 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap3.table = entryArray4;
        int int6 = hashMap3.size();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        boolean boolean8 = hashMap7.repOK();
        java.lang.Object obj10 = hashMap7.remove((java.lang.Object) (byte) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap7.table;
        hashMap3.table = entryArray11;
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        java.lang.Object obj16 = hashMap13.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap.Entry entry17 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray18 = new system.classfixer.classes.HashMap.Entry[] { entry17 };
        hashMap13.table = entryArray18;
        int int20 = hashMap13.size();
        java.lang.Object obj21 = hashMap3.remove((java.lang.Object) int20);
        java.lang.Object obj22 = hashMap0.remove((java.lang.Object) hashMap3);
        hashMap0.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj3 = hashMap0.remove((java.lang.Object) (byte) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray7 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap6.table = entryArray7;
        hashMap5.table = entryArray7;
        hashMap5.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap5.table;
        java.lang.Object obj12 = hashMap0.get((java.lang.Object) entryArray11);
        boolean boolean13 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        boolean boolean17 = hashMap16.repOK();
        java.lang.Object obj19 = hashMap16.remove((java.lang.Object) (byte) 0);
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray22 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap21.table = entryArray22;
        hashMap20.table = entryArray22;
        hashMap20.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray26 = hashMap20.table;
        java.lang.Object obj27 = hashMap16.remove((java.lang.Object) entryArray26);
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray30 = hashMap29.table;
        boolean boolean31 = hashMap29.isEmpty();
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray33 = null;
        hashMap32.table = entryArray33;
        java.lang.Object obj35 = hashMap29.remove((java.lang.Object) entryArray33);
        system.classfixer.classes.HashMap.Entry[] entryArray36 = hashMap29.table;
        java.lang.Object obj37 = hashMap15.put((java.lang.Object) entryArray26, (java.lang.Object) entryArray36);
        boolean boolean38 = hashMap15.repOK();
        system.classfixer.classes.HashMap hashMap40 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap42 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray43 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap42.table = entryArray43;
        system.classfixer.classes.HashMap.Entry[] entryArray45 = hashMap42.table;
        java.lang.Object obj46 = hashMap40.put((java.lang.Object) 0.0f, (java.lang.Object) hashMap42);
        java.lang.Object obj47 = hashMap0.put((java.lang.Object) hashMap15, obj46);
        hashMap15.modCount = (short) 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap15", hashMap15.repOK_2());
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj3 = hashMap0.remove((java.lang.Object) (byte) 0);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        boolean boolean5 = hashMap4.repOK();
        boolean boolean6 = hashMap4.isEmpty();
        java.lang.Object obj7 = hashMap0.get((java.lang.Object) boolean6);
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) (short) 100, (float) 100L);
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap12.table;
        java.lang.Object obj15 = hashMap9.put((java.lang.Object) entryArray13, (java.lang.Object) 1.0d);
        boolean boolean16 = hashMap9.isEmpty();
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap18.table;
        boolean boolean20 = hashMap18.isEmpty();
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray22 = null;
        hashMap21.table = entryArray22;
        java.lang.Object obj24 = hashMap18.remove((java.lang.Object) entryArray22);
        system.classfixer.classes.HashMap.Entry[] entryArray25 = hashMap18.table;
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap();
        java.lang.Object obj29 = hashMap26.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap.Entry entry30 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray31 = new system.classfixer.classes.HashMap.Entry[] { entry30 };
        hashMap26.table = entryArray31;
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap();
        java.lang.Object obj38 = hashMap35.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap.Entry[] entryArray39 = hashMap35.table;
        java.lang.Object obj40 = hashMap33.put((java.lang.Object) true, (java.lang.Object) hashMap35);
        system.classfixer.classes.HashMap.Entry[] entryArray41 = hashMap35.table;
        hashMap26.table = entryArray41;
        hashMap18.table = entryArray41;
        java.lang.Object obj44 = hashMap9.get((java.lang.Object) entryArray41);
        system.classfixer.classes.HashMap hashMap46 = new system.classfixer.classes.HashMap((int) (byte) 100);
        system.classfixer.classes.HashMap hashMap47 = new system.classfixer.classes.HashMap();
        boolean boolean48 = hashMap47.repOK();
        boolean boolean49 = hashMap47.isEmpty();
        int int50 = hashMap47.size();
        boolean boolean51 = hashMap47.isEmpty();
        java.lang.Object obj52 = hashMap46.get((java.lang.Object) hashMap47);
        int int53 = hashMap47.modCount;
        java.lang.Object obj54 = hashMap0.put((java.lang.Object) entryArray41, (java.lang.Object) int53);
        hashMap0.modCount = 0;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        int int2 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray4 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap3.table = entryArray4;
        int int6 = hashMap3.size();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        boolean boolean8 = hashMap7.repOK();
        java.lang.Object obj10 = hashMap7.remove((java.lang.Object) (byte) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap7.table;
        hashMap3.table = entryArray11;
        java.lang.Object obj13 = hashMap0.remove((java.lang.Object) entryArray11);
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap0.table;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean2 = hashMap1.isEmpty();
        boolean boolean3 = hashMap1.repOK();
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap2.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap2.table;
        java.lang.Object obj7 = hashMap0.put((java.lang.Object) true, (java.lang.Object) hashMap2);
        int int8 = hashMap2.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap2.table;
        int int10 = hashMap2.size();
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int2 = hashMap1.size();
        hashMap1.modCount = (short) 0;
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 100, (float) 100L);
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap2.table;
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap2.table;
        hashMap2.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj3 = hashMap0.remove((java.lang.Object) (byte) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray7 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap6.table = entryArray7;
        hashMap5.table = entryArray7;
        hashMap5.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap5.table;
        java.lang.Object obj12 = hashMap0.get((java.lang.Object) entryArray11);
        int int13 = hashMap0.modCount;
        boolean boolean14 = hashMap0.isEmpty();
        hashMap0.modCount = 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        java.lang.Object obj2 = null;
        java.lang.Object obj3 = hashMap1.remove(obj2);
        boolean boolean4 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        java.lang.Object obj8 = hashMap5.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        int int9 = hashMap5.modCount;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        java.lang.Object obj13 = hashMap10.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        java.lang.Object obj16 = hashMap10.put((java.lang.Object) hashMap14, (java.lang.Object) 0.0f);
        boolean boolean17 = hashMap14.isEmpty();
        int int18 = hashMap14.modCount;
        int int19 = hashMap14.modCount;
        boolean boolean20 = hashMap14.isEmpty();
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap(100, (float) 1);
        int int24 = hashMap23.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray25 = hashMap23.table;
        system.classfixer.classes.HashMap.Entry[] entryArray26 = hashMap23.table;
        java.lang.Object obj27 = hashMap5.put((java.lang.Object) hashMap14, (java.lang.Object) hashMap23);
        boolean boolean28 = hashMap23.repOK();
        java.lang.Object obj29 = hashMap1.remove((java.lang.Object) hashMap23);
        hashMap1.modCount = (short) 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj3 = hashMap0.remove((java.lang.Object) (byte) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap0.table;
        int int5 = hashMap0.modCount;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) ' ', (float) (short) 10);
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj3 = hashMap0.remove((java.lang.Object) (byte) 0);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj7 = hashMap4.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap.Entry entry8 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray9 = new system.classfixer.classes.HashMap.Entry[] { entry8 };
        hashMap4.table = entryArray9;
        java.lang.Object obj11 = hashMap0.remove((java.lang.Object) entryArray9);
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray4 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap3.table = entryArray4;
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap3.table;
        java.lang.Object obj7 = hashMap1.put((java.lang.Object) 0.0f, (java.lang.Object) hashMap3);
        hashMap3.clear();
        int int9 = hashMap3.modCount;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        boolean boolean11 = hashMap10.repOK();
        boolean boolean12 = hashMap10.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap10.table;
        hashMap3.table = entryArray13;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap3", hashMap3.repOK_2());
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap1.table;
        boolean boolean3 = hashMap1.isEmpty();
        boolean boolean4 = hashMap1.repOK();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap5.table = entryArray6;
        int int8 = hashMap5.size();
        java.lang.Object obj9 = hashMap1.remove((java.lang.Object) int8);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        java.lang.Object obj13 = hashMap10.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        java.lang.Object obj16 = hashMap10.put((java.lang.Object) hashMap14, (java.lang.Object) 0.0f);
        boolean boolean17 = hashMap14.isEmpty();
        int int18 = hashMap14.modCount;
        int int19 = hashMap14.size();
        boolean boolean20 = hashMap14.repOK();
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap(100, (float) 10L);
        int int24 = hashMap23.size();
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap();
        java.lang.Object obj28 = hashMap25.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap();
        java.lang.Object obj31 = hashMap25.put((java.lang.Object) hashMap29, (java.lang.Object) 0.0f);
        boolean boolean32 = hashMap29.isEmpty();
        int int33 = hashMap29.modCount;
        int int34 = hashMap29.modCount;
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap();
        boolean boolean36 = hashMap35.repOK();
        java.lang.Object obj38 = hashMap35.remove((java.lang.Object) (byte) 0);
        system.classfixer.classes.HashMap hashMap39 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap40 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray41 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap40.table = entryArray41;
        hashMap39.table = entryArray41;
        hashMap39.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray45 = hashMap39.table;
        java.lang.Object obj46 = hashMap35.remove((java.lang.Object) entryArray45);
        hashMap29.table = entryArray45;
        hashMap23.table = entryArray45;
        hashMap23.modCount = (short) -1;
        system.classfixer.classes.HashMap hashMap53 = new system.classfixer.classes.HashMap(100, (float) 1);
        int int54 = hashMap53.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray55 = hashMap53.table;
        boolean boolean56 = hashMap53.repOK();
        java.lang.Object obj57 = hashMap14.put((java.lang.Object) hashMap23, (java.lang.Object) hashMap53);
        boolean boolean58 = hashMap23.isEmpty();
        java.lang.Object obj59 = hashMap1.remove((java.lang.Object) boolean58);
        hashMap1.modCount = 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 100);
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap2.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        java.lang.Object obj8 = hashMap2.put((java.lang.Object) hashMap6, (java.lang.Object) 0.0f);
        int int9 = hashMap6.modCount;
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Object obj12 = hashMap1.put((java.lang.Object) hashMap6, (java.lang.Object) 'a');
        boolean boolean13 = hashMap1.isEmpty();
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = hashMap1.get(obj14);
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap1.table;
        int int17 = hashMap1.size();
        hashMap1.modCount = '4';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap.Entry entry4 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray5 = new system.classfixer.classes.HashMap.Entry[] { entry4 };
        hashMap0.table = entryArray5;
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        java.lang.Object obj12 = hashMap9.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap9.table;
        java.lang.Object obj14 = hashMap7.put((java.lang.Object) true, (java.lang.Object) hashMap9);
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap9.table;
        hashMap0.table = entryArray15;
        int int17 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        java.lang.Object obj21 = hashMap18.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        java.lang.Object obj24 = hashMap18.put((java.lang.Object) hashMap22, (java.lang.Object) 0.0f);
        boolean boolean25 = hashMap22.isEmpty();
        int int26 = hashMap22.modCount;
        int int27 = hashMap22.modCount;
        boolean boolean28 = hashMap22.isEmpty();
        int int29 = hashMap22.size();
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap();
        boolean boolean31 = hashMap30.repOK();
        java.lang.Object obj33 = hashMap30.remove((java.lang.Object) (byte) 0);
        system.classfixer.classes.HashMap hashMap34 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray36 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap35.table = entryArray36;
        hashMap34.table = entryArray36;
        hashMap34.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray40 = hashMap34.table;
        java.lang.Object obj41 = hashMap30.remove((java.lang.Object) entryArray40);
        int int42 = hashMap30.modCount;
        system.classfixer.classes.HashMap hashMap43 = new system.classfixer.classes.HashMap();
        java.lang.Object obj46 = hashMap43.put((java.lang.Object) 10.0d, (java.lang.Object) "");
        system.classfixer.classes.HashMap.Entry[] entryArray47 = hashMap43.table;
        hashMap30.table = entryArray47;
        hashMap22.table = entryArray47;
        hashMap0.table = entryArray47;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }
}

