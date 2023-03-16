// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagEMREXTFLOODFILL {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("iType"),
            Constants$root.C_LONG$LAYOUT.withName("nSize")
        ).withName("emr"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("x"),
            Constants$root.C_LONG$LAYOUT.withName("y")
        ).withName("ptlStart"),
        Constants$root.C_LONG$LAYOUT.withName("crColor"),
        Constants$root.C_LONG$LAYOUT.withName("iMode")
    ).withName("tagEMREXTFLOODFILL");
    public static MemoryLayout $LAYOUT() {
        return tagEMREXTFLOODFILL.$struct$LAYOUT;
    }
    public static MemorySegment emr$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static MemorySegment ptlStart$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    static final VarHandle crColor$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("crColor"));
    public static VarHandle crColor$VH() {
        return tagEMREXTFLOODFILL.crColor$VH;
    }
    public static int crColor$get(MemorySegment seg) {
        return (int)tagEMREXTFLOODFILL.crColor$VH.get(seg);
    }
    public static void crColor$set( MemorySegment seg, int x) {
        tagEMREXTFLOODFILL.crColor$VH.set(seg, x);
    }
    public static int crColor$get(MemorySegment seg, long index) {
        return (int)tagEMREXTFLOODFILL.crColor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void crColor$set(MemorySegment seg, long index, int x) {
        tagEMREXTFLOODFILL.crColor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iMode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iMode"));
    public static VarHandle iMode$VH() {
        return tagEMREXTFLOODFILL.iMode$VH;
    }
    public static int iMode$get(MemorySegment seg) {
        return (int)tagEMREXTFLOODFILL.iMode$VH.get(seg);
    }
    public static void iMode$set( MemorySegment seg, int x) {
        tagEMREXTFLOODFILL.iMode$VH.set(seg, x);
    }
    public static int iMode$get(MemorySegment seg, long index) {
        return (int)tagEMREXTFLOODFILL.iMode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iMode$set(MemorySegment seg, long index, int x) {
        tagEMREXTFLOODFILL.iMode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


