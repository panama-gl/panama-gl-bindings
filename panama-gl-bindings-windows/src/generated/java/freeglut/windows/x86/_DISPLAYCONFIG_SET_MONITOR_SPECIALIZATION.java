// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _DISPLAYCONFIG_SET_MONITOR_SPECIALIZATION {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("type"),
            Constants$root.C_LONG$LAYOUT.withName("size"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("LowPart"),
                Constants$root.C_LONG$LAYOUT.withName("HighPart")
            ).withName("adapterId"),
            Constants$root.C_LONG$LAYOUT.withName("id")
        ).withName("header"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    MemoryLayout.paddingLayout(1).withName("isSpecializationEnabled"),
                    MemoryLayout.paddingLayout(31).withName("reserved")
                )
            ).withName("$anon$0"),
            Constants$root.C_LONG$LAYOUT.withName("value")
        ).withName("$anon$0"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("specializationType"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Data1"),
            Constants$root.C_SHORT$LAYOUT.withName("Data2"),
            Constants$root.C_SHORT$LAYOUT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, Constants$root.C_CHAR$LAYOUT).withName("Data4")
        ).withName("specializationSubType"),
        MemoryLayout.sequenceLayout(128, Constants$root.C_SHORT$LAYOUT).withName("specializationApplicationName")
    ).withName("_DISPLAYCONFIG_SET_MONITOR_SPECIALIZATION");
    public static MemoryLayout $LAYOUT() {
        return _DISPLAYCONFIG_SET_MONITOR_SPECIALIZATION.$struct$LAYOUT;
    }
    public static MemorySegment header$slice(MemorySegment seg) {
        return seg.asSlice(0, 20);
    }
    static final VarHandle value$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("value"));
    public static VarHandle value$VH() {
        return _DISPLAYCONFIG_SET_MONITOR_SPECIALIZATION.value$VH;
    }
    public static int value$get(MemorySegment seg) {
        return (int)_DISPLAYCONFIG_SET_MONITOR_SPECIALIZATION.value$VH.get(seg);
    }
    public static void value$set( MemorySegment seg, int x) {
        _DISPLAYCONFIG_SET_MONITOR_SPECIALIZATION.value$VH.set(seg, x);
    }
    public static int value$get(MemorySegment seg, long index) {
        return (int)_DISPLAYCONFIG_SET_MONITOR_SPECIALIZATION.value$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void value$set(MemorySegment seg, long index, int x) {
        _DISPLAYCONFIG_SET_MONITOR_SPECIALIZATION.value$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment specializationType$slice(MemorySegment seg) {
        return seg.asSlice(24, 16);
    }
    public static MemorySegment specializationSubType$slice(MemorySegment seg) {
        return seg.asSlice(40, 16);
    }
    public static MemorySegment specializationApplicationName$slice(MemorySegment seg) {
        return seg.asSlice(56, 256);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

