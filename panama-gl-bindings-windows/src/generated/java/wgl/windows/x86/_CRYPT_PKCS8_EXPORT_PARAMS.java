// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CRYPT_PKCS8_EXPORT_PARAMS {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("hCryptProv"),
        Constants$root.C_LONG$LAYOUT.withName("dwKeySpec"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pszPrivateKeyObjId"),
        Constants$root.C_POINTER$LAYOUT.withName("pEncryptPrivateKeyFunc"),
        Constants$root.C_POINTER$LAYOUT.withName("pVoidEncryptFunc")
    ).withName("_CRYPT_PKCS8_EXPORT_PARAMS");
    public static MemoryLayout $LAYOUT() {
        return _CRYPT_PKCS8_EXPORT_PARAMS.$struct$LAYOUT;
    }
    static final VarHandle hCryptProv$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hCryptProv"));
    public static VarHandle hCryptProv$VH() {
        return _CRYPT_PKCS8_EXPORT_PARAMS.hCryptProv$VH;
    }
    public static long hCryptProv$get(MemorySegment seg) {
        return (long)_CRYPT_PKCS8_EXPORT_PARAMS.hCryptProv$VH.get(seg);
    }
    public static void hCryptProv$set( MemorySegment seg, long x) {
        _CRYPT_PKCS8_EXPORT_PARAMS.hCryptProv$VH.set(seg, x);
    }
    public static long hCryptProv$get(MemorySegment seg, long index) {
        return (long)_CRYPT_PKCS8_EXPORT_PARAMS.hCryptProv$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hCryptProv$set(MemorySegment seg, long index, long x) {
        _CRYPT_PKCS8_EXPORT_PARAMS.hCryptProv$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwKeySpec$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwKeySpec"));
    public static VarHandle dwKeySpec$VH() {
        return _CRYPT_PKCS8_EXPORT_PARAMS.dwKeySpec$VH;
    }
    public static int dwKeySpec$get(MemorySegment seg) {
        return (int)_CRYPT_PKCS8_EXPORT_PARAMS.dwKeySpec$VH.get(seg);
    }
    public static void dwKeySpec$set( MemorySegment seg, int x) {
        _CRYPT_PKCS8_EXPORT_PARAMS.dwKeySpec$VH.set(seg, x);
    }
    public static int dwKeySpec$get(MemorySegment seg, long index) {
        return (int)_CRYPT_PKCS8_EXPORT_PARAMS.dwKeySpec$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwKeySpec$set(MemorySegment seg, long index, int x) {
        _CRYPT_PKCS8_EXPORT_PARAMS.dwKeySpec$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pszPrivateKeyObjId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pszPrivateKeyObjId"));
    public static VarHandle pszPrivateKeyObjId$VH() {
        return _CRYPT_PKCS8_EXPORT_PARAMS.pszPrivateKeyObjId$VH;
    }
    public static MemoryAddress pszPrivateKeyObjId$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_PKCS8_EXPORT_PARAMS.pszPrivateKeyObjId$VH.get(seg);
    }
    public static void pszPrivateKeyObjId$set( MemorySegment seg, MemoryAddress x) {
        _CRYPT_PKCS8_EXPORT_PARAMS.pszPrivateKeyObjId$VH.set(seg, x);
    }
    public static MemoryAddress pszPrivateKeyObjId$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_PKCS8_EXPORT_PARAMS.pszPrivateKeyObjId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszPrivateKeyObjId$set(MemorySegment seg, long index, MemoryAddress x) {
        _CRYPT_PKCS8_EXPORT_PARAMS.pszPrivateKeyObjId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pEncryptPrivateKeyFunc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pEncryptPrivateKeyFunc"));
    public static VarHandle pEncryptPrivateKeyFunc$VH() {
        return _CRYPT_PKCS8_EXPORT_PARAMS.pEncryptPrivateKeyFunc$VH;
    }
    public static MemoryAddress pEncryptPrivateKeyFunc$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_PKCS8_EXPORT_PARAMS.pEncryptPrivateKeyFunc$VH.get(seg);
    }
    public static void pEncryptPrivateKeyFunc$set( MemorySegment seg, MemoryAddress x) {
        _CRYPT_PKCS8_EXPORT_PARAMS.pEncryptPrivateKeyFunc$VH.set(seg, x);
    }
    public static MemoryAddress pEncryptPrivateKeyFunc$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_PKCS8_EXPORT_PARAMS.pEncryptPrivateKeyFunc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pEncryptPrivateKeyFunc$set(MemorySegment seg, long index, MemoryAddress x) {
        _CRYPT_PKCS8_EXPORT_PARAMS.pEncryptPrivateKeyFunc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static PCRYPT_ENCRYPT_PRIVATE_KEY_FUNC pEncryptPrivateKeyFunc (MemorySegment segment, MemorySession session) {
        return PCRYPT_ENCRYPT_PRIVATE_KEY_FUNC.ofAddress(pEncryptPrivateKeyFunc$get(segment), session);
    }
    static final VarHandle pVoidEncryptFunc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pVoidEncryptFunc"));
    public static VarHandle pVoidEncryptFunc$VH() {
        return _CRYPT_PKCS8_EXPORT_PARAMS.pVoidEncryptFunc$VH;
    }
    public static MemoryAddress pVoidEncryptFunc$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_PKCS8_EXPORT_PARAMS.pVoidEncryptFunc$VH.get(seg);
    }
    public static void pVoidEncryptFunc$set( MemorySegment seg, MemoryAddress x) {
        _CRYPT_PKCS8_EXPORT_PARAMS.pVoidEncryptFunc$VH.set(seg, x);
    }
    public static MemoryAddress pVoidEncryptFunc$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_PKCS8_EXPORT_PARAMS.pVoidEncryptFunc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pVoidEncryptFunc$set(MemorySegment seg, long index, MemoryAddress x) {
        _CRYPT_PKCS8_EXPORT_PARAMS.pVoidEncryptFunc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


