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
        system.testclass.TreeMap<java.lang.constant.ConstantDesc, java.lang.Comparable<java.lang.String>> constantDescTreeMap0 = new system.testclass.TreeMap<java.lang.constant.ConstantDesc, java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = constantDescTreeMap0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable4 = constantDescTreeMap0.put((java.lang.constant.ConstantDesc) 10.0f, (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = constantDescTreeMap0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable8 = constantDescTreeMap0.put((java.lang.constant.ConstantDesc) 1.0f, (java.lang.Comparable<java.lang.String>) "hi!");
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for constantDescTreeMap0", constantDescTreeMap0.repOK_1());
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        system.testclass.TreeMap<java.lang.constant.ConstantDesc, java.lang.Comparable<java.lang.String>> constantDescTreeMap0 = new system.testclass.TreeMap<java.lang.constant.ConstantDesc, java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable3 = constantDescTreeMap0.put((java.lang.constant.ConstantDesc) 100.0f, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable6 = constantDescTreeMap0.put((java.lang.constant.ConstantDesc) 10.0f, (java.lang.Comparable<java.lang.String>) "");
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for constantDescTreeMap0", constantDescTreeMap0.repOK_1());
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        system.testclass.TreeMap<java.lang.constant.ConstantDesc, java.lang.Comparable<java.lang.String>> constantDescTreeMap0 = new system.testclass.TreeMap<java.lang.constant.ConstantDesc, java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = constantDescTreeMap0.isEmpty();
        boolean boolean2 = constantDescTreeMap0.isEmpty();
        constantDescTreeMap0.clear();
        int int4 = constantDescTreeMap0.size();
        java.lang.Comparable<java.lang.String> strComparable7 = constantDescTreeMap0.put((java.lang.constant.ConstantDesc) 100.0f, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable10 = constantDescTreeMap0.put((java.lang.constant.ConstantDesc) 0.0f, (java.lang.Comparable<java.lang.String>) "");
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for constantDescTreeMap0", constantDescTreeMap0.repOK_1());
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        system.testclass.TreeMap<java.lang.constant.ConstantDesc, java.lang.Comparable<java.lang.String>> constantDescTreeMap0 = new system.testclass.TreeMap<java.lang.constant.ConstantDesc, java.lang.Comparable<java.lang.String>>();
        constantDescTreeMap0.clear();
        int int2 = constantDescTreeMap0.size();
        boolean boolean3 = constantDescTreeMap0.isEmpty();
        boolean boolean4 = constantDescTreeMap0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable7 = constantDescTreeMap0.put((java.lang.constant.ConstantDesc) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = constantDescTreeMap0.put((java.lang.constant.ConstantDesc) (-1), (java.lang.Comparable<java.lang.String>) "");
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for constantDescTreeMap0", constantDescTreeMap0.repOK_1());
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        system.testclass.TreeMap<java.lang.constant.ConstantDesc, java.lang.Comparable<java.lang.String>> constantDescTreeMap0 = new system.testclass.TreeMap<java.lang.constant.ConstantDesc, java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = constantDescTreeMap0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable4 = constantDescTreeMap0.put((java.lang.constant.ConstantDesc) 10.0f, (java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = constantDescTreeMap0.size();
        java.lang.Comparable<java.lang.String> strComparable8 = constantDescTreeMap0.put((java.lang.constant.ConstantDesc) (-1.0f), (java.lang.Comparable<java.lang.String>) "");
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for constantDescTreeMap0", constantDescTreeMap0.repOK_1());
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        system.testclass.TreeMap<java.lang.constant.ConstantDesc, java.lang.Comparable<java.lang.String>> constantDescTreeMap0 = new system.testclass.TreeMap<java.lang.constant.ConstantDesc, java.lang.Comparable<java.lang.String>>();
        constantDescTreeMap0.clear();
        int int2 = constantDescTreeMap0.size();
        boolean boolean3 = constantDescTreeMap0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable6 = constantDescTreeMap0.put((java.lang.constant.ConstantDesc) 10, (java.lang.Comparable<java.lang.String>) "hi!");
        constantDescTreeMap0.clear();
        java.lang.Comparable<java.lang.String> strComparable10 = constantDescTreeMap0.put((java.lang.constant.ConstantDesc) 1.0f, (java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = constantDescTreeMap0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable14 = constantDescTreeMap0.put((java.lang.constant.ConstantDesc) 0.0f, (java.lang.Comparable<java.lang.String>) "");
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for constantDescTreeMap0", constantDescTreeMap0.repOK_1());
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        system.testclass.TreeMap<java.lang.constant.ConstantDesc, java.lang.Comparable<java.lang.String>> constantDescTreeMap0 = new system.testclass.TreeMap<java.lang.constant.ConstantDesc, java.lang.Comparable<java.lang.String>>();
        int int1 = constantDescTreeMap0.size();
        boolean boolean2 = constantDescTreeMap0.isEmpty();
        int int3 = constantDescTreeMap0.size();
        java.lang.Comparable<java.lang.String> strComparable6 = constantDescTreeMap0.put((java.lang.constant.ConstantDesc) 100.0f, (java.lang.Comparable<java.lang.String>) "");
        boolean boolean7 = constantDescTreeMap0.isEmpty();
        boolean boolean8 = constantDescTreeMap0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable11 = constantDescTreeMap0.put((java.lang.constant.ConstantDesc) 1.0f, (java.lang.Comparable<java.lang.String>) "hi!");
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for constantDescTreeMap0", constantDescTreeMap0.repOK_1());
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        system.testclass.TreeMap<java.lang.constant.ConstantDesc, java.lang.Comparable<java.lang.String>> constantDescTreeMap0 = new system.testclass.TreeMap<java.lang.constant.ConstantDesc, java.lang.Comparable<java.lang.String>>();
        int int1 = constantDescTreeMap0.size();
        boolean boolean2 = constantDescTreeMap0.isEmpty();
        int int3 = constantDescTreeMap0.size();
        java.lang.Comparable<java.lang.String> strComparable6 = constantDescTreeMap0.put((java.lang.constant.ConstantDesc) 100.0f, (java.lang.Comparable<java.lang.String>) "");
        int int7 = constantDescTreeMap0.size();
        int int8 = constantDescTreeMap0.size();
        boolean boolean9 = constantDescTreeMap0.isEmpty();
        boolean boolean10 = constantDescTreeMap0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable13 = constantDescTreeMap0.put((java.lang.constant.ConstantDesc) 1.0f, (java.lang.Comparable<java.lang.String>) "hi!");
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for constantDescTreeMap0", constantDescTreeMap0.repOK_1());
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        system.testclass.TreeMap<java.lang.constant.ConstantDesc, java.lang.Comparable<java.lang.String>> constantDescTreeMap0 = new system.testclass.TreeMap<java.lang.constant.ConstantDesc, java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = constantDescTreeMap0.isEmpty();
        constantDescTreeMap0.clear();
        int int3 = constantDescTreeMap0.size();
        int int4 = constantDescTreeMap0.size();
        boolean boolean5 = constantDescTreeMap0.isEmpty();
        boolean boolean6 = constantDescTreeMap0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable9 = constantDescTreeMap0.put((java.lang.constant.ConstantDesc) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = constantDescTreeMap0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable13 = constantDescTreeMap0.put((java.lang.constant.ConstantDesc) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = constantDescTreeMap0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable16 = null;
        java.lang.Comparable<java.lang.String> strComparable17 = constantDescTreeMap0.put((java.lang.constant.ConstantDesc) 2, strComparable16);
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for constantDescTreeMap0", constantDescTreeMap0.repOK_1());
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        system.testclass.TreeMap<java.lang.constant.ConstantDesc, java.lang.Comparable<java.lang.String>> constantDescTreeMap0 = new system.testclass.TreeMap<java.lang.constant.ConstantDesc, java.lang.Comparable<java.lang.String>>();
        constantDescTreeMap0.clear();
        int int2 = constantDescTreeMap0.size();
        boolean boolean3 = constantDescTreeMap0.isEmpty();
        constantDescTreeMap0.clear();
        boolean boolean5 = constantDescTreeMap0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable8 = constantDescTreeMap0.put((java.lang.constant.ConstantDesc) 100.0f, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable11 = constantDescTreeMap0.put((java.lang.constant.ConstantDesc) 0.0f, (java.lang.Comparable<java.lang.String>) "");
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for constantDescTreeMap0", constantDescTreeMap0.repOK_1());
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        system.testclass.TreeMap<java.lang.constant.ConstantDesc, java.lang.Comparable<java.lang.String>> constantDescTreeMap0 = new system.testclass.TreeMap<java.lang.constant.ConstantDesc, java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = constantDescTreeMap0.isEmpty();
        boolean boolean2 = constantDescTreeMap0.isEmpty();
        int int3 = constantDescTreeMap0.size();
        constantDescTreeMap0.clear();
        int int5 = constantDescTreeMap0.size();
        int int6 = constantDescTreeMap0.size();
        constantDescTreeMap0.clear();
        java.lang.Comparable<java.lang.String> strComparable10 = constantDescTreeMap0.put((java.lang.constant.ConstantDesc) 2, (java.lang.Comparable<java.lang.String>) "");
        int int11 = constantDescTreeMap0.size();
        java.lang.Comparable<java.lang.String> strComparable14 = constantDescTreeMap0.put((java.lang.constant.ConstantDesc) (-1), (java.lang.Comparable<java.lang.String>) "");
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for constantDescTreeMap0", constantDescTreeMap0.repOK_1());
    }
}

