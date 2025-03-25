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
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray1 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap0.table = entryArray1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        hashMap0.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray2 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap0.table = entryArray2;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        system.classfixer.classes.HashMap.Entry[] entryArray4 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap0.table = entryArray4;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        boolean boolean3 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap0.table;
        hashMap0.modCount = (short) 0;
        system.classfixer.classes.HashMap.Entry[] entryArray7 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap0.table = entryArray7;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        int int3 = hashMap2.size();
        hashMap2.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 100, (float) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        boolean boolean3 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap0.table;
        hashMap0.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) '4', (float) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 10, (float) 4);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(1, (float) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        boolean boolean3 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap0.table;
        int int5 = hashMap0.modCount;
        hashMap0.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        hashMap2.clear();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        boolean boolean6 = hashMap5.repOK();
        hashMap5.clear();
        java.lang.Object obj8 = hashMap2.put((java.lang.Object) 1L, (java.lang.Object) hashMap5);
        boolean boolean9 = hashMap2.repOK();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) 'a');
        boolean boolean13 = hashMap12.isEmpty();
        boolean boolean14 = hashMap12.isEmpty();
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap((int) 'a');
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap((int) (short) 10);
        int int19 = hashMap18.size();
        boolean boolean20 = hashMap18.isEmpty();
        hashMap18.clear();
        java.lang.Object obj22 = hashMap16.remove((java.lang.Object) hashMap18);
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap((int) (short) 10);
        boolean boolean25 = hashMap24.isEmpty();
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        hashMap28.clear();
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap();
        boolean boolean32 = hashMap31.repOK();
        hashMap31.clear();
        java.lang.Object obj34 = hashMap28.put((java.lang.Object) 1L, (java.lang.Object) hashMap31);
        system.classfixer.classes.HashMap.Entry[] entryArray35 = hashMap31.table;
        java.lang.Object obj37 = hashMap24.put((java.lang.Object) entryArray35, (java.lang.Object) 1.0d);
        java.lang.Object obj38 = hashMap12.put(obj22, (java.lang.Object) hashMap24);
        java.lang.Object obj39 = hashMap2.put((java.lang.Object) 100L, (java.lang.Object) hashMap12);
        system.classfixer.classes.HashMap hashMap40 = new system.classfixer.classes.HashMap();
        boolean boolean41 = hashMap40.repOK();
        hashMap40.clear();
        system.classfixer.classes.HashMap hashMap44 = new system.classfixer.classes.HashMap();
        hashMap44.clear();
        system.classfixer.classes.HashMap.Entry entry46 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray47 = new system.classfixer.classes.HashMap.Entry[] { entry46 };
        hashMap44.table = entryArray47;
        java.lang.Object obj49 = hashMap40.put((java.lang.Object) 1.0d, (java.lang.Object) hashMap44);
        system.classfixer.classes.HashMap hashMap53 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        hashMap53.clear();
        system.classfixer.classes.HashMap hashMap56 = new system.classfixer.classes.HashMap();
        boolean boolean57 = hashMap56.repOK();
        hashMap56.clear();
        java.lang.Object obj59 = hashMap53.put((java.lang.Object) 1L, (java.lang.Object) hashMap56);
        system.classfixer.classes.HashMap.Entry[] entryArray60 = hashMap56.table;
        java.lang.Object obj61 = hashMap44.put((java.lang.Object) true, (java.lang.Object) entryArray60);
        system.classfixer.classes.HashMap.Entry[] entryArray62 = hashMap44.table;
        hashMap2.table = entryArray62;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 1, (float) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(10, (float) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) '#', (float) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(0, (float) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) '#', (float) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(0, 100.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        hashMap2.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(100, (float) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap2.table;
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap2.table;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        java.lang.Object obj8 = hashMap5.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        int int9 = hashMap5.size();
        boolean boolean10 = hashMap5.repOK();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        hashMap13.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap13.table;
        java.lang.Object obj16 = hashMap5.remove((java.lang.Object) entryArray15);
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        hashMap19.clear();
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        boolean boolean23 = hashMap22.repOK();
        hashMap22.clear();
        java.lang.Object obj25 = hashMap19.put((java.lang.Object) 1L, (java.lang.Object) hashMap22);
        system.classfixer.classes.HashMap.Entry[] entryArray26 = hashMap22.table;
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap();
        boolean boolean28 = hashMap27.repOK();
        hashMap27.clear();
        hashMap27.clear();
        java.lang.Object obj33 = hashMap27.put((java.lang.Object) 100.0d, (java.lang.Object) 100.0f);
        java.lang.Object obj35 = hashMap27.get((java.lang.Object) 0);
        java.lang.Object obj36 = null;
        java.lang.Object obj37 = hashMap27.remove(obj36);
        hashMap27.clear();
        java.lang.Object obj39 = hashMap22.get((java.lang.Object) hashMap27);
        system.classfixer.classes.HashMap.Entry entry40 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray41 = new system.classfixer.classes.HashMap.Entry[] { entry40 };
        hashMap22.table = entryArray41;
        java.lang.Object obj43 = hashMap2.put(obj16, (java.lang.Object) entryArray41);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(100, (float) 1);
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        hashMap5.clear();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        boolean boolean8 = hashMap7.repOK();
        hashMap7.clear();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        hashMap11.clear();
        system.classfixer.classes.HashMap.Entry entry13 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray14 = new system.classfixer.classes.HashMap.Entry[] { entry13 };
        hashMap11.table = entryArray14;
        java.lang.Object obj16 = hashMap7.put((java.lang.Object) 1.0d, (java.lang.Object) hashMap11);
        java.lang.Object obj17 = hashMap2.put((java.lang.Object) hashMap5, (java.lang.Object) hashMap11);
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap((int) 'a');
        boolean boolean20 = hashMap19.isEmpty();
        boolean boolean21 = hashMap19.repOK();
        java.lang.Object obj22 = new java.lang.Object();
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        java.lang.Object obj24 = hashMap5.put((java.lang.Object) hashMap19, obj22);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap5", hashMap5.repOK_2());
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 10);
        int int2 = hashMap1.size();
        boolean boolean3 = hashMap1.isEmpty();
        hashMap1.clear();
        java.lang.Object obj5 = null;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        boolean boolean7 = hashMap6.repOK();
        hashMap6.clear();
        boolean boolean9 = hashMap6.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap6.table;
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap6.table;
        java.lang.Object obj12 = hashMap1.put(obj5, (java.lang.Object) hashMap6);
        hashMap1.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        boolean boolean4 = hashMap0.repOK();
        hashMap0.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) '#', (float) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(0, (float) 32);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 100, (float) 4);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 10);
        hashMap1.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap1.table;
        hashMap1.modCount = 0;
        hashMap1.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(32, (float) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        int int4 = hashMap0.size();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap0.table;
        boolean boolean6 = hashMap0.repOK();
        int int7 = hashMap0.modCount;
        int int8 = hashMap0.size();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap0.table = entryArray9;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 0, (float) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        hashMap2.clear();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        boolean boolean6 = hashMap5.repOK();
        hashMap5.clear();
        java.lang.Object obj8 = hashMap2.put((java.lang.Object) 1L, (java.lang.Object) hashMap5);
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap5.table;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        boolean boolean11 = hashMap10.repOK();
        hashMap10.clear();
        hashMap10.clear();
        java.lang.Object obj16 = hashMap10.put((java.lang.Object) 100.0d, (java.lang.Object) 100.0f);
        java.lang.Object obj18 = hashMap10.get((java.lang.Object) 0);
        java.lang.Object obj19 = null;
        java.lang.Object obj20 = hashMap10.remove(obj19);
        hashMap10.clear();
        java.lang.Object obj22 = hashMap5.get((java.lang.Object) hashMap10);
        int int23 = hashMap5.modCount;
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap();
        boolean boolean25 = hashMap24.repOK();
        boolean boolean26 = hashMap24.repOK();
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap();
        boolean boolean28 = hashMap27.repOK();
        hashMap27.clear();
        boolean boolean30 = hashMap27.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray31 = hashMap27.table;
        int int32 = hashMap27.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray33 = hashMap27.table;
        hashMap24.table = entryArray33;
        hashMap5.table = entryArray33;
        int int36 = hashMap5.size();
        hashMap5.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap5", hashMap5.repOK_2());
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 100, (float) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) 'a', (float) 3);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 1, (float) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        hashMap4.clear();
        system.classfixer.classes.HashMap.Entry entry6 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray7 = new system.classfixer.classes.HashMap.Entry[] { entry6 };
        hashMap4.table = entryArray7;
        java.lang.Object obj9 = hashMap0.put((java.lang.Object) 1.0d, (java.lang.Object) hashMap4);
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        hashMap13.clear();
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        boolean boolean17 = hashMap16.repOK();
        hashMap16.clear();
        java.lang.Object obj19 = hashMap13.put((java.lang.Object) 1L, (java.lang.Object) hashMap16);
        system.classfixer.classes.HashMap.Entry[] entryArray20 = hashMap16.table;
        java.lang.Object obj21 = hashMap4.put((java.lang.Object) true, (java.lang.Object) entryArray20);
        int int22 = hashMap4.size();
        boolean boolean23 = hashMap4.repOK();
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap((int) (short) 10);
        int int26 = hashMap25.size();
        boolean boolean27 = hashMap25.isEmpty();
        java.lang.Object obj28 = hashMap4.get((java.lang.Object) hashMap25);
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        hashMap31.clear();
        hashMap31.clear();
        int int34 = hashMap31.modCount;
        int int35 = hashMap31.size();
        system.classfixer.classes.HashMap hashMap38 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        hashMap38.clear();
        system.classfixer.classes.HashMap hashMap41 = new system.classfixer.classes.HashMap();
        boolean boolean42 = hashMap41.repOK();
        hashMap41.clear();
        java.lang.Object obj44 = hashMap38.put((java.lang.Object) 1L, (java.lang.Object) hashMap41);
        system.classfixer.classes.HashMap.Entry[] entryArray45 = hashMap41.table;
        java.lang.Object obj46 = hashMap4.put((java.lang.Object) hashMap31, (java.lang.Object) entryArray45);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap4", hashMap4.repOK_2());
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(0, (float) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        int int3 = hashMap2.size();
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = hashMap2.remove(obj4);
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap2.table;
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        boolean boolean8 = hashMap7.repOK();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        boolean boolean10 = hashMap9.repOK();
        hashMap9.clear();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        hashMap13.clear();
        system.classfixer.classes.HashMap.Entry entry15 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray16 = new system.classfixer.classes.HashMap.Entry[] { entry15 };
        hashMap13.table = entryArray16;
        java.lang.Object obj18 = hashMap9.put((java.lang.Object) 1.0d, (java.lang.Object) hashMap13);
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        hashMap22.clear();
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap();
        boolean boolean26 = hashMap25.repOK();
        hashMap25.clear();
        java.lang.Object obj28 = hashMap22.put((java.lang.Object) 1L, (java.lang.Object) hashMap25);
        system.classfixer.classes.HashMap.Entry[] entryArray29 = hashMap25.table;
        java.lang.Object obj30 = hashMap13.put((java.lang.Object) true, (java.lang.Object) entryArray29);
        system.classfixer.classes.HashMap.Entry[] entryArray31 = hashMap13.table;
        boolean boolean32 = hashMap13.isEmpty();
        system.classfixer.classes.HashMap hashMap34 = new system.classfixer.classes.HashMap((int) 'a');
        system.classfixer.classes.HashMap hashMap36 = new system.classfixer.classes.HashMap((int) (short) 10);
        int int37 = hashMap36.size();
        boolean boolean38 = hashMap36.isEmpty();
        hashMap36.clear();
        java.lang.Object obj40 = hashMap34.remove((java.lang.Object) hashMap36);
        system.classfixer.classes.HashMap.Entry[] entryArray41 = hashMap34.table;
        hashMap13.table = entryArray41;
        java.lang.Object obj43 = hashMap7.get((java.lang.Object) hashMap13);
        java.lang.Object obj44 = hashMap2.get((java.lang.Object) hashMap13);
        hashMap13.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap13", hashMap13.repOK_2());
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        hashMap0.clear();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        boolean boolean5 = hashMap4.repOK();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        boolean boolean7 = hashMap6.repOK();
        hashMap6.clear();
        int int9 = hashMap6.modCount;
        hashMap6.modCount = (byte) 100;
        java.lang.Object obj12 = hashMap4.remove((java.lang.Object) (byte) 100);
        java.lang.Object obj13 = hashMap0.get((java.lang.Object) hashMap4);
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap0.table;
        boolean boolean15 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        int int19 = hashMap18.size();
        hashMap18.clear();
        boolean boolean21 = hashMap18.isEmpty();
        int int22 = hashMap18.size();
        system.classfixer.classes.HashMap.Entry[] entryArray23 = hashMap18.table;
        hashMap18.modCount = (short) 0;
        java.lang.Object obj26 = hashMap0.get((java.lang.Object) hashMap18);
        hashMap18.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap18", hashMap18.repOK_2());
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 10, (float) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(32, 10.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(0, (float) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 0, (float) 3);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        hashMap2.clear();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        boolean boolean6 = hashMap5.repOK();
        hashMap5.clear();
        java.lang.Object obj8 = hashMap2.put((java.lang.Object) 1L, (java.lang.Object) hashMap5);
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap5.table;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        boolean boolean11 = hashMap10.repOK();
        hashMap10.clear();
        hashMap10.clear();
        java.lang.Object obj16 = hashMap10.put((java.lang.Object) 100.0d, (java.lang.Object) 100.0f);
        java.lang.Object obj18 = hashMap10.get((java.lang.Object) 0);
        java.lang.Object obj19 = null;
        java.lang.Object obj20 = hashMap10.remove(obj19);
        hashMap10.clear();
        java.lang.Object obj22 = hashMap5.get((java.lang.Object) hashMap10);
        java.lang.Object obj23 = null;
        java.lang.Object obj24 = hashMap10.get(obj23);
        system.classfixer.classes.HashMap.Entry[] entryArray25 = hashMap10.table;
        int int26 = hashMap10.modCount;
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        hashMap29.clear();
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap();
        boolean boolean33 = hashMap32.repOK();
        hashMap32.clear();
        java.lang.Object obj35 = hashMap29.put((java.lang.Object) 1L, (java.lang.Object) hashMap32);
        system.classfixer.classes.HashMap.Entry[] entryArray36 = hashMap32.table;
        system.classfixer.classes.HashMap hashMap37 = new system.classfixer.classes.HashMap();
        boolean boolean38 = hashMap37.repOK();
        hashMap37.clear();
        hashMap37.clear();
        java.lang.Object obj43 = hashMap37.put((java.lang.Object) 100.0d, (java.lang.Object) 100.0f);
        java.lang.Object obj45 = hashMap37.get((java.lang.Object) 0);
        java.lang.Object obj46 = null;
        java.lang.Object obj47 = hashMap37.remove(obj46);
        hashMap37.clear();
        java.lang.Object obj49 = hashMap32.get((java.lang.Object) hashMap37);
        java.lang.Object obj50 = null;
        java.lang.Object obj51 = hashMap37.get(obj50);
        int int52 = hashMap37.modCount;
        int int53 = hashMap37.modCount;
        boolean boolean54 = hashMap37.isEmpty();
        boolean boolean55 = hashMap37.repOK();
        system.classfixer.classes.HashMap hashMap57 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap hashMap58 = new system.classfixer.classes.HashMap();
        boolean boolean59 = hashMap58.repOK();
        hashMap58.clear();
        boolean boolean61 = hashMap58.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray62 = hashMap58.table;
        system.classfixer.classes.HashMap.Entry[] entryArray63 = hashMap58.table;
        java.lang.Object obj64 = hashMap57.get((java.lang.Object) entryArray63);
        hashMap37.table = entryArray63;
        java.lang.Object obj66 = hashMap10.get((java.lang.Object) hashMap37);
        hashMap37.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap37", hashMap37.repOK_2());
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(100, (float) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) '#', (float) 10L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        int int3 = hashMap0.modCount;
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = hashMap0.get(obj4);
        int int6 = hashMap0.size();
        hashMap0.clear();
        int int8 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        boolean boolean10 = hashMap9.repOK();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        boolean boolean12 = hashMap11.repOK();
        hashMap11.clear();
        int int14 = hashMap11.modCount;
        hashMap11.modCount = (byte) 100;
        java.lang.Object obj17 = hashMap9.remove((java.lang.Object) (byte) 100);
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        boolean boolean19 = hashMap18.repOK();
        hashMap18.clear();
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        hashMap22.clear();
        system.classfixer.classes.HashMap.Entry entry24 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray25 = new system.classfixer.classes.HashMap.Entry[] { entry24 };
        hashMap22.table = entryArray25;
        java.lang.Object obj27 = hashMap18.put((java.lang.Object) 1.0d, (java.lang.Object) hashMap22);
        int int28 = hashMap22.size();
        java.lang.Object obj29 = hashMap9.get((java.lang.Object) int28);
        boolean boolean30 = hashMap9.isEmpty();
        java.lang.Object obj31 = hashMap0.remove((java.lang.Object) boolean30);
        hashMap0.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) '4', (float) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        int int3 = hashMap2.size();
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = hashMap2.remove(obj4);
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        boolean boolean7 = hashMap6.repOK();
        hashMap6.clear();
        hashMap6.clear();
        java.lang.Object obj12 = hashMap6.put((java.lang.Object) 100.0d, (java.lang.Object) 100.0f);
        int int13 = hashMap6.size();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        boolean boolean15 = hashMap14.repOK();
        hashMap14.clear();
        hashMap14.clear();
        java.lang.Object obj20 = hashMap14.put((java.lang.Object) 100.0d, (java.lang.Object) 100.0f);
        java.lang.Object obj22 = hashMap14.get((java.lang.Object) 0);
        java.lang.Object obj23 = null;
        java.lang.Object obj24 = hashMap14.remove(obj23);
        hashMap14.clear();
        hashMap14.clear();
        boolean boolean27 = hashMap14.isEmpty();
        java.lang.Object obj28 = hashMap6.get((java.lang.Object) hashMap14);
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        hashMap31.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray33 = hashMap31.table;
        hashMap6.table = entryArray33;
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap();
        boolean boolean36 = hashMap35.repOK();
        hashMap35.clear();
        system.classfixer.classes.HashMap hashMap39 = new system.classfixer.classes.HashMap();
        hashMap39.clear();
        system.classfixer.classes.HashMap.Entry entry41 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray42 = new system.classfixer.classes.HashMap.Entry[] { entry41 };
        hashMap39.table = entryArray42;
        java.lang.Object obj44 = hashMap35.put((java.lang.Object) 1.0d, (java.lang.Object) hashMap39);
        system.classfixer.classes.HashMap hashMap48 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        hashMap48.clear();
        system.classfixer.classes.HashMap hashMap51 = new system.classfixer.classes.HashMap();
        boolean boolean52 = hashMap51.repOK();
        hashMap51.clear();
        java.lang.Object obj54 = hashMap48.put((java.lang.Object) 1L, (java.lang.Object) hashMap51);
        system.classfixer.classes.HashMap.Entry[] entryArray55 = hashMap51.table;
        java.lang.Object obj56 = hashMap39.put((java.lang.Object) true, (java.lang.Object) entryArray55);
        system.classfixer.classes.HashMap.Entry[] entryArray57 = hashMap39.table;
        boolean boolean58 = hashMap39.isEmpty();
        system.classfixer.classes.HashMap hashMap60 = new system.classfixer.classes.HashMap((int) 'a');
        system.classfixer.classes.HashMap hashMap62 = new system.classfixer.classes.HashMap((int) (short) 10);
        int int63 = hashMap62.size();
        boolean boolean64 = hashMap62.isEmpty();
        hashMap62.clear();
        java.lang.Object obj66 = hashMap60.remove((java.lang.Object) hashMap62);
        system.classfixer.classes.HashMap.Entry[] entryArray67 = hashMap60.table;
        hashMap39.table = entryArray67;
        java.lang.Object obj69 = hashMap2.put((java.lang.Object) hashMap6, (java.lang.Object) entryArray67);
        hashMap2.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 10);
        hashMap1.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap1.table;
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        boolean boolean5 = hashMap4.repOK();
        hashMap4.clear();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        hashMap8.clear();
        system.classfixer.classes.HashMap.Entry entry10 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray11 = new system.classfixer.classes.HashMap.Entry[] { entry10 };
        hashMap8.table = entryArray11;
        java.lang.Object obj13 = hashMap4.put((java.lang.Object) 1.0d, (java.lang.Object) hashMap8);
        int int14 = hashMap8.size();
        java.lang.Object obj15 = hashMap1.get((java.lang.Object) int14);
        int int16 = hashMap1.size();
        hashMap1.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) ' ', (float) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        boolean boolean4 = hashMap0.repOK();
        boolean boolean5 = hashMap0.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        java.lang.Object obj10 = hashMap7.put((java.lang.Object) (-1.0f), (java.lang.Object) (-1));
        int int11 = hashMap7.size();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        hashMap12.clear();
        system.classfixer.classes.HashMap.Entry entry14 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray15 = new system.classfixer.classes.HashMap.Entry[] { entry14 };
        hashMap12.table = entryArray15;
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        boolean boolean18 = hashMap17.repOK();
        hashMap17.clear();
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap();
        hashMap21.clear();
        system.classfixer.classes.HashMap.Entry entry23 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray24 = new system.classfixer.classes.HashMap.Entry[] { entry23 };
        hashMap21.table = entryArray24;
        java.lang.Object obj26 = hashMap17.put((java.lang.Object) 1.0d, (java.lang.Object) hashMap21);
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        hashMap30.clear();
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap();
        boolean boolean34 = hashMap33.repOK();
        hashMap33.clear();
        java.lang.Object obj36 = hashMap30.put((java.lang.Object) 1L, (java.lang.Object) hashMap33);
        system.classfixer.classes.HashMap.Entry[] entryArray37 = hashMap33.table;
        java.lang.Object obj38 = hashMap21.put((java.lang.Object) true, (java.lang.Object) entryArray37);
        int int39 = hashMap21.size();
        system.classfixer.classes.HashMap.Entry[] entryArray40 = hashMap21.table;
        java.lang.Object obj41 = hashMap12.get((java.lang.Object) entryArray40);
        hashMap7.table = entryArray40;
        hashMap0.table = entryArray40;
        system.classfixer.classes.HashMap hashMap44 = new system.classfixer.classes.HashMap();
        boolean boolean45 = hashMap44.repOK();
        hashMap44.clear();
        java.lang.Object obj47 = new java.lang.Object();
        java.lang.Class<?> wildcardClass48 = obj47.getClass();
        java.lang.Object obj50 = hashMap44.put((java.lang.Object) wildcardClass48, (java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap53 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        system.classfixer.classes.HashMap hashMap56 = new system.classfixer.classes.HashMap(100, (float) 1);
        system.classfixer.classes.HashMap hashMap59 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        hashMap59.clear();
        system.classfixer.classes.HashMap hashMap61 = new system.classfixer.classes.HashMap();
        boolean boolean62 = hashMap61.repOK();
        hashMap61.clear();
        system.classfixer.classes.HashMap hashMap65 = new system.classfixer.classes.HashMap();
        hashMap65.clear();
        system.classfixer.classes.HashMap.Entry entry67 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray68 = new system.classfixer.classes.HashMap.Entry[] { entry67 };
        hashMap65.table = entryArray68;
        java.lang.Object obj70 = hashMap61.put((java.lang.Object) 1.0d, (java.lang.Object) hashMap65);
        java.lang.Object obj71 = hashMap56.put((java.lang.Object) hashMap59, (java.lang.Object) hashMap65);
        system.classfixer.classes.HashMap hashMap72 = new system.classfixer.classes.HashMap();
        boolean boolean73 = hashMap72.repOK();
        hashMap72.clear();
        hashMap72.clear();
        java.lang.Object obj78 = hashMap72.put((java.lang.Object) 100.0d, (java.lang.Object) 100.0f);
        java.lang.Object obj80 = hashMap72.get((java.lang.Object) 0);
        java.lang.Object obj81 = null;
        java.lang.Object obj82 = hashMap72.remove(obj81);
        hashMap72.clear();
        system.classfixer.classes.HashMap hashMap86 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        hashMap86.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray88 = hashMap86.table;
        java.lang.Object obj89 = hashMap72.get((java.lang.Object) entryArray88);
        hashMap59.table = entryArray88;
        java.lang.Object obj91 = hashMap44.put((java.lang.Object) hashMap53, (java.lang.Object) hashMap59);
        java.lang.Object obj92 = null;
        java.lang.Object obj93 = hashMap0.put((java.lang.Object) hashMap53, obj92);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 100, (float) 3);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 10);
        hashMap1.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap1.table;
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        boolean boolean5 = hashMap4.repOK();
        hashMap4.clear();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        hashMap8.clear();
        system.classfixer.classes.HashMap.Entry entry10 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray11 = new system.classfixer.classes.HashMap.Entry[] { entry10 };
        hashMap8.table = entryArray11;
        java.lang.Object obj13 = hashMap4.put((java.lang.Object) 1.0d, (java.lang.Object) hashMap8);
        int int14 = hashMap8.size();
        java.lang.Object obj15 = hashMap1.get((java.lang.Object) int14);
        int int16 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        boolean boolean18 = hashMap17.repOK();
        boolean boolean19 = hashMap17.repOK();
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        boolean boolean21 = hashMap20.repOK();
        hashMap20.clear();
        boolean boolean23 = hashMap20.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap20.table;
        int int25 = hashMap20.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray26 = hashMap20.table;
        hashMap17.table = entryArray26;
        java.lang.Object obj28 = hashMap1.remove((java.lang.Object) hashMap17);
        hashMap17.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap17", hashMap17.repOK_2());
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) 'a', 100.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(10, (float) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }
}

