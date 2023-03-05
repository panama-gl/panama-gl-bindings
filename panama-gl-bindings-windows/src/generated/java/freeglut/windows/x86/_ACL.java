// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _ACL {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_CHAR$LAYOUT.withName("AclRevision"),
        Constants$root.C_CHAR$LAYOUT.withName("Sbz1"),
        Constants$root.C_SHORT$LAYOUT.withName("AclSize"),
        Constants$root.C_SHORT$LAYOUT.withName("AceCount"),
        Constants$root.C_SHORT$LAYOUT.withName("Sbz2")
    ).withName("_ACL");
    public static MemoryLayout $LAYOUT() {
        return _ACL.$struct$LAYOUT;
    }
    static final VarHandle AclRevision$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AclRevision"));
    public static VarHandle AclRevision$VH() {
        return _ACL.AclRevision$VH;
    }
    public static byte AclRevision$get(MemorySegment seg) {
        return (byte)_ACL.AclRevision$VH.get(seg);
    }
    public static void AclRevision$set( MemorySegment seg, byte x) {
        _ACL.AclRevision$VH.set(seg, x);
    }
    public static byte AclRevision$get(MemorySegment seg, long index) {
        return (byte)_ACL.AclRevision$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AclRevision$set(MemorySegment seg, long index, byte x) {
        _ACL.AclRevision$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Sbz1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Sbz1"));
    public static VarHandle Sbz1$VH() {
        return _ACL.Sbz1$VH;
    }
    public static byte Sbz1$get(MemorySegment seg) {
        return (byte)_ACL.Sbz1$VH.get(seg);
    }
    public static void Sbz1$set( MemorySegment seg, byte x) {
        _ACL.Sbz1$VH.set(seg, x);
    }
    public static byte Sbz1$get(MemorySegment seg, long index) {
        return (byte)_ACL.Sbz1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Sbz1$set(MemorySegment seg, long index, byte x) {
        _ACL.Sbz1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle AclSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AclSize"));
    public static VarHandle AclSize$VH() {
        return _ACL.AclSize$VH;
    }
    public static short AclSize$get(MemorySegment seg) {
        return (short)_ACL.AclSize$VH.get(seg);
    }
    public static void AclSize$set( MemorySegment seg, short x) {
        _ACL.AclSize$VH.set(seg, x);
    }
    public static short AclSize$get(MemorySegment seg, long index) {
        return (short)_ACL.AclSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AclSize$set(MemorySegment seg, long index, short x) {
        _ACL.AclSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle AceCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AceCount"));
    public static VarHandle AceCount$VH() {
        return _ACL.AceCount$VH;
    }
    public static short AceCount$get(MemorySegment seg) {
        return (short)_ACL.AceCount$VH.get(seg);
    }
    public static void AceCount$set( MemorySegment seg, short x) {
        _ACL.AceCount$VH.set(seg, x);
    }
    public static short AceCount$get(MemorySegment seg, long index) {
        return (short)_ACL.AceCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AceCount$set(MemorySegment seg, long index, short x) {
        _ACL.AceCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Sbz2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Sbz2"));
    public static VarHandle Sbz2$VH() {
        return _ACL.Sbz2$VH;
    }
    public static short Sbz2$get(MemorySegment seg) {
        return (short)_ACL.Sbz2$VH.get(seg);
    }
    public static void Sbz2$set( MemorySegment seg, short x) {
        _ACL.Sbz2$VH.set(seg, x);
    }
    public static short Sbz2$get(MemorySegment seg, long index) {
        return (short)_ACL.Sbz2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Sbz2$set(MemorySegment seg, long index, short x) {
        _ACL.Sbz2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


