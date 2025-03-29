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
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap4.clear();
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap4);
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap7.table = entryArray8;
        hashMap4.table = entryArray8;
        hashMap4.modCount = (-1);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap4", hashMap4.repOK_2());
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        boolean boolean3 = hashMap1.isEmpty();
        boolean boolean4 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap6.clear();
        boolean boolean8 = hashMap6.repOK();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray11 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap10.table = entryArray11;
        hashMap9.table = entryArray11;
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap18.clear();
        java.lang.Object obj20 = hashMap14.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap18);
        java.lang.Object obj21 = hashMap6.put((java.lang.Object) entryArray11, (java.lang.Object) hashMap18);
        hashMap18.modCount = (byte) 100;
        java.lang.Object obj25 = hashMap1.put((java.lang.Object) (byte) 100, (java.lang.Object) 10.0d);
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap30.clear();
        java.lang.Object obj32 = hashMap26.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap30);
        hashMap26.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray34 = hashMap26.table;
        hashMap1.table = entryArray34;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap4.clear();
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap4);
        java.lang.Object obj8 = hashMap0.get((java.lang.Object) 10);
        boolean boolean9 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap((int) 'a');
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap11.table;
        hashMap0.table = entryArray12;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap2.clear();
        boolean boolean4 = hashMap2.isEmpty();
        boolean boolean5 = hashMap2.isEmpty();
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
        hashMap19.modCount = (byte) 100;
        java.lang.Object obj26 = hashMap2.put((java.lang.Object) (byte) 100, (java.lang.Object) 10.0d);
        int int27 = hashMap2.size();
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap29.clear();
        hashMap29.clear();
        boolean boolean32 = hashMap29.repOK();
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap37 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap37.clear();
        java.lang.Object obj39 = hashMap33.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap37);
        system.classfixer.classes.HashMap hashMap40 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray41 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap40.table = entryArray41;
        hashMap37.table = entryArray41;
        int int44 = hashMap37.size();
        java.lang.Object obj45 = hashMap2.put((java.lang.Object) hashMap29, (java.lang.Object) hashMap37);
        java.lang.Object obj46 = hashMap0.get(obj45);
        hashMap0.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap4.clear();
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap4);
        java.lang.Object obj8 = hashMap0.get((java.lang.Object) 10);
        boolean boolean9 = hashMap0.repOK();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap11.clear();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap17.clear();
        java.lang.Object obj19 = hashMap13.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap17);
        hashMap13.clear();
        boolean boolean21 = hashMap13.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray22 = hashMap13.table;
        hashMap11.table = entryArray22;
        hashMap0.table = entryArray22;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        java.lang.Object obj5 = hashMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (byte) 0);
        int int6 = hashMap1.modCount;
        int int7 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap12.clear();
        java.lang.Object obj14 = hashMap8.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap12);
        hashMap8.clear();
        java.lang.Object obj18 = hashMap8.put((java.lang.Object) 10L, (java.lang.Object) "");
        java.lang.Object obj19 = hashMap1.remove((java.lang.Object) hashMap8);
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap((int) (byte) 0);
        java.lang.Object obj25 = hashMap21.put((java.lang.Object) (-1.0f), (java.lang.Object) (byte) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray26 = hashMap21.table;
        hashMap1.table = entryArray26;
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray30 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap29.table = entryArray30;
        hashMap28.table = entryArray30;
        system.classfixer.classes.HashMap.Entry[] entryArray33 = hashMap28.table;
        system.classfixer.classes.HashMap hashMap34 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray36 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap35.table = entryArray36;
        hashMap34.table = entryArray36;
        system.classfixer.classes.HashMap.Entry[] entryArray39 = hashMap34.table;
        hashMap28.table = entryArray39;
        hashMap1.table = entryArray39;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 100, (float) 100);
        boolean boolean3 = hashMap2.repOK();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap8.clear();
        java.lang.Object obj10 = hashMap4.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap8);
        system.classfixer.classes.HashMap.Entry[] entryArray11 = hashMap4.table;
        hashMap2.table = entryArray11;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        java.lang.Object obj5 = hashMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (byte) 0);
        int int6 = hashMap1.modCount;
        int int7 = hashMap1.modCount;
        int int8 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap13.clear();
        java.lang.Object obj15 = hashMap9.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap13);
        boolean boolean16 = hashMap13.isEmpty();
        int int17 = hashMap13.modCount;
        int int18 = hashMap13.modCount;
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray21 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap20.table = entryArray21;
        hashMap19.table = entryArray21;
        system.classfixer.classes.HashMap.Entry[] entryArray24 = hashMap19.table;
        hashMap13.table = entryArray24;
        hashMap1.table = entryArray24;
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
        int int7 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap12.clear();
        java.lang.Object obj14 = hashMap8.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap12);
        hashMap8.clear();
        java.lang.Object obj18 = hashMap8.put((java.lang.Object) 10L, (java.lang.Object) "");
        java.lang.Object obj19 = hashMap1.remove((java.lang.Object) hashMap8);
        system.classfixer.classes.HashMap.Entry[] entryArray20 = hashMap8.table;
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap22.clear();
        hashMap22.clear();
        boolean boolean25 = hashMap22.repOK();
        int int26 = hashMap22.size();
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray29 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap28.table = entryArray29;
        hashMap27.table = entryArray29;
        hashMap22.table = entryArray29;
        hashMap8.table = entryArray29;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap8", hashMap8.repOK_2());
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray1 = hashMap0.table;
        int int2 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        java.lang.Object obj8 = hashMap4.put((java.lang.Object) (-1.0f), (java.lang.Object) (byte) 0);
        int int9 = hashMap4.modCount;
        int int10 = hashMap4.modCount;
        boolean boolean11 = hashMap4.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap4.table;
        java.lang.Object obj14 = hashMap0.put((java.lang.Object) hashMap4, (java.lang.Object) 0.0d);
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap16.clear();
        boolean boolean18 = hashMap16.isEmpty();
        boolean boolean19 = hashMap16.isEmpty();
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap21.clear();
        boolean boolean23 = hashMap21.repOK();
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray26 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap25.table = entryArray26;
        hashMap24.table = entryArray26;
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap33.clear();
        java.lang.Object obj35 = hashMap29.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap33);
        java.lang.Object obj36 = hashMap21.put((java.lang.Object) entryArray26, (java.lang.Object) hashMap33);
        hashMap33.modCount = (byte) 100;
        java.lang.Object obj40 = hashMap16.put((java.lang.Object) (byte) 100, (java.lang.Object) 10.0d);
        int int41 = hashMap16.size();
        system.classfixer.classes.HashMap hashMap43 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap43.clear();
        hashMap43.clear();
        boolean boolean46 = hashMap43.repOK();
        system.classfixer.classes.HashMap hashMap47 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap49 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap51 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap51.clear();
        java.lang.Object obj53 = hashMap47.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap51);
        system.classfixer.classes.HashMap hashMap54 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray55 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap54.table = entryArray55;
        hashMap51.table = entryArray55;
        int int58 = hashMap51.size();
        java.lang.Object obj59 = hashMap16.put((java.lang.Object) hashMap43, (java.lang.Object) hashMap51);
        system.classfixer.classes.HashMap hashMap61 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap62 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray63 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap62.table = entryArray63;
        java.lang.Object obj65 = hashMap61.get((java.lang.Object) entryArray63);
        hashMap43.table = entryArray63;
        hashMap4.table = entryArray63;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap4", hashMap4.repOK_2());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap7.clear();
        java.lang.Object obj9 = hashMap3.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap7);
        int int10 = hashMap3.modCount;
        int int11 = hashMap3.size();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap3.table;
        hashMap1.table = entryArray12;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) '4');
        hashMap1.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        java.lang.Object obj5 = hashMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (byte) 0);
        int int6 = hashMap1.modCount;
        int int7 = hashMap1.modCount;
        hashMap1.modCount = 0;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap14.clear();
        java.lang.Object obj16 = hashMap10.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap14);
        boolean boolean17 = hashMap14.isEmpty();
        int int18 = hashMap14.modCount;
        int int19 = hashMap14.modCount;
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray22 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap21.table = entryArray22;
        hashMap20.table = entryArray22;
        system.classfixer.classes.HashMap.Entry[] entryArray25 = hashMap20.table;
        hashMap14.table = entryArray25;
        hashMap1.table = entryArray25;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        boolean boolean3 = hashMap1.isEmpty();
        boolean boolean4 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap6.clear();
        boolean boolean8 = hashMap6.repOK();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray11 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap10.table = entryArray11;
        hashMap9.table = entryArray11;
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap18.clear();
        java.lang.Object obj20 = hashMap14.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap18);
        java.lang.Object obj21 = hashMap6.put((java.lang.Object) entryArray11, (java.lang.Object) hashMap18);
        hashMap18.modCount = (byte) 100;
        java.lang.Object obj25 = hashMap1.put((java.lang.Object) (byte) 100, (java.lang.Object) 10.0d);
        int int26 = hashMap1.size();
        boolean boolean27 = hashMap1.repOK();
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray29 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap28.table = entryArray29;
        int int31 = hashMap28.size();
        boolean boolean32 = hashMap28.repOK();
        hashMap28.clear();
        boolean boolean34 = hashMap28.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray35 = hashMap28.table;
        hashMap1.table = entryArray35;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap4.clear();
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap4);
        boolean boolean7 = hashMap4.isEmpty();
        int int8 = hashMap4.modCount;
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray11 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap10.table = entryArray11;
        hashMap9.table = entryArray11;
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap15.clear();
        java.lang.Object obj17 = hashMap4.put((java.lang.Object) entryArray11, (java.lang.Object) hashMap15);
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray20 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap19.table = entryArray20;
        hashMap18.table = entryArray20;
        system.classfixer.classes.HashMap.Entry[] entryArray23 = hashMap18.table;
        hashMap4.table = entryArray23;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap4", hashMap4.repOK_2());
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray1 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap0.table = entryArray1;
        int int3 = hashMap0.size();
        boolean boolean4 = hashMap0.repOK();
        hashMap0.clear();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap10.clear();
        java.lang.Object obj12 = hashMap6.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap10);
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap6.table;
        hashMap0.table = entryArray13;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap4.clear();
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap4);
        int int7 = hashMap0.modCount;
        int int8 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap(0, (float) 2);
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray14 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap13.table = entryArray14;
        hashMap12.table = entryArray14;
        hashMap11.table = entryArray14;
        hashMap0.table = entryArray14;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) '4');
        system.classfixer.classes.HashMap hashMap3 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap3.clear();
        boolean boolean5 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = hashMap3.table;
        boolean boolean7 = hashMap3.isEmpty();
        boolean boolean8 = hashMap3.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap3.table;
        hashMap1.table = entryArray9;
        hashMap1.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        boolean boolean3 = hashMap1.isEmpty();
        boolean boolean4 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap6.clear();
        boolean boolean8 = hashMap6.repOK();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray11 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap10.table = entryArray11;
        hashMap9.table = entryArray11;
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap18.clear();
        java.lang.Object obj20 = hashMap14.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap18);
        java.lang.Object obj21 = hashMap6.put((java.lang.Object) entryArray11, (java.lang.Object) hashMap18);
        hashMap18.modCount = (byte) 100;
        java.lang.Object obj25 = hashMap1.put((java.lang.Object) (byte) 100, (java.lang.Object) 10.0d);
        int int26 = hashMap1.size();
        java.lang.Object obj28 = hashMap1.get((java.lang.Object) (byte) -1);
        hashMap1.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap4.clear();
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap4);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap8.clear();
        boolean boolean10 = hashMap8.isEmpty();
        boolean boolean11 = hashMap8.isEmpty();
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap13.clear();
        boolean boolean15 = hashMap13.repOK();
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray18 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap17.table = entryArray18;
        hashMap16.table = entryArray18;
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap23 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap25 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap25.clear();
        java.lang.Object obj27 = hashMap21.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap25);
        java.lang.Object obj28 = hashMap13.put((java.lang.Object) entryArray18, (java.lang.Object) hashMap25);
        hashMap25.modCount = (byte) 100;
        java.lang.Object obj32 = hashMap8.put((java.lang.Object) (byte) 100, (java.lang.Object) 10.0d);
        int int33 = hashMap8.size();
        system.classfixer.classes.HashMap hashMap34 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap36 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap38 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap38.clear();
        java.lang.Object obj40 = hashMap34.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap38);
        int int41 = hashMap34.modCount;
        int int42 = hashMap34.size();
        system.classfixer.classes.HashMap.Entry[] entryArray43 = hashMap34.table;
        java.lang.Object obj44 = hashMap8.get((java.lang.Object) entryArray43);
        hashMap0.table = entryArray43;
        system.classfixer.classes.HashMap hashMap46 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap48 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap50 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap50.clear();
        java.lang.Object obj52 = hashMap46.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap50);
        boolean boolean53 = hashMap50.isEmpty();
        int int54 = hashMap50.modCount;
        int int55 = hashMap50.modCount;
        system.classfixer.classes.HashMap hashMap56 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap57 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray58 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap57.table = entryArray58;
        hashMap56.table = entryArray58;
        system.classfixer.classes.HashMap.Entry[] entryArray61 = hashMap56.table;
        hashMap50.table = entryArray61;
        hashMap0.table = entryArray61;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        java.lang.Object obj5 = hashMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (byte) 0);
        int int6 = hashMap1.modCount;
        int int7 = hashMap1.modCount;
        int int8 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap((int) (byte) 0);
        java.lang.Object obj14 = hashMap10.put((java.lang.Object) (-1.0f), (java.lang.Object) (byte) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap10.table;
        java.lang.Object obj17 = hashMap1.put((java.lang.Object) hashMap10, (java.lang.Object) (short) 100);
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap19.clear();
        boolean boolean21 = hashMap19.isEmpty();
        boolean boolean22 = hashMap19.isEmpty();
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap24.clear();
        boolean boolean26 = hashMap24.isEmpty();
        boolean boolean27 = hashMap24.isEmpty();
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap29.clear();
        boolean boolean31 = hashMap29.repOK();
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap33 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray34 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap33.table = entryArray34;
        hashMap32.table = entryArray34;
        system.classfixer.classes.HashMap hashMap37 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap39 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap41 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap41.clear();
        java.lang.Object obj43 = hashMap37.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap41);
        java.lang.Object obj44 = hashMap29.put((java.lang.Object) entryArray34, (java.lang.Object) hashMap41);
        hashMap41.modCount = (byte) 100;
        java.lang.Object obj48 = hashMap24.put((java.lang.Object) (byte) 100, (java.lang.Object) 10.0d);
        system.classfixer.classes.HashMap hashMap49 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap50 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray51 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap50.table = entryArray51;
        hashMap49.table = entryArray51;
        system.classfixer.classes.HashMap.Entry[] entryArray54 = hashMap49.table;
        system.classfixer.classes.HashMap hashMap55 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap56 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray57 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap56.table = entryArray57;
        hashMap55.table = entryArray57;
        system.classfixer.classes.HashMap.Entry[] entryArray60 = hashMap55.table;
        hashMap49.table = entryArray60;
        java.lang.Object obj62 = hashMap19.put((java.lang.Object) 10.0d, (java.lang.Object) entryArray60);
        hashMap1.table = entryArray60;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        hashMap1.clear();
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = hashMap1.remove(obj4);
        int int6 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap11.clear();
        java.lang.Object obj13 = hashMap7.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap11);
        hashMap7.clear();
        boolean boolean15 = hashMap7.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray16 = hashMap7.table;
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap18.clear();
        boolean boolean20 = hashMap18.repOK();
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray23 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap22.table = entryArray23;
        hashMap21.table = entryArray23;
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap30.clear();
        java.lang.Object obj32 = hashMap26.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap30);
        java.lang.Object obj33 = hashMap18.put((java.lang.Object) entryArray23, (java.lang.Object) hashMap30);
        system.classfixer.classes.HashMap hashMap34 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray35 = hashMap34.table;
        hashMap30.table = entryArray35;
        java.lang.Object obj37 = hashMap7.remove((java.lang.Object) hashMap30);
        system.classfixer.classes.HashMap hashMap40 = new system.classfixer.classes.HashMap(0, (float) 2);
        system.classfixer.classes.HashMap hashMap41 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap42 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray43 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap42.table = entryArray43;
        hashMap41.table = entryArray43;
        hashMap40.table = entryArray43;
        system.classfixer.classes.HashMap.Entry[] entryArray47 = hashMap40.table;
        java.lang.Object obj48 = hashMap1.put((java.lang.Object) hashMap7, (java.lang.Object) hashMap40);
        system.classfixer.classes.HashMap hashMap50 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap53 = new system.classfixer.classes.HashMap((int) (byte) 0);
        java.lang.Object obj54 = hashMap50.put((java.lang.Object) (-1.0f), (java.lang.Object) (byte) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray55 = hashMap50.table;
        hashMap40.table = entryArray55;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap40", hashMap40.repOK_2());
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap4.clear();
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap4);
        hashMap0.clear();
        hashMap0.modCount = ' ';
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray12 = hashMap11.table;
        java.lang.Object obj13 = hashMap0.put((java.lang.Object) (-1), (java.lang.Object) hashMap11);
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap15.clear();
        boolean boolean17 = hashMap15.isEmpty();
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray19 = hashMap18.table;
        int int20 = hashMap18.modCount;
        system.classfixer.classes.HashMap.Entry[] entryArray21 = hashMap18.table;
        java.lang.Object obj22 = hashMap15.remove((java.lang.Object) entryArray21);
        hashMap0.table = entryArray21;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 1);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap(100, (float) 1);
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap10.clear();
        java.lang.Object obj12 = hashMap6.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap10);
        int int13 = hashMap10.size();
        java.lang.Object obj14 = hashMap4.put((java.lang.Object) "", (java.lang.Object) hashMap10);
        system.classfixer.classes.HashMap.Entry[] entryArray15 = hashMap4.table;
        java.lang.Object obj16 = hashMap1.remove((java.lang.Object) hashMap4);
        boolean boolean17 = hashMap4.repOK();
        hashMap4.modCount = (byte) 100;
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap21.clear();
        hashMap21.clear();
        java.lang.Object obj24 = null;
        java.lang.Object obj25 = hashMap21.remove(obj24);
        int int26 = hashMap21.size();
        system.classfixer.classes.HashMap.Entry[] entryArray27 = hashMap21.table;
        hashMap4.table = entryArray27;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap4", hashMap4.repOK_2());
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray3 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap2.table = entryArray3;
        java.lang.Object obj5 = hashMap1.get((java.lang.Object) entryArray3);
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray7 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap6.table = entryArray7;
        int int9 = hashMap6.size();
        boolean boolean10 = hashMap6.repOK();
        hashMap6.clear();
        int int12 = hashMap6.size();
        int int13 = hashMap6.modCount;
        int int14 = hashMap6.size();
        java.lang.Object obj15 = hashMap1.remove((java.lang.Object) hashMap6);
        hashMap1.modCount = (byte) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        boolean boolean3 = hashMap1.isEmpty();
        boolean boolean4 = hashMap1.isEmpty();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap6.clear();
        boolean boolean8 = hashMap6.repOK();
        system.classfixer.classes.HashMap hashMap9 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray11 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap10.table = entryArray11;
        hashMap9.table = entryArray11;
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap18.clear();
        java.lang.Object obj20 = hashMap14.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap18);
        java.lang.Object obj21 = hashMap6.put((java.lang.Object) entryArray11, (java.lang.Object) hashMap18);
        hashMap18.modCount = (byte) 100;
        java.lang.Object obj25 = hashMap1.put((java.lang.Object) (byte) 100, (java.lang.Object) 10.0d);
        int int26 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap28.clear();
        hashMap28.clear();
        boolean boolean31 = hashMap28.repOK();
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap34 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap36 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap36.clear();
        java.lang.Object obj38 = hashMap32.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap36);
        system.classfixer.classes.HashMap hashMap39 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray40 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap39.table = entryArray40;
        hashMap36.table = entryArray40;
        int int43 = hashMap36.size();
        java.lang.Object obj44 = hashMap1.put((java.lang.Object) hashMap28, (java.lang.Object) hashMap36);
        system.classfixer.classes.HashMap hashMap47 = new system.classfixer.classes.HashMap((int) (short) 0, (float) 10);
        java.lang.Object obj49 = hashMap47.get((java.lang.Object) (-1L));
        boolean boolean50 = hashMap47.repOK();
        system.classfixer.classes.HashMap hashMap52 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap52.clear();
        boolean boolean54 = hashMap52.repOK();
        system.classfixer.classes.HashMap hashMap55 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap56 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray57 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap56.table = entryArray57;
        hashMap55.table = entryArray57;
        system.classfixer.classes.HashMap hashMap60 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap62 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap64 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap64.clear();
        java.lang.Object obj66 = hashMap60.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap64);
        java.lang.Object obj67 = hashMap52.put((java.lang.Object) entryArray57, (java.lang.Object) hashMap64);
        system.classfixer.classes.HashMap hashMap68 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray69 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap68.table = entryArray69;
        system.classfixer.classes.HashMap.Entry[] entryArray71 = hashMap68.table;
        int int72 = hashMap68.size();
        java.lang.Object obj73 = hashMap64.remove((java.lang.Object) int72);
        java.lang.Object obj74 = hashMap1.put((java.lang.Object) boolean50, (java.lang.Object) hashMap64);
        system.classfixer.classes.HashMap hashMap77 = new system.classfixer.classes.HashMap((int) (byte) 1, (float) (short) 10);
        system.classfixer.classes.HashMap.Entry[] entryArray78 = hashMap77.table;
        hashMap1.table = entryArray78;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap4.clear();
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap4);
        hashMap0.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap((int) (byte) 0);
        java.lang.Object obj14 = hashMap10.put((java.lang.Object) (-1.0f), (java.lang.Object) (byte) 0);
        int int15 = hashMap10.modCount;
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap17.clear();
        boolean boolean19 = hashMap17.isEmpty();
        boolean boolean20 = hashMap17.isEmpty();
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
        hashMap34.modCount = (byte) 100;
        java.lang.Object obj41 = hashMap17.put((java.lang.Object) (byte) 100, (java.lang.Object) 10.0d);
        java.lang.Object obj42 = hashMap10.get(obj41);
        java.lang.Object obj43 = hashMap0.remove((java.lang.Object) hashMap10);
        system.classfixer.classes.HashMap hashMap45 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap45.clear();
        boolean boolean47 = hashMap45.repOK();
        system.classfixer.classes.HashMap hashMap48 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap49 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray50 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap49.table = entryArray50;
        hashMap48.table = entryArray50;
        system.classfixer.classes.HashMap hashMap53 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap55 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap57 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap57.clear();
        java.lang.Object obj59 = hashMap53.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap57);
        java.lang.Object obj60 = hashMap45.put((java.lang.Object) entryArray50, (java.lang.Object) hashMap57);
        system.classfixer.classes.HashMap.Entry[] entryArray61 = hashMap57.table;
        hashMap10.table = entryArray61;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap10", hashMap10.repOK_2());
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap4.clear();
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap4);
        hashMap0.clear();
        boolean boolean8 = hashMap0.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap0.table;
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap((int) (byte) 1);
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap(100, (float) 1);
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap20.clear();
        java.lang.Object obj22 = hashMap16.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap20);
        int int23 = hashMap20.size();
        java.lang.Object obj24 = hashMap14.put((java.lang.Object) "", (java.lang.Object) hashMap20);
        system.classfixer.classes.HashMap.Entry[] entryArray25 = hashMap14.table;
        java.lang.Object obj26 = hashMap11.remove((java.lang.Object) hashMap14);
        java.lang.Object obj27 = hashMap0.get((java.lang.Object) hashMap11);
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap((int) (byte) 0);
        java.lang.Object obj33 = hashMap29.put((java.lang.Object) (-1.0f), (java.lang.Object) (byte) 0);
        int int34 = hashMap29.modCount;
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray36 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap35.table = entryArray36;
        int int38 = hashMap35.size();
        boolean boolean39 = hashMap35.repOK();
        hashMap35.clear();
        boolean boolean41 = hashMap35.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray42 = hashMap35.table;
        system.classfixer.classes.HashMap hashMap43 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap45 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap47 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap47.clear();
        java.lang.Object obj49 = hashMap43.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap47);
        hashMap43.clear();
        system.classfixer.classes.HashMap.Entry[] entryArray51 = hashMap43.table;
        hashMap35.table = entryArray51;
        system.classfixer.classes.HashMap hashMap54 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap57 = new system.classfixer.classes.HashMap((int) (byte) 0);
        java.lang.Object obj58 = hashMap54.put((java.lang.Object) (-1.0f), (java.lang.Object) (byte) 0);
        int int59 = hashMap54.modCount;
        int int60 = hashMap54.modCount;
        java.lang.Object obj61 = hashMap35.get((java.lang.Object) hashMap54);
        hashMap54.modCount = (byte) 0;
        java.lang.Object obj64 = hashMap29.get((java.lang.Object) hashMap54);
        system.classfixer.classes.HashMap hashMap65 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap67 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap69 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap69.clear();
        java.lang.Object obj71 = hashMap65.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap69);
        int int72 = hashMap65.modCount;
        int int73 = hashMap65.size();
        system.classfixer.classes.HashMap.Entry[] entryArray74 = hashMap65.table;
        hashMap29.table = entryArray74;
        hashMap0.table = entryArray74;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        boolean boolean3 = hashMap1.repOK();
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap5 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray6 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap5.table = entryArray6;
        hashMap4.table = entryArray6;
        system.classfixer.classes.HashMap.Entry[] entryArray9 = hashMap4.table;
        boolean boolean10 = hashMap4.isEmpty();
        boolean boolean11 = hashMap4.repOK();
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = hashMap1.put((java.lang.Object) boolean11, obj12);
        int int14 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap19.clear();
        java.lang.Object obj21 = hashMap15.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap19);
        boolean boolean22 = hashMap19.isEmpty();
        hashMap19.modCount = (byte) 10;
        hashMap19.modCount = (short) 0;
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap29 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap31 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap31.clear();
        java.lang.Object obj33 = hashMap27.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap31);
        int int34 = hashMap31.size();
        int int35 = hashMap31.size();
        system.classfixer.classes.HashMap hashMap37 = new system.classfixer.classes.HashMap((int) ' ');
        boolean boolean38 = hashMap37.isEmpty();
        system.classfixer.classes.HashMap hashMap41 = new system.classfixer.classes.HashMap(100, (float) 1);
        system.classfixer.classes.HashMap hashMap43 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap45 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap47 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap47.clear();
        java.lang.Object obj49 = hashMap43.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap47);
        int int50 = hashMap47.size();
        java.lang.Object obj51 = hashMap41.put((java.lang.Object) "", (java.lang.Object) hashMap47);
        boolean boolean52 = hashMap41.repOK();
        int int53 = hashMap41.modCount;
        hashMap41.clear();
        java.lang.Object obj55 = hashMap31.put((java.lang.Object) hashMap37, (java.lang.Object) hashMap41);
        system.classfixer.classes.HashMap hashMap57 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap57.clear();
        boolean boolean59 = hashMap57.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray60 = hashMap57.table;
        boolean boolean61 = hashMap57.isEmpty();
        boolean boolean62 = hashMap57.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray63 = hashMap57.table;
        hashMap41.table = entryArray63;
        java.lang.Object obj65 = hashMap1.put((java.lang.Object) hashMap19, (java.lang.Object) entryArray63);
        system.classfixer.classes.HashMap hashMap66 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray67 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap66.table = entryArray67;
        int int69 = hashMap66.size();
        boolean boolean70 = hashMap66.repOK();
        hashMap66.clear();
        boolean boolean72 = hashMap66.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray73 = hashMap66.table;
        hashMap1.table = entryArray73;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap4.clear();
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap4);
        system.classfixer.classes.HashMap hashMap7 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray8 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap7.table = entryArray8;
        hashMap4.table = entryArray8;
        hashMap4.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap4", hashMap4.repOK_2());
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(100, (float) 1);
        hashMap2.modCount = (short) -1;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        java.lang.Object obj5 = hashMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) (byte) 0);
        int int6 = hashMap1.modCount;
        int int7 = hashMap1.modCount;
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap10 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap12.clear();
        java.lang.Object obj14 = hashMap8.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap12);
        hashMap8.clear();
        java.lang.Object obj18 = hashMap8.put((java.lang.Object) 10L, (java.lang.Object) "");
        java.lang.Object obj19 = hashMap1.remove((java.lang.Object) hashMap8);
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap((int) (byte) 0);
        java.lang.Object obj25 = hashMap21.put((java.lang.Object) (-1.0f), (java.lang.Object) (byte) 0);
        system.classfixer.classes.HashMap.Entry[] entryArray26 = hashMap21.table;
        java.lang.Object obj27 = hashMap1.get((java.lang.Object) hashMap21);
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap30 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap32 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap32.clear();
        java.lang.Object obj34 = hashMap28.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap32);
        int int35 = hashMap32.size();
        int int36 = hashMap32.size();
        system.classfixer.classes.HashMap hashMap38 = new system.classfixer.classes.HashMap((int) ' ');
        boolean boolean39 = hashMap38.isEmpty();
        system.classfixer.classes.HashMap hashMap42 = new system.classfixer.classes.HashMap(100, (float) 1);
        system.classfixer.classes.HashMap hashMap44 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap46 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap48 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap48.clear();
        java.lang.Object obj50 = hashMap44.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap48);
        int int51 = hashMap48.size();
        java.lang.Object obj52 = hashMap42.put((java.lang.Object) "", (java.lang.Object) hashMap48);
        boolean boolean53 = hashMap42.repOK();
        int int54 = hashMap42.modCount;
        hashMap42.clear();
        java.lang.Object obj56 = hashMap32.put((java.lang.Object) hashMap38, (java.lang.Object) hashMap42);
        system.classfixer.classes.HashMap hashMap58 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap58.clear();
        boolean boolean60 = hashMap58.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray61 = hashMap58.table;
        boolean boolean62 = hashMap58.isEmpty();
        boolean boolean63 = hashMap58.isEmpty();
        system.classfixer.classes.HashMap.Entry[] entryArray64 = hashMap58.table;
        hashMap42.table = entryArray64;
        hashMap21.table = entryArray64;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap21", hashMap21.repOK_2());
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap(100, (float) 1);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap6 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap8.clear();
        java.lang.Object obj10 = hashMap4.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap8);
        int int11 = hashMap8.size();
        java.lang.Object obj12 = hashMap2.put((java.lang.Object) "", (java.lang.Object) hashMap8);
        system.classfixer.classes.HashMap.Entry[] entryArray13 = hashMap2.table;
        boolean boolean14 = hashMap2.repOK();
        system.classfixer.classes.HashMap hashMap15 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap17 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap19 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap19.clear();
        java.lang.Object obj21 = hashMap15.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap19);
        boolean boolean22 = hashMap19.isEmpty();
        java.lang.Object obj24 = hashMap19.get((java.lang.Object) 1.0f);
        hashMap19.clear();
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap27 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray28 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap27.table = entryArray28;
        hashMap26.table = entryArray28;
        java.lang.Object obj31 = hashMap19.get((java.lang.Object) entryArray28);
        hashMap2.table = entryArray28;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap2", hashMap2.repOK_2());
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        system.classfixer.classes.HashMap hashMap1 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap1.clear();
        hashMap1.clear();
        boolean boolean4 = hashMap1.repOK();
        hashMap1.clear();
        int int6 = hashMap1.size();
        system.classfixer.classes.HashMap hashMap8 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap8.clear();
        boolean boolean10 = hashMap8.repOK();
        system.classfixer.classes.HashMap hashMap11 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap12 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray13 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap12.table = entryArray13;
        hashMap11.table = entryArray13;
        system.classfixer.classes.HashMap hashMap16 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap18 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap20.clear();
        java.lang.Object obj22 = hashMap16.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap20);
        java.lang.Object obj23 = hashMap8.put((java.lang.Object) entryArray13, (java.lang.Object) hashMap20);
        system.classfixer.classes.HashMap hashMap24 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap26 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap28 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap28.clear();
        java.lang.Object obj30 = hashMap24.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap28);
        boolean boolean31 = hashMap28.isEmpty();
        int int32 = hashMap28.modCount;
        int int33 = hashMap28.modCount;
        system.classfixer.classes.HashMap hashMap34 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap35 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray36 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap35.table = entryArray36;
        hashMap34.table = entryArray36;
        system.classfixer.classes.HashMap.Entry[] entryArray39 = hashMap34.table;
        hashMap28.table = entryArray39;
        hashMap28.modCount = 33;
        system.classfixer.classes.HashMap hashMap44 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap44.clear();
        boolean boolean46 = hashMap44.isEmpty();
        boolean boolean47 = hashMap44.isEmpty();
        system.classfixer.classes.HashMap hashMap49 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap49.clear();
        boolean boolean51 = hashMap49.repOK();
        system.classfixer.classes.HashMap hashMap52 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap53 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray54 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap53.table = entryArray54;
        hashMap52.table = entryArray54;
        system.classfixer.classes.HashMap hashMap57 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap59 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap61 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap61.clear();
        java.lang.Object obj63 = hashMap57.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap61);
        java.lang.Object obj64 = hashMap49.put((java.lang.Object) entryArray54, (java.lang.Object) hashMap61);
        hashMap61.modCount = (byte) 100;
        java.lang.Object obj68 = hashMap44.put((java.lang.Object) (byte) 100, (java.lang.Object) 10.0d);
        int int69 = hashMap44.size();
        boolean boolean70 = hashMap44.repOK();
        system.classfixer.classes.HashMap.Entry[] entryArray71 = hashMap44.table;
        java.lang.Object obj72 = hashMap8.put((java.lang.Object) hashMap28, (java.lang.Object) entryArray71);
        hashMap1.table = entryArray71;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap1", hashMap1.repOK_2());
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        system.classfixer.classes.HashMap hashMap0 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap2 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap4 = new system.classfixer.classes.HashMap((int) (byte) 0);
        hashMap4.clear();
        java.lang.Object obj6 = hashMap0.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMap4);
        hashMap0.clear();
        java.lang.Object obj10 = hashMap0.put((java.lang.Object) 10L, (java.lang.Object) "");
        int int11 = hashMap0.modCount;
        system.classfixer.classes.HashMap hashMap13 = new system.classfixer.classes.HashMap((int) (byte) 0);
        system.classfixer.classes.HashMap hashMap14 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray15 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap14.table = entryArray15;
        java.lang.Object obj17 = hashMap13.get((java.lang.Object) entryArray15);
        system.classfixer.classes.HashMap hashMap20 = new system.classfixer.classes.HashMap(0, (float) 2);
        system.classfixer.classes.HashMap hashMap21 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap hashMap22 = new system.classfixer.classes.HashMap();
        system.classfixer.classes.HashMap.Entry[] entryArray23 = new system.classfixer.classes.HashMap.Entry[] {};
        hashMap22.table = entryArray23;
        hashMap21.table = entryArray23;
        hashMap20.table = entryArray23;
        java.lang.Object obj27 = hashMap13.remove((java.lang.Object) entryArray23);
        hashMap0.table = entryArray23;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_2) for hashMap0", hashMap0.repOK_2());
    }
}

