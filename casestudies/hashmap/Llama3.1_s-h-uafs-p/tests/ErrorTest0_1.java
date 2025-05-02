import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(10);
        system.testclass.HashMap.Entry[] entryArray2 = hashMap1.table;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        int int5 = hashMap3.size();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        java.lang.Object obj8 = hashMap3.get((java.lang.Object) hashMap6);
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = hashMap3.put((java.lang.Object) 1L, obj10);
        system.testclass.HashMap.Entry[] entryArray12 = hashMap3.table;
        hashMap1.table = entryArray12;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for hashMap1", hashMap1.property_1());
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        int int5 = hashMap3.size();
        boolean boolean6 = hashMap3.isEmpty();
        java.lang.Object obj7 = hashMap0.get((java.lang.Object) boolean6);
        system.testclass.HashMap.Entry[] entryArray8 = hashMap0.table;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap((int) (byte) 100, (float) '#');
        hashMap11.clear();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap(10);
        system.testclass.HashMap.Entry[] entryArray15 = hashMap14.table;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        int int17 = hashMap16.modCount;
        system.testclass.HashMap.Entry[] entryArray18 = new system.testclass.HashMap.Entry[] {};
        hashMap16.table = entryArray18;
        hashMap16.clear();
        java.lang.Object obj21 = hashMap14.remove((java.lang.Object) hashMap16);
        java.lang.Object obj22 = hashMap0.put((java.lang.Object) hashMap11, obj21);
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        int int24 = hashMap23.modCount;
        int int25 = hashMap23.modCount;
        system.testclass.HashMap.Entry[] entryArray26 = hashMap23.table;
        system.testclass.HashMap.Entry[] entryArray27 = hashMap23.table;
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        int int29 = hashMap28.modCount;
        int int30 = hashMap28.modCount;
        system.testclass.HashMap.Entry[] entryArray31 = hashMap28.table;
        java.lang.Object obj32 = hashMap23.remove((java.lang.Object) hashMap28);
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        int int34 = hashMap33.modCount;
        int int35 = hashMap33.modCount;
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        java.lang.Object obj39 = hashMap33.get((java.lang.Object) (byte) 0);
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        int int41 = hashMap40.modCount;
        int int42 = hashMap40.modCount;
        system.testclass.HashMap.Entry[] entryArray43 = hashMap40.table;
        java.lang.Object obj44 = hashMap23.put(obj39, (java.lang.Object) entryArray43);
        hashMap0.table = entryArray43;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for hashMap0", hashMap0.property_1());
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        int int3 = hashMap0.size();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        system.testclass.HashMap.Entry[] entryArray7 = hashMap4.table;
        boolean boolean8 = hashMap4.isEmpty();
        hashMap4.clear();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap(0);
        java.lang.Object obj12 = hashMap0.put((java.lang.Object) hashMap4, (java.lang.Object) hashMap11);
        system.testclass.HashMap.Entry[] entryArray13 = hashMap0.table;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.modCount;
        int int16 = hashMap14.modCount;
        system.testclass.HashMap.Entry[] entryArray17 = hashMap14.table;
        system.testclass.HashMap.Entry[] entryArray18 = hashMap14.table;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        int int23 = hashMap22.modCount;
        int int24 = hashMap22.modCount;
        system.testclass.HashMap.Entry[] entryArray25 = hashMap22.table;
        hashMap21.table = entryArray25;
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap(0);
        java.lang.Object obj29 = hashMap21.get((java.lang.Object) 0);
        hashMap21.modCount = ' ';
        java.lang.Object obj32 = hashMap0.put((java.lang.Object) hashMap14, (java.lang.Object) hashMap21);
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        boolean boolean34 = hashMap33.isEmpty();
        int int35 = hashMap33.size();
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        boolean boolean37 = hashMap36.isEmpty();
        java.lang.Object obj38 = hashMap33.get((java.lang.Object) hashMap36);
        java.lang.Object obj40 = null;
        java.lang.Object obj41 = hashMap33.put((java.lang.Object) 1L, obj40);
        system.testclass.HashMap.Entry[] entryArray42 = hashMap33.table;
        hashMap14.table = entryArray42;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for hashMap14", hashMap14.property_1());
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) ' ');
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap(0);
        java.lang.Object obj5 = hashMap3.get((java.lang.Object) 100.0d);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        int int11 = hashMap9.modCount;
        system.testclass.HashMap.Entry[] entryArray12 = hashMap9.table;
        hashMap8.table = entryArray12;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.modCount;
        system.testclass.HashMap.Entry[] entryArray16 = new system.testclass.HashMap.Entry[] {};
        hashMap14.table = entryArray16;
        hashMap14.clear();
        system.testclass.HashMap.Entry[] entryArray19 = hashMap14.table;
        hashMap8.table = entryArray19;
        java.lang.Object obj21 = hashMap3.remove((java.lang.Object) entryArray19);
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap(10);
        system.testclass.HashMap.Entry[] entryArray24 = hashMap23.table;
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        int int26 = hashMap25.modCount;
        system.testclass.HashMap.Entry[] entryArray27 = new system.testclass.HashMap.Entry[] {};
        hashMap25.table = entryArray27;
        hashMap25.clear();
        java.lang.Object obj30 = hashMap23.remove((java.lang.Object) hashMap25);
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        int int35 = hashMap34.modCount;
        int int36 = hashMap34.modCount;
        system.testclass.HashMap.Entry[] entryArray37 = hashMap34.table;
        hashMap33.table = entryArray37;
        java.lang.Object obj40 = hashMap33.remove((java.lang.Object) 100);
        system.testclass.HashMap.Entry[] entryArray41 = new system.testclass.HashMap.Entry[] {};
        hashMap33.table = entryArray41;
        hashMap25.table = entryArray41;
        java.lang.Object obj44 = hashMap1.put((java.lang.Object) hashMap3, (java.lang.Object) hashMap25);
        boolean boolean45 = hashMap1.isEmpty();
        system.testclass.HashMap hashMap46 = new system.testclass.HashMap();
        boolean boolean47 = hashMap46.isEmpty();
        boolean boolean48 = hashMap46.isEmpty();
        system.testclass.HashMap hashMap49 = new system.testclass.HashMap();
        boolean boolean50 = hashMap49.isEmpty();
        int int51 = hashMap49.size();
        boolean boolean52 = hashMap49.isEmpty();
        java.lang.Object obj53 = hashMap46.get((java.lang.Object) boolean52);
        system.testclass.HashMap hashMap56 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray57 = hashMap56.table;
        system.testclass.HashMap hashMap60 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap61 = new system.testclass.HashMap();
        int int62 = hashMap61.modCount;
        int int63 = hashMap61.modCount;
        system.testclass.HashMap.Entry[] entryArray64 = hashMap61.table;
        hashMap60.table = entryArray64;
        system.testclass.HashMap hashMap67 = new system.testclass.HashMap(0);
        java.lang.Object obj69 = hashMap67.get((java.lang.Object) 100.0d);
        system.testclass.HashMap hashMap72 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap73 = new system.testclass.HashMap();
        int int74 = hashMap73.modCount;
        int int75 = hashMap73.modCount;
        system.testclass.HashMap.Entry[] entryArray76 = hashMap73.table;
        hashMap72.table = entryArray76;
        system.testclass.HashMap hashMap78 = new system.testclass.HashMap();
        int int79 = hashMap78.modCount;
        system.testclass.HashMap.Entry[] entryArray80 = new system.testclass.HashMap.Entry[] {};
        hashMap78.table = entryArray80;
        hashMap78.clear();
        system.testclass.HashMap.Entry[] entryArray83 = hashMap78.table;
        hashMap72.table = entryArray83;
        java.lang.Object obj85 = hashMap67.remove((java.lang.Object) entryArray83);
        system.testclass.HashMap hashMap86 = new system.testclass.HashMap();
        int int87 = hashMap86.modCount;
        system.testclass.HashMap.Entry[] entryArray88 = new system.testclass.HashMap.Entry[] {};
        hashMap86.table = entryArray88;
        hashMap86.clear();
        system.testclass.HashMap hashMap91 = new system.testclass.HashMap();
        int int92 = hashMap91.modCount;
        system.testclass.HashMap.Entry[] entryArray93 = new system.testclass.HashMap.Entry[] {};
        hashMap91.table = entryArray93;
        hashMap86.table = entryArray93;
        hashMap67.table = entryArray93;
        java.lang.Object obj97 = hashMap56.put((java.lang.Object) entryArray64, (java.lang.Object) entryArray93);
        hashMap46.table = entryArray64;
        hashMap1.table = entryArray64;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for hashMap1", hashMap1.property_1());
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 10);
        int int2 = hashMap1.modCount;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        system.testclass.HashMap.Entry[] entryArray6 = hashMap3.table;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        int int9 = hashMap7.size();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        java.lang.Object obj12 = hashMap7.get((java.lang.Object) hashMap10);
        hashMap7.modCount = 'a';
        java.lang.Object obj15 = hashMap3.remove((java.lang.Object) hashMap7);
        hashMap3.modCount = (byte) 10;
        int int18 = hashMap3.size();
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap(0, (float) 10L);
        boolean boolean25 = hashMap24.isEmpty();
        hashMap24.clear();
        system.testclass.HashMap.Entry entry27 = null;
        system.testclass.HashMap.Entry[] entryArray28 = new system.testclass.HashMap.Entry[] { entry27 };
        hashMap24.table = entryArray28;
        hashMap21.table = entryArray28;
        hashMap3.table = entryArray28;
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        int int33 = hashMap32.modCount;
        int int34 = hashMap32.modCount;
        int int35 = hashMap32.size();
        int int36 = hashMap32.modCount;
        int int37 = hashMap32.size();
        java.lang.Object obj38 = hashMap1.put((java.lang.Object) hashMap3, (java.lang.Object) hashMap32);
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        int int40 = hashMap39.modCount;
        system.testclass.HashMap.Entry[] entryArray41 = new system.testclass.HashMap.Entry[] {};
        hashMap39.table = entryArray41;
        hashMap1.table = entryArray41;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for hashMap1", hashMap1.property_1());
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) ' ');
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap(0);
        java.lang.Object obj5 = hashMap3.get((java.lang.Object) 100.0d);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        int int11 = hashMap9.modCount;
        system.testclass.HashMap.Entry[] entryArray12 = hashMap9.table;
        hashMap8.table = entryArray12;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.modCount;
        system.testclass.HashMap.Entry[] entryArray16 = new system.testclass.HashMap.Entry[] {};
        hashMap14.table = entryArray16;
        hashMap14.clear();
        system.testclass.HashMap.Entry[] entryArray19 = hashMap14.table;
        hashMap8.table = entryArray19;
        java.lang.Object obj21 = hashMap3.remove((java.lang.Object) entryArray19);
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap(10);
        system.testclass.HashMap.Entry[] entryArray24 = hashMap23.table;
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        int int26 = hashMap25.modCount;
        system.testclass.HashMap.Entry[] entryArray27 = new system.testclass.HashMap.Entry[] {};
        hashMap25.table = entryArray27;
        hashMap25.clear();
        java.lang.Object obj30 = hashMap23.remove((java.lang.Object) hashMap25);
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        int int35 = hashMap34.modCount;
        int int36 = hashMap34.modCount;
        system.testclass.HashMap.Entry[] entryArray37 = hashMap34.table;
        hashMap33.table = entryArray37;
        java.lang.Object obj40 = hashMap33.remove((java.lang.Object) 100);
        system.testclass.HashMap.Entry[] entryArray41 = new system.testclass.HashMap.Entry[] {};
        hashMap33.table = entryArray41;
        hashMap25.table = entryArray41;
        java.lang.Object obj44 = hashMap1.put((java.lang.Object) hashMap3, (java.lang.Object) hashMap25);
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap((int) '#', (float) 'a');
        system.testclass.HashMap hashMap49 = new system.testclass.HashMap((int) (byte) 0);
        hashMap49.clear();
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap(0);
        java.lang.Object obj54 = hashMap52.get((java.lang.Object) 100.0d);
        int int55 = hashMap52.modCount;
        system.testclass.HashMap hashMap56 = new system.testclass.HashMap();
        boolean boolean57 = hashMap56.isEmpty();
        int int58 = hashMap56.size();
        system.testclass.HashMap hashMap59 = new system.testclass.HashMap();
        boolean boolean60 = hashMap59.isEmpty();
        java.lang.Object obj61 = hashMap56.get((java.lang.Object) hashMap59);
        int int62 = hashMap56.modCount;
        java.lang.Object obj64 = hashMap52.put((java.lang.Object) hashMap56, (java.lang.Object) (short) 100);
        hashMap52.clear();
        boolean boolean66 = hashMap52.isEmpty();
        system.testclass.HashMap hashMap67 = new system.testclass.HashMap();
        int int68 = hashMap67.modCount;
        system.testclass.HashMap.Entry[] entryArray69 = new system.testclass.HashMap.Entry[] {};
        hashMap67.table = entryArray69;
        hashMap67.clear();
        system.testclass.HashMap hashMap72 = new system.testclass.HashMap();
        int int73 = hashMap72.modCount;
        system.testclass.HashMap.Entry[] entryArray74 = new system.testclass.HashMap.Entry[] {};
        hashMap72.table = entryArray74;
        hashMap67.table = entryArray74;
        hashMap52.table = entryArray74;
        java.lang.Object obj78 = hashMap49.get((java.lang.Object) hashMap52);
        system.testclass.HashMap.Entry[] entryArray79 = hashMap49.table;
        hashMap47.table = entryArray79;
        hashMap1.table = entryArray79;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_1) for hashMap1", hashMap1.property_1());
    }
}

