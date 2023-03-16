// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class hostent {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("h_name"),
        Constants$root.C_POINTER$LAYOUT.withName("h_aliases"),
        Constants$root.C_SHORT$LAYOUT.withName("h_addrtype"),
        Constants$root.C_SHORT$LAYOUT.withName("h_length"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("h_addr_list")
    ).withName("hostent");
    public static MemoryLayout $LAYOUT() {
        return hostent.$struct$LAYOUT;
    }
    static final VarHandle h_name$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("h_name"));
    public static VarHandle h_name$VH() {
        return hostent.h_name$VH;
    }
    public static MemoryAddress h_name$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)hostent.h_name$VH.get(seg);
    }
    public static void h_name$set( MemorySegment seg, MemoryAddress x) {
        hostent.h_name$VH.set(seg, x);
    }
    public static MemoryAddress h_name$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)hostent.h_name$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void h_name$set(MemorySegment seg, long index, MemoryAddress x) {
        hostent.h_name$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle h_aliases$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("h_aliases"));
    public static VarHandle h_aliases$VH() {
        return hostent.h_aliases$VH;
    }
    public static MemoryAddress h_aliases$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)hostent.h_aliases$VH.get(seg);
    }
    public static void h_aliases$set( MemorySegment seg, MemoryAddress x) {
        hostent.h_aliases$VH.set(seg, x);
    }
    public static MemoryAddress h_aliases$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)hostent.h_aliases$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void h_aliases$set(MemorySegment seg, long index, MemoryAddress x) {
        hostent.h_aliases$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle h_addrtype$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("h_addrtype"));
    public static VarHandle h_addrtype$VH() {
        return hostent.h_addrtype$VH;
    }
    public static short h_addrtype$get(MemorySegment seg) {
        return (short)hostent.h_addrtype$VH.get(seg);
    }
    public static void h_addrtype$set( MemorySegment seg, short x) {
        hostent.h_addrtype$VH.set(seg, x);
    }
    public static short h_addrtype$get(MemorySegment seg, long index) {
        return (short)hostent.h_addrtype$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void h_addrtype$set(MemorySegment seg, long index, short x) {
        hostent.h_addrtype$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle h_length$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("h_length"));
    public static VarHandle h_length$VH() {
        return hostent.h_length$VH;
    }
    public static short h_length$get(MemorySegment seg) {
        return (short)hostent.h_length$VH.get(seg);
    }
    public static void h_length$set( MemorySegment seg, short x) {
        hostent.h_length$VH.set(seg, x);
    }
    public static short h_length$get(MemorySegment seg, long index) {
        return (short)hostent.h_length$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void h_length$set(MemorySegment seg, long index, short x) {
        hostent.h_length$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle h_addr_list$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("h_addr_list"));
    public static VarHandle h_addr_list$VH() {
        return hostent.h_addr_list$VH;
    }
    public static MemoryAddress h_addr_list$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)hostent.h_addr_list$VH.get(seg);
    }
    public static void h_addr_list$set( MemorySegment seg, MemoryAddress x) {
        hostent.h_addr_list$VH.set(seg, x);
    }
    public static MemoryAddress h_addr_list$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)hostent.h_addr_list$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void h_addr_list$set(MemorySegment seg, long index, MemoryAddress x) {
        hostent.h_addr_list$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


