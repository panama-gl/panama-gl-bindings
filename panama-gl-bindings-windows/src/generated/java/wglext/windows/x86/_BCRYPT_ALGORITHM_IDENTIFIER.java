// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _BCRYPT_ALGORITHM_IDENTIFIER {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("pszName"),
        Constants$root.C_LONG$LAYOUT.withName("dwClass"),
        Constants$root.C_LONG$LAYOUT.withName("dwFlags")
    ).withName("_BCRYPT_ALGORITHM_IDENTIFIER");
    public static MemoryLayout $LAYOUT() {
        return _BCRYPT_ALGORITHM_IDENTIFIER.$struct$LAYOUT;
    }
    static final VarHandle pszName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pszName"));
    public static VarHandle pszName$VH() {
        return _BCRYPT_ALGORITHM_IDENTIFIER.pszName$VH;
    }
    public static MemoryAddress pszName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_BCRYPT_ALGORITHM_IDENTIFIER.pszName$VH.get(seg);
    }
    public static void pszName$set( MemorySegment seg, MemoryAddress x) {
        _BCRYPT_ALGORITHM_IDENTIFIER.pszName$VH.set(seg, x);
    }
    public static MemoryAddress pszName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_BCRYPT_ALGORITHM_IDENTIFIER.pszName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszName$set(MemorySegment seg, long index, MemoryAddress x) {
        _BCRYPT_ALGORITHM_IDENTIFIER.pszName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwClass$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwClass"));
    public static VarHandle dwClass$VH() {
        return _BCRYPT_ALGORITHM_IDENTIFIER.dwClass$VH;
    }
    public static int dwClass$get(MemorySegment seg) {
        return (int)_BCRYPT_ALGORITHM_IDENTIFIER.dwClass$VH.get(seg);
    }
    public static void dwClass$set( MemorySegment seg, int x) {
        _BCRYPT_ALGORITHM_IDENTIFIER.dwClass$VH.set(seg, x);
    }
    public static int dwClass$get(MemorySegment seg, long index) {
        return (int)_BCRYPT_ALGORITHM_IDENTIFIER.dwClass$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwClass$set(MemorySegment seg, long index, int x) {
        _BCRYPT_ALGORITHM_IDENTIFIER.dwClass$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return _BCRYPT_ALGORITHM_IDENTIFIER.dwFlags$VH;
    }
    public static int dwFlags$get(MemorySegment seg) {
        return (int)_BCRYPT_ALGORITHM_IDENTIFIER.dwFlags$VH.get(seg);
    }
    public static void dwFlags$set( MemorySegment seg, int x) {
        _BCRYPT_ALGORITHM_IDENTIFIER.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)_BCRYPT_ALGORITHM_IDENTIFIER.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        _BCRYPT_ALGORITHM_IDENTIFIER.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


