// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _PSINJECTDATA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("DataBytes"),
        Constants$root.C_SHORT$LAYOUT.withName("InjectionPoint"),
        Constants$root.C_SHORT$LAYOUT.withName("PageNumber")
    ).withName("_PSINJECTDATA");
    public static MemoryLayout $LAYOUT() {
        return _PSINJECTDATA.$struct$LAYOUT;
    }
    static final VarHandle DataBytes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DataBytes"));
    public static VarHandle DataBytes$VH() {
        return _PSINJECTDATA.DataBytes$VH;
    }
    public static int DataBytes$get(MemorySegment seg) {
        return (int)_PSINJECTDATA.DataBytes$VH.get(seg);
    }
    public static void DataBytes$set( MemorySegment seg, int x) {
        _PSINJECTDATA.DataBytes$VH.set(seg, x);
    }
    public static int DataBytes$get(MemorySegment seg, long index) {
        return (int)_PSINJECTDATA.DataBytes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DataBytes$set(MemorySegment seg, long index, int x) {
        _PSINJECTDATA.DataBytes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle InjectionPoint$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("InjectionPoint"));
    public static VarHandle InjectionPoint$VH() {
        return _PSINJECTDATA.InjectionPoint$VH;
    }
    public static short InjectionPoint$get(MemorySegment seg) {
        return (short)_PSINJECTDATA.InjectionPoint$VH.get(seg);
    }
    public static void InjectionPoint$set( MemorySegment seg, short x) {
        _PSINJECTDATA.InjectionPoint$VH.set(seg, x);
    }
    public static short InjectionPoint$get(MemorySegment seg, long index) {
        return (short)_PSINJECTDATA.InjectionPoint$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void InjectionPoint$set(MemorySegment seg, long index, short x) {
        _PSINJECTDATA.InjectionPoint$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle PageNumber$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PageNumber"));
    public static VarHandle PageNumber$VH() {
        return _PSINJECTDATA.PageNumber$VH;
    }
    public static short PageNumber$get(MemorySegment seg) {
        return (short)_PSINJECTDATA.PageNumber$VH.get(seg);
    }
    public static void PageNumber$set( MemorySegment seg, short x) {
        _PSINJECTDATA.PageNumber$VH.set(seg, x);
    }
    public static short PageNumber$get(MemorySegment seg, long index) {
        return (short)_PSINJECTDATA.PageNumber$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PageNumber$set(MemorySegment seg, long index, short x) {
        _PSINJECTDATA.PageNumber$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


