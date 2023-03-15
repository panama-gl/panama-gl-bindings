// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _FIND_NAME_BUFFER {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_CHAR$LAYOUT.withName("length"),
        Constants$root.C_CHAR$LAYOUT.withName("access_control"),
        Constants$root.C_CHAR$LAYOUT.withName("frame_control"),
        MemoryLayout.sequenceLayout(6, Constants$root.C_CHAR$LAYOUT).withName("destination_addr"),
        MemoryLayout.sequenceLayout(6, Constants$root.C_CHAR$LAYOUT).withName("source_addr"),
        MemoryLayout.sequenceLayout(18, Constants$root.C_CHAR$LAYOUT).withName("routing_info")
    ).withName("_FIND_NAME_BUFFER");
    public static MemoryLayout $LAYOUT() {
        return _FIND_NAME_BUFFER.$struct$LAYOUT;
    }
    static final VarHandle length$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("length"));
    public static VarHandle length$VH() {
        return _FIND_NAME_BUFFER.length$VH;
    }
    public static byte length$get(MemorySegment seg) {
        return (byte)_FIND_NAME_BUFFER.length$VH.get(seg);
    }
    public static void length$set( MemorySegment seg, byte x) {
        _FIND_NAME_BUFFER.length$VH.set(seg, x);
    }
    public static byte length$get(MemorySegment seg, long index) {
        return (byte)_FIND_NAME_BUFFER.length$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void length$set(MemorySegment seg, long index, byte x) {
        _FIND_NAME_BUFFER.length$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle access_control$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("access_control"));
    public static VarHandle access_control$VH() {
        return _FIND_NAME_BUFFER.access_control$VH;
    }
    public static byte access_control$get(MemorySegment seg) {
        return (byte)_FIND_NAME_BUFFER.access_control$VH.get(seg);
    }
    public static void access_control$set( MemorySegment seg, byte x) {
        _FIND_NAME_BUFFER.access_control$VH.set(seg, x);
    }
    public static byte access_control$get(MemorySegment seg, long index) {
        return (byte)_FIND_NAME_BUFFER.access_control$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void access_control$set(MemorySegment seg, long index, byte x) {
        _FIND_NAME_BUFFER.access_control$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle frame_control$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("frame_control"));
    public static VarHandle frame_control$VH() {
        return _FIND_NAME_BUFFER.frame_control$VH;
    }
    public static byte frame_control$get(MemorySegment seg) {
        return (byte)_FIND_NAME_BUFFER.frame_control$VH.get(seg);
    }
    public static void frame_control$set( MemorySegment seg, byte x) {
        _FIND_NAME_BUFFER.frame_control$VH.set(seg, x);
    }
    public static byte frame_control$get(MemorySegment seg, long index) {
        return (byte)_FIND_NAME_BUFFER.frame_control$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void frame_control$set(MemorySegment seg, long index, byte x) {
        _FIND_NAME_BUFFER.frame_control$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment destination_addr$slice(MemorySegment seg) {
        return seg.asSlice(3, 6);
    }
    public static MemorySegment source_addr$slice(MemorySegment seg) {
        return seg.asSlice(9, 6);
    }
    public static MemorySegment routing_info$slice(MemorySegment seg) {
        return seg.asSlice(15, 18);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


