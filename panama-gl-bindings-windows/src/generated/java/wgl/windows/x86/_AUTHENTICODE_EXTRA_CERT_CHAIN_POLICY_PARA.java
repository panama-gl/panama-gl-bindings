// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _AUTHENTICODE_EXTRA_CERT_CHAIN_POLICY_PARA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        Constants$root.C_LONG$LAYOUT.withName("dwRegPolicySettings"),
        Constants$root.C_POINTER$LAYOUT.withName("pSignerInfo")
    ).withName("_AUTHENTICODE_EXTRA_CERT_CHAIN_POLICY_PARA");
    public static MemoryLayout $LAYOUT() {
        return _AUTHENTICODE_EXTRA_CERT_CHAIN_POLICY_PARA.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _AUTHENTICODE_EXTRA_CERT_CHAIN_POLICY_PARA.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)_AUTHENTICODE_EXTRA_CERT_CHAIN_POLICY_PARA.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        _AUTHENTICODE_EXTRA_CERT_CHAIN_POLICY_PARA.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_AUTHENTICODE_EXTRA_CERT_CHAIN_POLICY_PARA.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _AUTHENTICODE_EXTRA_CERT_CHAIN_POLICY_PARA.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwRegPolicySettings$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwRegPolicySettings"));
    public static VarHandle dwRegPolicySettings$VH() {
        return _AUTHENTICODE_EXTRA_CERT_CHAIN_POLICY_PARA.dwRegPolicySettings$VH;
    }
    public static int dwRegPolicySettings$get(MemorySegment seg) {
        return (int)_AUTHENTICODE_EXTRA_CERT_CHAIN_POLICY_PARA.dwRegPolicySettings$VH.get(seg);
    }
    public static void dwRegPolicySettings$set( MemorySegment seg, int x) {
        _AUTHENTICODE_EXTRA_CERT_CHAIN_POLICY_PARA.dwRegPolicySettings$VH.set(seg, x);
    }
    public static int dwRegPolicySettings$get(MemorySegment seg, long index) {
        return (int)_AUTHENTICODE_EXTRA_CERT_CHAIN_POLICY_PARA.dwRegPolicySettings$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwRegPolicySettings$set(MemorySegment seg, long index, int x) {
        _AUTHENTICODE_EXTRA_CERT_CHAIN_POLICY_PARA.dwRegPolicySettings$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pSignerInfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pSignerInfo"));
    public static VarHandle pSignerInfo$VH() {
        return _AUTHENTICODE_EXTRA_CERT_CHAIN_POLICY_PARA.pSignerInfo$VH;
    }
    public static MemoryAddress pSignerInfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_AUTHENTICODE_EXTRA_CERT_CHAIN_POLICY_PARA.pSignerInfo$VH.get(seg);
    }
    public static void pSignerInfo$set( MemorySegment seg, MemoryAddress x) {
        _AUTHENTICODE_EXTRA_CERT_CHAIN_POLICY_PARA.pSignerInfo$VH.set(seg, x);
    }
    public static MemoryAddress pSignerInfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_AUTHENTICODE_EXTRA_CERT_CHAIN_POLICY_PARA.pSignerInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pSignerInfo$set(MemorySegment seg, long index, MemoryAddress x) {
        _AUTHENTICODE_EXTRA_CERT_CHAIN_POLICY_PARA.pSignerInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


