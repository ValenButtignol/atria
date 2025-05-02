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
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        boolean boolean4 = hashMap0.isEmpty();
        boolean boolean5 = hashMap0.composedRepOK();
        hashMap0.modCount = 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap0", hashMap0.property_5());
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        hashMap0.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap0", hashMap0.property_5());
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        boolean boolean4 = hashMap0.isEmpty();
        system.testclass.HashMap.Entry[] entryArray5 = new system.testclass.HashMap.Entry[] {};
        hashMap0.table = entryArray5;
        hashMap0.modCount = '4';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap0", hashMap0.property_5());
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry7 = null;
        system.testclass.HashMap.Entry[] entryArray8 = new system.testclass.HashMap.Entry[] { entry7 };
        hashMap6.table = entryArray8;
        boolean boolean10 = hashMap6.isEmpty();
        boolean boolean11 = hashMap6.composedRepOK();
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap6);
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap0", hashMap0.property_5());
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) '4');
        hashMap1.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap1", hashMap1.property_5());
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) '4');
        boolean boolean2 = hashMap1.property_2();
        hashMap1.modCount = (short) 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap1", hashMap1.property_5());
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry7 = null;
        system.testclass.HashMap.Entry[] entryArray8 = new system.testclass.HashMap.Entry[] { entry7 };
        hashMap6.table = entryArray8;
        boolean boolean10 = hashMap6.isEmpty();
        boolean boolean11 = hashMap6.composedRepOK();
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray15 = hashMap14.table;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry17 = null;
        system.testclass.HashMap.Entry[] entryArray18 = new system.testclass.HashMap.Entry[] { entry17 };
        hashMap16.table = entryArray18;
        boolean boolean20 = hashMap16.isEmpty();
        java.lang.Object obj22 = hashMap14.put((java.lang.Object) boolean20, (java.lang.Object) false);
        java.lang.Object obj24 = hashMap14.get((java.lang.Object) 'a');
        java.lang.Object obj25 = hashMap6.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap14);
        hashMap14.modCount = 'a';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap14", hashMap14.property_5());
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (short) 1);
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap0", hashMap0.property_5());
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry7 = null;
        system.testclass.HashMap.Entry[] entryArray8 = new system.testclass.HashMap.Entry[] { entry7 };
        hashMap6.table = entryArray8;
        boolean boolean10 = hashMap6.isEmpty();
        boolean boolean11 = hashMap6.composedRepOK();
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray15 = hashMap14.table;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry17 = null;
        system.testclass.HashMap.Entry[] entryArray18 = new system.testclass.HashMap.Entry[] { entry17 };
        hashMap16.table = entryArray18;
        boolean boolean20 = hashMap16.isEmpty();
        java.lang.Object obj22 = hashMap14.put((java.lang.Object) boolean20, (java.lang.Object) false);
        java.lang.Object obj24 = hashMap14.get((java.lang.Object) 'a');
        java.lang.Object obj25 = hashMap6.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap14);
        int int26 = hashMap14.size();
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray28 = hashMap27.table;
        boolean boolean29 = hashMap27.composedRepOK();
        java.lang.Object obj30 = hashMap14.get((java.lang.Object) hashMap27);
        hashMap27.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap27", hashMap27.property_5());
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        boolean boolean4 = hashMap0.isEmpty();
        system.testclass.HashMap.Entry[] entryArray5 = new system.testclass.HashMap.Entry[] {};
        hashMap0.table = entryArray5;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap0", hashMap0.property_5());
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry7 = null;
        system.testclass.HashMap.Entry[] entryArray8 = new system.testclass.HashMap.Entry[] { entry7 };
        hashMap6.table = entryArray8;
        boolean boolean10 = hashMap6.isEmpty();
        boolean boolean11 = hashMap6.composedRepOK();
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray15 = hashMap14.table;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry17 = null;
        system.testclass.HashMap.Entry[] entryArray18 = new system.testclass.HashMap.Entry[] { entry17 };
        hashMap16.table = entryArray18;
        boolean boolean20 = hashMap16.isEmpty();
        java.lang.Object obj22 = hashMap14.put((java.lang.Object) boolean20, (java.lang.Object) false);
        java.lang.Object obj24 = hashMap14.get((java.lang.Object) 'a');
        java.lang.Object obj25 = hashMap6.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap14);
        int int26 = hashMap14.size();
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray28 = hashMap27.table;
        boolean boolean29 = hashMap27.composedRepOK();
        java.lang.Object obj30 = hashMap14.get((java.lang.Object) hashMap27);
        hashMap14.modCount = 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap14", hashMap14.property_5());
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry7 = null;
        system.testclass.HashMap.Entry[] entryArray8 = new system.testclass.HashMap.Entry[] { entry7 };
        hashMap6.table = entryArray8;
        boolean boolean10 = hashMap6.isEmpty();
        boolean boolean11 = hashMap6.composedRepOK();
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray15 = hashMap14.table;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry17 = null;
        system.testclass.HashMap.Entry[] entryArray18 = new system.testclass.HashMap.Entry[] { entry17 };
        hashMap16.table = entryArray18;
        boolean boolean20 = hashMap16.isEmpty();
        java.lang.Object obj22 = hashMap14.put((java.lang.Object) boolean20, (java.lang.Object) false);
        java.lang.Object obj24 = hashMap14.get((java.lang.Object) 'a');
        java.lang.Object obj25 = hashMap6.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap14);
        int int26 = hashMap14.modCount;
        system.testclass.HashMap.Entry[] entryArray27 = hashMap14.table;
        int int28 = hashMap14.size();
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry30 = null;
        system.testclass.HashMap.Entry[] entryArray31 = new system.testclass.HashMap.Entry[] { entry30 };
        hashMap29.table = entryArray31;
        java.lang.Object obj34 = hashMap29.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry36 = null;
        system.testclass.HashMap.Entry[] entryArray37 = new system.testclass.HashMap.Entry[] { entry36 };
        hashMap35.table = entryArray37;
        boolean boolean39 = hashMap35.isEmpty();
        boolean boolean40 = hashMap35.composedRepOK();
        java.lang.Object obj41 = hashMap29.remove((java.lang.Object) hashMap35);
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray44 = hashMap43.table;
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry46 = null;
        system.testclass.HashMap.Entry[] entryArray47 = new system.testclass.HashMap.Entry[] { entry46 };
        hashMap45.table = entryArray47;
        boolean boolean49 = hashMap45.isEmpty();
        java.lang.Object obj51 = hashMap43.put((java.lang.Object) boolean49, (java.lang.Object) false);
        java.lang.Object obj53 = hashMap43.get((java.lang.Object) 'a');
        java.lang.Object obj54 = hashMap35.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap43);
        int int55 = hashMap43.size();
        system.testclass.HashMap.Entry[] entryArray56 = hashMap43.table;
        hashMap14.table = entryArray56;
        hashMap14.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap14", hashMap14.property_5());
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap.Entry[] entryArray6 = hashMap0.table;
        boolean boolean7 = hashMap0.property_2();
        hashMap0.modCount = (byte) 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap0", hashMap0.property_5());
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (short) 1);
        boolean boolean6 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry8 = null;
        system.testclass.HashMap.Entry[] entryArray9 = new system.testclass.HashMap.Entry[] { entry8 };
        hashMap7.table = entryArray9;
        int int11 = hashMap7.modCount;
        java.lang.Object obj12 = hashMap0.get((java.lang.Object) int11);
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap0", hashMap0.property_5());
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry7 = null;
        system.testclass.HashMap.Entry[] entryArray8 = new system.testclass.HashMap.Entry[] { entry7 };
        hashMap6.table = entryArray8;
        boolean boolean10 = hashMap6.isEmpty();
        boolean boolean11 = hashMap6.composedRepOK();
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray15 = hashMap14.table;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry17 = null;
        system.testclass.HashMap.Entry[] entryArray18 = new system.testclass.HashMap.Entry[] { entry17 };
        hashMap16.table = entryArray18;
        boolean boolean20 = hashMap16.isEmpty();
        java.lang.Object obj22 = hashMap14.put((java.lang.Object) boolean20, (java.lang.Object) false);
        java.lang.Object obj24 = hashMap14.get((java.lang.Object) 'a');
        java.lang.Object obj25 = hashMap6.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap14);
        int int26 = hashMap14.size();
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray28 = hashMap27.table;
        boolean boolean29 = hashMap27.composedRepOK();
        java.lang.Object obj30 = hashMap14.get((java.lang.Object) hashMap27);
        int int31 = hashMap27.modCount;
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry33 = null;
        system.testclass.HashMap.Entry[] entryArray34 = new system.testclass.HashMap.Entry[] { entry33 };
        hashMap32.table = entryArray34;
        java.lang.Object obj37 = hashMap32.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap.Entry[] entryArray38 = hashMap32.table;
        hashMap27.table = entryArray38;
        hashMap27.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap27", hashMap27.property_5());
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(10);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry4 = null;
        system.testclass.HashMap.Entry[] entryArray5 = new system.testclass.HashMap.Entry[] { entry4 };
        hashMap3.table = entryArray5;
        java.lang.Object obj8 = hashMap3.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry10 = null;
        system.testclass.HashMap.Entry[] entryArray11 = new system.testclass.HashMap.Entry[] { entry10 };
        hashMap9.table = entryArray11;
        boolean boolean13 = hashMap9.isEmpty();
        boolean boolean14 = hashMap9.composedRepOK();
        java.lang.Object obj15 = hashMap3.remove((java.lang.Object) hashMap9);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray18 = hashMap17.table;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry20 = null;
        system.testclass.HashMap.Entry[] entryArray21 = new system.testclass.HashMap.Entry[] { entry20 };
        hashMap19.table = entryArray21;
        boolean boolean23 = hashMap19.isEmpty();
        java.lang.Object obj25 = hashMap17.put((java.lang.Object) boolean23, (java.lang.Object) false);
        java.lang.Object obj27 = hashMap17.get((java.lang.Object) 'a');
        java.lang.Object obj28 = hashMap9.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap17);
        int int29 = hashMap17.size();
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray31 = hashMap30.table;
        boolean boolean32 = hashMap30.composedRepOK();
        java.lang.Object obj33 = hashMap17.get((java.lang.Object) hashMap30);
        int int34 = hashMap30.modCount;
        java.lang.Object obj35 = hashMap1.put((java.lang.Object) "", (java.lang.Object) int34);
        boolean boolean36 = hashMap1.isEmpty();
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap1", hashMap1.property_5());
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry7 = null;
        system.testclass.HashMap.Entry[] entryArray8 = new system.testclass.HashMap.Entry[] { entry7 };
        hashMap6.table = entryArray8;
        boolean boolean10 = hashMap6.isEmpty();
        boolean boolean11 = hashMap6.composedRepOK();
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap6);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = hashMap0.put((java.lang.Object) "", obj14);
        hashMap0.modCount = (byte) 0;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap0", hashMap0.property_5());
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry5 = null;
        system.testclass.HashMap.Entry[] entryArray6 = new system.testclass.HashMap.Entry[] { entry5 };
        hashMap4.table = entryArray6;
        boolean boolean8 = hashMap4.isEmpty();
        java.lang.Class<?> wildcardClass9 = hashMap4.getClass();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry11 = null;
        system.testclass.HashMap.Entry[] entryArray12 = new system.testclass.HashMap.Entry[] { entry11 };
        hashMap10.table = entryArray12;
        java.lang.Object obj15 = hashMap10.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry17 = null;
        system.testclass.HashMap.Entry[] entryArray18 = new system.testclass.HashMap.Entry[] { entry17 };
        hashMap16.table = entryArray18;
        boolean boolean20 = hashMap16.isEmpty();
        boolean boolean21 = hashMap16.composedRepOK();
        java.lang.Object obj22 = hashMap10.remove((java.lang.Object) hashMap16);
        java.lang.Object obj23 = hashMap0.put((java.lang.Object) wildcardClass9, (java.lang.Object) hashMap10);
        system.testclass.HashMap.Entry[] entryArray24 = hashMap10.table;
        int int25 = hashMap10.modCount;
        hashMap10.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap10", hashMap10.property_5());
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) '4');
        boolean boolean2 = hashMap1.property_2();
        java.lang.Object obj4 = hashMap1.get((java.lang.Object) 1.0d);
        boolean boolean5 = hashMap1.property_2();
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap1", hashMap1.property_5());
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (short) 1);
        boolean boolean6 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry8 = null;
        system.testclass.HashMap.Entry[] entryArray9 = new system.testclass.HashMap.Entry[] { entry8 };
        hashMap7.table = entryArray9;
        int int11 = hashMap7.modCount;
        java.lang.Object obj12 = hashMap0.get((java.lang.Object) int11);
        boolean boolean13 = hashMap0.property_2();
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap0", hashMap0.property_5());
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) 'a');
        boolean boolean2 = hashMap1.composedRepOK();
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry4 = null;
        system.testclass.HashMap.Entry[] entryArray5 = new system.testclass.HashMap.Entry[] { entry4 };
        hashMap3.table = entryArray5;
        java.lang.Object obj8 = hashMap3.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry10 = null;
        system.testclass.HashMap.Entry[] entryArray11 = new system.testclass.HashMap.Entry[] { entry10 };
        hashMap9.table = entryArray11;
        boolean boolean13 = hashMap9.isEmpty();
        boolean boolean14 = hashMap9.composedRepOK();
        java.lang.Object obj15 = hashMap3.remove((java.lang.Object) hashMap9);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray18 = hashMap17.table;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry20 = null;
        system.testclass.HashMap.Entry[] entryArray21 = new system.testclass.HashMap.Entry[] { entry20 };
        hashMap19.table = entryArray21;
        boolean boolean23 = hashMap19.isEmpty();
        java.lang.Object obj25 = hashMap17.put((java.lang.Object) boolean23, (java.lang.Object) false);
        java.lang.Object obj27 = hashMap17.get((java.lang.Object) 'a');
        java.lang.Object obj28 = hashMap9.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap17);
        int int29 = hashMap17.size();
        system.testclass.HashMap.Entry[] entryArray30 = hashMap17.table;
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry32 = null;
        system.testclass.HashMap.Entry[] entryArray33 = new system.testclass.HashMap.Entry[] { entry32 };
        hashMap31.table = entryArray33;
        java.lang.Object obj36 = hashMap31.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry38 = null;
        system.testclass.HashMap.Entry[] entryArray39 = new system.testclass.HashMap.Entry[] { entry38 };
        hashMap37.table = entryArray39;
        boolean boolean41 = hashMap37.isEmpty();
        boolean boolean42 = hashMap37.composedRepOK();
        java.lang.Object obj43 = hashMap31.remove((java.lang.Object) hashMap37);
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray46 = hashMap45.table;
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry48 = null;
        system.testclass.HashMap.Entry[] entryArray49 = new system.testclass.HashMap.Entry[] { entry48 };
        hashMap47.table = entryArray49;
        boolean boolean51 = hashMap47.isEmpty();
        java.lang.Object obj53 = hashMap45.put((java.lang.Object) boolean51, (java.lang.Object) false);
        java.lang.Object obj55 = hashMap45.get((java.lang.Object) 'a');
        java.lang.Object obj56 = hashMap37.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap45);
        int int57 = hashMap45.modCount;
        system.testclass.HashMap.Entry[] entryArray58 = hashMap45.table;
        java.lang.Object obj59 = hashMap1.put((java.lang.Object) hashMap17, (java.lang.Object) hashMap45);
        system.testclass.HashMap hashMap60 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry61 = null;
        system.testclass.HashMap.Entry[] entryArray62 = new system.testclass.HashMap.Entry[] { entry61 };
        hashMap60.table = entryArray62;
        java.lang.Object obj65 = hashMap60.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap66 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry67 = null;
        system.testclass.HashMap.Entry[] entryArray68 = new system.testclass.HashMap.Entry[] { entry67 };
        hashMap66.table = entryArray68;
        boolean boolean70 = hashMap66.isEmpty();
        boolean boolean71 = hashMap66.composedRepOK();
        java.lang.Object obj72 = hashMap60.remove((java.lang.Object) hashMap66);
        system.testclass.HashMap hashMap74 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray75 = hashMap74.table;
        system.testclass.HashMap hashMap76 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry77 = null;
        system.testclass.HashMap.Entry[] entryArray78 = new system.testclass.HashMap.Entry[] { entry77 };
        hashMap76.table = entryArray78;
        boolean boolean80 = hashMap76.isEmpty();
        java.lang.Object obj82 = hashMap74.put((java.lang.Object) boolean80, (java.lang.Object) false);
        java.lang.Object obj84 = hashMap74.get((java.lang.Object) 'a');
        java.lang.Object obj85 = hashMap66.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap74);
        int int86 = hashMap74.size();
        system.testclass.HashMap hashMap87 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray88 = hashMap87.table;
        boolean boolean89 = hashMap87.composedRepOK();
        java.lang.Object obj90 = hashMap74.get((java.lang.Object) hashMap87);
        system.testclass.HashMap hashMap92 = new system.testclass.HashMap(10);
        java.lang.Object obj93 = hashMap17.put((java.lang.Object) hashMap87, (java.lang.Object) 10);
        hashMap17.modCount = 'a';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap17", hashMap17.property_5());
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry7 = null;
        system.testclass.HashMap.Entry[] entryArray8 = new system.testclass.HashMap.Entry[] { entry7 };
        hashMap6.table = entryArray8;
        boolean boolean10 = hashMap6.isEmpty();
        boolean boolean11 = hashMap6.composedRepOK();
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray15 = hashMap14.table;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry17 = null;
        system.testclass.HashMap.Entry[] entryArray18 = new system.testclass.HashMap.Entry[] { entry17 };
        hashMap16.table = entryArray18;
        boolean boolean20 = hashMap16.isEmpty();
        java.lang.Object obj22 = hashMap14.put((java.lang.Object) boolean20, (java.lang.Object) false);
        java.lang.Object obj24 = hashMap14.get((java.lang.Object) 'a');
        java.lang.Object obj25 = hashMap6.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap14);
        int int26 = hashMap14.size();
        system.testclass.HashMap.Entry[] entryArray27 = hashMap14.table;
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray29 = hashMap28.table;
        int int30 = hashMap28.size();
        boolean boolean31 = hashMap28.property_2();
        java.lang.Object obj32 = hashMap14.remove((java.lang.Object) hashMap28);
        hashMap28.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap28", hashMap28.property_5());
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap.Entry[] entryArray6 = hashMap0.table;
        int int7 = hashMap0.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry9 = null;
        system.testclass.HashMap.Entry[] entryArray10 = new system.testclass.HashMap.Entry[] { entry9 };
        hashMap8.table = entryArray10;
        java.lang.Object obj13 = hashMap8.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry15 = null;
        system.testclass.HashMap.Entry[] entryArray16 = new system.testclass.HashMap.Entry[] { entry15 };
        hashMap14.table = entryArray16;
        boolean boolean18 = hashMap14.isEmpty();
        boolean boolean19 = hashMap14.composedRepOK();
        java.lang.Object obj20 = hashMap8.remove((java.lang.Object) hashMap14);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray23 = hashMap22.table;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry25 = null;
        system.testclass.HashMap.Entry[] entryArray26 = new system.testclass.HashMap.Entry[] { entry25 };
        hashMap24.table = entryArray26;
        boolean boolean28 = hashMap24.isEmpty();
        java.lang.Object obj30 = hashMap22.put((java.lang.Object) boolean28, (java.lang.Object) false);
        java.lang.Object obj32 = hashMap22.get((java.lang.Object) 'a');
        java.lang.Object obj33 = hashMap14.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap22);
        int int34 = hashMap22.modCount;
        system.testclass.HashMap.Entry[] entryArray35 = hashMap22.table;
        java.lang.Object obj37 = hashMap22.get((java.lang.Object) 1.0f);
        int int38 = hashMap22.modCount;
        java.lang.Object obj39 = hashMap0.remove((java.lang.Object) int38);
        hashMap0.modCount = ' ';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap0", hashMap0.property_5());
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry7 = null;
        system.testclass.HashMap.Entry[] entryArray8 = new system.testclass.HashMap.Entry[] { entry7 };
        hashMap6.table = entryArray8;
        boolean boolean10 = hashMap6.isEmpty();
        boolean boolean11 = hashMap6.composedRepOK();
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap6);
        int int13 = hashMap0.modCount;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap0", hashMap0.property_5());
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray1 = hashMap0.table;
        int int2 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        boolean boolean4 = hashMap0.property_2();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry6 = null;
        system.testclass.HashMap.Entry[] entryArray7 = new system.testclass.HashMap.Entry[] { entry6 };
        hashMap5.table = entryArray7;
        java.lang.Object obj10 = hashMap5.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry12 = null;
        system.testclass.HashMap.Entry[] entryArray13 = new system.testclass.HashMap.Entry[] { entry12 };
        hashMap11.table = entryArray13;
        boolean boolean15 = hashMap11.isEmpty();
        boolean boolean16 = hashMap11.composedRepOK();
        java.lang.Object obj17 = hashMap5.remove((java.lang.Object) hashMap11);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray20 = hashMap19.table;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry22 = null;
        system.testclass.HashMap.Entry[] entryArray23 = new system.testclass.HashMap.Entry[] { entry22 };
        hashMap21.table = entryArray23;
        boolean boolean25 = hashMap21.isEmpty();
        java.lang.Object obj27 = hashMap19.put((java.lang.Object) boolean25, (java.lang.Object) false);
        java.lang.Object obj29 = hashMap19.get((java.lang.Object) 'a');
        java.lang.Object obj30 = hashMap11.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap19);
        int int31 = hashMap19.size();
        system.testclass.HashMap.Entry[] entryArray32 = hashMap19.table;
        system.testclass.HashMap.Entry[] entryArray33 = hashMap19.table;
        java.lang.Object obj34 = hashMap0.remove((java.lang.Object) hashMap19);
        hashMap0.modCount = '4';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap0", hashMap0.property_5());
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap();
        boolean boolean2 = hashMap1.isEmpty();
        boolean boolean3 = hashMap1.isEmpty();
        java.lang.Object obj4 = hashMap0.get((java.lang.Object) boolean3);
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap0", hashMap0.property_5());
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 100, (float) 1);
        hashMap2.modCount = 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap2", hashMap2.property_5());
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) '4');
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry3 = null;
        system.testclass.HashMap.Entry[] entryArray4 = new system.testclass.HashMap.Entry[] { entry3 };
        hashMap2.table = entryArray4;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry7 = null;
        system.testclass.HashMap.Entry[] entryArray8 = new system.testclass.HashMap.Entry[] { entry7 };
        hashMap6.table = entryArray8;
        boolean boolean10 = hashMap6.isEmpty();
        java.lang.Class<?> wildcardClass11 = hashMap6.getClass();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry13 = null;
        system.testclass.HashMap.Entry[] entryArray14 = new system.testclass.HashMap.Entry[] { entry13 };
        hashMap12.table = entryArray14;
        java.lang.Object obj17 = hashMap12.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry19 = null;
        system.testclass.HashMap.Entry[] entryArray20 = new system.testclass.HashMap.Entry[] { entry19 };
        hashMap18.table = entryArray20;
        boolean boolean22 = hashMap18.isEmpty();
        boolean boolean23 = hashMap18.composedRepOK();
        java.lang.Object obj24 = hashMap12.remove((java.lang.Object) hashMap18);
        java.lang.Object obj25 = hashMap2.put((java.lang.Object) wildcardClass11, (java.lang.Object) hashMap12);
        system.testclass.HashMap.Entry[] entryArray26 = hashMap12.table;
        hashMap1.table = entryArray26;
        int int28 = hashMap1.modCount;
        boolean boolean29 = hashMap1.property_2();
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap1", hashMap1.property_5());
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) '4');
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry3 = null;
        system.testclass.HashMap.Entry[] entryArray4 = new system.testclass.HashMap.Entry[] { entry3 };
        hashMap2.table = entryArray4;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry7 = null;
        system.testclass.HashMap.Entry[] entryArray8 = new system.testclass.HashMap.Entry[] { entry7 };
        hashMap6.table = entryArray8;
        boolean boolean10 = hashMap6.isEmpty();
        java.lang.Class<?> wildcardClass11 = hashMap6.getClass();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry13 = null;
        system.testclass.HashMap.Entry[] entryArray14 = new system.testclass.HashMap.Entry[] { entry13 };
        hashMap12.table = entryArray14;
        java.lang.Object obj17 = hashMap12.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry19 = null;
        system.testclass.HashMap.Entry[] entryArray20 = new system.testclass.HashMap.Entry[] { entry19 };
        hashMap18.table = entryArray20;
        boolean boolean22 = hashMap18.isEmpty();
        boolean boolean23 = hashMap18.composedRepOK();
        java.lang.Object obj24 = hashMap12.remove((java.lang.Object) hashMap18);
        java.lang.Object obj25 = hashMap2.put((java.lang.Object) wildcardClass11, (java.lang.Object) hashMap12);
        system.testclass.HashMap.Entry[] entryArray26 = hashMap12.table;
        hashMap1.table = entryArray26;
        int int28 = hashMap1.modCount;
        boolean boolean29 = hashMap1.property_2();
        hashMap1.modCount = '#';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap1", hashMap1.property_5());
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 1);
        hashMap1.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap1", hashMap1.property_5());
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry5 = null;
        system.testclass.HashMap.Entry[] entryArray6 = new system.testclass.HashMap.Entry[] { entry5 };
        hashMap4.table = entryArray6;
        boolean boolean8 = hashMap4.isEmpty();
        java.lang.Class<?> wildcardClass9 = hashMap4.getClass();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry11 = null;
        system.testclass.HashMap.Entry[] entryArray12 = new system.testclass.HashMap.Entry[] { entry11 };
        hashMap10.table = entryArray12;
        java.lang.Object obj15 = hashMap10.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry17 = null;
        system.testclass.HashMap.Entry[] entryArray18 = new system.testclass.HashMap.Entry[] { entry17 };
        hashMap16.table = entryArray18;
        boolean boolean20 = hashMap16.isEmpty();
        boolean boolean21 = hashMap16.composedRepOK();
        java.lang.Object obj22 = hashMap10.remove((java.lang.Object) hashMap16);
        java.lang.Object obj23 = hashMap0.put((java.lang.Object) wildcardClass9, (java.lang.Object) hashMap10);
        system.testclass.HashMap.Entry[] entryArray24 = hashMap10.table;
        int int25 = hashMap10.modCount;
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry27 = null;
        system.testclass.HashMap.Entry[] entryArray28 = new system.testclass.HashMap.Entry[] { entry27 };
        hashMap26.table = entryArray28;
        java.lang.Object obj30 = hashMap10.get((java.lang.Object) hashMap26);
        hashMap26.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap26", hashMap26.property_5());
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry7 = null;
        system.testclass.HashMap.Entry[] entryArray8 = new system.testclass.HashMap.Entry[] { entry7 };
        hashMap6.table = entryArray8;
        boolean boolean10 = hashMap6.isEmpty();
        boolean boolean11 = hashMap6.composedRepOK();
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray15 = hashMap14.table;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry17 = null;
        system.testclass.HashMap.Entry[] entryArray18 = new system.testclass.HashMap.Entry[] { entry17 };
        hashMap16.table = entryArray18;
        boolean boolean20 = hashMap16.isEmpty();
        java.lang.Object obj22 = hashMap14.put((java.lang.Object) boolean20, (java.lang.Object) false);
        java.lang.Object obj24 = hashMap14.get((java.lang.Object) 'a');
        java.lang.Object obj25 = hashMap6.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap14);
        int int26 = hashMap14.size();
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray28 = hashMap27.table;
        boolean boolean29 = hashMap27.composedRepOK();
        java.lang.Object obj30 = hashMap14.get((java.lang.Object) hashMap27);
        int int31 = hashMap27.modCount;
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry34 = null;
        system.testclass.HashMap.Entry[] entryArray35 = new system.testclass.HashMap.Entry[] { entry34 };
        hashMap33.table = entryArray35;
        boolean boolean37 = hashMap33.isEmpty();
        system.testclass.HashMap.Entry[] entryArray38 = new system.testclass.HashMap.Entry[] {};
        hashMap33.table = entryArray38;
        hashMap33.modCount = 0;
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry43 = null;
        system.testclass.HashMap.Entry[] entryArray44 = new system.testclass.HashMap.Entry[] { entry43 };
        hashMap42.table = entryArray44;
        java.lang.Object obj47 = hashMap42.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry49 = null;
        system.testclass.HashMap.Entry[] entryArray50 = new system.testclass.HashMap.Entry[] { entry49 };
        hashMap48.table = entryArray50;
        boolean boolean52 = hashMap48.isEmpty();
        boolean boolean53 = hashMap48.composedRepOK();
        java.lang.Object obj54 = hashMap42.remove((java.lang.Object) hashMap48);
        system.testclass.HashMap hashMap56 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray57 = hashMap56.table;
        system.testclass.HashMap hashMap58 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry59 = null;
        system.testclass.HashMap.Entry[] entryArray60 = new system.testclass.HashMap.Entry[] { entry59 };
        hashMap58.table = entryArray60;
        boolean boolean62 = hashMap58.isEmpty();
        java.lang.Object obj64 = hashMap56.put((java.lang.Object) boolean62, (java.lang.Object) false);
        java.lang.Object obj66 = hashMap56.get((java.lang.Object) 'a');
        java.lang.Object obj67 = hashMap48.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap56);
        int int68 = hashMap56.size();
        system.testclass.HashMap.Entry[] entryArray69 = hashMap56.table;
        system.testclass.HashMap.Entry[] entryArray70 = hashMap56.table;
        hashMap33.table = entryArray70;
        int int72 = hashMap33.modCount;
        java.lang.Object obj73 = hashMap27.put((java.lang.Object) 1, (java.lang.Object) int72);
        hashMap27.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap27", hashMap27.property_5());
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry7 = null;
        system.testclass.HashMap.Entry[] entryArray8 = new system.testclass.HashMap.Entry[] { entry7 };
        hashMap6.table = entryArray8;
        boolean boolean10 = hashMap6.isEmpty();
        boolean boolean11 = hashMap6.composedRepOK();
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap6);
        int int13 = hashMap0.size();
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap0", hashMap0.property_5());
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry7 = null;
        system.testclass.HashMap.Entry[] entryArray8 = new system.testclass.HashMap.Entry[] { entry7 };
        hashMap6.table = entryArray8;
        boolean boolean10 = hashMap6.isEmpty();
        boolean boolean11 = hashMap6.composedRepOK();
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray15 = hashMap14.table;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry17 = null;
        system.testclass.HashMap.Entry[] entryArray18 = new system.testclass.HashMap.Entry[] { entry17 };
        hashMap16.table = entryArray18;
        boolean boolean20 = hashMap16.isEmpty();
        java.lang.Object obj22 = hashMap14.put((java.lang.Object) boolean20, (java.lang.Object) false);
        java.lang.Object obj24 = hashMap14.get((java.lang.Object) 'a');
        java.lang.Object obj25 = hashMap6.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap14);
        java.lang.Object obj26 = null;
        java.lang.Object obj27 = hashMap14.get(obj26);
        boolean boolean28 = hashMap14.isEmpty();
        hashMap14.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap14", hashMap14.property_5());
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 100);
        hashMap1.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap1", hashMap1.property_5());
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) '4');
        boolean boolean2 = hashMap1.property_2();
        java.lang.Object obj4 = hashMap1.get((java.lang.Object) 1.0d);
        hashMap1.modCount = 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap1", hashMap1.property_5());
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray1 = hashMap0.table;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry4 = null;
        system.testclass.HashMap.Entry[] entryArray5 = new system.testclass.HashMap.Entry[] { entry4 };
        hashMap3.table = entryArray5;
        java.lang.Object obj8 = hashMap3.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry10 = null;
        system.testclass.HashMap.Entry[] entryArray11 = new system.testclass.HashMap.Entry[] { entry10 };
        hashMap9.table = entryArray11;
        boolean boolean13 = hashMap9.isEmpty();
        boolean boolean14 = hashMap9.composedRepOK();
        java.lang.Object obj15 = hashMap3.remove((java.lang.Object) hashMap9);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray18 = hashMap17.table;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry20 = null;
        system.testclass.HashMap.Entry[] entryArray21 = new system.testclass.HashMap.Entry[] { entry20 };
        hashMap19.table = entryArray21;
        boolean boolean23 = hashMap19.isEmpty();
        java.lang.Object obj25 = hashMap17.put((java.lang.Object) boolean23, (java.lang.Object) false);
        java.lang.Object obj27 = hashMap17.get((java.lang.Object) 'a');
        java.lang.Object obj28 = hashMap9.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap17);
        int int29 = hashMap17.size();
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray31 = hashMap30.table;
        boolean boolean32 = hashMap30.composedRepOK();
        java.lang.Object obj33 = hashMap17.get((java.lang.Object) hashMap30);
        int int34 = hashMap30.modCount;
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry36 = null;
        system.testclass.HashMap.Entry[] entryArray37 = new system.testclass.HashMap.Entry[] { entry36 };
        hashMap35.table = entryArray37;
        java.lang.Object obj40 = hashMap35.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap.Entry[] entryArray41 = hashMap35.table;
        hashMap30.table = entryArray41;
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry44 = null;
        system.testclass.HashMap.Entry[] entryArray45 = new system.testclass.HashMap.Entry[] { entry44 };
        hashMap43.table = entryArray45;
        java.lang.Object obj48 = hashMap43.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap49 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry50 = null;
        system.testclass.HashMap.Entry[] entryArray51 = new system.testclass.HashMap.Entry[] { entry50 };
        hashMap49.table = entryArray51;
        boolean boolean53 = hashMap49.isEmpty();
        boolean boolean54 = hashMap49.composedRepOK();
        java.lang.Object obj55 = hashMap43.remove((java.lang.Object) hashMap49);
        system.testclass.HashMap hashMap57 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray58 = hashMap57.table;
        system.testclass.HashMap hashMap59 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry60 = null;
        system.testclass.HashMap.Entry[] entryArray61 = new system.testclass.HashMap.Entry[] { entry60 };
        hashMap59.table = entryArray61;
        boolean boolean63 = hashMap59.isEmpty();
        java.lang.Object obj65 = hashMap57.put((java.lang.Object) boolean63, (java.lang.Object) false);
        java.lang.Object obj67 = hashMap57.get((java.lang.Object) 'a');
        java.lang.Object obj68 = hashMap49.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap57);
        int int69 = hashMap57.size();
        system.testclass.HashMap.Entry[] entryArray70 = hashMap57.table;
        system.testclass.HashMap hashMap71 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry72 = null;
        system.testclass.HashMap.Entry[] entryArray73 = new system.testclass.HashMap.Entry[] { entry72 };
        hashMap71.table = entryArray73;
        boolean boolean75 = hashMap71.isEmpty();
        system.testclass.HashMap.Entry[] entryArray76 = hashMap71.table;
        java.lang.Object obj77 = hashMap30.put((java.lang.Object) entryArray70, (java.lang.Object) entryArray76);
        java.lang.Object obj78 = hashMap0.remove((java.lang.Object) hashMap30);
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap0", hashMap0.property_5());
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry5 = null;
        system.testclass.HashMap.Entry[] entryArray6 = new system.testclass.HashMap.Entry[] { entry5 };
        hashMap4.table = entryArray6;
        boolean boolean8 = hashMap4.isEmpty();
        java.lang.Class<?> wildcardClass9 = hashMap4.getClass();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry11 = null;
        system.testclass.HashMap.Entry[] entryArray12 = new system.testclass.HashMap.Entry[] { entry11 };
        hashMap10.table = entryArray12;
        java.lang.Object obj15 = hashMap10.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry17 = null;
        system.testclass.HashMap.Entry[] entryArray18 = new system.testclass.HashMap.Entry[] { entry17 };
        hashMap16.table = entryArray18;
        boolean boolean20 = hashMap16.isEmpty();
        boolean boolean21 = hashMap16.composedRepOK();
        java.lang.Object obj22 = hashMap10.remove((java.lang.Object) hashMap16);
        java.lang.Object obj23 = hashMap0.put((java.lang.Object) wildcardClass9, (java.lang.Object) hashMap10);
        hashMap10.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap10", hashMap10.property_5());
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray1 = hashMap0.table;
        boolean boolean2 = hashMap0.composedRepOK();
        boolean boolean3 = hashMap0.composedRepOK();
        hashMap0.modCount = ' ';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap0", hashMap0.property_5());
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray1 = hashMap0.table;
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry3 = null;
        system.testclass.HashMap.Entry[] entryArray4 = new system.testclass.HashMap.Entry[] { entry3 };
        hashMap2.table = entryArray4;
        boolean boolean6 = hashMap2.isEmpty();
        java.lang.Object obj8 = hashMap0.put((java.lang.Object) boolean6, (java.lang.Object) false);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray10 = hashMap9.table;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry12 = null;
        system.testclass.HashMap.Entry[] entryArray13 = new system.testclass.HashMap.Entry[] { entry12 };
        hashMap11.table = entryArray13;
        boolean boolean15 = hashMap11.isEmpty();
        java.lang.Object obj17 = hashMap9.put((java.lang.Object) boolean15, (java.lang.Object) false);
        java.lang.Object obj19 = hashMap9.get((java.lang.Object) 'a');
        int int20 = hashMap9.size();
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry22 = null;
        system.testclass.HashMap.Entry[] entryArray23 = new system.testclass.HashMap.Entry[] { entry22 };
        hashMap21.table = entryArray23;
        java.lang.Object obj26 = hashMap21.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry28 = null;
        system.testclass.HashMap.Entry[] entryArray29 = new system.testclass.HashMap.Entry[] { entry28 };
        hashMap27.table = entryArray29;
        boolean boolean31 = hashMap27.isEmpty();
        boolean boolean32 = hashMap27.composedRepOK();
        java.lang.Object obj33 = hashMap21.remove((java.lang.Object) hashMap27);
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray36 = hashMap35.table;
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry38 = null;
        system.testclass.HashMap.Entry[] entryArray39 = new system.testclass.HashMap.Entry[] { entry38 };
        hashMap37.table = entryArray39;
        boolean boolean41 = hashMap37.isEmpty();
        java.lang.Object obj43 = hashMap35.put((java.lang.Object) boolean41, (java.lang.Object) false);
        java.lang.Object obj45 = hashMap35.get((java.lang.Object) 'a');
        java.lang.Object obj46 = hashMap27.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap35);
        int int47 = hashMap35.size();
        system.testclass.HashMap.Entry[] entryArray48 = hashMap35.table;
        hashMap9.table = entryArray48;
        hashMap0.table = entryArray48;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap0", hashMap0.property_5());
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray1 = hashMap0.table;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry5 = null;
        system.testclass.HashMap.Entry[] entryArray6 = new system.testclass.HashMap.Entry[] { entry5 };
        hashMap4.table = entryArray6;
        java.lang.Object obj9 = hashMap4.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry11 = null;
        system.testclass.HashMap.Entry[] entryArray12 = new system.testclass.HashMap.Entry[] { entry11 };
        hashMap10.table = entryArray12;
        boolean boolean14 = hashMap10.isEmpty();
        boolean boolean15 = hashMap10.composedRepOK();
        java.lang.Object obj16 = hashMap4.remove((java.lang.Object) hashMap10);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray19 = hashMap18.table;
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry21 = null;
        system.testclass.HashMap.Entry[] entryArray22 = new system.testclass.HashMap.Entry[] { entry21 };
        hashMap20.table = entryArray22;
        boolean boolean24 = hashMap20.isEmpty();
        java.lang.Object obj26 = hashMap18.put((java.lang.Object) boolean24, (java.lang.Object) false);
        java.lang.Object obj28 = hashMap18.get((java.lang.Object) 'a');
        java.lang.Object obj29 = hashMap10.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap18);
        int int30 = hashMap18.modCount;
        system.testclass.HashMap.Entry[] entryArray31 = hashMap18.table;
        java.lang.Object obj32 = hashMap0.put((java.lang.Object) ' ', (java.lang.Object) hashMap18);
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        boolean boolean34 = hashMap33.isEmpty();
        boolean boolean35 = hashMap33.isEmpty();
        java.lang.Object obj36 = hashMap18.get((java.lang.Object) boolean35);
        boolean boolean37 = hashMap18.property_2();
        int int38 = hashMap18.modCount;
        hashMap18.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap18", hashMap18.property_5());
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry5 = null;
        system.testclass.HashMap.Entry[] entryArray6 = new system.testclass.HashMap.Entry[] { entry5 };
        hashMap4.table = entryArray6;
        boolean boolean8 = hashMap4.isEmpty();
        java.lang.Class<?> wildcardClass9 = hashMap4.getClass();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry11 = null;
        system.testclass.HashMap.Entry[] entryArray12 = new system.testclass.HashMap.Entry[] { entry11 };
        hashMap10.table = entryArray12;
        java.lang.Object obj15 = hashMap10.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry17 = null;
        system.testclass.HashMap.Entry[] entryArray18 = new system.testclass.HashMap.Entry[] { entry17 };
        hashMap16.table = entryArray18;
        boolean boolean20 = hashMap16.isEmpty();
        boolean boolean21 = hashMap16.composedRepOK();
        java.lang.Object obj22 = hashMap10.remove((java.lang.Object) hashMap16);
        java.lang.Object obj23 = hashMap0.put((java.lang.Object) wildcardClass9, (java.lang.Object) hashMap10);
        system.testclass.HashMap.Entry[] entryArray24 = hashMap10.table;
        int int25 = hashMap10.modCount;
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry27 = null;
        system.testclass.HashMap.Entry[] entryArray28 = new system.testclass.HashMap.Entry[] { entry27 };
        hashMap26.table = entryArray28;
        java.lang.Object obj30 = hashMap10.get((java.lang.Object) hashMap26);
        java.lang.Object obj32 = null;
        java.lang.Object obj33 = hashMap26.put((java.lang.Object) 0, obj32);
        int int34 = hashMap26.size();
        hashMap26.modCount = (byte) 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap26", hashMap26.property_5());
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 0, 10.0f);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray4 = hashMap3.table;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry6 = null;
        system.testclass.HashMap.Entry[] entryArray7 = new system.testclass.HashMap.Entry[] { entry6 };
        hashMap5.table = entryArray7;
        boolean boolean9 = hashMap5.isEmpty();
        java.lang.Object obj11 = hashMap3.put((java.lang.Object) boolean9, (java.lang.Object) false);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray13 = hashMap12.table;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry15 = null;
        system.testclass.HashMap.Entry[] entryArray16 = new system.testclass.HashMap.Entry[] { entry15 };
        hashMap14.table = entryArray16;
        boolean boolean18 = hashMap14.isEmpty();
        java.lang.Object obj20 = hashMap12.put((java.lang.Object) boolean18, (java.lang.Object) false);
        java.lang.Object obj22 = hashMap12.get((java.lang.Object) 'a');
        int int23 = hashMap12.size();
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry25 = null;
        system.testclass.HashMap.Entry[] entryArray26 = new system.testclass.HashMap.Entry[] { entry25 };
        hashMap24.table = entryArray26;
        java.lang.Object obj29 = hashMap24.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry31 = null;
        system.testclass.HashMap.Entry[] entryArray32 = new system.testclass.HashMap.Entry[] { entry31 };
        hashMap30.table = entryArray32;
        boolean boolean34 = hashMap30.isEmpty();
        boolean boolean35 = hashMap30.composedRepOK();
        java.lang.Object obj36 = hashMap24.remove((java.lang.Object) hashMap30);
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray39 = hashMap38.table;
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry41 = null;
        system.testclass.HashMap.Entry[] entryArray42 = new system.testclass.HashMap.Entry[] { entry41 };
        hashMap40.table = entryArray42;
        boolean boolean44 = hashMap40.isEmpty();
        java.lang.Object obj46 = hashMap38.put((java.lang.Object) boolean44, (java.lang.Object) false);
        java.lang.Object obj48 = hashMap38.get((java.lang.Object) 'a');
        java.lang.Object obj49 = hashMap30.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap38);
        int int50 = hashMap38.size();
        system.testclass.HashMap.Entry[] entryArray51 = hashMap38.table;
        hashMap12.table = entryArray51;
        hashMap3.table = entryArray51;
        java.lang.Object obj54 = hashMap2.remove((java.lang.Object) hashMap3);
        hashMap3.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap3", hashMap3.property_5());
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry7 = null;
        system.testclass.HashMap.Entry[] entryArray8 = new system.testclass.HashMap.Entry[] { entry7 };
        hashMap6.table = entryArray8;
        boolean boolean10 = hashMap6.isEmpty();
        boolean boolean11 = hashMap6.composedRepOK();
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray15 = hashMap14.table;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry17 = null;
        system.testclass.HashMap.Entry[] entryArray18 = new system.testclass.HashMap.Entry[] { entry17 };
        hashMap16.table = entryArray18;
        boolean boolean20 = hashMap16.isEmpty();
        java.lang.Object obj22 = hashMap14.put((java.lang.Object) boolean20, (java.lang.Object) false);
        java.lang.Object obj24 = hashMap14.get((java.lang.Object) 'a');
        java.lang.Object obj25 = hashMap6.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap14);
        int int26 = hashMap14.size();
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray28 = hashMap27.table;
        boolean boolean29 = hashMap27.composedRepOK();
        java.lang.Object obj30 = hashMap14.get((java.lang.Object) hashMap27);
        int int31 = hashMap27.modCount;
        hashMap27.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap27", hashMap27.property_5());
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (short) 1);
        hashMap0.modCount = 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap0", hashMap0.property_5());
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry7 = null;
        system.testclass.HashMap.Entry[] entryArray8 = new system.testclass.HashMap.Entry[] { entry7 };
        hashMap6.table = entryArray8;
        boolean boolean10 = hashMap6.isEmpty();
        boolean boolean11 = hashMap6.composedRepOK();
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray15 = hashMap14.table;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry17 = null;
        system.testclass.HashMap.Entry[] entryArray18 = new system.testclass.HashMap.Entry[] { entry17 };
        hashMap16.table = entryArray18;
        boolean boolean20 = hashMap16.isEmpty();
        java.lang.Object obj22 = hashMap14.put((java.lang.Object) boolean20, (java.lang.Object) false);
        java.lang.Object obj24 = hashMap14.get((java.lang.Object) 'a');
        java.lang.Object obj25 = hashMap6.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap14);
        int int26 = hashMap14.modCount;
        system.testclass.HashMap.Entry[] entryArray27 = hashMap14.table;
        java.lang.Object obj29 = hashMap14.get((java.lang.Object) 1.0f);
        java.lang.Object obj31 = hashMap14.get((java.lang.Object) "hi!");
        int int32 = hashMap14.modCount;
        java.lang.Object obj33 = null;
        java.lang.Object obj35 = hashMap14.put(obj33, (java.lang.Object) 1L);
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap(100);
        java.lang.Object obj38 = hashMap14.remove((java.lang.Object) 100);
        boolean boolean39 = hashMap14.composedRepOK();
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray41 = hashMap40.table;
        int int42 = hashMap40.modCount;
        system.testclass.HashMap.Entry[] entryArray43 = hashMap40.table;
        hashMap14.table = entryArray43;
        hashMap14.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap14", hashMap14.property_5());
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry7 = null;
        system.testclass.HashMap.Entry[] entryArray8 = new system.testclass.HashMap.Entry[] { entry7 };
        hashMap6.table = entryArray8;
        boolean boolean10 = hashMap6.isEmpty();
        boolean boolean11 = hashMap6.composedRepOK();
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray15 = hashMap14.table;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry17 = null;
        system.testclass.HashMap.Entry[] entryArray18 = new system.testclass.HashMap.Entry[] { entry17 };
        hashMap16.table = entryArray18;
        boolean boolean20 = hashMap16.isEmpty();
        java.lang.Object obj22 = hashMap14.put((java.lang.Object) boolean20, (java.lang.Object) false);
        java.lang.Object obj24 = hashMap14.get((java.lang.Object) 'a');
        java.lang.Object obj25 = hashMap6.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap14);
        int int26 = hashMap14.modCount;
        system.testclass.HashMap.Entry[] entryArray27 = hashMap14.table;
        int int28 = hashMap14.size();
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry30 = null;
        system.testclass.HashMap.Entry[] entryArray31 = new system.testclass.HashMap.Entry[] { entry30 };
        hashMap29.table = entryArray31;
        java.lang.Object obj34 = hashMap29.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry36 = null;
        system.testclass.HashMap.Entry[] entryArray37 = new system.testclass.HashMap.Entry[] { entry36 };
        hashMap35.table = entryArray37;
        boolean boolean39 = hashMap35.isEmpty();
        boolean boolean40 = hashMap35.composedRepOK();
        java.lang.Object obj41 = hashMap29.remove((java.lang.Object) hashMap35);
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray44 = hashMap43.table;
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry46 = null;
        system.testclass.HashMap.Entry[] entryArray47 = new system.testclass.HashMap.Entry[] { entry46 };
        hashMap45.table = entryArray47;
        boolean boolean49 = hashMap45.isEmpty();
        java.lang.Object obj51 = hashMap43.put((java.lang.Object) boolean49, (java.lang.Object) false);
        java.lang.Object obj53 = hashMap43.get((java.lang.Object) 'a');
        java.lang.Object obj54 = hashMap35.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap43);
        int int55 = hashMap43.size();
        system.testclass.HashMap.Entry[] entryArray56 = hashMap43.table;
        hashMap14.table = entryArray56;
        hashMap14.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap14", hashMap14.property_5());
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.property_2();
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap0", hashMap0.property_5());
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry7 = null;
        system.testclass.HashMap.Entry[] entryArray8 = new system.testclass.HashMap.Entry[] { entry7 };
        hashMap6.table = entryArray8;
        boolean boolean10 = hashMap6.isEmpty();
        boolean boolean11 = hashMap6.composedRepOK();
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray15 = hashMap14.table;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry17 = null;
        system.testclass.HashMap.Entry[] entryArray18 = new system.testclass.HashMap.Entry[] { entry17 };
        hashMap16.table = entryArray18;
        boolean boolean20 = hashMap16.isEmpty();
        java.lang.Object obj22 = hashMap14.put((java.lang.Object) boolean20, (java.lang.Object) false);
        java.lang.Object obj24 = hashMap14.get((java.lang.Object) 'a');
        java.lang.Object obj25 = hashMap6.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap14);
        int int26 = hashMap14.size();
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray28 = hashMap27.table;
        boolean boolean29 = hashMap27.composedRepOK();
        java.lang.Object obj30 = hashMap14.get((java.lang.Object) hashMap27);
        hashMap14.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap14", hashMap14.property_5());
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry7 = null;
        system.testclass.HashMap.Entry[] entryArray8 = new system.testclass.HashMap.Entry[] { entry7 };
        hashMap6.table = entryArray8;
        boolean boolean10 = hashMap6.isEmpty();
        boolean boolean11 = hashMap6.composedRepOK();
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray15 = hashMap14.table;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry17 = null;
        system.testclass.HashMap.Entry[] entryArray18 = new system.testclass.HashMap.Entry[] { entry17 };
        hashMap16.table = entryArray18;
        boolean boolean20 = hashMap16.isEmpty();
        java.lang.Object obj22 = hashMap14.put((java.lang.Object) boolean20, (java.lang.Object) false);
        java.lang.Object obj24 = hashMap14.get((java.lang.Object) 'a');
        java.lang.Object obj25 = hashMap6.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap14);
        int int26 = hashMap14.size();
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray28 = hashMap27.table;
        boolean boolean29 = hashMap27.composedRepOK();
        java.lang.Object obj30 = hashMap14.get((java.lang.Object) hashMap27);
        int int31 = hashMap27.modCount;
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry33 = null;
        system.testclass.HashMap.Entry[] entryArray34 = new system.testclass.HashMap.Entry[] { entry33 };
        hashMap32.table = entryArray34;
        java.lang.Object obj37 = hashMap32.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap.Entry[] entryArray38 = hashMap32.table;
        hashMap27.table = entryArray38;
        boolean boolean40 = hashMap27.property_2();
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry42 = null;
        system.testclass.HashMap.Entry[] entryArray43 = new system.testclass.HashMap.Entry[] { entry42 };
        hashMap41.table = entryArray43;
        java.lang.Object obj46 = hashMap41.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry48 = null;
        system.testclass.HashMap.Entry[] entryArray49 = new system.testclass.HashMap.Entry[] { entry48 };
        hashMap47.table = entryArray49;
        boolean boolean51 = hashMap47.isEmpty();
        boolean boolean52 = hashMap47.composedRepOK();
        java.lang.Object obj53 = hashMap41.remove((java.lang.Object) hashMap47);
        system.testclass.HashMap hashMap55 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray56 = hashMap55.table;
        system.testclass.HashMap hashMap57 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry58 = null;
        system.testclass.HashMap.Entry[] entryArray59 = new system.testclass.HashMap.Entry[] { entry58 };
        hashMap57.table = entryArray59;
        boolean boolean61 = hashMap57.isEmpty();
        java.lang.Object obj63 = hashMap55.put((java.lang.Object) boolean61, (java.lang.Object) false);
        java.lang.Object obj65 = hashMap55.get((java.lang.Object) 'a');
        java.lang.Object obj66 = hashMap47.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap55);
        int int67 = hashMap55.size();
        system.testclass.HashMap.Entry[] entryArray68 = hashMap55.table;
        system.testclass.HashMap.Entry[] entryArray69 = hashMap55.table;
        java.lang.Object obj70 = hashMap27.remove((java.lang.Object) entryArray69);
        hashMap27.modCount = ' ';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap27", hashMap27.property_5());
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 1);
        hashMap1.modCount = (byte) 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap1", hashMap1.property_5());
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap.Entry[] entryArray6 = hashMap0.table;
        boolean boolean7 = hashMap0.property_2();
        boolean boolean8 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry10 = null;
        system.testclass.HashMap.Entry[] entryArray11 = new system.testclass.HashMap.Entry[] { entry10 };
        hashMap9.table = entryArray11;
        java.lang.Object obj14 = hashMap9.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry16 = null;
        system.testclass.HashMap.Entry[] entryArray17 = new system.testclass.HashMap.Entry[] { entry16 };
        hashMap15.table = entryArray17;
        boolean boolean19 = hashMap15.isEmpty();
        boolean boolean20 = hashMap15.composedRepOK();
        java.lang.Object obj21 = hashMap9.remove((java.lang.Object) hashMap15);
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray24 = hashMap23.table;
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry26 = null;
        system.testclass.HashMap.Entry[] entryArray27 = new system.testclass.HashMap.Entry[] { entry26 };
        hashMap25.table = entryArray27;
        boolean boolean29 = hashMap25.isEmpty();
        java.lang.Object obj31 = hashMap23.put((java.lang.Object) boolean29, (java.lang.Object) false);
        java.lang.Object obj33 = hashMap23.get((java.lang.Object) 'a');
        java.lang.Object obj34 = hashMap15.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap23);
        int int35 = hashMap23.size();
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray37 = hashMap36.table;
        boolean boolean38 = hashMap36.composedRepOK();
        java.lang.Object obj39 = hashMap23.get((java.lang.Object) hashMap36);
        java.lang.Object obj40 = hashMap0.remove((java.lang.Object) hashMap36);
        boolean boolean41 = hashMap36.isEmpty();
        hashMap36.modCount = '#';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap36", hashMap36.property_5());
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry7 = null;
        system.testclass.HashMap.Entry[] entryArray8 = new system.testclass.HashMap.Entry[] { entry7 };
        hashMap6.table = entryArray8;
        boolean boolean10 = hashMap6.isEmpty();
        boolean boolean11 = hashMap6.composedRepOK();
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray15 = hashMap14.table;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry17 = null;
        system.testclass.HashMap.Entry[] entryArray18 = new system.testclass.HashMap.Entry[] { entry17 };
        hashMap16.table = entryArray18;
        boolean boolean20 = hashMap16.isEmpty();
        java.lang.Object obj22 = hashMap14.put((java.lang.Object) boolean20, (java.lang.Object) false);
        java.lang.Object obj24 = hashMap14.get((java.lang.Object) 'a');
        java.lang.Object obj25 = hashMap6.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap14);
        int int26 = hashMap14.size();
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray28 = hashMap27.table;
        boolean boolean29 = hashMap27.composedRepOK();
        java.lang.Object obj30 = hashMap14.get((java.lang.Object) hashMap27);
        int int31 = hashMap27.modCount;
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry33 = null;
        system.testclass.HashMap.Entry[] entryArray34 = new system.testclass.HashMap.Entry[] { entry33 };
        hashMap32.table = entryArray34;
        java.lang.Object obj37 = hashMap32.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap.Entry[] entryArray38 = hashMap32.table;
        hashMap27.table = entryArray38;
        boolean boolean40 = hashMap27.property_2();
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry42 = null;
        system.testclass.HashMap.Entry[] entryArray43 = new system.testclass.HashMap.Entry[] { entry42 };
        hashMap41.table = entryArray43;
        java.lang.Object obj46 = hashMap41.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry48 = null;
        system.testclass.HashMap.Entry[] entryArray49 = new system.testclass.HashMap.Entry[] { entry48 };
        hashMap47.table = entryArray49;
        boolean boolean51 = hashMap47.isEmpty();
        boolean boolean52 = hashMap47.composedRepOK();
        java.lang.Object obj53 = hashMap41.remove((java.lang.Object) hashMap47);
        system.testclass.HashMap hashMap55 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray56 = hashMap55.table;
        system.testclass.HashMap hashMap57 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry58 = null;
        system.testclass.HashMap.Entry[] entryArray59 = new system.testclass.HashMap.Entry[] { entry58 };
        hashMap57.table = entryArray59;
        boolean boolean61 = hashMap57.isEmpty();
        java.lang.Object obj63 = hashMap55.put((java.lang.Object) boolean61, (java.lang.Object) false);
        java.lang.Object obj65 = hashMap55.get((java.lang.Object) 'a');
        java.lang.Object obj66 = hashMap47.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap55);
        int int67 = hashMap55.size();
        system.testclass.HashMap.Entry[] entryArray68 = hashMap55.table;
        system.testclass.HashMap.Entry[] entryArray69 = hashMap55.table;
        java.lang.Object obj70 = hashMap27.remove((java.lang.Object) entryArray69);
        hashMap27.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap27", hashMap27.property_5());
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry7 = null;
        system.testclass.HashMap.Entry[] entryArray8 = new system.testclass.HashMap.Entry[] { entry7 };
        hashMap6.table = entryArray8;
        boolean boolean10 = hashMap6.isEmpty();
        boolean boolean11 = hashMap6.composedRepOK();
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray15 = hashMap14.table;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry17 = null;
        system.testclass.HashMap.Entry[] entryArray18 = new system.testclass.HashMap.Entry[] { entry17 };
        hashMap16.table = entryArray18;
        boolean boolean20 = hashMap16.isEmpty();
        java.lang.Object obj22 = hashMap14.put((java.lang.Object) boolean20, (java.lang.Object) false);
        java.lang.Object obj24 = hashMap14.get((java.lang.Object) 'a');
        java.lang.Object obj25 = hashMap6.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap14);
        int int26 = hashMap14.size();
        system.testclass.HashMap.Entry[] entryArray27 = hashMap14.table;
        boolean boolean28 = hashMap14.composedRepOK();
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry30 = null;
        system.testclass.HashMap.Entry[] entryArray31 = new system.testclass.HashMap.Entry[] { entry30 };
        hashMap29.table = entryArray31;
        boolean boolean33 = hashMap29.isEmpty();
        system.testclass.HashMap.Entry[] entryArray34 = new system.testclass.HashMap.Entry[] {};
        hashMap29.table = entryArray34;
        hashMap14.table = entryArray34;
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry38 = null;
        system.testclass.HashMap.Entry[] entryArray39 = new system.testclass.HashMap.Entry[] { entry38 };
        hashMap37.table = entryArray39;
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry42 = null;
        system.testclass.HashMap.Entry[] entryArray43 = new system.testclass.HashMap.Entry[] { entry42 };
        hashMap41.table = entryArray43;
        boolean boolean45 = hashMap41.isEmpty();
        java.lang.Class<?> wildcardClass46 = hashMap41.getClass();
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry48 = null;
        system.testclass.HashMap.Entry[] entryArray49 = new system.testclass.HashMap.Entry[] { entry48 };
        hashMap47.table = entryArray49;
        java.lang.Object obj52 = hashMap47.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap53 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry54 = null;
        system.testclass.HashMap.Entry[] entryArray55 = new system.testclass.HashMap.Entry[] { entry54 };
        hashMap53.table = entryArray55;
        boolean boolean57 = hashMap53.isEmpty();
        boolean boolean58 = hashMap53.composedRepOK();
        java.lang.Object obj59 = hashMap47.remove((java.lang.Object) hashMap53);
        java.lang.Object obj60 = hashMap37.put((java.lang.Object) wildcardClass46, (java.lang.Object) hashMap47);
        system.testclass.HashMap.Entry[] entryArray61 = hashMap47.table;
        hashMap14.table = entryArray61;
        hashMap14.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap14", hashMap14.property_5());
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 10);
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap1", hashMap1.property_5());
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry7 = null;
        system.testclass.HashMap.Entry[] entryArray8 = new system.testclass.HashMap.Entry[] { entry7 };
        hashMap6.table = entryArray8;
        boolean boolean10 = hashMap6.isEmpty();
        boolean boolean11 = hashMap6.composedRepOK();
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray15 = hashMap14.table;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry17 = null;
        system.testclass.HashMap.Entry[] entryArray18 = new system.testclass.HashMap.Entry[] { entry17 };
        hashMap16.table = entryArray18;
        boolean boolean20 = hashMap16.isEmpty();
        java.lang.Object obj22 = hashMap14.put((java.lang.Object) boolean20, (java.lang.Object) false);
        java.lang.Object obj24 = hashMap14.get((java.lang.Object) 'a');
        java.lang.Object obj25 = hashMap6.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap14);
        int int26 = hashMap14.size();
        system.testclass.HashMap.Entry[] entryArray27 = hashMap14.table;
        boolean boolean28 = hashMap14.composedRepOK();
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry30 = null;
        system.testclass.HashMap.Entry[] entryArray31 = new system.testclass.HashMap.Entry[] { entry30 };
        hashMap29.table = entryArray31;
        boolean boolean33 = hashMap29.isEmpty();
        system.testclass.HashMap.Entry[] entryArray34 = new system.testclass.HashMap.Entry[] {};
        hashMap29.table = entryArray34;
        hashMap14.table = entryArray34;
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry38 = null;
        system.testclass.HashMap.Entry[] entryArray39 = new system.testclass.HashMap.Entry[] { entry38 };
        hashMap37.table = entryArray39;
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry42 = null;
        system.testclass.HashMap.Entry[] entryArray43 = new system.testclass.HashMap.Entry[] { entry42 };
        hashMap41.table = entryArray43;
        boolean boolean45 = hashMap41.isEmpty();
        java.lang.Class<?> wildcardClass46 = hashMap41.getClass();
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry48 = null;
        system.testclass.HashMap.Entry[] entryArray49 = new system.testclass.HashMap.Entry[] { entry48 };
        hashMap47.table = entryArray49;
        java.lang.Object obj52 = hashMap47.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap53 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry54 = null;
        system.testclass.HashMap.Entry[] entryArray55 = new system.testclass.HashMap.Entry[] { entry54 };
        hashMap53.table = entryArray55;
        boolean boolean57 = hashMap53.isEmpty();
        boolean boolean58 = hashMap53.composedRepOK();
        java.lang.Object obj59 = hashMap47.remove((java.lang.Object) hashMap53);
        java.lang.Object obj60 = hashMap37.put((java.lang.Object) wildcardClass46, (java.lang.Object) hashMap47);
        system.testclass.HashMap.Entry[] entryArray61 = hashMap47.table;
        hashMap14.table = entryArray61;
        hashMap14.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap14", hashMap14.property_5());
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        boolean boolean4 = hashMap0.isEmpty();
        system.testclass.HashMap.Entry[] entryArray5 = new system.testclass.HashMap.Entry[] {};
        hashMap0.table = entryArray5;
        int int7 = hashMap0.modCount;
        boolean boolean8 = hashMap0.property_2();
        hashMap0.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap0", hashMap0.property_5());
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry5 = null;
        system.testclass.HashMap.Entry[] entryArray6 = new system.testclass.HashMap.Entry[] { entry5 };
        hashMap4.table = entryArray6;
        boolean boolean8 = hashMap4.isEmpty();
        java.lang.Class<?> wildcardClass9 = hashMap4.getClass();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry11 = null;
        system.testclass.HashMap.Entry[] entryArray12 = new system.testclass.HashMap.Entry[] { entry11 };
        hashMap10.table = entryArray12;
        java.lang.Object obj15 = hashMap10.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry17 = null;
        system.testclass.HashMap.Entry[] entryArray18 = new system.testclass.HashMap.Entry[] { entry17 };
        hashMap16.table = entryArray18;
        boolean boolean20 = hashMap16.isEmpty();
        boolean boolean21 = hashMap16.composedRepOK();
        java.lang.Object obj22 = hashMap10.remove((java.lang.Object) hashMap16);
        java.lang.Object obj23 = hashMap0.put((java.lang.Object) wildcardClass9, (java.lang.Object) hashMap10);
        system.testclass.HashMap.Entry[] entryArray24 = hashMap10.table;
        int int25 = hashMap10.modCount;
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry27 = null;
        system.testclass.HashMap.Entry[] entryArray28 = new system.testclass.HashMap.Entry[] { entry27 };
        hashMap26.table = entryArray28;
        java.lang.Object obj30 = hashMap10.get((java.lang.Object) hashMap26);
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray32 = hashMap31.table;
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry34 = null;
        system.testclass.HashMap.Entry[] entryArray35 = new system.testclass.HashMap.Entry[] { entry34 };
        hashMap33.table = entryArray35;
        boolean boolean37 = hashMap33.isEmpty();
        java.lang.Object obj39 = hashMap31.put((java.lang.Object) boolean37, (java.lang.Object) false);
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray41 = hashMap40.table;
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry43 = null;
        system.testclass.HashMap.Entry[] entryArray44 = new system.testclass.HashMap.Entry[] { entry43 };
        hashMap42.table = entryArray44;
        boolean boolean46 = hashMap42.isEmpty();
        java.lang.Object obj48 = hashMap40.put((java.lang.Object) boolean46, (java.lang.Object) false);
        java.lang.Object obj50 = hashMap40.get((java.lang.Object) 'a');
        int int51 = hashMap40.size();
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry53 = null;
        system.testclass.HashMap.Entry[] entryArray54 = new system.testclass.HashMap.Entry[] { entry53 };
        hashMap52.table = entryArray54;
        java.lang.Object obj57 = hashMap52.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap58 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry59 = null;
        system.testclass.HashMap.Entry[] entryArray60 = new system.testclass.HashMap.Entry[] { entry59 };
        hashMap58.table = entryArray60;
        boolean boolean62 = hashMap58.isEmpty();
        boolean boolean63 = hashMap58.composedRepOK();
        java.lang.Object obj64 = hashMap52.remove((java.lang.Object) hashMap58);
        system.testclass.HashMap hashMap66 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray67 = hashMap66.table;
        system.testclass.HashMap hashMap68 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry69 = null;
        system.testclass.HashMap.Entry[] entryArray70 = new system.testclass.HashMap.Entry[] { entry69 };
        hashMap68.table = entryArray70;
        boolean boolean72 = hashMap68.isEmpty();
        java.lang.Object obj74 = hashMap66.put((java.lang.Object) boolean72, (java.lang.Object) false);
        java.lang.Object obj76 = hashMap66.get((java.lang.Object) 'a');
        java.lang.Object obj77 = hashMap58.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap66);
        int int78 = hashMap66.size();
        system.testclass.HashMap.Entry[] entryArray79 = hashMap66.table;
        hashMap40.table = entryArray79;
        hashMap31.table = entryArray79;
        java.lang.Object obj82 = hashMap26.get((java.lang.Object) hashMap31);
        java.lang.Object obj84 = hashMap31.get((java.lang.Object) 0L);
        system.testclass.HashMap.Entry[] entryArray85 = hashMap31.table;
        hashMap31.modCount = '#';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap31", hashMap31.property_5());
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry7 = null;
        system.testclass.HashMap.Entry[] entryArray8 = new system.testclass.HashMap.Entry[] { entry7 };
        hashMap6.table = entryArray8;
        boolean boolean10 = hashMap6.isEmpty();
        boolean boolean11 = hashMap6.composedRepOK();
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray15 = hashMap14.table;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry17 = null;
        system.testclass.HashMap.Entry[] entryArray18 = new system.testclass.HashMap.Entry[] { entry17 };
        hashMap16.table = entryArray18;
        boolean boolean20 = hashMap16.isEmpty();
        java.lang.Object obj22 = hashMap14.put((java.lang.Object) boolean20, (java.lang.Object) false);
        java.lang.Object obj24 = hashMap14.get((java.lang.Object) 'a');
        java.lang.Object obj25 = hashMap6.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap14);
        int int26 = hashMap14.modCount;
        system.testclass.HashMap.Entry[] entryArray27 = hashMap14.table;
        java.lang.Object obj29 = hashMap14.get((java.lang.Object) 1.0f);
        java.lang.Object obj31 = hashMap14.get((java.lang.Object) "hi!");
        int int32 = hashMap14.modCount;
        java.lang.Object obj33 = null;
        java.lang.Object obj35 = hashMap14.put(obj33, (java.lang.Object) 1L);
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap(100);
        java.lang.Object obj38 = hashMap14.remove((java.lang.Object) 100);
        boolean boolean39 = hashMap14.composedRepOK();
        boolean boolean40 = hashMap14.property_2();
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray42 = hashMap41.table;
        int int43 = hashMap41.size();
        system.testclass.HashMap.Entry entry44 = null;
        system.testclass.HashMap.Entry[] entryArray45 = new system.testclass.HashMap.Entry[] { entry44 };
        hashMap41.table = entryArray45;
        system.testclass.HashMap.Entry[] entryArray47 = hashMap41.table;
        hashMap14.table = entryArray47;
        hashMap14.modCount = '#';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap14", hashMap14.property_5());
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 100);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap2.table;
        int int4 = hashMap2.modCount;
        java.lang.Object obj5 = hashMap1.get((java.lang.Object) int4);
        system.testclass.HashMap.Entry[] entryArray6 = hashMap1.table;
        hashMap1.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap1", hashMap1.property_5());
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry7 = null;
        system.testclass.HashMap.Entry[] entryArray8 = new system.testclass.HashMap.Entry[] { entry7 };
        hashMap6.table = entryArray8;
        boolean boolean10 = hashMap6.isEmpty();
        boolean boolean11 = hashMap6.composedRepOK();
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray15 = hashMap14.table;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry17 = null;
        system.testclass.HashMap.Entry[] entryArray18 = new system.testclass.HashMap.Entry[] { entry17 };
        hashMap16.table = entryArray18;
        boolean boolean20 = hashMap16.isEmpty();
        java.lang.Object obj22 = hashMap14.put((java.lang.Object) boolean20, (java.lang.Object) false);
        java.lang.Object obj24 = hashMap14.get((java.lang.Object) 'a');
        java.lang.Object obj25 = hashMap6.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap14);
        java.lang.Object obj26 = null;
        java.lang.Object obj27 = hashMap14.get(obj26);
        system.testclass.HashMap.Entry[] entryArray28 = hashMap14.table;
        int int29 = hashMap14.size();
        hashMap14.modCount = 2;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap14", hashMap14.property_5());
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray1 = hashMap0.table;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry4 = null;
        system.testclass.HashMap.Entry[] entryArray5 = new system.testclass.HashMap.Entry[] { entry4 };
        hashMap3.table = entryArray5;
        java.lang.Object obj8 = hashMap3.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry10 = null;
        system.testclass.HashMap.Entry[] entryArray11 = new system.testclass.HashMap.Entry[] { entry10 };
        hashMap9.table = entryArray11;
        boolean boolean13 = hashMap9.isEmpty();
        boolean boolean14 = hashMap9.composedRepOK();
        java.lang.Object obj15 = hashMap3.remove((java.lang.Object) hashMap9);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray18 = hashMap17.table;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry20 = null;
        system.testclass.HashMap.Entry[] entryArray21 = new system.testclass.HashMap.Entry[] { entry20 };
        hashMap19.table = entryArray21;
        boolean boolean23 = hashMap19.isEmpty();
        java.lang.Object obj25 = hashMap17.put((java.lang.Object) boolean23, (java.lang.Object) false);
        java.lang.Object obj27 = hashMap17.get((java.lang.Object) 'a');
        java.lang.Object obj28 = hashMap9.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap17);
        int int29 = hashMap17.size();
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray31 = hashMap30.table;
        boolean boolean32 = hashMap30.composedRepOK();
        java.lang.Object obj33 = hashMap17.get((java.lang.Object) hashMap30);
        int int34 = hashMap30.modCount;
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry36 = null;
        system.testclass.HashMap.Entry[] entryArray37 = new system.testclass.HashMap.Entry[] { entry36 };
        hashMap35.table = entryArray37;
        java.lang.Object obj40 = hashMap35.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap.Entry[] entryArray41 = hashMap35.table;
        hashMap30.table = entryArray41;
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry44 = null;
        system.testclass.HashMap.Entry[] entryArray45 = new system.testclass.HashMap.Entry[] { entry44 };
        hashMap43.table = entryArray45;
        java.lang.Object obj48 = hashMap43.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap49 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry50 = null;
        system.testclass.HashMap.Entry[] entryArray51 = new system.testclass.HashMap.Entry[] { entry50 };
        hashMap49.table = entryArray51;
        boolean boolean53 = hashMap49.isEmpty();
        boolean boolean54 = hashMap49.composedRepOK();
        java.lang.Object obj55 = hashMap43.remove((java.lang.Object) hashMap49);
        system.testclass.HashMap hashMap57 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray58 = hashMap57.table;
        system.testclass.HashMap hashMap59 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry60 = null;
        system.testclass.HashMap.Entry[] entryArray61 = new system.testclass.HashMap.Entry[] { entry60 };
        hashMap59.table = entryArray61;
        boolean boolean63 = hashMap59.isEmpty();
        java.lang.Object obj65 = hashMap57.put((java.lang.Object) boolean63, (java.lang.Object) false);
        java.lang.Object obj67 = hashMap57.get((java.lang.Object) 'a');
        java.lang.Object obj68 = hashMap49.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap57);
        int int69 = hashMap57.size();
        system.testclass.HashMap.Entry[] entryArray70 = hashMap57.table;
        system.testclass.HashMap hashMap71 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry72 = null;
        system.testclass.HashMap.Entry[] entryArray73 = new system.testclass.HashMap.Entry[] { entry72 };
        hashMap71.table = entryArray73;
        boolean boolean75 = hashMap71.isEmpty();
        system.testclass.HashMap.Entry[] entryArray76 = hashMap71.table;
        java.lang.Object obj77 = hashMap30.put((java.lang.Object) entryArray70, (java.lang.Object) entryArray76);
        java.lang.Object obj78 = hashMap0.remove((java.lang.Object) hashMap30);
        java.lang.Object obj80 = hashMap30.remove((java.lang.Object) 100.0f);
        boolean boolean81 = hashMap30.composedRepOK();
        hashMap30.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap30", hashMap30.property_5());
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        boolean boolean4 = hashMap0.isEmpty();
        boolean boolean5 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap(100, (float) (short) 100);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray10 = hashMap9.table;
        int int11 = hashMap9.modCount;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry13 = null;
        system.testclass.HashMap.Entry[] entryArray14 = new system.testclass.HashMap.Entry[] { entry13 };
        hashMap12.table = entryArray14;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry17 = null;
        system.testclass.HashMap.Entry[] entryArray18 = new system.testclass.HashMap.Entry[] { entry17 };
        hashMap16.table = entryArray18;
        boolean boolean20 = hashMap16.isEmpty();
        java.lang.Class<?> wildcardClass21 = hashMap16.getClass();
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry23 = null;
        system.testclass.HashMap.Entry[] entryArray24 = new system.testclass.HashMap.Entry[] { entry23 };
        hashMap22.table = entryArray24;
        java.lang.Object obj27 = hashMap22.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry29 = null;
        system.testclass.HashMap.Entry[] entryArray30 = new system.testclass.HashMap.Entry[] { entry29 };
        hashMap28.table = entryArray30;
        boolean boolean32 = hashMap28.isEmpty();
        boolean boolean33 = hashMap28.composedRepOK();
        java.lang.Object obj34 = hashMap22.remove((java.lang.Object) hashMap28);
        java.lang.Object obj35 = hashMap12.put((java.lang.Object) wildcardClass21, (java.lang.Object) hashMap22);
        system.testclass.HashMap.Entry[] entryArray36 = hashMap22.table;
        system.testclass.HashMap.Entry[] entryArray37 = hashMap22.table;
        hashMap9.table = entryArray37;
        java.lang.Object obj39 = hashMap8.remove((java.lang.Object) entryArray37);
        hashMap0.table = entryArray37;
        hashMap0.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap0", hashMap0.property_5());
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (short) 1);
        boolean boolean6 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry8 = null;
        system.testclass.HashMap.Entry[] entryArray9 = new system.testclass.HashMap.Entry[] { entry8 };
        hashMap7.table = entryArray9;
        java.lang.Object obj12 = hashMap7.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry14 = null;
        system.testclass.HashMap.Entry[] entryArray15 = new system.testclass.HashMap.Entry[] { entry14 };
        hashMap13.table = entryArray15;
        boolean boolean17 = hashMap13.isEmpty();
        boolean boolean18 = hashMap13.composedRepOK();
        java.lang.Object obj19 = hashMap7.remove((java.lang.Object) hashMap13);
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray22 = hashMap21.table;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry24 = null;
        system.testclass.HashMap.Entry[] entryArray25 = new system.testclass.HashMap.Entry[] { entry24 };
        hashMap23.table = entryArray25;
        boolean boolean27 = hashMap23.isEmpty();
        java.lang.Object obj29 = hashMap21.put((java.lang.Object) boolean27, (java.lang.Object) false);
        java.lang.Object obj31 = hashMap21.get((java.lang.Object) 'a');
        java.lang.Object obj32 = hashMap13.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap21);
        int int33 = hashMap21.modCount;
        system.testclass.HashMap.Entry[] entryArray34 = hashMap21.table;
        int int35 = hashMap21.size();
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry37 = null;
        system.testclass.HashMap.Entry[] entryArray38 = new system.testclass.HashMap.Entry[] { entry37 };
        hashMap36.table = entryArray38;
        java.lang.Object obj40 = hashMap0.put((java.lang.Object) hashMap21, (java.lang.Object) entryArray38);
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray42 = hashMap41.table;
        int int43 = hashMap41.modCount;
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry45 = null;
        system.testclass.HashMap.Entry[] entryArray46 = new system.testclass.HashMap.Entry[] { entry45 };
        hashMap44.table = entryArray46;
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry49 = null;
        system.testclass.HashMap.Entry[] entryArray50 = new system.testclass.HashMap.Entry[] { entry49 };
        hashMap48.table = entryArray50;
        boolean boolean52 = hashMap48.isEmpty();
        java.lang.Class<?> wildcardClass53 = hashMap48.getClass();
        system.testclass.HashMap hashMap54 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry55 = null;
        system.testclass.HashMap.Entry[] entryArray56 = new system.testclass.HashMap.Entry[] { entry55 };
        hashMap54.table = entryArray56;
        java.lang.Object obj59 = hashMap54.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap60 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry61 = null;
        system.testclass.HashMap.Entry[] entryArray62 = new system.testclass.HashMap.Entry[] { entry61 };
        hashMap60.table = entryArray62;
        boolean boolean64 = hashMap60.isEmpty();
        boolean boolean65 = hashMap60.composedRepOK();
        java.lang.Object obj66 = hashMap54.remove((java.lang.Object) hashMap60);
        java.lang.Object obj67 = hashMap44.put((java.lang.Object) wildcardClass53, (java.lang.Object) hashMap54);
        system.testclass.HashMap.Entry[] entryArray68 = hashMap54.table;
        system.testclass.HashMap.Entry[] entryArray69 = hashMap54.table;
        hashMap41.table = entryArray69;
        hashMap0.table = entryArray69;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap0", hashMap0.property_5());
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 100);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap2.table;
        int int4 = hashMap2.modCount;
        java.lang.Object obj5 = hashMap1.get((java.lang.Object) int4);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry7 = null;
        system.testclass.HashMap.Entry[] entryArray8 = new system.testclass.HashMap.Entry[] { entry7 };
        hashMap6.table = entryArray8;
        boolean boolean10 = hashMap6.isEmpty();
        system.testclass.HashMap.Entry[] entryArray11 = hashMap6.table;
        java.lang.Object obj12 = hashMap1.get((java.lang.Object) entryArray11);
        hashMap1.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap1", hashMap1.property_5());
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry7 = null;
        system.testclass.HashMap.Entry[] entryArray8 = new system.testclass.HashMap.Entry[] { entry7 };
        hashMap6.table = entryArray8;
        boolean boolean10 = hashMap6.isEmpty();
        boolean boolean11 = hashMap6.composedRepOK();
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap6);
        int int13 = hashMap0.size();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry15 = null;
        system.testclass.HashMap.Entry[] entryArray16 = new system.testclass.HashMap.Entry[] { entry15 };
        hashMap14.table = entryArray16;
        java.lang.Object obj19 = hashMap14.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry21 = null;
        system.testclass.HashMap.Entry[] entryArray22 = new system.testclass.HashMap.Entry[] { entry21 };
        hashMap20.table = entryArray22;
        boolean boolean24 = hashMap20.isEmpty();
        boolean boolean25 = hashMap20.composedRepOK();
        java.lang.Object obj26 = hashMap14.remove((java.lang.Object) hashMap20);
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray29 = hashMap28.table;
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry31 = null;
        system.testclass.HashMap.Entry[] entryArray32 = new system.testclass.HashMap.Entry[] { entry31 };
        hashMap30.table = entryArray32;
        boolean boolean34 = hashMap30.isEmpty();
        java.lang.Object obj36 = hashMap28.put((java.lang.Object) boolean34, (java.lang.Object) false);
        java.lang.Object obj38 = hashMap28.get((java.lang.Object) 'a');
        java.lang.Object obj39 = hashMap20.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap28);
        int int40 = hashMap28.size();
        system.testclass.HashMap.Entry[] entryArray41 = hashMap28.table;
        system.testclass.HashMap.Entry[] entryArray42 = hashMap28.table;
        hashMap0.table = entryArray42;
        int int44 = hashMap0.size();
        hashMap0.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap0", hashMap0.property_5());
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) ' ');
        hashMap1.modCount = (short) 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap1", hashMap1.property_5());
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) 'a');
        boolean boolean2 = hashMap1.composedRepOK();
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap1", hashMap1.property_5());
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray1 = hashMap0.table;
        int int2 = hashMap0.modCount;
        int int3 = hashMap0.modCount;
        hashMap0.modCount = 2;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap0", hashMap0.property_5());
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(100, (float) (short) 100);
        hashMap2.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap2", hashMap2.property_5());
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray1 = hashMap0.table;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry5 = null;
        system.testclass.HashMap.Entry[] entryArray6 = new system.testclass.HashMap.Entry[] { entry5 };
        hashMap4.table = entryArray6;
        java.lang.Object obj9 = hashMap4.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry11 = null;
        system.testclass.HashMap.Entry[] entryArray12 = new system.testclass.HashMap.Entry[] { entry11 };
        hashMap10.table = entryArray12;
        boolean boolean14 = hashMap10.isEmpty();
        boolean boolean15 = hashMap10.composedRepOK();
        java.lang.Object obj16 = hashMap4.remove((java.lang.Object) hashMap10);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray19 = hashMap18.table;
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry21 = null;
        system.testclass.HashMap.Entry[] entryArray22 = new system.testclass.HashMap.Entry[] { entry21 };
        hashMap20.table = entryArray22;
        boolean boolean24 = hashMap20.isEmpty();
        java.lang.Object obj26 = hashMap18.put((java.lang.Object) boolean24, (java.lang.Object) false);
        java.lang.Object obj28 = hashMap18.get((java.lang.Object) 'a');
        java.lang.Object obj29 = hashMap10.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap18);
        int int30 = hashMap18.modCount;
        system.testclass.HashMap.Entry[] entryArray31 = hashMap18.table;
        java.lang.Object obj32 = hashMap0.put((java.lang.Object) ' ', (java.lang.Object) hashMap18);
        hashMap18.modCount = 2;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap18", hashMap18.property_5());
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 100);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap2.table;
        int int4 = hashMap2.modCount;
        java.lang.Object obj5 = hashMap1.get((java.lang.Object) int4);
        system.testclass.HashMap.Entry[] entryArray6 = hashMap1.table;
        boolean boolean7 = hashMap1.composedRepOK();
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap1", hashMap1.property_5());
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(10);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap2.table;
        hashMap1.table = entryArray3;
        system.testclass.HashMap.Entry[] entryArray5 = hashMap1.table;
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap1", hashMap1.property_5());
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry7 = null;
        system.testclass.HashMap.Entry[] entryArray8 = new system.testclass.HashMap.Entry[] { entry7 };
        hashMap6.table = entryArray8;
        boolean boolean10 = hashMap6.isEmpty();
        boolean boolean11 = hashMap6.composedRepOK();
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray15 = hashMap14.table;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry17 = null;
        system.testclass.HashMap.Entry[] entryArray18 = new system.testclass.HashMap.Entry[] { entry17 };
        hashMap16.table = entryArray18;
        boolean boolean20 = hashMap16.isEmpty();
        java.lang.Object obj22 = hashMap14.put((java.lang.Object) boolean20, (java.lang.Object) false);
        java.lang.Object obj24 = hashMap14.get((java.lang.Object) 'a');
        java.lang.Object obj25 = hashMap6.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap14);
        int int26 = hashMap14.modCount;
        system.testclass.HashMap.Entry[] entryArray27 = hashMap14.table;
        java.lang.Object obj29 = hashMap14.get((java.lang.Object) 1.0f);
        java.lang.Object obj31 = hashMap14.get((java.lang.Object) "hi!");
        int int32 = hashMap14.modCount;
        java.lang.Object obj33 = null;
        java.lang.Object obj35 = hashMap14.put(obj33, (java.lang.Object) 1L);
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap(100);
        java.lang.Object obj38 = hashMap14.remove((java.lang.Object) 100);
        boolean boolean39 = hashMap14.composedRepOK();
        boolean boolean40 = hashMap14.property_2();
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray42 = hashMap41.table;
        int int43 = hashMap41.size();
        system.testclass.HashMap.Entry entry44 = null;
        system.testclass.HashMap.Entry[] entryArray45 = new system.testclass.HashMap.Entry[] { entry44 };
        hashMap41.table = entryArray45;
        system.testclass.HashMap.Entry[] entryArray47 = hashMap41.table;
        hashMap14.table = entryArray47;
        int int49 = hashMap14.modCount;
        hashMap14.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap14", hashMap14.property_5());
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry5 = null;
        system.testclass.HashMap.Entry[] entryArray6 = new system.testclass.HashMap.Entry[] { entry5 };
        hashMap4.table = entryArray6;
        boolean boolean8 = hashMap4.isEmpty();
        java.lang.Class<?> wildcardClass9 = hashMap4.getClass();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry11 = null;
        system.testclass.HashMap.Entry[] entryArray12 = new system.testclass.HashMap.Entry[] { entry11 };
        hashMap10.table = entryArray12;
        java.lang.Object obj15 = hashMap10.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry17 = null;
        system.testclass.HashMap.Entry[] entryArray18 = new system.testclass.HashMap.Entry[] { entry17 };
        hashMap16.table = entryArray18;
        boolean boolean20 = hashMap16.isEmpty();
        boolean boolean21 = hashMap16.composedRepOK();
        java.lang.Object obj22 = hashMap10.remove((java.lang.Object) hashMap16);
        java.lang.Object obj23 = hashMap0.put((java.lang.Object) wildcardClass9, (java.lang.Object) hashMap10);
        system.testclass.HashMap.Entry[] entryArray24 = hashMap10.table;
        boolean boolean25 = hashMap10.composedRepOK();
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry27 = null;
        system.testclass.HashMap.Entry[] entryArray28 = new system.testclass.HashMap.Entry[] { entry27 };
        hashMap26.table = entryArray28;
        java.lang.Object obj31 = hashMap26.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry33 = null;
        system.testclass.HashMap.Entry[] entryArray34 = new system.testclass.HashMap.Entry[] { entry33 };
        hashMap32.table = entryArray34;
        boolean boolean36 = hashMap32.isEmpty();
        boolean boolean37 = hashMap32.composedRepOK();
        java.lang.Object obj38 = hashMap26.remove((java.lang.Object) hashMap32);
        int int39 = hashMap26.modCount;
        boolean boolean40 = hashMap26.isEmpty();
        int int41 = hashMap26.size();
        java.lang.Object obj42 = hashMap10.remove((java.lang.Object) hashMap26);
        hashMap10.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap10", hashMap10.property_5());
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) '4');
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry3 = null;
        system.testclass.HashMap.Entry[] entryArray4 = new system.testclass.HashMap.Entry[] { entry3 };
        hashMap2.table = entryArray4;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry7 = null;
        system.testclass.HashMap.Entry[] entryArray8 = new system.testclass.HashMap.Entry[] { entry7 };
        hashMap6.table = entryArray8;
        boolean boolean10 = hashMap6.isEmpty();
        java.lang.Class<?> wildcardClass11 = hashMap6.getClass();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry13 = null;
        system.testclass.HashMap.Entry[] entryArray14 = new system.testclass.HashMap.Entry[] { entry13 };
        hashMap12.table = entryArray14;
        java.lang.Object obj17 = hashMap12.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry19 = null;
        system.testclass.HashMap.Entry[] entryArray20 = new system.testclass.HashMap.Entry[] { entry19 };
        hashMap18.table = entryArray20;
        boolean boolean22 = hashMap18.isEmpty();
        boolean boolean23 = hashMap18.composedRepOK();
        java.lang.Object obj24 = hashMap12.remove((java.lang.Object) hashMap18);
        java.lang.Object obj25 = hashMap2.put((java.lang.Object) wildcardClass11, (java.lang.Object) hashMap12);
        system.testclass.HashMap.Entry[] entryArray26 = hashMap12.table;
        hashMap1.table = entryArray26;
        int int28 = hashMap1.modCount;
        hashMap1.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap1", hashMap1.property_5());
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap.Entry[] entryArray6 = hashMap0.table;
        boolean boolean7 = hashMap0.property_2();
        boolean boolean8 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry10 = null;
        system.testclass.HashMap.Entry[] entryArray11 = new system.testclass.HashMap.Entry[] { entry10 };
        hashMap9.table = entryArray11;
        java.lang.Object obj14 = hashMap9.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry16 = null;
        system.testclass.HashMap.Entry[] entryArray17 = new system.testclass.HashMap.Entry[] { entry16 };
        hashMap15.table = entryArray17;
        boolean boolean19 = hashMap15.isEmpty();
        boolean boolean20 = hashMap15.composedRepOK();
        java.lang.Object obj21 = hashMap9.remove((java.lang.Object) hashMap15);
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray24 = hashMap23.table;
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry26 = null;
        system.testclass.HashMap.Entry[] entryArray27 = new system.testclass.HashMap.Entry[] { entry26 };
        hashMap25.table = entryArray27;
        boolean boolean29 = hashMap25.isEmpty();
        java.lang.Object obj31 = hashMap23.put((java.lang.Object) boolean29, (java.lang.Object) false);
        java.lang.Object obj33 = hashMap23.get((java.lang.Object) 'a');
        java.lang.Object obj34 = hashMap15.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap23);
        int int35 = hashMap23.size();
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray37 = hashMap36.table;
        boolean boolean38 = hashMap36.composedRepOK();
        java.lang.Object obj39 = hashMap23.get((java.lang.Object) hashMap36);
        java.lang.Object obj40 = hashMap0.remove((java.lang.Object) hashMap36);
        java.lang.Object obj42 = hashMap0.get((java.lang.Object) '#');
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap0", hashMap0.property_5());
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 100);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap2.table;
        int int4 = hashMap2.modCount;
        java.lang.Object obj5 = hashMap1.get((java.lang.Object) int4);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry7 = null;
        system.testclass.HashMap.Entry[] entryArray8 = new system.testclass.HashMap.Entry[] { entry7 };
        hashMap6.table = entryArray8;
        boolean boolean10 = hashMap6.isEmpty();
        system.testclass.HashMap.Entry[] entryArray11 = hashMap6.table;
        java.lang.Object obj12 = hashMap1.get((java.lang.Object) entryArray11);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        boolean boolean14 = hashMap13.composedRepOK();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray16 = hashMap15.table;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry18 = null;
        system.testclass.HashMap.Entry[] entryArray19 = new system.testclass.HashMap.Entry[] { entry18 };
        hashMap17.table = entryArray19;
        boolean boolean21 = hashMap17.isEmpty();
        java.lang.Object obj23 = hashMap15.put((java.lang.Object) boolean21, (java.lang.Object) false);
        boolean boolean24 = hashMap15.property_2();
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray26 = hashMap25.table;
        int int27 = hashMap25.size();
        system.testclass.HashMap.Entry[] entryArray28 = hashMap25.table;
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        boolean boolean30 = hashMap29.isEmpty();
        boolean boolean31 = hashMap29.isEmpty();
        java.lang.Object obj33 = hashMap29.remove((java.lang.Object) (byte) 10);
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry35 = null;
        system.testclass.HashMap.Entry[] entryArray36 = new system.testclass.HashMap.Entry[] { entry35 };
        hashMap34.table = entryArray36;
        java.lang.Object obj39 = hashMap34.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry41 = null;
        system.testclass.HashMap.Entry[] entryArray42 = new system.testclass.HashMap.Entry[] { entry41 };
        hashMap40.table = entryArray42;
        boolean boolean44 = hashMap40.isEmpty();
        boolean boolean45 = hashMap40.composedRepOK();
        java.lang.Object obj46 = hashMap34.remove((java.lang.Object) hashMap40);
        int int47 = hashMap34.modCount;
        java.lang.Class<?> wildcardClass48 = hashMap34.getClass();
        java.lang.Object obj49 = hashMap29.get((java.lang.Object) hashMap34);
        java.lang.Object obj50 = hashMap15.put((java.lang.Object) entryArray28, (java.lang.Object) hashMap34);
        java.lang.Object obj51 = hashMap13.remove((java.lang.Object) entryArray28);
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry53 = null;
        system.testclass.HashMap.Entry[] entryArray54 = new system.testclass.HashMap.Entry[] { entry53 };
        hashMap52.table = entryArray54;
        java.lang.Object obj57 = hashMap52.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap58 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry59 = null;
        system.testclass.HashMap.Entry[] entryArray60 = new system.testclass.HashMap.Entry[] { entry59 };
        hashMap58.table = entryArray60;
        boolean boolean62 = hashMap58.isEmpty();
        boolean boolean63 = hashMap58.composedRepOK();
        java.lang.Object obj64 = hashMap52.remove((java.lang.Object) hashMap58);
        system.testclass.HashMap hashMap66 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray67 = hashMap66.table;
        system.testclass.HashMap hashMap68 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry69 = null;
        system.testclass.HashMap.Entry[] entryArray70 = new system.testclass.HashMap.Entry[] { entry69 };
        hashMap68.table = entryArray70;
        boolean boolean72 = hashMap68.isEmpty();
        java.lang.Object obj74 = hashMap66.put((java.lang.Object) boolean72, (java.lang.Object) false);
        java.lang.Object obj76 = hashMap66.get((java.lang.Object) 'a');
        java.lang.Object obj77 = hashMap58.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap66);
        int int78 = hashMap66.size();
        system.testclass.HashMap hashMap79 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray80 = hashMap79.table;
        boolean boolean81 = hashMap79.composedRepOK();
        java.lang.Object obj82 = hashMap66.get((java.lang.Object) hashMap79);
        int int83 = hashMap79.modCount;
        boolean boolean84 = hashMap79.isEmpty();
        boolean boolean85 = hashMap79.composedRepOK();
        java.lang.Class<?> wildcardClass86 = hashMap79.getClass();
        java.lang.Object obj87 = hashMap1.put((java.lang.Object) entryArray28, (java.lang.Object) hashMap79);
        int int88 = hashMap1.modCount;
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap1", hashMap1.property_5());
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap.Entry[] entryArray6 = hashMap0.table;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry8 = null;
        system.testclass.HashMap.Entry[] entryArray9 = new system.testclass.HashMap.Entry[] { entry8 };
        hashMap7.table = entryArray9;
        boolean boolean11 = hashMap7.isEmpty();
        java.lang.Class<?> wildcardClass12 = hashMap7.getClass();
        java.lang.Object obj13 = hashMap0.get((java.lang.Object) hashMap7);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry16 = null;
        system.testclass.HashMap.Entry[] entryArray17 = new system.testclass.HashMap.Entry[] { entry16 };
        hashMap15.table = entryArray17;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry20 = null;
        system.testclass.HashMap.Entry[] entryArray21 = new system.testclass.HashMap.Entry[] { entry20 };
        hashMap19.table = entryArray21;
        boolean boolean23 = hashMap19.isEmpty();
        java.lang.Class<?> wildcardClass24 = hashMap19.getClass();
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry26 = null;
        system.testclass.HashMap.Entry[] entryArray27 = new system.testclass.HashMap.Entry[] { entry26 };
        hashMap25.table = entryArray27;
        java.lang.Object obj30 = hashMap25.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry32 = null;
        system.testclass.HashMap.Entry[] entryArray33 = new system.testclass.HashMap.Entry[] { entry32 };
        hashMap31.table = entryArray33;
        boolean boolean35 = hashMap31.isEmpty();
        boolean boolean36 = hashMap31.composedRepOK();
        java.lang.Object obj37 = hashMap25.remove((java.lang.Object) hashMap31);
        java.lang.Object obj38 = hashMap15.put((java.lang.Object) wildcardClass24, (java.lang.Object) hashMap25);
        system.testclass.HashMap.Entry[] entryArray39 = hashMap25.table;
        int int40 = hashMap25.size();
        java.lang.Object obj41 = hashMap0.put((java.lang.Object) 10.0d, (java.lang.Object) int40);
        boolean boolean42 = hashMap0.composedRepOK();
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap0", hashMap0.property_5());
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry7 = null;
        system.testclass.HashMap.Entry[] entryArray8 = new system.testclass.HashMap.Entry[] { entry7 };
        hashMap6.table = entryArray8;
        boolean boolean10 = hashMap6.isEmpty();
        boolean boolean11 = hashMap6.composedRepOK();
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray15 = hashMap14.table;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry17 = null;
        system.testclass.HashMap.Entry[] entryArray18 = new system.testclass.HashMap.Entry[] { entry17 };
        hashMap16.table = entryArray18;
        boolean boolean20 = hashMap16.isEmpty();
        java.lang.Object obj22 = hashMap14.put((java.lang.Object) boolean20, (java.lang.Object) false);
        java.lang.Object obj24 = hashMap14.get((java.lang.Object) 'a');
        java.lang.Object obj25 = hashMap6.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap14);
        int int26 = hashMap6.size();
        boolean boolean27 = hashMap6.composedRepOK();
        boolean boolean28 = hashMap6.composedRepOK();
        hashMap6.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap6", hashMap6.property_5());
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray1 = hashMap0.table;
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap2.table;
        int int4 = hashMap2.size();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap2.table;
        hashMap0.table = entryArray5;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap0", hashMap0.property_5());
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry7 = null;
        system.testclass.HashMap.Entry[] entryArray8 = new system.testclass.HashMap.Entry[] { entry7 };
        hashMap6.table = entryArray8;
        boolean boolean10 = hashMap6.isEmpty();
        boolean boolean11 = hashMap6.composedRepOK();
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray15 = hashMap14.table;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry17 = null;
        system.testclass.HashMap.Entry[] entryArray18 = new system.testclass.HashMap.Entry[] { entry17 };
        hashMap16.table = entryArray18;
        boolean boolean20 = hashMap16.isEmpty();
        java.lang.Object obj22 = hashMap14.put((java.lang.Object) boolean20, (java.lang.Object) false);
        java.lang.Object obj24 = hashMap14.get((java.lang.Object) 'a');
        java.lang.Object obj25 = hashMap6.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap14);
        int int26 = hashMap14.size();
        system.testclass.HashMap.Entry[] entryArray27 = hashMap14.table;
        boolean boolean28 = hashMap14.composedRepOK();
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry30 = null;
        system.testclass.HashMap.Entry[] entryArray31 = new system.testclass.HashMap.Entry[] { entry30 };
        hashMap29.table = entryArray31;
        boolean boolean33 = hashMap29.isEmpty();
        system.testclass.HashMap.Entry[] entryArray34 = new system.testclass.HashMap.Entry[] {};
        hashMap29.table = entryArray34;
        hashMap14.table = entryArray34;
        boolean boolean37 = hashMap14.composedRepOK();
        hashMap14.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap14", hashMap14.property_5());
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry7 = null;
        system.testclass.HashMap.Entry[] entryArray8 = new system.testclass.HashMap.Entry[] { entry7 };
        hashMap6.table = entryArray8;
        boolean boolean10 = hashMap6.isEmpty();
        boolean boolean11 = hashMap6.composedRepOK();
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap6);
        int int13 = hashMap0.modCount;
        int int14 = hashMap0.modCount;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        boolean boolean16 = hashMap15.composedRepOK();
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray18 = hashMap17.table;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry20 = null;
        system.testclass.HashMap.Entry[] entryArray21 = new system.testclass.HashMap.Entry[] { entry20 };
        hashMap19.table = entryArray21;
        boolean boolean23 = hashMap19.isEmpty();
        java.lang.Object obj25 = hashMap17.put((java.lang.Object) boolean23, (java.lang.Object) false);
        boolean boolean26 = hashMap17.property_2();
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray28 = hashMap27.table;
        int int29 = hashMap27.size();
        system.testclass.HashMap.Entry[] entryArray30 = hashMap27.table;
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        boolean boolean32 = hashMap31.isEmpty();
        boolean boolean33 = hashMap31.isEmpty();
        java.lang.Object obj35 = hashMap31.remove((java.lang.Object) (byte) 10);
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry37 = null;
        system.testclass.HashMap.Entry[] entryArray38 = new system.testclass.HashMap.Entry[] { entry37 };
        hashMap36.table = entryArray38;
        java.lang.Object obj41 = hashMap36.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry43 = null;
        system.testclass.HashMap.Entry[] entryArray44 = new system.testclass.HashMap.Entry[] { entry43 };
        hashMap42.table = entryArray44;
        boolean boolean46 = hashMap42.isEmpty();
        boolean boolean47 = hashMap42.composedRepOK();
        java.lang.Object obj48 = hashMap36.remove((java.lang.Object) hashMap42);
        int int49 = hashMap36.modCount;
        java.lang.Class<?> wildcardClass50 = hashMap36.getClass();
        java.lang.Object obj51 = hashMap31.get((java.lang.Object) hashMap36);
        java.lang.Object obj52 = hashMap17.put((java.lang.Object) entryArray30, (java.lang.Object) hashMap36);
        java.lang.Object obj53 = hashMap15.remove((java.lang.Object) entryArray30);
        hashMap0.table = entryArray30;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap0", hashMap0.property_5());
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray1 = hashMap0.table;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry5 = null;
        system.testclass.HashMap.Entry[] entryArray6 = new system.testclass.HashMap.Entry[] { entry5 };
        hashMap4.table = entryArray6;
        java.lang.Object obj9 = hashMap4.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry11 = null;
        system.testclass.HashMap.Entry[] entryArray12 = new system.testclass.HashMap.Entry[] { entry11 };
        hashMap10.table = entryArray12;
        boolean boolean14 = hashMap10.isEmpty();
        boolean boolean15 = hashMap10.composedRepOK();
        java.lang.Object obj16 = hashMap4.remove((java.lang.Object) hashMap10);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray19 = hashMap18.table;
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry21 = null;
        system.testclass.HashMap.Entry[] entryArray22 = new system.testclass.HashMap.Entry[] { entry21 };
        hashMap20.table = entryArray22;
        boolean boolean24 = hashMap20.isEmpty();
        java.lang.Object obj26 = hashMap18.put((java.lang.Object) boolean24, (java.lang.Object) false);
        java.lang.Object obj28 = hashMap18.get((java.lang.Object) 'a');
        java.lang.Object obj29 = hashMap10.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap18);
        int int30 = hashMap18.modCount;
        system.testclass.HashMap.Entry[] entryArray31 = hashMap18.table;
        java.lang.Object obj32 = hashMap0.put((java.lang.Object) ' ', (java.lang.Object) hashMap18);
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        boolean boolean34 = hashMap33.isEmpty();
        boolean boolean35 = hashMap33.isEmpty();
        java.lang.Object obj36 = hashMap18.get((java.lang.Object) boolean35);
        boolean boolean37 = hashMap18.property_2();
        hashMap18.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap18", hashMap18.property_5());
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray1 = hashMap0.table;
        int int2 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (-1L));
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry7 = null;
        system.testclass.HashMap.Entry[] entryArray8 = new system.testclass.HashMap.Entry[] { entry7 };
        hashMap6.table = entryArray8;
        java.lang.Object obj11 = hashMap6.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap.Entry[] entryArray12 = hashMap6.table;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry14 = null;
        system.testclass.HashMap.Entry[] entryArray15 = new system.testclass.HashMap.Entry[] { entry14 };
        hashMap13.table = entryArray15;
        boolean boolean17 = hashMap13.isEmpty();
        java.lang.Class<?> wildcardClass18 = hashMap13.getClass();
        java.lang.Object obj19 = hashMap6.get((java.lang.Object) hashMap13);
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry22 = null;
        system.testclass.HashMap.Entry[] entryArray23 = new system.testclass.HashMap.Entry[] { entry22 };
        hashMap21.table = entryArray23;
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry26 = null;
        system.testclass.HashMap.Entry[] entryArray27 = new system.testclass.HashMap.Entry[] { entry26 };
        hashMap25.table = entryArray27;
        boolean boolean29 = hashMap25.isEmpty();
        java.lang.Class<?> wildcardClass30 = hashMap25.getClass();
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry32 = null;
        system.testclass.HashMap.Entry[] entryArray33 = new system.testclass.HashMap.Entry[] { entry32 };
        hashMap31.table = entryArray33;
        java.lang.Object obj36 = hashMap31.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry38 = null;
        system.testclass.HashMap.Entry[] entryArray39 = new system.testclass.HashMap.Entry[] { entry38 };
        hashMap37.table = entryArray39;
        boolean boolean41 = hashMap37.isEmpty();
        boolean boolean42 = hashMap37.composedRepOK();
        java.lang.Object obj43 = hashMap31.remove((java.lang.Object) hashMap37);
        java.lang.Object obj44 = hashMap21.put((java.lang.Object) wildcardClass30, (java.lang.Object) hashMap31);
        system.testclass.HashMap.Entry[] entryArray45 = hashMap31.table;
        int int46 = hashMap31.size();
        java.lang.Object obj47 = hashMap6.put((java.lang.Object) 10.0d, (java.lang.Object) int46);
        boolean boolean48 = hashMap6.composedRepOK();
        system.testclass.HashMap hashMap49 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry50 = null;
        system.testclass.HashMap.Entry[] entryArray51 = new system.testclass.HashMap.Entry[] { entry50 };
        hashMap49.table = entryArray51;
        boolean boolean53 = hashMap49.isEmpty();
        system.testclass.HashMap.Entry[] entryArray54 = hashMap49.table;
        hashMap6.table = entryArray54;
        boolean boolean56 = hashMap6.isEmpty();
        java.lang.Object obj57 = hashMap0.remove((java.lang.Object) hashMap6);
        hashMap6.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap6", hashMap6.property_5());
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry7 = null;
        system.testclass.HashMap.Entry[] entryArray8 = new system.testclass.HashMap.Entry[] { entry7 };
        hashMap6.table = entryArray8;
        boolean boolean10 = hashMap6.isEmpty();
        boolean boolean11 = hashMap6.composedRepOK();
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray15 = hashMap14.table;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry17 = null;
        system.testclass.HashMap.Entry[] entryArray18 = new system.testclass.HashMap.Entry[] { entry17 };
        hashMap16.table = entryArray18;
        boolean boolean20 = hashMap16.isEmpty();
        java.lang.Object obj22 = hashMap14.put((java.lang.Object) boolean20, (java.lang.Object) false);
        java.lang.Object obj24 = hashMap14.get((java.lang.Object) 'a');
        java.lang.Object obj25 = hashMap6.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap14);
        int int26 = hashMap14.size();
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray28 = hashMap27.table;
        boolean boolean29 = hashMap27.composedRepOK();
        java.lang.Object obj30 = hashMap14.get((java.lang.Object) hashMap27);
        int int31 = hashMap27.modCount;
        boolean boolean32 = hashMap27.isEmpty();
        hashMap27.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap27", hashMap27.property_5());
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '#', (float) ' ');
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray4 = hashMap3.table;
        int int5 = hashMap3.size();
        system.testclass.HashMap.Entry entry6 = null;
        system.testclass.HashMap.Entry[] entryArray7 = new system.testclass.HashMap.Entry[] { entry6 };
        hashMap3.table = entryArray7;
        java.lang.Object obj9 = hashMap2.remove((java.lang.Object) hashMap3);
        system.testclass.HashMap.Entry[] entryArray10 = hashMap3.table;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        boolean boolean12 = hashMap11.isEmpty();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry14 = null;
        system.testclass.HashMap.Entry[] entryArray15 = new system.testclass.HashMap.Entry[] { entry14 };
        hashMap13.table = entryArray15;
        java.lang.Object obj18 = hashMap13.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry20 = null;
        system.testclass.HashMap.Entry[] entryArray21 = new system.testclass.HashMap.Entry[] { entry20 };
        hashMap19.table = entryArray21;
        boolean boolean23 = hashMap19.isEmpty();
        boolean boolean24 = hashMap19.composedRepOK();
        java.lang.Object obj25 = hashMap13.remove((java.lang.Object) hashMap19);
        int int26 = hashMap19.modCount;
        int int27 = hashMap19.modCount;
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry30 = null;
        system.testclass.HashMap.Entry[] entryArray31 = new system.testclass.HashMap.Entry[] { entry30 };
        hashMap29.table = entryArray31;
        java.lang.Object obj34 = hashMap29.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry36 = null;
        system.testclass.HashMap.Entry[] entryArray37 = new system.testclass.HashMap.Entry[] { entry36 };
        hashMap35.table = entryArray37;
        boolean boolean39 = hashMap35.isEmpty();
        boolean boolean40 = hashMap35.composedRepOK();
        java.lang.Object obj41 = hashMap29.remove((java.lang.Object) hashMap35);
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray44 = hashMap43.table;
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry46 = null;
        system.testclass.HashMap.Entry[] entryArray47 = new system.testclass.HashMap.Entry[] { entry46 };
        hashMap45.table = entryArray47;
        boolean boolean49 = hashMap45.isEmpty();
        java.lang.Object obj51 = hashMap43.put((java.lang.Object) boolean49, (java.lang.Object) false);
        java.lang.Object obj53 = hashMap43.get((java.lang.Object) 'a');
        java.lang.Object obj54 = hashMap35.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap43);
        java.lang.Object obj55 = hashMap19.put((java.lang.Object) 100, (java.lang.Object) (short) 100);
        java.lang.Object obj56 = hashMap11.get((java.lang.Object) hashMap19);
        java.lang.Object obj57 = hashMap3.remove((java.lang.Object) hashMap11);
        hashMap3.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap3", hashMap3.property_5());
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '#', (float) ' ');
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray4 = hashMap3.table;
        int int5 = hashMap3.size();
        system.testclass.HashMap.Entry entry6 = null;
        system.testclass.HashMap.Entry[] entryArray7 = new system.testclass.HashMap.Entry[] { entry6 };
        hashMap3.table = entryArray7;
        java.lang.Object obj9 = hashMap2.remove((java.lang.Object) hashMap3);
        system.testclass.HashMap.Entry[] entryArray10 = hashMap3.table;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        boolean boolean12 = hashMap11.isEmpty();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry14 = null;
        system.testclass.HashMap.Entry[] entryArray15 = new system.testclass.HashMap.Entry[] { entry14 };
        hashMap13.table = entryArray15;
        java.lang.Object obj18 = hashMap13.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry20 = null;
        system.testclass.HashMap.Entry[] entryArray21 = new system.testclass.HashMap.Entry[] { entry20 };
        hashMap19.table = entryArray21;
        boolean boolean23 = hashMap19.isEmpty();
        boolean boolean24 = hashMap19.composedRepOK();
        java.lang.Object obj25 = hashMap13.remove((java.lang.Object) hashMap19);
        int int26 = hashMap19.modCount;
        int int27 = hashMap19.modCount;
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry30 = null;
        system.testclass.HashMap.Entry[] entryArray31 = new system.testclass.HashMap.Entry[] { entry30 };
        hashMap29.table = entryArray31;
        java.lang.Object obj34 = hashMap29.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry36 = null;
        system.testclass.HashMap.Entry[] entryArray37 = new system.testclass.HashMap.Entry[] { entry36 };
        hashMap35.table = entryArray37;
        boolean boolean39 = hashMap35.isEmpty();
        boolean boolean40 = hashMap35.composedRepOK();
        java.lang.Object obj41 = hashMap29.remove((java.lang.Object) hashMap35);
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray44 = hashMap43.table;
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry46 = null;
        system.testclass.HashMap.Entry[] entryArray47 = new system.testclass.HashMap.Entry[] { entry46 };
        hashMap45.table = entryArray47;
        boolean boolean49 = hashMap45.isEmpty();
        java.lang.Object obj51 = hashMap43.put((java.lang.Object) boolean49, (java.lang.Object) false);
        java.lang.Object obj53 = hashMap43.get((java.lang.Object) 'a');
        java.lang.Object obj54 = hashMap35.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap43);
        java.lang.Object obj55 = hashMap19.put((java.lang.Object) 100, (java.lang.Object) (short) 100);
        java.lang.Object obj56 = hashMap11.get((java.lang.Object) hashMap19);
        java.lang.Object obj57 = hashMap3.remove((java.lang.Object) hashMap11);
        system.testclass.HashMap hashMap58 = new system.testclass.HashMap();
        boolean boolean59 = hashMap58.property_2();
        system.testclass.HashMap.Entry[] entryArray60 = hashMap58.table;
        java.lang.Object obj61 = hashMap11.remove((java.lang.Object) hashMap58);
        hashMap58.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap58", hashMap58.property_5());
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray1 = hashMap0.table;
        int int2 = hashMap0.size();
        system.testclass.HashMap.Entry entry3 = null;
        system.testclass.HashMap.Entry[] entryArray4 = new system.testclass.HashMap.Entry[] { entry3 };
        hashMap0.table = entryArray4;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap0", hashMap0.property_5());
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        boolean boolean4 = hashMap0.isEmpty();
        int int5 = hashMap0.size();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry7 = null;
        system.testclass.HashMap.Entry[] entryArray8 = new system.testclass.HashMap.Entry[] { entry7 };
        hashMap6.table = entryArray8;
        boolean boolean10 = hashMap6.isEmpty();
        boolean boolean11 = hashMap6.composedRepOK();
        boolean boolean12 = hashMap6.property_2();
        java.lang.Object obj13 = hashMap0.remove((java.lang.Object) hashMap6);
        hashMap0.modCount = (short) 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap0", hashMap0.property_5());
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) 'a');
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap1", hashMap1.property_5());
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry7 = null;
        system.testclass.HashMap.Entry[] entryArray8 = new system.testclass.HashMap.Entry[] { entry7 };
        hashMap6.table = entryArray8;
        boolean boolean10 = hashMap6.isEmpty();
        boolean boolean11 = hashMap6.composedRepOK();
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray15 = hashMap14.table;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry17 = null;
        system.testclass.HashMap.Entry[] entryArray18 = new system.testclass.HashMap.Entry[] { entry17 };
        hashMap16.table = entryArray18;
        boolean boolean20 = hashMap16.isEmpty();
        java.lang.Object obj22 = hashMap14.put((java.lang.Object) boolean20, (java.lang.Object) false);
        java.lang.Object obj24 = hashMap14.get((java.lang.Object) 'a');
        java.lang.Object obj25 = hashMap6.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap14);
        int int26 = hashMap14.size();
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray28 = hashMap27.table;
        boolean boolean29 = hashMap27.composedRepOK();
        java.lang.Object obj30 = hashMap14.get((java.lang.Object) hashMap27);
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry32 = null;
        system.testclass.HashMap.Entry[] entryArray33 = new system.testclass.HashMap.Entry[] { entry32 };
        hashMap31.table = entryArray33;
        hashMap14.table = entryArray33;
        hashMap14.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap14", hashMap14.property_5());
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (short) 1);
        boolean boolean6 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry8 = null;
        system.testclass.HashMap.Entry[] entryArray9 = new system.testclass.HashMap.Entry[] { entry8 };
        hashMap7.table = entryArray9;
        java.lang.Object obj12 = hashMap7.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry14 = null;
        system.testclass.HashMap.Entry[] entryArray15 = new system.testclass.HashMap.Entry[] { entry14 };
        hashMap13.table = entryArray15;
        boolean boolean17 = hashMap13.isEmpty();
        boolean boolean18 = hashMap13.composedRepOK();
        java.lang.Object obj19 = hashMap7.remove((java.lang.Object) hashMap13);
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray22 = hashMap21.table;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry24 = null;
        system.testclass.HashMap.Entry[] entryArray25 = new system.testclass.HashMap.Entry[] { entry24 };
        hashMap23.table = entryArray25;
        boolean boolean27 = hashMap23.isEmpty();
        java.lang.Object obj29 = hashMap21.put((java.lang.Object) boolean27, (java.lang.Object) false);
        java.lang.Object obj31 = hashMap21.get((java.lang.Object) 'a');
        java.lang.Object obj32 = hashMap13.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap21);
        int int33 = hashMap21.modCount;
        system.testclass.HashMap.Entry[] entryArray34 = hashMap21.table;
        int int35 = hashMap21.size();
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry37 = null;
        system.testclass.HashMap.Entry[] entryArray38 = new system.testclass.HashMap.Entry[] { entry37 };
        hashMap36.table = entryArray38;
        java.lang.Object obj40 = hashMap0.put((java.lang.Object) hashMap21, (java.lang.Object) entryArray38);
        hashMap21.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap21", hashMap21.property_5());
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (short) 1);
        boolean boolean6 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry8 = null;
        system.testclass.HashMap.Entry[] entryArray9 = new system.testclass.HashMap.Entry[] { entry8 };
        hashMap7.table = entryArray9;
        java.lang.Object obj12 = hashMap7.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry14 = null;
        system.testclass.HashMap.Entry[] entryArray15 = new system.testclass.HashMap.Entry[] { entry14 };
        hashMap13.table = entryArray15;
        boolean boolean17 = hashMap13.isEmpty();
        boolean boolean18 = hashMap13.composedRepOK();
        java.lang.Object obj19 = hashMap7.remove((java.lang.Object) hashMap13);
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray22 = hashMap21.table;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry24 = null;
        system.testclass.HashMap.Entry[] entryArray25 = new system.testclass.HashMap.Entry[] { entry24 };
        hashMap23.table = entryArray25;
        boolean boolean27 = hashMap23.isEmpty();
        java.lang.Object obj29 = hashMap21.put((java.lang.Object) boolean27, (java.lang.Object) false);
        java.lang.Object obj31 = hashMap21.get((java.lang.Object) 'a');
        java.lang.Object obj32 = hashMap13.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap21);
        int int33 = hashMap21.modCount;
        system.testclass.HashMap.Entry[] entryArray34 = hashMap21.table;
        int int35 = hashMap21.size();
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry37 = null;
        system.testclass.HashMap.Entry[] entryArray38 = new system.testclass.HashMap.Entry[] { entry37 };
        hashMap36.table = entryArray38;
        java.lang.Object obj40 = hashMap0.put((java.lang.Object) hashMap21, (java.lang.Object) entryArray38);
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap0", hashMap0.property_5());
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 0, 10.0f);
        boolean boolean3 = hashMap2.composedRepOK();
        hashMap2.modCount = 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap2", hashMap2.property_5());
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(10);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry4 = null;
        system.testclass.HashMap.Entry[] entryArray5 = new system.testclass.HashMap.Entry[] { entry4 };
        hashMap3.table = entryArray5;
        java.lang.Object obj8 = hashMap3.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry10 = null;
        system.testclass.HashMap.Entry[] entryArray11 = new system.testclass.HashMap.Entry[] { entry10 };
        hashMap9.table = entryArray11;
        boolean boolean13 = hashMap9.isEmpty();
        boolean boolean14 = hashMap9.composedRepOK();
        java.lang.Object obj15 = hashMap3.remove((java.lang.Object) hashMap9);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray18 = hashMap17.table;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry20 = null;
        system.testclass.HashMap.Entry[] entryArray21 = new system.testclass.HashMap.Entry[] { entry20 };
        hashMap19.table = entryArray21;
        boolean boolean23 = hashMap19.isEmpty();
        java.lang.Object obj25 = hashMap17.put((java.lang.Object) boolean23, (java.lang.Object) false);
        java.lang.Object obj27 = hashMap17.get((java.lang.Object) 'a');
        java.lang.Object obj28 = hashMap9.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap17);
        int int29 = hashMap17.size();
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray31 = hashMap30.table;
        boolean boolean32 = hashMap30.composedRepOK();
        java.lang.Object obj33 = hashMap17.get((java.lang.Object) hashMap30);
        int int34 = hashMap30.modCount;
        java.lang.Object obj35 = hashMap1.put((java.lang.Object) "", (java.lang.Object) int34);
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry37 = null;
        system.testclass.HashMap.Entry[] entryArray38 = new system.testclass.HashMap.Entry[] { entry37 };
        hashMap36.table = entryArray38;
        java.lang.Object obj41 = hashMap36.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry43 = null;
        system.testclass.HashMap.Entry[] entryArray44 = new system.testclass.HashMap.Entry[] { entry43 };
        hashMap42.table = entryArray44;
        boolean boolean46 = hashMap42.isEmpty();
        boolean boolean47 = hashMap42.composedRepOK();
        java.lang.Object obj48 = hashMap36.remove((java.lang.Object) hashMap42);
        system.testclass.HashMap hashMap50 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray51 = hashMap50.table;
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry53 = null;
        system.testclass.HashMap.Entry[] entryArray54 = new system.testclass.HashMap.Entry[] { entry53 };
        hashMap52.table = entryArray54;
        boolean boolean56 = hashMap52.isEmpty();
        java.lang.Object obj58 = hashMap50.put((java.lang.Object) boolean56, (java.lang.Object) false);
        java.lang.Object obj60 = hashMap50.get((java.lang.Object) 'a');
        java.lang.Object obj61 = hashMap42.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap50);
        int int62 = hashMap50.size();
        system.testclass.HashMap hashMap63 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray64 = hashMap63.table;
        boolean boolean65 = hashMap63.composedRepOK();
        java.lang.Object obj66 = hashMap50.get((java.lang.Object) hashMap63);
        java.lang.Object obj67 = hashMap1.get((java.lang.Object) hashMap50);
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap1", hashMap1.property_5());
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap();
        boolean boolean2 = hashMap1.isEmpty();
        boolean boolean3 = hashMap1.isEmpty();
        java.lang.Object obj4 = hashMap0.get((java.lang.Object) boolean3);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray6 = hashMap5.table;
        int int7 = hashMap5.size();
        system.testclass.HashMap.Entry entry8 = null;
        system.testclass.HashMap.Entry[] entryArray9 = new system.testclass.HashMap.Entry[] { entry8 };
        hashMap5.table = entryArray9;
        hashMap0.table = entryArray9;
        hashMap0.modCount = 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap0", hashMap0.property_5());
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(10);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry4 = null;
        system.testclass.HashMap.Entry[] entryArray5 = new system.testclass.HashMap.Entry[] { entry4 };
        hashMap3.table = entryArray5;
        java.lang.Object obj8 = hashMap3.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry10 = null;
        system.testclass.HashMap.Entry[] entryArray11 = new system.testclass.HashMap.Entry[] { entry10 };
        hashMap9.table = entryArray11;
        boolean boolean13 = hashMap9.isEmpty();
        boolean boolean14 = hashMap9.composedRepOK();
        java.lang.Object obj15 = hashMap3.remove((java.lang.Object) hashMap9);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray18 = hashMap17.table;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry20 = null;
        system.testclass.HashMap.Entry[] entryArray21 = new system.testclass.HashMap.Entry[] { entry20 };
        hashMap19.table = entryArray21;
        boolean boolean23 = hashMap19.isEmpty();
        java.lang.Object obj25 = hashMap17.put((java.lang.Object) boolean23, (java.lang.Object) false);
        java.lang.Object obj27 = hashMap17.get((java.lang.Object) 'a');
        java.lang.Object obj28 = hashMap9.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap17);
        int int29 = hashMap17.size();
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray31 = hashMap30.table;
        boolean boolean32 = hashMap30.composedRepOK();
        java.lang.Object obj33 = hashMap17.get((java.lang.Object) hashMap30);
        int int34 = hashMap30.modCount;
        java.lang.Object obj35 = hashMap1.put((java.lang.Object) "", (java.lang.Object) int34);
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry37 = null;
        system.testclass.HashMap.Entry[] entryArray38 = new system.testclass.HashMap.Entry[] { entry37 };
        hashMap36.table = entryArray38;
        java.lang.Object obj41 = hashMap36.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry43 = null;
        system.testclass.HashMap.Entry[] entryArray44 = new system.testclass.HashMap.Entry[] { entry43 };
        hashMap42.table = entryArray44;
        boolean boolean46 = hashMap42.isEmpty();
        boolean boolean47 = hashMap42.composedRepOK();
        java.lang.Object obj48 = hashMap36.remove((java.lang.Object) hashMap42);
        system.testclass.HashMap hashMap50 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray51 = hashMap50.table;
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry53 = null;
        system.testclass.HashMap.Entry[] entryArray54 = new system.testclass.HashMap.Entry[] { entry53 };
        hashMap52.table = entryArray54;
        boolean boolean56 = hashMap52.isEmpty();
        java.lang.Object obj58 = hashMap50.put((java.lang.Object) boolean56, (java.lang.Object) false);
        java.lang.Object obj60 = hashMap50.get((java.lang.Object) 'a');
        java.lang.Object obj61 = hashMap42.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap50);
        int int62 = hashMap50.size();
        system.testclass.HashMap hashMap63 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray64 = hashMap63.table;
        boolean boolean65 = hashMap63.composedRepOK();
        java.lang.Object obj66 = hashMap50.get((java.lang.Object) hashMap63);
        java.lang.Object obj67 = hashMap1.get((java.lang.Object) hashMap50);
        boolean boolean68 = hashMap50.isEmpty();
        hashMap50.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap50", hashMap50.property_5());
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry7 = null;
        system.testclass.HashMap.Entry[] entryArray8 = new system.testclass.HashMap.Entry[] { entry7 };
        hashMap6.table = entryArray8;
        boolean boolean10 = hashMap6.isEmpty();
        boolean boolean11 = hashMap6.composedRepOK();
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray15 = hashMap14.table;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry17 = null;
        system.testclass.HashMap.Entry[] entryArray18 = new system.testclass.HashMap.Entry[] { entry17 };
        hashMap16.table = entryArray18;
        boolean boolean20 = hashMap16.isEmpty();
        java.lang.Object obj22 = hashMap14.put((java.lang.Object) boolean20, (java.lang.Object) false);
        java.lang.Object obj24 = hashMap14.get((java.lang.Object) 'a');
        java.lang.Object obj25 = hashMap6.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap14);
        int int26 = hashMap6.size();
        boolean boolean27 = hashMap6.composedRepOK();
        int int28 = hashMap6.size();
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray31 = hashMap30.table;
        int int32 = hashMap30.modCount;
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry35 = null;
        system.testclass.HashMap.Entry[] entryArray36 = new system.testclass.HashMap.Entry[] { entry35 };
        hashMap34.table = entryArray36;
        java.lang.Object obj39 = hashMap34.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry41 = null;
        system.testclass.HashMap.Entry[] entryArray42 = new system.testclass.HashMap.Entry[] { entry41 };
        hashMap40.table = entryArray42;
        boolean boolean44 = hashMap40.isEmpty();
        boolean boolean45 = hashMap40.composedRepOK();
        java.lang.Object obj46 = hashMap34.remove((java.lang.Object) hashMap40);
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray49 = hashMap48.table;
        system.testclass.HashMap hashMap50 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry51 = null;
        system.testclass.HashMap.Entry[] entryArray52 = new system.testclass.HashMap.Entry[] { entry51 };
        hashMap50.table = entryArray52;
        boolean boolean54 = hashMap50.isEmpty();
        java.lang.Object obj56 = hashMap48.put((java.lang.Object) boolean54, (java.lang.Object) false);
        java.lang.Object obj58 = hashMap48.get((java.lang.Object) 'a');
        java.lang.Object obj59 = hashMap40.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap48);
        int int60 = hashMap48.modCount;
        system.testclass.HashMap.Entry[] entryArray61 = hashMap48.table;
        java.lang.Object obj62 = hashMap30.put((java.lang.Object) ' ', (java.lang.Object) hashMap48);
        system.testclass.HashMap hashMap63 = new system.testclass.HashMap();
        boolean boolean64 = hashMap63.isEmpty();
        boolean boolean65 = hashMap63.isEmpty();
        java.lang.Object obj66 = hashMap48.get((java.lang.Object) boolean65);
        boolean boolean67 = hashMap48.property_2();
        int int68 = hashMap48.modCount;
        system.testclass.HashMap hashMap69 = new system.testclass.HashMap();
        boolean boolean70 = hashMap69.isEmpty();
        system.testclass.HashMap.Entry[] entryArray71 = hashMap69.table;
        boolean boolean72 = hashMap69.composedRepOK();
        java.lang.Object obj73 = hashMap48.remove((java.lang.Object) hashMap69);
        java.lang.Object obj74 = hashMap6.put((java.lang.Object) (byte) 100, (java.lang.Object) hashMap48);
        hashMap48.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap48", hashMap48.property_5());
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry7 = null;
        system.testclass.HashMap.Entry[] entryArray8 = new system.testclass.HashMap.Entry[] { entry7 };
        hashMap6.table = entryArray8;
        boolean boolean10 = hashMap6.isEmpty();
        boolean boolean11 = hashMap6.composedRepOK();
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray15 = hashMap14.table;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry17 = null;
        system.testclass.HashMap.Entry[] entryArray18 = new system.testclass.HashMap.Entry[] { entry17 };
        hashMap16.table = entryArray18;
        boolean boolean20 = hashMap16.isEmpty();
        java.lang.Object obj22 = hashMap14.put((java.lang.Object) boolean20, (java.lang.Object) false);
        java.lang.Object obj24 = hashMap14.get((java.lang.Object) 'a');
        java.lang.Object obj25 = hashMap6.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap14);
        int int26 = hashMap14.size();
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray28 = hashMap27.table;
        boolean boolean29 = hashMap27.composedRepOK();
        java.lang.Object obj30 = hashMap14.get((java.lang.Object) hashMap27);
        int int31 = hashMap27.modCount;
        hashMap27.modCount = (short) 0;
        int int34 = hashMap27.modCount;
        hashMap27.modCount = 2;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap27", hashMap27.property_5());
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(100);
        hashMap1.modCount = (byte) 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap1", hashMap1.property_5());
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry7 = null;
        system.testclass.HashMap.Entry[] entryArray8 = new system.testclass.HashMap.Entry[] { entry7 };
        hashMap6.table = entryArray8;
        boolean boolean10 = hashMap6.isEmpty();
        boolean boolean11 = hashMap6.composedRepOK();
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray15 = hashMap14.table;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry17 = null;
        system.testclass.HashMap.Entry[] entryArray18 = new system.testclass.HashMap.Entry[] { entry17 };
        hashMap16.table = entryArray18;
        boolean boolean20 = hashMap16.isEmpty();
        java.lang.Object obj22 = hashMap14.put((java.lang.Object) boolean20, (java.lang.Object) false);
        java.lang.Object obj24 = hashMap14.get((java.lang.Object) 'a');
        java.lang.Object obj25 = hashMap6.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap14);
        int int26 = hashMap14.size();
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray28 = hashMap27.table;
        boolean boolean29 = hashMap27.composedRepOK();
        java.lang.Object obj30 = hashMap14.get((java.lang.Object) hashMap27);
        int int31 = hashMap27.modCount;
        hashMap27.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap27", hashMap27.property_5());
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry5 = null;
        system.testclass.HashMap.Entry[] entryArray6 = new system.testclass.HashMap.Entry[] { entry5 };
        hashMap4.table = entryArray6;
        boolean boolean8 = hashMap4.isEmpty();
        java.lang.Class<?> wildcardClass9 = hashMap4.getClass();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry11 = null;
        system.testclass.HashMap.Entry[] entryArray12 = new system.testclass.HashMap.Entry[] { entry11 };
        hashMap10.table = entryArray12;
        java.lang.Object obj15 = hashMap10.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry17 = null;
        system.testclass.HashMap.Entry[] entryArray18 = new system.testclass.HashMap.Entry[] { entry17 };
        hashMap16.table = entryArray18;
        boolean boolean20 = hashMap16.isEmpty();
        boolean boolean21 = hashMap16.composedRepOK();
        java.lang.Object obj22 = hashMap10.remove((java.lang.Object) hashMap16);
        java.lang.Object obj23 = hashMap0.put((java.lang.Object) wildcardClass9, (java.lang.Object) hashMap10);
        hashMap0.modCount = (byte) 1;
        hashMap0.modCount = (byte) 100;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap0", hashMap0.property_5());
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry7 = null;
        system.testclass.HashMap.Entry[] entryArray8 = new system.testclass.HashMap.Entry[] { entry7 };
        hashMap6.table = entryArray8;
        boolean boolean10 = hashMap6.isEmpty();
        boolean boolean11 = hashMap6.composedRepOK();
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray15 = hashMap14.table;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry17 = null;
        system.testclass.HashMap.Entry[] entryArray18 = new system.testclass.HashMap.Entry[] { entry17 };
        hashMap16.table = entryArray18;
        boolean boolean20 = hashMap16.isEmpty();
        java.lang.Object obj22 = hashMap14.put((java.lang.Object) boolean20, (java.lang.Object) false);
        java.lang.Object obj24 = hashMap14.get((java.lang.Object) 'a');
        java.lang.Object obj25 = hashMap6.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap14);
        int int26 = hashMap14.size();
        system.testclass.HashMap.Entry[] entryArray27 = hashMap14.table;
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray29 = hashMap28.table;
        int int30 = hashMap28.size();
        boolean boolean31 = hashMap28.property_2();
        java.lang.Object obj32 = hashMap14.remove((java.lang.Object) hashMap28);
        system.testclass.HashMap.Entry[] entryArray33 = hashMap14.table;
        hashMap14.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap14", hashMap14.property_5());
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry7 = null;
        system.testclass.HashMap.Entry[] entryArray8 = new system.testclass.HashMap.Entry[] { entry7 };
        hashMap6.table = entryArray8;
        boolean boolean10 = hashMap6.isEmpty();
        boolean boolean11 = hashMap6.composedRepOK();
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray15 = hashMap14.table;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry17 = null;
        system.testclass.HashMap.Entry[] entryArray18 = new system.testclass.HashMap.Entry[] { entry17 };
        hashMap16.table = entryArray18;
        boolean boolean20 = hashMap16.isEmpty();
        java.lang.Object obj22 = hashMap14.put((java.lang.Object) boolean20, (java.lang.Object) false);
        java.lang.Object obj24 = hashMap14.get((java.lang.Object) 'a');
        java.lang.Object obj25 = hashMap6.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap14);
        int int26 = hashMap14.modCount;
        system.testclass.HashMap.Entry[] entryArray27 = hashMap14.table;
        int int28 = hashMap14.size();
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry30 = null;
        system.testclass.HashMap.Entry[] entryArray31 = new system.testclass.HashMap.Entry[] { entry30 };
        hashMap29.table = entryArray31;
        java.lang.Object obj34 = hashMap29.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry36 = null;
        system.testclass.HashMap.Entry[] entryArray37 = new system.testclass.HashMap.Entry[] { entry36 };
        hashMap35.table = entryArray37;
        boolean boolean39 = hashMap35.isEmpty();
        boolean boolean40 = hashMap35.composedRepOK();
        java.lang.Object obj41 = hashMap29.remove((java.lang.Object) hashMap35);
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray44 = hashMap43.table;
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry46 = null;
        system.testclass.HashMap.Entry[] entryArray47 = new system.testclass.HashMap.Entry[] { entry46 };
        hashMap45.table = entryArray47;
        boolean boolean49 = hashMap45.isEmpty();
        java.lang.Object obj51 = hashMap43.put((java.lang.Object) boolean49, (java.lang.Object) false);
        java.lang.Object obj53 = hashMap43.get((java.lang.Object) 'a');
        java.lang.Object obj54 = hashMap35.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap43);
        int int55 = hashMap43.size();
        system.testclass.HashMap.Entry[] entryArray56 = hashMap43.table;
        hashMap14.table = entryArray56;
        java.lang.Object obj59 = hashMap14.remove((java.lang.Object) (-1.0d));
        hashMap14.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap14", hashMap14.property_5());
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry7 = null;
        system.testclass.HashMap.Entry[] entryArray8 = new system.testclass.HashMap.Entry[] { entry7 };
        hashMap6.table = entryArray8;
        boolean boolean10 = hashMap6.isEmpty();
        boolean boolean11 = hashMap6.composedRepOK();
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray15 = hashMap14.table;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry17 = null;
        system.testclass.HashMap.Entry[] entryArray18 = new system.testclass.HashMap.Entry[] { entry17 };
        hashMap16.table = entryArray18;
        boolean boolean20 = hashMap16.isEmpty();
        java.lang.Object obj22 = hashMap14.put((java.lang.Object) boolean20, (java.lang.Object) false);
        java.lang.Object obj24 = hashMap14.get((java.lang.Object) 'a');
        java.lang.Object obj25 = hashMap6.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap14);
        int int26 = hashMap14.modCount;
        system.testclass.HashMap.Entry[] entryArray27 = hashMap14.table;
        boolean boolean28 = hashMap14.composedRepOK();
        hashMap14.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap14", hashMap14.property_5());
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry5 = null;
        system.testclass.HashMap.Entry[] entryArray6 = new system.testclass.HashMap.Entry[] { entry5 };
        hashMap4.table = entryArray6;
        boolean boolean8 = hashMap4.isEmpty();
        java.lang.Class<?> wildcardClass9 = hashMap4.getClass();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry11 = null;
        system.testclass.HashMap.Entry[] entryArray12 = new system.testclass.HashMap.Entry[] { entry11 };
        hashMap10.table = entryArray12;
        java.lang.Object obj15 = hashMap10.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry17 = null;
        system.testclass.HashMap.Entry[] entryArray18 = new system.testclass.HashMap.Entry[] { entry17 };
        hashMap16.table = entryArray18;
        boolean boolean20 = hashMap16.isEmpty();
        boolean boolean21 = hashMap16.composedRepOK();
        java.lang.Object obj22 = hashMap10.remove((java.lang.Object) hashMap16);
        java.lang.Object obj23 = hashMap0.put((java.lang.Object) wildcardClass9, (java.lang.Object) hashMap10);
        boolean boolean24 = hashMap10.isEmpty();
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry26 = null;
        system.testclass.HashMap.Entry[] entryArray27 = new system.testclass.HashMap.Entry[] { entry26 };
        hashMap25.table = entryArray27;
        java.lang.Object obj30 = hashMap25.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry32 = null;
        system.testclass.HashMap.Entry[] entryArray33 = new system.testclass.HashMap.Entry[] { entry32 };
        hashMap31.table = entryArray33;
        boolean boolean35 = hashMap31.isEmpty();
        boolean boolean36 = hashMap31.composedRepOK();
        java.lang.Object obj37 = hashMap25.remove((java.lang.Object) hashMap31);
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray40 = hashMap39.table;
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry42 = null;
        system.testclass.HashMap.Entry[] entryArray43 = new system.testclass.HashMap.Entry[] { entry42 };
        hashMap41.table = entryArray43;
        boolean boolean45 = hashMap41.isEmpty();
        java.lang.Object obj47 = hashMap39.put((java.lang.Object) boolean45, (java.lang.Object) false);
        java.lang.Object obj49 = hashMap39.get((java.lang.Object) 'a');
        java.lang.Object obj50 = hashMap31.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap39);
        int int51 = hashMap39.size();
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray53 = hashMap52.table;
        boolean boolean54 = hashMap52.composedRepOK();
        java.lang.Object obj55 = hashMap39.get((java.lang.Object) hashMap52);
        int int56 = hashMap52.modCount;
        system.testclass.HashMap hashMap57 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry58 = null;
        system.testclass.HashMap.Entry[] entryArray59 = new system.testclass.HashMap.Entry[] { entry58 };
        hashMap57.table = entryArray59;
        java.lang.Object obj62 = hashMap57.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap.Entry[] entryArray63 = hashMap57.table;
        hashMap52.table = entryArray63;
        java.lang.Object obj65 = hashMap10.get((java.lang.Object) hashMap52);
        hashMap10.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap10", hashMap10.property_5());
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry7 = null;
        system.testclass.HashMap.Entry[] entryArray8 = new system.testclass.HashMap.Entry[] { entry7 };
        hashMap6.table = entryArray8;
        boolean boolean10 = hashMap6.isEmpty();
        boolean boolean11 = hashMap6.composedRepOK();
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray15 = hashMap14.table;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry17 = null;
        system.testclass.HashMap.Entry[] entryArray18 = new system.testclass.HashMap.Entry[] { entry17 };
        hashMap16.table = entryArray18;
        boolean boolean20 = hashMap16.isEmpty();
        java.lang.Object obj22 = hashMap14.put((java.lang.Object) boolean20, (java.lang.Object) false);
        java.lang.Object obj24 = hashMap14.get((java.lang.Object) 'a');
        java.lang.Object obj25 = hashMap6.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap14);
        int int26 = hashMap14.modCount;
        system.testclass.HashMap.Entry[] entryArray27 = hashMap14.table;
        java.lang.Object obj29 = hashMap14.get((java.lang.Object) 1.0f);
        java.lang.Object obj31 = hashMap14.get((java.lang.Object) "hi!");
        int int32 = hashMap14.modCount;
        java.lang.Object obj33 = null;
        java.lang.Object obj35 = hashMap14.put(obj33, (java.lang.Object) 1L);
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap(100);
        java.lang.Object obj38 = hashMap14.remove((java.lang.Object) 100);
        boolean boolean39 = hashMap14.composedRepOK();
        boolean boolean40 = hashMap14.property_2();
        int int41 = hashMap14.size();
        hashMap14.modCount = 0;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap14", hashMap14.property_5());
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        boolean boolean4 = hashMap0.isEmpty();
        system.testclass.HashMap.Entry[] entryArray5 = new system.testclass.HashMap.Entry[] {};
        hashMap0.table = entryArray5;
        system.testclass.HashMap.Entry[] entryArray7 = hashMap0.table;
        int int8 = hashMap0.size();
        hashMap0.modCount = 1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap0", hashMap0.property_5());
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry7 = null;
        system.testclass.HashMap.Entry[] entryArray8 = new system.testclass.HashMap.Entry[] { entry7 };
        hashMap6.table = entryArray8;
        boolean boolean10 = hashMap6.isEmpty();
        boolean boolean11 = hashMap6.composedRepOK();
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray15 = hashMap14.table;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry17 = null;
        system.testclass.HashMap.Entry[] entryArray18 = new system.testclass.HashMap.Entry[] { entry17 };
        hashMap16.table = entryArray18;
        boolean boolean20 = hashMap16.isEmpty();
        java.lang.Object obj22 = hashMap14.put((java.lang.Object) boolean20, (java.lang.Object) false);
        java.lang.Object obj24 = hashMap14.get((java.lang.Object) 'a');
        java.lang.Object obj25 = hashMap6.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap14);
        int int26 = hashMap14.modCount;
        system.testclass.HashMap.Entry[] entryArray27 = hashMap14.table;
        int int28 = hashMap14.size();
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry30 = null;
        system.testclass.HashMap.Entry[] entryArray31 = new system.testclass.HashMap.Entry[] { entry30 };
        hashMap29.table = entryArray31;
        java.lang.Object obj34 = hashMap29.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry36 = null;
        system.testclass.HashMap.Entry[] entryArray37 = new system.testclass.HashMap.Entry[] { entry36 };
        hashMap35.table = entryArray37;
        boolean boolean39 = hashMap35.isEmpty();
        boolean boolean40 = hashMap35.composedRepOK();
        java.lang.Object obj41 = hashMap29.remove((java.lang.Object) hashMap35);
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray44 = hashMap43.table;
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry46 = null;
        system.testclass.HashMap.Entry[] entryArray47 = new system.testclass.HashMap.Entry[] { entry46 };
        hashMap45.table = entryArray47;
        boolean boolean49 = hashMap45.isEmpty();
        java.lang.Object obj51 = hashMap43.put((java.lang.Object) boolean49, (java.lang.Object) false);
        java.lang.Object obj53 = hashMap43.get((java.lang.Object) 'a');
        java.lang.Object obj54 = hashMap35.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap43);
        int int55 = hashMap43.size();
        system.testclass.HashMap.Entry[] entryArray56 = hashMap43.table;
        hashMap14.table = entryArray56;
        boolean boolean58 = hashMap14.property_2();
        int int59 = hashMap14.size();
        hashMap14.modCount = (byte) 0;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap14", hashMap14.property_5());
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry5 = null;
        system.testclass.HashMap.Entry[] entryArray6 = new system.testclass.HashMap.Entry[] { entry5 };
        hashMap4.table = entryArray6;
        boolean boolean8 = hashMap4.isEmpty();
        java.lang.Class<?> wildcardClass9 = hashMap4.getClass();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry11 = null;
        system.testclass.HashMap.Entry[] entryArray12 = new system.testclass.HashMap.Entry[] { entry11 };
        hashMap10.table = entryArray12;
        java.lang.Object obj15 = hashMap10.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry17 = null;
        system.testclass.HashMap.Entry[] entryArray18 = new system.testclass.HashMap.Entry[] { entry17 };
        hashMap16.table = entryArray18;
        boolean boolean20 = hashMap16.isEmpty();
        boolean boolean21 = hashMap16.composedRepOK();
        java.lang.Object obj22 = hashMap10.remove((java.lang.Object) hashMap16);
        java.lang.Object obj23 = hashMap0.put((java.lang.Object) wildcardClass9, (java.lang.Object) hashMap10);
        system.testclass.HashMap.Entry[] entryArray24 = hashMap10.table;
        int int25 = hashMap10.modCount;
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry27 = null;
        system.testclass.HashMap.Entry[] entryArray28 = new system.testclass.HashMap.Entry[] { entry27 };
        hashMap26.table = entryArray28;
        java.lang.Object obj30 = hashMap10.get((java.lang.Object) hashMap26);
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray32 = hashMap31.table;
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry34 = null;
        system.testclass.HashMap.Entry[] entryArray35 = new system.testclass.HashMap.Entry[] { entry34 };
        hashMap33.table = entryArray35;
        boolean boolean37 = hashMap33.isEmpty();
        java.lang.Object obj39 = hashMap31.put((java.lang.Object) boolean37, (java.lang.Object) false);
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray41 = hashMap40.table;
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry43 = null;
        system.testclass.HashMap.Entry[] entryArray44 = new system.testclass.HashMap.Entry[] { entry43 };
        hashMap42.table = entryArray44;
        boolean boolean46 = hashMap42.isEmpty();
        java.lang.Object obj48 = hashMap40.put((java.lang.Object) boolean46, (java.lang.Object) false);
        java.lang.Object obj50 = hashMap40.get((java.lang.Object) 'a');
        int int51 = hashMap40.size();
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry53 = null;
        system.testclass.HashMap.Entry[] entryArray54 = new system.testclass.HashMap.Entry[] { entry53 };
        hashMap52.table = entryArray54;
        java.lang.Object obj57 = hashMap52.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap58 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry59 = null;
        system.testclass.HashMap.Entry[] entryArray60 = new system.testclass.HashMap.Entry[] { entry59 };
        hashMap58.table = entryArray60;
        boolean boolean62 = hashMap58.isEmpty();
        boolean boolean63 = hashMap58.composedRepOK();
        java.lang.Object obj64 = hashMap52.remove((java.lang.Object) hashMap58);
        system.testclass.HashMap hashMap66 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray67 = hashMap66.table;
        system.testclass.HashMap hashMap68 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry69 = null;
        system.testclass.HashMap.Entry[] entryArray70 = new system.testclass.HashMap.Entry[] { entry69 };
        hashMap68.table = entryArray70;
        boolean boolean72 = hashMap68.isEmpty();
        java.lang.Object obj74 = hashMap66.put((java.lang.Object) boolean72, (java.lang.Object) false);
        java.lang.Object obj76 = hashMap66.get((java.lang.Object) 'a');
        java.lang.Object obj77 = hashMap58.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap66);
        int int78 = hashMap66.size();
        system.testclass.HashMap.Entry[] entryArray79 = hashMap66.table;
        hashMap40.table = entryArray79;
        hashMap31.table = entryArray79;
        java.lang.Object obj82 = hashMap26.get((java.lang.Object) hashMap31);
        hashMap26.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap26", hashMap26.property_5());
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray1 = hashMap0.table;
        int int2 = hashMap0.modCount;
        hashMap0.modCount = (short) 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap0", hashMap0.property_5());
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(10);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry4 = null;
        system.testclass.HashMap.Entry[] entryArray5 = new system.testclass.HashMap.Entry[] { entry4 };
        hashMap3.table = entryArray5;
        java.lang.Object obj8 = hashMap3.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry10 = null;
        system.testclass.HashMap.Entry[] entryArray11 = new system.testclass.HashMap.Entry[] { entry10 };
        hashMap9.table = entryArray11;
        boolean boolean13 = hashMap9.isEmpty();
        boolean boolean14 = hashMap9.composedRepOK();
        java.lang.Object obj15 = hashMap3.remove((java.lang.Object) hashMap9);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray18 = hashMap17.table;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry20 = null;
        system.testclass.HashMap.Entry[] entryArray21 = new system.testclass.HashMap.Entry[] { entry20 };
        hashMap19.table = entryArray21;
        boolean boolean23 = hashMap19.isEmpty();
        java.lang.Object obj25 = hashMap17.put((java.lang.Object) boolean23, (java.lang.Object) false);
        java.lang.Object obj27 = hashMap17.get((java.lang.Object) 'a');
        java.lang.Object obj28 = hashMap9.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap17);
        int int29 = hashMap17.size();
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray31 = hashMap30.table;
        boolean boolean32 = hashMap30.composedRepOK();
        java.lang.Object obj33 = hashMap17.get((java.lang.Object) hashMap30);
        int int34 = hashMap30.modCount;
        java.lang.Object obj35 = hashMap1.put((java.lang.Object) "", (java.lang.Object) int34);
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry37 = null;
        system.testclass.HashMap.Entry[] entryArray38 = new system.testclass.HashMap.Entry[] { entry37 };
        hashMap36.table = entryArray38;
        boolean boolean40 = hashMap36.isEmpty();
        system.testclass.HashMap.Entry[] entryArray41 = hashMap36.table;
        boolean boolean42 = hashMap36.composedRepOK();
        java.lang.Object obj43 = hashMap1.remove((java.lang.Object) hashMap36);
        boolean boolean44 = hashMap36.composedRepOK();
        hashMap36.modCount = 'a';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap36", hashMap36.property_5());
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray1 = hashMap0.table;
        int int2 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (-1L));
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry7 = null;
        system.testclass.HashMap.Entry[] entryArray8 = new system.testclass.HashMap.Entry[] { entry7 };
        hashMap6.table = entryArray8;
        java.lang.Object obj11 = hashMap6.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap.Entry[] entryArray12 = hashMap6.table;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry14 = null;
        system.testclass.HashMap.Entry[] entryArray15 = new system.testclass.HashMap.Entry[] { entry14 };
        hashMap13.table = entryArray15;
        boolean boolean17 = hashMap13.isEmpty();
        java.lang.Class<?> wildcardClass18 = hashMap13.getClass();
        java.lang.Object obj19 = hashMap6.get((java.lang.Object) hashMap13);
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry22 = null;
        system.testclass.HashMap.Entry[] entryArray23 = new system.testclass.HashMap.Entry[] { entry22 };
        hashMap21.table = entryArray23;
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry26 = null;
        system.testclass.HashMap.Entry[] entryArray27 = new system.testclass.HashMap.Entry[] { entry26 };
        hashMap25.table = entryArray27;
        boolean boolean29 = hashMap25.isEmpty();
        java.lang.Class<?> wildcardClass30 = hashMap25.getClass();
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry32 = null;
        system.testclass.HashMap.Entry[] entryArray33 = new system.testclass.HashMap.Entry[] { entry32 };
        hashMap31.table = entryArray33;
        java.lang.Object obj36 = hashMap31.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry38 = null;
        system.testclass.HashMap.Entry[] entryArray39 = new system.testclass.HashMap.Entry[] { entry38 };
        hashMap37.table = entryArray39;
        boolean boolean41 = hashMap37.isEmpty();
        boolean boolean42 = hashMap37.composedRepOK();
        java.lang.Object obj43 = hashMap31.remove((java.lang.Object) hashMap37);
        java.lang.Object obj44 = hashMap21.put((java.lang.Object) wildcardClass30, (java.lang.Object) hashMap31);
        system.testclass.HashMap.Entry[] entryArray45 = hashMap31.table;
        int int46 = hashMap31.size();
        java.lang.Object obj47 = hashMap6.put((java.lang.Object) 10.0d, (java.lang.Object) int46);
        boolean boolean48 = hashMap6.composedRepOK();
        system.testclass.HashMap hashMap49 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry50 = null;
        system.testclass.HashMap.Entry[] entryArray51 = new system.testclass.HashMap.Entry[] { entry50 };
        hashMap49.table = entryArray51;
        boolean boolean53 = hashMap49.isEmpty();
        system.testclass.HashMap.Entry[] entryArray54 = hashMap49.table;
        hashMap6.table = entryArray54;
        boolean boolean56 = hashMap6.isEmpty();
        java.lang.Object obj57 = hashMap0.remove((java.lang.Object) hashMap6);
        boolean boolean58 = hashMap6.isEmpty();
        hashMap6.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap6", hashMap6.property_5());
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry7 = null;
        system.testclass.HashMap.Entry[] entryArray8 = new system.testclass.HashMap.Entry[] { entry7 };
        hashMap6.table = entryArray8;
        boolean boolean10 = hashMap6.isEmpty();
        boolean boolean11 = hashMap6.composedRepOK();
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray15 = hashMap14.table;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry17 = null;
        system.testclass.HashMap.Entry[] entryArray18 = new system.testclass.HashMap.Entry[] { entry17 };
        hashMap16.table = entryArray18;
        boolean boolean20 = hashMap16.isEmpty();
        java.lang.Object obj22 = hashMap14.put((java.lang.Object) boolean20, (java.lang.Object) false);
        java.lang.Object obj24 = hashMap14.get((java.lang.Object) 'a');
        java.lang.Object obj25 = hashMap6.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap14);
        int int26 = hashMap6.size();
        boolean boolean27 = hashMap6.composedRepOK();
        boolean boolean28 = hashMap6.composedRepOK();
        system.testclass.HashMap.Entry[] entryArray29 = hashMap6.table;
        hashMap6.modCount = 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap6", hashMap6.property_5());
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray1 = hashMap0.table;
        int int2 = hashMap0.size();
        boolean boolean3 = hashMap0.property_2();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry5 = null;
        system.testclass.HashMap.Entry[] entryArray6 = new system.testclass.HashMap.Entry[] { entry5 };
        hashMap4.table = entryArray6;
        java.lang.Object obj9 = hashMap4.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry11 = null;
        system.testclass.HashMap.Entry[] entryArray12 = new system.testclass.HashMap.Entry[] { entry11 };
        hashMap10.table = entryArray12;
        boolean boolean14 = hashMap10.isEmpty();
        boolean boolean15 = hashMap10.composedRepOK();
        java.lang.Object obj16 = hashMap4.remove((java.lang.Object) hashMap10);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray19 = hashMap18.table;
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry21 = null;
        system.testclass.HashMap.Entry[] entryArray22 = new system.testclass.HashMap.Entry[] { entry21 };
        hashMap20.table = entryArray22;
        boolean boolean24 = hashMap20.isEmpty();
        java.lang.Object obj26 = hashMap18.put((java.lang.Object) boolean24, (java.lang.Object) false);
        java.lang.Object obj28 = hashMap18.get((java.lang.Object) 'a');
        java.lang.Object obj29 = hashMap10.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap18);
        java.lang.Object obj30 = hashMap0.remove((java.lang.Object) (short) 100);
        hashMap0.modCount = ' ';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap0", hashMap0.property_5());
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray1 = hashMap0.table;
        int int2 = hashMap0.modCount;
        int int3 = hashMap0.modCount;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap0", hashMap0.property_5());
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry7 = null;
        system.testclass.HashMap.Entry[] entryArray8 = new system.testclass.HashMap.Entry[] { entry7 };
        hashMap6.table = entryArray8;
        boolean boolean10 = hashMap6.isEmpty();
        boolean boolean11 = hashMap6.composedRepOK();
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray15 = hashMap14.table;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry17 = null;
        system.testclass.HashMap.Entry[] entryArray18 = new system.testclass.HashMap.Entry[] { entry17 };
        hashMap16.table = entryArray18;
        boolean boolean20 = hashMap16.isEmpty();
        java.lang.Object obj22 = hashMap14.put((java.lang.Object) boolean20, (java.lang.Object) false);
        java.lang.Object obj24 = hashMap14.get((java.lang.Object) 'a');
        java.lang.Object obj25 = hashMap6.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap14);
        int int26 = hashMap14.size();
        system.testclass.HashMap.Entry[] entryArray27 = hashMap14.table;
        boolean boolean28 = hashMap14.composedRepOK();
        hashMap14.modCount = 1;
        boolean boolean31 = hashMap14.composedRepOK();
        hashMap14.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap14", hashMap14.property_5());
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry7 = null;
        system.testclass.HashMap.Entry[] entryArray8 = new system.testclass.HashMap.Entry[] { entry7 };
        hashMap6.table = entryArray8;
        boolean boolean10 = hashMap6.isEmpty();
        boolean boolean11 = hashMap6.composedRepOK();
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray15 = hashMap14.table;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry17 = null;
        system.testclass.HashMap.Entry[] entryArray18 = new system.testclass.HashMap.Entry[] { entry17 };
        hashMap16.table = entryArray18;
        boolean boolean20 = hashMap16.isEmpty();
        java.lang.Object obj22 = hashMap14.put((java.lang.Object) boolean20, (java.lang.Object) false);
        java.lang.Object obj24 = hashMap14.get((java.lang.Object) 'a');
        java.lang.Object obj25 = hashMap6.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap14);
        int int26 = hashMap14.modCount;
        system.testclass.HashMap.Entry[] entryArray27 = hashMap14.table;
        int int28 = hashMap14.size();
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry30 = null;
        system.testclass.HashMap.Entry[] entryArray31 = new system.testclass.HashMap.Entry[] { entry30 };
        hashMap29.table = entryArray31;
        java.lang.Object obj34 = hashMap29.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry36 = null;
        system.testclass.HashMap.Entry[] entryArray37 = new system.testclass.HashMap.Entry[] { entry36 };
        hashMap35.table = entryArray37;
        boolean boolean39 = hashMap35.isEmpty();
        boolean boolean40 = hashMap35.composedRepOK();
        java.lang.Object obj41 = hashMap29.remove((java.lang.Object) hashMap35);
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray44 = hashMap43.table;
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry46 = null;
        system.testclass.HashMap.Entry[] entryArray47 = new system.testclass.HashMap.Entry[] { entry46 };
        hashMap45.table = entryArray47;
        boolean boolean49 = hashMap45.isEmpty();
        java.lang.Object obj51 = hashMap43.put((java.lang.Object) boolean49, (java.lang.Object) false);
        java.lang.Object obj53 = hashMap43.get((java.lang.Object) 'a');
        java.lang.Object obj54 = hashMap35.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap43);
        int int55 = hashMap43.size();
        system.testclass.HashMap.Entry[] entryArray56 = hashMap43.table;
        hashMap14.table = entryArray56;
        boolean boolean58 = hashMap14.property_2();
        int int59 = hashMap14.size();
        hashMap14.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap14", hashMap14.property_5());
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap.Entry[] entryArray6 = hashMap0.table;
        int int7 = hashMap0.modCount;
        boolean boolean8 = hashMap0.composedRepOK();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap(10);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry13 = null;
        system.testclass.HashMap.Entry[] entryArray14 = new system.testclass.HashMap.Entry[] { entry13 };
        hashMap12.table = entryArray14;
        java.lang.Object obj17 = hashMap12.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry19 = null;
        system.testclass.HashMap.Entry[] entryArray20 = new system.testclass.HashMap.Entry[] { entry19 };
        hashMap18.table = entryArray20;
        boolean boolean22 = hashMap18.isEmpty();
        boolean boolean23 = hashMap18.composedRepOK();
        java.lang.Object obj24 = hashMap12.remove((java.lang.Object) hashMap18);
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray27 = hashMap26.table;
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry29 = null;
        system.testclass.HashMap.Entry[] entryArray30 = new system.testclass.HashMap.Entry[] { entry29 };
        hashMap28.table = entryArray30;
        boolean boolean32 = hashMap28.isEmpty();
        java.lang.Object obj34 = hashMap26.put((java.lang.Object) boolean32, (java.lang.Object) false);
        java.lang.Object obj36 = hashMap26.get((java.lang.Object) 'a');
        java.lang.Object obj37 = hashMap18.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap26);
        int int38 = hashMap26.size();
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray40 = hashMap39.table;
        boolean boolean41 = hashMap39.composedRepOK();
        java.lang.Object obj42 = hashMap26.get((java.lang.Object) hashMap39);
        int int43 = hashMap39.modCount;
        java.lang.Object obj44 = hashMap10.put((java.lang.Object) "", (java.lang.Object) int43);
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry46 = null;
        system.testclass.HashMap.Entry[] entryArray47 = new system.testclass.HashMap.Entry[] { entry46 };
        hashMap45.table = entryArray47;
        boolean boolean49 = hashMap45.isEmpty();
        system.testclass.HashMap.Entry[] entryArray50 = hashMap45.table;
        boolean boolean51 = hashMap45.composedRepOK();
        java.lang.Object obj52 = hashMap10.remove((java.lang.Object) hashMap45);
        java.lang.Object obj53 = hashMap0.get((java.lang.Object) hashMap10);
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap0", hashMap0.property_5());
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry7 = null;
        system.testclass.HashMap.Entry[] entryArray8 = new system.testclass.HashMap.Entry[] { entry7 };
        hashMap6.table = entryArray8;
        boolean boolean10 = hashMap6.isEmpty();
        boolean boolean11 = hashMap6.composedRepOK();
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray15 = hashMap14.table;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry17 = null;
        system.testclass.HashMap.Entry[] entryArray18 = new system.testclass.HashMap.Entry[] { entry17 };
        hashMap16.table = entryArray18;
        boolean boolean20 = hashMap16.isEmpty();
        java.lang.Object obj22 = hashMap14.put((java.lang.Object) boolean20, (java.lang.Object) false);
        java.lang.Object obj24 = hashMap14.get((java.lang.Object) 'a');
        java.lang.Object obj25 = hashMap6.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap14);
        int int26 = hashMap14.size();
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray28 = hashMap27.table;
        boolean boolean29 = hashMap27.composedRepOK();
        java.lang.Object obj30 = hashMap14.get((java.lang.Object) hashMap27);
        int int31 = hashMap27.modCount;
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry33 = null;
        system.testclass.HashMap.Entry[] entryArray34 = new system.testclass.HashMap.Entry[] { entry33 };
        hashMap32.table = entryArray34;
        java.lang.Object obj37 = hashMap32.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap.Entry[] entryArray38 = hashMap32.table;
        hashMap27.table = entryArray38;
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry41 = null;
        system.testclass.HashMap.Entry[] entryArray42 = new system.testclass.HashMap.Entry[] { entry41 };
        hashMap40.table = entryArray42;
        java.lang.Object obj45 = hashMap40.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap46 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry47 = null;
        system.testclass.HashMap.Entry[] entryArray48 = new system.testclass.HashMap.Entry[] { entry47 };
        hashMap46.table = entryArray48;
        boolean boolean50 = hashMap46.isEmpty();
        boolean boolean51 = hashMap46.composedRepOK();
        java.lang.Object obj52 = hashMap40.remove((java.lang.Object) hashMap46);
        system.testclass.HashMap hashMap54 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray55 = hashMap54.table;
        system.testclass.HashMap hashMap56 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry57 = null;
        system.testclass.HashMap.Entry[] entryArray58 = new system.testclass.HashMap.Entry[] { entry57 };
        hashMap56.table = entryArray58;
        boolean boolean60 = hashMap56.isEmpty();
        java.lang.Object obj62 = hashMap54.put((java.lang.Object) boolean60, (java.lang.Object) false);
        java.lang.Object obj64 = hashMap54.get((java.lang.Object) 'a');
        java.lang.Object obj65 = hashMap46.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap54);
        int int66 = hashMap54.size();
        system.testclass.HashMap.Entry[] entryArray67 = hashMap54.table;
        system.testclass.HashMap hashMap68 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry69 = null;
        system.testclass.HashMap.Entry[] entryArray70 = new system.testclass.HashMap.Entry[] { entry69 };
        hashMap68.table = entryArray70;
        boolean boolean72 = hashMap68.isEmpty();
        system.testclass.HashMap.Entry[] entryArray73 = hashMap68.table;
        java.lang.Object obj74 = hashMap27.put((java.lang.Object) entryArray67, (java.lang.Object) entryArray73);
        hashMap27.modCount = 0;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap27", hashMap27.property_5());
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) ' ', (float) 'a');
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap2", hashMap2.property_5());
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(100, (float) (short) 100);
        hashMap2.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap2", hashMap2.property_5());
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry7 = null;
        system.testclass.HashMap.Entry[] entryArray8 = new system.testclass.HashMap.Entry[] { entry7 };
        hashMap6.table = entryArray8;
        boolean boolean10 = hashMap6.isEmpty();
        boolean boolean11 = hashMap6.composedRepOK();
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray15 = hashMap14.table;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry17 = null;
        system.testclass.HashMap.Entry[] entryArray18 = new system.testclass.HashMap.Entry[] { entry17 };
        hashMap16.table = entryArray18;
        boolean boolean20 = hashMap16.isEmpty();
        java.lang.Object obj22 = hashMap14.put((java.lang.Object) boolean20, (java.lang.Object) false);
        java.lang.Object obj24 = hashMap14.get((java.lang.Object) 'a');
        java.lang.Object obj25 = hashMap6.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap14);
        int int26 = hashMap14.modCount;
        system.testclass.HashMap.Entry[] entryArray27 = hashMap14.table;
        java.lang.Object obj29 = hashMap14.get((java.lang.Object) 1.0f);
        java.lang.Object obj31 = hashMap14.get((java.lang.Object) "hi!");
        int int32 = hashMap14.modCount;
        java.lang.Object obj33 = null;
        java.lang.Object obj35 = hashMap14.put(obj33, (java.lang.Object) 1L);
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap(100);
        java.lang.Object obj38 = hashMap14.remove((java.lang.Object) 100);
        boolean boolean39 = hashMap14.composedRepOK();
        boolean boolean40 = hashMap14.property_2();
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray42 = hashMap41.table;
        int int43 = hashMap41.size();
        system.testclass.HashMap.Entry entry44 = null;
        system.testclass.HashMap.Entry[] entryArray45 = new system.testclass.HashMap.Entry[] { entry44 };
        hashMap41.table = entryArray45;
        system.testclass.HashMap.Entry[] entryArray47 = hashMap41.table;
        hashMap14.table = entryArray47;
        hashMap14.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap14", hashMap14.property_5());
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        boolean boolean4 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry7 = null;
        system.testclass.HashMap.Entry[] entryArray8 = new system.testclass.HashMap.Entry[] { entry7 };
        hashMap6.table = entryArray8;
        java.lang.Object obj11 = hashMap6.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap.Entry[] entryArray12 = hashMap6.table;
        boolean boolean13 = hashMap6.property_2();
        boolean boolean14 = hashMap6.isEmpty();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry16 = null;
        system.testclass.HashMap.Entry[] entryArray17 = new system.testclass.HashMap.Entry[] { entry16 };
        hashMap15.table = entryArray17;
        java.lang.Object obj20 = hashMap15.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry22 = null;
        system.testclass.HashMap.Entry[] entryArray23 = new system.testclass.HashMap.Entry[] { entry22 };
        hashMap21.table = entryArray23;
        boolean boolean25 = hashMap21.isEmpty();
        boolean boolean26 = hashMap21.composedRepOK();
        java.lang.Object obj27 = hashMap15.remove((java.lang.Object) hashMap21);
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray30 = hashMap29.table;
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry32 = null;
        system.testclass.HashMap.Entry[] entryArray33 = new system.testclass.HashMap.Entry[] { entry32 };
        hashMap31.table = entryArray33;
        boolean boolean35 = hashMap31.isEmpty();
        java.lang.Object obj37 = hashMap29.put((java.lang.Object) boolean35, (java.lang.Object) false);
        java.lang.Object obj39 = hashMap29.get((java.lang.Object) 'a');
        java.lang.Object obj40 = hashMap21.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap29);
        int int41 = hashMap29.size();
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray43 = hashMap42.table;
        boolean boolean44 = hashMap42.composedRepOK();
        java.lang.Object obj45 = hashMap29.get((java.lang.Object) hashMap42);
        java.lang.Object obj46 = hashMap6.remove((java.lang.Object) hashMap42);
        java.lang.Object obj48 = hashMap6.get((java.lang.Object) '#');
        java.lang.Object obj49 = hashMap0.put((java.lang.Object) 100.0f, obj48);
        hashMap0.modCount = 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap0", hashMap0.property_5());
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '#', (float) ' ');
        hashMap2.modCount = '4';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap2", hashMap2.property_5());
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry5 = null;
        system.testclass.HashMap.Entry[] entryArray6 = new system.testclass.HashMap.Entry[] { entry5 };
        hashMap4.table = entryArray6;
        boolean boolean8 = hashMap4.isEmpty();
        java.lang.Class<?> wildcardClass9 = hashMap4.getClass();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry11 = null;
        system.testclass.HashMap.Entry[] entryArray12 = new system.testclass.HashMap.Entry[] { entry11 };
        hashMap10.table = entryArray12;
        java.lang.Object obj15 = hashMap10.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry17 = null;
        system.testclass.HashMap.Entry[] entryArray18 = new system.testclass.HashMap.Entry[] { entry17 };
        hashMap16.table = entryArray18;
        boolean boolean20 = hashMap16.isEmpty();
        boolean boolean21 = hashMap16.composedRepOK();
        java.lang.Object obj22 = hashMap10.remove((java.lang.Object) hashMap16);
        java.lang.Object obj23 = hashMap0.put((java.lang.Object) wildcardClass9, (java.lang.Object) hashMap10);
        int int24 = hashMap0.modCount;
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap((int) '4');
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry28 = null;
        system.testclass.HashMap.Entry[] entryArray29 = new system.testclass.HashMap.Entry[] { entry28 };
        hashMap27.table = entryArray29;
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry32 = null;
        system.testclass.HashMap.Entry[] entryArray33 = new system.testclass.HashMap.Entry[] { entry32 };
        hashMap31.table = entryArray33;
        boolean boolean35 = hashMap31.isEmpty();
        java.lang.Class<?> wildcardClass36 = hashMap31.getClass();
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry38 = null;
        system.testclass.HashMap.Entry[] entryArray39 = new system.testclass.HashMap.Entry[] { entry38 };
        hashMap37.table = entryArray39;
        java.lang.Object obj42 = hashMap37.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry44 = null;
        system.testclass.HashMap.Entry[] entryArray45 = new system.testclass.HashMap.Entry[] { entry44 };
        hashMap43.table = entryArray45;
        boolean boolean47 = hashMap43.isEmpty();
        boolean boolean48 = hashMap43.composedRepOK();
        java.lang.Object obj49 = hashMap37.remove((java.lang.Object) hashMap43);
        java.lang.Object obj50 = hashMap27.put((java.lang.Object) wildcardClass36, (java.lang.Object) hashMap37);
        system.testclass.HashMap.Entry[] entryArray51 = hashMap37.table;
        hashMap26.table = entryArray51;
        int int53 = hashMap26.modCount;
        java.lang.Object obj54 = null;
        system.testclass.HashMap hashMap55 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray56 = hashMap55.table;
        java.lang.Object obj57 = hashMap26.put(obj54, (java.lang.Object) entryArray56);
        hashMap0.table = entryArray56;
        int int59 = hashMap0.modCount;
        hashMap0.modCount = '4';
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap0", hashMap0.property_5());
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry7 = null;
        system.testclass.HashMap.Entry[] entryArray8 = new system.testclass.HashMap.Entry[] { entry7 };
        hashMap6.table = entryArray8;
        boolean boolean10 = hashMap6.isEmpty();
        boolean boolean11 = hashMap6.composedRepOK();
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray15 = hashMap14.table;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry17 = null;
        system.testclass.HashMap.Entry[] entryArray18 = new system.testclass.HashMap.Entry[] { entry17 };
        hashMap16.table = entryArray18;
        boolean boolean20 = hashMap16.isEmpty();
        java.lang.Object obj22 = hashMap14.put((java.lang.Object) boolean20, (java.lang.Object) false);
        java.lang.Object obj24 = hashMap14.get((java.lang.Object) 'a');
        java.lang.Object obj25 = hashMap6.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap14);
        int int26 = hashMap6.size();
        boolean boolean27 = hashMap6.composedRepOK();
        hashMap6.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap6", hashMap6.property_5());
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry7 = null;
        system.testclass.HashMap.Entry[] entryArray8 = new system.testclass.HashMap.Entry[] { entry7 };
        hashMap6.table = entryArray8;
        boolean boolean10 = hashMap6.isEmpty();
        boolean boolean11 = hashMap6.composedRepOK();
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap6);
        int int13 = hashMap0.modCount;
        boolean boolean14 = hashMap0.property_2();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry16 = null;
        system.testclass.HashMap.Entry[] entryArray17 = new system.testclass.HashMap.Entry[] { entry16 };
        hashMap15.table = entryArray17;
        java.lang.Object obj20 = hashMap15.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry22 = null;
        system.testclass.HashMap.Entry[] entryArray23 = new system.testclass.HashMap.Entry[] { entry22 };
        hashMap21.table = entryArray23;
        boolean boolean25 = hashMap21.isEmpty();
        boolean boolean26 = hashMap21.composedRepOK();
        java.lang.Object obj27 = hashMap15.remove((java.lang.Object) hashMap21);
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray30 = hashMap29.table;
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry32 = null;
        system.testclass.HashMap.Entry[] entryArray33 = new system.testclass.HashMap.Entry[] { entry32 };
        hashMap31.table = entryArray33;
        boolean boolean35 = hashMap31.isEmpty();
        java.lang.Object obj37 = hashMap29.put((java.lang.Object) boolean35, (java.lang.Object) false);
        java.lang.Object obj39 = hashMap29.get((java.lang.Object) 'a');
        java.lang.Object obj40 = hashMap21.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap29);
        int int41 = hashMap29.modCount;
        system.testclass.HashMap.Entry[] entryArray42 = hashMap29.table;
        java.lang.Object obj44 = hashMap29.get((java.lang.Object) 1.0f);
        java.lang.Object obj46 = hashMap29.get((java.lang.Object) "hi!");
        int int47 = hashMap29.modCount;
        java.lang.Object obj48 = null;
        java.lang.Object obj50 = hashMap29.put(obj48, (java.lang.Object) 1L);
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap(100);
        java.lang.Object obj53 = hashMap29.remove((java.lang.Object) 100);
        boolean boolean54 = hashMap29.composedRepOK();
        boolean boolean55 = hashMap29.property_2();
        system.testclass.HashMap hashMap56 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray57 = hashMap56.table;
        int int58 = hashMap56.size();
        system.testclass.HashMap.Entry entry59 = null;
        system.testclass.HashMap.Entry[] entryArray60 = new system.testclass.HashMap.Entry[] { entry59 };
        hashMap56.table = entryArray60;
        system.testclass.HashMap.Entry[] entryArray62 = hashMap56.table;
        hashMap29.table = entryArray62;
        java.lang.Object obj64 = hashMap0.get((java.lang.Object) hashMap29);
        int int65 = hashMap29.modCount;
        hashMap29.modCount = 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap29", hashMap29.property_5());
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry5 = null;
        system.testclass.HashMap.Entry[] entryArray6 = new system.testclass.HashMap.Entry[] { entry5 };
        hashMap4.table = entryArray6;
        boolean boolean8 = hashMap4.isEmpty();
        java.lang.Class<?> wildcardClass9 = hashMap4.getClass();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry11 = null;
        system.testclass.HashMap.Entry[] entryArray12 = new system.testclass.HashMap.Entry[] { entry11 };
        hashMap10.table = entryArray12;
        java.lang.Object obj15 = hashMap10.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry17 = null;
        system.testclass.HashMap.Entry[] entryArray18 = new system.testclass.HashMap.Entry[] { entry17 };
        hashMap16.table = entryArray18;
        boolean boolean20 = hashMap16.isEmpty();
        boolean boolean21 = hashMap16.composedRepOK();
        java.lang.Object obj22 = hashMap10.remove((java.lang.Object) hashMap16);
        java.lang.Object obj23 = hashMap0.put((java.lang.Object) wildcardClass9, (java.lang.Object) hashMap10);
        system.testclass.HashMap.Entry[] entryArray24 = hashMap10.table;
        hashMap10.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap10", hashMap10.property_5());
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry5 = null;
        system.testclass.HashMap.Entry[] entryArray6 = new system.testclass.HashMap.Entry[] { entry5 };
        hashMap4.table = entryArray6;
        boolean boolean8 = hashMap4.isEmpty();
        java.lang.Class<?> wildcardClass9 = hashMap4.getClass();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry11 = null;
        system.testclass.HashMap.Entry[] entryArray12 = new system.testclass.HashMap.Entry[] { entry11 };
        hashMap10.table = entryArray12;
        java.lang.Object obj15 = hashMap10.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry17 = null;
        system.testclass.HashMap.Entry[] entryArray18 = new system.testclass.HashMap.Entry[] { entry17 };
        hashMap16.table = entryArray18;
        boolean boolean20 = hashMap16.isEmpty();
        boolean boolean21 = hashMap16.composedRepOK();
        java.lang.Object obj22 = hashMap10.remove((java.lang.Object) hashMap16);
        java.lang.Object obj23 = hashMap0.put((java.lang.Object) wildcardClass9, (java.lang.Object) hashMap10);
        int int24 = hashMap0.modCount;
        hashMap0.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap0", hashMap0.property_5());
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 0, 10.0f);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray4 = hashMap3.table;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry6 = null;
        system.testclass.HashMap.Entry[] entryArray7 = new system.testclass.HashMap.Entry[] { entry6 };
        hashMap5.table = entryArray7;
        boolean boolean9 = hashMap5.isEmpty();
        java.lang.Object obj11 = hashMap3.put((java.lang.Object) boolean9, (java.lang.Object) false);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray13 = hashMap12.table;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry15 = null;
        system.testclass.HashMap.Entry[] entryArray16 = new system.testclass.HashMap.Entry[] { entry15 };
        hashMap14.table = entryArray16;
        boolean boolean18 = hashMap14.isEmpty();
        java.lang.Object obj20 = hashMap12.put((java.lang.Object) boolean18, (java.lang.Object) false);
        java.lang.Object obj22 = hashMap12.get((java.lang.Object) 'a');
        int int23 = hashMap12.size();
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry25 = null;
        system.testclass.HashMap.Entry[] entryArray26 = new system.testclass.HashMap.Entry[] { entry25 };
        hashMap24.table = entryArray26;
        java.lang.Object obj29 = hashMap24.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry31 = null;
        system.testclass.HashMap.Entry[] entryArray32 = new system.testclass.HashMap.Entry[] { entry31 };
        hashMap30.table = entryArray32;
        boolean boolean34 = hashMap30.isEmpty();
        boolean boolean35 = hashMap30.composedRepOK();
        java.lang.Object obj36 = hashMap24.remove((java.lang.Object) hashMap30);
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray39 = hashMap38.table;
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry41 = null;
        system.testclass.HashMap.Entry[] entryArray42 = new system.testclass.HashMap.Entry[] { entry41 };
        hashMap40.table = entryArray42;
        boolean boolean44 = hashMap40.isEmpty();
        java.lang.Object obj46 = hashMap38.put((java.lang.Object) boolean44, (java.lang.Object) false);
        java.lang.Object obj48 = hashMap38.get((java.lang.Object) 'a');
        java.lang.Object obj49 = hashMap30.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap38);
        int int50 = hashMap38.size();
        system.testclass.HashMap.Entry[] entryArray51 = hashMap38.table;
        hashMap12.table = entryArray51;
        hashMap3.table = entryArray51;
        java.lang.Object obj54 = hashMap2.remove((java.lang.Object) hashMap3);
        hashMap3.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap3", hashMap3.property_5());
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry7 = null;
        system.testclass.HashMap.Entry[] entryArray8 = new system.testclass.HashMap.Entry[] { entry7 };
        hashMap6.table = entryArray8;
        boolean boolean10 = hashMap6.isEmpty();
        boolean boolean11 = hashMap6.composedRepOK();
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap6);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray15 = hashMap14.table;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry17 = null;
        system.testclass.HashMap.Entry[] entryArray18 = new system.testclass.HashMap.Entry[] { entry17 };
        hashMap16.table = entryArray18;
        boolean boolean20 = hashMap16.isEmpty();
        java.lang.Object obj22 = hashMap14.put((java.lang.Object) boolean20, (java.lang.Object) false);
        java.lang.Object obj24 = hashMap14.get((java.lang.Object) 'a');
        java.lang.Object obj25 = hashMap6.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap14);
        int int26 = hashMap14.modCount;
        system.testclass.HashMap.Entry[] entryArray27 = hashMap14.table;
        java.lang.Object obj29 = hashMap14.get((java.lang.Object) 1.0f);
        java.lang.Object obj31 = hashMap14.get((java.lang.Object) "hi!");
        int int32 = hashMap14.modCount;
        java.lang.Object obj33 = null;
        java.lang.Object obj35 = hashMap14.put(obj33, (java.lang.Object) 1L);
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap(100);
        java.lang.Object obj38 = hashMap14.remove((java.lang.Object) 100);
        boolean boolean39 = hashMap14.composedRepOK();
        boolean boolean40 = hashMap14.property_2();
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray42 = hashMap41.table;
        int int43 = hashMap41.size();
        system.testclass.HashMap.Entry entry44 = null;
        system.testclass.HashMap.Entry[] entryArray45 = new system.testclass.HashMap.Entry[] { entry44 };
        hashMap41.table = entryArray45;
        system.testclass.HashMap.Entry[] entryArray47 = hashMap41.table;
        hashMap14.table = entryArray47;
        int int49 = hashMap14.modCount;
        hashMap14.modCount = 0;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap14", hashMap14.property_5());
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) 'a');
        boolean boolean2 = hashMap1.composedRepOK();
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry4 = null;
        system.testclass.HashMap.Entry[] entryArray5 = new system.testclass.HashMap.Entry[] { entry4 };
        hashMap3.table = entryArray5;
        java.lang.Object obj8 = hashMap3.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry10 = null;
        system.testclass.HashMap.Entry[] entryArray11 = new system.testclass.HashMap.Entry[] { entry10 };
        hashMap9.table = entryArray11;
        boolean boolean13 = hashMap9.isEmpty();
        boolean boolean14 = hashMap9.composedRepOK();
        java.lang.Object obj15 = hashMap3.remove((java.lang.Object) hashMap9);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray18 = hashMap17.table;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry20 = null;
        system.testclass.HashMap.Entry[] entryArray21 = new system.testclass.HashMap.Entry[] { entry20 };
        hashMap19.table = entryArray21;
        boolean boolean23 = hashMap19.isEmpty();
        java.lang.Object obj25 = hashMap17.put((java.lang.Object) boolean23, (java.lang.Object) false);
        java.lang.Object obj27 = hashMap17.get((java.lang.Object) 'a');
        java.lang.Object obj28 = hashMap9.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap17);
        int int29 = hashMap17.size();
        system.testclass.HashMap.Entry[] entryArray30 = hashMap17.table;
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry32 = null;
        system.testclass.HashMap.Entry[] entryArray33 = new system.testclass.HashMap.Entry[] { entry32 };
        hashMap31.table = entryArray33;
        java.lang.Object obj36 = hashMap31.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry38 = null;
        system.testclass.HashMap.Entry[] entryArray39 = new system.testclass.HashMap.Entry[] { entry38 };
        hashMap37.table = entryArray39;
        boolean boolean41 = hashMap37.isEmpty();
        boolean boolean42 = hashMap37.composedRepOK();
        java.lang.Object obj43 = hashMap31.remove((java.lang.Object) hashMap37);
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray46 = hashMap45.table;
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry48 = null;
        system.testclass.HashMap.Entry[] entryArray49 = new system.testclass.HashMap.Entry[] { entry48 };
        hashMap47.table = entryArray49;
        boolean boolean51 = hashMap47.isEmpty();
        java.lang.Object obj53 = hashMap45.put((java.lang.Object) boolean51, (java.lang.Object) false);
        java.lang.Object obj55 = hashMap45.get((java.lang.Object) 'a');
        java.lang.Object obj56 = hashMap37.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap45);
        int int57 = hashMap45.modCount;
        system.testclass.HashMap.Entry[] entryArray58 = hashMap45.table;
        java.lang.Object obj59 = hashMap1.put((java.lang.Object) hashMap17, (java.lang.Object) hashMap45);
        hashMap45.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap45", hashMap45.property_5());
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 1);
        java.lang.Object obj2 = null;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry4 = null;
        system.testclass.HashMap.Entry[] entryArray5 = new system.testclass.HashMap.Entry[] { entry4 };
        hashMap3.table = entryArray5;
        java.lang.Object obj8 = hashMap3.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry10 = null;
        system.testclass.HashMap.Entry[] entryArray11 = new system.testclass.HashMap.Entry[] { entry10 };
        hashMap9.table = entryArray11;
        boolean boolean13 = hashMap9.isEmpty();
        boolean boolean14 = hashMap9.composedRepOK();
        java.lang.Object obj15 = hashMap3.remove((java.lang.Object) hashMap9);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray18 = hashMap17.table;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry20 = null;
        system.testclass.HashMap.Entry[] entryArray21 = new system.testclass.HashMap.Entry[] { entry20 };
        hashMap19.table = entryArray21;
        boolean boolean23 = hashMap19.isEmpty();
        java.lang.Object obj25 = hashMap17.put((java.lang.Object) boolean23, (java.lang.Object) false);
        java.lang.Object obj27 = hashMap17.get((java.lang.Object) 'a');
        java.lang.Object obj28 = hashMap9.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap17);
        int int29 = hashMap17.size();
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray31 = hashMap30.table;
        boolean boolean32 = hashMap30.composedRepOK();
        java.lang.Object obj33 = hashMap17.get((java.lang.Object) hashMap30);
        int int34 = hashMap30.modCount;
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry36 = null;
        system.testclass.HashMap.Entry[] entryArray37 = new system.testclass.HashMap.Entry[] { entry36 };
        hashMap35.table = entryArray37;
        java.lang.Object obj40 = hashMap35.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap.Entry[] entryArray41 = hashMap35.table;
        hashMap30.table = entryArray41;
        boolean boolean43 = hashMap30.property_2();
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry45 = null;
        system.testclass.HashMap.Entry[] entryArray46 = new system.testclass.HashMap.Entry[] { entry45 };
        hashMap44.table = entryArray46;
        java.lang.Object obj49 = hashMap44.remove((java.lang.Object) (short) 1);
        system.testclass.HashMap hashMap50 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry51 = null;
        system.testclass.HashMap.Entry[] entryArray52 = new system.testclass.HashMap.Entry[] { entry51 };
        hashMap50.table = entryArray52;
        boolean boolean54 = hashMap50.isEmpty();
        boolean boolean55 = hashMap50.composedRepOK();
        java.lang.Object obj56 = hashMap44.remove((java.lang.Object) hashMap50);
        system.testclass.HashMap hashMap58 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray59 = hashMap58.table;
        system.testclass.HashMap hashMap60 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry61 = null;
        system.testclass.HashMap.Entry[] entryArray62 = new system.testclass.HashMap.Entry[] { entry61 };
        hashMap60.table = entryArray62;
        boolean boolean64 = hashMap60.isEmpty();
        java.lang.Object obj66 = hashMap58.put((java.lang.Object) boolean64, (java.lang.Object) false);
        java.lang.Object obj68 = hashMap58.get((java.lang.Object) 'a');
        java.lang.Object obj69 = hashMap50.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap58);
        int int70 = hashMap58.size();
        system.testclass.HashMap.Entry[] entryArray71 = hashMap58.table;
        system.testclass.HashMap.Entry[] entryArray72 = hashMap58.table;
        java.lang.Object obj73 = hashMap30.remove((java.lang.Object) entryArray72);
        java.lang.Object obj74 = hashMap1.put(obj2, (java.lang.Object) entryArray72);
        hashMap1.clear();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap1", hashMap1.property_5());
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        boolean boolean4 = hashMap0.isEmpty();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap0.table;
        boolean boolean6 = hashMap0.composedRepOK();
        hashMap0.modCount = (short) 10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_5) for hashMap0", hashMap0.property_5());
    }
}

