// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagI_RpcProxyCallbackInterface {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("IsValidMachineFn"),
        Constants$root.C_POINTER$LAYOUT.withName("GetClientAddressFn"),
        Constants$root.C_POINTER$LAYOUT.withName("GetConnectionTimeoutFn"),
        Constants$root.C_POINTER$LAYOUT.withName("PerformCalloutFn"),
        Constants$root.C_POINTER$LAYOUT.withName("FreeCalloutStateFn"),
        Constants$root.C_POINTER$LAYOUT.withName("GetClientSessionAndResourceUUIDFn"),
        Constants$root.C_POINTER$LAYOUT.withName("ProxyFilterIfFn"),
        Constants$root.C_POINTER$LAYOUT.withName("RpcProxyUpdatePerfCounterFn"),
        Constants$root.C_POINTER$LAYOUT.withName("RpcProxyUpdatePerfCounterBackendServerFn")
    ).withName("tagI_RpcProxyCallbackInterface");
    public static MemoryLayout $LAYOUT() {
        return tagI_RpcProxyCallbackInterface.$struct$LAYOUT;
    }
    static final VarHandle IsValidMachineFn$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("IsValidMachineFn"));
    public static VarHandle IsValidMachineFn$VH() {
        return tagI_RpcProxyCallbackInterface.IsValidMachineFn$VH;
    }
    public static MemoryAddress IsValidMachineFn$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagI_RpcProxyCallbackInterface.IsValidMachineFn$VH.get(seg);
    }
    public static void IsValidMachineFn$set( MemorySegment seg, MemoryAddress x) {
        tagI_RpcProxyCallbackInterface.IsValidMachineFn$VH.set(seg, x);
    }
    public static MemoryAddress IsValidMachineFn$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagI_RpcProxyCallbackInterface.IsValidMachineFn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void IsValidMachineFn$set(MemorySegment seg, long index, MemoryAddress x) {
        tagI_RpcProxyCallbackInterface.IsValidMachineFn$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static I_RpcProxyIsValidMachineFn IsValidMachineFn (MemorySegment segment, MemorySession session) {
        return I_RpcProxyIsValidMachineFn.ofAddress(IsValidMachineFn$get(segment), session);
    }
    static final VarHandle GetClientAddressFn$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetClientAddressFn"));
    public static VarHandle GetClientAddressFn$VH() {
        return tagI_RpcProxyCallbackInterface.GetClientAddressFn$VH;
    }
    public static MemoryAddress GetClientAddressFn$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagI_RpcProxyCallbackInterface.GetClientAddressFn$VH.get(seg);
    }
    public static void GetClientAddressFn$set( MemorySegment seg, MemoryAddress x) {
        tagI_RpcProxyCallbackInterface.GetClientAddressFn$VH.set(seg, x);
    }
    public static MemoryAddress GetClientAddressFn$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagI_RpcProxyCallbackInterface.GetClientAddressFn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetClientAddressFn$set(MemorySegment seg, long index, MemoryAddress x) {
        tagI_RpcProxyCallbackInterface.GetClientAddressFn$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static I_RpcProxyGetClientAddressFn GetClientAddressFn (MemorySegment segment, MemorySession session) {
        return I_RpcProxyGetClientAddressFn.ofAddress(GetClientAddressFn$get(segment), session);
    }
    static final VarHandle GetConnectionTimeoutFn$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetConnectionTimeoutFn"));
    public static VarHandle GetConnectionTimeoutFn$VH() {
        return tagI_RpcProxyCallbackInterface.GetConnectionTimeoutFn$VH;
    }
    public static MemoryAddress GetConnectionTimeoutFn$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagI_RpcProxyCallbackInterface.GetConnectionTimeoutFn$VH.get(seg);
    }
    public static void GetConnectionTimeoutFn$set( MemorySegment seg, MemoryAddress x) {
        tagI_RpcProxyCallbackInterface.GetConnectionTimeoutFn$VH.set(seg, x);
    }
    public static MemoryAddress GetConnectionTimeoutFn$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagI_RpcProxyCallbackInterface.GetConnectionTimeoutFn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetConnectionTimeoutFn$set(MemorySegment seg, long index, MemoryAddress x) {
        tagI_RpcProxyCallbackInterface.GetConnectionTimeoutFn$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static I_RpcProxyGetConnectionTimeoutFn GetConnectionTimeoutFn (MemorySegment segment, MemorySession session) {
        return I_RpcProxyGetConnectionTimeoutFn.ofAddress(GetConnectionTimeoutFn$get(segment), session);
    }
    static final VarHandle PerformCalloutFn$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PerformCalloutFn"));
    public static VarHandle PerformCalloutFn$VH() {
        return tagI_RpcProxyCallbackInterface.PerformCalloutFn$VH;
    }
    public static MemoryAddress PerformCalloutFn$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagI_RpcProxyCallbackInterface.PerformCalloutFn$VH.get(seg);
    }
    public static void PerformCalloutFn$set( MemorySegment seg, MemoryAddress x) {
        tagI_RpcProxyCallbackInterface.PerformCalloutFn$VH.set(seg, x);
    }
    public static MemoryAddress PerformCalloutFn$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagI_RpcProxyCallbackInterface.PerformCalloutFn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PerformCalloutFn$set(MemorySegment seg, long index, MemoryAddress x) {
        tagI_RpcProxyCallbackInterface.PerformCalloutFn$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static I_RpcPerformCalloutFn PerformCalloutFn (MemorySegment segment, MemorySession session) {
        return I_RpcPerformCalloutFn.ofAddress(PerformCalloutFn$get(segment), session);
    }
    static final VarHandle FreeCalloutStateFn$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FreeCalloutStateFn"));
    public static VarHandle FreeCalloutStateFn$VH() {
        return tagI_RpcProxyCallbackInterface.FreeCalloutStateFn$VH;
    }
    public static MemoryAddress FreeCalloutStateFn$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagI_RpcProxyCallbackInterface.FreeCalloutStateFn$VH.get(seg);
    }
    public static void FreeCalloutStateFn$set( MemorySegment seg, MemoryAddress x) {
        tagI_RpcProxyCallbackInterface.FreeCalloutStateFn$VH.set(seg, x);
    }
    public static MemoryAddress FreeCalloutStateFn$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagI_RpcProxyCallbackInterface.FreeCalloutStateFn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FreeCalloutStateFn$set(MemorySegment seg, long index, MemoryAddress x) {
        tagI_RpcProxyCallbackInterface.FreeCalloutStateFn$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static I_RpcFreeCalloutStateFn FreeCalloutStateFn (MemorySegment segment, MemorySession session) {
        return I_RpcFreeCalloutStateFn.ofAddress(FreeCalloutStateFn$get(segment), session);
    }
    static final VarHandle GetClientSessionAndResourceUUIDFn$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetClientSessionAndResourceUUIDFn"));
    public static VarHandle GetClientSessionAndResourceUUIDFn$VH() {
        return tagI_RpcProxyCallbackInterface.GetClientSessionAndResourceUUIDFn$VH;
    }
    public static MemoryAddress GetClientSessionAndResourceUUIDFn$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagI_RpcProxyCallbackInterface.GetClientSessionAndResourceUUIDFn$VH.get(seg);
    }
    public static void GetClientSessionAndResourceUUIDFn$set( MemorySegment seg, MemoryAddress x) {
        tagI_RpcProxyCallbackInterface.GetClientSessionAndResourceUUIDFn$VH.set(seg, x);
    }
    public static MemoryAddress GetClientSessionAndResourceUUIDFn$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagI_RpcProxyCallbackInterface.GetClientSessionAndResourceUUIDFn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetClientSessionAndResourceUUIDFn$set(MemorySegment seg, long index, MemoryAddress x) {
        tagI_RpcProxyCallbackInterface.GetClientSessionAndResourceUUIDFn$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static I_RpcProxyGetClientSessionAndResourceUUID GetClientSessionAndResourceUUIDFn (MemorySegment segment, MemorySession session) {
        return I_RpcProxyGetClientSessionAndResourceUUID.ofAddress(GetClientSessionAndResourceUUIDFn$get(segment), session);
    }
    static final VarHandle ProxyFilterIfFn$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ProxyFilterIfFn"));
    public static VarHandle ProxyFilterIfFn$VH() {
        return tagI_RpcProxyCallbackInterface.ProxyFilterIfFn$VH;
    }
    public static MemoryAddress ProxyFilterIfFn$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagI_RpcProxyCallbackInterface.ProxyFilterIfFn$VH.get(seg);
    }
    public static void ProxyFilterIfFn$set( MemorySegment seg, MemoryAddress x) {
        tagI_RpcProxyCallbackInterface.ProxyFilterIfFn$VH.set(seg, x);
    }
    public static MemoryAddress ProxyFilterIfFn$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagI_RpcProxyCallbackInterface.ProxyFilterIfFn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ProxyFilterIfFn$set(MemorySegment seg, long index, MemoryAddress x) {
        tagI_RpcProxyCallbackInterface.ProxyFilterIfFn$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static I_RpcProxyFilterIfFn ProxyFilterIfFn (MemorySegment segment, MemorySession session) {
        return I_RpcProxyFilterIfFn.ofAddress(ProxyFilterIfFn$get(segment), session);
    }
    static final VarHandle RpcProxyUpdatePerfCounterFn$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("RpcProxyUpdatePerfCounterFn"));
    public static VarHandle RpcProxyUpdatePerfCounterFn$VH() {
        return tagI_RpcProxyCallbackInterface.RpcProxyUpdatePerfCounterFn$VH;
    }
    public static MemoryAddress RpcProxyUpdatePerfCounterFn$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagI_RpcProxyCallbackInterface.RpcProxyUpdatePerfCounterFn$VH.get(seg);
    }
    public static void RpcProxyUpdatePerfCounterFn$set( MemorySegment seg, MemoryAddress x) {
        tagI_RpcProxyCallbackInterface.RpcProxyUpdatePerfCounterFn$VH.set(seg, x);
    }
    public static MemoryAddress RpcProxyUpdatePerfCounterFn$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagI_RpcProxyCallbackInterface.RpcProxyUpdatePerfCounterFn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RpcProxyUpdatePerfCounterFn$set(MemorySegment seg, long index, MemoryAddress x) {
        tagI_RpcProxyCallbackInterface.RpcProxyUpdatePerfCounterFn$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static I_RpcProxyUpdatePerfCounterFn RpcProxyUpdatePerfCounterFn (MemorySegment segment, MemorySession session) {
        return I_RpcProxyUpdatePerfCounterFn.ofAddress(RpcProxyUpdatePerfCounterFn$get(segment), session);
    }
    static final VarHandle RpcProxyUpdatePerfCounterBackendServerFn$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("RpcProxyUpdatePerfCounterBackendServerFn"));
    public static VarHandle RpcProxyUpdatePerfCounterBackendServerFn$VH() {
        return tagI_RpcProxyCallbackInterface.RpcProxyUpdatePerfCounterBackendServerFn$VH;
    }
    public static MemoryAddress RpcProxyUpdatePerfCounterBackendServerFn$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagI_RpcProxyCallbackInterface.RpcProxyUpdatePerfCounterBackendServerFn$VH.get(seg);
    }
    public static void RpcProxyUpdatePerfCounterBackendServerFn$set( MemorySegment seg, MemoryAddress x) {
        tagI_RpcProxyCallbackInterface.RpcProxyUpdatePerfCounterBackendServerFn$VH.set(seg, x);
    }
    public static MemoryAddress RpcProxyUpdatePerfCounterBackendServerFn$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagI_RpcProxyCallbackInterface.RpcProxyUpdatePerfCounterBackendServerFn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RpcProxyUpdatePerfCounterBackendServerFn$set(MemorySegment seg, long index, MemoryAddress x) {
        tagI_RpcProxyCallbackInterface.RpcProxyUpdatePerfCounterBackendServerFn$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static I_RpcProxyUpdatePerfCounterBackendServerFn RpcProxyUpdatePerfCounterBackendServerFn (MemorySegment segment, MemorySession session) {
        return I_RpcProxyUpdatePerfCounterBackendServerFn.ofAddress(RpcProxyUpdatePerfCounterBackendServerFn$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


