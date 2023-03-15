// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _NCRYPT_TPM_PLATFORM_ATTESTATION_STATEMENT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Magic"),
        Constants$root.C_LONG$LAYOUT.withName("Version"),
        Constants$root.C_LONG$LAYOUT.withName("pcrAlg"),
        Constants$root.C_LONG$LAYOUT.withName("cbSignature"),
        Constants$root.C_LONG$LAYOUT.withName("cbQuote"),
        Constants$root.C_LONG$LAYOUT.withName("cbPcrs")
    ).withName("_NCRYPT_TPM_PLATFORM_ATTESTATION_STATEMENT");
    public static MemoryLayout $LAYOUT() {
        return _NCRYPT_TPM_PLATFORM_ATTESTATION_STATEMENT.$struct$LAYOUT;
    }
    static final VarHandle Magic$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Magic"));
    public static VarHandle Magic$VH() {
        return _NCRYPT_TPM_PLATFORM_ATTESTATION_STATEMENT.Magic$VH;
    }
    public static int Magic$get(MemorySegment seg) {
        return (int)_NCRYPT_TPM_PLATFORM_ATTESTATION_STATEMENT.Magic$VH.get(seg);
    }
    public static void Magic$set( MemorySegment seg, int x) {
        _NCRYPT_TPM_PLATFORM_ATTESTATION_STATEMENT.Magic$VH.set(seg, x);
    }
    public static int Magic$get(MemorySegment seg, long index) {
        return (int)_NCRYPT_TPM_PLATFORM_ATTESTATION_STATEMENT.Magic$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Magic$set(MemorySegment seg, long index, int x) {
        _NCRYPT_TPM_PLATFORM_ATTESTATION_STATEMENT.Magic$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _NCRYPT_TPM_PLATFORM_ATTESTATION_STATEMENT.Version$VH;
    }
    public static int Version$get(MemorySegment seg) {
        return (int)_NCRYPT_TPM_PLATFORM_ATTESTATION_STATEMENT.Version$VH.get(seg);
    }
    public static void Version$set( MemorySegment seg, int x) {
        _NCRYPT_TPM_PLATFORM_ATTESTATION_STATEMENT.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_NCRYPT_TPM_PLATFORM_ATTESTATION_STATEMENT.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _NCRYPT_TPM_PLATFORM_ATTESTATION_STATEMENT.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pcrAlg$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pcrAlg"));
    public static VarHandle pcrAlg$VH() {
        return _NCRYPT_TPM_PLATFORM_ATTESTATION_STATEMENT.pcrAlg$VH;
    }
    public static int pcrAlg$get(MemorySegment seg) {
        return (int)_NCRYPT_TPM_PLATFORM_ATTESTATION_STATEMENT.pcrAlg$VH.get(seg);
    }
    public static void pcrAlg$set( MemorySegment seg, int x) {
        _NCRYPT_TPM_PLATFORM_ATTESTATION_STATEMENT.pcrAlg$VH.set(seg, x);
    }
    public static int pcrAlg$get(MemorySegment seg, long index) {
        return (int)_NCRYPT_TPM_PLATFORM_ATTESTATION_STATEMENT.pcrAlg$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pcrAlg$set(MemorySegment seg, long index, int x) {
        _NCRYPT_TPM_PLATFORM_ATTESTATION_STATEMENT.pcrAlg$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbSignature$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSignature"));
    public static VarHandle cbSignature$VH() {
        return _NCRYPT_TPM_PLATFORM_ATTESTATION_STATEMENT.cbSignature$VH;
    }
    public static int cbSignature$get(MemorySegment seg) {
        return (int)_NCRYPT_TPM_PLATFORM_ATTESTATION_STATEMENT.cbSignature$VH.get(seg);
    }
    public static void cbSignature$set( MemorySegment seg, int x) {
        _NCRYPT_TPM_PLATFORM_ATTESTATION_STATEMENT.cbSignature$VH.set(seg, x);
    }
    public static int cbSignature$get(MemorySegment seg, long index) {
        return (int)_NCRYPT_TPM_PLATFORM_ATTESTATION_STATEMENT.cbSignature$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSignature$set(MemorySegment seg, long index, int x) {
        _NCRYPT_TPM_PLATFORM_ATTESTATION_STATEMENT.cbSignature$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbQuote$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbQuote"));
    public static VarHandle cbQuote$VH() {
        return _NCRYPT_TPM_PLATFORM_ATTESTATION_STATEMENT.cbQuote$VH;
    }
    public static int cbQuote$get(MemorySegment seg) {
        return (int)_NCRYPT_TPM_PLATFORM_ATTESTATION_STATEMENT.cbQuote$VH.get(seg);
    }
    public static void cbQuote$set( MemorySegment seg, int x) {
        _NCRYPT_TPM_PLATFORM_ATTESTATION_STATEMENT.cbQuote$VH.set(seg, x);
    }
    public static int cbQuote$get(MemorySegment seg, long index) {
        return (int)_NCRYPT_TPM_PLATFORM_ATTESTATION_STATEMENT.cbQuote$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbQuote$set(MemorySegment seg, long index, int x) {
        _NCRYPT_TPM_PLATFORM_ATTESTATION_STATEMENT.cbQuote$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbPcrs$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbPcrs"));
    public static VarHandle cbPcrs$VH() {
        return _NCRYPT_TPM_PLATFORM_ATTESTATION_STATEMENT.cbPcrs$VH;
    }
    public static int cbPcrs$get(MemorySegment seg) {
        return (int)_NCRYPT_TPM_PLATFORM_ATTESTATION_STATEMENT.cbPcrs$VH.get(seg);
    }
    public static void cbPcrs$set( MemorySegment seg, int x) {
        _NCRYPT_TPM_PLATFORM_ATTESTATION_STATEMENT.cbPcrs$VH.set(seg, x);
    }
    public static int cbPcrs$get(MemorySegment seg, long index) {
        return (int)_NCRYPT_TPM_PLATFORM_ATTESTATION_STATEMENT.cbPcrs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbPcrs$set(MemorySegment seg, long index, int x) {
        _NCRYPT_TPM_PLATFORM_ATTESTATION_STATEMENT.cbPcrs$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


