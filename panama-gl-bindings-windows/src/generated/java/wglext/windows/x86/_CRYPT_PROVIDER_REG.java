// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CRYPT_PROVIDER_REG {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cAliases"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("rgpszAliases"),
        Constants$root.C_POINTER$LAYOUT.withName("pUM"),
        Constants$root.C_POINTER$LAYOUT.withName("pKM")
    ).withName("_CRYPT_PROVIDER_REG");
    public static MemoryLayout $LAYOUT() {
        return _CRYPT_PROVIDER_REG.$struct$LAYOUT;
    }
    static final VarHandle cAliases$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cAliases"));
    public static VarHandle cAliases$VH() {
        return _CRYPT_PROVIDER_REG.cAliases$VH;
    }
    public static int cAliases$get(MemorySegment seg) {
        return (int)_CRYPT_PROVIDER_REG.cAliases$VH.get(seg);
    }
    public static void cAliases$set( MemorySegment seg, int x) {
        _CRYPT_PROVIDER_REG.cAliases$VH.set(seg, x);
    }
    public static int cAliases$get(MemorySegment seg, long index) {
        return (int)_CRYPT_PROVIDER_REG.cAliases$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cAliases$set(MemorySegment seg, long index, int x) {
        _CRYPT_PROVIDER_REG.cAliases$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgpszAliases$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rgpszAliases"));
    public static VarHandle rgpszAliases$VH() {
        return _CRYPT_PROVIDER_REG.rgpszAliases$VH;
    }
    public static MemoryAddress rgpszAliases$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_PROVIDER_REG.rgpszAliases$VH.get(seg);
    }
    public static void rgpszAliases$set( MemorySegment seg, MemoryAddress x) {
        _CRYPT_PROVIDER_REG.rgpszAliases$VH.set(seg, x);
    }
    public static MemoryAddress rgpszAliases$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_PROVIDER_REG.rgpszAliases$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgpszAliases$set(MemorySegment seg, long index, MemoryAddress x) {
        _CRYPT_PROVIDER_REG.rgpszAliases$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pUM$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pUM"));
    public static VarHandle pUM$VH() {
        return _CRYPT_PROVIDER_REG.pUM$VH;
    }
    public static MemoryAddress pUM$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_PROVIDER_REG.pUM$VH.get(seg);
    }
    public static void pUM$set( MemorySegment seg, MemoryAddress x) {
        _CRYPT_PROVIDER_REG.pUM$VH.set(seg, x);
    }
    public static MemoryAddress pUM$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_PROVIDER_REG.pUM$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pUM$set(MemorySegment seg, long index, MemoryAddress x) {
        _CRYPT_PROVIDER_REG.pUM$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pKM$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pKM"));
    public static VarHandle pKM$VH() {
        return _CRYPT_PROVIDER_REG.pKM$VH;
    }
    public static MemoryAddress pKM$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_PROVIDER_REG.pKM$VH.get(seg);
    }
    public static void pKM$set( MemorySegment seg, MemoryAddress x) {
        _CRYPT_PROVIDER_REG.pKM$VH.set(seg, x);
    }
    public static MemoryAddress pKM$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CRYPT_PROVIDER_REG.pKM$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pKM$set(MemorySegment seg, long index, MemoryAddress x) {
        _CRYPT_PROVIDER_REG.pKM$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

