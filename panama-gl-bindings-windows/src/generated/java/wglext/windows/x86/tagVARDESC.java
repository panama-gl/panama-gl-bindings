// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagVARDESC {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("memid"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("lpstrSchema"),
        MemoryLayout.unionLayout(
            Constants$root.C_LONG$LAYOUT.withName("oInst"),
            Constants$root.C_POINTER$LAYOUT.withName("lpvarValue")
        ).withName("$anon$0"),
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.unionLayout(
                    Constants$root.C_POINTER$LAYOUT.withName("lptdesc"),
                    Constants$root.C_POINTER$LAYOUT.withName("lpadesc"),
                    Constants$root.C_LONG$LAYOUT.withName("hreftype")
                ).withName("$anon$0"),
                Constants$root.C_SHORT$LAYOUT.withName("vt"),
                MemoryLayout.paddingLayout(48)
            ).withName("tdesc"),
            MemoryLayout.unionLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_LONG_LONG$LAYOUT.withName("dwReserved"),
                    Constants$root.C_SHORT$LAYOUT.withName("wIDLFlags"),
                    MemoryLayout.paddingLayout(48)
                ).withName("idldesc"),
                MemoryLayout.structLayout(
                    Constants$root.C_POINTER$LAYOUT.withName("pparamdescex"),
                    Constants$root.C_SHORT$LAYOUT.withName("wParamFlags"),
                    MemoryLayout.paddingLayout(48)
                ).withName("paramdesc")
            ).withName("$anon$0")
        ).withName("elemdescVar"),
        Constants$root.C_SHORT$LAYOUT.withName("wVarFlags"),
        MemoryLayout.paddingLayout(16),
        Constants$root.C_LONG$LAYOUT.withName("varkind")
    ).withName("tagVARDESC");
    public static MemoryLayout $LAYOUT() {
        return tagVARDESC.$struct$LAYOUT;
    }
    static final VarHandle memid$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("memid"));
    public static VarHandle memid$VH() {
        return tagVARDESC.memid$VH;
    }
    public static int memid$get(MemorySegment seg) {
        return (int)tagVARDESC.memid$VH.get(seg);
    }
    public static void memid$set( MemorySegment seg, int x) {
        tagVARDESC.memid$VH.set(seg, x);
    }
    public static int memid$get(MemorySegment seg, long index) {
        return (int)tagVARDESC.memid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void memid$set(MemorySegment seg, long index, int x) {
        tagVARDESC.memid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpstrSchema$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lpstrSchema"));
    public static VarHandle lpstrSchema$VH() {
        return tagVARDESC.lpstrSchema$VH;
    }
    public static MemoryAddress lpstrSchema$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagVARDESC.lpstrSchema$VH.get(seg);
    }
    public static void lpstrSchema$set( MemorySegment seg, MemoryAddress x) {
        tagVARDESC.lpstrSchema$VH.set(seg, x);
    }
    public static MemoryAddress lpstrSchema$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagVARDESC.lpstrSchema$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstrSchema$set(MemorySegment seg, long index, MemoryAddress x) {
        tagVARDESC.lpstrSchema$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle oInst$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("oInst"));
    public static VarHandle oInst$VH() {
        return tagVARDESC.oInst$VH;
    }
    public static int oInst$get(MemorySegment seg) {
        return (int)tagVARDESC.oInst$VH.get(seg);
    }
    public static void oInst$set( MemorySegment seg, int x) {
        tagVARDESC.oInst$VH.set(seg, x);
    }
    public static int oInst$get(MemorySegment seg, long index) {
        return (int)tagVARDESC.oInst$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void oInst$set(MemorySegment seg, long index, int x) {
        tagVARDESC.oInst$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpvarValue$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("lpvarValue"));
    public static VarHandle lpvarValue$VH() {
        return tagVARDESC.lpvarValue$VH;
    }
    public static MemoryAddress lpvarValue$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagVARDESC.lpvarValue$VH.get(seg);
    }
    public static void lpvarValue$set( MemorySegment seg, MemoryAddress x) {
        tagVARDESC.lpvarValue$VH.set(seg, x);
    }
    public static MemoryAddress lpvarValue$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagVARDESC.lpvarValue$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpvarValue$set(MemorySegment seg, long index, MemoryAddress x) {
        tagVARDESC.lpvarValue$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment elemdescVar$slice(MemorySegment seg) {
        return seg.asSlice(24, 32);
    }
    static final VarHandle wVarFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wVarFlags"));
    public static VarHandle wVarFlags$VH() {
        return tagVARDESC.wVarFlags$VH;
    }
    public static short wVarFlags$get(MemorySegment seg) {
        return (short)tagVARDESC.wVarFlags$VH.get(seg);
    }
    public static void wVarFlags$set( MemorySegment seg, short x) {
        tagVARDESC.wVarFlags$VH.set(seg, x);
    }
    public static short wVarFlags$get(MemorySegment seg, long index) {
        return (short)tagVARDESC.wVarFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wVarFlags$set(MemorySegment seg, long index, short x) {
        tagVARDESC.wVarFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle varkind$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("varkind"));
    public static VarHandle varkind$VH() {
        return tagVARDESC.varkind$VH;
    }
    public static int varkind$get(MemorySegment seg) {
        return (int)tagVARDESC.varkind$VH.get(seg);
    }
    public static void varkind$set( MemorySegment seg, int x) {
        tagVARDESC.varkind$VH.set(seg, x);
    }
    public static int varkind$get(MemorySegment seg, long index) {
        return (int)tagVARDESC.varkind$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void varkind$set(MemorySegment seg, long index, int x) {
        tagVARDESC.varkind$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

