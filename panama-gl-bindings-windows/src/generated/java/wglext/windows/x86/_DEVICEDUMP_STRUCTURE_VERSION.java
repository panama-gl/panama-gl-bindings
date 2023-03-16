// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _DEVICEDUMP_STRUCTURE_VERSION {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwSignature"),
        Constants$root.C_LONG$LAYOUT.withName("dwVersion"),
        Constants$root.C_LONG$LAYOUT.withName("dwSize")
    ).withName("_DEVICEDUMP_STRUCTURE_VERSION");
    public static MemoryLayout $LAYOUT() {
        return _DEVICEDUMP_STRUCTURE_VERSION.$struct$LAYOUT;
    }
    static final VarHandle dwSignature$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwSignature"));
    public static VarHandle dwSignature$VH() {
        return _DEVICEDUMP_STRUCTURE_VERSION.dwSignature$VH;
    }
    public static int dwSignature$get(MemorySegment seg) {
        return (int)_DEVICEDUMP_STRUCTURE_VERSION.dwSignature$VH.get(seg);
    }
    public static void dwSignature$set( MemorySegment seg, int x) {
        _DEVICEDUMP_STRUCTURE_VERSION.dwSignature$VH.set(seg, x);
    }
    public static int dwSignature$get(MemorySegment seg, long index) {
        return (int)_DEVICEDUMP_STRUCTURE_VERSION.dwSignature$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSignature$set(MemorySegment seg, long index, int x) {
        _DEVICEDUMP_STRUCTURE_VERSION.dwSignature$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwVersion"));
    public static VarHandle dwVersion$VH() {
        return _DEVICEDUMP_STRUCTURE_VERSION.dwVersion$VH;
    }
    public static int dwVersion$get(MemorySegment seg) {
        return (int)_DEVICEDUMP_STRUCTURE_VERSION.dwVersion$VH.get(seg);
    }
    public static void dwVersion$set( MemorySegment seg, int x) {
        _DEVICEDUMP_STRUCTURE_VERSION.dwVersion$VH.set(seg, x);
    }
    public static int dwVersion$get(MemorySegment seg, long index) {
        return (int)_DEVICEDUMP_STRUCTURE_VERSION.dwVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwVersion$set(MemorySegment seg, long index, int x) {
        _DEVICEDUMP_STRUCTURE_VERSION.dwVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwSize"));
    public static VarHandle dwSize$VH() {
        return _DEVICEDUMP_STRUCTURE_VERSION.dwSize$VH;
    }
    public static int dwSize$get(MemorySegment seg) {
        return (int)_DEVICEDUMP_STRUCTURE_VERSION.dwSize$VH.get(seg);
    }
    public static void dwSize$set( MemorySegment seg, int x) {
        _DEVICEDUMP_STRUCTURE_VERSION.dwSize$VH.set(seg, x);
    }
    public static int dwSize$get(MemorySegment seg, long index) {
        return (int)_DEVICEDUMP_STRUCTURE_VERSION.dwSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSize$set(MemorySegment seg, long index, int x) {
        _DEVICEDUMP_STRUCTURE_VERSION.dwSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


