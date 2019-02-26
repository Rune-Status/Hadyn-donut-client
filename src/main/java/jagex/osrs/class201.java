package jagex.osrs;

import java.util.Iterator;

public class class201 implements Iterator {

    Node field2477;
    Node field2476;
    class205 field2478;

    class201(class205 var1) {
        this.field2476 = null;
        this.field2478 = var1;
        this.field2477 = this.field2478.root.nextNode;
        this.field2476 = null;
    }

    public void remove() {
        this.field2476.unlink();
        this.field2476 = null;
    }

    public boolean hasNext() {
        return this.field2478.root != this.field2477;
    }

    public Object next() {
        Node var1 = this.field2477;
        if (var1 == this.field2478.root) {
            var1 = null;
            this.field2477 = null;
        } else {
            this.field2477 = var1.nextNode;
        }

        this.field2476 = var1;
        return var1;
    }
}
