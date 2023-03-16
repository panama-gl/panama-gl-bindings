// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class DISPLAYCONFIG_2DREGION {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cx"),
        Constants$root.C_LONG$LAYOUT.withName("cy")
    ).withName("DISPLAYCONFIG_2DREGION");
    public static MemoryLayout $LAYOUT() {
        return DISPLAYCONFIG_2DREGION.$struct$LAYOUT;
    }
    static final VarHandle cx$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cx"));
    public static VarHandle cx$VH() {
        return DISPLAYCONFIG_2DREGION.cx$VH;
    }
    public static int cx$get(MemorySegment seg) {
        return (int)DISPLAYCONFIG_2DREGION.cx$VH.get(seg);
    }
    public static void cx$set( MemorySegment seg, int x) {
        DISPLAYCONFIG_2DREGION.cx$VH.set(seg, x);
    }
    public static int cx$get(MemorySegment seg, long index) {
        return (int)DISPLAYCONFIG_2DREGION.cx$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cx$set(MemorySegment seg, long index, int x) {
        DISPLAYCONFIG_2DREGION.cx$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cy$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cy"));
    public static VarHandle cy$VH() {
        return DISPLAYCONFIG_2DREGION.cy$VH;
    }
    public static int cy$get(MemorySegment seg) {
        return (int)DISPLAYCONFIG_2DREGION.cy$VH.get(seg);
    }
    public static void cy$set( MemorySegment seg, int x) {
        DISPLAYCONFIG_2DREGION.cy$VH.set(seg, x);
    }
    public static int cy$get(MemorySegment seg, long index) {
        return (int)DISPLAYCONFIG_2DREGION.cy$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cy$set(MemorySegment seg, long index, int x) {
        DISPLAYCONFIG_2DREGION.cy$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

