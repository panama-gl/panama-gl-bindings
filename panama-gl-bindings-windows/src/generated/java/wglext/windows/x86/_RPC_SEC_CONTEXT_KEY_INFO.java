// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _RPC_SEC_CONTEXT_KEY_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("EncryptAlgorithm"),
        Constants$root.C_LONG$LAYOUT.withName("KeySize"),
        Constants$root.C_LONG$LAYOUT.withName("SignatureAlgorithm")
    ).withName("_RPC_SEC_CONTEXT_KEY_INFO");
    public static MemoryLayout $LAYOUT() {
        return _RPC_SEC_CONTEXT_KEY_INFO.$struct$LAYOUT;
    }
    static final VarHandle EncryptAlgorithm$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("EncryptAlgorithm"));
    public static VarHandle EncryptAlgorithm$VH() {
        return _RPC_SEC_CONTEXT_KEY_INFO.EncryptAlgorithm$VH;
    }
    public static int EncryptAlgorithm$get(MemorySegment seg) {
        return (int)_RPC_SEC_CONTEXT_KEY_INFO.EncryptAlgorithm$VH.get(seg);
    }
    public static void EncryptAlgorithm$set( MemorySegment seg, int x) {
        _RPC_SEC_CONTEXT_KEY_INFO.EncryptAlgorithm$VH.set(seg, x);
    }
    public static int EncryptAlgorithm$get(MemorySegment seg, long index) {
        return (int)_RPC_SEC_CONTEXT_KEY_INFO.EncryptAlgorithm$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void EncryptAlgorithm$set(MemorySegment seg, long index, int x) {
        _RPC_SEC_CONTEXT_KEY_INFO.EncryptAlgorithm$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle KeySize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("KeySize"));
    public static VarHandle KeySize$VH() {
        return _RPC_SEC_CONTEXT_KEY_INFO.KeySize$VH;
    }
    public static int KeySize$get(MemorySegment seg) {
        return (int)_RPC_SEC_CONTEXT_KEY_INFO.KeySize$VH.get(seg);
    }
    public static void KeySize$set( MemorySegment seg, int x) {
        _RPC_SEC_CONTEXT_KEY_INFO.KeySize$VH.set(seg, x);
    }
    public static int KeySize$get(MemorySegment seg, long index) {
        return (int)_RPC_SEC_CONTEXT_KEY_INFO.KeySize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void KeySize$set(MemorySegment seg, long index, int x) {
        _RPC_SEC_CONTEXT_KEY_INFO.KeySize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SignatureAlgorithm$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SignatureAlgorithm"));
    public static VarHandle SignatureAlgorithm$VH() {
        return _RPC_SEC_CONTEXT_KEY_INFO.SignatureAlgorithm$VH;
    }
    public static int SignatureAlgorithm$get(MemorySegment seg) {
        return (int)_RPC_SEC_CONTEXT_KEY_INFO.SignatureAlgorithm$VH.get(seg);
    }
    public static void SignatureAlgorithm$set( MemorySegment seg, int x) {
        _RPC_SEC_CONTEXT_KEY_INFO.SignatureAlgorithm$VH.set(seg, x);
    }
    public static int SignatureAlgorithm$get(MemorySegment seg, long index) {
        return (int)_RPC_SEC_CONTEXT_KEY_INFO.SignatureAlgorithm$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SignatureAlgorithm$set(MemorySegment seg, long index, int x) {
        _RPC_SEC_CONTEXT_KEY_INFO.SignatureAlgorithm$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


