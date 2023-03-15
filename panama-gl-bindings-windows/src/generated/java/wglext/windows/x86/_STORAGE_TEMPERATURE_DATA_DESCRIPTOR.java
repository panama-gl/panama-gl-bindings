// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _STORAGE_TEMPERATURE_DATA_DESCRIPTOR {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        Constants$root.C_SHORT$LAYOUT.withName("CriticalTemperature"),
        Constants$root.C_SHORT$LAYOUT.withName("WarningTemperature"),
        Constants$root.C_SHORT$LAYOUT.withName("InfoCount"),
        MemoryLayout.sequenceLayout(2, Constants$root.C_CHAR$LAYOUT).withName("Reserved0"),
        MemoryLayout.sequenceLayout(2, Constants$root.C_LONG$LAYOUT).withName("Reserved1"),
        MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
            Constants$root.C_SHORT$LAYOUT.withName("Index"),
            Constants$root.C_SHORT$LAYOUT.withName("Temperature"),
            Constants$root.C_SHORT$LAYOUT.withName("OverThreshold"),
            Constants$root.C_SHORT$LAYOUT.withName("UnderThreshold"),
            Constants$root.C_CHAR$LAYOUT.withName("OverThresholdChangable"),
            Constants$root.C_CHAR$LAYOUT.withName("UnderThresholdChangable"),
            Constants$root.C_CHAR$LAYOUT.withName("EventGenerated"),
            Constants$root.C_CHAR$LAYOUT.withName("Reserved0"),
            Constants$root.C_LONG$LAYOUT.withName("Reserved1")
        ).withName("_STORAGE_TEMPERATURE_INFO")).withName("TemperatureInfo")
    ).withName("_STORAGE_TEMPERATURE_DATA_DESCRIPTOR");
    public static MemoryLayout $LAYOUT() {
        return _STORAGE_TEMPERATURE_DATA_DESCRIPTOR.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _STORAGE_TEMPERATURE_DATA_DESCRIPTOR.Version$VH;
    }
    public static int Version$get(MemorySegment seg) {
        return (int)_STORAGE_TEMPERATURE_DATA_DESCRIPTOR.Version$VH.get(seg);
    }
    public static void Version$set( MemorySegment seg, int x) {
        _STORAGE_TEMPERATURE_DATA_DESCRIPTOR.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_STORAGE_TEMPERATURE_DATA_DESCRIPTOR.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _STORAGE_TEMPERATURE_DATA_DESCRIPTOR.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _STORAGE_TEMPERATURE_DATA_DESCRIPTOR.Size$VH;
    }
    public static int Size$get(MemorySegment seg) {
        return (int)_STORAGE_TEMPERATURE_DATA_DESCRIPTOR.Size$VH.get(seg);
    }
    public static void Size$set( MemorySegment seg, int x) {
        _STORAGE_TEMPERATURE_DATA_DESCRIPTOR.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_STORAGE_TEMPERATURE_DATA_DESCRIPTOR.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _STORAGE_TEMPERATURE_DATA_DESCRIPTOR.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle CriticalTemperature$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CriticalTemperature"));
    public static VarHandle CriticalTemperature$VH() {
        return _STORAGE_TEMPERATURE_DATA_DESCRIPTOR.CriticalTemperature$VH;
    }
    public static short CriticalTemperature$get(MemorySegment seg) {
        return (short)_STORAGE_TEMPERATURE_DATA_DESCRIPTOR.CriticalTemperature$VH.get(seg);
    }
    public static void CriticalTemperature$set( MemorySegment seg, short x) {
        _STORAGE_TEMPERATURE_DATA_DESCRIPTOR.CriticalTemperature$VH.set(seg, x);
    }
    public static short CriticalTemperature$get(MemorySegment seg, long index) {
        return (short)_STORAGE_TEMPERATURE_DATA_DESCRIPTOR.CriticalTemperature$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CriticalTemperature$set(MemorySegment seg, long index, short x) {
        _STORAGE_TEMPERATURE_DATA_DESCRIPTOR.CriticalTemperature$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle WarningTemperature$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("WarningTemperature"));
    public static VarHandle WarningTemperature$VH() {
        return _STORAGE_TEMPERATURE_DATA_DESCRIPTOR.WarningTemperature$VH;
    }
    public static short WarningTemperature$get(MemorySegment seg) {
        return (short)_STORAGE_TEMPERATURE_DATA_DESCRIPTOR.WarningTemperature$VH.get(seg);
    }
    public static void WarningTemperature$set( MemorySegment seg, short x) {
        _STORAGE_TEMPERATURE_DATA_DESCRIPTOR.WarningTemperature$VH.set(seg, x);
    }
    public static short WarningTemperature$get(MemorySegment seg, long index) {
        return (short)_STORAGE_TEMPERATURE_DATA_DESCRIPTOR.WarningTemperature$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void WarningTemperature$set(MemorySegment seg, long index, short x) {
        _STORAGE_TEMPERATURE_DATA_DESCRIPTOR.WarningTemperature$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle InfoCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("InfoCount"));
    public static VarHandle InfoCount$VH() {
        return _STORAGE_TEMPERATURE_DATA_DESCRIPTOR.InfoCount$VH;
    }
    public static short InfoCount$get(MemorySegment seg) {
        return (short)_STORAGE_TEMPERATURE_DATA_DESCRIPTOR.InfoCount$VH.get(seg);
    }
    public static void InfoCount$set( MemorySegment seg, short x) {
        _STORAGE_TEMPERATURE_DATA_DESCRIPTOR.InfoCount$VH.set(seg, x);
    }
    public static short InfoCount$get(MemorySegment seg, long index) {
        return (short)_STORAGE_TEMPERATURE_DATA_DESCRIPTOR.InfoCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void InfoCount$set(MemorySegment seg, long index, short x) {
        _STORAGE_TEMPERATURE_DATA_DESCRIPTOR.InfoCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Reserved0$slice(MemorySegment seg) {
        return seg.asSlice(14, 2);
    }
    public static MemorySegment Reserved1$slice(MemorySegment seg) {
        return seg.asSlice(16, 8);
    }
    public static MemorySegment TemperatureInfo$slice(MemorySegment seg) {
        return seg.asSlice(24, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


