// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _FILE_STREAM_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("NextEntryOffset"),
        Constants$root.C_LONG$LAYOUT.withName("StreamNameLength"),
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
        ).withName("StreamSize"),
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
        ).withName("StreamAllocationSize"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_SHORT$LAYOUT).withName("StreamName"),
        MemoryLayout.paddingLayout(48)
    ).withName("_FILE_STREAM_INFO");
    public static MemoryLayout $LAYOUT() {
        return _FILE_STREAM_INFO.$struct$LAYOUT;
    }
    static final VarHandle NextEntryOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NextEntryOffset"));
    public static VarHandle NextEntryOffset$VH() {
        return _FILE_STREAM_INFO.NextEntryOffset$VH;
    }
    public static int NextEntryOffset$get(MemorySegment seg) {
        return (int)_FILE_STREAM_INFO.NextEntryOffset$VH.get(seg);
    }
    public static void NextEntryOffset$set( MemorySegment seg, int x) {
        _FILE_STREAM_INFO.NextEntryOffset$VH.set(seg, x);
    }
    public static int NextEntryOffset$get(MemorySegment seg, long index) {
        return (int)_FILE_STREAM_INFO.NextEntryOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NextEntryOffset$set(MemorySegment seg, long index, int x) {
        _FILE_STREAM_INFO.NextEntryOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle StreamNameLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("StreamNameLength"));
    public static VarHandle StreamNameLength$VH() {
        return _FILE_STREAM_INFO.StreamNameLength$VH;
    }
    public static int StreamNameLength$get(MemorySegment seg) {
        return (int)_FILE_STREAM_INFO.StreamNameLength$VH.get(seg);
    }
    public static void StreamNameLength$set( MemorySegment seg, int x) {
        _FILE_STREAM_INFO.StreamNameLength$VH.set(seg, x);
    }
    public static int StreamNameLength$get(MemorySegment seg, long index) {
        return (int)_FILE_STREAM_INFO.StreamNameLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void StreamNameLength$set(MemorySegment seg, long index, int x) {
        _FILE_STREAM_INFO.StreamNameLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment StreamSize$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    public static MemorySegment StreamAllocationSize$slice(MemorySegment seg) {
        return seg.asSlice(16, 8);
    }
    public static MemorySegment StreamName$slice(MemorySegment seg) {
        return seg.asSlice(24, 2);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


