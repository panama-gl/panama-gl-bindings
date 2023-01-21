// Generated by jextract

package glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class __GLXEvent {

    static final  GroupLayout $union$LAYOUT = MemoryLayout.unionLayout(
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("event_type"),
            Constants$root.C_INT$LAYOUT.withName("draw_type"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("serial"),
            Constants$root.C_INT$LAYOUT.withName("send_event"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_POINTER$LAYOUT.withName("display"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("drawable"),
            Constants$root.C_INT$LAYOUT.withName("buffer_mask"),
            Constants$root.C_INT$LAYOUT.withName("aux_buffer"),
            Constants$root.C_INT$LAYOUT.withName("x"),
            Constants$root.C_INT$LAYOUT.withName("y"),
            Constants$root.C_INT$LAYOUT.withName("width"),
            Constants$root.C_INT$LAYOUT.withName("height"),
            Constants$root.C_INT$LAYOUT.withName("count"),
            MemoryLayout.paddingLayout(32)
        ).withName("glxpbufferclobber"),
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("type"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_LONG_LONG$LAYOUT.withName("serial"),
            Constants$root.C_INT$LAYOUT.withName("send_event"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_POINTER$LAYOUT.withName("display"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("drawable"),
            Constants$root.C_INT$LAYOUT.withName("event_type"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_LONG_LONG$LAYOUT.withName("ust"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("msc"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("sbc")
        ).withName("glxbufferswapcomplete"),
        MemoryLayout.sequenceLayout(24, Constants$root.C_LONG_LONG$LAYOUT).withName("pad")
    ).withName("__GLXEvent");
    public static MemoryLayout $LAYOUT() {
        return __GLXEvent.$union$LAYOUT;
    }
    public static MemorySegment glxpbufferclobber$slice(MemorySegment seg) {
        return seg.asSlice(0, 72);
    }
    public static MemorySegment glxbufferswapcomplete$slice(MemorySegment seg) {
        return seg.asSlice(0, 72);
    }
    public static MemorySegment pad$slice(MemorySegment seg) {
        return seg.asSlice(0, 192);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

