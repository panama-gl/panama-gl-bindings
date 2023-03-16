// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagWINDOWPLACEMENT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("length"),
        Constants$root.C_LONG$LAYOUT.withName("flags"),
        Constants$root.C_LONG$LAYOUT.withName("showCmd"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("x"),
            Constants$root.C_LONG$LAYOUT.withName("y")
        ).withName("ptMinPosition"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("x"),
            Constants$root.C_LONG$LAYOUT.withName("y")
        ).withName("ptMaxPosition"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("left"),
            Constants$root.C_LONG$LAYOUT.withName("top"),
            Constants$root.C_LONG$LAYOUT.withName("right"),
            Constants$root.C_LONG$LAYOUT.withName("bottom")
        ).withName("rcNormalPosition")
    ).withName("tagWINDOWPLACEMENT");
    public static MemoryLayout $LAYOUT() {
        return tagWINDOWPLACEMENT.$struct$LAYOUT;
    }
    static final VarHandle length$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("length"));
    public static VarHandle length$VH() {
        return tagWINDOWPLACEMENT.length$VH;
    }
    public static int length$get(MemorySegment seg) {
        return (int)tagWINDOWPLACEMENT.length$VH.get(seg);
    }
    public static void length$set( MemorySegment seg, int x) {
        tagWINDOWPLACEMENT.length$VH.set(seg, x);
    }
    public static int length$get(MemorySegment seg, long index) {
        return (int)tagWINDOWPLACEMENT.length$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void length$set(MemorySegment seg, long index, int x) {
        tagWINDOWPLACEMENT.length$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("flags"));
    public static VarHandle flags$VH() {
        return tagWINDOWPLACEMENT.flags$VH;
    }
    public static int flags$get(MemorySegment seg) {
        return (int)tagWINDOWPLACEMENT.flags$VH.get(seg);
    }
    public static void flags$set( MemorySegment seg, int x) {
        tagWINDOWPLACEMENT.flags$VH.set(seg, x);
    }
    public static int flags$get(MemorySegment seg, long index) {
        return (int)tagWINDOWPLACEMENT.flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, int x) {
        tagWINDOWPLACEMENT.flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle showCmd$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("showCmd"));
    public static VarHandle showCmd$VH() {
        return tagWINDOWPLACEMENT.showCmd$VH;
    }
    public static int showCmd$get(MemorySegment seg) {
        return (int)tagWINDOWPLACEMENT.showCmd$VH.get(seg);
    }
    public static void showCmd$set( MemorySegment seg, int x) {
        tagWINDOWPLACEMENT.showCmd$VH.set(seg, x);
    }
    public static int showCmd$get(MemorySegment seg, long index) {
        return (int)tagWINDOWPLACEMENT.showCmd$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void showCmd$set(MemorySegment seg, long index, int x) {
        tagWINDOWPLACEMENT.showCmd$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ptMinPosition$slice(MemorySegment seg) {
        return seg.asSlice(12, 8);
    }
    public static MemorySegment ptMaxPosition$slice(MemorySegment seg) {
        return seg.asSlice(20, 8);
    }
    public static MemorySegment rcNormalPosition$slice(MemorySegment seg) {
        return seg.asSlice(28, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


