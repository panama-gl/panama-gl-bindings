// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _RPC_MESSAGE {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("Handle"),
        Constants$root.C_LONG$LAYOUT.withName("DataRepresentation"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("Buffer"),
        Constants$root.C_LONG$LAYOUT.withName("BufferLength"),
        Constants$root.C_LONG$LAYOUT.withName("ProcNum"),
        Constants$root.C_POINTER$LAYOUT.withName("TransferSyntax"),
        Constants$root.C_POINTER$LAYOUT.withName("RpcInterfaceInformation"),
        Constants$root.C_POINTER$LAYOUT.withName("ReservedForRuntime"),
        Constants$root.C_POINTER$LAYOUT.withName("ManagerEpv"),
        Constants$root.C_POINTER$LAYOUT.withName("ImportContext"),
        Constants$root.C_LONG$LAYOUT.withName("RpcFlags"),
        MemoryLayout.paddingLayout(32)
    ).withName("_RPC_MESSAGE");
    public static MemoryLayout $LAYOUT() {
        return _RPC_MESSAGE.$struct$LAYOUT;
    }
    static final VarHandle Handle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Handle"));
    public static VarHandle Handle$VH() {
        return _RPC_MESSAGE.Handle$VH;
    }
    public static MemoryAddress Handle$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_RPC_MESSAGE.Handle$VH.get(seg);
    }
    public static void Handle$set( MemorySegment seg, MemoryAddress x) {
        _RPC_MESSAGE.Handle$VH.set(seg, x);
    }
    public static MemoryAddress Handle$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_RPC_MESSAGE.Handle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Handle$set(MemorySegment seg, long index, MemoryAddress x) {
        _RPC_MESSAGE.Handle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DataRepresentation$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DataRepresentation"));
    public static VarHandle DataRepresentation$VH() {
        return _RPC_MESSAGE.DataRepresentation$VH;
    }
    public static int DataRepresentation$get(MemorySegment seg) {
        return (int)_RPC_MESSAGE.DataRepresentation$VH.get(seg);
    }
    public static void DataRepresentation$set( MemorySegment seg, int x) {
        _RPC_MESSAGE.DataRepresentation$VH.set(seg, x);
    }
    public static int DataRepresentation$get(MemorySegment seg, long index) {
        return (int)_RPC_MESSAGE.DataRepresentation$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DataRepresentation$set(MemorySegment seg, long index, int x) {
        _RPC_MESSAGE.DataRepresentation$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Buffer$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Buffer"));
    public static VarHandle Buffer$VH() {
        return _RPC_MESSAGE.Buffer$VH;
    }
    public static MemoryAddress Buffer$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_RPC_MESSAGE.Buffer$VH.get(seg);
    }
    public static void Buffer$set( MemorySegment seg, MemoryAddress x) {
        _RPC_MESSAGE.Buffer$VH.set(seg, x);
    }
    public static MemoryAddress Buffer$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_RPC_MESSAGE.Buffer$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Buffer$set(MemorySegment seg, long index, MemoryAddress x) {
        _RPC_MESSAGE.Buffer$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle BufferLength$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BufferLength"));
    public static VarHandle BufferLength$VH() {
        return _RPC_MESSAGE.BufferLength$VH;
    }
    public static int BufferLength$get(MemorySegment seg) {
        return (int)_RPC_MESSAGE.BufferLength$VH.get(seg);
    }
    public static void BufferLength$set( MemorySegment seg, int x) {
        _RPC_MESSAGE.BufferLength$VH.set(seg, x);
    }
    public static int BufferLength$get(MemorySegment seg, long index) {
        return (int)_RPC_MESSAGE.BufferLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BufferLength$set(MemorySegment seg, long index, int x) {
        _RPC_MESSAGE.BufferLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ProcNum$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ProcNum"));
    public static VarHandle ProcNum$VH() {
        return _RPC_MESSAGE.ProcNum$VH;
    }
    public static int ProcNum$get(MemorySegment seg) {
        return (int)_RPC_MESSAGE.ProcNum$VH.get(seg);
    }
    public static void ProcNum$set( MemorySegment seg, int x) {
        _RPC_MESSAGE.ProcNum$VH.set(seg, x);
    }
    public static int ProcNum$get(MemorySegment seg, long index) {
        return (int)_RPC_MESSAGE.ProcNum$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ProcNum$set(MemorySegment seg, long index, int x) {
        _RPC_MESSAGE.ProcNum$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TransferSyntax$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("TransferSyntax"));
    public static VarHandle TransferSyntax$VH() {
        return _RPC_MESSAGE.TransferSyntax$VH;
    }
    public static MemoryAddress TransferSyntax$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_RPC_MESSAGE.TransferSyntax$VH.get(seg);
    }
    public static void TransferSyntax$set( MemorySegment seg, MemoryAddress x) {
        _RPC_MESSAGE.TransferSyntax$VH.set(seg, x);
    }
    public static MemoryAddress TransferSyntax$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_RPC_MESSAGE.TransferSyntax$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TransferSyntax$set(MemorySegment seg, long index, MemoryAddress x) {
        _RPC_MESSAGE.TransferSyntax$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle RpcInterfaceInformation$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("RpcInterfaceInformation"));
    public static VarHandle RpcInterfaceInformation$VH() {
        return _RPC_MESSAGE.RpcInterfaceInformation$VH;
    }
    public static MemoryAddress RpcInterfaceInformation$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_RPC_MESSAGE.RpcInterfaceInformation$VH.get(seg);
    }
    public static void RpcInterfaceInformation$set( MemorySegment seg, MemoryAddress x) {
        _RPC_MESSAGE.RpcInterfaceInformation$VH.set(seg, x);
    }
    public static MemoryAddress RpcInterfaceInformation$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_RPC_MESSAGE.RpcInterfaceInformation$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RpcInterfaceInformation$set(MemorySegment seg, long index, MemoryAddress x) {
        _RPC_MESSAGE.RpcInterfaceInformation$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ReservedForRuntime$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ReservedForRuntime"));
    public static VarHandle ReservedForRuntime$VH() {
        return _RPC_MESSAGE.ReservedForRuntime$VH;
    }
    public static MemoryAddress ReservedForRuntime$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_RPC_MESSAGE.ReservedForRuntime$VH.get(seg);
    }
    public static void ReservedForRuntime$set( MemorySegment seg, MemoryAddress x) {
        _RPC_MESSAGE.ReservedForRuntime$VH.set(seg, x);
    }
    public static MemoryAddress ReservedForRuntime$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_RPC_MESSAGE.ReservedForRuntime$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ReservedForRuntime$set(MemorySegment seg, long index, MemoryAddress x) {
        _RPC_MESSAGE.ReservedForRuntime$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ManagerEpv$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ManagerEpv"));
    public static VarHandle ManagerEpv$VH() {
        return _RPC_MESSAGE.ManagerEpv$VH;
    }
    public static MemoryAddress ManagerEpv$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_RPC_MESSAGE.ManagerEpv$VH.get(seg);
    }
    public static void ManagerEpv$set( MemorySegment seg, MemoryAddress x) {
        _RPC_MESSAGE.ManagerEpv$VH.set(seg, x);
    }
    public static MemoryAddress ManagerEpv$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_RPC_MESSAGE.ManagerEpv$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ManagerEpv$set(MemorySegment seg, long index, MemoryAddress x) {
        _RPC_MESSAGE.ManagerEpv$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ImportContext$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ImportContext"));
    public static VarHandle ImportContext$VH() {
        return _RPC_MESSAGE.ImportContext$VH;
    }
    public static MemoryAddress ImportContext$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_RPC_MESSAGE.ImportContext$VH.get(seg);
    }
    public static void ImportContext$set( MemorySegment seg, MemoryAddress x) {
        _RPC_MESSAGE.ImportContext$VH.set(seg, x);
    }
    public static MemoryAddress ImportContext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_RPC_MESSAGE.ImportContext$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ImportContext$set(MemorySegment seg, long index, MemoryAddress x) {
        _RPC_MESSAGE.ImportContext$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle RpcFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("RpcFlags"));
    public static VarHandle RpcFlags$VH() {
        return _RPC_MESSAGE.RpcFlags$VH;
    }
    public static int RpcFlags$get(MemorySegment seg) {
        return (int)_RPC_MESSAGE.RpcFlags$VH.get(seg);
    }
    public static void RpcFlags$set( MemorySegment seg, int x) {
        _RPC_MESSAGE.RpcFlags$VH.set(seg, x);
    }
    public static int RpcFlags$get(MemorySegment seg, long index) {
        return (int)_RPC_MESSAGE.RpcFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RpcFlags$set(MemorySegment seg, long index, int x) {
        _RPC_MESSAGE.RpcFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


