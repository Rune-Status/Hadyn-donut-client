package jagex.osrs;

public final class class204 {

    int field2491;
    Node[] field2489;
    int field2492;
    Node field2488;
    Node field2490;

    public class204(int var1) {
        this.field2492 = 0;
        this.field2491 = var1;
        this.field2489 = new Node[var1];

        for (int var2 = 0; var2 < var1; ++var2) {
            Node var3 = this.field2489[var2] = new Node();
            var3.nextNode = var3;
            var3.prevNode = var3;
        }

    }

    public Node method4235() {
        this.field2492 = 0;
        return this.method4229();
    }

    public Node method4224(long var1) {
        Node var3 = this.field2489[(int) (var1 & (long) (this.field2491 - 1))];

        for (this.field2490 = var3.nextNode; var3 != this.field2490;
             this.field2490 = this.field2490.nextNode) {
            if (this.field2490.key == var1) {
                Node var4 = this.field2490;
                this.field2490 = this.field2490.nextNode;
                return var4;
            }
        }

        this.field2490 = null;
        return null;
    }

    public Node method4229() {
        Node var1;
        if (this.field2492 > 0 && this.field2489[this.field2492 - 1] != this.field2488) {
            var1 = this.field2488;
            this.field2488 = var1.nextNode;
            return var1;
        } else {
            do {
                if (this.field2492 >= this.field2491) {
                    return null;
                }

                var1 = this.field2489[this.field2492++].nextNode;
            } while (var1 == this.field2489[this.field2492 - 1]);

            this.field2488 = var1.nextNode;
            return var1;
        }
    }

    void method4227() {
        for (int var1 = 0; var1 < this.field2491; ++var1) {
            Node var2 = this.field2489[var1];

            while (true) {
                Node var3 = var2.nextNode;
                if (var3 == var2) {
                    break;
                }

                var3.unlink();
            }
        }

        this.field2490 = null;
        this.field2488 = null;
    }

    public void method4226(Node var1, long var2) {
        if (var1.prevNode != null) {
            var1.unlink();
        }

        Node var4 = this.field2489[(int) (var2 & (long) (this.field2491 - 1))];
        var1.prevNode = var4.prevNode;
        var1.nextNode = var4;
        var1.prevNode.nextNode = var1;
        var1.nextNode.prevNode = var1;
        var1.key = var2;
    }
}
