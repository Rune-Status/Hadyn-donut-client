package jagex.osrs;

public class class146 extends class285 {

    static String field1954;
    final boolean field1956;

    public class146(boolean var1) {
        this.field1956 = var1;
    }

    static final void method3356(String var0, int var1, int var2) {
        OutboundPacket var3 = class131
            .method3243(class171.field2284, client.field690.random, (byte) 109);
        var3.buffer.writeByte(class97.method2404(var0, -774853610) + 1);
        var3.buffer.writeString(var0);
        var3.buffer.writeByte(var1);
        client.field690.method2193(var3, -1018390791);
    }

    int method3350(class289 var1, class289 var2, int var3) {
        return var2.field3710 != var1.field3710 ? (this.field1956 ? var1.field3710 - var2.field3710
            : var2.field3710 - var1.field3710) : this.method5566(var1, var2, (byte) -7);
    }

    public int compare(Object var1, Object var2) {
        return this.method3350((class289) var1, (class289) var2, -628508580);
    }
}
