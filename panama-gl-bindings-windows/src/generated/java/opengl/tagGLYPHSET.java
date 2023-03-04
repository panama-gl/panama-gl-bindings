// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagGLYPHSET {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbThis"),
        Constants$root.C_LONG$LAYOUT.withName("flAccel"),
        Constants$root.C_LONG$LAYOUT.withName("cGlyphsSupported"),
        Constants$root.C_LONG$LAYOUT.withName("cRanges"),
        MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
            Constants$root.C_SHORT$LAYOUT.withName("wcLow"),
            Constants$root.C_SHORT$LAYOUT.withName("cGlyphs")
        ).withName("tagWCRANGE")).withName("ranges")
    ).withName("tagGLYPHSET");
    public static MemoryLayout $LAYOUT() {
        return tagGLYPHSET.$struct$LAYOUT;
    }
    static final VarHandle cbThis$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbThis"));
    public static VarHandle cbThis$VH() {
        return tagGLYPHSET.cbThis$VH;
    }
    public static int cbThis$get(MemorySegment seg) {
        return (int)tagGLYPHSET.cbThis$VH.get(seg);
    }
    public static void cbThis$set( MemorySegment seg, int x) {
        tagGLYPHSET.cbThis$VH.set(seg, x);
    }
    public static int cbThis$get(MemorySegment seg, long index) {
        return (int)tagGLYPHSET.cbThis$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbThis$set(MemorySegment seg, long index, int x) {
        tagGLYPHSET.cbThis$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle flAccel$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("flAccel"));
    public static VarHandle flAccel$VH() {
        return tagGLYPHSET.flAccel$VH;
    }
    public static int flAccel$get(MemorySegment seg) {
        return (int)tagGLYPHSET.flAccel$VH.get(seg);
    }
    public static void flAccel$set( MemorySegment seg, int x) {
        tagGLYPHSET.flAccel$VH.set(seg, x);
    }
    public static int flAccel$get(MemorySegment seg, long index) {
        return (int)tagGLYPHSET.flAccel$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void flAccel$set(MemorySegment seg, long index, int x) {
        tagGLYPHSET.flAccel$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cGlyphsSupported$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cGlyphsSupported"));
    public static VarHandle cGlyphsSupported$VH() {
        return tagGLYPHSET.cGlyphsSupported$VH;
    }
    public static int cGlyphsSupported$get(MemorySegment seg) {
        return (int)tagGLYPHSET.cGlyphsSupported$VH.get(seg);
    }
    public static void cGlyphsSupported$set( MemorySegment seg, int x) {
        tagGLYPHSET.cGlyphsSupported$VH.set(seg, x);
    }
    public static int cGlyphsSupported$get(MemorySegment seg, long index) {
        return (int)tagGLYPHSET.cGlyphsSupported$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cGlyphsSupported$set(MemorySegment seg, long index, int x) {
        tagGLYPHSET.cGlyphsSupported$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cRanges$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cRanges"));
    public static VarHandle cRanges$VH() {
        return tagGLYPHSET.cRanges$VH;
    }
    public static int cRanges$get(MemorySegment seg) {
        return (int)tagGLYPHSET.cRanges$VH.get(seg);
    }
    public static void cRanges$set( MemorySegment seg, int x) {
        tagGLYPHSET.cRanges$VH.set(seg, x);
    }
    public static int cRanges$get(MemorySegment seg, long index) {
        return (int)tagGLYPHSET.cRanges$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cRanges$set(MemorySegment seg, long index, int x) {
        tagGLYPHSET.cRanges$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ranges$slice(MemorySegment seg) {
        return seg.asSlice(16, 4);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


