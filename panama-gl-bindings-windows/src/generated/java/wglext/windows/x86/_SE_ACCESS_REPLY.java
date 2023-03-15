// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _SE_ACCESS_REPLY {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        Constants$root.C_LONG$LAYOUT.withName("ResultListCount"),
        Constants$root.C_POINTER$LAYOUT.withName("GrantedAccess"),
        Constants$root.C_POINTER$LAYOUT.withName("AccessStatus"),
        Constants$root.C_POINTER$LAYOUT.withName("AccessReason"),
        Constants$root.C_POINTER$LAYOUT.withName("Privileges")
    ).withName("_SE_ACCESS_REPLY");
    public static MemoryLayout $LAYOUT() {
        return _SE_ACCESS_REPLY.$struct$LAYOUT;
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _SE_ACCESS_REPLY.Size$VH;
    }
    public static int Size$get(MemorySegment seg) {
        return (int)_SE_ACCESS_REPLY.Size$VH.get(seg);
    }
    public static void Size$set( MemorySegment seg, int x) {
        _SE_ACCESS_REPLY.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_SE_ACCESS_REPLY.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _SE_ACCESS_REPLY.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ResultListCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ResultListCount"));
    public static VarHandle ResultListCount$VH() {
        return _SE_ACCESS_REPLY.ResultListCount$VH;
    }
    public static int ResultListCount$get(MemorySegment seg) {
        return (int)_SE_ACCESS_REPLY.ResultListCount$VH.get(seg);
    }
    public static void ResultListCount$set( MemorySegment seg, int x) {
        _SE_ACCESS_REPLY.ResultListCount$VH.set(seg, x);
    }
    public static int ResultListCount$get(MemorySegment seg, long index) {
        return (int)_SE_ACCESS_REPLY.ResultListCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ResultListCount$set(MemorySegment seg, long index, int x) {
        _SE_ACCESS_REPLY.ResultListCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle GrantedAccess$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GrantedAccess"));
    public static VarHandle GrantedAccess$VH() {
        return _SE_ACCESS_REPLY.GrantedAccess$VH;
    }
    public static MemoryAddress GrantedAccess$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_SE_ACCESS_REPLY.GrantedAccess$VH.get(seg);
    }
    public static void GrantedAccess$set( MemorySegment seg, MemoryAddress x) {
        _SE_ACCESS_REPLY.GrantedAccess$VH.set(seg, x);
    }
    public static MemoryAddress GrantedAccess$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_SE_ACCESS_REPLY.GrantedAccess$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GrantedAccess$set(MemorySegment seg, long index, MemoryAddress x) {
        _SE_ACCESS_REPLY.GrantedAccess$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle AccessStatus$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AccessStatus"));
    public static VarHandle AccessStatus$VH() {
        return _SE_ACCESS_REPLY.AccessStatus$VH;
    }
    public static MemoryAddress AccessStatus$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_SE_ACCESS_REPLY.AccessStatus$VH.get(seg);
    }
    public static void AccessStatus$set( MemorySegment seg, MemoryAddress x) {
        _SE_ACCESS_REPLY.AccessStatus$VH.set(seg, x);
    }
    public static MemoryAddress AccessStatus$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_SE_ACCESS_REPLY.AccessStatus$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AccessStatus$set(MemorySegment seg, long index, MemoryAddress x) {
        _SE_ACCESS_REPLY.AccessStatus$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle AccessReason$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AccessReason"));
    public static VarHandle AccessReason$VH() {
        return _SE_ACCESS_REPLY.AccessReason$VH;
    }
    public static MemoryAddress AccessReason$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_SE_ACCESS_REPLY.AccessReason$VH.get(seg);
    }
    public static void AccessReason$set( MemorySegment seg, MemoryAddress x) {
        _SE_ACCESS_REPLY.AccessReason$VH.set(seg, x);
    }
    public static MemoryAddress AccessReason$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_SE_ACCESS_REPLY.AccessReason$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AccessReason$set(MemorySegment seg, long index, MemoryAddress x) {
        _SE_ACCESS_REPLY.AccessReason$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Privileges$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Privileges"));
    public static VarHandle Privileges$VH() {
        return _SE_ACCESS_REPLY.Privileges$VH;
    }
    public static MemoryAddress Privileges$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_SE_ACCESS_REPLY.Privileges$VH.get(seg);
    }
    public static void Privileges$set( MemorySegment seg, MemoryAddress x) {
        _SE_ACCESS_REPLY.Privileges$VH.set(seg, x);
    }
    public static MemoryAddress Privileges$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_SE_ACCESS_REPLY.Privileges$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Privileges$set(MemorySegment seg, long index, MemoryAddress x) {
        _SE_ACCESS_REPLY.Privileges$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


