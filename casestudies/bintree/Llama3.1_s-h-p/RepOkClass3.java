public class RepOkClass3{
    public boolean property_3() {
        return (root == null) || (root instanceof Node && 
                (root.left == null || root.left instanceof Node) && 
                (root.right == null || root.right instanceof Node));
    }


}
