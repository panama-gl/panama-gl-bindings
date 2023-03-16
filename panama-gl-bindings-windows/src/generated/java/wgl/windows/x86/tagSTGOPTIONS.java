// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagSTGOPTIONS {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("usVersion"),
        Constants$root.C_SHORT$LAYOUT.withName("reserved"),
        Constants$root.C_LONG$LAYOUT.withName("ulSectorSize"),
        Constants$root.C_POINTER$LAYOUT.withName("pwcsTemplateFile")
    ).withName("tagSTGOPTIONS");
    public static MemoryLayout $LAYOUT() {
        return tagSTGOPTIONS.$struct$LAYOUT;
    }
    static final VarHandle usVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("usVersion"));
    public static VarHandle usVersion$VH() {
        return tagSTGOPTIONS.usVersion$VH;
    }
    public static short usVersion$get(MemorySegment seg) {
        return (short)tagSTGOPTIONS.usVersion$VH.get(seg);
    }
    public static void usVersion$set( MemorySegment seg, short x) {
        tagSTGOPTIONS.usVersion$VH.set(seg, x);
    }
    public static short usVersion$get(MemorySegment seg, long index) {
        return (short)tagSTGOPTIONS.usVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void usVersion$set(MemorySegment seg, long index, short x) {
        tagSTGOPTIONS.usVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle reserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("reserved"));
    public static VarHandle reserved$VH() {
        return tagSTGOPTIONS.reserved$VH;
    }
    public static short reserved$get(MemorySegment seg) {
        return (short)tagSTGOPTIONS.reserved$VH.get(seg);
    }
    public static void reserved$set( MemorySegment seg, short x) {
        tagSTGOPTIONS.reserved$VH.set(seg, x);
    }
    public static short reserved$get(MemorySegment seg, long index) {
        return (short)tagSTGOPTIONS.reserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void reserved$set(MemorySegment seg, long index, short x) {
        tagSTGOPTIONS.reserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ulSectorSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ulSectorSize"));
    public static VarHandle ulSectorSize$VH() {
        return tagSTGOPTIONS.ulSectorSize$VH;
    }
    public static int ulSectorSize$get(MemorySegment seg) {
        return (int)tagSTGOPTIONS.ulSectorSize$VH.get(seg);
    }
    public static void ulSectorSize$set( MemorySegment seg, int x) {
        tagSTGOPTIONS.ulSectorSize$VH.set(seg, x);
    }
    public static int ulSectorSize$get(MemorySegment seg, long index) {
        return (int)tagSTGOPTIONS.ulSectorSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ulSectorSize$set(MemorySegment seg, long index, int x) {
        tagSTGOPTIONS.ulSectorSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pwcsTemplateFile$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pwcsTemplateFile"));
    public static VarHandle pwcsTemplateFile$VH() {
        return tagSTGOPTIONS.pwcsTemplateFile$VH;
    }
    public static MemoryAddress pwcsTemplateFile$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagSTGOPTIONS.pwcsTemplateFile$VH.get(seg);
    }
    public static void pwcsTemplateFile$set( MemorySegment seg, MemoryAddress x) {
        tagSTGOPTIONS.pwcsTemplateFile$VH.set(seg, x);
    }
    public static MemoryAddress pwcsTemplateFile$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagSTGOPTIONS.pwcsTemplateFile$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pwcsTemplateFile$set(MemorySegment seg, long index, MemoryAddress x) {
        tagSTGOPTIONS.pwcsTemplateFile$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


