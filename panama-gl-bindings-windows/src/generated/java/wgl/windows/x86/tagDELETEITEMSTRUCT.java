// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagDELETEITEMSTRUCT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("CtlType"),
        Constants$root.C_LONG$LAYOUT.withName("CtlID"),
        Constants$root.C_LONG$LAYOUT.withName("itemID"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("hwndItem"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("itemData")
    ).withName("tagDELETEITEMSTRUCT");
    public static MemoryLayout $LAYOUT() {
        return tagDELETEITEMSTRUCT.$struct$LAYOUT;
    }
    static final VarHandle CtlType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CtlType"));
    public static VarHandle CtlType$VH() {
        return tagDELETEITEMSTRUCT.CtlType$VH;
    }
    public static int CtlType$get(MemorySegment seg) {
        return (int)tagDELETEITEMSTRUCT.CtlType$VH.get(seg);
    }
    public static void CtlType$set( MemorySegment seg, int x) {
        tagDELETEITEMSTRUCT.CtlType$VH.set(seg, x);
    }
    public static int CtlType$get(MemorySegment seg, long index) {
        return (int)tagDELETEITEMSTRUCT.CtlType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CtlType$set(MemorySegment seg, long index, int x) {
        tagDELETEITEMSTRUCT.CtlType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle CtlID$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CtlID"));
    public static VarHandle CtlID$VH() {
        return tagDELETEITEMSTRUCT.CtlID$VH;
    }
    public static int CtlID$get(MemorySegment seg) {
        return (int)tagDELETEITEMSTRUCT.CtlID$VH.get(seg);
    }
    public static void CtlID$set( MemorySegment seg, int x) {
        tagDELETEITEMSTRUCT.CtlID$VH.set(seg, x);
    }
    public static int CtlID$get(MemorySegment seg, long index) {
        return (int)tagDELETEITEMSTRUCT.CtlID$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CtlID$set(MemorySegment seg, long index, int x) {
        tagDELETEITEMSTRUCT.CtlID$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle itemID$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("itemID"));
    public static VarHandle itemID$VH() {
        return tagDELETEITEMSTRUCT.itemID$VH;
    }
    public static int itemID$get(MemorySegment seg) {
        return (int)tagDELETEITEMSTRUCT.itemID$VH.get(seg);
    }
    public static void itemID$set( MemorySegment seg, int x) {
        tagDELETEITEMSTRUCT.itemID$VH.set(seg, x);
    }
    public static int itemID$get(MemorySegment seg, long index) {
        return (int)tagDELETEITEMSTRUCT.itemID$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void itemID$set(MemorySegment seg, long index, int x) {
        tagDELETEITEMSTRUCT.itemID$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hwndItem$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hwndItem"));
    public static VarHandle hwndItem$VH() {
        return tagDELETEITEMSTRUCT.hwndItem$VH;
    }
    public static MemoryAddress hwndItem$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagDELETEITEMSTRUCT.hwndItem$VH.get(seg);
    }
    public static void hwndItem$set( MemorySegment seg, MemoryAddress x) {
        tagDELETEITEMSTRUCT.hwndItem$VH.set(seg, x);
    }
    public static MemoryAddress hwndItem$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagDELETEITEMSTRUCT.hwndItem$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hwndItem$set(MemorySegment seg, long index, MemoryAddress x) {
        tagDELETEITEMSTRUCT.hwndItem$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle itemData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("itemData"));
    public static VarHandle itemData$VH() {
        return tagDELETEITEMSTRUCT.itemData$VH;
    }
    public static long itemData$get(MemorySegment seg) {
        return (long)tagDELETEITEMSTRUCT.itemData$VH.get(seg);
    }
    public static void itemData$set( MemorySegment seg, long x) {
        tagDELETEITEMSTRUCT.itemData$VH.set(seg, x);
    }
    public static long itemData$get(MemorySegment seg, long index) {
        return (long)tagDELETEITEMSTRUCT.itemData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void itemData$set(MemorySegment seg, long index, long x) {
        tagDELETEITEMSTRUCT.itemData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


