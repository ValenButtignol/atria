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
        system.testclass.TreeMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableTreeMap0 = new system.testclass.TreeMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>();
        strComparableTreeMap0.clear();
        boolean boolean2 = strComparableTreeMap0.isEmpty();
        java.lang.CharSequence charSequence5 = strComparableTreeMap0.put((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "");
        boolean boolean6 = strComparableTreeMap0.isEmpty();
        java.lang.CharSequence charSequence9 = strComparableTreeMap0.put((java.lang.Comparable<java.lang.String>) "", (java.lang.CharSequence) "");
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for strComparableTreeMap0", strComparableTreeMap0.property_3());
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        system.testclass.TreeMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableTreeMap0 = new system.testclass.TreeMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>();
        strComparableTreeMap0.clear();
        boolean boolean2 = strComparableTreeMap0.isEmpty();
        java.lang.CharSequence charSequence5 = strComparableTreeMap0.put((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "");
        boolean boolean6 = strComparableTreeMap0.composedRepOK();
        java.lang.CharSequence charSequence9 = strComparableTreeMap0.put((java.lang.Comparable<java.lang.String>) "", (java.lang.CharSequence) "hi!");
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for strComparableTreeMap0", strComparableTreeMap0.property_3());
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        system.testclass.TreeMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableTreeMap0 = new system.testclass.TreeMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>();
        strComparableTreeMap0.clear();
        boolean boolean2 = strComparableTreeMap0.isEmpty();
        java.lang.CharSequence charSequence5 = strComparableTreeMap0.put((java.lang.Comparable<java.lang.String>) "", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence8 = strComparableTreeMap0.put((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "");
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for strComparableTreeMap0", strComparableTreeMap0.property_3());
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        system.testclass.TreeMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableTreeMap0 = new system.testclass.TreeMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>();
        strComparableTreeMap0.clear();
        strComparableTreeMap0.clear();
        java.lang.CharSequence charSequence4 = null;
        java.lang.CharSequence charSequence5 = strComparableTreeMap0.put((java.lang.Comparable<java.lang.String>) "hi!", charSequence4);
        boolean boolean6 = strComparableTreeMap0.composedRepOK();
        boolean boolean7 = strComparableTreeMap0.composedRepOK();
        boolean boolean8 = strComparableTreeMap0.property_2();
        java.lang.CharSequence charSequence11 = strComparableTreeMap0.put((java.lang.Comparable<java.lang.String>) "", (java.lang.CharSequence) "");
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for strComparableTreeMap0", strComparableTreeMap0.property_3());
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        system.testclass.TreeMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableTreeMap0 = new system.testclass.TreeMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>();
        strComparableTreeMap0.clear();
        strComparableTreeMap0.clear();
        java.lang.CharSequence charSequence4 = null;
        java.lang.CharSequence charSequence5 = strComparableTreeMap0.put((java.lang.Comparable<java.lang.String>) "hi!", charSequence4);
        boolean boolean6 = strComparableTreeMap0.composedRepOK();
        boolean boolean7 = strComparableTreeMap0.composedRepOK();
        java.lang.CharSequence charSequence10 = strComparableTreeMap0.put((java.lang.Comparable<java.lang.String>) "", (java.lang.CharSequence) "hi!");
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for strComparableTreeMap0", strComparableTreeMap0.property_3());
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        system.testclass.TreeMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableTreeMap0 = new system.testclass.TreeMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>();
        strComparableTreeMap0.clear();
        boolean boolean2 = strComparableTreeMap0.isEmpty();
        java.lang.CharSequence charSequence5 = strComparableTreeMap0.put((java.lang.Comparable<java.lang.String>) "", (java.lang.CharSequence) "hi!");
        boolean boolean6 = strComparableTreeMap0.property_1();
        boolean boolean7 = strComparableTreeMap0.isEmpty();
        java.lang.CharSequence charSequence10 = strComparableTreeMap0.put((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!");
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for strComparableTreeMap0", strComparableTreeMap0.property_3());
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        system.testclass.TreeMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableTreeMap0 = new system.testclass.TreeMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>();
        boolean boolean1 = strComparableTreeMap0.composedRepOK();
        boolean boolean2 = strComparableTreeMap0.property_2();
        java.lang.CharSequence charSequence4 = null;
        java.lang.CharSequence charSequence5 = strComparableTreeMap0.put((java.lang.Comparable<java.lang.String>) "", charSequence4);
        boolean boolean6 = strComparableTreeMap0.composedRepOK();
        boolean boolean7 = strComparableTreeMap0.composedRepOK();
        boolean boolean8 = strComparableTreeMap0.isEmpty();
        java.lang.CharSequence charSequence11 = strComparableTreeMap0.put((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "");
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for strComparableTreeMap0", strComparableTreeMap0.property_3());
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        system.testclass.TreeMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableTreeMap0 = new system.testclass.TreeMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>();
        strComparableTreeMap0.clear();
        strComparableTreeMap0.clear();
        java.lang.CharSequence charSequence4 = null;
        java.lang.CharSequence charSequence5 = strComparableTreeMap0.put((java.lang.Comparable<java.lang.String>) "hi!", charSequence4);
        boolean boolean6 = strComparableTreeMap0.composedRepOK();
        boolean boolean7 = strComparableTreeMap0.composedRepOK();
        boolean boolean8 = strComparableTreeMap0.property_2();
        boolean boolean9 = strComparableTreeMap0.property_1();
        java.lang.CharSequence charSequence12 = strComparableTreeMap0.put((java.lang.Comparable<java.lang.String>) "", (java.lang.CharSequence) "hi!");
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for strComparableTreeMap0", strComparableTreeMap0.property_3());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.testclass.TreeMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableTreeMap0 = new system.testclass.TreeMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>();
        strComparableTreeMap0.clear();
        boolean boolean2 = strComparableTreeMap0.isEmpty();
        strComparableTreeMap0.clear();
        boolean boolean4 = strComparableTreeMap0.composedRepOK();
        java.lang.CharSequence charSequence7 = strComparableTreeMap0.put((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "");
        int int8 = strComparableTreeMap0.size();
        java.lang.CharSequence charSequence11 = strComparableTreeMap0.put((java.lang.Comparable<java.lang.String>) "", (java.lang.CharSequence) "hi!");
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for strComparableTreeMap0", strComparableTreeMap0.property_3());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        system.testclass.TreeMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableTreeMap0 = new system.testclass.TreeMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>();
        strComparableTreeMap0.clear();
        boolean boolean2 = strComparableTreeMap0.isEmpty();
        strComparableTreeMap0.clear();
        boolean boolean4 = strComparableTreeMap0.composedRepOK();
        strComparableTreeMap0.clear();
        java.lang.CharSequence charSequence8 = strComparableTreeMap0.put((java.lang.Comparable<java.lang.String>) "", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence11 = strComparableTreeMap0.put((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "");
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for strComparableTreeMap0", strComparableTreeMap0.property_3());
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        system.testclass.TreeMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableTreeMap0 = new system.testclass.TreeMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>();
        strComparableTreeMap0.clear();
        boolean boolean2 = strComparableTreeMap0.isEmpty();
        strComparableTreeMap0.clear();
        boolean boolean4 = strComparableTreeMap0.property_2();
        java.lang.CharSequence charSequence7 = strComparableTreeMap0.put((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!");
        int int8 = strComparableTreeMap0.size();
        boolean boolean9 = strComparableTreeMap0.property_2();
        java.lang.CharSequence charSequence12 = strComparableTreeMap0.put((java.lang.Comparable<java.lang.String>) "", (java.lang.CharSequence) "");
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for strComparableTreeMap0", strComparableTreeMap0.property_3());
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        system.testclass.TreeMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableTreeMap0 = new system.testclass.TreeMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>();
        strComparableTreeMap0.clear();
        strComparableTreeMap0.clear();
        java.lang.CharSequence charSequence4 = null;
        java.lang.CharSequence charSequence5 = strComparableTreeMap0.put((java.lang.Comparable<java.lang.String>) "hi!", charSequence4);
        boolean boolean6 = strComparableTreeMap0.property_1();
        java.lang.CharSequence charSequence9 = strComparableTreeMap0.put((java.lang.Comparable<java.lang.String>) "", (java.lang.CharSequence) "hi!");
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for strComparableTreeMap0", strComparableTreeMap0.property_3());
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        system.testclass.TreeMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableTreeMap0 = new system.testclass.TreeMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>();
        strComparableTreeMap0.clear();
        boolean boolean2 = strComparableTreeMap0.isEmpty();
        java.lang.CharSequence charSequence5 = strComparableTreeMap0.put((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "");
        boolean boolean6 = strComparableTreeMap0.isEmpty();
        int int7 = strComparableTreeMap0.size();
        boolean boolean8 = strComparableTreeMap0.property_2();
        java.lang.CharSequence charSequence11 = strComparableTreeMap0.put((java.lang.Comparable<java.lang.String>) "", (java.lang.CharSequence) "");
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for strComparableTreeMap0", strComparableTreeMap0.property_3());
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        system.testclass.TreeMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableTreeMap0 = new system.testclass.TreeMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>();
        boolean boolean1 = strComparableTreeMap0.composedRepOK();
        boolean boolean2 = strComparableTreeMap0.property_2();
        java.lang.CharSequence charSequence4 = null;
        java.lang.CharSequence charSequence5 = strComparableTreeMap0.put((java.lang.Comparable<java.lang.String>) "", charSequence4);
        java.lang.CharSequence charSequence8 = strComparableTreeMap0.put((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!");
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for strComparableTreeMap0", strComparableTreeMap0.property_3());
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        system.testclass.TreeMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableTreeMap0 = new system.testclass.TreeMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>();
        boolean boolean1 = strComparableTreeMap0.composedRepOK();
        boolean boolean2 = strComparableTreeMap0.property_2();
        java.lang.CharSequence charSequence4 = null;
        java.lang.CharSequence charSequence5 = strComparableTreeMap0.put((java.lang.Comparable<java.lang.String>) "", charSequence4);
        boolean boolean6 = strComparableTreeMap0.composedRepOK();
        boolean boolean7 = strComparableTreeMap0.property_1();
        int int8 = strComparableTreeMap0.size();
        java.lang.CharSequence charSequence11 = strComparableTreeMap0.put((java.lang.Comparable<java.lang.String>) "", (java.lang.CharSequence) "");
        java.lang.CharSequence charSequence14 = strComparableTreeMap0.put((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "");
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for strComparableTreeMap0", strComparableTreeMap0.property_3());
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        system.testclass.TreeMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableTreeMap0 = new system.testclass.TreeMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>();
        strComparableTreeMap0.clear();
        boolean boolean2 = strComparableTreeMap0.isEmpty();
        java.lang.CharSequence charSequence5 = strComparableTreeMap0.put((java.lang.Comparable<java.lang.String>) "", (java.lang.CharSequence) "hi!");
        boolean boolean6 = strComparableTreeMap0.property_1();
        boolean boolean7 = strComparableTreeMap0.isEmpty();
        java.lang.CharSequence charSequence10 = strComparableTreeMap0.put((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "");
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for strComparableTreeMap0", strComparableTreeMap0.property_3());
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        system.testclass.TreeMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableTreeMap0 = new system.testclass.TreeMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>();
        boolean boolean1 = strComparableTreeMap0.composedRepOK();
        boolean boolean2 = strComparableTreeMap0.property_2();
        java.lang.CharSequence charSequence4 = null;
        java.lang.CharSequence charSequence5 = strComparableTreeMap0.put((java.lang.Comparable<java.lang.String>) "", charSequence4);
        boolean boolean6 = strComparableTreeMap0.composedRepOK();
        boolean boolean7 = strComparableTreeMap0.composedRepOK();
        boolean boolean8 = strComparableTreeMap0.composedRepOK();
        boolean boolean9 = strComparableTreeMap0.isEmpty();
        java.lang.CharSequence charSequence12 = strComparableTreeMap0.put((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!");
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for strComparableTreeMap0", strComparableTreeMap0.property_3());
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        system.testclass.TreeMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableTreeMap0 = new system.testclass.TreeMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>();
        strComparableTreeMap0.clear();
        boolean boolean2 = strComparableTreeMap0.isEmpty();
        strComparableTreeMap0.clear();
        boolean boolean4 = strComparableTreeMap0.property_2();
        java.lang.CharSequence charSequence7 = strComparableTreeMap0.put((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!");
        int int8 = strComparableTreeMap0.size();
        boolean boolean9 = strComparableTreeMap0.property_2();
        int int10 = strComparableTreeMap0.size();
        boolean boolean11 = strComparableTreeMap0.property_2();
        java.lang.CharSequence charSequence14 = strComparableTreeMap0.put((java.lang.Comparable<java.lang.String>) "", (java.lang.CharSequence) "hi!");
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for strComparableTreeMap0", strComparableTreeMap0.property_3());
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        system.testclass.TreeMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableTreeMap0 = new system.testclass.TreeMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>();
        strComparableTreeMap0.clear();
        boolean boolean2 = strComparableTreeMap0.isEmpty();
        java.lang.CharSequence charSequence5 = strComparableTreeMap0.put((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "");
        boolean boolean6 = strComparableTreeMap0.isEmpty();
        boolean boolean7 = strComparableTreeMap0.isEmpty();
        int int8 = strComparableTreeMap0.size();
        java.lang.CharSequence charSequence11 = strComparableTreeMap0.put((java.lang.Comparable<java.lang.String>) "", (java.lang.CharSequence) "hi!");
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for strComparableTreeMap0", strComparableTreeMap0.property_3());
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        system.testclass.TreeMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableTreeMap0 = new system.testclass.TreeMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>();
        strComparableTreeMap0.clear();
        boolean boolean2 = strComparableTreeMap0.isEmpty();
        strComparableTreeMap0.clear();
        boolean boolean4 = strComparableTreeMap0.property_2();
        java.lang.CharSequence charSequence7 = strComparableTreeMap0.put((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence10 = strComparableTreeMap0.put((java.lang.Comparable<java.lang.String>) "", (java.lang.CharSequence) "hi!");
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for strComparableTreeMap0", strComparableTreeMap0.property_3());
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        system.testclass.TreeMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableTreeMap0 = new system.testclass.TreeMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>();
        strComparableTreeMap0.clear();
        boolean boolean2 = strComparableTreeMap0.isEmpty();
        strComparableTreeMap0.clear();
        boolean boolean4 = strComparableTreeMap0.property_2();
        java.lang.CharSequence charSequence7 = strComparableTreeMap0.put((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!");
        int int8 = strComparableTreeMap0.size();
        boolean boolean9 = strComparableTreeMap0.property_2();
        int int10 = strComparableTreeMap0.size();
        boolean boolean11 = strComparableTreeMap0.property_2();
        boolean boolean12 = strComparableTreeMap0.composedRepOK();
        java.lang.CharSequence charSequence15 = strComparableTreeMap0.put((java.lang.Comparable<java.lang.String>) "", (java.lang.CharSequence) "");
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for strComparableTreeMap0", strComparableTreeMap0.property_3());
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        system.testclass.TreeMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableTreeMap0 = new system.testclass.TreeMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>();
        strComparableTreeMap0.clear();
        boolean boolean2 = strComparableTreeMap0.isEmpty();
        boolean boolean3 = strComparableTreeMap0.property_1();
        boolean boolean4 = strComparableTreeMap0.composedRepOK();
        java.lang.CharSequence charSequence7 = strComparableTreeMap0.put((java.lang.Comparable<java.lang.String>) "", (java.lang.CharSequence) "");
        boolean boolean8 = strComparableTreeMap0.property_2();
        java.lang.CharSequence charSequence11 = strComparableTreeMap0.put((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!");
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for strComparableTreeMap0", strComparableTreeMap0.property_3());
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        system.testclass.TreeMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableTreeMap0 = new system.testclass.TreeMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>();
        strComparableTreeMap0.clear();
        strComparableTreeMap0.clear();
        java.lang.CharSequence charSequence4 = null;
        java.lang.CharSequence charSequence5 = strComparableTreeMap0.put((java.lang.Comparable<java.lang.String>) "hi!", charSequence4);
        boolean boolean6 = strComparableTreeMap0.property_1();
        java.lang.CharSequence charSequence9 = strComparableTreeMap0.put((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "");
        boolean boolean10 = strComparableTreeMap0.isEmpty();
        java.lang.CharSequence charSequence13 = strComparableTreeMap0.put((java.lang.Comparable<java.lang.String>) "", (java.lang.CharSequence) "hi!");
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for strComparableTreeMap0", strComparableTreeMap0.property_3());
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        system.testclass.TreeMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableTreeMap0 = new system.testclass.TreeMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>();
        boolean boolean1 = strComparableTreeMap0.composedRepOK();
        boolean boolean2 = strComparableTreeMap0.property_2();
        java.lang.CharSequence charSequence4 = null;
        java.lang.CharSequence charSequence5 = strComparableTreeMap0.put((java.lang.Comparable<java.lang.String>) "", charSequence4);
        boolean boolean6 = strComparableTreeMap0.composedRepOK();
        boolean boolean7 = strComparableTreeMap0.property_1();
        java.lang.CharSequence charSequence10 = strComparableTreeMap0.put((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "");
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for strComparableTreeMap0", strComparableTreeMap0.property_3());
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        system.testclass.TreeMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableTreeMap0 = new system.testclass.TreeMap<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>();
        boolean boolean1 = strComparableTreeMap0.composedRepOK();
        boolean boolean2 = strComparableTreeMap0.property_1();
        boolean boolean3 = strComparableTreeMap0.isEmpty();
        java.lang.CharSequence charSequence6 = strComparableTreeMap0.put((java.lang.Comparable<java.lang.String>) "", (java.lang.CharSequence) "hi!");
        boolean boolean7 = strComparableTreeMap0.property_1();
        int int8 = strComparableTreeMap0.size();
        java.lang.CharSequence charSequence11 = strComparableTreeMap0.put((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.CharSequence) "hi!");
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_3) for strComparableTreeMap0", strComparableTreeMap0.property_3());
    }
}

