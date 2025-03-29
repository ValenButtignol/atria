public class RepOkClass4{
    public boolean property() {
        return height(root) >= 0;
    }

    private int height(AvlNode t) {
        return t == null ? -1 : t.height;
    }


}
