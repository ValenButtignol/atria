public class RepOkClass3{
    public boolean property() {
        int cacheCount = 0;
        for (LinkedListNode node : header.next) {
            if (node.getValue() == null) {
                cacheCount++;
            }
        }
        return cacheCount == cacheSize;
    }


}
