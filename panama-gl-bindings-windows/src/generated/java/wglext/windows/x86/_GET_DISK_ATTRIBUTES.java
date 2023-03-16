// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GET_DISK_ATTRIBUTES {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("Reserved1"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("Attributes")
    ).withName("_GET_DISK_ATTRIBUTES");
    public static MemoryLayout $LAYOUT() {
        return _GET_DISK_ATTRIBUTES.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _GET_DISK_ATTRIBUTES.Version$VH;
    }
    public static int Version$get(MemorySegment seg) {
        return (int)_GET_DISK_ATTRIBUTES.Version$VH.get(seg);
    }
    public static void Version$set( MemorySegment seg, int x) {
        _GET_DISK_ATTRIBUTES.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_GET_DISK_ATTRIBUTES.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _GET_DISK_ATTRIBUTES.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Reserved1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reserved1"));
    public static VarHandle Reserved1$VH() {
        return _GET_DISK_ATTRIBUTES.Reserved1$VH;
    }
    public static int Reserved1$get(MemorySegment seg) {
        return (int)_GET_DISK_ATTRIBUTES.Reserved1$VH.get(seg);
    }
    public static void Reserved1$set( MemorySegment seg, int x) {
        _GET_DISK_ATTRIBUTES.Reserved1$VH.set(seg, x);
    }
    public static int Reserved1$get(MemorySegment seg, long index) {
        return (int)_GET_DISK_ATTRIBUTES.Reserved1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved1$set(MemorySegment seg, long index, int x) {
        _GET_DISK_ATTRIBUTES.Reserved1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Attributes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Attributes"));
    public static VarHandle Attributes$VH() {
        return _GET_DISK_ATTRIBUTES.Attributes$VH;
    }
    public static long Attributes$get(MemorySegment seg) {
        return (long)_GET_DISK_ATTRIBUTES.Attributes$VH.get(seg);
    }
    public static void Attributes$set( MemorySegment seg, long x) {
        _GET_DISK_ATTRIBUTES.Attributes$VH.set(seg, x);
    }
    public static long Attributes$get(MemorySegment seg, long index) {
        return (long)_GET_DISK_ATTRIBUTES.Attributes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Attributes$set(MemorySegment seg, long index, long x) {
        _GET_DISK_ATTRIBUTES.Attributes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


