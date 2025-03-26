public class RepOkClass3{
    public boolean property() {
        Set<Object> keys = new HashSet<>();
        for (Entry e : table) {
            while (e != null) {
                if (keys.contains(e.key))
                    return false;
                keys.add(e.key);
                e = e.next;
            }
        }
        return true;
    }


}
