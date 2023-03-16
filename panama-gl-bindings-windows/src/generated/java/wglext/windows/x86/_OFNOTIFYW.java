// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _OFNOTIFYW {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("hwndFrom"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("idFrom"),
            Constants$root.C_LONG$LAYOUT.withName("code"),
            MemoryLayout.paddingLayout(32)
        ).withName("hdr"),
        Constants$root.C_POINTER$LAYOUT.withName("lpOFN"),
        Constants$root.C_POINTER$LAYOUT.withName("pszFile")
    ).withName("_OFNOTIFYW");
    public static MemoryLayout $LAYOUT() {
        return _OFNOTIFYW.$struct$LAYOUT;
    }
    public static MemorySegment hdr$slice(MemorySegment seg) {
        return seg.asSlice(0, 24);
    }
    static final VarHandle lpOFN$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpOFN"));
    public static VarHandle lpOFN$VH() {
        return _OFNOTIFYW.lpOFN$VH;
    }
    public static MemoryAddress lpOFN$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_OFNOTIFYW.lpOFN$VH.get(seg);
    }
    public static void lpOFN$set( MemorySegment seg, MemoryAddress x) {
        _OFNOTIFYW.lpOFN$VH.set(seg, x);
    }
    public static MemoryAddress lpOFN$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_OFNOTIFYW.lpOFN$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpOFN$set(MemorySegment seg, long index, MemoryAddress x) {
        _OFNOTIFYW.lpOFN$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pszFile$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pszFile"));
    public static VarHandle pszFile$VH() {
        return _OFNOTIFYW.pszFile$VH;
    }
    public static MemoryAddress pszFile$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_OFNOTIFYW.pszFile$VH.get(seg);
    }
    public static void pszFile$set( MemorySegment seg, MemoryAddress x) {
        _OFNOTIFYW.pszFile$VH.set(seg, x);
    }
    public static MemoryAddress pszFile$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_OFNOTIFYW.pszFile$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszFile$set(MemorySegment seg, long index, MemoryAddress x) {
        _OFNOTIFYW.pszFile$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

