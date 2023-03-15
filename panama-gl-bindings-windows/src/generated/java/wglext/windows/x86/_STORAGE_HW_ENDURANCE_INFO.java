// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _STORAGE_HW_ENDURANCE_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("ValidFields"),
        Constants$root.C_LONG$LAYOUT.withName("GroupId"),
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.paddingLayout(1).withName("Shared"),
                MemoryLayout.paddingLayout(31).withName("Reserved")
            )
        ).withName("Flags"),
        Constants$root.C_LONG$LAYOUT.withName("LifePercentage"),
        MemoryLayout.sequenceLayout(16, Constants$root.C_CHAR$LAYOUT).withName("BytesReadCount"),
        MemoryLayout.sequenceLayout(16, Constants$root.C_CHAR$LAYOUT).withName("ByteWriteCount")
    ).withName("_STORAGE_HW_ENDURANCE_INFO");
    public static MemoryLayout $LAYOUT() {
        return _STORAGE_HW_ENDURANCE_INFO.$struct$LAYOUT;
    }
    static final VarHandle ValidFields$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ValidFields"));
    public static VarHandle ValidFields$VH() {
        return _STORAGE_HW_ENDURANCE_INFO.ValidFields$VH;
    }
    public static int ValidFields$get(MemorySegment seg) {
        return (int)_STORAGE_HW_ENDURANCE_INFO.ValidFields$VH.get(seg);
    }
    public static void ValidFields$set( MemorySegment seg, int x) {
        _STORAGE_HW_ENDURANCE_INFO.ValidFields$VH.set(seg, x);
    }
    public static int ValidFields$get(MemorySegment seg, long index) {
        return (int)_STORAGE_HW_ENDURANCE_INFO.ValidFields$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ValidFields$set(MemorySegment seg, long index, int x) {
        _STORAGE_HW_ENDURANCE_INFO.ValidFields$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle GroupId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GroupId"));
    public static VarHandle GroupId$VH() {
        return _STORAGE_HW_ENDURANCE_INFO.GroupId$VH;
    }
    public static int GroupId$get(MemorySegment seg) {
        return (int)_STORAGE_HW_ENDURANCE_INFO.GroupId$VH.get(seg);
    }
    public static void GroupId$set( MemorySegment seg, int x) {
        _STORAGE_HW_ENDURANCE_INFO.GroupId$VH.set(seg, x);
    }
    public static int GroupId$get(MemorySegment seg, long index) {
        return (int)_STORAGE_HW_ENDURANCE_INFO.GroupId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GroupId$set(MemorySegment seg, long index, int x) {
        _STORAGE_HW_ENDURANCE_INFO.GroupId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static class Flags {

        static final  GroupLayout Flags$struct$LAYOUT = MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.paddingLayout(1).withName("Shared"),
                MemoryLayout.paddingLayout(31).withName("Reserved")
            )
        );
        public static MemoryLayout $LAYOUT() {
            return Flags.Flags$struct$LAYOUT;
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
    }

    public static MemorySegment Flags$slice(MemorySegment seg) {
        return seg.asSlice(8, 4);
    }
    static final VarHandle LifePercentage$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("LifePercentage"));
    public static VarHandle LifePercentage$VH() {
        return _STORAGE_HW_ENDURANCE_INFO.LifePercentage$VH;
    }
    public static int LifePercentage$get(MemorySegment seg) {
        return (int)_STORAGE_HW_ENDURANCE_INFO.LifePercentage$VH.get(seg);
    }
    public static void LifePercentage$set( MemorySegment seg, int x) {
        _STORAGE_HW_ENDURANCE_INFO.LifePercentage$VH.set(seg, x);
    }
    public static int LifePercentage$get(MemorySegment seg, long index) {
        return (int)_STORAGE_HW_ENDURANCE_INFO.LifePercentage$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LifePercentage$set(MemorySegment seg, long index, int x) {
        _STORAGE_HW_ENDURANCE_INFO.LifePercentage$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment BytesReadCount$slice(MemorySegment seg) {
        return seg.asSlice(16, 16);
    }
    public static MemorySegment ByteWriteCount$slice(MemorySegment seg) {
        return seg.asSlice(32, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


