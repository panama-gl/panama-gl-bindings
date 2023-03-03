// Generated by jextract

package jawt.macos.arm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class jawt_DrawingSurface {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("env"),
        Constants$root.C_POINTER$LAYOUT.withName("target"),
        Constants$root.C_POINTER$LAYOUT.withName("Lock"),
        Constants$root.C_POINTER$LAYOUT.withName("GetDrawingSurfaceInfo"),
        Constants$root.C_POINTER$LAYOUT.withName("FreeDrawingSurfaceInfo"),
        Constants$root.C_POINTER$LAYOUT.withName("Unlock")
    ).withName("jawt_DrawingSurface");
    public static MemoryLayout $LAYOUT() {
        return jawt_DrawingSurface.$struct$LAYOUT;
    }
    static final VarHandle env$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("env"));
    public static VarHandle env$VH() {
        return jawt_DrawingSurface.env$VH;
    }
    public static MemoryAddress env$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)jawt_DrawingSurface.env$VH.get(seg);
    }
    public static void env$set( MemorySegment seg, MemoryAddress x) {
        jawt_DrawingSurface.env$VH.set(seg, x);
    }
    public static MemoryAddress env$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)jawt_DrawingSurface.env$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void env$set(MemorySegment seg, long index, MemoryAddress x) {
        jawt_DrawingSurface.env$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle target$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("target"));
    public static VarHandle target$VH() {
        return jawt_DrawingSurface.target$VH;
    }
    public static MemoryAddress target$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)jawt_DrawingSurface.target$VH.get(seg);
    }
    public static void target$set( MemorySegment seg, MemoryAddress x) {
        jawt_DrawingSurface.target$VH.set(seg, x);
    }
    public static MemoryAddress target$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)jawt_DrawingSurface.target$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void target$set(MemorySegment seg, long index, MemoryAddress x) {
        jawt_DrawingSurface.target$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final FunctionDescriptor Lock$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Lock$MH = RuntimeHelper.downcallHandle(
        jawt_DrawingSurface.Lock$FUNC
    );
    public interface Lock {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(Lock fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Lock.class, fi, jawt_DrawingSurface.Lock$FUNC, session);
        }
        static Lock ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)jawt_DrawingSurface.Lock$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Lock$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Lock"));
    public static VarHandle Lock$VH() {
        return jawt_DrawingSurface.Lock$VH;
    }
    public static MemoryAddress Lock$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)jawt_DrawingSurface.Lock$VH.get(seg);
    }
    public static void Lock$set( MemorySegment seg, MemoryAddress x) {
        jawt_DrawingSurface.Lock$VH.set(seg, x);
    }
    public static MemoryAddress Lock$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)jawt_DrawingSurface.Lock$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Lock$set(MemorySegment seg, long index, MemoryAddress x) {
        jawt_DrawingSurface.Lock$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Lock Lock (MemorySegment segment, MemorySession session) {
        return Lock.ofAddress(Lock$get(segment), session);
    }
    static final FunctionDescriptor GetDrawingSurfaceInfo$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetDrawingSurfaceInfo$MH = RuntimeHelper.downcallHandle(
        jawt_DrawingSurface.GetDrawingSurfaceInfo$FUNC
    );
    public interface GetDrawingSurfaceInfo {

        java.lang.foreign.Addressable apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(GetDrawingSurfaceInfo fi, MemorySession session) {
            return RuntimeHelper.upcallStub(GetDrawingSurfaceInfo.class, fi, jawt_DrawingSurface.GetDrawingSurfaceInfo$FUNC, session);
        }
        static GetDrawingSurfaceInfo ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)jawt_DrawingSurface.GetDrawingSurfaceInfo$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetDrawingSurfaceInfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetDrawingSurfaceInfo"));
    public static VarHandle GetDrawingSurfaceInfo$VH() {
        return jawt_DrawingSurface.GetDrawingSurfaceInfo$VH;
    }
    public static MemoryAddress GetDrawingSurfaceInfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)jawt_DrawingSurface.GetDrawingSurfaceInfo$VH.get(seg);
    }
    public static void GetDrawingSurfaceInfo$set( MemorySegment seg, MemoryAddress x) {
        jawt_DrawingSurface.GetDrawingSurfaceInfo$VH.set(seg, x);
    }
    public static MemoryAddress GetDrawingSurfaceInfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)jawt_DrawingSurface.GetDrawingSurfaceInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetDrawingSurfaceInfo$set(MemorySegment seg, long index, MemoryAddress x) {
        jawt_DrawingSurface.GetDrawingSurfaceInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetDrawingSurfaceInfo GetDrawingSurfaceInfo (MemorySegment segment, MemorySession session) {
        return GetDrawingSurfaceInfo.ofAddress(GetDrawingSurfaceInfo$get(segment), session);
    }
    static final FunctionDescriptor FreeDrawingSurfaceInfo$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FreeDrawingSurfaceInfo$MH = RuntimeHelper.downcallHandle(
        jawt_DrawingSurface.FreeDrawingSurfaceInfo$FUNC
    );
    public interface FreeDrawingSurfaceInfo {

        void apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(FreeDrawingSurfaceInfo fi, MemorySession session) {
            return RuntimeHelper.upcallStub(FreeDrawingSurfaceInfo.class, fi, jawt_DrawingSurface.FreeDrawingSurfaceInfo$FUNC, session);
        }
        static FreeDrawingSurfaceInfo ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    jawt_DrawingSurface.FreeDrawingSurfaceInfo$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle FreeDrawingSurfaceInfo$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FreeDrawingSurfaceInfo"));
    public static VarHandle FreeDrawingSurfaceInfo$VH() {
        return jawt_DrawingSurface.FreeDrawingSurfaceInfo$VH;
    }
    public static MemoryAddress FreeDrawingSurfaceInfo$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)jawt_DrawingSurface.FreeDrawingSurfaceInfo$VH.get(seg);
    }
    public static void FreeDrawingSurfaceInfo$set( MemorySegment seg, MemoryAddress x) {
        jawt_DrawingSurface.FreeDrawingSurfaceInfo$VH.set(seg, x);
    }
    public static MemoryAddress FreeDrawingSurfaceInfo$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)jawt_DrawingSurface.FreeDrawingSurfaceInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FreeDrawingSurfaceInfo$set(MemorySegment seg, long index, MemoryAddress x) {
        jawt_DrawingSurface.FreeDrawingSurfaceInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static FreeDrawingSurfaceInfo FreeDrawingSurfaceInfo (MemorySegment segment, MemorySession session) {
        return FreeDrawingSurfaceInfo.ofAddress(FreeDrawingSurfaceInfo$get(segment), session);
    }
    static final FunctionDescriptor Unlock$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Unlock$MH = RuntimeHelper.downcallHandle(
        jawt_DrawingSurface.Unlock$FUNC
    );
    public interface Unlock {

        void apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(Unlock fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Unlock.class, fi, jawt_DrawingSurface.Unlock$FUNC, session);
        }
        static Unlock ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    jawt_DrawingSurface.Unlock$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Unlock$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Unlock"));
    public static VarHandle Unlock$VH() {
        return jawt_DrawingSurface.Unlock$VH;
    }
    public static MemoryAddress Unlock$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)jawt_DrawingSurface.Unlock$VH.get(seg);
    }
    public static void Unlock$set( MemorySegment seg, MemoryAddress x) {
        jawt_DrawingSurface.Unlock$VH.set(seg, x);
    }
    public static MemoryAddress Unlock$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)jawt_DrawingSurface.Unlock$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Unlock$set(MemorySegment seg, long index, MemoryAddress x) {
        jawt_DrawingSurface.Unlock$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Unlock Unlock (MemorySegment segment, MemorySession session) {
        return Unlock.ofAddress(Unlock$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


