// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CRYPT_OBJID_TABLE {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwAlgId"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pszObjId")
    ).withName("_CRYPT_OBJID_TABLE");
    public static MemoryLayout $LAYOUT() {
        return _CRYPT_OBJID_TABLE.$struct$LAYOUT;
    }
    static final VarHandle dwAlgId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwAlgId"));
    public static VarHandle dwAlgId$VH() {
        return _CRYPT_OBJID_TABLE.dwAlgId$VH;
    }
    public static int dwAlgId$get(MemorySegment seg) {
        return (int)_CRYPT_OBJID_TABLE.dwAlgId$VH.get(seg);
    }
    public static void dwAlgId$set( MemorySegment seg, int x) {
        _CRYPT_OBJID_TABLE.dwAlgId$VH.set(seg, x);
    }
    public static int dwAlgId$get(MemorySegment seg, long index) {
        return (int)_CRYPT_OBJID_TABLE.dwAlgId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwAlgId$set(MemorySegment seg, long index, int x) {
        _CRYPT_OBJID_TABLE.dwAlgId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pszObjId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pszObjId"));
    public static VarHandle pszObjId$VH() {
        return _CRYPT_OBJID_TABLE.pszObjId$VH;
    }
    public static MemoryAddress pszObjId$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_OBJID_TABLE.pszObjId$VH.get(seg);
    }
    public static void pszObjId$set( MemorySegment seg, MemoryAddress x) {
        _CRYPT_OBJID_TABLE.pszObjId$VH.set(seg, x);
    }
    public static MemoryAddress pszObjId$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_OBJID_TABLE.pszObjId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszObjId$set(MemorySegment seg, long index, MemoryAddress x) {
        _CRYPT_OBJID_TABLE.pszObjId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


