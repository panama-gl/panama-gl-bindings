// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagSTYLEBUFA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwStyle"),
        MemoryLayout.sequenceLayout(32, Constants$root.C_CHAR$LAYOUT).withName("szDescription")
    ).withName("tagSTYLEBUFA");
    public static MemoryLayout $LAYOUT() {
        return tagSTYLEBUFA.$struct$LAYOUT;
    }
    static final VarHandle dwStyle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwStyle"));
    public static VarHandle dwStyle$VH() {
        return tagSTYLEBUFA.dwStyle$VH;
    }
    public static int dwStyle$get(MemorySegment seg) {
        return (int)tagSTYLEBUFA.dwStyle$VH.get(seg);
    }
    public static void dwStyle$set( MemorySegment seg, int x) {
        tagSTYLEBUFA.dwStyle$VH.set(seg, x);
    }
    public static int dwStyle$get(MemorySegment seg, long index) {
        return (int)tagSTYLEBUFA.dwStyle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwStyle$set(MemorySegment seg, long index, int x) {
        tagSTYLEBUFA.dwStyle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment szDescription$slice(MemorySegment seg) {
        return seg.asSlice(4, 32);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


