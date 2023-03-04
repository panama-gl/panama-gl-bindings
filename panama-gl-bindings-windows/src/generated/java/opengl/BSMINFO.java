// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class BSMINFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("hdesk"),
        Constants$root.C_POINTER$LAYOUT.withName("hwnd"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("LowPart"),
            Constants$root.C_LONG$LAYOUT.withName("HighPart")
        ).withName("luid")
    );
    public static MemoryLayout $LAYOUT() {
        return BSMINFO.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return BSMINFO.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)BSMINFO.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        BSMINFO.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)BSMINFO.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        BSMINFO.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hdesk$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hdesk"));
    public static VarHandle hdesk$VH() {
        return BSMINFO.hdesk$VH;
    }
    public static MemoryAddress hdesk$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)BSMINFO.hdesk$VH.get(seg);
    }
    public static void hdesk$set( MemorySegment seg, MemoryAddress x) {
        BSMINFO.hdesk$VH.set(seg, x);
    }
    public static MemoryAddress hdesk$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)BSMINFO.hdesk$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hdesk$set(MemorySegment seg, long index, MemoryAddress x) {
        BSMINFO.hdesk$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hwnd$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hwnd"));
    public static VarHandle hwnd$VH() {
        return BSMINFO.hwnd$VH;
    }
    public static MemoryAddress hwnd$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)BSMINFO.hwnd$VH.get(seg);
    }
    public static void hwnd$set( MemorySegment seg, MemoryAddress x) {
        BSMINFO.hwnd$VH.set(seg, x);
    }
    public static MemoryAddress hwnd$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)BSMINFO.hwnd$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hwnd$set(MemorySegment seg, long index, MemoryAddress x) {
        BSMINFO.hwnd$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment luid$slice(MemorySegment seg) {
        return seg.asSlice(24, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


