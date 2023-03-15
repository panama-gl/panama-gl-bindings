// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagMONHSZSTRUCTW {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cb"),
        Constants$root.C_LONG$LAYOUT.withName("fsAction"),
        Constants$root.C_LONG$LAYOUT.withName("dwTime"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("hsz"),
        Constants$root.C_POINTER$LAYOUT.withName("hTask"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_SHORT$LAYOUT).withName("str"),
        MemoryLayout.paddingLayout(48)
    ).withName("tagMONHSZSTRUCTW");
    public static MemoryLayout $LAYOUT() {
        return tagMONHSZSTRUCTW.$struct$LAYOUT;
    }
    static final VarHandle cb$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cb"));
    public static VarHandle cb$VH() {
        return tagMONHSZSTRUCTW.cb$VH;
    }
    public static int cb$get(MemorySegment seg) {
        return (int)tagMONHSZSTRUCTW.cb$VH.get(seg);
    }
    public static void cb$set( MemorySegment seg, int x) {
        tagMONHSZSTRUCTW.cb$VH.set(seg, x);
    }
    public static int cb$get(MemorySegment seg, long index) {
        return (int)tagMONHSZSTRUCTW.cb$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cb$set(MemorySegment seg, long index, int x) {
        tagMONHSZSTRUCTW.cb$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fsAction$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("fsAction"));
    public static VarHandle fsAction$VH() {
        return tagMONHSZSTRUCTW.fsAction$VH;
    }
    public static int fsAction$get(MemorySegment seg) {
        return (int)tagMONHSZSTRUCTW.fsAction$VH.get(seg);
    }
    public static void fsAction$set( MemorySegment seg, int x) {
        tagMONHSZSTRUCTW.fsAction$VH.set(seg, x);
    }
    public static int fsAction$get(MemorySegment seg, long index) {
        return (int)tagMONHSZSTRUCTW.fsAction$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fsAction$set(MemorySegment seg, long index, int x) {
        tagMONHSZSTRUCTW.fsAction$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwTime$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwTime"));
    public static VarHandle dwTime$VH() {
        return tagMONHSZSTRUCTW.dwTime$VH;
    }
    public static int dwTime$get(MemorySegment seg) {
        return (int)tagMONHSZSTRUCTW.dwTime$VH.get(seg);
    }
    public static void dwTime$set( MemorySegment seg, int x) {
        tagMONHSZSTRUCTW.dwTime$VH.set(seg, x);
    }
    public static int dwTime$get(MemorySegment seg, long index) {
        return (int)tagMONHSZSTRUCTW.dwTime$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwTime$set(MemorySegment seg, long index, int x) {
        tagMONHSZSTRUCTW.dwTime$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hsz$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hsz"));
    public static VarHandle hsz$VH() {
        return tagMONHSZSTRUCTW.hsz$VH;
    }
    public static MemoryAddress hsz$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagMONHSZSTRUCTW.hsz$VH.get(seg);
    }
    public static void hsz$set( MemorySegment seg, MemoryAddress x) {
        tagMONHSZSTRUCTW.hsz$VH.set(seg, x);
    }
    public static MemoryAddress hsz$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagMONHSZSTRUCTW.hsz$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hsz$set(MemorySegment seg, long index, MemoryAddress x) {
        tagMONHSZSTRUCTW.hsz$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hTask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hTask"));
    public static VarHandle hTask$VH() {
        return tagMONHSZSTRUCTW.hTask$VH;
    }
    public static MemoryAddress hTask$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagMONHSZSTRUCTW.hTask$VH.get(seg);
    }
    public static void hTask$set( MemorySegment seg, MemoryAddress x) {
        tagMONHSZSTRUCTW.hTask$VH.set(seg, x);
    }
    public static MemoryAddress hTask$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagMONHSZSTRUCTW.hTask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hTask$set(MemorySegment seg, long index, MemoryAddress x) {
        tagMONHSZSTRUCTW.hTask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment str$slice(MemorySegment seg) {
        return seg.asSlice(32, 2);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


