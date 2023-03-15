// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class IComThreadingInfoVtbl {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("GetCurrentApartmentType"),
        Constants$root.C_POINTER$LAYOUT.withName("GetCurrentThreadType"),
        Constants$root.C_POINTER$LAYOUT.withName("GetCurrentLogicalThreadId"),
        Constants$root.C_POINTER$LAYOUT.withName("SetCurrentLogicalThreadId")
    ).withName("IComThreadingInfoVtbl");
    public static MemoryLayout $LAYOUT() {
        return IComThreadingInfoVtbl.$struct$LAYOUT;
    }
    static final FunctionDescriptor QueryInterface$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface$MH = RuntimeHelper.downcallHandle(
        IComThreadingInfoVtbl.QueryInterface$FUNC
    );
    public interface QueryInterface {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(QueryInterface fi, MemorySession session) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IComThreadingInfoVtbl.QueryInterface$FUNC, session);
        }
        static QueryInterface ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IComThreadingInfoVtbl.QueryInterface$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IComThreadingInfoVtbl.QueryInterface$VH;
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IComThreadingInfoVtbl.QueryInterface$VH.get(seg);
    }
    public static void QueryInterface$set( MemorySegment seg, MemoryAddress x) {
        IComThreadingInfoVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IComThreadingInfoVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        IComThreadingInfoVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface (MemorySegment segment, MemorySession session) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), session);
    }
    static final FunctionDescriptor AddRef$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef$MH = RuntimeHelper.downcallHandle(
        IComThreadingInfoVtbl.AddRef$FUNC
    );
    public interface AddRef {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(AddRef fi, MemorySession session) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IComThreadingInfoVtbl.AddRef$FUNC, session);
        }
        static AddRef ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IComThreadingInfoVtbl.AddRef$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IComThreadingInfoVtbl.AddRef$VH;
    }
    public static MemoryAddress AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IComThreadingInfoVtbl.AddRef$VH.get(seg);
    }
    public static void AddRef$set( MemorySegment seg, MemoryAddress x) {
        IComThreadingInfoVtbl.AddRef$VH.set(seg, x);
    }
    public static MemoryAddress AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IComThreadingInfoVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemoryAddress x) {
        IComThreadingInfoVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef (MemorySegment segment, MemorySession session) {
        return AddRef.ofAddress(AddRef$get(segment), session);
    }
    static final FunctionDescriptor Release$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release$MH = RuntimeHelper.downcallHandle(
        IComThreadingInfoVtbl.Release$FUNC
    );
    public interface Release {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(Release fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Release.class, fi, IComThreadingInfoVtbl.Release$FUNC, session);
        }
        static Release ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IComThreadingInfoVtbl.Release$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IComThreadingInfoVtbl.Release$VH;
    }
    public static MemoryAddress Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IComThreadingInfoVtbl.Release$VH.get(seg);
    }
    public static void Release$set( MemorySegment seg, MemoryAddress x) {
        IComThreadingInfoVtbl.Release$VH.set(seg, x);
    }
    public static MemoryAddress Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IComThreadingInfoVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemoryAddress x) {
        IComThreadingInfoVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release (MemorySegment segment, MemorySession session) {
        return Release.ofAddress(Release$get(segment), session);
    }
    static final FunctionDescriptor GetCurrentApartmentType$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetCurrentApartmentType$MH = RuntimeHelper.downcallHandle(
        IComThreadingInfoVtbl.GetCurrentApartmentType$FUNC
    );
    public interface GetCurrentApartmentType {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(GetCurrentApartmentType fi, MemorySession session) {
            return RuntimeHelper.upcallStub(GetCurrentApartmentType.class, fi, IComThreadingInfoVtbl.GetCurrentApartmentType$FUNC, session);
        }
        static GetCurrentApartmentType ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)IComThreadingInfoVtbl.GetCurrentApartmentType$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetCurrentApartmentType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetCurrentApartmentType"));
    public static VarHandle GetCurrentApartmentType$VH() {
        return IComThreadingInfoVtbl.GetCurrentApartmentType$VH;
    }
    public static MemoryAddress GetCurrentApartmentType$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IComThreadingInfoVtbl.GetCurrentApartmentType$VH.get(seg);
    }
    public static void GetCurrentApartmentType$set( MemorySegment seg, MemoryAddress x) {
        IComThreadingInfoVtbl.GetCurrentApartmentType$VH.set(seg, x);
    }
    public static MemoryAddress GetCurrentApartmentType$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IComThreadingInfoVtbl.GetCurrentApartmentType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetCurrentApartmentType$set(MemorySegment seg, long index, MemoryAddress x) {
        IComThreadingInfoVtbl.GetCurrentApartmentType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetCurrentApartmentType GetCurrentApartmentType (MemorySegment segment, MemorySession session) {
        return GetCurrentApartmentType.ofAddress(GetCurrentApartmentType$get(segment), session);
    }
    static final FunctionDescriptor GetCurrentThreadType$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetCurrentThreadType$MH = RuntimeHelper.downcallHandle(
        IComThreadingInfoVtbl.GetCurrentThreadType$FUNC
    );
    public interface GetCurrentThreadType {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(GetCurrentThreadType fi, MemorySession session) {
            return RuntimeHelper.upcallStub(GetCurrentThreadType.class, fi, IComThreadingInfoVtbl.GetCurrentThreadType$FUNC, session);
        }
        static GetCurrentThreadType ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)IComThreadingInfoVtbl.GetCurrentThreadType$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetCurrentThreadType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetCurrentThreadType"));
    public static VarHandle GetCurrentThreadType$VH() {
        return IComThreadingInfoVtbl.GetCurrentThreadType$VH;
    }
    public static MemoryAddress GetCurrentThreadType$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IComThreadingInfoVtbl.GetCurrentThreadType$VH.get(seg);
    }
    public static void GetCurrentThreadType$set( MemorySegment seg, MemoryAddress x) {
        IComThreadingInfoVtbl.GetCurrentThreadType$VH.set(seg, x);
    }
    public static MemoryAddress GetCurrentThreadType$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IComThreadingInfoVtbl.GetCurrentThreadType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetCurrentThreadType$set(MemorySegment seg, long index, MemoryAddress x) {
        IComThreadingInfoVtbl.GetCurrentThreadType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetCurrentThreadType GetCurrentThreadType (MemorySegment segment, MemorySession session) {
        return GetCurrentThreadType.ofAddress(GetCurrentThreadType$get(segment), session);
    }
    static final FunctionDescriptor GetCurrentLogicalThreadId$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetCurrentLogicalThreadId$MH = RuntimeHelper.downcallHandle(
        IComThreadingInfoVtbl.GetCurrentLogicalThreadId$FUNC
    );
    public interface GetCurrentLogicalThreadId {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(GetCurrentLogicalThreadId fi, MemorySession session) {
            return RuntimeHelper.upcallStub(GetCurrentLogicalThreadId.class, fi, IComThreadingInfoVtbl.GetCurrentLogicalThreadId$FUNC, session);
        }
        static GetCurrentLogicalThreadId ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)IComThreadingInfoVtbl.GetCurrentLogicalThreadId$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetCurrentLogicalThreadId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetCurrentLogicalThreadId"));
    public static VarHandle GetCurrentLogicalThreadId$VH() {
        return IComThreadingInfoVtbl.GetCurrentLogicalThreadId$VH;
    }
    public static MemoryAddress GetCurrentLogicalThreadId$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IComThreadingInfoVtbl.GetCurrentLogicalThreadId$VH.get(seg);
    }
    public static void GetCurrentLogicalThreadId$set( MemorySegment seg, MemoryAddress x) {
        IComThreadingInfoVtbl.GetCurrentLogicalThreadId$VH.set(seg, x);
    }
    public static MemoryAddress GetCurrentLogicalThreadId$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IComThreadingInfoVtbl.GetCurrentLogicalThreadId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetCurrentLogicalThreadId$set(MemorySegment seg, long index, MemoryAddress x) {
        IComThreadingInfoVtbl.GetCurrentLogicalThreadId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetCurrentLogicalThreadId GetCurrentLogicalThreadId (MemorySegment segment, MemorySession session) {
        return GetCurrentLogicalThreadId.ofAddress(GetCurrentLogicalThreadId$get(segment), session);
    }
    static final FunctionDescriptor SetCurrentLogicalThreadId$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetCurrentLogicalThreadId$MH = RuntimeHelper.downcallHandle(
        IComThreadingInfoVtbl.SetCurrentLogicalThreadId$FUNC
    );
    public interface SetCurrentLogicalThreadId {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(SetCurrentLogicalThreadId fi, MemorySession session) {
            return RuntimeHelper.upcallStub(SetCurrentLogicalThreadId.class, fi, IComThreadingInfoVtbl.SetCurrentLogicalThreadId$FUNC, session);
        }
        static SetCurrentLogicalThreadId ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)IComThreadingInfoVtbl.SetCurrentLogicalThreadId$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle SetCurrentLogicalThreadId$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SetCurrentLogicalThreadId"));
    public static VarHandle SetCurrentLogicalThreadId$VH() {
        return IComThreadingInfoVtbl.SetCurrentLogicalThreadId$VH;
    }
    public static MemoryAddress SetCurrentLogicalThreadId$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IComThreadingInfoVtbl.SetCurrentLogicalThreadId$VH.get(seg);
    }
    public static void SetCurrentLogicalThreadId$set( MemorySegment seg, MemoryAddress x) {
        IComThreadingInfoVtbl.SetCurrentLogicalThreadId$VH.set(seg, x);
    }
    public static MemoryAddress SetCurrentLogicalThreadId$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IComThreadingInfoVtbl.SetCurrentLogicalThreadId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SetCurrentLogicalThreadId$set(MemorySegment seg, long index, MemoryAddress x) {
        IComThreadingInfoVtbl.SetCurrentLogicalThreadId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetCurrentLogicalThreadId SetCurrentLogicalThreadId (MemorySegment segment, MemorySession session) {
        return SetCurrentLogicalThreadId.ofAddress(SetCurrentLogicalThreadId$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


