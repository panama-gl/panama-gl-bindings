// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class XFontSetExtents {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_SHORT$LAYOUT.withName("x"),
            Constants$root.C_SHORT$LAYOUT.withName("y"),
            Constants$root.C_SHORT$LAYOUT.withName("width"),
            Constants$root.C_SHORT$LAYOUT.withName("height")
        ).withName("max_ink_extent"),
        MemoryLayout.structLayout(
            Constants$root.C_SHORT$LAYOUT.withName("x"),
            Constants$root.C_SHORT$LAYOUT.withName("y"),
            Constants$root.C_SHORT$LAYOUT.withName("width"),
            Constants$root.C_SHORT$LAYOUT.withName("height")
        ).withName("max_logical_extent")
    );
    public static MemoryLayout $LAYOUT() {
        return XFontSetExtents.$struct$LAYOUT;
    }
    public static MemorySegment max_ink_extent$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static MemorySegment max_logical_extent$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

