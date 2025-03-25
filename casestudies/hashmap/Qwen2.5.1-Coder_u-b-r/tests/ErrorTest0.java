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
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        system.classfixer.classes.HashMap.Entry entry2 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray3 = new system.classfixer.classes.HashMap.Entry[] { entry2 };
        hashMap0.table = entryArray3;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj4 = hashMap0.put(obj2, (java.lang.Object) 100);
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        java.lang.Object obj8 = hashMap0.put((java.lang.Object) '#', (java.lang.Object) hashMap7);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj4 = hashMap0.put(obj2, (java.lang.Object) 100);
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap0.table;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        int int3 = hashMap0.size();
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = hashMap0.remove(obj4);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Object obj9 = hashMap0.put((java.lang.Object) ' ', (java.lang.Object) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray5 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap4.table = entryArray5;
        hashMap0.table = entryArray5;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap(0);
        boolean boolean5 = hashMap4.isEmpty();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray8 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap7.table = entryArray8;
        hashMap4.table = entryArray8;
        hashMap0.table = entryArray8;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean2 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap3.remove((java.lang.Object) 0.0f);
        java.lang.Object obj6 = hashMap1.get((java.lang.Object) hashMap3);
        int int7 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean10 = hashMap9.isEmpty();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        java.lang.Object obj13 = hashMap11.remove((java.lang.Object) 0.0f);
        java.lang.Object obj14 = hashMap9.get((java.lang.Object) hashMap11);
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap11.table;
        hashMap1.table = entryArray15;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 1);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean4 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap3.table;
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap3.table;
        boolean boolean7 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.repOK();
        hashMap8.clear();
        java.lang.Object obj11 = hashMap1.put((java.lang.Object) boolean7, (java.lang.Object) hashMap8);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean2 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap1.table;
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap1.table;
        boolean boolean5 = hashMap1.isEmpty();
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = hashMap1.get(obj6);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.repOK();
        hashMap8.clear();
        int int11 = hashMap8.size();
        int int12 = hashMap8.size();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        java.lang.Object obj15 = hashMap13.remove((java.lang.Object) 0.0f);
        hashMap13.modCount = (byte) 100;
        java.lang.Object obj18 = hashMap8.get((java.lang.Object) (byte) 100);
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap20.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray22 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap20.table = entryArray22;
        java.lang.Object obj24 = hashMap1.put((java.lang.Object) (byte) 100, (java.lang.Object) hashMap20);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        int int3 = hashMap0.size();
        int int4 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) 'a');
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        java.lang.Object obj9 = hashMap7.remove((java.lang.Object) 0.0f);
        hashMap7.modCount = (byte) 100;
        hashMap7.clear();
        java.lang.Object obj13 = hashMap0.put((java.lang.Object) 'a', (java.lang.Object) hashMap7);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(100);
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        boolean boolean3 = hashMap2.repOK();
        hashMap2.clear();
        int int5 = hashMap2.size();
        int int6 = hashMap2.size();
        int int7 = hashMap2.size();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap2.table;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray11 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap10.table = entryArray11;
        hashMap10.modCount = (short) -1;
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Object obj17 = hashMap2.put((java.lang.Object) hashMap10, (java.lang.Object) hashMap16);
        java.lang.Object obj18 = hashMap1.remove(obj17);
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap20.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray22 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap20.table = entryArray22;
        hashMap1.table = entryArray22;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        hashMap1.clear();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) 'a');
        boolean boolean7 = hashMap6.isEmpty();
        java.lang.Object obj8 = hashMap1.put((java.lang.Object) 0, (java.lang.Object) hashMap6);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean2 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap3.remove((java.lang.Object) 0.0f);
        hashMap3.modCount = (byte) 100;
        hashMap3.clear();
        hashMap3.modCount = 0;
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap3.table;
        hashMap1.table = entryArray11;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        int int3 = hashMap0.size();
        int int4 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap(100, (float) 1);
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap7.table;
        hashMap0.table = entryArray8;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj4 = hashMap0.put(obj2, (java.lang.Object) 100);
        hashMap0.clear();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap7.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap7.table;
        hashMap0.table = entryArray9;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 0.0f);
        hashMap0.modCount = (byte) 100;
        hashMap0.clear();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean8 = hashMap7.isEmpty();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        java.lang.Object obj11 = hashMap9.remove((java.lang.Object) 0.0f);
        java.lang.Object obj12 = hashMap7.get((java.lang.Object) hashMap9);
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap9.table;
        hashMap0.table = entryArray13;
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        java.lang.Object obj17 = hashMap15.remove((java.lang.Object) 0.0f);
        hashMap15.modCount = (byte) 100;
        hashMap15.clear();
        hashMap15.modCount = 0;
        system.classfixer.classes.HashMap.Entry[] entryArray23 = hashMap15.table;
        hashMap0.table = entryArray23;
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap((int) 'a');
        boolean boolean28 = hashMap27.isEmpty();
        int int29 = hashMap27.modCount;
        int int30 = hashMap27.modCount;
        java.lang.Object obj31 = hashMap0.put((java.lang.Object) 10L, (java.lang.Object) int30);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean2 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap3.remove((java.lang.Object) 0.0f);
        java.lang.Object obj6 = hashMap1.get((java.lang.Object) hashMap3);
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        boolean boolean8 = hashMap7.repOK();
        hashMap7.clear();
        int int10 = hashMap7.size();
        int int11 = hashMap7.size();
        int int12 = hashMap7.size();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap7.table;
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = hashMap7.get(obj14);
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        java.lang.Object obj19 = hashMap17.remove((java.lang.Object) 0.0f);
        hashMap17.modCount = (byte) 100;
        hashMap17.clear();
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean25 = hashMap24.isEmpty();
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap();
        java.lang.Object obj28 = hashMap26.remove((java.lang.Object) 0.0f);
        java.lang.Object obj29 = hashMap24.get((java.lang.Object) hashMap26);
        system.classfixer.classes.HashMap.Entry[] entryArray30 = hashMap26.table;
        hashMap17.table = entryArray30;
        java.lang.Object obj32 = hashMap7.remove((java.lang.Object) entryArray30);
        hashMap1.table = entryArray30;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) '4');
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray4 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap3.table = entryArray4;
        hashMap1.table = entryArray4;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 0.0f);
        hashMap0.modCount = (byte) 100;
        hashMap0.clear();
        boolean boolean6 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        boolean boolean8 = hashMap7.repOK();
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object obj11 = hashMap7.put(obj9, (java.lang.Object) 100);
        hashMap7.clear();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        boolean boolean14 = hashMap13.repOK();
        hashMap13.clear();
        int int16 = hashMap13.size();
        int int17 = hashMap13.size();
        int int18 = hashMap13.size();
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap13.table;
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray22 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap21.table = entryArray22;
        hashMap21.modCount = (short) -1;
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Object obj28 = hashMap13.put((java.lang.Object) hashMap21, (java.lang.Object) hashMap27);
        int int29 = hashMap21.size();
        java.lang.Object obj30 = hashMap0.put((java.lang.Object) hashMap7, (java.lang.Object) hashMap21);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj4 = hashMap0.put(obj2, (java.lang.Object) 100);
        hashMap0.clear();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        boolean boolean8 = hashMap7.repOK();
        hashMap7.clear();
        hashMap7.clear();
        java.lang.Object obj11 = hashMap0.put((java.lang.Object) 0.0f, (java.lang.Object) hashMap7);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean2 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap1.table;
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap1.table;
        int int5 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        boolean boolean7 = hashMap6.repOK();
        hashMap6.clear();
        hashMap6.clear();
        java.lang.Object obj10 = hashMap1.remove((java.lang.Object) hashMap6);
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap12.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap12.table;
        boolean boolean15 = hashMap12.isEmpty();
        int int16 = hashMap12.size();
        boolean boolean17 = hashMap12.repOK();
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap(100);
        java.lang.Object obj20 = hashMap6.put((java.lang.Object) boolean17, (java.lang.Object) hashMap19);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap6", hashMap6.repOK_2());
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(100, (float) 10L);
        java.lang.Object obj5 = hashMap2.put((java.lang.Object) 32, (java.lang.Object) 1.0d);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 1);
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        boolean boolean3 = hashMap2.repOK();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        boolean boolean5 = hashMap4.repOK();
        hashMap4.clear();
        int int7 = hashMap4.size();
        int int8 = hashMap4.size();
        int int9 = hashMap4.size();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap4.table;
        java.lang.Object obj11 = new java.lang.Object();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        java.lang.Object obj13 = hashMap4.get(obj11);
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        java.lang.Object obj16 = hashMap14.remove((java.lang.Object) 0.0f);
        hashMap14.modCount = (byte) 100;
        hashMap14.clear();
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean22 = hashMap21.isEmpty();
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap();
        java.lang.Object obj25 = hashMap23.remove((java.lang.Object) 0.0f);
        java.lang.Object obj26 = hashMap21.get((java.lang.Object) hashMap23);
        system.classfixer.classes.HashMap.Entry[] entryArray27 = hashMap23.table;
        hashMap14.table = entryArray27;
        java.lang.Object obj29 = hashMap4.remove((java.lang.Object) entryArray27);
        hashMap2.table = entryArray27;
        hashMap1.table = entryArray27;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 100);
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        java.lang.Object obj4 = hashMap2.remove((java.lang.Object) 0.0f);
        hashMap2.modCount = (byte) 100;
        hashMap2.clear();
        hashMap2.modCount = 0;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        java.lang.Object obj12 = hashMap10.remove((java.lang.Object) 0.0f);
        hashMap10.modCount = (byte) 100;
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap10.table;
        hashMap2.table = entryArray15;
        hashMap1.table = entryArray15;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean2 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap1.table;
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap1.table;
        int int5 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        boolean boolean7 = hashMap6.repOK();
        hashMap6.clear();
        hashMap6.clear();
        java.lang.Object obj10 = hashMap1.remove((java.lang.Object) hashMap6);
        hashMap6.modCount = (byte) 0;
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap(100);
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap14.table;
        hashMap6.table = entryArray15;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap6", hashMap6.repOK_2());
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        hashMap0.clear();
        hashMap0.clear();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap(0);
        boolean boolean7 = hashMap6.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap6.table;
        hashMap0.table = entryArray8;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap(0);
        int int4 = hashMap3.modCount;
        java.lang.Object obj7 = hashMap3.put((java.lang.Object) 1.0f, (java.lang.Object) (byte) 100);
        int int8 = hashMap3.size();
        java.lang.Object obj9 = hashMap0.get((java.lang.Object) int8);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        boolean boolean11 = hashMap10.repOK();
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = hashMap0.put((java.lang.Object) hashMap10, obj12);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean3 = hashMap2.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap2.table;
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap2.table;
        int int6 = hashMap2.modCount;
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) (short) 10, (float) 2);
        java.lang.Object obj10 = hashMap0.put((java.lang.Object) hashMap2, (java.lang.Object) hashMap9);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 0.0f);
        hashMap0.modCount = (byte) 100;
        hashMap0.clear();
        hashMap0.modCount = '#';
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.repOK();
        hashMap8.clear();
        int int11 = hashMap8.size();
        int int12 = hashMap8.size();
        int int13 = hashMap8.size();
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap8.table;
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        java.lang.Object obj17 = hashMap15.remove((java.lang.Object) 0.0f);
        hashMap15.modCount = (byte) 100;
        hashMap15.clear();
        java.lang.Object obj21 = hashMap0.put((java.lang.Object) entryArray14, (java.lang.Object) hashMap15);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean2 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap3.remove((java.lang.Object) 0.0f);
        java.lang.Object obj6 = hashMap1.get((java.lang.Object) hashMap3);
        boolean boolean7 = hashMap3.isEmpty();
        boolean boolean8 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        boolean boolean10 = hashMap9.repOK();
        hashMap9.clear();
        hashMap9.clear();
        boolean boolean13 = hashMap9.repOK();
        java.lang.Object obj14 = hashMap3.remove((java.lang.Object) hashMap9);
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap16.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap16.table;
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap(100);
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap((int) (byte) 10, (float) 3);
        hashMap23.modCount = (short) -1;
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap((int) ' ');
        boolean boolean28 = hashMap27.isEmpty();
        boolean boolean29 = hashMap27.repOK();
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap();
        boolean boolean31 = hashMap30.repOK();
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Object obj34 = hashMap30.put(obj32, (java.lang.Object) 100);
        int int35 = hashMap30.modCount;
        java.lang.Object obj36 = hashMap27.remove((java.lang.Object) int35);
        system.classfixer.classes.HashMap.Entry[] entryArray37 = hashMap27.table;
        java.lang.Object obj38 = hashMap20.put((java.lang.Object) (short) -1, (java.lang.Object) hashMap27);
        java.lang.Object obj39 = hashMap9.put((java.lang.Object) entryArray18, (java.lang.Object) hashMap20);
        system.classfixer.classes.HashMap hashMap41 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean42 = hashMap41.isEmpty();
        system.classfixer.classes.HashMap hashMap43 = new system.classfixer.classes.HashMap();
        java.lang.Object obj45 = hashMap43.remove((java.lang.Object) 0.0f);
        java.lang.Object obj46 = hashMap41.get((java.lang.Object) hashMap43);
        boolean boolean47 = hashMap43.isEmpty();
        boolean boolean48 = hashMap43.isEmpty();
        system.classfixer.classes.HashMap hashMap49 = new system.classfixer.classes.HashMap();
        boolean boolean50 = hashMap49.repOK();
        hashMap49.clear();
        hashMap49.clear();
        boolean boolean53 = hashMap49.repOK();
        java.lang.Object obj54 = hashMap43.remove((java.lang.Object) hashMap49);
        system.classfixer.classes.HashMap hashMap56 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap56.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray58 = hashMap56.table;
        system.classfixer.classes.HashMap hashMap60 = new system.classfixer.classes.HashMap(100);
        system.classfixer.classes.HashMap hashMap63 = new system.classfixer.classes.HashMap((int) (byte) 10, (float) 3);
        hashMap63.modCount = (short) -1;
        system.classfixer.classes.HashMap hashMap67 = new system.classfixer.classes.HashMap((int) ' ');
        boolean boolean68 = hashMap67.isEmpty();
        boolean boolean69 = hashMap67.repOK();
        system.classfixer.classes.HashMap hashMap70 = new system.classfixer.classes.HashMap();
        boolean boolean71 = hashMap70.repOK();
        java.lang.Object obj72 = new java.lang.Object();
        java.lang.Object obj74 = hashMap70.put(obj72, (java.lang.Object) 100);
        int int75 = hashMap70.modCount;
        java.lang.Object obj76 = hashMap67.remove((java.lang.Object) int75);
        system.classfixer.classes.HashMap.Entry[] entryArray77 = hashMap67.table;
        java.lang.Object obj78 = hashMap60.put((java.lang.Object) (short) -1, (java.lang.Object) hashMap67);
        java.lang.Object obj79 = hashMap49.put((java.lang.Object) entryArray58, (java.lang.Object) hashMap60);
        hashMap9.table = entryArray58;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap9", hashMap9.repOK_2());
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean2 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap3.remove((java.lang.Object) 0.0f);
        java.lang.Object obj6 = hashMap1.get((java.lang.Object) hashMap3);
        int int7 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.repOK();
        hashMap8.clear();
        int int11 = hashMap8.size();
        int int12 = hashMap8.size();
        java.lang.Object obj13 = hashMap1.get((java.lang.Object) int12);
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap((int) '4', (float) '#');
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap16.table;
        hashMap1.table = entryArray17;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        int int2 = hashMap1.modCount;
        java.lang.Object obj5 = hashMap1.put((java.lang.Object) 1.0f, (java.lang.Object) (byte) 100);
        hashMap1.modCount = 0;
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap9.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap9.table;
        boolean boolean12 = hashMap9.isEmpty();
        int int13 = hashMap9.size();
        boolean boolean14 = hashMap9.repOK();
        hashMap9.modCount = 32;
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap9.table;
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap19.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap19.table;
        boolean boolean22 = hashMap19.isEmpty();
        int int23 = hashMap19.size();
        boolean boolean24 = hashMap19.repOK();
        hashMap19.modCount = 32;
        system.classfixer.classes.HashMap.Entry[] entryArray27 = hashMap19.table;
        java.lang.Object obj28 = hashMap1.put((java.lang.Object) hashMap9, (java.lang.Object) hashMap19);
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap();
        java.lang.Object obj31 = hashMap29.remove((java.lang.Object) 0.0f);
        hashMap29.modCount = (byte) 100;
        hashMap29.clear();
        system.classfixer.classes.HashMap hashMap36 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean37 = hashMap36.isEmpty();
        system.classfixer.classes.HashMap hashMap38 = new system.classfixer.classes.HashMap();
        java.lang.Object obj40 = hashMap38.remove((java.lang.Object) 0.0f);
        java.lang.Object obj41 = hashMap36.get((java.lang.Object) hashMap38);
        system.classfixer.classes.HashMap.Entry[] entryArray42 = hashMap38.table;
        hashMap29.table = entryArray42;
        hashMap9.table = entryArray42;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap9", hashMap9.repOK_2());
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        boolean boolean2 = hashMap0.isEmpty();
        int int3 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap5.table;
        hashMap0.table = entryArray6;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        int int3 = hashMap0.size();
        int int4 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap(0);
        int int7 = hashMap6.modCount;
        java.lang.Object obj8 = hashMap0.get((java.lang.Object) int7);
        boolean boolean9 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray12 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap11.table = entryArray12;
        hashMap0.table = entryArray12;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) ' ', (float) (short) 100);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray5 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap4.table = entryArray5;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap(0);
        boolean boolean9 = hashMap8.isEmpty();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray12 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap11.table = entryArray12;
        hashMap8.table = entryArray12;
        hashMap4.table = entryArray12;
        hashMap2.table = entryArray12;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 1, (float) 100L);
        int int3 = hashMap2.modCount;
        int int4 = hashMap2.size();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap2.table;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        boolean boolean7 = hashMap6.repOK();
        hashMap6.clear();
        int int9 = hashMap6.size();
        int int10 = hashMap6.size();
        int int11 = hashMap6.size();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap6.table;
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = hashMap6.get(obj13);
        boolean boolean16 = hashMap6.repOK();
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean19 = hashMap18.isEmpty();
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        java.lang.Object obj22 = hashMap20.remove((java.lang.Object) 0.0f);
        java.lang.Object obj23 = hashMap18.get((java.lang.Object) hashMap20);
        boolean boolean24 = hashMap20.isEmpty();
        boolean boolean25 = hashMap20.isEmpty();
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap();
        boolean boolean27 = hashMap26.repOK();
        hashMap26.clear();
        hashMap26.clear();
        boolean boolean30 = hashMap26.repOK();
        java.lang.Object obj31 = hashMap20.remove((java.lang.Object) hashMap26);
        java.lang.Object obj32 = hashMap2.put((java.lang.Object) boolean16, (java.lang.Object) hashMap26);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap((int) (byte) 0);
        java.lang.Object obj4 = hashMap1.get((java.lang.Object) hashMap3);
        int int5 = hashMap3.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap3.table;
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap(100, (float) 1);
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap9.table;
        hashMap9.modCount = 0;
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap9.table;
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        boolean boolean15 = hashMap14.repOK();
        hashMap14.clear();
        int int17 = hashMap14.size();
        int int18 = hashMap14.size();
        int int19 = hashMap14.size();
        system.classfixer.classes.HashMap.Entry[] entryArray20 = hashMap14.table;
        java.lang.Object obj21 = hashMap3.put((java.lang.Object) hashMap9, (java.lang.Object) hashMap14);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap3", hashMap3.repOK_2());
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap((int) (byte) 0);
        java.lang.Object obj4 = hashMap1.get((java.lang.Object) hashMap3);
        int int5 = hashMap3.modCount;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        java.lang.Object obj8 = hashMap6.remove((java.lang.Object) 0.0f);
        hashMap6.modCount = (byte) 100;
        hashMap6.clear();
        hashMap6.modCount = 0;
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap6.table;
        hashMap3.table = entryArray14;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap3", hashMap3.repOK_2());
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj4 = hashMap0.put(obj2, (java.lang.Object) 100);
        hashMap0.clear();
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = new java.lang.Object();
        java.lang.Object obj8 = hashMap0.put(obj6, obj7);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap(0, 100.0f);
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) 0);
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap(100, (float) 1);
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap15.table;
        hashMap15.modCount = 0;
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap15.table;
        hashMap0.table = entryArray19;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        int int2 = hashMap1.modCount;
        java.lang.Object obj5 = hashMap1.put((java.lang.Object) 1.0f, (java.lang.Object) (byte) 100);
        int int6 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        boolean boolean8 = hashMap7.repOK();
        hashMap7.clear();
        int int10 = hashMap7.size();
        int int11 = hashMap7.size();
        int int12 = hashMap7.size();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap7.table;
        java.lang.Object obj14 = hashMap1.remove((java.lang.Object) hashMap7);
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap((int) (short) 100, (float) 10);
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap(0);
        boolean boolean20 = hashMap19.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap19.table;
        java.lang.Object obj22 = hashMap7.put((java.lang.Object) hashMap17, (java.lang.Object) hashMap19);
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap((int) (short) 1, (float) 1L);
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean28 = hashMap27.isEmpty();
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap();
        java.lang.Object obj31 = hashMap29.remove((java.lang.Object) 0.0f);
        java.lang.Object obj32 = hashMap27.get((java.lang.Object) hashMap29);
        int int33 = hashMap27.modCount;
        java.lang.Class<?> wildcardClass34 = hashMap27.getClass();
        java.lang.Object obj35 = hashMap7.put((java.lang.Object) 1L, (java.lang.Object) wildcardClass34);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap7", hashMap7.repOK_2());
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 100);
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        boolean boolean3 = hashMap2.repOK();
        hashMap2.clear();
        int int5 = hashMap2.size();
        int int6 = hashMap2.size();
        int int7 = hashMap2.size();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap2.table;
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        java.lang.Object obj11 = hashMap2.get(obj9);
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        java.lang.Object obj14 = hashMap12.remove((java.lang.Object) 0.0f);
        hashMap12.modCount = (byte) 100;
        hashMap12.clear();
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean20 = hashMap19.isEmpty();
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap();
        java.lang.Object obj23 = hashMap21.remove((java.lang.Object) 0.0f);
        java.lang.Object obj24 = hashMap19.get((java.lang.Object) hashMap21);
        system.classfixer.classes.HashMap.Entry[] entryArray25 = hashMap21.table;
        hashMap12.table = entryArray25;
        java.lang.Object obj27 = hashMap2.remove((java.lang.Object) entryArray25);
        hashMap1.table = entryArray25;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) ' ');
        boolean boolean2 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap1.table;
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        boolean boolean5 = hashMap4.repOK();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object obj8 = hashMap4.put(obj6, (java.lang.Object) 100);
        hashMap4.clear();
        int int10 = hashMap4.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap4.table;
        hashMap1.table = entryArray11;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        int int3 = hashMap0.size();
        int int4 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        java.lang.Object obj7 = hashMap5.remove((java.lang.Object) 0.0f);
        hashMap5.modCount = (byte) 100;
        java.lang.Object obj10 = hashMap0.get((java.lang.Object) (byte) 100);
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) 'a');
        boolean boolean13 = hashMap12.isEmpty();
        int int14 = hashMap12.modCount;
        java.lang.Object obj15 = hashMap0.get((java.lang.Object) int14);
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        boolean boolean17 = hashMap16.repOK();
        hashMap16.clear();
        int int19 = hashMap16.size();
        int int20 = hashMap16.size();
        int int21 = hashMap16.size();
        system.classfixer.classes.HashMap.Entry[] entryArray22 = hashMap16.table;
        java.lang.Object obj23 = null;
        java.lang.Object obj24 = hashMap16.remove(obj23);
        java.lang.Object obj25 = hashMap0.remove(obj24);
        hashMap0.modCount = (byte) 0;
        system.classfixer.classes.HashMap.Entry[] entryArray28 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap();
        boolean boolean30 = hashMap29.repOK();
        hashMap29.clear();
        int int32 = hashMap29.size();
        java.lang.Object obj33 = null;
        java.lang.Object obj34 = hashMap29.remove(obj33);
        system.classfixer.classes.HashMap hashMap36 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap36.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray38 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap36.table = entryArray38;
        int int40 = hashMap36.size();
        java.lang.Object obj41 = hashMap29.remove((java.lang.Object) int40);
        java.lang.Object obj42 = hashMap0.get(obj41);
        system.classfixer.classes.HashMap hashMap44 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap44.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray46 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap44.table = entryArray46;
        hashMap0.table = entryArray46;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) ' ', (float) (short) 100);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap3.remove((java.lang.Object) 0.0f);
        hashMap3.modCount = (byte) 100;
        hashMap3.clear();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean11 = hashMap10.isEmpty();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        java.lang.Object obj14 = hashMap12.remove((java.lang.Object) 0.0f);
        java.lang.Object obj15 = hashMap10.get((java.lang.Object) hashMap12);
        boolean boolean16 = hashMap12.isEmpty();
        boolean boolean17 = hashMap12.isEmpty();
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        boolean boolean19 = hashMap18.repOK();
        hashMap18.clear();
        int int21 = hashMap18.size();
        int int22 = hashMap18.size();
        int int23 = hashMap18.size();
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap18.table;
        hashMap18.clear();
        java.lang.Object obj26 = hashMap3.put((java.lang.Object) hashMap12, (java.lang.Object) hashMap18);
        int int27 = hashMap18.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray28 = hashMap18.table;
        hashMap2.table = entryArray28;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 0.0f);
        hashMap0.modCount = (byte) 100;
        hashMap0.clear();
        hashMap0.modCount = 0;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        java.lang.Object obj10 = hashMap8.remove((java.lang.Object) 0.0f);
        hashMap8.modCount = (byte) 100;
        hashMap8.clear();
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean16 = hashMap15.isEmpty();
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        java.lang.Object obj19 = hashMap17.remove((java.lang.Object) 0.0f);
        java.lang.Object obj20 = hashMap15.get((java.lang.Object) hashMap17);
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap17.table;
        hashMap8.table = entryArray21;
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap();
        boolean boolean24 = hashMap23.repOK();
        hashMap23.clear();
        int int26 = hashMap23.size();
        int int27 = hashMap23.size();
        int int28 = hashMap23.size();
        system.classfixer.classes.HashMap.Entry[] entryArray29 = hashMap23.table;
        java.lang.Object obj30 = new java.lang.Object();
        java.lang.Class<?> wildcardClass31 = obj30.getClass();
        java.lang.Object obj32 = hashMap23.get(obj30);
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap();
        java.lang.Object obj35 = hashMap33.remove((java.lang.Object) 0.0f);
        hashMap33.modCount = (byte) 100;
        hashMap33.clear();
        system.classfixer.classes.HashMap hashMap40 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean41 = hashMap40.isEmpty();
        system.classfixer.classes.HashMap hashMap42 = new system.classfixer.classes.HashMap();
        java.lang.Object obj44 = hashMap42.remove((java.lang.Object) 0.0f);
        java.lang.Object obj45 = hashMap40.get((java.lang.Object) hashMap42);
        system.classfixer.classes.HashMap.Entry[] entryArray46 = hashMap42.table;
        hashMap33.table = entryArray46;
        java.lang.Object obj48 = hashMap23.remove((java.lang.Object) entryArray46);
        hashMap8.table = entryArray46;
        hashMap0.table = entryArray46;
        system.classfixer.classes.HashMap hashMap51 = new system.classfixer.classes.HashMap();
        boolean boolean52 = hashMap51.repOK();
        hashMap51.clear();
        int int54 = hashMap51.size();
        int int55 = hashMap51.size();
        int int56 = hashMap51.size();
        system.classfixer.classes.HashMap.Entry[] entryArray57 = hashMap51.table;
        java.lang.Object obj58 = new java.lang.Object();
        java.lang.Class<?> wildcardClass59 = obj58.getClass();
        java.lang.Object obj60 = hashMap51.get(obj58);
        int int61 = hashMap51.size();
        system.classfixer.classes.HashMap hashMap63 = new system.classfixer.classes.HashMap((int) (short) 10);
        hashMap63.clear();
        java.lang.Object obj65 = hashMap0.put((java.lang.Object) int61, (java.lang.Object) hashMap63);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj4 = hashMap0.put(obj2, (java.lang.Object) 100);
        int int5 = hashMap0.modCount;
        java.lang.Object obj6 = null;
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        boolean boolean8 = hashMap7.repOK();
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object obj11 = hashMap7.put(obj9, (java.lang.Object) 100);
        hashMap7.clear();
        java.lang.Object obj13 = null;
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Object obj15 = hashMap7.put(obj13, obj14);
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap(0, 100.0f);
        java.lang.Object obj19 = hashMap7.remove((java.lang.Object) 0);
        java.lang.Object obj20 = hashMap0.put(obj6, (java.lang.Object) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        boolean boolean2 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean5 = hashMap4.isEmpty();
        java.lang.Object obj7 = hashMap1.put((java.lang.Object) boolean5, (java.lang.Object) 10L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        int int3 = hashMap0.size();
        int int4 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        java.lang.Object obj7 = hashMap5.remove((java.lang.Object) 0.0f);
        hashMap5.modCount = (byte) 100;
        java.lang.Object obj10 = hashMap0.get((java.lang.Object) (byte) 100);
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean13 = hashMap12.isEmpty();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        java.lang.Object obj16 = hashMap14.remove((java.lang.Object) 0.0f);
        java.lang.Object obj17 = hashMap12.get((java.lang.Object) hashMap14);
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap(100);
        system.classfixer.classes.HashMap.Entry[] entryArray20 = hashMap19.table;
        java.lang.Object obj21 = hashMap12.remove((java.lang.Object) hashMap19);
        int int22 = hashMap12.modCount;
        boolean boolean23 = hashMap12.isEmpty();
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap((int) 'a');
        boolean boolean26 = hashMap25.isEmpty();
        int int27 = hashMap25.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray28 = hashMap25.table;
        java.lang.Object obj29 = hashMap0.put((java.lang.Object) boolean23, (java.lang.Object) hashMap25);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray2 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap1.table = entryArray2;
        hashMap1.modCount = (short) -1;
        boolean boolean6 = hashMap1.repOK();
        boolean boolean7 = hashMap1.repOK();
        int int8 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        boolean boolean10 = hashMap9.repOK();
        hashMap9.clear();
        int int12 = hashMap9.size();
        int int13 = hashMap9.size();
        int int14 = hashMap9.size();
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap9.table;
        hashMap1.table = entryArray15;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) '4', (float) '#');
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap(0, 100.0f);
        java.lang.Object obj6 = hashMap2.get((java.lang.Object) 0);
        boolean boolean7 = hashMap2.repOK();
        int int8 = hashMap2.size();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap2.table;
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap(0);
        boolean boolean12 = hashMap11.isEmpty();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray15 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap14.table = entryArray15;
        hashMap11.table = entryArray15;
        int int18 = hashMap11.modCount;
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap20.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray22 = hashMap20.table;
        hashMap11.table = entryArray22;
        hashMap2.table = entryArray22;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        int int3 = hashMap0.size();
        int int4 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        boolean boolean6 = hashMap5.repOK();
        hashMap5.clear();
        int int8 = hashMap5.size();
        int int9 = hashMap5.size();
        int int10 = hashMap5.size();
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap5.table;
        hashMap5.modCount = (byte) 1;
        java.lang.Object obj14 = hashMap0.get((java.lang.Object) hashMap5);
        hashMap5.modCount = (short) -1;
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean19 = hashMap18.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray20 = hashMap18.table;
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap18.table;
        int int22 = hashMap18.modCount;
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap();
        boolean boolean24 = hashMap23.repOK();
        hashMap23.clear();
        hashMap23.clear();
        java.lang.Object obj27 = hashMap18.remove((java.lang.Object) hashMap23);
        hashMap23.clear();
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap((int) 'a');
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap((int) (byte) 0);
        java.lang.Object obj33 = hashMap30.get((java.lang.Object) hashMap32);
        int int34 = hashMap32.modCount;
        int int35 = hashMap32.size();
        system.classfixer.classes.HashMap hashMap37 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean38 = hashMap37.isEmpty();
        system.classfixer.classes.HashMap hashMap39 = new system.classfixer.classes.HashMap();
        java.lang.Object obj41 = hashMap39.remove((java.lang.Object) 0.0f);
        java.lang.Object obj42 = hashMap37.get((java.lang.Object) hashMap39);
        system.classfixer.classes.HashMap hashMap44 = new system.classfixer.classes.HashMap(100);
        system.classfixer.classes.HashMap.Entry[] entryArray45 = hashMap44.table;
        java.lang.Object obj46 = hashMap37.remove((java.lang.Object) hashMap44);
        int int47 = hashMap37.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray48 = hashMap37.table;
        hashMap32.table = entryArray48;
        java.lang.Object obj50 = hashMap5.put((java.lang.Object) hashMap23, (java.lang.Object) entryArray48);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap5", hashMap5.repOK_2());
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) '4', (float) '#');
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.repOK();
        hashMap3.clear();
        hashMap3.clear();
        java.lang.Object obj7 = hashMap2.get((java.lang.Object) hashMap3);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.repOK();
        hashMap8.clear();
        hashMap8.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap8.table;
        hashMap2.table = entryArray12;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) ' ');
        boolean boolean2 = hashMap1.isEmpty();
        boolean boolean3 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) ' ');
        boolean boolean6 = hashMap5.isEmpty();
        boolean boolean7 = hashMap5.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap5.table;
        hashMap1.table = entryArray8;
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap(100, (float) 1);
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap12.table;
        hashMap12.modCount = 0;
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap12.table;
        hashMap1.table = entryArray16;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean2 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap1.table;
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap1.table;
        int int5 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        boolean boolean7 = hashMap6.repOK();
        hashMap6.clear();
        hashMap6.clear();
        java.lang.Object obj10 = hashMap1.remove((java.lang.Object) hashMap6);
        boolean boolean11 = hashMap1.repOK();
        boolean boolean12 = hashMap1.isEmpty();
        hashMap1.modCount = (short) 0;
        java.lang.Object obj16 = hashMap1.get((java.lang.Object) 10.0d);
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        boolean boolean18 = hashMap17.repOK();
        hashMap17.clear();
        int int20 = hashMap17.size();
        int int21 = hashMap17.size();
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap(0);
        int int24 = hashMap23.modCount;
        java.lang.Object obj25 = hashMap17.get((java.lang.Object) int24);
        boolean boolean26 = hashMap17.repOK();
        java.lang.Class<?> wildcardClass27 = hashMap17.getClass();
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap(100, (float) 1L);
        java.lang.Object obj31 = hashMap1.put((java.lang.Object) wildcardClass27, (java.lang.Object) 1L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        int int3 = hashMap0.size();
        int int4 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap(0);
        int int7 = hashMap6.modCount;
        java.lang.Object obj8 = hashMap0.get((java.lang.Object) int7);
        boolean boolean9 = hashMap0.isEmpty();
        hashMap0.clear();
        boolean boolean11 = hashMap0.isEmpty();
        boolean boolean12 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap14.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap14.table;
        boolean boolean17 = hashMap14.isEmpty();
        int int18 = hashMap14.size();
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap14.table;
        hashMap0.table = entryArray19;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean2 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap3.remove((java.lang.Object) 0.0f);
        java.lang.Object obj6 = hashMap1.get((java.lang.Object) hashMap3);
        int int7 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.repOK();
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Object obj12 = hashMap8.put(obj10, (java.lang.Object) 100);
        hashMap8.clear();
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Object obj16 = hashMap8.put(obj14, obj15);
        java.lang.Object obj17 = hashMap1.get((java.lang.Object) hashMap8);
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        boolean boolean19 = hashMap18.repOK();
        hashMap18.clear();
        int int21 = hashMap18.size();
        int int22 = hashMap18.size();
        int int23 = hashMap18.size();
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap18.table;
        java.lang.Object obj25 = null;
        java.lang.Object obj26 = hashMap18.remove(obj25);
        java.lang.Object obj27 = hashMap8.remove((java.lang.Object) hashMap18);
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap29.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray31 = hashMap29.table;
        boolean boolean32 = hashMap29.isEmpty();
        int int33 = hashMap29.size();
        boolean boolean34 = hashMap29.repOK();
        hashMap29.modCount = 32;
        system.classfixer.classes.HashMap.Entry[] entryArray37 = hashMap29.table;
        hashMap18.table = entryArray37;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap18", hashMap18.repOK_2());
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        int int3 = hashMap0.size();
        int int4 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap(0);
        int int7 = hashMap6.modCount;
        java.lang.Object obj8 = hashMap0.get((java.lang.Object) int7);
        boolean boolean9 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        boolean boolean11 = hashMap10.repOK();
        hashMap10.clear();
        hashMap10.clear();
        boolean boolean14 = hashMap10.repOK();
        boolean boolean15 = hashMap10.repOK();
        java.lang.Object obj16 = hashMap0.remove((java.lang.Object) boolean15);
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean19 = hashMap18.isEmpty();
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        java.lang.Object obj22 = hashMap20.remove((java.lang.Object) 0.0f);
        java.lang.Object obj23 = hashMap18.get((java.lang.Object) hashMap20);
        boolean boolean24 = hashMap20.isEmpty();
        boolean boolean25 = hashMap20.isEmpty();
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap();
        boolean boolean27 = hashMap26.repOK();
        hashMap26.clear();
        hashMap26.clear();
        boolean boolean30 = hashMap26.repOK();
        java.lang.Object obj31 = hashMap20.remove((java.lang.Object) hashMap26);
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap33.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray35 = hashMap33.table;
        system.classfixer.classes.HashMap hashMap37 = new system.classfixer.classes.HashMap(100);
        system.classfixer.classes.HashMap hashMap40 = new system.classfixer.classes.HashMap((int) (byte) 10, (float) 3);
        hashMap40.modCount = (short) -1;
        system.classfixer.classes.HashMap hashMap44 = new system.classfixer.classes.HashMap((int) ' ');
        boolean boolean45 = hashMap44.isEmpty();
        boolean boolean46 = hashMap44.repOK();
        system.classfixer.classes.HashMap hashMap47 = new system.classfixer.classes.HashMap();
        boolean boolean48 = hashMap47.repOK();
        java.lang.Object obj49 = new java.lang.Object();
        java.lang.Object obj51 = hashMap47.put(obj49, (java.lang.Object) 100);
        int int52 = hashMap47.modCount;
        java.lang.Object obj53 = hashMap44.remove((java.lang.Object) int52);
        system.classfixer.classes.HashMap.Entry[] entryArray54 = hashMap44.table;
        java.lang.Object obj55 = hashMap37.put((java.lang.Object) (short) -1, (java.lang.Object) hashMap44);
        java.lang.Object obj56 = hashMap26.put((java.lang.Object) entryArray35, (java.lang.Object) hashMap37);
        hashMap26.clear();
        system.classfixer.classes.HashMap hashMap60 = new system.classfixer.classes.HashMap(101, (float) 3);
        system.classfixer.classes.HashMap hashMap63 = new system.classfixer.classes.HashMap((int) (short) 1, (float) 100L);
        int int64 = hashMap63.modCount;
        int int65 = hashMap63.size();
        system.classfixer.classes.HashMap.Entry[] entryArray66 = hashMap63.table;
        java.lang.Object obj67 = hashMap60.remove((java.lang.Object) entryArray66);
        java.lang.Object obj68 = hashMap0.put((java.lang.Object) hashMap26, (java.lang.Object) hashMap60);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object obj4 = hashMap0.put(obj2, (java.lang.Object) 100);
        java.lang.Class<?> wildcardClass5 = hashMap0.getClass();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(100, (float) 1);
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap2.table;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray6 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap5.table = entryArray6;
        boolean boolean8 = hashMap5.repOK();
        int int9 = hashMap5.size();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        boolean boolean11 = hashMap10.repOK();
        boolean boolean12 = hashMap10.isEmpty();
        int int13 = hashMap10.modCount;
        java.lang.Object obj14 = hashMap2.put((java.lang.Object) int9, (java.lang.Object) hashMap10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) '4', (float) '#');
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap(0, 100.0f);
        java.lang.Object obj6 = hashMap2.get((java.lang.Object) 0);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) 'a');
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap((int) (short) 1, (float) 100L);
        int int12 = hashMap11.modCount;
        java.lang.Object obj13 = hashMap8.get((java.lang.Object) int12);
        java.lang.Object obj14 = hashMap2.remove((java.lang.Object) hashMap8);
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean17 = hashMap16.isEmpty();
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        java.lang.Object obj20 = hashMap18.remove((java.lang.Object) 0.0f);
        java.lang.Object obj21 = hashMap16.get((java.lang.Object) hashMap18);
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap(100);
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap23.table;
        java.lang.Object obj25 = hashMap16.remove((java.lang.Object) hashMap23);
        int int26 = hashMap16.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray27 = hashMap16.table;
        hashMap8.table = entryArray27;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap8", hashMap8.repOK_2());
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        boolean boolean2 = hashMap1.isEmpty();
        int int3 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap(0);
        boolean boolean6 = hashMap5.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap5.table;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.repOK();
        hashMap8.clear();
        int int11 = hashMap8.size();
        int int12 = hashMap8.size();
        int int13 = hashMap8.size();
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap8.table;
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = hashMap8.get(obj15);
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        java.lang.Object obj20 = hashMap18.remove((java.lang.Object) 0.0f);
        hashMap18.modCount = (byte) 100;
        hashMap18.clear();
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean26 = hashMap25.isEmpty();
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap();
        java.lang.Object obj29 = hashMap27.remove((java.lang.Object) 0.0f);
        java.lang.Object obj30 = hashMap25.get((java.lang.Object) hashMap27);
        system.classfixer.classes.HashMap.Entry[] entryArray31 = hashMap27.table;
        hashMap18.table = entryArray31;
        java.lang.Object obj33 = hashMap8.remove((java.lang.Object) entryArray31);
        java.lang.Object obj34 = hashMap1.put((java.lang.Object) hashMap5, (java.lang.Object) entryArray31);
        hashMap1.modCount = '#';
        system.classfixer.classes.HashMap hashMap37 = new system.classfixer.classes.HashMap();
        boolean boolean38 = hashMap37.repOK();
        hashMap37.clear();
        hashMap37.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray41 = hashMap37.table;
        boolean boolean42 = hashMap37.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray43 = hashMap37.table;
        hashMap1.table = entryArray43;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 10);
        hashMap1.clear();
        hashMap1.clear();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap(101, (float) 3);
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) (short) 1, (float) 100L);
        int int10 = hashMap9.modCount;
        int int11 = hashMap9.size();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap9.table;
        java.lang.Object obj13 = hashMap6.remove((java.lang.Object) entryArray12);
        java.lang.Object obj14 = hashMap1.get((java.lang.Object) hashMap6);
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        java.lang.Object obj17 = hashMap15.remove((java.lang.Object) 0.0f);
        hashMap15.modCount = (byte) 100;
        hashMap15.clear();
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean23 = hashMap22.isEmpty();
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap();
        java.lang.Object obj26 = hashMap24.remove((java.lang.Object) 0.0f);
        java.lang.Object obj27 = hashMap22.get((java.lang.Object) hashMap24);
        system.classfixer.classes.HashMap.Entry[] entryArray28 = hashMap24.table;
        hashMap15.table = entryArray28;
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap();
        java.lang.Object obj32 = hashMap30.remove((java.lang.Object) 0.0f);
        hashMap30.modCount = (byte) 100;
        hashMap30.clear();
        hashMap30.modCount = 0;
        system.classfixer.classes.HashMap.Entry[] entryArray38 = hashMap30.table;
        hashMap15.table = entryArray38;
        system.classfixer.classes.HashMap.Entry[] entryArray40 = hashMap15.table;
        hashMap6.table = entryArray40;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap6", hashMap6.repOK_2());
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        int int2 = hashMap1.modCount;
        java.lang.Object obj5 = hashMap1.put((java.lang.Object) 1.0f, (java.lang.Object) (byte) 100);
        hashMap1.modCount = 0;
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap9.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap9.table;
        boolean boolean12 = hashMap9.isEmpty();
        int int13 = hashMap9.size();
        boolean boolean14 = hashMap9.repOK();
        hashMap9.modCount = 32;
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap9.table;
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap19.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap19.table;
        boolean boolean22 = hashMap19.isEmpty();
        int int23 = hashMap19.size();
        boolean boolean24 = hashMap19.repOK();
        hashMap19.modCount = 32;
        system.classfixer.classes.HashMap.Entry[] entryArray27 = hashMap19.table;
        java.lang.Object obj28 = hashMap1.put((java.lang.Object) hashMap9, (java.lang.Object) hashMap19);
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap();
        java.lang.Object obj31 = hashMap29.remove((java.lang.Object) 0.0f);
        hashMap29.modCount = (byte) 100;
        hashMap29.clear();
        system.classfixer.classes.HashMap hashMap36 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean37 = hashMap36.isEmpty();
        system.classfixer.classes.HashMap hashMap38 = new system.classfixer.classes.HashMap();
        java.lang.Object obj40 = hashMap38.remove((java.lang.Object) 0.0f);
        java.lang.Object obj41 = hashMap36.get((java.lang.Object) hashMap38);
        system.classfixer.classes.HashMap.Entry[] entryArray42 = hashMap38.table;
        hashMap29.table = entryArray42;
        system.classfixer.classes.HashMap hashMap44 = new system.classfixer.classes.HashMap();
        boolean boolean45 = hashMap44.repOK();
        hashMap44.clear();
        int int47 = hashMap44.size();
        int int48 = hashMap44.size();
        int int49 = hashMap44.size();
        system.classfixer.classes.HashMap.Entry[] entryArray50 = hashMap44.table;
        java.lang.Object obj51 = new java.lang.Object();
        java.lang.Class<?> wildcardClass52 = obj51.getClass();
        java.lang.Object obj53 = hashMap44.get(obj51);
        system.classfixer.classes.HashMap hashMap54 = new system.classfixer.classes.HashMap();
        java.lang.Object obj56 = hashMap54.remove((java.lang.Object) 0.0f);
        hashMap54.modCount = (byte) 100;
        hashMap54.clear();
        system.classfixer.classes.HashMap hashMap61 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean62 = hashMap61.isEmpty();
        system.classfixer.classes.HashMap hashMap63 = new system.classfixer.classes.HashMap();
        java.lang.Object obj65 = hashMap63.remove((java.lang.Object) 0.0f);
        java.lang.Object obj66 = hashMap61.get((java.lang.Object) hashMap63);
        system.classfixer.classes.HashMap.Entry[] entryArray67 = hashMap63.table;
        hashMap54.table = entryArray67;
        java.lang.Object obj69 = hashMap44.remove((java.lang.Object) entryArray67);
        hashMap29.table = entryArray67;
        hashMap9.table = entryArray67;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap9", hashMap9.repOK_2());
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        boolean boolean2 = hashMap1.isEmpty();
        int int3 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap(0);
        boolean boolean6 = hashMap5.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap5.table;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.repOK();
        hashMap8.clear();
        int int11 = hashMap8.size();
        int int12 = hashMap8.size();
        int int13 = hashMap8.size();
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap8.table;
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = hashMap8.get(obj15);
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        java.lang.Object obj20 = hashMap18.remove((java.lang.Object) 0.0f);
        hashMap18.modCount = (byte) 100;
        hashMap18.clear();
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean26 = hashMap25.isEmpty();
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap();
        java.lang.Object obj29 = hashMap27.remove((java.lang.Object) 0.0f);
        java.lang.Object obj30 = hashMap25.get((java.lang.Object) hashMap27);
        system.classfixer.classes.HashMap.Entry[] entryArray31 = hashMap27.table;
        hashMap18.table = entryArray31;
        java.lang.Object obj33 = hashMap8.remove((java.lang.Object) entryArray31);
        java.lang.Object obj34 = hashMap1.put((java.lang.Object) hashMap5, (java.lang.Object) entryArray31);
        boolean boolean35 = hashMap1.repOK();
        int int36 = hashMap1.size();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        boolean boolean2 = hashMap1.isEmpty();
        int int3 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap(0);
        boolean boolean6 = hashMap5.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap5.table;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.repOK();
        hashMap8.clear();
        int int11 = hashMap8.size();
        int int12 = hashMap8.size();
        int int13 = hashMap8.size();
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap8.table;
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = hashMap8.get(obj15);
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        java.lang.Object obj20 = hashMap18.remove((java.lang.Object) 0.0f);
        hashMap18.modCount = (byte) 100;
        hashMap18.clear();
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean26 = hashMap25.isEmpty();
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap();
        java.lang.Object obj29 = hashMap27.remove((java.lang.Object) 0.0f);
        java.lang.Object obj30 = hashMap25.get((java.lang.Object) hashMap27);
        system.classfixer.classes.HashMap.Entry[] entryArray31 = hashMap27.table;
        hashMap18.table = entryArray31;
        java.lang.Object obj33 = hashMap8.remove((java.lang.Object) entryArray31);
        java.lang.Object obj34 = hashMap1.put((java.lang.Object) hashMap5, (java.lang.Object) entryArray31);
        boolean boolean35 = hashMap1.repOK();
        java.lang.Class<?> wildcardClass36 = hashMap1.getClass();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        int int3 = hashMap0.size();
        int int4 = hashMap0.size();
        int int5 = hashMap0.size();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap8.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap8.table = entryArray10;
        hashMap0.table = entryArray10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        hashMap0.clear();
        int int2 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.repOK();
        hashMap3.clear();
        int int6 = hashMap3.size();
        int int7 = hashMap3.size();
        int int8 = hashMap3.size();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap3.table;
        hashMap3.clear();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        java.lang.Object obj13 = hashMap11.remove((java.lang.Object) 0.0f);
        hashMap11.modCount = (byte) 100;
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap11.table;
        java.lang.Object obj17 = hashMap3.remove((java.lang.Object) hashMap11);
        int int18 = hashMap11.modCount;
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap(100);
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap((int) (byte) 10, (float) 3);
        hashMap23.modCount = (short) -1;
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap((int) ' ');
        boolean boolean28 = hashMap27.isEmpty();
        boolean boolean29 = hashMap27.repOK();
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap();
        boolean boolean31 = hashMap30.repOK();
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Object obj34 = hashMap30.put(obj32, (java.lang.Object) 100);
        int int35 = hashMap30.modCount;
        java.lang.Object obj36 = hashMap27.remove((java.lang.Object) int35);
        system.classfixer.classes.HashMap.Entry[] entryArray37 = hashMap27.table;
        java.lang.Object obj38 = hashMap20.put((java.lang.Object) (short) -1, (java.lang.Object) hashMap27);
        system.classfixer.classes.HashMap hashMap39 = new system.classfixer.classes.HashMap();
        java.lang.Object obj41 = hashMap39.remove((java.lang.Object) 0.0f);
        hashMap39.modCount = (byte) 100;
        hashMap39.clear();
        int int45 = hashMap39.size();
        java.lang.Object obj46 = hashMap11.put((java.lang.Object) hashMap27, (java.lang.Object) int45);
        system.classfixer.classes.HashMap hashMap47 = new system.classfixer.classes.HashMap();
        boolean boolean48 = hashMap47.repOK();
        hashMap47.clear();
        int int50 = hashMap47.size();
        java.lang.Object obj51 = hashMap11.get((java.lang.Object) hashMap47);
        system.classfixer.classes.HashMap hashMap53 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean54 = hashMap53.isEmpty();
        system.classfixer.classes.HashMap hashMap55 = new system.classfixer.classes.HashMap();
        java.lang.Object obj57 = hashMap55.remove((java.lang.Object) 0.0f);
        java.lang.Object obj58 = hashMap53.get((java.lang.Object) hashMap55);
        system.classfixer.classes.HashMap hashMap60 = new system.classfixer.classes.HashMap(100);
        system.classfixer.classes.HashMap.Entry[] entryArray61 = hashMap60.table;
        java.lang.Object obj62 = hashMap53.remove((java.lang.Object) hashMap60);
        hashMap60.modCount = (short) -1;
        java.lang.Object obj65 = hashMap0.put((java.lang.Object) hashMap47, (java.lang.Object) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean2 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap3.remove((java.lang.Object) 0.0f);
        java.lang.Object obj6 = hashMap1.get((java.lang.Object) hashMap3);
        int int7 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        java.lang.Object obj10 = hashMap8.remove((java.lang.Object) 0.0f);
        hashMap8.modCount = (byte) 100;
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap8.table;
        java.lang.Object obj14 = hashMap1.remove((java.lang.Object) entryArray13);
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        boolean boolean16 = hashMap15.repOK();
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Object obj19 = hashMap15.put(obj17, (java.lang.Object) 100);
        hashMap15.clear();
        hashMap15.modCount = 3;
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap(100, (float) 1);
        system.classfixer.classes.HashMap.Entry[] entryArray26 = hashMap25.table;
        int int27 = hashMap25.size();
        boolean boolean28 = hashMap25.repOK();
        java.lang.Object obj29 = hashMap1.put((java.lang.Object) 3, (java.lang.Object) boolean28);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test71");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) '4', (float) '#');
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        boolean boolean4 = hashMap3.repOK();
        hashMap3.clear();
        hashMap3.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap3.table;
        hashMap2.table = entryArray7;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test72");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap1.table;
        boolean boolean4 = hashMap1.isEmpty();
        int int5 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap(0);
        boolean boolean8 = hashMap7.isEmpty();
        int int9 = hashMap7.modCount;
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap(0);
        boolean boolean12 = hashMap11.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap11.table;
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        boolean boolean15 = hashMap14.repOK();
        hashMap14.clear();
        int int17 = hashMap14.size();
        int int18 = hashMap14.size();
        int int19 = hashMap14.size();
        system.classfixer.classes.HashMap.Entry[] entryArray20 = hashMap14.table;
        java.lang.Object obj21 = new java.lang.Object();
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        java.lang.Object obj23 = hashMap14.get(obj21);
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap();
        java.lang.Object obj26 = hashMap24.remove((java.lang.Object) 0.0f);
        hashMap24.modCount = (byte) 100;
        hashMap24.clear();
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean32 = hashMap31.isEmpty();
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap();
        java.lang.Object obj35 = hashMap33.remove((java.lang.Object) 0.0f);
        java.lang.Object obj36 = hashMap31.get((java.lang.Object) hashMap33);
        system.classfixer.classes.HashMap.Entry[] entryArray37 = hashMap33.table;
        hashMap24.table = entryArray37;
        java.lang.Object obj39 = hashMap14.remove((java.lang.Object) entryArray37);
        java.lang.Object obj40 = hashMap7.put((java.lang.Object) hashMap11, (java.lang.Object) entryArray37);
        hashMap1.table = entryArray37;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test73");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) '#');
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean4 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        java.lang.Object obj7 = hashMap5.remove((java.lang.Object) 0.0f);
        java.lang.Object obj8 = hashMap3.get((java.lang.Object) hashMap5);
        int int9 = hashMap3.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap3.table;
        hashMap1.table = entryArray10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test74");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        int int2 = hashMap1.modCount;
        java.lang.Object obj5 = hashMap1.put((java.lang.Object) 1.0f, (java.lang.Object) (byte) 100);
        hashMap1.modCount = 0;
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap9.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap9.table;
        boolean boolean12 = hashMap9.isEmpty();
        int int13 = hashMap9.size();
        boolean boolean14 = hashMap9.repOK();
        hashMap9.modCount = 32;
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap9.table;
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap19.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap19.table;
        boolean boolean22 = hashMap19.isEmpty();
        int int23 = hashMap19.size();
        boolean boolean24 = hashMap19.repOK();
        hashMap19.modCount = 32;
        system.classfixer.classes.HashMap.Entry[] entryArray27 = hashMap19.table;
        java.lang.Object obj28 = hashMap1.put((java.lang.Object) hashMap9, (java.lang.Object) hashMap19);
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap();
        java.lang.Object obj31 = hashMap29.remove((java.lang.Object) 0.0f);
        hashMap29.modCount = (byte) 100;
        java.lang.Object obj34 = hashMap19.get((java.lang.Object) (byte) 100);
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap();
        boolean boolean36 = hashMap35.repOK();
        hashMap35.clear();
        int int38 = hashMap35.size();
        int int39 = hashMap35.size();
        int int40 = hashMap35.size();
        system.classfixer.classes.HashMap.Entry[] entryArray41 = hashMap35.table;
        java.lang.Object obj42 = new java.lang.Object();
        java.lang.Class<?> wildcardClass43 = obj42.getClass();
        java.lang.Object obj44 = hashMap35.get(obj42);
        system.classfixer.classes.HashMap hashMap45 = new system.classfixer.classes.HashMap();
        java.lang.Object obj47 = hashMap45.remove((java.lang.Object) 0.0f);
        hashMap45.modCount = (byte) 100;
        hashMap45.clear();
        system.classfixer.classes.HashMap hashMap52 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean53 = hashMap52.isEmpty();
        system.classfixer.classes.HashMap hashMap54 = new system.classfixer.classes.HashMap();
        java.lang.Object obj56 = hashMap54.remove((java.lang.Object) 0.0f);
        java.lang.Object obj57 = hashMap52.get((java.lang.Object) hashMap54);
        system.classfixer.classes.HashMap.Entry[] entryArray58 = hashMap54.table;
        hashMap45.table = entryArray58;
        java.lang.Object obj60 = hashMap35.remove((java.lang.Object) entryArray58);
        hashMap19.table = entryArray58;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap19", hashMap19.repOK_2());
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test75");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean2 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap1.table;
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap1.table;
        int int5 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        boolean boolean7 = hashMap6.repOK();
        hashMap6.clear();
        hashMap6.clear();
        java.lang.Object obj10 = hashMap1.remove((java.lang.Object) hashMap6);
        hashMap6.modCount = (byte) 0;
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        boolean boolean14 = hashMap13.repOK();
        hashMap13.clear();
        int int16 = hashMap13.size();
        int int17 = hashMap13.size();
        int int18 = hashMap13.size();
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap13.table;
        hashMap13.clear();
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap();
        java.lang.Object obj23 = hashMap21.remove((java.lang.Object) 0.0f);
        hashMap21.modCount = (byte) 100;
        system.classfixer.classes.HashMap.Entry[] entryArray26 = hashMap21.table;
        java.lang.Object obj27 = hashMap13.remove((java.lang.Object) hashMap21);
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap29.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray31 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap29.table = entryArray31;
        int int33 = hashMap29.modCount;
        hashMap29.modCount = 3;
        java.lang.Object obj36 = hashMap13.remove((java.lang.Object) hashMap29);
        system.classfixer.classes.HashMap hashMap37 = new system.classfixer.classes.HashMap();
        java.lang.Object obj39 = hashMap37.remove((java.lang.Object) 0.0f);
        hashMap37.modCount = (byte) 100;
        hashMap37.clear();
        boolean boolean43 = hashMap37.repOK();
        java.lang.Object obj44 = hashMap6.put((java.lang.Object) hashMap13, (java.lang.Object) hashMap37);
        boolean boolean45 = hashMap6.repOK();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap6", hashMap6.repOK_2());
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test76");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) ' ');
        boolean boolean2 = hashMap1.isEmpty();
        boolean boolean3 = hashMap1.repOK();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        boolean boolean5 = hashMap4.repOK();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object obj8 = hashMap4.put(obj6, (java.lang.Object) 100);
        int int9 = hashMap4.modCount;
        java.lang.Object obj10 = hashMap1.remove((java.lang.Object) int9);
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap(0);
        hashMap13.clear();
        java.lang.Object obj16 = hashMap13.remove((java.lang.Object) 0.0f);
        boolean boolean17 = hashMap13.isEmpty();
        java.lang.Object obj18 = hashMap1.put((java.lang.Object) 3, (java.lang.Object) hashMap13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test77");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        int int3 = hashMap0.size();
        hashMap0.modCount = (-1);
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap7.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap7.table;
        boolean boolean10 = hashMap7.isEmpty();
        int int11 = hashMap7.size();
        boolean boolean12 = hashMap7.repOK();
        hashMap7.modCount = 32;
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap7.table;
        hashMap0.table = entryArray15;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test78");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        hashMap0.modCount = ' ';
        boolean boolean3 = hashMap0.repOK();
        int int4 = hashMap0.modCount;
        boolean boolean5 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) 'a');
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) (byte) 0);
        java.lang.Object obj10 = hashMap7.get((java.lang.Object) hashMap9);
        int int11 = hashMap9.modCount;
        int int12 = hashMap9.size();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean15 = hashMap14.isEmpty();
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        java.lang.Object obj18 = hashMap16.remove((java.lang.Object) 0.0f);
        java.lang.Object obj19 = hashMap14.get((java.lang.Object) hashMap16);
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap(100);
        system.classfixer.classes.HashMap.Entry[] entryArray22 = hashMap21.table;
        java.lang.Object obj23 = hashMap14.remove((java.lang.Object) hashMap21);
        int int24 = hashMap14.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray25 = hashMap14.table;
        hashMap9.table = entryArray25;
        hashMap0.table = entryArray25;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test79");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        boolean boolean2 = hashMap1.isEmpty();
        int int3 = hashMap1.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap1.table;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        boolean boolean6 = hashMap5.repOK();
        hashMap5.clear();
        int int8 = hashMap5.size();
        int int9 = hashMap5.size();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap(0);
        int int12 = hashMap11.modCount;
        java.lang.Object obj13 = hashMap5.get((java.lang.Object) int12);
        boolean boolean14 = hashMap5.isEmpty();
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        java.lang.Object obj17 = hashMap15.remove((java.lang.Object) 0.0f);
        hashMap15.modCount = (byte) 100;
        system.classfixer.classes.HashMap.Entry[] entryArray20 = hashMap15.table;
        hashMap5.table = entryArray20;
        hashMap1.table = entryArray20;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test80");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(0, (float) 10);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap3.remove((java.lang.Object) 0.0f);
        hashMap3.modCount = (byte) 100;
        hashMap3.clear();
        hashMap3.modCount = 0;
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap3.table;
        hashMap2.table = entryArray11;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test81");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap1.table;
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean5 = hashMap4.isEmpty();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        java.lang.Object obj8 = hashMap6.remove((java.lang.Object) 0.0f);
        java.lang.Object obj9 = hashMap4.get((java.lang.Object) hashMap6);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap(100);
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap11.table;
        java.lang.Object obj13 = hashMap4.remove((java.lang.Object) hashMap11);
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        java.lang.Object obj16 = hashMap14.remove((java.lang.Object) 0.0f);
        hashMap14.modCount = (byte) 100;
        hashMap14.clear();
        int int20 = hashMap14.size();
        java.lang.Object obj21 = hashMap1.put(obj13, (java.lang.Object) hashMap14);
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap(0);
        boolean boolean24 = hashMap23.isEmpty();
        int int25 = hashMap23.modCount;
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap(0);
        boolean boolean28 = hashMap27.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray29 = hashMap27.table;
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap();
        boolean boolean31 = hashMap30.repOK();
        hashMap30.clear();
        int int33 = hashMap30.size();
        int int34 = hashMap30.size();
        int int35 = hashMap30.size();
        system.classfixer.classes.HashMap.Entry[] entryArray36 = hashMap30.table;
        java.lang.Object obj37 = new java.lang.Object();
        java.lang.Class<?> wildcardClass38 = obj37.getClass();
        java.lang.Object obj39 = hashMap30.get(obj37);
        system.classfixer.classes.HashMap hashMap40 = new system.classfixer.classes.HashMap();
        java.lang.Object obj42 = hashMap40.remove((java.lang.Object) 0.0f);
        hashMap40.modCount = (byte) 100;
        hashMap40.clear();
        system.classfixer.classes.HashMap hashMap47 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean48 = hashMap47.isEmpty();
        system.classfixer.classes.HashMap hashMap49 = new system.classfixer.classes.HashMap();
        java.lang.Object obj51 = hashMap49.remove((java.lang.Object) 0.0f);
        java.lang.Object obj52 = hashMap47.get((java.lang.Object) hashMap49);
        system.classfixer.classes.HashMap.Entry[] entryArray53 = hashMap49.table;
        hashMap40.table = entryArray53;
        java.lang.Object obj55 = hashMap30.remove((java.lang.Object) entryArray53);
        java.lang.Object obj56 = hashMap23.put((java.lang.Object) hashMap27, (java.lang.Object) entryArray53);
        system.classfixer.classes.HashMap hashMap58 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap58.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray60 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap58.table = entryArray60;
        hashMap27.table = entryArray60;
        hashMap14.table = entryArray60;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap14", hashMap14.repOK_2());
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test82");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) '4', 1.0f);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap4.table;
        int int6 = hashMap4.size();
        int int7 = hashMap4.modCount;
        hashMap4.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap4.table;
        hashMap2.table = entryArray9;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test83");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        int int3 = hashMap0.size();
        int int4 = hashMap0.modCount;
        hashMap0.clear();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap(100, (float) 1);
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap8.table;
        int int10 = hashMap8.size();
        java.lang.Object obj12 = hashMap0.put((java.lang.Object) int10, (java.lang.Object) 100L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test84");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(2);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean4 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        java.lang.Object obj7 = hashMap5.remove((java.lang.Object) 0.0f);
        java.lang.Object obj8 = hashMap3.get((java.lang.Object) hashMap5);
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap5.table;
        hashMap1.table = entryArray9;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test85");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        hashMap1.clear();
        int int4 = hashMap1.modCount;
        boolean boolean5 = hashMap1.isEmpty();
        hashMap1.clear();
        hashMap1.modCount = 1;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap(0);
        boolean boolean13 = hashMap12.isEmpty();
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray16 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap15.table = entryArray16;
        hashMap12.table = entryArray16;
        java.lang.Object obj19 = hashMap1.put((java.lang.Object) hashMap10, (java.lang.Object) hashMap12);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test86");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        int int3 = hashMap0.size();
        int int4 = hashMap0.size();
        int int5 = hashMap0.size();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap0.table;
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap(100, (float) 1);
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap10.table;
        hashMap0.table = entryArray11;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test87() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test87");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        boolean boolean2 = hashMap1.isEmpty();
        int int3 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap(0);
        boolean boolean6 = hashMap5.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap5.table;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.repOK();
        hashMap8.clear();
        int int11 = hashMap8.size();
        int int12 = hashMap8.size();
        int int13 = hashMap8.size();
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap8.table;
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = hashMap8.get(obj15);
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        java.lang.Object obj20 = hashMap18.remove((java.lang.Object) 0.0f);
        hashMap18.modCount = (byte) 100;
        hashMap18.clear();
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean26 = hashMap25.isEmpty();
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap();
        java.lang.Object obj29 = hashMap27.remove((java.lang.Object) 0.0f);
        java.lang.Object obj30 = hashMap25.get((java.lang.Object) hashMap27);
        system.classfixer.classes.HashMap.Entry[] entryArray31 = hashMap27.table;
        hashMap18.table = entryArray31;
        java.lang.Object obj33 = hashMap8.remove((java.lang.Object) entryArray31);
        java.lang.Object obj34 = hashMap1.put((java.lang.Object) hashMap5, (java.lang.Object) entryArray31);
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap();
        java.lang.Object obj37 = hashMap35.remove((java.lang.Object) 0.0f);
        hashMap35.modCount = (byte) 100;
        hashMap35.clear();
        system.classfixer.classes.HashMap hashMap42 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean43 = hashMap42.isEmpty();
        system.classfixer.classes.HashMap hashMap44 = new system.classfixer.classes.HashMap();
        java.lang.Object obj46 = hashMap44.remove((java.lang.Object) 0.0f);
        java.lang.Object obj47 = hashMap42.get((java.lang.Object) hashMap44);
        system.classfixer.classes.HashMap.Entry[] entryArray48 = hashMap44.table;
        hashMap35.table = entryArray48;
        system.classfixer.classes.HashMap hashMap50 = new system.classfixer.classes.HashMap();
        boolean boolean51 = hashMap50.repOK();
        hashMap50.clear();
        int int53 = hashMap50.size();
        int int54 = hashMap50.size();
        int int55 = hashMap50.size();
        system.classfixer.classes.HashMap.Entry[] entryArray56 = hashMap50.table;
        java.lang.Object obj57 = new java.lang.Object();
        java.lang.Class<?> wildcardClass58 = obj57.getClass();
        java.lang.Object obj59 = hashMap50.get(obj57);
        system.classfixer.classes.HashMap hashMap60 = new system.classfixer.classes.HashMap();
        java.lang.Object obj62 = hashMap60.remove((java.lang.Object) 0.0f);
        hashMap60.modCount = (byte) 100;
        hashMap60.clear();
        system.classfixer.classes.HashMap hashMap67 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean68 = hashMap67.isEmpty();
        system.classfixer.classes.HashMap hashMap69 = new system.classfixer.classes.HashMap();
        java.lang.Object obj71 = hashMap69.remove((java.lang.Object) 0.0f);
        java.lang.Object obj72 = hashMap67.get((java.lang.Object) hashMap69);
        system.classfixer.classes.HashMap.Entry[] entryArray73 = hashMap69.table;
        hashMap60.table = entryArray73;
        java.lang.Object obj75 = hashMap50.remove((java.lang.Object) entryArray73);
        hashMap35.table = entryArray73;
        int int77 = hashMap35.modCount;
        java.lang.Object obj78 = hashMap1.get((java.lang.Object) int77);
        system.classfixer.classes.HashMap hashMap80 = new system.classfixer.classes.HashMap((int) (short) 1);
        boolean boolean81 = hashMap80.isEmpty();
        hashMap80.clear();
        java.lang.Object obj83 = hashMap1.get((java.lang.Object) hashMap80);
        int int84 = hashMap1.size();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test88() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test88");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        int int3 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap5.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap5.table;
        int int8 = hashMap5.modCount;
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap(3, 10.0f);
        java.lang.Object obj13 = hashMap11.get((java.lang.Object) (byte) 100);
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        java.lang.Object obj16 = hashMap14.remove((java.lang.Object) 0.0f);
        hashMap14.modCount = (byte) 100;
        hashMap14.clear();
        hashMap14.modCount = 0;
        system.classfixer.classes.HashMap.Entry[] entryArray22 = hashMap14.table;
        java.lang.Object obj23 = hashMap5.put((java.lang.Object) hashMap11, (java.lang.Object) hashMap14);
        java.lang.Object obj24 = hashMap1.remove((java.lang.Object) hashMap14);
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap(3, 10.0f);
        system.classfixer.classes.HashMap.Entry[] entryArray28 = hashMap27.table;
        hashMap14.table = entryArray28;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap14", hashMap14.repOK_2());
    }

    @Test
    public void test89() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test89");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) ' ', (float) 100);
        boolean boolean3 = hashMap2.isEmpty();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        boolean boolean5 = hashMap4.repOK();
        hashMap4.clear();
        int int7 = hashMap4.size();
        int int8 = hashMap4.size();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap(0);
        int int11 = hashMap10.modCount;
        java.lang.Object obj12 = hashMap4.get((java.lang.Object) int11);
        boolean boolean13 = hashMap4.isEmpty();
        hashMap4.clear();
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap((int) (short) 1, (float) 1L);
        java.lang.Object obj18 = hashMap2.put((java.lang.Object) hashMap4, (java.lang.Object) hashMap17);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test90() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test90");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 100);
        boolean boolean2 = hashMap1.repOK();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap3.remove((java.lang.Object) 0.0f);
        hashMap3.modCount = (byte) 100;
        hashMap3.clear();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean11 = hashMap10.isEmpty();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        java.lang.Object obj14 = hashMap12.remove((java.lang.Object) 0.0f);
        java.lang.Object obj15 = hashMap10.get((java.lang.Object) hashMap12);
        boolean boolean16 = hashMap12.isEmpty();
        boolean boolean17 = hashMap12.isEmpty();
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        boolean boolean19 = hashMap18.repOK();
        hashMap18.clear();
        int int21 = hashMap18.size();
        int int22 = hashMap18.size();
        int int23 = hashMap18.size();
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap18.table;
        hashMap18.clear();
        java.lang.Object obj26 = hashMap3.put((java.lang.Object) hashMap12, (java.lang.Object) hashMap18);
        hashMap12.modCount = 101;
        int int29 = hashMap12.modCount;
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap();
        java.lang.Object obj32 = hashMap30.remove((java.lang.Object) 0.0f);
        hashMap30.modCount = (byte) 100;
        system.classfixer.classes.HashMap.Entry[] entryArray35 = hashMap30.table;
        java.lang.Object obj36 = hashMap12.get((java.lang.Object) entryArray35);
        hashMap1.table = entryArray35;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test91() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test91");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap1.table;
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean5 = hashMap4.isEmpty();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        java.lang.Object obj8 = hashMap6.remove((java.lang.Object) 0.0f);
        java.lang.Object obj9 = hashMap4.get((java.lang.Object) hashMap6);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap(100);
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap11.table;
        java.lang.Object obj13 = hashMap4.remove((java.lang.Object) hashMap11);
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        java.lang.Object obj16 = hashMap14.remove((java.lang.Object) 0.0f);
        hashMap14.modCount = (byte) 100;
        hashMap14.clear();
        int int20 = hashMap14.size();
        java.lang.Object obj21 = hashMap1.put(obj13, (java.lang.Object) hashMap14);
        int int22 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap24.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray26 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap24.table = entryArray26;
        hashMap1.table = entryArray26;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test92() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test92");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        int int3 = hashMap0.size();
        int int4 = hashMap0.size();
        int int5 = hashMap0.size();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap0.table;
        hashMap0.clear();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        java.lang.Object obj10 = hashMap8.remove((java.lang.Object) 0.0f);
        hashMap8.modCount = (byte) 100;
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap8.table;
        java.lang.Object obj14 = hashMap0.remove((java.lang.Object) hashMap8);
        int int15 = hashMap8.modCount;
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap(100);
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap((int) (byte) 10, (float) 3);
        hashMap20.modCount = (short) -1;
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap((int) ' ');
        boolean boolean25 = hashMap24.isEmpty();
        boolean boolean26 = hashMap24.repOK();
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap();
        boolean boolean28 = hashMap27.repOK();
        java.lang.Object obj29 = new java.lang.Object();
        java.lang.Object obj31 = hashMap27.put(obj29, (java.lang.Object) 100);
        int int32 = hashMap27.modCount;
        java.lang.Object obj33 = hashMap24.remove((java.lang.Object) int32);
        system.classfixer.classes.HashMap.Entry[] entryArray34 = hashMap24.table;
        java.lang.Object obj35 = hashMap17.put((java.lang.Object) (short) -1, (java.lang.Object) hashMap24);
        system.classfixer.classes.HashMap hashMap36 = new system.classfixer.classes.HashMap();
        java.lang.Object obj38 = hashMap36.remove((java.lang.Object) 0.0f);
        hashMap36.modCount = (byte) 100;
        hashMap36.clear();
        int int42 = hashMap36.size();
        java.lang.Object obj43 = hashMap8.put((java.lang.Object) hashMap24, (java.lang.Object) int42);
        system.classfixer.classes.HashMap hashMap44 = new system.classfixer.classes.HashMap();
        boolean boolean45 = hashMap44.repOK();
        hashMap44.clear();
        int int47 = hashMap44.size();
        java.lang.Object obj48 = hashMap8.get((java.lang.Object) hashMap44);
        system.classfixer.classes.HashMap hashMap50 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray51 = hashMap50.table;
        hashMap44.table = entryArray51;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap44", hashMap44.repOK_2());
    }

    @Test
    public void test93() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test93");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        int int3 = hashMap0.size();
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = hashMap0.remove(obj4);
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) 'a');
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) (byte) 0);
        java.lang.Object obj10 = hashMap7.get((java.lang.Object) hashMap9);
        int int11 = hashMap9.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap9.table;
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap14.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap14.table;
        boolean boolean17 = hashMap14.isEmpty();
        int int18 = hashMap14.size();
        hashMap14.clear();
        java.lang.Object obj20 = hashMap9.get((java.lang.Object) hashMap14);
        java.lang.Object obj21 = hashMap0.get(obj20);
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap23.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray25 = hashMap23.table;
        boolean boolean26 = hashMap23.isEmpty();
        int int27 = hashMap23.size();
        boolean boolean28 = hashMap23.repOK();
        hashMap23.modCount = 32;
        system.classfixer.classes.HashMap.Entry[] entryArray31 = hashMap23.table;
        hashMap0.table = entryArray31;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test94() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test94");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap((int) (byte) 0);
        java.lang.Object obj4 = hashMap1.get((java.lang.Object) hashMap3);
        hashMap3.clear();
        boolean boolean6 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        java.lang.Object obj9 = hashMap7.remove((java.lang.Object) 0.0f);
        hashMap7.modCount = (byte) 100;
        hashMap7.clear();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean15 = hashMap14.isEmpty();
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        java.lang.Object obj18 = hashMap16.remove((java.lang.Object) 0.0f);
        java.lang.Object obj19 = hashMap14.get((java.lang.Object) hashMap16);
        system.classfixer.classes.HashMap.Entry[] entryArray20 = hashMap16.table;
        hashMap7.table = entryArray20;
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        boolean boolean23 = hashMap22.repOK();
        hashMap22.clear();
        int int25 = hashMap22.size();
        int int26 = hashMap22.size();
        int int27 = hashMap22.size();
        system.classfixer.classes.HashMap.Entry[] entryArray28 = hashMap22.table;
        java.lang.Object obj29 = new java.lang.Object();
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        java.lang.Object obj31 = hashMap22.get(obj29);
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap();
        java.lang.Object obj34 = hashMap32.remove((java.lang.Object) 0.0f);
        hashMap32.modCount = (byte) 100;
        hashMap32.clear();
        system.classfixer.classes.HashMap hashMap39 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean40 = hashMap39.isEmpty();
        system.classfixer.classes.HashMap hashMap41 = new system.classfixer.classes.HashMap();
        java.lang.Object obj43 = hashMap41.remove((java.lang.Object) 0.0f);
        java.lang.Object obj44 = hashMap39.get((java.lang.Object) hashMap41);
        system.classfixer.classes.HashMap.Entry[] entryArray45 = hashMap41.table;
        hashMap32.table = entryArray45;
        java.lang.Object obj47 = hashMap22.remove((java.lang.Object) entryArray45);
        hashMap7.table = entryArray45;
        system.classfixer.classes.HashMap hashMap49 = new system.classfixer.classes.HashMap();
        boolean boolean50 = hashMap49.repOK();
        hashMap49.clear();
        int int52 = hashMap49.size();
        int int53 = hashMap49.size();
        system.classfixer.classes.HashMap hashMap55 = new system.classfixer.classes.HashMap(0);
        int int56 = hashMap55.modCount;
        java.lang.Object obj57 = hashMap49.get((java.lang.Object) int56);
        boolean boolean58 = hashMap49.isEmpty();
        system.classfixer.classes.HashMap hashMap59 = new system.classfixer.classes.HashMap();
        java.lang.Object obj61 = hashMap59.remove((java.lang.Object) 0.0f);
        hashMap59.modCount = (byte) 100;
        system.classfixer.classes.HashMap.Entry[] entryArray64 = hashMap59.table;
        hashMap49.table = entryArray64;
        hashMap7.table = entryArray64;
        hashMap3.table = entryArray64;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap3", hashMap3.repOK_2());
    }

    @Test
    public void test95() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test95");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        hashMap0.clear();
        int int3 = hashMap0.size();
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = hashMap0.remove(obj4);
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) 'a');
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) (byte) 0);
        java.lang.Object obj10 = hashMap7.get((java.lang.Object) hashMap9);
        int int11 = hashMap9.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap9.table;
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap14.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap14.table;
        boolean boolean17 = hashMap14.isEmpty();
        int int18 = hashMap14.size();
        hashMap14.clear();
        java.lang.Object obj20 = hashMap9.get((java.lang.Object) hashMap14);
        java.lang.Object obj21 = hashMap0.get(obj20);
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap((int) 'a');
        boolean boolean24 = hashMap23.isEmpty();
        int int25 = hashMap23.modCount;
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap(0);
        int int28 = hashMap27.modCount;
        java.lang.Object obj31 = hashMap27.put((java.lang.Object) 1.0f, (java.lang.Object) (byte) 100);
        hashMap27.modCount = 0;
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap35.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray37 = hashMap35.table;
        boolean boolean38 = hashMap35.isEmpty();
        int int39 = hashMap35.size();
        boolean boolean40 = hashMap35.repOK();
        hashMap35.modCount = 32;
        system.classfixer.classes.HashMap.Entry[] entryArray43 = hashMap35.table;
        system.classfixer.classes.HashMap hashMap45 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap45.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray47 = hashMap45.table;
        boolean boolean48 = hashMap45.isEmpty();
        int int49 = hashMap45.size();
        boolean boolean50 = hashMap45.repOK();
        hashMap45.modCount = 32;
        system.classfixer.classes.HashMap.Entry[] entryArray53 = hashMap45.table;
        java.lang.Object obj54 = hashMap27.put((java.lang.Object) hashMap35, (java.lang.Object) hashMap45);
        java.lang.Object obj55 = hashMap23.get(obj54);
        hashMap23.modCount = '#';
        hashMap23.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray59 = hashMap23.table;
        hashMap0.table = entryArray59;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }
}

