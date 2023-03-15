// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _tagAUTHENTICATEINFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwFlags"),
        Constants$root.C_LONG$LAYOUT.withName("dwReserved")
    ).withName("_tagAUTHENTICATEINFO");
    public static MemoryLayout $LAYOUT() {
        return _tagAUTHENTICATEINFO.$struct$LAYOUT;
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return _tagAUTHENTICATEINFO.dwFlags$VH;
    }
    public static int dwFlags$get(MemorySegment seg) {
        return (int)_tagAUTHENTICATEINFO.dwFlags$VH.get(seg);
    }
    public static void dwFlags$set( MemorySegment seg, int x) {
        _tagAUTHENTICATEINFO.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)_tagAUTHENTICATEINFO.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        _tagAUTHENTICATEINFO.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwReserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwReserved"));
    public static VarHandle dwReserved$VH() {
        return _tagAUTHENTICATEINFO.dwReserved$VH;
    }
    public static int dwReserved$get(MemorySegment seg) {
        return (int)_tagAUTHENTICATEINFO.dwReserved$VH.get(seg);
    }
    public static void dwReserved$set( MemorySegment seg, int x) {
        _tagAUTHENTICATEINFO.dwReserved$VH.set(seg, x);
    }
    public static int dwReserved$get(MemorySegment seg, long index) {
        return (int)_tagAUTHENTICATEINFO.dwReserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwReserved$set(MemorySegment seg, long index, int x) {
        _tagAUTHENTICATEINFO.dwReserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


