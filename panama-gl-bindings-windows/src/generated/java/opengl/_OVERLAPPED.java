// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _OVERLAPPED {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("Internal"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("InternalHigh"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("Offset"),
                Constants$root.C_LONG$LAYOUT.withName("OffsetHigh")
            ).withName("$anon$0"),
            Constants$root.C_POINTER$LAYOUT.withName("Pointer")
        ).withName("$anon$0"),
        Constants$root.C_POINTER$LAYOUT.withName("hEvent")
    ).withName("_OVERLAPPED");
    public static MemoryLayout $LAYOUT() {
        return _OVERLAPPED.$struct$LAYOUT;
    }
    static final VarHandle Internal$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Internal"));
    public static VarHandle Internal$VH() {
        return _OVERLAPPED.Internal$VH;
    }
    public static long Internal$get(MemorySegment seg) {
        return (long)_OVERLAPPED.Internal$VH.get(seg);
    }
    public static void Internal$set( MemorySegment seg, long x) {
        _OVERLAPPED.Internal$VH.set(seg, x);
    }
    public static long Internal$get(MemorySegment seg, long index) {
        return (long)_OVERLAPPED.Internal$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Internal$set(MemorySegment seg, long index, long x) {
        _OVERLAPPED.Internal$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle InternalHigh$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("InternalHigh"));
    public static VarHandle InternalHigh$VH() {
        return _OVERLAPPED.InternalHigh$VH;
    }
    public static long InternalHigh$get(MemorySegment seg) {
        return (long)_OVERLAPPED.InternalHigh$VH.get(seg);
    }
    public static void InternalHigh$set( MemorySegment seg, long x) {
        _OVERLAPPED.InternalHigh$VH.set(seg, x);
    }
    public static long InternalHigh$get(MemorySegment seg, long index) {
        return (long)_OVERLAPPED.InternalHigh$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void InternalHigh$set(MemorySegment seg, long index, long x) {
        _OVERLAPPED.InternalHigh$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Offset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("Offset"));
    public static VarHandle Offset$VH() {
        return _OVERLAPPED.Offset$VH;
    }
    public static int Offset$get(MemorySegment seg) {
        return (int)_OVERLAPPED.Offset$VH.get(seg);
    }
    public static void Offset$set( MemorySegment seg, int x) {
        _OVERLAPPED.Offset$VH.set(seg, x);
    }
    public static int Offset$get(MemorySegment seg, long index) {
        return (int)_OVERLAPPED.Offset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Offset$set(MemorySegment seg, long index, int x) {
        _OVERLAPPED.Offset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle OffsetHigh$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("OffsetHigh"));
    public static VarHandle OffsetHigh$VH() {
        return _OVERLAPPED.OffsetHigh$VH;
    }
    public static int OffsetHigh$get(MemorySegment seg) {
        return (int)_OVERLAPPED.OffsetHigh$VH.get(seg);
    }
    public static void OffsetHigh$set( MemorySegment seg, int x) {
        _OVERLAPPED.OffsetHigh$VH.set(seg, x);
    }
    public static int OffsetHigh$get(MemorySegment seg, long index) {
        return (int)_OVERLAPPED.OffsetHigh$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void OffsetHigh$set(MemorySegment seg, long index, int x) {
        _OVERLAPPED.OffsetHigh$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Pointer$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("Pointer"));
    public static VarHandle Pointer$VH() {
        return _OVERLAPPED.Pointer$VH;
    }
    public static MemoryAddress Pointer$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_OVERLAPPED.Pointer$VH.get(seg);
    }
    public static void Pointer$set( MemorySegment seg, MemoryAddress x) {
        _OVERLAPPED.Pointer$VH.set(seg, x);
    }
    public static MemoryAddress Pointer$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_OVERLAPPED.Pointer$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Pointer$set(MemorySegment seg, long index, MemoryAddress x) {
        _OVERLAPPED.Pointer$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hEvent$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hEvent"));
    public static VarHandle hEvent$VH() {
        return _OVERLAPPED.hEvent$VH;
    }
    public static MemoryAddress hEvent$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_OVERLAPPED.hEvent$VH.get(seg);
    }
    public static void hEvent$set( MemorySegment seg, MemoryAddress x) {
        _OVERLAPPED.hEvent$VH.set(seg, x);
    }
    public static MemoryAddress hEvent$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_OVERLAPPED.hEvent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hEvent$set(MemorySegment seg, long index, MemoryAddress x) {
        _OVERLAPPED.hEvent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


