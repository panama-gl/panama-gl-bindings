// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CRYPT_PASSWORD_CREDENTIALSW {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pszUsername"),
        Constants$root.C_POINTER$LAYOUT.withName("pszPassword")
    ).withName("_CRYPT_PASSWORD_CREDENTIALSW");
    public static MemoryLayout $LAYOUT() {
        return _CRYPT_PASSWORD_CREDENTIALSW.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _CRYPT_PASSWORD_CREDENTIALSW.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)_CRYPT_PASSWORD_CREDENTIALSW.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        _CRYPT_PASSWORD_CREDENTIALSW.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_CRYPT_PASSWORD_CREDENTIALSW.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _CRYPT_PASSWORD_CREDENTIALSW.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pszUsername$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pszUsername"));
    public static VarHandle pszUsername$VH() {
        return _CRYPT_PASSWORD_CREDENTIALSW.pszUsername$VH;
    }
    public static MemoryAddress pszUsername$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_PASSWORD_CREDENTIALSW.pszUsername$VH.get(seg);
    }
    public static void pszUsername$set( MemorySegment seg, MemoryAddress x) {
        _CRYPT_PASSWORD_CREDENTIALSW.pszUsername$VH.set(seg, x);
    }
    public static MemoryAddress pszUsername$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_PASSWORD_CREDENTIALSW.pszUsername$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszUsername$set(MemorySegment seg, long index, MemoryAddress x) {
        _CRYPT_PASSWORD_CREDENTIALSW.pszUsername$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pszPassword$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pszPassword"));
    public static VarHandle pszPassword$VH() {
        return _CRYPT_PASSWORD_CREDENTIALSW.pszPassword$VH;
    }
    public static MemoryAddress pszPassword$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_PASSWORD_CREDENTIALSW.pszPassword$VH.get(seg);
    }
    public static void pszPassword$set( MemorySegment seg, MemoryAddress x) {
        _CRYPT_PASSWORD_CREDENTIALSW.pszPassword$VH.set(seg, x);
    }
    public static MemoryAddress pszPassword$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_PASSWORD_CREDENTIALSW.pszPassword$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszPassword$set(MemorySegment seg, long index, MemoryAddress x) {
        _CRYPT_PASSWORD_CREDENTIALSW.pszPassword$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


