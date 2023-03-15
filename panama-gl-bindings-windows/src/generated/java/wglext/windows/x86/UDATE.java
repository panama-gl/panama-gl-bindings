// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class UDATE {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_SHORT$LAYOUT.withName("wYear"),
            Constants$root.C_SHORT$LAYOUT.withName("wMonth"),
            Constants$root.C_SHORT$LAYOUT.withName("wDayOfWeek"),
            Constants$root.C_SHORT$LAYOUT.withName("wDay"),
            Constants$root.C_SHORT$LAYOUT.withName("wHour"),
            Constants$root.C_SHORT$LAYOUT.withName("wMinute"),
            Constants$root.C_SHORT$LAYOUT.withName("wSecond"),
            Constants$root.C_SHORT$LAYOUT.withName("wMilliseconds")
        ).withName("st"),
        Constants$root.C_SHORT$LAYOUT.withName("wDayOfYear")
    );
    public static MemoryLayout $LAYOUT() {
        return UDATE.$struct$LAYOUT;
    }
    public static MemorySegment st$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final VarHandle wDayOfYear$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wDayOfYear"));
    public static VarHandle wDayOfYear$VH() {
        return UDATE.wDayOfYear$VH;
    }
    public static short wDayOfYear$get(MemorySegment seg) {
        return (short)UDATE.wDayOfYear$VH.get(seg);
    }
    public static void wDayOfYear$set( MemorySegment seg, short x) {
        UDATE.wDayOfYear$VH.set(seg, x);
    }
    public static short wDayOfYear$get(MemorySegment seg, long index) {
        return (short)UDATE.wDayOfYear$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wDayOfYear$set(MemorySegment seg, long index, short x) {
        UDATE.wDayOfYear$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


