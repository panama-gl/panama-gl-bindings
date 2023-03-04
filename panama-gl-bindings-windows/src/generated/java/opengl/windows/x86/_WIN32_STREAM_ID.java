// Generated by jextract

package opengl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _WIN32_STREAM_ID {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwStreamId"),
        Constants$root.C_LONG$LAYOUT.withName("dwStreamAttributes"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("u"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("QuadPart")
        ).withName("Size"),
        Constants$root.C_LONG$LAYOUT.withName("dwStreamNameSize"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_SHORT$LAYOUT).withName("cStreamName"),
        MemoryLayout.paddingLayout(16)
    ).withName("_WIN32_STREAM_ID");
    public static MemoryLayout $LAYOUT() {
        return _WIN32_STREAM_ID.$struct$LAYOUT;
    }
    static final VarHandle dwStreamId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwStreamId"));
    public static VarHandle dwStreamId$VH() {
        return _WIN32_STREAM_ID.dwStreamId$VH;
    }
    public static int dwStreamId$get(MemorySegment seg) {
        return (int)_WIN32_STREAM_ID.dwStreamId$VH.get(seg);
    }
    public static void dwStreamId$set( MemorySegment seg, int x) {
        _WIN32_STREAM_ID.dwStreamId$VH.set(seg, x);
    }
    public static int dwStreamId$get(MemorySegment seg, long index) {
        return (int)_WIN32_STREAM_ID.dwStreamId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwStreamId$set(MemorySegment seg, long index, int x) {
        _WIN32_STREAM_ID.dwStreamId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwStreamAttributes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwStreamAttributes"));
    public static VarHandle dwStreamAttributes$VH() {
        return _WIN32_STREAM_ID.dwStreamAttributes$VH;
    }
    public static int dwStreamAttributes$get(MemorySegment seg) {
        return (int)_WIN32_STREAM_ID.dwStreamAttributes$VH.get(seg);
    }
    public static void dwStreamAttributes$set( MemorySegment seg, int x) {
        _WIN32_STREAM_ID.dwStreamAttributes$VH.set(seg, x);
    }
    public static int dwStreamAttributes$get(MemorySegment seg, long index) {
        return (int)_WIN32_STREAM_ID.dwStreamAttributes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwStreamAttributes$set(MemorySegment seg, long index, int x) {
        _WIN32_STREAM_ID.dwStreamAttributes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Size$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    static final VarHandle dwStreamNameSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwStreamNameSize"));
    public static VarHandle dwStreamNameSize$VH() {
        return _WIN32_STREAM_ID.dwStreamNameSize$VH;
    }
    public static int dwStreamNameSize$get(MemorySegment seg) {
        return (int)_WIN32_STREAM_ID.dwStreamNameSize$VH.get(seg);
    }
    public static void dwStreamNameSize$set( MemorySegment seg, int x) {
        _WIN32_STREAM_ID.dwStreamNameSize$VH.set(seg, x);
    }
    public static int dwStreamNameSize$get(MemorySegment seg, long index) {
        return (int)_WIN32_STREAM_ID.dwStreamNameSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwStreamNameSize$set(MemorySegment seg, long index, int x) {
        _WIN32_STREAM_ID.dwStreamNameSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment cStreamName$slice(MemorySegment seg) {
        return seg.asSlice(20, 2);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


