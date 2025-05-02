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
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        boolean boolean4 = hashMap0.isEmpty();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap0.table;
        java.lang.Object obj8 = hashMap0.put((java.lang.Object) "", (java.lang.Object) 10.0f);
        int int9 = hashMap0.size();
        boolean boolean10 = hashMap0.isEmpty();
        boolean boolean11 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry13 = null;
        system.testclass.HashMap.Entry[] entryArray14 = new system.testclass.HashMap.Entry[] { entry13 };
        hashMap12.table = entryArray14;
        boolean boolean16 = hashMap12.isEmpty();
        system.testclass.HashMap.Entry[] entryArray17 = new system.testclass.HashMap.Entry[] {};
        hashMap12.table = entryArray17;
        hashMap0.table = entryArray17;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap0", hashMap0.property_2());
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        java.lang.Object obj2 = hashMap0.get((java.lang.Object) (short) -1);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry5 = null;
        system.testclass.HashMap.Entry[] entryArray6 = new system.testclass.HashMap.Entry[] { entry5 };
        hashMap4.table = entryArray6;
        boolean boolean8 = hashMap4.isEmpty();
        system.testclass.HashMap.Entry[] entryArray9 = new system.testclass.HashMap.Entry[] {};
        hashMap4.table = entryArray9;
        hashMap4.modCount = 0;
        java.lang.Object obj13 = hashMap0.put((java.lang.Object) (byte) 100, (java.lang.Object) 0);
        int int14 = hashMap0.modCount;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray16 = hashMap15.table;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry18 = null;
        system.testclass.HashMap.Entry[] entryArray19 = new system.testclass.HashMap.Entry[] { entry18 };
        hashMap17.table = entryArray19;
        boolean boolean21 = hashMap17.isEmpty();
        boolean boolean22 = hashMap17.composedRepOK();
        boolean boolean23 = hashMap17.isEmpty();
        java.lang.Object obj25 = hashMap15.put((java.lang.Object) boolean23, (java.lang.Object) (byte) 10);
        hashMap15.modCount = (short) -1;
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap((int) '4');
        system.testclass.HashMap.Entry entry30 = null;
        system.testclass.HashMap.Entry[] entryArray31 = new system.testclass.HashMap.Entry[] { entry30 };
        hashMap29.table = entryArray31;
        hashMap15.table = entryArray31;
        hashMap0.table = entryArray31;
        system.testclass.HashMap hashMap37 = new system.testclass.HashMap((int) (byte) 1, 100.0f);
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry39 = null;
        system.testclass.HashMap.Entry[] entryArray40 = new system.testclass.HashMap.Entry[] { entry39 };
        hashMap38.table = entryArray40;
        boolean boolean42 = hashMap38.isEmpty();
        int int43 = hashMap38.size();
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray45 = hashMap44.table;
        system.testclass.HashMap hashMap46 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry47 = null;
        system.testclass.HashMap.Entry[] entryArray48 = new system.testclass.HashMap.Entry[] { entry47 };
        hashMap46.table = entryArray48;
        boolean boolean50 = hashMap46.isEmpty();
        boolean boolean51 = hashMap46.composedRepOK();
        boolean boolean52 = hashMap46.isEmpty();
        java.lang.Object obj54 = hashMap44.put((java.lang.Object) boolean52, (java.lang.Object) (byte) 10);
        hashMap44.modCount = (short) -1;
        system.testclass.HashMap hashMap58 = new system.testclass.HashMap((int) (byte) 10);
        int int59 = hashMap58.modCount;
        java.lang.Object obj60 = hashMap38.put((java.lang.Object) hashMap44, (java.lang.Object) int59);
        java.lang.Object obj61 = hashMap0.put((java.lang.Object) (byte) 1, obj60);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap0", hashMap0.property_2());
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        boolean boolean4 = hashMap0.isEmpty();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap0.table;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry7 = null;
        system.testclass.HashMap.Entry[] entryArray8 = new system.testclass.HashMap.Entry[] { entry7 };
        hashMap6.table = entryArray8;
        boolean boolean10 = hashMap6.isEmpty();
        boolean boolean11 = hashMap6.composedRepOK();
        hashMap6.modCount = 1;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry15 = null;
        system.testclass.HashMap.Entry[] entryArray16 = new system.testclass.HashMap.Entry[] { entry15 };
        hashMap14.table = entryArray16;
        boolean boolean18 = hashMap14.isEmpty();
        system.testclass.HashMap.Entry[] entryArray19 = hashMap14.table;
        java.lang.Object obj22 = hashMap14.put((java.lang.Object) "", (java.lang.Object) 10.0f);
        hashMap14.clear();
        java.lang.Object obj25 = hashMap14.remove((java.lang.Object) 100.0f);
        java.lang.Object obj26 = hashMap6.get((java.lang.Object) 100.0f);
        java.lang.Object obj28 = hashMap0.put((java.lang.Object) hashMap6, (java.lang.Object) 0L);
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry30 = null;
        system.testclass.HashMap.Entry[] entryArray31 = new system.testclass.HashMap.Entry[] { entry30 };
        hashMap29.table = entryArray31;
        boolean boolean33 = hashMap29.isEmpty();
        int int34 = hashMap29.size();
        boolean boolean35 = hashMap29.property_1();
        boolean boolean36 = hashMap29.composedRepOK();
        java.lang.Object obj37 = hashMap0.remove((java.lang.Object) hashMap29);
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry39 = null;
        system.testclass.HashMap.Entry[] entryArray40 = new system.testclass.HashMap.Entry[] { entry39 };
        hashMap38.table = entryArray40;
        boolean boolean42 = hashMap38.isEmpty();
        system.testclass.HashMap.Entry[] entryArray43 = new system.testclass.HashMap.Entry[] {};
        hashMap38.table = entryArray43;
        system.testclass.HashMap.Entry[] entryArray45 = hashMap38.table;
        boolean boolean46 = hashMap38.isEmpty();
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry48 = null;
        system.testclass.HashMap.Entry[] entryArray49 = new system.testclass.HashMap.Entry[] { entry48 };
        hashMap47.table = entryArray49;
        boolean boolean51 = hashMap47.isEmpty();
        boolean boolean52 = hashMap47.composedRepOK();
        java.lang.Object obj54 = hashMap47.remove((java.lang.Object) 10.0d);
        int int55 = hashMap47.modCount;
        boolean boolean56 = hashMap47.composedRepOK();
        boolean boolean57 = hashMap47.composedRepOK();
        java.lang.Object obj58 = hashMap0.put((java.lang.Object) boolean46, (java.lang.Object) hashMap47);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap0", hashMap0.property_2());
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        boolean boolean4 = hashMap0.isEmpty();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap0.table;
        java.lang.Object obj8 = hashMap0.put((java.lang.Object) "", (java.lang.Object) 10.0f);
        hashMap0.clear();
        system.testclass.HashMap hashMap10 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry11 = null;
        system.testclass.HashMap.Entry[] entryArray12 = new system.testclass.HashMap.Entry[] { entry11 };
        hashMap10.table = entryArray12;
        boolean boolean14 = hashMap10.isEmpty();
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray16 = hashMap15.table;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry18 = null;
        system.testclass.HashMap.Entry[] entryArray19 = new system.testclass.HashMap.Entry[] { entry18 };
        hashMap17.table = entryArray19;
        boolean boolean21 = hashMap17.isEmpty();
        boolean boolean22 = hashMap17.composedRepOK();
        boolean boolean23 = hashMap17.isEmpty();
        java.lang.Object obj25 = hashMap15.put((java.lang.Object) boolean23, (java.lang.Object) (byte) 10);
        boolean boolean26 = hashMap15.isEmpty();
        int int27 = hashMap15.modCount;
        java.lang.Object obj28 = hashMap0.put((java.lang.Object) hashMap10, (java.lang.Object) hashMap15);
        boolean boolean29 = hashMap10.composedRepOK();
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry31 = null;
        system.testclass.HashMap.Entry[] entryArray32 = new system.testclass.HashMap.Entry[] { entry31 };
        hashMap30.table = entryArray32;
        boolean boolean34 = hashMap30.isEmpty();
        system.testclass.HashMap.Entry[] entryArray35 = hashMap30.table;
        java.lang.Object obj38 = hashMap30.put((java.lang.Object) "", (java.lang.Object) 10.0f);
        hashMap30.modCount = '4';
        system.testclass.HashMap hashMap41 = new system.testclass.HashMap();
        hashMap41.modCount = (byte) 1;
        system.testclass.HashMap hashMap44 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry45 = null;
        system.testclass.HashMap.Entry[] entryArray46 = new system.testclass.HashMap.Entry[] { entry45 };
        hashMap44.table = entryArray46;
        boolean boolean48 = hashMap44.isEmpty();
        system.testclass.HashMap hashMap49 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry50 = null;
        system.testclass.HashMap.Entry[] entryArray51 = new system.testclass.HashMap.Entry[] { entry50 };
        hashMap49.table = entryArray51;
        boolean boolean53 = hashMap49.isEmpty();
        system.testclass.HashMap.Entry[] entryArray54 = new system.testclass.HashMap.Entry[] {};
        hashMap49.table = entryArray54;
        hashMap49.modCount = 0;
        java.lang.Object obj58 = hashMap41.put((java.lang.Object) hashMap44, (java.lang.Object) 0);
        java.lang.Object obj59 = hashMap10.put((java.lang.Object) hashMap30, (java.lang.Object) hashMap41);
        int int60 = hashMap30.size();
        java.lang.Object obj61 = null;
        system.testclass.HashMap hashMap62 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray63 = hashMap62.table;
        system.testclass.HashMap hashMap64 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry65 = null;
        system.testclass.HashMap.Entry[] entryArray66 = new system.testclass.HashMap.Entry[] { entry65 };
        hashMap64.table = entryArray66;
        boolean boolean68 = hashMap64.isEmpty();
        boolean boolean69 = hashMap64.composedRepOK();
        boolean boolean70 = hashMap64.isEmpty();
        java.lang.Object obj72 = hashMap62.put((java.lang.Object) boolean70, (java.lang.Object) (byte) 10);
        hashMap62.modCount = (short) -1;
        system.testclass.HashMap hashMap75 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray76 = hashMap75.table;
        hashMap62.table = entryArray76;
        java.lang.Object obj78 = hashMap30.put(obj61, (java.lang.Object) hashMap62);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap30", hashMap30.property_2());
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        boolean boolean4 = hashMap0.isEmpty();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap0.table;
        system.testclass.HashMap hashMap6 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry7 = null;
        system.testclass.HashMap.Entry[] entryArray8 = new system.testclass.HashMap.Entry[] { entry7 };
        hashMap6.table = entryArray8;
        boolean boolean10 = hashMap6.isEmpty();
        boolean boolean11 = hashMap6.composedRepOK();
        hashMap6.modCount = 1;
        system.testclass.HashMap hashMap14 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry15 = null;
        system.testclass.HashMap.Entry[] entryArray16 = new system.testclass.HashMap.Entry[] { entry15 };
        hashMap14.table = entryArray16;
        boolean boolean18 = hashMap14.isEmpty();
        system.testclass.HashMap.Entry[] entryArray19 = hashMap14.table;
        java.lang.Object obj22 = hashMap14.put((java.lang.Object) "", (java.lang.Object) 10.0f);
        hashMap14.clear();
        java.lang.Object obj25 = hashMap14.remove((java.lang.Object) 100.0f);
        java.lang.Object obj26 = hashMap6.get((java.lang.Object) 100.0f);
        java.lang.Object obj28 = hashMap0.put((java.lang.Object) hashMap6, (java.lang.Object) 0L);
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry30 = null;
        system.testclass.HashMap.Entry[] entryArray31 = new system.testclass.HashMap.Entry[] { entry30 };
        hashMap29.table = entryArray31;
        boolean boolean33 = hashMap29.isEmpty();
        int int34 = hashMap29.size();
        boolean boolean35 = hashMap29.property_1();
        boolean boolean36 = hashMap29.composedRepOK();
        java.lang.Object obj37 = hashMap0.remove((java.lang.Object) hashMap29);
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry39 = null;
        system.testclass.HashMap.Entry[] entryArray40 = new system.testclass.HashMap.Entry[] { entry39 };
        hashMap38.table = entryArray40;
        boolean boolean42 = hashMap38.isEmpty();
        boolean boolean43 = hashMap38.composedRepOK();
        java.lang.Object obj45 = hashMap38.remove((java.lang.Object) 10.0d);
        int int46 = hashMap38.modCount;
        boolean boolean47 = hashMap38.composedRepOK();
        hashMap38.modCount = 0;
        system.testclass.HashMap hashMap51 = new system.testclass.HashMap((int) '4');
        system.testclass.HashMap.Entry entry52 = null;
        system.testclass.HashMap.Entry[] entryArray53 = new system.testclass.HashMap.Entry[] { entry52 };
        hashMap51.table = entryArray53;
        java.lang.Object obj55 = hashMap38.get((java.lang.Object) hashMap51);
        system.testclass.HashMap hashMap57 = new system.testclass.HashMap((int) ' ');
        int int58 = hashMap57.size();
        java.lang.Object obj59 = hashMap0.put(obj55, (java.lang.Object) hashMap57);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap0", hashMap0.property_2());
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        boolean boolean4 = hashMap0.isEmpty();
        boolean boolean5 = hashMap0.composedRepOK();
        hashMap0.clear();
        system.testclass.HashMap.Entry[] entryArray7 = hashMap0.table;
        hashMap0.modCount = (short) -1;
        boolean boolean10 = hashMap0.composedRepOK();
        java.lang.Object obj11 = null;
        system.testclass.HashMap hashMap12 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry13 = null;
        system.testclass.HashMap.Entry[] entryArray14 = new system.testclass.HashMap.Entry[] { entry13 };
        hashMap12.table = entryArray14;
        boolean boolean16 = hashMap12.isEmpty();
        boolean boolean17 = hashMap12.composedRepOK();
        boolean boolean18 = hashMap12.isEmpty();
        boolean boolean19 = hashMap12.property_1();
        java.lang.Object obj20 = hashMap0.put(obj11, (java.lang.Object) boolean19);
        system.testclass.HashMap hashMap21 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry22 = null;
        system.testclass.HashMap.Entry[] entryArray23 = new system.testclass.HashMap.Entry[] { entry22 };
        hashMap21.table = entryArray23;
        boolean boolean25 = hashMap21.isEmpty();
        system.testclass.HashMap.Entry[] entryArray26 = new system.testclass.HashMap.Entry[] {};
        hashMap21.table = entryArray26;
        hashMap21.modCount = 0;
        system.testclass.HashMap.Entry[] entryArray30 = hashMap21.table;
        hashMap0.table = entryArray30;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap0", hashMap0.property_2());
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test7");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        java.lang.Object obj2 = hashMap0.get((java.lang.Object) (short) -1);
        system.testclass.HashMap hashMap4 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry5 = null;
        system.testclass.HashMap.Entry[] entryArray6 = new system.testclass.HashMap.Entry[] { entry5 };
        hashMap4.table = entryArray6;
        boolean boolean8 = hashMap4.isEmpty();
        system.testclass.HashMap.Entry[] entryArray9 = new system.testclass.HashMap.Entry[] {};
        hashMap4.table = entryArray9;
        hashMap4.modCount = 0;
        java.lang.Object obj13 = hashMap0.put((java.lang.Object) (byte) 100, (java.lang.Object) 0);
        int int14 = hashMap0.modCount;
        system.testclass.HashMap hashMap15 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray16 = hashMap15.table;
        system.testclass.HashMap hashMap17 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry18 = null;
        system.testclass.HashMap.Entry[] entryArray19 = new system.testclass.HashMap.Entry[] { entry18 };
        hashMap17.table = entryArray19;
        boolean boolean21 = hashMap17.isEmpty();
        boolean boolean22 = hashMap17.composedRepOK();
        boolean boolean23 = hashMap17.isEmpty();
        java.lang.Object obj25 = hashMap15.put((java.lang.Object) boolean23, (java.lang.Object) (byte) 10);
        hashMap15.modCount = (short) -1;
        system.testclass.HashMap hashMap29 = new system.testclass.HashMap((int) '4');
        system.testclass.HashMap.Entry entry30 = null;
        system.testclass.HashMap.Entry[] entryArray31 = new system.testclass.HashMap.Entry[] { entry30 };
        hashMap29.table = entryArray31;
        hashMap15.table = entryArray31;
        hashMap0.table = entryArray31;
        boolean boolean35 = hashMap0.isEmpty();
        system.testclass.HashMap.Entry[] entryArray36 = new system.testclass.HashMap.Entry[] {};
        hashMap0.table = entryArray36;
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap0", hashMap0.property_2());
    }

    @Test
    public void test8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test8");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        boolean boolean4 = hashMap0.isEmpty();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap0.table;
        java.lang.Object obj8 = hashMap0.put((java.lang.Object) "", (java.lang.Object) 10.0f);
        hashMap0.modCount = '4';
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry12 = null;
        system.testclass.HashMap.Entry[] entryArray13 = new system.testclass.HashMap.Entry[] { entry12 };
        hashMap11.table = entryArray13;
        boolean boolean15 = hashMap11.isEmpty();
        system.testclass.HashMap.Entry[] entryArray16 = hashMap11.table;
        hashMap0.table = entryArray16;
        system.testclass.HashMap hashMap18 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry19 = null;
        system.testclass.HashMap.Entry[] entryArray20 = new system.testclass.HashMap.Entry[] { entry19 };
        hashMap18.table = entryArray20;
        hashMap18.modCount = (byte) -1;
        boolean boolean24 = hashMap18.composedRepOK();
        int int25 = hashMap18.modCount;
        system.testclass.HashMap hashMap26 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray27 = hashMap26.table;
        boolean boolean28 = hashMap26.composedRepOK();
        int int29 = hashMap26.modCount;
        system.testclass.HashMap hashMap30 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray31 = hashMap30.table;
        system.testclass.HashMap hashMap32 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry33 = null;
        system.testclass.HashMap.Entry[] entryArray34 = new system.testclass.HashMap.Entry[] { entry33 };
        hashMap32.table = entryArray34;
        boolean boolean36 = hashMap32.isEmpty();
        boolean boolean37 = hashMap32.composedRepOK();
        boolean boolean38 = hashMap32.isEmpty();
        java.lang.Object obj40 = hashMap30.put((java.lang.Object) boolean38, (java.lang.Object) (byte) 10);
        hashMap30.modCount = (short) -1;
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray44 = hashMap43.table;
        hashMap30.table = entryArray44;
        hashMap26.table = entryArray44;
        int int47 = hashMap26.size();
        system.testclass.HashMap hashMap49 = new system.testclass.HashMap((int) (short) 100);
        system.testclass.HashMap hashMap50 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry51 = null;
        system.testclass.HashMap.Entry[] entryArray52 = new system.testclass.HashMap.Entry[] { entry51 };
        hashMap50.table = entryArray52;
        boolean boolean54 = hashMap50.isEmpty();
        system.testclass.HashMap.Entry[] entryArray55 = hashMap50.table;
        hashMap50.modCount = (-1);
        java.lang.Object obj58 = hashMap26.put((java.lang.Object) hashMap49, (java.lang.Object) hashMap50);
        system.testclass.HashMap hashMap59 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry[] entryArray60 = hashMap59.table;
        system.testclass.HashMap hashMap61 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry62 = null;
        system.testclass.HashMap.Entry[] entryArray63 = new system.testclass.HashMap.Entry[] { entry62 };
        hashMap61.table = entryArray63;
        boolean boolean65 = hashMap61.isEmpty();
        system.testclass.HashMap.Entry[] entryArray66 = hashMap61.table;
        java.lang.Object obj69 = hashMap61.put((java.lang.Object) "", (java.lang.Object) 10.0f);
        system.testclass.HashMap.Entry[] entryArray70 = hashMap61.table;
        java.lang.Object obj71 = hashMap49.put((java.lang.Object) entryArray60, (java.lang.Object) entryArray70);
        hashMap18.table = entryArray60;
        boolean boolean73 = hashMap18.isEmpty();
        system.testclass.HashMap hashMap74 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry75 = null;
        system.testclass.HashMap.Entry[] entryArray76 = new system.testclass.HashMap.Entry[] { entry75 };
        hashMap74.table = entryArray76;
        boolean boolean78 = hashMap74.isEmpty();
        boolean boolean79 = hashMap74.composedRepOK();
        hashMap74.modCount = 1;
        system.testclass.HashMap hashMap82 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry83 = null;
        system.testclass.HashMap.Entry[] entryArray84 = new system.testclass.HashMap.Entry[] { entry83 };
        hashMap82.table = entryArray84;
        boolean boolean86 = hashMap82.isEmpty();
        system.testclass.HashMap.Entry[] entryArray87 = hashMap82.table;
        java.lang.Object obj90 = hashMap82.put((java.lang.Object) "", (java.lang.Object) 10.0f);
        hashMap82.clear();
        java.lang.Object obj93 = hashMap82.remove((java.lang.Object) 100.0f);
        java.lang.Object obj94 = hashMap74.get((java.lang.Object) 100.0f);
        java.lang.Object obj95 = hashMap0.put((java.lang.Object) boolean73, (java.lang.Object) 100.0f);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap0", hashMap0.property_2());
    }

    @Test
    public void test9() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test9");
        system.testclass.HashMap hashMap0 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry1 = null;
        system.testclass.HashMap.Entry[] entryArray2 = new system.testclass.HashMap.Entry[] { entry1 };
        hashMap0.table = entryArray2;
        boolean boolean4 = hashMap0.isEmpty();
        system.testclass.HashMap.Entry[] entryArray5 = hashMap0.table;
        java.lang.Object obj8 = hashMap0.put((java.lang.Object) "", (java.lang.Object) 10.0f);
        hashMap0.modCount = '4';
        system.testclass.HashMap hashMap11 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry12 = null;
        system.testclass.HashMap.Entry[] entryArray13 = new system.testclass.HashMap.Entry[] { entry12 };
        hashMap11.table = entryArray13;
        boolean boolean15 = hashMap11.isEmpty();
        boolean boolean16 = hashMap11.composedRepOK();
        hashMap11.modCount = 1;
        system.testclass.HashMap hashMap19 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry20 = null;
        system.testclass.HashMap.Entry[] entryArray21 = new system.testclass.HashMap.Entry[] { entry20 };
        hashMap19.table = entryArray21;
        boolean boolean23 = hashMap19.isEmpty();
        system.testclass.HashMap.Entry[] entryArray24 = hashMap19.table;
        java.lang.Object obj27 = hashMap19.put((java.lang.Object) "", (java.lang.Object) 10.0f);
        hashMap19.clear();
        java.lang.Object obj30 = hashMap19.remove((java.lang.Object) 100.0f);
        java.lang.Object obj31 = hashMap11.get((java.lang.Object) 100.0f);
        java.lang.Object obj32 = hashMap0.get((java.lang.Object) 100.0f);
        boolean boolean33 = hashMap0.property_1();
        system.testclass.HashMap.Entry[] entryArray34 = hashMap0.table;
        boolean boolean35 = hashMap0.isEmpty();
        system.testclass.HashMap hashMap38 = new system.testclass.HashMap((int) (byte) 0, (float) '#');
        boolean boolean39 = hashMap38.isEmpty();
        system.testclass.HashMap.Entry[] entryArray40 = hashMap38.table;
        hashMap38.modCount = (byte) -1;
        system.testclass.HashMap hashMap43 = new system.testclass.HashMap();
        java.lang.Object obj45 = hashMap43.get((java.lang.Object) (short) -1);
        system.testclass.HashMap hashMap47 = new system.testclass.HashMap();
        system.testclass.HashMap.Entry entry48 = null;
        system.testclass.HashMap.Entry[] entryArray49 = new system.testclass.HashMap.Entry[] { entry48 };
        hashMap47.table = entryArray49;
        boolean boolean51 = hashMap47.isEmpty();
        system.testclass.HashMap.Entry[] entryArray52 = new system.testclass.HashMap.Entry[] {};
        hashMap47.table = entryArray52;
        hashMap47.modCount = 0;
        java.lang.Object obj56 = hashMap43.put((java.lang.Object) (byte) 100, (java.lang.Object) 0);
        int int57 = hashMap43.modCount;
        int int58 = hashMap43.size();
        int int59 = hashMap43.modCount;
        java.lang.Object obj60 = hashMap0.put((java.lang.Object) hashMap38, (java.lang.Object) hashMap43);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for hashMap0", hashMap0.property_2());
    }
}

