public class RepOkClass4{
    public boolean property_4() {
        return firstCachedNode == null || (firstCachedNode != null && firstCachedNode.previous == null && firstCachedNode.next != null && firstCachedNode.getValue() != null);
    }


}
