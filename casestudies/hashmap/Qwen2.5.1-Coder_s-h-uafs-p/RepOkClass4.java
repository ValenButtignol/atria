public class RepOkClass4{
    public boolean property() {
        int[] bucketCounts = new int[table.length];
        for (Entry e : table) {
            while (e != null) {
                bucketCounts[indexFor(e.hash, table.length)]++;
                e = e.next;
            }
        }
        int maxCount = 0;
        int minCount = Integer.MAX_VALUE;
        for (int count : bucketCounts) {
            if (count > maxCount)
                maxCount = count;
            if (count < minCount)
                minCount = count;
        }
        return maxCount - minCount <= 1;
    }


}
