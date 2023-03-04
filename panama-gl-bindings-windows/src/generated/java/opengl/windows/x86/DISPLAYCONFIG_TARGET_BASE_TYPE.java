// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class DISPLAYCONFIG_TARGET_BASE_TYPE {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("type"),
            Constants$root.C_LONG$LAYOUT.withName("size"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("adapterId"),
            Constants$root.C_LONG$LAYOUT.withName("id")
        ).withName("header"),
        Constants$root.C_LONG$LAYOUT.withName("baseOutputTechnology")
    ).withName("DISPLAYCONFIG_TARGET_BASE_TYPE");
    public static MemoryLayout $LAYOUT() {
        return DISPLAYCONFIG_TARGET_BASE_TYPE.$struct$LAYOUT;
    }
    public static MemorySegment header$slice(MemorySegment seg) {
        return seg.asSlice(0, 20);
    }
    static final VarHandle baseOutputTechnology$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("baseOutputTechnology"));
    public static VarHandle baseOutputTechnology$VH() {
        return DISPLAYCONFIG_TARGET_BASE_TYPE.baseOutputTechnology$VH;
    }
    public static int baseOutputTechnology$get(MemorySegment seg) {
        return (int)DISPLAYCONFIG_TARGET_BASE_TYPE.baseOutputTechnology$VH.get(seg);
    }
    public static void baseOutputTechnology$set( MemorySegment seg, int x) {
        DISPLAYCONFIG_TARGET_BASE_TYPE.baseOutputTechnology$VH.set(seg, x);
    }
    public static int baseOutputTechnology$get(MemorySegment seg, long index) {
        return (int)DISPLAYCONFIG_TARGET_BASE_TYPE.baseOutputTechnology$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void baseOutputTechnology$set(MemorySegment seg, long index, int x) {
        DISPLAYCONFIG_TARGET_BASE_TYPE.baseOutputTechnology$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


