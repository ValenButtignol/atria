public class RepOkClass1{
    public boolean repOK() {
        return (Nodes == null ? true : Nodes.repOK()) && (size == (Nodes == null ? 0 : Nodes.size()));
    }


}
