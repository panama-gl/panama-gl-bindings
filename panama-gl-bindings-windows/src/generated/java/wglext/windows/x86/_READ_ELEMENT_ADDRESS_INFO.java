// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _READ_ELEMENT_ADDRESS_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("NumberOfElements"),
        MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("ElementType"),
                Constants$root.C_LONG$LAYOUT.withName("ElementAddress")
            ).withName("Element"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("ElementType"),
                Constants$root.C_LONG$LAYOUT.withName("ElementAddress")
            ).withName("SrcElementAddress"),
            Constants$root.C_LONG$LAYOUT.withName("Flags"),
            Constants$root.C_LONG$LAYOUT.withName("ExceptionCode"),
            Constants$root.C_CHAR$LAYOUT.withName("TargetId"),
            Constants$root.C_CHAR$LAYOUT.withName("Lun"),
            Constants$root.C_SHORT$LAYOUT.withName("Reserved"),
            MemoryLayout.sequenceLayout(36, Constants$root.C_CHAR$LAYOUT).withName("PrimaryVolumeID"),
            MemoryLayout.sequenceLayout(36, Constants$root.C_CHAR$LAYOUT).withName("AlternateVolumeID")
        ).withName("_CHANGER_ELEMENT_STATUS")).withName("ElementStatus")
    ).withName("_READ_ELEMENT_ADDRESS_INFO");
    public static MemoryLayout $LAYOUT() {
        return _READ_ELEMENT_ADDRESS_INFO.$struct$LAYOUT;
    }
    static final VarHandle NumberOfElements$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberOfElements"));
    public static VarHandle NumberOfElements$VH() {
        return _READ_ELEMENT_ADDRESS_INFO.NumberOfElements$VH;
    }
    public static int NumberOfElements$get(MemorySegment seg) {
        return (int)_READ_ELEMENT_ADDRESS_INFO.NumberOfElements$VH.get(seg);
    }
    public static void NumberOfElements$set( MemorySegment seg, int x) {
        _READ_ELEMENT_ADDRESS_INFO.NumberOfElements$VH.set(seg, x);
    }
    public static int NumberOfElements$get(MemorySegment seg, long index) {
        return (int)_READ_ELEMENT_ADDRESS_INFO.NumberOfElements$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfElements$set(MemorySegment seg, long index, int x) {
        _READ_ELEMENT_ADDRESS_INFO.NumberOfElements$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ElementStatus$slice(MemorySegment seg) {
        return seg.asSlice(4, 100);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

