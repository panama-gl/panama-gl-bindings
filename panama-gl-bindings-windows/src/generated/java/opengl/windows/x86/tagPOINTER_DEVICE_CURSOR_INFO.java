// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagPOINTER_DEVICE_CURSOR_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cursorId"),
        Constants$root.C_LONG$LAYOUT.withName("cursor")
    ).withName("tagPOINTER_DEVICE_CURSOR_INFO");
    public static MemoryLayout $LAYOUT() {
        return tagPOINTER_DEVICE_CURSOR_INFO.$struct$LAYOUT;
    }
    static final VarHandle cursorId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cursorId"));
    public static VarHandle cursorId$VH() {
        return tagPOINTER_DEVICE_CURSOR_INFO.cursorId$VH;
    }
    public static int cursorId$get(MemorySegment seg) {
        return (int)tagPOINTER_DEVICE_CURSOR_INFO.cursorId$VH.get(seg);
    }
    public static void cursorId$set( MemorySegment seg, int x) {
        tagPOINTER_DEVICE_CURSOR_INFO.cursorId$VH.set(seg, x);
    }
    public static int cursorId$get(MemorySegment seg, long index) {
        return (int)tagPOINTER_DEVICE_CURSOR_INFO.cursorId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cursorId$set(MemorySegment seg, long index, int x) {
        tagPOINTER_DEVICE_CURSOR_INFO.cursorId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cursor$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cursor"));
    public static VarHandle cursor$VH() {
        return tagPOINTER_DEVICE_CURSOR_INFO.cursor$VH;
    }
    public static int cursor$get(MemorySegment seg) {
        return (int)tagPOINTER_DEVICE_CURSOR_INFO.cursor$VH.get(seg);
    }
    public static void cursor$set( MemorySegment seg, int x) {
        tagPOINTER_DEVICE_CURSOR_INFO.cursor$VH.set(seg, x);
    }
    public static int cursor$get(MemorySegment seg, long index) {
        return (int)tagPOINTER_DEVICE_CURSOR_INFO.cursor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cursor$set(MemorySegment seg, long index, int x) {
        tagPOINTER_DEVICE_CURSOR_INFO.cursor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


