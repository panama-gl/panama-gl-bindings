// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CRYPT_ATTRIBUTE {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("pszObjId"),
        Constants$root.C_LONG$LAYOUT.withName("cValue"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("rgValue")
    ).withName("_CRYPT_ATTRIBUTE");
    public static MemoryLayout $LAYOUT() {
        return _CRYPT_ATTRIBUTE.$struct$LAYOUT;
    }
    static final VarHandle pszObjId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pszObjId"));
    public static VarHandle pszObjId$VH() {
        return _CRYPT_ATTRIBUTE.pszObjId$VH;
    }
    public static MemoryAddress pszObjId$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_ATTRIBUTE.pszObjId$VH.get(seg);
    }
    public static void pszObjId$set( MemorySegment seg, MemoryAddress x) {
        _CRYPT_ATTRIBUTE.pszObjId$VH.set(seg, x);
    }
    public static MemoryAddress pszObjId$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_ATTRIBUTE.pszObjId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszObjId$set(MemorySegment seg, long index, MemoryAddress x) {
        _CRYPT_ATTRIBUTE.pszObjId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cValue$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cValue"));
    public static VarHandle cValue$VH() {
        return _CRYPT_ATTRIBUTE.cValue$VH;
    }
    public static int cValue$get(MemorySegment seg) {
        return (int)_CRYPT_ATTRIBUTE.cValue$VH.get(seg);
    }
    public static void cValue$set( MemorySegment seg, int x) {
        _CRYPT_ATTRIBUTE.cValue$VH.set(seg, x);
    }
    public static int cValue$get(MemorySegment seg, long index) {
        return (int)_CRYPT_ATTRIBUTE.cValue$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cValue$set(MemorySegment seg, long index, int x) {
        _CRYPT_ATTRIBUTE.cValue$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgValue$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rgValue"));
    public static VarHandle rgValue$VH() {
        return _CRYPT_ATTRIBUTE.rgValue$VH;
    }
    public static MemoryAddress rgValue$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_ATTRIBUTE.rgValue$VH.get(seg);
    }
    public static void rgValue$set( MemorySegment seg, MemoryAddress x) {
        _CRYPT_ATTRIBUTE.rgValue$VH.set(seg, x);
    }
    public static MemoryAddress rgValue$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_ATTRIBUTE.rgValue$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgValue$set(MemorySegment seg, long index, MemoryAddress x) {
        _CRYPT_ATTRIBUTE.rgValue$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


