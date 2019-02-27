package jagex.osrs;

public class Deque {

    public Node root;
    Node field2499;

    public Deque() {
        this.root = new Node();
        this.root.nextNode = this.root;
        this.root.prevNode = this.root;
    }

    public static void method4307(Node var0, Node var1) {
        if (var0.prevNode != null) {
            var0.unlink();
        }

        var0.prevNode = var1.prevNode;
        var0.nextNode = var1;
        var0.prevNode.nextNode = var0;
        var0.nextNode.prevNode = var0;
    }

    public void addFirst(Node var1) {
        if (var1.prevNode != null) {
            var1.unlink();
        }

        var1.prevNode = this.root;
        var1.nextNode = this.root.nextNode;
        var1.prevNode.nextNode = var1;
        var1.nextNode.prevNode = var1;
    }

    public Node getFirst() {
        Node var1 = this.root.nextNode;
        if (var1 == this.root) {
            this.field2499 = null;
            return null;
        } else {
            this.field2499 = var1.nextNode;
            return var1;
        }
    }

    public Node getNext() {
        Node var1 = this.field2499;
        if (var1 == this.root) {
            this.field2499 = null;
            return null;
        } else {
            this.field2499 = var1.nextNode;
            return var1;
        }
    }

    public void addLast(Node node) {
        if (node.prevNode != null) {
            node.unlink();
        }

        node.prevNode = this.root.prevNode;
        node.nextNode = this.root;
        node.prevNode.nextNode = node;
        node.nextNode.prevNode = node;
    }

    public Node method4279() {
        Node var1 = this.root.nextNode;
        if (var1 == this.root) {
            return null;
        } else {
            var1.unlink();
            return var1;
        }
    }

    public Node method4274() {
        Node var1 = this.root.prevNode;
        if (var1 == this.root) {
            this.field2499 = null;
            return null;
        } else {
            this.field2499 = var1.prevNode;
            return var1;
        }
    }

    public Node method4280() {
        Node var1 = this.root.prevNode;
        if (var1 == this.root) {
            return null;
        } else {
            var1.unlink();
            return var1;
        }
    }

    public Node method4295() {
        Node var1 = this.field2499;
        if (var1 == this.root) {
            this.field2499 = null;
            return null;
        } else {
            this.field2499 = var1.prevNode;
            return var1;
        }
    }

    public void method4275() {
        while (true) {
            Node var1 = this.root.nextNode;
            if (var1 == this.root) {
                this.field2499 = null;
                return;
            }

            var1.unlink();
        }
    }
}
