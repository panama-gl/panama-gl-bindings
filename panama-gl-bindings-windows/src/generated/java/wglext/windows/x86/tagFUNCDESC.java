// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagFUNCDESC {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("memid"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("lprgscode"),
        Constants$root.C_POINTER$LAYOUT.withName("lprgelemdescParam"),
        Constants$root.C_LONG$LAYOUT.withName("funckind"),
        Constants$root.C_LONG$LAYOUT.withName("invkind"),
        Constants$root.C_LONG$LAYOUT.withName("callconv"),
        Constants$root.C_SHORT$LAYOUT.withName("cParams"),
        Constants$root.C_SHORT$LAYOUT.withName("cParamsOpt"),
        Constants$root.C_SHORT$LAYOUT.withName("oVft"),
        Constants$root.C_SHORT$LAYOUT.withName("cScodes"),
        MemoryLayout.paddingLayout(32),
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
        ).withName("elemdescFunc"),
        Constants$root.C_SHORT$LAYOUT.withName("wFuncFlags"),
        MemoryLayout.paddingLayout(48)
    ).withName("tagFUNCDESC");
    public static MemoryLayout $LAYOUT() {
        return tagFUNCDESC.$struct$LAYOUT;
    }
    static final VarHandle memid$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("memid"));
    public static VarHandle memid$VH() {
        return tagFUNCDESC.memid$VH;
    }
    public static int memid$get(MemorySegment seg) {
        return (int)tagFUNCDESC.memid$VH.get(seg);
    }
    public static void memid$set( MemorySegment seg, int x) {
        tagFUNCDESC.memid$VH.set(seg, x);
    }
    public static int memid$get(MemorySegment seg, long index) {
        return (int)tagFUNCDESC.memid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void memid$set(MemorySegment seg, long index, int x) {
        tagFUNCDESC.memid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lprgscode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lprgscode"));
    public static VarHandle lprgscode$VH() {
        return tagFUNCDESC.lprgscode$VH;
    }
    public static MemoryAddress lprgscode$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagFUNCDESC.lprgscode$VH.get(seg);
    }
    public static void lprgscode$set( MemorySegment seg, MemoryAddress x) {
        tagFUNCDESC.lprgscode$VH.set(seg, x);
    }
    public static MemoryAddress lprgscode$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagFUNCDESC.lprgscode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lprgscode$set(MemorySegment seg, long index, MemoryAddress x) {
        tagFUNCDESC.lprgscode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lprgelemdescParam$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lprgelemdescParam"));
    public static VarHandle lprgelemdescParam$VH() {
        return tagFUNCDESC.lprgelemdescParam$VH;
    }
    public static MemoryAddress lprgelemdescParam$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagFUNCDESC.lprgelemdescParam$VH.get(seg);
    }
    public static void lprgelemdescParam$set( MemorySegment seg, MemoryAddress x) {
        tagFUNCDESC.lprgelemdescParam$VH.set(seg, x);
    }
    public static MemoryAddress lprgelemdescParam$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagFUNCDESC.lprgelemdescParam$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lprgelemdescParam$set(MemorySegment seg, long index, MemoryAddress x) {
        tagFUNCDESC.lprgelemdescParam$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle funckind$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("funckind"));
    public static VarHandle funckind$VH() {
        return tagFUNCDESC.funckind$VH;
    }
    public static int funckind$get(MemorySegment seg) {
        return (int)tagFUNCDESC.funckind$VH.get(seg);
    }
    public static void funckind$set( MemorySegment seg, int x) {
        tagFUNCDESC.funckind$VH.set(seg, x);
    }
    public static int funckind$get(MemorySegment seg, long index) {
        return (int)tagFUNCDESC.funckind$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void funckind$set(MemorySegment seg, long index, int x) {
        tagFUNCDESC.funckind$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle invkind$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("invkind"));
    public static VarHandle invkind$VH() {
        return tagFUNCDESC.invkind$VH;
    }
    public static int invkind$get(MemorySegment seg) {
        return (int)tagFUNCDESC.invkind$VH.get(seg);
    }
    public static void invkind$set( MemorySegment seg, int x) {
        tagFUNCDESC.invkind$VH.set(seg, x);
    }
    public static int invkind$get(MemorySegment seg, long index) {
        return (int)tagFUNCDESC.invkind$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void invkind$set(MemorySegment seg, long index, int x) {
        tagFUNCDESC.invkind$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle callconv$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("callconv"));
    public static VarHandle callconv$VH() {
        return tagFUNCDESC.callconv$VH;
    }
    public static int callconv$get(MemorySegment seg) {
        return (int)tagFUNCDESC.callconv$VH.get(seg);
    }
    public static void callconv$set( MemorySegment seg, int x) {
        tagFUNCDESC.callconv$VH.set(seg, x);
    }
    public static int callconv$get(MemorySegment seg, long index) {
        return (int)tagFUNCDESC.callconv$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void callconv$set(MemorySegment seg, long index, int x) {
        tagFUNCDESC.callconv$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cParams$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cParams"));
    public static VarHandle cParams$VH() {
        return tagFUNCDESC.cParams$VH;
    }
    public static short cParams$get(MemorySegment seg) {
        return (short)tagFUNCDESC.cParams$VH.get(seg);
    }
    public static void cParams$set( MemorySegment seg, short x) {
        tagFUNCDESC.cParams$VH.set(seg, x);
    }
    public static short cParams$get(MemorySegment seg, long index) {
        return (short)tagFUNCDESC.cParams$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cParams$set(MemorySegment seg, long index, short x) {
        tagFUNCDESC.cParams$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cParamsOpt$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cParamsOpt"));
    public static VarHandle cParamsOpt$VH() {
        return tagFUNCDESC.cParamsOpt$VH;
    }
    public static short cParamsOpt$get(MemorySegment seg) {
        return (short)tagFUNCDESC.cParamsOpt$VH.get(seg);
    }
    public static void cParamsOpt$set( MemorySegment seg, short x) {
        tagFUNCDESC.cParamsOpt$VH.set(seg, x);
    }
    public static short cParamsOpt$get(MemorySegment seg, long index) {
        return (short)tagFUNCDESC.cParamsOpt$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cParamsOpt$set(MemorySegment seg, long index, short x) {
        tagFUNCDESC.cParamsOpt$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle oVft$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("oVft"));
    public static VarHandle oVft$VH() {
        return tagFUNCDESC.oVft$VH;
    }
    public static short oVft$get(MemorySegment seg) {
        return (short)tagFUNCDESC.oVft$VH.get(seg);
    }
    public static void oVft$set( MemorySegment seg, short x) {
        tagFUNCDESC.oVft$VH.set(seg, x);
    }
    public static short oVft$get(MemorySegment seg, long index) {
        return (short)tagFUNCDESC.oVft$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void oVft$set(MemorySegment seg, long index, short x) {
        tagFUNCDESC.oVft$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cScodes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cScodes"));
    public static VarHandle cScodes$VH() {
        return tagFUNCDESC.cScodes$VH;
    }
    public static short cScodes$get(MemorySegment seg) {
        return (short)tagFUNCDESC.cScodes$VH.get(seg);
    }
    public static void cScodes$set( MemorySegment seg, short x) {
        tagFUNCDESC.cScodes$VH.set(seg, x);
    }
    public static short cScodes$get(MemorySegment seg, long index) {
        return (short)tagFUNCDESC.cScodes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cScodes$set(MemorySegment seg, long index, short x) {
        tagFUNCDESC.cScodes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment elemdescFunc$slice(MemorySegment seg) {
        return seg.asSlice(48, 32);
    }
    static final VarHandle wFuncFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wFuncFlags"));
    public static VarHandle wFuncFlags$VH() {
        return tagFUNCDESC.wFuncFlags$VH;
    }
    public static short wFuncFlags$get(MemorySegment seg) {
        return (short)tagFUNCDESC.wFuncFlags$VH.get(seg);
    }
    public static void wFuncFlags$set( MemorySegment seg, short x) {
        tagFUNCDESC.wFuncFlags$VH.set(seg, x);
    }
    public static short wFuncFlags$get(MemorySegment seg, long index) {
        return (short)tagFUNCDESC.wFuncFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wFuncFlags$set(MemorySegment seg, long index, short x) {
        tagFUNCDESC.wFuncFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


