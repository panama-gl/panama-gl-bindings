// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class XwcTextItem {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("chars"),
        Constants$root.C_INT$LAYOUT.withName("nchars"),
        Constants$root.C_INT$LAYOUT.withName("delta"),
        Constants$root.C_POINTER$LAYOUT.withName("font_set")
    );
    public static MemoryLayout $LAYOUT() {
        return XwcTextItem.$struct$LAYOUT;
    }
    static final VarHandle chars$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("chars"));
    public static VarHandle chars$VH() {
        return XwcTextItem.chars$VH;
    }
    public static MemoryAddress chars$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)XwcTextItem.chars$VH.get(seg);
    }
    public static void chars$set( MemorySegment seg, MemoryAddress x) {
        XwcTextItem.chars$VH.set(seg, x);
    }
    public static MemoryAddress chars$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)XwcTextItem.chars$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void chars$set(MemorySegment seg, long index, MemoryAddress x) {
        XwcTextItem.chars$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nchars$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nchars"));
    public static VarHandle nchars$VH() {
        return XwcTextItem.nchars$VH;
    }
    public static int nchars$get(MemorySegment seg) {
        return (int)XwcTextItem.nchars$VH.get(seg);
    }
    public static void nchars$set( MemorySegment seg, int x) {
        XwcTextItem.nchars$VH.set(seg, x);
    }
    public static int nchars$get(MemorySegment seg, long index) {
        return (int)XwcTextItem.nchars$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nchars$set(MemorySegment seg, long index, int x) {
        XwcTextItem.nchars$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle delta$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("delta"));
    public static VarHandle delta$VH() {
        return XwcTextItem.delta$VH;
    }
    public static int delta$get(MemorySegment seg) {
        return (int)XwcTextItem.delta$VH.get(seg);
    }
    public static void delta$set( MemorySegment seg, int x) {
        XwcTextItem.delta$VH.set(seg, x);
    }
    public static int delta$get(MemorySegment seg, long index) {
        return (int)XwcTextItem.delta$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void delta$set(MemorySegment seg, long index, int x) {
        XwcTextItem.delta$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle font_set$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("font_set"));
    public static VarHandle font_set$VH() {
        return XwcTextItem.font_set$VH;
    }
    public static MemoryAddress font_set$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)XwcTextItem.font_set$VH.get(seg);
    }
    public static void font_set$set( MemorySegment seg, MemoryAddress x) {
        XwcTextItem.font_set$VH.set(seg, x);
    }
    public static MemoryAddress font_set$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)XwcTextItem.font_set$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void font_set$set(MemorySegment seg, long index, MemoryAddress x) {
        XwcTextItem.font_set$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


