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
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        java.lang.Object obj4 = hashMap1.put((java.lang.Object) '4', (java.lang.Object) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap1", hashMap1.property_2());
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        int int9 = hashMap7.modCount;
        system.testclass.HashMap.Entry[] entryArray10 = hashMap7.table;
        java.lang.Object obj11 = hashMap6.get((java.lang.Object) entryArray10);
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = hashMap0.put((java.lang.Object) entryArray10, obj12);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap0", hashMap0.property_2());
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = hashMap1.put((java.lang.Object) false, obj3);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap1", hashMap1.property_2());
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        int int6 = hashMap4.size();
        hashMap4.modCount = '4';
        java.lang.Object obj9 = hashMap0.remove((java.lang.Object) hashMap4);
        java.lang.Object obj11 = hashMap4.remove((java.lang.Object) (-1.0d));
        int int12 = hashMap4.size();
        hashMap4.clear();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        int int17 = hashMap15.modCount;
        hashMap15.clear();
        java.lang.Object obj19 = null;
        java.lang.Object obj20 = hashMap15.remove(obj19);
        hashMap15.modCount = ' ';
        java.lang.Object obj23 = hashMap4.put((java.lang.Object) "hi!", (java.lang.Object) ' ');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap4", hashMap4.property_2());
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        int int3 = hashMap2.size();
        int int4 = hashMap2.modCount;
        system.testclass.HashMap.Entry entry5 = null;
        system.testclass.HashMap.Entry[] entryArray6 = new system.testclass.HashMap.Entry[] { entry5 };
        hashMap2.table = entryArray6;
        hashMap2.modCount = (byte) 100;
        hashMap2.modCount = (byte) 10;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        int int13 = hashMap12.modCount;
        int int14 = hashMap12.modCount;
        system.testclass.HashMap.Entry[] entryArray15 = hashMap12.table;
        boolean boolean16 = hashMap12.isEmpty();
        java.lang.Object obj18 = hashMap12.remove((java.lang.Object) (byte) 1);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        int int20 = hashMap19.modCount;
        int int21 = hashMap19.modCount;
        system.testclass.HashMap.Entry[] entryArray22 = hashMap19.table;
        system.testclass.HashMap.Entry[] entryArray23 = hashMap19.table;
        java.lang.Object obj24 = hashMap2.put(obj18, (java.lang.Object) entryArray23);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        int int6 = hashMap4.size();
        hashMap4.modCount = '4';
        java.lang.Object obj9 = hashMap0.remove((java.lang.Object) hashMap4);
        java.lang.Object obj11 = hashMap4.remove((java.lang.Object) (-1.0d));
        boolean boolean12 = hashMap4.isEmpty();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        int int16 = hashMap13.size();
        system.testclass.HashMap.Entry[] entryArray17 = new system.testclass.HashMap.Entry[] {};
        hashMap13.table = entryArray17;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        boolean boolean20 = hashMap19.isEmpty();
        int int21 = hashMap19.size();
        hashMap19.modCount = '4';
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.modCount;
        int int26 = hashMap24.modCount;
        int int27 = hashMap24.size();
        java.lang.Object obj28 = hashMap19.get((java.lang.Object) int27);
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        int int30 = hashMap29.modCount;
        int int31 = hashMap29.modCount;
        system.testclass.HashMap.Entry[] entryArray32 = hashMap29.table;
        boolean boolean33 = hashMap29.isEmpty();
        java.lang.Object obj34 = hashMap19.remove((java.lang.Object) hashMap29);
        java.lang.Object obj35 = hashMap4.put((java.lang.Object) hashMap13, obj34);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap4", hashMap4.property_2());
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
        java.lang.Object obj6 = hashMap0.get((java.lang.Object) 100);
        system.testclass.HashMap.Entry[] entryArray7 = hashMap0.table;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        int int13 = hashMap11.modCount;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        boolean boolean15 = hashMap14.isEmpty();
        int int16 = hashMap14.size();
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        int int21 = hashMap20.modCount;
        int int22 = hashMap20.modCount;
        system.testclass.HashMap.Entry[] entryArray23 = hashMap20.table;
        java.lang.Object obj24 = hashMap19.get((java.lang.Object) entryArray23);
        java.lang.Object obj25 = hashMap14.get((java.lang.Object) entryArray23);
        hashMap11.table = entryArray23;
        java.lang.Object obj27 = hashMap0.put((java.lang.Object) hashMap10, (java.lang.Object) hashMap11);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap0", hashMap0.property_2());
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        int int3 = hashMap2.size();
        int int4 = hashMap2.modCount;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap(0, (float) 10L);
        int int8 = hashMap7.size();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        int int11 = hashMap9.modCount;
        system.testclass.HashMap.Entry[] entryArray12 = hashMap9.table;
        hashMap7.table = entryArray12;
        java.lang.Object obj14 = hashMap2.get((java.lang.Object) hashMap7);
        hashMap2.clear();
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        boolean boolean17 = hashMap16.isEmpty();
        int int18 = hashMap16.size();
        hashMap16.modCount = '4';
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        int int22 = hashMap21.modCount;
        int int23 = hashMap21.modCount;
        int int24 = hashMap21.size();
        java.lang.Object obj25 = hashMap16.get((java.lang.Object) int24);
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap(0, (float) 10L);
        int int29 = hashMap28.size();
        int int30 = hashMap28.modCount;
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap(0, (float) 10L);
        int int34 = hashMap33.size();
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        int int36 = hashMap35.modCount;
        int int37 = hashMap35.modCount;
        system.testclass.HashMap.Entry[] entryArray38 = hashMap35.table;
        hashMap33.table = entryArray38;
        java.lang.Object obj40 = hashMap28.get((java.lang.Object) hashMap33);
        hashMap28.clear();
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap();
        boolean boolean43 = hashMap42.isEmpty();
        boolean boolean44 = hashMap42.isEmpty();
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        boolean boolean46 = hashMap45.isEmpty();
        int int47 = hashMap45.size();
        system.testclass.HashMap hashMap50 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap51 = new system.testclass.HashMap();
        int int52 = hashMap51.modCount;
        int int53 = hashMap51.modCount;
        system.testclass.HashMap.Entry[] entryArray54 = hashMap51.table;
        java.lang.Object obj55 = hashMap50.get((java.lang.Object) entryArray54);
        java.lang.Object obj56 = hashMap45.get((java.lang.Object) entryArray54);
        hashMap42.table = entryArray54;
        system.testclass.HashMap hashMap58 = new system.testclass.HashMap();
        int int59 = hashMap58.modCount;
        int int60 = hashMap58.modCount;
        system.testclass.HashMap.Entry[] entryArray61 = hashMap58.table;
        hashMap58.clear();
        system.testclass.HashMap.Entry[] entryArray63 = hashMap58.table;
        hashMap42.table = entryArray63;
        java.lang.Object obj65 = hashMap28.get((java.lang.Object) hashMap42);
        hashMap28.modCount = 0;
        java.lang.Object obj68 = hashMap2.put((java.lang.Object) int24, (java.lang.Object) hashMap28);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        int int3 = hashMap2.size();
        int int4 = hashMap2.modCount;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap(0, (float) 10L);
        int int8 = hashMap7.size();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        int int11 = hashMap9.modCount;
        system.testclass.HashMap.Entry[] entryArray12 = hashMap9.table;
        hashMap7.table = entryArray12;
        java.lang.Object obj14 = hashMap2.get((java.lang.Object) hashMap7);
        hashMap2.clear();
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        boolean boolean17 = hashMap16.isEmpty();
        boolean boolean18 = hashMap16.isEmpty();
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        boolean boolean20 = hashMap19.isEmpty();
        int int21 = hashMap19.size();
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        int int26 = hashMap25.modCount;
        int int27 = hashMap25.modCount;
        system.testclass.HashMap.Entry[] entryArray28 = hashMap25.table;
        java.lang.Object obj29 = hashMap24.get((java.lang.Object) entryArray28);
        java.lang.Object obj30 = hashMap19.get((java.lang.Object) entryArray28);
        hashMap16.table = entryArray28;
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        int int33 = hashMap32.modCount;
        int int34 = hashMap32.modCount;
        system.testclass.HashMap.Entry[] entryArray35 = hashMap32.table;
        hashMap32.clear();
        system.testclass.HashMap.Entry[] entryArray37 = hashMap32.table;
        hashMap16.table = entryArray37;
        java.lang.Object obj39 = hashMap2.get((java.lang.Object) hashMap16);
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap(0, (float) 10L);
        int int43 = hashMap42.size();
        int int44 = hashMap42.modCount;
        system.testclass.HashMap.Entry entry45 = null;
        system.testclass.HashMap.Entry[] entryArray46 = new system.testclass.HashMap.Entry[] { entry45 };
        hashMap42.table = entryArray46;
        hashMap42.modCount = (byte) 100;
        system.testclass.HashMap hashMap50 = new system.testclass.HashMap();
        int int51 = hashMap50.modCount;
        int int52 = hashMap50.modCount;
        hashMap50.clear();
        system.testclass.HashMap hashMap54 = new system.testclass.HashMap();
        boolean boolean55 = hashMap54.isEmpty();
        int int56 = hashMap54.size();
        hashMap54.modCount = '4';
        java.lang.Object obj59 = hashMap50.remove((java.lang.Object) hashMap54);
        system.testclass.HashMap hashMap62 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj63 = hashMap54.remove((java.lang.Object) 0);
        java.lang.Object obj65 = hashMap54.get((java.lang.Object) '#');
        system.testclass.HashMap hashMap66 = new system.testclass.HashMap();
        boolean boolean67 = hashMap66.isEmpty();
        java.lang.Object obj68 = hashMap54.get((java.lang.Object) boolean67);
        hashMap54.modCount = 0;
        system.testclass.HashMap hashMap72 = new system.testclass.HashMap(10);
        boolean boolean73 = hashMap72.isEmpty();
        system.testclass.HashMap.Entry[] entryArray74 = new system.testclass.HashMap.Entry[] {};
        hashMap72.table = entryArray74;
        java.lang.Object obj76 = hashMap54.remove((java.lang.Object) entryArray74);
        hashMap42.table = entryArray74;
        system.testclass.HashMap hashMap78 = new system.testclass.HashMap();
        boolean boolean79 = hashMap78.isEmpty();
        int int80 = hashMap78.size();
        hashMap78.modCount = '4';
        system.testclass.HashMap hashMap83 = new system.testclass.HashMap();
        int int84 = hashMap83.modCount;
        int int85 = hashMap83.modCount;
        int int86 = hashMap83.size();
        java.lang.Object obj87 = hashMap78.get((java.lang.Object) int86);
        system.testclass.HashMap hashMap88 = new system.testclass.HashMap();
        int int89 = hashMap88.modCount;
        int int90 = hashMap88.modCount;
        system.testclass.HashMap.Entry[] entryArray91 = hashMap88.table;
        boolean boolean92 = hashMap88.isEmpty();
        java.lang.Object obj93 = hashMap78.remove((java.lang.Object) hashMap88);
        java.lang.Object obj94 = hashMap2.put((java.lang.Object) hashMap42, (java.lang.Object) hashMap78);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) '4');
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        boolean boolean3 = hashMap2.isEmpty();
        int int4 = hashMap2.size();
        hashMap2.modCount = '4';
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        int int9 = hashMap7.modCount;
        hashMap7.clear();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        boolean boolean12 = hashMap11.isEmpty();
        int int13 = hashMap11.size();
        hashMap11.modCount = '4';
        java.lang.Object obj16 = hashMap7.remove((java.lang.Object) hashMap11);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj20 = hashMap11.remove((java.lang.Object) 0);
        java.lang.Object obj22 = hashMap11.get((java.lang.Object) '#');
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        int int27 = hashMap26.modCount;
        int int28 = hashMap26.modCount;
        system.testclass.HashMap.Entry[] entryArray29 = hashMap26.table;
        java.lang.Object obj30 = hashMap25.get((java.lang.Object) entryArray29);
        hashMap11.table = entryArray29;
        hashMap2.table = entryArray29;
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        boolean boolean34 = hashMap33.isEmpty();
        int int35 = hashMap33.size();
        hashMap33.modCount = '4';
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        int int39 = hashMap38.modCount;
        int int40 = hashMap38.modCount;
        hashMap38.clear();
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap();
        boolean boolean43 = hashMap42.isEmpty();
        int int44 = hashMap42.size();
        hashMap42.modCount = '4';
        java.lang.Object obj47 = hashMap38.remove((java.lang.Object) hashMap42);
        system.testclass.HashMap hashMap50 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj51 = hashMap42.remove((java.lang.Object) 0);
        java.lang.Object obj53 = hashMap42.get((java.lang.Object) '#');
        system.testclass.HashMap hashMap56 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap57 = new system.testclass.HashMap();
        int int58 = hashMap57.modCount;
        int int59 = hashMap57.modCount;
        system.testclass.HashMap.Entry[] entryArray60 = hashMap57.table;
        java.lang.Object obj61 = hashMap56.get((java.lang.Object) entryArray60);
        hashMap42.table = entryArray60;
        hashMap33.table = entryArray60;
        hashMap2.table = entryArray60;
        java.lang.Object obj65 = hashMap1.get((java.lang.Object) hashMap2);
        boolean boolean66 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap68 = new system.testclass.HashMap();
        int int69 = hashMap68.modCount;
        int int70 = hashMap68.modCount;
        hashMap68.clear();
        system.testclass.HashMap hashMap72 = new system.testclass.HashMap();
        boolean boolean73 = hashMap72.isEmpty();
        int int74 = hashMap72.size();
        hashMap72.modCount = '4';
        java.lang.Object obj77 = hashMap68.remove((java.lang.Object) hashMap72);
        java.lang.Class<?> wildcardClass78 = hashMap68.getClass();
        java.lang.Object obj79 = hashMap2.put((java.lang.Object) 100L, (java.lang.Object) wildcardClass78);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        system.testclass.HashMap.Entry[] entryArray4 = hashMap0.table;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) (byte) 100);
        java.lang.Object obj8 = hashMap0.put((java.lang.Object) 100.0f, (java.lang.Object) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap0", hashMap0.property_2());
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.modCount = '4';
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        int int8 = hashMap5.size();
        java.lang.Object obj9 = hashMap0.get((java.lang.Object) int8);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.modCount;
        int int12 = hashMap10.modCount;
        system.testclass.HashMap.Entry[] entryArray13 = hashMap10.table;
        boolean boolean14 = hashMap10.isEmpty();
        java.lang.Object obj15 = hashMap0.remove((java.lang.Object) hashMap10);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        int int17 = hashMap16.modCount;
        int int18 = hashMap16.modCount;
        hashMap16.clear();
        hashMap16.clear();
        java.lang.Object obj22 = hashMap10.put((java.lang.Object) hashMap16, (java.lang.Object) '#');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap10", hashMap10.property_2());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        boolean boolean3 = hashMap2.isEmpty();
        hashMap2.clear();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        int int8 = hashMap5.size();
        java.lang.Object obj9 = hashMap2.remove((java.lang.Object) hashMap5);
        hashMap5.modCount = (byte) -1;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap(0, 100.0f);
        hashMap14.modCount = (-1);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap((int) '4', (float) 10L);
        boolean boolean20 = hashMap19.isEmpty();
        java.lang.Object obj21 = hashMap5.put((java.lang.Object) (-1), (java.lang.Object) hashMap19);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap5", hashMap5.property_2());
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        int int6 = hashMap4.size();
        hashMap4.modCount = '4';
        java.lang.Object obj9 = hashMap0.remove((java.lang.Object) hashMap4);
        java.lang.Object obj11 = hashMap4.remove((java.lang.Object) (-1.0d));
        int int12 = hashMap4.size();
        boolean boolean13 = hashMap4.isEmpty();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        boolean boolean15 = hashMap14.isEmpty();
        int int16 = hashMap14.size();
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        int int18 = hashMap17.modCount;
        int int19 = hashMap17.modCount;
        int int20 = hashMap17.size();
        system.testclass.HashMap.Entry[] entryArray21 = hashMap17.table;
        hashMap14.table = entryArray21;
        java.lang.Object obj24 = hashMap4.put((java.lang.Object) entryArray21, (java.lang.Object) false);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap4", hashMap4.property_2());
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        int int6 = hashMap4.size();
        hashMap4.modCount = '4';
        java.lang.Object obj9 = hashMap0.remove((java.lang.Object) hashMap4);
        java.lang.Object obj11 = hashMap4.remove((java.lang.Object) (-1.0d));
        int int12 = hashMap4.size();
        boolean boolean13 = hashMap4.isEmpty();
        int int14 = hashMap4.modCount;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        int int17 = hashMap15.modCount;
        hashMap15.clear();
        hashMap15.clear();
        system.testclass.HashMap.Entry[] entryArray20 = hashMap15.table;
        hashMap4.table = entryArray20;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        boolean boolean24 = hashMap23.isEmpty();
        int int25 = hashMap23.size();
        hashMap23.modCount = '4';
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        int int29 = hashMap28.modCount;
        int int30 = hashMap28.modCount;
        int int31 = hashMap28.size();
        java.lang.Object obj32 = hashMap23.get((java.lang.Object) int31);
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        int int34 = hashMap33.modCount;
        int int35 = hashMap33.modCount;
        system.testclass.HashMap.Entry[] entryArray36 = hashMap33.table;
        boolean boolean37 = hashMap33.isEmpty();
        java.lang.Object obj38 = hashMap23.remove((java.lang.Object) hashMap33);
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        int int40 = hashMap39.modCount;
        int int41 = hashMap39.modCount;
        int int42 = hashMap39.size();
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap();
        int int44 = hashMap43.modCount;
        int int45 = hashMap43.modCount;
        system.testclass.HashMap.Entry[] entryArray46 = hashMap43.table;
        boolean boolean47 = hashMap43.isEmpty();
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap();
        boolean boolean49 = hashMap48.isEmpty();
        int int50 = hashMap48.size();
        system.testclass.HashMap hashMap53 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap54 = new system.testclass.HashMap();
        int int55 = hashMap54.modCount;
        int int56 = hashMap54.modCount;
        system.testclass.HashMap.Entry[] entryArray57 = hashMap54.table;
        java.lang.Object obj58 = hashMap53.get((java.lang.Object) entryArray57);
        java.lang.Object obj59 = hashMap48.get((java.lang.Object) entryArray57);
        hashMap43.table = entryArray57;
        hashMap39.table = entryArray57;
        hashMap23.table = entryArray57;
        java.lang.Object obj63 = hashMap4.put((java.lang.Object) (short) -1, (java.lang.Object) hashMap23);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap4", hashMap4.property_2());
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        system.testclass.HashMap.Entry[] entryArray6 = hashMap3.table;
        java.lang.Object obj7 = hashMap2.get((java.lang.Object) entryArray6);
        int int8 = hashMap2.size();
        int int9 = hashMap2.modCount;
        hashMap2.clear();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        int int13 = hashMap11.modCount;
        int int14 = hashMap11.size();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        int int17 = hashMap15.modCount;
        system.testclass.HashMap.Entry[] entryArray18 = hashMap15.table;
        boolean boolean19 = hashMap15.isEmpty();
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        boolean boolean21 = hashMap20.isEmpty();
        int int22 = hashMap20.size();
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        int int27 = hashMap26.modCount;
        int int28 = hashMap26.modCount;
        system.testclass.HashMap.Entry[] entryArray29 = hashMap26.table;
        java.lang.Object obj30 = hashMap25.get((java.lang.Object) entryArray29);
        java.lang.Object obj31 = hashMap20.get((java.lang.Object) entryArray29);
        hashMap15.table = entryArray29;
        hashMap11.table = entryArray29;
        java.lang.Object obj35 = hashMap11.get((java.lang.Object) (short) 10);
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        int int37 = hashMap36.modCount;
        int int38 = hashMap36.modCount;
        int int39 = hashMap36.size();
        system.testclass.HashMap.Entry[] entryArray40 = hashMap36.table;
        hashMap36.clear();
        int int42 = hashMap36.size();
        java.lang.Object obj43 = hashMap2.put(obj35, (java.lang.Object) hashMap36);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        int int6 = hashMap3.size();
        system.testclass.HashMap.Entry[] entryArray7 = hashMap3.table;
        hashMap0.table = entryArray7;
        system.testclass.HashMap.Entry[] entryArray9 = hashMap0.table;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap((int) (byte) 1);
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap11);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap(0, (float) 10L);
        int int16 = hashMap15.size();
        int int17 = hashMap15.modCount;
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap(0, (float) 10L);
        int int21 = hashMap20.size();
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        int int23 = hashMap22.modCount;
        int int24 = hashMap22.modCount;
        system.testclass.HashMap.Entry[] entryArray25 = hashMap22.table;
        hashMap20.table = entryArray25;
        java.lang.Object obj27 = hashMap15.get((java.lang.Object) hashMap20);
        hashMap15.clear();
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        boolean boolean30 = hashMap29.isEmpty();
        boolean boolean31 = hashMap29.isEmpty();
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        boolean boolean33 = hashMap32.isEmpty();
        int int34 = hashMap32.size();
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        int int39 = hashMap38.modCount;
        int int40 = hashMap38.modCount;
        system.testclass.HashMap.Entry[] entryArray41 = hashMap38.table;
        java.lang.Object obj42 = hashMap37.get((java.lang.Object) entryArray41);
        java.lang.Object obj43 = hashMap32.get((java.lang.Object) entryArray41);
        hashMap29.table = entryArray41;
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        int int46 = hashMap45.modCount;
        int int47 = hashMap45.modCount;
        system.testclass.HashMap.Entry[] entryArray48 = hashMap45.table;
        hashMap45.clear();
        system.testclass.HashMap.Entry[] entryArray50 = hashMap45.table;
        hashMap29.table = entryArray50;
        java.lang.Object obj52 = hashMap15.get((java.lang.Object) hashMap29);
        system.testclass.HashMap hashMap53 = new system.testclass.HashMap();
        int int54 = hashMap53.modCount;
        int int55 = hashMap53.modCount;
        system.testclass.HashMap hashMap56 = new system.testclass.HashMap();
        boolean boolean57 = hashMap56.isEmpty();
        int int58 = hashMap56.size();
        system.testclass.HashMap hashMap61 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap62 = new system.testclass.HashMap();
        int int63 = hashMap62.modCount;
        int int64 = hashMap62.modCount;
        system.testclass.HashMap.Entry[] entryArray65 = hashMap62.table;
        java.lang.Object obj66 = hashMap61.get((java.lang.Object) entryArray65);
        java.lang.Object obj67 = hashMap56.get((java.lang.Object) entryArray65);
        hashMap53.table = entryArray65;
        hashMap15.table = entryArray65;
        system.testclass.HashMap hashMap71 = new system.testclass.HashMap((int) '4');
        hashMap71.modCount = (byte) -1;
        java.lang.Class<?> wildcardClass74 = hashMap71.getClass();
        java.lang.Object obj75 = hashMap0.put((java.lang.Object) entryArray65, (java.lang.Object) wildcardClass74);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap0", hashMap0.property_2());
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        boolean boolean3 = hashMap2.isEmpty();
        hashMap2.clear();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.modCount;
        int int8 = hashMap6.modCount;
        hashMap6.clear();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        int int12 = hashMap10.size();
        hashMap10.modCount = '4';
        java.lang.Object obj15 = hashMap6.remove((java.lang.Object) hashMap10);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj19 = hashMap10.remove((java.lang.Object) 0);
        java.lang.Object obj20 = hashMap2.put((java.lang.Object) (byte) 100, (java.lang.Object) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        int int6 = hashMap4.size();
        hashMap4.modCount = '4';
        java.lang.Object obj9 = hashMap0.remove((java.lang.Object) hashMap4);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj13 = hashMap4.remove((java.lang.Object) 0);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        boolean boolean15 = hashMap14.isEmpty();
        int int16 = hashMap14.size();
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        int int21 = hashMap20.modCount;
        int int22 = hashMap20.modCount;
        system.testclass.HashMap.Entry[] entryArray23 = hashMap20.table;
        java.lang.Object obj24 = hashMap19.get((java.lang.Object) entryArray23);
        java.lang.Object obj25 = hashMap14.get((java.lang.Object) entryArray23);
        java.lang.Object obj26 = hashMap4.remove((java.lang.Object) hashMap14);
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap(0, 100.0f);
        hashMap29.modCount = (-1);
        hashMap29.clear();
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        int int34 = hashMap33.modCount;
        int int35 = hashMap33.modCount;
        hashMap33.clear();
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        boolean boolean38 = hashMap37.isEmpty();
        int int39 = hashMap37.size();
        hashMap37.modCount = '4';
        java.lang.Object obj42 = hashMap33.remove((java.lang.Object) hashMap37);
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj46 = hashMap37.remove((java.lang.Object) 0);
        java.lang.Object obj48 = hashMap37.get((java.lang.Object) '#');
        system.testclass.HashMap hashMap51 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap();
        int int53 = hashMap52.modCount;
        int int54 = hashMap52.modCount;
        system.testclass.HashMap.Entry[] entryArray55 = hashMap52.table;
        java.lang.Object obj56 = hashMap51.get((java.lang.Object) entryArray55);
        hashMap37.table = entryArray55;
        java.lang.Object obj58 = hashMap14.put((java.lang.Object) hashMap29, (java.lang.Object) hashMap37);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap14", hashMap14.property_2());
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) ' ');
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        int int3 = hashMap2.modCount;
        int int4 = hashMap2.modCount;
        hashMap2.clear();
        hashMap2.clear();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap(0, (float) 10L);
        int int10 = hashMap9.size();
        int int11 = hashMap9.modCount;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap(0, (float) 10L);
        int int15 = hashMap14.size();
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        int int17 = hashMap16.modCount;
        int int18 = hashMap16.modCount;
        system.testclass.HashMap.Entry[] entryArray19 = hashMap16.table;
        hashMap14.table = entryArray19;
        java.lang.Object obj21 = hashMap9.get((java.lang.Object) hashMap14);
        int int22 = hashMap14.modCount;
        java.lang.Object obj23 = hashMap1.put((java.lang.Object) hashMap2, (java.lang.Object) int22);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap1", hashMap1.property_2());
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        int int6 = hashMap4.size();
        hashMap4.modCount = '4';
        java.lang.Object obj9 = hashMap0.remove((java.lang.Object) hashMap4);
        java.lang.Object obj11 = hashMap4.remove((java.lang.Object) (-1.0d));
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap((int) '#', (float) 'a');
        hashMap17.modCount = 100;
        int int20 = hashMap17.size();
        java.lang.Object obj21 = hashMap14.remove((java.lang.Object) int20);
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap(0, (float) 10L);
        int int25 = hashMap24.size();
        int int26 = hashMap24.modCount;
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap(0, (float) 10L);
        int int30 = hashMap29.size();
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        int int32 = hashMap31.modCount;
        int int33 = hashMap31.modCount;
        system.testclass.HashMap.Entry[] entryArray34 = hashMap31.table;
        hashMap29.table = entryArray34;
        java.lang.Object obj36 = hashMap24.get((java.lang.Object) hashMap29);
        hashMap24.clear();
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        boolean boolean39 = hashMap38.isEmpty();
        boolean boolean40 = hashMap38.isEmpty();
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        boolean boolean42 = hashMap41.isEmpty();
        int int43 = hashMap41.size();
        system.testclass.HashMap hashMap46 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap();
        int int48 = hashMap47.modCount;
        int int49 = hashMap47.modCount;
        system.testclass.HashMap.Entry[] entryArray50 = hashMap47.table;
        java.lang.Object obj51 = hashMap46.get((java.lang.Object) entryArray50);
        java.lang.Object obj52 = hashMap41.get((java.lang.Object) entryArray50);
        hashMap38.table = entryArray50;
        system.testclass.HashMap hashMap54 = new system.testclass.HashMap();
        int int55 = hashMap54.modCount;
        int int56 = hashMap54.modCount;
        system.testclass.HashMap.Entry[] entryArray57 = hashMap54.table;
        hashMap54.clear();
        system.testclass.HashMap.Entry[] entryArray59 = hashMap54.table;
        hashMap38.table = entryArray59;
        java.lang.Object obj61 = hashMap24.get((java.lang.Object) hashMap38);
        java.lang.Object obj62 = hashMap4.put((java.lang.Object) int20, (java.lang.Object) hashMap38);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap4", hashMap4.property_2());
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.modCount = '4';
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        int int8 = hashMap5.size();
        java.lang.Object obj9 = hashMap0.get((java.lang.Object) int8);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.modCount;
        int int12 = hashMap10.modCount;
        system.testclass.HashMap.Entry[] entryArray13 = hashMap10.table;
        boolean boolean14 = hashMap10.isEmpty();
        java.lang.Object obj15 = hashMap0.remove((java.lang.Object) hashMap10);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        int int17 = hashMap16.modCount;
        int int18 = hashMap16.modCount;
        int int19 = hashMap16.size();
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        int int21 = hashMap20.modCount;
        int int22 = hashMap20.modCount;
        system.testclass.HashMap.Entry[] entryArray23 = hashMap20.table;
        boolean boolean24 = hashMap20.isEmpty();
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        boolean boolean26 = hashMap25.isEmpty();
        int int27 = hashMap25.size();
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        int int32 = hashMap31.modCount;
        int int33 = hashMap31.modCount;
        system.testclass.HashMap.Entry[] entryArray34 = hashMap31.table;
        java.lang.Object obj35 = hashMap30.get((java.lang.Object) entryArray34);
        java.lang.Object obj36 = hashMap25.get((java.lang.Object) entryArray34);
        hashMap20.table = entryArray34;
        hashMap16.table = entryArray34;
        hashMap0.table = entryArray34;
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        boolean boolean41 = hashMap40.isEmpty();
        int int42 = hashMap40.size();
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap46 = new system.testclass.HashMap();
        int int47 = hashMap46.modCount;
        int int48 = hashMap46.modCount;
        system.testclass.HashMap.Entry[] entryArray49 = hashMap46.table;
        java.lang.Object obj50 = hashMap45.get((java.lang.Object) entryArray49);
        java.lang.Object obj51 = hashMap40.get((java.lang.Object) entryArray49);
        int int52 = hashMap40.modCount;
        hashMap40.clear();
        java.lang.Object obj55 = hashMap0.put((java.lang.Object) hashMap40, (java.lang.Object) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap0", hashMap0.property_2());
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(53, (float) 10);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        hashMap3.clear();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        int int9 = hashMap7.size();
        hashMap7.modCount = '4';
        java.lang.Object obj12 = hashMap3.remove((java.lang.Object) hashMap7);
        java.lang.Object obj14 = hashMap7.remove((java.lang.Object) (-1.0d));
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        int int17 = hashMap15.modCount;
        int int18 = hashMap15.size();
        system.testclass.HashMap.Entry[] entryArray19 = hashMap15.table;
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap(0, (float) 10L);
        int int23 = hashMap22.size();
        int int24 = hashMap22.modCount;
        system.testclass.HashMap.Entry entry25 = null;
        system.testclass.HashMap.Entry[] entryArray26 = new system.testclass.HashMap.Entry[] { entry25 };
        hashMap22.table = entryArray26;
        hashMap22.modCount = (byte) 100;
        java.lang.Object obj30 = hashMap15.get((java.lang.Object) hashMap22);
        system.testclass.HashMap.Entry[] entryArray31 = hashMap15.table;
        java.lang.Object obj32 = hashMap2.put((java.lang.Object) (-1.0d), (java.lang.Object) entryArray31);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        boolean boolean5 = hashMap3.isEmpty();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.isEmpty();
        int int8 = hashMap6.size();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        int int13 = hashMap12.modCount;
        int int14 = hashMap12.modCount;
        system.testclass.HashMap.Entry[] entryArray15 = hashMap12.table;
        java.lang.Object obj16 = hashMap11.get((java.lang.Object) entryArray15);
        java.lang.Object obj17 = hashMap6.get((java.lang.Object) entryArray15);
        hashMap3.table = entryArray15;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        int int20 = hashMap19.modCount;
        int int21 = hashMap19.modCount;
        hashMap19.clear();
        hashMap19.clear();
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.modCount;
        int int26 = hashMap24.modCount;
        system.testclass.HashMap.Entry[] entryArray27 = hashMap24.table;
        system.testclass.HashMap.Entry[] entryArray28 = hashMap24.table;
        java.lang.Object obj30 = hashMap24.get((java.lang.Object) 100);
        system.testclass.HashMap.Entry[] entryArray31 = hashMap24.table;
        java.lang.Object obj32 = hashMap19.remove((java.lang.Object) hashMap24);
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap(10);
        boolean boolean35 = hashMap34.isEmpty();
        system.testclass.HashMap.Entry[] entryArray36 = new system.testclass.HashMap.Entry[] {};
        hashMap34.table = entryArray36;
        java.lang.Object obj38 = hashMap19.get((java.lang.Object) hashMap34);
        java.lang.Object obj39 = hashMap2.put((java.lang.Object) hashMap3, obj38);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '#', (float) 'a');
        hashMap2.modCount = 100;
        int int5 = hashMap2.size();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap(0, (float) (short) 100);
        int int9 = hashMap8.modCount;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap((int) (byte) 0, (float) 1);
        java.lang.Object obj13 = hashMap2.put((java.lang.Object) int9, (java.lang.Object) hashMap12);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        int int3 = hashMap2.size();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        system.testclass.HashMap.Entry[] entryArray7 = hashMap4.table;
        hashMap2.table = entryArray7;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap(10);
        int int11 = hashMap10.modCount;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        int int13 = hashMap12.modCount;
        int int14 = hashMap12.modCount;
        int int15 = hashMap12.size();
        system.testclass.HashMap.Entry[] entryArray16 = hashMap12.table;
        hashMap12.clear();
        system.testclass.HashMap.Entry[] entryArray18 = hashMap12.table;
        java.lang.Object obj19 = hashMap10.get((java.lang.Object) hashMap12);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj23 = hashMap2.put(obj19, (java.lang.Object) 10L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        int int6 = hashMap4.size();
        hashMap4.modCount = '4';
        java.lang.Object obj9 = hashMap0.remove((java.lang.Object) hashMap4);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj13 = hashMap4.remove((java.lang.Object) 0);
        java.lang.Object obj15 = hashMap4.get((java.lang.Object) '#');
        hashMap4.modCount = (byte) -1;
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap(0, (float) 10L);
        int int21 = hashMap20.size();
        int int22 = hashMap20.modCount;
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap(0, (float) 10L);
        int int26 = hashMap25.size();
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        int int28 = hashMap27.modCount;
        int int29 = hashMap27.modCount;
        system.testclass.HashMap.Entry[] entryArray30 = hashMap27.table;
        hashMap25.table = entryArray30;
        java.lang.Object obj32 = hashMap20.get((java.lang.Object) hashMap25);
        hashMap20.clear();
        java.lang.Object obj34 = null;
        java.lang.Object obj35 = hashMap4.put((java.lang.Object) hashMap20, obj34);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap4", hashMap4.property_2());
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        int int3 = hashMap2.size();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        system.testclass.HashMap.Entry[] entryArray7 = hashMap4.table;
        hashMap2.table = entryArray7;
        int int9 = hashMap2.modCount;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.modCount;
        int int12 = hashMap10.modCount;
        hashMap10.clear();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        boolean boolean15 = hashMap14.isEmpty();
        int int16 = hashMap14.size();
        hashMap14.modCount = '4';
        java.lang.Object obj19 = hashMap10.remove((java.lang.Object) hashMap14);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj23 = hashMap14.remove((java.lang.Object) 0);
        java.lang.Object obj25 = hashMap14.get((java.lang.Object) '#');
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        boolean boolean27 = hashMap26.isEmpty();
        java.lang.Object obj28 = hashMap14.get((java.lang.Object) boolean27);
        hashMap14.modCount = 0;
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap(10);
        boolean boolean33 = hashMap32.isEmpty();
        system.testclass.HashMap.Entry[] entryArray34 = new system.testclass.HashMap.Entry[] {};
        hashMap32.table = entryArray34;
        java.lang.Object obj36 = hashMap14.remove((java.lang.Object) entryArray34);
        system.testclass.HashMap.Entry[] entryArray37 = hashMap14.table;
        system.testclass.HashMap.Entry[] entryArray38 = hashMap14.table;
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap(0, (float) 10L);
        int int42 = hashMap41.size();
        int int43 = hashMap41.modCount;
        system.testclass.HashMap.Entry[] entryArray44 = hashMap41.table;
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap(0, (float) 10L);
        int int48 = hashMap47.size();
        int int49 = hashMap47.modCount;
        system.testclass.HashMap.Entry[] entryArray50 = hashMap47.table;
        hashMap41.table = entryArray50;
        system.testclass.HashMap hashMap54 = new system.testclass.HashMap(0, (float) 10L);
        int int55 = hashMap54.size();
        int int56 = hashMap54.modCount;
        system.testclass.HashMap.Entry[] entryArray57 = hashMap54.table;
        system.testclass.HashMap hashMap60 = new system.testclass.HashMap(0, (float) 10L);
        int int61 = hashMap60.size();
        int int62 = hashMap60.modCount;
        system.testclass.HashMap.Entry[] entryArray63 = hashMap60.table;
        hashMap54.table = entryArray63;
        hashMap41.table = entryArray63;
        java.lang.Object obj66 = hashMap2.put((java.lang.Object) hashMap14, (java.lang.Object) hashMap41);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) '4');
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        boolean boolean3 = hashMap2.isEmpty();
        int int4 = hashMap2.size();
        hashMap2.modCount = '4';
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        int int9 = hashMap7.modCount;
        hashMap7.clear();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        boolean boolean12 = hashMap11.isEmpty();
        int int13 = hashMap11.size();
        hashMap11.modCount = '4';
        java.lang.Object obj16 = hashMap7.remove((java.lang.Object) hashMap11);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj20 = hashMap11.remove((java.lang.Object) 0);
        java.lang.Object obj22 = hashMap11.get((java.lang.Object) '#');
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        int int27 = hashMap26.modCount;
        int int28 = hashMap26.modCount;
        system.testclass.HashMap.Entry[] entryArray29 = hashMap26.table;
        java.lang.Object obj30 = hashMap25.get((java.lang.Object) entryArray29);
        hashMap11.table = entryArray29;
        hashMap2.table = entryArray29;
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        boolean boolean34 = hashMap33.isEmpty();
        int int35 = hashMap33.size();
        hashMap33.modCount = '4';
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        int int39 = hashMap38.modCount;
        int int40 = hashMap38.modCount;
        hashMap38.clear();
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap();
        boolean boolean43 = hashMap42.isEmpty();
        int int44 = hashMap42.size();
        hashMap42.modCount = '4';
        java.lang.Object obj47 = hashMap38.remove((java.lang.Object) hashMap42);
        system.testclass.HashMap hashMap50 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj51 = hashMap42.remove((java.lang.Object) 0);
        java.lang.Object obj53 = hashMap42.get((java.lang.Object) '#');
        system.testclass.HashMap hashMap56 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap57 = new system.testclass.HashMap();
        int int58 = hashMap57.modCount;
        int int59 = hashMap57.modCount;
        system.testclass.HashMap.Entry[] entryArray60 = hashMap57.table;
        java.lang.Object obj61 = hashMap56.get((java.lang.Object) entryArray60);
        hashMap42.table = entryArray60;
        hashMap33.table = entryArray60;
        hashMap2.table = entryArray60;
        java.lang.Object obj65 = hashMap1.get((java.lang.Object) hashMap2);
        system.testclass.HashMap hashMap67 = new system.testclass.HashMap((int) '4');
        int int68 = hashMap67.size();
        system.testclass.HashMap hashMap71 = new system.testclass.HashMap(0, (float) 10L);
        int int72 = hashMap71.size();
        int int73 = hashMap71.modCount;
        system.testclass.HashMap.Entry entry74 = null;
        system.testclass.HashMap.Entry[] entryArray75 = new system.testclass.HashMap.Entry[] { entry74 };
        hashMap71.table = entryArray75;
        hashMap71.modCount = (byte) 100;
        java.lang.Object obj79 = hashMap67.get((java.lang.Object) hashMap71);
        system.testclass.HashMap hashMap82 = new system.testclass.HashMap((int) ' ', (float) 1);
        java.lang.Object obj83 = hashMap1.put((java.lang.Object) hashMap71, (java.lang.Object) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap1", hashMap1.property_2());
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        hashMap0.clear();
        hashMap0.modCount = (short) 1;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap(1);
        java.lang.Object obj9 = hashMap0.remove((java.lang.Object) hashMap8);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.modCount;
        int int12 = hashMap10.modCount;
        hashMap10.clear();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        boolean boolean15 = hashMap14.isEmpty();
        int int16 = hashMap14.size();
        hashMap14.modCount = '4';
        java.lang.Object obj19 = hashMap10.remove((java.lang.Object) hashMap14);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj23 = hashMap14.remove((java.lang.Object) 0);
        java.lang.Object obj25 = hashMap14.get((java.lang.Object) '#');
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        boolean boolean27 = hashMap26.isEmpty();
        java.lang.Object obj28 = hashMap14.get((java.lang.Object) boolean27);
        hashMap14.modCount = 0;
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap(10);
        boolean boolean33 = hashMap32.isEmpty();
        system.testclass.HashMap.Entry[] entryArray34 = new system.testclass.HashMap.Entry[] {};
        hashMap32.table = entryArray34;
        java.lang.Object obj36 = hashMap14.remove((java.lang.Object) entryArray34);
        system.testclass.HashMap.Entry[] entryArray37 = hashMap14.table;
        java.lang.Object obj38 = null;
        java.lang.Object obj39 = hashMap0.put((java.lang.Object) hashMap14, obj38);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap0", hashMap0.property_2());
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        int int3 = hashMap0.modCount;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap(53, (float) (short) 100);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap(0, (float) 10L);
        int int10 = hashMap9.size();
        int int11 = hashMap9.modCount;
        system.testclass.HashMap.Entry entry12 = null;
        system.testclass.HashMap.Entry[] entryArray13 = new system.testclass.HashMap.Entry[] { entry12 };
        hashMap9.table = entryArray13;
        system.testclass.HashMap.Entry[] entryArray15 = hashMap9.table;
        hashMap9.clear();
        java.lang.Object obj17 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap9);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap0", hashMap0.property_2());
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.modCount = '4';
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        hashMap5.clear();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        int int11 = hashMap9.size();
        hashMap9.modCount = '4';
        java.lang.Object obj14 = hashMap5.remove((java.lang.Object) hashMap9);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj18 = hashMap9.remove((java.lang.Object) 0);
        java.lang.Object obj20 = hashMap9.get((java.lang.Object) '#');
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.modCount;
        int int26 = hashMap24.modCount;
        system.testclass.HashMap.Entry[] entryArray27 = hashMap24.table;
        java.lang.Object obj28 = hashMap23.get((java.lang.Object) entryArray27);
        hashMap9.table = entryArray27;
        hashMap0.table = entryArray27;
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap(0, (float) 10L);
        int int35 = hashMap34.size();
        int int36 = hashMap34.modCount;
        system.testclass.HashMap.Entry entry37 = null;
        system.testclass.HashMap.Entry[] entryArray38 = new system.testclass.HashMap.Entry[] { entry37 };
        hashMap34.table = entryArray38;
        hashMap34.modCount = (byte) 100;
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap();
        int int43 = hashMap42.modCount;
        int int44 = hashMap42.modCount;
        hashMap42.clear();
        system.testclass.HashMap hashMap46 = new system.testclass.HashMap();
        boolean boolean47 = hashMap46.isEmpty();
        int int48 = hashMap46.size();
        hashMap46.modCount = '4';
        java.lang.Object obj51 = hashMap42.remove((java.lang.Object) hashMap46);
        system.testclass.HashMap hashMap54 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj55 = hashMap46.remove((java.lang.Object) 0);
        java.lang.Object obj57 = hashMap46.get((java.lang.Object) '#');
        system.testclass.HashMap hashMap58 = new system.testclass.HashMap();
        boolean boolean59 = hashMap58.isEmpty();
        java.lang.Object obj60 = hashMap46.get((java.lang.Object) boolean59);
        hashMap46.modCount = 0;
        system.testclass.HashMap hashMap64 = new system.testclass.HashMap(10);
        boolean boolean65 = hashMap64.isEmpty();
        system.testclass.HashMap.Entry[] entryArray66 = new system.testclass.HashMap.Entry[] {};
        hashMap64.table = entryArray66;
        java.lang.Object obj68 = hashMap46.remove((java.lang.Object) entryArray66);
        hashMap34.table = entryArray66;
        java.lang.Class<?> wildcardClass70 = hashMap34.getClass();
        java.lang.Object obj71 = hashMap0.put((java.lang.Object) 2, (java.lang.Object) wildcardClass70);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap0", hashMap0.property_2());
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        boolean boolean4 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        int int8 = hashMap5.size();
        system.testclass.HashMap.Entry[] entryArray9 = hashMap5.table;
        hashMap5.clear();
        system.testclass.HashMap.Entry[] entryArray11 = hashMap5.table;
        java.lang.Class<?> wildcardClass12 = entryArray11.getClass();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        int int17 = hashMap16.modCount;
        int int18 = hashMap16.modCount;
        system.testclass.HashMap.Entry[] entryArray19 = hashMap16.table;
        java.lang.Object obj20 = hashMap15.get((java.lang.Object) entryArray19);
        int int21 = hashMap15.size();
        int int22 = hashMap15.modCount;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        int int24 = hashMap23.modCount;
        int int25 = hashMap23.modCount;
        system.testclass.HashMap.Entry[] entryArray26 = hashMap23.table;
        hashMap15.table = entryArray26;
        java.lang.Object obj28 = hashMap0.put((java.lang.Object) wildcardClass12, (java.lang.Object) entryArray26);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap0", hashMap0.property_2());
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        int int6 = hashMap4.size();
        hashMap4.modCount = '4';
        java.lang.Object obj9 = hashMap0.remove((java.lang.Object) hashMap4);
        java.lang.Object obj11 = hashMap4.remove((java.lang.Object) (-1.0d));
        int int12 = hashMap4.size();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        int int17 = hashMap16.modCount;
        int int18 = hashMap16.modCount;
        system.testclass.HashMap.Entry[] entryArray19 = hashMap16.table;
        java.lang.Object obj20 = hashMap15.get((java.lang.Object) entryArray19);
        int int21 = hashMap15.size();
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        boolean boolean23 = hashMap22.isEmpty();
        int int24 = hashMap22.size();
        hashMap22.modCount = '4';
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        int int28 = hashMap27.modCount;
        int int29 = hashMap27.modCount;
        hashMap27.clear();
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        boolean boolean32 = hashMap31.isEmpty();
        int int33 = hashMap31.size();
        hashMap31.modCount = '4';
        java.lang.Object obj36 = hashMap27.remove((java.lang.Object) hashMap31);
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj40 = hashMap31.remove((java.lang.Object) 0);
        java.lang.Object obj42 = hashMap31.get((java.lang.Object) '#');
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap46 = new system.testclass.HashMap();
        int int47 = hashMap46.modCount;
        int int48 = hashMap46.modCount;
        system.testclass.HashMap.Entry[] entryArray49 = hashMap46.table;
        java.lang.Object obj50 = hashMap45.get((java.lang.Object) entryArray49);
        hashMap31.table = entryArray49;
        hashMap22.table = entryArray49;
        system.testclass.HashMap hashMap53 = new system.testclass.HashMap();
        boolean boolean54 = hashMap53.isEmpty();
        int int55 = hashMap53.size();
        hashMap53.modCount = '4';
        system.testclass.HashMap hashMap58 = new system.testclass.HashMap();
        int int59 = hashMap58.modCount;
        int int60 = hashMap58.modCount;
        hashMap58.clear();
        system.testclass.HashMap hashMap62 = new system.testclass.HashMap();
        boolean boolean63 = hashMap62.isEmpty();
        int int64 = hashMap62.size();
        hashMap62.modCount = '4';
        java.lang.Object obj67 = hashMap58.remove((java.lang.Object) hashMap62);
        system.testclass.HashMap hashMap70 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj71 = hashMap62.remove((java.lang.Object) 0);
        java.lang.Object obj73 = hashMap62.get((java.lang.Object) '#');
        system.testclass.HashMap hashMap76 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap77 = new system.testclass.HashMap();
        int int78 = hashMap77.modCount;
        int int79 = hashMap77.modCount;
        system.testclass.HashMap.Entry[] entryArray80 = hashMap77.table;
        java.lang.Object obj81 = hashMap76.get((java.lang.Object) entryArray80);
        hashMap62.table = entryArray80;
        hashMap53.table = entryArray80;
        hashMap22.table = entryArray80;
        hashMap15.table = entryArray80;
        hashMap4.table = entryArray80;
        java.lang.Object obj88 = hashMap4.get((java.lang.Object) (byte) -1);
        java.lang.Object obj91 = hashMap4.put((java.lang.Object) (byte) 1, (java.lang.Object) 0.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap4", hashMap4.property_2());
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        int int3 = hashMap2.size();
        int int4 = hashMap2.modCount;
        hashMap2.modCount = (byte) -1;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        int int9 = hashMap7.size();
        hashMap7.modCount = '4';
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        int int13 = hashMap12.modCount;
        int int14 = hashMap12.modCount;
        hashMap12.clear();
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        boolean boolean17 = hashMap16.isEmpty();
        int int18 = hashMap16.size();
        hashMap16.modCount = '4';
        java.lang.Object obj21 = hashMap12.remove((java.lang.Object) hashMap16);
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj25 = hashMap16.remove((java.lang.Object) 0);
        java.lang.Object obj27 = hashMap16.get((java.lang.Object) '#');
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        int int32 = hashMap31.modCount;
        int int33 = hashMap31.modCount;
        system.testclass.HashMap.Entry[] entryArray34 = hashMap31.table;
        java.lang.Object obj35 = hashMap30.get((java.lang.Object) entryArray34);
        hashMap16.table = entryArray34;
        hashMap7.table = entryArray34;
        hashMap7.clear();
        hashMap7.modCount = '4';
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        int int42 = hashMap41.modCount;
        int int43 = hashMap41.modCount;
        system.testclass.HashMap.Entry[] entryArray44 = hashMap41.table;
        system.testclass.HashMap.Entry[] entryArray45 = hashMap41.table;
        java.lang.Object obj47 = hashMap41.get((java.lang.Object) 100);
        system.testclass.HashMap.Entry[] entryArray48 = hashMap41.table;
        int int49 = hashMap41.modCount;
        java.lang.Object obj50 = hashMap2.put((java.lang.Object) '4', (java.lang.Object) hashMap41);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        int int3 = hashMap2.size();
        int int4 = hashMap2.modCount;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap(0, (float) 10L);
        int int8 = hashMap7.size();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        int int11 = hashMap9.modCount;
        system.testclass.HashMap.Entry[] entryArray12 = hashMap9.table;
        hashMap7.table = entryArray12;
        java.lang.Object obj14 = hashMap2.get((java.lang.Object) hashMap7);
        hashMap2.clear();
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        boolean boolean17 = hashMap16.isEmpty();
        boolean boolean18 = hashMap16.isEmpty();
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        boolean boolean20 = hashMap19.isEmpty();
        int int21 = hashMap19.size();
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        int int26 = hashMap25.modCount;
        int int27 = hashMap25.modCount;
        system.testclass.HashMap.Entry[] entryArray28 = hashMap25.table;
        java.lang.Object obj29 = hashMap24.get((java.lang.Object) entryArray28);
        java.lang.Object obj30 = hashMap19.get((java.lang.Object) entryArray28);
        hashMap16.table = entryArray28;
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        int int33 = hashMap32.modCount;
        int int34 = hashMap32.modCount;
        system.testclass.HashMap.Entry[] entryArray35 = hashMap32.table;
        hashMap32.clear();
        system.testclass.HashMap.Entry[] entryArray37 = hashMap32.table;
        hashMap16.table = entryArray37;
        java.lang.Object obj39 = hashMap2.get((java.lang.Object) hashMap16);
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        int int41 = hashMap40.modCount;
        int int42 = hashMap40.modCount;
        hashMap40.clear();
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap();
        boolean boolean45 = hashMap44.isEmpty();
        int int46 = hashMap44.size();
        hashMap44.modCount = '4';
        java.lang.Object obj49 = hashMap40.remove((java.lang.Object) hashMap44);
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj53 = hashMap44.remove((java.lang.Object) 0);
        java.lang.Object obj55 = hashMap44.get((java.lang.Object) '#');
        system.testclass.HashMap hashMap58 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap59 = new system.testclass.HashMap();
        int int60 = hashMap59.modCount;
        int int61 = hashMap59.modCount;
        system.testclass.HashMap.Entry[] entryArray62 = hashMap59.table;
        java.lang.Object obj63 = hashMap58.get((java.lang.Object) entryArray62);
        hashMap44.table = entryArray62;
        hashMap2.table = entryArray62;
        system.testclass.HashMap hashMap67 = new system.testclass.HashMap((int) '4');
        int int68 = hashMap67.size();
        system.testclass.HashMap hashMap71 = new system.testclass.HashMap(0, (float) 10L);
        int int72 = hashMap71.size();
        int int73 = hashMap71.modCount;
        system.testclass.HashMap.Entry entry74 = null;
        system.testclass.HashMap.Entry[] entryArray75 = new system.testclass.HashMap.Entry[] { entry74 };
        hashMap71.table = entryArray75;
        hashMap71.modCount = (byte) 100;
        java.lang.Object obj79 = hashMap67.get((java.lang.Object) hashMap71);
        java.lang.Object obj80 = hashMap2.remove((java.lang.Object) hashMap67);
        system.testclass.HashMap hashMap81 = new system.testclass.HashMap();
        hashMap81.modCount = 0;
        java.lang.Object obj85 = hashMap67.put((java.lang.Object) hashMap81, (java.lang.Object) 10L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap67", hashMap67.property_2());
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', 100.0f);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap(52);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.modCount;
        int int10 = hashMap8.modCount;
        system.testclass.HashMap.Entry[] entryArray11 = hashMap8.table;
        java.lang.Object obj12 = hashMap7.get((java.lang.Object) entryArray11);
        int int13 = hashMap7.size();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        boolean boolean15 = hashMap14.isEmpty();
        int int16 = hashMap14.size();
        hashMap14.modCount = '4';
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        int int20 = hashMap19.modCount;
        int int21 = hashMap19.modCount;
        hashMap19.clear();
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        boolean boolean24 = hashMap23.isEmpty();
        int int25 = hashMap23.size();
        hashMap23.modCount = '4';
        java.lang.Object obj28 = hashMap19.remove((java.lang.Object) hashMap23);
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj32 = hashMap23.remove((java.lang.Object) 0);
        java.lang.Object obj34 = hashMap23.get((java.lang.Object) '#');
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        int int39 = hashMap38.modCount;
        int int40 = hashMap38.modCount;
        system.testclass.HashMap.Entry[] entryArray41 = hashMap38.table;
        java.lang.Object obj42 = hashMap37.get((java.lang.Object) entryArray41);
        hashMap23.table = entryArray41;
        hashMap14.table = entryArray41;
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        boolean boolean46 = hashMap45.isEmpty();
        int int47 = hashMap45.size();
        hashMap45.modCount = '4';
        system.testclass.HashMap hashMap50 = new system.testclass.HashMap();
        int int51 = hashMap50.modCount;
        int int52 = hashMap50.modCount;
        hashMap50.clear();
        system.testclass.HashMap hashMap54 = new system.testclass.HashMap();
        boolean boolean55 = hashMap54.isEmpty();
        int int56 = hashMap54.size();
        hashMap54.modCount = '4';
        java.lang.Object obj59 = hashMap50.remove((java.lang.Object) hashMap54);
        system.testclass.HashMap hashMap62 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj63 = hashMap54.remove((java.lang.Object) 0);
        java.lang.Object obj65 = hashMap54.get((java.lang.Object) '#');
        system.testclass.HashMap hashMap68 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap69 = new system.testclass.HashMap();
        int int70 = hashMap69.modCount;
        int int71 = hashMap69.modCount;
        system.testclass.HashMap.Entry[] entryArray72 = hashMap69.table;
        java.lang.Object obj73 = hashMap68.get((java.lang.Object) entryArray72);
        hashMap54.table = entryArray72;
        hashMap45.table = entryArray72;
        hashMap14.table = entryArray72;
        hashMap7.table = entryArray72;
        hashMap4.table = entryArray72;
        int int79 = hashMap4.modCount;
        system.testclass.HashMap hashMap80 = new system.testclass.HashMap();
        int int81 = hashMap80.modCount;
        int int82 = hashMap80.modCount;
        hashMap80.clear();
        hashMap80.clear();
        system.testclass.HashMap.Entry[] entryArray85 = hashMap80.table;
        system.testclass.HashMap hashMap88 = new system.testclass.HashMap(0, 100.0f);
        hashMap88.modCount = (-1);
        hashMap88.clear();
        system.testclass.HashMap.Entry[] entryArray92 = hashMap88.table;
        java.lang.Object obj93 = hashMap80.remove((java.lang.Object) entryArray92);
        java.lang.Object obj94 = hashMap2.put((java.lang.Object) hashMap4, (java.lang.Object) entryArray92);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        int int3 = hashMap2.size();
        int int4 = hashMap2.modCount;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        hashMap5.modCount = 0;
        hashMap5.modCount = 100;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap((int) ' ', (float) 1);
        java.lang.Object obj13 = hashMap2.put((java.lang.Object) hashMap5, (java.lang.Object) 1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        boolean boolean2 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap((int) '4');
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        boolean boolean6 = hashMap5.isEmpty();
        int int7 = hashMap5.size();
        hashMap5.modCount = '4';
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.modCount;
        int int12 = hashMap10.modCount;
        hashMap10.clear();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        boolean boolean15 = hashMap14.isEmpty();
        int int16 = hashMap14.size();
        hashMap14.modCount = '4';
        java.lang.Object obj19 = hashMap10.remove((java.lang.Object) hashMap14);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj23 = hashMap14.remove((java.lang.Object) 0);
        java.lang.Object obj25 = hashMap14.get((java.lang.Object) '#');
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        int int30 = hashMap29.modCount;
        int int31 = hashMap29.modCount;
        system.testclass.HashMap.Entry[] entryArray32 = hashMap29.table;
        java.lang.Object obj33 = hashMap28.get((java.lang.Object) entryArray32);
        hashMap14.table = entryArray32;
        hashMap5.table = entryArray32;
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        boolean boolean37 = hashMap36.isEmpty();
        int int38 = hashMap36.size();
        hashMap36.modCount = '4';
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        int int42 = hashMap41.modCount;
        int int43 = hashMap41.modCount;
        hashMap41.clear();
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        boolean boolean46 = hashMap45.isEmpty();
        int int47 = hashMap45.size();
        hashMap45.modCount = '4';
        java.lang.Object obj50 = hashMap41.remove((java.lang.Object) hashMap45);
        system.testclass.HashMap hashMap53 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj54 = hashMap45.remove((java.lang.Object) 0);
        java.lang.Object obj56 = hashMap45.get((java.lang.Object) '#');
        system.testclass.HashMap hashMap59 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap60 = new system.testclass.HashMap();
        int int61 = hashMap60.modCount;
        int int62 = hashMap60.modCount;
        system.testclass.HashMap.Entry[] entryArray63 = hashMap60.table;
        java.lang.Object obj64 = hashMap59.get((java.lang.Object) entryArray63);
        hashMap45.table = entryArray63;
        hashMap36.table = entryArray63;
        hashMap5.table = entryArray63;
        java.lang.Object obj68 = hashMap4.get((java.lang.Object) hashMap5);
        boolean boolean69 = hashMap5.isEmpty();
        hashMap5.clear();
        system.testclass.HashMap hashMap73 = new system.testclass.HashMap((int) (short) 10, 10.0f);
        java.lang.Object obj74 = hashMap0.put((java.lang.Object) hashMap5, (java.lang.Object) 10.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap0", hashMap0.property_2());
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        boolean boolean4 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        boolean boolean6 = hashMap5.isEmpty();
        int int7 = hashMap5.size();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        int int13 = hashMap11.modCount;
        system.testclass.HashMap.Entry[] entryArray14 = hashMap11.table;
        java.lang.Object obj15 = hashMap10.get((java.lang.Object) entryArray14);
        java.lang.Object obj16 = hashMap5.get((java.lang.Object) entryArray14);
        hashMap0.table = entryArray14;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap(100);
        hashMap19.modCount = (short) 100;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap.Entry[] entryArray25 = hashMap24.table;
        java.lang.Object obj26 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap24);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap0", hashMap0.property_2());
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        boolean boolean3 = hashMap2.isEmpty();
        hashMap2.clear();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap(0, (float) 10L);
        int int8 = hashMap7.size();
        int int9 = hashMap7.modCount;
        hashMap7.modCount = (byte) -1;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        hashMap12.modCount = 0;
        int int15 = hashMap12.modCount;
        java.lang.Object obj16 = hashMap2.put((java.lang.Object) hashMap7, (java.lang.Object) hashMap12);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        int int3 = hashMap2.size();
        int int4 = hashMap2.modCount;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap(0, (float) 10L);
        int int8 = hashMap7.size();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        int int11 = hashMap9.modCount;
        system.testclass.HashMap.Entry[] entryArray12 = hashMap9.table;
        hashMap7.table = entryArray12;
        java.lang.Object obj14 = hashMap2.get((java.lang.Object) hashMap7);
        hashMap2.clear();
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        int int17 = hashMap16.modCount;
        int int18 = hashMap16.modCount;
        hashMap16.clear();
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        boolean boolean21 = hashMap20.isEmpty();
        int int22 = hashMap20.size();
        hashMap20.modCount = '4';
        java.lang.Object obj25 = hashMap16.remove((java.lang.Object) hashMap20);
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj29 = hashMap20.remove((java.lang.Object) 0);
        java.lang.Object obj31 = hashMap20.get((java.lang.Object) '#');
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        boolean boolean33 = hashMap32.isEmpty();
        java.lang.Object obj34 = hashMap20.get((java.lang.Object) boolean33);
        hashMap20.modCount = 0;
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap(10);
        boolean boolean39 = hashMap38.isEmpty();
        system.testclass.HashMap.Entry[] entryArray40 = new system.testclass.HashMap.Entry[] {};
        hashMap38.table = entryArray40;
        java.lang.Object obj42 = hashMap20.remove((java.lang.Object) entryArray40);
        system.testclass.HashMap.Entry[] entryArray43 = hashMap20.table;
        java.lang.Object obj45 = hashMap2.put((java.lang.Object) entryArray43, (java.lang.Object) (short) -1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        hashMap0.clear();
        hashMap0.modCount = 'a';
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.modCount;
        int int10 = hashMap8.modCount;
        hashMap8.clear();
        hashMap8.clear();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        system.testclass.HashMap.Entry[] entryArray16 = hashMap13.table;
        system.testclass.HashMap.Entry[] entryArray17 = hashMap13.table;
        java.lang.Object obj19 = hashMap13.get((java.lang.Object) 100);
        system.testclass.HashMap.Entry[] entryArray20 = hashMap13.table;
        java.lang.Object obj21 = hashMap8.remove((java.lang.Object) hashMap13);
        java.lang.Object obj22 = hashMap0.put((java.lang.Object) (short) 100, (java.lang.Object) hashMap13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap0", hashMap0.property_2());
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        hashMap0.clear();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        system.testclass.HashMap.Entry[] entryArray8 = hashMap5.table;
        system.testclass.HashMap.Entry[] entryArray9 = hashMap5.table;
        java.lang.Object obj11 = hashMap5.get((java.lang.Object) 100);
        system.testclass.HashMap.Entry[] entryArray12 = hashMap5.table;
        java.lang.Object obj13 = hashMap0.remove((java.lang.Object) hashMap5);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap(10);
        boolean boolean16 = hashMap15.isEmpty();
        system.testclass.HashMap.Entry[] entryArray17 = new system.testclass.HashMap.Entry[] {};
        hashMap15.table = entryArray17;
        java.lang.Object obj19 = hashMap0.get((java.lang.Object) hashMap15);
        int int20 = hashMap0.modCount;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        int int22 = hashMap21.modCount;
        int int23 = hashMap21.modCount;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        boolean boolean25 = hashMap24.isEmpty();
        int int26 = hashMap24.size();
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        int int31 = hashMap30.modCount;
        int int32 = hashMap30.modCount;
        system.testclass.HashMap.Entry[] entryArray33 = hashMap30.table;
        java.lang.Object obj34 = hashMap29.get((java.lang.Object) entryArray33);
        java.lang.Object obj35 = hashMap24.get((java.lang.Object) entryArray33);
        int int36 = hashMap24.modCount;
        hashMap24.clear();
        hashMap24.modCount = (short) 100;
        java.lang.Object obj40 = hashMap0.put((java.lang.Object) int23, (java.lang.Object) (short) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap0", hashMap0.property_2());
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 100, (float) (byte) 100);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap(0, (float) 10L);
        int int6 = hashMap5.size();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        int int9 = hashMap7.modCount;
        system.testclass.HashMap.Entry[] entryArray10 = hashMap7.table;
        hashMap5.table = entryArray10;
        java.lang.Object obj12 = hashMap2.get((java.lang.Object) hashMap5);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap(0, (float) 10L);
        int int16 = hashMap15.size();
        int int17 = hashMap15.modCount;
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap(0, (float) 10L);
        int int21 = hashMap20.size();
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        int int23 = hashMap22.modCount;
        int int24 = hashMap22.modCount;
        system.testclass.HashMap.Entry[] entryArray25 = hashMap22.table;
        hashMap20.table = entryArray25;
        java.lang.Object obj27 = hashMap15.get((java.lang.Object) hashMap20);
        hashMap15.clear();
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        boolean boolean30 = hashMap29.isEmpty();
        boolean boolean31 = hashMap29.isEmpty();
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        boolean boolean33 = hashMap32.isEmpty();
        int int34 = hashMap32.size();
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        int int39 = hashMap38.modCount;
        int int40 = hashMap38.modCount;
        system.testclass.HashMap.Entry[] entryArray41 = hashMap38.table;
        java.lang.Object obj42 = hashMap37.get((java.lang.Object) entryArray41);
        java.lang.Object obj43 = hashMap32.get((java.lang.Object) entryArray41);
        hashMap29.table = entryArray41;
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        int int46 = hashMap45.modCount;
        int int47 = hashMap45.modCount;
        system.testclass.HashMap.Entry[] entryArray48 = hashMap45.table;
        hashMap45.clear();
        system.testclass.HashMap.Entry[] entryArray50 = hashMap45.table;
        hashMap29.table = entryArray50;
        java.lang.Object obj52 = hashMap15.get((java.lang.Object) hashMap29);
        system.testclass.HashMap hashMap53 = new system.testclass.HashMap();
        int int54 = hashMap53.modCount;
        int int55 = hashMap53.modCount;
        system.testclass.HashMap hashMap56 = new system.testclass.HashMap();
        boolean boolean57 = hashMap56.isEmpty();
        int int58 = hashMap56.size();
        system.testclass.HashMap hashMap61 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap62 = new system.testclass.HashMap();
        int int63 = hashMap62.modCount;
        int int64 = hashMap62.modCount;
        system.testclass.HashMap.Entry[] entryArray65 = hashMap62.table;
        java.lang.Object obj66 = hashMap61.get((java.lang.Object) entryArray65);
        java.lang.Object obj67 = hashMap56.get((java.lang.Object) entryArray65);
        hashMap53.table = entryArray65;
        hashMap15.table = entryArray65;
        hashMap2.table = entryArray65;
        system.testclass.HashMap hashMap71 = new system.testclass.HashMap();
        int int72 = hashMap71.modCount;
        int int73 = hashMap71.modCount;
        hashMap71.clear();
        hashMap71.clear();
        hashMap71.clear();
        hashMap71.modCount = (short) 10;
        hashMap71.modCount = (byte) 10;
        system.testclass.HashMap hashMap81 = new system.testclass.HashMap();
        int int82 = hashMap81.modCount;
        int int83 = hashMap81.modCount;
        hashMap81.clear();
        system.testclass.HashMap hashMap85 = new system.testclass.HashMap();
        boolean boolean86 = hashMap85.isEmpty();
        int int87 = hashMap85.size();
        hashMap85.modCount = '4';
        java.lang.Object obj90 = hashMap81.remove((java.lang.Object) hashMap85);
        system.testclass.HashMap hashMap93 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj94 = hashMap85.remove((java.lang.Object) 0);
        java.lang.Object obj96 = hashMap85.get((java.lang.Object) '#');
        hashMap85.modCount = (byte) -1;
        java.lang.Object obj99 = hashMap2.put((java.lang.Object) hashMap71, (java.lang.Object) hashMap85);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        int int6 = hashMap4.size();
        hashMap4.modCount = '4';
        java.lang.Object obj9 = hashMap0.remove((java.lang.Object) hashMap4);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj13 = hashMap4.remove((java.lang.Object) 0);
        java.lang.Object obj15 = hashMap4.get((java.lang.Object) '#');
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        boolean boolean17 = hashMap16.isEmpty();
        java.lang.Object obj18 = hashMap4.get((java.lang.Object) boolean17);
        boolean boolean19 = hashMap4.isEmpty();
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap((int) '4');
        int int22 = hashMap21.size();
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap(0, (float) 10L);
        int int26 = hashMap25.size();
        int int27 = hashMap25.modCount;
        system.testclass.HashMap.Entry entry28 = null;
        system.testclass.HashMap.Entry[] entryArray29 = new system.testclass.HashMap.Entry[] { entry28 };
        hashMap25.table = entryArray29;
        hashMap25.modCount = (byte) 100;
        java.lang.Object obj33 = hashMap21.get((java.lang.Object) hashMap25);
        java.lang.Object obj34 = hashMap4.get(obj33);
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        int int36 = hashMap35.modCount;
        int int37 = hashMap35.modCount;
        system.testclass.HashMap.Entry[] entryArray38 = hashMap35.table;
        hashMap35.clear();
        hashMap35.modCount = (short) 1;
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap(1);
        java.lang.Object obj44 = hashMap35.remove((java.lang.Object) hashMap43);
        system.testclass.HashMap hashMap46 = new system.testclass.HashMap((int) 'a');
        java.lang.Object obj47 = hashMap4.put((java.lang.Object) hashMap35, (java.lang.Object) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap4", hashMap4.property_2());
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        int int3 = hashMap2.modCount;
        int int4 = hashMap2.modCount;
        hashMap2.clear();
        hashMap2.clear();
        hashMap2.clear();
        hashMap2.modCount = (short) 10;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.modCount;
        int int12 = hashMap10.modCount;
        system.testclass.HashMap.Entry[] entryArray13 = hashMap10.table;
        hashMap10.clear();
        hashMap10.modCount = (short) 1;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap(1);
        java.lang.Object obj19 = hashMap10.remove((java.lang.Object) hashMap18);
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap((int) (short) 10);
        java.lang.Object obj22 = hashMap18.remove((java.lang.Object) hashMap21);
        system.testclass.HashMap.Entry[] entryArray23 = hashMap18.table;
        java.lang.Object obj24 = hashMap1.put((java.lang.Object) (short) 10, (java.lang.Object) entryArray23);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap1", hashMap1.property_2());
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.modCount;
        int int8 = hashMap6.modCount;
        system.testclass.HashMap.Entry[] entryArray9 = hashMap6.table;
        java.lang.Object obj10 = hashMap5.get((java.lang.Object) entryArray9);
        java.lang.Object obj11 = hashMap0.get((java.lang.Object) entryArray9);
        int int12 = hashMap0.modCount;
        hashMap0.clear();
        hashMap0.modCount = (short) 100;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap(0, (float) 10L);
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap((int) '4', 100.0f);
        java.lang.Object obj22 = hashMap18.get((java.lang.Object) '4');
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        int int24 = hashMap23.modCount;
        int int25 = hashMap23.modCount;
        int int26 = hashMap23.size();
        system.testclass.HashMap.Entry[] entryArray27 = hashMap23.table;
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap(0, (float) 10L);
        int int31 = hashMap30.size();
        int int32 = hashMap30.modCount;
        system.testclass.HashMap.Entry entry33 = null;
        system.testclass.HashMap.Entry[] entryArray34 = new system.testclass.HashMap.Entry[] { entry33 };
        hashMap30.table = entryArray34;
        hashMap30.modCount = (byte) 100;
        java.lang.Object obj38 = hashMap23.get((java.lang.Object) hashMap30);
        int int39 = hashMap23.size();
        java.lang.Object obj40 = hashMap0.put(obj22, (java.lang.Object) int39);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap0", hashMap0.property_2());
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        int int3 = hashMap2.modCount;
        hashMap2.clear();
        int int5 = hashMap2.size();
        hashMap2.modCount = 2;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.modCount;
        int int10 = hashMap8.modCount;
        int int11 = hashMap8.size();
        system.testclass.HashMap.Entry[] entryArray12 = hashMap8.table;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap(0, (float) 10L);
        int int16 = hashMap15.size();
        int int17 = hashMap15.modCount;
        system.testclass.HashMap.Entry entry18 = null;
        system.testclass.HashMap.Entry[] entryArray19 = new system.testclass.HashMap.Entry[] { entry18 };
        hashMap15.table = entryArray19;
        hashMap15.modCount = (byte) 100;
        java.lang.Object obj23 = hashMap8.get((java.lang.Object) hashMap15);
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap((int) '#', (float) 'a');
        java.lang.Object obj27 = hashMap15.get((java.lang.Object) hashMap26);
        int int28 = hashMap26.modCount;
        system.testclass.HashMap.Entry[] entryArray29 = hashMap26.table;
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        boolean boolean31 = hashMap30.isEmpty();
        boolean boolean32 = hashMap30.isEmpty();
        java.lang.Object obj33 = hashMap2.put((java.lang.Object) hashMap26, (java.lang.Object) hashMap30);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) ' ', (float) 100L);
        int int3 = hashMap2.modCount;
        int int4 = hashMap2.modCount;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        system.testclass.HashMap.Entry[] entryArray8 = hashMap5.table;
        boolean boolean9 = hashMap5.isEmpty();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        int int12 = hashMap10.size();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        int int17 = hashMap16.modCount;
        int int18 = hashMap16.modCount;
        system.testclass.HashMap.Entry[] entryArray19 = hashMap16.table;
        java.lang.Object obj20 = hashMap15.get((java.lang.Object) entryArray19);
        java.lang.Object obj21 = hashMap10.get((java.lang.Object) entryArray19);
        hashMap5.table = entryArray19;
        hashMap5.modCount = 0;
        int int25 = hashMap5.modCount;
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        boolean boolean27 = hashMap26.isEmpty();
        int int28 = hashMap26.size();
        hashMap26.modCount = '4';
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        int int32 = hashMap31.modCount;
        int int33 = hashMap31.modCount;
        int int34 = hashMap31.size();
        java.lang.Object obj35 = hashMap26.get((java.lang.Object) int34);
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        int int37 = hashMap36.modCount;
        int int38 = hashMap36.modCount;
        system.testclass.HashMap.Entry[] entryArray39 = hashMap36.table;
        boolean boolean40 = hashMap36.isEmpty();
        java.lang.Object obj41 = hashMap26.remove((java.lang.Object) hashMap36);
        java.lang.Object obj42 = hashMap2.put((java.lang.Object) hashMap5, (java.lang.Object) hashMap26);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        int int3 = hashMap2.size();
        int int4 = hashMap2.modCount;
        system.testclass.HashMap.Entry entry5 = null;
        system.testclass.HashMap.Entry[] entryArray6 = new system.testclass.HashMap.Entry[] { entry5 };
        hashMap2.table = entryArray6;
        hashMap2.modCount = (byte) 100;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap(0, 100.0f);
        int int13 = hashMap12.modCount;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap((int) '4', 100.0f);
        java.lang.Object obj17 = hashMap2.put((java.lang.Object) int13, (java.lang.Object) hashMap16);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.modCount = '4';
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        int int8 = hashMap5.size();
        java.lang.Object obj9 = hashMap0.get((java.lang.Object) int8);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.modCount;
        int int12 = hashMap10.modCount;
        system.testclass.HashMap.Entry[] entryArray13 = hashMap10.table;
        boolean boolean14 = hashMap10.isEmpty();
        java.lang.Object obj15 = hashMap0.remove((java.lang.Object) hashMap10);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        int int17 = hashMap16.modCount;
        int int18 = hashMap16.modCount;
        int int19 = hashMap16.size();
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        int int21 = hashMap20.modCount;
        int int22 = hashMap20.modCount;
        system.testclass.HashMap.Entry[] entryArray23 = hashMap20.table;
        boolean boolean24 = hashMap20.isEmpty();
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        boolean boolean26 = hashMap25.isEmpty();
        int int27 = hashMap25.size();
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        int int32 = hashMap31.modCount;
        int int33 = hashMap31.modCount;
        system.testclass.HashMap.Entry[] entryArray34 = hashMap31.table;
        java.lang.Object obj35 = hashMap30.get((java.lang.Object) entryArray34);
        java.lang.Object obj36 = hashMap25.get((java.lang.Object) entryArray34);
        hashMap20.table = entryArray34;
        hashMap16.table = entryArray34;
        hashMap0.table = entryArray34;
        hashMap0.clear();
        hashMap0.modCount = 52;
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap();
        int int44 = hashMap43.modCount;
        int int45 = hashMap43.modCount;
        hashMap43.clear();
        hashMap43.clear();
        system.testclass.HashMap.Entry[] entryArray48 = hashMap43.table;
        hashMap0.table = entryArray48;
        system.testclass.HashMap hashMap50 = new system.testclass.HashMap();
        int int51 = hashMap50.modCount;
        int int52 = hashMap50.modCount;
        hashMap50.clear();
        hashMap50.clear();
        int int55 = hashMap50.size();
        system.testclass.HashMap hashMap56 = new system.testclass.HashMap();
        int int57 = hashMap56.modCount;
        int int58 = hashMap56.modCount;
        system.testclass.HashMap.Entry[] entryArray59 = hashMap56.table;
        boolean boolean60 = hashMap56.isEmpty();
        system.testclass.HashMap hashMap61 = new system.testclass.HashMap();
        boolean boolean62 = hashMap61.isEmpty();
        int int63 = hashMap61.size();
        system.testclass.HashMap hashMap66 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap67 = new system.testclass.HashMap();
        int int68 = hashMap67.modCount;
        int int69 = hashMap67.modCount;
        system.testclass.HashMap.Entry[] entryArray70 = hashMap67.table;
        java.lang.Object obj71 = hashMap66.get((java.lang.Object) entryArray70);
        java.lang.Object obj72 = hashMap61.get((java.lang.Object) entryArray70);
        hashMap56.table = entryArray70;
        hashMap56.modCount = 0;
        int int76 = hashMap56.modCount;
        hashMap56.clear();
        java.lang.Object obj78 = hashMap0.put((java.lang.Object) hashMap50, (java.lang.Object) hashMap56);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap0", hashMap0.property_2());
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        int int6 = hashMap4.size();
        hashMap4.modCount = '4';
        java.lang.Object obj9 = hashMap0.remove((java.lang.Object) hashMap4);
        java.lang.Object obj11 = hashMap4.remove((java.lang.Object) (-1.0d));
        int int12 = hashMap4.size();
        hashMap4.clear();
        boolean boolean14 = hashMap4.isEmpty();
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap((int) '4', 100.0f);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        int int19 = hashMap18.modCount;
        int int20 = hashMap18.modCount;
        hashMap18.clear();
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        boolean boolean23 = hashMap22.isEmpty();
        int int24 = hashMap22.size();
        hashMap22.modCount = '4';
        java.lang.Object obj27 = hashMap18.remove((java.lang.Object) hashMap22);
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj31 = hashMap22.remove((java.lang.Object) 0);
        java.lang.Object obj33 = hashMap22.get((java.lang.Object) '#');
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        boolean boolean35 = hashMap34.isEmpty();
        java.lang.Object obj36 = hashMap22.get((java.lang.Object) boolean35);
        hashMap22.modCount = 0;
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap(10);
        boolean boolean41 = hashMap40.isEmpty();
        system.testclass.HashMap.Entry[] entryArray42 = new system.testclass.HashMap.Entry[] {};
        hashMap40.table = entryArray42;
        java.lang.Object obj44 = hashMap22.remove((java.lang.Object) entryArray42);
        java.lang.Object obj46 = hashMap22.remove((java.lang.Object) 100L);
        java.lang.Object obj47 = hashMap4.put((java.lang.Object) hashMap17, obj46);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap4", hashMap4.property_2());
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        int int6 = hashMap4.size();
        hashMap4.modCount = '4';
        java.lang.Object obj9 = hashMap0.remove((java.lang.Object) hashMap4);
        java.lang.Object obj11 = hashMap4.remove((java.lang.Object) (-1.0d));
        boolean boolean12 = hashMap4.isEmpty();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        hashMap13.clear();
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        boolean boolean18 = hashMap17.isEmpty();
        int int19 = hashMap17.size();
        hashMap17.modCount = '4';
        java.lang.Object obj22 = hashMap13.remove((java.lang.Object) hashMap17);
        java.lang.Object obj24 = hashMap17.remove((java.lang.Object) (-1.0d));
        int int25 = hashMap17.size();
        hashMap17.clear();
        hashMap17.modCount = (short) -1;
        boolean boolean29 = hashMap17.isEmpty();
        system.testclass.HashMap.Entry[] entryArray30 = hashMap17.table;
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap((int) '4');
        hashMap32.modCount = (byte) -1;
        int int35 = hashMap32.size();
        java.lang.Object obj36 = hashMap4.put((java.lang.Object) entryArray30, (java.lang.Object) hashMap32);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap4", hashMap4.property_2());
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap((int) '#', (float) 'a');
        hashMap5.modCount = 100;
        int int8 = hashMap5.size();
        java.lang.Object obj9 = hashMap2.remove((java.lang.Object) int8);
        boolean boolean10 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        int int13 = hashMap11.modCount;
        system.testclass.HashMap.Entry[] entryArray14 = hashMap11.table;
        system.testclass.HashMap.Entry[] entryArray15 = hashMap11.table;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        int int17 = hashMap16.modCount;
        int int18 = hashMap16.modCount;
        int int19 = hashMap16.size();
        system.testclass.HashMap.Entry[] entryArray20 = new system.testclass.HashMap.Entry[] {};
        hashMap16.table = entryArray20;
        hashMap11.table = entryArray20;
        hashMap11.clear();
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.modCount;
        int int26 = hashMap24.modCount;
        hashMap24.clear();
        hashMap24.clear();
        system.testclass.HashMap.Entry[] entryArray29 = hashMap24.table;
        java.lang.Class<?> wildcardClass30 = hashMap24.getClass();
        java.lang.Object obj31 = hashMap2.put((java.lang.Object) hashMap11, (java.lang.Object) hashMap24);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        system.testclass.HashMap.Entry[] entryArray4 = hashMap0.table;
        java.lang.Object obj6 = hashMap0.get((java.lang.Object) 100);
        int int7 = hashMap0.modCount;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap(0, (float) 10L);
        int int11 = hashMap10.size();
        int int12 = hashMap10.modCount;
        system.testclass.HashMap.Entry entry13 = null;
        system.testclass.HashMap.Entry[] entryArray14 = new system.testclass.HashMap.Entry[] { entry13 };
        hashMap10.table = entryArray14;
        hashMap10.modCount = (byte) 100;
        hashMap10.modCount = (byte) 10;
        java.lang.Object obj20 = hashMap0.remove((java.lang.Object) hashMap10);
        java.lang.Object obj21 = null;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap(0, (float) 10L);
        int int25 = hashMap24.size();
        int int26 = hashMap24.modCount;
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap(0, (float) 10L);
        int int30 = hashMap29.size();
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        int int32 = hashMap31.modCount;
        int int33 = hashMap31.modCount;
        system.testclass.HashMap.Entry[] entryArray34 = hashMap31.table;
        hashMap29.table = entryArray34;
        java.lang.Object obj36 = hashMap24.get((java.lang.Object) hashMap29);
        int int37 = hashMap29.modCount;
        java.lang.Object obj38 = hashMap10.put(obj21, (java.lang.Object) int37);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap10", hashMap10.property_2());
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        int int6 = hashMap4.size();
        hashMap4.modCount = '4';
        java.lang.Object obj9 = hashMap0.remove((java.lang.Object) hashMap4);
        java.lang.Object obj11 = hashMap4.remove((java.lang.Object) (-1.0d));
        int int12 = hashMap4.size();
        hashMap4.clear();
        hashMap4.modCount = (short) -1;
        hashMap4.clear();
        int int17 = hashMap4.modCount;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        boolean boolean19 = hashMap18.isEmpty();
        int int20 = hashMap18.size();
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.modCount;
        int int26 = hashMap24.modCount;
        system.testclass.HashMap.Entry[] entryArray27 = hashMap24.table;
        java.lang.Object obj28 = hashMap23.get((java.lang.Object) entryArray27);
        java.lang.Object obj29 = hashMap18.get((java.lang.Object) entryArray27);
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        int int31 = hashMap30.modCount;
        int int32 = hashMap30.modCount;
        hashMap30.clear();
        hashMap30.clear();
        int int35 = hashMap30.size();
        int int36 = hashMap30.modCount;
        java.lang.Object obj37 = hashMap4.put((java.lang.Object) hashMap18, (java.lang.Object) hashMap30);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap4", hashMap4.property_2());
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 10, 10.0f);
        hashMap2.modCount = (byte) 10;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap(0, (float) 10L);
        int int8 = hashMap7.size();
        int int9 = hashMap7.modCount;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap(0, (float) 10L);
        int int13 = hashMap12.size();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.modCount;
        int int16 = hashMap14.modCount;
        system.testclass.HashMap.Entry[] entryArray17 = hashMap14.table;
        hashMap12.table = entryArray17;
        java.lang.Object obj19 = hashMap7.get((java.lang.Object) hashMap12);
        hashMap7.clear();
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        boolean boolean22 = hashMap21.isEmpty();
        boolean boolean23 = hashMap21.isEmpty();
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        boolean boolean25 = hashMap24.isEmpty();
        int int26 = hashMap24.size();
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        int int31 = hashMap30.modCount;
        int int32 = hashMap30.modCount;
        system.testclass.HashMap.Entry[] entryArray33 = hashMap30.table;
        java.lang.Object obj34 = hashMap29.get((java.lang.Object) entryArray33);
        java.lang.Object obj35 = hashMap24.get((java.lang.Object) entryArray33);
        hashMap21.table = entryArray33;
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        int int38 = hashMap37.modCount;
        int int39 = hashMap37.modCount;
        system.testclass.HashMap.Entry[] entryArray40 = hashMap37.table;
        hashMap37.clear();
        system.testclass.HashMap.Entry[] entryArray42 = hashMap37.table;
        hashMap21.table = entryArray42;
        java.lang.Object obj44 = hashMap7.get((java.lang.Object) hashMap21);
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        int int46 = hashMap45.modCount;
        int int47 = hashMap45.modCount;
        hashMap45.clear();
        system.testclass.HashMap hashMap49 = new system.testclass.HashMap();
        boolean boolean50 = hashMap49.isEmpty();
        int int51 = hashMap49.size();
        hashMap49.modCount = '4';
        java.lang.Object obj54 = hashMap45.remove((java.lang.Object) hashMap49);
        system.testclass.HashMap hashMap57 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj58 = hashMap49.remove((java.lang.Object) 0);
        java.lang.Object obj60 = hashMap49.get((java.lang.Object) '#');
        system.testclass.HashMap hashMap63 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap64 = new system.testclass.HashMap();
        int int65 = hashMap64.modCount;
        int int66 = hashMap64.modCount;
        system.testclass.HashMap.Entry[] entryArray67 = hashMap64.table;
        java.lang.Object obj68 = hashMap63.get((java.lang.Object) entryArray67);
        hashMap49.table = entryArray67;
        hashMap7.table = entryArray67;
        java.lang.Object obj71 = null;
        java.lang.Object obj72 = hashMap2.put((java.lang.Object) entryArray67, obj71);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        int int6 = hashMap4.size();
        hashMap4.modCount = '4';
        java.lang.Object obj9 = hashMap0.remove((java.lang.Object) hashMap4);
        java.lang.Object obj11 = hashMap4.remove((java.lang.Object) (-1.0d));
        int int12 = hashMap4.size();
        hashMap4.clear();
        int int14 = hashMap4.modCount;
        int int15 = hashMap4.modCount;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap(0, 100.0f);
        hashMap18.modCount = (-1);
        hashMap18.clear();
        system.testclass.HashMap.Entry[] entryArray22 = hashMap18.table;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap((int) '4');
        int int25 = hashMap24.size();
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap(0, (float) 10L);
        int int29 = hashMap28.size();
        int int30 = hashMap28.modCount;
        system.testclass.HashMap.Entry entry31 = null;
        system.testclass.HashMap.Entry[] entryArray32 = new system.testclass.HashMap.Entry[] { entry31 };
        hashMap28.table = entryArray32;
        hashMap28.modCount = (byte) 100;
        java.lang.Object obj36 = hashMap24.get((java.lang.Object) hashMap28);
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        int int38 = hashMap37.modCount;
        int int39 = hashMap37.modCount;
        hashMap37.clear();
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        boolean boolean42 = hashMap41.isEmpty();
        int int43 = hashMap41.size();
        hashMap41.modCount = '4';
        java.lang.Object obj46 = hashMap37.remove((java.lang.Object) hashMap41);
        system.testclass.HashMap hashMap49 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj50 = hashMap41.remove((java.lang.Object) 0);
        java.lang.Object obj52 = hashMap41.get((java.lang.Object) '#');
        system.testclass.HashMap hashMap55 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap56 = new system.testclass.HashMap();
        int int57 = hashMap56.modCount;
        int int58 = hashMap56.modCount;
        system.testclass.HashMap.Entry[] entryArray59 = hashMap56.table;
        java.lang.Object obj60 = hashMap55.get((java.lang.Object) entryArray59);
        hashMap41.table = entryArray59;
        java.lang.Object obj62 = hashMap28.remove((java.lang.Object) entryArray59);
        java.lang.Object obj63 = hashMap4.put((java.lang.Object) hashMap18, obj62);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap4", hashMap4.property_2());
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        system.testclass.HashMap.Entry[] entryArray4 = hashMap0.table;
        java.lang.Object obj6 = hashMap0.get((java.lang.Object) 100);
        int int7 = hashMap0.size();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) ' ', (float) 100L);
        int int11 = hashMap10.modCount;
        int int12 = hashMap10.modCount;
        boolean boolean13 = hashMap10.isEmpty();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.modCount;
        int int16 = hashMap14.modCount;
        hashMap14.clear();
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        boolean boolean19 = hashMap18.isEmpty();
        int int20 = hashMap18.size();
        hashMap18.modCount = '4';
        java.lang.Object obj23 = hashMap14.remove((java.lang.Object) hashMap18);
        java.lang.Object obj25 = hashMap18.remove((java.lang.Object) (-1.0d));
        int int26 = hashMap18.size();
        hashMap18.clear();
        hashMap18.modCount = (short) -1;
        hashMap18.clear();
        int int31 = hashMap18.modCount;
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        int int33 = hashMap32.modCount;
        int int34 = hashMap32.modCount;
        hashMap32.clear();
        hashMap32.clear();
        hashMap32.clear();
        hashMap32.clear();
        java.lang.Object obj39 = hashMap18.get((java.lang.Object) hashMap32);
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        int int41 = hashMap40.modCount;
        int int42 = hashMap40.modCount;
        hashMap40.clear();
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap();
        boolean boolean45 = hashMap44.isEmpty();
        int int46 = hashMap44.size();
        hashMap44.modCount = '4';
        java.lang.Object obj49 = hashMap40.remove((java.lang.Object) hashMap44);
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj53 = hashMap44.remove((java.lang.Object) 0);
        system.testclass.HashMap hashMap54 = new system.testclass.HashMap();
        boolean boolean55 = hashMap54.isEmpty();
        int int56 = hashMap54.size();
        system.testclass.HashMap hashMap59 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap60 = new system.testclass.HashMap();
        int int61 = hashMap60.modCount;
        int int62 = hashMap60.modCount;
        system.testclass.HashMap.Entry[] entryArray63 = hashMap60.table;
        java.lang.Object obj64 = hashMap59.get((java.lang.Object) entryArray63);
        java.lang.Object obj65 = hashMap54.get((java.lang.Object) entryArray63);
        java.lang.Object obj66 = hashMap44.remove((java.lang.Object) hashMap54);
        java.lang.Object obj67 = hashMap32.remove(obj66);
        java.lang.Object obj68 = hashMap0.put((java.lang.Object) boolean13, obj66);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap0", hashMap0.property_2());
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        int int3 = hashMap2.size();
        int int4 = hashMap2.modCount;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap(0, (float) 10L);
        int int8 = hashMap7.size();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        int int11 = hashMap9.modCount;
        system.testclass.HashMap.Entry[] entryArray12 = hashMap9.table;
        hashMap7.table = entryArray12;
        java.lang.Object obj14 = hashMap2.get((java.lang.Object) hashMap7);
        hashMap2.clear();
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        boolean boolean17 = hashMap16.isEmpty();
        boolean boolean18 = hashMap16.isEmpty();
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        boolean boolean20 = hashMap19.isEmpty();
        int int21 = hashMap19.size();
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        int int26 = hashMap25.modCount;
        int int27 = hashMap25.modCount;
        system.testclass.HashMap.Entry[] entryArray28 = hashMap25.table;
        java.lang.Object obj29 = hashMap24.get((java.lang.Object) entryArray28);
        java.lang.Object obj30 = hashMap19.get((java.lang.Object) entryArray28);
        hashMap16.table = entryArray28;
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        int int33 = hashMap32.modCount;
        int int34 = hashMap32.modCount;
        system.testclass.HashMap.Entry[] entryArray35 = hashMap32.table;
        hashMap32.clear();
        system.testclass.HashMap.Entry[] entryArray37 = hashMap32.table;
        hashMap16.table = entryArray37;
        java.lang.Object obj39 = hashMap2.get((java.lang.Object) hashMap16);
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        int int41 = hashMap40.modCount;
        int int42 = hashMap40.modCount;
        hashMap40.clear();
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap();
        boolean boolean45 = hashMap44.isEmpty();
        int int46 = hashMap44.size();
        hashMap44.modCount = '4';
        java.lang.Object obj49 = hashMap40.remove((java.lang.Object) hashMap44);
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj53 = hashMap44.remove((java.lang.Object) 0);
        java.lang.Object obj55 = hashMap44.get((java.lang.Object) '#');
        system.testclass.HashMap hashMap58 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap59 = new system.testclass.HashMap();
        int int60 = hashMap59.modCount;
        int int61 = hashMap59.modCount;
        system.testclass.HashMap.Entry[] entryArray62 = hashMap59.table;
        java.lang.Object obj63 = hashMap58.get((java.lang.Object) entryArray62);
        hashMap44.table = entryArray62;
        hashMap2.table = entryArray62;
        int int66 = hashMap2.modCount;
        boolean boolean67 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap68 = new system.testclass.HashMap();
        int int69 = hashMap68.modCount;
        int int70 = hashMap68.modCount;
        system.testclass.HashMap hashMap71 = new system.testclass.HashMap();
        boolean boolean72 = hashMap71.isEmpty();
        int int73 = hashMap71.size();
        system.testclass.HashMap hashMap76 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap77 = new system.testclass.HashMap();
        int int78 = hashMap77.modCount;
        int int79 = hashMap77.modCount;
        system.testclass.HashMap.Entry[] entryArray80 = hashMap77.table;
        java.lang.Object obj81 = hashMap76.get((java.lang.Object) entryArray80);
        java.lang.Object obj82 = hashMap71.get((java.lang.Object) entryArray80);
        hashMap68.table = entryArray80;
        java.lang.Object obj84 = new java.lang.Object();
        java.lang.Object obj85 = hashMap68.get(obj84);
        system.testclass.HashMap hashMap88 = new system.testclass.HashMap((int) (short) 100, (float) 100L);
        system.testclass.HashMap.Entry[] entryArray89 = hashMap88.table;
        hashMap68.table = entryArray89;
        java.lang.Object obj91 = null;
        java.lang.Object obj92 = hashMap2.put((java.lang.Object) hashMap68, obj91);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) (byte) 100);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        system.testclass.HashMap.Entry[] entryArray6 = hashMap3.table;
        boolean boolean7 = hashMap3.isEmpty();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        int int10 = hashMap8.size();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.modCount;
        int int16 = hashMap14.modCount;
        system.testclass.HashMap.Entry[] entryArray17 = hashMap14.table;
        java.lang.Object obj18 = hashMap13.get((java.lang.Object) entryArray17);
        java.lang.Object obj19 = hashMap8.get((java.lang.Object) entryArray17);
        hashMap3.table = entryArray17;
        hashMap3.modCount = 0;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        boolean boolean24 = hashMap23.isEmpty();
        int int25 = hashMap23.size();
        hashMap23.modCount = '4';
        java.lang.Object obj28 = hashMap2.put((java.lang.Object) 0, (java.lang.Object) '4');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) 'a');
        int int2 = hashMap1.modCount;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap(53);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        boolean boolean6 = hashMap5.isEmpty();
        int int7 = hashMap5.size();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.modCount;
        int int10 = hashMap8.modCount;
        int int11 = hashMap8.size();
        system.testclass.HashMap.Entry[] entryArray12 = hashMap8.table;
        hashMap5.table = entryArray12;
        hashMap4.table = entryArray12;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap(100, 100.0f);
        system.testclass.HashMap.Entry[] entryArray18 = hashMap17.table;
        java.lang.Class<?> wildcardClass19 = entryArray18.getClass();
        java.lang.Object obj20 = hashMap1.put((java.lang.Object) entryArray12, (java.lang.Object) wildcardClass19);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap1", hashMap1.property_2());
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.modCount = '4';
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        int int8 = hashMap5.size();
        java.lang.Object obj9 = hashMap0.get((java.lang.Object) int8);
        hashMap0.modCount = (byte) 1;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        boolean boolean13 = hashMap12.isEmpty();
        int int14 = hashMap12.size();
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        int int19 = hashMap18.modCount;
        int int20 = hashMap18.modCount;
        system.testclass.HashMap.Entry[] entryArray21 = hashMap18.table;
        java.lang.Object obj22 = hashMap17.get((java.lang.Object) entryArray21);
        java.lang.Object obj23 = hashMap12.get((java.lang.Object) entryArray21);
        int int24 = hashMap12.modCount;
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        int int26 = hashMap25.modCount;
        int int27 = hashMap25.modCount;
        hashMap25.clear();
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        boolean boolean30 = hashMap29.isEmpty();
        int int31 = hashMap29.size();
        hashMap29.modCount = '4';
        java.lang.Object obj34 = hashMap25.remove((java.lang.Object) hashMap29);
        java.lang.Object obj36 = hashMap29.remove((java.lang.Object) (-1.0d));
        int int37 = hashMap29.size();
        hashMap29.clear();
        hashMap29.modCount = (short) -1;
        java.lang.Object obj41 = hashMap12.get((java.lang.Object) hashMap29);
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap();
        boolean boolean43 = hashMap42.isEmpty();
        boolean boolean44 = hashMap42.isEmpty();
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        boolean boolean46 = hashMap45.isEmpty();
        int int47 = hashMap45.size();
        system.testclass.HashMap hashMap50 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap51 = new system.testclass.HashMap();
        int int52 = hashMap51.modCount;
        int int53 = hashMap51.modCount;
        system.testclass.HashMap.Entry[] entryArray54 = hashMap51.table;
        java.lang.Object obj55 = hashMap50.get((java.lang.Object) entryArray54);
        java.lang.Object obj56 = hashMap45.get((java.lang.Object) entryArray54);
        hashMap42.table = entryArray54;
        hashMap29.table = entryArray54;
        system.testclass.HashMap hashMap61 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        int int62 = hashMap61.modCount;
        system.testclass.HashMap hashMap65 = new system.testclass.HashMap((int) '4', (float) 10L);
        boolean boolean66 = hashMap65.isEmpty();
        hashMap65.clear();
        system.testclass.HashMap hashMap68 = new system.testclass.HashMap();
        int int69 = hashMap68.modCount;
        int int70 = hashMap68.modCount;
        int int71 = hashMap68.size();
        java.lang.Object obj72 = hashMap65.remove((java.lang.Object) hashMap68);
        hashMap68.modCount = 100;
        java.lang.Object obj75 = hashMap61.remove((java.lang.Object) 100);
        java.lang.Object obj76 = hashMap0.put((java.lang.Object) entryArray54, obj75);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap0", hashMap0.property_2());
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        int int5 = hashMap3.size();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.modCount;
        int int8 = hashMap6.modCount;
        int int9 = hashMap6.size();
        system.testclass.HashMap.Entry[] entryArray10 = hashMap6.table;
        hashMap3.table = entryArray10;
        system.testclass.HashMap.Entry[] entryArray12 = hashMap3.table;
        java.lang.Object obj13 = hashMap0.get((java.lang.Object) hashMap3);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.modCount;
        int int16 = hashMap14.modCount;
        system.testclass.HashMap.Entry[] entryArray17 = hashMap14.table;
        hashMap14.clear();
        hashMap14.modCount = (short) 1;
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap(1);
        java.lang.Object obj23 = hashMap14.remove((java.lang.Object) hashMap22);
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap((int) (short) 10);
        java.lang.Object obj26 = hashMap22.remove((java.lang.Object) hashMap25);
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        int int28 = hashMap27.modCount;
        int int29 = hashMap27.modCount;
        system.testclass.HashMap.Entry[] entryArray30 = hashMap27.table;
        boolean boolean31 = hashMap27.isEmpty();
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        boolean boolean33 = hashMap32.isEmpty();
        int int34 = hashMap32.size();
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        int int39 = hashMap38.modCount;
        int int40 = hashMap38.modCount;
        system.testclass.HashMap.Entry[] entryArray41 = hashMap38.table;
        java.lang.Object obj42 = hashMap37.get((java.lang.Object) entryArray41);
        java.lang.Object obj43 = hashMap32.get((java.lang.Object) entryArray41);
        hashMap27.table = entryArray41;
        hashMap27.modCount = 0;
        int int47 = hashMap27.modCount;
        hashMap27.clear();
        java.lang.Object obj49 = hashMap25.get((java.lang.Object) hashMap27);
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap(0, (float) 10L);
        int int53 = hashMap52.size();
        int int54 = hashMap52.modCount;
        system.testclass.HashMap hashMap57 = new system.testclass.HashMap(0, (float) 10L);
        int int58 = hashMap57.size();
        system.testclass.HashMap hashMap59 = new system.testclass.HashMap();
        int int60 = hashMap59.modCount;
        int int61 = hashMap59.modCount;
        system.testclass.HashMap.Entry[] entryArray62 = hashMap59.table;
        hashMap57.table = entryArray62;
        java.lang.Object obj64 = hashMap52.get((java.lang.Object) hashMap57);
        hashMap57.clear();
        system.testclass.HashMap.Entry[] entryArray66 = null;
        hashMap57.table = entryArray66;
        java.lang.Object obj68 = hashMap25.remove((java.lang.Object) hashMap57);
        system.testclass.HashMap hashMap69 = new system.testclass.HashMap();
        boolean boolean70 = hashMap69.isEmpty();
        int int71 = hashMap69.size();
        system.testclass.HashMap hashMap74 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap75 = new system.testclass.HashMap();
        int int76 = hashMap75.modCount;
        int int77 = hashMap75.modCount;
        system.testclass.HashMap.Entry[] entryArray78 = hashMap75.table;
        java.lang.Object obj79 = hashMap74.get((java.lang.Object) entryArray78);
        java.lang.Object obj80 = hashMap69.get((java.lang.Object) entryArray78);
        hashMap69.clear();
        java.lang.Object obj82 = hashMap3.put(obj68, (java.lang.Object) hashMap69);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap3", hashMap3.property_2());
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        int int3 = hashMap2.modCount;
        hashMap2.clear();
        int int5 = hashMap2.size();
        hashMap2.modCount = 2;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap((int) (byte) 1);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap(10);
        boolean boolean12 = hashMap11.isEmpty();
        int int13 = hashMap11.modCount;
        hashMap11.modCount = 0;
        java.lang.Object obj16 = hashMap2.put((java.lang.Object) hashMap9, (java.lang.Object) hashMap11);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        hashMap0.modCount = '4';
        int int5 = hashMap0.modCount;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.modCount;
        int int8 = hashMap6.modCount;
        int int9 = hashMap6.size();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.modCount;
        int int12 = hashMap10.modCount;
        system.testclass.HashMap.Entry[] entryArray13 = hashMap10.table;
        boolean boolean14 = hashMap10.isEmpty();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        boolean boolean16 = hashMap15.isEmpty();
        int int17 = hashMap15.size();
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        int int22 = hashMap21.modCount;
        int int23 = hashMap21.modCount;
        system.testclass.HashMap.Entry[] entryArray24 = hashMap21.table;
        java.lang.Object obj25 = hashMap20.get((java.lang.Object) entryArray24);
        java.lang.Object obj26 = hashMap15.get((java.lang.Object) entryArray24);
        hashMap10.table = entryArray24;
        hashMap6.table = entryArray24;
        java.lang.Object obj30 = hashMap6.get((java.lang.Object) (short) 10);
        system.testclass.HashMap.Entry[] entryArray31 = hashMap6.table;
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap(10);
        int int34 = hashMap33.modCount;
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        int int36 = hashMap35.modCount;
        int int37 = hashMap35.modCount;
        int int38 = hashMap35.size();
        system.testclass.HashMap.Entry[] entryArray39 = hashMap35.table;
        hashMap35.clear();
        system.testclass.HashMap.Entry[] entryArray41 = hashMap35.table;
        java.lang.Object obj42 = hashMap33.get((java.lang.Object) hashMap35);
        java.lang.Object obj43 = hashMap0.put((java.lang.Object) entryArray31, (java.lang.Object) hashMap33);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap0", hashMap0.property_2());
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test68");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        hashMap0.clear();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        system.testclass.HashMap.Entry[] entryArray8 = hashMap5.table;
        system.testclass.HashMap.Entry[] entryArray9 = hashMap5.table;
        java.lang.Object obj11 = hashMap5.get((java.lang.Object) 100);
        system.testclass.HashMap.Entry[] entryArray12 = hashMap5.table;
        java.lang.Object obj13 = hashMap0.remove((java.lang.Object) hashMap5);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap(10);
        boolean boolean16 = hashMap15.isEmpty();
        system.testclass.HashMap.Entry[] entryArray17 = new system.testclass.HashMap.Entry[] {};
        hashMap15.table = entryArray17;
        java.lang.Object obj19 = hashMap0.get((java.lang.Object) hashMap15);
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        int int21 = hashMap20.modCount;
        int int22 = hashMap20.modCount;
        hashMap20.clear();
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        boolean boolean25 = hashMap24.isEmpty();
        int int26 = hashMap24.size();
        hashMap24.modCount = '4';
        java.lang.Object obj29 = hashMap20.remove((java.lang.Object) hashMap24);
        java.lang.Object obj31 = hashMap24.remove((java.lang.Object) (-1.0d));
        int int32 = hashMap24.size();
        hashMap24.clear();
        hashMap24.modCount = (short) -1;
        hashMap24.clear();
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        int int38 = hashMap37.modCount;
        int int39 = hashMap37.modCount;
        int int40 = hashMap37.size();
        system.testclass.HashMap.Entry[] entryArray41 = hashMap37.table;
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap(0, (float) 10L);
        int int45 = hashMap44.size();
        int int46 = hashMap44.modCount;
        system.testclass.HashMap.Entry entry47 = null;
        system.testclass.HashMap.Entry[] entryArray48 = new system.testclass.HashMap.Entry[] { entry47 };
        hashMap44.table = entryArray48;
        hashMap44.modCount = (byte) 100;
        java.lang.Object obj52 = hashMap37.get((java.lang.Object) hashMap44);
        system.testclass.HashMap hashMap55 = new system.testclass.HashMap((int) '#', (float) 'a');
        java.lang.Object obj56 = hashMap44.get((java.lang.Object) hashMap55);
        int int57 = hashMap55.modCount;
        system.testclass.HashMap.Entry[] entryArray58 = hashMap55.table;
        hashMap24.table = entryArray58;
        hashMap15.table = entryArray58;
        system.testclass.HashMap hashMap61 = new system.testclass.HashMap();
        int int62 = hashMap61.modCount;
        int int63 = hashMap61.modCount;
        hashMap61.clear();
        system.testclass.HashMap hashMap65 = new system.testclass.HashMap();
        boolean boolean66 = hashMap65.isEmpty();
        int int67 = hashMap65.size();
        hashMap65.modCount = '4';
        java.lang.Object obj70 = hashMap61.remove((java.lang.Object) hashMap65);
        java.lang.Object obj72 = hashMap65.remove((java.lang.Object) (-1.0d));
        boolean boolean73 = hashMap65.isEmpty();
        boolean boolean74 = hashMap65.isEmpty();
        system.testclass.HashMap hashMap75 = new system.testclass.HashMap();
        int int76 = hashMap75.modCount;
        int int77 = hashMap75.modCount;
        int int78 = hashMap75.size();
        system.testclass.HashMap.Entry[] entryArray79 = hashMap75.table;
        system.testclass.HashMap hashMap82 = new system.testclass.HashMap(0, (float) 10L);
        int int83 = hashMap82.size();
        int int84 = hashMap82.modCount;
        system.testclass.HashMap.Entry entry85 = null;
        system.testclass.HashMap.Entry[] entryArray86 = new system.testclass.HashMap.Entry[] { entry85 };
        hashMap82.table = entryArray86;
        hashMap82.modCount = (byte) 100;
        java.lang.Object obj90 = hashMap75.get((java.lang.Object) hashMap82);
        system.testclass.HashMap hashMap93 = new system.testclass.HashMap((int) '#', (float) 'a');
        java.lang.Object obj94 = hashMap82.get((java.lang.Object) hashMap93);
        java.lang.Object obj95 = hashMap15.put((java.lang.Object) hashMap65, obj94);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap15", hashMap15.property_2());
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test69");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (byte) 0, (float) 1);
        int int3 = hashMap2.size();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        hashMap4.clear();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        boolean boolean9 = hashMap8.isEmpty();
        int int10 = hashMap8.size();
        hashMap8.modCount = '4';
        java.lang.Object obj13 = hashMap4.remove((java.lang.Object) hashMap8);
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj17 = hashMap8.remove((java.lang.Object) 0);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        boolean boolean19 = hashMap18.isEmpty();
        int int20 = hashMap18.size();
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.modCount;
        int int26 = hashMap24.modCount;
        system.testclass.HashMap.Entry[] entryArray27 = hashMap24.table;
        java.lang.Object obj28 = hashMap23.get((java.lang.Object) entryArray27);
        java.lang.Object obj29 = hashMap18.get((java.lang.Object) entryArray27);
        java.lang.Object obj30 = hashMap8.remove((java.lang.Object) hashMap18);
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap(53, (float) (short) 100);
        int int34 = hashMap33.modCount;
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        int int36 = hashMap35.modCount;
        int int37 = hashMap35.modCount;
        system.testclass.HashMap.Entry[] entryArray38 = hashMap35.table;
        hashMap35.clear();
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap((int) '4', 100.0f);
        java.lang.Object obj43 = hashMap35.remove((java.lang.Object) hashMap42);
        system.testclass.HashMap hashMap46 = new system.testclass.HashMap((int) (short) 10, 10.0f);
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap();
        int int48 = hashMap47.modCount;
        int int49 = hashMap47.modCount;
        int int50 = hashMap47.size();
        system.testclass.HashMap.Entry[] entryArray51 = hashMap47.table;
        hashMap47.clear();
        system.testclass.HashMap.Entry[] entryArray53 = hashMap47.table;
        hashMap46.table = entryArray53;
        hashMap35.table = entryArray53;
        java.lang.Object obj56 = hashMap33.remove((java.lang.Object) entryArray53);
        java.lang.Object obj57 = hashMap2.put(obj30, (java.lang.Object) hashMap33);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test70");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        int int5 = hashMap3.size();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.modCount;
        int int8 = hashMap6.modCount;
        int int9 = hashMap6.size();
        system.testclass.HashMap.Entry[] entryArray10 = hashMap6.table;
        hashMap3.table = entryArray10;
        system.testclass.HashMap.Entry[] entryArray12 = hashMap3.table;
        java.lang.Object obj13 = hashMap0.get((java.lang.Object) hashMap3);
        int int14 = hashMap3.modCount;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        hashMap15.modCount = 0;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        int int19 = hashMap18.modCount;
        int int20 = hashMap18.modCount;
        system.testclass.HashMap.Entry[] entryArray21 = hashMap18.table;
        system.testclass.HashMap.Entry[] entryArray22 = hashMap18.table;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        int int24 = hashMap23.modCount;
        int int25 = hashMap23.modCount;
        int int26 = hashMap23.size();
        system.testclass.HashMap.Entry[] entryArray27 = new system.testclass.HashMap.Entry[] {};
        hashMap23.table = entryArray27;
        hashMap18.table = entryArray27;
        hashMap18.clear();
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        int int32 = hashMap31.modCount;
        int int33 = hashMap31.modCount;
        hashMap31.clear();
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        boolean boolean36 = hashMap35.isEmpty();
        int int37 = hashMap35.size();
        hashMap35.modCount = '4';
        java.lang.Object obj40 = hashMap31.remove((java.lang.Object) hashMap35);
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj44 = hashMap35.remove((java.lang.Object) 0);
        java.lang.Object obj46 = hashMap35.get((java.lang.Object) '#');
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap();
        boolean boolean48 = hashMap47.isEmpty();
        java.lang.Object obj49 = hashMap35.get((java.lang.Object) boolean48);
        hashMap35.modCount = 0;
        system.testclass.HashMap hashMap53 = new system.testclass.HashMap(10);
        boolean boolean54 = hashMap53.isEmpty();
        system.testclass.HashMap.Entry[] entryArray55 = new system.testclass.HashMap.Entry[] {};
        hashMap53.table = entryArray55;
        java.lang.Object obj57 = hashMap35.remove((java.lang.Object) entryArray55);
        hashMap18.table = entryArray55;
        java.lang.Object obj59 = hashMap3.put((java.lang.Object) 0, (java.lang.Object) entryArray55);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap3", hashMap3.property_2());
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test71");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        int int3 = hashMap2.size();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        system.testclass.HashMap.Entry[] entryArray7 = hashMap4.table;
        hashMap2.table = entryArray7;
        hashMap2.clear();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap((int) '4', (float) 10L);
        boolean boolean13 = hashMap12.isEmpty();
        hashMap12.clear();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        int int16 = hashMap15.modCount;
        int int17 = hashMap15.modCount;
        int int18 = hashMap15.size();
        java.lang.Object obj19 = hashMap12.remove((java.lang.Object) hashMap15);
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        int int23 = hashMap22.modCount;
        hashMap22.clear();
        int int25 = hashMap22.size();
        hashMap22.modCount = 2;
        java.lang.Object obj28 = hashMap12.get((java.lang.Object) hashMap22);
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap((int) '4', (float) 10L);
        boolean boolean32 = hashMap31.isEmpty();
        hashMap31.clear();
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        int int35 = hashMap34.modCount;
        int int36 = hashMap34.modCount;
        int int37 = hashMap34.size();
        java.lang.Object obj38 = hashMap31.remove((java.lang.Object) hashMap34);
        hashMap34.modCount = (byte) -1;
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap(0, (float) 10L);
        int int44 = hashMap43.size();
        int int45 = hashMap43.modCount;
        system.testclass.HashMap.Entry entry46 = null;
        system.testclass.HashMap.Entry[] entryArray47 = new system.testclass.HashMap.Entry[] { entry46 };
        hashMap43.table = entryArray47;
        hashMap43.modCount = (byte) 100;
        system.testclass.HashMap hashMap53 = new system.testclass.HashMap(0, (float) 10L);
        int int54 = hashMap53.size();
        int int55 = hashMap53.modCount;
        system.testclass.HashMap.Entry entry56 = null;
        system.testclass.HashMap.Entry[] entryArray57 = new system.testclass.HashMap.Entry[] { entry56 };
        hashMap53.table = entryArray57;
        hashMap53.modCount = (byte) 100;
        system.testclass.HashMap hashMap61 = new system.testclass.HashMap();
        int int62 = hashMap61.modCount;
        int int63 = hashMap61.modCount;
        hashMap61.clear();
        system.testclass.HashMap hashMap65 = new system.testclass.HashMap();
        boolean boolean66 = hashMap65.isEmpty();
        int int67 = hashMap65.size();
        hashMap65.modCount = '4';
        java.lang.Object obj70 = hashMap61.remove((java.lang.Object) hashMap65);
        system.testclass.HashMap hashMap73 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj74 = hashMap65.remove((java.lang.Object) 0);
        java.lang.Object obj76 = hashMap65.get((java.lang.Object) '#');
        system.testclass.HashMap hashMap77 = new system.testclass.HashMap();
        boolean boolean78 = hashMap77.isEmpty();
        java.lang.Object obj79 = hashMap65.get((java.lang.Object) boolean78);
        hashMap65.modCount = 0;
        system.testclass.HashMap hashMap83 = new system.testclass.HashMap(10);
        boolean boolean84 = hashMap83.isEmpty();
        system.testclass.HashMap.Entry[] entryArray85 = new system.testclass.HashMap.Entry[] {};
        hashMap83.table = entryArray85;
        java.lang.Object obj87 = hashMap65.remove((java.lang.Object) entryArray85);
        hashMap53.table = entryArray85;
        java.lang.Object obj89 = hashMap43.remove((java.lang.Object) entryArray85);
        java.lang.Object obj90 = hashMap34.remove((java.lang.Object) entryArray85);
        java.lang.Object obj91 = hashMap2.put((java.lang.Object) hashMap12, (java.lang.Object) hashMap34);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test72");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        int int3 = hashMap2.size();
        int int4 = hashMap2.modCount;
        system.testclass.HashMap.Entry entry5 = null;
        system.testclass.HashMap.Entry[] entryArray6 = new system.testclass.HashMap.Entry[] { entry5 };
        hashMap2.table = entryArray6;
        hashMap2.modCount = (byte) 100;
        boolean boolean10 = hashMap2.isEmpty();
        hashMap2.clear();
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap((int) (short) 0, (float) (byte) 100);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        int int19 = hashMap18.modCount;
        int int20 = hashMap18.modCount;
        system.testclass.HashMap.Entry[] entryArray21 = hashMap18.table;
        java.lang.Object obj22 = hashMap17.get((java.lang.Object) entryArray21);
        int int23 = hashMap17.size();
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        boolean boolean25 = hashMap24.isEmpty();
        int int26 = hashMap24.size();
        hashMap24.modCount = '4';
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        int int30 = hashMap29.modCount;
        int int31 = hashMap29.modCount;
        hashMap29.clear();
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        boolean boolean34 = hashMap33.isEmpty();
        int int35 = hashMap33.size();
        hashMap33.modCount = '4';
        java.lang.Object obj38 = hashMap29.remove((java.lang.Object) hashMap33);
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj42 = hashMap33.remove((java.lang.Object) 0);
        java.lang.Object obj44 = hashMap33.get((java.lang.Object) '#');
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap();
        int int49 = hashMap48.modCount;
        int int50 = hashMap48.modCount;
        system.testclass.HashMap.Entry[] entryArray51 = hashMap48.table;
        java.lang.Object obj52 = hashMap47.get((java.lang.Object) entryArray51);
        hashMap33.table = entryArray51;
        hashMap24.table = entryArray51;
        system.testclass.HashMap hashMap55 = new system.testclass.HashMap();
        boolean boolean56 = hashMap55.isEmpty();
        int int57 = hashMap55.size();
        hashMap55.modCount = '4';
        system.testclass.HashMap hashMap60 = new system.testclass.HashMap();
        int int61 = hashMap60.modCount;
        int int62 = hashMap60.modCount;
        hashMap60.clear();
        system.testclass.HashMap hashMap64 = new system.testclass.HashMap();
        boolean boolean65 = hashMap64.isEmpty();
        int int66 = hashMap64.size();
        hashMap64.modCount = '4';
        java.lang.Object obj69 = hashMap60.remove((java.lang.Object) hashMap64);
        system.testclass.HashMap hashMap72 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj73 = hashMap64.remove((java.lang.Object) 0);
        java.lang.Object obj75 = hashMap64.get((java.lang.Object) '#');
        system.testclass.HashMap hashMap78 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap79 = new system.testclass.HashMap();
        int int80 = hashMap79.modCount;
        int int81 = hashMap79.modCount;
        system.testclass.HashMap.Entry[] entryArray82 = hashMap79.table;
        java.lang.Object obj83 = hashMap78.get((java.lang.Object) entryArray82);
        hashMap64.table = entryArray82;
        hashMap55.table = entryArray82;
        hashMap24.table = entryArray82;
        hashMap17.table = entryArray82;
        int int88 = hashMap17.size();
        java.lang.Object obj89 = hashMap2.put((java.lang.Object) (short) 0, (java.lang.Object) hashMap17);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test73");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 0, (float) (byte) 100);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap(0, (float) 10L);
        int int6 = hashMap5.size();
        int int7 = hashMap5.modCount;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap(0, (float) 10L);
        int int11 = hashMap10.size();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        int int13 = hashMap12.modCount;
        int int14 = hashMap12.modCount;
        system.testclass.HashMap.Entry[] entryArray15 = hashMap12.table;
        hashMap10.table = entryArray15;
        java.lang.Object obj17 = hashMap5.get((java.lang.Object) hashMap10);
        hashMap5.clear();
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        boolean boolean20 = hashMap19.isEmpty();
        boolean boolean21 = hashMap19.isEmpty();
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        boolean boolean23 = hashMap22.isEmpty();
        int int24 = hashMap22.size();
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        int int29 = hashMap28.modCount;
        int int30 = hashMap28.modCount;
        system.testclass.HashMap.Entry[] entryArray31 = hashMap28.table;
        java.lang.Object obj32 = hashMap27.get((java.lang.Object) entryArray31);
        java.lang.Object obj33 = hashMap22.get((java.lang.Object) entryArray31);
        hashMap19.table = entryArray31;
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        int int36 = hashMap35.modCount;
        int int37 = hashMap35.modCount;
        system.testclass.HashMap.Entry[] entryArray38 = hashMap35.table;
        hashMap35.clear();
        system.testclass.HashMap.Entry[] entryArray40 = hashMap35.table;
        hashMap19.table = entryArray40;
        java.lang.Object obj42 = hashMap5.get((java.lang.Object) hashMap19);
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap();
        int int44 = hashMap43.modCount;
        int int45 = hashMap43.modCount;
        hashMap43.clear();
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap();
        boolean boolean48 = hashMap47.isEmpty();
        int int49 = hashMap47.size();
        hashMap47.modCount = '4';
        java.lang.Object obj52 = hashMap43.remove((java.lang.Object) hashMap47);
        system.testclass.HashMap hashMap55 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj56 = hashMap47.remove((java.lang.Object) 0);
        java.lang.Object obj58 = hashMap47.get((java.lang.Object) '#');
        system.testclass.HashMap hashMap61 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap62 = new system.testclass.HashMap();
        int int63 = hashMap62.modCount;
        int int64 = hashMap62.modCount;
        system.testclass.HashMap.Entry[] entryArray65 = hashMap62.table;
        java.lang.Object obj66 = hashMap61.get((java.lang.Object) entryArray65);
        hashMap47.table = entryArray65;
        hashMap5.table = entryArray65;
        int int69 = hashMap5.modCount;
        system.testclass.HashMap hashMap72 = new system.testclass.HashMap((int) '4', (float) 10L);
        java.lang.Object obj74 = hashMap72.remove((java.lang.Object) '#');
        java.lang.Object obj75 = hashMap5.get((java.lang.Object) hashMap72);
        hashMap5.modCount = '4';
        system.testclass.HashMap hashMap79 = new system.testclass.HashMap(10);
        int int80 = hashMap79.modCount;
        java.lang.Object obj81 = hashMap2.put((java.lang.Object) '4', (java.lang.Object) int80);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap2", hashMap2.property_2());
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test74");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        hashMap0.clear();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        int int6 = hashMap4.size();
        hashMap4.modCount = '4';
        java.lang.Object obj9 = hashMap0.remove((java.lang.Object) hashMap4);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj13 = hashMap4.remove((java.lang.Object) 0);
        java.lang.Object obj15 = hashMap4.get((java.lang.Object) '#');
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        boolean boolean17 = hashMap16.isEmpty();
        java.lang.Object obj18 = hashMap4.get((java.lang.Object) boolean17);
        hashMap4.modCount = 0;
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap(10);
        boolean boolean23 = hashMap22.isEmpty();
        system.testclass.HashMap.Entry[] entryArray24 = new system.testclass.HashMap.Entry[] {};
        hashMap22.table = entryArray24;
        java.lang.Object obj26 = hashMap4.remove((java.lang.Object) entryArray24);
        system.testclass.HashMap.Entry[] entryArray27 = hashMap4.table;
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        hashMap29.modCount = 0;
        hashMap29.modCount = 100;
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap(0, 100.0f);
        int int37 = hashMap36.modCount;
        hashMap36.modCount = '4';
        java.lang.Object obj40 = hashMap29.remove((java.lang.Object) '4');
        system.testclass.HashMap.Entry[] entryArray41 = hashMap29.table;
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap(10);
        boolean boolean44 = hashMap43.isEmpty();
        int int45 = hashMap43.modCount;
        hashMap43.clear();
        java.lang.Object obj47 = hashMap29.get((java.lang.Object) hashMap43);
        java.lang.Object obj48 = hashMap4.put((java.lang.Object) 100L, (java.lang.Object) hashMap43);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap4", hashMap4.property_2());
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test75");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        hashMap0.clear();
        hashMap0.modCount = 'a';
        java.lang.Object obj8 = hashMap0.remove((java.lang.Object) (-1.0f));
        boolean boolean9 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap(0, (float) 10L);
        int int13 = hashMap12.size();
        int int14 = hashMap12.modCount;
        system.testclass.HashMap.Entry entry15 = null;
        system.testclass.HashMap.Entry[] entryArray16 = new system.testclass.HashMap.Entry[] { entry15 };
        hashMap12.table = entryArray16;
        hashMap12.modCount = (byte) 100;
        boolean boolean20 = hashMap12.isEmpty();
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        int int22 = hashMap21.modCount;
        int int23 = hashMap21.modCount;
        int int24 = hashMap21.size();
        system.testclass.HashMap.Entry[] entryArray25 = hashMap21.table;
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap(0, (float) 10L);
        int int29 = hashMap28.size();
        int int30 = hashMap28.modCount;
        system.testclass.HashMap.Entry entry31 = null;
        system.testclass.HashMap.Entry[] entryArray32 = new system.testclass.HashMap.Entry[] { entry31 };
        hashMap28.table = entryArray32;
        hashMap28.modCount = (byte) 100;
        java.lang.Object obj36 = hashMap21.get((java.lang.Object) hashMap28);
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap((int) '#', (float) 'a');
        java.lang.Object obj40 = hashMap28.get((java.lang.Object) hashMap39);
        int int41 = hashMap39.modCount;
        system.testclass.HashMap.Entry[] entryArray42 = hashMap39.table;
        java.lang.Object obj43 = hashMap0.put((java.lang.Object) hashMap12, (java.lang.Object) hashMap39);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap0", hashMap0.property_2());
    }
}

