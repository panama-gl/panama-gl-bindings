// Generated by jextract

package opengl.glx.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_SHORT;
import java.lang.invoke.VarHandle;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.MemoryLayout;
import jdk.incubator.foreign.MemorySegment;
import jdk.incubator.foreign.ResourceScope;
import jdk.incubator.foreign.SegmentAllocator;
public class XColor {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("pixel"),
        C_SHORT.withName("red"),
        C_SHORT.withName("green"),
        C_SHORT.withName("blue"),
        C_CHAR.withName("flags"),
        C_CHAR.withName("pad")
    );
    public static MemoryLayout $LAYOUT() {
        return XColor.$struct$LAYOUT;
    }
    static final VarHandle pixel$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pixel"));
    public static VarHandle pixel$VH() {
        return XColor.pixel$VH;
    }
    public static long pixel$get(MemorySegment seg) {
        return (long)XColor.pixel$VH.get(seg);
    }
    public static void pixel$set( MemorySegment seg, long x) {
        XColor.pixel$VH.set(seg, x);
    }
    public static long pixel$get(MemorySegment seg, long index) {
        return (long)XColor.pixel$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pixel$set(MemorySegment seg, long index, long x) {
        XColor.pixel$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle red$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("red"));
    public static VarHandle red$VH() {
        return XColor.red$VH;
    }
    public static short red$get(MemorySegment seg) {
        return (short)XColor.red$VH.get(seg);
    }
    public static void red$set( MemorySegment seg, short x) {
        XColor.red$VH.set(seg, x);
    }
    public static short red$get(MemorySegment seg, long index) {
        return (short)XColor.red$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void red$set(MemorySegment seg, long index, short x) {
        XColor.red$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle green$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("green"));
    public static VarHandle green$VH() {
        return XColor.green$VH;
    }
    public static short green$get(MemorySegment seg) {
        return (short)XColor.green$VH.get(seg);
    }
    public static void green$set( MemorySegment seg, short x) {
        XColor.green$VH.set(seg, x);
    }
    public static short green$get(MemorySegment seg, long index) {
        return (short)XColor.green$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void green$set(MemorySegment seg, long index, short x) {
        XColor.green$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle blue$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("blue"));
    public static VarHandle blue$VH() {
        return XColor.blue$VH;
    }
    public static short blue$get(MemorySegment seg) {
        return (short)XColor.blue$VH.get(seg);
    }
    public static void blue$set( MemorySegment seg, short x) {
        XColor.blue$VH.set(seg, x);
    }
    public static short blue$get(MemorySegment seg, long index) {
        return (short)XColor.blue$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void blue$set(MemorySegment seg, long index, short x) {
        XColor.blue$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle flags$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("flags"));
    public static VarHandle flags$VH() {
        return XColor.flags$VH;
    }
    public static byte flags$get(MemorySegment seg) {
        return (byte)XColor.flags$VH.get(seg);
    }
    public static void flags$set( MemorySegment seg, byte x) {
        XColor.flags$VH.set(seg, x);
    }
    public static byte flags$get(MemorySegment seg, long index) {
        return (byte)XColor.flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, byte x) {
        XColor.flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pad$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("pad"));
    public static VarHandle pad$VH() {
        return XColor.pad$VH;
    }
    public static byte pad$get(MemorySegment seg) {
        return (byte)XColor.pad$VH.get(seg);
    }
    public static void pad$set( MemorySegment seg, byte x) {
        XColor.pad$VH.set(seg, x);
    }
    public static byte pad$get(MemorySegment seg, long index) {
        return (byte)XColor.pad$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pad$set(MemorySegment seg, long index, byte x) {
        XColor.pad$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocate(ResourceScope scope) { return allocate(SegmentAllocator.ofScope(scope)); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment allocateArray(int len, ResourceScope scope) {
        return allocateArray(len, SegmentAllocator.ofScope(scope));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, ResourceScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


