// Generated by jextract

package wgl.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class IBindHostVtbl {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("CreateMoniker"),
        Constants$root.C_POINTER$LAYOUT.withName("MonikerBindToStorage"),
        Constants$root.C_POINTER$LAYOUT.withName("MonikerBindToObject")
    ).withName("IBindHostVtbl");
    public static MemoryLayout $LAYOUT() {
        return IBindHostVtbl.$struct$LAYOUT;
    }
    static final FunctionDescriptor QueryInterface$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface$MH = RuntimeHelper.downcallHandle(
        IBindHostVtbl.QueryInterface$FUNC
    );
    public interface QueryInterface {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(QueryInterface fi, MemorySession session) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IBindHostVtbl.QueryInterface$FUNC, session);
        }
        static QueryInterface ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IBindHostVtbl.QueryInterface$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IBindHostVtbl.QueryInterface$VH;
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IBindHostVtbl.QueryInterface$VH.get(seg);
    }
    public static void QueryInterface$set( MemorySegment seg, MemoryAddress x) {
        IBindHostVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IBindHostVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        IBindHostVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface (MemorySegment segment, MemorySession session) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), session);
    }
    static final FunctionDescriptor AddRef$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef$MH = RuntimeHelper.downcallHandle(
        IBindHostVtbl.AddRef$FUNC
    );
    public interface AddRef {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(AddRef fi, MemorySession session) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IBindHostVtbl.AddRef$FUNC, session);
        }
        static AddRef ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IBindHostVtbl.AddRef$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IBindHostVtbl.AddRef$VH;
    }
    public static MemoryAddress AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IBindHostVtbl.AddRef$VH.get(seg);
    }
    public static void AddRef$set( MemorySegment seg, MemoryAddress x) {
        IBindHostVtbl.AddRef$VH.set(seg, x);
    }
    public static MemoryAddress AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IBindHostVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemoryAddress x) {
        IBindHostVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef (MemorySegment segment, MemorySession session) {
        return AddRef.ofAddress(AddRef$get(segment), session);
    }
    static final FunctionDescriptor Release$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release$MH = RuntimeHelper.downcallHandle(
        IBindHostVtbl.Release$FUNC
    );
    public interface Release {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(Release fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Release.class, fi, IBindHostVtbl.Release$FUNC, session);
        }
        static Release ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IBindHostVtbl.Release$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IBindHostVtbl.Release$VH;
    }
    public static MemoryAddress Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IBindHostVtbl.Release$VH.get(seg);
    }
    public static void Release$set( MemorySegment seg, MemoryAddress x) {
        IBindHostVtbl.Release$VH.set(seg, x);
    }
    public static MemoryAddress Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IBindHostVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemoryAddress x) {
        IBindHostVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release (MemorySegment segment, MemorySession session) {
        return Release.ofAddress(Release$get(segment), session);
    }
    static final FunctionDescriptor CreateMoniker$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateMoniker$MH = RuntimeHelper.downcallHandle(
        IBindHostVtbl.CreateMoniker$FUNC
    );
    public interface CreateMoniker {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2, java.lang.foreign.MemoryAddress _x3, int _x4);
        static MemorySegment allocate(CreateMoniker fi, MemorySession session) {
            return RuntimeHelper.upcallStub(CreateMoniker.class, fi, IBindHostVtbl.CreateMoniker$FUNC, session);
        }
        static CreateMoniker ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2, java.lang.foreign.MemoryAddress __x3, int __x4) -> {
                try {
                    return (int)IBindHostVtbl.CreateMoniker$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2, (java.lang.foreign.Addressable)__x3, __x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle CreateMoniker$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CreateMoniker"));
    public static VarHandle CreateMoniker$VH() {
        return IBindHostVtbl.CreateMoniker$VH;
    }
    public static MemoryAddress CreateMoniker$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IBindHostVtbl.CreateMoniker$VH.get(seg);
    }
    public static void CreateMoniker$set( MemorySegment seg, MemoryAddress x) {
        IBindHostVtbl.CreateMoniker$VH.set(seg, x);
    }
    public static MemoryAddress CreateMoniker$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IBindHostVtbl.CreateMoniker$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CreateMoniker$set(MemorySegment seg, long index, MemoryAddress x) {
        IBindHostVtbl.CreateMoniker$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static CreateMoniker CreateMoniker (MemorySegment segment, MemorySession session) {
        return CreateMoniker.ofAddress(CreateMoniker$get(segment), session);
    }
    static final FunctionDescriptor MonikerBindToStorage$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle MonikerBindToStorage$MH = RuntimeHelper.downcallHandle(
        IBindHostVtbl.MonikerBindToStorage$FUNC
    );
    public interface MonikerBindToStorage {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2, java.lang.foreign.MemoryAddress _x3, java.lang.foreign.MemoryAddress _x4, java.lang.foreign.MemoryAddress _x5);
        static MemorySegment allocate(MonikerBindToStorage fi, MemorySession session) {
            return RuntimeHelper.upcallStub(MonikerBindToStorage.class, fi, IBindHostVtbl.MonikerBindToStorage$FUNC, session);
        }
        static MonikerBindToStorage ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2, java.lang.foreign.MemoryAddress __x3, java.lang.foreign.MemoryAddress __x4, java.lang.foreign.MemoryAddress __x5) -> {
                try {
                    return (int)IBindHostVtbl.MonikerBindToStorage$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2, (java.lang.foreign.Addressable)__x3, (java.lang.foreign.Addressable)__x4, (java.lang.foreign.Addressable)__x5);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle MonikerBindToStorage$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MonikerBindToStorage"));
    public static VarHandle MonikerBindToStorage$VH() {
        return IBindHostVtbl.MonikerBindToStorage$VH;
    }
    public static MemoryAddress MonikerBindToStorage$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IBindHostVtbl.MonikerBindToStorage$VH.get(seg);
    }
    public static void MonikerBindToStorage$set( MemorySegment seg, MemoryAddress x) {
        IBindHostVtbl.MonikerBindToStorage$VH.set(seg, x);
    }
    public static MemoryAddress MonikerBindToStorage$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IBindHostVtbl.MonikerBindToStorage$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MonikerBindToStorage$set(MemorySegment seg, long index, MemoryAddress x) {
        IBindHostVtbl.MonikerBindToStorage$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MonikerBindToStorage MonikerBindToStorage (MemorySegment segment, MemorySession session) {
        return MonikerBindToStorage.ofAddress(MonikerBindToStorage$get(segment), session);
    }
    static final FunctionDescriptor MonikerBindToObject$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle MonikerBindToObject$MH = RuntimeHelper.downcallHandle(
        IBindHostVtbl.MonikerBindToObject$FUNC
    );
    public interface MonikerBindToObject {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2, java.lang.foreign.MemoryAddress _x3, java.lang.foreign.MemoryAddress _x4, java.lang.foreign.MemoryAddress _x5);
        static MemorySegment allocate(MonikerBindToObject fi, MemorySession session) {
            return RuntimeHelper.upcallStub(MonikerBindToObject.class, fi, IBindHostVtbl.MonikerBindToObject$FUNC, session);
        }
        static MonikerBindToObject ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2, java.lang.foreign.MemoryAddress __x3, java.lang.foreign.MemoryAddress __x4, java.lang.foreign.MemoryAddress __x5) -> {
                try {
                    return (int)IBindHostVtbl.MonikerBindToObject$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2, (java.lang.foreign.Addressable)__x3, (java.lang.foreign.Addressable)__x4, (java.lang.foreign.Addressable)__x5);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle MonikerBindToObject$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("MonikerBindToObject"));
    public static VarHandle MonikerBindToObject$VH() {
        return IBindHostVtbl.MonikerBindToObject$VH;
    }
    public static MemoryAddress MonikerBindToObject$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IBindHostVtbl.MonikerBindToObject$VH.get(seg);
    }
    public static void MonikerBindToObject$set( MemorySegment seg, MemoryAddress x) {
        IBindHostVtbl.MonikerBindToObject$VH.set(seg, x);
    }
    public static MemoryAddress MonikerBindToObject$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IBindHostVtbl.MonikerBindToObject$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MonikerBindToObject$set(MemorySegment seg, long index, MemoryAddress x) {
        IBindHostVtbl.MonikerBindToObject$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MonikerBindToObject MonikerBindToObject (MemorySegment segment, MemorySession session) {
        return MonikerBindToObject.ofAddress(MonikerBindToObject$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


