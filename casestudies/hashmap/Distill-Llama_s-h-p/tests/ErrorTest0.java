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
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap4.clear();
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap4);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for hashMap0", hashMap0.property());
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray4 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap3.table = entryArray4;
        hashMap2.table = entryArray4;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap8.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap8.table = entryArray10;
        java.lang.Object obj12 = hashMap1.put((java.lang.Object) hashMap2, (java.lang.Object) entryArray10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for hashMap1", hashMap1.property());
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) (short) 100);
        hashMap0.clear();
        java.lang.Object obj5 = null;
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) (short) -1, obj5);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for hashMap0", hashMap0.property());
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int2 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap4.clear();
        hashMap4.clear();
        hashMap4.clear();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap9.table = entryArray10;
        hashMap8.table = entryArray10;
        java.lang.Object obj13 = hashMap1.put((java.lang.Object) hashMap4, (java.lang.Object) hashMap8);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for hashMap1", hashMap1.property());
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) (short) 100);
        hashMap0.clear();
        boolean boolean4 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap8.table = entryArray9;
        hashMap7.table = entryArray9;
        hashMap6.table = entryArray9;
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        boolean boolean14 = hashMap13.repOK();
        int int15 = hashMap13.size();
        java.lang.Object obj16 = hashMap0.put((java.lang.Object) entryArray9, (java.lang.Object) int15);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for hashMap0", hashMap0.property());
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray7 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap6.table = entryArray7;
        hashMap5.table = entryArray7;
        hashMap4.table = entryArray7;
        hashMap4.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap4.table;
        java.lang.Object obj13 = hashMap1.put((java.lang.Object) (short) 10, (java.lang.Object) hashMap4);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for hashMap1", hashMap1.property());
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap1.table;
        int int3 = hashMap1.size();
        int int4 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap7.table = entryArray8;
        hashMap6.table = entryArray8;
        hashMap6.modCount = (byte) 100;
        java.lang.Object obj13 = hashMap1.put((java.lang.Object) "", (java.lang.Object) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for hashMap1", hashMap1.property());
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap1.table;
        int int3 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int7 = hashMap6.size();
        java.lang.Object obj8 = hashMap1.put((java.lang.Object) 0L, (java.lang.Object) hashMap6);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for hashMap1", hashMap1.property());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap1.table;
        int int3 = hashMap1.size();
        int int4 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) 'a');
        system.classfixer.classes.HashMap.Entry[] entryArray7 = null;
        hashMap6.table = entryArray7;
        boolean boolean9 = hashMap6.isEmpty();
        int int10 = hashMap6.modCount;
        boolean boolean11 = hashMap6.repOK();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap(0);
        java.lang.Object obj14 = hashMap1.put((java.lang.Object) boolean11, (java.lang.Object) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for hashMap1", hashMap1.property());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) (short) 100);
        int int3 = hashMap0.size();
        hashMap0.clear();
        boolean boolean5 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap7.clear();
        java.lang.Object obj10 = hashMap7.remove((java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap12.table = entryArray13;
        hashMap11.table = entryArray13;
        hashMap11.modCount = (byte) 100;
        boolean boolean18 = hashMap11.isEmpty();
        java.lang.Object obj19 = hashMap7.remove((java.lang.Object) boolean18);
        hashMap7.modCount = (byte) 0;
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap23.clear();
        hashMap23.clear();
        hashMap23.clear();
        java.lang.Object obj28 = hashMap23.remove((java.lang.Object) ' ');
        int int29 = hashMap23.size();
        hashMap23.clear();
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap34 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray35 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap34.table = entryArray35;
        hashMap33.table = entryArray35;
        hashMap32.table = entryArray35;
        system.classfixer.classes.HashMap.Entry[] entryArray39 = hashMap32.table;
        hashMap23.table = entryArray39;
        java.lang.Object obj41 = hashMap0.put((java.lang.Object) hashMap7, (java.lang.Object) hashMap23);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for hashMap0", hashMap0.property());
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) (short) 100);
        hashMap0.clear();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap5.clear();
        hashMap5.clear();
        int int8 = hashMap5.modCount;
        int int9 = hashMap5.modCount;
        boolean boolean10 = hashMap5.repOK();
        java.lang.Object obj12 = hashMap5.get((java.lang.Object) 1.0f);
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Class<?> wildcardClass15 = hashMap14.getClass();
        java.lang.Object obj16 = hashMap5.get((java.lang.Object) wildcardClass15);
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray18 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap17.table = entryArray18;
        system.classfixer.classes.HashMap.Entry[] entryArray20 = hashMap17.table;
        hashMap5.table = entryArray20;
        hashMap5.clear();
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap(1);
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap26.clear();
        hashMap26.clear();
        java.lang.Object obj30 = hashMap26.get((java.lang.Object) (-1L));
        system.classfixer.classes.HashMap.Entry[] entryArray31 = hashMap26.table;
        hashMap24.table = entryArray31;
        java.lang.Object obj33 = hashMap0.put((java.lang.Object) hashMap5, (java.lang.Object) entryArray31);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for hashMap0", hashMap0.property());
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) ' ');
        boolean boolean2 = hashMap1.repOK();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap4.table;
        hashMap1.table = entryArray5;
        java.lang.Object obj7 = null;
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap11.table = entryArray12;
        hashMap10.table = entryArray12;
        hashMap9.table = entryArray12;
        hashMap9.clear();
        java.lang.Object obj17 = hashMap1.put(obj7, (java.lang.Object) hashMap9);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for hashMap1", hashMap1.property());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) (short) 100);
        int int3 = hashMap0.size();
        boolean boolean4 = hashMap0.isEmpty();
        hashMap0.modCount = 1;
        boolean boolean7 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.repOK();
        boolean boolean10 = hashMap8.isEmpty();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap12.table = entryArray13;
        hashMap11.table = entryArray13;
        hashMap8.table = entryArray13;
        boolean boolean17 = hashMap8.repOK();
        java.lang.Object obj19 = hashMap0.put((java.lang.Object) hashMap8, (java.lang.Object) 2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for hashMap0", hashMap0.property());
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        hashMap1.clear();
        int int4 = hashMap1.modCount;
        int int5 = hashMap1.modCount;
        boolean boolean6 = hashMap1.repOK();
        java.lang.Object obj8 = hashMap1.get((java.lang.Object) 1.0f);
        java.lang.Object obj10 = hashMap1.get((java.lang.Object) 1.0f);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        int int12 = hashMap11.modCount;
        java.lang.Object obj13 = hashMap1.get((java.lang.Object) hashMap11);
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray15 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap14.table = entryArray15;
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap14.table;
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap19.clear();
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray22 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap21.table = entryArray22;
        hashMap19.table = entryArray22;
        hashMap19.modCount = 2;
        int int27 = hashMap19.modCount;
        java.lang.Object obj28 = hashMap1.put((java.lang.Object) hashMap14, (java.lang.Object) int27);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for hashMap1", hashMap1.property());
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) '4', (float) (byte) 100);
        java.lang.Object obj4 = hashMap2.get((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = hashMap2.put((java.lang.Object) (-1L), (java.lang.Object) true);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for hashMap2", hashMap2.property());
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        int int2 = hashMap1.size();
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = hashMap1.put((java.lang.Object) (-1), obj4);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for hashMap1", hashMap1.property());
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap4.clear();
        hashMap4.clear();
        int int7 = hashMap4.modCount;
        int int8 = hashMap4.modCount;
        boolean boolean9 = hashMap4.repOK();
        java.lang.Object obj11 = hashMap4.get((java.lang.Object) 1.0f);
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Class<?> wildcardClass14 = hashMap13.getClass();
        java.lang.Object obj15 = hashMap4.get((java.lang.Object) wildcardClass14);
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray18 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap17.table = entryArray18;
        hashMap16.table = entryArray18;
        java.lang.Object obj21 = hashMap2.put((java.lang.Object) wildcardClass14, (java.lang.Object) entryArray18);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for hashMap2", hashMap2.property());
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        hashMap1.clear();
        int int4 = hashMap1.modCount;
        int int5 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        java.lang.Object obj8 = hashMap6.remove((java.lang.Object) (short) 100);
        int int9 = hashMap6.size();
        boolean boolean10 = hashMap6.isEmpty();
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = hashMap1.put((java.lang.Object) hashMap6, obj11);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for hashMap1", hashMap1.property());
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        int int2 = hashMap1.size();
        boolean boolean3 = hashMap1.isEmpty();
        boolean boolean4 = hashMap1.repOK();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap5.table = entryArray6;
        java.lang.Object obj9 = hashMap1.put((java.lang.Object) entryArray6, (java.lang.Object) 0.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for hashMap1", hashMap1.property());
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        boolean boolean2 = hashMap1.repOK();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap4.table = entryArray5;
        hashMap3.table = entryArray5;
        hashMap3.modCount = (byte) 100;
        boolean boolean10 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap12.clear();
        hashMap12.clear();
        int int15 = hashMap12.modCount;
        int int16 = hashMap12.modCount;
        boolean boolean17 = hashMap12.repOK();
        java.lang.Object obj19 = hashMap12.get((java.lang.Object) 1.0f);
        java.lang.Object obj21 = hashMap12.get((java.lang.Object) 1.0f);
        java.lang.Object obj22 = hashMap1.put((java.lang.Object) hashMap3, (java.lang.Object) 1.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for hashMap1", hashMap1.property());
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        int int2 = hashMap1.size();
        boolean boolean3 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int6 = hashMap5.size();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray11 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap10.table = entryArray11;
        hashMap9.table = entryArray11;
        hashMap8.table = entryArray11;
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap8.table;
        hashMap5.table = entryArray15;
        boolean boolean17 = hashMap5.repOK();
        java.lang.Object obj18 = hashMap1.remove((java.lang.Object) boolean17);
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        int int20 = hashMap19.size();
        hashMap19.modCount = (short) 1;
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray25 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap24.table = entryArray25;
        hashMap23.table = entryArray25;
        java.lang.Object obj28 = hashMap1.put((java.lang.Object) (short) 1, (java.lang.Object) hashMap23);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for hashMap1", hashMap1.property());
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap((int) (short) 0);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap4.table = entryArray5;
        int int7 = hashMap4.size();
        hashMap4.clear();
        java.lang.Object obj9 = hashMap3.remove((java.lang.Object) hashMap4);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap11.clear();
        hashMap11.clear();
        java.lang.Object obj15 = hashMap11.get((java.lang.Object) (-1L));
        hashMap11.modCount = (-1);
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap((int) 'a');
        int int20 = hashMap19.size();
        boolean boolean21 = hashMap19.isEmpty();
        boolean boolean22 = hashMap19.repOK();
        java.lang.Object obj23 = hashMap11.remove((java.lang.Object) hashMap19);
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap25.clear();
        hashMap25.clear();
        java.lang.Object obj29 = hashMap25.get((java.lang.Object) (-1L));
        system.classfixer.classes.HashMap.Entry[] entryArray30 = hashMap25.table;
        java.lang.Object obj31 = hashMap11.get((java.lang.Object) entryArray30);
        java.lang.Object obj32 = hashMap0.put((java.lang.Object) hashMap3, obj31);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for hashMap0", hashMap0.property());
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        int int2 = hashMap1.size();
        hashMap1.clear();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj6 = hashMap4.remove((java.lang.Object) (short) 100);
        int int7 = hashMap4.size();
        boolean boolean8 = hashMap4.isEmpty();
        hashMap4.modCount = 1;
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap(0);
        java.lang.Object obj13 = hashMap4.get((java.lang.Object) 0);
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap15.clear();
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray18 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap17.table = entryArray18;
        hashMap15.table = entryArray18;
        hashMap15.modCount = 2;
        int int23 = hashMap15.size();
        java.lang.Object obj24 = hashMap4.remove((java.lang.Object) int23);
        java.lang.Object obj26 = hashMap1.put(obj24, (java.lang.Object) 0.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for hashMap1", hashMap1.property());
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 10, (float) 2);
        hashMap2.clear();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap5.clear();
        hashMap5.clear();
        hashMap5.clear();
        java.lang.Object obj10 = hashMap5.remove((java.lang.Object) ' ');
        int int11 = hashMap5.size();
        hashMap5.clear();
        hashMap5.modCount = 0;
        int int15 = hashMap5.modCount;
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap17.clear();
        java.lang.Object obj20 = hashMap17.remove((java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray23 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap22.table = entryArray23;
        hashMap21.table = entryArray23;
        hashMap21.modCount = (byte) 100;
        boolean boolean28 = hashMap21.isEmpty();
        java.lang.Object obj29 = hashMap17.remove((java.lang.Object) boolean28);
        hashMap17.modCount = (byte) 0;
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray34 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap33.table = entryArray34;
        hashMap32.table = entryArray34;
        hashMap17.table = entryArray34;
        hashMap17.clear();
        java.lang.Object obj39 = hashMap2.put((java.lang.Object) int15, (java.lang.Object) hashMap17);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for hashMap2", hashMap2.property());
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) (short) 100);
        int int3 = hashMap0.size();
        hashMap0.clear();
        int int5 = hashMap0.size();
        system.classfixer.classes.HashMap.Entry entry6 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray7 = new system.classfixer.classes.HashMap.Entry[] { entry6 };
        hashMap0.table = entryArray7;
        int int9 = hashMap0.modCount;
        java.lang.Object obj12 = hashMap0.put((java.lang.Object) (-1.0f), (java.lang.Object) 1.0d);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for hashMap0", hashMap0.property());
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        hashMap1.clear();
        int int4 = hashMap1.modCount;
        int int5 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        java.lang.Object obj8 = hashMap6.remove((java.lang.Object) (short) 100);
        int int9 = hashMap6.size();
        boolean boolean10 = hashMap6.isEmpty();
        hashMap6.clear();
        java.lang.Object obj12 = hashMap1.remove((java.lang.Object) hashMap6);
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray14 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap13.table = entryArray14;
        int int16 = hashMap13.size();
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap13.table;
        hashMap13.modCount = ' ';
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Class<?> wildcardClass22 = hashMap21.getClass();
        java.lang.Object obj23 = hashMap6.put((java.lang.Object) hashMap13, (java.lang.Object) hashMap21);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for hashMap6", hashMap6.property());
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap3.clear();
        hashMap3.clear();
        int int6 = hashMap3.modCount;
        int int7 = hashMap3.size();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        java.lang.Object obj10 = hashMap8.remove((java.lang.Object) (short) 100);
        int int11 = hashMap8.size();
        boolean boolean12 = hashMap8.isEmpty();
        hashMap8.clear();
        java.lang.Object obj14 = hashMap3.remove((java.lang.Object) hashMap8);
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap((int) 'a');
        int int17 = hashMap16.size();
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap16.table;
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap20.clear();
        hashMap20.clear();
        int int23 = hashMap20.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap20.table;
        java.lang.Object obj25 = hashMap16.get((java.lang.Object) entryArray24);
        int int26 = hashMap16.modCount;
        int int27 = hashMap16.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray28 = hashMap16.table;
        system.classfixer.classes.HashMap.Entry[] entryArray29 = hashMap16.table;
        system.classfixer.classes.HashMap.Entry[] entryArray30 = hashMap16.table;
        hashMap3.table = entryArray30;
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap33.clear();
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray36 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap35.table = entryArray36;
        hashMap33.table = entryArray36;
        hashMap33.modCount = 2;
        int int41 = hashMap33.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray42 = hashMap33.table;
        java.lang.Object obj43 = hashMap1.put((java.lang.Object) hashMap3, (java.lang.Object) hashMap33);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for hashMap1", hashMap1.property());
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 0);
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap2.table = entryArray3;
        int int5 = hashMap2.size();
        hashMap2.clear();
        java.lang.Object obj7 = hashMap1.remove((java.lang.Object) hashMap2);
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap9.table;
        int int11 = hashMap9.size();
        int int12 = hashMap9.modCount;
        int int13 = hashMap9.size();
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap((int) 'a');
        system.classfixer.classes.HashMap.Entry[] entryArray16 = null;
        hashMap15.table = entryArray16;
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap15.table;
        java.lang.Object obj19 = hashMap1.put((java.lang.Object) int13, (java.lang.Object) entryArray18);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for hashMap1", hashMap1.property());
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) ' ');
        boolean boolean2 = hashMap1.repOK();
        hashMap1.clear();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap5.clear();
        hashMap5.clear();
        int int8 = hashMap5.modCount;
        int int9 = hashMap5.size();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        java.lang.Object obj12 = hashMap10.remove((java.lang.Object) (short) 100);
        int int13 = hashMap10.size();
        boolean boolean14 = hashMap10.isEmpty();
        hashMap10.clear();
        java.lang.Object obj16 = hashMap5.remove((java.lang.Object) hashMap10);
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        java.lang.Object obj19 = hashMap17.remove((java.lang.Object) (short) 100);
        int int20 = hashMap17.size();
        boolean boolean21 = hashMap17.isEmpty();
        hashMap17.modCount = 1;
        java.lang.Object obj24 = hashMap1.put(obj16, (java.lang.Object) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for hashMap1", hashMap1.property());
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 0);
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap2.table = entryArray3;
        int int5 = hashMap2.size();
        hashMap2.clear();
        java.lang.Object obj7 = hashMap1.remove((java.lang.Object) hashMap2);
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap1.table;
        java.lang.Object obj9 = null;
        java.lang.Object obj11 = hashMap1.put(obj9, (java.lang.Object) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for hashMap1", hashMap1.property());
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        hashMap1.clear();
        int int4 = hashMap1.modCount;
        int int5 = hashMap1.modCount;
        boolean boolean6 = hashMap1.repOK();
        java.lang.Object obj8 = hashMap1.get((java.lang.Object) 1.0f);
        java.lang.Object obj10 = hashMap1.get((java.lang.Object) 1.0f);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        int int12 = hashMap11.modCount;
        java.lang.Object obj13 = hashMap1.get((java.lang.Object) hashMap11);
        hashMap11.modCount = (short) 0;
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap17.clear();
        java.lang.Object obj20 = hashMap17.remove((java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray23 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap22.table = entryArray23;
        hashMap21.table = entryArray23;
        hashMap21.modCount = (byte) 100;
        boolean boolean28 = hashMap21.isEmpty();
        java.lang.Object obj29 = hashMap17.remove((java.lang.Object) boolean28);
        hashMap17.modCount = (byte) 0;
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray34 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap33.table = entryArray34;
        hashMap32.table = entryArray34;
        hashMap17.table = entryArray34;
        system.classfixer.classes.HashMap hashMap38 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap39 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray40 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap39.table = entryArray40;
        hashMap38.table = entryArray40;
        hashMap38.modCount = (byte) 100;
        boolean boolean45 = hashMap38.isEmpty();
        boolean boolean46 = hashMap38.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray47 = hashMap38.table;
        java.lang.Object obj48 = hashMap11.put((java.lang.Object) hashMap17, (java.lang.Object) hashMap38);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for hashMap11", hashMap11.property());
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 0);
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap2.table = entryArray3;
        int int5 = hashMap2.size();
        hashMap2.clear();
        java.lang.Object obj7 = hashMap1.remove((java.lang.Object) hashMap2);
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap9.clear();
        hashMap9.clear();
        int int12 = hashMap9.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap9.table;
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray18 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap17.table = entryArray18;
        hashMap16.table = entryArray18;
        hashMap15.table = entryArray18;
        system.classfixer.classes.HashMap.Entry[] entryArray22 = hashMap15.table;
        boolean boolean23 = hashMap15.isEmpty();
        boolean boolean24 = hashMap15.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray25 = hashMap15.table;
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray30 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap29.table = entryArray30;
        hashMap28.table = entryArray30;
        hashMap27.table = entryArray30;
        system.classfixer.classes.HashMap.Entry[] entryArray34 = hashMap27.table;
        boolean boolean35 = hashMap27.isEmpty();
        boolean boolean36 = hashMap27.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray37 = hashMap27.table;
        hashMap15.table = entryArray37;
        java.lang.Object obj39 = hashMap1.put((java.lang.Object) entryArray13, (java.lang.Object) hashMap15);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for hashMap1", hashMap1.property());
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) (short) 100);
        hashMap0.clear();
        boolean boolean4 = hashMap0.isEmpty();
        boolean boolean5 = hashMap0.repOK();
        boolean boolean6 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap(1);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap10.clear();
        hashMap10.clear();
        java.lang.Object obj14 = hashMap10.get((java.lang.Object) (-1L));
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap10.table;
        hashMap8.table = entryArray15;
        java.lang.Object obj17 = hashMap0.remove((java.lang.Object) entryArray15);
        boolean boolean18 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        int int20 = hashMap19.size();
        hashMap19.clear();
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap((int) ' ');
        boolean boolean24 = hashMap23.repOK();
        boolean boolean25 = hashMap23.isEmpty();
        hashMap23.modCount = 10;
        java.lang.Object obj28 = hashMap0.put((java.lang.Object) hashMap19, (java.lang.Object) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for hashMap0", hashMap0.property());
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) (short) 100);
        int int3 = hashMap0.size();
        hashMap0.clear();
        int int5 = hashMap0.size();
        system.classfixer.classes.HashMap.Entry entry6 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray7 = new system.classfixer.classes.HashMap.Entry[] { entry6 };
        hashMap0.table = entryArray7;
        int int9 = hashMap0.size();
        int int10 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) 'a');
        system.classfixer.classes.HashMap.Entry[] entryArray13 = null;
        hashMap12.table = entryArray13;
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap16.clear();
        hashMap16.clear();
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray25 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap24.table = entryArray25;
        hashMap23.table = entryArray25;
        hashMap22.table = entryArray25;
        hashMap22.clear();
        java.lang.Object obj30 = hashMap20.get((java.lang.Object) hashMap22);
        int int31 = hashMap20.modCount;
        java.lang.Object obj32 = hashMap16.get((java.lang.Object) int31);
        hashMap16.clear();
        java.lang.Object obj34 = hashMap0.put((java.lang.Object) hashMap12, (java.lang.Object) hashMap16);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for hashMap0", hashMap0.property());
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        int int2 = hashMap0.size();
        java.lang.Object obj4 = hashMap0.get((java.lang.Object) 2);
        boolean boolean5 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 10);
        hashMap7.modCount = 1;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        java.lang.Object obj12 = hashMap10.remove((java.lang.Object) (short) 100);
        int int13 = hashMap10.size();
        hashMap10.clear();
        int int15 = hashMap10.size();
        system.classfixer.classes.HashMap.Entry entry16 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray17 = new system.classfixer.classes.HashMap.Entry[] { entry16 };
        hashMap10.table = entryArray17;
        java.lang.Object obj19 = hashMap0.put((java.lang.Object) 1, (java.lang.Object) entryArray17);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for hashMap0", hashMap0.property());
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        hashMap1.clear();
        int int4 = hashMap1.modCount;
        int int5 = hashMap1.modCount;
        boolean boolean6 = hashMap1.repOK();
        java.lang.Object obj8 = hashMap1.get((java.lang.Object) 1.0f);
        java.lang.Object obj10 = hashMap1.get((java.lang.Object) 1.0f);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        int int12 = hashMap11.modCount;
        java.lang.Object obj13 = hashMap1.get((java.lang.Object) hashMap11);
        hashMap11.modCount = (short) 0;
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap(1, (float) '#');
        int int19 = hashMap18.modCount;
        int int20 = hashMap18.modCount;
        boolean boolean21 = hashMap18.repOK();
        java.lang.Object obj22 = hashMap11.remove((java.lang.Object) boolean21);
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray27 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap26.table = entryArray27;
        hashMap25.table = entryArray27;
        hashMap24.table = entryArray27;
        system.classfixer.classes.HashMap.Entry[] entryArray31 = hashMap24.table;
        boolean boolean32 = hashMap24.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray33 = hashMap24.table;
        boolean boolean34 = hashMap24.repOK();
        boolean boolean35 = hashMap24.isEmpty();
        system.classfixer.classes.HashMap hashMap36 = new system.classfixer.classes.HashMap();
        boolean boolean37 = hashMap36.repOK();
        int int38 = hashMap36.size();
        java.lang.Object obj40 = hashMap36.get((java.lang.Object) 2);
        boolean boolean41 = hashMap36.isEmpty();
        system.classfixer.classes.HashMap hashMap42 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray43 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap42.table = entryArray43;
        int int45 = hashMap42.size();
        system.classfixer.classes.HashMap.Entry[] entryArray46 = hashMap42.table;
        hashMap42.modCount = ' ';
        java.lang.Object obj49 = hashMap36.get((java.lang.Object) hashMap42);
        java.lang.Object obj50 = hashMap11.put((java.lang.Object) boolean35, (java.lang.Object) hashMap42);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for hashMap11", hashMap11.property());
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        hashMap1.clear();
        int int4 = hashMap1.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap1.table;
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap7.clear();
        hashMap7.clear();
        java.lang.Object obj11 = hashMap7.get((java.lang.Object) (-1L));
        hashMap7.modCount = (-1);
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap((int) 'a');
        int int16 = hashMap15.size();
        boolean boolean17 = hashMap15.isEmpty();
        boolean boolean18 = hashMap15.repOK();
        java.lang.Object obj19 = hashMap7.remove((java.lang.Object) hashMap15);
        boolean boolean20 = hashMap15.isEmpty();
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap((int) 'a');
        int int23 = hashMap22.size();
        boolean boolean24 = hashMap22.isEmpty();
        boolean boolean25 = hashMap22.isEmpty();
        java.lang.Object obj26 = hashMap1.put((java.lang.Object) hashMap15, (java.lang.Object) boolean25);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for hashMap1", hashMap1.property());
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        hashMap1.clear();
        int int4 = hashMap1.modCount;
        int int5 = hashMap1.modCount;
        boolean boolean6 = hashMap1.repOK();
        java.lang.Object obj8 = hashMap1.get((java.lang.Object) 1.0f);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Class<?> wildcardClass11 = hashMap10.getClass();
        java.lang.Object obj12 = hashMap1.get((java.lang.Object) wildcardClass11);
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) ' ');
        boolean boolean15 = hashMap14.repOK();
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap17.table;
        hashMap14.table = entryArray18;
        hashMap1.table = entryArray18;
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray25 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap24.table = entryArray25;
        hashMap23.table = entryArray25;
        hashMap22.table = entryArray25;
        system.classfixer.classes.HashMap.Entry[] entryArray29 = hashMap22.table;
        boolean boolean30 = hashMap22.isEmpty();
        boolean boolean31 = hashMap22.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray32 = hashMap22.table;
        system.classfixer.classes.HashMap hashMap34 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap36 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray37 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap36.table = entryArray37;
        hashMap35.table = entryArray37;
        hashMap34.table = entryArray37;
        system.classfixer.classes.HashMap.Entry[] entryArray41 = hashMap34.table;
        boolean boolean42 = hashMap34.isEmpty();
        boolean boolean43 = hashMap34.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray44 = hashMap34.table;
        hashMap22.table = entryArray44;
        system.classfixer.classes.HashMap hashMap47 = new system.classfixer.classes.HashMap((int) 'a');
        int int48 = hashMap47.size();
        system.classfixer.classes.HashMap.Entry[] entryArray49 = hashMap47.table;
        system.classfixer.classes.HashMap hashMap51 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap51.clear();
        hashMap51.clear();
        int int54 = hashMap51.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray55 = hashMap51.table;
        java.lang.Object obj56 = hashMap47.get((java.lang.Object) entryArray55);
        int int57 = hashMap47.size();
        system.classfixer.classes.HashMap hashMap59 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray60 = hashMap59.table;
        int int61 = hashMap59.size();
        int int62 = hashMap59.modCount;
        int int63 = hashMap59.size();
        system.classfixer.classes.HashMap.Entry[] entryArray64 = hashMap59.table;
        java.lang.Object obj65 = hashMap47.get((java.lang.Object) hashMap59);
        java.lang.Object obj66 = hashMap1.put((java.lang.Object) hashMap22, obj65);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for hashMap1", hashMap1.property());
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 1);
        hashMap1.clear();
        hashMap1.modCount = (byte) 0;
        java.lang.Object obj5 = null;
        java.lang.Object obj7 = hashMap1.put(obj5, (java.lang.Object) 2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for hashMap1", hashMap1.property());
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) (short) 100);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap4.clear();
        hashMap4.clear();
        int int7 = hashMap4.modCount;
        int int8 = hashMap4.modCount;
        boolean boolean9 = hashMap4.repOK();
        java.lang.Object obj11 = hashMap4.get((java.lang.Object) 1.0f);
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Class<?> wildcardClass14 = hashMap13.getClass();
        java.lang.Object obj15 = hashMap4.get((java.lang.Object) wildcardClass14);
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap4.table;
        hashMap0.table = entryArray16;
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        boolean boolean19 = hashMap18.repOK();
        boolean boolean20 = hashMap18.isEmpty();
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray23 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap22.table = entryArray23;
        hashMap21.table = entryArray23;
        hashMap18.table = entryArray23;
        hashMap18.modCount = (byte) 10;
        hashMap18.modCount = (short) -1;
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap();
        boolean boolean32 = hashMap31.repOK();
        int int33 = hashMap31.size();
        java.lang.Object obj35 = hashMap31.get((java.lang.Object) 2);
        boolean boolean36 = hashMap31.isEmpty();
        system.classfixer.classes.HashMap hashMap37 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray38 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap37.table = entryArray38;
        int int40 = hashMap37.size();
        system.classfixer.classes.HashMap.Entry[] entryArray41 = hashMap37.table;
        hashMap37.modCount = ' ';
        java.lang.Object obj44 = hashMap31.get((java.lang.Object) hashMap37);
        java.lang.Object obj45 = hashMap0.put((java.lang.Object) hashMap18, obj44);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for hashMap0", hashMap0.property());
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) '4', (float) (byte) 100);
        java.lang.Object obj4 = hashMap2.get((java.lang.Object) (byte) 0);
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray7 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap6.table = entryArray7;
        hashMap5.table = entryArray7;
        hashMap5.modCount = (byte) 100;
        boolean boolean12 = hashMap5.isEmpty();
        boolean boolean13 = hashMap5.isEmpty();
        java.lang.Class<?> wildcardClass14 = hashMap5.getClass();
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap(10);
        hashMap16.clear();
        java.lang.Object obj18 = hashMap2.put((java.lang.Object) wildcardClass14, (java.lang.Object) hashMap16);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for hashMap2", hashMap2.property());
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) (short) 100);
        hashMap0.clear();
        boolean boolean4 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap7.clear();
        java.lang.Object obj10 = hashMap7.remove((java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap12.table = entryArray13;
        hashMap11.table = entryArray13;
        hashMap11.modCount = (byte) 100;
        boolean boolean18 = hashMap11.isEmpty();
        java.lang.Object obj19 = hashMap7.remove((java.lang.Object) boolean18);
        hashMap7.modCount = (byte) 0;
        hashMap7.modCount = (byte) 100;
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap25.clear();
        hashMap25.clear();
        java.lang.Object obj28 = hashMap0.put((java.lang.Object) (byte) 100, (java.lang.Object) hashMap25);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for hashMap0", hashMap0.property());
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        hashMap1.clear();
        int int4 = hashMap1.modCount;
        int int5 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        java.lang.Object obj8 = hashMap6.remove((java.lang.Object) (short) 100);
        int int9 = hashMap6.size();
        boolean boolean10 = hashMap6.isEmpty();
        hashMap6.clear();
        java.lang.Object obj12 = hashMap1.remove((java.lang.Object) hashMap6);
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) 'a');
        int int15 = hashMap14.size();
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap14.table;
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap18.clear();
        hashMap18.clear();
        int int21 = hashMap18.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray22 = hashMap18.table;
        java.lang.Object obj23 = hashMap14.get((java.lang.Object) entryArray22);
        int int24 = hashMap14.modCount;
        int int25 = hashMap14.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray26 = hashMap14.table;
        system.classfixer.classes.HashMap.Entry[] entryArray27 = hashMap14.table;
        system.classfixer.classes.HashMap.Entry[] entryArray28 = hashMap14.table;
        hashMap1.table = entryArray28;
        java.lang.Object obj31 = hashMap1.remove((java.lang.Object) (byte) 1);
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap34 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray36 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap35.table = entryArray36;
        hashMap34.table = entryArray36;
        hashMap33.table = entryArray36;
        system.classfixer.classes.HashMap.Entry[] entryArray40 = hashMap33.table;
        boolean boolean41 = hashMap33.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray42 = hashMap33.table;
        java.lang.Class<?> wildcardClass43 = hashMap33.getClass();
        system.classfixer.classes.HashMap hashMap46 = new system.classfixer.classes.HashMap(3, (float) 2);
        java.lang.Object obj47 = hashMap1.put((java.lang.Object) wildcardClass43, (java.lang.Object) hashMap46);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for hashMap1", hashMap1.property());
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 1, (float) (short) 10);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap4.clear();
        hashMap4.clear();
        java.lang.Object obj8 = hashMap4.get((java.lang.Object) (-1L));
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap(2, (float) (byte) 100);
        java.lang.Object obj12 = hashMap2.put(obj8, (java.lang.Object) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for hashMap2", hashMap2.property());
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        hashMap1.clear();
        int int4 = hashMap1.modCount;
        int int5 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        java.lang.Object obj8 = hashMap6.remove((java.lang.Object) (short) 100);
        int int9 = hashMap6.size();
        boolean boolean10 = hashMap6.isEmpty();
        hashMap6.clear();
        java.lang.Object obj12 = hashMap1.remove((java.lang.Object) hashMap6);
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        java.lang.Object obj15 = hashMap13.remove((java.lang.Object) (short) 100);
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap17.clear();
        hashMap17.clear();
        int int20 = hashMap17.modCount;
        int int21 = hashMap17.modCount;
        boolean boolean22 = hashMap17.repOK();
        java.lang.Object obj24 = hashMap17.get((java.lang.Object) 1.0f);
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Class<?> wildcardClass27 = hashMap26.getClass();
        java.lang.Object obj28 = hashMap17.get((java.lang.Object) wildcardClass27);
        system.classfixer.classes.HashMap.Entry[] entryArray29 = hashMap17.table;
        hashMap13.table = entryArray29;
        hashMap1.table = entryArray29;
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap();
        int int33 = hashMap32.modCount;
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap35.clear();
        java.lang.Object obj38 = hashMap35.remove((java.lang.Object) "");
        system.classfixer.classes.HashMap hashMap39 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap40 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray41 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap40.table = entryArray41;
        hashMap39.table = entryArray41;
        hashMap39.modCount = (byte) 100;
        boolean boolean46 = hashMap39.isEmpty();
        java.lang.Object obj47 = hashMap35.remove((java.lang.Object) boolean46);
        hashMap35.modCount = (byte) 0;
        boolean boolean50 = hashMap35.repOK();
        java.lang.Object obj51 = hashMap32.get((java.lang.Object) boolean50);
        system.classfixer.classes.HashMap hashMap54 = new system.classfixer.classes.HashMap((int) ' ', 1.0f);
        hashMap54.modCount = (short) 0;
        int int57 = hashMap54.modCount;
        java.lang.Object obj58 = hashMap1.put((java.lang.Object) hashMap32, (java.lang.Object) hashMap54);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for hashMap1", hashMap1.property());
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) '4');
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap3.clear();
        hashMap3.clear();
        int int6 = hashMap3.modCount;
        int int7 = hashMap3.modCount;
        boolean boolean8 = hashMap3.repOK();
        java.lang.Object obj10 = hashMap3.get((java.lang.Object) 1.0f);
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Class<?> wildcardClass13 = hashMap12.getClass();
        java.lang.Object obj14 = hashMap3.get((java.lang.Object) wildcardClass13);
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap16.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray18 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap16.table = entryArray18;
        boolean boolean20 = hashMap16.repOK();
        java.lang.Object obj21 = hashMap1.put((java.lang.Object) wildcardClass13, (java.lang.Object) hashMap16);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for hashMap1", hashMap1.property());
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        int int2 = hashMap1.size();
        hashMap1.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap1.table;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap6.clear();
        hashMap6.clear();
        java.lang.Object obj9 = hashMap1.get((java.lang.Object) hashMap6);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap11.clear();
        hashMap11.clear();
        int int14 = hashMap11.modCount;
        int int15 = hashMap11.modCount;
        boolean boolean16 = hashMap11.repOK();
        java.lang.Object obj18 = hashMap11.get((java.lang.Object) 1.0f);
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Class<?> wildcardClass21 = hashMap20.getClass();
        java.lang.Object obj22 = hashMap11.get((java.lang.Object) wildcardClass21);
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray24 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap23.table = entryArray24;
        system.classfixer.classes.HashMap.Entry[] entryArray26 = hashMap23.table;
        hashMap11.table = entryArray26;
        boolean boolean28 = hashMap11.isEmpty();
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap30.clear();
        hashMap30.clear();
        int int33 = hashMap30.modCount;
        boolean boolean34 = hashMap30.repOK();
        java.lang.Object obj35 = hashMap6.put((java.lang.Object) boolean28, (java.lang.Object) boolean34);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for hashMap6", hashMap6.property());
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        int int1 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 10, (float) 2);
        hashMap4.clear();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray7 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap6.table = entryArray7;
        int int9 = hashMap6.size();
        hashMap6.clear();
        java.lang.Object obj11 = hashMap4.get((java.lang.Object) hashMap6);
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap13.clear();
        hashMap13.clear();
        int int16 = hashMap13.modCount;
        int int17 = hashMap13.modCount;
        boolean boolean18 = hashMap13.repOK();
        java.lang.Object obj20 = hashMap13.get((java.lang.Object) 1.0f);
        java.lang.Object obj22 = hashMap13.remove((java.lang.Object) 1.0d);
        java.lang.Object obj23 = hashMap0.put(obj11, (java.lang.Object) hashMap13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for hashMap0", hashMap0.property());
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(2, (float) (byte) 100);
        boolean boolean3 = hashMap2.repOK();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        boolean boolean5 = hashMap4.repOK();
        boolean boolean6 = hashMap4.isEmpty();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap8.table = entryArray9;
        hashMap7.table = entryArray9;
        hashMap4.table = entryArray9;
        hashMap4.modCount = (byte) 10;
        hashMap4.modCount = (short) -1;
        int int17 = hashMap4.size();
        boolean boolean18 = hashMap4.repOK();
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        java.lang.Object obj21 = hashMap19.remove((java.lang.Object) (short) 100);
        int int22 = hashMap19.size();
        hashMap19.clear();
        int int24 = hashMap19.size();
        int int25 = hashMap19.size();
        boolean boolean26 = hashMap19.isEmpty();
        hashMap19.modCount = (byte) 10;
        java.lang.Object obj29 = hashMap2.put((java.lang.Object) hashMap4, (java.lang.Object) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for hashMap2", hashMap2.property());
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 1);
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap1.table;
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap8.table = entryArray9;
        hashMap7.table = entryArray9;
        hashMap6.table = entryArray9;
        hashMap6.clear();
        java.lang.Object obj14 = hashMap4.get((java.lang.Object) hashMap6);
        int int15 = hashMap4.modCount;
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        int int17 = hashMap16.size();
        hashMap16.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap16.table;
        int int20 = hashMap16.size();
        java.lang.Object obj21 = hashMap4.remove((java.lang.Object) int20);
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap(2, (float) (byte) 100);
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap26.clear();
        hashMap26.clear();
        int int29 = hashMap26.modCount;
        int int30 = hashMap26.modCount;
        boolean boolean31 = hashMap26.repOK();
        java.lang.Object obj33 = hashMap26.get((java.lang.Object) 1.0f);
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap((int) 'a');
        java.lang.Class<?> wildcardClass36 = hashMap35.getClass();
        java.lang.Object obj37 = hashMap26.get((java.lang.Object) wildcardClass36);
        system.classfixer.classes.HashMap hashMap39 = new system.classfixer.classes.HashMap((int) ' ');
        boolean boolean40 = hashMap39.repOK();
        system.classfixer.classes.HashMap hashMap42 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray43 = hashMap42.table;
        hashMap39.table = entryArray43;
        hashMap26.table = entryArray43;
        hashMap24.table = entryArray43;
        hashMap4.table = entryArray43;
        system.classfixer.classes.HashMap hashMap49 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap51 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap52 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap53 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray54 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap53.table = entryArray54;
        hashMap52.table = entryArray54;
        hashMap51.table = entryArray54;
        system.classfixer.classes.HashMap.Entry[] entryArray58 = hashMap51.table;
        boolean boolean59 = hashMap51.isEmpty();
        boolean boolean60 = hashMap51.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray61 = hashMap51.table;
        system.classfixer.classes.HashMap hashMap63 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap64 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap65 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray66 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap65.table = entryArray66;
        hashMap64.table = entryArray66;
        hashMap63.table = entryArray66;
        system.classfixer.classes.HashMap.Entry[] entryArray70 = hashMap63.table;
        boolean boolean71 = hashMap63.isEmpty();
        boolean boolean72 = hashMap63.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray73 = hashMap63.table;
        hashMap51.table = entryArray73;
        hashMap49.table = entryArray73;
        java.lang.Object obj76 = hashMap1.put((java.lang.Object) hashMap4, (java.lang.Object) entryArray73);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for hashMap1", hashMap1.property());
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        boolean boolean2 = hashMap1.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = hashMap1.table;
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap1.table;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        int int7 = hashMap6.size();
        hashMap6.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap6.table;
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap((int) 'a');
        int int12 = hashMap11.size();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap11.table;
        hashMap6.table = entryArray13;
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap6.table;
        java.lang.Object obj16 = hashMap1.put((java.lang.Object) 0.0f, (java.lang.Object) entryArray15);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for hashMap1", hashMap1.property());
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        int int1 = hashMap0.size();
        hashMap0.clear();
        int int3 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj6 = hashMap4.remove((java.lang.Object) (short) 100);
        int int7 = hashMap4.size();
        boolean boolean8 = hashMap4.isEmpty();
        hashMap4.modCount = 1;
        hashMap4.clear();
        int int12 = hashMap4.size();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap14.clear();
        hashMap14.clear();
        hashMap14.clear();
        java.lang.Object obj19 = hashMap14.remove((java.lang.Object) ' ');
        int int20 = hashMap14.size();
        hashMap14.clear();
        hashMap14.modCount = 0;
        int int24 = hashMap14.size();
        java.lang.Object obj25 = hashMap0.put((java.lang.Object) hashMap4, (java.lang.Object) hashMap14);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for hashMap0", hashMap0.property());
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        int int2 = hashMap1.size();
        hashMap1.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap1.table;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap6.clear();
        hashMap6.clear();
        java.lang.Object obj9 = hashMap1.get((java.lang.Object) hashMap6);
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) (byte) 10, (float) 2);
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) (short) 1);
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap((int) 'a');
        int int17 = hashMap16.size();
        boolean boolean18 = hashMap16.isEmpty();
        java.lang.Object obj19 = hashMap14.remove((java.lang.Object) hashMap16);
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap((int) 'a');
        int int22 = hashMap21.size();
        boolean boolean23 = hashMap21.isEmpty();
        boolean boolean24 = hashMap21.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray25 = hashMap21.table;
        hashMap16.table = entryArray25;
        java.lang.Object obj27 = hashMap6.put((java.lang.Object) 2, (java.lang.Object) hashMap16);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for hashMap6", hashMap6.property());
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) (short) 100);
        hashMap0.clear();
        int int4 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap6.clear();
        hashMap6.clear();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray15 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap14.table = entryArray15;
        hashMap13.table = entryArray15;
        hashMap12.table = entryArray15;
        hashMap12.clear();
        java.lang.Object obj20 = hashMap10.get((java.lang.Object) hashMap12);
        int int21 = hashMap10.modCount;
        java.lang.Object obj22 = hashMap6.get((java.lang.Object) int21);
        int int23 = hashMap6.modCount;
        int int24 = hashMap6.modCount;
        hashMap6.clear();
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap();
        int int27 = hashMap26.modCount;
        hashMap26.modCount = '#';
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap31.clear();
        hashMap31.clear();
        int int34 = hashMap31.modCount;
        int int35 = hashMap31.modCount;
        boolean boolean36 = hashMap31.repOK();
        java.lang.Object obj38 = hashMap31.get((java.lang.Object) 1.0f);
        java.lang.Object obj40 = hashMap31.remove((java.lang.Object) 1.0d);
        boolean boolean41 = hashMap31.repOK();
        system.classfixer.classes.HashMap hashMap43 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap44 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap45 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray46 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap45.table = entryArray46;
        hashMap44.table = entryArray46;
        hashMap43.table = entryArray46;
        hashMap31.table = entryArray46;
        hashMap26.table = entryArray46;
        java.lang.Object obj52 = hashMap0.put((java.lang.Object) hashMap6, (java.lang.Object) entryArray46);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for hashMap0", hashMap0.property());
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        hashMap1.clear();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap9.table = entryArray10;
        hashMap8.table = entryArray10;
        hashMap7.table = entryArray10;
        hashMap7.clear();
        java.lang.Object obj15 = hashMap5.get((java.lang.Object) hashMap7);
        int int16 = hashMap5.modCount;
        java.lang.Object obj17 = hashMap1.get((java.lang.Object) int16);
        int int18 = hashMap1.modCount;
        int int19 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap((int) (byte) 10, (float) 2);
        hashMap22.clear();
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray25 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap24.table = entryArray25;
        int int27 = hashMap24.size();
        hashMap24.clear();
        java.lang.Object obj29 = hashMap22.get((java.lang.Object) hashMap24);
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap(2, (float) (byte) 100);
        system.classfixer.classes.HashMap.Entry[] entryArray33 = hashMap32.table;
        int int34 = hashMap32.modCount;
        java.lang.Object obj35 = hashMap1.put(obj29, (java.lang.Object) int34);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for hashMap1", hashMap1.property());
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray4 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap3.table = entryArray4;
        hashMap2.table = entryArray4;
        hashMap1.table = entryArray4;
        hashMap1.clear();
        boolean boolean9 = hashMap1.repOK();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        int int11 = hashMap10.size();
        hashMap10.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap10.table;
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap((int) 'a');
        int int16 = hashMap15.size();
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap15.table;
        hashMap10.table = entryArray17;
        hashMap1.table = entryArray17;
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        java.lang.Object obj22 = hashMap20.remove((java.lang.Object) (short) 100);
        int int23 = hashMap20.size();
        hashMap20.clear();
        int int25 = hashMap20.size();
        boolean boolean26 = hashMap20.repOK();
        int int27 = hashMap20.modCount;
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap(0, (float) (short) 1);
        java.lang.Object obj31 = hashMap1.put((java.lang.Object) hashMap20, (java.lang.Object) (short) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for hashMap1", hashMap1.property());
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        hashMap1.clear();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap9.table = entryArray10;
        hashMap8.table = entryArray10;
        hashMap7.table = entryArray10;
        hashMap7.clear();
        java.lang.Object obj15 = hashMap5.get((java.lang.Object) hashMap7);
        int int16 = hashMap5.modCount;
        java.lang.Object obj17 = hashMap1.get((java.lang.Object) int16);
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap((int) 'a');
        int int20 = hashMap19.size();
        boolean boolean21 = hashMap19.isEmpty();
        boolean boolean22 = hashMap19.repOK();
        system.classfixer.classes.HashMap.Entry entry23 = null;
        system.classfixer.classes.HashMap.Entry[] entryArray24 = new system.classfixer.classes.HashMap.Entry[] { entry23 };
        hashMap19.table = entryArray24;
        system.classfixer.classes.HashMap.Entry[] entryArray26 = hashMap19.table;
        java.lang.Object obj27 = hashMap1.remove((java.lang.Object) hashMap19);
        boolean boolean28 = hashMap19.repOK();
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap();
        java.lang.Object obj31 = hashMap29.remove((java.lang.Object) (short) 100);
        hashMap29.clear();
        boolean boolean33 = hashMap29.isEmpty();
        boolean boolean34 = hashMap29.repOK();
        boolean boolean35 = hashMap29.repOK();
        system.classfixer.classes.HashMap hashMap37 = new system.classfixer.classes.HashMap(1);
        system.classfixer.classes.HashMap hashMap39 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap39.clear();
        hashMap39.clear();
        java.lang.Object obj43 = hashMap39.get((java.lang.Object) (-1L));
        system.classfixer.classes.HashMap.Entry[] entryArray44 = hashMap39.table;
        hashMap37.table = entryArray44;
        java.lang.Object obj46 = hashMap29.remove((java.lang.Object) entryArray44);
        system.classfixer.classes.HashMap hashMap48 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap48.clear();
        hashMap48.clear();
        int int51 = hashMap48.modCount;
        int int52 = hashMap48.modCount;
        boolean boolean53 = hashMap48.repOK();
        java.lang.Object obj55 = hashMap48.get((java.lang.Object) 1.0f);
        java.lang.Object obj57 = hashMap48.get((java.lang.Object) 1.0f);
        hashMap48.clear();
        int int59 = hashMap48.modCount;
        java.lang.Object obj60 = hashMap29.get((java.lang.Object) hashMap48);
        system.classfixer.classes.HashMap.Entry[] entryArray61 = null;
        hashMap29.table = entryArray61;
        java.lang.Object obj63 = hashMap19.remove((java.lang.Object) entryArray61);
        system.classfixer.classes.HashMap hashMap65 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap65.clear();
        system.classfixer.classes.HashMap hashMap67 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray68 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap67.table = entryArray68;
        hashMap65.table = entryArray68;
        hashMap65.modCount = 2;
        int int73 = hashMap65.size();
        int int74 = hashMap65.modCount;
        system.classfixer.classes.HashMap hashMap76 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap76.clear();
        hashMap76.clear();
        int int79 = hashMap76.modCount;
        int int80 = hashMap76.modCount;
        boolean boolean81 = hashMap76.repOK();
        java.lang.Object obj83 = hashMap76.get((java.lang.Object) 1.0f);
        java.lang.Object obj85 = hashMap76.remove((java.lang.Object) 1.0d);
        boolean boolean86 = hashMap76.repOK();
        system.classfixer.classes.HashMap hashMap88 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap89 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap90 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray91 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap90.table = entryArray91;
        hashMap89.table = entryArray91;
        hashMap88.table = entryArray91;
        hashMap76.table = entryArray91;
        hashMap65.table = entryArray91;
        java.lang.Object obj97 = null;
        java.lang.Object obj98 = hashMap19.put((java.lang.Object) entryArray91, obj97);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property) for hashMap19", hashMap19.property());
    }
}

