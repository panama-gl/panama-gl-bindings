// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagIMEMENUITEMINFOW {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        Constants$root.C_LONG$LAYOUT.withName("fType"),
        Constants$root.C_LONG$LAYOUT.withName("fState"),
        Constants$root.C_LONG$LAYOUT.withName("wID"),
        Constants$root.C_POINTER$LAYOUT.withName("hbmpChecked"),
        Constants$root.C_POINTER$LAYOUT.withName("hbmpUnchecked"),
        Constants$root.C_LONG$LAYOUT.withName("dwItemData"),
        MemoryLayout.sequenceLayout(80, Constants$root.C_SHORT$LAYOUT).withName("szString"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("hbmpItem")
    ).withName("tagIMEMENUITEMINFOW");
    public static MemoryLayout $LAYOUT() {
        return tagIMEMENUITEMINFOW.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return tagIMEMENUITEMINFOW.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)tagIMEMENUITEMINFOW.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        tagIMEMENUITEMINFOW.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)tagIMEMENUITEMINFOW.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        tagIMEMENUITEMINFOW.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fType"));
    public static VarHandle fType$VH() {
        return tagIMEMENUITEMINFOW.fType$VH;
    }
    public static int fType$get(MemorySegment seg) {
        return (int)tagIMEMENUITEMINFOW.fType$VH.get(seg);
    }
    public static void fType$set( MemorySegment seg, int x) {
        tagIMEMENUITEMINFOW.fType$VH.set(seg, x);
    }
    public static int fType$get(MemorySegment seg, long index) {
        return (int)tagIMEMENUITEMINFOW.fType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fType$set(MemorySegment seg, long index, int x) {
        tagIMEMENUITEMINFOW.fType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fState$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fState"));
    public static VarHandle fState$VH() {
        return tagIMEMENUITEMINFOW.fState$VH;
    }
    public static int fState$get(MemorySegment seg) {
        return (int)tagIMEMENUITEMINFOW.fState$VH.get(seg);
    }
    public static void fState$set( MemorySegment seg, int x) {
        tagIMEMENUITEMINFOW.fState$VH.set(seg, x);
    }
    public static int fState$get(MemorySegment seg, long index) {
        return (int)tagIMEMENUITEMINFOW.fState$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fState$set(MemorySegment seg, long index, int x) {
        tagIMEMENUITEMINFOW.fState$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wID$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wID"));
    public static VarHandle wID$VH() {
        return tagIMEMENUITEMINFOW.wID$VH;
    }
    public static int wID$get(MemorySegment seg) {
        return (int)tagIMEMENUITEMINFOW.wID$VH.get(seg);
    }
    public static void wID$set( MemorySegment seg, int x) {
        tagIMEMENUITEMINFOW.wID$VH.set(seg, x);
    }
    public static int wID$get(MemorySegment seg, long index) {
        return (int)tagIMEMENUITEMINFOW.wID$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wID$set(MemorySegment seg, long index, int x) {
        tagIMEMENUITEMINFOW.wID$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hbmpChecked$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hbmpChecked"));
    public static VarHandle hbmpChecked$VH() {
        return tagIMEMENUITEMINFOW.hbmpChecked$VH;
    }
    public static MemoryAddress hbmpChecked$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagIMEMENUITEMINFOW.hbmpChecked$VH.get(seg);
    }
    public static void hbmpChecked$set( MemorySegment seg, MemoryAddress x) {
        tagIMEMENUITEMINFOW.hbmpChecked$VH.set(seg, x);
    }
    public static MemoryAddress hbmpChecked$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagIMEMENUITEMINFOW.hbmpChecked$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hbmpChecked$set(MemorySegment seg, long index, MemoryAddress x) {
        tagIMEMENUITEMINFOW.hbmpChecked$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hbmpUnchecked$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hbmpUnchecked"));
    public static VarHandle hbmpUnchecked$VH() {
        return tagIMEMENUITEMINFOW.hbmpUnchecked$VH;
    }
    public static MemoryAddress hbmpUnchecked$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagIMEMENUITEMINFOW.hbmpUnchecked$VH.get(seg);
    }
    public static void hbmpUnchecked$set( MemorySegment seg, MemoryAddress x) {
        tagIMEMENUITEMINFOW.hbmpUnchecked$VH.set(seg, x);
    }
    public static MemoryAddress hbmpUnchecked$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagIMEMENUITEMINFOW.hbmpUnchecked$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hbmpUnchecked$set(MemorySegment seg, long index, MemoryAddress x) {
        tagIMEMENUITEMINFOW.hbmpUnchecked$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwItemData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwItemData"));
    public static VarHandle dwItemData$VH() {
        return tagIMEMENUITEMINFOW.dwItemData$VH;
    }
    public static int dwItemData$get(MemorySegment seg) {
        return (int)tagIMEMENUITEMINFOW.dwItemData$VH.get(seg);
    }
    public static void dwItemData$set( MemorySegment seg, int x) {
        tagIMEMENUITEMINFOW.dwItemData$VH.set(seg, x);
    }
    public static int dwItemData$get(MemorySegment seg, long index) {
        return (int)tagIMEMENUITEMINFOW.dwItemData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwItemData$set(MemorySegment seg, long index, int x) {
        tagIMEMENUITEMINFOW.dwItemData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment szString$slice(MemorySegment seg) {
        return seg.asSlice(36, 160);
    }
    static final VarHandle hbmpItem$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hbmpItem"));
    public static VarHandle hbmpItem$VH() {
        return tagIMEMENUITEMINFOW.hbmpItem$VH;
    }
    public static MemoryAddress hbmpItem$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagIMEMENUITEMINFOW.hbmpItem$VH.get(seg);
    }
    public static void hbmpItem$set( MemorySegment seg, MemoryAddress x) {
        tagIMEMENUITEMINFOW.hbmpItem$VH.set(seg, x);
    }
    public static MemoryAddress hbmpItem$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagIMEMENUITEMINFOW.hbmpItem$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hbmpItem$set(MemorySegment seg, long index, MemoryAddress x) {
        tagIMEMENUITEMINFOW.hbmpItem$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


