// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CRYPT_KEY_SIGN_MESSAGE_PARA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        Constants$root.C_LONG$LAYOUT.withName("dwMsgAndCertEncodingType"),
        MemoryLayout.unionLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("hCryptProv"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("hNCryptKey")
        ).withName("$anon$0"),
        Constants$root.C_LONG$LAYOUT.withName("dwKeySpec"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("pszObjId"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("cbData"),
                MemoryLayout.paddingLayout(32),
                Constants$root.C_POINTER$LAYOUT.withName("pbData")
            ).withName("Parameters")
        ).withName("HashAlgorithm"),
        Constants$root.C_POINTER$LAYOUT.withName("pvHashAuxInfo"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("pszObjId"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("cbData"),
                MemoryLayout.paddingLayout(32),
                Constants$root.C_POINTER$LAYOUT.withName("pbData")
            ).withName("Parameters")
        ).withName("PubKeyAlgorithm")
    ).withName("_CRYPT_KEY_SIGN_MESSAGE_PARA");
    public static MemoryLayout $LAYOUT() {
        return _CRYPT_KEY_SIGN_MESSAGE_PARA.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _CRYPT_KEY_SIGN_MESSAGE_PARA.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)_CRYPT_KEY_SIGN_MESSAGE_PARA.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        _CRYPT_KEY_SIGN_MESSAGE_PARA.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_CRYPT_KEY_SIGN_MESSAGE_PARA.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _CRYPT_KEY_SIGN_MESSAGE_PARA.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwMsgAndCertEncodingType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwMsgAndCertEncodingType"));
    public static VarHandle dwMsgAndCertEncodingType$VH() {
        return _CRYPT_KEY_SIGN_MESSAGE_PARA.dwMsgAndCertEncodingType$VH;
    }
    public static int dwMsgAndCertEncodingType$get(MemorySegment seg) {
        return (int)_CRYPT_KEY_SIGN_MESSAGE_PARA.dwMsgAndCertEncodingType$VH.get(seg);
    }
    public static void dwMsgAndCertEncodingType$set( MemorySegment seg, int x) {
        _CRYPT_KEY_SIGN_MESSAGE_PARA.dwMsgAndCertEncodingType$VH.set(seg, x);
    }
    public static int dwMsgAndCertEncodingType$get(MemorySegment seg, long index) {
        return (int)_CRYPT_KEY_SIGN_MESSAGE_PARA.dwMsgAndCertEncodingType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwMsgAndCertEncodingType$set(MemorySegment seg, long index, int x) {
        _CRYPT_KEY_SIGN_MESSAGE_PARA.dwMsgAndCertEncodingType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hCryptProv$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("hCryptProv"));
    public static VarHandle hCryptProv$VH() {
        return _CRYPT_KEY_SIGN_MESSAGE_PARA.hCryptProv$VH;
    }
    public static long hCryptProv$get(MemorySegment seg) {
        return (long)_CRYPT_KEY_SIGN_MESSAGE_PARA.hCryptProv$VH.get(seg);
    }
    public static void hCryptProv$set( MemorySegment seg, long x) {
        _CRYPT_KEY_SIGN_MESSAGE_PARA.hCryptProv$VH.set(seg, x);
    }
    public static long hCryptProv$get(MemorySegment seg, long index) {
        return (long)_CRYPT_KEY_SIGN_MESSAGE_PARA.hCryptProv$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hCryptProv$set(MemorySegment seg, long index, long x) {
        _CRYPT_KEY_SIGN_MESSAGE_PARA.hCryptProv$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hNCryptKey$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("hNCryptKey"));
    public static VarHandle hNCryptKey$VH() {
        return _CRYPT_KEY_SIGN_MESSAGE_PARA.hNCryptKey$VH;
    }
    public static long hNCryptKey$get(MemorySegment seg) {
        return (long)_CRYPT_KEY_SIGN_MESSAGE_PARA.hNCryptKey$VH.get(seg);
    }
    public static void hNCryptKey$set( MemorySegment seg, long x) {
        _CRYPT_KEY_SIGN_MESSAGE_PARA.hNCryptKey$VH.set(seg, x);
    }
    public static long hNCryptKey$get(MemorySegment seg, long index) {
        return (long)_CRYPT_KEY_SIGN_MESSAGE_PARA.hNCryptKey$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hNCryptKey$set(MemorySegment seg, long index, long x) {
        _CRYPT_KEY_SIGN_MESSAGE_PARA.hNCryptKey$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwKeySpec$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwKeySpec"));
    public static VarHandle dwKeySpec$VH() {
        return _CRYPT_KEY_SIGN_MESSAGE_PARA.dwKeySpec$VH;
    }
    public static int dwKeySpec$get(MemorySegment seg) {
        return (int)_CRYPT_KEY_SIGN_MESSAGE_PARA.dwKeySpec$VH.get(seg);
    }
    public static void dwKeySpec$set( MemorySegment seg, int x) {
        _CRYPT_KEY_SIGN_MESSAGE_PARA.dwKeySpec$VH.set(seg, x);
    }
    public static int dwKeySpec$get(MemorySegment seg, long index) {
        return (int)_CRYPT_KEY_SIGN_MESSAGE_PARA.dwKeySpec$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwKeySpec$set(MemorySegment seg, long index, int x) {
        _CRYPT_KEY_SIGN_MESSAGE_PARA.dwKeySpec$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment HashAlgorithm$slice(MemorySegment seg) {
        return seg.asSlice(24, 24);
    }
    static final VarHandle pvHashAuxInfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pvHashAuxInfo"));
    public static VarHandle pvHashAuxInfo$VH() {
        return _CRYPT_KEY_SIGN_MESSAGE_PARA.pvHashAuxInfo$VH;
    }
    public static MemoryAddress pvHashAuxInfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_KEY_SIGN_MESSAGE_PARA.pvHashAuxInfo$VH.get(seg);
    }
    public static void pvHashAuxInfo$set( MemorySegment seg, MemoryAddress x) {
        _CRYPT_KEY_SIGN_MESSAGE_PARA.pvHashAuxInfo$VH.set(seg, x);
    }
    public static MemoryAddress pvHashAuxInfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_KEY_SIGN_MESSAGE_PARA.pvHashAuxInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pvHashAuxInfo$set(MemorySegment seg, long index, MemoryAddress x) {
        _CRYPT_KEY_SIGN_MESSAGE_PARA.pvHashAuxInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment PubKeyAlgorithm$slice(MemorySegment seg) {
        return seg.asSlice(56, 24);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

