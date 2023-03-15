// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _NCRYPT_ISOLATED_KEY_ATTESTED_ATTRIBUTES {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("Flags"),
        Constants$root.C_LONG$LAYOUT.withName("cbPublicKeyBlob")
    ).withName("_NCRYPT_ISOLATED_KEY_ATTESTED_ATTRIBUTES");
    public static MemoryLayout $LAYOUT() {
        return _NCRYPT_ISOLATED_KEY_ATTESTED_ATTRIBUTES.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _NCRYPT_ISOLATED_KEY_ATTESTED_ATTRIBUTES.Version$VH;
    }
    public static int Version$get(MemorySegment seg) {
        return (int)_NCRYPT_ISOLATED_KEY_ATTESTED_ATTRIBUTES.Version$VH.get(seg);
    }
    public static void Version$set( MemorySegment seg, int x) {
        _NCRYPT_ISOLATED_KEY_ATTESTED_ATTRIBUTES.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_NCRYPT_ISOLATED_KEY_ATTESTED_ATTRIBUTES.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _NCRYPT_ISOLATED_KEY_ATTESTED_ATTRIBUTES.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _NCRYPT_ISOLATED_KEY_ATTESTED_ATTRIBUTES.Flags$VH;
    }
    public static int Flags$get(MemorySegment seg) {
        return (int)_NCRYPT_ISOLATED_KEY_ATTESTED_ATTRIBUTES.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, int x) {
        _NCRYPT_ISOLATED_KEY_ATTESTED_ATTRIBUTES.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_NCRYPT_ISOLATED_KEY_ATTESTED_ATTRIBUTES.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _NCRYPT_ISOLATED_KEY_ATTESTED_ATTRIBUTES.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbPublicKeyBlob$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbPublicKeyBlob"));
    public static VarHandle cbPublicKeyBlob$VH() {
        return _NCRYPT_ISOLATED_KEY_ATTESTED_ATTRIBUTES.cbPublicKeyBlob$VH;
    }
    public static int cbPublicKeyBlob$get(MemorySegment seg) {
        return (int)_NCRYPT_ISOLATED_KEY_ATTESTED_ATTRIBUTES.cbPublicKeyBlob$VH.get(seg);
    }
    public static void cbPublicKeyBlob$set( MemorySegment seg, int x) {
        _NCRYPT_ISOLATED_KEY_ATTESTED_ATTRIBUTES.cbPublicKeyBlob$VH.set(seg, x);
    }
    public static int cbPublicKeyBlob$get(MemorySegment seg, long index) {
        return (int)_NCRYPT_ISOLATED_KEY_ATTESTED_ATTRIBUTES.cbPublicKeyBlob$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbPublicKeyBlob$set(MemorySegment seg, long index, int x) {
        _NCRYPT_ISOLATED_KEY_ATTESTED_ATTRIBUTES.cbPublicKeyBlob$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


