// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _IMAGE_OS2_HEADER {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("ne_magic"),
        Constants$root.C_CHAR$LAYOUT.withName("ne_ver"),
        Constants$root.C_CHAR$LAYOUT.withName("ne_rev"),
        Constants$root.C_SHORT$LAYOUT.withName("ne_enttab"),
        Constants$root.C_SHORT$LAYOUT.withName("ne_cbenttab"),
        Constants$root.C_LONG$LAYOUT.withName("ne_crc"),
        Constants$root.C_SHORT$LAYOUT.withName("ne_flags"),
        Constants$root.C_SHORT$LAYOUT.withName("ne_autodata"),
        Constants$root.C_SHORT$LAYOUT.withName("ne_heap"),
        Constants$root.C_SHORT$LAYOUT.withName("ne_stack"),
        Constants$root.C_LONG$LAYOUT.withName("ne_csip"),
        Constants$root.C_LONG$LAYOUT.withName("ne_sssp"),
        Constants$root.C_SHORT$LAYOUT.withName("ne_cseg"),
        Constants$root.C_SHORT$LAYOUT.withName("ne_cmod"),
        Constants$root.C_SHORT$LAYOUT.withName("ne_cbnrestab"),
        Constants$root.C_SHORT$LAYOUT.withName("ne_segtab"),
        Constants$root.C_SHORT$LAYOUT.withName("ne_rsrctab"),
        Constants$root.C_SHORT$LAYOUT.withName("ne_restab"),
        Constants$root.C_SHORT$LAYOUT.withName("ne_modtab"),
        Constants$root.C_SHORT$LAYOUT.withName("ne_imptab"),
        Constants$root.C_LONG$LAYOUT.withName("ne_nrestab"),
        Constants$root.C_SHORT$LAYOUT.withName("ne_cmovent"),
        Constants$root.C_SHORT$LAYOUT.withName("ne_align"),
        Constants$root.C_SHORT$LAYOUT.withName("ne_cres"),
        Constants$root.C_CHAR$LAYOUT.withName("ne_exetyp"),
        Constants$root.C_CHAR$LAYOUT.withName("ne_flagsothers"),
        Constants$root.C_SHORT$LAYOUT.withName("ne_pretthunks"),
        Constants$root.C_SHORT$LAYOUT.withName("ne_psegrefbytes"),
        Constants$root.C_SHORT$LAYOUT.withName("ne_swaparea"),
        Constants$root.C_SHORT$LAYOUT.withName("ne_expver")
    ).withName("_IMAGE_OS2_HEADER");
    public static MemoryLayout $LAYOUT() {
        return _IMAGE_OS2_HEADER.$struct$LAYOUT;
    }
    static final VarHandle ne_magic$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ne_magic"));
    public static VarHandle ne_magic$VH() {
        return _IMAGE_OS2_HEADER.ne_magic$VH;
    }
    public static short ne_magic$get(MemorySegment seg) {
        return (short)_IMAGE_OS2_HEADER.ne_magic$VH.get(seg);
    }
    public static void ne_magic$set( MemorySegment seg, short x) {
        _IMAGE_OS2_HEADER.ne_magic$VH.set(seg, x);
    }
    public static short ne_magic$get(MemorySegment seg, long index) {
        return (short)_IMAGE_OS2_HEADER.ne_magic$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ne_magic$set(MemorySegment seg, long index, short x) {
        _IMAGE_OS2_HEADER.ne_magic$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ne_ver$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ne_ver"));
    public static VarHandle ne_ver$VH() {
        return _IMAGE_OS2_HEADER.ne_ver$VH;
    }
    public static byte ne_ver$get(MemorySegment seg) {
        return (byte)_IMAGE_OS2_HEADER.ne_ver$VH.get(seg);
    }
    public static void ne_ver$set( MemorySegment seg, byte x) {
        _IMAGE_OS2_HEADER.ne_ver$VH.set(seg, x);
    }
    public static byte ne_ver$get(MemorySegment seg, long index) {
        return (byte)_IMAGE_OS2_HEADER.ne_ver$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ne_ver$set(MemorySegment seg, long index, byte x) {
        _IMAGE_OS2_HEADER.ne_ver$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ne_rev$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ne_rev"));
    public static VarHandle ne_rev$VH() {
        return _IMAGE_OS2_HEADER.ne_rev$VH;
    }
    public static byte ne_rev$get(MemorySegment seg) {
        return (byte)_IMAGE_OS2_HEADER.ne_rev$VH.get(seg);
    }
    public static void ne_rev$set( MemorySegment seg, byte x) {
        _IMAGE_OS2_HEADER.ne_rev$VH.set(seg, x);
    }
    public static byte ne_rev$get(MemorySegment seg, long index) {
        return (byte)_IMAGE_OS2_HEADER.ne_rev$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ne_rev$set(MemorySegment seg, long index, byte x) {
        _IMAGE_OS2_HEADER.ne_rev$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ne_enttab$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ne_enttab"));
    public static VarHandle ne_enttab$VH() {
        return _IMAGE_OS2_HEADER.ne_enttab$VH;
    }
    public static short ne_enttab$get(MemorySegment seg) {
        return (short)_IMAGE_OS2_HEADER.ne_enttab$VH.get(seg);
    }
    public static void ne_enttab$set( MemorySegment seg, short x) {
        _IMAGE_OS2_HEADER.ne_enttab$VH.set(seg, x);
    }
    public static short ne_enttab$get(MemorySegment seg, long index) {
        return (short)_IMAGE_OS2_HEADER.ne_enttab$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ne_enttab$set(MemorySegment seg, long index, short x) {
        _IMAGE_OS2_HEADER.ne_enttab$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ne_cbenttab$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ne_cbenttab"));
    public static VarHandle ne_cbenttab$VH() {
        return _IMAGE_OS2_HEADER.ne_cbenttab$VH;
    }
    public static short ne_cbenttab$get(MemorySegment seg) {
        return (short)_IMAGE_OS2_HEADER.ne_cbenttab$VH.get(seg);
    }
    public static void ne_cbenttab$set( MemorySegment seg, short x) {
        _IMAGE_OS2_HEADER.ne_cbenttab$VH.set(seg, x);
    }
    public static short ne_cbenttab$get(MemorySegment seg, long index) {
        return (short)_IMAGE_OS2_HEADER.ne_cbenttab$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ne_cbenttab$set(MemorySegment seg, long index, short x) {
        _IMAGE_OS2_HEADER.ne_cbenttab$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ne_crc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ne_crc"));
    public static VarHandle ne_crc$VH() {
        return _IMAGE_OS2_HEADER.ne_crc$VH;
    }
    public static int ne_crc$get(MemorySegment seg) {
        return (int)_IMAGE_OS2_HEADER.ne_crc$VH.get(seg);
    }
    public static void ne_crc$set( MemorySegment seg, int x) {
        _IMAGE_OS2_HEADER.ne_crc$VH.set(seg, x);
    }
    public static int ne_crc$get(MemorySegment seg, long index) {
        return (int)_IMAGE_OS2_HEADER.ne_crc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ne_crc$set(MemorySegment seg, long index, int x) {
        _IMAGE_OS2_HEADER.ne_crc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ne_flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ne_flags"));
    public static VarHandle ne_flags$VH() {
        return _IMAGE_OS2_HEADER.ne_flags$VH;
    }
    public static short ne_flags$get(MemorySegment seg) {
        return (short)_IMAGE_OS2_HEADER.ne_flags$VH.get(seg);
    }
    public static void ne_flags$set( MemorySegment seg, short x) {
        _IMAGE_OS2_HEADER.ne_flags$VH.set(seg, x);
    }
    public static short ne_flags$get(MemorySegment seg, long index) {
        return (short)_IMAGE_OS2_HEADER.ne_flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ne_flags$set(MemorySegment seg, long index, short x) {
        _IMAGE_OS2_HEADER.ne_flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ne_autodata$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ne_autodata"));
    public static VarHandle ne_autodata$VH() {
        return _IMAGE_OS2_HEADER.ne_autodata$VH;
    }
    public static short ne_autodata$get(MemorySegment seg) {
        return (short)_IMAGE_OS2_HEADER.ne_autodata$VH.get(seg);
    }
    public static void ne_autodata$set( MemorySegment seg, short x) {
        _IMAGE_OS2_HEADER.ne_autodata$VH.set(seg, x);
    }
    public static short ne_autodata$get(MemorySegment seg, long index) {
        return (short)_IMAGE_OS2_HEADER.ne_autodata$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ne_autodata$set(MemorySegment seg, long index, short x) {
        _IMAGE_OS2_HEADER.ne_autodata$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ne_heap$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ne_heap"));
    public static VarHandle ne_heap$VH() {
        return _IMAGE_OS2_HEADER.ne_heap$VH;
    }
    public static short ne_heap$get(MemorySegment seg) {
        return (short)_IMAGE_OS2_HEADER.ne_heap$VH.get(seg);
    }
    public static void ne_heap$set( MemorySegment seg, short x) {
        _IMAGE_OS2_HEADER.ne_heap$VH.set(seg, x);
    }
    public static short ne_heap$get(MemorySegment seg, long index) {
        return (short)_IMAGE_OS2_HEADER.ne_heap$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ne_heap$set(MemorySegment seg, long index, short x) {
        _IMAGE_OS2_HEADER.ne_heap$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ne_stack$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ne_stack"));
    public static VarHandle ne_stack$VH() {
        return _IMAGE_OS2_HEADER.ne_stack$VH;
    }
    public static short ne_stack$get(MemorySegment seg) {
        return (short)_IMAGE_OS2_HEADER.ne_stack$VH.get(seg);
    }
    public static void ne_stack$set( MemorySegment seg, short x) {
        _IMAGE_OS2_HEADER.ne_stack$VH.set(seg, x);
    }
    public static short ne_stack$get(MemorySegment seg, long index) {
        return (short)_IMAGE_OS2_HEADER.ne_stack$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ne_stack$set(MemorySegment seg, long index, short x) {
        _IMAGE_OS2_HEADER.ne_stack$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ne_csip$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ne_csip"));
    public static VarHandle ne_csip$VH() {
        return _IMAGE_OS2_HEADER.ne_csip$VH;
    }
    public static int ne_csip$get(MemorySegment seg) {
        return (int)_IMAGE_OS2_HEADER.ne_csip$VH.get(seg);
    }
    public static void ne_csip$set( MemorySegment seg, int x) {
        _IMAGE_OS2_HEADER.ne_csip$VH.set(seg, x);
    }
    public static int ne_csip$get(MemorySegment seg, long index) {
        return (int)_IMAGE_OS2_HEADER.ne_csip$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ne_csip$set(MemorySegment seg, long index, int x) {
        _IMAGE_OS2_HEADER.ne_csip$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ne_sssp$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ne_sssp"));
    public static VarHandle ne_sssp$VH() {
        return _IMAGE_OS2_HEADER.ne_sssp$VH;
    }
    public static int ne_sssp$get(MemorySegment seg) {
        return (int)_IMAGE_OS2_HEADER.ne_sssp$VH.get(seg);
    }
    public static void ne_sssp$set( MemorySegment seg, int x) {
        _IMAGE_OS2_HEADER.ne_sssp$VH.set(seg, x);
    }
    public static int ne_sssp$get(MemorySegment seg, long index) {
        return (int)_IMAGE_OS2_HEADER.ne_sssp$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ne_sssp$set(MemorySegment seg, long index, int x) {
        _IMAGE_OS2_HEADER.ne_sssp$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ne_cseg$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ne_cseg"));
    public static VarHandle ne_cseg$VH() {
        return _IMAGE_OS2_HEADER.ne_cseg$VH;
    }
    public static short ne_cseg$get(MemorySegment seg) {
        return (short)_IMAGE_OS2_HEADER.ne_cseg$VH.get(seg);
    }
    public static void ne_cseg$set( MemorySegment seg, short x) {
        _IMAGE_OS2_HEADER.ne_cseg$VH.set(seg, x);
    }
    public static short ne_cseg$get(MemorySegment seg, long index) {
        return (short)_IMAGE_OS2_HEADER.ne_cseg$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ne_cseg$set(MemorySegment seg, long index, short x) {
        _IMAGE_OS2_HEADER.ne_cseg$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ne_cmod$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ne_cmod"));
    public static VarHandle ne_cmod$VH() {
        return _IMAGE_OS2_HEADER.ne_cmod$VH;
    }
    public static short ne_cmod$get(MemorySegment seg) {
        return (short)_IMAGE_OS2_HEADER.ne_cmod$VH.get(seg);
    }
    public static void ne_cmod$set( MemorySegment seg, short x) {
        _IMAGE_OS2_HEADER.ne_cmod$VH.set(seg, x);
    }
    public static short ne_cmod$get(MemorySegment seg, long index) {
        return (short)_IMAGE_OS2_HEADER.ne_cmod$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ne_cmod$set(MemorySegment seg, long index, short x) {
        _IMAGE_OS2_HEADER.ne_cmod$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ne_cbnrestab$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ne_cbnrestab"));
    public static VarHandle ne_cbnrestab$VH() {
        return _IMAGE_OS2_HEADER.ne_cbnrestab$VH;
    }
    public static short ne_cbnrestab$get(MemorySegment seg) {
        return (short)_IMAGE_OS2_HEADER.ne_cbnrestab$VH.get(seg);
    }
    public static void ne_cbnrestab$set( MemorySegment seg, short x) {
        _IMAGE_OS2_HEADER.ne_cbnrestab$VH.set(seg, x);
    }
    public static short ne_cbnrestab$get(MemorySegment seg, long index) {
        return (short)_IMAGE_OS2_HEADER.ne_cbnrestab$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ne_cbnrestab$set(MemorySegment seg, long index, short x) {
        _IMAGE_OS2_HEADER.ne_cbnrestab$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ne_segtab$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ne_segtab"));
    public static VarHandle ne_segtab$VH() {
        return _IMAGE_OS2_HEADER.ne_segtab$VH;
    }
    public static short ne_segtab$get(MemorySegment seg) {
        return (short)_IMAGE_OS2_HEADER.ne_segtab$VH.get(seg);
    }
    public static void ne_segtab$set( MemorySegment seg, short x) {
        _IMAGE_OS2_HEADER.ne_segtab$VH.set(seg, x);
    }
    public static short ne_segtab$get(MemorySegment seg, long index) {
        return (short)_IMAGE_OS2_HEADER.ne_segtab$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ne_segtab$set(MemorySegment seg, long index, short x) {
        _IMAGE_OS2_HEADER.ne_segtab$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ne_rsrctab$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ne_rsrctab"));
    public static VarHandle ne_rsrctab$VH() {
        return _IMAGE_OS2_HEADER.ne_rsrctab$VH;
    }
    public static short ne_rsrctab$get(MemorySegment seg) {
        return (short)_IMAGE_OS2_HEADER.ne_rsrctab$VH.get(seg);
    }
    public static void ne_rsrctab$set( MemorySegment seg, short x) {
        _IMAGE_OS2_HEADER.ne_rsrctab$VH.set(seg, x);
    }
    public static short ne_rsrctab$get(MemorySegment seg, long index) {
        return (short)_IMAGE_OS2_HEADER.ne_rsrctab$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ne_rsrctab$set(MemorySegment seg, long index, short x) {
        _IMAGE_OS2_HEADER.ne_rsrctab$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ne_restab$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ne_restab"));
    public static VarHandle ne_restab$VH() {
        return _IMAGE_OS2_HEADER.ne_restab$VH;
    }
    public static short ne_restab$get(MemorySegment seg) {
        return (short)_IMAGE_OS2_HEADER.ne_restab$VH.get(seg);
    }
    public static void ne_restab$set( MemorySegment seg, short x) {
        _IMAGE_OS2_HEADER.ne_restab$VH.set(seg, x);
    }
    public static short ne_restab$get(MemorySegment seg, long index) {
        return (short)_IMAGE_OS2_HEADER.ne_restab$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ne_restab$set(MemorySegment seg, long index, short x) {
        _IMAGE_OS2_HEADER.ne_restab$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ne_modtab$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ne_modtab"));
    public static VarHandle ne_modtab$VH() {
        return _IMAGE_OS2_HEADER.ne_modtab$VH;
    }
    public static short ne_modtab$get(MemorySegment seg) {
        return (short)_IMAGE_OS2_HEADER.ne_modtab$VH.get(seg);
    }
    public static void ne_modtab$set( MemorySegment seg, short x) {
        _IMAGE_OS2_HEADER.ne_modtab$VH.set(seg, x);
    }
    public static short ne_modtab$get(MemorySegment seg, long index) {
        return (short)_IMAGE_OS2_HEADER.ne_modtab$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ne_modtab$set(MemorySegment seg, long index, short x) {
        _IMAGE_OS2_HEADER.ne_modtab$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ne_imptab$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ne_imptab"));
    public static VarHandle ne_imptab$VH() {
        return _IMAGE_OS2_HEADER.ne_imptab$VH;
    }
    public static short ne_imptab$get(MemorySegment seg) {
        return (short)_IMAGE_OS2_HEADER.ne_imptab$VH.get(seg);
    }
    public static void ne_imptab$set( MemorySegment seg, short x) {
        _IMAGE_OS2_HEADER.ne_imptab$VH.set(seg, x);
    }
    public static short ne_imptab$get(MemorySegment seg, long index) {
        return (short)_IMAGE_OS2_HEADER.ne_imptab$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ne_imptab$set(MemorySegment seg, long index, short x) {
        _IMAGE_OS2_HEADER.ne_imptab$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ne_nrestab$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ne_nrestab"));
    public static VarHandle ne_nrestab$VH() {
        return _IMAGE_OS2_HEADER.ne_nrestab$VH;
    }
    public static int ne_nrestab$get(MemorySegment seg) {
        return (int)_IMAGE_OS2_HEADER.ne_nrestab$VH.get(seg);
    }
    public static void ne_nrestab$set( MemorySegment seg, int x) {
        _IMAGE_OS2_HEADER.ne_nrestab$VH.set(seg, x);
    }
    public static int ne_nrestab$get(MemorySegment seg, long index) {
        return (int)_IMAGE_OS2_HEADER.ne_nrestab$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ne_nrestab$set(MemorySegment seg, long index, int x) {
        _IMAGE_OS2_HEADER.ne_nrestab$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ne_cmovent$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ne_cmovent"));
    public static VarHandle ne_cmovent$VH() {
        return _IMAGE_OS2_HEADER.ne_cmovent$VH;
    }
    public static short ne_cmovent$get(MemorySegment seg) {
        return (short)_IMAGE_OS2_HEADER.ne_cmovent$VH.get(seg);
    }
    public static void ne_cmovent$set( MemorySegment seg, short x) {
        _IMAGE_OS2_HEADER.ne_cmovent$VH.set(seg, x);
    }
    public static short ne_cmovent$get(MemorySegment seg, long index) {
        return (short)_IMAGE_OS2_HEADER.ne_cmovent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ne_cmovent$set(MemorySegment seg, long index, short x) {
        _IMAGE_OS2_HEADER.ne_cmovent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ne_align$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ne_align"));
    public static VarHandle ne_align$VH() {
        return _IMAGE_OS2_HEADER.ne_align$VH;
    }
    public static short ne_align$get(MemorySegment seg) {
        return (short)_IMAGE_OS2_HEADER.ne_align$VH.get(seg);
    }
    public static void ne_align$set( MemorySegment seg, short x) {
        _IMAGE_OS2_HEADER.ne_align$VH.set(seg, x);
    }
    public static short ne_align$get(MemorySegment seg, long index) {
        return (short)_IMAGE_OS2_HEADER.ne_align$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ne_align$set(MemorySegment seg, long index, short x) {
        _IMAGE_OS2_HEADER.ne_align$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ne_cres$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ne_cres"));
    public static VarHandle ne_cres$VH() {
        return _IMAGE_OS2_HEADER.ne_cres$VH;
    }
    public static short ne_cres$get(MemorySegment seg) {
        return (short)_IMAGE_OS2_HEADER.ne_cres$VH.get(seg);
    }
    public static void ne_cres$set( MemorySegment seg, short x) {
        _IMAGE_OS2_HEADER.ne_cres$VH.set(seg, x);
    }
    public static short ne_cres$get(MemorySegment seg, long index) {
        return (short)_IMAGE_OS2_HEADER.ne_cres$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ne_cres$set(MemorySegment seg, long index, short x) {
        _IMAGE_OS2_HEADER.ne_cres$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ne_exetyp$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ne_exetyp"));
    public static VarHandle ne_exetyp$VH() {
        return _IMAGE_OS2_HEADER.ne_exetyp$VH;
    }
    public static byte ne_exetyp$get(MemorySegment seg) {
        return (byte)_IMAGE_OS2_HEADER.ne_exetyp$VH.get(seg);
    }
    public static void ne_exetyp$set( MemorySegment seg, byte x) {
        _IMAGE_OS2_HEADER.ne_exetyp$VH.set(seg, x);
    }
    public static byte ne_exetyp$get(MemorySegment seg, long index) {
        return (byte)_IMAGE_OS2_HEADER.ne_exetyp$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ne_exetyp$set(MemorySegment seg, long index, byte x) {
        _IMAGE_OS2_HEADER.ne_exetyp$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ne_flagsothers$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ne_flagsothers"));
    public static VarHandle ne_flagsothers$VH() {
        return _IMAGE_OS2_HEADER.ne_flagsothers$VH;
    }
    public static byte ne_flagsothers$get(MemorySegment seg) {
        return (byte)_IMAGE_OS2_HEADER.ne_flagsothers$VH.get(seg);
    }
    public static void ne_flagsothers$set( MemorySegment seg, byte x) {
        _IMAGE_OS2_HEADER.ne_flagsothers$VH.set(seg, x);
    }
    public static byte ne_flagsothers$get(MemorySegment seg, long index) {
        return (byte)_IMAGE_OS2_HEADER.ne_flagsothers$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ne_flagsothers$set(MemorySegment seg, long index, byte x) {
        _IMAGE_OS2_HEADER.ne_flagsothers$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ne_pretthunks$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ne_pretthunks"));
    public static VarHandle ne_pretthunks$VH() {
        return _IMAGE_OS2_HEADER.ne_pretthunks$VH;
    }
    public static short ne_pretthunks$get(MemorySegment seg) {
        return (short)_IMAGE_OS2_HEADER.ne_pretthunks$VH.get(seg);
    }
    public static void ne_pretthunks$set( MemorySegment seg, short x) {
        _IMAGE_OS2_HEADER.ne_pretthunks$VH.set(seg, x);
    }
    public static short ne_pretthunks$get(MemorySegment seg, long index) {
        return (short)_IMAGE_OS2_HEADER.ne_pretthunks$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ne_pretthunks$set(MemorySegment seg, long index, short x) {
        _IMAGE_OS2_HEADER.ne_pretthunks$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ne_psegrefbytes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ne_psegrefbytes"));
    public static VarHandle ne_psegrefbytes$VH() {
        return _IMAGE_OS2_HEADER.ne_psegrefbytes$VH;
    }
    public static short ne_psegrefbytes$get(MemorySegment seg) {
        return (short)_IMAGE_OS2_HEADER.ne_psegrefbytes$VH.get(seg);
    }
    public static void ne_psegrefbytes$set( MemorySegment seg, short x) {
        _IMAGE_OS2_HEADER.ne_psegrefbytes$VH.set(seg, x);
    }
    public static short ne_psegrefbytes$get(MemorySegment seg, long index) {
        return (short)_IMAGE_OS2_HEADER.ne_psegrefbytes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ne_psegrefbytes$set(MemorySegment seg, long index, short x) {
        _IMAGE_OS2_HEADER.ne_psegrefbytes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ne_swaparea$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ne_swaparea"));
    public static VarHandle ne_swaparea$VH() {
        return _IMAGE_OS2_HEADER.ne_swaparea$VH;
    }
    public static short ne_swaparea$get(MemorySegment seg) {
        return (short)_IMAGE_OS2_HEADER.ne_swaparea$VH.get(seg);
    }
    public static void ne_swaparea$set( MemorySegment seg, short x) {
        _IMAGE_OS2_HEADER.ne_swaparea$VH.set(seg, x);
    }
    public static short ne_swaparea$get(MemorySegment seg, long index) {
        return (short)_IMAGE_OS2_HEADER.ne_swaparea$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ne_swaparea$set(MemorySegment seg, long index, short x) {
        _IMAGE_OS2_HEADER.ne_swaparea$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ne_expver$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ne_expver"));
    public static VarHandle ne_expver$VH() {
        return _IMAGE_OS2_HEADER.ne_expver$VH;
    }
    public static short ne_expver$get(MemorySegment seg) {
        return (short)_IMAGE_OS2_HEADER.ne_expver$VH.get(seg);
    }
    public static void ne_expver$set( MemorySegment seg, short x) {
        _IMAGE_OS2_HEADER.ne_expver$VH.set(seg, x);
    }
    public static short ne_expver$get(MemorySegment seg, long index) {
        return (short)_IMAGE_OS2_HEADER.ne_expver$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ne_expver$set(MemorySegment seg, long index, short x) {
        _IMAGE_OS2_HEADER.ne_expver$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


