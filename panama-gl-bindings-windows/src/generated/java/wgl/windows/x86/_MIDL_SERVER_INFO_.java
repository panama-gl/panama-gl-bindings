// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _MIDL_SERVER_INFO_ {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("pStubDesc"),
        Constants$root.C_POINTER$LAYOUT.withName("DispatchTable"),
        Constants$root.C_POINTER$LAYOUT.withName("ProcString"),
        Constants$root.C_POINTER$LAYOUT.withName("FmtStringOffset"),
        Constants$root.C_POINTER$LAYOUT.withName("ThunkTable"),
        Constants$root.C_POINTER$LAYOUT.withName("pTransferSyntax"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("nCount"),
        Constants$root.C_POINTER$LAYOUT.withName("pSyntaxInfo")
    ).withName("_MIDL_SERVER_INFO_");
    public static MemoryLayout $LAYOUT() {
        return _MIDL_SERVER_INFO_.$struct$LAYOUT;
    }
    static final VarHandle pStubDesc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pStubDesc"));
    public static VarHandle pStubDesc$VH() {
        return _MIDL_SERVER_INFO_.pStubDesc$VH;
    }
    public static MemoryAddress pStubDesc$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_MIDL_SERVER_INFO_.pStubDesc$VH.get(seg);
    }
    public static void pStubDesc$set( MemorySegment seg, MemoryAddress x) {
        _MIDL_SERVER_INFO_.pStubDesc$VH.set(seg, x);
    }
    public static MemoryAddress pStubDesc$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_MIDL_SERVER_INFO_.pStubDesc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pStubDesc$set(MemorySegment seg, long index, MemoryAddress x) {
        _MIDL_SERVER_INFO_.pStubDesc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DispatchTable$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DispatchTable"));
    public static VarHandle DispatchTable$VH() {
        return _MIDL_SERVER_INFO_.DispatchTable$VH;
    }
    public static MemoryAddress DispatchTable$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_MIDL_SERVER_INFO_.DispatchTable$VH.get(seg);
    }
    public static void DispatchTable$set( MemorySegment seg, MemoryAddress x) {
        _MIDL_SERVER_INFO_.DispatchTable$VH.set(seg, x);
    }
    public static MemoryAddress DispatchTable$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_MIDL_SERVER_INFO_.DispatchTable$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DispatchTable$set(MemorySegment seg, long index, MemoryAddress x) {
        _MIDL_SERVER_INFO_.DispatchTable$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ProcString$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ProcString"));
    public static VarHandle ProcString$VH() {
        return _MIDL_SERVER_INFO_.ProcString$VH;
    }
    public static MemoryAddress ProcString$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_MIDL_SERVER_INFO_.ProcString$VH.get(seg);
    }
    public static void ProcString$set( MemorySegment seg, MemoryAddress x) {
        _MIDL_SERVER_INFO_.ProcString$VH.set(seg, x);
    }
    public static MemoryAddress ProcString$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_MIDL_SERVER_INFO_.ProcString$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ProcString$set(MemorySegment seg, long index, MemoryAddress x) {
        _MIDL_SERVER_INFO_.ProcString$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle FmtStringOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FmtStringOffset"));
    public static VarHandle FmtStringOffset$VH() {
        return _MIDL_SERVER_INFO_.FmtStringOffset$VH;
    }
    public static MemoryAddress FmtStringOffset$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_MIDL_SERVER_INFO_.FmtStringOffset$VH.get(seg);
    }
    public static void FmtStringOffset$set( MemorySegment seg, MemoryAddress x) {
        _MIDL_SERVER_INFO_.FmtStringOffset$VH.set(seg, x);
    }
    public static MemoryAddress FmtStringOffset$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_MIDL_SERVER_INFO_.FmtStringOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FmtStringOffset$set(MemorySegment seg, long index, MemoryAddress x) {
        _MIDL_SERVER_INFO_.FmtStringOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ThunkTable$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ThunkTable"));
    public static VarHandle ThunkTable$VH() {
        return _MIDL_SERVER_INFO_.ThunkTable$VH;
    }
    public static MemoryAddress ThunkTable$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_MIDL_SERVER_INFO_.ThunkTable$VH.get(seg);
    }
    public static void ThunkTable$set( MemorySegment seg, MemoryAddress x) {
        _MIDL_SERVER_INFO_.ThunkTable$VH.set(seg, x);
    }
    public static MemoryAddress ThunkTable$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_MIDL_SERVER_INFO_.ThunkTable$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ThunkTable$set(MemorySegment seg, long index, MemoryAddress x) {
        _MIDL_SERVER_INFO_.ThunkTable$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pTransferSyntax$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pTransferSyntax"));
    public static VarHandle pTransferSyntax$VH() {
        return _MIDL_SERVER_INFO_.pTransferSyntax$VH;
    }
    public static MemoryAddress pTransferSyntax$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_MIDL_SERVER_INFO_.pTransferSyntax$VH.get(seg);
    }
    public static void pTransferSyntax$set( MemorySegment seg, MemoryAddress x) {
        _MIDL_SERVER_INFO_.pTransferSyntax$VH.set(seg, x);
    }
    public static MemoryAddress pTransferSyntax$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_MIDL_SERVER_INFO_.pTransferSyntax$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pTransferSyntax$set(MemorySegment seg, long index, MemoryAddress x) {
        _MIDL_SERVER_INFO_.pTransferSyntax$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nCount"));
    public static VarHandle nCount$VH() {
        return _MIDL_SERVER_INFO_.nCount$VH;
    }
    public static long nCount$get(MemorySegment seg) {
        return (long)_MIDL_SERVER_INFO_.nCount$VH.get(seg);
    }
    public static void nCount$set( MemorySegment seg, long x) {
        _MIDL_SERVER_INFO_.nCount$VH.set(seg, x);
    }
    public static long nCount$get(MemorySegment seg, long index) {
        return (long)_MIDL_SERVER_INFO_.nCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nCount$set(MemorySegment seg, long index, long x) {
        _MIDL_SERVER_INFO_.nCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pSyntaxInfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pSyntaxInfo"));
    public static VarHandle pSyntaxInfo$VH() {
        return _MIDL_SERVER_INFO_.pSyntaxInfo$VH;
    }
    public static MemoryAddress pSyntaxInfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_MIDL_SERVER_INFO_.pSyntaxInfo$VH.get(seg);
    }
    public static void pSyntaxInfo$set( MemorySegment seg, MemoryAddress x) {
        _MIDL_SERVER_INFO_.pSyntaxInfo$VH.set(seg, x);
    }
    public static MemoryAddress pSyntaxInfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_MIDL_SERVER_INFO_.pSyntaxInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pSyntaxInfo$set(MemorySegment seg, long index, MemoryAddress x) {
        _MIDL_SERVER_INFO_.pSyntaxInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


