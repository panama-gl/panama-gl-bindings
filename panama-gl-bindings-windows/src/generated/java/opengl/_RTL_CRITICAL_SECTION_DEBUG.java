// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _RTL_CRITICAL_SECTION_DEBUG {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("Type"),
        Constants$root.C_SHORT$LAYOUT.withName("CreatorBackTraceIndex"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("CriticalSection"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("Flink"),
            Constants$root.C_POINTER$LAYOUT.withName("Blink")
        ).withName("ProcessLocksList"),
        Constants$root.C_LONG$LAYOUT.withName("EntryCount"),
        Constants$root.C_LONG$LAYOUT.withName("ContentionCount"),
        Constants$root.C_LONG$LAYOUT.withName("Flags"),
        Constants$root.C_SHORT$LAYOUT.withName("CreatorBackTraceIndexHigh"),
        Constants$root.C_SHORT$LAYOUT.withName("SpareWORD")
    ).withName("_RTL_CRITICAL_SECTION_DEBUG");
    public static MemoryLayout $LAYOUT() {
        return _RTL_CRITICAL_SECTION_DEBUG.$struct$LAYOUT;
    }
    static final VarHandle Type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Type"));
    public static VarHandle Type$VH() {
        return _RTL_CRITICAL_SECTION_DEBUG.Type$VH;
    }
    public static short Type$get(MemorySegment seg) {
        return (short)_RTL_CRITICAL_SECTION_DEBUG.Type$VH.get(seg);
    }
    public static void Type$set( MemorySegment seg, short x) {
        _RTL_CRITICAL_SECTION_DEBUG.Type$VH.set(seg, x);
    }
    public static short Type$get(MemorySegment seg, long index) {
        return (short)_RTL_CRITICAL_SECTION_DEBUG.Type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Type$set(MemorySegment seg, long index, short x) {
        _RTL_CRITICAL_SECTION_DEBUG.Type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle CreatorBackTraceIndex$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CreatorBackTraceIndex"));
    public static VarHandle CreatorBackTraceIndex$VH() {
        return _RTL_CRITICAL_SECTION_DEBUG.CreatorBackTraceIndex$VH;
    }
    public static short CreatorBackTraceIndex$get(MemorySegment seg) {
        return (short)_RTL_CRITICAL_SECTION_DEBUG.CreatorBackTraceIndex$VH.get(seg);
    }
    public static void CreatorBackTraceIndex$set( MemorySegment seg, short x) {
        _RTL_CRITICAL_SECTION_DEBUG.CreatorBackTraceIndex$VH.set(seg, x);
    }
    public static short CreatorBackTraceIndex$get(MemorySegment seg, long index) {
        return (short)_RTL_CRITICAL_SECTION_DEBUG.CreatorBackTraceIndex$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CreatorBackTraceIndex$set(MemorySegment seg, long index, short x) {
        _RTL_CRITICAL_SECTION_DEBUG.CreatorBackTraceIndex$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle CriticalSection$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CriticalSection"));
    public static VarHandle CriticalSection$VH() {
        return _RTL_CRITICAL_SECTION_DEBUG.CriticalSection$VH;
    }
    public static MemoryAddress CriticalSection$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_RTL_CRITICAL_SECTION_DEBUG.CriticalSection$VH.get(seg);
    }
    public static void CriticalSection$set( MemorySegment seg, MemoryAddress x) {
        _RTL_CRITICAL_SECTION_DEBUG.CriticalSection$VH.set(seg, x);
    }
    public static MemoryAddress CriticalSection$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_RTL_CRITICAL_SECTION_DEBUG.CriticalSection$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CriticalSection$set(MemorySegment seg, long index, MemoryAddress x) {
        _RTL_CRITICAL_SECTION_DEBUG.CriticalSection$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ProcessLocksList$slice(MemorySegment seg) {
        return seg.asSlice(16, 16);
    }
    static final VarHandle EntryCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("EntryCount"));
    public static VarHandle EntryCount$VH() {
        return _RTL_CRITICAL_SECTION_DEBUG.EntryCount$VH;
    }
    public static int EntryCount$get(MemorySegment seg) {
        return (int)_RTL_CRITICAL_SECTION_DEBUG.EntryCount$VH.get(seg);
    }
    public static void EntryCount$set( MemorySegment seg, int x) {
        _RTL_CRITICAL_SECTION_DEBUG.EntryCount$VH.set(seg, x);
    }
    public static int EntryCount$get(MemorySegment seg, long index) {
        return (int)_RTL_CRITICAL_SECTION_DEBUG.EntryCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void EntryCount$set(MemorySegment seg, long index, int x) {
        _RTL_CRITICAL_SECTION_DEBUG.EntryCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ContentionCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ContentionCount"));
    public static VarHandle ContentionCount$VH() {
        return _RTL_CRITICAL_SECTION_DEBUG.ContentionCount$VH;
    }
    public static int ContentionCount$get(MemorySegment seg) {
        return (int)_RTL_CRITICAL_SECTION_DEBUG.ContentionCount$VH.get(seg);
    }
    public static void ContentionCount$set( MemorySegment seg, int x) {
        _RTL_CRITICAL_SECTION_DEBUG.ContentionCount$VH.set(seg, x);
    }
    public static int ContentionCount$get(MemorySegment seg, long index) {
        return (int)_RTL_CRITICAL_SECTION_DEBUG.ContentionCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ContentionCount$set(MemorySegment seg, long index, int x) {
        _RTL_CRITICAL_SECTION_DEBUG.ContentionCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _RTL_CRITICAL_SECTION_DEBUG.Flags$VH;
    }
    public static int Flags$get(MemorySegment seg) {
        return (int)_RTL_CRITICAL_SECTION_DEBUG.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, int x) {
        _RTL_CRITICAL_SECTION_DEBUG.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_RTL_CRITICAL_SECTION_DEBUG.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _RTL_CRITICAL_SECTION_DEBUG.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle CreatorBackTraceIndexHigh$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CreatorBackTraceIndexHigh"));
    public static VarHandle CreatorBackTraceIndexHigh$VH() {
        return _RTL_CRITICAL_SECTION_DEBUG.CreatorBackTraceIndexHigh$VH;
    }
    public static short CreatorBackTraceIndexHigh$get(MemorySegment seg) {
        return (short)_RTL_CRITICAL_SECTION_DEBUG.CreatorBackTraceIndexHigh$VH.get(seg);
    }
    public static void CreatorBackTraceIndexHigh$set( MemorySegment seg, short x) {
        _RTL_CRITICAL_SECTION_DEBUG.CreatorBackTraceIndexHigh$VH.set(seg, x);
    }
    public static short CreatorBackTraceIndexHigh$get(MemorySegment seg, long index) {
        return (short)_RTL_CRITICAL_SECTION_DEBUG.CreatorBackTraceIndexHigh$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CreatorBackTraceIndexHigh$set(MemorySegment seg, long index, short x) {
        _RTL_CRITICAL_SECTION_DEBUG.CreatorBackTraceIndexHigh$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SpareWORD$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SpareWORD"));
    public static VarHandle SpareWORD$VH() {
        return _RTL_CRITICAL_SECTION_DEBUG.SpareWORD$VH;
    }
    public static short SpareWORD$get(MemorySegment seg) {
        return (short)_RTL_CRITICAL_SECTION_DEBUG.SpareWORD$VH.get(seg);
    }
    public static void SpareWORD$set( MemorySegment seg, short x) {
        _RTL_CRITICAL_SECTION_DEBUG.SpareWORD$VH.set(seg, x);
    }
    public static short SpareWORD$get(MemorySegment seg, long index) {
        return (short)_RTL_CRITICAL_SECTION_DEBUG.SpareWORD$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SpareWORD$set(MemorySegment seg, long index, short x) {
        _RTL_CRITICAL_SECTION_DEBUG.SpareWORD$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


