// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _SUPPORTED_OS_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("MajorVersion"),
        Constants$root.C_SHORT$LAYOUT.withName("MinorVersion")
    ).withName("_SUPPORTED_OS_INFO");
    public static MemoryLayout $LAYOUT() {
        return _SUPPORTED_OS_INFO.$struct$LAYOUT;
    }
    static final VarHandle MajorVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MajorVersion"));
    public static VarHandle MajorVersion$VH() {
        return _SUPPORTED_OS_INFO.MajorVersion$VH;
    }
    public static short MajorVersion$get(MemorySegment seg) {
        return (short)_SUPPORTED_OS_INFO.MajorVersion$VH.get(seg);
    }
    public static void MajorVersion$set( MemorySegment seg, short x) {
        _SUPPORTED_OS_INFO.MajorVersion$VH.set(seg, x);
    }
    public static short MajorVersion$get(MemorySegment seg, long index) {
        return (short)_SUPPORTED_OS_INFO.MajorVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MajorVersion$set(MemorySegment seg, long index, short x) {
        _SUPPORTED_OS_INFO.MajorVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MinorVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MinorVersion"));
    public static VarHandle MinorVersion$VH() {
        return _SUPPORTED_OS_INFO.MinorVersion$VH;
    }
    public static short MinorVersion$get(MemorySegment seg) {
        return (short)_SUPPORTED_OS_INFO.MinorVersion$VH.get(seg);
    }
    public static void MinorVersion$set( MemorySegment seg, short x) {
        _SUPPORTED_OS_INFO.MinorVersion$VH.set(seg, x);
    }
    public static short MinorVersion$get(MemorySegment seg, long index) {
        return (short)_SUPPORTED_OS_INFO.MinorVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MinorVersion$set(MemorySegment seg, long index, short x) {
        _SUPPORTED_OS_INFO.MinorVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


