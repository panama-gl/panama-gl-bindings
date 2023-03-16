// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CRYPT_CSP_PROVIDER {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwKeySpec"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pwszProviderName"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("cbData"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_POINTER$LAYOUT.withName("pbData"),
            Constants$root.C_LONG$LAYOUT.withName("cUnusedBits"),
            MemoryLayout.paddingLayout(32)
        ).withName("Signature")
    ).withName("_CRYPT_CSP_PROVIDER");
    public static MemoryLayout $LAYOUT() {
        return _CRYPT_CSP_PROVIDER.$struct$LAYOUT;
    }
    static final VarHandle dwKeySpec$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwKeySpec"));
    public static VarHandle dwKeySpec$VH() {
        return _CRYPT_CSP_PROVIDER.dwKeySpec$VH;
    }
    public static int dwKeySpec$get(MemorySegment seg) {
        return (int)_CRYPT_CSP_PROVIDER.dwKeySpec$VH.get(seg);
    }
    public static void dwKeySpec$set( MemorySegment seg, int x) {
        _CRYPT_CSP_PROVIDER.dwKeySpec$VH.set(seg, x);
    }
    public static int dwKeySpec$get(MemorySegment seg, long index) {
        return (int)_CRYPT_CSP_PROVIDER.dwKeySpec$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwKeySpec$set(MemorySegment seg, long index, int x) {
        _CRYPT_CSP_PROVIDER.dwKeySpec$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pwszProviderName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pwszProviderName"));
    public static VarHandle pwszProviderName$VH() {
        return _CRYPT_CSP_PROVIDER.pwszProviderName$VH;
    }
    public static MemoryAddress pwszProviderName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_CSP_PROVIDER.pwszProviderName$VH.get(seg);
    }
    public static void pwszProviderName$set( MemorySegment seg, MemoryAddress x) {
        _CRYPT_CSP_PROVIDER.pwszProviderName$VH.set(seg, x);
    }
    public static MemoryAddress pwszProviderName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_CSP_PROVIDER.pwszProviderName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pwszProviderName$set(MemorySegment seg, long index, MemoryAddress x) {
        _CRYPT_CSP_PROVIDER.pwszProviderName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Signature$slice(MemorySegment seg) {
        return seg.asSlice(16, 24);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


