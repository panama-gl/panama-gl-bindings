// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class IOleCacheVtbl {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("Cache"),
        Constants$root.C_POINTER$LAYOUT.withName("Uncache"),
        Constants$root.C_POINTER$LAYOUT.withName("EnumCache"),
        Constants$root.C_POINTER$LAYOUT.withName("InitCache"),
        Constants$root.C_POINTER$LAYOUT.withName("SetData")
    ).withName("IOleCacheVtbl");
    public static MemoryLayout $LAYOUT() {
        return IOleCacheVtbl.$struct$LAYOUT;
    }
    static final FunctionDescriptor QueryInterface$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface$MH = RuntimeHelper.downcallHandle(
        IOleCacheVtbl.QueryInterface$FUNC
    );
    public interface QueryInterface {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(QueryInterface fi, MemorySession session) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IOleCacheVtbl.QueryInterface$FUNC, session);
        }
        static QueryInterface ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IOleCacheVtbl.QueryInterface$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IOleCacheVtbl.QueryInterface$VH;
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IOleCacheVtbl.QueryInterface$VH.get(seg);
    }
    public static void QueryInterface$set( MemorySegment seg, MemoryAddress x) {
        IOleCacheVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IOleCacheVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleCacheVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface (MemorySegment segment, MemorySession session) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), session);
    }
    static final FunctionDescriptor AddRef$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef$MH = RuntimeHelper.downcallHandle(
        IOleCacheVtbl.AddRef$FUNC
    );
    public interface AddRef {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(AddRef fi, MemorySession session) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IOleCacheVtbl.AddRef$FUNC, session);
        }
        static AddRef ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IOleCacheVtbl.AddRef$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IOleCacheVtbl.AddRef$VH;
    }
    public static MemoryAddress AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IOleCacheVtbl.AddRef$VH.get(seg);
    }
    public static void AddRef$set( MemorySegment seg, MemoryAddress x) {
        IOleCacheVtbl.AddRef$VH.set(seg, x);
    }
    public static MemoryAddress AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IOleCacheVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleCacheVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef (MemorySegment segment, MemorySession session) {
        return AddRef.ofAddress(AddRef$get(segment), session);
    }
    static final FunctionDescriptor Release$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release$MH = RuntimeHelper.downcallHandle(
        IOleCacheVtbl.Release$FUNC
    );
    public interface Release {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(Release fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Release.class, fi, IOleCacheVtbl.Release$FUNC, session);
        }
        static Release ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IOleCacheVtbl.Release$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IOleCacheVtbl.Release$VH;
    }
    public static MemoryAddress Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IOleCacheVtbl.Release$VH.get(seg);
    }
    public static void Release$set( MemorySegment seg, MemoryAddress x) {
        IOleCacheVtbl.Release$VH.set(seg, x);
    }
    public static MemoryAddress Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IOleCacheVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleCacheVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release (MemorySegment segment, MemorySession session) {
        return Release.ofAddress(Release$get(segment), session);
    }
    static final FunctionDescriptor Cache$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Cache$MH = RuntimeHelper.downcallHandle(
        IOleCacheVtbl.Cache$FUNC
    );
    public interface Cache {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, int _x2, java.lang.foreign.MemoryAddress _x3);
        static MemorySegment allocate(Cache fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Cache.class, fi, IOleCacheVtbl.Cache$FUNC, session);
        }
        static Cache ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, int __x2, java.lang.foreign.MemoryAddress __x3) -> {
                try {
                    return (int)IOleCacheVtbl.Cache$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, __x2, (java.lang.foreign.Addressable)__x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Cache$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Cache"));
    public static VarHandle Cache$VH() {
        return IOleCacheVtbl.Cache$VH;
    }
    public static MemoryAddress Cache$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IOleCacheVtbl.Cache$VH.get(seg);
    }
    public static void Cache$set( MemorySegment seg, MemoryAddress x) {
        IOleCacheVtbl.Cache$VH.set(seg, x);
    }
    public static MemoryAddress Cache$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IOleCacheVtbl.Cache$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Cache$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleCacheVtbl.Cache$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Cache Cache (MemorySegment segment, MemorySession session) {
        return Cache.ofAddress(Cache$get(segment), session);
    }
    static final FunctionDescriptor Uncache$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle Uncache$MH = RuntimeHelper.downcallHandle(
        IOleCacheVtbl.Uncache$FUNC
    );
    public interface Uncache {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1);
        static MemorySegment allocate(Uncache fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Uncache.class, fi, IOleCacheVtbl.Uncache$FUNC, session);
        }
        static Uncache ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1) -> {
                try {
                    return (int)IOleCacheVtbl.Uncache$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Uncache$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Uncache"));
    public static VarHandle Uncache$VH() {
        return IOleCacheVtbl.Uncache$VH;
    }
    public static MemoryAddress Uncache$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IOleCacheVtbl.Uncache$VH.get(seg);
    }
    public static void Uncache$set( MemorySegment seg, MemoryAddress x) {
        IOleCacheVtbl.Uncache$VH.set(seg, x);
    }
    public static MemoryAddress Uncache$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IOleCacheVtbl.Uncache$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Uncache$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleCacheVtbl.Uncache$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Uncache Uncache (MemorySegment segment, MemorySession session) {
        return Uncache.ofAddress(Uncache$get(segment), session);
    }
    static final FunctionDescriptor EnumCache$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle EnumCache$MH = RuntimeHelper.downcallHandle(
        IOleCacheVtbl.EnumCache$FUNC
    );
    public interface EnumCache {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(EnumCache fi, MemorySession session) {
            return RuntimeHelper.upcallStub(EnumCache.class, fi, IOleCacheVtbl.EnumCache$FUNC, session);
        }
        static EnumCache ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)IOleCacheVtbl.EnumCache$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle EnumCache$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("EnumCache"));
    public static VarHandle EnumCache$VH() {
        return IOleCacheVtbl.EnumCache$VH;
    }
    public static MemoryAddress EnumCache$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IOleCacheVtbl.EnumCache$VH.get(seg);
    }
    public static void EnumCache$set( MemorySegment seg, MemoryAddress x) {
        IOleCacheVtbl.EnumCache$VH.set(seg, x);
    }
    public static MemoryAddress EnumCache$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IOleCacheVtbl.EnumCache$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void EnumCache$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleCacheVtbl.EnumCache$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static EnumCache EnumCache (MemorySegment segment, MemorySession session) {
        return EnumCache.ofAddress(EnumCache$get(segment), session);
    }
    static final FunctionDescriptor InitCache$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle InitCache$MH = RuntimeHelper.downcallHandle(
        IOleCacheVtbl.InitCache$FUNC
    );
    public interface InitCache {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(InitCache fi, MemorySession session) {
            return RuntimeHelper.upcallStub(InitCache.class, fi, IOleCacheVtbl.InitCache$FUNC, session);
        }
        static InitCache ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)IOleCacheVtbl.InitCache$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle InitCache$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("InitCache"));
    public static VarHandle InitCache$VH() {
        return IOleCacheVtbl.InitCache$VH;
    }
    public static MemoryAddress InitCache$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IOleCacheVtbl.InitCache$VH.get(seg);
    }
    public static void InitCache$set( MemorySegment seg, MemoryAddress x) {
        IOleCacheVtbl.InitCache$VH.set(seg, x);
    }
    public static MemoryAddress InitCache$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IOleCacheVtbl.InitCache$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void InitCache$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleCacheVtbl.InitCache$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static InitCache InitCache (MemorySegment segment, MemorySession session) {
        return InitCache.ofAddress(InitCache$get(segment), session);
    }
    static final FunctionDescriptor SetData$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetData$MH = RuntimeHelper.downcallHandle(
        IOleCacheVtbl.SetData$FUNC
    );
    public interface SetData {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2, int _x3);
        static MemorySegment allocate(SetData fi, MemorySession session) {
            return RuntimeHelper.upcallStub(SetData.class, fi, IOleCacheVtbl.SetData$FUNC, session);
        }
        static SetData ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2, int __x3) -> {
                try {
                    return (int)IOleCacheVtbl.SetData$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle SetData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SetData"));
    public static VarHandle SetData$VH() {
        return IOleCacheVtbl.SetData$VH;
    }
    public static MemoryAddress SetData$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IOleCacheVtbl.SetData$VH.get(seg);
    }
    public static void SetData$set( MemorySegment seg, MemoryAddress x) {
        IOleCacheVtbl.SetData$VH.set(seg, x);
    }
    public static MemoryAddress SetData$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IOleCacheVtbl.SetData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SetData$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleCacheVtbl.SetData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetData SetData (MemorySegment segment, MemorySession session) {
        return SetData.ofAddress(SetData$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

