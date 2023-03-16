// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagLOGCOLORSPACEA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("lcsSignature"),
        Constants$root.C_LONG$LAYOUT.withName("lcsVersion"),
        Constants$root.C_LONG$LAYOUT.withName("lcsSize"),
        Constants$root.C_LONG$LAYOUT.withName("lcsCSType"),
        Constants$root.C_LONG$LAYOUT.withName("lcsIntent"),
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("ciexyzX"),
                Constants$root.C_LONG$LAYOUT.withName("ciexyzY"),
                Constants$root.C_LONG$LAYOUT.withName("ciexyzZ")
            ).withName("ciexyzRed"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("ciexyzX"),
                Constants$root.C_LONG$LAYOUT.withName("ciexyzY"),
                Constants$root.C_LONG$LAYOUT.withName("ciexyzZ")
            ).withName("ciexyzGreen"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("ciexyzX"),
                Constants$root.C_LONG$LAYOUT.withName("ciexyzY"),
                Constants$root.C_LONG$LAYOUT.withName("ciexyzZ")
            ).withName("ciexyzBlue")
        ).withName("lcsEndpoints"),
        Constants$root.C_LONG$LAYOUT.withName("lcsGammaRed"),
        Constants$root.C_LONG$LAYOUT.withName("lcsGammaGreen"),
        Constants$root.C_LONG$LAYOUT.withName("lcsGammaBlue"),
        MemoryLayout.sequenceLayout(260, Constants$root.C_CHAR$LAYOUT).withName("lcsFilename")
    ).withName("tagLOGCOLORSPACEA");
    public static MemoryLayout $LAYOUT() {
        return tagLOGCOLORSPACEA.$struct$LAYOUT;
    }
    static final VarHandle lcsSignature$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lcsSignature"));
    public static VarHandle lcsSignature$VH() {
        return tagLOGCOLORSPACEA.lcsSignature$VH;
    }
    public static int lcsSignature$get(MemorySegment seg) {
        return (int)tagLOGCOLORSPACEA.lcsSignature$VH.get(seg);
    }
    public static void lcsSignature$set( MemorySegment seg, int x) {
        tagLOGCOLORSPACEA.lcsSignature$VH.set(seg, x);
    }
    public static int lcsSignature$get(MemorySegment seg, long index) {
        return (int)tagLOGCOLORSPACEA.lcsSignature$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lcsSignature$set(MemorySegment seg, long index, int x) {
        tagLOGCOLORSPACEA.lcsSignature$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lcsVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lcsVersion"));
    public static VarHandle lcsVersion$VH() {
        return tagLOGCOLORSPACEA.lcsVersion$VH;
    }
    public static int lcsVersion$get(MemorySegment seg) {
        return (int)tagLOGCOLORSPACEA.lcsVersion$VH.get(seg);
    }
    public static void lcsVersion$set( MemorySegment seg, int x) {
        tagLOGCOLORSPACEA.lcsVersion$VH.set(seg, x);
    }
    public static int lcsVersion$get(MemorySegment seg, long index) {
        return (int)tagLOGCOLORSPACEA.lcsVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lcsVersion$set(MemorySegment seg, long index, int x) {
        tagLOGCOLORSPACEA.lcsVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lcsSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lcsSize"));
    public static VarHandle lcsSize$VH() {
        return tagLOGCOLORSPACEA.lcsSize$VH;
    }
    public static int lcsSize$get(MemorySegment seg) {
        return (int)tagLOGCOLORSPACEA.lcsSize$VH.get(seg);
    }
    public static void lcsSize$set( MemorySegment seg, int x) {
        tagLOGCOLORSPACEA.lcsSize$VH.set(seg, x);
    }
    public static int lcsSize$get(MemorySegment seg, long index) {
        return (int)tagLOGCOLORSPACEA.lcsSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lcsSize$set(MemorySegment seg, long index, int x) {
        tagLOGCOLORSPACEA.lcsSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lcsCSType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lcsCSType"));
    public static VarHandle lcsCSType$VH() {
        return tagLOGCOLORSPACEA.lcsCSType$VH;
    }
    public static int lcsCSType$get(MemorySegment seg) {
        return (int)tagLOGCOLORSPACEA.lcsCSType$VH.get(seg);
    }
    public static void lcsCSType$set( MemorySegment seg, int x) {
        tagLOGCOLORSPACEA.lcsCSType$VH.set(seg, x);
    }
    public static int lcsCSType$get(MemorySegment seg, long index) {
        return (int)tagLOGCOLORSPACEA.lcsCSType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lcsCSType$set(MemorySegment seg, long index, int x) {
        tagLOGCOLORSPACEA.lcsCSType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lcsIntent$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lcsIntent"));
    public static VarHandle lcsIntent$VH() {
        return tagLOGCOLORSPACEA.lcsIntent$VH;
    }
    public static int lcsIntent$get(MemorySegment seg) {
        return (int)tagLOGCOLORSPACEA.lcsIntent$VH.get(seg);
    }
    public static void lcsIntent$set( MemorySegment seg, int x) {
        tagLOGCOLORSPACEA.lcsIntent$VH.set(seg, x);
    }
    public static int lcsIntent$get(MemorySegment seg, long index) {
        return (int)tagLOGCOLORSPACEA.lcsIntent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lcsIntent$set(MemorySegment seg, long index, int x) {
        tagLOGCOLORSPACEA.lcsIntent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment lcsEndpoints$slice(MemorySegment seg) {
        return seg.asSlice(20, 36);
    }
    static final VarHandle lcsGammaRed$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lcsGammaRed"));
    public static VarHandle lcsGammaRed$VH() {
        return tagLOGCOLORSPACEA.lcsGammaRed$VH;
    }
    public static int lcsGammaRed$get(MemorySegment seg) {
        return (int)tagLOGCOLORSPACEA.lcsGammaRed$VH.get(seg);
    }
    public static void lcsGammaRed$set( MemorySegment seg, int x) {
        tagLOGCOLORSPACEA.lcsGammaRed$VH.set(seg, x);
    }
    public static int lcsGammaRed$get(MemorySegment seg, long index) {
        return (int)tagLOGCOLORSPACEA.lcsGammaRed$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lcsGammaRed$set(MemorySegment seg, long index, int x) {
        tagLOGCOLORSPACEA.lcsGammaRed$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lcsGammaGreen$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lcsGammaGreen"));
    public static VarHandle lcsGammaGreen$VH() {
        return tagLOGCOLORSPACEA.lcsGammaGreen$VH;
    }
    public static int lcsGammaGreen$get(MemorySegment seg) {
        return (int)tagLOGCOLORSPACEA.lcsGammaGreen$VH.get(seg);
    }
    public static void lcsGammaGreen$set( MemorySegment seg, int x) {
        tagLOGCOLORSPACEA.lcsGammaGreen$VH.set(seg, x);
    }
    public static int lcsGammaGreen$get(MemorySegment seg, long index) {
        return (int)tagLOGCOLORSPACEA.lcsGammaGreen$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lcsGammaGreen$set(MemorySegment seg, long index, int x) {
        tagLOGCOLORSPACEA.lcsGammaGreen$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lcsGammaBlue$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lcsGammaBlue"));
    public static VarHandle lcsGammaBlue$VH() {
        return tagLOGCOLORSPACEA.lcsGammaBlue$VH;
    }
    public static int lcsGammaBlue$get(MemorySegment seg) {
        return (int)tagLOGCOLORSPACEA.lcsGammaBlue$VH.get(seg);
    }
    public static void lcsGammaBlue$set( MemorySegment seg, int x) {
        tagLOGCOLORSPACEA.lcsGammaBlue$VH.set(seg, x);
    }
    public static int lcsGammaBlue$get(MemorySegment seg, long index) {
        return (int)tagLOGCOLORSPACEA.lcsGammaBlue$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lcsGammaBlue$set(MemorySegment seg, long index, int x) {
        tagLOGCOLORSPACEA.lcsGammaBlue$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment lcsFilename$slice(MemorySegment seg) {
        return seg.asSlice(68, 260);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


