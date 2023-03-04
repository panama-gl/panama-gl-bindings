// Generated by jextract

package opengl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagVS_FIXEDFILEINFO {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwSignature"),
        Constants$root.C_LONG$LAYOUT.withName("dwStrucVersion"),
        Constants$root.C_LONG$LAYOUT.withName("dwFileVersionMS"),
        Constants$root.C_LONG$LAYOUT.withName("dwFileVersionLS"),
        Constants$root.C_LONG$LAYOUT.withName("dwProductVersionMS"),
        Constants$root.C_LONG$LAYOUT.withName("dwProductVersionLS"),
        Constants$root.C_LONG$LAYOUT.withName("dwFileFlagsMask"),
        Constants$root.C_LONG$LAYOUT.withName("dwFileFlags"),
        Constants$root.C_LONG$LAYOUT.withName("dwFileOS"),
        Constants$root.C_LONG$LAYOUT.withName("dwFileType"),
        Constants$root.C_LONG$LAYOUT.withName("dwFileSubtype"),
        Constants$root.C_LONG$LAYOUT.withName("dwFileDateMS"),
        Constants$root.C_LONG$LAYOUT.withName("dwFileDateLS")
    ).withName("tagVS_FIXEDFILEINFO");
    public static MemoryLayout $LAYOUT() {
        return tagVS_FIXEDFILEINFO.$struct$LAYOUT;
    }
    static final VarHandle dwSignature$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwSignature"));
    public static VarHandle dwSignature$VH() {
        return tagVS_FIXEDFILEINFO.dwSignature$VH;
    }
    public static int dwSignature$get(MemorySegment seg) {
        return (int)tagVS_FIXEDFILEINFO.dwSignature$VH.get(seg);
    }
    public static void dwSignature$set( MemorySegment seg, int x) {
        tagVS_FIXEDFILEINFO.dwSignature$VH.set(seg, x);
    }
    public static int dwSignature$get(MemorySegment seg, long index) {
        return (int)tagVS_FIXEDFILEINFO.dwSignature$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSignature$set(MemorySegment seg, long index, int x) {
        tagVS_FIXEDFILEINFO.dwSignature$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwStrucVersion$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwStrucVersion"));
    public static VarHandle dwStrucVersion$VH() {
        return tagVS_FIXEDFILEINFO.dwStrucVersion$VH;
    }
    public static int dwStrucVersion$get(MemorySegment seg) {
        return (int)tagVS_FIXEDFILEINFO.dwStrucVersion$VH.get(seg);
    }
    public static void dwStrucVersion$set( MemorySegment seg, int x) {
        tagVS_FIXEDFILEINFO.dwStrucVersion$VH.set(seg, x);
    }
    public static int dwStrucVersion$get(MemorySegment seg, long index) {
        return (int)tagVS_FIXEDFILEINFO.dwStrucVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwStrucVersion$set(MemorySegment seg, long index, int x) {
        tagVS_FIXEDFILEINFO.dwStrucVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFileVersionMS$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFileVersionMS"));
    public static VarHandle dwFileVersionMS$VH() {
        return tagVS_FIXEDFILEINFO.dwFileVersionMS$VH;
    }
    public static int dwFileVersionMS$get(MemorySegment seg) {
        return (int)tagVS_FIXEDFILEINFO.dwFileVersionMS$VH.get(seg);
    }
    public static void dwFileVersionMS$set( MemorySegment seg, int x) {
        tagVS_FIXEDFILEINFO.dwFileVersionMS$VH.set(seg, x);
    }
    public static int dwFileVersionMS$get(MemorySegment seg, long index) {
        return (int)tagVS_FIXEDFILEINFO.dwFileVersionMS$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFileVersionMS$set(MemorySegment seg, long index, int x) {
        tagVS_FIXEDFILEINFO.dwFileVersionMS$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFileVersionLS$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFileVersionLS"));
    public static VarHandle dwFileVersionLS$VH() {
        return tagVS_FIXEDFILEINFO.dwFileVersionLS$VH;
    }
    public static int dwFileVersionLS$get(MemorySegment seg) {
        return (int)tagVS_FIXEDFILEINFO.dwFileVersionLS$VH.get(seg);
    }
    public static void dwFileVersionLS$set( MemorySegment seg, int x) {
        tagVS_FIXEDFILEINFO.dwFileVersionLS$VH.set(seg, x);
    }
    public static int dwFileVersionLS$get(MemorySegment seg, long index) {
        return (int)tagVS_FIXEDFILEINFO.dwFileVersionLS$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFileVersionLS$set(MemorySegment seg, long index, int x) {
        tagVS_FIXEDFILEINFO.dwFileVersionLS$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwProductVersionMS$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwProductVersionMS"));
    public static VarHandle dwProductVersionMS$VH() {
        return tagVS_FIXEDFILEINFO.dwProductVersionMS$VH;
    }
    public static int dwProductVersionMS$get(MemorySegment seg) {
        return (int)tagVS_FIXEDFILEINFO.dwProductVersionMS$VH.get(seg);
    }
    public static void dwProductVersionMS$set( MemorySegment seg, int x) {
        tagVS_FIXEDFILEINFO.dwProductVersionMS$VH.set(seg, x);
    }
    public static int dwProductVersionMS$get(MemorySegment seg, long index) {
        return (int)tagVS_FIXEDFILEINFO.dwProductVersionMS$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwProductVersionMS$set(MemorySegment seg, long index, int x) {
        tagVS_FIXEDFILEINFO.dwProductVersionMS$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwProductVersionLS$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwProductVersionLS"));
    public static VarHandle dwProductVersionLS$VH() {
        return tagVS_FIXEDFILEINFO.dwProductVersionLS$VH;
    }
    public static int dwProductVersionLS$get(MemorySegment seg) {
        return (int)tagVS_FIXEDFILEINFO.dwProductVersionLS$VH.get(seg);
    }
    public static void dwProductVersionLS$set( MemorySegment seg, int x) {
        tagVS_FIXEDFILEINFO.dwProductVersionLS$VH.set(seg, x);
    }
    public static int dwProductVersionLS$get(MemorySegment seg, long index) {
        return (int)tagVS_FIXEDFILEINFO.dwProductVersionLS$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwProductVersionLS$set(MemorySegment seg, long index, int x) {
        tagVS_FIXEDFILEINFO.dwProductVersionLS$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFileFlagsMask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFileFlagsMask"));
    public static VarHandle dwFileFlagsMask$VH() {
        return tagVS_FIXEDFILEINFO.dwFileFlagsMask$VH;
    }
    public static int dwFileFlagsMask$get(MemorySegment seg) {
        return (int)tagVS_FIXEDFILEINFO.dwFileFlagsMask$VH.get(seg);
    }
    public static void dwFileFlagsMask$set( MemorySegment seg, int x) {
        tagVS_FIXEDFILEINFO.dwFileFlagsMask$VH.set(seg, x);
    }
    public static int dwFileFlagsMask$get(MemorySegment seg, long index) {
        return (int)tagVS_FIXEDFILEINFO.dwFileFlagsMask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFileFlagsMask$set(MemorySegment seg, long index, int x) {
        tagVS_FIXEDFILEINFO.dwFileFlagsMask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFileFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFileFlags"));
    public static VarHandle dwFileFlags$VH() {
        return tagVS_FIXEDFILEINFO.dwFileFlags$VH;
    }
    public static int dwFileFlags$get(MemorySegment seg) {
        return (int)tagVS_FIXEDFILEINFO.dwFileFlags$VH.get(seg);
    }
    public static void dwFileFlags$set( MemorySegment seg, int x) {
        tagVS_FIXEDFILEINFO.dwFileFlags$VH.set(seg, x);
    }
    public static int dwFileFlags$get(MemorySegment seg, long index) {
        return (int)tagVS_FIXEDFILEINFO.dwFileFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFileFlags$set(MemorySegment seg, long index, int x) {
        tagVS_FIXEDFILEINFO.dwFileFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFileOS$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFileOS"));
    public static VarHandle dwFileOS$VH() {
        return tagVS_FIXEDFILEINFO.dwFileOS$VH;
    }
    public static int dwFileOS$get(MemorySegment seg) {
        return (int)tagVS_FIXEDFILEINFO.dwFileOS$VH.get(seg);
    }
    public static void dwFileOS$set( MemorySegment seg, int x) {
        tagVS_FIXEDFILEINFO.dwFileOS$VH.set(seg, x);
    }
    public static int dwFileOS$get(MemorySegment seg, long index) {
        return (int)tagVS_FIXEDFILEINFO.dwFileOS$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFileOS$set(MemorySegment seg, long index, int x) {
        tagVS_FIXEDFILEINFO.dwFileOS$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFileType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFileType"));
    public static VarHandle dwFileType$VH() {
        return tagVS_FIXEDFILEINFO.dwFileType$VH;
    }
    public static int dwFileType$get(MemorySegment seg) {
        return (int)tagVS_FIXEDFILEINFO.dwFileType$VH.get(seg);
    }
    public static void dwFileType$set( MemorySegment seg, int x) {
        tagVS_FIXEDFILEINFO.dwFileType$VH.set(seg, x);
    }
    public static int dwFileType$get(MemorySegment seg, long index) {
        return (int)tagVS_FIXEDFILEINFO.dwFileType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFileType$set(MemorySegment seg, long index, int x) {
        tagVS_FIXEDFILEINFO.dwFileType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFileSubtype$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFileSubtype"));
    public static VarHandle dwFileSubtype$VH() {
        return tagVS_FIXEDFILEINFO.dwFileSubtype$VH;
    }
    public static int dwFileSubtype$get(MemorySegment seg) {
        return (int)tagVS_FIXEDFILEINFO.dwFileSubtype$VH.get(seg);
    }
    public static void dwFileSubtype$set( MemorySegment seg, int x) {
        tagVS_FIXEDFILEINFO.dwFileSubtype$VH.set(seg, x);
    }
    public static int dwFileSubtype$get(MemorySegment seg, long index) {
        return (int)tagVS_FIXEDFILEINFO.dwFileSubtype$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFileSubtype$set(MemorySegment seg, long index, int x) {
        tagVS_FIXEDFILEINFO.dwFileSubtype$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFileDateMS$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFileDateMS"));
    public static VarHandle dwFileDateMS$VH() {
        return tagVS_FIXEDFILEINFO.dwFileDateMS$VH;
    }
    public static int dwFileDateMS$get(MemorySegment seg) {
        return (int)tagVS_FIXEDFILEINFO.dwFileDateMS$VH.get(seg);
    }
    public static void dwFileDateMS$set( MemorySegment seg, int x) {
        tagVS_FIXEDFILEINFO.dwFileDateMS$VH.set(seg, x);
    }
    public static int dwFileDateMS$get(MemorySegment seg, long index) {
        return (int)tagVS_FIXEDFILEINFO.dwFileDateMS$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFileDateMS$set(MemorySegment seg, long index, int x) {
        tagVS_FIXEDFILEINFO.dwFileDateMS$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFileDateLS$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwFileDateLS"));
    public static VarHandle dwFileDateLS$VH() {
        return tagVS_FIXEDFILEINFO.dwFileDateLS$VH;
    }
    public static int dwFileDateLS$get(MemorySegment seg) {
        return (int)tagVS_FIXEDFILEINFO.dwFileDateLS$VH.get(seg);
    }
    public static void dwFileDateLS$set( MemorySegment seg, int x) {
        tagVS_FIXEDFILEINFO.dwFileDateLS$VH.set(seg, x);
    }
    public static int dwFileDateLS$get(MemorySegment seg, long index) {
        return (int)tagVS_FIXEDFILEINFO.dwFileDateLS$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFileDateLS$set(MemorySegment seg, long index, int x) {
        tagVS_FIXEDFILEINFO.dwFileDateLS$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


