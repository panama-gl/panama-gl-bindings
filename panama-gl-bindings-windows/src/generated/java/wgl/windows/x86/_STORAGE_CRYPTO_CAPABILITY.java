// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _STORAGE_CRYPTO_CAPABILITY {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        Constants$root.C_LONG$LAYOUT.withName("CryptoCapabilityIndex"),
        Constants$root.C_LONG$LAYOUT.withName("AlgorithmId"),
        Constants$root.C_LONG$LAYOUT.withName("KeySize"),
        Constants$root.C_LONG$LAYOUT.withName("DataUnitSizeBitmask")
    ).withName("_STORAGE_CRYPTO_CAPABILITY");
    public static MemoryLayout $LAYOUT() {
        return _STORAGE_CRYPTO_CAPABILITY.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _STORAGE_CRYPTO_CAPABILITY.Version$VH;
    }
    public static int Version$get(MemorySegment seg) {
        return (int)_STORAGE_CRYPTO_CAPABILITY.Version$VH.get(seg);
    }
    public static void Version$set( MemorySegment seg, int x) {
        _STORAGE_CRYPTO_CAPABILITY.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_STORAGE_CRYPTO_CAPABILITY.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _STORAGE_CRYPTO_CAPABILITY.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _STORAGE_CRYPTO_CAPABILITY.Size$VH;
    }
    public static int Size$get(MemorySegment seg) {
        return (int)_STORAGE_CRYPTO_CAPABILITY.Size$VH.get(seg);
    }
    public static void Size$set( MemorySegment seg, int x) {
        _STORAGE_CRYPTO_CAPABILITY.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_STORAGE_CRYPTO_CAPABILITY.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _STORAGE_CRYPTO_CAPABILITY.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle CryptoCapabilityIndex$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CryptoCapabilityIndex"));
    public static VarHandle CryptoCapabilityIndex$VH() {
        return _STORAGE_CRYPTO_CAPABILITY.CryptoCapabilityIndex$VH;
    }
    public static int CryptoCapabilityIndex$get(MemorySegment seg) {
        return (int)_STORAGE_CRYPTO_CAPABILITY.CryptoCapabilityIndex$VH.get(seg);
    }
    public static void CryptoCapabilityIndex$set( MemorySegment seg, int x) {
        _STORAGE_CRYPTO_CAPABILITY.CryptoCapabilityIndex$VH.set(seg, x);
    }
    public static int CryptoCapabilityIndex$get(MemorySegment seg, long index) {
        return (int)_STORAGE_CRYPTO_CAPABILITY.CryptoCapabilityIndex$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CryptoCapabilityIndex$set(MemorySegment seg, long index, int x) {
        _STORAGE_CRYPTO_CAPABILITY.CryptoCapabilityIndex$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle AlgorithmId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AlgorithmId"));
    public static VarHandle AlgorithmId$VH() {
        return _STORAGE_CRYPTO_CAPABILITY.AlgorithmId$VH;
    }
    public static int AlgorithmId$get(MemorySegment seg) {
        return (int)_STORAGE_CRYPTO_CAPABILITY.AlgorithmId$VH.get(seg);
    }
    public static void AlgorithmId$set( MemorySegment seg, int x) {
        _STORAGE_CRYPTO_CAPABILITY.AlgorithmId$VH.set(seg, x);
    }
    public static int AlgorithmId$get(MemorySegment seg, long index) {
        return (int)_STORAGE_CRYPTO_CAPABILITY.AlgorithmId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AlgorithmId$set(MemorySegment seg, long index, int x) {
        _STORAGE_CRYPTO_CAPABILITY.AlgorithmId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle KeySize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("KeySize"));
    public static VarHandle KeySize$VH() {
        return _STORAGE_CRYPTO_CAPABILITY.KeySize$VH;
    }
    public static int KeySize$get(MemorySegment seg) {
        return (int)_STORAGE_CRYPTO_CAPABILITY.KeySize$VH.get(seg);
    }
    public static void KeySize$set( MemorySegment seg, int x) {
        _STORAGE_CRYPTO_CAPABILITY.KeySize$VH.set(seg, x);
    }
    public static int KeySize$get(MemorySegment seg, long index) {
        return (int)_STORAGE_CRYPTO_CAPABILITY.KeySize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void KeySize$set(MemorySegment seg, long index, int x) {
        _STORAGE_CRYPTO_CAPABILITY.KeySize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DataUnitSizeBitmask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DataUnitSizeBitmask"));
    public static VarHandle DataUnitSizeBitmask$VH() {
        return _STORAGE_CRYPTO_CAPABILITY.DataUnitSizeBitmask$VH;
    }
    public static int DataUnitSizeBitmask$get(MemorySegment seg) {
        return (int)_STORAGE_CRYPTO_CAPABILITY.DataUnitSizeBitmask$VH.get(seg);
    }
    public static void DataUnitSizeBitmask$set( MemorySegment seg, int x) {
        _STORAGE_CRYPTO_CAPABILITY.DataUnitSizeBitmask$VH.set(seg, x);
    }
    public static int DataUnitSizeBitmask$get(MemorySegment seg, long index) {
        return (int)_STORAGE_CRYPTO_CAPABILITY.DataUnitSizeBitmask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DataUnitSizeBitmask$set(MemorySegment seg, long index, int x) {
        _STORAGE_CRYPTO_CAPABILITY.DataUnitSizeBitmask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


