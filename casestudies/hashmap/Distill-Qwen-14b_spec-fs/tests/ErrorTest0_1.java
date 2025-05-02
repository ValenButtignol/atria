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
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        hashMap2.modCount = 0;
        java.lang.Object obj6 = hashMap2.get((java.lang.Object) '#');
        system.testclass.HashMap.Entry[] entryArray7 = null;
        hashMap2.table = entryArray7;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        hashMap2.modCount = 0;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        java.lang.Object obj7 = hashMap2.put((java.lang.Object) hashMap5, (java.lang.Object) 0.0f);
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap();
        hashMap8.modCount = (byte) -1;
        java.lang.Object obj11 = hashMap2.get((java.lang.Object) hashMap8);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        int int13 = hashMap12.modCount;
        int int14 = hashMap12.modCount;
        system.testclass.HashMap.Entry[] entryArray15 = hashMap12.table;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        boolean boolean17 = hashMap16.isEmpty();
        int int18 = hashMap16.size();
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        boolean boolean20 = hashMap19.isEmpty();
        java.lang.Object obj21 = hashMap16.get((java.lang.Object) hashMap19);
        hashMap16.modCount = 'a';
        java.lang.Object obj24 = hashMap12.remove((java.lang.Object) hashMap16);
        hashMap12.modCount = (byte) 10;
        int int27 = hashMap12.modCount;
        int int28 = hashMap12.modCount;
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap((int) (short) 10);
        int int31 = hashMap30.modCount;
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        int int33 = hashMap32.modCount;
        int int34 = hashMap32.modCount;
        system.testclass.HashMap.Entry[] entryArray35 = hashMap32.table;
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        boolean boolean37 = hashMap36.isEmpty();
        int int38 = hashMap36.size();
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        boolean boolean40 = hashMap39.isEmpty();
        java.lang.Object obj41 = hashMap36.get((java.lang.Object) hashMap39);
        hashMap36.modCount = 'a';
        java.lang.Object obj44 = hashMap32.remove((java.lang.Object) hashMap36);
        hashMap32.modCount = (byte) 10;
        int int47 = hashMap32.size();
        system.testclass.HashMap hashMap50 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        system.testclass.HashMap hashMap53 = new system.testclass.HashMap(0, (float) 10L);
        boolean boolean54 = hashMap53.isEmpty();
        hashMap53.clear();
        system.testclass.HashMap.Entry entry56 = null;
        system.testclass.HashMap.Entry[] entryArray57 = new system.testclass.HashMap.Entry[] { entry56 };
        hashMap53.table = entryArray57;
        hashMap50.table = entryArray57;
        hashMap32.table = entryArray57;
        system.testclass.HashMap hashMap61 = new system.testclass.HashMap();
        int int62 = hashMap61.modCount;
        int int63 = hashMap61.modCount;
        int int64 = hashMap61.size();
        int int65 = hashMap61.modCount;
        int int66 = hashMap61.size();
        java.lang.Object obj67 = hashMap30.put((java.lang.Object) hashMap32, (java.lang.Object) hashMap61);
        java.lang.Object obj68 = hashMap2.put((java.lang.Object) hashMap12, (java.lang.Object) hashMap32);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(0);
        java.lang.Object obj3 = hashMap1.get((java.lang.Object) 100.0d);
        java.lang.Object obj5 = hashMap1.get((java.lang.Object) 1.0d);
        system.testclass.HashMap.Entry[] entryArray6 = null;
        hashMap1.table = entryArray6;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        boolean boolean4 = hashMap3.isEmpty();
        int int5 = hashMap3.size();
        hashMap3.clear();
        java.lang.Object obj7 = hashMap0.put((java.lang.Object) '#', (java.lang.Object) hashMap3);
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap((int) (byte) 0);
        java.lang.Object obj10 = hashMap0.get((java.lang.Object) hashMap9);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        int int12 = hashMap11.modCount;
        system.testclass.HashMap.Entry[] entryArray13 = new system.testclass.HashMap.Entry[] {};
        hashMap11.table = entryArray13;
        hashMap11.clear();
        system.testclass.HashMap.Entry[] entryArray16 = hashMap11.table;
        hashMap0.table = entryArray16;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap((int) (byte) 0);
        java.lang.Object obj4 = hashMap1.put((java.lang.Object) '4', (java.lang.Object) 10);
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap(0, (float) 10L);
        boolean boolean8 = hashMap7.isEmpty();
        hashMap7.clear();
        int int10 = hashMap7.size();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        hashMap11.modCount = 0;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.modCount;
        system.testclass.HashMap.Entry[] entryArray16 = new system.testclass.HashMap.Entry[] {};
        hashMap14.table = entryArray16;
        hashMap14.clear();
        system.testclass.HashMap.Entry[] entryArray19 = hashMap14.table;
        hashMap11.table = entryArray19;
        hashMap7.table = entryArray19;
        hashMap1.table = entryArray19;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap1", hashMap1.repOK_1());
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(10);
        hashMap1.clear();
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        int int4 = hashMap3.modCount;
        int int5 = hashMap3.modCount;
        system.testclass.HashMap hashMap8 = new system.testclass.HashMap((int) (byte) 0, 100.0f);
        java.lang.Object obj9 = hashMap3.get((java.lang.Object) (byte) 0);
        int int10 = hashMap3.size();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap((int) (short) 10);
        int int13 = hashMap12.modCount;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        int int15 = hashMap14.modCount;
        int int16 = hashMap14.modCount;
        system.testclass.HashMap.Entry[] entryArray17 = hashMap14.table;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        boolean boolean19 = hashMap18.isEmpty();
        int int20 = hashMap18.size();
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        boolean boolean22 = hashMap21.isEmpty();
        java.lang.Object obj23 = hashMap18.get((java.lang.Object) hashMap21);
        hashMap18.modCount = 'a';
        java.lang.Object obj26 = hashMap14.remove((java.lang.Object) hashMap18);
        hashMap14.modCount = (byte) 10;
        int int29 = hashMap14.size();
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        system.testclass.HashMap hashMap35 = new system.testclass.HashMap(0, (float) 10L);
        boolean boolean36 = hashMap35.isEmpty();
        hashMap35.clear();
        system.testclass.HashMap.Entry entry38 = null;
        system.testclass.HashMap.Entry[] entryArray39 = new system.testclass.HashMap.Entry[] { entry38 };
        hashMap35.table = entryArray39;
        hashMap32.table = entryArray39;
        hashMap14.table = entryArray39;
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap();
        int int44 = hashMap43.modCount;
        int int45 = hashMap43.modCount;
        int int46 = hashMap43.size();
        int int47 = hashMap43.modCount;
        int int48 = hashMap43.size();
        java.lang.Object obj49 = hashMap12.put((java.lang.Object) hashMap14, (java.lang.Object) hashMap43);
        int int50 = hashMap12.size();
        java.lang.Object obj51 = hashMap1.put((java.lang.Object) int10, (java.lang.Object) hashMap12);
        hashMap12.modCount = (short) -1;
        system.testclass.HashMap hashMap54 = new system.testclass.HashMap();
        int int55 = hashMap54.modCount;
        system.testclass.HashMap hashMap56 = new system.testclass.HashMap();
        int int57 = hashMap56.modCount;
        system.testclass.HashMap.Entry[] entryArray58 = new system.testclass.HashMap.Entry[] {};
        hashMap56.table = entryArray58;
        hashMap56.modCount = (byte) 10;
        system.testclass.HashMap hashMap64 = new system.testclass.HashMap(0, (float) 10L);
        boolean boolean65 = hashMap64.isEmpty();
        system.testclass.HashMap.Entry[] entryArray66 = hashMap64.table;
        hashMap56.table = entryArray66;
        hashMap54.table = entryArray66;
        system.testclass.HashMap hashMap69 = new system.testclass.HashMap();
        hashMap69.modCount = 0;
        system.testclass.HashMap hashMap72 = new system.testclass.HashMap();
        int int73 = hashMap72.modCount;
        system.testclass.HashMap.Entry[] entryArray74 = new system.testclass.HashMap.Entry[] {};
        hashMap72.table = entryArray74;
        hashMap72.clear();
        system.testclass.HashMap.Entry[] entryArray77 = hashMap72.table;
        hashMap69.table = entryArray77;
        hashMap54.table = entryArray77;
        int int80 = hashMap54.modCount;
        hashMap54.clear();
        boolean boolean82 = hashMap54.isEmpty();
        system.testclass.HashMap.Entry[] entryArray83 = hashMap54.table;
        hashMap12.table = entryArray83;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap12", hashMap12.repOK_1());
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        boolean boolean5 = hashMap4.isEmpty();
        int int6 = hashMap4.size();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        boolean boolean8 = hashMap7.isEmpty();
        java.lang.Object obj9 = hashMap4.get((java.lang.Object) hashMap7);
        hashMap4.modCount = 'a';
        java.lang.Object obj12 = hashMap0.remove((java.lang.Object) hashMap4);
        hashMap0.modCount = (byte) 10;
        int int15 = hashMap0.modCount;
        int int16 = hashMap0.modCount;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap((int) '#');
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        boolean boolean20 = hashMap19.isEmpty();
        int int21 = hashMap19.size();
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        boolean boolean23 = hashMap22.isEmpty();
        java.lang.Object obj24 = hashMap19.get((java.lang.Object) hashMap22);
        int int25 = hashMap19.modCount;
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        hashMap26.modCount = 0;
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        int int30 = hashMap29.modCount;
        system.testclass.HashMap.Entry[] entryArray31 = new system.testclass.HashMap.Entry[] {};
        hashMap29.table = entryArray31;
        hashMap29.clear();
        system.testclass.HashMap.Entry[] entryArray34 = hashMap29.table;
        hashMap26.table = entryArray34;
        hashMap19.table = entryArray34;
        hashMap18.table = entryArray34;
        java.lang.Object obj38 = hashMap0.get((java.lang.Object) hashMap18);
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap(10);
        system.testclass.HashMap.Entry[] entryArray42 = hashMap41.table;
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap();
        int int44 = hashMap43.modCount;
        system.testclass.HashMap.Entry[] entryArray45 = new system.testclass.HashMap.Entry[] {};
        hashMap43.table = entryArray45;
        hashMap43.clear();
        java.lang.Object obj48 = hashMap41.remove((java.lang.Object) hashMap43);
        system.testclass.HashMap hashMap51 = new system.testclass.HashMap((int) '4', (float) 10L);
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap();
        int int53 = hashMap52.modCount;
        int int54 = hashMap52.modCount;
        system.testclass.HashMap.Entry[] entryArray55 = hashMap52.table;
        hashMap51.table = entryArray55;
        java.lang.Object obj58 = hashMap51.remove((java.lang.Object) 100);
        system.testclass.HashMap.Entry[] entryArray59 = new system.testclass.HashMap.Entry[] {};
        hashMap51.table = entryArray59;
        hashMap43.table = entryArray59;
        java.lang.Object obj62 = hashMap0.put((java.lang.Object) (byte) -1, (java.lang.Object) entryArray59);
        system.testclass.HashMap hashMap63 = new system.testclass.HashMap();
        int int64 = hashMap63.modCount;
        system.testclass.HashMap.Entry[] entryArray65 = new system.testclass.HashMap.Entry[] {};
        hashMap63.table = entryArray65;
        hashMap63.clear();
        system.testclass.HashMap hashMap68 = new system.testclass.HashMap();
        int int69 = hashMap68.modCount;
        system.testclass.HashMap.Entry[] entryArray70 = new system.testclass.HashMap.Entry[] {};
        hashMap68.table = entryArray70;
        hashMap63.table = entryArray70;
        system.testclass.HashMap.Entry[] entryArray73 = hashMap63.table;
        hashMap0.table = entryArray73;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        int int1 = hashMap0.modCount;
        int int2 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray3 = hashMap0.table;
        system.testclass.HashMap.Entry[] entryArray4 = hashMap0.table;
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        int int6 = hashMap5.modCount;
        int int7 = hashMap5.modCount;
        system.testclass.HashMap.Entry[] entryArray8 = hashMap5.table;
        java.lang.Object obj9 = hashMap0.remove((java.lang.Object) hashMap5);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap(0);
        java.lang.Object obj13 = hashMap11.get((java.lang.Object) 100.0d);
        int int14 = hashMap11.modCount;
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap((int) (short) 10);
        java.lang.Object obj17 = hashMap11.remove((java.lang.Object) hashMap16);
        java.lang.Object obj18 = hashMap0.get((java.lang.Object) hashMap16);
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        int int20 = hashMap19.modCount;
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        int int22 = hashMap21.modCount;
        system.testclass.HashMap.Entry[] entryArray23 = new system.testclass.HashMap.Entry[] {};
        hashMap21.table = entryArray23;
        hashMap21.modCount = (byte) 10;
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap(0, (float) 10L);
        boolean boolean30 = hashMap29.isEmpty();
        system.testclass.HashMap.Entry[] entryArray31 = hashMap29.table;
        hashMap21.table = entryArray31;
        hashMap19.table = entryArray31;
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        hashMap34.modCount = 0;
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        int int38 = hashMap37.modCount;
        system.testclass.HashMap.Entry[] entryArray39 = new system.testclass.HashMap.Entry[] {};
        hashMap37.table = entryArray39;
        hashMap37.clear();
        system.testclass.HashMap.Entry[] entryArray42 = hashMap37.table;
        hashMap34.table = entryArray42;
        hashMap19.table = entryArray42;
        system.testclass.HashMap hashMap45 = new system.testclass.HashMap();
        boolean boolean46 = hashMap45.isEmpty();
        int int47 = hashMap45.size();
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap();
        boolean boolean49 = hashMap48.isEmpty();
        java.lang.Object obj50 = hashMap45.get((java.lang.Object) hashMap48);
        java.lang.Object obj52 = null;
        java.lang.Object obj53 = hashMap45.put((java.lang.Object) 1L, obj52);
        system.testclass.HashMap.Entry[] entryArray54 = hashMap45.table;
        java.lang.Object obj55 = hashMap0.put((java.lang.Object) entryArray42, (java.lang.Object) hashMap45);
        system.testclass.HashMap.Entry[] entryArray56 = new system.testclass.HashMap.Entry[] {};
        hashMap0.table = entryArray56;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap0", hashMap0.repOK_1());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap(0, (float) 10L);
        hashMap2.modCount = 0;
        system.testclass.HashMap.Entry[] entryArray5 = hashMap2.table;
        hashMap2.clear();
        system.testclass.HashMap.Entry[] entryArray7 = null;
        hashMap2.table = entryArray7;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap2", hashMap2.repOK_1());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        system.testclass.HashMap hashMap1 = new system.testclass.HashMap(33);
        system.testclass.HashMap hashMap2 = new system.testclass.HashMap();
        int int3 = hashMap2.modCount;
        int int4 = hashMap2.modCount;
        system.testclass.HashMap.Entry[] entryArray5 = hashMap2.table;
        system.testclass.HashMap.Entry[] entryArray6 = hashMap2.table;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        int int8 = hashMap7.modCount;
        int int9 = hashMap7.modCount;
        system.testclass.HashMap.Entry[] entryArray10 = hashMap7.table;
        java.lang.Object obj11 = hashMap2.remove((java.lang.Object) hashMap7);
        system.testclass.HashMap.Entry[] entryArray12 = hashMap7.table;
        java.lang.Object obj13 = hashMap1.remove((java.lang.Object) hashMap7);
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        boolean boolean15 = hashMap14.isEmpty();
        java.lang.Object obj17 = hashMap14.get((java.lang.Object) (short) -1);
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        boolean boolean19 = hashMap18.isEmpty();
        int int20 = hashMap18.size();
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        boolean boolean22 = hashMap21.isEmpty();
        java.lang.Object obj23 = hashMap18.get((java.lang.Object) hashMap21);
        int int24 = hashMap18.modCount;
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        int int26 = hashMap25.modCount;
        int int27 = hashMap25.modCount;
        hashMap25.clear();
        java.lang.Object obj29 = null;
        java.lang.Object obj30 = hashMap25.remove(obj29);
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap(10);
        system.testclass.HashMap.Entry[] entryArray33 = hashMap32.table;
        hashMap25.table = entryArray33;
        java.lang.Object obj35 = hashMap14.put((java.lang.Object) int24, (java.lang.Object) entryArray33);
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap((int) (short) 10);
        int int38 = hashMap37.modCount;
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        int int40 = hashMap39.modCount;
        int int41 = hashMap39.modCount;
        system.testclass.HashMap.Entry[] entryArray42 = hashMap39.table;
        system.testclass.HashMap.Entry[] entryArray43 = hashMap39.table;
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap();
        int int45 = hashMap44.modCount;
        int int46 = hashMap44.modCount;
        system.testclass.HashMap.Entry[] entryArray47 = hashMap44.table;
        java.lang.Object obj48 = hashMap39.remove((java.lang.Object) hashMap44);
        java.lang.Object obj49 = hashMap14.put((java.lang.Object) int38, (java.lang.Object) hashMap44);
        java.lang.Object obj51 = hashMap7.put((java.lang.Object) hashMap14, (java.lang.Object) 10.0d);
        system.testclass.HashMap hashMap54 = new system.testclass.HashMap(0, (float) 10L);
        boolean boolean55 = hashMap54.isEmpty();
        hashMap54.clear();
        int int57 = hashMap54.size();
        int int58 = hashMap54.modCount;
        system.testclass.HashMap hashMap60 = new system.testclass.HashMap(0);
        java.lang.Object obj62 = hashMap60.get((java.lang.Object) 100.0d);
        int int63 = hashMap60.modCount;
        system.testclass.HashMap.Entry[] entryArray64 = new system.testclass.HashMap.Entry[] {};
        hashMap60.table = entryArray64;
        hashMap54.table = entryArray64;
        system.testclass.HashMap.Entry[] entryArray67 = hashMap54.table;
        hashMap7.table = entryArray67;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for hashMap7", hashMap7.repOK_1());
    }
}

