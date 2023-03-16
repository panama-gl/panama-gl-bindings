// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _UMS_CREATE_THREAD_ATTRIBUTES {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("UmsVersion"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("UmsContext"),
        Constants$root.C_POINTER$LAYOUT.withName("UmsCompletionList")
    ).withName("_UMS_CREATE_THREAD_ATTRIBUTES");
    public static MemoryLayout $LAYOUT() {
        return _UMS_CREATE_THREAD_ATTRIBUTES.$struct$LAYOUT;
    }
    static final VarHandle UmsVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("UmsVersion"));
    public static VarHandle UmsVersion$VH() {
        return _UMS_CREATE_THREAD_ATTRIBUTES.UmsVersion$VH;
    }
    public static int UmsVersion$get(MemorySegment seg) {
        return (int)_UMS_CREATE_THREAD_ATTRIBUTES.UmsVersion$VH.get(seg);
    }
    public static void UmsVersion$set( MemorySegment seg, int x) {
        _UMS_CREATE_THREAD_ATTRIBUTES.UmsVersion$VH.set(seg, x);
    }
    public static int UmsVersion$get(MemorySegment seg, long index) {
        return (int)_UMS_CREATE_THREAD_ATTRIBUTES.UmsVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void UmsVersion$set(MemorySegment seg, long index, int x) {
        _UMS_CREATE_THREAD_ATTRIBUTES.UmsVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle UmsContext$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("UmsContext"));
    public static VarHandle UmsContext$VH() {
        return _UMS_CREATE_THREAD_ATTRIBUTES.UmsContext$VH;
    }
    public static MemoryAddress UmsContext$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_UMS_CREATE_THREAD_ATTRIBUTES.UmsContext$VH.get(seg);
    }
    public static void UmsContext$set( MemorySegment seg, MemoryAddress x) {
        _UMS_CREATE_THREAD_ATTRIBUTES.UmsContext$VH.set(seg, x);
    }
    public static MemoryAddress UmsContext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_UMS_CREATE_THREAD_ATTRIBUTES.UmsContext$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void UmsContext$set(MemorySegment seg, long index, MemoryAddress x) {
        _UMS_CREATE_THREAD_ATTRIBUTES.UmsContext$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle UmsCompletionList$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("UmsCompletionList"));
    public static VarHandle UmsCompletionList$VH() {
        return _UMS_CREATE_THREAD_ATTRIBUTES.UmsCompletionList$VH;
    }
    public static MemoryAddress UmsCompletionList$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_UMS_CREATE_THREAD_ATTRIBUTES.UmsCompletionList$VH.get(seg);
    }
    public static void UmsCompletionList$set( MemorySegment seg, MemoryAddress x) {
        _UMS_CREATE_THREAD_ATTRIBUTES.UmsCompletionList$VH.set(seg, x);
    }
    public static MemoryAddress UmsCompletionList$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_UMS_CREATE_THREAD_ATTRIBUTES.UmsCompletionList$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void UmsCompletionList$set(MemorySegment seg, long index, MemoryAddress x) {
        _UMS_CREATE_THREAD_ATTRIBUTES.UmsCompletionList$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


