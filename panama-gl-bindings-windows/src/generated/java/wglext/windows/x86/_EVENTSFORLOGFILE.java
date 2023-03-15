// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _EVENTSFORLOGFILE {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("ulSize"),
        MemoryLayout.sequenceLayout(256, Constants$root.C_SHORT$LAYOUT).withName("szLogicalLogFile"),
        Constants$root.C_LONG$LAYOUT.withName("ulNumRecords"),
        MemoryLayout.sequenceLayout(0, MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("Length"),
            Constants$root.C_LONG$LAYOUT.withName("Reserved"),
            Constants$root.C_LONG$LAYOUT.withName("RecordNumber"),
            Constants$root.C_LONG$LAYOUT.withName("TimeGenerated"),
            Constants$root.C_LONG$LAYOUT.withName("TimeWritten"),
            Constants$root.C_LONG$LAYOUT.withName("EventID"),
            Constants$root.C_SHORT$LAYOUT.withName("EventType"),
            Constants$root.C_SHORT$LAYOUT.withName("NumStrings"),
            Constants$root.C_SHORT$LAYOUT.withName("EventCategory"),
            Constants$root.C_SHORT$LAYOUT.withName("ReservedFlags"),
            Constants$root.C_LONG$LAYOUT.withName("ClosingRecordNumber"),
            Constants$root.C_LONG$LAYOUT.withName("StringOffset"),
            Constants$root.C_LONG$LAYOUT.withName("UserSidLength"),
            Constants$root.C_LONG$LAYOUT.withName("UserSidOffset"),
            Constants$root.C_LONG$LAYOUT.withName("DataLength"),
            Constants$root.C_LONG$LAYOUT.withName("DataOffset")
        ).withName("_EVENTLOGRECORD")).withName("pEventLogRecords")
    ).withName("_EVENTSFORLOGFILE");
    public static MemoryLayout $LAYOUT() {
        return _EVENTSFORLOGFILE.$struct$LAYOUT;
    }
    static final VarHandle ulSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ulSize"));
    public static VarHandle ulSize$VH() {
        return _EVENTSFORLOGFILE.ulSize$VH;
    }
    public static int ulSize$get(MemorySegment seg) {
        return (int)_EVENTSFORLOGFILE.ulSize$VH.get(seg);
    }
    public static void ulSize$set( MemorySegment seg, int x) {
        _EVENTSFORLOGFILE.ulSize$VH.set(seg, x);
    }
    public static int ulSize$get(MemorySegment seg, long index) {
        return (int)_EVENTSFORLOGFILE.ulSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ulSize$set(MemorySegment seg, long index, int x) {
        _EVENTSFORLOGFILE.ulSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment szLogicalLogFile$slice(MemorySegment seg) {
        return seg.asSlice(4, 512);
    }
    static final VarHandle ulNumRecords$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ulNumRecords"));
    public static VarHandle ulNumRecords$VH() {
        return _EVENTSFORLOGFILE.ulNumRecords$VH;
    }
    public static int ulNumRecords$get(MemorySegment seg) {
        return (int)_EVENTSFORLOGFILE.ulNumRecords$VH.get(seg);
    }
    public static void ulNumRecords$set( MemorySegment seg, int x) {
        _EVENTSFORLOGFILE.ulNumRecords$VH.set(seg, x);
    }
    public static int ulNumRecords$get(MemorySegment seg, long index) {
        return (int)_EVENTSFORLOGFILE.ulNumRecords$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ulNumRecords$set(MemorySegment seg, long index, int x) {
        _EVENTSFORLOGFILE.ulNumRecords$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


