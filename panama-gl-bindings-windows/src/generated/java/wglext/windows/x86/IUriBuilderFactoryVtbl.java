// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class IUriBuilderFactoryVtbl {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("CreateIUriBuilder"),
        Constants$root.C_POINTER$LAYOUT.withName("CreateInitializedIUriBuilder")
    ).withName("IUriBuilderFactoryVtbl");
    public static MemoryLayout $LAYOUT() {
        return IUriBuilderFactoryVtbl.$struct$LAYOUT;
    }
    static final FunctionDescriptor QueryInterface$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface$MH = RuntimeHelper.downcallHandle(
        IUriBuilderFactoryVtbl.QueryInterface$FUNC
    );
    public interface QueryInterface {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(QueryInterface fi, MemorySession session) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IUriBuilderFactoryVtbl.QueryInterface$FUNC, session);
        }
        static QueryInterface ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IUriBuilderFactoryVtbl.QueryInterface$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IUriBuilderFactoryVtbl.QueryInterface$VH;
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IUriBuilderFactoryVtbl.QueryInterface$VH.get(seg);
    }
    public static void QueryInterface$set( MemorySegment seg, MemoryAddress x) {
        IUriBuilderFactoryVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IUriBuilderFactoryVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        IUriBuilderFactoryVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface (MemorySegment segment, MemorySession session) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), session);
    }
    static final FunctionDescriptor AddRef$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef$MH = RuntimeHelper.downcallHandle(
        IUriBuilderFactoryVtbl.AddRef$FUNC
    );
    public interface AddRef {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(AddRef fi, MemorySession session) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IUriBuilderFactoryVtbl.AddRef$FUNC, session);
        }
        static AddRef ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IUriBuilderFactoryVtbl.AddRef$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IUriBuilderFactoryVtbl.AddRef$VH;
    }
    public static MemoryAddress AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IUriBuilderFactoryVtbl.AddRef$VH.get(seg);
    }
    public static void AddRef$set( MemorySegment seg, MemoryAddress x) {
        IUriBuilderFactoryVtbl.AddRef$VH.set(seg, x);
    }
    public static MemoryAddress AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IUriBuilderFactoryVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemoryAddress x) {
        IUriBuilderFactoryVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef (MemorySegment segment, MemorySession session) {
        return AddRef.ofAddress(AddRef$get(segment), session);
    }
    static final FunctionDescriptor Release$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release$MH = RuntimeHelper.downcallHandle(
        IUriBuilderFactoryVtbl.Release$FUNC
    );
    public interface Release {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(Release fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Release.class, fi, IUriBuilderFactoryVtbl.Release$FUNC, session);
        }
        static Release ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IUriBuilderFactoryVtbl.Release$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IUriBuilderFactoryVtbl.Release$VH;
    }
    public static MemoryAddress Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IUriBuilderFactoryVtbl.Release$VH.get(seg);
    }
    public static void Release$set( MemorySegment seg, MemoryAddress x) {
        IUriBuilderFactoryVtbl.Release$VH.set(seg, x);
    }
    public static MemoryAddress Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IUriBuilderFactoryVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemoryAddress x) {
        IUriBuilderFactoryVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release (MemorySegment segment, MemorySession session) {
        return Release.ofAddress(Release$get(segment), session);
    }
    static final FunctionDescriptor CreateIUriBuilder$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateIUriBuilder$MH = RuntimeHelper.downcallHandle(
        IUriBuilderFactoryVtbl.CreateIUriBuilder$FUNC
    );
    public interface CreateIUriBuilder {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1, long _x2, java.lang.foreign.MemoryAddress _x3);
        static MemorySegment allocate(CreateIUriBuilder fi, MemorySession session) {
            return RuntimeHelper.upcallStub(CreateIUriBuilder.class, fi, IUriBuilderFactoryVtbl.CreateIUriBuilder$FUNC, session);
        }
        static CreateIUriBuilder ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1, long __x2, java.lang.foreign.MemoryAddress __x3) -> {
                try {
                    return (int)IUriBuilderFactoryVtbl.CreateIUriBuilder$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1, __x2, (java.lang.foreign.Addressable)__x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle CreateIUriBuilder$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CreateIUriBuilder"));
    public static VarHandle CreateIUriBuilder$VH() {
        return IUriBuilderFactoryVtbl.CreateIUriBuilder$VH;
    }
    public static MemoryAddress CreateIUriBuilder$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IUriBuilderFactoryVtbl.CreateIUriBuilder$VH.get(seg);
    }
    public static void CreateIUriBuilder$set( MemorySegment seg, MemoryAddress x) {
        IUriBuilderFactoryVtbl.CreateIUriBuilder$VH.set(seg, x);
    }
    public static MemoryAddress CreateIUriBuilder$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IUriBuilderFactoryVtbl.CreateIUriBuilder$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CreateIUriBuilder$set(MemorySegment seg, long index, MemoryAddress x) {
        IUriBuilderFactoryVtbl.CreateIUriBuilder$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static CreateIUriBuilder CreateIUriBuilder (MemorySegment segment, MemorySession session) {
        return CreateIUriBuilder.ofAddress(CreateIUriBuilder$get(segment), session);
    }
    static final FunctionDescriptor CreateInitializedIUriBuilder$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateInitializedIUriBuilder$MH = RuntimeHelper.downcallHandle(
        IUriBuilderFactoryVtbl.CreateInitializedIUriBuilder$FUNC
    );
    public interface CreateInitializedIUriBuilder {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1, long _x2, java.lang.foreign.MemoryAddress _x3);
        static MemorySegment allocate(CreateInitializedIUriBuilder fi, MemorySession session) {
            return RuntimeHelper.upcallStub(CreateInitializedIUriBuilder.class, fi, IUriBuilderFactoryVtbl.CreateInitializedIUriBuilder$FUNC, session);
        }
        static CreateInitializedIUriBuilder ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1, long __x2, java.lang.foreign.MemoryAddress __x3) -> {
                try {
                    return (int)IUriBuilderFactoryVtbl.CreateInitializedIUriBuilder$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1, __x2, (java.lang.foreign.Addressable)__x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle CreateInitializedIUriBuilder$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CreateInitializedIUriBuilder"));
    public static VarHandle CreateInitializedIUriBuilder$VH() {
        return IUriBuilderFactoryVtbl.CreateInitializedIUriBuilder$VH;
    }
    public static MemoryAddress CreateInitializedIUriBuilder$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IUriBuilderFactoryVtbl.CreateInitializedIUriBuilder$VH.get(seg);
    }
    public static void CreateInitializedIUriBuilder$set( MemorySegment seg, MemoryAddress x) {
        IUriBuilderFactoryVtbl.CreateInitializedIUriBuilder$VH.set(seg, x);
    }
    public static MemoryAddress CreateInitializedIUriBuilder$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IUriBuilderFactoryVtbl.CreateInitializedIUriBuilder$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CreateInitializedIUriBuilder$set(MemorySegment seg, long index, MemoryAddress x) {
        IUriBuilderFactoryVtbl.CreateInitializedIUriBuilder$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static CreateInitializedIUriBuilder CreateInitializedIUriBuilder (MemorySegment segment, MemorySession session) {
        return CreateInitializedIUriBuilder.ofAddress(CreateInitializedIUriBuilder$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


