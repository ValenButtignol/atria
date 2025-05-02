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
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] {};
        hashMap0.table = entryArray2;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap0", hashMap0.property_2());
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        int int3 = hashMap2.modCount;
        int int4 = hashMap2.modCount;
        hashMap2.clear();
        hashMap2.clear();
        system.testclass.HashMap.Entry[] entryArray7 = hashMap2.table;
        system.testclass.HashMap.Entry[] entryArray8 = hashMap2.table;
        hashMap1.table = entryArray8;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap1", hashMap1.property_2());
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '#', (float) 'a');
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        system.testclass.HashMap.Entry[] entryArray6 = hashMap3.table;
        system.testclass.HashMap.Entry[] entryArray7 = hashMap3.table;
        hashMap2.table = entryArray7;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        hashMap0.clear();
        int int5 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray6 = new system.testclass.HashMap.Entry[] {};
        hashMap0.table = entryArray6;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap0", hashMap0.property_2());
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        hashMap2.modCount = 'a';
        java.lang.Object obj6 = hashMap2.get((java.lang.Object) '#');
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        int int9 = hashMap7.modCount;
        system.testclass.HashMap.Entry[] entryArray10 = hashMap7.table;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        int int13 = hashMap11.modCount;
        hashMap11.clear();
        hashMap11.clear();
        system.testclass.HashMap.Entry[] entryArray16 = hashMap11.table;
        hashMap7.table = entryArray16;
        hashMap2.table = entryArray16;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap.Entry[] entryArray3 = hashMap2.table;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) '4', (float) 10L);
        java.lang.Object obj8 = hashMap6.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) (byte) 0);
        java.lang.Class<?> wildcardClass11 = hashMap10.getClass();
        java.lang.Object obj12 = hashMap6.get((java.lang.Object) hashMap10);
        int int13 = hashMap6.size();
        java.lang.Object obj15 = hashMap6.get((java.lang.Object) true);
        system.testclass.HashMap.Entry[] entryArray16 = hashMap6.table;
        hashMap2.table = entryArray16;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        system.testclass.HashMap.Entry[] entryArray4 = hashMap0.table;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int8 = hashMap7.modCount;
        system.testclass.HashMap.Entry[] entryArray9 = hashMap7.table;
        hashMap0.table = entryArray9;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap0", hashMap0.property_2());
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        int int2 = hashMap1.modCount;
        java.lang.Object obj4 = hashMap1.remove((java.lang.Object) (byte) 100);
        int int5 = hashMap1.size();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.modCount;
        int int10 = hashMap8.modCount;
        system.testclass.HashMap.Entry[] entryArray11 = hashMap8.table;
        java.lang.Object obj12 = hashMap7.remove((java.lang.Object) entryArray11);
        hashMap1.table = entryArray11;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap1", hashMap1.property_2());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) '4');
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        boolean boolean3 = hashMap2.isEmpty();
        boolean boolean4 = hashMap2.isEmpty();
        boolean boolean5 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.modCount;
        int int8 = hashMap6.modCount;
        system.testclass.HashMap.Entry[] entryArray9 = hashMap6.table;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.modCount;
        int int12 = hashMap10.modCount;
        hashMap10.clear();
        hashMap10.clear();
        system.testclass.HashMap.Entry[] entryArray15 = hashMap10.table;
        hashMap6.table = entryArray15;
        hashMap2.table = entryArray15;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        int int19 = hashMap18.modCount;
        int int20 = hashMap18.modCount;
        hashMap18.clear();
        hashMap18.clear();
        system.testclass.HashMap.Entry[] entryArray23 = hashMap18.table;
        system.testclass.HashMap.Entry[] entryArray24 = hashMap18.table;
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        int int28 = hashMap27.modCount;
        int int29 = hashMap27.modCount;
        system.testclass.HashMap.Entry[] entryArray30 = hashMap27.table;
        java.lang.Object obj31 = hashMap26.remove((java.lang.Object) entryArray30);
        hashMap18.table = entryArray30;
        java.lang.Object obj33 = hashMap2.remove((java.lang.Object) hashMap18);
        java.lang.Object obj34 = hashMap1.remove((java.lang.Object) hashMap18);
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int38 = hashMap37.modCount;
        system.testclass.HashMap.Entry[] entryArray39 = hashMap37.table;
        hashMap18.table = entryArray39;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap18", hashMap18.property_2());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        system.testclass.HashMap.Entry[] entryArray2 = hashMap1.table;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        hashMap3.clear();
        hashMap3.clear();
        system.testclass.HashMap.Entry[] entryArray8 = hashMap3.table;
        hashMap3.clear();
        hashMap3.modCount = 0;
        java.lang.Object obj13 = hashMap3.remove((java.lang.Object) 100.0f);
        java.lang.Object obj14 = hashMap1.remove(obj13);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        boolean boolean18 = hashMap17.isEmpty();
        hashMap17.modCount = ' ';
        java.lang.Object obj21 = hashMap16.get((java.lang.Object) hashMap17);
        java.lang.Object obj23 = hashMap16.get((java.lang.Object) false);
        system.testclass.HashMap.Entry[] entryArray24 = hashMap16.table;
        hashMap1.table = entryArray24;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap1", hashMap1.property_2());
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        system.testclass.HashMap.Entry[] entryArray7 = hashMap4.table;
        hashMap4.clear();
        java.lang.Class<?> wildcardClass9 = hashMap4.getClass();
        java.lang.Object obj10 = hashMap3.remove((java.lang.Object) wildcardClass9);
        boolean boolean11 = hashMap3.isEmpty();
        java.lang.Object obj12 = hashMap0.get((java.lang.Object) hashMap3);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap((int) (short) 10);
        int int15 = hashMap14.size();
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int19 = hashMap18.size();
        boolean boolean20 = hashMap18.isEmpty();
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap(0);
        java.lang.Object obj23 = hashMap14.put((java.lang.Object) boolean20, (java.lang.Object) hashMap22);
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.modCount;
        int int26 = hashMap24.modCount;
        hashMap24.clear();
        hashMap24.clear();
        system.testclass.HashMap.Entry[] entryArray29 = hashMap24.table;
        system.testclass.HashMap.Entry[] entryArray30 = hashMap24.table;
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        boolean boolean34 = hashMap33.isEmpty();
        hashMap33.modCount = ' ';
        java.lang.Object obj37 = hashMap32.get((java.lang.Object) hashMap33);
        int int38 = hashMap32.modCount;
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        int int40 = hashMap39.modCount;
        int int41 = hashMap39.modCount;
        hashMap39.clear();
        hashMap39.clear();
        system.testclass.HashMap.Entry[] entryArray44 = hashMap39.table;
        boolean boolean45 = hashMap39.isEmpty();
        java.lang.Object obj47 = hashMap32.put((java.lang.Object) boolean45, (java.lang.Object) (-1L));
        system.testclass.HashMap hashMap49 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap hashMap50 = new system.testclass.HashMap();
        boolean boolean51 = hashMap50.isEmpty();
        hashMap50.modCount = ' ';
        java.lang.Object obj54 = hashMap49.get((java.lang.Object) hashMap50);
        system.testclass.HashMap hashMap55 = new system.testclass.HashMap();
        int int56 = hashMap55.modCount;
        int int57 = hashMap55.modCount;
        system.testclass.HashMap.Entry[] entryArray58 = hashMap55.table;
        system.testclass.HashMap hashMap59 = new system.testclass.HashMap();
        int int60 = hashMap59.modCount;
        int int61 = hashMap59.modCount;
        hashMap59.clear();
        hashMap59.clear();
        system.testclass.HashMap.Entry[] entryArray64 = hashMap59.table;
        hashMap55.table = entryArray64;
        hashMap49.table = entryArray64;
        hashMap32.table = entryArray64;
        hashMap24.table = entryArray64;
        hashMap14.table = entryArray64;
        hashMap3.table = entryArray64;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap3", hashMap3.property_2());
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        int int3 = hashMap0.size();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap(0);
        int int6 = hashMap5.modCount;
        system.testclass.HashMap.Entry[] entryArray7 = hashMap5.table;
        hashMap0.table = entryArray7;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap0", hashMap0.property_2());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        int int2 = hashMap1.modCount;
        java.lang.Object obj4 = hashMap1.remove((java.lang.Object) (byte) 100);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        hashMap5.clear();
        hashMap5.clear();
        java.lang.Object obj10 = hashMap1.get((java.lang.Object) hashMap5);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap(10, (float) 100);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = hashMap13.get(obj14);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        int int17 = hashMap16.modCount;
        int int18 = hashMap16.modCount;
        system.testclass.HashMap.Entry[] entryArray19 = hashMap16.table;
        hashMap13.table = entryArray19;
        hashMap1.table = entryArray19;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap1", hashMap1.property_2());
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '#', (float) (short) 1);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap(0, (float) (short) 1);
        system.testclass.HashMap.Entry[] entryArray6 = hashMap5.table;
        hashMap2.table = entryArray6;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        java.lang.Object obj4 = hashMap2.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) (byte) 0);
        java.lang.Class<?> wildcardClass7 = hashMap6.getClass();
        java.lang.Object obj8 = hashMap2.get((java.lang.Object) hashMap6);
        int int9 = hashMap2.size();
        java.lang.Object obj11 = hashMap2.get((java.lang.Object) true);
        int int12 = hashMap2.modCount;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        hashMap13.clear();
        hashMap13.clear();
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        boolean boolean19 = hashMap18.isEmpty();
        boolean boolean20 = hashMap18.isEmpty();
        boolean boolean21 = hashMap18.isEmpty();
        java.lang.Object obj23 = hashMap18.get((java.lang.Object) '#');
        int int24 = hashMap18.modCount;
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap((int) '4', (float) 10L);
        java.lang.Object obj29 = hashMap27.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap((int) (byte) 0);
        java.lang.Class<?> wildcardClass32 = hashMap31.getClass();
        java.lang.Object obj33 = hashMap27.get((java.lang.Object) hashMap31);
        int int34 = hashMap27.size();
        java.lang.Object obj36 = hashMap27.get((java.lang.Object) true);
        java.lang.Object obj37 = hashMap18.get((java.lang.Object) hashMap27);
        java.lang.Object obj38 = hashMap13.get((java.lang.Object) hashMap27);
        system.testclass.HashMap.Entry[] entryArray39 = hashMap13.table;
        hashMap2.table = entryArray39;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        hashMap0.clear();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        hashMap7.modCount = ' ';
        java.lang.Object obj11 = hashMap6.get((java.lang.Object) hashMap7);
        int int12 = hashMap6.modCount;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap.Entry[] entryArray16 = hashMap15.table;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        hashMap17.modCount = 0;
        java.lang.Object obj20 = hashMap6.put((java.lang.Object) entryArray16, (java.lang.Object) hashMap17);
        hashMap0.table = entryArray16;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap0", hashMap0.property_2());
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        java.lang.Object obj4 = hashMap2.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) (byte) 0);
        java.lang.Class<?> wildcardClass7 = hashMap6.getClass();
        java.lang.Object obj8 = hashMap2.get((java.lang.Object) hashMap6);
        java.lang.Object obj10 = hashMap2.remove((java.lang.Object) 100.0d);
        hashMap2.modCount = '4';
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        int int16 = hashMap13.size();
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        hashMap18.modCount = 0;
        java.lang.Object obj21 = hashMap13.put((java.lang.Object) '#', (java.lang.Object) 0);
        system.testclass.HashMap.Entry[] entryArray22 = hashMap13.table;
        hashMap2.table = entryArray22;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) ' ', (float) 100L);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) '#', (float) 'a');
        boolean boolean6 = hashMap5.isEmpty();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        int int9 = hashMap7.modCount;
        hashMap7.clear();
        hashMap7.clear();
        system.testclass.HashMap.Entry[] entryArray12 = hashMap7.table;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        boolean boolean16 = hashMap15.isEmpty();
        hashMap15.modCount = ' ';
        java.lang.Object obj19 = hashMap14.get((java.lang.Object) hashMap15);
        int int20 = hashMap14.modCount;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        int int22 = hashMap21.modCount;
        int int23 = hashMap21.modCount;
        hashMap21.clear();
        hashMap21.clear();
        system.testclass.HashMap.Entry[] entryArray26 = hashMap21.table;
        boolean boolean27 = hashMap21.isEmpty();
        java.lang.Object obj29 = hashMap14.put((java.lang.Object) boolean27, (java.lang.Object) (-1L));
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        boolean boolean33 = hashMap32.isEmpty();
        hashMap32.modCount = ' ';
        java.lang.Object obj36 = hashMap31.get((java.lang.Object) hashMap32);
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        int int38 = hashMap37.modCount;
        int int39 = hashMap37.modCount;
        system.testclass.HashMap.Entry[] entryArray40 = hashMap37.table;
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        int int42 = hashMap41.modCount;
        int int43 = hashMap41.modCount;
        hashMap41.clear();
        hashMap41.clear();
        system.testclass.HashMap.Entry[] entryArray46 = hashMap41.table;
        hashMap37.table = entryArray46;
        hashMap31.table = entryArray46;
        hashMap14.table = entryArray46;
        hashMap7.table = entryArray46;
        java.lang.Object obj51 = hashMap5.remove((java.lang.Object) entryArray46);
        hashMap2.table = entryArray46;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        java.lang.Object obj4 = hashMap2.remove((java.lang.Object) 10.0f);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) '#', (float) 'a');
        hashMap7.clear();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        boolean boolean11 = hashMap9.isEmpty();
        boolean boolean12 = hashMap9.isEmpty();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        hashMap13.clear();
        hashMap13.clear();
        system.testclass.HashMap.Entry[] entryArray18 = hashMap13.table;
        system.testclass.HashMap.Entry[] entryArray19 = hashMap13.table;
        hashMap9.table = entryArray19;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        int int22 = hashMap21.modCount;
        int int23 = hashMap21.modCount;
        hashMap21.clear();
        hashMap21.clear();
        system.testclass.HashMap.Entry[] entryArray26 = hashMap21.table;
        system.testclass.HashMap.Entry[] entryArray27 = hashMap21.table;
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        boolean boolean31 = hashMap30.isEmpty();
        hashMap30.modCount = ' ';
        java.lang.Object obj34 = hashMap29.get((java.lang.Object) hashMap30);
        int int35 = hashMap29.modCount;
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        int int37 = hashMap36.modCount;
        int int38 = hashMap36.modCount;
        hashMap36.clear();
        hashMap36.clear();
        system.testclass.HashMap.Entry[] entryArray41 = hashMap36.table;
        boolean boolean42 = hashMap36.isEmpty();
        java.lang.Object obj44 = hashMap29.put((java.lang.Object) boolean42, (java.lang.Object) (-1L));
        system.testclass.HashMap hashMap46 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap();
        boolean boolean48 = hashMap47.isEmpty();
        hashMap47.modCount = ' ';
        java.lang.Object obj51 = hashMap46.get((java.lang.Object) hashMap47);
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap();
        int int53 = hashMap52.modCount;
        int int54 = hashMap52.modCount;
        system.testclass.HashMap.Entry[] entryArray55 = hashMap52.table;
        system.testclass.HashMap hashMap56 = new system.testclass.HashMap();
        int int57 = hashMap56.modCount;
        int int58 = hashMap56.modCount;
        hashMap56.clear();
        hashMap56.clear();
        system.testclass.HashMap.Entry[] entryArray61 = hashMap56.table;
        hashMap52.table = entryArray61;
        hashMap46.table = entryArray61;
        hashMap29.table = entryArray61;
        hashMap21.table = entryArray61;
        java.lang.Object obj66 = hashMap7.put((java.lang.Object) entryArray19, (java.lang.Object) entryArray61);
        hashMap2.table = entryArray19;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        int int3 = hashMap2.modCount;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap(0);
        int int6 = hashMap5.modCount;
        java.lang.Object obj8 = hashMap5.remove((java.lang.Object) (byte) 100);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        int int11 = hashMap9.modCount;
        hashMap9.clear();
        hashMap9.clear();
        system.testclass.HashMap.Entry[] entryArray14 = hashMap9.table;
        hashMap9.clear();
        hashMap9.modCount = 0;
        java.lang.Object obj19 = hashMap9.remove((java.lang.Object) 100.0f);
        java.lang.Object obj20 = hashMap5.remove((java.lang.Object) 100.0f);
        java.lang.Object obj21 = hashMap2.remove((java.lang.Object) 100.0f);
        boolean boolean22 = hashMap2.isEmpty();
        int int23 = hashMap2.modCount;
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap((int) ' ');
        system.testclass.HashMap.Entry[] entryArray26 = hashMap25.table;
        hashMap2.table = entryArray26;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (short) 100);
        int int3 = hashMap2.modCount;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        boolean boolean6 = hashMap4.isEmpty();
        boolean boolean7 = hashMap4.isEmpty();
        int int8 = hashMap4.size();
        boolean boolean9 = hashMap4.isEmpty();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        boolean boolean12 = hashMap10.isEmpty();
        boolean boolean13 = hashMap10.isEmpty();
        java.lang.Object obj15 = hashMap10.get((java.lang.Object) '#');
        hashMap10.modCount = 0;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap(0);
        hashMap19.clear();
        java.lang.Object obj21 = hashMap4.put((java.lang.Object) hashMap10, (java.lang.Object) hashMap19);
        system.testclass.HashMap.Entry[] entryArray22 = hashMap4.table;
        hashMap2.table = entryArray22;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        int int2 = hashMap1.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap1.table;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        hashMap4.clear();
        hashMap4.clear();
        system.testclass.HashMap.Entry[] entryArray9 = hashMap4.table;
        boolean boolean10 = hashMap4.isEmpty();
        system.testclass.HashMap.Entry[] entryArray11 = hashMap4.table;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap(0);
        int int14 = hashMap13.modCount;
        java.lang.Object obj16 = hashMap13.remove((java.lang.Object) (byte) 100);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        boolean boolean20 = hashMap19.isEmpty();
        hashMap19.modCount = ' ';
        java.lang.Object obj23 = hashMap18.get((java.lang.Object) hashMap19);
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.modCount;
        int int26 = hashMap24.modCount;
        system.testclass.HashMap.Entry[] entryArray27 = hashMap24.table;
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        int int29 = hashMap28.modCount;
        int int30 = hashMap28.modCount;
        hashMap28.clear();
        hashMap28.clear();
        system.testclass.HashMap.Entry[] entryArray33 = hashMap28.table;
        hashMap24.table = entryArray33;
        hashMap18.table = entryArray33;
        hashMap18.modCount = (short) 1;
        java.lang.Object obj38 = hashMap4.put(obj16, (java.lang.Object) hashMap18);
        int int39 = hashMap18.modCount;
        system.testclass.HashMap.Entry[] entryArray40 = hashMap18.table;
        hashMap1.table = entryArray40;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap1", hashMap1.property_2());
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        int int2 = hashMap1.modCount;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap(10, (float) 100);
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = hashMap5.get(obj6);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.modCount;
        int int10 = hashMap8.modCount;
        system.testclass.HashMap.Entry[] entryArray11 = hashMap8.table;
        hashMap5.table = entryArray11;
        hashMap1.table = entryArray11;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap1", hashMap1.property_2());
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        boolean boolean3 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        system.testclass.HashMap.Entry[] entryArray7 = hashMap4.table;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.modCount;
        int int10 = hashMap8.modCount;
        hashMap8.clear();
        hashMap8.clear();
        system.testclass.HashMap.Entry[] entryArray13 = hashMap8.table;
        hashMap4.table = entryArray13;
        hashMap0.table = entryArray13;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        int int17 = hashMap16.modCount;
        int int18 = hashMap16.modCount;
        hashMap16.clear();
        hashMap16.clear();
        system.testclass.HashMap.Entry[] entryArray21 = hashMap16.table;
        system.testclass.HashMap.Entry[] entryArray22 = hashMap16.table;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        int int26 = hashMap25.modCount;
        int int27 = hashMap25.modCount;
        system.testclass.HashMap.Entry[] entryArray28 = hashMap25.table;
        java.lang.Object obj29 = hashMap24.remove((java.lang.Object) entryArray28);
        hashMap16.table = entryArray28;
        java.lang.Object obj31 = hashMap0.remove((java.lang.Object) hashMap16);
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap(0);
        int int34 = hashMap33.modCount;
        java.lang.Object obj35 = hashMap16.get((java.lang.Object) int34);
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap((int) '#', (float) 'a');
        boolean boolean39 = hashMap38.isEmpty();
        int int40 = hashMap38.size();
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap((int) (byte) 0);
        java.lang.Object obj43 = hashMap16.put((java.lang.Object) hashMap38, (java.lang.Object) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray44 = hashMap38.table;
        system.testclass.HashMap hashMap46 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap();
        boolean boolean48 = hashMap47.isEmpty();
        hashMap47.modCount = ' ';
        java.lang.Object obj51 = hashMap46.get((java.lang.Object) hashMap47);
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap();
        int int53 = hashMap52.modCount;
        int int54 = hashMap52.modCount;
        system.testclass.HashMap.Entry[] entryArray55 = hashMap52.table;
        system.testclass.HashMap hashMap56 = new system.testclass.HashMap();
        int int57 = hashMap56.modCount;
        int int58 = hashMap56.modCount;
        hashMap56.clear();
        hashMap56.clear();
        system.testclass.HashMap.Entry[] entryArray61 = hashMap56.table;
        hashMap52.table = entryArray61;
        hashMap46.table = entryArray61;
        hashMap46.modCount = (short) 1;
        hashMap46.modCount = (short) 0;
        system.testclass.HashMap.Entry[] entryArray68 = hashMap46.table;
        hashMap38.table = entryArray68;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap38", hashMap38.property_2());
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        hashMap0.clear();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap0.table;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) ' ');
        system.testclass.HashMap.Entry[] entryArray8 = hashMap7.table;
        hashMap0.table = entryArray8;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap0", hashMap0.property_2());
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        hashMap0.modCount = 100;
        hashMap0.clear();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        boolean boolean6 = hashMap5.isEmpty();
        boolean boolean7 = hashMap5.isEmpty();
        boolean boolean8 = hashMap5.isEmpty();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        int int11 = hashMap9.modCount;
        system.testclass.HashMap.Entry[] entryArray12 = hashMap9.table;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        hashMap13.clear();
        hashMap13.clear();
        system.testclass.HashMap.Entry[] entryArray18 = hashMap13.table;
        hashMap9.table = entryArray18;
        hashMap5.table = entryArray18;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        int int22 = hashMap21.modCount;
        int int23 = hashMap21.modCount;
        hashMap21.clear();
        hashMap21.clear();
        system.testclass.HashMap.Entry[] entryArray26 = hashMap21.table;
        system.testclass.HashMap.Entry[] entryArray27 = hashMap21.table;
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        int int31 = hashMap30.modCount;
        int int32 = hashMap30.modCount;
        system.testclass.HashMap.Entry[] entryArray33 = hashMap30.table;
        java.lang.Object obj34 = hashMap29.remove((java.lang.Object) entryArray33);
        hashMap21.table = entryArray33;
        java.lang.Object obj36 = hashMap5.remove((java.lang.Object) hashMap21);
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap(0);
        int int39 = hashMap38.modCount;
        java.lang.Object obj40 = hashMap21.get((java.lang.Object) int39);
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap((int) '#', (float) 'a');
        boolean boolean44 = hashMap43.isEmpty();
        int int45 = hashMap43.size();
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap((int) (byte) 0);
        java.lang.Object obj48 = hashMap21.put((java.lang.Object) hashMap43, (java.lang.Object) (byte) 0);
        system.testclass.HashMap.Entry[] entryArray49 = hashMap43.table;
        hashMap0.table = entryArray49;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap0", hashMap0.property_2());
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 1);
        hashMap1.clear();
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        system.testclass.HashMap.Entry[] entryArray6 = hashMap3.table;
        hashMap3.clear();
        hashMap3.clear();
        system.testclass.HashMap.Entry[] entryArray9 = hashMap3.table;
        hashMap1.table = entryArray9;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap1", hashMap1.property_2());
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        int int3 = hashMap2.modCount;
        int int4 = hashMap2.modCount;
        system.testclass.HashMap.Entry[] entryArray5 = hashMap2.table;
        java.lang.Object obj6 = hashMap1.remove((java.lang.Object) entryArray5);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        int int9 = hashMap7.modCount;
        hashMap7.clear();
        hashMap7.clear();
        system.testclass.HashMap.Entry[] entryArray12 = hashMap7.table;
        boolean boolean13 = hashMap7.isEmpty();
        system.testclass.HashMap.Entry[] entryArray14 = hashMap7.table;
        hashMap1.table = entryArray14;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap1", hashMap1.property_2());
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(3, (float) (byte) 100);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap(10, (float) 100);
        java.lang.Object obj6 = null;
        java.lang.Object obj7 = hashMap5.get(obj6);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.modCount;
        int int10 = hashMap8.modCount;
        system.testclass.HashMap.Entry[] entryArray11 = hashMap8.table;
        hashMap5.table = entryArray11;
        hashMap2.table = entryArray11;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        int int2 = hashMap1.modCount;
        hashMap1.clear();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) (short) 10);
        int int6 = hashMap5.size();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        boolean boolean9 = hashMap7.isEmpty();
        boolean boolean10 = hashMap7.isEmpty();
        java.lang.Object obj12 = hashMap7.get((java.lang.Object) '#');
        int int13 = hashMap7.modCount;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap((int) '4', (float) 10L);
        java.lang.Object obj18 = hashMap16.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap((int) (byte) 0);
        java.lang.Class<?> wildcardClass21 = hashMap20.getClass();
        java.lang.Object obj22 = hashMap16.get((java.lang.Object) hashMap20);
        int int23 = hashMap16.size();
        java.lang.Object obj25 = hashMap16.get((java.lang.Object) true);
        java.lang.Object obj26 = hashMap7.get((java.lang.Object) hashMap16);
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        int int28 = hashMap27.modCount;
        int int29 = hashMap27.modCount;
        hashMap27.clear();
        hashMap27.clear();
        system.testclass.HashMap.Entry[] entryArray32 = hashMap27.table;
        hashMap27.clear();
        hashMap27.modCount = 0;
        java.lang.Object obj37 = hashMap27.remove((java.lang.Object) 100.0f);
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap((int) '4', (float) 10L);
        java.lang.Object obj42 = hashMap40.get((java.lang.Object) (byte) 0);
        hashMap40.modCount = (byte) -1;
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        int int46 = hashMap45.modCount;
        int int47 = hashMap45.modCount;
        hashMap45.clear();
        hashMap45.clear();
        java.lang.Object obj50 = hashMap27.put((java.lang.Object) (byte) -1, (java.lang.Object) hashMap45);
        java.lang.Object obj51 = hashMap5.put((java.lang.Object) hashMap7, (java.lang.Object) hashMap45);
        system.testclass.HashMap.Entry[] entryArray52 = hashMap5.table;
        hashMap1.table = entryArray52;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap1", hashMap1.property_2());
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '#', (float) (byte) 1);
        hashMap2.clear();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap(0);
        int int6 = hashMap5.modCount;
        java.lang.Object obj8 = hashMap5.remove((java.lang.Object) (byte) 100);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        int int11 = hashMap9.modCount;
        hashMap9.clear();
        hashMap9.clear();
        system.testclass.HashMap.Entry[] entryArray14 = hashMap9.table;
        hashMap9.clear();
        hashMap9.modCount = 0;
        java.lang.Object obj19 = hashMap9.remove((java.lang.Object) 100.0f);
        java.lang.Object obj20 = hashMap5.remove((java.lang.Object) 100.0f);
        hashMap5.clear();
        int int22 = hashMap5.modCount;
        int int23 = hashMap5.modCount;
        system.testclass.HashMap.Entry[] entryArray24 = hashMap5.table;
        hashMap2.table = entryArray24;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        java.lang.Object obj4 = hashMap2.remove((java.lang.Object) 10.0f);
        hashMap2.modCount = (short) -1;
        int int7 = hashMap2.size();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap(0);
        system.testclass.HashMap.Entry[] entryArray10 = hashMap9.table;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        int int13 = hashMap11.modCount;
        hashMap11.clear();
        hashMap11.clear();
        system.testclass.HashMap.Entry[] entryArray16 = hashMap11.table;
        hashMap11.clear();
        hashMap11.modCount = 0;
        java.lang.Object obj21 = hashMap11.remove((java.lang.Object) 100.0f);
        java.lang.Object obj22 = hashMap9.remove(obj21);
        system.testclass.HashMap.Entry[] entryArray23 = hashMap9.table;
        hashMap2.table = entryArray23;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        java.lang.Object obj4 = hashMap1.put((java.lang.Object) '4', (java.lang.Object) 10);
        boolean boolean5 = hashMap1.isEmpty();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        system.testclass.HashMap.Entry[] entryArray8 = hashMap6.table;
        hashMap1.table = entryArray8;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap1", hashMap1.property_2());
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 100);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        int int3 = hashMap2.modCount;
        int int4 = hashMap2.modCount;
        hashMap2.clear();
        hashMap2.clear();
        system.testclass.HashMap.Entry[] entryArray7 = hashMap2.table;
        system.testclass.HashMap.Entry[] entryArray8 = hashMap2.table;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        boolean boolean12 = hashMap11.isEmpty();
        hashMap11.modCount = ' ';
        java.lang.Object obj15 = hashMap10.get((java.lang.Object) hashMap11);
        int int16 = hashMap10.modCount;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        int int18 = hashMap17.modCount;
        int int19 = hashMap17.modCount;
        hashMap17.clear();
        hashMap17.clear();
        system.testclass.HashMap.Entry[] entryArray22 = hashMap17.table;
        boolean boolean23 = hashMap17.isEmpty();
        java.lang.Object obj25 = hashMap10.put((java.lang.Object) boolean23, (java.lang.Object) (-1L));
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        boolean boolean29 = hashMap28.isEmpty();
        hashMap28.modCount = ' ';
        java.lang.Object obj32 = hashMap27.get((java.lang.Object) hashMap28);
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        int int34 = hashMap33.modCount;
        int int35 = hashMap33.modCount;
        system.testclass.HashMap.Entry[] entryArray36 = hashMap33.table;
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        int int38 = hashMap37.modCount;
        int int39 = hashMap37.modCount;
        hashMap37.clear();
        hashMap37.clear();
        system.testclass.HashMap.Entry[] entryArray42 = hashMap37.table;
        hashMap33.table = entryArray42;
        hashMap27.table = entryArray42;
        hashMap10.table = entryArray42;
        hashMap2.table = entryArray42;
        hashMap1.table = entryArray42;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap1", hashMap1.property_2());
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        int int2 = hashMap1.modCount;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        hashMap3.clear();
        hashMap3.clear();
        system.testclass.HashMap.Entry[] entryArray8 = hashMap3.table;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        boolean boolean12 = hashMap11.isEmpty();
        hashMap11.modCount = ' ';
        java.lang.Object obj15 = hashMap10.get((java.lang.Object) hashMap11);
        int int16 = hashMap10.modCount;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        int int18 = hashMap17.modCount;
        int int19 = hashMap17.modCount;
        hashMap17.clear();
        hashMap17.clear();
        system.testclass.HashMap.Entry[] entryArray22 = hashMap17.table;
        boolean boolean23 = hashMap17.isEmpty();
        java.lang.Object obj25 = hashMap10.put((java.lang.Object) boolean23, (java.lang.Object) (-1L));
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        boolean boolean29 = hashMap28.isEmpty();
        hashMap28.modCount = ' ';
        java.lang.Object obj32 = hashMap27.get((java.lang.Object) hashMap28);
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        int int34 = hashMap33.modCount;
        int int35 = hashMap33.modCount;
        system.testclass.HashMap.Entry[] entryArray36 = hashMap33.table;
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        int int38 = hashMap37.modCount;
        int int39 = hashMap37.modCount;
        hashMap37.clear();
        hashMap37.clear();
        system.testclass.HashMap.Entry[] entryArray42 = hashMap37.table;
        hashMap33.table = entryArray42;
        hashMap27.table = entryArray42;
        hashMap10.table = entryArray42;
        hashMap3.table = entryArray42;
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap();
        int int48 = hashMap47.modCount;
        int int49 = hashMap47.modCount;
        hashMap47.clear();
        hashMap47.clear();
        system.testclass.HashMap.Entry[] entryArray52 = hashMap47.table;
        system.testclass.HashMap hashMap54 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap hashMap55 = new system.testclass.HashMap();
        boolean boolean56 = hashMap55.isEmpty();
        hashMap55.modCount = ' ';
        java.lang.Object obj59 = hashMap54.get((java.lang.Object) hashMap55);
        int int60 = hashMap54.modCount;
        system.testclass.HashMap hashMap61 = new system.testclass.HashMap();
        int int62 = hashMap61.modCount;
        int int63 = hashMap61.modCount;
        hashMap61.clear();
        hashMap61.clear();
        system.testclass.HashMap.Entry[] entryArray66 = hashMap61.table;
        boolean boolean67 = hashMap61.isEmpty();
        java.lang.Object obj69 = hashMap54.put((java.lang.Object) boolean67, (java.lang.Object) (-1L));
        system.testclass.HashMap hashMap71 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap hashMap72 = new system.testclass.HashMap();
        boolean boolean73 = hashMap72.isEmpty();
        hashMap72.modCount = ' ';
        java.lang.Object obj76 = hashMap71.get((java.lang.Object) hashMap72);
        system.testclass.HashMap hashMap77 = new system.testclass.HashMap();
        int int78 = hashMap77.modCount;
        int int79 = hashMap77.modCount;
        system.testclass.HashMap.Entry[] entryArray80 = hashMap77.table;
        system.testclass.HashMap hashMap81 = new system.testclass.HashMap();
        int int82 = hashMap81.modCount;
        int int83 = hashMap81.modCount;
        hashMap81.clear();
        hashMap81.clear();
        system.testclass.HashMap.Entry[] entryArray86 = hashMap81.table;
        hashMap77.table = entryArray86;
        hashMap71.table = entryArray86;
        hashMap54.table = entryArray86;
        hashMap47.table = entryArray86;
        java.lang.Object obj91 = hashMap3.remove((java.lang.Object) entryArray86);
        hashMap1.table = entryArray86;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap1", hashMap1.property_2());
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(10, (float) 100);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        hashMap3.clear();
        hashMap3.clear();
        system.testclass.HashMap.Entry[] entryArray8 = hashMap3.table;
        hashMap3.clear();
        hashMap3.modCount = 0;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap((int) '#', (float) 'a');
        boolean boolean15 = hashMap14.isEmpty();
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        int int17 = hashMap16.modCount;
        int int18 = hashMap16.modCount;
        hashMap16.clear();
        hashMap16.clear();
        system.testclass.HashMap.Entry[] entryArray21 = hashMap16.table;
        hashMap16.clear();
        hashMap16.modCount = 0;
        java.lang.Object obj26 = hashMap16.remove((java.lang.Object) 100.0f);
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        int int28 = hashMap27.modCount;
        int int29 = hashMap27.modCount;
        system.testclass.HashMap.Entry[] entryArray30 = hashMap27.table;
        hashMap16.table = entryArray30;
        int int32 = hashMap16.modCount;
        int int33 = hashMap16.modCount;
        boolean boolean34 = hashMap16.isEmpty();
        java.lang.Object obj35 = hashMap14.get((java.lang.Object) hashMap16);
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap((int) (short) 10);
        int int38 = hashMap37.size();
        java.lang.Object obj39 = hashMap3.put((java.lang.Object) hashMap16, (java.lang.Object) int38);
        java.lang.Object obj40 = hashMap2.remove((java.lang.Object) hashMap16);
        int int41 = hashMap2.size();
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap(0, (float) (short) 100);
        system.testclass.HashMap.Entry[] entryArray45 = hashMap44.table;
        hashMap2.table = entryArray45;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        boolean boolean3 = hashMap2.isEmpty();
        hashMap2.modCount = ' ';
        java.lang.Object obj6 = hashMap1.get((java.lang.Object) hashMap2);
        java.lang.Object obj8 = hashMap1.get((java.lang.Object) false);
        system.testclass.HashMap.Entry[] entryArray9 = hashMap1.table;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.modCount;
        int int12 = hashMap10.modCount;
        hashMap10.clear();
        hashMap10.clear();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        boolean boolean16 = hashMap15.isEmpty();
        boolean boolean17 = hashMap15.isEmpty();
        boolean boolean18 = hashMap15.isEmpty();
        java.lang.Object obj20 = hashMap15.get((java.lang.Object) '#');
        int int21 = hashMap15.modCount;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap((int) '4', (float) 10L);
        java.lang.Object obj26 = hashMap24.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap((int) (byte) 0);
        java.lang.Class<?> wildcardClass29 = hashMap28.getClass();
        java.lang.Object obj30 = hashMap24.get((java.lang.Object) hashMap28);
        int int31 = hashMap24.size();
        java.lang.Object obj33 = hashMap24.get((java.lang.Object) true);
        java.lang.Object obj34 = hashMap15.get((java.lang.Object) hashMap24);
        java.lang.Object obj35 = hashMap10.get((java.lang.Object) hashMap24);
        java.lang.Object obj36 = hashMap1.remove((java.lang.Object) hashMap24);
        boolean boolean37 = hashMap24.isEmpty();
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        int int39 = hashMap38.modCount;
        int int40 = hashMap38.modCount;
        int int41 = hashMap38.size();
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap();
        hashMap43.modCount = 0;
        java.lang.Object obj46 = hashMap38.put((java.lang.Object) '#', (java.lang.Object) 0);
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap();
        int int49 = hashMap48.modCount;
        java.lang.Object obj50 = hashMap38.put((java.lang.Object) true, (java.lang.Object) hashMap48);
        system.testclass.HashMap hashMap51 = new system.testclass.HashMap();
        int int52 = hashMap51.modCount;
        int int53 = hashMap51.modCount;
        hashMap51.clear();
        hashMap51.clear();
        system.testclass.HashMap.Entry[] entryArray56 = hashMap51.table;
        hashMap51.clear();
        hashMap51.modCount = 0;
        hashMap51.modCount = '#';
        system.testclass.HashMap.Entry[] entryArray62 = hashMap51.table;
        hashMap38.table = entryArray62;
        hashMap24.table = entryArray62;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap24", hashMap24.property_2());
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        int int2 = hashMap1.modCount;
        java.lang.Object obj4 = hashMap1.remove((java.lang.Object) (byte) 100);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        hashMap5.clear();
        hashMap5.clear();
        java.lang.Object obj10 = hashMap1.get((java.lang.Object) hashMap5);
        hashMap5.clear();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        int int13 = hashMap12.modCount;
        int int14 = hashMap12.modCount;
        hashMap12.clear();
        hashMap12.clear();
        system.testclass.HashMap.Entry[] entryArray17 = hashMap12.table;
        hashMap12.clear();
        hashMap12.modCount = 0;
        java.lang.Object obj22 = hashMap12.remove((java.lang.Object) 100.0f);
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        int int24 = hashMap23.modCount;
        int int25 = hashMap23.modCount;
        system.testclass.HashMap.Entry[] entryArray26 = hashMap23.table;
        hashMap12.table = entryArray26;
        int int28 = hashMap12.modCount;
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        int int32 = hashMap31.modCount;
        int int33 = hashMap31.modCount;
        system.testclass.HashMap.Entry[] entryArray34 = hashMap31.table;
        hashMap31.clear();
        java.lang.Class<?> wildcardClass36 = hashMap31.getClass();
        java.lang.Object obj37 = hashMap30.remove((java.lang.Object) wildcardClass36);
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        int int39 = hashMap38.modCount;
        int int40 = hashMap38.modCount;
        hashMap38.clear();
        hashMap38.clear();
        java.lang.Object obj43 = hashMap12.put((java.lang.Object) hashMap30, (java.lang.Object) hashMap38);
        boolean boolean44 = hashMap12.isEmpty();
        java.lang.Object obj45 = hashMap5.remove((java.lang.Object) hashMap12);
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap((int) '4', (float) 10L);
        java.lang.Object obj50 = hashMap48.get((java.lang.Object) (byte) 0);
        hashMap48.modCount = (byte) -1;
        system.testclass.HashMap hashMap55 = new system.testclass.HashMap((int) '4', (float) 10L);
        java.lang.Object obj57 = hashMap55.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap59 = new system.testclass.HashMap((int) (byte) 0);
        java.lang.Class<?> wildcardClass60 = hashMap59.getClass();
        java.lang.Object obj61 = hashMap55.get((java.lang.Object) hashMap59);
        java.lang.Object obj63 = hashMap55.remove((java.lang.Object) 100.0d);
        hashMap55.modCount = '4';
        system.testclass.HashMap hashMap66 = new system.testclass.HashMap();
        int int67 = hashMap66.modCount;
        int int68 = hashMap66.modCount;
        hashMap66.clear();
        hashMap66.clear();
        system.testclass.HashMap.Entry[] entryArray71 = hashMap66.table;
        system.testclass.HashMap.Entry[] entryArray72 = hashMap66.table;
        system.testclass.HashMap hashMap74 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap75 = new system.testclass.HashMap();
        int int76 = hashMap75.modCount;
        int int77 = hashMap75.modCount;
        system.testclass.HashMap.Entry[] entryArray78 = hashMap75.table;
        java.lang.Object obj79 = hashMap74.remove((java.lang.Object) entryArray78);
        hashMap66.table = entryArray78;
        system.testclass.HashMap hashMap81 = new system.testclass.HashMap();
        int int82 = hashMap81.modCount;
        int int83 = hashMap81.modCount;
        hashMap81.clear();
        hashMap81.clear();
        system.testclass.HashMap.Entry[] entryArray86 = hashMap81.table;
        java.lang.Object obj87 = hashMap66.get((java.lang.Object) entryArray86);
        int int88 = hashMap66.modCount;
        system.testclass.HashMap.Entry[] entryArray89 = hashMap66.table;
        java.lang.Object obj90 = hashMap55.remove((java.lang.Object) hashMap66);
        java.lang.Object obj91 = hashMap48.get((java.lang.Object) hashMap55);
        system.testclass.HashMap.Entry[] entryArray92 = hashMap48.table;
        hashMap5.table = entryArray92;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap5", hashMap5.property_2());
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        int int3 = hashMap2.size();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        system.testclass.HashMap.Entry[] entryArray7 = hashMap4.table;
        system.testclass.HashMap.Entry[] entryArray8 = hashMap4.table;
        java.lang.Object obj9 = hashMap2.remove((java.lang.Object) hashMap4);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.modCount;
        int int12 = hashMap10.modCount;
        hashMap10.clear();
        hashMap10.clear();
        system.testclass.HashMap.Entry[] entryArray15 = hashMap10.table;
        system.testclass.HashMap.Entry[] entryArray16 = hashMap10.table;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        int int20 = hashMap19.modCount;
        int int21 = hashMap19.modCount;
        system.testclass.HashMap.Entry[] entryArray22 = hashMap19.table;
        java.lang.Object obj23 = hashMap18.remove((java.lang.Object) entryArray22);
        hashMap10.table = entryArray22;
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        int int26 = hashMap25.modCount;
        int int27 = hashMap25.modCount;
        hashMap25.clear();
        hashMap25.clear();
        system.testclass.HashMap.Entry[] entryArray30 = hashMap25.table;
        java.lang.Object obj31 = hashMap10.get((java.lang.Object) entryArray30);
        hashMap2.table = entryArray30;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        hashMap3.clear();
        hashMap3.clear();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.modCount;
        int int10 = hashMap8.modCount;
        system.testclass.HashMap.Entry[] entryArray11 = hashMap8.table;
        hashMap8.clear();
        hashMap8.clear();
        java.lang.Object obj14 = hashMap3.remove((java.lang.Object) hashMap8);
        int int15 = hashMap3.size();
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        int int17 = hashMap16.modCount;
        int int18 = hashMap16.modCount;
        hashMap16.clear();
        hashMap16.clear();
        system.testclass.HashMap.Entry[] entryArray21 = hashMap16.table;
        java.lang.Object obj22 = hashMap2.put((java.lang.Object) hashMap3, (java.lang.Object) hashMap16);
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        int int24 = hashMap23.modCount;
        int int25 = hashMap23.modCount;
        system.testclass.HashMap.Entry[] entryArray26 = hashMap23.table;
        int int27 = hashMap23.size();
        hashMap23.clear();
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        int int30 = hashMap29.modCount;
        int int31 = hashMap29.modCount;
        hashMap29.clear();
        hashMap29.clear();
        system.testclass.HashMap.Entry[] entryArray34 = hashMap29.table;
        boolean boolean35 = hashMap29.isEmpty();
        system.testclass.HashMap.Entry[] entryArray36 = hashMap29.table;
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap(0);
        int int39 = hashMap38.modCount;
        java.lang.Object obj41 = hashMap38.remove((java.lang.Object) (byte) 100);
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap();
        boolean boolean45 = hashMap44.isEmpty();
        hashMap44.modCount = ' ';
        java.lang.Object obj48 = hashMap43.get((java.lang.Object) hashMap44);
        system.testclass.HashMap hashMap49 = new system.testclass.HashMap();
        int int50 = hashMap49.modCount;
        int int51 = hashMap49.modCount;
        system.testclass.HashMap.Entry[] entryArray52 = hashMap49.table;
        system.testclass.HashMap hashMap53 = new system.testclass.HashMap();
        int int54 = hashMap53.modCount;
        int int55 = hashMap53.modCount;
        hashMap53.clear();
        hashMap53.clear();
        system.testclass.HashMap.Entry[] entryArray58 = hashMap53.table;
        hashMap49.table = entryArray58;
        hashMap43.table = entryArray58;
        hashMap43.modCount = (short) 1;
        java.lang.Object obj63 = hashMap29.put(obj41, (java.lang.Object) hashMap43);
        int int64 = hashMap43.modCount;
        system.testclass.HashMap.Entry[] entryArray65 = hashMap43.table;
        system.testclass.HashMap hashMap68 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        system.testclass.HashMap hashMap71 = new system.testclass.HashMap((int) (byte) 100, (float) (byte) 100);
        java.lang.Object obj72 = hashMap68.remove((java.lang.Object) hashMap71);
        java.lang.Object obj73 = hashMap23.put((java.lang.Object) entryArray65, (java.lang.Object) hashMap71);
        hashMap2.table = entryArray65;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '#', (float) 'a');
        boolean boolean3 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap(0);
        int int10 = hashMap9.modCount;
        java.lang.Object obj11 = hashMap7.get((java.lang.Object) int10);
        java.lang.Object obj12 = hashMap2.put((java.lang.Object) ' ', obj11);
        int int13 = hashMap2.size();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.modCount;
        int int16 = hashMap14.modCount;
        hashMap14.clear();
        hashMap14.clear();
        system.testclass.HashMap.Entry[] entryArray19 = hashMap14.table;
        hashMap14.clear();
        hashMap14.modCount = 0;
        java.lang.Object obj24 = hashMap14.remove((java.lang.Object) 100.0f);
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        int int26 = hashMap25.modCount;
        int int27 = hashMap25.modCount;
        system.testclass.HashMap.Entry[] entryArray28 = hashMap25.table;
        hashMap14.table = entryArray28;
        int int30 = hashMap14.modCount;
        int int31 = hashMap14.modCount;
        boolean boolean32 = hashMap14.isEmpty();
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        boolean boolean36 = hashMap35.isEmpty();
        hashMap35.modCount = ' ';
        java.lang.Object obj39 = hashMap34.get((java.lang.Object) hashMap35);
        int int40 = hashMap34.modCount;
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        int int42 = hashMap41.modCount;
        int int43 = hashMap41.modCount;
        hashMap41.clear();
        hashMap41.clear();
        system.testclass.HashMap.Entry[] entryArray46 = hashMap41.table;
        boolean boolean47 = hashMap41.isEmpty();
        java.lang.Object obj49 = hashMap34.put((java.lang.Object) boolean47, (java.lang.Object) (-1L));
        system.testclass.HashMap hashMap51 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap();
        boolean boolean53 = hashMap52.isEmpty();
        hashMap52.modCount = ' ';
        java.lang.Object obj56 = hashMap51.get((java.lang.Object) hashMap52);
        system.testclass.HashMap hashMap57 = new system.testclass.HashMap();
        int int58 = hashMap57.modCount;
        int int59 = hashMap57.modCount;
        system.testclass.HashMap.Entry[] entryArray60 = hashMap57.table;
        system.testclass.HashMap hashMap61 = new system.testclass.HashMap();
        int int62 = hashMap61.modCount;
        int int63 = hashMap61.modCount;
        hashMap61.clear();
        hashMap61.clear();
        system.testclass.HashMap.Entry[] entryArray66 = hashMap61.table;
        hashMap57.table = entryArray66;
        hashMap51.table = entryArray66;
        hashMap34.table = entryArray66;
        hashMap14.table = entryArray66;
        hashMap2.table = entryArray66;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }
}

