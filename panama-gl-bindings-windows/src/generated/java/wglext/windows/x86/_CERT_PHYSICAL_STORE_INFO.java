// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _CERT_PHYSICAL_STORE_INFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("cbSize"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pszOpenStoreProvider"),
        Constants$root.C_LONG$LAYOUT.withName("dwOpenEncodingType"),
        Constants$root.C_LONG$LAYOUT.withName("dwOpenFlags"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("cbData"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_POINTER$LAYOUT.withName("pbData")
        ).withName("OpenParameters"),
        Constants$root.C_LONG$LAYOUT.withName("dwFlags"),
        Constants$root.C_LONG$LAYOUT.withName("dwPriority")
    ).withName("_CERT_PHYSICAL_STORE_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CERT_PHYSICAL_STORE_INFO.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _CERT_PHYSICAL_STORE_INFO.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)_CERT_PHYSICAL_STORE_INFO.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        _CERT_PHYSICAL_STORE_INFO.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_CERT_PHYSICAL_STORE_INFO.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _CERT_PHYSICAL_STORE_INFO.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pszOpenStoreProvider$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pszOpenStoreProvider"));
    public static VarHandle pszOpenStoreProvider$VH() {
        return _CERT_PHYSICAL_STORE_INFO.pszOpenStoreProvider$VH;
    }
    public static MemoryAddress pszOpenStoreProvider$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_CERT_PHYSICAL_STORE_INFO.pszOpenStoreProvider$VH.get(seg);
    }
    public static void pszOpenStoreProvider$set( MemorySegment seg, MemoryAddress x) {
        _CERT_PHYSICAL_STORE_INFO.pszOpenStoreProvider$VH.set(seg, x);
    }
    public static MemoryAddress pszOpenStoreProvider$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_CERT_PHYSICAL_STORE_INFO.pszOpenStoreProvider$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszOpenStoreProvider$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_PHYSICAL_STORE_INFO.pszOpenStoreProvider$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwOpenEncodingType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwOpenEncodingType"));
    public static VarHandle dwOpenEncodingType$VH() {
        return _CERT_PHYSICAL_STORE_INFO.dwOpenEncodingType$VH;
    }
    public static int dwOpenEncodingType$get(MemorySegment seg) {
        return (int)_CERT_PHYSICAL_STORE_INFO.dwOpenEncodingType$VH.get(seg);
    }
    public static void dwOpenEncodingType$set( MemorySegment seg, int x) {
        _CERT_PHYSICAL_STORE_INFO.dwOpenEncodingType$VH.set(seg, x);
    }
    public static int dwOpenEncodingType$get(MemorySegment seg, long index) {
        return (int)_CERT_PHYSICAL_STORE_INFO.dwOpenEncodingType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwOpenEncodingType$set(MemorySegment seg, long index, int x) {
        _CERT_PHYSICAL_STORE_INFO.dwOpenEncodingType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwOpenFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwOpenFlags"));
    public static VarHandle dwOpenFlags$VH() {
        return _CERT_PHYSICAL_STORE_INFO.dwOpenFlags$VH;
    }
    public static int dwOpenFlags$get(MemorySegment seg) {
        return (int)_CERT_PHYSICAL_STORE_INFO.dwOpenFlags$VH.get(seg);
    }
    public static void dwOpenFlags$set( MemorySegment seg, int x) {
        _CERT_PHYSICAL_STORE_INFO.dwOpenFlags$VH.set(seg, x);
    }
    public static int dwOpenFlags$get(MemorySegment seg, long index) {
        return (int)_CERT_PHYSICAL_STORE_INFO.dwOpenFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwOpenFlags$set(MemorySegment seg, long index, int x) {
        _CERT_PHYSICAL_STORE_INFO.dwOpenFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment OpenParameters$slice(MemorySegment seg) {
        return seg.asSlice(24, 16);
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return _CERT_PHYSICAL_STORE_INFO.dwFlags$VH;
    }
    public static int dwFlags$get(MemorySegment seg) {
        return (int)_CERT_PHYSICAL_STORE_INFO.dwFlags$VH.get(seg);
    }
    public static void dwFlags$set( MemorySegment seg, int x) {
        _CERT_PHYSICAL_STORE_INFO.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)_CERT_PHYSICAL_STORE_INFO.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        _CERT_PHYSICAL_STORE_INFO.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwPriority$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwPriority"));
    public static VarHandle dwPriority$VH() {
        return _CERT_PHYSICAL_STORE_INFO.dwPriority$VH;
    }
    public static int dwPriority$get(MemorySegment seg) {
        return (int)_CERT_PHYSICAL_STORE_INFO.dwPriority$VH.get(seg);
    }
    public static void dwPriority$set( MemorySegment seg, int x) {
        _CERT_PHYSICAL_STORE_INFO.dwPriority$VH.set(seg, x);
    }
    public static int dwPriority$get(MemorySegment seg, long index) {
        return (int)_CERT_PHYSICAL_STORE_INFO.dwPriority$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwPriority$set(MemorySegment seg, long index, int x) {
        _CERT_PHYSICAL_STORE_INFO.dwPriority$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


