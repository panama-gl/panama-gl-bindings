// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _MIDL_STUBLESS_PROXY_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("pStubDesc"),
        Constants$root.C_POINTER$LAYOUT.withName("ProcFormatString"),
        Constants$root.C_POINTER$LAYOUT.withName("FormatStringOffset"),
        Constants$root.C_POINTER$LAYOUT.withName("pTransferSyntax"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("nCount"),
        Constants$root.C_POINTER$LAYOUT.withName("pSyntaxInfo")
    ).withName("_MIDL_STUBLESS_PROXY_INFO");
    public static MemoryLayout $LAYOUT() {
        return _MIDL_STUBLESS_PROXY_INFO.$struct$LAYOUT;
    }
    static final VarHandle pStubDesc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pStubDesc"));
    public static VarHandle pStubDesc$VH() {
        return _MIDL_STUBLESS_PROXY_INFO.pStubDesc$VH;
    }
    public static MemoryAddress pStubDesc$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_MIDL_STUBLESS_PROXY_INFO.pStubDesc$VH.get(seg);
    }
    public static void pStubDesc$set( MemorySegment seg, MemoryAddress x) {
        _MIDL_STUBLESS_PROXY_INFO.pStubDesc$VH.set(seg, x);
    }
    public static MemoryAddress pStubDesc$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_MIDL_STUBLESS_PROXY_INFO.pStubDesc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pStubDesc$set(MemorySegment seg, long index, MemoryAddress x) {
        _MIDL_STUBLESS_PROXY_INFO.pStubDesc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ProcFormatString$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ProcFormatString"));
    public static VarHandle ProcFormatString$VH() {
        return _MIDL_STUBLESS_PROXY_INFO.ProcFormatString$VH;
    }
    public static MemoryAddress ProcFormatString$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_MIDL_STUBLESS_PROXY_INFO.ProcFormatString$VH.get(seg);
    }
    public static void ProcFormatString$set( MemorySegment seg, MemoryAddress x) {
        _MIDL_STUBLESS_PROXY_INFO.ProcFormatString$VH.set(seg, x);
    }
    public static MemoryAddress ProcFormatString$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_MIDL_STUBLESS_PROXY_INFO.ProcFormatString$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ProcFormatString$set(MemorySegment seg, long index, MemoryAddress x) {
        _MIDL_STUBLESS_PROXY_INFO.ProcFormatString$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle FormatStringOffset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FormatStringOffset"));
    public static VarHandle FormatStringOffset$VH() {
        return _MIDL_STUBLESS_PROXY_INFO.FormatStringOffset$VH;
    }
    public static MemoryAddress FormatStringOffset$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_MIDL_STUBLESS_PROXY_INFO.FormatStringOffset$VH.get(seg);
    }
    public static void FormatStringOffset$set( MemorySegment seg, MemoryAddress x) {
        _MIDL_STUBLESS_PROXY_INFO.FormatStringOffset$VH.set(seg, x);
    }
    public static MemoryAddress FormatStringOffset$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_MIDL_STUBLESS_PROXY_INFO.FormatStringOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FormatStringOffset$set(MemorySegment seg, long index, MemoryAddress x) {
        _MIDL_STUBLESS_PROXY_INFO.FormatStringOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pTransferSyntax$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pTransferSyntax"));
    public static VarHandle pTransferSyntax$VH() {
        return _MIDL_STUBLESS_PROXY_INFO.pTransferSyntax$VH;
    }
    public static MemoryAddress pTransferSyntax$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_MIDL_STUBLESS_PROXY_INFO.pTransferSyntax$VH.get(seg);
    }
    public static void pTransferSyntax$set( MemorySegment seg, MemoryAddress x) {
        _MIDL_STUBLESS_PROXY_INFO.pTransferSyntax$VH.set(seg, x);
    }
    public static MemoryAddress pTransferSyntax$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_MIDL_STUBLESS_PROXY_INFO.pTransferSyntax$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pTransferSyntax$set(MemorySegment seg, long index, MemoryAddress x) {
        _MIDL_STUBLESS_PROXY_INFO.pTransferSyntax$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nCount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("nCount"));
    public static VarHandle nCount$VH() {
        return _MIDL_STUBLESS_PROXY_INFO.nCount$VH;
    }
    public static long nCount$get(MemorySegment seg) {
        return (long)_MIDL_STUBLESS_PROXY_INFO.nCount$VH.get(seg);
    }
    public static void nCount$set( MemorySegment seg, long x) {
        _MIDL_STUBLESS_PROXY_INFO.nCount$VH.set(seg, x);
    }
    public static long nCount$get(MemorySegment seg, long index) {
        return (long)_MIDL_STUBLESS_PROXY_INFO.nCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nCount$set(MemorySegment seg, long index, long x) {
        _MIDL_STUBLESS_PROXY_INFO.nCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pSyntaxInfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pSyntaxInfo"));
    public static VarHandle pSyntaxInfo$VH() {
        return _MIDL_STUBLESS_PROXY_INFO.pSyntaxInfo$VH;
    }
    public static MemoryAddress pSyntaxInfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_MIDL_STUBLESS_PROXY_INFO.pSyntaxInfo$VH.get(seg);
    }
    public static void pSyntaxInfo$set( MemorySegment seg, MemoryAddress x) {
        _MIDL_STUBLESS_PROXY_INFO.pSyntaxInfo$VH.set(seg, x);
    }
    public static MemoryAddress pSyntaxInfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_MIDL_STUBLESS_PROXY_INFO.pSyntaxInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pSyntaxInfo$set(MemorySegment seg, long index, MemoryAddress x) {
        _MIDL_STUBLESS_PROXY_INFO.pSyntaxInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


