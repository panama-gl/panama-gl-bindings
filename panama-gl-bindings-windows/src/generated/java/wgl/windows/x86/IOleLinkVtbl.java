// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class IOleLinkVtbl {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("SetUpdateOptions"),
        Constants$root.C_POINTER$LAYOUT.withName("GetUpdateOptions"),
        Constants$root.C_POINTER$LAYOUT.withName("SetSourceMoniker"),
        Constants$root.C_POINTER$LAYOUT.withName("GetSourceMoniker"),
        Constants$root.C_POINTER$LAYOUT.withName("SetSourceDisplayName"),
        Constants$root.C_POINTER$LAYOUT.withName("GetSourceDisplayName"),
        Constants$root.C_POINTER$LAYOUT.withName("BindToSource"),
        Constants$root.C_POINTER$LAYOUT.withName("BindIfRunning"),
        Constants$root.C_POINTER$LAYOUT.withName("GetBoundSource"),
        Constants$root.C_POINTER$LAYOUT.withName("UnbindSource"),
        Constants$root.C_POINTER$LAYOUT.withName("Update")
    ).withName("IOleLinkVtbl");
    public static MemoryLayout $LAYOUT() {
        return IOleLinkVtbl.$struct$LAYOUT;
    }
    static final FunctionDescriptor QueryInterface$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface$MH = RuntimeHelper.downcallHandle(
        IOleLinkVtbl.QueryInterface$FUNC
    );
    public interface QueryInterface {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(QueryInterface fi, MemorySession session) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IOleLinkVtbl.QueryInterface$FUNC, session);
        }
        static QueryInterface ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IOleLinkVtbl.QueryInterface$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IOleLinkVtbl.QueryInterface$VH;
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IOleLinkVtbl.QueryInterface$VH.get(seg);
    }
    public static void QueryInterface$set( MemorySegment seg, MemoryAddress x) {
        IOleLinkVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IOleLinkVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleLinkVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface (MemorySegment segment, MemorySession session) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), session);
    }
    static final FunctionDescriptor AddRef$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef$MH = RuntimeHelper.downcallHandle(
        IOleLinkVtbl.AddRef$FUNC
    );
    public interface AddRef {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(AddRef fi, MemorySession session) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IOleLinkVtbl.AddRef$FUNC, session);
        }
        static AddRef ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IOleLinkVtbl.AddRef$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IOleLinkVtbl.AddRef$VH;
    }
    public static MemoryAddress AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IOleLinkVtbl.AddRef$VH.get(seg);
    }
    public static void AddRef$set( MemorySegment seg, MemoryAddress x) {
        IOleLinkVtbl.AddRef$VH.set(seg, x);
    }
    public static MemoryAddress AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IOleLinkVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleLinkVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef (MemorySegment segment, MemorySession session) {
        return AddRef.ofAddress(AddRef$get(segment), session);
    }
    static final FunctionDescriptor Release$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release$MH = RuntimeHelper.downcallHandle(
        IOleLinkVtbl.Release$FUNC
    );
    public interface Release {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(Release fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Release.class, fi, IOleLinkVtbl.Release$FUNC, session);
        }
        static Release ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IOleLinkVtbl.Release$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IOleLinkVtbl.Release$VH;
    }
    public static MemoryAddress Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IOleLinkVtbl.Release$VH.get(seg);
    }
    public static void Release$set( MemorySegment seg, MemoryAddress x) {
        IOleLinkVtbl.Release$VH.set(seg, x);
    }
    public static MemoryAddress Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IOleLinkVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleLinkVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release (MemorySegment segment, MemorySession session) {
        return Release.ofAddress(Release$get(segment), session);
    }
    static final FunctionDescriptor SetUpdateOptions$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetUpdateOptions$MH = RuntimeHelper.downcallHandle(
        IOleLinkVtbl.SetUpdateOptions$FUNC
    );
    public interface SetUpdateOptions {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1);
        static MemorySegment allocate(SetUpdateOptions fi, MemorySession session) {
            return RuntimeHelper.upcallStub(SetUpdateOptions.class, fi, IOleLinkVtbl.SetUpdateOptions$FUNC, session);
        }
        static SetUpdateOptions ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1) -> {
                try {
                    return (int)IOleLinkVtbl.SetUpdateOptions$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle SetUpdateOptions$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SetUpdateOptions"));
    public static VarHandle SetUpdateOptions$VH() {
        return IOleLinkVtbl.SetUpdateOptions$VH;
    }
    public static MemoryAddress SetUpdateOptions$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IOleLinkVtbl.SetUpdateOptions$VH.get(seg);
    }
    public static void SetUpdateOptions$set( MemorySegment seg, MemoryAddress x) {
        IOleLinkVtbl.SetUpdateOptions$VH.set(seg, x);
    }
    public static MemoryAddress SetUpdateOptions$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IOleLinkVtbl.SetUpdateOptions$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SetUpdateOptions$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleLinkVtbl.SetUpdateOptions$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetUpdateOptions SetUpdateOptions (MemorySegment segment, MemorySession session) {
        return SetUpdateOptions.ofAddress(SetUpdateOptions$get(segment), session);
    }
    static final FunctionDescriptor GetUpdateOptions$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetUpdateOptions$MH = RuntimeHelper.downcallHandle(
        IOleLinkVtbl.GetUpdateOptions$FUNC
    );
    public interface GetUpdateOptions {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(GetUpdateOptions fi, MemorySession session) {
            return RuntimeHelper.upcallStub(GetUpdateOptions.class, fi, IOleLinkVtbl.GetUpdateOptions$FUNC, session);
        }
        static GetUpdateOptions ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)IOleLinkVtbl.GetUpdateOptions$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetUpdateOptions$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetUpdateOptions"));
    public static VarHandle GetUpdateOptions$VH() {
        return IOleLinkVtbl.GetUpdateOptions$VH;
    }
    public static MemoryAddress GetUpdateOptions$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IOleLinkVtbl.GetUpdateOptions$VH.get(seg);
    }
    public static void GetUpdateOptions$set( MemorySegment seg, MemoryAddress x) {
        IOleLinkVtbl.GetUpdateOptions$VH.set(seg, x);
    }
    public static MemoryAddress GetUpdateOptions$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IOleLinkVtbl.GetUpdateOptions$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetUpdateOptions$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleLinkVtbl.GetUpdateOptions$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetUpdateOptions GetUpdateOptions (MemorySegment segment, MemorySession session) {
        return GetUpdateOptions.ofAddress(GetUpdateOptions$get(segment), session);
    }
    static final FunctionDescriptor SetSourceMoniker$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetSourceMoniker$MH = RuntimeHelper.downcallHandle(
        IOleLinkVtbl.SetSourceMoniker$FUNC
    );
    public interface SetSourceMoniker {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(SetSourceMoniker fi, MemorySession session) {
            return RuntimeHelper.upcallStub(SetSourceMoniker.class, fi, IOleLinkVtbl.SetSourceMoniker$FUNC, session);
        }
        static SetSourceMoniker ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IOleLinkVtbl.SetSourceMoniker$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle SetSourceMoniker$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SetSourceMoniker"));
    public static VarHandle SetSourceMoniker$VH() {
        return IOleLinkVtbl.SetSourceMoniker$VH;
    }
    public static MemoryAddress SetSourceMoniker$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IOleLinkVtbl.SetSourceMoniker$VH.get(seg);
    }
    public static void SetSourceMoniker$set( MemorySegment seg, MemoryAddress x) {
        IOleLinkVtbl.SetSourceMoniker$VH.set(seg, x);
    }
    public static MemoryAddress SetSourceMoniker$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IOleLinkVtbl.SetSourceMoniker$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SetSourceMoniker$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleLinkVtbl.SetSourceMoniker$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetSourceMoniker SetSourceMoniker (MemorySegment segment, MemorySession session) {
        return SetSourceMoniker.ofAddress(SetSourceMoniker$get(segment), session);
    }
    static final FunctionDescriptor GetSourceMoniker$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetSourceMoniker$MH = RuntimeHelper.downcallHandle(
        IOleLinkVtbl.GetSourceMoniker$FUNC
    );
    public interface GetSourceMoniker {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(GetSourceMoniker fi, MemorySession session) {
            return RuntimeHelper.upcallStub(GetSourceMoniker.class, fi, IOleLinkVtbl.GetSourceMoniker$FUNC, session);
        }
        static GetSourceMoniker ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)IOleLinkVtbl.GetSourceMoniker$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetSourceMoniker$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetSourceMoniker"));
    public static VarHandle GetSourceMoniker$VH() {
        return IOleLinkVtbl.GetSourceMoniker$VH;
    }
    public static MemoryAddress GetSourceMoniker$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IOleLinkVtbl.GetSourceMoniker$VH.get(seg);
    }
    public static void GetSourceMoniker$set( MemorySegment seg, MemoryAddress x) {
        IOleLinkVtbl.GetSourceMoniker$VH.set(seg, x);
    }
    public static MemoryAddress GetSourceMoniker$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IOleLinkVtbl.GetSourceMoniker$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetSourceMoniker$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleLinkVtbl.GetSourceMoniker$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetSourceMoniker GetSourceMoniker (MemorySegment segment, MemorySession session) {
        return GetSourceMoniker.ofAddress(GetSourceMoniker$get(segment), session);
    }
    static final FunctionDescriptor SetSourceDisplayName$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetSourceDisplayName$MH = RuntimeHelper.downcallHandle(
        IOleLinkVtbl.SetSourceDisplayName$FUNC
    );
    public interface SetSourceDisplayName {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(SetSourceDisplayName fi, MemorySession session) {
            return RuntimeHelper.upcallStub(SetSourceDisplayName.class, fi, IOleLinkVtbl.SetSourceDisplayName$FUNC, session);
        }
        static SetSourceDisplayName ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)IOleLinkVtbl.SetSourceDisplayName$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle SetSourceDisplayName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SetSourceDisplayName"));
    public static VarHandle SetSourceDisplayName$VH() {
        return IOleLinkVtbl.SetSourceDisplayName$VH;
    }
    public static MemoryAddress SetSourceDisplayName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IOleLinkVtbl.SetSourceDisplayName$VH.get(seg);
    }
    public static void SetSourceDisplayName$set( MemorySegment seg, MemoryAddress x) {
        IOleLinkVtbl.SetSourceDisplayName$VH.set(seg, x);
    }
    public static MemoryAddress SetSourceDisplayName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IOleLinkVtbl.SetSourceDisplayName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SetSourceDisplayName$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleLinkVtbl.SetSourceDisplayName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetSourceDisplayName SetSourceDisplayName (MemorySegment segment, MemorySession session) {
        return SetSourceDisplayName.ofAddress(SetSourceDisplayName$get(segment), session);
    }
    static final FunctionDescriptor GetSourceDisplayName$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetSourceDisplayName$MH = RuntimeHelper.downcallHandle(
        IOleLinkVtbl.GetSourceDisplayName$FUNC
    );
    public interface GetSourceDisplayName {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(GetSourceDisplayName fi, MemorySession session) {
            return RuntimeHelper.upcallStub(GetSourceDisplayName.class, fi, IOleLinkVtbl.GetSourceDisplayName$FUNC, session);
        }
        static GetSourceDisplayName ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)IOleLinkVtbl.GetSourceDisplayName$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetSourceDisplayName$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetSourceDisplayName"));
    public static VarHandle GetSourceDisplayName$VH() {
        return IOleLinkVtbl.GetSourceDisplayName$VH;
    }
    public static MemoryAddress GetSourceDisplayName$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IOleLinkVtbl.GetSourceDisplayName$VH.get(seg);
    }
    public static void GetSourceDisplayName$set( MemorySegment seg, MemoryAddress x) {
        IOleLinkVtbl.GetSourceDisplayName$VH.set(seg, x);
    }
    public static MemoryAddress GetSourceDisplayName$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IOleLinkVtbl.GetSourceDisplayName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetSourceDisplayName$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleLinkVtbl.GetSourceDisplayName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetSourceDisplayName GetSourceDisplayName (MemorySegment segment, MemorySession session) {
        return GetSourceDisplayName.ofAddress(GetSourceDisplayName$get(segment), session);
    }
    static final FunctionDescriptor BindToSource$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle BindToSource$MH = RuntimeHelper.downcallHandle(
        IOleLinkVtbl.BindToSource$FUNC
    );
    public interface BindToSource {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(BindToSource fi, MemorySession session) {
            return RuntimeHelper.upcallStub(BindToSource.class, fi, IOleLinkVtbl.BindToSource$FUNC, session);
        }
        static BindToSource ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IOleLinkVtbl.BindToSource$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle BindToSource$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BindToSource"));
    public static VarHandle BindToSource$VH() {
        return IOleLinkVtbl.BindToSource$VH;
    }
    public static MemoryAddress BindToSource$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IOleLinkVtbl.BindToSource$VH.get(seg);
    }
    public static void BindToSource$set( MemorySegment seg, MemoryAddress x) {
        IOleLinkVtbl.BindToSource$VH.set(seg, x);
    }
    public static MemoryAddress BindToSource$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IOleLinkVtbl.BindToSource$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BindToSource$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleLinkVtbl.BindToSource$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static BindToSource BindToSource (MemorySegment segment, MemorySession session) {
        return BindToSource.ofAddress(BindToSource$get(segment), session);
    }
    static final FunctionDescriptor BindIfRunning$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle BindIfRunning$MH = RuntimeHelper.downcallHandle(
        IOleLinkVtbl.BindIfRunning$FUNC
    );
    public interface BindIfRunning {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(BindIfRunning fi, MemorySession session) {
            return RuntimeHelper.upcallStub(BindIfRunning.class, fi, IOleLinkVtbl.BindIfRunning$FUNC, session);
        }
        static BindIfRunning ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IOleLinkVtbl.BindIfRunning$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle BindIfRunning$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("BindIfRunning"));
    public static VarHandle BindIfRunning$VH() {
        return IOleLinkVtbl.BindIfRunning$VH;
    }
    public static MemoryAddress BindIfRunning$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IOleLinkVtbl.BindIfRunning$VH.get(seg);
    }
    public static void BindIfRunning$set( MemorySegment seg, MemoryAddress x) {
        IOleLinkVtbl.BindIfRunning$VH.set(seg, x);
    }
    public static MemoryAddress BindIfRunning$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IOleLinkVtbl.BindIfRunning$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BindIfRunning$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleLinkVtbl.BindIfRunning$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static BindIfRunning BindIfRunning (MemorySegment segment, MemorySession session) {
        return BindIfRunning.ofAddress(BindIfRunning$get(segment), session);
    }
    static final FunctionDescriptor GetBoundSource$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetBoundSource$MH = RuntimeHelper.downcallHandle(
        IOleLinkVtbl.GetBoundSource$FUNC
    );
    public interface GetBoundSource {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(GetBoundSource fi, MemorySession session) {
            return RuntimeHelper.upcallStub(GetBoundSource.class, fi, IOleLinkVtbl.GetBoundSource$FUNC, session);
        }
        static GetBoundSource ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)IOleLinkVtbl.GetBoundSource$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetBoundSource$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetBoundSource"));
    public static VarHandle GetBoundSource$VH() {
        return IOleLinkVtbl.GetBoundSource$VH;
    }
    public static MemoryAddress GetBoundSource$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IOleLinkVtbl.GetBoundSource$VH.get(seg);
    }
    public static void GetBoundSource$set( MemorySegment seg, MemoryAddress x) {
        IOleLinkVtbl.GetBoundSource$VH.set(seg, x);
    }
    public static MemoryAddress GetBoundSource$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IOleLinkVtbl.GetBoundSource$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetBoundSource$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleLinkVtbl.GetBoundSource$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetBoundSource GetBoundSource (MemorySegment segment, MemorySession session) {
        return GetBoundSource.ofAddress(GetBoundSource$get(segment), session);
    }
    static final FunctionDescriptor UnbindSource$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle UnbindSource$MH = RuntimeHelper.downcallHandle(
        IOleLinkVtbl.UnbindSource$FUNC
    );
    public interface UnbindSource {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(UnbindSource fi, MemorySession session) {
            return RuntimeHelper.upcallStub(UnbindSource.class, fi, IOleLinkVtbl.UnbindSource$FUNC, session);
        }
        static UnbindSource ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IOleLinkVtbl.UnbindSource$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle UnbindSource$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("UnbindSource"));
    public static VarHandle UnbindSource$VH() {
        return IOleLinkVtbl.UnbindSource$VH;
    }
    public static MemoryAddress UnbindSource$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IOleLinkVtbl.UnbindSource$VH.get(seg);
    }
    public static void UnbindSource$set( MemorySegment seg, MemoryAddress x) {
        IOleLinkVtbl.UnbindSource$VH.set(seg, x);
    }
    public static MemoryAddress UnbindSource$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IOleLinkVtbl.UnbindSource$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void UnbindSource$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleLinkVtbl.UnbindSource$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static UnbindSource UnbindSource (MemorySegment segment, MemorySession session) {
        return UnbindSource.ofAddress(UnbindSource$get(segment), session);
    }
    static final FunctionDescriptor Update$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Update$MH = RuntimeHelper.downcallHandle(
        IOleLinkVtbl.Update$FUNC
    );
    public interface Update {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(Update fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Update.class, fi, IOleLinkVtbl.Update$FUNC, session);
        }
        static Update ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)IOleLinkVtbl.Update$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Update$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Update"));
    public static VarHandle Update$VH() {
        return IOleLinkVtbl.Update$VH;
    }
    public static MemoryAddress Update$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IOleLinkVtbl.Update$VH.get(seg);
    }
    public static void Update$set( MemorySegment seg, MemoryAddress x) {
        IOleLinkVtbl.Update$VH.set(seg, x);
    }
    public static MemoryAddress Update$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IOleLinkVtbl.Update$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Update$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleLinkVtbl.Update$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Update Update (MemorySegment segment, MemorySession session) {
        return Update.ofAddress(Update$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


