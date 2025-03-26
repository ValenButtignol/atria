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
        system.classfixer.classes.NodeCachingLinkedList nodeCachingLinkedList0 = new system.classfixer.classes.NodeCachingLinkedList();
        // Check representation invariant.
        org.junit.Assert.assertTrue("Representation invariant failed: Check rep invariant (method property_2) for nodeCachingLinkedList0", nodeCachingLinkedList0.property_2());
    }
}

