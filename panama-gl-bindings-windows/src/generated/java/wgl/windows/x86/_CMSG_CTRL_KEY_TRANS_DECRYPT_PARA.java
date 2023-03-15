// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CMSG_CTRL_KEY_TRANS_DECRYPT_PARA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.unionLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("hCryptProv"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("hNCryptKey")
        ).withName("$anon$0"),
        Constants$root.C_LONG$LAYOUT.withName("dwKeySpec"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pKeyTrans"),
        Constants$root.C_LONG$LAYOUT.withName("dwRecipientIndex"),
        MemoryLayout.paddingLayout(32)
    ).withName("_CMSG_CTRL_KEY_TRANS_DECRYPT_PARA");
    public static MemoryLayout $LAYOUT() {
        return _CMSG_CTRL_KEY_TRANS_DECRYPT_PARA.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _CMSG_CTRL_KEY_TRANS_DECRYPT_PARA.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)_CMSG_CTRL_KEY_TRANS_DECRYPT_PARA.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        _CMSG_CTRL_KEY_TRANS_DECRYPT_PARA.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_CMSG_CTRL_KEY_TRANS_DECRYPT_PARA.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _CMSG_CTRL_KEY_TRANS_DECRYPT_PARA.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hCryptProv$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("hCryptProv"));
    public static VarHandle hCryptProv$VH() {
        return _CMSG_CTRL_KEY_TRANS_DECRYPT_PARA.hCryptProv$VH;
    }
    public static long hCryptProv$get(MemorySegment seg) {
        return (long)_CMSG_CTRL_KEY_TRANS_DECRYPT_PARA.hCryptProv$VH.get(seg);
    }
    public static void hCryptProv$set( MemorySegment seg, long x) {
        _CMSG_CTRL_KEY_TRANS_DECRYPT_PARA.hCryptProv$VH.set(seg, x);
    }
    public static long hCryptProv$get(MemorySegment seg, long index) {
        return (long)_CMSG_CTRL_KEY_TRANS_DECRYPT_PARA.hCryptProv$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hCryptProv$set(MemorySegment seg, long index, long x) {
        _CMSG_CTRL_KEY_TRANS_DECRYPT_PARA.hCryptProv$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hNCryptKey$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("hNCryptKey"));
    public static VarHandle hNCryptKey$VH() {
        return _CMSG_CTRL_KEY_TRANS_DECRYPT_PARA.hNCryptKey$VH;
    }
    public static long hNCryptKey$get(MemorySegment seg) {
        return (long)_CMSG_CTRL_KEY_TRANS_DECRYPT_PARA.hNCryptKey$VH.get(seg);
    }
    public static void hNCryptKey$set( MemorySegment seg, long x) {
        _CMSG_CTRL_KEY_TRANS_DECRYPT_PARA.hNCryptKey$VH.set(seg, x);
    }
    public static long hNCryptKey$get(MemorySegment seg, long index) {
        return (long)_CMSG_CTRL_KEY_TRANS_DECRYPT_PARA.hNCryptKey$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hNCryptKey$set(MemorySegment seg, long index, long x) {
        _CMSG_CTRL_KEY_TRANS_DECRYPT_PARA.hNCryptKey$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwKeySpec$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwKeySpec"));
    public static VarHandle dwKeySpec$VH() {
        return _CMSG_CTRL_KEY_TRANS_DECRYPT_PARA.dwKeySpec$VH;
    }
    public static int dwKeySpec$get(MemorySegment seg) {
        return (int)_CMSG_CTRL_KEY_TRANS_DECRYPT_PARA.dwKeySpec$VH.get(seg);
    }
    public static void dwKeySpec$set( MemorySegment seg, int x) {
        _CMSG_CTRL_KEY_TRANS_DECRYPT_PARA.dwKeySpec$VH.set(seg, x);
    }
    public static int dwKeySpec$get(MemorySegment seg, long index) {
        return (int)_CMSG_CTRL_KEY_TRANS_DECRYPT_PARA.dwKeySpec$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwKeySpec$set(MemorySegment seg, long index, int x) {
        _CMSG_CTRL_KEY_TRANS_DECRYPT_PARA.dwKeySpec$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pKeyTrans$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pKeyTrans"));
    public static VarHandle pKeyTrans$VH() {
        return _CMSG_CTRL_KEY_TRANS_DECRYPT_PARA.pKeyTrans$VH;
    }
    public static MemoryAddress pKeyTrans$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CMSG_CTRL_KEY_TRANS_DECRYPT_PARA.pKeyTrans$VH.get(seg);
    }
    public static void pKeyTrans$set( MemorySegment seg, MemoryAddress x) {
        _CMSG_CTRL_KEY_TRANS_DECRYPT_PARA.pKeyTrans$VH.set(seg, x);
    }
    public static MemoryAddress pKeyTrans$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CMSG_CTRL_KEY_TRANS_DECRYPT_PARA.pKeyTrans$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pKeyTrans$set(MemorySegment seg, long index, MemoryAddress x) {
        _CMSG_CTRL_KEY_TRANS_DECRYPT_PARA.pKeyTrans$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwRecipientIndex$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwRecipientIndex"));
    public static VarHandle dwRecipientIndex$VH() {
        return _CMSG_CTRL_KEY_TRANS_DECRYPT_PARA.dwRecipientIndex$VH;
    }
    public static int dwRecipientIndex$get(MemorySegment seg) {
        return (int)_CMSG_CTRL_KEY_TRANS_DECRYPT_PARA.dwRecipientIndex$VH.get(seg);
    }
    public static void dwRecipientIndex$set( MemorySegment seg, int x) {
        _CMSG_CTRL_KEY_TRANS_DECRYPT_PARA.dwRecipientIndex$VH.set(seg, x);
    }
    public static int dwRecipientIndex$get(MemorySegment seg, long index) {
        return (int)_CMSG_CTRL_KEY_TRANS_DECRYPT_PARA.dwRecipientIndex$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwRecipientIndex$set(MemorySegment seg, long index, int x) {
        _CMSG_CTRL_KEY_TRANS_DECRYPT_PARA.dwRecipientIndex$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


