package jagex.osrs;

public class class207 {

    public Node field2498;
    Node field2499;

    public class207() {
        this.field2498 = new Node();
        this.field2498.nextNode = this.field2498;
        this.field2498.prevNode = this.field2498;
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

    public void method4277(Node var1) {
        if (var1.prevNode != null) {
            var1.unlink();
        }

        var1.prevNode = this.field2498;
        var1.nextNode = this.field2498.nextNode;
        var1.prevNode.nextNode = var1;
        var1.nextNode.prevNode = var1;
    }

    public Node method4298() {
        Node var1 = this.field2498.nextNode;
        if (var1 == this.field2498) {
            this.field2499 = null;
            return null;
        } else {
            this.field2499 = var1.nextNode;
            return var1;
        }
    }

    public Node method4283() {
        Node var1 = this.field2499;
        if (var1 == this.field2498) {
            this.field2499 = null;
            return null;
        } else {
            this.field2499 = var1.nextNode;
            return var1;
        }
    }

    public void method4276(Node var1) {
        if (var1.prevNode != null) {
            var1.unlink();
        }

        var1.prevNode = this.field2498.prevNode;
        var1.nextNode = this.field2498;
        var1.prevNode.nextNode = var1;
        var1.nextNode.prevNode = var1;
    }

    public Node method4279() {
        Node var1 = this.field2498.nextNode;
        if (var1 == this.field2498) {
            return null;
        } else {
            var1.unlink();
            return var1;
        }
    }

    public Node method4274() {
        Node var1 = this.field2498.prevNode;
        if (var1 == this.field2498) {
            this.field2499 = null;
            return null;
        } else {
            this.field2499 = var1.prevNode;
            return var1;
        }
    }

    public Node method4280() {
        Node var1 = this.field2498.prevNode;
        if (var1 == this.field2498) {
            return null;
        } else {
            var1.unlink();
            return var1;
        }
    }

    public Node method4295() {
        Node var1 = this.field2499;
        if (var1 == this.field2498) {
            this.field2499 = null;
            return null;
        } else {
            this.field2499 = var1.prevNode;
            return var1;
        }
    }

    public void method4275() {
        while (true) {
            Node var1 = this.field2498.nextNode;
            if (var1 == this.field2498) {
                this.field2499 = null;
                return;
            }

            var1.unlink();
        }
    }
}
