// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagRPC_ERROR_ENUM_HANDLE {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Signature"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("CurrentPos"),
        Constants$root.C_POINTER$LAYOUT.withName("Head")
    ).withName("tagRPC_ERROR_ENUM_HANDLE");
    public static MemoryLayout $LAYOUT() {
        return tagRPC_ERROR_ENUM_HANDLE.$struct$LAYOUT;
    }
    static final VarHandle Signature$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Signature"));
    public static VarHandle Signature$VH() {
        return tagRPC_ERROR_ENUM_HANDLE.Signature$VH;
    }
    public static int Signature$get(MemorySegment seg) {
        return (int)tagRPC_ERROR_ENUM_HANDLE.Signature$VH.get(seg);
    }
    public static void Signature$set( MemorySegment seg, int x) {
        tagRPC_ERROR_ENUM_HANDLE.Signature$VH.set(seg, x);
    }
    public static int Signature$get(MemorySegment seg, long index) {
        return (int)tagRPC_ERROR_ENUM_HANDLE.Signature$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Signature$set(MemorySegment seg, long index, int x) {
        tagRPC_ERROR_ENUM_HANDLE.Signature$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle CurrentPos$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CurrentPos"));
    public static VarHandle CurrentPos$VH() {
        return tagRPC_ERROR_ENUM_HANDLE.CurrentPos$VH;
    }
    public static MemoryAddress CurrentPos$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagRPC_ERROR_ENUM_HANDLE.CurrentPos$VH.get(seg);
    }
    public static void CurrentPos$set( MemorySegment seg, MemoryAddress x) {
        tagRPC_ERROR_ENUM_HANDLE.CurrentPos$VH.set(seg, x);
    }
    public static MemoryAddress CurrentPos$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagRPC_ERROR_ENUM_HANDLE.CurrentPos$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CurrentPos$set(MemorySegment seg, long index, MemoryAddress x) {
        tagRPC_ERROR_ENUM_HANDLE.CurrentPos$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Head$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Head"));
    public static VarHandle Head$VH() {
        return tagRPC_ERROR_ENUM_HANDLE.Head$VH;
    }
    public static MemoryAddress Head$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagRPC_ERROR_ENUM_HANDLE.Head$VH.get(seg);
    }
    public static void Head$set( MemorySegment seg, MemoryAddress x) {
        tagRPC_ERROR_ENUM_HANDLE.Head$VH.set(seg, x);
    }
    public static MemoryAddress Head$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagRPC_ERROR_ENUM_HANDLE.Head$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Head$set(MemorySegment seg, long index, MemoryAddress x) {
        tagRPC_ERROR_ENUM_HANDLE.Head$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


