// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CMSG_CTRL_VERIFY_SIGNATURE_EX_PARA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_LONG_LONG$LAYOUT.withName("hCryptProv"),
        Constants$root.C_LONG$LAYOUT.withName("dwSignerIndex"),
        Constants$root.C_LONG$LAYOUT.withName("dwSignerType"),
        Constants$root.C_POINTER$LAYOUT.withName("pvSigner")
    ).withName("_CMSG_CTRL_VERIFY_SIGNATURE_EX_PARA");
    public static MemoryLayout $LAYOUT() {
        return _CMSG_CTRL_VERIFY_SIGNATURE_EX_PARA.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _CMSG_CTRL_VERIFY_SIGNATURE_EX_PARA.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)_CMSG_CTRL_VERIFY_SIGNATURE_EX_PARA.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        _CMSG_CTRL_VERIFY_SIGNATURE_EX_PARA.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_CMSG_CTRL_VERIFY_SIGNATURE_EX_PARA.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _CMSG_CTRL_VERIFY_SIGNATURE_EX_PARA.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hCryptProv$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hCryptProv"));
    public static VarHandle hCryptProv$VH() {
        return _CMSG_CTRL_VERIFY_SIGNATURE_EX_PARA.hCryptProv$VH;
    }
    public static long hCryptProv$get(MemorySegment seg) {
        return (long)_CMSG_CTRL_VERIFY_SIGNATURE_EX_PARA.hCryptProv$VH.get(seg);
    }
    public static void hCryptProv$set( MemorySegment seg, long x) {
        _CMSG_CTRL_VERIFY_SIGNATURE_EX_PARA.hCryptProv$VH.set(seg, x);
    }
    public static long hCryptProv$get(MemorySegment seg, long index) {
        return (long)_CMSG_CTRL_VERIFY_SIGNATURE_EX_PARA.hCryptProv$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hCryptProv$set(MemorySegment seg, long index, long x) {
        _CMSG_CTRL_VERIFY_SIGNATURE_EX_PARA.hCryptProv$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwSignerIndex$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwSignerIndex"));
    public static VarHandle dwSignerIndex$VH() {
        return _CMSG_CTRL_VERIFY_SIGNATURE_EX_PARA.dwSignerIndex$VH;
    }
    public static int dwSignerIndex$get(MemorySegment seg) {
        return (int)_CMSG_CTRL_VERIFY_SIGNATURE_EX_PARA.dwSignerIndex$VH.get(seg);
    }
    public static void dwSignerIndex$set( MemorySegment seg, int x) {
        _CMSG_CTRL_VERIFY_SIGNATURE_EX_PARA.dwSignerIndex$VH.set(seg, x);
    }
    public static int dwSignerIndex$get(MemorySegment seg, long index) {
        return (int)_CMSG_CTRL_VERIFY_SIGNATURE_EX_PARA.dwSignerIndex$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSignerIndex$set(MemorySegment seg, long index, int x) {
        _CMSG_CTRL_VERIFY_SIGNATURE_EX_PARA.dwSignerIndex$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwSignerType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwSignerType"));
    public static VarHandle dwSignerType$VH() {
        return _CMSG_CTRL_VERIFY_SIGNATURE_EX_PARA.dwSignerType$VH;
    }
    public static int dwSignerType$get(MemorySegment seg) {
        return (int)_CMSG_CTRL_VERIFY_SIGNATURE_EX_PARA.dwSignerType$VH.get(seg);
    }
    public static void dwSignerType$set( MemorySegment seg, int x) {
        _CMSG_CTRL_VERIFY_SIGNATURE_EX_PARA.dwSignerType$VH.set(seg, x);
    }
    public static int dwSignerType$get(MemorySegment seg, long index) {
        return (int)_CMSG_CTRL_VERIFY_SIGNATURE_EX_PARA.dwSignerType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSignerType$set(MemorySegment seg, long index, int x) {
        _CMSG_CTRL_VERIFY_SIGNATURE_EX_PARA.dwSignerType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pvSigner$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pvSigner"));
    public static VarHandle pvSigner$VH() {
        return _CMSG_CTRL_VERIFY_SIGNATURE_EX_PARA.pvSigner$VH;
    }
    public static MemoryAddress pvSigner$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CMSG_CTRL_VERIFY_SIGNATURE_EX_PARA.pvSigner$VH.get(seg);
    }
    public static void pvSigner$set( MemorySegment seg, MemoryAddress x) {
        _CMSG_CTRL_VERIFY_SIGNATURE_EX_PARA.pvSigner$VH.set(seg, x);
    }
    public static MemoryAddress pvSigner$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CMSG_CTRL_VERIFY_SIGNATURE_EX_PARA.pvSigner$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pvSigner$set(MemorySegment seg, long index, MemoryAddress x) {
        _CMSG_CTRL_VERIFY_SIGNATURE_EX_PARA.pvSigner$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

