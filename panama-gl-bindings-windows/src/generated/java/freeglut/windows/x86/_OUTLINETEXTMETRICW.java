// Generated by jextract

package freeglut.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _OUTLINETEXTMETRICW {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("otmSize"),
        MemoryLayout.structLayout(
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
        ).withName("otmTextMetrics"),
        Constants$root.C_CHAR$LAYOUT.withName("otmFiller"),
        MemoryLayout.structLayout(
            Constants$root.C_CHAR$LAYOUT.withName("bFamilyType"),
            Constants$root.C_CHAR$LAYOUT.withName("bSerifStyle"),
            Constants$root.C_CHAR$LAYOUT.withName("bWeight"),
            Constants$root.C_CHAR$LAYOUT.withName("bProportion"),
            Constants$root.C_CHAR$LAYOUT.withName("bContrast"),
            Constants$root.C_CHAR$LAYOUT.withName("bStrokeVariation"),
            Constants$root.C_CHAR$LAYOUT.withName("bArmStyle"),
            Constants$root.C_CHAR$LAYOUT.withName("bLetterform"),
            Constants$root.C_CHAR$LAYOUT.withName("bMidline"),
            Constants$root.C_CHAR$LAYOUT.withName("bXHeight")
        ).withName("otmPanoseNumber"),
        MemoryLayout.paddingLayout(8),
        Constants$root.C_LONG$LAYOUT.withName("otmfsSelection"),
        Constants$root.C_LONG$LAYOUT.withName("otmfsType"),
        Constants$root.C_LONG$LAYOUT.withName("otmsCharSlopeRise"),
        Constants$root.C_LONG$LAYOUT.withName("otmsCharSlopeRun"),
        Constants$root.C_LONG$LAYOUT.withName("otmItalicAngle"),
        Constants$root.C_LONG$LAYOUT.withName("otmEMSquare"),
        Constants$root.C_LONG$LAYOUT.withName("otmAscent"),
        Constants$root.C_LONG$LAYOUT.withName("otmDescent"),
        Constants$root.C_LONG$LAYOUT.withName("otmLineGap"),
        Constants$root.C_LONG$LAYOUT.withName("otmsCapEmHeight"),
        Constants$root.C_LONG$LAYOUT.withName("otmsXHeight"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("left"),
            Constants$root.C_LONG$LAYOUT.withName("top"),
            Constants$root.C_LONG$LAYOUT.withName("right"),
            Constants$root.C_LONG$LAYOUT.withName("bottom")
        ).withName("otmrcFontBox"),
        Constants$root.C_LONG$LAYOUT.withName("otmMacAscent"),
        Constants$root.C_LONG$LAYOUT.withName("otmMacDescent"),
        Constants$root.C_LONG$LAYOUT.withName("otmMacLineGap"),
        Constants$root.C_LONG$LAYOUT.withName("otmusMinimumPPEM"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("x"),
            Constants$root.C_LONG$LAYOUT.withName("y")
        ).withName("otmptSubscriptSize"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("x"),
            Constants$root.C_LONG$LAYOUT.withName("y")
        ).withName("otmptSubscriptOffset"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("x"),
            Constants$root.C_LONG$LAYOUT.withName("y")
        ).withName("otmptSuperscriptSize"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("x"),
            Constants$root.C_LONG$LAYOUT.withName("y")
        ).withName("otmptSuperscriptOffset"),
        Constants$root.C_LONG$LAYOUT.withName("otmsStrikeoutSize"),
        Constants$root.C_LONG$LAYOUT.withName("otmsStrikeoutPosition"),
        Constants$root.C_LONG$LAYOUT.withName("otmsUnderscoreSize"),
        Constants$root.C_LONG$LAYOUT.withName("otmsUnderscorePosition"),
        Constants$root.C_POINTER$LAYOUT.withName("otmpFamilyName"),
        Constants$root.C_POINTER$LAYOUT.withName("otmpFaceName"),
        Constants$root.C_POINTER$LAYOUT.withName("otmpStyleName"),
        Constants$root.C_POINTER$LAYOUT.withName("otmpFullName")
    ).withName("_OUTLINETEXTMETRICW");
    public static MemoryLayout $LAYOUT() {
        return _OUTLINETEXTMETRICW.$struct$LAYOUT;
    }
    static final VarHandle otmSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("otmSize"));
    public static VarHandle otmSize$VH() {
        return _OUTLINETEXTMETRICW.otmSize$VH;
    }
    public static int otmSize$get(MemorySegment seg) {
        return (int)_OUTLINETEXTMETRICW.otmSize$VH.get(seg);
    }
    public static void otmSize$set( MemorySegment seg, int x) {
        _OUTLINETEXTMETRICW.otmSize$VH.set(seg, x);
    }
    public static int otmSize$get(MemorySegment seg, long index) {
        return (int)_OUTLINETEXTMETRICW.otmSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void otmSize$set(MemorySegment seg, long index, int x) {
        _OUTLINETEXTMETRICW.otmSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment otmTextMetrics$slice(MemorySegment seg) {
        return seg.asSlice(4, 60);
    }
    static final VarHandle otmFiller$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("otmFiller"));
    public static VarHandle otmFiller$VH() {
        return _OUTLINETEXTMETRICW.otmFiller$VH;
    }
    public static byte otmFiller$get(MemorySegment seg) {
        return (byte)_OUTLINETEXTMETRICW.otmFiller$VH.get(seg);
    }
    public static void otmFiller$set( MemorySegment seg, byte x) {
        _OUTLINETEXTMETRICW.otmFiller$VH.set(seg, x);
    }
    public static byte otmFiller$get(MemorySegment seg, long index) {
        return (byte)_OUTLINETEXTMETRICW.otmFiller$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void otmFiller$set(MemorySegment seg, long index, byte x) {
        _OUTLINETEXTMETRICW.otmFiller$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment otmPanoseNumber$slice(MemorySegment seg) {
        return seg.asSlice(65, 10);
    }
    static final VarHandle otmfsSelection$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("otmfsSelection"));
    public static VarHandle otmfsSelection$VH() {
        return _OUTLINETEXTMETRICW.otmfsSelection$VH;
    }
    public static int otmfsSelection$get(MemorySegment seg) {
        return (int)_OUTLINETEXTMETRICW.otmfsSelection$VH.get(seg);
    }
    public static void otmfsSelection$set( MemorySegment seg, int x) {
        _OUTLINETEXTMETRICW.otmfsSelection$VH.set(seg, x);
    }
    public static int otmfsSelection$get(MemorySegment seg, long index) {
        return (int)_OUTLINETEXTMETRICW.otmfsSelection$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void otmfsSelection$set(MemorySegment seg, long index, int x) {
        _OUTLINETEXTMETRICW.otmfsSelection$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle otmfsType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("otmfsType"));
    public static VarHandle otmfsType$VH() {
        return _OUTLINETEXTMETRICW.otmfsType$VH;
    }
    public static int otmfsType$get(MemorySegment seg) {
        return (int)_OUTLINETEXTMETRICW.otmfsType$VH.get(seg);
    }
    public static void otmfsType$set( MemorySegment seg, int x) {
        _OUTLINETEXTMETRICW.otmfsType$VH.set(seg, x);
    }
    public static int otmfsType$get(MemorySegment seg, long index) {
        return (int)_OUTLINETEXTMETRICW.otmfsType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void otmfsType$set(MemorySegment seg, long index, int x) {
        _OUTLINETEXTMETRICW.otmfsType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle otmsCharSlopeRise$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("otmsCharSlopeRise"));
    public static VarHandle otmsCharSlopeRise$VH() {
        return _OUTLINETEXTMETRICW.otmsCharSlopeRise$VH;
    }
    public static int otmsCharSlopeRise$get(MemorySegment seg) {
        return (int)_OUTLINETEXTMETRICW.otmsCharSlopeRise$VH.get(seg);
    }
    public static void otmsCharSlopeRise$set( MemorySegment seg, int x) {
        _OUTLINETEXTMETRICW.otmsCharSlopeRise$VH.set(seg, x);
    }
    public static int otmsCharSlopeRise$get(MemorySegment seg, long index) {
        return (int)_OUTLINETEXTMETRICW.otmsCharSlopeRise$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void otmsCharSlopeRise$set(MemorySegment seg, long index, int x) {
        _OUTLINETEXTMETRICW.otmsCharSlopeRise$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle otmsCharSlopeRun$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("otmsCharSlopeRun"));
    public static VarHandle otmsCharSlopeRun$VH() {
        return _OUTLINETEXTMETRICW.otmsCharSlopeRun$VH;
    }
    public static int otmsCharSlopeRun$get(MemorySegment seg) {
        return (int)_OUTLINETEXTMETRICW.otmsCharSlopeRun$VH.get(seg);
    }
    public static void otmsCharSlopeRun$set( MemorySegment seg, int x) {
        _OUTLINETEXTMETRICW.otmsCharSlopeRun$VH.set(seg, x);
    }
    public static int otmsCharSlopeRun$get(MemorySegment seg, long index) {
        return (int)_OUTLINETEXTMETRICW.otmsCharSlopeRun$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void otmsCharSlopeRun$set(MemorySegment seg, long index, int x) {
        _OUTLINETEXTMETRICW.otmsCharSlopeRun$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle otmItalicAngle$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("otmItalicAngle"));
    public static VarHandle otmItalicAngle$VH() {
        return _OUTLINETEXTMETRICW.otmItalicAngle$VH;
    }
    public static int otmItalicAngle$get(MemorySegment seg) {
        return (int)_OUTLINETEXTMETRICW.otmItalicAngle$VH.get(seg);
    }
    public static void otmItalicAngle$set( MemorySegment seg, int x) {
        _OUTLINETEXTMETRICW.otmItalicAngle$VH.set(seg, x);
    }
    public static int otmItalicAngle$get(MemorySegment seg, long index) {
        return (int)_OUTLINETEXTMETRICW.otmItalicAngle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void otmItalicAngle$set(MemorySegment seg, long index, int x) {
        _OUTLINETEXTMETRICW.otmItalicAngle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle otmEMSquare$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("otmEMSquare"));
    public static VarHandle otmEMSquare$VH() {
        return _OUTLINETEXTMETRICW.otmEMSquare$VH;
    }
    public static int otmEMSquare$get(MemorySegment seg) {
        return (int)_OUTLINETEXTMETRICW.otmEMSquare$VH.get(seg);
    }
    public static void otmEMSquare$set( MemorySegment seg, int x) {
        _OUTLINETEXTMETRICW.otmEMSquare$VH.set(seg, x);
    }
    public static int otmEMSquare$get(MemorySegment seg, long index) {
        return (int)_OUTLINETEXTMETRICW.otmEMSquare$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void otmEMSquare$set(MemorySegment seg, long index, int x) {
        _OUTLINETEXTMETRICW.otmEMSquare$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle otmAscent$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("otmAscent"));
    public static VarHandle otmAscent$VH() {
        return _OUTLINETEXTMETRICW.otmAscent$VH;
    }
    public static int otmAscent$get(MemorySegment seg) {
        return (int)_OUTLINETEXTMETRICW.otmAscent$VH.get(seg);
    }
    public static void otmAscent$set( MemorySegment seg, int x) {
        _OUTLINETEXTMETRICW.otmAscent$VH.set(seg, x);
    }
    public static int otmAscent$get(MemorySegment seg, long index) {
        return (int)_OUTLINETEXTMETRICW.otmAscent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void otmAscent$set(MemorySegment seg, long index, int x) {
        _OUTLINETEXTMETRICW.otmAscent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle otmDescent$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("otmDescent"));
    public static VarHandle otmDescent$VH() {
        return _OUTLINETEXTMETRICW.otmDescent$VH;
    }
    public static int otmDescent$get(MemorySegment seg) {
        return (int)_OUTLINETEXTMETRICW.otmDescent$VH.get(seg);
    }
    public static void otmDescent$set( MemorySegment seg, int x) {
        _OUTLINETEXTMETRICW.otmDescent$VH.set(seg, x);
    }
    public static int otmDescent$get(MemorySegment seg, long index) {
        return (int)_OUTLINETEXTMETRICW.otmDescent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void otmDescent$set(MemorySegment seg, long index, int x) {
        _OUTLINETEXTMETRICW.otmDescent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle otmLineGap$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("otmLineGap"));
    public static VarHandle otmLineGap$VH() {
        return _OUTLINETEXTMETRICW.otmLineGap$VH;
    }
    public static int otmLineGap$get(MemorySegment seg) {
        return (int)_OUTLINETEXTMETRICW.otmLineGap$VH.get(seg);
    }
    public static void otmLineGap$set( MemorySegment seg, int x) {
        _OUTLINETEXTMETRICW.otmLineGap$VH.set(seg, x);
    }
    public static int otmLineGap$get(MemorySegment seg, long index) {
        return (int)_OUTLINETEXTMETRICW.otmLineGap$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void otmLineGap$set(MemorySegment seg, long index, int x) {
        _OUTLINETEXTMETRICW.otmLineGap$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle otmsCapEmHeight$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("otmsCapEmHeight"));
    public static VarHandle otmsCapEmHeight$VH() {
        return _OUTLINETEXTMETRICW.otmsCapEmHeight$VH;
    }
    public static int otmsCapEmHeight$get(MemorySegment seg) {
        return (int)_OUTLINETEXTMETRICW.otmsCapEmHeight$VH.get(seg);
    }
    public static void otmsCapEmHeight$set( MemorySegment seg, int x) {
        _OUTLINETEXTMETRICW.otmsCapEmHeight$VH.set(seg, x);
    }
    public static int otmsCapEmHeight$get(MemorySegment seg, long index) {
        return (int)_OUTLINETEXTMETRICW.otmsCapEmHeight$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void otmsCapEmHeight$set(MemorySegment seg, long index, int x) {
        _OUTLINETEXTMETRICW.otmsCapEmHeight$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle otmsXHeight$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("otmsXHeight"));
    public static VarHandle otmsXHeight$VH() {
        return _OUTLINETEXTMETRICW.otmsXHeight$VH;
    }
    public static int otmsXHeight$get(MemorySegment seg) {
        return (int)_OUTLINETEXTMETRICW.otmsXHeight$VH.get(seg);
    }
    public static void otmsXHeight$set( MemorySegment seg, int x) {
        _OUTLINETEXTMETRICW.otmsXHeight$VH.set(seg, x);
    }
    public static int otmsXHeight$get(MemorySegment seg, long index) {
        return (int)_OUTLINETEXTMETRICW.otmsXHeight$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void otmsXHeight$set(MemorySegment seg, long index, int x) {
        _OUTLINETEXTMETRICW.otmsXHeight$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment otmrcFontBox$slice(MemorySegment seg) {
        return seg.asSlice(120, 16);
    }
    static final VarHandle otmMacAscent$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("otmMacAscent"));
    public static VarHandle otmMacAscent$VH() {
        return _OUTLINETEXTMETRICW.otmMacAscent$VH;
    }
    public static int otmMacAscent$get(MemorySegment seg) {
        return (int)_OUTLINETEXTMETRICW.otmMacAscent$VH.get(seg);
    }
    public static void otmMacAscent$set( MemorySegment seg, int x) {
        _OUTLINETEXTMETRICW.otmMacAscent$VH.set(seg, x);
    }
    public static int otmMacAscent$get(MemorySegment seg, long index) {
        return (int)_OUTLINETEXTMETRICW.otmMacAscent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void otmMacAscent$set(MemorySegment seg, long index, int x) {
        _OUTLINETEXTMETRICW.otmMacAscent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle otmMacDescent$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("otmMacDescent"));
    public static VarHandle otmMacDescent$VH() {
        return _OUTLINETEXTMETRICW.otmMacDescent$VH;
    }
    public static int otmMacDescent$get(MemorySegment seg) {
        return (int)_OUTLINETEXTMETRICW.otmMacDescent$VH.get(seg);
    }
    public static void otmMacDescent$set( MemorySegment seg, int x) {
        _OUTLINETEXTMETRICW.otmMacDescent$VH.set(seg, x);
    }
    public static int otmMacDescent$get(MemorySegment seg, long index) {
        return (int)_OUTLINETEXTMETRICW.otmMacDescent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void otmMacDescent$set(MemorySegment seg, long index, int x) {
        _OUTLINETEXTMETRICW.otmMacDescent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle otmMacLineGap$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("otmMacLineGap"));
    public static VarHandle otmMacLineGap$VH() {
        return _OUTLINETEXTMETRICW.otmMacLineGap$VH;
    }
    public static int otmMacLineGap$get(MemorySegment seg) {
        return (int)_OUTLINETEXTMETRICW.otmMacLineGap$VH.get(seg);
    }
    public static void otmMacLineGap$set( MemorySegment seg, int x) {
        _OUTLINETEXTMETRICW.otmMacLineGap$VH.set(seg, x);
    }
    public static int otmMacLineGap$get(MemorySegment seg, long index) {
        return (int)_OUTLINETEXTMETRICW.otmMacLineGap$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void otmMacLineGap$set(MemorySegment seg, long index, int x) {
        _OUTLINETEXTMETRICW.otmMacLineGap$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle otmusMinimumPPEM$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("otmusMinimumPPEM"));
    public static VarHandle otmusMinimumPPEM$VH() {
        return _OUTLINETEXTMETRICW.otmusMinimumPPEM$VH;
    }
    public static int otmusMinimumPPEM$get(MemorySegment seg) {
        return (int)_OUTLINETEXTMETRICW.otmusMinimumPPEM$VH.get(seg);
    }
    public static void otmusMinimumPPEM$set( MemorySegment seg, int x) {
        _OUTLINETEXTMETRICW.otmusMinimumPPEM$VH.set(seg, x);
    }
    public static int otmusMinimumPPEM$get(MemorySegment seg, long index) {
        return (int)_OUTLINETEXTMETRICW.otmusMinimumPPEM$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void otmusMinimumPPEM$set(MemorySegment seg, long index, int x) {
        _OUTLINETEXTMETRICW.otmusMinimumPPEM$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment otmptSubscriptSize$slice(MemorySegment seg) {
        return seg.asSlice(152, 8);
    }
    public static MemorySegment otmptSubscriptOffset$slice(MemorySegment seg) {
        return seg.asSlice(160, 8);
    }
    public static MemorySegment otmptSuperscriptSize$slice(MemorySegment seg) {
        return seg.asSlice(168, 8);
    }
    public static MemorySegment otmptSuperscriptOffset$slice(MemorySegment seg) {
        return seg.asSlice(176, 8);
    }
    static final VarHandle otmsStrikeoutSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("otmsStrikeoutSize"));
    public static VarHandle otmsStrikeoutSize$VH() {
        return _OUTLINETEXTMETRICW.otmsStrikeoutSize$VH;
    }
    public static int otmsStrikeoutSize$get(MemorySegment seg) {
        return (int)_OUTLINETEXTMETRICW.otmsStrikeoutSize$VH.get(seg);
    }
    public static void otmsStrikeoutSize$set( MemorySegment seg, int x) {
        _OUTLINETEXTMETRICW.otmsStrikeoutSize$VH.set(seg, x);
    }
    public static int otmsStrikeoutSize$get(MemorySegment seg, long index) {
        return (int)_OUTLINETEXTMETRICW.otmsStrikeoutSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void otmsStrikeoutSize$set(MemorySegment seg, long index, int x) {
        _OUTLINETEXTMETRICW.otmsStrikeoutSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle otmsStrikeoutPosition$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("otmsStrikeoutPosition"));
    public static VarHandle otmsStrikeoutPosition$VH() {
        return _OUTLINETEXTMETRICW.otmsStrikeoutPosition$VH;
    }
    public static int otmsStrikeoutPosition$get(MemorySegment seg) {
        return (int)_OUTLINETEXTMETRICW.otmsStrikeoutPosition$VH.get(seg);
    }
    public static void otmsStrikeoutPosition$set( MemorySegment seg, int x) {
        _OUTLINETEXTMETRICW.otmsStrikeoutPosition$VH.set(seg, x);
    }
    public static int otmsStrikeoutPosition$get(MemorySegment seg, long index) {
        return (int)_OUTLINETEXTMETRICW.otmsStrikeoutPosition$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void otmsStrikeoutPosition$set(MemorySegment seg, long index, int x) {
        _OUTLINETEXTMETRICW.otmsStrikeoutPosition$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle otmsUnderscoreSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("otmsUnderscoreSize"));
    public static VarHandle otmsUnderscoreSize$VH() {
        return _OUTLINETEXTMETRICW.otmsUnderscoreSize$VH;
    }
    public static int otmsUnderscoreSize$get(MemorySegment seg) {
        return (int)_OUTLINETEXTMETRICW.otmsUnderscoreSize$VH.get(seg);
    }
    public static void otmsUnderscoreSize$set( MemorySegment seg, int x) {
        _OUTLINETEXTMETRICW.otmsUnderscoreSize$VH.set(seg, x);
    }
    public static int otmsUnderscoreSize$get(MemorySegment seg, long index) {
        return (int)_OUTLINETEXTMETRICW.otmsUnderscoreSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void otmsUnderscoreSize$set(MemorySegment seg, long index, int x) {
        _OUTLINETEXTMETRICW.otmsUnderscoreSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle otmsUnderscorePosition$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("otmsUnderscorePosition"));
    public static VarHandle otmsUnderscorePosition$VH() {
        return _OUTLINETEXTMETRICW.otmsUnderscorePosition$VH;
    }
    public static int otmsUnderscorePosition$get(MemorySegment seg) {
        return (int)_OUTLINETEXTMETRICW.otmsUnderscorePosition$VH.get(seg);
    }
    public static void otmsUnderscorePosition$set( MemorySegment seg, int x) {
        _OUTLINETEXTMETRICW.otmsUnderscorePosition$VH.set(seg, x);
    }
    public static int otmsUnderscorePosition$get(MemorySegment seg, long index) {
        return (int)_OUTLINETEXTMETRICW.otmsUnderscorePosition$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void otmsUnderscorePosition$set(MemorySegment seg, long index, int x) {
        _OUTLINETEXTMETRICW.otmsUnderscorePosition$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle otmpFamilyName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("otmpFamilyName"));
    public static VarHandle otmpFamilyName$VH() {
        return _OUTLINETEXTMETRICW.otmpFamilyName$VH;
    }
    public static MemoryAddress otmpFamilyName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_OUTLINETEXTMETRICW.otmpFamilyName$VH.get(seg);
    }
    public static void otmpFamilyName$set( MemorySegment seg, MemoryAddress x) {
        _OUTLINETEXTMETRICW.otmpFamilyName$VH.set(seg, x);
    }
    public static MemoryAddress otmpFamilyName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_OUTLINETEXTMETRICW.otmpFamilyName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void otmpFamilyName$set(MemorySegment seg, long index, MemoryAddress x) {
        _OUTLINETEXTMETRICW.otmpFamilyName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle otmpFaceName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("otmpFaceName"));
    public static VarHandle otmpFaceName$VH() {
        return _OUTLINETEXTMETRICW.otmpFaceName$VH;
    }
    public static MemoryAddress otmpFaceName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_OUTLINETEXTMETRICW.otmpFaceName$VH.get(seg);
    }
    public static void otmpFaceName$set( MemorySegment seg, MemoryAddress x) {
        _OUTLINETEXTMETRICW.otmpFaceName$VH.set(seg, x);
    }
    public static MemoryAddress otmpFaceName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_OUTLINETEXTMETRICW.otmpFaceName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void otmpFaceName$set(MemorySegment seg, long index, MemoryAddress x) {
        _OUTLINETEXTMETRICW.otmpFaceName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle otmpStyleName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("otmpStyleName"));
    public static VarHandle otmpStyleName$VH() {
        return _OUTLINETEXTMETRICW.otmpStyleName$VH;
    }
    public static MemoryAddress otmpStyleName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_OUTLINETEXTMETRICW.otmpStyleName$VH.get(seg);
    }
    public static void otmpStyleName$set( MemorySegment seg, MemoryAddress x) {
        _OUTLINETEXTMETRICW.otmpStyleName$VH.set(seg, x);
    }
    public static MemoryAddress otmpStyleName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_OUTLINETEXTMETRICW.otmpStyleName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void otmpStyleName$set(MemorySegment seg, long index, MemoryAddress x) {
        _OUTLINETEXTMETRICW.otmpStyleName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle otmpFullName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("otmpFullName"));
    public static VarHandle otmpFullName$VH() {
        return _OUTLINETEXTMETRICW.otmpFullName$VH;
    }
    public static MemoryAddress otmpFullName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_OUTLINETEXTMETRICW.otmpFullName$VH.get(seg);
    }
    public static void otmpFullName$set( MemorySegment seg, MemoryAddress x) {
        _OUTLINETEXTMETRICW.otmpFullName$VH.set(seg, x);
    }
    public static MemoryAddress otmpFullName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_OUTLINETEXTMETRICW.otmpFullName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void otmpFullName$set(MemorySegment seg, long index, MemoryAddress x) {
        _OUTLINETEXTMETRICW.otmpFullName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


