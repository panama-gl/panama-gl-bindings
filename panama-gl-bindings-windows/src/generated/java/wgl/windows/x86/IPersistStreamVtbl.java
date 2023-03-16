// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class IPersistStreamVtbl {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("GetClassID"),
        Constants$root.C_POINTER$LAYOUT.withName("IsDirty"),
        Constants$root.C_POINTER$LAYOUT.withName("Load"),
        Constants$root.C_POINTER$LAYOUT.withName("Save"),
        Constants$root.C_POINTER$LAYOUT.withName("GetSizeMax")
    ).withName("IPersistStreamVtbl");
    public static MemoryLayout $LAYOUT() {
        return IPersistStreamVtbl.$struct$LAYOUT;
    }
    static final FunctionDescriptor QueryInterface$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface$MH = RuntimeHelper.downcallHandle(
        IPersistStreamVtbl.QueryInterface$FUNC
    );
    public interface QueryInterface {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(QueryInterface fi, MemorySession session) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IPersistStreamVtbl.QueryInterface$FUNC, session);
        }
        static QueryInterface ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IPersistStreamVtbl.QueryInterface$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IPersistStreamVtbl.QueryInterface$VH;
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IPersistStreamVtbl.QueryInterface$VH.get(seg);
    }
    public static void QueryInterface$set( MemorySegment seg, MemoryAddress x) {
        IPersistStreamVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IPersistStreamVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        IPersistStreamVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface (MemorySegment segment, MemorySession session) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), session);
    }
    static final FunctionDescriptor AddRef$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef$MH = RuntimeHelper.downcallHandle(
        IPersistStreamVtbl.AddRef$FUNC
    );
    public interface AddRef {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(AddRef fi, MemorySession session) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IPersistStreamVtbl.AddRef$FUNC, session);
        }
        static AddRef ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IPersistStreamVtbl.AddRef$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IPersistStreamVtbl.AddRef$VH;
    }
    public static MemoryAddress AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IPersistStreamVtbl.AddRef$VH.get(seg);
    }
    public static void AddRef$set( MemorySegment seg, MemoryAddress x) {
        IPersistStreamVtbl.AddRef$VH.set(seg, x);
    }
    public static MemoryAddress AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IPersistStreamVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemoryAddress x) {
        IPersistStreamVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef (MemorySegment segment, MemorySession session) {
        return AddRef.ofAddress(AddRef$get(segment), session);
    }
    static final FunctionDescriptor Release$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release$MH = RuntimeHelper.downcallHandle(
        IPersistStreamVtbl.Release$FUNC
    );
    public interface Release {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(Release fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Release.class, fi, IPersistStreamVtbl.Release$FUNC, session);
        }
        static Release ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IPersistStreamVtbl.Release$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IPersistStreamVtbl.Release$VH;
    }
    public static MemoryAddress Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IPersistStreamVtbl.Release$VH.get(seg);
    }
    public static void Release$set( MemorySegment seg, MemoryAddress x) {
        IPersistStreamVtbl.Release$VH.set(seg, x);
    }
    public static MemoryAddress Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IPersistStreamVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemoryAddress x) {
        IPersistStreamVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release (MemorySegment segment, MemorySession session) {
        return Release.ofAddress(Release$get(segment), session);
    }
    static final FunctionDescriptor GetClassID$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetClassID$MH = RuntimeHelper.downcallHandle(
        IPersistStreamVtbl.GetClassID$FUNC
    );
    public interface GetClassID {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(GetClassID fi, MemorySession session) {
            return RuntimeHelper.upcallStub(GetClassID.class, fi, IPersistStreamVtbl.GetClassID$FUNC, session);
        }
        static GetClassID ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)IPersistStreamVtbl.GetClassID$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetClassID$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetClassID"));
    public static VarHandle GetClassID$VH() {
        return IPersistStreamVtbl.GetClassID$VH;
    }
    public static MemoryAddress GetClassID$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IPersistStreamVtbl.GetClassID$VH.get(seg);
    }
    public static void GetClassID$set( MemorySegment seg, MemoryAddress x) {
        IPersistStreamVtbl.GetClassID$VH.set(seg, x);
    }
    public static MemoryAddress GetClassID$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IPersistStreamVtbl.GetClassID$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetClassID$set(MemorySegment seg, long index, MemoryAddress x) {
        IPersistStreamVtbl.GetClassID$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetClassID GetClassID (MemorySegment segment, MemorySession session) {
        return GetClassID.ofAddress(GetClassID$get(segment), session);
    }
    static final FunctionDescriptor IsDirty$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle IsDirty$MH = RuntimeHelper.downcallHandle(
        IPersistStreamVtbl.IsDirty$FUNC
    );
    public interface IsDirty {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(IsDirty fi, MemorySession session) {
            return RuntimeHelper.upcallStub(IsDirty.class, fi, IPersistStreamVtbl.IsDirty$FUNC, session);
        }
        static IsDirty ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IPersistStreamVtbl.IsDirty$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle IsDirty$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("IsDirty"));
    public static VarHandle IsDirty$VH() {
        return IPersistStreamVtbl.IsDirty$VH;
    }
    public static MemoryAddress IsDirty$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IPersistStreamVtbl.IsDirty$VH.get(seg);
    }
    public static void IsDirty$set( MemorySegment seg, MemoryAddress x) {
        IPersistStreamVtbl.IsDirty$VH.set(seg, x);
    }
    public static MemoryAddress IsDirty$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IPersistStreamVtbl.IsDirty$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void IsDirty$set(MemorySegment seg, long index, MemoryAddress x) {
        IPersistStreamVtbl.IsDirty$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static IsDirty IsDirty (MemorySegment segment, MemorySession session) {
        return IsDirty.ofAddress(IsDirty$get(segment), session);
    }
    static final FunctionDescriptor Load$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Load$MH = RuntimeHelper.downcallHandle(
        IPersistStreamVtbl.Load$FUNC
    );
    public interface Load {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(Load fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Load.class, fi, IPersistStreamVtbl.Load$FUNC, session);
        }
        static Load ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)IPersistStreamVtbl.Load$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Load$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Load"));
    public static VarHandle Load$VH() {
        return IPersistStreamVtbl.Load$VH;
    }
    public static MemoryAddress Load$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IPersistStreamVtbl.Load$VH.get(seg);
    }
    public static void Load$set( MemorySegment seg, MemoryAddress x) {
        IPersistStreamVtbl.Load$VH.set(seg, x);
    }
    public static MemoryAddress Load$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IPersistStreamVtbl.Load$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Load$set(MemorySegment seg, long index, MemoryAddress x) {
        IPersistStreamVtbl.Load$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Load Load (MemorySegment segment, MemorySession session) {
        return Load.ofAddress(Load$get(segment), session);
    }
    static final FunctionDescriptor Save$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle Save$MH = RuntimeHelper.downcallHandle(
        IPersistStreamVtbl.Save$FUNC
    );
    public interface Save {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, int _x2);
        static MemorySegment allocate(Save fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Save.class, fi, IPersistStreamVtbl.Save$FUNC, session);
        }
        static Save ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, int __x2) -> {
                try {
                    return (int)IPersistStreamVtbl.Save$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Save$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Save"));
    public static VarHandle Save$VH() {
        return IPersistStreamVtbl.Save$VH;
    }
    public static MemoryAddress Save$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IPersistStreamVtbl.Save$VH.get(seg);
    }
    public static void Save$set( MemorySegment seg, MemoryAddress x) {
        IPersistStreamVtbl.Save$VH.set(seg, x);
    }
    public static MemoryAddress Save$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IPersistStreamVtbl.Save$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Save$set(MemorySegment seg, long index, MemoryAddress x) {
        IPersistStreamVtbl.Save$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Save Save (MemorySegment segment, MemorySession session) {
        return Save.ofAddress(Save$get(segment), session);
    }
    static final FunctionDescriptor GetSizeMax$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetSizeMax$MH = RuntimeHelper.downcallHandle(
        IPersistStreamVtbl.GetSizeMax$FUNC
    );
    public interface GetSizeMax {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(GetSizeMax fi, MemorySession session) {
            return RuntimeHelper.upcallStub(GetSizeMax.class, fi, IPersistStreamVtbl.GetSizeMax$FUNC, session);
        }
        static GetSizeMax ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)IPersistStreamVtbl.GetSizeMax$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetSizeMax$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("GetSizeMax"));
    public static VarHandle GetSizeMax$VH() {
        return IPersistStreamVtbl.GetSizeMax$VH;
    }
    public static MemoryAddress GetSizeMax$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IPersistStreamVtbl.GetSizeMax$VH.get(seg);
    }
    public static void GetSizeMax$set( MemorySegment seg, MemoryAddress x) {
        IPersistStreamVtbl.GetSizeMax$VH.set(seg, x);
    }
    public static MemoryAddress GetSizeMax$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IPersistStreamVtbl.GetSizeMax$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetSizeMax$set(MemorySegment seg, long index, MemoryAddress x) {
        IPersistStreamVtbl.GetSizeMax$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetSizeMax GetSizeMax (MemorySegment segment, MemorySession session) {
        return GetSizeMax.ofAddress(GetSizeMax$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

