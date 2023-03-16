// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagCOMBOBOXINFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("left"),
            Constants$root.C_LONG$LAYOUT.withName("top"),
            Constants$root.C_LONG$LAYOUT.withName("right"),
            Constants$root.C_LONG$LAYOUT.withName("bottom")
        ).withName("rcItem"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("left"),
            Constants$root.C_LONG$LAYOUT.withName("top"),
            Constants$root.C_LONG$LAYOUT.withName("right"),
            Constants$root.C_LONG$LAYOUT.withName("bottom")
        ).withName("rcButton"),
        Constants$root.C_LONG$LAYOUT.withName("stateButton"),
        Constants$root.C_POINTER$LAYOUT.withName("hwndCombo"),
        Constants$root.C_POINTER$LAYOUT.withName("hwndItem"),
        Constants$root.C_POINTER$LAYOUT.withName("hwndList")
    ).withName("tagCOMBOBOXINFO");
    public static MemoryLayout $LAYOUT() {
        return tagCOMBOBOXINFO.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return tagCOMBOBOXINFO.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)tagCOMBOBOXINFO.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        tagCOMBOBOXINFO.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)tagCOMBOBOXINFO.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        tagCOMBOBOXINFO.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment rcItem$slice(MemorySegment seg) {
        return seg.asSlice(4, 16);
    }
    public static MemorySegment rcButton$slice(MemorySegment seg) {
        return seg.asSlice(20, 16);
    }
    static final VarHandle stateButton$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("stateButton"));
    public static VarHandle stateButton$VH() {
        return tagCOMBOBOXINFO.stateButton$VH;
    }
    public static int stateButton$get(MemorySegment seg) {
        return (int)tagCOMBOBOXINFO.stateButton$VH.get(seg);
    }
    public static void stateButton$set( MemorySegment seg, int x) {
        tagCOMBOBOXINFO.stateButton$VH.set(seg, x);
    }
    public static int stateButton$get(MemorySegment seg, long index) {
        return (int)tagCOMBOBOXINFO.stateButton$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void stateButton$set(MemorySegment seg, long index, int x) {
        tagCOMBOBOXINFO.stateButton$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hwndCombo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hwndCombo"));
    public static VarHandle hwndCombo$VH() {
        return tagCOMBOBOXINFO.hwndCombo$VH;
    }
    public static MemoryAddress hwndCombo$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagCOMBOBOXINFO.hwndCombo$VH.get(seg);
    }
    public static void hwndCombo$set( MemorySegment seg, MemoryAddress x) {
        tagCOMBOBOXINFO.hwndCombo$VH.set(seg, x);
    }
    public static MemoryAddress hwndCombo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagCOMBOBOXINFO.hwndCombo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hwndCombo$set(MemorySegment seg, long index, MemoryAddress x) {
        tagCOMBOBOXINFO.hwndCombo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hwndItem$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hwndItem"));
    public static VarHandle hwndItem$VH() {
        return tagCOMBOBOXINFO.hwndItem$VH;
    }
    public static MemoryAddress hwndItem$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagCOMBOBOXINFO.hwndItem$VH.get(seg);
    }
    public static void hwndItem$set( MemorySegment seg, MemoryAddress x) {
        tagCOMBOBOXINFO.hwndItem$VH.set(seg, x);
    }
    public static MemoryAddress hwndItem$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagCOMBOBOXINFO.hwndItem$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hwndItem$set(MemorySegment seg, long index, MemoryAddress x) {
        tagCOMBOBOXINFO.hwndItem$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hwndList$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hwndList"));
    public static VarHandle hwndList$VH() {
        return tagCOMBOBOXINFO.hwndList$VH;
    }
    public static MemoryAddress hwndList$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagCOMBOBOXINFO.hwndList$VH.get(seg);
    }
    public static void hwndList$set( MemorySegment seg, MemoryAddress x) {
        tagCOMBOBOXINFO.hwndList$VH.set(seg, x);
    }
    public static MemoryAddress hwndList$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagCOMBOBOXINFO.hwndList$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hwndList$set(MemorySegment seg, long index, MemoryAddress x) {
        tagCOMBOBOXINFO.hwndList$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


