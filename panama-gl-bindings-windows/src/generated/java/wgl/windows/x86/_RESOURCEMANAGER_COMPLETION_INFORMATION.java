// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _RESOURCEMANAGER_COMPLETION_INFORMATION {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("IoCompletionPortHandle"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("CompletionKey")
    ).withName("_RESOURCEMANAGER_COMPLETION_INFORMATION");
    public static MemoryLayout $LAYOUT() {
        return _RESOURCEMANAGER_COMPLETION_INFORMATION.$struct$LAYOUT;
    }
    static final VarHandle IoCompletionPortHandle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("IoCompletionPortHandle"));
    public static VarHandle IoCompletionPortHandle$VH() {
        return _RESOURCEMANAGER_COMPLETION_INFORMATION.IoCompletionPortHandle$VH;
    }
    public static MemoryAddress IoCompletionPortHandle$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_RESOURCEMANAGER_COMPLETION_INFORMATION.IoCompletionPortHandle$VH.get(seg);
    }
    public static void IoCompletionPortHandle$set( MemorySegment seg, MemoryAddress x) {
        _RESOURCEMANAGER_COMPLETION_INFORMATION.IoCompletionPortHandle$VH.set(seg, x);
    }
    public static MemoryAddress IoCompletionPortHandle$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_RESOURCEMANAGER_COMPLETION_INFORMATION.IoCompletionPortHandle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void IoCompletionPortHandle$set(MemorySegment seg, long index, MemoryAddress x) {
        _RESOURCEMANAGER_COMPLETION_INFORMATION.IoCompletionPortHandle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle CompletionKey$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CompletionKey"));
    public static VarHandle CompletionKey$VH() {
        return _RESOURCEMANAGER_COMPLETION_INFORMATION.CompletionKey$VH;
    }
    public static long CompletionKey$get(MemorySegment seg) {
        return (long)_RESOURCEMANAGER_COMPLETION_INFORMATION.CompletionKey$VH.get(seg);
    }
    public static void CompletionKey$set( MemorySegment seg, long x) {
        _RESOURCEMANAGER_COMPLETION_INFORMATION.CompletionKey$VH.set(seg, x);
    }
    public static long CompletionKey$get(MemorySegment seg, long index) {
        return (long)_RESOURCEMANAGER_COMPLETION_INFORMATION.CompletionKey$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CompletionKey$set(MemorySegment seg, long index, long x) {
        _RESOURCEMANAGER_COMPLETION_INFORMATION.CompletionKey$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


