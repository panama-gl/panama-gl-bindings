// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _XSTATE_CONTEXT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("Mask"),
        Constants$root.C_LONG$LAYOUT.withName("Length"),
        Constants$root.C_LONG$LAYOUT.withName("Reserved1"),
        Constants$root.C_POINTER$LAYOUT.withName("Area"),
        Constants$root.C_POINTER$LAYOUT.withName("Buffer")
    ).withName("_XSTATE_CONTEXT");
    public static MemoryLayout $LAYOUT() {
        return _XSTATE_CONTEXT.$struct$LAYOUT;
    }
    static final VarHandle Mask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Mask"));
    public static VarHandle Mask$VH() {
        return _XSTATE_CONTEXT.Mask$VH;
    }
    public static long Mask$get(MemorySegment seg) {
        return (long)_XSTATE_CONTEXT.Mask$VH.get(seg);
    }
    public static void Mask$set( MemorySegment seg, long x) {
        _XSTATE_CONTEXT.Mask$VH.set(seg, x);
    }
    public static long Mask$get(MemorySegment seg, long index) {
        return (long)_XSTATE_CONTEXT.Mask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Mask$set(MemorySegment seg, long index, long x) {
        _XSTATE_CONTEXT.Mask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Length$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Length"));
    public static VarHandle Length$VH() {
        return _XSTATE_CONTEXT.Length$VH;
    }
    public static int Length$get(MemorySegment seg) {
        return (int)_XSTATE_CONTEXT.Length$VH.get(seg);
    }
    public static void Length$set( MemorySegment seg, int x) {
        _XSTATE_CONTEXT.Length$VH.set(seg, x);
    }
    public static int Length$get(MemorySegment seg, long index) {
        return (int)_XSTATE_CONTEXT.Length$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Length$set(MemorySegment seg, long index, int x) {
        _XSTATE_CONTEXT.Length$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Reserved1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reserved1"));
    public static VarHandle Reserved1$VH() {
        return _XSTATE_CONTEXT.Reserved1$VH;
    }
    public static int Reserved1$get(MemorySegment seg) {
        return (int)_XSTATE_CONTEXT.Reserved1$VH.get(seg);
    }
    public static void Reserved1$set( MemorySegment seg, int x) {
        _XSTATE_CONTEXT.Reserved1$VH.set(seg, x);
    }
    public static int Reserved1$get(MemorySegment seg, long index) {
        return (int)_XSTATE_CONTEXT.Reserved1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved1$set(MemorySegment seg, long index, int x) {
        _XSTATE_CONTEXT.Reserved1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Area$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Area"));
    public static VarHandle Area$VH() {
        return _XSTATE_CONTEXT.Area$VH;
    }
    public static MemoryAddress Area$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_XSTATE_CONTEXT.Area$VH.get(seg);
    }
    public static void Area$set( MemorySegment seg, MemoryAddress x) {
        _XSTATE_CONTEXT.Area$VH.set(seg, x);
    }
    public static MemoryAddress Area$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_XSTATE_CONTEXT.Area$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Area$set(MemorySegment seg, long index, MemoryAddress x) {
        _XSTATE_CONTEXT.Area$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Buffer$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Buffer"));
    public static VarHandle Buffer$VH() {
        return _XSTATE_CONTEXT.Buffer$VH;
    }
    public static MemoryAddress Buffer$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_XSTATE_CONTEXT.Buffer$VH.get(seg);
    }
    public static void Buffer$set( MemorySegment seg, MemoryAddress x) {
        _XSTATE_CONTEXT.Buffer$VH.set(seg, x);
    }
    public static MemoryAddress Buffer$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_XSTATE_CONTEXT.Buffer$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Buffer$set(MemorySegment seg, long index, MemoryAddress x) {
        _XSTATE_CONTEXT.Buffer$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


