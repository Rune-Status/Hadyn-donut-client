package jagex.osrs;

public class Node {

    public Node nextNode;
    public long key;
    Node prevNode;

    public void unlink() {
        if (this.prevNode == null) {
            return;
        }
        this.prevNode.nextNode = this.nextNode;
        this.nextNode.prevNode = this.prevNode;
        this.nextNode = null;
        this.prevNode = null;
    }

    public boolean isLinked() {
        return this.prevNode != null;
    }
}
