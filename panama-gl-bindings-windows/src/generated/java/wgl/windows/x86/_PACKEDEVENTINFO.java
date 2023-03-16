// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _PACKEDEVENTINFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("ulSize"),
        Constants$root.C_LONG$LAYOUT.withName("ulNumEventsForLogFile"),
        MemoryLayout.sequenceLayout(0, Constants$root.C_LONG$LAYOUT).withName("ulOffsets")
    ).withName("_PACKEDEVENTINFO");
    public static MemoryLayout $LAYOUT() {
        return _PACKEDEVENTINFO.$struct$LAYOUT;
    }
    static final VarHandle ulSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ulSize"));
    public static VarHandle ulSize$VH() {
        return _PACKEDEVENTINFO.ulSize$VH;
    }
    public static int ulSize$get(MemorySegment seg) {
        return (int)_PACKEDEVENTINFO.ulSize$VH.get(seg);
    }
    public static void ulSize$set( MemorySegment seg, int x) {
        _PACKEDEVENTINFO.ulSize$VH.set(seg, x);
    }
    public static int ulSize$get(MemorySegment seg, long index) {
        return (int)_PACKEDEVENTINFO.ulSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ulSize$set(MemorySegment seg, long index, int x) {
        _PACKEDEVENTINFO.ulSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ulNumEventsForLogFile$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ulNumEventsForLogFile"));
    public static VarHandle ulNumEventsForLogFile$VH() {
        return _PACKEDEVENTINFO.ulNumEventsForLogFile$VH;
    }
    public static int ulNumEventsForLogFile$get(MemorySegment seg) {
        return (int)_PACKEDEVENTINFO.ulNumEventsForLogFile$VH.get(seg);
    }
    public static void ulNumEventsForLogFile$set( MemorySegment seg, int x) {
        _PACKEDEVENTINFO.ulNumEventsForLogFile$VH.set(seg, x);
    }
    public static int ulNumEventsForLogFile$get(MemorySegment seg, long index) {
        return (int)_PACKEDEVENTINFO.ulNumEventsForLogFile$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ulNumEventsForLogFile$set(MemorySegment seg, long index, int x) {
        _PACKEDEVENTINFO.ulNumEventsForLogFile$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


