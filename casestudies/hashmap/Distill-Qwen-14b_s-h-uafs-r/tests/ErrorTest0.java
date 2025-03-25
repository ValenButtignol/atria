import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray1 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap0.table = entryArray1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        system.classfixer.classes.HashMap.Entry[] entryArray4 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap0.table = entryArray4;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        system.classfixer.classes.HashMap.Entry entry4 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray5 = new system.classfixer.classes.HashMap.Entry[] { entry4 };
        hashMap0.table = entryArray5;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap1.table = entryArray3;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap.Entry entry2 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray3 = new system.classfixer.classes.HashMap.Entry[] { entry2 };
        hashMap1.table = entryArray3;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray2 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap1.table = entryArray2;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        system.classfixer.classes.HashMap.Entry[] entryArray2 = null;
        hashMap1.table = entryArray2;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        hashMap0.clear();
        hashMap0.clear();
        java.lang.Object obj8 = hashMap0.put((java.lang.Object) (short) 10, (java.lang.Object) 100.0d);
        java.lang.Object obj10 = hashMap0.get((java.lang.Object) (-1.0d));
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap12.table;
        hashMap0.table = entryArray13;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(1, (float) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray1 = hashMap0.table;
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) (short) -1);
        system.classfixer.classes.HashMap.Entry[] entryArray4 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap0.table = entryArray4;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(4, 100.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) '#');
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap3.table;
        int int5 = hashMap3.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap3.table;
        int int7 = hashMap3.size();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap3.table;
        hashMap1.table = entryArray8;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(100, (float) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        hashMap0.clear();
        boolean boolean5 = hashMap0.isEmpty();
        hashMap0.clear();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap8.table;
        hashMap0.table = entryArray9;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 1, (float) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(0, (float) 4);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        hashMap0.clear();
        hashMap0.clear();
        hashMap0.modCount = (short) 100;
        boolean boolean8 = hashMap0.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap0.table = entryArray9;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        hashMap0.clear();
        boolean boolean5 = hashMap0.isEmpty();
        int int6 = hashMap0.modCount;
        hashMap0.clear();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.repOK();
        int int10 = hashMap8.size();
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = hashMap8.remove(obj11);
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        java.lang.Object obj17 = hashMap14.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        hashMap14.clear();
        boolean boolean19 = hashMap14.isEmpty();
        hashMap14.clear();
        java.lang.Object obj21 = hashMap8.put((java.lang.Object) '#', (java.lang.Object) hashMap14);
        hashMap8.clear();
        java.lang.Object obj23 = hashMap0.remove((java.lang.Object) hashMap8);
        system.classfixer.classes.HashMap.Entry[] entryArray24 = null;
        hashMap8.table = entryArray24;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap8", hashMap8.repOK_2());
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        int int2 = hashMap0.size();
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = hashMap0.remove(obj3);
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        java.lang.Object obj9 = hashMap6.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        hashMap6.clear();
        boolean boolean11 = hashMap6.isEmpty();
        hashMap6.clear();
        java.lang.Object obj13 = hashMap0.put((java.lang.Object) '#', (java.lang.Object) hashMap6);
        hashMap6.modCount = '#';
        boolean boolean16 = hashMap6.isEmpty();
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap18.table;
        hashMap6.table = entryArray19;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap6", hashMap6.repOK_2());
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        int int2 = hashMap0.size();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap5.table;
        int int7 = hashMap5.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap5.table;
        hashMap0.table = entryArray8;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 100, (float) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(2, 10.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) ' ', (float) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap3.table;
        java.lang.Class<?> wildcardClass5 = entryArray4.getClass();
        java.lang.Object obj6 = hashMap1.put((java.lang.Object) (short) 100, (java.lang.Object) wildcardClass5);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap8.table;
        hashMap1.table = entryArray9;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(0, (float) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap2.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        hashMap2.clear();
        boolean boolean7 = hashMap2.isEmpty();
        hashMap2.clear();
        java.lang.Object obj9 = hashMap0.put((java.lang.Object) false, (java.lang.Object) hashMap2);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int12 = hashMap11.size();
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Object obj14 = hashMap11.remove(obj13);
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap16.table;
        hashMap11.table = entryArray17;
        hashMap2.table = entryArray17;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(0, 10.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(4);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap3.table;
        int int5 = hashMap3.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap3.table;
        hashMap1.table = entryArray6;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray2 = null;
        hashMap1.table = entryArray2;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        hashMap0.clear();
        hashMap0.clear();
        java.lang.Object obj8 = hashMap0.put((java.lang.Object) (short) 10, (java.lang.Object) 100.0d);
        java.lang.Object obj10 = hashMap0.get((java.lang.Object) (-1.0d));
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap0.table;
        int int12 = hashMap0.modCount;
        int int13 = hashMap0.modCount;
        int int14 = hashMap0.modCount;
        boolean boolean15 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        java.lang.Object obj19 = hashMap16.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        hashMap16.clear();
        hashMap16.clear();
        java.lang.Object obj24 = hashMap16.put((java.lang.Object) (short) 10, (java.lang.Object) 100.0d);
        java.lang.Object obj26 = hashMap16.get((java.lang.Object) (-1.0d));
        system.classfixer.classes.HashMap.Entry[] entryArray27 = hashMap16.table;
        int int28 = hashMap16.modCount;
        int int29 = hashMap16.modCount;
        int int30 = hashMap16.modCount;
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap();
        java.lang.Object obj34 = hashMap31.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        hashMap31.clear();
        java.lang.Object obj36 = new java.lang.Object();
        java.lang.Object obj38 = hashMap31.put(obj36, (java.lang.Object) 100);
        system.classfixer.classes.HashMap hashMap39 = new system.classfixer.classes.HashMap();
        java.lang.Object obj42 = hashMap39.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        hashMap39.clear();
        java.lang.Object obj44 = new java.lang.Object();
        java.lang.Object obj46 = hashMap39.put(obj44, (java.lang.Object) 100);
        hashMap39.modCount = (short) 0;
        int int49 = hashMap39.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray50 = hashMap39.table;
        java.lang.Object obj51 = null;
        java.lang.Object obj52 = hashMap31.put((java.lang.Object) entryArray50, obj51);
        hashMap16.table = entryArray50;
        hashMap16.modCount = 4;
        java.lang.Object obj56 = hashMap0.get((java.lang.Object) hashMap16);
        hashMap0.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 10, (float) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int5 = hashMap4.size();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap4.table;
        java.lang.Object obj7 = hashMap1.put((java.lang.Object) (short) 10, (java.lang.Object) hashMap4);
        boolean boolean8 = hashMap4.isEmpty();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int11 = hashMap10.size();
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Object obj13 = hashMap10.remove(obj12);
        java.lang.Object obj14 = hashMap4.remove(obj13);
        hashMap4.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap4", hashMap4.repOK_2());
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        int int2 = hashMap0.size();
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = hashMap0.remove(obj3);
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        java.lang.Object obj9 = hashMap6.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        hashMap6.clear();
        boolean boolean11 = hashMap6.isEmpty();
        hashMap6.clear();
        java.lang.Object obj13 = hashMap0.put((java.lang.Object) '#', (java.lang.Object) hashMap6);
        int int14 = hashMap6.modCount;
        boolean boolean15 = hashMap6.isEmpty();
        system.classfixer.classes.HashMap.Entry entry16 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray17 = new system.classfixer.classes.HashMap.Entry[] { entry16 };
        hashMap6.table = entryArray17;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap6", hashMap6.repOK_2());
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int2 = hashMap1.size();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = null;
        hashMap1.table = entryArray3;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(2, (float) 100L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) 'a', 10.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap3.table;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) (short) 10);
        int int7 = hashMap6.size();
        hashMap6.modCount = 2;
        java.lang.Object obj11 = hashMap3.put((java.lang.Object) hashMap6, (java.lang.Object) true);
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap3.table;
        hashMap0.table = entryArray12;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        hashMap0.clear();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object obj7 = hashMap0.put(obj5, (java.lang.Object) 100);
        hashMap0.modCount = (short) 0;
        int int10 = hashMap0.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        java.lang.Object obj15 = hashMap12.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        hashMap12.clear();
        hashMap12.clear();
        java.lang.Object obj20 = hashMap12.put((java.lang.Object) (short) 10, (java.lang.Object) 100.0d);
        java.lang.Object obj22 = hashMap12.get((java.lang.Object) (-1.0d));
        hashMap12.clear();
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap();
        java.lang.Object obj27 = hashMap24.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        hashMap24.clear();
        hashMap24.clear();
        java.lang.Object obj32 = hashMap24.put((java.lang.Object) (short) 10, (java.lang.Object) 100.0d);
        java.lang.Object obj34 = hashMap24.get((java.lang.Object) (-1.0d));
        system.classfixer.classes.HashMap.Entry[] entryArray35 = hashMap24.table;
        hashMap12.table = entryArray35;
        system.classfixer.classes.HashMap.Entry[] entryArray37 = hashMap12.table;
        java.lang.Object obj38 = hashMap0.get((java.lang.Object) hashMap12);
        hashMap0.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        int int2 = hashMap0.size();
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = hashMap0.remove(obj3);
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        java.lang.Object obj9 = hashMap6.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        hashMap6.clear();
        boolean boolean11 = hashMap6.isEmpty();
        hashMap6.clear();
        java.lang.Object obj13 = hashMap0.put((java.lang.Object) '#', (java.lang.Object) hashMap6);
        int int14 = hashMap6.modCount;
        hashMap6.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap6", hashMap6.repOK_2());
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) '#', (float) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(0, (float) 5);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 100, (float) 2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        hashMap0.clear();
        hashMap0.clear();
        java.lang.Object obj8 = hashMap0.put((java.lang.Object) (short) 10, (java.lang.Object) 100.0d);
        java.lang.Object obj10 = hashMap0.get((java.lang.Object) (-1.0d));
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap0.table;
        int int12 = hashMap0.modCount;
        int int13 = hashMap0.modCount;
        int int14 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        java.lang.Object obj18 = hashMap15.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        hashMap15.clear();
        java.lang.Object obj20 = new java.lang.Object();
        java.lang.Object obj22 = hashMap15.put(obj20, (java.lang.Object) 100);
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap();
        java.lang.Object obj26 = hashMap23.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        hashMap23.clear();
        java.lang.Object obj28 = new java.lang.Object();
        java.lang.Object obj30 = hashMap23.put(obj28, (java.lang.Object) 100);
        hashMap23.modCount = (short) 0;
        int int33 = hashMap23.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray34 = hashMap23.table;
        java.lang.Object obj35 = null;
        java.lang.Object obj36 = hashMap15.put((java.lang.Object) entryArray34, obj35);
        hashMap0.table = entryArray34;
        hashMap0.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(5, (float) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap4.table;
        int int6 = hashMap4.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap4.table;
        hashMap1.table = entryArray7;
        hashMap1.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 0, (float) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(100, (float) 1L);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (short) 10);
        int int5 = hashMap4.modCount;
        java.lang.Object obj6 = hashMap2.remove((java.lang.Object) hashMap4);
        hashMap2.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 100, (float) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) 'a', (float) 3);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        hashMap0.clear();
        java.lang.Object obj5 = new java.lang.Object();
        java.lang.Object obj7 = hashMap0.put(obj5, (java.lang.Object) 100);
        hashMap0.modCount = (short) 0;
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap11.table;
        hashMap0.table = entryArray12;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap1.table;
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (short) 10);
        int int5 = hashMap4.size();
        hashMap4.modCount = 2;
        java.lang.Object obj9 = hashMap1.put((java.lang.Object) hashMap4, (java.lang.Object) true);
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap1.table;
        boolean boolean11 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        java.lang.Object obj15 = hashMap12.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        hashMap12.clear();
        hashMap12.clear();
        hashMap12.modCount = (short) 100;
        boolean boolean20 = hashMap12.repOK();
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray23 = hashMap22.table;
        int int24 = hashMap22.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray25 = hashMap22.table;
        int int26 = hashMap22.size();
        system.classfixer.classes.HashMap.Entry[] entryArray27 = hashMap22.table;
        java.lang.Object obj28 = hashMap12.remove((java.lang.Object) entryArray27);
        hashMap1.table = entryArray27;
        int int30 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap((int) (byte) 1, (float) 1);
        java.lang.Object obj35 = hashMap33.get((java.lang.Object) 'a');
        java.lang.Object obj38 = hashMap33.put((java.lang.Object) 'a', (java.lang.Object) 'a');
        system.classfixer.classes.HashMap hashMap40 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap40.clear();
        system.classfixer.classes.HashMap hashMap43 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray44 = hashMap43.table;
        int int45 = hashMap43.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray46 = hashMap43.table;
        hashMap40.table = entryArray46;
        hashMap33.table = entryArray46;
        system.classfixer.classes.HashMap hashMap50 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray51 = hashMap50.table;
        int int52 = hashMap50.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray53 = hashMap50.table;
        int int54 = hashMap50.size();
        system.classfixer.classes.HashMap.Entry[] entryArray55 = hashMap50.table;
        int int56 = hashMap50.modCount;
        java.lang.Object obj57 = hashMap1.put((java.lang.Object) hashMap33, (java.lang.Object) hashMap50);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(100, (float) 1L);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj7 = hashMap4.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        hashMap4.clear();
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object obj11 = hashMap4.put(obj9, (java.lang.Object) 100);
        hashMap4.modCount = (short) 0;
        int int14 = hashMap4.modCount;
        java.lang.Object obj15 = hashMap3.get((java.lang.Object) int14);
        int int16 = hashMap3.modCount;
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        java.lang.Object obj21 = hashMap18.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        hashMap18.clear();
        java.lang.Object obj23 = new java.lang.Object();
        java.lang.Object obj25 = hashMap18.put(obj23, (java.lang.Object) 100);
        hashMap18.modCount = (short) 0;
        int int28 = hashMap18.modCount;
        java.lang.Object obj29 = hashMap17.get((java.lang.Object) int28);
        int int30 = hashMap17.modCount;
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap();
        boolean boolean32 = hashMap31.repOK();
        int int33 = hashMap31.size();
        java.lang.Object obj34 = null;
        java.lang.Object obj35 = hashMap31.remove(obj34);
        java.lang.Object obj36 = hashMap3.put((java.lang.Object) int30, (java.lang.Object) hashMap31);
        system.classfixer.classes.HashMap hashMap38 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray39 = hashMap38.table;
        system.classfixer.classes.HashMap.Entry[] entryArray40 = hashMap38.table;
        java.lang.Object obj41 = hashMap3.remove((java.lang.Object) entryArray40);
        hashMap2.table = entryArray40;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(0, (float) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        hashMap0.clear();
        hashMap0.clear();
        java.lang.Object obj8 = hashMap0.put((java.lang.Object) (short) 10, (java.lang.Object) 100.0d);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap10.table;
        int int12 = hashMap10.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap10.table;
        int int14 = hashMap10.size();
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap10.table;
        hashMap0.table = entryArray15;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        hashMap0.clear();
        hashMap0.clear();
        java.lang.Object obj8 = hashMap0.put((java.lang.Object) (short) 10, (java.lang.Object) 100.0d);
        java.lang.Object obj10 = hashMap0.get((java.lang.Object) (-1.0d));
        boolean boolean11 = hashMap0.isEmpty();
        hashMap0.clear();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int15 = hashMap14.size();
        boolean boolean16 = hashMap14.isEmpty();
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry entry19 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray20 = new system.classfixer.classes.HashMap.Entry[] { entry19 };
        hashMap18.table = entryArray20;
        hashMap14.table = entryArray20;
        system.classfixer.classes.HashMap.Entry[] entryArray23 = hashMap14.table;
        hashMap0.table = entryArray23;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 10, (float) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(5, 10.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj3 = hashMap0.get((java.lang.Object) 'a');
        boolean boolean4 = hashMap0.isEmpty();
        int int5 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        java.lang.Object obj9 = hashMap6.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        hashMap6.clear();
        hashMap6.clear();
        java.lang.Object obj14 = hashMap6.put((java.lang.Object) (short) 10, (java.lang.Object) 100.0d);
        java.lang.Object obj16 = hashMap6.get((java.lang.Object) (-1.0d));
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap6.table;
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int20 = hashMap19.size();
        java.lang.Object obj21 = new java.lang.Object();
        java.lang.Object obj22 = hashMap19.remove(obj21);
        java.lang.Object obj23 = hashMap6.get((java.lang.Object) hashMap19);
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int26 = hashMap25.size();
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Object obj28 = hashMap25.remove(obj27);
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray31 = hashMap30.table;
        hashMap25.table = entryArray31;
        java.lang.Object obj33 = hashMap19.remove((java.lang.Object) hashMap25);
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray36 = hashMap35.table;
        int int37 = hashMap35.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray38 = hashMap35.table;
        hashMap25.table = entryArray38;
        system.classfixer.classes.HashMap hashMap41 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int42 = hashMap41.size();
        java.lang.Object obj43 = new java.lang.Object();
        java.lang.Object obj44 = hashMap41.remove(obj43);
        system.classfixer.classes.HashMap hashMap46 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray47 = hashMap46.table;
        hashMap41.table = entryArray47;
        hashMap25.table = entryArray47;
        hashMap0.table = entryArray47;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(0, (float) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 1, (float) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap4.table;
        int int6 = hashMap4.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap4.table;
        hashMap1.table = entryArray7;
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = hashMap1.get(obj9);
        java.lang.Object obj12 = hashMap1.get((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap.Entry[] entryArray13 = null;
        hashMap1.table = entryArray13;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap1.table;
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap4.table;
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (short) 10);
        int int8 = hashMap7.modCount;
        java.lang.Object obj9 = hashMap1.put((java.lang.Object) hashMap4, (java.lang.Object) int8);
        hashMap4.clear();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        java.lang.Object obj14 = hashMap11.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        hashMap11.clear();
        java.lang.Object obj16 = hashMap4.remove((java.lang.Object) hashMap11);
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        java.lang.Object obj20 = hashMap17.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        hashMap17.clear();
        java.lang.Object obj22 = new java.lang.Object();
        java.lang.Object obj24 = hashMap17.put(obj22, (java.lang.Object) 100);
        hashMap17.modCount = (short) 0;
        int int27 = hashMap17.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray28 = hashMap17.table;
        int int29 = hashMap17.size();
        boolean boolean30 = hashMap17.isEmpty();
        java.lang.Object obj31 = hashMap11.remove((java.lang.Object) boolean30);
        boolean boolean32 = hashMap11.isEmpty();
        system.classfixer.classes.HashMap hashMap34 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap34.clear();
        java.lang.Object obj37 = hashMap34.remove((java.lang.Object) 0.0f);
        java.lang.Object obj39 = hashMap34.get((java.lang.Object) 2);
        hashMap34.clear();
        hashMap34.modCount = (short) 100;
        system.classfixer.classes.HashMap hashMap44 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray45 = hashMap44.table;
        system.classfixer.classes.HashMap hashMap47 = new system.classfixer.classes.HashMap((int) (short) 10);
        int int48 = hashMap47.size();
        hashMap47.modCount = 2;
        java.lang.Object obj52 = hashMap44.put((java.lang.Object) hashMap47, (java.lang.Object) true);
        system.classfixer.classes.HashMap.Entry[] entryArray53 = hashMap44.table;
        boolean boolean54 = hashMap44.isEmpty();
        system.classfixer.classes.HashMap hashMap55 = new system.classfixer.classes.HashMap();
        java.lang.Object obj58 = hashMap55.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        hashMap55.clear();
        hashMap55.clear();
        hashMap55.modCount = (short) 100;
        boolean boolean63 = hashMap55.repOK();
        system.classfixer.classes.HashMap hashMap65 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray66 = hashMap65.table;
        int int67 = hashMap65.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray68 = hashMap65.table;
        int int69 = hashMap65.size();
        system.classfixer.classes.HashMap.Entry[] entryArray70 = hashMap65.table;
        java.lang.Object obj71 = hashMap55.remove((java.lang.Object) entryArray70);
        hashMap44.table = entryArray70;
        java.lang.Object obj73 = hashMap34.get((java.lang.Object) entryArray70);
        hashMap11.table = entryArray70;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap11", hashMap11.repOK_2());
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        hashMap0.clear();
        hashMap0.clear();
        hashMap0.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        int int2 = hashMap0.size();
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = hashMap0.remove(obj3);
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int7 = hashMap6.size();
        boolean boolean8 = hashMap6.isEmpty();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry entry11 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray12 = new system.classfixer.classes.HashMap.Entry[] { entry11 };
        hashMap10.table = entryArray12;
        hashMap6.table = entryArray12;
        hashMap0.table = entryArray12;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap();
        java.lang.Object obj4 = hashMap1.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        hashMap1.clear();
        hashMap1.clear();
        java.lang.Object obj9 = hashMap1.put((java.lang.Object) (short) 10, (java.lang.Object) 100.0d);
        java.lang.Object obj11 = hashMap1.get((java.lang.Object) (-1.0d));
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) (short) 10);
        int int15 = hashMap14.modCount;
        java.lang.Object obj16 = hashMap1.put((java.lang.Object) (-1L), (java.lang.Object) hashMap14);
        java.lang.Object obj18 = hashMap0.put(obj16, (java.lang.Object) (-1L));
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap((int) 'a');
        int int21 = hashMap20.modCount;
        java.lang.Object obj22 = hashMap0.get((java.lang.Object) hashMap20);
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap();
        boolean boolean24 = hashMap23.repOK();
        int int25 = hashMap23.size();
        java.lang.Object obj26 = null;
        java.lang.Object obj27 = hashMap23.remove(obj26);
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap();
        java.lang.Object obj32 = hashMap29.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        hashMap29.clear();
        boolean boolean34 = hashMap29.isEmpty();
        hashMap29.clear();
        java.lang.Object obj36 = hashMap23.put((java.lang.Object) '#', (java.lang.Object) hashMap29);
        int int37 = hashMap29.modCount;
        system.classfixer.classes.HashMap hashMap40 = new system.classfixer.classes.HashMap((int) (byte) 1, (float) 1);
        java.lang.Object obj42 = hashMap40.get((java.lang.Object) 'a');
        java.lang.Object obj45 = hashMap40.put((java.lang.Object) 'a', (java.lang.Object) 'a');
        java.lang.Object obj46 = hashMap29.get((java.lang.Object) hashMap40);
        int int47 = hashMap29.size();
        system.classfixer.classes.HashMap hashMap49 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int50 = hashMap49.size();
        boolean boolean51 = hashMap49.isEmpty();
        system.classfixer.classes.HashMap hashMap53 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry entry54 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray55 = new system.classfixer.classes.HashMap.Entry[] { entry54 };
        hashMap53.table = entryArray55;
        hashMap49.table = entryArray55;
        system.classfixer.classes.HashMap.Entry[] entryArray58 = hashMap49.table;
        java.lang.Object obj59 = hashMap29.remove((java.lang.Object) entryArray58);
        hashMap0.table = entryArray58;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 1, (float) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(3, (float) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 10, (float) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(5, (float) 4);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test71");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 10, (float) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test72");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        hashMap0.clear();
        boolean boolean5 = hashMap0.isEmpty();
        boolean boolean6 = hashMap0.repOK();
        java.lang.Object obj7 = null;
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap9.table;
        java.lang.Object obj11 = hashMap0.put(obj7, (java.lang.Object) hashMap9);
        hashMap0.modCount = 2;
        hashMap0.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test73");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        hashMap0.clear();
        boolean boolean5 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap7.clear();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap10.table;
        int int12 = hashMap10.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap10.table;
        hashMap7.table = entryArray13;
        java.lang.Object obj15 = hashMap0.get((java.lang.Object) hashMap7);
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int18 = hashMap17.size();
        java.lang.Object obj19 = new java.lang.Object();
        java.lang.Object obj20 = hashMap17.remove(obj19);
        boolean boolean21 = hashMap17.repOK();
        boolean boolean22 = hashMap17.repOK();
        int int23 = hashMap17.size();
        java.lang.Object obj24 = hashMap0.get((java.lang.Object) hashMap17);
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap((int) (byte) 1, (float) 1);
        java.lang.Object obj29 = hashMap27.get((java.lang.Object) 'a');
        java.lang.Object obj32 = hashMap27.put((java.lang.Object) 'a', (java.lang.Object) 'a');
        boolean boolean33 = hashMap27.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray34 = hashMap27.table;
        hashMap0.table = entryArray34;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test74");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(100);
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap2.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        hashMap2.clear();
        boolean boolean7 = hashMap2.isEmpty();
        boolean boolean8 = hashMap2.repOK();
        java.lang.Object obj9 = null;
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap11.table;
        java.lang.Object obj13 = hashMap2.put(obj9, (java.lang.Object) hashMap11);
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap2.table;
        int int15 = hashMap2.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap2.table;
        hashMap1.table = entryArray16;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test75");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(2, (float) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test76");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap1.table;
        int int3 = hashMap1.modCount;
        boolean boolean4 = hashMap1.repOK();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap6.clear();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap9.table;
        int int11 = hashMap9.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap9.table;
        hashMap6.table = entryArray12;
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap6.table;
        hashMap1.table = entryArray14;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test77");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) ' ', (float) 1L);
        boolean boolean3 = hashMap2.repOK();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int9 = hashMap8.size();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap8.table;
        java.lang.Object obj11 = hashMap5.put((java.lang.Object) (short) 10, (java.lang.Object) hashMap8);
        boolean boolean12 = hashMap8.isEmpty();
        java.lang.Object obj13 = hashMap2.get((java.lang.Object) hashMap8);
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        boolean boolean15 = hashMap14.repOK();
        int int16 = hashMap14.size();
        java.lang.Object obj17 = null;
        java.lang.Object obj18 = hashMap14.remove(obj17);
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        java.lang.Object obj23 = hashMap20.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        hashMap20.clear();
        boolean boolean25 = hashMap20.isEmpty();
        hashMap20.clear();
        java.lang.Object obj27 = hashMap14.put((java.lang.Object) '#', (java.lang.Object) hashMap20);
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray30 = hashMap29.table;
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap((int) (short) 10);
        int int33 = hashMap32.size();
        hashMap32.modCount = 2;
        java.lang.Object obj37 = hashMap29.put((java.lang.Object) hashMap32, (java.lang.Object) true);
        system.classfixer.classes.HashMap.Entry[] entryArray38 = hashMap29.table;
        hashMap29.modCount = 0;
        system.classfixer.classes.HashMap hashMap42 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray43 = hashMap42.table;
        system.classfixer.classes.HashMap hashMap45 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray46 = hashMap45.table;
        system.classfixer.classes.HashMap hashMap48 = new system.classfixer.classes.HashMap((int) (short) 10);
        int int49 = hashMap48.modCount;
        java.lang.Object obj50 = hashMap42.put((java.lang.Object) hashMap45, (java.lang.Object) int49);
        system.classfixer.classes.HashMap hashMap52 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray53 = hashMap52.table;
        int int54 = hashMap52.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray55 = hashMap52.table;
        hashMap42.table = entryArray55;
        java.lang.Object obj57 = hashMap14.put((java.lang.Object) 0, (java.lang.Object) hashMap42);
        system.classfixer.classes.HashMap hashMap59 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray60 = hashMap59.table;
        hashMap59.clear();
        system.classfixer.classes.HashMap hashMap63 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray64 = hashMap63.table;
        int int65 = hashMap63.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray66 = hashMap63.table;
        int int67 = hashMap63.size();
        system.classfixer.classes.HashMap.Entry[] entryArray68 = hashMap63.table;
        hashMap63.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray70 = hashMap63.table;
        hashMap59.table = entryArray70;
        hashMap42.table = entryArray70;
        hashMap2.table = entryArray70;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test78");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap();
        java.lang.Object obj4 = hashMap1.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        hashMap1.clear();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object obj8 = hashMap1.put(obj6, (java.lang.Object) 100);
        hashMap1.modCount = (short) 0;
        int int11 = hashMap1.modCount;
        java.lang.Object obj12 = hashMap0.get((java.lang.Object) int11);
        int int13 = hashMap0.modCount;
        hashMap0.modCount = 1;
        system.classfixer.classes.HashMap.Entry[] entryArray16 = null;
        hashMap0.table = entryArray16;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }
}

