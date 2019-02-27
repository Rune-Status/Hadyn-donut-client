package jagex.osrs;

import java.util.Iterator;

public class IterableDeque implements Iterable {

    Node field2494;
    Node root;

    public IterableDeque() {
        this.root = new Node();
        this.root.nextNode = this.root;
        this.root.prevNode = this.root;
    }

    public static void method4245(Node var0, Node var1) {
        if (var0.prevNode != null) {
            var0.unlink();
        }

        var0.prevNode = var1;
        var0.nextNode = var1.nextNode;
        var0.prevNode.nextNode = var0;
        var0.nextNode.prevNode = var0;
    }

    Node method4244(Node var1) {
        Node var2;
        if (var1 == null) {
            var2 = this.root.nextNode;
        } else {
            var2 = var1;
        }

        if (var2 == this.root) {
            this.field2494 = null;
            return null;
        } else {
            this.field2494 = var2.nextNode;
            return var2;
        }
    }

    public void clear() {
        while (this.root.nextNode != this.root) {
            this.root.nextNode.unlink();
        }

    }

    public boolean isEmpty() {
        return this.root.nextNode == this.root;
    }

    public Node method4250() {
        return this.method4244((Node) null);
    }

    public void method4269(Node var1) {
        if (var1.prevNode != null) {
            var1.unlink();
        }

        var1.prevNode = this.root.prevNode;
        var1.nextNode = this.root;
        var1.prevNode.nextNode = var1;
        var1.nextNode.prevNode = var1;
    }

    public Node method4248() {
        Node var1 = this.field2494;
        if (var1 == this.root) {
            this.field2494 = null;
            return null;
        } else {
            this.field2494 = var1.nextNode;
            return var1;
        }
    }

    public void method4246(Node var1) {
        if (var1.prevNode != null) {
            var1.unlink();
        }

        var1.prevNode = this.root;
        var1.nextNode = this.root.nextNode;
        var1.prevNode.nextNode = var1;
        var1.nextNode.prevNode = var1;
    }

    public Iterator iterator() {
        return new class201(this);
    }
}
