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
        boolean boolean1 = hashMap0.property_2();
        boolean boolean2 = hashMap0.property_2();
        hashMap0.clear();
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) 'a', (java.lang.Object) (short) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray7 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap0.table = entryArray7;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for hashMap0", hashMap0.property_3());
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap(1);
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        boolean boolean3 = hashMap2.property_2();
        boolean boolean4 = hashMap2.property_2();
        hashMap2.clear();
        java.lang.Object obj8 = hashMap2.put((java.lang.Object) 'a', (java.lang.Object) (short) 10);
        int int9 = hashMap2.modCount;
        java.lang.Object obj11 = hashMap2.remove((java.lang.Object) 10L);
        int int12 = hashMap2.size();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap2.table;
        hashMap1.table = entryArray13;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for hashMap1", hashMap1.property_3());
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.property_2();
        hashMap0.modCount = '4';
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        boolean boolean5 = hashMap4.property_2();
        hashMap4.modCount = '4';
        boolean boolean8 = hashMap4.property();
        int int9 = hashMap4.modCount;
        java.lang.Object obj10 = hashMap0.remove((java.lang.Object) hashMap4);
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap0.table;
        boolean boolean12 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        boolean boolean14 = hashMap13.property_2();
        boolean boolean15 = hashMap13.property_2();
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        boolean boolean17 = hashMap16.property_2();
        boolean boolean18 = hashMap16.property_2();
        boolean boolean19 = hashMap16.property();
        java.lang.Object obj20 = hashMap13.get((java.lang.Object) hashMap16);
        boolean boolean21 = hashMap16.property_2();
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        boolean boolean23 = hashMap22.property_2();
        boolean boolean24 = hashMap22.property_2();
        hashMap22.clear();
        java.lang.Object obj28 = hashMap22.put((java.lang.Object) 'a', (java.lang.Object) (short) 10);
        hashMap22.modCount = (byte) 10;
        boolean boolean31 = hashMap22.isEmpty();
        java.lang.Object obj33 = hashMap22.get((java.lang.Object) 2);
        java.lang.Object obj34 = hashMap0.put((java.lang.Object) boolean21, (java.lang.Object) 2);
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap36 = new system.classfixer.classes.HashMap();
        boolean boolean37 = hashMap36.property_2();
        boolean boolean38 = hashMap36.property_2();
        hashMap36.clear();
        java.lang.Object obj40 = hashMap35.get((java.lang.Object) hashMap36);
        boolean boolean41 = hashMap35.property();
        java.lang.Object obj42 = hashMap0.remove((java.lang.Object) hashMap35);
        hashMap35.clear();
        system.classfixer.classes.HashMap hashMap44 = new system.classfixer.classes.HashMap();
        boolean boolean45 = hashMap44.property_2();
        hashMap44.modCount = '4';
        java.lang.Object obj49 = hashMap44.remove((java.lang.Object) 1.0f);
        hashMap44.clear();
        system.classfixer.classes.HashMap hashMap52 = new system.classfixer.classes.HashMap();
        boolean boolean53 = hashMap52.property_2();
        boolean boolean54 = hashMap52.property_2();
        hashMap52.clear();
        java.lang.Object obj58 = hashMap52.put((java.lang.Object) 'a', (java.lang.Object) (short) 10);
        boolean boolean59 = hashMap52.property();
        java.lang.Object obj60 = hashMap44.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap52);
        boolean boolean61 = hashMap44.repOK();
        int int62 = hashMap44.size();
        system.classfixer.classes.HashMap.Entry[] entryArray63 = hashMap44.table;
        hashMap35.table = entryArray63;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for hashMap35", hashMap35.property_3());
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.property_2();
        hashMap0.modCount = '4';
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) 1.0f);
        boolean boolean6 = hashMap0.property();
        boolean boolean7 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.property_2();
        hashMap8.modCount = '4';
        java.lang.Object obj13 = hashMap8.remove((java.lang.Object) 1.0f);
        boolean boolean14 = hashMap8.property();
        boolean boolean15 = hashMap8.property_2();
        hashMap8.modCount = ' ';
        boolean boolean18 = hashMap8.repOK();
        boolean boolean19 = hashMap8.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray20 = hashMap8.table;
        hashMap8.clear();
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        boolean boolean23 = hashMap22.property_2();
        hashMap22.modCount = '4';
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap();
        boolean boolean27 = hashMap26.property_2();
        hashMap26.modCount = '4';
        java.lang.Object obj31 = hashMap26.remove((java.lang.Object) 1.0f);
        boolean boolean32 = hashMap26.property();
        hashMap26.clear();
        java.lang.Object obj34 = hashMap22.remove((java.lang.Object) hashMap26);
        java.lang.Object obj35 = hashMap0.put((java.lang.Object) hashMap8, (java.lang.Object) hashMap22);
        boolean boolean36 = hashMap0.isEmpty();
        int int37 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap38 = new system.classfixer.classes.HashMap();
        boolean boolean39 = hashMap38.property_2();
        hashMap38.modCount = '4';
        system.classfixer.classes.HashMap hashMap42 = new system.classfixer.classes.HashMap();
        boolean boolean43 = hashMap42.property_2();
        hashMap42.modCount = '4';
        boolean boolean46 = hashMap42.property();
        int int47 = hashMap42.modCount;
        java.lang.Object obj48 = hashMap38.remove((java.lang.Object) hashMap42);
        system.classfixer.classes.HashMap hashMap49 = new system.classfixer.classes.HashMap();
        boolean boolean50 = hashMap49.property_2();
        hashMap49.modCount = '4';
        java.lang.Object obj54 = hashMap49.remove((java.lang.Object) 1.0f);
        boolean boolean55 = hashMap49.property();
        boolean boolean56 = hashMap49.property_2();
        hashMap49.modCount = ' ';
        boolean boolean59 = hashMap49.repOK();
        boolean boolean60 = hashMap49.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray61 = hashMap49.table;
        hashMap42.table = entryArray61;
        hashMap0.table = entryArray61;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for hashMap0", hashMap0.property_3());
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap();
        boolean boolean2 = hashMap1.property_2();
        boolean boolean3 = hashMap1.property_2();
        hashMap1.clear();
        java.lang.Object obj5 = hashMap0.get((java.lang.Object) hashMap1);
        java.lang.Object obj7 = hashMap1.remove((java.lang.Object) (byte) 1);
        int int8 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        boolean boolean11 = hashMap10.property_2();
        boolean boolean12 = hashMap10.property_2();
        hashMap10.clear();
        java.lang.Object obj14 = hashMap9.get((java.lang.Object) hashMap10);
        java.lang.Object obj16 = hashMap10.remove((java.lang.Object) (byte) 1);
        int int17 = hashMap10.size();
        boolean boolean18 = hashMap10.repOK();
        hashMap10.clear();
        java.lang.Object obj21 = hashMap1.put((java.lang.Object) hashMap10, (java.lang.Object) 0.0d);
        int int22 = hashMap10.modCount;
        boolean boolean23 = hashMap10.property();
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap();
        boolean boolean25 = hashMap24.property_2();
        hashMap24.modCount = '4';
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap();
        boolean boolean29 = hashMap28.property_2();
        hashMap28.modCount = '4';
        java.lang.Object obj33 = hashMap28.remove((java.lang.Object) 1.0f);
        boolean boolean34 = hashMap28.property();
        boolean boolean35 = hashMap28.property();
        system.classfixer.classes.HashMap hashMap36 = new system.classfixer.classes.HashMap();
        boolean boolean37 = hashMap36.property_2();
        hashMap36.modCount = '4';
        hashMap36.clear();
        system.classfixer.classes.HashMap hashMap41 = new system.classfixer.classes.HashMap();
        boolean boolean42 = hashMap41.property_2();
        hashMap41.modCount = (byte) 1;
        system.classfixer.classes.HashMap hashMap45 = new system.classfixer.classes.HashMap();
        boolean boolean46 = hashMap45.property_2();
        boolean boolean47 = hashMap45.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray48 = hashMap45.table;
        hashMap41.table = entryArray48;
        hashMap36.table = entryArray48;
        hashMap28.table = entryArray48;
        java.lang.Object obj52 = hashMap24.get((java.lang.Object) hashMap28);
        system.classfixer.classes.HashMap.Entry[] entryArray53 = hashMap28.table;
        hashMap10.table = entryArray53;
        system.classfixer.classes.HashMap hashMap55 = new system.classfixer.classes.HashMap();
        boolean boolean56 = hashMap55.property_2();
        boolean boolean57 = hashMap55.property_2();
        hashMap55.clear();
        java.lang.Object obj61 = hashMap55.put((java.lang.Object) 'a', (java.lang.Object) (short) 10);
        boolean boolean62 = hashMap55.property();
        boolean boolean63 = hashMap55.property();
        system.classfixer.classes.HashMap.Entry[] entryArray64 = hashMap55.table;
        hashMap10.table = entryArray64;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for hashMap10", hashMap10.property_3());
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.property_2();
        hashMap0.modCount = '4';
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) 1.0f);
        hashMap0.clear();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.property_2();
        boolean boolean10 = hashMap8.property_2();
        hashMap8.clear();
        java.lang.Object obj14 = hashMap8.put((java.lang.Object) 'a', (java.lang.Object) (short) 10);
        boolean boolean15 = hashMap8.property();
        java.lang.Object obj16 = hashMap0.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap8);
        boolean boolean17 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        boolean boolean19 = hashMap18.property_2();
        boolean boolean20 = hashMap18.property_2();
        hashMap18.clear();
        java.lang.Object obj24 = hashMap18.put((java.lang.Object) 'a', (java.lang.Object) (short) 10);
        boolean boolean25 = hashMap18.property();
        java.lang.Object obj27 = hashMap0.put((java.lang.Object) hashMap18, (java.lang.Object) 10.0f);
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap();
        boolean boolean29 = hashMap28.property_2();
        hashMap28.modCount = 0;
        boolean boolean32 = hashMap28.repOK();
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap();
        boolean boolean34 = hashMap33.property_2();
        boolean boolean35 = hashMap33.property_2();
        system.classfixer.classes.HashMap.Entry[] entryArray36 = hashMap33.table;
        system.classfixer.classes.HashMap hashMap38 = new system.classfixer.classes.HashMap((int) (short) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray39 = hashMap38.table;
        java.lang.Object obj40 = hashMap28.put((java.lang.Object) hashMap33, (java.lang.Object) entryArray39);
        hashMap18.table = entryArray39;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for hashMap18", hashMap18.property_3());
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.property_2();
        hashMap0.modCount = '4';
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) 1.0f);
        boolean boolean6 = hashMap0.property();
        hashMap0.clear();
        hashMap0.modCount = (-1);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        boolean boolean11 = hashMap10.property_2();
        hashMap10.modCount = '4';
        int int14 = hashMap10.modCount;
        hashMap10.modCount = ' ';
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        boolean boolean18 = hashMap17.property_2();
        hashMap17.modCount = '4';
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap();
        boolean boolean22 = hashMap21.property_2();
        hashMap21.modCount = '4';
        java.lang.Object obj26 = hashMap21.remove((java.lang.Object) 1.0f);
        boolean boolean27 = hashMap21.property();
        boolean boolean28 = hashMap21.property();
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap();
        boolean boolean30 = hashMap29.property_2();
        hashMap29.modCount = '4';
        hashMap29.clear();
        system.classfixer.classes.HashMap hashMap34 = new system.classfixer.classes.HashMap();
        boolean boolean35 = hashMap34.property_2();
        hashMap34.modCount = (byte) 1;
        system.classfixer.classes.HashMap hashMap38 = new system.classfixer.classes.HashMap();
        boolean boolean39 = hashMap38.property_2();
        boolean boolean40 = hashMap38.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray41 = hashMap38.table;
        hashMap34.table = entryArray41;
        hashMap29.table = entryArray41;
        hashMap21.table = entryArray41;
        java.lang.Object obj45 = hashMap17.get((java.lang.Object) hashMap21);
        boolean boolean46 = hashMap17.property();
        system.classfixer.classes.HashMap hashMap47 = new system.classfixer.classes.HashMap();
        boolean boolean48 = hashMap47.property_2();
        hashMap47.modCount = 0;
        boolean boolean51 = hashMap47.repOK();
        system.classfixer.classes.HashMap hashMap52 = new system.classfixer.classes.HashMap();
        boolean boolean53 = hashMap52.property_2();
        boolean boolean54 = hashMap52.property_2();
        system.classfixer.classes.HashMap.Entry[] entryArray55 = hashMap52.table;
        system.classfixer.classes.HashMap hashMap57 = new system.classfixer.classes.HashMap((int) (short) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray58 = hashMap57.table;
        java.lang.Object obj59 = hashMap47.put((java.lang.Object) hashMap52, (java.lang.Object) entryArray58);
        java.lang.Object obj60 = hashMap10.put((java.lang.Object) hashMap17, (java.lang.Object) hashMap47);
        system.classfixer.classes.HashMap.Entry[] entryArray61 = hashMap47.table;
        hashMap0.table = entryArray61;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for hashMap0", hashMap0.property_3());
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.property_2();
        boolean boolean2 = hashMap0.property_2();
        hashMap0.clear();
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) 'a', (java.lang.Object) (short) 10);
        hashMap0.modCount = (byte) 10;
        boolean boolean9 = hashMap0.isEmpty();
        int int10 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap((int) (byte) 1, (float) 100L);
        java.lang.Object obj14 = hashMap0.remove((java.lang.Object) (byte) 1);
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        boolean boolean16 = hashMap15.property_2();
        hashMap15.modCount = '4';
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        boolean boolean20 = hashMap19.property_2();
        hashMap19.modCount = '4';
        boolean boolean23 = hashMap19.property();
        int int24 = hashMap19.modCount;
        java.lang.Object obj25 = hashMap15.remove((java.lang.Object) hashMap19);
        system.classfixer.classes.HashMap.Entry[] entryArray26 = hashMap15.table;
        system.classfixer.classes.HashMap.Entry[] entryArray27 = hashMap15.table;
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap();
        boolean boolean29 = hashMap28.property_2();
        boolean boolean30 = hashMap28.repOK();
        boolean boolean31 = hashMap28.isEmpty();
        java.lang.Object obj32 = hashMap0.put((java.lang.Object) hashMap15, (java.lang.Object) boolean31);
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap();
        boolean boolean34 = hashMap33.property_2();
        hashMap33.modCount = 0;
        boolean boolean37 = hashMap33.repOK();
        boolean boolean38 = hashMap33.property();
        hashMap33.modCount = (byte) 10;
        system.classfixer.classes.HashMap.Entry[] entryArray41 = hashMap33.table;
        java.lang.Class<?> wildcardClass42 = entryArray41.getClass();
        system.classfixer.classes.HashMap hashMap43 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap44 = new system.classfixer.classes.HashMap();
        boolean boolean45 = hashMap44.property_2();
        boolean boolean46 = hashMap44.property_2();
        hashMap44.clear();
        java.lang.Object obj48 = hashMap43.get((java.lang.Object) hashMap44);
        system.classfixer.classes.HashMap hashMap49 = new system.classfixer.classes.HashMap();
        boolean boolean50 = hashMap49.property_2();
        hashMap49.modCount = '4';
        java.lang.Object obj54 = hashMap49.remove((java.lang.Object) 1.0f);
        boolean boolean55 = hashMap49.property();
        boolean boolean56 = hashMap49.property_2();
        hashMap49.modCount = ' ';
        boolean boolean59 = hashMap49.repOK();
        boolean boolean60 = hashMap49.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray61 = hashMap49.table;
        system.classfixer.classes.HashMap hashMap62 = new system.classfixer.classes.HashMap();
        boolean boolean63 = hashMap62.property_2();
        hashMap62.modCount = '4';
        system.classfixer.classes.HashMap hashMap66 = new system.classfixer.classes.HashMap();
        boolean boolean67 = hashMap66.property_2();
        hashMap66.modCount = '4';
        boolean boolean70 = hashMap66.property();
        int int71 = hashMap66.modCount;
        java.lang.Object obj72 = hashMap62.remove((java.lang.Object) hashMap66);
        int int73 = hashMap62.size();
        hashMap62.modCount = (short) 10;
        system.classfixer.classes.HashMap.Entry[] entryArray76 = hashMap62.table;
        java.lang.Object obj77 = hashMap44.put((java.lang.Object) entryArray61, (java.lang.Object) hashMap62);
        hashMap44.modCount = (byte) 0;
        int int80 = hashMap44.modCount;
        java.lang.Object obj81 = hashMap15.put((java.lang.Object) wildcardClass42, (java.lang.Object) hashMap44);
        system.classfixer.classes.HashMap hashMap82 = new system.classfixer.classes.HashMap();
        boolean boolean83 = hashMap82.property_2();
        hashMap82.modCount = '4';
        hashMap82.clear();
        system.classfixer.classes.HashMap hashMap87 = new system.classfixer.classes.HashMap();
        boolean boolean88 = hashMap87.property_2();
        hashMap87.modCount = (byte) 1;
        system.classfixer.classes.HashMap hashMap91 = new system.classfixer.classes.HashMap();
        boolean boolean92 = hashMap91.property_2();
        boolean boolean93 = hashMap91.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray94 = hashMap91.table;
        hashMap87.table = entryArray94;
        hashMap82.table = entryArray94;
        system.classfixer.classes.HashMap.Entry[] entryArray97 = hashMap82.table;
        hashMap44.table = entryArray97;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for hashMap44", hashMap44.property_3());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.property_2();
        boolean boolean2 = hashMap0.property_2();
        hashMap0.clear();
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) 'a', (java.lang.Object) (short) 10);
        hashMap0.modCount = (byte) 10;
        boolean boolean9 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        boolean boolean11 = hashMap10.property_2();
        hashMap10.modCount = '4';
        hashMap10.clear();
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        boolean boolean16 = hashMap15.property_2();
        boolean boolean17 = hashMap15.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray18 = hashMap15.table;
        hashMap10.table = entryArray18;
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        boolean boolean21 = hashMap20.property_2();
        hashMap20.modCount = '4';
        hashMap20.clear();
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap();
        boolean boolean26 = hashMap25.property_2();
        boolean boolean27 = hashMap25.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray28 = hashMap25.table;
        hashMap20.table = entryArray28;
        hashMap10.table = entryArray28;
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap();
        boolean boolean32 = hashMap31.property_2();
        boolean boolean33 = hashMap31.property_2();
        hashMap31.clear();
        java.lang.Object obj37 = hashMap31.put((java.lang.Object) 'a', (java.lang.Object) (short) 10);
        int int38 = hashMap31.modCount;
        java.lang.Object obj39 = hashMap10.remove((java.lang.Object) int38);
        system.classfixer.classes.HashMap.Entry[] entryArray40 = hashMap10.table;
        hashMap0.table = entryArray40;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for hashMap0", hashMap0.property_3());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(0, (float) 100L);
        hashMap2.modCount = '4';
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        boolean boolean6 = hashMap5.property_2();
        boolean boolean7 = hashMap5.property_2();
        hashMap5.clear();
        java.lang.Object obj11 = hashMap5.put((java.lang.Object) 'a', (java.lang.Object) (short) 10);
        int int12 = hashMap5.modCount;
        java.lang.Object obj14 = hashMap5.remove((java.lang.Object) 10L);
        int int15 = hashMap5.modCount;
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        boolean boolean17 = hashMap16.property_2();
        boolean boolean18 = hashMap16.property_2();
        hashMap16.clear();
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        boolean boolean21 = hashMap20.property_2();
        boolean boolean22 = hashMap20.property_2();
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap();
        boolean boolean24 = hashMap23.property_2();
        boolean boolean25 = hashMap23.property_2();
        boolean boolean26 = hashMap23.property();
        java.lang.Object obj27 = hashMap20.get((java.lang.Object) hashMap23);
        boolean boolean28 = hashMap23.property_2();
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap();
        boolean boolean30 = hashMap29.property_2();
        boolean boolean31 = hashMap29.repOK();
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap();
        boolean boolean33 = hashMap32.property_2();
        hashMap32.modCount = '4';
        java.lang.Object obj37 = hashMap32.remove((java.lang.Object) 1.0f);
        boolean boolean38 = hashMap32.property();
        boolean boolean39 = hashMap32.property_2();
        hashMap32.modCount = ' ';
        boolean boolean42 = hashMap32.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray43 = hashMap32.table;
        int int44 = hashMap32.modCount;
        system.classfixer.classes.HashMap hashMap45 = new system.classfixer.classes.HashMap();
        boolean boolean46 = hashMap45.property_2();
        hashMap45.modCount = 0;
        boolean boolean49 = hashMap45.repOK();
        boolean boolean50 = hashMap45.property();
        java.lang.Object obj51 = hashMap32.get((java.lang.Object) boolean50);
        system.classfixer.classes.HashMap hashMap52 = new system.classfixer.classes.HashMap();
        boolean boolean53 = hashMap52.property_2();
        hashMap52.modCount = '4';
        int int56 = hashMap52.modCount;
        system.classfixer.classes.HashMap hashMap57 = new system.classfixer.classes.HashMap();
        boolean boolean58 = hashMap57.property_2();
        boolean boolean59 = hashMap57.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray60 = hashMap57.table;
        system.classfixer.classes.HashMap.Entry[] entryArray61 = hashMap57.table;
        java.lang.Object obj62 = hashMap32.put((java.lang.Object) hashMap52, (java.lang.Object) entryArray61);
        java.lang.Object obj63 = hashMap29.remove((java.lang.Object) hashMap52);
        java.lang.Object obj64 = hashMap16.put((java.lang.Object) boolean28, obj63);
        system.classfixer.classes.HashMap.Entry[] entryArray65 = hashMap16.table;
        hashMap5.table = entryArray65;
        hashMap2.table = entryArray65;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for hashMap2", hashMap2.property_3());
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.property_2();
        boolean boolean2 = hashMap0.property_2();
        hashMap0.clear();
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) 'a', (java.lang.Object) (short) 10);
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        boolean boolean8 = hashMap7.property_2();
        hashMap7.modCount = (byte) 1;
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        boolean boolean12 = hashMap11.property_2();
        boolean boolean13 = hashMap11.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray14 = hashMap11.table;
        hashMap7.table = entryArray14;
        java.lang.Object obj16 = hashMap0.get((java.lang.Object) hashMap7);
        java.lang.Object obj18 = hashMap0.get((java.lang.Object) (-1L));
        java.lang.Object obj19 = null;
        java.lang.Object obj20 = hashMap0.get(obj19);
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap();
        boolean boolean22 = hashMap21.property_2();
        hashMap21.modCount = '4';
        java.lang.Object obj26 = hashMap21.remove((java.lang.Object) 1.0f);
        boolean boolean27 = hashMap21.property();
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap();
        boolean boolean29 = hashMap28.property_2();
        boolean boolean30 = hashMap28.property_2();
        system.classfixer.classes.HashMap.Entry[] entryArray31 = hashMap28.table;
        java.lang.Object obj32 = hashMap21.get((java.lang.Object) entryArray31);
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap();
        boolean boolean34 = hashMap33.property_2();
        hashMap33.modCount = '4';
        hashMap33.clear();
        system.classfixer.classes.HashMap hashMap38 = new system.classfixer.classes.HashMap();
        boolean boolean39 = hashMap38.property_2();
        boolean boolean40 = hashMap38.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray41 = hashMap38.table;
        hashMap33.table = entryArray41;
        system.classfixer.classes.HashMap hashMap43 = new system.classfixer.classes.HashMap();
        boolean boolean44 = hashMap43.property_2();
        hashMap43.modCount = '4';
        hashMap43.clear();
        system.classfixer.classes.HashMap hashMap48 = new system.classfixer.classes.HashMap();
        boolean boolean49 = hashMap48.property_2();
        boolean boolean50 = hashMap48.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray51 = hashMap48.table;
        hashMap43.table = entryArray51;
        hashMap33.table = entryArray51;
        hashMap21.table = entryArray51;
        hashMap21.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray56 = hashMap21.table;
        hashMap0.table = entryArray56;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for hashMap0", hashMap0.property_3());
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.property_2();
        hashMap0.modCount = '4';
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        boolean boolean5 = hashMap4.property_2();
        hashMap4.modCount = '4';
        java.lang.Object obj9 = hashMap4.remove((java.lang.Object) 1.0f);
        boolean boolean10 = hashMap4.property();
        hashMap4.clear();
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap4);
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        boolean boolean14 = hashMap13.property_2();
        hashMap13.modCount = '4';
        java.lang.Object obj18 = hashMap13.remove((java.lang.Object) 1.0f);
        boolean boolean19 = hashMap13.property();
        hashMap13.clear();
        java.lang.Object obj21 = hashMap0.get((java.lang.Object) hashMap13);
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        boolean boolean23 = hashMap22.property_2();
        boolean boolean24 = hashMap22.property_2();
        system.classfixer.classes.HashMap.Entry[] entryArray25 = hashMap22.table;
        system.classfixer.classes.HashMap.Entry[] entryArray26 = hashMap22.table;
        hashMap13.table = entryArray26;
        boolean boolean28 = hashMap13.isEmpty();
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap();
        boolean boolean30 = hashMap29.property_2();
        boolean boolean31 = hashMap29.property_2();
        hashMap29.clear();
        java.lang.Object obj35 = hashMap29.put((java.lang.Object) 'a', (java.lang.Object) (short) 10);
        int int36 = hashMap29.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray37 = hashMap29.table;
        hashMap13.table = entryArray37;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for hashMap13", hashMap13.property_3());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.property_2();
        hashMap0.modCount = '4';
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) 1.0f);
        hashMap0.clear();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.property_2();
        boolean boolean10 = hashMap8.property_2();
        hashMap8.clear();
        java.lang.Object obj14 = hashMap8.put((java.lang.Object) 'a', (java.lang.Object) (short) 10);
        boolean boolean15 = hashMap8.property();
        java.lang.Object obj16 = hashMap0.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap8);
        boolean boolean17 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        boolean boolean19 = hashMap18.property_2();
        boolean boolean20 = hashMap18.property_2();
        hashMap18.clear();
        java.lang.Object obj24 = hashMap18.put((java.lang.Object) 'a', (java.lang.Object) (short) 10);
        boolean boolean25 = hashMap18.property();
        java.lang.Object obj27 = hashMap0.put((java.lang.Object) hashMap18, (java.lang.Object) 10.0f);
        hashMap0.modCount = 100;
        boolean boolean30 = hashMap0.repOK();
        boolean boolean31 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap();
        boolean boolean33 = hashMap32.property_2();
        boolean boolean34 = hashMap32.property_2();
        hashMap32.clear();
        java.lang.Object obj37 = hashMap32.remove((java.lang.Object) (byte) 1);
        hashMap32.modCount = (short) 100;
        system.classfixer.classes.HashMap.Entry[] entryArray40 = hashMap32.table;
        hashMap0.table = entryArray40;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for hashMap0", hashMap0.property_3());
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.property_2();
        hashMap0.modCount = '4';
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        boolean boolean5 = hashMap4.property_2();
        hashMap4.modCount = '4';
        boolean boolean8 = hashMap4.property();
        int int9 = hashMap4.modCount;
        java.lang.Object obj10 = hashMap0.remove((java.lang.Object) hashMap4);
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap0.table;
        boolean boolean12 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        boolean boolean14 = hashMap13.property_2();
        boolean boolean15 = hashMap13.property_2();
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        boolean boolean17 = hashMap16.property_2();
        boolean boolean18 = hashMap16.property_2();
        boolean boolean19 = hashMap16.property();
        java.lang.Object obj20 = hashMap13.get((java.lang.Object) hashMap16);
        boolean boolean21 = hashMap16.property_2();
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        boolean boolean23 = hashMap22.property_2();
        boolean boolean24 = hashMap22.property_2();
        hashMap22.clear();
        java.lang.Object obj28 = hashMap22.put((java.lang.Object) 'a', (java.lang.Object) (short) 10);
        hashMap22.modCount = (byte) 10;
        boolean boolean31 = hashMap22.isEmpty();
        java.lang.Object obj33 = hashMap22.get((java.lang.Object) 2);
        java.lang.Object obj34 = hashMap0.put((java.lang.Object) boolean21, (java.lang.Object) 2);
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap36 = new system.classfixer.classes.HashMap();
        boolean boolean37 = hashMap36.property_2();
        boolean boolean38 = hashMap36.property_2();
        hashMap36.clear();
        java.lang.Object obj40 = hashMap35.get((java.lang.Object) hashMap36);
        boolean boolean41 = hashMap35.property();
        java.lang.Object obj42 = hashMap0.remove((java.lang.Object) hashMap35);
        system.classfixer.classes.HashMap hashMap43 = new system.classfixer.classes.HashMap();
        boolean boolean44 = hashMap43.property_2();
        boolean boolean45 = hashMap43.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray46 = hashMap43.table;
        system.classfixer.classes.HashMap.Entry[] entryArray47 = hashMap43.table;
        hashMap0.table = entryArray47;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for hashMap0", hashMap0.property_3());
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.property_2();
        hashMap0.modCount = '4';
        java.lang.Object obj5 = hashMap0.remove((java.lang.Object) 1.0f);
        hashMap0.clear();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        boolean boolean9 = hashMap8.property_2();
        boolean boolean10 = hashMap8.property_2();
        hashMap8.clear();
        java.lang.Object obj14 = hashMap8.put((java.lang.Object) 'a', (java.lang.Object) (short) 10);
        boolean boolean15 = hashMap8.property();
        java.lang.Object obj16 = hashMap0.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap8);
        boolean boolean17 = hashMap8.isEmpty();
        hashMap8.modCount = 52;
        system.classfixer.classes.HashMap.Entry[] entryArray20 = hashMap8.table;
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap();
        boolean boolean22 = hashMap21.property_2();
        boolean boolean23 = hashMap21.property_2();
        hashMap21.clear();
        java.lang.Object obj27 = hashMap21.put((java.lang.Object) 'a', (java.lang.Object) (short) 10);
        hashMap21.modCount = (byte) 10;
        boolean boolean30 = hashMap21.isEmpty();
        hashMap21.modCount = (byte) 1;
        java.lang.Object obj33 = hashMap8.remove((java.lang.Object) hashMap21);
        system.classfixer.classes.HashMap hashMap36 = new system.classfixer.classes.HashMap(55, 1.0f);
        system.classfixer.classes.HashMap.Entry[] entryArray37 = hashMap36.table;
        hashMap21.table = entryArray37;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for hashMap21", hashMap21.property_3());
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 1);
        hashMap1.modCount = 100;
        boolean boolean4 = hashMap1.property_2();
        hashMap1.modCount = (-1);
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        boolean boolean8 = hashMap7.property_2();
        hashMap7.modCount = '4';
        boolean boolean11 = hashMap7.property();
        int int12 = hashMap7.modCount;
        boolean boolean13 = hashMap7.repOK();
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        boolean boolean15 = hashMap14.property_2();
        hashMap14.modCount = '4';
        java.lang.Object obj19 = hashMap14.remove((java.lang.Object) 1.0f);
        boolean boolean20 = hashMap14.property();
        boolean boolean21 = hashMap14.property_2();
        hashMap14.modCount = ' ';
        boolean boolean24 = hashMap14.repOK();
        boolean boolean25 = hashMap14.isEmpty();
        java.lang.Class<?> wildcardClass26 = hashMap14.getClass();
        java.lang.Object obj27 = hashMap1.put((java.lang.Object) hashMap7, (java.lang.Object) hashMap14);
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap();
        boolean boolean29 = hashMap28.property_2();
        boolean boolean30 = hashMap28.property_2();
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap();
        boolean boolean32 = hashMap31.property_2();
        boolean boolean33 = hashMap31.property_2();
        boolean boolean34 = hashMap31.property();
        java.lang.Object obj35 = hashMap28.get((java.lang.Object) hashMap31);
        hashMap28.modCount = (byte) -1;
        java.lang.Object obj38 = hashMap1.get((java.lang.Object) hashMap28);
        int int39 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap40 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap41 = new system.classfixer.classes.HashMap();
        boolean boolean42 = hashMap41.property_2();
        boolean boolean43 = hashMap41.property_2();
        hashMap41.clear();
        java.lang.Object obj45 = hashMap40.get((java.lang.Object) hashMap41);
        java.lang.Object obj47 = hashMap41.remove((java.lang.Object) (byte) 1);
        int int48 = hashMap41.size();
        boolean boolean49 = hashMap41.repOK();
        hashMap41.clear();
        system.classfixer.classes.HashMap hashMap51 = new system.classfixer.classes.HashMap();
        boolean boolean52 = hashMap51.property_2();
        hashMap51.modCount = '4';
        system.classfixer.classes.HashMap hashMap55 = new system.classfixer.classes.HashMap();
        boolean boolean56 = hashMap55.property_2();
        hashMap55.modCount = '4';
        java.lang.Object obj60 = hashMap55.remove((java.lang.Object) 1.0f);
        boolean boolean61 = hashMap55.property();
        boolean boolean62 = hashMap55.property();
        system.classfixer.classes.HashMap hashMap63 = new system.classfixer.classes.HashMap();
        boolean boolean64 = hashMap63.property_2();
        hashMap63.modCount = '4';
        hashMap63.clear();
        system.classfixer.classes.HashMap hashMap68 = new system.classfixer.classes.HashMap();
        boolean boolean69 = hashMap68.property_2();
        hashMap68.modCount = (byte) 1;
        system.classfixer.classes.HashMap hashMap72 = new system.classfixer.classes.HashMap();
        boolean boolean73 = hashMap72.property_2();
        boolean boolean74 = hashMap72.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray75 = hashMap72.table;
        hashMap68.table = entryArray75;
        hashMap63.table = entryArray75;
        hashMap55.table = entryArray75;
        java.lang.Object obj79 = hashMap51.get((java.lang.Object) hashMap55);
        system.classfixer.classes.HashMap.Entry[] entryArray80 = hashMap55.table;
        hashMap41.table = entryArray80;
        hashMap1.table = entryArray80;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for hashMap1", hashMap1.property_3());
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        boolean boolean1 = hashMap0.property_2();
        hashMap0.modCount = '4';
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        boolean boolean5 = hashMap4.property_2();
        hashMap4.modCount = '4';
        boolean boolean8 = hashMap4.property();
        int int9 = hashMap4.modCount;
        java.lang.Object obj10 = hashMap0.remove((java.lang.Object) hashMap4);
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap0.table;
        boolean boolean12 = hashMap0.isEmpty();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        boolean boolean14 = hashMap13.property_2();
        hashMap13.modCount = '4';
        java.lang.Object obj18 = hashMap13.remove((java.lang.Object) 1.0f);
        hashMap13.clear();
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap();
        boolean boolean22 = hashMap21.property_2();
        boolean boolean23 = hashMap21.property_2();
        hashMap21.clear();
        java.lang.Object obj27 = hashMap21.put((java.lang.Object) 'a', (java.lang.Object) (short) 10);
        boolean boolean28 = hashMap21.property();
        java.lang.Object obj29 = hashMap13.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap21);
        boolean boolean30 = hashMap13.isEmpty();
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap();
        boolean boolean32 = hashMap31.property_2();
        boolean boolean33 = hashMap31.property_2();
        hashMap31.clear();
        java.lang.Object obj37 = hashMap31.put((java.lang.Object) 'a', (java.lang.Object) (short) 10);
        boolean boolean38 = hashMap31.property();
        java.lang.Object obj40 = hashMap13.put((java.lang.Object) hashMap31, (java.lang.Object) 10.0f);
        hashMap13.modCount = 100;
        boolean boolean43 = hashMap13.repOK();
        boolean boolean44 = hashMap13.isEmpty();
        system.classfixer.classes.HashMap hashMap45 = new system.classfixer.classes.HashMap();
        boolean boolean46 = hashMap45.property_2();
        hashMap45.modCount = '4';
        java.lang.Object obj50 = hashMap45.remove((java.lang.Object) 1.0f);
        hashMap45.clear();
        system.classfixer.classes.HashMap hashMap53 = new system.classfixer.classes.HashMap();
        boolean boolean54 = hashMap53.property_2();
        boolean boolean55 = hashMap53.property_2();
        hashMap53.clear();
        java.lang.Object obj59 = hashMap53.put((java.lang.Object) 'a', (java.lang.Object) (short) 10);
        boolean boolean60 = hashMap53.property();
        java.lang.Object obj61 = hashMap45.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap53);
        boolean boolean62 = hashMap53.isEmpty();
        hashMap53.modCount = 52;
        system.classfixer.classes.HashMap.Entry[] entryArray65 = hashMap53.table;
        system.classfixer.classes.HashMap hashMap67 = new system.classfixer.classes.HashMap((int) (short) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray68 = hashMap67.table;
        boolean boolean69 = hashMap67.property();
        system.classfixer.classes.HashMap.Entry[] entryArray70 = hashMap67.table;
        java.lang.Object obj71 = hashMap13.put((java.lang.Object) entryArray65, (java.lang.Object) hashMap67);
        hashMap0.table = entryArray65;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for hashMap0", hashMap0.property_3());
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (short) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray2 = hashMap1.table;
        boolean boolean3 = hashMap1.property();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        boolean boolean5 = hashMap4.property_2();
        boolean boolean6 = hashMap4.property_2();
        hashMap4.clear();
        java.lang.Object obj10 = hashMap4.put((java.lang.Object) 'a', (java.lang.Object) (short) 10);
        boolean boolean11 = hashMap4.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap4.table;
        hashMap1.table = entryArray12;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for hashMap1", hashMap1.property_3());
    }
}

