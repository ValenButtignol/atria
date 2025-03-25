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
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap3.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray5 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap3.table = entryArray5;
        hashMap0.table = entryArray5;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap0.table;
        hashMap0.modCount = (short) 0;
        system.classfixer.classes.HashMap.Entry[] entryArray10 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap0.table = entryArray10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        hashMap0.clear();
        int int2 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean5 = hashMap4.isEmpty();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap7.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap7.table = entryArray9;
        java.lang.Object obj11 = hashMap4.get((java.lang.Object) entryArray9);
        hashMap0.table = entryArray9;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap0.put((java.lang.Object) 100, (java.lang.Object) hashMap4);
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean8 = hashMap7.isEmpty();
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = hashMap4.put((java.lang.Object) boolean8, obj9);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap4", hashMap4.repOK_2());
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 10, (float) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 100, (float) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean2 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap4.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap4.table = entryArray6;
        java.lang.Object obj8 = hashMap1.get((java.lang.Object) entryArray6);
        int int9 = hashMap1.size();
        boolean boolean10 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap1.table;
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        java.lang.Object obj15 = hashMap12.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        java.lang.Object obj19 = hashMap16.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        int int20 = hashMap16.size();
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean23 = hashMap22.isEmpty();
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap25.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray27 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap25.table = entryArray27;
        java.lang.Object obj29 = hashMap22.get((java.lang.Object) entryArray27);
        int int30 = hashMap22.size();
        boolean boolean31 = hashMap22.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray32 = hashMap22.table;
        system.classfixer.classes.HashMap hashMap34 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean35 = hashMap34.isEmpty();
        system.classfixer.classes.HashMap hashMap37 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap37.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray39 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap37.table = entryArray39;
        java.lang.Object obj41 = hashMap34.get((java.lang.Object) entryArray39);
        int int42 = hashMap34.size();
        boolean boolean43 = hashMap34.isEmpty();
        hashMap34.clear();
        int int45 = hashMap34.size();
        int int46 = hashMap34.modCount;
        system.classfixer.classes.HashMap hashMap48 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean49 = hashMap48.isEmpty();
        java.lang.Object obj50 = null;
        java.lang.Object obj51 = hashMap48.remove(obj50);
        hashMap48.clear();
        java.lang.Object obj53 = hashMap34.get((java.lang.Object) hashMap48);
        java.lang.Object obj54 = hashMap16.put((java.lang.Object) hashMap22, (java.lang.Object) hashMap34);
        java.lang.Object obj55 = hashMap1.put((java.lang.Object) (byte) 100, obj54);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        boolean boolean4 = hashMap0.repOK();
        hashMap0.clear();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap7.table;
        hashMap0.table = entryArray8;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap0.put((java.lang.Object) 100, (java.lang.Object) hashMap4);
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean8 = hashMap7.isEmpty();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap10.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap10.table = entryArray12;
        java.lang.Object obj14 = hashMap7.get((java.lang.Object) entryArray12);
        int int15 = hashMap7.size();
        boolean boolean16 = hashMap7.isEmpty();
        hashMap7.clear();
        hashMap7.modCount = 1;
        system.classfixer.classes.HashMap.Entry[] entryArray20 = hashMap7.table;
        hashMap4.table = entryArray20;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap4", hashMap4.repOK_2());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        boolean boolean4 = hashMap0.repOK();
        hashMap0.clear();
        boolean boolean6 = hashMap0.repOK();
        java.lang.Object obj7 = null;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        java.lang.Object obj11 = hashMap8.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        int int12 = hashMap8.size();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean15 = hashMap14.isEmpty();
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap17.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray19 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap17.table = entryArray19;
        java.lang.Object obj21 = hashMap14.get((java.lang.Object) entryArray19);
        int int22 = hashMap14.size();
        boolean boolean23 = hashMap14.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap14.table;
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean27 = hashMap26.isEmpty();
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap29.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray31 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap29.table = entryArray31;
        java.lang.Object obj33 = hashMap26.get((java.lang.Object) entryArray31);
        int int34 = hashMap26.size();
        boolean boolean35 = hashMap26.isEmpty();
        hashMap26.clear();
        int int37 = hashMap26.size();
        int int38 = hashMap26.modCount;
        system.classfixer.classes.HashMap hashMap40 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean41 = hashMap40.isEmpty();
        java.lang.Object obj42 = null;
        java.lang.Object obj43 = hashMap40.remove(obj42);
        hashMap40.clear();
        java.lang.Object obj45 = hashMap26.get((java.lang.Object) hashMap40);
        java.lang.Object obj46 = hashMap8.put((java.lang.Object) hashMap14, (java.lang.Object) hashMap26);
        java.lang.Object obj47 = hashMap0.put(obj7, (java.lang.Object) hashMap14);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) '4', (float) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 10, (float) 2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        hashMap0.clear();
        int int2 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean5 = hashMap4.isEmpty();
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = hashMap4.remove(obj6);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        java.lang.Object obj11 = hashMap8.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        boolean boolean12 = hashMap8.repOK();
        hashMap8.clear();
        boolean boolean14 = hashMap8.repOK();
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        java.lang.Object obj18 = hashMap15.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj21 = hashMap15.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray22 = hashMap15.table;
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap();
        java.lang.Object obj25 = hashMap23.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap();
        java.lang.Object obj28 = hashMap23.put((java.lang.Object) 100, (java.lang.Object) hashMap27);
        boolean boolean29 = hashMap27.isEmpty();
        java.lang.Object obj30 = hashMap15.get((java.lang.Object) hashMap27);
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap();
        java.lang.Object obj34 = hashMap31.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        boolean boolean35 = hashMap31.repOK();
        hashMap31.clear();
        int int37 = hashMap31.modCount;
        boolean boolean38 = hashMap31.repOK();
        java.lang.Object obj39 = hashMap8.put((java.lang.Object) hashMap15, (java.lang.Object) hashMap31);
        java.lang.Object obj40 = hashMap0.put(obj6, (java.lang.Object) hashMap31);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap0.table;
        hashMap0.modCount = (short) 0;
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean12 = hashMap11.isEmpty();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap14.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray16 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap14.table = entryArray16;
        java.lang.Object obj18 = hashMap11.get((java.lang.Object) entryArray16);
        int int19 = hashMap11.size();
        boolean boolean20 = hashMap11.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap11.table;
        hashMap0.table = entryArray21;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(1, (float) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean6 = hashMap5.isEmpty();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap8.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap8.table = entryArray10;
        java.lang.Object obj12 = hashMap5.get((java.lang.Object) entryArray10);
        int int13 = hashMap5.size();
        boolean boolean14 = hashMap5.isEmpty();
        hashMap5.clear();
        int int16 = hashMap5.size();
        int int17 = hashMap5.modCount;
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean20 = hashMap19.isEmpty();
        java.lang.Object obj21 = null;
        java.lang.Object obj22 = hashMap19.remove(obj21);
        hashMap19.clear();
        java.lang.Object obj24 = hashMap5.get((java.lang.Object) hashMap19);
        java.lang.Object obj25 = hashMap1.put((java.lang.Object) 100L, obj24);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 1, (float) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap2.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj8 = hashMap2.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap2.table;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        java.lang.Object obj13 = hashMap10.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj16 = hashMap10.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap10.table;
        hashMap10.modCount = (short) 0;
        java.lang.Object obj20 = hashMap1.put((java.lang.Object) hashMap2, (java.lang.Object) hashMap10);
        boolean boolean21 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean24 = hashMap23.isEmpty();
        java.lang.Object obj25 = null;
        java.lang.Object obj26 = hashMap23.remove(obj25);
        hashMap23.clear();
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap(0);
        int int30 = hashMap29.size();
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap32.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray34 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap32.table = entryArray34;
        hashMap29.table = entryArray34;
        java.lang.Object obj37 = hashMap23.get((java.lang.Object) hashMap29);
        int int38 = hashMap29.modCount;
        system.classfixer.classes.HashMap hashMap40 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap42 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean43 = hashMap42.isEmpty();
        system.classfixer.classes.HashMap hashMap45 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap45.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray47 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap45.table = entryArray47;
        java.lang.Object obj49 = hashMap42.get((java.lang.Object) entryArray47);
        int int50 = hashMap42.size();
        boolean boolean51 = hashMap42.isEmpty();
        hashMap42.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray53 = hashMap42.table;
        hashMap40.table = entryArray53;
        hashMap29.table = entryArray53;
        hashMap1.table = entryArray53;
        system.classfixer.classes.HashMap hashMap58 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap60 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean61 = hashMap60.isEmpty();
        system.classfixer.classes.HashMap hashMap63 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap63.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray65 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap63.table = entryArray65;
        java.lang.Object obj67 = hashMap60.get((java.lang.Object) entryArray65);
        int int68 = hashMap60.size();
        boolean boolean69 = hashMap60.isEmpty();
        hashMap60.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray71 = hashMap60.table;
        hashMap58.table = entryArray71;
        java.lang.Object obj74 = hashMap1.put((java.lang.Object) entryArray71, (java.lang.Object) "");
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean5 = hashMap4.isEmpty();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap7.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap7.table = entryArray9;
        java.lang.Object obj11 = hashMap4.get((java.lang.Object) entryArray9);
        int int12 = hashMap4.size();
        boolean boolean13 = hashMap4.isEmpty();
        hashMap4.clear();
        int int15 = hashMap4.size();
        int int16 = hashMap4.modCount;
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean19 = hashMap18.isEmpty();
        java.lang.Object obj20 = null;
        java.lang.Object obj21 = hashMap18.remove(obj20);
        hashMap18.clear();
        java.lang.Object obj23 = hashMap4.get((java.lang.Object) hashMap18);
        java.lang.Object obj24 = null;
        java.lang.Object obj25 = hashMap0.put((java.lang.Object) hashMap18, obj24);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        boolean boolean4 = hashMap0.repOK();
        hashMap0.clear();
        int int6 = hashMap0.size();
        hashMap0.modCount = 0;
        hashMap0.modCount = (byte) 100;
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean13 = hashMap12.isEmpty();
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap15.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray17 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap15.table = entryArray17;
        java.lang.Object obj19 = hashMap12.get((java.lang.Object) entryArray17);
        int int20 = hashMap12.size();
        boolean boolean21 = hashMap12.isEmpty();
        hashMap12.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray23 = hashMap12.table;
        hashMap0.table = entryArray23;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(0, (float) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        hashMap0.clear();
        int int2 = hashMap0.size();
        boolean boolean3 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean6 = hashMap5.isEmpty();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap8.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap8.table = entryArray10;
        java.lang.Object obj12 = hashMap5.get((java.lang.Object) entryArray10);
        int int13 = hashMap5.size();
        boolean boolean14 = hashMap5.isEmpty();
        hashMap5.clear();
        int int16 = hashMap5.size();
        int int17 = hashMap5.modCount;
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        java.lang.Object obj20 = hashMap18.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        java.lang.Object obj23 = hashMap18.put((java.lang.Object) 100, (java.lang.Object) hashMap22);
        boolean boolean24 = hashMap22.isEmpty();
        boolean boolean25 = hashMap22.isEmpty();
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean28 = hashMap27.isEmpty();
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap30.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray32 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap30.table = entryArray32;
        java.lang.Object obj34 = hashMap27.get((java.lang.Object) entryArray32);
        system.classfixer.classes.HashMap.Entry[] entryArray35 = hashMap27.table;
        system.classfixer.classes.HashMap hashMap37 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap38 = new system.classfixer.classes.HashMap();
        java.lang.Object obj41 = hashMap38.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj44 = hashMap38.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray45 = hashMap38.table;
        system.classfixer.classes.HashMap hashMap46 = new system.classfixer.classes.HashMap();
        java.lang.Object obj49 = hashMap46.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj52 = hashMap46.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray53 = hashMap46.table;
        hashMap46.modCount = (short) 0;
        java.lang.Object obj56 = hashMap37.put((java.lang.Object) hashMap38, (java.lang.Object) hashMap46);
        hashMap37.modCount = ' ';
        java.lang.Object obj59 = hashMap22.put((java.lang.Object) entryArray35, (java.lang.Object) ' ');
        hashMap5.table = entryArray35;
        hashMap0.table = entryArray35;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(10, (float) 10L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) ' ', (float) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        int int2 = hashMap1.size();
        boolean boolean3 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        java.lang.Object obj9 = hashMap6.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj12 = hashMap6.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap6.table;
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        java.lang.Object obj17 = hashMap14.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj20 = hashMap14.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap14.table;
        hashMap14.modCount = (short) 0;
        java.lang.Object obj24 = hashMap5.put((java.lang.Object) hashMap6, (java.lang.Object) hashMap14);
        boolean boolean25 = hashMap5.isEmpty();
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean28 = hashMap27.isEmpty();
        java.lang.Object obj29 = null;
        java.lang.Object obj30 = hashMap27.remove(obj29);
        hashMap27.clear();
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap(0);
        int int34 = hashMap33.size();
        system.classfixer.classes.HashMap hashMap36 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap36.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray38 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap36.table = entryArray38;
        hashMap33.table = entryArray38;
        java.lang.Object obj41 = hashMap27.get((java.lang.Object) hashMap33);
        int int42 = hashMap33.modCount;
        system.classfixer.classes.HashMap hashMap44 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap46 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean47 = hashMap46.isEmpty();
        system.classfixer.classes.HashMap hashMap49 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap49.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray51 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap49.table = entryArray51;
        java.lang.Object obj53 = hashMap46.get((java.lang.Object) entryArray51);
        int int54 = hashMap46.size();
        boolean boolean55 = hashMap46.isEmpty();
        hashMap46.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray57 = hashMap46.table;
        hashMap44.table = entryArray57;
        hashMap33.table = entryArray57;
        hashMap5.table = entryArray57;
        hashMap1.table = entryArray57;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        int int4 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        java.lang.Object obj7 = hashMap5.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        java.lang.Object obj10 = hashMap5.put((java.lang.Object) 100, (java.lang.Object) hashMap9);
        java.lang.Object obj11 = hashMap0.remove(obj10);
        hashMap0.clear();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean15 = hashMap14.isEmpty();
        java.lang.Object obj16 = null;
        java.lang.Object obj17 = hashMap14.remove(obj16);
        hashMap14.clear();
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap(0);
        int int21 = hashMap20.size();
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap23.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray25 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap23.table = entryArray25;
        hashMap20.table = entryArray25;
        java.lang.Object obj28 = hashMap14.get((java.lang.Object) hashMap20);
        int int29 = hashMap20.modCount;
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean32 = hashMap31.isEmpty();
        system.classfixer.classes.HashMap hashMap34 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap34.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray36 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap34.table = entryArray36;
        java.lang.Object obj38 = hashMap31.get((java.lang.Object) entryArray36);
        int int39 = hashMap31.size();
        system.classfixer.classes.HashMap.Entry[] entryArray40 = hashMap31.table;
        hashMap20.table = entryArray40;
        hashMap0.table = entryArray40;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 1, (float) 100L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        int int4 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        java.lang.Object obj7 = hashMap5.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        java.lang.Object obj10 = hashMap5.put((java.lang.Object) 100, (java.lang.Object) hashMap9);
        java.lang.Object obj11 = hashMap0.remove(obj10);
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean14 = hashMap13.isEmpty();
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap16.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray18 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap16.table = entryArray18;
        java.lang.Object obj20 = hashMap13.get((java.lang.Object) entryArray18);
        int int21 = hashMap13.size();
        boolean boolean22 = hashMap13.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray23 = hashMap13.table;
        java.lang.Object obj25 = hashMap13.get((java.lang.Object) (short) 1);
        system.classfixer.classes.HashMap.Entry[] entryArray26 = hashMap13.table;
        hashMap0.table = entryArray26;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) ' ', (float) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) '#', (float) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) '#', (float) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(10, 10.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean2 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap4.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap4.table = entryArray6;
        java.lang.Object obj8 = hashMap1.get((java.lang.Object) entryArray6);
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap1.table;
        int int10 = hashMap1.modCount;
        int int11 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap(0);
        hashMap13.clear();
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap(0);
        java.lang.Object obj18 = hashMap13.put((java.lang.Object) 0, (java.lang.Object) "hi!");
        boolean boolean19 = hashMap13.repOK();
        int int20 = hashMap13.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap13.table;
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = hashMap1.put((java.lang.Object) hashMap13, obj22);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 100);
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean4 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean7 = hashMap6.isEmpty();
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = hashMap6.remove(obj8);
        hashMap6.clear();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        java.lang.Object obj13 = hashMap11.remove((java.lang.Object) 0.0f);
        int int14 = hashMap11.modCount;
        hashMap11.modCount = (byte) 100;
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap11.table;
        java.lang.Object obj18 = hashMap6.remove((java.lang.Object) entryArray17);
        java.lang.Object obj19 = hashMap3.get((java.lang.Object) entryArray17);
        hashMap1.table = entryArray17;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(10, (float) 100L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        hashMap0.clear();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray4 = hashMap3.table;
        hashMap0.table = entryArray4;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(0, (float) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(2, (float) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap0.put((java.lang.Object) 100, (java.lang.Object) hashMap4);
        boolean boolean6 = hashMap4.isEmpty();
        boolean boolean7 = hashMap4.isEmpty();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean10 = hashMap9.isEmpty();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap12.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray14 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap12.table = entryArray14;
        java.lang.Object obj16 = hashMap9.get((java.lang.Object) entryArray14);
        system.classfixer.classes.HashMap.Entry[] entryArray17 = hashMap9.table;
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        java.lang.Object obj23 = hashMap20.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj26 = hashMap20.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray27 = hashMap20.table;
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap();
        java.lang.Object obj31 = hashMap28.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj34 = hashMap28.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray35 = hashMap28.table;
        hashMap28.modCount = (short) 0;
        java.lang.Object obj38 = hashMap19.put((java.lang.Object) hashMap20, (java.lang.Object) hashMap28);
        hashMap19.modCount = ' ';
        java.lang.Object obj41 = hashMap4.put((java.lang.Object) entryArray17, (java.lang.Object) ' ');
        int int42 = hashMap4.size();
        system.classfixer.classes.HashMap hashMap44 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean45 = hashMap44.isEmpty();
        system.classfixer.classes.HashMap hashMap47 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap47.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray49 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap47.table = entryArray49;
        java.lang.Object obj51 = hashMap44.get((java.lang.Object) entryArray49);
        hashMap4.table = entryArray49;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap4", hashMap4.repOK_2());
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        hashMap0.modCount = (-1);
        java.lang.Object obj10 = hashMap0.remove((java.lang.Object) (short) 10);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        java.lang.Object obj14 = hashMap11.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        int int15 = hashMap11.size();
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean18 = hashMap17.isEmpty();
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap20.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray22 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap20.table = entryArray22;
        java.lang.Object obj24 = hashMap17.get((java.lang.Object) entryArray22);
        int int25 = hashMap17.size();
        boolean boolean26 = hashMap17.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray27 = hashMap17.table;
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean30 = hashMap29.isEmpty();
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap32.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray34 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap32.table = entryArray34;
        java.lang.Object obj36 = hashMap29.get((java.lang.Object) entryArray34);
        int int37 = hashMap29.size();
        boolean boolean38 = hashMap29.isEmpty();
        hashMap29.clear();
        int int40 = hashMap29.size();
        int int41 = hashMap29.modCount;
        system.classfixer.classes.HashMap hashMap43 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean44 = hashMap43.isEmpty();
        java.lang.Object obj45 = null;
        java.lang.Object obj46 = hashMap43.remove(obj45);
        hashMap43.clear();
        java.lang.Object obj48 = hashMap29.get((java.lang.Object) hashMap43);
        java.lang.Object obj49 = hashMap11.put((java.lang.Object) hashMap17, (java.lang.Object) hashMap29);
        system.classfixer.classes.HashMap.Entry[] entryArray50 = hashMap17.table;
        hashMap0.table = entryArray50;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean2 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap4.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap4.table = entryArray6;
        java.lang.Object obj8 = hashMap1.get((java.lang.Object) entryArray6);
        int int9 = hashMap1.size();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap1.table;
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        java.lang.Object obj14 = hashMap11.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        int int15 = hashMap11.size();
        java.lang.Object obj16 = null;
        java.lang.Object obj17 = hashMap11.get(obj16);
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap11.table;
        java.lang.Object obj19 = hashMap1.get((java.lang.Object) hashMap11);
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean22 = hashMap21.isEmpty();
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap24.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray26 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap24.table = entryArray26;
        java.lang.Object obj28 = hashMap21.get((java.lang.Object) entryArray26);
        int int29 = hashMap21.size();
        boolean boolean30 = hashMap21.isEmpty();
        hashMap21.clear();
        int int32 = hashMap21.size();
        int int33 = hashMap21.modCount;
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean36 = hashMap35.isEmpty();
        java.lang.Object obj37 = null;
        java.lang.Object obj38 = hashMap35.remove(obj37);
        hashMap35.clear();
        java.lang.Object obj40 = hashMap21.get((java.lang.Object) hashMap35);
        system.classfixer.classes.HashMap hashMap42 = new system.classfixer.classes.HashMap(0);
        int int43 = hashMap42.size();
        system.classfixer.classes.HashMap hashMap45 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap45.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray47 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap45.table = entryArray47;
        hashMap42.table = entryArray47;
        system.classfixer.classes.HashMap hashMap51 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean52 = hashMap51.isEmpty();
        system.classfixer.classes.HashMap hashMap54 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap54.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray56 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap54.table = entryArray56;
        java.lang.Object obj58 = hashMap51.get((java.lang.Object) entryArray56);
        int int59 = hashMap51.size();
        boolean boolean60 = hashMap51.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray61 = hashMap51.table;
        hashMap42.table = entryArray61;
        system.classfixer.classes.HashMap hashMap63 = new system.classfixer.classes.HashMap();
        java.lang.Object obj65 = hashMap63.remove((java.lang.Object) 0.0f);
        boolean boolean66 = hashMap63.isEmpty();
        java.lang.Object obj67 = hashMap21.put((java.lang.Object) hashMap42, (java.lang.Object) hashMap63);
        system.classfixer.classes.HashMap.Entry[] entryArray68 = hashMap21.table;
        hashMap11.table = entryArray68;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap11", hashMap11.repOK_2());
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 100, (float) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean2 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap4.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap4.table = entryArray6;
        java.lang.Object obj8 = hashMap1.get((java.lang.Object) entryArray6);
        int int9 = hashMap1.size();
        hashMap1.clear();
        boolean boolean11 = hashMap1.isEmpty();
        java.lang.Object obj12 = null;
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean15 = hashMap14.isEmpty();
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap17.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray19 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap17.table = entryArray19;
        java.lang.Object obj21 = hashMap14.get((java.lang.Object) entryArray19);
        int int22 = hashMap14.size();
        boolean boolean23 = hashMap14.isEmpty();
        hashMap14.clear();
        int int25 = hashMap14.size();
        int int26 = hashMap14.modCount;
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean29 = hashMap28.isEmpty();
        java.lang.Object obj30 = null;
        java.lang.Object obj31 = hashMap28.remove(obj30);
        hashMap28.clear();
        java.lang.Object obj33 = hashMap14.get((java.lang.Object) hashMap28);
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap(0);
        int int36 = hashMap35.size();
        system.classfixer.classes.HashMap hashMap38 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap38.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray40 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap38.table = entryArray40;
        hashMap35.table = entryArray40;
        system.classfixer.classes.HashMap hashMap44 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean45 = hashMap44.isEmpty();
        system.classfixer.classes.HashMap hashMap47 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap47.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray49 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap47.table = entryArray49;
        java.lang.Object obj51 = hashMap44.get((java.lang.Object) entryArray49);
        int int52 = hashMap44.size();
        boolean boolean53 = hashMap44.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray54 = hashMap44.table;
        hashMap35.table = entryArray54;
        system.classfixer.classes.HashMap hashMap56 = new system.classfixer.classes.HashMap();
        java.lang.Object obj58 = hashMap56.remove((java.lang.Object) 0.0f);
        boolean boolean59 = hashMap56.isEmpty();
        java.lang.Object obj60 = hashMap14.put((java.lang.Object) hashMap35, (java.lang.Object) hashMap56);
        system.classfixer.classes.HashMap.Entry[] entryArray61 = hashMap14.table;
        system.classfixer.classes.HashMap hashMap63 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean64 = hashMap63.isEmpty();
        system.classfixer.classes.HashMap hashMap66 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap66.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray68 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap66.table = entryArray68;
        java.lang.Object obj70 = hashMap63.get((java.lang.Object) entryArray68);
        int int71 = hashMap63.size();
        boolean boolean72 = hashMap63.isEmpty();
        hashMap63.clear();
        system.classfixer.classes.HashMap hashMap74 = new system.classfixer.classes.HashMap();
        java.lang.Object obj77 = hashMap74.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        int int78 = hashMap74.size();
        java.lang.Object obj79 = null;
        java.lang.Object obj80 = hashMap74.get(obj79);
        system.classfixer.classes.HashMap.Entry[] entryArray81 = hashMap74.table;
        hashMap63.table = entryArray81;
        hashMap14.table = entryArray81;
        java.lang.Object obj84 = hashMap1.put(obj12, (java.lang.Object) entryArray81);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        boolean boolean4 = hashMap0.repOK();
        hashMap0.clear();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean8 = hashMap7.isEmpty();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap10.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap10.table = entryArray12;
        java.lang.Object obj14 = hashMap7.get((java.lang.Object) entryArray12);
        int int15 = hashMap7.size();
        boolean boolean16 = hashMap7.isEmpty();
        hashMap7.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap7.table;
        hashMap0.table = entryArray18;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj5 = hashMap0.put((java.lang.Object) 100, (java.lang.Object) hashMap4);
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap(0);
        int int8 = hashMap7.size();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap10.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap10.table = entryArray12;
        hashMap7.table = entryArray12;
        hashMap4.table = entryArray12;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap4", hashMap4.repOK_2());
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(3, (float) 2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) '#', (float) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 1, (float) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) '4', (float) (short) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean2 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap4.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap4.table = entryArray6;
        java.lang.Object obj8 = hashMap1.get((java.lang.Object) entryArray6);
        int int9 = hashMap1.size();
        boolean boolean10 = hashMap1.isEmpty();
        int int11 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) 'a', (float) (short) 1);
        java.lang.Object obj15 = hashMap1.get((java.lang.Object) hashMap14);
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean18 = hashMap17.isEmpty();
        java.lang.Object obj19 = null;
        java.lang.Object obj20 = hashMap17.remove(obj19);
        hashMap17.clear();
        int int22 = hashMap17.modCount;
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap();
        java.lang.Object obj26 = hashMap23.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        boolean boolean27 = hashMap23.repOK();
        hashMap23.clear();
        int int29 = hashMap23.size();
        hashMap23.modCount = 0;
        hashMap23.modCount = (byte) 100;
        java.lang.Class<?> wildcardClass34 = hashMap23.getClass();
        java.lang.Object obj35 = hashMap14.put((java.lang.Object) int22, (java.lang.Object) wildcardClass34);
        system.classfixer.classes.HashMap hashMap36 = new system.classfixer.classes.HashMap();
        java.lang.Object obj38 = hashMap36.remove((java.lang.Object) 0.0f);
        int int39 = hashMap36.modCount;
        hashMap36.modCount = (byte) 100;
        system.classfixer.classes.HashMap.Entry[] entryArray42 = hashMap36.table;
        hashMap14.table = entryArray42;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap14", hashMap14.repOK_2());
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        boolean boolean4 = hashMap0.repOK();
        hashMap0.clear();
        boolean boolean6 = hashMap0.repOK();
        int int7 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        java.lang.Object obj10 = hashMap8.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        java.lang.Object obj13 = hashMap8.put((java.lang.Object) 100, (java.lang.Object) hashMap12);
        boolean boolean14 = hashMap12.isEmpty();
        boolean boolean15 = hashMap12.isEmpty();
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap17.table;
        int int19 = hashMap17.size();
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap((int) (byte) 1);
        system.classfixer.classes.HashMap.Entry[] entryArray22 = hashMap21.table;
        hashMap17.table = entryArray22;
        java.lang.Object obj24 = hashMap0.put((java.lang.Object) hashMap12, (java.lang.Object) hashMap17);
        int int25 = hashMap17.size();
        int int26 = hashMap17.modCount;
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap();
        java.lang.Object obj29 = hashMap27.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap();
        java.lang.Object obj32 = hashMap27.put((java.lang.Object) 100, (java.lang.Object) hashMap31);
        system.classfixer.classes.HashMap hashMap34 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean35 = hashMap34.isEmpty();
        system.classfixer.classes.HashMap hashMap37 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap37.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray39 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap37.table = entryArray39;
        java.lang.Object obj41 = hashMap34.get((java.lang.Object) entryArray39);
        int int42 = hashMap34.size();
        boolean boolean43 = hashMap34.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray44 = hashMap34.table;
        int int45 = hashMap34.modCount;
        java.lang.Object obj47 = hashMap34.remove((java.lang.Object) (byte) 1);
        hashMap34.modCount = 0;
        java.lang.Object obj50 = hashMap17.put(obj32, (java.lang.Object) hashMap34);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap17", hashMap17.repOK_2());
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        boolean boolean4 = hashMap0.repOK();
        hashMap0.clear();
        boolean boolean6 = hashMap0.repOK();
        int int7 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean10 = hashMap9.isEmpty();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean13 = hashMap12.isEmpty();
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = hashMap12.remove(obj14);
        hashMap12.clear();
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        java.lang.Object obj19 = hashMap17.remove((java.lang.Object) 0.0f);
        int int20 = hashMap17.modCount;
        hashMap17.modCount = (byte) 100;
        system.classfixer.classes.HashMap.Entry[] entryArray23 = hashMap17.table;
        java.lang.Object obj24 = hashMap12.remove((java.lang.Object) entryArray23);
        java.lang.Object obj25 = hashMap9.get((java.lang.Object) entryArray23);
        hashMap0.table = entryArray23;
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean29 = hashMap28.isEmpty();
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap31.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray33 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap31.table = entryArray33;
        java.lang.Object obj35 = hashMap28.get((java.lang.Object) entryArray33);
        int int36 = hashMap28.size();
        hashMap28.clear();
        system.classfixer.classes.HashMap hashMap39 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray40 = hashMap39.table;
        hashMap28.table = entryArray40;
        hashMap0.table = entryArray40;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(100, (float) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        boolean boolean4 = hashMap0.repOK();
        hashMap0.clear();
        int int6 = hashMap0.size();
        boolean boolean7 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean10 = hashMap9.isEmpty();
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = hashMap9.remove(obj11);
        hashMap9.clear();
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap(0);
        int int16 = hashMap15.size();
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap18.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray20 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap18.table = entryArray20;
        hashMap15.table = entryArray20;
        java.lang.Object obj23 = hashMap9.get((java.lang.Object) hashMap15);
        int int24 = hashMap15.modCount;
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean29 = hashMap28.isEmpty();
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap31.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray33 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap31.table = entryArray33;
        java.lang.Object obj35 = hashMap28.get((java.lang.Object) entryArray33);
        int int36 = hashMap28.size();
        boolean boolean37 = hashMap28.isEmpty();
        hashMap28.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray39 = hashMap28.table;
        hashMap26.table = entryArray39;
        hashMap15.table = entryArray39;
        hashMap0.table = entryArray39;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        boolean boolean4 = hashMap0.repOK();
        hashMap0.clear();
        boolean boolean6 = hashMap0.repOK();
        int int7 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        java.lang.Object obj10 = hashMap8.remove((java.lang.Object) 0.0f);
        int int11 = hashMap8.modCount;
        hashMap8.modCount = (byte) 100;
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap8.table;
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        java.lang.Object obj20 = hashMap17.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        int int21 = hashMap17.size();
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = hashMap17.get(obj22);
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap17.table;
        java.lang.Object obj25 = hashMap8.put(obj15, (java.lang.Object) hashMap17);
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap((int) (short) 1, (float) 1L);
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap((int) (byte) 1);
        system.classfixer.classes.HashMap.Entry[] entryArray31 = hashMap30.table;
        java.lang.Object obj32 = hashMap8.put((java.lang.Object) (short) 1, (java.lang.Object) entryArray31);
        hashMap0.table = entryArray31;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(3, (float) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(2, (float) 2);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        int int2 = hashMap1.size();
        boolean boolean3 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        java.lang.Object obj7 = hashMap4.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        boolean boolean8 = hashMap4.repOK();
        hashMap4.clear();
        boolean boolean10 = hashMap4.repOK();
        java.lang.Object obj11 = hashMap1.get((java.lang.Object) boolean10);
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap1.table;
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean15 = hashMap14.isEmpty();
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap17.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray19 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap17.table = entryArray19;
        java.lang.Object obj21 = hashMap14.get((java.lang.Object) entryArray19);
        int int22 = hashMap14.size();
        boolean boolean23 = hashMap14.isEmpty();
        hashMap14.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray25 = hashMap14.table;
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap();
        java.lang.Object obj29 = hashMap26.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj31 = hashMap26.remove((java.lang.Object) 1L);
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean34 = hashMap33.isEmpty();
        system.classfixer.classes.HashMap hashMap36 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap36.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray38 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap36.table = entryArray38;
        java.lang.Object obj40 = hashMap33.get((java.lang.Object) entryArray38);
        java.lang.Object obj41 = hashMap26.remove((java.lang.Object) hashMap33);
        system.classfixer.classes.HashMap.Entry[] entryArray42 = hashMap33.table;
        system.classfixer.classes.HashMap.Entry[] entryArray43 = hashMap33.table;
        hashMap14.table = entryArray43;
        hashMap1.table = entryArray43;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        java.lang.Object obj10 = hashMap8.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        java.lang.Object obj13 = hashMap8.put((java.lang.Object) 100, (java.lang.Object) hashMap12);
        boolean boolean14 = hashMap12.isEmpty();
        java.lang.Object obj15 = hashMap0.get((java.lang.Object) hashMap12);
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap(0);
        hashMap17.clear();
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap(0);
        java.lang.Object obj22 = hashMap17.put((java.lang.Object) 0, (java.lang.Object) "hi!");
        boolean boolean23 = hashMap17.repOK();
        java.lang.Object obj24 = hashMap12.remove((java.lang.Object) hashMap17);
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean27 = hashMap26.isEmpty();
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap29.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray31 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap29.table = entryArray31;
        java.lang.Object obj33 = hashMap26.get((java.lang.Object) entryArray31);
        system.classfixer.classes.HashMap.Entry[] entryArray34 = hashMap26.table;
        int int35 = hashMap26.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray36 = hashMap26.table;
        hashMap12.table = entryArray36;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap12", hashMap12.repOK_2());
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        int int4 = hashMap0.size();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        java.lang.Object obj7 = hashMap5.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        java.lang.Object obj10 = hashMap5.put((java.lang.Object) 100, (java.lang.Object) hashMap9);
        java.lang.Object obj11 = hashMap0.remove(obj10);
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean14 = hashMap13.isEmpty();
        java.lang.Object obj15 = null;
        java.lang.Object obj16 = hashMap13.remove(obj15);
        hashMap13.clear();
        boolean boolean18 = hashMap13.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap13.table;
        hashMap13.modCount = 10;
        system.classfixer.classes.HashMap.Entry[] entryArray22 = hashMap13.table;
        system.classfixer.classes.HashMap.Entry[] entryArray23 = hashMap13.table;
        hashMap0.table = entryArray23;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 100);
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap1.table;
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean5 = hashMap4.isEmpty();
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = hashMap4.remove(obj6);
        hashMap4.clear();
        boolean boolean9 = hashMap4.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray10 = hashMap4.table;
        hashMap1.table = entryArray10;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean2 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap4.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap4.table = entryArray6;
        java.lang.Object obj8 = hashMap1.get((java.lang.Object) entryArray6);
        int int9 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        java.lang.Object obj12 = hashMap10.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        java.lang.Object obj15 = hashMap10.put((java.lang.Object) 100, (java.lang.Object) hashMap14);
        int int16 = hashMap14.size();
        java.lang.Class<?> wildcardClass17 = hashMap14.getClass();
        java.lang.Object obj18 = hashMap1.remove((java.lang.Object) wildcardClass17);
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean21 = hashMap20.isEmpty();
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = hashMap20.remove(obj22);
        hashMap20.clear();
        boolean boolean25 = hashMap20.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray26 = hashMap20.table;
        java.lang.Object obj27 = hashMap1.get((java.lang.Object) hashMap20);
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap();
        hashMap28.clear();
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap();
        java.lang.Object obj33 = hashMap30.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        int int34 = hashMap30.size();
        system.classfixer.classes.HashMap hashMap36 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean37 = hashMap36.isEmpty();
        system.classfixer.classes.HashMap hashMap39 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap39.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray41 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap39.table = entryArray41;
        java.lang.Object obj43 = hashMap36.get((java.lang.Object) entryArray41);
        int int44 = hashMap36.size();
        boolean boolean45 = hashMap36.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray46 = hashMap36.table;
        system.classfixer.classes.HashMap hashMap48 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean49 = hashMap48.isEmpty();
        system.classfixer.classes.HashMap hashMap51 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap51.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray53 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap51.table = entryArray53;
        java.lang.Object obj55 = hashMap48.get((java.lang.Object) entryArray53);
        int int56 = hashMap48.size();
        boolean boolean57 = hashMap48.isEmpty();
        hashMap48.clear();
        int int59 = hashMap48.size();
        int int60 = hashMap48.modCount;
        system.classfixer.classes.HashMap hashMap62 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean63 = hashMap62.isEmpty();
        java.lang.Object obj64 = null;
        java.lang.Object obj65 = hashMap62.remove(obj64);
        hashMap62.clear();
        java.lang.Object obj67 = hashMap48.get((java.lang.Object) hashMap62);
        java.lang.Object obj68 = hashMap30.put((java.lang.Object) hashMap36, (java.lang.Object) hashMap48);
        java.lang.Object obj69 = hashMap28.remove((java.lang.Object) hashMap36);
        system.classfixer.classes.HashMap hashMap70 = new system.classfixer.classes.HashMap();
        java.lang.Object obj73 = hashMap70.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj74 = hashMap20.put((java.lang.Object) hashMap36, (java.lang.Object) (byte) 100);
        hashMap20.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray76 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap20.table = entryArray76;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap20", hashMap20.repOK_2());
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) "", (java.lang.Object) (byte) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray7 = hashMap0.table;
        int int8 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap10.table;
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap10.table;
        hashMap0.table = entryArray12;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) 'a');
        int int2 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        java.lang.Object obj6 = hashMap3.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj8 = hashMap3.remove((java.lang.Object) 1L);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean11 = hashMap10.isEmpty();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap13.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray15 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap13.table = entryArray15;
        java.lang.Object obj17 = hashMap10.get((java.lang.Object) entryArray15);
        java.lang.Object obj18 = hashMap3.remove((java.lang.Object) hashMap10);
        java.lang.Object obj19 = hashMap1.remove((java.lang.Object) hashMap10);
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean22 = hashMap21.isEmpty();
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap24.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray26 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap24.table = entryArray26;
        java.lang.Object obj28 = hashMap21.get((java.lang.Object) entryArray26);
        int int29 = hashMap21.size();
        boolean boolean30 = hashMap21.isEmpty();
        hashMap21.clear();
        hashMap21.modCount = 0;
        java.lang.Object obj34 = hashMap1.remove((java.lang.Object) hashMap21);
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap();
        java.lang.Object obj38 = hashMap35.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        boolean boolean39 = hashMap35.repOK();
        hashMap35.clear();
        boolean boolean41 = hashMap35.repOK();
        int int42 = hashMap35.size();
        int int43 = hashMap35.modCount;
        hashMap35.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray45 = hashMap35.table;
        hashMap1.table = entryArray45;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(100, (float) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(0);
        hashMap1.clear();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap(0);
        java.lang.Object obj6 = hashMap1.put((java.lang.Object) 0, (java.lang.Object) "hi!");
        boolean boolean7 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.repOK();
        hashMap8.modCount = (byte) 10;
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean14 = hashMap13.isEmpty();
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap16.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray18 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap16.table = entryArray18;
        java.lang.Object obj20 = hashMap13.get((java.lang.Object) entryArray18);
        int int21 = hashMap13.size();
        hashMap13.clear();
        boolean boolean23 = hashMap13.repOK();
        boolean boolean24 = hashMap13.repOK();
        java.lang.Object obj25 = hashMap1.put((java.lang.Object) (byte) 10, (java.lang.Object) boolean24);
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean28 = hashMap27.isEmpty();
        java.lang.Object obj29 = null;
        java.lang.Object obj30 = hashMap27.remove(obj29);
        int int31 = hashMap27.size();
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean34 = hashMap33.isEmpty();
        system.classfixer.classes.HashMap hashMap36 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap36.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray38 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap36.table = entryArray38;
        java.lang.Object obj40 = hashMap33.get((java.lang.Object) entryArray38);
        int int41 = hashMap33.size();
        boolean boolean42 = hashMap33.isEmpty();
        hashMap33.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray44 = hashMap33.table;
        hashMap27.table = entryArray44;
        hashMap1.table = entryArray44;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (short) 1, (float) 100L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test71");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(10, (float) (byte) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test72");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(0, (float) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test73");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean2 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap4.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap4.table = entryArray6;
        java.lang.Object obj8 = hashMap1.get((java.lang.Object) entryArray6);
        int int9 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        java.lang.Object obj12 = hashMap10.remove((java.lang.Object) 0.0f);
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        java.lang.Object obj15 = hashMap10.put((java.lang.Object) 100, (java.lang.Object) hashMap14);
        int int16 = hashMap14.size();
        java.lang.Class<?> wildcardClass17 = hashMap14.getClass();
        java.lang.Object obj18 = hashMap1.remove((java.lang.Object) wildcardClass17);
        java.lang.Object obj19 = null;
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        java.lang.Object obj23 = hashMap20.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        boolean boolean24 = hashMap20.repOK();
        hashMap20.clear();
        int int26 = hashMap20.modCount;
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap();
        java.lang.Object obj29 = hashMap27.remove((java.lang.Object) 0.0f);
        int int30 = hashMap27.modCount;
        int int31 = hashMap27.modCount;
        java.lang.Object obj32 = hashMap20.get((java.lang.Object) hashMap27);
        java.lang.Object obj33 = hashMap1.put(obj19, obj32);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test74");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        hashMap0.clear();
        int int2 = hashMap0.size();
        boolean boolean3 = hashMap0.repOK();
        boolean boolean4 = hashMap0.repOK();
        boolean boolean5 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean8 = hashMap7.isEmpty();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap10.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap10.table = entryArray12;
        java.lang.Object obj14 = hashMap7.get((java.lang.Object) entryArray12);
        int int15 = hashMap7.size();
        hashMap7.clear();
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap18.table;
        hashMap7.table = entryArray19;
        hashMap0.table = entryArray19;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test75");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj3 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        boolean boolean4 = hashMap0.repOK();
        hashMap0.clear();
        int int6 = hashMap0.modCount;
        boolean boolean7 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.repOK();
        hashMap8.modCount = (byte) 10;
        java.lang.Object obj13 = hashMap8.get((java.lang.Object) (byte) 0);
        boolean boolean14 = hashMap8.isEmpty();
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap((int) 'a');
        int int17 = hashMap16.size();
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        java.lang.Object obj21 = hashMap18.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        java.lang.Object obj23 = hashMap18.remove((java.lang.Object) 1L);
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean26 = hashMap25.isEmpty();
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap28.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray30 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap28.table = entryArray30;
        java.lang.Object obj32 = hashMap25.get((java.lang.Object) entryArray30);
        java.lang.Object obj33 = hashMap18.remove((java.lang.Object) hashMap25);
        java.lang.Object obj34 = hashMap16.remove((java.lang.Object) hashMap25);
        hashMap25.clear();
        hashMap25.modCount = 10;
        java.lang.Object obj38 = hashMap8.remove((java.lang.Object) hashMap25);
        system.classfixer.classes.HashMap hashMap39 = new system.classfixer.classes.HashMap();
        java.lang.Object obj42 = hashMap39.put((java.lang.Object) (short) 100, (java.lang.Object) (byte) 100);
        int int43 = hashMap39.size();
        system.classfixer.classes.HashMap hashMap45 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean46 = hashMap45.isEmpty();
        system.classfixer.classes.HashMap hashMap48 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap48.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray50 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap48.table = entryArray50;
        java.lang.Object obj52 = hashMap45.get((java.lang.Object) entryArray50);
        int int53 = hashMap45.size();
        boolean boolean54 = hashMap45.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray55 = hashMap45.table;
        system.classfixer.classes.HashMap hashMap57 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean58 = hashMap57.isEmpty();
        system.classfixer.classes.HashMap hashMap60 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap60.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray62 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap60.table = entryArray62;
        java.lang.Object obj64 = hashMap57.get((java.lang.Object) entryArray62);
        int int65 = hashMap57.size();
        boolean boolean66 = hashMap57.isEmpty();
        hashMap57.clear();
        int int68 = hashMap57.size();
        int int69 = hashMap57.modCount;
        system.classfixer.classes.HashMap hashMap71 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean72 = hashMap71.isEmpty();
        java.lang.Object obj73 = null;
        java.lang.Object obj74 = hashMap71.remove(obj73);
        hashMap71.clear();
        java.lang.Object obj76 = hashMap57.get((java.lang.Object) hashMap71);
        java.lang.Object obj77 = hashMap39.put((java.lang.Object) hashMap45, (java.lang.Object) hashMap57);
        int int78 = hashMap45.size();
        java.lang.Object obj79 = hashMap0.put(obj38, (java.lang.Object) int78);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test76");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(102, (float) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test77");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(2, (float) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test78");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(0, (float) 100L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test79");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        java.lang.Object obj2 = hashMap0.remove((java.lang.Object) 0.0f);
        int int3 = hashMap0.modCount;
        int int4 = hashMap0.modCount;
        hashMap0.modCount = (short) 1;
        hashMap0.modCount = ' ';
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap(0);
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap10.table;
        int int12 = hashMap10.size();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) (byte) 1);
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap14.table;
        hashMap10.table = entryArray15;
        boolean boolean17 = hashMap10.repOK();
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap(0);
        hashMap19.clear();
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap(0);
        java.lang.Object obj24 = hashMap19.put((java.lang.Object) 0, (java.lang.Object) "hi!");
        system.classfixer.classes.HashMap.Entry[] entryArray25 = hashMap19.table;
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap((int) (byte) 0);
        boolean boolean28 = hashMap27.isEmpty();
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap30.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray32 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap30.table = entryArray32;
        java.lang.Object obj34 = hashMap27.get((java.lang.Object) entryArray32);
        system.classfixer.classes.HashMap.Entry[] entryArray35 = hashMap27.table;
        int int36 = hashMap27.modCount;
        java.lang.Object obj37 = hashMap19.remove((java.lang.Object) hashMap27);
        java.lang.Object obj38 = hashMap0.put((java.lang.Object) hashMap10, obj37);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }
}

