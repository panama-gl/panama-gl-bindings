// Generated by jextract

package glxext.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class XFontProp {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("name"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("card32")
    );
    public static MemoryLayout $LAYOUT() {
        return XFontProp.$struct$LAYOUT;
    }
    static final VarHandle name$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("name"));
    public static VarHandle name$VH() {
        return XFontProp.name$VH;
    }
    public static long name$get(MemorySegment seg) {
        return (long)XFontProp.name$VH.get(seg);
    }
    public static void name$set( MemorySegment seg, long x) {
        XFontProp.name$VH.set(seg, x);
    }
    public static long name$get(MemorySegment seg, long index) {
        return (long)XFontProp.name$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void name$set(MemorySegment seg, long index, long x) {
        XFontProp.name$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle card32$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("card32"));
    public static VarHandle card32$VH() {
        return XFontProp.card32$VH;
    }
    public static long card32$get(MemorySegment seg) {
        return (long)XFontProp.card32$VH.get(seg);
    }
    public static void card32$set( MemorySegment seg, long x) {
        XFontProp.card32$VH.set(seg, x);
    }
    public static long card32$get(MemorySegment seg, long index) {
        return (long)XFontProp.card32$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void card32$set(MemorySegment seg, long index, long x) {
        XFontProp.card32$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


