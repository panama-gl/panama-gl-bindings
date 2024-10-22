// Generated by jextract

package jawt.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class jawt {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("version"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("GetDrawingSurface"),
        Constants$root.C_POINTER$LAYOUT.withName("FreeDrawingSurface"),
        Constants$root.C_POINTER$LAYOUT.withName("Lock"),
        Constants$root.C_POINTER$LAYOUT.withName("Unlock"),
        Constants$root.C_POINTER$LAYOUT.withName("GetComponent"),
        Constants$root.C_POINTER$LAYOUT.withName("CreateEmbeddedFrame"),
        Constants$root.C_POINTER$LAYOUT.withName("SetBounds"),
        Constants$root.C_POINTER$LAYOUT.withName("SynthesizeWindowActivation")
    ).withName("jawt");
    public static MemoryLayout $LAYOUT() {
        return jawt.$struct$LAYOUT;
    }
    static final VarHandle version$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("version"));
    public static VarHandle version$VH() {
        return jawt.version$VH;
    }
    public static int version$get(MemorySegment seg) {
        return (int)jawt.version$VH.get(seg);
    }
    public static void version$set( MemorySegment seg, int x) {
        jawt.version$VH.set(seg, x);
    }
    public static int version$get(MemorySegment seg, long index) {
        return (int)jawt.version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void version$set(MemorySegment seg, long index, int x) {
        jawt.version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final FunctionDescriptor GetDrawingSurface$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetDrawingSurface$MH = RuntimeHelper.downcallHandle(
        jawt.GetDrawingSurface$FUNC
    );
    public interface GetDrawingSurface {

        java.lang.foreign.Addressable apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(GetDrawingSurface fi, MemorySession session) {
            return RuntimeHelper.upcallStub(GetDrawingSurface.class, fi, jawt.GetDrawingSurface$FUNC, session);
        }
        static GetDrawingSurface ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)jawt.GetDrawingSurface$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetDrawingSurface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetDrawingSurface"));
    public static VarHandle GetDrawingSurface$VH() {
        return jawt.GetDrawingSurface$VH;
    }
    public static MemoryAddress GetDrawingSurface$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)jawt.GetDrawingSurface$VH.get(seg);
    }
    public static void GetDrawingSurface$set( MemorySegment seg, MemoryAddress x) {
        jawt.GetDrawingSurface$VH.set(seg, x);
    }
    public static MemoryAddress GetDrawingSurface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)jawt.GetDrawingSurface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetDrawingSurface$set(MemorySegment seg, long index, MemoryAddress x) {
        jawt.GetDrawingSurface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetDrawingSurface GetDrawingSurface (MemorySegment segment, MemorySession session) {
        return GetDrawingSurface.ofAddress(GetDrawingSurface$get(segment), session);
    }
    static final FunctionDescriptor FreeDrawingSurface$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FreeDrawingSurface$MH = RuntimeHelper.downcallHandle(
        jawt.FreeDrawingSurface$FUNC
    );
    public interface FreeDrawingSurface {

        void apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(FreeDrawingSurface fi, MemorySession session) {
            return RuntimeHelper.upcallStub(FreeDrawingSurface.class, fi, jawt.FreeDrawingSurface$FUNC, session);
        }
        static FreeDrawingSurface ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    jawt.FreeDrawingSurface$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle FreeDrawingSurface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("FreeDrawingSurface"));
    public static VarHandle FreeDrawingSurface$VH() {
        return jawt.FreeDrawingSurface$VH;
    }
    public static MemoryAddress FreeDrawingSurface$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)jawt.FreeDrawingSurface$VH.get(seg);
    }
    public static void FreeDrawingSurface$set( MemorySegment seg, MemoryAddress x) {
        jawt.FreeDrawingSurface$VH.set(seg, x);
    }
    public static MemoryAddress FreeDrawingSurface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)jawt.FreeDrawingSurface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FreeDrawingSurface$set(MemorySegment seg, long index, MemoryAddress x) {
        jawt.FreeDrawingSurface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static FreeDrawingSurface FreeDrawingSurface (MemorySegment segment, MemorySession session) {
        return FreeDrawingSurface.ofAddress(FreeDrawingSurface$get(segment), session);
    }
    static final FunctionDescriptor Lock$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Lock$MH = RuntimeHelper.downcallHandle(
        jawt.Lock$FUNC
    );
    public interface Lock {

        void apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(Lock fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Lock.class, fi, jawt.Lock$FUNC, session);
        }
        static Lock ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    jawt.Lock$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Lock$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Lock"));
    public static VarHandle Lock$VH() {
        return jawt.Lock$VH;
    }
    public static MemoryAddress Lock$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)jawt.Lock$VH.get(seg);
    }
    public static void Lock$set( MemorySegment seg, MemoryAddress x) {
        jawt.Lock$VH.set(seg, x);
    }
    public static MemoryAddress Lock$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)jawt.Lock$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Lock$set(MemorySegment seg, long index, MemoryAddress x) {
        jawt.Lock$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Lock Lock (MemorySegment segment, MemorySession session) {
        return Lock.ofAddress(Lock$get(segment), session);
    }
    static final FunctionDescriptor Unlock$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Unlock$MH = RuntimeHelper.downcallHandle(
        jawt.Unlock$FUNC
    );
    public interface Unlock {

        void apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(Unlock fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Unlock.class, fi, jawt.Unlock$FUNC, session);
        }
        static Unlock ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    jawt.Unlock$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Unlock$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Unlock"));
    public static VarHandle Unlock$VH() {
        return jawt.Unlock$VH;
    }
    public static MemoryAddress Unlock$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)jawt.Unlock$VH.get(seg);
    }
    public static void Unlock$set( MemorySegment seg, MemoryAddress x) {
        jawt.Unlock$VH.set(seg, x);
    }
    public static MemoryAddress Unlock$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)jawt.Unlock$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Unlock$set(MemorySegment seg, long index, MemoryAddress x) {
        jawt.Unlock$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Unlock Unlock (MemorySegment segment, MemorySession session) {
        return Unlock.ofAddress(Unlock$get(segment), session);
    }
    static final FunctionDescriptor GetComponent$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetComponent$MH = RuntimeHelper.downcallHandle(
        jawt.GetComponent$FUNC
    );
    public interface GetComponent {

        java.lang.foreign.Addressable apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(GetComponent fi, MemorySession session) {
            return RuntimeHelper.upcallStub(GetComponent.class, fi, jawt.GetComponent$FUNC, session);
        }
        static GetComponent ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)jawt.GetComponent$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetComponent$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetComponent"));
    public static VarHandle GetComponent$VH() {
        return jawt.GetComponent$VH;
    }
    public static MemoryAddress GetComponent$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)jawt.GetComponent$VH.get(seg);
    }
    public static void GetComponent$set( MemorySegment seg, MemoryAddress x) {
        jawt.GetComponent$VH.set(seg, x);
    }
    public static MemoryAddress GetComponent$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)jawt.GetComponent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetComponent$set(MemorySegment seg, long index, MemoryAddress x) {
        jawt.GetComponent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetComponent GetComponent (MemorySegment segment, MemorySession session) {
        return GetComponent.ofAddress(GetComponent$get(segment), session);
    }
    static final FunctionDescriptor CreateEmbeddedFrame$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateEmbeddedFrame$MH = RuntimeHelper.downcallHandle(
        jawt.CreateEmbeddedFrame$FUNC
    );
    public interface CreateEmbeddedFrame {

        java.lang.foreign.Addressable apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(CreateEmbeddedFrame fi, MemorySession session) {
            return RuntimeHelper.upcallStub(CreateEmbeddedFrame.class, fi, jawt.CreateEmbeddedFrame$FUNC, session);
        }
        static CreateEmbeddedFrame ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)jawt.CreateEmbeddedFrame$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle CreateEmbeddedFrame$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CreateEmbeddedFrame"));
    public static VarHandle CreateEmbeddedFrame$VH() {
        return jawt.CreateEmbeddedFrame$VH;
    }
    public static MemoryAddress CreateEmbeddedFrame$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)jawt.CreateEmbeddedFrame$VH.get(seg);
    }
    public static void CreateEmbeddedFrame$set( MemorySegment seg, MemoryAddress x) {
        jawt.CreateEmbeddedFrame$VH.set(seg, x);
    }
    public static MemoryAddress CreateEmbeddedFrame$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)jawt.CreateEmbeddedFrame$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CreateEmbeddedFrame$set(MemorySegment seg, long index, MemoryAddress x) {
        jawt.CreateEmbeddedFrame$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static CreateEmbeddedFrame CreateEmbeddedFrame (MemorySegment segment, MemorySession session) {
        return CreateEmbeddedFrame.ofAddress(CreateEmbeddedFrame$get(segment), session);
    }
    static final FunctionDescriptor SetBounds$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetBounds$MH = RuntimeHelper.downcallHandle(
        jawt.SetBounds$FUNC
    );
    public interface SetBounds {

        void apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, int _x2, int _x3, int _x4, int _x5);
        static MemorySegment allocate(SetBounds fi, MemorySession session) {
            return RuntimeHelper.upcallStub(SetBounds.class, fi, jawt.SetBounds$FUNC, session);
        }
        static SetBounds ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, int __x2, int __x3, int __x4, int __x5) -> {
                try {
                    jawt.SetBounds$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, __x2, __x3, __x4, __x5);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle SetBounds$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SetBounds"));
    public static VarHandle SetBounds$VH() {
        return jawt.SetBounds$VH;
    }
    public static MemoryAddress SetBounds$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)jawt.SetBounds$VH.get(seg);
    }
    public static void SetBounds$set( MemorySegment seg, MemoryAddress x) {
        jawt.SetBounds$VH.set(seg, x);
    }
    public static MemoryAddress SetBounds$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)jawt.SetBounds$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SetBounds$set(MemorySegment seg, long index, MemoryAddress x) {
        jawt.SetBounds$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetBounds SetBounds (MemorySegment segment, MemorySession session) {
        return SetBounds.ofAddress(SetBounds$get(segment), session);
    }
    static final FunctionDescriptor SynthesizeWindowActivation$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle SynthesizeWindowActivation$MH = RuntimeHelper.downcallHandle(
        jawt.SynthesizeWindowActivation$FUNC
    );
    public interface SynthesizeWindowActivation {

        void apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, byte _x2);
        static MemorySegment allocate(SynthesizeWindowActivation fi, MemorySession session) {
            return RuntimeHelper.upcallStub(SynthesizeWindowActivation.class, fi, jawt.SynthesizeWindowActivation$FUNC, session);
        }
        static SynthesizeWindowActivation ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, byte __x2) -> {
                try {
                    jawt.SynthesizeWindowActivation$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle SynthesizeWindowActivation$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SynthesizeWindowActivation"));
    public static VarHandle SynthesizeWindowActivation$VH() {
        return jawt.SynthesizeWindowActivation$VH;
    }
    public static MemoryAddress SynthesizeWindowActivation$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)jawt.SynthesizeWindowActivation$VH.get(seg);
    }
    public static void SynthesizeWindowActivation$set( MemorySegment seg, MemoryAddress x) {
        jawt.SynthesizeWindowActivation$VH.set(seg, x);
    }
    public static MemoryAddress SynthesizeWindowActivation$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)jawt.SynthesizeWindowActivation$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SynthesizeWindowActivation$set(MemorySegment seg, long index, MemoryAddress x) {
        jawt.SynthesizeWindowActivation$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static SynthesizeWindowActivation SynthesizeWindowActivation (MemorySegment segment, MemorySession session) {
        return SynthesizeWindowActivation.ofAddress(SynthesizeWindowActivation$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


