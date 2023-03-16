// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CHANGER_ELEMENT_STATUS {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
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
    ).withName("_CHANGER_ELEMENT_STATUS");
    public static MemoryLayout $LAYOUT() {
        return _CHANGER_ELEMENT_STATUS.$struct$LAYOUT;
    }
    public static MemorySegment Element$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static MemorySegment SrcElementAddress$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _CHANGER_ELEMENT_STATUS.Flags$VH;
    }
    public static int Flags$get(MemorySegment seg) {
        return (int)_CHANGER_ELEMENT_STATUS.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, int x) {
        _CHANGER_ELEMENT_STATUS.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_CHANGER_ELEMENT_STATUS.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _CHANGER_ELEMENT_STATUS.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ExceptionCode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ExceptionCode"));
    public static VarHandle ExceptionCode$VH() {
        return _CHANGER_ELEMENT_STATUS.ExceptionCode$VH;
    }
    public static int ExceptionCode$get(MemorySegment seg) {
        return (int)_CHANGER_ELEMENT_STATUS.ExceptionCode$VH.get(seg);
    }
    public static void ExceptionCode$set( MemorySegment seg, int x) {
        _CHANGER_ELEMENT_STATUS.ExceptionCode$VH.set(seg, x);
    }
    public static int ExceptionCode$get(MemorySegment seg, long index) {
        return (int)_CHANGER_ELEMENT_STATUS.ExceptionCode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ExceptionCode$set(MemorySegment seg, long index, int x) {
        _CHANGER_ELEMENT_STATUS.ExceptionCode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TargetId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TargetId"));
    public static VarHandle TargetId$VH() {
        return _CHANGER_ELEMENT_STATUS.TargetId$VH;
    }
    public static byte TargetId$get(MemorySegment seg) {
        return (byte)_CHANGER_ELEMENT_STATUS.TargetId$VH.get(seg);
    }
    public static void TargetId$set( MemorySegment seg, byte x) {
        _CHANGER_ELEMENT_STATUS.TargetId$VH.set(seg, x);
    }
    public static byte TargetId$get(MemorySegment seg, long index) {
        return (byte)_CHANGER_ELEMENT_STATUS.TargetId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TargetId$set(MemorySegment seg, long index, byte x) {
        _CHANGER_ELEMENT_STATUS.TargetId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Lun$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Lun"));
    public static VarHandle Lun$VH() {
        return _CHANGER_ELEMENT_STATUS.Lun$VH;
    }
    public static byte Lun$get(MemorySegment seg) {
        return (byte)_CHANGER_ELEMENT_STATUS.Lun$VH.get(seg);
    }
    public static void Lun$set( MemorySegment seg, byte x) {
        _CHANGER_ELEMENT_STATUS.Lun$VH.set(seg, x);
    }
    public static byte Lun$get(MemorySegment seg, long index) {
        return (byte)_CHANGER_ELEMENT_STATUS.Lun$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Lun$set(MemorySegment seg, long index, byte x) {
        _CHANGER_ELEMENT_STATUS.Lun$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Reserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Reserved"));
    public static VarHandle Reserved$VH() {
        return _CHANGER_ELEMENT_STATUS.Reserved$VH;
    }
    public static short Reserved$get(MemorySegment seg) {
        return (short)_CHANGER_ELEMENT_STATUS.Reserved$VH.get(seg);
    }
    public static void Reserved$set( MemorySegment seg, short x) {
        _CHANGER_ELEMENT_STATUS.Reserved$VH.set(seg, x);
    }
    public static short Reserved$get(MemorySegment seg, long index) {
        return (short)_CHANGER_ELEMENT_STATUS.Reserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved$set(MemorySegment seg, long index, short x) {
        _CHANGER_ELEMENT_STATUS.Reserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment PrimaryVolumeID$slice(MemorySegment seg) {
        return seg.asSlice(28, 36);
    }
    public static MemorySegment AlternateVolumeID$slice(MemorySegment seg) {
        return seg.asSlice(64, 36);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

