// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _FORM_INFO_2W {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("Flags"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pName"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("cx"),
            Constants$root.C_LONG$LAYOUT.withName("cy")
        ).withName("Size"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("left"),
            Constants$root.C_LONG$LAYOUT.withName("top"),
            Constants$root.C_LONG$LAYOUT.withName("right"),
            Constants$root.C_LONG$LAYOUT.withName("bottom")
        ).withName("ImageableArea"),
        Constants$root.C_POINTER$LAYOUT.withName("pKeyword"),
        Constants$root.C_LONG$LAYOUT.withName("StringType"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pMuiDll"),
        Constants$root.C_LONG$LAYOUT.withName("dwResourceId"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("pDisplayName"),
        Constants$root.C_SHORT$LAYOUT.withName("wLangId"),
        MemoryLayout.paddingLayout(48)
    ).withName("_FORM_INFO_2W");
    public static MemoryLayout $LAYOUT() {
        return _FORM_INFO_2W.$struct$LAYOUT;
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _FORM_INFO_2W.Flags$VH;
    }
    public static int Flags$get(MemorySegment seg) {
        return (int)_FORM_INFO_2W.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, int x) {
        _FORM_INFO_2W.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_FORM_INFO_2W.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _FORM_INFO_2W.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pName"));
    public static VarHandle pName$VH() {
        return _FORM_INFO_2W.pName$VH;
    }
    public static MemoryAddress pName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_FORM_INFO_2W.pName$VH.get(seg);
    }
    public static void pName$set( MemorySegment seg, MemoryAddress x) {
        _FORM_INFO_2W.pName$VH.set(seg, x);
    }
    public static MemoryAddress pName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_FORM_INFO_2W.pName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pName$set(MemorySegment seg, long index, MemoryAddress x) {
        _FORM_INFO_2W.pName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Size$slice(MemorySegment seg) {
        return seg.asSlice(16, 8);
    }
    public static MemorySegment ImageableArea$slice(MemorySegment seg) {
        return seg.asSlice(24, 16);
    }
    static final VarHandle pKeyword$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pKeyword"));
    public static VarHandle pKeyword$VH() {
        return _FORM_INFO_2W.pKeyword$VH;
    }
    public static MemoryAddress pKeyword$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_FORM_INFO_2W.pKeyword$VH.get(seg);
    }
    public static void pKeyword$set( MemorySegment seg, MemoryAddress x) {
        _FORM_INFO_2W.pKeyword$VH.set(seg, x);
    }
    public static MemoryAddress pKeyword$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_FORM_INFO_2W.pKeyword$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pKeyword$set(MemorySegment seg, long index, MemoryAddress x) {
        _FORM_INFO_2W.pKeyword$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle StringType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("StringType"));
    public static VarHandle StringType$VH() {
        return _FORM_INFO_2W.StringType$VH;
    }
    public static int StringType$get(MemorySegment seg) {
        return (int)_FORM_INFO_2W.StringType$VH.get(seg);
    }
    public static void StringType$set( MemorySegment seg, int x) {
        _FORM_INFO_2W.StringType$VH.set(seg, x);
    }
    public static int StringType$get(MemorySegment seg, long index) {
        return (int)_FORM_INFO_2W.StringType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void StringType$set(MemorySegment seg, long index, int x) {
        _FORM_INFO_2W.StringType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pMuiDll$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pMuiDll"));
    public static VarHandle pMuiDll$VH() {
        return _FORM_INFO_2W.pMuiDll$VH;
    }
    public static MemoryAddress pMuiDll$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_FORM_INFO_2W.pMuiDll$VH.get(seg);
    }
    public static void pMuiDll$set( MemorySegment seg, MemoryAddress x) {
        _FORM_INFO_2W.pMuiDll$VH.set(seg, x);
    }
    public static MemoryAddress pMuiDll$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_FORM_INFO_2W.pMuiDll$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pMuiDll$set(MemorySegment seg, long index, MemoryAddress x) {
        _FORM_INFO_2W.pMuiDll$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwResourceId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwResourceId"));
    public static VarHandle dwResourceId$VH() {
        return _FORM_INFO_2W.dwResourceId$VH;
    }
    public static int dwResourceId$get(MemorySegment seg) {
        return (int)_FORM_INFO_2W.dwResourceId$VH.get(seg);
    }
    public static void dwResourceId$set( MemorySegment seg, int x) {
        _FORM_INFO_2W.dwResourceId$VH.set(seg, x);
    }
    public static int dwResourceId$get(MemorySegment seg, long index) {
        return (int)_FORM_INFO_2W.dwResourceId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwResourceId$set(MemorySegment seg, long index, int x) {
        _FORM_INFO_2W.dwResourceId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pDisplayName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pDisplayName"));
    public static VarHandle pDisplayName$VH() {
        return _FORM_INFO_2W.pDisplayName$VH;
    }
    public static MemoryAddress pDisplayName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_FORM_INFO_2W.pDisplayName$VH.get(seg);
    }
    public static void pDisplayName$set( MemorySegment seg, MemoryAddress x) {
        _FORM_INFO_2W.pDisplayName$VH.set(seg, x);
    }
    public static MemoryAddress pDisplayName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_FORM_INFO_2W.pDisplayName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pDisplayName$set(MemorySegment seg, long index, MemoryAddress x) {
        _FORM_INFO_2W.pDisplayName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wLangId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wLangId"));
    public static VarHandle wLangId$VH() {
        return _FORM_INFO_2W.wLangId$VH;
    }
    public static short wLangId$get(MemorySegment seg) {
        return (short)_FORM_INFO_2W.wLangId$VH.get(seg);
    }
    public static void wLangId$set( MemorySegment seg, short x) {
        _FORM_INFO_2W.wLangId$VH.set(seg, x);
    }
    public static short wLangId$get(MemorySegment seg, long index) {
        return (short)_FORM_INFO_2W.wLangId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wLangId$set(MemorySegment seg, long index, short x) {
        _FORM_INFO_2W.wLangId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


