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
        boolean boolean1 = hashMap0.property_1();
        boolean boolean2 = hashMap0.property_1();
        hashMap0.clear();
        boolean boolean4 = hashMap0.property_2();
        boolean boolean5 = hashMap0.composedRepOK();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        boolean boolean8 = hashMap7.composedRepOK();
        system.testclass.HashMap.Entry[] entryArray9 = hashMap7.table;
        java.lang.Object obj10 = hashMap0.put((java.lang.Object) (byte) 0, (java.lang.Object) entryArray9);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        boolean boolean12 = hashMap11.property_1();
        boolean boolean13 = hashMap11.property_1();
        hashMap11.clear();
        boolean boolean15 = hashMap11.property_2();
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        boolean boolean17 = hashMap16.property_1();
        boolean boolean18 = hashMap16.property_1();
        hashMap16.clear();
        boolean boolean20 = hashMap16.property_2();
        boolean boolean21 = hashMap16.composedRepOK();
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        boolean boolean24 = hashMap23.composedRepOK();
        system.testclass.HashMap.Entry[] entryArray25 = hashMap23.table;
        java.lang.Object obj26 = hashMap16.put((java.lang.Object) (byte) 0, (java.lang.Object) entryArray25);
        hashMap11.table = entryArray25;
        hashMap0.table = entryArray25;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for hashMap0", hashMap0.property_3());
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.property_1();
        boolean boolean2 = hashMap0.property_1();
        hashMap0.clear();
        boolean boolean4 = hashMap0.property_2();
        boolean boolean5 = hashMap0.composedRepOK();
        int int6 = hashMap0.modCount;
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        boolean boolean8 = hashMap7.property_1();
        boolean boolean9 = hashMap7.property_1();
        hashMap7.clear();
        boolean boolean11 = hashMap7.property_1();
        java.lang.Object obj14 = hashMap7.put((java.lang.Object) false, (java.lang.Object) 10.0d);
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        java.lang.Object obj16 = hashMap7.get((java.lang.Object) hashMap15);
        int int17 = hashMap7.size();
        system.testclass.HashMap.Entry[] entryArray18 = hashMap7.table;
        hashMap0.table = entryArray18;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for hashMap0", hashMap0.property_3());
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.property_1();
        boolean boolean2 = hashMap0.property_1();
        hashMap0.clear();
        boolean boolean4 = hashMap0.property_2();
        boolean boolean5 = hashMap0.composedRepOK();
        int int6 = hashMap0.modCount;
        java.lang.Object obj9 = hashMap0.put((java.lang.Object) 0, (java.lang.Object) 10.0d);
        hashMap0.modCount = (-1);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        boolean boolean13 = hashMap12.property_1();
        boolean boolean14 = hashMap12.property_1();
        hashMap12.clear();
        boolean boolean16 = hashMap12.composedRepOK();
        system.testclass.HashMap.Entry[] entryArray17 = hashMap12.table;
        hashMap0.table = entryArray17;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for hashMap0", hashMap0.property_3());
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.composedRepOK();
        java.lang.Object obj4 = hashMap0.put((java.lang.Object) (byte) 1, (java.lang.Object) (byte) 10);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        boolean boolean6 = hashMap5.property_1();
        hashMap5.modCount = '4';
        hashMap5.clear();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        boolean boolean11 = hashMap10.composedRepOK();
        system.testclass.HashMap.Entry[] entryArray12 = hashMap10.table;
        int int13 = hashMap10.size();
        boolean boolean14 = hashMap10.property_2();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        boolean boolean16 = hashMap15.property_1();
        boolean boolean17 = hashMap15.property_1();
        hashMap15.clear();
        boolean boolean19 = hashMap15.property_2();
        boolean boolean20 = hashMap15.composedRepOK();
        system.testclass.HashMap hashMap22 = new system.testclass.HashMap();
        boolean boolean23 = hashMap22.composedRepOK();
        system.testclass.HashMap.Entry[] entryArray24 = hashMap22.table;
        java.lang.Object obj25 = hashMap15.put((java.lang.Object) (byte) 0, (java.lang.Object) entryArray24);
        hashMap10.table = entryArray24;
        hashMap5.table = entryArray24;
        hashMap0.table = entryArray24;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for hashMap0", hashMap0.property_3());
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.property_1();
        boolean boolean2 = hashMap0.property_1();
        hashMap0.clear();
        boolean boolean4 = hashMap0.property_2();
        boolean boolean5 = hashMap0.composedRepOK();
        int int6 = hashMap0.modCount;
        java.lang.Object obj9 = hashMap0.put((java.lang.Object) 0, (java.lang.Object) 10.0d);
        hashMap0.modCount = (-1);
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        boolean boolean13 = hashMap12.property_1();
        boolean boolean14 = hashMap12.property_1();
        hashMap12.clear();
        boolean boolean16 = hashMap12.composedRepOK();
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        boolean boolean18 = hashMap17.property_1();
        hashMap17.modCount = '4';
        java.lang.Object obj21 = hashMap12.get((java.lang.Object) hashMap17);
        int int22 = hashMap12.modCount;
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        boolean boolean24 = hashMap23.property_1();
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        boolean boolean27 = hashMap26.property_1();
        boolean boolean28 = hashMap26.property_1();
        hashMap26.clear();
        boolean boolean30 = hashMap26.composedRepOK();
        int int31 = hashMap26.modCount;
        boolean boolean32 = hashMap26.property_2();
        java.lang.Object obj33 = hashMap23.put((java.lang.Object) (byte) -1, (java.lang.Object) hashMap26);
        system.testclass.HashMap hashMap34 = new system.testclass.HashMap();
        boolean boolean35 = hashMap34.property_1();
        boolean boolean36 = hashMap34.property_1();
        hashMap34.clear();
        boolean boolean38 = hashMap34.property_2();
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        boolean boolean40 = hashMap39.property_1();
        hashMap39.modCount = '4';
        boolean boolean43 = hashMap39.property_1();
        boolean boolean44 = hashMap39.isEmpty();
        java.lang.Class<?> wildcardClass45 = hashMap39.getClass();
        java.lang.Object obj46 = hashMap26.put((java.lang.Object) hashMap34, (java.lang.Object) wildcardClass45);
        system.testclass.HashMap.Entry[] entryArray47 = hashMap34.table;
        hashMap12.table = entryArray47;
        hashMap0.table = entryArray47;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for hashMap0", hashMap0.property_3());
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.composedRepOK();
        java.lang.Object obj4 = hashMap0.put((java.lang.Object) (byte) 1, (java.lang.Object) (byte) 10);
        system.testclass.HashMap hashMap5 = new system.testclass.HashMap();
        boolean boolean6 = hashMap5.property_1();
        boolean boolean7 = hashMap5.property_1();
        hashMap5.clear();
        boolean boolean9 = hashMap5.composedRepOK();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        boolean boolean11 = hashMap10.property_1();
        hashMap10.modCount = '4';
        java.lang.Object obj14 = hashMap5.get((java.lang.Object) hashMap10);
        system.testclass.HashMap.Entry[] entryArray15 = hashMap10.table;
        hashMap0.table = entryArray15;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for hashMap0", hashMap0.property_3());
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.property_1();
        system.testclass.HashMap hashMap3 = new system.testclass.HashMap();
        boolean boolean4 = hashMap3.property_1();
        boolean boolean5 = hashMap3.property_1();
        hashMap3.clear();
        boolean boolean7 = hashMap3.composedRepOK();
        int int8 = hashMap3.modCount;
        boolean boolean9 = hashMap3.property_2();
        java.lang.Object obj10 = hashMap0.put((java.lang.Object) (byte) -1, (java.lang.Object) hashMap3);
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        boolean boolean12 = hashMap11.property_1();
        boolean boolean13 = hashMap11.property_1();
        hashMap11.clear();
        boolean boolean15 = hashMap11.property_2();
        system.testclass.HashMap hashMap16 = new system.testclass.HashMap();
        boolean boolean17 = hashMap16.property_1();
        hashMap16.modCount = '4';
        boolean boolean20 = hashMap16.property_1();
        boolean boolean21 = hashMap16.isEmpty();
        java.lang.Class<?> wildcardClass22 = hashMap16.getClass();
        java.lang.Object obj23 = hashMap3.put((java.lang.Object) hashMap11, (java.lang.Object) wildcardClass22);
        int int24 = hashMap3.modCount;
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        boolean boolean26 = hashMap25.property_1();
        boolean boolean27 = hashMap25.property_1();
        hashMap25.clear();
        boolean boolean29 = hashMap25.composedRepOK();
        int int30 = hashMap25.modCount;
        system.testclass.HashMap hashMap31 = new system.testclass.HashMap();
        boolean boolean32 = hashMap31.property_1();
        boolean boolean33 = hashMap31.property_1();
        hashMap31.clear();
        boolean boolean35 = hashMap31.composedRepOK();
        boolean boolean36 = hashMap31.property_1();
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap();
        boolean boolean38 = hashMap37.property_1();
        boolean boolean39 = hashMap37.property_1();
        hashMap37.clear();
        boolean boolean41 = hashMap37.property_2();
        boolean boolean42 = hashMap37.composedRepOK();
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap();
        boolean boolean45 = hashMap44.composedRepOK();
        system.testclass.HashMap.Entry[] entryArray46 = hashMap44.table;
        java.lang.Object obj47 = hashMap37.put((java.lang.Object) (byte) 0, (java.lang.Object) entryArray46);
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap();
        boolean boolean49 = hashMap48.property_1();
        boolean boolean50 = hashMap48.property_1();
        hashMap48.clear();
        boolean boolean52 = hashMap48.property_2();
        int int53 = hashMap48.modCount;
        system.testclass.HashMap.Entry[] entryArray54 = hashMap48.table;
        java.lang.Object obj55 = hashMap31.put((java.lang.Object) (byte) 0, (java.lang.Object) entryArray54);
        boolean boolean56 = hashMap31.isEmpty();
        java.lang.Object obj57 = hashMap25.remove((java.lang.Object) boolean56);
        system.testclass.HashMap hashMap58 = new system.testclass.HashMap();
        boolean boolean59 = hashMap58.property_1();
        boolean boolean60 = hashMap58.property_1();
        hashMap58.clear();
        boolean boolean62 = hashMap58.composedRepOK();
        int int63 = hashMap58.modCount;
        boolean boolean64 = hashMap58.property_2();
        boolean boolean65 = hashMap58.composedRepOK();
        system.testclass.HashMap.Entry[] entryArray66 = hashMap58.table;
        hashMap25.table = entryArray66;
        hashMap3.table = entryArray66;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for hashMap3", hashMap3.property_3());
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.property_1();
        boolean boolean2 = hashMap0.property_1();
        hashMap0.clear();
        boolean boolean4 = hashMap0.property_2();
        boolean boolean5 = hashMap0.composedRepOK();
        int int6 = hashMap0.modCount;
        java.lang.Object obj9 = hashMap0.put((java.lang.Object) 0, (java.lang.Object) 10.0d);
        int int10 = hashMap0.size();
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        boolean boolean12 = hashMap11.property_1();
        hashMap11.modCount = '4';
        boolean boolean15 = hashMap11.property_1();
        boolean boolean16 = hashMap11.composedRepOK();
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        boolean boolean18 = hashMap17.property_1();
        boolean boolean19 = hashMap17.property_1();
        hashMap17.clear();
        boolean boolean21 = hashMap17.composedRepOK();
        system.testclass.HashMap.Entry[] entryArray22 = hashMap17.table;
        hashMap11.table = entryArray22;
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap((int) '#');
        java.lang.Object obj26 = hashMap11.remove((java.lang.Object) '#');
        system.testclass.HashMap.Entry[] entryArray27 = hashMap11.table;
        hashMap0.table = entryArray27;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for hashMap0", hashMap0.property_3());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.property_1();
        boolean boolean2 = hashMap0.property_1();
        hashMap0.clear();
        int int4 = hashMap0.modCount;
        int int5 = hashMap0.size();
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        boolean boolean7 = hashMap6.property_1();
        boolean boolean8 = hashMap6.property_1();
        hashMap6.clear();
        boolean boolean10 = hashMap6.composedRepOK();
        boolean boolean11 = hashMap6.property_1();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        boolean boolean13 = hashMap12.property_1();
        boolean boolean14 = hashMap12.property_1();
        hashMap12.clear();
        boolean boolean16 = hashMap12.property_2();
        boolean boolean17 = hashMap12.composedRepOK();
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        boolean boolean20 = hashMap19.composedRepOK();
        system.testclass.HashMap.Entry[] entryArray21 = hashMap19.table;
        java.lang.Object obj22 = hashMap12.put((java.lang.Object) (byte) 0, (java.lang.Object) entryArray21);
        system.testclass.HashMap hashMap23 = new system.testclass.HashMap();
        boolean boolean24 = hashMap23.property_1();
        boolean boolean25 = hashMap23.property_1();
        hashMap23.clear();
        boolean boolean27 = hashMap23.property_2();
        int int28 = hashMap23.modCount;
        system.testclass.HashMap.Entry[] entryArray29 = hashMap23.table;
        java.lang.Object obj30 = hashMap6.put((java.lang.Object) (byte) 0, (java.lang.Object) entryArray29);
        boolean boolean31 = hashMap6.isEmpty();
        java.lang.Object obj32 = null;
        system.testclass.HashMap hashMap33 = new system.testclass.HashMap();
        boolean boolean34 = hashMap33.property_1();
        boolean boolean35 = hashMap33.property_1();
        hashMap33.clear();
        boolean boolean37 = hashMap33.composedRepOK();
        boolean boolean38 = hashMap33.property_1();
        system.testclass.HashMap hashMap39 = new system.testclass.HashMap();
        boolean boolean40 = hashMap39.property_1();
        boolean boolean41 = hashMap39.property_1();
        hashMap39.clear();
        boolean boolean43 = hashMap39.property_2();
        int int44 = hashMap39.modCount;
        system.testclass.HashMap.Entry[] entryArray45 = hashMap39.table;
        system.testclass.HashMap.Entry[] entryArray46 = hashMap39.table;
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap();
        boolean boolean48 = hashMap47.property_1();
        boolean boolean49 = hashMap47.property_1();
        hashMap47.clear();
        boolean boolean51 = hashMap47.composedRepOK();
        system.testclass.HashMap hashMap52 = new system.testclass.HashMap();
        boolean boolean53 = hashMap52.property_1();
        hashMap52.modCount = '4';
        java.lang.Object obj56 = hashMap47.get((java.lang.Object) hashMap52);
        java.lang.Object obj57 = hashMap33.put((java.lang.Object) hashMap39, obj56);
        java.lang.Object obj58 = hashMap6.put(obj32, (java.lang.Object) hashMap33);
        boolean boolean59 = hashMap6.isEmpty();
        system.testclass.HashMap.Entry[] entryArray60 = hashMap6.table;
        hashMap0.table = entryArray60;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for hashMap0", hashMap0.property_3());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.property_1();
        boolean boolean2 = hashMap0.property_1();
        hashMap0.clear();
        boolean boolean4 = hashMap0.property_2();
        int int5 = hashMap0.modCount;
        system.testclass.HashMap.Entry[] entryArray6 = hashMap0.table;
        hashMap0.clear();
        boolean boolean8 = hashMap0.composedRepOK();
        system.testclass.HashMap hashMap9 = new system.testclass.HashMap();
        boolean boolean10 = hashMap9.property_1();
        boolean boolean11 = hashMap9.property_1();
        hashMap9.clear();
        boolean boolean13 = hashMap9.composedRepOK();
        int int14 = hashMap9.modCount;
        boolean boolean15 = hashMap9.property_2();
        boolean boolean16 = hashMap9.property_1();
        boolean boolean17 = hashMap9.property_2();
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        boolean boolean19 = hashMap18.property_1();
        boolean boolean20 = hashMap18.property_1();
        hashMap18.clear();
        boolean boolean22 = hashMap18.property_1();
        hashMap18.modCount = 10;
        system.testclass.HashMap hashMap25 = new system.testclass.HashMap();
        boolean boolean26 = hashMap25.property_1();
        boolean boolean27 = hashMap25.property_1();
        hashMap25.clear();
        boolean boolean29 = hashMap25.property_2();
        system.testclass.HashMap.Entry[] entryArray30 = new system.testclass.HashMap.Entry[] {};
        hashMap25.table = entryArray30;
        hashMap25.modCount = (short) 1;
        system.testclass.HashMap.Entry[] entryArray34 = hashMap25.table;
        boolean boolean35 = hashMap25.property_1();
        java.lang.Object obj36 = null;
        java.lang.Object obj37 = hashMap18.put((java.lang.Object) hashMap25, obj36);
        java.lang.Object obj38 = hashMap9.remove((java.lang.Object) hashMap25);
        int int39 = hashMap9.modCount;
        system.testclass.HashMap hashMap40 = new system.testclass.HashMap();
        boolean boolean41 = hashMap40.property_1();
        hashMap40.modCount = '4';
        boolean boolean44 = hashMap40.composedRepOK();
        boolean boolean45 = hashMap40.isEmpty();
        system.testclass.HashMap.Entry[] entryArray46 = hashMap40.table;
        java.lang.Object obj47 = hashMap0.put((java.lang.Object) hashMap9, (java.lang.Object) hashMap40);
        system.testclass.HashMap hashMap48 = new system.testclass.HashMap();
        boolean boolean49 = hashMap48.property_1();
        boolean boolean50 = hashMap48.property_1();
        hashMap48.clear();
        boolean boolean52 = hashMap48.property_1();
        java.lang.Object obj55 = hashMap48.put((java.lang.Object) false, (java.lang.Object) 10.0d);
        system.testclass.HashMap hashMap56 = new system.testclass.HashMap();
        java.lang.Object obj57 = hashMap48.get((java.lang.Object) hashMap56);
        boolean boolean58 = hashMap48.composedRepOK();
        boolean boolean59 = hashMap48.composedRepOK();
        system.testclass.HashMap.Entry[] entryArray60 = hashMap48.table;
        hashMap40.table = entryArray60;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for hashMap40", hashMap40.property_3());
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        boolean boolean1 = hashMap0.property_1();
        hashMap0.modCount = '4';
        boolean boolean4 = hashMap0.property_1();
        boolean boolean5 = hashMap0.isEmpty();
        boolean boolean6 = hashMap0.property_2();
        system.testclass.HashMap hashMap7 = new system.testclass.HashMap();
        boolean boolean8 = hashMap7.property_1();
        boolean boolean9 = hashMap7.property_1();
        hashMap7.clear();
        boolean boolean11 = hashMap7.property_1();
        hashMap7.modCount = 10;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        boolean boolean15 = hashMap14.property_1();
        boolean boolean16 = hashMap14.property_1();
        hashMap14.clear();
        boolean boolean18 = hashMap14.property_2();
        system.testclass.HashMap.Entry[] entryArray19 = new system.testclass.HashMap.Entry[] {};
        hashMap14.table = entryArray19;
        hashMap14.modCount = (short) 1;
        system.testclass.HashMap.Entry[] entryArray23 = hashMap14.table;
        boolean boolean24 = hashMap14.property_1();
        java.lang.Object obj25 = null;
        java.lang.Object obj26 = hashMap7.put((java.lang.Object) hashMap14, obj25);
        boolean boolean27 = hashMap14.isEmpty();
        java.lang.Object obj28 = hashMap0.get((java.lang.Object) hashMap14);
        int int29 = hashMap14.size();
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        boolean boolean31 = hashMap30.property_1();
        boolean boolean32 = hashMap30.property_1();
        hashMap30.clear();
        boolean boolean34 = hashMap30.composedRepOK();
        boolean boolean35 = hashMap30.property_1();
        system.testclass.HashMap hashMap36 = new system.testclass.HashMap();
        boolean boolean37 = hashMap36.property_1();
        boolean boolean38 = hashMap36.property_1();
        hashMap36.clear();
        boolean boolean40 = hashMap36.property_2();
        boolean boolean41 = hashMap36.composedRepOK();
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap();
        boolean boolean44 = hashMap43.composedRepOK();
        system.testclass.HashMap.Entry[] entryArray45 = hashMap43.table;
        java.lang.Object obj46 = hashMap36.put((java.lang.Object) (byte) 0, (java.lang.Object) entryArray45);
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap();
        boolean boolean48 = hashMap47.property_1();
        boolean boolean49 = hashMap47.property_1();
        hashMap47.clear();
        boolean boolean51 = hashMap47.property_2();
        int int52 = hashMap47.modCount;
        system.testclass.HashMap.Entry[] entryArray53 = hashMap47.table;
        java.lang.Object obj54 = hashMap30.put((java.lang.Object) (byte) 0, (java.lang.Object) entryArray53);
        boolean boolean55 = hashMap30.isEmpty();
        java.lang.Object obj56 = null;
        system.testclass.HashMap hashMap57 = new system.testclass.HashMap();
        boolean boolean58 = hashMap57.property_1();
        boolean boolean59 = hashMap57.property_1();
        hashMap57.clear();
        boolean boolean61 = hashMap57.composedRepOK();
        boolean boolean62 = hashMap57.property_1();
        system.testclass.HashMap hashMap63 = new system.testclass.HashMap();
        boolean boolean64 = hashMap63.property_1();
        boolean boolean65 = hashMap63.property_1();
        hashMap63.clear();
        boolean boolean67 = hashMap63.property_2();
        int int68 = hashMap63.modCount;
        system.testclass.HashMap.Entry[] entryArray69 = hashMap63.table;
        system.testclass.HashMap.Entry[] entryArray70 = hashMap63.table;
        system.testclass.HashMap hashMap71 = new system.testclass.HashMap();
        boolean boolean72 = hashMap71.property_1();
        boolean boolean73 = hashMap71.property_1();
        hashMap71.clear();
        boolean boolean75 = hashMap71.composedRepOK();
        system.testclass.HashMap hashMap76 = new system.testclass.HashMap();
        boolean boolean77 = hashMap76.property_1();
        hashMap76.modCount = '4';
        java.lang.Object obj80 = hashMap71.get((java.lang.Object) hashMap76);
        java.lang.Object obj81 = hashMap57.put((java.lang.Object) hashMap63, obj80);
        java.lang.Object obj82 = hashMap30.put(obj56, (java.lang.Object) hashMap57);
        boolean boolean83 = hashMap30.composedRepOK();
        system.testclass.HashMap.Entry[] entryArray84 = hashMap30.table;
        hashMap14.table = entryArray84;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for hashMap14", hashMap14.property_3());
    }
}

