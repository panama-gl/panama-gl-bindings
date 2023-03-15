// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CMSG_KEY_TRANS_ENCRYPT_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        Constants$root.C_LONG$LAYOUT.withName("dwRecipientIndex"),
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("pszObjId"),
            MemoryLayout.structLayout(
                Constants$root.C_LONG$LAYOUT.withName("cbData"),
                MemoryLayout.paddingLayout(32),
                Constants$root.C_POINTER$LAYOUT.withName("pbData")
            ).withName("Parameters")
        ).withName("KeyEncryptionAlgorithm"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("cbData"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_POINTER$LAYOUT.withName("pbData")
        ).withName("EncryptedKey"),
        Constants$root.C_LONG$LAYOUT.withName("dwFlags"),
        MemoryLayout.paddingLayout(32)
    ).withName("_CMSG_KEY_TRANS_ENCRYPT_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CMSG_KEY_TRANS_ENCRYPT_INFO.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _CMSG_KEY_TRANS_ENCRYPT_INFO.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)_CMSG_KEY_TRANS_ENCRYPT_INFO.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        _CMSG_KEY_TRANS_ENCRYPT_INFO.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_CMSG_KEY_TRANS_ENCRYPT_INFO.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _CMSG_KEY_TRANS_ENCRYPT_INFO.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwRecipientIndex$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwRecipientIndex"));
    public static VarHandle dwRecipientIndex$VH() {
        return _CMSG_KEY_TRANS_ENCRYPT_INFO.dwRecipientIndex$VH;
    }
    public static int dwRecipientIndex$get(MemorySegment seg) {
        return (int)_CMSG_KEY_TRANS_ENCRYPT_INFO.dwRecipientIndex$VH.get(seg);
    }
    public static void dwRecipientIndex$set( MemorySegment seg, int x) {
        _CMSG_KEY_TRANS_ENCRYPT_INFO.dwRecipientIndex$VH.set(seg, x);
    }
    public static int dwRecipientIndex$get(MemorySegment seg, long index) {
        return (int)_CMSG_KEY_TRANS_ENCRYPT_INFO.dwRecipientIndex$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwRecipientIndex$set(MemorySegment seg, long index, int x) {
        _CMSG_KEY_TRANS_ENCRYPT_INFO.dwRecipientIndex$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment KeyEncryptionAlgorithm$slice(MemorySegment seg) {
        return seg.asSlice(8, 24);
    }
    public static MemorySegment EncryptedKey$slice(MemorySegment seg) {
        return seg.asSlice(32, 16);
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return _CMSG_KEY_TRANS_ENCRYPT_INFO.dwFlags$VH;
    }
    public static int dwFlags$get(MemorySegment seg) {
        return (int)_CMSG_KEY_TRANS_ENCRYPT_INFO.dwFlags$VH.get(seg);
    }
    public static void dwFlags$set( MemorySegment seg, int x) {
        _CMSG_KEY_TRANS_ENCRYPT_INFO.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)_CMSG_KEY_TRANS_ENCRYPT_INFO.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        _CMSG_KEY_TRANS_ENCRYPT_INFO.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


