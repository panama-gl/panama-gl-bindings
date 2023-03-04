// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagPIXELFORMATDESCRIPTOR {

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
        Constants$root.C_CHAR$LAYOUT.withName("iLayerType"),
        Constants$root.C_CHAR$LAYOUT.withName("bReserved"),
        Constants$root.C_LONG$LAYOUT.withName("dwLayerMask"),
        Constants$root.C_LONG$LAYOUT.withName("dwVisibleMask"),
        Constants$root.C_LONG$LAYOUT.withName("dwDamageMask")
    ).withName("tagPIXELFORMATDESCRIPTOR");
    public static MemoryLayout $LAYOUT() {
        return tagPIXELFORMATDESCRIPTOR.$struct$LAYOUT;
    }
    static final VarHandle nSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nSize"));
    public static VarHandle nSize$VH() {
        return tagPIXELFORMATDESCRIPTOR.nSize$VH;
    }
    public static short nSize$get(MemorySegment seg) {
        return (short)tagPIXELFORMATDESCRIPTOR.nSize$VH.get(seg);
    }
    public static void nSize$set( MemorySegment seg, short x) {
        tagPIXELFORMATDESCRIPTOR.nSize$VH.set(seg, x);
    }
    public static short nSize$get(MemorySegment seg, long index) {
        return (short)tagPIXELFORMATDESCRIPTOR.nSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nSize$set(MemorySegment seg, long index, short x) {
        tagPIXELFORMATDESCRIPTOR.nSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nVersion"));
    public static VarHandle nVersion$VH() {
        return tagPIXELFORMATDESCRIPTOR.nVersion$VH;
    }
    public static short nVersion$get(MemorySegment seg) {
        return (short)tagPIXELFORMATDESCRIPTOR.nVersion$VH.get(seg);
    }
    public static void nVersion$set( MemorySegment seg, short x) {
        tagPIXELFORMATDESCRIPTOR.nVersion$VH.set(seg, x);
    }
    public static short nVersion$get(MemorySegment seg, long index) {
        return (short)tagPIXELFORMATDESCRIPTOR.nVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nVersion$set(MemorySegment seg, long index, short x) {
        tagPIXELFORMATDESCRIPTOR.nVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return tagPIXELFORMATDESCRIPTOR.dwFlags$VH;
    }
    public static int dwFlags$get(MemorySegment seg) {
        return (int)tagPIXELFORMATDESCRIPTOR.dwFlags$VH.get(seg);
    }
    public static void dwFlags$set( MemorySegment seg, int x) {
        tagPIXELFORMATDESCRIPTOR.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)tagPIXELFORMATDESCRIPTOR.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        tagPIXELFORMATDESCRIPTOR.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iPixelType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iPixelType"));
    public static VarHandle iPixelType$VH() {
        return tagPIXELFORMATDESCRIPTOR.iPixelType$VH;
    }
    public static byte iPixelType$get(MemorySegment seg) {
        return (byte)tagPIXELFORMATDESCRIPTOR.iPixelType$VH.get(seg);
    }
    public static void iPixelType$set( MemorySegment seg, byte x) {
        tagPIXELFORMATDESCRIPTOR.iPixelType$VH.set(seg, x);
    }
    public static byte iPixelType$get(MemorySegment seg, long index) {
        return (byte)tagPIXELFORMATDESCRIPTOR.iPixelType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iPixelType$set(MemorySegment seg, long index, byte x) {
        tagPIXELFORMATDESCRIPTOR.iPixelType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cColorBits$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cColorBits"));
    public static VarHandle cColorBits$VH() {
        return tagPIXELFORMATDESCRIPTOR.cColorBits$VH;
    }
    public static byte cColorBits$get(MemorySegment seg) {
        return (byte)tagPIXELFORMATDESCRIPTOR.cColorBits$VH.get(seg);
    }
    public static void cColorBits$set( MemorySegment seg, byte x) {
        tagPIXELFORMATDESCRIPTOR.cColorBits$VH.set(seg, x);
    }
    public static byte cColorBits$get(MemorySegment seg, long index) {
        return (byte)tagPIXELFORMATDESCRIPTOR.cColorBits$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cColorBits$set(MemorySegment seg, long index, byte x) {
        tagPIXELFORMATDESCRIPTOR.cColorBits$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cRedBits$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cRedBits"));
    public static VarHandle cRedBits$VH() {
        return tagPIXELFORMATDESCRIPTOR.cRedBits$VH;
    }
    public static byte cRedBits$get(MemorySegment seg) {
        return (byte)tagPIXELFORMATDESCRIPTOR.cRedBits$VH.get(seg);
    }
    public static void cRedBits$set( MemorySegment seg, byte x) {
        tagPIXELFORMATDESCRIPTOR.cRedBits$VH.set(seg, x);
    }
    public static byte cRedBits$get(MemorySegment seg, long index) {
        return (byte)tagPIXELFORMATDESCRIPTOR.cRedBits$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cRedBits$set(MemorySegment seg, long index, byte x) {
        tagPIXELFORMATDESCRIPTOR.cRedBits$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cRedShift$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cRedShift"));
    public static VarHandle cRedShift$VH() {
        return tagPIXELFORMATDESCRIPTOR.cRedShift$VH;
    }
    public static byte cRedShift$get(MemorySegment seg) {
        return (byte)tagPIXELFORMATDESCRIPTOR.cRedShift$VH.get(seg);
    }
    public static void cRedShift$set( MemorySegment seg, byte x) {
        tagPIXELFORMATDESCRIPTOR.cRedShift$VH.set(seg, x);
    }
    public static byte cRedShift$get(MemorySegment seg, long index) {
        return (byte)tagPIXELFORMATDESCRIPTOR.cRedShift$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cRedShift$set(MemorySegment seg, long index, byte x) {
        tagPIXELFORMATDESCRIPTOR.cRedShift$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cGreenBits$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cGreenBits"));
    public static VarHandle cGreenBits$VH() {
        return tagPIXELFORMATDESCRIPTOR.cGreenBits$VH;
    }
    public static byte cGreenBits$get(MemorySegment seg) {
        return (byte)tagPIXELFORMATDESCRIPTOR.cGreenBits$VH.get(seg);
    }
    public static void cGreenBits$set( MemorySegment seg, byte x) {
        tagPIXELFORMATDESCRIPTOR.cGreenBits$VH.set(seg, x);
    }
    public static byte cGreenBits$get(MemorySegment seg, long index) {
        return (byte)tagPIXELFORMATDESCRIPTOR.cGreenBits$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cGreenBits$set(MemorySegment seg, long index, byte x) {
        tagPIXELFORMATDESCRIPTOR.cGreenBits$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cGreenShift$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cGreenShift"));
    public static VarHandle cGreenShift$VH() {
        return tagPIXELFORMATDESCRIPTOR.cGreenShift$VH;
    }
    public static byte cGreenShift$get(MemorySegment seg) {
        return (byte)tagPIXELFORMATDESCRIPTOR.cGreenShift$VH.get(seg);
    }
    public static void cGreenShift$set( MemorySegment seg, byte x) {
        tagPIXELFORMATDESCRIPTOR.cGreenShift$VH.set(seg, x);
    }
    public static byte cGreenShift$get(MemorySegment seg, long index) {
        return (byte)tagPIXELFORMATDESCRIPTOR.cGreenShift$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cGreenShift$set(MemorySegment seg, long index, byte x) {
        tagPIXELFORMATDESCRIPTOR.cGreenShift$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cBlueBits$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cBlueBits"));
    public static VarHandle cBlueBits$VH() {
        return tagPIXELFORMATDESCRIPTOR.cBlueBits$VH;
    }
    public static byte cBlueBits$get(MemorySegment seg) {
        return (byte)tagPIXELFORMATDESCRIPTOR.cBlueBits$VH.get(seg);
    }
    public static void cBlueBits$set( MemorySegment seg, byte x) {
        tagPIXELFORMATDESCRIPTOR.cBlueBits$VH.set(seg, x);
    }
    public static byte cBlueBits$get(MemorySegment seg, long index) {
        return (byte)tagPIXELFORMATDESCRIPTOR.cBlueBits$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cBlueBits$set(MemorySegment seg, long index, byte x) {
        tagPIXELFORMATDESCRIPTOR.cBlueBits$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cBlueShift$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cBlueShift"));
    public static VarHandle cBlueShift$VH() {
        return tagPIXELFORMATDESCRIPTOR.cBlueShift$VH;
    }
    public static byte cBlueShift$get(MemorySegment seg) {
        return (byte)tagPIXELFORMATDESCRIPTOR.cBlueShift$VH.get(seg);
    }
    public static void cBlueShift$set( MemorySegment seg, byte x) {
        tagPIXELFORMATDESCRIPTOR.cBlueShift$VH.set(seg, x);
    }
    public static byte cBlueShift$get(MemorySegment seg, long index) {
        return (byte)tagPIXELFORMATDESCRIPTOR.cBlueShift$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cBlueShift$set(MemorySegment seg, long index, byte x) {
        tagPIXELFORMATDESCRIPTOR.cBlueShift$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cAlphaBits$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cAlphaBits"));
    public static VarHandle cAlphaBits$VH() {
        return tagPIXELFORMATDESCRIPTOR.cAlphaBits$VH;
    }
    public static byte cAlphaBits$get(MemorySegment seg) {
        return (byte)tagPIXELFORMATDESCRIPTOR.cAlphaBits$VH.get(seg);
    }
    public static void cAlphaBits$set( MemorySegment seg, byte x) {
        tagPIXELFORMATDESCRIPTOR.cAlphaBits$VH.set(seg, x);
    }
    public static byte cAlphaBits$get(MemorySegment seg, long index) {
        return (byte)tagPIXELFORMATDESCRIPTOR.cAlphaBits$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cAlphaBits$set(MemorySegment seg, long index, byte x) {
        tagPIXELFORMATDESCRIPTOR.cAlphaBits$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cAlphaShift$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cAlphaShift"));
    public static VarHandle cAlphaShift$VH() {
        return tagPIXELFORMATDESCRIPTOR.cAlphaShift$VH;
    }
    public static byte cAlphaShift$get(MemorySegment seg) {
        return (byte)tagPIXELFORMATDESCRIPTOR.cAlphaShift$VH.get(seg);
    }
    public static void cAlphaShift$set( MemorySegment seg, byte x) {
        tagPIXELFORMATDESCRIPTOR.cAlphaShift$VH.set(seg, x);
    }
    public static byte cAlphaShift$get(MemorySegment seg, long index) {
        return (byte)tagPIXELFORMATDESCRIPTOR.cAlphaShift$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cAlphaShift$set(MemorySegment seg, long index, byte x) {
        tagPIXELFORMATDESCRIPTOR.cAlphaShift$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cAccumBits$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cAccumBits"));
    public static VarHandle cAccumBits$VH() {
        return tagPIXELFORMATDESCRIPTOR.cAccumBits$VH;
    }
    public static byte cAccumBits$get(MemorySegment seg) {
        return (byte)tagPIXELFORMATDESCRIPTOR.cAccumBits$VH.get(seg);
    }
    public static void cAccumBits$set( MemorySegment seg, byte x) {
        tagPIXELFORMATDESCRIPTOR.cAccumBits$VH.set(seg, x);
    }
    public static byte cAccumBits$get(MemorySegment seg, long index) {
        return (byte)tagPIXELFORMATDESCRIPTOR.cAccumBits$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cAccumBits$set(MemorySegment seg, long index, byte x) {
        tagPIXELFORMATDESCRIPTOR.cAccumBits$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cAccumRedBits$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cAccumRedBits"));
    public static VarHandle cAccumRedBits$VH() {
        return tagPIXELFORMATDESCRIPTOR.cAccumRedBits$VH;
    }
    public static byte cAccumRedBits$get(MemorySegment seg) {
        return (byte)tagPIXELFORMATDESCRIPTOR.cAccumRedBits$VH.get(seg);
    }
    public static void cAccumRedBits$set( MemorySegment seg, byte x) {
        tagPIXELFORMATDESCRIPTOR.cAccumRedBits$VH.set(seg, x);
    }
    public static byte cAccumRedBits$get(MemorySegment seg, long index) {
        return (byte)tagPIXELFORMATDESCRIPTOR.cAccumRedBits$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cAccumRedBits$set(MemorySegment seg, long index, byte x) {
        tagPIXELFORMATDESCRIPTOR.cAccumRedBits$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cAccumGreenBits$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cAccumGreenBits"));
    public static VarHandle cAccumGreenBits$VH() {
        return tagPIXELFORMATDESCRIPTOR.cAccumGreenBits$VH;
    }
    public static byte cAccumGreenBits$get(MemorySegment seg) {
        return (byte)tagPIXELFORMATDESCRIPTOR.cAccumGreenBits$VH.get(seg);
    }
    public static void cAccumGreenBits$set( MemorySegment seg, byte x) {
        tagPIXELFORMATDESCRIPTOR.cAccumGreenBits$VH.set(seg, x);
    }
    public static byte cAccumGreenBits$get(MemorySegment seg, long index) {
        return (byte)tagPIXELFORMATDESCRIPTOR.cAccumGreenBits$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cAccumGreenBits$set(MemorySegment seg, long index, byte x) {
        tagPIXELFORMATDESCRIPTOR.cAccumGreenBits$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cAccumBlueBits$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cAccumBlueBits"));
    public static VarHandle cAccumBlueBits$VH() {
        return tagPIXELFORMATDESCRIPTOR.cAccumBlueBits$VH;
    }
    public static byte cAccumBlueBits$get(MemorySegment seg) {
        return (byte)tagPIXELFORMATDESCRIPTOR.cAccumBlueBits$VH.get(seg);
    }
    public static void cAccumBlueBits$set( MemorySegment seg, byte x) {
        tagPIXELFORMATDESCRIPTOR.cAccumBlueBits$VH.set(seg, x);
    }
    public static byte cAccumBlueBits$get(MemorySegment seg, long index) {
        return (byte)tagPIXELFORMATDESCRIPTOR.cAccumBlueBits$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cAccumBlueBits$set(MemorySegment seg, long index, byte x) {
        tagPIXELFORMATDESCRIPTOR.cAccumBlueBits$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cAccumAlphaBits$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cAccumAlphaBits"));
    public static VarHandle cAccumAlphaBits$VH() {
        return tagPIXELFORMATDESCRIPTOR.cAccumAlphaBits$VH;
    }
    public static byte cAccumAlphaBits$get(MemorySegment seg) {
        return (byte)tagPIXELFORMATDESCRIPTOR.cAccumAlphaBits$VH.get(seg);
    }
    public static void cAccumAlphaBits$set( MemorySegment seg, byte x) {
        tagPIXELFORMATDESCRIPTOR.cAccumAlphaBits$VH.set(seg, x);
    }
    public static byte cAccumAlphaBits$get(MemorySegment seg, long index) {
        return (byte)tagPIXELFORMATDESCRIPTOR.cAccumAlphaBits$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cAccumAlphaBits$set(MemorySegment seg, long index, byte x) {
        tagPIXELFORMATDESCRIPTOR.cAccumAlphaBits$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cDepthBits$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cDepthBits"));
    public static VarHandle cDepthBits$VH() {
        return tagPIXELFORMATDESCRIPTOR.cDepthBits$VH;
    }
    public static byte cDepthBits$get(MemorySegment seg) {
        return (byte)tagPIXELFORMATDESCRIPTOR.cDepthBits$VH.get(seg);
    }
    public static void cDepthBits$set( MemorySegment seg, byte x) {
        tagPIXELFORMATDESCRIPTOR.cDepthBits$VH.set(seg, x);
    }
    public static byte cDepthBits$get(MemorySegment seg, long index) {
        return (byte)tagPIXELFORMATDESCRIPTOR.cDepthBits$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cDepthBits$set(MemorySegment seg, long index, byte x) {
        tagPIXELFORMATDESCRIPTOR.cDepthBits$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cStencilBits$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cStencilBits"));
    public static VarHandle cStencilBits$VH() {
        return tagPIXELFORMATDESCRIPTOR.cStencilBits$VH;
    }
    public static byte cStencilBits$get(MemorySegment seg) {
        return (byte)tagPIXELFORMATDESCRIPTOR.cStencilBits$VH.get(seg);
    }
    public static void cStencilBits$set( MemorySegment seg, byte x) {
        tagPIXELFORMATDESCRIPTOR.cStencilBits$VH.set(seg, x);
    }
    public static byte cStencilBits$get(MemorySegment seg, long index) {
        return (byte)tagPIXELFORMATDESCRIPTOR.cStencilBits$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cStencilBits$set(MemorySegment seg, long index, byte x) {
        tagPIXELFORMATDESCRIPTOR.cStencilBits$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cAuxBuffers$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cAuxBuffers"));
    public static VarHandle cAuxBuffers$VH() {
        return tagPIXELFORMATDESCRIPTOR.cAuxBuffers$VH;
    }
    public static byte cAuxBuffers$get(MemorySegment seg) {
        return (byte)tagPIXELFORMATDESCRIPTOR.cAuxBuffers$VH.get(seg);
    }
    public static void cAuxBuffers$set( MemorySegment seg, byte x) {
        tagPIXELFORMATDESCRIPTOR.cAuxBuffers$VH.set(seg, x);
    }
    public static byte cAuxBuffers$get(MemorySegment seg, long index) {
        return (byte)tagPIXELFORMATDESCRIPTOR.cAuxBuffers$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cAuxBuffers$set(MemorySegment seg, long index, byte x) {
        tagPIXELFORMATDESCRIPTOR.cAuxBuffers$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iLayerType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iLayerType"));
    public static VarHandle iLayerType$VH() {
        return tagPIXELFORMATDESCRIPTOR.iLayerType$VH;
    }
    public static byte iLayerType$get(MemorySegment seg) {
        return (byte)tagPIXELFORMATDESCRIPTOR.iLayerType$VH.get(seg);
    }
    public static void iLayerType$set( MemorySegment seg, byte x) {
        tagPIXELFORMATDESCRIPTOR.iLayerType$VH.set(seg, x);
    }
    public static byte iLayerType$get(MemorySegment seg, long index) {
        return (byte)tagPIXELFORMATDESCRIPTOR.iLayerType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iLayerType$set(MemorySegment seg, long index, byte x) {
        tagPIXELFORMATDESCRIPTOR.iLayerType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bReserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("bReserved"));
    public static VarHandle bReserved$VH() {
        return tagPIXELFORMATDESCRIPTOR.bReserved$VH;
    }
    public static byte bReserved$get(MemorySegment seg) {
        return (byte)tagPIXELFORMATDESCRIPTOR.bReserved$VH.get(seg);
    }
    public static void bReserved$set( MemorySegment seg, byte x) {
        tagPIXELFORMATDESCRIPTOR.bReserved$VH.set(seg, x);
    }
    public static byte bReserved$get(MemorySegment seg, long index) {
        return (byte)tagPIXELFORMATDESCRIPTOR.bReserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bReserved$set(MemorySegment seg, long index, byte x) {
        tagPIXELFORMATDESCRIPTOR.bReserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwLayerMask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwLayerMask"));
    public static VarHandle dwLayerMask$VH() {
        return tagPIXELFORMATDESCRIPTOR.dwLayerMask$VH;
    }
    public static int dwLayerMask$get(MemorySegment seg) {
        return (int)tagPIXELFORMATDESCRIPTOR.dwLayerMask$VH.get(seg);
    }
    public static void dwLayerMask$set( MemorySegment seg, int x) {
        tagPIXELFORMATDESCRIPTOR.dwLayerMask$VH.set(seg, x);
    }
    public static int dwLayerMask$get(MemorySegment seg, long index) {
        return (int)tagPIXELFORMATDESCRIPTOR.dwLayerMask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwLayerMask$set(MemorySegment seg, long index, int x) {
        tagPIXELFORMATDESCRIPTOR.dwLayerMask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwVisibleMask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwVisibleMask"));
    public static VarHandle dwVisibleMask$VH() {
        return tagPIXELFORMATDESCRIPTOR.dwVisibleMask$VH;
    }
    public static int dwVisibleMask$get(MemorySegment seg) {
        return (int)tagPIXELFORMATDESCRIPTOR.dwVisibleMask$VH.get(seg);
    }
    public static void dwVisibleMask$set( MemorySegment seg, int x) {
        tagPIXELFORMATDESCRIPTOR.dwVisibleMask$VH.set(seg, x);
    }
    public static int dwVisibleMask$get(MemorySegment seg, long index) {
        return (int)tagPIXELFORMATDESCRIPTOR.dwVisibleMask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwVisibleMask$set(MemorySegment seg, long index, int x) {
        tagPIXELFORMATDESCRIPTOR.dwVisibleMask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwDamageMask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwDamageMask"));
    public static VarHandle dwDamageMask$VH() {
        return tagPIXELFORMATDESCRIPTOR.dwDamageMask$VH;
    }
    public static int dwDamageMask$get(MemorySegment seg) {
        return (int)tagPIXELFORMATDESCRIPTOR.dwDamageMask$VH.get(seg);
    }
    public static void dwDamageMask$set( MemorySegment seg, int x) {
        tagPIXELFORMATDESCRIPTOR.dwDamageMask$VH.set(seg, x);
    }
    public static int dwDamageMask$get(MemorySegment seg, long index) {
        return (int)tagPIXELFORMATDESCRIPTOR.dwDamageMask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwDamageMask$set(MemorySegment seg, long index, int x) {
        tagPIXELFORMATDESCRIPTOR.dwDamageMask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


