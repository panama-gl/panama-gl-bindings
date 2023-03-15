// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class SET_POWER_SETTING_VALUE {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("Guid"),
        Constants$root.C_LONG$LAYOUT.withName("PowerCondition"),
        Constants$root.C_LONG$LAYOUT.withName("DataLength"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_CHAR$LAYOUT).withName("Data"),
        MemoryLayout.paddingLayout(24)
    );
    public static MemoryLayout $LAYOUT() {
        return SET_POWER_SETTING_VALUE.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return SET_POWER_SETTING_VALUE.Version$VH;
    }
    public static int Version$get(MemorySegment seg) {
        return (int)SET_POWER_SETTING_VALUE.Version$VH.get(seg);
    }
    public static void Version$set( MemorySegment seg, int x) {
        SET_POWER_SETTING_VALUE.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)SET_POWER_SETTING_VALUE.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        SET_POWER_SETTING_VALUE.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Guid$slice(MemorySegment seg) {
        return seg.asSlice(4, 16);
    }
    static final VarHandle PowerCondition$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PowerCondition"));
    public static VarHandle PowerCondition$VH() {
        return SET_POWER_SETTING_VALUE.PowerCondition$VH;
    }
    public static int PowerCondition$get(MemorySegment seg) {
        return (int)SET_POWER_SETTING_VALUE.PowerCondition$VH.get(seg);
    }
    public static void PowerCondition$set( MemorySegment seg, int x) {
        SET_POWER_SETTING_VALUE.PowerCondition$VH.set(seg, x);
    }
    public static int PowerCondition$get(MemorySegment seg, long index) {
        return (int)SET_POWER_SETTING_VALUE.PowerCondition$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PowerCondition$set(MemorySegment seg, long index, int x) {
        SET_POWER_SETTING_VALUE.PowerCondition$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DataLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DataLength"));
    public static VarHandle DataLength$VH() {
        return SET_POWER_SETTING_VALUE.DataLength$VH;
    }
    public static int DataLength$get(MemorySegment seg) {
        return (int)SET_POWER_SETTING_VALUE.DataLength$VH.get(seg);
    }
    public static void DataLength$set( MemorySegment seg, int x) {
        SET_POWER_SETTING_VALUE.DataLength$VH.set(seg, x);
    }
    public static int DataLength$get(MemorySegment seg, long index) {
        return (int)SET_POWER_SETTING_VALUE.DataLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DataLength$set(MemorySegment seg, long index, int x) {
        SET_POWER_SETTING_VALUE.DataLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Data$slice(MemorySegment seg) {
        return seg.asSlice(28, 1);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


