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
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        java.lang.Object obj5 = hashMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (byte) 0);
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap7.clear();
        boolean boolean9 = hashMap7.repOK();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap11.table = entryArray12;
        hashMap10.table = entryArray12;
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap19.clear();
        java.lang.Object obj21 = hashMap15.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap19);
        java.lang.Object obj22 = hashMap7.put((java.lang.Object) entryArray12, (java.lang.Object) hashMap19);
        hashMap1.table = entryArray12;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        java.lang.Object obj5 = hashMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (byte) 0);
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap7.table = entryArray8;
        hashMap6.table = entryArray8;
        hashMap1.table = entryArray8;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        boolean boolean3 = hashMap1.repOK();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap5.table = entryArray6;
        hashMap4.table = entryArray6;
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap13.clear();
        java.lang.Object obj15 = hashMap9.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap13);
        java.lang.Object obj16 = hashMap1.put((java.lang.Object) entryArray6, (java.lang.Object) hashMap13);
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap((int) (byte) 0);
        java.lang.Object obj22 = hashMap18.put((java.lang.Object) (-1.0f), (java.lang.Object) (byte) 0);
        int int23 = hashMap18.modCount;
        int int24 = hashMap18.size();
        hashMap18.modCount = 0;
        java.lang.Object obj28 = hashMap13.put((java.lang.Object) 0, (java.lang.Object) 1.0d);
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap((int) (byte) 10, (float) 2);
        system.classfixer.classes.HashMap.Entry[] entryArray32 = hashMap31.table;
        hashMap13.table = entryArray32;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap13", hashMap13.repOK_2());
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap4.clear();
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap4);
        int int7 = hashMap0.modCount;
        hashMap0.clear();
        int int9 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap14.clear();
        java.lang.Object obj16 = hashMap10.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap14);
        int int17 = hashMap10.modCount;
        hashMap10.clear();
        int int19 = hashMap10.modCount;
        java.lang.Object obj20 = hashMap0.get((java.lang.Object) int19);
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap26.clear();
        java.lang.Object obj28 = hashMap22.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap26);
        int int29 = hashMap22.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray30 = hashMap22.table;
        hashMap0.table = entryArray30;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 0, (float) 10);
        boolean boolean3 = hashMap2.isEmpty();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap5.clear();
        boolean boolean7 = hashMap5.isEmpty();
        boolean boolean8 = hashMap5.isEmpty();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap10.clear();
        boolean boolean12 = hashMap10.repOK();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray15 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap14.table = entryArray15;
        hashMap13.table = entryArray15;
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap22.clear();
        java.lang.Object obj24 = hashMap18.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap22);
        java.lang.Object obj25 = hashMap10.put((java.lang.Object) entryArray15, (java.lang.Object) hashMap22);
        hashMap22.modCount = (byte) 100;
        java.lang.Object obj29 = hashMap5.put((java.lang.Object) (byte) 100, (java.lang.Object) 10.0d);
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap34 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap34.clear();
        java.lang.Object obj36 = hashMap30.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap34);
        int int37 = hashMap30.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray38 = hashMap30.table;
        hashMap5.table = entryArray38;
        java.lang.Object obj40 = hashMap2.remove((java.lang.Object) hashMap5);
        system.classfixer.classes.HashMap hashMap41 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap43 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap45 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap45.clear();
        java.lang.Object obj47 = hashMap41.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap45);
        int int48 = hashMap41.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray49 = hashMap41.table;
        hashMap2.table = entryArray49;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        java.lang.Object obj5 = hashMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (byte) 0);
        int int6 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap11.clear();
        java.lang.Object obj13 = hashMap7.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap11);
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray15 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap14.table = entryArray15;
        hashMap11.table = entryArray15;
        hashMap1.table = entryArray15;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        java.lang.Object obj5 = hashMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (byte) 0);
        int int6 = hashMap1.modCount;
        int int7 = hashMap1.size();
        boolean boolean8 = hashMap1.isEmpty();
        int int9 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap14.clear();
        java.lang.Object obj16 = hashMap10.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap14);
        hashMap10.clear();
        int int18 = hashMap10.size();
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap20.clear();
        boolean boolean22 = hashMap20.repOK();
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray25 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap24.table = entryArray25;
        hashMap23.table = entryArray25;
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap32.clear();
        java.lang.Object obj34 = hashMap28.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap32);
        java.lang.Object obj35 = hashMap20.put((java.lang.Object) entryArray25, (java.lang.Object) hashMap32);
        hashMap32.modCount = (byte) 100;
        java.lang.Object obj38 = hashMap1.put((java.lang.Object) int18, (java.lang.Object) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        java.lang.Object obj5 = hashMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (byte) 0);
        int int6 = hashMap1.modCount;
        int int7 = hashMap1.size();
        hashMap1.modCount = 0;
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) (short) 0, (float) 10);
        hashMap12.clear();
        hashMap12.clear();
        boolean boolean15 = hashMap12.repOK();
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray17 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap16.table = entryArray17;
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap16.table;
        java.lang.Object obj20 = hashMap12.remove((java.lang.Object) entryArray19);
        hashMap1.table = entryArray19;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray1 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap0.table = entryArray1;
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap7.clear();
        java.lang.Object obj9 = hashMap3.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap7);
        int int10 = hashMap3.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap3.table;
        hashMap0.table = entryArray11;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        java.lang.Object obj5 = hashMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (byte) 0);
        hashMap1.modCount = (-1);
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap11.table = entryArray12;
        hashMap10.table = entryArray12;
        hashMap9.table = entryArray12;
        hashMap1.table = entryArray12;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        java.lang.Object obj5 = hashMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (byte) 0);
        int int6 = hashMap1.modCount;
        java.lang.Object obj7 = null;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap12.clear();
        java.lang.Object obj14 = hashMap8.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap12);
        int int15 = hashMap8.modCount;
        hashMap8.clear();
        int int17 = hashMap8.modCount;
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap22.clear();
        java.lang.Object obj24 = hashMap18.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap22);
        int int25 = hashMap18.modCount;
        hashMap18.clear();
        int int27 = hashMap18.modCount;
        java.lang.Object obj28 = hashMap8.get((java.lang.Object) int27);
        java.lang.Object obj29 = hashMap1.put(obj7, (java.lang.Object) int27);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        java.lang.Object obj5 = hashMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (byte) 0);
        int int6 = hashMap1.modCount;
        int int7 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (short) 0, (float) (byte) 1);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap15.clear();
        java.lang.Object obj17 = hashMap11.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap15);
        int int18 = hashMap11.modCount;
        hashMap11.clear();
        int int20 = hashMap11.modCount;
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap25.clear();
        java.lang.Object obj27 = hashMap21.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap25);
        int int28 = hashMap21.modCount;
        hashMap21.clear();
        int int30 = hashMap21.modCount;
        java.lang.Object obj31 = hashMap11.get((java.lang.Object) int30);
        int int32 = hashMap11.size();
        java.lang.Object obj33 = hashMap10.remove((java.lang.Object) int32);
        boolean boolean34 = hashMap10.isEmpty();
        int int35 = hashMap10.size();
        system.classfixer.classes.HashMap hashMap37 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap37.clear();
        boolean boolean39 = hashMap37.repOK();
        system.classfixer.classes.HashMap hashMap40 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap41 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray42 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap41.table = entryArray42;
        hashMap40.table = entryArray42;
        system.classfixer.classes.HashMap hashMap45 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap47 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap49 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap49.clear();
        java.lang.Object obj51 = hashMap45.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap49);
        java.lang.Object obj52 = hashMap37.put((java.lang.Object) entryArray42, (java.lang.Object) hashMap49);
        hashMap37.clear();
        boolean boolean54 = hashMap37.isEmpty();
        system.classfixer.classes.HashMap hashMap57 = new system.classfixer.classes.HashMap((int) (short) 0, (float) 10);
        hashMap57.clear();
        hashMap57.clear();
        boolean boolean60 = hashMap57.repOK();
        system.classfixer.classes.HashMap hashMap61 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray62 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap61.table = entryArray62;
        system.classfixer.classes.HashMap.Entry[] entryArray64 = hashMap61.table;
        java.lang.Object obj65 = hashMap57.remove((java.lang.Object) entryArray64);
        hashMap37.table = entryArray64;
        java.lang.Object obj67 = hashMap1.put((java.lang.Object) int35, (java.lang.Object) entryArray64);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 1, (float) 1L);
        java.lang.Object obj3 = null;
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap8.clear();
        java.lang.Object obj10 = hashMap4.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap8);
        hashMap4.clear();
        boolean boolean12 = hashMap4.repOK();
        boolean boolean13 = hashMap4.repOK();
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap15.clear();
        boolean boolean17 = hashMap15.repOK();
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray20 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap19.table = entryArray20;
        hashMap18.table = entryArray20;
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap27.clear();
        java.lang.Object obj29 = hashMap23.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap27);
        java.lang.Object obj30 = hashMap15.put((java.lang.Object) entryArray20, (java.lang.Object) hashMap27);
        hashMap15.clear();
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray33 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap32.table = entryArray33;
        java.lang.Object obj35 = hashMap15.remove((java.lang.Object) hashMap32);
        java.lang.Object obj36 = hashMap4.remove(obj35);
        java.lang.Object obj37 = hashMap2.put(obj3, obj35);
        system.classfixer.classes.HashMap hashMap38 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap39 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray40 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap39.table = entryArray40;
        hashMap38.table = entryArray40;
        system.classfixer.classes.HashMap hashMap43 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap44 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray45 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap44.table = entryArray45;
        hashMap43.table = entryArray45;
        hashMap38.table = entryArray45;
        system.classfixer.classes.HashMap.Entry[] entryArray49 = hashMap38.table;
        hashMap38.modCount = (short) -1;
        boolean boolean52 = hashMap38.repOK();
        system.classfixer.classes.HashMap hashMap53 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap55 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap57 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap57.clear();
        java.lang.Object obj59 = hashMap53.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap57);
        int int60 = hashMap53.modCount;
        hashMap53.clear();
        int int62 = hashMap53.modCount;
        system.classfixer.classes.HashMap hashMap63 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap65 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap67 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap67.clear();
        java.lang.Object obj69 = hashMap63.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap67);
        int int70 = hashMap63.modCount;
        hashMap63.clear();
        int int72 = hashMap63.modCount;
        java.lang.Object obj73 = hashMap53.get((java.lang.Object) int72);
        system.classfixer.classes.HashMap.Entry[] entryArray74 = hashMap53.table;
        hashMap38.table = entryArray74;
        hashMap2.table = entryArray74;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(0, (float) (byte) 100);
        int int3 = hashMap2.size();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) (byte) 0);
        java.lang.Object obj9 = hashMap5.put((java.lang.Object) (-1.0f), (java.lang.Object) (byte) 0);
        hashMap5.modCount = (-1);
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap13.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap13.table;
        int int16 = hashMap13.size();
        java.lang.Object obj17 = null;
        java.lang.Object obj18 = hashMap13.get(obj17);
        int int19 = hashMap13.size();
        boolean boolean20 = hashMap13.isEmpty();
        java.lang.Object obj21 = hashMap5.remove((java.lang.Object) boolean20);
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap23.clear();
        boolean boolean25 = hashMap23.isEmpty();
        boolean boolean26 = hashMap23.isEmpty();
        boolean boolean27 = hashMap23.repOK();
        java.lang.Object obj28 = hashMap2.put(obj21, (java.lang.Object) boolean27);
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap((int) (short) 0);
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap33.clear();
        boolean boolean35 = hashMap33.repOK();
        system.classfixer.classes.HashMap hashMap36 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap37 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray38 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap37.table = entryArray38;
        hashMap36.table = entryArray38;
        system.classfixer.classes.HashMap hashMap41 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap43 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap45 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap45.clear();
        java.lang.Object obj47 = hashMap41.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap45);
        java.lang.Object obj48 = hashMap33.put((java.lang.Object) entryArray38, (java.lang.Object) hashMap45);
        hashMap33.clear();
        system.classfixer.classes.HashMap hashMap50 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray51 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap50.table = entryArray51;
        java.lang.Object obj53 = hashMap33.remove((java.lang.Object) hashMap50);
        java.lang.Class<?> wildcardClass54 = hashMap50.getClass();
        java.lang.Object obj55 = hashMap30.put((java.lang.Object) 0, (java.lang.Object) hashMap50);
        system.classfixer.classes.HashMap hashMap56 = new system.classfixer.classes.HashMap();
        int int57 = hashMap56.modCount;
        system.classfixer.classes.HashMap hashMap58 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray59 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap58.table = entryArray59;
        int int61 = hashMap58.size();
        int int62 = hashMap58.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray63 = hashMap58.table;
        java.lang.Object obj64 = hashMap56.get((java.lang.Object) hashMap58);
        system.classfixer.classes.HashMap.Entry[] entryArray65 = hashMap58.table;
        hashMap50.table = entryArray65;
        hashMap2.table = entryArray65;
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
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap4.clear();
        boolean boolean6 = hashMap4.repOK();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap8.table = entryArray9;
        hashMap7.table = entryArray9;
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap16.clear();
        java.lang.Object obj18 = hashMap12.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap16);
        java.lang.Object obj19 = hashMap4.put((java.lang.Object) entryArray9, (java.lang.Object) hashMap16);
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap((int) (byte) 0);
        java.lang.Object obj25 = hashMap21.put((java.lang.Object) (-1.0f), (java.lang.Object) (byte) 0);
        int int26 = hashMap21.modCount;
        int int27 = hashMap21.size();
        hashMap21.modCount = 0;
        java.lang.Object obj31 = hashMap16.put((java.lang.Object) 0, (java.lang.Object) 1.0d);
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap((int) (byte) 1);
        java.lang.Object obj34 = hashMap16.get((java.lang.Object) hashMap33);
        system.classfixer.classes.HashMap.Entry[] entryArray35 = hashMap16.table;
        hashMap0.table = entryArray35;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        java.lang.Object obj5 = hashMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (byte) 0);
        int int6 = hashMap1.modCount;
        boolean boolean7 = hashMap1.isEmpty();
        hashMap1.clear();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray11 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap10.table = entryArray11;
        hashMap9.table = entryArray11;
        java.lang.Object obj14 = hashMap1.remove((java.lang.Object) hashMap9);
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap19.clear();
        java.lang.Object obj21 = hashMap15.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap19);
        int int22 = hashMap15.modCount;
        hashMap15.clear();
        int int24 = hashMap15.modCount;
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap29.clear();
        java.lang.Object obj31 = hashMap25.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap29);
        int int32 = hashMap25.modCount;
        hashMap25.clear();
        int int34 = hashMap25.modCount;
        java.lang.Object obj35 = hashMap15.get((java.lang.Object) int34);
        boolean boolean36 = hashMap15.isEmpty();
        system.classfixer.classes.HashMap hashMap37 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap39 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap41 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap41.clear();
        java.lang.Object obj43 = hashMap37.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap41);
        int int44 = hashMap37.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray45 = hashMap37.table;
        java.lang.Object obj46 = hashMap15.get((java.lang.Object) entryArray45);
        hashMap9.table = entryArray45;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap9", hashMap9.repOK_2());
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        boolean boolean3 = hashMap1.isEmpty();
        boolean boolean4 = hashMap1.isEmpty();
        boolean boolean5 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap10.clear();
        java.lang.Object obj12 = hashMap6.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap10);
        int int13 = hashMap6.modCount;
        hashMap6.clear();
        int int15 = hashMap6.modCount;
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap20.clear();
        java.lang.Object obj22 = hashMap16.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap20);
        int int23 = hashMap16.modCount;
        hashMap16.clear();
        int int25 = hashMap16.modCount;
        java.lang.Object obj26 = hashMap6.get((java.lang.Object) int25);
        system.classfixer.classes.HashMap.Entry[] entryArray27 = hashMap6.table;
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap((int) (short) 0, (float) 10);
        hashMap30.clear();
        hashMap30.clear();
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap((int) (byte) 10, (float) (byte) 10);
        int int36 = hashMap35.size();
        java.lang.Object obj37 = hashMap30.remove((java.lang.Object) hashMap35);
        hashMap35.clear();
        hashMap35.clear();
        java.lang.Object obj40 = hashMap6.get((java.lang.Object) hashMap35);
        system.classfixer.classes.HashMap hashMap42 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray43 = hashMap42.table;
        boolean boolean44 = hashMap42.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray45 = hashMap42.table;
        java.lang.Object obj46 = hashMap1.put((java.lang.Object) hashMap6, (java.lang.Object) entryArray45);
        system.classfixer.classes.HashMap hashMap47 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap49 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap51 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap51.clear();
        java.lang.Object obj53 = hashMap47.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap51);
        hashMap47.clear();
        boolean boolean55 = hashMap47.repOK();
        boolean boolean56 = hashMap47.repOK();
        system.classfixer.classes.HashMap hashMap57 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap59 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap61 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap61.clear();
        java.lang.Object obj63 = hashMap57.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap61);
        system.classfixer.classes.HashMap hashMap66 = new system.classfixer.classes.HashMap((int) (short) 0, (float) 10);
        java.lang.Object obj67 = hashMap47.put((java.lang.Object) (byte) 0, (java.lang.Object) (short) 0);
        boolean boolean68 = hashMap47.isEmpty();
        hashMap47.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray70 = hashMap47.table;
        hashMap1.table = entryArray70;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap4.clear();
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap4);
        boolean boolean7 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap12.clear();
        java.lang.Object obj14 = hashMap8.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap12);
        hashMap8.clear();
        hashMap8.modCount = ' ';
        int int18 = hashMap8.size();
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap20.clear();
        java.lang.Object obj22 = hashMap8.get((java.lang.Object) hashMap20);
        hashMap20.clear();
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap25.clear();
        boolean boolean27 = hashMap25.repOK();
        java.lang.Object obj29 = hashMap25.get((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap((int) (byte) 10, (float) 2);
        system.classfixer.classes.HashMap.Entry[] entryArray33 = hashMap32.table;
        system.classfixer.classes.HashMap.Entry[] entryArray34 = hashMap32.table;
        java.lang.Object obj35 = hashMap25.remove((java.lang.Object) entryArray34);
        hashMap20.table = entryArray34;
        hashMap0.table = entryArray34;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 1);
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap6.clear();
        java.lang.Object obj8 = hashMap2.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap6);
        int int9 = hashMap2.modCount;
        hashMap2.clear();
        int int11 = hashMap2.modCount;
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap16.clear();
        java.lang.Object obj18 = hashMap12.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap16);
        int int19 = hashMap12.modCount;
        hashMap12.clear();
        int int21 = hashMap12.modCount;
        java.lang.Object obj22 = hashMap2.get((java.lang.Object) int21);
        boolean boolean23 = hashMap2.isEmpty();
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap28.clear();
        java.lang.Object obj30 = hashMap24.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap28);
        int int31 = hashMap24.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray32 = hashMap24.table;
        java.lang.Object obj33 = hashMap2.get((java.lang.Object) entryArray32);
        hashMap1.table = entryArray32;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap4.clear();
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap4);
        int int7 = hashMap0.modCount;
        hashMap0.clear();
        int int9 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap14.clear();
        java.lang.Object obj16 = hashMap10.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap14);
        int int17 = hashMap10.modCount;
        hashMap10.clear();
        int int19 = hashMap10.modCount;
        java.lang.Object obj20 = hashMap0.get((java.lang.Object) int19);
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap22.clear();
        boolean boolean24 = hashMap22.repOK();
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray27 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap26.table = entryArray27;
        hashMap25.table = entryArray27;
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap34 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap34.clear();
        java.lang.Object obj36 = hashMap30.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap34);
        java.lang.Object obj37 = hashMap22.put((java.lang.Object) entryArray27, (java.lang.Object) hashMap34);
        java.lang.Object obj38 = hashMap0.remove(obj37);
        java.lang.Object obj40 = hashMap0.get((java.lang.Object) 1.0f);
        boolean boolean41 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap43 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap43.clear();
        boolean boolean45 = hashMap43.repOK();
        system.classfixer.classes.HashMap hashMap46 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap47 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray48 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap47.table = entryArray48;
        hashMap46.table = entryArray48;
        system.classfixer.classes.HashMap hashMap51 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap53 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap55 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap55.clear();
        java.lang.Object obj57 = hashMap51.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap55);
        java.lang.Object obj58 = hashMap43.put((java.lang.Object) entryArray48, (java.lang.Object) hashMap55);
        system.classfixer.classes.HashMap hashMap60 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap63 = new system.classfixer.classes.HashMap((int) (byte) 0);
        java.lang.Object obj64 = hashMap60.put((java.lang.Object) (-1.0f), (java.lang.Object) (byte) 0);
        int int65 = hashMap60.modCount;
        int int66 = hashMap60.size();
        hashMap60.modCount = 0;
        java.lang.Object obj70 = hashMap55.put((java.lang.Object) 0, (java.lang.Object) 1.0d);
        system.classfixer.classes.HashMap.Entry[] entryArray71 = hashMap55.table;
        hashMap0.table = entryArray71;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 0, (float) 10);
        boolean boolean3 = hashMap2.isEmpty();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap5.clear();
        boolean boolean7 = hashMap5.isEmpty();
        boolean boolean8 = hashMap5.isEmpty();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap10.clear();
        boolean boolean12 = hashMap10.repOK();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray15 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap14.table = entryArray15;
        hashMap13.table = entryArray15;
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap22.clear();
        java.lang.Object obj24 = hashMap18.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap22);
        java.lang.Object obj25 = hashMap10.put((java.lang.Object) entryArray15, (java.lang.Object) hashMap22);
        hashMap22.modCount = (byte) 100;
        java.lang.Object obj29 = hashMap5.put((java.lang.Object) (byte) 100, (java.lang.Object) 10.0d);
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap34 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap34.clear();
        java.lang.Object obj36 = hashMap30.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap34);
        int int37 = hashMap30.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray38 = hashMap30.table;
        hashMap5.table = entryArray38;
        java.lang.Object obj40 = hashMap2.remove((java.lang.Object) hashMap5);
        system.classfixer.classes.HashMap hashMap41 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap43 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap45 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap45.clear();
        java.lang.Object obj47 = hashMap41.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap45);
        hashMap41.clear();
        int int49 = hashMap41.size();
        hashMap41.clear();
        system.classfixer.classes.HashMap hashMap51 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap53 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap55 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap55.clear();
        java.lang.Object obj57 = hashMap51.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap55);
        system.classfixer.classes.HashMap hashMap58 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray59 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap58.table = entryArray59;
        hashMap55.table = entryArray59;
        boolean boolean62 = hashMap55.repOK();
        java.lang.Class<?> wildcardClass63 = hashMap55.getClass();
        java.lang.Object obj64 = hashMap5.put((java.lang.Object) hashMap41, (java.lang.Object) wildcardClass63);
        system.classfixer.classes.HashMap hashMap66 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap66.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray68 = hashMap66.table;
        int int69 = hashMap66.modCount;
        hashMap66.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray71 = hashMap66.table;
        hashMap5.table = entryArray71;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap5", hashMap5.repOK_2());
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) ' ');
        boolean boolean2 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        int int4 = hashMap3.modCount;
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap5.table = entryArray6;
        int int8 = hashMap5.size();
        int int9 = hashMap5.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap5.table;
        java.lang.Object obj11 = hashMap3.get((java.lang.Object) hashMap5);
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) (byte) 10, (float) (byte) 10);
        int int15 = hashMap14.size();
        java.lang.Object obj16 = hashMap1.put(obj11, (java.lang.Object) int15);
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap1.table;
        java.lang.Object obj18 = null;
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap((int) (byte) 0);
        java.lang.Object obj24 = hashMap20.put((java.lang.Object) (-1.0f), (java.lang.Object) (byte) 0);
        boolean boolean25 = hashMap20.isEmpty();
        java.lang.Object obj26 = hashMap1.put(obj18, (java.lang.Object) hashMap20);
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray31 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap30.table = entryArray31;
        hashMap29.table = entryArray31;
        hashMap28.table = entryArray31;
        hashMap1.table = entryArray31;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 0, (float) 10);
        hashMap2.clear();
        int int4 = hashMap2.modCount;
        java.lang.Object obj7 = hashMap2.put((java.lang.Object) 1L, (java.lang.Object) 1);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap12.clear();
        java.lang.Object obj14 = hashMap8.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap12);
        boolean boolean15 = hashMap12.isEmpty();
        boolean boolean16 = hashMap12.repOK();
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap((int) (short) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap18.table;
        boolean boolean20 = hashMap18.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap18.table;
        java.lang.Object obj22 = hashMap2.put((java.lang.Object) hashMap12, (java.lang.Object) entryArray21);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }
}

