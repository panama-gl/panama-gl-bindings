// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _SE_ACCESS_REQUEST {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("SeSecurityDescriptor"),
        Constants$root.C_LONG$LAYOUT.withName("DesiredAccess"),
        Constants$root.C_LONG$LAYOUT.withName("PreviouslyGrantedAccess"),
        Constants$root.C_POINTER$LAYOUT.withName("PrincipalSelfSid"),
        Constants$root.C_POINTER$LAYOUT.withName("GenericMapping"),
        Constants$root.C_LONG$LAYOUT.withName("ObjectTypeListCount"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("ObjectTypeList")
    ).withName("_SE_ACCESS_REQUEST");
    public static MemoryLayout $LAYOUT() {
        return _SE_ACCESS_REQUEST.$struct$LAYOUT;
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _SE_ACCESS_REQUEST.Size$VH;
    }
    public static int Size$get(MemorySegment seg) {
        return (int)_SE_ACCESS_REQUEST.Size$VH.get(seg);
    }
    public static void Size$set( MemorySegment seg, int x) {
        _SE_ACCESS_REQUEST.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_SE_ACCESS_REQUEST.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _SE_ACCESS_REQUEST.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SeSecurityDescriptor$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SeSecurityDescriptor"));
    public static VarHandle SeSecurityDescriptor$VH() {
        return _SE_ACCESS_REQUEST.SeSecurityDescriptor$VH;
    }
    public static MemoryAddress SeSecurityDescriptor$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_SE_ACCESS_REQUEST.SeSecurityDescriptor$VH.get(seg);
    }
    public static void SeSecurityDescriptor$set( MemorySegment seg, MemoryAddress x) {
        _SE_ACCESS_REQUEST.SeSecurityDescriptor$VH.set(seg, x);
    }
    public static MemoryAddress SeSecurityDescriptor$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_SE_ACCESS_REQUEST.SeSecurityDescriptor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SeSecurityDescriptor$set(MemorySegment seg, long index, MemoryAddress x) {
        _SE_ACCESS_REQUEST.SeSecurityDescriptor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DesiredAccess$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DesiredAccess"));
    public static VarHandle DesiredAccess$VH() {
        return _SE_ACCESS_REQUEST.DesiredAccess$VH;
    }
    public static int DesiredAccess$get(MemorySegment seg) {
        return (int)_SE_ACCESS_REQUEST.DesiredAccess$VH.get(seg);
    }
    public static void DesiredAccess$set( MemorySegment seg, int x) {
        _SE_ACCESS_REQUEST.DesiredAccess$VH.set(seg, x);
    }
    public static int DesiredAccess$get(MemorySegment seg, long index) {
        return (int)_SE_ACCESS_REQUEST.DesiredAccess$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DesiredAccess$set(MemorySegment seg, long index, int x) {
        _SE_ACCESS_REQUEST.DesiredAccess$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle PreviouslyGrantedAccess$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PreviouslyGrantedAccess"));
    public static VarHandle PreviouslyGrantedAccess$VH() {
        return _SE_ACCESS_REQUEST.PreviouslyGrantedAccess$VH;
    }
    public static int PreviouslyGrantedAccess$get(MemorySegment seg) {
        return (int)_SE_ACCESS_REQUEST.PreviouslyGrantedAccess$VH.get(seg);
    }
    public static void PreviouslyGrantedAccess$set( MemorySegment seg, int x) {
        _SE_ACCESS_REQUEST.PreviouslyGrantedAccess$VH.set(seg, x);
    }
    public static int PreviouslyGrantedAccess$get(MemorySegment seg, long index) {
        return (int)_SE_ACCESS_REQUEST.PreviouslyGrantedAccess$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PreviouslyGrantedAccess$set(MemorySegment seg, long index, int x) {
        _SE_ACCESS_REQUEST.PreviouslyGrantedAccess$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle PrincipalSelfSid$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PrincipalSelfSid"));
    public static VarHandle PrincipalSelfSid$VH() {
        return _SE_ACCESS_REQUEST.PrincipalSelfSid$VH;
    }
    public static MemoryAddress PrincipalSelfSid$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_SE_ACCESS_REQUEST.PrincipalSelfSid$VH.get(seg);
    }
    public static void PrincipalSelfSid$set( MemorySegment seg, MemoryAddress x) {
        _SE_ACCESS_REQUEST.PrincipalSelfSid$VH.set(seg, x);
    }
    public static MemoryAddress PrincipalSelfSid$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_SE_ACCESS_REQUEST.PrincipalSelfSid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PrincipalSelfSid$set(MemorySegment seg, long index, MemoryAddress x) {
        _SE_ACCESS_REQUEST.PrincipalSelfSid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle GenericMapping$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GenericMapping"));
    public static VarHandle GenericMapping$VH() {
        return _SE_ACCESS_REQUEST.GenericMapping$VH;
    }
    public static MemoryAddress GenericMapping$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_SE_ACCESS_REQUEST.GenericMapping$VH.get(seg);
    }
    public static void GenericMapping$set( MemorySegment seg, MemoryAddress x) {
        _SE_ACCESS_REQUEST.GenericMapping$VH.set(seg, x);
    }
    public static MemoryAddress GenericMapping$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_SE_ACCESS_REQUEST.GenericMapping$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GenericMapping$set(MemorySegment seg, long index, MemoryAddress x) {
        _SE_ACCESS_REQUEST.GenericMapping$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ObjectTypeListCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ObjectTypeListCount"));
    public static VarHandle ObjectTypeListCount$VH() {
        return _SE_ACCESS_REQUEST.ObjectTypeListCount$VH;
    }
    public static int ObjectTypeListCount$get(MemorySegment seg) {
        return (int)_SE_ACCESS_REQUEST.ObjectTypeListCount$VH.get(seg);
    }
    public static void ObjectTypeListCount$set( MemorySegment seg, int x) {
        _SE_ACCESS_REQUEST.ObjectTypeListCount$VH.set(seg, x);
    }
    public static int ObjectTypeListCount$get(MemorySegment seg, long index) {
        return (int)_SE_ACCESS_REQUEST.ObjectTypeListCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ObjectTypeListCount$set(MemorySegment seg, long index, int x) {
        _SE_ACCESS_REQUEST.ObjectTypeListCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ObjectTypeList$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ObjectTypeList"));
    public static VarHandle ObjectTypeList$VH() {
        return _SE_ACCESS_REQUEST.ObjectTypeList$VH;
    }
    public static MemoryAddress ObjectTypeList$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_SE_ACCESS_REQUEST.ObjectTypeList$VH.get(seg);
    }
    public static void ObjectTypeList$set( MemorySegment seg, MemoryAddress x) {
        _SE_ACCESS_REQUEST.ObjectTypeList$VH.set(seg, x);
    }
    public static MemoryAddress ObjectTypeList$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_SE_ACCESS_REQUEST.ObjectTypeList$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ObjectTypeList$set(MemorySegment seg, long index, MemoryAddress x) {
        _SE_ACCESS_REQUEST.ObjectTypeList$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


