// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _SSL_KEY_PIN_EXTRA_CERT_CHAIN_POLICY_PARA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        Constants$root.C_LONG$LAYOUT.withName("dwReserved"),
        Constants$root.C_POINTER$LAYOUT.withName("pwszServerName")
    ).withName("_SSL_KEY_PIN_EXTRA_CERT_CHAIN_POLICY_PARA");
    public static MemoryLayout $LAYOUT() {
        return _SSL_KEY_PIN_EXTRA_CERT_CHAIN_POLICY_PARA.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _SSL_KEY_PIN_EXTRA_CERT_CHAIN_POLICY_PARA.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)_SSL_KEY_PIN_EXTRA_CERT_CHAIN_POLICY_PARA.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        _SSL_KEY_PIN_EXTRA_CERT_CHAIN_POLICY_PARA.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_SSL_KEY_PIN_EXTRA_CERT_CHAIN_POLICY_PARA.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _SSL_KEY_PIN_EXTRA_CERT_CHAIN_POLICY_PARA.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwReserved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwReserved"));
    public static VarHandle dwReserved$VH() {
        return _SSL_KEY_PIN_EXTRA_CERT_CHAIN_POLICY_PARA.dwReserved$VH;
    }
    public static int dwReserved$get(MemorySegment seg) {
        return (int)_SSL_KEY_PIN_EXTRA_CERT_CHAIN_POLICY_PARA.dwReserved$VH.get(seg);
    }
    public static void dwReserved$set( MemorySegment seg, int x) {
        _SSL_KEY_PIN_EXTRA_CERT_CHAIN_POLICY_PARA.dwReserved$VH.set(seg, x);
    }
    public static int dwReserved$get(MemorySegment seg, long index) {
        return (int)_SSL_KEY_PIN_EXTRA_CERT_CHAIN_POLICY_PARA.dwReserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwReserved$set(MemorySegment seg, long index, int x) {
        _SSL_KEY_PIN_EXTRA_CERT_CHAIN_POLICY_PARA.dwReserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pwszServerName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pwszServerName"));
    public static VarHandle pwszServerName$VH() {
        return _SSL_KEY_PIN_EXTRA_CERT_CHAIN_POLICY_PARA.pwszServerName$VH;
    }
    public static MemoryAddress pwszServerName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_SSL_KEY_PIN_EXTRA_CERT_CHAIN_POLICY_PARA.pwszServerName$VH.get(seg);
    }
    public static void pwszServerName$set( MemorySegment seg, MemoryAddress x) {
        _SSL_KEY_PIN_EXTRA_CERT_CHAIN_POLICY_PARA.pwszServerName$VH.set(seg, x);
    }
    public static MemoryAddress pwszServerName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_SSL_KEY_PIN_EXTRA_CERT_CHAIN_POLICY_PARA.pwszServerName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pwszServerName$set(MemorySegment seg, long index, MemoryAddress x) {
        _SSL_KEY_PIN_EXTRA_CERT_CHAIN_POLICY_PARA.pwszServerName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


