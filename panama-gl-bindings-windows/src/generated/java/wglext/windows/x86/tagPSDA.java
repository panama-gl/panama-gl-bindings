// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagPSDA {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("lStructSize"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("hwndOwner"),
        Constants$root.C_POINTER$LAYOUT.withName("hDevMode"),
        Constants$root.C_POINTER$LAYOUT.withName("hDevNames"),
        Constants$root.C_LONG$LAYOUT.withName("Flags"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("x"),
            Constants$root.C_LONG$LAYOUT.withName("y")
        ).withName("ptPaperSize"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("left"),
            Constants$root.C_LONG$LAYOUT.withName("top"),
            Constants$root.C_LONG$LAYOUT.withName("right"),
            Constants$root.C_LONG$LAYOUT.withName("bottom")
        ).withName("rtMinMargin"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("left"),
            Constants$root.C_LONG$LAYOUT.withName("top"),
            Constants$root.C_LONG$LAYOUT.withName("right"),
            Constants$root.C_LONG$LAYOUT.withName("bottom")
        ).withName("rtMargin"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("hInstance"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("lCustData"),
        Constants$root.C_POINTER$LAYOUT.withName("lpfnPageSetupHook"),
        Constants$root.C_POINTER$LAYOUT.withName("lpfnPagePaintHook"),
        Constants$root.C_POINTER$LAYOUT.withName("lpPageSetupTemplateName"),
        Constants$root.C_POINTER$LAYOUT.withName("hPageSetupTemplate")
    ).withName("tagPSDA");
    public static MemoryLayout $LAYOUT() {
        return tagPSDA.$struct$LAYOUT;
    }
    static final VarHandle lStructSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lStructSize"));
    public static VarHandle lStructSize$VH() {
        return tagPSDA.lStructSize$VH;
    }
    public static int lStructSize$get(MemorySegment seg) {
        return (int)tagPSDA.lStructSize$VH.get(seg);
    }
    public static void lStructSize$set( MemorySegment seg, int x) {
        tagPSDA.lStructSize$VH.set(seg, x);
    }
    public static int lStructSize$get(MemorySegment seg, long index) {
        return (int)tagPSDA.lStructSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lStructSize$set(MemorySegment seg, long index, int x) {
        tagPSDA.lStructSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hwndOwner$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hwndOwner"));
    public static VarHandle hwndOwner$VH() {
        return tagPSDA.hwndOwner$VH;
    }
    public static MemoryAddress hwndOwner$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagPSDA.hwndOwner$VH.get(seg);
    }
    public static void hwndOwner$set( MemorySegment seg, MemoryAddress x) {
        tagPSDA.hwndOwner$VH.set(seg, x);
    }
    public static MemoryAddress hwndOwner$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagPSDA.hwndOwner$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hwndOwner$set(MemorySegment seg, long index, MemoryAddress x) {
        tagPSDA.hwndOwner$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hDevMode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hDevMode"));
    public static VarHandle hDevMode$VH() {
        return tagPSDA.hDevMode$VH;
    }
    public static MemoryAddress hDevMode$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagPSDA.hDevMode$VH.get(seg);
    }
    public static void hDevMode$set( MemorySegment seg, MemoryAddress x) {
        tagPSDA.hDevMode$VH.set(seg, x);
    }
    public static MemoryAddress hDevMode$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagPSDA.hDevMode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hDevMode$set(MemorySegment seg, long index, MemoryAddress x) {
        tagPSDA.hDevMode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hDevNames$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hDevNames"));
    public static VarHandle hDevNames$VH() {
        return tagPSDA.hDevNames$VH;
    }
    public static MemoryAddress hDevNames$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagPSDA.hDevNames$VH.get(seg);
    }
    public static void hDevNames$set( MemorySegment seg, MemoryAddress x) {
        tagPSDA.hDevNames$VH.set(seg, x);
    }
    public static MemoryAddress hDevNames$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagPSDA.hDevNames$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hDevNames$set(MemorySegment seg, long index, MemoryAddress x) {
        tagPSDA.hDevNames$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return tagPSDA.Flags$VH;
    }
    public static int Flags$get(MemorySegment seg) {
        return (int)tagPSDA.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, int x) {
        tagPSDA.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)tagPSDA.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        tagPSDA.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ptPaperSize$slice(MemorySegment seg) {
        return seg.asSlice(36, 8);
    }
    public static MemorySegment rtMinMargin$slice(MemorySegment seg) {
        return seg.asSlice(44, 16);
    }
    public static MemorySegment rtMargin$slice(MemorySegment seg) {
        return seg.asSlice(60, 16);
    }
    static final VarHandle hInstance$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hInstance"));
    public static VarHandle hInstance$VH() {
        return tagPSDA.hInstance$VH;
    }
    public static MemoryAddress hInstance$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagPSDA.hInstance$VH.get(seg);
    }
    public static void hInstance$set( MemorySegment seg, MemoryAddress x) {
        tagPSDA.hInstance$VH.set(seg, x);
    }
    public static MemoryAddress hInstance$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagPSDA.hInstance$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hInstance$set(MemorySegment seg, long index, MemoryAddress x) {
        tagPSDA.hInstance$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lCustData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lCustData"));
    public static VarHandle lCustData$VH() {
        return tagPSDA.lCustData$VH;
    }
    public static long lCustData$get(MemorySegment seg) {
        return (long)tagPSDA.lCustData$VH.get(seg);
    }
    public static void lCustData$set( MemorySegment seg, long x) {
        tagPSDA.lCustData$VH.set(seg, x);
    }
    public static long lCustData$get(MemorySegment seg, long index) {
        return (long)tagPSDA.lCustData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lCustData$set(MemorySegment seg, long index, long x) {
        tagPSDA.lCustData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpfnPageSetupHook$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpfnPageSetupHook"));
    public static VarHandle lpfnPageSetupHook$VH() {
        return tagPSDA.lpfnPageSetupHook$VH;
    }
    public static MemoryAddress lpfnPageSetupHook$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagPSDA.lpfnPageSetupHook$VH.get(seg);
    }
    public static void lpfnPageSetupHook$set( MemorySegment seg, MemoryAddress x) {
        tagPSDA.lpfnPageSetupHook$VH.set(seg, x);
    }
    public static MemoryAddress lpfnPageSetupHook$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagPSDA.lpfnPageSetupHook$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpfnPageSetupHook$set(MemorySegment seg, long index, MemoryAddress x) {
        tagPSDA.lpfnPageSetupHook$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static LPPAGESETUPHOOK lpfnPageSetupHook (MemorySegment segment, MemorySession session) {
        return LPPAGESETUPHOOK.ofAddress(lpfnPageSetupHook$get(segment), session);
    }
    static final VarHandle lpfnPagePaintHook$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpfnPagePaintHook"));
    public static VarHandle lpfnPagePaintHook$VH() {
        return tagPSDA.lpfnPagePaintHook$VH;
    }
    public static MemoryAddress lpfnPagePaintHook$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagPSDA.lpfnPagePaintHook$VH.get(seg);
    }
    public static void lpfnPagePaintHook$set( MemorySegment seg, MemoryAddress x) {
        tagPSDA.lpfnPagePaintHook$VH.set(seg, x);
    }
    public static MemoryAddress lpfnPagePaintHook$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagPSDA.lpfnPagePaintHook$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpfnPagePaintHook$set(MemorySegment seg, long index, MemoryAddress x) {
        tagPSDA.lpfnPagePaintHook$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static LPPAGEPAINTHOOK lpfnPagePaintHook (MemorySegment segment, MemorySession session) {
        return LPPAGEPAINTHOOK.ofAddress(lpfnPagePaintHook$get(segment), session);
    }
    static final VarHandle lpPageSetupTemplateName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpPageSetupTemplateName"));
    public static VarHandle lpPageSetupTemplateName$VH() {
        return tagPSDA.lpPageSetupTemplateName$VH;
    }
    public static MemoryAddress lpPageSetupTemplateName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagPSDA.lpPageSetupTemplateName$VH.get(seg);
    }
    public static void lpPageSetupTemplateName$set( MemorySegment seg, MemoryAddress x) {
        tagPSDA.lpPageSetupTemplateName$VH.set(seg, x);
    }
    public static MemoryAddress lpPageSetupTemplateName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagPSDA.lpPageSetupTemplateName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpPageSetupTemplateName$set(MemorySegment seg, long index, MemoryAddress x) {
        tagPSDA.lpPageSetupTemplateName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hPageSetupTemplate$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hPageSetupTemplate"));
    public static VarHandle hPageSetupTemplate$VH() {
        return tagPSDA.hPageSetupTemplate$VH;
    }
    public static MemoryAddress hPageSetupTemplate$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagPSDA.hPageSetupTemplate$VH.get(seg);
    }
    public static void hPageSetupTemplate$set( MemorySegment seg, MemoryAddress x) {
        tagPSDA.hPageSetupTemplate$VH.set(seg, x);
    }
    public static MemoryAddress hPageSetupTemplate$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagPSDA.hPageSetupTemplate$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hPageSetupTemplate$set(MemorySegment seg, long index, MemoryAddress x) {
        tagPSDA.hPageSetupTemplate$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

