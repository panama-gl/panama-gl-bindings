// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagTEXTMETRICW {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("tmHeight"),
        Constants$root.C_LONG$LAYOUT.withName("tmAscent"),
        Constants$root.C_LONG$LAYOUT.withName("tmDescent"),
        Constants$root.C_LONG$LAYOUT.withName("tmInternalLeading"),
        Constants$root.C_LONG$LAYOUT.withName("tmExternalLeading"),
        Constants$root.C_LONG$LAYOUT.withName("tmAveCharWidth"),
        Constants$root.C_LONG$LAYOUT.withName("tmMaxCharWidth"),
        Constants$root.C_LONG$LAYOUT.withName("tmWeight"),
        Constants$root.C_LONG$LAYOUT.withName("tmOverhang"),
        Constants$root.C_LONG$LAYOUT.withName("tmDigitizedAspectX"),
        Constants$root.C_LONG$LAYOUT.withName("tmDigitizedAspectY"),
        Constants$root.C_SHORT$LAYOUT.withName("tmFirstChar"),
        Constants$root.C_SHORT$LAYOUT.withName("tmLastChar"),
        Constants$root.C_SHORT$LAYOUT.withName("tmDefaultChar"),
        Constants$root.C_SHORT$LAYOUT.withName("tmBreakChar"),
        Constants$root.C_CHAR$LAYOUT.withName("tmItalic"),
        Constants$root.C_CHAR$LAYOUT.withName("tmUnderlined"),
        Constants$root.C_CHAR$LAYOUT.withName("tmStruckOut"),
        Constants$root.C_CHAR$LAYOUT.withName("tmPitchAndFamily"),
        Constants$root.C_CHAR$LAYOUT.withName("tmCharSet"),
        MemoryLayout.paddingLayout(24)
    ).withName("tagTEXTMETRICW");
    public static MemoryLayout $LAYOUT() {
        return tagTEXTMETRICW.$struct$LAYOUT;
    }
    static final VarHandle tmHeight$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tmHeight"));
    public static VarHandle tmHeight$VH() {
        return tagTEXTMETRICW.tmHeight$VH;
    }
    public static int tmHeight$get(MemorySegment seg) {
        return (int)tagTEXTMETRICW.tmHeight$VH.get(seg);
    }
    public static void tmHeight$set( MemorySegment seg, int x) {
        tagTEXTMETRICW.tmHeight$VH.set(seg, x);
    }
    public static int tmHeight$get(MemorySegment seg, long index) {
        return (int)tagTEXTMETRICW.tmHeight$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tmHeight$set(MemorySegment seg, long index, int x) {
        tagTEXTMETRICW.tmHeight$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tmAscent$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tmAscent"));
    public static VarHandle tmAscent$VH() {
        return tagTEXTMETRICW.tmAscent$VH;
    }
    public static int tmAscent$get(MemorySegment seg) {
        return (int)tagTEXTMETRICW.tmAscent$VH.get(seg);
    }
    public static void tmAscent$set( MemorySegment seg, int x) {
        tagTEXTMETRICW.tmAscent$VH.set(seg, x);
    }
    public static int tmAscent$get(MemorySegment seg, long index) {
        return (int)tagTEXTMETRICW.tmAscent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tmAscent$set(MemorySegment seg, long index, int x) {
        tagTEXTMETRICW.tmAscent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tmDescent$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tmDescent"));
    public static VarHandle tmDescent$VH() {
        return tagTEXTMETRICW.tmDescent$VH;
    }
    public static int tmDescent$get(MemorySegment seg) {
        return (int)tagTEXTMETRICW.tmDescent$VH.get(seg);
    }
    public static void tmDescent$set( MemorySegment seg, int x) {
        tagTEXTMETRICW.tmDescent$VH.set(seg, x);
    }
    public static int tmDescent$get(MemorySegment seg, long index) {
        return (int)tagTEXTMETRICW.tmDescent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tmDescent$set(MemorySegment seg, long index, int x) {
        tagTEXTMETRICW.tmDescent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tmInternalLeading$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tmInternalLeading"));
    public static VarHandle tmInternalLeading$VH() {
        return tagTEXTMETRICW.tmInternalLeading$VH;
    }
    public static int tmInternalLeading$get(MemorySegment seg) {
        return (int)tagTEXTMETRICW.tmInternalLeading$VH.get(seg);
    }
    public static void tmInternalLeading$set( MemorySegment seg, int x) {
        tagTEXTMETRICW.tmInternalLeading$VH.set(seg, x);
    }
    public static int tmInternalLeading$get(MemorySegment seg, long index) {
        return (int)tagTEXTMETRICW.tmInternalLeading$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tmInternalLeading$set(MemorySegment seg, long index, int x) {
        tagTEXTMETRICW.tmInternalLeading$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tmExternalLeading$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tmExternalLeading"));
    public static VarHandle tmExternalLeading$VH() {
        return tagTEXTMETRICW.tmExternalLeading$VH;
    }
    public static int tmExternalLeading$get(MemorySegment seg) {
        return (int)tagTEXTMETRICW.tmExternalLeading$VH.get(seg);
    }
    public static void tmExternalLeading$set( MemorySegment seg, int x) {
        tagTEXTMETRICW.tmExternalLeading$VH.set(seg, x);
    }
    public static int tmExternalLeading$get(MemorySegment seg, long index) {
        return (int)tagTEXTMETRICW.tmExternalLeading$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tmExternalLeading$set(MemorySegment seg, long index, int x) {
        tagTEXTMETRICW.tmExternalLeading$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tmAveCharWidth$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tmAveCharWidth"));
    public static VarHandle tmAveCharWidth$VH() {
        return tagTEXTMETRICW.tmAveCharWidth$VH;
    }
    public static int tmAveCharWidth$get(MemorySegment seg) {
        return (int)tagTEXTMETRICW.tmAveCharWidth$VH.get(seg);
    }
    public static void tmAveCharWidth$set( MemorySegment seg, int x) {
        tagTEXTMETRICW.tmAveCharWidth$VH.set(seg, x);
    }
    public static int tmAveCharWidth$get(MemorySegment seg, long index) {
        return (int)tagTEXTMETRICW.tmAveCharWidth$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tmAveCharWidth$set(MemorySegment seg, long index, int x) {
        tagTEXTMETRICW.tmAveCharWidth$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tmMaxCharWidth$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tmMaxCharWidth"));
    public static VarHandle tmMaxCharWidth$VH() {
        return tagTEXTMETRICW.tmMaxCharWidth$VH;
    }
    public static int tmMaxCharWidth$get(MemorySegment seg) {
        return (int)tagTEXTMETRICW.tmMaxCharWidth$VH.get(seg);
    }
    public static void tmMaxCharWidth$set( MemorySegment seg, int x) {
        tagTEXTMETRICW.tmMaxCharWidth$VH.set(seg, x);
    }
    public static int tmMaxCharWidth$get(MemorySegment seg, long index) {
        return (int)tagTEXTMETRICW.tmMaxCharWidth$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tmMaxCharWidth$set(MemorySegment seg, long index, int x) {
        tagTEXTMETRICW.tmMaxCharWidth$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tmWeight$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tmWeight"));
    public static VarHandle tmWeight$VH() {
        return tagTEXTMETRICW.tmWeight$VH;
    }
    public static int tmWeight$get(MemorySegment seg) {
        return (int)tagTEXTMETRICW.tmWeight$VH.get(seg);
    }
    public static void tmWeight$set( MemorySegment seg, int x) {
        tagTEXTMETRICW.tmWeight$VH.set(seg, x);
    }
    public static int tmWeight$get(MemorySegment seg, long index) {
        return (int)tagTEXTMETRICW.tmWeight$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tmWeight$set(MemorySegment seg, long index, int x) {
        tagTEXTMETRICW.tmWeight$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tmOverhang$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tmOverhang"));
    public static VarHandle tmOverhang$VH() {
        return tagTEXTMETRICW.tmOverhang$VH;
    }
    public static int tmOverhang$get(MemorySegment seg) {
        return (int)tagTEXTMETRICW.tmOverhang$VH.get(seg);
    }
    public static void tmOverhang$set( MemorySegment seg, int x) {
        tagTEXTMETRICW.tmOverhang$VH.set(seg, x);
    }
    public static int tmOverhang$get(MemorySegment seg, long index) {
        return (int)tagTEXTMETRICW.tmOverhang$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tmOverhang$set(MemorySegment seg, long index, int x) {
        tagTEXTMETRICW.tmOverhang$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tmDigitizedAspectX$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tmDigitizedAspectX"));
    public static VarHandle tmDigitizedAspectX$VH() {
        return tagTEXTMETRICW.tmDigitizedAspectX$VH;
    }
    public static int tmDigitizedAspectX$get(MemorySegment seg) {
        return (int)tagTEXTMETRICW.tmDigitizedAspectX$VH.get(seg);
    }
    public static void tmDigitizedAspectX$set( MemorySegment seg, int x) {
        tagTEXTMETRICW.tmDigitizedAspectX$VH.set(seg, x);
    }
    public static int tmDigitizedAspectX$get(MemorySegment seg, long index) {
        return (int)tagTEXTMETRICW.tmDigitizedAspectX$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tmDigitizedAspectX$set(MemorySegment seg, long index, int x) {
        tagTEXTMETRICW.tmDigitizedAspectX$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tmDigitizedAspectY$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tmDigitizedAspectY"));
    public static VarHandle tmDigitizedAspectY$VH() {
        return tagTEXTMETRICW.tmDigitizedAspectY$VH;
    }
    public static int tmDigitizedAspectY$get(MemorySegment seg) {
        return (int)tagTEXTMETRICW.tmDigitizedAspectY$VH.get(seg);
    }
    public static void tmDigitizedAspectY$set( MemorySegment seg, int x) {
        tagTEXTMETRICW.tmDigitizedAspectY$VH.set(seg, x);
    }
    public static int tmDigitizedAspectY$get(MemorySegment seg, long index) {
        return (int)tagTEXTMETRICW.tmDigitizedAspectY$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tmDigitizedAspectY$set(MemorySegment seg, long index, int x) {
        tagTEXTMETRICW.tmDigitizedAspectY$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tmFirstChar$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tmFirstChar"));
    public static VarHandle tmFirstChar$VH() {
        return tagTEXTMETRICW.tmFirstChar$VH;
    }
    public static short tmFirstChar$get(MemorySegment seg) {
        return (short)tagTEXTMETRICW.tmFirstChar$VH.get(seg);
    }
    public static void tmFirstChar$set( MemorySegment seg, short x) {
        tagTEXTMETRICW.tmFirstChar$VH.set(seg, x);
    }
    public static short tmFirstChar$get(MemorySegment seg, long index) {
        return (short)tagTEXTMETRICW.tmFirstChar$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tmFirstChar$set(MemorySegment seg, long index, short x) {
        tagTEXTMETRICW.tmFirstChar$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tmLastChar$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tmLastChar"));
    public static VarHandle tmLastChar$VH() {
        return tagTEXTMETRICW.tmLastChar$VH;
    }
    public static short tmLastChar$get(MemorySegment seg) {
        return (short)tagTEXTMETRICW.tmLastChar$VH.get(seg);
    }
    public static void tmLastChar$set( MemorySegment seg, short x) {
        tagTEXTMETRICW.tmLastChar$VH.set(seg, x);
    }
    public static short tmLastChar$get(MemorySegment seg, long index) {
        return (short)tagTEXTMETRICW.tmLastChar$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tmLastChar$set(MemorySegment seg, long index, short x) {
        tagTEXTMETRICW.tmLastChar$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tmDefaultChar$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tmDefaultChar"));
    public static VarHandle tmDefaultChar$VH() {
        return tagTEXTMETRICW.tmDefaultChar$VH;
    }
    public static short tmDefaultChar$get(MemorySegment seg) {
        return (short)tagTEXTMETRICW.tmDefaultChar$VH.get(seg);
    }
    public static void tmDefaultChar$set( MemorySegment seg, short x) {
        tagTEXTMETRICW.tmDefaultChar$VH.set(seg, x);
    }
    public static short tmDefaultChar$get(MemorySegment seg, long index) {
        return (short)tagTEXTMETRICW.tmDefaultChar$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tmDefaultChar$set(MemorySegment seg, long index, short x) {
        tagTEXTMETRICW.tmDefaultChar$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tmBreakChar$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tmBreakChar"));
    public static VarHandle tmBreakChar$VH() {
        return tagTEXTMETRICW.tmBreakChar$VH;
    }
    public static short tmBreakChar$get(MemorySegment seg) {
        return (short)tagTEXTMETRICW.tmBreakChar$VH.get(seg);
    }
    public static void tmBreakChar$set( MemorySegment seg, short x) {
        tagTEXTMETRICW.tmBreakChar$VH.set(seg, x);
    }
    public static short tmBreakChar$get(MemorySegment seg, long index) {
        return (short)tagTEXTMETRICW.tmBreakChar$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tmBreakChar$set(MemorySegment seg, long index, short x) {
        tagTEXTMETRICW.tmBreakChar$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tmItalic$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tmItalic"));
    public static VarHandle tmItalic$VH() {
        return tagTEXTMETRICW.tmItalic$VH;
    }
    public static byte tmItalic$get(MemorySegment seg) {
        return (byte)tagTEXTMETRICW.tmItalic$VH.get(seg);
    }
    public static void tmItalic$set( MemorySegment seg, byte x) {
        tagTEXTMETRICW.tmItalic$VH.set(seg, x);
    }
    public static byte tmItalic$get(MemorySegment seg, long index) {
        return (byte)tagTEXTMETRICW.tmItalic$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tmItalic$set(MemorySegment seg, long index, byte x) {
        tagTEXTMETRICW.tmItalic$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tmUnderlined$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tmUnderlined"));
    public static VarHandle tmUnderlined$VH() {
        return tagTEXTMETRICW.tmUnderlined$VH;
    }
    public static byte tmUnderlined$get(MemorySegment seg) {
        return (byte)tagTEXTMETRICW.tmUnderlined$VH.get(seg);
    }
    public static void tmUnderlined$set( MemorySegment seg, byte x) {
        tagTEXTMETRICW.tmUnderlined$VH.set(seg, x);
    }
    public static byte tmUnderlined$get(MemorySegment seg, long index) {
        return (byte)tagTEXTMETRICW.tmUnderlined$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tmUnderlined$set(MemorySegment seg, long index, byte x) {
        tagTEXTMETRICW.tmUnderlined$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tmStruckOut$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tmStruckOut"));
    public static VarHandle tmStruckOut$VH() {
        return tagTEXTMETRICW.tmStruckOut$VH;
    }
    public static byte tmStruckOut$get(MemorySegment seg) {
        return (byte)tagTEXTMETRICW.tmStruckOut$VH.get(seg);
    }
    public static void tmStruckOut$set( MemorySegment seg, byte x) {
        tagTEXTMETRICW.tmStruckOut$VH.set(seg, x);
    }
    public static byte tmStruckOut$get(MemorySegment seg, long index) {
        return (byte)tagTEXTMETRICW.tmStruckOut$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tmStruckOut$set(MemorySegment seg, long index, byte x) {
        tagTEXTMETRICW.tmStruckOut$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tmPitchAndFamily$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tmPitchAndFamily"));
    public static VarHandle tmPitchAndFamily$VH() {
        return tagTEXTMETRICW.tmPitchAndFamily$VH;
    }
    public static byte tmPitchAndFamily$get(MemorySegment seg) {
        return (byte)tagTEXTMETRICW.tmPitchAndFamily$VH.get(seg);
    }
    public static void tmPitchAndFamily$set( MemorySegment seg, byte x) {
        tagTEXTMETRICW.tmPitchAndFamily$VH.set(seg, x);
    }
    public static byte tmPitchAndFamily$get(MemorySegment seg, long index) {
        return (byte)tagTEXTMETRICW.tmPitchAndFamily$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tmPitchAndFamily$set(MemorySegment seg, long index, byte x) {
        tagTEXTMETRICW.tmPitchAndFamily$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tmCharSet$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tmCharSet"));
    public static VarHandle tmCharSet$VH() {
        return tagTEXTMETRICW.tmCharSet$VH;
    }
    public static byte tmCharSet$get(MemorySegment seg) {
        return (byte)tagTEXTMETRICW.tmCharSet$VH.get(seg);
    }
    public static void tmCharSet$set( MemorySegment seg, byte x) {
        tagTEXTMETRICW.tmCharSet$VH.set(seg, x);
    }
    public static byte tmCharSet$get(MemorySegment seg, long index) {
        return (byte)tagTEXTMETRICW.tmCharSet$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tmCharSet$set(MemorySegment seg, long index, byte x) {
        tagTEXTMETRICW.tmCharSet$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


