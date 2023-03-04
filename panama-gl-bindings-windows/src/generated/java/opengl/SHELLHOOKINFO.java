// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class SHELLHOOKINFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("hwnd"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("left"),
            Constants$root.C_LONG$LAYOUT.withName("top"),
            Constants$root.C_LONG$LAYOUT.withName("right"),
            Constants$root.C_LONG$LAYOUT.withName("bottom")
        ).withName("rc")
    );
    public static MemoryLayout $LAYOUT() {
        return SHELLHOOKINFO.$struct$LAYOUT;
    }
    static final VarHandle hwnd$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hwnd"));
    public static VarHandle hwnd$VH() {
        return SHELLHOOKINFO.hwnd$VH;
    }
    public static MemoryAddress hwnd$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)SHELLHOOKINFO.hwnd$VH.get(seg);
    }
    public static void hwnd$set( MemorySegment seg, MemoryAddress x) {
        SHELLHOOKINFO.hwnd$VH.set(seg, x);
    }
    public static MemoryAddress hwnd$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)SHELLHOOKINFO.hwnd$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hwnd$set(MemorySegment seg, long index, MemoryAddress x) {
        SHELLHOOKINFO.hwnd$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment rc$slice(MemorySegment seg) {
        return seg.asSlice(8, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


