// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagTITLEBARINFOEX {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("left"),
            Constants$root.C_LONG$LAYOUT.withName("top"),
            Constants$root.C_LONG$LAYOUT.withName("right"),
            Constants$root.C_LONG$LAYOUT.withName("bottom")
        ).withName("rcTitleBar"),
        MemoryLayout.sequenceLayout(6, Constants$root.C_LONG$LAYOUT).withName("rgstate"),
        MemoryLayout.sequenceLayout(6, MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("left"),
            Constants$root.C_LONG$LAYOUT.withName("top"),
            Constants$root.C_LONG$LAYOUT.withName("right"),
            Constants$root.C_LONG$LAYOUT.withName("bottom")
        ).withName("tagRECT")).withName("rgrect")
    ).withName("tagTITLEBARINFOEX");
    public static MemoryLayout $LAYOUT() {
        return tagTITLEBARINFOEX.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return tagTITLEBARINFOEX.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)tagTITLEBARINFOEX.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        tagTITLEBARINFOEX.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)tagTITLEBARINFOEX.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        tagTITLEBARINFOEX.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment rcTitleBar$slice(MemorySegment seg) {
        return seg.asSlice(4, 16);
    }
    public static MemorySegment rgstate$slice(MemorySegment seg) {
        return seg.asSlice(20, 24);
    }
    public static MemorySegment rgrect$slice(MemorySegment seg) {
        return seg.asSlice(44, 96);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


