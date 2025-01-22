package collection.link;

public class Node {

    Object item;
    Node next;

    public Node(Object item) {
        this.item = item;
    }

    //[A->B->C]
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node x = this;

        while (x != null) {
            if (item != null && x.next != null)
                sb.append(x.item).append("->");
            else
                sb.append(x.item);
            x = x.next;
        }

        sb.append("]");
        return sb.toString();
    }
}
