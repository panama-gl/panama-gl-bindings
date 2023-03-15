// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagEMRSETCOLORADJUSTMENT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("iType"),
            Constants$root.C_LONG$LAYOUT.withName("nSize")
        ).withName("emr"),
        MemoryLayout.structLayout(
            Constants$root.C_SHORT$LAYOUT.withName("caSize"),
            Constants$root.C_SHORT$LAYOUT.withName("caFlags"),
            Constants$root.C_SHORT$LAYOUT.withName("caIlluminantIndex"),
            Constants$root.C_SHORT$LAYOUT.withName("caRedGamma"),
            Constants$root.C_SHORT$LAYOUT.withName("caGreenGamma"),
            Constants$root.C_SHORT$LAYOUT.withName("caBlueGamma"),
            Constants$root.C_SHORT$LAYOUT.withName("caReferenceBlack"),
            Constants$root.C_SHORT$LAYOUT.withName("caReferenceWhite"),
            Constants$root.C_SHORT$LAYOUT.withName("caContrast"),
            Constants$root.C_SHORT$LAYOUT.withName("caBrightness"),
            Constants$root.C_SHORT$LAYOUT.withName("caColorfulness"),
            Constants$root.C_SHORT$LAYOUT.withName("caRedGreenTint")
        ).withName("ColorAdjustment")
    ).withName("tagEMRSETCOLORADJUSTMENT");
    public static MemoryLayout $LAYOUT() {
        return tagEMRSETCOLORADJUSTMENT.$struct$LAYOUT;
    }
    public static MemorySegment emr$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static MemorySegment ColorAdjustment$slice(MemorySegment seg) {
        return seg.asSlice(8, 24);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


