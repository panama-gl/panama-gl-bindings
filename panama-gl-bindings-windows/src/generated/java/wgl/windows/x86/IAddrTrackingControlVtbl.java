// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class IAddrTrackingControlVtbl {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("EnableCOMDynamicAddrTracking"),
        Constants$root.C_POINTER$LAYOUT.withName("DisableCOMDynamicAddrTracking")
    ).withName("IAddrTrackingControlVtbl");
    public static MemoryLayout $LAYOUT() {
        return IAddrTrackingControlVtbl.$struct$LAYOUT;
    }
    static final FunctionDescriptor QueryInterface$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface$MH = RuntimeHelper.downcallHandle(
        IAddrTrackingControlVtbl.QueryInterface$FUNC
    );
    public interface QueryInterface {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(QueryInterface fi, MemorySession session) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IAddrTrackingControlVtbl.QueryInterface$FUNC, session);
        }
        static QueryInterface ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IAddrTrackingControlVtbl.QueryInterface$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IAddrTrackingControlVtbl.QueryInterface$VH;
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IAddrTrackingControlVtbl.QueryInterface$VH.get(seg);
    }
    public static void QueryInterface$set( MemorySegment seg, MemoryAddress x) {
        IAddrTrackingControlVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IAddrTrackingControlVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        IAddrTrackingControlVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface (MemorySegment segment, MemorySession session) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), session);
    }
    static final FunctionDescriptor AddRef$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef$MH = RuntimeHelper.downcallHandle(
        IAddrTrackingControlVtbl.AddRef$FUNC
    );
    public interface AddRef {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(AddRef fi, MemorySession session) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IAddrTrackingControlVtbl.AddRef$FUNC, session);
        }
        static AddRef ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IAddrTrackingControlVtbl.AddRef$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IAddrTrackingControlVtbl.AddRef$VH;
    }
    public static MemoryAddress AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IAddrTrackingControlVtbl.AddRef$VH.get(seg);
    }
    public static void AddRef$set( MemorySegment seg, MemoryAddress x) {
        IAddrTrackingControlVtbl.AddRef$VH.set(seg, x);
    }
    public static MemoryAddress AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IAddrTrackingControlVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemoryAddress x) {
        IAddrTrackingControlVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef (MemorySegment segment, MemorySession session) {
        return AddRef.ofAddress(AddRef$get(segment), session);
    }
    static final FunctionDescriptor Release$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release$MH = RuntimeHelper.downcallHandle(
        IAddrTrackingControlVtbl.Release$FUNC
    );
    public interface Release {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(Release fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Release.class, fi, IAddrTrackingControlVtbl.Release$FUNC, session);
        }
        static Release ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IAddrTrackingControlVtbl.Release$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IAddrTrackingControlVtbl.Release$VH;
    }
    public static MemoryAddress Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IAddrTrackingControlVtbl.Release$VH.get(seg);
    }
    public static void Release$set( MemorySegment seg, MemoryAddress x) {
        IAddrTrackingControlVtbl.Release$VH.set(seg, x);
    }
    public static MemoryAddress Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IAddrTrackingControlVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemoryAddress x) {
        IAddrTrackingControlVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release (MemorySegment segment, MemorySession session) {
        return Release.ofAddress(Release$get(segment), session);
    }
    static final FunctionDescriptor EnableCOMDynamicAddrTracking$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle EnableCOMDynamicAddrTracking$MH = RuntimeHelper.downcallHandle(
        IAddrTrackingControlVtbl.EnableCOMDynamicAddrTracking$FUNC
    );
    public interface EnableCOMDynamicAddrTracking {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(EnableCOMDynamicAddrTracking fi, MemorySession session) {
            return RuntimeHelper.upcallStub(EnableCOMDynamicAddrTracking.class, fi, IAddrTrackingControlVtbl.EnableCOMDynamicAddrTracking$FUNC, session);
        }
        static EnableCOMDynamicAddrTracking ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IAddrTrackingControlVtbl.EnableCOMDynamicAddrTracking$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle EnableCOMDynamicAddrTracking$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("EnableCOMDynamicAddrTracking"));
    public static VarHandle EnableCOMDynamicAddrTracking$VH() {
        return IAddrTrackingControlVtbl.EnableCOMDynamicAddrTracking$VH;
    }
    public static MemoryAddress EnableCOMDynamicAddrTracking$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IAddrTrackingControlVtbl.EnableCOMDynamicAddrTracking$VH.get(seg);
    }
    public static void EnableCOMDynamicAddrTracking$set( MemorySegment seg, MemoryAddress x) {
        IAddrTrackingControlVtbl.EnableCOMDynamicAddrTracking$VH.set(seg, x);
    }
    public static MemoryAddress EnableCOMDynamicAddrTracking$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IAddrTrackingControlVtbl.EnableCOMDynamicAddrTracking$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void EnableCOMDynamicAddrTracking$set(MemorySegment seg, long index, MemoryAddress x) {
        IAddrTrackingControlVtbl.EnableCOMDynamicAddrTracking$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static EnableCOMDynamicAddrTracking EnableCOMDynamicAddrTracking (MemorySegment segment, MemorySession session) {
        return EnableCOMDynamicAddrTracking.ofAddress(EnableCOMDynamicAddrTracking$get(segment), session);
    }
    static final FunctionDescriptor DisableCOMDynamicAddrTracking$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DisableCOMDynamicAddrTracking$MH = RuntimeHelper.downcallHandle(
        IAddrTrackingControlVtbl.DisableCOMDynamicAddrTracking$FUNC
    );
    public interface DisableCOMDynamicAddrTracking {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(DisableCOMDynamicAddrTracking fi, MemorySession session) {
            return RuntimeHelper.upcallStub(DisableCOMDynamicAddrTracking.class, fi, IAddrTrackingControlVtbl.DisableCOMDynamicAddrTracking$FUNC, session);
        }
        static DisableCOMDynamicAddrTracking ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IAddrTrackingControlVtbl.DisableCOMDynamicAddrTracking$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle DisableCOMDynamicAddrTracking$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("DisableCOMDynamicAddrTracking"));
    public static VarHandle DisableCOMDynamicAddrTracking$VH() {
        return IAddrTrackingControlVtbl.DisableCOMDynamicAddrTracking$VH;
    }
    public static MemoryAddress DisableCOMDynamicAddrTracking$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IAddrTrackingControlVtbl.DisableCOMDynamicAddrTracking$VH.get(seg);
    }
    public static void DisableCOMDynamicAddrTracking$set( MemorySegment seg, MemoryAddress x) {
        IAddrTrackingControlVtbl.DisableCOMDynamicAddrTracking$VH.set(seg, x);
    }
    public static MemoryAddress DisableCOMDynamicAddrTracking$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IAddrTrackingControlVtbl.DisableCOMDynamicAddrTracking$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DisableCOMDynamicAddrTracking$set(MemorySegment seg, long index, MemoryAddress x) {
        IAddrTrackingControlVtbl.DisableCOMDynamicAddrTracking$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static DisableCOMDynamicAddrTracking DisableCOMDynamicAddrTracking (MemorySegment segment, MemorySession session) {
        return DisableCOMDynamicAddrTracking.ofAddress(DisableCOMDynamicAddrTracking$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


