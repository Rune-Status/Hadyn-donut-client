package jagex.osrs;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

public final class class46 extends class320 {

    Image field425;
    Component field424;

    class46(int var1, int var2, Component var3) {
        super.field3864 = var1;
        super.field3861 = var2;
        super.field3862 = new int[var2 * var1 + 1];
        DataBufferInt var4 = new DataBufferInt(super.field3862, super.field3862.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(
            var5.createCompatibleSampleModel(super.field3864, super.field3861), var4, (Point) null);
        this.field425 = new BufferedImage(var5, var6, false, new Hashtable());
        this.method830(var3, (byte) 22);
        this.method6119((short) 2504);
    }

    final void method834(Graphics var1, int var2, int var3, int var4, int var5, int var6) {
        try {
            Shape var7 = var1.getClip();
            var1.clipRect(var2, var3, var4, var5);
            var1.drawImage(this.field425, 0, 0, this.field424);
            var1.setClip(var7);
        } catch (Exception var8) {
            this.field424.repaint();
        }

    }

    final void method833(Graphics var1, int var2, int var3, byte var4) {
        try {
            var1.drawImage(this.field425, var2, var3, this.field424);
        } catch (Exception var6) {
            this.field424.repaint();
        }

    }

    final void method830(Component var1, byte var2) {
        this.field424 = var1;
    }

    public final void vmethod6120(int var1, int var2, int var3) {
        this.method833(this.field424.getGraphics(), var1, var2, (byte) 0);
    }

    public final void vmethod6123(int var1, int var2, int var3, int var4, int var5) {
        this.method834(this.field424.getGraphics(), var1, var2, var3, var4, -53139195);
    }
}
