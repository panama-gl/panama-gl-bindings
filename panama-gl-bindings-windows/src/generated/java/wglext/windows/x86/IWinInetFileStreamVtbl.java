// Generated by jextract

package wglext.windows.x86;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class IWinInetFileStreamVtbl {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("QueryInterface"),
        Constants$root.C_POINTER$LAYOUT.withName("AddRef"),
        Constants$root.C_POINTER$LAYOUT.withName("Release"),
        Constants$root.C_POINTER$LAYOUT.withName("SetHandleForUnlock"),
        Constants$root.C_POINTER$LAYOUT.withName("SetDeleteFile")
    ).withName("IWinInetFileStreamVtbl");
    public static MemoryLayout $LAYOUT() {
        return IWinInetFileStreamVtbl.$struct$LAYOUT;
    }
    static final FunctionDescriptor QueryInterface$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryInterface$MH = RuntimeHelper.downcallHandle(
        IWinInetFileStreamVtbl.QueryInterface$FUNC
    );
    public interface QueryInterface {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(QueryInterface fi, MemorySession session) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IWinInetFileStreamVtbl.QueryInterface$FUNC, session);
        }
        static QueryInterface ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)IWinInetFileStreamVtbl.QueryInterface$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("QueryInterface"));
    public static VarHandle QueryInterface$VH() {
        return IWinInetFileStreamVtbl.QueryInterface$VH;
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IWinInetFileStreamVtbl.QueryInterface$VH.get(seg);
    }
    public static void QueryInterface$set( MemorySegment seg, MemoryAddress x) {
        IWinInetFileStreamVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IWinInetFileStreamVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        IWinInetFileStreamVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface (MemorySegment segment, MemorySession session) {
        return QueryInterface.ofAddress(QueryInterface$get(segment), session);
    }
    static final FunctionDescriptor AddRef$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddRef$MH = RuntimeHelper.downcallHandle(
        IWinInetFileStreamVtbl.AddRef$FUNC
    );
    public interface AddRef {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(AddRef fi, MemorySession session) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IWinInetFileStreamVtbl.AddRef$FUNC, session);
        }
        static AddRef ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IWinInetFileStreamVtbl.AddRef$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("AddRef"));
    public static VarHandle AddRef$VH() {
        return IWinInetFileStreamVtbl.AddRef$VH;
    }
    public static MemoryAddress AddRef$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IWinInetFileStreamVtbl.AddRef$VH.get(seg);
    }
    public static void AddRef$set( MemorySegment seg, MemoryAddress x) {
        IWinInetFileStreamVtbl.AddRef$VH.set(seg, x);
    }
    public static MemoryAddress AddRef$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IWinInetFileStreamVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemoryAddress x) {
        IWinInetFileStreamVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef (MemorySegment segment, MemorySession session) {
        return AddRef.ofAddress(AddRef$get(segment), session);
    }
    static final FunctionDescriptor Release$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle Release$MH = RuntimeHelper.downcallHandle(
        IWinInetFileStreamVtbl.Release$FUNC
    );
    public interface Release {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(Release fi, MemorySession session) {
            return RuntimeHelper.upcallStub(Release.class, fi, IWinInetFileStreamVtbl.Release$FUNC, session);
        }
        static Release ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)IWinInetFileStreamVtbl.Release$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("Release"));
    public static VarHandle Release$VH() {
        return IWinInetFileStreamVtbl.Release$VH;
    }
    public static MemoryAddress Release$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IWinInetFileStreamVtbl.Release$VH.get(seg);
    }
    public static void Release$set( MemorySegment seg, MemoryAddress x) {
        IWinInetFileStreamVtbl.Release$VH.set(seg, x);
    }
    public static MemoryAddress Release$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IWinInetFileStreamVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemoryAddress x) {
        IWinInetFileStreamVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release (MemorySegment segment, MemorySession session) {
        return Release.ofAddress(Release$get(segment), session);
    }
    static final FunctionDescriptor SetHandleForUnlock$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle SetHandleForUnlock$MH = RuntimeHelper.downcallHandle(
        IWinInetFileStreamVtbl.SetHandleForUnlock$FUNC
    );
    public interface SetHandleForUnlock {

        int apply(java.lang.foreign.MemoryAddress _x0, long _x1, long _x2);
        static MemorySegment allocate(SetHandleForUnlock fi, MemorySession session) {
            return RuntimeHelper.upcallStub(SetHandleForUnlock.class, fi, IWinInetFileStreamVtbl.SetHandleForUnlock$FUNC, session);
        }
        static SetHandleForUnlock ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, long __x1, long __x2) -> {
                try {
                    return (int)IWinInetFileStreamVtbl.SetHandleForUnlock$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle SetHandleForUnlock$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SetHandleForUnlock"));
    public static VarHandle SetHandleForUnlock$VH() {
        return IWinInetFileStreamVtbl.SetHandleForUnlock$VH;
    }
    public static MemoryAddress SetHandleForUnlock$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IWinInetFileStreamVtbl.SetHandleForUnlock$VH.get(seg);
    }
    public static void SetHandleForUnlock$set( MemorySegment seg, MemoryAddress x) {
        IWinInetFileStreamVtbl.SetHandleForUnlock$VH.set(seg, x);
    }
    public static MemoryAddress SetHandleForUnlock$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IWinInetFileStreamVtbl.SetHandleForUnlock$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SetHandleForUnlock$set(MemorySegment seg, long index, MemoryAddress x) {
        IWinInetFileStreamVtbl.SetHandleForUnlock$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetHandleForUnlock SetHandleForUnlock (MemorySegment segment, MemorySession session) {
        return SetHandleForUnlock.ofAddress(SetHandleForUnlock$get(segment), session);
    }
    static final FunctionDescriptor SetDeleteFile$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle SetDeleteFile$MH = RuntimeHelper.downcallHandle(
        IWinInetFileStreamVtbl.SetDeleteFile$FUNC
    );
    public interface SetDeleteFile {

        int apply(java.lang.foreign.MemoryAddress _x0, long _x1);
        static MemorySegment allocate(SetDeleteFile fi, MemorySession session) {
            return RuntimeHelper.upcallStub(SetDeleteFile.class, fi, IWinInetFileStreamVtbl.SetDeleteFile$FUNC, session);
        }
        static SetDeleteFile ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, long __x1) -> {
                try {
                    return (int)IWinInetFileStreamVtbl.SetDeleteFile$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle SetDeleteFile$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("SetDeleteFile"));
    public static VarHandle SetDeleteFile$VH() {
        return IWinInetFileStreamVtbl.SetDeleteFile$VH;
    }
    public static MemoryAddress SetDeleteFile$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)IWinInetFileStreamVtbl.SetDeleteFile$VH.get(seg);
    }
    public static void SetDeleteFile$set( MemorySegment seg, MemoryAddress x) {
        IWinInetFileStreamVtbl.SetDeleteFile$VH.set(seg, x);
    }
    public static MemoryAddress SetDeleteFile$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)IWinInetFileStreamVtbl.SetDeleteFile$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SetDeleteFile$set(MemorySegment seg, long index, MemoryAddress x) {
        IWinInetFileStreamVtbl.SetDeleteFile$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetDeleteFile SetDeleteFile (MemorySegment segment, MemorySession session) {
        return SetDeleteFile.ofAddress(SetDeleteFile$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


