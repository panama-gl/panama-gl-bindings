// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _PROPSHEETPAGEA_V1 {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwSize"),
        Constants$root.C_LONG$LAYOUT.withName("dwFlags"),
        Constants$root.C_POINTER$LAYOUT.withName("hInstance"),
        MemoryLayout.unionLayout(
            Constants$root.C_POINTER$LAYOUT.withName("pszTemplate"),
            Constants$root.C_POINTER$LAYOUT.withName("pResource")
        ).withName("$anon$0"),
        MemoryLayout.unionLayout(
            Constants$root.C_POINTER$LAYOUT.withName("hIcon"),
            Constants$root.C_POINTER$LAYOUT.withName("pszIcon")
        ).withName("$anon$1"),
        Constants$root.C_POINTER$LAYOUT.withName("pszTitle"),
        Constants$root.C_POINTER$LAYOUT.withName("pfnDlgProc"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("lParam"),
        Constants$root.C_POINTER$LAYOUT.withName("pfnCallback"),
        Constants$root.C_POINTER$LAYOUT.withName("pcRefParent")
    ).withName("_PROPSHEETPAGEA_V1");
    public static MemoryLayout $LAYOUT() {
        return _PROPSHEETPAGEA_V1.$struct$LAYOUT;
    }
    static final VarHandle dwSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwSize"));
    public static VarHandle dwSize$VH() {
        return _PROPSHEETPAGEA_V1.dwSize$VH;
    }
    public static int dwSize$get(MemorySegment seg) {
        return (int)_PROPSHEETPAGEA_V1.dwSize$VH.get(seg);
    }
    public static void dwSize$set( MemorySegment seg, int x) {
        _PROPSHEETPAGEA_V1.dwSize$VH.set(seg, x);
    }
    public static int dwSize$get(MemorySegment seg, long index) {
        return (int)_PROPSHEETPAGEA_V1.dwSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSize$set(MemorySegment seg, long index, int x) {
        _PROPSHEETPAGEA_V1.dwSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return _PROPSHEETPAGEA_V1.dwFlags$VH;
    }
    public static int dwFlags$get(MemorySegment seg) {
        return (int)_PROPSHEETPAGEA_V1.dwFlags$VH.get(seg);
    }
    public static void dwFlags$set( MemorySegment seg, int x) {
        _PROPSHEETPAGEA_V1.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)_PROPSHEETPAGEA_V1.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        _PROPSHEETPAGEA_V1.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hInstance$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hInstance"));
    public static VarHandle hInstance$VH() {
        return _PROPSHEETPAGEA_V1.hInstance$VH;
    }
    public static MemoryAddress hInstance$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_PROPSHEETPAGEA_V1.hInstance$VH.get(seg);
    }
    public static void hInstance$set( MemorySegment seg, MemoryAddress x) {
        _PROPSHEETPAGEA_V1.hInstance$VH.set(seg, x);
    }
    public static MemoryAddress hInstance$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_PROPSHEETPAGEA_V1.hInstance$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hInstance$set(MemorySegment seg, long index, MemoryAddress x) {
        _PROPSHEETPAGEA_V1.hInstance$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pszTemplate$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("pszTemplate"));
    public static VarHandle pszTemplate$VH() {
        return _PROPSHEETPAGEA_V1.pszTemplate$VH;
    }
    public static MemoryAddress pszTemplate$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_PROPSHEETPAGEA_V1.pszTemplate$VH.get(seg);
    }
    public static void pszTemplate$set( MemorySegment seg, MemoryAddress x) {
        _PROPSHEETPAGEA_V1.pszTemplate$VH.set(seg, x);
    }
    public static MemoryAddress pszTemplate$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_PROPSHEETPAGEA_V1.pszTemplate$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszTemplate$set(MemorySegment seg, long index, MemoryAddress x) {
        _PROPSHEETPAGEA_V1.pszTemplate$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pResource$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("pResource"));
    public static VarHandle pResource$VH() {
        return _PROPSHEETPAGEA_V1.pResource$VH;
    }
    public static MemoryAddress pResource$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_PROPSHEETPAGEA_V1.pResource$VH.get(seg);
    }
    public static void pResource$set( MemorySegment seg, MemoryAddress x) {
        _PROPSHEETPAGEA_V1.pResource$VH.set(seg, x);
    }
    public static MemoryAddress pResource$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_PROPSHEETPAGEA_V1.pResource$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pResource$set(MemorySegment seg, long index, MemoryAddress x) {
        _PROPSHEETPAGEA_V1.pResource$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hIcon$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$1"), MemoryLayout.PathElement.groupElement("hIcon"));
    public static VarHandle hIcon$VH() {
        return _PROPSHEETPAGEA_V1.hIcon$VH;
    }
    public static MemoryAddress hIcon$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_PROPSHEETPAGEA_V1.hIcon$VH.get(seg);
    }
    public static void hIcon$set( MemorySegment seg, MemoryAddress x) {
        _PROPSHEETPAGEA_V1.hIcon$VH.set(seg, x);
    }
    public static MemoryAddress hIcon$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_PROPSHEETPAGEA_V1.hIcon$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hIcon$set(MemorySegment seg, long index, MemoryAddress x) {
        _PROPSHEETPAGEA_V1.hIcon$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pszIcon$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$1"), MemoryLayout.PathElement.groupElement("pszIcon"));
    public static VarHandle pszIcon$VH() {
        return _PROPSHEETPAGEA_V1.pszIcon$VH;
    }
    public static MemoryAddress pszIcon$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_PROPSHEETPAGEA_V1.pszIcon$VH.get(seg);
    }
    public static void pszIcon$set( MemorySegment seg, MemoryAddress x) {
        _PROPSHEETPAGEA_V1.pszIcon$VH.set(seg, x);
    }
    public static MemoryAddress pszIcon$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_PROPSHEETPAGEA_V1.pszIcon$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszIcon$set(MemorySegment seg, long index, MemoryAddress x) {
        _PROPSHEETPAGEA_V1.pszIcon$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pszTitle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pszTitle"));
    public static VarHandle pszTitle$VH() {
        return _PROPSHEETPAGEA_V1.pszTitle$VH;
    }
    public static MemoryAddress pszTitle$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_PROPSHEETPAGEA_V1.pszTitle$VH.get(seg);
    }
    public static void pszTitle$set( MemorySegment seg, MemoryAddress x) {
        _PROPSHEETPAGEA_V1.pszTitle$VH.set(seg, x);
    }
    public static MemoryAddress pszTitle$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_PROPSHEETPAGEA_V1.pszTitle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszTitle$set(MemorySegment seg, long index, MemoryAddress x) {
        _PROPSHEETPAGEA_V1.pszTitle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pfnDlgProc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pfnDlgProc"));
    public static VarHandle pfnDlgProc$VH() {
        return _PROPSHEETPAGEA_V1.pfnDlgProc$VH;
    }
    public static MemoryAddress pfnDlgProc$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_PROPSHEETPAGEA_V1.pfnDlgProc$VH.get(seg);
    }
    public static void pfnDlgProc$set( MemorySegment seg, MemoryAddress x) {
        _PROPSHEETPAGEA_V1.pfnDlgProc$VH.set(seg, x);
    }
    public static MemoryAddress pfnDlgProc$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_PROPSHEETPAGEA_V1.pfnDlgProc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pfnDlgProc$set(MemorySegment seg, long index, MemoryAddress x) {
        _PROPSHEETPAGEA_V1.pfnDlgProc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static DLGPROC pfnDlgProc (MemorySegment segment, MemorySession session) {
        return DLGPROC.ofAddress(pfnDlgProc$get(segment), session);
    }
    static final VarHandle lParam$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lParam"));
    public static VarHandle lParam$VH() {
        return _PROPSHEETPAGEA_V1.lParam$VH;
    }
    public static long lParam$get(MemorySegment seg) {
        return (long)_PROPSHEETPAGEA_V1.lParam$VH.get(seg);
    }
    public static void lParam$set( MemorySegment seg, long x) {
        _PROPSHEETPAGEA_V1.lParam$VH.set(seg, x);
    }
    public static long lParam$get(MemorySegment seg, long index) {
        return (long)_PROPSHEETPAGEA_V1.lParam$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lParam$set(MemorySegment seg, long index, long x) {
        _PROPSHEETPAGEA_V1.lParam$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pfnCallback$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pfnCallback"));
    public static VarHandle pfnCallback$VH() {
        return _PROPSHEETPAGEA_V1.pfnCallback$VH;
    }
    public static MemoryAddress pfnCallback$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_PROPSHEETPAGEA_V1.pfnCallback$VH.get(seg);
    }
    public static void pfnCallback$set( MemorySegment seg, MemoryAddress x) {
        _PROPSHEETPAGEA_V1.pfnCallback$VH.set(seg, x);
    }
    public static MemoryAddress pfnCallback$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_PROPSHEETPAGEA_V1.pfnCallback$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pfnCallback$set(MemorySegment seg, long index, MemoryAddress x) {
        _PROPSHEETPAGEA_V1.pfnCallback$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static LPFNPSPCALLBACKA pfnCallback (MemorySegment segment, MemorySession session) {
        return LPFNPSPCALLBACKA.ofAddress(pfnCallback$get(segment), session);
    }
    static final VarHandle pcRefParent$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pcRefParent"));
    public static VarHandle pcRefParent$VH() {
        return _PROPSHEETPAGEA_V1.pcRefParent$VH;
    }
    public static MemoryAddress pcRefParent$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_PROPSHEETPAGEA_V1.pcRefParent$VH.get(seg);
    }
    public static void pcRefParent$set( MemorySegment seg, MemoryAddress x) {
        _PROPSHEETPAGEA_V1.pcRefParent$VH.set(seg, x);
    }
    public static MemoryAddress pcRefParent$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_PROPSHEETPAGEA_V1.pcRefParent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pcRefParent$set(MemorySegment seg, long index, MemoryAddress x) {
        _PROPSHEETPAGEA_V1.pcRefParent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


