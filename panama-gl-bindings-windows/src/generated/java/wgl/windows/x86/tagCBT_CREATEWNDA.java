// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagCBT_CREATEWNDA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("lpcs"),
        Constants$root.C_POINTER$LAYOUT.withName("hwndInsertAfter")
    ).withName("tagCBT_CREATEWNDA");
    public static MemoryLayout $LAYOUT() {
        return tagCBT_CREATEWNDA.$struct$LAYOUT;
    }
    static final VarHandle lpcs$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpcs"));
    public static VarHandle lpcs$VH() {
        return tagCBT_CREATEWNDA.lpcs$VH;
    }
    public static MemoryAddress lpcs$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagCBT_CREATEWNDA.lpcs$VH.get(seg);
    }
    public static void lpcs$set( MemorySegment seg, MemoryAddress x) {
        tagCBT_CREATEWNDA.lpcs$VH.set(seg, x);
    }
    public static MemoryAddress lpcs$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagCBT_CREATEWNDA.lpcs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpcs$set(MemorySegment seg, long index, MemoryAddress x) {
        tagCBT_CREATEWNDA.lpcs$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hwndInsertAfter$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hwndInsertAfter"));
    public static VarHandle hwndInsertAfter$VH() {
        return tagCBT_CREATEWNDA.hwndInsertAfter$VH;
    }
    public static MemoryAddress hwndInsertAfter$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagCBT_CREATEWNDA.hwndInsertAfter$VH.get(seg);
    }
    public static void hwndInsertAfter$set( MemorySegment seg, MemoryAddress x) {
        tagCBT_CREATEWNDA.hwndInsertAfter$VH.set(seg, x);
    }
    public static MemoryAddress hwndInsertAfter$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagCBT_CREATEWNDA.hwndInsertAfter$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hwndInsertAfter$set(MemorySegment seg, long index, MemoryAddress x) {
        tagCBT_CREATEWNDA.hwndInsertAfter$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


