// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class IServerSecurityVtbl {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("QueryBlanket"),
        Constants$root.C_POINTER$LAYOUT.withName("ImpersonateClient"),
        Constants$root.C_POINTER$LAYOUT.withName("RevertToSelf"),
        Constants$root.C_POINTER$LAYOUT.withName("IsImpersonating")
    ).withName("IServerSecurityVtbl");
    public static MemoryLayout $LAYOUT() {
        return IServerSecurityVtbl.$struct$LAYOUT;
    }
    static final FunctionDescriptor QueryInterface$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface$MH = RuntimeHelper.downcallHandle(
        IServerSecurityVtbl.QueryInterface$FUNC
    );
    public interface QueryInterface {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(QueryInterface fi, MemorySession session) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IServerSecurityVtbl.QueryInterface$FUNC, session);
        }
        static QueryInterface ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IServerSecurityVtbl.QueryInterface$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IServerSecurityVtbl.QueryInterface$VH;
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IServerSecurityVtbl.QueryInterface$VH.get(seg);
    }
    public static void QueryInterface$set( MemorySegment seg, MemoryAddress x) {
        IServerSecurityVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IServerSecurityVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        IServerSecurityVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface (MemorySegment segment, MemorySession session) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), session);
    }
    static final FunctionDescriptor AddRef$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef$MH = RuntimeHelper.downcallHandle(
        IServerSecurityVtbl.AddRef$FUNC
    );
    public interface AddRef {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(AddRef fi, MemorySession session) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IServerSecurityVtbl.AddRef$FUNC, session);
        }
        static AddRef ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IServerSecurityVtbl.AddRef$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IServerSecurityVtbl.AddRef$VH;
    }
    public static MemoryAddress AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IServerSecurityVtbl.AddRef$VH.get(seg);
    }
    public static void AddRef$set( MemorySegment seg, MemoryAddress x) {
        IServerSecurityVtbl.AddRef$VH.set(seg, x);
    }
    public static MemoryAddress AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IServerSecurityVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemoryAddress x) {
        IServerSecurityVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef (MemorySegment segment, MemorySession session) {
        return AddRef.ofAddress(AddRef$get(segment), session);
    }
    static final FunctionDescriptor Release$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release$MH = RuntimeHelper.downcallHandle(
        IServerSecurityVtbl.Release$FUNC
    );
    public interface Release {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(Release fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Release.class, fi, IServerSecurityVtbl.Release$FUNC, session);
        }
        static Release ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IServerSecurityVtbl.Release$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IServerSecurityVtbl.Release$VH;
    }
    public static MemoryAddress Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IServerSecurityVtbl.Release$VH.get(seg);
    }
    public static void Release$set( MemorySegment seg, MemoryAddress x) {
        IServerSecurityVtbl.Release$VH.set(seg, x);
    }
    public static MemoryAddress Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IServerSecurityVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemoryAddress x) {
        IServerSecurityVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release (MemorySegment segment, MemorySession session) {
        return Release.ofAddress(Release$get(segment), session);
    }
    static final FunctionDescriptor QueryBlanket$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryBlanket$MH = RuntimeHelper.downcallHandle(
        IServerSecurityVtbl.QueryBlanket$FUNC
    );
    public interface QueryBlanket {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2, java.lang.foreign.MemoryAddress _x3, java.lang.foreign.MemoryAddress _x4, java.lang.foreign.MemoryAddress _x5, java.lang.foreign.MemoryAddress _x6, java.lang.foreign.MemoryAddress _x7);
        static MemorySegment allocate(QueryBlanket fi, MemorySession session) {
            return RuntimeHelper.upcallStub(QueryBlanket.class, fi, IServerSecurityVtbl.QueryBlanket$FUNC, session);
        }
        static QueryBlanket ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2, java.lang.foreign.MemoryAddress __x3, java.lang.foreign.MemoryAddress __x4, java.lang.foreign.MemoryAddress __x5, java.lang.foreign.MemoryAddress __x6, java.lang.foreign.MemoryAddress __x7) -> {
                try {
                    return (int)IServerSecurityVtbl.QueryBlanket$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2, (java.lang.foreign.Addressable)__x3, (java.lang.foreign.Addressable)__x4, (java.lang.foreign.Addressable)__x5, (java.lang.foreign.Addressable)__x6, (java.lang.foreign.Addressable)__x7);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryBlanket$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryBlanket"));
    public static VarHandle QueryBlanket$VH() {
        return IServerSecurityVtbl.QueryBlanket$VH;
    }
    public static MemoryAddress QueryBlanket$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IServerSecurityVtbl.QueryBlanket$VH.get(seg);
    }
    public static void QueryBlanket$set( MemorySegment seg, MemoryAddress x) {
        IServerSecurityVtbl.QueryBlanket$VH.set(seg, x);
    }
    public static MemoryAddress QueryBlanket$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IServerSecurityVtbl.QueryBlanket$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryBlanket$set(MemorySegment seg, long index, MemoryAddress x) {
        IServerSecurityVtbl.QueryBlanket$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryBlanket QueryBlanket (MemorySegment segment, MemorySession session) {
        return QueryBlanket.ofAddress(QueryBlanket$get(segment), session);
    }
    static final FunctionDescriptor ImpersonateClient$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ImpersonateClient$MH = RuntimeHelper.downcallHandle(
        IServerSecurityVtbl.ImpersonateClient$FUNC
    );
    public interface ImpersonateClient {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(ImpersonateClient fi, MemorySession session) {
            return RuntimeHelper.upcallStub(ImpersonateClient.class, fi, IServerSecurityVtbl.ImpersonateClient$FUNC, session);
        }
        static ImpersonateClient ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IServerSecurityVtbl.ImpersonateClient$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle ImpersonateClient$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ImpersonateClient"));
    public static VarHandle ImpersonateClient$VH() {
        return IServerSecurityVtbl.ImpersonateClient$VH;
    }
    public static MemoryAddress ImpersonateClient$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IServerSecurityVtbl.ImpersonateClient$VH.get(seg);
    }
    public static void ImpersonateClient$set( MemorySegment seg, MemoryAddress x) {
        IServerSecurityVtbl.ImpersonateClient$VH.set(seg, x);
    }
    public static MemoryAddress ImpersonateClient$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IServerSecurityVtbl.ImpersonateClient$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ImpersonateClient$set(MemorySegment seg, long index, MemoryAddress x) {
        IServerSecurityVtbl.ImpersonateClient$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static ImpersonateClient ImpersonateClient (MemorySegment segment, MemorySession session) {
        return ImpersonateClient.ofAddress(ImpersonateClient$get(segment), session);
    }
    static final FunctionDescriptor RevertToSelf$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RevertToSelf$MH = RuntimeHelper.downcallHandle(
        IServerSecurityVtbl.RevertToSelf$FUNC
    );
    public interface RevertToSelf {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(RevertToSelf fi, MemorySession session) {
            return RuntimeHelper.upcallStub(RevertToSelf.class, fi, IServerSecurityVtbl.RevertToSelf$FUNC, session);
        }
        static RevertToSelf ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IServerSecurityVtbl.RevertToSelf$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle RevertToSelf$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("RevertToSelf"));
    public static VarHandle RevertToSelf$VH() {
        return IServerSecurityVtbl.RevertToSelf$VH;
    }
    public static MemoryAddress RevertToSelf$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IServerSecurityVtbl.RevertToSelf$VH.get(seg);
    }
    public static void RevertToSelf$set( MemorySegment seg, MemoryAddress x) {
        IServerSecurityVtbl.RevertToSelf$VH.set(seg, x);
    }
    public static MemoryAddress RevertToSelf$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IServerSecurityVtbl.RevertToSelf$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RevertToSelf$set(MemorySegment seg, long index, MemoryAddress x) {
        IServerSecurityVtbl.RevertToSelf$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static RevertToSelf RevertToSelf (MemorySegment segment, MemorySession session) {
        return RevertToSelf.ofAddress(RevertToSelf$get(segment), session);
    }
    static final FunctionDescriptor IsImpersonating$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IsImpersonating$MH = RuntimeHelper.downcallHandle(
        IServerSecurityVtbl.IsImpersonating$FUNC
    );
    public interface IsImpersonating {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(IsImpersonating fi, MemorySession session) {
            return RuntimeHelper.upcallStub(IsImpersonating.class, fi, IServerSecurityVtbl.IsImpersonating$FUNC, session);
        }
        static IsImpersonating ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IServerSecurityVtbl.IsImpersonating$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle IsImpersonating$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("IsImpersonating"));
    public static VarHandle IsImpersonating$VH() {
        return IServerSecurityVtbl.IsImpersonating$VH;
    }
    public static MemoryAddress IsImpersonating$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IServerSecurityVtbl.IsImpersonating$VH.get(seg);
    }
    public static void IsImpersonating$set( MemorySegment seg, MemoryAddress x) {
        IServerSecurityVtbl.IsImpersonating$VH.set(seg, x);
    }
    public static MemoryAddress IsImpersonating$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IServerSecurityVtbl.IsImpersonating$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void IsImpersonating$set(MemorySegment seg, long index, MemoryAddress x) {
        IServerSecurityVtbl.IsImpersonating$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static IsImpersonating IsImpersonating (MemorySegment segment, MemorySession session) {
        return IsImpersonating.ofAddress(IsImpersonating$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

