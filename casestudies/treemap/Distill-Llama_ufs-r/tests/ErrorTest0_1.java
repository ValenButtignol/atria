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
        system.testclass.TreeMap<java.lang.constant.ConstantDesc, java.lang.Comparable<java.lang.String>> constantDescTreeMap0 = new system.testclass.TreeMap<java.lang.constant.ConstantDesc, java.lang.Comparable<java.lang.String>>();
        constantDescTreeMap0.clear();
        int int2 = constantDescTreeMap0.size();
        int int3 = constantDescTreeMap0.size();
        java.lang.Comparable<java.lang.String> strComparable6 = constantDescTreeMap0.put((java.lang.constant.ConstantDesc) (-1.0f), (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable9 = constantDescTreeMap0.put((java.lang.constant.ConstantDesc) 100.0f, (java.lang.Comparable<java.lang.String>) "");
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for constantDescTreeMap0", constantDescTreeMap0.repOK_1());
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        system.testclass.TreeMap<java.lang.constant.ConstantDesc, java.lang.Comparable<java.lang.String>> constantDescTreeMap0 = new system.testclass.TreeMap<java.lang.constant.ConstantDesc, java.lang.Comparable<java.lang.String>>();
        int int1 = constantDescTreeMap0.size();
        boolean boolean2 = constantDescTreeMap0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable5 = constantDescTreeMap0.put((java.lang.constant.ConstantDesc) 0.0f, (java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable8 = constantDescTreeMap0.put((java.lang.constant.ConstantDesc) 100.0f, (java.lang.Comparable<java.lang.String>) "");
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for constantDescTreeMap0", constantDescTreeMap0.repOK_1());
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        system.testclass.TreeMap<java.lang.constant.ConstantDesc, java.lang.Comparable<java.lang.String>> constantDescTreeMap0 = new system.testclass.TreeMap<java.lang.constant.ConstantDesc, java.lang.Comparable<java.lang.String>>();
        int int1 = constantDescTreeMap0.size();
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        java.lang.Comparable<java.lang.String> strComparable4 = constantDescTreeMap0.put((java.lang.constant.ConstantDesc) (-1.0f), strComparable3);
        int int5 = constantDescTreeMap0.size();
        int int6 = constantDescTreeMap0.size();
        java.lang.Comparable<java.lang.String> strComparable9 = constantDescTreeMap0.put((java.lang.constant.ConstantDesc) 10.0f, (java.lang.Comparable<java.lang.String>) "hi!");
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for constantDescTreeMap0", constantDescTreeMap0.repOK_1());
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        system.testclass.TreeMap<java.lang.constant.ConstantDesc, java.lang.Comparable<java.lang.String>> constantDescTreeMap0 = new system.testclass.TreeMap<java.lang.constant.ConstantDesc, java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = constantDescTreeMap0.isEmpty();
        constantDescTreeMap0.clear();
        int int3 = constantDescTreeMap0.size();
        int int4 = constantDescTreeMap0.size();
        int int5 = constantDescTreeMap0.size();
        java.lang.Comparable<java.lang.String> strComparable8 = constantDescTreeMap0.put((java.lang.constant.ConstantDesc) 0, (java.lang.Comparable<java.lang.String>) "hi!");
        int int9 = constantDescTreeMap0.size();
        java.lang.Comparable<java.lang.String> strComparable12 = constantDescTreeMap0.put((java.lang.constant.ConstantDesc) 1, (java.lang.Comparable<java.lang.String>) "");
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method repOK_1) for constantDescTreeMap0", constantDescTreeMap0.repOK_1());
    }
}

