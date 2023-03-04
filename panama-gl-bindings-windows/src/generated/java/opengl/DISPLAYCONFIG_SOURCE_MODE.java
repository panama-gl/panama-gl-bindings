// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class DISPLAYCONFIG_SOURCE_MODE {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("width"),
        Constants$root.C_LONG$LAYOUT.withName("height"),
        Constants$root.C_LONG$LAYOUT.withName("pixelFormat"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("x"),
            Constants$root.C_LONG$LAYOUT.withName("y")
        ).withName("position")
    ).withName("DISPLAYCONFIG_SOURCE_MODE");
    public static MemoryLayout $LAYOUT() {
        return DISPLAYCONFIG_SOURCE_MODE.$struct$LAYOUT;
    }
    static final VarHandle width$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("width"));
    public static VarHandle width$VH() {
        return DISPLAYCONFIG_SOURCE_MODE.width$VH;
    }
    public static int width$get(MemorySegment seg) {
        return (int)DISPLAYCONFIG_SOURCE_MODE.width$VH.get(seg);
    }
    public static void width$set( MemorySegment seg, int x) {
        DISPLAYCONFIG_SOURCE_MODE.width$VH.set(seg, x);
    }
    public static int width$get(MemorySegment seg, long index) {
        return (int)DISPLAYCONFIG_SOURCE_MODE.width$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void width$set(MemorySegment seg, long index, int x) {
        DISPLAYCONFIG_SOURCE_MODE.width$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle height$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("height"));
    public static VarHandle height$VH() {
        return DISPLAYCONFIG_SOURCE_MODE.height$VH;
    }
    public static int height$get(MemorySegment seg) {
        return (int)DISPLAYCONFIG_SOURCE_MODE.height$VH.get(seg);
    }
    public static void height$set( MemorySegment seg, int x) {
        DISPLAYCONFIG_SOURCE_MODE.height$VH.set(seg, x);
    }
    public static int height$get(MemorySegment seg, long index) {
        return (int)DISPLAYCONFIG_SOURCE_MODE.height$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void height$set(MemorySegment seg, long index, int x) {
        DISPLAYCONFIG_SOURCE_MODE.height$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pixelFormat$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pixelFormat"));
    public static VarHandle pixelFormat$VH() {
        return DISPLAYCONFIG_SOURCE_MODE.pixelFormat$VH;
    }
    public static int pixelFormat$get(MemorySegment seg) {
        return (int)DISPLAYCONFIG_SOURCE_MODE.pixelFormat$VH.get(seg);
    }
    public static void pixelFormat$set( MemorySegment seg, int x) {
        DISPLAYCONFIG_SOURCE_MODE.pixelFormat$VH.set(seg, x);
    }
    public static int pixelFormat$get(MemorySegment seg, long index) {
        return (int)DISPLAYCONFIG_SOURCE_MODE.pixelFormat$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pixelFormat$set(MemorySegment seg, long index, int x) {
        DISPLAYCONFIG_SOURCE_MODE.pixelFormat$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment position$slice(MemorySegment seg) {
        return seg.asSlice(12, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


