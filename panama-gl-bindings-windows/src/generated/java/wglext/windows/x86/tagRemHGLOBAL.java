// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagRemHGLOBAL {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("fNullHGlobal"),
        Constants$root.C_LONG$LAYOUT.withName("cbData"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_CHAR$LAYOUT).withName("data"),
        MemoryLayout.paddingLayout(24)
    ).withName("tagRemHGLOBAL");
    public static MemoryLayout $LAYOUT() {
        return tagRemHGLOBAL.$struct$LAYOUT;
    }
    static final VarHandle fNullHGlobal$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fNullHGlobal"));
    public static VarHandle fNullHGlobal$VH() {
        return tagRemHGLOBAL.fNullHGlobal$VH;
    }
    public static int fNullHGlobal$get(MemorySegment seg) {
        return (int)tagRemHGLOBAL.fNullHGlobal$VH.get(seg);
    }
    public static void fNullHGlobal$set( MemorySegment seg, int x) {
        tagRemHGLOBAL.fNullHGlobal$VH.set(seg, x);
    }
    public static int fNullHGlobal$get(MemorySegment seg, long index) {
        return (int)tagRemHGLOBAL.fNullHGlobal$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fNullHGlobal$set(MemorySegment seg, long index, int x) {
        tagRemHGLOBAL.fNullHGlobal$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbData"));
    public static VarHandle cbData$VH() {
        return tagRemHGLOBAL.cbData$VH;
    }
    public static int cbData$get(MemorySegment seg) {
        return (int)tagRemHGLOBAL.cbData$VH.get(seg);
    }
    public static void cbData$set( MemorySegment seg, int x) {
        tagRemHGLOBAL.cbData$VH.set(seg, x);
    }
    public static int cbData$get(MemorySegment seg, long index) {
        return (int)tagRemHGLOBAL.cbData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbData$set(MemorySegment seg, long index, int x) {
        tagRemHGLOBAL.cbData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment data$slice(MemorySegment seg) {
        return seg.asSlice(8, 1);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

