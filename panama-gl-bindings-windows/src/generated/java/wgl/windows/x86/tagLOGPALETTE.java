// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagLOGPALETTE {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("palVersion"),
        Constants$root.C_SHORT$LAYOUT.withName("palNumEntries"),
        MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
            Constants$root.C_CHAR$LAYOUT.withName("peRed"),
            Constants$root.C_CHAR$LAYOUT.withName("peGreen"),
            Constants$root.C_CHAR$LAYOUT.withName("peBlue"),
            Constants$root.C_CHAR$LAYOUT.withName("peFlags")
        ).withName("tagPALETTEENTRY")).withName("palPalEntry")
    ).withName("tagLOGPALETTE");
    public static MemoryLayout $LAYOUT() {
        return tagLOGPALETTE.$struct$LAYOUT;
    }
    static final VarHandle palVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("palVersion"));
    public static VarHandle palVersion$VH() {
        return tagLOGPALETTE.palVersion$VH;
    }
    public static short palVersion$get(MemorySegment seg) {
        return (short)tagLOGPALETTE.palVersion$VH.get(seg);
    }
    public static void palVersion$set( MemorySegment seg, short x) {
        tagLOGPALETTE.palVersion$VH.set(seg, x);
    }
    public static short palVersion$get(MemorySegment seg, long index) {
        return (short)tagLOGPALETTE.palVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void palVersion$set(MemorySegment seg, long index, short x) {
        tagLOGPALETTE.palVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle palNumEntries$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("palNumEntries"));
    public static VarHandle palNumEntries$VH() {
        return tagLOGPALETTE.palNumEntries$VH;
    }
    public static short palNumEntries$get(MemorySegment seg) {
        return (short)tagLOGPALETTE.palNumEntries$VH.get(seg);
    }
    public static void palNumEntries$set( MemorySegment seg, short x) {
        tagLOGPALETTE.palNumEntries$VH.set(seg, x);
    }
    public static short palNumEntries$get(MemorySegment seg, long index) {
        return (short)tagLOGPALETTE.palNumEntries$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void palNumEntries$set(MemorySegment seg, long index, short x) {
        tagLOGPALETTE.palNumEntries$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment palPalEntry$slice(MemorySegment seg) {
        return seg.asSlice(4, 4);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


