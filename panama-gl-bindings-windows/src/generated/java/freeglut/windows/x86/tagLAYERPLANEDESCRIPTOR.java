// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagLAYERPLANEDESCRIPTOR {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("nSize"),
        Constants$root.C_SHORT$LAYOUT.withName("nVersion"),
        Constants$root.C_LONG$LAYOUT.withName("dwFlags"),
        Constants$root.C_CHAR$LAYOUT.withName("iPixelType"),
        Constants$root.C_CHAR$LAYOUT.withName("cColorBits"),
        Constants$root.C_CHAR$LAYOUT.withName("cRedBits"),
        Constants$root.C_CHAR$LAYOUT.withName("cRedShift"),
        Constants$root.C_CHAR$LAYOUT.withName("cGreenBits"),
        Constants$root.C_CHAR$LAYOUT.withName("cGreenShift"),
        Constants$root.C_CHAR$LAYOUT.withName("cBlueBits"),
        Constants$root.C_CHAR$LAYOUT.withName("cBlueShift"),
        Constants$root.C_CHAR$LAYOUT.withName("cAlphaBits"),
        Constants$root.C_CHAR$LAYOUT.withName("cAlphaShift"),
        Constants$root.C_CHAR$LAYOUT.withName("cAccumBits"),
        Constants$root.C_CHAR$LAYOUT.withName("cAccumRedBits"),
        Constants$root.C_CHAR$LAYOUT.withName("cAccumGreenBits"),
        Constants$root.C_CHAR$LAYOUT.withName("cAccumBlueBits"),
        Constants$root.C_CHAR$LAYOUT.withName("cAccumAlphaBits"),
        Constants$root.C_CHAR$LAYOUT.withName("cDepthBits"),
        Constants$root.C_CHAR$LAYOUT.withName("cStencilBits"),
        Constants$root.C_CHAR$LAYOUT.withName("cAuxBuffers"),
        Constants$root.C_CHAR$LAYOUT.withName("iLayerPlane"),
        Constants$root.C_CHAR$LAYOUT.withName("bReserved"),
        Constants$root.C_LONG$LAYOUT.withName("crTransparent")
    ).withName("tagLAYERPLANEDESCRIPTOR");
    public static MemoryLayout $LAYOUT() {
        return tagLAYERPLANEDESCRIPTOR.$struct$LAYOUT;
    }
    static final VarHandle nSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nSize"));
    public static VarHandle nSize$VH() {
        return tagLAYERPLANEDESCRIPTOR.nSize$VH;
    }
    public static short nSize$get(MemorySegment seg) {
        return (short)tagLAYERPLANEDESCRIPTOR.nSize$VH.get(seg);
    }
    public static void nSize$set( MemorySegment seg, short x) {
        tagLAYERPLANEDESCRIPTOR.nSize$VH.set(seg, x);
    }
    public static short nSize$get(MemorySegment seg, long index) {
        return (short)tagLAYERPLANEDESCRIPTOR.nSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nSize$set(MemorySegment seg, long index, short x) {
        tagLAYERPLANEDESCRIPTOR.nSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nVersion"));
    public static VarHandle nVersion$VH() {
        return tagLAYERPLANEDESCRIPTOR.nVersion$VH;
    }
    public static short nVersion$get(MemorySegment seg) {
        return (short)tagLAYERPLANEDESCRIPTOR.nVersion$VH.get(seg);
    }
    public static void nVersion$set( MemorySegment seg, short x) {
        tagLAYERPLANEDESCRIPTOR.nVersion$VH.set(seg, x);
    }
    public static short nVersion$get(MemorySegment seg, long index) {
        return (short)tagLAYERPLANEDESCRIPTOR.nVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nVersion$set(MemorySegment seg, long index, short x) {
        tagLAYERPLANEDESCRIPTOR.nVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return tagLAYERPLANEDESCRIPTOR.dwFlags$VH;
    }
    public static int dwFlags$get(MemorySegment seg) {
        return (int)tagLAYERPLANEDESCRIPTOR.dwFlags$VH.get(seg);
    }
    public static void dwFlags$set( MemorySegment seg, int x) {
        tagLAYERPLANEDESCRIPTOR.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)tagLAYERPLANEDESCRIPTOR.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        tagLAYERPLANEDESCRIPTOR.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iPixelType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iPixelType"));
    public static VarHandle iPixelType$VH() {
        return tagLAYERPLANEDESCRIPTOR.iPixelType$VH;
    }
    public static byte iPixelType$get(MemorySegment seg) {
        return (byte)tagLAYERPLANEDESCRIPTOR.iPixelType$VH.get(seg);
    }
    public static void iPixelType$set( MemorySegment seg, byte x) {
        tagLAYERPLANEDESCRIPTOR.iPixelType$VH.set(seg, x);
    }
    public static byte iPixelType$get(MemorySegment seg, long index) {
        return (byte)tagLAYERPLANEDESCRIPTOR.iPixelType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iPixelType$set(MemorySegment seg, long index, byte x) {
        tagLAYERPLANEDESCRIPTOR.iPixelType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cColorBits$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cColorBits"));
    public static VarHandle cColorBits$VH() {
        return tagLAYERPLANEDESCRIPTOR.cColorBits$VH;
    }
    public static byte cColorBits$get(MemorySegment seg) {
        return (byte)tagLAYERPLANEDESCRIPTOR.cColorBits$VH.get(seg);
    }
    public static void cColorBits$set( MemorySegment seg, byte x) {
        tagLAYERPLANEDESCRIPTOR.cColorBits$VH.set(seg, x);
    }
    public static byte cColorBits$get(MemorySegment seg, long index) {
        return (byte)tagLAYERPLANEDESCRIPTOR.cColorBits$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cColorBits$set(MemorySegment seg, long index, byte x) {
        tagLAYERPLANEDESCRIPTOR.cColorBits$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cRedBits$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cRedBits"));
    public static VarHandle cRedBits$VH() {
        return tagLAYERPLANEDESCRIPTOR.cRedBits$VH;
    }
    public static byte cRedBits$get(MemorySegment seg) {
        return (byte)tagLAYERPLANEDESCRIPTOR.cRedBits$VH.get(seg);
    }
    public static void cRedBits$set( MemorySegment seg, byte x) {
        tagLAYERPLANEDESCRIPTOR.cRedBits$VH.set(seg, x);
    }
    public static byte cRedBits$get(MemorySegment seg, long index) {
        return (byte)tagLAYERPLANEDESCRIPTOR.cRedBits$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cRedBits$set(MemorySegment seg, long index, byte x) {
        tagLAYERPLANEDESCRIPTOR.cRedBits$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cRedShift$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cRedShift"));
    public static VarHandle cRedShift$VH() {
        return tagLAYERPLANEDESCRIPTOR.cRedShift$VH;
    }
    public static byte cRedShift$get(MemorySegment seg) {
        return (byte)tagLAYERPLANEDESCRIPTOR.cRedShift$VH.get(seg);
    }
    public static void cRedShift$set( MemorySegment seg, byte x) {
        tagLAYERPLANEDESCRIPTOR.cRedShift$VH.set(seg, x);
    }
    public static byte cRedShift$get(MemorySegment seg, long index) {
        return (byte)tagLAYERPLANEDESCRIPTOR.cRedShift$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cRedShift$set(MemorySegment seg, long index, byte x) {
        tagLAYERPLANEDESCRIPTOR.cRedShift$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cGreenBits$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cGreenBits"));
    public static VarHandle cGreenBits$VH() {
        return tagLAYERPLANEDESCRIPTOR.cGreenBits$VH;
    }
    public static byte cGreenBits$get(MemorySegment seg) {
        return (byte)tagLAYERPLANEDESCRIPTOR.cGreenBits$VH.get(seg);
    }
    public static void cGreenBits$set( MemorySegment seg, byte x) {
        tagLAYERPLANEDESCRIPTOR.cGreenBits$VH.set(seg, x);
    }
    public static byte cGreenBits$get(MemorySegment seg, long index) {
        return (byte)tagLAYERPLANEDESCRIPTOR.cGreenBits$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cGreenBits$set(MemorySegment seg, long index, byte x) {
        tagLAYERPLANEDESCRIPTOR.cGreenBits$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cGreenShift$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cGreenShift"));
    public static VarHandle cGreenShift$VH() {
        return tagLAYERPLANEDESCRIPTOR.cGreenShift$VH;
    }
    public static byte cGreenShift$get(MemorySegment seg) {
        return (byte)tagLAYERPLANEDESCRIPTOR.cGreenShift$VH.get(seg);
    }
    public static void cGreenShift$set( MemorySegment seg, byte x) {
        tagLAYERPLANEDESCRIPTOR.cGreenShift$VH.set(seg, x);
    }
    public static byte cGreenShift$get(MemorySegment seg, long index) {
        return (byte)tagLAYERPLANEDESCRIPTOR.cGreenShift$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cGreenShift$set(MemorySegment seg, long index, byte x) {
        tagLAYERPLANEDESCRIPTOR.cGreenShift$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cBlueBits$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cBlueBits"));
    public static VarHandle cBlueBits$VH() {
        return tagLAYERPLANEDESCRIPTOR.cBlueBits$VH;
    }
    public static byte cBlueBits$get(MemorySegment seg) {
        return (byte)tagLAYERPLANEDESCRIPTOR.cBlueBits$VH.get(seg);
    }
    public static void cBlueBits$set( MemorySegment seg, byte x) {
        tagLAYERPLANEDESCRIPTOR.cBlueBits$VH.set(seg, x);
    }
    public static byte cBlueBits$get(MemorySegment seg, long index) {
        return (byte)tagLAYERPLANEDESCRIPTOR.cBlueBits$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cBlueBits$set(MemorySegment seg, long index, byte x) {
        tagLAYERPLANEDESCRIPTOR.cBlueBits$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cBlueShift$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cBlueShift"));
    public static VarHandle cBlueShift$VH() {
        return tagLAYERPLANEDESCRIPTOR.cBlueShift$VH;
    }
    public static byte cBlueShift$get(MemorySegment seg) {
        return (byte)tagLAYERPLANEDESCRIPTOR.cBlueShift$VH.get(seg);
    }
    public static void cBlueShift$set( MemorySegment seg, byte x) {
        tagLAYERPLANEDESCRIPTOR.cBlueShift$VH.set(seg, x);
    }
    public static byte cBlueShift$get(MemorySegment seg, long index) {
        return (byte)tagLAYERPLANEDESCRIPTOR.cBlueShift$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cBlueShift$set(MemorySegment seg, long index, byte x) {
        tagLAYERPLANEDESCRIPTOR.cBlueShift$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cAlphaBits$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cAlphaBits"));
    public static VarHandle cAlphaBits$VH() {
        return tagLAYERPLANEDESCRIPTOR.cAlphaBits$VH;
    }
    public static byte cAlphaBits$get(MemorySegment seg) {
        return (byte)tagLAYERPLANEDESCRIPTOR.cAlphaBits$VH.get(seg);
    }
    public static void cAlphaBits$set( MemorySegment seg, byte x) {
        tagLAYERPLANEDESCRIPTOR.cAlphaBits$VH.set(seg, x);
    }
    public static byte cAlphaBits$get(MemorySegment seg, long index) {
        return (byte)tagLAYERPLANEDESCRIPTOR.cAlphaBits$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cAlphaBits$set(MemorySegment seg, long index, byte x) {
        tagLAYERPLANEDESCRIPTOR.cAlphaBits$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cAlphaShift$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cAlphaShift"));
    public static VarHandle cAlphaShift$VH() {
        return tagLAYERPLANEDESCRIPTOR.cAlphaShift$VH;
    }
    public static byte cAlphaShift$get(MemorySegment seg) {
        return (byte)tagLAYERPLANEDESCRIPTOR.cAlphaShift$VH.get(seg);
    }
    public static void cAlphaShift$set( MemorySegment seg, byte x) {
        tagLAYERPLANEDESCRIPTOR.cAlphaShift$VH.set(seg, x);
    }
    public static byte cAlphaShift$get(MemorySegment seg, long index) {
        return (byte)tagLAYERPLANEDESCRIPTOR.cAlphaShift$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cAlphaShift$set(MemorySegment seg, long index, byte x) {
        tagLAYERPLANEDESCRIPTOR.cAlphaShift$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cAccumBits$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cAccumBits"));
    public static VarHandle cAccumBits$VH() {
        return tagLAYERPLANEDESCRIPTOR.cAccumBits$VH;
    }
    public static byte cAccumBits$get(MemorySegment seg) {
        return (byte)tagLAYERPLANEDESCRIPTOR.cAccumBits$VH.get(seg);
    }
    public static void cAccumBits$set( MemorySegment seg, byte x) {
        tagLAYERPLANEDESCRIPTOR.cAccumBits$VH.set(seg, x);
    }
    public static byte cAccumBits$get(MemorySegment seg, long index) {
        return (byte)tagLAYERPLANEDESCRIPTOR.cAccumBits$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cAccumBits$set(MemorySegment seg, long index, byte x) {
        tagLAYERPLANEDESCRIPTOR.cAccumBits$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cAccumRedBits$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cAccumRedBits"));
    public static VarHandle cAccumRedBits$VH() {
        return tagLAYERPLANEDESCRIPTOR.cAccumRedBits$VH;
    }
    public static byte cAccumRedBits$get(MemorySegment seg) {
        return (byte)tagLAYERPLANEDESCRIPTOR.cAccumRedBits$VH.get(seg);
    }
    public static void cAccumRedBits$set( MemorySegment seg, byte x) {
        tagLAYERPLANEDESCRIPTOR.cAccumRedBits$VH.set(seg, x);
    }
    public static byte cAccumRedBits$get(MemorySegment seg, long index) {
        return (byte)tagLAYERPLANEDESCRIPTOR.cAccumRedBits$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cAccumRedBits$set(MemorySegment seg, long index, byte x) {
        tagLAYERPLANEDESCRIPTOR.cAccumRedBits$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cAccumGreenBits$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cAccumGreenBits"));
    public static VarHandle cAccumGreenBits$VH() {
        return tagLAYERPLANEDESCRIPTOR.cAccumGreenBits$VH;
    }
    public static byte cAccumGreenBits$get(MemorySegment seg) {
        return (byte)tagLAYERPLANEDESCRIPTOR.cAccumGreenBits$VH.get(seg);
    }
    public static void cAccumGreenBits$set( MemorySegment seg, byte x) {
        tagLAYERPLANEDESCRIPTOR.cAccumGreenBits$VH.set(seg, x);
    }
    public static byte cAccumGreenBits$get(MemorySegment seg, long index) {
        return (byte)tagLAYERPLANEDESCRIPTOR.cAccumGreenBits$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cAccumGreenBits$set(MemorySegment seg, long index, byte x) {
        tagLAYERPLANEDESCRIPTOR.cAccumGreenBits$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cAccumBlueBits$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cAccumBlueBits"));
    public static VarHandle cAccumBlueBits$VH() {
        return tagLAYERPLANEDESCRIPTOR.cAccumBlueBits$VH;
    }
    public static byte cAccumBlueBits$get(MemorySegment seg) {
        return (byte)tagLAYERPLANEDESCRIPTOR.cAccumBlueBits$VH.get(seg);
    }
    public static void cAccumBlueBits$set( MemorySegment seg, byte x) {
        tagLAYERPLANEDESCRIPTOR.cAccumBlueBits$VH.set(seg, x);
    }
    public static byte cAccumBlueBits$get(MemorySegment seg, long index) {
        return (byte)tagLAYERPLANEDESCRIPTOR.cAccumBlueBits$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cAccumBlueBits$set(MemorySegment seg, long index, byte x) {
        tagLAYERPLANEDESCRIPTOR.cAccumBlueBits$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cAccumAlphaBits$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cAccumAlphaBits"));
    public static VarHandle cAccumAlphaBits$VH() {
        return tagLAYERPLANEDESCRIPTOR.cAccumAlphaBits$VH;
    }
    public static byte cAccumAlphaBits$get(MemorySegment seg) {
        return (byte)tagLAYERPLANEDESCRIPTOR.cAccumAlphaBits$VH.get(seg);
    }
    public static void cAccumAlphaBits$set( MemorySegment seg, byte x) {
        tagLAYERPLANEDESCRIPTOR.cAccumAlphaBits$VH.set(seg, x);
    }
    public static byte cAccumAlphaBits$get(MemorySegment seg, long index) {
        return (byte)tagLAYERPLANEDESCRIPTOR.cAccumAlphaBits$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cAccumAlphaBits$set(MemorySegment seg, long index, byte x) {
        tagLAYERPLANEDESCRIPTOR.cAccumAlphaBits$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cDepthBits$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cDepthBits"));
    public static VarHandle cDepthBits$VH() {
        return tagLAYERPLANEDESCRIPTOR.cDepthBits$VH;
    }
    public static byte cDepthBits$get(MemorySegment seg) {
        return (byte)tagLAYERPLANEDESCRIPTOR.cDepthBits$VH.get(seg);
    }
    public static void cDepthBits$set( MemorySegment seg, byte x) {
        tagLAYERPLANEDESCRIPTOR.cDepthBits$VH.set(seg, x);
    }
    public static byte cDepthBits$get(MemorySegment seg, long index) {
        return (byte)tagLAYERPLANEDESCRIPTOR.cDepthBits$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cDepthBits$set(MemorySegment seg, long index, byte x) {
        tagLAYERPLANEDESCRIPTOR.cDepthBits$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cStencilBits$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cStencilBits"));
    public static VarHandle cStencilBits$VH() {
        return tagLAYERPLANEDESCRIPTOR.cStencilBits$VH;
    }
    public static byte cStencilBits$get(MemorySegment seg) {
        return (byte)tagLAYERPLANEDESCRIPTOR.cStencilBits$VH.get(seg);
    }
    public static void cStencilBits$set( MemorySegment seg, byte x) {
        tagLAYERPLANEDESCRIPTOR.cStencilBits$VH.set(seg, x);
    }
    public static byte cStencilBits$get(MemorySegment seg, long index) {
        return (byte)tagLAYERPLANEDESCRIPTOR.cStencilBits$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cStencilBits$set(MemorySegment seg, long index, byte x) {
        tagLAYERPLANEDESCRIPTOR.cStencilBits$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cAuxBuffers$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cAuxBuffers"));
    public static VarHandle cAuxBuffers$VH() {
        return tagLAYERPLANEDESCRIPTOR.cAuxBuffers$VH;
    }
    public static byte cAuxBuffers$get(MemorySegment seg) {
        return (byte)tagLAYERPLANEDESCRIPTOR.cAuxBuffers$VH.get(seg);
    }
    public static void cAuxBuffers$set( MemorySegment seg, byte x) {
        tagLAYERPLANEDESCRIPTOR.cAuxBuffers$VH.set(seg, x);
    }
    public static byte cAuxBuffers$get(MemorySegment seg, long index) {
        return (byte)tagLAYERPLANEDESCRIPTOR.cAuxBuffers$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cAuxBuffers$set(MemorySegment seg, long index, byte x) {
        tagLAYERPLANEDESCRIPTOR.cAuxBuffers$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iLayerPlane$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iLayerPlane"));
    public static VarHandle iLayerPlane$VH() {
        return tagLAYERPLANEDESCRIPTOR.iLayerPlane$VH;
    }
    public static byte iLayerPlane$get(MemorySegment seg) {
        return (byte)tagLAYERPLANEDESCRIPTOR.iLayerPlane$VH.get(seg);
    }
    public static void iLayerPlane$set( MemorySegment seg, byte x) {
        tagLAYERPLANEDESCRIPTOR.iLayerPlane$VH.set(seg, x);
    }
    public static byte iLayerPlane$get(MemorySegment seg, long index) {
        return (byte)tagLAYERPLANEDESCRIPTOR.iLayerPlane$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iLayerPlane$set(MemorySegment seg, long index, byte x) {
        tagLAYERPLANEDESCRIPTOR.iLayerPlane$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bReserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bReserved"));
    public static VarHandle bReserved$VH() {
        return tagLAYERPLANEDESCRIPTOR.bReserved$VH;
    }
    public static byte bReserved$get(MemorySegment seg) {
        return (byte)tagLAYERPLANEDESCRIPTOR.bReserved$VH.get(seg);
    }
    public static void bReserved$set( MemorySegment seg, byte x) {
        tagLAYERPLANEDESCRIPTOR.bReserved$VH.set(seg, x);
    }
    public static byte bReserved$get(MemorySegment seg, long index) {
        return (byte)tagLAYERPLANEDESCRIPTOR.bReserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bReserved$set(MemorySegment seg, long index, byte x) {
        tagLAYERPLANEDESCRIPTOR.bReserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle crTransparent$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("crTransparent"));
    public static VarHandle crTransparent$VH() {
        return tagLAYERPLANEDESCRIPTOR.crTransparent$VH;
    }
    public static int crTransparent$get(MemorySegment seg) {
        return (int)tagLAYERPLANEDESCRIPTOR.crTransparent$VH.get(seg);
    }
    public static void crTransparent$set( MemorySegment seg, int x) {
        tagLAYERPLANEDESCRIPTOR.crTransparent$VH.set(seg, x);
    }
    public static int crTransparent$get(MemorySegment seg, long index) {
        return (int)tagLAYERPLANEDESCRIPTOR.crTransparent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void crTransparent$set(MemorySegment seg, long index, int x) {
        tagLAYERPLANEDESCRIPTOR.crTransparent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


