public class RepOkClass4{
    public boolean property() {
        return firstCachedNode == null || (firstCachedNode != null && firstCachedNode.previous == null && firstCachedNode.next != null && firstCachedNode.getValue() != null);
    }


}
