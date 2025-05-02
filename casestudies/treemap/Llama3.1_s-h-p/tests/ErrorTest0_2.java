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
        system.testclass.TreeMap<java.lang.Comparable<java.lang.String>, java.lang.constant.ConstantDesc> strComparableTreeMap0 = new system.testclass.TreeMap<java.lang.Comparable<java.lang.String>, java.lang.constant.ConstantDesc>();
        java.lang.constant.ConstantDesc constantDesc3 = strComparableTreeMap0.put((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.constant.ConstantDesc) 0.0d);
        boolean boolean4 = strComparableTreeMap0.composedRepOK();
        java.lang.constant.ConstantDesc constantDesc7 = strComparableTreeMap0.put((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.constant.ConstantDesc) (-1L));
        boolean boolean8 = strComparableTreeMap0.property_1();
        boolean boolean9 = strComparableTreeMap0.property_1();
        boolean boolean10 = strComparableTreeMap0.property_1();
        boolean boolean11 = strComparableTreeMap0.composedRepOK();
        boolean boolean12 = strComparableTreeMap0.composedRepOK();
        java.lang.constant.ConstantDesc constantDesc14 = null;
        java.lang.constant.ConstantDesc constantDesc15 = strComparableTreeMap0.put((java.lang.Comparable<java.lang.String>) "", constantDesc14);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for strComparableTreeMap0", strComparableTreeMap0.property_2());
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        system.testclass.TreeMap<java.lang.Comparable<java.lang.String>, java.lang.constant.ConstantDesc> strComparableTreeMap0 = new system.testclass.TreeMap<java.lang.Comparable<java.lang.String>, java.lang.constant.ConstantDesc>();
        java.lang.constant.ConstantDesc constantDesc3 = strComparableTreeMap0.put((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.constant.ConstantDesc) 0.0d);
        boolean boolean4 = strComparableTreeMap0.composedRepOK();
        boolean boolean5 = strComparableTreeMap0.isEmpty();
        boolean boolean6 = strComparableTreeMap0.composedRepOK();
        boolean boolean7 = strComparableTreeMap0.property_1();
        boolean boolean8 = strComparableTreeMap0.isEmpty();
        java.lang.constant.ConstantDesc constantDesc10 = null;
        java.lang.constant.ConstantDesc constantDesc11 = strComparableTreeMap0.put((java.lang.Comparable<java.lang.String>) "hi!", constantDesc10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for strComparableTreeMap0", strComparableTreeMap0.property_2());
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        system.testclass.TreeMap<java.lang.Comparable<java.lang.String>, java.lang.constant.ConstantDesc> strComparableTreeMap0 = new system.testclass.TreeMap<java.lang.Comparable<java.lang.String>, java.lang.constant.ConstantDesc>();
        java.lang.constant.ConstantDesc constantDesc3 = strComparableTreeMap0.put((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.constant.ConstantDesc) 0.0d);
        strComparableTreeMap0.clear();
        boolean boolean5 = strComparableTreeMap0.composedRepOK();
        java.lang.constant.ConstantDesc constantDesc8 = strComparableTreeMap0.put((java.lang.Comparable<java.lang.String>) "hi!", (java.lang.constant.ConstantDesc) (-1));
        java.lang.constant.ConstantDesc constantDesc10 = null;
        java.lang.constant.ConstantDesc constantDesc11 = strComparableTreeMap0.put((java.lang.Comparable<java.lang.String>) "hi!", constantDesc10);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for strComparableTreeMap0", strComparableTreeMap0.property_2());
    }
}

