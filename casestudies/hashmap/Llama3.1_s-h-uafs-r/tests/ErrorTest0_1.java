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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        system.testclass.HashMap.Entry[] entryArray4 = hashMap0.table;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) (byte) 100);
        java.lang.Object obj8 = hashMap0.put((java.lang.Object) 100.0f, (java.lang.Object) (byte) 100);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap10", hashMap10.repOK_1());
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap5", hashMap5.repOK_1());
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap4", hashMap4.repOK_1());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap4", hashMap4.repOK_1());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
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
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap14", hashMap14.repOK_1());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        hashMap0.clear();
        hashMap0.modCount = (short) 1;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        int int9 = hashMap7.modCount;
        hashMap7.clear();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        boolean boolean12 = hashMap11.isEmpty();
        int int13 = hashMap11.size();
        hashMap11.modCount = '4';
        java.lang.Object obj16 = hashMap7.remove((java.lang.Object) hashMap11);
        java.lang.Object obj18 = hashMap11.remove((java.lang.Object) (-1.0d));
        int int19 = hashMap11.size();
        boolean boolean20 = hashMap11.isEmpty();
        int int21 = hashMap11.modCount;
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        int int23 = hashMap22.modCount;
        int int24 = hashMap22.modCount;
        hashMap22.clear();
        hashMap22.clear();
        system.testclass.HashMap.Entry[] entryArray27 = hashMap22.table;
        hashMap11.table = entryArray27;
        hashMap11.clear();
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        int int31 = hashMap30.modCount;
        int int32 = hashMap30.modCount;
        hashMap30.clear();
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        boolean boolean35 = hashMap34.isEmpty();
        int int36 = hashMap34.size();
        hashMap34.modCount = '4';
        java.lang.Object obj39 = hashMap30.remove((java.lang.Object) hashMap34);
        java.lang.Object obj41 = hashMap34.remove((java.lang.Object) (-1.0d));
        int int42 = hashMap34.size();
        boolean boolean43 = hashMap34.isEmpty();
        int int44 = hashMap34.modCount;
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        int int46 = hashMap45.modCount;
        int int47 = hashMap45.modCount;
        hashMap45.clear();
        hashMap45.clear();
        system.testclass.HashMap.Entry[] entryArray50 = hashMap45.table;
        hashMap34.table = entryArray50;
        hashMap34.clear();
        java.lang.Object obj53 = hashMap0.put((java.lang.Object) hashMap11, (java.lang.Object) hashMap34);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
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
        system.testclass.HashMap.Entry[] entryArray67 = hashMap44.table;
        java.lang.Class<?> wildcardClass68 = entryArray67.getClass();
        system.testclass.HashMap hashMap69 = new system.testclass.HashMap();
        int int70 = hashMap69.modCount;
        int int71 = hashMap69.modCount;
        system.testclass.HashMap.Entry[] entryArray72 = hashMap69.table;
        system.testclass.HashMap.Entry[] entryArray73 = hashMap69.table;
        java.lang.Object obj75 = hashMap69.get((java.lang.Object) 100);
        system.testclass.HashMap.Entry[] entryArray76 = hashMap69.table;
        int int77 = hashMap69.size();
        java.lang.Object obj78 = hashMap0.put((java.lang.Object) entryArray67, (java.lang.Object) int77);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
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
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        hashMap13.clear();
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        boolean boolean18 = hashMap17.isEmpty();
        int int19 = hashMap17.size();
        hashMap17.modCount = '4';
        java.lang.Object obj22 = hashMap13.remove((java.lang.Object) hashMap17);
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj26 = hashMap17.remove((java.lang.Object) 0);
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        boolean boolean28 = hashMap27.isEmpty();
        int int29 = hashMap27.size();
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        int int34 = hashMap33.modCount;
        int int35 = hashMap33.modCount;
        system.testclass.HashMap.Entry[] entryArray36 = hashMap33.table;
        java.lang.Object obj37 = hashMap32.get((java.lang.Object) entryArray36);
        java.lang.Object obj38 = hashMap27.get((java.lang.Object) entryArray36);
        java.lang.Object obj39 = hashMap17.remove((java.lang.Object) hashMap27);
        system.testclass.HashMap.Entry[] entryArray40 = hashMap17.table;
        int int41 = hashMap17.modCount;
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        int int46 = hashMap45.modCount;
        int int47 = hashMap45.modCount;
        system.testclass.HashMap.Entry[] entryArray48 = hashMap45.table;
        java.lang.Object obj49 = hashMap44.get((java.lang.Object) entryArray48);
        int int50 = hashMap44.size();
        int int51 = hashMap44.modCount;
        hashMap44.clear();
        java.lang.Object obj53 = hashMap0.put((java.lang.Object) hashMap17, (java.lang.Object) hashMap44);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.isEmpty();
        int int2 = hashMap0.size();
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        int int5 = hashMap3.size();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.modCount;
        int int8 = hashMap6.modCount;
        int int9 = hashMap6.size();
        system.testclass.HashMap.Entry[] entryArray10 = hashMap6.table;
        hashMap3.table = entryArray10;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap(0, (float) 10L);
        int int15 = hashMap14.size();
        int int16 = hashMap14.modCount;
        java.lang.Object obj17 = hashMap0.put((java.lang.Object) hashMap3, (java.lang.Object) int16);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
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
        java.lang.Object obj29 = hashMap0.get((java.lang.Object) hashMap17);
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        int int31 = hashMap30.modCount;
        int int32 = hashMap30.modCount;
        int int33 = hashMap30.size();
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap(0, (float) 10L);
        int int37 = hashMap36.size();
        int int38 = hashMap36.modCount;
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap(0, (float) 10L);
        int int42 = hashMap41.size();
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap();
        int int44 = hashMap43.modCount;
        int int45 = hashMap43.modCount;
        system.testclass.HashMap.Entry[] entryArray46 = hashMap43.table;
        hashMap41.table = entryArray46;
        java.lang.Object obj48 = hashMap36.get((java.lang.Object) hashMap41);
        hashMap36.clear();
        system.testclass.HashMap hashMap50 = new system.testclass.HashMap();
        boolean boolean51 = hashMap50.isEmpty();
        boolean boolean52 = hashMap50.isEmpty();
        system.testclass.HashMap hashMap53 = new system.testclass.HashMap();
        boolean boolean54 = hashMap53.isEmpty();
        int int55 = hashMap53.size();
        system.testclass.HashMap hashMap58 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap59 = new system.testclass.HashMap();
        int int60 = hashMap59.modCount;
        int int61 = hashMap59.modCount;
        system.testclass.HashMap.Entry[] entryArray62 = hashMap59.table;
        java.lang.Object obj63 = hashMap58.get((java.lang.Object) entryArray62);
        java.lang.Object obj64 = hashMap53.get((java.lang.Object) entryArray62);
        hashMap50.table = entryArray62;
        system.testclass.HashMap hashMap66 = new system.testclass.HashMap();
        int int67 = hashMap66.modCount;
        int int68 = hashMap66.modCount;
        system.testclass.HashMap.Entry[] entryArray69 = hashMap66.table;
        hashMap66.clear();
        system.testclass.HashMap.Entry[] entryArray71 = hashMap66.table;
        hashMap50.table = entryArray71;
        java.lang.Object obj73 = hashMap36.get((java.lang.Object) hashMap50);
        system.testclass.HashMap hashMap74 = new system.testclass.HashMap();
        int int75 = hashMap74.modCount;
        int int76 = hashMap74.modCount;
        system.testclass.HashMap hashMap77 = new system.testclass.HashMap();
        boolean boolean78 = hashMap77.isEmpty();
        int int79 = hashMap77.size();
        system.testclass.HashMap hashMap82 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap83 = new system.testclass.HashMap();
        int int84 = hashMap83.modCount;
        int int85 = hashMap83.modCount;
        system.testclass.HashMap.Entry[] entryArray86 = hashMap83.table;
        java.lang.Object obj87 = hashMap82.get((java.lang.Object) entryArray86);
        java.lang.Object obj88 = hashMap77.get((java.lang.Object) entryArray86);
        hashMap74.table = entryArray86;
        hashMap36.table = entryArray86;
        java.lang.Object obj91 = hashMap0.put((java.lang.Object) int33, (java.lang.Object) entryArray86);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
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
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap(0, (float) 10L);
        int int16 = hashMap15.size();
        int int17 = hashMap15.modCount;
        hashMap15.modCount = (byte) -1;
        java.lang.Class<?> wildcardClass20 = hashMap15.getClass();
        java.lang.Object obj22 = hashMap4.put((java.lang.Object) wildcardClass20, (java.lang.Object) 'a');
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap4", hashMap4.repOK_1());
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
        java.lang.Object obj11 = hashMap4.remove((java.lang.Object) (-1.0d));
        int int12 = hashMap4.size();
        hashMap4.clear();
        hashMap4.modCount = (short) -1;
        hashMap4.clear();
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        int int18 = hashMap17.modCount;
        int int19 = hashMap17.modCount;
        int int20 = hashMap17.size();
        system.testclass.HashMap.Entry[] entryArray21 = new system.testclass.HashMap.Entry[] {};
        hashMap17.table = entryArray21;
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap(100, 100.0f);
        system.testclass.HashMap.Entry[] entryArray26 = hashMap25.table;
        system.testclass.HashMap.Entry[] entryArray27 = hashMap25.table;
        java.lang.Object obj28 = hashMap4.put((java.lang.Object) entryArray21, (java.lang.Object) hashMap25);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap4", hashMap4.repOK_1());
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(52);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        boolean boolean3 = hashMap2.isEmpty();
        int int4 = hashMap2.size();
        hashMap2.modCount = '4';
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        int int9 = hashMap7.modCount;
        int int10 = hashMap7.size();
        java.lang.Object obj11 = hashMap2.get((java.lang.Object) int10);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        int int13 = hashMap12.modCount;
        int int14 = hashMap12.modCount;
        system.testclass.HashMap.Entry[] entryArray15 = hashMap12.table;
        boolean boolean16 = hashMap12.isEmpty();
        java.lang.Object obj17 = hashMap2.remove((java.lang.Object) hashMap12);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        int int19 = hashMap18.modCount;
        int int20 = hashMap18.modCount;
        int int21 = hashMap18.size();
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        int int23 = hashMap22.modCount;
        int int24 = hashMap22.modCount;
        system.testclass.HashMap.Entry[] entryArray25 = hashMap22.table;
        boolean boolean26 = hashMap22.isEmpty();
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        boolean boolean28 = hashMap27.isEmpty();
        int int29 = hashMap27.size();
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        int int34 = hashMap33.modCount;
        int int35 = hashMap33.modCount;
        system.testclass.HashMap.Entry[] entryArray36 = hashMap33.table;
        java.lang.Object obj37 = hashMap32.get((java.lang.Object) entryArray36);
        java.lang.Object obj38 = hashMap27.get((java.lang.Object) entryArray36);
        hashMap22.table = entryArray36;
        hashMap18.table = entryArray36;
        hashMap2.table = entryArray36;
        java.lang.Class<?> wildcardClass42 = hashMap2.getClass();
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap();
        boolean boolean44 = hashMap43.isEmpty();
        int int45 = hashMap43.size();
        system.testclass.HashMap hashMap46 = new system.testclass.HashMap();
        int int47 = hashMap46.modCount;
        int int48 = hashMap46.modCount;
        int int49 = hashMap46.size();
        system.testclass.HashMap.Entry[] entryArray50 = hashMap46.table;
        hashMap43.table = entryArray50;
        system.testclass.HashMap.Entry[] entryArray52 = hashMap43.table;
        java.lang.Object obj53 = hashMap1.put((java.lang.Object) hashMap2, (java.lang.Object) entryArray52);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        int int3 = hashMap0.size();
        system.testclass.HashMap.Entry[] entryArray4 = hashMap0.table;
        hashMap0.clear();
        system.testclass.HashMap.Entry[] entryArray6 = hashMap0.table;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        int int9 = hashMap7.modCount;
        hashMap7.clear();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        boolean boolean12 = hashMap11.isEmpty();
        int int13 = hashMap11.size();
        hashMap11.modCount = '4';
        java.lang.Object obj16 = hashMap7.remove((java.lang.Object) hashMap11);
        java.lang.Object obj18 = hashMap11.remove((java.lang.Object) (-1.0d));
        int int19 = hashMap11.size();
        hashMap11.clear();
        hashMap11.modCount = (short) -1;
        hashMap11.modCount = (short) 0;
        hashMap11.clear();
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        int int27 = hashMap26.modCount;
        int int28 = hashMap26.modCount;
        hashMap26.clear();
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        boolean boolean31 = hashMap30.isEmpty();
        int int32 = hashMap30.size();
        hashMap30.modCount = '4';
        java.lang.Object obj35 = hashMap26.remove((java.lang.Object) hashMap30);
        java.lang.Object obj37 = hashMap30.remove((java.lang.Object) (-1.0d));
        int int38 = hashMap30.size();
        boolean boolean39 = hashMap30.isEmpty();
        java.lang.Object obj40 = hashMap0.put((java.lang.Object) hashMap11, (java.lang.Object) hashMap30);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        system.testclass.HashMap.Entry[] entryArray6 = hashMap3.table;
        java.lang.Object obj7 = hashMap2.get((java.lang.Object) entryArray6);
        int int8 = hashMap2.size();
        int int9 = hashMap2.modCount;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap(0, (float) (short) 10);
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        int int14 = hashMap13.modCount;
        int int15 = hashMap13.modCount;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        boolean boolean17 = hashMap16.isEmpty();
        int int18 = hashMap16.size();
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        int int20 = hashMap19.modCount;
        int int21 = hashMap19.modCount;
        int int22 = hashMap19.size();
        system.testclass.HashMap.Entry[] entryArray23 = hashMap19.table;
        hashMap16.table = entryArray23;
        system.testclass.HashMap.Entry[] entryArray25 = hashMap16.table;
        java.lang.Object obj26 = hashMap13.get((java.lang.Object) hashMap16);
        system.testclass.HashMap.Entry[] entryArray27 = hashMap13.table;
        java.lang.Object obj28 = hashMap2.put((java.lang.Object) 0, (java.lang.Object) hashMap13);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        int int3 = hashMap2.modCount;
        int int4 = hashMap2.modCount;
        system.testclass.HashMap.Entry[] entryArray5 = hashMap2.table;
        system.testclass.HashMap.Entry[] entryArray6 = hashMap2.table;
        hashMap0.table = entryArray6;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.modCount;
        int int10 = hashMap8.modCount;
        system.testclass.HashMap.Entry[] entryArray11 = hashMap8.table;
        system.testclass.HashMap.Entry[] entryArray12 = hashMap8.table;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap(10);
        boolean boolean15 = hashMap14.isEmpty();
        int int16 = hashMap14.modCount;
        hashMap14.clear();
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        boolean boolean19 = hashMap18.isEmpty();
        int int20 = hashMap18.size();
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        int int22 = hashMap21.modCount;
        int int23 = hashMap21.modCount;
        int int24 = hashMap21.size();
        system.testclass.HashMap.Entry[] entryArray25 = hashMap21.table;
        hashMap18.table = entryArray25;
        system.testclass.HashMap.Entry[] entryArray27 = hashMap18.table;
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap((int) (byte) 1);
        java.lang.Object obj30 = hashMap18.remove((java.lang.Object) hashMap29);
        system.testclass.HashMap.Entry[] entryArray31 = hashMap29.table;
        hashMap14.table = entryArray31;
        java.lang.Object obj33 = hashMap0.put((java.lang.Object) hashMap8, (java.lang.Object) entryArray31);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        boolean boolean3 = hashMap2.isEmpty();
        hashMap2.clear();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        hashMap5.clear();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        boolean boolean10 = hashMap9.isEmpty();
        int int11 = hashMap9.size();
        hashMap9.modCount = '4';
        java.lang.Object obj14 = hashMap5.remove((java.lang.Object) hashMap9);
        java.lang.Object obj16 = hashMap9.remove((java.lang.Object) (-1.0d));
        int int17 = hashMap9.size();
        java.lang.Object obj18 = hashMap2.get((java.lang.Object) hashMap9);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        int int20 = hashMap19.modCount;
        int int21 = hashMap19.modCount;
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        boolean boolean23 = hashMap22.isEmpty();
        int int24 = hashMap22.size();
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        int int26 = hashMap25.modCount;
        int int27 = hashMap25.modCount;
        int int28 = hashMap25.size();
        system.testclass.HashMap.Entry[] entryArray29 = hashMap25.table;
        hashMap22.table = entryArray29;
        system.testclass.HashMap.Entry[] entryArray31 = hashMap22.table;
        java.lang.Object obj32 = hashMap19.get((java.lang.Object) hashMap22);
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap(53, (float) 10);
        java.lang.Object obj36 = hashMap9.put((java.lang.Object) hashMap19, (java.lang.Object) 10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap9", hashMap9.repOK_1());
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        hashMap0.modCount = 0;
        hashMap0.modCount = 100;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
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
        hashMap5.table = entryArray17;
        hashMap0.table = entryArray17;
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
        int int34 = hashMap22.modCount;
        hashMap22.clear();
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        int int37 = hashMap36.modCount;
        int int38 = hashMap36.modCount;
        int int39 = hashMap36.size();
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        int int41 = hashMap40.modCount;
        int int42 = hashMap40.modCount;
        system.testclass.HashMap.Entry[] entryArray43 = hashMap40.table;
        boolean boolean44 = hashMap40.isEmpty();
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
        hashMap40.table = entryArray54;
        hashMap36.table = entryArray54;
        int int59 = hashMap36.size();
        int int60 = hashMap36.modCount;
        java.lang.Object obj61 = hashMap0.put((java.lang.Object) hashMap22, (java.lang.Object) hashMap36);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        system.testclass.HashMap.Entry[] entryArray4 = hashMap0.table;
        java.lang.Object obj6 = hashMap0.get((java.lang.Object) 100);
        system.testclass.HashMap.Entry[] entryArray7 = hashMap0.table;
        int int8 = hashMap0.modCount;
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap(0, (float) 10L);
        int int12 = hashMap11.size();
        int int13 = hashMap11.modCount;
        system.testclass.HashMap.Entry[] entryArray14 = hashMap11.table;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap(0, (float) 10L);
        int int18 = hashMap17.size();
        int int19 = hashMap17.modCount;
        system.testclass.HashMap.Entry[] entryArray20 = hashMap17.table;
        hashMap11.table = entryArray20;
        int int22 = hashMap11.size();
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        int int24 = hashMap23.modCount;
        int int25 = hashMap23.modCount;
        system.testclass.HashMap.Entry[] entryArray26 = hashMap23.table;
        hashMap23.clear();
        hashMap23.modCount = (short) 1;
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap(1);
        java.lang.Object obj32 = hashMap23.remove((java.lang.Object) hashMap31);
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap((int) (short) 10);
        java.lang.Object obj35 = hashMap31.remove((java.lang.Object) hashMap34);
        java.lang.Object obj36 = hashMap0.put((java.lang.Object) int22, (java.lang.Object) hashMap31);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        hashMap0.clear();
        hashMap0.modCount = (short) 1;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap(1);
        java.lang.Object obj9 = hashMap0.remove((java.lang.Object) hashMap8);
        system.testclass.HashMap.Entry[] entryArray10 = hashMap8.table;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.modCount;
        int int16 = hashMap14.modCount;
        system.testclass.HashMap.Entry[] entryArray17 = hashMap14.table;
        java.lang.Object obj18 = hashMap13.get((java.lang.Object) entryArray17);
        int int19 = hashMap13.size();
        int int20 = hashMap13.modCount;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        int int22 = hashMap21.modCount;
        int int23 = hashMap21.modCount;
        system.testclass.HashMap.Entry[] entryArray24 = hashMap21.table;
        hashMap13.table = entryArray24;
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        hashMap26.modCount = 0;
        system.testclass.HashMap.Entry[] entryArray29 = hashMap26.table;
        java.lang.Object obj30 = hashMap8.put((java.lang.Object) entryArray24, (java.lang.Object) hashMap26);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap8", hashMap8.repOK_1());
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(10, (float) 'a');
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        int int5 = hashMap3.size();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        int int11 = hashMap9.modCount;
        system.testclass.HashMap.Entry[] entryArray12 = hashMap9.table;
        java.lang.Object obj13 = hashMap8.get((java.lang.Object) entryArray12);
        java.lang.Object obj14 = hashMap3.get((java.lang.Object) entryArray12);
        int int15 = hashMap3.modCount;
        hashMap3.clear();
        int int17 = hashMap3.size();
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        int int19 = hashMap18.modCount;
        int int20 = hashMap18.modCount;
        system.testclass.HashMap.Entry[] entryArray21 = hashMap18.table;
        system.testclass.HashMap.Entry[] entryArray22 = hashMap18.table;
        java.lang.Object obj24 = hashMap18.get((java.lang.Object) 100);
        int int25 = hashMap18.modCount;
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
        hashMap28.modCount = (short) 1;
        java.lang.Object obj70 = hashMap18.get((java.lang.Object) hashMap28);
        java.lang.Object obj71 = hashMap2.put((java.lang.Object) hashMap3, (java.lang.Object) hashMap18);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(3, 10.0f);
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
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        boolean boolean14 = hashMap13.isEmpty();
        int int15 = hashMap13.size();
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        int int20 = hashMap19.modCount;
        int int21 = hashMap19.modCount;
        system.testclass.HashMap.Entry[] entryArray22 = hashMap19.table;
        java.lang.Object obj23 = hashMap18.get((java.lang.Object) entryArray22);
        java.lang.Object obj24 = hashMap13.get((java.lang.Object) entryArray22);
        java.lang.Class<?> wildcardClass25 = entryArray22.getClass();
        java.lang.Object obj26 = hashMap2.put((java.lang.Object) hashMap3, (java.lang.Object) wildcardClass25);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '4', (float) 10L);
        boolean boolean3 = hashMap2.isEmpty();
        int int4 = hashMap2.modCount;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap((int) (byte) 0);
        hashMap6.clear();
        hashMap6.clear();
        java.lang.Object obj10 = hashMap2.put((java.lang.Object) hashMap6, (java.lang.Object) 1.0d);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
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
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        boolean boolean15 = hashMap14.isEmpty();
        int int16 = hashMap14.size();
        hashMap14.modCount = '4';
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        int int20 = hashMap19.modCount;
        int int21 = hashMap19.modCount;
        int int22 = hashMap19.size();
        java.lang.Object obj23 = hashMap14.get((java.lang.Object) int22);
        hashMap14.modCount = (byte) 1;
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap((int) '4', (float) (byte) 100);
        system.testclass.HashMap.Entry[] entryArray29 = hashMap28.table;
        java.lang.Object obj30 = hashMap0.put((java.lang.Object) hashMap14, (java.lang.Object) entryArray29);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
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
        system.testclass.HashMap.Entry[] entryArray27 = hashMap4.table;
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        int int29 = hashMap28.modCount;
        int int30 = hashMap28.modCount;
        hashMap28.clear();
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        boolean boolean33 = hashMap32.isEmpty();
        int int34 = hashMap32.size();
        hashMap32.modCount = '4';
        java.lang.Object obj37 = hashMap28.remove((java.lang.Object) hashMap32);
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj41 = hashMap32.remove((java.lang.Object) 0);
        java.lang.Object obj43 = hashMap32.get((java.lang.Object) '#');
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap();
        boolean boolean45 = hashMap44.isEmpty();
        java.lang.Object obj46 = hashMap32.get((java.lang.Object) boolean45);
        boolean boolean47 = hashMap32.isEmpty();
        system.testclass.HashMap hashMap50 = new system.testclass.HashMap(53, (float) 10);
        java.lang.Object obj51 = hashMap4.put((java.lang.Object) hashMap32, (java.lang.Object) hashMap50);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap4", hashMap4.repOK_1());
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        hashMap0.clear();
        hashMap0.modCount = 'a';
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap((int) (byte) 1);
        hashMap8.clear();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.modCount;
        int int12 = hashMap10.modCount;
        system.testclass.HashMap.Entry[] entryArray13 = hashMap10.table;
        hashMap10.clear();
        hashMap10.modCount = (short) 1;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap(1);
        java.lang.Object obj19 = hashMap10.remove((java.lang.Object) hashMap18);
        system.testclass.HashMap.Entry[] entryArray20 = hashMap18.table;
        java.lang.Object obj21 = hashMap0.put((java.lang.Object) hashMap8, (java.lang.Object) entryArray20);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) '#');
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        int int3 = hashMap2.modCount;
        int int4 = hashMap2.modCount;
        hashMap2.clear();
        hashMap2.clear();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        int int9 = hashMap7.modCount;
        system.testclass.HashMap.Entry[] entryArray10 = hashMap7.table;
        system.testclass.HashMap.Entry[] entryArray11 = hashMap7.table;
        java.lang.Object obj13 = hashMap7.get((java.lang.Object) 100);
        system.testclass.HashMap.Entry[] entryArray14 = hashMap7.table;
        java.lang.Object obj15 = hashMap2.remove((java.lang.Object) hashMap7);
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap(10);
        boolean boolean18 = hashMap17.isEmpty();
        system.testclass.HashMap.Entry[] entryArray19 = new system.testclass.HashMap.Entry[] {};
        hashMap17.table = entryArray19;
        java.lang.Object obj21 = hashMap2.get((java.lang.Object) hashMap17);
        boolean boolean22 = hashMap17.isEmpty();
        java.lang.Object obj23 = hashMap1.remove((java.lang.Object) hashMap17);
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.modCount;
        int int26 = hashMap24.modCount;
        system.testclass.HashMap.Entry[] entryArray27 = hashMap24.table;
        system.testclass.HashMap.Entry[] entryArray28 = hashMap24.table;
        java.lang.Object obj30 = hashMap24.get((java.lang.Object) 100);
        system.testclass.HashMap.Entry[] entryArray31 = hashMap24.table;
        hashMap17.table = entryArray31;
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        boolean boolean34 = hashMap33.isEmpty();
        int int35 = hashMap33.size();
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        int int40 = hashMap39.modCount;
        int int41 = hashMap39.modCount;
        system.testclass.HashMap.Entry[] entryArray42 = hashMap39.table;
        java.lang.Object obj43 = hashMap38.get((java.lang.Object) entryArray42);
        java.lang.Object obj44 = hashMap33.get((java.lang.Object) entryArray42);
        int int45 = hashMap33.modCount;
        hashMap33.clear();
        hashMap33.modCount = (short) 100;
        boolean boolean49 = hashMap33.isEmpty();
        system.testclass.HashMap hashMap50 = new system.testclass.HashMap();
        int int51 = hashMap50.modCount;
        int int52 = hashMap50.modCount;
        hashMap50.clear();
        hashMap50.clear();
        system.testclass.HashMap.Entry[] entryArray55 = hashMap50.table;
        java.lang.Object obj56 = hashMap17.put((java.lang.Object) hashMap33, (java.lang.Object) hashMap50);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap17", hashMap17.repOK_1());
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        hashMap0.clear();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap((int) (byte) 100, (float) (byte) 100);
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap(0, (float) 10L);
        int int11 = hashMap10.size();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        int int13 = hashMap12.modCount;
        int int14 = hashMap12.modCount;
        system.testclass.HashMap.Entry[] entryArray15 = hashMap12.table;
        hashMap10.table = entryArray15;
        java.lang.Object obj17 = hashMap7.get((java.lang.Object) hashMap10);
        system.testclass.HashMap.Entry[] entryArray18 = hashMap10.table;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap(0, (float) 10L);
        int int22 = hashMap21.size();
        int int23 = hashMap21.modCount;
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap(0, (float) 10L);
        int int27 = hashMap26.size();
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap();
        int int29 = hashMap28.modCount;
        int int30 = hashMap28.modCount;
        system.testclass.HashMap.Entry[] entryArray31 = hashMap28.table;
        hashMap26.table = entryArray31;
        java.lang.Object obj33 = hashMap21.get((java.lang.Object) hashMap26);
        hashMap21.clear();
        java.lang.Object obj35 = hashMap0.put((java.lang.Object) entryArray18, (java.lang.Object) hashMap21);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        int int3 = hashMap2.size();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        system.testclass.HashMap.Entry[] entryArray7 = hashMap4.table;
        hashMap2.table = entryArray7;
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap((int) '4');
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        boolean boolean12 = hashMap11.isEmpty();
        int int13 = hashMap11.size();
        hashMap11.modCount = '4';
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
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap();
        int int36 = hashMap35.modCount;
        int int37 = hashMap35.modCount;
        system.testclass.HashMap.Entry[] entryArray38 = hashMap35.table;
        java.lang.Object obj39 = hashMap34.get((java.lang.Object) entryArray38);
        hashMap20.table = entryArray38;
        hashMap11.table = entryArray38;
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap();
        boolean boolean43 = hashMap42.isEmpty();
        int int44 = hashMap42.size();
        hashMap42.modCount = '4';
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap();
        int int48 = hashMap47.modCount;
        int int49 = hashMap47.modCount;
        hashMap47.clear();
        system.testclass.HashMap hashMap51 = new system.testclass.HashMap();
        boolean boolean52 = hashMap51.isEmpty();
        int int53 = hashMap51.size();
        hashMap51.modCount = '4';
        java.lang.Object obj56 = hashMap47.remove((java.lang.Object) hashMap51);
        system.testclass.HashMap hashMap59 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj60 = hashMap51.remove((java.lang.Object) 0);
        java.lang.Object obj62 = hashMap51.get((java.lang.Object) '#');
        system.testclass.HashMap hashMap65 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap66 = new system.testclass.HashMap();
        int int67 = hashMap66.modCount;
        int int68 = hashMap66.modCount;
        system.testclass.HashMap.Entry[] entryArray69 = hashMap66.table;
        java.lang.Object obj70 = hashMap65.get((java.lang.Object) entryArray69);
        hashMap51.table = entryArray69;
        hashMap42.table = entryArray69;
        hashMap11.table = entryArray69;
        java.lang.Object obj74 = hashMap10.get((java.lang.Object) hashMap11);
        boolean boolean75 = hashMap11.isEmpty();
        system.testclass.HashMap.Entry[] entryArray76 = hashMap11.table;
        system.testclass.HashMap hashMap77 = new system.testclass.HashMap();
        int int78 = hashMap77.modCount;
        int int79 = hashMap77.modCount;
        system.testclass.HashMap.Entry[] entryArray80 = hashMap77.table;
        int int81 = hashMap77.size();
        java.lang.Object obj82 = hashMap2.put((java.lang.Object) hashMap11, (java.lang.Object) int81);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) (short) 100, (float) 100L);
        boolean boolean3 = hashMap2.isEmpty();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap(0, (float) 10L);
        int int7 = hashMap6.size();
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        int int9 = hashMap8.modCount;
        int int10 = hashMap8.modCount;
        system.testclass.HashMap.Entry[] entryArray11 = hashMap8.table;
        hashMap6.table = entryArray11;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap((int) (short) 0, (float) '4');
        java.lang.Object obj16 = hashMap2.put((java.lang.Object) hashMap6, (java.lang.Object) (short) 0);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) (short) 100);
        int int3 = hashMap2.modCount;
        int int4 = hashMap2.size();
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        hashMap5.clear();
        hashMap5.clear();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        int int11 = hashMap10.modCount;
        int int12 = hashMap10.modCount;
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        boolean boolean14 = hashMap13.isEmpty();
        int int15 = hashMap13.size();
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        int int17 = hashMap16.modCount;
        int int18 = hashMap16.modCount;
        int int19 = hashMap16.size();
        system.testclass.HashMap.Entry[] entryArray20 = hashMap16.table;
        hashMap13.table = entryArray20;
        system.testclass.HashMap.Entry[] entryArray22 = hashMap13.table;
        java.lang.Object obj23 = hashMap10.get((java.lang.Object) hashMap13);
        java.lang.Object obj24 = hashMap5.remove((java.lang.Object) hashMap13);
        int int25 = hashMap13.size();
        system.testclass.HashMap hashMap28 = new system.testclass.HashMap((int) '4', (float) 10L);
        java.lang.Object obj29 = hashMap2.put((java.lang.Object) hashMap13, (java.lang.Object) 10L);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
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
        hashMap4.clear();
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap((int) 'a');
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        int int23 = hashMap22.modCount;
        int int24 = hashMap22.modCount;
        hashMap22.clear();
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        boolean boolean27 = hashMap26.isEmpty();
        int int28 = hashMap26.size();
        hashMap26.modCount = '4';
        java.lang.Object obj31 = hashMap22.remove((java.lang.Object) hashMap26);
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj35 = hashMap26.remove((java.lang.Object) 0);
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        boolean boolean37 = hashMap36.isEmpty();
        int int38 = hashMap36.size();
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap();
        int int43 = hashMap42.modCount;
        int int44 = hashMap42.modCount;
        system.testclass.HashMap.Entry[] entryArray45 = hashMap42.table;
        java.lang.Object obj46 = hashMap41.get((java.lang.Object) entryArray45);
        java.lang.Object obj47 = hashMap36.get((java.lang.Object) entryArray45);
        java.lang.Object obj48 = hashMap26.remove((java.lang.Object) hashMap36);
        system.testclass.HashMap.Entry[] entryArray49 = hashMap26.table;
        java.lang.Object obj50 = hashMap4.put((java.lang.Object) hashMap21, (java.lang.Object) entryArray49);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap4", hashMap4.repOK_1());
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap((int) '#', (float) (short) 100);
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
        int int15 = hashMap7.size();
        hashMap7.clear();
        boolean boolean17 = hashMap7.isEmpty();
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        int int19 = hashMap18.modCount;
        system.testclass.HashMap.Entry[] entryArray20 = hashMap18.table;
        java.lang.Object obj21 = hashMap2.put((java.lang.Object) hashMap7, (java.lang.Object) hashMap18);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (short) 10);
        system.testclass.HashMap.Entry[] entryArray2 = hashMap1.table;
        int int3 = hashMap1.size();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        int int5 = hashMap4.modCount;
        int int6 = hashMap4.modCount;
        system.testclass.HashMap.Entry[] entryArray7 = hashMap4.table;
        hashMap4.clear();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        int int11 = hashMap9.modCount;
        system.testclass.HashMap.Entry[] entryArray12 = hashMap9.table;
        system.testclass.HashMap.Entry[] entryArray13 = hashMap9.table;
        java.lang.Object obj15 = hashMap9.get((java.lang.Object) 100);
        int int16 = hashMap9.modCount;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap(0, (float) 10L);
        int int20 = hashMap19.size();
        int int21 = hashMap19.modCount;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap(0, (float) 10L);
        int int25 = hashMap24.size();
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        int int27 = hashMap26.modCount;
        int int28 = hashMap26.modCount;
        system.testclass.HashMap.Entry[] entryArray29 = hashMap26.table;
        hashMap24.table = entryArray29;
        java.lang.Object obj31 = hashMap19.get((java.lang.Object) hashMap24);
        hashMap19.clear();
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        boolean boolean34 = hashMap33.isEmpty();
        boolean boolean35 = hashMap33.isEmpty();
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        boolean boolean37 = hashMap36.isEmpty();
        int int38 = hashMap36.size();
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap42 = new system.testclass.HashMap();
        int int43 = hashMap42.modCount;
        int int44 = hashMap42.modCount;
        system.testclass.HashMap.Entry[] entryArray45 = hashMap42.table;
        java.lang.Object obj46 = hashMap41.get((java.lang.Object) entryArray45);
        java.lang.Object obj47 = hashMap36.get((java.lang.Object) entryArray45);
        hashMap33.table = entryArray45;
        system.testclass.HashMap hashMap49 = new system.testclass.HashMap();
        int int50 = hashMap49.modCount;
        int int51 = hashMap49.modCount;
        system.testclass.HashMap.Entry[] entryArray52 = hashMap49.table;
        hashMap49.clear();
        system.testclass.HashMap.Entry[] entryArray54 = hashMap49.table;
        hashMap33.table = entryArray54;
        java.lang.Object obj56 = hashMap19.get((java.lang.Object) hashMap33);
        hashMap19.modCount = 0;
        hashMap19.modCount = (short) 1;
        java.lang.Object obj61 = hashMap9.get((java.lang.Object) hashMap19);
        java.lang.Object obj62 = hashMap1.put((java.lang.Object) hashMap4, (java.lang.Object) hashMap19);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        system.testclass.HashMap.Entry[] entryArray4 = hashMap0.table;
        java.lang.Object obj6 = hashMap0.get((java.lang.Object) 100);
        int int7 = hashMap0.modCount;
        int int8 = hashMap0.modCount;
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        int int10 = hashMap9.modCount;
        int int11 = hashMap9.modCount;
        hashMap9.clear();
        system.testclass.HashMap hashMap13 = new system.testclass.HashMap();
        boolean boolean14 = hashMap13.isEmpty();
        int int15 = hashMap13.size();
        hashMap13.modCount = '4';
        java.lang.Object obj18 = hashMap9.remove((java.lang.Object) hashMap13);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        int int20 = hashMap19.modCount;
        int int21 = hashMap19.modCount;
        system.testclass.HashMap.Entry[] entryArray22 = hashMap19.table;
        system.testclass.HashMap.Entry[] entryArray23 = hashMap19.table;
        system.testclass.HashMap hashMap24 = new system.testclass.HashMap();
        int int25 = hashMap24.modCount;
        int int26 = hashMap24.modCount;
        int int27 = hashMap24.size();
        system.testclass.HashMap.Entry[] entryArray28 = new system.testclass.HashMap.Entry[] {};
        hashMap24.table = entryArray28;
        hashMap19.table = entryArray28;
        hashMap13.table = entryArray28;
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        boolean boolean33 = hashMap32.isEmpty();
        int int34 = hashMap32.size();
        java.lang.Object obj36 = hashMap32.remove((java.lang.Object) 1);
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
        system.testclass.HashMap hashMap53 = new system.testclass.HashMap();
        boolean boolean54 = hashMap53.isEmpty();
        java.lang.Object obj55 = hashMap41.get((java.lang.Object) boolean54);
        hashMap41.modCount = 0;
        system.testclass.HashMap hashMap59 = new system.testclass.HashMap(10);
        boolean boolean60 = hashMap59.isEmpty();
        system.testclass.HashMap.Entry[] entryArray61 = new system.testclass.HashMap.Entry[] {};
        hashMap59.table = entryArray61;
        java.lang.Object obj63 = hashMap41.remove((java.lang.Object) entryArray61);
        system.testclass.HashMap.Entry[] entryArray64 = hashMap41.table;
        java.lang.Object obj65 = hashMap32.get((java.lang.Object) entryArray64);
        hashMap13.table = entryArray64;
        system.testclass.HashMap hashMap67 = new system.testclass.HashMap();
        boolean boolean68 = hashMap67.isEmpty();
        int int69 = hashMap67.size();
        system.testclass.HashMap hashMap72 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap73 = new system.testclass.HashMap();
        int int74 = hashMap73.modCount;
        int int75 = hashMap73.modCount;
        system.testclass.HashMap.Entry[] entryArray76 = hashMap73.table;
        java.lang.Object obj77 = hashMap72.get((java.lang.Object) entryArray76);
        java.lang.Object obj78 = hashMap67.get((java.lang.Object) entryArray76);
        int int79 = hashMap67.modCount;
        hashMap67.modCount = (short) 0;
        java.lang.Object obj82 = hashMap0.put((java.lang.Object) entryArray64, (java.lang.Object) hashMap67);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        hashMap1.clear();
        hashMap1.clear();
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        int int6 = hashMap4.size();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        int int9 = hashMap7.modCount;
        int int10 = hashMap7.size();
        system.testclass.HashMap.Entry[] entryArray11 = hashMap7.table;
        hashMap4.table = entryArray11;
        java.lang.Object obj13 = hashMap1.remove((java.lang.Object) hashMap4);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.modCount;
        int int16 = hashMap14.modCount;
        system.testclass.HashMap.Entry[] entryArray17 = hashMap14.table;
        system.testclass.HashMap.Entry[] entryArray18 = hashMap14.table;
        java.lang.Object obj20 = hashMap14.get((java.lang.Object) 100);
        system.testclass.HashMap.Entry[] entryArray21 = hashMap14.table;
        int int22 = hashMap14.modCount;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        int int24 = hashMap23.modCount;
        int int25 = hashMap23.modCount;
        hashMap23.clear();
        system.testclass.HashMap hashMap27 = new system.testclass.HashMap();
        boolean boolean28 = hashMap27.isEmpty();
        int int29 = hashMap27.size();
        hashMap27.modCount = '4';
        java.lang.Object obj32 = hashMap23.remove((java.lang.Object) hashMap27);
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        int int34 = hashMap33.modCount;
        int int35 = hashMap33.modCount;
        system.testclass.HashMap.Entry[] entryArray36 = hashMap33.table;
        system.testclass.HashMap.Entry[] entryArray37 = hashMap33.table;
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        int int39 = hashMap38.modCount;
        int int40 = hashMap38.modCount;
        int int41 = hashMap38.size();
        system.testclass.HashMap.Entry[] entryArray42 = new system.testclass.HashMap.Entry[] {};
        hashMap38.table = entryArray42;
        hashMap33.table = entryArray42;
        hashMap27.table = entryArray42;
        system.testclass.HashMap hashMap46 = new system.testclass.HashMap();
        boolean boolean47 = hashMap46.isEmpty();
        int int48 = hashMap46.size();
        java.lang.Object obj50 = hashMap46.remove((java.lang.Object) 1);
        system.testclass.HashMap hashMap51 = new system.testclass.HashMap();
        int int52 = hashMap51.modCount;
        int int53 = hashMap51.modCount;
        hashMap51.clear();
        system.testclass.HashMap hashMap55 = new system.testclass.HashMap();
        boolean boolean56 = hashMap55.isEmpty();
        int int57 = hashMap55.size();
        hashMap55.modCount = '4';
        java.lang.Object obj60 = hashMap51.remove((java.lang.Object) hashMap55);
        system.testclass.HashMap hashMap63 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj64 = hashMap55.remove((java.lang.Object) 0);
        java.lang.Object obj66 = hashMap55.get((java.lang.Object) '#');
        system.testclass.HashMap hashMap67 = new system.testclass.HashMap();
        boolean boolean68 = hashMap67.isEmpty();
        java.lang.Object obj69 = hashMap55.get((java.lang.Object) boolean68);
        hashMap55.modCount = 0;
        system.testclass.HashMap hashMap73 = new system.testclass.HashMap(10);
        boolean boolean74 = hashMap73.isEmpty();
        system.testclass.HashMap.Entry[] entryArray75 = new system.testclass.HashMap.Entry[] {};
        hashMap73.table = entryArray75;
        java.lang.Object obj77 = hashMap55.remove((java.lang.Object) entryArray75);
        system.testclass.HashMap.Entry[] entryArray78 = hashMap55.table;
        java.lang.Object obj79 = hashMap46.get((java.lang.Object) entryArray78);
        hashMap27.table = entryArray78;
        hashMap14.table = entryArray78;
        system.testclass.HashMap hashMap84 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        int int85 = hashMap84.modCount;
        hashMap84.clear();
        boolean boolean87 = hashMap84.isEmpty();
        system.testclass.HashMap.Entry[] entryArray88 = hashMap84.table;
        java.lang.Object obj89 = hashMap1.put((java.lang.Object) entryArray78, (java.lang.Object) hashMap84);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        int int3 = hashMap2.size();
        int int4 = hashMap2.modCount;
        int int5 = hashMap2.modCount;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        int int7 = hashMap6.modCount;
        int int8 = hashMap6.modCount;
        hashMap6.clear();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        boolean boolean11 = hashMap10.isEmpty();
        int int12 = hashMap10.size();
        hashMap10.modCount = '4';
        java.lang.Object obj15 = hashMap6.remove((java.lang.Object) hashMap10);
        java.lang.Object obj17 = hashMap10.remove((java.lang.Object) (-1.0d));
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap((int) '4', 100.0f);
        hashMap20.modCount = 52;
        hashMap20.modCount = 53;
        java.lang.Object obj25 = hashMap2.put((java.lang.Object) hashMap10, (java.lang.Object) 53);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, 100.0f);
        int int3 = hashMap2.modCount;
        hashMap2.modCount = '4';
        system.testclass.HashMap.Entry[] entryArray6 = hashMap2.table;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        int int9 = hashMap7.modCount;
        system.testclass.HashMap.Entry[] entryArray10 = hashMap7.table;
        system.testclass.HashMap.Entry[] entryArray11 = hashMap7.table;
        java.lang.Object obj13 = hashMap7.get((java.lang.Object) 100);
        system.testclass.HashMap.Entry[] entryArray14 = hashMap7.table;
        int int15 = hashMap7.modCount;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        int int17 = hashMap16.modCount;
        int int18 = hashMap16.modCount;
        hashMap16.clear();
        system.testclass.HashMap hashMap20 = new system.testclass.HashMap();
        boolean boolean21 = hashMap20.isEmpty();
        int int22 = hashMap20.size();
        hashMap20.modCount = '4';
        java.lang.Object obj25 = hashMap16.remove((java.lang.Object) hashMap20);
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        int int27 = hashMap26.modCount;
        int int28 = hashMap26.modCount;
        system.testclass.HashMap.Entry[] entryArray29 = hashMap26.table;
        system.testclass.HashMap.Entry[] entryArray30 = hashMap26.table;
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        int int32 = hashMap31.modCount;
        int int33 = hashMap31.modCount;
        int int34 = hashMap31.size();
        system.testclass.HashMap.Entry[] entryArray35 = new system.testclass.HashMap.Entry[] {};
        hashMap31.table = entryArray35;
        hashMap26.table = entryArray35;
        hashMap20.table = entryArray35;
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        boolean boolean40 = hashMap39.isEmpty();
        int int41 = hashMap39.size();
        java.lang.Object obj43 = hashMap39.remove((java.lang.Object) 1);
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap();
        int int45 = hashMap44.modCount;
        int int46 = hashMap44.modCount;
        hashMap44.clear();
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap();
        boolean boolean49 = hashMap48.isEmpty();
        int int50 = hashMap48.size();
        hashMap48.modCount = '4';
        java.lang.Object obj53 = hashMap44.remove((java.lang.Object) hashMap48);
        system.testclass.HashMap hashMap56 = new system.testclass.HashMap(0, (float) 10L);
        java.lang.Object obj57 = hashMap48.remove((java.lang.Object) 0);
        java.lang.Object obj59 = hashMap48.get((java.lang.Object) '#');
        system.testclass.HashMap hashMap60 = new system.testclass.HashMap();
        boolean boolean61 = hashMap60.isEmpty();
        java.lang.Object obj62 = hashMap48.get((java.lang.Object) boolean61);
        hashMap48.modCount = 0;
        system.testclass.HashMap hashMap66 = new system.testclass.HashMap(10);
        boolean boolean67 = hashMap66.isEmpty();
        system.testclass.HashMap.Entry[] entryArray68 = new system.testclass.HashMap.Entry[] {};
        hashMap66.table = entryArray68;
        java.lang.Object obj70 = hashMap48.remove((java.lang.Object) entryArray68);
        system.testclass.HashMap.Entry[] entryArray71 = hashMap48.table;
        java.lang.Object obj72 = hashMap39.get((java.lang.Object) entryArray71);
        hashMap20.table = entryArray71;
        hashMap7.table = entryArray71;
        system.testclass.HashMap hashMap77 = new system.testclass.HashMap((int) (byte) 100, (float) (byte) 1);
        int int78 = hashMap77.modCount;
        java.lang.Class<?> wildcardClass79 = hashMap77.getClass();
        java.lang.Object obj80 = hashMap2.put((java.lang.Object) entryArray71, (java.lang.Object) hashMap77);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }
}

