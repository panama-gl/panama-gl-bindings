// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class IInitializeSpyVtbl {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("PreInitialize"),
        Constants$root.C_POINTER$LAYOUT.withName("PostInitialize"),
        Constants$root.C_POINTER$LAYOUT.withName("PreUninitialize"),
        Constants$root.C_POINTER$LAYOUT.withName("PostUninitialize")
    ).withName("IInitializeSpyVtbl");
    public static MemoryLayout $LAYOUT() {
        return IInitializeSpyVtbl.$struct$LAYOUT;
    }
    static final FunctionDescriptor QueryInterface$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface$MH = RuntimeHelper.downcallHandle(
        IInitializeSpyVtbl.QueryInterface$FUNC
    );
    public interface QueryInterface {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(QueryInterface fi, MemorySession session) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IInitializeSpyVtbl.QueryInterface$FUNC, session);
        }
        static QueryInterface ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IInitializeSpyVtbl.QueryInterface$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IInitializeSpyVtbl.QueryInterface$VH;
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IInitializeSpyVtbl.QueryInterface$VH.get(seg);
    }
    public static void QueryInterface$set( MemorySegment seg, MemoryAddress x) {
        IInitializeSpyVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IInitializeSpyVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        IInitializeSpyVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface (MemorySegment segment, MemorySession session) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), session);
    }
    static final FunctionDescriptor AddRef$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef$MH = RuntimeHelper.downcallHandle(
        IInitializeSpyVtbl.AddRef$FUNC
    );
    public interface AddRef {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(AddRef fi, MemorySession session) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IInitializeSpyVtbl.AddRef$FUNC, session);
        }
        static AddRef ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IInitializeSpyVtbl.AddRef$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IInitializeSpyVtbl.AddRef$VH;
    }
    public static MemoryAddress AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IInitializeSpyVtbl.AddRef$VH.get(seg);
    }
    public static void AddRef$set( MemorySegment seg, MemoryAddress x) {
        IInitializeSpyVtbl.AddRef$VH.set(seg, x);
    }
    public static MemoryAddress AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IInitializeSpyVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemoryAddress x) {
        IInitializeSpyVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef (MemorySegment segment, MemorySession session) {
        return AddRef.ofAddress(AddRef$get(segment), session);
    }
    static final FunctionDescriptor Release$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release$MH = RuntimeHelper.downcallHandle(
        IInitializeSpyVtbl.Release$FUNC
    );
    public interface Release {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(Release fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Release.class, fi, IInitializeSpyVtbl.Release$FUNC, session);
        }
        static Release ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IInitializeSpyVtbl.Release$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IInitializeSpyVtbl.Release$VH;
    }
    public static MemoryAddress Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IInitializeSpyVtbl.Release$VH.get(seg);
    }
    public static void Release$set( MemorySegment seg, MemoryAddress x) {
        IInitializeSpyVtbl.Release$VH.set(seg, x);
    }
    public static MemoryAddress Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IInitializeSpyVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemoryAddress x) {
        IInitializeSpyVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release (MemorySegment segment, MemorySession session) {
        return Release.ofAddress(Release$get(segment), session);
    }
    static final FunctionDescriptor PreInitialize$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PreInitialize$MH = RuntimeHelper.downcallHandle(
        IInitializeSpyVtbl.PreInitialize$FUNC
    );
    public interface PreInitialize {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1, int _x2);
        static MemorySegment allocate(PreInitialize fi, MemorySession session) {
            return RuntimeHelper.upcallStub(PreInitialize.class, fi, IInitializeSpyVtbl.PreInitialize$FUNC, session);
        }
        static PreInitialize ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1, int __x2) -> {
                try {
                    return (int)IInitializeSpyVtbl.PreInitialize$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle PreInitialize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PreInitialize"));
    public static VarHandle PreInitialize$VH() {
        return IInitializeSpyVtbl.PreInitialize$VH;
    }
    public static MemoryAddress PreInitialize$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IInitializeSpyVtbl.PreInitialize$VH.get(seg);
    }
    public static void PreInitialize$set( MemorySegment seg, MemoryAddress x) {
        IInitializeSpyVtbl.PreInitialize$VH.set(seg, x);
    }
    public static MemoryAddress PreInitialize$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IInitializeSpyVtbl.PreInitialize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PreInitialize$set(MemorySegment seg, long index, MemoryAddress x) {
        IInitializeSpyVtbl.PreInitialize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static PreInitialize PreInitialize (MemorySegment segment, MemorySession session) {
        return PreInitialize.ofAddress(PreInitialize$get(segment), session);
    }
    static final FunctionDescriptor PostInitialize$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PostInitialize$MH = RuntimeHelper.downcallHandle(
        IInitializeSpyVtbl.PostInitialize$FUNC
    );
    public interface PostInitialize {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1, int _x2, int _x3);
        static MemorySegment allocate(PostInitialize fi, MemorySession session) {
            return RuntimeHelper.upcallStub(PostInitialize.class, fi, IInitializeSpyVtbl.PostInitialize$FUNC, session);
        }
        static PostInitialize ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1, int __x2, int __x3) -> {
                try {
                    return (int)IInitializeSpyVtbl.PostInitialize$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1, __x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle PostInitialize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PostInitialize"));
    public static VarHandle PostInitialize$VH() {
        return IInitializeSpyVtbl.PostInitialize$VH;
    }
    public static MemoryAddress PostInitialize$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IInitializeSpyVtbl.PostInitialize$VH.get(seg);
    }
    public static void PostInitialize$set( MemorySegment seg, MemoryAddress x) {
        IInitializeSpyVtbl.PostInitialize$VH.set(seg, x);
    }
    public static MemoryAddress PostInitialize$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IInitializeSpyVtbl.PostInitialize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PostInitialize$set(MemorySegment seg, long index, MemoryAddress x) {
        IInitializeSpyVtbl.PostInitialize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static PostInitialize PostInitialize (MemorySegment segment, MemorySession session) {
        return PostInitialize.ofAddress(PostInitialize$get(segment), session);
    }
    static final FunctionDescriptor PreUninitialize$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PreUninitialize$MH = RuntimeHelper.downcallHandle(
        IInitializeSpyVtbl.PreUninitialize$FUNC
    );
    public interface PreUninitialize {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1);
        static MemorySegment allocate(PreUninitialize fi, MemorySession session) {
            return RuntimeHelper.upcallStub(PreUninitialize.class, fi, IInitializeSpyVtbl.PreUninitialize$FUNC, session);
        }
        static PreUninitialize ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1) -> {
                try {
                    return (int)IInitializeSpyVtbl.PreUninitialize$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle PreUninitialize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PreUninitialize"));
    public static VarHandle PreUninitialize$VH() {
        return IInitializeSpyVtbl.PreUninitialize$VH;
    }
    public static MemoryAddress PreUninitialize$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IInitializeSpyVtbl.PreUninitialize$VH.get(seg);
    }
    public static void PreUninitialize$set( MemorySegment seg, MemoryAddress x) {
        IInitializeSpyVtbl.PreUninitialize$VH.set(seg, x);
    }
    public static MemoryAddress PreUninitialize$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IInitializeSpyVtbl.PreUninitialize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PreUninitialize$set(MemorySegment seg, long index, MemoryAddress x) {
        IInitializeSpyVtbl.PreUninitialize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static PreUninitialize PreUninitialize (MemorySegment segment, MemorySession session) {
        return PreUninitialize.ofAddress(PreUninitialize$get(segment), session);
    }
    static final FunctionDescriptor PostUninitialize$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PostUninitialize$MH = RuntimeHelper.downcallHandle(
        IInitializeSpyVtbl.PostUninitialize$FUNC
    );
    public interface PostUninitialize {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1);
        static MemorySegment allocate(PostUninitialize fi, MemorySession session) {
            return RuntimeHelper.upcallStub(PostUninitialize.class, fi, IInitializeSpyVtbl.PostUninitialize$FUNC, session);
        }
        static PostUninitialize ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1) -> {
                try {
                    return (int)IInitializeSpyVtbl.PostUninitialize$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle PostUninitialize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("PostUninitialize"));
    public static VarHandle PostUninitialize$VH() {
        return IInitializeSpyVtbl.PostUninitialize$VH;
    }
    public static MemoryAddress PostUninitialize$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IInitializeSpyVtbl.PostUninitialize$VH.get(seg);
    }
    public static void PostUninitialize$set( MemorySegment seg, MemoryAddress x) {
        IInitializeSpyVtbl.PostUninitialize$VH.set(seg, x);
    }
    public static MemoryAddress PostUninitialize$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IInitializeSpyVtbl.PostUninitialize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PostUninitialize$set(MemorySegment seg, long index, MemoryAddress x) {
        IInitializeSpyVtbl.PostUninitialize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static PostUninitialize PostUninitialize (MemorySegment segment, MemorySession session) {
        return PostUninitialize.ofAddress(PostUninitialize$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


