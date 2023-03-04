// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _SECURITY_DESCRIPTOR {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_CHAR$LAYOUT.withName("Revision"),
        Constants$root.C_CHAR$LAYOUT.withName("Sbz1"),
        Constants$root.C_SHORT$LAYOUT.withName("Control"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("Owner"),
        Constants$root.C_POINTER$LAYOUT.withName("Group"),
        Constants$root.C_POINTER$LAYOUT.withName("Sacl"),
        Constants$root.C_POINTER$LAYOUT.withName("Dacl")
    ).withName("_SECURITY_DESCRIPTOR");
    public static MemoryLayout $LAYOUT() {
        return _SECURITY_DESCRIPTOR.$struct$LAYOUT;
    }
    static final VarHandle Revision$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Revision"));
    public static VarHandle Revision$VH() {
        return _SECURITY_DESCRIPTOR.Revision$VH;
    }
    public static byte Revision$get(MemorySegment seg) {
        return (byte)_SECURITY_DESCRIPTOR.Revision$VH.get(seg);
    }
    public static void Revision$set( MemorySegment seg, byte x) {
        _SECURITY_DESCRIPTOR.Revision$VH.set(seg, x);
    }
    public static byte Revision$get(MemorySegment seg, long index) {
        return (byte)_SECURITY_DESCRIPTOR.Revision$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Revision$set(MemorySegment seg, long index, byte x) {
        _SECURITY_DESCRIPTOR.Revision$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Sbz1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Sbz1"));
    public static VarHandle Sbz1$VH() {
        return _SECURITY_DESCRIPTOR.Sbz1$VH;
    }
    public static byte Sbz1$get(MemorySegment seg) {
        return (byte)_SECURITY_DESCRIPTOR.Sbz1$VH.get(seg);
    }
    public static void Sbz1$set( MemorySegment seg, byte x) {
        _SECURITY_DESCRIPTOR.Sbz1$VH.set(seg, x);
    }
    public static byte Sbz1$get(MemorySegment seg, long index) {
        return (byte)_SECURITY_DESCRIPTOR.Sbz1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Sbz1$set(MemorySegment seg, long index, byte x) {
        _SECURITY_DESCRIPTOR.Sbz1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Control$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Control"));
    public static VarHandle Control$VH() {
        return _SECURITY_DESCRIPTOR.Control$VH;
    }
    public static short Control$get(MemorySegment seg) {
        return (short)_SECURITY_DESCRIPTOR.Control$VH.get(seg);
    }
    public static void Control$set( MemorySegment seg, short x) {
        _SECURITY_DESCRIPTOR.Control$VH.set(seg, x);
    }
    public static short Control$get(MemorySegment seg, long index) {
        return (short)_SECURITY_DESCRIPTOR.Control$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Control$set(MemorySegment seg, long index, short x) {
        _SECURITY_DESCRIPTOR.Control$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Owner$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Owner"));
    public static VarHandle Owner$VH() {
        return _SECURITY_DESCRIPTOR.Owner$VH;
    }
    public static MemoryAddress Owner$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_SECURITY_DESCRIPTOR.Owner$VH.get(seg);
    }
    public static void Owner$set( MemorySegment seg, MemoryAddress x) {
        _SECURITY_DESCRIPTOR.Owner$VH.set(seg, x);
    }
    public static MemoryAddress Owner$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_SECURITY_DESCRIPTOR.Owner$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Owner$set(MemorySegment seg, long index, MemoryAddress x) {
        _SECURITY_DESCRIPTOR.Owner$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Group$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Group"));
    public static VarHandle Group$VH() {
        return _SECURITY_DESCRIPTOR.Group$VH;
    }
    public static MemoryAddress Group$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_SECURITY_DESCRIPTOR.Group$VH.get(seg);
    }
    public static void Group$set( MemorySegment seg, MemoryAddress x) {
        _SECURITY_DESCRIPTOR.Group$VH.set(seg, x);
    }
    public static MemoryAddress Group$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_SECURITY_DESCRIPTOR.Group$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Group$set(MemorySegment seg, long index, MemoryAddress x) {
        _SECURITY_DESCRIPTOR.Group$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Sacl$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Sacl"));
    public static VarHandle Sacl$VH() {
        return _SECURITY_DESCRIPTOR.Sacl$VH;
    }
    public static MemoryAddress Sacl$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_SECURITY_DESCRIPTOR.Sacl$VH.get(seg);
    }
    public static void Sacl$set( MemorySegment seg, MemoryAddress x) {
        _SECURITY_DESCRIPTOR.Sacl$VH.set(seg, x);
    }
    public static MemoryAddress Sacl$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_SECURITY_DESCRIPTOR.Sacl$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Sacl$set(MemorySegment seg, long index, MemoryAddress x) {
        _SECURITY_DESCRIPTOR.Sacl$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Dacl$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Dacl"));
    public static VarHandle Dacl$VH() {
        return _SECURITY_DESCRIPTOR.Dacl$VH;
    }
    public static MemoryAddress Dacl$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_SECURITY_DESCRIPTOR.Dacl$VH.get(seg);
    }
    public static void Dacl$set( MemorySegment seg, MemoryAddress x) {
        _SECURITY_DESCRIPTOR.Dacl$VH.set(seg, x);
    }
    public static MemoryAddress Dacl$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_SECURITY_DESCRIPTOR.Dacl$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Dacl$set(MemorySegment seg, long index, MemoryAddress x) {
        _SECURITY_DESCRIPTOR.Dacl$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


