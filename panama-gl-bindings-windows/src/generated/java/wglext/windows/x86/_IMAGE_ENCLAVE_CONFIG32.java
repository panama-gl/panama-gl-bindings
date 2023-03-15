// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _IMAGE_ENCLAVE_CONFIG32 {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Size"),
        Constants$root.C_LONG$LAYOUT.withName("MinimumRequiredConfigSize"),
        Constants$root.C_LONG$LAYOUT.withName("PolicyFlags"),
        Constants$root.C_LONG$LAYOUT.withName("NumberOfImports"),
        Constants$root.C_LONG$LAYOUT.withName("ImportList"),
        Constants$root.C_LONG$LAYOUT.withName("ImportEntrySize"),
        MemoryLayout.sequenceLayout(16, Constants$root.C_CHAR$LAYOUT).withName("FamilyID"),
        MemoryLayout.sequenceLayout(16, Constants$root.C_CHAR$LAYOUT).withName("ImageID"),
        Constants$root.C_LONG$LAYOUT.withName("ImageVersion"),
        Constants$root.C_LONG$LAYOUT.withName("SecurityVersion"),
        Constants$root.C_LONG$LAYOUT.withName("EnclaveSize"),
        Constants$root.C_LONG$LAYOUT.withName("NumberOfThreads"),
        Constants$root.C_LONG$LAYOUT.withName("EnclaveFlags")
    ).withName("_IMAGE_ENCLAVE_CONFIG32");
    public static MemoryLayout $LAYOUT() {
        return _IMAGE_ENCLAVE_CONFIG32.$struct$LAYOUT;
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _IMAGE_ENCLAVE_CONFIG32.Size$VH;
    }
    public static int Size$get(MemorySegment seg) {
        return (int)_IMAGE_ENCLAVE_CONFIG32.Size$VH.get(seg);
    }
    public static void Size$set( MemorySegment seg, int x) {
        _IMAGE_ENCLAVE_CONFIG32.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_IMAGE_ENCLAVE_CONFIG32.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _IMAGE_ENCLAVE_CONFIG32.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MinimumRequiredConfigSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MinimumRequiredConfigSize"));
    public static VarHandle MinimumRequiredConfigSize$VH() {
        return _IMAGE_ENCLAVE_CONFIG32.MinimumRequiredConfigSize$VH;
    }
    public static int MinimumRequiredConfigSize$get(MemorySegment seg) {
        return (int)_IMAGE_ENCLAVE_CONFIG32.MinimumRequiredConfigSize$VH.get(seg);
    }
    public static void MinimumRequiredConfigSize$set( MemorySegment seg, int x) {
        _IMAGE_ENCLAVE_CONFIG32.MinimumRequiredConfigSize$VH.set(seg, x);
    }
    public static int MinimumRequiredConfigSize$get(MemorySegment seg, long index) {
        return (int)_IMAGE_ENCLAVE_CONFIG32.MinimumRequiredConfigSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MinimumRequiredConfigSize$set(MemorySegment seg, long index, int x) {
        _IMAGE_ENCLAVE_CONFIG32.MinimumRequiredConfigSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle PolicyFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PolicyFlags"));
    public static VarHandle PolicyFlags$VH() {
        return _IMAGE_ENCLAVE_CONFIG32.PolicyFlags$VH;
    }
    public static int PolicyFlags$get(MemorySegment seg) {
        return (int)_IMAGE_ENCLAVE_CONFIG32.PolicyFlags$VH.get(seg);
    }
    public static void PolicyFlags$set( MemorySegment seg, int x) {
        _IMAGE_ENCLAVE_CONFIG32.PolicyFlags$VH.set(seg, x);
    }
    public static int PolicyFlags$get(MemorySegment seg, long index) {
        return (int)_IMAGE_ENCLAVE_CONFIG32.PolicyFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PolicyFlags$set(MemorySegment seg, long index, int x) {
        _IMAGE_ENCLAVE_CONFIG32.PolicyFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumberOfImports$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberOfImports"));
    public static VarHandle NumberOfImports$VH() {
        return _IMAGE_ENCLAVE_CONFIG32.NumberOfImports$VH;
    }
    public static int NumberOfImports$get(MemorySegment seg) {
        return (int)_IMAGE_ENCLAVE_CONFIG32.NumberOfImports$VH.get(seg);
    }
    public static void NumberOfImports$set( MemorySegment seg, int x) {
        _IMAGE_ENCLAVE_CONFIG32.NumberOfImports$VH.set(seg, x);
    }
    public static int NumberOfImports$get(MemorySegment seg, long index) {
        return (int)_IMAGE_ENCLAVE_CONFIG32.NumberOfImports$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfImports$set(MemorySegment seg, long index, int x) {
        _IMAGE_ENCLAVE_CONFIG32.NumberOfImports$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ImportList$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ImportList"));
    public static VarHandle ImportList$VH() {
        return _IMAGE_ENCLAVE_CONFIG32.ImportList$VH;
    }
    public static int ImportList$get(MemorySegment seg) {
        return (int)_IMAGE_ENCLAVE_CONFIG32.ImportList$VH.get(seg);
    }
    public static void ImportList$set( MemorySegment seg, int x) {
        _IMAGE_ENCLAVE_CONFIG32.ImportList$VH.set(seg, x);
    }
    public static int ImportList$get(MemorySegment seg, long index) {
        return (int)_IMAGE_ENCLAVE_CONFIG32.ImportList$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ImportList$set(MemorySegment seg, long index, int x) {
        _IMAGE_ENCLAVE_CONFIG32.ImportList$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ImportEntrySize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ImportEntrySize"));
    public static VarHandle ImportEntrySize$VH() {
        return _IMAGE_ENCLAVE_CONFIG32.ImportEntrySize$VH;
    }
    public static int ImportEntrySize$get(MemorySegment seg) {
        return (int)_IMAGE_ENCLAVE_CONFIG32.ImportEntrySize$VH.get(seg);
    }
    public static void ImportEntrySize$set( MemorySegment seg, int x) {
        _IMAGE_ENCLAVE_CONFIG32.ImportEntrySize$VH.set(seg, x);
    }
    public static int ImportEntrySize$get(MemorySegment seg, long index) {
        return (int)_IMAGE_ENCLAVE_CONFIG32.ImportEntrySize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ImportEntrySize$set(MemorySegment seg, long index, int x) {
        _IMAGE_ENCLAVE_CONFIG32.ImportEntrySize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment FamilyID$slice(MemorySegment seg) {
        return seg.asSlice(24, 16);
    }
    public static MemorySegment ImageID$slice(MemorySegment seg) {
        return seg.asSlice(40, 16);
    }
    static final VarHandle ImageVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ImageVersion"));
    public static VarHandle ImageVersion$VH() {
        return _IMAGE_ENCLAVE_CONFIG32.ImageVersion$VH;
    }
    public static int ImageVersion$get(MemorySegment seg) {
        return (int)_IMAGE_ENCLAVE_CONFIG32.ImageVersion$VH.get(seg);
    }
    public static void ImageVersion$set( MemorySegment seg, int x) {
        _IMAGE_ENCLAVE_CONFIG32.ImageVersion$VH.set(seg, x);
    }
    public static int ImageVersion$get(MemorySegment seg, long index) {
        return (int)_IMAGE_ENCLAVE_CONFIG32.ImageVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ImageVersion$set(MemorySegment seg, long index, int x) {
        _IMAGE_ENCLAVE_CONFIG32.ImageVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SecurityVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SecurityVersion"));
    public static VarHandle SecurityVersion$VH() {
        return _IMAGE_ENCLAVE_CONFIG32.SecurityVersion$VH;
    }
    public static int SecurityVersion$get(MemorySegment seg) {
        return (int)_IMAGE_ENCLAVE_CONFIG32.SecurityVersion$VH.get(seg);
    }
    public static void SecurityVersion$set( MemorySegment seg, int x) {
        _IMAGE_ENCLAVE_CONFIG32.SecurityVersion$VH.set(seg, x);
    }
    public static int SecurityVersion$get(MemorySegment seg, long index) {
        return (int)_IMAGE_ENCLAVE_CONFIG32.SecurityVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SecurityVersion$set(MemorySegment seg, long index, int x) {
        _IMAGE_ENCLAVE_CONFIG32.SecurityVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle EnclaveSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("EnclaveSize"));
    public static VarHandle EnclaveSize$VH() {
        return _IMAGE_ENCLAVE_CONFIG32.EnclaveSize$VH;
    }
    public static int EnclaveSize$get(MemorySegment seg) {
        return (int)_IMAGE_ENCLAVE_CONFIG32.EnclaveSize$VH.get(seg);
    }
    public static void EnclaveSize$set( MemorySegment seg, int x) {
        _IMAGE_ENCLAVE_CONFIG32.EnclaveSize$VH.set(seg, x);
    }
    public static int EnclaveSize$get(MemorySegment seg, long index) {
        return (int)_IMAGE_ENCLAVE_CONFIG32.EnclaveSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void EnclaveSize$set(MemorySegment seg, long index, int x) {
        _IMAGE_ENCLAVE_CONFIG32.EnclaveSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumberOfThreads$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("NumberOfThreads"));
    public static VarHandle NumberOfThreads$VH() {
        return _IMAGE_ENCLAVE_CONFIG32.NumberOfThreads$VH;
    }
    public static int NumberOfThreads$get(MemorySegment seg) {
        return (int)_IMAGE_ENCLAVE_CONFIG32.NumberOfThreads$VH.get(seg);
    }
    public static void NumberOfThreads$set( MemorySegment seg, int x) {
        _IMAGE_ENCLAVE_CONFIG32.NumberOfThreads$VH.set(seg, x);
    }
    public static int NumberOfThreads$get(MemorySegment seg, long index) {
        return (int)_IMAGE_ENCLAVE_CONFIG32.NumberOfThreads$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfThreads$set(MemorySegment seg, long index, int x) {
        _IMAGE_ENCLAVE_CONFIG32.NumberOfThreads$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle EnclaveFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("EnclaveFlags"));
    public static VarHandle EnclaveFlags$VH() {
        return _IMAGE_ENCLAVE_CONFIG32.EnclaveFlags$VH;
    }
    public static int EnclaveFlags$get(MemorySegment seg) {
        return (int)_IMAGE_ENCLAVE_CONFIG32.EnclaveFlags$VH.get(seg);
    }
    public static void EnclaveFlags$set( MemorySegment seg, int x) {
        _IMAGE_ENCLAVE_CONFIG32.EnclaveFlags$VH.set(seg, x);
    }
    public static int EnclaveFlags$get(MemorySegment seg, long index) {
        return (int)_IMAGE_ENCLAVE_CONFIG32.EnclaveFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void EnclaveFlags$set(MemorySegment seg, long index, int x) {
        _IMAGE_ENCLAVE_CONFIG32.EnclaveFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


